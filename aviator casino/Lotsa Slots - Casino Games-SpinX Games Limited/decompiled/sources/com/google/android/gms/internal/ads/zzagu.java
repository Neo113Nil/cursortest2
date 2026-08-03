package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzagu implements com.google.android.gms.internal.ads.zzahb {
    private final com.google.android.gms.internal.ads.zzeh zza;
    private final com.google.android.gms.internal.ads.zzeh zzb;
    private long zzc;

    public zzagu(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        com.google.android.gms.internal.ads.zzgtj.zza(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new com.google.android.gms.internal.ads.zzeh(length2);
            this.zzb = new com.google.android.gms.internal.ads.zzeh(length2);
        } else {
            int i = length2 + 1;
            com.google.android.gms.internal.ads.zzeh zzehVar = new com.google.android.gms.internal.ads.zzeh(i);
            this.zza = zzehVar;
            com.google.android.gms.internal.ads.zzeh zzehVar2 = new com.google.android.gms.internal.ads.zzeh(i);
            this.zzb = zzehVar2;
            zzehVar.zza(0L);
            zzehVar2.zza(0L);
        }
        this.zza.zzb(jArr);
        this.zzb.zzb(jArr2);
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return this.zzb.zzd() > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final com.google.android.gms.internal.ads.zzagz zzc(long j) {
        com.google.android.gms.internal.ads.zzeh zzehVar = this.zzb;
        if (zzehVar.zzd() == 0) {
            com.google.android.gms.internal.ads.zzahc zzahcVar = com.google.android.gms.internal.ads.zzahc.zza;
            return new com.google.android.gms.internal.ads.zzagz(zzahcVar, zzahcVar);
        }
        int zzp = com.google.android.gms.internal.ads.zzfl.zzp(zzehVar, j, true, true);
        long zzc = zzehVar.zzc(zzp);
        com.google.android.gms.internal.ads.zzeh zzehVar2 = this.zza;
        com.google.android.gms.internal.ads.zzahc zzahcVar2 = new com.google.android.gms.internal.ads.zzahc(zzc, zzehVar2.zzc(zzp));
        if (zzahcVar2.zzb == j || zzp == zzehVar.zzd() - 1) {
            return new com.google.android.gms.internal.ads.zzagz(zzahcVar2, zzahcVar2);
        }
        int i = zzp + 1;
        return new com.google.android.gms.internal.ads.zzagz(zzahcVar2, new com.google.android.gms.internal.ads.zzahc(zzehVar.zzc(i), zzehVar2.zzc(i)));
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ boolean zzj() {
        return com.google.android.gms.internal.ads.zzahb.CC.$default$zzj(this);
    }
}
