package defpackage;

import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.material3.internal.BackHandler_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class kkTDm4I9sca9X implements Function2 {
    public final /* synthetic */ boolean b41X89IqSbKt;
    public final /* synthetic */ int gmXBnHsR2YSm;
    public final /* synthetic */ Function i7xAcZoXXiIt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ kkTDm4I9sca9X(boolean z, Function function, int i, int i2) {
        this.oyjLVtGms9eZwJ0 = i2;
        this.b41X89IqSbKt = z;
        this.i7xAcZoXXiIt = function;
        this.gmXBnHsR2YSm = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        int i2 = this.gmXBnHsR2YSm;
        Function function = this.i7xAcZoXXiIt;
        boolean z = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                BackHandler_androidKt.yzPsTade5rL7D3(z, (Function0) function, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                PredictiveBackHandlerKt.yzPsTade5rL7D3(z, (Function2) function, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(i2 | 1));
                break;
        }
        return unit;
    }
}
