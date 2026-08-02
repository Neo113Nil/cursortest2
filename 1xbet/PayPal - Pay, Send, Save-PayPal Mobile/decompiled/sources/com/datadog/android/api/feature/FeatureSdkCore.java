package com.datadog.android.api.feature;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u00020\u00072\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\nH&¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00182\u0006\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\nH&¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&H&¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b*\u0010#J\u001f\u0010-\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010,\u001a\u00020+H&¢\u0006\u0004\b-\u0010.JH\u00102\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00162%\u00101\u001a!\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190/¢\u0006\u0002\b0\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b2\u00103R\u0014\u00107\u001a\u0002048'X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088'X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:"}, d2 = {"Lcom/datadog/android/api/feature/FeatureSdkCore;", "Lcom/datadog/android/api/SdkCore;", "Lkotlin/Function1;", "Lokhttp3/OkHttpClient$Builder;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lokhttp3/Call$Factory;", "createOkHttpCallFactory", "(Lkotlin/jvm/functions/Function1;)Lokhttp3/Call$Factory;", "", "executorContext", "Ljava/util/concurrent/ScheduledExecutorService;", "createScheduledExecutorService", "(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ExecutorService;", "createSingleThreadExecutorService", "(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;", "featureName", "Lcom/datadog/android/api/feature/FeatureScope;", "getFeature", "(Ljava/lang/String;)Lcom/datadog/android/api/feature/FeatureScope;", "", "useContextThread", "", "", "getFeatureContext", "(Ljava/lang/String;Z)Ljava/util/Map;", "Lcom/datadog/android/api/feature/Feature;", "feature", "registerFeature", "(Lcom/datadog/android/api/feature/Feature;)V", "Lcom/datadog/android/api/feature/FeatureContextUpdateReceiver;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeContextUpdateReceiver", "(Lcom/datadog/android/api/feature/FeatureContextUpdateReceiver;)V", "removeEventReceiver", "(Ljava/lang/String;)V", "Ljava/util/UUID;", "anonymousId", "setAnonymousId", "(Ljava/util/UUID;)V", "setContextUpdateReceiver", "Lcom/datadog/android/api/feature/FeatureEventReceiver;", "receiver", "setEventReceiver", "(Ljava/lang/String;Lcom/datadog/android/api/feature/FeatureEventReceiver;)V", "", "Lkotlin/ParameterName;", "updateCallback", "updateFeatureContext", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/internal/time/TimeProvider;", "getTimeProvider", "()Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FeatureSdkCore extends com.datadog.android.api.SdkCore {
    okhttp3.Call.Factory createOkHttpCallFactory(kotlin.jvm.functions.Function1<? super okhttp3.OkHttpClient.Builder, kotlin.Unit> block);

    java.util.concurrent.ScheduledExecutorService createScheduledExecutorService(java.lang.String executorContext);

    java.util.concurrent.ExecutorService createSingleThreadExecutorService(java.lang.String executorContext);

    com.datadog.android.api.feature.FeatureScope getFeature(java.lang.String featureName);

    java.util.Map<java.lang.String, java.lang.Object> getFeatureContext(java.lang.String featureName, boolean useContextThread);

    com.datadog.android.api.InternalLogger getInternalLogger();

    com.datadog.android.internal.time.TimeProvider getTimeProvider();

    void registerFeature(com.datadog.android.api.feature.Feature feature);

    void removeContextUpdateReceiver(com.datadog.android.api.feature.FeatureContextUpdateReceiver listener);

    void removeEventReceiver(java.lang.String featureName);

    void setAnonymousId(java.util.UUID anonymousId);

    void setContextUpdateReceiver(com.datadog.android.api.feature.FeatureContextUpdateReceiver listener);

    void setEventReceiver(java.lang.String featureName, com.datadog.android.api.feature.FeatureEventReceiver receiver);

    void updateFeatureContext(java.lang.String featureName, boolean useContextThread, kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, java.lang.Object>, kotlin.Unit> updateCallback);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void updateFeatureContext$default(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, java.lang.String str, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateFeatureContext");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            featureSdkCore.updateFeatureContext(str, z, function1);
        }

        public static /* synthetic */ java.util.Map getFeatureContext$default(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeatureContext");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return featureSdkCore.getFeatureContext(str, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ okhttp3.Call.Factory createOkHttpCallFactory$default(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createOkHttpCallFactory");
            }
            if ((i & 1) != 0) {
                function1 = new kotlin.jvm.functions.Function1<okhttp3.OkHttpClient.Builder, kotlin.Unit>() { // from class: com.datadog.android.api.feature.FeatureSdkCore$createOkHttpCallFactory$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(okhttp3.OkHttpClient.Builder builder) {
                        getHighSpeedVideoFpsRangesFor(builder);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoFpsRangesFor(okhttp3.OkHttpClient.Builder builder) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    }
                };
            }
            return featureSdkCore.createOkHttpCallFactory(function1);
        }
    }
}
