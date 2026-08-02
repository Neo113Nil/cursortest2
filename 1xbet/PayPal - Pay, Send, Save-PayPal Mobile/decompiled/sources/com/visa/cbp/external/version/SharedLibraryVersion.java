package com.visa.cbp.external.version;

/* loaded from: classes16.dex */
public class SharedLibraryVersion {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ConfirmReplenishRequest;
    private static char[] ReplenishAckRequest;
    private static int values;
    private java.lang.String compoundVersion;
    private java.lang.String deviceABI;
    private java.lang.String environment;
    private java.lang.String head;
    private java.lang.String targetABI;
    private java.lang.String timestamp;
    private java.lang.String type;
    private java.lang.String version;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 4 - (s * 2);
        int i5 = 100 - i;
        int i6 = i2 * 3;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i4;
            int i9 = i7;
            int i10 = 0;
            int i11 = (-i4) + i9;
            int i12 = i8 + 1;
            i3 = i10;
            i5 = i11;
            i4 = i12;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i13 = i5;
            i8 = i4;
            i4 = bArr[i4];
            i10 = i3 + 1;
            i9 = i13;
            int i112 = (-i4) + i9;
            int i122 = i8 + 1;
            i3 = i10;
            i5 = i112;
            i4 = i122;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        }
    }

    public SharedLibraryVersion(java.lang.String str) {
        this.compoundVersion = str;
        decomposeVersion();
    }

    private void decomposeVersion() {
        ConfirmReplenishRequest = (values + 107) % 128;
        try {
            java.lang.String str = this.compoundVersion;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(false, new int[]{0, 1, 193, 0}, "\u0000", objArr);
            java.lang.String[] split = str.split(((java.lang.String) objArr[0]).intern());
            this.type = split[0];
            this.version = split[1];
            this.environment = split[2];
            this.head = split[3];
            java.lang.String str2 = split[4];
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(false, new int[]{1, 1, 148, 1}, "\u0001", objArr2);
            java.lang.String[] split2 = str2.split(((java.lang.String) objArr2[0]).intern());
            this.deviceABI = split2[0];
            this.targetABI = split2[1];
            this.timestamp = split[5];
            int i = values + 51;
            ConfirmReplenishRequest = i % 128;
            int i2 = i % 2;
            validateData();
        } catch (java.lang.Exception unused) {
            throw new com.visa.cbp.sdk.facade.exception.InvalidVersionException(com.visa.cbp.setDeviceCerts.bs64Encode);
        }
    }

    private void validateData() {
        values = (ConfirmReplenishRequest + 97) % 128;
        if (!com.visa.cbp.sdk.facade.util.UtilityFunctions.isNullOrEmpty(this.type)) {
            int i = ConfirmReplenishRequest + 23;
            values = i % 128;
            if (i % 2 != 0) {
                com.visa.cbp.sdk.facade.util.UtilityFunctions.isNullOrEmpty(this.version);
                throw new java.lang.ArithmeticException();
            }
            if (!com.visa.cbp.sdk.facade.util.UtilityFunctions.isNullOrEmpty(this.version) && !com.visa.cbp.sdk.facade.util.UtilityFunctions.isNullOrEmpty(this.environment) && !com.visa.cbp.sdk.facade.util.UtilityFunctions.isNullOrEmpty(this.head)) {
                values = (ConfirmReplenishRequest + 47) % 128;
                if (!com.visa.cbp.sdk.facade.util.UtilityFunctions.isNullOrEmpty(this.timestamp)) {
                    values = (ConfirmReplenishRequest + 113) % 128;
                    return;
                }
            }
        }
        throw new com.visa.cbp.sdk.facade.exception.InvalidVersionException(com.visa.cbp.setDeviceCerts.bs64Encode);
    }

    public java.lang.String toString() {
        int i = ConfirmReplenishRequest + 63;
        values = i % 128;
        java.lang.String str = this.compoundVersion;
        if (i % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public java.lang.String getType() {
        int i = (ConfirmReplenishRequest + 113) % 128;
        values = i;
        java.lang.String str = this.type;
        ConfirmReplenishRequest = (i + 73) % 128;
        return str;
    }

    public void setType(java.lang.String str) {
        int i = (values + 119) % 128;
        ConfirmReplenishRequest = i;
        this.type = str;
        values = (i + 117) % 128;
    }

    public java.lang.String getVersion() {
        int i = ConfirmReplenishRequest;
        values = (i + 107) % 128;
        java.lang.String str = this.version;
        int i2 = i + 15;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setVersion(java.lang.String str) {
        int i = values + 97;
        int i2 = i % 128;
        ConfirmReplenishRequest = i2;
        this.version = str;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        ConfirmReplenishRequest = i2;
    }

    public java.lang.String getEnvironment() {
        int i = ConfirmReplenishRequest + 95;
        int i2 = i % 128;
        values = i2;
        if (i % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.environment;
        int i3 = i2 + 13;
        ConfirmReplenishRequest = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setEnvironment(java.lang.String str) {
        int i = (values + 89) % 128;
        ConfirmReplenishRequest = i;
        this.environment = str;
        int i2 = i + 119;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public java.lang.String getHead() {
        int i = values;
        int i2 = i + 41;
        ConfirmReplenishRequest = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.String str = this.head;
        ConfirmReplenishRequest = (i + 49) % 128;
        return str;
    }

    public void setHead(java.lang.String str) {
        int i = (values + 115) % 128;
        ConfirmReplenishRequest = i;
        this.head = str;
        values = (i + 53) % 128;
    }

    public java.lang.String getTargetABI() {
        int i = ConfirmReplenishRequest;
        values = (i + 47) % 128;
        java.lang.String str = this.targetABI;
        values = (i + 15) % 128;
        return str;
    }

    public void setTargetABI(java.lang.String str) {
        int i = ConfirmReplenishRequest + 63;
        int i2 = i % 128;
        values = i2;
        this.targetABI = str;
        if (i % 2 != 0) {
            throw null;
        }
        int i3 = i2 + 13;
        ConfirmReplenishRequest = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public java.lang.String getDeviceABI() {
        int i = ConfirmReplenishRequest;
        values = (i + 101) % 128;
        java.lang.String str = this.deviceABI;
        int i2 = i + 103;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setDeviceABI(java.lang.String str) {
        int i = (values + 83) % 128;
        ConfirmReplenishRequest = i;
        this.deviceABI = str;
        int i2 = i + 73;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public java.lang.String getTimestamp() {
        int i = values;
        ConfirmReplenishRequest = (i + 23) % 128;
        java.lang.String str = this.timestamp;
        ConfirmReplenishRequest = (i + 61) % 128;
        return str;
    }

    public void setTimestamp(java.lang.String str) {
        int i = ConfirmReplenishRequest;
        int i2 = i + 105;
        values = i2 % 128;
        this.timestamp = str;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = i + 107;
        values = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static void a(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.visa.cbp.ReplenishResponse replenishResponse = new com.visa.cbp.ReplenishResponse();
        short s = 0;
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = ReplenishAckRequest;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                $11 = ($10 + 95) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i3];
                    objArr2[s] = java.lang.Integer.valueOf(cArr[i7]);
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-586396651);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.media.AudioTrack.getMinVolume() > f ? 1 : (android.media.AudioTrack.getMinVolume() == f ? 0 : -1)), 1701 - android.view.KeyEvent.keyCodeFromString(""), (android.widget.ExpandableListView.getPackedPositionForGroup(s) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(s) == 0L ? 0 : -1)) + 19);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(s, s, s, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[s], java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-586396651, obj);
                    }
                    cArr2[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i7++;
                    s = 0;
                    i3 = 1;
                    f = 0.0f;
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
        char[] cArr3 = new char[i4];
        java.lang.System.arraycopy(cArr, i2, cArr3, 0, i4);
        if (bArr2 != null) {
            char[] cArr4 = new char[i4];
            replenishResponse.ConfirmReplenishRequest = 0;
            char c = 0;
            while (replenishResponse.ConfirmReplenishRequest < i4) {
                if (bArr2[replenishResponse.ConfirmReplenishRequest] == 1) {
                    int i8 = replenishResponse.ConfirmReplenishRequest;
                    try {
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[replenishResponse.ConfirmReplenishRequest]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-718164716);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1655, 20 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            b((short) 0, 1, 0, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-718164716, obj2);
                        }
                        cArr4[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i9 = replenishResponse.ConfirmReplenishRequest;
                    try {
                        java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[replenishResponse.ConfirmReplenishRequest]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1678831086);
                        if (obj3 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 21017), android.view.View.combineMeasuredStates(0, 0) + 347, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 32);
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            b((short) 0, 3, 0, objArr7);
                            obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1678831086, obj3);
                        }
                        cArr4[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c = cArr4[replenishResponse.ConfirmReplenishRequest];
                try {
                    java.lang.Object[] objArr8 = {replenishResponse, replenishResponse};
                    java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(116191609);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (59972 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1742, android.view.KeyEvent.normalizeMetaState(0) + 40)).getMethod(util.h.xy.cb.b.f1091, java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(116191609, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                } catch (java.lang.Throwable th4) {
                    java.lang.Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            i = 0;
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i10 = i4 - i6;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i10, i6);
            java.lang.System.arraycopy(cArr5, i6, cArr3, 0, i10);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i4];
            while (true) {
                replenishResponse.ConfirmReplenishRequest = i;
                if (replenishResponse.ConfirmReplenishRequest >= i4) {
                    break;
                }
                $11 = ($10 + 47) % 128;
                cArr6[replenishResponse.ConfirmReplenishRequest] = cArr3[(i4 - replenishResponse.ConfirmReplenishRequest) - 1];
                i = replenishResponse.ConfirmReplenishRequest + 1;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            $10 = ($11 + 79) % 128;
            int i11 = 0;
            while (true) {
                replenishResponse.ConfirmReplenishRequest = i11;
                if (replenishResponse.ConfirmReplenishRequest >= i4) {
                    break;
                }
                $10 = ($11 + 73) % 128;
                cArr3[replenishResponse.ConfirmReplenishRequest] = (char) (cArr3[replenishResponse.ConfirmReplenishRequest] - iArr[2]);
                i11 = replenishResponse.ConfirmReplenishRequest + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{40, 102, 18, -6};
        $$b = 14;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        ConfirmReplenishRequest = 1;
        ReplenishAckRequest = new char[]{26587, 26581};
    }
}
