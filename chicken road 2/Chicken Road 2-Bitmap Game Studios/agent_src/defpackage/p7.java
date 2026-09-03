package defpackage;

import androidx.compose.material3.DrawerPredictiveBackState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.TabRowKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class p7 implements Function2 {
    public final /* synthetic */ Object FsuUJlzzWhYnMlD;
    public final /* synthetic */ int MRfxZSx8l5UG62U;
    public final /* synthetic */ Object UEutaskTsxaI;
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ Modifier b41X89IqSbKt;
    public final /* synthetic */ long gmXBnHsR2YSm;
    public final /* synthetic */ long i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 0;

    public /* synthetic */ p7(int i, Modifier modifier, long j, long j2, Function3 function3, Function2 function2, ComposableLambdaImpl composableLambdaImpl, int i2) {
        this.MRfxZSx8l5UG62U = i;
        this.b41X89IqSbKt = modifier;
        this.gmXBnHsR2YSm = j;
        this.i7xAcZoXXiIt = j2;
        this.Uo5pffGf8LUU = function3;
        this.FsuUJlzzWhYnMlD = function2;
        this.UEutaskTsxaI = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        int i2 = this.MRfxZSx8l5UG62U;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj3 = this.UEutaskTsxaI;
        Object obj4 = this.FsuUJlzzWhYnMlD;
        Object obj5 = this.Uo5pffGf8LUU;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D3 = RecomposeScopeImplKt.yzPsTade5rL7D3(1572865);
                TabRowKt.yzPsTade5rL7D3(this.MRfxZSx8l5UG62U, this.b41X89IqSbKt, this.gmXBnHsR2YSm, this.i7xAcZoXXiIt, (Function3) obj5, (Function2) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, yzPsTade5rL7D3);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D32 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                TabRowKt.hRNgd2zGCE5kj(this.b41X89IqSbKt, this.gmXBnHsR2YSm, this.i7xAcZoXXiIt, (Function3) obj5, (Function2) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, yzPsTade5rL7D32);
                break;
            default:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D33 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                NavigationDrawerKt.yzPsTade5rL7D3((DrawerPredictiveBackState) obj5, this.b41X89IqSbKt, (Shape) obj4, this.gmXBnHsR2YSm, this.i7xAcZoXXiIt, (FloatProducer) obj3, (Composer) obj, yzPsTade5rL7D33);
                break;
        }
        return unit;
    }

    public /* synthetic */ p7(DrawerPredictiveBackState drawerPredictiveBackState, Modifier modifier, Shape shape, long j, long j2, FloatProducer floatProducer, int i) {
        this.Uo5pffGf8LUU = drawerPredictiveBackState;
        this.b41X89IqSbKt = modifier;
        this.FsuUJlzzWhYnMlD = shape;
        this.gmXBnHsR2YSm = j;
        this.i7xAcZoXXiIt = j2;
        this.UEutaskTsxaI = floatProducer;
        this.MRfxZSx8l5UG62U = i;
    }

    public /* synthetic */ p7(Modifier modifier, long j, long j2, Function3 function3, Function2 function2, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.b41X89IqSbKt = modifier;
        this.gmXBnHsR2YSm = j;
        this.i7xAcZoXXiIt = j2;
        this.Uo5pffGf8LUU = function3;
        this.FsuUJlzzWhYnMlD = function2;
        this.UEutaskTsxaI = composableLambdaImpl;
        this.MRfxZSx8l5UG62U = i;
    }
}
