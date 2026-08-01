package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfhk extends com.google.android.gms.ads.internal.client.zzbt implements com.google.android.gms.ads.internal.overlay.zzr, zzbgt {
    protected zzcvx zza;
    private final zzcob zzb;
    private final Context zzc;
    private final String zze;
    private final zzfhe zzf;
    private final zzfhc zzg;
    private final VersionInfoParcel zzh;
    private final zzeaj zzi;
    private zzcvk zzk;
    private AtomicBoolean zzd = new AtomicBoolean();
    private long zzj = -1;

    public zzfhk(zzcob zzcobVar, Context context, String str, zzfhe zzfheVar, zzfhc zzfhcVar, VersionInfoParcel versionInfoParcel, zzeaj zzeajVar) {
        this.zzb = zzcobVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzfheVar;
        this.zzg = zzfhcVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzeajVar;
        zzfhcVar.zzq(this);
    }

    private final synchronized void zzW(int i) {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzg.zzu();
            zzcvk zzcvkVar = this.zzk;
            if (zzcvkVar != null) {
                com.google.android.gms.ads.internal.zzt.zzg().zzc(zzcvkVar);
            }
            if (this.zza != null) {
                long j = -1;
                if (this.zzj != -1) {
                    j = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzj;
                }
                this.zza.zze(j, i);
            }
            zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzA() {
        return this.zzf.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB(zzccn zzccnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzE() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzee zzeeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzf.zzd(zzxVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzbhc zzbhcVar) {
        this.zzg.zzo(zzbhcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzK() {
        zzW(3);
    }

    public final void zzL(zzfua zzfuaVar) {
        this.zzg.zzs(zzfuaVar);
    }

    final /* synthetic */ void zzM() {
        zzW(5);
    }

    final /* synthetic */ void zzN() {
        this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfhk.this.zzM();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(long j) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final long zzT() {
        return 0L;
    }

    final /* synthetic */ zzfhc zzU() {
        return this.zzg;
    }

    final /* synthetic */ zzeaj zzV() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzb() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcvx zzcvxVar = this.zza;
        if (zzcvxVar != null) {
            zzcvxVar.zzd();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzd(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        boolean z;
        if (!zzmVar.zzb()) {
            if (((Boolean) zzblf.zzd.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmO)).booleanValue()) {
                    z = true;
                    if (this.zzh.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmP)).intValue() || !z) {
                        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                    }
                }
            }
            z = false;
            if (this.zzh.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmP)).intValue()) {
            }
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzK(this.zzc) && zzmVar.zzs == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            this.zzg.zzdJ(zzfmy.zzd(4, null, null));
            return false;
        }
        if (zzA()) {
            return false;
        }
        this.zzd = new AtomicBoolean();
        return this.zzf.zza(zzmVar, this.zze, new zzfhg(this), new zzfhh(this));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdU(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdv() {
        zzcvx zzcvxVar = this.zza;
        if (zzcvxVar != null) {
            zzcvxVar.zze(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzj, 1);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zze() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzf() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzh() {
        if (this.zza != null) {
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            int zzc = this.zza.zzc();
            if (zzc > 0) {
                zzcvk zzcvkVar = new zzcvk(this.zzb.zzc(), com.google.android.gms.ads.internal.zzt.zzk());
                this.zzk = zzcvkVar;
                zzcvkVar.zzb(zzc, new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhi
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfhk.this.zzN();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzj() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzk() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzr zzm() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzn(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzcac zzcacVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(zzcaf zzcafVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzq() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcl zzu() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzv() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzw(zzbkb zzbkbVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzy(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzz() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            zzW(2);
            return;
        }
        if (i2 == 1) {
            zzW(4);
        } else if (i2 != 2) {
            zzW(6);
        } else {
            zzW(3);
        }
    }
}
