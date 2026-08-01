package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfwa {
    private final String zza;
    private final String zzb;

    private zzfwa(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfwa zza(String str, String str2) {
        zzfxk.zzc(str, "Name is null or empty");
        zzfxk.zzc(str2, "Version is null or empty");
        return new zzfwa(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
