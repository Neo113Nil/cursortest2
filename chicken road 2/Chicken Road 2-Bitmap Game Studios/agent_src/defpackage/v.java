package defpackage;

import androidx.compose.ui.semantics.SemanticsSortKt;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Comparator {
    public final /* synthetic */ Object hRNgd2zGCE5kj;
    public final /* synthetic */ int yzPsTade5rL7D3;

    public /* synthetic */ v(int i, Object obj) {
        this.yzPsTade5rL7D3 = i;
        this.hRNgd2zGCE5kj = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.yzPsTade5rL7D3;
        Object obj3 = this.hRNgd2zGCE5kj;
        switch (i) {
            case 0:
                for (Function1 function1 : (Function1[]) obj3) {
                    int hRNgd2zGCE5kj = ComparisonsKt.hRNgd2zGCE5kj((Comparable) function1.uypNJrpDByoB(obj), (Comparable) function1.uypNJrpDByoB(obj2));
                    if (hRNgd2zGCE5kj != 0) {
                        return hRNgd2zGCE5kj;
                    }
                }
                return 0;
            default:
                Comparator[] comparatorArr = SemanticsSortKt.yzPsTade5rL7D3;
                return ((Number) ((Function2) obj3).kSPEzfraxudm4i(obj, obj2)).intValue();
        }
    }
}
