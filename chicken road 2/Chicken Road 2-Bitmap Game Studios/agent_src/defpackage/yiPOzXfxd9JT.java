package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class yiPOzXfxd9JT implements Function2 {
    public final /* synthetic */ int FsuUJlzzWhYnMlD;
    public final /* synthetic */ Object MRfxZSx8l5UG62U;
    public final /* synthetic */ Function NIabVTHf6LMJyXq;
    public final /* synthetic */ Object UEutaskTsxaI;
    public final /* synthetic */ int Uo5pffGf8LUU;
    public final /* synthetic */ Modifier b41X89IqSbKt;
    public final /* synthetic */ PaddingValues gmXBnHsR2YSm;
    public final /* synthetic */ boolean i7xAcZoXXiIt;
    public final /* synthetic */ Object kSPEzfraxudm4i;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;
    public final /* synthetic */ Object uypNJrpDByoB;
    public final /* synthetic */ Object yRx9jbDCTnXb3;

    public /* synthetic */ yiPOzXfxd9JT(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.oyjLVtGms9eZwJ0 = 0;
        this.UEutaskTsxaI = function0;
        this.b41X89IqSbKt = modifier;
        this.i7xAcZoXXiIt = z;
        this.MRfxZSx8l5UG62U = shape;
        this.kSPEzfraxudm4i = buttonColors;
        this.uypNJrpDByoB = buttonElevation;
        this.yRx9jbDCTnXb3 = borderStroke;
        this.gmXBnHsR2YSm = paddingValues;
        this.NIabVTHf6LMJyXq = composableLambdaImpl;
        this.Uo5pffGf8LUU = i;
        this.FsuUJlzzWhYnMlD = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.Uo5pffGf8LUU;
        Function function = this.NIabVTHf6LMJyXq;
        Object obj3 = this.yRx9jbDCTnXb3;
        Object obj4 = this.uypNJrpDByoB;
        Object obj5 = this.kSPEzfraxudm4i;
        Object obj6 = this.MRfxZSx8l5UG62U;
        Object obj7 = this.UEutaskTsxaI;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D3 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                ButtonKt.yzPsTade5rL7D3((Function0) obj7, this.b41X89IqSbKt, this.i7xAcZoXXiIt, (Shape) obj6, (ButtonColors) obj5, (ButtonElevation) obj4, (BorderStroke) obj3, this.gmXBnHsR2YSm, (ComposableLambdaImpl) function, (Composer) obj, yzPsTade5rL7D3, this.FsuUJlzzWhYnMlD);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D32 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                LazyDslKt.yzPsTade5rL7D3(this.b41X89IqSbKt, (LazyListState) obj7, this.gmXBnHsR2YSm, (Arrangement.Vertical) obj6, (Alignment.Horizontal) obj5, (FlingBehavior) obj4, this.i7xAcZoXXiIt, (OverscrollEffect) obj3, (Function1) function, (Composer) obj, yzPsTade5rL7D32, this.FsuUJlzzWhYnMlD);
                break;
            default:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D33 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                LazyDslKt.hRNgd2zGCE5kj(this.b41X89IqSbKt, (LazyListState) obj7, this.gmXBnHsR2YSm, (Arrangement.Horizontal) obj6, (Alignment.Vertical) obj5, (FlingBehavior) obj4, this.i7xAcZoXXiIt, (OverscrollEffect) obj3, (Function1) function, (Composer) obj, yzPsTade5rL7D33, this.FsuUJlzzWhYnMlD);
                break;
        }
        return unit;
    }

    public /* synthetic */ yiPOzXfxd9JT(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, Object obj, Object obj2, FlingBehavior flingBehavior, boolean z, OverscrollEffect overscrollEffect, Function1 function1, int i, int i2, int i3) {
        this.oyjLVtGms9eZwJ0 = i3;
        this.b41X89IqSbKt = modifier;
        this.UEutaskTsxaI = lazyListState;
        this.gmXBnHsR2YSm = paddingValues;
        this.MRfxZSx8l5UG62U = obj;
        this.kSPEzfraxudm4i = obj2;
        this.uypNJrpDByoB = flingBehavior;
        this.i7xAcZoXXiIt = z;
        this.yRx9jbDCTnXb3 = overscrollEffect;
        this.NIabVTHf6LMJyXq = function1;
        this.Uo5pffGf8LUU = i;
        this.FsuUJlzzWhYnMlD = i2;
    }
}
