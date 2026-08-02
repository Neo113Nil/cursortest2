package com.payair.hce;

/* loaded from: classes4.dex */
public final class delete {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static short[] SdkCoreBusinessLogicModuleImpl;
    private static int getAid;
    private static byte[] getCiacDecline;
    private static int getCvrMaskAnd;
    private static int getGpoResponse;
    private static int getPaymentFci;
    private static int getProfileVersion;
    private com.payair.hce.getStatusMessage AlternateContactlessPaymentDataJson;
    private java.lang.String DigitizedCardProfile;
    private final com.payair.hce.getDetailedMessage valueOf;
    private final com.payair.hce.checkPermission values;
    private java.lang.String writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4 = s * 3;
        byte[] bArr = $$a;
        int i5 = 3 - (i2 * 2);
        int i6 = (i * 4) + 104;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i6 += -i7;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            i5++;
            i8 = i3 + 1;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i6 += -i7;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            i5++;
            i8 = i3 + 1;
            if (i3 == i4) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            i5++;
            i8 = i3 + 1;
            if (i3 == i4) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    public delete(com.payair.hce.getDetailedMessage getdetailedmessage, com.payair.hce.getStatusMessage getstatusmessage) {
        float length = android.graphics.PointF.length(0.0f, 0.0f);
        float complexToFloat = android.util.TypedValue.complexToFloat(0);
        int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(253855545 - (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)), (-2013040589) - (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)), (-86) - bitsPerPixel, (byte) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (short) android.text.TextUtils.getCapsMode("", 0, 0), objArr);
        this.values = com.payair.hce.checkPermission.DigitizedCardProfile(((java.lang.String) objArr[0]).intern());
        this.AlternateContactlessPaymentDataJson = getstatusmessage;
        this.valueOf = getdetailedmessage;
    }

    public final boolean valueOf() {
        int i = (getGpoResponse + 77) % 128;
        getCvrMaskAnd = i;
        int i2 = RecordsJson;
        int i3 = i2 + 111;
        getProfileVersion = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = (i + 89) % 128;
        getGpoResponse = i4;
        if (this.AlternateContactlessPaymentDataJson != null) {
            int i5 = i4 + 95;
            getCvrMaskAnd = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }
        int i6 = i4 + 125;
        int i7 = i6 % 128;
        getCvrMaskAnd = i7;
        if (i6 % 2 == 0) {
            int i8 = i2 % 115;
            getProfileVersion = i8 / 30605;
            if (i8 % 5 == 0) {
                throw null;
            }
        } else {
            int i9 = i2 + 107;
            getProfileVersion = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
        }
        getGpoResponse = (i7 + 71) % 128;
        return false;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        int i = RecordsJson + 85;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.isSuccessful issuccessful = com.payair.hce.isSuccessful.DigitizedCardProfile;
            throw null;
        }
        int i2 = getGpoResponse;
        getCvrMaskAnd = (i2 + 73) % 128;
        getCvrMaskAnd = (i2 + 27) % 128;
        com.payair.hce.isSuccessful issuccessful2 = com.payair.hce.isSuccessful.DigitizedCardProfile;
        int i3 = getGpoResponse + 67;
        getCvrMaskAnd = i3 % 128;
        if (i3 % 2 != 0) {
            return issuccessful2;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String values() {
        int i = (getCvrMaskAnd + 39) % 128;
        getGpoResponse = i;
        int i2 = getProfileVersion + 77;
        RecordsJson = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = (i + 107) % 128;
        getCvrMaskAnd = i3;
        java.lang.String str = this.DigitizedCardProfile;
        getGpoResponse = (i3 + 39) % 128;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0084, code lost:
    
        r0 = r0 + 91;
        com.payair.hce.delete.getCvrMaskAnd = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008c, code lost:
    
        if ((r0 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0090, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0082, code lost:
    
        if ((r15 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0076, code lost:
    
        if ((r15 / 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0091, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] AlternateContactlessPaymentDataJson(byte[] bArr) {
        getProfileVersion = (RecordsJson + 11) % 128;
        byte[] bArr2 = new byte[0];
        try {
            bArr2 = this.valueOf.valueOf(bArr);
        } catch (java.security.GeneralSecurityException unused) {
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int green = android.graphics.Color.green(0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(253855477 - makeMeasureSpec, green - 2013040542, (-85) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (byte) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr);
            this.DigitizedCardProfile = valueOf(new int[]{39, 53, 35, 9}, true, ((java.lang.String) objArr[0]).intern()).intern();
        }
        int i = getCvrMaskAnd + 47;
        int i2 = i % 128;
        getGpoResponse = i2;
        if (i % 2 != 0) {
            int i3 = getProfileVersion >>> 12;
            RecordsJson = i3 / 23075;
        } else {
            int i4 = getProfileVersion + 35;
            RecordsJson = i4 % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x01b7, code lost:
    
        if (r4 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01d3, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01cb, code lost:
    
        com.payair.hce.delete.$11 = (r3 + 45) % 128;
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c9, code lost:
    
        if (r4 != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        int i4;
        int i5;
        int length;
        byte[] bArr;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 27, 28 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            boolean z = intValue == -1;
            if (z) {
                int i6 = ($10 + 27) % 128;
                $11 = i6;
                byte[] bArr2 = getCiacDecline;
                if (bArr2 != null) {
                    int i7 = i6 + 47;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    for (int i8 = 0; i8 < length; i8++) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr2[i8])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 31, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5087, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr[i8] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    $10 = ($11 + 95) % 128;
                    byte[] bArr3 = getCiacDecline;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(getAid)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.view.MotionEvent.axisFromString(""), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                    }
                    intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (IccPrivateKeyCrtComponentsJson ^ (-4897270311952305750L))));
                } else {
                    intValue = (short) (((short) (SdkCoreBusinessLogicModuleImpl[i2 + ((int) (getAid ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (IccPrivateKeyCrtComponentsJson ^ (-4897270311952305750L))));
                }
            }
            if (intValue > 0) {
                int i9 = $10;
                int i10 = i9 + 3;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    i4 = ((i2 >> intValue) >> 4) % ((int) (getAid | (-4897270311952305750L)));
                } else {
                    i4 = ((i2 + intValue) - 2) + ((int) (getAid ^ (-4897270311952305750L)));
                }
                gettrack2constructiondata.writeReplace = i4 + i5;
                java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getPaymentFci), sb};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.View.getDefaultSize(0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2365, (char) android.graphics.Color.argb(0, 0, 0, 0));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(0, 0, (short) 0, objArr6);
                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                byte[] bArr4 = getCiacDecline;
                if (bArr4 != null) {
                    $10 = ($11 + 39) % 128;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i11 = 0; i11 < length2; i11++) {
                        bArr5[i11] = (byte) (bArr4[i11] ^ (-4897270311952305750L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                gettrack2constructiondata.DigitizedCardProfile = 1;
                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                    if (z2) {
                        $11 = ($10 + 121) % 128;
                        byte[] bArr6 = getCiacDecline;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                    } else {
                        short[] sArr = SdkCoreBusinessLogicModuleImpl;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                    }
                    sb.append(gettrack2constructiondata.values);
                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                    gettrack2constructiondata.DigitizedCardProfile++;
                }
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

    public final boolean valueOf(java.lang.String str, byte[] bArr, byte[] bArr2) {
        if (this.AlternateContactlessPaymentDataJson == null) {
            return false;
        }
        int i = getGpoResponse;
        getCvrMaskAnd = (i + 87) % 128;
        int i2 = i + 91;
        getCvrMaskAnd = i2 % 128;
        RecordsJson = i2 % 2 == 0 ? (getProfileVersion + 91) % 12560 : (getProfileVersion + 35) % 128;
        getCvrMaskAnd = (i + 77) % 128;
        this.writeReplace = str;
        byte[] AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(bArr2);
        if (AlternateContactlessPaymentDataJson != null) {
            com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson).writeReplace();
        }
        com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(bArr).writeReplace();
        if (!java.util.Arrays.equals(bArr, AlternateContactlessPaymentDataJson)) {
            getGpoResponse = (getCvrMaskAnd + 65) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(253855476 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-2013040581) - android.graphics.Color.red(0), (-85) - android.view.View.combineMeasuredStates(0, 0), (byte) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (short) android.view.View.resolveSizeAndState(0, 0, 0), objArr);
            this.DigitizedCardProfile = valueOf(new int[]{0, 39, 72, 0}, false, ((java.lang.String) objArr[0]).intern()).intern();
            return true;
        }
        getGpoResponse = (getCvrMaskAnd + 17) % 128;
        int i3 = RecordsJson + 61;
        getProfileVersion = i3 % 128;
        if (i3 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        if ((r12 * 3) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:
    
        if (r0[r9] == 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        r12 = r13 + 103;
        com.payair.hce.delete.getGpoResponse = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c3, code lost:
    
        if ((r12 % 2) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        r1[r9] = (char) ((r10[r9] << 1) - r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
    
        r1[r9] = (char) (((r10[r9] << 1) + 1) - r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        if (r0[r9] != 1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
    
        if ((r12 % 2) != 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String valueOf(int[] iArr, boolean z, java.lang.String str) {
        char[] cArr;
        int i;
        char c;
        java.lang.String str2 = str;
        int i2 = (getCvrMaskAnd + 71) % 128;
        getGpoResponse = i2;
        int i3 = getProfileVersion + 35;
        RecordsJson = i3 % 128;
        if (i3 % 2 != 0) {
            getCvrMaskAnd = (i2 + 21) % 128;
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr = str2;
        if (str2 != null) {
            getCvrMaskAnd = (i2 + 35) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(android.view.KeyEvent.normalizeMetaState(0) + 253855550, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 2013040488, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 84, (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), (short) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
            bArr = str2.getBytes(((java.lang.String) objArr[0]).intern());
        }
        byte[] bArr2 = bArr;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = new char[i5];
        java.lang.System.arraycopy(SdkCoreAlternateContactlessPaymentDataImpl, i4, cArr2, 0, i5);
        if (bArr2 != null) {
            int i8 = RecordsJson + 97;
            getProfileVersion = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = getCvrMaskAnd + 17;
                getGpoResponse = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr = new char[i5];
                    i = 0;
                    c = 0;
                    while (i < i5) {
                        int i10 = getGpoResponse + 5;
                        int i11 = i10 % 128;
                        getCvrMaskAnd = i11;
                        if (i10 % 2 == 0) {
                            int i12 = getProfileVersion >>> 29;
                            RecordsJson = i12 % 22486;
                        } else {
                            int i13 = getProfileVersion + 5;
                            RecordsJson = i13 % 128;
                        }
                        c = cArr[i];
                        i++;
                        int i14 = i11 + 57;
                        getGpoResponse = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i15 = RecordsJson + 60;
                            getProfileVersion = i15 / 6126;
                            if (i15 * 3 == 0) {
                                getGpoResponse = (i11 + 25) % 128;
                            }
                        } else {
                            int i16 = RecordsJson + 27;
                            getProfileVersion = i16 % 128;
                            if (i16 % 2 == 0) {
                                getGpoResponse = (i11 + 25) % 128;
                            }
                        }
                    }
                    cArr2 = cArr;
                }
            }
            cArr = new char[i5];
            i = 1;
            c = 0;
            while (i < i5) {
            }
            cArr2 = cArr;
        }
        if (i7 > 0) {
            char[] cArr3 = new char[i5];
            java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i5);
            int i17 = i5 - i7;
            java.lang.System.arraycopy(cArr3, 0, cArr2, i17, i7);
            java.lang.System.arraycopy(cArr3, i7, cArr2, 0, i17);
        }
        if (z) {
            char[] cArr4 = new char[i5];
            for (int i18 = 0; i18 < i5; i18++) {
                getProfileVersion = (RecordsJson + 89) % 128;
                cArr4[i18] = cArr2[(i5 - i18) - 1];
            }
            cArr2 = cArr4;
        }
        if (i6 > 0) {
            int i19 = getCvrMaskAnd + 39;
            getGpoResponse = i19 % 128;
            for (int i20 = i19 % 2 == 0 ? 0 : 1; i20 < i5; i20++) {
                getProfileVersion = (RecordsJson + 49) % 128;
                cArr2[i20] = (char) (cArr2[i20] - iArr[2]);
            }
            getCvrMaskAnd = (getGpoResponse + 31) % 128;
        }
        return new java.lang.String(cArr2);
    }

    static void writeReplace() {
        getAid = 1761132135;
        IccPrivateKeyCrtComponentsJson = 520368638;
        getPaymentFci = -270907231;
        getCiacDecline = new byte[]{com.google.common.base.Ascii.RS, 88, -72, 85, -85, 71, -71, 87, 121, -86, 85, -86, -86, -86, -86, -85, -86, 85, -86, -85, 85, -86, -86, -85, 85, -85, 85, -85, -86, 85, -86, -86, -86, -86, -86, -86, -86, -85, 85, -85, 85, -86, -86, -86, -86, -86, -85, 75, -86, -85, 85, -85, -86, 85, -85, 85, -86, -86, -86, -86, -86, -85, 85, -85, 85, -86, -86, -86, -86, -86, -86, -86, -85, -86, 85, -86, -86, -85, -86, -86, 85, -86, -85, 85, -86, -86, -86, -86, -85, -86, 85, -86, -85, 85, -86, -86, -85, -86, 85, -85, com.google.common.base.Ascii.FS, -82, 94, -82, 87, -86, -95, 116, 86, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy};
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getGpoResponse = 0;
        getCvrMaskAnd = 1;
        writeReplace();
        RecordsJson = 0;
        getProfileVersion = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = new char[]{'F', 154, 178, 178, 136, 140, 179, 185, 180, kotlin.text.Typography.registered, 180, 181, kotlin.text.Typography.paragraph, 190, 148, 137, 173, kotlin.text.Typography.registered, 172, 175, 141, 139, 171, 173, 178, kotlin.text.Typography.degree, 172, 138, 143, kotlin.text.Typography.paragraph, 143, 138, 170, 178, 178, kotlin.text.Typography.copyright, kotlin.text.Typography.copyright, 178, 180, 'I', 148, io.ktor.util.date.GMTDateParser.MINUTES, 'e', 135, 139, 141, 136, 'v', 'x', 143, 141, 132, 132, 141, 141, 133, 'e', 'e', 137, 145, io.ktor.util.date.GMTDateParser.MINUTES, 'j', 145, 'j', io.ktor.util.date.GMTDateParser.HOURS, 138, 135, 137, 136, io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'o', 153, 145, 144, 143, 137, 143, 148, 142, 'g', 'c', 141, 141, 133, 'e', 'e', 139, 144, 149, 149, 142, 'g'};
        getCvrMaskAnd = (getGpoResponse + 35) % 128;
    }

    static void init$0() {
        $$a = new byte[]{14, 101, 71, 43};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE;
    }

    public final com.payair.hce.isSuccessful DigitizedCardProfile() {
        return (com.payair.hce.isSuccessful) valueOf(new java.lang.Object[]{this}, -1815820240, 1815820240, java.lang.System.identityHashCode(this));
    }
}
