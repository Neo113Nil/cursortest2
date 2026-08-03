package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzazj extends com.google.android.gms.internal.ads.zzazh {
    public java.lang.String zza;
    public long zzb;
    public java.lang.String zzc;
    public java.lang.String zzd;
    public java.lang.String zze;

    public zzazj() {
        this.zza = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        this.zzb = -1L;
        this.zzc = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        this.zzd = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        this.zze = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
    }

    public zzazj(java.lang.String str) {
        java.lang.String str2 = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        this.zza = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        this.zzb = -1L;
        this.zzc = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        this.zzd = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        this.zze = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        java.util.HashMap zzb = zzb(str);
        if (zzb != null) {
            this.zza = zzb.get(0) == null ? androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST : (java.lang.String) zzb.get(0);
            this.zzb = zzb.get(1) != null ? ((java.lang.Long) zzb.get(1)).longValue() : -1L;
            this.zzc = zzb.get(2) == null ? androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST : (java.lang.String) zzb.get(2);
            this.zzd = zzb.get(3) == null ? androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST : (java.lang.String) zzb.get(3);
            this.zze = zzb.get(4) != null ? (java.lang.String) zzb.get(4) : str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazh
    protected final java.util.HashMap zza() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(4, this.zze);
        hashMap.put(3, this.zzd);
        hashMap.put(2, this.zzc);
        hashMap.put(1, java.lang.Long.valueOf(this.zzb));
        return hashMap;
    }
}
