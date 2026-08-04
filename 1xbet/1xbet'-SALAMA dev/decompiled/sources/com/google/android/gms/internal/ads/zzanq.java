package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
final class zzanq implements zzanr {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzacy zzc;
    private final zzaeb zzd;
    private final zzanu zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzed zzh;
    private final int zzi;
    private final zzz zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzanq(zzacy zzacyVar, zzaeb zzaebVar, zzanu zzanuVar) throws zzaz {
        this.zzc = zzacyVar;
        this.zzd = zzaebVar;
        this.zze = zzanuVar;
        int iMax = Math.max(1, zzanuVar.zzc / 10);
        this.zzi = iMax;
        zzed zzedVar = new zzed(zzanuVar.zzf);
        zzedVar.zzk();
        int iZzk = zzedVar.zzk();
        this.zzf = iZzk;
        int i7 = zzanuVar.zzb;
        int i8 = zzanuVar.zzd;
        int iQ = AbstractC0486a1.q(i8 - (i7 * 4), 8, zzanuVar.zze * i7, 1);
        if (iZzk != iQ) {
            throw zzaz.zza("Expected frames per block: " + iQ + "; got: " + iZzk, null);
        }
        int i9 = zzen.zza;
        int i10 = ((iMax + iZzk) - 1) / iZzk;
        this.zzg = new byte[i8 * i10];
        this.zzh = new zzed((iZzk + iZzk) * i7 * i10);
        int i11 = ((zzanuVar.zzc * zzanuVar.zzd) * 8) / iZzk;
        zzx zzxVar = new zzx();
        zzxVar.zzad("audio/raw");
        zzxVar.zzA(i11);
        zzxVar.zzY(i11);
        zzxVar.zzT((iMax + iMax) * i7);
        zzxVar.zzB(zzanuVar.zzb);
        zzxVar.zzae(zzanuVar.zzc);
        zzxVar.zzX(2);
        this.zzj = zzxVar.zzaj();
    }

    private final int zzd(int i7) {
        int i8 = this.zze.zzb;
        return i7 / (i8 + i8);
    }

    private final int zze(int i7) {
        return (i7 + i7) * this.zze.zzb;
    }

    private final void zzf(int i7) {
        long jZzu = this.zzl + zzen.zzu(this.zzn, 1000000L, this.zze.zzc, RoundingMode.DOWN);
        int iZze = zze(i7);
        this.zzd.zzt(jZzu, 1, iZze, this.zzm - iZze, null);
        this.zzn += (long) i7;
        this.zzm -= iZze;
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final void zza(int i7, long j) {
        zzanx zzanxVar = new zzanx(this.zze, this.zzf, i7, j);
        this.zzc.zzP(zzanxVar);
        this.zzd.zzm(this.zzj);
        this.zzd.zzl(zzanxVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzanr
    public final void zzb(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003f A[LOOP:0: B:6:0x0024->B:12:0x003f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:4:0x0021). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.google.android.gms.internal.ads.zzanr
    public final boolean zzc(com.google.android.gms.internal.ads.zzacw r21, long r22) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanq.zzc(com.google.android.gms.internal.ads.zzacw, long):boolean");
    }
}
