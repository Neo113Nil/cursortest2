package defpackage;

import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class Tq1wTdNjhzJEqe implements Function2 {
    public final /* synthetic */ Object FsuUJlzzWhYnMlD;
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ int gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 1;

    public /* synthetic */ Tq1wTdNjhzJEqe(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, int i) {
        this.b41X89IqSbKt = composableLambdaImpl;
        this.i7xAcZoXXiIt = obj;
        this.Uo5pffGf8LUU = obj2;
        this.FsuUJlzzWhYnMlD = obj3;
        this.gmXBnHsR2YSm = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Object obj3 = this.b41X89IqSbKt;
        Object obj4 = this.FsuUJlzzWhYnMlD;
        Object obj5 = this.Uo5pffGf8LUU;
        Object obj6 = this.i7xAcZoXXiIt;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.gmXBnHsR2YSm;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                BasicTooltipKt.yzPsTade5rL7D3((PopupPositionProvider) obj6, (ComposableLambdaImpl) obj3, (TooltipState) obj4, (ComposableLambdaImpl) obj5, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D3 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2) | 1;
                ((ComposableLambdaImpl) obj3).FsuUJlzzWhYnMlD(this.i7xAcZoXXiIt, this.Uo5pffGf8LUU, this.FsuUJlzzWhYnMlD, (Composer) obj, yzPsTade5rL7D3);
                break;
            default:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D32 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                LifecycleEffectKt.hRNgd2zGCE5kj((Boolean) obj6, this.b41X89IqSbKt, (LifecycleOwner) obj5, (Function1) obj4, (Composer) obj, yzPsTade5rL7D32);
                break;
        }
        return unit;
    }

    public /* synthetic */ Tq1wTdNjhzJEqe(PopupPositionProvider popupPositionProvider, ComposableLambdaImpl composableLambdaImpl, TooltipState tooltipState, ComposableLambdaImpl composableLambdaImpl2, int i) {
        this.i7xAcZoXXiIt = popupPositionProvider;
        this.b41X89IqSbKt = composableLambdaImpl;
        this.FsuUJlzzWhYnMlD = tooltipState;
        this.Uo5pffGf8LUU = composableLambdaImpl2;
        this.gmXBnHsR2YSm = i;
    }

    public /* synthetic */ Tq1wTdNjhzJEqe(Boolean bool, Object obj, LifecycleOwner lifecycleOwner, Function1 function1, int i) {
        this.i7xAcZoXXiIt = bool;
        this.b41X89IqSbKt = obj;
        this.Uo5pffGf8LUU = lifecycleOwner;
        this.FsuUJlzzWhYnMlD = function1;
        this.gmXBnHsR2YSm = i;
    }
}
