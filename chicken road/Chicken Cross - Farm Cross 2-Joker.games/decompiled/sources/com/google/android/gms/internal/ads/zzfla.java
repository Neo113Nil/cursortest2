package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfla extends zzccj {
    private final zzfkq zza;
    private final zzfkh zzb;
    private final zzflp zzc;
    private zzdwk zzd;
    private boolean zze = false;

    public zzfla(zzfkq zzfkqVar, zzfkh zzfkhVar, zzflp zzflpVar) {
        this.zza = zzfkqVar;
        this.zzb = zzfkhVar;
        this.zzc = zzflpVar;
    }

    private final synchronized boolean zzx() {
        zzdwk zzdwkVar = this.zzd;
        if (zzdwkVar != null) {
            if (!zzdwkVar.zze()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzgE)).booleanValue() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (java.util.regex.Pattern.matches(r1, r0) != false) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzcck
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zza(zzcco zzccoVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        String str = zzccoVar.zzb;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgC);
        if (str2 != null && str != null) {
            try {
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (zzx()) {
        }
        zzfkj zzfkjVar = new zzfkj(null);
        this.zzd = null;
        zzfkq zzfkqVar = this.zza;
        zzfkqVar.zzj(1);
        zzfkqVar.zza(zzccoVar.zza, zzccoVar.zzb, zzfkjVar, new zzfky(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzb() throws RemoteException {
        zzo(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzc(zzccn zzccnVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzn(zzccnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final boolean zzd() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zze() {
        zzh(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzf() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzg() throws RemoteException {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zza(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzk(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzl().zzc(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized String zzk() throws RemoteException {
        zzdwk zzdwkVar = this.zzd;
        if (zzdwkVar == null || zzdwkVar.zzn() == null) {
            return null;
        }
        return zzdwkVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzl(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzm(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfkz(this, zzbyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final Bundle zzn() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdwk zzdwkVar = this.zzd;
        return zzdwkVar != null ? zzdwkVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (unwrap instanceof Activity) {
                    activity = (Activity) unwrap;
                }
            }
            this.zzd.zza(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized void zzq(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final boolean zzr() {
        zzdwk zzdwkVar = this.zzd;
        return zzdwkVar != null && zzdwkVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzs() throws RemoteException {
        zzdwk zzdwkVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhO)).booleanValue() && (zzdwkVar = this.zzd) != null) {
            return zzdwkVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcck
    public final void zzt(zzcci zzcciVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzq(zzcciVar);
    }

    final /* synthetic */ zzflp zzu() {
        return this.zzc;
    }

    final /* synthetic */ zzdwk zzv() {
        return this.zzd;
    }

    final /* synthetic */ void zzw(zzdwk zzdwkVar) {
        this.zzd = zzdwkVar;
    }
}
