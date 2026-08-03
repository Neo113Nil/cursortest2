package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzaha implements com.google.android.gms.internal.ads.zzahb {
    private final long zza;
    private final com.google.android.gms.internal.ads.zzagz zzb;

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final com.google.android.gms.internal.ads.zzagz zzc(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ boolean zzj() {
        return com.google.android.gms.internal.ads.zzahb.CC.$default$zzj(this);
    }

    public zzaha(long j, long j2) {
        this.zza = j;
        com.google.android.gms.internal.ads.zzahc zzahcVar = j2 == 0 ? com.google.android.gms.internal.ads.zzahc.zza : new com.google.android.gms.internal.ads.zzahc(0L, j2);
        this.zzb = new com.google.android.gms.internal.ads.zzagz(zzahcVar, zzahcVar);
    }
}
