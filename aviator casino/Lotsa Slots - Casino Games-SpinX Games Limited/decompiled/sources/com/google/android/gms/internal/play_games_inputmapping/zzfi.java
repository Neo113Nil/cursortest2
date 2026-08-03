package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzfi {
    static final java.nio.charset.Charset zza = java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.ASCII_NAME);
    static final java.nio.charset.Charset zzb = java.nio.charset.Charset.forName("UTF-8");
    static final java.nio.charset.Charset zzc = java.nio.charset.Charset.forName(com.google.android.exoplayer2.C.ISO88591_NAME);
    public static final byte[] zzd;
    public static final java.nio.ByteBuffer zze;
    public static final com.google.android.gms.internal.play_games_inputmapping.zzem zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = java.nio.ByteBuffer.wrap(bArr);
        int i = com.google.android.gms.internal.play_games_inputmapping.zzem.zza;
        com.google.android.gms.internal.play_games_inputmapping.zzel zzelVar = new com.google.android.gms.internal.play_games_inputmapping.zzel(bArr, 0, 0, false, null);
        try {
            zzelVar.zza(0);
            zzf = zzelVar;
        } catch (com.google.android.gms.internal.play_games_inputmapping.zzfk e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    static java.lang.Object zza(java.lang.Object obj) {
        obj.getClass();
        return obj;
    }

    static java.lang.Object zzb(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static boolean zzc(byte[] bArr) {
        return com.google.android.gms.internal.play_games_inputmapping.zzhr.zza(bArr);
    }

    public static java.lang.String zzd(byte[] bArr) {
        return new java.lang.String(bArr, zzb);
    }

    public static int zze(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int zzf(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzg(byte[] bArr) {
        int length = bArr.length;
        int zzh = zzh(length, bArr, 0, length);
        if (zzh == 0) {
            return 1;
        }
        return zzh;
    }

    static int zzh(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static java.lang.Object zzi(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.gms.internal.play_games_inputmapping.zzge) obj).zzv().zzf((com.google.android.gms.internal.play_games_inputmapping.zzge) obj2).zzl();
    }
}
