package com.datadog.android.core.internal.thread;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB]\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00120\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J)\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b \u0010&J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010\u001bR\u0016\u0010)\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u001a\u0010\u0010\u001a\u00020\u000e8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010-R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010*R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00120\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00102\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105"}, d2 = {"Lcom/datadog/android/core/internal/thread/BackPressuredBlockingQueue;", "", "E", "Lcom/datadog/android/core/internal/thread/ObservableLinkedBlockingQueue;", "Lcom/datadog/android/api/InternalLogger;", "logger", "", "executorContext", "Lcom/datadog/android/core/configuration/BackPressureStrategy;", "backPressureStrategy", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "<init>", "(Lcom/datadog/android/api/InternalLogger;Ljava/lang/String;Lcom/datadog/android/core/configuration/BackPressureStrategy;Lcom/datadog/android/internal/time/TimeProvider;)V", "", "notifyThreshold", "capacity", "Lkotlin/Function0;", "", "onThresholdReached", "Lkotlin/Function1;", "onItemDropped", "Lcom/datadog/android/core/configuration/BackPressureMitigation;", "backpressureMitigation", "(Lcom/datadog/android/api/InternalLogger;Ljava/lang/String;IILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/core/configuration/BackPressureMitigation;Lcom/datadog/android/internal/time/TimeProvider;)V", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/Object;)V", "Camera2StreamConfigurationMap", "()V", "e", "", "offer", "(Ljava/lang/Object;)Z", "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Ljava/util/concurrent/TimeUnit;", "unit", "(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z", "put", "Lcom/datadog/android/core/configuration/BackPressureMitigation;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getCapacity$dd_sdk_android_core_release", "()I", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getOutputFormats", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoSizesFor", "Lcom/datadog/android/internal/time/TimeProvider;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BackPressuredBlockingQueue<E> extends com.datadog.android.core.internal.thread.ObservableLinkedBlockingQueue<E> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;
    private final int capacity;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.core.configuration.BackPressureMitigation getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.datadog.android.internal.time.TimeProvider getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizesFor;

    /* renamed from: getCapacity$dd_sdk_android_core_release, reason: from getter */
    public final int getCapacity() {
        return this.capacity;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackPressuredBlockingQueue(com.datadog.android.api.InternalLogger internalLogger, java.lang.String str, com.datadog.android.core.configuration.BackPressureStrategy backPressureStrategy, com.datadog.android.internal.time.TimeProvider timeProvider) {
        this(internalLogger, str, backPressureStrategy.getCapacity(), backPressureStrategy.getCapacity(), backPressureStrategy.getOnThresholdReached(), backPressureStrategy.getOnItemDropped(), backPressureStrategy.getBackpressureMitigation(), timeProvider);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backPressureStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackPressuredBlockingQueue(com.datadog.android.api.InternalLogger internalLogger, java.lang.String str, int i, int i2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1, com.datadog.android.core.configuration.BackPressureMitigation backPressureMitigation, com.datadog.android.internal.time.TimeProvider timeProvider) {
        super(i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        this.getHighSpeedVideoSizes = internalLogger;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.capacity = i2;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizesFor = function0;
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoFpsRangesFor = backPressureMitigation;
        this.getOutputFormats = timeProvider;
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public final boolean offer(E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
        kotlin.jvm.functions.Function1<E, java.lang.Boolean> function1 = new kotlin.jvm.functions.Function1<E, java.lang.Boolean>(this) { // from class: com.datadog.android.core.internal.thread.BackPressuredBlockingQueue$offer$1
            final /* synthetic */ com.datadog.android.core.internal.thread.BackPressuredBlockingQueue<E> getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(E e2) {
                boolean offer;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e2, "");
                offer = super/*com.datadog.android.core.internal.thread.ObservableLinkedBlockingQueue*/.offer(e2);
                return java.lang.Boolean.valueOf(offer);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.getHighSpeedVideoFpsRanges = this;
            }
        };
        if (remainingCapacity() == 0) {
            com.datadog.android.core.configuration.BackPressureMitigation backPressureMitigation = this.getHighSpeedVideoFpsRangesFor;
            int i = backPressureMitigation == null ? -1 : com.datadog.android.core.internal.thread.BackPressuredBlockingQueue.WhenMappings.$EnumSwitchMapping$0[backPressureMitigation.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    E take = take();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(take, "");
                    getHighResolutionOutputSizeshNQ4ISI(take);
                } else if (i != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            getHighResolutionOutputSizeshNQ4ISI(e);
            return true;
        }
        if (size() + 1 == this.getHighSpeedVideoFpsRanges) {
            Camera2StreamConfigurationMap();
        }
        return function1.invoke(e).booleanValue();
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.concurrent.BlockingQueue
    public final boolean offer(E e, long timeout, java.util.concurrent.TimeUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
        if (!super.offer(e, timeout, unit)) {
            return offer(e);
        }
        if (size() != this.getHighSpeedVideoFpsRanges) {
            return true;
        }
        Camera2StreamConfigurationMap();
        return true;
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.concurrent.BlockingQueue
    public final void put(E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
        if (size() + 1 == this.getHighSpeedVideoFpsRanges) {
            Camera2StreamConfigurationMap();
        }
        super.put(e);
    }

    private final void Camera2StreamConfigurationMap() {
        java.util.Map<java.lang.String, java.lang.Integer> dumpQueue = dumpQueue(this.getOutputFormats.getDeviceTimestampMillis());
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("capacity", java.lang.Integer.valueOf(this.capacity));
        if (dumpQueue != null && !dumpQueue.isEmpty()) {
            createMapBuilder.put("dump", dumpQueue);
        }
        java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
        this.getHighSpeedVideoSizesFor.invoke();
        this.getHighSpeedVideoSizes.log(com.datadog.android.api.InternalLogger.Level.WARN, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), new kotlin.jvm.functions.Function0<java.lang.String>(this) { // from class: com.datadog.android.core.internal.thread.BackPressuredBlockingQueue$notifyThresholdReached$1
            final /* synthetic */ com.datadog.android.core.internal.thread.BackPressuredBlockingQueue<E> getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                int i;
                i = ((com.datadog.android.core.internal.thread.BackPressuredBlockingQueue) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRanges;
                return "BackPressuredBlockingQueue reached capacity:".concat(java.lang.String.valueOf(i));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.getHighSpeedVideoFpsRanges = this;
            }
        }, (java.lang.Throwable) null, false, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("backpressure", build), kotlin.TuplesKt.to("executor.context", this.getHighResolutionOutputSizeshNQ4ISI)));
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(E p0) {
        final java.lang.String obj;
        this.Camera2StreamConfigurationMap.invoke(p0);
        com.datadog.android.internal.thread.NamedExecutionUnit namedExecutionUnit = p0 instanceof com.datadog.android.internal.thread.NamedExecutionUnit ? (com.datadog.android.internal.thread.NamedExecutionUnit) p0 : null;
        if (namedExecutionUnit == null || (obj = namedExecutionUnit.getName()) == null) {
            obj = p0.toString();
        }
        this.getHighSpeedVideoSizes.log(com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.thread.BackPressuredBlockingQueue$notifyItemDropped$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return "Dropped item in BackPressuredBlockingQueue queue: ".concat(java.lang.String.valueOf(obj));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, (java.lang.Throwable) null, false, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("backpressure.capacity", java.lang.Integer.valueOf(this.capacity)), kotlin.TuplesKt.to("executor.context", this.getHighResolutionOutputSizeshNQ4ISI)));
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.datadog.android.core.configuration.BackPressureMitigation.values().length];
            try {
                iArr[com.datadog.android.core.configuration.BackPressureMitigation.DROP_OLDEST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.datadog.android.core.configuration.BackPressureMitigation.IGNORE_NEWEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
