package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public abstract class zzhn {
    private static final char[] zza = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int zzb = 0;

    public final boolean equals(Object obj) {
        if (obj instanceof zzhn) {
            zzhn zzhnVar = (zzhn) obj;
            if (zzb() == zzhnVar.zzb() && zzc(zzhnVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (zzb() >= 32) {
            return zza();
        }
        byte[] zze = zze();
        int i7 = zze[0] & 255;
        for (int i8 = 1; i8 < zze.length; i8++) {
            i7 |= (zze[i8] & 255) << (i8 * 8);
        }
        return i7;
    }

    public final String toString() {
        byte[] zze = zze();
        int length = zze.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b7 : zze) {
            char[] cArr = zza;
            sb.append(cArr[(b7 >> 4) & 15]);
            sb.append(cArr[b7 & 15]);
        }
        return sb.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract boolean zzc(zzhn zzhnVar);

    public abstract byte[] zzd();

    public byte[] zze() {
        throw null;
    }
}
