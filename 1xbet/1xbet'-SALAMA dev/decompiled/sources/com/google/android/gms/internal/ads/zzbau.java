package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class zzbau {
    private final InputStream zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    private zzbau(InputStream inputStream, boolean z4, boolean z7, long j, boolean z8) {
        this.zza = inputStream;
        this.zzb = z4;
        this.zzc = z7;
        this.zzd = j;
        this.zze = z8;
    }

    public static zzbau zzb(InputStream inputStream, boolean z4, boolean z7, long j, boolean z8) {
        return new zzbau(inputStream, z4, z7, j, z8);
    }

    public final long zza() {
        return this.zzd;
    }

    public final InputStream zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzb;
    }

    public final boolean zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return this.zzc;
    }
}
