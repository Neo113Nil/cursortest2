package defpackage;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.MenuItemColors;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class AwgywP6bDNsW implements Function2 {
    public final /* synthetic */ MenuItemColors FsuUJlzzWhYnMlD;
    public final /* synthetic */ int MRfxZSx8l5UG62U;
    public final /* synthetic */ PaddingValues UEutaskTsxaI;
    public final /* synthetic */ boolean Uo5pffGf8LUU;
    public final /* synthetic */ ComposableLambdaImpl b41X89IqSbKt;
    public final /* synthetic */ Function0 gmXBnHsR2YSm;
    public final /* synthetic */ Modifier i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 1;

    public /* synthetic */ AwgywP6bDNsW(ComposableLambdaImpl composableLambdaImpl, Function0 function0, Modifier modifier, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, int i) {
        this.b41X89IqSbKt = composableLambdaImpl;
        this.gmXBnHsR2YSm = function0;
        this.i7xAcZoXXiIt = modifier;
        this.Uo5pffGf8LUU = z;
        this.FsuUJlzzWhYnMlD = menuItemColors;
        this.UEutaskTsxaI = paddingValues;
        this.MRfxZSx8l5UG62U = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D3 = RecomposeScopeImplKt.yzPsTade5rL7D3(7);
                AndroidMenu_androidKt.yzPsTade5rL7D3(this.b41X89IqSbKt, this.gmXBnHsR2YSm, this.i7xAcZoXXiIt, this.Uo5pffGf8LUU, this.FsuUJlzzWhYnMlD, this.UEutaskTsxaI, (Composer) obj, yzPsTade5rL7D3, this.MRfxZSx8l5UG62U);
                break;
            default:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D32 = RecomposeScopeImplKt.yzPsTade5rL7D3(this.MRfxZSx8l5UG62U | 1);
                MenuKt.hRNgd2zGCE5kj(this.b41X89IqSbKt, this.gmXBnHsR2YSm, this.i7xAcZoXXiIt, this.Uo5pffGf8LUU, this.FsuUJlzzWhYnMlD, this.UEutaskTsxaI, (Composer) obj, yzPsTade5rL7D32);
                break;
        }
        return unit;
    }

    public /* synthetic */ AwgywP6bDNsW(ComposableLambdaImpl composableLambdaImpl, Function0 function0, Modifier modifier, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, int i, int i2) {
        this.b41X89IqSbKt = composableLambdaImpl;
        this.gmXBnHsR2YSm = function0;
        this.i7xAcZoXXiIt = modifier;
        this.Uo5pffGf8LUU = z;
        this.FsuUJlzzWhYnMlD = menuItemColors;
        this.UEutaskTsxaI = paddingValues;
        this.MRfxZSx8l5UG62U = i2;
    }
}
