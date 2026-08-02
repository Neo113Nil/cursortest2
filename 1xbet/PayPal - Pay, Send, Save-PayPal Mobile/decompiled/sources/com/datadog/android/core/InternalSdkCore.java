package com.datadog.android.core;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00128'X¦\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\u00020\u00128'X¦\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0004\u001a\u0004\b\u001e\u0010\u001bR\u0014\u0010$\u001a\u00020!8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020%8'X¦\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0004\u001a\u0004\b&\u0010'R\u001c\u0010,\u001a\u0004\u0018\u00010\u00128gX¦\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0004\u001a\u0004\b)\u0010*R\u001c\u00101\u001a\u0004\u0018\u00010-8gX¦\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0004\u001a\u0004\b.\u0010/R\u001a\u00106\u001a\u0002028'X¦\u0004¢\u0006\f\u0012\u0004\b5\u0010\u0004\u001a\u0004\b3\u00104R\u001c\u0010;\u001a\u0004\u0018\u0001078'X¦\u0004¢\u0006\f\u0012\u0004\b:\u0010\u0004\u001a\u0004\b8\u00109R\u001a\u0010@\u001a\u00020<8'X¦\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0004\u001a\u0004\b=\u0010>"}, d2 = {"Lcom/datadog/android/core/InternalSdkCore;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "", "deleteLastViewEvent", "()V", "", "Lcom/datadog/android/api/feature/FeatureScope;", "getAllFeatures", "()Ljava/util/List;", "", "", "withFeatureContexts", "Lcom/datadog/android/api/context/DatadogContext;", "getDatadogContext", "(Ljava/util/Set;)Lcom/datadog/android/api/context/DatadogContext;", "Ljava/util/concurrent/ExecutorService;", "getPersistenceExecutorService", "()Ljava/util/concurrent/ExecutorService;", "", "anrTimestamp", "writeLastFatalAnrSent", "(J)V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "writeLastViewEvent", "([B)V", "getAppStartTimeNs", "()J", "getAppStartTimeNs$annotations", "appStartTimeNs", "getAppUptimeNs", "getAppUptimeNs$annotations", "appUptimeNs", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "getFirstPartyHostResolver", "()Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostResolver", "", "isDeveloperModeEnabled", "()Z", "isDeveloperModeEnabled$annotations", "getLastFatalAnrSent", "()Ljava/lang/Long;", "getLastFatalAnrSent$annotations", "lastFatalAnrSent", "Lcom/google/gson/JsonObject;", "getLastViewEvent", "()Lcom/google/gson/JsonObject;", "getLastViewEvent$annotations", "lastViewEvent", "Lcom/datadog/android/api/context/NetworkInfo;", "getNetworkInfo", "()Lcom/datadog/android/api/context/NetworkInfo;", "getNetworkInfo$annotations", "networkInfo", "Ljava/io/File;", "getRootStorageDir", "()Ljava/io/File;", "getRootStorageDir$annotations", "rootStorageDir", "Lcom/datadog/android/privacy/TrackingConsent;", "getTrackingConsent", "()Lcom/datadog/android/privacy/TrackingConsent;", "getTrackingConsent$annotations", "trackingConsent"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InternalSdkCore extends com.datadog.android.api.feature.FeatureSdkCore {
    void deleteLastViewEvent();

    java.util.List<com.datadog.android.api.feature.FeatureScope> getAllFeatures();

    long getAppStartTimeNs();

    long getAppUptimeNs();

    com.datadog.android.api.context.DatadogContext getDatadogContext(java.util.Set<java.lang.String> withFeatureContexts);

    com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver getFirstPartyHostResolver();

    java.lang.Long getLastFatalAnrSent();

    com.google.gson.JsonObject getLastViewEvent();

    com.datadog.android.api.context.NetworkInfo getNetworkInfo();

    java.util.concurrent.ExecutorService getPersistenceExecutorService();

    java.io.File getRootStorageDir();

    com.datadog.android.privacy.TrackingConsent getTrackingConsent();

    boolean isDeveloperModeEnabled();

    void writeLastFatalAnrSent(long anrTimestamp);

    void writeLastViewEvent(byte[] data);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getAppStartTimeNs$annotations() {
        }

        public static /* synthetic */ void getAppUptimeNs$annotations() {
        }

        public static /* synthetic */ void getLastFatalAnrSent$annotations() {
        }

        public static /* synthetic */ void getLastViewEvent$annotations() {
        }

        public static /* synthetic */ void getNetworkInfo$annotations() {
        }

        public static /* synthetic */ void getRootStorageDir$annotations() {
        }

        public static /* synthetic */ void getTrackingConsent$annotations() {
        }

        public static /* synthetic */ void isDeveloperModeEnabled$annotations() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.api.context.DatadogContext getDatadogContext$default(com.datadog.android.core.InternalSdkCore internalSdkCore, java.util.Set set, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDatadogContext");
            }
            if ((i & 1) != 0) {
                set = kotlin.collections.SetsKt.emptySet();
            }
            return internalSdkCore.getDatadogContext(set);
        }
    }
}
