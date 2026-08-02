package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5372s;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class h0 extends i0<Object, Object> {
    @Override // androidx.datastore.preferences.protobuf.i0, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Comparable) obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void r() {
        if (!q()) {
            for (int i11 = 0; i11 < n(); i11++) {
                ((C5372s.b) m(i11).getKey()).getClass();
            }
            Iterator it = o().iterator();
            while (it.hasNext()) {
                ((C5372s.b) ((Map.Entry) it.next()).getKey()).getClass();
            }
        }
        super.r();
    }
}
