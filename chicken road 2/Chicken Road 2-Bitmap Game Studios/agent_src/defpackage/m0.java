package defpackage;

import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements Function0 {
    public final /* synthetic */ boolean b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ m0(int i, Object obj, boolean z) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = z;
        this.gmXBnHsR2YSm = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj = this.gmXBnHsR2YSm;
        boolean z = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                ContextMenuColors contextMenuColors = ContextMenuUiKt.yzPsTade5rL7D3;
                if (z) {
                    function0.hRNgd2zGCE5kj();
                    break;
                }
                break;
            case 1:
                LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter = (LegacyPlatformTextInputServiceAdapter) obj;
                if (z) {
                    legacyPlatformTextInputServiceAdapter.FsuUJlzzWhYnMlD();
                    break;
                }
                break;
            default:
                FocusRequester focusRequester = (FocusRequester) obj;
                if (z) {
                    FocusRequester.yzPsTade5rL7D3(focusRequester);
                    break;
                }
                break;
        }
        return unit;
    }
}
