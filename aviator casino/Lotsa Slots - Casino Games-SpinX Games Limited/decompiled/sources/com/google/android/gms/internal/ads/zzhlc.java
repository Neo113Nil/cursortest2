package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhlc {
    private static final com.google.android.gms.internal.ads.zzhkx zzb = new com.google.android.gms.internal.ads.zzhkx(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final com.google.android.gms.internal.ads.zzhkz zzc = new com.google.android.gms.internal.ads.zzhkz(new com.google.android.gms.internal.ads.zzhla(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] zza = {-19, -45, -11, 92, com.google.common.base.Ascii.SUB, 99, com.google.common.base.Ascii.DC2, 88, -42, -100, -9, -94, -34, -7, -34, com.google.common.base.Ascii.DC4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, com.google.common.base.Ascii.DLE};

    public static byte[] zza(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 + i2;
            bArr2[i3] = (byte) (bArr[i2] & com.google.common.base.Ascii.SI);
            bArr2[i3 + 1] = (byte) ((bArr[i2] & 255) >> 4);
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 63) {
            byte b = (byte) (bArr2[i4] + i5);
            bArr2[i4] = b;
            int i6 = (b + 8) >> 4;
            bArr2[i4] = (byte) (b - (i6 << 4));
            i4++;
            i5 = i6;
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        com.google.android.gms.internal.ads.zzhkz zzhkzVar = new com.google.android.gms.internal.ads.zzhkz(zzc);
        com.google.android.gms.internal.ads.zzhlb zzhlbVar = new com.google.android.gms.internal.ads.zzhlb();
        for (i = 1; i < 64; i += 2) {
            com.google.android.gms.internal.ads.zzhkx zzhkxVar = new com.google.android.gms.internal.ads.zzhkx(zzb);
            zzk(zzhkxVar, i / 2, bArr2[i]);
            com.google.android.gms.internal.ads.zzhlb.zza(zzhlbVar, zzhkzVar);
            zzg(zzhkzVar, zzhlbVar, zzhkxVar);
        }
        com.google.android.gms.internal.ads.zzhla zzhlaVar = new com.google.android.gms.internal.ads.zzhla();
        com.google.android.gms.internal.ads.zzhla.zza(zzhlaVar, zzhkzVar);
        zzi(zzhkzVar, zzhlaVar);
        com.google.android.gms.internal.ads.zzhla.zza(zzhlaVar, zzhkzVar);
        zzi(zzhkzVar, zzhlaVar);
        com.google.android.gms.internal.ads.zzhla.zza(zzhlaVar, zzhkzVar);
        zzi(zzhkzVar, zzhlaVar);
        com.google.android.gms.internal.ads.zzhla.zza(zzhlaVar, zzhkzVar);
        zzi(zzhkzVar, zzhlaVar);
        for (int i7 = 0; i7 < 64; i7 += 2) {
            com.google.android.gms.internal.ads.zzhkx zzhkxVar2 = new com.google.android.gms.internal.ads.zzhkx(zzb);
            zzk(zzhkxVar2, i7 / 2, bArr2[i7]);
            com.google.android.gms.internal.ads.zzhlb.zza(zzhlbVar, zzhkzVar);
            zzg(zzhkzVar, zzhlbVar, zzhkxVar2);
        }
        com.google.android.gms.internal.ads.zzhla zzhlaVar2 = new com.google.android.gms.internal.ads.zzhla(zzhkzVar);
        long[] jArr = new long[10];
        com.google.android.gms.internal.ads.zzhlj.zzf(jArr, zzhlaVar2.zza);
        long[] jArr2 = new long[10];
        com.google.android.gms.internal.ads.zzhlj.zzf(jArr2, zzhlaVar2.zzb);
        long[] jArr3 = new long[10];
        com.google.android.gms.internal.ads.zzhlj.zzf(jArr3, zzhlaVar2.zzc);
        long[] jArr4 = new long[10];
        com.google.android.gms.internal.ads.zzhlj.zzf(jArr4, jArr3);
        long[] jArr5 = new long[10];
        com.google.android.gms.internal.ads.zzhlj.zzb(jArr5, jArr2, jArr);
        com.google.android.gms.internal.ads.zzhlj.zze(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        com.google.android.gms.internal.ads.zzhlj.zze(jArr6, jArr, jArr2);
        com.google.android.gms.internal.ads.zzhlj.zze(jArr6, jArr6, com.google.android.gms.internal.ads.zzhle.zza);
        com.google.android.gms.internal.ads.zzhlj.zza(jArr6, jArr6, jArr4);
        com.google.android.gms.internal.ads.zzhlj.zzc(jArr6, jArr6);
        if (java.security.MessageDigest.isEqual(com.google.android.gms.internal.ads.zzhlj.zzh(jArr5), com.google.android.gms.internal.ads.zzhlj.zzh(jArr6))) {
            return zzhlaVar2.zzb();
        }
        throw new java.lang.IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] zzb(byte[] bArr) throws java.security.GeneralSecurityException {
        java.security.MessageDigest messageDigest = (java.security.MessageDigest) com.google.android.gms.internal.ads.zzhzz.zzd.zzb("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] digest = messageDigest.digest();
        digest[0] = (byte) (digest[0] & 248);
        int i = digest[31] & Byte.MAX_VALUE;
        digest[31] = (byte) i;
        digest[31] = (byte) (i | 64);
        return digest;
    }

    public static boolean zzc(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        char c;
        byte b;
        int i;
        byte b2;
        byte[] bArr4 = bArr2;
        int i2 = 0;
        if (bArr4.length != 64) {
            return false;
        }
        byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr4, 32, 64);
        int i3 = 31;
        int i4 = 31;
        while (i4 >= 0) {
            int i5 = copyOfRange[i4] & 255;
            int i6 = zza[i4] & 255;
            if (i5 != i6) {
                if (i5 >= i6) {
                    return false;
                }
                java.security.MessageDigest messageDigest = (java.security.MessageDigest) com.google.android.gms.internal.ads.zzhzz.zzd.zzb("SHA-512");
                messageDigest.update(bArr4, i2, 32);
                messageDigest.update(bArr3);
                messageDigest.update(bArr);
                byte[] digest = messageDigest.digest();
                long zzn = zzn(digest, i2) & 2097151;
                long zzo = zzo(digest, 2) >> 5;
                long zzn2 = zzn(digest, 5) >> 2;
                long zzo2 = zzo(digest, 7) >> 7;
                long zzo3 = zzo(digest, 10) >> 4;
                long zzn3 = zzn(digest, 13) >> 1;
                long zzo4 = zzo(digest, 15) >> 6;
                long zzn4 = zzn(digest, 18) >> 3;
                long zzn5 = zzn(digest, 21) & 2097151;
                long zzo5 = zzo(digest, 23) >> 5;
                long zzn6 = zzn(digest, 26) >> 2;
                long zzo6 = zzo(digest, 28) >> 7;
                long zzo7 = zzo(digest, i3) >> 4;
                long zzn7 = zzn(digest, 34) >> 1;
                long zzo8 = zzo(digest, 36) >> 6;
                long zzn8 = zzn(digest, 39) >> 3;
                long zzn9 = zzn(digest, 42) & 2097151;
                long zzo9 = zzo(digest, 44) >> 5;
                long zzn10 = (zzn(digest, 47) >> 2) & 2097151;
                long zzo10 = (zzo(digest, 49) >> 7) & 2097151;
                long zzo11 = (zzo(digest, 52) >> 4) & 2097151;
                long zzn11 = (zzn(digest, 55) >> 1) & 2097151;
                long zzo12 = (zzo(digest, 57) >> 6) & 2097151;
                long zzo13 = zzo(digest, 60) >> 3;
                long j = (zzo4 & 2097151) + (zzn10 * 666643);
                long j2 = (j + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j3 = j2 << 21;
                long j4 = zzn5 + (zzo11 * 666643) + (zzo10 * 470296) + (zzn10 * 654183);
                long j5 = (j4 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j6 = j5 << 21;
                long j7 = (((((zzn6 & 2097151) + (zzo12 * 666643)) + (zzn11 * 470296)) + (zzo11 * 654183)) - (zzo10 * 997805)) + (zzn10 * 136657);
                long j8 = (j7 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j9 = j8 << 21;
                long j10 = (((((zzo7 & 2097151) + (zzo13 * 470296)) + (zzo12 * 654183)) - (zzn11 * 997805)) + (zzo11 * 136657)) - (zzo10 * 683901);
                long j11 = (j10 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j12 = (((zzo8 & 2097151) - (zzo13 * 997805)) + (zzo12 * 136657)) - (zzn11 * 683901);
                long j13 = (j12 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j14 = zzn9 - (zzo13 * 683901);
                long j15 = (j14 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j16 = zzn4 + (zzo10 * 666643) + (zzn10 * 470296) + j2;
                long j17 = (j16 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j18 = j17 << 21;
                long j19 = (((((zzo5 & 2097151) + (zzn11 * 666643)) + (zzo11 * 470296)) + (zzo10 * 654183)) - (zzn10 * 997805)) + j5;
                long j20 = (j19 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j21 = j20 << 21;
                long j22 = (((((((zzo6 & 2097151) + (zzo13 * 666643)) + (zzo12 * 470296)) + (zzn11 * 654183)) - (zzo11 * 997805)) + (zzo10 * 136657)) - (zzn10 * 683901)) + j8;
                long j23 = (j22 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j24 = j23 << 21;
                long j25 = (((((zzn7 & 2097151) + (zzo13 * 654183)) - (zzo12 * 997805)) + (zzn11 * 136657)) - (zzo11 * 683901)) + j11;
                long j26 = (j25 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j27 = ((zzn8 + (zzo13 * 136657)) - (zzo12 * 683901)) + j13;
                long j28 = (j27 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j29 = (j10 - (j11 << 21)) + j23;
                long j30 = zzn + (j29 * 666643);
                long j31 = (j30 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j32 = j31 << 21;
                long j33 = (j12 - (j13 << 21)) + j26;
                long j34 = j25 - (j26 << 21);
                long j35 = (zzn2 & 2097151) + (j33 * 666643) + (j34 * 470296) + (j29 * 654183);
                long j36 = (j35 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j37 = j36 << 21;
                long j38 = (j14 - (j15 << 21)) + j28;
                long j39 = j27 - (j28 << 21);
                long j40 = (((((zzo3 & 2097151) + (j38 * 666643)) + (j39 * 470296)) + (j33 * 654183)) - (j34 * 997805)) + (j29 * 136657);
                long j41 = (j40 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j42 = j41 << 21;
                long j43 = (zzo9 & 2097151) + j15;
                long j44 = (((((j - j3) + (j43 * 470296)) + (j38 * 654183)) - (j39 * 997805)) + (j33 * 136657)) - (j34 * 683901);
                long j45 = (j44 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j46 = j45 << 21;
                long j47 = ((((j4 - j6) + j17) - (j43 * 997805)) + (j38 * 136657)) - (j39 * 683901);
                long j48 = (j47 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j49 = j48 << 21;
                long j50 = ((j7 - j9) + j20) - (j43 * 683901);
                long j51 = (j50 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j52 = (zzo & 2097151) + (j34 * 666643) + (j29 * 470296) + j31;
                long j53 = (j52 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j54 = (((((zzo2 & 2097151) + (j39 * 666643)) + (j33 * 470296)) + (j34 * 654183)) - (j29 * 997805)) + j36;
                long j55 = (j54 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j56 = (((((((zzn3 & 2097151) + (j43 * 666643)) + (j38 * 470296)) + (j39 * 654183)) - (j33 * 997805)) + (j34 * 136657)) - (j29 * 683901)) + j41;
                long j57 = (j56 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j58 = (((((j16 - j18) + (j43 * 654183)) - (j38 * 997805)) + (j39 * 136657)) - (j33 * 683901)) + j45;
                long j59 = (j58 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j60 = (((j19 - j21) + (j43 * 136657)) - (j38 * 683901)) + j48;
                long j61 = (j60 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j62 = (j22 - j24) + j51;
                long j63 = (j62 + android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j64 = j63 << 21;
                long j65 = (j30 - j32) + (j63 * 666643);
                long j66 = j65 >> 21;
                long j67 = j66 << 21;
                long j68 = (j52 - (j53 << 21)) + (j63 * 470296) + j66;
                long j69 = j68 >> 21;
                long j70 = j69 << 21;
                long j71 = (j35 - j37) + j53 + (j63 * 654183) + j69;
                long j72 = j71 >> 21;
                long j73 = j72 << 21;
                long j74 = ((j54 - (j55 << 21)) - (j63 * 997805)) + j72;
                long j75 = j74 >> 21;
                long j76 = j75 << 21;
                long j77 = (j40 - j42) + j55 + (j63 * 136657) + j75;
                long j78 = j77 >> 21;
                long j79 = j78 << 21;
                long j80 = ((j56 - (j57 << 21)) - (j63 * 683901)) + j78;
                long j81 = j80 >> 21;
                long j82 = j81 << 21;
                long j83 = (j44 - j46) + j57 + j81;
                long j84 = j83 >> 21;
                long j85 = j84 << 21;
                long j86 = (j58 - (j59 << 21)) + j84;
                long j87 = j86 >> 21;
                long j88 = j87 << 21;
                long j89 = (j47 - j49) + j59 + j87;
                long j90 = j89 >> 21;
                long j91 = j90 << 21;
                long j92 = (j60 - (j61 << 21)) + j90;
                long j93 = j92 >> 21;
                long j94 = j93 << 21;
                long j95 = (j50 - (j51 << 21)) + j61 + j93;
                long j96 = j95 >> 21;
                long j97 = j96 << 21;
                long j98 = (j62 - j64) + j96;
                long j99 = j98 >> 21;
                long j100 = j99 << 21;
                long j101 = (j65 - j67) + (666643 * j99);
                long j102 = j101 >> 21;
                long j103 = j102 << 21;
                long j104 = (j68 - j70) + (470296 * j99) + j102;
                long j105 = j104 >> 21;
                long j106 = j105 << 21;
                long j107 = (j71 - j73) + (654183 * j99) + j105;
                long j108 = j107 >> 21;
                long j109 = j108 << 21;
                long j110 = ((j74 - j76) - (997805 * j99)) + j108;
                long j111 = j110 >> 21;
                long j112 = j111 << 21;
                long j113 = (j77 - j79) + (136657 * j99) + j111;
                long j114 = j113 >> 21;
                long j115 = ((j80 - j82) - (j99 * 683901)) + j114;
                long j116 = j115 >> 21;
                long j117 = j116 << 21;
                long j118 = (j83 - j85) + j116;
                long j119 = j118 >> 21;
                long j120 = j119 << 21;
                long j121 = (j86 - j88) + j119;
                long j122 = j121 >> 21;
                long j123 = j122 << 21;
                long j124 = (j89 - j91) + j122;
                long j125 = j124 >> 21;
                long j126 = j125 << 21;
                long j127 = (j92 - j94) + j125;
                long j128 = j127 >> 21;
                long j129 = j128 << 21;
                long j130 = (j95 - j97) + j128;
                long j131 = j130 >> 21;
                digest[0] = (byte) (j101 - j103);
                long j132 = j121 - j123;
                long j133 = j118 - j120;
                long j134 = j115 - j117;
                long j135 = j113 - (j114 << 21);
                long j136 = j110 - j112;
                long j137 = j107 - j109;
                long j138 = j104 - j106;
                digest[1] = (byte) (r8 >> 8);
                digest[2] = (byte) ((r8 >> 16) | (j138 << 5));
                digest[3] = (byte) (j138 >> 3);
                digest[4] = (byte) (j138 >> 11);
                digest[5] = (byte) ((j138 >> 19) | (j137 << 2));
                digest[6] = (byte) (j137 >> 6);
                digest[7] = (byte) ((j137 >> 14) | (j136 << 7));
                digest[8] = (byte) (j136 >> 1);
                digest[9] = (byte) (j136 >> 9);
                digest[10] = (byte) ((j136 >> 17) | (j135 << 4));
                digest[11] = (byte) (j135 >> 4);
                digest[12] = (byte) (j135 >> 12);
                digest[13] = (byte) ((j135 >> 20) | (j134 + j134));
                digest[14] = (byte) (j134 >> 7);
                digest[15] = (byte) ((j134 >> 15) | (j133 << 6));
                digest[16] = (byte) (j133 >> 2);
                digest[17] = (byte) (j133 >> 10);
                digest[18] = (byte) ((j133 >> 18) | (j132 << 3));
                long j139 = j130 - (j131 << 21);
                long j140 = (j98 - j100) + j131;
                long j141 = j127 - j129;
                digest[19] = (byte) (j132 >> 5);
                digest[20] = (byte) (j132 >> 13);
                digest[21] = (byte) (j124 - j126);
                digest[22] = (byte) (r6 >> 8);
                digest[23] = (byte) ((r6 >> 16) | (j141 << 5));
                digest[24] = (byte) (j141 >> 3);
                digest[25] = (byte) (j141 >> 11);
                digest[26] = (byte) ((j141 >> 19) | (j139 << 2));
                digest[27] = (byte) (j139 >> 6);
                digest[28] = (byte) ((j139 >> 14) | (j140 << 7));
                digest[29] = (byte) (j140 >> 1);
                digest[30] = (byte) (j140 >> 9);
                digest[i3] = (byte) (j140 >> 17);
                long[] jArr = new long[10];
                long[] zzg = com.google.android.gms.internal.ads.zzhlj.zzg(bArr3);
                long[] jArr2 = new long[10];
                jArr2[0] = 1;
                long[] jArr3 = new long[10];
                long[] jArr4 = new long[10];
                long[] jArr5 = new long[10];
                long[] jArr6 = new long[10];
                long[] jArr7 = new long[10];
                com.google.android.gms.internal.ads.zzhlj.zzf(jArr4, zzg);
                com.google.android.gms.internal.ads.zzhlj.zze(jArr5, jArr4, com.google.android.gms.internal.ads.zzhle.zza);
                com.google.android.gms.internal.ads.zzhlj.zzb(jArr4, jArr4, jArr2);
                com.google.android.gms.internal.ads.zzhlj.zza(jArr5, jArr5, jArr2);
                long[] jArr8 = new long[10];
                com.google.android.gms.internal.ads.zzhlj.zzf(jArr8, jArr5);
                com.google.android.gms.internal.ads.zzhlj.zze(jArr8, jArr8, jArr5);
                com.google.android.gms.internal.ads.zzhlj.zzf(jArr, jArr8);
                com.google.android.gms.internal.ads.zzhlj.zze(jArr, jArr, jArr5);
                com.google.android.gms.internal.ads.zzhlj.zze(jArr, jArr, jArr4);
                long[] jArr9 = new long[10];
                long[] jArr10 = new long[10];
                long[] jArr11 = new long[10];
                com.google.android.gms.internal.ads.zzhlj.zzf(jArr9, jArr);
                com.google.android.gms.internal.ads.zzhlj.zzf(jArr10, jArr9);
                com.google.android.gms.internal.ads.zzhlj.zzf(jArr10, jArr10);
                com.google.android.gms.internal.ads.zzhlj.zze(jArr10, jArr, jArr10);
                com.google.android.gms.internal.ads.zzhlj.zze(jArr9, jArr9, jArr10);
                com.google.android.gms.internal.ads.zzhlj.zzf(jArr9, jArr9);
                com.google.android.gms.internal.ads.zzhlj.zze(jArr9, jArr10, jArr9);
                com.google.android.gms.internal.ads.zzhlj.zzf(jArr10, jArr9);
                byte[] bArr5 = copyOfRange;
                for (int i7 = 1; i7 < 5; i7++) {
                    com.google.android.gms.internal.ads.zzhlj.zzf(jArr10, jArr10);
                }
                com.google.android.gms.internal.ads.zzhlj.zze(jArr9, jArr10, jArr9);
                com.google.android.gms.internal.ads.zzhlj.zzf(jArr10, jArr9);
                for (int i8 = 1; i8 < 10; i8++) {
                    com.google.android.gms.internal.ads.zzhlj.zzf(jArr10, jArr10);
                }
                com.google.android.gms.internal.ads.zzhlj.zze(jArr10, jArr10, jArr9);
                com.google.android.gms.internal.ads.zzhlj.zzf(jArr11, jArr10);
                for (int i9 = 1; i9 < 20; i9++) {
                    com.google.android.gms.internal.ads.zzhlj.zzf(jArr11, jArr11);
                }
                com.google.android.gms.internal.ads.zzhlj.zze(jArr10, jArr11, jArr10);
                com.google.android.gms.internal.ads.zzhlj.zzf(jArr10, jArr10);
                for (int i10 = 1; i10 < 10; i10++) {
                    com.google.android.gms.internal.ads.zzhlj.zzf(jArr10, jArr10);
                }
                com.google.android.gms.internal.ads.zzhlj.zze(jArr9, jArr10, jArr9);
                com.google.android.gms.internal.ads.zzhlj.zzf(jArr10, jArr9);
                for (int i11 = 1; i11 < 50; i11++) {
                    com.google.android.gms.internal.ads.zzhlj.zzf(jArr10, jArr10);
                }
                com.google.android.gms.internal.ads.zzhlj.zze(jArr10, jArr10, jArr9);
                com.google.android.gms.internal.ads.zzhlj.zzf(jArr11, jArr10);
                for (int i12 = 1; i12 < 100; i12++) {
                    com.google.android.gms.internal.ads.zzhlj.zzf(jArr11, jArr11);
                }
                com.google.android.gms.internal.ads.zzhlj.zze(jArr10, jArr11, jArr10);
                com.google.android.gms.internal.ads.zzhlj.zzf(jArr10, jArr10);
                for (int i13 = 1; i13 < 50; i13++) {
                    com.google.android.gms.internal.ads.zzhlj.zzf(jArr10, jArr10);
                }
                com.google.android.gms.internal.ads.zzhlj.zze(jArr9, jArr10, jArr9);
                com.google.android.gms.internal.ads.zzhlj.zzf(jArr9, jArr9);
                com.google.android.gms.internal.ads.zzhlj.zzf(jArr9, jArr9);
                com.google.android.gms.internal.ads.zzhlj.zze(jArr, jArr9, jArr);
                com.google.android.gms.internal.ads.zzhlj.zze(jArr, jArr, jArr8);
                com.google.android.gms.internal.ads.zzhlj.zze(jArr, jArr, jArr4);
                com.google.android.gms.internal.ads.zzhlj.zzf(jArr6, jArr);
                com.google.android.gms.internal.ads.zzhlj.zze(jArr6, jArr6, jArr5);
                com.google.android.gms.internal.ads.zzhlj.zzb(jArr7, jArr6, jArr4);
                if (zze(jArr7)) {
                    com.google.android.gms.internal.ads.zzhlj.zza(jArr7, jArr6, jArr4);
                    if (zze(jArr7)) {
                        throw new java.security.GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                    }
                    com.google.android.gms.internal.ads.zzhlj.zze(jArr, jArr, com.google.android.gms.internal.ads.zzhle.zzc);
                }
                if (zze(jArr)) {
                    c = 31;
                    b = 255;
                    i = 7;
                } else {
                    c = 31;
                    b = 255;
                    i = 7;
                    if (((bArr3[31] & 255) >> 7) != 0) {
                        throw new java.security.GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                }
                if (zzf(jArr) == ((bArr3[c] & b) >> i)) {
                    zzm(jArr, jArr);
                }
                com.google.android.gms.internal.ads.zzhlj.zze(jArr3, jArr, zzg);
                com.google.android.gms.internal.ads.zzhlb zzhlbVar = new com.google.android.gms.internal.ads.zzhlb(new com.google.android.gms.internal.ads.zzhla(jArr, zzg, jArr2), jArr3);
                com.google.android.gms.internal.ads.zzhky[] zzhkyVarArr = new com.google.android.gms.internal.ads.zzhky[8];
                zzhkyVarArr[0] = new com.google.android.gms.internal.ads.zzhky(zzhlbVar);
                com.google.android.gms.internal.ads.zzhkz zzhkzVar = new com.google.android.gms.internal.ads.zzhkz(new com.google.android.gms.internal.ads.zzhla(), new long[10]);
                zzi(zzhkzVar, zzhlbVar.zza);
                com.google.android.gms.internal.ads.zzhlb zzhlbVar2 = new com.google.android.gms.internal.ads.zzhlb(zzhkzVar);
                for (int i14 = 1; i14 < 8; i14++) {
                    zzg(zzhkzVar, zzhlbVar2, zzhkyVarArr[i14 - 1]);
                    zzhkyVarArr[i14] = new com.google.android.gms.internal.ads.zzhky(new com.google.android.gms.internal.ads.zzhlb(zzhkzVar));
                }
                byte[] zzl = zzl(digest);
                byte[] zzl2 = zzl(bArr5);
                com.google.android.gms.internal.ads.zzhkz zzhkzVar2 = new com.google.android.gms.internal.ads.zzhkz(zzc);
                com.google.android.gms.internal.ads.zzhlb zzhlbVar3 = new com.google.android.gms.internal.ads.zzhlb();
                int i15 = 255;
                while (i15 >= 0 && zzl[i15] == 0 && zzl2[i15] == 0) {
                    i15--;
                }
                while (i15 >= 0) {
                    zzi(zzhkzVar2, new com.google.android.gms.internal.ads.zzhla(zzhkzVar2));
                    byte b3 = zzl[i15];
                    if (b3 > 0) {
                        com.google.android.gms.internal.ads.zzhlb.zza(zzhlbVar3, zzhkzVar2);
                        b2 = 2;
                        zzg(zzhkzVar2, zzhlbVar3, zzhkyVarArr[zzl[i15] / 2]);
                    } else {
                        b2 = 2;
                        if (b3 < 0) {
                            com.google.android.gms.internal.ads.zzhlb.zza(zzhlbVar3, zzhkzVar2);
                            zzh(zzhkzVar2, zzhlbVar3, zzhkyVarArr[(-zzl[i15]) / 2]);
                        }
                    }
                    byte b4 = zzl2[i15];
                    if (b4 > 0) {
                        com.google.android.gms.internal.ads.zzhlb.zza(zzhlbVar3, zzhkzVar2);
                        zzg(zzhkzVar2, zzhlbVar3, com.google.android.gms.internal.ads.zzhle.zze[zzl2[i15] / b2]);
                    } else if (b4 < 0) {
                        com.google.android.gms.internal.ads.zzhlb.zza(zzhlbVar3, zzhkzVar2);
                        zzh(zzhkzVar2, zzhlbVar3, com.google.android.gms.internal.ads.zzhle.zze[(-zzl2[i15]) / b2]);
                    }
                    i15--;
                }
                byte[] zzb2 = new com.google.android.gms.internal.ads.zzhla(zzhkzVar2).zzb();
                for (int i16 = 0; i16 < 32; i16++) {
                    if (zzb2[i16] != bArr2[i16]) {
                        return false;
                    }
                }
                return true;
            }
            i4--;
            bArr4 = bArr2;
            copyOfRange = copyOfRange;
            i3 = 31;
            i2 = 0;
        }
        return false;
    }

    public static void zzd() {
        if (com.google.android.gms.internal.ads.zzhle.zza == null) {
            throw new java.lang.IllegalStateException("Could not initialize Ed25519.");
        }
    }

    static /* synthetic */ boolean zze(long[] jArr) {
        long[] jArr2 = new long[11];
        java.lang.System.arraycopy(jArr, 0, jArr2, 0, 10);
        com.google.android.gms.internal.ads.zzhlj.zzd(jArr2);
        byte[] zzh = com.google.android.gms.internal.ads.zzhlj.zzh(jArr2);
        for (int i = 0; i < 32; i++) {
            if (zzh[i] != 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ int zzf(long[] jArr) {
        return com.google.android.gms.internal.ads.zzhlj.zzh(jArr)[0] & 1;
    }

    private static void zzg(com.google.android.gms.internal.ads.zzhkz zzhkzVar, com.google.android.gms.internal.ads.zzhlb zzhlbVar, com.google.android.gms.internal.ads.zzhkx zzhkxVar) {
        com.google.android.gms.internal.ads.zzhla zzhlaVar = zzhlbVar.zza;
        com.google.android.gms.internal.ads.zzhla zzhlaVar2 = zzhkzVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhlaVar2.zza;
        long[] jArr3 = zzhlaVar.zzb;
        long[] jArr4 = zzhlaVar.zza;
        com.google.android.gms.internal.ads.zzhlj.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhlaVar2.zzb;
        com.google.android.gms.internal.ads.zzhlj.zzb(jArr5, jArr3, jArr4);
        com.google.android.gms.internal.ads.zzhlj.zze(jArr5, jArr5, zzhkxVar.zzb);
        long[] jArr6 = zzhkxVar.zza;
        long[] jArr7 = zzhlaVar2.zzc;
        com.google.android.gms.internal.ads.zzhlj.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhkzVar.zzb;
        com.google.android.gms.internal.ads.zzhlj.zze(jArr8, zzhlbVar.zzb, zzhkxVar.zzc);
        zzhkxVar.zza(jArr2, zzhlaVar.zzc);
        com.google.android.gms.internal.ads.zzhlj.zza(jArr, jArr2, jArr2);
        com.google.android.gms.internal.ads.zzhlj.zzb(jArr2, jArr7, jArr5);
        com.google.android.gms.internal.ads.zzhlj.zza(jArr5, jArr7, jArr5);
        com.google.android.gms.internal.ads.zzhlj.zza(jArr7, jArr, jArr8);
        com.google.android.gms.internal.ads.zzhlj.zzb(jArr8, jArr, jArr8);
    }

    private static void zzh(com.google.android.gms.internal.ads.zzhkz zzhkzVar, com.google.android.gms.internal.ads.zzhlb zzhlbVar, com.google.android.gms.internal.ads.zzhkx zzhkxVar) {
        com.google.android.gms.internal.ads.zzhla zzhlaVar = zzhlbVar.zza;
        com.google.android.gms.internal.ads.zzhla zzhlaVar2 = zzhkzVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhlaVar2.zza;
        long[] jArr3 = zzhlaVar.zzb;
        long[] jArr4 = zzhlaVar.zza;
        com.google.android.gms.internal.ads.zzhlj.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhlaVar2.zzb;
        com.google.android.gms.internal.ads.zzhlj.zzb(jArr5, jArr3, jArr4);
        com.google.android.gms.internal.ads.zzhlj.zze(jArr5, jArr5, zzhkxVar.zza);
        long[] jArr6 = zzhkxVar.zzb;
        long[] jArr7 = zzhlaVar2.zzc;
        com.google.android.gms.internal.ads.zzhlj.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhkzVar.zzb;
        com.google.android.gms.internal.ads.zzhlj.zze(jArr8, zzhlbVar.zzb, zzhkxVar.zzc);
        zzhkxVar.zza(jArr2, zzhlaVar.zzc);
        com.google.android.gms.internal.ads.zzhlj.zza(jArr, jArr2, jArr2);
        com.google.android.gms.internal.ads.zzhlj.zzb(jArr2, jArr7, jArr5);
        com.google.android.gms.internal.ads.zzhlj.zza(jArr5, jArr7, jArr5);
        com.google.android.gms.internal.ads.zzhlj.zzb(jArr7, jArr, jArr8);
        com.google.android.gms.internal.ads.zzhlj.zza(jArr8, jArr, jArr8);
    }

    private static void zzi(com.google.android.gms.internal.ads.zzhkz zzhkzVar, com.google.android.gms.internal.ads.zzhla zzhlaVar) {
        com.google.android.gms.internal.ads.zzhla zzhlaVar2 = zzhkzVar.zza;
        long[] jArr = zzhlaVar2.zza;
        long[] jArr2 = zzhlaVar.zza;
        long[] jArr3 = new long[10];
        com.google.android.gms.internal.ads.zzhlj.zzf(jArr, jArr2);
        long[] jArr4 = zzhlaVar2.zzc;
        long[] jArr5 = zzhlaVar.zzb;
        com.google.android.gms.internal.ads.zzhlj.zzf(jArr4, jArr5);
        long[] jArr6 = zzhkzVar.zzb;
        com.google.android.gms.internal.ads.zzhlj.zzf(jArr6, zzhlaVar.zzc);
        com.google.android.gms.internal.ads.zzhlj.zza(jArr6, jArr6, jArr6);
        long[] jArr7 = zzhlaVar2.zzb;
        com.google.android.gms.internal.ads.zzhlj.zza(jArr7, jArr2, jArr5);
        com.google.android.gms.internal.ads.zzhlj.zzf(jArr3, jArr7);
        com.google.android.gms.internal.ads.zzhlj.zza(jArr7, jArr4, jArr);
        com.google.android.gms.internal.ads.zzhlj.zzb(jArr4, jArr4, jArr);
        com.google.android.gms.internal.ads.zzhlj.zzb(jArr, jArr3, jArr7);
        com.google.android.gms.internal.ads.zzhlj.zzb(jArr6, jArr6, jArr4);
    }

    private static int zzj(int i, int i2) {
        int i3 = (~(i ^ i2)) & 255;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return (i5 & (i5 + i5)) >> 7;
    }

    private static void zzk(com.google.android.gms.internal.ads.zzhkx zzhkxVar, int i, byte b) {
        com.google.android.gms.internal.ads.zzhkx[][] zzhkxVarArr = com.google.android.gms.internal.ads.zzhle.zzd;
        int i2 = (b & 255) >> 7;
        int i3 = (-i2) & b;
        int i4 = b - (i3 + i3);
        zzhkxVar.zzb(zzhkxVarArr[i][0], zzj(i4, 1));
        zzhkxVar.zzb(zzhkxVarArr[i][1], zzj(i4, 2));
        zzhkxVar.zzb(zzhkxVarArr[i][2], zzj(i4, 3));
        zzhkxVar.zzb(zzhkxVarArr[i][3], zzj(i4, 4));
        zzhkxVar.zzb(zzhkxVarArr[i][4], zzj(i4, 5));
        zzhkxVar.zzb(zzhkxVarArr[i][5], zzj(i4, 6));
        zzhkxVar.zzb(zzhkxVarArr[i][6], zzj(i4, 7));
        zzhkxVar.zzb(zzhkxVarArr[i][7], zzj(i4, 8));
        long[] jArr = zzhkxVar.zzc;
        long[] jArr2 = zzhkxVar.zza;
        long[] copyOf = java.util.Arrays.copyOf(zzhkxVar.zzb, 10);
        long[] copyOf2 = java.util.Arrays.copyOf(jArr2, 10);
        long[] copyOf3 = java.util.Arrays.copyOf(jArr, 10);
        zzm(copyOf3, copyOf3);
        zzhkxVar.zzb(new com.google.android.gms.internal.ads.zzhkx(copyOf, copyOf2, copyOf3), i2);
    }

    private static byte[] zzl(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & 255) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b = bArr2[i];
                    if (b != 0) {
                        byte b2 = bArr2[i3];
                        int i5 = b << i4;
                        int i6 = b2 + i5;
                        if (i6 <= 15) {
                            bArr2[i3] = (byte) i6;
                            bArr2[i] = 0;
                        } else {
                            int i7 = b2 - i5;
                            if (i7 >= -15) {
                                bArr2[i3] = (byte) i7;
                                while (true) {
                                    if (i >= 256) {
                                        break;
                                    }
                                    if (bArr2[i] == 0) {
                                        bArr2[i] = 1;
                                        break;
                                    }
                                    bArr2[i] = 0;
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static void zzm(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr2.length; i++) {
            jArr[i] = -jArr2[i];
        }
    }

    private static long zzn(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    private static long zzo(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | zzn(bArr, i);
    }
}
