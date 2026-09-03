package defpackage;

import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class m5 implements Function2 {
    public final /* synthetic */ int Uo5pffGf8LUU;
    public final /* synthetic */ long b41X89IqSbKt;
    public final /* synthetic */ TextStyle gmXBnHsR2YSm;
    public final /* synthetic */ Function2 i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ m5(long j, TextStyle textStyle, Function2 function2, int i, int i2) {
        this.oyjLVtGms9eZwJ0 = i2;
        this.b41X89IqSbKt = j;
        this.gmXBnHsR2YSm = textStyle;
        this.i7xAcZoXXiIt = function2;
        this.Uo5pffGf8LUU = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.Uo5pffGf8LUU;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int yzPsTade5rL7D3 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                ProvideContentColorTextStyleKt.yzPsTade5rL7D3(this.b41X89IqSbKt, this.gmXBnHsR2YSm, this.i7xAcZoXXiIt, (Composer) obj, yzPsTade5rL7D3);
                break;
            default:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D32 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                TextFieldImplKt.hRNgd2zGCE5kj(this.b41X89IqSbKt, this.gmXBnHsR2YSm, this.i7xAcZoXXiIt, (Composer) obj, yzPsTade5rL7D32);
                break;
        }
        return unit;
    }
}
