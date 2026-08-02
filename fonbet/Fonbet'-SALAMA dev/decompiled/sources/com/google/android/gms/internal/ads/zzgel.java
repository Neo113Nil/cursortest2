package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgel {
    public static final zzgel zza = new zzgel("SHA1");
    public static final zzgel zzb = new zzgel("SHA224");
    public static final zzgel zzc = new zzgel("SHA256");
    public static final zzgel zzd = new zzgel("SHA384");
    public static final zzgel zze = new zzgel("SHA512");
    private final String zzf;

    private zzgel(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
