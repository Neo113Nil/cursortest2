package defpackage;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl;
import androidx.compose.foundation.PlatformMagnifierFactoryApi29Impl;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class b8 implements Function1 {
    public final /* synthetic */ Density b41X89IqSbKt;
    public final /* synthetic */ MutableState gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ b8(Density density, MutableState mutableState, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = density;
        this.gmXBnHsR2YSm = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        MutableState mutableState = this.gmXBnHsR2YSm;
        Density density = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                fKfRGTKlrcIcfy fkfrgtklrcicfy = new fKfRGTKlrcIcfy(6, (Function0) obj);
                b8 b8Var = new b8(density, mutableState, 1);
                if (Magnifier_androidKt.yzPsTade5rL7D3()) {
                    return Magnifier_androidKt.yzPsTade5rL7D3() ? new MagnifierElement(fkfrgtklrcicfy, b8Var, Build.VERSION.SDK_INT == 28 ? PlatformMagnifierFactoryApi28Impl.yzPsTade5rL7D3 : PlatformMagnifierFactoryApi29Impl.yzPsTade5rL7D3) : Modifier.Companion.oyjLVtGms9eZwJ0;
                }
                h1.XrorSzThrtvJ4A("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                DpSize dpSize = (DpSize) obj;
                mutableState.setValue(new IntSize((density.uMAEPvJoKWq8X(DpSize.ra306ClFT3HT(dpSize.yzPsTade5rL7D3)) & 4294967295L) | (density.uMAEPvJoKWq8X(DpSize.oyjLVtGms9eZwJ0(dpSize.yzPsTade5rL7D3)) << 32)));
                return Unit.yzPsTade5rL7D3;
        }
    }
}
