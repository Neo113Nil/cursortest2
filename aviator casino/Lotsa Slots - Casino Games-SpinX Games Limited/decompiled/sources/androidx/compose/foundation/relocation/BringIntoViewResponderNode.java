package androidx.compose.foundation.relocation;

/* compiled from: BringIntoViewResponder.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0096@¢\u0006\u0002\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0005¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;", "Landroidx/compose/foundation/relocation/BringIntoViewChildNode;", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "responder", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "(Landroidx/compose/foundation/relocation/BringIntoViewResponder;)V", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "getResponder", "()Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "setResponder", "bringChildIntoView", "", "childCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsProvider", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BringIntoViewResponderNode extends androidx.compose.foundation.relocation.BringIntoViewChildNode implements androidx.compose.foundation.relocation.BringIntoViewParent {
    public static final int $stable = 8;
    private final androidx.compose.ui.modifier.ModifierLocalMap providedValues = androidx.compose.ui.modifier.ModifierLocalModifierNodeKt.modifierLocalMapOf(kotlin.TuplesKt.to(androidx.compose.foundation.relocation.BringIntoViewKt.getModifierLocalBringIntoViewParent(), this));
    private androidx.compose.foundation.relocation.BringIntoViewResponder responder;

    public final androidx.compose.foundation.relocation.BringIntoViewResponder getResponder() {
        return this.responder;
    }

    public final void setResponder(androidx.compose.foundation.relocation.BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }

    public BringIntoViewResponderNode(androidx.compose.foundation.relocation.BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewChildNode, androidx.compose.ui.modifier.ModifierLocalModifierNode
    public androidx.compose.ui.modifier.ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.geometry.Rect bringChildIntoView$localRect(androidx.compose.foundation.relocation.BringIntoViewResponderNode bringIntoViewResponderNode, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> function0) {
        androidx.compose.ui.geometry.Rect invoke;
        androidx.compose.ui.geometry.Rect localRectOf;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = bringIntoViewResponderNode.getLayoutCoordinates();
        if (layoutCoordinates2 == null) {
            return null;
        }
        if (!layoutCoordinates.isAttached()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates == null || (invoke = function0.invoke()) == null) {
            return null;
        }
        localRectOf = androidx.compose.foundation.relocation.BringIntoViewResponderKt.localRectOf(layoutCoordinates2, layoutCoordinates, invoke);
        return localRectOf;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewParent
    public java.lang.Object bringChildIntoView(final androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, final kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2(this, layoutCoordinates, function0, new kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect>() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$parentRect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.ui.geometry.Rect invoke() {
                androidx.compose.ui.geometry.Rect bringChildIntoView$localRect;
                bringChildIntoView$localRect = androidx.compose.foundation.relocation.BringIntoViewResponderNode.bringChildIntoView$localRect(androidx.compose.foundation.relocation.BringIntoViewResponderNode.this, layoutCoordinates, function0);
                if (bringChildIntoView$localRect != null) {
                    return androidx.compose.foundation.relocation.BringIntoViewResponderNode.this.getResponder().calculateRectForParent(bringChildIntoView$localRect);
                }
                return null;
            }
        }, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }
}
