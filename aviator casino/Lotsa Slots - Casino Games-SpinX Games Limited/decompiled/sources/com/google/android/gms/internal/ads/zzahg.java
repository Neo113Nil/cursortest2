package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzahg extends com.google.android.gms.internal.ads.zzagm {
    private final long zza;

    public zzahg(com.google.android.gms.internal.ads.zzafz zzafzVar, long j) {
        super(zzafzVar);
        com.google.android.gms.internal.ads.zzgtj.zza(zzafzVar.zzn() >= j);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzagm, com.google.android.gms.internal.ads.zzafz
    public final long zzm() {
        return super.zzm() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagm, com.google.android.gms.internal.ads.zzafz
    public final long zzn() {
        return super.zzn() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagm, com.google.android.gms.internal.ads.zzafz
    public final long zzo() {
        return super.zzo() - this.zza;
    }
}
