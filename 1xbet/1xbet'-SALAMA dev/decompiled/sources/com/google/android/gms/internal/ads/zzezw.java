package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import F2.F0;
import F2.InterfaceC0261w0;
import F2.InterfaceC0265y0;
import I2.J;
import I2.P;
import J2.j;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.D;

/* JADX INFO: loaded from: classes.dex */
public final class zzezw extends zzbvs {
    private final zzezs zza;
    private final zzezi zzb;
    private final String zzc;
    private final zzfas zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzauo zzg;
    private final zzdqq zzh;
    private zzdmu zzi;
    private boolean zzj = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzaR)).booleanValue();

    public zzezw(String str, zzezs zzezsVar, Context context, zzezi zzeziVar, zzfas zzfasVar, VersionInfoParcel versionInfoParcel, zzauo zzauoVar, zzdqq zzdqqVar) {
        this.zzc = str;
        this.zza = zzezsVar;
        this.zzb = zzeziVar;
        this.zzd = zzfasVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzg = zzauoVar;
        this.zzh = zzdqqVar;
    }

    private final synchronized void zzu(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwa zzbwaVar, int i7) {
        try {
            boolean z4 = false;
            if (!zzmVar.f10758c.getBoolean("is_sdk_preload", false)) {
                if (((Boolean) zzbdw.zzk.zze()).booleanValue()) {
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                        z4 = true;
                    }
                }
                if (this.zzf.f10836c < ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzli)).intValue() || !z4) {
                    D.d("#008 Must be called on the main UI thread.");
                }
            }
            this.zzb.zzk(zzbwaVar);
            P p5 = o.f1952C.f1957c;
            if (P.g(this.zze) && zzmVar.f10748J == null) {
                int i8 = J.f3546b;
                j.d("Failed to load the ad because app ID is missing.");
                this.zzb.zzdz(zzfcb.zzd(4, null, null));
                return;
            }
            if (this.zzi != null) {
                return;
            }
            zzezk zzezkVar = new zzezk(null);
            this.zza.zzj(i7);
            this.zza.zzb(zzmVar, this.zzc, zzezkVar, new zzezv(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final Bundle zzb() {
        D.d("#008 Must be called on the main UI thread.");
        zzdmu zzdmuVar = this.zzi;
        return zzdmuVar != null ? zzdmuVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final F0 zzc() {
        zzdmu zzdmuVar;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgH)).booleanValue() && (zzdmuVar = this.zzi) != null) {
            return zzdmuVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final zzbvq zzd() {
        D.d("#008 Must be called on the main UI thread.");
        zzdmu zzdmuVar = this.zzi;
        if (zzdmuVar != null) {
            return zzdmuVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final synchronized String zze() {
        zzdmu zzdmuVar = this.zzi;
        if (zzdmuVar == null || zzdmuVar.zzl() == null) {
            return null;
        }
        return zzdmuVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwa zzbwaVar) {
        zzu(zzmVar, zzbwaVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbwa zzbwaVar) {
        zzu(zzmVar, zzbwaVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final synchronized void zzh(boolean z4) {
        D.d("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzi(InterfaceC0261w0 interfaceC0261w0) {
        if (interfaceC0261w0 == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzezu(this, interfaceC0261w0));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzj(InterfaceC0265y0 interfaceC0265y0) {
        D.d("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!interfaceC0265y0.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.c("Error in making CSI ping for reporting paid event callback", e7);
        }
        this.zzb.zzi(interfaceC0265y0);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzk(zzbvw zzbvwVar) {
        D.d("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbvwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final synchronized void zzl(zzbwh zzbwhVar) {
        D.d("#008 Must be called on the main UI thread.");
        zzfas zzfasVar = this.zzd;
        zzfasVar.zza = zzbwhVar.zza;
        zzfasVar.zzb = zzbwhVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final synchronized void zzm(p105o3.a aVar) {
        zzn(aVar, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final synchronized void zzn(p105o3.a aVar, boolean z4) {
        D.d("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            int i7 = J.f3546b;
            j.g("Rewarded can not be shown before loaded");
            this.zzb.zzq(zzfcb.zzd(9, null, null));
        } else {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcY)).booleanValue()) {
                this.zzg.zzc().zzn(new Throwable().getStackTrace());
            }
            this.zzi.zzh(z4, (Activity) p105o3.b.t0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final boolean zzo() {
        D.d("#008 Must be called on the main UI thread.");
        zzdmu zzdmuVar = this.zzi;
        return (zzdmuVar == null || zzdmuVar.zzf()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzp(zzbwb zzbwbVar) {
        D.d("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbwbVar);
    }
}
