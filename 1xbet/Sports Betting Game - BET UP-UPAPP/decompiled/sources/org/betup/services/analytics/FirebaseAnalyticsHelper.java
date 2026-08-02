package org.betup.services.analytics;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.sentry.protocol.Device;
import io.sentry.protocol.Response;
import org.betup.BetUpApp;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.model.remote.entity.analytics.PurchaseType;

/* loaded from: classes2.dex */
public class FirebaseAnalyticsHelper {

    public enum Event {
        TOUR_SCREEN,
        ON_BOARD,
        ONE_TIME_OFFER,
        SERVER_DOWN_4,
        PLAY_SERVICES_ERROR,
        NO_CONNECTION,
        SIGNUP,
        FIRST_BET,
        NEW_ACHIEVEMENT,
        ANONYMOUS_LOGIN,
        ACCOUNT_UPGRADE,
        FIRST_BET_PLACED,
        CUSTOM_PROMO_SHOWN,
        CUSTOM_PROMO_CLICKED,
        AUTH_FAILURE,
        AUTH_STAGE
    }

    public enum Param {
        SCREEN_NAME
    }

    public static void addEvent(Context context, Event event, String description) {
        Bundle bundle = new Bundle();
        bundle.putString(Param.SCREEN_NAME.name(), description);
        FirebaseAnalytics.getInstance(context).logEvent(event.name(), bundle);
    }

    public static void addEvent(Context context, Event event, Bundle bundle) {
        FirebaseAnalytics.getInstance(context).logEvent(event.name(), bundle);
    }

    public static void logServerDown(Context context, Bundle bundle) {
        FirebaseAnalytics.getInstance(context).logEvent(Event.SERVER_DOWN_4.toString(), bundle);
    }

    public static void logNoConnection(Context context, String reason) {
        Bundle bundle = new Bundle();
        bundle.putString("reason", reason);
        FirebaseAnalytics.getInstance(context).logEvent(Event.NO_CONNECTION.toString(), bundle);
    }

    public static void logPlayServicesError(Context context, String where) {
        Bundle bundle = new Bundle();
        bundle.putString("where", where);
        FirebaseAnalytics.getInstance(context).logEvent(Event.PLAY_SERVICES_ERROR.toString(), bundle);
    }

    public static void trackPurchase(PurchasePlacement placement, PurchaseType purchaseType) {
        Bundle bundle = new Bundle();
        bundle.putString(Param.SCREEN_NAME.name(), "purchaseType completed");
        FirebaseAnalytics.getInstance(BetUpApp.getContext()).logEvent(placement.name() + "_" + purchaseType.name(), bundle);
    }

    public static void trackSignup(Context context) {
        FirebaseAnalytics.getInstance(context).logEvent(Event.SIGNUP.toString(), new Bundle());
    }

    public static void trackFirstBet(Context context) {
        FirebaseAnalytics.getInstance(context).logEvent(Event.FIRST_BET.toString(), new Bundle());
    }

    public static void trackFirstBetPlaced(Context context) {
        FirebaseAnalytics.getInstance(context).logEvent(Event.FIRST_BET_PLACED.toString(), new Bundle());
    }

    public static void trackNewAchievement(Context context, int achievementId) {
        FirebaseAnalytics.getInstance(context).logEvent(Event.NEW_ACHIEVEMENT.toString() + "_" + achievementId, new Bundle());
    }

    public static void trackAnonymousLogin(Context context) {
        FirebaseAnalytics.getInstance(context).logEvent(Event.ANONYMOUS_LOGIN.toString(), new Bundle());
    }

    public static void trackAccountUpgrade(Context context) {
        FirebaseAnalytics.getInstance(context).logEvent(Event.ACCOUNT_UPGRADE.toString(), new Bundle());
    }

    public static void logAuthFailure(Context context, String provider, String stage, String reason, Integer statusCode) {
        logAuthFailure(context, provider, stage, reason, statusCode, true);
    }

    public static void logAuthFailure(Context context, String provider, String stage, String reason, Integer statusCode, boolean recordExceptionToCrashlytics) {
        Bundle bundle = new Bundle();
        bundle.putString(IronSourceConstants.EVENTS_PROVIDER, provider);
        bundle.putString(X3.i.q, stage);
        bundle.putString("reason", reason);
        if (statusCode != null) {
            bundle.putInt(Response.JsonKeys.STATUS_CODE, statusCode.intValue());
        }
        bundle.putString(Device.JsonKeys.MANUFACTURER, Build.MANUFACTURER);
        bundle.putString(Device.JsonKeys.BRAND, Build.BRAND);
        bundle.putString("model", Build.MODEL);
        bundle.putInt("sdk_int", Build.VERSION.SDK_INT);
        FirebaseAnalytics.getInstance(context).logEvent(Event.AUTH_FAILURE.toString(), bundle);
        AuthDiagnosticLogger.logAuthFailure(context, provider, stage, reason, statusCode);
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        String currentFirebaseUserId = AuthDiagnosticLogger.getCurrentFirebaseUserId();
        if (currentFirebaseUserId != null && !currentFirebaseUserId.isEmpty()) {
            firebaseCrashlytics.setUserId(currentFirebaseUserId);
        }
        firebaseCrashlytics.setCustomKey("auth_provider", provider);
        firebaseCrashlytics.setCustomKey("auth_stage", stage);
        firebaseCrashlytics.setCustomKey("auth_reason", reason);
        firebaseCrashlytics.setCustomKey("auth_status_code", statusCode != null ? statusCode.intValue() : -1);
        firebaseCrashlytics.setCustomKey("auth_recent_timeline", AuthDiagnosticLogger.getRecentEntries(900));
        firebaseCrashlytics.log(String.format("AUTH_FAILURE provider=%s stage=%s statusCode=%s reason=%s", provider, stage, statusCode, reason));
        if (recordExceptionToCrashlytics) {
            firebaseCrashlytics.recordException(new IllegalStateException(String.format("Auth failure [%s/%s]: %s", provider, stage, reason)));
        }
    }

    public static void logAuthStage(Context context, String provider, String stage, String outcome, String detail) {
        Bundle bundle = new Bundle();
        bundle.putString(IronSourceConstants.EVENTS_PROVIDER, provider);
        bundle.putString(X3.i.q, stage);
        bundle.putString("outcome", outcome);
        bundle.putString("detail", detail);
        bundle.putString(Device.JsonKeys.MANUFACTURER, Build.MANUFACTURER);
        bundle.putString(Device.JsonKeys.BRAND, Build.BRAND);
        bundle.putString("model", Build.MODEL);
        bundle.putInt("sdk_int", Build.VERSION.SDK_INT);
        FirebaseAnalytics.getInstance(context).logEvent(Event.AUTH_STAGE.toString(), bundle);
        AuthDiagnosticLogger.logAuthStage(context, provider, stage, outcome, detail);
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        String currentFirebaseUserId = AuthDiagnosticLogger.getCurrentFirebaseUserId();
        if (currentFirebaseUserId != null && !currentFirebaseUserId.isEmpty()) {
            firebaseCrashlytics.setUserId(currentFirebaseUserId);
        }
        firebaseCrashlytics.log(String.format("AUTH_STAGE provider=%s stage=%s outcome=%s detail=%s", provider, stage, outcome, detail));
    }
}
