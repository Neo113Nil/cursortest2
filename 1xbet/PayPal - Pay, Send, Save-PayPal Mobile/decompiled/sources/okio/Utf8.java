package okio;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0010\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\t\u0010\n\u001a\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0012\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u0015\u001a\u00020\u0010*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0018\u001a\u00020\u0010*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a;\u0010\u0019\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a;\u0010\u001b\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001a\u001a;\u0010\u001c\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0014\u0010\u001f\u001a\u00020\u00178\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0014\u0010!\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\"\"\u0014\u0010$\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\"\"\u0014\u0010%\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\"\"\u0014\u0010&\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\"\"\u0014\u0010'\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\"\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "", "beginIndex", "endIndex", "", io.ktor.http.ContentDisposition.Parameters.Size, "(Ljava/lang/String;II)J", "codePoint", "", "isIsoControl", "(I)Z", "", "byte", "isUtf8Continuation", "(B)Z", "Lkotlin/Function1;", "", "yield", "processUtf8Bytes", "(Ljava/lang/String;IILkotlin/jvm/functions/Function1;)V", "", "processUtf8CodePoints", "([BIILkotlin/jvm/functions/Function1;)V", "", "processUtf16Chars", "process2Utf8Bytes", "([BIILkotlin/jvm/functions/Function1;)I", "process3Utf8Bytes", "process4Utf8Bytes", "REPLACEMENT_BYTE", "B", "REPLACEMENT_CHARACTER", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "REPLACEMENT_CODE_POINT", com.visa.cbp.getEncExpo.warmup, "HIGH_SURROGATE_HEADER", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i) {
        if (i < 0 || i >= 32) {
            return 127 <= i && i < 160;
        }
        return true;
    }

    public static final boolean isUtf8Continuation(byte b) {
        return (b & com.visa.cbp.getEncExpo.startTransaction) == 128;
    }

    public static /* synthetic */ long size$default(java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return size(str, i, i2);
    }

    public static final long size(java.lang.String str, int i, int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("beginIndex < 0: ".concat(java.lang.String.valueOf(i)).toString());
        }
        if (i2 < i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("endIndex < beginIndex: ");
            sb.append(i2);
            sb.append(" < ");
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (i2 > str.length()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("endIndex > string.length: ");
            sb2.append(i2);
            sb2.append(" > ");
            sb2.append(str.length());
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        long j = 0;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                j++;
            } else {
                if (charAt < 2048) {
                    i3 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i3 = 3;
                } else {
                    int i4 = i + 1;
                    char charAt2 = i4 < i2 ? str.charAt(i4) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j++;
                        i = i4;
                    } else {
                        j += 4;
                        i += 2;
                    }
                }
                j += i3;
            }
            i++;
        }
        return j;
    }

    public static final void processUtf8Bytes(java.lang.String str, int i, int i2, kotlin.jvm.functions.Function1<? super java.lang.Byte, kotlin.Unit> function1) {
        int i3;
        char charAt;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (kotlin.jvm.internal.Intrinsics.compare((int) charAt2, 128) < 0) {
                function1.invoke(java.lang.Byte.valueOf((byte) charAt2));
                while (true) {
                    i++;
                    if (i < i2 && kotlin.jvm.internal.Intrinsics.compare((int) str.charAt(i), 128) < 0) {
                        function1.invoke(java.lang.Byte.valueOf((byte) str.charAt(i)));
                    }
                }
            } else {
                if (kotlin.jvm.internal.Intrinsics.compare((int) charAt2, 2048) < 0) {
                    function1.invoke(java.lang.Byte.valueOf((byte) ((charAt2 >> 6) | 192)));
                    function1.invoke(java.lang.Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (55296 > charAt2 || charAt2 >= 57344) {
                    function1.invoke(java.lang.Byte.valueOf((byte) ((charAt2 >> '\f') | 224)));
                    function1.invoke(java.lang.Byte.valueOf((byte) (((charAt2 >> 6) & 63) | 128)));
                    function1.invoke(java.lang.Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (kotlin.jvm.internal.Intrinsics.compare((int) charAt2, 56319) > 0 || i2 <= (i3 = i + 1) || 56320 > (charAt = str.charAt(i3)) || charAt >= 57344) {
                    function1.invoke((byte) 63);
                } else {
                    int charAt3 = ((charAt2 << '\n') + str.charAt(i3)) - 56613888;
                    function1.invoke(java.lang.Byte.valueOf((byte) ((charAt3 >> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE)));
                    function1.invoke(java.lang.Byte.valueOf((byte) (((charAt3 >> 12) & 63) | 128)));
                    function1.invoke(java.lang.Byte.valueOf((byte) (((charAt3 >> 6) & 63) | 128)));
                    function1.invoke(java.lang.Byte.valueOf((byte) ((charAt3 & 63) | 128)));
                    i += 2;
                }
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ed, code lost:
    
        if ((r10[r0] & com.visa.cbp.getEncExpo.startTransaction) == 128) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007e, code lost:
    
        if ((r10[r0] & com.visa.cbp.getEncExpo.startTransaction) == 128) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void processUtf8CodePoints(byte[] bArr, int i, int i2, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        while (i < i2) {
            byte b = bArr[i];
            if (b >= 0) {
                function1.invoke(java.lang.Integer.valueOf(b));
                i++;
                while (i < i2) {
                    byte b2 = bArr[i];
                    if (b2 >= 0) {
                        i++;
                        function1.invoke(java.lang.Integer.valueOf(b2));
                    }
                }
            } else {
                int i3 = 2;
                if ((b >> 5) == -2) {
                    int i4 = i + 1;
                    if (i2 > i4) {
                        byte b3 = bArr[i4];
                        if ((b3 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                            int i5 = (b << 6) ^ (b3 ^ 3968);
                            function1.invoke(i5 < 128 ? 65533 : java.lang.Integer.valueOf(i5));
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            i += i3;
                        }
                    }
                    function1.invoke(65533);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    i3 = 1;
                    i += i3;
                } else if ((b >> 4) == -2) {
                    int i6 = i + 2;
                    if (i2 <= i6) {
                        function1.invoke(65533);
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        int i7 = i + 1;
                        if (i2 > i7) {
                        }
                        i3 = 1;
                        i += i3;
                    } else {
                        byte b4 = bArr[i + 1];
                        if ((b4 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                            byte b5 = bArr[i6];
                            if ((b5 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                                int i8 = (b << com.google.common.base.Ascii.FF) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                                function1.invoke((i8 >= 2048 && (55296 > i8 || i8 >= 57344)) ? java.lang.Integer.valueOf(i8) : 65533);
                                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                i3 = 3;
                                i += i3;
                            } else {
                                function1.invoke(65533);
                                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                i += i3;
                            }
                        } else {
                            function1.invoke(65533);
                            kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                            i3 = 1;
                            i += i3;
                        }
                    }
                } else if ((b >> 3) == -2) {
                    int i9 = i + 3;
                    if (i2 <= i9) {
                        function1.invoke(65533);
                        kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                        int i10 = i + 1;
                        if (i2 > i10 && (bArr[i10] & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                            int i11 = i + 2;
                            if (i2 > i11) {
                            }
                            i += i3;
                        }
                        i3 = 1;
                        i += i3;
                    } else {
                        byte b6 = bArr[i + 1];
                        if ((b6 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                            byte b7 = bArr[i + 2];
                            if ((b7 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                                byte b8 = bArr[i9];
                                if ((b8 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                                    int i12 = (b << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << com.google.common.base.Ascii.FF));
                                    function1.invoke((i12 <= 1114111 && (55296 > i12 || i12 >= 57344) && i12 >= 65536) ? java.lang.Integer.valueOf(i12) : 65533);
                                    kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                                    i3 = 4;
                                } else {
                                    function1.invoke(65533);
                                    kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                                    i3 = 3;
                                }
                            } else {
                                function1.invoke(65533);
                                kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                            }
                            i += i3;
                        } else {
                            function1.invoke(65533);
                            kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
                            i3 = 1;
                            i += i3;
                        }
                    }
                } else {
                    function1.invoke(65533);
                    i++;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e7, code lost:
    
        if ((r10[r0] & com.visa.cbp.getEncExpo.startTransaction) == 128) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x007d, code lost:
    
        if ((r10[r0] & com.visa.cbp.getEncExpo.startTransaction) == 128) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void processUtf16Chars(byte[] bArr, int i, int i2, kotlin.jvm.functions.Function1<? super java.lang.Character, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        while (i < i2) {
            byte b = bArr[i];
            if (b >= 0) {
                function1.invoke(java.lang.Character.valueOf((char) b));
                i++;
                while (i < i2) {
                    byte b2 = bArr[i];
                    if (b2 >= 0) {
                        i++;
                        function1.invoke(java.lang.Character.valueOf((char) b2));
                    }
                }
            } else {
                int i3 = 2;
                if ((b >> 5) == -2) {
                    int i4 = i + 1;
                    if (i2 > i4) {
                        byte b3 = bArr[i4];
                        if ((b3 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                            int i5 = (b << 6) ^ (b3 ^ 3968);
                            function1.invoke(java.lang.Character.valueOf(i5 >= 128 ? (char) i5 : (char) 65533));
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            i += i3;
                        }
                    }
                    function1.invoke((char) 65533);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    i3 = 1;
                    i += i3;
                } else if ((b >> 4) == -2) {
                    int i6 = i + 2;
                    if (i2 <= i6) {
                        function1.invoke((char) 65533);
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        int i7 = i + 1;
                        if (i2 > i7) {
                        }
                        i3 = 1;
                        i += i3;
                    } else {
                        byte b4 = bArr[i + 1];
                        if ((b4 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                            byte b5 = bArr[i6];
                            if ((b5 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                                int i8 = (b << com.google.common.base.Ascii.FF) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                                if (i8 >= 2048 && (55296 > i8 || i8 >= 57344)) {
                                    r5 = (char) i8;
                                }
                                function1.invoke(java.lang.Character.valueOf(r5));
                                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                i3 = 3;
                                i += i3;
                            } else {
                                function1.invoke((char) 65533);
                                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                i += i3;
                            }
                        } else {
                            function1.invoke((char) 65533);
                            kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                            i3 = 1;
                            i += i3;
                        }
                    }
                } else if ((b >> 3) == -2) {
                    int i9 = i + 3;
                    if (i2 <= i9) {
                        function1.invoke((char) 65533);
                        kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                        int i10 = i + 1;
                        if (i2 > i10 && (bArr[i10] & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                            int i11 = i + 2;
                            if (i2 > i11) {
                            }
                            i += i3;
                        }
                        i3 = 1;
                        i += i3;
                    } else {
                        byte b6 = bArr[i + 1];
                        if ((b6 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                            byte b7 = bArr[i + 2];
                            if ((b7 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                                byte b8 = bArr[i9];
                                if ((b8 & com.visa.cbp.getEncExpo.startTransaction) == 128) {
                                    int i12 = (b << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << com.google.common.base.Ascii.FF));
                                    if (i12 <= 1114111 && ((55296 > i12 || i12 >= 57344) && i12 >= 65536 && i12 != 65533)) {
                                        function1.invoke(java.lang.Character.valueOf((char) ((i12 >>> 10) + 55232)));
                                        function1.invoke(java.lang.Character.valueOf((char) ((i12 & 1023) + 56320)));
                                    } else {
                                        function1.invoke((char) 65533);
                                    }
                                    kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
                                    i3 = 4;
                                } else {
                                    function1.invoke((char) 65533);
                                    kotlin.Unit unit9 = kotlin.Unit.INSTANCE;
                                    i3 = 3;
                                }
                            } else {
                                function1.invoke((char) 65533);
                                kotlin.Unit unit10 = kotlin.Unit.INSTANCE;
                            }
                            i += i3;
                        } else {
                            function1.invoke((char) 65533);
                            kotlin.Unit unit11 = kotlin.Unit.INSTANCE;
                            i3 = 1;
                            i += i3;
                        }
                    }
                } else {
                    function1.invoke((char) 65533);
                    i++;
                }
            }
        }
    }

    public static final int process2Utf8Bytes(byte[] bArr, int i, int i2, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        int i3 = i + 1;
        if (i2 <= i3) {
            function1.invoke(65533);
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i3];
        if ((b2 & com.visa.cbp.getEncExpo.startTransaction) != 128) {
            function1.invoke(65533);
            return 1;
        }
        int i4 = (b2 ^ 3968) ^ (b << 6);
        if (i4 < 128) {
            function1.invoke(65533);
            return 2;
        }
        function1.invoke(java.lang.Integer.valueOf(i4));
        return 2;
    }

    public static final int process3Utf8Bytes(byte[] bArr, int i, int i2, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        int i3 = i + 2;
        if (i2 <= i3) {
            function1.invoke(65533);
            int i4 = i + 1;
            return (i2 <= i4 || (bArr[i4] & com.visa.cbp.getEncExpo.startTransaction) != 128) ? 1 : 2;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if ((b2 & com.visa.cbp.getEncExpo.startTransaction) != 128) {
            function1.invoke(65533);
            return 1;
        }
        byte b3 = bArr[i3];
        if ((b3 & com.visa.cbp.getEncExpo.startTransaction) != 128) {
            function1.invoke(65533);
            return 2;
        }
        int i5 = ((b3 ^ (-123008)) ^ (b2 << 6)) ^ (b << com.google.common.base.Ascii.FF);
        if (i5 < 2048) {
            function1.invoke(65533);
            return 3;
        }
        if (55296 <= i5 && i5 < 57344) {
            function1.invoke(65533);
            return 3;
        }
        function1.invoke(java.lang.Integer.valueOf(i5));
        return 3;
    }

    public static final int process4Utf8Bytes(byte[] bArr, int i, int i2, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        int i3 = i + 3;
        if (i2 <= i3) {
            function1.invoke(65533);
            int i4 = i + 1;
            if (i2 <= i4 || (bArr[i4] & com.visa.cbp.getEncExpo.startTransaction) != 128) {
                return 1;
            }
            int i5 = i + 2;
            return (i2 <= i5 || (bArr[i5] & com.visa.cbp.getEncExpo.startTransaction) != 128) ? 2 : 3;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if ((b2 & com.visa.cbp.getEncExpo.startTransaction) != 128) {
            function1.invoke(65533);
            return 1;
        }
        byte b3 = bArr[i + 2];
        if ((b3 & com.visa.cbp.getEncExpo.startTransaction) != 128) {
            function1.invoke(65533);
            return 2;
        }
        byte b4 = bArr[i3];
        if ((b4 & com.visa.cbp.getEncExpo.startTransaction) != 128) {
            function1.invoke(65533);
            return 3;
        }
        int i6 = (((b4 ^ 3678080) ^ (b3 << 6)) ^ (b2 << com.google.common.base.Ascii.FF)) ^ (b << 18);
        if (i6 > 1114111) {
            function1.invoke(65533);
            return 4;
        }
        if (55296 <= i6 && i6 < 57344) {
            function1.invoke(65533);
            return 4;
        }
        if (i6 < 65536) {
            function1.invoke(65533);
            return 4;
        }
        function1.invoke(java.lang.Integer.valueOf(i6));
        return 4;
    }

    public static final long size(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return size$default(str, i, 0, 2, null);
    }

    public static final long size(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return size$default(str, 0, 0, 3, null);
    }
}
