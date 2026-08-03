package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdpq {
    private com.google.android.gms.internal.ads.zzbmb zza;

    public zzdpq(com.google.android.gms.internal.ads.zzdpb zzdpbVar) {
        this.zza = zzdpbVar;
    }

    public final synchronized com.google.android.gms.internal.ads.zzbmb zza() {
        return this.zza;
    }

    public final synchronized void zzb(com.google.android.gms.internal.ads.zzbmb zzbmbVar) {
        this.zza = zzbmbVar;
    }
}
