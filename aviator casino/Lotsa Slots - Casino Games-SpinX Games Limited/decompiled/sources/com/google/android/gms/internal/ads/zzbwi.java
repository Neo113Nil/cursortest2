package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbwi implements com.google.android.gms.ads.mediation.NativeMediationAdRequest {
    private final java.util.Date zza;
    private final int zzb;
    private final java.util.Set zzc;
    private final boolean zzd;
    private final android.location.Location zze;
    private final int zzf;
    private final com.google.android.gms.internal.ads.zzblt zzg;
    private final boolean zzi;
    private final java.util.List zzh = new java.util.ArrayList();
    private final java.util.Map zzj = new java.util.HashMap();

    public zzbwi(java.util.Date date, int i, java.util.Set set, android.location.Location location, boolean z, int i2, com.google.android.gms.internal.ads.zzblt zzbltVar, java.util.List list, boolean z2, int i3, java.lang.String str) {
        this.zza = date;
        this.zzb = i;
        this.zzc = set;
        this.zze = location;
        this.zzd = z;
        this.zzf = i2;
        this.zzg = zzbltVar;
        this.zzi = z2;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2.startsWith("custom:")) {
                    java.lang.String[] split = str2.split(":", 3);
                    if (split.length == 3) {
                        java.lang.String str3 = split[2];
                        if ("true".equals(str3)) {
                            this.zzj.put(split[1], true);
                        } else if ("false".equals(str3)) {
                            this.zzj.put(split[1], false);
                        }
                    }
                } else {
                    this.zzh.add(str2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return com.google.android.gms.ads.internal.client.zzeu.zzb().zzg();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @java.lang.Deprecated
    public final java.util.Date getBirthday() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @java.lang.Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final java.util.Set<java.lang.String> getKeywords() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final android.location.Location getLocation() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.formats.NativeAdOptions getNativeAdOptions() {
        android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzblt> creator = com.google.android.gms.internal.ads.zzblt.CREATOR;
        com.google.android.gms.ads.formats.NativeAdOptions.Builder builder = new com.google.android.gms.ads.formats.NativeAdOptions.Builder();
        com.google.android.gms.internal.ads.zzblt zzbltVar = this.zzg;
        if (zzbltVar == null) {
            return builder.build();
        }
        int i = zzbltVar.zza;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(zzbltVar.zzg);
                    builder.setMediaAspectRatio(zzbltVar.zzh);
                }
                builder.setReturnUrlsForImageAssets(zzbltVar.zzb);
                builder.setImageOrientation(zzbltVar.zzc);
                builder.setRequestMultipleImages(zzbltVar.zzd);
                return builder.build();
            }
            com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzbltVar.zzf;
            if (zzfwVar != null) {
                builder.setVideoOptions(new com.google.android.gms.ads.VideoOptions(zzfwVar));
            }
        }
        builder.setAdChoicesPlacement(zzbltVar.zze);
        builder.setReturnUrlsForImageAssets(zzbltVar.zzb);
        builder.setImageOrientation(zzbltVar.zzc);
        builder.setRequestMultipleImages(zzbltVar.zzd);
        return builder.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return com.google.android.gms.internal.ads.zzblt.zza(this.zzg);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return com.google.android.gms.ads.internal.client.zzeu.zzb().zzi();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @java.lang.Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return this.zzh.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zza() {
        return this.zzh.contains(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final java.util.Map zzb() {
        return this.zzj;
    }
}
