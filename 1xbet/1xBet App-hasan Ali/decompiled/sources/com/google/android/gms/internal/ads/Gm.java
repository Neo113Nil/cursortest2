package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Gm extends E5 implements InterfaceC1115ic {

    /* renamed from: k, reason: collision with root package name */
    public final Context f9254k;

    /* renamed from: l, reason: collision with root package name */
    public final C0606Hd f9255l;

    /* renamed from: m, reason: collision with root package name */
    public final Mt f9256m;

    /* renamed from: n, reason: collision with root package name */
    public final C0554Af f9257n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque f9258o;

    /* renamed from: p, reason: collision with root package name */
    public final Nr f9259p;

    public Gm(Context context, C0606Hd c0606Hd, V9 v9, C0554Af c0554Af, Mt mt, ArrayDeque arrayDeque, Nr nr) {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
        F7.a(context);
        this.f9254k = context;
        this.f9255l = c0606Hd;
        this.f9256m = mt;
        this.f9257n = c0554Af;
        this.f9258o = arrayDeque;
        this.f9259p = nr;
    }

    public static Cr A3(C1428pc c1428pc, Gr gr, C1071hd c1071hd) {
        C0565Ca c0565Ca = new C0565Ca(7, c1071hd, c1428pc);
        return gr.a(AbstractC1400ot.c0(c1428pc.f14995k), Dr.f8392p).p(c0565Ca).n(new Oi(16)).a();
    }

    public static void C3(E3.a aVar, InterfaceC1293mc interfaceC1293mc, C1428pc c1428pc) {
        C1537rw j02 = AbstractC1400ot.j0(aVar, new C0727Yf(8), AbstractC0613Id.f9539a);
        C1390oj c1390oj = new C1390oj(24, c1428pc, interfaceC1293mc);
        j02.a(new Kw(0, j02, c1390oj), AbstractC0613Id.f9544g);
    }

    public static Cr z3(Cr cr, Gr gr, C1875za c1875za, Mr mr, Jr jr) {
        P2.c a5 = c1875za.a("AFMA_getAdDictionary", AbstractC1830ya.f16434b, new Oi(17));
        AbstractC1803xs.M(cr, jr);
        Cr a6 = gr.a(cr, Dr.f8393q).p(a5).a();
        if (!((Boolean) AbstractC0834c8.f12977c.s()).booleanValue()) {
            return a6;
        }
        Hw r5 = Hw.r(a6);
        C1667ur c1667ur = new C1667ur(2, mr, jr, false);
        r5.a(new Kw(0, r5, c1667ur), AbstractC0613Id.f9544g);
        return a6;
    }

    public final synchronized void B3() {
        int intValue = ((Long) AbstractC1371o8.f14774b.s()).intValue();
        while (this.f9258o.size() >= intValue) {
            this.f9258o.removeFirst();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1115ic
    public final void E2(C1428pc c1428pc, InterfaceC1293mc interfaceC1293mc) {
        Bundle bundle;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8805b2)).booleanValue() && (bundle = c1428pc.f15007w) != null) {
            AbstractC0467k.C(P2.o.f4767B.f4776j, bundle, "service-connected");
        }
        Cr v32 = v3(c1428pc, Binder.getCallingUid());
        C3(v32, interfaceC1293mc, c1428pc);
        if (((Boolean) AbstractC1058h8.f13715e.s()).booleanValue()) {
            Mt mt = this.f9256m;
            Objects.requireNonNull(mt);
            v32.a(new RunnableC1303mm(2, mt), this.f9255l);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1115ic
    public final void Q0(C1428pc c1428pc, InterfaceC1293mc interfaceC1293mc) {
        C3(u3(c1428pc, Binder.getCallingUid()), interfaceC1293mc, c1428pc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1115ic
    public final void r0(String str, InterfaceC1293mc interfaceC1293mc) {
        C3(x3(str), interfaceC1293mc, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1115ic
    public final void r3(C1428pc c1428pc, InterfaceC1293mc interfaceC1293mc) {
        Bundle bundle;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8805b2)).booleanValue() && (bundle = c1428pc.f15007w) != null) {
            AbstractC0467k.C(P2.o.f4767B.f4776j, bundle, "service-connected");
        }
        C3(w3(c1428pc, Binder.getCallingUid()), interfaceC1293mc, c1428pc);
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC1293mc interfaceC1293mc = null;
        C1338nc c1338nc = null;
        InterfaceC1293mc interfaceC1293mc2 = null;
        InterfaceC1293mc interfaceC1293mc3 = null;
        InterfaceC1293mc interfaceC1293mc4 = null;
        switch (i) {
            case 1:
                F5.b(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                }
                F5.b(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                C1428pc c1428pc = (C1428pc) F5.a(parcel, C1428pc.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC1293mc = queryLocalInterface instanceof InterfaceC1293mc ? (InterfaceC1293mc) queryLocalInterface : new C1203kc(readStrongBinder2);
                }
                F5.b(parcel);
                E2(c1428pc, interfaceC1293mc);
                parcel2.writeNoException();
                return true;
            case 5:
                C1428pc c1428pc2 = (C1428pc) F5.a(parcel, C1428pc.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC1293mc4 = queryLocalInterface2 instanceof InterfaceC1293mc ? (InterfaceC1293mc) queryLocalInterface2 : new C1203kc(readStrongBinder3);
                }
                F5.b(parcel);
                r3(c1428pc2, interfaceC1293mc4);
                parcel2.writeNoException();
                return true;
            case 6:
                C1428pc c1428pc3 = (C1428pc) F5.a(parcel, C1428pc.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC1293mc3 = queryLocalInterface3 instanceof InterfaceC1293mc ? (InterfaceC1293mc) queryLocalInterface3 : new C1203kc(readStrongBinder4);
                }
                F5.b(parcel);
                Q0(c1428pc3, interfaceC1293mc3);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC1293mc2 = queryLocalInterface4 instanceof InterfaceC1293mc ? (InterfaceC1293mc) queryLocalInterface4 : new C1203kc(readStrongBinder5);
                }
                F5.b(parcel);
                r0(readString, interfaceC1293mc2);
                parcel2.writeNoException();
                return true;
            case 8:
                C1025gc c1025gc = (C1025gc) F5.a(parcel, C1025gc.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    c1338nc = queryLocalInterface5 instanceof C1338nc ? (C1338nc) queryLocalInterface5 : new C1338nc(readStrongBinder6, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener", 0);
                }
                F5.b(parcel);
                if (((Boolean) AbstractC1595t8.f15634a.s()).booleanValue()) {
                    this.f9257n.getClass();
                    String str = c1025gc.f13589k;
                    Mw mw = Mw.f10750l;
                    mw.a(new Kw(0, mw, new C0709Wb(23, c1338nc, c1025gc, false)), AbstractC0613Id.f9544g);
                } else {
                    try {
                        Parcel N5 = c1338nc.N();
                        N5.writeString("");
                        F5.c(N5, c1025gc);
                        c1338nc.d1(N5, 1);
                    } catch (RemoteException e3) {
                        T2.G.n("Service can't call client", e3);
                    }
                }
                parcel2.writeNoException();
                return true;
        }
    }

    public final E3.a u3(final C1428pc c1428pc, int i) {
        if (!((Boolean) AbstractC1371o8.f14773a.s()).booleanValue()) {
            return AbstractC1400ot.Z(new Exception("Split request is disabled."));
        }
        C1353nr c1353nr = c1428pc.f15003s;
        if (c1353nr == null) {
            return AbstractC1400ot.Z(new Exception("Pool configuration missing from request."));
        }
        if (c1353nr.f14719n == 0 || c1353nr.f14720o == 0) {
            return AbstractC1400ot.Z(new Exception("Caching is disabled."));
        }
        C1071hd c1071hd = P2.o.f4767B.f4783q;
        U2.a a5 = U2.a.a();
        Nr nr = this.f9259p;
        Context context = this.f9254k;
        C1875za s2 = c1071hd.s(context, a5, nr);
        C0554Af c0554Af = this.f9257n;
        c0554Af.getClass();
        C1071hd c1071hd2 = new C1071hd(c0554Af.f7646b, new C2.h(i, 6, c1428pc));
        Gr gr = (Gr) ((CD) c1071hd2.f13763n).d();
        final Cr A3 = A3(c1428pc, gr, c1071hd2);
        Mr mr = (Mr) ((CD) c1071hd2.f13762m).d();
        final Jr j5 = AbstractC1668us.j(context, 9);
        final Cr z3 = z3(A3, gr, s2, mr, j5);
        Dr dr = Dr.f8385G;
        List asList = Arrays.asList(A3, z3);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.Cm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Gm gm = Gm.this;
                Cr cr = z3;
                Cr cr2 = A3;
                C1428pc c1428pc2 = c1428pc;
                Jr jr = j5;
                gm.getClass();
                String str = ((C1473qc) cr.f8093m.get()).i;
                Em em = new Em((C1473qc) cr.f8093m.get(), (JSONObject) cr2.f8093m.get(), c1428pc2.f15002r, jr);
                synchronized (gm) {
                    gm.B3();
                    gm.f9258o.addLast(em);
                }
                return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            }
        };
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        asList.getClass();
        AbstractC1044gv l5 = AbstractC1044gv.l(asList);
        CallableC1819y7 callableC1819y7 = new CallableC1819y7(6);
        C0606Hd c0606Hd = AbstractC0613Id.f9544g;
        Dw dw = new Dw(l5, true, false);
        dw.f8420z = new Cw(dw, callableC1819y7, c0606Hd);
        dw.w();
        Dw dw2 = new Dw(l5, true, false);
        dw2.f8420z = new Cw(dw2, callable, gr.f9279a);
        dw2.w();
        return new C1324n6(gr, dr, null, dw, asList, dw2).a();
    }

    public final Cr v3(final C1428pc c1428pc, int i) {
        Em y32;
        Cr a5;
        C1071hd c1071hd = P2.o.f4767B.f4783q;
        U2.a a6 = U2.a.a();
        Context context = this.f9254k;
        C1875za s2 = c1071hd.s(context, a6, this.f9259p);
        C0554Af c0554Af = this.f9257n;
        c0554Af.getClass();
        C1071hd c1071hd2 = new C1071hd(c0554Af.f7646b, new C2.h(i, 6, c1428pc));
        P2.c a7 = s2.a("google.afma.response.normalize", Fm.f9111d, AbstractC1830ya.f16435c);
        if (((Boolean) AbstractC1371o8.f14773a.s()).booleanValue()) {
            y32 = y3(c1428pc.f15002r);
            if (y32 == null) {
                T2.G.m("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = c1428pc.f15004t;
            y32 = null;
            if (str != null && !str.isEmpty()) {
                T2.G.m("Request contained a PoolKey but split request is disabled.");
            }
        }
        Jr j5 = y32 == null ? AbstractC1668us.j(context, 9) : y32.f8589d;
        Mr mr = (Mr) ((CD) c1071hd2.f13762m).d();
        mr.d(c1428pc.f14995k.getStringArrayList("ad_types"));
        Km km = new Km(c1428pc.f15001q, mr, j5);
        C0709Wb c0709Wb = new C0709Wb(24, context, c1428pc.f14996l.f5852k);
        Gr gr = (Gr) ((CD) c1071hd2.f13763n).d();
        Jr j6 = AbstractC1668us.j(context, 11);
        Dr dr = Dr.f8395s;
        Dr dr2 = Dr.f8394r;
        if (y32 == null) {
            final Cr A3 = A3(c1428pc, gr, c1071hd2);
            final Cr z3 = z3(A3, gr, s2, mr, j5);
            Jr j7 = AbstractC1668us.j(context, 10);
            List asList = Arrays.asList(z3, A3);
            CallableC0564Bh callableC0564Bh = new CallableC0564Bh(z3, c1428pc, A3);
            C0954ev c0954ev = AbstractC1044gv.f13676l;
            asList.getClass();
            AbstractC1044gv l5 = AbstractC1044gv.l(asList);
            CallableC1819y7 callableC1819y7 = new CallableC1819y7(6);
            C0606Hd c0606Hd = AbstractC0613Id.f9544g;
            Dw dw = new Dw(l5, true, false);
            dw.f8420z = new Cw(dw, callableC1819y7, c0606Hd);
            dw.w();
            Dw dw2 = new Dw(l5, true, false);
            C0606Hd c0606Hd2 = gr.f9279a;
            dw2.f8420z = new Cw(dw2, callableC0564Bh, c0606Hd2);
            dw2.w();
            final Cr a8 = new C1324n6(gr, dr2, null, dw, asList, dw2).n(km).n(new Dp(4, j7)).n(c0709Wb).a();
            AbstractC1803xs.c0(a8, mr, j7, false);
            AbstractC1803xs.M(a8, j6);
            List asList2 = Arrays.asList(A3, z3, a8);
            Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.Am
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8805b2)).booleanValue() && (bundle = C1428pc.this.f15007w) != null) {
                        AbstractC0467k.C(P2.o.f4767B.f4776j, bundle, "http-response-ready");
                    }
                    return new Fm((Im) a8.f8093m.get(), (JSONObject) A3.f8093m.get(), (C1473qc) z3.f8093m.get());
                }
            };
            C0954ev c0954ev2 = AbstractC1044gv.f13676l;
            asList2.getClass();
            AbstractC1044gv l6 = AbstractC1044gv.l(asList2);
            CallableC1819y7 callableC1819y72 = new CallableC1819y7(6);
            C0606Hd c0606Hd3 = AbstractC0613Id.f9544g;
            Dw dw3 = new Dw(l6, true, false);
            dw3.f8420z = new Cw(dw3, callableC1819y72, c0606Hd3);
            dw3.w();
            Dw dw4 = new Dw(l6, true, false);
            dw4.f8420z = new Cw(dw4, callable, c0606Hd2);
            dw4.w();
            a5 = new C1324n6(gr, dr, null, dw3, asList2, dw4).p(a7).a();
        } else {
            Jm jm = new Jm(y32.f8587b, y32.f8586a);
            Jr j8 = AbstractC1668us.j(context, 10);
            Cr a9 = gr.a(AbstractC1400ot.c0(jm), dr2).n(km).n(new Dp(4, j8)).n(c0709Wb).a();
            AbstractC1803xs.c0(a9, mr, j8, false);
            Mw c02 = AbstractC1400ot.c0(y32);
            AbstractC1803xs.M(a9, j6);
            List asList3 = Arrays.asList(a9, c02);
            A4 a42 = new A4(8, a9, c02);
            C0954ev c0954ev3 = AbstractC1044gv.f13676l;
            asList3.getClass();
            AbstractC1044gv l7 = AbstractC1044gv.l(asList3);
            CallableC1819y7 callableC1819y73 = new CallableC1819y7(6);
            C0606Hd c0606Hd4 = AbstractC0613Id.f9544g;
            Dw dw5 = new Dw(l7, true, false);
            dw5.f8420z = new Cw(dw5, callableC1819y73, c0606Hd4);
            dw5.w();
            Dw dw6 = new Dw(l7, true, false);
            dw6.f8420z = new Cw(dw6, a42, gr.f9279a);
            dw6.w();
            a5 = new C1324n6(gr, dr, null, dw5, asList3, dw6).p(a7).a();
        }
        AbstractC1803xs.c0(a5, mr, j6, false);
        return a5;
    }

    public final E3.a w3(C1428pc c1428pc, int i) {
        int i5 = 7;
        int i6 = 2;
        int i7 = 1;
        int i8 = 23;
        int i9 = 4;
        C1071hd c1071hd = P2.o.f4767B.f4783q;
        U2.a a5 = U2.a.a();
        Context context = this.f9254k;
        C1875za s2 = c1071hd.s(context, a5, this.f9259p);
        if (!((Boolean) AbstractC1505r8.f15266a.s()).booleanValue()) {
            return AbstractC1400ot.Z(new Exception("Signal collection disabled."));
        }
        C0554Af c0554Af = this.f9257n;
        c0554Af.getClass();
        C2.h hVar = new C2.h(i, 6, c1428pc);
        C0554Af c0554Af2 = c0554Af.f7646b;
        CD b3 = CD.b(new C1796xl(c0554Af2.f7672p, i8));
        Zp zp = new Zp(i7, hVar);
        Zp zp2 = new Zp(i6, hVar);
        Zp zp3 = new Zp(i9, hVar);
        C1565sf c1565sf = c0554Af2.f7655g;
        CD cd = c0554Af2.f7650d;
        a3.y yVar = new a3.y(c1565sf, cd, zp, zp2, zp3, 17);
        C1520rf c1520rf = new C1520rf(c1565sf, 25);
        Zp zp4 = new Zp(0, hVar);
        C0650Nf c0650Nf = new C0650Nf(i8, zp4);
        C1655uf c1655uf = new C1655uf(cd, c1565sf, i5);
        Lj lj = new Lj(26);
        Zp zp5 = new Zp(3, hVar);
        CD cd2 = c0554Af2.f7632O;
        a3.y yVar2 = new a3.y(cd2, (DD) zp5, (DD) zp3, (DD) zp4, cd, 18);
        C1755wp c1755wp = new C1755wp(zp4, cd2, cd, 4);
        Zp zp6 = new Zp(5, hVar);
        CD b5 = CD.b(JB.f9880G);
        CD b6 = CD.b(AbstractC1561sb.f15503S);
        CD b7 = CD.b(AbstractC1561sb.f15504T);
        CD b8 = CD.b(JB.f9881H);
        int i10 = FD.f8943b;
        LinkedHashMap G5 = AbstractC0952et.G(4);
        Dr dr = Dr.f8392p;
        AbstractC1400ot.l("provider", b5);
        G5.put(dr, b5);
        Dr dr2 = Dr.f8393q;
        AbstractC1400ot.l("provider", b6);
        G5.put(dr2, b6);
        Dr dr3 = Dr.f8394r;
        AbstractC1400ot.l("provider", b7);
        G5.put(dr3, b7);
        Dr dr4 = Dr.f8395s;
        AbstractC1400ot.l("provider", b8);
        G5.put(dr4, b8);
        CD b9 = CD.b(new C0936ed(zp6, c0554Af2.f7655g, new FD(G5), 13));
        int i11 = KD.f10142c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(b9);
        CD b10 = CD.b(new C0903dp(c0554Af2.f7650d, new Lh(new KD(list, arrayList), 24), 18));
        Context context2 = (Context) c0554Af2.f7644a.f14810b;
        AbstractC1400ot.D(context2);
        Object d5 = c0554Af2.f7629L0.d();
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        String string = ((C1428pc) hVar.f834m).f14995k.getString("ms");
        if (string == null) {
            string = "";
        }
        Qo qo = new Qo(6, c0606Hd, string);
        C0606Hd c0606Hd2 = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd2);
        ArrayList arrayList2 = c1428pc.f14999o;
        AbstractC1400ot.D(arrayList2);
        Qo qo2 = new Qo(7, c0606Hd2, arrayList2);
        AD a6 = CD.a(yVar);
        AD a7 = CD.a(c1520rf);
        CD.a(c0650Nf);
        AD a8 = CD.a(c1655uf);
        AD a9 = CD.a(lj);
        CD.a(yVar2);
        AD a10 = CD.a(c1755wp);
        AbstractC1400ot.D(c0606Hd2);
        Mr mr = (Mr) b3.d();
        C1482ql c1482ql = (C1482ql) c0554Af2.f7688x.d();
        HashSet hashSet = new HashSet();
        hashSet.add((Wp) d5);
        hashSet.add(qo);
        hashSet.add(qo2);
        A7 a72 = F7.v5;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a72)).booleanValue()) {
            hashSet.add((Mp) a6.d());
        }
        A7 a73 = F7.w5;
        D7 d7 = rVar.f5056c;
        if (((Boolean) d7.a(a73)).booleanValue()) {
            hashSet.add((Mp) a7.d());
        }
        if (((Boolean) d7.a(F7.y5)).booleanValue()) {
            hashSet.add((Mp) a8.d());
        }
        if (((Boolean) d7.a(F7.z5)).booleanValue()) {
            hashSet.add((Mp) a9.d());
        }
        if (((Boolean) d7.a(F7.f8769U2)).booleanValue()) {
            hashSet.add((Mp) a10.d());
        }
        Op op = new Op(context2, c0606Hd2, hashSet, mr, c1482ql);
        P2.c a11 = s2.a("google.afma.request.getSignals", AbstractC1830ya.f16434b, AbstractC1830ya.f16435c);
        Jr j5 = AbstractC1668us.j(context, 22);
        C1324n6 p5 = ((Gr) b10.d()).a(AbstractC1400ot.c0(c1428pc.f14995k), Dr.f8396t).n(new Dp(4, j5)).p(new C0565Ca(8, op, c1428pc));
        Dr dr5 = Dr.f8397u;
        Cr a12 = ((Gr) p5.f14583p).a(p5.a(), dr5).p(a11).a();
        Mr mr2 = (Mr) b3.d();
        Bundle bundle = c1428pc.f14995k;
        mr2.d(bundle.getStringArrayList("ad_types"));
        mr2.f(bundle.getBundle("extras"));
        AbstractC1803xs.c0(a12, mr2, j5, true);
        if (((Boolean) AbstractC1058h8.f.s()).booleanValue()) {
            Mt mt = this.f9256m;
            Objects.requireNonNull(mt);
            a12.a(new RunnableC1303mm(2, mt), this.f9255l);
        }
        return a12;
    }

    public final E3.a x3(String str) {
        if (((Boolean) AbstractC1371o8.f14773a.s()).booleanValue()) {
            return y3(str) == null ? AbstractC1400ot.Z(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : AbstractC1400ot.c0(new Dm());
        }
        return AbstractC1400ot.Z(new Exception("Split request is disabled."));
    }

    public final synchronized Em y3(String str) {
        Iterator it = this.f9258o.iterator();
        while (it.hasNext()) {
            Em em = (Em) it.next();
            if (em.f8588c.equals(str)) {
                it.remove();
                return em;
            }
        }
        return null;
    }
}
