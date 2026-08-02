package com.datadog.android.rum.internal.net;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 72\u00020\u0001:\u00017B+\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001cJ5\u0010\"\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u00100R\u001a\u00102\u001a\u0002018\u0001X\u0081\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b6\u0010-"}, d2 = {"Lcom/datadog/android/rum/internal/net/RumNetworkInstrumentation;", "", "", "sdkInstanceName", "networkInstrumentationName", "Lcom/datadog/android/rum/RumResourceAttributesProvider;", "rumResourceAttributesProvider", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;", "libraryType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/RumResourceAttributesProvider;Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;)V", "Lkotlin/Function1;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "", "p0", "Camera2StreamConfigurationMap", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "message", "reportInstrumentationError", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;", "requestInfo", "Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "resourceTiming", "sendTiming", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;)V", "sendWaitForResourceTimingEvent", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;)V", "startResource", "Lcom/datadog/android/api/instrumentation/network/HttpResponseInfo;", "responseInfo", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "stopResource", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;Lcom/datadog/android/api/instrumentation/network/HttpResponseInfo;Ljava/util/Map;)V", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "stopResourceWithError", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;Ljava/lang/Throwable;)V", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;", "getLibraryType$dd_sdk_android_rum_release", "()Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;", "Ljava/lang/String;", "getNetworkInstrumentationName$dd_sdk_android_rum_release", "()Ljava/lang/String;", "Lcom/datadog/android/rum/RumResourceAttributesProvider;", "getRumResourceAttributesProvider$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/RumResourceAttributesProvider;", "Lcom/datadog/android/core/SdkReference;", "sdkCoreReference", "Lcom/datadog/android/core/SdkReference;", "getSdkCoreReference$dd_sdk_android_rum_release", "()Lcom/datadog/android/core/SdkReference;", "getSdkInstanceName$dd_sdk_android_rum_release", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumNetworkInstrumentation {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.net.RumNetworkInstrumentation.Companion INSTANCE = new com.datadog.android.rum.internal.net.RumNetworkInstrumentation.Companion(null);
    public static final java.lang.String ERROR_MSG_FORMAT = "%s request error %s %s";
    public static final java.lang.String UNSUPPORTED_HTTP_METHOD = "Unsupported HTTP method %s reported by %s instrumentation, using GET instead";
    public static final java.lang.String WARN_RUM_DISABLED = "You set up a %s instrumentation for %s, but RUM feature is disabled. Make sure you initialized the Datadog SDK with a valid Application ID, and that RUM feature is enabled.";
    private final com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.NetworkInstrumentation.LibraryType libraryType;
    private final java.lang.String networkInstrumentationName;
    private final com.datadog.android.rum.RumResourceAttributesProvider rumResourceAttributesProvider;
    private final com.datadog.android.core.SdkReference sdkCoreReference;
    private final java.lang.String sdkInstanceName;

    public RumNetworkInstrumentation(java.lang.String str, java.lang.String str2, com.datadog.android.rum.RumResourceAttributesProvider rumResourceAttributesProvider, com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.NetworkInstrumentation.LibraryType libraryType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumResourceAttributesProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryType, "");
        this.sdkInstanceName = str;
        this.networkInstrumentationName = str2;
        this.rumResourceAttributesProvider = rumResourceAttributesProvider;
        this.libraryType = libraryType;
        this.sdkCoreReference = new com.datadog.android.core.SdkReference(str, new kotlin.jvm.functions.Function1<com.datadog.android.api.SdkCore, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.net.RumNetworkInstrumentation$sdkCoreReference$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.SdkCore sdkCore) {
                Camera2StreamConfigurationMap(sdkCore);
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(com.datadog.android.api.SdkCore sdkCore) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
                com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor access$getNetworkMonitor = com.datadog.android.rum.internal.net.RumNetworkInstrumentation.Companion.access$getNetworkMonitor(com.datadog.android.rum.internal.net.RumNetworkInstrumentation.INSTANCE, sdkCore);
                if (access$getNetworkMonitor != null) {
                    com.datadog.android.rum.internal.net.RumNetworkInstrumentation rumNetworkInstrumentation = com.datadog.android.rum.internal.net.RumNetworkInstrumentation.this;
                    access$getNetworkMonitor.notifyInterceptorInstantiated();
                    access$getNetworkMonitor.reportNetworkingLibraryType(rumNetworkInstrumentation.getLibraryType());
                }
            }

            {
                super(1);
            }
        });
    }

    /* renamed from: getSdkInstanceName$dd_sdk_android_rum_release, reason: from getter */
    public final java.lang.String getSdkInstanceName() {
        return this.sdkInstanceName;
    }

    /* renamed from: getNetworkInstrumentationName$dd_sdk_android_rum_release, reason: from getter */
    public final java.lang.String getNetworkInstrumentationName() {
        return this.networkInstrumentationName;
    }

    /* renamed from: getRumResourceAttributesProvider$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.RumResourceAttributesProvider getRumResourceAttributesProvider() {
        return this.rumResourceAttributesProvider;
    }

    /* renamed from: getLibraryType$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.NetworkInstrumentation.LibraryType getLibraryType() {
        return this.libraryType;
    }

    /* renamed from: getSdkCoreReference$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.core.SdkReference getSdkCoreReference() {
        return this.sdkCoreReference;
    }

    public final void sendWaitForResourceTimingEvent(final com.datadog.android.api.instrumentation.network.HttpRequestInfo requestInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestInfo, "");
        Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1<com.datadog.android.api.feature.FeatureSdkCore, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.net.RumNetworkInstrumentation$sendWaitForResourceTimingEvent$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                getHighSpeedVideoFpsRanges(featureSdkCore);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
                com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor access$getNetworkMonitor = com.datadog.android.rum.internal.net.RumNetworkInstrumentation.Companion.access$getNetworkMonitor(com.datadog.android.rum.internal.net.RumNetworkInstrumentation.INSTANCE, featureSdkCore);
                if (access$getNetworkMonitor != null) {
                    access$getNetworkMonitor.waitForResourceTiming(com.datadog.android.rum.internal.net.RumNetworkInstrumentation.INSTANCE.buildResourceId(com.datadog.android.api.instrumentation.network.HttpRequestInfo.this, true));
                }
            }

            {
                super(1);
            }
        });
    }

    public final void sendTiming(final com.datadog.android.api.instrumentation.network.HttpRequestInfo requestInfo, final com.datadog.android.rum.internal.domain.event.ResourceTiming resourceTiming) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceTiming, "");
        Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1<com.datadog.android.api.feature.FeatureSdkCore, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.net.RumNetworkInstrumentation$sendTiming$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                getHighSpeedVideoFpsRanges(featureSdkCore);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
                com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor access$getNetworkMonitor = com.datadog.android.rum.internal.net.RumNetworkInstrumentation.Companion.access$getNetworkMonitor(com.datadog.android.rum.internal.net.RumNetworkInstrumentation.INSTANCE, featureSdkCore);
                if (access$getNetworkMonitor != null) {
                    access$getNetworkMonitor.addResourceTiming(com.datadog.android.rum.internal.net.RumNetworkInstrumentation.INSTANCE.buildResourceId(com.datadog.android.api.instrumentation.network.HttpRequestInfo.this, false), resourceTiming);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    public final void startResource(final com.datadog.android.api.instrumentation.network.HttpRequestInfo requestInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestInfo, "");
        Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1<com.datadog.android.api.feature.FeatureSdkCore, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.net.RumNetworkInstrumentation$startResource$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                getHighSpeedVideoSizes(featureSdkCore);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
                com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor access$getNetworkMonitor = com.datadog.android.rum.internal.net.RumNetworkInstrumentation.Companion.access$getNetworkMonitor(com.datadog.android.rum.internal.net.RumNetworkInstrumentation.INSTANCE, featureSdkCore);
                if (access$getNetworkMonitor != null) {
                    com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor.DefaultImpls.startResource$default(access$getNetworkMonitor, com.datadog.android.rum.internal.net.RumNetworkInstrumentation.INSTANCE.buildResourceId(com.datadog.android.api.instrumentation.network.HttpRequestInfo.this, true), com.datadog.android.rum.internal.net.RumNetworkInstrumentation.Companion.access$toRumResourceMethod(com.datadog.android.rum.internal.net.RumNetworkInstrumentation.INSTANCE, com.datadog.android.api.instrumentation.network.HttpRequestInfo.this, this.getNetworkInstrumentationName(), featureSdkCore.getInternalLogger()), com.datadog.android.api.instrumentation.network.HttpRequestInfo.this.getUrl(), null, 8, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void stopResource$default(com.datadog.android.rum.internal.net.RumNetworkInstrumentation rumNetworkInstrumentation, com.datadog.android.api.instrumentation.network.HttpRequestInfo httpRequestInfo, com.datadog.android.api.instrumentation.network.HttpResponseInfo httpResponseInfo, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        rumNetworkInstrumentation.stopResource(httpRequestInfo, httpResponseInfo, map);
    }

    public final void stopResource(final com.datadog.android.api.instrumentation.network.HttpRequestInfo requestInfo, final com.datadog.android.api.instrumentation.network.HttpResponseInfo responseInfo, final java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1<com.datadog.android.api.feature.FeatureSdkCore, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.net.RumNetworkInstrumentation$stopResource$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                getHighResolutionOutputSizeshNQ4ISI(featureSdkCore);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
                com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor access$getNetworkMonitor = com.datadog.android.rum.internal.net.RumNetworkInstrumentation.Companion.access$getNetworkMonitor(com.datadog.android.rum.internal.net.RumNetworkInstrumentation.INSTANCE, featureSdkCore);
                if (access$getNetworkMonitor != null) {
                    com.datadog.android.rum.resource.ResourceId buildResourceId = com.datadog.android.rum.internal.net.RumNetworkInstrumentation.INSTANCE.buildResourceId(com.datadog.android.api.instrumentation.network.HttpRequestInfo.this, false);
                    int statusCode = responseInfo.getStatusCode();
                    access$getNetworkMonitor.stopResource(buildResourceId, java.lang.Integer.valueOf(statusCode), com.datadog.android.rum.internal.net.RumNetworkInstrumentation.Companion.access$getBodyLength(com.datadog.android.rum.internal.net.RumNetworkInstrumentation.INSTANCE, responseInfo), com.datadog.android.rum.internal.net.RumNetworkInstrumentation.Companion.access$getRumResourceKind(com.datadog.android.rum.internal.net.RumNetworkInstrumentation.INSTANCE, responseInfo), kotlin.collections.MapsKt.plus(attributes, this.getRumResourceAttributesProvider().onProvideAttributes(com.datadog.android.api.instrumentation.network.HttpRequestInfo.this, responseInfo, (java.lang.Throwable) null)));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    public final void stopResourceWithError(final com.datadog.android.api.instrumentation.network.HttpRequestInfo requestInfo, final java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1<com.datadog.android.api.feature.FeatureSdkCore, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.net.RumNetworkInstrumentation$stopResourceWithError$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                getHighSpeedVideoSizes(featureSdkCore);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
                com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor access$getNetworkMonitor = com.datadog.android.rum.internal.net.RumNetworkInstrumentation.Companion.access$getNetworkMonitor(com.datadog.android.rum.internal.net.RumNetworkInstrumentation.INSTANCE, featureSdkCore);
                if (access$getNetworkMonitor != null) {
                    com.datadog.android.rum.resource.ResourceId buildResourceId = com.datadog.android.rum.internal.net.RumNetworkInstrumentation.INSTANCE.buildResourceId(com.datadog.android.api.instrumentation.network.HttpRequestInfo.this, false);
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.rum.internal.net.RumNetworkInstrumentation.ERROR_MSG_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{this.getNetworkInstrumentationName(), com.datadog.android.api.instrumentation.network.HttpRequestInfo.this.getMethod(), com.datadog.android.api.instrumentation.network.HttpRequestInfo.this.getUrl()}, 3));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    access$getNetworkMonitor.stopResourceWithError(buildResourceId, (java.lang.Integer) null, format, com.datadog.android.rum.RumErrorSource.NETWORK, throwable, (java.util.Map<java.lang.String, ? extends java.lang.Object>) this.getRumResourceAttributesProvider().onProvideAttributes(com.datadog.android.api.instrumentation.network.HttpRequestInfo.this, (com.datadog.android.api.instrumentation.network.HttpResponseInfo) null, throwable));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    public final void reportInstrumentationError(final kotlin.jvm.functions.Function0<java.lang.String> message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1<com.datadog.android.api.feature.FeatureSdkCore, kotlin.Unit>() { // from class: com.datadog.android.rum.internal.net.RumNetworkInstrumentation$reportInstrumentationError$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                getHighSpeedVideoFpsRangesFor(featureSdkCore);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
                com.datadog.android.api.InternalLogger internalLogger = featureSdkCore.getInternalLogger();
                com.datadog.android.api.InternalLogger.Level level = com.datadog.android.api.InternalLogger.Level.WARN;
                com.datadog.android.api.InternalLogger.Target target = com.datadog.android.api.InternalLogger.Target.MAINTAINER;
                final kotlin.jvm.functions.Function0<java.lang.String> function0 = message;
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, level, target, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.net.RumNetworkInstrumentation$reportInstrumentationError$1.1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Unable to instrument RUM resource: ".concat(java.lang.String.valueOf(function0.invoke()));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    private final void Camera2StreamConfigurationMap(kotlin.jvm.functions.Function1<? super com.datadog.android.api.feature.FeatureSdkCore, kotlin.Unit> p0) {
        final java.lang.String concat;
        com.datadog.android.api.InternalLogger unbound;
        com.datadog.android.api.SdkCore sdkCore = this.sdkCoreReference.get();
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = sdkCore instanceof com.datadog.android.api.feature.FeatureSdkCore ? (com.datadog.android.api.feature.FeatureSdkCore) sdkCore : null;
        if ((featureSdkCore != null ? featureSdkCore.getFeature("rum") : null) != null) {
            p0.invoke(featureSdkCore);
            return;
        }
        java.lang.String str = this.sdkInstanceName;
        if (str == null) {
            concat = "Default SDK instance";
        } else {
            concat = "SDK instance with name=".concat(java.lang.String.valueOf(str));
        }
        if (featureSdkCore == null || (unbound = featureSdkCore.getInternalLogger()) == null) {
            unbound = com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND();
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(unbound, com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.net.RumNetworkInstrumentation$ifRumEnabled$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.rum.internal.net.RumNetworkInstrumentation.WARN_RUM_DISABLED, java.util.Arrays.copyOf(new java.lang.Object[]{com.datadog.android.rum.internal.net.RumNetworkInstrumentation.this.getNetworkInstrumentationName(), concat}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                return format;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\r"}, d2 = {"Lcom/datadog/android/rum/internal/net/RumNetworkInstrumentation$Companion;", "", "<init>", "()V", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;", "request", "", "generateUuid", "Lcom/datadog/android/rum/resource/ResourceId;", "buildResourceId", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;Z)Lcom/datadog/android/rum/resource/ResourceId;", "", "ERROR_MSG_FORMAT", "Ljava/lang/String;", "UNSUPPORTED_HTTP_METHOD", "WARN_RUM_DISABLED"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.rum.resource.ResourceId buildResourceId(com.datadog.android.api.instrumentation.network.HttpRequestInfo request, boolean generateUuid) {
            java.lang.String obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            java.util.UUID uuid = (java.util.UUID) com.datadog.android.api.instrumentation.network.ExtendedRequestInfoKt.tag(request, java.util.UUID.class);
            if (uuid == null) {
                uuid = generateUuid ? java.util.UUID.randomUUID() : null;
            }
            java.lang.String method = request.getMethod();
            java.lang.String url = request.getUrl();
            java.lang.Long contentLength = request.contentLength();
            long longValue = contentLength != null ? contentLength.longValue() : 0L;
            java.lang.String contentType = request.getContentType();
            if (contentType != null || longValue != 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(method);
                sb.append("•");
                sb.append(url);
                sb.append("•");
                sb.append(longValue);
                sb.append("•");
                sb.append(contentType);
                obj = sb.toString();
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(method);
                sb2.append("•");
                sb2.append(url);
                obj = sb2.toString();
            }
            return new com.datadog.android.rum.resource.ResourceId(obj, uuid != null ? uuid.toString() : null);
        }

        public static final /* synthetic */ java.lang.Long access$getBodyLength(com.datadog.android.rum.internal.net.RumNetworkInstrumentation.Companion companion, com.datadog.android.api.instrumentation.network.HttpResponseInfo httpResponseInfo) {
            boolean isStream = com.datadog.android.internal.network.HttpSpec.ContentType.INSTANCE.isStream(httpResponseInfo.getContentType());
            java.util.List<java.lang.String> list = httpResponseInfo.getHeaders().get("Sec-WebSocket-Accept");
            boolean z = list == null || list.isEmpty();
            if (isStream || !z) {
                return null;
            }
            return httpResponseInfo.getContentLength();
        }

        public static final /* synthetic */ com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor access$getNetworkMonitor(com.datadog.android.rum.internal.net.RumNetworkInstrumentation.Companion companion, com.datadog.android.api.SdkCore sdkCore) {
            com.datadog.android.rum.RumMonitor rumMonitor = com.datadog.android.rum.GlobalRumMonitor.get(sdkCore);
            if (rumMonitor instanceof com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor) {
                return (com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor) rumMonitor;
            }
            return null;
        }

        public static final /* synthetic */ com.datadog.android.rum.RumResourceKind access$getRumResourceKind(com.datadog.android.rum.internal.net.RumNetworkInstrumentation.Companion companion, com.datadog.android.api.instrumentation.network.HttpResponseInfo httpResponseInfo) {
            java.lang.String contentType = httpResponseInfo.getContentType();
            if (contentType == null) {
                return com.datadog.android.rum.RumResourceKind.NATIVE;
            }
            return com.datadog.android.rum.RumResourceKind.INSTANCE.fromMimeType(contentType);
        }

        public static final /* synthetic */ com.datadog.android.rum.RumResourceMethod access$toRumResourceMethod(com.datadog.android.rum.internal.net.RumNetworkInstrumentation.Companion companion, final com.datadog.android.api.instrumentation.network.HttpRequestInfo httpRequestInfo, final java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
            java.lang.String method = httpRequestInfo.getMethod();
            java.util.Locale locale = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = method.toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        return com.datadog.android.rum.RumResourceMethod.OPTIONS;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        return com.datadog.android.rum.RumResourceMethod.GET;
                    }
                    break;
                case 79599:
                    if (upperCase.equals(com.datadog.android.internal.network.HttpSpec.Method.PUT)) {
                        return com.datadog.android.rum.RumResourceMethod.PUT;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals(com.datadog.android.internal.network.HttpSpec.Method.HEAD)) {
                        return com.datadog.android.rum.RumResourceMethod.HEAD;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        return com.datadog.android.rum.RumResourceMethod.POST;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        return com.datadog.android.rum.RumResourceMethod.PATCH;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals(com.datadog.android.internal.network.HttpSpec.Method.TRACE)) {
                        return com.datadog.android.rum.RumResourceMethod.TRACE;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals(com.datadog.android.internal.network.HttpSpec.Method.CONNECT)) {
                        return com.datadog.android.rum.RumResourceMethod.CONNECT;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals(com.datadog.android.internal.network.HttpSpec.Method.DELETE)) {
                        return com.datadog.android.rum.RumResourceMethod.DELETE;
                    }
                    break;
            }
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.net.RumNetworkInstrumentation$Companion$toRumResourceMethod$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.rum.internal.net.RumNetworkInstrumentation.UNSUPPORTED_HTTP_METHOD, java.util.Arrays.copyOf(new java.lang.Object[]{com.datadog.android.api.instrumentation.network.HttpRequestInfo.this.getMethod(), str}, 2));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                    return format;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return com.datadog.android.rum.RumResourceMethod.GET;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
