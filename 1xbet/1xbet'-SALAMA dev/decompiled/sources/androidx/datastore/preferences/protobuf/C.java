package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class C implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public J[] f9105a;

    @Override // androidx.datastore.preferences.protobuf.J
    public final T a(Class cls) {
        for (J j : this.f9105a) {
            if (j.b(cls)) {
                return j.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public final boolean b(Class cls) {
        for (J j : this.f9105a) {
            if (j.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
