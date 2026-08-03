package androidx.compose.ui.node;

/* compiled from: MeasureScopeWithLayoutNode.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"getChildrenOfVirtualChildren", "", "Landroidx/compose/ui/layout/Measurable;", "scope", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "isInLookaheadPass", "", "Landroidx/compose/ui/node/LayoutNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MeasureScopeWithLayoutNodeKt {

    /* compiled from: MeasureScopeWithLayoutNode.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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

    public static final java.util.List<java.util.List<androidx.compose.ui.layout.Measurable>> getChildrenOfVirtualChildren(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(intrinsicMeasureScope, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        androidx.compose.ui.node.LayoutNode layoutNode = ((androidx.compose.ui.node.MeasureScopeWithLayoutNode) intrinsicMeasureScope).getLayoutNode();
        boolean isInLookaheadPass = isInLookaheadPass(layoutNode);
        java.util.List<androidx.compose.ui.node.LayoutNode> foldedChildren$ui_release = layoutNode.getFoldedChildren$ui_release();
        java.util.ArrayList arrayList = new java.util.ArrayList(foldedChildren$ui_release.size());
        int size = foldedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            java.util.ArrayList arrayList2 = arrayList;
            androidx.compose.ui.node.LayoutNode layoutNode2 = foldedChildren$ui_release.get(i);
            arrayList2.add(isInLookaheadPass ? layoutNode2.getChildLookaheadMeasurables$ui_release() : layoutNode2.getChildMeasurables$ui_release());
        }
        return arrayList;
    }

    private static final boolean isInLookaheadPass(androidx.compose.ui.node.LayoutNode layoutNode) {
        int i = androidx.compose.ui.node.MeasureScopeWithLayoutNodeKt.WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        androidx.compose.ui.node.LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        if (parent$ui_release != null) {
            return isInLookaheadPass(parent$ui_release);
        }
        throw new java.lang.IllegalArgumentException("no parent for idle node".toString());
    }
}
