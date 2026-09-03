package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Function2 {
    public final /* synthetic */ Object FsuUJlzzWhYnMlD;
    public final /* synthetic */ Object MRfxZSx8l5UG62U;
    public final /* synthetic */ Object UEutaskTsxaI;
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ int b41X89IqSbKt;
    public final /* synthetic */ ComposableLambdaImpl gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 1;

    public /* synthetic */ d0(int i, Function2 function2, ComposableLambdaImpl composableLambdaImpl, Function2 function22, Function2 function23, WindowInsets windowInsets, Function2 function24, int i2) {
        this.b41X89IqSbKt = i;
        this.i7xAcZoXXiIt = function2;
        this.gmXBnHsR2YSm = composableLambdaImpl;
        this.Uo5pffGf8LUU = function22;
        this.FsuUJlzzWhYnMlD = function23;
        this.UEutaskTsxaI = windowInsets;
        this.MRfxZSx8l5UG62U = function24;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj3 = this.MRfxZSx8l5UG62U;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D3 = RecomposeScopeImplKt.yzPsTade5rL7D3(this.b41X89IqSbKt) | 1;
                this.gmXBnHsR2YSm.i7xAcZoXXiIt(this.i7xAcZoXXiIt, (Boolean) obj3, this.Uo5pffGf8LUU, this.FsuUJlzzWhYnMlD, this.UEutaskTsxaI, (Composer) obj, yzPsTade5rL7D3);
                break;
            default:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D32 = RecomposeScopeImplKt.yzPsTade5rL7D3(1);
                ScaffoldKt.hRNgd2zGCE5kj(this.b41X89IqSbKt, (Function2) this.i7xAcZoXXiIt, this.gmXBnHsR2YSm, (Function2) this.Uo5pffGf8LUU, (Function2) this.FsuUJlzzWhYnMlD, (WindowInsets) this.UEutaskTsxaI, (Function2) obj3, (Composer) obj, yzPsTade5rL7D32);
                break;
        }
        return unit;
    }

    public /* synthetic */ d0(ComposableLambdaImpl composableLambdaImpl, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i) {
        this.gmXBnHsR2YSm = composableLambdaImpl;
        this.i7xAcZoXXiIt = obj;
        this.MRfxZSx8l5UG62U = bool;
        this.Uo5pffGf8LUU = obj2;
        this.FsuUJlzzWhYnMlD = obj3;
        this.UEutaskTsxaI = obj4;
        this.b41X89IqSbKt = i;
    }
}
