package com.google.android.gms.internal.ads;

import Q2.AbstractBinderC0350b0;
import Q2.InterfaceC0368k0;
import T2.C0432j;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import q.C2294i;
import q3.C2308a;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.Qf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0671Qf extends AbstractBinderC0350b0 {

    /* renamed from: k, reason: collision with root package name */
    public final Context f11207k;

    /* renamed from: l, reason: collision with root package name */
    public final U2.a f11208l;

    /* renamed from: m, reason: collision with root package name */
    public final C0900dl f11209m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC1349nn f11210n;

    /* renamed from: o, reason: collision with root package name */
    public final C1754wo f11211o;

    /* renamed from: p, reason: collision with root package name */
    public final Kl f11212p;

    /* renamed from: q, reason: collision with root package name */
    public final C1204kd f11213q;

    /* renamed from: r, reason: collision with root package name */
    public final C0989fl f11214r;

    /* renamed from: s, reason: collision with root package name */
    public final Ul f11215s;

    /* renamed from: t, reason: collision with root package name */
    public final C1685v8 f11216t;

    /* renamed from: u, reason: collision with root package name */
    public final Nr f11217u;

    /* renamed from: v, reason: collision with root package name */
    public final C0905dr f11218v;

    /* renamed from: w, reason: collision with root package name */
    public final C1612th f11219w;

    /* renamed from: x, reason: collision with root package name */
    public final C1482ql f11220x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11221y = false;

    /* renamed from: z, reason: collision with root package name */
    public final Long f11222z;

    public BinderC0671Qf(Context context, U2.a aVar, C0900dl c0900dl, InterfaceC1349nn interfaceC1349nn, C1754wo c1754wo, Kl kl, C1204kd c1204kd, C0989fl c0989fl, Ul ul, C1685v8 c1685v8, Nr nr, C0905dr c0905dr, C1612th c1612th, C1482ql c1482ql) {
        this.f11207k = context;
        this.f11208l = aVar;
        this.f11209m = c0900dl;
        this.f11210n = interfaceC1349nn;
        this.f11211o = c1754wo;
        this.f11212p = kl;
        this.f11213q = c1204kd;
        this.f11214r = c0989fl;
        this.f11215s = ul;
        this.f11216t = c1685v8;
        this.f11217u = nr;
        this.f11218v = c0905dr;
        this.f11219w = c1612th;
        this.f11220x = c1482ql;
        P2.o.f4767B.f4776j.getClass();
        this.f11222z = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // Q2.InterfaceC0352c0
    public final void A0(String str) {
        this.f11211o.d(str);
    }

    @Override // Q2.InterfaceC0352c0
    public final void C0(Q2.S0 s02) {
        C1204kd c1204kd = this.f11213q;
        Context context = this.f11207k;
        c1204kd.getClass();
        C1071hd y5 = C1071hd.y(context);
        C0892dd c0892dd = (C0892dd) ((CD) y5.f13763n).d();
        ((C2308a) y5.f13761l).getClass();
        c0892dd.a(-1, System.currentTimeMillis());
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8890r0)).booleanValue() && c1204kd.e(context) && C1204kd.g(context)) {
            synchronized (c1204kd.i) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    @Override // Q2.InterfaceC0352c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E1(String str, InterfaceC2360a interfaceC2360a) {
        String F5;
        String str2;
        RunnableC0657Of runnableC0657Of;
        Context context = this.f11207k;
        F7.a(context);
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8795Z3)).booleanValue()) {
            try {
                T2.L l5 = P2.o.f4767B.f4771c;
                F5 = T2.L.F(context);
            } catch (RemoteException | RuntimeException e3) {
                P2.o.f4767B.f4774g.i("NonagonMobileAdsSettingManager_AppId", e3);
            }
            boolean z3 = true;
            str2 = true != TextUtils.isEmpty(F5) ? str : F5;
            if (TextUtils.isEmpty(str2)) {
                A7 a7 = F7.f8760S3;
                Q2.r rVar = Q2.r.f5053d;
                boolean booleanValue = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
                A7 a72 = F7.f8752R0;
                D7 d7 = rVar.f5056c;
                boolean booleanValue2 = booleanValue | ((Boolean) d7.a(a72)).booleanValue();
                if (((Boolean) d7.a(a72)).booleanValue()) {
                    runnableC0657Of = new RunnableC0657Of(this, (Runnable) BinderC2361b.t1(interfaceC2360a), 1);
                } else {
                    runnableC0657Of = null;
                    z3 = booleanValue2;
                }
                RunnableC0657Of runnableC0657Of2 = runnableC0657Of;
                if (z3) {
                    P2.o.f4767B.f4777k.g(this.f11207k, this.f11208l, true, null, str2, null, runnableC0657Of2, this.f11217u, this.f11220x, this.f11222z);
                    return;
                }
                return;
            }
            return;
        }
        F5 = "";
        boolean z32 = true;
        if (true != TextUtils.isEmpty(F5)) {
        }
        if (TextUtils.isEmpty(str2)) {
        }
    }

    @Override // Q2.InterfaceC0352c0
    public final void S(boolean z3) {
        Context context = this.f11207k;
        try {
            Mt.b(context).D(z3);
            if (z3) {
                return;
            }
            try {
                if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e3) {
                P2.o.f4767B.f4774g.i("clearStorageOnGpidPubDisable_scar", e3);
            }
        } catch (IOException e5) {
            throw new RemoteException(e5.getMessage());
        }
    }

    @Override // Q2.InterfaceC0352c0
    public final synchronized void S1(String str) {
        F7.a(this.f11207k);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8760S3)).booleanValue()) {
                P2.o.f4767B.f4777k.g(this.f11207k, this.f11208l, true, null, str, null, null, this.f11217u, null, null);
            }
        }
    }

    @Override // Q2.InterfaceC0352c0
    public final synchronized float b() {
        return P2.o.f4767B.f4775h.a();
    }

    @Override // Q2.InterfaceC0352c0
    public final String c() {
        return this.f11208l.f5852k;
    }

    @Override // Q2.InterfaceC0352c0
    public final void e() {
        this.f11212p.f10242q = false;
    }

    @Override // Q2.InterfaceC0352c0
    public final List f() {
        return this.f11212p.a();
    }

    @Override // Q2.InterfaceC0352c0
    public final void f3(InterfaceC0368k0 interfaceC0368k0) {
        this.f11215s.d(interfaceC0368k0, Tl.f11670l);
    }

    @Override // Q2.InterfaceC0352c0
    public final synchronized void k() {
        if (this.f11221y) {
            U2.j.i("Mobile ads is initialized already.");
            return;
        }
        F7.a(this.f11207k);
        Context context = this.f11207k;
        U2.a aVar = this.f11208l;
        P2.o oVar = P2.o.f4767B;
        oVar.f4774g.g(context, aVar);
        this.f11219w.c();
        oVar.i.u(this.f11207k);
        this.f11221y = true;
        this.f11212p.b();
        C1754wo c1754wo = this.f11211o;
        c1754wo.getClass();
        T2.I d5 = oVar.f4774g.d();
        d5.f5646c.add(new RunnableC1709vo(c1754wo, 1));
        c1754wo.f.execute(new RunnableC1709vo(c1754wo, 0));
        A7 a7 = F7.f8770U3;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            C0989fl c0989fl = this.f11214r;
            if (!c0989fl.f.getAndSet(true)) {
                T2.I d6 = oVar.f4774g.d();
                d6.f5646c.add(new RunnableC0944el(c0989fl, 1));
            }
            c0989fl.f13492c.execute(new RunnableC0944el(c0989fl, 0));
        }
        this.f11215s.c();
        if (((Boolean) rVar.f5056c.a(F7.O8)).booleanValue()) {
            final int i = 0;
            AbstractC0613Id.f9539a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Pf

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ BinderC0671Qf f11086l;

                {
                    this.f11086l = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    String a5;
                    C1730w8 c1730w8;
                    switch (i) {
                        case 0:
                            BinderC0671Qf binderC0671Qf = this.f11086l;
                            binderC0671Qf.getClass();
                            P2.o oVar2 = P2.o.f4767B;
                            if (oVar2.f4774g.d().m()) {
                                T2.I d7 = oVar2.f4774g.d();
                                d7.o();
                                synchronized (d7.f5644a) {
                                    str = d7.f5667z;
                                }
                                if (oVar2.f4780n.f(binderC0671Qf.f11207k, str, binderC0671Qf.f11208l.f5852k)) {
                                    return;
                                }
                                oVar2.f4774g.d().C(false);
                                oVar2.f4774g.d().B("");
                                return;
                            }
                            return;
                        case 1:
                            AbstractC1561sb.e(this.f11086l.f11207k, true);
                            return;
                        case 2:
                            BinderC0671Qf binderC0671Qf2 = this.f11086l;
                            binderC0671Qf2.getClass();
                            P7 p7 = P2.o.f4767B.f4779m;
                            if (p7.f11066b.getAndSet(true)) {
                                return;
                            }
                            Context context2 = binderC0671Qf2.f11207k;
                            p7.f11067c = context2;
                            p7.f11068d = binderC0671Qf2.f11220x;
                            if (p7.f != null || context2 == null || (a5 = C2294i.a(context2)) == null) {
                                return;
                            }
                            p7.f18853a = context2.getApplicationContext();
                            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                            if (!TextUtils.isEmpty(a5)) {
                                intent.setPackage(a5);
                            }
                            context2.bindService(intent, p7, 33);
                            return;
                        default:
                            BinderC0671Qf binderC0671Qf3 = this.f11086l;
                            binderC0671Qf3.getClass();
                            BinderC0891dc binderC0891dc = new BinderC0891dc("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            C1685v8 c1685v8 = binderC0671Qf3.f11216t;
                            c1685v8.getClass();
                            try {
                                try {
                                    IBinder b3 = U2.j.b(c1685v8.f15966l).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (b3 == null) {
                                        c1730w8 = null;
                                    } else {
                                        IInterface queryLocalInterface = b3.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        c1730w8 = queryLocalInterface instanceof C1730w8 ? (C1730w8) queryLocalInterface : new C1730w8(b3, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 0);
                                    }
                                    Parcel N5 = c1730w8.N();
                                    F5.e(N5, binderC0891dc);
                                    c1730w8.d1(N5, 1);
                                    return;
                                } catch (Exception e3) {
                                    throw new U2.k(e3);
                                }
                            } catch (U2.k e5) {
                                U2.j.i("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e5.getMessage())));
                                return;
                            } catch (RemoteException e6) {
                                U2.j.i("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e6.getMessage())));
                                return;
                            }
                    }
                }
            });
        }
        if (((Boolean) rVar.f5056c.a(F7.za)).booleanValue()) {
            final int i5 = 3;
            AbstractC0613Id.f9539a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Pf

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ BinderC0671Qf f11086l;

                {
                    this.f11086l = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    String a5;
                    C1730w8 c1730w8;
                    switch (i5) {
                        case 0:
                            BinderC0671Qf binderC0671Qf = this.f11086l;
                            binderC0671Qf.getClass();
                            P2.o oVar2 = P2.o.f4767B;
                            if (oVar2.f4774g.d().m()) {
                                T2.I d7 = oVar2.f4774g.d();
                                d7.o();
                                synchronized (d7.f5644a) {
                                    str = d7.f5667z;
                                }
                                if (oVar2.f4780n.f(binderC0671Qf.f11207k, str, binderC0671Qf.f11208l.f5852k)) {
                                    return;
                                }
                                oVar2.f4774g.d().C(false);
                                oVar2.f4774g.d().B("");
                                return;
                            }
                            return;
                        case 1:
                            AbstractC1561sb.e(this.f11086l.f11207k, true);
                            return;
                        case 2:
                            BinderC0671Qf binderC0671Qf2 = this.f11086l;
                            binderC0671Qf2.getClass();
                            P7 p7 = P2.o.f4767B.f4779m;
                            if (p7.f11066b.getAndSet(true)) {
                                return;
                            }
                            Context context2 = binderC0671Qf2.f11207k;
                            p7.f11067c = context2;
                            p7.f11068d = binderC0671Qf2.f11220x;
                            if (p7.f != null || context2 == null || (a5 = C2294i.a(context2)) == null) {
                                return;
                            }
                            p7.f18853a = context2.getApplicationContext();
                            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                            if (!TextUtils.isEmpty(a5)) {
                                intent.setPackage(a5);
                            }
                            context2.bindService(intent, p7, 33);
                            return;
                        default:
                            BinderC0671Qf binderC0671Qf3 = this.f11086l;
                            binderC0671Qf3.getClass();
                            BinderC0891dc binderC0891dc = new BinderC0891dc("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            C1685v8 c1685v8 = binderC0671Qf3.f11216t;
                            c1685v8.getClass();
                            try {
                                try {
                                    IBinder b3 = U2.j.b(c1685v8.f15966l).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (b3 == null) {
                                        c1730w8 = null;
                                    } else {
                                        IInterface queryLocalInterface = b3.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        c1730w8 = queryLocalInterface instanceof C1730w8 ? (C1730w8) queryLocalInterface : new C1730w8(b3, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 0);
                                    }
                                    Parcel N5 = c1730w8.N();
                                    F5.e(N5, binderC0891dc);
                                    c1730w8.d1(N5, 1);
                                    return;
                                } catch (Exception e3) {
                                    throw new U2.k(e3);
                                }
                            } catch (U2.k e5) {
                                U2.j.i("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e5.getMessage())));
                                return;
                            } catch (RemoteException e6) {
                                U2.j.i("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e6.getMessage())));
                                return;
                            }
                    }
                }
            });
        }
        if (((Boolean) rVar.f5056c.a(F7.f8759S2)).booleanValue()) {
            final int i6 = 1;
            AbstractC0613Id.f9539a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Pf

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ BinderC0671Qf f11086l;

                {
                    this.f11086l = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    String a5;
                    C1730w8 c1730w8;
                    switch (i6) {
                        case 0:
                            BinderC0671Qf binderC0671Qf = this.f11086l;
                            binderC0671Qf.getClass();
                            P2.o oVar2 = P2.o.f4767B;
                            if (oVar2.f4774g.d().m()) {
                                T2.I d7 = oVar2.f4774g.d();
                                d7.o();
                                synchronized (d7.f5644a) {
                                    str = d7.f5667z;
                                }
                                if (oVar2.f4780n.f(binderC0671Qf.f11207k, str, binderC0671Qf.f11208l.f5852k)) {
                                    return;
                                }
                                oVar2.f4774g.d().C(false);
                                oVar2.f4774g.d().B("");
                                return;
                            }
                            return;
                        case 1:
                            AbstractC1561sb.e(this.f11086l.f11207k, true);
                            return;
                        case 2:
                            BinderC0671Qf binderC0671Qf2 = this.f11086l;
                            binderC0671Qf2.getClass();
                            P7 p7 = P2.o.f4767B.f4779m;
                            if (p7.f11066b.getAndSet(true)) {
                                return;
                            }
                            Context context2 = binderC0671Qf2.f11207k;
                            p7.f11067c = context2;
                            p7.f11068d = binderC0671Qf2.f11220x;
                            if (p7.f != null || context2 == null || (a5 = C2294i.a(context2)) == null) {
                                return;
                            }
                            p7.f18853a = context2.getApplicationContext();
                            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                            if (!TextUtils.isEmpty(a5)) {
                                intent.setPackage(a5);
                            }
                            context2.bindService(intent, p7, 33);
                            return;
                        default:
                            BinderC0671Qf binderC0671Qf3 = this.f11086l;
                            binderC0671Qf3.getClass();
                            BinderC0891dc binderC0891dc = new BinderC0891dc("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            C1685v8 c1685v8 = binderC0671Qf3.f11216t;
                            c1685v8.getClass();
                            try {
                                try {
                                    IBinder b3 = U2.j.b(c1685v8.f15966l).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (b3 == null) {
                                        c1730w8 = null;
                                    } else {
                                        IInterface queryLocalInterface = b3.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        c1730w8 = queryLocalInterface instanceof C1730w8 ? (C1730w8) queryLocalInterface : new C1730w8(b3, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 0);
                                    }
                                    Parcel N5 = c1730w8.N();
                                    F5.e(N5, binderC0891dc);
                                    c1730w8.d1(N5, 1);
                                    return;
                                } catch (Exception e3) {
                                    throw new U2.k(e3);
                                }
                            } catch (U2.k e5) {
                                U2.j.i("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e5.getMessage())));
                                return;
                            } catch (RemoteException e6) {
                                U2.j.i("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e6.getMessage())));
                                return;
                            }
                    }
                }
            });
        }
        if (((Boolean) rVar.f5056c.a(F7.f8910u4)).booleanValue()) {
            if (((Boolean) rVar.f5056c.a(F7.v4)).booleanValue()) {
                final int i7 = 2;
                AbstractC0613Id.f9539a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Pf

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ BinderC0671Qf f11086l;

                    {
                        this.f11086l = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        String a5;
                        C1730w8 c1730w8;
                        switch (i7) {
                            case 0:
                                BinderC0671Qf binderC0671Qf = this.f11086l;
                                binderC0671Qf.getClass();
                                P2.o oVar2 = P2.o.f4767B;
                                if (oVar2.f4774g.d().m()) {
                                    T2.I d7 = oVar2.f4774g.d();
                                    d7.o();
                                    synchronized (d7.f5644a) {
                                        str = d7.f5667z;
                                    }
                                    if (oVar2.f4780n.f(binderC0671Qf.f11207k, str, binderC0671Qf.f11208l.f5852k)) {
                                        return;
                                    }
                                    oVar2.f4774g.d().C(false);
                                    oVar2.f4774g.d().B("");
                                    return;
                                }
                                return;
                            case 1:
                                AbstractC1561sb.e(this.f11086l.f11207k, true);
                                return;
                            case 2:
                                BinderC0671Qf binderC0671Qf2 = this.f11086l;
                                binderC0671Qf2.getClass();
                                P7 p7 = P2.o.f4767B.f4779m;
                                if (p7.f11066b.getAndSet(true)) {
                                    return;
                                }
                                Context context2 = binderC0671Qf2.f11207k;
                                p7.f11067c = context2;
                                p7.f11068d = binderC0671Qf2.f11220x;
                                if (p7.f != null || context2 == null || (a5 = C2294i.a(context2)) == null) {
                                    return;
                                }
                                p7.f18853a = context2.getApplicationContext();
                                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                                if (!TextUtils.isEmpty(a5)) {
                                    intent.setPackage(a5);
                                }
                                context2.bindService(intent, p7, 33);
                                return;
                            default:
                                BinderC0671Qf binderC0671Qf3 = this.f11086l;
                                binderC0671Qf3.getClass();
                                BinderC0891dc binderC0891dc = new BinderC0891dc("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                C1685v8 c1685v8 = binderC0671Qf3.f11216t;
                                c1685v8.getClass();
                                try {
                                    try {
                                        IBinder b3 = U2.j.b(c1685v8.f15966l).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                        if (b3 == null) {
                                            c1730w8 = null;
                                        } else {
                                            IInterface queryLocalInterface = b3.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                            c1730w8 = queryLocalInterface instanceof C1730w8 ? (C1730w8) queryLocalInterface : new C1730w8(b3, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 0);
                                        }
                                        Parcel N5 = c1730w8.N();
                                        F5.e(N5, binderC0891dc);
                                        c1730w8.d1(N5, 1);
                                        return;
                                    } catch (Exception e3) {
                                        throw new U2.k(e3);
                                    }
                                } catch (U2.k e5) {
                                    U2.j.i("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e5.getMessage())));
                                    return;
                                } catch (RemoteException e6) {
                                    U2.j.i("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e6.getMessage())));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }

    @Override // Q2.InterfaceC0352c0
    public final void k3(String str, InterfaceC2360a interfaceC2360a) {
        if (interfaceC2360a == null) {
            U2.j.f("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) BinderC2361b.t1(interfaceC2360a);
        if (context == null) {
            U2.j.f("Context is null. Failed to open debug menu.");
            return;
        }
        C0432j c0432j = new C0432j(context);
        c0432j.f5709d = str;
        c0432j.f5710e = this.f11208l.f5852k;
        c0432j.b();
    }

    @Override // Q2.InterfaceC0352c0
    public final synchronized void m0(float f) {
        P2.o.f4767B.f4775h.c(f);
    }

    @Override // Q2.InterfaceC0352c0
    public final synchronized void o3(boolean z3) {
        P2.o.f4767B.f4775h.b(z3);
    }

    @Override // Q2.InterfaceC0352c0
    public final void p0(String str) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Z8)).booleanValue()) {
            P2.o.f4767B.f4774g.f8014g = str;
        }
    }

    @Override // Q2.InterfaceC0352c0
    public final void r2(U9 u9) {
        Kl kl = this.f11212p;
        kl.getClass();
        kl.f10232e.f10334k.a(new Kw(26, kl, u9), kl.f10235j);
    }

    @Override // Q2.InterfaceC0352c0
    public final void s0(InterfaceC0624Ka interfaceC0624Ka) {
        this.f11218v.J(interfaceC0624Ka);
    }

    @Override // Q2.InterfaceC0352c0
    public final synchronized boolean y() {
        return P2.o.f4767B.f4775h.d();
    }
}
