package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfju {
    private final String zza;
    private final String zzb;

    private zzfju(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfju zza(String str, String str2) {
        zzflc.zzb(str, "Name is null or empty");
        zzflc.zzb(str2, "Version is null or empty");
        return new zzfju(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
