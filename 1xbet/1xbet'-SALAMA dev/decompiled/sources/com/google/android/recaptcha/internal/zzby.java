package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzby extends Exception {
    private final Throwable zza;
    private final zzrh zzb;
    private final int zzc;
    private final int zzd;

    public zzby(int i7, int i8, Throwable th) {
        this.zzc = i7;
        this.zzd = i8;
        this.zza = th;
        zzrh zzrhVarZzf = zzri.zzf();
        zzrhVarZzf.zzp(i8);
        zzrhVarZzf.zzq(i7);
        this.zzb = zzrhVarZzf;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zza;
    }

    public final zzrh zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }
}
