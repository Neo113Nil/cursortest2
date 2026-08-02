package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AlternateContactlessPaymentDataJson' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class getPendingAction {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static com.payair.hce.getPendingAction AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int RecordsJson;
    private static byte[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static short[] getAid;
    private static int getProfileVersion;
    private static int valueOf;
    private static final /* synthetic */ com.payair.hce.getPendingAction[] values;
    private static int writeReplace;

    private static void b(short s, byte b, short s2, java.lang.Object[] objArr) {
        byte[] bArr = $$a;
        int i = b + 4;
        int i2 = s * 2;
        int i3 = (s2 * 3) + 104;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i3 = i + (-i2);
            i = i;
        }
        while (true) {
            i4++;
            int i5 = i + 1;
            bArr2[i4] = (byte) i3;
            if (i4 == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i3 += -bArr[i5];
                i = i5;
            }
        }
    }

    private getPendingAction(java.lang.String str) {
    }

    public static com.payair.hce.getPendingAction valueOf(java.lang.String str) {
        int i = getProfileVersion + 79;
        RecordsJson = i % 128;
        com.payair.hce.getPendingAction getpendingaction = (com.payair.hce.getPendingAction) java.lang.Enum.valueOf(com.payair.hce.getPendingAction.class, str);
        if (i % 2 == 0) {
            return getpendingaction;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.getPendingAction[] values() {
        int i = RecordsJson + 53;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        com.payair.hce.getPendingAction[] getpendingactionArr = (com.payair.hce.getPendingAction[]) values.clone();
        int i2 = RecordsJson + 19;
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0) {
            return getpendingactionArr;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        getProfileVersion = 1;
        AlternateContactlessPaymentDataJson();
        short resolveSizeAndState = (short) ((-78) - android.view.View.resolveSizeAndState(0, 0, 0));
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
        int axisFromString = android.view.MotionEvent.axisFromString("");
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(resolveSizeAndState, lastIndexOf + 222912107, modifierMetaStateMask - 1885143597, (-9) - axisFromString, (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr);
        com.payair.hce.getPendingAction getpendingaction = new com.payair.hce.getPendingAction(((java.lang.String) objArr[0]).intern());
        AlternateContactlessPaymentDataJson = getpendingaction;
        values = new com.payair.hce.getPendingAction[]{getpendingaction};
        int i = getProfileVersion + 59;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static com.payair.hce.setPendingAction writeReplace() {
        RecordsJson = (getProfileVersion + 69) % 128;
        com.payair.hce.setValidForSeconds setvalidforseconds = com.payair.hce.setValidForSeconds.values;
        getProfileVersion = (RecordsJson + 83) % 128;
        return setvalidforseconds;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x021c, code lost:
    
        if (r13 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0232, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0230, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022e, code lost:
    
        if (r13 != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, int i2, int i3, byte b, java.lang.Object[] objArr) {
        int i4;
        int i5;
        long j;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = 2;
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(DigitizedCardProfile)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 30 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            boolean z = intValue == -1;
            if (z) {
                byte[] bArr = SdkCoreAlternateContactlessPaymentDataImpl;
                if (bArr != null) {
                    $10 = ($11 + 51) % 128;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = $10 + 111;
                        $11 = i8 % 128;
                        if (i8 % i6 == 0) {
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i7])};
                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                            if (obj2 == null) {
                                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.os.Process.getGidForName(""), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 5089, (char) android.text.TextUtils.indexOf("", "", 0))).getMethod("e", java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                            }
                            bArr2[i7] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                            i7 %= 1;
                            j = 0;
                        } else {
                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(bArr[i7])};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                            if (obj3 == null) {
                                j = 0;
                                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 5087, (char) (android.os.Process.myPid() >> 22))).getMethod("e", java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj3);
                            } else {
                                j = 0;
                            }
                            bArr2[i7] = ((java.lang.Byte) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).byteValue();
                            i7++;
                        }
                        i6 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    $11 = ($10 + 15) % 128;
                    byte[] bArr3 = SdkCoreAlternateContactlessPaymentDataImpl;
                    java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(valueOf)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 29, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                    }
                    intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue()] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
                } else {
                    intValue = (short) (((short) (getAid[i2 + ((int) (valueOf ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
                }
            }
            if (intValue > 0) {
                int i9 = $10 + 47;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    i4 = ((i2 % intValue) >> 3) / ((int) (valueOf & (-4897270311952305750L)));
                } else {
                    i4 = ((i2 + intValue) - 2) + ((int) (valueOf ^ (-4897270311952305750L)));
                }
                gettrack2constructiondata.writeReplace = i4 + i5;
                java.lang.Object[] objArr6 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(writeReplace), sb};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                if (obj5 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2364 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.os.Process.myTid() >> 22));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b((short) 0, (byte) -1, (short) 0, objArr7);
                    obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj5);
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).append(gettrack2constructiondata.values);
                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                byte[] bArr4 = SdkCoreAlternateContactlessPaymentDataImpl;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i10 = 0;
                    while (i10 < length2) {
                        int i11 = $10 + 111;
                        $11 = i11 % 128;
                        if (i11 % 2 == 0) {
                            bArr5[i10] = (byte) (bArr4[i10] | (-4897270311952305750L));
                        } else {
                            bArr5[i10] = (byte) (bArr4[i10] ^ (-4897270311952305750L));
                            i10++;
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                gettrack2constructiondata.DigitizedCardProfile = 1;
                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                    if (z2) {
                        byte[] bArr6 = SdkCoreAlternateContactlessPaymentDataImpl;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r5] ^ (-4897270311952305750L))) + s)) ^ b));
                    } else {
                        short[] sArr = getAid;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r5] ^ (-4897270311952305750L))) + s)) ^ b));
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

    static void AlternateContactlessPaymentDataJson() {
        valueOf = 1868116868;
        DigitizedCardProfile = 520368570;
        writeReplace = -307064715;
        SdkCoreAlternateContactlessPaymentDataImpl = new byte[]{-6, -23, -15, -111, -27, -7, -7, -86};
    }

    static void init$0() {
        $$a = new byte[]{70, -35, 111, 66};
        $$b = 80;
    }
}
