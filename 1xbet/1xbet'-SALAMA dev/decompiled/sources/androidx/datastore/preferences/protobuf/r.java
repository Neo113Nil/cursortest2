package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class r implements J {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f9251b = new r(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9252a;

    public /* synthetic */ r(int i7) {
        this.f9252a = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public final T a(Class cls) {
        switch (this.f9252a) {
            case 0:
                if (!AbstractC0675u.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (T) AbstractC0675u.f(cls.asSubclass(AbstractC0675u.class)).e(3);
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public final boolean b(Class cls) {
        switch (this.f9252a) {
            case 0:
                return AbstractC0675u.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
