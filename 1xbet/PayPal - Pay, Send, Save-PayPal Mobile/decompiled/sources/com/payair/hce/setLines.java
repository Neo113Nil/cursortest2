package com.payair.hce;

/* loaded from: classes4.dex */
public class setLines extends java.lang.IllegalStateException {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static final byte[] AlternateContactlessPaymentDataJson = null;
    private static long DigitizedCardProfile;
    private static final int IccPrivateKeyCrtComponentsJson = 0;
    private static int valueOf;
    private static int writeReplace;
    private java.lang.Throwable values;

    private static void c(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2 = (s * 19) + 99;
        int i3 = s2 + 4;
        byte[] bArr = $$a;
        int i4 = i * 27;
        byte[] bArr2 = new byte[34 - i4];
        int i5 = 33 - i4;
        int i6 = -1;
        if (bArr == null) {
            int i7 = i3 + (-i5);
            i3 = i3;
            i2 = i7;
        }
        while (true) {
            i6++;
            int i8 = i3 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3 = i8;
            i2 += -bArr[i8];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3 = b + 112;
        int i4 = i * 4;
        byte[] bArr = $$d;
        int i5 = 4 - (b2 * 3);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i5++;
            i3 += i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i5];
            i5++;
            i3 += i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    public setLines(java.lang.String str) {
        super(str);
    }

    public setLines(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.values = th;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        int i = (writeReplace + 105) % 128;
        valueOf = i;
        java.lang.Throwable th = this.values;
        writeReplace = (i + 45) % 128;
        return th;
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i2 = $11 + 83;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
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
            int i3 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1889, (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 3600));
                    byte b = (byte) ($$e & 3);
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (DigitizedCardProfile ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 64, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1442, (char) (29682 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d((byte) 0, 0, (byte) 0, objArr5);
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
            $11 = ($10 + 49) % 128;
            cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.view.View.MeasureSpec.getSize(0), 1443 - android.view.View.getDefaultSize(0, 0), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29681));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                d((byte) 0, 0, (byte) 0, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            $11 = ($10 + 27) % 128;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a4 A[Catch: all -> 0x03df, TryCatch #16 {all -> 0x03df, blocks: (B:155:0x039e, B:157:0x03a4, B:158:0x03a5, B:61:0x03ac, B:168:0x03c7), top: B:60:0x03ac }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03a5 A[Catch: all -> 0x03df, TryCatch #16 {all -> 0x03df, blocks: (B:155:0x039e, B:157:0x03a4, B:158:0x03a5, B:61:0x03ac, B:168:0x03c7), top: B:60:0x03ac }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x049a A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void writeReplace(long j, long j2) {
        ?? r13;
        int i;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Throwable cause;
        char c;
        int i2;
        com.payair.hce.setOverflowIcon setoverflowicon = new com.payair.hce.setOverflowIcon(j, j2);
        byte[] bArr = AlternateContactlessPaymentDataJson;
        byte b = bArr[42];
        int i3 = IccPrivateKeyCrtComponentsJson;
        int i4 = 1;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, (short) 398, (short) (i3 | 131), objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        byte b2 = bArr[46];
        byte b3 = b2;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(b3, (short) (b3 | 143), b2, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c2 = 263;
            char c3 = 290;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((byte) (-bArr[263]), com.visa.cbp.setDeviceName.getOutputSizeshNQ4ISI, bArr[290], objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((byte) (bArr[390] + 1), (short) (i3 + 4), bArr[43], objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a((byte) (-bArr[263]), com.visa.cbp.setDeviceName.getOutputSizeshNQ4ISI, bArr[290], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i5 = 0;
            while (i5 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i5]};
                byte[] bArr2 = AlternateContactlessPaymentDataJson;
                byte b4 = (byte) (-bArr2[263]);
                int i6 = IccPrivateKeyCrtComponentsJson;
                short s = (short) i6;
                java.lang.Object[] objArr9 = new java.lang.Object[i4];
                a(b4, s, bArr2[297], objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                java.lang.Object[] objArr10 = new java.lang.Object[i4];
                a(bArr2[i4], (short) (i6 & 495), bArr2[8], objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                java.lang.Class<?>[] clsArr = new java.lang.Class[i4];
                byte b5 = (byte) (-bArr2[263]);
                short s2 = bArr2[c3];
                java.lang.Object[] objArr11 = new java.lang.Object[i4];
                a(b5, com.visa.cbp.setDeviceName.getOutputSizeshNQ4ISI, s2, objArr11);
                clsArr[0] = java.lang.Class.forName((java.lang.String) objArr11[0]);
                java.lang.Object invoke = cls2.getMethod(str3, clsArr).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a((byte) (-bArr2[263]), s, bArr2[297], objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(61, (short) 102, bArr2[11], objArr13);
                iArr[i5] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i5++;
                i4 = 1;
                c3 = 290;
            }
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                try {
                    r13 = 28;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (i8 >= 20) {
                    }
                    throw th;
                }
                switch (setoverflowicon.AlternateContactlessPaymentDataJson(iArr[i7])) {
                    case -33:
                        i7 = 1;
                        c2 = 263;
                    case -32:
                        i7 = 76;
                        c2 = 263;
                    case -31:
                        setoverflowicon.AlternateContactlessPaymentDataJson(28);
                        if (setoverflowicon.AlternateContactlessPaymentDataJson == 0) {
                            i7 = 75;
                            c2 = 263;
                        }
                        i7 = i8;
                        c2 = 263;
                    case -30:
                        i7 = 20;
                        c2 = 263;
                    case -29:
                        i7 = 64;
                        c2 = 263;
                    case -28:
                        try {
                            setoverflowicon.AlternateContactlessPaymentDataJson(28);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i8 >= 20) {
                            }
                            throw th;
                        }
                        if (setoverflowicon.AlternateContactlessPaymentDataJson == 0) {
                            i7 = 63;
                            c2 = 263;
                        }
                        i7 = i8;
                        c2 = 263;
                        break;
                    case -27:
                        try {
                            setoverflowicon.DigitizedCardProfile = 1;
                            setoverflowicon.AlternateContactlessPaymentDataJson(6);
                            setoverflowicon.AlternateContactlessPaymentDataJson(8);
                            valueOf = setoverflowicon.AlternateContactlessPaymentDataJson;
                            i7 = i8;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            if ((i8 >= 20 || i8 > 37) && (i8 < 37 || i8 > 47)) {
                                throw th;
                            }
                            setoverflowicon.SdkCoreAlternateContactlessPaymentDataImpl = th;
                            setoverflowicon.AlternateContactlessPaymentDataJson(33);
                            i7 = 10;
                            c2 = 263;
                        }
                        c2 = 263;
                    case -26:
                        i = writeReplace;
                        setoverflowicon.DigitizedCardProfile = i;
                        setoverflowicon.AlternateContactlessPaymentDataJson(2);
                        i7 = i8;
                        c2 = 263;
                    case -25:
                        i7 = 55;
                        c2 = 263;
                    case -24:
                        i7 = 65;
                        c2 = 263;
                    case -23:
                        return;
                    case -22:
                        try {
                            byte b6 = $$a[23];
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            c(b6, b6, (byte) ($$b & 48), objArr14);
                            obj = (java.lang.String) objArr14[0];
                            setoverflowicon.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                            i2 = 1;
                            setoverflowicon.AlternateContactlessPaymentDataJson(i2);
                            i7 = i8;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            if (i8 >= 20) {
                            }
                            throw th;
                        }
                        c2 = 263;
                        break;
                    case -21:
                        setoverflowicon.DigitizedCardProfile = 1;
                        setoverflowicon.AlternateContactlessPaymentDataJson(6);
                        setoverflowicon.AlternateContactlessPaymentDataJson(7);
                        obj = java.lang.Class.forName((java.lang.String) setoverflowicon.IccPrivateKeyCrtComponentsJson);
                        setoverflowicon.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                        i2 = 1;
                        setoverflowicon.AlternateContactlessPaymentDataJson(i2);
                        i7 = i8;
                        c2 = 263;
                    case -20:
                        try {
                            byte b7 = (byte) ($$a[23] - 1);
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            c(b7, b7, r0[34], objArr15);
                            obj = (java.lang.String) objArr15[0];
                            setoverflowicon.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                            i2 = 1;
                            setoverflowicon.AlternateContactlessPaymentDataJson(i2);
                            i7 = i8;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            if (i8 >= 20) {
                            }
                            throw th;
                        }
                        c2 = 263;
                        break;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        try {
                            setoverflowicon.DigitizedCardProfile = 3;
                            setoverflowicon.AlternateContactlessPaymentDataJson(6);
                            setoverflowicon.AlternateContactlessPaymentDataJson(7);
                            obj2 = setoverflowicon.IccPrivateKeyCrtComponentsJson;
                            setoverflowicon.AlternateContactlessPaymentDataJson(7);
                            obj3 = setoverflowicon.IccPrivateKeyCrtComponentsJson;
                            setoverflowicon.AlternateContactlessPaymentDataJson(7);
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            if (i8 >= 20) {
                            }
                            throw th;
                        }
                        try {
                            java.lang.Object[] objArr16 = {obj3, setoverflowicon.IccPrivateKeyCrtComponentsJson};
                            byte[] bArr3 = AlternateContactlessPaymentDataJson;
                            byte b8 = (byte) (-bArr3[c2]);
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            a(b8, (short) (b8 & 93), (short) (-bArr3[299]), objArr17);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                            short s3 = bArr3[5];
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            a(61, s3, s3, objArr18);
                            java.lang.String str4 = (java.lang.String) objArr18[0];
                            java.lang.Class<?>[] clsArr2 = new java.lang.Class[2];
                            try {
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                a((byte) (-bArr3[c2]), (short) 43, bArr3[290], objArr19);
                                clsArr2[0] = java.lang.Class.forName((java.lang.String) objArr19[0]);
                                try {
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    a((byte) (bArr3[338] + 1), bArr3[46], (short) (-bArr3[317]), objArr20);
                                    clsArr2[1] = java.lang.Class.forName((java.lang.String) objArr20[0]);
                                    obj = cls4.getMethod(str4, clsArr2).invoke(obj2, objArr16);
                                    setoverflowicon.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                                    i2 = 1;
                                    setoverflowicon.AlternateContactlessPaymentDataJson(i2);
                                    i7 = i8;
                                    c2 = 263;
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                    cause = th.getCause();
                                    if (cause != null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } catch (java.lang.Throwable th8) {
                                th = th8;
                                cause = th.getCause();
                                if (cause != null) {
                                }
                            }
                        } catch (java.lang.Throwable th9) {
                            th = th9;
                        }
                        break;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        c = 143;
                        setoverflowicon.DigitizedCardProfile = 3;
                        setoverflowicon.AlternateContactlessPaymentDataJson(6);
                        setoverflowicon.AlternateContactlessPaymentDataJson(7);
                        java.lang.Class cls5 = (java.lang.Class) setoverflowicon.IccPrivateKeyCrtComponentsJson;
                        setoverflowicon.AlternateContactlessPaymentDataJson(7);
                        java.lang.String str5 = (java.lang.String) setoverflowicon.IccPrivateKeyCrtComponentsJson;
                        setoverflowicon.AlternateContactlessPaymentDataJson(7);
                        obj = cls5.getMethod(str5, (java.lang.Class[]) setoverflowicon.IccPrivateKeyCrtComponentsJson);
                        setoverflowicon.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                        i2 = 1;
                        setoverflowicon.AlternateContactlessPaymentDataJson(i2);
                        i7 = i8;
                        c2 = 263;
                    case -17:
                        try {
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            c = 143;
                            try {
                                a((byte) (-AlternateContactlessPaymentDataJson[c2]), com.visa.cbp.setDeviceName.getOutputSizeshNQ4ISI, r0[290], objArr21);
                                obj = java.lang.Class.forName((java.lang.String) objArr21[0]);
                                setoverflowicon.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                                i2 = 1;
                                setoverflowicon.AlternateContactlessPaymentDataJson(i2);
                                i7 = i8;
                            } catch (java.lang.Throwable th10) {
                                th = th10;
                                if (i8 >= 20) {
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th11) {
                            th = th11;
                            c = 143;
                        }
                        c2 = 263;
                        break;
                    case -16:
                        setoverflowicon.DigitizedCardProfile = 1;
                        setoverflowicon.AlternateContactlessPaymentDataJson(6);
                        setoverflowicon.AlternateContactlessPaymentDataJson(8);
                        setoverflowicon.SdkCoreAlternateContactlessPaymentDataImpl = new java.lang.Class[setoverflowicon.AlternateContactlessPaymentDataJson];
                        i2 = 1;
                        setoverflowicon.AlternateContactlessPaymentDataJson(i2);
                        i7 = i8;
                        c2 = 263;
                    case -15:
                        obj = "values";
                        setoverflowicon.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                        i2 = 1;
                        setoverflowicon.AlternateContactlessPaymentDataJson(i2);
                        i7 = i8;
                        c2 = 263;
                    case -14:
                        obj = com.payair.hce.setLongClickable.class;
                        setoverflowicon.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                        i2 = 1;
                        setoverflowicon.AlternateContactlessPaymentDataJson(i2);
                        i7 = i8;
                        c2 = 263;
                    case -13:
                        setoverflowicon.DigitizedCardProfile = 1;
                        setoverflowicon.AlternateContactlessPaymentDataJson(6);
                        setoverflowicon.AlternateContactlessPaymentDataJson(8);
                        int i9 = setoverflowicon.AlternateContactlessPaymentDataJson;
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        a((byte) (-AlternateContactlessPaymentDataJson[c2]), (short) 43, r5[290], objArr22);
                        obj = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr22[0]), i9);
                        setoverflowicon.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                        i2 = 1;
                        setoverflowicon.AlternateContactlessPaymentDataJson(i2);
                        i7 = i8;
                        c2 = 263;
                    case -12:
                        setoverflowicon.AlternateContactlessPaymentDataJson(12);
                        throw ((java.lang.Throwable) setoverflowicon.IccPrivateKeyCrtComponentsJson);
                    case -11:
                        i7 = 18;
                    case -10:
                        i7 = 16;
                    case -9:
                        setoverflowicon.AlternateContactlessPaymentDataJson(10);
                        if (setoverflowicon.AlternateContactlessPaymentDataJson == 0) {
                            i7 = 15;
                        } else {
                            i7 = i8;
                            c2 = 263;
                        }
                    case -8:
                        try {
                            setoverflowicon.DigitizedCardProfile = 1;
                            setoverflowicon.AlternateContactlessPaymentDataJson(6);
                            setoverflowicon.AlternateContactlessPaymentDataJson(7);
                            obj = ((java.lang.Throwable) setoverflowicon.IccPrivateKeyCrtComponentsJson).getCause();
                            setoverflowicon.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                            i2 = 1;
                            setoverflowicon.AlternateContactlessPaymentDataJson(i2);
                            i7 = i8;
                        } catch (java.lang.Throwable th12) {
                            th = th12;
                            if (i8 >= 20) {
                            }
                            throw th;
                        }
                        c2 = 263;
                        break;
                    case -7:
                        i7 = 52;
                    case -6:
                        try {
                            setoverflowicon.DigitizedCardProfile = 1;
                            setoverflowicon.AlternateContactlessPaymentDataJson(6);
                            setoverflowicon.AlternateContactlessPaymentDataJson(7);
                            java.lang.Object obj4 = setoverflowicon.IccPrivateKeyCrtComponentsJson;
                            try {
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                a((byte) (-AlternateContactlessPaymentDataJson[c2]), com.visa.cbp.setDeviceName.getOutputSizeshNQ4ISI, r5[290], objArr23);
                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                a(61, (short) 48, r5[5], objArr24);
                                try {
                                    obj = cls6.getMethod((java.lang.String) objArr24[0], null).invoke(obj4, null);
                                    setoverflowicon.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                                    i2 = 1;
                                    setoverflowicon.AlternateContactlessPaymentDataJson(i2);
                                    i7 = i8;
                                } catch (java.lang.Throwable th13) {
                                    th = th13;
                                    java.lang.Throwable cause2 = th.getCause();
                                    if (cause2 == null) {
                                        throw th;
                                    }
                                    throw cause2;
                                }
                            } catch (java.lang.Throwable th14) {
                                th = th14;
                            }
                        } catch (java.lang.Throwable th15) {
                            th = th15;
                            r13 = 0;
                            if (i8 >= 20) {
                            }
                            throw th;
                        }
                        c2 = 263;
                        break;
                    case -5:
                        setoverflowicon.DigitizedCardProfile = 2;
                        setoverflowicon.AlternateContactlessPaymentDataJson(6);
                        setoverflowicon.AlternateContactlessPaymentDataJson(7);
                        java.lang.String str6 = (java.lang.String) setoverflowicon.IccPrivateKeyCrtComponentsJson;
                        setoverflowicon.AlternateContactlessPaymentDataJson(8);
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        b(str6, setoverflowicon.AlternateContactlessPaymentDataJson, objArr25);
                        obj = (java.lang.String) objArr25[0];
                        setoverflowicon.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                        i2 = 1;
                        setoverflowicon.AlternateContactlessPaymentDataJson(i2);
                        i7 = i8;
                        c2 = 263;
                    case -4:
                        try {
                            byte[] bArr4 = AlternateContactlessPaymentDataJson;
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            a((byte) (bArr4[313] - 1), (short) 95, 29, objArr26);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            a(59, (short) 66, (short) (-bArr4[317]), objArr27);
                            i = ((java.lang.Integer) cls7.getMethod((java.lang.String) objArr27[0], null).invoke(null, null)).intValue();
                            setoverflowicon.DigitizedCardProfile = i;
                            setoverflowicon.AlternateContactlessPaymentDataJson(2);
                            i7 = i8;
                            c2 = 263;
                        } catch (java.lang.Throwable th16) {
                            java.lang.Throwable cause3 = th16.getCause();
                            if (cause3 == null) {
                                throw th16;
                            }
                            throw cause3;
                        }
                    case -3:
                        setoverflowicon.DigitizedCardProfile = 42989;
                        setoverflowicon.AlternateContactlessPaymentDataJson(2);
                        i7 = i8;
                        c2 = 263;
                    case -2:
                        obj = "圩\uf0ceᣲ";
                        setoverflowicon.SdkCoreAlternateContactlessPaymentDataImpl = obj;
                        i2 = 1;
                        setoverflowicon.AlternateContactlessPaymentDataJson(i2);
                        i7 = i8;
                        c2 = 263;
                    case -1:
                        i7 = 47;
                    default:
                        i7 = i8;
                        c2 = 263;
                }
            }
            throw th;
        } catch (java.lang.Throwable th17) {
            java.lang.Throwable cause4 = th17.getCause();
            if (cause4 == null) {
                throw th17;
            }
            throw cause4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = AlternateContactlessPaymentDataJson;
        int i4 = i + 44;
        int i5 = 401 - s;
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = i2;
            int i8 = 0;
            i4 = (-i4) + i7;
            i5 = i6;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            int i9 = i5 + 1;
            if (i3 == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = bArr[i9];
            i7 = i4;
            i4 = i10;
            i8 = i3 + 1;
            i6 = i9;
            i4 = (-i4) + i7;
            i5 = i6;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            int i92 = i5 + 1;
            if (i3 == i2) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            int i922 = i5 + 1;
            if (i3 == i2) {
            }
        }
    }

    static void DigitizedCardProfile() {
        AlternateContactlessPaymentDataJson = new byte[]{98, 74, -39, 82, -4, 5, -1, -5, 6, -1, -6, 7, -1, -7, 8, -7, 7, -8, 8, -9, 9, -1, -8, 9, -1, -9, 10, -1, -10, com.google.common.base.Ascii.VT, -13, 13, -1, -11, com.google.common.base.Ascii.FF, -13, 13, -1, -12, 13, -1, -4, 1, 4, -1, -4, 0, 5, -5, 0, 5, -1, -4, -1, 6, -5, -2, 7, -1, -4, -1, 6, -5, -3, 8, -1, -4, -2, 7, -5, -4, 9, -5, -5, 10, -1, -4, -3, 8, -1, -4, -4, 9, -5, -3, 8, -1, -4, -5, 10, -5, -6, com.google.common.base.Ascii.VT, -1, -4, -6, com.google.common.base.Ascii.VT, -5, -7, com.google.common.base.Ascii.FF, -1, -4, -7, com.google.common.base.Ascii.FF, -5, -8, 13, -6, 2, 4, -5, -8, 13, -1, -4, -8, 13, -5, -2, 7, -1, -5, 2, 4, -1, -5, 1, 5, -1, -5, 0, 6, -6, 2, 4, -1, -4, -7, com.google.common.base.Ascii.FF, -6, 2, 4, -6, 2, 4, -1, -4, -8, 13, -5, -2, 7, -1, -5, -1, 7, -6, 1, 5, -6, 1, 5, -6, 0, 6, -5, -2, 7, -1, -5, -2, 8, -6, -1, 7, -6, -2, 8, -1, -5, -3, 9, -1, -5, -4, 10, -6, -3, 9, -6, -4, 10, -6, -5, com.google.common.base.Ascii.VT, -1, -5, -5, com.google.common.base.Ascii.VT, -6, -7, 13, -1, -5, -6, com.google.common.base.Ascii.FF, -1, -5, -7, 13, -1, -6, 3, 4, -1, -6, 3, 4, -1, -5, -4, 10, -7, 3, 4, -7, 2, 5, -7, 1, 6, -6, 0, 6, -1, -5, -5, com.google.common.base.Ascii.VT, -6, 1, 5, -6, 0, 6, -1, -6, 2, 5, -1, -6, 1, 6, -1, -6, 0, 7, -1, -6, 0, 9, -21, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -62, com.google.common.base.Ascii.VT, -13, 7, 57, -37, -33, 2, 9, -5, 7, 3, 4, 3, -11, 9, -21, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -62, com.google.common.base.Ascii.VT, -13, 7, 57, -27, -37, -6, com.google.common.base.Ascii.SI, -2, 2, -13, com.google.common.base.Ascii.NAK, -11, -9, 16, com.google.common.base.Ascii.SYN, -23, -5, -6, com.google.common.base.Ascii.RS, -11, -11, -9, 16, -13, 10, -14, 3, 6, 5, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -72, 13, 4, -18, 73, -40, -19, 4, -18, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -44, 1, 8, -3, 2, -14, 3, 17, -19, com.google.common.base.Ascii.VT, -6, 1, 2, -15, 46, -27, -3, -5, -5, 7, 34, -31, -3, 2, com.google.common.base.Ascii.EM, -25, -9, 7, -13, com.google.common.base.Ascii.FF, -5, -6, com.google.common.base.Ascii.SI, -13, 4, 9, -21, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -62, com.google.common.base.Ascii.VT, -13, 7, 57, -33, -19, -8, 5, 2, -17, 9, -21, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -62, com.google.common.base.Ascii.VT, -13, 7, 57, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 13, -1, -6, 7, 2, -17, 70, -31, -24, -15, com.google.common.base.Ascii.FF, -7, com.google.common.base.Ascii.VT, -5, -8, 7, 4, 6, com.google.common.base.Ascii.SI, -30, 9, -21, com.google.common.base.Ascii.NAK, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -62, com.google.common.base.Ascii.VT, -13, 7, 57, -33, -19, -8, 5, 2, -17, 57};
        IccPrivateKeyCrtComponentsJson = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
    }

    static void init$1() {
        $$d = new byte[]{34, -19, 77, -23};
        $$e = 101;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        DigitizedCardProfile();
        valueOf = 0;
        writeReplace = 1;
        DigitizedCardProfile = -6726703286628834919L;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.FF, 9, 103, -116, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, 14, -15, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -44, 1, -6, com.google.common.base.Ascii.SI, -19, 4, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -41, 3, 6, -8, 10, -1, -10, 7, com.google.common.base.Ascii.NAK, -11, -9, 16, com.google.common.base.Ascii.SYN, -23};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE;
    }
}
