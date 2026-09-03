package defpackage;

import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function8;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements Function8 {
    @Override // kotlin.jvm.functions.Function8
    public final Object UEutaskTsxaI(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
        int i;
        String str = (String) obj;
        boolean booleanValue = bool.booleanValue();
        ContextMenuColors contextMenuColors = (ContextMenuColors) obj2;
        Function3 function3 = (Function3) obj3;
        Function0 function0 = (Function0) obj4;
        int intValue = num.intValue();
        int i2 = intValue & 6;
        Modifier.Companion companion = Modifier.Companion.oyjLVtGms9eZwJ0;
        if (i2 == 0) {
            i = (composer.zgejW39NNp2D(companion) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= composer.zgejW39NNp2D(str) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i |= composer.oyjLVtGms9eZwJ0(booleanValue) ? 256 : 128;
        }
        if ((intValue & 3072) == 0) {
            i |= composer.zgejW39NNp2D(contextMenuColors) ? 2048 : 1024;
        }
        if ((intValue & 24576) == 0) {
            i |= composer.NIabVTHf6LMJyXq(function3) ? 16384 : 8192;
        }
        if ((intValue & 196608) == 0) {
            i |= composer.NIabVTHf6LMJyXq(function0) ? 131072 : 65536;
        }
        if (composer.ZvpnNpCMEWSR3(i & 1, (599187 & i) != 599186)) {
            ContextMenuUiKt.ra306ClFT3HT(str, booleanValue, contextMenuColors, companion, function3, function0, composer, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            composer.gmXBnHsR2YSm();
        }
        return Unit.yzPsTade5rL7D3;
    }
}
