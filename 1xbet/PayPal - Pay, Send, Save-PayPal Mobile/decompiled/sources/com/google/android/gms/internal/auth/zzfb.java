package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public final class zzfb extends java.io.IOException {
    private com.google.android.gms.internal.auth.zzfx zza;

    public zzfb(java.io.IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    static com.google.android.gms.internal.auth.zzfb zza() {
        return new com.google.android.gms.internal.auth.zzfb("Protocol message contained an invalid tag (zero).");
    }

    static com.google.android.gms.internal.auth.zzfb zzb() {
        return new com.google.android.gms.internal.auth.zzfb("Protocol message had invalid UTF-8.");
    }

    static com.google.android.gms.internal.auth.zzfb zzc() {
        return new com.google.android.gms.internal.auth.zzfb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static com.google.android.gms.internal.auth.zzfb zzd() {
        return new com.google.android.gms.internal.auth.zzfb("Failed to parse the message.");
    }

    static com.google.android.gms.internal.auth.zzfb zzf() {
        return new com.google.android.gms.internal.auth.zzfb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public zzfb(java.lang.String str) {
        super(str);
        this.zza = null;
    }

    public final com.google.android.gms.internal.auth.zzfb zze(com.google.android.gms.internal.auth.zzfx zzfxVar) {
        this.zza = zzfxVar;
        return this;
    }
}
