package androidx.media3.session;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@UnstableApi
/* loaded from: classes3.dex */
public class MediaButtonReceiver extends BroadcastReceiver {
    private static final String[] ACTIONS = {"android.intent.action.MEDIA_BUTTON", MediaLibraryService.SERVICE_INTERFACE, MediaSessionService.SERVICE_INTERFACE};
    private static final String TAG = "MediaButtonReceiver";

    @RequiresApi(31)
    public static final class Api31 {
        private Api31() {
        }

        public static ForegroundServiceStartNotAllowedException castToForegroundServiceStartNotAllowedException(IllegalStateException illegalStateException) {
            return androidx.media.session.b.a(illegalStateException);
        }

        public static boolean instanceOfForegroundServiceStartNotAllowedException(IllegalStateException illegalStateException) {
            return androidx.media.session.c.b(illegalStateException);
        }
    }

    @Nullable
    private static ComponentName getServiceComponentByAction(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder a = androidx.appcompat.view.a.a("Expected 1 service that handles ", str, ", found ");
        a.append(queryIntentServices.size());
        throw new IllegalStateException(a.toString());
    }

    @UnstableApi
    public final void handleIntentAndMaybeStartTheService(Context context, @Nullable Intent intent) {
        if (intent == null || !Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        KeyEvent keyEvent = (KeyEvent) ((Bundle) Assertions.checkNotNull(intent.getExtras())).getParcelable("android.intent.extra.KEY_EVENT");
        if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            if (Build.VERSION.SDK_INT < 26 || keyEvent.getKeyCode() == 126 || keyEvent.getKeyCode() == 85 || keyEvent.getKeyCode() == 79) {
                for (String str : ACTIONS) {
                    ComponentName serviceComponentByAction = getServiceComponentByAction(context, str);
                    if (serviceComponentByAction != null) {
                        Intent intent2 = new Intent();
                        intent2.setComponent(serviceComponentByAction);
                        intent2.fillIn(intent, 0);
                        if (!shouldStartForegroundService(context, intent2)) {
                            Log.i(TAG, "onReceive(Intent) does not start the media button event target service into the foreground on app request: " + serviceComponentByAction.getClassName());
                            return;
                        }
                        try {
                            ContextCompat.startForegroundService(context, intent2);
                            return;
                        } catch (IllegalStateException e) {
                            if (Build.VERSION.SDK_INT < 31 || !Api31.instanceOfForegroundServiceStartNotAllowedException(e)) {
                                throw e;
                            }
                            onForegroundServiceStartNotAllowedException(intent2, Api31.castToForegroundServiceStartNotAllowedException(e));
                            return;
                        }
                    }
                }
                throw new IllegalStateException("Could not find any Service that handles any of the actions " + Arrays.toString(ACTIONS));
            }
        }
    }

    @RequiresApi(31)
    public void onForegroundServiceStartNotAllowedException(Intent intent, ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
        String message;
        StringBuilder sb = new StringBuilder("caught exception when trying to start a foreground service from the background: ");
        message = foregroundServiceStartNotAllowedException.getMessage();
        sb.append(message);
        Log.e(TAG, sb.toString());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, @Nullable Intent intent) {
        handleIntentAndMaybeStartTheService(context, intent);
    }

    public boolean shouldStartForegroundService(Context context, Intent intent) {
        return true;
    }
}
