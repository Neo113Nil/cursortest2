package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.NavigationBarKt;
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
public final /* synthetic */ class Hfp3fJWlgkDz0 implements Function2 {
    public final /* synthetic */ int FsuUJlzzWhYnMlD;
    public final /* synthetic */ Object MRfxZSx8l5UG62U;
    public final /* synthetic */ Object UEutaskTsxaI;
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ Function0 b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ boolean i7xAcZoXXiIt;
    public final /* synthetic */ Object kSPEzfraxudm4i;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ Hfp3fJWlgkDz0(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3, Function2 function2, boolean z, Function0 function0, Function0 function02, int i) {
        this.oyjLVtGms9eZwJ0 = 2;
        this.gmXBnHsR2YSm = composableLambdaImpl;
        this.Uo5pffGf8LUU = composableLambdaImpl2;
        this.UEutaskTsxaI = composableLambdaImpl3;
        this.MRfxZSx8l5UG62U = function2;
        this.i7xAcZoXXiIt = z;
        this.b41X89IqSbKt = function0;
        this.kSPEzfraxudm4i = function02;
        this.FsuUJlzzWhYnMlD = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.FsuUJlzzWhYnMlD;
        Object obj3 = this.kSPEzfraxudm4i;
        Object obj4 = this.MRfxZSx8l5UG62U;
        Object obj5 = this.UEutaskTsxaI;
        Object obj6 = this.Uo5pffGf8LUU;
        Object obj7 = this.gmXBnHsR2YSm;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D3 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                ButtonKt.hRNgd2zGCE5kj(this.b41X89IqSbKt, (Modifier) obj7, this.i7xAcZoXXiIt, (Shape) obj6, (ButtonColors) obj5, (BorderStroke) obj4, (PaddingValues) obj3, (Composer) obj, yzPsTade5rL7D3);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D32 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                CardKt.hRNgd2zGCE5kj(this.b41X89IqSbKt, (Modifier) obj7, this.i7xAcZoXXiIt, (Shape) obj6, (CardColors) obj5, (CardElevation) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, yzPsTade5rL7D32);
                break;
            default:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D33 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                NavigationBarKt.ra306ClFT3HT((ComposableLambdaImpl) obj7, (ComposableLambdaImpl) obj6, (ComposableLambdaImpl) obj5, (Function2) obj4, this.i7xAcZoXXiIt, this.b41X89IqSbKt, (Function0) obj3, (Composer) obj, yzPsTade5rL7D33);
                break;
        }
        return unit;
    }

    public /* synthetic */ Hfp3fJWlgkDz0(Function0 function0, Modifier modifier, boolean z, Shape shape, Object obj, Object obj2, Object obj3, int i, int i2) {
        this.oyjLVtGms9eZwJ0 = i2;
        this.b41X89IqSbKt = function0;
        this.gmXBnHsR2YSm = modifier;
        this.i7xAcZoXXiIt = z;
        this.Uo5pffGf8LUU = shape;
        this.UEutaskTsxaI = obj;
        this.MRfxZSx8l5UG62U = obj2;
        this.kSPEzfraxudm4i = obj3;
        this.FsuUJlzzWhYnMlD = i;
    }
}
