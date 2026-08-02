package com.payair.hce;

/* loaded from: classes4.dex */
public class beginTransaction {
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static char[] IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static boolean getAid;
    private static int getPaymentFci;
    private static boolean getProfileVersion;
    private boolean AlternateContactlessPaymentDataJson;
    private boolean DigitizedCardProfile;
    private byte[] valueOf;
    private com.payair.hce.getErrorDialog values;
    private com.payair.hce.getMDatabaseannotations writeReplace;

    private static void e(byte b, short s, byte b2, java.lang.Object[] objArr) {
        byte[] bArr = $$g;
        int i = (s * 2) + 118;
        int i2 = b * 3;
        int i3 = (b2 * 3) + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i3++;
            i = i3 + i2;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                int i5 = bArr[i3];
                i3++;
                i += i5;
            }
        }
    }

    public beginTransaction(com.payair.hce.getMDatabaseannotations getmdatabaseannotations) {
        this(getmdatabaseannotations, (byte) 0);
    }

    private beginTransaction(com.payair.hce.getMDatabaseannotations getmdatabaseannotations, byte b) {
        this.valueOf = new byte[]{-90, -90, -90, -90, -90, -90, -90, -90};
        this.writeReplace = getmdatabaseannotations;
        this.AlternateContactlessPaymentDataJson = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (r4.valueOf.length == 8) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r4.valueOf.length == 13) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0048, code lost:
    
        r6 = new java.lang.Object[1];
        d(null, null, 126 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), "\u008c\u0083\u0085\u0086\u0083\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0069, code lost:
    
        throw new java.lang.IllegalArgumentException(((java.lang.String) r6[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        com.payair.hce.beginTransaction.getPaymentFci = (com.payair.hce.beginTransaction.SdkCoreAlternateContactlessPaymentDataImpl + 125) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeReplace(boolean z, com.payair.hce.getMCallbacksannotations getmcallbacksannotations) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 39;
        getPaymentFci = i % 128;
        if (i % 2 == 0) {
            this.DigitizedCardProfile = z;
            com.payair.hce.inTransaction intransaction = (com.payair.hce.inTransaction) getmcallbacksannotations;
            this.valueOf = intransaction.writeReplace();
            this.values = (com.payair.hce.getErrorDialog) intransaction.valueOf();
        } else {
            this.DigitizedCardProfile = z;
            com.payair.hce.inTransaction intransaction2 = (com.payair.hce.inTransaction) getmcallbacksannotations;
            this.valueOf = intransaction2.writeReplace();
            this.values = (com.payair.hce.getErrorDialog) intransaction2.valueOf();
        }
    }

    public final byte[] AlternateContactlessPaymentDataJson(byte[] bArr, int i) {
        if (!this.DigitizedCardProfile) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            d(null, null, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 127, "\u0093\u0084\u0092\u0091\u0091\u008a\u008f\u0090\u0083\u008f\u0085\u008e\u0083\u0086\u0087\u008d\u0083\u0086\u0085\u0084", objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        int i2 = i / 8;
        if ((i2 << 3) != i) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            d(null, null, 127 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u008d\u0087\u0086\u0097\u0096\u0083\u008c\u0083\u008e\u0085\u0083\u0087\u008b\u0091\u0092\u0086\u008b\u0089\u0095\u0083\u008a\u0083\u0087\u0096\u0083\u0086\u008d\u0089\u0095\u0083\u008a\u0086\u008a\u0094\u0083\u0091\u008a\u008f\u0090", objArr2);
            throw new com.payair.hce.getInvalidationTracker(((java.lang.String) objArr2[0]).intern());
        }
        byte[] bArr2 = this.valueOf;
        byte[] bArr3 = new byte[bArr2.length + i];
        byte[] bArr4 = new byte[bArr2.length + 8];
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        java.lang.System.arraycopy(bArr, 0, bArr3, this.valueOf.length, i);
        this.writeReplace.writeReplace(this.AlternateContactlessPaymentDataJson, this.values);
        for (int i3 = 0; i3 != 6; i3++) {
            getPaymentFci = (SdkCoreAlternateContactlessPaymentDataImpl + 69) % 128;
            int i4 = 1;
            while (i4 <= i2) {
                SdkCoreAlternateContactlessPaymentDataImpl = (getPaymentFci + 13) % 128;
                java.lang.System.arraycopy(bArr3, 0, bArr4, 0, this.valueOf.length);
                int i5 = i4 << 3;
                java.lang.System.arraycopy(bArr3, i5, bArr4, this.valueOf.length, 8);
                this.writeReplace.AlternateContactlessPaymentDataJson(bArr4, 0, bArr4, 0);
                int i6 = (i2 * i3) + i4;
                int i7 = 1;
                while (i6 != 0) {
                    int length = this.valueOf.length - i7;
                    bArr4[length] = (byte) (((byte) i6) ^ bArr4[length]);
                    i6 >>>= 8;
                    i7++;
                }
                java.lang.System.arraycopy(bArr4, 0, bArr3, 0, 8);
                java.lang.System.arraycopy(bArr4, 8, bArr3, i5, 8);
                i4++;
                getPaymentFci = (SdkCoreAlternateContactlessPaymentDataImpl + 107) % 128;
            }
        }
        int i8 = SdkCoreAlternateContactlessPaymentDataImpl + 113;
        getPaymentFci = i8 % 128;
        if (i8 % 2 != 0) {
            return bArr3;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void d(int[] iArr, java.lang.String str, int i, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str3 = str2;
        int i2 = $10 + 105;
        $11 = i2 % 128;
        int i3 = 2;
        byte[] bArr = str3;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            $11 = ($10 + 97) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr3 = IccPrivateKeyCrtComponentsJson;
        int i4 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 51;
                $11 = i6 % 128;
                if (i6 % i3 == 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        objArr2[i4] = java.lang.Integer.valueOf(cArr3[i5]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.graphics.drawable.Drawable.resolveOpacity(i4, i4), android.graphics.Color.green(i4) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46336 - android.os.Process.getGidForName("")));
                            java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                            clsArr[i4] = java.lang.Integer.TYPE;
                            obj = cls.getMethod("y", clsArr);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                        }
                        cArr4[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        i3 = 2;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    objArr3[i4] = java.lang.Integer.valueOf(cArr3[i5]);
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 286 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1)), (char) ((android.util.TypedValue.complexToFraction(i4, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i4, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46337))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj2);
                    }
                    cArr4[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).charValue();
                    i5++;
                    i3 = 2;
                    i4 = 0;
                }
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(RecordsJson)};
        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj3 == null) {
            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777170) - android.graphics.Color.rgb(0, 0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) (46337 - (android.view.KeyEvent.getMaxKeyCode() >> 16)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj3);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
        if (getAid) {
            getumdgeneration.values = bArr2.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $11 = ($10 + 37) % 128;
                cArr5[getumdgeneration.valueOf] = (char) (cArr3[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr5 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.KeyEvent.keyCodeFromString(""), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1629, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    e((byte) 0, (short) 0, (byte) 0, objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        if (!getProfileVersion) {
            getumdgeneration.values = iArr.length;
            char[] cArr6 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr6[getumdgeneration.valueOf] = (char) (cArr3[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
                $10 = ($11 + 65) % 128;
            }
            objArr[0] = new java.lang.String(cArr6);
            return;
        }
        getumdgeneration.values = cArr2.length;
        char[] cArr7 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr7[getumdgeneration.valueOf] = (char) (cArr3[cArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr7 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj5 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 42, android.graphics.Color.red(0) + 1629, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                e((byte) 0, (short) 0, (byte) 0, objArr8);
                obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    public final byte[] writeReplace(byte[] bArr, int i) throws com.payair.hce.getSuspendingTransactionId {
        boolean z;
        getPaymentFci = (SdkCoreAlternateContactlessPaymentDataImpl + 125) % 128;
        if (this.DigitizedCardProfile) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            d(null, null, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, "\u0093\u0084\u0092\u0091\u0091\u008a\u008f\u0090\u0084\u0089\u0083\u008f\u0085\u008e\u0083\u0086\u0087\u008d\u0083\u0086\u0085\u0084", objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        int i2 = i / 8;
        if ((i2 << 3) != i) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            d(null, null, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 127, "\u008d\u0087\u0086\u0097\u0096\u0083\u008c\u0083\u008e\u0085\u0083\u0087\u008b\u0091\u0092\u0086\u008b\u0089\u0095\u0083\u008a\u0083\u0087\u0096\u0083\u0086\u008d\u0089\u0095\u0083\u008a\u0086\u008a\u0094\u0083\u0091\u008a\u008f\u0090\u0084\u0089", objArr2);
            throw new com.payair.hce.getSuspendingTransactionId(((java.lang.String) objArr2[0]).intern());
        }
        byte[] bArr2 = this.valueOf;
        byte[] bArr3 = new byte[i - bArr2.length];
        byte[] bArr4 = new byte[bArr2.length];
        byte[] bArr5 = new byte[bArr2.length + 8];
        java.lang.System.arraycopy(bArr, 0, bArr4, 0, bArr2.length);
        byte[] bArr6 = this.valueOf;
        java.lang.System.arraycopy(bArr, bArr6.length, bArr3, 0, i - bArr6.length);
        com.payair.hce.getMDatabaseannotations getmdatabaseannotations = this.writeReplace;
        if (this.AlternateContactlessPaymentDataJson) {
            z = false;
        } else {
            getPaymentFci = (SdkCoreAlternateContactlessPaymentDataImpl + 53) % 128;
            z = true;
        }
        getmdatabaseannotations.writeReplace(z, this.values);
        int i3 = i2 - 1;
        for (int i4 = 5; i4 >= 0; i4--) {
            for (int i5 = i3; i5 > 0; i5--) {
                SdkCoreAlternateContactlessPaymentDataImpl = (getPaymentFci + 51) % 128;
                java.lang.System.arraycopy(bArr4, 0, bArr5, 0, this.valueOf.length);
                int i6 = (i5 - 1) * 8;
                java.lang.System.arraycopy(bArr3, i6, bArr5, this.valueOf.length, 8);
                int i7 = (i3 * i4) + i5;
                int i8 = 1;
                while (i7 != 0) {
                    int length = this.valueOf.length - i8;
                    bArr5[length] = (byte) (bArr5[length] ^ ((byte) i7));
                    i7 >>>= 8;
                    i8++;
                }
                this.writeReplace.AlternateContactlessPaymentDataJson(bArr5, 0, bArr5, 0);
                java.lang.System.arraycopy(bArr5, 0, bArr4, 0, 8);
                java.lang.System.arraycopy(bArr5, 8, bArr3, i6, 8);
            }
        }
        if (com.payair.hce.getClientVersion.DigitizedCardProfile(bArr4, this.valueOf)) {
            return bArr3;
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        d(null, null, android.widget.ExpandableListView.getPackedPositionType(0L) + 127, "\u0094\u0087\u008b\u0092\u008a\u008e\u0083\u0095\u0089\u008d\u009a\u0098\u0087\u0099\u0098", objArr3);
        throw new com.payair.hce.getSuspendingTransactionId(((java.lang.String) objArr3[0]).intern());
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        getPaymentFci = 1;
        IccPrivateKeyCrtComponentsJson = new char[]{11033, 11028, 11054, 11260, 11263, 11250, 11237, 11249, 11253, 11233, 11258, 11062, 11251, 11236, 11248, 11255, 11262, 11257, 11239, 11234, 11261, 11232, 11209, 11235, 11238, 11259};
        RecordsJson = -143185074;
        getProfileVersion = true;
        getAid = true;
    }

    static void init$0() {
        $$g = new byte[]{69, -73, 121, 3};
        $$h = 56;
    }
}
