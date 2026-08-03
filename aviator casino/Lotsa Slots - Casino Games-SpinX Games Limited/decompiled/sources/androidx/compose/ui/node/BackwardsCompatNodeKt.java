package androidx.compose.ui.node;

/* compiled from: BackwardsCompatNode.kt */
@kotlin.Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0001\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0005H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"DetachedModifierLocalReadScope", "androidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1", "Landroidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1;", "onDrawCacheReadsChanged", "Lkotlin/Function1;", "Landroidx/compose/ui/node/BackwardsCompatNode;", "", "updateModifierLocalConsumer", "isChainUpdate", "", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackwardsCompatNodeKt {
    private static final androidx.compose.ui.node.BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 DetachedModifierLocalReadScope = new androidx.compose.ui.modifier.ModifierLocalReadScope() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1
        @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
        public <T> T getCurrent(androidx.compose.ui.modifier.ModifierLocal<T> modifierLocal) {
            return modifierLocal.getDefaultFactory$ui_release().invoke();
        }
    };
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.node.BackwardsCompatNode, kotlin.Unit> onDrawCacheReadsChanged = new kotlin.jvm.functions.Function1<androidx.compose.ui.node.BackwardsCompatNode, kotlin.Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$onDrawCacheReadsChanged$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode) {
            invoke2(backwardsCompatNode);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.onDrawCacheReadsChanged$ui_release();
        }
    };
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.node.BackwardsCompatNode, kotlin.Unit> updateModifierLocalConsumer = new kotlin.jvm.functions.Function1<androidx.compose.ui.node.BackwardsCompatNode, kotlin.Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$updateModifierLocalConsumer$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode) {
            invoke2(backwardsCompatNode);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.updateModifierLocalConsumer();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isChainUpdate(androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode) {
        androidx.compose.ui.Modifier.Node tail = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(backwardsCompatNode).getNodes().getTail();
        kotlin.jvm.internal.Intrinsics.checkNotNull(tail, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((androidx.compose.ui.node.TailModifierNode) tail).getAttachHasBeenRun();
    }
}
