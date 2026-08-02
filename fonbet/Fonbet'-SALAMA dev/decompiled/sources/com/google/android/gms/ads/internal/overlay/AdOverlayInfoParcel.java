package com.google.android.gms.ads.internal.overlay;

import B2.e;
import E2.o;
import F2.C0254t;
import F2.InterfaceC0217a;
import H2.c;
import H2.k;
import H2.l;
import H2.m;
import Y4.D;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbhp;
import com.google.android.gms.internal.ads.zzbhr;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzcvd;
import com.google.android.gms.internal.ads.zzdcp;
import com.google.android.gms.internal.ads.zzdeo;
import com.google.android.gms.internal.ads.zzdua;
import com.google.android.gms.internal.ads.zzeaq;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import o3.BinderC1507b;

/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new e(19);

    /* renamed from: P, reason: collision with root package name */
    public static final AtomicLong f10798P = new AtomicLong(0);

    /* renamed from: Q, reason: collision with root package name */
    public static final ConcurrentHashMap f10799Q = new ConcurrentHashMap();

    /* renamed from: A, reason: collision with root package name */
    public final int f10800A;

    /* renamed from: B, reason: collision with root package name */
    public final int f10801B;

    /* renamed from: C, reason: collision with root package name */
    public final String f10802C;

    /* renamed from: D, reason: collision with root package name */
    public final VersionInfoParcel f10803D;

    /* renamed from: E, reason: collision with root package name */
    public final String f10804E;

    /* renamed from: F, reason: collision with root package name */
    public final zzl f10805F;

    /* renamed from: G, reason: collision with root package name */
    public final zzbhp f10806G;

    /* renamed from: H, reason: collision with root package name */
    public final String f10807H;

    /* renamed from: I, reason: collision with root package name */
    public final String f10808I;

    /* renamed from: J, reason: collision with root package name */
    public final String f10809J;

    /* renamed from: K, reason: collision with root package name */
    public final zzcvd f10810K;

    /* renamed from: L, reason: collision with root package name */
    public final zzdcp f10811L;

    /* renamed from: M, reason: collision with root package name */
    public final zzbsh f10812M;

    /* renamed from: N, reason: collision with root package name */
    public final boolean f10813N;

    /* renamed from: O, reason: collision with root package name */
    public final long f10814O;

    /* renamed from: a, reason: collision with root package name */
    public final zzc f10815a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0217a f10816b;

    /* renamed from: c, reason: collision with root package name */
    public final m f10817c;

    /* renamed from: d, reason: collision with root package name */
    public final zzceb f10818d;

    /* renamed from: e, reason: collision with root package name */
    public final zzbhr f10819e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10820f;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f10821x;

    /* renamed from: y, reason: collision with root package name */
    public final String f10822y;

    /* renamed from: z, reason: collision with root package name */
    public final c f10823z;

    public AdOverlayInfoParcel(InterfaceC0217a interfaceC0217a, m mVar, c cVar, zzceb zzcebVar, boolean z4, int i7, VersionInfoParcel versionInfoParcel, zzdcp zzdcpVar, zzeaq zzeaqVar) {
        this.f10815a = null;
        this.f10816b = interfaceC0217a;
        this.f10817c = mVar;
        this.f10818d = zzcebVar;
        this.f10806G = null;
        this.f10819e = null;
        this.f10820f = null;
        this.f10821x = z4;
        this.f10822y = null;
        this.f10823z = cVar;
        this.f10800A = i7;
        this.f10801B = 2;
        this.f10802C = null;
        this.f10803D = versionInfoParcel;
        this.f10804E = null;
        this.f10805F = null;
        this.f10807H = null;
        this.f10808I = null;
        this.f10809J = null;
        this.f10810K = null;
        this.f10811L = zzdcpVar;
        this.f10812M = zzeaqVar;
        this.f10813N = false;
        this.f10814O = f10798P.getAndIncrement();
    }

    public static AdOverlayInfoParcel j(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e7) {
            if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmQ)).booleanValue()) {
                return null;
            }
            o.f1952C.f1961g.zzw(e7, "AdOverlayInfoParcel.getFromIntent");
            return null;
        }
    }

    public static final IBinder k(Object obj) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmQ)).booleanValue()) {
            return null;
        }
        return new BinderC1507b(obj).asBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.r0(parcel, 2, this.f10815a, i7, false);
        D.n0(parcel, 3, k(this.f10816b));
        D.n0(parcel, 4, k(this.f10817c));
        D.n0(parcel, 5, k(this.f10818d));
        D.n0(parcel, 6, k(this.f10819e));
        D.s0(parcel, 7, this.f10820f, false);
        D.B0(parcel, 8, 4);
        parcel.writeInt(this.f10821x ? 1 : 0);
        D.s0(parcel, 9, this.f10822y, false);
        D.n0(parcel, 10, k(this.f10823z));
        D.B0(parcel, 11, 4);
        parcel.writeInt(this.f10800A);
        D.B0(parcel, 12, 4);
        parcel.writeInt(this.f10801B);
        D.s0(parcel, 13, this.f10802C, false);
        D.r0(parcel, 14, this.f10803D, i7, false);
        D.s0(parcel, 16, this.f10804E, false);
        D.r0(parcel, 17, this.f10805F, i7, false);
        D.n0(parcel, 18, k(this.f10806G));
        D.s0(parcel, 19, this.f10807H, false);
        D.s0(parcel, 24, this.f10808I, false);
        D.s0(parcel, 25, this.f10809J, false);
        D.n0(parcel, 26, k(this.f10810K));
        D.n0(parcel, 27, k(this.f10811L));
        D.n0(parcel, 28, k(this.f10812M));
        D.B0(parcel, 29, 4);
        parcel.writeInt(this.f10813N ? 1 : 0);
        D.B0(parcel, 30, 8);
        long j = this.f10814O;
        parcel.writeLong(j);
        D.z0(x02, parcel);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmQ)).booleanValue()) {
            f10799Q.put(Long.valueOf(j), new k(this.f10816b, this.f10817c, this.f10818d, this.f10806G, this.f10819e, this.f10823z, this.f10810K, this.f10811L, this.f10812M, zzbza.zzd.schedule(new l(j), ((Integer) r2.f2726c.zzb(zzbby.zzmS)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(InterfaceC0217a interfaceC0217a, m mVar, zzbhp zzbhpVar, zzbhr zzbhrVar, c cVar, zzceb zzcebVar, boolean z4, int i7, String str, VersionInfoParcel versionInfoParcel, zzdcp zzdcpVar, zzeaq zzeaqVar, boolean z7) {
        this.f10815a = null;
        this.f10816b = interfaceC0217a;
        this.f10817c = mVar;
        this.f10818d = zzcebVar;
        this.f10806G = zzbhpVar;
        this.f10819e = zzbhrVar;
        this.f10820f = null;
        this.f10821x = z4;
        this.f10822y = null;
        this.f10823z = cVar;
        this.f10800A = i7;
        this.f10801B = 3;
        this.f10802C = str;
        this.f10803D = versionInfoParcel;
        this.f10804E = null;
        this.f10805F = null;
        this.f10807H = null;
        this.f10808I = null;
        this.f10809J = null;
        this.f10810K = null;
        this.f10811L = zzdcpVar;
        this.f10812M = zzeaqVar;
        this.f10813N = z7;
        this.f10814O = f10798P.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC0217a interfaceC0217a, m mVar, zzbhp zzbhpVar, zzbhr zzbhrVar, c cVar, zzceb zzcebVar, boolean z4, int i7, String str, String str2, VersionInfoParcel versionInfoParcel, zzdcp zzdcpVar, zzeaq zzeaqVar) {
        this.f10815a = null;
        this.f10816b = interfaceC0217a;
        this.f10817c = mVar;
        this.f10818d = zzcebVar;
        this.f10806G = zzbhpVar;
        this.f10819e = zzbhrVar;
        this.f10820f = str2;
        this.f10821x = z4;
        this.f10822y = str;
        this.f10823z = cVar;
        this.f10800A = i7;
        this.f10801B = 3;
        this.f10802C = null;
        this.f10803D = versionInfoParcel;
        this.f10804E = null;
        this.f10805F = null;
        this.f10807H = null;
        this.f10808I = null;
        this.f10809J = null;
        this.f10810K = null;
        this.f10811L = zzdcpVar;
        this.f10812M = zzeaqVar;
        this.f10813N = false;
        this.f10814O = f10798P.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzc zzcVar, InterfaceC0217a interfaceC0217a, m mVar, c cVar, VersionInfoParcel versionInfoParcel, zzceb zzcebVar, zzdcp zzdcpVar, String str) {
        this.f10815a = zzcVar;
        this.f10816b = interfaceC0217a;
        this.f10817c = mVar;
        this.f10818d = zzcebVar;
        this.f10806G = null;
        this.f10819e = null;
        this.f10820f = null;
        this.f10821x = false;
        this.f10822y = null;
        this.f10823z = cVar;
        this.f10800A = -1;
        this.f10801B = 4;
        this.f10802C = null;
        this.f10803D = versionInfoParcel;
        this.f10804E = null;
        this.f10805F = null;
        this.f10807H = str;
        this.f10808I = null;
        this.f10809J = null;
        this.f10810K = null;
        this.f10811L = zzdcpVar;
        this.f10812M = null;
        this.f10813N = false;
        this.f10814O = f10798P.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z4, String str2, IBinder iBinder5, int i7, int i8, String str3, VersionInfoParcel versionInfoParcel, String str4, zzl zzlVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z7, long j) {
        this.f10815a = zzcVar;
        this.f10820f = str;
        this.f10821x = z4;
        this.f10822y = str2;
        this.f10800A = i7;
        this.f10801B = i8;
        this.f10802C = str3;
        this.f10803D = versionInfoParcel;
        this.f10804E = str4;
        this.f10805F = zzlVar;
        this.f10807H = str5;
        this.f10808I = str6;
        this.f10809J = str7;
        this.f10813N = z7;
        this.f10814O = j;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmQ)).booleanValue()) {
            k kVar = (k) f10799Q.remove(Long.valueOf(j));
            if (kVar != null) {
                this.f10816b = kVar.f3268a;
                this.f10817c = kVar.f3269b;
                this.f10818d = kVar.f3270c;
                this.f10806G = kVar.f3271d;
                this.f10819e = kVar.f3272e;
                this.f10810K = kVar.f3274g;
                this.f10811L = kVar.f3275h;
                this.f10812M = kVar.f3276i;
                this.f10823z = kVar.f3273f;
                kVar.j.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.f10816b = (InterfaceC0217a) BinderC1507b.t0(BinderC1507b.Z(iBinder));
        this.f10817c = (m) BinderC1507b.t0(BinderC1507b.Z(iBinder2));
        this.f10818d = (zzceb) BinderC1507b.t0(BinderC1507b.Z(iBinder3));
        this.f10806G = (zzbhp) BinderC1507b.t0(BinderC1507b.Z(iBinder6));
        this.f10819e = (zzbhr) BinderC1507b.t0(BinderC1507b.Z(iBinder4));
        this.f10823z = (c) BinderC1507b.t0(BinderC1507b.Z(iBinder5));
        this.f10810K = (zzcvd) BinderC1507b.t0(BinderC1507b.Z(iBinder7));
        this.f10811L = (zzdcp) BinderC1507b.t0(BinderC1507b.Z(iBinder8));
        this.f10812M = (zzbsh) BinderC1507b.t0(BinderC1507b.Z(iBinder9));
    }

    public AdOverlayInfoParcel(zzceb zzcebVar, VersionInfoParcel versionInfoParcel, String str, String str2, zzbsh zzbshVar) {
        this.f10815a = null;
        this.f10816b = null;
        this.f10817c = null;
        this.f10818d = zzcebVar;
        this.f10806G = null;
        this.f10819e = null;
        this.f10820f = null;
        this.f10821x = false;
        this.f10822y = null;
        this.f10823z = null;
        this.f10800A = 14;
        this.f10801B = 5;
        this.f10802C = null;
        this.f10803D = versionInfoParcel;
        this.f10804E = null;
        this.f10805F = null;
        this.f10807H = str;
        this.f10808I = str2;
        this.f10809J = null;
        this.f10810K = null;
        this.f10811L = null;
        this.f10812M = zzbshVar;
        this.f10813N = false;
        this.f10814O = f10798P.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzdeo zzdeoVar, zzceb zzcebVar, int i7, VersionInfoParcel versionInfoParcel, String str, zzl zzlVar, String str2, String str3, String str4, zzcvd zzcvdVar, zzeaq zzeaqVar, String str5) {
        this.f10815a = null;
        this.f10816b = null;
        this.f10817c = zzdeoVar;
        this.f10818d = zzcebVar;
        this.f10806G = null;
        this.f10819e = null;
        this.f10821x = false;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzaW)).booleanValue()) {
            this.f10820f = null;
            this.f10822y = null;
        } else {
            this.f10820f = str2;
            this.f10822y = str3;
        }
        this.f10823z = null;
        this.f10800A = i7;
        this.f10801B = 1;
        this.f10802C = null;
        this.f10803D = versionInfoParcel;
        this.f10804E = str;
        this.f10805F = zzlVar;
        this.f10807H = str5;
        this.f10808I = null;
        this.f10809J = str4;
        this.f10810K = zzcvdVar;
        this.f10811L = null;
        this.f10812M = zzeaqVar;
        this.f10813N = false;
        this.f10814O = f10798P.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzdua zzduaVar, zzceb zzcebVar, VersionInfoParcel versionInfoParcel) {
        this.f10817c = zzduaVar;
        this.f10818d = zzcebVar;
        this.f10800A = 1;
        this.f10803D = versionInfoParcel;
        this.f10815a = null;
        this.f10816b = null;
        this.f10806G = null;
        this.f10819e = null;
        this.f10820f = null;
        this.f10821x = false;
        this.f10822y = null;
        this.f10823z = null;
        this.f10801B = 1;
        this.f10802C = null;
        this.f10804E = null;
        this.f10805F = null;
        this.f10807H = null;
        this.f10808I = null;
        this.f10809J = null;
        this.f10810K = null;
        this.f10811L = null;
        this.f10812M = null;
        this.f10813N = false;
        this.f10814O = f10798P.getAndIncrement();
    }
}
