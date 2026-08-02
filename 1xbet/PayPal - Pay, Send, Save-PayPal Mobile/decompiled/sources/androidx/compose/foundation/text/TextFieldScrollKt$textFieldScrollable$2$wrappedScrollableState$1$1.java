package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0002\b\rH\u0096A¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118WX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00118WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00118\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00118WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00118WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "delta", "dispatchRawDelta", "(F)F", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "canScrollForward$delegate", "Landroidx/compose/runtime/State;", "getCanScrollForward", "()Z", "canScrollForward", "canScrollBackward$delegate", "getCanScrollBackward", "canScrollBackward", "isScrollInProgress", "getLastScrolledBackward", "lastScrolledBackward", "getLastScrolledForward", "lastScrolledForward", "Landroidx/compose/foundation/ScrollIndicatorState;", "getScrollIndicatorState", "()Landroidx/compose/foundation/ScrollIndicatorState;", "scrollIndicatorState"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 implements androidx.compose.foundation.gestures.ScrollableState {

    /* renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State canScrollBackward;

    /* renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State canScrollForward;
    private final /* synthetic */ androidx.compose.foundation.gestures.ScrollableState getHighSpeedVideoFpsRanges;

    TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1(androidx.compose.foundation.gestures.ScrollableState scrollableState, final androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition) {
        this.getHighSpeedVideoFpsRanges = scrollableState;
        this.canScrollForward = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                boolean highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1.getHighSpeedVideoFpsRanges(androidx.compose.foundation.text.TextFieldScrollerPosition.this);
                return java.lang.Boolean.valueOf(highSpeedVideoFpsRanges);
            }
        });
        this.canScrollBackward = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                boolean Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1.Camera2StreamConfigurationMap(androidx.compose.foundation.text.TextFieldScrollerPosition.this);
                return java.lang.Boolean.valueOf(Camera2StreamConfigurationMap);
            }
        });
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((java.lang.Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRanges(androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition) {
        return textFieldScrollerPosition.getOffset() < textFieldScrollerPosition.getMaximum();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return ((java.lang.Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Camera2StreamConfigurationMap(androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition) {
        return textFieldScrollerPosition.getOffset() > 0.0f;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final java.lang.Object scroll(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.getHighSpeedVideoFpsRanges.scroll(mutatePriority, function2, continuation);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean isScrollInProgress() {
        return this.getHighSpeedVideoFpsRanges.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final androidx.compose.foundation.ScrollIndicatorState getScrollIndicatorState() {
        return this.getHighSpeedVideoFpsRanges.getScrollIndicatorState();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getLastScrolledForward() {
        return this.getHighSpeedVideoFpsRanges.getLastScrolledForward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getLastScrolledBackward() {
        return this.getHighSpeedVideoFpsRanges.getLastScrolledBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float dispatchRawDelta(float delta) {
        return this.getHighSpeedVideoFpsRanges.dispatchRawDelta(delta);
    }
}
