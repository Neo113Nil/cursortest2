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
import F2.Z;
import I2.J;
import I2.P;
import J2.j;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.D;
import java.util.Collections;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzeij extends L implements zzcxc {
    private final Context zza;
    private final zzewr zzb;
    private final String zzc;
    private final zzejd zzd;
    private com.google.android.gms.ads.internal.client.zzr zze;
    private final zzfay zzf;
    private final VersionInfoParcel zzg;
    private final zzdqq zzh;
    private zzcnp zzi;

    public zzeij(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzewr zzewrVar, zzejd zzejdVar, VersionInfoParcel versionInfoParcel, zzdqq zzdqqVar) {
        this.zza = context;
        this.zzb = zzewrVar;
        this.zze = zzrVar;
        this.zzc = str;
        this.zzd = zzejdVar;
        this.zzf = zzewrVar.zzf();
        this.zzg = versionInfoParcel;
        this.zzh = zzdqqVar;
        zzewrVar.zzo(this);
    }

    private final synchronized void zzf(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzf.zzs(zzrVar);
        this.zzf.zzy(this.zze.f10769E);
    }

    private final synchronized boolean zzh(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            if (zzm()) {
                D.d("loadAd must be called on the main UI thread.");
            }
            P p5 = o.f1952C.f1957c;
            if (!P.g(this.zza) || zzmVar.f10748J != null) {
                zzfbx.zza(this.zza, zzmVar.f10761f);
                return this.zzb.zzb(zzmVar, this.zzc, null, new zzeii(this));
            }
            int i7 = J.f3546b;
            j.d("Failed to load the ad because app ID is missing.");
            zzejd zzejdVar = this.zzd;
            if (zzejdVar != null) {
                zzejdVar.zzdz(zzfcb.zzd(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean zzm() {
        boolean z4;
        if (((Boolean) zzbdw.zzf.zze()).booleanValue()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                z4 = true;
                return this.zzg.f10836c >= ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzli)).intValue() || !z4;
            }
        }
        z4 = false;
        if (this.zzg.f10836c >= ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzli)).intValue()) {
        }
    }

    @Override // F2.M
    public final synchronized void zzA() {
        D.d("recordManualImpression must be called on the main UI thread.");
        zzcnp zzcnpVar = this.zzi;
        if (zzcnpVar != null) {
            zzcnpVar.zzh();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[DONT_GENERATE] */
    @Override // F2.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzB() {
        zzcnp zzcnpVar;
        try {
            if (((Boolean) zzbdw.zzh.zze()).booleanValue()) {
                zzbbp zzbbpVar = zzbby.zzld;
                C0254t c0254t = C0254t.f2723d;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                    if (this.zzg.f10836c < ((Integer) c0254t.f2726c.zzb(zzbby.zzlj)).intValue()) {
                    }
                    zzcnpVar = this.zzi;
                    if (zzcnpVar == null) {
                        zzcnpVar.zzm().zzc(null);
                        return;
                    }
                    return;
                }
            }
            D.d("resume must be called on the main UI thread.");
            zzcnpVar = this.zzi;
            if (zzcnpVar == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // F2.M
    public final void zzC(InterfaceC0260w interfaceC0260w) {
        if (zzm()) {
            D.d("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzn(interfaceC0260w);
    }

    @Override // F2.M
    public final void zzD(InterfaceC0266z interfaceC0266z) {
        if (zzm()) {
            D.d("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzj(interfaceC0266z);
    }

    @Override // F2.M
    public final void zzE(F2.P p5) {
        D.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // F2.M
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        D.d("setAdSize must be called on the main UI thread.");
        this.zzf.zzs(zzrVar);
        this.zze = zzrVar;
        zzcnp zzcnpVar = this.zzi;
        if (zzcnpVar != null) {
            zzcnpVar.zzi(this.zzb.zzc(), zzrVar);
        }
    }

    @Override // F2.M
    public final void zzG(Z z4) {
        if (zzm()) {
            D.d("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzm(z4);
    }

    @Override // F2.M
    public final void zzH(zzazt zzaztVar) {
    }

    @Override // F2.M
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // F2.M
    public final void zzK(com.google.android.gms.ads.internal.client.zzee zzeeVar) {
    }

    @Override // F2.M
    public final void zzL(boolean z4) {
    }

    @Override // F2.M
    public final void zzM(zzbsx zzbsxVar) {
    }

    @Override // F2.M
    public final synchronized void zzN(boolean z4) {
        try {
            if (zzm()) {
                D.d("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.zzf.zzB(z4);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // F2.M
    public final synchronized void zzO(zzbct zzbctVar) {
        D.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzp(zzbctVar);
    }

    @Override // F2.M
    public final void zzP(InterfaceC0265y0 interfaceC0265y0) {
        if (zzm()) {
            D.d("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!interfaceC0265y0.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.c("Error in making CSI ping for reporting paid event callback", e7);
        }
        this.zzd.zzl(interfaceC0265y0);
    }

    @Override // F2.M
    public final void zzQ(zzbta zzbtaVar, String str) {
    }

    @Override // F2.M
    public final void zzR(String str) {
    }

    @Override // F2.M
    public final void zzS(zzbvg zzbvgVar) {
    }

    @Override // F2.M
    public final void zzT(String str) {
    }

    @Override // F2.M
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzfx zzfxVar) {
        try {
            if (zzm()) {
                D.d("setVideoOptions must be called on the main UI thread.");
            }
            this.zzf.zzI(zzfxVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // F2.M
    public final void zzX() {
    }

    @Override // F2.M
    public final synchronized boolean zzY() {
        zzcnp zzcnpVar = this.zzi;
        if (zzcnpVar != null) {
            if (zzcnpVar.zzr()) {
                return true;
            }
        }
        return false;
    }

    @Override // F2.M
    public final synchronized boolean zzZ() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zza() {
        try {
            if (!this.zzb.zzs()) {
                this.zzb.zzl();
                return;
            }
            com.google.android.gms.ads.internal.client.zzr zzh = this.zzf.zzh();
            if (this.zzi != null && this.zzf.zzT()) {
                zzh = zzfbg.zza(this.zza, Collections.singletonList(this.zzi.zzg()));
            }
            zzf(zzh);
            this.zzf.zzx(true);
            try {
                zzh(this.zzf.zzf());
            } catch (RemoteException unused) {
                int i7 = J.f3546b;
                j.g("Failed to refresh the banner ad.");
            }
            this.zzf.zzx(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // F2.M
    public final boolean zzaa() {
        return false;
    }

    @Override // F2.M
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzf(this.zze);
        return zzh(zzmVar);
    }

    @Override // F2.M
    public final synchronized void zzac(C0222c0 c0222c0) {
        D.d("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzV(c0222c0);
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zzb() {
        if (this.zzb.zzs()) {
            this.zzb.zzq();
        } else {
            this.zzb.zzm();
        }
    }

    @Override // F2.M
    public final Bundle zzd() {
        D.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // F2.M
    public final synchronized com.google.android.gms.ads.internal.client.zzr zzg() {
        D.d("getAdSize must be called on the main UI thread.");
        zzcnp zzcnpVar = this.zzi;
        if (zzcnpVar != null) {
            return zzfbg.zza(this.zza, Collections.singletonList(zzcnpVar.zzf()));
        }
        return this.zzf.zzh();
    }

    @Override // F2.M
    public final InterfaceC0266z zzi() {
        return this.zzd.zzg();
    }

    @Override // F2.M
    public final Z zzj() {
        return this.zzd.zzi();
    }

    @Override // F2.M
    public final synchronized F0 zzk() {
        zzcnp zzcnpVar;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgH)).booleanValue() && (zzcnpVar = this.zzi) != null) {
            return zzcnpVar.zzl();
        }
        return null;
    }

    @Override // F2.M
    public final synchronized I0 zzl() {
        D.d("getVideoController must be called from the main thread.");
        zzcnp zzcnpVar = this.zzi;
        if (zzcnpVar == null) {
            return null;
        }
        return zzcnpVar.zze();
    }

    @Override // F2.M
    public final InterfaceC1506a zzn() {
        if (zzm()) {
            D.d("getAdFrame must be called on the main UI thread.");
        }
        return new BinderC1507b(this.zzb.zzc());
    }

    @Override // F2.M
    public final synchronized String zzr() {
        return this.zzc;
    }

    @Override // F2.M
    public final synchronized String zzs() {
        zzcnp zzcnpVar = this.zzi;
        if (zzcnpVar == null || zzcnpVar.zzl() == null) {
            return null;
        }
        return zzcnpVar.zzl().zzg();
    }

    @Override // F2.M
    public final synchronized String zzt() {
        zzcnp zzcnpVar = this.zzi;
        if (zzcnpVar == null || zzcnpVar.zzl() == null) {
            return null;
        }
        return zzcnpVar.zzl().zzg();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[DONT_GENERATE] */
    @Override // F2.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzx() {
        zzcnp zzcnpVar;
        try {
            if (((Boolean) zzbdw.zze.zze()).booleanValue()) {
                zzbbp zzbbpVar = zzbby.zzle;
                C0254t c0254t = C0254t.f2723d;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                    if (this.zzg.f10836c < ((Integer) c0254t.f2726c.zzb(zzbby.zzlj)).intValue()) {
                    }
                    zzcnpVar = this.zzi;
                    if (zzcnpVar == null) {
                        zzcnpVar.zzb();
                        return;
                    }
                    return;
                }
            }
            D.d("destroy must be called on the main UI thread.");
            zzcnpVar = this.zzi;
            if (zzcnpVar == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[DONT_GENERATE] */
    @Override // F2.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzz() {
        zzcnp zzcnpVar;
        try {
            if (((Boolean) zzbdw.zzg.zze()).booleanValue()) {
                zzbbp zzbbpVar = zzbby.zzlf;
                C0254t c0254t = C0254t.f2723d;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                    if (this.zzg.f10836c < ((Integer) c0254t.f2726c.zzb(zzbby.zzlj)).intValue()) {
                    }
                    zzcnpVar = this.zzi;
                    if (zzcnpVar == null) {
                        zzcnpVar.zzm().zzb(null);
                        return;
                    }
                    return;
                }
            }
            D.d("pause must be called on the main UI thread.");
            zzcnpVar = this.zzi;
            if (zzcnpVar == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // F2.M
    public final void zzJ(InterfaceC0226e0 interfaceC0226e0) {
    }

    @Override // F2.M
    public final void zzW(InterfaceC1506a interfaceC1506a) {
    }

    @Override // F2.M
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, C c3) {
    }
}
