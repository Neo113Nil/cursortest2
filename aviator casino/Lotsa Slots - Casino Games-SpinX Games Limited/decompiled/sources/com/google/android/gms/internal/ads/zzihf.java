package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzihf {
    private static final com.google.android.gms.internal.ads.zzihc zza;

    static {
        int i = com.google.android.gms.internal.ads.zzicn.zza;
        zza = new com.google.android.gms.internal.ads.zzihd();
    }

    static boolean zza(byte[] bArr) {
        return zza.zza(bArr, 0, bArr.length);
    }

    static boolean zzb(byte[] bArr, int i, int i2) {
        return zza.zza(bArr, i, i2);
    }

    static int zzc(java.lang.String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                try {
                    int length2 = str.length();
                    while (i2 < length2) {
                        char charAt2 = str.charAt(i2);
                        if (charAt2 < 2048) {
                            i += (127 - charAt2) >>> 31;
                        } else {
                            i += 2;
                            if (charAt2 >= 55296 && charAt2 <= 57343) {
                                if (java.lang.Character.codePointAt(str, i2) < 65536) {
                                    throw new com.google.android.gms.internal.ads.zzihe(i2, length2);
                                }
                                i2++;
                            }
                        }
                        i2++;
                    }
                    i3 += i;
                } catch (com.google.android.gms.internal.ads.zzihe unused) {
                    return str.getBytes(java.nio.charset.StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = i3 + 4294967296L;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 34);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return r12 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int zzd(java.lang.String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = str.length();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= length || (i5 = i6 + i) >= i3 || (charAt = str.charAt(i6)) >= 128) {
                break;
            }
            bArr[i5] = (byte) charAt;
            i6++;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char charAt2 = str.charAt(i6);
            if (charAt2 < 128 && i7 < i3) {
                bArr[i7] = (byte) charAt2;
                i7++;
            } else if (charAt2 < 2048 && i7 <= i3 - 2) {
                bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                i7 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i7 > i3 - 3) {
                    if (i7 > i3 - 4) {
                        if (charAt2 < 55296 || charAt2 > 57343 || ((i4 = i6 + 1) != str.length() && java.lang.Character.isSurrogatePair(charAt2, str.charAt(i4)))) {
                            throw new java.lang.ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        return com.google.android.gms.internal.ads.zzihd.zzb(str, bArr, i, i2);
                    }
                    i6++;
                    if (i6 != str.length()) {
                        char charAt3 = str.charAt(i6);
                        if (java.lang.Character.isSurrogatePair(charAt2, charAt3)) {
                            int i8 = i7 + 3;
                            int codePoint = java.lang.Character.toCodePoint(charAt2, charAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 += 4;
                            bArr[i8] = (byte) ((codePoint & 63) | 128);
                        }
                    }
                    return com.google.android.gms.internal.ads.zzihd.zzb(str, bArr, i, i2);
                }
                bArr[i7] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i7 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i7 + 2] = (byte) ((charAt2 & '?') | 128);
                i7 += 3;
            }
            i6++;
        }
        return i7;
    }

    static java.lang.String zze(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zziet {
        int i3;
        if (i2 == 0) {
            return "";
        }
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = bArr[i];
            if (!com.google.android.gms.internal.ads.zzihb.zza(b)) {
                break;
            }
            i++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (i < i4) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (com.google.android.gms.internal.ads.zzihb.zza(b2)) {
                cArr[i5] = (char) b2;
                i5++;
                i = i6;
                while (i < i4) {
                    byte b3 = bArr[i];
                    if (com.google.android.gms.internal.ads.zzihb.zza(b3)) {
                        i++;
                        cArr[i5] = (char) b3;
                        i5++;
                    }
                }
            } else {
                if (b2 < -32) {
                    if (i6 >= i4) {
                        throw new com.google.android.gms.internal.ads.zziet("Protocol message had invalid UTF-8.");
                    }
                    i3 = i5 + 1;
                    i += 2;
                    com.google.android.gms.internal.ads.zzihb.zzb(b2, bArr[i6], cArr, i5);
                } else if (b2 < -16) {
                    if (i6 >= i4 - 1) {
                        throw new com.google.android.gms.internal.ads.zziet("Protocol message had invalid UTF-8.");
                    }
                    i3 = i5 + 1;
                    int i7 = i + 2;
                    i += 3;
                    com.google.android.gms.internal.ads.zzihb.zzc(b2, bArr[i6], bArr[i7], cArr, i5);
                } else {
                    if (i6 >= i4 - 2) {
                        throw new com.google.android.gms.internal.ads.zziet("Protocol message had invalid UTF-8.");
                    }
                    byte b4 = bArr[i6];
                    int i8 = i + 3;
                    byte b5 = bArr[i + 2];
                    i += 4;
                    com.google.android.gms.internal.ads.zzihb.zzd(b2, b4, b5, bArr[i8], cArr, i5);
                    i5 += 2;
                }
                i5 = i3;
            }
        }
        return new java.lang.String(cArr, 0, i5);
    }
}
