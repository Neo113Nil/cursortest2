package defpackage;

import androidx.compose.material3.TabKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class k3 implements Function2 {
    public final /* synthetic */ Function2 b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0 = 1;

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        int i = this.oyjLVtGms9eZwJ0;
        Function2 function2 = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                SaverScope saverScope = (SaverScope) obj;
                List list = (List) function2.kSPEzfraxudm4i(saverScope, obj2);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (obj3 != null && !saverScope.hRNgd2zGCE5kj(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            default:
                ((Integer) obj2).getClass();
                TabKt.ra306ClFT3HT(function2, (Composer) obj, RecomposeScopeImplKt.yzPsTade5rL7D3(1));
                return Unit.yzPsTade5rL7D3;
        }
    }
}
