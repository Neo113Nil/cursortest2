package defpackage;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements Function1 {
    public final /* synthetic */ String b41X89IqSbKt;
    public final /* synthetic */ String gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ v0(int i, String str, String str2) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = str;
        this.gmXBnHsR2YSm = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        String str = this.gmXBnHsR2YSm;
        String str2 = this.b41X89IqSbKt;
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                SemanticsPropertiesKt.gmXBnHsR2YSm(semanticsPropertyReceiver, str2 + ", " + str);
                break;
            case 1:
                SemanticsPropertiesKt.gmXBnHsR2YSm(semanticsPropertyReceiver, str2 + ", " + str);
                break;
            default:
                SemanticsPropertiesKt.gmXBnHsR2YSm(semanticsPropertyReceiver, str2 + ", " + str);
                break;
        }
        return unit;
    }
}
