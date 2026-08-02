package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/api/feature/FeatureSdkCore;", "", "traceId", "spanId", "", "addActiveTraceToContext", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Ljava/lang/String;Ljava/lang/String;)V", "removeActiveTraceFromContext", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeatureSdkCoreExtKt {
    public static final void addActiveTraceToContext(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, final java.lang.String str, final java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        final java.lang.String concat = "context@".concat(java.lang.String.valueOf(java.lang.Thread.currentThread().getName()));
        com.datadog.android.api.feature.FeatureSdkCore.DefaultImpls.updateFeatureContext$default(featureSdkCore, "tracing", false, new kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.Object>, kotlin.Unit>() { // from class: com.datadog.android.trace.internal.FeatureSdkCoreExtKt$addActiveTraceToContext$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.util.Map<java.lang.String, java.lang.Object> map) {
                Camera2StreamConfigurationMap(map);
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(java.util.Map<java.lang.String, java.lang.Object> map) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                map.put(concat, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("span_id", str2), kotlin.TuplesKt.to("trace_id", str)));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 2, null);
    }

    public static final void removeActiveTraceFromContext(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        final java.lang.String concat = "context@".concat(java.lang.String.valueOf(java.lang.Thread.currentThread().getName()));
        com.datadog.android.api.feature.FeatureSdkCore.DefaultImpls.updateFeatureContext$default(featureSdkCore, "tracing", false, new kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, java.lang.Object>, kotlin.Unit>() { // from class: com.datadog.android.trace.internal.FeatureSdkCoreExtKt$removeActiveTraceFromContext$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.util.Map<java.lang.String, java.lang.Object> map) {
                getHighSpeedVideoFpsRangesFor(map);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(java.util.Map<java.lang.String, java.lang.Object> map) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                map.remove(concat);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 2, null);
    }
}
