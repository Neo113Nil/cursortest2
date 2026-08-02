package com.google.android.gms.common.logging;

/* loaded from: classes8.dex */
public class Logger {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.common.internal.GmsLogger zzc;
    private final int zzd;

    public Logger(java.lang.String str, java.lang.String... strArr) {
        java.lang.String obj;
        if (strArr.length == 0) {
            obj = "";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
            for (java.lang.String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            obj = sb.toString();
        }
        this.zzb = obj;
        this.zza = str;
        this.zzc = new com.google.android.gms.common.internal.GmsLogger(str);
        int i = 2;
        while (i <= 7 && !android.util.Log.isLoggable(this.zza, i)) {
            i++;
        }
        this.zzd = i;
    }

    public void d(java.lang.String str, java.lang.Object... objArr) {
        if (isLoggable(3)) {
            format(str, objArr);
        }
    }

    public void e(java.lang.String str, java.lang.Throwable th, java.lang.Object... objArr) {
        format(str, objArr);
    }

    protected java.lang.String format(java.lang.String str, java.lang.Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = java.lang.String.format(java.util.Locale.US, str, objArr);
        }
        return this.zzb.concat(str);
    }

    public void i(java.lang.String str, java.lang.Object... objArr) {
        format(str, objArr);
    }

    public void v(java.lang.String str, java.lang.Throwable th, java.lang.Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }

    public void w(java.lang.String str, java.lang.Object... objArr) {
        format(str, objArr);
    }

    public void wtf(java.lang.String str, java.lang.Throwable th, java.lang.Object... objArr) {
        android.util.Log.wtf(this.zza, format(str, objArr), th);
    }

    public void e(java.lang.String str, java.lang.Object... objArr) {
        format(str, objArr);
    }

    public void wtf(java.lang.Throwable th) {
        android.util.Log.wtf(this.zza, th);
    }

    public void v(java.lang.String str, java.lang.Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }

    public boolean isLoggable(int i) {
        return this.zzd <= i;
    }

    public java.lang.String getTag() {
        return this.zza;
    }
}
