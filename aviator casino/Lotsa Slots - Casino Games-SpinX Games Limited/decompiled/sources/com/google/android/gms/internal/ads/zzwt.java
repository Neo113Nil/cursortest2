package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzwt implements com.google.android.gms.internal.ads.zzze {
    private final com.google.android.gms.internal.ads.zzze zza;
    private final com.google.android.gms.internal.ads.zzgwm zzb;

    public zzwt(com.google.android.gms.internal.ads.zzze zzzeVar, java.util.List list) {
        this.zza = zzzeVar;
        this.zzb = com.google.android.gms.internal.ads.zzgwm.zzq(list);
    }

    public final com.google.android.gms.internal.ads.zzgwm zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final void zzg(long j) {
        this.zza.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final long zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final long zzl() {
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final boolean zzm(com.google.android.gms.internal.ads.zzma zzmaVar) {
        return this.zza.zzm(zzmaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final boolean zzn() {
        return this.zza.zzn();
    }
}
