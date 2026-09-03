package defpackage;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class GDGFDp2lxiHY implements Function2 {
    public final /* synthetic */ Modifier b41X89IqSbKt;
    public final /* synthetic */ int gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 1;

    public /* synthetic */ GDGFDp2lxiHY(Modifier modifier, int i) {
        this.b41X89IqSbKt = modifier;
        this.gmXBnHsR2YSm = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.gmXBnHsR2YSm;
        Modifier modifier = this.b41X89IqSbKt;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AndroidCursorHandle_androidKt.hRNgd2zGCE5kj(modifier, composer, RecomposeScopeImplKt.yzPsTade5rL7D3(1), i2);
                break;
            default:
                BoxKt.yzPsTade5rL7D3(modifier, composer, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
        }
        return unit;
    }

    public /* synthetic */ GDGFDp2lxiHY(Modifier modifier, int i, int i2) {
        this.b41X89IqSbKt = modifier;
        this.gmXBnHsR2YSm = i2;
    }
}
