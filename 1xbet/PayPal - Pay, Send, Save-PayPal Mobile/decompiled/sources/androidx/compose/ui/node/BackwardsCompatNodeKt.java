package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0002\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0005\" \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\" \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t"}, d2 = {"Landroidx/compose/ui/node/BackwardsCompatNode;", "", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/node/BackwardsCompatNode;)Z", "Landroidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1;", "Landroidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1;", "Lkotlin/Function1;", "", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BackwardsCompatNodeKt {
    private static final androidx.compose.ui.node.BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 Camera2StreamConfigurationMap = new androidx.compose.ui.modifier.ModifierLocalReadScope() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1
        @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
        public final <T> T getCurrent(androidx.compose.ui.modifier.ModifierLocal<T> modifierLocal) {
            return modifierLocal.getDefaultFactory$ui().invoke();
        }
    };
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.node.BackwardsCompatNode, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function1<androidx.compose.ui.node.BackwardsCompatNode, kotlin.Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$onDrawCacheReadsChanged$1
        public final void Camera2StreamConfigurationMap(androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.onDrawCacheReadsChanged$ui();
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode) {
            Camera2StreamConfigurationMap(backwardsCompatNode);
            return kotlin.Unit.INSTANCE;
        }
    };
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.node.BackwardsCompatNode, kotlin.Unit> getHighSpeedVideoSizes = new kotlin.jvm.functions.Function1<androidx.compose.ui.node.BackwardsCompatNode, kotlin.Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$updateModifierLocalConsumer$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode) {
            Camera2StreamConfigurationMap(backwardsCompatNode);
            return kotlin.Unit.INSTANCE;
        }

        public final void Camera2StreamConfigurationMap(androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.updateModifierLocalConsumer();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Camera2StreamConfigurationMap(androidx.compose.ui.node.BackwardsCompatNode backwardsCompatNode) {
        androidx.compose.ui.Modifier.Node tail = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(backwardsCompatNode).getNodes().getTail();
        kotlin.jvm.internal.Intrinsics.checkNotNull(tail, "");
        return ((androidx.compose.ui.node.TailModifierNode) tail).getAttachHasBeenRun();
    }
}
