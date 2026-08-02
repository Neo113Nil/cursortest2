package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DigitizedCardProfile' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class sendStickyBroadcast {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.sendStickyBroadcast DigitizedCardProfile;
    private static int RecordsJson;
    private static int getProfileVersion;
    private static int[] valueOf;
    public static final com.payair.hce.sendStickyBroadcast values;
    private static final /* synthetic */ com.payair.hce.sendStickyBroadcast[] writeReplace;
    private final java.lang.String AlternateContactlessPaymentDataJson;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = (b * 4) + 1;
        byte[] bArr = $$a;
        int i4 = (s * 4) + 66;
        int i5 = (s2 * 2) + 4;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            i4 = i3;
            int i6 = i5;
            i2 = 0;
            i4 += i5;
            i5 = i6 + 1;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i5;
            i5 = bArr[i5];
            i4 += i5;
            i5 = i6 + 1;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    public static com.payair.hce.sendStickyBroadcast valueOf(java.lang.String str) {
        RecordsJson = (getProfileVersion + 117) % 128;
        com.payair.hce.sendStickyBroadcast sendstickybroadcast = (com.payair.hce.sendStickyBroadcast) java.lang.Enum.valueOf(com.payair.hce.sendStickyBroadcast.class, str);
        int i = getProfileVersion + 51;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            return sendstickybroadcast;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.sendStickyBroadcast[] values() {
        getProfileVersion = (RecordsJson + 37) % 128;
        com.payair.hce.sendStickyBroadcast[] sendstickybroadcastArr = (com.payair.hce.sendStickyBroadcast[]) writeReplace.clone();
        int i = RecordsJson + 1;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            return sendstickybroadcastArr;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        RecordsJson = 1;
        valueOf();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{-1936804885, 1524542263, 919794618, 2120718892}, 8 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{-1936804885, 1524542263, 919794618, 2120718892}, 7 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr2);
        com.payair.hce.sendStickyBroadcast sendstickybroadcast = new com.payair.hce.sendStickyBroadcast(intern, 0, ((java.lang.String) objArr2[0]).intern());
        DigitizedCardProfile = sendstickybroadcast;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(new int[]{591650572, 686532226, 1135564725, -501438815}, 5 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(new int[]{591650572, 686532226, 1135564725, -501438815}, 5 - android.graphics.Color.green(0), objArr4);
        com.payair.hce.sendStickyBroadcast sendstickybroadcast2 = new com.payair.hce.sendStickyBroadcast(intern2, 1, ((java.lang.String) objArr4[0]).intern());
        values = sendstickybroadcast2;
        writeReplace = new com.payair.hce.sendStickyBroadcast[]{sendstickybroadcast, sendstickybroadcast2};
        RecordsJson = (getProfileVersion + 125) % 128;
    }

    private sendStickyBroadcast(java.lang.String str, int i, java.lang.String str2) {
        this.AlternateContactlessPaymentDataJson = str2;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        int i = RecordsJson;
        getProfileVersion = (i + 101) % 128;
        java.lang.String str = this.AlternateContactlessPaymentDataJson;
        getProfileVersion = (i + 47) % 128;
        return str;
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        int i2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr3 = new char[4];
        int i3 = 2;
        char[] cArr4 = new char[iArr.length * 2];
        int[] iArr2 = valueOf;
        int i4 = 1;
        char c = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            $10 = ($11 + 77) % 128;
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 115;
                $11 = i6 % 128;
                if (i6 % i3 == 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        objArr2[c] = java.lang.Integer.valueOf(iArr2[i5]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 27, 29 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                            java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                            clsArr[c] = java.lang.Integer.TYPE;
                            obj = cls.getMethod("z", clsArr);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                        }
                        iArr3[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
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
                    objArr3[c] = java.lang.Integer.valueOf(iArr2[i5]);
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 30 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                    }
                    iArr3[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                    i5++;
                    i3 = 2;
                    c = 0;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = valueOf;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                int i8 = $11 + 111;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    java.lang.Object[] objArr4 = new java.lang.Object[i4];
                    objArr4[0] = java.lang.Integer.valueOf(iArr5[i7]);
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj3 == null) {
                        i2 = length3;
                        cArr2 = cArr4;
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 26, 29 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) android.view.View.combineMeasuredStates(0, 0))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj3);
                    } else {
                        cArr2 = cArr4;
                        i2 = length3;
                    }
                    iArr6[i7] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    i7 %= 1;
                } else {
                    cArr2 = cArr4;
                    i2 = length3;
                    java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(iArr5[i7])};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 30 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj4);
                    }
                    iArr6[i7] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                    i7++;
                }
                cArr4 = cArr2;
                length3 = i2;
                i4 = 1;
            }
            cArr = cArr4;
            iArr5 = iArr6;
        } else {
            cArr = cArr4;
        }
        char c2 = 0;
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            cArr3[c2] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr3[1] = (char) iArr[istransitsupported.valueOf];
            cArr3[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr3[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr3[0] << 16) + cArr3[1];
            istransitsupported.values = (cArr3[2] << 16) + cArr3[3];
            com.payair.hce.isTransitSupported.values(iArr4);
            $11 = ($10 + 53) % 128;
            int i9 = 0;
            for (int i10 = 16; i9 < i10; i10 = 16) {
                $10 = ($11 + 101) % 128;
                istransitsupported.DigitizedCardProfile ^= iArr4[i9];
                java.lang.Object[] objArr6 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 5089, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj5);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i9++;
            }
            int i11 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i11;
            istransitsupported.values ^= iArr4[16];
            istransitsupported.DigitizedCardProfile ^= iArr4[17];
            int i12 = istransitsupported.DigitizedCardProfile;
            int i13 = istransitsupported.values;
            cArr3[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr3[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr3[2] = (char) (istransitsupported.values >>> 16);
            cArr3[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr4);
            cArr[istransitsupported.valueOf * 2] = cArr3[0];
            cArr[(istransitsupported.valueOf * 2) + 1] = cArr3[1];
            cArr[(istransitsupported.valueOf * 2) + 2] = cArr3[2];
            cArr[(istransitsupported.valueOf * 2) + 3] = cArr3[3];
            java.lang.Object[] objArr7 = {istransitsupported, istransitsupported};
            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj6 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 49, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2923, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3036));
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b((byte) 0, (short) 0, (short) 0, objArr8);
                obj6 = cls2.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj6);
            }
            ((java.lang.reflect.Method) obj6).invoke(null, objArr7);
            c2 = 0;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.DC4, -107, -36, -117};
        $$b = 119;
    }

    static void valueOf() {
        valueOf = new int[]{-813074549, 1967339147, -1683056209, 57065023, -1452683773, -1809938627, 719503560, -2022507457, -2117853110, 1685573666, 831905596, 90269032, -853071440, -1042369532, 2090741873, -884808366, -1333310011, 1064618668};
    }
}
