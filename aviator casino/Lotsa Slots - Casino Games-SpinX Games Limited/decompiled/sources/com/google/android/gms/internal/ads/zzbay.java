package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbay extends com.google.android.gms.internal.ads.zzazh {
    public long zza;
    public long zzb;

    public zzbay() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    public zzbay(java.lang.String str) {
        this.zza = -1L;
        this.zzb = -1L;
        java.util.HashMap zzb = zzb(str);
        if (zzb != null) {
            this.zza = ((java.lang.Long) zzb.get(0)).longValue();
            this.zzb = ((java.lang.Long) zzb.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazh
    protected final java.util.HashMap zza() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(0, java.lang.Long.valueOf(this.zza));
        hashMap.put(1, java.lang.Long.valueOf(this.zzb));
        return hashMap;
    }
}
