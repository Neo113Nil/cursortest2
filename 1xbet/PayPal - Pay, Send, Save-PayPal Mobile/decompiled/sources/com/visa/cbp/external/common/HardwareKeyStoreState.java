package com.visa.cbp.external.common;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DID_NOT_CHECK' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes16.dex */
public final class HardwareKeyStoreState {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ com.visa.cbp.external.common.HardwareKeyStoreState[] $VALUES;
    private static short[] BuildConfig;
    private static int ConfirmReplenishRequest;
    public static final com.visa.cbp.external.common.HardwareKeyStoreState DID_NOT_CHECK;
    public static final com.visa.cbp.external.common.HardwareKeyStoreState HAS_HARDWARE_KEY_STORE;
    public static final com.visa.cbp.external.common.HardwareKeyStoreState NO_HARDWARE_KEY_STORE;
    private static byte[] ReplenishAckRequest;
    private static int getTokenInfo;
    private static final android.util.SparseArray<com.visa.cbp.external.common.HardwareKeyStoreState> mapping;
    private static int setTokenInfo;
    private static int valueOf;
    private static int values;
    private int type;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 3 - (s * 4);
        int i4 = b2 * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        if (bArr == null) {
            int i6 = i5;
            i2 = i3;
            i = 0;
            i3 += -i6;
            bArr2[i] = (byte) i3;
            i2++;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i6 = bArr[i2];
            i3 += -i6;
            bArr2[i] = (byte) i3;
            i2++;
            if (i == i5) {
            }
        } else {
            i = 0;
            i3 = 121 - (b * 8);
            i2 = i3;
            bArr2[i] = (byte) i3;
            i2++;
            if (i == i5) {
            }
        }
    }

    public static com.visa.cbp.external.common.HardwareKeyStoreState valueOf(java.lang.String str) {
        int i = setTokenInfo + 99;
        getTokenInfo = i % 128;
        com.visa.cbp.external.common.HardwareKeyStoreState hardwareKeyStoreState = (com.visa.cbp.external.common.HardwareKeyStoreState) java.lang.Enum.valueOf(com.visa.cbp.external.common.HardwareKeyStoreState.class, str);
        if (i % 2 != 0) {
            return hardwareKeyStoreState;
        }
        throw null;
    }

    public static com.visa.cbp.external.common.HardwareKeyStoreState[] values() {
        int i = setTokenInfo + 9;
        getTokenInfo = i % 128;
        com.visa.cbp.external.common.HardwareKeyStoreState[] hardwareKeyStoreStateArr = $VALUES;
        if (i % 2 != 0) {
            return (com.visa.cbp.external.common.HardwareKeyStoreState[]) hardwareKeyStoreStateArr.clone();
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        setTokenInfo = 0;
        getTokenInfo = 1;
        ReplenishAckRequest();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((-718123195) - (android.os.Process.myPid() >> 22), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 40868, (short) ((-119) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), android.view.KeyEvent.normalizeMetaState(0) - 48, (byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 48), objArr);
        com.visa.cbp.external.common.HardwareKeyStoreState hardwareKeyStoreState = new com.visa.cbp.external.common.HardwareKeyStoreState(((java.lang.String) objArr[0]).intern(), 0, 0);
        DID_NOT_CHECK = hardwareKeyStoreState;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((-718123191) - android.view.View.MeasureSpec.getSize(0), android.view.MotionEvent.axisFromString("") - 1357946726, (short) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 74), android.text.TextUtils.indexOf("", "", 0, 0) - 48, (byte) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 5), objArr2);
        com.visa.cbp.external.common.HardwareKeyStoreState hardwareKeyStoreState2 = new com.visa.cbp.external.common.HardwareKeyStoreState(((java.lang.String) objArr2[0]).intern(), 1, 1);
        HAS_HARDWARE_KEY_STORE = hardwareKeyStoreState2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 718123184, android.view.View.resolveSize(0, 0) - 1357946705, (short) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 106), (-49) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) ((-126) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr3);
        com.visa.cbp.external.common.HardwareKeyStoreState hardwareKeyStoreState3 = new com.visa.cbp.external.common.HardwareKeyStoreState(((java.lang.String) objArr3[0]).intern(), 2, 2);
        NO_HARDWARE_KEY_STORE = hardwareKeyStoreState3;
        $VALUES = new com.visa.cbp.external.common.HardwareKeyStoreState[]{hardwareKeyStoreState, hardwareKeyStoreState2, hardwareKeyStoreState3};
        mapping = new android.util.SparseArray<>();
        com.visa.cbp.external.common.HardwareKeyStoreState[] values2 = values();
        int i = setTokenInfo + 85;
        getTokenInfo = i % 128;
        int i2 = i % 2;
        for (com.visa.cbp.external.common.HardwareKeyStoreState hardwareKeyStoreState4 : values2) {
            getTokenInfo = (setTokenInfo + 29) % 128;
            mapping.put(hardwareKeyStoreState4.getValue(), hardwareKeyStoreState4);
        }
    }

    private HardwareKeyStoreState(java.lang.String str, int i, int i2) {
        this.type = i2;
    }

    public static com.visa.cbp.external.common.HardwareKeyStoreState getHardwareKeyStoreState(int i) {
        int i2 = getTokenInfo + 91;
        setTokenInfo = i2 % 128;
        if (i2 % 2 != 0) {
            mapping.get(i);
            throw null;
        }
        com.visa.cbp.external.common.HardwareKeyStoreState hardwareKeyStoreState = mapping.get(i);
        int i3 = setTokenInfo + 73;
        getTokenInfo = i3 % 128;
        if (i3 % 2 != 0) {
            return hardwareKeyStoreState;
        }
        throw new java.lang.ArithmeticException();
    }

    public final int getValue() {
        int i = getTokenInfo + 45;
        setTokenInfo = i % 128;
        if (i % 2 == 0) {
            return this.type;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, short s, int i3, byte b, java.lang.Object[] objArr) {
        long j;
        int length;
        byte[] bArr;
        int i4;
        com.visa.cbp.getEncryptionMetaData getencryptionmetadata = new com.visa.cbp.getEncryptionMetaData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(ConfirmReplenishRequest)};
            java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1873336951);
            if (obj == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 205, (android.os.Process.myTid() >> 22) + 19);
                byte b2 = (byte) ($$b & 1);
                byte b3 = (byte) (b2 - 1);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                b(b2, b3, b3, objArr3);
                obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1873336951, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            int i5 = intValue == -1 ? 1 : 0;
            if (i5 != 0) {
                byte[] bArr2 = ReplenishAckRequest;
                long j2 = 0;
                if (bArr2 != null) {
                    int i6 = $10;
                    $11 = (i6 + 99) % 128;
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    $11 = (i6 + 63) % 128;
                    int i7 = 0;
                    while (i7 < length2) {
                        try {
                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(bArr2[i7])};
                            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1365177175);
                            if (obj2 == null) {
                                obj2 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1838 - (android.os.SystemClock.uptimeMillis() > j2 ? 1 : (android.os.SystemClock.uptimeMillis() == j2 ? 0 : -1)), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)) + 24)).getMethod(lib.android.paypal.com.magnessdk.g.n2, java.lang.Integer.TYPE);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1365177175, obj2);
                            }
                            bArr3[i7] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).byteValue();
                            i7++;
                            j2 = 0;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 == null) {
                    j = 2302704661859114486L;
                    intValue = (short) (((short) (BuildConfig[i2 + ((int) (valueOf ^ 2302704661859114486L))] ^ 2302704661859114486L)) + ((int) (ConfirmReplenishRequest ^ 2302704661859114486L)));
                    if (intValue > 0) {
                        getencryptionmetadata.values = ((i2 + intValue) - 2) + ((int) (valueOf ^ j)) + i5;
                        try {
                            java.lang.Object[] objArr5 = {getencryptionmetadata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(values), sb};
                            java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-437174028);
                            if (obj3 == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.graphics.Color.alpha(0), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1170, 20 - android.view.KeyEvent.keyCodeFromString(""));
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                b((byte) 0, (byte) 0, (short) 0, objArr6);
                                obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-437174028, obj3);
                            }
                            ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj3).invoke(null, objArr5)).append(getencryptionmetadata.valueOf);
                            getencryptionmetadata.ConfirmReplenishRequest = getencryptionmetadata.valueOf;
                            byte[] bArr4 = ReplenishAckRequest;
                            if (bArr4 != null) {
                                int i8 = $10 + 35;
                                $11 = i8 % 128;
                                if (i8 % 2 == 0) {
                                    length = bArr4.length;
                                    bArr = new byte[length];
                                    i4 = 1;
                                } else {
                                    length = bArr4.length;
                                    bArr = new byte[length];
                                    i4 = 0;
                                }
                                while (i4 < length) {
                                    $10 = ($11 + 19) % 128;
                                    bArr[i4] = (byte) (bArr4[i4] ^ 2302704661859114486L);
                                    i4++;
                                }
                                bArr4 = bArr;
                            }
                            boolean z = bArr4 != null;
                            getencryptionmetadata.ReplenishAckRequest = 1;
                            while (getencryptionmetadata.ReplenishAckRequest < intValue) {
                                if (z) {
                                    byte[] bArr5 = ReplenishAckRequest;
                                    getencryptionmetadata.values = getencryptionmetadata.values - 1;
                                    getencryptionmetadata.valueOf = (char) (getencryptionmetadata.ConfirmReplenishRequest + (((byte) (((byte) (bArr5[r7] ^ 2302704661859114486L)) + s)) ^ b));
                                } else {
                                    short[] sArr = BuildConfig;
                                    getencryptionmetadata.values = getencryptionmetadata.values - 1;
                                    getencryptionmetadata.valueOf = (char) (getencryptionmetadata.ConfirmReplenishRequest + (((short) (((short) (sArr[r7] ^ 2302704661859114486L)) + s)) ^ b));
                                }
                                sb.append(getencryptionmetadata.valueOf);
                                getencryptionmetadata.ConfirmReplenishRequest = getencryptionmetadata.valueOf;
                                getencryptionmetadata.ReplenishAckRequest++;
                            }
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    objArr[0] = sb.toString();
                }
                $10 = ($11 + 35) % 128;
                byte[] bArr6 = ReplenishAckRequest;
                try {
                    java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(valueOf)};
                    java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1873336951);
                    if (obj4 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.widget.ExpandableListView.getPackedPositionGroup(0L), 205 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 19 - (android.view.ViewConfiguration.getTapTimeout() >> 16));
                        byte b4 = (byte) ($$b & 1);
                        byte b5 = (byte) (b4 - 1);
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        b(b4, b5, b5, objArr8);
                        obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1873336951, obj4);
                    }
                    intValue = (byte) (((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue()] ^ 2302704661859114486L)) + ((int) (ConfirmReplenishRequest ^ 2302704661859114486L)));
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            j = 2302704661859114486L;
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    static void init$0() {
        $$a = new byte[]{94, -76, 75, 18};
        $$b = 55;
    }

    static void ReplenishAckRequest() {
        valueOf = -1068563838;
        ConfirmReplenishRequest = -1866490407;
        values = -1166922487;
        ReplenishAckRequest = new byte[]{40, -71, 83, 84, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 93, -90, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -80, 66, -74, 86, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 17, -55, -71, -79, -89, -54, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -86, -80, -62, -112, -55, -105, com.visa.cbp.getEncExpo.startTransaction, -87, -56, -105, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, com.visa.cbp.getEncExpo.kernelVersion, -94, -88, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 16, -2, -18, -26, -32, -3, -21, -35, -25, -11, -57, -2, -48, -9, -34, -1, -48, -8, 8, -47, -32};
    }
}
