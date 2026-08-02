package Td;

import Td.g;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class t extends u<Object, Object> {
    @Override // Td.u
    public final void p() {
        if (!o()) {
            for (int i11 = 0; i11 < l(); i11++) {
                Map.Entry<Object, Object> k11 = k(i11);
                if (((g.b) k11.getKey()).isRepeated()) {
                    k11.setValue(Collections.unmodifiableList((List) k11.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : m()) {
                if (((g.b) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.p();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return q((g.b) obj, obj2);
    }
}
