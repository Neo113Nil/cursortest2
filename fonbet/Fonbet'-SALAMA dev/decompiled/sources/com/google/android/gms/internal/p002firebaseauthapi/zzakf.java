package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzakf extends IOException {
    private boolean zza;

    public zzakf(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static zzake zza() {
        return new zzake("Protocol message tag had invalid wire type.");
    }

    public static zzakf zzb() {
        return new zzakf("Protocol message end-group tag did not match expected tag.");
    }

    public static zzakf zzc() {
        return new zzakf("Protocol message contained an invalid tag (zero).");
    }

    public static zzakf zzd() {
        return new zzakf("Protocol message had invalid UTF-8.");
    }

    public static zzakf zze() {
        return new zzakf("CodedInputStream encountered a malformed varint.");
    }

    public static zzakf zzf() {
        return new zzakf("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzakf zzg() {
        return new zzakf("Failed to parse the message.");
    }

    public static zzakf zzh() {
        return new zzakf("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static zzakf zzi() {
        return new zzakf("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static zzakf zzj() {
        return new zzakf("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void zzk() {
        this.zza = true;
    }

    public final boolean zzl() {
        return this.zza;
    }

    public zzakf(String str) {
        super(str);
    }
}
