package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzu {
    private final java.lang.String zza;

    public zzu(java.lang.String str) {
        int myUid = android.os.Process.myUid();
        int myPid = android.os.Process.myPid();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        this.zza = sb.toString().concat(str);
    }

    private static java.lang.String zzf(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = java.lang.String.format(java.util.Locale.US, str2, objArr);
            } catch (java.util.IllegalFormatException unused) {
                java.lang.String join = android.text.TextUtils.join(", ", objArr);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    public final int zza(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 3)) {
            return android.util.Log.d("PlayCore", zzf(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzb(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            return android.util.Log.e("PlayCore", zzf(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzc(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            return android.util.Log.e("PlayCore", zzf(this.zza, str, objArr), th);
        }
        return 0;
    }

    public final int zzd(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 4)) {
            return android.util.Log.i("PlayCore", zzf(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zze(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 5)) {
            return android.util.Log.w("PlayCore", zzf(this.zza, str, objArr));
        }
        return 0;
    }
}
