package p000;

/* JADX INFO: renamed from: mu */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0483mu implements oy0 {

    /* JADX INFO: renamed from: c */
    public static final Object f5161c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC0931yy f5162a;

    /* JADX INFO: renamed from: b */
    public volatile Object f5163b;

    /* JADX INFO: renamed from: a */
    public static oy0 m3430a(InterfaceC0931yy interfaceC0931yy) {
        if (interfaceC0931yy instanceof C0483mu) {
            return interfaceC0931yy;
        }
        C0483mu c0483mu = new C0483mu();
        c0483mu.f5163b = f5161c;
        c0483mu.f5162a = interfaceC0931yy;
        return c0483mu;
    }

    @Override // p000.ny0
    public final Object get() {
        Object obj;
        Object obj2 = this.f5163b;
        Object obj3 = f5161c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f5163b;
            if (obj == obj3) {
                obj = this.f5162a.get();
                Object obj4 = this.f5163b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f5163b = obj;
                this.f5162a = null;
            }
        }
        return obj;
    }
}
