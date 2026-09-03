package defpackage;

import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class R8qYMBvdwRJ3nK9 implements Function2 {
    public final /* synthetic */ Object FsuUJlzzWhYnMlD;
    public final /* synthetic */ Function MRfxZSx8l5UG62U;
    public final /* synthetic */ Object UEutaskTsxaI;
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ boolean b41X89IqSbKt;
    public final /* synthetic */ int gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 2;

    public /* synthetic */ R8qYMBvdwRJ3nK9(Modifier modifier, Function0 function0, boolean z, Shape shape, IconButtonColors iconButtonColors, Function2 function2, int i) {
        this.i7xAcZoXXiIt = modifier;
        this.Uo5pffGf8LUU = function0;
        this.b41X89IqSbKt = z;
        this.FsuUJlzzWhYnMlD = shape;
        this.UEutaskTsxaI = iconButtonColors;
        this.MRfxZSx8l5UG62U = function2;
        this.gmXBnHsR2YSm = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.gmXBnHsR2YSm;
        Object obj3 = this.UEutaskTsxaI;
        Object obj4 = this.FsuUJlzzWhYnMlD;
        Object obj5 = this.Uo5pffGf8LUU;
        Function function = this.MRfxZSx8l5UG62U;
        Object obj6 = this.i7xAcZoXXiIt;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D3 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                BasicTooltipKt.hRNgd2zGCE5kj((PopupPositionProvider) obj6, (TooltipState) obj5, (CoroutineScope) obj4, this.b41X89IqSbKt, (MutableState) obj3, (ComposableLambdaImpl) function, (Composer) obj, yzPsTade5rL7D3);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D32 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                ContextMenuUiKt.ra306ClFT3HT((String) obj6, this.b41X89IqSbKt, (ContextMenuColors) obj5, (Modifier) obj4, (Function3) obj3, (Function0) function, (Composer) obj, yzPsTade5rL7D32);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D33 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                IconButtonKt.hRNgd2zGCE5kj((Modifier) obj6, (Function0) obj5, this.b41X89IqSbKt, (Shape) obj4, (IconButtonColors) obj3, (Function2) function, (Composer) obj, yzPsTade5rL7D33);
                break;
            default:
                ((Integer) obj2).getClass();
                int yzPsTade5rL7D34 = RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1);
                TooltipKt.hRNgd2zGCE5kj((PopupPositionProvider) obj6, (ComposableLambdaImpl) function, (TooltipState) obj5, (Modifier) obj4, this.b41X89IqSbKt, (ComposableLambdaImpl) obj3, (Composer) obj, yzPsTade5rL7D34);
                break;
        }
        return unit;
    }

    public /* synthetic */ R8qYMBvdwRJ3nK9(PopupPositionProvider popupPositionProvider, TooltipState tooltipState, CoroutineScope coroutineScope, boolean z, MutableState mutableState, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.i7xAcZoXXiIt = popupPositionProvider;
        this.Uo5pffGf8LUU = tooltipState;
        this.FsuUJlzzWhYnMlD = coroutineScope;
        this.b41X89IqSbKt = z;
        this.UEutaskTsxaI = mutableState;
        this.MRfxZSx8l5UG62U = composableLambdaImpl;
        this.gmXBnHsR2YSm = i;
    }

    public /* synthetic */ R8qYMBvdwRJ3nK9(PopupPositionProvider popupPositionProvider, ComposableLambdaImpl composableLambdaImpl, TooltipState tooltipState, Modifier modifier, boolean z, ComposableLambdaImpl composableLambdaImpl2, int i) {
        this.i7xAcZoXXiIt = popupPositionProvider;
        this.MRfxZSx8l5UG62U = composableLambdaImpl;
        this.Uo5pffGf8LUU = tooltipState;
        this.FsuUJlzzWhYnMlD = modifier;
        this.b41X89IqSbKt = z;
        this.UEutaskTsxaI = composableLambdaImpl2;
        this.gmXBnHsR2YSm = i;
    }

    public /* synthetic */ R8qYMBvdwRJ3nK9(String str, boolean z, ContextMenuColors contextMenuColors, Modifier modifier, Function3 function3, Function0 function0, int i) {
        this.i7xAcZoXXiIt = str;
        this.b41X89IqSbKt = z;
        this.Uo5pffGf8LUU = contextMenuColors;
        this.FsuUJlzzWhYnMlD = modifier;
        this.UEutaskTsxaI = function3;
        this.MRfxZSx8l5UG62U = function0;
        this.gmXBnHsR2YSm = i;
    }
}
