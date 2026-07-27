package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144t implements L {

    /* renamed from: b, reason: collision with root package name */
    public static final C0144t f2296b = new C0144t(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2297a;

    public /* synthetic */ C0144t(int i3) {
        this.f2297a = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final V a(Class cls) {
        switch (this.f2297a) {
            case 0:
                if (!AbstractC0147w.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (V) AbstractC0147w.d(cls.asSubclass(AbstractC0147w.class)).c(3);
                } catch (Exception e3) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final boolean b(Class cls) {
        switch (this.f2297a) {
            case 0:
                return AbstractC0147w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
