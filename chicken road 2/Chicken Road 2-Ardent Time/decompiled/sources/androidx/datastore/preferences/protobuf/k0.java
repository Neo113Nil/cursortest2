package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class k0 extends u0.AbstractC0995a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2334c;

    public /* synthetic */ k0(int i2) {
        this.f2334c = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // u0.AbstractC0995a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String j(byte[] bArr, int i2, int i3) {
        switch (this.f2334c) {
            case 0:
                if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
                    throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
                }
                int i4 = i2 + i3;
                char[] cArr = new char[i3];
                int i5 = 0;
                while (i2 < i4) {
                    byte b2 = bArr[i2];
                    if (b2 < 0) {
                        while (i2 < i4) {
                            int i6 = i2 + 1;
                            byte b3 = bArr[i2];
                            if (b3 >= 0) {
                                int i7 = i5 + 1;
                                cArr[i5] = (char) b3;
                                while (i6 < i4) {
                                    byte b4 = bArr[i6];
                                    if (b4 >= 0) {
                                        i6++;
                                        cArr[i7] = (char) b4;
                                        i7++;
                                    } else {
                                        i5 = i7;
                                        i2 = i6;
                                    }
                                }
                                i5 = i7;
                                i2 = i6;
                            } else if (b3 < -32) {
                                if (i6 >= i4) {
                                    throw androidx.datastore.preferences.protobuf.A.a();
                                }
                                i2 += 2;
                                byte b5 = bArr[i6];
                                int i8 = i5 + 1;
                                if (b3 < -62 || a.AbstractC0059a.s(b5)) {
                                    throw androidx.datastore.preferences.protobuf.A.a();
                                }
                                cArr[i5] = (char) ((b5 & 63) | ((b3 & 31) << 6));
                                i5 = i8;
                            } else {
                                if (b3 >= -16) {
                                    if (i6 >= i4 - 2) {
                                        throw androidx.datastore.preferences.protobuf.A.a();
                                    }
                                    byte b6 = bArr[i6];
                                    int i9 = i2 + 3;
                                    byte b7 = bArr[i2 + 2];
                                    i2 += 4;
                                    byte b8 = bArr[i9];
                                    int i10 = i5 + 1;
                                    if (!a.AbstractC0059a.s(b6)) {
                                        if ((((b6 + 112) + (b3 << 28)) >> 30) == 0 && !a.AbstractC0059a.s(b7) && !a.AbstractC0059a.s(b8)) {
                                            int i11 = ((b6 & 63) << 12) | ((b3 & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                            cArr[i5] = (char) ((i11 >>> 10) + 55232);
                                            cArr[i10] = (char) ((i11 & 1023) + 56320);
                                            i5 += 2;
                                        }
                                    }
                                    throw androidx.datastore.preferences.protobuf.A.a();
                                }
                                if (i6 >= i4 - 1) {
                                    throw androidx.datastore.preferences.protobuf.A.a();
                                }
                                int i12 = i2 + 2;
                                byte b9 = bArr[i6];
                                i2 += 3;
                                byte b10 = bArr[i12];
                                int i13 = i5 + 1;
                                if (a.AbstractC0059a.s(b9) || ((b3 == -32 && b9 < -96) || ((b3 == -19 && b9 >= -96) || a.AbstractC0059a.s(b10)))) {
                                    throw androidx.datastore.preferences.protobuf.A.a();
                                }
                                cArr[i5] = (char) (((b9 & 63) << 6) | ((b3 & 15) << 12) | (b10 & 63));
                                i5 = i13;
                            }
                        }
                        return new java.lang.String(cArr, 0, i5);
                    }
                    i2++;
                    cArr[i5] = (char) b2;
                    i5++;
                }
                while (i2 < i4) {
                }
                return new java.lang.String(cArr, 0, i5);
            default:
                java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC0088y.f2376a;
                java.lang.String str = new java.lang.String(bArr, i2, i3, charset);
                if (str.indexOf(65533) >= 0 && !java.util.Arrays.equals(str.getBytes(charset), java.util.Arrays.copyOfRange(bArr, i2, i3 + i2))) {
                    throw androidx.datastore.preferences.protobuf.A.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return r26 + r3;
     */
    @Override // u0.AbstractC0995a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(java.lang.String str, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        char charAt;
        long j2;
        java.lang.String str2;
        java.lang.String str3;
        int i6;
        char charAt2;
        switch (this.f2334c) {
            case 0:
                int length = str.length();
                int i7 = i3 + i2;
                int i8 = 0;
                while (i8 < length && (i5 = i8 + i2) < i7 && (charAt = str.charAt(i8)) < 128) {
                    bArr[i5] = (byte) charAt;
                    i8++;
                }
                int i9 = i2 + i8;
                while (i8 < length) {
                    char charAt3 = str.charAt(i8);
                    if (charAt3 < 128 && i9 < i7) {
                        bArr[i9] = (byte) charAt3;
                        i9++;
                    } else if (charAt3 < 2048 && i9 <= i7 - 2) {
                        int i10 = i9 + 1;
                        bArr[i9] = (byte) ((charAt3 >>> 6) | 960);
                        i9 += 2;
                        bArr[i10] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || i9 > i7 - 3) {
                            if (i9 > i7 - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i4 = i8 + 1) == str.length() || !java.lang.Character.isSurrogatePair(charAt3, str.charAt(i4)))) {
                                    throw new androidx.datastore.preferences.protobuf.l0(i8, length);
                                }
                                throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i9);
                            }
                            int i11 = i8 + 1;
                            if (i11 != str.length()) {
                                char charAt4 = str.charAt(i11);
                                if (java.lang.Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = java.lang.Character.toCodePoint(charAt3, charAt4);
                                    bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i9 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i12 = i9 + 3;
                                    bArr[i9 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i9 += 4;
                                    bArr[i12] = (byte) ((codePoint & 63) | 128);
                                    i8 = i11;
                                } else {
                                    i8 = i11;
                                }
                            }
                            throw new androidx.datastore.preferences.protobuf.l0(i8 - 1, length);
                        }
                        bArr[i9] = (byte) ((charAt3 >>> '\f') | 480);
                        int i13 = i9 + 2;
                        bArr[i9 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i9 += 3;
                        bArr[i13] = (byte) ((charAt3 & '?') | 128);
                    }
                    i8++;
                }
                return i9;
            default:
                long j3 = i2;
                long j4 = i3 + j3;
                int length2 = str.length();
                java.lang.String str4 = " at index ";
                java.lang.String str5 = "Failed writing ";
                if (length2 > i3 || bArr.length - i3 < i2) {
                    throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i2 + i3));
                }
                int i14 = 0;
                while (true) {
                    j2 = 1;
                    if (i14 < length2 && (charAt2 = str.charAt(i14)) < 128) {
                        androidx.datastore.preferences.protobuf.j0.j(bArr, j3, (byte) charAt2);
                        i14++;
                        j3 = 1 + j3;
                    }
                }
                if (i14 != length2) {
                    while (i14 < length2) {
                        char charAt5 = str.charAt(i14);
                        if (charAt5 < 128 && j3 < j4) {
                            androidx.datastore.preferences.protobuf.j0.j(bArr, j3, (byte) charAt5);
                            str3 = str5;
                            j3 += j2;
                            str2 = str4;
                        } else if (charAt5 >= 2048 || j3 > j4 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((charAt5 >= 55296 && 57343 >= charAt5) || j3 > j4 - 3) {
                                if (j3 > j4 - 4) {
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i6 = i14 + 1) == length2 || !java.lang.Character.isSurrogatePair(charAt5, str.charAt(i6)))) {
                                        throw new androidx.datastore.preferences.protobuf.l0(i14, length2);
                                    }
                                    throw new java.lang.ArrayIndexOutOfBoundsException(str3 + charAt5 + str2 + j3);
                                }
                                int i15 = i14 + 1;
                                if (i15 != length2) {
                                    char charAt6 = str.charAt(i15);
                                    if (java.lang.Character.isSurrogatePair(charAt5, charAt6)) {
                                        int codePoint2 = java.lang.Character.toCodePoint(charAt5, charAt6);
                                        androidx.datastore.preferences.protobuf.j0.j(bArr, j3, (byte) ((codePoint2 >>> 18) | 240));
                                        androidx.datastore.preferences.protobuf.j0.j(bArr, j3 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j5 = 3 + j3;
                                        androidx.datastore.preferences.protobuf.j0.j(bArr, j3 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j3 += 4;
                                        androidx.datastore.preferences.protobuf.j0.j(bArr, j5, (byte) ((codePoint2 & 63) | 128));
                                        i14 = i15;
                                    } else {
                                        i14 = i15;
                                    }
                                }
                                throw new androidx.datastore.preferences.protobuf.l0(i14 - 1, length2);
                            }
                            androidx.datastore.preferences.protobuf.j0.j(bArr, j3, (byte) ((charAt5 >>> '\f') | 480));
                            long j6 = j3 + 2;
                            androidx.datastore.preferences.protobuf.j0.j(bArr, j3 + 1, (byte) (((charAt5 >>> 6) & 63) | 128));
                            j3 += 3;
                            androidx.datastore.preferences.protobuf.j0.j(bArr, j6, (byte) ((charAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j7 = j3 + j2;
                            androidx.datastore.preferences.protobuf.j0.j(bArr, j3, (byte) ((charAt5 >>> 6) | 960));
                            j3 += 2;
                            androidx.datastore.preferences.protobuf.j0.j(bArr, j7, (byte) ((charAt5 & '?') | 128));
                        }
                        i14++;
                        str4 = str2;
                        str5 = str3;
                        j2 = 1;
                    }
                }
                return (int) j3;
        }
    }
}
