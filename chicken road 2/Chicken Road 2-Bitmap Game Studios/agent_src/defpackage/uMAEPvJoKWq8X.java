package defpackage;

import androidx.compose.material3.BottomSheetDefaults;
import androidx.compose.material3.TabRowDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class uMAEPvJoKWq8X implements Function2 {
    public final /* synthetic */ Shape FsuUJlzzWhYnMlD;
    public final /* synthetic */ Object UEutaskTsxaI;
    public final /* synthetic */ long Uo5pffGf8LUU;
    public final /* synthetic */ Modifier b41X89IqSbKt;
    public final /* synthetic */ float gmXBnHsR2YSm;
    public final /* synthetic */ float i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 0;

    public /* synthetic */ uMAEPvJoKWq8X(BottomSheetDefaults bottomSheetDefaults, Modifier modifier, float f, float f2, Shape shape, long j, int i) {
        this.UEutaskTsxaI = bottomSheetDefaults;
        this.b41X89IqSbKt = modifier;
        this.gmXBnHsR2YSm = f;
        this.i7xAcZoXXiIt = f2;
        this.FsuUJlzzWhYnMlD = shape;
        this.Uo5pffGf8LUU = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj3 = this.UEutaskTsxaI;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                BottomSheetDefaults bottomSheetDefaults = BottomSheetDefaults.yzPsTade5rL7D3;
                int yzPsTade5rL7D3 = RecomposeScopeImplKt.yzPsTade5rL7D3(196609);
                ((BottomSheetDefaults) obj3).yzPsTade5rL7D3(this.gmXBnHsR2YSm, this.i7xAcZoXXiIt, yzPsTade5rL7D3, this.Uo5pffGf8LUU, (Composer) obj, this.b41X89IqSbKt, this.FsuUJlzzWhYnMlD);
                break;
            default:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D32 = RecomposeScopeImplKt.yzPsTade5rL7D3(196657);
                ((TabRowDefaults) obj3).yzPsTade5rL7D3(this.gmXBnHsR2YSm, this.i7xAcZoXXiIt, yzPsTade5rL7D32, this.Uo5pffGf8LUU, (Composer) obj, this.b41X89IqSbKt, this.FsuUJlzzWhYnMlD);
                break;
        }
        return unit;
    }

    public /* synthetic */ uMAEPvJoKWq8X(TabRowDefaults tabRowDefaults, Modifier modifier, float f, float f2, long j, Shape shape, int i) {
        this.UEutaskTsxaI = tabRowDefaults;
        this.b41X89IqSbKt = modifier;
        this.gmXBnHsR2YSm = f;
        this.i7xAcZoXXiIt = f2;
        this.Uo5pffGf8LUU = j;
        this.FsuUJlzzWhYnMlD = shape;
    }
}
