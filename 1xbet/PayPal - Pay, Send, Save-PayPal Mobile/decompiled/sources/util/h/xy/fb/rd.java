package util.h.xy.fb;

/* loaded from: classes5.dex */
public final class rd {
    private static int Camera2StreamConfigurationMap = 0;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static char getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static char getHighSpeedVideoSizesFor = 0;
    private static java.lang.String getInputFormats = null;
    private static int getInputSizeshNQ4ISI = 1;
    private static char getOutputMinFrameDuration;

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (getHighSpeedVideoFpsRangesFor ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 3155153533016530592L))) ^ (c3 + i2)) ^ ((c3 >>> 5) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L)))));
                i2 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 11) % 128;
        }
        java.lang.String str2 = new java.lang.String(cArr, 0, i);
        int i4 = getHighSpeedVideoSizes + 61;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str2;
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        try {
            getInputFormats = (java.lang.String) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<java.lang.String>() { // from class: util.h.xy.fb.rd.3
                private static int Camera2StreamConfigurationMap = 0;
                private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                private static int getHighSpeedVideoFpsRanges = 1;
                private static byte[] getHighSpeedVideoFpsRangesFor = {104, -80, com.google.common.base.Ascii.CAN, -116, 102, -122, com.visa.cbp.getEncExpo.IResultReceiver2, -71, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -82, -124, 114, -70, -40};
                private static int getHighSpeedVideoSizes = 0;
                private static int getHighSpeedVideoSizesFor = -408872978;
                private static short[] getInputFormats = null;
                private static int getInputSizeshNQ4ISI = 1094484833;
                private static int getOutputMinFrameDuration = -1277322068;

                /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0131  */
                @Override // java.security.PrivilegedAction
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final /* synthetic */ java.lang.String run() {
                    int i;
                    int i2;
                    byte[] bArr;
                    boolean z;
                    char c;
                    int i3;
                    int i4 = getHighSpeedVideoFpsRanges;
                    int i5 = i4 + 99;
                    getHighSpeedVideoSizes = i5 % 128;
                    getHighSpeedVideoSizes = (i4 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                    float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
                    short blue = (short) (118 - android.graphics.Color.blue(0));
                    byte lastIndexOf = (byte) (36 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                    int i6 = (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)) + 1499622215;
                    int packedPositionGroup = (-40) - android.widget.ExpandableListView.getPackedPositionGroup(0L);
                    int lastIndexOf2 = (-1417448201) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
                    util.h.xz.b.me meVar = new util.h.xz.b.me();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    int i7 = packedPositionGroup + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L)));
                    boolean z2 = i7 == -1;
                    if (z2) {
                        byte[] bArr2 = getHighSpeedVideoFpsRangesFor;
                        if (bArr2 != null) {
                            int length = bArr2.length;
                            byte[] bArr3 = new byte[length];
                            int i8 = 0;
                            while (i8 < length) {
                                bArr3[i8] = (byte) (bArr2[i8] ^ (-2689713159175858216L));
                                i8++;
                                i5 = i5;
                            }
                            i = i5;
                            bArr2 = bArr3;
                        } else {
                            i = i5;
                        }
                        if (bArr2 != null) {
                            int i9 = Camera2StreamConfigurationMap + 61;
                            getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
                            i7 = (byte) (i9 % 2 == 0 ? ((byte) (getHighSpeedVideoFpsRangesFor[((int) (getInputSizeshNQ4ISI | (-2689713159175858216L))) + i6] | (-2689713159175858216L))) * ((int) (getHighSpeedVideoSizesFor * (-2689713159175858216L))) : ((byte) (getHighSpeedVideoFpsRangesFor[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i6] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
                        } else {
                            i7 = (short) (((short) (getInputFormats[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i6] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
                        }
                    } else {
                        i = i5;
                    }
                    if (i7 > 0) {
                        int i10 = (int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L));
                        if (z2) {
                            int i11 = Camera2StreamConfigurationMap + 13;
                            getHighResolutionOutputSizeshNQ4ISI = i11 % 128;
                            if (i11 % 2 != 0) {
                                i2 = 1;
                                meVar.f2647 = ((i6 + i7) - 2) + i10 + i2;
                                meVar.f2644 = (char) (lastIndexOf2 + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
                                sb.append(meVar.f2644);
                                meVar.f2646 = meVar.f2644;
                                bArr = getHighSpeedVideoFpsRangesFor;
                                if (bArr != null) {
                                    int length2 = bArr.length;
                                    byte[] bArr4 = new byte[length2];
                                    for (int i12 = 0; i12 < length2; i12++) {
                                        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 37) % 128;
                                        bArr4[i12] = (byte) (bArr[i12] ^ (-2689713159175858216L));
                                    }
                                    bArr = bArr4;
                                }
                                if (bArr != null) {
                                    int i13 = getHighResolutionOutputSizeshNQ4ISI + 17;
                                    Camera2StreamConfigurationMap = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        z = true;
                                        meVar.f2645 = 1;
                                        while (meVar.f2645 < i7) {
                                            if (z) {
                                                byte[] bArr5 = getHighSpeedVideoFpsRangesFor;
                                                meVar.f2647 = meVar.f2647 - 1;
                                                byte b = (byte) (bArr5[r2] ^ (-2689713159175858216L));
                                                c = meVar.f2646;
                                                i3 = (byte) (b + blue);
                                            } else {
                                                short[] sArr = getInputFormats;
                                                meVar.f2647 = meVar.f2647 - 1;
                                                short s = (short) (sArr[r2] ^ (-2689713159175858216L));
                                                c = meVar.f2646;
                                                i3 = (short) (s + blue);
                                            }
                                            meVar.f2644 = (char) (c + (i3 ^ lastIndexOf));
                                            sb.append(meVar.f2644);
                                            meVar.f2646 = meVar.f2644;
                                            meVar.f2645++;
                                        }
                                    }
                                }
                                z = false;
                                meVar.f2645 = 1;
                                while (meVar.f2645 < i7) {
                                }
                            }
                        }
                        i2 = 0;
                        meVar.f2647 = ((i6 + i7) - 2) + i10 + i2;
                        meVar.f2644 = (char) (lastIndexOf2 + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
                        sb.append(meVar.f2644);
                        meVar.f2646 = meVar.f2644;
                        bArr = getHighSpeedVideoFpsRangesFor;
                        if (bArr != null) {
                        }
                        if (bArr != null) {
                        }
                        z = false;
                        meVar.f2645 = 1;
                        while (meVar.f2645 < i7) {
                        }
                    }
                    java.lang.String property = java.lang.System.getProperty(sb.toString().intern());
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 77) % 128;
                    if (i % 2 == 0) {
                        return property;
                    }
                    throw new java.lang.ArithmeticException();
                }
            });
            int i = getHighSpeedVideoFpsRanges + 63;
            getInputSizeshNQ4ISI = i % 128;
            int i2 = i % 2;
        } catch (java.lang.Exception unused) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("⪕䪖", 3 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
                getInputFormats = java.lang.String.format(((java.lang.String) objArr[0]).intern(), new java.lang.Object[0]);
            } catch (java.lang.Exception unused2) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("듿\udaf4", '1' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
                getInputFormats = ((java.lang.String) objArr2[0]).intern();
            }
        }
        int i3 = getHighSpeedVideoFpsRanges + 67;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static char[] m26859(byte[] bArr) {
        getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 77) % 128;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i = 0;
        while (i != length) {
            int i2 = getHighSpeedVideoFpsRanges + 117;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                cArr[i] = (char) (bArr[i] & com.google.common.base.Ascii.ESC);
                i += 55;
            } else {
                cArr[i] = (char) (bArr[i] & 255);
                i++;
            }
        }
        return cArr;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.lang.String m26855(byte[] bArr) {
        java.lang.String str = new java.lang.String(m26859(bArr));
        getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 91) % 128;
        return str;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m26856(java.lang.String str) {
        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 121) % 128;
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 9) % 128;
            bArr[i] = (byte) str.charAt(i);
        }
        int i2 = getHighSpeedVideoFpsRanges + 73;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String m26857(java.lang.String str) {
        int i;
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i2 = 0; i2 != charArray.length; i2++) {
            int i3 = getHighSpeedVideoFpsRanges;
            getInputSizeshNQ4ISI = (i3 + 87) % 128;
            char c = charArray[i2];
            if ('A' <= c) {
                int i4 = i3 + 29;
                int i5 = i4 % 128;
                getInputSizeshNQ4ISI = i5;
                if (i4 % 2 == 0) {
                    if ('f' < c) {
                    }
                    i = i5 + 53;
                    getHighSpeedVideoFpsRanges = i % 128;
                    if (i % 2 == 0) {
                        charArray[i2] = (char) ((c + '%') >> com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
                        z = false;
                    } else {
                        charArray[i2] = (char) (c + ' ');
                        z = true;
                    }
                } else {
                    if ('Z' < c) {
                    }
                    i = i5 + 53;
                    getHighSpeedVideoFpsRanges = i % 128;
                    if (i % 2 == 0) {
                    }
                }
            }
        }
        return z ? new java.lang.String(charArray) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[SYNTHETIC] */
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String m26854(java.lang.String str) {
        char[] charArray;
        int i;
        char c;
        int i2 = getInputSizeshNQ4ISI + 87;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            charArray = str.toCharArray();
            i = 1;
        } else {
            charArray = str.toCharArray();
            i = 0;
        }
        int i3 = i;
        while (i != charArray.length) {
            int i4 = getHighSpeedVideoFpsRanges + 89;
            getInputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 == 0) {
                c = charArray[i];
                if (15 > c) {
                    i++;
                }
                if ('z' < c) {
                    charArray[i] = (char) (c - ' ');
                    i3 = 1;
                }
                i++;
            } else {
                c = charArray[i];
                if ('a' > c) {
                    i++;
                }
                if ('z' < c) {
                }
                i++;
            }
        }
        return i3 != 0 ? new java.lang.String(charArray) : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        util.h.xy.fb.rd.getHighSpeedVideoFpsRanges = (r4 + 69) % 128;
        r4 = (r3 >> 6) | 192;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b9, code lost:
    
        r9.write(r4);
        r9.write((r3 & 63) | 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r3 < 55296) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r3 > 57343) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        util.h.xy.fb.rd.getHighSpeedVideoFpsRanges = (r4 + 17) % 128;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r2 >= r8.length) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        r4 = r8[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r3 > 56319) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        r3 = (((r3 & 1023) << 10) | (r4 & 1023)) + 65536;
        r9.write((r3 >> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        r4 = ((r3 >> 12) & 63) | 128;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        r9.write(r4);
        r4 = ((r3 >> 6) & 63) | 128;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        r9 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("矃⛳苴ꉄ䮙ᱨ槺댠ধ깗傑㱿彄㤎꼙ㅑ\uf137欱觻卦䫲ﶊ\u0efeꔆ", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        throw new java.lang.IllegalStateException(((java.lang.String) r9[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        r9 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("矃⛳苴ꉄ䮙ᱨ槺댠ধ깗傑㱿彄㤎꼙ㅑ\uf137欱觻卦䫲ﶊ\u0efeꔆ", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 24, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        throw new java.lang.IllegalStateException(((java.lang.String) r9[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        r4 = (r3 >> '\f') | 224;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0026, code lost:
    
        r9.write(r3);
        util.h.xy.fb.rd.getHighSpeedVideoFpsRanges = (util.h.xy.fb.rd.getInputSizeshNQ4ISI + 79) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0024, code lost:
    
        if (r3 < 128) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r3 < 24519) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r3 >= 2048) goto L16;
     */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m26862(char[] cArr, java.io.OutputStream outputStream) throws java.io.IOException {
        char c;
        char c2;
        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 19) % 128;
        int i = 0;
        while (i < cArr.length) {
            int i2 = getHighSpeedVideoFpsRanges + 125;
            int i3 = i2 % 128;
            getInputSizeshNQ4ISI = i3;
            if (i2 % 2 == 0) {
                char c3 = cArr[i];
                c2 = c3;
                c = c3;
            } else {
                char c4 = cArr[i];
                c2 = c4;
                c = c4;
            }
            i++;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m26858(char[] cArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            m26862(cArr, byteArrayOutputStream);
            int i = getInputSizeshNQ4ISI + 39;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 != 0) {
                byteArrayOutputStream.toByteArray();
                throw new java.lang.ArithmeticException();
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 81) % 128;
            return byteArray;
        } catch (java.io.IOException unused) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("㍂䶴楼㷈唲ἓ沩竺駈ꔝ\uf137欱ࢢ뿕\u18f8컄贗耣桋\uf0eb嫖쯐\ue911\u0c4e\uaac5㿈驎醈淐힟˩㳔\u0dfd㶤깷땤", 34 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m26861(java.lang.String str) {
        int i = getInputSizeshNQ4ISI + 55;
        getHighSpeedVideoFpsRanges = i % 128;
        char[] charArray = str.toCharArray();
        if (i % 2 != 0) {
            m26858(charArray);
            throw null;
        }
        byte[] m26858 = m26858(charArray);
        int i2 = getHighSpeedVideoFpsRanges + 93;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return m26858;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static java.lang.String m26860(byte[] bArr) {
        getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 19) % 128;
        char[] cArr = new char[bArr.length];
        int m26814 = util.h.xy.fa.rc.m26814(bArr, cArr);
        if (m26814 >= 0) {
            java.lang.String str = new java.lang.String(cArr, 0, m26814);
            getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 1) % 128;
            return str;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("ݴ羅苴ꉄ䮙ᱨ槺댠ধ깗傑㱿柽㶇矃⛳흾룫ﺡ\ued98", 19 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighResolutionOutputSizeshNQ4ISI = (char) 17546;
        getOutputMinFrameDuration = (char) 33773;
        getHighSpeedVideoFpsRangesFor = (char) 47321;
        getHighSpeedVideoSizesFor = (char) 33080;
    }
}
