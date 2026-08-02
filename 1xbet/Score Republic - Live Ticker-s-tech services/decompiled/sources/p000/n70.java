package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class n70 implements po0 {

    /* JADX INFO: renamed from: b */
    public static final n70 f5316b = new n70(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5317a;

    public /* synthetic */ n70(int i) {
        this.f5317a = i;
    }

    @Override // p000.po0
    /* JADX INFO: renamed from: a */
    public final zz0 mo3487a(Class cls) {
        switch (this.f5317a) {
            case 0:
                if (!t70.class.isAssignableFrom(cls)) {
                    C0270h1.m2190f("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (zz0) t70.m4751d(cls.asSubclass(t70.class)).mo507c(3);
                } catch (Exception e) {
                    C0270h1.m2189e("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // p000.po0
    /* JADX INFO: renamed from: b */
    public final boolean mo3488b(Class cls) {
        switch (this.f5317a) {
            case 0:
                return t70.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
