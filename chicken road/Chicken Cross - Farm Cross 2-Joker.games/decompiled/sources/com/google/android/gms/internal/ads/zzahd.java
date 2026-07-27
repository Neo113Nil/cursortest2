package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzahd implements zzahk {
    private final zzei zza;
    private final zzei zzb;
    private long zzc;

    public zzahd(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzguk.zza(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new zzei(length2);
            this.zzb = new zzei(length2);
        } else {
            int i = length2 + 1;
            zzei zzeiVar = new zzei(i);
            this.zza = zzeiVar;
            zzei zzeiVar2 = new zzei(i);
            this.zzb = zzeiVar2;
            zzeiVar.zza(0L);
            zzeiVar2.zza(0L);
        }
        this.zza.zzb(jArr);
        this.zzb.zzb(jArr2);
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return this.zzb.zzd() > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j) {
        zzei zzeiVar = this.zzb;
        if (zzeiVar.zzd() == 0) {
            zzahl zzahlVar = zzahl.zza;
            return new zzahi(zzahlVar, zzahlVar);
        }
        int zzp = zzfm.zzp(zzeiVar, j, true, true);
        long zzc = zzeiVar.zzc(zzp);
        zzei zzeiVar2 = this.zza;
        zzahl zzahlVar2 = new zzahl(zzc, zzeiVar2.zzc(zzp));
        if (zzahlVar2.zzb == j || zzp == zzeiVar.zzd() - 1) {
            return new zzahi(zzahlVar2, zzahlVar2);
        }
        int i = zzp + 1;
        return new zzahi(zzahlVar2, new zzahl(zzeiVar.zzc(i), zzeiVar2.zzc(i)));
    }
}
