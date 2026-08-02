package com.datadog.android.api.feature;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aC\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/datadog/android/api/feature/FeatureScope;", "", "", "withFeatureContexts", "Ljava/util/concurrent/Future;", "Lcom/datadog/android/api/context/DatadogContext;", "getContextFuture", "(Lcom/datadog/android/api/feature/FeatureScope;Ljava/util/Set;)Ljava/util/concurrent/Future;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lcom/datadog/android/api/InternalLogger;", "Ljava/lang/Class;", "callerClass", "operationName", "", "samplingRate", "Lkotlin/Function0;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "measureMethodCallPerf", "(Lcom/datadog/android/api/InternalLogger;Ljava/lang/Class;Ljava/lang/String;FLkotlin/jvm/functions/Function0;)Ljava/lang/Object;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeatureScopeExtKt {
    public static /* synthetic */ java.lang.Object measureMethodCallPerf$default(com.datadog.android.api.InternalLogger internalLogger, java.lang.Class cls, java.lang.String str, float f, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            f = 100.0f;
        }
        return measureMethodCallPerf(internalLogger, cls, str, f, function0);
    }

    public static final <R> R measureMethodCallPerf(com.datadog.android.api.InternalLogger internalLogger, java.lang.Class<?> cls, java.lang.String str, float f, kotlin.jvm.functions.Function0<? extends R> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        java.lang.String name2 = cls.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        com.datadog.android.core.metrics.PerformanceMetric startPerformanceMeasure = internalLogger.startPerformanceMeasure(name2, com.datadog.android.core.metrics.TelemetryMetricType.MethodCalled, f, str);
        R invoke = function0.invoke();
        boolean z = (invoke == null || ((invoke instanceof java.util.Collection) && ((java.util.Collection) invoke).isEmpty())) ? false : true;
        if (startPerformanceMeasure != null) {
            startPerformanceMeasure.stopAndSend(z);
        }
        return invoke;
    }

    public static /* synthetic */ java.util.concurrent.Future getContextFuture$default(com.datadog.android.api.feature.FeatureScope featureScope, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            set = kotlin.collections.SetsKt.emptySet();
        }
        return getContextFuture(featureScope, set);
    }

    public static final java.util.concurrent.Future<com.datadog.android.api.context.DatadogContext> getContextFuture(com.datadog.android.api.feature.FeatureScope featureScope, java.util.Set<java.lang.String> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        if (featureScope instanceof com.datadog.android.core.internal.SdkFeature) {
            return ((com.datadog.android.core.internal.SdkFeature) featureScope).getContextFuture$dd_sdk_android_core_release(set);
        }
        return null;
    }
}
