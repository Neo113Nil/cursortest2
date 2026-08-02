package com.payair.hce;

/* loaded from: classes4.dex */
public final class setFindListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int values;
    private static char[] writeReplace;
    private final com.visa.cbp.sdk.facade.VisaPaymentSDK valueOf;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$g;
        int i4 = 4 - (s2 * 4);
        int i5 = 1 - (s * 3);
        int i6 = (i * 2) + 107;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i3 = i4;
            i4 += -i7;
            i3++;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i3];
            i4 += -i7;
            i3++;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i4;
            i4 = i6;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5 = i3 * 23;
        int i6 = 38 - (i2 * 34);
        int i7 = (i * 54) + 65;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 12];
        int i8 = i5 + 11;
        if (bArr == null) {
            int i9 = i6;
            i7 = i8;
            i4 = 0;
            i6++;
            i7 = (i7 + i9) - 2;
            bArr2[i4] = (byte) i7;
            if (i4 == i8) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i4++;
            i9 = bArr[i6];
            i6++;
            i7 = (i7 + i9) - 2;
            bArr2[i4] = (byte) i7;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i7;
            if (i4 == i8) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 45 - (s * 40);
        byte[] bArr = $$d;
        int i5 = (i * 34) + 65;
        int i6 = (b * 6) + 35;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i4;
            int i8 = i6;
            i3 = 0;
            int i9 = (i8 + (-i4)) - 1;
            int i10 = i7 + 1;
            i2 = i3;
            i5 = i9;
            i4 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i5;
            i7 = i4;
            i4 = bArr[i4];
            i8 = i11;
            int i92 = (i8 + (-i4)) - 1;
            int i102 = i7 + 1;
            i2 = i3;
            i5 = i92;
            i4 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = (i * (-665)) + (i2 * com.visa.cbp.getCertUsage.setODAData) + (i4 * (-333)) + (((~(i4 | i5)) | (~(i2 | i3))) * com.visa.cbp.getCertUsage.getODAData) + (((~(i2 | i5)) | (~(i3 | i4))) * com.visa.cbp.getCertUsage.getODAData);
        if (i6 == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i6 == 2) {
            return DigitizedCardProfile(objArr);
        }
        if (i6 == 3) {
            return valueOf(objArr);
        }
        com.payair.hce.setFindListener setfindlistener = (com.payair.hce.setFindListener) objArr[0];
        final android.content.Context context = (android.content.Context) objArr[1];
        final com.visa.cbp.sdk.facade.data.TokenKey tokenKey = (com.visa.cbp.sdk.facade.data.TokenKey) objArr[2];
        final com.visa.cbp.external.enp.RepersoTokenResponse repersoTokenResponse = (com.visa.cbp.external.enp.RepersoTokenResponse) objArr[3];
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repersoTokenResponse, "");
        com.payair.hce.setNetworkAvailable setnetworkavailable = com.payair.hce.setNetworkAvailable.values;
        com.payair.hce.setNetworkAvailable.values(new java.lang.Object[]{new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.payair.hce.setFindListener.1
            private static int $DigitizedCardProfile = 0;
            private static int $getProfileVersion = 1;

            public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2, int i7, int i8, int i9) {
                int i10 = ~i7;
                int i11 = ~i8;
                int i12 = i10 | i11;
                int i13 = ~i9;
                return ((((i7 * (-167)) + (i8 * (-167))) + (((~i12) | (~(i11 | i13))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)) + ((~(i12 | i9)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)) + (((~((i7 | i11) | i9)) | ((~(i8 | i10)) | (~(i10 | i13)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) != 1 ? valueOf(objArr2) : AlternateContactlessPaymentDataJson(objArr2);
            }

            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                com.payair.hce.setFindListener.AnonymousClass1 anonymousClass1 = (com.payair.hce.setFindListener.AnonymousClass1) objArr2[0];
                int i7 = $getProfileVersion;
                int i8 = (i7 ^ 117) + ((i7 & 117) << 1);
                $DigitizedCardProfile = i8 % 128;
                if (i8 % 2 == 0) {
                    valueOf(new java.lang.Object[]{anonymousClass1}, 701929024, -701929023, java.lang.System.identityHashCode(anonymousClass1));
                    return kotlin.Unit.INSTANCE;
                }
                valueOf(new java.lang.Object[]{anonymousClass1}, 701929024, -701929023, java.lang.System.identityHashCode(anonymousClass1));
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                throw null;
            }

            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2) {
                com.payair.hce.setFindListener.AnonymousClass1 anonymousClass1 = (com.payair.hce.setFindListener.AnonymousClass1) objArr2[0];
                int i7 = $getProfileVersion;
                int i8 = i7 & 27;
                int i9 = (((i7 ^ 27) | i8) << 1) - ((i7 | 27) & (~i8));
                $DigitizedCardProfile = i9 % 128;
                if (i9 % 2 == 0) {
                    ((com.visa.cbp.sdk.facade.VisaPaymentSDK) com.payair.hce.setFindListener.values(new java.lang.Object[]{com.payair.hce.setFindListener.this}, 1543033826, -1543033823, (int) java.lang.System.currentTimeMillis())).processRepersoTokenResponse(context, tokenKey, repersoTokenResponse);
                    int i10 = $getProfileVersion + 45;
                    $DigitizedCardProfile = i10 % 128;
                    if (i10 % 2 == 0) {
                        return null;
                    }
                    throw new java.lang.ArithmeticException();
                }
                ((com.visa.cbp.sdk.facade.VisaPaymentSDK) com.payair.hce.setFindListener.values(new java.lang.Object[]{com.payair.hce.setFindListener.this}, 1543033826, -1543033823, (int) java.lang.System.currentTimeMillis())).processRepersoTokenResponse(context, tokenKey, repersoTokenResponse);
                throw null;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Unit] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                ?? valueOf = valueOf(new java.lang.Object[]{this}, -1298777395, 1298777395, java.lang.System.identityHashCode(this));
                return valueOf;
            }

            public final void values() {
                valueOf(new java.lang.Object[]{this}, 701929024, -701929023, java.lang.System.identityHashCode(this));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }}, -1243304760, 1243304762, (int) java.lang.System.currentTimeMillis());
        int i7 = values;
        int i8 = (i7 & (-16)) | ((~i7) & 15);
        int i9 = (i7 & 15) << 1;
        AlternateContactlessPaymentDataJson = (((i8 | i9) << 1) - (i9 ^ i8)) % 128;
        return null;
    }

    public setFindListener(com.visa.cbp.sdk.facade.VisaPaymentSDK visaPaymentSDK) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visaPaymentSDK, "");
        this.valueOf = visaPaymentSDK;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setFindListener setfindlistener = (com.payair.hce.setFindListener) objArr[0];
        int i = values;
        int i2 = (-2) - (~(i + 20));
        AlternateContactlessPaymentDataJson = i2 % 128;
        com.visa.cbp.sdk.facade.VisaPaymentSDK visaPaymentSDK = setfindlistener.valueOf;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = i & 19;
        int i4 = -(-((i ^ 19) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        AlternateContactlessPaymentDataJson = i5 % 128;
        if (i5 % 2 != 0) {
            return visaPaymentSDK;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0342 A[Catch: all -> 0x06ef, TryCatch #3 {all -> 0x06ef, blocks: (B:7:0x0135, B:9:0x014e, B:10:0x019e, B:12:0x0333, B:14:0x0342, B:15:0x0371, B:17:0x038d, B:18:0x03bd, B:23:0x03e0, B:25:0x03ec, B:26:0x041b, B:28:0x0440, B:29:0x0497, B:39:0x049f, B:41:0x04ab, B:42:0x04d8, B:44:0x04fd, B:45:0x0554, B:49:0x05d2, B:51:0x05e1, B:52:0x0611, B:54:0x0636, B:55:0x0691, B:66:0x01ef, B:68:0x0210, B:69:0x025d), top: B:2:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x038d A[Catch: all -> 0x06ef, TryCatch #3 {all -> 0x06ef, blocks: (B:7:0x0135, B:9:0x014e, B:10:0x019e, B:12:0x0333, B:14:0x0342, B:15:0x0371, B:17:0x038d, B:18:0x03bd, B:23:0x03e0, B:25:0x03ec, B:26:0x041b, B:28:0x0440, B:29:0x0497, B:39:0x049f, B:41:0x04ab, B:42:0x04d8, B:44:0x04fd, B:45:0x0554, B:49:0x05d2, B:51:0x05e1, B:52:0x0611, B:54:0x0636, B:55:0x0691, B:66:0x01ef, B:68:0x0210, B:69:0x025d), top: B:2:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x06c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0570  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int i;
        java.lang.Object invoke;
        java.lang.Object obj;
        java.lang.Object obj2;
        int intValue;
        java.lang.Object obj3;
        int intValue2;
        int i2;
        com.payair.hce.setFindListener setfindlistener = (com.payair.hce.setFindListener) objArr[0];
        android.content.Context context = (android.content.Context) objArr[1];
        com.visa.cbp.external.enp.ProvisionResponse provisionResponse = (com.visa.cbp.external.enp.ProvisionResponse) objArr[2];
        java.lang.String str = (java.lang.String) objArr[3];
        int i3 = values;
        int i4 = i3 & 47;
        AlternateContactlessPaymentDataJson = ((((i3 ^ 47) | i4) << 1) - ((i3 | 47) & (~i4))) % 128;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 48, 754 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (45560 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))));
        byte[] bArr = $$a;
        byte b = bArr[14];
        byte b2 = (byte) (b - 1);
        byte b3 = b;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b(b2, b3, b3, objArr2);
        long j = cls.getField((java.lang.String) objArr2[0]).getLong(null);
        try {
            try {
                try {
                    if (j != -1) {
                        int i5 = AlternateContactlessPaymentDataJson;
                        int i6 = (i5 & 28) + (i5 | 28);
                        values = ((~i6) + (i6 << 1)) % 128;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c(new int[]{0, 22, 82, 0}, false, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000", objArr3);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        c(new int[]{22, 15, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, 0}, false, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", objArr4);
                        if (j + 1965 >= ((java.lang.Long) cls2.getDeclaredMethod((java.lang.String) objArr4[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                            int i7 = AlternateContactlessPaymentDataJson;
                            int i8 = i7 & 71;
                            int i9 = ((i7 ^ 71) | i8) << 1;
                            int i10 = -((i7 | 71) & (~i8));
                            values = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 47, 754 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (45560 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                            byte b4 = bArr[14];
                            byte b5 = (byte) (b4 - 1);
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            b(b4, b5, b5, objArr5);
                            java.lang.Object[] objArr6 = {cls3.getField((java.lang.String) objArr5[0]).get(null), 461767734, 0};
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                            if (obj4 == null) {
                                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 40, 4789 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31152))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), android.graphics.Color.alpha(0) + 4750, (char) (33701 - android.text.TextUtils.getTrimmedLength(""))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj4);
                            }
                            obj = ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                            int i11 = AlternateContactlessPaymentDataJson;
                            int i12 = i11 & 65;
                            int i13 = (i11 ^ 65) | i12;
                            values = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
                            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                            if (obj2 == null) {
                                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 4749 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33701))).getMethod("values", null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-273776192, obj2);
                            }
                            intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, null)).intValue();
                            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                            if (obj3 == null) {
                                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.view.KeyEvent.keyCodeFromString("") + 4750, (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 33701))).getMethod("DigitizedCardProfile", null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-712736454, obj3);
                            }
                            intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, null)).intValue();
                            if (intValue2 != intValue) {
                                int i14 = values;
                                int i15 = ((i14 | 19) << 1) - (i14 ^ 19);
                                AlternateContactlessPaymentDataJson = i15 % 128;
                                if (i15 % 2 == 0) {
                                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                    if (obj5 == null) {
                                        obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 40, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4749, (char) (33701 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)))).getMethod("valueOf", null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj5);
                                    }
                                    java.lang.Object[] objArr7 = {obj, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(obj, null)).intValue()), 0};
                                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                    if (obj6 == null) {
                                        obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 4790 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 31153))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 4749 - android.os.Process.getGidForName(""), (char) (33700 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj6);
                                    }
                                    ((java.lang.reflect.Method) obj6).invoke(null, objArr7);
                                } else {
                                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                    if (obj7 == null) {
                                        obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.widget.ExpandableListView.getPackedPositionChild(0L), (android.os.Process.myTid() >> 22) + 4750, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 33702))).getMethod("valueOf", null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj7);
                                    }
                                    java.lang.Object[] objArr8 = {obj, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(obj, null)).intValue()), 0};
                                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                    if (obj8 == null) {
                                        obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 4790 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (31153 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 40, 4750 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj8);
                                    }
                                    ((java.lang.reflect.Method) obj8).invoke(null, objArr8);
                                }
                                int i16 = AlternateContactlessPaymentDataJson;
                                int i17 = ((i16 | 121) << 1) - (i16 ^ 121);
                                values = i17 % 128;
                                if (i17 % 2 != 0) {
                                    int i18 = 3 / 5;
                                }
                            } else {
                                int i19 = intValue & intValue2;
                                long j2 = ((intValue ^ intValue2) | i19) & (~i19);
                                AlternateContactlessPaymentDataJson = (values + 65) % 128;
                                try {
                                    java.lang.Object[] objArr9 = {java.lang.Long.valueOf(j2 ^ (-17948681214885888L)), -4181051L};
                                    byte[] bArr2 = $$d;
                                    byte b6 = bArr2[6];
                                    byte b7 = b6;
                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                    d(b6, b7, b7, objArr10);
                                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                                    byte b8 = bArr2[0];
                                    byte b9 = b8;
                                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                                    d(b8, b9, b9, objArr11);
                                    cls4.getMethod((java.lang.String) objArr11[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr9);
                                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                    if (obj9 == null) {
                                        obj9 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 4750 - android.graphics.Color.red(0), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 33701))).getMethod("valueOf", null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj9);
                                    }
                                    java.lang.Object[] objArr12 = {obj, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(obj, null)).intValue()), 0};
                                    java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                    if (obj10 == null) {
                                        obj10 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 39, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 4790, (char) (android.view.KeyEvent.normalizeMetaState(0) + 31152))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 40, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4751, (char) ((android.os.Process.myPid() >> 22) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj10);
                                    }
                                    ((java.lang.reflect.Method) obj10).invoke(null, objArr12);
                                    int i20 = AlternateContactlessPaymentDataJson;
                                    int i21 = i20 & 93;
                                    int i22 = -(-((i20 ^ 93) | i21));
                                    values = ((i21 ^ i22) + ((i22 & i21) << 1)) % 128;
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            }
                            com.visa.cbp.sdk.facade.data.TokenKey storeProvisionedToken = setfindlistener.valueOf.storeProvisionedToken(context, provisionResponse, str);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(storeProvisionedToken, "");
                            int i23 = AlternateContactlessPaymentDataJson;
                            int i24 = i23 & 101;
                            int i25 = (i23 ^ 101) | i24;
                            i2 = (i24 ^ i25) + ((i25 & i24) << 1);
                            values = i2 % 128;
                            if (i2 % 2 != 0) {
                                return storeProvisionedToken;
                            }
                            throw new java.lang.ArithmeticException();
                        }
                    }
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    c(new int[]{0, 22, 82, 0}, false, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000", objArr13);
                    java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    c(new int[]{22, 15, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, 0}, false, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", objArr14);
                    long longValue = ((java.lang.Long) cls5.getDeclaredMethod((java.lang.String) objArr14[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 47, android.graphics.Color.blue(0) + 754, (char) (45559 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    byte b10 = bArr[14];
                    byte b11 = (byte) (b10 - 1);
                    byte b12 = b10;
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    b(b11, b12, b12, objArr15);
                    cls6.getField((java.lang.String) objArr15[0]).set(null, java.lang.Long.valueOf(longValue));
                    int i26 = AlternateContactlessPaymentDataJson;
                    int i27 = ((i26 ^ 71) - (~(-(-((i26 & 71) << 1))))) - 1;
                    values = i27 % 128;
                    int i28 = i27 % 2;
                    obj = invoke;
                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                    if (obj2 == null) {
                    }
                    intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, null)).intValue();
                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                    if (obj3 == null) {
                    }
                    intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, null)).intValue();
                    if (intValue2 != intValue) {
                    }
                    com.visa.cbp.sdk.facade.data.TokenKey storeProvisionedToken2 = setfindlistener.valueOf.storeProvisionedToken(context, provisionResponse, str);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(storeProvisionedToken2, "");
                    int i232 = AlternateContactlessPaymentDataJson;
                    int i242 = i232 & 101;
                    int i252 = (i232 ^ 101) | i242;
                    i2 = (i242 ^ i252) + ((i252 & i242) << 1);
                    values = i2 % 128;
                    if (i2 % 2 != 0) {
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            } catch (java.lang.Exception unused) {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
            }
            if (str != null) {
                int i29 = AlternateContactlessPaymentDataJson;
                int i30 = i29 & 31;
                int i31 = i29 | 31;
                values = ((i30 ^ i31) + ((i31 & i30) << 1)) % 128;
                i = str.length();
                int i32 = values;
                int i33 = i32 & 69;
                int i34 = ((i32 ^ 69) | i33) << 1;
                int i35 = -((i32 | 69) & (~i33));
                AlternateContactlessPaymentDataJson = ((i34 ^ i35) + ((i35 & i34) << 1)) % 128;
            } else {
                AlternateContactlessPaymentDataJson = (values + 13) % 128;
                i = 0;
            }
            java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(i), 461767734};
            java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
            if (obj11 == null) {
                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.widget.ExpandableListView.getPackedPositionChild(0L) + 755, (char) (android.view.View.combineMeasuredStates(0, 0) + 45560));
                byte b13 = bArr[14];
                byte b14 = (byte) (b13 - 1);
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                b(b13, b14, b14, objArr17);
                obj11 = cls7.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(599786096, obj11);
            }
            invoke = ((java.lang.reflect.Method) obj11).invoke(null, objArr16);
            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.view.MotionEvent.axisFromString(""), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 754, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 45560));
            byte b15 = bArr[14];
            byte b16 = (byte) (b15 - 1);
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            b(b15, b16, b16, objArr18);
            cls8.getField((java.lang.String) objArr18[0]).set(null, invoke);
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setFindListener setfindlistener = (com.payair.hce.setFindListener) objArr[0];
        android.content.Context context = (android.content.Context) objArr[1];
        com.visa.cbp.sdk.facade.data.TokenKey tokenKey = (com.visa.cbp.sdk.facade.data.TokenKey) objArr[2];
        int i = values + 39;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenKey, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(setfindlistener.valueOf.constructProvisionAck(context, tokenKey), "");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenKey, "");
        com.visa.cbp.external.enp.ProvisionAckRequest constructProvisionAck = setfindlistener.valueOf.constructProvisionAck(context, tokenKey);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructProvisionAck, "");
        int i2 = AlternateContactlessPaymentDataJson;
        int i3 = i2 & 41;
        int i4 = ((((i2 ^ 41) | i3) << 1) - (~(-((i2 | 41) & (~i3))))) - 1;
        values = i4 % 128;
        if (i4 % 2 == 0) {
            return constructProvisionAck;
        }
        throw null;
    }

    private static void c(int[] iArr, boolean z, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        java.lang.String str2 = str;
        int i2 = $10 + 85;
        $11 = i2 % 128;
        byte[] bArr = str2;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        short s = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = writeReplace;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i4];
                    objArr2[s] = java.lang.Integer.valueOf(cArr[i8]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.text.TextUtils.lastIndexOf("", c, s, s), 2807 - android.graphics.Color.green((int) s), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(s)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a(s, s, 1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[s], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr2[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i8++;
                    s = 0;
                    i4 = 1;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $10 = ($11 + 51) % 128;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        java.lang.System.arraycopy(cArr, i3, cArr3, 0, i5);
        if (bArr2 != null) {
            char[] cArr4 = new char[i5];
            getaccounttype.writeReplace = 0;
            char c2 = 0;
            while (getaccounttype.writeReplace < i5) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i9 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43, 2837 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        a((short) 0, (short) 0, 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr4[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2879 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        a((short) 0, (short) 0, 2, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr4[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c2 = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 34, 211 - android.view.MotionEvent.axisFromString(""), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                $11 = ($10 + 27) % 128;
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i11 = i5 - i7;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i11, i7);
            java.lang.System.arraycopy(cArr5, i7, cArr3, 0, i11);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                $11 = ($10 + 57) % 128;
                cArr6[getaccounttype.writeReplace] = cArr3[(i5 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            $11 = ($10 + 9) % 128;
            int i12 = 0;
            while (true) {
                getaccounttype.writeReplace = i12;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                i12 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        values = 0;
        AlternateContactlessPaymentDataJson = 1;
        writeReplace = new char[]{16791, 16759, 16757, 16755, 16652, 16752, 16758, 16725, 16750, 16653, 16748, 16732, 16758, 16646, 16651, 16752, 16757, 16740, 16743, 16753, 16757, 16759, 16707, 16592, 16594, 16592, 16617, 16620, 16596, 16607, 16607, 16599, 16594, 16616, 16618, 16623, 16593};
    }

    public static final /* synthetic */ com.visa.cbp.sdk.facade.VisaPaymentSDK DigitizedCardProfile(com.payair.hce.setFindListener setfindlistener) {
        return (com.visa.cbp.sdk.facade.VisaPaymentSDK) values(new java.lang.Object[]{setfindlistener}, 1543033826, -1543033823, (int) java.lang.System.currentTimeMillis());
    }

    static void init$2() {
        $$g = new byte[]{3, -32, -117, 13};
        $$h = 144;
    }

    public final void DigitizedCardProfile(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.external.enp.RepersoTokenResponse repersoTokenResponse) {
        values(new java.lang.Object[]{this, context, tokenKey, repersoTokenResponse}, -546461485, 546461485, java.lang.System.identityHashCode(this));
    }

    static void init$1() {
        $$d = new byte[]{0, Byte.MIN_VALUE, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -58, 1, com.visa.cbp.getEncExpo.onUnminimized, 32, -35, 1, 2, 10, -10, 9, -6, -6, 6, 18, -31, 16, -14, -6, 17, -3, -18, 10, -7, 0, 36, -28, -44, -9, 14, -14, 3, com.google.common.base.Ascii.FF, -20, 14, 33, -45, 0, -7, 18, -3, -18, 7, 6, -15, -1, 34, -18, -25, com.google.common.base.Ascii.VT, 7, -10, -7, 47, -30, -20, 18, com.google.common.base.Ascii.SYN, -42, 3, 0};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
    }

    public final com.visa.cbp.external.enp.ProvisionAckRequest values(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        return (com.visa.cbp.external.enp.ProvisionAckRequest) values(new java.lang.Object[]{this, context, tokenKey}, -548111714, 548111715, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{75, -78, -116, -102, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, -3, -7, 13, -13, -17, com.google.common.base.Ascii.NAK, 13, -2, -9, 4, 4};
        $$b = 41;
    }

    public final com.visa.cbp.sdk.facade.data.TokenKey AlternateContactlessPaymentDataJson(android.content.Context context, com.visa.cbp.external.enp.ProvisionResponse provisionResponse, java.lang.String str) throws java.lang.Exception {
        return (com.visa.cbp.sdk.facade.data.TokenKey) values(new java.lang.Object[]{this, context, provisionResponse, str}, 255558423, -255558421, java.lang.System.identityHashCode(this));
    }
}
