package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0017X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/input/pointer/StylusHoverIconModifierNode;", "Landroidx/compose/ui/input/pointer/HoverIconModifierNode;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "icon", "", "overrideDescendants", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "touchBoundsExpansion", "<init>", "(Landroidx/compose/ui/input/pointer/PointerIcon;ZLandroidx/compose/ui/node/DpTouchBoundsExpansion;)V", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "isRelevantPointerType-uerMTgs", "(I)Z", "isRelevantPointerType", "", "displayIcon", "(Landroidx/compose/ui/input/pointer/PointerIcon;)V", "", "traverseKey", "Ljava/lang/String;", "getTraverseKey", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StylusHoverIconModifierNode extends androidx.compose.ui.input.pointer.HoverIconModifierNode {
    public static final int $stable = 8;
    private final java.lang.String traverseKey;

    public StylusHoverIconModifierNode(androidx.compose.ui.input.pointer.PointerIcon pointerIcon, boolean z, androidx.compose.ui.node.DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        super(pointerIcon, z, dpTouchBoundsExpansion);
        this.traverseKey = "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }

    public /* synthetic */ StylusHoverIconModifierNode(androidx.compose.ui.input.pointer.PointerIcon pointerIcon, boolean z, androidx.compose.ui.node.DpTouchBoundsExpansion dpTouchBoundsExpansion, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(pointerIcon, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final java.lang.String getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    /* renamed from: isRelevantPointerType-uerMTgs */
    public final boolean mo7160isRelevantPointerTypeuerMTgs(int pointerType) {
        return androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(pointerType, androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7305getStylusT8wyACA()) || androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(pointerType, androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7303getEraserT8wyACA());
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    public final void displayIcon(androidx.compose.ui.input.pointer.PointerIcon icon) {
        androidx.compose.ui.input.pointer.PointerIconService pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setStylusHoverIcon(icon);
        }
    }
}
