package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\b\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0013\u001a\u00020\t*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0015R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/datadog/android/trace/internal/RumContextPropagator;", "", "Lkotlin/Function0;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCoreProvider", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "p0", "", "getHighSpeedVideoSizes", "(Ljava/lang/String;)V", "T", "Ljava/util/concurrent/Future;", "Camera2StreamConfigurationMap", "(Ljava/util/concurrent/Future;)Ljava/lang/Object;", "", "Ljava/util/concurrent/TimeUnit;", "p1", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/concurrent/Future;Ljava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RumContextPropagator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.trace.internal.RumContextPropagator.Companion INSTANCE = new com.datadog.android.trace.internal.RumContextPropagator.Companion(null);
    public static final java.lang.String DATADOG_INITIAL_CONTEXT = "_dd.datadog_initial_context";
    public static final java.lang.String ERROR_DATADOG_CONTEXT_RESOLUTION_TIMEOUT = "Datadog context resolution timeout exceeded.";
    public static final java.lang.String ERROR_FUTURE_GET_FAILED = "Unable to get datadog context.";
    public static final java.lang.String INITIAL_DATADOG_CONTEXT_NOT_AVAILABLE_ERROR = "Initial span creation Datadog context is not available at the write time.";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<com.datadog.android.api.feature.FeatureSdkCore> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public RumContextPropagator(kotlin.jvm.functions.Function0<? extends com.datadog.android.api.feature.FeatureSdkCore> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoSizes = function0;
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        if (obj instanceof com.datadog.trace.core.DDSpan) {
            ((com.datadog.trace.core.DDSpan) obj).mo10046setTag(str, obj2);
        } else if (obj instanceof com.datadog.android.trace.api.span.DatadogSpan) {
            ((com.datadog.android.trace.api.span.DatadogSpan) obj).setTag(str, obj2);
        }
    }

    private final <T> T getHighSpeedVideoFpsRangesFor(java.util.concurrent.Future<T> p0, java.util.concurrent.TimeUnit p1) {
        try {
            return p0.get(1L, p1);
        } catch (java.util.concurrent.TimeoutException unused) {
            getHighSpeedVideoSizes(ERROR_DATADOG_CONTEXT_RESOLUTION_TIMEOUT);
            return null;
        } catch (java.lang.Exception unused2) {
            getHighSpeedVideoSizes(ERROR_FUTURE_GET_FAILED);
            return null;
        }
    }

    private final <T> T Camera2StreamConfigurationMap(java.util.concurrent.Future<T> future) {
        try {
            return future.get();
        } catch (java.lang.Exception unused) {
            getHighSpeedVideoSizes(ERROR_FUTURE_GET_FAILED);
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\f\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013"}, d2 = {"Lcom/datadog/android/trace/internal/RumContextPropagator$Companion;", "", "<init>", "()V", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "Lcom/datadog/android/trace/internal/RumContextPropagator;", "propagator", "", "block", "extractRumContext", "(Lcom/datadog/android/trace/api/span/DatadogSpan;Lcom/datadog/android/trace/internal/RumContextPropagator;Z)Lcom/datadog/android/trace/api/span/DatadogSpan;", "Lcom/datadog/trace/core/DDSpan;", "extractRumContext$dd_sdk_android_trace_release", "(Lcom/datadog/trace/core/DDSpan;Lcom/datadog/android/trace/internal/RumContextPropagator;Z)Lcom/datadog/trace/core/DDSpan;", "Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "injectRumContext$dd_sdk_android_trace_release", "(Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;Lcom/datadog/android/trace/internal/RumContextPropagator;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "", "DATADOG_INITIAL_CONTEXT", "Ljava/lang/String;", "ERROR_DATADOG_CONTEXT_RESOLUTION_TIMEOUT", "ERROR_FUTURE_GET_FAILED", "INITIAL_DATADOG_CONTEXT_NOT_AVAILABLE_ERROR"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.datadog.android.trace.api.span.DatadogSpan extractRumContext$default(com.datadog.android.trace.internal.RumContextPropagator.Companion companion, com.datadog.android.trace.api.span.DatadogSpan datadogSpan, com.datadog.android.trace.internal.RumContextPropagator rumContextPropagator, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.extractRumContext(datadogSpan, rumContextPropagator, z);
        }

        public final com.datadog.android.trace.api.span.DatadogSpan extractRumContext(com.datadog.android.trace.api.span.DatadogSpan datadogSpan, com.datadog.android.trace.internal.RumContextPropagator rumContextPropagator, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogSpan, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumContextPropagator, "");
            com.datadog.android.trace.internal.RumContextPropagator.access$extractRumContextInternal(rumContextPropagator, datadogSpan, z);
            return datadogSpan;
        }

        public static /* synthetic */ com.datadog.trace.core.DDSpan extractRumContext$dd_sdk_android_trace_release$default(com.datadog.android.trace.internal.RumContextPropagator.Companion companion, com.datadog.trace.core.DDSpan dDSpan, com.datadog.android.trace.internal.RumContextPropagator rumContextPropagator, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.extractRumContext$dd_sdk_android_trace_release(dDSpan, rumContextPropagator, z);
        }

        public final com.datadog.trace.core.DDSpan extractRumContext$dd_sdk_android_trace_release(com.datadog.trace.core.DDSpan dDSpan, com.datadog.android.trace.internal.RumContextPropagator rumContextPropagator, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dDSpan, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumContextPropagator, "");
            com.datadog.android.trace.internal.RumContextPropagator.access$extractRumContextInternal(rumContextPropagator, dDSpan, z);
            return dDSpan;
        }

        public final com.datadog.android.trace.api.span.DatadogSpanBuilder injectRumContext$dd_sdk_android_trace_release(com.datadog.android.trace.api.span.DatadogSpanBuilder datadogSpanBuilder, com.datadog.android.trace.internal.RumContextPropagator rumContextPropagator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogSpanBuilder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumContextPropagator, "");
            com.datadog.android.trace.internal.RumContextPropagator.access$injectRumContext(rumContextPropagator, datadogSpanBuilder);
            return datadogSpanBuilder;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ void access$extractRumContextInternal(com.datadog.android.trace.internal.RumContextPropagator rumContextPropagator, java.lang.Object obj, boolean z) {
        java.util.concurrent.Future future;
        com.datadog.android.api.context.DatadogContext datadogContext;
        if (obj instanceof com.datadog.trace.core.DDSpan) {
            java.lang.Object tag = ((com.datadog.trace.core.DDSpan) obj).getTag(DATADOG_INITIAL_CONTEXT);
            if (!(tag instanceof java.util.concurrent.Future)) {
                tag = null;
            }
            future = (java.util.concurrent.Future) tag;
        } else if (obj instanceof com.datadog.android.trace.api.span.DatadogSpan) {
            java.lang.Object tag2 = ((com.datadog.android.trace.api.span.DatadogSpan) obj).getTag(DATADOG_INITIAL_CONTEXT);
            if (!(tag2 instanceof java.util.concurrent.Future)) {
                tag2 = null;
            }
            future = (java.util.concurrent.Future) tag2;
        } else {
            future = null;
        }
        if (future != null) {
            if (z) {
                datadogContext = (com.datadog.android.api.context.DatadogContext) rumContextPropagator.getHighSpeedVideoFpsRangesFor(future, java.util.concurrent.TimeUnit.SECONDS);
            } else if (future.isDone()) {
                datadogContext = (com.datadog.android.api.context.DatadogContext) rumContextPropagator.Camera2StreamConfigurationMap(future);
            } else {
                rumContextPropagator.getHighSpeedVideoSizes(INITIAL_DATADOG_CONTEXT_NOT_AVAILABLE_ERROR);
                datadogContext = null;
            }
            if (datadogContext != null) {
                java.util.Map<java.lang.String, java.lang.Object> map = datadogContext.getFeaturesContext().get("rum");
                if (map == null) {
                    map = kotlin.collections.MapsKt.emptyMap();
                }
                getHighSpeedVideoFpsRangesFor(obj, "application_id", map.get("application_id"));
                getHighSpeedVideoFpsRangesFor(obj, "session_id", map.get("session_id"));
                getHighSpeedVideoFpsRangesFor(obj, com.datadog.android.log.LogAttributes.RUM_VIEW_ID, map.get("view_id"));
                getHighSpeedVideoFpsRangesFor(obj, com.datadog.android.log.LogAttributes.RUM_ACTION_ID, map.get("action_id"));
                getHighSpeedVideoFpsRangesFor(obj, "user_id", datadogContext.getUserInfo().getId());
                com.datadog.android.api.context.AccountInfo accountInfo = datadogContext.getAccountInfo();
                getHighSpeedVideoFpsRangesFor(obj, com.datadog.trace.core.propagation.HttpCodec.RUM_KEY_ACCOUNT_ID, accountInfo != null ? accountInfo.getId() : null);
            }
            getHighSpeedVideoFpsRangesFor(obj, DATADOG_INITIAL_CONTEXT, null);
        }
    }

    public static final /* synthetic */ void access$injectRumContext(com.datadog.android.trace.internal.RumContextPropagator rumContextPropagator, com.datadog.android.trace.api.span.DatadogSpanBuilder datadogSpanBuilder) {
        com.datadog.android.api.feature.FeatureScope feature;
        java.util.concurrent.Future<com.datadog.android.api.context.DatadogContext> contextFuture;
        com.datadog.android.api.feature.FeatureSdkCore invoke = rumContextPropagator.getHighSpeedVideoSizes.invoke();
        if (invoke == null || (feature = invoke.getFeature("rum")) == null || (contextFuture = com.datadog.android.api.feature.FeatureScopeExtKt.getContextFuture(feature, kotlin.collections.SetsKt.setOf("rum"))) == null) {
            return;
        }
        datadogSpanBuilder.withTag(DATADOG_INITIAL_CONTEXT, contextFuture);
    }

    private final void getHighSpeedVideoSizes(final java.lang.String p0) {
        com.datadog.android.api.feature.FeatureSdkCore invoke = this.getHighSpeedVideoSizes.invoke();
        com.datadog.android.api.InternalLogger internalLogger = invoke != null ? invoke.getInternalLogger() : null;
        if (internalLogger != null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.trace.internal.RumContextPropagator$logError$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return p0;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
    }
}
