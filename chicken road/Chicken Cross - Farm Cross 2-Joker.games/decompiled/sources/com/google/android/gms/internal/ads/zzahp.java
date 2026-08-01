package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzahp extends zzagv {
    private final long zza;

    public zzahp(zzagi zzagiVar, long j) {
        super(zzagiVar);
        zzguk.zza(zzagiVar.zzn() >= j);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzagv, com.google.android.gms.internal.ads.zzagi
    public final long zzm() {
        return super.zzm() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagv, com.google.android.gms.internal.ads.zzagi
    public final long zzn() {
        return super.zzn() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagv, com.google.android.gms.internal.ads.zzagi
    public final long zzo() {
        return super.zzo() - this.zza;
    }
}
