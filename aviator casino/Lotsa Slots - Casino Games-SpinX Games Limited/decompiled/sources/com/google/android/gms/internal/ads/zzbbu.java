package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbbu extends com.google.android.gms.internal.ads.zzazh {
    public java.lang.Long zza;
    public java.lang.Long zzb;
    public java.lang.Long zzc;
    public java.lang.Long zzd;
    public java.lang.Long zze;
    public java.lang.Long zzf;
    public java.lang.Long zzg;
    public java.lang.Long zzh;
    public java.lang.Long zzi;
    public java.lang.Long zzj;
    public java.lang.Long zzk;

    public zzbbu() {
    }

    public zzbbu(java.lang.String str) {
        java.util.HashMap zzb = zzb(str);
        if (zzb != null) {
            this.zza = (java.lang.Long) zzb.get(0);
            this.zzb = (java.lang.Long) zzb.get(1);
            this.zzc = (java.lang.Long) zzb.get(2);
            this.zzd = (java.lang.Long) zzb.get(3);
            this.zze = (java.lang.Long) zzb.get(4);
            this.zzf = (java.lang.Long) zzb.get(5);
            this.zzg = (java.lang.Long) zzb.get(6);
            this.zzh = (java.lang.Long) zzb.get(7);
            this.zzi = (java.lang.Long) zzb.get(8);
            this.zzj = (java.lang.Long) zzb.get(9);
            this.zzk = (java.lang.Long) zzb.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazh
    protected final java.util.HashMap zza() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        hashMap.put(3, this.zzd);
        hashMap.put(4, this.zze);
        hashMap.put(5, this.zzf);
        hashMap.put(6, this.zzg);
        hashMap.put(7, this.zzh);
        hashMap.put(8, this.zzi);
        hashMap.put(9, this.zzj);
        hashMap.put(10, this.zzk);
        return hashMap;
    }
}
