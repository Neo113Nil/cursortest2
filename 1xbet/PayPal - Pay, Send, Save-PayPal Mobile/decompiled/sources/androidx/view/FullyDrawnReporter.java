package androidx.view;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\nJ\u001b\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0016\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0011\u0010 \u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b \u0010!R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Landroidx/activity/FullyDrawnReporter;", "", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "", "reportFullyDrawn", "<init>", "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)V", "addReporter", "()V", "removeReporter", com.sun.jna.Callback.METHOD_NAME, "addOnReportDrawnListener", "(Lkotlin/jvm/functions/Function0;)V", "removeOnReportDrawnListener", "fullyDrawnReported", "getHighSpeedVideoSizes", "Ljava/util/concurrent/Executor;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "", "getInputFormats", com.visa.cbp.getEncExpo.warmup, "", "Z", "Camera2StreamConfigurationMap", "getInputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "isFullyDrawnReported", "()Z", "", "Ljava/util/List;", "Ljava/lang/Runnable;", "getOutputMinFrameDuration", "Ljava/lang/Runnable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FullyDrawnReporter {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> getInputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor;
    private final java.lang.Runnable getOutputMinFrameDuration;

    public FullyDrawnReporter(java.util.concurrent.Executor executor, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighResolutionOutputSizeshNQ4ISI = executor;
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.getHighSpeedVideoSizes = new java.lang.Object();
        this.getInputSizeshNQ4ISI = new java.util.ArrayList();
        this.getOutputMinFrameDuration = new java.lang.Runnable() { // from class: androidx.activity.FullyDrawnReporter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.view.FullyDrawnReporter.$r8$lambda$TKFtFHklx2CcDV3Ota5gM1TFI_Y(androidx.view.FullyDrawnReporter.this);
            }
        };
    }

    public final boolean isFullyDrawnReported() {
        boolean z;
        synchronized (this.getHighSpeedVideoSizes) {
            z = this.getHighSpeedVideoSizesFor;
        }
        return z;
    }

    public final void addReporter() {
        synchronized (this.getHighSpeedVideoSizes) {
            if (!this.getHighSpeedVideoSizesFor) {
                this.getHighSpeedVideoFpsRanges++;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void removeReporter() {
        int i;
        synchronized (this.getHighSpeedVideoSizes) {
            if (!this.getHighSpeedVideoSizesFor && (i = this.getHighSpeedVideoFpsRanges) > 0) {
                int i2 = i - 1;
                this.getHighSpeedVideoFpsRanges = i2;
                if (!this.Camera2StreamConfigurationMap && i2 == 0) {
                    this.Camera2StreamConfigurationMap = true;
                    this.getHighResolutionOutputSizeshNQ4ISI.execute(this.getOutputMinFrameDuration);
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void addOnReportDrawnListener(kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        synchronized (this.getHighSpeedVideoSizes) {
            if (this.getHighSpeedVideoSizesFor) {
                z = true;
            } else {
                this.getInputSizeshNQ4ISI.add(callback);
                z = false;
            }
        }
        if (z) {
            callback.invoke();
        }
    }

    public final void removeOnReportDrawnListener(kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        synchronized (this.getHighSpeedVideoSizes) {
            this.getInputSizeshNQ4ISI.remove(callback);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void fullyDrawnReported() {
        synchronized (this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoSizesFor = true;
            java.util.Iterator<T> it = this.getInputSizeshNQ4ISI.iterator();
            while (it.hasNext()) {
                ((kotlin.jvm.functions.Function0) it.next()).invoke();
            }
            this.getInputSizeshNQ4ISI.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void $r8$lambda$TKFtFHklx2CcDV3Ota5gM1TFI_Y(androidx.view.FullyDrawnReporter fullyDrawnReporter) {
        synchronized (fullyDrawnReporter.getHighSpeedVideoSizes) {
            fullyDrawnReporter.Camera2StreamConfigurationMap = false;
            if (fullyDrawnReporter.getHighSpeedVideoFpsRanges == 0 && !fullyDrawnReporter.getHighSpeedVideoSizesFor) {
                fullyDrawnReporter.getHighSpeedVideoFpsRangesFor.invoke();
                fullyDrawnReporter.fullyDrawnReported();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
