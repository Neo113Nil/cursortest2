package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a#\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicMeasureScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "", "Landroidx/compose/ui/layout/Measurable;", "getChildrenOfVirtualChildren", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;)Ljava/util/List;", "Landroidx/compose/ui/node/LayoutNode;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/node/LayoutNode;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MeasureScopeWithLayoutNodeKt {
    public static final java.util.List<java.util.List<androidx.compose.ui.layout.Measurable>> getChildrenOfVirtualChildren(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(intrinsicMeasureScope, "");
        androidx.compose.ui.node.LayoutNode layoutNode = ((androidx.compose.ui.node.MeasureScopeWithLayoutNode) intrinsicMeasureScope).getLayoutNode();
        boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(layoutNode);
        java.util.List<androidx.compose.ui.node.LayoutNode> foldedChildren$ui = layoutNode.getFoldedChildren$ui();
        java.util.ArrayList arrayList = new java.util.ArrayList(foldedChildren$ui.size());
        int size = foldedChildren$ui.size();
        for (int i = 0; i < size; i++) {
            java.util.ArrayList arrayList2 = arrayList;
            androidx.compose.ui.node.LayoutNode layoutNode2 = foldedChildren$ui.get(i);
            arrayList2.add(highResolutionOutputSizeshNQ4ISI ? layoutNode2.getChildLookaheadMeasurables$ui() : layoutNode2.getChildMeasurables$ui());
        }
        return arrayList;
    }

    private static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.LayoutNode layoutNode) {
        do {
            int i = androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt.WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui().ordinal()];
            if (i == 1 || i == 2) {
                return true;
            }
            if (i == 3 || i == 4) {
                return false;
            }
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            layoutNode = layoutNode.getParent$ui();
        } while (layoutNode != null);
        throw new java.lang.IllegalArgumentException("no parent for idle node".toString());
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.node.LayoutNode.LayoutState.values().length];
            try {
                iArr[androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.node.LayoutNode.LayoutState.Measuring.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.compose.ui.node.LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
