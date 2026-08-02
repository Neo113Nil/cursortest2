package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class m70 implements oo0 {

    /* JADX INFO: renamed from: b */
    public static final m70 f4995b = new m70(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4996a;

    public /* synthetic */ m70(int i) {
        this.f4996a = i;
    }

    @Override // p000.oo0
    /* JADX INFO: renamed from: a */
    public final yz0 mo3329a(Class cls) {
        switch (this.f4996a) {
            case 0:
                if (!s70.class.isAssignableFrom(cls)) {
                    C0270h1.m2190f("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (yz0) s70.m4490f(cls.asSubclass(s70.class)).mo182e(3);
                } catch (Exception e) {
                    C0270h1.m2189e("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // p000.oo0
    /* JADX INFO: renamed from: b */
    public final boolean mo3330b(Class cls) {
        switch (this.f4996a) {
            case 0:
                return s70.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
