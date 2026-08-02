package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class DeviceInfo {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static char[] ConfirmReplenishRequest;
    private static int valueOf;
    private java.lang.String deviceBrand;
    private java.lang.String deviceIDType;
    private java.lang.String deviceManufacturer;
    private java.lang.String deviceModel;
    private java.lang.String deviceName;
    private java.lang.String deviceType;
    private java.lang.String hostDeviceID;
    private java.lang.String osBuildID;
    private java.lang.String osType;
    private java.lang.String osVersion;
    private java.lang.String phoneNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 3 - (i * 2);
        int i4 = s * 4;
        int i5 = 100 - b;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = i3;
            int i8 = 0;
            int i9 = (-i3) + i6;
            i2 = i8;
            int i10 = i7;
            i5 = i9;
            i3 = i10;
            int i11 = i3 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i5;
            i7 = i11;
            i3 = bArr[i11];
            i8 = i2 + 1;
            i6 = i12;
            int i92 = (-i3) + i6;
            i2 = i8;
            int i102 = i7;
            i5 = i92;
            i3 = i102;
            int i112 = i3 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            int i1122 = i3 + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'PHONE' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes16.dex */
    static final class DeviceType {
        public static final byte[] $$a = null;
        public static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static final /* synthetic */ com.visa.cbp.external.common.DeviceInfo.DeviceType[] $VALUES;
        private static int BuildConfig;
        private static int ConfirmReplenishRequest;
        public static final com.visa.cbp.external.common.DeviceInfo.DeviceType PC;
        public static final com.visa.cbp.external.common.DeviceInfo.DeviceType PHONE;
        public static final com.visa.cbp.external.common.DeviceInfo.DeviceType PHONE_TABLET;
        private static int ReplenishAckRequest;
        public static final com.visa.cbp.external.common.DeviceInfo.DeviceType TABLET;
        public static final com.visa.cbp.external.common.DeviceInfo.DeviceType TV;
        public static final com.visa.cbp.external.common.DeviceInfo.DeviceType WATCH;

        private static void b(short s, int i, int i2, java.lang.Object[] objArr) {
            int i3 = (s * 3) + 4;
            int i4 = 114 - (i2 * 4);
            int i5 = i * 2;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[1 - i5];
            int i6 = 0 - i5;
            int i7 = -1;
            if (bArr == null) {
                i4 += -i6;
                i3++;
            }
            while (true) {
                i7++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                } else {
                    i4 += -bArr[i3];
                    i3++;
                }
            }
        }

        private DeviceType(java.lang.String str, int i) {
        }

        public static com.visa.cbp.external.common.DeviceInfo.DeviceType valueOf(java.lang.String str) {
            ReplenishAckRequest = (BuildConfig + 91) % 128;
            com.visa.cbp.external.common.DeviceInfo.DeviceType deviceType = (com.visa.cbp.external.common.DeviceInfo.DeviceType) java.lang.Enum.valueOf(com.visa.cbp.external.common.DeviceInfo.DeviceType.class, str);
            ReplenishAckRequest = (BuildConfig + 79) % 128;
            return deviceType;
        }

        public static com.visa.cbp.external.common.DeviceInfo.DeviceType[] values() {
            int i = BuildConfig + 27;
            ReplenishAckRequest = i % 128;
            if (i % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            com.visa.cbp.external.common.DeviceInfo.DeviceType[] deviceTypeArr = (com.visa.cbp.external.common.DeviceInfo.DeviceType[]) $VALUES.clone();
            int i2 = BuildConfig + 95;
            ReplenishAckRequest = i2 % 128;
            if (i2 % 2 == 0) {
                return deviceTypeArr;
            }
            throw new java.lang.ArithmeticException();
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            ReplenishAckRequest = 0;
            BuildConfig = 1;
            valueOf();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(true, "\u0003\u0004�\u0005\ufffa", 5 - android.view.View.resolveSize(0, 0), android.text.TextUtils.indexOf("", "", 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4, objArr);
            com.visa.cbp.external.common.DeviceInfo.DeviceType deviceType = new com.visa.cbp.external.common.DeviceInfo.DeviceType(((java.lang.String) objArr[0]).intern(), 0);
            PHONE = deviceType;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(false, "\u0002\ufffb\n\n\ufff7\ufff8", 7 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 220 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 3 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
            com.visa.cbp.external.common.DeviceInfo.DeviceType deviceType2 = new com.visa.cbp.external.common.DeviceInfo.DeviceType(((java.lang.String) objArr2[0]).intern(), 1);
            TABLET = deviceType2;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(true, "\u0002\u0003￼\u0004\b\ufff9\u0000\ufff6\ufff5\b\u0013\ufff9", 12 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 223 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 4 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr3);
            com.visa.cbp.external.common.DeviceInfo.DeviceType deviceType3 = new com.visa.cbp.external.common.DeviceInfo.DeviceType(((java.lang.String) objArr3[0]).intern(), 2);
            PHONE_TABLET = deviceType3;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(false, "\ufffa\u0007", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 1 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
            com.visa.cbp.external.common.DeviceInfo.DeviceType deviceType4 = new com.visa.cbp.external.common.DeviceInfo.DeviceType(((java.lang.String) objArr4[0]).intern(), 3);
            PC = deviceType4;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(true, "\ufff8\t\ufff6\f�", android.graphics.Color.red(0) + 5, 221 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.graphics.Color.blue(0) + 4, objArr5);
            com.visa.cbp.external.common.DeviceInfo.DeviceType deviceType5 = new com.visa.cbp.external.common.DeviceInfo.DeviceType(((java.lang.String) objArr5[0]).intern(), 4);
            WATCH = deviceType5;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(false, "\uffff\u0001", android.view.KeyEvent.getDeadChar(0, 0) + 2, 230 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 1 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr6);
            com.visa.cbp.external.common.DeviceInfo.DeviceType deviceType6 = new com.visa.cbp.external.common.DeviceInfo.DeviceType(((java.lang.String) objArr6[0]).intern(), 5);
            TV = deviceType6;
            $VALUES = new com.visa.cbp.external.common.DeviceInfo.DeviceType[]{deviceType, deviceType2, deviceType3, deviceType4, deviceType5, deviceType6};
            BuildConfig = (ReplenishAckRequest + 115) % 128;
        }

        private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
            char[] cArr;
            long j;
            if (str != null) {
                cArr = str.toCharArray();
                $10 = ($11 + 85) % 128;
            } else {
                cArr = str;
            }
            char[] cArr2 = cArr;
            com.visa.cbp.setTvls settvls = new com.visa.cbp.setTvls();
            char[] cArr3 = new char[i];
            settvls.BuildConfig = 0;
            while (true) {
                j = 0;
                if (settvls.BuildConfig >= i) {
                    break;
                }
                $11 = ($10 + 5) % 128;
                settvls.values = cArr2[settvls.BuildConfig];
                cArr3[settvls.BuildConfig] = (char) (i2 + settvls.values);
                int i4 = settvls.BuildConfig;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4]), java.lang.Integer.valueOf(ConfirmReplenishRequest)};
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1140899376);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (17629 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 315 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 32);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((short) 0, 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1140899376, obj);
                    }
                    cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    try {
                        java.lang.Object[] objArr4 = {settvls, settvls};
                        java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1304551840);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (30880 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 1970 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 28 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0))).getMethod("p", java.lang.Object.class, java.lang.Object.class);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1304551840, obj2);
                        }
                        ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                        $11 = ($10 + 17) % 128;
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
            if (i3 > 0) {
                settvls.ReplenishAckRequest = i3;
                char[] cArr4 = new char[i];
                java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i);
                java.lang.System.arraycopy(cArr4, 0, cArr3, i - settvls.ReplenishAckRequest, settvls.ReplenishAckRequest);
                java.lang.System.arraycopy(cArr4, settvls.ReplenishAckRequest, cArr3, 0, i - settvls.ReplenishAckRequest);
            }
            if (z) {
                char[] cArr5 = new char[i];
                settvls.BuildConfig = 0;
                while (settvls.BuildConfig < i) {
                    cArr5[settvls.BuildConfig] = cArr3[(i - settvls.BuildConfig) - 1];
                    try {
                        java.lang.Object[] objArr5 = {settvls, settvls};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1304551840);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 30832), 1970 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 30 - (android.os.SystemClock.elapsedRealtime() > j ? 1 : (android.os.SystemClock.elapsedRealtime() == j ? 0 : -1)))).getMethod("p", java.lang.Object.class, java.lang.Object.class);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1304551840, obj3);
                        }
                        ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                        $10 = ($11 + 23) % 128;
                        j = 0;
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                cArr3 = cArr5;
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        static void valueOf() {
            ConfirmReplenishRequest = -178298161;
        }

        static void init$0() {
            $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.google.common.base.Ascii.SI, -9, com.google.common.base.Ascii.RS};
            $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SecureElement' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes16.dex */
    static final class DeviceIDType {
        public static final byte[] $$a = null;
        public static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static final /* synthetic */ com.visa.cbp.external.common.DeviceInfo.DeviceIDType[] $VALUES;
        private static int BuildConfig;
        public static final com.visa.cbp.external.common.DeviceInfo.DeviceIDType Derived;
        private static int ReplenishAckRequest;
        public static final com.visa.cbp.external.common.DeviceInfo.DeviceIDType SecureElement;
        public static final com.visa.cbp.external.common.DeviceInfo.DeviceIDType TEE;
        private static char[] valueOf;
        private static long values;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(byte b, int i, int i2, java.lang.Object[] objArr) {
            int i3;
            int i4 = i2 * 3;
            int i5 = i + 104;
            byte[] bArr = $$a;
            int i6 = 3 - (b * 4);
            byte[] bArr2 = new byte[1 - i4];
            if (bArr == null) {
                int i7 = i5;
                int i8 = 0;
                int i9 = i6;
                int i10 = (-i6) + i7;
                i3 = i8;
                int i11 = i9;
                i5 = i10;
                i6 = i11;
                bArr2[i3] = (byte) i5;
                int i12 = i6 + 1;
                if (i3 == 0 - i4) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                int i13 = i5;
                i9 = i12;
                i6 = bArr[i12];
                i8 = i3 + 1;
                i7 = i13;
                int i102 = (-i6) + i7;
                i3 = i8;
                int i112 = i9;
                i5 = i102;
                i6 = i112;
                bArr2[i3] = (byte) i5;
                int i122 = i6 + 1;
                if (i3 == 0 - i4) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i5;
                int i1222 = i6 + 1;
                if (i3 == 0 - i4) {
                }
            }
        }

        private DeviceIDType(java.lang.String str, int i) {
        }

        public static com.visa.cbp.external.common.DeviceInfo.DeviceIDType valueOf(java.lang.String str) {
            ReplenishAckRequest = (BuildConfig + 5) % 128;
            com.visa.cbp.external.common.DeviceInfo.DeviceIDType deviceIDType = (com.visa.cbp.external.common.DeviceInfo.DeviceIDType) java.lang.Enum.valueOf(com.visa.cbp.external.common.DeviceInfo.DeviceIDType.class, str);
            BuildConfig = (ReplenishAckRequest + 73) % 128;
            return deviceIDType;
        }

        public static com.visa.cbp.external.common.DeviceInfo.DeviceIDType[] values() {
            int i = BuildConfig + 47;
            ReplenishAckRequest = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            com.visa.cbp.external.common.DeviceInfo.DeviceIDType[] deviceIDTypeArr = (com.visa.cbp.external.common.DeviceInfo.DeviceIDType[]) $VALUES.clone();
            ReplenishAckRequest = (BuildConfig + 105) % 128;
            return deviceIDTypeArr;
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            BuildConfig = 0;
            ReplenishAckRequest = 1;
            ConfirmReplenishRequest();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12, objArr);
            com.visa.cbp.external.common.DeviceInfo.DeviceIDType deviceIDType = new com.visa.cbp.external.common.DeviceInfo.DeviceIDType(((java.lang.String) objArr[0]).intern(), 0);
            SecureElement = deviceIDType;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a((char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 16585), '=' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 3 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
            com.visa.cbp.external.common.DeviceInfo.DeviceIDType deviceIDType2 = new com.visa.cbp.external.common.DeviceInfo.DeviceIDType(((java.lang.String) objArr2[0]).intern(), 1);
            TEE = deviceIDType2;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a((char) (26168 - android.text.TextUtils.getOffsetAfter("", 0)), 17 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 8 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
            com.visa.cbp.external.common.DeviceInfo.DeviceIDType deviceIDType3 = new com.visa.cbp.external.common.DeviceInfo.DeviceIDType(((java.lang.String) objArr3[0]).intern(), 2);
            Derived = deviceIDType3;
            $VALUES = new com.visa.cbp.external.common.DeviceInfo.DeviceIDType[]{deviceIDType, deviceIDType2, deviceIDType3};
            ReplenishAckRequest = (BuildConfig + 47) % 128;
        }

        private static void a(char c, int i, int i2, java.lang.Object[] objArr) {
            com.visa.cbp.ReplenishRequest replenishRequest = new com.visa.cbp.ReplenishRequest();
            long[] jArr = new long[i2];
            byte b = 0;
            replenishRequest.ConfirmReplenishRequest = 0;
            while (replenishRequest.ConfirmReplenishRequest < i2) {
                int i3 = $10 + 69;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = replenishRequest.ConfirmReplenishRequest;
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        objArr2[b] = java.lang.Integer.valueOf(valueOf[i % replenishRequest.ConfirmReplenishRequest]);
                        java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(892187687);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 959 - android.text.TextUtils.indexOf("", "", b, b), 21 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            b(b, 1, b, objArr3);
                            java.lang.String str = (java.lang.String) objArr3[b];
                            java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                            clsArr[b] = java.lang.Integer.TYPE;
                            obj = cls.getMethod(str, clsArr);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(892187687, obj);
                        }
                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue();
                        long j = replenishRequest.ConfirmReplenishRequest;
                        long j2 = values;
                        try {
                            java.lang.Object[] objArr4 = new java.lang.Object[4];
                            objArr4[3] = java.lang.Integer.valueOf(c);
                            objArr4[2] = java.lang.Long.valueOf(j2);
                            objArr4[1] = java.lang.Long.valueOf(j);
                            objArr4[b] = java.lang.Long.valueOf(longValue);
                            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1110765441);
                            if (obj2 == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 257 - android.graphics.Color.alpha((int) b), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 24);
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                b(b, b, b, objArr5);
                                java.lang.String str2 = (java.lang.String) objArr5[b];
                                java.lang.Class<?>[] clsArr2 = new java.lang.Class[4];
                                clsArr2[b] = java.lang.Long.TYPE;
                                clsArr2[1] = java.lang.Long.TYPE;
                                clsArr2[2] = java.lang.Long.TYPE;
                                clsArr2[3] = java.lang.Integer.TYPE;
                                obj2 = cls2.getMethod(str2, clsArr2);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1110765441, obj2);
                            }
                            jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                            try {
                                java.lang.Object[] objArr6 = {replenishRequest, replenishRequest};
                                java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1527286825);
                                if (obj3 == null) {
                                    java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (44626 - (android.util.TypedValue.complexToFraction(b, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(b, 0.0f, 0.0f) == 0.0f ? 0 : -1))), android.view.View.MeasureSpec.getSize(b) + 1566, 19 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                                    b(b, 2, b, objArr7);
                                    java.lang.String str3 = (java.lang.String) objArr7[b];
                                    java.lang.Class<?>[] clsArr3 = new java.lang.Class[2];
                                    clsArr3[b] = java.lang.Object.class;
                                    clsArr3[1] = java.lang.Object.class;
                                    obj3 = cls3.getMethod(str3, clsArr3);
                                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1527286825, obj3);
                                }
                                ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
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
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    int i5 = replenishRequest.ConfirmReplenishRequest;
                    try {
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        objArr8[b] = java.lang.Integer.valueOf(valueOf[i + replenishRequest.ConfirmReplenishRequest]);
                        java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(892187687);
                        if (obj4 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 959 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 21 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            b(b, 1, b, objArr9);
                            java.lang.String str4 = (java.lang.String) objArr9[b];
                            java.lang.Class<?>[] clsArr4 = new java.lang.Class[1];
                            clsArr4[b] = java.lang.Integer.TYPE;
                            obj4 = cls4.getMethod(str4, clsArr4);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(892187687, obj4);
                        }
                        try {
                            java.lang.Object[] objArr10 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).longValue()), java.lang.Long.valueOf(replenishRequest.ConfirmReplenishRequest), java.lang.Long.valueOf(values), java.lang.Integer.valueOf(c)};
                            java.lang.Object obj5 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1110765441);
                            if (obj5 == null) {
                                java.lang.Class cls5 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.View.getDefaultSize(0, 0), 257 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.KeyEvent.normalizeMetaState(0) + 25);
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                b((byte) 0, 0, 0, objArr11);
                                obj5 = cls5.getMethod((java.lang.String) objArr11[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1110765441, obj5);
                            }
                            jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr10)).longValue();
                            try {
                                java.lang.Object[] objArr12 = {replenishRequest, replenishRequest};
                                java.lang.Object obj6 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1527286825);
                                if (obj6 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 44625), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1566, 18 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                    b((byte) 0, 2, 0, objArr13);
                                    obj6 = cls6.getMethod((java.lang.String) objArr13[0], java.lang.Object.class, java.lang.Object.class);
                                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1527286825, obj6);
                                }
                                ((java.lang.reflect.Method) obj6).invoke(null, objArr12);
                                b = 0;
                            } catch (java.lang.Throwable th4) {
                                java.lang.Throwable cause4 = th4.getCause();
                                if (cause4 == null) {
                                    throw th4;
                                }
                                throw cause4;
                            }
                        } catch (java.lang.Throwable th5) {
                            java.lang.Throwable cause5 = th5.getCause();
                            if (cause5 == null) {
                                throw th5;
                            }
                            throw cause5;
                        }
                    } catch (java.lang.Throwable th6) {
                        java.lang.Throwable cause6 = th6.getCause();
                        if (cause6 == null) {
                            throw th6;
                        }
                        throw cause6;
                    }
                }
            }
            char[] cArr = new char[i2];
            replenishRequest.ConfirmReplenishRequest = 0;
            while (replenishRequest.ConfirmReplenishRequest < i2) {
                cArr[replenishRequest.ConfirmReplenishRequest] = (char) jArr[replenishRequest.ConfirmReplenishRequest];
                try {
                    java.lang.Object[] objArr14 = {replenishRequest, replenishRequest};
                    java.lang.Object obj7 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1527286825);
                    if (obj7 == null) {
                        java.lang.Class cls7 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (44625 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.view.KeyEvent.normalizeMetaState(0) + 1566, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19);
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        b((byte) 0, 2, 0, objArr15);
                        obj7 = cls7.getMethod((java.lang.String) objArr15[0], java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1527286825, obj7);
                    }
                    ((java.lang.reflect.Method) obj7).invoke(null, objArr14);
                } catch (java.lang.Throwable th7) {
                    java.lang.Throwable cause7 = th7.getCause();
                    if (cause7 == null) {
                        throw th7;
                    }
                    throw cause7;
                }
            }
            java.lang.String str5 = new java.lang.String(cArr);
            int i6 = $10 + 91;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            objArr[0] = str5;
        }

        static void init$0() {
            $$a = new byte[]{com.google.common.base.Ascii.ESC, -109, 74, -58};
            $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE;
        }

        static void ConfirmReplenishRequest() {
            valueOf = new char[]{44133, 27638, 8991, 64172, 45776, 19050, 429, 55769, 37243, 43158, 24609, 14415, 63486, 60587, 11039, 25584, 51786, 3534, 17718, 40072, 54508, 11346, 26548};
            values = -705978343017190509L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(android.content.Context context, java.lang.String str) {
        java.lang.Object[] objArr;
        java.lang.String str2;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(false, new int[]{0, 7, 0, 0}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001", objArr2);
        this.osType = ((java.lang.String) objArr2[0]).intern();
        this.osVersion = android.os.Build.VERSION.RELEASE;
        this.osBuildID = android.os.Build.ID;
        this.deviceType = com.visa.cbp.external.common.DeviceInfo.DeviceType.PHONE_TABLET.toString();
        this.deviceIDType = com.visa.cbp.external.common.DeviceInfo.DeviceIDType.Derived.toString();
        this.deviceManufacturer = android.os.Build.MANUFACTURER;
        this.deviceBrand = android.os.Build.BRAND;
        this.deviceModel = android.os.Build.MODEL;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(true, new int[]{7, 28, 38, 15}, "\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000", objArr3);
        if (com.visa.cbp.sdk.facade.util.PermissionUtil.isOptionalPermissionSpecified(context, ((java.lang.String) objArr3[0]).intern())) {
            this.deviceName = android.bluetooth.BluetoothAdapter.getDefaultAdapter().getName();
        } else {
            this.deviceName = android.os.Build.FINGERPRINT;
        }
        java.lang.String str3 = this.deviceName;
        if (str3 != null) {
            BuildConfig = (valueOf + 121) % 128;
            if (!str3.isEmpty()) {
                this.deviceName = new java.lang.String(com.visa.cbp.external.common.Base64Url.encode(this.deviceName.getBytes()), java.nio.charset.StandardCharsets.UTF_8);
                valueOf = (BuildConfig + 33) % 128;
                this.hostDeviceID = str;
                objArr = new java.lang.Object[1];
                a(false, new int[]{35, 35, 0, 28}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001", objArr);
                if (context.checkCallingOrSelfPermission(((java.lang.String) objArr[0]).intern()) == 0) {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(false, new int[]{70, 5, 176, 0}, "\u0000\u0000\u0001\u0001\u0001", objArr4);
                    android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService(((java.lang.String) objArr4[0]).intern());
                    if (telephonyManager != null) {
                        int i = valueOf + 113;
                        BuildConfig = i % 128;
                        if (i % 2 == 0) {
                            this.phoneNumber = telephonyManager.getLine1Number();
                            throw new java.lang.ArithmeticException();
                        }
                        this.phoneNumber = telephonyManager.getLine1Number();
                    }
                }
                str2 = this.phoneNumber;
                if (str2 == null && str2.isEmpty()) {
                    int i2 = valueOf + 101;
                    int i3 = i2 % 128;
                    BuildConfig = i3;
                    this.phoneNumber = null;
                    if (i2 % 2 == 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    valueOf = (i3 + 81) % 128;
                    return;
                }
            }
        }
        this.deviceName = "";
        this.hostDeviceID = str;
        objArr = new java.lang.Object[1];
        a(false, new int[]{35, 35, 0, 28}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001", objArr);
        if (context.checkCallingOrSelfPermission(((java.lang.String) objArr[0]).intern()) == 0) {
        }
        str2 = this.phoneNumber;
        if (str2 == null) {
        }
    }

    public java.lang.String getOsType() {
        int i = valueOf + 61;
        int i2 = i % 128;
        BuildConfig = i2;
        if (i % 2 == 0) {
            throw null;
        }
        java.lang.String str = this.osType;
        valueOf = (i2 + 5) % 128;
        return str;
    }

    public void setOsType(java.lang.String str) {
        int i = valueOf + 105;
        BuildConfig = i % 128;
        this.osType = str;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public java.lang.String getOsVersion() {
        int i = (BuildConfig + 55) % 128;
        valueOf = i;
        java.lang.String str = this.osVersion;
        int i2 = i + 99;
        BuildConfig = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setOsVersion(java.lang.String str) {
        int i = valueOf;
        BuildConfig = (i + 95) % 128;
        this.osVersion = str;
        int i2 = i + 57;
        BuildConfig = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public java.lang.String getOsBuildID() {
        int i = (valueOf + 21) % 128;
        BuildConfig = i;
        java.lang.String str = this.osBuildID;
        int i2 = i + 75;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void setOsBuildID(java.lang.String str) {
        int i = valueOf;
        BuildConfig = (i + 21) % 128;
        this.osBuildID = str;
        int i2 = i + 101;
        BuildConfig = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public java.lang.String getDeviceType() {
        int i = valueOf + 9;
        BuildConfig = i % 128;
        if (i % 2 != 0) {
            return this.deviceType;
        }
        throw null;
    }

    public void setDeviceType(java.lang.String str) {
        int i = BuildConfig;
        int i2 = i + 65;
        valueOf = i2 % 128;
        this.deviceType = str;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = i + 111;
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public java.lang.String getDeviceIDType() {
        int i = valueOf + 69;
        BuildConfig = i % 128;
        if (i % 2 != 0) {
            return this.deviceIDType;
        }
        throw null;
    }

    public void setDeviceIDType(java.lang.String str) {
        int i = valueOf;
        BuildConfig = (i + 23) % 128;
        this.deviceIDType = str;
        int i2 = i + 17;
        BuildConfig = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public java.lang.String getDeviceManufacturer() {
        int i = BuildConfig + 83;
        valueOf = i % 128;
        java.lang.String str = this.deviceManufacturer;
        if (i % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setDeviceManufacturer(java.lang.String str) {
        int i = BuildConfig;
        valueOf = (i + 53) % 128;
        this.deviceManufacturer = str;
        int i2 = i + 89;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public java.lang.String getDeviceBrand() {
        int i = (BuildConfig + 11) % 128;
        valueOf = i;
        java.lang.String str = this.deviceBrand;
        BuildConfig = (i + 117) % 128;
        return str;
    }

    public void setDeviceBrand(java.lang.String str) {
        int i = valueOf + 25;
        BuildConfig = i % 128;
        this.deviceBrand = str;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public java.lang.String getDeviceModel() {
        int i = BuildConfig + 17;
        int i2 = i % 128;
        valueOf = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.deviceModel;
        BuildConfig = (i2 + 51) % 128;
        return str;
    }

    public void setDeviceModel(java.lang.String str) {
        int i = valueOf;
        BuildConfig = (i + 21) % 128;
        this.deviceModel = str;
        BuildConfig = (i + 57) % 128;
    }

    public java.lang.String getDeviceName() {
        int i = valueOf;
        BuildConfig = (i + 107) % 128;
        java.lang.String str = this.deviceName;
        int i2 = i + 63;
        BuildConfig = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setDeviceName(java.lang.String str) {
        int i = (valueOf + 109) % 128;
        BuildConfig = i;
        this.deviceName = str;
        valueOf = (i + 49) % 128;
    }

    public java.lang.String getHostDeviceID() {
        int i = (valueOf + 13) % 128;
        BuildConfig = i;
        java.lang.String str = this.hostDeviceID;
        int i2 = i + 29;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setHostDeviceID(java.lang.String str) {
        int i = valueOf + 117;
        BuildConfig = i % 128;
        this.hostDeviceID = str;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public java.lang.String getPhoneNumber() {
        int i = (BuildConfig + 3) % 128;
        valueOf = i;
        java.lang.String str = this.phoneNumber;
        int i2 = i + 5;
        BuildConfig = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setPhoneNumber(java.lang.String str) {
        int i = BuildConfig + 27;
        int i2 = i % 128;
        valueOf = i2;
        this.phoneNumber = str;
        if (i % 2 != 0) {
            throw null;
        }
        int i3 = i2 + 125;
        BuildConfig = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public java.lang.String getName() {
        valueOf = (BuildConfig + 3) % 128;
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.lang.String str2 = android.os.Build.MODEL;
        if (str2.startsWith(str)) {
            int i = BuildConfig + 111;
            valueOf = i % 128;
            if (i % 2 == 0) {
                return capitalize(str2);
            }
            capitalize(str2);
            throw new java.lang.ArithmeticException();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(capitalize(str));
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(false, new int[]{75, 1, 0, 1}, "\u0000", objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(str2);
        return sb.toString();
    }

    private java.lang.String capitalize(java.lang.String str) {
        if (str != null) {
            int i = valueOf + 27;
            BuildConfig = i % 128;
            if (i % 2 != 0) {
                if (str.length() != 0) {
                    char charAt = str.charAt(0);
                    if (java.lang.Character.isUpperCase(charAt)) {
                        int i2 = BuildConfig + 41;
                        valueOf = i2 % 128;
                        if (i2 % 2 == 0) {
                            return str;
                        }
                        throw new java.lang.ArithmeticException();
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(java.lang.Character.toUpperCase(charAt));
                    sb.append(str.substring(1));
                    return sb.toString();
                }
            } else {
                throw null;
            }
        }
        int i3 = valueOf + 81;
        BuildConfig = i3 % 128;
        if (i3 % 2 != 0) {
            return "";
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        int length;
        char[] cArr;
        int i2;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.visa.cbp.ReplenishResponse replenishResponse = new com.visa.cbp.ReplenishResponse();
        char c = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = ConfirmReplenishRequest;
        long j = 0;
        if (cArr2 != null) {
            int i8 = $10 + 93;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            int i9 = i2;
            while (i9 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i4];
                    objArr2[c] = java.lang.Integer.valueOf(cArr2[i9]);
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-586396651);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (1 - (android.os.SystemClock.uptimeMillis() > j ? 1 : (android.os.SystemClock.uptimeMillis() == j ? 0 : -1))), 1701 - (android.os.Process.myTid() >> 22), android.text.TextUtils.indexOf("", "") + 19);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((short) 0, 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-586396651, obj);
                    }
                    cArr[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i9++;
                    c = 0;
                    i4 = 1;
                    j = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        java.lang.System.arraycopy(cArr2, i3, cArr3, 0, i5);
        if (bArr2 != null) {
            $10 = ($11 + 65) % 128;
            char[] cArr4 = new char[i5];
            replenishResponse.ConfirmReplenishRequest = 0;
            char c2 = 0;
            while (replenishResponse.ConfirmReplenishRequest < i5) {
                if (bArr2[replenishResponse.ConfirmReplenishRequest] == 1) {
                    int i10 = $11 + 57;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = replenishResponse.ConfirmReplenishRequest;
                        try {
                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[replenishResponse.ConfirmReplenishRequest]), java.lang.Integer.valueOf(c2)};
                            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-718164716);
                            if (obj2 == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.os.Process.getGidForName("") + 1657, 20 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                b((short) 0, 0, (byte) 1, objArr5);
                                obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-718164716, obj2);
                            }
                            cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                            throw null;
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    int i12 = replenishResponse.ConfirmReplenishRequest;
                    try {
                        java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[replenishResponse.ConfirmReplenishRequest]), java.lang.Integer.valueOf(c2)};
                        java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-718164716);
                        if (obj3 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), android.text.TextUtils.indexOf("", "") + 1656, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 21);
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            b((short) 0, 0, (byte) 1, objArr7);
                            obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-718164716, obj3);
                        }
                        cArr4[i12] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    int i13 = replenishResponse.ConfirmReplenishRequest;
                    try {
                        java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr3[replenishResponse.ConfirmReplenishRequest]), java.lang.Integer.valueOf(c2)};
                        java.lang.Object obj4 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1678831086);
                        if (obj4 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (21016 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 347, 33 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            b((short) 0, 0, (byte) 3, objArr9);
                            obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1678831086, obj4);
                        }
                        cArr4[i13] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                    } catch (java.lang.Throwable th4) {
                        java.lang.Throwable cause4 = th4.getCause();
                        if (cause4 == null) {
                            throw th4;
                        }
                        throw cause4;
                    }
                }
                c2 = cArr4[replenishResponse.ConfirmReplenishRequest];
                try {
                    java.lang.Object[] objArr10 = {replenishResponse, replenishResponse};
                    java.lang.Object obj5 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(116191609);
                    if (obj5 == null) {
                        obj5 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-16717245) - android.graphics.Color.rgb(0, 0, 0)), 1741 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 40 - (android.os.Process.myTid() >> 22))).getMethod(util.h.xy.cb.b.f1091, java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(116191609, obj5);
                    }
                    ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
                } catch (java.lang.Throwable th5) {
                    java.lang.Throwable cause5 = th5.getCause();
                    if (cause5 == null) {
                        throw th5;
                    }
                    throw cause5;
                }
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i14 = i5 - i7;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i14, i7);
            java.lang.System.arraycopy(cArr5, i7, cArr3, 0, i14);
            $10 = ($11 + 13) % 128;
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                replenishResponse.ConfirmReplenishRequest = i;
                if (replenishResponse.ConfirmReplenishRequest >= i5) {
                    break;
                }
                cArr6[replenishResponse.ConfirmReplenishRequest] = cArr3[(i5 - replenishResponse.ConfirmReplenishRequest) - 1];
                i = replenishResponse.ConfirmReplenishRequest + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i15 = 0;
            while (true) {
                replenishResponse.ConfirmReplenishRequest = i15;
                if (replenishResponse.ConfirmReplenishRequest >= i5) {
                    break;
                }
                cArr3[replenishResponse.ConfirmReplenishRequest] = (char) (cArr3[replenishResponse.ConfirmReplenishRequest] - iArr[2]);
                i15 = replenishResponse.ConfirmReplenishRequest + 1;
            }
        }
        java.lang.String str3 = new java.lang.String(cArr3);
        $11 = ($10 + 57) % 128;
        objArr[0] = str3;
    }

    static void values() {
        ConfirmReplenishRequest = new char[]{26508, 26603, 26597, 26599, 26620, 26592, 26602, 26592, 26421, 26424, 26429, 26425, 26429, 26428, 26585, 26563, 26400, 26430, 26426, 26429, 26403, 26401, 26582, 26584, 26587, 26585, 26587, 26590, 26591, 26586, 26561, 26610, 26584, 26424, 26430, 26555, 26595, 26566, 26567, 26563, 26567, 26562, 26591, 26562, 26560, 26562, 26594, 26604, 26599, 26607, 26606, 26621, 26619, 26592, 26599, 26594, 26597, 26622, 26613, 26623, 26598, 26598, 26592, 26623, 26571, 26565, 26567, 26588, 26560, 26570, 26428, 26288, 26295, 26290, 26293, 26556};
    }

    static void init$0() {
        $$a = new byte[]{120, 56, -45, -117};
        $$b = 85;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        BuildConfig = 1;
        values();
        valueOf = (BuildConfig + 11) % 128;
    }
}
