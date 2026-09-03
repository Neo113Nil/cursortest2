package defpackage;

import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class u7 implements Function0 {
    public final /* synthetic */ TextFieldDecoratorModifierNode b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ u7(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = textFieldDecoratorModifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                break;
            case 1:
                DelegatableNodeKt.oyjLVtGms9eZwJ0(textFieldDecoratorModifierNode);
                break;
            case 2:
                DelegatableNodeKt.oyjLVtGms9eZwJ0(textFieldDecoratorModifierNode);
                break;
            case 3:
                break;
            case 4:
                if (ReceiveContentConfigurationKt.yzPsTade5rL7D3(textFieldDecoratorModifierNode) == null) {
                    break;
                } else {
                    break;
                }
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                if (textFieldDecoratorModifierNode.Gx4wlvRzB4Xo5 == null) {
                    textFieldDecoratorModifierNode.y0(true);
                    break;
                } else {
                    textFieldDecoratorModifierNode.x0().yzPsTade5rL7D3();
                    break;
                }
            default:
                textFieldDecoratorModifierNode.pu0JZhzR2Or6.pu0JZhzR2Or6(TextToolbarState.gmXBnHsR2YSm);
                break;
        }
        return unit;
    }
}
