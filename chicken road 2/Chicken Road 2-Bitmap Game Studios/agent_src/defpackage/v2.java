package defpackage;

import androidx.compose.foundation.layout.InsetsConsumingModifierNode;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements Function1 {
    public final /* synthetic */ InsetsConsumingModifierNode b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ v2(InsetsConsumingModifierNode insetsConsumingModifierNode, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = insetsConsumingModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        InsetsConsumingModifierNode insetsConsumingModifierNode = this.b41X89IqSbKt;
        TraversableNode traversableNode = (TraversableNode) obj;
        switch (i) {
            case 0:
                traversableNode.getClass();
                InsetsConsumingModifierNode insetsConsumingModifierNode2 = (InsetsConsumingModifierNode) traversableNode;
                WindowInsets windowInsets = insetsConsumingModifierNode.FTJ2XS7ULgY8;
                if (!Intrinsics.yzPsTade5rL7D3(insetsConsumingModifierNode2.MCcLy95b8Awzmw, windowInsets)) {
                    insetsConsumingModifierNode2.MCcLy95b8Awzmw = windowInsets;
                    insetsConsumingModifierNode2.r0();
                }
                return TraversableNode.Companion.TraverseDescendantsAction.b41X89IqSbKt;
            default:
                traversableNode.getClass();
                insetsConsumingModifierNode.MCcLy95b8Awzmw = ((InsetsConsumingModifierNode) traversableNode).FTJ2XS7ULgY8;
                return Boolean.FALSE;
        }
    }
}
