package org.betup.services.down;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.net.UnknownHostException;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.R;
import org.betup.bus.ServerDownMessage;
import org.betup.model.remote.api.FetchStat;
import org.betup.services.analytics.AnalyticsService;
import org.betup.services.analytics.FirebaseAnalyticsHelper;
import org.betup.ui.dialogs.ServerMaintenanceDialogFragment;
import org.betup.utils.ConnectionUtil;
import org.json.JSONObject;

@Singleton
/* loaded from: classes2.dex */
public class ServerErrorsProcessor {
    private static final int INTERNAL_ERROR = 500;
    private static final int SERVICE_UNAVAILABLE = 503;
    private static volatile boolean isDialogShowing = false;
    private final AnalyticsService analyticsService;

    private void reportServerDownError(ServerDownMessage serverDownMessage) {
    }

    @Inject
    public ServerErrorsProcessor(AnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
    }

    private boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public FetchStat processMessage(Activity context, ServerDownMessage serverDownMessage) {
        String string;
        Log.d("SERVERDOWN", "GOT MESSAGE IN " + context);
        if (serverDownMessage.getT() != null) {
            Log.d("SERVERDOWN", "DOWN T = " + serverDownMessage.getT().getMessage());
        }
        if (serverDownMessage.getResponseBody() != null) {
            Log.d("SERVERDOWN", "DOWN BODY = " + serverDownMessage.getResponseBody());
        }
        if (serverDownMessage.getStat() == FetchStat.NO_CONNECTION && !isNetworkAvailable(context)) {
            return FetchStat.NO_CONNECTION;
        }
        if (serverDownMessage.getT() instanceof UnknownHostException) {
            return FetchStat.NO_CONNECTION;
        }
        if (serverDownMessage.getStat() == FetchStat.NO_AUTH) {
            return FetchStat.NO_AUTH;
        }
        int statusCode = serverDownMessage.getStatusCode();
        if (statusCode != 503) {
            Log.d("SERVERDOWN", "Skipping maintenance dialog for status code " + statusCode + " from " + serverDownMessage.getSourceInteractor());
            return FetchStat.INVALID;
        }
        if (isDialogShowing) {
            Log.d("SERVERDOWN", "Dialog already showing, skipping");
            return FetchStat.SERVER_DOWN;
        }
        Log.d("SERVERDOWN", "CONTROLLER STAT IS " + serverDownMessage.getStat());
        String string2 = context.getString(R.string.works_info);
        if (serverDownMessage.getStat() == FetchStat.INVALID) {
            try {
                JSONObject jSONObject = new JSONObject(serverDownMessage.getResponseBody());
                String language = Locale.getDefault().getLanguage();
                Log.d("SERVERDOWN", "LANG = " + language);
                if (jSONObject.has(language)) {
                    string = jSONObject.getString(language);
                } else {
                    string = jSONObject.getString("en");
                }
                string2 = string;
            } catch (Exception e) {
                FirebaseCrashlytics.getInstance().recordException(e);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("INTERACTOR", serverDownMessage.getSourceInteractor());
        bundle.putString("CODE", "HTTP " + serverDownMessage.getStatusCode());
        bundle.putString("STAT", String.valueOf(serverDownMessage.getStat()));
        bundle.putString("BODY", "Body {" + serverDownMessage.getResponseBody() + "}");
        bundle.putString("HAS_INET", "IsConnected = " + ConnectionUtil.checkConnection(context));
        bundle.putString("FROM", serverDownMessage.getFrom());
        if (serverDownMessage.getT() != null) {
            String message = serverDownMessage.getT().getMessage();
            if (message == null || message.length() == 0) {
                message = serverDownMessage.getT().toString();
            }
            bundle.putString("EXCEPTION", message);
        }
        this.analyticsService.sendServerDown(bundle);
        FirebaseAnalyticsHelper.logServerDown(context, bundle);
        reportServerDownError(serverDownMessage);
        isDialogShowing = true;
        ServerMaintenanceDialogFragment.showDialog(context, context.getString(R.string.works_in_progress), string2, new Runnable() { // from class: org.betup.services.down.ServerErrorsProcessor.1
            @Override // java.lang.Runnable
            public void run() {
                ServerErrorsProcessor.isDialogShowing = false;
                System.exit(0);
            }
        });
        return FetchStat.SERVER_DOWN;
    }
}
