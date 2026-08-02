package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qc1 {

    /* JADX INFO: renamed from: a */
    public final v92 f6465a = new v92();

    /* JADX INFO: renamed from: a */
    public final void m4060a(Exception exc) {
        this.f6465a.m5136l(exc);
    }

    /* JADX INFO: renamed from: b */
    public final void m4061b(Object obj) {
        this.f6465a.m5135k(obj);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4062c(Exception exc) {
        v92 v92Var = this.f6465a;
        v92Var.getClass();
        p80.m3864i(exc, "Exception must not be null");
        synchronized (v92Var.f8140a) {
            try {
                if (v92Var.f8142c) {
                    return false;
                }
                v92Var.f8142c = true;
                v92Var.f8145f = exc;
                v92Var.f8141b.m3365o(v92Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4063d(Object obj) {
        v92 v92Var = this.f6465a;
        synchronized (v92Var.f8140a) {
            try {
                if (v92Var.f8142c) {
                    return;
                }
                v92Var.f8142c = true;
                v92Var.f8144e = obj;
                v92Var.f8141b.m3365o(v92Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
