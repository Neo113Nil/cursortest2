package com.payair.hce;

/* loaded from: classes4.dex */
public class setAckAutomaticallyResetByApplication extends com.payair.hce.isPrimaryAidMchipDataValid<com.payair.hce.isMagstripeDataValid> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int[] DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int getProfileVersion;
    private static final com.payair.hce.transactionCanBeResumed writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = 66 - (i * 3);
        int i6 = 1 - (i2 * 2);
        int i7 = (b * 3) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i7;
            int i9 = 0;
            i5 += i7;
            i7 = i8 + 1;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i7];
            int i10 = i7;
            i7 = i5;
            i5 = b2;
            i9 = i4;
            i8 = i10;
            i5 += i7;
            i7 = i8 + 1;
            i3 = i9;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i6) {
            }
        }
    }

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
    static final class values {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        public static final com.payair.hce.setAckAutomaticallyResetByApplication.values AlternateContactlessPaymentDataJson;
        public static final com.payair.hce.setAckAutomaticallyResetByApplication.values DigitizedCardProfile;
        private static char[] IccPrivateKeyCrtComponentsJson;
        private static int SdkCoreAlternateContactlessPaymentDataImpl;
        private static long getAid;
        private static int getProfileVersion;
        public static final com.payair.hce.setAckAutomaticallyResetByApplication.values valueOf;
        private static final /* synthetic */ com.payair.hce.setAckAutomaticallyResetByApplication.values[] values;
        public static final com.payair.hce.setAckAutomaticallyResetByApplication.values writeReplace;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(int i, byte b, int i2, java.lang.Object[] objArr) {
            int i3;
            int i4;
            byte[] bArr = $$a;
            int i5 = (i2 * 2) + 1;
            int i6 = 3 - (i * 4);
            int i7 = (b * 3) + 99;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i8 = i7;
                i4 = 0;
                int i9 = i6;
                int i10 = (-i6) + i8;
                i3 = i4;
                int i11 = i9;
                i7 = i10;
                i6 = i11;
                i4 = i3 + 1;
                int i12 = i6 + 1;
                bArr2[i3] = (byte) i7;
                if (i4 == i5) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                int i13 = i7;
                i9 = i12;
                i6 = bArr[i12];
                i8 = i13;
                int i102 = (-i6) + i8;
                i3 = i4;
                int i112 = i9;
                i7 = i102;
                i6 = i112;
                i4 = i3 + 1;
                int i122 = i6 + 1;
                bArr2[i3] = (byte) i7;
                if (i4 == i5) {
                }
            } else {
                i3 = 0;
                i4 = i3 + 1;
                int i1222 = i6 + 1;
                bArr2[i3] = (byte) i7;
                if (i4 == i5) {
                }
            }
        }

        private values(java.lang.String str, int i) {
        }

        public static com.payair.hce.setAckAutomaticallyResetByApplication.values valueOf(java.lang.String str) {
            getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            com.payair.hce.setAckAutomaticallyResetByApplication.values valuesVar = (com.payair.hce.setAckAutomaticallyResetByApplication.values) java.lang.Enum.valueOf(com.payair.hce.setAckAutomaticallyResetByApplication.values.class, str);
            SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            return valuesVar;
        }

        public static com.payair.hce.setAckAutomaticallyResetByApplication.values[] values() {
            int i = getProfileVersion + 13;
            SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            com.payair.hce.setAckAutomaticallyResetByApplication.values[] valuesVarArr = (com.payair.hce.setAckAutomaticallyResetByApplication.values[]) values.clone();
            getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 93) % 128;
            return valuesVarArr;
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getProfileVersion = 0;
            SdkCoreAlternateContactlessPaymentDataImpl = 1;
            writeReplace();
            int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(10 - lastIndexOf, (-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr);
            com.payair.hce.setAckAutomaticallyResetByApplication.values valuesVar = new com.payair.hce.setAckAutomaticallyResetByApplication.values(((java.lang.String) objArr[0]).intern(), 0);
            DigitizedCardProfile = valuesVar;
            int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a((windowTouchSlop >> 8) + 13, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
            com.payair.hce.setAckAutomaticallyResetByApplication.values valuesVar2 = new com.payair.hce.setAckAutomaticallyResetByApplication.values(((java.lang.String) objArr2[0]).intern(), 1);
            AlternateContactlessPaymentDataJson = valuesVar2;
            int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(8 - (jumpTapTimeout >> 16), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 24, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), objArr3);
            com.payair.hce.setAckAutomaticallyResetByApplication.values valuesVar3 = new com.payair.hce.setAckAutomaticallyResetByApplication.values(((java.lang.String) objArr3[0]).intern(), 2);
            valueOf = valuesVar3;
            int gidForName = android.os.Process.getGidForName("");
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(gidForName + 8, (android.os.Process.myTid() >> 22) + 32, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr4);
            com.payair.hce.setAckAutomaticallyResetByApplication.values valuesVar4 = new com.payair.hce.setAckAutomaticallyResetByApplication.values(((java.lang.String) objArr4[0]).intern(), 3);
            writeReplace = valuesVar4;
            values = new com.payair.hce.setAckAutomaticallyResetByApplication.values[]{valuesVar, valuesVar2, valuesVar3, valuesVar4};
            getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 107) % 128;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x01da  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char c, java.lang.Object[] objArr) {
            char c2;
            java.lang.Throwable cause;
            com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
            long[] jArr = new long[i];
            getcvmmodel.valueOf = 0;
            while (true) {
                int i3 = getcvmmodel.valueOf;
                c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                if (i3 >= i) {
                    break;
                }
                $10 = ($11 + 43) % 128;
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson[i2 + getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 381, (char) (62387 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                        byte b = (byte) ($$a[0] - 1);
                        byte b2 = b;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b, b2, b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getAid), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 3966 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (40223 - android.view.View.combineMeasuredStates(0, 0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 33, android.view.View.MeasureSpec.getMode(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.os.Process.myPid() >> 22))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } catch (java.lang.Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            char[] cArr = new char[i];
            getcvmmodel.valueOf = 0;
            while (getcvmmodel.valueOf < i) {
                $11 = ($10 + 99) % 128;
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.text.TextUtils.indexOf("", c2) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            }
            objArr[0] = new java.lang.String(cArr);
        }

        static void init$0() {
            $$a = new byte[]{1, 58, com.google.common.base.Ascii.FF, Byte.MIN_VALUE};
            $$b = 62;
        }

        static void writeReplace() {
            IccPrivateKeyCrtComponentsJson = new char[]{24319, 50928, 28412, 38597, 16090, 42684, 52920, 30379, 40582, 1683, 44649, 24302, 50926, 28385, 38605, 16073, 42656, 52896, 30368, 40578, 1669, 44652, 54889, 32375, 24319, 50930, 28390, 38605, 16068, 42671, 52904, 30384, 24314, 50924, 28414, 38598, 16084, 42681, 52911};
            getAid = 3214691829050164898L;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        getProfileVersion = 1;
        writeReplace();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{-665629288, -1724890231, 1038698509, -2035112997, -673701000, -1543183568, -472392222, -885980816, -778581654, -1935254386, -526480188, -1612361198, 1471395643, -239779808}, 28 - android.view.View.resolveSizeAndState(0, 0, 0), objArr);
        writeReplace = com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr[0]).intern());
        com.payair.hce.setRecords.values((byte) -92, com.payair.hce.setAckAutomaticallyResetByApplication.class);
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 65) % 128;
    }

    public setAckAutomaticallyResetByApplication() {
        DigitizedCardProfile((byte) 0);
        writeReplace((byte) 4);
        AlternateContactlessPaymentDataJson((byte) 0);
        values((byte) 5, (byte) 16);
        DigitizedCardProfile();
        writeReplace((java.util.List<com.payair.hce.onDeleteCardCompleted.valueOf>) null);
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int i2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = DigitizedCardProfile;
        int i3 = 16;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr2[i6])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> i3) + 27, 29 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.graphics.Color.argb(0, 0, 0, 0))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr3[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = 16;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $11 = ($10 + 39) % 128;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = DigitizedCardProfile;
        int i7 = 3;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            $11 = ($10 + 89) % 128;
            int i8 = 0;
            while (i8 < length3) {
                $11 = ($10 + i7) % 128;
                java.lang.Object[] objArr3 = new java.lang.Object[i4];
                objArr3[i5] = java.lang.Integer.valueOf(iArr5[i8]);
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 27, android.view.View.resolveSize(i5, i5) + 29, (char) ((android.os.Process.getThreadPriority(i5) + 20) >> 6))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                }
                iArr6[i8] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i8++;
                i7 = 3;
                i4 = 1;
                i5 = 0;
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        java.lang.System.arraycopy(iArr5, i2, iArr4, i2, length2);
        istransitsupported.valueOf = i2;
        while (istransitsupported.valueOf < iArr.length) {
            $10 = ($11 + 95) % 128;
            cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr4);
            $11 = ($10 + 43) % 128;
            for (int i9 = 0; i9 < 16; i9++) {
                $10 = ($11 + 89) % 128;
                istransitsupported.DigitizedCardProfile ^= iArr4[i9];
                java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.view.View.MeasureSpec.getSize(0) + 5088, (char) android.text.TextUtils.indexOf("", ""))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
            }
            int i10 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i10;
            istransitsupported.values ^= iArr4[16];
            istransitsupported.DigitizedCardProfile ^= iArr4[17];
            int i11 = istransitsupported.DigitizedCardProfile;
            int i12 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr4);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {istransitsupported, istransitsupported};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj4 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2922 - android.view.MotionEvent.axisFromString(""), (char) (3037 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b(0, (byte) 0, 0, objArr6);
                obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    /* renamed from: com.payair.hce.setAckAutomaticallyResetByApplication$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 {
        private static int DigitizedCardProfile = 0;
        static final /* synthetic */ int[] valueOf;
        private static int writeReplace = 1;

        static {
            int[] iArr = new int[com.payair.hce.setAckAutomaticallyResetByApplication.values.values().length];
            valueOf = iArr;
            try {
                iArr[com.payair.hce.setAckAutomaticallyResetByApplication.values.valueOf.ordinal()] = 1;
                int i = writeReplace;
                int i2 = i & 19;
                int i3 = (i | 19) & (~i2);
                int i4 = -(-(i2 << 1));
                DigitizedCardProfile = ((i3 & i4) + (i3 | i4)) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                valueOf[com.payair.hce.setAckAutomaticallyResetByApplication.values.DigitizedCardProfile.ordinal()] = 2;
                int i5 = DigitizedCardProfile;
                int i6 = i5 ^ 83;
                int i7 = -(-((i5 & 83) << 1));
                int i8 = (i6 & i7) + (i7 | i6);
                writeReplace = i8 % 128;
                int i9 = i8 % 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                valueOf[com.payair.hce.setAckAutomaticallyResetByApplication.values.AlternateContactlessPaymentDataJson.ordinal()] = 3;
                writeReplace = (DigitizedCardProfile + 3) % 128;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private com.payair.hce.getContactlessSupported valueOf(com.payair.hce.RemotePaymentData remotePaymentData) {
        com.payair.hce.setRemotePaymentSupported setremotepaymentsupported = new com.payair.hce.setRemotePaymentSupported();
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
        android.widget.ExpandableListView.getPackedPositionChild(0L);
        new java.lang.Object[]{(com.payair.hce.setAip) com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{remotePaymentData}, 447738352, -447738345, java.lang.System.identityHashCode(remotePaymentData))};
        com.payair.hce.transactionCanBeResumed values2 = ((com.payair.hce.setAip) com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{remotePaymentData}, 447738352, -447738345, java.lang.System.identityHashCode(remotePaymentData))).values();
        com.payair.hce.setAip setaip = (com.payair.hce.setAip) com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{remotePaymentData}, 447738352, -447738345, java.lang.System.identityHashCode(remotePaymentData));
        setremotepaymentsupported.valueOf(values2, (java.util.LinkedHashMap) com.payair.hce.setAip.DigitizedCardProfile(new java.lang.Object[]{setaip}, 749433121, -749433121, java.lang.System.identityHashCode(setaip)));
        int i = IccPrivateKeyCrtComponentsJson + 125;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            return setremotepaymentsupported;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
    
        if (r0.SdkCoreAlternateContactlessPaymentDataImpl() != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0168  */
    @Override // com.payair.hce.isPrimaryAidMchipDataValid
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final com.payair.hce.getContactlessSupported valueOf() throws com.payair.hce.digitize {
        com.payair.hce.setAckAutomaticallyResetByApplication.values valuesVar;
        int i;
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 125) % 128;
        com.payair.hce.access202 AlternateContactlessPaymentDataJson = this.values.AlternateContactlessPaymentDataJson();
        com.payair.hce.getCodeCacheDir getcodecachedir = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -1529917445, 1529917464, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson));
        com.payair.hce.setPanSequenceNumber setpansequencenumber = (com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir));
        com.payair.hce.RemotePaymentData writeReplace2 = setpansequencenumber.writeReplace();
        com.payair.hce.RemotePaymentData AlternateContactlessPaymentDataJson2 = setpansequencenumber.AlternateContactlessPaymentDataJson();
        com.payair.hce.onDeleteCardCompleted writeReplace3 = this.values.writeReplace();
        writeReplace3.writeReplace(com.payair.hce.onDeleteCardCompleted.valueOf.DigitizedCardProfile);
        com.payair.hce.isMagstripeDataValid ismagstripedatavalid = (com.payair.hce.isMagstripeDataValid) this.valueOf;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = (com.payair.hce.transactionCanBeResumed) com.payair.hce.isMagstripeDataValid.AlternateContactlessPaymentDataJson(new java.lang.Object[]{ismagstripedatavalid}, 272675787, -272675785, java.lang.System.identityHashCode(ismagstripedatavalid));
        com.payair.hce.transactionCanBeResumed transactioncanberesumed2 = (com.payair.hce.transactionCanBeResumed) com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{writeReplace2}, -37662452, 37662458, java.lang.System.identityHashCode(writeReplace2));
        com.payair.hce.transactionCanBeResumed transactioncanberesumed3 = AlternateContactlessPaymentDataJson2 != null ? (com.payair.hce.transactionCanBeResumed) com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{AlternateContactlessPaymentDataJson2}, -37662452, 37662458, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2)) : null;
        if (!transactioncanberesumed.getProfileVersion()) {
            int i2 = getProfileVersion + 11;
            IccPrivateKeyCrtComponentsJson = i2 % 128;
            if (i2 % 2 != 0) {
                transactioncanberesumed.valueOf(writeReplace);
                throw new java.lang.ArithmeticException();
            }
            if (transactioncanberesumed.valueOf(writeReplace)) {
                valuesVar = com.payair.hce.setAckAutomaticallyResetByApplication.values.valueOf;
            } else {
                com.payair.hce.createConfigurationContext createconfigurationcontext = (com.payair.hce.createConfigurationContext) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -775162360, 775162363, java.lang.System.identityHashCode(getcodecachedir));
                if (transactioncanberesumed2 != null) {
                    IccPrivateKeyCrtComponentsJson = (getProfileVersion + 3) % 128;
                    if (!transactioncanberesumed2.getProfileVersion() && transactioncanberesumed.valueOf(transactioncanberesumed2)) {
                        int i3 = IccPrivateKeyCrtComponentsJson + 3;
                        getProfileVersion = i3 % 128;
                        if (i3 % 2 == 0) {
                            createconfigurationcontext.valueOf();
                            throw new java.lang.ArithmeticException();
                        }
                        if (!createconfigurationcontext.valueOf()) {
                            getProfileVersion = (IccPrivateKeyCrtComponentsJson + 19) % 128;
                        }
                        valuesVar = com.payair.hce.setAckAutomaticallyResetByApplication.values.DigitizedCardProfile;
                        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 97) % 128;
                    }
                }
                if (transactioncanberesumed3 != null && !transactioncanberesumed3.getProfileVersion() && transactioncanberesumed.valueOf(transactioncanberesumed3)) {
                    getProfileVersion = (IccPrivateKeyCrtComponentsJson + 101) % 128;
                    if (createconfigurationcontext.AlternateContactlessPaymentDataJson()) {
                        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 21) % 128;
                        valuesVar = com.payair.hce.setAckAutomaticallyResetByApplication.values.AlternateContactlessPaymentDataJson;
                    }
                }
            }
            com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
            android.graphics.PointF.length(0.0f, 0.0f);
            new java.lang.Object[]{valuesVar.toString()};
            com.payair.hce.access202 AlternateContactlessPaymentDataJson3 = this.values.AlternateContactlessPaymentDataJson();
            com.payair.hce.requestChangePin requestchangepin = (com.payair.hce.requestChangePin) ((com.payair.hce.requestSetWalletPin) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{AlternateContactlessPaymentDataJson3}, 857149142, -857149112, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson3)));
            if (valuesVar != com.payair.hce.setAckAutomaticallyResetByApplication.values.AlternateContactlessPaymentDataJson) {
                requestchangepin.values(true);
            } else {
                requestchangepin.values(false);
            }
            i = com.payair.hce.setAckAutomaticallyResetByApplication.AnonymousClass5.valueOf[valuesVar.ordinal()];
            if (i != 1) {
                writeReplace3.writeReplace(com.payair.hce.onDeleteCardCompleted.valueOf.DigitizedCardProfile);
                com.payair.hce.setRemotePaymentSupported setremotepaymentsupported = new com.payair.hce.setRemotePaymentSupported();
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track22 = this.AlternateContactlessPaymentDataJson;
                android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
                new java.lang.Object[]{setpansequencenumber.values()};
                setremotepaymentsupported.DigitizedCardProfile(setpansequencenumber.values());
                return setremotepaymentsupported;
            }
            if (i == 2) {
                com.payair.hce.getContactlessSupported valueOf = valueOf(setpansequencenumber.writeReplace());
                writeReplace3.writeReplace(com.payair.hce.onDeleteCardCompleted.valueOf.writeReplace);
                return valueOf;
            }
            if (i != 3) {
                writeReplace3.writeReplace(com.payair.hce.onDeleteCardCompleted.valueOf.DigitizedCardProfile);
                throw new com.payair.hce.digitize(com.payair.hce.requestTaskStatusUpdate.getPinPreEntryAllowed);
            }
            com.payair.hce.getContactlessSupported valueOf2 = valueOf(setpansequencenumber.AlternateContactlessPaymentDataJson());
            writeReplace3.writeReplace(com.payair.hce.onDeleteCardCompleted.valueOf.writeReplace);
            return valueOf2;
        }
        valuesVar = com.payair.hce.setAckAutomaticallyResetByApplication.values.writeReplace;
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track23 = this.AlternateContactlessPaymentDataJson;
        android.graphics.PointF.length(0.0f, 0.0f);
        new java.lang.Object[]{valuesVar.toString()};
        com.payair.hce.access202 AlternateContactlessPaymentDataJson32 = this.values.AlternateContactlessPaymentDataJson();
        com.payair.hce.requestChangePin requestchangepin2 = (com.payair.hce.requestChangePin) ((com.payair.hce.requestSetWalletPin) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{AlternateContactlessPaymentDataJson32}, 857149142, -857149112, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson32)));
        if (valuesVar != com.payair.hce.setAckAutomaticallyResetByApplication.values.AlternateContactlessPaymentDataJson) {
        }
        i = com.payair.hce.setAckAutomaticallyResetByApplication.AnonymousClass5.valueOf[valuesVar.ordinal()];
        if (i != 1) {
        }
    }

    @Override // com.payair.hce.isPrimaryAidMchipDataValid
    protected final /* synthetic */ com.payair.hce.isMagstripeDataValid DigitizedCardProfile(byte[] bArr) throws com.payair.hce.digitize {
        com.payair.hce.isMagstripeDataValid ismagstripedatavalid = new com.payair.hce.isMagstripeDataValid(bArr);
        int i = getProfileVersion + 113;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            return ismagstripedatavalid;
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{89, 16, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -117};
        $$b = 71;
    }

    static void writeReplace() {
        DigitizedCardProfile = new int[]{-1165787009, -2083744580, 314851623, 1727784643, 1960716282, -1012549394, -1277068409, 1861141937, 608316114, -654490798, -94795915, 1085882319, 2015041561, -980443118, -1868642189, 736726586, -211971903, 1636881192};
    }
}
