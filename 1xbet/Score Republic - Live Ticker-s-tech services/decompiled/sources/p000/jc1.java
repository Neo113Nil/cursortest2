package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jc1 implements Serializable {

    /* JADX INFO: renamed from: j */
    public f60 f3903j;

    /* JADX INFO: renamed from: k */
    public volatile Object f3904k = wa0.f8475o;

    /* JADX INFO: renamed from: l */
    public final Object f3905l = this;

    public jc1(f60 f60Var) {
        this.f3903j = f60Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m2847a() {
        Object objMo1083a;
        Object obj = this.f3904k;
        wa0 wa0Var = wa0.f8475o;
        if (obj != wa0Var) {
            return obj;
        }
        synchronized (this.f3905l) {
            objMo1083a = this.f3904k;
            if (objMo1083a == wa0Var) {
                f60 f60Var = this.f3903j;
                f60Var.getClass();
                objMo1083a = f60Var.mo1083a();
                this.f3904k = objMo1083a;
                this.f3903j = null;
            }
        }
        return objMo1083a;
    }

    public final String toString() {
        return this.f3904k != wa0.f8475o ? String.valueOf(m2847a()) : "Lazy value not initialized yet.";
    }
}
