package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzaeo implements zzaej {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaeo(int i7, int i8, int i9, int i10) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
    }

    public static zzaeo zzb(zzed zzedVar) {
        int iZzi = zzedVar.zzi();
        zzedVar.zzM(8);
        int iZzi2 = zzedVar.zzi();
        int iZzi3 = zzedVar.zzi();
        zzedVar.zzM(4);
        int iZzi4 = zzedVar.zzi();
        zzedVar.zzM(12);
        return new zzaeo(iZzi, iZzi2, iZzi3, iZzi4);
    }

    @Override // com.google.android.gms.internal.ads.zzaej
    public final int zza() {
        return 1751742049;
    }
}
