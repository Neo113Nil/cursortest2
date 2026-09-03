package defpackage;

import androidx.compose.material3.ExposedDropdownMenu_androidKt;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements Function2 {
    public final /* synthetic */ int b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ s1(int i, int i2, Object obj) {
        this.oyjLVtGms9eZwJ0 = i2;
        this.gmXBnHsR2YSm = obj;
        this.b41X89IqSbKt = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.b41X89IqSbKt;
        Object obj3 = this.gmXBnHsR2YSm;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ExposedDropdownMenu_androidKt.yzPsTade5rL7D3((Function0) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                SnackbarHostKt.yzPsTade5rL7D3((SnackbarHostState) obj3, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
        }
        return unit;
    }
}
