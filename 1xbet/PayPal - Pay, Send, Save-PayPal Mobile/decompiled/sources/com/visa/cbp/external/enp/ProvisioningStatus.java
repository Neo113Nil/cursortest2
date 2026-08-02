package com.visa.cbp.external.enp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SUCCESS' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes16.dex */
public final class ProvisioningStatus {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ com.visa.cbp.external.enp.ProvisioningStatus[] $VALUES;
    private static int BuildConfig;
    private static char ConfirmReplenishRequest;
    public static final com.visa.cbp.external.enp.ProvisioningStatus FAILURE;
    private static char ReplenishAckRequest;
    public static final com.visa.cbp.external.enp.ProvisioningStatus SUCCESS;
    private static int setTokenInfo;
    private static char valueOf;
    private static char values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = s + 4;
        int i4 = i + 117;
        int i5 = 1 - (s2 * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            int i7 = i3;
            int i8 = i7;
            i4 = i3 + (-i6);
            i3 = i8;
            int i9 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i9];
            int i10 = i4;
            i7 = i9;
            i3 = i10;
            int i82 = i7;
            i4 = i3 + (-i6);
            i3 = i82;
            int i92 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            int i922 = i3 + 1;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
            }
        }
    }

    private ProvisioningStatus(java.lang.String str, int i) {
    }

    public static com.visa.cbp.external.enp.ProvisioningStatus valueOf(java.lang.String str) {
        int i = setTokenInfo + 39;
        BuildConfig = i % 128;
        com.visa.cbp.external.enp.ProvisioningStatus provisioningStatus = (com.visa.cbp.external.enp.ProvisioningStatus) java.lang.Enum.valueOf(com.visa.cbp.external.enp.ProvisioningStatus.class, str);
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i2 = BuildConfig + 19;
        setTokenInfo = i2 % 128;
        if (i2 % 2 != 0) {
            return provisioningStatus;
        }
        throw null;
    }

    public static com.visa.cbp.external.enp.ProvisioningStatus[] values() {
        BuildConfig = (setTokenInfo + 103) % 128;
        com.visa.cbp.external.enp.ProvisioningStatus[] provisioningStatusArr = (com.visa.cbp.external.enp.ProvisioningStatus[]) $VALUES.clone();
        int i = BuildConfig + 29;
        setTokenInfo = i % 128;
        if (i % 2 != 0) {
            return provisioningStatusArr;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        setTokenInfo = 1;
        valueOf();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("恎ㇺ\udd5fQᒟᓥ\ue39d㮅", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7, objArr);
        com.visa.cbp.external.enp.ProvisioningStatus provisioningStatus = new com.visa.cbp.external.enp.ProvisioningStatus(((java.lang.String) objArr[0]).intern(), 0);
        SUCCESS = provisioningStatus;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("䠾뼈誶흵\ue46cل嶵厞", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 8, objArr2);
        com.visa.cbp.external.enp.ProvisioningStatus provisioningStatus2 = new com.visa.cbp.external.enp.ProvisioningStatus(((java.lang.String) objArr2[0]).intern(), 1);
        FAILURE = provisioningStatus2;
        $VALUES = new com.visa.cbp.external.enp.ProvisioningStatus[]{provisioningStatus, provisioningStatus2};
        int i = setTokenInfo + 87;
        BuildConfig = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + 41) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.visa.cbp.setSignature setsignature = new com.visa.cbp.setSignature();
        char[] cArr3 = new char[cArr2.length];
        setsignature.ConfirmReplenishRequest = 0;
        char[] cArr4 = new char[2];
        while (setsignature.ConfirmReplenishRequest < cArr2.length) {
            cArr4[0] = cArr2[setsignature.ConfirmReplenishRequest];
            cArr4[1] = cArr2[setsignature.ConfirmReplenishRequest + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                $11 = ($10 + 51) % 128;
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i2) ^ ((c2 << 4) + ((char) (ReplenishAckRequest ^ 7012782929194310790L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(ConfirmReplenishRequest)};
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1957494866);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (3290 - android.graphics.Color.blue(0)), 430 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.text.TextUtils.getOffsetAfter("", 0) + 43);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((short) -1, (short) 0, 1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1957494866, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    try {
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (values ^ 7012782929194310790L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(valueOf)};
                        int i4 = charValue + i2;
                        java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1957494866);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (3290 - android.graphics.Color.blue(0)), 431 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43);
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            b((short) -1, (short) 0, 1, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1957494866, obj2);
                        }
                        cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                        i2 -= 40503;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3[setsignature.ConfirmReplenishRequest] = cArr4[0];
            cArr3[setsignature.ConfirmReplenishRequest + 1] = cArr4[1];
            try {
                java.lang.Object[] objArr6 = {setsignature, setsignature};
                java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1837204720);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (58034 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1677, 25 - ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b((short) -1, (short) 0, 0, objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1837204720, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    static void valueOf() {
        valueOf = (char) 52754;
        ConfirmReplenishRequest = (char) 64348;
        values = (char) 19135;
        ReplenishAckRequest = (char) 42046;
    }

    static void init$0() {
        $$a = new byte[]{123, -35, -82, -15};
        $$b = 18;
    }
}
