package defpackage;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration$receiveContentListener$1;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.DragAndDropHoverInteraction;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.ra306ClFT3HT;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class t7 implements Function1 {
    public final /* synthetic */ TextFieldDecoratorModifierNode b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ t7(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = textFieldDecoratorModifierNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        ReceiveContentListener yzPsTade5rL7D3;
        ReceiveContentListener yzPsTade5rL7D32;
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                TextLayoutState textLayoutState = textFieldDecoratorModifierNode.AGl7HBCQ8xrHABq;
                long j = ((Offset) obj).yzPsTade5rL7D3;
                LayoutCoordinates hRNgd2zGCE5kj = textLayoutState.hRNgd2zGCE5kj();
                if (hRNgd2zGCE5kj != null && hRNgd2zGCE5kj.FsuUJlzzWhYnMlD()) {
                    j = hRNgd2zGCE5kj.NIabVTHf6LMJyXq(j);
                }
                textFieldDecoratorModifierNode.AGl7HBCQ8xrHABq.ra306ClFT3HT();
                textFieldDecoratorModifierNode.pu0JZhzR2Or6.uY26rxeEAFnDq(Handle.oyjLVtGms9eZwJ0, j);
                return unit;
            case 1:
                textFieldDecoratorModifierNode.u0();
                textFieldDecoratorModifierNode.pu0JZhzR2Or6.ra306ClFT3HT();
                ReceiveContentConfiguration yzPsTade5rL7D33 = ReceiveContentConfigurationKt.yzPsTade5rL7D3(textFieldDecoratorModifierNode);
                if (yzPsTade5rL7D33 != null && (yzPsTade5rL7D3 = yzPsTade5rL7D33.yzPsTade5rL7D3()) != null) {
                    ((DynamicReceiveContentConfiguration$receiveContentListener$1) yzPsTade5rL7D3).hRNgd2zGCE5kj();
                }
                return unit;
            case 2:
                textFieldDecoratorModifierNode.u0();
                return unit;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean z = textFieldDecoratorModifierNode.XrorSzThrtvJ4A && !textFieldDecoratorModifierNode.ZvpnNpCMEWSR3;
                if (!booleanValue) {
                    textFieldDecoratorModifierNode.t0();
                    throw null;
                }
                if (((InputModeManager) CompositionLocalConsumerModifierNodeKt.yzPsTade5rL7D3(textFieldDecoratorModifierNode, CompositionLocalsKt.uypNJrpDByoB)).yzPsTade5rL7D3() != 1) {
                    textFieldDecoratorModifierNode.pu0JZhzR2Or6.exVmIuryuB8HeQ(false);
                }
                if (z) {
                    textFieldDecoratorModifierNode.y0(false);
                }
                ObserverModifierNodeKt.yzPsTade5rL7D3(textFieldDecoratorModifierNode, new ra306ClFT3HT(textFieldDecoratorModifierNode));
                return unit;
            case 4:
                DragAndDropEvent dragAndDropEvent = (DragAndDropEvent) obj;
                if (ReceiveContentConfigurationKt.yzPsTade5rL7D3(textFieldDecoratorModifierNode) != null) {
                    DragAndDropRequestPermission_androidKt.yzPsTade5rL7D3(textFieldDecoratorModifierNode, dragAndDropEvent);
                }
                return unit;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                DragAndDropHoverInteraction.Enter enter = new DragAndDropHoverInteraction.Enter();
                textFieldDecoratorModifierNode.o4ticBN7g1K8jE.hRNgd2zGCE5kj(enter);
                textFieldDecoratorModifierNode.vywRyEooKGLFsX = enter;
                ReceiveContentConfiguration yzPsTade5rL7D34 = ReceiveContentConfigurationKt.yzPsTade5rL7D3(textFieldDecoratorModifierNode);
                if (yzPsTade5rL7D34 != null && (yzPsTade5rL7D32 = yzPsTade5rL7D34.yzPsTade5rL7D3()) != null) {
                    ((DynamicReceiveContentConfiguration$receiveContentListener$1) yzPsTade5rL7D32).yzPsTade5rL7D3();
                }
                return unit;
            default:
                ((Boolean) obj).booleanValue();
                textFieldDecoratorModifierNode.pu0JZhzR2Or6.getClass();
                throw null;
        }
    }
}
