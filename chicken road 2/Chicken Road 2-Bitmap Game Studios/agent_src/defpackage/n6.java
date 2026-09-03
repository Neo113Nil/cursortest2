package defpackage;

import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class n6 implements Function2 {
    public final /* synthetic */ SliderColors b41X89IqSbKt;
    public final /* synthetic */ boolean gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ n6(SliderColors sliderColors, boolean z, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = sliderColors;
        this.gmXBnHsR2YSm = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        boolean z = this.gmXBnHsR2YSm;
        SliderColors sliderColors = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                SliderDefaults sliderDefaults = SliderDefaults.yzPsTade5rL7D3;
                long hRNgd2zGCE5kj = sliderColors.hRNgd2zGCE5kj(z, true);
                SliderDefaults.Uo5pffGf8LUU((DrawScope) obj, ((Offset) obj2).yzPsTade5rL7D3, SliderDefaults.hRNgd2zGCE5kj, hRNgd2zGCE5kj);
                break;
            case 1:
                SliderDefaults sliderDefaults2 = SliderDefaults.yzPsTade5rL7D3;
                long hRNgd2zGCE5kj2 = sliderColors.hRNgd2zGCE5kj(z, true);
                SliderDefaults.Uo5pffGf8LUU((DrawScope) obj, ((Offset) obj2).yzPsTade5rL7D3, SliderDefaults.hRNgd2zGCE5kj, hRNgd2zGCE5kj2);
                break;
            default:
                SliderDefaults sliderDefaults3 = SliderDefaults.yzPsTade5rL7D3;
                long hRNgd2zGCE5kj3 = sliderColors.hRNgd2zGCE5kj(z, true);
                SliderDefaults.Uo5pffGf8LUU((DrawScope) obj, ((Offset) obj2).yzPsTade5rL7D3, SliderDefaults.hRNgd2zGCE5kj, hRNgd2zGCE5kj3);
                break;
        }
        return unit;
    }
}
