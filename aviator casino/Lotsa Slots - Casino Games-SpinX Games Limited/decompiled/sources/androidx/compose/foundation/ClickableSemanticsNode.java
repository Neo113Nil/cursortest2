package androidx.compose.foundation;

/* compiled from: Clickable.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\u0010\u000eJR\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nø\u0001\u0000¢\u0006\u0002\b\u0013J\f\u0010\u0014\u001a\u00020\u000b*\u00020\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/ClickableSemanticsNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "", "onLongClickLabel", "onLongClick", "(ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "shouldMergeDescendantSemantics", "getShouldMergeDescendantSemantics", "()Z", "update", "update-UMe6uN4", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ClickableSemanticsNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.SemanticsModifierNode {
    private boolean enabled;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClick;
    private java.lang.String onClickLabel;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onLongClick;
    private java.lang.String onLongClickLabel;
    private androidx.compose.ui.semantics.Role role;

    public /* synthetic */ ClickableSemanticsNode(boolean z, java.lang.String str, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0 function0, java.lang.String str2, kotlin.jvm.functions.Function0 function02, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, role, function0, str2, function02);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* renamed from: getShouldClearDescendantSemantics */
    public /* synthetic */ boolean getIsClearingSemantics() {
        return androidx.compose.ui.node.SemanticsModifierNode.CC.$default$getShouldClearDescendantSemantics(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    private ClickableSemanticsNode(boolean z, java.lang.String str, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str2, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        this.enabled = z;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = function0;
        this.onLongClickLabel = str2;
        this.onLongClick = function02;
    }

    /* renamed from: update-UMe6uN4, reason: not valid java name */
    public final void m258updateUMe6uN4(boolean enabled, java.lang.String onClickLabel, androidx.compose.ui.semantics.Role role, kotlin.jvm.functions.Function0<kotlin.Unit> onClick, java.lang.String onLongClickLabel, kotlin.jvm.functions.Function0<kotlin.Unit> onLongClick) {
        this.enabled = enabled;
        this.onClickLabel = onClickLabel;
        this.role = role;
        this.onClick = onClick;
        this.onLongClickLabel = onLongClickLabel;
        this.onLongClick = onLongClick;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.Role role = this.role;
        if (role != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(role);
            androidx.compose.ui.semantics.SemanticsPropertiesKt.m3808setRolekuIjeqM(semanticsPropertyReceiver, role.getValue());
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.onClickLabel, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.ClickableSemanticsNode$applySemantics$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() {
                kotlin.jvm.functions.Function0 function0;
                function0 = androidx.compose.foundation.ClickableSemanticsNode.this.onClick;
                function0.invoke();
                return true;
            }
        });
        if (this.onLongClick != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, this.onLongClickLabel, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.ClickableSemanticsNode$applySemantics$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Boolean invoke() {
                    kotlin.jvm.functions.Function0 function0;
                    function0 = androidx.compose.foundation.ClickableSemanticsNode.this.onLongClick;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    return true;
                }
            });
        }
        if (this.enabled) {
            return;
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
    }
}
