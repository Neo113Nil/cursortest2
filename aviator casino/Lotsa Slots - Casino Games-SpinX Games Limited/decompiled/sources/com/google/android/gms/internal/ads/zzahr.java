package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzahr implements com.google.android.gms.internal.ads.zzahb {
    final /* synthetic */ com.google.android.gms.internal.ads.zzaht zza;
    private final long zzb;

    public zzahr(com.google.android.gms.internal.ads.zzaht zzahtVar, long j) {
        java.util.Objects.requireNonNull(zzahtVar);
        this.zza = zzahtVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final com.google.android.gms.internal.ads.zzagz zzc(long j) {
        com.google.android.gms.internal.ads.zzaht zzahtVar = this.zza;
        com.google.android.gms.internal.ads.zzagz zzg = zzahtVar.zzh()[0].zzg(j);
        for (int i = 1; i < zzahtVar.zzh().length; i++) {
            com.google.android.gms.internal.ads.zzagz zzg2 = zzahtVar.zzh()[i].zzg(j);
            if (zzg2.zza.zzc < zzg.zza.zzc) {
                zzg = zzg2;
            }
        }
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ boolean zzj() {
        return com.google.android.gms.internal.ads.zzahb.CC.$default$zzj(this);
    }
}
