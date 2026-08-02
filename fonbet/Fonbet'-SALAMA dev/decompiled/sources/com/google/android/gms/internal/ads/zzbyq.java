package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0252s;
import F2.C0254t;
import I2.J;
import I2.L;
import I2.M;
import J2.j;
import J2.l;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n3.c;

/* loaded from: classes.dex */
public final class zzbyq {
    private final Object zza = new Object();
    private final M zzb;
    private final zzbyu zzc;
    private boolean zzd;
    private Context zze;
    private VersionInfoParcel zzf;
    private String zzg;
    private zzbcd zzh;
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final AtomicInteger zzk;
    private final zzbyo zzl;
    private final Object zzm;
    private I3.b zzn;
    private final AtomicBoolean zzo;

    public zzbyq() {
        M m7 = new M();
        this.zzb = m7;
        this.zzc = new zzbyu(C0252s.f2717f.f2720c, m7);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new AtomicInteger(0);
        this.zzk = new AtomicInteger(0);
        this.zzl = new zzbyo(null);
        this.zzm = new Object();
        this.zzo = new AtomicBoolean();
    }

    public static /* synthetic */ ArrayList zzo(zzbyq zzbyqVar) {
        Context zza = zzbuy.zza(zzbyqVar.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo t7 = c.a(zza).t(4096, zza.getApplicationInfo().packageName);
            if (t7.requestedPermissions != null && t7.requestedPermissionsFlags != null) {
                int i7 = 0;
                while (true) {
                    String[] strArr = t7.requestedPermissions;
                    if (i7 >= strArr.length) {
                        break;
                    }
                    if ((t7.requestedPermissionsFlags[i7] & 2) != 0) {
                        arrayList.add(strArr[i7]);
                    }
                    i7++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final boolean zzA(Context context) {
        if (m3.c.h()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzit)).booleanValue()) {
                return this.zzo.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final int zza() {
        return this.zzk.get();
    }

    public final int zzb() {
        return this.zzj.get();
    }

    public final Context zzd() {
        return this.zze;
    }

    public final Resources zze() {
        if (this.zzf.f10837d) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkS)).booleanValue()) {
                return Q0.a.l0(this.zze).f15689a.getResources();
            }
            Q0.a.l0(this.zze).f15689a.getResources();
            return null;
        } catch (l e7) {
            int i7 = J.f3546b;
            j.h("Cannot load resource from dynamite apk or local jar", e7);
            return null;
        }
    }

    public final zzbcd zzg() {
        zzbcd zzbcdVar;
        synchronized (this.zza) {
            zzbcdVar = this.zzh;
        }
        return zzbcdVar;
    }

    public final zzbyu zzh() {
        return this.zzc;
    }

    public final L zzi() {
        M m7;
        synchronized (this.zza) {
            m7 = this.zzb;
        }
        return m7;
    }

    public final I3.b zzk() {
        if (this.zze != null) {
            if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdb)).booleanValue()) {
                synchronized (this.zzm) {
                    try {
                        I3.b bVar = this.zzn;
                        if (bVar != null) {
                            return bVar;
                        }
                        I3.b zzb = zzbza.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzbyl
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return zzbyq.zzo(zzbyq.this);
                            }
                        });
                        this.zzn = zzb;
                        return zzb;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return zzgbc.zzh(new ArrayList());
    }

    public final Boolean zzl() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzi;
        }
        return bool;
    }

    public final String zzn() {
        return this.zzg;
    }

    public final void zzq() {
        this.zzl.zza();
    }

    public final void zzr() {
        this.zzj.decrementAndGet();
    }

    public final void zzs() {
        this.zzk.incrementAndGet();
    }

    public final void zzt() {
        this.zzj.incrementAndGet();
    }

    public final void zzu(Context context, VersionInfoParcel versionInfoParcel) {
        zzbcd zzbcdVar;
        synchronized (this.zza) {
            try {
                if (!this.zzd) {
                    this.zze = context.getApplicationContext();
                    this.zzf = versionInfoParcel;
                    o oVar = o.f1952C;
                    oVar.f1960f.zzc(this.zzc);
                    this.zzb.p(this.zze);
                    zzbtl.zzb(this.zze, this.zzf);
                    zzbce zzbceVar = oVar.f1965l;
                    zzbbp zzbbpVar = zzbby.zzci;
                    C0254t c0254t = C0254t.f2723d;
                    if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                        zzbcdVar = new zzbcd();
                    } else {
                        J.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        zzbcdVar = null;
                    }
                    this.zzh = zzbcdVar;
                    if (zzbcdVar != null) {
                        zzbzd.zza(new zzbym(this).zzb(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.zze;
                    if (m3.c.h()) {
                        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzit)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzbyn(this));
                            } catch (RuntimeException e7) {
                                int i7 = J.f3546b;
                                j.h("Failed to register network callback", e7);
                                this.zzo.set(true);
                            }
                        }
                    }
                    this.zzd = true;
                    zzk();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o.f1952C.f1957c.x(context, versionInfoParcel.f10834a);
    }

    public final void zzv(Throwable th, String str) {
        zzbtl.zzb(this.zze, this.zzf).zzi(th, str, ((Double) zzbeh.zzf.zze()).floatValue());
    }

    public final void zzw(Throwable th, String str) {
        zzbtl.zzb(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzx(Throwable th, String str) {
        zzbtl.zzd(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzy(Boolean bool) {
        synchronized (this.zza) {
            this.zzi = bool;
        }
    }

    public final void zzz(String str) {
        this.zzg = str;
    }
}
