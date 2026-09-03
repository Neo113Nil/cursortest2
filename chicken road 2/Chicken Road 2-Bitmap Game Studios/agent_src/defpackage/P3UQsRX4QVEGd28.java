package defpackage;

import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class P3UQsRX4QVEGd28 implements Function1 {
    public final /* synthetic */ MutableState b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ P3UQsRX4QVEGd28(MutableState mutableState, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object uypNJrpDByoB(Object obj) {
        int i = this.oyjLVtGms9eZwJ0;
        Unit unit = Unit.yzPsTade5rL7D3;
        MutableState mutableState = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                mutableState.setValue((LayoutCoordinates) obj);
                break;
            case 1:
                mutableState.setValue((LayoutCoordinates) obj);
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                mutableState.setValue(bool);
                break;
            case 3:
                mutableState.setValue((LayoutCoordinates) obj);
                break;
            case 4:
                Float f = (Float) obj;
                f.getClass();
                break;
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                ((Function1) mutableState.getOyjLVtGms9eZwJ0()).uypNJrpDByoB((Offset) obj);
                break;
            case WindowInsetsSides.hRNgd2zGCE5kj /* 6 */:
                mutableState.setValue((LayoutCoordinates) obj);
                break;
            default:
                int i2 = WideNavigationRailKt.yzPsTade5rL7D3;
                mutableState.setValue(Boolean.TRUE);
                break;
        }
        return unit;
    }
}
