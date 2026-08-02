package androidx.compose.ui.scrollcapture;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0003R+\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/ui/scrollcapture/ScrollCapture;", "Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$ScrollCaptureSessionListener;", "<init>", "()V", "Landroid/view/View;", "view", "Landroidx/compose/ui/semantics/SemanticsOwner;", "semanticsOwner", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Ljava/util/function/Consumer;", "Landroid/view/ScrollCaptureTarget;", "targets", "", "onScrollCaptureSearch", "(Landroid/view/View;Landroidx/compose/ui/semantics/SemanticsOwner;Lkotlin/coroutines/CoroutineContext;Ljava/util/function/Consumer;)V", "onSessionStarted", "onSessionEnded", "", "<set-?>", "scrollCaptureInProgress$delegate", "Landroidx/compose/runtime/MutableState;", "getScrollCaptureInProgress", "()Z", "setScrollCaptureInProgress", "(Z)V", "scrollCaptureInProgress"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollCapture implements androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.ScrollCaptureSessionListener {
    public static final int $stable = 0;

    /* renamed from: scrollCaptureInProgress$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState scrollCaptureInProgress = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    private final void setScrollCaptureInProgress(boolean z) {
        this.scrollCaptureInProgress.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getScrollCaptureInProgress() {
        return ((java.lang.Boolean) this.scrollCaptureInProgress.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.ScrollCaptureSessionListener
    public final void onSessionStarted() {
        setScrollCaptureInProgress(true);
    }

    @Override // androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.ScrollCaptureSessionListener
    public final void onSessionEnded() {
        setScrollCaptureInProgress(false);
    }

    public final void onScrollCaptureSearch(android.view.View view, androidx.compose.ui.semantics.SemanticsOwner semanticsOwner, kotlin.coroutines.CoroutineContext coroutineContext, java.util.function.Consumer<android.view.ScrollCaptureTarget> targets) {
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.scrollcapture.ScrollCaptureCandidate[16], 0);
        androidx.compose.ui.scrollcapture.ScrollCapture_androidKt.getHighSpeedVideoSizes(semanticsOwner.getUnmergedRootSemanticsNode(), 0, new androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$1(mutableVector));
        mutableVector.sortWith(kotlin.comparisons.ComparisonsKt.compareBy(new kotlin.jvm.functions.Function1<androidx.compose.ui.scrollcapture.ScrollCaptureCandidate, java.lang.Comparable<?>>() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$2
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.Comparable<?> invoke(androidx.compose.ui.scrollcapture.ScrollCaptureCandidate scrollCaptureCandidate) {
                return java.lang.Integer.valueOf(scrollCaptureCandidate.getGetHighSpeedVideoFpsRanges());
            }
        }, new kotlin.jvm.functions.Function1<androidx.compose.ui.scrollcapture.ScrollCaptureCandidate, java.lang.Comparable<?>>() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$3
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.Comparable<?> invoke(androidx.compose.ui.scrollcapture.ScrollCaptureCandidate scrollCaptureCandidate) {
                return java.lang.Integer.valueOf(scrollCaptureCandidate.getGetHighResolutionOutputSizeshNQ4ISI().getHeight());
            }
        }));
        androidx.compose.ui.scrollcapture.ScrollCaptureCandidate scrollCaptureCandidate = (androidx.compose.ui.scrollcapture.ScrollCaptureCandidate) (mutableVector.getSize() != 0 ? mutableVector.content[mutableVector.getSize() - 1] : null);
        if (scrollCaptureCandidate == null) {
            return;
        }
        androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback composeScrollCaptureCallback = new androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback(scrollCaptureCandidate.getCamera2StreamConfigurationMap(), scrollCaptureCandidate.getGetHighResolutionOutputSizeshNQ4ISI(), kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineContext), this, view);
        androidx.compose.ui.geometry.Rect boundsInRoot = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInRoot(scrollCaptureCandidate.getGetHighSpeedVideoSizes());
        long m8758getTopLeftnOccac = scrollCaptureCandidate.getGetHighResolutionOutputSizeshNQ4ISI().m8758getTopLeftnOccac();
        android.view.ScrollCaptureTarget scrollCaptureTarget = new android.view.ScrollCaptureTarget(view, androidx.compose.ui.graphics.RectHelper_androidKt.toAndroidRect(androidx.compose.ui.unit.IntRectKt.roundToIntRect(boundsInRoot)), new android.graphics.Point(androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8758getTopLeftnOccac), androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8758getTopLeftnOccac)), composeScrollCaptureCallback);
        scrollCaptureTarget.setScrollBounds(androidx.compose.ui.graphics.RectHelper_androidKt.toAndroidRect(scrollCaptureCandidate.getGetHighResolutionOutputSizeshNQ4ISI()));
        targets.accept(scrollCaptureTarget);
    }
}
