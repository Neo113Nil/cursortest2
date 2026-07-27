package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzete extends com.google.android.gms.ads.internal.client.zzbt implements zzdgl {
    private final Context zza;
    private final zzfhq zzb;
    private final String zzc;
    private final zzeua zzd;
    private com.google.android.gms.ads.internal.client.zzr zze;
    private final zzflv zzf;
    private final VersionInfoParcel zzg;
    private final zzeaj zzh;
    private zzcwd zzi;

    public zzete(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzfhq zzfhqVar, zzeua zzeuaVar, VersionInfoParcel versionInfoParcel, zzeaj zzeajVar) {
        this.zza = context;
        this.zzb = zzfhqVar;
        this.zze = zzrVar;
        this.zzc = str;
        this.zzd = zzeuaVar;
        this.zzf = zzfhqVar.zzg();
        this.zzg = versionInfoParcel;
        this.zzh = zzeajVar;
        zzfhqVar.zzi(this);
    }

    private final synchronized void zzU(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzflv zzflvVar = this.zzf;
        zzflvVar.zzc(zzrVar);
        zzflvVar.zze(this.zze.zzn);
    }

    private final synchronized boolean zzV(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        if (zzW()) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        if (!com.google.android.gms.ads.internal.util.zzs.zzK(context) || zzmVar.zzs != null) {
            zzfmt.zzb(context, zzmVar.zzf);
            return this.zzb.zza(zzmVar, this.zzc, null, new zzetd(this));
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
        zzeua zzeuaVar = this.zzd;
        if (zzeuaVar != null) {
            zzeuaVar.zzdJ(zzfmy.zzd(4, null, null));
        }
        return false;
    }

    private final boolean zzW() {
        boolean z;
        if (((Boolean) zzblf.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmO)).booleanValue()) {
                z = true;
                return this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmP)).intValue() || !z;
            }
        }
        z = false;
        if (this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmP)).intValue()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzA() {
        return this.zzb.zzb();
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
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzcwd zzcwdVar = this.zzi;
        if (zzcwdVar == null) {
            return null;
        }
        return zzcwdVar.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzi(zzfwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzee zzeeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzbhc zzbhcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgl
    public final synchronized void zzK() {
        if (!this.zzb.zzh()) {
            this.zzb.zzj();
            return;
        }
        zzflv zzflvVar = this.zzf;
        com.google.android.gms.ads.internal.client.zzr zzf = zzflvVar.zzf();
        if (this.zzi != null && zzflvVar.zzD()) {
            zzf = zzfmc.zza(this.zza, Collections.singletonList(this.zzi.zzf()));
        }
        zzU(zzf);
        zzflvVar.zzd(true);
        try {
            zzV(zzflvVar.zzb());
        } catch (RemoteException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to refresh the banner ad.");
        }
        this.zzf.zzd(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdgl
    public final synchronized void zzL() throws ExecutionException, InterruptedException {
        zzfhq zzfhqVar = this.zzb;
        if (zzfhqVar.zzh()) {
            zzfhqVar.zzc();
        } else {
            zzfhqVar.zzk();
        }
    }

    final /* synthetic */ zzcwd zzM() {
        return this.zzi;
    }

    final /* synthetic */ void zzN(zzcwd zzcwdVar) {
        this.zzi = zzcwdVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdqVar.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzd.zzp(zzdqVar);
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
    public final synchronized void zzS(long j) {
        this.zzf.zzx(j);
        zzcwd zzcwdVar = this.zzi;
        if (zzcwdVar == null || zzcwdVar.zzo() == null) {
            return;
        }
        zzcwdVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized long zzT() {
        zzcwd zzcwdVar = this.zzi;
        if (zzcwdVar == null || zzcwdVar.zzo() == null) {
            return this.zzf.zzw();
        }
        return zzcwdVar.zzo().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzab(zzcpVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zza() {
        if (zzW()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzd());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzmQ)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzb() {
        if (((Boolean) zzblf.zze.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmL)).booleanValue()) {
            }
        }
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcwd zzcwdVar = this.zzi;
        if (zzcwdVar != null) {
            zzcwdVar.zzd();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzd(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        zzU(this.zze);
        return zzV(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdU(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzo(zzclVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzmQ)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zze() {
        if (((Boolean) zzblf.zzg.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmM)).booleanValue()) {
            }
        }
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzcwd zzcwdVar = this.zzi;
        if (zzcwdVar != null) {
            zzcwdVar.zzl().zza(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3.zzg.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzmQ)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzf() {
        if (((Boolean) zzblf.zzh.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmK)).booleanValue()) {
            }
        }
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzcwd zzcwdVar = this.zzi;
        if (zzcwdVar != null) {
            zzcwdVar.zzl().zzb(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzl(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzj() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzl() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzcwd zzcwdVar = this.zzi;
        if (zzcwdVar != null) {
            zzcwdVar.zzi();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzr zzm() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcwd zzcwdVar = this.zzi;
        if (zzcwdVar != null) {
            return zzfmc.zza(this.zza, Collections.singletonList(zzcwdVar.zze()));
        }
        return this.zzf.zzf();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzn(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzc(zzrVar);
        this.zze = zzrVar;
        zzcwd zzcwdVar = this.zzi;
        if (zzcwdVar != null) {
            zzcwdVar.zzb(this.zzb.zzd(), zzrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzcac zzcacVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(zzcaf zzcafVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzq() {
        zzcwd zzcwdVar = this.zzi;
        if (zzcwdVar == null || zzcwdVar.zzn() == null) {
            return null;
        }
        return zzcwdVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        zzcwd zzcwdVar = this.zzi;
        if (zzcwdVar == null || zzcwdVar.zzn() == null) {
            return null;
        }
        return zzcwdVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzs() {
        zzcwd zzcwdVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhO)).booleanValue() && (zzcwdVar = this.zzi) != null) {
            return zzcwdVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzt() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcl zzu() {
        return this.zzd.zzk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzv() {
        return this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzw(zzbkb zzbkbVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zze(zzbkbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzf(zzbeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzy(boolean z) {
        if (zzW()) {
            Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzk(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzz() {
        zzcwd zzcwdVar = this.zzi;
        if (zzcwdVar != null) {
            if (zzcwdVar.zzs()) {
                return true;
            }
        }
        return false;
    }
}
