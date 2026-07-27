package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfku extends zzccz {
    private final zzfkq zza;
    private final zzfkh zzb;
    private final String zzc;
    private final zzflp zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzbbd zzg;
    private final zzeaj zzh;
    private zzdwk zzi;
    private boolean zzj;

    public zzfku(String str, zzfkq zzfkqVar, Context context, zzfkh zzfkhVar, zzflp zzflpVar, VersionInfoParcel versionInfoParcel, zzbbd zzbbdVar, zzeaj zzeajVar) {
        this.zzc = str;
        this.zza = zzfkqVar;
        this.zzb = zzfkhVar;
        this.zzd = zzflpVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbv)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbu)).booleanValue();
        } else {
            this.zzj = true;
        }
        this.zzg = zzbbdVar;
        this.zzh = zzeajVar;
    }

    private final synchronized void zzx(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcdh zzcdhVar, int i) throws RemoteException {
        if (!zzmVar.zzb()) {
            boolean z = false;
            if (((Boolean) zzblf.zzk.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmO)).booleanValue()) {
                    z = true;
                }
            }
            if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmP)).intValue() || !z) {
                Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            }
        }
        zzfkh zzfkhVar = this.zzb;
        zzfkhVar.zzh(zzcdhVar);
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzK(this.zze) && zzmVar.zzs == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            zzfkhVar.zzdJ(zzfmy.zzd(4, null, null));
        } else {
            if (this.zzi != null) {
                return;
            }
            zzfkj zzfkjVar = new zzfkj(null);
            zzfkq zzfkqVar = this.zza;
            zzfkqVar.zzj(i);
            zzfkqVar.zza(zzmVar, this.zzc, zzfkjVar, new zzfkt(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final synchronized void zza(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzj(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcdh zzcdhVar) throws RemoteException {
        zzx(zzmVar, zzcdhVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final synchronized void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcdh zzcdhVar) throws RemoteException {
        zzx(zzmVar, zzcdhVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzd(zzcdd zzcddVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzcddVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zze(com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        if (zzdnVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfks(this, zzdnVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final Bundle zzf() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdwk zzdwkVar = this.zzi;
        return zzdwkVar != null ? zzdwkVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final synchronized void zzg(zzcdo zzcdoVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzflp zzflpVar = this.zzd;
        zzflpVar.zza = zzcdoVar.zza;
        zzflpVar.zzb = zzcdoVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final boolean zzh() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdwk zzdwkVar = this.zzi;
        return (zzdwkVar == null || zzdwkVar.zzb()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final synchronized String zzi() throws RemoteException {
        zzdwk zzdwkVar = this.zzi;
        if (zzdwkVar == null || zzdwkVar.zzn() == null) {
            return null;
        }
        return zzdwkVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final synchronized void zzj(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Rewarded can not be shown before loaded");
            this.zzb.zzj(zzfmy.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdL)).booleanValue()) {
                this.zzg.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzi.zza(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final zzccx zzk() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdwk zzdwkVar = this.zzi;
        if (zzdwkVar != null) {
            return zzdwkVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final com.google.android.gms.ads.internal.client.zzdx zzl() {
        zzdwk zzdwkVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhO)).booleanValue() && (zzdwkVar = this.zzi) != null) {
            return zzdwkVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final String zzm() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzn(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdqVar.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzl(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final synchronized void zzo(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final synchronized long zzp() {
        zzdwk zzdwkVar = this.zzi;
        if (zzdwkVar == null || zzdwkVar.zzo() == null) {
            return 0L;
        }
        return zzdwkVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final synchronized void zzq(long j) {
        zzdwk zzdwkVar = this.zzi;
        if (zzdwkVar == null || zzdwkVar.zzo() == null) {
            return;
        }
        zzdwkVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcda
    public final void zzr(zzcdi zzcdiVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzp(zzcdiVar);
    }

    public final void zzt(zzfua zzfuaVar) {
        this.zzb.zzo(zzfuaVar);
    }

    final /* synthetic */ zzflp zzu() {
        return this.zzd;
    }

    final /* synthetic */ zzdwk zzv() {
        return this.zzi;
    }

    final /* synthetic */ void zzw(zzdwk zzdwkVar) {
        this.zzi = zzdwkVar;
    }
}
