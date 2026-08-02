package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class dh0 implements my0 {

    /* JADX INFO: renamed from: c */
    public static final Object f1647c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile Object f1648a = f1647c;

    /* JADX INFO: renamed from: b */
    public volatile my0 f1649b;

    public dh0(my0 my0Var) {
        this.f1649b = my0Var;
    }

    @Override // p000.my0
    public final Object get() {
        Object obj;
        Object obj2 = this.f1648a;
        Object obj3 = f1647c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f1648a;
                if (obj == obj3) {
                    obj = this.f1649b.get();
                    this.f1648a = obj;
                    this.f1649b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
