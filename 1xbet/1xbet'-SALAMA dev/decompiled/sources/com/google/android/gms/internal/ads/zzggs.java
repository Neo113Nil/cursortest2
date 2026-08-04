package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzggs {
    public static final zzggs zza = new zzggs("ASSUME_AES_GCM");
    public static final zzggs zzb = new zzggs("ASSUME_XCHACHA20POLY1305");
    public static final zzggs zzc = new zzggs("ASSUME_CHACHA20POLY1305");
    public static final zzggs zzd = new zzggs("ASSUME_AES_CTR_HMAC");
    public static final zzggs zze = new zzggs("ASSUME_AES_EAX");
    public static final zzggs zzf = new zzggs("ASSUME_AES_GCM_SIV");
    private final String zzg;

    private zzggs(String str) {
        this.zzg = str;
    }

    public final String toString() {
        return this.zzg;
    }
}
