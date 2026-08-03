package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbat extends com.google.android.gms.internal.ads.zzazh {
    public java.lang.Long zza;
    public java.lang.Long zzb;
    public java.lang.Long zzc;

    public zzbat() {
    }

    public zzbat(java.lang.String str) {
        java.util.HashMap zzb = zzb(str);
        if (zzb != null) {
            this.zza = (java.lang.Long) zzb.get(0);
            this.zzb = (java.lang.Long) zzb.get(1);
            this.zzc = (java.lang.Long) zzb.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazh
    protected final java.util.HashMap zza() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        return hashMap;
    }
}
