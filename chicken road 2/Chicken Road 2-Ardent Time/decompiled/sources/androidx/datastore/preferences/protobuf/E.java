package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class E implements androidx.datastore.preferences.protobuf.L {

    /* renamed from: a, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.L[] f2227a;

    @Override // androidx.datastore.preferences.protobuf.L
    public final boolean a(java.lang.Class cls) {
        for (androidx.datastore.preferences.protobuf.L l2 : this.f2227a) {
            if (l2.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final androidx.datastore.preferences.protobuf.V b(java.lang.Class cls) {
        for (androidx.datastore.preferences.protobuf.L l2 : this.f2227a) {
            if (l2.a(cls)) {
                return l2.b(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
