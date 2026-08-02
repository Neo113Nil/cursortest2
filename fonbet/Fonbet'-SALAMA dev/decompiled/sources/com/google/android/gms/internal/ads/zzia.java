package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import e1.k;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzia extends zzba {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzz zzf;
    public final int zzg;
    public final zzuq zzh;
    final boolean zzi;

    private zzia(int i7, Throwable th, int i8) {
        this(i7, th, null, i8, null, -1, null, 4, null, false);
    }

    public static zzia zzb(Throwable th, String str, int i7, zzz zzzVar, int i8, zzuq zzuqVar, boolean z4, int i9) {
        return new zzia(1, th, null, i9, str, i7, zzzVar, zzzVar == null ? 4 : i8, zzuqVar, z4);
    }

    public static zzia zzc(IOException iOException, int i7) {
        return new zzia(0, iOException, i7);
    }

    public static zzia zzd(RuntimeException runtimeException, int i7) {
        return new zzia(2, runtimeException, i7);
    }

    public final zzia zza(zzuq zzuqVar) {
        String message = getMessage();
        int i7 = zzen.zza;
        return new zzia(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzuqVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzia(int i7, Throwable th, String str, int i8, String str2, int i9, zzz zzzVar, int i10, zzuq zzuqVar, boolean z4) {
        this(TextUtils.isEmpty(null) ? r0 : r0.concat(": null"), th, i8, i7, str2, i9, zzzVar, i10, zzuqVar, SystemClock.elapsedRealtime(), z4);
        String str3;
        String str4;
        if (i7 == 0) {
            str3 = "Source error";
        } else if (i7 != 1) {
            str3 = "Unexpected runtime error";
        } else {
            String valueOf = String.valueOf(zzzVar);
            int i11 = zzen.zza;
            if (i10 == 0) {
                str4 = "NO";
            } else if (i10 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i10 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i10 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i9);
            sb.append(", format=");
            sb.append(valueOf);
            str3 = k.i(sb, ", format_supported=", str4);
        }
    }

    private zzia(String str, Throwable th, int i7, int i8, String str2, int i9, zzz zzzVar, int i10, zzuq zzuqVar, long j, boolean z4) {
        super(str, th, i7, Bundle.EMPTY, j);
        int i11;
        boolean z7;
        if (z4) {
            i11 = i8;
            if (i11 == 1) {
                i11 = 1;
                z7 = true;
            } else {
                z7 = false;
            }
        } else {
            i11 = i8;
            z7 = true;
        }
        zzcv.zzd(z7);
        zzcv.zzd(th != null);
        this.zzc = i11;
        this.zzd = str2;
        this.zze = i9;
        this.zzf = zzzVar;
        this.zzg = i10;
        this.zzh = zzuqVar;
        this.zzi = z4;
    }
}
