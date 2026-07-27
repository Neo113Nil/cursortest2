package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class J {
    public static I a(Object obj, Object obj2) {
        I i3 = (I) obj;
        I i4 = (I) obj2;
        if (!i4.isEmpty()) {
            if (!i3.f2167a) {
                i3 = i3.b();
            }
            i3.a();
            if (!i4.isEmpty()) {
                i3.putAll(i4);
            }
        }
        return i3;
    }
}
