package defpackage;

import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconToggleButtonColors;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.navigation.NavHostController;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class riuNqmSPy3ecRm implements Function2 {
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ boolean b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 2;

    public /* synthetic */ riuNqmSPy3ecRm(Modifier modifier, boolean z, IconToggleButtonColors iconToggleButtonColors, Shape shape, int i) {
        this.gmXBnHsR2YSm = modifier;
        this.b41X89IqSbKt = z;
        this.i7xAcZoXXiIt = iconToggleButtonColors;
        this.Uo5pffGf8LUU = shape;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj3 = this.Uo5pffGf8LUU;
        Object obj4 = this.i7xAcZoXXiIt;
        Object obj5 = this.gmXBnHsR2YSm;
        switch (i) {
            case 0:
                List list = (List) obj5;
                String str = (String) obj4;
                NavHostController navHostController = (NavHostController) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = 0;
                if (!composer.ZvpnNpCMEWSR3(intValue & 1, (intValue & 3) != 2)) {
                    composer.gmXBnHsR2YSm();
                    break;
                } else if (!this.b41X89IqSbKt) {
                    composer.mFNFvFv0Eiyk(-1118037577);
                    composer.o4ticBN7g1K8jE();
                    break;
                } else {
                    composer.mFNFvFv0Eiyk(-1119127351);
                    NavigationBarKt.yzPsTade5rL7D3(null, MaterialTheme.yzPsTade5rL7D3(composer).elPM8kURv8Fp, 0L, null, ComposableLambdaKt.hRNgd2zGCE5kj(-2072558259, new z6n0KAn5YNjXskD(list, str, navHostController, i2), composer), composer, 196608);
                    composer.o4ticBN7g1K8jE();
                    break;
                }
            case 1:
                ((Integer) obj2).getClass();
                ExposedDropdownMenuKt.yzPsTade5rL7D3(this.b41X89IqSbKt, (Function1) obj5, (Modifier) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(3121));
                break;
            default:
                ((Integer) obj2).getClass();
                IconButtonKt.ra306ClFT3HT((Modifier) obj5, this.b41X89IqSbKt, (IconToggleButtonColors) obj4, (Shape) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                break;
        }
        return unit;
    }

    public /* synthetic */ riuNqmSPy3ecRm(boolean z, List list, String str, NavHostController navHostController) {
        this.b41X89IqSbKt = z;
        this.gmXBnHsR2YSm = list;
        this.i7xAcZoXXiIt = str;
        this.Uo5pffGf8LUU = navHostController;
    }

    public /* synthetic */ riuNqmSPy3ecRm(boolean z, Function1 function1, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.b41X89IqSbKt = z;
        this.gmXBnHsR2YSm = function1;
        this.i7xAcZoXXiIt = modifier;
        this.Uo5pffGf8LUU = composableLambdaImpl;
    }
}
