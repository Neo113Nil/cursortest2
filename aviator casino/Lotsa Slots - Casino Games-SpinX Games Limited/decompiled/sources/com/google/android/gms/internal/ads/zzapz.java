package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzapz {
    private final com.google.android.gms.internal.ads.zzahk zza;
    private final android.util.SparseArray zzb = new android.util.SparseArray();
    private final android.util.SparseArray zzc = new android.util.SparseArray();
    private final byte[] zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;

    public zzapz(com.google.android.gms.internal.ads.zzahk zzahkVar, boolean z, boolean z2) {
        this.zza = zzahkVar;
        byte[] bArr = new byte[128];
        this.zzd = bArr;
        new com.google.android.gms.internal.ads.zzgw(bArr, 0, 0);
        this.zzh = false;
    }

    public final void zza(com.google.android.gms.internal.ads.zzgo zzgoVar) {
        this.zzb.append(zzgoVar.zzd, zzgoVar);
    }

    public final void zzb(com.google.android.gms.internal.ads.zzgn zzgnVar) {
        this.zzc.append(zzgnVar.zza, zzgnVar);
    }

    public final void zzc() {
        this.zzh = false;
    }

    public final void zzd(long j, int i, long j2, boolean z) {
        this.zze = i;
        this.zzg = j2;
        this.zzf = j;
        this.zzl = z;
    }

    public final boolean zze(long j, int i, boolean z) {
        boolean z2 = false;
        if (this.zze == 9) {
            if (z && this.zzh) {
                long j2 = this.zzf;
                int i2 = i + ((int) (j - j2));
                long j3 = this.zzj;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.zzi;
                    if (j2 != j4) {
                        this.zza.zze(j3, this.zzk ? 1 : 0, (int) (j2 - j4), i2, null);
                    }
                }
            }
            this.zzi = this.zzf;
            this.zzj = this.zzg;
            this.zzk = false;
            this.zzh = true;
        }
        boolean z3 = this.zzl;
        boolean z4 = this.zzk;
        int i3 = this.zze;
        if (i3 == 5 || (z3 && i3 == 1)) {
            z2 = true;
        }
        boolean z5 = z4 | z2;
        this.zzk = z5;
        this.zze = 24;
        return z5;
    }
}
