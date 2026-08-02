package com.google.android.gms.internal.ads;

import Q2.AbstractBinderC0389v0;
import Q2.InterfaceC0391w0;
import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.xn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1798xn implements InterfaceC1573sn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16325a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16326b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16327c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f16328d;

    public /* synthetic */ C1798xn(Context context, Object obj, Executor executor, int i) {
        this.f16325a = i;
        this.f16326b = context;
        this.f16327c = obj;
        this.f16328d = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0528  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c(Sq sq, Lq lq, C1394on c1394on) {
        Yq yq;
        C0950er c0950er;
        InterfaceC0694Ua interfaceC0694Ua;
        C0673Ra c0673Ra;
        C0680Sa c0680Sa;
        Gj gj;
        Fj fj;
        E8 u32;
        View view;
        String readString;
        ArrayList readArrayList;
        String readString2;
        Bundle bundle;
        String readString3;
        View view2;
        InterfaceC2360a h1;
        String readString4;
        I8 u33;
        Gj gj2;
        C0680Sa c0680Sa2;
        C0680Sa c0680Sa3;
        Object obj = c1394on.f14849b;
        try {
            C0673Ra M5 = ((C0950er) obj).f13363a.M();
            C0950er c0950er2 = (C0950er) obj;
            InterfaceC0638Ma interfaceC0638Ma = c0950er2.f13363a;
            try {
                C0680Sa U4 = interfaceC0638Ma.U();
                try {
                    InterfaceC0694Ua k5 = interfaceC0638Ma.k();
                    if (k5 != null && d(sq, 6)) {
                        gj = Gj.S(k5);
                    } else {
                        if (M5 == null || !d(sq, 6)) {
                            if (M5 == null || !d(sq, 2)) {
                                c0950er = c0950er2;
                                interfaceC0694Ua = k5;
                                c0673Ra = M5;
                                if (U4 != null && d(sq, 6)) {
                                    try {
                                        c0680Sa2 = U4;
                                        try {
                                            Parcel Y4 = c0680Sa2.Y(U4.N(), 16);
                                            InterfaceC0391w0 u34 = AbstractBinderC0389v0.u3(Y4.readStrongBinder());
                                            Y4.recycle();
                                            Fj fj2 = u34 == null ? null : new Fj(u34, null);
                                            Parcel Y5 = c0680Sa2.Y(c0680Sa2.N(), 19);
                                            E8 u35 = D8.u3(Y5.readStrongBinder());
                                            Y5.recycle();
                                            Parcel Y6 = c0680Sa2.Y(c0680Sa2.N(), 15);
                                            InterfaceC2360a h12 = BinderC2361b.h1(Y6.readStrongBinder());
                                            Y6.recycle();
                                            View view3 = (View) Gj.B(h12);
                                            Parcel Y7 = c0680Sa2.Y(c0680Sa2.N(), 2);
                                            String readString5 = Y7.readString();
                                            Y7.recycle();
                                            Parcel Y8 = c0680Sa2.Y(c0680Sa2.N(), 3);
                                            ArrayList readArrayList2 = Y8.readArrayList(F5.f8654a);
                                            Y8.recycle();
                                            Parcel Y9 = c0680Sa2.Y(c0680Sa2.N(), 4);
                                            String readString6 = Y9.readString();
                                            Y9.recycle();
                                            Parcel Y10 = c0680Sa2.Y(c0680Sa2.N(), 13);
                                            Bundle bundle2 = (Bundle) F5.a(Y10, Bundle.CREATOR);
                                            Y10.recycle();
                                            Parcel Y11 = c0680Sa2.Y(c0680Sa2.N(), 6);
                                            String readString7 = Y11.readString();
                                            Y11.recycle();
                                            View view4 = (View) Gj.B(c0680Sa2.t1());
                                            Parcel Y12 = c0680Sa2.Y(c0680Sa2.N(), 21);
                                            InterfaceC2360a h13 = BinderC2361b.h1(Y12.readStrongBinder());
                                            Y12.recycle();
                                            Parcel Y13 = c0680Sa2.Y(c0680Sa2.N(), 5);
                                            I8 u36 = BinderC1865z8.u3(Y13.readStrongBinder());
                                            Y13.recycle();
                                            Parcel Y14 = c0680Sa2.Y(c0680Sa2.N(), 7);
                                            String readString8 = Y14.readString();
                                            Y14.recycle();
                                            gj = Gj.A(fj2, u35, view3, readString5, readArrayList2, readString6, bundle2, readString7, view4, h13, null, null, -1.0d, u36, readString8, 0.0f);
                                        } catch (RemoteException e3) {
                                            e = e3;
                                            U2.j.j("Failed to get native ad assets from content ad mapper", e);
                                            gj = null;
                                            c0680Sa = c0680Sa2;
                                            if (gj != null) {
                                            }
                                            throw new C0858co("No corresponding native ad listener", 1);
                                        }
                                    } catch (RemoteException e5) {
                                        e = e5;
                                        c0680Sa2 = U4;
                                    }
                                    c0680Sa = c0680Sa2;
                                } else {
                                    if (U4 == null || !d(sq, 1)) {
                                        throw new C0858co("No native ad mappers", 1);
                                    }
                                    try {
                                        Parcel Y15 = U4.Y(U4.N(), 16);
                                        InterfaceC0391w0 u37 = AbstractBinderC0389v0.u3(Y15.readStrongBinder());
                                        Y15.recycle();
                                        fj = u37 == null ? null : new Fj(u37, null);
                                        Parcel Y16 = U4.Y(U4.N(), 19);
                                        u32 = D8.u3(Y16.readStrongBinder());
                                        Y16.recycle();
                                        Parcel Y17 = U4.Y(U4.N(), 15);
                                        InterfaceC2360a h14 = BinderC2361b.h1(Y17.readStrongBinder());
                                        Y17.recycle();
                                        view = (View) Gj.B(h14);
                                        Parcel Y18 = U4.Y(U4.N(), 2);
                                        readString = Y18.readString();
                                        Y18.recycle();
                                        Parcel Y19 = U4.Y(U4.N(), 3);
                                        readArrayList = Y19.readArrayList(F5.f8654a);
                                        Y19.recycle();
                                        Parcel Y20 = U4.Y(U4.N(), 4);
                                        readString2 = Y20.readString();
                                        Y20.recycle();
                                        Parcel Y21 = U4.Y(U4.N(), 13);
                                        bundle = (Bundle) F5.a(Y21, Bundle.CREATOR);
                                        Y21.recycle();
                                        Parcel Y22 = U4.Y(U4.N(), 6);
                                        readString3 = Y22.readString();
                                        Y22.recycle();
                                        view2 = (View) Gj.B(U4.t1());
                                        Parcel Y23 = U4.Y(U4.N(), 21);
                                        h1 = BinderC2361b.h1(Y23.readStrongBinder());
                                        Y23.recycle();
                                        Parcel Y24 = U4.Y(U4.N(), 7);
                                        readString4 = Y24.readString();
                                        Y24.recycle();
                                        Parcel Y25 = U4.Y(U4.N(), 5);
                                        u33 = BinderC1865z8.u3(Y25.readStrongBinder());
                                        Y25.recycle();
                                        gj2 = new Gj();
                                        c0680Sa = U4;
                                    } catch (RemoteException e6) {
                                        e = e6;
                                        c0680Sa = U4;
                                    }
                                    try {
                                        gj2.f9226a = 1;
                                        gj2.f9227b = fj;
                                        gj2.f9228c = u32;
                                        gj2.f9229d = view;
                                        gj2.u("headline", readString);
                                        gj2.f9230e = readArrayList;
                                        gj2.u("body", readString2);
                                        gj2.f9232h = bundle;
                                        gj2.u("call_to_action", readString3);
                                        gj2.f9238o = view2;
                                        gj2.f9240q = h1;
                                        gj2.u("advertiser", readString4);
                                        gj2.f9243t = u33;
                                        gj = gj2;
                                    } catch (RemoteException e7) {
                                        e = e7;
                                        U2.j.j("Failed to get native ad from content ad mapper", e);
                                        gj = null;
                                        if (gj != null) {
                                        }
                                        throw new C0858co("No corresponding native ad listener", 1);
                                    }
                                }
                            } else {
                                try {
                                    Parcel Y26 = M5.Y(M5.N(), 17);
                                    InterfaceC0391w0 u38 = AbstractBinderC0389v0.u3(Y26.readStrongBinder());
                                    Y26.recycle();
                                    Fj fj3 = u38 == null ? null : new Fj(u38, null);
                                    Parcel Y27 = M5.Y(M5.N(), 19);
                                    E8 u39 = D8.u3(Y27.readStrongBinder());
                                    Y27.recycle();
                                    Parcel Y28 = M5.Y(M5.N(), 18);
                                    InterfaceC2360a h15 = BinderC2361b.h1(Y28.readStrongBinder());
                                    Y28.recycle();
                                    View view5 = (View) Gj.B(h15);
                                    Parcel Y29 = M5.Y(M5.N(), 2);
                                    String readString9 = Y29.readString();
                                    Y29.recycle();
                                    Parcel Y30 = M5.Y(M5.N(), 3);
                                    ArrayList readArrayList3 = Y30.readArrayList(F5.f8654a);
                                    Y30.recycle();
                                    c0950er = c0950er2;
                                    try {
                                        Parcel Y31 = M5.Y(M5.N(), 4);
                                        String readString10 = Y31.readString();
                                        Y31.recycle();
                                        Parcel Y32 = M5.Y(M5.N(), 15);
                                        Bundle bundle3 = (Bundle) F5.a(Y32, Bundle.CREATOR);
                                        Y32.recycle();
                                        interfaceC0694Ua = k5;
                                        try {
                                            Parcel Y33 = M5.Y(M5.N(), 6);
                                            String readString11 = Y33.readString();
                                            Y33.recycle();
                                            View view6 = (View) Gj.B(M5.t1());
                                            c0680Sa3 = U4;
                                            try {
                                                Parcel Y34 = M5.Y(M5.N(), 21);
                                                InterfaceC2360a h16 = BinderC2361b.h1(Y34.readStrongBinder());
                                                Y34.recycle();
                                                Parcel Y35 = M5.Y(M5.N(), 8);
                                                String readString12 = Y35.readString();
                                                Y35.recycle();
                                                Parcel Y36 = M5.Y(M5.N(), 9);
                                                String readString13 = Y36.readString();
                                                Y36.recycle();
                                                Parcel Y37 = M5.Y(M5.N(), 7);
                                                double readDouble = Y37.readDouble();
                                                Y37.recycle();
                                                Parcel Y38 = M5.Y(M5.N(), 5);
                                                I8 u310 = BinderC1865z8.u3(Y38.readStrongBinder());
                                                Y38.recycle();
                                                Gj gj3 = new Gj();
                                                c0673Ra = M5;
                                                try {
                                                    gj3.f9226a = 2;
                                                    gj3.f9227b = fj3;
                                                    gj3.f9228c = u39;
                                                    gj3.f9229d = view5;
                                                    gj3.u("headline", readString9);
                                                    gj3.f9230e = readArrayList3;
                                                    gj3.u("body", readString10);
                                                    gj3.f9232h = bundle3;
                                                    gj3.u("call_to_action", readString11);
                                                    gj3.f9238o = view6;
                                                    gj3.f9240q = h16;
                                                    gj3.u("store", readString12);
                                                    gj3.u("price", readString13);
                                                    gj3.f9241r = readDouble;
                                                    gj3.f9242s = u310;
                                                    gj = gj3;
                                                } catch (RemoteException e8) {
                                                    e = e8;
                                                    U2.j.j("Failed to get native ad from app install ad mapper", e);
                                                    gj = null;
                                                    c0680Sa = c0680Sa3;
                                                    if (gj != null) {
                                                    }
                                                    throw new C0858co("No corresponding native ad listener", 1);
                                                }
                                            } catch (RemoteException e9) {
                                                e = e9;
                                                c0673Ra = M5;
                                            }
                                        } catch (RemoteException e10) {
                                            e = e10;
                                            c0673Ra = M5;
                                            c0680Sa3 = U4;
                                            U2.j.j("Failed to get native ad from app install ad mapper", e);
                                            gj = null;
                                            c0680Sa = c0680Sa3;
                                            if (gj != null) {
                                            }
                                            throw new C0858co("No corresponding native ad listener", 1);
                                        }
                                    } catch (RemoteException e11) {
                                        e = e11;
                                        interfaceC0694Ua = k5;
                                        c0673Ra = M5;
                                        c0680Sa3 = U4;
                                        U2.j.j("Failed to get native ad from app install ad mapper", e);
                                        gj = null;
                                        c0680Sa = c0680Sa3;
                                        if (gj != null) {
                                        }
                                        throw new C0858co("No corresponding native ad listener", 1);
                                    }
                                } catch (RemoteException e12) {
                                    e = e12;
                                    c0950er = c0950er2;
                                }
                                c0680Sa = c0680Sa3;
                            }
                            if (gj != null) {
                                if (((Wq) sq.f11595a.f11722l).f12100g.contains(Integer.toString(gj.D()))) {
                                    C0905dr c0905dr = new C0905dr(sq, lq, c1394on.f14848a);
                                    Mt mt = new Mt(21, gj);
                                    C0905dr c0905dr2 = new C0905dr(c0680Sa, c0673Ra, interfaceC0694Ua);
                                    C1880zf c1880zf = (C1880zf) this.f16327c;
                                    C1880zf c1880zf2 = c1880zf.f16679c;
                                    C1119ih c1119ih = new C1119ih(c0905dr, 0);
                                    CD cd = c1880zf2.f16715v;
                                    C0554Af c0554Af = c1880zf.f16677b;
                                    O5 o5 = c0554Af.f7614C0;
                                    CD b3 = CD.b(new C0556Ah(cd, c1119ih, 0));
                                    CD b5 = CD.b(new C1388oh(b3, 12));
                                    int i = KD.f10142c;
                                    ArrayList arrayList = new ArrayList(1);
                                    ArrayList arrayList2 = new ArrayList(2);
                                    arrayList2.add(c1880zf2.f16700n0);
                                    arrayList2.add(c1880zf2.f16702o0);
                                    arrayList.add(b5);
                                    CD b6 = CD.b(new Lh(new KD(arrayList, arrayList2), 3));
                                    CD b7 = CD.b(AbstractC1561sb.f15496L);
                                    CD b8 = CD.b(new C1701vg(b7, c0554Af.f7648c, 9));
                                    C1119ih c1119ih2 = new C1119ih(c0905dr, 3);
                                    C1119ih c1119ih3 = new C1119ih(c0905dr, 2);
                                    C1565sf c1565sf = c0554Af.f7655g;
                                    CD b9 = CD.b(new C1520rf(c1565sf, 13));
                                    CD b10 = CD.b(AbstractC1561sb.f15501Q);
                                    C1476qf c1476qf = c0554Af.f7635R;
                                    CD cd2 = c0554Af.f7689x0;
                                    CD cd3 = c0554Af.f7650d;
                                    CD b11 = CD.b(new C1387og(c1565sf, c0554Af.f7648c, cd3, c1119ih2, c1119ih, c1880zf2.f16692j0, CD.b(new C1118ig(c0554Af.f7620G, c0554Af.f7618F, c1119ih, c1119ih3, CD.b(new C1118ig(c1565sf, c1476qf, b9, b10, cd2, cd3)), c1880zf2.f16683e)), new Lj(1), new O5(29), c0554Af.f7613C, c1880zf2.f16694k0, c1880zf2.f16683e, c1880zf2.f16710s0));
                                    C1388oh c1388oh = new C1388oh(b11, 1);
                                    C1388oh c1388oh2 = new C1388oh(CD.b(new C0847cd(c1119ih, c0554Af.f7633P, 3)), 18);
                                    ArrayList arrayList3 = new ArrayList(4);
                                    ArrayList arrayList4 = new ArrayList(2);
                                    arrayList3.add(c1880zf2.f16704p0);
                                    arrayList4.add(c1880zf2.f16706q0);
                                    arrayList4.add(c1880zf2.f16708r0);
                                    arrayList3.add(b8);
                                    arrayList3.add(c1388oh);
                                    arrayList3.add(c1388oh2);
                                    CD b12 = CD.b(new Lh(new KD(arrayList3, arrayList4), 4));
                                    CD b13 = CD.b(new C1212kl(c0554Af.f7655g, c0554Af.f7687w0, c0554Af.f7688x, c1119ih2, c1119ih, c0554Af.f7617E, AbstractC1561sb.f15499O));
                                    CD b14 = CD.b(new C1388oh(b13, 10));
                                    CD b15 = CD.b(new C1701vg(b7, c0554Af.f7648c, 8));
                                    CD b16 = CD.b(new C1388oh(CD.b(new C1478qh(c0554Af.f7679s0, c1880zf2.f16681d, 0)), 8));
                                    C1388oh c1388oh3 = new C1388oh(b11, 0);
                                    ArrayList arrayList5 = new ArrayList(5);
                                    ArrayList arrayList6 = new ArrayList(3);
                                    arrayList5.add(c1880zf2.f16712t0);
                                    arrayList5.add(c1880zf2.f16714u0);
                                    arrayList6.add(c1880zf2.f16716v0);
                                    arrayList6.add(c1880zf2.f16718w0);
                                    arrayList5.add(b14);
                                    arrayList5.add(b15);
                                    arrayList6.add(b16);
                                    arrayList5.add(c1388oh3);
                                    CD b17 = CD.b(new Lh(new KD(arrayList5, arrayList6), 0));
                                    CD b18 = CD.b(new C1388oh(b13, 11));
                                    CD b19 = CD.b(new C1701vg(b7, c0554Af.f7648c, 11));
                                    CD b20 = CD.b(new C1701vg(b7, c0554Af.f7648c, 14));
                                    CD b21 = CD.b(JB.f9876C);
                                    C1032gj c1032gj = new C1032gj(b21, 6);
                                    ArrayList arrayList7 = new ArrayList(2);
                                    ArrayList arrayList8 = new ArrayList(1);
                                    arrayList8.add(c1880zf2.B0);
                                    arrayList7.add(b20);
                                    arrayList7.add(c1032gj);
                                    C1476qf c1476qf2 = new C1476qf(CD.b(new C0847cd(new KD(arrayList7, arrayList8), c1119ih, 11)), 19);
                                    C1388oh c1388oh4 = new C1388oh(b11, 3);
                                    ArrayList arrayList9 = new ArrayList(6);
                                    ArrayList arrayList10 = new ArrayList(2);
                                    arrayList9.add(c1880zf2.f16720x0);
                                    arrayList9.add(c1880zf2.f16722y0);
                                    arrayList10.add(c1880zf2.f16724z0);
                                    arrayList10.add(c1880zf2.f16632A0);
                                    arrayList9.add(b18);
                                    arrayList9.add(b19);
                                    arrayList9.add(c1476qf2);
                                    arrayList9.add(c1388oh4);
                                    CD b22 = CD.b(new Lh(new KD(arrayList9, arrayList10), 2));
                                    C1388oh c1388oh5 = new C1388oh(b11, 5);
                                    ArrayList arrayList11 = new ArrayList(1);
                                    ArrayList arrayList12 = new ArrayList(1);
                                    arrayList12.add(c1880zf2.f16635C0);
                                    arrayList11.add(c1388oh5);
                                    CD b23 = CD.b(new Lh(new KD(arrayList11, arrayList12), 18));
                                    C1476qf c1476qf3 = new C1476qf(CD.b(new C0556Ah(c1119ih, c0554Af.f7620G)), 29);
                                    ArrayList arrayList13 = new ArrayList(1);
                                    new ArrayList(1).add(c1880zf2.f16637D0);
                                    arrayList13.add(c1476qf3);
                                    CD b24 = CD.b(new C1701vg(b7, c0554Af.f7648c, 15));
                                    ArrayList arrayList14 = new ArrayList(1);
                                    ArrayList arrayList15 = new ArrayList(1);
                                    arrayList15.add(c1880zf2.E0);
                                    arrayList14.add(b24);
                                    CD b25 = CD.b(new Lh(new KD(arrayList14, arrayList15), 19));
                                    CD b26 = CD.b(new C1388oh(b3, 13));
                                    C1388oh c1388oh6 = new C1388oh(b11, 4);
                                    ArrayList arrayList16 = new ArrayList(6);
                                    ArrayList arrayList17 = new ArrayList(4);
                                    arrayList16.add(c1880zf2.f16640F0);
                                    arrayList17.add(c1880zf2.f16642G0);
                                    arrayList16.add(c1880zf2.f16644H0);
                                    arrayList16.add(c1880zf2.f16646I0);
                                    arrayList17.add(c1880zf2.f16647J0);
                                    arrayList17.add(c1880zf2.f16648K0);
                                    arrayList17.add(c1880zf2.f16650L0);
                                    arrayList16.add(c1880zf2.f16652M0);
                                    arrayList16.add(b26);
                                    arrayList16.add(c1388oh6);
                                    CD b27 = CD.b(new Lh(new KD(arrayList16, arrayList17), 5));
                                    C1388oh c1388oh7 = new C1388oh(CD.b(new C1476qf(b12, 18)), 7);
                                    CD b28 = CD.b(new C1701vg(b7, c0554Af.f7648c, 13));
                                    ArrayList arrayList18 = new ArrayList(2);
                                    ArrayList arrayList19 = new ArrayList(1);
                                    arrayList19.add(c1880zf2.f16656O0);
                                    arrayList18.add(c1388oh7);
                                    arrayList18.add(b28);
                                    CD b29 = CD.b(new Lh(new KD(arrayList18, arrayList19), 9));
                                    C0650Nf c0650Nf = new C0650Nf(14, mt);
                                    C0847cd c0847cd = new C0847cd(new C1749wj(c0650Nf, 1), c0554Af.f7648c, 14);
                                    ArrayList arrayList20 = new ArrayList(1);
                                    ArrayList arrayList21 = new ArrayList(1);
                                    arrayList21.add(c1880zf2.f16658P0);
                                    arrayList20.add(c0847cd);
                                    CD b30 = CD.b(new Lh(new KD(arrayList20, arrayList21), 23));
                                    CD b31 = CD.b(new C1388oh(b13, 9));
                                    ArrayList arrayList22 = new ArrayList(1);
                                    List list = Collections.EMPTY_LIST;
                                    arrayList22.add(b31);
                                    CD b32 = CD.b(new Lh(new KD(arrayList22, list), 12));
                                    CD b33 = CD.b(new C1701vg(b7, c0554Af.f7648c, 10));
                                    C1388oh c1388oh8 = new C1388oh(b11, 2);
                                    ArrayList arrayList23 = new ArrayList(2);
                                    ArrayList arrayList24 = new ArrayList(1);
                                    arrayList24.add(c1880zf2.f16660Q0);
                                    arrayList23.add(b33);
                                    arrayList23.add(c1388oh8);
                                    Lh lh = new Lh(new KD(arrayList23, arrayList24), 1);
                                    CD b34 = CD.b(new C1388oh(b13, 6));
                                    ArrayList arrayList25 = new ArrayList(1);
                                    List list2 = Collections.EMPTY_LIST;
                                    arrayList25.add(b34);
                                    CD b35 = CD.b(new C0936ed(lh, new KD(arrayList25, list2), c0554Af.f7650d, 9));
                                    C1119ih c1119ih4 = new C1119ih(c0905dr, 1);
                                    a3.y yVar = new a3.y(c1119ih, c1119ih4, c1880zf2.f16721y, c1119ih3, c1880zf2.f);
                                    ArrayList arrayList26 = new ArrayList(1);
                                    ArrayList arrayList27 = new ArrayList(1);
                                    arrayList27.add(c1880zf2.f16664S0);
                                    arrayList26.add(c1880zf2.f16666T0);
                                    a3.r rVar = new a3.r(c1119ih2, c1119ih, b6, b27, c1880zf2.f16662R0, yVar, b7, new Lh(new KD(arrayList26, arrayList27), 6), b23);
                                    C1032gj c1032gj2 = new C1032gj(CD.b(new C0595Fg(new C0943ek(c0905dr2, 0), new C0943ek(c0905dr2, 1), new C0943ek(c0905dr2, 2), b22, b17, b25, c1880zf2.f16715v, c1119ih, c0554Af.f7660j, c1880zf2.f16681d)), 8);
                                    CD b36 = CD.b(new C1791xg(c1119ih, 1));
                                    Lj lj = new Lj(2);
                                    Lj lj2 = new Lj(3);
                                    CD b37 = CD.b(new C0650Nf(13, new C1749wj(c0650Nf, 0)));
                                    Hh hh = c1880zf2.f16681d;
                                    C1476qf c1476qf4 = c0554Af.f7635R;
                                    CD cd4 = c0554Af.f7648c;
                                    Qj qj = new Qj(c1476qf4, hh, b36, c0650Nf, lj, lj2, cd4, b37);
                                    C1168jm c1168jm = new C1168jm();
                                    CD b38 = CD.b(new Ak(c1119ih4, c1168jm, c0650Nf, 1));
                                    CD b39 = CD.b(new Ak(c1119ih4, c1168jm, c0650Nf, 0));
                                    CD b40 = CD.b(new C0555Ag((DD) c1119ih4, (DD) c1168jm, (DD) c0650Nf, c0554Af.f7688x, 8));
                                    CD b41 = CD.b(new C0847cd(c1168jm, c0650Nf, 17));
                                    C1565sf c1565sf2 = c0554Af.f7655g;
                                    C1168jm.a(c1168jm, CD.b(new Dj(rVar, cd4, c0650Nf, c1032gj2, qj, b36, c1880zf2.f16655O, b38, b39, b40, b41, CD.b(new C0555Ag(c1565sf2, c0650Nf, qj, c1168jm, 7)), new C0637Lg(c1565sf2, c1880zf2.f16681d, 2), c0554Af.f7613C, c0554Af.f7660j, c1565sf2, b37, b21, c0554Af.f7626J0)));
                                    ((Hn) c1394on.f14850c).v3(new BinderC1440po((Kh) b17.d(), (Ui) b25.d(), (Uh) b22.d(), (Yh) b12.d(), (C0763ai) b27.d(), (C1793xi) c1880zf2.f16654N0.d(), (C1076hi) b29.d(), (C0853cj) b30.d(), (C1658ui) b32.d(), (Sh) b35.d()));
                                    ((Xh) b6.d()).m1(new C0939eg(0, c0950er), this.f16328d);
                                    return (Cj) c1168jm.d();
                                }
                            }
                            throw new C0858co("No corresponding native ad listener", 1);
                        }
                        try {
                            Parcel Y39 = M5.Y(M5.N(), 17);
                            InterfaceC0391w0 u311 = AbstractBinderC0389v0.u3(Y39.readStrongBinder());
                            Y39.recycle();
                            Fj fj4 = u311 == null ? null : new Fj(u311, null);
                            Parcel Y40 = M5.Y(M5.N(), 19);
                            E8 u312 = D8.u3(Y40.readStrongBinder());
                            Y40.recycle();
                            Parcel Y41 = M5.Y(M5.N(), 18);
                            InterfaceC2360a h17 = BinderC2361b.h1(Y41.readStrongBinder());
                            Y41.recycle();
                            View view7 = (View) Gj.B(h17);
                            Parcel Y42 = M5.Y(M5.N(), 2);
                            String readString14 = Y42.readString();
                            Y42.recycle();
                            Parcel Y43 = M5.Y(M5.N(), 3);
                            ArrayList readArrayList4 = Y43.readArrayList(F5.f8654a);
                            Y43.recycle();
                            Parcel Y44 = M5.Y(M5.N(), 4);
                            String readString15 = Y44.readString();
                            Y44.recycle();
                            Parcel Y45 = M5.Y(M5.N(), 15);
                            Bundle bundle4 = (Bundle) F5.a(Y45, Bundle.CREATOR);
                            Y45.recycle();
                            Parcel Y46 = M5.Y(M5.N(), 6);
                            String readString16 = Y46.readString();
                            Y46.recycle();
                            View view8 = (View) Gj.B(M5.t1());
                            Parcel Y47 = M5.Y(M5.N(), 21);
                            InterfaceC2360a h18 = BinderC2361b.h1(Y47.readStrongBinder());
                            Y47.recycle();
                            Parcel Y48 = M5.Y(M5.N(), 8);
                            String readString17 = Y48.readString();
                            Y48.recycle();
                            Parcel Y49 = M5.Y(M5.N(), 9);
                            String readString18 = Y49.readString();
                            Y49.recycle();
                            Parcel Y50 = M5.Y(M5.N(), 7);
                            double readDouble2 = Y50.readDouble();
                            Y50.recycle();
                            Parcel Y51 = M5.Y(M5.N(), 5);
                            I8 u313 = BinderC1865z8.u3(Y51.readStrongBinder());
                            Y51.recycle();
                            gj = Gj.A(fj4, u312, view7, readString14, readArrayList4, readString15, bundle4, readString16, view8, h18, readString17, readString18, readDouble2, u313, null, 0.0f);
                        } catch (RemoteException e13) {
                            U2.j.j("Failed to get native ad assets from app install ad mapper", e13);
                            gj = null;
                        }
                    }
                    c0950er = c0950er2;
                    interfaceC0694Ua = k5;
                    c0673Ra = M5;
                    c0680Sa = U4;
                    if (gj != null) {
                    }
                    throw new C0858co("No corresponding native ad listener", 1);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static final boolean d(Sq sq, int i) {
        return ((Wq) sq.f11595a.f11722l).f12100g.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1573sn
    public final Object a(Sq sq, Lq lq, C1394on c1394on) {
        Yq yq;
        View view;
        Executor executor = this.f16328d;
        Object obj = this.f16327c;
        switch (this.f16325a) {
            case 0:
                C0905dr c0905dr = new C0905dr(sq, lq, c1394on.f14848a);
                C1390oj c1390oj = new C1390oj(17, new Mt(27, c1394on), (Object) null);
                f2.m mVar = new f2.m(lq.f10490a0, 2);
                C0578Df c0578Df = (C0578Df) obj;
                C0578Df c0578Df2 = c0578Df.f8271d;
                C0562Bf c0562Bf = new C0562Bf(c0578Df.f8268c, c0578Df2, c0905dr, c1390oj, mVar);
                ((Xh) c0562Bf.f7844p.d()).m1(new C0939eg(0, (C0950er) c1394on.f14849b), (Qw) executor);
                ((Hn) c1394on.f14850c).v3(new BinderC1440po((Kh) c0562Bf.f7827F.d(), (Ui) c0562Bf.f7829H.d(), (Uh) c0562Bf.f7823B.d(), (Yh) c0562Bf.f7826E.d(), (C0763ai) c0562Bf.f7830I.d(), (C1793xi) c0578Df2.f8292l1.d(), (C1076hi) c0562Bf.J.d(), (C0853cj) c0562Bf.K.d(), (C1658ui) c0562Bf.f7831L.d(), (Sh) c0562Bf.f7833N.d()));
                return c0562Bf.q0();
            case 1:
                boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.x7)).booleanValue();
                Object obj2 = c1394on.f14849b;
                if (booleanValue && lq.f10501g0) {
                    try {
                        C0666Qa h3 = ((C0950er) obj2).f13363a.h();
                        if (h3 == null) {
                            U2.j.f("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                            throw new Yq(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
                        }
                        try {
                            view = (View) BinderC2361b.t1(h3.t1());
                            Parcel Y4 = h3.Y(h3.N(), 2);
                            ClassLoader classLoader = F5.f8654a;
                            boolean z3 = Y4.readInt() != 0;
                            Y4.recycle();
                            if (view == null) {
                                throw new Yq(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                            }
                            if (z3) {
                                try {
                                    view = (View) AbstractC1400ot.j0(Mw.f10750l, new C1030gh(this, view, lq, 4), AbstractC0613Id.f).get();
                                } catch (InterruptedException | ExecutionException e3) {
                                    throw new Yq(e3);
                                }
                            }
                        } catch (RemoteException e32) {
                            throw new Yq(e32);
                        }
                    } finally {
                    }
                } else {
                    try {
                        view = (View) BinderC2361b.t1(((C0950er) obj2).f13363a.m());
                    } finally {
                    }
                }
                C0905dr c0905dr2 = new C0905dr(sq, lq, c1394on.f14848a);
                C0950er c0950er = (C0950er) obj2;
                m2.g gVar = new m2.g(view, (InterfaceC0677Re) null, new U4(22, c0950er), (Mq) lq.f10527u.get(0));
                C0594Ff c0594Ff = (C0594Ff) obj;
                C0594Ff c0594Ff2 = c0594Ff.f9019e;
                C0586Ef c0586Ef = new C0586Ef(c0594Ff.f9016d, c0594Ff2, c0905dr2, gVar);
                ((Ti) c0586Ef.f8548O.d()).p1(view);
                ((Xh) c0586Ef.f8558p.d()).m1(new C0939eg(0, c0950er), executor);
                ((Hn) c1394on.f14850c).v3(new BinderC1440po((Kh) c0586Ef.f8536A.d(), (Ui) c0586Ef.f8542G.d(), (Uh) c0586Ef.f8539D.d(), (Yh) c0586Ef.f8567y.d(), c0586Ef.r0(), (C1793xi) c0594Ff2.i1.d(), (C1076hi) c0586Ef.J.d(), (C0853cj) c0586Ef.K.d(), (C1658ui) c0586Ef.f8545L.d(), (Sh) c0586Ef.f8546M.d()));
                return c0586Ef.q0();
            default:
                return c(sq, lq, c1394on);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1573sn
    public final void b(Sq sq, Lq lq, C1394on c1394on) {
        Yq yq;
        Q2.a1 g5;
        switch (this.f16325a) {
            case 0:
                C0950er c0950er = (C0950er) c1394on.f14849b;
                Wq wq = (Wq) sq.f11595a.f11722l;
                String jSONObject = lq.f10529v.toString();
                Context context = this.f16326b;
                InterfaceC0659Pa interfaceC0659Pa = (InterfaceC0659Pa) c1394on.f14850c;
                try {
                    c0950er.f13363a.i1(new BinderC2361b(context), wq.f12098d, jSONObject, interfaceC0659Pa);
                    return;
                } finally {
                }
            case 1:
                Q2.a1 a1Var = ((Wq) sq.f11595a.f11722l).f12099e;
                boolean z3 = a1Var.f4987x;
                boolean z5 = lq.f10501g0;
                Context context2 = this.f16326b;
                int i = a1Var.f4975l;
                int i5 = a1Var.f4978o;
                if (z3) {
                    J2.i iVar = new J2.i(i5, i);
                    iVar.f2718e = true;
                    iVar.f = i;
                    g5 = new Q2.a1(context2, iVar);
                } else {
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.x7)).booleanValue() && z5) {
                        J2.i iVar2 = new J2.i(i5, i);
                        iVar2.f2719g = true;
                        iVar2.f2720h = i;
                        g5 = new Q2.a1(context2, iVar2);
                    } else {
                        g5 = AbstractC1668us.g(context2, lq.f10527u);
                    }
                }
                Q2.a1 a1Var2 = g5;
                boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.x7)).booleanValue();
                U4 u42 = sq.f11595a;
                Pq pq = lq.f10523s;
                JSONObject jSONObject2 = lq.f10529v;
                IInterface iInterface = c1394on.f14850c;
                Object obj = c1394on.f14849b;
                Wq wq2 = (Wq) u42.f11722l;
                if (booleanValue && z5) {
                    C0950er c0950er2 = (C0950er) obj;
                    String jSONObject3 = jSONObject2.toString();
                    String i02 = N4.b.i0(pq);
                    InterfaceC0659Pa interfaceC0659Pa2 = (InterfaceC0659Pa) iInterface;
                    try {
                        c0950er2.f13363a.d3(new BinderC2361b(context2), a1Var2, wq2.f12098d, jSONObject3, i02, interfaceC0659Pa2);
                        return;
                    } finally {
                    }
                }
                C0950er c0950er3 = (C0950er) obj;
                String jSONObject4 = jSONObject2.toString();
                String i03 = N4.b.i0(pq);
                InterfaceC0659Pa interfaceC0659Pa3 = (InterfaceC0659Pa) iInterface;
                try {
                    c0950er3.f13363a.B2(new BinderC2361b(context2), a1Var2, wq2.f12098d, jSONObject4, i03, interfaceC0659Pa3);
                    return;
                } finally {
                }
            default:
                C0950er c0950er4 = (C0950er) c1394on.f14849b;
                Wq wq3 = (Wq) sq.f11595a.f11722l;
                String jSONObject5 = lq.f10529v.toString();
                String i04 = N4.b.i0(lq.f10523s);
                InterfaceC0659Pa interfaceC0659Pa4 = (InterfaceC0659Pa) c1394on.f14850c;
                Wq wq4 = (Wq) sq.f11595a.f11722l;
                Context context3 = this.f16326b;
                B8 b8 = wq4.i;
                ArrayList arrayList = wq4.f12100g;
                try {
                    c0950er4.f13363a.U0(new BinderC2361b(context3), wq3.f12098d, jSONObject5, i04, interfaceC0659Pa4, b8, arrayList);
                    return;
                } finally {
                }
        }
    }
}
