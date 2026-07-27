package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223s implements K {

    /* renamed from: b, reason: collision with root package name */
    public static final C0223s f4504b = new C0223s(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4505a;

    public /* synthetic */ C0223s(int i2) {
        this.f4505a = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final U a(Class cls) {
        switch (this.f4505a) {
            case 0:
                if (!AbstractC0226v.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (U) AbstractC0226v.f(cls.asSubclass(AbstractC0226v.class)).e(3);
                } catch (Exception e3) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final boolean b(Class cls) {
        switch (this.f4505a) {
            case 0:
                return AbstractC0226v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
