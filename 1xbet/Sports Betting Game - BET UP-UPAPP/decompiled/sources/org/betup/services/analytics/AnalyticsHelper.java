package org.betup.services.analytics;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.D1;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.sentry.protocol.App;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.BetUpApp;
import org.betup.BuildConfig;
import org.betup.model.remote.entity.analytics.TrackEventType;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: AnalyticsHelper.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b?\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00052\u0019\b\u0002\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\u0002\b\u001cH\u0002J(\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010!H\u0002J\u0006\u0010\"\u001a\u00020\u0016J\u000e\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0010J\u001e\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020(J\u0016\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020\u0010J\u0016\u0010,\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00102\u0006\u0010'\u001a\u00020(JD\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u00102\u0014\b\u0002\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050!J\u001e\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020(2\u0006\u0010/\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u0005J\u000e\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u00020(J&\u00109\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u00052\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\u0010J\u001e\u0010>\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u00102\u0006\u0010A\u001a\u00020\u0010J\u000e\u0010B\u001a\u00020\u00162\u0006\u0010C\u001a\u00020\u0005J6\u0010D\u001a\u00020\u00162\u0006\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u00102\u0006\u0010A\u001a\u00020\u0010J\u000e\u0010K\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\u0005J\u000e\u0010M\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\u0005J\u0016\u0010N\u001a\u00020\u00162\u0006\u0010O\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u0005J\u0016\u0010Q\u001a\u00020\u00162\u0006\u0010O\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u0005J\u0016\u0010R\u001a\u00020\u00162\u0006\u0010O\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u0005J\u0016\u0010S\u001a\u00020\u00162\u0006\u0010O\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u0005J \u0010T\u001a\u00020\u00162\u0006\u0010O\u001a\u00020\u00052\u0006\u0010U\u001a\u00020\u00052\b\u0010P\u001a\u0004\u0018\u00010\u0005J \u0010V\u001a\u00020\u00162\u0006\u0010O\u001a\u00020\u00052\u0006\u0010U\u001a\u00020\u00052\b\u0010W\u001a\u0004\u0018\u00010\u0005J\u0016\u0010X\u001a\u00020\u00162\u0006\u0010O\u001a\u00020\u00052\u0006\u0010U\u001a\u00020\u0005J\u0016\u0010Y\u001a\u00020\u00162\u0006\u0010O\u001a\u00020\u00052\u0006\u0010U\u001a\u00020\u0005J\u0016\u0010Z\u001a\u00020\u00162\u0006\u0010O\u001a\u00020\u00052\u0006\u0010U\u001a\u00020\u0005J$\u0010[\u001a\u00020\u00162\u0006\u0010\\\u001a\u00020\u00052\u0006\u0010]\u001a\u00020\u00052\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u0005H\u0007J\u001e\u0010_\u001a\u00020\u00162\u0006\u0010`\u001a\u00020\u00052\u0006\u0010a\u001a\u00020\u00102\u0006\u0010b\u001a\u00020\u0005J(\u0010c\u001a\u00020\u00162\u0006\u0010d\u001a\u00020\u00052\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\u0005H\u0007J\u0016\u0010f\u001a\u00020\u00162\u0006\u0010A\u001a\u00020\u00102\u0006\u0010g\u001a\u00020\u0010J\u000e\u0010h\u001a\u00020\u00162\u0006\u0010i\u001a\u00020\u0010J\u001e\u0010j\u001a\u00020\u00162\u0006\u0010k\u001a\u00020\u00052\u0006\u0010l\u001a\u00020\u00102\u0006\u0010m\u001a\u00020\u0010J\u000e\u0010n\u001a\u00020\u00162\u0006\u0010o\u001a\u00020\u0005J\u000e\u0010p\u001a\u00020\u00162\u0006\u0010o\u001a\u00020\u0005J\u0010\u0010q\u001a\u00020\u00162\b\b\u0002\u0010r\u001a\u00020\u0005J\u001a\u0010s\u001a\u00020\u00162\b\u0010t\u001a\u0004\u0018\u00010\u00052\b\u0010u\u001a\u0004\u0018\u00010\u0005J\u000e\u0010v\u001a\u00020\u00162\u0006\u0010w\u001a\u00020(J\u000e\u0010x\u001a\u00020\u00162\u0006\u0010o\u001a\u00020\u0005J\u0016\u0010y\u001a\u00020\u00162\u0006\u0010o\u001a\u00020\u00052\u0006\u0010z\u001a\u00020;J\u000e\u0010{\u001a\u00020\u00162\u0006\u0010o\u001a\u00020\u0005J\u000e\u0010|\u001a\u00020\u00162\u0006\u0010o\u001a\u00020\u0005J\u000e\u0010}\u001a\u00020\u00162\u0006\u0010o\u001a\u00020\u0005J)\u0010~\u001a\u00020\u00162\u0006\u0010\u007f\u001a\u00020\u00052\u0007\u0010\u0080\u0001\u001a\u00020\u00052\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u0010¢\u0006\u0003\u0010\u0081\u0001J\u0010\u0010\u0082\u0001\u001a\u00020\u00162\u0007\u0010\u0083\u0001\u001a\u00020\u0005J\u0010\u0010\u0084\u0001\u001a\u00020\u00162\u0007\u0010\u0085\u0001\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0086\u0001"}, d2 = {"Lorg/betup/services/analytics/AnalyticsHelper;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "analytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getAnalytics", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "appVersion", "getAppVersion", "()Ljava/lang/String;", "buildVersion", "getBuildVersion", "buildNumber", "", "getBuildNumber", "()I", "analyticsService", "Lorg/betup/services/analytics/AnalyticsService;", "init", "", "logEventWithVersion", X3.i.j0, "block", "Lkotlin/Function1;", "Landroid/os/Bundle;", "Lkotlin/ExtensionFunctionType;", "sendToServer", "eventType", "Lorg/betup/model/remote/entity/analytics/TrackEventType;", "params", "", "logTutorialBegin", "logTutorialStepViewed", "stepNumber", "logTutorialStepComplete", "stepName", "timeSpentSeconds", "", "logTutorialComplete", "totalTimeSeconds", "stepsCompleted", "logTutorialAbandoned", "logBetPlaced", "matchId", "betAmount", "sport", "balanceBefore", "lifetimeBets", "extraParams", "logFirstBetPlaced", "secondsAfterTutorial", "matchType", "logPostTutorialInactivity", "secondsSinceTutorial", "logBetResult", "won", "", "profit", "balanceAfter", "logPurchasePromptShown", "trigger", "userBalance", "daysSinceRegistration", "logNotEnoughMoney", "source", "logPurchase", "transactionId", "value", "", "currency", "productId", "purchaseNumber", "logOfferShown", "offerId", "logOfferClosed", "logPresentationShown", "campaignId", "screenKey", "logPresentationClosed", "logPresentationSkipped", "logPresentationRemindLater", "logInterstitialShown", "eventKey", "logInterstitialClicked", "targetUrl", "logInterstitialClosed", "logInterstitialSkipped", "logInterstitialVideoCompleted", "logAdImpression", "adFormat", "adSource", "mediationAdapter", "logAdRewardEarned", "rewardType", IronSourceConstants.EVENTS_REWARD_AMOUNT, "placement", "logVideoRewardDiagnostic", "action", "detail", "logSessionStart", "userLevel", "logDailyLogin", "consecutiveDays", "logMilestoneReached", "milestoneType", "milestoneValue", "daysToReach", "logMiniGameLost", "gameName", "logMiniGameWon", "logSignIn", "signInType", "logCountryChanged", "previousIso", "newIso", "logMiniGamesCatalogLoaded", "gameCount", "logMiniGameStarted", "logMiniGameSessionCode", "success", "logMiniGameBalanceUpdated", "logMiniGameResult", "logMiniGameInsufficientFunds", "setUserProperties", "userId", "registrationDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "setUserSegment", D1.i, "setVideoEngagementLevel", "level", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnalyticsHelper {
    private static final String TAG = "AnalyticsHelper";
    private static AnalyticsService analyticsService;
    public static final AnalyticsHelper INSTANCE = new AnalyticsHelper();
    public static final int $stable = 8;

    private final int getBuildNumber() {
        return BuildConfig.VERSION_CODE;
    }

    public final void logAdImpression(String adFormat, String adSource) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adSource, "adSource");
        logAdImpression$default(this, adFormat, adSource, null, 4, null);
    }

    public final void logVideoRewardDiagnostic(String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        logVideoRewardDiagnostic$default(this, action, null, null, 6, null);
    }

    public final void logVideoRewardDiagnostic(String action, String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        logVideoRewardDiagnostic$default(this, action, str, null, 4, null);
    }

    private AnalyticsHelper() {
    }

    private final FirebaseAnalytics getAnalytics() {
        Context context = BetUpApp.getContext();
        if (context != null) {
            return FirebaseAnalytics.getInstance(context);
        }
        return null;
    }

    private final String getAppVersion() {
        return BuildConfig.VERSION_NAME;
    }

    private final String getBuildVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public final void init(AnalyticsService analyticsService2) {
        Intrinsics.checkNotNullParameter(analyticsService2, "analyticsService");
        analyticsService = analyticsService2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void logEventWithVersion$default(AnalyticsHelper analyticsHelper, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit logEventWithVersion$lambda$1;
                    logEventWithVersion$lambda$1 = AnalyticsHelper.logEventWithVersion$lambda$1((Bundle) obj2);
                    return logEventWithVersion$lambda$1;
                }
            };
        }
        analyticsHelper.logEventWithVersion(str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logEventWithVersion$lambda$1(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        return Unit.INSTANCE;
    }

    private final void logEventWithVersion(String eventName, Function1<? super Bundle, Unit> block) {
        FirebaseAnalytics analytics = getAnalytics();
        if (analytics == null) {
            return;
        }
        Bundle bundle = new Bundle();
        AnalyticsHelper analyticsHelper = INSTANCE;
        bundle.putString(App.JsonKeys.APP_VERSION, analyticsHelper.getAppVersion());
        bundle.putString("build_version", analyticsHelper.getBuildVersion());
        bundle.putLong("build_number", analyticsHelper.getBuildNumber());
        bundle.putString("os_type", "android");
        block.invoke(bundle);
        analytics.logEvent(eventName, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void sendToServer$default(AnalyticsHelper analyticsHelper, TrackEventType trackEventType, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        analyticsHelper.sendToServer(trackEventType, map);
    }

    private final void sendToServer(TrackEventType eventType, Map<String, String> params) {
        try {
            Map<String, String> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(App.JsonKeys.APP_VERSION, getAppVersion()), TuplesKt.to("build_version", getBuildVersion()), TuplesKt.to("build_number", String.valueOf(getBuildNumber())), TuplesKt.to("os_type", "android"));
            if (params != null) {
                mutableMapOf.putAll(params);
            }
            AnalyticsService analyticsService2 = analyticsService;
            if (analyticsService2 != null) {
                analyticsService2.sendTrackEventWithParams(eventType, mutableMapOf);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error sending event to server: " + eventType.name(), e);
        }
    }

    public final void logTutorialBegin() {
        logEventWithVersion$default(this, FirebaseAnalytics.Event.TUTORIAL_BEGIN, null, 2, null);
        sendToServer$default(this, TrackEventType.TUTORIAL_BEGIN, null, 2, null);
    }

    public final void logTutorialStepViewed(final int stepNumber) {
        logEventWithVersion("tutorial_step_" + stepNumber, new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logTutorialStepViewed$lambda$4;
                logTutorialStepViewed$lambda$4 = AnalyticsHelper.logTutorialStepViewed$lambda$4(stepNumber, (Bundle) obj);
                return logTutorialStepViewed$lambda$4;
            }
        });
        sendToServer(TrackEventType.TUTORIAL_STEP_VIEWED, MapsKt.mapOf(TuplesKt.to("step_number", String.valueOf(stepNumber))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logTutorialStepViewed$lambda$4(int i, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putLong("step_number", i);
        return Unit.INSTANCE;
    }

    public final void logTutorialStepComplete(final int stepNumber, final String stepName, final long timeSpentSeconds) {
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        logEventWithVersion("tutorial_step_complete", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logTutorialStepComplete$lambda$5;
                logTutorialStepComplete$lambda$5 = AnalyticsHelper.logTutorialStepComplete$lambda$5(stepNumber, stepName, timeSpentSeconds, (Bundle) obj);
                return logTutorialStepComplete$lambda$5;
            }
        });
        sendToServer(TrackEventType.TUTORIAL_STEP_COMPLETE, MapsKt.mapOf(TuplesKt.to("step_number", String.valueOf(stepNumber)), TuplesKt.to("step_name", stepName), TuplesKt.to("time_spent_seconds", String.valueOf(timeSpentSeconds))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logTutorialStepComplete$lambda$5(int i, String str, long j, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putLong("step_number", i);
        logEventWithVersion.putString("step_name", str);
        logEventWithVersion.putLong("time_spent_seconds", j);
        return Unit.INSTANCE;
    }

    public final void logTutorialComplete(final long totalTimeSeconds, final int stepsCompleted) {
        logEventWithVersion(FirebaseAnalytics.Event.TUTORIAL_COMPLETE, new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logTutorialComplete$lambda$6;
                logTutorialComplete$lambda$6 = AnalyticsHelper.logTutorialComplete$lambda$6(totalTimeSeconds, stepsCompleted, (Bundle) obj);
                return logTutorialComplete$lambda$6;
            }
        });
        sendToServer(TrackEventType.TUTORIAL_COMPLETE, MapsKt.mapOf(TuplesKt.to("total_time_seconds", String.valueOf(totalTimeSeconds)), TuplesKt.to("steps_completed", String.valueOf(stepsCompleted))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logTutorialComplete$lambda$6(long j, int i, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putLong("total_time_seconds", j);
        logEventWithVersion.putLong("steps_completed", i);
        return Unit.INSTANCE;
    }

    public final void logTutorialAbandoned(final int stepNumber, final long timeSpentSeconds) {
        logEventWithVersion("tutorial_abandoned", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logTutorialAbandoned$lambda$7;
                logTutorialAbandoned$lambda$7 = AnalyticsHelper.logTutorialAbandoned$lambda$7(stepNumber, timeSpentSeconds, (Bundle) obj);
                return logTutorialAbandoned$lambda$7;
            }
        });
        sendToServer(TrackEventType.TUTORIAL_ABANDONED, MapsKt.mapOf(TuplesKt.to("step_number", String.valueOf(stepNumber)), TuplesKt.to("time_spent_seconds", String.valueOf(timeSpentSeconds))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logTutorialAbandoned$lambda$7(int i, long j, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putLong("step_number", i);
        logEventWithVersion.putLong("time_spent_seconds", j);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void logBetPlaced$default(AnalyticsHelper analyticsHelper, String str, int i, String str2, int i2, int i3, Map map, int i4, Object obj) {
        if ((i4 & 32) != 0) {
            map = MapsKt.emptyMap();
        }
        analyticsHelper.logBetPlaced(str, i, str2, i2, i3, map);
    }

    public final void logBetPlaced(final String matchId, final int betAmount, final String sport, final int balanceBefore, final int lifetimeBets, final Map<String, String> extraParams) {
        Intrinsics.checkNotNullParameter(matchId, "matchId");
        Intrinsics.checkNotNullParameter(sport, "sport");
        Intrinsics.checkNotNullParameter(extraParams, "extraParams");
        logEventWithVersion("bet_placed", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logBetPlaced$lambda$9;
                logBetPlaced$lambda$9 = AnalyticsHelper.logBetPlaced$lambda$9(matchId, betAmount, sport, balanceBefore, lifetimeBets, extraParams, (Bundle) obj);
                return logBetPlaced$lambda$9;
            }
        });
        LinkedHashMap linkedMapOf = MapsKt.linkedMapOf(TuplesKt.to("match_id", matchId), TuplesKt.to("bet_amount", String.valueOf(betAmount)), TuplesKt.to("sport", sport), TuplesKt.to("user_balance_before", String.valueOf(balanceBefore)), TuplesKt.to("lifetime_bets", String.valueOf(lifetimeBets)));
        for (Map.Entry<String, String> entry : extraParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!StringsKt.isBlank(key) && !StringsKt.isBlank(value)) {
                linkedMapOf.put(key, value);
            }
        }
        sendToServer(TrackEventType.BET_PLACED, linkedMapOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logBetPlaced$lambda$9(String str, int i, String str2, int i2, int i3, Map map, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString("match_id", str);
        logEventWithVersion.putLong("bet_amount", i);
        logEventWithVersion.putString("sport", str2);
        logEventWithVersion.putLong("user_balance_before", i2);
        logEventWithVersion.putLong("lifetime_bets", i3);
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (!StringsKt.isBlank(str3) && !StringsKt.isBlank(str4)) {
                logEventWithVersion.putString(str3, str4);
            }
        }
        return Unit.INSTANCE;
    }

    public final void logFirstBetPlaced(final long secondsAfterTutorial, final int betAmount, final String matchType) {
        Intrinsics.checkNotNullParameter(matchType, "matchType");
        logEventWithVersion("first_bet_placed", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logFirstBetPlaced$lambda$11;
                logFirstBetPlaced$lambda$11 = AnalyticsHelper.logFirstBetPlaced$lambda$11(secondsAfterTutorial, betAmount, matchType, (Bundle) obj);
                return logFirstBetPlaced$lambda$11;
            }
        });
        sendToServer(TrackEventType.FIRST_BET_PLACED, MapsKt.mapOf(TuplesKt.to("seconds_after_tutorial", String.valueOf(secondsAfterTutorial)), TuplesKt.to("bet_amount", String.valueOf(betAmount)), TuplesKt.to("match_type", matchType)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logFirstBetPlaced$lambda$11(long j, int i, String str, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putLong("seconds_after_tutorial", j);
        logEventWithVersion.putLong("bet_amount", i);
        logEventWithVersion.putString("match_type", str);
        return Unit.INSTANCE;
    }

    public final void logPostTutorialInactivity(final long secondsSinceTutorial) {
        logEventWithVersion("post_tutorial_inactivity", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logPostTutorialInactivity$lambda$12;
                logPostTutorialInactivity$lambda$12 = AnalyticsHelper.logPostTutorialInactivity$lambda$12(secondsSinceTutorial, (Bundle) obj);
                return logPostTutorialInactivity$lambda$12;
            }
        });
        sendToServer(TrackEventType.POST_TUTORIAL_INACTIVITY, MapsKt.mapOf(TuplesKt.to("seconds_since_tutorial", String.valueOf(secondsSinceTutorial))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPostTutorialInactivity$lambda$12(long j, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putLong("seconds_since_tutorial", j);
        return Unit.INSTANCE;
    }

    public final void logBetResult(final String matchId, final boolean won, final int profit, final int balanceAfter) {
        Intrinsics.checkNotNullParameter(matchId, "matchId");
        logEventWithVersion("bet_result", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logBetResult$lambda$13;
                logBetResult$lambda$13 = AnalyticsHelper.logBetResult$lambda$13(matchId, won, profit, balanceAfter, (Bundle) obj);
                return logBetResult$lambda$13;
            }
        });
        sendToServer(won ? TrackEventType.BET_WON : TrackEventType.BET_LOST, MapsKt.mapOf(TuplesKt.to("match_id", matchId), TuplesKt.to("won", String.valueOf(won)), TuplesKt.to("profit", String.valueOf(profit)), TuplesKt.to("user_balance_after", String.valueOf(balanceAfter))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logBetResult$lambda$13(String str, boolean z, int i, int i2, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString("match_id", str);
        logEventWithVersion.putBoolean("won", z);
        logEventWithVersion.putLong("profit", i);
        logEventWithVersion.putLong("user_balance_after", i2);
        return Unit.INSTANCE;
    }

    public final void logPurchasePromptShown(final String trigger, final int userBalance, final int daysSinceRegistration) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        logEventWithVersion("purchase_prompt_shown", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logPurchasePromptShown$lambda$14;
                logPurchasePromptShown$lambda$14 = AnalyticsHelper.logPurchasePromptShown$lambda$14(trigger, userBalance, daysSinceRegistration, (Bundle) obj);
                return logPurchasePromptShown$lambda$14;
            }
        });
        sendToServer(TrackEventType.PURCHASE_PROMPT_SHOWN, MapsKt.mapOf(TuplesKt.to("trigger", trigger), TuplesKt.to("user_balance", String.valueOf(userBalance)), TuplesKt.to("days_since_registration", String.valueOf(daysSinceRegistration))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPurchasePromptShown$lambda$14(String str, int i, int i2, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString("trigger", str);
        logEventWithVersion.putLong("user_balance", i);
        logEventWithVersion.putLong("days_since_registration", i2);
        return Unit.INSTANCE;
    }

    public final void logNotEnoughMoney(final String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        logEventWithVersion("not_enough_money", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logNotEnoughMoney$lambda$15;
                logNotEnoughMoney$lambda$15 = AnalyticsHelper.logNotEnoughMoney$lambda$15(source, (Bundle) obj);
                return logNotEnoughMoney$lambda$15;
            }
        });
        sendToServer(TrackEventType.NOT_ENOUGH_MONEY, MapsKt.mapOf(TuplesKt.to("source", source)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logNotEnoughMoney$lambda$15(String str, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString("source", str);
        return Unit.INSTANCE;
    }

    public final void logPurchase(final String transactionId, final double value, final String currency, final String productId, final int purchaseNumber, final int daysSinceRegistration) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(productId, "productId");
        logEventWithVersion(FirebaseAnalytics.Event.PURCHASE, new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logPurchase$lambda$16;
                logPurchase$lambda$16 = AnalyticsHelper.logPurchase$lambda$16(transactionId, value, currency, productId, purchaseNumber, daysSinceRegistration, (Bundle) obj);
                return logPurchase$lambda$16;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPurchase$lambda$16(String str, double d, String str2, String str3, int i, int i2, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString("transaction_id", str);
        logEventWithVersion.putDouble("value", d);
        logEventWithVersion.putString("currency", str2);
        logEventWithVersion.putString(FirebaseAnalytics.Param.ITEM_ID, str3);
        logEventWithVersion.putLong("purchase_number", i);
        logEventWithVersion.putLong("days_since_registration", i2);
        return Unit.INSTANCE;
    }

    public final void logOfferShown(final String offerId) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        logEventWithVersion("offer_shown", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logOfferShown$lambda$17;
                logOfferShown$lambda$17 = AnalyticsHelper.logOfferShown$lambda$17(offerId, (Bundle) obj);
                return logOfferShown$lambda$17;
            }
        });
        sendToServer(TrackEventType.OFFER_SHOWN, MapsKt.mapOf(TuplesKt.to("offer_id", offerId)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logOfferShown$lambda$17(String str, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString("offer_id", str);
        return Unit.INSTANCE;
    }

    public final void logOfferClosed(final String offerId) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        logEventWithVersion("offer_closed", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logOfferClosed$lambda$18;
                logOfferClosed$lambda$18 = AnalyticsHelper.logOfferClosed$lambda$18(offerId, (Bundle) obj);
                return logOfferClosed$lambda$18;
            }
        });
        sendToServer(TrackEventType.OFFER_CLOSED, MapsKt.mapOf(TuplesKt.to("offer_id", offerId)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logOfferClosed$lambda$18(String str, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString("offer_id", str);
        return Unit.INSTANCE;
    }

    public final void logPresentationShown(final String campaignId, final String screenKey) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(screenKey, "screenKey");
        logEventWithVersion("presentation_shown", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logPresentationShown$lambda$19;
                logPresentationShown$lambda$19 = AnalyticsHelper.logPresentationShown$lambda$19(campaignId, screenKey, (Bundle) obj);
                return logPresentationShown$lambda$19;
            }
        });
        sendToServer(TrackEventType.PRESENTATION_SHOWN, MapsKt.mapOf(TuplesKt.to(FirebaseAnalytics.Param.CAMPAIGN_ID, campaignId), TuplesKt.to("screen_key", screenKey)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPresentationShown$lambda$19(String str, String str2, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, str);
        logEventWithVersion.putString("screen_key", str2);
        return Unit.INSTANCE;
    }

    public final void logPresentationClosed(final String campaignId, final String screenKey) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(screenKey, "screenKey");
        logEventWithVersion("presentation_closed", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logPresentationClosed$lambda$20;
                logPresentationClosed$lambda$20 = AnalyticsHelper.logPresentationClosed$lambda$20(campaignId, screenKey, (Bundle) obj);
                return logPresentationClosed$lambda$20;
            }
        });
        sendToServer(TrackEventType.PRESENTATION_CLOSED, MapsKt.mapOf(TuplesKt.to(FirebaseAnalytics.Param.CAMPAIGN_ID, campaignId), TuplesKt.to("screen_key", screenKey)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPresentationClosed$lambda$20(String str, String str2, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, str);
        logEventWithVersion.putString("screen_key", str2);
        return Unit.INSTANCE;
    }

    public final void logPresentationSkipped(final String campaignId, final String screenKey) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(screenKey, "screenKey");
        logEventWithVersion("presentation_skipped", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logPresentationSkipped$lambda$21;
                logPresentationSkipped$lambda$21 = AnalyticsHelper.logPresentationSkipped$lambda$21(campaignId, screenKey, (Bundle) obj);
                return logPresentationSkipped$lambda$21;
            }
        });
        sendToServer(TrackEventType.PRESENTATION_SKIPPED, MapsKt.mapOf(TuplesKt.to(FirebaseAnalytics.Param.CAMPAIGN_ID, campaignId), TuplesKt.to("screen_key", screenKey)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPresentationSkipped$lambda$21(String str, String str2, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, str);
        logEventWithVersion.putString("screen_key", str2);
        return Unit.INSTANCE;
    }

    public final void logPresentationRemindLater(final String campaignId, final String screenKey) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(screenKey, "screenKey");
        logEventWithVersion("presentation_remind_later", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logPresentationRemindLater$lambda$22;
                logPresentationRemindLater$lambda$22 = AnalyticsHelper.logPresentationRemindLater$lambda$22(campaignId, screenKey, (Bundle) obj);
                return logPresentationRemindLater$lambda$22;
            }
        });
        sendToServer(TrackEventType.PRESENTATION_REMIND_LATER, MapsKt.mapOf(TuplesKt.to(FirebaseAnalytics.Param.CAMPAIGN_ID, campaignId), TuplesKt.to("screen_key", screenKey)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logPresentationRemindLater$lambda$22(String str, String str2, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, str);
        logEventWithVersion.putString("screen_key", str2);
        return Unit.INSTANCE;
    }

    public final void logInterstitialShown(final String campaignId, final String eventKey, final String screenKey) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        logEventWithVersion("interstitial_shown", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logInterstitialShown$lambda$24;
                logInterstitialShown$lambda$24 = AnalyticsHelper.logInterstitialShown$lambda$24(campaignId, eventKey, screenKey, (Bundle) obj);
                return logInterstitialShown$lambda$24;
            }
        });
        TrackEventType trackEventType = TrackEventType.INTERSTITIAL_SHOWN;
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put(FirebaseAnalytics.Param.CAMPAIGN_ID, campaignId);
        createMapBuilder.put("event_key", eventKey);
        if (screenKey != null) {
            createMapBuilder.put("screen_key", screenKey);
        }
        Unit unit = Unit.INSTANCE;
        sendToServer(trackEventType, MapsKt.build(createMapBuilder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logInterstitialShown$lambda$24(String str, String str2, String str3, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, str);
        logEventWithVersion.putString("event_key", str2);
        if (str3 != null) {
            logEventWithVersion.putString("screen_key", str3);
        }
        return Unit.INSTANCE;
    }

    public final void logInterstitialClicked(final String campaignId, final String eventKey, final String targetUrl) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        logEventWithVersion("interstitial_clicked", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logInterstitialClicked$lambda$28;
                logInterstitialClicked$lambda$28 = AnalyticsHelper.logInterstitialClicked$lambda$28(campaignId, eventKey, targetUrl, (Bundle) obj);
                return logInterstitialClicked$lambda$28;
            }
        });
        TrackEventType trackEventType = TrackEventType.INTERSTITIAL_CLICKED;
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put(FirebaseAnalytics.Param.CAMPAIGN_ID, campaignId);
        createMapBuilder.put("event_key", eventKey);
        if (targetUrl != null) {
            createMapBuilder.put("target_url", targetUrl);
        }
        Unit unit = Unit.INSTANCE;
        sendToServer(trackEventType, MapsKt.build(createMapBuilder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logInterstitialClicked$lambda$28(String str, String str2, String str3, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, str);
        logEventWithVersion.putString("event_key", str2);
        if (str3 != null) {
            logEventWithVersion.putString("target_url", str3);
        }
        return Unit.INSTANCE;
    }

    public final void logInterstitialClosed(final String campaignId, final String eventKey) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        logEventWithVersion("interstitial_closed", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logInterstitialClosed$lambda$31;
                logInterstitialClosed$lambda$31 = AnalyticsHelper.logInterstitialClosed$lambda$31(campaignId, eventKey, (Bundle) obj);
                return logInterstitialClosed$lambda$31;
            }
        });
        sendToServer(TrackEventType.INTERSTITIAL_CLOSED, MapsKt.mapOf(TuplesKt.to(FirebaseAnalytics.Param.CAMPAIGN_ID, campaignId), TuplesKt.to("event_key", eventKey)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logInterstitialClosed$lambda$31(String str, String str2, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, str);
        logEventWithVersion.putString("event_key", str2);
        return Unit.INSTANCE;
    }

    public final void logInterstitialSkipped(final String campaignId, final String eventKey) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        logEventWithVersion("interstitial_skipped", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logInterstitialSkipped$lambda$32;
                logInterstitialSkipped$lambda$32 = AnalyticsHelper.logInterstitialSkipped$lambda$32(campaignId, eventKey, (Bundle) obj);
                return logInterstitialSkipped$lambda$32;
            }
        });
        sendToServer(TrackEventType.INTERSTITIAL_SKIPPED, MapsKt.mapOf(TuplesKt.to(FirebaseAnalytics.Param.CAMPAIGN_ID, campaignId), TuplesKt.to("event_key", eventKey)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logInterstitialSkipped$lambda$32(String str, String str2, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, str);
        logEventWithVersion.putString("event_key", str2);
        return Unit.INSTANCE;
    }

    public final void logInterstitialVideoCompleted(final String campaignId, final String eventKey) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(eventKey, "eventKey");
        logEventWithVersion("interstitial_video_completed", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logInterstitialVideoCompleted$lambda$33;
                logInterstitialVideoCompleted$lambda$33 = AnalyticsHelper.logInterstitialVideoCompleted$lambda$33(campaignId, eventKey, (Bundle) obj);
                return logInterstitialVideoCompleted$lambda$33;
            }
        });
        sendToServer(TrackEventType.INTERSTITIAL_VIDEO_COMPLETED, MapsKt.mapOf(TuplesKt.to(FirebaseAnalytics.Param.CAMPAIGN_ID, campaignId), TuplesKt.to("event_key", eventKey)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logInterstitialVideoCompleted$lambda$33(String str, String str2, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, str);
        logEventWithVersion.putString("event_key", str2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void logAdImpression$default(AnalyticsHelper analyticsHelper, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        analyticsHelper.logAdImpression(str, str2, str3);
    }

    public final void logAdImpression(final String adFormat, final String adSource, final String mediationAdapter) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adSource, "adSource");
        logEventWithVersion(FirebaseAnalytics.Event.AD_IMPRESSION, new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logAdImpression$lambda$36;
                logAdImpression$lambda$36 = AnalyticsHelper.logAdImpression$lambda$36(adFormat, adSource, mediationAdapter, (Bundle) obj);
                return logAdImpression$lambda$36;
            }
        });
        Map<String, String> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(FirebaseAnalytics.Param.AD_FORMAT, adFormat), TuplesKt.to(FirebaseAnalytics.Param.AD_SOURCE, adSource));
        if (mediationAdapter != null) {
            if (mediationAdapter.length() <= 0) {
                mediationAdapter = null;
            }
            if (mediationAdapter != null) {
                mutableMapOf.put("mediation_adapter", mediationAdapter);
            }
        }
        sendToServer(TrackEventType.AD_IMPRESSION, mutableMapOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logAdImpression$lambda$36(String str, String str2, String str3, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString(FirebaseAnalytics.Param.AD_FORMAT, str);
        logEventWithVersion.putString(FirebaseAnalytics.Param.AD_SOURCE, str2);
        if (str3 != null) {
            if (str3.length() <= 0) {
                str3 = null;
            }
            if (str3 != null) {
                logEventWithVersion.putString("mediation_adapter", StringsKt.take(str3, 100));
            }
        }
        return Unit.INSTANCE;
    }

    public final void logAdRewardEarned(final String rewardType, final int rewardAmount, final String placement) {
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        Intrinsics.checkNotNullParameter(placement, "placement");
        logEventWithVersion("ad_reward_earned", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logAdRewardEarned$lambda$39;
                logAdRewardEarned$lambda$39 = AnalyticsHelper.logAdRewardEarned$lambda$39(rewardType, rewardAmount, placement, (Bundle) obj);
                return logAdRewardEarned$lambda$39;
            }
        });
        sendToServer(TrackEventType.AD_REWARD_EARNED, MapsKt.mapOf(TuplesKt.to("reward_type", rewardType), TuplesKt.to("reward_amount", String.valueOf(rewardAmount)), TuplesKt.to("placement", placement)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logAdRewardEarned$lambda$39(String str, int i, String str2, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString("reward_type", str);
        logEventWithVersion.putLong("reward_amount", i);
        logEventWithVersion.putString("placement", str2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void logVideoRewardDiagnostic$default(AnalyticsHelper analyticsHelper, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        analyticsHelper.logVideoRewardDiagnostic(str, str2, str3);
    }

    public final void logVideoRewardDiagnostic(final String action, final String placement, final String detail) {
        Intrinsics.checkNotNullParameter(action, "action");
        logEventWithVersion("video_reward_diagnostic", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logVideoRewardDiagnostic$lambda$44;
                logVideoRewardDiagnostic$lambda$44 = AnalyticsHelper.logVideoRewardDiagnostic$lambda$44(action, placement, detail, (Bundle) obj);
                return logVideoRewardDiagnostic$lambda$44;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logVideoRewardDiagnostic$lambda$44(String str, String str2, String str3, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString("reward_action", StringsKt.take(str, 100));
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                logEventWithVersion.putString("reward_placement", StringsKt.take(str2, 100));
            }
        }
        if (str3 != null) {
            if (str3.length() <= 0) {
                str3 = null;
            }
            if (str3 != null) {
                logEventWithVersion.putString("reward_detail", StringsKt.take(str3, 100));
            }
        }
        return Unit.INSTANCE;
    }

    public final void logSessionStart(final int daysSinceRegistration, final int userLevel) {
        logEventWithVersion("session_start", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logSessionStart$lambda$45;
                logSessionStart$lambda$45 = AnalyticsHelper.logSessionStart$lambda$45(daysSinceRegistration, userLevel, (Bundle) obj);
                return logSessionStart$lambda$45;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logSessionStart$lambda$45(int i, int i2, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putLong("days_since_registration", i);
        logEventWithVersion.putLong("user_level", i2);
        return Unit.INSTANCE;
    }

    public final void logDailyLogin(final int consecutiveDays) {
        logEventWithVersion("daily_login", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logDailyLogin$lambda$46;
                logDailyLogin$lambda$46 = AnalyticsHelper.logDailyLogin$lambda$46(consecutiveDays, (Bundle) obj);
                return logDailyLogin$lambda$46;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logDailyLogin$lambda$46(int i, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putLong("consecutive_days", i);
        return Unit.INSTANCE;
    }

    public final void logMilestoneReached(final String milestoneType, final int milestoneValue, final int daysToReach) {
        Intrinsics.checkNotNullParameter(milestoneType, "milestoneType");
        logEventWithVersion("milestone_reached", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logMilestoneReached$lambda$47;
                logMilestoneReached$lambda$47 = AnalyticsHelper.logMilestoneReached$lambda$47(milestoneType, milestoneValue, daysToReach, (Bundle) obj);
                return logMilestoneReached$lambda$47;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logMilestoneReached$lambda$47(String str, int i, int i2, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString("milestone_type", str);
        logEventWithVersion.putLong("milestone_value", i);
        logEventWithVersion.putLong("days_to_reach", i2);
        return Unit.INSTANCE;
    }

    public final void logMiniGameLost(final String gameName) {
        Intrinsics.checkNotNullParameter(gameName, "gameName");
        logEventWithVersion("mini_game_lost", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logMiniGameLost$lambda$48;
                logMiniGameLost$lambda$48 = AnalyticsHelper.logMiniGameLost$lambda$48(gameName, (Bundle) obj);
                return logMiniGameLost$lambda$48;
            }
        });
        sendToServer(TrackEventType.MINI_GAME_LOST, MapsKt.mapOf(TuplesKt.to("game_name", gameName)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logMiniGameLost$lambda$48(String str, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString("game_name", str);
        return Unit.INSTANCE;
    }

    public final void logMiniGameWon(final String gameName) {
        Intrinsics.checkNotNullParameter(gameName, "gameName");
        logEventWithVersion("mini_game_won", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logMiniGameWon$lambda$49;
                logMiniGameWon$lambda$49 = AnalyticsHelper.logMiniGameWon$lambda$49(gameName, (Bundle) obj);
                return logMiniGameWon$lambda$49;
            }
        });
        sendToServer(TrackEventType.MINI_GAME_WON, MapsKt.mapOf(TuplesKt.to("game_name", gameName)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logMiniGameWon$lambda$49(String str, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString("game_name", str);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void logSignIn$default(AnalyticsHelper analyticsHelper, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "user_sign_in";
        }
        analyticsHelper.logSignIn(str);
    }

    public final void logSignIn(final String signInType) {
        Intrinsics.checkNotNullParameter(signInType, "signInType");
        logEventWithVersion("sign_in", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logSignIn$lambda$50;
                logSignIn$lambda$50 = AnalyticsHelper.logSignIn$lambda$50(signInType, (Bundle) obj);
                return logSignIn$lambda$50;
            }
        });
        sendToServer(TrackEventType.SIGN_IN, MapsKt.mapOf(TuplesKt.to("sign_in_type", signInType)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logSignIn$lambda$50(String str, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString("sign_in_type", str);
        return Unit.INSTANCE;
    }

    public final void logCountryChanged(String previousIso, String newIso) {
        TrackEventType trackEventType = TrackEventType.COUNTRY_CHANGED;
        Pair[] pairArr = new Pair[2];
        if (previousIso == null) {
            previousIso = "";
        }
        pairArr[0] = TuplesKt.to("previousValue", previousIso);
        if (newIso == null) {
            newIso = "";
        }
        pairArr[1] = TuplesKt.to("newValue", newIso);
        sendToServer(trackEventType, MapsKt.mapOf(pairArr));
    }

    public final void logMiniGamesCatalogLoaded(final long gameCount) {
        logEventWithVersion("mini_games_catalog_loaded", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logMiniGamesCatalogLoaded$lambda$51;
                logMiniGamesCatalogLoaded$lambda$51 = AnalyticsHelper.logMiniGamesCatalogLoaded$lambda$51(gameCount, (Bundle) obj);
                return logMiniGamesCatalogLoaded$lambda$51;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logMiniGamesCatalogLoaded$lambda$51(long j, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putLong("game_count", j);
        return Unit.INSTANCE;
    }

    public final void logMiniGameStarted(final String gameName) {
        Intrinsics.checkNotNullParameter(gameName, "gameName");
        logEventWithVersion("mini_game_started", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logMiniGameStarted$lambda$52;
                logMiniGameStarted$lambda$52 = AnalyticsHelper.logMiniGameStarted$lambda$52(gameName, (Bundle) obj);
                return logMiniGameStarted$lambda$52;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logMiniGameStarted$lambda$52(String str, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString("game_name", str);
        return Unit.INSTANCE;
    }

    public final void logMiniGameSessionCode(final String gameName, final boolean success) {
        Intrinsics.checkNotNullParameter(gameName, "gameName");
        logEventWithVersion("mini_game_session_code", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logMiniGameSessionCode$lambda$53;
                logMiniGameSessionCode$lambda$53 = AnalyticsHelper.logMiniGameSessionCode$lambda$53(gameName, success, (Bundle) obj);
                return logMiniGameSessionCode$lambda$53;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logMiniGameSessionCode$lambda$53(String str, boolean z, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString("game_name", str);
        logEventWithVersion.putBoolean("success", z);
        return Unit.INSTANCE;
    }

    public final void logMiniGameBalanceUpdated(final String gameName) {
        Intrinsics.checkNotNullParameter(gameName, "gameName");
        logEventWithVersion("mini_game_balance_updated", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logMiniGameBalanceUpdated$lambda$54;
                logMiniGameBalanceUpdated$lambda$54 = AnalyticsHelper.logMiniGameBalanceUpdated$lambda$54(gameName, (Bundle) obj);
                return logMiniGameBalanceUpdated$lambda$54;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logMiniGameBalanceUpdated$lambda$54(String str, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString("game_name", str);
        return Unit.INSTANCE;
    }

    public final void logMiniGameResult(final String gameName) {
        Intrinsics.checkNotNullParameter(gameName, "gameName");
        logEventWithVersion("mini_game_result", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logMiniGameResult$lambda$55;
                logMiniGameResult$lambda$55 = AnalyticsHelper.logMiniGameResult$lambda$55(gameName, (Bundle) obj);
                return logMiniGameResult$lambda$55;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logMiniGameResult$lambda$55(String str, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString("game_name", str);
        return Unit.INSTANCE;
    }

    public final void logMiniGameInsufficientFunds(final String gameName) {
        Intrinsics.checkNotNullParameter(gameName, "gameName");
        logEventWithVersion("mini_game_insufficient_funds", new Function1() { // from class: org.betup.services.analytics.AnalyticsHelper$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit logMiniGameInsufficientFunds$lambda$56;
                logMiniGameInsufficientFunds$lambda$56 = AnalyticsHelper.logMiniGameInsufficientFunds$lambda$56(gameName, (Bundle) obj);
                return logMiniGameInsufficientFunds$lambda$56;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logMiniGameInsufficientFunds$lambda$56(String str, Bundle logEventWithVersion) {
        Intrinsics.checkNotNullParameter(logEventWithVersion, "$this$logEventWithVersion");
        logEventWithVersion.putString("game_name", str);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setUserProperties$default(AnalyticsHelper analyticsHelper, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        analyticsHelper.setUserProperties(str, str2, num);
    }

    public final void setUserProperties(String userId, String registrationDate, Integer userLevel) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(registrationDate, "registrationDate");
        FirebaseAnalytics analytics = getAnalytics();
        if (analytics != null) {
            analytics.setUserId(userId);
            analytics.setUserProperty("registration_date", registrationDate);
            analytics.setUserProperty(App.JsonKeys.APP_VERSION, INSTANCE.getAppVersion());
            if (userLevel != null) {
                analytics.setUserProperty("user_level", String.valueOf(userLevel.intValue()));
            }
        }
    }

    public final void setUserSegment(String segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        FirebaseAnalytics analytics = getAnalytics();
        if (analytics != null) {
            analytics.setUserProperty("user_segment", segment);
        }
    }

    public final void setVideoEngagementLevel(String level) {
        Intrinsics.checkNotNullParameter(level, "level");
        FirebaseAnalytics analytics = getAnalytics();
        if (analytics != null) {
            analytics.setUserProperty("video_engagement_level", level);
        }
    }
}
