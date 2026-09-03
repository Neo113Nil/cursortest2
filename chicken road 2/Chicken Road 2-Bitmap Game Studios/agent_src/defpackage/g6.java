package defpackage;

import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class g6 implements Function0 {
    public final /* synthetic */ ScrollableNode b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ g6(ScrollableNode scrollableNode, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = scrollableNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int i = this.oyjLVtGms9eZwJ0;
        ScrollableNode scrollableNode = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                return Boolean.valueOf(scrollableNode.o2t7oodqU1bUMaS);
            default:
                FocusTargetModifierNode focusTargetModifierNode = scrollableNode.EYWI9RMqk13H5;
                if (!focusTargetModifierNode.getOyjLVtGms9eZwJ0().o2t7oodqU1bUMaS) {
                    return null;
                }
                FocusStateImpl focusStateImpl = (FocusStateImpl) focusTargetModifierNode.EjScMNF3srEf();
                if (!focusStateImpl.hRNgd2zGCE5kj()) {
                    return null;
                }
                if (focusStateImpl.yzPsTade5rL7D3()) {
                    return ((FocusTargetNode) focusTargetModifierNode).t0(null);
                }
                FocusTargetNode o2t7oodqU1bUMaS = DelegatableNodeKt.Uo5pffGf8LUU(focusTargetModifierNode).getFocusOwner().o2t7oodqU1bUMaS();
                if (o2t7oodqU1bUMaS != null) {
                    return o2t7oodqU1bUMaS.t0(DelegatableNodeKt.gmXBnHsR2YSm(focusTargetModifierNode));
                }
                return null;
        }
    }
}
