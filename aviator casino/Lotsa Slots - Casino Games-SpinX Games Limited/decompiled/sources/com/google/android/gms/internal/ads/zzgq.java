package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgq {
    private final boolean zza;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r9.zzj(8) == 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzgq(com.google.android.gms.internal.ads.zzgt zzgtVar, com.google.android.gms.internal.ads.zzgs zzgsVar) throws com.google.android.gms.internal.ads.zzgr {
        int i = zzgsVar.zza;
        boolean z = false;
        com.google.android.gms.internal.ads.zzgtj.zza(i == 6 || i == 3);
        int min = java.lang.Math.min(4, zzgsVar.zzb.remaining());
        byte[] bArr = new byte[min];
        zzgsVar.zzb.asReadOnlyBuffer().get(bArr);
        com.google.android.gms.internal.ads.zzes zzesVar = new com.google.android.gms.internal.ads.zzes(bArr, min);
        com.google.android.gms.internal.ads.zzgu.zzb(zzgtVar.zza);
        if (!zzesVar.zzi()) {
            int zzj = zzesVar.zzj(2);
            boolean zzi = zzesVar.zzi();
            com.google.android.gms.internal.ads.zzgu.zzb(zzgtVar.zzb);
            if (zzi) {
                boolean zzi2 = (zzj == 3 || zzj == 0) ? true : zzesVar.zzi();
                zzesVar.zzg();
                com.google.android.gms.internal.ads.zzgu.zzb(!zzgtVar.zzd);
                if (zzesVar.zzi()) {
                    com.google.android.gms.internal.ads.zzgu.zzb(!zzgtVar.zze);
                    zzesVar.zzg();
                }
                com.google.android.gms.internal.ads.zzgu.zzb(zzgtVar.zzc);
                if (zzj != 3) {
                    zzesVar.zzg();
                }
                zzesVar.zzh(zzgtVar.zzf);
                if (zzj != 2 && zzj != 0 && !zzi2) {
                    zzesVar.zzh(3);
                }
                if (zzj != 3) {
                    if (zzj != 0) {
                    }
                }
            }
            z = true;
        }
        this.zza = z;
    }

    public static com.google.android.gms.internal.ads.zzgq zzb(com.google.android.gms.internal.ads.zzgt zzgtVar, com.google.android.gms.internal.ads.zzgs zzgsVar) {
        try {
            return new com.google.android.gms.internal.ads.zzgq(zzgtVar, zzgsVar);
        } catch (com.google.android.gms.internal.ads.zzgr unused) {
            return null;
        }
    }

    public final boolean zza() {
        return this.zza;
    }
}
