package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcck {
    private final java.lang.String[] zza;

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int zza = zza();
        for (int i = 0; i < zza; i++) {
            sb.append(zzb(i));
            sb.append(": ");
            sb.append(zzc(i));
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        return sb.toString();
    }

    public final int zza() {
        return this.zza.length >> 1;
    }

    public final java.lang.String zzb(int i) {
        int i2 = i + i;
        if (i2 < 0) {
            return null;
        }
        java.lang.String[] strArr = this.zza;
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        return null;
    }

    public final java.lang.String zzc(int i) {
        int i2 = i + i + 1;
        if (i2 < 0) {
            return null;
        }
        java.lang.String[] strArr = this.zza;
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        return null;
    }
}
