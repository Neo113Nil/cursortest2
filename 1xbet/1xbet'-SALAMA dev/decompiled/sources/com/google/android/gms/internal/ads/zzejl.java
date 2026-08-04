package com.google.android.gms.internal.ads;

import E2.o;
import F2.C;
import F2.C0222c0;
import F2.C0254t;
import F2.F0;
import F2.I0;
import F2.InterfaceC0226e0;
import F2.InterfaceC0260w;
import F2.InterfaceC0265y0;
import F2.InterfaceC0266z;
import F2.L;
import F2.P;
import F2.Z;
import I2.J;
import J2.j;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.D;

/* JADX INFO: loaded from: classes.dex */
public final class zzejl extends L {
    private final com.google.android.gms.ads.internal.client.zzr zza;
    private final Context zzb;
    private final zzeyi zzc;
    private final String zzd;
    private final VersionInfoParcel zze;
    private final zzejd zzf;
    private final zzezi zzg;
    private final zzauo zzh;
    private final zzdqq zzi;
    private zzddn zzj;
    private boolean zzk = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzaR)).booleanValue();

    public zzejl(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzeyi zzeyiVar, zzejd zzejdVar, zzezi zzeziVar, VersionInfoParcel versionInfoParcel, zzauo zzauoVar, zzdqq zzdqqVar) {
        this.zza = zzrVar;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzeyiVar;
        this.zzf = zzejdVar;
        this.zzg = zzeziVar;
        this.zze = versionInfoParcel;
        this.zzh = zzauoVar;
        this.zzi = zzdqqVar;
    }

    private final synchronized boolean zze() {
        zzddn zzddnVar = this.zzj;
        return (zzddnVar == null || zzddnVar.zza()) ? false : true;
    }

    @Override // F2.M
    public final void zzA() {
    }

    @Override // F2.M
    public final synchronized void zzB() {
        D.d("resume must be called on the main UI thread.");
        zzddn zzddnVar = this.zzj;
        if (zzddnVar != null) {
            zzddnVar.zzm().zzc(null);
        }
    }

    @Override // F2.M
    public final void zzD(InterfaceC0266z interfaceC0266z) {
        D.d("setAdListener must be called on the main UI thread.");
        this.zzf.zzj(interfaceC0266z);
    }

    @Override // F2.M
    public final void zzE(P p5) {
        D.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // F2.M
    public final void zzF(com.google.android.gms.ads.internal.client.zzr zzrVar) {
    }

    @Override // F2.M
    public final void zzG(Z z4) {
        D.d("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzm(z4);
    }

    @Override // F2.M
    public final void zzH(zzazt zzaztVar) {
    }

    @Override // F2.M
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // F2.M
    public final void zzJ(InterfaceC0226e0 interfaceC0226e0) {
        this.zzf.zzn(interfaceC0226e0);
    }

    @Override // F2.M
    public final void zzK(com.google.android.gms.ads.internal.client.zzee zzeeVar) {
    }

    @Override // F2.M
    public final synchronized void zzL(boolean z4) {
        D.d("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z4;
    }

    @Override // F2.M
    public final void zzM(zzbsx zzbsxVar) {
    }

    @Override // F2.M
    public final void zzN(boolean z4) {
    }

    @Override // F2.M
    public final synchronized void zzO(zzbct zzbctVar) {
        D.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbctVar);
    }

    @Override // F2.M
    public final void zzP(InterfaceC0265y0 interfaceC0265y0) {
        D.d("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!interfaceC0265y0.zzf()) {
                this.zzi.zze();
            }
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.c("Error in making CSI ping for reporting paid event callback", e7);
        }
        this.zzf.zzl(interfaceC0265y0);
    }

    @Override // F2.M
    public final void zzQ(zzbta zzbtaVar, String str) {
    }

    @Override // F2.M
    public final void zzR(String str) {
    }

    @Override // F2.M
    public final void zzS(zzbvg zzbvgVar) {
        this.zzg.zzm(zzbvgVar);
    }

    @Override // F2.M
    public final void zzT(String str) {
    }

    @Override // F2.M
    public final void zzU(com.google.android.gms.ads.internal.client.zzfx zzfxVar) {
    }

    @Override // F2.M
    public final synchronized void zzW(p105o3.a aVar) {
        if (this.zzj == null) {
            int i7 = J.f3546b;
            j.g("Interstitial can not be shown before loaded.");
            this.zzf.zzq(zzfcb.zzd(9, null, null));
        } else {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcY)).booleanValue()) {
                this.zzh.zzc().zzn(new Throwable().getStackTrace());
            }
            this.zzj.zzc(this.zzk, (Activity) p105o3.b.t0(aVar));
        }
    }

    @Override // F2.M
    public final synchronized void zzX() {
        D.d("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            int i7 = J.f3546b;
            j.g("Interstitial can not be shown before loaded.");
            this.zzf.zzq(zzfcb.zzd(9, null, null));
        } else {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcY)).booleanValue()) {
                this.zzh.zzc().zzn(new Throwable().getStackTrace());
            }
            this.zzj.zzc(this.zzk, null);
        }
    }

    @Override // F2.M
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // F2.M
    public final synchronized boolean zzZ() {
        return this.zzc.zza();
    }

    @Override // F2.M
    public final synchronized boolean zzaa() {
        D.d("isLoaded must be called on the main UI thread.");
        return zze();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    @Override // F2.M
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        boolean z4;
        try {
            if (!zzmVar.f10758c.getBoolean("is_sdk_preload", false)) {
                if (((Boolean) zzbdw.zzi.zze()).booleanValue()) {
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                if (this.zze.f10836c < ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzli)).intValue() || !z4) {
                    D.d("loadAd must be called on the main UI thread.");
                }
            }
            I2.P p5 = o.f1952C.f1957c;
            if (I2.P.g(this.zzb) && zzmVar.f10748J == null) {
                int i7 = J.f3546b;
                j.d("Failed to load the ad because app ID is missing.");
                zzejd zzejdVar = this.zzf;
                if (zzejdVar != null) {
                    zzejdVar.zzdz(zzfcb.zzd(4, null, null));
                }
            } else if (!zze()) {
                zzfbx.zza(this.zzb, zzmVar.f10761f);
                this.zzj = null;
                return this.zzc.zzb(zzmVar, this.zzd, new zzeyb(this.zza), new zzejk(this));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // F2.M
    public final Bundle zzd() {
        D.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // F2.M
    public final com.google.android.gms.ads.internal.client.zzr zzg() {
        return null;
    }

    @Override // F2.M
    public final InterfaceC0266z zzi() {
        return this.zzf.zzg();
    }

    @Override // F2.M
    public final Z zzj() {
        return this.zzf.zzi();
    }

    @Override // F2.M
    public final synchronized F0 zzk() {
        zzddn zzddnVar;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgH)).booleanValue() && (zzddnVar = this.zzj) != null) {
            return zzddnVar.zzl();
        }
        return null;
    }

    @Override // F2.M
    public final I0 zzl() {
        return null;
    }

    @Override // F2.M
    public final p105o3.a zzn() {
        return null;
    }

    @Override // F2.M
    public final synchronized String zzr() {
        return this.zzd;
    }

    @Override // F2.M
    public final synchronized String zzs() {
        zzddn zzddnVar = this.zzj;
        if (zzddnVar == null || zzddnVar.zzl() == null) {
            return null;
        }
        return zzddnVar.zzl().zzg();
    }

    @Override // F2.M
    public final synchronized String zzt() {
        zzddn zzddnVar = this.zzj;
        if (zzddnVar == null || zzddnVar.zzl() == null) {
            return null;
        }
        return zzddnVar.zzl().zzg();
    }

    @Override // F2.M
    public final synchronized void zzx() {
        D.d("destroy must be called on the main UI thread.");
        zzddn zzddnVar = this.zzj;
        if (zzddnVar != null) {
            zzddnVar.zzm().zza(null);
        }
    }

    @Override // F2.M
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, C c3) {
        this.zzf.zzk(c3);
        zzab(zzmVar);
    }

    @Override // F2.M
    public final synchronized void zzz() {
        D.d("pause must be called on the main UI thread.");
        zzddn zzddnVar = this.zzj;
        if (zzddnVar != null) {
            zzddnVar.zzm().zzb(null);
        }
    }

    @Override // F2.M
    public final void zzC(InterfaceC0260w interfaceC0260w) {
    }

    @Override // F2.M
    public final void zzac(C0222c0 c0222c0) {
    }
}
