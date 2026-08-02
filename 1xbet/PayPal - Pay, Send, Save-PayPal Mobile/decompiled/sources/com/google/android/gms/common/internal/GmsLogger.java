package com.google.android.gms.common.internal;

/* loaded from: classes.dex */
public final class GmsLogger {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    public GmsLogger(java.lang.String str) {
        this(str, null);
    }

    private final java.lang.String zza(java.lang.String str) {
        java.lang.String str2 = this.zzb;
        return str2 == null ? str : str2.concat(str);
    }

    private final java.lang.String zzb(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String str2 = this.zzb;
        java.lang.String format = java.lang.String.format(str, objArr);
        return str2 == null ? format : str2.concat(format);
    }

    public final boolean canLog(int i) {
        return android.util.Log.isLoggable(this.zza, i);
    }

    public final boolean canLogPii() {
        return false;
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        if (canLog(3)) {
            zza(str2);
        }
    }

    public final void e(java.lang.String str, java.lang.String str2) {
        if (canLog(6)) {
            zza(str2);
        }
    }

    public final void efmt(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (canLog(6)) {
            zzb(str2, objArr);
        }
    }

    public final void i(java.lang.String str, java.lang.String str2) {
        if (canLog(4)) {
            zza(str2);
        }
    }

    public final void pii(java.lang.String str, java.lang.String str2) {
    }

    public final void pii(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
    }

    public final void v(java.lang.String str, java.lang.String str2) {
        if (canLog(2)) {
            zza(str2);
        }
    }

    public final void w(java.lang.String str, java.lang.String str2) {
        if (canLog(5)) {
            zza(str2);
        }
    }

    public final void wfmt(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (canLog(5)) {
            zzb(str2, objArr);
        }
    }

    public final void wtf(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLog(7)) {
            zza(str2);
            android.util.Log.wtf(str, zza(str2), th);
        }
    }

    public GmsLogger(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "log tag cannot be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.zza = str;
        this.zzb = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public final void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLog(3)) {
            zza(str2);
        }
    }

    public final void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLog(6)) {
            zza(str2);
        }
    }

    public final void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLog(4)) {
            zza(str2);
        }
    }

    public final void v(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLog(2)) {
            zza(str2);
        }
    }

    public final void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLog(5)) {
            zza(str2);
        }
    }
}
