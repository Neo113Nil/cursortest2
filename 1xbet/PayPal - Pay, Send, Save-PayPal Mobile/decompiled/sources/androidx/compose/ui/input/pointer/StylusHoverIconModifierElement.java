package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0019"}, d2 = {"Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/pointer/StylusHoverIconModifierNode;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "icon", "", "overrideDescendants", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "touchBoundsExpansion", "<init>", "(Landroidx/compose/ui/input/pointer/PointerIcon;ZLandroidx/compose/ui/node/DpTouchBoundsExpansion;)V", "create", "()Landroidx/compose/ui/input/pointer/StylusHoverIconModifierNode;", "node", "", "update", "(Landroidx/compose/ui/input/pointer/StylusHoverIconModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "component2", "()Z", "component3", "()Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "copy", "(Landroidx/compose/ui/input/pointer/PointerIcon;ZLandroidx/compose/ui/node/DpTouchBoundsExpansion;)Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getIcon", "Z", "getOverrideDescendants", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "getTouchBoundsExpansion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StylusHoverIconModifierElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.input.pointer.StylusHoverIconModifierNode> {
    public static final int $stable = 0;
    private final androidx.compose.ui.input.pointer.PointerIcon icon;
    private final boolean overrideDescendants;
    private final androidx.compose.ui.node.DpTouchBoundsExpansion touchBoundsExpansion;

    public StylusHoverIconModifierElement(androidx.compose.ui.input.pointer.PointerIcon pointerIcon, boolean z, androidx.compose.ui.node.DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.icon = pointerIcon;
        this.overrideDescendants = z;
        this.touchBoundsExpansion = dpTouchBoundsExpansion;
    }

    public /* synthetic */ StylusHoverIconModifierElement(androidx.compose.ui.input.pointer.PointerIcon pointerIcon, boolean z, androidx.compose.ui.node.DpTouchBoundsExpansion dpTouchBoundsExpansion, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(pointerIcon, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    public final androidx.compose.ui.input.pointer.PointerIcon getIcon() {
        return this.icon;
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    public final androidx.compose.ui.node.DpTouchBoundsExpansion getTouchBoundsExpansion() {
        return this.touchBoundsExpansion;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final androidx.compose.ui.input.pointer.StylusHoverIconModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.ui.input.pointer.StylusHoverIconModifierNode(this.icon, this.overrideDescendants, this.touchBoundsExpansion);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.input.pointer.StylusHoverIconModifierNode node) {
        node.setIcon(this.icon);
        node.setOverrideDescendants(this.overrideDescendants);
        node.setDpTouchBoundsExpansion(this.touchBoundsExpansion);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("stylusHoverIcon");
        inspectorInfo.getProperties().set("icon", this.icon);
        inspectorInfo.getProperties().set("overrideDescendants", java.lang.Boolean.valueOf(this.overrideDescendants));
        inspectorInfo.getProperties().set("touchBoundsExpansion", this.touchBoundsExpansion);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StylusHoverIconModifierElement(icon=");
        sb.append(this.icon);
        sb.append(", overrideDescendants=");
        sb.append(this.overrideDescendants);
        sb.append(", touchBoundsExpansion=");
        sb.append(this.touchBoundsExpansion);
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = this.icon.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.overrideDescendants);
        androidx.compose.ui.node.DpTouchBoundsExpansion dpTouchBoundsExpansion = this.touchBoundsExpansion;
        return (((hashCode * 31) + hashCode2) * 31) + (dpTouchBoundsExpansion == null ? 0 : dpTouchBoundsExpansion.hashCode());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.input.pointer.StylusHoverIconModifierElement)) {
            return false;
        }
        androidx.compose.ui.input.pointer.StylusHoverIconModifierElement stylusHoverIconModifierElement = (androidx.compose.ui.input.pointer.StylusHoverIconModifierElement) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.icon, stylusHoverIconModifierElement.icon) && this.overrideDescendants == stylusHoverIconModifierElement.overrideDescendants && kotlin.jvm.internal.Intrinsics.areEqual(this.touchBoundsExpansion, stylusHoverIconModifierElement.touchBoundsExpansion);
    }

    public final androidx.compose.ui.input.pointer.StylusHoverIconModifierElement copy(androidx.compose.ui.input.pointer.PointerIcon icon, boolean overrideDescendants, androidx.compose.ui.node.DpTouchBoundsExpansion touchBoundsExpansion) {
        return new androidx.compose.ui.input.pointer.StylusHoverIconModifierElement(icon, overrideDescendants, touchBoundsExpansion);
    }

    /* renamed from: component3, reason: from getter */
    public final androidx.compose.ui.node.DpTouchBoundsExpansion getTouchBoundsExpansion() {
        return this.touchBoundsExpansion;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.ui.input.pointer.PointerIcon getIcon() {
        return this.icon;
    }

    public static /* synthetic */ androidx.compose.ui.input.pointer.StylusHoverIconModifierElement copy$default(androidx.compose.ui.input.pointer.StylusHoverIconModifierElement stylusHoverIconModifierElement, androidx.compose.ui.input.pointer.PointerIcon pointerIcon, boolean z, androidx.compose.ui.node.DpTouchBoundsExpansion dpTouchBoundsExpansion, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pointerIcon = stylusHoverIconModifierElement.icon;
        }
        if ((i & 2) != 0) {
            z = stylusHoverIconModifierElement.overrideDescendants;
        }
        if ((i & 4) != 0) {
            dpTouchBoundsExpansion = stylusHoverIconModifierElement.touchBoundsExpansion;
        }
        return stylusHoverIconModifierElement.copy(pointerIcon, z, dpTouchBoundsExpansion);
    }
}
