package com.payair.hce;

/* loaded from: classes4.dex */
public final class enableUsingApkIndependentContext implements com.payair.hce.isSidewinderDevice {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static boolean IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static boolean SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getProfileVersion;
    private static int values;
    private byte[] DigitizedCardProfile = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 113, 114, 115, 116, 117, 118, com.visa.cbp.getEncExpo.IResultReceiver, 120, 121, 122, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 43, 47};
    private byte writeReplace = kotlin.io.encoding.Base64.padSymbol;
    private byte[] valueOf = new byte[128];

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        int i2 = b3 * 3;
        byte[] bArr = $$a;
        int i3 = (b * 4) + 118;
        int i4 = 4 - (b2 * 3);
        byte[] bArr2 = new byte[1 - i2];
        if (bArr == null) {
            int i5 = i4;
            int i6 = 0;
            i4++;
            i3 = (-i3) + i5;
            i = i6;
            bArr2[i] = (byte) i3;
            if (i == 0 - i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i + 1;
            i5 = i3;
            i3 = bArr[i4];
            i6 = i7;
            i4++;
            i3 = (-i3) + i5;
            i = i6;
            bArr2[i] = (byte) i3;
            if (i == 0 - i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == 0 - i2) {
            }
        }
    }

    private void writeReplace() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.valueOf;
            if (i2 >= bArr.length) {
                break;
            }
            int i3 = getProfileVersion + 65;
            int i4 = i3 % 128;
            RecordsJson = i4;
            if (i3 % 2 == 0) {
                bArr[i2] = -1;
                i2 += 126;
            } else {
                bArr[i2] = -1;
                i2++;
            }
            getProfileVersion = (i4 + 53) % 128;
        }
        while (true) {
            byte[] bArr2 = this.DigitizedCardProfile;
            if (i >= bArr2.length) {
                return;
            }
            int i5 = getProfileVersion + 55;
            RecordsJson = i5 % 128;
            if (i5 % 2 == 0) {
                this.valueOf[bArr2[i]] = (byte) i;
                i += 93;
            } else {
                this.valueOf[bArr2[i]] = (byte) i;
                i++;
            }
        }
    }

    public enableUsingApkIndependentContext() {
        writeReplace();
    }

    @Override // com.payair.hce.isSidewinderDevice
    public final int valueOf(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = getProfileVersion + 45;
        RecordsJson = i7 % 128;
        if (i7 % 2 == 0) {
            i3 = i2 + 4;
            i4 = i2 >> i3;
        } else {
            i3 = i2 % 3;
            i4 = i2 - i3;
        }
        int i8 = i;
        while (true) {
            i5 = i + i4;
            i6 = 4;
            if (i8 >= i5) {
                break;
            }
            int i9 = bArr[i8] & 255;
            int i10 = bArr[i8 + 1] & 255;
            byte b = bArr[i8 + 2];
            outputStream.write(this.DigitizedCardProfile[(i9 >>> 2) & 63]);
            outputStream.write(this.DigitizedCardProfile[((i9 << 4) | (i10 >>> 4)) & 63]);
            outputStream.write(this.DigitizedCardProfile[((i10 << 2) | ((b & 255) >>> 6)) & 63]);
            outputStream.write(this.DigitizedCardProfile[b & 63]);
            i8 += 3;
        }
        if (i3 == 0) {
            RecordsJson = (getProfileVersion + 23) % 128;
        } else if (i3 == 1) {
            int i11 = bArr[i5] & 255;
            outputStream.write(this.DigitizedCardProfile[(i11 >>> 2) & 63]);
            outputStream.write(this.DigitizedCardProfile[(i11 << 4) & 63]);
            outputStream.write(this.writeReplace);
            outputStream.write(this.writeReplace);
        } else if (i3 == 2) {
            int i12 = bArr[i5] & 255;
            int i13 = bArr[i5 + 1] & 255;
            outputStream.write(this.DigitizedCardProfile[(i12 >>> 2) & 63]);
            outputStream.write(this.DigitizedCardProfile[((i12 << 4) | (i13 >>> 4)) & 63]);
            outputStream.write(this.DigitizedCardProfile[(i13 << 2) & 63]);
            outputStream.write(this.writeReplace);
        }
        int i14 = i4 / 3;
        if (i3 == 0) {
            int i15 = (getProfileVersion + 21) % 128;
            RecordsJson = i15;
            getProfileVersion = (i15 + 61) % 128;
            i6 = 0;
        }
        return (i14 << 2) + i6;
    }

    private static boolean valueOf(char c) {
        int i = getProfileVersion;
        int i2 = i + 121;
        RecordsJson = i2 % 128;
        if (i2 % 2 == 0) {
            if (c == '(') {
                return true;
            }
        } else if (c == '\n') {
            return true;
        }
        if (c == '\r') {
            return true;
        }
        int i3 = i + 99;
        RecordsJson = i3 % 128;
        if (i3 % 2 == 0) {
            if (c == 'n') {
                return true;
            }
        } else if (c == '\t') {
            return true;
        }
        return c == ' ';
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        int i2 = $10 + 115;
        $11 = i2 % 128;
        byte[] bArr = str3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = AlternateContactlessPaymentDataJson;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 46, 334 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.text.TextUtils.getTrimmedLength("") + 46337))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(values)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 47, 286 - android.view.View.getDefaultSize(0, 0), (char) (46337 - android.view.View.resolveSize(0, 0)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (IccPrivateKeyCrtComponentsJson) {
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 1629 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((byte) 0, (byte) 0, (byte) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (!SdkCoreAlternateContactlessPaymentDataImpl) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        $10 = ($11 + 39) % 128;
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        $10 = ($11 + 97) % 128;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.KeyEvent.getDeadChar(0, 0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1628, (char) android.view.View.resolveSize(0, 0));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((byte) 0, (byte) 0, (byte) 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    @Override // com.payair.hce.isSidewinderDevice
    public final int writeReplace(java.lang.String str, java.io.OutputStream outputStream) throws java.io.IOException {
        int length = str.length();
        getProfileVersion = (RecordsJson + 29) % 128;
        while (length > 0) {
            int i = getProfileVersion + 119;
            RecordsJson = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (!valueOf(str.charAt(length - 1))) {
                break;
            }
            length--;
        }
        int i2 = length - 4;
        int valueOf = valueOf(str, 0, i2);
        int i3 = 0;
        while (valueOf < i2) {
            getProfileVersion = (RecordsJson + 107) % 128;
            byte b = this.valueOf[str.charAt(valueOf)];
            int valueOf2 = valueOf(str, valueOf + 1, i2);
            byte b2 = this.valueOf[str.charAt(valueOf2)];
            int valueOf3 = valueOf(str, valueOf2 + 1, i2);
            byte b3 = this.valueOf[str.charAt(valueOf3)];
            int valueOf4 = valueOf(str, valueOf3 + 1, i2);
            byte b4 = this.valueOf[str.charAt(valueOf4)];
            if ((b | b2 | b3 | b4) < 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(android.graphics.Color.argb(0, 0, 0, 0) + 127, null, null, "\u0084\u008b\u0084\u0086\u0087\u0092\u0091\u008c\u008d\u0084\u0090\u0087\u0082\u0081\u0087\u0086\u008c\u008a\u008c\u008b\u0082\u008f\u008e\u0088\u0082\u008c\u0087\u008d\u008a\u008c\u008b\u0088\u0084\u008a\u0084\u0089\u0088\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            }
            outputStream.write((b << 2) | (b2 >> 4));
            outputStream.write((b2 << 4) | (b3 >> 2));
            outputStream.write((b3 << 6) | b4);
            i3 += 3;
            valueOf = valueOf(str, valueOf4 + 1, i2);
        }
        return i3 + ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, outputStream, java.lang.Character.valueOf(str.charAt(i2)), java.lang.Character.valueOf(str.charAt(length - 3)), java.lang.Character.valueOf(str.charAt(length - 2)), java.lang.Character.valueOf(str.charAt(length - 1))}, -114395557, 114395557, java.lang.System.identityHashCode(this))).intValue();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.enableUsingApkIndependentContext enableusingapkindependentcontext = (com.payair.hce.enableUsingApkIndependentContext) objArr[0];
        java.io.OutputStream outputStream = (java.io.OutputStream) objArr[1];
        char charValue = ((java.lang.Character) objArr[2]).charValue();
        char charValue2 = ((java.lang.Character) objArr[3]).charValue();
        char charValue3 = ((java.lang.Character) objArr[4]).charValue();
        char charValue4 = ((java.lang.Character) objArr[5]).charValue();
        int i = RecordsJson + 53;
        int i2 = i % 128;
        getProfileVersion = i2;
        if (i % 2 != 0) {
            byte b = enableusingapkindependentcontext.writeReplace;
            throw new java.lang.ArithmeticException();
        }
        char c = enableusingapkindependentcontext.writeReplace;
        if (charValue3 == c) {
            if (charValue4 != c) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, null, null, "\u0084\u008b\u0084\u0086\u0087\u0092\u0091\u008c\u008d\u0084\u0090\u0087\u0093\u008e\u0087\u0086\u0082\u008c\u0087\u008b\u0084\u0087\u0086\u008c\u008a\u008c\u008b\u0082\u008f\u008e\u0088\u0082\u008c\u0087\u008d\u008a\u008c\u008b\u0088\u0084\u008a\u0084\u0089\u0088\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr2);
                throw new java.io.IOException(((java.lang.String) objArr2[0]).intern());
            }
            byte[] bArr = enableusingapkindependentcontext.valueOf;
            byte b2 = bArr[charValue];
            byte b3 = bArr[charValue2];
            if ((b2 | b3) >= 0) {
                outputStream.write((b3 >> 4) | (b2 << 2));
                return 1;
            }
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, null, null, "\u0084\u008b\u0084\u0086\u0087\u0092\u0091\u008c\u008d\u0084\u0090\u0087\u0093\u008e\u0087\u0086\u0082\u008c\u0087\u008b\u0084\u0087\u0086\u008c\u008a\u008c\u008b\u0082\u008f\u008e\u0088\u0082\u008c\u0087\u008d\u008a\u008c\u008b\u0088\u0084\u008a\u0084\u0089\u0088\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr3);
            throw new java.io.IOException(((java.lang.String) objArr3[0]).intern());
        }
        if (charValue4 == c) {
            RecordsJson = (i2 + 53) % 128;
            byte[] bArr2 = enableusingapkindependentcontext.valueOf;
            byte b4 = bArr2[charValue];
            byte b5 = bArr2[charValue2];
            byte b6 = bArr2[charValue3];
            if ((b4 | b5 | b6) < 0) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, null, "\u0084\u008b\u0084\u0086\u0087\u0092\u0091\u008c\u008d\u0084\u0090\u0087\u0093\u008e\u0087\u0086\u0082\u008c\u0087\u008b\u0084\u0087\u0086\u008c\u008a\u008c\u008b\u0082\u008f\u008e\u0088\u0082\u008c\u0087\u008d\u008a\u008c\u008b\u0088\u0084\u008a\u0084\u0089\u0088\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr4);
                throw new java.io.IOException(((java.lang.String) objArr4[0]).intern());
            }
            outputStream.write((b4 << 2) | (b5 >> 4));
            outputStream.write((b6 >> 2) | (b5 << 4));
            getProfileVersion = (RecordsJson + 21) % 128;
            return 2;
        }
        byte[] bArr3 = enableusingapkindependentcontext.valueOf;
        byte b7 = bArr3[charValue];
        byte b8 = bArr3[charValue2];
        byte b9 = bArr3[charValue3];
        byte b10 = bArr3[charValue4];
        if ((b7 | b8 | b9 | b10) < 0) {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(127 - android.view.KeyEvent.normalizeMetaState(0), null, null, "\u0084\u008b\u0084\u0086\u0087\u0092\u0091\u008c\u008d\u0084\u0090\u0087\u0093\u008e\u0087\u0086\u0082\u008c\u0087\u008b\u0084\u0087\u0086\u008c\u008a\u008c\u008b\u0082\u008f\u008e\u0088\u0082\u008c\u0087\u008d\u008a\u008c\u008b\u0088\u0084\u008a\u0084\u0089\u0088\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081", objArr5);
            throw new java.io.IOException(((java.lang.String) objArr5[0]).intern());
        }
        outputStream.write((b7 << 2) | (b8 >> 4));
        outputStream.write((b8 << 4) | (b9 >> 2));
        outputStream.write(b10 | (b9 << 6));
        return 3;
    }

    private static int valueOf(java.lang.String str, int i, int i2) {
        while (i < i2) {
            int i3 = getProfileVersion + 89;
            RecordsJson = i3 % 128;
            if (i3 % 2 == 0) {
                valueOf(str.charAt(i));
                throw null;
            }
            if (!valueOf(str.charAt(i))) {
                return i;
            }
            i++;
            getProfileVersion = (RecordsJson + 93) % 128;
        }
        return i;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        RecordsJson = 1;
        AlternateContactlessPaymentDataJson = new char[]{10939, 10942, 10934, 10915, 10940, 10916, 10976, 10917, 10936, 10930, 10932, 10919, 10933, 10929, 10935, 10914, 10998, 10996, 10918};
        values = -143185408;
        SdkCoreAlternateContactlessPaymentDataImpl = true;
        IccPrivateKeyCrtComponentsJson = true;
    }

    static void init$0() {
        $$a = new byte[]{46, -52, 83, 98};
        $$b = 46;
    }

    private int valueOf(java.io.OutputStream outputStream, char c, char c2, char c3, char c4) throws java.io.IOException {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, outputStream, java.lang.Character.valueOf(c), java.lang.Character.valueOf(c2), java.lang.Character.valueOf(c3), java.lang.Character.valueOf(c4)}, -114395557, 114395557, java.lang.System.identityHashCode(this))).intValue();
    }
}
