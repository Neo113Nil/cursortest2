package com.google.android.gms.internal.ads;

import Q2.C0379q;
import Q2.InterfaceC0391w0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.tb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1606tb extends E5 implements InterfaceC1427pb {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f15686l = 0;

    /* renamed from: k, reason: collision with root package name */
    public final RtbAdapter f15687k;

    public BinderC1606tb(RtbAdapter rtbAdapter) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        this.f15687k = rtbAdapter;
    }

    public static final void v3(String str) {
        U2.j.i("Server parameters: ".concat(String.valueOf(str)));
        try {
            new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            }
        } catch (JSONException e3) {
            U2.j.g("", e3);
            throw new RemoteException();
        }
    }

    public static final void w3(Q2.X0 x02) {
        if (x02.f4962p) {
            return;
        }
        U2.e eVar = C0379q.f.f5048a;
        U2.e.j();
    }

    public static final void x3(Q2.X0 x02, String str) {
        String str2 = x02.f4952E;
        try {
            new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void B1(InterfaceC2360a interfaceC2360a, String str, Bundle bundle, Bundle bundle2, Q2.a1 a1Var, InterfaceC1516rb interfaceC1516rb) {
        char c5;
        try {
            V9 v9 = new V9(11);
            RtbAdapter rtbAdapter = this.f15687k;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1167692200:
                    if (str.equals("app_open")) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        c5 = 6;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    new ArrayList().add(new Q1.j(10));
                    new J2.i(a1Var.f4978o, a1Var.f4975l, a1Var.f4974k);
                    rtbAdapter.collectSignals(new Y2.a(), v9);
                    return;
                case 6:
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.tb)).booleanValue()) {
                        new ArrayList().add(new Q1.j(10));
                        new J2.i(a1Var.f4978o, a1Var.f4975l, a1Var.f4974k);
                        rtbAdapter.collectSignals(new Y2.a(), v9);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th) {
            U2.j.g("Error generating signals for RTB", th);
            AbstractC1668us.r(interfaceC2360a, th, "adapter.collectSignals");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void D1(String str, String str2, Q2.X0 x02, BinderC2361b binderC2361b, Qn qn, InterfaceC0659Pa interfaceC0659Pa) {
        j3(str, str2, x02, binderC2361b, qn, interfaceC0659Pa, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void M1(String str, String str2, Q2.X0 x02, InterfaceC2360a interfaceC2360a, InterfaceC0934eb interfaceC0934eb, InterfaceC0659Pa interfaceC0659Pa) {
        try {
            Qt qt = new Qt(8, interfaceC0934eb);
            RtbAdapter rtbAdapter = this.f15687k;
            v3(str2);
            u3(x02);
            w3(x02);
            x3(x02, str2);
            rtbAdapter.loadRtbAppOpenAd(new W2.f(), qt);
        } catch (Throwable th) {
            U2.j.g("Adapter failed to render app open ad.", th);
            AbstractC1668us.r(interfaceC2360a, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final boolean O(InterfaceC2360a interfaceC2360a) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void O1(String str, String str2, Q2.X0 x02, InterfaceC2360a interfaceC2360a, InterfaceC1024gb interfaceC1024gb, InterfaceC0659Pa interfaceC0659Pa, Q2.a1 a1Var) {
        try {
            Qt qt = new Qt(7, interfaceC1024gb);
            RtbAdapter rtbAdapter = this.f15687k;
            v3(str2);
            u3(x02);
            w3(x02);
            x3(x02, str2);
            new J2.i(a1Var.f4978o, a1Var.f4975l, a1Var.f4974k);
            rtbAdapter.loadRtbInterscrollerAd(new W2.g(), qt);
        } catch (Throwable th) {
            U2.j.g("Adapter failed to render interscroller ad.", th);
            AbstractC1668us.r(interfaceC2360a, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void O2(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final boolean Q2(BinderC2361b binderC2361b) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final boolean T(InterfaceC2360a interfaceC2360a) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void a1(String str, String str2, Q2.X0 x02, InterfaceC2360a interfaceC2360a, InterfaceC1024gb interfaceC1024gb, InterfaceC0659Pa interfaceC0659Pa, Q2.a1 a1Var) {
        try {
            Mt mt = new Mt(9, interfaceC1024gb);
            RtbAdapter rtbAdapter = this.f15687k;
            v3(str2);
            u3(x02);
            w3(x02);
            x3(x02, str2);
            new J2.i(a1Var.f4978o, a1Var.f4975l, a1Var.f4974k);
            rtbAdapter.loadRtbBannerAd(new W2.g(), mt);
        } catch (Throwable th) {
            U2.j.g("Adapter failed to render banner ad.", th);
            AbstractC1668us.r(interfaceC2360a, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final InterfaceC0391w0 b() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final C1651ub c() {
        this.f15687k.getVersionInfo();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final C1651ub f() {
        this.f15687k.getSDKVersionInfo();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void g2(String str, String str2, Q2.X0 x02, InterfaceC2360a interfaceC2360a, InterfaceC1114ib interfaceC1114ib, InterfaceC0659Pa interfaceC0659Pa) {
        try {
            U4 u42 = new U4(9, interfaceC1114ib);
            RtbAdapter rtbAdapter = this.f15687k;
            v3(str2);
            u3(x02);
            w3(x02);
            x3(x02, str2);
            rtbAdapter.loadRtbInterstitialAd(new W2.i(), u42);
        } catch (Throwable th) {
            U2.j.g("Adapter failed to render interstitial ad.", th);
            AbstractC1668us.r(interfaceC2360a, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void j3(String str, String str2, Q2.X0 x02, InterfaceC2360a interfaceC2360a, InterfaceC1202kb interfaceC1202kb, InterfaceC0659Pa interfaceC0659Pa, B8 b8) {
        RtbAdapter rtbAdapter = this.f15687k;
        try {
            C1529ro c1529ro = new C1529ro(10, interfaceC1202kb);
            v3(str2);
            u3(x02);
            w3(x02);
            x3(x02, str2);
            rtbAdapter.loadRtbNativeAdMapper(new W2.k(), c1529ro);
        } catch (Throwable th) {
            U2.j.g("Adapter failed to render native ad.", th);
            AbstractC1668us.r(interfaceC2360a, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                Mt mt = new Mt(10, interfaceC1202kb);
                v3(str2);
                u3(x02);
                w3(x02);
                x3(x02, str2);
                rtbAdapter.loadRtbNativeAd(new W2.k(), mt);
            } catch (Throwable th2) {
                U2.j.g("Adapter failed to render native ad.", th2);
                AbstractC1668us.r(interfaceC2360a, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void l2(String str, String str2, Q2.X0 x02, InterfaceC2360a interfaceC2360a, InterfaceC1337nb interfaceC1337nb, InterfaceC0659Pa interfaceC0659Pa) {
        try {
            U4 u42 = new U4(10, interfaceC1337nb);
            RtbAdapter rtbAdapter = this.f15687k;
            v3(str2);
            u3(x02);
            w3(x02);
            x3(x02, str2);
            rtbAdapter.loadRtbRewardedAd(new W2.m(), u42);
        } catch (Throwable th) {
            U2.j.g("Adapter failed to render rewarded ad.", th);
            AbstractC1668us.r(interfaceC2360a, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427pb
    public final void r1(String str, String str2, Q2.X0 x02, InterfaceC2360a interfaceC2360a, InterfaceC1337nb interfaceC1337nb, InterfaceC0659Pa interfaceC0659Pa) {
        try {
            U4 u42 = new U4(10, interfaceC1337nb);
            RtbAdapter rtbAdapter = this.f15687k;
            v3(str2);
            u3(x02);
            w3(x02);
            x3(x02, str2);
            rtbAdapter.loadRtbRewardedInterstitialAd(new W2.m(), u42);
        } catch (Throwable th) {
            U2.j.g("Adapter failed to render rewarded interstitial ad.", th);
            AbstractC1668us.r(interfaceC2360a, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC1516rb c1472qb;
        InterfaceC1114ib c1069hb;
        InterfaceC0934eb c0890db;
        InterfaceC1516rb interfaceC1516rb = null;
        InterfaceC0934eb interfaceC0934eb = null;
        InterfaceC1202kb c1157jb = null;
        InterfaceC1024gb c0979fb = null;
        InterfaceC1337nb c1247lb = null;
        InterfaceC1202kb c1157jb2 = null;
        InterfaceC1337nb c1247lb2 = null;
        InterfaceC1114ib interfaceC1114ib = null;
        InterfaceC1024gb c0979fb2 = null;
        if (i == 1) {
            InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) F5.a(parcel, creator);
            Bundle bundle2 = (Bundle) F5.a(parcel, creator);
            Q2.a1 a1Var = (Q2.a1) F5.a(parcel, Q2.a1.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (!(queryLocalInterface instanceof InterfaceC1516rb)) {
                    c1472qb = new C1472qb(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback", 0);
                    F5.b(parcel);
                    B1(h1, readString, bundle, bundle2, a1Var, c1472qb);
                    parcel2.writeNoException();
                    return true;
                }
                interfaceC1516rb = (InterfaceC1516rb) queryLocalInterface;
            }
            c1472qb = interfaceC1516rb;
            F5.b(parcel);
            B1(h1, readString, bundle, bundle2, a1Var, c1472qb);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            c();
            throw null;
        }
        if (i == 3) {
            f();
            throw null;
        }
        if (i == 5) {
            InterfaceC0391w0 b3 = b();
            parcel2.writeNoException();
            F5.e(parcel2, b3);
            return true;
        }
        if (i == 10) {
            BinderC2361b.h1(parcel.readStrongBinder());
            F5.b(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i == 11) {
            parcel.createStringArray();
            F5.b(parcel);
            parcel2.writeNoException();
            return true;
        }
        switch (i) {
            case 13:
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                Q2.X0 x02 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                InterfaceC2360a h12 = BinderC2361b.h1(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    c0979fb2 = queryLocalInterface2 instanceof InterfaceC1024gb ? (InterfaceC1024gb) queryLocalInterface2 : new C0979fb(readStrongBinder2);
                }
                InterfaceC1024gb interfaceC1024gb = c0979fb2;
                InterfaceC0659Pa u32 = AbstractBinderC0652Oa.u3(parcel.readStrongBinder());
                Q2.a1 a1Var2 = (Q2.a1) F5.a(parcel, Q2.a1.CREATOR);
                F5.b(parcel);
                a1(readString2, readString3, x02, h12, interfaceC1024gb, u32, a1Var2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                Q2.X0 x03 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                InterfaceC2360a h13 = BinderC2361b.h1(parcel.readStrongBinder());
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    if (!(queryLocalInterface3 instanceof InterfaceC1114ib)) {
                        c1069hb = new C1069hb(readStrongBinder3, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback", 0);
                        InterfaceC0659Pa u33 = AbstractBinderC0652Oa.u3(parcel.readStrongBinder());
                        F5.b(parcel);
                        g2(readString4, readString5, x03, h13, c1069hb, u33);
                        parcel2.writeNoException();
                        return true;
                    }
                    interfaceC1114ib = (InterfaceC1114ib) queryLocalInterface3;
                }
                c1069hb = interfaceC1114ib;
                InterfaceC0659Pa u332 = AbstractBinderC0652Oa.u3(parcel.readStrongBinder());
                F5.b(parcel);
                g2(readString4, readString5, x03, h13, c1069hb, u332);
                parcel2.writeNoException();
                return true;
            case 15:
                BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 16:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                Q2.X0 x04 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                InterfaceC2360a h14 = BinderC2361b.h1(parcel.readStrongBinder());
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    c1247lb2 = queryLocalInterface4 instanceof InterfaceC1337nb ? (InterfaceC1337nb) queryLocalInterface4 : new C1247lb(readStrongBinder4);
                }
                InterfaceC1337nb interfaceC1337nb = c1247lb2;
                InterfaceC0659Pa u34 = AbstractBinderC0652Oa.u3(parcel.readStrongBinder());
                F5.b(parcel);
                l2(readString6, readString7, x04, h14, interfaceC1337nb, u34);
                parcel2.writeNoException();
                return true;
            case 17:
                BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 18:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                Q2.X0 x05 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                InterfaceC2360a h15 = BinderC2361b.h1(parcel.readStrongBinder());
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    c1157jb2 = queryLocalInterface5 instanceof InterfaceC1202kb ? (InterfaceC1202kb) queryLocalInterface5 : new C1157jb(readStrongBinder5);
                }
                InterfaceC1202kb interfaceC1202kb = c1157jb2;
                InterfaceC0659Pa u35 = AbstractBinderC0652Oa.u3(parcel.readStrongBinder());
                F5.b(parcel);
                j3(readString8, readString9, x05, h15, interfaceC1202kb, u35, null);
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.readString();
                F5.b(parcel);
                parcel2.writeNoException();
                return true;
            case 20:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                Q2.X0 x06 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                InterfaceC2360a h16 = BinderC2361b.h1(parcel.readStrongBinder());
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    c1247lb = queryLocalInterface6 instanceof InterfaceC1337nb ? (InterfaceC1337nb) queryLocalInterface6 : new C1247lb(readStrongBinder6);
                }
                InterfaceC1337nb interfaceC1337nb2 = c1247lb;
                InterfaceC0659Pa u36 = AbstractBinderC0652Oa.u3(parcel.readStrongBinder());
                F5.b(parcel);
                r1(readString10, readString11, x06, h16, interfaceC1337nb2, u36);
                parcel2.writeNoException();
                return true;
            case C1639u7.zzm /* 21 */:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                Q2.X0 x07 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                InterfaceC2360a h17 = BinderC2361b.h1(parcel.readStrongBinder());
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    c0979fb = queryLocalInterface7 instanceof InterfaceC1024gb ? (InterfaceC1024gb) queryLocalInterface7 : new C0979fb(readStrongBinder7);
                }
                InterfaceC1024gb interfaceC1024gb2 = c0979fb;
                InterfaceC0659Pa u37 = AbstractBinderC0652Oa.u3(parcel.readStrongBinder());
                Q2.a1 a1Var3 = (Q2.a1) F5.a(parcel, Q2.a1.CREATOR);
                F5.b(parcel);
                O1(readString12, readString13, x07, h17, interfaceC1024gb2, u37, a1Var3);
                parcel2.writeNoException();
                return true;
            case 22:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                Q2.X0 x08 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                InterfaceC2360a h18 = BinderC2361b.h1(parcel.readStrongBinder());
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    c1157jb = queryLocalInterface8 instanceof InterfaceC1202kb ? (InterfaceC1202kb) queryLocalInterface8 : new C1157jb(readStrongBinder8);
                }
                InterfaceC1202kb interfaceC1202kb2 = c1157jb;
                InterfaceC0659Pa u38 = AbstractBinderC0652Oa.u3(parcel.readStrongBinder());
                B8 b8 = (B8) F5.a(parcel, B8.CREATOR);
                F5.b(parcel);
                j3(readString14, readString15, x08, h18, interfaceC1202kb2, u38, b8);
                parcel2.writeNoException();
                return true;
            case 23:
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                Q2.X0 x09 = (Q2.X0) F5.a(parcel, Q2.X0.CREATOR);
                InterfaceC2360a h19 = BinderC2361b.h1(parcel.readStrongBinder());
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    if (!(queryLocalInterface9 instanceof InterfaceC0934eb)) {
                        c0890db = new C0890db(readStrongBinder9, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback", 0);
                        InterfaceC0659Pa u39 = AbstractBinderC0652Oa.u3(parcel.readStrongBinder());
                        F5.b(parcel);
                        M1(readString16, readString17, x09, h19, c0890db, u39);
                        parcel2.writeNoException();
                        return true;
                    }
                    interfaceC0934eb = (InterfaceC0934eb) queryLocalInterface9;
                }
                c0890db = interfaceC0934eb;
                InterfaceC0659Pa u392 = AbstractBinderC0652Oa.u3(parcel.readStrongBinder());
                F5.b(parcel);
                M1(readString16, readString17, x09, h19, c0890db, u392);
                parcel2.writeNoException();
                return true;
            case 24:
                BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            default:
                return false;
        }
    }

    public final void u3(Q2.X0 x02) {
        Bundle bundle = x02.f4969w;
        if (bundle == null || bundle.getBundle(this.f15687k.getClass().getName()) == null) {
            new Bundle();
        }
    }
}
