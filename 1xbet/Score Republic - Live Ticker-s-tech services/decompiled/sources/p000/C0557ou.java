package p000;

/* JADX INFO: renamed from: ou */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0557ou implements ny0 {

    /* JADX INFO: renamed from: c */
    public static final Object f5913c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC0968zy f5914a;

    /* JADX INFO: renamed from: b */
    public volatile Object f5915b;

    /* JADX INFO: renamed from: a */
    public static ny0 m3795a(InterfaceC0968zy interfaceC0968zy) {
        if (interfaceC0968zy instanceof C0557ou) {
            return interfaceC0968zy;
        }
        C0557ou c0557ou = new C0557ou();
        c0557ou.f5915b = f5913c;
        c0557ou.f5914a = interfaceC0968zy;
        return c0557ou;
    }

    @Override // p000.ny0
    public final Object get() {
        Object obj;
        Object obj2 = this.f5915b;
        Object obj3 = f5913c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f5915b;
                if (obj == obj3) {
                    obj = this.f5914a.get();
                    Object obj4 = this.f5915b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f5915b = obj;
                    this.f5914a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
