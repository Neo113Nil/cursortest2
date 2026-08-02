package com.payair.hce;

/* loaded from: classes4.dex */
class onTrimMemory implements com.payair.hce.getResources, com.payair.hce.getTheme {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int values;
    private static char[] writeReplace;
    private android.app.Application DigitizedCardProfile;
    private com.payair.hce.checkPermission valueOf;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = i2 * 3;
        int i6 = (i * 4) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i4 = i6;
            int i7 = i5;
            i3 = 0;
            i6 += i7;
            i4++;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i4];
            i6 += i7;
            i4++;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            i6 = 111 - (s * 2);
            i4 = i6;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    public onTrimMemory(android.app.Application application) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{0, 6, 187, 5}, "\u0001\u0001\u0001\u0000\u0000\u0001", false, objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.onTrimMemory.class.getName());
        this.valueOf = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        this.DigitizedCardProfile = application;
    }

    @Override // com.payair.hce.getResources
    public final android.content.Context values() {
        int i = values + 85;
        AlternateContactlessPaymentDataJson = i % 128;
        android.content.Context applicationContext = this.DigitizedCardProfile.getApplicationContext();
        if (i % 2 != 0) {
            return applicationContext;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.getTheme
    public final com.payair.hce.getParams DigitizedCardProfile() {
        com.payair.hce.stopForeground stopforeground = new com.payair.hce.stopForeground(this);
        int i = values + 59;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            return stopforeground;
        }
        throw null;
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        char[] cArr;
        java.lang.String str2 = str;
        int i2 = ($11 + 15) % 128;
        $10 = i2;
        byte[] bArr = str2;
        if (str2 != null) {
            $11 = (i2 + 47) % 128;
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        char c = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = writeReplace;
        long j = 0;
        if (cArr2 != null) {
            $10 = ($11 + 101) % 128;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[c] = java.lang.Integer.valueOf(cArr2[i7]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 2807 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) - 1));
                        byte b = (byte) ($$b & 7);
                        byte b2 = (byte) (b - 1);
                        cArr = cArr2;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b, b2, b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    } else {
                        cArr = cArr2;
                    }
                    cArr3[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i7++;
                    cArr2 = cArr;
                    c = 0;
                    j = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        java.lang.System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr2 != null) {
            $10 = ($11 + 5) % 128;
            char[] cArr5 = new char[i4];
            getaccounttype.writeReplace = 0;
            $10 = ($11 + 25) % 128;
            char c2 = 0;
            while (getaccounttype.writeReplace < i4) {
                int i8 = $11 + 43;
                $10 = i8 % 128;
                if (i8 % 2 == 0 ? bArr2[getaccounttype.writeReplace] != 1 : bArr2[getaccounttype.writeReplace] != 0) {
                    int i9 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.widget.ExpandableListView.getPackedPositionChild(0L) + 2881, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((short) 0, 0, 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj2);
                    }
                    cArr5[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 45, 2836 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b((short) 2, 0, 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr5[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c2 = cArr5[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.graphics.ImageFormat.getBitsPerPixel(0), 213 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                $11 = ($10 + 117) % 128;
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            $10 = ($11 + 115) % 128;
            char[] cArr6 = new char[i4];
            i = 0;
            java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i11 = i4 - i6;
            java.lang.System.arraycopy(cArr6, 0, cArr4, i11, i6);
            java.lang.System.arraycopy(cArr6, i6, cArr4, 0, i11);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i4];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i4) {
                    break;
                }
                int i12 = $11 + 77;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr7[getaccounttype.writeReplace] = cArr4[getaccounttype.writeReplace + i4];
                    i = getaccounttype.writeReplace % 1;
                } else {
                    cArr7[getaccounttype.writeReplace] = cArr4[(i4 - getaccounttype.writeReplace) - 1];
                    i = getaccounttype.writeReplace + 1;
                }
            }
            cArr4 = cArr7;
        }
        if (i5 > 0) {
            int i13 = 0;
            while (true) {
                getaccounttype.writeReplace = i13;
                if (getaccounttype.writeReplace >= i4) {
                    break;
                }
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                i13 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        AlternateContactlessPaymentDataJson = 1;
        writeReplace = new char[]{16817, 16588, 16702, 16583, 16583, 16698};
    }

    static void init$0() {
        $$a = new byte[]{110, 114, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -114};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
    }
}
