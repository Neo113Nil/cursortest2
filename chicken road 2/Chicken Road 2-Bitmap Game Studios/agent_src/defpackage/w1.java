package defpackage;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowOverflow;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.MotionScheme;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class w1 implements Function2 {
    public final /* synthetic */ Object FsuUJlzzWhYnMlD;
    public final /* synthetic */ Object UEutaskTsxaI;
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ int b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ w1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.oyjLVtGms9eZwJ0 = i2;
        this.gmXBnHsR2YSm = obj;
        this.i7xAcZoXXiIt = obj2;
        this.Uo5pffGf8LUU = obj3;
        this.FsuUJlzzWhYnMlD = obj4;
        this.UEutaskTsxaI = obj5;
        this.b41X89IqSbKt = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Object obj3 = this.FsuUJlzzWhYnMlD;
        Object obj4 = this.Uo5pffGf8LUU;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.b41X89IqSbKt;
        Object obj5 = this.UEutaskTsxaI;
        Object obj6 = this.i7xAcZoXXiIt;
        Object obj7 = this.gmXBnHsR2YSm;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                FlowLayoutKt.yzPsTade5rL7D3((Modifier) obj7, (Arrangement.Horizontal) obj6, (Arrangement.Vertical) obj4, (FlowRowOverflow) obj3, (ComposableLambdaImpl) obj5, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                MaterialThemeKt.yzPsTade5rL7D3((ColorScheme) obj7, (MotionScheme) obj6, (Shapes) obj4, (Typography) obj3, (Function2) obj5, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D3 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                TransitionKt.yzPsTade5rL7D3((Transition) obj7, (Transition.TransitionAnimationState) obj6, this.Uo5pffGf8LUU, this.FsuUJlzzWhYnMlD, (FiniteAnimationSpec) obj5, (Composer) obj, yzPsTade5rL7D3);
                break;
        }
        return unit;
    }
}
