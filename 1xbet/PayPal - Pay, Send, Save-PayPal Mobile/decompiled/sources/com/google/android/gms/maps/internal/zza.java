package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public final class zza {
    public static byte zza(java.lang.Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    public static java.lang.Boolean zzb(byte b) {
        if (b != 0) {
            return b != 1 ? null : true;
        }
        return false;
    }
}
