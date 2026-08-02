package util.h.xy.c;

/* loaded from: classes5.dex */
public final class a<E> {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static char[] getHighSpeedVideoSizes = null;
    private static long getHighSpeedVideoSizesFor = 0;
    private static boolean getInputFormats = false;
    private static boolean getInputSizeshNQ4ISI = false;
    private static int getOutputFormats = 0;
    private static int getOutputMinFrameDuration = 1;
    private static char getOutputMinFrameDurationlomOqCM;
    private static int getOutputSizes;
    private static int getOutputSizeshNQ4ISI;
    private boolean getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private java.lang.Object[] getValidOutputFormatsForInputhNQ4ISI;

    public a() {
        this(10);
    }

    public a(int i) {
        this.getOutputStallDuration = false;
        this.getValidOutputFormatsForInputhNQ4ISI = new java.lang.Object[getHighSpeedVideoFpsRangesFor(i)];
    }

    private a(java.lang.Object[] objArr) {
        this.getOutputStallDuration = true;
        int length = objArr.length;
        this.getOutputStallDurationlomOqCM = length;
        java.lang.Object[] objArr2 = new java.lang.Object[length];
        this.getValidOutputFormatsForInputhNQ4ISI = objArr2;
        getHighSpeedVideoFpsRangesFor(objArr, objArr2, length);
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c) {
        char[] cArr;
        int i2 = getOutputMinFrameDuration + 111;
        int i3 = i2 % 128;
        getOutputFormats = i3;
        int i4 = i2 % 2;
        getOutputMinFrameDuration = (i3 + 33) % 128;
        int i5 = i3 + 95;
        getOutputMinFrameDuration = i5 % 128;
        char[] cArr2 = str3;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str3 != null) {
            cArr2 = str3.toCharArray();
        }
        char[] cArr3 = cArr2;
        if (str2 != null) {
            int i6 = getOutputFormats + 79;
            getOutputMinFrameDuration = i6 % 128;
            if (i6 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            char[] charArray = str2.toCharArray();
            getHighSpeedVideoFpsRanges = (getOutputSizes + 93) % 128;
            cArr = charArray;
        } else {
            getOutputFormats = (getOutputMinFrameDuration + 1) % 128;
            cArr = str2;
        }
        char[] cArr4 = cArr;
        char[] cArr5 = str;
        if (str != null) {
            getOutputMinFrameDuration = (getOutputFormats + 61) % 128;
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = (char[]) cArr3.clone();
        char[] cArr7 = (char[]) cArr5.clone();
        int i7 = 0;
        cArr6[0] = (char) (c ^ cArr6[0]);
        cArr7[2] = (char) (cArr7[2] + ((char) i));
        int length = cArr4.length;
        char[] cArr8 = new char[length];
        while (true) {
            if (i7 >= length) {
                getOutputFormats = (getOutputMinFrameDuration + 7) % 128;
                break;
            }
            int i8 = getOutputMinFrameDuration + 53;
            getOutputFormats = i8 % 128;
            if (i8 % 2 != 0) {
                break;
            }
            int i9 = getOutputSizes + 69;
            getHighSpeedVideoFpsRanges = i9 % 128;
            if (i9 % 2 == 0) {
                util.h.xy.b.c.m25287(cArr6, cArr7, i7);
                cArr8[i7] = (char) ((((cArr4[i7] & cArr6[(i7 >>> 3) * 4]) | getHighSpeedVideoSizesFor) & getOutputSizeshNQ4ISI) - getOutputMinFrameDurationlomOqCM);
                i7 += 23;
            } else {
                util.h.xy.b.c.m25287(cArr6, cArr7, i7);
                cArr8[i7] = (char) ((((cArr4[i7] ^ cArr6[(i7 + 3) % 4]) ^ getHighSpeedVideoSizesFor) ^ getOutputSizeshNQ4ISI) ^ getOutputMinFrameDurationlomOqCM);
                i7++;
            }
        }
        return new java.lang.String(cArr8);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final boolean m25826(E e) {
        synchronized (this) {
            int i = getOutputMinFrameDuration;
            getOutputFormats = (i + 43) % 128;
            int i2 = getOutputSizes + 79;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (this.getOutputStallDuration) {
                getOutputFormats = (i + 55) % 128;
                throw new java.lang.UnsupportedOperationException((java.lang.String) null);
            }
            getHighSpeedVideoFpsRanges(this.getOutputStallDurationlomOqCM + 1);
            java.lang.Object[] objArr = this.getValidOutputFormatsForInputhNQ4ISI;
            int i3 = this.getOutputStallDurationlomOqCM;
            this.getOutputStallDurationlomOqCM = i3 + 1;
            objArr[i3] = e;
            int i4 = getOutputFormats + 1;
            getOutputMinFrameDuration = i4 % 128;
            if (i4 % 2 == 0) {
                getOutputSizes = (getHighSpeedVideoFpsRanges >> 48) << 8871;
            } else {
                getOutputSizes = (getHighSpeedVideoFpsRanges + 117) % 128;
            }
        }
        return true;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25824() {
        synchronized (this) {
            int i = getOutputFormats;
            int i2 = i + 105;
            getOutputMinFrameDuration = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 3;
            }
            getOutputMinFrameDuration = (i + 99) % 128;
            int i4 = getOutputSizes;
            int i5 = i4 + 71;
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = i + 43;
                int i7 = i6 % 128;
                getOutputMinFrameDuration = i7;
                if (i6 % 2 != 0) {
                    if (this.getOutputStallDuration) {
                        throw new java.lang.UnsupportedOperationException((java.lang.String) null);
                    }
                    getOutputFormats = (i7 + 87) % 128;
                    int i8 = i4 + 57;
                    getHighSpeedVideoFpsRanges = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= this.getOutputStallDurationlomOqCM) {
                            int i11 = getOutputFormats + 37;
                            getOutputMinFrameDuration = i11 % 128;
                            if (i11 % 2 != 0) {
                                this.getOutputStallDurationlomOqCM = 0;
                            }
                        }
                        this.getValidOutputFormatsForInputhNQ4ISI[i10] = null;
                        i10++;
                    }
                }
            }
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final E m25827(int i) {
        E Camera2StreamConfigurationMap2;
        synchronized (this) {
            int i2 = getOutputFormats;
            int i3 = (i2 + 59) % 128;
            getOutputMinFrameDuration = i3;
            int i4 = getHighSpeedVideoFpsRanges + 41;
            getOutputSizes = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = i2 + 75;
                getOutputMinFrameDuration = i5 % 128;
                if (i5 % 2 != 0) {
                    getHighSpeedVideoSizes(i);
                    Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(i);
                    getOutputSizes = (getHighSpeedVideoFpsRanges + 55) % 128;
                }
            } else {
                getOutputFormats = (i3 + 33) % 128;
            }
            getHighSpeedVideoSizes(i);
            Camera2StreamConfigurationMap(i);
            throw new java.lang.ArithmeticException();
        }
        return Camera2StreamConfigurationMap2;
    }

