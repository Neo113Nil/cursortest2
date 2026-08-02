package com.payair.hce;

/* loaded from: classes4.dex */
public class setShowSoftInputOnFocus extends java.util.concurrent.ConcurrentHashMap<java.lang.Class, com.payair.hce.setTextMetricsParams> {
    private static int values = 0;
    private static int writeReplace = 1;
    private com.payair.hce.setShowSoftInputOnFocus DigitizedCardProfile;
    public boolean valueOf;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i;
        int i6 = ~i3;
        int i7 = (i * 495) + (i2 * (-493)) + ((i | i4) * (-988)) + ((i2 | i5 | i6) * 494) + (((~(i | i2)) | (~(i2 | i6)) | (~(i4 | i5))) * 494);
        return i7 != 1 ? i7 != 2 ? valueOf(objArr) : AlternateContactlessPaymentDataJson(objArr) : values(objArr);
    }

    public setShowSoftInputOnFocus() {
    }

    public setShowSoftInputOnFocus(com.payair.hce.setShowSoftInputOnFocus setshowsoftinputonfocus) {
        this.DigitizedCardProfile = setshowsoftinputonfocus;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2;
        com.payair.hce.setShowSoftInputOnFocus setshowsoftinputonfocus = (com.payair.hce.setShowSoftInputOnFocus) objArr[0];
        java.lang.Object obj = objArr[1];
        com.payair.hce.setShowSoftInputOnFocus.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = setshowsoftinputonfocus.new AlternateContactlessPaymentDataJson();
        if (obj == null) {
            int i = values;
            int i2 = i & 43;
            int i3 = ((i ^ 43) | i2) << 1;
            int i4 = -((i | 43) & (~i2));
            writeReplace = ((i3 & i4) + (i4 | i3)) % 128;
            cls = java.lang.Void.TYPE;
            int i5 = values;
            int i6 = (i5 & (-40)) | ((~i5) & 39);
            int i7 = -(-((i5 & 39) << 1));
            writeReplace = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
        } else {
            cls = obj.getClass();
            int i8 = writeReplace;
            int i9 = i8 & 11;
            int i10 = (i8 ^ 11) | i9;
            values = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
        }
        com.payair.hce.setTextMetricsParams settextmetricsparams = (com.payair.hce.setTextMetricsParams) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setshowsoftinputonfocus, cls, cls, alternateContactlessPaymentDataJson}, 1341236240, -1341236240, java.lang.System.identityHashCode(setshowsoftinputonfocus));
        if (settextmetricsparams == null) {
            int i11 = ((-2) - (~(values + 86))) % 128;
            writeReplace = i11;
            com.payair.hce.setShowSoftInputOnFocus setshowsoftinputonfocus2 = setshowsoftinputonfocus.DigitizedCardProfile;
            if (setshowsoftinputonfocus2 != null) {
                int i12 = i11 | 73;
                int i13 = i12 << 1;
                int i14 = -(i12 & (~(i11 & 73)));
                int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
                values = i15 % 128;
                if (i15 % 2 != 0) {
                    throw null;
                }
                settextmetricsparams = (com.payair.hce.setTextMetricsParams) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setshowsoftinputonfocus2, obj}, 1799903997, -1799903995, java.lang.System.identityHashCode(setshowsoftinputonfocus2));
                if (settextmetricsparams != null) {
                    int i16 = writeReplace;
                    values = (((i16 | 101) << 1) - (i16 ^ 101)) % 128;
                    if (obj == null) {
                        values = ((i16 & 23) + (i16 | 23)) % 128;
                        cls2 = java.lang.Void.TYPE;
                        int i17 = values;
                        writeReplace = (((((i17 ^ 125) | (i17 & 125)) << 1) - (~(-((i17 & (-126)) | ((~i17) & 125))))) - 1) % 128;
                    } else {
                        cls2 = obj.getClass();
                        int i18 = writeReplace;
                        int i19 = i18 ^ 21;
                        int i20 = ((i18 & 21) | i19) << 1;
                        int i21 = -i19;
                        int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
                        values = i22 % 128;
                        if (i22 % 2 != 0) {
                            int i23 = 2 / 3;
                        }
                    }
                    int i24 = values;
                    int i25 = i24 & 23;
                    int i26 = (i24 | 23) & (~i25);
                    int i27 = i25 << 1;
                    writeReplace = (((i26 | i27) << 1) - (i26 ^ i27)) % 128;
                }
            }
        }
        if (!((java.lang.Boolean) com.payair.hce.setShowSoftInputOnFocus.AlternateContactlessPaymentDataJson.values(new java.lang.Object[]{alternateContactlessPaymentDataJson}, 1373884784, -1373884783, java.lang.System.identityHashCode(alternateContactlessPaymentDataJson))).booleanValue()) {
            int i28 = values + 121;
            writeReplace = i28 % 128;
            if (i28 % 2 == 0) {
                throw null;
            }
            int i29 = values;
            writeReplace = (((i29 & (-30)) | ((~i29) & 29)) + ((i29 & 29) << 1)) % 128;
        }
        int i30 = writeReplace;
        int i31 = i30 & 85;
        int i32 = ((i30 | 85) & (~i31)) + (i31 << 1);
        values = i32 % 128;
        if (i32 % 2 == 0) {
            return settextmetricsparams;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setShowSoftInputOnFocus setshowsoftinputonfocus = (com.payair.hce.setShowSoftInputOnFocus) objArr[0];
        java.lang.Class cls = (java.lang.Class) objArr[1];
        java.lang.Class cls2 = (java.lang.Class) objArr[2];
        com.payair.hce.setShowSoftInputOnFocus.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = (com.payair.hce.setShowSoftInputOnFocus.AlternateContactlessPaymentDataJson) objArr[3];
        while (cls != null) {
            if (setshowsoftinputonfocus.containsKey(cls)) {
                int i = values;
                int i2 = ((i | 57) << 1) - (i ^ 57);
                int i3 = i2 % 128;
                writeReplace = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (cls != cls2) {
                    int i4 = i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    values = ((((i3 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i4) << 1) - i4) % 128;
                    com.payair.hce.setShowSoftInputOnFocus.AlternateContactlessPaymentDataJson.values(new java.lang.Object[]{alternateContactlessPaymentDataJson}, -616731339, 616731339, java.lang.System.identityHashCode(alternateContactlessPaymentDataJson));
                    int i5 = writeReplace;
                    int i6 = ((i5 ^ 7) | (i5 & 7)) << 1;
                    int i7 = -((i5 & (-8)) | ((~i5) & 7));
                    values = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
                }
                com.payair.hce.setTextMetricsParams settextmetricsparams = (com.payair.hce.setTextMetricsParams) setshowsoftinputonfocus.get(cls);
                int i8 = values;
                int i9 = i8 & 87;
                int i10 = (i8 | 87) & (~i9);
                int i11 = -(-(i9 << 1));
                writeReplace = ((i10 & i11) + (i10 | i11)) % 128;
                return settextmetricsparams;
            }
            if (cls.isArray()) {
                int i12 = values;
                writeReplace = (((i12 ^ 68) + ((i12 & 68) << 1)) - 1) % 128;
                com.payair.hce.setShowSoftInputOnFocus.AlternateContactlessPaymentDataJson.values(new java.lang.Object[]{alternateContactlessPaymentDataJson}, -616731339, 616731339, java.lang.System.identityHashCode(alternateContactlessPaymentDataJson));
                com.payair.hce.setTextMetricsParams settextmetricsparams2 = (com.payair.hce.setTextMetricsParams) setshowsoftinputonfocus.get(java.util.Arrays.class);
                int i13 = writeReplace;
                int i14 = i13 ^ 87;
                int i15 = ((i13 & 87) | i14) << 1;
                int i16 = -i14;
                values = ((i15 & i16) + (i15 | i16)) % 128;
                return settextmetricsparams2;
            }
            java.lang.Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            int i17 = writeReplace;
            int i18 = i17 & 119;
            int i19 = (i17 ^ 119) | i18;
            values = (((i18 | i19) << 1) - (i19 ^ i18)) % 128;
            int i20 = 0;
            while (i20 < length) {
                int i21 = values;
                int i22 = ((i21 & (-10)) | ((~i21) & 9)) + ((i21 & 9) << 1);
                writeReplace = i22 % 128;
                if (i22 % 2 == 0) {
                    throw null;
                }
                com.payair.hce.setTextMetricsParams settextmetricsparams3 = (com.payair.hce.setTextMetricsParams) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setshowsoftinputonfocus, interfaces[i20], cls2, alternateContactlessPaymentDataJson}, 1341236240, -1341236240, java.lang.System.identityHashCode(setshowsoftinputonfocus));
                if (settextmetricsparams3 != null) {
                    values = (writeReplace + 101) % 128;
                    return settextmetricsparams3;
                }
                int i23 = i20 & 1;
                i20 = (((i20 ^ 1) | i23) << 1) - ((i20 | 1) & (~i23));
                values = (writeReplace + 79) % 128;
            }
            cls = cls.getSuperclass();
            int i24 = writeReplace + 107;
            values = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = values;
        int i27 = ((i26 ^ 91) | (i26 & 91)) << 1;
        int i28 = -((i26 & (-92)) | ((~i26) & 91));
        int i29 = (((i27 | i28) << 1) - (i28 ^ i27)) % 128;
        writeReplace = i29;
        int i30 = i29 & 7;
        int i31 = (i29 | 7) & (~i30);
        int i32 = -(-(i30 << 1));
        values = ((i31 ^ i32) + ((i32 & i31) << 1)) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setShowSoftInputOnFocus setshowsoftinputonfocus = (com.payair.hce.setShowSoftInputOnFocus) objArr[0];
        java.lang.Class cls = (java.lang.Class) objArr[1];
        com.payair.hce.setTextMetricsParams settextmetricsparams = (com.payair.hce.setTextMetricsParams) objArr[2];
        int i = (writeReplace + 11) % 128;
        values = i;
        if (!setshowsoftinputonfocus.valueOf) {
            int i2 = i + 17;
            writeReplace = i2 % 128;
            if (i2 % 2 != 0) {
                setshowsoftinputonfocus.put(cls, settextmetricsparams);
            } else {
                setshowsoftinputonfocus.put(cls, settextmetricsparams);
                throw null;
            }
        }
        writeReplace = (values + 73) % 128;
        return settextmetricsparams;
    }

    final class AlternateContactlessPaymentDataJson {
        private static int AlternateContactlessPaymentDataJson = 1;
        private static int valueOf;
        private boolean DigitizedCardProfile;

        public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
            int i4 = ~i2;
            int i5 = ~i3;
            int i6 = i4 | i5;
            if ((i * 51) + (i2 * (-49)) + ((i | i3) * (-50)) + (((~((~i) | i4 | i3)) | (~(i6 | i))) * 50) + (((~(i | i4)) | (~i6) | (~(i | i5))) * 50) == 1) {
                return writeReplace(objArr);
            }
            com.payair.hce.setShowSoftInputOnFocus.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = (com.payair.hce.setShowSoftInputOnFocus.AlternateContactlessPaymentDataJson) objArr[0];
            int i7 = AlternateContactlessPaymentDataJson;
            int i8 = ((i7 ^ 61) | (i7 & 61)) << 1;
            int i9 = -((i7 & (-62)) | ((~i7) & 61));
            int i10 = (((i8 | i9) << 1) - (i9 ^ i8)) % 128;
            valueOf = i10;
            alternateContactlessPaymentDataJson.DigitizedCardProfile = false;
            AlternateContactlessPaymentDataJson = (i10 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            return null;
        }

        AlternateContactlessPaymentDataJson() {
        }

        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
            com.payair.hce.setShowSoftInputOnFocus.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = (com.payair.hce.setShowSoftInputOnFocus.AlternateContactlessPaymentDataJson) objArr[0];
            int i = AlternateContactlessPaymentDataJson + 119;
            valueOf = i % 128;
            boolean z = alternateContactlessPaymentDataJson.DigitizedCardProfile;
            if (i % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            AlternateContactlessPaymentDataJson = (((r1 & 98) + (r1 | 98)) - 1) % 128;
            return java.lang.Boolean.valueOf(z);
        }

        public final void valueOf() {
            values(new java.lang.Object[]{this}, -616731339, 616731339, java.lang.System.identityHashCode(this));
        }

        public final boolean DigitizedCardProfile() {
            return ((java.lang.Boolean) values(new java.lang.Object[]{this}, 1373884784, -1373884783, java.lang.System.identityHashCode(this))).booleanValue();
        }
    }

    public final com.payair.hce.setTextMetricsParams valueOf(java.lang.Class cls, com.payair.hce.setTextMetricsParams settextmetricsparams) {
        return (com.payair.hce.setTextMetricsParams) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, cls, settextmetricsparams}, 114430812, -114430811, java.lang.System.identityHashCode(this));
    }

    private com.payair.hce.setTextMetricsParams AlternateContactlessPaymentDataJson(java.lang.Class cls, java.lang.Class cls2, com.payair.hce.setShowSoftInputOnFocus.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson) {
        return (com.payair.hce.setTextMetricsParams) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, cls, cls2, alternateContactlessPaymentDataJson}, 1341236240, -1341236240, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setTextMetricsParams AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        return (com.payair.hce.setTextMetricsParams) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, obj}, 1799903997, -1799903995, java.lang.System.identityHashCode(this));
    }
}
