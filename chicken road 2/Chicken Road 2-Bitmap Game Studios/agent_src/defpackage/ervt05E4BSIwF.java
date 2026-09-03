package defpackage;

import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.BottomSheetDefaults;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class ervt05E4BSIwF implements Function1 {
    public final /* synthetic */ String b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ ervt05E4BSIwF(String str, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        String str = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                SemanticsPropertiesKt.FsuUJlzzWhYnMlD(semanticsPropertyReceiver, 1);
                SemanticsPropertiesKt.UEutaskTsxaI(semanticsPropertyReceiver, str);
                return unit;
            case 1:
                BottomSheetDefaults bottomSheetDefaults = BottomSheetDefaults.yzPsTade5rL7D3;
                SemanticsPropertiesKt.gmXBnHsR2YSm((SemanticsPropertyReceiver) obj, str);
                return unit;
            case 2:
                SemanticsPropertiesKt.UEutaskTsxaI((SemanticsPropertyReceiver) obj, str);
                return unit;
            case 3:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                SemanticsPropertiesKt.FsuUJlzzWhYnMlD(semanticsPropertyReceiver2, 0);
                SemanticsPropertiesKt.gmXBnHsR2YSm(semanticsPropertyReceiver2, str);
                return unit;
            case 4:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                Modifier modifier = IconKt.yzPsTade5rL7D3;
                SemanticsPropertiesKt.gmXBnHsR2YSm(semanticsPropertyReceiver3, str);
                SemanticsPropertiesKt.MRfxZSx8l5UG62U(semanticsPropertyReceiver3, 5);
                return unit;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                int i2 = ModalBottomSheetKt.hRNgd2zGCE5kj;
                SemanticsPropertiesKt.UEutaskTsxaI(semanticsPropertyReceiver4, str);
                SemanticsPropertiesKt.NIabVTHf6LMJyXq(semanticsPropertyReceiver4, 0.0f);
                return unit;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                return Boolean.valueOf(Intrinsics.yzPsTade5rL7D3((String) obj, str));
            case 7:
                String str2 = (String) obj;
                str2.getClass();
                return StringsKt.GiTAvmtrM6Bh8SJ(str2) ? str2.length() < str.length() ? str : str2 : str.concat(str2);
            default:
                KProperty[] kPropertyArr = SemanticsPropertiesKt.yzPsTade5rL7D3;
                ((SemanticsPropertyReceiver) obj).hRNgd2zGCE5kj(SemanticsProperties.K6HLhdE38aTVLa, str);
                return unit;
        }
    }
}
