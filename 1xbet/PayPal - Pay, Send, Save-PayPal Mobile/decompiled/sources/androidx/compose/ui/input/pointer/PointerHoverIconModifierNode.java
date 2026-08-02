package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0017X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;", "Landroidx/compose/ui/input/pointer/HoverIconModifierNode;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "icon", "", "overrideDescendants", "<init>", "(Landroidx/compose/ui/input/pointer/PointerIcon;Z)V", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "isRelevantPointerType-uerMTgs", "(I)Z", "isRelevantPointerType", "", "displayIcon", "(Landroidx/compose/ui/input/pointer/PointerIcon;)V", "", "traverseKey", "Ljava/lang/String;", "getTraverseKey", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PointerHoverIconModifierNode extends androidx.compose.ui.input.pointer.HoverIconModifierNode {
    public static final int $stable = 8;
    private final java.lang.String traverseKey;

    public PointerHoverIconModifierNode(androidx.compose.ui.input.pointer.PointerIcon pointerIcon, boolean z) {
        super(pointerIcon, z, null, 4, null);
        this.traverseKey = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    public /* synthetic */ PointerHoverIconModifierNode(androidx.compose.ui.input.pointer.PointerIcon pointerIcon, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(pointerIcon, (i & 2) != 0 ? false : z);
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final java.lang.String getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    /* renamed from: isRelevantPointerType-uerMTgs */
    public final boolean mo7160isRelevantPointerTypeuerMTgs(int pointerType) {
        return (androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(pointerType, androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7305getStylusT8wyACA()) || androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(pointerType, androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7303getEraserT8wyACA())) ? false : true;
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    public final void displayIcon(androidx.compose.ui.input.pointer.PointerIcon icon) {
        androidx.compose.ui.input.pointer.PointerIconService pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setIcon(icon);
        }
    }
}
