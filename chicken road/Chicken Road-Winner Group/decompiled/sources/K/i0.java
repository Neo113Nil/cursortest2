package K;

import h2.EnumC0326a;
import i2.AbstractC0343b;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final E2.d f856a = new E2.d();

    /* renamed from: b, reason: collision with root package name */
    public final J1.i f857b = new J1.i(6);

    /* renamed from: c, reason: collision with root package name */
    public final io.flutter.plugin.editing.k f858c = new io.flutter.plugin.editing.k((o2.p) new h0(2, null));

    public i0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f857b.f729b).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r9.c(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(o2.l lVar, AbstractC0343b abstractC0343b) {
        f0 f0Var;
        EnumC0326a enumC0326a;
        int i3;
        E2.d dVar;
        Throwable th;
        E2.a aVar;
        Object invoke;
        try {
            if (abstractC0343b instanceof f0) {
                f0Var = (f0) abstractC0343b;
                int i4 = f0Var.f845h;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    f0Var.f845h = i4 - Integer.MIN_VALUE;
                    Object obj = f0Var.f;
                    enumC0326a = EnumC0326a.f4994a;
                    i3 = f0Var.f845h;
                    if (i3 != 0) {
                        X0.a.L(obj);
                        f0Var.f842d = lVar;
                        dVar = this.f856a;
                        f0Var.f843e = dVar;
                        f0Var.f845h = 1;
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = (E2.a) f0Var.f842d;
                            try {
                                X0.a.L(obj);
                                ((E2.d) aVar).e(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ((E2.d) aVar).e(null);
                                throw th;
                            }
                        }
                        E2.d dVar2 = f0Var.f843e;
                        o2.l lVar2 = (o2.l) f0Var.f842d;
                        X0.a.L(obj);
                        dVar = dVar2;
                        lVar = lVar2;
                    }
                    f0Var.f842d = dVar;
                    f0Var.f843e = null;
                    f0Var.f845h = 2;
                    invoke = lVar.invoke(f0Var);
                    if (invoke != enumC0326a) {
                        E2.d dVar3 = dVar;
                        obj = invoke;
                        aVar = dVar3;
                        ((E2.d) aVar).e(null);
                        return obj;
                    }
                    return enumC0326a;
                }
            }
            f0Var.f842d = dVar;
            f0Var.f843e = null;
            f0Var.f845h = 2;
            invoke = lVar.invoke(f0Var);
            if (invoke != enumC0326a) {
            }
            return enumC0326a;
        } catch (Throwable th3) {
            E2.d dVar4 = dVar;
            th = th3;
            aVar = dVar4;
            ((E2.d) aVar).e(null);
            throw th;
        }
        f0Var = new f0(this, abstractC0343b);
        Object obj2 = f0Var.f;
        enumC0326a = EnumC0326a.f4994a;
        i3 = f0Var.f845h;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(o2.p pVar, AbstractC0343b abstractC0343b) {
        g0 g0Var;
        int i3;
        E2.d dVar;
        Throwable th;
        boolean z3;
        if (abstractC0343b instanceof g0) {
            g0Var = (g0) abstractC0343b;
            int i4 = g0Var.f850h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                g0Var.f850h = i4 - Integer.MIN_VALUE;
                Object obj = g0Var.f;
                Object obj2 = EnumC0326a.f4994a;
                i3 = g0Var.f850h;
                if (i3 != 0) {
                    X0.a.L(obj);
                    E2.d dVar2 = this.f856a;
                    boolean d3 = dVar2.d();
                    try {
                        Object valueOf = Boolean.valueOf(d3);
                        g0Var.f847d = dVar2;
                        g0Var.f848e = d3;
                        g0Var.f850h = 1;
                        Object invoke = pVar.invoke(valueOf, g0Var);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        dVar = dVar2;
                        obj = invoke;
                        z3 = d3;
                    } catch (Throwable th2) {
                        dVar = dVar2;
                        th = th2;
                        z3 = d3;
                        if (z3) {
                            dVar.e(null);
                        }
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z3 = g0Var.f848e;
                    dVar = g0Var.f847d;
                    try {
                        X0.a.L(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z3) {
                        }
                        throw th;
                    }
                }
                if (z3) {
                    dVar.e(null);
                }
                return obj;
            }
        }
        g0Var = new g0(this, abstractC0343b);
        Object obj3 = g0Var.f;
        Object obj22 = EnumC0326a.f4994a;
        i3 = g0Var.f850h;
        if (i3 != 0) {
        }
        if (z3) {
        }
        return obj3;
    }
}
