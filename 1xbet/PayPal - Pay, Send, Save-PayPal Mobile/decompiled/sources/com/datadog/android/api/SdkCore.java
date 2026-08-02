package com.datadog.android.api;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\b\u001a\u00020\u00052\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H&¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017JG\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H&¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0011\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010\"\u001a\u00020\u001f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Lcom/datadog/android/api/SdkCore;", "", "", "", "extraInfo", "", "addAccountExtraInfo", "(Ljava/util/Map;)V", "addUserProperties", "clearAccountInfo", "()V", "clearAllData", "clearUserInfo", "", "isCoreActive", "()Z", "id", "name", "setAccountInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/datadog/android/privacy/TrackingConsent;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "setTrackingConsent", "(Lcom/datadog/android/privacy/TrackingConsent;)V", "email", "setUserInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getService", "service", "Lcom/datadog/android/api/context/TimeInfo;", "getTime", "()Lcom/datadog/android/api/context/TimeInfo;", "time"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SdkCore {
    void addAccountExtraInfo(java.util.Map<java.lang.String, ? extends java.lang.Object> extraInfo);

    void addUserProperties(java.util.Map<java.lang.String, ? extends java.lang.Object> extraInfo);

    void clearAccountInfo();

    void clearAllData();

    void clearUserInfo();

    java.lang.String getName();

    java.lang.String getService();

    com.datadog.android.api.context.TimeInfo getTime();

    boolean isCoreActive();

    void setAccountInfo(java.lang.String id, java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> extraInfo);

    void setTrackingConsent(com.datadog.android.privacy.TrackingConsent consent);

    void setUserInfo(java.lang.String id, java.lang.String name2, java.lang.String email, java.util.Map<java.lang.String, ? extends java.lang.Object> extraInfo);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void setUserInfo$default(com.datadog.android.api.SdkCore sdkCore, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUserInfo");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            sdkCore.setUserInfo(str, str2, str3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void setAccountInfo$default(com.datadog.android.api.SdkCore sdkCore, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAccountInfo");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            sdkCore.setAccountInfo(str, str2, map);
        }
    }
}
