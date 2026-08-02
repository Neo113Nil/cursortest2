package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pb1 implements nb1 {

    /* JADX INFO: renamed from: l */
    public static final dd0 f6072l = new dd0(26);

    /* JADX INFO: renamed from: j */
    public volatile nb1 f6073j;

    /* JADX INFO: renamed from: k */
    public Object f6074k;

    @Override // p000.nb1
    public final Object get() {
        nb1 nb1Var = this.f6073j;
        dd0 dd0Var = f6072l;
        if (nb1Var != dd0Var) {
            synchronized (this) {
                try {
                    if (this.f6073j != dd0Var) {
                        Object obj = this.f6073j.get();
                        this.f6074k = obj;
                        this.f6073j = dd0Var;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f6074k;
    }

    public final String toString() {
        Object obj = this.f6073j;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f6072l) {
            obj = "<supplier that returned " + this.f6074k + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
