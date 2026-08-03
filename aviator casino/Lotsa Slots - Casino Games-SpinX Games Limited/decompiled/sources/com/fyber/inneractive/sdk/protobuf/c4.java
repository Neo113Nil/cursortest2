package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class c4 extends com.fyber.inneractive.sdk.protobuf.z3 {
    public static int a(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            com.fyber.inneractive.sdk.protobuf.z3 z3Var = com.fyber.inneractive.sdk.protobuf.d4.f4185a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return com.fyber.inneractive.sdk.protobuf.d4.a(i, com.fyber.inneractive.sdk.protobuf.x3.c.b(bArr, com.fyber.inneractive.sdk.protobuf.x3.f + j));
        }
        if (i2 != 2) {
            throw new java.lang.AssertionError();
        }
        com.fyber.inneractive.sdk.protobuf.w3 w3Var = com.fyber.inneractive.sdk.protobuf.x3.c;
        long j2 = com.fyber.inneractive.sdk.protobuf.x3.f;
        return com.fyber.inneractive.sdk.protobuf.d4.a(i, w3Var.b(bArr, j2 + j), w3Var.b(bArr, j + 1 + j2));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final java.lang.String b(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        long j;
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer limit=%d, index=%d, limit=%d", java.lang.Integer.valueOf(byteBuffer.limit()), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
        long j2 = com.fyber.inneractive.sdk.protobuf.x3.c.f4226a.getLong(byteBuffer, com.fyber.inneractive.sdk.protobuf.x3.g) + i;
        long j3 = i2 + j2;
        char[] cArr = new char[i2];
        int i3 = 0;
        while (true) {
            j = 1;
            if (j2 >= j3) {
                break;
            }
            byte a2 = com.fyber.inneractive.sdk.protobuf.x3.c.a(j2);
            if (!com.fyber.inneractive.sdk.protobuf.y3.a(a2)) {
                break;
            }
            j2++;
            cArr[i3] = (char) a2;
            i3++;
        }
        while (j2 < j3) {
            long j4 = j2 + j;
            com.fyber.inneractive.sdk.protobuf.w3 w3Var = com.fyber.inneractive.sdk.protobuf.x3.c;
            byte a3 = w3Var.a(j2);
            if (com.fyber.inneractive.sdk.protobuf.y3.a(a3)) {
                cArr[i3] = (char) a3;
                i3++;
                j2 = j4;
                while (j2 < j3) {
                    byte a4 = com.fyber.inneractive.sdk.protobuf.x3.c.a(j2);
                    if (!com.fyber.inneractive.sdk.protobuf.y3.a(a4)) {
                        break;
                    }
                    j2 += j;
                    cArr[i3] = (char) a4;
                    i3++;
                }
            } else if (a3 < -32) {
                if (j4 >= j3) {
                    throw new com.fyber.inneractive.sdk.protobuf.n1("Protocol message had invalid UTF-8.");
                }
                j2 += 2;
                com.fyber.inneractive.sdk.protobuf.y3.a(a3, w3Var.a(j4), cArr, i3);
                i3++;
            } else if (a3 < -16) {
                if (j4 >= j3 - j) {
                    throw new com.fyber.inneractive.sdk.protobuf.n1("Protocol message had invalid UTF-8.");
                }
                long j5 = j2 + 2;
                j2 += 3;
                com.fyber.inneractive.sdk.protobuf.y3.a(a3, w3Var.a(j4), w3Var.a(j5), cArr, i3);
                i3++;
            } else {
                if (j4 >= j3 - 2) {
                    throw new com.fyber.inneractive.sdk.protobuf.n1("Protocol message had invalid UTF-8.");
                }
                byte a5 = w3Var.a(j4);
                long j6 = j2 + 3;
                byte a6 = w3Var.a(j2 + 2);
                j2 += 4;
                com.fyber.inneractive.sdk.protobuf.y3.a(a3, a5, a6, w3Var.a(j6), cArr, i3);
                i3 += 2;
                j = 1;
            }
        }
        return new java.lang.String(cArr, 0, i3);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final int c(byte[] bArr, int i, int i2) {
        int i3;
        if ((i | i2 | (bArr.length - i2)) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("Array length=%d, index=%d, limit=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
        long j = i;
        int i4 = (int) (i2 - j);
        long j2 = 1;
        if (i4 >= 16) {
            long j3 = j;
            i3 = 0;
            while (true) {
                if (i3 >= i4) {
                    i3 = i4;
                    break;
                }
                long j4 = j3 + 1;
                if (com.fyber.inneractive.sdk.protobuf.x3.c.b(bArr, j3 + com.fyber.inneractive.sdk.protobuf.x3.f) < 0) {
                    break;
                }
                i3++;
                j3 = j4;
            }
        } else {
            i3 = 0;
        }
        int i5 = i4 - i3;
        long j5 = j + i3;
        while (true) {
            byte b = 0;
            while (true) {
                if (i5 <= 0) {
                    break;
                }
                long j6 = j5 + j2;
                b = com.fyber.inneractive.sdk.protobuf.x3.c.b(bArr, com.fyber.inneractive.sdk.protobuf.x3.f + j5);
                if (b < 0) {
                    j5 = j6;
                    break;
                }
                i5--;
                j5 = j6;
            }
            if (i5 != 0) {
                int i6 = i5 - 1;
                if (b >= -32) {
                    if (b >= -16) {
                        if (i6 >= 3) {
                            i5 -= 4;
                            long j7 = j5 + 1;
                            com.fyber.inneractive.sdk.protobuf.w3 w3Var = com.fyber.inneractive.sdk.protobuf.x3.c;
                            long j8 = com.fyber.inneractive.sdk.protobuf.x3.f;
                            byte b2 = w3Var.b(bArr, j8 + j5);
                            if (b2 > -65 || (((b2 + 112) + (b << com.google.common.base.Ascii.FS)) >> 30) != 0) {
                                break;
                            }
                            long j9 = 2 + j5;
                            if (w3Var.b(bArr, j8 + j7) > -65) {
                                break;
                            }
                            j5 += 3;
                            if (w3Var.b(bArr, j8 + j9) > -65) {
                                break;
                            }
                            j2 = 1;
                        } else {
                            return a(bArr, b, j5, i6);
                        }
                    } else if (i6 >= 2) {
                        i5 -= 3;
                        long j10 = j5 + j2;
                        com.fyber.inneractive.sdk.protobuf.w3 w3Var2 = com.fyber.inneractive.sdk.protobuf.x3.c;
                        long j11 = com.fyber.inneractive.sdk.protobuf.x3.f;
                        byte b3 = w3Var2.b(bArr, j11 + j5);
                        if (b3 > -65 || ((b == -32 && b3 < -96) || (b == -19 && b3 >= -96))) {
                            break;
                        }
                        j5 += 2;
                        if (w3Var2.b(bArr, j11 + j10) > -65) {
                            break;
                        }
                        j2 = 1;
                    } else {
                        return a(bArr, b, j5, i6);
                    }
                } else if (i6 != 0) {
                    i5 -= 2;
                    if (b < -62) {
                        break;
                    }
                    long j12 = j5 + j2;
                    if (com.fyber.inneractive.sdk.protobuf.x3.c.b(bArr, j5 + com.fyber.inneractive.sdk.protobuf.x3.f) > -65) {
                        break;
                    }
                    j5 = j12;
                } else {
                    return b;
                }
            } else {
                return 0;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final java.lang.String a(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = com.fyber.inneractive.sdk.protobuf.x3.c.b(bArr, com.fyber.inneractive.sdk.protobuf.x3.f + i);
                if (!com.fyber.inneractive.sdk.protobuf.y3.a(b)) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                com.fyber.inneractive.sdk.protobuf.w3 w3Var = com.fyber.inneractive.sdk.protobuf.x3.c;
                long j = com.fyber.inneractive.sdk.protobuf.x3.f;
                byte b2 = w3Var.b(bArr, i + j);
                if (com.fyber.inneractive.sdk.protobuf.y3.a(b2)) {
                    cArr[i5] = (char) b2;
                    i5++;
                    i = i6;
                    while (i < i3) {
                        byte b3 = com.fyber.inneractive.sdk.protobuf.x3.c.b(bArr, com.fyber.inneractive.sdk.protobuf.x3.f + i);
                        if (!com.fyber.inneractive.sdk.protobuf.y3.a(b3)) {
                            break;
                        }
                        i++;
                        cArr[i5] = (char) b3;
                        i5++;
                    }
                } else if (b2 < -32) {
                    if (i6 < i3) {
                        i += 2;
                        com.fyber.inneractive.sdk.protobuf.y3.a(b2, w3Var.b(bArr, j + i6), cArr, i5);
                        i5++;
                    } else {
                        throw new com.fyber.inneractive.sdk.protobuf.n1("Protocol message had invalid UTF-8.");
                    }
                } else if (b2 < -16) {
                    if (i6 < i3 - 1) {
                        int i7 = i + 2;
                        i += 3;
                        com.fyber.inneractive.sdk.protobuf.y3.a(b2, w3Var.b(bArr, i6 + j), w3Var.b(bArr, j + i7), cArr, i5);
                        i5++;
                    } else {
                        throw new com.fyber.inneractive.sdk.protobuf.n1("Protocol message had invalid UTF-8.");
                    }
                } else if (i6 < i3 - 2) {
                    byte b4 = w3Var.b(bArr, i6 + j);
                    int i8 = i + 3;
                    byte b5 = w3Var.b(bArr, i + 2 + j);
                    i += 4;
                    com.fyber.inneractive.sdk.protobuf.y3.a(b2, b4, b5, w3Var.b(bArr, j + i8), cArr, i5);
                    i5 += 2;
                } else {
                    throw new com.fyber.inneractive.sdk.protobuf.n1("Protocol message had invalid UTF-8.");
                }
            }
            return new java.lang.String(cArr, 0, i5);
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final int a(java.lang.CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        char c;
        java.lang.String str;
        java.lang.String str2;
        long j2;
        int i3;
        long j3;
        char charAt;
        long j4 = i;
        long j5 = i2 + j4;
        int length = charSequence.length();
        java.lang.String str3 = " at index ";
        java.lang.String str4 = "Failed writing ";
        if (length > i2 || bArr.length - i2 < i) {
            throw new java.lang.ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
        }
        int i4 = 0;
        while (true) {
            j = 1;
            c = 128;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            com.fyber.inneractive.sdk.protobuf.x3.c.a((java.lang.Object) bArr, com.fyber.inneractive.sdk.protobuf.x3.f + j4, (byte) charAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char charAt2 = charSequence.charAt(i4);
            if (charAt2 < c && j4 < j5) {
                j2 = j4 + j;
                com.fyber.inneractive.sdk.protobuf.x3.c.a((java.lang.Object) bArr, com.fyber.inneractive.sdk.protobuf.x3.f + j4, (byte) charAt2);
                str = str3;
                str2 = str4;
            } else if (charAt2 >= 2048 || j4 > j5 - 2) {
                str = str3;
                str2 = str4;
                if ((charAt2 >= 55296 && 57343 >= charAt2) || j4 > j5 - 3) {
                    if (j4 <= j5 - 4) {
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char charAt3 = charSequence.charAt(i5);
                            if (java.lang.Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = java.lang.Character.toCodePoint(charAt2, charAt3);
                                j3 = 1;
                                com.fyber.inneractive.sdk.protobuf.w3 w3Var = com.fyber.inneractive.sdk.protobuf.x3.c;
                                long j6 = com.fyber.inneractive.sdk.protobuf.x3.f;
                                w3Var.a((java.lang.Object) bArr, j6 + j4, (byte) ((codePoint >>> 18) | 240));
                                w3Var.a((java.lang.Object) bArr, j6 + j4 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j7 = j4 + 3;
                                c = 128;
                                w3Var.a((java.lang.Object) bArr, j6 + 2 + j4, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 += 4;
                                w3Var.a((java.lang.Object) bArr, j6 + j7, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                                i4++;
                                str3 = str;
                                j = j3;
                                str4 = str2;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new com.fyber.inneractive.sdk.protobuf.b4(i4 - 1, length);
                    }
                    if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !java.lang.Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                        throw new com.fyber.inneractive.sdk.protobuf.b4(i4, length);
                    }
                    throw new java.lang.ArrayIndexOutOfBoundsException(str2 + charAt2 + str + j4);
                }
                com.fyber.inneractive.sdk.protobuf.w3 w3Var2 = com.fyber.inneractive.sdk.protobuf.x3.c;
                long j8 = com.fyber.inneractive.sdk.protobuf.x3.f;
                w3Var2.a((java.lang.Object) bArr, j8 + j4, (byte) ((charAt2 >>> '\f') | 480));
                w3Var2.a((java.lang.Object) bArr, j8 + j4 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                w3Var2.a((java.lang.Object) bArr, j8 + 2 + j4, (byte) ((charAt2 & '?') | 128));
                j2 = j4 + 3;
            } else {
                long j9 = j4 + j;
                com.fyber.inneractive.sdk.protobuf.w3 w3Var3 = com.fyber.inneractive.sdk.protobuf.x3.c;
                long j10 = com.fyber.inneractive.sdk.protobuf.x3.f;
                str = str3;
                str2 = str4;
                w3Var3.a((java.lang.Object) bArr, j10 + j4, (byte) ((charAt2 >>> 6) | 960));
                j4 += 2;
                w3Var3.a((java.lang.Object) bArr, j10 + j9, (byte) ((charAt2 & '?') | 128));
                c = 128;
                j3 = 1;
                i4++;
                str3 = str;
                j = j3;
                str4 = str2;
            }
            j4 = j2;
            c = 128;
            j3 = 1;
            i4++;
            str3 = str;
            j = j3;
            str4 = str2;
        }
        return (int) j4;
    }
}
