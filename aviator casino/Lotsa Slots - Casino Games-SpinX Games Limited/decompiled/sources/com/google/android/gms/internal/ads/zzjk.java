package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzjk extends com.google.android.gms.internal.ads.zzau {
    public final int zzc;
    public final java.lang.String zzd;
    public final int zze;
    public final com.google.android.gms.internal.ads.zzv zzf;
    public final int zzg;
    public final com.google.android.gms.internal.ads.zzxk zzh;
    final boolean zzi;

    private zzjk(int i, java.lang.Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, null, false);
    }

    public static com.google.android.gms.internal.ads.zzjk zza(java.io.IOException iOException, int i) {
        return new com.google.android.gms.internal.ads.zzjk(0, iOException, i);
    }

    public static com.google.android.gms.internal.ads.zzjk zzb(java.lang.Throwable th, java.lang.String str, int i, com.google.android.gms.internal.ads.zzv zzvVar, int i2, com.google.android.gms.internal.ads.zzxk zzxkVar, boolean z, int i3) {
        return new com.google.android.gms.internal.ads.zzjk(1, th, null, i3, str, i, zzvVar, zzvVar == null ? 4 : i2, zzxkVar, z);
    }

    public static com.google.android.gms.internal.ads.zzjk zzc(java.lang.RuntimeException runtimeException, int i) {
        return new com.google.android.gms.internal.ads.zzjk(2, runtimeException, i);
    }

    final com.google.android.gms.internal.ads.zzjk zzd(com.google.android.gms.internal.ads.zzxk zzxkVar) {
        java.lang.String message = getMessage();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        return new com.google.android.gms.internal.ads.zzjk(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzxkVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzjk(int i, java.lang.Throwable th, java.lang.String str, int i2, java.lang.String str2, int i3, com.google.android.gms.internal.ads.zzv zzvVar, int i4, com.google.android.gms.internal.ads.zzxk zzxkVar, boolean z) {
        this(android.text.TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), th, i2, i, str2, i3, zzvVar, i4, zzxkVar, android.os.SystemClock.elapsedRealtime(), z);
        java.lang.String str3;
        java.lang.String str4;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = "Unexpected runtime error";
        } else {
            java.lang.String valueOf = java.lang.String.valueOf(zzvVar);
            java.lang.String str5 = com.google.android.gms.internal.ads.zzfl.zza;
            if (i4 == 0) {
                str4 = "NO";
            } else if (i4 == 1) {
                str4 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i4 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new java.lang.IllegalStateException();
                }
                str4 = "YES";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 14 + java.lang.String.valueOf(i3).length() + 9 + java.lang.String.valueOf(valueOf).length() + 19 + str4.length());
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            sb.append(valueOf);
            sb.append(", format_supported=");
            sb.append(str4);
            str3 = sb.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzjk(java.lang.String str, java.lang.Throwable th, int i, int i2, java.lang.String str2, int i3, com.google.android.gms.internal.ads.zzv zzvVar, int i4, com.google.android.gms.internal.ads.zzxk zzxkVar, long j, boolean z) {
        super(str, th, i, android.os.Bundle.EMPTY, j);
        int i5;
        boolean z2;
        if (z) {
            i5 = i2;
            if (i5 != 1) {
                z2 = false;
                com.google.android.gms.internal.ads.zzgtj.zza(z2);
                com.google.android.gms.internal.ads.zzgtj.zza(th != null);
                this.zzc = i5;
                this.zzd = str2;
                this.zze = i3;
                this.zzf = zzvVar;
                this.zzg = i4;
                this.zzh = zzxkVar;
                this.zzi = z;
            }
            i5 = 1;
        } else {
            i5 = i2;
        }
        z2 = true;
        com.google.android.gms.internal.ads.zzgtj.zza(z2);
        com.google.android.gms.internal.ads.zzgtj.zza(th != null);
        this.zzc = i5;
        this.zzd = str2;
        this.zze = i3;
        this.zzf = zzvVar;
        this.zzg = i4;
        this.zzh = zzxkVar;
        this.zzi = z;
    }
}
