package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhe {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static com.google.android.gms.internal.ads.zzhb zzb(com.google.android.gms.internal.ads.zzet zzetVar, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzat {
        if (z) {
            zzc(3, zzetVar, false);
        }
        java.lang.String zzK = zzetVar.zzK((int) zzetVar.zzA(), java.nio.charset.StandardCharsets.UTF_8);
        int length = zzK.length();
        long zzA = zzetVar.zzA();
        java.lang.String[] strArr = new java.lang.String[(int) zzA];
        int i = length + 15;
        for (int i2 = 0; i2 < zzA; i2++) {
            java.lang.String zzK2 = zzetVar.zzK((int) zzetVar.zzA(), java.nio.charset.StandardCharsets.UTF_8);
            strArr[i2] = zzK2;
            i = i + 4 + zzK2.length();
        }
        if (z2 && (zzetVar.zzs() & 1) == 0) {
            throw com.google.android.gms.internal.ads.zzat.zzb("framing bit expected to be set", null);
        }
        return new com.google.android.gms.internal.ads.zzhb(zzK, strArr, i + 1);
    }

    public static boolean zzc(int i, com.google.android.gms.internal.ads.zzet zzetVar, boolean z) throws com.google.android.gms.internal.ads.zzat {
        if (zzetVar.zzd() < 7) {
            if (z) {
                return false;
            }
            int zzd = zzetVar.zzd();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzd).length() + 18);
            sb.append("too short header: ");
            sb.append(zzd);
            throw com.google.android.gms.internal.ads.zzat.zzb(sb.toString(), null);
        }
        if (zzetVar.zzs() != i) {
            if (z) {
                return false;
            }
            java.lang.String hexString = java.lang.Integer.toHexString(i);
            java.lang.String.valueOf(hexString);
            throw com.google.android.gms.internal.ads.zzat.zzb("expected header type ".concat(java.lang.String.valueOf(hexString)), null);
        }
        if (zzetVar.zzs() == 118 && zzetVar.zzs() == 111 && zzetVar.zzs() == 114 && zzetVar.zzs() == 98 && zzetVar.zzs() == 105 && zzetVar.zzs() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw com.google.android.gms.internal.ads.zzat.zzb("expected characters 'vorbis'", null);
    }
}
