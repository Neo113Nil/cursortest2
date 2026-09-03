package defpackage;

import androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.door.brass.knob.ui.menu.ComposableSingletons$MenuScreenKt;
import com.door.brass.knob.ui.menu.MenuUiState;
import com.door.brass.knob.ui.menu.MenuViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Function3 {
    public final /* synthetic */ Object Uo5pffGf8LUU;
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ Object i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 1;

    public /* synthetic */ l0(State state, MutableState mutableState, List list, MenuViewModel menuViewModel) {
        this.b41X89IqSbKt = state;
        this.gmXBnHsR2YSm = mutableState;
        this.i7xAcZoXXiIt = list;
        this.Uo5pffGf8LUU = menuViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object MRfxZSx8l5UG62U(Object obj, Object obj2, Object obj3) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        Object obj4 = this.Uo5pffGf8LUU;
        Object obj5 = this.i7xAcZoXXiIt;
        Object obj6 = this.gmXBnHsR2YSm;
        Object obj7 = this.b41X89IqSbKt;
        int i2 = 0;
        switch (i) {
            case 0:
                Function2 function2 = (Function2) obj7;
                ContextMenuScope contextMenuScope = (ContextMenuScope) obj6;
                Function3 function3 = (Function3) obj5;
                Function0 function0 = (Function0) obj4;
                ContextMenuColors contextMenuColors = (ContextMenuColors) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= composer.zgejW39NNp2D(contextMenuColors) ? 4 : 2;
                }
                if (!composer.ZvpnNpCMEWSR3(intValue & 1, (intValue & 19) != 18)) {
                    composer.gmXBnHsR2YSm();
                    break;
                } else {
                    String str = (String) function2.kSPEzfraxudm4i(composer, 0);
                    if (StringsKt.GiTAvmtrM6Bh8SJ(str)) {
                        InlineClassHelperKt.ra306ClFT3HT("Label must not be blank");
                    }
                    contextMenuScope.getClass();
                    ComposableSingletons$ContextMenuUiKt.yzPsTade5rL7D3.UEutaskTsxaI(str, Boolean.TRUE, contextMenuColors, function3, function0, composer, Integer.valueOf((intValue << 9) & 7168));
                    break;
                }
            default:
                State state = (State) obj7;
                MutableState mutableState = (MutableState) obj6;
                List list = (List) obj5;
                MenuViewModel menuViewModel = (MenuViewModel) obj4;
                ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope = (ExposedDropdownMenuBoxScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                exposedDropdownMenuBoxScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= (intValue2 & 8) == 0 ? composer2.zgejW39NNp2D(exposedDropdownMenuBoxScope) : composer2.NIabVTHf6LMJyXq(exposedDropdownMenuBoxScope) ? 4 : 2;
                }
                int i3 = intValue2;
                if (!composer2.ZvpnNpCMEWSR3(i3 & 1, (i3 & 19) != 18)) {
                    composer2.gmXBnHsR2YSm();
                    break;
                } else {
                    String str2 = ((MenuUiState) state.getOyjLVtGms9eZwJ0()).oyjLVtGms9eZwJ0;
                    Modifier yzUZju8lbdmWa = exposedDropdownMenuBoxScope.b41X89IqSbKt().yzUZju8lbdmWa(SizeKt.yzPsTade5rL7D3);
                    Object UEutaskTsxaI = composer2.UEutaskTsxaI();
                    Object obj8 = Composer.Companion.yzPsTade5rL7D3;
                    if (UEutaskTsxaI == obj8) {
                        UEutaskTsxaI = new l3(5);
                        composer2.Yey4RyhSyBRHub(UEutaskTsxaI);
                    }
                    OutlinedTextFieldKt.yzPsTade5rL7D3(str2, (Function1) UEutaskTsxaI, yzUZju8lbdmWa, false, true, null, ComposableSingletons$MenuScreenKt.b41X89IqSbKt, null, ComposableLambdaKt.hRNgd2zGCE5kj(-1811542889, new l1(mutableState, 2), composer2), null, null, null, true, 0, 0, null, null, composer2, 806903856, 8256936);
                    boolean booleanValue = ((Boolean) mutableState.getOyjLVtGms9eZwJ0()).booleanValue();
                    Object UEutaskTsxaI2 = composer2.UEutaskTsxaI();
                    if (UEutaskTsxaI2 == obj8) {
                        UEutaskTsxaI2 = new fuDJENIYBwmKgKU(mutableState, 7);
                        composer2.Yey4RyhSyBRHub(UEutaskTsxaI2);
                    }
                    exposedDropdownMenuBoxScope.yzPsTade5rL7D3(booleanValue, (Function0) UEutaskTsxaI2, null, null, false, null, 0L, 0.0f, ComposableLambdaKt.hRNgd2zGCE5kj(-68167906, new t3(list, menuViewModel, mutableState, i2), composer2), composer2, 48, 6 | ((i3 << 3) & 112));
                    break;
                }
        }
        return unit;
    }

    public /* synthetic */ l0(Function2 function2, ContextMenuScope contextMenuScope, Function3 function3, Function0 function0) {
        this.b41X89IqSbKt = function2;
        this.gmXBnHsR2YSm = contextMenuScope;
        this.i7xAcZoXXiIt = function3;
        this.Uo5pffGf8LUU = function0;
    }
}
