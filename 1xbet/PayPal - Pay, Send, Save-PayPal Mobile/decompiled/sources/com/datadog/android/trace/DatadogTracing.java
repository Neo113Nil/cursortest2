package com.datadog.android.trace;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/trace/DatadogTracing;", "", "<init>", "()V", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "newTracerBuilder", "(Lcom/datadog/android/api/SdkCore;)Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "ErrorMessages"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatadogTracing {
    public static final com.datadog.android.trace.DatadogTracing INSTANCE = new com.datadog.android.trace.DatadogTracing();

    private DatadogTracing() {
    }

    public static /* synthetic */ com.datadog.android.trace.api.tracer.DatadogTracerBuilder newTracerBuilder$default(com.datadog.android.api.SdkCore sdkCore, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            sdkCore = com.datadog.android.Datadog.getInstance$default(null, 1, null);
        }
        return newTracerBuilder(sdkCore);
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.trace.api.tracer.DatadogTracerBuilder newTracerBuilder(com.datadog.android.api.SdkCore sdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        if (com.datadog.android.trace.internal.DatadogTracingToolkit.INSTANCE.getTestBuilderProvider$dd_sdk_android_trace_release() != null) {
            com.datadog.android.trace.api.tracer.DatadogTracerBuilder testBuilderProvider$dd_sdk_android_trace_release = com.datadog.android.trace.internal.DatadogTracingToolkit.INSTANCE.getTestBuilderProvider$dd_sdk_android_trace_release();
            kotlin.jvm.internal.Intrinsics.checkNotNull(testBuilderProvider$dd_sdk_android_trace_release, "");
            return testBuilderProvider$dd_sdk_android_trace_release;
        }
        if (!(sdkCore instanceof com.datadog.android.api.feature.FeatureSdkCore)) {
            return new com.datadog.android.trace.api.tracer.NoOpDatadogTracerBuilder();
        }
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = (com.datadog.android.api.feature.FeatureSdkCore) sdkCore;
        com.datadog.android.api.InternalLogger internalLogger = featureSdkCore.getInternalLogger();
        com.datadog.android.api.feature.FeatureScope feature = featureSdkCore.getFeature("tracing");
        com.datadog.android.api.feature.Feature unwrap = feature != null ? feature.unwrap() : null;
        final com.datadog.android.trace.InternalCoreWriterProvider internalCoreWriterProvider = unwrap instanceof com.datadog.android.trace.InternalCoreWriterProvider ? (com.datadog.android.trace.InternalCoreWriterProvider) unwrap : null;
        com.datadog.android.trace.api.span.DatadogSpanWriter coreTracerWriter = internalCoreWriterProvider != null ? internalCoreWriterProvider.getCoreTracerWriter() : null;
        com.datadog.android.trace.internal.DatadogSpanWriterWrapper datadogSpanWriterWrapper = coreTracerWriter instanceof com.datadog.android.trace.internal.DatadogSpanWriterWrapper ? (com.datadog.android.trace.internal.DatadogSpanWriterWrapper) coreTracerWriter : null;
        com.datadog.trace.common.writer.NoOpWriter delegate = datadogSpanWriterWrapper != null ? datadogSpanWriterWrapper.getDelegate() : null;
        if (unwrap == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.trace.DatadogTracing$newTracerBuilder$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.trace.DatadogTracing.ErrorMessages.TRACING_NOT_ENABLED_ERROR_MESSAGE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        } else if (internalCoreWriterProvider == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.trace.DatadogTracing$newTracerBuilder$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.trace.DatadogTracing.ErrorMessages.WRITER_PROVIDER_INTERFACE_NOT_IMPLEMENTED_ERROR_MESSAGE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        } else if (delegate == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.trace.DatadogTracing$newTracerBuilder$3
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.trace.DatadogTracing.ErrorMessages.INSTANCE.buildWrongWrapperMessage(com.datadog.android.trace.InternalCoreWriterProvider.this.getCoreTracerWriter().getClass());
                }

                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        } else if (sdkCore.getService().length() == 0) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.trace.DatadogTracing$newTracerBuilder$4
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.trace.DatadogTracing.ErrorMessages.DEFAULT_SERVICE_NAME_IS_MISSING_ERROR_MESSAGE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
        java.lang.String service = sdkCore.getService();
        com.datadog.trace.core.CoreTracer.CoreTracerBuilder coreTracerBuilder = new com.datadog.trace.core.CoreTracer.CoreTracerBuilder(featureSdkCore.getInternalLogger());
        if (delegate == null) {
            delegate = new com.datadog.trace.common.writer.NoOpWriter();
        }
        com.datadog.trace.core.CoreTracer.CoreTracerBuilder writer = coreTracerBuilder.writer(delegate);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(writer, "");
        return new com.datadog.android.trace.internal.DatadogTracerBuilderAdapter(featureSdkCore, service, writer);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\n"}, d2 = {"Lcom/datadog/android/trace/DatadogTracing$ErrorMessages;", "", "<init>", "()V", "Ljava/lang/Class;", "cls", "", "buildWrongWrapperMessage", "(Ljava/lang/Class;)Ljava/lang/String;", "DEFAULT_SERVICE_NAME_IS_MISSING_ERROR_MESSAGE", "Ljava/lang/String;", "TRACING_NOT_ENABLED_ERROR_MESSAGE", "WRITER_PROVIDER_INTERFACE_NOT_IMPLEMENTED_ERROR_MESSAGE"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ErrorMessages {
        public static final java.lang.String DEFAULT_SERVICE_NAME_IS_MISSING_ERROR_MESSAGE = "Default service name is missing during DatadogTracerBuilder creation, did you initialize SDK?";
        public static final com.datadog.android.trace.DatadogTracing.ErrorMessages INSTANCE = new com.datadog.android.trace.DatadogTracing.ErrorMessages();
        public static final java.lang.String TRACING_NOT_ENABLED_ERROR_MESSAGE = "You're trying to create an DatadogTracer instance, but either the SDK was not initialized or the Tracing feature was not registered. No tracing data will be sent.";
        public static final java.lang.String WRITER_PROVIDER_INTERFACE_NOT_IMPLEMENTED_ERROR_MESSAGE = "The Tracing feature is not implementing the InternalCoreWriterProvider interface. No tracing data will be sent.";

        private ErrorMessages() {
        }

        public final java.lang.String buildWrongWrapperMessage(java.lang.Class<?> cls) {
            java.lang.String canonicalName = cls != null ? cls.getCanonicalName() : null;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("You're trying to create an DatadogTracer instance, but provided ");
            sb.append(canonicalName);
            sb.append(" writer wrapper is not supported.");
            return sb.toString();
        }
    }
}
