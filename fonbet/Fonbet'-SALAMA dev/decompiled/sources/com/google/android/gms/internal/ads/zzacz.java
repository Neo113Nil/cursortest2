package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class zzacz {
    public static int zza(zzacw zzacwVar, byte[] bArr, int i7, int i8) {
        int i9 = 0;
        while (i9 < i8) {
            int zzb = zzacwVar.zzb(bArr, i7 + i9, i8 - i9);
            if (zzb == -1) {
                break;
            }
            i9 += zzb;
        }
        return i9;
    }

    public static void zzb(boolean z4, String str) {
        if (!z4) {
            throw zzaz.zza(str, null);
        }
    }

    public static boolean zzc(zzacw zzacwVar, byte[] bArr, int i7, int i8, boolean z4) {
        try {
            return zzacwVar.zzm(bArr, 0, i8, z4);
        } catch (EOFException e7) {
            if (z4) {
                return false;
            }
            throw e7;
        }
    }

    public static boolean zzd(zzacw zzacwVar, byte[] bArr, int i7, int i8) {
        try {
            zzacwVar.zzi(bArr, i7, i8);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzacw zzacwVar, int i7) {
        try {
            zzacwVar.zzk(i7);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
