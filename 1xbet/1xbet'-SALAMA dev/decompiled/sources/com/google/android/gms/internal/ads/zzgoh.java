package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgoh {
    public static final zzgoh zza = new zzgoh("SHA1");
    public static final zzgoh zzb = new zzgoh("SHA224");
    public static final zzgoh zzc = new zzgoh("SHA256");
    public static final zzgoh zzd = new zzgoh("SHA384");
    public static final zzgoh zze = new zzgoh("SHA512");
    private final String zzf;

    private zzgoh(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
