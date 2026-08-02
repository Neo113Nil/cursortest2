package com.payair.hce;

/* loaded from: classes4.dex */
public final class setWallpaper extends com.payair.hce.deleteDatabase {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char RecordsJson;
    private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getAid;
    private static int getCvrMaskAnd;
    private static int getGpoResponse;
    private static char getPaymentFci;
    private static char getProfileVersion;

    public interface AlternateContactlessPaymentDataJson {
        byte[] AlternateContactlessPaymentDataJson();

        byte[] DigitizedCardProfile();

        byte[] valueOf();

        void writeReplace(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        byte[] bArr = $$a;
        int i5 = i * 2;
        int i6 = i3 + 107;
        int i7 = (i2 * 2) + 4;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i6 = i5;
            int i8 = i7;
            int i9 = 0;
            i7++;
            i6 += i8;
            i4 = i9;
            bArr2[i4] = (byte) i6;
            i9 = i4 + 1;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i7];
            i7++;
            i6 += i8;
            i4 = i9;
            bArr2[i4] = (byte) i6;
            i9 = i4 + 1;
            if (i4 == i5) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i6;
            i9 = i4 + 1;
            if (i4 == i5) {
            }
        }
    }

    public setWallpaper(com.payair.hce.sendOrderedBroadcast sendorderedbroadcast, com.payair.hce.getPackageResourcePath getpackageresourcepath, java.lang.String str, com.payair.hce.deleteFile deletefile, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        super(sendorderedbroadcast, getpackageresourcepath, str, deletefile, deletesharedpreferences);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.AlternateContactlessPaymentDataJson);
        sb.append(com.payair.hce.removeStickyBroadcast.values);
        this.AlternateContactlessPaymentDataJson = sb.toString();
    }

    /* renamed from: com.payair.hce.setWallpaper$1, reason: invalid class name */
    public final class AnonymousClass1 implements com.payair.hce.isNetworkError {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int IccPrivateKeyCrtComponentsJson;
        private static short[] SdkCoreBusinessLogicModuleImpl;
        private static int getApplicationLifeCycleData;
        private static int getCiacDecline;
        private static int getCvmResetTimeout;
        private static long getCvrMaskAnd;
        private static int getGpoResponse;
        private static byte[] getPaymentFci;
        private /* synthetic */ byte[] AlternateContactlessPaymentDataJson;
        private /* synthetic */ byte[] DigitizedCardProfile;
        private /* synthetic */ int RecordsJson;
        private /* synthetic */ byte[] getAid;
        private /* synthetic */ byte[] getProfileVersion;
        private /* synthetic */ byte[] valueOf;
        private /* synthetic */ byte[] values;
        private /* synthetic */ byte[] writeReplace;

        public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
            int i4 = ~i2;
            int i5 = i4 | i;
            if ((i * 624) + (i2 * (-622)) + ((~(i5 | i3)) * 623) + (((~(i2 | (~i))) | (~i3)) * (-623)) + (((~(i | i3)) | (~i5) | (~(i3 | i4))) * 623) != 1) {
                return AlternateContactlessPaymentDataJson(objArr);
            }
            getApplicationLifeCycleData = (getCvmResetTimeout + 9) % 128;
            return null;
        }

        private static void a(int i, byte b, short s, java.lang.Object[] objArr) {
            byte[] bArr = $$a;
            int i2 = i + 65;
            int i3 = s * 2;
            int i4 = (b * 34) + 4;
            char[] cArr = new char[35 - i3];
            int i5 = -1;
            if (bArr == null) {
                i4++;
                i2 = (i4 + (-i2)) - 2;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                cArr[i6] = (char) i2;
                if (i6 == 34 - i3) {
                    objArr[0] = new java.lang.String(cArr);
                    return;
                }
                i4++;
                i2 = (i2 + (-bArr[i4])) - 2;
                i5 = i6;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void d(byte b, int i, short s, java.lang.Object[] objArr) {
            int i2;
            int i3 = (i * 2) + 4;
            byte[] bArr = $$d;
            int i4 = b * 2;
            byte[] bArr2 = new byte[1 - i4];
            int i5 = 0 - i4;
            int i6 = -1;
            if (bArr == null) {
                int i7 = i5;
                i2 = i3;
                i3 += i7;
                i2++;
                i6++;
                bArr2[i6] = (byte) i3;
                if (i6 == i5) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i7 = bArr[i2];
                i3 += i7;
                i2++;
                i6++;
                bArr2[i6] = (byte) i3;
                if (i6 == i5) {
                }
            } else {
                int i8 = 113 - s;
                i2 = i3;
                i3 = i8;
                i6++;
                bArr2[i6] = (byte) i3;
                if (i6 == i5) {
                }
            }
        }

        private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
            char[] cArr;
            if (str != null) {
                cArr = str.toCharArray();
                $10 = ($11 + 81) % 128;
            } else {
                cArr = str;
            }
            char[] cArr2 = cArr;
            com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
            getdsrpdata.values = i;
            int length = cArr2.length;
            long[] jArr = new long[length];
            getdsrpdata.valueOf = 0;
            while (getdsrpdata.valueOf < cArr2.length) {
                int i2 = getdsrpdata.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1890, (char) (3601 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                        byte b = $$d[2];
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(b, b, b, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                    }
                    jArr[i2] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (getCvrMaskAnd ^ (-4761752123935132024L));
                    java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 64, 1443 - android.text.TextUtils.getTrimmedLength(""), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 29682));
                        byte b2 = $$d[2];
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d(b2, b2, (byte) (b2 + 1), objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr3 = new char[length];
            getdsrpdata.valueOf = 0;
            while (getdsrpdata.valueOf < cArr2.length) {
                $11 = ($10 + 117) % 128;
                cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
                java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1443, (char) (29682 - android.graphics.Color.alpha(0)));
                    byte b3 = $$d[2];
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    d(b3, b3, (byte) (b3 + 1), objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
                int i3 = $11 + 47;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 / 4;
                }
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0194  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
            int i4;
            long j;
            boolean z;
            com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(getCiacDecline)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                if (obj == null) {
                    obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777189) - android.graphics.Color.rgb(0, 0, 0), android.graphics.Color.blue(0) + 29, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                if (intValue == -1) {
                    $10 = ($11 + 95) % 128;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    byte[] bArr = getPaymentFci;
                    float f = 0.0f;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i5 = 0;
                        while (i5 < length) {
                            $11 = ($10 + 17) % 128;
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i5])};
                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                            if (obj2 == null) {
                                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > f ? 1 : (android.util.TypedValue.complexToFloat(0) == f ? 0 : -1)) + 31, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 5088, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)))).getMethod("e", java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                            }
                            bArr2[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                            i5++;
                            f = 0.0f;
                        }
                        bArr = bArr2;
                    }
                    if (bArr == null) {
                        j = -4897270311952305750L;
                        intValue = (short) (((short) (SdkCoreBusinessLogicModuleImpl[i2 + ((int) (IccPrivateKeyCrtComponentsJson ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (getCiacDecline ^ (-4897270311952305750L))));
                        if (intValue > 0) {
                            gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + ((int) (IccPrivateKeyCrtComponentsJson ^ j)) + i4;
                            java.lang.Object[] objArr4 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getGpoResponse), sb};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                            if (obj3 == null) {
                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 27, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2365, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                byte b2 = $$d[2];
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                d(b2, b2, (byte) (b2 | 9), objArr5);
                                obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj3);
                            }
                            ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            byte[] bArr3 = getPaymentFci;
                            if (bArr3 != null) {
                                int length2 = bArr3.length;
                                byte[] bArr4 = new byte[length2];
                                int i6 = 0;
                                while (i6 < length2) {
                                    int i7 = $10 + 111;
                                    $11 = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        bArr4[i6] = (byte) (bArr3[i6] & (-4897270311952305750L));
                                    } else {
                                        bArr4[i6] = (byte) (bArr3[i6] ^ (-4897270311952305750L));
                                        i6++;
                                    }
                                }
                                int i8 = $11 + 17;
                                $10 = i8 % 128;
                                if (i8 % 2 != 0) {
                                    int i9 = 3 / 2;
                                }
                                bArr3 = bArr4;
                            }
                            if (bArr3 != null) {
                                $10 = ($11 + 109) % 128;
                                z = true;
                            } else {
                                $10 = ($11 + 17) % 128;
                                z = false;
                            }
                            gettrack2constructiondata.DigitizedCardProfile = 1;
                            while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                                if (z) {
                                    byte[] bArr5 = getPaymentFci;
                                    gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                    gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr5[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                                } else {
                                    short[] sArr = SdkCoreBusinessLogicModuleImpl;
                                    gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                    gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                                }
                                sb.append(gettrack2constructiondata.values);
                                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                gettrack2constructiondata.DigitizedCardProfile++;
                            }
                        }
                        objArr[0] = sb.toString();
                    }
                    byte[] bArr6 = getPaymentFci;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27, 28 - android.os.Process.getGidForName(""), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                    }
                    intValue = (byte) (((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).intValue()] ^ (-4897270311952305750L))) + ((int) (getCiacDecline ^ (-4897270311952305750L))));
                }
                j = -4897270311952305750L;
                if (intValue > 0) {
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

        AnonymousClass1(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, int i) {
            this.AlternateContactlessPaymentDataJson = bArr;
            this.DigitizedCardProfile = bArr2;
            this.writeReplace = bArr3;
            this.valueOf = bArr4;
            this.values = bArr5;
            this.getAid = bArr6;
            this.getProfileVersion = bArr7;
            this.RecordsJson = i;
        }

        @Override // com.payair.hce.isNetworkError
        public final java.lang.String writeReplace() {
            int i = (getApplicationLifeCycleData + 81) % 128;
            getCvmResetTimeout = i;
            int i2 = i + 49;
            getApplicationLifeCycleData = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
            int i = (getApplicationLifeCycleData + 117) % 128;
            getCvmResetTimeout = i;
            int i2 = i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getApplicationLifeCycleData = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // com.payair.hce.isNetworkError
        public final byte[] values() {
            int i = getApplicationLifeCycleData;
            getCvmResetTimeout = (i + 27) % 128;
            byte[] bArr = this.AlternateContactlessPaymentDataJson;
            getCvmResetTimeout = (i + 3) % 128;
            return bArr;
        }

        @Override // com.payair.hce.isNetworkError
        public final byte[] AlternateContactlessPaymentDataJson() {
            int i = getApplicationLifeCycleData + 11;
            int i2 = i % 128;
            getCvmResetTimeout = i2;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            byte[] bArr = this.DigitizedCardProfile;
            getApplicationLifeCycleData = (i2 + 45) % 128;
            return bArr;
        }

        @Override // com.payair.hce.isNetworkError
        public final byte[] DigitizedCardProfile() {
            int i = getApplicationLifeCycleData + 79;
            getCvmResetTimeout = i % 128;
            if (i % 2 != 0) {
                return this.writeReplace;
            }
            throw null;
        }

        @Override // com.payair.hce.isNetworkError
        public final byte[] getAid() {
            int i = getApplicationLifeCycleData;
            int i2 = i + 1;
            getCvmResetTimeout = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            byte[] bArr = this.valueOf;
            int i3 = i + 117;
            getCvmResetTimeout = i3 % 128;
            if (i3 % 2 != 0) {
                return bArr;
            }
            throw new java.lang.ArithmeticException();
        }

        @Override // com.payair.hce.isNetworkError
        public final byte[] RecordsJson() {
            int i = (getCvmResetTimeout + 53) % 128;
            getApplicationLifeCycleData = i;
            byte[] bArr = this.values;
            int i2 = i + 103;
            getCvmResetTimeout = i2 % 128;
            if (i2 % 2 != 0) {
                return bArr;
            }
            throw new java.lang.ArithmeticException();
        }

        @Override // com.payair.hce.isNetworkError
        public final byte[] SdkCoreAlternateContactlessPaymentDataImpl() {
            int i = getApplicationLifeCycleData;
            int i2 = i + 97;
            getCvmResetTimeout = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            byte[] bArr = this.getAid;
            int i3 = i + 5;
            getCvmResetTimeout = i3 % 128;
            if (i3 % 2 != 0) {
                return bArr;
            }
            throw null;
        }

        @Override // com.payair.hce.isNetworkError
        public final byte[] IccPrivateKeyCrtComponentsJson() {
            int i = getCvmResetTimeout;
            getApplicationLifeCycleData = (i + 97) % 128;
            byte[] bArr = this.getProfileVersion;
            getApplicationLifeCycleData = (i + 119) % 128;
            return bArr;
        }

        @Override // com.payair.hce.isNetworkError
        public final int getProfileVersion() {
            int i = getCvmResetTimeout;
            getApplicationLifeCycleData = (i + 49) % 128;
            int i2 = this.RecordsJson;
            getApplicationLifeCycleData = (i + 7) % 128;
            return i2;
        }

        @Override // com.payair.hce.isNetworkError
        public final byte[] SdkCoreBusinessLogicModuleImpl() {
            int i = getApplicationLifeCycleData + 53;
            getCvmResetTimeout = i % 128;
            if (i % 2 != 0) {
                return null;
            }
            throw null;
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getApplicationLifeCycleData = 0;
            getCvmResetTimeout = 1;
            IccPrivateKeyCrtComponentsJson = -812100762;
            getCiacDecline = 520368578;
            getGpoResponse = -1220275308;
            getPaymentFci = new byte[]{9, -37, -27, 32, -5, -40, -27, -35, -112, com.google.common.base.Ascii.ETB, -47, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, com.google.common.base.Ascii.US, 7, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.US, 125, com.google.common.base.Ascii.FS, 17, -77, -95, 109, com.google.common.base.Ascii.GS, 98, -69, -67, 111, 17, -72, 103, -83, com.google.common.base.Ascii.DC4, -67, 109, -70, 110, 41, -6, com.google.common.base.Ascii.GS, -74, com.google.common.base.Ascii.GS, -71, -95, 98, 34, -25, -95, com.google.common.base.Ascii.SI, -17, 120, com.visa.cbp.getEncExpo.IResultReceiver, -24, 118, -32, 65, -29, com.visa.cbp.getEncExpo.IResultReceiver, -92, 45, -29, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 60, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -69, 8, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -26, -29, -26, -14, -20, -17, com.google.common.base.Ascii.VT, 89, -1, 70, 89, -24, 117, -20, -23, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -69, com.visa.cbp.getEncExpo.IResultReceiver, -67, 118, -95, com.google.common.base.Ascii.SI, 0, -97, com.google.common.base.Ascii.RS, 13, 34, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -48, -50, 72, -38, 10, -36, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 58, -80, 38, 37, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -27, -116, -91, -115, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 2, 93, 76, -72, 92, 16, -107, 92, 69, -95, 92, 88, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 68, 87, 82, 10, 70, 118, 84, 116, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 70, 113, 14, -36, -1, 42, -41, -52, 43, -40, 43, -35, 43, -50, com.google.common.base.Ascii.FF, 89, -80, 74, -80, 91, 88, -95, 68, 85, 68, 82, 68, -89, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -22, -108, 94, 71, -107, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, 81, 114, com.google.common.base.Ascii.DC4, 102, 100, 97, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, -40, -55, 62, 48, -19, 2, -23, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FF, -6, com.google.common.base.Ascii.RS, 81, 84, com.google.common.base.Ascii.SUB, -28, 14, -30, 4, -108, com.google.common.base.Ascii.SUB, -7, 8, -26, 40, -115, 47, -91, -78, -78, -63, -42, 9, 41, -55, -1, -28, -3, -19, -8, -8, com.visa.cbp.getEncExpo.kernelVersion, -4, 5, 2, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 13, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -92, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 118, -15, 13, 1, 3, -69, 1, -78, com.visa.cbp.getEncExpo.startTransaction, -8, com.google.common.base.Ascii.VT, 113, -8, -70, 6, com.visa.cbp.getEncExpo.startTransaction, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 108, 124, 64, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -99, -109, 123, -46, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -88, -120, -31, com.google.common.base.Ascii.SI, 109, com.visa.cbp.getEncExpo.IResultReceiver2, 103, 58, 42, -28, 99, com.visa.cbp.getEncExpo.onUnminimized, 19, 48, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -7, 9, -39, -120, -41, -115, -44, -46, -75, -127, 34, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 0, 123, -92, -82, -94, 101, -83, 76, -92, -19, 111, 117, -89, -19, 60, -81, Byte.MAX_VALUE, -83, 14, -90, 110, 83, -87, 102, 16, -93, 64, 118, 80, 104, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -117, com.visa.cbp.getEncExpo.kernelVersion, -55, 81, com.google.common.base.Ascii.FF, 3, 124, 57, -124, -32, 56, 42, -106, -112, -28, -41, -19, 58, -22, 63, -109, 81, 2, -84, -32, -30, -79, -44, 86, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 35, -87, -105, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -20, -95, -19, 35, com.google.common.base.Ascii.VT, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -13, -15, 37, -85, 105, 110, -74, 10, com.google.common.base.Ascii.EM, 93, 83, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -10, 94, -100, 3, 88, -95, 94, -95, -91, com.visa.cbp.getEncExpo.registerForActivityResult, 110, 93, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 85, -29, 107, 83, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -91, -26, 4, com.google.common.base.Ascii.DC4, -120, -125, -125, -115, 39, -11, 97, 101, 123, -125, 101, -80, 58, -62, 115, 117, -62, -120, 100, 58, 9, -112, 2, com.google.common.base.Ascii.SUB, -26, -105, 67, 81, 9, com.google.common.base.Ascii.EM, 45, 2, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SYN, 7, 108, 126, 72, 43, com.google.common.base.Ascii.GS, 97, com.google.common.base.Ascii.EM, 80, 33, com.google.common.base.Ascii.SI, 121, com.google.common.base.Ascii.ESC, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -74, -91, -47, -75};
            getCvrMaskAnd = 266034259541555259L;
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x1837, code lost:
        
            r8 = ((java.lang.Long) ((java.lang.reflect.Method) r9).invoke(null, r8)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x1844, code lost:
        
            r12 = ~r8;
            r8 = (((((r8 * (-864)) + 14118333050L) + (((~(r35 | (-16302926))) | r12) * (-865))) + ((~(16302925 | r5)) * 865)) + (((~(r12 | r35)) | (~(r35 | 16302925))) * 865)) - 1353971033;
            r3 = (int) (r8 >> 32);
            r9 = ~((-1874323994) | r67);
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x18dc, code lost:
        
            if (((r3 & ((((((~((-121774696) | r11)) | (~(1332360039 | r67))) * (-831)) + 1629068166) + ((~((-16908325) | r67)) * (-1662))) + ((((~((-1315451716) | r11)) | (~(1315451715 | r67))) | (~(121774695 | r67))) * 831))) | (((int) r8) & (((((168132617 | r9) * (-814)) + 1354171770) + ((r9 | ((~((-437097584) | r11)) | (-2143288960))) * 407)) + ((((~(1874323993 | r67)) | (-2143288960)) | (~(437097583 | r67))) * 407)))) != 0) goto L145;
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x18de, code lost:
        
            r3 = com.payair.hce.setWallpaper.AnonymousClass1.getApplicationLifeCycleData + 41;
            com.payair.hce.setWallpaper.AnonymousClass1.getCvmResetTimeout = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x18e8, code lost:
        
            if ((r3 % 2) == 0) goto L145;
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x18ea, code lost:
        
            r3 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x18ed, code lost:
        
            r7 = r7 + r3;
            r4 = r4 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x18ec, code lost:
        
            r3 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x18fa, code lost:
        
            if (r7 < 25.2d) goto L156;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x18fc, code lost:
        
            r2 = new java.lang.Object[]{new int[]{r67}, new int[]{r67 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, null, new int[1]};
            r3 = (~((-659057597) | r67)) | 38273808;
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x191f, code lost:
        
            r5 = new java.lang.Object[]{615890328, 16, java.lang.Integer.valueOf((((r3 * 992) + 1071186367) + ((r3 | (~(671051711 | r11))) * (-496))) + ((r67 | 50267923) * 496))};
            r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x195e, code lost:
        
            if (r1 != null) goto L153;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x1960, code lost:
        
            r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777266, android.widget.ExpandableListView.getPackedPositionGroup(0) + 2713, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
            r3 = (short) (com.payair.hce.setWallpaper.AnonymousClass1.$$a[14] + 1);
            r6 = (byte) r3;
            r7 = new java.lang.Object[1];
            a(r3, r6, r6, r7);
            r1 = r1.getMethod((java.lang.String) r7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x19c1, code lost:
        
            ((int[]) r2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r5)).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x19c9, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x179f, code lost:
        
            if (((((int) (r12 >> 32)) & ((((((~((-1846243782) | r67)) | 1711956421) | r4) * (-470)) - 1397107368) + (((~((-274730011) | r11)) | (~((-134287361) | r67))) * 470))) | (((int) r12) & (((((((~((-1471344644) | r11)) | 1386393602) | (~((-1386396243) | r11))) * (-1136)) - 1738041619) + ((((~((-1471344644) | r67)) | (~((-1386396243) | r67))) | (~(1471347283 | r11))) * (-568))) + ((((~(1471344643 | r11)) | (~(1386396242 | r11))) | (~((-1386393603) | r67))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION)))) == 477111747) goto L132;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x062e, code lost:
        
            if (((((int) r3) & ((((((~(2078036569 | r11)) | (~((-640810160) | r67))) * 1900) - 1871736089) + (((~(640810159 | r11)) | (~((-2078036570) | r67))) * (-950))) + (((~(640810159 | r67)) | (~((-2078036570) | r11))) * 950))) | (((int) (r3 >> 32)) & (((((~(1476649903 | r67)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 1803401846) + ((1515974575 | r11) * (-216))) + (((~(1476649903 | r11)) | (-39423493)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE)))) == 477111747) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:495:0x2ea5, code lost:
        
            if (r7 != null) goto L577;
         */
        /* JADX WARN: Code restructure failed: missing block: B:520:0x2c4c, code lost:
        
            if (r4 == null) goto L348;
         */
        /* JADX WARN: Code restructure failed: missing block: B:618:0x097b, code lost:
        
            if (((((int) r3) & (((((178270984 | r11) * 1324) + 818885255) + (((~(246691656 | r67)) | (~((-1683918067) | r67))) * (-1324))) - 2063693202)) | (((int) (r3 >> 32)) & (((((((~((-1076629610) | r67)) | 1073745960) | (~(360596801 | r67))) * (-754)) + 160084346) + (((~((-1073745961) | r67)) | (~(1434342761 | r11))) * (-754))) + (((-1076629610) | r11) * 754)))) == 542074309) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x1684, code lost:
        
            if (((((int) (r12 >> 32)) & (((((~((-687075736) | r67)) | 4297092) * (-566)) - 425586814) + ((~((-682778644) | r67)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))) | (((int) r12) & (((((~(1634899940 | r67)) | (-1790629343)) * 398) + 661848909) + (((~(1634899940 | r11)) | (-1790629343)) * 398)))) != 477111747) goto L125;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x17a1, code lost:
        
            r4 = 0;
            r7 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x17a5, code lost:
        
            if (r4 >= 28) goto L609;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x17a7, code lost:
        
            com.payair.hce.setWallpaper.AnonymousClass1.getApplicationLifeCycleData = (com.payair.hce.setWallpaper.AnonymousClass1.getCvmResetTimeout + 11) % 128;
            r3 = r4[r4];
            r12 = new java.lang.Object[1];
            c("躜訡蜈聣鵃隳鎘겻꧙ꔳ븗묷", 1249 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x17d0, code lost:
        
            r8 = new java.lang.Object[]{((java.lang.String) r12[0]).intern().concat(java.lang.String.valueOf(r3))};
            r9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x17e1, code lost:
        
            if (r9 != null) goto L139;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x17e3, code lost:
        
            r9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 36, 3161 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) ((android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 33098));
            r14 = new java.lang.Object[1];
            a(653, (byte) (com.payair.hce.setWallpaper.AnonymousClass1.$$a[14] + 1), r10[16], r14);
            r9 = r9.getMethod((java.lang.String) r14[0], java.lang.String.class);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, r9);
         */
        /* JADX WARN: Removed duplicated region for block: B:130:0x1a21 A[Catch: all -> 0x4531, TryCatch #11 {all -> 0x4531, blocks: (B:3:0x0004, B:5:0x001f, B:6:0x005d, B:10:0x012a, B:12:0x016d, B:13:0x01b9, B:18:0x0213, B:20:0x0226, B:21:0x0276, B:24:0x02e8, B:26:0x02fb, B:27:0x0350, B:31:0x040a, B:33:0x041d, B:34:0x046d, B:36:0x04b2, B:38:0x04c5, B:39:0x0515, B:41:0x051e, B:43:0x053c, B:44:0x0591, B:50:0x099a, B:52:0x09ad, B:53:0x09ff, B:58:0x0bad, B:60:0x0c01, B:61:0x0c51, B:65:0x1291, B:67:0x12a4, B:68:0x12f5, B:71:0x1362, B:73:0x1375, B:74:0x13cc, B:78:0x147c, B:80:0x148f, B:81:0x14e2, B:83:0x152d, B:85:0x1540, B:86:0x158c, B:88:0x1595, B:90:0x15b3, B:91:0x1605, B:97:0x17d0, B:99:0x17e3, B:100:0x1837, B:114:0x191f, B:116:0x1960, B:117:0x19b4, B:121:0x1688, B:123:0x16a6, B:124:0x16f9, B:128:0x1a0e, B:130:0x1a21, B:131:0x1a6e, B:133:0x1aff, B:135:0x1b12, B:136:0x1b5f, B:144:0x1c18, B:146:0x1c5e, B:147:0x1cae, B:151:0x1d05, B:153:0x1d18, B:154:0x1d67, B:156:0x1e45, B:158:0x1e58, B:159:0x1ea4, B:167:0x1f53, B:169:0x1faf, B:170:0x2005, B:177:0x211f, B:179:0x2132, B:180:0x2187, B:188:0x2238, B:190:0x227a, B:191:0x22d0, B:215:0x25a9, B:217:0x25ed, B:218:0x263c, B:222:0x2696, B:224:0x26a9, B:225:0x26f9, B:238:0x29d8, B:240:0x29eb, B:241:0x2a3d, B:250:0x2b01, B:252:0x2b53, B:253:0x2ba4, B:279:0x2c75, B:281:0x2cc3, B:282:0x2d14, B:306:0x2de0, B:308:0x2e28, B:309:0x2e7a, B:312:0x2eab, B:314:0x2eba, B:315:0x2f01, B:319:0x2fc3, B:321:0x3015, B:322:0x3068, B:326:0x307f, B:328:0x3098, B:329:0x30e7, B:333:0x31a8, B:335:0x31fd, B:336:0x324b, B:339:0x3261, B:341:0x3270, B:342:0x32b5, B:346:0x3367, B:348:0x33bf, B:349:0x340e, B:352:0x3424, B:354:0x3433, B:355:0x347a, B:359:0x3529, B:361:0x357d, B:362:0x35cf, B:365:0x35e5, B:367:0x35f4, B:368:0x363b, B:372:0x36fc, B:374:0x3742, B:375:0x3794, B:379:0x37f6, B:381:0x3820, B:382:0x3878, B:386:0x3924, B:388:0x3960, B:389:0x39b3, B:393:0x3a0b, B:395:0x3a1e, B:396:0x3a73, B:400:0x3b26, B:402:0x3b79, B:403:0x3bca, B:406:0x3be0, B:408:0x3bef, B:409:0x3c38, B:413:0x3cd9, B:415:0x3d1f, B:416:0x3d73, B:419:0x3d89, B:421:0x3d98, B:422:0x3de0, B:426:0x3e9d, B:428:0x3ee3, B:429:0x3f37, B:432:0x3f4d, B:434:0x3f5c, B:435:0x3fa6, B:439:0x4048, B:441:0x409f, B:442:0x40f2, B:445:0x4108, B:447:0x4117, B:448:0x4163, B:454:0x4220, B:456:0x4274, B:457:0x42c5, B:459:0x42da, B:461:0x42ed, B:462:0x4331, B:464:0x4339, B:466:0x4369, B:467:0x43c7, B:472:0x447b, B:474:0x44bf, B:475:0x4511, B:591:0x0ae0, B:593:0x0af3, B:594:0x0b3e, B:599:0x0637, B:601:0x0655, B:602:0x06a3, B:606:0x0749, B:608:0x0767, B:609:0x07b7, B:613:0x085d, B:615:0x087b, B:616:0x08d1), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:135:0x1b12 A[Catch: all -> 0x4531, TryCatch #11 {all -> 0x4531, blocks: (B:3:0x0004, B:5:0x001f, B:6:0x005d, B:10:0x012a, B:12:0x016d, B:13:0x01b9, B:18:0x0213, B:20:0x0226, B:21:0x0276, B:24:0x02e8, B:26:0x02fb, B:27:0x0350, B:31:0x040a, B:33:0x041d, B:34:0x046d, B:36:0x04b2, B:38:0x04c5, B:39:0x0515, B:41:0x051e, B:43:0x053c, B:44:0x0591, B:50:0x099a, B:52:0x09ad, B:53:0x09ff, B:58:0x0bad, B:60:0x0c01, B:61:0x0c51, B:65:0x1291, B:67:0x12a4, B:68:0x12f5, B:71:0x1362, B:73:0x1375, B:74:0x13cc, B:78:0x147c, B:80:0x148f, B:81:0x14e2, B:83:0x152d, B:85:0x1540, B:86:0x158c, B:88:0x1595, B:90:0x15b3, B:91:0x1605, B:97:0x17d0, B:99:0x17e3, B:100:0x1837, B:114:0x191f, B:116:0x1960, B:117:0x19b4, B:121:0x1688, B:123:0x16a6, B:124:0x16f9, B:128:0x1a0e, B:130:0x1a21, B:131:0x1a6e, B:133:0x1aff, B:135:0x1b12, B:136:0x1b5f, B:144:0x1c18, B:146:0x1c5e, B:147:0x1cae, B:151:0x1d05, B:153:0x1d18, B:154:0x1d67, B:156:0x1e45, B:158:0x1e58, B:159:0x1ea4, B:167:0x1f53, B:169:0x1faf, B:170:0x2005, B:177:0x211f, B:179:0x2132, B:180:0x2187, B:188:0x2238, B:190:0x227a, B:191:0x22d0, B:215:0x25a9, B:217:0x25ed, B:218:0x263c, B:222:0x2696, B:224:0x26a9, B:225:0x26f9, B:238:0x29d8, B:240:0x29eb, B:241:0x2a3d, B:250:0x2b01, B:252:0x2b53, B:253:0x2ba4, B:279:0x2c75, B:281:0x2cc3, B:282:0x2d14, B:306:0x2de0, B:308:0x2e28, B:309:0x2e7a, B:312:0x2eab, B:314:0x2eba, B:315:0x2f01, B:319:0x2fc3, B:321:0x3015, B:322:0x3068, B:326:0x307f, B:328:0x3098, B:329:0x30e7, B:333:0x31a8, B:335:0x31fd, B:336:0x324b, B:339:0x3261, B:341:0x3270, B:342:0x32b5, B:346:0x3367, B:348:0x33bf, B:349:0x340e, B:352:0x3424, B:354:0x3433, B:355:0x347a, B:359:0x3529, B:361:0x357d, B:362:0x35cf, B:365:0x35e5, B:367:0x35f4, B:368:0x363b, B:372:0x36fc, B:374:0x3742, B:375:0x3794, B:379:0x37f6, B:381:0x3820, B:382:0x3878, B:386:0x3924, B:388:0x3960, B:389:0x39b3, B:393:0x3a0b, B:395:0x3a1e, B:396:0x3a73, B:400:0x3b26, B:402:0x3b79, B:403:0x3bca, B:406:0x3be0, B:408:0x3bef, B:409:0x3c38, B:413:0x3cd9, B:415:0x3d1f, B:416:0x3d73, B:419:0x3d89, B:421:0x3d98, B:422:0x3de0, B:426:0x3e9d, B:428:0x3ee3, B:429:0x3f37, B:432:0x3f4d, B:434:0x3f5c, B:435:0x3fa6, B:439:0x4048, B:441:0x409f, B:442:0x40f2, B:445:0x4108, B:447:0x4117, B:448:0x4163, B:454:0x4220, B:456:0x4274, B:457:0x42c5, B:459:0x42da, B:461:0x42ed, B:462:0x4331, B:464:0x4339, B:466:0x4369, B:467:0x43c7, B:472:0x447b, B:474:0x44bf, B:475:0x4511, B:591:0x0ae0, B:593:0x0af3, B:594:0x0b3e, B:599:0x0637, B:601:0x0655, B:602:0x06a3, B:606:0x0749, B:608:0x0767, B:609:0x07b7, B:613:0x085d, B:615:0x087b, B:616:0x08d1), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:139:0x1bf3  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x1d18 A[Catch: all -> 0x4531, TryCatch #11 {all -> 0x4531, blocks: (B:3:0x0004, B:5:0x001f, B:6:0x005d, B:10:0x012a, B:12:0x016d, B:13:0x01b9, B:18:0x0213, B:20:0x0226, B:21:0x0276, B:24:0x02e8, B:26:0x02fb, B:27:0x0350, B:31:0x040a, B:33:0x041d, B:34:0x046d, B:36:0x04b2, B:38:0x04c5, B:39:0x0515, B:41:0x051e, B:43:0x053c, B:44:0x0591, B:50:0x099a, B:52:0x09ad, B:53:0x09ff, B:58:0x0bad, B:60:0x0c01, B:61:0x0c51, B:65:0x1291, B:67:0x12a4, B:68:0x12f5, B:71:0x1362, B:73:0x1375, B:74:0x13cc, B:78:0x147c, B:80:0x148f, B:81:0x14e2, B:83:0x152d, B:85:0x1540, B:86:0x158c, B:88:0x1595, B:90:0x15b3, B:91:0x1605, B:97:0x17d0, B:99:0x17e3, B:100:0x1837, B:114:0x191f, B:116:0x1960, B:117:0x19b4, B:121:0x1688, B:123:0x16a6, B:124:0x16f9, B:128:0x1a0e, B:130:0x1a21, B:131:0x1a6e, B:133:0x1aff, B:135:0x1b12, B:136:0x1b5f, B:144:0x1c18, B:146:0x1c5e, B:147:0x1cae, B:151:0x1d05, B:153:0x1d18, B:154:0x1d67, B:156:0x1e45, B:158:0x1e58, B:159:0x1ea4, B:167:0x1f53, B:169:0x1faf, B:170:0x2005, B:177:0x211f, B:179:0x2132, B:180:0x2187, B:188:0x2238, B:190:0x227a, B:191:0x22d0, B:215:0x25a9, B:217:0x25ed, B:218:0x263c, B:222:0x2696, B:224:0x26a9, B:225:0x26f9, B:238:0x29d8, B:240:0x29eb, B:241:0x2a3d, B:250:0x2b01, B:252:0x2b53, B:253:0x2ba4, B:279:0x2c75, B:281:0x2cc3, B:282:0x2d14, B:306:0x2de0, B:308:0x2e28, B:309:0x2e7a, B:312:0x2eab, B:314:0x2eba, B:315:0x2f01, B:319:0x2fc3, B:321:0x3015, B:322:0x3068, B:326:0x307f, B:328:0x3098, B:329:0x30e7, B:333:0x31a8, B:335:0x31fd, B:336:0x324b, B:339:0x3261, B:341:0x3270, B:342:0x32b5, B:346:0x3367, B:348:0x33bf, B:349:0x340e, B:352:0x3424, B:354:0x3433, B:355:0x347a, B:359:0x3529, B:361:0x357d, B:362:0x35cf, B:365:0x35e5, B:367:0x35f4, B:368:0x363b, B:372:0x36fc, B:374:0x3742, B:375:0x3794, B:379:0x37f6, B:381:0x3820, B:382:0x3878, B:386:0x3924, B:388:0x3960, B:389:0x39b3, B:393:0x3a0b, B:395:0x3a1e, B:396:0x3a73, B:400:0x3b26, B:402:0x3b79, B:403:0x3bca, B:406:0x3be0, B:408:0x3bef, B:409:0x3c38, B:413:0x3cd9, B:415:0x3d1f, B:416:0x3d73, B:419:0x3d89, B:421:0x3d98, B:422:0x3de0, B:426:0x3e9d, B:428:0x3ee3, B:429:0x3f37, B:432:0x3f4d, B:434:0x3f5c, B:435:0x3fa6, B:439:0x4048, B:441:0x409f, B:442:0x40f2, B:445:0x4108, B:447:0x4117, B:448:0x4163, B:454:0x4220, B:456:0x4274, B:457:0x42c5, B:459:0x42da, B:461:0x42ed, B:462:0x4331, B:464:0x4339, B:466:0x4369, B:467:0x43c7, B:472:0x447b, B:474:0x44bf, B:475:0x4511, B:591:0x0ae0, B:593:0x0af3, B:594:0x0b3e, B:599:0x0637, B:601:0x0655, B:602:0x06a3, B:606:0x0749, B:608:0x0767, B:609:0x07b7, B:613:0x085d, B:615:0x087b, B:616:0x08d1), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:158:0x1e58 A[Catch: all -> 0x4531, TryCatch #11 {all -> 0x4531, blocks: (B:3:0x0004, B:5:0x001f, B:6:0x005d, B:10:0x012a, B:12:0x016d, B:13:0x01b9, B:18:0x0213, B:20:0x0226, B:21:0x0276, B:24:0x02e8, B:26:0x02fb, B:27:0x0350, B:31:0x040a, B:33:0x041d, B:34:0x046d, B:36:0x04b2, B:38:0x04c5, B:39:0x0515, B:41:0x051e, B:43:0x053c, B:44:0x0591, B:50:0x099a, B:52:0x09ad, B:53:0x09ff, B:58:0x0bad, B:60:0x0c01, B:61:0x0c51, B:65:0x1291, B:67:0x12a4, B:68:0x12f5, B:71:0x1362, B:73:0x1375, B:74:0x13cc, B:78:0x147c, B:80:0x148f, B:81:0x14e2, B:83:0x152d, B:85:0x1540, B:86:0x158c, B:88:0x1595, B:90:0x15b3, B:91:0x1605, B:97:0x17d0, B:99:0x17e3, B:100:0x1837, B:114:0x191f, B:116:0x1960, B:117:0x19b4, B:121:0x1688, B:123:0x16a6, B:124:0x16f9, B:128:0x1a0e, B:130:0x1a21, B:131:0x1a6e, B:133:0x1aff, B:135:0x1b12, B:136:0x1b5f, B:144:0x1c18, B:146:0x1c5e, B:147:0x1cae, B:151:0x1d05, B:153:0x1d18, B:154:0x1d67, B:156:0x1e45, B:158:0x1e58, B:159:0x1ea4, B:167:0x1f53, B:169:0x1faf, B:170:0x2005, B:177:0x211f, B:179:0x2132, B:180:0x2187, B:188:0x2238, B:190:0x227a, B:191:0x22d0, B:215:0x25a9, B:217:0x25ed, B:218:0x263c, B:222:0x2696, B:224:0x26a9, B:225:0x26f9, B:238:0x29d8, B:240:0x29eb, B:241:0x2a3d, B:250:0x2b01, B:252:0x2b53, B:253:0x2ba4, B:279:0x2c75, B:281:0x2cc3, B:282:0x2d14, B:306:0x2de0, B:308:0x2e28, B:309:0x2e7a, B:312:0x2eab, B:314:0x2eba, B:315:0x2f01, B:319:0x2fc3, B:321:0x3015, B:322:0x3068, B:326:0x307f, B:328:0x3098, B:329:0x30e7, B:333:0x31a8, B:335:0x31fd, B:336:0x324b, B:339:0x3261, B:341:0x3270, B:342:0x32b5, B:346:0x3367, B:348:0x33bf, B:349:0x340e, B:352:0x3424, B:354:0x3433, B:355:0x347a, B:359:0x3529, B:361:0x357d, B:362:0x35cf, B:365:0x35e5, B:367:0x35f4, B:368:0x363b, B:372:0x36fc, B:374:0x3742, B:375:0x3794, B:379:0x37f6, B:381:0x3820, B:382:0x3878, B:386:0x3924, B:388:0x3960, B:389:0x39b3, B:393:0x3a0b, B:395:0x3a1e, B:396:0x3a73, B:400:0x3b26, B:402:0x3b79, B:403:0x3bca, B:406:0x3be0, B:408:0x3bef, B:409:0x3c38, B:413:0x3cd9, B:415:0x3d1f, B:416:0x3d73, B:419:0x3d89, B:421:0x3d98, B:422:0x3de0, B:426:0x3e9d, B:428:0x3ee3, B:429:0x3f37, B:432:0x3f4d, B:434:0x3f5c, B:435:0x3fa6, B:439:0x4048, B:441:0x409f, B:442:0x40f2, B:445:0x4108, B:447:0x4117, B:448:0x4163, B:454:0x4220, B:456:0x4274, B:457:0x42c5, B:459:0x42da, B:461:0x42ed, B:462:0x4331, B:464:0x4339, B:466:0x4369, B:467:0x43c7, B:472:0x447b, B:474:0x44bf, B:475:0x4511, B:591:0x0ae0, B:593:0x0af3, B:594:0x0b3e, B:599:0x0637, B:601:0x0655, B:602:0x06a3, B:606:0x0749, B:608:0x0767, B:609:0x07b7, B:613:0x085d, B:615:0x087b, B:616:0x08d1), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:162:0x1f2e  */
        /* JADX WARN: Removed duplicated region for block: B:176:0x211d  */
        /* JADX WARN: Removed duplicated region for block: B:187:0x221f  */
        /* JADX WARN: Removed duplicated region for block: B:194:0x22e6  */
        /* JADX WARN: Removed duplicated region for block: B:214:0x258b  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x2652  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0983  */
        /* JADX WARN: Removed duplicated region for block: B:588:0x221c A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:590:0x0a98  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0c01 A[Catch: all -> 0x4531, TryCatch #11 {all -> 0x4531, blocks: (B:3:0x0004, B:5:0x001f, B:6:0x005d, B:10:0x012a, B:12:0x016d, B:13:0x01b9, B:18:0x0213, B:20:0x0226, B:21:0x0276, B:24:0x02e8, B:26:0x02fb, B:27:0x0350, B:31:0x040a, B:33:0x041d, B:34:0x046d, B:36:0x04b2, B:38:0x04c5, B:39:0x0515, B:41:0x051e, B:43:0x053c, B:44:0x0591, B:50:0x099a, B:52:0x09ad, B:53:0x09ff, B:58:0x0bad, B:60:0x0c01, B:61:0x0c51, B:65:0x1291, B:67:0x12a4, B:68:0x12f5, B:71:0x1362, B:73:0x1375, B:74:0x13cc, B:78:0x147c, B:80:0x148f, B:81:0x14e2, B:83:0x152d, B:85:0x1540, B:86:0x158c, B:88:0x1595, B:90:0x15b3, B:91:0x1605, B:97:0x17d0, B:99:0x17e3, B:100:0x1837, B:114:0x191f, B:116:0x1960, B:117:0x19b4, B:121:0x1688, B:123:0x16a6, B:124:0x16f9, B:128:0x1a0e, B:130:0x1a21, B:131:0x1a6e, B:133:0x1aff, B:135:0x1b12, B:136:0x1b5f, B:144:0x1c18, B:146:0x1c5e, B:147:0x1cae, B:151:0x1d05, B:153:0x1d18, B:154:0x1d67, B:156:0x1e45, B:158:0x1e58, B:159:0x1ea4, B:167:0x1f53, B:169:0x1faf, B:170:0x2005, B:177:0x211f, B:179:0x2132, B:180:0x2187, B:188:0x2238, B:190:0x227a, B:191:0x22d0, B:215:0x25a9, B:217:0x25ed, B:218:0x263c, B:222:0x2696, B:224:0x26a9, B:225:0x26f9, B:238:0x29d8, B:240:0x29eb, B:241:0x2a3d, B:250:0x2b01, B:252:0x2b53, B:253:0x2ba4, B:279:0x2c75, B:281:0x2cc3, B:282:0x2d14, B:306:0x2de0, B:308:0x2e28, B:309:0x2e7a, B:312:0x2eab, B:314:0x2eba, B:315:0x2f01, B:319:0x2fc3, B:321:0x3015, B:322:0x3068, B:326:0x307f, B:328:0x3098, B:329:0x30e7, B:333:0x31a8, B:335:0x31fd, B:336:0x324b, B:339:0x3261, B:341:0x3270, B:342:0x32b5, B:346:0x3367, B:348:0x33bf, B:349:0x340e, B:352:0x3424, B:354:0x3433, B:355:0x347a, B:359:0x3529, B:361:0x357d, B:362:0x35cf, B:365:0x35e5, B:367:0x35f4, B:368:0x363b, B:372:0x36fc, B:374:0x3742, B:375:0x3794, B:379:0x37f6, B:381:0x3820, B:382:0x3878, B:386:0x3924, B:388:0x3960, B:389:0x39b3, B:393:0x3a0b, B:395:0x3a1e, B:396:0x3a73, B:400:0x3b26, B:402:0x3b79, B:403:0x3bca, B:406:0x3be0, B:408:0x3bef, B:409:0x3c38, B:413:0x3cd9, B:415:0x3d1f, B:416:0x3d73, B:419:0x3d89, B:421:0x3d98, B:422:0x3de0, B:426:0x3e9d, B:428:0x3ee3, B:429:0x3f37, B:432:0x3f4d, B:434:0x3f5c, B:435:0x3fa6, B:439:0x4048, B:441:0x409f, B:442:0x40f2, B:445:0x4108, B:447:0x4117, B:448:0x4163, B:454:0x4220, B:456:0x4274, B:457:0x42c5, B:459:0x42da, B:461:0x42ed, B:462:0x4331, B:464:0x4339, B:466:0x4369, B:467:0x43c7, B:472:0x447b, B:474:0x44bf, B:475:0x4511, B:591:0x0ae0, B:593:0x0af3, B:594:0x0b3e, B:599:0x0637, B:601:0x0655, B:602:0x06a3, B:606:0x0749, B:608:0x0767, B:609:0x07b7, B:613:0x085d, B:615:0x087b, B:616:0x08d1), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x12a4 A[Catch: all -> 0x4531, TryCatch #11 {all -> 0x4531, blocks: (B:3:0x0004, B:5:0x001f, B:6:0x005d, B:10:0x012a, B:12:0x016d, B:13:0x01b9, B:18:0x0213, B:20:0x0226, B:21:0x0276, B:24:0x02e8, B:26:0x02fb, B:27:0x0350, B:31:0x040a, B:33:0x041d, B:34:0x046d, B:36:0x04b2, B:38:0x04c5, B:39:0x0515, B:41:0x051e, B:43:0x053c, B:44:0x0591, B:50:0x099a, B:52:0x09ad, B:53:0x09ff, B:58:0x0bad, B:60:0x0c01, B:61:0x0c51, B:65:0x1291, B:67:0x12a4, B:68:0x12f5, B:71:0x1362, B:73:0x1375, B:74:0x13cc, B:78:0x147c, B:80:0x148f, B:81:0x14e2, B:83:0x152d, B:85:0x1540, B:86:0x158c, B:88:0x1595, B:90:0x15b3, B:91:0x1605, B:97:0x17d0, B:99:0x17e3, B:100:0x1837, B:114:0x191f, B:116:0x1960, B:117:0x19b4, B:121:0x1688, B:123:0x16a6, B:124:0x16f9, B:128:0x1a0e, B:130:0x1a21, B:131:0x1a6e, B:133:0x1aff, B:135:0x1b12, B:136:0x1b5f, B:144:0x1c18, B:146:0x1c5e, B:147:0x1cae, B:151:0x1d05, B:153:0x1d18, B:154:0x1d67, B:156:0x1e45, B:158:0x1e58, B:159:0x1ea4, B:167:0x1f53, B:169:0x1faf, B:170:0x2005, B:177:0x211f, B:179:0x2132, B:180:0x2187, B:188:0x2238, B:190:0x227a, B:191:0x22d0, B:215:0x25a9, B:217:0x25ed, B:218:0x263c, B:222:0x2696, B:224:0x26a9, B:225:0x26f9, B:238:0x29d8, B:240:0x29eb, B:241:0x2a3d, B:250:0x2b01, B:252:0x2b53, B:253:0x2ba4, B:279:0x2c75, B:281:0x2cc3, B:282:0x2d14, B:306:0x2de0, B:308:0x2e28, B:309:0x2e7a, B:312:0x2eab, B:314:0x2eba, B:315:0x2f01, B:319:0x2fc3, B:321:0x3015, B:322:0x3068, B:326:0x307f, B:328:0x3098, B:329:0x30e7, B:333:0x31a8, B:335:0x31fd, B:336:0x324b, B:339:0x3261, B:341:0x3270, B:342:0x32b5, B:346:0x3367, B:348:0x33bf, B:349:0x340e, B:352:0x3424, B:354:0x3433, B:355:0x347a, B:359:0x3529, B:361:0x357d, B:362:0x35cf, B:365:0x35e5, B:367:0x35f4, B:368:0x363b, B:372:0x36fc, B:374:0x3742, B:375:0x3794, B:379:0x37f6, B:381:0x3820, B:382:0x3878, B:386:0x3924, B:388:0x3960, B:389:0x39b3, B:393:0x3a0b, B:395:0x3a1e, B:396:0x3a73, B:400:0x3b26, B:402:0x3b79, B:403:0x3bca, B:406:0x3be0, B:408:0x3bef, B:409:0x3c38, B:413:0x3cd9, B:415:0x3d1f, B:416:0x3d73, B:419:0x3d89, B:421:0x3d98, B:422:0x3de0, B:426:0x3e9d, B:428:0x3ee3, B:429:0x3f37, B:432:0x3f4d, B:434:0x3f5c, B:435:0x3fa6, B:439:0x4048, B:441:0x409f, B:442:0x40f2, B:445:0x4108, B:447:0x4117, B:448:0x4163, B:454:0x4220, B:456:0x4274, B:457:0x42c5, B:459:0x42da, B:461:0x42ed, B:462:0x4331, B:464:0x4339, B:466:0x4369, B:467:0x43c7, B:472:0x447b, B:474:0x44bf, B:475:0x4511, B:591:0x0ae0, B:593:0x0af3, B:594:0x0b3e, B:599:0x0637, B:601:0x0655, B:602:0x06a3, B:606:0x0749, B:608:0x0767, B:609:0x07b7, B:613:0x085d, B:615:0x087b, B:616:0x08d1), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x12fe  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] DigitizedCardProfile$4956fc2a(int i, java.lang.Object obj) {
            java.lang.String str;
            long j;
            java.lang.Object obj2;
            java.lang.Object invoke;
            java.lang.Object obj3;
            long j2;
            java.lang.Object obj4;
            java.lang.Object obj5;
            long j3;
            java.lang.Object obj6;
            java.lang.String[] strArr;
            int i2;
            int i3;
            int i4;
            int i5;
            java.lang.Throwable th;
            java.io.BufferedInputStream bufferedInputStream;
            java.io.BufferedInputStream bufferedInputStream2;
            int i6;
            java.lang.Throwable th2;
            java.io.BufferedInputStream bufferedInputStream3;
            java.io.BufferedInputStream bufferedInputStream4;
            long j4;
            long j5;
            java.lang.Object[] objArr;
            java.lang.Object[] objArr2;
            java.lang.String[] strArr2;
            java.lang.Object obj7;
            char c;
            int i7;
            java.lang.Object obj8;
            try {
                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
                if (obj9 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1838, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(653, (byte) ($$a[14] + 1), r13[16], objArr3);
                    obj9 = cls.getMethod((java.lang.String) objArr3[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, obj9);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, null)).longValue();
                long j6 = i;
                long j7 = ~j6;
                long j8 = j7 | (-217473561);
                long j9 = (370 * longValue) + 80465217200L + ((longValue | 217473560 | j7) * (-369)) + (((~j8) | longValue) * (-369)) + (((~(j8 | longValue)) | (~((~longValue) | 217473560)) | (~(j6 | 217473560))) * 369) + 622605385;
                int i8 = ~i;
                if (((((int) j9) & (((((-1078493627) | i8) * (-757)) - 835337970) + ((~((-1074266129) | i)) * 1514) + (((~(358732783 | i8)) | (-1432998912) | (~((-4227499) | i))) * 757))) | (((int) (j9 >> 32)) & ((((~((-688813) | i)) | (~((-1048593) | i8))) * 920) + 2038856378 + (((~((-1435489007) | i8)) | 688812) * 920) + (((~((-688813) | i8)) | (~((-1434800195) | i)) | (~((-1048593) | i))) * 920)))) != 0) {
                    java.lang.Object[] objArr4 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, null, new int[1]};
                    java.lang.Object[] objArr5 = {615890328, 16, java.lang.Integer.valueOf((((~((-237377948) | i8)) | (-471947573)) * (-933)) + 899197490 + (((~((-471947573) | i8)) | 268517412) * 933) + 446031680)};
                    java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj10 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 2712 - android.view.MotionEvent.axisFromString(""), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        short s = (short) ($$a[14] + 1);
                        byte b = (byte) s;
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        a(s, b, b, objArr6);
                        obj10 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
                    }
                    ((int[]) objArr4[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr5)).intValue();
                    return objArr4;
                }
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(1472192052 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 795057460, (-105) - android.view.View.MeasureSpec.getMode(0), (byte) ((-16777103) - android.graphics.Color.rgb(0, 0, 0)), (short) (17 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), objArr7);
                java.lang.Object[] objArr8 = {((java.lang.String) objArr7[0]).intern()};
                java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj11 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 40, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1921, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a(653, (byte) ($$a[14] + 1), r15[16], objArr9);
                    obj11 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj11);
                }
                java.lang.Object invoke2 = ((java.lang.reflect.Method) obj11).invoke(null, objArr8);
                if (invoke2 != null) {
                    getApplicationLifeCycleData = (getCvmResetTimeout + 61) % 128;
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    b(android.graphics.Color.argb(0, 0, 0, 0) + 1472192052, 795057471 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (-105) - android.view.Gravity.getAbsoluteGravity(0, 0), (byte) (116 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (short) ((-60) - android.graphics.Color.argb(0, 0, 0, 0)), objArr10);
                    java.lang.String intern = ((java.lang.String) objArr10[0]).intern();
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    c("軔檏䙹∮ᾙ\ufb45휲낞", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 58450, objArr11);
                    java.lang.Object[] objArr12 = {invoke2, new java.lang.String[]{intern, ((java.lang.String) objArr11[0]).intern()}};
                    java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                    if (obj12 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 43, 2880 - android.graphics.Color.red(0), (char) ((-1) - android.view.MotionEvent.axisFromString("")));
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a(653, (byte) ($$a[14] + 1), r10[16], objArr13);
                        obj12 = cls4.getMethod((java.lang.String) objArr13[0], java.lang.String.class, java.lang.String[].class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj12);
                    }
                    long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj12).invoke(null, objArr12)).longValue();
                    long j10 = ~((~longValue2) | j6);
                    str = "";
                    long j11 = ((((((-574) * longValue2) + 1119792502332L) + (((~(j7 | 1950858017)) | j10) * 1150)) + (((~(j7 | longValue2)) | j10) * (-575))) + (((~(1950858017 | j6)) | (~((-1950858018) | j7))) * 575)) - 77853761;
                    if (((((int) (j11 >> 32)) & ((((~(4006389 | i8)) | 1441232800) * (-602)) + 270054828 + (((~(4006389 | i)) | 1438799360 | (~((-1572950) | i8))) * (-301)) + ((~(1441232800 | i8)) * 301))) | (((int) j11) & ((((-1479548929) | i8) * (-369)) + 802172634 + (((~(1567629601 | i8)) | 130403191) * (-369)) + (((~((-1567629602) | i)) | 88080673 | (~(1609952119 | i8))) * 369)))) != 0) {
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        c("軁ĕ鄏↘뇥䀱큡悹\uf098胖ፇꍽ㎾쏨券\ue212牂ʉ鋥┭땵䖫햇", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 36809, objArr14);
                        java.lang.Object[] objArr15 = {((java.lang.String) objArr14[0]).intern()};
                        java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj13 == null) {
                            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 40, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1921, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            a(653, (byte) ($$a[14] + 1), r10[16], objArr16);
                            obj13 = cls5.getMethod((java.lang.String) objArr16[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj13);
                        }
                        java.lang.Object invoke3 = ((java.lang.reflect.Method) obj13).invoke(null, objArr15);
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        b(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1472192053, android.os.Process.getGidForName(str) + 795057478, android.text.TextUtils.indexOf(str, str, 0) - 105, (byte) (android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 35), (short) (android.graphics.Color.green(0) + 22), objArr17);
                        java.lang.Object[] objArr18 = {((java.lang.String) objArr17[0]).intern()};
                        java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj14 == null) {
                            java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 41, 1921 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                            a(653, (byte) ($$a[14] + 1), r12[16], objArr19);
                            obj14 = cls6.getMethod((java.lang.String) objArr19[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj14);
                        }
                        java.lang.Object invoke4 = ((java.lang.reflect.Method) obj14).invoke(null, objArr18);
                        if (invoke3 != null) {
                            java.lang.Object[] objArr20 = {invoke3, 42};
                            java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj15 == null) {
                                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, str) + 28, 2594 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                a(653, (byte) ($$a[14] + 1), r14[16], objArr21);
                                obj15 = cls7.getMethod((java.lang.String) objArr21[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj15);
                            }
                            long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj15).invoke(null, objArr20)).longValue();
                            long j12 = ~longValue3;
                            obj7 = invoke3;
                            long j13 = ((302 * longValue3) - 82295819100L) + ((~(longValue3 | 274319397 | j6)) * (-301)) + (((~(j7 | 274319397)) | (~(j12 | j6))) * (-301)) + (((~((-274319398) | j6)) | j12) * 301) + 982781127;
                        } else {
                            obj7 = invoke3;
                        }
                        if (invoke4 != null) {
                            java.lang.Object[] objArr22 = {invoke4, 42};
                            java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj16 == null) {
                                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.graphics.Color.argb(0, 0, 0, 0), 2594 - android.text.TextUtils.indexOf(str, str, 0), (char) android.text.TextUtils.getTrimmedLength(str));
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                a(653, (byte) ($$a[14] + 1), r13[16], objArr23);
                                obj16 = cls8.getMethod((java.lang.String) objArr23[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj16);
                            }
                            long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj16).invoke(null, objArr22)).longValue();
                            long j14 = ((421 * longValue4) - 395059197274L) + ((~(longValue4 | j6)) * 420) + (((-942862047) | longValue4) * (-420)) + (((~(longValue4 | j7)) | (~((~longValue4) | (-942862047)))) * 420) + 314238478;
                            if (((((int) (j14 >> 32)) & (((~((-71925763) | i)) * 623) + 1190658084 + (((-1610608088) | i8) * (-623)) + (((~((-1559880131) | i)) | 71925762 | (~((-122653720) | i))) * 623))) | (((int) j14) & (((((~(278442433 | i8)) | (~(1158783976 | i8))) * (-867)) - 1972008908) + (((~(278442433 | i)) | (-1436136426) | (~(1158783976 | i))) * (-1734)) + (((~(1436136425 | i8)) | (~((-1157693993) | i)) | (~((-277352450) | i))) * 867)))) == 477111747) {
                                j = j7;
                                if (android.os.Build.VERSION.SDK_INT <= 33) {
                                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                                    c("躜鶻ꠝ뒗쌨\ueffb禎डᖯ⁉䲝孰柄牞腨궴렆쓬퍬ￃ\u0a50ᤣ▏〔峮欸矓芯", android.view.KeyEvent.getDeadChar(0, 0) + 4973, objArr24);
                                    java.lang.Object[] objArr25 = {((java.lang.String) objArr24[0]).intern()};
                                    java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                    if (obj17 == null) {
                                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3161, (char) (33098 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                        a(653, (byte) ($$a[14] + 1), r8[16], objArr26);
                                        obj17 = cls9.getMethod((java.lang.String) objArr26[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj17);
                                    }
                                    long j15 = ~((java.lang.Long) ((java.lang.reflect.Method) obj17).invoke(null, objArr25)).longValue();
                                    long j16 = (-254553080) | j15;
                                    long j17 = (((((r7 * (-344)) - 87566259176L) + (((~j16) | (~(j6 | (-254553080)))) * 345)) + (((~(j | (-254553080))) | (~(j15 | 254553079))) * 345)) + ((~(j16 | j6)) * 345)) - 1592221187;
                                    if (((((int) (j17 >> 32)) & ((((~((-1396752706) | i8)) | (-40473706) | (~(1396752705 | i))) * (-564)) + 1874403722 + ((~((-2692137) | i)) * 1128) + (((~((-40473706) | i8)) | (-1399444842)) * 564))) | (((int) j17) & ((((((~((-1868535696) | i8)) | 710283910) | r7) * (-502)) - 1356989159) + (((~(2147456975 | i)) | (~((-1158251786) | i8))) * 502)))) == 1) {
                                        i7 = 1;
                                        c = 0;
                                        int[] iArr = new int[i7];
                                        int[] iArr2 = new int[i7];
                                        iArr[c] = i;
                                        iArr2[c] = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                        java.lang.Object[] objArr27 = {iArr, iArr2, null, new int[i7]};
                                        java.lang.Object[] objArr28 = {615890328, 16, java.lang.Integer.valueOf((((((~(i | (-502858845))) | 206046288) | (~(503279231 | i8))) * 886) - 1655250837) + (((~(502858844 | i8)) | 206466675) * (-1772)) + ((~(206466675 | i8)) * 886))};
                                        obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj8 == null) {
                                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.graphics.Color.red(0) + 2713, (char) android.text.TextUtils.getTrimmedLength(str));
                                            short s2 = (short) ($$a[14] + 1);
                                            byte b2 = (byte) s2;
                                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                                            a(s2, b2, b2, objArr29);
                                            obj8 = cls10.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                                        }
                                        ((int[]) objArr27[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr28)).intValue();
                                        return objArr27;
                                    }
                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                    c("軒愌內䅽ㆴ↑ᇨ=", 61403 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr30);
                                    java.lang.String intern2 = ((java.lang.String) objArr30[0]).intern();
                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                    b(android.graphics.Color.blue(0) + 1472192035, android.graphics.Color.green(0) + 795057521, android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 104, (byte) ((-64) - android.widget.ExpandableListView.getPackedPositionChild(0L)), (short) (46 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr31);
                                    java.lang.String intern3 = ((java.lang.String) objArr31[0]).intern();
                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                    b(1472192037 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.widget.ExpandableListView.getPackedPositionType(0L) + 795057527, (-105) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (android.graphics.Color.blue(0) + 115), (short) (android.view.KeyEvent.normalizeMetaState(0) + 53), objArr32);
                                    java.lang.String intern4 = ((java.lang.String) objArr32[0]).intern();
                                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                                    b((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1472192040, 795057535 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-106) - android.view.MotionEvent.axisFromString(str), (byte) (android.view.KeyEvent.keyCodeFromString(str) - 43), (short) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 27), objArr33);
                                    java.lang.String intern5 = ((java.lang.String) objArr33[0]).intern();
                                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                                    b(1472192043 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 795057543 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.indexOf(str, str) - 105, (byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 'F'), (short) (6 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), objArr34);
                                    java.lang.String intern6 = ((java.lang.String) objArr34[0]).intern();
                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                    b(1472192043 - android.view.View.getDefaultSize(0, 0), android.text.TextUtils.indexOf(str, str, 0, 0) + 795057549, (-104) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 18), (short) (117 - android.text.TextUtils.getOffsetBefore(str, 0)), objArr35);
                                    java.lang.String intern7 = ((java.lang.String) objArr35[0]).intern();
                                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                                    b(android.view.Gravity.getAbsoluteGravity(0, 0) + 1472192043, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 795057561, android.view.View.MeasureSpec.getMode(0) - 105, (byte) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 67), (short) (android.view.View.MeasureSpec.getMode(0) + 44), objArr36);
                                    java.lang.String intern8 = ((java.lang.String) objArr36[0]).intern();
                                    java.lang.Object[] objArr37 = new java.lang.Object[1];
                                    b(1472192043 - android.graphics.Color.alpha(0), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 795057567, (-105) - android.view.KeyEvent.keyCodeFromString(str), (byte) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE), (short) (104 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr37);
                                    java.lang.String intern9 = ((java.lang.String) objArr37[0]).intern();
                                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                                    c("軚ꯗ", 9491 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr38);
                                    java.lang.String intern10 = ((java.lang.String) objArr38[0]).intern();
                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                    b((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1472192046, 795057573 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (-105) - android.graphics.Color.red(0), (byte) (120 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (short) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 126), objArr39);
                                    java.lang.String intern11 = ((java.lang.String) objArr39[0]).intern();
                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                    c("軟愇兢䅖ㆾ↓ᇵ`\uf019\ue063", 61403 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr40);
                                    java.lang.String intern12 = ((java.lang.String) objArr40[0]).intern();
                                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                                    b((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1472192050, 778280373 - android.graphics.Color.rgb(0, 0, 0), (-105) - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 117), (short) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 100), objArr41);
                                    java.lang.String intern13 = ((java.lang.String) objArr41[0]).intern();
                                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                                    b((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1472192049, android.view.View.combineMeasuredStates(0, 0) + 795057597, (-104) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 14), (short) ((-115) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr42);
                                    java.lang.String intern14 = ((java.lang.String) objArr42[0]).intern();
                                    java.lang.Object[] objArr43 = new java.lang.Object[1];
                                    b(android.view.KeyEvent.getDeadChar(0, 0) + 1472192050, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 795057609, android.graphics.Color.green(0) - 105, (byte) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 115), (short) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 125), objArr43);
                                    java.lang.String intern15 = ((java.lang.String) objArr43[0]).intern();
                                    java.lang.Object[] objArr44 = new java.lang.Object[1];
                                    c("軁㓛醙ꃻ曲Ⲝ튉", 47629 - android.text.TextUtils.indexOf(str, str, 0), objArr44);
                                    java.lang.String intern16 = ((java.lang.String) objArr44[0]).intern();
                                    java.lang.Object[] objArr45 = new java.lang.Object[1];
                                    b(1472192053 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 795057623 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 105, (byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 46), (short) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) - 24), objArr45);
                                    java.lang.String intern17 = ((java.lang.String) objArr45[0]).intern();
                                    java.lang.Object[] objArr46 = new java.lang.Object[1];
                                    b(1472192052 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.indexOf(str, str, 0) + 795057630, (-105) - android.view.View.combineMeasuredStates(0, 0), (byte) (127 - (android.os.Process.myPid() >> 22)), (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 75), objArr46);
                                    java.lang.String intern18 = ((java.lang.String) objArr46[0]).intern();
                                    java.lang.Object[] objArr47 = new java.lang.Object[1];
                                    b(1472192053 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 795057637, (-105) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (android.view.KeyEvent.keyCodeFromString(str) - 92), (short) (11 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr47);
                                    java.lang.String intern19 = ((java.lang.String) objArr47[0]).intern();
                                    java.lang.Object[] objArr48 = new java.lang.Object[1];
                                    c("軀\ue722崘덮⥓龕\uf59a殙쇯㟖갞Ȉ硠\uee71䑞몹ႄ蛣ﳇ唸", android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 27110, objArr48);
                                    java.lang.String intern20 = ((java.lang.String) objArr48[0]).intern();
                                    java.lang.Object[] objArr49 = new java.lang.Object[1];
                                    b(1472192054 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.graphics.Color.green(0) + 795057639, (-105) - android.view.View.getDefaultSize(0, 0), (byte) ((-103) - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), (short) (android.text.TextUtils.getOffsetBefore(str, 0) + 4), objArr49);
                                    java.lang.String intern21 = ((java.lang.String) objArr49[0]).intern();
                                    java.lang.Object[] objArr50 = new java.lang.Object[1];
                                    b((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1472192053, android.text.TextUtils.indexOf(str, str, 0) + 795057645, android.view.View.combineMeasuredStates(0, 0) - 105, (byte) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) - 86), (short) (100 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), objArr50);
                                    java.lang.String intern22 = ((java.lang.String) objArr50[0]).intern();
                                    java.lang.Object[] objArr51 = new java.lang.Object[1];
                                    b(android.view.Gravity.getAbsoluteGravity(0, 0) + 1472192053, 795057647 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.graphics.Color.red(0) - 105, (byte) ((-72) - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (short) (4 - android.view.View.resolveSize(0, 0)), objArr51);
                                    java.lang.String intern23 = ((java.lang.String) objArr51[0]).intern();
                                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                                    c("軇쯄Ә䇟髂ퟚ\u10cc淤꛳", 17670 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr52);
                                    java.lang.String intern24 = ((java.lang.String) objArr52[0]).intern();
                                    java.lang.Object[] objArr53 = new java.lang.Object[1];
                                    b(1472192054 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 795057663 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 106, (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 77), (short) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 55), objArr53);
                                    java.lang.String intern25 = ((java.lang.String) objArr53[0]).intern();
                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                    b(1472192054 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.view.KeyEvent.normalizeMetaState(0) + 795057673, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 106, (byte) (android.graphics.Color.argb(0, 0, 0, 0) - 1), (short) ((-84) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr54);
                                    java.lang.String intern26 = ((java.lang.String) objArr54[0]).intern();
                                    java.lang.Object[] objArr55 = new java.lang.Object[1];
                                    c("軆焚煊熏燁瀴灆炫烥猪猚", org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF7_MARKER - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr55);
                                    java.lang.String intern27 = ((java.lang.String) objArr55[0]).intern();
                                    java.lang.Object[] objArr56 = new java.lang.Object[1];
                                    c("軆\u0b8c葦ĩ鮙ᑂ鄊⯶ꑞℍ믆㒡넑䯈쒲", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 34129, objArr56);
                                    java.lang.String intern28 = ((java.lang.String) objArr56[0]).intern();
                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                    c("軆젚͊媏闁\uef34♆憱룲\uf221䴗葑\udf8bᛛ", android.graphics.Color.argb(0, 0, 0, 0) + 18119, objArr57);
                                    java.lang.String[] strArr3 = {intern2, intern3, intern4, intern5, intern6, intern7, intern8, intern9, intern10, intern11, intern12, intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, ((java.lang.String) objArr57[0]).intern()};
                                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                                    b(1472192052 - android.view.View.MeasureSpec.getMode(0), 795057460 - android.text.TextUtils.indexOf(str, str, 0), (-105) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (113 - android.view.View.MeasureSpec.getSize(0)), (short) (18 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr58);
                                    java.lang.Object[] objArr59 = {((java.lang.String) objArr58[0]).intern()};
                                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj2 == null) {
                                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 40, android.graphics.Color.green(0) + 1921, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                                        java.lang.Object[] objArr60 = new java.lang.Object[1];
                                        a(653, (byte) ($$a[14] + 1), r9[16], objArr60);
                                        obj2 = cls11.getMethod((java.lang.String) objArr60[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj2);
                                    }
                                    invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr59);
                                    if (invoke != null) {
                                        java.lang.Object[] objArr61 = new java.lang.Object[1];
                                        b((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1472192052, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 795057471, (-106) - android.os.Process.getGidForName(str), (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 116), (short) ((-60) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr61);
                                        java.lang.String intern29 = ((java.lang.String) objArr61[0]).intern();
                                        java.lang.Object[] objArr62 = new java.lang.Object[1];
                                        c("軔檏䙹∮ᾙ\ufb45휲낞", 58451 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr62);
                                        java.lang.Object[] objArr63 = {invoke, new java.lang.String[]{intern29, ((java.lang.String) objArr62[0]).intern()}};
                                        java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                        if (obj18 == null) {
                                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 44, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2880, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                            java.lang.Object[] objArr64 = new java.lang.Object[1];
                                            a(653, (byte) ($$a[14] + 1), r9[16], objArr64);
                                            obj18 = cls12.getMethod((java.lang.String) objArr64[0], java.lang.String.class, java.lang.String[].class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj18);
                                        }
                                        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj18).invoke(null, objArr63)).longValue();
                                        long j18 = ~longValue5;
                                        long j19 = ((((((-68) * longValue5) - 110460667170L) + (((~((j18 | 1578009530) | j6)) | (~((longValue5 | (-1578009531)) | j6))) * 69)) + ((((~(1578009530 | longValue5)) | (~(1578009530 | j6))) | (~(longValue5 | j6))) * (-69))) + ((~((-1578009531) | j18)) * 69)) - 450702248;
                                        if (((((int) (j19 >> 32)) & (((((~((-341944966) | i)) | 1779171376) * (-756)) - 1316587742) + (((-341944966) | i8) * 756))) | (((int) j19) & (((((~((-1382591641) | i)) | (~(1475149245 | i))) * 69) - 1663235762) + (((~((-1458355646) | i)) | 75764005 | (~(1399385240 | i))) * (-69)) + 1158758400))) != 0) {
                                            java.lang.Object[] objArr65 = new java.lang.Object[1];
                                            c("軁ĕ鄏↘뇥䀱큡悹\uf098胖ፇꍽ㎾쏨券\ue212牂ʉ鋥┭땵䖫햇", 36809 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr65);
                                            java.lang.Object[] objArr66 = {((java.lang.String) objArr65[0]).intern()};
                                            java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj19 == null) {
                                                java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1921, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                                                java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                a(653, (byte) ($$a[14] + 1), r9[16], objArr67);
                                                obj19 = cls13.getMethod((java.lang.String) objArr67[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj19);
                                            }
                                            java.lang.Object invoke5 = ((java.lang.reflect.Method) obj19).invoke(null, objArr66);
                                            java.lang.Object[] objArr68 = new java.lang.Object[1];
                                            b(1472192051 - android.view.MotionEvent.axisFromString(str), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 795057477, (-106) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 36), (short) (android.view.View.MeasureSpec.getSize(0) + 22), objArr68);
                                            java.lang.Object[] objArr69 = {((java.lang.String) objArr68[0]).intern()};
                                            java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj20 == null) {
                                                java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.green(0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1920, (char) android.text.TextUtils.indexOf(str, str, 0));
                                                java.lang.Object[] objArr70 = new java.lang.Object[1];
                                                a(653, (byte) ($$a[14] + 1), r9[16], objArr70);
                                                obj20 = cls14.getMethod((java.lang.String) objArr70[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj20);
                                            }
                                            java.lang.Object invoke6 = ((java.lang.reflect.Method) obj20).invoke(null, objArr69);
                                            if (invoke5 != null) {
                                                java.lang.Object[] objArr71 = {invoke5, 42};
                                                java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                if (obj21 == null) {
                                                    java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27, android.text.TextUtils.indexOf(str, str, 0, 0) + 2594, (char) android.graphics.Color.blue(0));
                                                    java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                    a(653, (byte) ($$a[14] + 1), r8[16], objArr72);
                                                    obj21 = cls15.getMethod((java.lang.String) objArr72[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj21);
                                                }
                                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, objArr71)).longValue();
                                                long j20 = ((561 * longValue6) - 71912053577L) + ((~(j | 128644103)) * (-560)) + ((~((~longValue6) | 128644103 | j6)) * (-560)) + (((~(j | longValue6)) | (~(longValue6 | (-128644104)))) * 560) + 1128456421;
                                            }
                                            if (invoke6 != null) {
                                                java.lang.Object[] objArr73 = {invoke6, 42};
                                                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                if (obj22 == null) {
                                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore(str, 0) + 28, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2594, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                    java.lang.Object[] objArr74 = new java.lang.Object[1];
                                                    a(653, (byte) ($$a[14] + 1), r8[16], objArr74);
                                                    obj22 = cls16.getMethod((java.lang.String) objArr74[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj22);
                                                }
                                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr73)).longValue();
                                                long j21 = (~((-129158510) | (~longValue7))) | (~((-129158510) | j6));
                                                long j22 = (((-495) * longValue7) - 63933461955L) + (992 * j21) + (((~(j | 129158509 | longValue7)) | j21) * (-496)) + ((longValue7 | j6) * 496) + 1127942015;
                                            }
                                        }
                                    }
                                    java.lang.Object[] objArr75 = new java.lang.Object[1];
                                    b(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1472191985, 795057684 - android.text.TextUtils.indexOf(str, str), android.widget.ExpandableListView.getPackedPositionType(0L) - 105, (byte) (android.view.KeyEvent.keyCodeFromString(str) - 55), (short) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 35), objArr75);
                                    java.lang.Object[] objArr76 = {((java.lang.String) objArr75[0]).intern()};
                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj3 == null) {
                                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, (android.os.Process.myTid() >> 22) + 2807, (char) android.graphics.Color.red(0));
                                        java.lang.Object[] objArr77 = new java.lang.Object[1];
                                        a(653, (byte) ($$a[14] + 1), r8[16], objArr77);
                                        obj3 = cls17.getMethod((java.lang.String) objArr77[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj3);
                                    }
                                    long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr76)).longValue();
                                    long j23 = ~((~longValue8) | (-21626433));
                                    long j24 = (((-107) * longValue8) - 1189453815) + (((~(longValue8 | 21626432)) | (~(j | longValue8))) * (-108)) + (((~(21626432 | j6)) | j23 | (~(j | (-21626433)))) * 54) + ((j6 | j23) * 54) + 1312166500;
                                    int i9 = (-255709074) | i8;
                                    j2 = (((int) (j24 >> 32)) & ((((~((-1532397049) | i8)) | android.R.string.config_defaultRetailDemo | (~((-95170638) | i8))) * (-397)) + 866816144 + (((-1593488822) | i) * 397))) | (((int) j24) & ((i9 * 495) + 1587156746 + (((~i9) | (-1333645210)) * 495)));
                                    java.lang.Object[] objArr78 = new java.lang.Object[1];
                                    c("躜ꃴ튯ѹ㘌榏鮊쵗ｧᄺ䂺犝ꑓ혙\u09c5㯿涰", android.view.View.MeasureSpec.getMode(0) + 11831, objArr78);
                                    java.lang.Object[] objArr79 = {((java.lang.String) objArr78[0]).intern()};
                                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj4 == null) {
                                        java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.Gravity.getAbsoluteGravity(0, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2806, (char) android.text.TextUtils.indexOf(str, str, 0, 0));
                                        java.lang.Object[] objArr80 = new java.lang.Object[1];
                                        a(653, (byte) ($$a[14] + 1), r10[16], objArr80);
                                        obj4 = cls18.getMethod((java.lang.String) objArr80[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj4);
                                    }
                                    long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr79)).longValue();
                                    long j25 = ((421 * longValue9) - 334273818098L) + ((~(longValue9 | j6)) * 420) + (((-797789543) | longValue9) * (-420)) + (((~(j | longValue9)) | (~((-797789543) | (~longValue9)))) * 420) + 492750525;
                                    int i10 = ~((-836231687) | i);
                                    long j26 = (((int) (j25 >> 32)) & (((((~((-836231687) | i8)) | 268795906) * (-245)) - 1059260044) + (i10 * (-245)) + ((i10 | 600994724) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))) | (((int) j25) & (((((~(1030762679 | i8)) | 656448) * 98) - 1943585214) + (((~(406463730 | i8)) | 1030762679 | (~((-406463731) | i))) * (-49)) + (((~(1030762679 | i)) | 405807282) * 49)));
                                    if (j2 <= 0 && j26 > 0 && j26 - 3 < j2) {
                                        java.lang.Object[] objArr81 = {new int[]{i}, new int[]{i ^ 247}, null, new int[1]};
                                        java.lang.Object[] objArr82 = {615890328, 16, java.lang.Integer.valueOf(((((~(i | 902793036)) | 167776304) * 305) - 1989722672) + (((~(902793036 | i8)) | 193467516) * 305))};
                                        java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj23 == null) {
                                            java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2713 - android.view.KeyEvent.keyCodeFromString(str), (char) android.graphics.Color.blue(0));
                                            short s3 = (short) ($$a[14] + 1);
                                            byte b3 = (byte) s3;
                                            java.lang.Object[] objArr83 = new java.lang.Object[1];
                                            a(s3, b3, b3, objArr83);
                                            obj23 = cls19.getMethod((java.lang.String) objArr83[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj23);
                                        }
                                        ((int[]) objArr81[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr82)).intValue();
                                        return objArr81;
                                    }
                                    java.lang.Object[] objArr84 = new java.lang.Object[1];
                                    b(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1472191986, 795057683 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 104, (byte) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 54), (short) (35 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr84);
                                    java.lang.Object[] objArr85 = {((java.lang.String) objArr84[0]).intern()};
                                    obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj5 == null) {
                                        java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.view.MotionEvent.axisFromString(str), 2806 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                                        java.lang.Object[] objArr86 = new java.lang.Object[1];
                                        a(653, (byte) ($$a[14] + 1), r8[16], objArr86);
                                        obj5 = cls20.getMethod((java.lang.String) objArr86[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj5);
                                    }
                                    long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr85)).longValue();
                                    long j27 = ~((~longValue10) | 960393890);
                                    long j28 = ((-107) * longValue10) + 52821663950L + (((~(longValue10 | (-960393891))) | (~(j | longValue10))) * (-108)) + (((~((-960393891) | j6)) | j27 | (~(j | 960393890))) * 54) + ((j6 | j27) * 54) + 330146177;
                                    j3 = (((int) (j28 >> 32)) & (((((~(1007137004 | i8)) | 1850603880) * (-933)) - 1882160746) + (((~(1850603880 | i8)) | 268566660) * 933) + 1891363592)) | (((int) j28) & (((357832101 | i) * 614) + 1429850259 + (((~((-1539628638) | i8)) | 289674245 | (~(1318112248 | i8))) * (-1228)) + (((~((-1249954393) | i8)) | (~(1607786493 | i8))) * 614)));
                                    java.lang.Object[] objArr87 = new java.lang.Object[1];
                                    b(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1472191986, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 795057706, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 106, (byte) (android.text.TextUtils.getOffsetAfter(str, 0) - 39), (short) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2), objArr87);
                                    java.lang.Object[] objArr88 = {((java.lang.String) objArr87[0]).intern()};
                                    obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj6 == null) {
                                        java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, str, 0, 0) + 29, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2807, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                        java.lang.Object[] objArr89 = new java.lang.Object[1];
                                        a(653, (byte) ($$a[14] + 1), r10[16], objArr89);
                                        obj6 = cls21.getMethod((java.lang.String) objArr89[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj6);
                                    }
                                    long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr88)).longValue();
                                    long j29 = ((530 * longValue11) - 386250917482L) + (((~(j | (-728775318))) | (~(longValue11 | (-728775318)))) * 529) + (((~longValue11) | (~((-728775318) | j6))) * 529) + 2019315385;
                                    long j30 = (((int) (j29 >> 32)) & ((((~(625250373 | i)) | (-1605006774)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 1546597394 + (((~(625250373 | i8)) | (-1605006774)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) | (((int) j29) & ((((~(610814561 | i8)) | (-826411849)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + 1453938690 + (((~((-285344009) | i8)) | (~((-541067841) | i))) * (-519)) + (((~((-826411849) | i)) | (-610814562)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE)));
                                    if (j3 <= 0 && j30 > 0 && j30 + 100 < j3) {
                                        java.lang.Object[] objArr90 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                                        java.lang.Object[] objArr91 = {615890328, 16, java.lang.Integer.valueOf((((~((-709362897) | i8)) | (~((-270795016) | i)) | (~(980195287 | i))) * 765) + 1039657665 + (((~((-980157912) | i8)) | 709362896) * 1530) + (((~(i | (-980157912))) | (~(980195287 | i8))) * 765))};
                                        java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj24 == null) {
                                            java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2712, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                                            short s4 = (short) ($$a[14] + 1);
                                            byte b4 = (byte) s4;
                                            java.lang.Object[] objArr92 = new java.lang.Object[1];
                                            a(s4, b4, b4, objArr92);
                                            obj24 = cls22.getMethod((java.lang.String) objArr92[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj24);
                                        }
                                        ((int[]) objArr90[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr91)).intValue();
                                        return objArr90;
                                    }
                                    java.lang.Object[] objArr93 = new java.lang.Object[1];
                                    c("躜钩먘쇻\ue763\u0adbႨ", android.text.TextUtils.indexOf(str, str) + 6761, objArr93);
                                    java.lang.String intern30 = ((java.lang.String) objArr93[0]).intern();
                                    java.lang.Object[] objArr94 = new java.lang.Object[1];
                                    c("躜\ue3e5咀즯㩓꽯\u0000犟\ue7f9増춯", 27942 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr94);
                                    java.lang.String intern31 = ((java.lang.String) objArr94[0]).intern();
                                    java.lang.Object[] objArr95 = new java.lang.Object[1];
                                    c("躜䥥ƀ\ud82f道棯⌀ײַ돨訜䊨᫊", android.text.TextUtils.getTrimmedLength(str) + 51109, objArr95);
                                    java.lang.String intern32 = ((java.lang.String) objArr95[0]).intern();
                                    java.lang.Object[] objArr96 = new java.lang.Object[1];
                                    c("躜鍇뗄확\uf8dbᵵ㿴䀭拳蝮ꦜ쨐", android.graphics.Color.red(0) + 7559, objArr96);
                                    java.lang.String intern33 = ((java.lang.String) objArr96[0]).intern();
                                    java.lang.Object[] objArr97 = new java.lang.Object[1];
                                    c("躜㿴\uecb4鵎䨓﬩ꧧ囋ݙ둣攷", 45361 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr97);
                                    java.lang.String intern34 = ((java.lang.String) objArr97[0]).intern();
                                    java.lang.Object[] objArr98 = new java.lang.Object[1];
                                    b(1472191985 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.widget.ExpandableListView.getPackedPositionType(0L) + 795057711, (-105) - android.view.View.combineMeasuredStates(0, 0), (byte) (41 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), (short) ((-11) - android.view.View.resolveSizeAndState(0, 0, 0)), objArr98);
                                    java.lang.String intern35 = ((java.lang.String) objArr98[0]).intern();
                                    java.lang.Object[] objArr99 = new java.lang.Object[1];
                                    b((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1472191984, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 40452, (-105) - android.view.View.MeasureSpec.getSize(0), (byte) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3), (short) ((-22) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr99);
                                    strArr = new java.lang.String[]{intern30, intern31, intern32, intern33, intern34, intern35, ((java.lang.String) objArr99[0]).intern()};
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < 7) {
                                            i3 = 0;
                                            break;
                                        }
                                        java.lang.Object[] objArr100 = {strArr[i2]};
                                        java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                                        if (obj25 == null) {
                                            java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 27, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1671, (char) ((android.os.Process.myPid() >> 22) + 47940));
                                            java.lang.Object[] objArr101 = new java.lang.Object[1];
                                            a(653, (byte) ($$a[14] + 1), r10[16], objArr101);
                                            obj25 = cls23.getMethod((java.lang.String) objArr101[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj25);
                                        }
                                        long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr100)).longValue();
                                        long j31 = ~longValue12;
                                        strArr2 = strArr;
                                        long j32 = ~(j31 | j6);
                                        long j33 = (((((longValue12 * 246) + 70836281476L) + (((~(j31 | (-290312629))) | (~(j31 | j))) * (-245))) + ((-245) * j32)) + ((j32 | (-290312629)) * 245)) - 1335217553;
                                        int i11 = (int) (j33 >> 32);
                                        int i12 = (int) j33;
                                        int i13 = ~(1675516932 | i);
                                        if (((i11 & ((((~((-1082204169) | i)) | 287573250) * 449) + 316118686 + (((~((-1082204169) | i8)) | 287573250) * 449))) | (i12 & ((((-1878941279) | i13) * (-280)) + 1212669537 + ((i13 | (~((-238290523) | i))) * 140) + (((~((-203424347) | i)) | (~(1878941278 | i8)) | (~((-34866177) | i8))) * 140)))) != 0) {
                                            i3 = i2 + 90;
                                            break;
                                        }
                                        i2++;
                                        strArr = strArr2;
                                    }
                                    if (i3 == 0) {
                                        java.lang.Object[] objArr102 = {new int[]{i}, new int[]{i3 ^ i}, null, new int[1]};
                                        java.lang.Object[] objArr103 = {615890328, 16, java.lang.Integer.valueOf(((~(i | 666977029)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 1230273703 + (((~(666977029 | i8)) | 41943808) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))};
                                        java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj26 == null) {
                                            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2712 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                            short s5 = (short) ($$a[14] + 1);
                                            byte b5 = (byte) s5;
                                            java.lang.Object[] objArr104 = new java.lang.Object[1];
                                            a(s5, b5, b5, objArr104);
                                            obj26 = cls24.getMethod((java.lang.String) objArr104[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj26);
                                        }
                                        ((int[]) objArr102[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj26).invoke(null, objArr103)).intValue();
                                        return objArr102;
                                    }
                                    try {
                                        objArr = new java.lang.Object[1];
                                        b((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1472192053, 795057720 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (-105) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (android.text.TextUtils.getOffsetAfter(str, 0) + 56), (short) (android.view.View.MeasureSpec.getMode(0) + 114), objArr);
                                    } catch (java.lang.Exception unused) {
                                    }
                                    try {
                                        java.lang.Object[] objArr105 = {((java.lang.String) objArr[0]).intern()};
                                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj27 == null) {
                                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 40, 1920 - android.view.MotionEvent.axisFromString(str), (char) ((-1) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                            java.lang.Object[] objArr106 = new java.lang.Object[1];
                                            a(653, (byte) ($$a[14] + 1), r8[16], objArr106);
                                            obj27 = cls25.getMethod((java.lang.String) objArr106[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj27);
                                        }
                                        java.lang.String str2 = (java.lang.String) ((java.lang.reflect.Method) obj27).invoke(null, objArr105);
                                        try {
                                            if (str2 != null) {
                                                java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                b((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1472192037, 795057733 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (android.os.Process.myTid() >> 22) - 105, (byte) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 81), (short) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 49), objArr107);
                                                java.lang.String[] strArr4 = {((java.lang.String) objArr107[0]).intern()};
                                                for (int i14 = 0; i14 <= 0; i14++) {
                                                    if (!str2.contains(strArr4[i14])) {
                                                    }
                                                }
                                                i4 = 0;
                                                if (i4 != 0) {
                                                    java.lang.Object[] objArr108 = {new int[]{i}, new int[]{i4 ^ i}, null, new int[1]};
                                                    java.lang.Object[] objArr109 = {615890328, 16, java.lang.Integer.valueOf((((((~((-463950867) | i)) | 178263056) | r4) * (-470)) - 1406384081) + (((~(i | (-285687811))) | (~(531062463 | i8))) * 470))};
                                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj28 == null) {
                                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 50, android.graphics.ImageFormat.getBitsPerPixel(0) + 2714, (char) android.text.TextUtils.getCapsMode(str, 0, 0));
                                                        short s6 = (short) ($$a[14] + 1);
                                                        byte b6 = (byte) s6;
                                                        java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                        a(s6, b6, b6, objArr110);
                                                        obj28 = cls26.getMethod((java.lang.String) objArr110[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj28);
                                                    }
                                                    ((int[]) objArr108[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr109)).intValue();
                                                    return objArr108;
                                                }
                                                java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                b(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1472192053, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 40456, android.text.TextUtils.getCapsMode(str, 0, 0) - 105, (byte) (56 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (short) (114 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr111);
                                                java.lang.Object[] objArr112 = {((java.lang.String) objArr111[0]).intern()};
                                                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj29 == null) {
                                                    java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1920, (char) (android.os.Process.myPid() >> 22));
                                                    java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                    a(653, (byte) ($$a[14] + 1), r8[16], objArr113);
                                                    obj29 = cls27.getMethod((java.lang.String) objArr113[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj29);
                                                }
                                                java.lang.String str3 = (java.lang.String) ((java.lang.reflect.Method) obj29).invoke(null, objArr112);
                                                if (str3 != null) {
                                                    java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                    b((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1472192037, 795057732 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (-105) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) (81 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (short) (android.view.View.combineMeasuredStates(0, 0) + 49), objArr114);
                                                    java.lang.String[] strArr5 = {((java.lang.String) objArr114[0]).intern()};
                                                    int i15 = 0;
                                                    while (true) {
                                                        if (i15 > 0) {
                                                            java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                            b(1472191985 - android.view.View.resolveSizeAndState(0, 0, 0), android.view.View.getDefaultSize(0, 0) + 795057762, (-105) - android.view.KeyEvent.keyCodeFromString(str), (byte) (android.view.View.resolveSizeAndState(0, 0, 0) + 107), (short) (android.view.View.MeasureSpec.getMode(0) - 100), objArr115);
                                                            java.lang.String intern36 = ((java.lang.String) objArr115[0]).intern();
                                                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                            c("躜譤薴鿞頞鋣곭ꤹꍈ붙똡뀭쪵쓍섗\udbe1", 1459 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr116);
                                                            java.lang.String intern37 = ((java.lang.String) objArr116[0]).intern();
                                                            java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                            c("躜ﮈ摬\ueeda宮쑇以뭅\u2428꺅᭩薉\u0ebf笂\ue5e8湌\udb6c", (android.os.Process.myTid() >> 22) + 30047, objArr117);
                                                            java.lang.String intern38 = ((java.lang.String) objArr117[0]).intern();
                                                            java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                            b(1472191985 - android.text.TextUtils.getOffsetBefore(str, 0), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 795057775, 65479 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 85), (short) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 73), objArr118);
                                                            java.lang.String intern39 = ((java.lang.String) objArr118[0]).intern();
                                                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                            c("躜訡蜈聣鵃隳鎘겻꧙ꔳ븗묷", 1249 - android.text.TextUtils.getOffsetAfter(str, 0), objArr119);
                                                            java.lang.String intern40 = ((java.lang.String) objArr119[0]).intern();
                                                            java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                            b(1472191984 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.text.TextUtils.getTrimmedLength(str) + 795057780, android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 104, (byte) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) - 42), (short) (android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 104), objArr120);
                                                            java.lang.String intern41 = ((java.lang.String) objArr120[0]).intern();
                                                            java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                            c("躜ㇳ\uf0ac덙爋㔩\uf5ec듹睉㘑藍릭碱㭅塚봢緰㲱ｃ븟慠", 48947 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr121);
                                                            java.lang.String intern42 = ((java.lang.String) objArr121[0]).intern();
                                                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                            b((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1472191985, 795057796 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-105) - android.widget.ExpandableListView.getPackedPositionType(0L), (byte) ((-102) - android.text.TextUtils.getOffsetAfter(str, 0)), (short) (84 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr122);
                                                            java.lang.String intern43 = ((java.lang.String) objArr122[0]).intern();
                                                            java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                            c("躜椝䅰㥗ᆳই\ue1f0\ud997뀮ꠅ聣磣傘䣯₈ᬮ\uf306\ueb7b썝믹鎅诽戢娜㈤", 59357 - android.text.TextUtils.indexOf(str, str, 0), objArr123);
                                                            java.lang.String intern44 = ((java.lang.String) objArr123[0]).intern();
                                                            java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                            c("躜\u0b0d蕐ᾧ駳Ꮧ감☇ꂣ㫤듘ㄒ쬀", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 34253, objArr124);
                                                            java.lang.String intern45 = ((java.lang.String) objArr124[0]).intern();
                                                            java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                            b(android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1472191986, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 795057813, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 106, (byte) ((-51) - (android.view.ViewConfiguration.getTouchSlop() >> 8)), (short) (111 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), objArr125);
                                                            java.lang.String intern46 = ((java.lang.String) objArr125[0]).intern();
                                                            java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                            b(1472191985 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 795057822 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.text.TextUtils.indexOf(str, str) - 105, (byte) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 88), (short) (65510 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr126);
                                                            java.lang.String[] strArr6 = {intern36, intern37, intern38, intern39, intern40, intern41, intern42, intern43, intern44, intern45, intern46, ((java.lang.String) objArr126[0]).intern()};
                                                            int i16 = 0;
                                                            while (i16 < 12) {
                                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                sb.append(strArr6[i16]);
                                                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                b(1472192053 - android.view.Gravity.getAbsoluteGravity(0, 0), 795057645 - android.view.Gravity.getAbsoluteGravity(0, 0), (-105) - android.view.KeyEvent.getDeadChar(0, 0), (byte) ((-87) - android.view.View.resolveSizeAndState(0, 0, 0)), (short) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 101), objArr127);
                                                                sb.append(((java.lang.String) objArr127[0]).intern());
                                                                java.lang.Object[] objArr128 = {sb.toString()};
                                                                java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                if (obj30 == null) {
                                                                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 36, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3161, (char) (33099 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)));
                                                                    byte[] bArr = $$a;
                                                                    java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                                    a(41, (byte) (-bArr[14]), (byte) (-bArr[21]), objArr129);
                                                                    obj30 = cls28.getMethod((java.lang.String) objArr129[0], java.lang.String.class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj30);
                                                                }
                                                                long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr128)).longValue();
                                                                long j34 = ~((~longValue13) | 169357081);
                                                                java.lang.String[] strArr7 = strArr6;
                                                                long j35 = ((-107) * longValue13) + 9314639455L + (((~(longValue13 | (-169357082))) | (~(j | longValue13))) * (-108)) + (((~((-169357082) | j6)) | j34 | (~(j | 169357081))) * 54) + ((j6 | j34) * 54) + 826077822;
                                                                if (((((int) (j35 >> 32)) & ((((~(1274892151 | i8)) * 52) - 1277463174) + (((~(166547315 | i8)) | (~((-1270679096) | i8)) | 1108344836) * (-52)) + (((~((-166547316) | i8)) | 4213056) * 52))) | (((int) j35) & (((((~(1981704633 | i8)) | 544478223) * (-235)) - 779653087) + (((~(1981704633 | i)) | 544478223) * (-470)) + (((~(1988001215 | i)) | 538181641) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE)))) != 0) {
                                                                    i5 = i16 + 110;
                                                                    break;
                                                                }
                                                                i16++;
                                                                strArr6 = strArr7;
                                                            }
                                                        } else {
                                                            if (str3.contains(strArr5[i15])) {
                                                                break;
                                                            }
                                                            i15++;
                                                        }
                                                    }
                                                }
                                                i5 = 0;
                                                if (i5 != 0) {
                                                    java.lang.Object[] objArr130 = {new int[]{i}, new int[]{i ^ i5}, null, new int[1]};
                                                    java.lang.Object[] objArr131 = {615890328, 16, java.lang.Integer.valueOf((((((~((-335544872) | i8)) | (~((-28739593) | i8))) * (-184)) - 957551097) + ((((~((-508065400) | i8)) | 172520528) | (~((-201260121) | i8))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) - 12129464)};
                                                    java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj31 == null) {
                                                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, str) + 50, 2761 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                        short s7 = (short) ($$a[14] + 1);
                                                        byte b7 = (byte) s7;
                                                        java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                        a(s7, b7, b7, objArr132);
                                                        obj31 = cls29.getMethod((java.lang.String) objArr132[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj31);
                                                    }
                                                    ((int[]) objArr130[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr131)).intValue();
                                                    return objArr130;
                                                }
                                                long[] jArr = {472001035};
                                                java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                b((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1472191984, 795057830 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (-104) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13), (short) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), objArr133);
                                                try {
                                                    bufferedInputStream2 = new java.io.BufferedInputStream(new java.io.FileInputStream(((java.lang.String) objArr133[0]).intern()));
                                                    j5 = 0;
                                                } catch (java.io.IOException unused2) {
                                                    bufferedInputStream2 = null;
                                                } catch (java.lang.Throwable th3) {
                                                    th = th3;
                                                    bufferedInputStream = null;
                                                }
                                                while (true) {
                                                    try {
                                                        int read = bufferedInputStream2.read();
                                                        if (read != -1) {
                                                            j5 = (read ^ (j5 << 5)) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                                                            for (int i17 = 0; i17 <= 0; i17++) {
                                                                if (j5 == jArr[i17]) {
                                                                    int i18 = i17 + 1;
                                                                    try {
                                                                        bufferedInputStream2.close();
                                                                    } catch (java.lang.Exception unused3) {
                                                                    }
                                                                    if (i18 != 0) {
                                                                        i6 = 240;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } catch (java.io.IOException unused4) {
                                                    } catch (java.lang.Throwable th4) {
                                                        th = th4;
                                                        bufferedInputStream = bufferedInputStream2;
                                                        if (bufferedInputStream == null) {
                                                            throw th;
                                                        }
                                                        try {
                                                            bufferedInputStream.close();
                                                            throw th;
                                                        } catch (java.lang.Exception unused5) {
                                                            throw th;
                                                        }
                                                    }
                                                    try {
                                                        bufferedInputStream2.close();
                                                        break;
                                                    } catch (java.lang.Exception unused6) {
                                                    }
                                                }
                                                getCvmResetTimeout = (getApplicationLifeCycleData + 93) % 128;
                                                i6 = 0;
                                                if (i6 != 0) {
                                                    java.lang.Object[] objArr134 = {new int[]{i}, new int[]{i6 ^ i}, null, new int[1]};
                                                    java.lang.Object[] objArr135 = {615890328, 16, java.lang.Integer.valueOf((((~((-415505595) | i)) | (-432496320)) * (-502)) + 1665989213 + ((~((-138676395) | i8)) * (-502)) + (((~(i | (-293819926))) | (-415505595)) * 502))};
                                                    java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj32 == null) {
                                                        java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 50, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2713, (char) android.text.TextUtils.getCapsMode(str, 0, 0));
                                                        short s8 = (short) ($$a[14] + 1);
                                                        byte b8 = (byte) s8;
                                                        java.lang.Object[] objArr136 = new java.lang.Object[1];
                                                        a(s8, b8, b8, objArr136);
                                                        obj32 = cls30.getMethod((java.lang.String) objArr136[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj32);
                                                    }
                                                    ((int[]) objArr134[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr135)).intValue();
                                                    return objArr134;
                                                }
                                                long[] jArr2 = {472001035};
                                                java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                b((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1472191984, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 795057847, (-106) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) ((-47) - android.os.Process.getGidForName(str)), (short) (6 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr137);
                                                try {
                                                    bufferedInputStream4 = new java.io.BufferedInputStream(new java.io.FileInputStream(((java.lang.String) objArr137[0]).intern()));
                                                    j4 = 0;
                                                } catch (java.io.IOException unused7) {
                                                    bufferedInputStream4 = null;
                                                } catch (java.lang.Throwable th5) {
                                                    th2 = th5;
                                                    bufferedInputStream3 = null;
                                                }
                                                while (true) {
                                                    try {
                                                        int read2 = bufferedInputStream4.read();
                                                        if (read2 != -1) {
                                                            long j36 = ((j4 << 5) ^ read2) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                                                            for (int i19 = 0; i19 <= 0; i19++) {
                                                                if (j36 == jArr2[i19]) {
                                                                    getCvmResetTimeout = (getApplicationLifeCycleData + 13) % 128;
                                                                    int i20 = i19 + 1;
                                                                    try {
                                                                        bufferedInputStream4.close();
                                                                    } catch (java.lang.Exception unused8) {
                                                                    }
                                                                    if (i20 != 0) {
                                                                        int i21 = getApplicationLifeCycleData + 95;
                                                                        getCvmResetTimeout = i21 % 128;
                                                                        if (i21 % 2 != 0) {
                                                                            java.lang.Object[] objArr138 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, null, new int[1]};
                                                                            int i22 = (~((-126015620) | i8)) | 84033667 | (~(583309900 | i8));
                                                                            java.lang.Object[] objArr139 = {615890328, 16, java.lang.Integer.valueOf((((~(i | (-541327949))) | i22) * 590) + 1488639377 + (i22 * (-1180)) + (((~((-583309901) | i8)) | (~(126015619 | i8))) * 590))};
                                                                            java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj33 == null) {
                                                                                java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 2712 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) android.graphics.Color.red(0));
                                                                                short s9 = (short) ($$a[14] + 1);
                                                                                byte b9 = (byte) s9;
                                                                                java.lang.Object[] objArr140 = new java.lang.Object[1];
                                                                                a(s9, b9, b9, objArr140);
                                                                                obj33 = cls31.getMethod((java.lang.String) objArr140[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                                                            }
                                                                            ((int[]) objArr138[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr139)).intValue();
                                                                            return objArr138;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            j4 = j36;
                                                        }
                                                    } catch (java.io.IOException unused9) {
                                                    } catch (java.lang.Throwable th6) {
                                                        th2 = th6;
                                                        bufferedInputStream3 = bufferedInputStream4;
                                                        if (bufferedInputStream3 == null) {
                                                            throw th2;
                                                        }
                                                        try {
                                                            bufferedInputStream3.close();
                                                            throw th2;
                                                        } catch (java.lang.Exception unused10) {
                                                            throw th2;
                                                        }
                                                    }
                                                    try {
                                                        bufferedInputStream4.close();
                                                        break;
                                                    } catch (java.lang.Exception unused11) {
                                                    }
                                                }
                                                java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(724989957);
                                                if (obj34 == null) {
                                                    java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 31, 1889 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 3600));
                                                    java.lang.Object[] objArr141 = new java.lang.Object[1];
                                                    a(653, (byte) ($$a[14] + 1), r8[16], objArr141);
                                                    obj34 = cls32.getMethod((java.lang.String) objArr141[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(724989957, obj34);
                                                }
                                                long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj34).invoke(null, null)).longValue();
                                                long j37 = ~longValue14;
                                                long j38 = ~((-1775173295) | longValue14);
                                                int i23 = i6;
                                                long j39 = ((((((-721) * longValue14) + 1279899945695L) + (((j | (~(j37 | 1775173294))) | j38) * 1444)) + ((((~((-1775173295) | j6)) | j38) | (~(longValue14 | j6))) * (-1444))) + (((~(1775173294 | longValue14)) | (~((-1775173295) | j37))) * 722)) - 104075085;
                                                int i24 = (int) (j39 >> 32);
                                                if (((((int) j39) & ((((67244449 | r4) * (-712)) - 1188783139) + (((~(1731198463 | i)) | (~((-67244450) | i8))) * (-712)) + (((~(1663954014 | i8)) | (-1193786872)) * 712))) | (((((~(356410415 | i8)) | 1793636826) * (-235)) + 480875478 + (((~(356410415 | i)) | 1793636826) * (-470)) + (((~(2147417599 | i)) | 2629642) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE)) & i24)) != 0) {
                                                    java.lang.Object[] objArr142 = {new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i23}, null, new int[1]};
                                                    java.lang.Object[] objArr143 = {615890328, 16, java.lang.Integer.valueOf((((~((-153627469) | i8)) | 134226240 | (~((-843551761) | i))) * 717) + 1240423907 + (((~(i | (-153627469))) | (~((-843551761) | i8)) | 134226240) * 717))};
                                                    java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj35 == null) {
                                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 50, android.os.Process.getGidForName(str) + 2714, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                                        short s10 = (short) ($$a[14] + 1);
                                                        byte b10 = (byte) s10;
                                                        java.lang.Object[] objArr144 = new java.lang.Object[1];
                                                        a(s10, b10, b10, objArr144);
                                                        obj35 = cls33.getMethod((java.lang.String) objArr144[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj35);
                                                    }
                                                    ((int[]) objArr142[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj35).invoke(null, objArr143)).intValue();
                                                    return objArr142;
                                                }
                                                java.lang.Object[] objArr145 = {2};
                                                java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                                if (obj36 == null) {
                                                    java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 26, 2364 - android.text.TextUtils.indexOf(str, str, 0, 0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1));
                                                    java.lang.Object[] objArr146 = new java.lang.Object[1];
                                                    a(653, (byte) ($$a[14] + 1), r8[16], objArr146);
                                                    obj36 = cls34.getMethod((java.lang.String) objArr146[0], java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj36);
                                                }
                                                long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj36).invoke(null, objArr145)).longValue();
                                                long j40 = ~longValue15;
                                                long j41 = (-632522851) | j40;
                                                long j42 = (((-167) * longValue15) - 105631315950L) + (((~j41) | (~(j40 | j))) * 168) + ((~(j41 | j6)) * 168) + (((~(j | (-632522851))) | (~(longValue15 | (-632522851))) | (~(632522850 | j40 | j6))) * 168) + 775387349;
                                                if (((((int) j42) & ((((((~((-2057860553) | i)) | (~(799880333 | i8))) | r4) * (-516)) - 859495103) + (((~((-715666569) | i)) | (~((-84213766) | i8))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + (((~(2057860552 | i8)) | 84213765) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))) | (((int) (j42 >> 32)) & (((~((-9507841) | i8)) * 433) + 1759890874 + (((~(753999522 | i)) | 2103741362) * (-433)) + (((~(2103741362 | i)) | 744491682) * 433)))) == 2) {
                                                    java.lang.Object[] objArr147 = {new int[]{i}, new int[]{i ^ 270}, null, new int[1]};
                                                    java.lang.Object[] objArr148 = {615890328, 16, java.lang.Integer.valueOf((((((~((-985995975) | i)) | 272958150) | (~((-276670455) | i))) * (-754)) - 722926727) + (((~(i | (-272958151))) | (~((-3712305) | i8))) * (-754)) + (((-985995975) | i8) * 754))};
                                                    java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj37 == null) {
                                                        java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2, android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) android.text.TextUtils.indexOf(str, str));
                                                        short s11 = (short) ($$a[14] + 1);
                                                        byte b11 = (byte) s11;
                                                        java.lang.Object[] objArr149 = new java.lang.Object[1];
                                                        a(s11, b11, b11, objArr149);
                                                        obj37 = cls35.getMethod((java.lang.String) objArr149[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                                                    }
                                                    ((int[]) objArr147[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr148)).intValue();
                                                    return objArr147;
                                                }
                                                java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1411285061);
                                                if (obj38 == null) {
                                                    java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 41, 3197 - android.text.TextUtils.getTrimmedLength(str), (char) android.graphics.Color.red(0));
                                                    byte[] bArr2 = $$a;
                                                    java.lang.Object[] objArr150 = new java.lang.Object[1];
                                                    a(41, (byte) (-bArr2[14]), (byte) (-bArr2[21]), objArr150);
                                                    obj38 = cls36.getMethod((java.lang.String) objArr150[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1411285061, obj38);
                                                }
                                                long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj38).invoke(null, null)).longValue();
                                                long j43 = (((-215) * longValue16) - 233854927726L) + ((~((-1077672478) | j6)) * 216) + (((-1077672478) | (~longValue16) | j) * (-216)) + ((longValue16 | (~(j | (-1077672478)))) * 216) + 1173917839;
                                                if (((((int) (j43 >> 32)) & ((((((~(156020925 | i8)) | (~((-1593247337) | i))) | (~(1593247336 | i8))) * 959) - 1928990807) + (((~(156020925 | i)) | (~((-1593247337) | i8)) | (~(1593247336 | i))) * 959))) | (((int) j43) & ((((~((-95182917) | i8)) * 52) - 1842647799) + (((~((-95248486) | i8)) | (~(1341977924 | i8)) | 65569) * (-52)) + (((~(95248485 | i8)) | 1246795008) * 52)))) != 0) {
                                                    java.lang.Object[] objArr151 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, null, new int[1]};
                                                    java.lang.Object[] objArr152 = {615890328, 16, java.lang.Integer.valueOf(((((~((-237021571) | i8)) | (~(505866703 | i))) * (-831)) - 1536803110) + ((~((-33562755) | i)) * (-1662)) + (((~(i | 472303949)) | (~((-472303950) | i8)) | (~(237021570 | i))) * 831))};
                                                    java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj39 == null) {
                                                        java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str, str), android.view.View.resolveSize(0, 0) + 2713, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                                        short s12 = (short) ($$a[14] + 1);
                                                        byte b12 = (byte) s12;
                                                        java.lang.Object[] objArr153 = new java.lang.Object[1];
                                                        a(s12, b12, b12, objArr153);
                                                        obj39 = cls37.getMethod((java.lang.String) objArr153[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj39);
                                                    }
                                                    ((int[]) objArr151[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr152)).intValue();
                                                    return objArr151;
                                                }
                                                java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(502613909);
                                                if (obj40 == null) {
                                                    java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 3196 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.graphics.Color.green(0));
                                                    java.lang.Object[] objArr154 = new java.lang.Object[1];
                                                    a(653, (byte) ($$a[14] + 1), r7[16], objArr154);
                                                    obj40 = cls38.getMethod((java.lang.String) objArr154[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(502613909, obj40);
                                                }
                                                long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj40).invoke(null, null)).longValue();
                                                long j44 = ~longValue17;
                                                long j45 = (-923558345) | j44;
                                                long j46 = j44 | j;
                                                long j47 = (193 * longValue17) + 178246760392L + ((j | (~(longValue17 | (-923558345)))) * (-192)) + (((~j45) | (~j46)) * (-384)) + (((~(j45 | j6)) | (~(j46 | 923558344)) | (~(longValue17 | 923558344 | j6))) * 192) + 29311546;
                                                int i25 = ~((-339808265) | i);
                                                if (((((int) j47) & ((((~((-1804496424) | i8)) | 1091060225 | i25) * (-713)) + 1629477078 + (i25 * 1426) + ((~((-1053244463) | i8)) * 713))) | (((int) (j47 >> 32)) & ((((((~(195943484 | i)) | 1615864259) * 1504) - 1320242614) + ((~(1811807743 | i)) * (-1504))) - 845854272))) != 0) {
                                                    java.lang.Object[] objArr155 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, null, new int[1]};
                                                    java.lang.Object[] objArr156 = {615890328, 16, java.lang.Integer.valueOf(((((~(i | 84641443)) | ((~((-84640801) | i8)) | (-624684720))) * (-68)) - 1222481101) + ((~((-540043277) | i8)) * (-68)) + (((~((-84641444) | i8)) | (-624684077)) * 68))};
                                                    java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj41 == null) {
                                                        java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                        short s13 = (short) ($$a[14] + 1);
                                                        byte b13 = (byte) s13;
                                                        java.lang.Object[] objArr157 = new java.lang.Object[1];
                                                        a(s13, b13, b13, objArr157);
                                                        obj41 = cls39.getMethod((java.lang.String) objArr157[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj41);
                                                    }
                                                    ((int[]) objArr155[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj41).invoke(null, objArr156)).intValue();
                                                    return objArr155;
                                                }
                                                java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1293945309);
                                                if (obj42 == null) {
                                                    java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.graphics.ImageFormat.getBitsPerPixel(0) + 2837, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                    java.lang.Object[] objArr158 = new java.lang.Object[1];
                                                    a(653, (byte) ($$a[14] + 1), r7[16], objArr158);
                                                    obj42 = cls40.getMethod((java.lang.String) objArr158[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1293945309, obj42);
                                                }
                                                long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj42).invoke(null, null)).longValue();
                                                long j48 = ~longValue18;
                                                long j49 = (-611695757) | j48;
                                                long j50 = ((((((-622) * longValue18) - 381698152368L) + ((~(j49 | j6)) * 623)) + ((j | (~(611695756 | longValue18))) * (-623))) + ((((~j49) | (~(j48 | j6))) | (~((-611695757) | j6))) * 623)) - 194598998;
                                                if (((((int) (j50 >> 32)) & (((((~(1972704578 | i8)) | (~((-880809219) | i))) * (-831)) - 471975462) + ((~((-4227089) | i)) * (-1662)) + (((~(885036306 | i8)) | (~((-885036307) | i)) | (~((-1972704579) | i))) * 831))) | (((int) j50) & (((((~(331459816 | i8)) | (~(1105766593 | i))) * 1900) - 1871736089) + (((~((-1105766594) | i8)) | (~((-331459817) | i))) * (-950)) + (((~((-1105766594) | i)) | (~((-331459817) | i8))) * 950)))) != 0) {
                                                    java.lang.Object[] objArr159 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                    java.lang.Object[] objArr160 = {615890328, 16, java.lang.Integer.valueOf((((~(i | 264935756)) | (-903386449)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 825551931 + (((~(264935756 | i8)) | (-903386449)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))};
                                                    java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj43 == null) {
                                                        java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2714 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) android.graphics.Color.green(0));
                                                        short s14 = (short) ($$a[14] + 1);
                                                        byte b14 = (byte) s14;
                                                        java.lang.Object[] objArr161 = new java.lang.Object[1];
                                                        a(s14, b14, b14, objArr161);
                                                        obj43 = cls41.getMethod((java.lang.String) objArr161[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj43);
                                                    }
                                                    ((int[]) objArr159[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj43).invoke(null, objArr160)).intValue();
                                                    return objArr159;
                                                }
                                                long[] jArr3 = {624887784092251L};
                                                java.lang.Object[] objArr162 = new java.lang.Object[1];
                                                b(1472191985 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 795057830 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (-105) - android.text.TextUtils.getOffsetBefore(str, 0), (byte) (13 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), (short) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr162);
                                                java.lang.Object[] objArr163 = {((java.lang.String) objArr162[0]).intern(), 3, 2251799813685247L, jArr3};
                                                java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                if (obj44 == null) {
                                                    java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - android.view.View.resolveSizeAndState(0, 0, 0), 3096 - android.view.View.resolveSize(0, 0), (char) android.text.TextUtils.getOffsetAfter(str, 0));
                                                    java.lang.Object[] objArr164 = new java.lang.Object[1];
                                                    a(653, (byte) ($$a[14] + 1), r8[16], objArr164);
                                                    obj44 = cls42.getMethod((java.lang.String) objArr164[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj44);
                                                }
                                                long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) obj44).invoke(null, objArr163)).longValue();
                                                long j51 = ~longValue19;
                                                long j52 = (-39512838) | j6;
                                                long j53 = (((((longValue19 * (-667)) + 52749638730L) + (((~j52) | j51) * (-668))) + (((~(j51 | j6)) | (-39512838)) * 1336)) + ((j51 | j52) * 668)) - 1871135072;
                                                if (((((int) (j53 >> 32)) & ((((~((-1720220352) | i8)) | (-282993941)) * (-602)) + 968848603 + (((~((-1720220352) | i)) | 1711299243 | (~((-274072833) | i8))) * (-301)) + ((~((-282993941) | i8)) * 301))) | (((int) j53) & ((((~(365047837 | i8)) | 1072178572) * (-933)) + 1185753056 + (((~(1072178572 | i8)) | 135185) * 933) + 1161087932))) != 0) {
                                                    java.lang.Object[] objArr165 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, null, new int[1]};
                                                    int i26 = ~(i | 358815184);
                                                    java.lang.Object[] objArr166 = {615890328, 16, java.lang.Integer.valueOf((((25643311 | i26) * (-658)) - 1006631729) + ((i26 | 8669231) * 658))};
                                                    java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj45 == null) {
                                                        java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2713, (char) android.text.TextUtils.indexOf(str, str, 0, 0));
                                                        short s15 = (short) ($$a[14] + 1);
                                                        byte b15 = (byte) s15;
                                                        java.lang.Object[] objArr167 = new java.lang.Object[1];
                                                        a(s15, b15, b15, objArr167);
                                                        obj45 = cls43.getMethod((java.lang.String) objArr167[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj45);
                                                    }
                                                    ((int[]) objArr165[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj45).invoke(null, objArr166)).intValue();
                                                    return objArr165;
                                                }
                                                java.lang.Object[] objArr168 = new java.lang.Object[1];
                                                b(android.graphics.Color.red(0) + 1472191985, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 795057868, android.view.Gravity.getAbsoluteGravity(0, 0) - 105, (byte) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) - 70), (short) (android.graphics.Color.red(0) + 8), objArr168);
                                                java.lang.Object[] objArr169 = {((java.lang.String) objArr168[0]).intern()};
                                                java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                if (obj46 == null) {
                                                    java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36, 3162 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (33099 - (android.os.Process.myPid() >> 22)));
                                                    byte[] bArr3 = $$a;
                                                    java.lang.Object[] objArr170 = new java.lang.Object[1];
                                                    a(41, (byte) (-bArr3[14]), (byte) (-bArr3[21]), objArr170);
                                                    obj46 = cls44.getMethod((java.lang.String) objArr170[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj46);
                                                }
                                                long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) obj46).invoke(null, objArr169)).longValue();
                                                long j54 = ~longValue20;
                                                long j55 = ~((-239704299) | longValue20);
                                                long j56 = ((-721) * longValue20) + 172826799579L + ((j | (~(j54 | 239704298)) | j55) * 1444) + (((~((-239704299) | j6)) | j55 | (~(longValue20 | j6))) * (-1444)) + (((~(239704298 | longValue20)) | (~((-239704299) | j54))) * 722) + 1235139202;
                                                if (((((int) j56) & (((((~(1282267522 | i)) | (-1300102568)) * 336) - 501357939) + (((~((-154958888) | i)) | 137123842) * (-168)) + (((~((-154958888) | i8)) | 1282267522) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))) | (((int) (j56 >> 32)) & (((((~((-113923598) | i8)) | (-1323302814)) * (-591)) - 341319110) + (((-113923598) | i) * 591)))) != 0) {
                                                    java.lang.Object[] objArr171 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                    java.lang.Object[] objArr172 = {615890328, 16, java.lang.Integer.valueOf((((638374823 | i) * 140) - 598802937) + (((~(638374823 | i8)) | 3279880) * (-280)) + (((~(i | (-3279881))) | (~(70950696 | i8)) | 570704007) * 140))};
                                                    java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj47 == null) {
                                                        java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 50, 2713 - android.view.KeyEvent.keyCodeFromString(str), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                        short s16 = (short) ($$a[14] + 1);
                                                        byte b16 = (byte) s16;
                                                        java.lang.Object[] objArr173 = new java.lang.Object[1];
                                                        a(s16, b16, b16, objArr173);
                                                        obj47 = cls45.getMethod((java.lang.String) objArr173[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj47);
                                                    }
                                                    ((int[]) objArr171[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj47).invoke(null, objArr172)).intValue();
                                                    return objArr171;
                                                }
                                                java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                                                if (obj48 == null) {
                                                    java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 28, android.text.TextUtils.indexOf(str, str, 0) + 2185, (char) (59513 - android.text.TextUtils.getCapsMode(str, 0, 0)));
                                                    java.lang.Object[] objArr174 = new java.lang.Object[1];
                                                    a(653, (byte) ($$a[14] + 1), r7[16], objArr174);
                                                    obj48 = cls46.getMethod((java.lang.String) objArr174[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj48);
                                                }
                                                long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) obj48).invoke(null, null)).longValue();
                                                long j57 = ~((~longValue21) | 104547066);
                                                long j58 = ~(104547066 | j6);
                                                long j59 = ((((((-657) * longValue21) + 68896516494L) + ((((~(longValue21 | (-104547067))) | j57) | j58) * (-658))) + (658 * j57)) + ((j57 | j58) * 658)) - 976637652;
                                                if (((((int) (j59 >> 32)) & ((((~((-1884964756) | i8)) | 269107584 | (~((-447738345) | i8))) * (-397)) + 345892726 + (((-1794487932) | i) * 397))) | (((int) j59) & ((((952523003 | r8) * 764) - 1305913147) + (((~(952523003 | i8)) | 1091109120) * (-1528)) + (((~(1905217882 | i8)) | 1229523361) * 764)))) != 0) {
                                                    java.lang.Object[] objArr175 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                    java.lang.Object[] objArr176 = {615890328, 16, java.lang.Integer.valueOf((((~(i | (-133763587))) | (-575561934)) * (-964)) + 17480351 + (((~((-133763587) | i8)) | 95490562) * (-964)))};
                                                    java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj49 == null) {
                                                        java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 50, 2713 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                                        short s17 = (short) ($$a[14] + 1);
                                                        byte b17 = (byte) s17;
                                                        java.lang.Object[] objArr177 = new java.lang.Object[1];
                                                        a(s17, b17, b17, objArr177);
                                                        obj49 = cls47.getMethod((java.lang.String) objArr177[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj49);
                                                    }
                                                    ((int[]) objArr175[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj49).invoke(null, objArr176)).intValue();
                                                    return objArr175;
                                                }
                                                java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1050293330);
                                                if (obj50 == null) {
                                                    java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 36, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2971, (char) (android.view.MotionEvent.axisFromString(str) + 1));
                                                    java.lang.Object[] objArr178 = new java.lang.Object[1];
                                                    a(653, (byte) ($$a[14] + 1), r7[16], objArr178);
                                                    obj50 = cls48.getMethod((java.lang.String) objArr178[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1050293330, obj50);
                                                }
                                                long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) obj50).invoke(null, null)).longValue();
                                                long j60 = ~longValue22;
                                                long j61 = (((((319 * longValue22) + 177260449276L) + (((~((j60 | 559181227) | j6)) | (~((j | (-559181228)) | longValue22))) * (-318))) + (((~((-559181228) | j60)) | (~((-559181228) | j6))) * (-318))) + (((~(559181227 | j6)) | j60) * 318)) - 1293520536;
                                                if (((((int) (j61 >> 32)) & (((((~((-1722134724) | i8)) | 284908312) * (-865)) - 1932302330) + ((~(1722134723 | i)) * 865) + (((~(1722134723 | i8)) | (~(284908312 | i8))) * 865))) | (((int) j61) & ((((~(312912387 | i8)) | (-1124314023)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + 1453938690 + (((~((-1090584997) | i8)) | (~((-33729027) | i))) * (-519)) + (((~((-1124314023) | i)) | (-312912388)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE)))) != 0) {
                                                    java.lang.Object[] objArr179 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                    java.lang.Object[] objArr180 = {615890328, 16, java.lang.Integer.valueOf((((~(i | 648829066)) | 60496453) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 1411705097 + (((~(648829066 | i8)) | 18022981) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))};
                                                    java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj51 == null) {
                                                        java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getOffsetAfter(str, 0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2713, (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                                                        short s18 = (short) ($$a[14] + 1);
                                                        byte b18 = (byte) s18;
                                                        java.lang.Object[] objArr181 = new java.lang.Object[1];
                                                        a(s18, b18, b18, objArr181);
                                                        obj51 = cls49.getMethod((java.lang.String) objArr181[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj51);
                                                    }
                                                    ((int[]) objArr179[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj51).invoke(null, objArr180)).intValue();
                                                    return objArr179;
                                                }
                                                java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1827153043);
                                                if (obj52 == null) {
                                                    java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.view.KeyEvent.getDeadChar(0, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2159, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 56400));
                                                    java.lang.Object[] objArr182 = new java.lang.Object[1];
                                                    a(653, (byte) ($$a[14] + 1), r7[16], objArr182);
                                                    obj52 = cls50.getMethod((java.lang.String) objArr182[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1827153043, obj52);
                                                }
                                                long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) obj52).invoke(null, null)).longValue();
                                                long j62 = ~((~longValue23) | 677443289);
                                                long j63 = ((((((-107) * longValue23) + 37259380895L) + (((~(longValue23 | (-677443290))) | (~(j | longValue23))) * (-108))) + ((((~((-677443290) | j6)) | j62) | (~(j | 677443289))) * 54)) + ((j6 | j62) * 54)) - 1243261309;
                                                if (((((int) (j63 >> 32)) & ((((~((-317926637) | i)) | 1346634834) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 1192615370 + (((~((-317926637) | i8)) | 1346634834) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) | (((int) j63) & ((((((~((-94213495) | i8)) | 77075542) | r7) * (-502)) - 1400009991) + (((~((-1514301953) | i)) | (~((-17137953) | i8))) * 502)))) != 0) {
                                                    java.lang.Object[] objArr183 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                    java.lang.Object[] objArr184 = {615890328, 16, java.lang.Integer.valueOf(((((~((-372929278) | i8)) | 336396242) * (-90)) - 1730764494) + (((~((-372929278) | i)) | (-373227520)) * (-45)) + (((~(i | (-336396243))) | (-372929278) | (~(336396242 | i8))) * 45))};
                                                    java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj53 == null) {
                                                        java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2712, (char) android.view.View.getDefaultSize(0, 0));
                                                        short s19 = (short) ($$a[14] + 1);
                                                        byte b19 = (byte) s19;
                                                        java.lang.Object[] objArr185 = new java.lang.Object[1];
                                                        a(s19, b19, b19, objArr185);
                                                        obj53 = cls51.getMethod((java.lang.String) objArr185[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj53);
                                                    }
                                                    ((int[]) objArr183[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj53).invoke(null, objArr184)).intValue();
                                                    return objArr183;
                                                }
                                                java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(887063382);
                                                if (obj54 == null) {
                                                    java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 838, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                    java.lang.Object[] objArr186 = new java.lang.Object[1];
                                                    a(653, (byte) ($$a[14] + 1), r7[16], objArr186);
                                                    obj54 = cls52.getMethod((java.lang.String) objArr186[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(887063382, obj54);
                                                }
                                                long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) obj54).invoke(null, null)).longValue();
                                                long j64 = ~longValue24;
                                                long j65 = ((-163) * longValue24) + 321567795120L + (((~(j | longValue24)) | 1948895728) * (-328)) + ((1948895728 | j6) * 164) + (((~((-1948895729) | j64)) | (~(j6 | j64)) | (~(j | 1948895728 | longValue24))) * 164) + 11857174;
                                                int i27 = ((((int) (j65 >> 32)) & (((((230818877 | i) * (-859)) + 925193626) + (((~(230818877 | i8)) | (~((-96469038) | i))) * 859)) + (((~((-1206407534) | i8)) | 1109938496) * 859))) | (((int) j65) & ((((((~((-621677198) | i)) | 815549212) * (-668)) + (-479150319)) + (((~(815549212 | i)) | (-621677198)) * 1336)) + (((-84017282) | i) * 668)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : i;
                                                if (i27 != i) {
                                                    getCvmResetTimeout = (getApplicationLifeCycleData + 71) % 128;
                                                    java.lang.Object[] objArr187 = {new int[]{i}, new int[]{i27}, null, new int[1]};
                                                    java.lang.Object[] objArr188 = {615890328, 16, java.lang.Integer.valueOf((((~((-218629217) | i)) | (~(490696303 | i8))) * (-318)) + 258062629 + (((~(490434157 | i)) | 262146) * (-318)) + (((~(i | (-490434158))) | (-218891363)) * 318))};
                                                    java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj55 == null) {
                                                        java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 2713 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.os.Process.getGidForName(str) + 1));
                                                        short s20 = (short) ($$a[14] + 1);
                                                        byte b20 = (byte) s20;
                                                        java.lang.Object[] objArr189 = new java.lang.Object[1];
                                                        a(s20, b20, b20, objArr189);
                                                        obj55 = cls53.getMethod((java.lang.String) objArr189[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj55);
                                                    }
                                                    ((int[]) objArr187[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj55).invoke(null, objArr188)).intValue();
                                                    java.lang.Object[] objArr190 = {objArr187};
                                                    java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(712501173);
                                                    if (obj56 == null) {
                                                        java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.text.TextUtils.indexOf(str, str, 0, 0), 3236 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                        short s21 = (short) ($$a[14] + 1);
                                                        byte b21 = (byte) s21;
                                                        java.lang.Object[] objArr191 = new java.lang.Object[1];
                                                        a(s21, b21, b21, objArr191);
                                                        obj56 = cls54.getMethod((java.lang.String) objArr191[0], java.lang.Object[].class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(712501173, obj56);
                                                    }
                                                    ((java.lang.reflect.Method) obj56).invoke(obj, objArr190);
                                                    return objArr187;
                                                }
                                                java.lang.Object[] objArr192 = {java.lang.Integer.valueOf(i), obj, 615890328, 0};
                                                java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(97317038);
                                                if (obj57 == null) {
                                                    obj57 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 3289, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getDeclaredConstructor(java.lang.Integer.TYPE, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.text.TextUtils.indexOf(str, str, 0), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3238, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(97317038, obj57);
                                                }
                                                java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj57).newInstance(objArr192);
                                                getCvmResetTimeout = (getApplicationLifeCycleData + 45) % 128;
                                                try {
                                                    java.lang.Object[] objArr193 = new java.lang.Object[1];
                                                    b(1472192044 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 795057881, (-105) - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (byte) (3 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), (short) (67 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), objArr193);
                                                    java.lang.Class<?> cls55 = java.lang.Class.forName(((java.lang.String) objArr193[0]).intern());
                                                    java.lang.Object[] objArr194 = new java.lang.Object[1];
                                                    b(android.view.View.MeasureSpec.getMode(0) + 1472192053, 795057895 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 105, (byte) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 38), (short) ((-67) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr194);
                                                    cls55.getMethod(((java.lang.String) objArr194[0]).intern(), null).invoke(newInstance, null);
                                                    java.lang.Object[] objArr195 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                                    java.lang.Object[] objArr196 = {615890328, 0, java.lang.Integer.valueOf((((((~((-1047309900) | i)) | 709395456) * 1504) - 127520065) + ((~(i | (-337914444))) * (-1504))) - 942030832)};
                                                    java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj58 == null) {
                                                        java.lang.Class cls56 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 2713 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.graphics.Color.alpha(0));
                                                        short s22 = (short) ($$a[14] + 1);
                                                        byte b22 = (byte) s22;
                                                        java.lang.Object[] objArr197 = new java.lang.Object[1];
                                                        a(s22, b22, b22, objArr197);
                                                        obj58 = cls56.getMethod((java.lang.String) objArr197[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj58);
                                                    }
                                                    ((int[]) objArr195[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj58).invoke(null, objArr196)).intValue();
                                                    return objArr195;
                                                } catch (java.lang.Throwable th7) {
                                                    java.lang.Throwable cause = th7.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th7;
                                                }
                                            }
                                            java.lang.Object[] objArr198 = {((java.lang.String) objArr2[0]).intern()};
                                            java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj59 == null) {
                                                java.lang.Class cls57 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 39, 1921 - android.text.TextUtils.indexOf(str, str, 0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                java.lang.Object[] objArr199 = new java.lang.Object[1];
                                                a(653, (byte) ($$a[14] + 1), r8[16], objArr199);
                                                obj59 = cls57.getMethod((java.lang.String) objArr199[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj59);
                                            }
                                            java.lang.Object invoke7 = ((java.lang.reflect.Method) obj59).invoke(null, objArr198);
                                            if (invoke7 != null) {
                                                java.lang.Object[] objArr200 = new java.lang.Object[1];
                                                c("軁Ⴉ눃喐\uf766零㡎", android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 40560, objArr200);
                                                if (invoke7.equals(((java.lang.String) objArr200[0]).intern())) {
                                                    java.lang.Object[] objArr201 = new java.lang.Object[1];
                                                    c("軃毡䒯Ⅵᨆ\uf4d3톍쨜ꝸ耥竦埀さⴗߞ\ue0fe\udd9c뙵錎跅暚䍃㱺", 58679 - android.view.View.resolveSize(0, 0), objArr201);
                                                    try {
                                                        java.lang.Object[] objArr202 = {((java.lang.String) objArr201[0]).intern()};
                                                        java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                        if (obj60 == null) {
                                                            java.lang.Class cls58 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 40, android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1922, (char) android.view.View.MeasureSpec.getMode(0));
                                                            java.lang.Object[] objArr203 = new java.lang.Object[1];
                                                            a(653, (byte) ($$a[14] + 1), r8[16], objArr203);
                                                            obj60 = cls58.getMethod((java.lang.String) objArr203[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj60);
                                                        }
                                                        java.lang.String str4 = (java.lang.String) ((java.lang.reflect.Method) obj60).invoke(null, objArr202);
                                                        if (str4 != null) {
                                                            int i28 = getCvmResetTimeout + 103;
                                                            getApplicationLifeCycleData = i28 % 128;
                                                            if (i28 % 2 != 0) {
                                                                java.lang.Integer.parseInt(str4);
                                                                throw new java.lang.NullPointerException();
                                                            }
                                                            int parseInt = java.lang.Integer.parseInt(str4);
                                                            if (parseInt != 0) {
                                                                i4 = parseInt + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                                                if (i4 != 0) {
                                                                }
                                                            }
                                                        }
                                                    } catch (java.lang.Throwable th8) {
                                                        java.lang.Throwable cause2 = th8.getCause();
                                                        if (cause2 != null) {
                                                            throw cause2;
                                                        }
                                                        throw th8;
                                                    }
                                                }
                                            }
                                            i4 = 0;
                                            if (i4 != 0) {
                                            }
                                        } catch (java.lang.Throwable th9) {
                                            java.lang.Throwable cause3 = th9.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th9;
                                        }
                                        objArr2 = new java.lang.Object[1];
                                        b(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1472192043, 795057744 - android.view.KeyEvent.keyCodeFromString(str), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 105, (byte) ((-99) - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), (short) ((-111) - android.text.TextUtils.getCapsMode(str, 0, 0)), objArr2);
                                    } catch (java.lang.Throwable th10) {
                                        java.lang.Throwable cause4 = th10.getCause();
                                        if (cause4 != null) {
                                            throw cause4;
                                        }
                                        throw th10;
                                    }
                                } else {
                                    java.lang.Object[] objArr204 = new java.lang.Object[1];
                                    b(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1472192053, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 795057507, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 106, (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 54), (short) ((android.view.ViewConfiguration.getTouchSlop() >> 8) - 18), objArr204);
                                    java.lang.Object[] objArr205 = {((java.lang.String) objArr204[0]).intern()};
                                    java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj61 == null) {
                                        java.lang.Class cls59 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 40, android.view.Gravity.getAbsoluteGravity(0, 0) + 1921, (char) android.text.TextUtils.getOffsetBefore(str, 0));
                                        java.lang.Object[] objArr206 = new java.lang.Object[1];
                                        a(653, (byte) ($$a[14] + 1), r8[16], objArr206);
                                        obj61 = cls59.getMethod((java.lang.String) objArr206[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj61);
                                    }
                                    java.lang.Object invoke8 = ((java.lang.reflect.Method) obj61).invoke(null, objArr205);
                                    java.lang.Object[] objArr207 = new java.lang.Object[1];
                                    b(1472191988 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 795057520, android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 104, (byte) ((-80) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (short) (android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 106), objArr207);
                                    c = 0;
                                    if (invoke8.equals(((java.lang.String) objArr207[0]).intern())) {
                                        i7 = 1;
                                        int[] iArr3 = new int[i7];
                                        int[] iArr22 = new int[i7];
                                        iArr3[c] = i;
                                        iArr22[c] = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                        java.lang.Object[] objArr272 = {iArr3, iArr22, null, new int[i7]};
                                        java.lang.Object[] objArr282 = {615890328, 16, java.lang.Integer.valueOf((((((~(i | (-502858845))) | 206046288) | (~(503279231 | i8))) * 886) - 1655250837) + (((~(502858844 | i8)) | 206466675) * (-1772)) + ((~(206466675 | i8)) * 886))};
                                        obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj8 == null) {
                                        }
                                        ((int[]) objArr272[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr282)).intValue();
                                        return objArr272;
                                    }
                                    java.lang.Object[] objArr302 = new java.lang.Object[1];
                                    c("軒愌內䅽ㆴ↑ᇨ=", 61403 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr302);
                                    java.lang.String intern210 = ((java.lang.String) objArr302[0]).intern();
                                    java.lang.Object[] objArr312 = new java.lang.Object[1];
                                    b(android.graphics.Color.blue(0) + 1472192035, android.graphics.Color.green(0) + 795057521, android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 104, (byte) ((-64) - android.widget.ExpandableListView.getPackedPositionChild(0L)), (short) (46 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr312);
                                    java.lang.String intern310 = ((java.lang.String) objArr312[0]).intern();
                                    java.lang.Object[] objArr322 = new java.lang.Object[1];
                                    b(1472192037 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.widget.ExpandableListView.getPackedPositionType(0L) + 795057527, (-105) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (android.graphics.Color.blue(0) + 115), (short) (android.view.KeyEvent.normalizeMetaState(0) + 53), objArr322);
                                    java.lang.String intern47 = ((java.lang.String) objArr322[0]).intern();
                                    java.lang.Object[] objArr332 = new java.lang.Object[1];
                                    b((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1472192040, 795057535 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-106) - android.view.MotionEvent.axisFromString(str), (byte) (android.view.KeyEvent.keyCodeFromString(str) - 43), (short) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 27), objArr332);
                                    java.lang.String intern52 = ((java.lang.String) objArr332[0]).intern();
                                    java.lang.Object[] objArr342 = new java.lang.Object[1];
                                    b(1472192043 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 795057543 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.indexOf(str, str) - 105, (byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 'F'), (short) (6 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), objArr342);
                                    java.lang.String intern62 = ((java.lang.String) objArr342[0]).intern();
                                    java.lang.Object[] objArr352 = new java.lang.Object[1];
                                    b(1472192043 - android.view.View.getDefaultSize(0, 0), android.text.TextUtils.indexOf(str, str, 0, 0) + 795057549, (-104) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 18), (short) (117 - android.text.TextUtils.getOffsetBefore(str, 0)), objArr352);
                                    java.lang.String intern72 = ((java.lang.String) objArr352[0]).intern();
                                    java.lang.Object[] objArr362 = new java.lang.Object[1];
                                    b(android.view.Gravity.getAbsoluteGravity(0, 0) + 1472192043, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 795057561, android.view.View.MeasureSpec.getMode(0) - 105, (byte) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 67), (short) (android.view.View.MeasureSpec.getMode(0) + 44), objArr362);
                                    java.lang.String intern82 = ((java.lang.String) objArr362[0]).intern();
                                    java.lang.Object[] objArr372 = new java.lang.Object[1];
                                    b(1472192043 - android.graphics.Color.alpha(0), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 795057567, (-105) - android.view.KeyEvent.keyCodeFromString(str), (byte) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE), (short) (104 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr372);
                                    java.lang.String intern92 = ((java.lang.String) objArr372[0]).intern();
                                    java.lang.Object[] objArr382 = new java.lang.Object[1];
                                    c("軚ꯗ", 9491 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr382);
                                    java.lang.String intern102 = ((java.lang.String) objArr382[0]).intern();
                                    java.lang.Object[] objArr392 = new java.lang.Object[1];
                                    b((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1472192046, 795057573 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (-105) - android.graphics.Color.red(0), (byte) (120 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (short) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 126), objArr392);
                                    java.lang.String intern112 = ((java.lang.String) objArr392[0]).intern();
                                    java.lang.Object[] objArr402 = new java.lang.Object[1];
                                    c("軟愇兢䅖ㆾ↓ᇵ`\uf019\ue063", 61403 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr402);
                                    java.lang.String intern122 = ((java.lang.String) objArr402[0]).intern();
                                    java.lang.Object[] objArr412 = new java.lang.Object[1];
                                    b((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1472192050, 778280373 - android.graphics.Color.rgb(0, 0, 0), (-105) - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 117), (short) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 100), objArr412);
                                    java.lang.String intern132 = ((java.lang.String) objArr412[0]).intern();
                                    java.lang.Object[] objArr422 = new java.lang.Object[1];
                                    b((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1472192049, android.view.View.combineMeasuredStates(0, 0) + 795057597, (-104) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 14), (short) ((-115) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr422);
                                    java.lang.String intern142 = ((java.lang.String) objArr422[0]).intern();
                                    java.lang.Object[] objArr432 = new java.lang.Object[1];
                                    b(android.view.KeyEvent.getDeadChar(0, 0) + 1472192050, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 795057609, android.graphics.Color.green(0) - 105, (byte) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 115), (short) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 125), objArr432);
                                    java.lang.String intern152 = ((java.lang.String) objArr432[0]).intern();
                                    java.lang.Object[] objArr442 = new java.lang.Object[1];
                                    c("軁㓛醙ꃻ曲Ⲝ튉", 47629 - android.text.TextUtils.indexOf(str, str, 0), objArr442);
                                    java.lang.String intern162 = ((java.lang.String) objArr442[0]).intern();
                                    java.lang.Object[] objArr452 = new java.lang.Object[1];
                                    b(1472192053 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 795057623 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 105, (byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 46), (short) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) - 24), objArr452);
                                    java.lang.String intern172 = ((java.lang.String) objArr452[0]).intern();
                                    java.lang.Object[] objArr462 = new java.lang.Object[1];
                                    b(1472192052 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.indexOf(str, str, 0) + 795057630, (-105) - android.view.View.combineMeasuredStates(0, 0), (byte) (127 - (android.os.Process.myPid() >> 22)), (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 75), objArr462);
                                    java.lang.String intern182 = ((java.lang.String) objArr462[0]).intern();
                                    java.lang.Object[] objArr472 = new java.lang.Object[1];
                                    b(1472192053 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 795057637, (-105) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (android.view.KeyEvent.keyCodeFromString(str) - 92), (short) (11 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr472);
                                    java.lang.String intern192 = ((java.lang.String) objArr472[0]).intern();
                                    java.lang.Object[] objArr482 = new java.lang.Object[1];
                                    c("軀\ue722崘덮⥓龕\uf59a殙쇯㟖갞Ȉ硠\uee71䑞몹ႄ蛣ﳇ唸", android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 27110, objArr482);
                                    java.lang.String intern202 = ((java.lang.String) objArr482[0]).intern();
                                    java.lang.Object[] objArr492 = new java.lang.Object[1];
                                    b(1472192054 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.graphics.Color.green(0) + 795057639, (-105) - android.view.View.getDefaultSize(0, 0), (byte) ((-103) - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), (short) (android.text.TextUtils.getOffsetBefore(str, 0) + 4), objArr492);
                                    java.lang.String intern212 = ((java.lang.String) objArr492[0]).intern();
                                    java.lang.Object[] objArr502 = new java.lang.Object[1];
                                    b((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1472192053, android.text.TextUtils.indexOf(str, str, 0) + 795057645, android.view.View.combineMeasuredStates(0, 0) - 105, (byte) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) - 86), (short) (100 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), objArr502);
                                    java.lang.String intern222 = ((java.lang.String) objArr502[0]).intern();
                                    java.lang.Object[] objArr512 = new java.lang.Object[1];
                                    b(android.view.Gravity.getAbsoluteGravity(0, 0) + 1472192053, 795057647 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.graphics.Color.red(0) - 105, (byte) ((-72) - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (short) (4 - android.view.View.resolveSize(0, 0)), objArr512);
                                    java.lang.String intern232 = ((java.lang.String) objArr512[0]).intern();
                                    java.lang.Object[] objArr522 = new java.lang.Object[1];
                                    c("軇쯄Ә䇟髂ퟚ\u10cc淤꛳", 17670 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr522);
                                    java.lang.String intern242 = ((java.lang.String) objArr522[0]).intern();
                                    java.lang.Object[] objArr532 = new java.lang.Object[1];
                                    b(1472192054 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 795057663 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 106, (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 77), (short) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 55), objArr532);
                                    java.lang.String intern252 = ((java.lang.String) objArr532[0]).intern();
                                    java.lang.Object[] objArr542 = new java.lang.Object[1];
                                    b(1472192054 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.view.KeyEvent.normalizeMetaState(0) + 795057673, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 106, (byte) (android.graphics.Color.argb(0, 0, 0, 0) - 1), (short) ((-84) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr542);
                                    java.lang.String intern262 = ((java.lang.String) objArr542[0]).intern();
                                    java.lang.Object[] objArr552 = new java.lang.Object[1];
                                    c("軆焚煊熏燁瀴灆炫烥猪猚", org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF7_MARKER - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr552);
                                    java.lang.String intern272 = ((java.lang.String) objArr552[0]).intern();
                                    java.lang.Object[] objArr562 = new java.lang.Object[1];
                                    c("軆\u0b8c葦ĩ鮙ᑂ鄊⯶ꑞℍ믆㒡넑䯈쒲", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 34129, objArr562);
                                    java.lang.String intern282 = ((java.lang.String) objArr562[0]).intern();
                                    java.lang.Object[] objArr572 = new java.lang.Object[1];
                                    c("軆젚͊媏闁\uef34♆憱룲\uf221䴗葑\udf8bᛛ", android.graphics.Color.argb(0, 0, 0, 0) + 18119, objArr572);
                                    java.lang.String[] strArr32 = {intern210, intern310, intern47, intern52, intern62, intern72, intern82, intern92, intern102, intern112, intern122, intern132, intern142, intern152, intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, ((java.lang.String) objArr572[0]).intern()};
                                    java.lang.Object[] objArr582 = new java.lang.Object[1];
                                    b(1472192052 - android.view.View.MeasureSpec.getMode(0), 795057460 - android.text.TextUtils.indexOf(str, str, 0), (-105) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (113 - android.view.View.MeasureSpec.getSize(0)), (short) (18 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr582);
                                    java.lang.Object[] objArr592 = {((java.lang.String) objArr582[0]).intern()};
                                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj2 == null) {
                                    }
                                    invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr592);
                                    if (invoke != null) {
                                    }
                                    java.lang.Object[] objArr752 = new java.lang.Object[1];
                                    b(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1472191985, 795057684 - android.text.TextUtils.indexOf(str, str), android.widget.ExpandableListView.getPackedPositionType(0L) - 105, (byte) (android.view.KeyEvent.keyCodeFromString(str) - 55), (short) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 35), objArr752);
                                    java.lang.Object[] objArr762 = {((java.lang.String) objArr752[0]).intern()};
                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj3 == null) {
                                    }
                                    long longValue82 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr762)).longValue();
                                    long j232 = ~((~longValue82) | (-21626433));
                                    long j242 = (((-107) * longValue82) - 1189453815) + (((~(longValue82 | 21626432)) | (~(j | longValue82))) * (-108)) + (((~(21626432 | j6)) | j232 | (~(j | (-21626433)))) * 54) + ((j6 | j232) * 54) + 1312166500;
                                    int i92 = (-255709074) | i8;
                                    j2 = (((int) (j242 >> 32)) & ((((~((-1532397049) | i8)) | android.R.string.config_defaultRetailDemo | (~((-95170638) | i8))) * (-397)) + 866816144 + (((-1593488822) | i) * 397))) | (((int) j242) & ((i92 * 495) + 1587156746 + (((~i92) | (-1333645210)) * 495)));
                                    java.lang.Object[] objArr782 = new java.lang.Object[1];
                                    c("躜ꃴ튯ѹ㘌榏鮊쵗ｧᄺ䂺犝ꑓ혙\u09c5㯿涰", android.view.View.MeasureSpec.getMode(0) + 11831, objArr782);
                                    java.lang.Object[] objArr792 = {((java.lang.String) objArr782[0]).intern()};
                                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj4 == null) {
                                    }
                                    long longValue92 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr792)).longValue();
                                    long j252 = ((421 * longValue92) - 334273818098L) + ((~(longValue92 | j6)) * 420) + (((-797789543) | longValue92) * (-420)) + (((~(j | longValue92)) | (~((-797789543) | (~longValue92)))) * 420) + 492750525;
                                    int i102 = ~((-836231687) | i);
                                    long j262 = (((int) (j252 >> 32)) & (((((~((-836231687) | i8)) | 268795906) * (-245)) - 1059260044) + (i102 * (-245)) + ((i102 | 600994724) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))) | (((int) j252) & (((((~(1030762679 | i8)) | 656448) * 98) - 1943585214) + (((~(406463730 | i8)) | 1030762679 | (~((-406463731) | i))) * (-49)) + (((~(1030762679 | i)) | 405807282) * 49)));
                                    if (j2 <= 0) {
                                    }
                                    java.lang.Object[] objArr842 = new java.lang.Object[1];
                                    b(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1472191986, 795057683 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 104, (byte) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 54), (short) (35 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr842);
                                    java.lang.Object[] objArr852 = {((java.lang.String) objArr842[0]).intern()};
                                    obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj5 == null) {
                                    }
                                    long longValue102 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr852)).longValue();
                                    long j272 = ~((~longValue102) | 960393890);
                                    long j282 = ((-107) * longValue102) + 52821663950L + (((~(longValue102 | (-960393891))) | (~(j | longValue102))) * (-108)) + (((~((-960393891) | j6)) | j272 | (~(j | 960393890))) * 54) + ((j6 | j272) * 54) + 330146177;
                                    j3 = (((int) (j282 >> 32)) & (((((~(1007137004 | i8)) | 1850603880) * (-933)) - 1882160746) + (((~(1850603880 | i8)) | 268566660) * 933) + 1891363592)) | (((int) j282) & (((357832101 | i) * 614) + 1429850259 + (((~((-1539628638) | i8)) | 289674245 | (~(1318112248 | i8))) * (-1228)) + (((~((-1249954393) | i8)) | (~(1607786493 | i8))) * 614)));
                                    java.lang.Object[] objArr872 = new java.lang.Object[1];
                                    b(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1472191986, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 795057706, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 106, (byte) (android.text.TextUtils.getOffsetAfter(str, 0) - 39), (short) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2), objArr872);
                                    java.lang.Object[] objArr882 = {((java.lang.String) objArr872[0]).intern()};
                                    obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj6 == null) {
                                    }
                                    long longValue112 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr882)).longValue();
                                    long j292 = ((530 * longValue112) - 386250917482L) + (((~(j | (-728775318))) | (~(longValue112 | (-728775318)))) * 529) + (((~longValue112) | (~((-728775318) | j6))) * 529) + 2019315385;
                                    long j302 = (((int) (j292 >> 32)) & ((((~(625250373 | i)) | (-1605006774)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 1546597394 + (((~(625250373 | i8)) | (-1605006774)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) | (((int) j292) & ((((~(610814561 | i8)) | (-826411849)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + 1453938690 + (((~((-285344009) | i8)) | (~((-541067841) | i))) * (-519)) + (((~((-826411849) | i)) | (-610814562)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE)));
                                    if (j3 <= 0) {
                                    }
                                    java.lang.Object[] objArr932 = new java.lang.Object[1];
                                    c("躜钩먘쇻\ue763\u0adbႨ", android.text.TextUtils.indexOf(str, str) + 6761, objArr932);
                                    java.lang.String intern302 = ((java.lang.String) objArr932[0]).intern();
                                    java.lang.Object[] objArr942 = new java.lang.Object[1];
                                    c("躜\ue3e5咀즯㩓꽯\u0000犟\ue7f9増춯", 27942 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr942);
                                    java.lang.String intern312 = ((java.lang.String) objArr942[0]).intern();
                                    java.lang.Object[] objArr952 = new java.lang.Object[1];
                                    c("躜䥥ƀ\ud82f道棯⌀ײַ돨訜䊨᫊", android.text.TextUtils.getTrimmedLength(str) + 51109, objArr952);
                                    java.lang.String intern322 = ((java.lang.String) objArr952[0]).intern();
                                    java.lang.Object[] objArr962 = new java.lang.Object[1];
                                    c("躜鍇뗄확\uf8dbᵵ㿴䀭拳蝮ꦜ쨐", android.graphics.Color.red(0) + 7559, objArr962);
                                    java.lang.String intern332 = ((java.lang.String) objArr962[0]).intern();
                                    java.lang.Object[] objArr972 = new java.lang.Object[1];
                                    c("躜㿴\uecb4鵎䨓﬩ꧧ囋ݙ둣攷", 45361 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr972);
                                    java.lang.String intern342 = ((java.lang.String) objArr972[0]).intern();
                                    java.lang.Object[] objArr982 = new java.lang.Object[1];
                                    b(1472191985 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.widget.ExpandableListView.getPackedPositionType(0L) + 795057711, (-105) - android.view.View.combineMeasuredStates(0, 0), (byte) (41 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), (short) ((-11) - android.view.View.resolveSizeAndState(0, 0, 0)), objArr982);
                                    java.lang.String intern352 = ((java.lang.String) objArr982[0]).intern();
                                    java.lang.Object[] objArr992 = new java.lang.Object[1];
                                    b((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1472191984, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 40452, (-105) - android.view.View.MeasureSpec.getSize(0), (byte) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3), (short) ((-22) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr992);
                                    strArr = new java.lang.String[]{intern302, intern312, intern322, intern332, intern342, intern352, ((java.lang.String) objArr992[0]).intern()};
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < 7) {
                                        }
                                        i2++;
                                        strArr = strArr2;
                                    }
                                    if (i3 == 0) {
                                    }
                                }
                            }
                        }
                        if (obj7 != null) {
                            java.lang.Object[] objArr208 = {obj7, 42};
                            java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj62 == null) {
                                java.lang.Class cls60 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.graphics.Color.argb(0, 0, 0, 0), 2593 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.view.KeyEvent.keyCodeFromString(str));
                                java.lang.Object[] objArr209 = new java.lang.Object[1];
                                a(653, (byte) ($$a[14] + 1), r12[16], objArr209);
                                obj62 = cls60.getMethod((java.lang.String) objArr209[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj62);
                            }
                            long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) obj62).invoke(null, objArr208)).longValue();
                            long j66 = ~longValue25;
                            j = j7;
                            long j67 = (((-68) * longValue25) - 28293941550L) + (((~(j66 | 404199164 | j6)) | (~(longValue25 | (-404199165) | j6))) * 69) + (((~(404199164 | longValue25)) | (~(404199164 | j6)) | (~(longValue25 | j6))) * (-69)) + ((~((-404199165) | j66)) * 69) + 1661299689;
                            if (((((int) j67) & ((((-4986899) | i8) * (-369)) + 802172634 + (((~(1078728978 | i8)) | (-358497432)) * (-369)) + (((~((-1078728979) | i)) | 1073742080 | (~((-353510534) | i8))) * 369))) | (((int) (j67 >> 32)) & ((((~((-850572975) | i)) | 268443650) * (-283)) + 97368032 + ((~((-582129325) | i)) * 283)))) != -1032769152) {
                            }
                            if (android.os.Build.VERSION.SDK_INT <= 33) {
                            }
                        } else {
                            j = j7;
                        }
                        if (invoke4 != null) {
                            java.lang.Object[] objArr210 = {invoke4, 42};
                            java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj63 == null) {
                                java.lang.Class cls61 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2594, (char) android.view.View.getDefaultSize(0, 0));
                                java.lang.Object[] objArr211 = new java.lang.Object[1];
                                a(653, (byte) ($$a[14] + 1), r8[16], objArr211);
                                obj63 = cls61.getMethod((java.lang.String) objArr211[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj63);
                            }
                            long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) obj63).invoke(null, objArr210)).longValue();
                            long j68 = ~longValue26;
                            long j69 = 462175868 | j68;
                            long j70 = ((-764) * longValue26) + 706666903701L + (((~(j69 | j)) | (~(longValue26 | 462175868 | j6)) | (~((-462175869) | j68 | j6))) * 765) + (((~j69) | (~(j | 462175868))) * 1530) + (((~(462175868 | j6)) | (~(j68 | j | (-462175869)))) * 765) + 1719276393;
                        }
                        java.lang.Object[] objArr3022 = new java.lang.Object[1];
                        c("軒愌內䅽ㆴ↑ᇨ=", 61403 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr3022);
                        java.lang.String intern2102 = ((java.lang.String) objArr3022[0]).intern();
                        java.lang.Object[] objArr3122 = new java.lang.Object[1];
                        b(android.graphics.Color.blue(0) + 1472192035, android.graphics.Color.green(0) + 795057521, android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 104, (byte) ((-64) - android.widget.ExpandableListView.getPackedPositionChild(0L)), (short) (46 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr3122);
                        java.lang.String intern3102 = ((java.lang.String) objArr3122[0]).intern();
                        java.lang.Object[] objArr3222 = new java.lang.Object[1];
                        b(1472192037 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.widget.ExpandableListView.getPackedPositionType(0L) + 795057527, (-105) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (android.graphics.Color.blue(0) + 115), (short) (android.view.KeyEvent.normalizeMetaState(0) + 53), objArr3222);
                        java.lang.String intern472 = ((java.lang.String) objArr3222[0]).intern();
                        java.lang.Object[] objArr3322 = new java.lang.Object[1];
                        b((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1472192040, 795057535 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-106) - android.view.MotionEvent.axisFromString(str), (byte) (android.view.KeyEvent.keyCodeFromString(str) - 43), (short) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 27), objArr3322);
                        java.lang.String intern522 = ((java.lang.String) objArr3322[0]).intern();
                        java.lang.Object[] objArr3422 = new java.lang.Object[1];
                        b(1472192043 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 795057543 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.indexOf(str, str) - 105, (byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 'F'), (short) (6 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), objArr3422);
                        java.lang.String intern622 = ((java.lang.String) objArr3422[0]).intern();
                        java.lang.Object[] objArr3522 = new java.lang.Object[1];
                        b(1472192043 - android.view.View.getDefaultSize(0, 0), android.text.TextUtils.indexOf(str, str, 0, 0) + 795057549, (-104) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 18), (short) (117 - android.text.TextUtils.getOffsetBefore(str, 0)), objArr3522);
                        java.lang.String intern722 = ((java.lang.String) objArr3522[0]).intern();
                        java.lang.Object[] objArr3622 = new java.lang.Object[1];
                        b(android.view.Gravity.getAbsoluteGravity(0, 0) + 1472192043, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 795057561, android.view.View.MeasureSpec.getMode(0) - 105, (byte) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 67), (short) (android.view.View.MeasureSpec.getMode(0) + 44), objArr3622);
                        java.lang.String intern822 = ((java.lang.String) objArr3622[0]).intern();
                        java.lang.Object[] objArr3722 = new java.lang.Object[1];
                        b(1472192043 - android.graphics.Color.alpha(0), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 795057567, (-105) - android.view.KeyEvent.keyCodeFromString(str), (byte) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE), (short) (104 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr3722);
                        java.lang.String intern922 = ((java.lang.String) objArr3722[0]).intern();
                        java.lang.Object[] objArr3822 = new java.lang.Object[1];
                        c("軚ꯗ", 9491 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr3822);
                        java.lang.String intern1022 = ((java.lang.String) objArr3822[0]).intern();
                        java.lang.Object[] objArr3922 = new java.lang.Object[1];
                        b((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1472192046, 795057573 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (-105) - android.graphics.Color.red(0), (byte) (120 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (short) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 126), objArr3922);
                        java.lang.String intern1122 = ((java.lang.String) objArr3922[0]).intern();
                        java.lang.Object[] objArr4022 = new java.lang.Object[1];
                        c("軟愇兢䅖ㆾ↓ᇵ`\uf019\ue063", 61403 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4022);
                        java.lang.String intern1222 = ((java.lang.String) objArr4022[0]).intern();
                        java.lang.Object[] objArr4122 = new java.lang.Object[1];
                        b((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1472192050, 778280373 - android.graphics.Color.rgb(0, 0, 0), (-105) - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 117), (short) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 100), objArr4122);
                        java.lang.String intern1322 = ((java.lang.String) objArr4122[0]).intern();
                        java.lang.Object[] objArr4222 = new java.lang.Object[1];
                        b((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1472192049, android.view.View.combineMeasuredStates(0, 0) + 795057597, (-104) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 14), (short) ((-115) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr4222);
                        java.lang.String intern1422 = ((java.lang.String) objArr4222[0]).intern();
                        java.lang.Object[] objArr4322 = new java.lang.Object[1];
                        b(android.view.KeyEvent.getDeadChar(0, 0) + 1472192050, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 795057609, android.graphics.Color.green(0) - 105, (byte) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 115), (short) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 125), objArr4322);
                        java.lang.String intern1522 = ((java.lang.String) objArr4322[0]).intern();
                        java.lang.Object[] objArr4422 = new java.lang.Object[1];
                        c("軁㓛醙ꃻ曲Ⲝ튉", 47629 - android.text.TextUtils.indexOf(str, str, 0), objArr4422);
                        java.lang.String intern1622 = ((java.lang.String) objArr4422[0]).intern();
                        java.lang.Object[] objArr4522 = new java.lang.Object[1];
                        b(1472192053 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 795057623 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 105, (byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 46), (short) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) - 24), objArr4522);
                        java.lang.String intern1722 = ((java.lang.String) objArr4522[0]).intern();
                        java.lang.Object[] objArr4622 = new java.lang.Object[1];
                        b(1472192052 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.indexOf(str, str, 0) + 795057630, (-105) - android.view.View.combineMeasuredStates(0, 0), (byte) (127 - (android.os.Process.myPid() >> 22)), (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 75), objArr4622);
                        java.lang.String intern1822 = ((java.lang.String) objArr4622[0]).intern();
                        java.lang.Object[] objArr4722 = new java.lang.Object[1];
                        b(1472192053 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 795057637, (-105) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (android.view.KeyEvent.keyCodeFromString(str) - 92), (short) (11 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr4722);
                        java.lang.String intern1922 = ((java.lang.String) objArr4722[0]).intern();
                        java.lang.Object[] objArr4822 = new java.lang.Object[1];
                        c("軀\ue722崘덮⥓龕\uf59a殙쇯㟖갞Ȉ硠\uee71䑞몹ႄ蛣ﳇ唸", android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 27110, objArr4822);
                        java.lang.String intern2022 = ((java.lang.String) objArr4822[0]).intern();
                        java.lang.Object[] objArr4922 = new java.lang.Object[1];
                        b(1472192054 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.graphics.Color.green(0) + 795057639, (-105) - android.view.View.getDefaultSize(0, 0), (byte) ((-103) - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), (short) (android.text.TextUtils.getOffsetBefore(str, 0) + 4), objArr4922);
                        java.lang.String intern2122 = ((java.lang.String) objArr4922[0]).intern();
                        java.lang.Object[] objArr5022 = new java.lang.Object[1];
                        b((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1472192053, android.text.TextUtils.indexOf(str, str, 0) + 795057645, android.view.View.combineMeasuredStates(0, 0) - 105, (byte) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) - 86), (short) (100 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), objArr5022);
                        java.lang.String intern2222 = ((java.lang.String) objArr5022[0]).intern();
                        java.lang.Object[] objArr5122 = new java.lang.Object[1];
                        b(android.view.Gravity.getAbsoluteGravity(0, 0) + 1472192053, 795057647 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.graphics.Color.red(0) - 105, (byte) ((-72) - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (short) (4 - android.view.View.resolveSize(0, 0)), objArr5122);
                        java.lang.String intern2322 = ((java.lang.String) objArr5122[0]).intern();
                        java.lang.Object[] objArr5222 = new java.lang.Object[1];
                        c("軇쯄Ә䇟髂ퟚ\u10cc淤꛳", 17670 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr5222);
                        java.lang.String intern2422 = ((java.lang.String) objArr5222[0]).intern();
                        java.lang.Object[] objArr5322 = new java.lang.Object[1];
                        b(1472192054 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 795057663 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 106, (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 77), (short) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 55), objArr5322);
                        java.lang.String intern2522 = ((java.lang.String) objArr5322[0]).intern();
                        java.lang.Object[] objArr5422 = new java.lang.Object[1];
                        b(1472192054 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.view.KeyEvent.normalizeMetaState(0) + 795057673, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 106, (byte) (android.graphics.Color.argb(0, 0, 0, 0) - 1), (short) ((-84) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr5422);
                        java.lang.String intern2622 = ((java.lang.String) objArr5422[0]).intern();
                        java.lang.Object[] objArr5522 = new java.lang.Object[1];
                        c("軆焚煊熏燁瀴灆炫烥猪猚", org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF7_MARKER - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr5522);
                        java.lang.String intern2722 = ((java.lang.String) objArr5522[0]).intern();
                        java.lang.Object[] objArr5622 = new java.lang.Object[1];
                        c("軆\u0b8c葦ĩ鮙ᑂ鄊⯶ꑞℍ믆㒡넑䯈쒲", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 34129, objArr5622);
                        java.lang.String intern2822 = ((java.lang.String) objArr5622[0]).intern();
                        java.lang.Object[] objArr5722 = new java.lang.Object[1];
                        c("軆젚͊媏闁\uef34♆憱룲\uf221䴗葑\udf8bᛛ", android.graphics.Color.argb(0, 0, 0, 0) + 18119, objArr5722);
                        java.lang.String[] strArr322 = {intern2102, intern3102, intern472, intern522, intern622, intern722, intern822, intern922, intern1022, intern1122, intern1222, intern1322, intern1422, intern1522, intern1622, intern1722, intern1822, intern1922, intern2022, intern2122, intern2222, intern2322, intern2422, intern2522, intern2622, intern2722, intern2822, ((java.lang.String) objArr5722[0]).intern()};
                        java.lang.Object[] objArr5822 = new java.lang.Object[1];
                        b(1472192052 - android.view.View.MeasureSpec.getMode(0), 795057460 - android.text.TextUtils.indexOf(str, str, 0), (-105) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (113 - android.view.View.MeasureSpec.getSize(0)), (short) (18 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr5822);
                        java.lang.Object[] objArr5922 = {((java.lang.String) objArr5822[0]).intern()};
                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj2 == null) {
                        }
                        invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr5922);
                        if (invoke != null) {
                        }
                        java.lang.Object[] objArr7522 = new java.lang.Object[1];
                        b(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1472191985, 795057684 - android.text.TextUtils.indexOf(str, str), android.widget.ExpandableListView.getPackedPositionType(0L) - 105, (byte) (android.view.KeyEvent.keyCodeFromString(str) - 55), (short) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 35), objArr7522);
                        java.lang.Object[] objArr7622 = {((java.lang.String) objArr7522[0]).intern()};
                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj3 == null) {
                        }
                        long longValue822 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7622)).longValue();
                        long j2322 = ~((~longValue822) | (-21626433));
                        long j2422 = (((-107) * longValue822) - 1189453815) + (((~(longValue822 | 21626432)) | (~(j | longValue822))) * (-108)) + (((~(21626432 | j6)) | j2322 | (~(j | (-21626433)))) * 54) + ((j6 | j2322) * 54) + 1312166500;
                        int i922 = (-255709074) | i8;
                        j2 = (((int) (j2422 >> 32)) & ((((~((-1532397049) | i8)) | android.R.string.config_defaultRetailDemo | (~((-95170638) | i8))) * (-397)) + 866816144 + (((-1593488822) | i) * 397))) | (((int) j2422) & ((i922 * 495) + 1587156746 + (((~i922) | (-1333645210)) * 495)));
                        java.lang.Object[] objArr7822 = new java.lang.Object[1];
                        c("躜ꃴ튯ѹ㘌榏鮊쵗ｧᄺ䂺犝ꑓ혙\u09c5㯿涰", android.view.View.MeasureSpec.getMode(0) + 11831, objArr7822);
                        java.lang.Object[] objArr7922 = {((java.lang.String) objArr7822[0]).intern()};
                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj4 == null) {
                        }
                        long longValue922 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr7922)).longValue();
                        long j2522 = ((421 * longValue922) - 334273818098L) + ((~(longValue922 | j6)) * 420) + (((-797789543) | longValue922) * (-420)) + (((~(j | longValue922)) | (~((-797789543) | (~longValue922)))) * 420) + 492750525;
                        int i1022 = ~((-836231687) | i);
                        long j2622 = (((int) (j2522 >> 32)) & (((((~((-836231687) | i8)) | 268795906) * (-245)) - 1059260044) + (i1022 * (-245)) + ((i1022 | 600994724) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))) | (((int) j2522) & (((((~(1030762679 | i8)) | 656448) * 98) - 1943585214) + (((~(406463730 | i8)) | 1030762679 | (~((-406463731) | i))) * (-49)) + (((~(1030762679 | i)) | 405807282) * 49)));
                        if (j2 <= 0) {
                        }
                        java.lang.Object[] objArr8422 = new java.lang.Object[1];
                        b(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1472191986, 795057683 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 104, (byte) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 54), (short) (35 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr8422);
                        java.lang.Object[] objArr8522 = {((java.lang.String) objArr8422[0]).intern()};
                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj5 == null) {
                        }
                        long longValue1022 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8522)).longValue();
                        long j2722 = ~((~longValue1022) | 960393890);
                        long j2822 = ((-107) * longValue1022) + 52821663950L + (((~(longValue1022 | (-960393891))) | (~(j | longValue1022))) * (-108)) + (((~((-960393891) | j6)) | j2722 | (~(j | 960393890))) * 54) + ((j6 | j2722) * 54) + 330146177;
                        j3 = (((int) (j2822 >> 32)) & (((((~(1007137004 | i8)) | 1850603880) * (-933)) - 1882160746) + (((~(1850603880 | i8)) | 268566660) * 933) + 1891363592)) | (((int) j2822) & (((357832101 | i) * 614) + 1429850259 + (((~((-1539628638) | i8)) | 289674245 | (~(1318112248 | i8))) * (-1228)) + (((~((-1249954393) | i8)) | (~(1607786493 | i8))) * 614)));
                        java.lang.Object[] objArr8722 = new java.lang.Object[1];
                        b(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1472191986, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 795057706, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 106, (byte) (android.text.TextUtils.getOffsetAfter(str, 0) - 39), (short) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2), objArr8722);
                        java.lang.Object[] objArr8822 = {((java.lang.String) objArr8722[0]).intern()};
                        obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj6 == null) {
                        }
                        long longValue1122 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr8822)).longValue();
                        long j2922 = ((530 * longValue1122) - 386250917482L) + (((~(j | (-728775318))) | (~(longValue1122 | (-728775318)))) * 529) + (((~longValue1122) | (~((-728775318) | j6))) * 529) + 2019315385;
                        long j3022 = (((int) (j2922 >> 32)) & ((((~(625250373 | i)) | (-1605006774)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 1546597394 + (((~(625250373 | i8)) | (-1605006774)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) | (((int) j2922) & ((((~(610814561 | i8)) | (-826411849)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + 1453938690 + (((~((-285344009) | i8)) | (~((-541067841) | i))) * (-519)) + (((~((-826411849) | i)) | (-610814562)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE)));
                        if (j3 <= 0) {
                        }
                        java.lang.Object[] objArr9322 = new java.lang.Object[1];
                        c("躜钩먘쇻\ue763\u0adbႨ", android.text.TextUtils.indexOf(str, str) + 6761, objArr9322);
                        java.lang.String intern3022 = ((java.lang.String) objArr9322[0]).intern();
                        java.lang.Object[] objArr9422 = new java.lang.Object[1];
                        c("躜\ue3e5咀즯㩓꽯\u0000犟\ue7f9増춯", 27942 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr9422);
                        java.lang.String intern3122 = ((java.lang.String) objArr9422[0]).intern();
                        java.lang.Object[] objArr9522 = new java.lang.Object[1];
                        c("躜䥥ƀ\ud82f道棯⌀ײַ돨訜䊨᫊", android.text.TextUtils.getTrimmedLength(str) + 51109, objArr9522);
                        java.lang.String intern3222 = ((java.lang.String) objArr9522[0]).intern();
                        java.lang.Object[] objArr9622 = new java.lang.Object[1];
                        c("躜鍇뗄확\uf8dbᵵ㿴䀭拳蝮ꦜ쨐", android.graphics.Color.red(0) + 7559, objArr9622);
                        java.lang.String intern3322 = ((java.lang.String) objArr9622[0]).intern();
                        java.lang.Object[] objArr9722 = new java.lang.Object[1];
                        c("躜㿴\uecb4鵎䨓﬩ꧧ囋ݙ둣攷", 45361 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr9722);
                        java.lang.String intern3422 = ((java.lang.String) objArr9722[0]).intern();
                        java.lang.Object[] objArr9822 = new java.lang.Object[1];
                        b(1472191985 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.widget.ExpandableListView.getPackedPositionType(0L) + 795057711, (-105) - android.view.View.combineMeasuredStates(0, 0), (byte) (41 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), (short) ((-11) - android.view.View.resolveSizeAndState(0, 0, 0)), objArr9822);
                        java.lang.String intern3522 = ((java.lang.String) objArr9822[0]).intern();
                        java.lang.Object[] objArr9922 = new java.lang.Object[1];
                        b((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1472191984, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 40452, (-105) - android.view.View.MeasureSpec.getSize(0), (byte) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3), (short) ((-22) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr9922);
                        strArr = new java.lang.String[]{intern3022, intern3122, intern3222, intern3322, intern3422, intern3522, ((java.lang.String) objArr9922[0]).intern()};
                        i2 = 0;
                        while (true) {
                            if (i2 < 7) {
                            }
                            i2++;
                            strArr = strArr2;
                        }
                        if (i3 == 0) {
                        }
                    }
                } else {
                    str = "";
                }
                j = j7;
                java.lang.Object[] objArr30222 = new java.lang.Object[1];
                c("軒愌內䅽ㆴ↑ᇨ=", 61403 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr30222);
                java.lang.String intern21022 = ((java.lang.String) objArr30222[0]).intern();
                java.lang.Object[] objArr31222 = new java.lang.Object[1];
                b(android.graphics.Color.blue(0) + 1472192035, android.graphics.Color.green(0) + 795057521, android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 104, (byte) ((-64) - android.widget.ExpandableListView.getPackedPositionChild(0L)), (short) (46 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr31222);
                java.lang.String intern31022 = ((java.lang.String) objArr31222[0]).intern();
                java.lang.Object[] objArr32222 = new java.lang.Object[1];
                b(1472192037 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.widget.ExpandableListView.getPackedPositionType(0L) + 795057527, (-105) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) (android.graphics.Color.blue(0) + 115), (short) (android.view.KeyEvent.normalizeMetaState(0) + 53), objArr32222);
                java.lang.String intern4722 = ((java.lang.String) objArr32222[0]).intern();
                java.lang.Object[] objArr33222 = new java.lang.Object[1];
                b((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1472192040, 795057535 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (-106) - android.view.MotionEvent.axisFromString(str), (byte) (android.view.KeyEvent.keyCodeFromString(str) - 43), (short) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 27), objArr33222);
                java.lang.String intern5222 = ((java.lang.String) objArr33222[0]).intern();
                java.lang.Object[] objArr34222 = new java.lang.Object[1];
                b(1472192043 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 795057543 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.indexOf(str, str) - 105, (byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 'F'), (short) (6 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), objArr34222);
                java.lang.String intern6222 = ((java.lang.String) objArr34222[0]).intern();
                java.lang.Object[] objArr35222 = new java.lang.Object[1];
                b(1472192043 - android.view.View.getDefaultSize(0, 0), android.text.TextUtils.indexOf(str, str, 0, 0) + 795057549, (-104) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 18), (short) (117 - android.text.TextUtils.getOffsetBefore(str, 0)), objArr35222);
                java.lang.String intern7222 = ((java.lang.String) objArr35222[0]).intern();
                java.lang.Object[] objArr36222 = new java.lang.Object[1];
                b(android.view.Gravity.getAbsoluteGravity(0, 0) + 1472192043, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 795057561, android.view.View.MeasureSpec.getMode(0) - 105, (byte) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 67), (short) (android.view.View.MeasureSpec.getMode(0) + 44), objArr36222);
                java.lang.String intern8222 = ((java.lang.String) objArr36222[0]).intern();
                java.lang.Object[] objArr37222 = new java.lang.Object[1];
                b(1472192043 - android.graphics.Color.alpha(0), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 795057567, (-105) - android.view.KeyEvent.keyCodeFromString(str), (byte) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE), (short) (104 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr37222);
                java.lang.String intern9222 = ((java.lang.String) objArr37222[0]).intern();
                java.lang.Object[] objArr38222 = new java.lang.Object[1];
                c("軚ꯗ", 9491 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr38222);
                java.lang.String intern10222 = ((java.lang.String) objArr38222[0]).intern();
                java.lang.Object[] objArr39222 = new java.lang.Object[1];
                b((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1472192046, 795057573 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (-105) - android.graphics.Color.red(0), (byte) (120 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (short) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 126), objArr39222);
                java.lang.String intern11222 = ((java.lang.String) objArr39222[0]).intern();
                java.lang.Object[] objArr40222 = new java.lang.Object[1];
                c("軟愇兢䅖ㆾ↓ᇵ`\uf019\ue063", 61403 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr40222);
                java.lang.String intern12222 = ((java.lang.String) objArr40222[0]).intern();
                java.lang.Object[] objArr41222 = new java.lang.Object[1];
                b((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1472192050, 778280373 - android.graphics.Color.rgb(0, 0, 0), (-105) - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 117), (short) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 100), objArr41222);
                java.lang.String intern13222 = ((java.lang.String) objArr41222[0]).intern();
                java.lang.Object[] objArr42222 = new java.lang.Object[1];
                b((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1472192049, android.view.View.combineMeasuredStates(0, 0) + 795057597, (-104) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 14), (short) ((-115) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr42222);
                java.lang.String intern14222 = ((java.lang.String) objArr42222[0]).intern();
                java.lang.Object[] objArr43222 = new java.lang.Object[1];
                b(android.view.KeyEvent.getDeadChar(0, 0) + 1472192050, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 795057609, android.graphics.Color.green(0) - 105, (byte) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 115), (short) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 125), objArr43222);
                java.lang.String intern15222 = ((java.lang.String) objArr43222[0]).intern();
                java.lang.Object[] objArr44222 = new java.lang.Object[1];
                c("軁㓛醙ꃻ曲Ⲝ튉", 47629 - android.text.TextUtils.indexOf(str, str, 0), objArr44222);
                java.lang.String intern16222 = ((java.lang.String) objArr44222[0]).intern();
                java.lang.Object[] objArr45222 = new java.lang.Object[1];
                b(1472192053 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 795057623 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 105, (byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 46), (short) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) - 24), objArr45222);
                java.lang.String intern17222 = ((java.lang.String) objArr45222[0]).intern();
                java.lang.Object[] objArr46222 = new java.lang.Object[1];
                b(1472192052 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.indexOf(str, str, 0) + 795057630, (-105) - android.view.View.combineMeasuredStates(0, 0), (byte) (127 - (android.os.Process.myPid() >> 22)), (short) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 75), objArr46222);
                java.lang.String intern18222 = ((java.lang.String) objArr46222[0]).intern();
                java.lang.Object[] objArr47222 = new java.lang.Object[1];
                b(1472192053 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 795057637, (-105) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (android.view.KeyEvent.keyCodeFromString(str) - 92), (short) (11 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr47222);
                java.lang.String intern19222 = ((java.lang.String) objArr47222[0]).intern();
                java.lang.Object[] objArr48222 = new java.lang.Object[1];
                c("軀\ue722崘덮⥓龕\uf59a殙쇯㟖갞Ȉ硠\uee71䑞몹ႄ蛣ﳇ唸", android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 27110, objArr48222);
                java.lang.String intern20222 = ((java.lang.String) objArr48222[0]).intern();
                java.lang.Object[] objArr49222 = new java.lang.Object[1];
                b(1472192054 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.graphics.Color.green(0) + 795057639, (-105) - android.view.View.getDefaultSize(0, 0), (byte) ((-103) - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), (short) (android.text.TextUtils.getOffsetBefore(str, 0) + 4), objArr49222);
                java.lang.String intern21222 = ((java.lang.String) objArr49222[0]).intern();
                java.lang.Object[] objArr50222 = new java.lang.Object[1];
                b((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1472192053, android.text.TextUtils.indexOf(str, str, 0) + 795057645, android.view.View.combineMeasuredStates(0, 0) - 105, (byte) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) - 86), (short) (100 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), objArr50222);
                java.lang.String intern22222 = ((java.lang.String) objArr50222[0]).intern();
                java.lang.Object[] objArr51222 = new java.lang.Object[1];
                b(android.view.Gravity.getAbsoluteGravity(0, 0) + 1472192053, 795057647 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.graphics.Color.red(0) - 105, (byte) ((-72) - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (short) (4 - android.view.View.resolveSize(0, 0)), objArr51222);
                java.lang.String intern23222 = ((java.lang.String) objArr51222[0]).intern();
                java.lang.Object[] objArr52222 = new java.lang.Object[1];
                c("軇쯄Ә䇟髂ퟚ\u10cc淤꛳", 17670 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr52222);
                java.lang.String intern24222 = ((java.lang.String) objArr52222[0]).intern();
                java.lang.Object[] objArr53222 = new java.lang.Object[1];
                b(1472192054 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 795057663 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 106, (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 77), (short) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 55), objArr53222);
                java.lang.String intern25222 = ((java.lang.String) objArr53222[0]).intern();
                java.lang.Object[] objArr54222 = new java.lang.Object[1];
                b(1472192054 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.view.KeyEvent.normalizeMetaState(0) + 795057673, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 106, (byte) (android.graphics.Color.argb(0, 0, 0, 0) - 1), (short) ((-84) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr54222);
                java.lang.String intern26222 = ((java.lang.String) objArr54222[0]).intern();
                java.lang.Object[] objArr55222 = new java.lang.Object[1];
                c("軆焚煊熏燁瀴灆炫烥猪猚", org.apache.commons.imaging.formats.jpeg.JpegConstants.SOF7_MARKER - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr55222);
                java.lang.String intern27222 = ((java.lang.String) objArr55222[0]).intern();
                java.lang.Object[] objArr56222 = new java.lang.Object[1];
                c("軆\u0b8c葦ĩ鮙ᑂ鄊⯶ꑞℍ믆㒡넑䯈쒲", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 34129, objArr56222);
                java.lang.String intern28222 = ((java.lang.String) objArr56222[0]).intern();
                java.lang.Object[] objArr57222 = new java.lang.Object[1];
                c("軆젚͊媏闁\uef34♆憱룲\uf221䴗葑\udf8bᛛ", android.graphics.Color.argb(0, 0, 0, 0) + 18119, objArr57222);
                java.lang.String[] strArr3222 = {intern21022, intern31022, intern4722, intern5222, intern6222, intern7222, intern8222, intern9222, intern10222, intern11222, intern12222, intern13222, intern14222, intern15222, intern16222, intern17222, intern18222, intern19222, intern20222, intern21222, intern22222, intern23222, intern24222, intern25222, intern26222, intern27222, intern28222, ((java.lang.String) objArr57222[0]).intern()};
                java.lang.Object[] objArr58222 = new java.lang.Object[1];
                b(1472192052 - android.view.View.MeasureSpec.getMode(0), 795057460 - android.text.TextUtils.indexOf(str, str, 0), (-105) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (113 - android.view.View.MeasureSpec.getSize(0)), (short) (18 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr58222);
                java.lang.Object[] objArr59222 = {((java.lang.String) objArr58222[0]).intern()};
                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj2 == null) {
                }
                invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr59222);
                if (invoke != null) {
                }
                java.lang.Object[] objArr75222 = new java.lang.Object[1];
                b(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1472191985, 795057684 - android.text.TextUtils.indexOf(str, str), android.widget.ExpandableListView.getPackedPositionType(0L) - 105, (byte) (android.view.KeyEvent.keyCodeFromString(str) - 55), (short) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 35), objArr75222);
                java.lang.Object[] objArr76222 = {((java.lang.String) objArr75222[0]).intern()};
                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj3 == null) {
                }
                long longValue8222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr76222)).longValue();
                long j23222 = ~((~longValue8222) | (-21626433));
                long j24222 = (((-107) * longValue8222) - 1189453815) + (((~(longValue8222 | 21626432)) | (~(j | longValue8222))) * (-108)) + (((~(21626432 | j6)) | j23222 | (~(j | (-21626433)))) * 54) + ((j6 | j23222) * 54) + 1312166500;
                int i9222 = (-255709074) | i8;
                j2 = (((int) (j24222 >> 32)) & ((((~((-1532397049) | i8)) | android.R.string.config_defaultRetailDemo | (~((-95170638) | i8))) * (-397)) + 866816144 + (((-1593488822) | i) * 397))) | (((int) j24222) & ((i9222 * 495) + 1587156746 + (((~i9222) | (-1333645210)) * 495)));
                java.lang.Object[] objArr78222 = new java.lang.Object[1];
                c("躜ꃴ튯ѹ㘌榏鮊쵗ｧᄺ䂺犝ꑓ혙\u09c5㯿涰", android.view.View.MeasureSpec.getMode(0) + 11831, objArr78222);
                java.lang.Object[] objArr79222 = {((java.lang.String) objArr78222[0]).intern()};
                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj4 == null) {
                }
                long longValue9222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr79222)).longValue();
                long j25222 = ((421 * longValue9222) - 334273818098L) + ((~(longValue9222 | j6)) * 420) + (((-797789543) | longValue9222) * (-420)) + (((~(j | longValue9222)) | (~((-797789543) | (~longValue9222)))) * 420) + 492750525;
                int i10222 = ~((-836231687) | i);
                long j26222 = (((int) (j25222 >> 32)) & (((((~((-836231687) | i8)) | 268795906) * (-245)) - 1059260044) + (i10222 * (-245)) + ((i10222 | 600994724) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))) | (((int) j25222) & (((((~(1030762679 | i8)) | 656448) * 98) - 1943585214) + (((~(406463730 | i8)) | 1030762679 | (~((-406463731) | i))) * (-49)) + (((~(1030762679 | i)) | 405807282) * 49)));
                if (j2 <= 0) {
                }
                java.lang.Object[] objArr84222 = new java.lang.Object[1];
                b(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1472191986, 795057683 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 104, (byte) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 54), (short) (35 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr84222);
                java.lang.Object[] objArr85222 = {((java.lang.String) objArr84222[0]).intern()};
                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj5 == null) {
                }
                long longValue10222 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr85222)).longValue();
                long j27222 = ~((~longValue10222) | 960393890);
                long j28222 = ((-107) * longValue10222) + 52821663950L + (((~(longValue10222 | (-960393891))) | (~(j | longValue10222))) * (-108)) + (((~((-960393891) | j6)) | j27222 | (~(j | 960393890))) * 54) + ((j6 | j27222) * 54) + 330146177;
                j3 = (((int) (j28222 >> 32)) & (((((~(1007137004 | i8)) | 1850603880) * (-933)) - 1882160746) + (((~(1850603880 | i8)) | 268566660) * 933) + 1891363592)) | (((int) j28222) & (((357832101 | i) * 614) + 1429850259 + (((~((-1539628638) | i8)) | 289674245 | (~(1318112248 | i8))) * (-1228)) + (((~((-1249954393) | i8)) | (~(1607786493 | i8))) * 614)));
                java.lang.Object[] objArr87222 = new java.lang.Object[1];
                b(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1472191986, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 795057706, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 106, (byte) (android.text.TextUtils.getOffsetAfter(str, 0) - 39), (short) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2), objArr87222);
                java.lang.Object[] objArr88222 = {((java.lang.String) objArr87222[0]).intern()};
                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj6 == null) {
                }
                long longValue11222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr88222)).longValue();
                long j29222 = ((530 * longValue11222) - 386250917482L) + (((~(j | (-728775318))) | (~(longValue11222 | (-728775318)))) * 529) + (((~longValue11222) | (~((-728775318) | j6))) * 529) + 2019315385;
                long j30222 = (((int) (j29222 >> 32)) & ((((~(625250373 | i)) | (-1605006774)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 1546597394 + (((~(625250373 | i8)) | (-1605006774)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) | (((int) j29222) & ((((~(610814561 | i8)) | (-826411849)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + 1453938690 + (((~((-285344009) | i8)) | (~((-541067841) | i))) * (-519)) + (((~((-826411849) | i)) | (-610814562)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE)));
                if (j3 <= 0) {
                }
                java.lang.Object[] objArr93222 = new java.lang.Object[1];
                c("躜钩먘쇻\ue763\u0adbႨ", android.text.TextUtils.indexOf(str, str) + 6761, objArr93222);
                java.lang.String intern30222 = ((java.lang.String) objArr93222[0]).intern();
                java.lang.Object[] objArr94222 = new java.lang.Object[1];
                c("躜\ue3e5咀즯㩓꽯\u0000犟\ue7f9増춯", 27942 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr94222);
                java.lang.String intern31222 = ((java.lang.String) objArr94222[0]).intern();
                java.lang.Object[] objArr95222 = new java.lang.Object[1];
                c("躜䥥ƀ\ud82f道棯⌀ײַ돨訜䊨᫊", android.text.TextUtils.getTrimmedLength(str) + 51109, objArr95222);
                java.lang.String intern32222 = ((java.lang.String) objArr95222[0]).intern();
                java.lang.Object[] objArr96222 = new java.lang.Object[1];
                c("躜鍇뗄확\uf8dbᵵ㿴䀭拳蝮ꦜ쨐", android.graphics.Color.red(0) + 7559, objArr96222);
                java.lang.String intern33222 = ((java.lang.String) objArr96222[0]).intern();
                java.lang.Object[] objArr97222 = new java.lang.Object[1];
                c("躜㿴\uecb4鵎䨓﬩ꧧ囋ݙ둣攷", 45361 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr97222);
                java.lang.String intern34222 = ((java.lang.String) objArr97222[0]).intern();
                java.lang.Object[] objArr98222 = new java.lang.Object[1];
                b(1472191985 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.widget.ExpandableListView.getPackedPositionType(0L) + 795057711, (-105) - android.view.View.combineMeasuredStates(0, 0), (byte) (41 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), (short) ((-11) - android.view.View.resolveSizeAndState(0, 0, 0)), objArr98222);
                java.lang.String intern35222 = ((java.lang.String) objArr98222[0]).intern();
                java.lang.Object[] objArr99222 = new java.lang.Object[1];
                b((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1472191984, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 40452, (-105) - android.view.View.MeasureSpec.getSize(0), (byte) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3), (short) ((-22) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr99222);
                strArr = new java.lang.String[]{intern30222, intern31222, intern32222, intern33222, intern34222, intern35222, ((java.lang.String) objArr99222[0]).intern()};
                i2 = 0;
                while (true) {
                    if (i2 < 7) {
                    }
                    i2++;
                    strArr = strArr2;
                }
                if (i3 == 0) {
                }
            } catch (java.lang.Throwable th11) {
                java.lang.Throwable cause5 = th11.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th11;
            }
        }

        static void init$1() {
            $$d = new byte[]{com.google.common.base.Ascii.SYN, -105, 0, 34};
            $$e = 205;
        }

        @Override // com.payair.hce.isNetworkError
        public final void getGpoResponse() {
            DigitizedCardProfile(new java.lang.Object[]{this}, -848978326, 848978327, java.lang.System.identityHashCode(this));
        }

        static void init$0() {
            $$a = new byte[]{Byte.MAX_VALUE, -61, 58, -113, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10};
            $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE;
        }

        @Override // com.payair.hce.isNetworkError
        public final byte[] valueOf() {
            return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 726621303, -726621303, java.lang.System.identityHashCode(this));
        }
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (getProfileVersion ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getPaymentFci)};
                    int i4 = c2 + i2;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(61 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 1335 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c(0, 0, 3, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (getAid ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(RecordsJson)};
                    int i5 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 62, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1335, (char) android.view.View.combineMeasuredStates(0, 0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c(0, 0, 3, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
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
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 53, android.os.Process.getGidForName("") + 3544, (char) android.view.View.getDefaultSize(0, 0))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
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
        int i3 = 1;
        int i4 = iArr[1];
        int i5 = 2;
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = SdkCoreAlternateContactlessPaymentDataImpl;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 29;
                $11 = i9 % 128;
                if (i9 % i5 == 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i3];
                        objArr2[i] = java.lang.Integer.valueOf(cArr[i8]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i) == 0.0d ? 0 : -1)) + 29, 2807 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) android.text.TextUtils.getCapsMode("", i, i));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            c(i, i, 2, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[i], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                        }
                        cArr2[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr[i8])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 29, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2807, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c(0, 0, 2, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj2);
                    }
                    cArr2[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i8++;
                }
                i = 0;
                i3 = 1;
                i5 = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        java.lang.System.arraycopy(cArr, i2, cArr3, 0, i4);
        if (bArr2 != null) {
            $11 = ($10 + 85) % 128;
            char[] cArr4 = new char[i4];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i4) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.text.TextUtils.indexOf("", "", 0), 2836 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        c(0, 0, 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr4[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 2880 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        c(0, 0, (byte) $$a.length, objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj4);
                    }
                    cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr10 = {getaccounttype, getaccounttype};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 34, 213 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i12 = $10 + 37;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                char[] cArr5 = new char[i4];
                java.lang.System.arraycopy(cArr3, 0, cArr5, 1, i4);
                java.lang.System.arraycopy(cArr5, 0, cArr3, i4 << i7, i7);
                java.lang.System.arraycopy(cArr5, i7, cArr3, 0, i4 - i7);
            } else {
                char[] cArr6 = new char[i4];
                java.lang.System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i13 = i4 - i7;
                java.lang.System.arraycopy(cArr6, 0, cArr3, i13, i7);
                java.lang.System.arraycopy(cArr6, i7, cArr3, 0, i13);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            int i14 = 0;
            while (true) {
                getaccounttype.writeReplace = i14;
                if (getaccounttype.writeReplace >= i4) {
                    break;
                }
                cArr7[getaccounttype.writeReplace] = cArr3[(i4 - getaccounttype.writeReplace) - 1];
                i14 = getaccounttype.writeReplace + 1;
            }
            cArr3 = cArr7;
        }
        if (i6 > 0) {
            int i15 = 0;
            while (true) {
                getaccounttype.writeReplace = i15;
                if (getaccounttype.writeReplace >= i4) {
                    break;
                }
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                i15 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // com.payair.hce.deleteDatabase
    public final void writeReplace() {
        getCvrMaskAnd = (getGpoResponse + 109) % 128;
        com.payair.hce.getNoBackupFilesDir getnobackupfilesdir = (com.payair.hce.getNoBackupFilesDir) this.writeReplace;
        try {
            try {
                java.lang.String buildAsJson = values().buildAsJson();
                int i = com.payair.hce.sendOrderedBroadcastAsUser.getAid;
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.valueOf;
                com.payair.hce.equals DigitizedCardProfile = ((com.payair.hce.hashCode) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, 905350733, -905350733, java.lang.System.identityHashCode(sendorderedbroadcast))).DigitizedCardProfile(com.payair.hce.component6.DigitizedCardProfile, this.AlternateContactlessPaymentDataJson, buildAsJson, this.IccPrivateKeyCrtComponentsJson);
                if (DigitizedCardProfile.DigitizedCardProfile() != 200) {
                    int i2 = getCvrMaskAnd + 39;
                    getGpoResponse = i2 % 128;
                    if (i2 % 2 == 0) {
                        if (DigitizedCardProfile.DigitizedCardProfile() == 204) {
                        }
                        DigitizedCardProfile(DigitizedCardProfile);
                        return;
                    } else {
                        if (DigitizedCardProfile.DigitizedCardProfile() == 30289) {
                        }
                        DigitizedCardProfile(DigitizedCardProfile);
                        return;
                    }
                }
                getCvrMaskAnd = (getGpoResponse + 39) % 128;
                if (AlternateContactlessPaymentDataJson(DigitizedCardProfile)) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a(new int[]{100, 23, 0, 2}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000", true, objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 29, 0, 0}, "\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000", true, objArr2);
                    this.DigitizedCardProfile.writeReplace(new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getAid, new com.payair.hce.databaseList((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getnobackupfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getnobackupfilesdir)), this.values, intern, ((java.lang.String) objArr2[0]).intern())), AlternateContactlessPaymentDataJson());
                    return;
                }
                getCvrMaskAnd = (getGpoResponse + 41) % 128;
                byte[] AlternateContactlessPaymentDataJson2 = AlternateContactlessPaymentDataJson(DigitizedCardProfile.writeReplace());
                com.payair.hce.stopService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson2);
                com.mastercard.mpsdk.remotemanagement.api.json.ReplenishResponseEncrypted valueOf = com.mastercard.mpsdk.remotemanagement.api.json.ReplenishResponseEncrypted.valueOf(AlternateContactlessPaymentDataJson2);
                com.mastercard.mpsdk.remotemanagement.api.json.ReplenishResponseEncrypted replenishResponseEncrypted = valueOf;
                if (!valueOf.isSuccess()) {
                    throw new com.payair.hce.VisaReperso(valueOf.getErrorDescription(), valueOf.getErrorCode());
                }
                if (valueOf.getTransactionCredentials() != null && valueOf.getTransactionCredentials().length > 0) {
                    try {
                        this.DigitizedCardProfile.DigitizedCardProfile(new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getAid, new com.payair.hce.databaseList((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getnobackupfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getnobackupfilesdir)), this.values, values(valueOf.getTransactionCredentials()))));
                        return;
                    } catch (java.security.GeneralSecurityException e) {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a(new int[]{0, 22, 0, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001", false, objArr3);
                        this.DigitizedCardProfile.writeReplace(new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getAid, new com.payair.hce.databaseList((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getnobackupfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getnobackupfilesdir)), this.values, ((java.lang.String) objArr3[0]).intern(), e.getMessage())), AlternateContactlessPaymentDataJson());
                        return;
                    }
                }
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(new int[]{22, 31, 0, 3}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001", false, objArr4);
                java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                a(new int[]{53, 47, 0, 0}, "\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001", true, objArr5);
                this.DigitizedCardProfile.writeReplace(new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getAid, new com.payair.hce.databaseList((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getnobackupfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getnobackupfilesdir)), this.values, intern2, ((java.lang.String) objArr5[0]).intern())), AlternateContactlessPaymentDataJson());
            } catch (java.security.GeneralSecurityException e2) {
                java.lang.String str = (java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getnobackupfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getnobackupfilesdir));
                java.lang.String str2 = this.values;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                a(new int[]{0, 22, 0, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001", false, objArr6);
                java.lang.String intern3 = ((java.lang.String) objArr6[0]).intern();
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                a(new int[]{152, 36, 153, 0}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000", false, objArr7);
                com.payair.hce.getDatabasePath getdatabasepath = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getAid, new com.payair.hce.databaseList(str, str2, intern3, ((java.lang.String) objArr7[0]).intern()));
                com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath, e2}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath));
                this.DigitizedCardProfile.writeReplace(getdatabasepath, AlternateContactlessPaymentDataJson());
            }
        } catch (com.payair.hce.VisaReperso e3) {
            com.payair.hce.getDatabasePath getdatabasepath2 = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getAid, new com.payair.hce.databaseList((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getnobackupfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getnobackupfilesdir)), this.values, e3.writeReplace(), e3.getMessage()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath2, e3}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath2));
            this.DigitizedCardProfile.writeReplace(getdatabasepath2, AlternateContactlessPaymentDataJson());
        } catch (com.payair.hce.component5 e4) {
            java.lang.String str3 = (java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getnobackupfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getnobackupfilesdir));
            java.lang.String str4 = this.values;
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            a(new int[]{100, 23, 0, 2}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000", true, objArr8);
            java.lang.String intern4 = ((java.lang.String) objArr8[0]).intern();
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            a(new int[]{188, 31, 21, 8}, "\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000", false, objArr9);
            com.payair.hce.getDatabasePath getdatabasepath3 = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getAid, new com.payair.hce.databaseList(str3, str4, intern4, ((java.lang.String) objArr9[0]).intern()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath3, e4}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath3));
            this.DigitizedCardProfile.writeReplace(getdatabasepath3, AlternateContactlessPaymentDataJson());
        }
    }

    private java.util.ArrayList<com.payair.hce.isNetworkError> values(com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential[] transactionCredentialArr) throws java.security.GeneralSecurityException {
        com.payair.hce.setWallpaper setwallpaper = this;
        com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential[] transactionCredentialArr2 = transactionCredentialArr;
        java.util.ArrayList<com.payair.hce.isNetworkError> arrayList = new java.util.ArrayList<>(transactionCredentialArr2.length);
        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = setwallpaper.valueOf;
        final com.payair.hce.isSessionAvailable AlternateContactlessPaymentDataJson2 = ((com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast))).values().AlternateContactlessPaymentDataJson();
        com.payair.hce.setWallpaper.AlternateContactlessPaymentDataJson alternateContactlessPaymentDataJson = new com.payair.hce.setWallpaper.AlternateContactlessPaymentDataJson() { // from class: com.payair.hce.setWallpaper.4
            private static int getAid = 0;
            private static int getProfileVersion = 1;
            private byte[] DigitizedCardProfile;
            private byte[] valueOf;
            private byte[] values;

            public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i2;
                int i5 = ~i3;
                int i6 = (i * 677) + (i2 * (-675)) + ((i | i3 | i4) * (-676)) + (((~(i4 | i)) | (~(i5 | i))) * 676) + (((~((~i) | i4)) | (~(i4 | i5)) | (~(i2 | i | i3))) * 676);
                if (i6 != 1) {
                    return i6 != 2 ? i6 != 3 ? writeReplace(objArr) : values(objArr) : DigitizedCardProfile(objArr);
                }
                com.payair.hce.setWallpaper.AnonymousClass4 anonymousClass4 = (com.payair.hce.setWallpaper.AnonymousClass4) objArr[0];
                int i7 = getAid;
                int i8 = ((((i7 ^ 29) | (i7 & 29)) << 1) - ((i7 & (-30)) | ((~i7) & 29))) % 128;
                getProfileVersion = i8;
                byte[] bArr = anonymousClass4.DigitizedCardProfile;
                if (bArr == null) {
                    int i9 = i8 + 59;
                    getAid = i9 % 128;
                    int i10 = i9 % 2;
                    return new byte[0];
                }
                int i11 = (i7 | 25) << 1;
                int i12 = -(i7 ^ 25);
                getProfileVersion = ((i11 & i12) + (i11 | i12)) % 128;
                return bArr;
            }

            private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
                com.payair.hce.setWallpaper.AnonymousClass4 anonymousClass4 = (com.payair.hce.setWallpaper.AnonymousClass4) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                byte[] bArr2 = (byte[]) objArr[2];
                byte[] bArr3 = (byte[]) objArr[3];
                int i = getProfileVersion + 45;
                int i2 = i % 128;
                getAid = i2;
                if (i % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (bArr == null) {
                    anonymousClass4.valueOf = new byte[0];
                    getProfileVersion = ((-2) - (~(i2 + 60))) % 128;
                } else {
                    com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = com.payair.hce.setWallpaper.this.valueOf;
                    com.payair.hce.initializeVisaPaymentSdk writeReplace = ((com.payair.hce.onNewToken) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, 1288350908, -1288350905, java.lang.System.identityHashCode(sendorderedbroadcast2))).writeReplace(new com.payair.hce.checkAutomaticTimeSettings(bArr), AlternateContactlessPaymentDataJson2);
                    anonymousClass4.valueOf = (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{writeReplace}, -1877837077, 1877837077, java.lang.System.identityHashCode(writeReplace));
                    int i3 = getProfileVersion;
                    getAid = ((i3 ^ 115) + ((i3 & 115) << 1)) % 128;
                }
                if (bArr2 == null) {
                    int i4 = getAid + 47;
                    getProfileVersion = i4 % 128;
                    if (i4 % 2 == 0) {
                        anonymousClass4.DigitizedCardProfile = new byte[1];
                    } else {
                        anonymousClass4.DigitizedCardProfile = new byte[0];
                    }
                } else {
                    com.payair.hce.sendOrderedBroadcast sendorderedbroadcast3 = com.payair.hce.setWallpaper.this.valueOf;
                    com.payair.hce.initializeVisaPaymentSdk writeReplace2 = ((com.payair.hce.onNewToken) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast3}, 1288350908, -1288350905, java.lang.System.identityHashCode(sendorderedbroadcast3))).writeReplace(new com.payair.hce.checkAutomaticTimeSettings(bArr2), AlternateContactlessPaymentDataJson2);
                    anonymousClass4.DigitizedCardProfile = (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{writeReplace2}, -1877837077, 1877837077, java.lang.System.identityHashCode(writeReplace2));
                    int i5 = getAid;
                    int i6 = i5 & 125;
                    int i7 = -(-(i5 | 125));
                    getProfileVersion = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
                }
                if (bArr3 != null) {
                    com.payair.hce.sendOrderedBroadcast sendorderedbroadcast4 = com.payair.hce.setWallpaper.this.valueOf;
                    com.payair.hce.initializeVisaPaymentSdk writeReplace3 = ((com.payair.hce.onNewToken) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast4}, 1288350908, -1288350905, java.lang.System.identityHashCode(sendorderedbroadcast4))).writeReplace(new com.payair.hce.checkAutomaticTimeSettings(bArr3), AlternateContactlessPaymentDataJson2);
                    anonymousClass4.values = (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{writeReplace3}, -1877837077, 1877837077, java.lang.System.identityHashCode(writeReplace3));
                    int i8 = getProfileVersion;
                    getAid = ((i8 & 47) + (i8 | 47)) % 128;
                    return null;
                }
                int i9 = getProfileVersion;
                int i10 = i9 & 55;
                int i11 = ((i9 ^ 55) | i10) << 1;
                int i12 = -((~i10) & (i9 | 55));
                getAid = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
                anonymousClass4.values = new byte[0];
                int i13 = i9 & 17;
                int i14 = (i9 | 17) & (~i13);
                int i15 = i13 << 1;
                getAid = (((i14 | i15) << 1) - (i14 ^ i15)) % 128;
                return null;
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                com.payair.hce.setWallpaper.AnonymousClass4 anonymousClass4 = (com.payair.hce.setWallpaper.AnonymousClass4) objArr[0];
                int i = getProfileVersion;
                int i2 = i & 29;
                int i3 = (((((i ^ 29) | i2) << 1) - (~(-((~i2) & (i | 29))))) - 1) % 128;
                getAid = i3;
                byte[] bArr = anonymousClass4.valueOf;
                if (bArr != null) {
                    int i4 = i3 ^ 11;
                    int i5 = ((i3 & 11) | i4) << 1;
                    int i6 = -i4;
                    getProfileVersion = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
                    return bArr;
                }
                int i7 = i & 45;
                int i8 = (i ^ 45) | i7;
                int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
                getAid = i9 % 128;
                byte[] bArr2 = i9 % 2 != 0 ? new byte[1] : new byte[0];
                int i10 = ((i ^ 96) + ((i & 96) << 1)) - 1;
                getAid = i10 % 128;
                if (i10 % 2 == 0) {
                    return bArr2;
                }
                throw null;
            }

            private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
                com.payair.hce.setWallpaper.AnonymousClass4 anonymousClass4 = (com.payair.hce.setWallpaper.AnonymousClass4) objArr[0];
                int i = getProfileVersion;
                int i2 = i & 61;
                int i3 = (i ^ 61) | i2;
                int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
                int i5 = i4 % 128;
                getAid = i5;
                byte[] bArr = anonymousClass4.values;
                if (i4 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (bArr != null) {
                    getProfileVersion = (((i5 | 67) << 1) - (i5 ^ 67)) % 128;
                    return bArr;
                }
                int i6 = i ^ 5;
                int i7 = (i & 5) << 1;
                getAid = (((i6 | i7) << 1) - (i6 ^ i7)) % 128;
                byte[] bArr2 = new byte[0];
                int i8 = ((i & 42) + (i | 42)) - 1;
                getAid = i8 % 128;
                if (i8 % 2 == 0) {
                    return bArr2;
                }
                throw new java.lang.ArithmeticException();
            }

            @Override // com.payair.hce.setWallpaper.AlternateContactlessPaymentDataJson
            public final byte[] valueOf() {
                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -1532041060, 1532041063, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.setWallpaper.AlternateContactlessPaymentDataJson
            public final byte[] AlternateContactlessPaymentDataJson() {
                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -22259256, 22259257, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.setWallpaper.AlternateContactlessPaymentDataJson
            public final byte[] DigitizedCardProfile() {
                return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, 1321401762, -1321401760, java.lang.System.identityHashCode(this));
            }

            @Override // com.payair.hce.setWallpaper.AlternateContactlessPaymentDataJson
            public final void writeReplace(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
                DigitizedCardProfile(new java.lang.Object[]{this, bArr, bArr2, bArr3}, 770331046, -770331046, java.lang.System.identityHashCode(this));
            }
        };
        int i = 0;
        while (i < transactionCredentialArr2.length) {
            alternateContactlessPaymentDataJson.writeReplace(transactionCredentialArr2[i].getContactlessMdSessionKey(), transactionCredentialArr2[i].getContactlessUmdSingleUseKey(), transactionCredentialArr2[i].getContactlessUmdSessionKey());
            byte[] DigitizedCardProfile = alternateContactlessPaymentDataJson.DigitizedCardProfile();
            byte[] AlternateContactlessPaymentDataJson3 = alternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson();
            byte[] valueOf = alternateContactlessPaymentDataJson.valueOf();
            alternateContactlessPaymentDataJson.writeReplace(transactionCredentialArr2[i].getDsrpMdSessionKey(), transactionCredentialArr2[i].getDsrpUmdSingleUseKey(), transactionCredentialArr2[i].getDsrpUmdSessionKey());
            byte[] DigitizedCardProfile2 = alternateContactlessPaymentDataJson.DigitizedCardProfile();
            byte[] AlternateContactlessPaymentDataJson4 = alternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson();
            byte[] valueOf2 = alternateContactlessPaymentDataJson.valueOf();
            try {
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = setwallpaper.valueOf;
                com.payair.hce.initializeVisaPaymentSdk AlternateContactlessPaymentDataJson5 = ((com.payair.hce.onNewToken) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, 1288350908, -1288350905, java.lang.System.identityHashCode(sendorderedbroadcast2))).AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson2, new com.payair.hce.checkAutomaticTimeSettings(transactionCredentialArr2[i].getIdn()));
                arrayList.add(new com.payair.hce.setWallpaper.AnonymousClass1(AlternateContactlessPaymentDataJson3, AlternateContactlessPaymentDataJson4, DigitizedCardProfile, DigitizedCardProfile2, valueOf, valueOf2, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{AlternateContactlessPaymentDataJson5}, -1877837077, 1877837077, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson5)), transactionCredentialArr2[i].getAtc()));
                i++;
                getGpoResponse = (getCvrMaskAnd + 59) % 128;
                setwallpaper = this;
                transactionCredentialArr2 = transactionCredentialArr;
            } catch (java.security.GeneralSecurityException unused) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE, 65, 0, 59}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001", true, objArr);
                try {
                    java.lang.Object[] objArr2 = {((java.lang.String) objArr[0]).intern()};
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b("眚鵏\uf2fb䈋暞뱐ꌽᲬ㩐\ue0ce嶏\u16fc㐕䐦咆ㆳ软\udba8\uf606荧㛰岾ꌽᲬ㩐\ue0ce嶏\u16fc猀몤탣聹熭魫櫉핼蚸㸐", 37 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr3);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr3[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr2));
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        getCvrMaskAnd = (getGpoResponse + 95) % 128;
        return arrayList;
    }

    @Override // com.payair.hce.deleteDatabase
    final com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest values() throws java.security.GeneralSecurityException {
        com.payair.hce.getNoBackupFilesDir getnobackupfilesdir = (com.payair.hce.getNoBackupFilesDir) this.writeReplace;
        com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest writeReplace = writeReplace(values(new com.mastercard.mpsdk.remotemanagement.api.json.ReplenishRequestEncrypted(this.values, (java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getnobackupfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getnobackupfilesdir)), getnobackupfilesdir.DigitizedCardProfile()).buildAsJson()));
        getGpoResponse = (getCvrMaskAnd + 43) % 128;
        return writeReplace;
    }

    static void DigitizedCardProfile() {
        getAid = (char) 36841;
        RecordsJson = (char) 8039;
        getProfileVersion = (char) 28409;
        getPaymentFci = (char) 17602;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getGpoResponse = 0;
        getCvrMaskAnd = 1;
        DigitizedCardProfile();
        SdkCoreAlternateContactlessPaymentDataImpl = new char[]{16871, 16773, 16777, 16795, 16799, 16772, 16795, 16794, 16796, 16799, 16773, 16770, 16775, 16774, 16770, 16798, 16786, 16796, 16773, 16796, 16798, 16798, 16878, 16776, 16769, 16798, 16773, 16768, 16797, 16768, 16773, 16772, 16797, 16791, 16797, 16775, 16777, 16798, 16772, 16780, 16773, 16768, 16770, 16768, 16792, 16799, 16772, 16773, 16778, 16778, 16775, 16799, 16768, 16857, 16887, 16886, 16782, 16798, 16774, 16895, 16776, 16800, 16830, 16802, 16781, 16780, 16810, 16803, 16801, 16809, 16810, 16810, 16805, 16775, 16775, 16801, 16808, 16811, 16800, 16831, 16807, 16810, 16810, 16805, 16804, 16783, 16777, 16800, 16802, 16800, 16805, 16812, 16804, 16830, 16809, 16807, 16829, 16772, 16777, 16784, 16876, 16773, 16796, 16798, 16798, 16796, 16773, 16796, 16792, 16768, 16770, 16768, 16772, 16780, 16776, 16773, 16799, 16799, 16771, 16768, 16775, 16799, 16795, 16857, 16797, 16824, 16828, 16800, 16807, 16780, 16775, 16800, 16778, 16782, 16804, 16804, 16812, 16780, 16780, 16802, 16830, 16800, 16801, 16831, 16802, 16805, 16775, 16892, 16886, 16782, 16798, 16774, 16801, 16674, 16688, 16589, 16591, 16691, 16661, 16685, 16580, 16686, 16661, 16588, 16591, 16589, 16576, 16579, 16581, 16685, 16684, 16586, 16586, 16578, 16584, 16587, 16578, 16685, 16658, 16589, 16583, 16684, 16644, 16687, 16679, 16663, 16671, 16668, 16781, 16718, 16718, 16710, 16716, 16719, 16710, 16808, 16769, 16806, 16820, 16817, 16819, 16823, 16793, 16785, 16712, 16786, 16793, 16717, 16717, 16823, 16719, 16711, 16719, 16793, 16775, 16813, 16807, 16809, 16771, 16888, 16808, 16805, 16828, 16789, 16890, 16873, 16768, 16800, 16802, 16800, 16828, 16826, 16827, 16804, 16806, 16807, 16780, 16776, 16808, 16811, 16800, 16831, 16807, 16810, 16810, 16805, 16804, 16783, 16777, 16800, 16802, 16800, 16805, 16812, 16804, 16830, 16809, 16807, 16829, 16772, 16780, 16808, 16804, 16809, 16810, 16811, 16803, 16800, 16780, 16777, 16831, 16772, 16780, 16810, 16806, 16804, 16811, 16797, 16772, 16775, 16776, 16890, 16780, 16808};
    }

    static void init$0() {
        $$a = new byte[]{75, -78, -116, -102};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE;
    }
}
