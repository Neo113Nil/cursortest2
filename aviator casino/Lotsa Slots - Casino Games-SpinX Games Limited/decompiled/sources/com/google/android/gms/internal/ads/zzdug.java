package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdug extends com.google.android.gms.internal.ads.zzbmu {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdpt zzb;
    private com.google.android.gms.internal.ads.zzdqs zzc;
    private com.google.android.gms.internal.ads.zzdpo zzd;

    public zzdug(android.content.Context context, com.google.android.gms.internal.ads.zzdpt zzdptVar, com.google.android.gms.internal.ads.zzdqs zzdqsVar, com.google.android.gms.internal.ads.zzdpo zzdpoVar) {
        this.zza = context;
        this.zzb = zzdptVar;
        this.zzc = zzdqsVar;
        this.zzd = zzdpoVar;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdpo zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final java.lang.String zze(java.lang.String str) {
        return (java.lang.String) this.zzb.zzad().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final com.google.android.gms.internal.ads.zzbme zzf(java.lang.String str) {
        return (com.google.android.gms.internal.ads.zzbme) this.zzb.zzaa().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final java.util.List zzg() {
        try {
            com.google.android.gms.internal.ads.zzdpt zzdptVar = this.zzb;
            androidx.collection.SimpleArrayMap zzaa = zzdptVar.zzaa();
            androidx.collection.SimpleArrayMap zzad = zzdptVar.zzad();
            java.lang.String[] strArr = new java.lang.String[zzaa.getSize() + zzad.getSize()];
            int i = 0;
            for (int i2 = 0; i2 < zzaa.getSize(); i2++) {
                strArr[i] = (java.lang.String) zzaa.keyAt(i2);
                i++;
            }
            for (int i3 = 0; i3 < zzad.getSize(); i3++) {
                strArr[i] = (java.lang.String) zzad.keyAt(i3);
                i++;
            }
            return java.util.Arrays.asList(strArr);
        } catch (java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new java.util.ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final java.lang.String zzh() {
        return this.zzb.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzi(java.lang.String str) {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzd;
        if (zzdpoVar != null) {
            zzdpoVar.zza(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzj() {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzd;
        if (zzdpoVar != null) {
            zzdpoVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final com.google.android.gms.ads.internal.client.zzea zzk() {
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzl() {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzd;
        if (zzdpoVar != null) {
            zzdpoVar.zzd();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final com.google.android.gms.dynamic.IObjectWrapper zzm() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final boolean zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        com.google.android.gms.internal.ads.zzdqs zzdqsVar;
        java.lang.Object unwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof android.view.ViewGroup) || (zzdqsVar = this.zzc) == null || !zzdqsVar.zzd((android.view.ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzT().zzaq(new com.google.android.gms.internal.ads.zzduf(this, com.google.android.gms.ads.nativead.NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final boolean zzo() {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzd;
        if (zzdpoVar != null && !zzdpoVar.zzM()) {
            return false;
        }
        com.google.android.gms.internal.ads.zzdpt zzdptVar = this.zzb;
        return zzdptVar.zzW() != null && zzdptVar.zzT() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final boolean zzp() {
        com.google.android.gms.internal.ads.zzdpt zzdptVar = this.zzb;
        com.google.android.gms.internal.ads.zzeln zzZ = zzdptVar.zzZ();
        if (zzZ == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zze(zzZ.zza());
        if (zzdptVar.zzW() == null) {
            return true;
        }
        zzdptVar.zzW().zze("onSdkLoaded", new androidx.collection.ArrayMap());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzq(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar;
        java.lang.Object unwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof android.view.View) || this.zzb.zzZ() == null || (zzdpoVar = this.zzd) == null) {
            return;
        }
        zzdpoVar.zzN((android.view.View) unwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzr() {
        try {
            java.lang.String zzac = this.zzb.zzac();
            if (java.util.Objects.equals(zzac, "Google")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Illegal argument specified for omid partner name.");
            } else if (android.text.TextUtils.isEmpty(zzac)) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not starting OMID session. OM partner name has not been configured.");
            } else {
                com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzd;
                if (zzdpoVar != null) {
                    zzdpoVar.zzL(zzac, false);
                }
            }
        } catch (java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final com.google.android.gms.internal.ads.zzbmb zzs() throws android.os.RemoteException {
        try {
            return this.zzd.zzP().zza();
        } catch (java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final boolean zzt(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        com.google.android.gms.internal.ads.zzdqs zzdqsVar;
        java.lang.Object unwrap = com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof android.view.ViewGroup) || (zzdqsVar = this.zzc) == null || !zzdqsVar.zze((android.view.ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzU().zzaq(new com.google.android.gms.internal.ads.zzduf(this, com.google.android.gms.ads.nativead.NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }
}
