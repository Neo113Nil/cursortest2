package com.google.android.gms.ads.internal.overlay;

import C2.a;
import P2.h;
import P2.o;
import Q2.InterfaceC0347a;
import Q2.r;
import S2.c;
import S2.e;
import S2.k;
import S2.l;
import S2.m;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.BinderC0857cn;
import com.google.android.gms.internal.ads.C0698Ue;
import com.google.android.gms.internal.ads.C0733Ze;
import com.google.android.gms.internal.ads.C1077hj;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.InterfaceC0590Fb;
import com.google.android.gms.internal.ads.InterfaceC0677Re;
import com.google.android.gms.internal.ads.InterfaceC1462q9;
import com.google.android.gms.internal.ads.InterfaceC1506r9;
import com.google.android.gms.internal.ads.Sh;
import com.google.android.gms.internal.ads.Vi;
import com.google.android.gms.internal.ads.Vl;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import k4.AbstractC2036a;
import n3.AbstractC2187a;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractC2187a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new a(10);

    /* renamed from: I, reason: collision with root package name */
    public static final AtomicLong f7437I = new AtomicLong(0);
    public static final ConcurrentHashMap J = new ConcurrentHashMap();

    /* renamed from: A, reason: collision with root package name */
    public final String f7438A;

    /* renamed from: B, reason: collision with root package name */
    public final String f7439B;

    /* renamed from: C, reason: collision with root package name */
    public final String f7440C;

    /* renamed from: D, reason: collision with root package name */
    public final Sh f7441D;

    /* renamed from: E, reason: collision with root package name */
    public final Vi f7442E;

    /* renamed from: F, reason: collision with root package name */
    public final InterfaceC0590Fb f7443F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f7444G;

    /* renamed from: H, reason: collision with root package name */
    public final long f7445H;

    /* renamed from: k, reason: collision with root package name */
    public final e f7446k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0347a f7447l;

    /* renamed from: m, reason: collision with root package name */
    public final m f7448m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0677Re f7449n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC1506r9 f7450o;

    /* renamed from: p, reason: collision with root package name */
    public final String f7451p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f7452q;

    /* renamed from: r, reason: collision with root package name */
    public final String f7453r;

    /* renamed from: s, reason: collision with root package name */
    public final c f7454s;

    /* renamed from: t, reason: collision with root package name */
    public final int f7455t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7456u;

    /* renamed from: v, reason: collision with root package name */
    public final String f7457v;

    /* renamed from: w, reason: collision with root package name */
    public final U2.a f7458w;

    /* renamed from: x, reason: collision with root package name */
    public final String f7459x;

    /* renamed from: y, reason: collision with root package name */
    public final h f7460y;

    /* renamed from: z, reason: collision with root package name */
    public final InterfaceC1462q9 f7461z;

    public AdOverlayInfoParcel(InterfaceC0347a interfaceC0347a, m mVar, c cVar, C0733Ze c0733Ze, boolean z3, int i, U2.a aVar, Vi vi, BinderC0857cn binderC0857cn) {
        this.f7446k = null;
        this.f7447l = interfaceC0347a;
        this.f7448m = mVar;
        this.f7449n = c0733Ze;
        this.f7461z = null;
        this.f7450o = null;
        this.f7451p = null;
        this.f7452q = z3;
        this.f7453r = null;
        this.f7454s = cVar;
        this.f7455t = i;
        this.f7456u = 2;
        this.f7457v = null;
        this.f7458w = aVar;
        this.f7459x = null;
        this.f7460y = null;
        this.f7438A = null;
        this.f7439B = null;
        this.f7440C = null;
        this.f7441D = null;
        this.f7442E = vi;
        this.f7443F = binderC0857cn;
        this.f7444G = false;
        this.f7445H = f7437I.getAndIncrement();
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e3) {
            if (!((Boolean) r.f5053d.f5056c.a(F7.wc)).booleanValue()) {
                return null;
            }
            o.f4767B.f4774g.i("AdOverlayInfoParcel.getFromIntent", e3);
            return null;
        }
    }

    public static final BinderC2361b b(Object obj) {
        if (((Boolean) r.f5053d.f5056c.a(F7.wc)).booleanValue()) {
            return null;
        }
        return new BinderC2361b(obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.e0(parcel, 2, this.f7446k, i);
        AbstractC2036a.d0(parcel, 3, b(this.f7447l));
        AbstractC2036a.d0(parcel, 4, b(this.f7448m));
        AbstractC2036a.d0(parcel, 5, b(this.f7449n));
        AbstractC2036a.d0(parcel, 6, b(this.f7450o));
        AbstractC2036a.f0(parcel, 7, this.f7451p);
        AbstractC2036a.n0(parcel, 8, 4);
        parcel.writeInt(this.f7452q ? 1 : 0);
        AbstractC2036a.f0(parcel, 9, this.f7453r);
        AbstractC2036a.d0(parcel, 10, b(this.f7454s));
        AbstractC2036a.n0(parcel, 11, 4);
        parcel.writeInt(this.f7455t);
        AbstractC2036a.n0(parcel, 12, 4);
        parcel.writeInt(this.f7456u);
        AbstractC2036a.f0(parcel, 13, this.f7457v);
        AbstractC2036a.e0(parcel, 14, this.f7458w, i);
        AbstractC2036a.f0(parcel, 16, this.f7459x);
        AbstractC2036a.e0(parcel, 17, this.f7460y, i);
        AbstractC2036a.d0(parcel, 18, b(this.f7461z));
        AbstractC2036a.f0(parcel, 19, this.f7438A);
        AbstractC2036a.f0(parcel, 24, this.f7439B);
        AbstractC2036a.f0(parcel, 25, this.f7440C);
        AbstractC2036a.d0(parcel, 26, b(this.f7441D));
        AbstractC2036a.d0(parcel, 27, b(this.f7442E));
        AbstractC2036a.d0(parcel, 28, b(this.f7443F));
        AbstractC2036a.n0(parcel, 29, 4);
        parcel.writeInt(this.f7444G ? 1 : 0);
        AbstractC2036a.n0(parcel, 30, 8);
        long j5 = this.f7445H;
        parcel.writeLong(j5);
        AbstractC2036a.m0(parcel, k02);
        if (((Boolean) r.f5053d.f5056c.a(F7.wc)).booleanValue()) {
            J.put(Long.valueOf(j5), new k(this.f7447l, this.f7448m, this.f7449n, this.f7461z, this.f7450o, this.f7454s, this.f7441D, this.f7442E, this.f7443F, AbstractC0613Id.f9542d.schedule(new l(j5), ((Integer) r2.f5056c.a(F7.yc)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(InterfaceC0347a interfaceC0347a, C0698Ue c0698Ue, InterfaceC1462q9 interfaceC1462q9, InterfaceC1506r9 interfaceC1506r9, c cVar, C0733Ze c0733Ze, boolean z3, int i, String str, U2.a aVar, Vi vi, BinderC0857cn binderC0857cn, boolean z5) {
        this.f7446k = null;
        this.f7447l = interfaceC0347a;
        this.f7448m = c0698Ue;
        this.f7449n = c0733Ze;
        this.f7461z = interfaceC1462q9;
        this.f7450o = interfaceC1506r9;
        this.f7451p = null;
        this.f7452q = z3;
        this.f7453r = null;
        this.f7454s = cVar;
        this.f7455t = i;
        this.f7456u = 3;
        this.f7457v = str;
        this.f7458w = aVar;
        this.f7459x = null;
        this.f7460y = null;
        this.f7438A = null;
        this.f7439B = null;
        this.f7440C = null;
        this.f7441D = null;
        this.f7442E = vi;
        this.f7443F = binderC0857cn;
        this.f7444G = z5;
        this.f7445H = f7437I.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC0347a interfaceC0347a, C0698Ue c0698Ue, InterfaceC1462q9 interfaceC1462q9, InterfaceC1506r9 interfaceC1506r9, c cVar, C0733Ze c0733Ze, boolean z3, int i, String str, String str2, U2.a aVar, Vi vi, BinderC0857cn binderC0857cn) {
        this.f7446k = null;
        this.f7447l = interfaceC0347a;
        this.f7448m = c0698Ue;
        this.f7449n = c0733Ze;
        this.f7461z = interfaceC1462q9;
        this.f7450o = interfaceC1506r9;
        this.f7451p = str2;
        this.f7452q = z3;
        this.f7453r = str;
        this.f7454s = cVar;
        this.f7455t = i;
        this.f7456u = 3;
        this.f7457v = null;
        this.f7458w = aVar;
        this.f7459x = null;
        this.f7460y = null;
        this.f7438A = null;
        this.f7439B = null;
        this.f7440C = null;
        this.f7441D = null;
        this.f7442E = vi;
        this.f7443F = binderC0857cn;
        this.f7444G = false;
        this.f7445H = f7437I.getAndIncrement();
    }

    public AdOverlayInfoParcel(e eVar, InterfaceC0347a interfaceC0347a, m mVar, c cVar, U2.a aVar, C0733Ze c0733Ze, Vi vi, String str) {
        this.f7446k = eVar;
        this.f7447l = interfaceC0347a;
        this.f7448m = mVar;
        this.f7449n = c0733Ze;
        this.f7461z = null;
        this.f7450o = null;
        this.f7451p = null;
        this.f7452q = false;
        this.f7453r = null;
        this.f7454s = cVar;
        this.f7455t = -1;
        this.f7456u = 4;
        this.f7457v = null;
        this.f7458w = aVar;
        this.f7459x = null;
        this.f7460y = null;
        this.f7438A = str;
        this.f7439B = null;
        this.f7440C = null;
        this.f7441D = null;
        this.f7442E = vi;
        this.f7443F = null;
        this.f7444G = false;
        this.f7445H = f7437I.getAndIncrement();
    }

    public AdOverlayInfoParcel(e eVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z3, String str2, IBinder iBinder5, int i, int i5, String str3, U2.a aVar, String str4, h hVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z5, long j5) {
        this.f7446k = eVar;
        this.f7451p = str;
        this.f7452q = z3;
        this.f7453r = str2;
        this.f7455t = i;
        this.f7456u = i5;
        this.f7457v = str3;
        this.f7458w = aVar;
        this.f7459x = str4;
        this.f7460y = hVar;
        this.f7438A = str5;
        this.f7439B = str6;
        this.f7440C = str7;
        this.f7444G = z5;
        this.f7445H = j5;
        if (((Boolean) r.f5053d.f5056c.a(F7.wc)).booleanValue()) {
            k kVar = (k) J.remove(Long.valueOf(j5));
            if (kVar != null) {
                this.f7447l = kVar.f5329a;
                this.f7448m = kVar.f5330b;
                this.f7449n = kVar.f5331c;
                this.f7461z = kVar.f5332d;
                this.f7450o = kVar.f5333e;
                this.f7441D = kVar.f5334g;
                this.f7442E = kVar.f5335h;
                this.f7443F = kVar.i;
                this.f7454s = kVar.f;
                kVar.f5336j.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.f7447l = (InterfaceC0347a) BinderC2361b.t1(BinderC2361b.h1(iBinder));
        this.f7448m = (m) BinderC2361b.t1(BinderC2361b.h1(iBinder2));
        this.f7449n = (InterfaceC0677Re) BinderC2361b.t1(BinderC2361b.h1(iBinder3));
        this.f7461z = (InterfaceC1462q9) BinderC2361b.t1(BinderC2361b.h1(iBinder6));
        this.f7450o = (InterfaceC1506r9) BinderC2361b.t1(BinderC2361b.h1(iBinder4));
        this.f7454s = (c) BinderC2361b.t1(BinderC2361b.h1(iBinder5));
        this.f7441D = (Sh) BinderC2361b.t1(BinderC2361b.h1(iBinder7));
        this.f7442E = (Vi) BinderC2361b.t1(BinderC2361b.h1(iBinder8));
        this.f7443F = (InterfaceC0590Fb) BinderC2361b.t1(BinderC2361b.h1(iBinder9));
    }

    public AdOverlayInfoParcel(C0733Ze c0733Ze, U2.a aVar, String str, String str2, InterfaceC0590Fb interfaceC0590Fb) {
        this.f7446k = null;
        this.f7447l = null;
        this.f7448m = null;
        this.f7449n = c0733Ze;
        this.f7461z = null;
        this.f7450o = null;
        this.f7451p = null;
        this.f7452q = false;
        this.f7453r = null;
        this.f7454s = null;
        this.f7455t = 14;
        this.f7456u = 5;
        this.f7457v = null;
        this.f7458w = aVar;
        this.f7459x = null;
        this.f7460y = null;
        this.f7438A = str;
        this.f7439B = str2;
        this.f7440C = null;
        this.f7441D = null;
        this.f7442E = null;
        this.f7443F = interfaceC0590Fb;
        this.f7444G = false;
        this.f7445H = f7437I.getAndIncrement();
    }

    public AdOverlayInfoParcel(C1077hj c1077hj, InterfaceC0677Re interfaceC0677Re, int i, U2.a aVar, String str, h hVar, String str2, String str3, String str4, Sh sh, BinderC0857cn binderC0857cn, String str5) {
        this.f7446k = null;
        this.f7447l = null;
        this.f7448m = c1077hj;
        this.f7449n = interfaceC0677Re;
        this.f7461z = null;
        this.f7450o = null;
        this.f7452q = false;
        if (((Boolean) r.f5053d.f5056c.a(F7.f8710K0)).booleanValue()) {
            this.f7451p = null;
            this.f7453r = null;
        } else {
            this.f7451p = str2;
            this.f7453r = str3;
        }
        this.f7454s = null;
        this.f7455t = i;
        this.f7456u = 1;
        this.f7457v = null;
        this.f7458w = aVar;
        this.f7459x = str;
        this.f7460y = hVar;
        this.f7438A = str5;
        this.f7439B = null;
        this.f7440C = str4;
        this.f7441D = sh;
        this.f7442E = null;
        this.f7443F = binderC0857cn;
        this.f7444G = false;
        this.f7445H = f7437I.getAndIncrement();
    }

    public AdOverlayInfoParcel(Vl vl, InterfaceC0677Re interfaceC0677Re, U2.a aVar) {
        this.f7448m = vl;
        this.f7449n = interfaceC0677Re;
        this.f7455t = 1;
        this.f7458w = aVar;
        this.f7446k = null;
        this.f7447l = null;
        this.f7461z = null;
        this.f7450o = null;
        this.f7451p = null;
        this.f7452q = false;
        this.f7453r = null;
        this.f7454s = null;
        this.f7456u = 1;
        this.f7457v = null;
        this.f7459x = null;
        this.f7460y = null;
        this.f7438A = null;
        this.f7439B = null;
        this.f7440C = null;
        this.f7441D = null;
        this.f7442E = null;
        this.f7443F = null;
        this.f7444G = false;
        this.f7445H = f7437I.getAndIncrement();
    }
}
