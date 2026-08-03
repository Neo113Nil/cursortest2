package androidx.compose.foundation;

/* compiled from: Clickable.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ$\u0010\f\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0012\u0010\r\u001a\u00020\b*\u00020\u000eH\u0094@¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/ClickablePointerInputNode;", "Landroidx/compose/foundation/AbstractClickablePointerInputNode;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "onClick", "Lkotlin/Function0;", "", "interactionData", "Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "(ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/AbstractClickableNode$InteractionData;)V", "update", "pointerInput", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ClickablePointerInputNode extends androidx.compose.foundation.AbstractClickablePointerInputNode {
    public ClickablePointerInputNode(boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.foundation.AbstractClickableNode.InteractionData interactionData) {
        super(z, mutableInteractionSource, function0, interactionData, null);
    }

    @Override // androidx.compose.foundation.AbstractClickablePointerInputNode
    protected java.lang.Object pointerInput(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.AbstractClickableNode.InteractionData interactionData = getInteractionData();
        long m4658getCenterozmzZPI = androidx.compose.ui.unit.IntSizeKt.m4658getCenterozmzZPI(pointerInputScope.getBoundsSize());
        interactionData.m185setCentreOffsetk4lQ0M(androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(m4658getCenterozmzZPI), androidx.compose.ui.unit.IntOffset.m4611getYimpl(m4658getCenterozmzZPI)));
        java.lang.Object detectTapAndPress = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new androidx.compose.foundation.ClickablePointerInputNode$pointerInput$2(this, null), new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.foundation.ClickablePointerInputNode$pointerInput$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Offset offset) {
                m257invokek4lQ0M(offset.getPackedValue());
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m257invokek4lQ0M(long j) {
                if (androidx.compose.foundation.ClickablePointerInputNode.this.getEnabled()) {
                    androidx.compose.foundation.ClickablePointerInputNode.this.getOnClick().invoke();
                }
            }
        }, continuation);
        return detectTapAndPress == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapAndPress : kotlin.Unit.INSTANCE;
    }

    public final void update(boolean enabled, androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        setEnabled(enabled);
        setOnClick(onClick);
        setInteractionSource(interactionSource);
    }
}
