package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mj0 {

    /* JADX INFO: renamed from: b */
    public static final C0794v8 f5054b = new C0794v8("internal:health-checking-config");

    /* JADX INFO: renamed from: c */
    public static final u90 f5055c = new u90(4);

    /* JADX INFO: renamed from: d */
    public static final C0794v8 f5056d = new C0794v8("internal:has-health-check-producer-listener");

    /* JADX INFO: renamed from: e */
    public static final C0794v8 f5057e = new C0794v8("io.grpc.IS_PETIOLE_POLICY");

    /* JADX INFO: renamed from: a */
    public int f5058a;

    /* JADX INFO: renamed from: a */
    public ja1 mo1387a(jj0 jj0Var) {
        List list = jj0Var.f3946a;
        if (!list.isEmpty() || mo3396b()) {
            int i = this.f5058a;
            this.f5058a = i + 1;
            if (i == 0) {
                mo1389d(jj0Var);
            }
            this.f5058a = 0;
            return ja1.f3875e;
        }
        ja1 ja1VarM2840h = ja1.f3883m.m2840h("NameResolver returned no usable address. addrs=" + list + ", attrs=" + jj0Var.f3947b);
        mo1388c(ja1VarM2840h);
        return ja1VarM2840h;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo3396b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo1388c(ja1 ja1Var);

    /* JADX INFO: renamed from: d */
    public void mo1389d(jj0 jj0Var) {
        int i = this.f5058a;
        this.f5058a = i + 1;
        if (i == 0) {
            mo1387a(jj0Var);
        }
        this.f5058a = 0;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo1390f();

    /* JADX INFO: renamed from: e */
    public void mo3397e() {
    }
}