    private static void Camera2StreamConfigurationMap(int i, java.lang.String str, java.lang.Object[] objArr) {
        int i2 = getHighSpeedVideoFpsRangesFor + 1;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getHighSpeedVideoSizes;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i4 = (int) ((-3299939579226817547L) ^ getHighResolutionOutputSizeshNQ4ISI);
        if (!getInputSizeshNQ4ISI) {
            if (!getInputFormats) {
                throw null;
            }
            int i5 = getHighSpeedVideoFpsRangesFor + 67;
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            throw null;
        }
        mdVar.f2642 = bytes.length;
        char[] cArr3 = new char[mdVar.f2642];
        mdVar.f2643 = 0;
        while (mdVar.f2643 < mdVar.f2642) {
            cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i4);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0031, code lost:
    
        if ((r1 % 2) != 0) goto L10;
     */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m25825() {
        int i;
        synchronized (this) {
            int i2 = getOutputMinFrameDuration;
            getOutputFormats = (i2 + 75) % 128;
            getOutputFormats = (i2 + 121) % 128;
            int i3 = i2 + 83;
            getOutputFormats = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getOutputSizes;
                getHighSpeedVideoFpsRanges = (i4 + 126) << 1958;
                if (i4 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE != 0) {
                    i = this.getOutputStallDurationlomOqCM;
                    getOutputFormats = (i2 + 29) % 128;
                    int i5 = getOutputSizes + 19;
                    getHighSpeedVideoFpsRanges = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw new java.lang.NullPointerException();
                    }
                }
                throw new java.lang.ArithmeticException();
            }
            int i6 = getOutputSizes + 9;
            getHighSpeedVideoFpsRanges = i6 % 128;
        }
        return i;
    }

    private E Camera2StreamConfigurationMap(int i) {
        int i2 = getOutputFormats + 29;
        int i3 = i2 % 128;
        getOutputMinFrameDuration = i3;
        if (i2 % 2 == 0) {
            int i4 = 4 / 5;
        }
        getOutputFormats = (i3 + 63) % 128;
        int i5 = getOutputSizes;
        int i6 = (i5 ^ 52) + ((i5 & 52) << 1);
        int i7 = ((~i6) + (i6 << 1)) % 128;
        getHighSpeedVideoFpsRanges = i7;
        E e = (E) this.getValidOutputFormatsForInputhNQ4ISI[i];
        getOutputSizes = ((i7 ^ 77) + ((i7 & 77) << 1)) % 128;
        return e;
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.Object obj, java.lang.Object obj2, int i) {
        int i2 = (getOutputFormats + 117) % 128;
        getOutputMinFrameDuration = i2;
        getOutputFormats = (i2 + 109) % 128;
        int i3 = getOutputSizes;
        int i4 = (((i3 & 82) + (i3 | 82)) - 1) % 128;
        getHighSpeedVideoFpsRanges = i4;
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        java.lang.Object[] objArr2 = (java.lang.Object[]) obj2;
        int i5 = i4 & 33;
        int i6 = ((i4 ^ 33) | i5) << 1;
        int i7 = -((~i5) & (i4 | 33));
        getOutputSizes = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
        int i8 = 0;
        while (i8 < i) {
            int i9 = getOutputMinFrameDuration;
            getOutputFormats = (i9 + 95) % 128;
            int i10 = getHighSpeedVideoFpsRanges;
            int i11 = i10 ^ 21;
            int i12 = -(-((i10 & 21) << 1));
            getOutputSizes = ((i11 & i12) + (i11 | i12)) % 128;
            objArr2[i8] = objArr[i8];
            int i13 = i8 & 19;
            int i14 = -(-((i8 ^ 19) | i13));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            int i16 = i15 ^ (-18);
            int i17 = (i15 & (-18)) << 1;
            i8 = (i16 ^ i17) + ((i16 & i17) << 1);
            int i18 = (-2) - (~((i10 & 92) + (i10 | 92)));
            getOutputSizes = i18 % 128;
            if (i18 % 2 == 0) {
                getOutputFormats = (i9 + 39) % 128;
            }
        }
        int i19 = getOutputSizes;
        int i20 = ((i19 & 91) - (~(i19 | 91))) - 1;
        getHighSpeedVideoFpsRanges = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = getOutputFormats;
            getOutputMinFrameDuration = (i21 + 105) % 128;
            int i22 = i21 + 107;
            getOutputMinFrameDuration = i22 % 128;
            if (i22 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if ((r7 >> r6.getValidOutputFormatsForInputhNQ4ISI.length) > 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoFpsRanges(int i) {
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = ((i2 & (-6)) | ((~i2) & 5)) + ((i2 & 5) << 1);
        int i4 = i3 % 128;
        getOutputSizes = i4;
        if (i3 % 2 == 0) {
            int i5 = getOutputFormats + 49;
            int i6 = i5 % 128;
            getOutputMinFrameDuration = i6;
            if (i5 % 2 == 0) {
                int i7 = 5 / 3;
            }
            int i8 = -this.getValidOutputFormatsForInputhNQ4ISI.length;
            int i9 = i & i8;
            int i10 = -(-(i8 | i));
            if (((i9 | i10) << 1) - (i10 ^ i9) > 0) {
                getOutputFormats = (i6 + 81) % 128;
                int i11 = (i4 | 125) << 1;
                int i12 = -(i4 ^ 125);
                int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                getHighSpeedVideoFpsRanges = i13 % 128;
                if (i13 % 2 == 0) {
                    getOutputMinFrameDuration = (getOutputFormats + 43) % 128;
                    Camera2StreamConfigurationMap(getHighSpeedVideoFpsRangesFor(i), this.getValidOutputFormatsForInputhNQ4ISI.length);
                    throw new java.lang.ArithmeticException();
                }
                getOutputFormats = (getOutputMinFrameDuration + 5) % 128;
                Camera2StreamConfigurationMap(getHighSpeedVideoFpsRangesFor(i), this.getValidOutputFormatsForInputhNQ4ISI.length);
                int i14 = getHighSpeedVideoFpsRanges;
                int i15 = i14 ^ 13;
                int i16 = ((i14 & 13) | i15) << 1;
                int i17 = -i15;
                getOutputSizes = ((i16 ^ i17) + ((i16 & i17) << 1)) % 128;
            }
        }
        int i18 = getHighSpeedVideoFpsRanges;
        int i19 = (i18 ^ 34) + ((i18 & 34) << 1);
        getOutputSizes = ((~i19) + (i19 << 1)) % 128;
    }

    private void Camera2StreamConfigurationMap(int i, int i2) {
        int i3 = (getOutputFormats + 9) % 128;
        getOutputMinFrameDuration = i3;
        getOutputFormats = (i3 + 31) % 128;
        int i4 = getOutputSizes;
        int i5 = (i4 & 41) + (i4 | 41);
        getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 == 0) {
            getOutputFormats = (i3 + 5) % 128;
        }
        java.lang.Object[] objArr = new java.lang.Object[i];
        getHighSpeedVideoFpsRangesFor(this.getValidOutputFormatsForInputhNQ4ISI, objArr, i2);
        this.getValidOutputFormatsForInputhNQ4ISI = objArr;
        int i6 = getHighSpeedVideoFpsRanges;
        int i7 = i6 & 25;
        int i8 = ((i6 | 25) & (~i7)) + (i7 << 1);
        getOutputSizes = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    private static int getHighSpeedVideoFpsRangesFor(int i) {
        getOutputMinFrameDuration = (getOutputFormats + 103) % 128;
        int i2 = getOutputSizes + 63;
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.text.TextUtils.getOffsetBefore("", 0) + 127, "\u0081\u0081\u0081\u0081", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(127 - android.text.TextUtils.getCapsMode("", 0, 0), "\u0093\u0092\u0091\u0090\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082", objArr2);
            java.lang.String intern2 = ((java.lang.String) objArr2[0]).intern();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(127 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0097\u0096\u0095\u0094", objArr3);
            sb.append(getHighResolutionOutputSizeshNQ4ISI(intern, intern2, ((java.lang.String) objArr3[0]).intern(), 0, (char) 31476).intern());
            sb.append(i);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i4 = i3 & 95;
        int i5 = (i3 | 95) & (~i4);
        int i6 = i4 << 1;
        getOutputSizes = ((i5 ^ i6) + ((i5 & i6) << 1)) % 128;
        int i7 = 10;
        while (i7 < i) {
            int i8 = getOutputSizes;
            int i9 = ((i8 ^ 119) | (i8 & 119)) << 1;
            int i10 = -((i8 & (-120)) | ((~i8) & 119));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            getHighSpeedVideoFpsRanges = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = getOutputFormats + 25;
                getOutputMinFrameDuration = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = i7 & 2;
                    int i14 = (i7 | 2) & (~i13);
                    int i15 = -(-(i13 << 1));
                    i7 = ((i14 | i15) << 1) - (i14 ^ i15);
                }
            }
            i7 += 10;
        }
        int i16 = getOutputMinFrameDuration;
        getOutputFormats = (i16 + 69) % 128;
        getOutputFormats = (i16 + 101) % 128;
        int i17 = getOutputSizes;
        int i18 = ((i17 ^ 105) | (i17 & 105)) << 1;
        int i19 = -((i17 & (-106)) | ((~i17) & 105));
        getHighSpeedVideoFpsRanges = (((i18 | i19) << 1) - (i19 ^ i18)) % 128;
        return i7;
    }

    private java.lang.String getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(android.view.View.getDefaultSize(0, 0) + 127, "\u0081\u0081\u0081\u0081", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        getOutputFormats = (getOutputMinFrameDuration + 53) % 128;
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(127 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), "\u009d\u009c\u009b\u0097\u009a\u0099\u0098", objArr2);
            java.lang.String intern2 = ((java.lang.String) objArr2[0]).intern();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, "¡ \u009f\u009e", objArr3);
            sb.append(getHighResolutionOutputSizeshNQ4ISI(intern, intern2, ((java.lang.String) objArr3[0]).intern(), 1282325405, (char) 0).intern());
            sb.append(i);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.view.View.resolveSize(0, 0) + 127, "\u0081\u0081\u0081\u0081", objArr4);
            java.lang.String intern3 = ((java.lang.String) objArr4[0]).intern();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(127 - android.graphics.Color.alpha(0), "©¨§¦¥¤£¢", objArr5);
            java.lang.String intern4 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u00ad¬«ª", objArr6);
            sb.append(getHighResolutionOutputSizeshNQ4ISI(intern3, intern4, ((java.lang.String) objArr6[0]).intern(), 0, (char) 0).intern());
            sb.append(this.getOutputStallDurationlomOqCM);
            java.lang.String obj = sb.toString();
            int i2 = getOutputSizes;
            getHighSpeedVideoFpsRanges = (((i2 | 57) << 1) - ((i2 & (-58)) | ((~i2) & 57))) % 128;
            getOutputFormats = (getOutputMinFrameDuration + 89) % 128;
            return obj;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private void getHighSpeedVideoSizes(int i) {
        int i2 = (getOutputMinFrameDuration + 65) % 128;
        getOutputFormats = i2;
        getOutputMinFrameDuration = (i2 + 21) % 128;
        int i3 = (i2 + 105) % 128;
        getOutputMinFrameDuration = i3;
        int i4 = getOutputSizes;
        getHighSpeedVideoFpsRanges = (i4 + 19) % 128;
        if (i >= this.getOutputStallDurationlomOqCM) {
            throw new java.lang.IndexOutOfBoundsException(getHighResolutionOutputSizeshNQ4ISI(i));
        }
        getOutputFormats = (i3 + 13) % 128;
        int i5 = i4 & 83;
        int i6 = (~i5) & (i4 | 83);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 & i7) + (i7 | i6);
        getHighSpeedVideoFpsRanges = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.c.a<E> m25828() {
        getOutputFormats = (getOutputMinFrameDuration + 99) % 128;
        int i = this.getOutputStallDurationlomOqCM;
        java.lang.Object[] objArr = new java.lang.Object[i];
        getHighSpeedVideoFpsRangesFor(this.getValidOutputFormatsForInputhNQ4ISI, objArr, i);
        util.h.xy.c.a<E> aVar = new util.h.xy.c.a<>(objArr);
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = i2 & 97;
        int i4 = i3 + ((i2 ^ 97) | i3);
        getOutputSizes = i4 % 128;
        if (i4 % 2 == 0) {
            return aVar;
        }
        int i5 = getOutputFormats + 95;
        getOutputMinFrameDuration = i5 % 128;
        if (i5 % 2 == 0) {
            return aVar;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getOutputSizes = 0;
        getHighSpeedVideoFpsRanges = 1;
        getOutputSizeshNQ4ISI = 0;
        getHighSpeedVideoSizesFor = 0L;
        getOutputMinFrameDurationlomOqCM = (char) 28618;
        getOutputFormats = (getOutputMinFrameDuration + 93) % 128;
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoSizes = new char[]{64404, 2879, 1667, 20064, 1624, 4051, 40910, 62990, 47749, 62628, 56022, 57397, 17391, 43123, 33212, 60394, 4379, 4094, 6619, 52772, 1459, 3828, 44590, 41452, 48878, 31721, 11561, 60068, 41207, 26060, 38121, 56152, 53981, 18305, 8580, 49097, 10507, 55981, 20223, 22236, 54640, 5985, 35049, 1202, 12502};
        getHighResolutionOutputSizeshNQ4ISI = -1074857068;
        getInputFormats = true;
        getInputSizeshNQ4ISI = true;
    }
}
