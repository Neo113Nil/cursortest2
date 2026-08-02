package com.payair.hce;

/* loaded from: classes4.dex */
public final class isPlayServicesPossiblyUpdating implements com.payair.hce.isSidewinderDevice {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long DigitizedCardProfile;
    private static int RecordsJson;
    private static char[] values;
    private static int writeReplace;
    private byte[] AlternateContactlessPaymentDataJson = {48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57, 97, 98, 99, 100, 101, 102};
    private byte[] valueOf = new byte[128];

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5 = i2 * 4;
        int i6 = (i3 * 4) + 99;
        int i7 = i + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i8 = 0 - i5;
        if (bArr == null) {
            int i9 = i7;
            int i10 = i8;
            int i11 = 0;
            int i12 = (-i7) + i10;
            i4 = i11;
            int i13 = i9;
            i6 = i12;
            i7 = i13;
            int i14 = i7 + 1;
            bArr2[i4] = (byte) i6;
            i11 = i4 + 1;
            if (i4 == i8) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i15 = i6;
            i9 = i14;
            i7 = bArr[i14];
            i10 = i15;
            int i122 = (-i7) + i10;
            i4 = i11;
            int i132 = i9;
            i6 = i122;
            i7 = i132;
            int i142 = i7 + 1;
            bArr2[i4] = (byte) i6;
            i11 = i4 + 1;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            int i1422 = i7 + 1;
            bArr2[i4] = (byte) i6;
            i11 = i4 + 1;
            if (i4 == i8) {
            }
        }
    }

    private void valueOf() {
        RecordsJson = (writeReplace + 95) % 128;
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.valueOf;
            if (i2 >= bArr.length) {
                break;
            }
            writeReplace = (RecordsJson + 43) % 128;
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.AlternateContactlessPaymentDataJson;
            if (i >= bArr2.length) {
                byte[] bArr3 = this.valueOf;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            writeReplace = (RecordsJson + 13) % 128;
            this.valueOf[bArr2[i]] = (byte) i;
            i++;
        }
    }

    public isPlayServicesPossiblyUpdating() {
        valueOf();
    }

    @Override // com.payair.hce.isSidewinderDevice
    public final int valueOf(byte[] bArr, int i, int i2, java.io.OutputStream outputStream) throws java.io.IOException {
        int i3 = writeReplace;
        int i4 = i3 + 91;
        RecordsJson = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        RecordsJson = (i3 + 7) % 128;
        int i5 = i;
        while (i5 < i + i2) {
            byte b = bArr[i5];
            outputStream.write(this.AlternateContactlessPaymentDataJson[(b & 255) >>> 4]);
            outputStream.write(this.AlternateContactlessPaymentDataJson[b & com.google.common.base.Ascii.SI]);
            i5++;
            RecordsJson = (writeReplace + 71) % 128;
        }
        return i2 << 1;
    }

    private static boolean DigitizedCardProfile(char c) {
        int i = RecordsJson;
        int i2 = i + 79;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            if (c == 27) {
                return true;
            }
        } else if (c == '\n') {
            return true;
        }
        writeReplace = (i + 113) % 128;
        return c == '\r' || c == '\t' || c == ' ';
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        $10 = ($11 + 65) % 128;
        while (getcvmmodel.valueOf < i2) {
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(values[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 48, android.graphics.Color.red(0) + 381, (char) (android.view.MotionEvent.axisFromString("") + 62389));
                    byte b = (byte) (-$$b);
                    byte b2 = (byte) (b + 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(DigitizedCardProfile), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 35, android.view.KeyEvent.normalizeMetaState(0) + 3966, (char) (android.graphics.Color.alpha(0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 33, 212 - android.text.TextUtils.indexOf("", ""), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i4 = $10 + 115;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.graphics.Color.blue(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                throw new java.lang.ArithmeticException();
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr7 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj5 == null) {
                obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), android.view.View.getDefaultSize(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.view.Gravity.getAbsoluteGravity(0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.payair.hce.isSidewinderDevice
    public final int writeReplace(java.lang.String str, java.io.OutputStream outputStream) throws java.io.IOException {
        RecordsJson = (writeReplace + 65) % 128;
        int length = str.length();
        while (length > 0 && DigitizedCardProfile(str.charAt(length - 1))) {
            int i = RecordsJson + 33;
            writeReplace = i % 128;
            length = i % 2 != 0 ? length + 96 : length - 1;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            while (i2 < length) {
                int i4 = writeReplace + 121;
                RecordsJson = i4 % 128;
                if (i4 % 2 == 0) {
                    DigitizedCardProfile(str.charAt(i2));
                    throw null;
                }
                if (!DigitizedCardProfile(str.charAt(i2))) {
                    break;
                }
                i2++;
                writeReplace = (RecordsJson + 45) % 128;
            }
            int i5 = i2 + 1;
            byte b = this.valueOf[str.charAt(i2)];
            while (i5 < length) {
                RecordsJson = (writeReplace + 75) % 128;
                if (!DigitizedCardProfile(str.charAt(i5))) {
                    break;
                }
                i5++;
            }
            byte b2 = this.valueOf[str.charAt(i5)];
            if ((b | b2) < 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), 44 - android.text.TextUtils.indexOf("", "", 0), objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            }
            outputStream.write((b << 4) | b2);
            i3++;
            i2 = i5 + 1;
        }
        return i3;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        RecordsJson = 1;
        values = new char[]{24262, 25169, 10233, 60286, 44163, 28694, 13739, 63871, 47692, 32727, 878, 50413, 34830, 19868, 4411, 53946, 38877, 23372, 7343, 8314, 58753, 43292, 27296, 11818, 62273, 46283, 30826, 15853, 49418, 33435, 18031, 2998, 52417, 36895, 21959, 6522, 55959, 40543, 41916, 26411, 10333, 60886, 45409, 29432};
        DigitizedCardProfile = -1228164108361637313L;
    }

    static void init$0() {
        $$a = new byte[]{70, -35, 111, 66};
        $$b = 1;
    }
}
