package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ob1 implements nb1, Serializable {

    /* JADX INFO: renamed from: j */
    public final nb1 f5690j;

    /* JADX INFO: renamed from: k */
    public volatile transient boolean f5691k;

    /* JADX INFO: renamed from: l */
    public transient Object f5692l;

    public ob1(nb1 nb1Var) {
        nb1Var.getClass();
        this.f5690j = nb1Var;
    }

    @Override // p000.nb1
    public final Object get() {
        if (!this.f5691k) {
            synchronized (this) {
                try {
                    if (!this.f5691k) {
                        Object obj = this.f5690j.get();
                        this.f5692l = obj;
                        this.f5691k = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f5692l;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f5691k) {
            obj = "<supplier that returned " + this.f5692l + ">";
        } else {
            obj = this.f5690j;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
