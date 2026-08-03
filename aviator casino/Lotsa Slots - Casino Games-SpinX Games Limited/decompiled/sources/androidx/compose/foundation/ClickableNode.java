package androidx.compose.foundation;

/* compiled from: Clickable.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ@\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bø\u0001\u0000¢\u0006\u0002\b\u0017R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/ClickableNode;", "Landroidx/compose/foundation/AbstractClickableNode;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "clickablePointerInputNode", "Landroidx/compose/foundation/ClickablePointerInputNode;", "getClickablePointerInputNode", "()Landroidx/compose/foundation/ClickablePointerInputNode;", "clickableSemanticsNode", "Landroidx/compose/foundation/ClickableSemanticsNode;", "getClickableSemanticsNode", "()Landroidx/compose/foundation/ClickableSemanticsNode;", "update", "update-XHw0xAI", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ClickableNode extends androidx.compose.foundation.AbstractClickableNode {
    private final androidx.compose.foundation.ClickablePointerInputNode clickablePointerInputNode;
    private final androidx.compose.foundation.ClickableSemanticsNode clickableSemanticsNode;

    public /* synthetic */ ClickableNode(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z, java.lang.String str, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0 function0, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, z, str, role, function0);
    }

    private ClickableNode(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z, java.lang.String str, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        super(mutableInteractionSource, z, str, role, function0, null);
        this.clickableSemanticsNode = (androidx.compose.foundation.ClickableSemanticsNode) delegate(new androidx.compose.foundation.ClickableSemanticsNode(z, str, role, function0, null, null, null));
        this.clickablePointerInputNode = (androidx.compose.foundation.ClickablePointerInputNode) delegate(new androidx.compose.foundation.ClickablePointerInputNode(z, mutableInteractionSource, function0, getInteractionData()));
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public androidx.compose.foundation.ClickableSemanticsNode getClickableSemanticsNode() {
        return this.clickableSemanticsNode;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public androidx.compose.foundation.ClickablePointerInputNode getClickablePointerInputNode() {
        return this.clickablePointerInputNode;
    }

    /* renamed from: update-XHw0xAI, reason: not valid java name */
    public final void m255updateXHw0xAI(androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, boolean enabled, java.lang.String onClickLabel, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        m183updateCommonXHw0xAI(interactionSource, enabled, onClickLabel, role, onClick);
        getClickableSemanticsNode().m258updateUMe6uN4(enabled, onClickLabel, role, onClick, null, null);
        getClickablePointerInputNode().update(enabled, interactionSource, onClick);
    }
}
