package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzagj implements com.google.android.gms.internal.ads.zzahb {
    private final com.google.android.gms.internal.ads.zzagl zza;
    private final long zzb;

    public zzagj(com.google.android.gms.internal.ads.zzagl zzaglVar, long j) {
        this.zza = zzaglVar;
        this.zzb = j;
    }

    private final com.google.android.gms.internal.ads.zzahc zze(long j, long j2) {
        return new com.google.android.gms.internal.ads.zzahc((j * 1000000) / this.zza.zze, this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final com.google.android.gms.internal.ads.zzagz zzc(long j) {
        com.google.android.gms.internal.ads.zzagl zzaglVar = this.zza;
        com.google.android.gms.internal.ads.zzagk zzagkVar = zzaglVar.zzk;
        zzagkVar.getClass();
        long zzb = zzaglVar.zzb(j);
        long[] jArr = zzagkVar.zza;
        int zzo = com.google.android.gms.internal.ads.zzfl.zzo(jArr, zzb, true, false);
        long j2 = zzo == -1 ? 0L : jArr[zzo];
        long[] jArr2 = zzagkVar.zzb;
        com.google.android.gms.internal.ads.zzahc zze = zze(j2, zzo != -1 ? jArr2[zzo] : 0L);
        if (zze.zzb == j || zzo == jArr.length - 1) {
            return new com.google.android.gms.internal.ads.zzagz(zze, zze);
        }
        int i = zzo + 1;
        return new com.google.android.gms.internal.ads.zzagz(zze, zze(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ boolean zzj() {
        return com.google.android.gms.internal.ads.zzahb.CC.$default$zzj(this);
    }
}
