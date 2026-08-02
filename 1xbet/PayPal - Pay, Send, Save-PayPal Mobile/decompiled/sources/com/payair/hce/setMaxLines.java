package com.payair.hce;

/* loaded from: classes4.dex */
public class setMaxLines {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int getProfileVersion;
    private static int valueOf;
    private static long values;
    private static char writeReplace;
    private java.io.OutputStream DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int intValue2 = ((java.lang.Number) objArr[2]).intValue();
        int i4 = getProfileVersion;
        valueOf = (i4 + 117) % 128;
        if (intValue2 < 31) {
            valueOf = (i4 + 99) % 128;
            setmaxlines.DigitizedCardProfile(intValue2 | intValue);
            return null;
        }
        setmaxlines.DigitizedCardProfile(intValue | 31);
        if (intValue2 < 128) {
            setmaxlines.DigitizedCardProfile(intValue2);
            return null;
        }
        byte[] bArr = new byte[5];
        int i5 = 4;
        bArr[4] = (byte) (intValue2 & 127);
        do {
            intValue2 >>= 7;
            i5--;
            bArr[i5] = (byte) ((intValue2 & 127) | 128);
        } while (intValue2 > 127);
        valueOf = (getProfileVersion + 121) % 128;
        setmaxlines.valueOf(bArr, i5, 5 - i5);
        return null;
    }

    private static void b(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i = b + 102;
        int i2 = s * 3;
        byte[] bArr = $$a;
        int i3 = (s2 * 3) + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i = (-i) + i3;
            i3++;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i = (-bArr[i3]) + i;
            i3++;
            i4 = i5;
        }
    }

    public setMaxLines(java.io.OutputStream outputStream) {
        this.DigitizedCardProfile = outputStream;
    }

    final void AlternateContactlessPaymentDataJson(int i) throws java.io.IOException {
        int i2 = valueOf + 49;
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0 ? i > 127 : i > 102) {
            int i3 = i;
            int i4 = 1;
            while (true) {
                i3 >>>= 8;
                if (i3 == 0) {
                    break;
                } else {
                    i4++;
                }
            }
            DigitizedCardProfile((byte) (i4 | 128));
            int i5 = (i4 - 1) << 3;
            while (i5 >= 0) {
                DigitizedCardProfile((byte) (i >> i5));
                i5 -= 8;
                int i6 = valueOf + 67;
                getProfileVersion = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 4;
                }
            }
            return;
        }
        DigitizedCardProfile((byte) i);
    }

    void DigitizedCardProfile(int i) throws java.io.IOException {
        valueOf = (getProfileVersion + 29) % 128;
        this.DigitizedCardProfile.write(i);
        valueOf = (getProfileVersion + 89) % 128;
    }

    final void valueOf(byte[] bArr) throws java.io.IOException {
        getProfileVersion = (valueOf + 11) % 128;
        this.DigitizedCardProfile.write(bArr);
        getProfileVersion = (valueOf + 93) % 128;
    }

    private void valueOf(byte[] bArr, int i, int i2) throws java.io.IOException {
        getProfileVersion = (valueOf + 19) % 128;
        this.DigitizedCardProfile.write(bArr, i, i2);
        int i3 = getProfileVersion + 117;
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    final void AlternateContactlessPaymentDataJson(int i, byte[] bArr) throws java.io.IOException {
        getProfileVersion = (valueOf + 5) % 128;
        DigitizedCardProfile(i);
        AlternateContactlessPaymentDataJson(bArr.length);
        valueOf(bArr);
        int i2 = getProfileVersion + 87;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    final void DigitizedCardProfile(int i, int i2, byte[] bArr) throws java.io.IOException {
        getProfileVersion = (valueOf + 79) % 128;
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)}, -584468000, 584468000, i);
        AlternateContactlessPaymentDataJson(bArr.length);
        valueOf(bArr);
        int i3 = valueOf + 75;
        getProfileVersion = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        java.lang.Object obj = null;
        if (str != null) {
            int i2 = $11 + 81;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length);
        java.lang.System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr5 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1178, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, (byte) 0, (short) 0, objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 30, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 3443, (char) (3831 - android.view.View.resolveSize(0, 0)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr3[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25, 1863 - android.view.MotionEvent.axisFromString(""), (char) (41776 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b((short) 0, (byte) 3, (short) 0, objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 28, 3132 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    byte length4 = (byte) $$a.length;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b((short) 0, length4, (byte) (length4 - 4), objArr8);
                    obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                cArr5[getwalletdata.writeReplace] = (char) ((((cArr3[intValue2] ^ charArray2[getwalletdata.writeReplace]) ^ (values ^ 1263759066225628708L)) ^ ((int) (AlternateContactlessPaymentDataJson ^ 1263759066225628708L))) ^ ((char) (writeReplace ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                obj = null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.String str4 = new java.lang.String(cArr5);
        int i3 = $10 + 43;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        objArr[0] = str4;
    }

    public void DigitizedCardProfile(com.payair.hce.setShadowLayer setshadowlayer) throws java.io.IOException {
        int i = getProfileVersion;
        valueOf = (i + 87) % 128;
        if (setshadowlayer != null) {
            valueOf = (i + 121) % 128;
            setshadowlayer.getAid().values(this);
        } else {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "李恮厶嶋\ue453⤨ꘝ驍ሪ摵⫾깟캊テᡴ㜋ࡲῴ䟒鬭", "意앂稧购", android.graphics.Color.red(0), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
    }

    final void values(com.payair.hce.setEms setems) throws java.io.IOException {
        int i = valueOf + 89;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (setems != null) {
            setems.values(new com.payair.hce.setMaxLines.valueOf(this.DigitizedCardProfile));
            valueOf = (getProfileVersion + 51) % 128;
        } else {
            float minVolume = android.media.AudioTrack.getMinVolume();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "李恮厶嶋\ue453⤨ꘝ驍ሪ摵⫾깟캊テᡴ㜋ࡲῴ䟒鬭", "意앂稧购", (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), (char) android.text.TextUtils.indexOf("", ""), objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
    }

    com.payair.hce.setMaxLines AlternateContactlessPaymentDataJson() {
        com.payair.hce.setAllCaps setallcaps = new com.payair.hce.setAllCaps(this.DigitizedCardProfile);
        int i = getProfileVersion + 3;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return setallcaps;
        }
        throw null;
    }

    com.payair.hce.setMaxLines valueOf() {
        com.payair.hce.setLogoDescription setlogodescription = new com.payair.hce.setLogoDescription(this.DigitizedCardProfile);
        valueOf = (getProfileVersion + 69) % 128;
        return setlogodescription;
    }

    final class valueOf extends com.payair.hce.setMaxLines {
        private static int valueOf = 0;
        private static int values = 1;
        private boolean writeReplace;

        public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
            return valueOf(objArr);
        }

        public valueOf(java.io.OutputStream outputStream) {
            super(outputStream);
            this.writeReplace = true;
        }

        private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
            com.payair.hce.setMaxLines.valueOf valueof = (com.payair.hce.setMaxLines.valueOf) objArr[0];
            int intValue = ((java.lang.Number) objArr[1]).intValue();
            if (!valueof.writeReplace) {
                super.DigitizedCardProfile(intValue);
                int i = values;
                int i2 = i & 99;
                int i3 = (((i ^ 99) | i2) << 1) - ((i | 99) & (~i2));
                valueOf = i3 % 128;
                if (i3 % 2 == 0) {
                    return null;
                }
                throw new java.lang.ArithmeticException();
            }
            int i4 = values;
            int i5 = ((i4 ^ 45) | (i4 & 45)) << 1;
            int i6 = -((i4 & (-46)) | ((~i4) & 45));
            valueOf = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
            valueof.writeReplace = false;
            return null;
        }

        @Override // com.payair.hce.setMaxLines
        public final void DigitizedCardProfile(int i) throws java.io.IOException {
            values(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, 1433465234, -1433465234, i);
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        getProfileVersion = 1;
        values = 1263759066225628708L;
        AlternateContactlessPaymentDataJson = -804334044;
        writeReplace = (char) 37933;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SI, -31, 80, -73};
        $$b = 239;
    }

    final void writeReplace(int i, int i2) throws java.io.IOException {
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)}, -584468000, 584468000, i);
    }
}
