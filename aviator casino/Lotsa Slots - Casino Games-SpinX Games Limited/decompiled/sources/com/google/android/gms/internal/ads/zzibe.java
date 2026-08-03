package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzibe {
    public static final com.google.android.gms.internal.ads.zzibe zza = new com.google.android.gms.internal.ads.zzibe("", "", false);
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final boolean zzd;

    static {
        new com.google.android.gms.internal.ads.zzibe("\n", "  ", true);
    }

    private zzibe(java.lang.String str, java.lang.String str2, boolean z) {
        java.util.Objects.requireNonNull(str, "newline == null");
        java.util.Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new java.lang.IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new java.lang.IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.zzb = str;
        this.zzc = str2;
        this.zzd = z;
    }

    public final java.lang.String zza() {
        return this.zzb;
    }

    public final java.lang.String zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }
}
