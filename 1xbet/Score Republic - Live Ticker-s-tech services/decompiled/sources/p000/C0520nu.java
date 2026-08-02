package p000;

/* JADX INFO: renamed from: nu */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0520nu implements ly0 {

    /* JADX INFO: renamed from: c */
    public static final Object f5544c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile ly0 f5545a;

    /* JADX INFO: renamed from: b */
    public volatile Object f5546b;

    /* JADX INFO: renamed from: a */
    public static ly0 m3589a(ly0 ly0Var) {
        if (ly0Var instanceof C0520nu) {
            return ly0Var;
        }
        C0520nu c0520nu = new C0520nu();
        c0520nu.f5546b = f5544c;
        c0520nu.f5545a = ly0Var;
        return c0520nu;
    }

    @Override // p000.ny0
    public final Object get() {
        Object obj;
        Object obj2 = this.f5546b;
        Object obj3 = f5544c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f5546b;
            if (obj == obj3) {
                obj = this.f5545a.get();
                Object obj4 = this.f5546b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f5546b = obj;
                this.f5545a = null;
            }
        }
        return obj;
    }
}
