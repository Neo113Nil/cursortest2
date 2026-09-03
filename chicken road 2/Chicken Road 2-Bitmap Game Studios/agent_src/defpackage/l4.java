package defpackage;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.navigation.NavBackStackEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class l4 implements Function0 {
    public final /* synthetic */ State b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ l4(State state, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object hRNgd2zGCE5kj() {
        int i = this.oyjLVtGms9eZwJ0;
        State state = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                List list = (List) state.getOyjLVtGms9eZwJ0();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.yzPsTade5rL7D3(((NavBackStackEntry) obj).b41X89IqSbKt.oyjLVtGms9eZwJ0, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                float f = NavigationBarKt.yzPsTade5rL7D3;
                return Float.valueOf(((Number) state.getOyjLVtGms9eZwJ0()).floatValue());
            case 2:
                float f2 = NavigationBarKt.yzPsTade5rL7D3;
                return Float.valueOf(((Number) state.getOyjLVtGms9eZwJ0()).floatValue());
            case 3:
                AnimationVector2D animationVector2D = SelectionMagnifierKt.yzPsTade5rL7D3;
                return new Offset(((Offset) state.getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3);
            case 4:
                AnimationVector2D animationVector2D2 = SelectionMagnifierKt.yzPsTade5rL7D3;
                return new Offset(((Offset) state.getOyjLVtGms9eZwJ0()).yzPsTade5rL7D3);
            case WindowInsetsSides.oyjLVtGms9eZwJ0 /* 5 */:
                return Boolean.valueOf(((Number) state.getOyjLVtGms9eZwJ0()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) state.getOyjLVtGms9eZwJ0()).floatValue() > 0.0f);
        }
    }
}
