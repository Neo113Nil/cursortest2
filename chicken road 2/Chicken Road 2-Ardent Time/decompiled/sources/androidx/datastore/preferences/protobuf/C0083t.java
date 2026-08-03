package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083t implements androidx.datastore.preferences.protobuf.L {

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.C0083t f2372b = new androidx.datastore.preferences.protobuf.C0083t(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2373a;

    public /* synthetic */ C0083t(int i2) {
        this.f2373a = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final boolean a(java.lang.Class cls) {
        switch (this.f2373a) {
            case 0:
                return androidx.datastore.preferences.protobuf.AbstractC0086w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final androidx.datastore.preferences.protobuf.V b(java.lang.Class cls) {
        switch (this.f2373a) {
            case 0:
                if (!androidx.datastore.preferences.protobuf.AbstractC0086w.class.isAssignableFrom(cls)) {
                    throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (androidx.datastore.preferences.protobuf.V) androidx.datastore.preferences.protobuf.AbstractC0086w.f(cls.asSubclass(androidx.datastore.preferences.protobuf.AbstractC0086w.class)).e(3);
                } catch (java.lang.Exception e2) {
                    throw new java.lang.RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new java.lang.IllegalStateException("This should never be called.");
        }
    }
}
