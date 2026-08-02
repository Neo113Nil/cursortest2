package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/node/ObserverModifierNode;", "observerNode", "<init>", "(Landroidx/compose/ui/node/ObserverModifierNode;)V", "Landroidx/compose/ui/node/ObserverModifierNode;", "getObserverNode$ui", "()Landroidx/compose/ui/node/ObserverModifierNode;", "", "isValidOwnerScope", "()Z", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ObserverNodeOwnerScope implements androidx.compose.ui.node.OwnerScope {
    private final androidx.compose.ui.node.ObserverModifierNode observerNode;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.node.ObserverNodeOwnerScope.Companion INSTANCE = new androidx.compose.ui.node.ObserverNodeOwnerScope.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.node.ObserverNodeOwnerScope, kotlin.Unit> OnObserveReadsChanged = new kotlin.jvm.functions.Function1<androidx.compose.ui.node.ObserverNodeOwnerScope, kotlin.Unit>() { // from class: androidx.compose.ui.node.ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.ObserverNodeOwnerScope observerNodeOwnerScope) {
            getHighResolutionOutputSizeshNQ4ISI(observerNodeOwnerScope);
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.ObserverNodeOwnerScope observerNodeOwnerScope) {
            if (observerNodeOwnerScope.isValidOwnerScope()) {
                observerNodeOwnerScope.getObserverNode().onObservedReadsChanged();
            }
        }
    };

    public ObserverNodeOwnerScope(androidx.compose.ui.node.ObserverModifierNode observerModifierNode) {
        this.observerNode = observerModifierNode;
    }

    /* renamed from: getObserverNode$ui, reason: from getter */
    public final androidx.compose.ui.node.ObserverModifierNode getObserverNode() {
        return this.observerNode;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean isValidOwnerScope() {
        return this.observerNode.getNode().getIsAttached();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "", "OnObserveReadsChanged", "Lkotlin/jvm/functions/Function1;", "getOnObserveReadsChanged$ui", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.jvm.functions.Function1<androidx.compose.ui.node.ObserverNodeOwnerScope, kotlin.Unit> getOnObserveReadsChanged$ui() {
            return androidx.compose.ui.node.ObserverNodeOwnerScope.OnObserveReadsChanged;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
