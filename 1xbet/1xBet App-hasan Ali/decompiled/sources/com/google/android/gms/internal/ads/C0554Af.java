package com.google.android.gms.internal.ads;

import a3.C0469m;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import r0.AbstractC2346c;

/* renamed from: com.google.android.gms.internal.ads.Af, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0554Af {

    /* renamed from: M0, reason: collision with root package name */
    public static C0554Af f7609M0;

    /* renamed from: A, reason: collision with root package name */
    public final ED f7610A;

    /* renamed from: A0, reason: collision with root package name */
    public final C1655uf f7611A0;

    /* renamed from: B, reason: collision with root package name */
    public final CD f7612B;
    public final CD B0;

    /* renamed from: C, reason: collision with root package name */
    public final CD f7613C;

    /* renamed from: C0, reason: collision with root package name */
    public final O5 f7614C0;

    /* renamed from: D, reason: collision with root package name */
    public final C0650Nf f7615D;

    /* renamed from: D0, reason: collision with root package name */
    public final CD f7616D0;

    /* renamed from: E, reason: collision with root package name */
    public final CD f7617E;
    public final C1701vg E0;

    /* renamed from: F, reason: collision with root package name */
    public final CD f7618F;

    /* renamed from: F0, reason: collision with root package name */
    public final CD f7619F0;

    /* renamed from: G, reason: collision with root package name */
    public final CD f7620G;

    /* renamed from: G0, reason: collision with root package name */
    public final CD f7621G0;

    /* renamed from: H, reason: collision with root package name */
    public final CD f7622H;

    /* renamed from: H0, reason: collision with root package name */
    public final CD f7623H0;

    /* renamed from: I, reason: collision with root package name */
    public final CD f7624I;

    /* renamed from: I0, reason: collision with root package name */
    public final CD f7625I0;
    public final CD J;

    /* renamed from: J0, reason: collision with root package name */
    public final CD f7626J0;
    public final CD K;

    /* renamed from: K0, reason: collision with root package name */
    public final CD f7627K0;

    /* renamed from: L, reason: collision with root package name */
    public final CD f7628L;

    /* renamed from: L0, reason: collision with root package name */
    public final CD f7629L0;

    /* renamed from: M, reason: collision with root package name */
    public final CD f7630M;

    /* renamed from: N, reason: collision with root package name */
    public final CD f7631N;

    /* renamed from: O, reason: collision with root package name */
    public final CD f7632O;

    /* renamed from: P, reason: collision with root package name */
    public final C1790xf f7633P;

    /* renamed from: Q, reason: collision with root package name */
    public final CD f7634Q;

    /* renamed from: R, reason: collision with root package name */
    public final C1476qf f7635R;

    /* renamed from: S, reason: collision with root package name */
    public final CD f7636S;

    /* renamed from: T, reason: collision with root package name */
    public final CD f7637T;

    /* renamed from: U, reason: collision with root package name */
    public final CD f7638U;

    /* renamed from: V, reason: collision with root package name */
    public final CD f7639V;

    /* renamed from: W, reason: collision with root package name */
    public final U7 f7640W;

    /* renamed from: X, reason: collision with root package name */
    public final CD f7641X;

    /* renamed from: Y, reason: collision with root package name */
    public final CD f7642Y;

    /* renamed from: Z, reason: collision with root package name */
    public final C1520rf f7643Z;

    /* renamed from: a, reason: collision with root package name */
    public final C1386of f7644a;

    /* renamed from: a0, reason: collision with root package name */
    public final CD f7645a0;

    /* renamed from: b, reason: collision with root package name */
    public final C0554Af f7646b = this;

    /* renamed from: b0, reason: collision with root package name */
    public final C1755wp f7647b0;

    /* renamed from: c, reason: collision with root package name */
    public final CD f7648c;

    /* renamed from: c0, reason: collision with root package name */
    public final CD f7649c0;

    /* renamed from: d, reason: collision with root package name */
    public final CD f7650d;

    /* renamed from: d0, reason: collision with root package name */
    public final C1520rf f7651d0;

    /* renamed from: e, reason: collision with root package name */
    public final CD f7652e;

    /* renamed from: e0, reason: collision with root package name */
    public final CD f7653e0;
    public final CD f;

    /* renamed from: f0, reason: collision with root package name */
    public final CD f7654f0;

    /* renamed from: g, reason: collision with root package name */
    public final C1565sf f7655g;

    /* renamed from: g0, reason: collision with root package name */
    public final Lj f7656g0;

    /* renamed from: h, reason: collision with root package name */
    public final CD f7657h;

    /* renamed from: h0, reason: collision with root package name */
    public final CD f7658h0;
    public final CD i;

    /* renamed from: i0, reason: collision with root package name */
    public final CD f7659i0;

    /* renamed from: j, reason: collision with root package name */
    public final C1745wf f7660j;

    /* renamed from: j0, reason: collision with root package name */
    public final C1796xl f7661j0;

    /* renamed from: k, reason: collision with root package name */
    public final CD f7662k;

    /* renamed from: k0, reason: collision with root package name */
    public final CD f7663k0;

    /* renamed from: l, reason: collision with root package name */
    public final CD f7664l;

    /* renamed from: l0, reason: collision with root package name */
    public final C1520rf f7665l0;

    /* renamed from: m, reason: collision with root package name */
    public final CD f7666m;

    /* renamed from: m0, reason: collision with root package name */
    public final CD f7667m0;

    /* renamed from: n, reason: collision with root package name */
    public final CD f7668n;

    /* renamed from: n0, reason: collision with root package name */
    public final C1659uj f7669n0;

    /* renamed from: o, reason: collision with root package name */
    public final CD f7670o;

    /* renamed from: o0, reason: collision with root package name */
    public final CD f7671o0;

    /* renamed from: p, reason: collision with root package name */
    public final CD f7672p;

    /* renamed from: p0, reason: collision with root package name */
    public final CD f7673p0;

    /* renamed from: q, reason: collision with root package name */
    public final CD f7674q;

    /* renamed from: q0, reason: collision with root package name */
    public final C1655uf f7675q0;

    /* renamed from: r, reason: collision with root package name */
    public final CD f7676r;

    /* renamed from: r0, reason: collision with root package name */
    public final CD f7677r0;

    /* renamed from: s, reason: collision with root package name */
    public final CD f7678s;

    /* renamed from: s0, reason: collision with root package name */
    public final CD f7679s0;

    /* renamed from: t, reason: collision with root package name */
    public final CD f7680t;

    /* renamed from: t0, reason: collision with root package name */
    public final CD f7681t0;

    /* renamed from: u, reason: collision with root package name */
    public final C1520rf f7682u;

    /* renamed from: u0, reason: collision with root package name */
    public final CD f7683u0;

    /* renamed from: v, reason: collision with root package name */
    public final CD f7684v;

    /* renamed from: v0, reason: collision with root package name */
    public final C1520rf f7685v0;

    /* renamed from: w, reason: collision with root package name */
    public final CD f7686w;

    /* renamed from: w0, reason: collision with root package name */
    public final CD f7687w0;

    /* renamed from: x, reason: collision with root package name */
    public final CD f7688x;

    /* renamed from: x0, reason: collision with root package name */
    public final CD f7689x0;

    /* renamed from: y, reason: collision with root package name */
    public final CD f7690y;

    /* renamed from: y0, reason: collision with root package name */
    public final CD f7691y0;

    /* renamed from: z, reason: collision with root package name */
    public final CD f7692z;

    /* renamed from: z0, reason: collision with root package name */
    public final C1700vf f7693z0;

    public C0554Af(C1386of c1386of, V9 v9) {
        int i = 3;
        this.f7644a = c1386of;
        CD b3 = CD.b(JB.f9887P);
        this.f7648c = b3;
        CD b5 = CD.b(new C1796xl(CD.b(JB.f9889R), 21));
        this.f7650d = b5;
        this.f7652e = CD.b(AbstractC1561sb.f15520e0);
        CD b6 = CD.b(new C0861cr(1));
        this.f = b6;
        C1565sf c1565sf = new C1565sf(c1386of);
        this.f7655g = c1565sf;
        C1520rf c1520rf = new C1520rf(c1565sf, 5);
        CD b7 = CD.b(JB.f9878E);
        this.f7657h = b7;
        CD b8 = CD.b(new C0847cd(c1520rf, b7, 18));
        this.i = b8;
        C1745wf c1745wf = new C1745wf(c1386of);
        this.f7660j = c1745wf;
        CD b9 = CD.b(new C1476qf(b8, 4));
        this.f7662k = b9;
        CD b10 = CD.b(new Lj(19));
        this.f7664l = b10;
        C1610tf c1610tf = new C1610tf(c1386of, 0);
        CD b11 = CD.b(new O5(i));
        this.f7666m = b11;
        ID a5 = LD.a(new C1476qf(CD.b(new C1610tf(c1386of, i)), 6));
        CD b12 = CD.b(new C0936ed(a5, new a3.B(c1565sf, c1745wf, 1), c1565sf, 15));
        this.f7668n = b12;
        CD b13 = CD.b(new C1701vg(b11, b12, 17));
        CD b14 = CD.b(AbstractC1561sb.f15506V);
        this.f7670o = b14;
        CD b15 = CD.b(new C1476qf(b14, 2));
        int i5 = KD.f10142c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(b15);
        Lh lh = new Lh(new KD(list, arrayList), 16);
        CD b16 = CD.b(new C1657uh(c1565sf, c1745wf, b7, 2));
        this.f7672p = b16;
        CD b17 = CD.b(new a3.r(b3, c1565sf, c1610tf, b8, b5, b13, c1745wf, lh, b16));
        this.f7674q = b17;
        CD b18 = CD.b(new O5(8));
        this.f7676r = b18;
        CD b19 = CD.b(new Lj(7));
        this.f7678s = b19;
        CD b20 = CD.b(new C0847cd(c1565sf, c1745wf, 22));
        CD b21 = CD.b(new C1520rf(c1565sf, 8));
        CD b22 = CD.b(new C1520rf(c1565sf, 7));
        CD b23 = CD.b(new C1701vg(b17, b7, 18));
        CD b24 = CD.b(new C0936ed(c1565sf, c1610tf, b20, 17));
        this.f7680t = b24;
        int i6 = 1;
        C1520rf c1520rf2 = new C1520rf(c1565sf, i6);
        this.f7682u = c1520rf2;
        CD b25 = CD.b(new Qj(b20, b21, b22, c1565sf, c1745wf, b23, b24, c1520rf2, 3));
        this.f7684v = b25;
        C1610tf c1610tf2 = new C1610tf(c1386of, i6);
        CD b26 = CD.b(new C1657uh(c1565sf, b16, c1745wf));
        this.f7686w = b26;
        CD b27 = CD.b(new C1032gj(b12, 21));
        this.f7688x = b27;
        this.f7690y = CD.b(new C0678Rf(c1565sf, c1745wf, b8, b9, b10, b17, b18, b19, b25, c1610tf2, b16, c1520rf, b26, b27));
        this.f7692z = CD.b(new C1796xl(CD.b(new C0555Ag(CD.b(new C0555Ag(c1565sf, (DD) c1745wf, b5, b6, 21)), new C1796xl(b27, 26), c1565sf, b6)), 25));
        ED a6 = ED.a(this);
        this.f7610A = a6;
        CD b28 = CD.b(new C1610tf(c1386of, 2));
        this.f7612B = b28;
        CD b29 = CD.b(new C1476qf(b28, 1));
        this.f7613C = b29;
        C0650Nf c0650Nf = new C0650Nf(0, v9);
        this.f7615D = c0650Nf;
        CD b30 = CD.b(new C1520rf(c1565sf, 12));
        this.f7617E = b30;
        CD b31 = CD.b(JB.f9888Q);
        CD b32 = CD.b(new C1796xl(b30, 24));
        this.f7618F = b32;
        CD b33 = CD.b(new a3.y((Object) c1565sf, b31, a5, b32, b16, 20));
        this.f7620G = b33;
        CD b34 = CD.b(new C0555Ag(c1565sf, b30, a5, b27));
        this.f7622H = b34;
        CD b35 = CD.b(new C1796xl(b29, 19));
        this.f7624I = b35;
        CD b36 = CD.b(new C1476qf(CD.b(new a3.r(c1565sf, b3, b29, c1745wf, c0650Nf, b30, b33, b27, b34, b35)), 5));
        this.J = b36;
        CD b37 = CD.b(new a3.B(c1565sf, b12, 2));
        CD b38 = CD.b(new a3.B(c1565sf, c1745wf, 0));
        this.K = CD.b(new C0469m(a6, c1565sf, b29, b36, b5, b12, b33, c1745wf, new a3.M(b5, b37, b38, b12, 1), b35, b37, b38));
        this.f7628L = CD.b(new a3.t(b12, 1));
        this.f7630M = CD.b(AbstractC1561sb.f15510Z);
        this.f7631N = CD.b(new T2.D(c1565sf, 0));
        CD b39 = CD.b(new O5(1));
        this.f7632O = b39;
        this.f7633P = new C1790xf(b39);
        this.f7634Q = CD.b(new C1032gj(b6, 22));
        int i7 = 0;
        this.f7635R = new C1476qf(b39, i7);
        CD b40 = CD.b(new C1520rf(c1565sf, i7));
        this.f7636S = b40;
        CD b41 = CD.b(new C1655uf(c1565sf, b40, i7));
        this.f7637T = b41;
        int i8 = 23;
        this.f7638U = CD.b(new C0936ed(new C1520rf(c1565sf, i8), b6, b27, i8));
        this.f7639V = CD.b(AbstractC1561sb.f15508X);
        U7 u7 = new U7(b40, b41, c1565sf);
        this.f7640W = u7;
        this.f7641X = CD.b(new C1620tp(u7, b6, b27, 0));
        this.f7642Y = CD.b(JB.f9883L);
        C1520rf c1520rf3 = new C1520rf(c1565sf, 17);
        this.f7643Z = c1520rf3;
        this.f7645a0 = CD.b(new C0936ed(c1520rf3, b6, b27, 26));
        C1755wp c1755wp = new C1755wp(c1565sf, c1745wf, c1520rf2, 3);
        this.f7647b0 = c1755wp;
        this.f7649c0 = CD.b(new C0936ed(c1755wp, b6, b27, 28));
        C1520rf c1520rf4 = new C1520rf(c1565sf, 24);
        this.f7651d0 = c1520rf4;
        this.f7653e0 = CD.b(new C0936ed(c1520rf4, b6, b27, 29));
        this.f7654f0 = CD.b(new C0936ed(new C1520rf(c1565sf, 18), b6, b27, 21));
        this.f7656g0 = new Lj(25);
        this.f7658h0 = CD.b(new C1701vg(b6, b27, 22));
        this.f7659i0 = CD.b(new C1701vg(b6, b27, 23));
        C1796xl c1796xl = new C1796xl(b39, 12);
        this.f7661j0 = c1796xl;
        this.f7663k0 = CD.b(new C0936ed(c1796xl, b6, b27, 24));
        C1520rf c1520rf5 = new C1520rf(c1565sf, 15);
        this.f7665l0 = c1520rf5;
        this.f7667m0 = CD.b(new C1575sp(c1520rf5, b6, b27, 0));
        C1659uj c1659uj = new C1659uj(c1745wf, 1);
        this.f7669n0 = c1659uj;
        this.f7671o0 = CD.b(new C0936ed(c1659uj, b6, b27, 25));
        CD b42 = CD.b(new O5(2));
        this.f7673p0 = b42;
        C1655uf c1655uf = new C1655uf(c1565sf, b42, 5);
        this.f7675q0 = c1655uf;
        this.f7677r0 = CD.b(new C0936ed(c1655uf, b6, b27, 27));
        this.f7679s0 = CD.b(JB.f9912y);
        CD b43 = CD.b(new C1610tf(c1386of, 4));
        this.f7681t0 = b43;
        int i9 = 22;
        this.f7683u0 = CD.b(new C0936ed(new C1520rf(c1565sf, i9), b6, b27, i9));
        this.f7685v0 = new C1520rf(c1565sf, 2);
        this.f7687w0 = CD.b(JB.f9885N);
        this.f7689x0 = CD.b(AbstractC1561sb.f15521f0);
        this.f7691y0 = CD.b(new C1476qf(b8, 3));
        this.f7693z0 = new C1700vf(a6, 0);
        int i10 = 1;
        this.f7611A0 = new C1655uf(c1565sf, b16, i10);
        this.B0 = CD.b(JB.f9909v);
        this.f7614C0 = new O5(6);
        this.f7616D0 = CD.b(new C1657uh(c1565sf, c1745wf, b16, i10));
        this.E0 = new C1701vg(b5, b6, 5);
        this.f7619F0 = CD.b(JB.f9886O);
        this.f7621G0 = CD.b(AbstractC1561sb.f15518d0);
        this.f7623H0 = CD.b(new C1520rf(c1565sf, 3));
        this.f7625I0 = CD.b(new C1032gj(b27, 7));
        this.f7626J0 = CD.b(AbstractC1561sb.f15526l);
        this.f7627K0 = CD.b(new a3.y(c1565sf, b43, (ID) b41, (ID) CD.b(new T2.D(c1565sf, 1)), (ID) b5, 0));
        this.f7629L0 = CD.b(new C1520rf(c1565sf, 26));
    }

    public static C0554Af z(Context context, InterfaceC0624Ka interfaceC0624Ka, int i) {
        SharedPreferences sharedPreferences;
        synchronized (C0554Af.class) {
            try {
                C0554Af c0554Af = f7609M0;
                if (c0554Af != null) {
                    return c0554Af;
                }
                P2.o oVar = P2.o.f4767B;
                oVar.f4776j.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                F7.a(context);
                if (((Boolean) AbstractC0790b8.f12769e.s()).booleanValue() && (sharedPreferences = context.getSharedPreferences("admob", 0)) != null) {
                    sharedPreferences.edit().putInt("init_without_write", AbstractC1668us.X(context, "init_without_write") + 1).commit();
                }
                C0905dr C5 = C0905dr.C(context);
                boolean e3 = T2.L.e((Context) C5.f13186l);
                U2.a aVar = new U2.a(244410000, i, true, e3);
                if (((Boolean) AbstractC1103i8.f13875c.s()).booleanValue()) {
                    Q2.Z z3 = (Q2.Z) C5.f13187m;
                    Q2.I0 i02 = null;
                    if (z3 != null) {
                        try {
                            i02 = z3.getLiteSdkVersion();
                        } catch (RemoteException unused) {
                        }
                    }
                    if (i02 != null) {
                        aVar = new U2.a(244410000, i02.f4926l, true, e3);
                    }
                }
                C5.J(interfaceC0624Ka);
                C1386of c1386of = new C1386of();
                c1386of.f14809a = aVar;
                c1386of.f14812d = new WeakReference(context);
                c1386of.f14810b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                c1386of.f14811c = currentTimeMillis;
                C1386of c1386of2 = new C1386of();
                c1386of2.f14809a = (U2.a) c1386of.f14809a;
                c1386of2.f14810b = (Context) c1386of.f14810b;
                c1386of2.f14812d = (WeakReference) c1386of.f14812d;
                c1386of2.f14811c = c1386of.f14811c;
                C0554Af c0554Af2 = new C0554Af(c1386of2, new V9(25));
                oVar.f4774g.g(context, aVar);
                oVar.i.u(context);
                oVar.f4771c.B(context);
                oVar.f4771c.A(context);
                AbstractC2346c.K(context);
                oVar.f.l(context);
                oVar.f4791y.b(context);
                ((T2.C) c0554Af2.f7631N.d()).a();
                C1071hd.y(context);
                A7 a7 = F7.P5;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    if (!((Boolean) rVar.f5056c.a(F7.f8935z0)).booleanValue()) {
                        C1773x6 c1773x6 = new C1773x6(new D3.l(context, 5));
                        C1390oj c1390oj = new C1390oj(25, new Lm(context), (Qw) c0554Af2.f7652e.d());
                        try {
                            c1390oj.g(new Sm(new C0905dr(context, aVar, c1773x6, c1390oj), oVar.f4774g.d().n()));
                        } catch (Exception e5) {
                            U2.j.f("Error in offline signals database startup: ".concat(String.valueOf(e5.getMessage())));
                        }
                    }
                }
                f7609M0 = c0554Af2;
                return c0554Af2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Nr C() {
        return (Nr) this.f7672p.d();
    }

    public final Executor a() {
        return (Executor) this.f7648c.d();
    }
}
