package com.datadog.android.rum.internal.metric.networksettled;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 32\u00020\u0001:\u00013B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010$\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010)R$\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u00110*j\b\u0012\u0004\u0012\u00020\u0011`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010,\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010)R\u0016\u0010/\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102"}, d2 = {"Lcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver;", "", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "initialResourceIdentifier", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;Lcom/datadog/android/api/InternalLogger;)V", "", "getResourceStartedCacheSize", "()I", "Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsState;", "getState", "()Lcom/datadog/android/rum/internal/metric/ViewInitializationMetricsState;", "", "resolveMetric", "()Ljava/lang/Long;", "", "resourceId", "", "resourceWasDropped", "(Ljava/lang/String;)V", "Lcom/datadog/android/rum/internal/metric/networksettled/InternalResourceContext;", "context", "resourceWasStarted", "(Lcom/datadog/android/rum/internal/metric/networksettled/InternalResourceContext;)V", "resourceWasStopped", "eventTimestampInNanos", "viewWasCreated", "(J)V", "viewWasStopped", "()V", "Lcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver$Companion$Diagnostic;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver$Companion$Diagnostic;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "Lcom/datadog/android/api/InternalLogger;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Long;", "Ljava/util/HashSet;", "Lkotlin/collections/getHighSpeedVideoSizesFor;", "getInputFormats", "Ljava/util/HashSet;", "getInputSizeshNQ4ISI", "getOutputFormats", "", "getHighSpeedVideoSizesFor", "Z", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkSettledMetricResolver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver.Companion INSTANCE = new com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private volatile com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver.Companion.Diagnostic getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private volatile java.lang.Long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier Camera2StreamConfigurationMap;
    private volatile java.lang.Long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private volatile boolean getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.util.HashSet<java.lang.String> getInputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private volatile java.lang.Long getInputFormats;

    public NetworkSettledMetricResolver(com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier initialResourceIdentifier, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialResourceIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.Camera2StreamConfigurationMap = initialResourceIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
        this.getInputSizeshNQ4ISI = new java.util.HashSet<>();
        this.getHighSpeedVideoSizes = new com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver.Companion.Diagnostic(null, null, null, null, 15, null);
    }

    public /* synthetic */ NetworkSettledMetricResolver(com.datadog.android.rum.metric.networksettled.TimeBasedInitialResourceIdentifier timeBasedInitialResourceIdentifier, com.datadog.android.api.InternalLogger internalLogger, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.datadog.android.rum.metric.networksettled.TimeBasedInitialResourceIdentifier(0L, 1, null) : timeBasedInitialResourceIdentifier, internalLogger);
    }

    public final void viewWasCreated(long eventTimestampInNanos) {
        this.getInputFormats = java.lang.Long.valueOf(eventTimestampInNanos);
        this.getHighSpeedVideoSizes = new com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver.Companion.Diagnostic(null, null, null, null, 15, null);
    }

    public final void resourceWasStarted(com.datadog.android.rum.internal.metric.networksettled.InternalResourceContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (this.getOutputFormats) {
            return;
        }
        this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.incrementAndGet();
        if (this.Camera2StreamConfigurationMap.validate(new com.datadog.android.rum.metric.networksettled.NetworkSettledResourceContext(context.getResourceId$dd_sdk_android_rum_release(), context.getEventCreatedAtNanos$dd_sdk_android_rum_release(), this.getInputFormats))) {
            this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI.incrementAndGet();
            this.getInputSizeshNQ4ISI.add(context.getResourceId$dd_sdk_android_rum_release());
        }
    }

    public final void resourceWasStopped(com.datadog.android.rum.internal.metric.networksettled.InternalResourceContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (this.getOutputFormats) {
            return;
        }
        java.lang.Long l = this.getInputFormats;
        java.lang.Long l2 = this.getHighSpeedVideoFpsRanges;
        long longValue = l2 != null ? l2.longValue() : 0L;
        boolean remove = this.getInputSizeshNQ4ISI.remove(context.getResourceId$dd_sdk_android_rum_release());
        if (l == null || !remove) {
            return;
        }
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.incrementAndGet();
        long eventCreatedAtNanos$dd_sdk_android_rum_release = context.getEventCreatedAtNanos$dd_sdk_android_rum_release() - l.longValue();
        if (eventCreatedAtNanos$dd_sdk_android_rum_release > longValue) {
            this.getHighSpeedVideoFpsRanges = java.lang.Long.valueOf(eventCreatedAtNanos$dd_sdk_android_rum_release);
        }
    }

    public final void resourceWasDropped(java.lang.String resourceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceId, "");
        if (this.getOutputFormats) {
            return;
        }
        this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.incrementAndGet();
        this.getInputSizeshNQ4ISI.remove(resourceId);
    }

    public final void viewWasStopped() {
        this.getOutputFormats = true;
        this.getInputSizeshNQ4ISI.clear();
    }

    public final java.lang.Long resolveMetric() {
        if (this.getOutputFormats) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        java.lang.Long l = null;
        if (this.getInputFormats == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.DEBUG, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver$computeMetric$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "[ViewNetworkSettledMetric] There was no view created yet for this resource";
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        } else if (this.getInputSizeshNQ4ISI.size() > 0) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.DEBUG, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver$computeMetric$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "[ViewNetworkSettledMetric] Not all the initial resources were stopped for this view";
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        } else {
            l = this.getHighSpeedVideoFpsRanges;
        }
        this.getHighSpeedVideoFpsRangesFor = l;
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final com.datadog.android.rum.internal.metric.ViewInitializationMetricsState getState() {
        com.datadog.android.rum.internal.metric.NoValueReason.TimeToNetworkSettle timeToNetworkSettle;
        java.lang.Long resolveMetric = resolveMetric();
        com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig access$toConfig = com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver.Companion.access$toConfig(INSTANCE, this.Camera2StreamConfigurationMap);
        if (resolveMetric == null) {
            com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver.Companion.Diagnostic diagnostic = this.getHighSpeedVideoSizes;
            int i = diagnostic.getHighSpeedVideoSizes.get();
            int i2 = diagnostic.getHighResolutionOutputSizeshNQ4ISI.get();
            int i3 = diagnostic.Camera2StreamConfigurationMap.get();
            int i4 = diagnostic.getHighSpeedVideoFpsRangesFor.get();
            if (i == 0) {
                timeToNetworkSettle = com.datadog.android.rum.internal.metric.NoValueReason.TimeToNetworkSettle.NO_RESOURCES;
            } else if (i2 == 0) {
                timeToNetworkSettle = com.datadog.android.rum.internal.metric.NoValueReason.TimeToNetworkSettle.NO_INITIAL_RESOURCES;
            } else if (i2 > i3 + i4) {
                timeToNetworkSettle = com.datadog.android.rum.internal.metric.NoValueReason.TimeToNetworkSettle.NOT_SETTLED_YET;
            } else {
                timeToNetworkSettle = com.datadog.android.rum.internal.metric.NoValueReason.TimeToNetworkSettle.UNKNOWN;
            }
        } else {
            timeToNetworkSettle = null;
        }
        return new com.datadog.android.rum.internal.metric.ViewInitializationMetricsState(resolveMetric, access$toConfig, timeToNetworkSettle);
    }

    public final int getResourceStartedCacheSize() {
        return this.getInputSizeshNQ4ISI.size();
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver$Companion;", "", "<init>", "()V", "Diagnostic"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0011\u0010\t\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0011\u0010\r\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u000e\u0010\n"}, d2 = {"Lcom/datadog/android/rum/internal/metric/networksettled/NetworkSettledMetricResolver$Companion$Diagnostic;", "", "Ljava/util/concurrent/atomic/AtomicInteger;", "p0", "p1", "p2", "p3", "<init>", "(Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;)V", "getHighSpeedVideoSizes", "Ljava/util/concurrent/atomic/AtomicInteger;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
        static final class Diagnostic {
            final java.util.concurrent.atomic.AtomicInteger getHighResolutionOutputSizeshNQ4ISI;

            /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
            final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRangesFor;

            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
            final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoSizes;

            /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
            final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap;

            private Diagnostic(java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.concurrent.atomic.AtomicInteger atomicInteger2, java.util.concurrent.atomic.AtomicInteger atomicInteger3, java.util.concurrent.atomic.AtomicInteger atomicInteger4) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicInteger, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicInteger2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicInteger3, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicInteger4, "");
                this.getHighSpeedVideoSizes = atomicInteger;
                this.getHighResolutionOutputSizeshNQ4ISI = atomicInteger2;
                this.getHighSpeedVideoFpsRangesFor = atomicInteger3;
                this.Camera2StreamConfigurationMap = atomicInteger4;
            }

            public /* synthetic */ Diagnostic(java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.concurrent.atomic.AtomicInteger atomicInteger2, java.util.concurrent.atomic.AtomicInteger atomicInteger3, java.util.concurrent.atomic.AtomicInteger atomicInteger4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new java.util.concurrent.atomic.AtomicInteger(0) : atomicInteger, (i & 2) != 0 ? new java.util.concurrent.atomic.AtomicInteger(0) : atomicInteger2, (i & 4) != 0 ? new java.util.concurrent.atomic.AtomicInteger(0) : atomicInteger3, (i & 8) != 0 ? new java.util.concurrent.atomic.AtomicInteger(0) : atomicInteger4);
            }

            public Diagnostic() {
                this(null, null, null, null, 15, null);
            }
        }

        public static final /* synthetic */ com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig access$toConfig(com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver.Companion companion, com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier initialResourceIdentifier) {
            if (!(initialResourceIdentifier instanceof com.datadog.android.rum.metric.networksettled.TimeBasedInitialResourceIdentifier)) {
                return com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig.CUSTOM;
            }
            if (((com.datadog.android.rum.metric.networksettled.TimeBasedInitialResourceIdentifier) initialResourceIdentifier).defaultThresholdUsed$dd_sdk_android_rum_release()) {
                return com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig.TIME_BASED_DEFAULT;
            }
            return com.datadog.android.rum.internal.metric.ViewInitializationMetricsConfig.TIME_BASED_CUSTOM;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
