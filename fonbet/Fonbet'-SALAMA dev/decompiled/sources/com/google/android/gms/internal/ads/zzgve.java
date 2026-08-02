package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgve {
    private final zzgvd zza;

    private zzgve(zzgvd zzgvdVar) {
        this.zza = zzgvdVar;
    }

    public static zzgve zzb(byte[] bArr, zzgdj zzgdjVar) {
        return new zzgve(zzgvd.zzb(bArr));
    }

    public static zzgve zzc(int i7) {
        return new zzgve(zzgvd.zzb(zzgmz.zzb(i7)));
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zzd(zzgdj zzgdjVar) {
        return this.zza.zzd();
    }
}
