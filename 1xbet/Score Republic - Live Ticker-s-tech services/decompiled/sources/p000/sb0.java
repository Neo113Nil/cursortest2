package p000;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class sb0 implements hq0 {

    /* JADX INFO: renamed from: b */
    public static final ru0 f7088b = ru0.m4406a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: a */
    public final jg0 f7089a;

    public sb0(jg0 jg0Var) {
        this.f7089a = jg0Var;
    }

    @Override // p000.hq0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo639a(Object obj) {
        return true;
    }

    @Override // p000.hq0
    /* JADX INFO: renamed from: b */
    public final gq0 mo640b(Object obj, int i, int i2, uu0 uu0Var) {
        z80 z80Var = (z80) obj;
        jg0 jg0Var = this.f7089a;
        if (jg0Var != null) {
            eq0 eq0Var = (eq0) jg0Var.f3922k;
            fq0 fq0VarM1884a = fq0.m1884a(z80Var);
            Object objM4106a = eq0Var.m4106a(fq0VarM1884a);
            ArrayDeque arrayDeque = fq0.f2473b;
            synchronized (arrayDeque) {
                arrayDeque.offer(fq0VarM1884a);
            }
            z80 z80Var2 = (z80) objM4106a;
            if (z80Var2 == null) {
                eq0Var.m4108d(fq0.m1884a(z80Var), z80Var);
            } else {
                z80Var = z80Var2;
            }
        }
        return new gq0(z80Var, new ub0(z80Var, ((Integer) uu0Var.m4955c(f7088b)).intValue()));
    }
}
