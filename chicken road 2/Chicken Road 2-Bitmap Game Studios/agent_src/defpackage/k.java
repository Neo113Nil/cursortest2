package defpackage;

import androidx.compose.material3.internal.ParentSemanticsNode;
import androidx.compose.ui.autofill.FillableData;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableState;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Function1 {
    public final /* synthetic */ SemanticsPropertyReceiver b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ k(SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = semanticsPropertyReceiver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        boolean z = false;
        SemanticsPropertyReceiver semanticsPropertyReceiver = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                TraversableNode traversableNode = (TraversableNode) obj;
                traversableNode.getClass();
                ParentSemanticsNode parentSemanticsNode = (ParentSemanticsNode) traversableNode;
                parentSemanticsNode.FTJ2XS7ULgY8 = true;
                parentSemanticsNode.MCcLy95b8Awzmw.uypNJrpDByoB(semanticsPropertyReceiver);
                DelegatableNodeKt.i7xAcZoXXiIt(parentSemanticsNode).sb2TpovOJ8wNlST();
                return Boolean.FALSE;
            case 1:
                Boolean hRNgd2zGCE5kj = ((FillableData) obj).hRNgd2zGCE5kj();
                if (hRNgd2zGCE5kj != null) {
                    SemanticsPropertiesKt.uypNJrpDByoB(semanticsPropertyReceiver, hRNgd2zGCE5kj.booleanValue() ? ToggleableState.oyjLVtGms9eZwJ0 : ToggleableState.b41X89IqSbKt);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                Boolean hRNgd2zGCE5kj2 = ((FillableData) obj).hRNgd2zGCE5kj();
                if (hRNgd2zGCE5kj2 != null) {
                    SemanticsPropertiesKt.uypNJrpDByoB(semanticsPropertyReceiver, hRNgd2zGCE5kj2.booleanValue() ? ToggleableState.oyjLVtGms9eZwJ0 : ToggleableState.b41X89IqSbKt);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
