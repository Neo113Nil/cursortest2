package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public abstract class zzft {
    private static final char[] zza = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int zzb = 0;

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.fido.zzft)) {
            return false;
        }
        com.google.android.gms.internal.fido.zzft zzftVar = (com.google.android.gms.internal.fido.zzft) obj;
        return zzb() == zzftVar.zzb() && zzc(zzftVar);
    }

    public final int hashCode() {
        if (zzb() >= 32) {
            return zza();
        }
        byte[] zze = zze();
        int i = zze[0] & 255;
        for (int i2 = 1; i2 < zze.length; i2++) {
            i |= (zze[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final java.lang.String toString() {
        byte[] zze = zze();
        int length = zze.length;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + length);
        for (byte b : zze) {
            char[] cArr = zza;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & com.google.common.base.Ascii.SI]);
        }
        return sb.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    abstract boolean zzc(com.google.android.gms.internal.fido.zzft zzftVar);

    public abstract byte[] zzd();

    byte[] zze() {
        throw null;
    }

    zzft() {
    }
}
