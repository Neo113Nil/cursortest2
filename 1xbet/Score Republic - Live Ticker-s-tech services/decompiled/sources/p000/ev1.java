package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public interface ev1 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(gv1 gv1Var);

    void getAppInstanceId(gv1 gv1Var);

    void getCachedAppInstanceId(gv1 gv1Var);

    void getConditionalUserProperties(String str, String str2, gv1 gv1Var);

    void getCurrentScreenClass(gv1 gv1Var);

    void getCurrentScreenName(gv1 gv1Var);

    void getGmpAppId(gv1 gv1Var);

    void getMaxUserProperties(String str, gv1 gv1Var);

    void getSessionId(gv1 gv1Var);

    void getTestFlag(gv1 gv1Var, int i);

    void getUserProperties(String str, String str2, boolean z, gv1 gv1Var);

    void initForTests(Map map);

    void initialize(xb0 xb0Var, wv1 wv1Var, long j);

    void initializeWithElapsedTime(xb0 xb0Var, wv1 wv1Var, long j, long j2);

    void isDataCollectionEnabled(gv1 gv1Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, gv1 gv1Var, long j);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2);

    void logHealthData(int i, String str, xb0 xb0Var, xb0 xb0Var2, xb0 xb0Var3);

    void onActivityCreated(xb0 xb0Var, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(xv1 xv1Var, Bundle bundle, long j);

    void onActivityDestroyed(xb0 xb0Var, long j);

    void onActivityDestroyedByScionActivityInfo(xv1 xv1Var, long j);

    void onActivityPaused(xb0 xb0Var, long j);

    void onActivityPausedByScionActivityInfo(xv1 xv1Var, long j);

    void onActivityResumed(xb0 xb0Var, long j);

    void onActivityResumedByScionActivityInfo(xv1 xv1Var, long j);

    void onActivitySaveInstanceState(xb0 xb0Var, gv1 gv1Var, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(xv1 xv1Var, gv1 gv1Var, long j);

    void onActivityStarted(xb0 xb0Var, long j);

    void onActivityStartedByScionActivityInfo(xv1 xv1Var, long j);

    void onActivityStopped(xb0 xb0Var, long j);

    void onActivityStoppedByScionActivityInfo(xv1 xv1Var, long j);

    void performAction(Bundle bundle, gv1 gv1Var, long j);

    void registerOnMeasurementEventListener(kv1 kv1Var);

    void resetAnalyticsData(long j);

    void resetAnalyticsDataWithElapsedTime(long j, long j2);

    void retrieveAndUploadBatches(iv1 iv1Var);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(xb0 xb0Var, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(xv1 xv1Var, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(kv1 kv1Var);

    void setInstanceIdProvider(vv1 vv1Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, xb0 xb0Var, boolean z, long j);

    void unregisterOnMeasurementEventListener(kv1 kv1Var);
}
