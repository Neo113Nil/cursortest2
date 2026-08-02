package com.payair.hce;

/* loaded from: classes4.dex */
final class setHovered implements com.payair.hce.getDrawable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static byte[] IccPrivateKeyCrtComponentsJson;
    private static short[] RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char[] getAid;
    private static char getCvrMaskAnd;
    private static int getGpoResponse;
    private static int getPaymentFci;
    private static int getProfileVersion;
    private static int writeReplace;
    private long values = 0;
    private java.util.SortedMap<java.lang.Long, com.payair.hce.getDrawable> DigitizedCardProfile = new java.util.TreeMap();
    private java.util.SortedMap<java.lang.Long, com.payair.hce.getDrawable> AlternateContactlessPaymentDataJson = new java.util.TreeMap();
    private java.util.HashMap<java.lang.Long, java.lang.String> valueOf = new java.util.HashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 35 - (b * 28);
        int i4 = 38 - (s * 34);
        byte[] bArr = $$a;
        int i5 = 118 - (s2 * 53);
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i4;
            int i7 = i3;
            i2 = 0;
            int i8 = (i7 + i4) - 2;
            int i9 = i6 + 1;
            i = i2;
            i5 = i8;
            i4 = i9;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i5;
            i6 = i4;
            i4 = bArr[i4];
            i7 = i10;
            int i82 = (i7 + i4) - 2;
            int i92 = i6 + 1;
            i = i2;
            i5 = i82;
            i4 = i92;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i3) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$d;
        ?? r8 = b + 65;
        int i4 = 134 - s;
        byte[] bArr2 = new byte[i + 12];
        if (bArr == null) {
            byte b2 = r8;
            i2 = 0;
            int i5 = i4;
            int i6 = i5 + 1;
            i3 = i4 + (-b2);
            i4 = i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i + 11) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            b2 = bArr[i4];
            int i7 = i3;
            i5 = i4;
            i4 = i7;
            int i62 = i5 + 1;
            i3 = i4 + (-b2);
            i4 = i62;
            bArr2[i2] = (byte) i3;
            if (i2 == i + 11) {
            }
        } else {
            i2 = 0;
            i3 = r8;
            bArr2[i2] = (byte) i3;
            if (i2 == i + 11) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5;
        byte[] bArr = $$g;
        int i6 = i * 2;
        int i7 = 3 - (i2 * 2);
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i8 = i6;
            i5 = i7;
            int i9 = 0;
            i7 += -i8;
            i4 = i9;
            bArr2[i4] = (byte) i7;
            i9 = i4 + 1;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5++;
            i8 = bArr[i5];
            i7 += -i8;
            i4 = i9;
            bArr2[i4] = (byte) i7;
            i9 = i4 + 1;
            if (i4 == i6) {
            }
        } else {
            int i10 = 104 - i3;
            i4 = 0;
            i5 = i7;
            i7 = i10;
            bArr2[i4] = (byte) i7;
            i9 = i4 + 1;
            if (i4 == i6) {
            }
        }
    }

    setHovered() {
    }

    final long AlternateContactlessPaymentDataJson(com.payair.hce.getDrawable getdrawable) {
        long aid;
        synchronized (this) {
            int i = getGpoResponse;
            getPaymentFci = (((i | 13) << 1) - (i ^ 13)) % 128;
            aid = getAid();
            this.AlternateContactlessPaymentDataJson.put(java.lang.Long.valueOf(aid), getdrawable);
            int i2 = getGpoResponse;
            int i3 = i2 & 107;
            int i4 = i2 | 107;
            getPaymentFci = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        }
        return aid;
    }

    final void writeReplace(long j) {
        synchronized (this) {
            int i = getGpoResponse;
            int i2 = (i & 119) + (i | 119);
            getPaymentFci = i2 % 128;
            if (i2 % 2 != 0) {
                this.AlternateContactlessPaymentDataJson.remove(java.lang.Long.valueOf(j));
            } else {
                this.AlternateContactlessPaymentDataJson.remove(java.lang.Long.valueOf(j));
                throw new java.lang.ArithmeticException();
            }
        }
    }

    final int getProfileVersion() {
        int size;
        synchronized (this) {
            int i = getGpoResponse;
            int i2 = i ^ 21;
            int i3 = (((i & 21) | i2) << 1) - i2;
            getPaymentFci = i3 % 128;
            if (i3 % 2 == 0) {
                this.AlternateContactlessPaymentDataJson.values().size();
                throw new java.lang.ArithmeticException();
            }
            size = this.AlternateContactlessPaymentDataJson.values().size();
        }
        return size;
    }

    private long getAid() {
        long j;
        synchronized (this) {
            int i = getGpoResponse;
            int i2 = i & 23;
            int i3 = -(-((i ^ 23) | i2));
            int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
            getPaymentFci = i4;
            j = this.values;
            this.values = 1 + j;
            int i5 = i4 & 93;
            int i6 = ((i4 ^ 93) | i5) << 1;
            int i7 = -((i4 | 93) & (~i5));
            int i8 = (i6 & i7) + (i7 | i6);
            getGpoResponse = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        }
        return j;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean valueOf(java.lang.String str) {
        synchronized (this) {
            int i = getGpoResponse;
            int i2 = i ^ 79;
            int i3 = (i & 79) << 1;
            getPaymentFci = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i4 = getGpoResponse;
            int i5 = ((i4 & (-116)) | ((~i4) & 115)) + ((i4 & 115) << 1);
            getPaymentFci = i5 % 128;
            int i6 = i5 % 2;
            while (it.hasNext()) {
                int i7 = getPaymentFci + 53;
                getGpoResponse = i7 % 128;
                if (i7 % 2 != 0) {
                    it.next().valueOf(str);
                    throw new java.lang.NullPointerException();
                }
                if (it.next().valueOf(str)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i8 = getPaymentFci;
            int i9 = (i8 & (-42)) | ((~i8) & 41);
            int i10 = (i8 & 41) << 1;
            getGpoResponse = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
            while (it2.hasNext()) {
                int i11 = getPaymentFci;
                int i12 = (i11 & 67) + (i11 | 67);
                getGpoResponse = i12 % 128;
                if (i12 % 2 != 0) {
                    it2.next().valueOf(str);
                    throw new java.lang.NullPointerException();
                }
                if (it2.next().valueOf(str)) {
                    break;
                }
            }
            int i13 = getPaymentFci;
            int i14 = (i13 & 31) + (i13 | 31);
            getGpoResponse = i14 % 128;
            if (i14 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean writeReplace(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        synchronized (this) {
            int i = getGpoResponse;
            int i2 = (i & 126) + (i | 126);
            getPaymentFci = ((~i2) + (i2 << 1)) % 128;
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i3 = getPaymentFci;
            int i4 = i3 & 61;
            int i5 = -(-((i3 ^ 61) | i4));
            getGpoResponse = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
            while (it.hasNext()) {
                int i6 = getGpoResponse;
                int i7 = ((i6 ^ 9) | (i6 & 9)) << 1;
                int i8 = -((i6 & (-10)) | ((~i6) & 9));
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                getPaymentFci = i9 % 128;
                if (i9 % 2 == 0) {
                    it.next().writeReplace(str, str2, exc);
                    throw null;
                }
                if (it.next().writeReplace(str, str2, exc)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i10 = getPaymentFci;
            int i11 = i10 & 77;
            getGpoResponse = (((((i10 ^ 77) | i11) << 1) - (~(-((i10 | 77) & (~i11))))) - 1) % 128;
            while (it2.hasNext()) {
                int i12 = getPaymentFci;
                int i13 = i12 ^ 115;
                int i14 = (i12 & 115) << 1;
                getGpoResponse = (((i13 | i14) << 1) - (i14 ^ i13)) % 128;
                if (it2.next().writeReplace(str, str2, exc)) {
                    break;
                }
            }
            int i15 = getGpoResponse;
            int i16 = ((i15 & 90) + (i15 | 90)) - 1;
            getPaymentFci = i16 % 128;
            if (i16 % 2 == 0) {
                throw new java.lang.NullPointerException();
            }
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean writeReplace(java.lang.String str) {
        synchronized (this) {
            int i = getGpoResponse + 117;
            getPaymentFci = i % 128;
            if (i % 2 == 0) {
                this.DigitizedCardProfile.values().iterator();
                throw new java.lang.NullPointerException();
            }
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i2 = getPaymentFci;
            int i3 = (i2 & 101) + (i2 | 101);
            getGpoResponse = i3 % 128;
            int i4 = i3 % 2;
            while (it.hasNext()) {
                int i5 = getGpoResponse;
                getPaymentFci = ((((i5 | 58) << 1) - (i5 ^ 58)) - 1) % 128;
                if (it.next().writeReplace(str)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i6 = getGpoResponse;
            int i7 = i6 & 93;
            int i8 = (((i6 ^ 93) | i7) << 1) - ((i6 | 93) & (~i7));
            getPaymentFci = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 / 5;
            }
            while (it2.hasNext()) {
                int i10 = getPaymentFci;
                int i11 = (i10 ^ 3) + ((i10 & 3) << 1);
                getGpoResponse = i11 % 128;
                if (i11 % 2 != 0) {
                    it2.next().writeReplace(str);
                    throw new java.lang.ArithmeticException();
                }
                if (it2.next().writeReplace(str)) {
                    break;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, short s, int i2, int i3, byte b, java.lang.Object[] objArr) {
        boolean z;
        long j;
        int i4;
        boolean z2;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 27, android.view.KeyEvent.normalizeMetaState(0) + 29, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                z = true;
            } else {
                $10 = ($11 + 121) % 128;
                z = false;
            }
            if (z) {
                int i5 = $10;
                $11 = (i5 + 13) % 128;
                byte[] bArr = IccPrivateKeyCrtComponentsJson;
                if (bArr != null) {
                    $11 = (i5 + 1) % 128;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i6])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.graphics.ImageFormat.getBitsPerPixel(0), 5088 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i6] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr == null) {
                    j = -4897270311952305750L;
                    intValue = (short) (((short) (RecordsJson[i2 + ((int) (writeReplace ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ (-4897270311952305750L))));
                    if (intValue > 0) {
                        int i7 = (int) (writeReplace ^ j);
                        if (z) {
                            $11 = ($10 + 29) % 128;
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + i7 + i4;
                        java.lang.Object[] objArr4 = {gettrack2constructiondata, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(getProfileVersion), sb};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj3 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.KeyEvent.getDeadChar(0, 0), android.graphics.Color.argb(0, 0, 0, 0) + 2364, (char) (android.os.Process.getGidForName("") + 1));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            e(0, 0, 0, objArr5);
                            obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj3);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr3 = IccPrivateKeyCrtComponentsJson;
                        if (bArr3 != null) {
                            int length2 = bArr3.length;
                            byte[] bArr4 = new byte[length2];
                            for (int i8 = 0; i8 < length2; i8++) {
                                bArr4[i8] = (byte) (bArr3[i8] ^ (-4897270311952305750L));
                            }
                            bArr3 = bArr4;
                        }
                        if (bArr3 != null) {
                            $11 = ($10 + 51) % 128;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            int i9 = $11 + 29;
                            $10 = i9 % 128;
                            if (i9 % 2 != 0) {
                                throw null;
                            }
                            if (z2) {
                                byte[] bArr5 = IccPrivateKeyCrtComponentsJson;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr5[r8] ^ (-4897270311952305750L))) + s)) ^ b));
                            } else {
                                short[] sArr = RecordsJson;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r8] ^ (-4897270311952305750L))) + s)) ^ b));
                            }
                            sb.append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            gettrack2constructiondata.DigitizedCardProfile++;
                        }
                    }
                    objArr[0] = sb.toString();
                }
                byte[] bArr6 = IccPrivateKeyCrtComponentsJson;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(writeReplace)};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27, 29 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                }
                intValue = (byte) (((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).intValue()] ^ (-4897270311952305750L))) + ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ (-4897270311952305750L))));
            }
            j = -4897270311952305750L;
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ae, code lost:
    
        if (r2.valueOf == r2.writeReplace) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01de, code lost:
    
        r7 = new java.lang.Object[]{r2, r2, java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), r2};
        r9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x022c, code lost:
    
        if (r9 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x022e, code lost:
    
        r9 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 29, 3596 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02af, code lost:
    
        if (((java.lang.Integer) ((java.lang.reflect.Method) r9).invoke(null, r7)).intValue() != r2.SdkCoreAlternateContactlessPaymentDataImpl) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02b3, code lost:
    
        r9 = new java.lang.Object[]{r2, r2, java.lang.Integer.valueOf(r4), java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), java.lang.Integer.valueOf(r4), r2, java.lang.Integer.valueOf(r4), r2};
        r7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02f3, code lost:
    
        if (r7 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02f5, code lost:
    
        r7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)), android.graphics.Color.argb(0, 0, 0, 0) + 2665, (char) (18889 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)));
        r10 = new java.lang.Object[1];
        e(0, 0, 31, r10);
        r7 = r7.getMethod((java.lang.String) r10[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x036a, code lost:
    
        r7 = ((java.lang.Integer) ((java.lang.reflect.Method) r7).invoke(null, r9)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0377, code lost:
    
        r9 = r2.AlternateContactlessPaymentDataJson;
        r14 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r5[r2.values] = r3[r7];
        r5[r2.values + 1] = r3[(r9 * r4) + r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x03e5, code lost:
    
        r2.values += 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0392, code lost:
    
        if (r2.DigitizedCardProfile != r2.AlternateContactlessPaymentDataJson) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0394, code lost:
    
        com.payair.hce.setHovered.$10 = (com.payair.hce.setHovered.$11 + 111) % 128;
        r2.RecordsJson = ((r2.RecordsJson + r4) - 1) % r4;
        r2.SdkCoreAlternateContactlessPaymentDataImpl = ((r2.SdkCoreAlternateContactlessPaymentDataImpl + r4) - 1) % r4;
        r7 = r2.DigitizedCardProfile;
        r9 = r2.RecordsJson;
        r14 = r2.AlternateContactlessPaymentDataJson;
        r15 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r5[r2.values] = r3[(r7 * r4) + r9];
        r5[r2.values + 1] = r3[(r14 * r4) + r15];
        com.payair.hce.setHovered.$10 = (com.payair.hce.setHovered.$11 + 17) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x03cc, code lost:
    
        r7 = r2.DigitizedCardProfile;
        r9 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r10 = r2.AlternateContactlessPaymentDataJson;
        r14 = r2.RecordsJson;
        r5[r2.values] = r3[(r7 * r4) + r9];
        r5[r2.values + 1] = r3[(r10 * r4) + r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c4, code lost:
    
        r5[r2.values] = (char) (r2.valueOf - r29);
        r5[r2.values + 1] = (char) (r2.writeReplace - r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c2, code lost:
    
        if (r2.valueOf == r2.writeReplace) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, java.lang.String str, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = getAid;
        long j = 0;
        int i3 = -1497284274;
        int i4 = 2;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 109;
                $10 = i6 % 128;
                if (i6 % i4 != 0) {
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5])};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(java.lang.Integer.valueOf(i3));
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.MotionEvent.axisFromString(""), (android.os.SystemClock.elapsedRealtimeNanos() > j ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 2507, (char) (6803 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1))));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            e(0, 0, 39, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                        }
                        cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr[i5])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.KeyEvent.normalizeMetaState(0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2508, (char) (6802 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        e(0, 0, 39, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
                    }
                    cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i5++;
                }
                j = 0;
                i3 = -1497284274;
                i4 = 2;
            }
            $11 = ($10 + 75) % 128;
            cArr = cArr2;
        }
        java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(getCvrMaskAnd)};
        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj3 == null) {
            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 49, 2508 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 6802));
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            e(0, 0, 39, objArr7);
            obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj3);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            $10 = ($11 + 93) % 128;
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                int i7 = $11 + 33;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values];
                } else {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                }
            }
        }
        $10 = ($11 + 79) % 128;
        for (int i8 = 0; i8 < i; i8++) {
            $10 = ($11 + 97) % 128;
            cArr3[i8] = (char) (cArr3[i8] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // com.payair.hce.getDrawable
    public final boolean DigitizedCardProfile(java.lang.String str, int i) {
        synchronized (this) {
            int i2 = getPaymentFci;
            int i3 = i2 & 63;
            int i4 = (i2 ^ 63) | i3;
            getGpoResponse = ((i3 & i4) + (i4 | i3)) % 128;
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i5 = getGpoResponse;
            int i6 = (i5 | 59) << 1;
            int i7 = -((i5 & (-60)) | ((~i5) & 59));
            getPaymentFci = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
            while (it.hasNext()) {
                int i8 = getPaymentFci;
                int i9 = (i8 & 65) + (i8 | 65);
                getGpoResponse = i9 % 128;
                if (i9 % 2 != 0) {
                    it.next().DigitizedCardProfile(str, i);
                    throw null;
                }
                if (it.next().DigitizedCardProfile(str, i)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i10 = getPaymentFci;
            int i11 = i10 & 119;
            int i12 = (i10 | 119) & (~i11);
            int i13 = -(-(i11 << 1));
            int i14 = (i12 & i13) + (i12 | i13);
            getGpoResponse = i14 % 128;
            int i15 = i14 % 2;
            while (it2.hasNext()) {
                int i16 = getGpoResponse;
                getPaymentFci = (((i16 ^ 15) - (~((i16 & 15) << 1))) - 1) % 128;
                if (it2.next().DigitizedCardProfile(str, i)) {
                    break;
                }
            }
            int i17 = getPaymentFci;
            int i18 = (((i17 ^ 105) | (i17 & 105)) << 1) - ((i17 & (-106)) | ((~i17) & 105));
            getGpoResponse = i18 % 128;
            if (i18 % 2 != 0) {
                throw null;
            }
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean valueOf(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        synchronized (this) {
            int i = getGpoResponse;
            getPaymentFci = (((i ^ 28) + ((i & 28) << 1)) - 1) % 128;
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i2 = getPaymentFci;
            int i3 = (i2 & (-52)) | ((~i2) & 51);
            int i4 = -(-((i2 & 51) << 1));
            getGpoResponse = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
            while (it.hasNext()) {
                int i5 = getPaymentFci;
                int i6 = (i5 & (-66)) | ((~i5) & 65);
                int i7 = (i5 & 65) << 1;
                getGpoResponse = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
                if (it.next().valueOf(str, str2, str3, exc)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            getGpoResponse = (getPaymentFci + 69) % 128;
            while (it2.hasNext()) {
                int i8 = getPaymentFci;
                int i9 = ((i8 & (-64)) | ((~i8) & 63)) + ((i8 & 63) << 1);
                getGpoResponse = i9 % 128;
                if (i9 % 2 != 0) {
                    it2.next().valueOf(str, str2, str3, exc);
                    throw new java.lang.ArithmeticException();
                }
                if (it2.next().valueOf(str, str2, str3, exc)) {
                    break;
                }
            }
            int i10 = getPaymentFci;
            int i11 = (i10 | 85) << 1;
            int i12 = -((i10 & (-86)) | ((~i10) & 85));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            getGpoResponse = i13 % 128;
            if (i13 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean AlternateContactlessPaymentDataJson(java.lang.String str) {
        synchronized (this) {
            int i = getGpoResponse;
            int i2 = ((i ^ 65) | (i & 65)) << 1;
            int i3 = -((i & (-66)) | ((~i) & 65));
            int i4 = (i2 & i3) + (i3 | i2);
            getPaymentFci = i4 % 128;
            if (i4 % 2 == 0) {
                this.DigitizedCardProfile.values().iterator();
                throw new java.lang.ArithmeticException();
            }
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            while (it.hasNext()) {
                int i5 = (-2) - (~(getPaymentFci + 96));
                getGpoResponse = i5 % 128;
                if (i5 % 2 != 0) {
                    it.next().AlternateContactlessPaymentDataJson(str);
                    throw new java.lang.NullPointerException();
                }
                if (it.next().AlternateContactlessPaymentDataJson(str)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i6 = getGpoResponse;
            int i7 = (i6 & 21) + (i6 | 21);
            getPaymentFci = i7 % 128;
            int i8 = i7 % 2;
            while (it2.hasNext()) {
                int i9 = getPaymentFci;
                int i10 = (i9 | 65) << 1;
                int i11 = -((i9 & (-66)) | ((~i9) & 65));
                getGpoResponse = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
                if (it2.next().AlternateContactlessPaymentDataJson(str)) {
                    break;
                }
            }
            getGpoResponse = (getPaymentFci + 35) % 128;
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean AlternateContactlessPaymentDataJson(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        synchronized (this) {
            int i = getPaymentFci;
            int i2 = (i ^ 79) + ((i & 79) << 1);
            getGpoResponse = i2 % 128;
            if (i2 % 2 != 0) {
                this.DigitizedCardProfile.values().iterator();
                throw null;
            }
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            while (it.hasNext()) {
                int i3 = getPaymentFci;
                int i4 = i3 & 7;
                int i5 = (i3 | 7) & (~i4);
                int i6 = i4 << 1;
                int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
                getGpoResponse = i7 % 128;
                if (i7 % 2 != 0) {
                    it.next().AlternateContactlessPaymentDataJson(str, str2, str3, exc);
                    throw null;
                }
                if (it.next().AlternateContactlessPaymentDataJson(str, str2, str3, exc)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i8 = getGpoResponse;
            int i9 = i8 ^ 43;
            int i10 = -(-((i8 & 43) << 1));
            int i11 = (i9 & i10) + (i10 | i9);
            getPaymentFci = i11 % 128;
            int i12 = i11 % 2;
            while (it2.hasNext()) {
                int i13 = getGpoResponse;
                int i14 = i13 & 125;
                getPaymentFci = (i14 + ((i13 ^ 125) | i14)) % 128;
                if (it2.next().AlternateContactlessPaymentDataJson(str, str2, str3, exc)) {
                    break;
                }
            }
            int i15 = getPaymentFci + 45;
            getGpoResponse = i15 % 128;
            if (i15 % 2 != 0) {
                throw null;
            }
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean values(java.lang.String str) {
        synchronized (this) {
            int i = getPaymentFci;
            int i2 = (i & 13) + (i | 13);
            getGpoResponse = i2 % 128;
            if (i2 % 2 != 0) {
                this.DigitizedCardProfile.values().iterator();
                throw null;
            }
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i3 = getGpoResponse;
            int i4 = (i3 & (-30)) | ((~i3) & 29);
            int i5 = (i3 & 29) << 1;
            getPaymentFci = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
            while (it.hasNext()) {
                int i6 = getPaymentFci;
                getGpoResponse = ((i6 ^ 51) + ((i6 & 51) << 1)) % 128;
                if (it.next().values(str)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            getGpoResponse = (getPaymentFci + 63) % 128;
            while (it2.hasNext()) {
                int i7 = getGpoResponse;
                int i8 = i7 ^ 23;
                int i9 = (i7 & 23) << 1;
                int i10 = (i8 & i9) + (i9 | i8);
                getPaymentFci = i10 % 128;
                if (i10 % 2 == 0) {
                    it2.next().values(str);
                    throw null;
                }
                if (it2.next().values(str)) {
                    break;
                }
            }
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i11 = ~identityHashCode;
            int i12 = i11 & (-545694883);
            int i13 = (~i12) & (i11 | (-545694883));
            int i14 = ~((i12 ^ i13) | (i12 & i13));
            int i15 = i14 & (-703423553);
            int i16 = (i14 | (-703423553)) & (~i15);
            int i17 = (i11 | identityHashCode) & i11;
            int i18 = i17 & (-545694883);
            int i19 = (i17 | (-545694883)) & (~i18);
            int i20 = (i19 ^ i18) | (i19 & i18) | (-703423553);
            int i21 = ~i20;
            int i22 = (i20 | i21) & i21;
            int i23 = ~(((-157892673) ^ identityHashCode) | (identityHashCode & (-157892673)));
            int i24 = ((~i23) & i22) | ((~i22) & i23);
            int i25 = i22 & i23;
            int i26 = (-2) - (~(((99072953 - (~(((i16 ^ i15) | (i16 & i15)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))) - (~(-(~(((i25 & i24) | (i25 ^ i24)) * (-519)))))) - 1));
            int i27 = (i11 & (-703423553)) | (703423552 & identityHashCode);
            int i28 = identityHashCode & (-703423553);
            int i29 = ~((i28 ^ i27) | (i28 & i27));
            int i30 = -(~(((i29 & (-545694883)) | (545694882 & (~i29)) | (i29 & 545694882)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
            int identityHashCode2 = java.lang.System.identityHashCode(this);
            int i31 = ~identityHashCode2;
            int i32 = i31 & 2069840024;
            int i33 = ~(((~i31) & 2069840024) | (i31 & (-2069840025)) | i32);
            int i34 = identityHashCode2 | 312880174;
            int i35 = ~i34;
            int i36 = (i34 | i35) & i35;
            int i37 = -(-(((i33 ^ i36) | (i33 & i36)) * com.visa.cbp.getCertUsage.getODAData));
            int i38 = i37 & 1414884285;
            int i39 = (i37 | 1414884285) & (~i38);
            int i40 = i38 << 1;
            int i41 = (i39 & i40) + (i39 | i40);
            int i42 = (identityHashCode2 & (-2069840025)) | i32;
            int i43 = identityHashCode2 & 2069840024;
            int i44 = ~((i43 ^ i42) | (i43 & i42));
            int i45 = i31 & 312880174;
            int i46 = ~(((i31 | 312880174) & (~i45)) | i45);
            int i47 = i44 ^ i46;
            int i48 = i44 & i46;
            int i49 = ((i48 ^ i47) | (i48 & i47)) * com.visa.cbp.getCertUsage.getODAData;
            if (((i26 & i30) + (i30 | i26)) - 1 <= (((~i49) & i41) | ((~i41) & i49)) + ((i49 & i41) << 1)) {
                throw null;
            }
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean values(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        synchronized (this) {
            int i2 = getGpoResponse;
            int i3 = i2 | 113;
            int i4 = i3 << 1;
            int i5 = -((~(i2 & 113)) & i3);
            int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
            getPaymentFci = i6 % 128;
            if (i6 % 2 == 0) {
                this.DigitizedCardProfile.values().iterator();
                throw null;
            }
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            while (it.hasNext()) {
                int i7 = getPaymentFci + 67;
                getGpoResponse = i7 % 128;
                if (i7 % 2 != 0) {
                    it.next().values(str, i, str2, str3, exc);
                    throw null;
                }
                if (it.next().values(str, i, str2, str3, exc)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i8 = getPaymentFci;
            int i9 = i8 & 13;
            int i10 = ((i8 ^ 13) | i9) << 1;
            int i11 = -((i8 | 13) & (~i9));
            int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
            getGpoResponse = i12 % 128;
            int i13 = i12 % 2;
            while (it2.hasNext()) {
                int i14 = getPaymentFci;
                getGpoResponse = ((i14 & 5) + (i14 | 5)) % 128;
                if (it2.next().values(str, i, str2, str3, exc)) {
                    break;
                }
            }
            getGpoResponse = (getPaymentFci + 73) % 128;
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean DigitizedCardProfile(java.lang.String str) {
        synchronized (this) {
            int i = getPaymentFci;
            int i2 = i & 117;
            int i3 = (i | 117) & (~i2);
            int i4 = -(-(i2 << 1));
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            getGpoResponse = i5 % 128;
            if (i5 % 2 != 0) {
                this.DigitizedCardProfile.values().iterator();
                throw new java.lang.ArithmeticException();
            }
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i6 = getGpoResponse;
            int i7 = (((i6 ^ 49) | (i6 & 49)) << 1) - ((i6 & (-50)) | ((~i6) & 49));
            getPaymentFci = i7 % 128;
            int i8 = i7 % 2;
            while (it.hasNext()) {
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i9 = ~identityHashCode;
                int i10 = i9 ^ 2086455176;
                int i11 = i9 & 2086455176;
                int i12 = ~((i10 ^ i11) | (i10 & i11));
                int i13 = identityHashCode ^ (-1343769462);
                int i14 = identityHashCode & (-1343769462);
                int i15 = ((826560856 - (~(-(~((((i12 & 1343769461) | ((~i12) & (-1343769462))) | (i12 & (-1343769462))) * (-328)))))) - (~(-(~(-(-(((i13 & i14) | (i13 ^ i14)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))))))) - 2;
                int i16 = ~(((-2086455177) & i9) | (identityHashCode & 2086455176) | (identityHashCode & (-2086455177)));
                int i17 = ((~i16) & 742687880) | ((-742687881) & i16);
                int i18 = i16 & 742687880;
                int i19 = (i18 ^ i17) | (i18 & i17);
                int i20 = (identityHashCode | i9) & i9;
                int i21 = (i20 ^ (-1343769462)) | (i20 & (-1343769462));
                int i22 = i21 & 2086455176;
                int i23 = (i21 | 2086455176) & (~i22);
                int i24 = (i23 ^ i22) | (i23 & i22);
                int i25 = ~i24;
                int i26 = (i24 | i25) & i25;
                int i27 = i19 & i26;
                int i28 = -(~((((i26 | i19) & (~i27)) | i27) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
                int identityHashCode2 = java.lang.System.identityHashCode(this);
                int i29 = ~((identityHashCode2 ^ (-377154546)) | (identityHashCode2 & (-377154546)));
                int i30 = i29 & 465208580;
                int i31 = (465208580 | i29) & (~i30);
                int i32 = -(-(((i31 ^ i30) | (i31 & i30)) * (-220)));
                int i33 = (i32 ^ 253646131) + ((i32 & 253646131) << 1);
                int i34 = i29 & 305824000;
                int i35 = (i29 | 305824000) & (~i34);
                int i36 = -(-(((i35 ^ i34) | (i35 & i34)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                int i37 = (((i33 ^ i36) | (i33 & i36)) << 1) - (((~i36) & i33) | ((~i33) & i36));
                int i38 = i37 & (-391140026);
                int i39 = -(-(((-391140026) ^ i37) | i38));
                if ((-2) - (~((i15 ^ i28) + ((i28 & i15) << 1))) <= ((i38 | i39) << 1) - (i39 ^ i38)) {
                    it.next().DigitizedCardProfile(str);
                    throw new java.lang.NullPointerException();
                }
                if (it.next().DigitizedCardProfile(str)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i40 = getPaymentFci;
            getGpoResponse = ((i40 ^ 113) + ((i40 & 113) << 1)) % 128;
            while (it2.hasNext()) {
                int i41 = getGpoResponse;
                int i42 = ((i41 ^ 5) | (i41 & 5)) << 1;
                int i43 = -((i41 & (-6)) | ((~i41) & 5));
                int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                getPaymentFci = i44 % 128;
                if (i44 % 2 == 0) {
                    it2.next().DigitizedCardProfile(str);
                    throw null;
                }
                if (it2.next().DigitizedCardProfile(str)) {
                    break;
                }
            }
            int i45 = getPaymentFci;
            int i46 = i45 | 11;
            int i47 = i46 << 1;
            int i48 = -((~(i45 & 11)) & i46);
            getGpoResponse = ((i47 & i48) + (i48 | i47)) % 128;
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean AlternateContactlessPaymentDataJson(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        synchronized (this) {
            int i2 = getGpoResponse;
            int i3 = ((i2 & (-36)) | ((~i2) & 35)) + ((i2 & 35) << 1);
            getPaymentFci = i3 % 128;
            if (i3 % 2 == 0) {
                this.DigitizedCardProfile.values().iterator();
                throw new java.lang.NullPointerException();
            }
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            while (it.hasNext()) {
                int i4 = getPaymentFci;
                int i5 = i4 & 71;
                int i6 = (((i4 | 71) & (~i5)) - (~(i5 << 1))) - 1;
                getGpoResponse = i6 % 128;
                if (i6 % 2 != 0) {
                    it.next().AlternateContactlessPaymentDataJson(str, i, str2, str3, exc);
                    throw new java.lang.NullPointerException();
                }
                if (it.next().AlternateContactlessPaymentDataJson(str, i, str2, str3, exc)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i7 = getGpoResponse;
            getPaymentFci = ((i7 ^ 19) + ((i7 & 19) << 1)) % 128;
            while (it2.hasNext()) {
                int i8 = getPaymentFci;
                int i9 = i8 & 71;
                getGpoResponse = (i9 + ((i8 ^ 71) | i9)) % 128;
                if (it2.next().AlternateContactlessPaymentDataJson(str, i, str2, str3, exc)) {
                    break;
                }
            }
            int i10 = getPaymentFci;
            int i11 = i10 ^ 57;
            getGpoResponse = ((((i10 & 57) | i11) << 1) - i11) % 128;
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean AlternateContactlessPaymentDataJson() {
        synchronized (this) {
            int i = getGpoResponse;
            getPaymentFci = ((((i & (-30)) | ((~i) & 29)) - (~((i & 29) << 1))) - 1) % 128;
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i2 = getGpoResponse + 103;
            getPaymentFci = i2 % 128;
            int i3 = i2 % 2;
            while (it.hasNext()) {
                int i4 = getGpoResponse;
                int i5 = i4 & 121;
                int i6 = -(-((i4 ^ 121) | i5));
                getPaymentFci = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
                if (it.next().AlternateContactlessPaymentDataJson()) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i7 = getGpoResponse;
            int i8 = i7 & 117;
            getPaymentFci = (i8 + ((i7 ^ 117) | i8)) % 128;
            while (it2.hasNext()) {
                int i9 = getGpoResponse;
                int i10 = i9 & 39;
                int i11 = (i9 | 39) & (~i10);
                int i12 = -(-(i10 << 1));
                int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
                getPaymentFci = i13 % 128;
                if (i13 % 2 == 0) {
                    it2.next().AlternateContactlessPaymentDataJson();
                    throw null;
                }
                if (it2.next().AlternateContactlessPaymentDataJson()) {
                    break;
                }
            }
            int i14 = getGpoResponse;
            int i15 = ((i14 ^ 5) | (i14 & 5)) << 1;
            int i16 = -((i14 & (-6)) | ((~i14) & 5));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            getPaymentFci = i17 % 128;
            if (i17 % 2 == 0) {
                throw null;
            }
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean writeReplace(int i, java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        synchronized (this) {
            int i2 = (-2) - (~(getPaymentFci + 78));
            getGpoResponse = i2 % 128;
            if (i2 % 2 != 0) {
                this.DigitizedCardProfile.values().iterator();
                throw new java.lang.NullPointerException();
            }
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            while (it.hasNext()) {
                int i3 = getGpoResponse + 61;
                getPaymentFci = i3 % 128;
                if (i3 % 2 == 0) {
                    it.next().writeReplace(i, str, str2, exc);
                    throw null;
                }
                if (it.next().writeReplace(i, str, str2, exc)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i4 = getPaymentFci;
            getGpoResponse = (((i4 ^ 32) + ((i4 & 32) << 1)) - 1) % 128;
            while (it2.hasNext()) {
                int i5 = getPaymentFci + 60;
                getGpoResponse = ((~i5) + (i5 << 1)) % 128;
                if (it2.next().writeReplace(i, str, str2, exc)) {
                    break;
                }
            }
            int i6 = getGpoResponse;
            int i7 = i6 & 43;
            int i8 = (i6 ^ 43) | i7;
            getPaymentFci = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean DigitizedCardProfile() {
        synchronized (this) {
            int i = getPaymentFci;
            int i2 = i ^ 49;
            int i3 = -(-((i & 49) << 1));
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            getGpoResponse = i4 % 128;
            if (i4 % 2 != 0) {
                this.DigitizedCardProfile.values().iterator();
                throw null;
            }
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i5 = getGpoResponse + 7;
            getPaymentFci = i5 % 128;
            int i6 = i5 % 2;
            while (it.hasNext()) {
                int i7 = getPaymentFci;
                int i8 = i7 & 33;
                int i9 = (i7 | 33) & (~i8);
                int i10 = -(-(i8 << 1));
                getGpoResponse = (((i9 | i10) << 1) - (i9 ^ i10)) % 128;
                if (it.next().DigitizedCardProfile()) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i11 = getPaymentFci;
            int i12 = i11 & 89;
            int i13 = i12 + ((i11 ^ 89) | i12);
            getGpoResponse = i13 % 128;
            int i14 = i13 % 2;
            while (it2.hasNext()) {
                int i15 = getPaymentFci;
                int i16 = i15 & 65;
                int i17 = (i15 | 65) & (~i16);
                int i18 = i16 << 1;
                int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                getGpoResponse = i19 % 128;
                if (i19 % 2 != 0) {
                    it2.next().DigitizedCardProfile();
                    throw null;
                }
                if (it2.next().DigitizedCardProfile()) {
                    break;
                }
            }
            int i20 = getGpoResponse;
            int i21 = i20 ^ 63;
            int i22 = (i20 & 63) << 1;
            getPaymentFci = (((i21 | i22) << 1) - (i22 ^ i21)) % 128;
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean values(int i, java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        synchronized (this) {
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i2 = getPaymentFci + 75;
            getGpoResponse = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 2;
            }
            while (it.hasNext()) {
                getPaymentFci = (getGpoResponse + 69) % 128;
                if (it.next().values(i, str, str2, exc)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i4 = getGpoResponse;
            int i5 = (((i4 & (-118)) | ((~i4) & 117)) - (~(-(-((i4 & 117) << 1))))) - 1;
            getPaymentFci = i5 % 128;
            int i6 = i5 % 2;
            while (it2.hasNext()) {
                int i7 = getPaymentFci;
                int i8 = i7 & 11;
                int i9 = i8 + ((i7 ^ 11) | i8);
                getGpoResponse = i9 % 128;
                if (i9 % 2 != 0) {
                    it2.next().values(i, str, str2, exc);
                    throw null;
                }
                if (it2.next().values(i, str, str2, exc)) {
                    break;
                }
            }
            int i10 = getGpoResponse;
            int i11 = i10 & 71;
            int i12 = (i10 | 71) & (~i11);
            int i13 = i11 << 1;
            getPaymentFci = ((i12 & i13) + (i12 | i13)) % 128;
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean values() {
        synchronized (this) {
            int i = getPaymentFci;
            getGpoResponse = (((i & (-30)) | ((~i) & 29)) + ((i & 29) << 1)) % 128;
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i2 = getGpoResponse;
            int i3 = i2 & 91;
            int i4 = (i2 | 91) & (~i3);
            int i5 = i3 << 1;
            getPaymentFci = (((i4 | i5) << 1) - (i4 ^ i5)) % 128;
            while (it.hasNext()) {
                int i6 = getPaymentFci;
                getGpoResponse = ((i6 ^ 29) + ((i6 & 29) << 1)) % 128;
                if (it.next().values()) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i7 = getGpoResponse;
            getPaymentFci = (((i7 & 75) - (~(i7 | 75))) - 1) % 128;
            while (it2.hasNext()) {
                int i8 = getPaymentFci + 53;
                getGpoResponse = i8 % 128;
                if (i8 % 2 != 0) {
                    it2.next().values();
                    throw new java.lang.NullPointerException();
                }
                if (it2.next().values()) {
                    break;
                }
            }
            int i9 = getGpoResponse;
            int i10 = i9 & 55;
            int i11 = ((i9 | 55) & (~i10)) + (i10 << 1);
            getPaymentFci = i11 % 128;
            if (i11 % 2 == 0) {
                throw new java.lang.NullPointerException();
            }
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean values(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        synchronized (this) {
            int i = getPaymentFci;
            getGpoResponse = ((i ^ 89) + ((i & 89) << 1)) % 128;
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i2 = getGpoResponse;
            int i3 = i2 ^ 63;
            int i4 = (i2 & 63) << 1;
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            getPaymentFci = i5 % 128;
            int i6 = i5 % 2;
            while (it.hasNext()) {
                int i7 = getPaymentFci;
                int i8 = (i7 ^ 37) + ((i7 & 37) << 1);
                getGpoResponse = i8 % 128;
                if (i8 % 2 != 0) {
                    it.next().values(str, str2, exc);
                    throw null;
                }
                if (it.next().values(str, str2, exc)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i9 = getPaymentFci;
            int i10 = i9 & 33;
            getGpoResponse = ((((i9 ^ 33) | i10) << 1) - ((i9 | 33) & (~i10))) % 128;
            while (it2.hasNext()) {
                getPaymentFci = (getGpoResponse + 35) % 128;
                if (it2.next().values(str, str2, exc)) {
                    break;
                }
            }
            int i11 = getPaymentFci;
            getGpoResponse = (((i11 ^ 93) - (~((i11 & 93) << 1))) - 1) % 128;
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean DigitizedCardProfile(java.lang.String str, java.lang.String str2) {
        synchronized (this) {
            int i = getGpoResponse;
            getPaymentFci = ((-2) - (~((i & 96) + (i | 96)))) % 128;
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i2 = getPaymentFci;
            int i3 = i2 & 57;
            int i4 = (i2 ^ 57) | i3;
            getGpoResponse = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
            while (it.hasNext()) {
                int i5 = getGpoResponse;
                getPaymentFci = (((i5 | 5) << 1) - (i5 ^ 5)) % 128;
                if (it.next().DigitizedCardProfile(str, str2)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i6 = getGpoResponse;
            int i7 = i6 & 93;
            getPaymentFci = ((((i6 ^ 93) | i7) << 1) - ((i6 | 93) & (~i7))) % 128;
            while (it2.hasNext()) {
                int i8 = getGpoResponse;
                int i9 = i8 & 105;
                int i10 = ((i8 ^ 105) | i9) << 1;
                int i11 = -((i8 | 105) & (~i9));
                int i12 = (i10 & i11) + (i11 | i10);
                getPaymentFci = i12 % 128;
                if (i12 % 2 == 0) {
                    it2.next().DigitizedCardProfile(str, str2);
                    throw null;
                }
                if (it2.next().DigitizedCardProfile(str, str2)) {
                    break;
                }
            }
            int i13 = getPaymentFci + 107;
            getGpoResponse = i13 % 128;
            if (i13 % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean RecordsJson(java.lang.String str) {
        synchronized (this) {
            int i = getPaymentFci;
            getGpoResponse = (((i ^ 26) + ((i & 26) << 1)) - 1) % 128;
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i2 = getPaymentFci;
            int i3 = i2 & 59;
            getGpoResponse = (i3 + ((i2 ^ 59) | i3)) % 128;
            while (it.hasNext()) {
                int i4 = getGpoResponse;
                getPaymentFci = ((i4 ^ 63) + ((i4 & 63) << 1)) % 128;
                if (it.next().RecordsJson(str)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i5 = getGpoResponse;
            getPaymentFci = (((i5 & 92) + (i5 | 92)) - 1) % 128;
            while (it2.hasNext()) {
                getGpoResponse = (getPaymentFci + 27) % 128;
                if (it2.next().RecordsJson(str)) {
                    break;
                }
            }
            int i6 = getPaymentFci;
            int i7 = i6 & 25;
            int i8 = -(-((i6 ^ 25) | i7));
            int i9 = (i7 & i8) + (i8 | i7);
            getGpoResponse = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean SdkCoreAlternateContactlessPaymentDataImpl(java.lang.String str) {
        synchronized (this) {
            int i = getGpoResponse;
            int i2 = i & 37;
            int i3 = (i | 37) & (~i2);
            int i4 = -(-(i2 << 1));
            getPaymentFci = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i5 = getGpoResponse + 115;
            getPaymentFci = i5 % 128;
            int i6 = i5 % 2;
            while (it.hasNext()) {
                int i7 = getPaymentFci;
                int i8 = i7 & 55;
                int i9 = i8 + ((i7 ^ 55) | i8);
                getGpoResponse = i9 % 128;
                if (i9 % 2 != 0) {
                    it.next().SdkCoreAlternateContactlessPaymentDataImpl(str);
                    throw null;
                }
                if (it.next().SdkCoreAlternateContactlessPaymentDataImpl(str)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i10 = getPaymentFci;
            getGpoResponse = (((i10 ^ 126) + ((i10 & 126) << 1)) - 1) % 128;
            while (it2.hasNext()) {
                int i11 = getPaymentFci;
                int i12 = (i11 & (-120)) | ((~i11) & 119);
                int i13 = -(-((i11 & 119) << 1));
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                getGpoResponse = i14 % 128;
                if (i14 % 2 != 0) {
                    it2.next().SdkCoreAlternateContactlessPaymentDataImpl(str);
                    throw new java.lang.NullPointerException();
                }
                if (it2.next().SdkCoreAlternateContactlessPaymentDataImpl(str)) {
                    break;
                }
            }
            int i15 = getGpoResponse;
            int i16 = ((i15 | 115) << 1) - (i15 ^ 115);
            getPaymentFci = i16 % 128;
            if (i16 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x09fb A[Catch: all -> 0x0cf6, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0003, B:6:0x0016, B:7:0x0020, B:9:0x0027, B:11:0x0047, B:13:0x009c, B:15:0x021e, B:17:0x022a, B:26:0x09ec, B:28:0x09fb, B:36:0x0a7a, B:41:0x0ace, B:46:0x0b28, B:51:0x0bb9, B:57:0x0c23, B:61:0x0c37, B:63:0x0c3e, B:65:0x0c3f, B:69:0x0c40, B:71:0x0c46, B:72:0x0c47, B:74:0x02d9, B:81:0x038c, B:83:0x0567, B:84:0x0593, B:88:0x084e, B:90:0x0892, B:91:0x09a3, B:98:0x0c58, B:100:0x0c5e, B:101:0x0c5f, B:104:0x0c61, B:106:0x0c68, B:107:0x0c69, B:110:0x0c6a, B:111:0x0c81, B:113:0x0c87, B:115:0x0ca0, B:133:0x0cad, B:140:0x0cba, B:119:0x0cbb, B:130:0x0ce3, B:143:0x0ce4, B:150:0x0cf5, B:87:0x068c, B:125:0x0cdb, B:126:0x0ce0, B:145:0x0ced, B:146:0x0cf2, B:20:0x0272, B:22:0x0293, B:23:0x02cf, B:24:0x0380, B:30:0x0a17, B:32:0x0a35, B:33:0x0a72, B:37:0x0a7f, B:39:0x0a92, B:40:0x0ac7, B:42:0x0ad1, B:44:0x0ae4, B:45:0x0b21, B:53:0x0bc1, B:55:0x0bdf, B:56:0x0c1d, B:76:0x0318, B:78:0x0339, B:79:0x0379, B:93:0x0c48, B:94:0x0c55, B:49:0x0b52, B:136:0x0cb7), top: B:3:0x0003, inners: #0, #1, #2, #3, #4, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0a7a A[Catch: all -> 0x0cf6, TRY_ENTER, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0003, B:6:0x0016, B:7:0x0020, B:9:0x0027, B:11:0x0047, B:13:0x009c, B:15:0x021e, B:17:0x022a, B:26:0x09ec, B:28:0x09fb, B:36:0x0a7a, B:41:0x0ace, B:46:0x0b28, B:51:0x0bb9, B:57:0x0c23, B:61:0x0c37, B:63:0x0c3e, B:65:0x0c3f, B:69:0x0c40, B:71:0x0c46, B:72:0x0c47, B:74:0x02d9, B:81:0x038c, B:83:0x0567, B:84:0x0593, B:88:0x084e, B:90:0x0892, B:91:0x09a3, B:98:0x0c58, B:100:0x0c5e, B:101:0x0c5f, B:104:0x0c61, B:106:0x0c68, B:107:0x0c69, B:110:0x0c6a, B:111:0x0c81, B:113:0x0c87, B:115:0x0ca0, B:133:0x0cad, B:140:0x0cba, B:119:0x0cbb, B:130:0x0ce3, B:143:0x0ce4, B:150:0x0cf5, B:87:0x068c, B:125:0x0cdb, B:126:0x0ce0, B:145:0x0ced, B:146:0x0cf2, B:20:0x0272, B:22:0x0293, B:23:0x02cf, B:24:0x0380, B:30:0x0a17, B:32:0x0a35, B:33:0x0a72, B:37:0x0a7f, B:39:0x0a92, B:40:0x0ac7, B:42:0x0ad1, B:44:0x0ae4, B:45:0x0b21, B:53:0x0bc1, B:55:0x0bdf, B:56:0x0c1d, B:76:0x0318, B:78:0x0339, B:79:0x0379, B:93:0x0c48, B:94:0x0c55, B:49:0x0b52, B:136:0x0cb7), top: B:3:0x0003, inners: #0, #1, #2, #3, #4, #5, #7 }] */
    @Override // com.payair.hce.getDrawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean writeReplace() {
        java.util.Iterator<com.payair.hce.getDrawable> it;
        android.content.Context context;
        int intValue;
        java.lang.Object[] objArr;
        int i;
        int i2;
        java.lang.Object invoke;
        synchronized (this) {
            int i3 = getGpoResponse;
            int i4 = i3 & 107;
            int i5 = i4 - (~((i3 ^ 107) | i4));
            int i6 = 1;
            int i7 = i5 - 1;
            getPaymentFci = i7 % 128;
            if (i7 % 2 == 0) {
                this.DigitizedCardProfile.values().iterator();
                throw new java.lang.NullPointerException();
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.DigitizedCardProfile.values().iterator();
            while (it2.hasNext()) {
                int i8 = getPaymentFci;
                int i9 = (i8 | 31) << i6;
                int i10 = -((i8 & (-32)) | ((~i8) & 31));
                getGpoResponse = ((i9 & i10) + (i10 | i9)) % 128;
                if (it2.next().writeReplace()) {
                    break;
                }
                int i11 = getPaymentFci;
                getGpoResponse = (((i11 ^ 78) + ((i11 & 78) << i6)) - i6) % 128;
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 40, 667 - android.graphics.Color.alpha(0), (char) (40025 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                byte[] bArr = $$a;
                byte b = bArr[14];
                java.lang.Object[] objArr2 = new java.lang.Object[i6];
                a(b, (byte) (b - 1), b, objArr2);
                long j = cls.getField((java.lang.String) objArr2[0]).getLong(null);
                try {
                    try {
                        try {
                            if (j != -1) {
                                int i12 = getPaymentFci;
                                getGpoResponse = (((i12 & (-68)) | ((~i12) & 67)) + ((i12 & 67) << i6)) % 128;
                                int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                                int i13 = bitsPerPixel & 23;
                                int i14 = ((bitsPerPixel ^ 23) | i13) << 1;
                                int i15 = -((bitsPerPixel | 23) & (~i13));
                                int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                int identityHashCode = java.lang.System.identityHashCode(this);
                                int i16 = 1057 - (~(-(-(indexOf * 530))));
                                int i17 = i16 & 55650;
                                int i18 = ((i16 ^ 55650) | i17) << 1;
                                int i19 = -((i16 | 55650) & (~i17));
                                int i20 = (i18 ^ i19) + ((i18 & i19) << i6);
                                int i21 = ~identityHashCode;
                                int i22 = (i21 | identityHashCode) & i21;
                                int i23 = i22 & indexOf;
                                int i24 = (~i23) & (i22 | indexOf);
                                int i25 = ~((i23 ^ i24) | (i24 & i23));
                                int i26 = indexOf & 105;
                                int i27 = (~i26) & (indexOf | 105);
                                int i28 = ~((i26 & i27) | (i27 ^ i26));
                                int i29 = ((~i25) & i28) | ((~i28) & i25);
                                int i30 = i25 & i28;
                                int i31 = ((i30 ^ i29) | (i29 & i30)) * 529;
                                int i32 = ((~i31) & i20) | ((~i20) & i31);
                                int i33 = -(-((i31 & i20) << i6));
                                int i34 = ((i32 | i33) << i6) - (i33 ^ i32);
                                int i35 = ~((indexOf & identityHashCode) | (indexOf ^ identityHashCode));
                                int i36 = ((~i35) & (-106)) | (i35 & 105);
                                int i37 = i35 & (-106);
                                int i38 = ((i37 ^ i36) | (i37 & i36)) * 529;
                                int i39 = i34 & i38;
                                int i40 = ((i34 ^ i38) | i39) << i6;
                                int i41 = -((i38 | i34) & (~i39));
                                java.lang.Object[] objArr3 = new java.lang.Object[i6];
                                b(((i14 | i15) << i6) - (i15 ^ i14), (byte) ((i40 ^ i41) + ((i41 & i40) << i6)), "\u001b\r\u0010\u0004\u0018\u0000\u0007\"\u0014\u001e\u0001\r\u0014\u001f\u0015\u0017\n\u0018\f\u0017\u0016\u0011", objArr3);
                                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
                                int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout() >> 16;
                                int i42 = jumpTapTimeout & 15;
                                int i43 = -(-((jumpTapTimeout ^ 15) | i42));
                                int i44 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int identityHashCode2 = java.lang.System.identityHashCode(this);
                                int i45 = (i44 * (-518)) - 56462;
                                int i46 = ~i44;
                                int i47 = ~identityHashCode2;
                                int i48 = ((~i47) & i46) | ((~i46) & i47);
                                int i49 = i46 & i47;
                                int i50 = ~((i48 & i49) | (i48 ^ i49));
                                int i51 = ((~i50) & 109) | (i50 & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING);
                                int i52 = i50 & 109;
                                int i53 = -(-(((i52 & i51) | (i52 ^ i51)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                                int i54 = i45 & i53;
                                int i55 = -(-((i53 ^ i45) | i54));
                                int i56 = (i54 & i55) + (i55 | i54);
                                int i57 = (i47 | identityHashCode2) & i47;
                                int i58 = i46 & i57;
                                it = it2;
                                int i59 = ~(((i57 | i46) & (~i58)) | i58 | 109);
                                int i60 = i44 | 109;
                                int i61 = (i60 & i47) | ((~i60) & identityHashCode2);
                                int i62 = i60 & identityHashCode2;
                                int i63 = ~((i62 ^ i61) | (i62 & i61));
                                int i64 = (((~i59) & i63) | ((~i63) & i59) | (i59 & i63)) * (-519);
                                int i65 = i56 & i64;
                                int i66 = ((i56 ^ i64) | i65) << 1;
                                int i67 = -((i64 | i56) & (~i65));
                                int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                                int i69 = identityHashCode2 & 109;
                                int i70 = (~i69) & (identityHashCode2 | 109);
                                int i71 = ~((i69 ^ i70) | (i69 & i70));
                                int i72 = ((i71 ^ i44) | (i71 & i44)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE;
                                int i73 = i68 ^ i72;
                                int i74 = ((i72 & i68) | i73) << 1;
                                int i75 = -i73;
                                byte b2 = (byte) ((i74 ^ i75) + ((i74 & i75) << 1));
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                b(((i42 | i43) << 1) - (i43 ^ i42), b2, "\u0017\u0010\u001a\u001c\"\u0014\u0006\u0004\u0013\u001c\u000e\u0017\u0000\f㙫", objArr4);
                                if (j + 1865 >= ((java.lang.Long) cls2.getDeclaredMethod((java.lang.String) objArr4[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                    int i76 = getGpoResponse + 13;
                                    getPaymentFci = i76 % 128;
                                    if (i76 % 2 == 0) {
                                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf("", "") + 667, (char) (40023 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                        byte b3 = bArr[14];
                                        byte b4 = (byte) (b3 - 1);
                                        byte b5 = b3;
                                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                                        a(b4, b5, (byte) (b5 - 1), objArr5);
                                        try {
                                            java.lang.Object[] objArr6 = {cls3.getField((java.lang.String) objArr5[0]).get(null), 1650850568, 0};
                                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                            if (obj == null) {
                                                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 33, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4684, (char) android.view.KeyEvent.getDeadChar(0, 0))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj);
                                            }
                                            invoke = ((java.lang.reflect.Method) obj).invoke(null, objArr6);
                                        } catch (java.lang.Throwable th) {
                                            java.lang.Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    } else {
                                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.blue(0), android.text.TextUtils.indexOf("", "", 0, 0) + 667, (char) (android.graphics.Color.rgb(0, 0, 0) + 16817240));
                                        byte b6 = bArr[14];
                                        byte b7 = (byte) (b6 - 1);
                                        byte b8 = b6;
                                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                                        a(b7, b8, (byte) (b8 - 1), objArr7);
                                        java.lang.Object[] objArr8 = {cls4.getField((java.lang.String) objArr7[0]).get(null), 1650850568, 0};
                                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                        if (obj2 == null) {
                                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4683, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj2);
                                        }
                                        invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr8);
                                    }
                                    objArr = (java.lang.Object[]) invoke;
                                    i = ((int[]) objArr[1])[0];
                                    i2 = ((int[]) objArr[0])[0];
                                    if (i2 != i) {
                                        int i77 = getPaymentFci;
                                        int i78 = i77 & 113;
                                        int i79 = -(-((i77 ^ 113) | i78));
                                        getGpoResponse = (((i78 | i79) << 1) - (i79 ^ i78)) % 128;
                                        java.lang.Object[] objArr9 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[4])[0]), 0};
                                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                        if (obj3 == null) {
                                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 33, android.graphics.Color.alpha(0) + 4684, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj3);
                                        }
                                        ((java.lang.reflect.Method) obj3).invoke(null, objArr9);
                                    } else {
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        java.lang.Object[] objArr10 = {objArr};
                                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1859861882);
                                        if (obj4 == null) {
                                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 4684, (char) android.view.View.MeasureSpec.getSize(0))).getMethod("values", java.lang.Object[].class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1859861882, obj4);
                                        }
                                        arrayList.add(((java.lang.reflect.Method) obj4).invoke(null, objArr10));
                                        java.lang.Object[] objArr11 = {objArr};
                                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1831744115);
                                        if (obj5 == null) {
                                            obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32, (android.os.Process.myTid() >> 22) + 4684, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1))).getMethod("writeReplace", java.lang.Object[].class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1831744115, obj5);
                                        }
                                        arrayList.add(((java.lang.reflect.Method) obj5).invoke(null, objArr11));
                                        int i80 = (~i2) & i;
                                        int i81 = (~i) & i2;
                                        long j2 = (i80 ^ i81) | (i81 & i80);
                                        int i82 = getGpoResponse;
                                        int i83 = i82 & 25;
                                        int i84 = (((i82 | 25) & (~i83)) + (i83 << 1)) % 128;
                                        getPaymentFci = i84;
                                        int i85 = i84 ^ 51;
                                        int i86 = (i84 & 51) << 1;
                                        getGpoResponse = ((i85 ^ i86) + ((i86 & i85) << 1)) % 128;
                                        try {
                                            java.lang.Object[] objArr12 = {java.lang.Long.valueOf(j2 ^ (-3568426118492979200L)), -830838958L};
                                            byte[] bArr2 = $$d;
                                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                                            c(bArr2[27], (short) (bArr2[13] - 1), bArr2[21], objArr13);
                                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                                            byte b9 = bArr2[51];
                                            short s = bArr2[21];
                                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                                            c(b9, s, (byte) (s | 20), objArr14);
                                            cls5.getMethod((java.lang.String) objArr14[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr12);
                                            java.lang.Object[] objArr15 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[4])[0]), 0};
                                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                            if (obj6 == null) {
                                                obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.text.TextUtils.indexOf("", "", 0, 0), android.text.TextUtils.getTrimmedLength("") + 4684, (char) android.view.KeyEvent.getDeadChar(0, 0))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj6);
                                            }
                                            ((java.lang.reflect.Method) obj6).invoke(null, objArr15);
                                            int i87 = getPaymentFci;
                                            int i88 = (i87 & 83) + (i87 | 83);
                                            getGpoResponse = i88 % 128;
                                            int i89 = i88 % 2;
                                        } catch (java.lang.Throwable th2) {
                                            java.lang.Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        }
                                    }
                                    it2 = it;
                                    i6 = 1;
                                }
                            } else {
                                it = it2;
                            }
                            int i90 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int i91 = i90 & 21;
                            int i92 = -(~android.graphics.Color.blue(0));
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            b(i91 + ((i90 ^ 21) | i91), (byte) (((i92 ^ 104) + ((i92 & 104) << 1)) - 1), "\u001b\r\u0010\u0004\u0018\u0000\u0007\"\u0014\u001e\u0001\r\u0014\u001f\u0015\u0017\n\u0018\f\u0017\u0016\u0011", objArr16);
                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr16[0]);
                            int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
                            int identityHashCode3 = java.lang.System.identityHashCode(this);
                            int i93 = offsetAfter * 595;
                            int i94 = i93 ^ (-17805);
                            int i95 = -(-((i93 & (-17805)) << 1));
                            int i96 = (i94 & i95) + (i95 | i94);
                            int i97 = ~offsetAfter;
                            int i98 = i97 & 15;
                            int i99 = (~i98) & (i97 | 15);
                            int i100 = ~((i99 ^ i98) | (i98 & i99));
                            int i101 = ~identityHashCode3;
                            int i102 = (i101 | identityHashCode3) & i101;
                            int i103 = i102 & 15;
                            int i104 = ((i102 | 15) & (~i103)) | i103;
                            int i105 = ~i104;
                            int i106 = (i104 | i105) & i105;
                            int i107 = ((~i106) & i100) | ((~i100) & i106);
                            int i108 = i100 & i106;
                            int i109 = -(-(((i108 ^ i107) | (i108 & i107)) * (-1188)));
                            int i110 = i96 & i109;
                            int i111 = (i96 | i109) & (~i110);
                            int i112 = -(-(i110 << 1));
                            int i113 = ((i111 | i112) << 1) - (i111 ^ i112);
                            int i114 = ~(i98 | (i97 ^ 15));
                            int i115 = i101 & (-16);
                            int i116 = ~((identityHashCode3 & 15) | i115 | (identityHashCode3 & (-16)));
                            int i117 = (i116 ^ i114) | (i116 & i114);
                            int i118 = i101 & offsetAfter;
                            int i119 = ~((i97 & i101) | ((~i101) & offsetAfter) | i118);
                            int i120 = i117 & i119;
                            int i121 = (i117 | i119) & (~i120);
                            int i122 = ((i121 ^ i120) | (i121 & i120)) * 594;
                            int i123 = i113 & i122;
                            int i124 = (i122 | i113) & (~i123);
                            int i125 = i123 << 1;
                            int i126 = ((i124 | i125) << 1) - (i124 ^ i125);
                            int i127 = i101 ^ (-16);
                            int i128 = ~((i127 ^ i115) | (i115 & i127));
                            int i129 = offsetAfter & (-16);
                            int i130 = (offsetAfter | (-16)) & (~i129);
                            int i131 = (i129 ^ i130) | (i130 & i129);
                            int i132 = ~i131;
                            int i133 = (i131 | i132) & i132;
                            int i134 = (i128 ^ i133) | (i128 & i133);
                            int i135 = ~((offsetAfter ^ i101) | i118);
                            int i136 = ((~i135) & i134) | ((~i134) & i135);
                            int i137 = i134 & i135;
                            int i138 = ((i137 ^ i136) | (i137 & i136)) * 594;
                            int offsetAfter2 = android.text.TextUtils.getOffsetAfter("", 0);
                            int i139 = ((offsetAfter2 ^ 108) | (offsetAfter2 & 108)) << 1;
                            int i140 = -(((~offsetAfter2) & 108) | (offsetAfter2 & (-109)));
                            byte b10 = (byte) (((i139 | i140) << 1) - (i140 ^ i139));
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            b((i126 & i138) + (i138 | i126), b10, "\u0017\u0010\u001a\u001c\"\u0014\u0006\u0004\u0013\u001c\u000e\u0017\u0000\f㙫", objArr17);
                            long longValue = ((java.lang.Long) cls6.getDeclaredMethod((java.lang.String) objArr17[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 40, android.view.Gravity.getAbsoluteGravity(0, 0) + 667, (char) (40072 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                            byte b11 = bArr[14];
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            a(b11, (byte) (b11 - 1), b11, objArr18);
                            cls7.getField((java.lang.String) objArr18[0]).set(null, java.lang.Long.valueOf(longValue));
                            getGpoResponse = (getPaymentFci + 91) % 128;
                            i = ((int[]) objArr[1])[0];
                            i2 = ((int[]) objArr[0])[0];
                            if (i2 != i) {
                            }
                            it2 = it;
                            i6 = 1;
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause3 = th3.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th3;
                        }
                    } catch (java.lang.Exception unused) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    }
                    java.lang.Object[] objArr19 = {context, java.lang.Integer.valueOf(intValue), 0, 1650850568};
                    int i141 = $$e;
                    byte[] bArr3 = $$d;
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    c((byte) (i141 & 119), (short) (i141 & 999), bArr3[21], objArr20);
                    java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr20[0]);
                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                    c(bArr3[63], (short) 101, bArr3[51], objArr21);
                    java.lang.String str = (java.lang.String) objArr21[0];
                    int i142 = -android.text.TextUtils.indexOf("", "", 0, 0);
                    int identityHashCode4 = java.lang.System.identityHashCode(this);
                    int i143 = i142 * (-129);
                    int i144 = (i143 & (-10742)) + (i143 | (-10742));
                    int i145 = ~identityHashCode4;
                    int i146 = ((~i145) & 81) | (i145 & (-82));
                    int i147 = i145 & 81;
                    int i148 = (i147 ^ i146) | (i147 & i146);
                    int i149 = -(-((~((i148 ^ i142) | (i148 & i142))) * 130));
                    int i150 = i144 & i149;
                    int i151 = (((i149 | i144) & (~i150)) - (~(i150 << 1))) - 1;
                    int i152 = ~i142;
                    int i153 = (i152 & 81) | (i142 & (-82));
                    int i154 = i142 & 81;
                    int i155 = (i153 ^ i154) | (i154 & i153);
                    int i156 = ~i155;
                    int i157 = ((i155 | i156) & i156) * (-260);
                    int i158 = (i151 ^ i157) + ((i151 & i157) << 1);
                    int i159 = (i152 | i142) & i152;
                    int i160 = i159 & (-82);
                    int i161 = (i159 | (-82)) & (~i160);
                    int i162 = ~((i161 ^ i160) | (i161 & i160));
                    int i163 = i142 | 81;
                    int i164 = i163 & identityHashCode4;
                    int i165 = (i163 | identityHashCode4) & (~i164);
                    int i166 = ~((i165 ^ i164) | (i165 & i164));
                    int i167 = ((~i166) & i162) | ((~i162) & i166);
                    int i168 = i166 & i162;
                    int i169 = -(~(-(-(((i168 ^ i167) | (i168 & i167)) * 130))));
                    int i170 = ((i158 | i169) << 1) - (i169 ^ i158);
                    short argb = (short) android.graphics.Color.argb(0, 0, 0, 0);
                    int i171 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    int i172 = 1630614283 & i171;
                    int i173 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int identityHashCode5 = java.lang.System.identityHashCode(this);
                    int i174 = i173 * 483;
                    int i175 = (-1922124432) & i174;
                    int i176 = i175 + ((i174 ^ (-1922124432)) | i175);
                    int i177 = ~i173;
                    int i178 = 558124423 & i177;
                    int i179 = (~i178) & (i177 | 558124423);
                    int i180 = (i179 ^ i178) | (i178 & i179);
                    int i181 = ~i180;
                    int i182 = (i180 | i181) & i181;
                    int i183 = (i177 | i173) & i177;
                    int i184 = ~identityHashCode5;
                    int i185 = ((~i184) & i183) | ((~i183) & i184);
                    int i186 = i183 & i184;
                    int i187 = ~((i185 & i186) | (i185 ^ i186));
                    int i188 = i182 ^ i187;
                    int i189 = i187 & i182;
                    int i190 = -(-(((i189 & i188) | (i188 ^ i189)) * (-241)));
                    int i191 = i176 ^ i190;
                    int i192 = -(-((i190 & i176) << 1));
                    int i193 = (((i191 ^ i192) + ((i192 & i191) << 1)) - (~(((-558124424) | i173) * (-482)))) - 1;
                    int i194 = ~((558124423 ^ i173) | (558124423 & i173));
                    int i195 = i184 & (identityHashCode5 | i184);
                    int i196 = ((~i195) & i177) | ((~i177) & i195);
                    int i197 = i195 & i177;
                    int i198 = (i197 ^ i196) | (i197 & i196);
                    int i199 = (-558124424) ^ i198;
                    int i200 = i198 & (-558124424);
                    int i201 = (i200 ^ i199) | (i200 & i199);
                    int i202 = ~i201;
                    int i203 = (i201 | i202) & i202;
                    int i204 = i194 & i203;
                    int i205 = -(~((((i194 | i203) & (~i204)) | i204) * 241));
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    d((~i170) + (i170 << 1), argb, i172 + ((i171 ^ 1630614283) | i172), (((i193 | i205) << 1) - (i205 ^ i193)) - 1, (byte) (103 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr22);
                    objArr = (java.lang.Object[]) cls8.getMethod(str, java.lang.Class.forName((java.lang.String) objArr22[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr19);
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 41, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 667, (char) (40025 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                    byte b12 = bArr[14];
                    byte b13 = (byte) (b12 - 1);
                    byte b14 = b12;
                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                    a(b13, b14, (byte) (b14 - 1), objArr23);
                    cls9.getField((java.lang.String) objArr23[0]).set(null, objArr);
                } catch (java.lang.Throwable th4) {
                    java.lang.Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
                int i206 = -(android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int identityHashCode6 = java.lang.System.identityHashCode(this);
                int i207 = i206 * (-665);
                int i208 = i207 & 8684;
                int i209 = (((i207 | 8684) & (~i208)) - (~(i208 << 1))) - 1;
                int i210 = ~i206;
                int i211 = -(-(i210 * (-333)));
                int i212 = (i209 & i211) + (i209 | i211);
                int i213 = ~identityHashCode6;
                int i214 = i213 & (i213 | identityHashCode6);
                int i215 = i210 & i214;
                int i216 = (~i215) & (i210 | i214);
                int i217 = ~((i215 ^ i216) | (i215 & i216));
                int i218 = ~((identityHashCode6 ^ 26) | (identityHashCode6 & 26));
                int i219 = ((i217 ^ i218) | (i217 & i218)) * com.visa.cbp.getCertUsage.getODAData;
                int i220 = (i212 ^ i219) + ((i219 & i212) << 1);
                int i221 = ~(i210 | identityHashCode6);
                int i222 = i214 ^ 26;
                int i223 = i214 & 26;
                int i224 = (i222 ^ i223) | (i222 & i223);
                int i225 = ~i224;
                int i226 = (i224 | i225) & i225;
                int i227 = i221 ^ i226;
                int i228 = i221 & i226;
                int i229 = ((i228 ^ i227) | (i228 & i227)) * com.visa.cbp.getCertUsage.getODAData;
                java.lang.Object[] objArr24 = new java.lang.Object[1];
                b(((i220 | i229) << 1) - (i229 ^ i220), (byte) (37 - (~(-(~(-(-android.view.View.resolveSizeAndState(0, 0, 0))))))), "\u001b\r\u0010\u0004\u0018\u0000\u0007\"\u001a\u001c\u0019!\u000b\u0015\u0012 \u0006 \u0015\u0014\u0017\t\u0004\u001c\u001c\u0007", objArr24);
                java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr24[0]);
                int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay() >> 16;
                int identityHashCode7 = java.lang.System.identityHashCode(this);
                int i230 = scrollDefaultDelay * 477;
                int i231 = i230 & (-8550);
                int i232 = (i230 | (-8550)) & (~i231);
                int i233 = i231 << 1;
                int i234 = ((i232 | i233) << 1) - (i232 ^ i233);
                int i235 = ~scrollDefaultDelay;
                int i236 = ~((i235 ^ 18) | (i235 & 18));
                int i237 = scrollDefaultDelay & (-19);
                int i238 = scrollDefaultDelay ^ (-19);
                int i239 = i237 | i238;
                int i240 = i239 & identityHashCode7;
                int i241 = (i239 | identityHashCode7) & (~i240);
                int i242 = (i241 ^ i240) | (i241 & i240);
                int i243 = ~i242;
                int i244 = (i242 | i243) & i243;
                int i245 = i236 & i244;
                int i246 = (i236 | i244) & (~i245);
                int i247 = ((i246 ^ i245) | (i246 & i245)) * (-476);
                int i248 = i234 & i247;
                int i249 = (i247 | i234) & (~i248);
                int i250 = -(-(i248 << 1));
                int i251 = (i249 & i250) + (i249 | i250);
                int i252 = (i237 & i238) | (i237 ^ i238);
                int i253 = i252 & identityHashCode7;
                int i254 = (i252 | identityHashCode7) & (~i253);
                int i255 = -(-((~((i254 ^ i253) | (i254 & i253))) * 952));
                int i256 = i251 & i255;
                int i257 = (i255 ^ i251) | i256;
                int i258 = (i256 & i257) + (i257 | i256);
                int i259 = ~identityHashCode7;
                int i260 = (identityHashCode7 | i259) & i259;
                int i261 = i260 & (-19);
                int i262 = ((i260 | (-19)) & (~i261)) | i261;
                int i263 = -(-((~((scrollDefaultDelay ^ i262) | (scrollDefaultDelay & i262))) * 476));
                int i264 = -(android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
                int identityHashCode8 = java.lang.System.identityHashCode(this);
                int i265 = i264 * 399;
                int i266 = 45885 ^ i265;
                int i267 = ((((i265 & 45885) | i266) << 1) - (~(-i266))) - 1;
                int i268 = ~i264;
                int i269 = (i268 | i264) & i268;
                int i270 = (i269 & (-116)) | ((~i269) & 115);
                int i271 = i269 & 115;
                int i272 = (i271 ^ i270) | (i271 & i270);
                int i273 = ~i272;
                int i274 = (i272 | i273) & i273;
                int i275 = i264 & 115;
                int i276 = (i268 & (-116)) | i275;
                int i277 = i264 & (-116);
                int i278 = (i276 ^ i277) | (i276 & i277);
                int i279 = ~i278;
                int i280 = (i278 | i279) & i279;
                int i281 = i274 & i280;
                int i282 = (i274 | i280) & (~i281);
                int i283 = (i282 ^ i281) | (i282 & i281);
                int i284 = ~identityHashCode8;
                int i285 = i284 & (-116);
                int i286 = (identityHashCode8 & 115) | i285;
                int i287 = identityHashCode8 & (-116);
                int i288 = ~((i287 & i286) | (i287 ^ i286));
                int i289 = ((~i283) & i288) | ((~i288) & i283);
                int i290 = i288 & i283;
                int i291 = -(~(-(-(((i290 ^ i289) | (i290 & i289)) * 398))));
                int i292 = (((i267 | i291) << 1) - (i291 ^ i267)) - 1;
                int i293 = (~i275) & (i264 | 115);
                int i294 = -(-(((i293 ^ i275) | (i275 & i293)) * (-1194)));
                int i295 = i292 & i294;
                int i296 = (i294 ^ i292) | i295;
                int i297 = ((i295 | i296) << 1) - (i296 ^ i295);
                int i298 = (~i285) & (i284 | (-116));
                int i299 = ~((i298 ^ i285) | (i285 & i298));
                int i300 = (i268 & 115) | (i268 ^ 115);
                int i301 = ~i300;
                int i302 = (i300 | i301) & i301;
                int i303 = ((~i302) & i299) | ((~i299) & i302);
                int i304 = i299 & i302;
                int i305 = (i304 ^ i303) | (i304 & i303);
                int i306 = i264 ^ (-116);
                int i307 = ~((i306 ^ i277) | (i277 & i306));
                int i308 = ((~i307) & i305) | ((~i305) & i307);
                int i309 = i307 & i305;
                int i310 = ((i309 ^ i308) | (i309 & i308)) * 398;
                int i311 = i297 & i310;
                int i312 = ((i297 ^ i310) | i311) << 1;
                int i313 = -((i310 | i297) & (~i311));
                java.lang.Object[] objArr25 = new java.lang.Object[1];
                b((((i258 ^ i263) | (i258 & i263)) << 1) - (((~i263) & i258) | ((~i258) & i263)), (byte) ((i312 ^ i313) + ((i313 & i312) << 1)), "\u0015#㙛㙛\u0015\u0010\u0015\b㙝㙝\f#\u0013\u001d\u0012 \u0015\f", objArr25);
                context = (android.content.Context) cls10.getMethod((java.lang.String) objArr25[0], new java.lang.Class[0]).invoke(null, null);
                if (context != null) {
                    int i314 = getPaymentFci;
                    int i315 = i314 & 85;
                    int i316 = -(-((i314 ^ 85) | i315));
                    getGpoResponse = (((i315 | i316) << 1) - (i316 ^ i315)) % 128;
                    context = context.getApplicationContext();
                    int i317 = getPaymentFci;
                    int i318 = i317 & 121;
                    int i319 = (i317 | 121) & (~i318);
                    int i320 = i318 << 1;
                    int i321 = ((i319 | i320) << 1) - (i319 ^ i320);
                    getGpoResponse = i321 % 128;
                    int i322 = i321 % 2;
                }
                int alpha = android.graphics.Color.alpha(0);
                int i323 = alpha & 16;
                int i324 = -(-android.view.View.combineMeasuredStates(0, 0));
                int i325 = ((~i324) & 23) | (i324 & (-24));
                int i326 = -(-((i324 & 23) << 1));
                byte b15 = (byte) (((i325 | i326) << 1) - (i326 ^ i325));
                java.lang.Object[] objArr26 = new java.lang.Object[1];
                b((i323 - (~((alpha ^ 16) | i323))) - 1, b15, "\u001f\u001d\u0007\u001a#\r\u001b\r\u0001#\r\u0019\u0002\u001a\u0012\n", objArr26);
                java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                int i327 = -(-(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                int i328 = i327 & 16;
                int myTid = android.os.Process.myTid() >> 22;
                int identityHashCode9 = java.lang.System.identityHashCode(this);
                int i329 = myTid * 50;
                int i330 = i329 ^ (-10185);
                int i331 = ((i329 & (-10185)) | i330) << 1;
                int i332 = -i330;
                int i333 = ~identityHashCode9;
                int i334 = i333 ^ (-106);
                int i335 = i333 & (-106);
                int i336 = ~((i334 ^ i335) | (i334 & i335));
                int i337 = ~(myTid | (-106));
                int i338 = (i331 ^ i332) + ((i331 & i332) << 1) + (((i336 & i337) | ((~i337) & i336) | ((~i336) & i337)) * 98);
                int i339 = ~myTid;
                int i340 = ((~i333) & i339) | ((~i339) & i333);
                int i341 = i339 & i333;
                int i342 = (i340 ^ i341) | (i340 & i341);
                int i343 = ~i342;
                int i344 = (i342 | i343) & i343;
                int i345 = i344 ^ (-106);
                int i346 = i344 & (-106);
                int i347 = (i346 ^ i345) | (i346 & i345);
                int i348 = (i339 & identityHashCode9) | (i333 & myTid);
                int i349 = myTid & identityHashCode9;
                int i350 = (i348 ^ i349) | (i348 & i349);
                int i351 = ~i350;
                int i352 = (i350 | i351) & i351;
                int i353 = i347 & i352;
                int i354 = (((i352 | i347) & (~i353)) | i353) * (-49);
                int i355 = ((((~i354) & i338) | ((~i338) & i354)) - (~((i354 & i338) << 1))) - 1;
                int i356 = ~((identityHashCode9 ^ (-106)) | (identityHashCode9 & (-106)));
                int i357 = ~((myTid ^ 105) | (myTid & 105));
                int i358 = ((i357 ^ i356) | (i357 & i356)) * 49;
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                b((i328 - (~((i327 ^ 16) | i328))) - 1, (byte) (((i355 | i358) << 1) - (i358 ^ i355)), "\"\u0006\u0015\u0010\u0012 \u0015\u0014\u0013\u001f#\b\u0018\u0016\u0010\u001c", objArr27);
                intValue = ((java.lang.Integer) cls11.getMethod((java.lang.String) objArr27[0], java.lang.Object.class).invoke(null, this)).intValue();
                int i359 = getPaymentFci;
                getGpoResponse = (((i359 & 116) + (i359 | 116)) - 1) % 128;
            }
            java.util.Iterator<com.payair.hce.getDrawable> it3 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i360 = getGpoResponse;
            getPaymentFci = ((i360 ^ 53) + ((i360 & 53) << 1)) % 128;
            while (it3.hasNext()) {
                int i361 = getGpoResponse;
                int i362 = i361 & 13;
                int i363 = (i361 | 13) & (~i362);
                int i364 = -(-(i362 << 1));
                int i365 = (i363 ^ i364) + ((i363 & i364) << 1);
                getPaymentFci = i365 % 128;
                if (i365 % 2 == 0) {
                    it3.next().writeReplace();
                    throw null;
                }
                if (it3.next().writeReplace()) {
                    break;
                }
            }
            int i366 = getGpoResponse;
            int i367 = ((i366 ^ 93) | (i366 & 93)) << 1;
            int i368 = -((i366 & (-94)) | ((~i366) & 93));
            int i369 = ((i367 | i368) << 1) - (i368 ^ i367);
            getPaymentFci = i369 % 128;
            if (i369 % 2 == 0) {
                throw new java.lang.NullPointerException();
            }
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean getAid(java.lang.String str) {
        synchronized (this) {
            int i = getGpoResponse;
            getPaymentFci = (((i | 49) << 1) - (i ^ 49)) % 128;
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i2 = getGpoResponse;
            int i3 = ((i2 ^ 41) | (i2 & 41)) << 1;
            int i4 = -((i2 & (-42)) | ((~i2) & 41));
            getPaymentFci = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
            while (it.hasNext()) {
                int i5 = getGpoResponse;
                int i6 = (i5 & (-116)) | ((~i5) & 115);
                int i7 = (i5 & 115) << 1;
                getPaymentFci = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
                if (it.next().getAid(str)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i8 = getGpoResponse;
            int i9 = i8 & 21;
            getPaymentFci = (((((i8 ^ 21) | i9) << 1) - (~(-((i8 | 21) & (~i9))))) - 1) % 128;
            while (it2.hasNext()) {
                int i10 = getPaymentFci;
                int i11 = ((i10 ^ 11) - (~(-(-((i10 & 11) << 1))))) - 1;
                getGpoResponse = i11 % 128;
                if (i11 % 2 != 0) {
                    it2.next().getAid(str);
                    throw null;
                }
                if (it2.next().getAid(str)) {
                    break;
                }
            }
            int i12 = getGpoResponse + 101;
            getPaymentFci = i12 % 128;
            if (i12 % 2 == 0) {
                throw new java.lang.NullPointerException();
            }
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean valueOf(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        synchronized (this) {
            int i = getGpoResponse;
            getPaymentFci = ((((i | 106) << 1) - (i ^ 106)) - 1) % 128;
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i2 = getGpoResponse;
            getPaymentFci = ((((i2 & (-72)) | ((~i2) & 71)) - (~(-(-((i2 & 71) << 1))))) - 1) % 128;
            while (it.hasNext()) {
                int i3 = getPaymentFci;
                int i4 = i3 & 33;
                int i5 = -(-((i3 ^ 33) | i4));
                int i6 = (i4 & i5) + (i5 | i4);
                getGpoResponse = i6 % 128;
                if (i6 % 2 != 0) {
                    it.next().valueOf(str, str2, exc);
                    throw new java.lang.NullPointerException();
                }
                if (it.next().valueOf(str, str2, exc)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i7 = getGpoResponse;
            getPaymentFci = ((i7 ^ 27) + ((i7 & 27) << 1)) % 128;
            while (it2.hasNext()) {
                int i8 = getGpoResponse;
                int i9 = i8 & 111;
                int i10 = (i8 ^ 111) | i9;
                getPaymentFci = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
                if (it2.next().valueOf(str, str2, exc)) {
                    break;
                }
            }
            int i11 = getGpoResponse;
            getPaymentFci = (((i11 & (-30)) | ((~i11) & 29)) + ((i11 & 29) << 1)) % 128;
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean valueOf() {
        synchronized (this) {
            int i = getGpoResponse;
            int i2 = i & 39;
            int i3 = -(-((i ^ 39) | i2));
            getPaymentFci = ((i2 & i3) + (i3 | i2)) % 128;
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i4 = getGpoResponse;
            int i5 = (i4 & (-26)) | ((~i4) & 25);
            int i6 = (i4 & 25) << 1;
            getPaymentFci = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
            while (it.hasNext()) {
                int i7 = getPaymentFci;
                int i8 = (((i7 & (-14)) | ((~i7) & 13)) - (~(-(-((i7 & 13) << 1))))) - 1;
                getGpoResponse = i8 % 128;
                if (i8 % 2 != 0) {
                    it.next().valueOf();
                    throw new java.lang.ArithmeticException();
                }
                if (it.next().valueOf()) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i9 = getPaymentFci;
            int i10 = i9 & 47;
            int i11 = ((((i9 ^ 47) | i10) << 1) - (~(-((i9 | 47) & (~i10))))) - 1;
            getGpoResponse = i11 % 128;
            int i12 = i11 % 2;
            while (it2.hasNext()) {
                int i13 = getGpoResponse;
                getPaymentFci = (((i13 | 65) << 1) - (i13 ^ 65)) % 128;
                if (it2.next().valueOf()) {
                    break;
                }
            }
            int i14 = getPaymentFci;
            int i15 = (i14 & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) | ((~i14) & 109);
            int i16 = -(-((i14 & 109) << 1));
            getGpoResponse = (((i15 | i16) << 1) - (i16 ^ i15)) % 128;
        }
        return true;
    }

    @Override // com.payair.hce.getDrawable
    public final boolean DigitizedCardProfile(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        synchronized (this) {
            int i = getPaymentFci;
            getGpoResponse = ((((i & (-32)) | ((~i) & 31)) - (~((i & 31) << 1))) - 1) % 128;
            java.util.Iterator<com.payair.hce.getDrawable> it = this.DigitizedCardProfile.values().iterator();
            int i2 = getGpoResponse;
            getPaymentFci = ((i2 ^ 53) + ((i2 & 53) << 1)) % 128;
            while (it.hasNext()) {
                int i3 = getPaymentFci;
                getGpoResponse = (((i3 | 95) << 1) - (i3 ^ 95)) % 128;
                if (it.next().DigitizedCardProfile(str, str2, exc)) {
                    break;
                }
            }
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.AlternateContactlessPaymentDataJson.values().iterator();
            int i4 = getPaymentFci;
            getGpoResponse = (((i4 | 117) << 1) - (i4 ^ 117)) % 128;
            while (it2.hasNext()) {
                int i5 = getGpoResponse;
                int i6 = i5 & 101;
                getPaymentFci = ((((i5 | 101) & (~i6)) - (~(-(-(i6 << 1))))) - 1) % 128;
                if (it2.next().DigitizedCardProfile(str, str2, exc)) {
                    break;
                }
            }
            int i7 = getGpoResponse;
            int i8 = i7 & 91;
            int i9 = ((i7 ^ 91) | i8) << 1;
            int i10 = -((i7 | 91) & (~i8));
            int i11 = (i9 & i10) + (i10 | i9);
            getPaymentFci = i11 % 128;
            if (i11 % 2 == 0) {
                throw new java.lang.NullPointerException();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x09c9 A[Catch: all -> 0x0d20, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0005, B:5:0x002b, B:7:0x0031, B:10:0x0045, B:11:0x004f, B:14:0x0057, B:16:0x006e, B:18:0x0080, B:20:0x00bb, B:22:0x01ef, B:29:0x02b7, B:31:0x09ba, B:33:0x09c9, B:39:0x0a42, B:42:0x0a4e, B:47:0x0aa4, B:52:0x0af8, B:57:0x0b7f, B:66:0x0bf2, B:68:0x0bf8, B:70:0x0bf9, B:74:0x0bfa, B:76:0x0c00, B:77:0x0c01, B:78:0x02d7, B:80:0x03b8, B:82:0x03e1, B:83:0x041e, B:87:0x06fe, B:89:0x073e, B:90:0x096f, B:96:0x0c11, B:98:0x0c17, B:99:0x0c18, B:102:0x0c1a, B:104:0x0c20, B:105:0x0c21, B:106:0x040b, B:108:0x0c22, B:121:0x0d1f, B:112:0x0c67, B:92:0x0c02, B:93:0x0c0f, B:55:0x0b18, B:25:0x0244, B:27:0x0268, B:28:0x02ae, B:35:0x09da, B:37:0x09fb, B:38:0x0a3c, B:43:0x0a53, B:45:0x0a66, B:46:0x0a9d, B:48:0x0aa7, B:50:0x0aba, B:51:0x0af1, B:59:0x0b87, B:61:0x0ba8, B:62:0x0be9, B:86:0x043b, B:109:0x0c61, B:110:0x0c66, B:118:0x0d1d), top: B:3:0x0005, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0a4e A[Catch: all -> 0x0d20, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0005, B:5:0x002b, B:7:0x0031, B:10:0x0045, B:11:0x004f, B:14:0x0057, B:16:0x006e, B:18:0x0080, B:20:0x00bb, B:22:0x01ef, B:29:0x02b7, B:31:0x09ba, B:33:0x09c9, B:39:0x0a42, B:42:0x0a4e, B:47:0x0aa4, B:52:0x0af8, B:57:0x0b7f, B:66:0x0bf2, B:68:0x0bf8, B:70:0x0bf9, B:74:0x0bfa, B:76:0x0c00, B:77:0x0c01, B:78:0x02d7, B:80:0x03b8, B:82:0x03e1, B:83:0x041e, B:87:0x06fe, B:89:0x073e, B:90:0x096f, B:96:0x0c11, B:98:0x0c17, B:99:0x0c18, B:102:0x0c1a, B:104:0x0c20, B:105:0x0c21, B:106:0x040b, B:108:0x0c22, B:121:0x0d1f, B:112:0x0c67, B:92:0x0c02, B:93:0x0c0f, B:55:0x0b18, B:25:0x0244, B:27:0x0268, B:28:0x02ae, B:35:0x09da, B:37:0x09fb, B:38:0x0a3c, B:43:0x0a53, B:45:0x0a66, B:46:0x0a9d, B:48:0x0aa7, B:50:0x0aba, B:51:0x0af1, B:59:0x0b87, B:61:0x0ba8, B:62:0x0be9, B:86:0x043b, B:109:0x0c61, B:110:0x0c66, B:118:0x0d1d), top: B:3:0x0005, inners: #0, #2, #3, #4, #5 }] */
    @Override // com.payair.hce.getDrawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean getProfileVersion(java.lang.String str) {
        android.content.Context context;
        int i;
        java.util.Iterator<com.payair.hce.getDrawable> it;
        java.lang.Object[] objArr;
        int i2;
        int i3;
        java.lang.String str2 = str;
        synchronized (this) {
            int i4 = getPaymentFci;
            int i5 = i4 & 85;
            int i6 = -(-((i4 ^ 85) | i5));
            getGpoResponse = ((i5 & i6) + (i6 | i5)) % 128;
            java.util.Iterator<com.payair.hce.getDrawable> it2 = this.DigitizedCardProfile.values().iterator();
            int i7 = getPaymentFci;
            getGpoResponse = ((i7 & 115) + (i7 | 115)) % 128;
            while (it2.hasNext()) {
                getGpoResponse = (getPaymentFci + 37) % 128;
                if (it2.next().getProfileVersion(str2)) {
                    break;
                }
            }
            for (java.util.Iterator<com.payair.hce.getDrawable> it3 = this.AlternateContactlessPaymentDataJson.values().iterator(); it3.hasNext(); it3 = it) {
                int i8 = getGpoResponse;
                getPaymentFci = ((i8 & 15) + (i8 | 15)) % 128;
                if (it3.next().getProfileVersion(str2)) {
                    break;
                }
                int i9 = getGpoResponse + 60;
                int i10 = (~i9) + (i9 << 1);
                getPaymentFci = i10 % 128;
                if (i10 % 2 == 0) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 40, 667 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (40024 - android.view.View.MeasureSpec.getMode(0)));
                    byte b = $$a[14];
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(b, (byte) (b - 1), b, objArr2);
                    cls.getField((java.lang.String) objArr2[0]).getLong(null);
                    throw new java.lang.ArithmeticException();
                }
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.KeyEvent.normalizeMetaState(0), 666 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (40023 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                byte[] bArr = $$a;
                byte b2 = bArr[14];
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(b2, (byte) (b2 - 1), b2, objArr3);
                long j = cls2.getField((java.lang.String) objArr3[0]).getLong(null);
                try {
                    try {
                        try {
                            if (j != -1) {
                                int i11 = getGpoResponse;
                                getPaymentFci = ((i11 ^ 89) + ((i11 & 89) << 1)) % 128;
                                int size = android.view.View.MeasureSpec.getSize(0);
                                int identityHashCode = java.lang.System.identityHashCode(this);
                                int i12 = size * 236;
                                int i13 = (i12 ^ 10362) + ((i12 & 10362) << 1);
                                int i14 = ~size;
                                int i15 = ~identityHashCode;
                                int i16 = i14 & i15;
                                int i17 = (i15 | i14) & (~i16);
                                int i18 = ~((i17 ^ i16) | (i16 & i17));
                                int i19 = ((~i18) & 22) | (i18 & (-23));
                                int i20 = i18 & 22;
                                int i21 = ((i20 ^ i19) | (i20 & i19)) * (-235);
                                int i22 = i13 ^ i21;
                                int i23 = (((i21 & i13) | i22) << 1) - i22;
                                int i24 = i14 & identityHashCode;
                                int i25 = (~i24) & (i14 | identityHashCode);
                                int i26 = ~((i24 ^ i25) | (i24 & i25));
                                int i27 = ((~i26) & 22) | (i26 & (-23));
                                int i28 = i26 & 22;
                                int i29 = ((i28 ^ i27) | (i28 & i27)) * (-470);
                                int i30 = i23 & i29;
                                int i31 = ((i23 ^ i29) | i30) << 1;
                                int i32 = -((i23 | i29) & (~i30));
                                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                                int i34 = ~((size ^ (-23)) | (size & (-23)));
                                int i35 = i14 | 22;
                                int i36 = ~((i35 ^ identityHashCode) | (i35 & identityHashCode));
                                int i37 = i34 & i36;
                                int i38 = (((i34 | i36) & (~i37)) | i37) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                b(((((~i38) & i33) | ((~i33) & i38)) - (~((i38 & i33) << 1))) - 1, (byte) ((android.os.Process.myPid() >> 22) + 104), "\u001b\r\u0010\u0004\u0018\u0000\u0007\"\u0014\u001e\u0001\r\u0014\u001f\u0015\u0017\n\u0018\f\u0017\u0016\u0011", objArr4);
                                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                                int i39 = -android.view.View.MeasureSpec.getSize(0);
                                int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay() >> 16;
                                int identityHashCode2 = java.lang.System.identityHashCode(this);
                                int i40 = (scrollDefaultDelay * 477) - 51300;
                                int i41 = ~scrollDefaultDelay;
                                int i42 = ~((i41 ^ 108) | (i41 & 108));
                                int i43 = scrollDefaultDelay | (-109);
                                int i44 = i43 & identityHashCode2;
                                int i45 = (~i44) & (i43 | identityHashCode2);
                                int i46 = ~identityHashCode2;
                                int i47 = ~((i45 ^ i44) | (i44 & i45));
                                int i48 = i42 & i47;
                                int i49 = (~i48) & (i42 | i47);
                                int i50 = -(-(((i49 ^ i48) | (i49 & i48)) * (-476)));
                                int i51 = i40 & i50;
                                int i52 = ((i50 | i40) & (~i51)) + (i51 << 1);
                                int i53 = -(-(i47 * 952));
                                int i54 = i52 & i53;
                                int i55 = ((i53 | i52) & (~i54)) + (i54 << 1);
                                int i56 = (i46 & (-109)) | (i46 ^ (-109));
                                int i57 = (i56 & i41) | ((~i56) & scrollDefaultDelay);
                                int i58 = i56 & scrollDefaultDelay;
                                int i59 = (~((i58 ^ i57) | (i58 & i57))) * 476;
                                int i60 = i55 & i59;
                                byte b3 = (byte) ((((i55 ^ i59) | i60) << 1) - ((i55 | i59) & (~i60)));
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                b(((i39 | 15) << 1) - (i39 ^ 15), b3, "\u0017\u0010\u001a\u001c\"\u0014\u0006\u0004\u0013\u001c\u000e\u0017\u0000\f㙫", objArr5);
                                if (j + 1960 >= ((java.lang.Long) cls3.getDeclaredMethod((java.lang.String) objArr5[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                                    int i61 = getGpoResponse;
                                    int i62 = i61 & 91;
                                    int i63 = (i61 | 91) & (~i62);
                                    int i64 = -(-(i62 << 1));
                                    getPaymentFci = (((i63 | i64) << 1) - (i63 ^ i64)) % 128;
                                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.graphics.Color.green(0) + 667, (char) (40024 - android.widget.ExpandableListView.getPackedPositionType(0L)));
                                    byte b4 = bArr[14];
                                    byte b5 = (byte) (b4 - 1);
                                    byte b6 = b4;
                                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                                    a(b5, b6, (byte) (b6 - 1), objArr6);
                                    try {
                                        java.lang.Object[] objArr7 = {cls4.getField((java.lang.String) objArr6[0]).get(null), 1844111554, 0};
                                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                        if (obj == null) {
                                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.text.TextUtils.indexOf("", "", 0), 4683 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj);
                                        }
                                        objArr = (java.lang.Object[]) ((java.lang.reflect.Method) obj).invoke(null, objArr7);
                                        int i65 = getPaymentFci;
                                        int i66 = ((i65 ^ 113) | (i65 & 113)) << 1;
                                        int i67 = -((i65 & (-114)) | ((~i65) & 113));
                                        getGpoResponse = ((i66 & i67) + (i67 | i66)) % 128;
                                        it = it3;
                                        i2 = ((int[]) objArr[1])[0];
                                        i3 = ((int[]) objArr[0])[0];
                                        if (i3 != i2) {
                                            getGpoResponse = (getPaymentFci + 107) % 128;
                                            java.lang.Object[] objArr8 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[4])[0]), 0};
                                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                            if (obj2 == null) {
                                                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 33, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4683, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj2);
                                            }
                                            ((java.lang.reflect.Method) obj2).invoke(null, objArr8);
                                            java.lang.System.identityHashCode(this);
                                            java.lang.System.identityHashCode(this);
                                        } else {
                                            java.util.ArrayList arrayList = new java.util.ArrayList();
                                            java.lang.Object[] objArr9 = {objArr};
                                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1859861882);
                                            if (obj3 == null) {
                                                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 33, 4684 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("values", java.lang.Object[].class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1859861882, obj3);
                                            }
                                            arrayList.add(((java.lang.reflect.Method) obj3).invoke(null, objArr9));
                                            java.lang.Object[] objArr10 = {objArr};
                                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1831744115);
                                            if (obj4 == null) {
                                                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 4684 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("writeReplace", java.lang.Object[].class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1831744115, obj4);
                                            }
                                            arrayList.add(((java.lang.reflect.Method) obj4).invoke(null, objArr10));
                                            int i68 = (~i3) & i2;
                                            int i69 = (~i2) & i3;
                                            long j2 = (i68 ^ i69) | (i69 & i68);
                                            int i70 = getGpoResponse;
                                            int i71 = i70 ^ 75;
                                            int i72 = ((i70 & 75) | i71) << 1;
                                            int i73 = -i71;
                                            getPaymentFci = ((i72 ^ i73) + ((i72 & i73) << 1)) % 128;
                                            try {
                                                java.lang.Object[] objArr11 = {java.lang.Long.valueOf(j2 ^ (-8779666022136283136L)), -2044175283L};
                                                byte[] bArr2 = $$d;
                                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                c(bArr2[27], (short) (bArr2[13] - 1), bArr2[21], objArr12);
                                                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                                                byte b7 = bArr2[51];
                                                short s = bArr2[21];
                                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                                c(b7, s, (byte) (s | 20), objArr13);
                                                cls5.getMethod((java.lang.String) objArr13[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr11);
                                                java.lang.Object[] objArr14 = {objArr, java.lang.Integer.valueOf(((int[]) objArr[4])[0]), 0};
                                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2063209580);
                                                if (obj5 == null) {
                                                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 33, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4685, (char) android.view.View.combineMeasuredStates(0, 0))).getMethod("DigitizedCardProfile", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2063209580, obj5);
                                                }
                                                ((java.lang.reflect.Method) obj5).invoke(null, objArr14);
                                            } catch (java.lang.Throwable th) {
                                                java.lang.Throwable cause = th.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        }
                                        str2 = str;
                                    } catch (java.lang.Throwable th2) {
                                        java.lang.Throwable cause2 = th2.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th2;
                                    }
                                }
                            }
                            int i74 = -android.graphics.Color.blue(0);
                            int identityHashCode3 = java.lang.System.identityHashCode(this);
                            int i75 = i74 * (-103);
                            int i76 = (i75 & 2265) | ((~i75) & (-2266));
                            int i77 = (i75 & (-2266)) << 1;
                            int i78 = (i76 & i77) + (i77 | i76);
                            int i79 = ~i74;
                            int i80 = (i79 & 22) | ((~i79) & (-23));
                            int i81 = i79 & (-23);
                            int i82 = ~((i80 ^ i81) | (i81 & i80));
                            int i83 = identityHashCode3 ^ (-23);
                            int i84 = ~identityHashCode3;
                            int i85 = identityHashCode3 & (-23);
                            int i86 = (i83 ^ i85) | (i83 & i85);
                            int i87 = ~i86;
                            int i88 = (i86 | i87) & i87;
                            int i89 = ((~i88) & i82) | ((~i82) & i88);
                            int i90 = i82 & i88;
                            int i91 = -(-(((i90 ^ i89) | (i90 & i89)) * 104));
                            int i92 = (i78 & i91) + (i91 | i78);
                            int i93 = i84 & i74;
                            int i94 = (i84 ^ i74) | i93;
                            int i95 = (i94 & (-23)) | ((~i94) & 22);
                            int i96 = i94 & 22;
                            int i97 = (i96 ^ i95) | (i96 & i95);
                            int i98 = ~i97;
                            int i99 = -(-(((i97 | i98) & i98) * (-104)));
                            int i100 = i92 & i99;
                            int i101 = ((i92 ^ i99) | i100) << 1;
                            int i102 = -((i99 | i92) & (~i100));
                            int i103 = (i79 & identityHashCode3) | i93;
                            int i104 = i74 & identityHashCode3;
                            int rgb = android.graphics.Color.rgb(0, 0, 0);
                            int identityHashCode4 = java.lang.System.identityHashCode(this);
                            int i105 = (rgb * (-665)) + 1308657584;
                            int i106 = ~rgb;
                            int i107 = (rgb | i106) & i106;
                            int i108 = -(-(i107 * (-333)));
                            int i109 = ~identityHashCode4;
                            int i110 = i109 & (i109 | identityHashCode4);
                            int i111 = i107 & i110;
                            int i112 = (i107 | i110) & (~i111);
                            int i113 = ~((i111 ^ i112) | (i112 & i111));
                            int i114 = ~(16777320 | identityHashCode4);
                            int i115 = i113 ^ i114;
                            int i116 = i113 & i114;
                            int i117 = (((((i105 | i108) << 1) - (~(-(i105 ^ i108)))) - 1) - (~(-(~(-(-(((i116 & i115) | (i115 ^ i116)) * com.visa.cbp.getCertUsage.getODAData))))))) - 2;
                            int i118 = i107 & identityHashCode4;
                            int i119 = (identityHashCode4 | i107) & (~i118);
                            int i120 = ~((i119 ^ i118) | (i119 & i118));
                            int i121 = (16777320 ^ i110) | (16777320 & i110);
                            int i122 = ~i121;
                            int i123 = (i121 | i122) & i122;
                            int i124 = -(~(-(-((((~i120) & i123) | ((~i123) & i120) | (i120 & i123)) * com.visa.cbp.getCertUsage.getODAData))));
                            byte b8 = (byte) (((i117 & i124) + (i124 | i117)) - 1);
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            b(((((i101 | i102) << 1) - (i102 ^ i101)) - (~(((i104 ^ i103) | (i104 & i103)) * 104))) - 1, b8, "\u001b\r\u0010\u0004\u0018\u0000\u0007\"\u0014\u001e\u0001\r\u0014\u001f\u0015\u0017\n\u0018\f\u0017\u0016\u0011", objArr15);
                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                            int i125 = (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int identityHashCode5 = java.lang.System.identityHashCode(this);
                            int i126 = i125 * 765;
                            int i127 = (i126 ^ (-22904)) + ((i126 & (-22904)) << 1);
                            int i128 = (~i127) + (i127 << 1);
                            int i129 = ~identityHashCode5;
                            int i130 = i129 & i125;
                            int i131 = ~i125;
                            int i132 = i130 | ((~i130) & (i129 | i125));
                            int i133 = ~i132;
                            int i134 = (i132 | i133) & i133;
                            int i135 = ((~i134) & 15) | (i134 & (-16));
                            int i136 = i134 & 15;
                            int i137 = ((i136 ^ i135) | (i136 & i135)) * 764;
                            int i138 = ((i128 | i137) << 1) - (i128 ^ i137);
                            int i139 = (i131 | i125) & i131;
                            int i140 = (i139 & (-16)) | ((~i139) & 15);
                            int i141 = i139 & 15;
                            int i142 = ~((i141 ^ i140) | (i141 & i140));
                            int i143 = (identityHashCode5 | i129) & i129;
                            int i144 = i143 & 15;
                            int i145 = i144 | ((i143 | 15) & (~i144));
                            int i146 = ~i145;
                            int i147 = (i145 | i146) & i146;
                            int i148 = i142 ^ i147;
                            int i149 = i142 & i147;
                            int i150 = ((i149 ^ i148) | (i149 & i148)) * (-1528);
                            int i151 = ((((i138 ^ i150) | (i138 & i150)) << 1) - (~(-(((~i150) & i138) | ((~i138) & i150))))) - 1;
                            int i152 = i131 & 15;
                            int i153 = (~i152) & (i131 | 15);
                            int i154 = ~((i152 ^ i153) | (i152 & i153));
                            int i155 = i125 & (-16);
                            int i156 = (i125 | (-16)) & (~i155);
                            int i157 = ~((i155 ^ i156) | (i156 & i155));
                            int i158 = (i154 ^ i157) | (i154 & i157);
                            int i159 = i143 ^ i125;
                            int i160 = i125 & i143;
                            int i161 = (i160 ^ i159) | (i160 & i159);
                            int i162 = ~i161;
                            int i163 = (i161 | i162) & i162;
                            int i164 = i158 & i163;
                            int i165 = (((i163 | i158) & (~i164)) | i164) * 764;
                            int i166 = i151 & i165;
                            int i167 = (i165 | i151) & (~i166);
                            int i168 = -(-(i166 << 1));
                            int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                            int identityHashCode6 = java.lang.System.identityHashCode(this);
                            int i169 = ~identityHashCode6;
                            int i170 = ~deadChar;
                            int i171 = i170 & (-109);
                            int i172 = (i170 ^ (-109)) | i171;
                            int i173 = ~i172;
                            int i174 = (i172 | i173) & i173;
                            int i175 = ((~i174) & i169) | ((~i169) & i174);
                            int i176 = i174 & i169;
                            int i177 = (i169 & deadChar) | (identityHashCode6 & i170);
                            int i178 = deadChar & identityHashCode6;
                            int i179 = (i177 ^ i178) | (i177 & i178);
                            int i180 = ~i179;
                            int i181 = (i179 | i180) & i180;
                            int i182 = identityHashCode6 & 108;
                            int i183 = ~(((identityHashCode6 | 108) & (~i182)) | i182);
                            int i184 = i181 & i183;
                            int i185 = ((-2) - (~(((deadChar * (-661)) - 71388) - (~(((i176 ^ i175) | (i176 & i175)) * 1324))))) + ((((i183 | i181) & (~i184)) | i184) * (-1324));
                            int i186 = ((~i170) & 108) | i171;
                            int i187 = i170 & 108;
                            int i188 = ~((i186 ^ i187) | (i186 & i187));
                            int i189 = deadChar & (-109);
                            int i190 = (deadChar | (-109)) & (~i189);
                            int i191 = ~((i190 ^ i189) | (i190 & i189));
                            int i192 = -(-(((i188 ^ i191) | (i191 & i188)) * 662));
                            int i193 = i185 & i192;
                            int i194 = -(-((i192 ^ i185) | i193));
                            byte b9 = (byte) (((i193 | i194) << 1) - (i194 ^ i193));
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            b((i167 ^ i168) + ((i167 & i168) << 1), b9, "\u0017\u0010\u001a\u001c\"\u0014\u0006\u0004\u0013\u001c\u000e\u0017\u0000\f㙫", objArr16);
                            long longValue = ((java.lang.Long) cls6.getDeclaredMethod((java.lang.String) objArr16[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.graphics.Color.rgb(0, 0, 0) + 16777883, (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 40024));
                            byte b10 = bArr[14];
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            a(b10, (byte) (b10 - 1), b10, objArr17);
                            cls7.getField((java.lang.String) objArr17[0]).set(null, java.lang.Long.valueOf(longValue));
                            getPaymentFci = (getGpoResponse + 7) % 128;
                            i2 = ((int[]) objArr[1])[0];
                            i3 = ((int[]) objArr[0])[0];
                            if (i3 != i2) {
                            }
                            str2 = str;
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause3 = th3.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th3;
                        }
                    } catch (java.lang.Exception unused) {
                        throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                    }
                    java.lang.Object[] objArr18 = {context, java.lang.Integer.valueOf(i), 0, 1844111554};
                    byte[] bArr3 = $$d;
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    c(bArr3[55], bArr3[63], bArr3[21], objArr19);
                    java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr19[0]);
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    c(bArr3[29], bArr3[51], bArr3[148], objArr20);
                    java.lang.String str3 = (java.lang.String) objArr20[0];
                    int edgeSlop = android.view.ViewConfiguration.getEdgeSlop() >> 16;
                    int identityHashCode7 = java.lang.System.identityHashCode(this);
                    int i195 = edgeSlop * (-103);
                    int i196 = i195 | 8446;
                    int i197 = (i196 << 1) - ((~(i195 & 8446)) & i196);
                    int i198 = ~edgeSlop;
                    int i199 = (i198 & (-82)) | ((~i198) & 81);
                    int i200 = i198 & 81;
                    int i201 = ~((i200 ^ i199) | (i200 & i199));
                    int i202 = ~((identityHashCode7 & 81) | (identityHashCode7 ^ 81));
                    int i203 = i201 & i202;
                    int i204 = -(~(-(-((((i201 | i202) & (~i203)) | i203) * 104))));
                    int i205 = ((i197 ^ i204) + ((i204 & i197) << 1)) - 1;
                    int i206 = ~identityHashCode7;
                    int i207 = i206 & edgeSlop;
                    int i208 = (i206 | edgeSlop) & (~i207);
                    int i209 = (i208 ^ i207) | (i208 & i207);
                    int i210 = i209 & (-82);
                    int i211 = (i209 | (-82)) & (~i210);
                    int i212 = (~((i211 ^ i210) | (i211 & i210))) * (-104);
                    int i213 = i205 ^ i212;
                    int i214 = (i212 & i205) << 1;
                    int i215 = (i213 ^ i214) + ((i214 & i213) << 1);
                    int i216 = edgeSlop ^ identityHashCode7;
                    int i217 = edgeSlop & identityHashCode7;
                    int i218 = -(-(((i217 ^ i216) | (i217 & i216)) * 104));
                    int i219 = i215 & i218;
                    short keyRepeatTimeout = (short) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    int identityHashCode8 = java.lang.System.identityHashCode(this);
                    int i220 = lastIndexOf * 659;
                    int i221 = (-1866728541) & i220;
                    int i222 = (i220 ^ (-1866728541)) | i221;
                    int i223 = (i221 ^ i222) + ((i222 & i221) << 1);
                    int i224 = ~lastIndexOf;
                    int i225 = 1630614285 & i224;
                    int i226 = (~i225) & (i224 | 1630614285);
                    int i227 = (i226 ^ i225) | (i226 & i225);
                    int i228 = ~i227;
                    int i229 = (i227 | i228) & i228;
                    int i230 = (-1630614286) & lastIndexOf;
                    it = it3;
                    int i231 = ~(((~i230) & ((-1630614286) | lastIndexOf)) | i230);
                    int i232 = ((~i229) & i231) | ((~i231) & i229) | (i229 & i231);
                    int i233 = ~(lastIndexOf | identityHashCode8);
                    int i234 = -(-((((~i232) & i233) | ((~i233) & i232) | (i232 & i233)) * (-658)));
                    int i235 = (-1630614286) ^ lastIndexOf;
                    int i236 = (((i223 & i234) + (i234 | i223)) - (~((~((i230 & i235) | (i235 ^ i230))) * 658))) - 1;
                    int i237 = (lastIndexOf & identityHashCode8) | (lastIndexOf ^ identityHashCode8);
                    int i238 = ~i237;
                    int i239 = (((i237 | i238) & i238) | (~(i235 | i230))) * 658;
                    int i240 = -(android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int identityHashCode9 = java.lang.System.identityHashCode(this);
                    int i241 = i240 * 866;
                    int i242 = ((1183165184 | i241) << 1) - (i241 ^ 1183165184);
                    int i243 = ~i240;
                    int i244 = ~identityHashCode9;
                    int i245 = ~((i243 ^ i244) | (i243 & i244));
                    int i246 = ((i245 ^ 558124423) | (i245 & 558124423)) * (-865);
                    int i247 = i242 & i246;
                    int i248 = -(-((i246 ^ i242) | i247));
                    int i249 = (i247 & i248) + (i247 | i248);
                    int i250 = i240 ^ identityHashCode9;
                    int i251 = i240 & identityHashCode9;
                    int i252 = (i250 ^ i251) | (i250 & i251);
                    int i253 = ~i252;
                    int i254 = -(-((i253 & (i252 | i253)) * 865));
                    int i255 = i249 ^ i254;
                    int i256 = (i254 & i249) << 1;
                    int i257 = ((i255 | i256) << 1) - (i256 ^ i255);
                    int i258 = (identityHashCode9 | i244) & i244;
                    int i259 = 558124423 ^ i258;
                    int i260 = 558124423 & i258;
                    int i261 = (i259 & i260) | (i259 ^ i260);
                    int i262 = ~i261;
                    int i263 = (i261 | i262) & i262;
                    int i264 = ~((i240 & (~i258)) | (i243 & i258) | (i258 & i240));
                    int i265 = ((~i264) & i263) | ((~i263) & i264);
                    int i266 = i264 & i263;
                    int i267 = -(-(((i266 ^ i265) | (i266 & i265)) * 865));
                    int i268 = ((~i267) & i257) | ((~i257) & i267);
                    int i269 = -(-((i267 & i257) << 1));
                    int i270 = -android.view.KeyEvent.getDeadChar(0, 0);
                    int identityHashCode10 = java.lang.System.identityHashCode(this);
                    int i271 = i270 * (-495);
                    int i272 = ((-50985) | i271) << 1;
                    int i273 = -((i271 & 50984) | ((~i271) & (-50985)));
                    int i274 = ~i270;
                    int i275 = i274 & (i274 | i270);
                    int i276 = i275 & (-104);
                    int i277 = (~i276) & (i275 | (-104));
                    int i278 = (i277 ^ i276) | (i277 & i276);
                    int i279 = ~i278;
                    int i280 = (i278 | i279) & i279;
                    int i281 = i275 ^ identityHashCode10;
                    int i282 = i275 & identityHashCode10;
                    int i283 = ~((i281 ^ i282) | (i282 & i281));
                    int i284 = ((~i283) & i280) | ((~i280) & i283);
                    int i285 = i280 & i283;
                    int i286 = (i272 ^ i273) + ((i273 & i272) << 1) + (((i284 ^ i285) | (i285 & i284)) * 992);
                    int i287 = i274 & (-104);
                    int i288 = (~(i287 | ((~i287) & (i274 | (-104))))) | (~(i274 | identityHashCode10));
                    int i289 = ~identityHashCode10;
                    int i290 = (i289 ^ i270) | (i289 & i270);
                    int i291 = i290 & 103;
                    int i292 = (i290 | 103) & (~i291);
                    int i293 = (i292 ^ i291) | (i292 & i291);
                    int i294 = ~i293;
                    int i295 = (i293 | i294) & i294;
                    int i296 = ((~i295) & i288) | ((~i288) & i295);
                    int i297 = i288 & i295;
                    int i298 = ((i297 ^ i296) | (i297 & i296)) * (-496);
                    int i299 = i286 & i298;
                    int i300 = ((i286 ^ i298) | i299) << 1;
                    int i301 = -((i298 | i286) & (~i299));
                    int i302 = (i300 ^ i301) + ((i301 & i300) << 1);
                    int i303 = -(-((identityHashCode10 | 103) * 496));
                    byte b11 = (byte) ((i302 ^ i303) + ((i303 & i302) << 1));
                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                    d((((i215 ^ i218) | i219) << 1) - ((i218 | i215) & (~i219)), keyRepeatTimeout, (i236 ^ i239) + ((i239 & i236) << 1), (i268 & i269) + (i269 | i268), b11, objArr21);
                    objArr = (java.lang.Object[]) cls8.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr21[0]), java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr18);
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 667 - android.view.KeyEvent.getDeadChar(0, 0), (char) (40023 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                    byte b12 = bArr[14];
                    byte b13 = (byte) (b12 - 1);
                    byte b14 = b12;
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    a(b13, b14, (byte) (b14 - 1), objArr22);
                    cls9.getField((java.lang.String) objArr22[0]).set(null, objArr);
                } catch (java.lang.Throwable th4) {
                    java.lang.Throwable cause4 = th4.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th4;
                }
                long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
                int i304 = -(~(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                b((globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 25, (byte) ((((i304 | 38) << 1) - (i304 ^ 38)) - 1), "\u001b\r\u0010\u0004\u0018\u0000\u0007\"\u001a\u001c\u0019!\u000b\u0015\u0012 \u0006 \u0015\u0014\u0017\t\u0004\u001c\u001c\u0007", objArr23);
                java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                int i305 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                int identityHashCode11 = java.lang.System.identityHashCode(this);
                int i306 = i305 * 714;
                int i307 = i306 & (-13528);
                int i308 = ((i306 ^ (-13528)) | i307) << 1;
                int i309 = -((i306 | (-13528)) & (~i307));
                int i310 = (i308 & i309) + (i309 | i308);
                int i311 = ~i305;
                int i312 = ~identityHashCode11;
                int i313 = i311 ^ i312;
                int i314 = i311 & i312;
                int i315 = ~((i313 ^ i314) | (i313 & i314));
                int i316 = ~((i311 ^ 19) | (i311 & 19));
                int i317 = ((~i316) & i315) | ((~i315) & i316);
                int i318 = i316 & i315;
                int i319 = (i318 ^ i317) | (i318 & i317);
                int i320 = (i305 ^ (-20)) | (i305 & (-20));
                int i321 = i320 & identityHashCode11;
                int i322 = i320 ^ identityHashCode11;
                int i323 = ~(i321 | i322);
                int i324 = i319 & i323;
                int i325 = (((i319 | i323) & (~i324)) | i324) * (-713);
                int i326 = ((i310 | i325) << 1) - (i325 ^ i310);
                int i327 = -(-((~((i322 ^ i321) | (i321 & i322))) * 1426));
                int i328 = i326 & i327;
                int i329 = (i327 ^ i326) | i328;
                int i330 = (i328 & i329) + (i329 | i328);
                int i331 = (identityHashCode11 | i312) & i312;
                int i332 = ((~i331) & (-20)) | (i331 & 19);
                int i333 = i331 & (-20);
                int i334 = -(-((~((i333 ^ i332) | (i333 & i332))) * 713));
                int i335 = i330 & i334;
                int i336 = -(-(i334 | i330));
                int i337 = -android.text.TextUtils.getOffsetBefore("", 0);
                java.lang.Object[] objArr24 = new java.lang.Object[1];
                b((i335 ^ i336) + ((i336 & i335) << 1), (byte) (((((~i337) & 115) | (i337 & (-116))) - (~(-(-((i337 & 115) << 1))))) - 1), "\u0015#㙛㙛\u0015\u0010\u0015\b㙝㙝\f#\u0013\u001d\u0012 \u0015\f", objArr24);
                context = (android.content.Context) cls10.getMethod((java.lang.String) objArr24[0], new java.lang.Class[0]).invoke(null, null);
                if (context != null) {
                    int i338 = getGpoResponse;
                    int i339 = i338 & 125;
                    int i340 = (i338 | 125) & (~i339);
                    int i341 = -(-(i339 << 1));
                    getPaymentFci = ((i340 & i341) + (i340 | i341)) % 128;
                    context = context.getApplicationContext();
                    int i342 = getPaymentFci;
                    int i343 = ((i342 | 113) << 1) - (i342 ^ 113);
                    getGpoResponse = i343 % 128;
                    int i344 = i343 % 2;
                }
                if (str2 != null) {
                    int i345 = getPaymentFci;
                    int i346 = i345 ^ 119;
                    int i347 = -(-((i345 & 119) << 1));
                    getGpoResponse = ((i346 & i347) + (i347 | i346)) % 128;
                    i = str.length();
                    int i348 = getGpoResponse;
                    getPaymentFci = ((((i348 & (-6)) | ((~i348) & 5)) - (~((i348 & 5) << 1))) - 1) % 128;
                } else {
                    int i349 = getPaymentFci;
                    int i350 = i349 & 119;
                    int i351 = i349 | 119;
                    int i352 = (i350 ^ i351) + ((i351 & i350) << 1);
                    getGpoResponse = i352 % 128;
                    int i353 = i352 % 2;
                    i = 0;
                }
                int i354 = getPaymentFci;
                int i355 = (i354 | 71) << 1;
                int i356 = -(i354 ^ 71);
                getGpoResponse = ((i355 & i356) + (i355 | i356)) % 128;
                getGpoResponse = (((i354 & 54) + (i354 | 54)) - 1) % 128;
            }
            int identityHashCode12 = java.lang.System.identityHashCode(this);
            int i357 = identityHashCode12 & (-3805185);
            int i358 = (identityHashCode12 | (-3805185)) & (~i357);
            int i359 = ~((i357 ^ i358) | (i358 & i357));
            int i360 = -(-(((i359 ^ 50349328) | (50349328 & i359)) * (-756)));
            int i361 = (((-1962316989) | i360) << 1) - (i360 ^ (-1962316989));
            int i362 = ~identityHashCode12;
            int i363 = i362 & (-3805185);
            int i364 = (i362 | (-3805185)) & (~i363);
            int i365 = -(~(((i364 ^ i363) | (i364 & i363)) * 756));
            int identityHashCode13 = java.lang.System.identityHashCode(this);
            int i366 = ~identityHashCode13;
            int i367 = (i366 | identityHashCode13) & i366;
            int i368 = i367 & (-318035136);
            int i369 = (i367 | (-318035136)) & (~i368);
            int i370 = (i369 ^ i368) | (i369 & i368);
            int i371 = ~i370;
            int i372 = (i370 | i371) & i371;
            int i373 = 807831965 & identityHashCode13;
            int i374 = (~i373) & (807831965 | identityHashCode13);
            int i375 = (i373 ^ i374) | (i373 & i374);
            int i376 = ~i375;
            int i377 = (i375 | i376) & i376;
            int i378 = i372 & i377;
            int i379 = (i372 | i377) & (~i378);
            int i380 = (-1658391941) - (~(-(~(((i379 ^ i378) | (i379 & i378)) * 959))));
            int i381 = 53017408 & i380;
            int i382 = -(-((i380 ^ 53017408) | i381));
            int i383 = (i381 ^ i382) + ((i381 & i382) << 1);
            int i384 = ~((identityHashCode13 ^ (-318035136)) | (identityHashCode13 & (-318035136)));
            int i385 = ((-807831966) & i366) | ((~i366) & 807831965);
            int i386 = i366 & 807831965;
            int i387 = ~((i386 ^ i385) | (i386 & i385));
            int i388 = ((i384 ^ i387) | (i384 & i387)) * 959;
            int i389 = i383 & i388;
            int i390 = i388 | i383;
            if ((-2) - (~((i361 & i365) + (i365 | i361))) > (i389 ^ i390) + ((i390 & i389) << 1)) {
                throw null;
            }
        }
        return true;
    }

    static void init$2() {
        $$g = new byte[]{com.google.common.base.Ascii.DC4, -107, -36, -117};
        $$h = 131;
    }

    static void RecordsJson() {
        getAid = new char[]{12312, 12289, 12291, 12292, 12316, 12333, 12327, 12313, 12348, 12299, 12334, 12322, 12314, 12290, 12288, 12324, 12321, 12326, 12325, 12339, 12350, 12318, 12335, 12329, 12315, 12331, 12317, 12346, 12297, 12319, 12323, 12388, 12345, 12351, 12344, 12320};
        getCvrMaskAnd = (char) 1494;
    }

    static void init$1() {
        $$d = new byte[]{37, 88, 64, 59, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, 14, -15, 34, -19, 2, -12, -3, 14, com.google.common.base.Ascii.SYN, -39, 8, com.google.common.base.Ascii.VT, -3, -13, -43, -8, com.google.common.base.Ascii.SI, -13, 4, 13, -19, com.google.common.base.Ascii.SI, 34, -44, 1, -6, 19, -2, -17, 8, 7, -14, 0, 35, -17, -24, com.google.common.base.Ascii.FF, 8, -9, -6, 48, -29, -19, 19, com.google.common.base.Ascii.ETB, -41, 4, 1, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -53, -15, 13, 4, -19, com.google.common.base.Ascii.SI, 33, -33, -17, 13, 6, -2, 34, -44, 1, -6, com.google.common.base.Ascii.SI, -19, 4, 5, 9, -11, com.google.common.base.Ascii.SI, 19, -19, -11, 4, com.google.common.base.Ascii.VT, -2, -2, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 13, 4, -3, 14, -11, -11, -9, 16, -37, 2, -2, -11, com.google.common.base.Ascii.VT, -17, com.google.common.base.Ascii.NAK, 1, 33, -30, -17, 14, com.google.common.base.Ascii.DC4, -34, 3, 9, -3, -3, 7};
        $$e = 154;
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getGpoResponse = 0;
        getPaymentFci = 1;
        RecordsJson();
        writeReplace = -2117403298;
        SdkCoreAlternateContactlessPaymentDataImpl = 520368579;
        getProfileVersion = 1044413504;
        IccPrivateKeyCrtComponentsJson = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -34, 60, -53, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -31, -40, com.visa.cbp.getEncExpo.IResultReceiver, -53, -60, 60, -53, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -63, -8, 7, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 48, -61, 59, com.visa.cbp.getEncExpo.startTransaction, -86};
        int i = getPaymentFci + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getGpoResponse = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static void init$0() {
        $$a = new byte[]{76, 91, 9, -2, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, -19, 13, com.google.common.base.Ascii.VT, -14, -20, com.google.common.base.Ascii.EM};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE;
    }
}
