package okio.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "beginIndex", "endIndex", "", "commonToUtf8String", "([BII)Ljava/lang/String;", "commonAsUtf8ToByteArray", "(Ljava/lang/String;)[B"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fb, code lost:
    
        if ((r16[r5] & com.visa.cbp.getEncExpo.startTransaction) == 128) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0090, code lost:
    
        if ((r16[r5] & com.visa.cbp.getEncExpo.startTransaction) == 128) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String commonToUtf8String(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        if (i9 < 0 || i2 > bArr.length || i9 > i2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("size=");
            sb.append(bArr.length);
            sb.append(" beginIndex=");
            sb.append(i9);
            sb.append(" endIndex=");
            sb.append(i2);
            throw new java.lang.ArrayIndexOutOfBoundsException(sb.toString());
        }
        char[] cArr = new char[i2 - i9];
        int i10 = 0;
        while (i9 < i2) {
            byte b = bArr[i9];
            if (b >= 0) {
                int i11 = i10 + 1;
                cArr[i10] = (char) b;
                i9++;
                while (i9 < i2) {
                    byte b2 = bArr[i9];
                    if (b2 < 0) {
                        break;
                    }
                    i9++;
                    cArr[i11] = (char) b2;
                    i11++;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                i10 = i11;
            } else {
                if ((b >> 5) == -2) {
                    int i12 = i9 + 1;
                    if (i2 <= i12) {
                        i3 = i10 + 1;
                        cArr[i10] = 65533;
                    } else {
                        byte b3 = bArr[i12];
                        if ((b3 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                            int i13 = (b << 6) ^ (b3 ^ 3968);
                            if (i13 < 128) {
                                i3 = i10 + 1;
                                cArr[i10] = 65533;
                            } else {
                                cArr[i10] = (char) i13;
                                i3 = i10 + 1;
                            }
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            i4 = 2;
                            i9 += i4;
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        } else {
                            i3 = i10 + 1;
                            cArr[i10] = 65533;
                        }
                    }
                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                    i4 = 1;
                    i9 += i4;
                    kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
                } else if ((b >> 4) == -2) {
                    int i14 = i9 + 2;
                    if (i2 <= i14) {
                        i3 = i10 + 1;
                        cArr[i10] = 65533;
                        kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                        int i15 = i9 + 1;
                        if (i2 > i15) {
                        }
                        i5 = 1;
                    } else {
                        byte b4 = bArr[i9 + 1];
                        if ((b4 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                            byte b5 = bArr[i14];
                            if ((b5 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                                int i16 = (b << com.google.common.base.Ascii.FF) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                                if (i16 < 2048) {
                                    i3 = i10 + 1;
                                    cArr[i10] = 65533;
                                } else if (55296 > i16 || i16 >= 57344) {
                                    cArr[i10] = (char) i16;
                                    i3 = i10 + 1;
                                } else {
                                    i3 = i10 + 1;
                                    cArr[i10] = 65533;
                                }
                                kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                                i5 = 3;
                            } else {
                                i3 = i10 + 1;
                                cArr[i10] = 65533;
                                kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                                i5 = 2;
                            }
                        } else {
                            i3 = i10 + 1;
                            cArr[i10] = 65533;
                            kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                            i5 = 1;
                        }
                    }
                    i9 += i5;
                    kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                } else if ((b >> 3) == -2) {
                    int i17 = i9 + 3;
                    if (i2 <= i17) {
                        i6 = i10 + 1;
                        cArr[i10] = 65533;
                        kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                        int i18 = i9 + 1;
                        if (i2 > i18 && (bArr[i18] & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                            int i19 = i9 + 2;
                            if (i2 > i19) {
                            }
                            i10 = i6;
                            i8 = 2;
                        }
                        i10 = i6;
                        i8 = 1;
                    } else {
                        byte b6 = bArr[i9 + 1];
                        if ((b6 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                            byte b7 = bArr[i9 + 2];
                            if ((b7 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                                byte b8 = bArr[i17];
                                if ((b8 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                                    int i20 = (b << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << com.google.common.base.Ascii.FF));
                                    if (i20 > 1114111) {
                                        i7 = i10 + 1;
                                        cArr[i10] = 65533;
                                    } else if (55296 <= i20 && i20 < 57344) {
                                        i7 = i10 + 1;
                                        cArr[i10] = 65533;
                                    } else if (i20 < 65536) {
                                        i7 = i10 + 1;
                                        cArr[i10] = 65533;
                                    } else if (i20 != 65533) {
                                        cArr[i10] = (char) ((i20 >>> 10) + 55232);
                                        cArr[i10 + 1] = (char) ((i20 & 1023) + 56320);
                                        i7 = i10 + 2;
                                    } else {
                                        cArr[i10] = 65533;
                                        i7 = i10 + 1;
                                    }
                                    kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
                                    i8 = 4;
                                    i10 = i7;
                                } else {
                                    i6 = i10 + 1;
                                    cArr[i10] = 65533;
                                    kotlin.Unit unit12 = kotlin.Unit.INSTANCE;
                                    i10 = i6;
                                    i8 = 3;
                                }
                            } else {
                                i6 = i10 + 1;
                                cArr[i10] = 65533;
                                kotlin.Unit unit13 = kotlin.Unit.INSTANCE;
                                i10 = i6;
                                i8 = 2;
                            }
                        } else {
                            i6 = i10 + 1;
                            cArr[i10] = 65533;
                            kotlin.Unit unit14 = kotlin.Unit.INSTANCE;
                            i10 = i6;
                            i8 = 1;
                        }
                    }
                    i9 += i8;
                    kotlin.Unit unit15 = kotlin.Unit.INSTANCE;
                } else {
                    i3 = i10 + 1;
                    cArr[i10] = 65533;
                    i9++;
                }
                i10 = i3;
            }
        }
        return kotlin.text.StringsKt.concatToString(cArr, 0, i10);
    }

    public static final byte[] commonAsUtf8ToByteArray(java.lang.String str) {
        int i;
        int i2;
        char charAt;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char charAt2 = str.charAt(i3);
            if (kotlin.jvm.internal.Intrinsics.compare((int) charAt2, 128) >= 0) {
                int length2 = str.length();
                int i4 = i3;
                while (i3 < length2) {
                    char charAt3 = str.charAt(i3);
                    if (kotlin.jvm.internal.Intrinsics.compare((int) charAt3, 128) < 0) {
                        int i5 = i4 + 1;
                        bArr[i4] = (byte) charAt3;
                        while (true) {
                            i3++;
                            i4 = i5;
                            if (i3 < length2 && kotlin.jvm.internal.Intrinsics.compare((int) str.charAt(i3), 128) < 0) {
                                i5 = i4 + 1;
                                bArr[i4] = (byte) str.charAt(i3);
                            }
                        }
                    } else {
                        if (kotlin.jvm.internal.Intrinsics.compare((int) charAt3, 2048) < 0) {
                            bArr[i4] = (byte) ((charAt3 >> 6) | 192);
                            i = i4 + 2;
                            bArr[i4 + 1] = (byte) ((charAt3 & '?') | 128);
                        } else if (55296 > charAt3 || charAt3 >= 57344) {
                            bArr[i4] = (byte) ((charAt3 >> '\f') | 224);
                            bArr[i4 + 1] = (byte) ((63 & (charAt3 >> 6)) | 128);
                            i = i4 + 3;
                            bArr[i4 + 2] = (byte) ((charAt3 & '?') | 128);
                        } else if (kotlin.jvm.internal.Intrinsics.compare((int) charAt3, 56319) > 0 || length2 <= (i2 = i3 + 1) || 56320 > (charAt = str.charAt(i2)) || charAt >= 57344) {
                            bArr[i4] = 63;
                            i3++;
                            i4++;
                        } else {
                            int charAt4 = ((charAt3 << '\n') + str.charAt(i2)) - 56613888;
                            bArr[i4] = (byte) ((charAt4 >> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                            bArr[i4 + 1] = (byte) (((charAt4 >> 12) & 63) | 128);
                            bArr[i4 + 2] = (byte) (((charAt4 >> 6) & 63) | 128);
                            bArr[i4 + 3] = (byte) ((charAt4 & 63) | 128);
                            i3 += 2;
                            i4 += 4;
                        }
                        i4 = i;
                        i3++;
                    }
                }
                byte[] copyOf = java.util.Arrays.copyOf(bArr, i4);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                return copyOf;
            }
            bArr[i3] = (byte) charAt2;
            i3++;
        }
        byte[] copyOf2 = java.util.Arrays.copyOf(bArr, str.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
        return copyOf2;
    }
}
