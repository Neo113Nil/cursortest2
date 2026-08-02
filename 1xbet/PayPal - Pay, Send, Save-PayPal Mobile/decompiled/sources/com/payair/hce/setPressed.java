package com.payair.hce;

/* loaded from: classes4.dex */
public class setPressed {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static final int SdkCoreAlternateContactlessPaymentDataImpl = 0;
    private static long valueOf;
    private static final byte[] values = null;
    private static int writeReplace;
    private final android.content.SharedPreferences DigitizedCardProfile;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4 = s + 4;
        byte[] bArr = $$a;
        int i5 = i * 27;
        int i6 = 118 - (i2 * 19);
        byte[] bArr2 = new byte[i5 + 7];
        int i7 = i5 + 6;
        if (bArr == null) {
            int i8 = i4;
            int i9 = 0;
            int i10 = i7;
            i6 = (-i6) + i10;
            i4 = i8;
            i3 = i9;
            int i11 = i4 + 1;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = bArr[i11];
            i10 = i6;
            i6 = i12;
            i9 = i3 + 1;
            i8 = i11;
            i6 = (-i6) + i10;
            i4 = i8;
            i3 = i9;
            int i112 = i4 + 1;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1122 = i4 + 1;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = b + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        int i4 = s + 4;
        byte[] bArr = $$d;
        int i5 = (s2 * 3) + 1;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            int i7 = i4;
            int i8 = (-i4) + i6;
            i = i2;
            int i9 = i7;
            i3 = i8;
            i4 = i9;
            int i10 = i4 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i3;
            i7 = i10;
            i4 = bArr[i10];
            i6 = i11;
            int i82 = (-i4) + i6;
            i = i2;
            int i92 = i7;
            i3 = i82;
            i4 = i92;
            int i102 = i4 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            int i1022 = i4 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    final long writeReplace() {
        if (values() < 0) {
            int i = writeReplace + 81;
            AlternateContactlessPaymentDataJson = i % 128;
            if (i % 2 == 0) {
                return -1L;
            }
            throw null;
        }
        long values2 = values();
        AlternateContactlessPaymentDataJson = (writeReplace + 3) % 128;
        return values2;
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            $10 = ($11 + 59) % 128;
            int i2 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 30, 1890 - android.view.KeyEvent.normalizeMetaState(0), (char) (3599 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    byte b = (byte) ($$e - 4);
                    byte b2 = (byte) (b + 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(b, b2, (byte) (b2 + 1), objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i2] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (valueOf ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 1442 - android.view.MotionEvent.axisFromString(""), (char) (android.view.View.combineMeasuredStates(0, 0) + 29682));
                    byte b3 = (byte) ($$e - 4);
                    byte b4 = (byte) (b3 + 1);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d(b3, b4, b4, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                $10 = ($11 + 15) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            int i3 = $10 + 9;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
                java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1443, (char) (android.view.View.resolveSize(0, 0) + 29682));
                    byte b5 = (byte) ($$e - 4);
                    byte b6 = (byte) (b5 + 1);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    d(b5, b6, b6, objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
                throw null;
            }
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr8 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj4 == null) {
                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.view.Gravity.getAbsoluteGravity(0, 0) + 1443, (char) (29682 - android.view.Gravity.getAbsoluteGravity(0, 0)));
                byte b7 = (byte) ($$e - 4);
                byte b8 = (byte) (b7 + 1);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                d(b7, b8, b8, objArr9);
                obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: com.payair.hce.setPressed$4, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass4 {
        private static int DigitizedCardProfile = 0;
        static final /* synthetic */ int[] valueOf;
        private static int writeReplace = 1;

        static {
            int[] iArr = new int[com.payair.hce.getMDESCardsUniqueTokenReferences.values().length];
            valueOf = iArr;
            try {
                iArr[com.payair.hce.getMDESCardsUniqueTokenReferences.values.ordinal()] = 1;
                int i = DigitizedCardProfile;
                writeReplace = ((-2) - (~((i & 72) + (i | 72)))) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }

    final void DigitizedCardProfile(com.payair.hce.getMDESCardsUniqueTokenReferences getmdescardsuniquetokenreferences) {
        writeReplace = (AlternateContactlessPaymentDataJson + 25) % 128;
        if (com.payair.hce.setPressed.AnonymousClass4.valueOf[getmdescardsuniquetokenreferences.ordinal()] == 1) {
            DigitizedCardProfile();
        }
        int i = AlternateContactlessPaymentDataJson + 85;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private void DigitizedCardProfile() {
        int i = writeReplace + 17;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            DigitizedCardProfile(-1L);
        } else {
            DigitizedCardProfile(-1L);
            throw new java.lang.ArithmeticException();
        }
    }

    setPressed(android.content.Context context) {
        this.DigitizedCardProfile = context.getSharedPreferences("SharedCvmPlugin", 0);
    }

    final void DigitizedCardProfile(long j) {
        AlternateContactlessPaymentDataJson = (writeReplace + 17) % 128;
        com.payair.hce.setLeft.values(new java.lang.Object[]{"LastAuthTime", java.lang.Long.valueOf(j), this.DigitizedCardProfile}, 177851831, -177851815, (int) java.lang.System.currentTimeMillis());
        int i = AlternateContactlessPaymentDataJson + 3;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private long values() {
        int i = AlternateContactlessPaymentDataJson + 23;
        writeReplace = i % 128;
        if (i % 2 != 0) {
            return ((java.lang.Long) com.payair.hce.setLeft.values(new java.lang.Object[]{"LastAuthTime", this.DigitizedCardProfile}, -925749527, 925749527, (int) java.lang.System.currentTimeMillis())).longValue();
        }
        throw null;
    }

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setPressed setpressed = (com.payair.hce.setPressed) objArr[0];
        writeReplace = (AlternateContactlessPaymentDataJson + 1) % 128;
        if (setpressed.writeReplace() < 0) {
            writeReplace = (AlternateContactlessPaymentDataJson + 71) % 128;
            return bool;
        }
        if (setpressed.writeReplace() <= java.lang.System.currentTimeMillis() - 90000) {
            return bool;
        }
        AlternateContactlessPaymentDataJson = (writeReplace + 59) % 128;
        return java.lang.Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0572  */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void writeReplace(long j, long j2) {
        int valueOf2;
        ?? r12;
        java.lang.Object obj;
        java.lang.Object method;
        java.lang.Object obj2;
        java.lang.String str;
        com.payair.hce.setClipToOutline setcliptooutline = new com.payair.hce.setClipToOutline(j, j2);
        byte[] bArr = values;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((short) 392, 550, (byte) (-bArr[455]), objArr);
        java.lang.String str2 = (java.lang.String) objArr[0];
        char c = '2';
        short s = bArr[50];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(s, (short) (s | 158), (short) 74, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c2 = 474;
            short s2 = bArr[474];
            char c3 = 25;
            byte b = bArr[25];
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            int i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
            a(s2, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, b, objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            short s3 = bArr[4];
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(s3, (short) (s3 | 139), bArr[67], objArr5);
            java.lang.String str3 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(bArr[474], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, bArr[25], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str2, objArr3);
            int[] iArr = new int[objArr7.length];
            int i2 = 0;
            while (i2 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i2]};
                byte[] bArr2 = values;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a((short) (-bArr2[434]), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, bArr2[25], objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                short s4 = bArr2[12];
                byte b2 = bArr2[c];
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(s4, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, b2, objArr10);
                java.lang.String str4 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(bArr2[c2], com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, bArr2[25], objArr11);
                java.lang.Object invoke = cls2.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a((short) (-bArr2[434]), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, bArr2[25], objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(bArr2[17], 117, bArr2[402], objArr13);
                iArr[i2] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i2++;
                c = '2';
                c2 = 474;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                try {
                    valueOf2 = setcliptooutline.valueOf(iArr[i3]);
                    i3 = 14;
                    r12 = 36;
                } catch (java.lang.Throwable th) {
                    th = th;
                }
                switch (valueOf2) {
                    case -36:
                        i3 = 112;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -35:
                        setcliptooutline.valueOf(36);
                        int i5 = setcliptooutline.valueOf;
                        i3 = (i5 == 0 || i5 != 1) ? 82 : 19;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -34:
                        i3 = 107;
                    case -33:
                        try {
                            setcliptooutline.valueOf(36);
                            i3 = setcliptooutline.valueOf != 14 ? 65 : 1;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i4 >= 19) {
                                break;
                            }
                            throw th;
                        }
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -32:
                        i3 = 113;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -31:
                        i3 = 115;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -30:
                        setcliptooutline.valueOf(27);
                        if (setcliptooutline.valueOf == 0) {
                            i3 = 81;
                            c3 = 25;
                            i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                        }
                        i3 = i4;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -29:
                        i3 = 108;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -28:
                        i3 = 110;
                    case -27:
                        setcliptooutline.valueOf(27);
                        if (setcliptooutline.valueOf == 0) {
                            i3 = 64;
                            c3 = 25;
                            i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                        }
                        i3 = i4;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -26:
                        setcliptooutline.DigitizedCardProfile = 1;
                        setcliptooutline.valueOf(2);
                        setcliptooutline.valueOf(3);
                        AlternateContactlessPaymentDataJson = setcliptooutline.valueOf;
                        i3 = i4;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -25:
                        try {
                            setcliptooutline.DigitizedCardProfile = writeReplace;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                        }
                        try {
                            setcliptooutline.valueOf(4);
                            i3 = i4;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            if (i4 >= 19) {
                            }
                            throw th;
                        }
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                        break;
                    case -24:
                        i3 = 73;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -23:
                        i3 = 54;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -22:
                        return;
                    case -21:
                        byte b3 = (byte) ($$a[23] - 1);
                        byte b4 = b3;
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        c(b3, b4, (byte) (b4 | 32), objArr14);
                        obj = (java.lang.String) objArr14[0];
                        setcliptooutline.getProfileVersion = obj;
                        setcliptooutline.valueOf(1);
                        i3 = i4;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -20:
                        setcliptooutline.DigitizedCardProfile = 1;
                        setcliptooutline.valueOf(2);
                        setcliptooutline.valueOf(7);
                        obj = java.lang.Class.forName((java.lang.String) setcliptooutline.getAid);
                        setcliptooutline.getProfileVersion = obj;
                        setcliptooutline.valueOf(1);
                        i3 = i4;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        try {
                            byte b5 = $$a[23];
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            c(b5, b5, r0[34], objArr15);
                            obj = (java.lang.String) objArr15[0];
                            setcliptooutline.getProfileVersion = obj;
                            setcliptooutline.valueOf(1);
                            i3 = i4;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            if (i4 >= 19) {
                            }
                            throw th;
                        }
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                        break;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        try {
                            setcliptooutline.DigitizedCardProfile = 3;
                            setcliptooutline.valueOf(2);
                            setcliptooutline.valueOf(7);
                            java.lang.Object obj3 = setcliptooutline.getAid;
                            setcliptooutline.valueOf(7);
                            java.lang.Object obj4 = setcliptooutline.getAid;
                            setcliptooutline.valueOf(7);
                            try {
                                java.lang.Object[] objArr16 = {obj4, setcliptooutline.getAid};
                                byte[] bArr3 = values;
                                short s5 = bArr3[436];
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                a(s5, (short) (s5 + 5), bArr3[c3], objArr17);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                                short s6 = bArr3[7];
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                a(s6, s6, bArr3[402], objArr18);
                                java.lang.String str5 = (java.lang.String) objArr18[0];
                                java.lang.Class<?>[] clsArr = new java.lang.Class[2];
                                try {
                                    short s7 = bArr3[474];
                                    short s8 = bArr3[1];
                                    byte b6 = bArr3[c3];
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    a(s7, s8, b6, objArr19);
                                    clsArr[0] = java.lang.Class.forName((java.lang.String) objArr19[0]);
                                    try {
                                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                                        a(bArr3[454], bArr3[50], bArr3[424], objArr20);
                                        clsArr[1] = java.lang.Class.forName((java.lang.String) objArr20[0]);
                                        obj = cls4.getMethod(str5, clsArr).invoke(obj3, objArr16);
                                        setcliptooutline.getProfileVersion = obj;
                                        setcliptooutline.valueOf(1);
                                        i3 = i4;
                                    } catch (java.lang.Throwable th6) {
                                        th = th6;
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                }
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                            }
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                            if (i4 >= 19) {
                            }
                            throw th;
                        }
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                        break;
                    case -17:
                        setcliptooutline.DigitizedCardProfile = 3;
                        setcliptooutline.valueOf(2);
                        setcliptooutline.valueOf(7);
                        java.lang.Class cls5 = (java.lang.Class) setcliptooutline.getAid;
                        setcliptooutline.valueOf(7);
                        java.lang.String str6 = (java.lang.String) setcliptooutline.getAid;
                        setcliptooutline.valueOf(7);
                        method = cls5.getMethod(str6, (java.lang.Class[]) setcliptooutline.getAid);
                        setcliptooutline.getProfileVersion = method;
                        setcliptooutline.valueOf(1);
                        i3 = i4;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -16:
                        byte[] bArr4 = values;
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        a(bArr4[474], i, bArr4[c3], objArr21);
                        method = java.lang.Class.forName((java.lang.String) objArr21[0]);
                        setcliptooutline.getProfileVersion = method;
                        setcliptooutline.valueOf(1);
                        i3 = i4;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -15:
                        setcliptooutline.DigitizedCardProfile = 1;
                        setcliptooutline.valueOf(2);
                        setcliptooutline.valueOf(3);
                        setcliptooutline.getProfileVersion = new java.lang.Class[setcliptooutline.valueOf];
                        setcliptooutline.valueOf(1);
                        i3 = i4;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -14:
                        method = "DigitizedCardProfile";
                        setcliptooutline.getProfileVersion = method;
                        setcliptooutline.valueOf(1);
                        i3 = i4;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -13:
                        method = com.payair.hce.setLongClickable.class;
                        setcliptooutline.getProfileVersion = method;
                        setcliptooutline.valueOf(1);
                        i3 = i4;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -12:
                        setcliptooutline.DigitizedCardProfile = 1;
                        setcliptooutline.valueOf(2);
                        setcliptooutline.valueOf(3);
                        int i6 = setcliptooutline.valueOf;
                        byte[] bArr5 = values;
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        a(bArr5[474], bArr5[1], bArr5[c3], objArr22);
                        method = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr22[0]), i6);
                        setcliptooutline.getProfileVersion = method;
                        setcliptooutline.valueOf(1);
                        i3 = i4;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -11:
                        setcliptooutline.valueOf(11);
                        throw ((java.lang.Throwable) setcliptooutline.getAid);
                    case -10:
                        i3 = 17;
                    case -9:
                    case -8:
                        try {
                            setcliptooutline.valueOf(9);
                        } catch (java.lang.Throwable th10) {
                            th = th10;
                            if (i4 >= 19) {
                            }
                            throw th;
                        }
                        if (setcliptooutline.valueOf == 0) {
                            i3 = 13;
                        } else {
                            i3 = i4;
                            c3 = 25;
                            i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                        }
                        break;
                    case -7:
                        try {
                            setcliptooutline.DigitizedCardProfile = 1;
                            setcliptooutline.valueOf(2);
                            setcliptooutline.valueOf(7);
                            obj2 = setcliptooutline.getAid;
                        } catch (java.lang.Throwable th11) {
                            th = th11;
                            r12 = 0;
                            if ((i4 >= 19 || i4 > 37) && ((i4 < 37 || i4 > 47) && ((i4 < 82 || i4 > 98) && (i4 < 98 || i4 > 107)))) {
                                throw th;
                            }
                            setcliptooutline.getProfileVersion = th;
                            setcliptooutline.valueOf(40);
                            i3 = 8;
                            c3 = 25;
                            i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                        }
                        try {
                            byte[] bArr6 = values;
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a(bArr6[454], bArr6[535], bArr6[c3], objArr23);
                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                            try {
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                a(bArr6[17], (short) (bArr6[460] + 1), bArr6[474], objArr24);
                                try {
                                    method = cls6.getMethod((java.lang.String) objArr24[0], null).invoke(obj2, null);
                                    setcliptooutline.getProfileVersion = method;
                                    setcliptooutline.valueOf(1);
                                    i3 = i4;
                                    c3 = 25;
                                    i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                                } catch (java.lang.Throwable th12) {
                                    th = th12;
                                    java.lang.Throwable cause2 = th.getCause();
                                    if (cause2 == null) {
                                        throw th;
                                    }
                                    throw cause2;
                                }
                            } catch (java.lang.Throwable th13) {
                                th = th13;
                            }
                        } catch (java.lang.Throwable th14) {
                            th = th14;
                        }
                        break;
                    case -6:
                        i3 = 51;
                    case -5:
                        try {
                            setcliptooutline.DigitizedCardProfile = 1;
                            setcliptooutline.valueOf(2);
                            setcliptooutline.valueOf(7);
                            java.lang.Object obj5 = setcliptooutline.getAid;
                            try {
                                byte[] bArr7 = values;
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                a(bArr7[474], i, bArr7[c3], objArr25);
                                java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                                try {
                                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                                    a(bArr7[7], (short) (-bArr7[455]), bArr7[402], objArr26);
                                    try {
                                        setcliptooutline.getProfileVersion = cls7.getMethod((java.lang.String) objArr26[0], null).invoke(obj5, null);
                                        setcliptooutline.valueOf(1);
                                        i3 = i4;
                                    } catch (java.lang.Throwable th15) {
                                        th = th15;
                                        if (i4 >= 19) {
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th16) {
                                    th = th16;
                                    java.lang.Throwable cause3 = th.getCause();
                                    if (cause3 == null) {
                                        throw th;
                                    }
                                    throw cause3;
                                }
                            } catch (java.lang.Throwable th17) {
                                th = th17;
                            }
                        } catch (java.lang.Throwable th18) {
                            th = th18;
                        }
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                        break;
                    case -4:
                        setcliptooutline.DigitizedCardProfile = 2;
                        setcliptooutline.valueOf(2);
                        setcliptooutline.valueOf(7);
                        java.lang.String str7 = (java.lang.String) setcliptooutline.getAid;
                        setcliptooutline.valueOf(3);
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        b(str7, setcliptooutline.valueOf, objArr27);
                        str = (java.lang.String) objArr27[0];
                        setcliptooutline.getProfileVersion = str;
                        setcliptooutline.valueOf(1);
                        i3 = i4;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -3:
                        setcliptooutline.DigitizedCardProfile = 1;
                        setcliptooutline.valueOf(2);
                        setcliptooutline.valueOf(3);
                        try {
                            java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(setcliptooutline.valueOf)};
                            byte[] bArr8 = values;
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            a(bArr8[458], 110, bArr8[397], objArr29);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr29[0]);
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            a(bArr8[470], (short) (bArr8[0] + 1), bArr8[20], objArr30);
                            setcliptooutline.DigitizedCardProfile = ((java.lang.Integer) cls8.getMethod((java.lang.String) objArr30[0], java.lang.Integer.TYPE).invoke(null, objArr28)).intValue();
                            setcliptooutline.valueOf(4);
                            i3 = i4;
                            c3 = 25;
                            i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                        } catch (java.lang.Throwable th19) {
                            java.lang.Throwable cause4 = th19.getCause();
                            if (cause4 == null) {
                                throw th19;
                            }
                            throw cause4;
                        }
                    case -2:
                        str = "蕵캄ና";
                        setcliptooutline.getProfileVersion = str;
                        setcliptooutline.valueOf(1);
                        i3 = i4;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                    case -1:
                        i3 = 47;
                    default:
                        i3 = i4;
                        c3 = 25;
                        i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                }
            }
            throw th;
        } catch (java.lang.Throwable th20) {
            java.lang.Throwable cause5 = th20.getCause();
            if (cause5 == null) {
                throw th20;
            }
            throw cause5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = 118 - s2;
        byte[] bArr = values;
        int i4 = 554 - i;
        byte[] bArr2 = new byte[s + 1];
        if (bArr == null) {
            int i5 = i3;
            int i6 = 0;
            i3 = i4;
            i4++;
            i3 += i5;
            i2 = i6;
            bArr2[i2] = (byte) i3;
            int i7 = i2 + 1;
            if (i2 == s) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = bArr[i4];
            i6 = i7;
            i4++;
            i3 += i5;
            i2 = i6;
            bArr2[i2] = (byte) i3;
            int i72 = i2 + 1;
            if (i2 == s) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            int i722 = i2 + 1;
            if (i2 == s) {
            }
        }
    }

    static void valueOf() {
        byte[] bArr = new byte[572];
        java.lang.System.arraycopy("Y+b½\u0004û\u0001\u0005ú\t÷\u0001\u0006ù\nö\u0001\u0007ø\u0001\b÷\u0001\tö\fô\u0001\nõ\fô\u0001\u000bô\u0001\fó\u0001\u0004ÿü\u0005ÿü\u0005\u0001ú\u0001\u0004\u0000û\u0005\u0001ú\u0001\u0004\u0000û\u0005\u0002ù\u0001\u0004\u0001ú\u0005\u0003ø\u0005\u0004÷\u0005\u0005ö\u0001\u0004\u0002ù\u0001\u0004\u0003ø\u0005\u0002ù\u0001\u0004\u0004÷\u0005\u0006õ\u0001\u0004\u0005ö\u0005\u0005ö\u0001\u0004\u0006õ\u0005ÿü\u0005\u0007ô\u0005ÿü\u0001\u0004\u0007ô\u0005\u0001ú\u0001\u0004\bó\u0001\u0005þü\u0001\u0005ÿû\u0005\u0007ô\u0001\u0004\u0006õ\u0005\u0007ô\u0005\u0007ô\u0001\u0004\u0007ô\u0005\u0001ú\u0001\u0005\u0000ú\u0005\bó\u0006þü\u0005\u0001ú\u0001\u0005\u0001ù\u0006ÿû\u0005\u0001ú\u0001\u0005\u0002ø\u0001\u0005\u0003÷\u0006\u0000ú\u0006\u0001ù\u0006\u0002ø\u0006\u0003÷\u0001\u0005\u0004ö\u0005\bó\u0006\u0004ö\u0001\u0005\u0005õ\u0001\u0005\u0006ô\u0001\u0005\u0007ó\u0001\u0005ú\u0006\u0006ô\u0005\u0002ù\u0001\u0006ù\u0006\u0007ó\u0001\u0007ø\u0001\b÷\u0001\tö\u0001\u0005\u0003÷\u0007ýü\u0007þû\u0001\u0005\u0004ö\u0005\bó\u0006\u0004ö\u0001\u0006ýü\u0001\u0006þû\u0001\u0006ÿú\u0005\u0002ù\u0001\u0004\u0001ú\u0007ÿú\u0007\u0000ù\u0005\u0005ö\u0001\u0004\u0002ù\u0001\u0004\u0003ø\u0005\u0002ù\u0001\u0004\u0004÷\u0005\u0006õ\u0001\u0004\u0005ö\u0005\u0005ö\u0001\u0004\u0006õ\u0007\u0001ø\u0001\u0004\u0007ô\u0005\u0001ú\u0001\u0004\bó\u0001\u0005þü\u0001\u0005ÿû\u0005\u0007ô\u0001\u0004\u0006õ\u0007\u0002÷\u0001\u0004\u0007ô\u0005\u0001ú\u0001\u0005\u0000ú\u0001\u0006\u0000ù\u0007\u0004õ\u0001\u0006\u0001ø\u0007\u0005ô\u0001\u0006\u0001ø\u0001\u0006\u0002÷\u0005\u0002ù\u0001\u0006\u0003ö\u0007\u0006ó\u0001\u0006\u0003÷\u0015ëÍ>õ\rùÇ%!þ÷\u0005ùýüý\u000b÷\u0015ëÍ>õ\rùÇ\u001b%\u0006ñ\u0002þ\rë\u000b\tðê\u0017\u0005\u0006â\u000b\u000b\tð\rö\u000eýúûÊHóü\u0012·\u001d\u001a\u0014Ì1ï\t\u0006\u0001\u0003ûô\u000bý\u0011ëè\u0018\u000fíò!í\u0013ñ\u0005\u0006ñ\rü÷\u0015ëÍ>õ\rùÇ&\u0014\ný\bê\u0001\nùþ\u000fÏ\u001e\u0014þò÷\u0015ëÍ>õ\rùÇ!\u0013\bûþ\u0011÷\u0015ëÍ>õ\rùÇDó\u0001\u0006ùþ\u0011º\u001f\u0018\u000fô\u0007õ\u0005\bùüúñ\u001e÷\u0015ëÍ>õ\rùÇ!\u0013\bûþ\u0011Ç".getBytes("ISO-8859-1"), 0, bArr, 0, 572);
        values = bArr;
        SdkCoreAlternateContactlessPaymentDataImpl = 211;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        valueOf();
        AlternateContactlessPaymentDataJson = 0;
        writeReplace = 1;
        valueOf = 7751214128668668878L;
    }

    static void init$1() {
        $$d = new byte[]{92, 89, -124, 123};
        $$e = 3;
    }

    static void init$0() {
        $$a = new byte[]{104, -39, -34, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, 14, -15, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -44, 1, -6, com.google.common.base.Ascii.SI, -19, 4, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -41, 3, 6, -8, 10, -1, -10, 7, com.google.common.base.Ascii.NAK, -11, -9, 16, com.google.common.base.Ascii.SYN, -23};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
    }

    final boolean AlternateContactlessPaymentDataJson() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1199835196, -1199835196, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
