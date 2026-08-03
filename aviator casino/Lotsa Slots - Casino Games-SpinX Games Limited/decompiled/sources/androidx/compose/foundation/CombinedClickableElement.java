package androidx.compose.foundation;

/* compiled from: Clickable.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\f\u0010\u001a\u001a\u00020\r*\u00020\u001bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/CombinedClickableNodeImpl;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "", "onLongClickLabel", "onLongClick", "onDoubleClick", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "equals", "other", "", "hashCode", "", "update", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class CombinedClickableElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.CombinedClickableNodeImpl> {
    private final boolean enabled;
    private final androidx.compose.foundation.interaction.MutableInteractionSource interactionSource;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onClick;
    private final java.lang.String onClickLabel;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onDoubleClick;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onLongClick;
    private final java.lang.String onLongClickLabel;
    private final androidx.compose.ui.semantics.Role role;

    public /* synthetic */ CombinedClickableElement(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z, java.lang.String str, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0 function0, java.lang.String str2, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, z, str, role, function0, str2, function02, function03);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    public /* synthetic */ CombinedClickableElement(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z, java.lang.String str, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0 function0, java.lang.String str2, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, z, str, (i & 8) != 0 ? null : role, function0, str2, function02, function03, null);
    }

    private CombinedClickableElement(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z, java.lang.String str, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str2, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03) {
        this.interactionSource = mutableInteractionSource;
        this.enabled = z;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = function0;
        this.onLongClickLabel = str2;
        this.onLongClick = function02;
        this.onDoubleClick = function03;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public androidx.compose.foundation.CombinedClickableNodeImpl create() {
        return new androidx.compose.foundation.CombinedClickableNodeImpl(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.interactionSource, this.enabled, this.onClickLabel, this.role, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(androidx.compose.foundation.CombinedClickableNodeImpl node) {
        node.mo263updatexpl5gLE(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.interactionSource, this.enabled, this.onClickLabel, this.role);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        androidx.compose.foundation.CombinedClickableElement combinedClickableElement = (androidx.compose.foundation.CombinedClickableElement) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.interactionSource, combinedClickableElement.interactionSource) && this.enabled == combinedClickableElement.enabled && kotlin.jvm.internal.Intrinsics.areEqual(this.onClickLabel, combinedClickableElement.onClickLabel) && kotlin.jvm.internal.Intrinsics.areEqual(this.role, combinedClickableElement.role) && kotlin.jvm.internal.Intrinsics.areEqual(this.onClick, combinedClickableElement.onClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.onLongClickLabel, combinedClickableElement.onLongClickLabel) && kotlin.jvm.internal.Intrinsics.areEqual(this.onLongClick, combinedClickableElement.onLongClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.onDoubleClick, combinedClickableElement.onDoubleClick);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((this.interactionSource.hashCode() * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.enabled)) * 31;
        java.lang.String str = this.onClickLabel;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        androidx.compose.ui.semantics.Role role = this.role;
        int m3789hashCodeimpl = (((hashCode2 + (role != null ? androidx.compose.ui.semantics.Role.m3789hashCodeimpl(role.getValue()) : 0)) * 31) + this.onClick.hashCode()) * 31;
        java.lang.String str2 = this.onLongClickLabel;
        int hashCode3 = (m3789hashCodeimpl + (str2 != null ? str2.hashCode() : 0)) * 31;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onLongClick;
        int hashCode4 = (hashCode3 + (function0 != null ? function0.hashCode() : 0)) * 31;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.onDoubleClick;
        return hashCode4 + (function02 != null ? function02.hashCode() : 0);
    }
}
