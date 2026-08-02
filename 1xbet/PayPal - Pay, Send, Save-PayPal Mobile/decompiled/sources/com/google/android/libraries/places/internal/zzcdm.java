package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcdm {
    java.lang.String zza;
    java.lang.String zzb;
    int zzc = -1;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x008c, code lost:
    
        if (r9 == r7) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.net.InetAddress zzf(java.lang.String str, int i, int i2) {
        int i3;
        int i4 = 16;
        byte[] bArr = new byte[16];
        int i5 = -1;
        int i6 = 0;
        int i7 = 1;
        int i8 = -1;
        int i9 = -1;
        int i10 = 0;
        while (true) {
            if (i7 < i2) {
                if (i10 != i4) {
                    int i11 = i7 + 2;
                    if (i11 <= i2 && str.regionMatches(i7, "::", i6, 2)) {
                        if (i8 == i5) {
                            i10 += 2;
                            i8 = i10;
                            if (i11 != i2) {
                                i7 = i11;
                                i9 = i7;
                                i7 = i9;
                                int i12 = 0;
                                while (i7 < i2) {
                                }
                                i3 = i7 - i9;
                                if (i3 == 0) {
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        return null;
                    }
                    if (i10 != 0) {
                        if (!str.regionMatches(i7, io.ktor.sse.ServerSentEventKt.COLON, i6, 1)) {
                            if (str.regionMatches(i7, ".", i6, 1)) {
                                int i13 = i10 - 2;
                                int i14 = i13;
                                loop2: while (true) {
                                    if (i9 < i2) {
                                        if (i14 == i4) {
                                            break;
                                        }
                                        if (i14 != i13) {
                                            if (str.charAt(i9) != '.') {
                                                break;
                                            }
                                            i9++;
                                        }
                                        int i15 = i6;
                                        int i16 = i9;
                                        while (i16 < i2) {
                                            char charAt = str.charAt(i16);
                                            if (charAt < '0' || charAt > '9') {
                                                break;
                                            }
                                            if (i15 == 0) {
                                                if (i9 != i16) {
                                                    break loop2;
                                                }
                                                i15 = 0;
                                            }
                                            i15 = ((i15 * 10) + charAt) - 48;
                                            if (i15 > 255) {
                                                break loop2;
                                            }
                                            i16++;
                                        }
                                        if (i16 - i9 == 0) {
                                            break;
                                        }
                                        bArr[i14] = (byte) i15;
                                        i14++;
                                        i9 = i16;
                                        i4 = 16;
                                        i6 = 0;
                                    } else {
                                        i10 += 2;
                                    }
                                }
                            }
                            return null;
                        }
                        i7++;
                    }
                    i9 = i7;
                    i7 = i9;
                    int i122 = 0;
                    while (i7 < i2) {
                        int zzd = com.google.android.libraries.places.internal.zzcdn.zzd(str.charAt(i7));
                        if (zzd == -1) {
                            break;
                        }
                        i7++;
                        i122 = (i122 << 4) + zzd;
                    }
                    i3 = i7 - i9;
                    if (i3 == 0 || i3 > 4) {
                        break;
                    }
                    bArr[i10] = (byte) ((i122 >>> 8) & 255);
                    bArr[i10 + 1] = (byte) (i122 & 255);
                    i10 += 2;
                    i4 = 16;
                    i5 = -1;
                    i6 = 0;
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        if (i10 != 16) {
            if (i8 == -1) {
                return null;
            }
            int i17 = i10 - i8;
            java.lang.System.arraycopy(bArr, i8, bArr, 16 - i17, i17);
            java.util.Arrays.fill(bArr, i8, (16 - i10) + i8, (byte) 0);
        }
        try {
            return java.net.InetAddress.getByAddress(bArr);
        } catch (java.net.UnknownHostException unused) {
            throw new java.lang.AssertionError();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.zza);
        sb.append("://");
        if (this.zzb.indexOf(58) != -1) {
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(this.zzb);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        } else {
            sb.append(this.zzb);
        }
        int zzd = zzd();
        if (zzd != com.google.android.libraries.places.internal.zzcdn.zzc(this.zza)) {
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
            sb.append(zzd);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0114, code lost:
    
        r9.zzb = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0116, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.libraries.places.internal.zzcdm zzb(java.lang.String str) {
        int i;
        java.lang.String substring;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("host == null");
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = str.length();
            i = -1;
            if (i3 >= length) {
                substring = str.substring(0, length);
                break;
            }
            if (str.charAt(i3) != '%') {
                i3++;
            } else {
                com.google.android.libraries.places.internal.zzcff zzcffVar = new com.google.android.libraries.places.internal.zzcff();
                zzcffVar.zzw(str, 0, i3);
                while (i3 < length) {
                    int codePointAt = str.codePointAt(i3);
                    if (codePointAt == 37) {
                        int i4 = i3 + 2;
                        if (i4 < length) {
                            int zzd = com.google.android.libraries.places.internal.zzcdn.zzd(str.charAt(i3 + 1));
                            int zzd2 = com.google.android.libraries.places.internal.zzcdn.zzd(str.charAt(i4));
                            if (zzd != -1 && zzd2 != -1) {
                                zzcffVar.zzA((zzd << 4) + zzd2);
                                i3 = i4;
                                codePointAt = 37;
                                i3 += java.lang.Character.charCount(codePointAt);
                            }
                        }
                        codePointAt = 37;
                    }
                    zzcffVar.zzx(codePointAt);
                    i3 += java.lang.Character.charCount(codePointAt);
                }
                substring = zzcffVar.zzo();
            }
        }
        java.lang.String str2 = null;
        if (substring.startsWith("[") && substring.endsWith("]")) {
            java.net.InetAddress zzf = zzf(substring, 1, substring.length() - 1);
            if (zzf != null) {
                byte[] address = zzf.getAddress();
                if (address.length != 16) {
                    throw new java.lang.AssertionError();
                }
                int i5 = 0;
                int i6 = 0;
                while (i5 < address.length) {
                    int i7 = i5;
                    while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                        i7 += 2;
                    }
                    int i8 = i7 - i5;
                    int i9 = i8 > i6 ? i8 : i6;
                    if (i8 > i6) {
                        i = i5;
                    }
                    i5 = i7 + 2;
                    i6 = i9;
                }
                com.google.android.libraries.places.internal.zzcff zzcffVar2 = new com.google.android.libraries.places.internal.zzcff();
                while (i2 < address.length) {
                    if (i2 == i) {
                        zzcffVar2.zzA(58);
                        i2 += i6;
                        if (i2 == 16) {
                            zzcffVar2.zzA(58);
                        }
                    } else {
                        if (i2 > 0) {
                            zzcffVar2.zzA(58);
                        }
                        zzcffVar2.zzD(((address[i2] & 255) << 8) | (address[i2 + 1] & 255));
                        i2 += 2;
                    }
                }
                str2 = zzcffVar2.zzo();
            }
        } else {
            try {
                java.lang.String lowerCase = java.net.IDN.toASCII(substring).toLowerCase(java.util.Locale.US);
                if (!lowerCase.isEmpty()) {
                    while (true) {
                        if (i2 >= lowerCase.length()) {
                            str2 = lowerCase;
                            break;
                        }
                        char charAt = lowerCase.charAt(i2);
                        if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                            break;
                        }
                        i2++;
                    }
                }
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        throw new java.lang.IllegalArgumentException("unexpected host: ".concat(str));
        throw new java.lang.IllegalArgumentException("unexpected host: ".concat(str));
    }

    public final com.google.android.libraries.places.internal.zzcdm zzc(int i) {
        if (i > 0 && i <= 65535) {
            this.zzc = i;
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 17);
        sb.append("unexpected port: ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    final int zzd() {
        int i = this.zzc;
        return i != -1 ? i : com.google.android.libraries.places.internal.zzcdn.zzc(this.zza);
    }

    public final com.google.android.libraries.places.internal.zzcdn zze() {
        if (this.zza == null) {
            throw new java.lang.IllegalStateException("scheme == null");
        }
        if (this.zzb != null) {
            return new com.google.android.libraries.places.internal.zzcdn(this, null);
        }
        throw new java.lang.IllegalStateException("host == null");
    }

    public final com.google.android.libraries.places.internal.zzcdm zza(java.lang.String str) {
        this.zza = "https";
        return this;
    }
}
