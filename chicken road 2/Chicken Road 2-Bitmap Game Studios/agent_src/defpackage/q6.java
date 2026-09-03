package defpackage;

import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class q6 implements Function2 {
    public final /* synthetic */ SliderColors FsuUJlzzWhYnMlD;
    public final /* synthetic */ Function3 MRfxZSx8l5UG62U;
    public final /* synthetic */ Function2 UEutaskTsxaI;
    public final /* synthetic */ boolean Uo5pffGf8LUU;
    public final /* synthetic */ SliderDefaults b41X89IqSbKt;
    public final /* synthetic */ SliderState gmXBnHsR2YSm;
    public final /* synthetic */ Modifier i7xAcZoXXiIt;
    public final /* synthetic */ float kSPEzfraxudm4i;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;
    public final /* synthetic */ float uypNJrpDByoB;
    public final /* synthetic */ int yRx9jbDCTnXb3;

    public /* synthetic */ q6(SliderDefaults sliderDefaults, SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, Function2 function2, Function3 function3, float f, float f2, int i, int i2) {
        this.oyjLVtGms9eZwJ0 = i2;
        this.b41X89IqSbKt = sliderDefaults;
        this.gmXBnHsR2YSm = sliderState;
        this.i7xAcZoXXiIt = modifier;
        this.Uo5pffGf8LUU = z;
        this.FsuUJlzzWhYnMlD = sliderColors;
        this.UEutaskTsxaI = function2;
        this.MRfxZSx8l5UG62U = function3;
        this.kSPEzfraxudm4i = f;
        this.uypNJrpDByoB = f2;
        this.yRx9jbDCTnXb3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.yRx9jbDCTnXb3;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                SliderDefaults sliderDefaults = SliderDefaults.yzPsTade5rL7D3;
                int yzPsTade5rL7D3 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                this.b41X89IqSbKt.oyjLVtGms9eZwJ0(this.gmXBnHsR2YSm, this.i7xAcZoXXiIt, this.Uo5pffGf8LUU, this.FsuUJlzzWhYnMlD, this.UEutaskTsxaI, this.MRfxZSx8l5UG62U, this.kSPEzfraxudm4i, this.uypNJrpDByoB, (Composer) obj, yzPsTade5rL7D3);
                break;
            default:
                ((Integer) obj2).getClass();
                SliderDefaults sliderDefaults2 = SliderDefaults.yzPsTade5rL7D3;
                int yzPsTade5rL7D32 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                this.b41X89IqSbKt.b41X89IqSbKt(this.gmXBnHsR2YSm, this.i7xAcZoXXiIt, this.Uo5pffGf8LUU, this.FsuUJlzzWhYnMlD, this.UEutaskTsxaI, this.MRfxZSx8l5UG62U, this.kSPEzfraxudm4i, this.uypNJrpDByoB, (Composer) obj, yzPsTade5rL7D32);
                break;
        }
        return unit;
    }
}
