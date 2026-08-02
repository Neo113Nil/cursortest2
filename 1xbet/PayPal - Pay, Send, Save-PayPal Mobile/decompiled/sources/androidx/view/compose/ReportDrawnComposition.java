package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\u0004\u0012\u00020\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015"}, d2 = {"Landroidx/activity/compose/ReportDrawnComposition;", "Lkotlin/Function0;", "", "Landroidx/activity/FullyDrawnReporter;", "p0", "", "p1", "<init>", "(Landroidx/activity/FullyDrawnReporter;Lkotlin/jvm/functions/Function0;)V", "getHighResolutionOutputSizeshNQ4ISI", "()V", "getHighSpeedVideoFpsRangesFor", "(Lkotlin/jvm/functions/Function0;)V", "getHighSpeedVideoSizes", "Landroidx/activity/FullyDrawnReporter;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ReportDrawnComposition implements kotlin.jvm.functions.Function0<kotlin.Unit> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.snapshots.SnapshotStateObserver getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<java.lang.Boolean>, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.view.FullyDrawnReporter Camera2StreamConfigurationMap;

    public ReportDrawnComposition(androidx.view.FullyDrawnReporter fullyDrawnReporter, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        this.Camera2StreamConfigurationMap = fullyDrawnReporter;
        this.getHighSpeedVideoSizes = function0;
        androidx.compose.runtime.snapshots.SnapshotStateObserver snapshotStateObserver = new androidx.compose.runtime.snapshots.SnapshotStateObserver(new kotlin.jvm.functions.Function1() { // from class: androidx.activity.compose.ReportDrawnComposition$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.compose.ReportDrawnComposition.getHighSpeedVideoSizes((kotlin.jvm.functions.Function0) obj);
            }
        });
        snapshotStateObserver.start();
        this.getHighResolutionOutputSizeshNQ4ISI = snapshotStateObserver;
        this.getHighSpeedVideoFpsRangesFor = new androidx.view.compose.ReportDrawnComposition$checkReporter$1(this);
        fullyDrawnReporter.addOnReportDrawnListener(this);
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return;
        }
        fullyDrawnReporter.addReporter();
        getHighSpeedVideoFpsRangesFor(function0);
    }

    public final void getHighResolutionOutputSizeshNQ4ISI() {
        this.getHighResolutionOutputSizeshNQ4ISI.clear(this.getHighSpeedVideoSizes);
        if (!this.Camera2StreamConfigurationMap.isFullyDrawnReported()) {
            this.Camera2StreamConfigurationMap.removeReporter();
        }
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
        this.getHighResolutionOutputSizeshNQ4ISI.stop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(final kotlin.jvm.functions.Function0<java.lang.Boolean> p0) {
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        this.getHighResolutionOutputSizeshNQ4ISI.observeReads(p0, this.getHighSpeedVideoFpsRangesFor, new kotlin.jvm.functions.Function0() { // from class: androidx.activity.compose.ReportDrawnComposition$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.compose.ReportDrawnComposition.Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.BooleanRef.this, p0);
            }
        });
        if (booleanRef.element) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.BooleanRef booleanRef, kotlin.jvm.functions.Function0 function0) {
        booleanRef.element = ((java.lang.Boolean) function0.invoke()).booleanValue();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
        this.getHighResolutionOutputSizeshNQ4ISI.stop();
        return kotlin.Unit.INSTANCE;
    }
}
