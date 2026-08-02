package androidx.compose.foundation.lazy;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u00028CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\r"}, d2 = {"Landroidx/compose/foundation/lazy/LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "", "index", "", "scrollToItem", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/semantics/CollectionInfo;", "collectionInfo", "()Landroidx/compose/ui/semantics/CollectionInfo;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/State;", "getHighSpeedVideoSizes", "()I", "", "getScrollOffset", "()F", "scrollOffset", "getMaxScrollOffset", "maxScrollOffset", "getViewport", "viewport", "getContentPadding", "contentPadding"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1 implements androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState {
    private final androidx.compose.runtime.State Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.lazy.LazyListState getHighSpeedVideoFpsRangesFor;

    LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1(final androidx.compose.foundation.lazy.LazyListState lazyListState, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = lazyListState;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                int highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.lazy.LazyLayoutSemanticStateKt$LazyLayoutSemanticState$1.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.LazyListState.this);
                return java.lang.Integer.valueOf(highSpeedVideoFpsRangesFor);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.LazyListState lazyListState) {
        return lazyListState.getLayoutInfo().getTotalItemsCount();
    }

    private final int getHighSpeedVideoSizes() {
        return ((java.lang.Number) this.Camera2StreamConfigurationMap.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
    public final float getScrollOffset() {
        return androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.estimatedLazyScrollOffset(this.getHighSpeedVideoFpsRangesFor.getFirstVisibleItemIndex(), this.getHighSpeedVideoFpsRangesFor.getFirstVisibleItemScrollOffset());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
    public final float getMaxScrollOffset() {
        return androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt.estimatedLazyMaxScrollOffset(this.getHighSpeedVideoFpsRangesFor.getFirstVisibleItemIndex(), this.getHighSpeedVideoFpsRangesFor.getFirstVisibleItemScrollOffset(), this.getHighSpeedVideoFpsRangesFor.getCanScrollForward());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
    public final java.lang.Object scrollToItem(int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scrollToItem$default = androidx.compose.foundation.lazy.LazyListState.scrollToItem$default(this.getHighSpeedVideoFpsRangesFor, i, 0, continuation, 2, null);
        return scrollToItem$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scrollToItem$default : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
    public final androidx.compose.ui.semantics.CollectionInfo collectionInfo() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return new androidx.compose.ui.semantics.CollectionInfo(getHighSpeedVideoSizes(), 1);
        }
        return new androidx.compose.ui.semantics.CollectionInfo(1, getHighSpeedVideoSizes());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
    public final int getViewport() {
        long mo1788getViewportSizeYbymL2g;
        if (this.getHighSpeedVideoFpsRangesFor.getLayoutInfo().getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical) {
            mo1788getViewportSizeYbymL2g = this.getHighSpeedVideoFpsRangesFor.getLayoutInfo().mo1788getViewportSizeYbymL2g() & 4294967295L;
        } else {
            mo1788getViewportSizeYbymL2g = this.getHighSpeedVideoFpsRangesFor.getLayoutInfo().mo1788getViewportSizeYbymL2g() >> 32;
        }
        return (int) mo1788getViewportSizeYbymL2g;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
    public final int getContentPadding() {
        return this.getHighSpeedVideoFpsRangesFor.getLayoutInfo().getBeforeContentPadding() + this.getHighSpeedVideoFpsRangesFor.getLayoutInfo().getAfterContentPadding();
    }
}
