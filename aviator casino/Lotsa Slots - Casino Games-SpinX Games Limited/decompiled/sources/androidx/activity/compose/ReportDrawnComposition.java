package androidx.activity.compose;

/* compiled from: ReportDrawn.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\r\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0002J\u0006\u0010\u000e\u001a\u00020\u0002R \u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0001\u0012\u0004\u0012\u00020\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/activity/compose/ReportDrawnComposition;", "Lkotlin/Function0;", "", "fullyDrawnReporter", "Landroidx/activity/FullyDrawnReporter;", "predicate", "", "(Landroidx/activity/FullyDrawnReporter;Lkotlin/jvm/functions/Function0;)V", "checkReporter", "Lkotlin/Function1;", "snapshotStateObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "invoke", "observeReporter", "removeReporter", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ReportDrawnComposition implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    private final kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<java.lang.Boolean>, kotlin.Unit> checkReporter;
    private final androidx.activity.FullyDrawnReporter fullyDrawnReporter;
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> predicate;
    private final androidx.compose.runtime.snapshots.SnapshotStateObserver snapshotStateObserver;

    public ReportDrawnComposition(androidx.activity.FullyDrawnReporter fullyDrawnReporter, kotlin.jvm.functions.Function0<java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullyDrawnReporter, "fullyDrawnReporter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.fullyDrawnReporter = fullyDrawnReporter;
        this.predicate = predicate;
        androidx.compose.runtime.snapshots.SnapshotStateObserver snapshotStateObserver = new androidx.compose.runtime.snapshots.SnapshotStateObserver(new kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<? extends kotlin.Unit>, kotlin.Unit>() { // from class: androidx.activity.compose.ReportDrawnComposition$snapshotStateObserver$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlin.jvm.functions.Function0<kotlin.Unit> command) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
                command.invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0) {
                invoke2((kotlin.jvm.functions.Function0<kotlin.Unit>) function0);
                return kotlin.Unit.INSTANCE;
            }
        });
        snapshotStateObserver.start();
        this.snapshotStateObserver = snapshotStateObserver;
        this.checkReporter = new androidx.activity.compose.ReportDrawnComposition$checkReporter$1(this);
        fullyDrawnReporter.addOnReportDrawnListener(this);
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return;
        }
        fullyDrawnReporter.addReporter();
        observeReporter(predicate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
        invoke2();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2() {
        this.snapshotStateObserver.clear();
        this.snapshotStateObserver.stop();
    }

    public final void removeReporter() {
        this.snapshotStateObserver.clear(this.predicate);
        if (!this.fullyDrawnReporter.isFullyDrawnReported()) {
            this.fullyDrawnReporter.removeReporter();
        }
        invoke2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeReporter(final kotlin.jvm.functions.Function0<java.lang.Boolean> predicate) {
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        this.snapshotStateObserver.observeReads(predicate, this.checkReporter, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.activity.compose.ReportDrawnComposition$observeReporter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlin.jvm.internal.Ref.BooleanRef.this.element = predicate.invoke().booleanValue();
            }
        });
        if (booleanRef.element) {
            removeReporter();
        }
    }
}
