package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class J {
    public static int a(int i2, java.lang.Object obj, java.lang.Object obj2) {
        androidx.datastore.preferences.protobuf.I i3 = (androidx.datastore.preferences.protobuf.I) obj;
        androidx.datastore.preferences.protobuf.H h2 = (androidx.datastore.preferences.protobuf.H) obj2;
        int i4 = 0;
        if (!i3.isEmpty()) {
            for (java.util.Map.Entry entry : i3.entrySet()) {
                java.lang.Object key = entry.getKey();
                java.lang.Object value = entry.getValue();
                h2.getClass();
                int Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i2);
                int a2 = androidx.datastore.preferences.protobuf.H.a(h2.f2233a, key, value);
                i4 += androidx.datastore.preferences.protobuf.C0077m.b0(a2) + a2 + Z2;
            }
        }
        return i4;
    }

    public static androidx.datastore.preferences.protobuf.I b(java.lang.Object obj, java.lang.Object obj2) {
        androidx.datastore.preferences.protobuf.I i2 = (androidx.datastore.preferences.protobuf.I) obj;
        androidx.datastore.preferences.protobuf.I i3 = (androidx.datastore.preferences.protobuf.I) obj2;
        if (!i3.isEmpty()) {
            if (!i2.f2235a) {
                i2 = i2.b();
            }
            i2.a();
            if (!i3.isEmpty()) {
                i2.putAll(i3);
            }
        }
        return i2;
    }

    public static void c(java.lang.Object obj) {
        ((androidx.datastore.preferences.protobuf.I) obj).f2235a = false;
    }
}
