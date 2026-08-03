package androidx.compose.foundation.relocation;

/* compiled from: BringIntoViewRequester.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "Landroidx/compose/foundation/relocation/BringIntoViewChildNode;", "requester", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;)V", "bringIntoView", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disposeRequester", "onAttach", "onDetach", "updateRequester", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BringIntoViewRequesterNode extends androidx.compose.foundation.relocation.BringIntoViewChildNode {
    public static final int $stable = 8;
    private androidx.compose.foundation.relocation.BringIntoViewRequester requester;

    public BringIntoViewRequesterNode(androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester) {
        this.requester = bringIntoViewRequester;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateRequester(this.requester);
    }

    public final void updateRequester(androidx.compose.foundation.relocation.BringIntoViewRequester requester) {
        disposeRequester();
        if (requester instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl) {
            ((androidx.compose.foundation.relocation.BringIntoViewRequesterImpl) requester).getModifiers().add(this);
        }
        this.requester = requester;
    }

    private final void disposeRequester() {
        androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester = this.requester;
        if (bringIntoViewRequester instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(bringIntoViewRequester, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((androidx.compose.foundation.relocation.BringIntoViewRequesterImpl) bringIntoViewRequester).getModifiers().remove(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeRequester();
    }

    public final java.lang.Object bringIntoView(final androidx.compose.ui.geometry.Rect rect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object bringChildIntoView;
        androidx.compose.foundation.relocation.BringIntoViewParent parent = getParent();
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        return (layoutCoordinates != null && (bringChildIntoView = parent.bringChildIntoView(layoutCoordinates, new kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterNode$bringIntoView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.ui.geometry.Rect invoke() {
                androidx.compose.ui.geometry.Rect rect2 = androidx.compose.ui.geometry.Rect.this;
                if (rect2 != null) {
                    return rect2;
                }
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = this.getLayoutCoordinates();
                if (layoutCoordinates2 != null) {
                    return androidx.compose.ui.geometry.SizeKt.m1961toRectuvyYCjk(androidx.compose.ui.unit.IntSizeKt.m4662toSizeozmzZPI(layoutCoordinates2.mo3409getSizeYbymL2g()));
                }
                return null;
            }
        }, continuation)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? bringChildIntoView : kotlin.Unit.INSTANCE;
    }
}
