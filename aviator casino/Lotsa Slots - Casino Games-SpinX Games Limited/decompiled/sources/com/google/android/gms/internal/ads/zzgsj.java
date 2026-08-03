package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgsj {
    private final java.lang.String zza;

    public zzgsj(java.lang.String str) {
        int myUid = android.os.Process.myUid();
        int myPid = android.os.Process.myPid();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(myUid).length() + 15 + java.lang.String.valueOf(myPid).length() + 2);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        this.zza = sb.toString().concat(str);
    }

    private static java.lang.String zze(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = java.lang.String.format(java.util.Locale.US, str2, objArr);
            } catch (java.util.IllegalFormatException e) {
                java.lang.String.valueOf(str2);
                android.util.Log.e("PlayCore", "Unable to format ".concat(java.lang.String.valueOf(str2)), e);
                java.lang.String join = android.text.TextUtils.join(", ", objArr);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 2 + java.lang.String.valueOf(join).length() + 1);
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append(com.ironsource.X3.j.e);
                str2 = sb.toString();
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(str.length() + 3 + java.lang.String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    public final int zza(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 4)) {
            return android.util.Log.i("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzb(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 5)) {
            return android.util.Log.w("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzc(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            return android.util.Log.e("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzd(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            return android.util.Log.e("PlayCore", zze(this.zza, str, objArr), th);
        }
        return 0;
    }
}
