package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "checkScrollableContainerConstraints-K40F9xA", "(JLandroidx/compose/foundation/gestures/Orientation;)V", "checkScrollableContainerConstraints"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckScrollableContainerConstraintsKt {
    /* renamed from: checkScrollableContainerConstraints-K40F9xA, reason: not valid java name */
    public static final void m1313checkScrollableContainerConstraintsK40F9xA(long j, androidx.compose.foundation.gestures.Orientation orientation) {
        if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
            if (androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j) == Integer.MAX_VALUE) {
                androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else {
            if (androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j) != Integer.MAX_VALUE) {
                return;
            }
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }
}
