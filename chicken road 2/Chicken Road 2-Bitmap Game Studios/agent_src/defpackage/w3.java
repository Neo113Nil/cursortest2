package defpackage;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class w3 implements Function1 {
    public final /* synthetic */ SheetState b41X89IqSbKt;
    public final /* synthetic */ Function0 gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ w3(SheetState sheetState, Function0 function0, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = sheetState;
        this.gmXBnHsR2YSm = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Function0 function0 = this.gmXBnHsR2YSm;
        SheetState sheetState = this.b41X89IqSbKt;
        int i2 = ModalBottomSheetKt.hRNgd2zGCE5kj;
        switch (i) {
            case 0:
                if (!sheetState.b41X89IqSbKt()) {
                    function0.hRNgd2zGCE5kj();
                    break;
                }
                break;
            default:
                if (!sheetState.b41X89IqSbKt()) {
                    function0.hRNgd2zGCE5kj();
                    break;
                }
                break;
        }
        return unit;
    }
}
