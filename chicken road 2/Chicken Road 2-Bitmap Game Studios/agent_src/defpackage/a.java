package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ChipColors;
import androidx.compose.material3.ChipElevation;
import androidx.compose.material3.ChipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ Shape FsuUJlzzWhYnMlD;
    public final /* synthetic */ int MRfxZSx8l5UG62U;
    public final /* synthetic */ BorderStroke UEutaskTsxaI;
    public final /* synthetic */ boolean Uo5pffGf8LUU;
    public final /* synthetic */ Function0 b41X89IqSbKt;
    public final /* synthetic */ ComposableLambdaImpl gmXBnHsR2YSm;
    public final /* synthetic */ Modifier i7xAcZoXXiIt;
    public final /* synthetic */ Object kSPEzfraxudm4i;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 1;
    public final /* synthetic */ Object uypNJrpDByoB;

    public /* synthetic */ a(Function0 function0, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, boolean z, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, int i) {
        this.b41X89IqSbKt = function0;
        this.gmXBnHsR2YSm = composableLambdaImpl;
        this.i7xAcZoXXiIt = modifier;
        this.Uo5pffGf8LUU = z;
        this.FsuUJlzzWhYnMlD = shape;
        this.kSPEzfraxudm4i = chipColors;
        this.uypNJrpDByoB = chipElevation;
        this.UEutaskTsxaI = borderStroke;
        this.MRfxZSx8l5UG62U = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.MRfxZSx8l5UG62U;
        Object obj3 = this.uypNJrpDByoB;
        Object obj4 = this.kSPEzfraxudm4i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D3 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                CardKt.ra306ClFT3HT(this.b41X89IqSbKt, this.i7xAcZoXXiIt, this.Uo5pffGf8LUU, this.FsuUJlzzWhYnMlD, (CardColors) obj4, (CardElevation) obj3, this.UEutaskTsxaI, this.gmXBnHsR2YSm, (Composer) obj, yzPsTade5rL7D3);
                break;
            default:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D32 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                ChipKt.hRNgd2zGCE5kj(this.b41X89IqSbKt, this.gmXBnHsR2YSm, this.i7xAcZoXXiIt, this.Uo5pffGf8LUU, this.FsuUJlzzWhYnMlD, (ChipColors) obj4, (ChipElevation) obj3, this.UEutaskTsxaI, (Composer) obj, yzPsTade5rL7D32);
                break;
        }
        return unit;
    }

    public /* synthetic */ a(Function0 function0, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.b41X89IqSbKt = function0;
        this.i7xAcZoXXiIt = modifier;
        this.Uo5pffGf8LUU = z;
        this.FsuUJlzzWhYnMlD = shape;
        this.kSPEzfraxudm4i = cardColors;
        this.uypNJrpDByoB = cardElevation;
        this.UEutaskTsxaI = borderStroke;
        this.gmXBnHsR2YSm = composableLambdaImpl;
        this.MRfxZSx8l5UG62U = i;
    }
}
