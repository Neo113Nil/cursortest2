package okio.internal;

/* compiled from: -Utf8.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "beginIndex", "", "endIndex", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class _Utf8Kt {
    public static /* synthetic */ java.lang.String commonToUtf8String$default(byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        return commonToUtf8String(bArr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fb, code lost:
    
        if ((r16[r5] & 192) == 128) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0090, code lost:
    
        if ((r16[r5] & 192) == 128) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String commonToUtf8String(byte[] bArr, int i, int i2) {
        byte b;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i8 < 0 || i2 > bArr.length || i8 > i2) {
            throw new java.lang.ArrayIndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i8 + " endIndex=" + i2);
        }
        char[] cArr = new char[i2 - i8];
        int i9 = 0;
        while (i8 < i2) {
            byte b2 = bArr[i8];
            if (b2 >= 0) {
                int i10 = i9 + 1;
                cArr[i9] = (char) b2;
                i8++;
                while (true) {
                    i9 = i10;
                    if (i8 < i2 && (b = bArr[i8]) >= 0) {
                        i8++;
                        i10 = i9 + 1;
                        cArr[i9] = (char) b;
                    }
                }
            } else {
                if ((b2 >> 5) == -2) {
                    int i11 = i8 + 1;
                    if (i2 <= i11) {
                        i3 = i9 + 1;
                        cArr[i9] = (char) 65533;
                    } else {
                        byte b3 = bArr[i11];
                        if ((b3 & 192) == 128) {
                            int i12 = (b2 << 6) ^ (b3 ^ 3968);
                            if (i12 < 128) {
                                i3 = i9 + 1;
                                cArr[i9] = (char) 65533;
                            } else {
                                i3 = i9 + 1;
                                cArr[i9] = (char) i12;
                            }
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            i9 = i3;
                            i4 = 2;
                        } else {
                            i3 = i9 + 1;
                            cArr[i9] = (char) 65533;
                        }
                    }
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    i9 = i3;
                    i4 = 1;
                } else {
                    if ((b2 >> 4) == -2) {
                        int i13 = i8 + 2;
                        if (i2 <= i13) {
                            i3 = i9 + 1;
                            cArr[i9] = (char) 65533;
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            int i14 = i8 + 1;
                            if (i2 > i14) {
                            }
                            i9 = i3;
                            i4 = 1;
                        } else {
                            byte b4 = bArr[i8 + 1];
                            if ((b4 & 192) == 128) {
                                byte b5 = bArr[i13];
                                if ((b5 & 192) == 128) {
                                    int i15 = (b2 << com.google.common.base.Ascii.FF) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                                    if (i15 < 2048) {
                                        i5 = i9 + 1;
                                        cArr[i9] = (char) 65533;
                                    } else if (55296 > i15 || i15 >= 57344) {
                                        i5 = i9 + 1;
                                        cArr[i9] = (char) i15;
                                    } else {
                                        i5 = i9 + 1;
                                        cArr[i9] = (char) 65533;
                                    }
                                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                    i9 = i5;
                                } else {
                                    i3 = i9 + 1;
                                    cArr[i9] = (char) 65533;
                                    kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                    i9 = i3;
                                    i4 = 2;
                                }
                            } else {
                                i3 = i9 + 1;
                                cArr[i9] = (char) 65533;
                                kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                                i9 = i3;
                                i4 = 1;
                            }
                        }
                    } else if ((b2 >> 3) == -2) {
                        int i16 = i8 + 3;
                        if (i2 <= i16) {
                            i6 = i9 + 1;
                            cArr[i9] = 65533;
                            kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                            int i17 = i8 + 1;
                            if (i2 > i17 && (bArr[i17] & 192) == 128) {
                                int i18 = i8 + 2;
                                if (i2 > i18) {
                                }
                                i9 = i6;
                                i4 = 2;
                            }
                            i9 = i6;
                            i4 = 1;
                        } else {
                            byte b6 = bArr[i8 + 1];
                            if ((b6 & 192) == 128) {
                                byte b7 = bArr[i8 + 2];
                                if ((b7 & 192) == 128) {
                                    byte b8 = bArr[i16];
                                    if ((b8 & 192) == 128) {
                                        int i19 = (b2 << com.google.common.base.Ascii.DC2) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << com.google.common.base.Ascii.FF));
                                        if (i19 > 1114111) {
                                            i7 = i9 + 1;
                                            cArr[i9] = 65533;
                                        } else if (55296 <= i19 && i19 < 57344) {
                                            i7 = i9 + 1;
                                            cArr[i9] = 65533;
                                        } else if (i19 < 65536) {
                                            i7 = i9 + 1;
                                            cArr[i9] = 65533;
                                        } else if (i19 != 65533) {
                                            cArr[i9] = (char) ((i19 >>> 10) + 55232);
                                            cArr[i9 + 1] = (char) ((i19 & 1023) + 56320);
                                            i7 = i9 + 2;
                                        } else {
                                            i7 = i9 + 1;
                                            cArr[i9] = 65533;
                                        }
                                        kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                                        i4 = 4;
                                        i9 = i7;
                                    } else {
                                        i6 = i9 + 1;
                                        cArr[i9] = 65533;
                                        kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                                        i9 = i6;
                                    }
                                } else {
                                    i6 = i9 + 1;
                                    cArr[i9] = 65533;
                                    kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                                    i9 = i6;
                                    i4 = 2;
                                }
                            } else {
                                i6 = i9 + 1;
                                cArr[i9] = 65533;
                                kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
                                i9 = i6;
                                i4 = 1;
                            }
                        }
                    } else {
                        cArr[i9] = 65533;
                        i8++;
                        i9++;
                    }
                    i4 = 3;
                }
                i8 += i4;
            }
        }
        return kotlin.text.StringsKt.concatToString(cArr, 0, i9);
    }

    public static final byte[] commonAsUtf8ToByteArray(java.lang.String str) {
        int i;
        char charAt;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt2 = str.charAt(i2);
            if (kotlin.jvm.internal.Intrinsics.compare((int) charAt2, 128) >= 0) {
                int length2 = str.length();
                int i3 = i2;
                while (i2 < length2) {
                    char charAt3 = str.charAt(i2);
                    if (kotlin.jvm.internal.Intrinsics.compare((int) charAt3, 128) < 0) {
                        int i4 = i3 + 1;
                        bArr[i3] = (byte) charAt3;
                        i2++;
                        while (true) {
                            i3 = i4;
                            if (i2 < length2 && kotlin.jvm.internal.Intrinsics.compare((int) str.charAt(i2), 128) < 0) {
                                i4 = i3 + 1;
                                bArr[i3] = (byte) str.charAt(i2);
                                i2++;
                            }
                        }
                    } else {
                        if (kotlin.jvm.internal.Intrinsics.compare((int) charAt3, 2048) < 0) {
                            bArr[i3] = (byte) ((charAt3 >> 6) | 192);
                            i3 += 2;
                            bArr[i3 + 1] = (byte) ((charAt3 & '?') | 128);
                        } else if (55296 > charAt3 || charAt3 >= 57344) {
                            bArr[i3] = (byte) ((charAt3 >> '\f') | 224);
                            bArr[i3 + 1] = (byte) (((charAt3 >> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i3 + 2] = (byte) ((charAt3 & '?') | 128);
                        } else if (kotlin.jvm.internal.Intrinsics.compare((int) charAt3, 56319) > 0 || length2 <= (i = i2 + 1) || 56320 > (charAt = str.charAt(i)) || charAt >= 57344) {
                            bArr[i3] = 63;
                            i2++;
                            i3++;
                        } else {
                            int charAt4 = ((charAt3 << '\n') + str.charAt(i)) - 56613888;
                            bArr[i3] = (byte) ((charAt4 >> 18) | 240);
                            bArr[i3 + 1] = (byte) (((charAt4 >> 12) & 63) | 128);
                            bArr[i3 + 2] = (byte) (((charAt4 >> 6) & 63) | 128);
                            i3 += 4;
                            bArr[i3 + 3] = (byte) ((charAt4 & 63) | 128);
                            i2 += 2;
                        }
                        i2++;
                    }
                }
                byte[] copyOf = java.util.Arrays.copyOf(bArr, i3);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                return copyOf;
            }
            bArr[i2] = (byte) charAt2;
            i2++;
        }
        byte[] copyOf2 = java.util.Arrays.copyOf(bArr, str.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
        return copyOf2;
    }
}
