package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaid implements com.google.android.gms.internal.ads.zzafj {
    private final com.google.android.gms.internal.ads.zzagl zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzagf zzc = new com.google.android.gms.internal.ads.zzagf();

    /* synthetic */ zzaid(com.google.android.gms.internal.ads.zzagl zzaglVar, int i, byte[] bArr) {
        this.zza = zzaglVar;
        this.zzb = i;
    }

    private final long zzc(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        while (zzafzVar.zzm() < zzafzVar.zzo() - 6) {
            com.google.android.gms.internal.ads.zzagl zzaglVar = this.zza;
            int i = this.zzb;
            com.google.android.gms.internal.ads.zzagf zzagfVar = this.zzc;
            long zzm = zzafzVar.zzm();
            com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(17);
            zzafzVar.zzi(zzetVar.zzi(), 0, 2);
            if (zzetVar.zzo() != i) {
                zzafzVar.zzl();
                zzafzVar.zzk((int) (zzm - zzafzVar.zzn()));
            } else {
                zzetVar.zzf(com.google.android.gms.internal.ads.zzagc.zzb(zzafzVar, zzetVar.zzi(), 2, 15) + 2);
                zzafzVar.zzl();
                zzafzVar.zzk((int) (zzm - zzafzVar.zzn()));
                if (com.google.android.gms.internal.ads.zzagg.zza(zzetVar, zzaglVar, i, zzagfVar)) {
                    break;
                }
            }
            zzafzVar.zzk(1);
        }
        if (zzafzVar.zzm() < zzafzVar.zzo() - 6) {
            return this.zzc.zza;
        }
        zzafzVar.zzk((int) (zzafzVar.zzo() - zzafzVar.zzm()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final com.google.android.gms.internal.ads.zzafi zza(com.google.android.gms.internal.ads.zzafz zzafzVar, long j) throws java.io.IOException {
        long zzn = zzafzVar.zzn();
        long zzc = zzc(zzafzVar);
        long zzm = zzafzVar.zzm();
        zzafzVar.zzk(java.lang.Math.max(6, this.zza.zzc));
        long zzc2 = zzc(zzafzVar);
        return (zzc > j || zzc2 <= j) ? zzc2 <= j ? com.google.android.gms.internal.ads.zzafi.zzb(zzc2, zzafzVar.zzm()) : com.google.android.gms.internal.ads.zzafi.zza(zzc, zzn) : com.google.android.gms.internal.ads.zzafi.zzc(zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public /* synthetic */ void zzb() {
        com.google.android.gms.internal.ads.zzafj.CC.$default$zzb(this);
    }
}
