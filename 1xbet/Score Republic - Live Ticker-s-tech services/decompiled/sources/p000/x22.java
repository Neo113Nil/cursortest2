package p000;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class x22 {

    /* JADX INFO: renamed from: j */
    public static final Object f8759j = new Object();

    /* JADX INFO: renamed from: k */
    public static final AtomicReference f8760k = new AtomicReference();

    /* JADX INFO: renamed from: l */
    public static volatile x22 f8761l = null;

    /* JADX INFO: renamed from: m */
    public static final nb1 f8762m = a90.m137u(bx1.f1045o);

    /* JADX INFO: renamed from: a */
    public final oq0 f8763a = new oq0(15);

    /* JADX INFO: renamed from: b */
    public final Context f8764b;

    /* JADX INFO: renamed from: c */
    public final nb1 f8765c;

    /* JADX INFO: renamed from: d */
    public final nb1 f8766d;

    /* JADX INFO: renamed from: e */
    public final nb1 f8767e;

    /* JADX INFO: renamed from: f */
    public final nb1 f8768f;

    /* JADX INFO: renamed from: g */
    public final b82 f8769g;

    /* JADX INFO: renamed from: h */
    public final nb1 f8770h;

    /* JADX INFO: renamed from: i */
    public final p72 f8771i;

    public x22(Context context, nb1 nb1Var, nb1 nb1Var2, nb1 nb1Var3, nb1 nb1Var4, nb1 nb1Var5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        nb1Var.getClass();
        nb1Var2.getClass();
        nb1Var3.getClass();
        nb1Var4.getClass();
        nb1Var5.getClass();
        nb1 nb1VarM137u = a90.m137u(nb1Var);
        nb1 nb1VarM137u2 = a90.m137u(nb1Var2);
        nb1 nb1VarM137u3 = a90.m137u(new c32(0, nb1Var3));
        nb1 nb1VarM137u4 = a90.m137u(nb1Var4);
        nb1 nb1VarM137u5 = a90.m137u(nb1Var5);
        this.f8764b = applicationContext;
        this.f8765c = nb1VarM137u;
        this.f8766d = nb1VarM137u2;
        this.f8767e = nb1VarM137u3;
        this.f8768f = nb1VarM137u4;
        this.f8769g = new b82(applicationContext, nb1VarM137u, nb1VarM137u4, nb1VarM137u2);
        this.f8770h = nb1VarM137u5;
        this.f8771i = new p72(applicationContext, nb1VarM137u, nb1VarM137u3, nb1VarM137u2);
    }

    /* JADX INFO: renamed from: b */
    public static void m5497b() {
        synchronized (m80.f5002m) {
        }
        if (f8760k.get() == null && m80.f5003n == null) {
            m80.f5003n = new p61(1);
        }
    }

    /* JADX INFO: renamed from: a */
    public final mq0 m5498a() {
        return (mq0) this.f8765c.get();
    }
}
