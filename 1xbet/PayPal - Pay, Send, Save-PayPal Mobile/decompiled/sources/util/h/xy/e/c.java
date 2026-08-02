package util.h.xy.e;

/* loaded from: classes5.dex */
public final class c {
    private static char Camera2StreamConfigurationMap = 0;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor = 0;
    private static char getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 0;
    private static int getOutputFormats = 1;
    private static char[] getOutputMinFrameDuration;
    private static int getOutputStallDuration;
    private static char[] getOutputStallDurationlomOqCM;

    final util.h.xy.e.rb getHighSpeedVideoSizes(java.io.InputStream inputStream) throws util.h.xy.c.ma {
        java.lang.String m26466;
        int i;
        util.h.xy.e.mb mbVar = new util.h.xy.e.mb();
        try {
            if (inputStream == null) {
                int i2 = getInputSizeshNQ4ISI;
                int i3 = i2 & 13;
                int i4 = i3 + ((i2 ^ 13) | i3);
                getHighSpeedVideoSizesFor = i4 % 128;
                if (i4 % 2 == 0) {
                    getOutputFormats = (getHighSpeedVideoFpsRanges + 33) % 128;
                    mbVar.m26465();
                    throw null;
                }
                m26466 = mbVar.m26465();
            } else {
                m26466 = mbVar.m26466(inputStream);
                int i5 = getHighSpeedVideoSizesFor;
                int i6 = i5 & 57;
                getInputSizeshNQ4ISI = ((((i5 | 57) & (~i6)) - (~(-(-(i6 << 1))))) - 1) % 128;
            }
            int i7 = getInputSizeshNQ4ISI;
            getHighSpeedVideoSizesFor = (((((i7 ^ 89) | (i7 & 89)) << 1) - (~(-((i7 & (-90)) | ((~i7) & 89))))) - 1) % 128;
            if (m26466 == null) {
                throw new util.h.xy.c.ma(121, null);
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) (106 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u0015\u001b\u0018\u0003㗴", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 5, objArr);
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(m26466.getBytes(java.nio.charset.Charset.forName(getHighSpeedVideoSizes(5, true, ((java.lang.String) objArr[0]).intern(), 5, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE).intern())));
            int i8 = getHighSpeedVideoSizesFor;
            int i9 = (i8 & (-10)) | ((~i8) & 9);
            int i10 = (i8 & 9) << 1;
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            getInputSizeshNQ4ISI = i11 % 128;
            int i12 = i11 % 2;
            try {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(true, new int[]{0, 35, 11, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001", objArr2);
                    java.lang.Class<?> cls = java.lang.Class.forName(getHighSpeedVideoSizes(35, true, ((java.lang.String) objArr2[0]).intern(), 35, com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE).intern());
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((byte) (23 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), "\u0017\u0011\u001b\u000b\u0012\u0011!\u000b\u001f\u0017㖳", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10, objArr3);
                    java.lang.Object invoke = cls.getMethod(getHighSpeedVideoSizes(11, true, ((java.lang.String) objArr3[0]).intern(), 8, 302).intern(), null).invoke(null, null);
                    int i13 = getInputSizeshNQ4ISI;
                    getHighSpeedVideoSizesFor = (i13 + 31) % 128;
                    int i14 = ((i13 | 76) << 1) - (i13 ^ 76);
                    getHighSpeedVideoSizesFor = ((~i14) + (i14 << 1)) % 128;
                    try {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(true, new int[]{0, 35, 11, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001", objArr4);
                        java.lang.Class<?> cls2 = java.lang.Class.forName(getHighSpeedVideoSizes(35, true, ((java.lang.String) objArr4[0]).intern(), 35, com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE).intern());
                        byte red = (byte) (android.graphics.Color.red(0) + 108);
                        getHighSpeedVideoFpsRanges = (getOutputFormats + 53) % 128;
                        try {
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(red, "#\u0005\u000b\n\u001e\u0011\u0012\n㘊㘊\u0017\u0010㗼", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 13, objArr5);
                            org.xmlpull.v1.XmlPullParser xmlPullParser = (org.xmlpull.v1.XmlPullParser) cls2.getMethod(getHighSpeedVideoSizes(13, false, ((java.lang.String) objArr5[0]).intern(), 3, 302).intern(), null).invoke(invoke, null);
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(true, new int[]{35, 58, 69, 0}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001", objArr6);
                            java.lang.String intern = getHighSpeedVideoSizes(58, false, ((java.lang.String) objArr6[0]).intern(), 30, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE).intern();
                            int i15 = getInputSizeshNQ4ISI;
                            int i16 = (i15 & 41) + (i15 | 41);
                            int i17 = i16 % 128;
                            getHighSpeedVideoSizesFor = i17;
                            if (i16 % 2 == 0) {
                                getHighSpeedVideoFpsRanges = (getOutputFormats + 87) % 128;
                            }
                            int i18 = i17 + 88;
                            getInputSizeshNQ4ISI = ((~i18) + (i18 << 1)) % 128;
                            try {
                                java.lang.Object[] objArr7 = {intern, java.lang.Boolean.FALSE};
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor((byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 94), "!\u0018\r \u0019\u001a\u0002\u0000\u0019\u0004\u001d\u001a\u000b\u001c\u0019\u001d\u001a\u0018\u0015\u0006㖧㖧\f\u0018\u0018\t\b\f", 28 - android.text.TextUtils.getTrimmedLength(""), objArr8);
                                java.lang.Class<?> cls3 = java.lang.Class.forName(getHighSpeedVideoSizes(((java.lang.String) objArr8[0]).intern(), (byte) 100, 28).intern());
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor(false, new int[]{93, 10, 36, 0}, "\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000", objArr9);
                                cls3.getMethod(getHighSpeedVideoSizes(((java.lang.String) objArr9[0]).intern(), (byte) 71, 10).intern(), java.lang.String.class, java.lang.Boolean.TYPE).invoke(xmlPullParser, objArr7);
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor((byte) (105 - android.graphics.Color.red(0)), "\u0015\u001b\u0018\u0003㗴", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, objArr10);
                                java.lang.String intern2 = getHighSpeedVideoSizes(5, true, ((java.lang.String) objArr10[0]).intern(), 5, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE).intern();
                                int i19 = getOutputFormats;
                                getHighSpeedVideoFpsRanges = (i19 + 79) % 128;
                                int i20 = getInputSizeshNQ4ISI;
                                int i21 = i20 & 1;
                                int i22 = (i20 ^ 1) | i21;
                                getHighSpeedVideoSizesFor = (((i21 | i22) << 1) - (i21 ^ i22)) % 128;
                                int i23 = i19 + 75;
                                getHighSpeedVideoFpsRanges = i23 % 128;
                                if (i23 % 2 != 0) {
                                    int i24 = (i20 & (-41)) | ((~i20) & 40);
                                    int i25 = (i20 & 40) >> 1;
                                    i = ((i24 | i25) % (i24 ^ i25)) - 5357;
                                } else {
                                    int i26 = (i20 & (-120)) | ((~i20) & 119);
                                    int i27 = (i20 & 119) << 1;
                                    i = (((i26 | i27) << 1) - (i26 ^ i27)) % 128;
                                }
                                getHighSpeedVideoSizesFor = i;
                                try {
                                    java.lang.Object[] objArr11 = {byteArrayInputStream, intern2};
                                    try {
                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor((byte) (92 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), "!\u0018\r \u0019\u001a\u0002\u0000\u0019\u0004\u001d\u001a\u000b\u001c\u0019\u001d\u001a\u0018\u0015\u0006㖧㖧\f\u0018\u0018\t\b\f", 27 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), objArr12);
                                        java.lang.Class<?> cls4 = java.lang.Class.forName(getHighSpeedVideoSizes(((java.lang.String) objArr12[0]).intern(), (byte) 100, 28).intern());
                                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor(false, new int[]{103, 8, 70, 2}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000", objArr13);
                                        cls4.getMethod(getHighSpeedVideoSizes(((java.lang.String) objArr13[0]).intern(), (byte) 71, 8).intern(), java.io.InputStream.class, java.lang.String.class).invoke(xmlPullParser, objArr11);
                                        util.h.xy.e.rb highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(xmlPullParser);
                                        int i28 = getInputSizeshNQ4ISI;
                                        int i29 = i28 & 59;
                                        int i30 = (i28 | 59) & (~i29);
                                        int i31 = -(-(i29 << 1));
                                        int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
                                        int i33 = i32 % 128;
                                        getHighSpeedVideoSizesFor = i33;
                                        if (i32 % 2 == 0) {
                                            int i34 = 2 / 5;
                                        }
                                        int i35 = getHighSpeedVideoFpsRanges + 23;
                                        getOutputFormats = i35 % 128;
                                        if (i35 % 2 == 0) {
                                            getInputSizeshNQ4ISI = ((i33 << (-54)) % 1) - 29857;
                                            return highSpeedVideoFpsRanges;
                                        }
                                        getInputSizeshNQ4ISI = (i33 + 27) % 128;
                                        return highSpeedVideoFpsRanges;
                                    } catch (java.lang.Throwable th) {
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th2) {
                                    java.lang.Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    getHighSpeedVideoFpsRanges = (getOutputFormats + 55) % 128;
                                    throw th2;
                                }
                            } catch (java.lang.Throwable th3) {
                                java.lang.Throwable cause3 = th3.getCause();
                                if (cause3 == null) {
                                    throw th3;
                                }
                                int i36 = getOutputFormats + 23;
                                getHighSpeedVideoFpsRanges = i36 % 128;
                                if (i36 % 2 != 0) {
                                    throw new java.lang.NullPointerException();
                                }
                                throw cause3;
                            }
                        } catch (java.lang.Throwable th4) {
                            java.lang.Throwable cause4 = th4.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th4;
                        }
                    } catch (java.lang.Throwable th5) {
                        java.lang.Throwable cause5 = th5.getCause();
                        if (cause5 != null) {
                            throw cause5;
                        }
                        throw th5;
                    }
                } catch (java.lang.Throwable th6) {
                    java.lang.Throwable cause6 = th6.getCause();
                    if (cause6 != null) {
                        throw cause6;
                    }
                    throw th6;
                }
            } catch (org.xmlpull.v1.XmlPullParserException unused) {
                throw new util.h.xy.c.ma(109, null);
            }
        } catch (java.io.IOException | java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException unused2) {
            throw new util.h.xy.c.ma(127, null);
        }
    }

    private static java.lang.String getHighSpeedVideoSizes(int i, boolean z, java.lang.String str, int i2, int i3) {
        getOutputFormats = (getHighSpeedVideoFpsRanges + 111) % 128;
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 13) % 128;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = new char[i];
        int i4 = 0;
        int i5 = 0;
        while (i5 < i) {
            int i6 = getOutputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            int i7 = i6 % 128;
            getHighSpeedVideoFpsRanges = i7;
            if (i6 % 2 != 0) {
                break;
            }
            int i8 = getInputSizeshNQ4ISI + 5;
            int i9 = i8 % 128;
            getHighSpeedVideoSizesFor = i9;
            if (i8 % 2 == 0) {
                char c = (char) (i3 - cArr2[i5]);
                cArr3[i5] = c;
                cArr3[i5] = (char) (c - getOutputStallDuration);
                i5 += 86;
            } else {
                char c2 = (char) (cArr2[i5] + i3);
                cArr3[i5] = c2;
                cArr3[i5] = (char) (c2 - getOutputStallDuration);
                i5++;
                getOutputFormats = (i7 + 27) % 128;
            }
            getInputSizeshNQ4ISI = (i9 + 117) % 128;
        }
        if (i2 > 0) {
            char[] cArr4 = new char[i];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
            int i10 = i - i2;
            java.lang.System.arraycopy(cArr4, 0, cArr3, i10, i2);
            java.lang.System.arraycopy(cArr4, i2, cArr3, 0, i10);
        }
        if (z) {
            getOutputFormats = (getHighSpeedVideoFpsRanges + 93) % 128;
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 1) % 128;
            char[] cArr5 = new char[i];
            while (i4 < i) {
                int i11 = getHighSpeedVideoSizesFor + 75;
                getInputSizeshNQ4ISI = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = getOutputFormats + 57;
                    getHighSpeedVideoFpsRanges = i12 % 128;
                    int i13 = i12 % 2;
                    cArr5[i4] = cArr3[i + i4];
                    i4 += 61;
                } else {
                    cArr5[i4] = cArr3[(i - i4) - 1];
                    i4++;
                }
            }
            int i14 = getHighSpeedVideoFpsRanges + 85;
            getOutputFormats = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            cArr3 = cArr5;
        } else {
            getHighSpeedVideoFpsRanges = (getOutputFormats + 95) % 128;
        }
        return new java.lang.String(cArr3);
    }

    private static void getHighSpeedVideoFpsRangesFor(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        java.lang.String str2 = str;
        int i2 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (i2 + 119) % 128;
        byte[] bArr = str2;
        if (str2 != null) {
            int i3 = i2 + 107;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = getHighResolutionOutputSizeshNQ4ISI;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                cArr2[i8] = (char) (cArr[i8] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        java.lang.System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr2 != null) {
            char[] cArr4 = new char[i5];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i5) {
                if (bArr2[maVar.f2631] == 1) {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 37) % 128;
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 59) % 128;
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i9 = i5 - i7;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i9, i7);
            java.lang.System.arraycopy(cArr5, i7, cArr3, 0, i9);
        }
        if (z) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 89) % 128;
            char[] cArr6 = new char[i5];
            maVar.f2631 = 0;
            while (maVar.f2631 < i5) {
                int i10 = getHighSpeedVideoFpsRangesFor + 23;
                getHighSpeedVideoSizes = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr6[maVar.f2631] = cArr3[i5 - maVar.f2631];
                    i = maVar.f2631;
                } else {
                    cArr6[maVar.f2631] = cArr3[(i5 - maVar.f2631) - 1];
                    i = maVar.f2631 + 1;
                }
                maVar.f2631 = i;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 93) % 128;
            maVar.f2631 = 0;
            while (maVar.f2631 < i5) {
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x05de, code lost:
    
        throw new util.h.xy.c.ma(125, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x05d3, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0467, code lost:
    
        r12 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11), "\u000e\u0000\u0018\t\u0012 㗫", 6 - android.graphics.ImageFormat.getBitsPerPixel(0), r12);
        r8 = getHighSpeedVideoSizes(((java.lang.String) r12[0]).intern(), com.google.common.base.Ascii.FF, 7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0492, code lost:
    
        if (r9 != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0494, code lost:
    
        r8 = util.h.xy.e.c.getHighSpeedVideoFpsRanges + 65;
        util.h.xy.e.c.getOutputFormats = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x049e, code lost:
    
        if ((r8 % 2) == 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x04a0, code lost:
    
        r8 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = ((((r8 & (-76)) | ((~r8) & 75)) - (~(-(-((r8 & 75) << 1))))) - 1) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x04bc, code lost:
    
        r10 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 8, 87, 2}, (java.lang.String) null, r10);
        getHighSpeedVideoSizes(8, false, ((java.lang.String) r10[0]).intern(), 6, 306).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x04da, code lost:
    
        r8 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        r10 = r8 & 43;
        r8 = -(-((r8 ^ 43) | r10));
        util.h.xy.e.c.getHighSpeedVideoSizesFor = (((r10 | r8) << 1) - (r8 ^ r10)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x04ee, code lost:
    
        if (r5 != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x04f0, code lost:
    
        r8 = util.h.xy.e.c.getInputSizeshNQ4ISI + 93;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0093, code lost:
    
        r9 = java.lang.Class.forName(r1);
        r13 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (24 - android.graphics.Color.red(0)), "\f\u0014\u0015\u0000\u000e\u0000\u0000\t\u0004!\u0018\n", android.graphics.Color.argb(0, 0, 0, 0) + 12, r13);
        r9 = ((java.lang.Integer) r9.getMethod(getHighSpeedVideoSizes(((java.lang.String) r13[0]).intern(), (byte) 126, 12).intern(), null).invoke(r29, null)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x04fa, code lost:
    
        if ((r8 % 2) != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x04fc, code lost:
    
        r12 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (android.text.TextUtils.indexOf("", "", 0, 0) + 116), "#\t\f\u0001", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 4, r12);
        r8 = getHighSpeedVideoSizes(((java.lang.String) r12[0]).intern(), (byte) 86, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0552, code lost:
    
        r8.intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0526, code lost:
    
        r10 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 115), "#\t\f\u0001", 3 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), r10);
        r8 = getHighSpeedVideoSizes(((java.lang.String) r10[0]).intern(), (byte) 6, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03ff, code lost:
    
        util.h.xy.e.c.getOutputFormats = (r5 + 75) % r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x040b, code lost:
    
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00cc, code lost:
    
        r10 = util.h.xy.e.c.getHighSpeedVideoFpsRanges + 27;
        util.h.xy.e.c.getOutputFormats = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x040e, code lost:
    
        r5 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        util.h.xy.e.c.getInputSizeshNQ4ISI = ((-2) - (~((r5 ^ 20) + ((r5 & 20) << 1)))) % r8;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03b0, code lost:
    
        r9 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r10 = (r9 | 95) << 1;
        r9 = -(r9 ^ 95);
        util.h.xy.e.c.getInputSizeshNQ4ISI = ((r10 ^ r9) + ((r9 & r10) << 1)) % r8;
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0388, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0376, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d7, code lost:
    
        if ((r10 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0379, code lost:
    
        r2 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r9 = r2 & 93;
        r2 = (r2 ^ 93) | r9;
        util.h.xy.e.c.getInputSizeshNQ4ISI = ((r9 ^ r2) + ((r2 & r9) << 1)) % r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x05df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x05e0, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x05e4, code lost:
    
        if (r1 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x05e6, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x05e7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x05e8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x05e9, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d9, code lost:
    
        r10 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = ((r10 ^ 73) * (~(-(-(r10 & 73))))) % 20388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x05ed, code lost:
    
        if (r1 != null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x05ef, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x05f0, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0255, code lost:
    
        util.h.xy.e.c.getInputSizeshNQ4ISI = (util.h.xy.e.c.getHighSpeedVideoSizesFor + 37) % r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x05f1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x05f2, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x05f6, code lost:
    
        if (r1 != null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x05f8, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x05f9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f6, code lost:
    
        r10 = null;
        r13 = null;
        r14 = null;
        r16 = null;
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x05fa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x05fb, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x05ff, code lost:
    
        if (r1 != null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0601, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0602, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0603, code lost:
    
        if (r17 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0605, code lost:
    
        r3 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        r5 = (((r3 | 30) << 1) - (r3 ^ 30)) - 1;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0614, code lost:
    
        if ((r5 % 2) != 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0616, code lost:
    
        r8 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (android.graphics.Color.rgb(0, 0, 0) + 16777233), "\u001f\f\u0002\u0017\r\u0004㕟", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00fd, code lost:
    
        if (r9 == 1) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0647, code lost:
    
        if (getHighSpeedVideoSizes(((java.lang.String) r8[0]).intern(), (byte) 36, 35).intern().equals(r2) == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0678, code lost:
    
        r2 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r3 = r2 & 79;
        r2 = (((r2 | 79) & (~r3)) - (~(r3 << 1))) - 1;
        util.h.xy.e.c.getInputSizeshNQ4ISI = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x068b, code lost:
    
        if ((r2 % 2) == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x068d, code lost:
    
        r5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (17 - android.text.TextUtils.indexOf("", "")), "\u001f\f\u0002\u0017\r\u0004㕟", android.view.View.MeasureSpec.getMode(0) + 7, r5);
        r2 = Camera2StreamConfigurationMap(r10, r29, getHighSpeedVideoSizes(((java.lang.String) r5[0]).intern(), com.google.common.base.Ascii.VT, 50).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x06b8, code lost:
    
        if (r10 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x06e7, code lost:
    
        r10.m26473(util.h.xy.e.rb.ma.f1884, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x06ec, code lost:
    
        util.h.xy.e.c.getInputSizeshNQ4ISI = (util.h.xy.e.c.getHighSpeedVideoSizesFor + 3) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x06f5, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ff, code lost:
    
        r18 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r11 = r18 + 39;
        util.h.xy.e.c.getInputSizeshNQ4ISI = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x06bb, code lost:
    
        r5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (android.view.MotionEvent.axisFromString("") + 18), "\u001f\f\u0002\u0017\r\u0004㕟", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 7, r5);
        r2 = Camera2StreamConfigurationMap(r10, r29, getHighSpeedVideoSizes(((java.lang.String) r5[0]).intern(), (byte) 111, 7).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x06e5, code lost:
    
        if (r10 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0705, code lost:
    
        r5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(false, new int[]{154, 7, 0, 0}, "\u0000\u0001\u0001\u0000\u0001\u0000\u0001", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0727, code lost:
    
        if (getHighSpeedVideoSizes(((java.lang.String) r5[0]).intern(), (byte) 65, 7).intern().equals(r2) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0729, code lost:
    
        r2 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r3 = (r2 & 97) + (r2 | 97);
        util.h.xy.e.c.getInputSizeshNQ4ISI = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0736, code lost:
    
        if ((r3 % 2) == 0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x073b, code lost:
    
        r3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(false, new int[]{154, 7, 0, 0}, "\u0000\u0001\u0001\u0000\u0001\u0000\u0001", r3);
        r2 = Camera2StreamConfigurationMap(r10, r29, getHighSpeedVideoSizes(((java.lang.String) r3[0]).intern(), (byte) 74, 107).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x075e, code lost:
    
        if (r10 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0108, code lost:
    
        if ((r11 % r2) != 0) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0788, code lost:
    
        r10.m26473(util.h.xy.e.rb.ma.f1882, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x078d, code lost:
    
        r13 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0761, code lost:
    
        r3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(false, new int[]{154, 7, 0, 0}, "\u0000\u0001\u0001\u0000\u0001\u0000\u0001", r3);
        r2 = Camera2StreamConfigurationMap(r10, r29, getHighSpeedVideoSizes(((java.lang.String) r3[0]).intern(), (byte) 65, 7).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0786, code lost:
    
        if (r10 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0790, code lost:
    
        r5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(false, new int[]{161, 7, 0, 7}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x07b6, code lost:
    
        if (getHighSpeedVideoSizes(7, false, ((java.lang.String) r5[0]).intern(), 6, 308).intern().equals(r2) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x07b8, code lost:
    
        util.h.xy.e.c.getHighSpeedVideoFpsRanges = (util.h.xy.e.c.getOutputFormats + 19) % 128;
        r2 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r3 = (((r2 | 76) << 1) - (r2 ^ 76)) - 1;
        util.h.xy.e.c.getInputSizeshNQ4ISI = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x07d0, code lost:
    
        if ((r3 % 2) == 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x07d5, code lost:
    
        r3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(false, new int[]{161, 7, 0, 7}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001", r3);
        r8 = '#';
        r14 = Camera2StreamConfigurationMap(r10, r29, getHighSpeedVideoSizes(35, false, ((java.lang.String) r3[0]).intern(), 24, 9554).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x07fa, code lost:
    
        if (r10 == null) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0827, code lost:
    
        r2 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        r3 = r2 ^ 115;
        r2 = -(-((r2 & 115) << 1));
        r5 = (r3 ^ r2) + ((r2 & r3) << 1);
        util.h.xy.e.c.getHighSpeedVideoSizesFor = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x083c, code lost:
    
        if ((r5 % 2) == 0) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x083e, code lost:
    
        r10.m26473(util.h.xy.e.rb.ma.f1883, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0843, code lost:
    
        r2 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r2 = (-2) - (~((r2 ^ 58) + ((r2 & 58) << 1)));
        util.h.xy.e.c.getInputSizeshNQ4ISI = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0854, code lost:
    
        if ((r2 % 2) == 0) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0856, code lost:
    
        r2 = 4 / 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x010b, code lost:
    
        if (r9 == r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x085a, code lost:
    
        r10.m26473(util.h.xy.e.rb.ma.f1883, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0860, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0864, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0931, code lost:
    
        throw new util.h.xy.c.ma(109, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x010d, code lost:
    
        r8 = '#';
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x07fd, code lost:
    
        r8 = '#';
        r3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(false, new int[]{161, 7, 0, 7}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001", r3);
        r14 = Camera2StreamConfigurationMap(r10, r29, getHighSpeedVideoSizes(7, false, ((java.lang.String) r3[0]).intern(), 6, 308).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0825, code lost:
    
        if (r10 == null) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x064a, code lost:
    
        r8 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (16 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), "\u001f\f\u0002\u0017\r\u0004㕟", android.text.TextUtils.indexOf("", "", 0, 0) + 7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0676, code lost:
    
        if (getHighSpeedVideoSizes(((java.lang.String) r8[0]).intern(), (byte) 111, 7).intern().equals(r2) == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x06f9, code lost:
    
        util.h.xy.e.c.getOutputFormats = (util.h.xy.e.c.getHighSpeedVideoFpsRanges + 77) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x089a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x089b, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x089f, code lost:
    
        if (r1 != null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0867, code lost:
    
        r9 = r29.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x08a1, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x08a2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x08a8, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x08ae, code lost:
    
        r0 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r1 = r0 & 23;
        r0 = (r0 | 23) & (~r1);
        r1 = -(-(r1 << 1));
        r2 = (r0 & r1) + (r0 | r1);
        r0 = r2 % 128;
        util.h.xy.e.c.getInputSizeshNQ4ISI = r0;
        r2 = r2 % 2;
        r1 = r0 & 91;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = (r1 + ((r0 ^ 91) | r1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x086b, code lost:
    
        r2 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        r3 = r2 & 19;
        r2 = -(-((r2 ^ 19) | r3));
        r5 = (r3 & r2) + (r2 | r3);
        util.h.xy.e.c.getHighSpeedVideoSizesFor = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x08ce, code lost:
    
        if (r10 == null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x08d0, code lost:
    
        r1 = ((r0 ^ 37) | (r0 & 37)) << 1;
        r0 = -((r0 & (-38)) | ((~r0) & 37));
        r2 = ((r1 | r0) << 1) - (r0 ^ r1);
        r0 = r2 % 128;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x08e8, code lost:
    
        if ((r2 % 2) == 0) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x08ea, code lost:
    
        if (r13 == null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x08ec, code lost:
    
        if (r14 == null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x08ee, code lost:
    
        r1 = r0 ^ 15;
        r0 = (((r0 & 15) | r1) << 1) - r1;
        r1 = r0 % 128;
        util.h.xy.e.c.getInputSizeshNQ4ISI = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x08fb, code lost:
    
        if ((r0 % 2) != 0) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x08fd, code lost:
    
        if (r16 == null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x08ff, code lost:
    
        r1 = r1 + 13;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0906, code lost:
    
        if ((r1 % 2) == 0) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x087e, code lost:
    
        if ((r5 % 2) != 0) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0908, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x090a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x090c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x090e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0917, code lost:
    
        throw new util.h.xy.c.ma(126, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x00e8, code lost:
    
        r10 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = (((r10 ^ 35) - (~(-(-((r10 & 35) << 1))))) - 1) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0880, code lost:
    
        r3 = 5;
        r2 = 4 / 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x08ab, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0918, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0919, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x091d, code lost:
    
        if (r1 != null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x091f, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0920, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0929, code lost:
    
        throw new util.h.xy.c.ma(110, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0070, code lost:
    
        if (r29 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x088e, code lost:
    
        r2 = 2;
        r3 = 115;
        r5 = 0;
        r8 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0884, code lost:
    
        r3 = 5;
        util.h.xy.e.c.getOutputFormats = (util.h.xy.e.c.getHighSpeedVideoFpsRanges + 7) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0111, code lost:
    
        r9 = (r18 ^ 14) + ((r18 & 14) << 1);
        r12 = ((~r9) + (r9 << 1)) % r8;
        util.h.xy.e.c.getInputSizeshNQ4ISI = r12;
        r9 = (r12 & 118) + (r12 | 118);
        util.h.xy.e.c.getHighSpeedVideoSizesFor = ((~r9) + (r9 << 1)) % r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0128, code lost:
    
        r9 = java.lang.Class.forName(r1);
        r2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(false, new int[]{111, 7, 0, 7}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000", r2);
        r2 = r9.getMethod(getHighSpeedVideoSizes(((java.lang.String) r2[0]).intern(), (byte) 66, 7).intern(), r5).invoke(r29, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0158, code lost:
    
        r9 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{118, 4, 79, 0}, "\u0001\u0000\u0001\u0000", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017c, code lost:
    
        if (getHighSpeedVideoSizes(((java.lang.String) r9[0]).intern(), (byte) 125, 4).intern().equals(r2) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017e, code lost:
    
        util.h.xy.e.c.getInputSizeshNQ4ISI = (util.h.xy.e.c.getHighSpeedVideoSizesFor + r3) % r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x019f, code lost:
    
        r10 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (11 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", r5).invoke(r5, r5)).intValue() >> 22)), "\u000e\u0000\u0018\t\u0012 㗫", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 7, r10);
        r2 = getHighSpeedVideoSizes(((java.lang.String) r10[0]).intern(), com.google.common.base.Ascii.FF, 7).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c0, code lost:
    
        r3 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        r9 = ((r3 ^ 79) + ((r3 & 79) << 1)) % r8;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = r9;
        util.h.xy.e.c.getInputSizeshNQ4ISI = ((((r9 ^ 107) | (r9 & 107)) << 1) - ((r9 & (-108)) | ((~r9) & 107))) % r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01dc, code lost:
    
        r3 = java.lang.Class.forName(r1);
        r10 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 17, 176, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001", r10);
        r2 = (java.lang.String) r3.getMethod(getHighSpeedVideoSizes(17, true, ((java.lang.String) r10[0]).intern(), 5, 302).intern(), java.lang.String.class, java.lang.String.class).invoke(r29, r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0222, code lost:
    
        r10 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 8, 87, 2}, (java.lang.String) r5, r10);
        r9 = getHighSpeedVideoSizes(8, false, ((java.lang.String) r10[0]).intern(), 6, 306).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x023d, code lost:
    
        r10 = util.h.xy.e.c.getOutputFormats + 95;
        util.h.xy.e.c.getHighSpeedVideoFpsRanges = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0247, code lost:
    
        if ((r10 % 2) == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0249, code lost:
    
        r10 = util.h.xy.e.c.getHighSpeedVideoSizesFor << (-43);
        util.h.xy.e.c.getInputSizeshNQ4ISI = r10 >>> 16348;
        r10 = r10 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0041, code lost:
    
        if (r29 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x025c, code lost:
    
        r10 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r15 = r10 ^ 3;
        r10 = (r10 & 3) << 1;
        util.h.xy.e.c.getInputSizeshNQ4ISI = (((r15 | r10) << 1) - (r10 ^ r15)) % r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x026f, code lost:
    
        r10 = java.lang.Class.forName(r1);
        r15 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 17, 176, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001", r15);
        r3 = (java.lang.String) r10.getMethod(getHighSpeedVideoSizes(17, true, ((java.lang.String) r15[0]).intern(), 5, 302).intern(), java.lang.String.class, java.lang.String.class).invoke(r29, r5, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02ae, code lost:
    
        r10 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 116), "#\t\f\u0001", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 5, r10);
        r5 = getHighSpeedVideoSizes(((java.lang.String) r10[0]).intern(), (byte) 6, 4).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02d7, code lost:
    
        r9 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        r10 = ((((r9 | 6) << 1) - (r9 ^ 6)) - 1) % r8;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = r10;
        util.h.xy.e.c.getOutputFormats = (util.h.xy.e.c.getHighSpeedVideoFpsRanges + 19) % r8;
        r9 = r10 & 21;
        r10 = (r10 ^ 21) | r9;
        util.h.xy.e.c.getInputSizeshNQ4ISI = ((r9 ^ r10) + ((r9 & r10) << 1)) % r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02f7, code lost:
    
        r9 = java.lang.Class.forName(r1);
        r15 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 17, 176, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001", r15);
        r5 = (java.lang.String) r9.getMethod(getHighSpeedVideoSizes(17, true, ((java.lang.String) r15[0]).intern(), 5, 302).intern(), java.lang.String.class, java.lang.String.class).invoke(r29, null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0336, code lost:
    
        if (r2 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0338, code lost:
    
        r9 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        r10 = r9 & 49;
        r9 = -(-((r9 ^ 49) | r10));
        r12 = (r10 & r9) + (r9 | r10);
        util.h.xy.e.c.getHighSpeedVideoSizesFor = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x034b, code lost:
    
        if ((r12 % 2) == 0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0355, code lost:
    
        if (r2.trim().length() == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0357, code lost:
    
        r2 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        r9 = r2 & 113;
        r2 = (r2 | 113) & (~r9);
        r9 = -(-(r9 << 1));
        r10 = ((r2 | r9) << 1) - (r2 ^ r9);
        util.h.xy.e.c.getHighSpeedVideoSizesFor = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x036d, code lost:
    
        if ((r10 % 2) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x036f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0389, code lost:
    
        if (r3 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x038b, code lost:
    
        r9 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = (((r9 | 117) << 1) - (r9 ^ 117)) % r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x039e, code lost:
    
        if (r3.trim().length() == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x03a0, code lost:
    
        r9 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r10 = (r9 ^ 26) + ((r9 & 26) << 1);
        util.h.xy.e.c.getInputSizeshNQ4ISI = ((~r10) + (r10 << 1)) % r8;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x093a, code lost:
    
        throw new util.h.xy.c.ma(115, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x03c1, code lost:
    
        if (r5 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x03c3, code lost:
    
        r10 = util.h.xy.e.c.getInputSizeshNQ4ISI + 37;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x03cd, code lost:
    
        if ((r10 % 2) == 0) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x03d7, code lost:
    
        if (r5.trim().length() == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x03d9, code lost:
    
        r5 = (util.h.xy.e.c.getOutputFormats + 77) % r8;
        util.h.xy.e.c.getHighSpeedVideoFpsRanges = r5;
        r10 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        r12 = ((r10 ^ 69) | (r10 & 69)) << 1;
        r10 = -((r10 & (-70)) | ((~r10) & 69));
        r15 = (r12 & r10) + (r10 | r12);
        util.h.xy.e.c.getHighSpeedVideoSizesFor = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x03f9, code lost:
    
        if ((r15 % 2) != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x03fb, code lost:
    
        r5 = 4 / 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0404, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x041d, code lost:
    
        if (r2 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x041f, code lost:
    
        r10 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        r12 = ((r10 ^ 117) | (r10 & 117)) << 1;
        r10 = -((r10 & (-118)) | ((~r10) & 117));
        r15 = (r12 & r10) + (r10 | r12);
        util.h.xy.e.c.getHighSpeedVideoSizesFor = r15 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0438, code lost:
    
        if ((r15 % 2) != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x043a, code lost:
    
        r12 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (11 - android.graphics.Color.argb(0, 0, 0, 0)), "\u000e\u0000\u0018\t\u0012 㗫", 8 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), r12);
        r8 = getHighSpeedVideoSizes(((java.lang.String) r12[0]).intern(), (byte) 17, 69);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0462, code lost:
    
        r8.intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0555, code lost:
    
        if (r9 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0557, code lost:
    
        r8 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        r10 = r8 & 17;
        r8 = (r8 | 17) & (~r10);
        r10 = -(-(r10 << 1));
        util.h.xy.e.c.getHighSpeedVideoSizesFor = ((r8 & r10) + (r8 | r10)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x056f, code lost:
    
        r10 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(false, new int[]{147, 7, 81, 7}, "\u0000\u0000\u0000\u0001\u0001\u0001\u0001", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0591, code lost:
    
        if (getHighSpeedVideoSizes(((java.lang.String) r10[0]).intern(), (byte) 59, 7).intern().equals(r3) == false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0072, code lost:
    
        r8 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        r9 = (r8 & 25) + (r8 | 25);
        r8 = 128;
        r9 = r9 % 128;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = r9;
        r10 = ((r9 ^ 5) | (r9 & 5)) << 1;
        r9 = -((r9 & (-6)) | ((~r9) & 5));
        util.h.xy.e.c.getInputSizeshNQ4ISI = ((r10 ^ r9) + ((r9 & r10) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x059c, code lost:
    
        throw new util.h.xy.c.ma(128, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x059d, code lost:
    
        if (r2 == false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x059f, code lost:
    
        r2 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r3 = ((r2 | 63) << 1) - (r2 ^ 63);
        util.h.xy.e.c.getInputSizeshNQ4ISI = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x05ad, code lost:
    
        if ((r3 % 2) != 0) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x05af, code lost:
    
        if (r9 == false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x05b1, code lost:
    
        if (r5 == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x05b3, code lost:
    
        r2 = new util.h.xy.e.rb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x05b8, code lost:
    
        util.h.xy.e.c.getOutputFormats = (util.h.xy.e.c.getHighSpeedVideoFpsRanges + 115) % 128;
        util.h.xy.e.c.getInputSizeshNQ4ISI = (util.h.xy.e.c.getHighSpeedVideoSizesFor + 55) % 128;
        r10 = r2;
        r17 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Class[], java.lang.Object, java.lang.Object[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v82 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static util.h.xy.e.rb getHighSpeedVideoFpsRanges(org.xmlpull.v1.XmlPullParser xmlPullParser) throws util.h.xy.c.ma {
        java.lang.String intern;
        int i = getHighSpeedVideoSizesFor;
        int i2 = (-2) - (~((i & 72) + (i | 72)));
        getInputSizeshNQ4ISI = i2 % 128;
        int i3 = 2;
        int i4 = 115;
        ?? r5 = 0;
        if (i2 % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) (93 - android.view.KeyEvent.keyCodeFromString("")), "!\u0018\r \u0019\u001a\u0002\u0000\u0019\u0004\u001d\u001a\u000b\u001c\u0019\u001d\u001a\u0018\u0015\u0006㖧㖧\f\u0018\u0018\t\b\f", 28 - android.view.View.resolveSizeAndState(0, 0, 0), objArr);
            intern = getHighSpeedVideoSizes(((java.lang.String) objArr[0]).intern(), (byte) 2, 22).intern();
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) (android.view.View.MeasureSpec.getSize(0) + 93), "!\u0018\r \u0019\u001a\u0002\u0000\u0019\u0004\u001d\u001a\u000b\u001c\u0019\u001d\u001a\u0018\u0015\u0006㖧㖧\f\u0018\u0018\t\b\f", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29, objArr2);
            intern = getHighSpeedVideoSizes(((java.lang.String) objArr2[0]).intern(), (byte) 100, 28).intern();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (r0.f2641 == r0.f2636) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        r0.f2639 = r0.f2641 / r2;
        r0.f2640 = r0.f2641 % r2;
        r0.f2637 = r0.f2636 / r2;
        r0.f2635 = r0.f2636 % r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        if (r0.f2640 != r0.f2635) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00be, code lost:
    
        r0.f2639 = ((r0.f2639 + r2) - 1) % r2;
        r0.f2637 = ((r0.f2637 + r2) - 1) % r2;
        r7 = r0.f2639;
        r8 = r0.f2640;
        r9 = r0.f2637;
        r10 = r0.f2635;
        r3[r0.f2638] = r1[(r7 * r2) + r8];
        r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ea, code lost:
    
        if (r0.f2639 != r0.f2637) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ec, code lost:
    
        util.h.xy.e.c.getHighSpeedVideoSizes = (util.h.xy.e.c.getHighSpeedVideoFpsRangesFor + 69) % 128;
        r0.f2640 = ((r0.f2640 + r2) - 1) % r2;
        r0.f2635 = ((r0.f2635 + r2) - 1) % r2;
        r7 = r0.f2639;
        r8 = r0.f2640;
        r9 = r0.f2637;
        r10 = r0.f2635;
        r3[r0.f2638] = r1[(r7 * r2) + r8];
        r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011c, code lost:
    
        r7 = r0.f2639;
        r8 = r0.f2635;
        r9 = r0.f2637;
        r10 = r0.f2640;
        r3[r0.f2638] = r1[(r7 * r2) + r8];
        r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        r3[r0.f2638] = (char) (r0.f2641 - r12);
        r3[r0.f2638 + 1] = (char) (r0.f2636 - r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        if (r0.f2641 == r0.f2636) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRangesFor(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int length;
        char[] cArr;
        int i3;
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 85) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr2 = getOutputStallDurationlomOqCM;
        if (cArr2 != null) {
            int i4 = getHighSpeedVideoFpsRangesFor + 33;
            getHighSpeedVideoSizes = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                cArr[i3] = (char) (cArr2[i3] ^ 4042185467053315654L);
                i3++;
            }
            cArr2 = cArr;
        }
        char c = (char) (4042185467053315654L ^ Camera2StreamConfigurationMap);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                int i5 = getHighSpeedVideoSizes + 117;
                getHighSpeedVideoFpsRangesFor = i5 % 128;
                if (i5 % 2 != 0) {
                    mcVar.f2641 = charArray[mcVar.f2638];
                    mcVar.f2636 = charArray[mcVar.f2638];
                } else {
                    mcVar.f2641 = charArray[mcVar.f2638];
                    mcVar.f2636 = charArray[mcVar.f2638 + 1];
                }
                mcVar.f2638 += 2;
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 25) % 128;
            }
        }
        for (int i6 = 0; i6 < i; i6++) {
            cArr3[i6] = (char) (cArr3[i6] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str, byte b, int i) {
        char[] cArr = str;
        if (str != null) {
            int i2 = getInputSizeshNQ4ISI + 11;
            getHighSpeedVideoSizesFor = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            getHighSpeedVideoFpsRanges = (getOutputFormats + 109) % 128;
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = getOutputMinFrameDuration;
        char c = getInputFormats;
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i3 = (getOutputFormats + 91) % 128;
            getHighSpeedVideoFpsRanges = i3;
            int i4 = getInputSizeshNQ4ISI + 23;
            getHighSpeedVideoSizesFor = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = i3 + 67;
                getOutputFormats = i5 % 128;
                if (i5 % 2 != 0) {
                    i += 57;
                    cArr4[i] = (char) (cArr2[i] * b);
                }
            }
            i--;
            cArr4[i] = (char) (cArr2[i] - b);
        }
        if (i > 1) {
            int i6 = 0;
            while (i6 < i) {
                char c2 = cArr2[i6];
                int i7 = i6 + 1;
                char c3 = cArr2[i7];
                if (c2 == c3) {
                    getOutputFormats = (getHighSpeedVideoFpsRanges + 65) % 128;
                    cArr4[i6] = (char) (c2 - b);
                    cArr4[i7] = (char) (c3 - b);
                } else {
                    int m25285 = util.h.xy.b.b.m25285(c2, c);
                    int m25286 = util.h.xy.b.b.m25286(c2, c);
                    int m252852 = util.h.xy.b.b.m25285(c3, c);
                    int m252862 = util.h.xy.b.b.m25286(c3, c);
                    if (m25286 == m252862) {
                        getHighSpeedVideoFpsRanges = (getOutputFormats + 49) % 128;
                        int m25283 = util.h.xy.b.b.m25283(m25285, c);
                        int m252832 = util.h.xy.b.b.m25283(m252852, c);
                        int m25284 = util.h.xy.b.b.m25284(m25283, m25286, c);
                        int m252842 = util.h.xy.b.b.m25284(m252832, m252862, c);
                        cArr4[i6] = cArr3[m25284];
                        cArr4[i7] = cArr3[m252842];
                    } else {
                        getHighSpeedVideoFpsRanges = (getOutputFormats + 53) % 128;
                        if (m25285 == m252852) {
                            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 45) % 128;
                            int m252833 = util.h.xy.b.b.m25283(m25286, c);
                            int m252834 = util.h.xy.b.b.m25283(m252862, c);
                            int m252843 = util.h.xy.b.b.m25284(m25285, m252833, c);
                            int m252844 = util.h.xy.b.b.m25284(m252852, m252834, c);
                            cArr4[i6] = cArr3[m252843];
                            cArr4[i7] = cArr3[m252844];
                            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 125) % 128;
                        } else {
                            int m252845 = util.h.xy.b.b.m25284(m25285, m252862, c);
                            int m252846 = util.h.xy.b.b.m25284(m252852, m25286, c);
                            cArr4[i6] = cArr3[m252845];
                            cArr4[i7] = cArr3[m252846];
                        }
                    }
                }
                i6 += 2;
                getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 5) % 128;
            }
        }
        return new java.lang.String(cArr4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x04bf, code lost:
    
        r6 = java.lang.Class.forName(r3);
        r9 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 17, 176, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001", r9);
        r19 = r3;
        r3 = (java.lang.String) r6.getMethod(getHighSpeedVideoSizes(17, true, ((java.lang.String) r9[0]).intern(), 5, 302).intern(), java.lang.String.class, java.lang.String.class).invoke(r26, null, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0509, code lost:
    
        if (r3 == null) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x050b, code lost:
    
        r4 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r6 = (r4 ^ 42) + ((r4 & 42) << 1);
        r4 = (~r6) + (r6 << 1);
        util.h.xy.e.c.getInputSizeshNQ4ISI = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x051d, code lost:
    
        if ((r4 % 2) != 0) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0527, code lost:
    
        if (r3.trim().length() == 0) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0529, code lost:
    
        if (r0 == null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x052b, code lost:
    
        r4 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        r6 = ((r4 | 32) << 1) - (r4 ^ 32);
        r4 = (~r6) + (r6 << 1);
        util.h.xy.e.c.getHighSpeedVideoSizesFor = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x053d, code lost:
    
        if ((r4 % 2) == 0) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x007e, code lost:
    
        if (android.text.TextUtils.isEmpty(r27) != false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0547, code lost:
    
        if (r0.trim().length() == 0) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0549, code lost:
    
        r6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 7, 0, 1}, "\u0001\u0000\u0000\u0000\u0000\u0001\u0001", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0571, code lost:
    
        if (getHighSpeedVideoSizes(7, true, ((java.lang.String) r6[0]).intern(), 3, 300).intern().equalsIgnoreCase(r2) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0573, code lost:
    
        r2 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r4 = r2 & 13;
        r2 = -(-((r2 ^ 13) | r4));
        util.h.xy.e.c.getInputSizeshNQ4ISI = ((r4 ^ r2) + ((r2 & r4) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0586, code lost:
    
        if (r13 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0588, code lost:
    
        r13 = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x058d, code lost:
    
        r2 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        r4 = r2 & 117;
        r2 = (r2 | 117) & (~r4);
        r4 = -(-(r4 << 1));
        r6 = (r2 & r4) + (r2 | r4);
        util.h.xy.e.c.getHighSpeedVideoSizesFor = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x05a3, code lost:
    
        r13.put(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x05a6, code lost:
    
        r0 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        util.h.xy.e.c.getInputSizeshNQ4ISI = ((((r0 ^ 25) | (r0 & 25)) << 1) - ((r0 & (-26)) | ((~r0) & 25))) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x05ba, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0080, code lost:
    
        r9 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = (((r9 & (-122)) | ((~r9) & 121)) + ((r9 & 121) << 1)) % 128;
        r11 = 125;
        r10 = (r9 & 125) + (r9 | 125);
        util.h.xy.e.c.getHighSpeedVideoSizesFor = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x05c1, code lost:
    
        r8 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{175, 4, 0, 0}, "\u0001\u0001\u0001\u0000", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x05e4, code lost:
    
        if (getHighSpeedVideoSizes(4, true, ((java.lang.String) r8[0]).intern(), 4, 305).intern().equalsIgnoreCase(r2) == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x05e6, code lost:
    
        r2 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r4 = (r2 ^ 115) + ((r2 & 115) << 1);
        util.h.xy.e.c.getInputSizeshNQ4ISI = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x05f5, code lost:
    
        if ((r4 % 2) != 0) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x05f7, code lost:
    
        if (r14 != null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x05f9, code lost:
    
        r14 = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x05fe, code lost:
    
        util.h.xy.e.c.getInputSizeshNQ4ISI = ((-2) - (~(util.h.xy.e.c.getHighSpeedVideoSizesFor + 118))) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0609, code lost:
    
        r14.put(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x060c, code lost:
    
        r0 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        util.h.xy.e.c.getInputSizeshNQ4ISI = ((r0 & 23) + (r0 | 23)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x061d, code lost:
    
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0620, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0621, code lost:
    
        r9 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (16 - android.graphics.ImageFormat.getBitsPerPixel(0)), "\n\t\u001f\u001d\u0007\n쪀", android.text.TextUtils.getCapsMode("", 0, 0) + 7, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x064e, code lost:
    
        if (getHighSpeedVideoSizes(7, true, ((java.lang.String) r9[0]).intern(), 4, 306).intern().equalsIgnoreCase(r2) == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0650, code lost:
    
        r2 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        r6 = r2 & 1;
        r2 = (r2 | 1) & (~r6);
        r6 = r6 << 1;
        r7 = ((r2 | r6) << 1) - (r2 ^ r6);
        util.h.xy.e.c.getHighSpeedVideoSizesFor = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
    
        if ((r10 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0663, code lost:
    
        if ((r7 % 2) == 0) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0665, code lost:
    
        if (r15 != null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0667, code lost:
    
        r15 = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x066c, code lost:
    
        util.h.xy.e.c.getOutputFormats = (util.h.xy.e.c.getHighSpeedVideoFpsRanges + 15) % 128;
        r2 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = ((((r2 ^ 3) | (r2 & 3)) << 1) - ((r2 & (-4)) | ((~r2) & 3))) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0688, code lost:
    
        r15.put(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x068b, code lost:
    
        r0 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r2 = r0 & 109;
        r0 = (r0 | 109) & (~r2);
        r2 = r2 << 1;
        r6 = (r0 ^ r2) + ((r0 & r2) << 1);
        util.h.xy.e.c.getInputSizeshNQ4ISI = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x06a1, code lost:
    
        if ((r6 % 2) == 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x06a3, code lost:
    
        util.h.xy.e.c.getHighSpeedVideoFpsRanges = (util.h.xy.e.c.getOutputFormats + 91) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009d, code lost:
    
        r10 = java.lang.Class.forName(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x06b1, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x06e2, code lost:
    
        throw new util.h.xy.c.ma(125, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x06d7, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x06f3, code lost:
    
        throw new util.h.xy.c.ma(125, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x06e8, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x06f4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x06f5, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x06f9, code lost:
    
        if (r1 != null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x06fb, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x06fc, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x06ff, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0700, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0704, code lost:
    
        if (r1 != null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0706, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0707, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0708, code lost:
    
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0754, code lost:
    
        throw new util.h.xy.c.ma(109, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00be, code lost:
    
        r14 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (25 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0 ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0 ? 0 : -1))), "\f\u0014\u0015\u0000\u000e\u0000\u0000\t\u0004!\u0018\n", 12 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), r14);
        r10 = ((java.lang.Integer) r10.getMethod(getHighSpeedVideoSizes(((java.lang.String) r14[0]).intern(), (byte) 78, 101).intern(), null).invoke(r26, null)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x070a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x070b, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x070f, code lost:
    
        if (r1 != null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0711, code lost:
    
        r0 = util.h.xy.e.c.getHighSpeedVideoFpsRanges + 7;
        util.h.xy.e.c.getOutputFormats = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x071b, code lost:
    
        if ((r0 % 2) == 0) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0725, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0722, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0138, code lost:
    
        r13 = null;
        r14 = null;
        r15 = null;
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0726, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x00f0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x00f1, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x00f5, code lost:
    
        if (r1 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x00f7, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x00f8, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x013c, code lost:
    
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x00f9, code lost:
    
        r10 = java.lang.Class.forName(r3);
        r14 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24), "\f\u0014\u0015\u0000\u000e\u0000\u0000\t\u0004!\u0018\n", 11 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), r14);
        r10 = ((java.lang.Integer) r10.getMethod(getHighSpeedVideoSizes(((java.lang.String) r14[0]).intern(), (byte) 126, 12).intern(), null).invoke(r26, null)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0727, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0728, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x072c, code lost:
    
        if (r1 == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x072e, code lost:
    
        r1 = util.h.xy.e.c.getHighSpeedVideoFpsRanges + 83;
        util.h.xy.e.c.getOutputFormats = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0738, code lost:
    
        if ((r1 % 2) == 0) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0742, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x073f, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x013e, code lost:
    
        r16 = util.h.xy.e.c.getOutputFormats;
        r9 = r16 + 67;
        util.h.xy.e.c.getHighSpeedVideoFpsRanges = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0743, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x06fd, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x074c, code lost:
    
        throw new util.h.xy.c.ma(110, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x075d, code lost:
    
        throw new util.h.xy.c.ma(116, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0147, code lost:
    
        if ((r9 % r2) == 0) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0766, code lost:
    
        throw new util.h.xy.c.ma(115, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0076, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x014b, code lost:
    
        r1 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r7 = ~r1;
        util.h.xy.e.c.getInputSizeshNQ4ISI = ((((r1 ^ 117) | (r1 & 117)) << r4) - ((r1 & (-118)) | (r7 & 117))) % 128;
        r3 = (r1 & (-2)) | (r7 & 1);
        r5 = (r1 & 1) << r4;
        util.h.xy.e.c.getInputSizeshNQ4ISI = (((r3 | r5) << r4) - (r3 ^ r5)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x016f, code lost:
    
        if (r13 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0171, code lost:
    
        r1 = (r1 + 9) % 128;
        util.h.xy.e.c.getInputSizeshNQ4ISI = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0177, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0179, code lost:
    
        r3 = (r1 & 8) + (r1 | 8);
        util.h.xy.e.c.getHighSpeedVideoSizesFor = ((~r3) + (r3 << r4)) % 128;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0185, code lost:
    
        if (r15 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0215, code lost:
    
        r0 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = ((r0 ^ 75) + ((r0 & 75) << r4)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0221, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0189, code lost:
    
        util.h.xy.e.c.getHighSpeedVideoFpsRanges = (r16 + 35) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x018f, code lost:
    
        r1 = r0.new a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0194, code lost:
    
        if (r13 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0196, code lost:
    
        r0 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        r3 = r0 & 99;
        r0 = (r0 | 99) & (~r3);
        r3 = -(-(r3 << r4));
        util.h.xy.e.c.getHighSpeedVideoSizesFor = (((r0 | r3) << r4) - (r0 ^ r3)) % 128;
        r1.m26475(util.h.xy.e.rb.b.f1879, r13);
        r0 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        r3 = r0 & 25;
        r0 = -(-(r0 | 25));
        util.h.xy.e.c.getHighSpeedVideoSizesFor = ((r3 & r0) + (r0 | r3)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01bf, code lost:
    
        if (r14 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01c1, code lost:
    
        r0 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r3 = ((r0 & 20) + (r0 | 20)) - r4;
        util.h.xy.e.c.getInputSizeshNQ4ISI = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ce, code lost:
    
        if ((r3 % r2) != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d0, code lost:
    
        r1.m26475(util.h.xy.e.rb.b.f1881, r14);
        r0 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        r2 = r0 & 39;
        r0 = r0 | 39;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = (((r2 | r0) << r4) - (r0 ^ r2)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e5, code lost:
    
        r1.m26475(util.h.xy.e.rb.b.f1881, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ea, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01eb, code lost:
    
        if (r15 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ed, code lost:
    
        r0 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r2 = ((r0 ^ 55) | (r0 & 55)) << r4;
        r0 = -((r0 & (-56)) | ((~r0) & 55));
        util.h.xy.e.c.getInputSizeshNQ4ISI = ((r2 ^ r0) + ((r0 & r2) << r4)) % 128;
        r1.m26475(util.h.xy.e.rb.b.f1880, r15);
        r0 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        util.h.xy.e.c.getInputSizeshNQ4ISI = ((r0 & 125) + (r0 | r11)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0214, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0222, code lost:
    
        r8 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        util.h.xy.e.c.getInputSizeshNQ4ISI = ((r8 ^ 73) + ((r8 & 73) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0232, code lost:
    
        if (r10 == r2) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0234, code lost:
    
        if (r10 != 3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0236, code lost:
    
        r9 = ((((r8 & (-120)) | ((~r8) & 119)) - (~(-(-((r8 & 119) << r4))))) - r4) % 128;
        util.h.xy.e.c.getInputSizeshNQ4ISI = r9;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = ((r9 & 75) + (r9 | 75)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0049, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0251, code lost:
    
        r8 = java.lang.Class.forName(r3);
        r10 = new java.lang.Object[r4];
        getHighSpeedVideoFpsRangesFor((boolean) r7, new int[]{111, 7, r7, 7}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0284, code lost:
    
        if (r27.equalsIgnoreCase((java.lang.String) r8.getMethod(getHighSpeedVideoSizes(((java.lang.String) r10[r7]).intern(), (byte) 66, 7).intern(), r6).invoke(r26, r6)) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0286, code lost:
    
        r4 = util.h.xy.e.c.getOutputFormats + 45;
        r8 = r4 % 128;
        util.h.xy.e.c.getHighSpeedVideoFpsRanges = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x028f, code lost:
    
        if ((r4 % r2) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0293, code lost:
    
        r4 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        util.h.xy.e.c.getInputSizeshNQ4ISI = (r4 + 43) % 128;
        r8 = r8 + 7;
        util.h.xy.e.c.getOutputFormats = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02a2, code lost:
    
        if ((r8 % r2) != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02a4, code lost:
    
        r8 = ((r4 & 26) / (r4 | 26)) % 9968;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02b5, code lost:
    
        util.h.xy.e.c.getInputSizeshNQ4ISI = r8;
        r19 = r3;
        r4 = r7;
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x06b4, code lost:
    
        r0 = r26.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x06b8, code lost:
    
        r2 = util.h.xy.e.c.getInputSizeshNQ4ISI;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = (((r2 & 92) + (r2 | 92)) - 1) % 128;
        r10 = r0;
        r7 = r4;
        r3 = r19;
        r6 = 0;
        r11 = 125;
        r0 = r25;
        r4 = 1;
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02ac, code lost:
    
        r8 = (((r4 & 20) + (r4 | 20)) - 1) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x03ed, code lost:
    
        r19 = r3;
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02bd, code lost:
    
        util.h.xy.e.c.getHighSpeedVideoFpsRanges = (util.h.xy.e.c.getOutputFormats + 45) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02c7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02c8, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02cc, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02ce, code lost:
    
        util.h.xy.e.c.getOutputFormats = (util.h.xy.e.c.getHighSpeedVideoFpsRanges + 61) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x076f, code lost:
    
        throw new util.h.xy.c.ma(114, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02d6, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02d7, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02dc, code lost:
    
        r4 = (((r8 | 9) << 1) - ((r8 & (-10)) | ((~r8) & 9))) % 128;
        util.h.xy.e.c.getInputSizeshNQ4ISI = r4;
        r8 = r4 & 5;
        r4 = -(-(r4 | 5));
        util.h.xy.e.c.getHighSpeedVideoSizesFor = ((r8 ^ r4) + ((r4 & r8) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0301, code lost:
    
        r4 = java.lang.Class.forName(r3);
        r9 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((boolean) r7, new int[]{111, 7, r7, 7}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000", r9);
        r2 = (java.lang.String) r4.getMethod(getHighSpeedVideoSizes(((java.lang.String) r9[r7]).intern(), (byte) 66, 7).intern(), r6).invoke(r26, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0331, code lost:
    
        r9 = new java.lang.Object[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0337, code lost:
    
        getHighSpeedVideoFpsRangesFor(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 7, r7, 1}, "\u0001\u0000\u0000\u0000\u0000\u0001\u0001", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0356, code lost:
    
        if (getHighSpeedVideoSizes(7, true, ((java.lang.String) r9[r7]).intern(), 3, 300).intern().equalsIgnoreCase(r2) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0358, code lost:
    
        r4 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r9 = r4 & 91;
        r4 = r4 | 91;
        r4 = (r9 & r4) + (r4 | r9);
        util.h.xy.e.c.getInputSizeshNQ4ISI = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0369, code lost:
    
        if ((r4 % 2) == 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x036b, code lost:
    
        r11 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{175, 4, r7, r7}, "\u0001\u0001\u0001\u0000", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x038e, code lost:
    
        if (getHighSpeedVideoSizes(5, true, ((java.lang.String) r11[r7]).intern(), 4, 29712).intern().equalsIgnoreCase(r2) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03b6, code lost:
    
        r11 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (18 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1))), "\n\t\u001f\u001d\u0007\n쪀", 7 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x03ea, code lost:
    
        if (getHighSpeedVideoSizes(7, true, ((java.lang.String) r11[r7]).intern(), 4, 306).intern().equalsIgnoreCase(r2) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0078, code lost:
    
        if (r26 == null) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0391, code lost:
    
        r9 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{175, 4, r7, r7}, "\u0001\u0001\u0001\u0000", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x03b4, code lost:
    
        if (getHighSpeedVideoSizes(4, true, ((java.lang.String) r9[r7]).intern(), 4, 305).intern().equalsIgnoreCase(r2) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x03f2, code lost:
    
        r9 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((byte) (android.widget.ExpandableListView.getPackedPositionType(0) + 112), "\u001d\u001e\u000b\u000f", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 4, r9);
        r4 = getHighSpeedVideoSizes(4, r7, ((java.lang.String) r9[r7]).intern(), 2, 302).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x041e, code lost:
    
        r6 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r8 = ((r6 ^ 71) + ((r6 & 71) << 1)) % 128;
        util.h.xy.e.c.getInputSizeshNQ4ISI = r8;
        util.h.xy.e.c.getHighSpeedVideoSizesFor = (((r8 & (-32)) | ((~r8) & 31)) + ((r8 & 31) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x043b, code lost:
    
        r6 = java.lang.Class.forName(r3);
        r8 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 17, 176, r7}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001", r8);
        r0 = (java.lang.String) r6.getMethod(getHighSpeedVideoSizes(17, true, ((java.lang.String) r8[0]).intern(), 5, 302).intern(), java.lang.String.class, java.lang.String.class).invoke(r26, null, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0487, code lost:
    
        r6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(true, new int[]{179, 5, 175, 1}, (java.lang.String) null, r6);
        r4 = getHighSpeedVideoSizes(((java.lang.String) r6[0]).intern(), (byte) 63, 5).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x04a5, code lost:
    
        r6 = util.h.xy.e.c.getHighSpeedVideoSizesFor;
        r7 = ((r6 ^ 51) | (r6 & 51)) << 1;
        r6 = -((r6 & (-52)) | ((~r6) & 51));
        util.h.xy.e.c.getInputSizeshNQ4ISI = ((r7 ^ r6) + ((r6 & r7) << 1)) % 128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Class[], java.lang.Object[], java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v84 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static util.h.xy.e.rb.a Camera2StreamConfigurationMap(util.h.xy.e.rb rbVar, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) throws util.h.xy.c.ma {
        java.lang.String intern;
        util.h.xy.e.rb rbVar2 = rbVar;
        int i = getHighSpeedVideoSizesFor;
        int i2 = 1;
        int i3 = (((i & (-100)) | ((~i) & 99)) - (~((i & 99) << 1))) - 1;
        getInputSizeshNQ4ISI = i3 % 128;
        int i4 = 2;
        ?? r6 = 0;
        int i5 = 0;
        if (i3 % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) (93 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), "!\u0018\r \u0019\u001a\u0002\u0000\u0019\u0004\u001d\u001a\u000b\u001c\u0019\u001d\u001a\u0018\u0015\u0006㖧㖧\f\u0018\u0018\t\b\f", android.text.TextUtils.getOffsetAfter("", 0) + 28, objArr);
            intern = getHighSpeedVideoSizes(((java.lang.String) objArr[0]).intern(), (byte) 59, 114).intern();
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) (android.view.View.combineMeasuredStates(0, 0) + 93), "!\u0018\r \u0019\u001a\u0002\u0000\u0019\u0004\u001d\u001a\u000b\u001c\u0019\u001d\u001a\u0018\u0015\u0006㖧㖧\f\u0018\u0018\t\b\f", 27 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr2);
            intern = getHighSpeedVideoSizes(((java.lang.String) objArr2[0]).intern(), (byte) 100, 28).intern();
        }
    }

    static {
        Camera2StreamConfigurationMap();
        getInputSizeshNQ4ISI = 0;
        getHighSpeedVideoSizesFor = 1;
        getOutputStallDuration = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE;
        getInputFormats = (char) 6;
        getOutputMinFrameDuration = new char[]{'o', 'r', 'g', com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, 'x', io.ktor.util.date.GMTDateParser.MINUTES, 'l', 'p', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 'v', '1', 'X', 'P', 'a', io.ktor.util.date.GMTDateParser.SECONDS, 'e', 't', 'F', 'I', 'n', 'E', 'T', 'y', 'N', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'i', 'w', io.ktor.util.date.GMTDateParser.HOURS, 'k', 'q', io.ktor.util.date.GMTDateParser.ZONE, kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ, '|', kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ, '~', com.google.common.base.Ascii.MAX};
        int i = getHighSpeedVideoFpsRanges + 91;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static void Camera2StreamConfigurationMap() {
        getOutputStallDurationlomOqCM = new char[]{41932, 41947, 41929, 41930, 41740, 41940, 41937, 41894, 23594, 41946, 41942, 41936, 41939, 41933, 41951, 23592, 41935, 23589, 41938, 23591, 41924, 23605, 23604, 23613, 41945, 41948, 41736, 41950, 41941, 41943, 41949, 41944, 23593, 41925, 41931, 23585};
        Camera2StreamConfigurationMap = (char) 38464;
        getHighResolutionOutputSizeshNQ4ISI = new char[]{42326, 42309, 42313, 55983, 55974, 42311, 42313, 42315, 42311, 42309, 42313, 55976, 55975, 55974, 23178, 55990, 42327, 42313, 9563, 9559, 42309, 42313, 9563, 9565, 42316, 42311, 42313, 42318, 9561, 55974, 42327, 42318, 42308, 42309, 42304, 42360, 42263, 42354, 42355, 42259, 42259, 42355, 42312, 42341, 42346, 42349, 42252, 42248, 42350, 42351, 42252, 42248, 42250, 42254, 42252, 42250, 42341, 42313, 42308, 42343, 42250, 42244, 42254, 42255, 42252, 42260, 42266, 42256, 42251, 42252, 42259, 42257, 42257, 42351, 42344, 42245, 42252, 42260, 42259, 42248, 42251, 42355, 42353, 42252, 42248, 42254, 42349, 42344, 42252, 42253, 42245, 42244, 42258, 42308, 42350, 42345, 42351, 42351, 42350, 42351, 42349, 42359, 42353, 42357, 42255, 42249, 42248, 42249, 42250, 42240, 42244, 42332, 42325, 42322, 42318, 42318, 42324, 42249, 42352, 42297, 42299, 42244, 42243, 42470, 42472, 42480, 42478, 42465, 42473, 42488, 42494, 42483, 42469, 42472, 42483, 42483, 42473, 42495, 42495, 42242, 42257, 42250, 42246, 42245, 42240, 42247, 42252, 42351, 42298, 42295, 42240, 42252, 42240, 42481, 42321, 42320, 42334, 42323, 42310, 42305, 42301, 42333, 42332, 42334, 9565, 55968, 55969, 55971, 55971, 9564, 9565, 55971, 9565, 9561, 9567, 42335, 55968, 55970, 9566, 42475, 41998, 42469, 42475, 42467};
    }
}
