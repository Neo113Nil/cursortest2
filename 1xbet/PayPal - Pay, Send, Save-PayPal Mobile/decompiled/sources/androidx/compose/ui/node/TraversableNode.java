package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/DelegatableNode;", "", "getTraverseKey", "()Ljava/lang/Object;", "traverseKey", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TraversableNode extends androidx.compose.ui.node.DelegatableNode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.node.TraversableNode.Companion INSTANCE = androidx.compose.ui.node.TraversableNode.Companion.getHighSpeedVideoFpsRanges;

    java.lang.Object getTraverseKey();

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/node/TraversableNode$Companion;", "", "<init>", "()V", "TraverseDescendantsAction"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.node.TraversableNode.Companion getHighSpeedVideoFpsRanges = new androidx.compose.ui.node.TraversableNode.Companion();

        private Companion() {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "", "<init>", "(Ljava/lang/String;I)V", "ContinueTraversal", "SkipSubtreeAndContinueTraversal", "CancelTraversal"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class TraverseDescendantsAction {
            private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
            private static final /* synthetic */ androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction[] getHighSpeedVideoFpsRangesFor;
            public static final androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction ContinueTraversal = new androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction("ContinueTraversal", 0);
            public static final androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction SkipSubtreeAndContinueTraversal = new androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction("SkipSubtreeAndContinueTraversal", 1);
            public static final androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction CancelTraversal = new androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction("CancelTraversal", 2);

            private TraverseDescendantsAction(java.lang.String str, int i) {
            }

            static {
                androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction[] highSpeedVideoSizes = getHighSpeedVideoSizes();
                getHighSpeedVideoFpsRangesFor = highSpeedVideoSizes;
                getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoSizes);
            }

            public static androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction[] values() {
                return (androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction[]) getHighSpeedVideoFpsRangesFor.clone();
            }

            public static androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction valueOf(java.lang.String str) {
                return (androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction) java.lang.Enum.valueOf(androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.class, str);
            }

            public static kotlin.enums.EnumEntries<androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction> getEntries() {
                return getHighSpeedVideoFpsRanges;
            }

            private static final /* synthetic */ androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction[] getHighSpeedVideoSizes() {
                return new androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction[]{ContinueTraversal, SkipSubtreeAndContinueTraversal, CancelTraversal};
            }
        }
    }
}
