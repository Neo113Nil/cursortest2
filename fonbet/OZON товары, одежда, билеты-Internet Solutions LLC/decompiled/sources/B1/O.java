package B1;

import B1.y0;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class O extends AbstractC7737t implements Function1<Map.Entry<Object, y0.a>, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L f2080b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O(L l11) {
        super(1);
        this.f2080b = l11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Map.Entry<Object, y0.a> entry) {
        U0.b bVar;
        boolean z11;
        int i11;
        Map.Entry<Object, y0.a> entry2 = entry;
        Object key = entry2.getKey();
        y0.a value = entry2.getValue();
        L l11 = this.f2080b;
        bVar = l11.f2046m;
        int n11 = bVar.n(key);
        if (n11 >= 0) {
            i11 = l11.f2038e;
            if (n11 < i11) {
                z11 = false;
                return Boolean.valueOf(z11);
            }
        }
        value.dispose();
        z11 = true;
        return Boolean.valueOf(z11);
    }
}
