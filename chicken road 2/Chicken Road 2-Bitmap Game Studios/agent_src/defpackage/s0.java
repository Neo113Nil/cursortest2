package defpackage;

import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements Function0 {
    public final /* synthetic */ CoreTextFieldSemanticsModifierNode b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ s0(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = coreTextFieldSemanticsModifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        SoftwareKeyboardController softwareKeyboardController;
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                DelegatableNodeKt.oyjLVtGms9eZwJ0(coreTextFieldSemanticsModifierNode);
                return unit;
            case 1:
                coreTextFieldSemanticsModifierNode.BD2CRjLJ8EtOqGQ.Uo5pffGf8LUU(true);
                break;
            case 2:
                coreTextFieldSemanticsModifierNode.BD2CRjLJ8EtOqGQ.oyjLVtGms9eZwJ0(true);
                break;
            case 3:
                coreTextFieldSemanticsModifierNode.BD2CRjLJ8EtOqGQ.gmXBnHsR2YSm();
                break;
            case 4:
                DelegatableNodeKt.oyjLVtGms9eZwJ0(coreTextFieldSemanticsModifierNode);
                return unit;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                coreTextFieldSemanticsModifierNode.BD2CRjLJ8EtOqGQ.o2t7oodqU1bUMaS();
                break;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                coreTextFieldSemanticsModifierNode.pu0JZhzR2Or6.OcGJUxcOVecQiKb.uypNJrpDByoB(new ImeAction(coreTextFieldSemanticsModifierNode.jJwKDtysO3vm5E.b41X89IqSbKt));
                break;
            default:
                LegacyTextFieldState legacyTextFieldState = coreTextFieldSemanticsModifierNode.pu0JZhzR2Or6;
                FocusRequester focusRequester = coreTextFieldSemanticsModifierNode.o4ticBN7g1K8jE;
                boolean z = coreTextFieldSemanticsModifierNode.OcGJUxcOVecQiKb;
                if (!legacyTextFieldState.hRNgd2zGCE5kj()) {
                    FocusRequester.yzPsTade5rL7D3(focusRequester);
                } else if (!z && (softwareKeyboardController = legacyTextFieldState.ra306ClFT3HT) != null) {
                    softwareKeyboardController.yzPsTade5rL7D3();
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
