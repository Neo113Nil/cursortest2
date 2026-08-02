package androidx.compose.ui.layout;

import b0.p;
import r.C2343v;
import x0.C2631q;
import x0.f0;
import x0.m0;
import x0.n0;
import x0.o0;
import x0.r;
import z0.C2736L;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2343v f6938a;

    /* renamed from: b, reason: collision with root package name */
    public static final n0[] f6939b;

    /* renamed from: c, reason: collision with root package name */
    public static final C2343v f6940c;

    static {
        C2343v c2343v = new C2343v(8);
        n0.f21025a.getClass();
        o0 o0Var = m0.f21021g;
        c2343v.g(1, o0Var);
        o0 o0Var2 = m0.f;
        c2343v.g(2, o0Var2);
        o0 o0Var3 = m0.f21017b;
        c2343v.g(4, o0Var3);
        o0 o0Var4 = m0.f21019d;
        c2343v.g(8, o0Var4);
        o0 o0Var5 = m0.f21022h;
        c2343v.g(16, o0Var5);
        o0 o0Var6 = m0.f21020e;
        c2343v.g(32, o0Var6);
        o0 o0Var7 = m0.i;
        c2343v.g(64, o0Var7);
        f6938a = c2343v;
        f6939b = new n0[]{o0Var, o0Var2, o0Var3, o0Var7, o0Var5, o0Var6, o0Var4, m0.f21023j, m0.f21018c};
        C2343v c2343v2 = new C2343v(7);
        c2343v2.g(1, o0Var);
        c2343v2.g(2, o0Var2);
        c2343v2.g(4, o0Var3);
        c2343v2.g(16, o0Var5);
        c2343v2.g(64, o0Var7);
        c2343v2.g(32, o0Var6);
        c2343v2.g(8, o0Var4);
        f6940c = c2343v2;
    }

    public static final void a(C2736L c2736l, C2631q c2631q, long j5, int i, int i5) {
        if (f0.g(j5, -1L)) {
            return;
        }
        c2736l.a(c2631q.f21043b, (int) ((j5 >>> 48) & 65535));
        c2736l.a(c2631q.f21044c, (int) ((j5 >>> 32) & 65535));
        c2736l.a(c2631q.f21045d, i - ((int) ((j5 >>> 16) & 65535)));
        c2736l.a(c2631q.f21046e, i5 - ((int) (j5 & 65535)));
    }

    public static final p b(r rVar) {
        return new RulerProviderModifierElement(rVar);
    }
}
