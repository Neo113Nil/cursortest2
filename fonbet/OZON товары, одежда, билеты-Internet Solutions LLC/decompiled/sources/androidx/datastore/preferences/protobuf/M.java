package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.J;
import java.util.Map;

/* loaded from: classes.dex */
final class M implements L {
    @Override // androidx.datastore.preferences.protobuf.L
    public final K a() {
        return K.e().m();
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final K forMapData(Object obj) {
        return (K) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final J.a<?, ?> forMapMetadata(Object obj) {
        return ((J) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final K forMutableMapData(Object obj) {
        return (K) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final int getSerializedSize(int i11, Object obj, Object obj2) {
        K k11 = (K) obj;
        J j11 = (J) obj2;
        int i12 = 0;
        if (k11.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : k11.entrySet()) {
            i12 += j11.a(i11, entry.getKey(), entry.getValue());
        }
        return i12;
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final boolean isImmutable(Object obj) {
        return !((K) obj).i();
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final K mergeFrom(Object obj, Object obj2) {
        K k11 = (K) obj;
        K k12 = (K) obj2;
        if (!k12.isEmpty()) {
            if (!k11.i()) {
                k11 = k11.m();
            }
            k11.l(k12);
        }
        return k11;
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final Object toImmutable(Object obj) {
        ((K) obj).j();
        return obj;
    }
}
