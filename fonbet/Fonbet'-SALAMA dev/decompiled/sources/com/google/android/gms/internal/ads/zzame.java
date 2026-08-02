package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class zzame {
    private final zzaeb zza;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final byte[] zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;

    public zzame(zzaeb zzaebVar, boolean z4, boolean z7) {
        this.zza = zzaebVar;
        byte[] bArr = new byte[128];
        this.zzd = bArr;
        new zzfk(bArr, 0, 0);
        this.zzh = false;
    }

    private final void zzg(int i7) {
        long j = this.zzj;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z4 = this.zzk;
        long j3 = this.zzf - this.zzi;
        this.zza.zzt(j, z4 ? 1 : 0, (int) j3, i7, null);
    }

    private final void zzh() {
        boolean z4 = this.zzl;
        boolean z7 = this.zzk;
        int i7 = this.zze;
        boolean z8 = true;
        if (i7 != 5 && (!z4 || i7 != 1)) {
            z8 = false;
        }
        this.zzk = z7 | z8;
    }

    public final void zza(long j) {
        zzh();
        this.zzf = j;
        zzg(0);
        this.zzh = false;
    }

    public final void zzb(zzfh zzfhVar) {
        this.zzc.append(zzfhVar.zza, zzfhVar);
    }

    public final void zzc(zzfi zzfiVar) {
        this.zzb.append(zzfiVar.zzd, zzfiVar);
    }

    public final void zzd() {
        this.zzh = false;
    }

    public final void zze(long j, int i7, long j3, boolean z4) {
        this.zze = i7;
        this.zzg = j3;
        this.zzf = j;
        this.zzl = z4;
    }

    public final boolean zzf(long j, int i7, boolean z4) {
        if (this.zze == 9) {
            if (z4 && this.zzh) {
                zzg(i7 + ((int) (j - this.zzf)));
            }
            this.zzi = this.zzf;
            this.zzj = this.zzg;
            this.zzk = false;
            this.zzh = true;
        }
        zzh();
        return this.zzk;
    }
}
