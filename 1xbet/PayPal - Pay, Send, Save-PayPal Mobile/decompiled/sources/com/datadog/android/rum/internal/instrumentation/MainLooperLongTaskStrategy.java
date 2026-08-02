package com.datadog.android.rum.internal.instrumentation;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0002()B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b&\u0010'R\u0014\u0010#\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\""}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/MainLooperLongTaskStrategy;", "Landroid/util/Printer;", "Lcom/datadog/android/rum/tracking/TrackingStrategy;", "", "thresholdMs", "<init>", "(J)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "x", "", "println", "(Ljava/lang/String;)V", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Landroid/content/Context;", "context", "register", "(Lcom/datadog/android/api/SdkCore;Landroid/content/Context;)V", "toString", "()Ljava/lang/String;", "unregister", "(Landroid/content/Context;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/SdkCore;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "J", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getThresholdMs$dd_sdk_android_rum_release", "()J", "Companion", "CompositePrinter"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MainLooperLongTaskStrategy implements android.util.Printer, com.datadog.android.rum.tracking.TrackingStrategy {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String Camera2StreamConfigurationMap = "";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private com.datadog.android.api.SdkCore getHighSpeedVideoFpsRanges;
    private long getHighSpeedVideoSizes;
    private final long thresholdMs;

    public MainLooperLongTaskStrategy(long j) {
        this.thresholdMs = j;
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j);
    }

    /* renamed from: getThresholdMs$dd_sdk_android_rum_release, reason: from getter */
    public final long getThresholdMs() {
        return this.thresholdMs;
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public final void register(com.datadog.android.api.SdkCore sdkCore, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRanges = sdkCore;
        if (com.datadog.android.rum.internal.instrumentation.MainLooperLongTaskStrategy.CompositePrinter.INSTANCE.isRegistered().compareAndSet(false, true)) {
            android.os.Looper.getMainLooper().setMessageLogging(com.datadog.android.rum.internal.instrumentation.MainLooperLongTaskStrategy.CompositePrinter.INSTANCE);
        }
        com.datadog.android.rum.internal.instrumentation.MainLooperLongTaskStrategy.CompositePrinter.INSTANCE.getRegisteredPrinters().add(this);
    }

    @Override // com.datadog.android.rum.tracking.TrackingStrategy
    public final void unregister(android.content.Context context) {
        com.datadog.android.rum.internal.instrumentation.MainLooperLongTaskStrategy.CompositePrinter.INSTANCE.getRegisteredPrinters().remove(this);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        return this.thresholdMs == ((com.datadog.android.rum.internal.instrumentation.MainLooperLongTaskStrategy) other).thresholdMs;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.thresholdMs);
    }

    public final java.lang.String toString() {
        long j = this.thresholdMs;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MainLooperLongTaskStrategy(");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/MainLooperLongTaskStrategy$CompositePrinter;", "Landroid/util/Printer;", "<init>", "()V", "", "x", "", "println", "(Ljava/lang/String;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRegistered", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "registeredPrinters", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getRegisteredPrinters", "()Ljava/util/concurrent/CopyOnWriteArraySet;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class CompositePrinter implements android.util.Printer {
        public static final com.datadog.android.rum.internal.instrumentation.MainLooperLongTaskStrategy.CompositePrinter INSTANCE = new com.datadog.android.rum.internal.instrumentation.MainLooperLongTaskStrategy.CompositePrinter();
        private static final java.util.concurrent.atomic.AtomicBoolean isRegistered = new java.util.concurrent.atomic.AtomicBoolean(false);
        private static final java.util.concurrent.CopyOnWriteArraySet<android.util.Printer> registeredPrinters = new java.util.concurrent.CopyOnWriteArraySet<>();

        private CompositePrinter() {
        }

        public final java.util.concurrent.atomic.AtomicBoolean isRegistered() {
            return isRegistered;
        }

        public final java.util.concurrent.CopyOnWriteArraySet<android.util.Printer> getRegisteredPrinters() {
            return registeredPrinters;
        }

        @Override // android.util.Printer
        public final void println(java.lang.String x) {
            java.util.Iterator<T> it = registeredPrinters.iterator();
            while (it.hasNext()) {
                ((android.util.Printer) it.next()).println(x);
            }
        }
    }

    @Override // android.util.Printer
    public final void println(java.lang.String x) {
        com.datadog.android.api.SdkCore sdkCore;
        if (x != null) {
            com.datadog.android.api.SdkCore sdkCore2 = this.getHighSpeedVideoFpsRanges;
            if (sdkCore2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                sdkCore2 = null;
            }
            long deviceElapsedTimeNanos = ((com.datadog.android.api.feature.FeatureSdkCore) sdkCore2).getTimeProvider().getDeviceElapsedTimeNanos();
            if (kotlin.text.StringsKt.startsWith$default(x, ">>>>> Dispatching to ", false, 2, (java.lang.Object) null)) {
                java.lang.String substring = x.substring(21);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                this.Camera2StreamConfigurationMap = substring;
                this.getHighSpeedVideoSizes = deviceElapsedTimeNanos;
                return;
            }
            if (kotlin.text.StringsKt.startsWith$default(x, "<<<<< Finished to ", false, 2, (java.lang.Object) null)) {
                long j = deviceElapsedTimeNanos - this.getHighSpeedVideoSizes;
                if (j <= this.getHighResolutionOutputSizeshNQ4ISI || (sdkCore = this.getHighSpeedVideoFpsRanges) == null) {
                    return;
                }
                if (sdkCore == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    sdkCore = null;
                }
                com.datadog.android.rum.RumMonitor rumMonitor = com.datadog.android.rum.GlobalRumMonitor.get(sdkCore);
                com.datadog.android.rum.internal.monitor.AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof com.datadog.android.rum.internal.monitor.AdvancedRumMonitor ? (com.datadog.android.rum.internal.monitor.AdvancedRumMonitor) rumMonitor : null;
                if (advancedRumMonitor != null) {
                    advancedRumMonitor.addLongTask(j, this.Camera2StreamConfigurationMap);
                }
            }
        }
    }
}
