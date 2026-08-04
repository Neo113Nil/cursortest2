package com.google.android.gms.internal.ads;

import java.util.Arrays;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzaci implements zzadu {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzaci(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i7 = length - 1;
            this.zzf = jArr2[i7] + jArr3[i7];
        }
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String string = Arrays.toString(this.zzb);
        String string2 = Arrays.toString(jArr3);
        String string3 = Arrays.toString(jArr2);
        String string4 = Arrays.toString(jArr);
        StringBuilder sb = new StringBuilder("ChunkIndex(length=");
        sb.append(this.zza);
        sb.append(", sizes=");
        sb.append(string);
        sb.append(", offsets=");
        sb.append(string2);
        sb.append(", timeUs=");
        sb.append(string3);
        sb.append(", durationsUs=");
        return k.i(sb, string4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final zzads zzg(long j) {
        long[] jArr = this.zze;
        int iZzd = zzen.zzd(jArr, j, true, true);
        zzadv zzadvVar = new zzadv(jArr[iZzd], this.zzc[iZzd]);
        if (zzadvVar.zzb >= j || iZzd == this.zza - 1) {
            return new zzads(zzadvVar, zzadvVar);
        }
        int i7 = iZzd + 1;
        return new zzads(zzadvVar, new zzadv(this.zze[i7], this.zzc[i7]));
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzh() {
        return true;
    }
}
