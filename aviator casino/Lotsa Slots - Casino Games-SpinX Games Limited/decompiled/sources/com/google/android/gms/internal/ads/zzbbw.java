package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbbw extends com.google.android.gms.internal.ads.zzazh {
    public java.lang.Long zza;
    public java.lang.Long zzb;
    public java.lang.Long zzc;
    public java.lang.Long zzd;
    public java.lang.Long zze;

    public zzbbw() {
    }

    public zzbbw(java.lang.String str) {
        java.util.HashMap zzb = zzb(str);
        if (zzb != null) {
            this.zza = (java.lang.Long) zzb.get(0);
            this.zzb = (java.lang.Long) zzb.get(1);
            this.zzc = (java.lang.Long) zzb.get(2);
            this.zzd = (java.lang.Long) zzb.get(3);
            this.zze = (java.lang.Long) zzb.get(4);
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
        return hashMap;
    }
}
