package com.payair.hce;

/* loaded from: classes4.dex */
class checkCallingPermission implements com.payair.hce.setStatusCodeFromServer {
    private static com.payair.hce.checkCallingPermission.AlternateContactlessPaymentDataJson AlternateContactlessPaymentDataJson = null;
    private static int DigitizedCardProfile = 0;
    private static int valueOf = 15;
    private static com.payair.hce.checkCallingPermission.writeReplace writeReplace;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = i4 | i5;
        return ((((i * 51) + (i2 * (-49))) + ((i | i3) * (-50))) + (((~(((~i) | i4) | i3)) | (~(i6 | i))) * 50)) + ((((~(i | i4)) | (~i6)) | (~(i | i5))) * 50) != 1 ? DigitizedCardProfile(objArr) : writeReplace(objArr);
    }

    checkCallingPermission() {
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        int i = valueOf + 101;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            return AlternateContactlessPaymentDataJson;
        }
        throw null;
    }

    static {
        int i = 15 % 2;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.checkCallingPermission checkcallingpermission = (com.payair.hce.checkCallingPermission) objArr[0];
        com.payair.hce.setStatusCodeFromServer setstatuscodefromserver = (com.payair.hce.setStatusCodeFromServer) objArr[1];
        int i = DigitizedCardProfile;
        valueOf = (i + 65) % 128;
        com.payair.hce.checkCallingPermission.writeReplace writereplace = writeReplace;
        if (writereplace != null) {
            int i2 = ((i | 63) << 1) - (i ^ 63);
            valueOf = i2 % 128;
            if (i2 % 2 == 0) {
                writereplace.quitSafely();
                throw new java.lang.ArithmeticException();
            }
            writereplace.quitSafely();
            int i3 = DigitizedCardProfile;
            int i4 = i3 & 105;
            int i5 = ((i3 ^ 105) | i4) << 1;
            int i6 = -((i3 | 105) & (~i4));
            valueOf = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
        }
        com.payair.hce.checkCallingPermission.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson;
        if (alternateContactlessPaymentDataJson != null) {
            int i7 = valueOf;
            int i8 = ((i7 ^ 75) | (i7 & 75)) << 1;
            int i9 = -((i7 & (-76)) | ((~i7) & 75));
            DigitizedCardProfile = ((i8 & i9) + (i9 | i8)) % 128;
            alternateContactlessPaymentDataJson.clear();
            int i10 = DigitizedCardProfile;
            valueOf = (((i10 | 15) << 1) - (i10 ^ 15)) % 128;
        }
        if (setstatuscodefromserver == null) {
            int i11 = DigitizedCardProfile;
            int i12 = (i11 & 115) + (i11 | 115);
            valueOf = i12 % 128;
            if (i12 % 2 != 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        AlternateContactlessPaymentDataJson = checkcallingpermission.new AlternateContactlessPaymentDataJson(setstatuscodefromserver);
        com.payair.hce.checkCallingPermission.writeReplace writereplace2 = checkcallingpermission.new writeReplace(setstatuscodefromserver);
        writeReplace = writereplace2;
        writereplace2.start();
        int i13 = valueOf;
        int i14 = i13 & 35;
        int i15 = -(-(i13 | 35));
        int i16 = (i14 & i15) + (i15 | i14);
        DigitizedCardProfile = i16 % 128;
        if (i16 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    final class writeReplace extends android.os.HandlerThread {
        private static int AlternateContactlessPaymentDataJson = 0;
        private static int valueOf = 1;
        private final com.payair.hce.setStatusCodeFromServer DigitizedCardProfile;
        private boolean values;

        public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
            int i4 = ~i;
            int i5 = ~i2;
            return ((((i * (-661)) + (i2 * (-661))) + (((~i3) | (~(i4 | i5))) * 1324)) + (((~(i3 | i)) | (~(i3 | i2))) * (-1324))) + (((~(i | i5)) | (~(i2 | i4))) * 662) != 1 ? DigitizedCardProfile(objArr) : valueOf(objArr);
        }

        public writeReplace(com.payair.hce.setStatusCodeFromServer setstatuscodefromserver) {
            super("checkCallingPermission", 11);
            this.values = true;
            this.DigitizedCardProfile = setstatuscodefromserver;
        }

        private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
            com.payair.hce.checkCallingPermission.writeReplace writereplace = (com.payair.hce.checkCallingPermission.writeReplace) objArr[0];
            while (true) {
                if (!writereplace.values) {
                    break;
                }
                int i = AlternateContactlessPaymentDataJson;
                int i2 = i & 89;
                int i3 = -(-((i ^ 89) | i2));
                valueOf = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
                try {
                    java.lang.Thread.yield();
                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
                if (writereplace.DigitizedCardProfile == null) {
                    int i4 = valueOf;
                    int i5 = i4 & 95;
                    int i6 = (i4 ^ 95) | i5;
                    AlternateContactlessPaymentDataJson = (((i5 | i6) << 1) - (i5 ^ i6)) % 128;
                    writereplace.values = false;
                    int i7 = (i4 & 14) + (i4 | 14);
                    AlternateContactlessPaymentDataJson = ((~i7) + (i7 << 1)) % 128;
                    break;
                }
                AlternateContactlessPaymentDataJson(new java.lang.Object[]{writereplace, ((com.payair.hce.checkCallingPermission.AlternateContactlessPaymentDataJson) com.payair.hce.checkCallingPermission.writeReplace(new java.lang.Object[0], -1394885552, 1394885553, (int) java.lang.System.currentTimeMillis())).take()}, 1353392106, -1353392106, java.lang.System.identityHashCode(writereplace));
                int i8 = AlternateContactlessPaymentDataJson;
                int i9 = i8 | 65;
                int i10 = i9 << 1;
                int i11 = -((~(i8 & 65)) & i9);
                valueOf = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
            }
            writereplace.quit();
            int i12 = valueOf;
            int i13 = i12 & 115;
            AlternateContactlessPaymentDataJson = (((i12 | 115) & (~i13)) + (i13 << 1)) % 128;
            return null;
        }

        private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
            com.payair.hce.checkCallingPermission.writeReplace writereplace = (com.payair.hce.checkCallingPermission.writeReplace) objArr[0];
            com.payair.hce.checkCallingPermission.values valuesVar = (com.payair.hce.checkCallingPermission.values) objArr[1];
            int i = AlternateContactlessPaymentDataJson;
            valueOf = ((i ^ 11) + ((i & 11) << 1)) % 128;
            if (writereplace.DigitizedCardProfile == null) {
                valueOf = (i + 67) % 128;
                return null;
            }
            int i2 = com.payair.hce.checkCallingPermission.AnonymousClass5.valueOf[valuesVar.DigitizedCardProfile().ordinal()];
            if (i2 == 1) {
                valuesVar.values();
                valuesVar.writeReplace();
                int i3 = valueOf;
                AlternateContactlessPaymentDataJson = ((((i3 ^ 37) | (i3 & 37)) << 1) - ((i3 & (-38)) | ((~i3) & 37))) % 128;
                return null;
            }
            if (i2 == 2) {
                valuesVar.values();
                valuesVar.writeReplace();
                int i4 = valueOf + 11;
                AlternateContactlessPaymentDataJson = i4 % 128;
                if (i4 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            if (i2 == 3) {
                valuesVar.valueOf();
                valuesVar.values();
                valuesVar.writeReplace();
                int i5 = AlternateContactlessPaymentDataJson;
                int i6 = i5 & 61;
                int i7 = (i6 - (~(-(-((i5 ^ 61) | i6))))) - 1;
                valueOf = i7 % 128;
                if (i7 % 2 != 0) {
                    return null;
                }
                throw new java.lang.ArithmeticException();
            }
            if (i2 == 4) {
                valuesVar.values();
                valuesVar.writeReplace();
                int i8 = valueOf;
                int i9 = i8 & 57;
                int i10 = (i8 | 57) & (~i9);
                int i11 = -(-(i9 << 1));
                AlternateContactlessPaymentDataJson = ((i10 ^ i11) + ((i10 & i11) << 1)) % 128;
                return null;
            }
            if (i2 == 5) {
                valuesVar.values();
                valuesVar.writeReplace();
                int i12 = AlternateContactlessPaymentDataJson + 73;
                valueOf = i12 % 128;
                if (i12 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            valuesVar.values();
            valuesVar.writeReplace();
            int i13 = valueOf;
            int i14 = i13 ^ 5;
            int i15 = ((i13 & 5) | i14) << 1;
            int i16 = -i14;
            int i17 = (i15 & i16) + (i15 | i16);
            AlternateContactlessPaymentDataJson = i17 % 128;
            if (i17 % 2 == 0) {
                return null;
            }
            throw null;
        }

        private void values(com.payair.hce.checkCallingPermission.values valuesVar) {
            AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, valuesVar}, 1353392106, -1353392106, java.lang.System.identityHashCode(this));
        }

        @Override // android.os.HandlerThread
        protected final void onLooperPrepared() {
            AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 175451044, -175451043, java.lang.System.identityHashCode(this));
        }
    }

    /* renamed from: com.payair.hce.checkCallingPermission$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 {
        private static int DigitizedCardProfile = 0;
        static final /* synthetic */ int[] valueOf;
        private static int values = 1;

        static {
            int[] iArr = new int[com.payair.hce.checkCallingPermission.valueOf.values().length];
            valueOf = iArr;
            try {
                iArr[com.payair.hce.checkCallingPermission.valueOf.DigitizedCardProfile.ordinal()] = 1;
                int i = values;
                int i2 = i & 29;
                int i3 = ((i | 29) & (~i2)) + (i2 << 1);
                DigitizedCardProfile = i3 % 128;
                int i4 = i3 % 2;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                valueOf[com.payair.hce.checkCallingPermission.valueOf.AlternateContactlessPaymentDataJson.ordinal()] = 2;
                int i5 = values;
                int i6 = i5 | 77;
                DigitizedCardProfile = ((i6 << 1) - ((~(i5 & 77)) & i6)) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                valueOf[com.payair.hce.checkCallingPermission.valueOf.valueOf.ordinal()] = 3;
                int i7 = values;
                int i8 = (i7 & (-100)) | ((~i7) & 99);
                int i9 = -(-((i7 & 99) << 1));
                DigitizedCardProfile = (((i8 | i9) << 1) - (i9 ^ i8)) % 128;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                valueOf[com.payair.hce.checkCallingPermission.valueOf.values.ordinal()] = 4;
                int i10 = values;
                int i11 = i10 & 47;
                int i12 = ((i10 ^ 47) | i11) << 1;
                int i13 = -((i10 | 47) & (~i11));
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                DigitizedCardProfile = i14 % 128;
                int i15 = i14 % 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                valueOf[com.payair.hce.checkCallingPermission.valueOf.getProfileVersion.ordinal()] = 5;
                int i16 = values + 25;
                DigitizedCardProfile = i16 % 128;
                int i17 = i16 % 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                valueOf[com.payair.hce.checkCallingPermission.valueOf.writeReplace.ordinal()] = 6;
                int i18 = DigitizedCardProfile;
                int i19 = i18 | 95;
                int i20 = (i19 << 1) - ((~(i18 & 95)) & i19);
                values = i20 % 128;
                if (i20 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
            } catch (java.lang.NoSuchFieldError unused6) {
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
    static final class valueOf {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        public static final com.payair.hce.checkCallingPermission.valueOf AlternateContactlessPaymentDataJson;
        public static final com.payair.hce.checkCallingPermission.valueOf DigitizedCardProfile;
        private static int IccPrivateKeyCrtComponentsJson;
        private static int RecordsJson;
        private static int SdkCoreAlternateContactlessPaymentDataImpl;
        private static int SdkCoreBusinessLogicModuleImpl;
        private static final /* synthetic */ com.payair.hce.checkCallingPermission.valueOf[] getAid;
        private static short[] getCiacDecline;
        private static int getGpoResponse;
        private static byte[] getPaymentFci;
        public static final com.payair.hce.checkCallingPermission.valueOf getProfileVersion;
        public static final com.payair.hce.checkCallingPermission.valueOf valueOf;
        public static final com.payair.hce.checkCallingPermission.valueOf values;
        public static final com.payair.hce.checkCallingPermission.valueOf writeReplace;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(int i, short s, int i2, java.lang.Object[] objArr) {
            int i3;
            int i4;
            int i5;
            int i6 = 4 - (s * 3);
            byte[] bArr = $$a;
            int i7 = (i * 4) + 104;
            int i8 = 1 - (i2 * 4);
            byte[] bArr2 = new byte[i8];
            if (bArr == null) {
                int i9 = i6;
                i5 = 0;
                i6 += i7;
                i4 = i9 + 1;
                i3 = i5;
                i5 = i3 + 1;
                bArr2[i3] = (byte) i6;
                if (i5 == i8) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i9 = i4;
                i7 = bArr[i4];
                i6 += i7;
                i4 = i9 + 1;
                i3 = i5;
                i5 = i3 + 1;
                bArr2[i3] = (byte) i6;
                if (i5 == i8) {
                }
            } else {
                i3 = 0;
                i6 = i7;
                i4 = i6;
                i5 = i3 + 1;
                bArr2[i3] = (byte) i6;
                if (i5 == i8) {
                }
            }
        }

        private valueOf(java.lang.String str, int i) {
        }

        public static com.payair.hce.checkCallingPermission.valueOf valueOf(java.lang.String str) {
            SdkCoreBusinessLogicModuleImpl = (getGpoResponse + 35) % 128;
            com.payair.hce.checkCallingPermission.valueOf valueof = (com.payair.hce.checkCallingPermission.valueOf) java.lang.Enum.valueOf(com.payair.hce.checkCallingPermission.valueOf.class, str);
            int i = SdkCoreBusinessLogicModuleImpl + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getGpoResponse = i % 128;
            if (i % 2 == 0) {
                return valueof;
            }
            throw new java.lang.ArithmeticException();
        }

        public static com.payair.hce.checkCallingPermission.valueOf[] values() {
            int i = SdkCoreBusinessLogicModuleImpl + 7;
            getGpoResponse = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            com.payair.hce.checkCallingPermission.valueOf[] valueofArr = (com.payair.hce.checkCallingPermission.valueOf[]) getAid.clone();
            SdkCoreBusinessLogicModuleImpl = (getGpoResponse + 107) % 128;
            return valueofArr;
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getGpoResponse = 0;
            SdkCoreBusinessLogicModuleImpl = 1;
            AlternateContactlessPaymentDataJson();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((short) ((-1) - android.view.MotionEvent.axisFromString("")), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 18806, (-1857633265) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.text.TextUtils.getOffsetBefore("", 0) - 56, (byte) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
            com.payair.hce.checkCallingPermission.valueOf valueof = new com.payair.hce.checkCallingPermission.valueOf(((java.lang.String) objArr[0]).intern(), 0);
            DigitizedCardProfile = valueof;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a((short) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-1592346932) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.graphics.Color.green(0) - 1857633261, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 57, (byte) android.widget.ExpandableListView.getPackedPositionType(0L), objArr2);
            com.payair.hce.checkCallingPermission.valueOf valueof2 = new com.payair.hce.checkCallingPermission.valueOf(((java.lang.String) objArr2[0]).intern(), 1);
            values = valueof2;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a((short) android.text.TextUtils.indexOf("", "", 0), (-1592346950) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (-1857633255) - android.graphics.ImageFormat.getBitsPerPixel(0), (-57) - android.widget.ExpandableListView.getPackedPositionChild(0L), (byte) android.view.View.resolveSize(0, 0), objArr3);
            com.payair.hce.checkCallingPermission.valueOf valueof3 = new com.payair.hce.checkCallingPermission.valueOf(((java.lang.String) objArr3[0]).intern(), 2);
            valueOf = valueof3;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((short) android.text.TextUtils.getOffsetAfter("", 0), (-1592346948) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (-1857633245) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 56, (byte) android.text.TextUtils.getOffsetAfter("", 0), objArr4);
            com.payair.hce.checkCallingPermission.valueOf valueof4 = new com.payair.hce.checkCallingPermission.valueOf(((java.lang.String) objArr4[0]).intern(), 3);
            AlternateContactlessPaymentDataJson = valueof4;
            short myTid = (short) (android.os.Process.myTid() >> 22);
            int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
            float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
            int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(myTid, (keyRepeatDelay >> 16) - 1592346945, (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)) - 1857633241, (maximumFlingVelocity >> 16) - 56, (byte) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr5);
            com.payair.hce.checkCallingPermission.valueOf valueof5 = new com.payair.hce.checkCallingPermission.valueOf(((java.lang.String) objArr5[0]).intern(), 4);
            writeReplace = valueof5;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a((short) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (-1592346931) - (android.os.Process.myPid() >> 22), (-1857633236) - (android.os.Process.myTid() >> 22), (android.view.ViewConfiguration.getEdgeSlop() >> 16) - 56, (byte) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr6);
            com.payair.hce.checkCallingPermission.valueOf valueof6 = new com.payair.hce.checkCallingPermission.valueOf(((java.lang.String) objArr6[0]).intern(), 5);
            getProfileVersion = valueof6;
            getAid = new com.payair.hce.checkCallingPermission.valueOf[]{valueof, valueof2, valueof3, valueof4, valueof5, valueof6};
            SdkCoreBusinessLogicModuleImpl = (getGpoResponse + 3) % 128;
        }

        private static void a(short s, int i, int i2, int i3, byte b, java.lang.Object[] objArr) {
            int length;
            byte[] bArr;
            com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(RecordsJson)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                if (obj == null) {
                    obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.Process.myPid() >> 22), 29 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.text.TextUtils.getCapsMode("", 0, 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                int i4 = intValue == -1 ? 1 : 0;
                char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                if (i4 != 0) {
                    byte[] bArr2 = getPaymentFci;
                    if (bArr2 != null) {
                        int i5 = $11 + 49;
                        $10 = i5 % 128;
                        if (i5 % 2 != 0) {
                            length = bArr2.length;
                            bArr = new byte[length];
                        } else {
                            length = bArr2.length;
                            bArr = new byte[length];
                        }
                        int i6 = 0;
                        while (i6 < length) {
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr2[i6])};
                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                            if (obj2 == null) {
                                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.view.Gravity.getAbsoluteGravity(0, 0), 5087 - android.text.TextUtils.indexOf("", c), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("e", java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                            }
                            bArr[i6] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                            i6++;
                            c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                        }
                        bArr2 = bArr;
                    }
                    if (bArr2 != null) {
                        $11 = ($10 + 33) % 128;
                        byte[] bArr3 = getPaymentFci;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                        if (obj3 == null) {
                            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.getCapsMode("", 0, 0), 29 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                        }
                        intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (RecordsJson ^ (-4897270311952305750L))));
                    } else {
                        intValue = (short) (((short) (getCiacDecline[i2 + ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (RecordsJson ^ (-4897270311952305750L))));
                        $10 = ($11 + 103) % 128;
                    }
                }
                if (intValue > 0) {
                    gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ (-4897270311952305750L))) + i4;
                    java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson), sb};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                    if (obj4 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 21, 2363 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((-1) - android.os.Process.getGidForName("")));
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        b(0, (short) 0, 0, objArr6);
                        obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                    }
                    ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                    byte[] bArr4 = getPaymentFci;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i7 = 0; i7 < length2; i7++) {
                            bArr5[i7] = (byte) (bArr4[i7] ^ (-4897270311952305750L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    gettrack2constructiondata.DigitizedCardProfile = 1;
                    while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                        if (z) {
                            $11 = ($10 + 107) % 128;
                            byte[] bArr6 = getPaymentFci;
                            gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                            gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                        } else {
                            short[] sArr = getCiacDecline;
                            gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                            gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
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
            SdkCoreAlternateContactlessPaymentDataImpl = 1908214360;
            RecordsJson = 520368541;
            IccPrivateKeyCrtComponentsJson = 1106081824;
            getPaymentFci = new byte[]{100, 88, -71, 87, -85, 122, 88, -82, -89, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -89, 69, 120, 85, -84, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -82, -95, -88, 65, -71, 100, -87, 87, -86, -89, 103, -93, 82, -81, 103, 86, -69, 64};
        }

        static void init$0() {
            $$a = new byte[]{32, 19, -11, 104};
            $$b = 33;
        }
    }

    public class AlternateContactlessPaymentDataJson extends java.util.concurrent.LinkedBlockingQueue<com.payair.hce.checkCallingPermission.values> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char DigitizedCardProfile;
        private static char[] IccPrivateKeyCrtComponentsJson;
        private static int RecordsJson;
        private static char SdkCoreAlternateContactlessPaymentDataImpl;
        private static int SdkCoreBusinessLogicModuleImpl;
        private static boolean getAid;
        private static int getGpoResponse;
        private static boolean getProfileVersion;
        private static char valueOf;
        private static char values;
        private final com.payair.hce.setStatusCodeFromServer AlternateContactlessPaymentDataJson;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, byte b, int i2, java.lang.Object[] objArr) {
            int i3;
            int i4;
            int i5 = 65 - (i2 * 2);
            byte[] bArr = $$a;
            int i6 = 3 - (b * 3);
            int i7 = 35 - (i * 2);
            byte[] bArr2 = new byte[i7];
            if (bArr == null) {
                int i8 = i7;
                int i9 = i6;
                i4 = 0;
                int i10 = (i6 + i8) - 2;
                i3 = i4;
                int i11 = i9;
                i5 = i10;
                i6 = i11;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i5;
                if (i4 == i7) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                int i12 = i6 + 1;
                i8 = bArr[i12];
                int i13 = i5;
                i9 = i12;
                i6 = i13;
                int i102 = (i6 + i8) - 2;
                i3 = i4;
                int i112 = i9;
                i5 = i102;
                i6 = i112;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i5;
                if (i4 == i7) {
                }
            } else {
                i3 = 0;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i5;
                if (i4 == i7) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void d(short s, int i, short s2, java.lang.Object[] objArr) {
            int i2;
            int i3 = (s2 * 8) + 110;
            byte[] bArr = $$d;
            int i4 = i + 4;
            int i5 = s * 4;
            byte[] bArr2 = new byte[i5 + 1];
            if (bArr == null) {
                int i6 = i3;
                i2 = 0;
                int i7 = i4;
                int i8 = i7;
                i3 = i4 + i6;
                i4 = i8;
                int i9 = i4 + 1;
                bArr2[i2] = (byte) i3;
                if (i2 == i5) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i2++;
                i6 = bArr[i9];
                int i10 = i3;
                i7 = i9;
                i4 = i10;
                int i82 = i7;
                i3 = i4 + i6;
                i4 = i82;
                int i92 = i4 + 1;
                bArr2[i2] = (byte) i3;
                if (i2 == i5) {
                }
            } else {
                i2 = 0;
                int i922 = i4 + 1;
                bArr2[i2] = (byte) i3;
                if (i2 == i5) {
                }
            }
        }

        private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
            int i2 = $11 + 65;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            char[] charArray = str != null ? str.toCharArray() : str;
            com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
            char[] cArr = new char[charArray.length];
            getproducttype.AlternateContactlessPaymentDataJson = 0;
            char[] cArr2 = new char[2];
            while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
                cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
                cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
                int i3 = 58224;
                for (int i4 = 0; i4 < 16; i4++) {
                    $10 = ($11 + 77) % 128;
                    char c = cArr2[1];
                    char c2 = cArr2[0];
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (valueOf ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                        int i5 = c2 + i3;
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 62, android.graphics.Color.alpha(0) + 1335, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            d((short) 0, -1, (short) 0, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                        }
                        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        cArr2[1] = charValue;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (DigitizedCardProfile ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(values)};
                        int i6 = charValue + i3;
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.widget.ExpandableListView.getPackedPositionChild(0L) + 1336, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            d((short) 0, -1, (short) 0, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                        }
                        cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                        i3 -= 40503;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
                cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
                java.lang.Object[] objArr6 = {getproducttype, getproducttype};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.text.TextUtils.indexOf("", "", 0) + 3543, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
                $10 = ($11 + 77) % 128;
            }
            objArr[0] = new java.lang.String(cArr, 0, i);
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
        public /* synthetic */ boolean add(java.lang.Object obj) {
            SdkCoreBusinessLogicModuleImpl = (getGpoResponse + 35) % 128;
            boolean DigitizedCardProfile2 = DigitizedCardProfile((com.payair.hce.checkCallingPermission.values) obj);
            getGpoResponse = (SdkCoreBusinessLogicModuleImpl + 99) % 128;
            return DigitizedCardProfile2;
        }

        AlternateContactlessPaymentDataJson(com.payair.hce.setStatusCodeFromServer setstatuscodefromserver) {
            this.AlternateContactlessPaymentDataJson = setstatuscodefromserver;
        }

        private static void c(int[] iArr, java.lang.String str, int i, java.lang.String str2, java.lang.Object[] objArr) {
            java.lang.String str3 = str2;
            byte[] bArr = str3;
            if (str3 != null) {
                bArr = str3.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            char[] charArray = str != null ? str.toCharArray() : str;
            com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
            char[] cArr = IccPrivateKeyCrtComponentsJson;
            long j = 0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i2 = 0;
                while (i2 < length) {
                    $10 = ($11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i2])};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                        if (obj == null) {
                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.view.View.getDefaultSize(0, 0), 285 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), (char) (android.graphics.Color.red(0) + 46337))).getMethod("y", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                        }
                        cArr2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        i2++;
                        j = 0;
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
            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(RecordsJson)};
            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
            if (obj2 == null) {
                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 287 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (46337 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)))).getMethod("x", java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
            float f = 0.0f;
            if (getAid) {
                getumdgeneration.values = bArr2.length;
                char[] cArr3 = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 0;
                while (getumdgeneration.valueOf < getumdgeneration.values) {
                    $11 = ($10 + 91) % 128;
                    cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                    java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                    if (obj3 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1629, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d((short) 0, -1, (short) 1, objArr5);
                        obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
                }
                objArr[0] = new java.lang.String(cArr3);
                return;
            }
            if (!getProfileVersion) {
                getumdgeneration.values = iArr.length;
                char[] cArr4 = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 0;
                while (getumdgeneration.valueOf < getumdgeneration.values) {
                    cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                    getumdgeneration.valueOf++;
                }
                objArr[0] = new java.lang.String(cArr4);
                return;
            }
            getumdgeneration.values = charArray.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                int i3 = $10 + 37;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values % 1) << getumdgeneration.valueOf] - i] * intValue);
                    java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                    if (obj4 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.View.resolveSizeAndState(0, 0, 0), 1630 - (android.media.AudioTrack.getMaxVolume() > f ? 1 : (android.media.AudioTrack.getMaxVolume() == f ? 0 : -1)), (char) (android.graphics.PointF.length(f, f) > f ? 1 : (android.graphics.PointF.length(f, f) == f ? 0 : -1)));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        d((short) 0, -1, (short) 1, objArr7);
                        obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                } else {
                    cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                    java.lang.Object[] objArr8 = {getumdgeneration, getumdgeneration};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                    if (obj5 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > f ? 1 : (android.media.AudioTrack.getMaxVolume() == f ? 0 : -1)) + 42, 1628 - android.view.MotionEvent.axisFromString(""), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        d((short) 0, -1, (short) 1, objArr9);
                        obj5 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj5);
                    }
                    ((java.lang.reflect.Method) obj5).invoke(null, objArr8);
                    f = 0.0f;
                }
            }
            objArr[0] = new java.lang.String(cArr5);
        }

        public final boolean DigitizedCardProfile(com.payair.hce.checkCallingPermission.values valuesVar) {
            int i = (SdkCoreBusinessLogicModuleImpl + 31) % 128;
            getGpoResponse = i;
            if (this.AlternateContactlessPaymentDataJson == null) {
                int i2 = i + 37;
                SdkCoreBusinessLogicModuleImpl = i2 % 128;
                return i2 % 2 == 0;
            }
            boolean add = super.add(valuesVar);
            int i3 = SdkCoreBusinessLogicModuleImpl + 89;
            getGpoResponse = i3 % 128;
            if (i3 % 2 == 0) {
                return add;
            }
            throw null;
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getGpoResponse = 0;
            SdkCoreBusinessLogicModuleImpl = 1;
            DigitizedCardProfile = (char) 44910;
            values = (char) 8527;
            valueOf = (char) 40213;
            SdkCoreAlternateContactlessPaymentDataImpl = (char) 63744;
            IccPrivateKeyCrtComponentsJson = new char[]{10890, 10887, 10932, 10888, 11111, 11117, 11131, 11110, 11104, 10921, 10893, 11116, 11115, 11132, 11118, 10917, 10886, 10908, 10906, 11112, 10919, 11114, 11133, 11121, 10905, 11106, 11108, 11129, 10880, 11119, 11130, 10897, 10940, 10937, 10928, 11107, 11135, 11120, 10895, 10891};
            RecordsJson = -143185207;
            getProfileVersion = true;
            getAid = true;
        }

        static void init$1() {
            $$d = new byte[]{46, -52, 83, 98};
            $$e = 57;
        }

        static void init$0() {
            $$a = new byte[]{7, -8, -91, 32, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
            $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE;
        }

        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1, types: [int[], java.lang.String] */
        /* JADX WARN: Type inference failed for: r12v20 */
        public static java.lang.Object[] values(android.content.Context context, int i, int i2) {
            int i3;
            int i4 = 0;
            ?? r12 = 0;
            int i5 = 1;
            try {
                if (context == null) {
                    java.lang.Object[] objArr = {new int[]{i}, new int[]{i}, null, new int[1]};
                    int i6 = ~i;
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((i | 1037922353) * (-859)) + 1798532838 + (((~(i | (-1007157282))) | (~(1037922353 | i6))) * 859) + (((~(32993368 | i6)) | (-1040150650)) * 859))};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 50, 2712 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                        byte b = (byte) ($$a[14] - 1);
                        byte b2 = b;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a(b, b2, b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    return objArr;
                }
                try {
                    try {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        b("\ue102입\uf79f쀾눣쮱ዽ쐡ゔᄡ튗픗\ud9bb嗏㘖맻檖\uf771棷糊╙\uf230莦笿ꎁ\uf54cᖺ됯껲\ue001튗픗鳔纸∝諏ᶫ\uec0b", android.view.MotionEvent.axisFromString("") + 39, objArr4);
                        java.lang.Object[] objArr5 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(((java.lang.String) objArr4[0]).intern()), 2);
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        c(null, null, 128 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0093\u0092\u0083\u0081\u0090\u0086\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0091\u0090\u008f\u008e\u008d\u008c\u008b\u008a\u0086\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr6);
                        try {
                            java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b("\ue102입\uf79f쀾눣쮱ዽ쐡ゔᄡ튗픗\ud9bb嗏㘖맻檖\uf771棷糊╙\uf230莦笿ꎁ\uf54cᖺ됯껲\ue001튗픗鳔纸∝諏ᶫ\uec0b", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 38, objArr8);
                            objArr5[0] = java.lang.Class.forName(((java.lang.String) objArr8[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr7);
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            c(null, null, 126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u008f\u008e\u008d\u008c\u008b\u008a\u0086\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u0090\u0086\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0091\u0090\u0093\u0092\u0083\u0081", objArr9);
                            try {
                                java.lang.Object[] objArr10 = {((java.lang.String) objArr9[0]).intern()};
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                b("\ue102입\uf79f쀾눣쮱ዽ쐡ゔᄡ튗픗\ud9bb嗏㘖맻檖\uf771棷糊╙\uf230莦笿ꎁ\uf54cᖺ됯껲\ue001튗픗鳔纸∝諏ᶫ\uec0b", android.text.TextUtils.getOffsetAfter("", 0) + 38, objArr11);
                                objArr5[1] = java.lang.Class.forName(((java.lang.String) objArr11[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr10);
                                try {
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    c(null, null, 127 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0097\u0098\u008c\u0097\u0085\u0088\u0081\u0095\u0097\u0085\u008c\u0097\u0085\u0088\u0096\u0095\u0086\u0089\u0088\u0087\u0086\u0085\u0094", objArr12);
                                    java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr12[0]).intern());
                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                    b("त閗鍛\u0bd6௮䈇Ἒ宐त閗⽄ㄙ붞䅀त閗猊㿒", 17 - (android.os.Process.myTid() >> 22), objArr13);
                                    java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr13[0]).intern(), null).invoke(context, null);
                                    try {
                                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                                        c(null, null, 127 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0097\u0098\u008c\u0097\u0085\u0088\u0081\u0095\u0097\u0085\u008c\u0097\u0085\u0088\u0096\u0095\u0086\u0089\u0088\u0087\u0086\u0085\u0094", objArr14);
                                        java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr14[0]).intern());
                                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                                        c(null, null, 127 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), "\u008c\u009b\u0094\u0082\u008c\u008f\u0094\u009a\u0096\u0094\u0099\u0097\u008c\u008f", objArr15);
                                        try {
                                            java.lang.Object[] objArr16 = {cls3.getMethod(((java.lang.String) objArr15[0]).intern(), null).invoke(context, null), 64};
                                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                                            b("뇈滂\ud819泭ⵯ潆㹌⌣\uf8edẁ鯢୯黹湔\u2dcf틆\uf6af䑃ﮭ\uee1e௮䈇Ἒ宐त閗⽄ㄙ붞䅀त閗猊㿒", 33 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr17);
                                            java.lang.Class<?> cls4 = java.lang.Class.forName(((java.lang.String) objArr17[0]).intern());
                                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                                            b("त閗鍛\u0bd6௮䈇Ἒ宐त閗缤ꄅ磞朚", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 15, objArr18);
                                            java.lang.Object invoke2 = cls4.getMethod(((java.lang.String) objArr18[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr16);
                                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                                            c(null, null, 127 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), "\u0088\u009e\u0085\u009d\u008c\u008f\u0094\u009a\u0096\u0094\u0099\u0095\u009b\u009c\u0095\u0097\u0085\u008c\u0097\u0085\u0088\u0096\u0095\u0086\u0089\u0088\u0087\u0086\u0085\u0094", objArr19);
                                            java.lang.Class<?> cls5 = java.lang.Class.forName(((java.lang.String) objArr19[0]).intern());
                                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                                            c(null, null, android.text.TextUtils.indexOf("", "", 0) + 127, "\u009f\u008c\u0087\u008e\u0097\u0094\u0085\u008f\u0089\u009f", objArr20);
                                            java.lang.Object[] objArr21 = (java.lang.Object[]) cls5.getField(((java.lang.String) objArr20[0]).intern()).get(invoke2);
                                            int length = objArr21.length;
                                            int i7 = 0;
                                            while (i7 < length) {
                                                java.lang.Object obj2 = objArr21[i7];
                                                java.lang.Object[] objArr22 = new java.lang.Object[i5];
                                                c(r12, r12, android.text.TextUtils.getTrimmedLength("") + 127, "£¢¡\u0095 ", objArr22);
                                                try {
                                                    java.lang.Object[] objArr23 = {((java.lang.String) objArr22[i4]).intern()};
                                                    java.lang.Object[] objArr24 = new java.lang.Object[i5];
                                                    c(r12, r12, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, "¦\u0087\u0088\u0097\u0096\u0094§\u008c\u0097\u0094\u0096\u0089\u009e\u0089\u0097\u0087\u008c\u0081\u0095\u0097\u0087\u008c\u0096\u0095¦\u0097\u0089\u0087\u008e\u0096\u008c\u009f\u0095\u0094¥\u0094¤", objArr24);
                                                    java.lang.Class<?> cls6 = java.lang.Class.forName(((java.lang.String) objArr24[i4]).intern());
                                                    java.lang.Object[] objArr25 = new java.lang.Object[i5];
                                                    b("त閗䅷ᦑ醸䦴☲硢鳔纸륮\ue0d9", android.view.Gravity.getAbsoluteGravity(i4, i4) + 11, objArr25);
                                                    java.lang.String intern = ((java.lang.String) objArr25[i4]).intern();
                                                    java.lang.Class<?>[] clsArr = new java.lang.Class[i5];
                                                    clsArr[i4] = java.lang.String.class;
                                                    java.lang.Object invoke3 = cls6.getMethod(intern, clsArr).invoke(null, objArr23);
                                                    try {
                                                        java.lang.Object[] objArr26 = new java.lang.Object[i5];
                                                        c(null, null, android.widget.ExpandableListView.getPackedPositionChild(0L) + 128, "\u008c\u0087\u008e\u0097\u0094\u0085\u008f\u0089\u0093\u0095\u009b\u009c\u0095\u0097\u0085\u008c\u0097\u0085\u0088\u0096\u0095\u0086\u0089\u0088\u0087\u0086\u0085\u0094", objArr26);
                                                        java.lang.Class<?> cls7 = java.lang.Class.forName(((java.lang.String) objArr26[0]).intern());
                                                        java.lang.Object[] objArr27 = new java.lang.Object[i5];
                                                        c(null, null, 128 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "¦\u0094\u0087\u0087\u0084\u008c\u0097¦¨\u0088\u0097", objArr27);
                                                        try {
                                                            java.lang.Object[] objArr28 = {new java.io.ByteArrayInputStream((byte[]) cls7.getMethod(((java.lang.String) objArr27[0]).intern(), null).invoke(obj2, null))};
                                                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                            c(null, null, android.view.KeyEvent.getDeadChar(0, 0) + 127, "¦\u0087\u0088\u0097\u0096\u0094§\u008c\u0097\u0094\u0096\u0089\u009e\u0089\u0097\u0087\u008c\u0081\u0095\u0097\u0087\u008c\u0096\u0095¦\u0097\u0089\u0087\u008e\u0096\u008c\u009f\u0095\u0094¥\u0094¤", objArr29);
                                                            java.lang.Class<?> cls8 = java.lang.Class.forName(((java.lang.String) objArr29[0]).intern());
                                                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                            b("त閗\ud9a3峼뱶ꈁ㚄椙\uded8벽醀솃佲禪嫊ർ껇⊅륮\ue0d9", (android.os.Process.myPid() >> 22) + 19, objArr30);
                                                            java.lang.Object invoke4 = cls8.getMethod(((java.lang.String) objArr30[0]).intern(), java.io.InputStream.class).invoke(invoke3, objArr28);
                                                            int length2 = objArr5.length;
                                                            for (int i8 = 0; i8 < 2; i8++) {
                                                                java.lang.Object obj3 = objArr5[i8];
                                                                try {
                                                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                                    b("\ue102입\uf79f쀾ᰑⳢ\uf023⦒㻦젡Ṿ鵍㞵\ue0e1䌔휬醀솃ꎁ\uf54cᖺ됯䙮赜抧\uf476ᚂ탚觌Ά倎忂㚄椙", 34 - android.view.View.getDefaultSize(0, 0), objArr31);
                                                                    java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr31[0]).intern());
                                                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                                    b("त閗梼\udd44湤用炗搽\uf0ca핓큎ᤠ莦笿渝葙ᷧપВ層쿨넊ㆿ珒", android.view.KeyEvent.keyCodeFromString("") + 23, objArr32);
                                                                    if (obj3.equals(cls9.getMethod(((java.lang.String) objArr32[0]).intern(), null).invoke(invoke4, null))) {
                                                                        java.lang.Object[] objArr33 = {new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                                                                        try {
                                                                            java.lang.Object[] objArr34 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((((~((-431789411) | r2)) | (-573139575)) | (~(431789410 | i))) * (-564)) - 1407152184) + ((~((-570518037) | i)) * 1128) + (((~((~i) | (-573139575))) | (-1002307447)) * 564))};
                                                                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj4 == null) {
                                                                                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 49, 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                                                                byte b3 = (byte) ($$a[14] - 1);
                                                                                byte b4 = b3;
                                                                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                                                a(b3, b4, b4, objArr35);
                                                                                obj4 = cls10.getMethod((java.lang.String) objArr35[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                                                            }
                                                                            ((int[]) objArr33[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr34)).intValue();
                                                                            return objArr33;
                                                                        } catch (java.lang.Throwable th) {
                                                                            java.lang.Throwable cause = th.getCause();
                                                                            if (cause != null) {
                                                                                throw cause;
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                } catch (java.lang.Throwable th2) {
                                                                    java.lang.Throwable cause2 = th2.getCause();
                                                                    if (cause2 != null) {
                                                                        throw cause2;
                                                                    }
                                                                    throw th2;
                                                                }
                                                            }
                                                            i7++;
                                                            i4 = 0;
                                                            r12 = 0;
                                                            i5 = 1;
                                                        } catch (java.lang.Throwable th3) {
                                                            java.lang.Throwable cause3 = th3.getCause();
                                                            if (cause3 != null) {
                                                                throw cause3;
                                                            }
                                                            throw th3;
                                                        }
                                                    } catch (java.lang.Throwable th4) {
                                                        java.lang.Throwable cause4 = th4.getCause();
                                                        if (cause4 != null) {
                                                            throw cause4;
                                                        }
                                                        throw th4;
                                                    }
                                                } catch (java.lang.Throwable th5) {
                                                    java.lang.Throwable cause5 = th5.getCause();
                                                    if (cause5 != null) {
                                                        throw cause5;
                                                    }
                                                    throw th5;
                                                }
                                            }
                                        } catch (java.lang.Throwable th6) {
                                            java.lang.Throwable cause6 = th6.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th6;
                                        }
                                    } catch (java.lang.Throwable th7) {
                                        java.lang.Throwable cause7 = th7.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th7;
                                    }
                                } catch (java.lang.Throwable th8) {
                                    java.lang.Throwable cause8 = th8.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th8;
                                }
                            } catch (java.lang.Throwable th9) {
                                java.lang.Throwable cause9 = th9.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th9;
                            }
                        } catch (java.lang.Throwable th10) {
                            java.lang.Throwable cause10 = th10.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th10;
                        }
                    } catch (java.lang.Throwable unused) {
                        i3 = 1;
                    }
                } catch (java.lang.Throwable unused2) {
                }
                i3 = i5;
                int[] iArr = new int[i3];
                int[] iArr2 = new int[i3];
                iArr[0] = i;
                iArr2[0] = i;
                java.lang.Object[] objArr36 = {iArr, iArr2, null, new int[i3]};
                java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((((~((-1028684377) | r1)) | 23755391) * (-933)) - 616278256) + (((~((~i) | 23755391)) | (-1031436928)) * 933)) - 1726837213)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj5 == null) {
                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 50, 2713 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.os.Process.myPid() >> 22));
                    byte b5 = (byte) ($$a[14] - 1);
                    byte b6 = b5;
                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                    a(b5, b6, b6, objArr38);
                    obj5 = cls11.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                }
                ((int[]) objArr36[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr37)).intValue();
                return objArr36;
            } catch (java.lang.Throwable th11) {
                java.lang.Throwable cause11 = th11.getCause();
                if (cause11 != null) {
                    throw cause11;
                }
                throw th11;
            }
        }
    }

    final class values {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static char[] IccPrivateKeyCrtComponentsJson;
        private static int RecordsJson;
        private static int getProfileVersion;
        private final java.lang.Throwable AlternateContactlessPaymentDataJson;
        private final com.payair.hce.checkCallingPermission.valueOf DigitizedCardProfile;
        private final java.lang.String valueOf;
        private final java.lang.Object[] values;
        private final java.lang.String writeReplace;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
            int i2;
            int i3 = i * 3;
            byte[] bArr = $$a;
            int i4 = (b * 2) + 107;
            int i5 = s + 4;
            byte[] bArr2 = new byte[i3 + 1];
            if (bArr == null) {
                int i6 = i3;
                int i7 = i5;
                i2 = 0;
                int i8 = i7;
                i4 = i5 + i6;
                i5 = i8;
                int i9 = i5 + 1;
                bArr2[i2] = (byte) i4;
                if (i2 == i3) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i2++;
                i6 = bArr[i9];
                int i10 = i4;
                i7 = i9;
                i5 = i10;
                int i82 = i7;
                i4 = i5 + i6;
                i5 = i82;
                int i92 = i5 + 1;
                bArr2[i2] = (byte) i4;
                if (i2 == i3) {
                }
            } else {
                i2 = 0;
                int i922 = i5 + 1;
                bArr2[i2] = (byte) i4;
                if (i2 == i3) {
                }
            }
        }

        public values(com.payair.hce.checkCallingPermission checkcallingpermission, com.payair.hce.checkCallingPermission.valueOf valueof, java.lang.String str, java.lang.Object[] objArr) {
            this(valueof, str, objArr, null);
        }

        public values(com.payair.hce.checkCallingPermission.valueOf valueof, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th) {
            this.writeReplace = str;
            this.values = objArr;
            this.DigitizedCardProfile = valueof;
            this.AlternateContactlessPaymentDataJson = th;
            this.valueOf = com.payair.hce.bindService.DigitizedCardProfile(new java.util.Date(java.lang.System.currentTimeMillis()));
        }

        public final java.lang.String values() {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{0, 3, 113, 0}, "\u0001\u0000\u0000", true, objArr);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
            sb.append(this.valueOf);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(new int[]{0, 3, 113, 0}, "\u0001\u0000\u0000", true, objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(this.writeReplace);
            java.lang.String obj = sb.toString();
            int i = RecordsJson + 15;
            getProfileVersion = i % 128;
            if (i % 2 == 0) {
                return obj;
            }
            throw null;
        }

        public final java.lang.Object[] writeReplace() {
            int i = RecordsJson + 113;
            getProfileVersion = i % 128;
            if (i % 2 == 0) {
                return this.values;
            }
            throw null;
        }

        private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
            java.lang.String str2 = str;
            byte[] bArr = str2;
            if (str2 != null) {
                bArr = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
            int i = 0;
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = IccPrivateKeyCrtComponentsJson;
            short s = -1;
            if (cArr != null) {
                $11 = ($10 + 97) % 128;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        objArr2[i] = java.lang.Integer.valueOf(cArr[i6]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - ((android.os.Process.getThreadPriority(i) + 20) >> 6), 2807 - android.graphics.drawable.Drawable.resolveOpacity(i, i), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            b(0, s, (byte) 1, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                        }
                        cArr2[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        i6++;
                        i = 0;
                        s = -1;
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
            char[] cArr3 = new char[i3];
            java.lang.System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr2 != null) {
                char[] cArr4 = new char[i3];
                getaccounttype.writeReplace = 0;
                char c = 0;
                while (getaccounttype.writeReplace < i3) {
                    if (bArr2[getaccounttype.writeReplace] == 1) {
                        int i7 = getaccounttype.writeReplace;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 45, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2836, (char) android.graphics.Color.red(0));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            b(0, (short) -1, (byte) 0, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                        }
                        cArr4[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    } else {
                        int i8 = getaccounttype.writeReplace;
                        java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                        if (obj3 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.graphics.Color.red(0) + 2880, (char) android.graphics.Color.green(0));
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            b(0, (short) -1, (byte) 2, objArr7);
                            obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                        }
                        cArr4[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                    }
                    c = cArr4[getaccounttype.writeReplace];
                    java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 34, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                char[] cArr5 = new char[i3];
                java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i9 = i3 - i5;
                java.lang.System.arraycopy(cArr5, 0, cArr3, i9, i5);
                java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i9);
            }
            if (z) {
                int i10 = $10 + 103;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char[] cArr6 = new char[i3];
                int i12 = 0;
                while (true) {
                    getaccounttype.writeReplace = i12;
                    if (getaccounttype.writeReplace >= i3) {
                        break;
                    }
                    int i13 = $10 + 51;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = getaccounttype.writeReplace;
                        int i15 = getaccounttype.writeReplace;
                        cArr6[i14] = cArr3[0];
                        i12 = getaccounttype.writeReplace << 1;
                    } else {
                        cArr6[getaccounttype.writeReplace] = cArr3[(i3 - getaccounttype.writeReplace) - 1];
                        i12 = getaccounttype.writeReplace + 1;
                    }
                }
                cArr3 = cArr6;
            }
            if (i4 > 0) {
                $11 = ($10 + 125) % 128;
                int i16 = 0;
                while (true) {
                    getaccounttype.writeReplace = i16;
                    if (getaccounttype.writeReplace >= i3) {
                        break;
                    }
                    cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                    i16 = getaccounttype.writeReplace + 1;
                }
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        public final com.payair.hce.checkCallingPermission.valueOf DigitizedCardProfile() {
            int i = RecordsJson + 75;
            int i2 = i % 128;
            getProfileVersion = i2;
            if (i % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            com.payair.hce.checkCallingPermission.valueOf valueof = this.DigitizedCardProfile;
            int i3 = i2 + 5;
            RecordsJson = i3 % 128;
            if (i3 % 2 != 0) {
                return valueof;
            }
            throw new java.lang.ArithmeticException();
        }

        public final java.lang.Throwable valueOf() {
            int i = RecordsJson + 91;
            int i2 = i % 128;
            getProfileVersion = i2;
            if (i % 2 != 0) {
                throw null;
            }
            java.lang.Throwable th = this.AlternateContactlessPaymentDataJson;
            int i3 = i2 + 41;
            RecordsJson = i3 % 128;
            if (i3 % 2 != 0) {
                return th;
            }
            throw null;
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getProfileVersion = 0;
            RecordsJson = 1;
            IccPrivateKeyCrtComponentsJson = new char[]{16774, 16753, 16753};
        }

        static void init$0() {
            $$a = new byte[]{com.google.common.base.Ascii.SI, -31, 80, -73};
            $$b = 111;
        }
    }

    @Override // com.payair.hce.setStatusCodeFromServer
    public void writeReplace(java.lang.String str, java.lang.Object... objArr) {
        int i = DigitizedCardProfile;
        int i2 = i & 79;
        int i3 = (i2 - (~((i ^ 79) | i2))) - 1;
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        com.payair.hce.checkCallingPermission.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson;
        if (alternateContactlessPaymentDataJson != null) {
            alternateContactlessPaymentDataJson.DigitizedCardProfile(new com.payair.hce.checkCallingPermission.values(this, com.payair.hce.checkCallingPermission.valueOf.DigitizedCardProfile, str, objArr));
            int i4 = DigitizedCardProfile;
            int i5 = i4 & 43;
            int i6 = ((i4 | 43) & (~i5)) + (i5 << 1);
            valueOf = i6 % 128;
            if (i6 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        int i7 = ((i & 22) + (i | 22)) - 1;
        valueOf = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.payair.hce.setStatusCodeFromServer
    public void values(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        int i = DigitizedCardProfile;
        int i2 = i & 99;
        int i3 = i ^ 99;
        valueOf = ((i2 - (~(i3 | i2))) - 1) % 128;
        com.payair.hce.checkCallingPermission.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson;
        if (alternateContactlessPaymentDataJson != null) {
            alternateContactlessPaymentDataJson.DigitizedCardProfile(new com.payair.hce.checkCallingPermission.values(com.payair.hce.checkCallingPermission.valueOf.valueOf, str, objArr, th));
            int i4 = DigitizedCardProfile;
            int i5 = ((i4 ^ 85) | (i4 & 85)) << 1;
            int i6 = -((i4 & (-86)) | ((~i4) & 85));
            valueOf = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
            return;
        }
        int i7 = i3 + (i2 << 1);
        valueOf = i7 % 128;
        if (i7 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.payair.hce.setStatusCodeFromServer
    public void valueOf(java.lang.String str, java.lang.Object... objArr) {
        int i = DigitizedCardProfile;
        int i2 = ((i ^ 65) + ((i & 65) << 1)) % 128;
        valueOf = i2;
        com.payair.hce.checkCallingPermission.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson;
        if (alternateContactlessPaymentDataJson != null) {
            alternateContactlessPaymentDataJson.DigitizedCardProfile(new com.payair.hce.checkCallingPermission.values(this, com.payair.hce.checkCallingPermission.valueOf.AlternateContactlessPaymentDataJson, str, objArr));
            int i3 = DigitizedCardProfile;
            valueOf = (((i3 & (-98)) | ((~i3) & 97)) + ((i3 & 97) << 1)) % 128;
        } else {
            int i4 = i2 & 55;
            int i5 = (i2 ^ 55) | i4;
            DigitizedCardProfile = (((i4 | i5) << 1) - (i4 ^ i5)) % 128;
        }
    }

    @Override // com.payair.hce.setStatusCodeFromServer
    public void DigitizedCardProfile(java.lang.String str, java.lang.Object... objArr) {
        int i = DigitizedCardProfile;
        int i2 = i & 99;
        int i3 = -(-((i ^ 99) | i2));
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        valueOf = i4;
        com.payair.hce.checkCallingPermission.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson;
        if (alternateContactlessPaymentDataJson != null) {
            alternateContactlessPaymentDataJson.DigitizedCardProfile(new com.payair.hce.checkCallingPermission.values(this, com.payair.hce.checkCallingPermission.valueOf.writeReplace, str, objArr));
            int i5 = valueOf;
            int i6 = (i5 & (-24)) | ((~i5) & 23);
            int i7 = -(-((i5 & 23) << 1));
            DigitizedCardProfile = ((i6 & i7) + (i7 | i6)) % 128;
            return;
        }
        int i8 = i4 ^ 107;
        int i9 = (((i4 & 107) | i8) << 1) - i8;
        DigitizedCardProfile = i9 % 128;
        if (i9 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.payair.hce.setStatusCodeFromServer
    public void values(java.lang.String str, java.lang.Object... objArr) {
        int i;
        int i2 = DigitizedCardProfile;
        int i3 = (i2 ^ 35) + ((i2 & 35) << 1);
        int i4 = i3 % 128;
        valueOf = i4;
        if (i3 % 2 != 0) {
            com.payair.hce.checkCallingPermission.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson;
            if (alternateContactlessPaymentDataJson == null) {
                int i5 = (i4 & (-46)) | ((~i4) & 45);
                int i6 = (i4 & 45) << 1;
                i = ((i5 | i6) << 1) - (i5 ^ i6);
            } else {
                alternateContactlessPaymentDataJson.DigitizedCardProfile(new com.payair.hce.checkCallingPermission.values(this, com.payair.hce.checkCallingPermission.valueOf.values, str, objArr));
                int i7 = valueOf;
                int i8 = i7 ^ 121;
                int i9 = ((i7 & 121) | i8) << 1;
                int i10 = -i8;
                i = (i9 & i10) + (i9 | i10);
            }
            DigitizedCardProfile = i % 128;
            return;
        }
        throw null;
    }

    @Override // com.payair.hce.setStatusCodeFromServer
    public void AlternateContactlessPaymentDataJson(java.lang.String str, java.lang.Object... objArr) {
        int i = valueOf;
        int i2 = i & 17;
        int i3 = (((i | 17) & (~i2)) - (~(-(-(i2 << 1))))) - 1;
        DigitizedCardProfile = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.checkCallingPermission.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson;
        if (alternateContactlessPaymentDataJson == null) {
            valueOf = ((((r1 | 73) << 1) - (~(-((r1 & (-74)) | ((~r1) & 73))))) - 1) % 128;
            return;
        }
        alternateContactlessPaymentDataJson.DigitizedCardProfile(new com.payair.hce.checkCallingPermission.values(this, com.payair.hce.checkCallingPermission.valueOf.getProfileVersion, str, objArr));
        int i4 = valueOf & 105;
        DigitizedCardProfile = ((i4 - (~((r4 ^ 105) | i4))) - 1) % 128;
    }

    static /* synthetic */ com.payair.hce.checkCallingPermission.AlternateContactlessPaymentDataJson values() {
        return (com.payair.hce.checkCallingPermission.AlternateContactlessPaymentDataJson) writeReplace(new java.lang.Object[0], -1394885552, 1394885553, (int) java.lang.System.currentTimeMillis());
    }

    final void DigitizedCardProfile(com.payair.hce.setStatusCodeFromServer setstatuscodefromserver) {
        writeReplace(new java.lang.Object[]{this, setstatuscodefromserver}, 735380152, -735380152, java.lang.System.identityHashCode(this));
    }
}
