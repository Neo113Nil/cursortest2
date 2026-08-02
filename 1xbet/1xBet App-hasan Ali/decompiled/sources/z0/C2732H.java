package z0;

import h0.C1988b;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import x0.AbstractC2617c;
import x0.C2628n;

/* renamed from: z0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2732H {

    /* renamed from: a, reason: collision with root package name */
    public final x0.Z f21640a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21642c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21643d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21644e;
    public InterfaceC2742a f;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21646h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21641b = true;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f21645g = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public C2732H(InterfaceC2742a interfaceC2742a, int i) {
        this.f21646h = i;
        this.f21640a = (x0.Z) interfaceC2742a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [i4.e, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r12v6, types: [x0.Z, z0.a] */
    public static final void a(C2732H c2732h, C2628n c2628n, int i, e0 e0Var) {
        c2732h.getClass();
        float f = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        int floatToRawIntBits2 = Float.floatToRawIntBits(f);
        while (true) {
            long j5 = (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L);
            do {
                switch (c2732h.f21646h) {
                    case 0:
                        i0.G g5 = e0.f21790T;
                        j5 = e0Var.d1(j5);
                        break;
                    default:
                        AbstractC2740P G02 = e0Var.G0();
                        kotlin.jvm.internal.l.c(G02);
                        long j6 = G02.f21692z;
                        j5 = C1988b.h((Float.floatToRawIntBits((int) (j6 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j6 & 4294967295L)) & 4294967295L), j5);
                        break;
                }
                e0Var = e0Var.f21795A;
                kotlin.jvm.internal.l.c(e0Var);
                if (e0Var.equals(c2732h.f21640a.r())) {
                    int round = Math.round(c2628n instanceof C2628n ? Float.intBitsToFloat((int) (j5 & 4294967295L)) : Float.intBitsToFloat((int) (j5 >> 32)));
                    HashMap hashMap = c2732h.f21645g;
                    if (hashMap.containsKey(c2628n)) {
                        kotlin.jvm.internal.l.f("<this>", hashMap);
                        Object obj = hashMap.get(c2628n);
                        if (obj == null && !hashMap.containsKey(c2628n)) {
                            throw new NoSuchElementException("Key " + c2628n + " is missing in the map.");
                        }
                        int intValue = ((Number) obj).intValue();
                        C2628n c2628n2 = AbstractC2617c.f20985a;
                        round = ((Number) c2628n.f21024a.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(c2628n, Integer.valueOf(round));
                    return;
                }
            } while (!c2732h.b(e0Var).containsKey(c2628n));
            float c5 = c2732h.c(e0Var, c2628n);
            floatToRawIntBits = Float.floatToRawIntBits(c5);
            floatToRawIntBits2 = Float.floatToRawIntBits(c5);
        }
    }

    public final Map b(e0 e0Var) {
        switch (this.f21646h) {
            case 0:
                return e0Var.q0().a();
            default:
                AbstractC2740P G02 = e0Var.G0();
                kotlin.jvm.internal.l.c(G02);
                return G02.q0().a();
        }
    }

    public final int c(e0 e0Var, C2628n c2628n) {
        switch (this.f21646h) {
            case 0:
                return e0Var.l0(c2628n);
            default:
                AbstractC2740P G02 = e0Var.G0();
                kotlin.jvm.internal.l.c(G02);
                return G02.l0(c2628n);
        }
    }

    public final boolean d() {
        return this.f21642c || this.f21643d || this.f21644e;
    }

    public final boolean e() {
        h();
        return this.f != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [x0.Z, z0.a] */
    public final void f() {
        this.f21641b = true;
        ?? r02 = this.f21640a;
        InterfaceC2742a u5 = r02.u();
        if (u5 == null) {
            return;
        }
        if (this.f21642c) {
            u5.requestLayout();
        }
        if (this.f21643d) {
            r02.O();
        }
        if (this.f21644e) {
            r02.requestLayout();
        }
        u5.a().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [x0.Z, z0.a] */
    public final void g() {
        HashMap hashMap = this.f21645g;
        hashMap.clear();
        t0.F f = new t0.F(8, this);
        ?? r22 = this.f21640a;
        r22.j(f);
        hashMap.putAll(b(r22.r()));
        this.f21641b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [x0.Z, z0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        C2732H a5;
        C2732H a6;
        boolean d5 = d();
        ?? r1 = this.f21640a;
        InterfaceC2742a interfaceC2742a = r1;
        if (!d5) {
            InterfaceC2742a u5 = r1.u();
            if (u5 == null) {
                return;
            }
            InterfaceC2742a interfaceC2742a2 = u5.a().f;
            if (interfaceC2742a2 != null) {
                boolean d6 = interfaceC2742a2.a().d();
                interfaceC2742a = interfaceC2742a2;
            }
            InterfaceC2742a interfaceC2742a3 = this.f;
            if (interfaceC2742a3 == null || interfaceC2742a3.a().d()) {
                return;
            }
            InterfaceC2742a u6 = interfaceC2742a3.u();
            if (u6 != null && (a6 = u6.a()) != null) {
                a6.h();
            }
            InterfaceC2742a u7 = interfaceC2742a3.u();
            interfaceC2742a = (u7 == null || (a5 = u7.a()) == null) ? null : a5.f;
        }
        this.f = interfaceC2742a;
    }
}
