package com.payair.hce;

/* loaded from: classes4.dex */
public final class onContactlessPaymentAborted extends com.payair.hce.onTransactionStopped {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int[] AlternateContactlessPaymentDataJson;
    private static int valueOf;
    private static int writeReplace;
    private com.payair.hce.setPinIvCvc3Track2 DigitizedCardProfile = com.payair.hce.setMaximumPinTry.valueOf();
    private com.payair.hce.access202 values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2 = (s * 653) + 65;
        int i3 = 37 - (s3 * 34);
        byte[] bArr = $$a;
        int i4 = s2 * 34;
        char[] cArr = new char[i4 + 1];
        if (bArr == null) {
            int i5 = i3;
            int i6 = 0;
            i2 = (i2 + (-i3)) - 2;
            i3 = i5;
            i = i6;
            int i7 = i3 + 1;
            cArr[i] = (char) i2;
            if (i == i4) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            int i8 = i + 1;
            i5 = i7;
            i3 = bArr[i7];
            i6 = i8;
            i2 = (i2 + (-i3)) - 2;
            i3 = i5;
            i = i6;
            int i72 = i3 + 1;
            cArr[i] = (char) i2;
            if (i == i4) {
            }
        } else {
            i = 0;
            int i722 = i3 + 1;
            cArr[i] = (char) i2;
            if (i == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 66 - (b * 3);
        int i5 = (s * 4) + 4;
        byte[] bArr = $$g;
        int i6 = (i * 2) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i5++;
            i4 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i5++;
            i4 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        int i2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AlternateContactlessPaymentDataJson;
        int i3 = 1;
        int i4 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                $11 = ($10 + 107) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i3];
                    objArr2[0] = java.lang.Integer.valueOf(iArr3[i5]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr4[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i5++;
                    int i6 = $10 + 53;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 3 / 5;
                    }
                    i3 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = AlternateContactlessPaymentDataJson;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr6[i8])};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr2 = iArr6;
                    i2 = length3;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 27, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 29, (char) android.view.KeyEvent.getDeadChar(0, 0))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr2 = iArr6;
                    i2 = length3;
                }
                iArr7[i8] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i8++;
                iArr6 = iArr2;
                length3 = i2;
                i4 = 0;
            }
            iArr6 = iArr7;
        }
        int i9 = i4;
        java.lang.System.arraycopy(iArr6, i9, iArr5, i9, length2);
        istransitsupported.valueOf = i9;
        $11 = ($10 + 105) % 128;
        while (istransitsupported.valueOf < iArr.length) {
            $10 = ($11 + 41) % 128;
            cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            $10 = ($11 + 65) % 128;
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                istransitsupported.DigitizedCardProfile ^= iArr5[i10];
                java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.text.TextUtils.indexOf("", ""), 5088 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i10++;
            }
            int i12 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i12;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i13 = istransitsupported.DigitizedCardProfile;
            int i14 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {istransitsupported, istransitsupported};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj4 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 49, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2923, (char) (3037 - android.view.KeyEvent.getDeadChar(0, 0)));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                c(0, (byte) 0, (short) 0, objArr6);
                obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    public onContactlessPaymentAborted(com.payair.hce.access202 access202Var) {
        this.values = access202Var;
    }

    @Override // com.payair.hce.onTransactionStopped
    public final boolean DigitizedCardProfile() throws com.payair.hce.getAtcCount {
        int i = writeReplace + 39;
        valueOf = i % 128;
        if (i % 2 != 0) {
            com.payair.hce.access202 access202Var = this.values;
            com.payair.hce.setDigitizedCardId setdigitizedcardid = (com.payair.hce.setDigitizedCardId) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var}, -725902463, 725902486, java.lang.System.identityHashCode(access202Var));
            java.util.List list = (java.util.List) com.payair.hce.setDigitizedCardId.DigitizedCardProfile(new java.lang.Object[]{setdigitizedcardid, this.values}, -691510, 691513, java.lang.System.identityHashCode(setdigitizedcardid));
            if (list.isEmpty()) {
                return true;
            }
            writeReplace = (valueOf + 25) % 128;
            android.view.View.combineMeasuredStates(0, 0);
            new java.lang.Object[]{list};
            int i2 = writeReplace + 125;
            valueOf = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.access202 access202Var2 = this.values;
        com.payair.hce.setDigitizedCardId setdigitizedcardid2 = (com.payair.hce.setDigitizedCardId) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access202Var2}, -725902463, 725902486, java.lang.System.identityHashCode(access202Var2));
        ((java.util.List) com.payair.hce.setDigitizedCardId.DigitizedCardProfile(new java.lang.Object[]{setdigitizedcardid2, this.values}, -691510, 691513, java.lang.System.identityHashCode(setdigitizedcardid2))).isEmpty();
        throw null;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        writeReplace = 0;
        valueOf = 1;
        AlternateContactlessPaymentDataJson = new int[]{-1437861906, 1707631417, 1838096385, 1346209673, 1630247487, 2124173280, 391845843, 1238966180, 1326587030, 1946036397, 426655363, 516032772, 248334101, -795593936, 322953414, -1414415239, -334700725, -1701809378};
    }

    static void init$1() {
        $$g = new byte[]{7, -8, -91, 32};
        $$h = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:38|39|(1:41)(4:84|85|86|(11:88|89|43|44|(1:46)(5:54|55|56|57|(2:59|(1:61)(5:62|63|64|65|(6:68|69|(1:71)|72|73|74))))|47|48|(1:50)|51|52|53)(1:90))|42|43|44|(0)(0)|47|48|(0)|51|52|53) */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02fa A[Catch: all -> 0x088f, TRY_ENTER, TryCatch #8 {all -> 0x088f, blocks: (B:23:0x02fa, B:25:0x030a, B:26:0x034a, B:30:0x0408, B:32:0x0450, B:33:0x04a5, B:69:0x06f8, B:71:0x074d, B:72:0x07a1, B:48:0x07dd, B:50:0x081e, B:51:0x0872, B:97:0x04d1, B:99:0x0520, B:100:0x0575, B:124:0x0245, B:126:0x0289, B:127:0x02d1, B:3:0x000e, B:5:0x0049, B:10:0x0084, B:17:0x014f, B:104:0x0158, B:106:0x015e, B:107:0x015f, B:7:0x0160, B:109:0x0164, B:116:0x021e, B:119:0x0227, B:121:0x022d, B:122:0x022e, B:112:0x017e, B:114:0x01c5, B:115:0x0212, B:13:0x009f, B:15:0x00f5, B:16:0x0143), top: B:2:0x000e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x081e A[Catch: all -> 0x088f, TryCatch #8 {all -> 0x088f, blocks: (B:23:0x02fa, B:25:0x030a, B:26:0x034a, B:30:0x0408, B:32:0x0450, B:33:0x04a5, B:69:0x06f8, B:71:0x074d, B:72:0x07a1, B:48:0x07dd, B:50:0x081e, B:51:0x0872, B:97:0x04d1, B:99:0x0520, B:100:0x0575, B:124:0x0245, B:126:0x0289, B:127:0x02d1, B:3:0x000e, B:5:0x0049, B:10:0x0084, B:17:0x014f, B:104:0x0158, B:106:0x015e, B:107:0x015f, B:7:0x0160, B:109:0x0164, B:116:0x021e, B:119:0x0227, B:121:0x022d, B:122:0x022e, B:112:0x017e, B:114:0x01c5, B:115:0x0212, B:13:0x009f, B:15:0x00f5, B:16:0x0143), top: B:2:0x000e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0637 A[Catch: Exception -> 0x07c6, TRY_LEAVE, TryCatch #6 {Exception -> 0x07c6, blocks: (B:44:0x060e, B:54:0x0637, B:57:0x0667, B:59:0x066f, B:62:0x06a4, B:65:0x06d5, B:77:0x07b7, B:78:0x07bd, B:81:0x07bf, B:82:0x07c5, B:64:0x06ae, B:56:0x0641), top: B:43:0x060e, inners: #4, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] DigitizedCardProfile(int i, int i2) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        int i3;
        java.lang.String str;
        java.lang.Object obj;
        java.io.File file;
        java.io.File file2;
        java.lang.String[] strArr;
        int i4;
        int i5;
        try {
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(new int[]{-1349984571, 1181420195, -756996290, -1815738449, -1773645807, -93037060, -1868897276, -512697240, -497177105, 1982359567}, android.text.TextUtils.getOffsetBefore("", 0) + 19, objArr3);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(new int[]{-969615139, 1483188733, 1003803061, -1130973304, 891829601, 853389313, -756996290, -1815738449, 2102078840, -1906244283}, android.text.TextUtils.indexOf("", "", 0, 0) + 18, objArr4);
                strArr = new java.lang.String[]{((java.lang.String) objArr3[0]).intern(), ((java.lang.String) objArr4[0]).intern()};
            } catch (java.lang.Exception unused) {
                objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 2}, null, new int[1]};
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~((-650926222) | i)) | (-937295824)) * (-502)) - 263350460) + ((~((~i) | (-583293061))) * (-502)) + (((~((-354002764) | i)) | (-650926222)) * 502))};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.argb(0, 0, 0, 0), 2713 - android.view.View.resolveSize(0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    byte b = $$a[14];
                    byte b2 = (byte) (b + 1);
                    byte b3 = (byte) (-b);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(b2, b3, b3, objArr6);
                    obj2 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr5)).intValue();
            }
            try {
                for (i4 = 0; i4 < 2; i4++) {
                    java.lang.String str2 = strArr[i4];
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(new int[]{1791697347, -1925385252, 1364148087, -393125257, 71652354, 1681064581, -94775052, -1333927843}, 16 - android.graphics.Color.alpha(0), objArr7);
                    java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                    if (((java.lang.Boolean) cls2.getMethod(str2, new java.lang.Class[0]).invoke(cls2, null)).booleanValue()) {
                        valueOf = (writeReplace + 45) % 128;
                        objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                        int i6 = ~i;
                        try {
                            java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-587770961) | i6)) | (~((-417158025) | i6))) * (-867)) + 399997024 + (((~((-587770961) | i)) | 524288 | (~((-417158025) | i))) * (-1734)) + (((~(i6 | (-524289))) | (~((-587246673) | i)) | (~((-416633737) | i))) * 867))};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj3 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 50, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2713, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                                byte b4 = $$a[14];
                                byte b5 = (byte) (b4 + 1);
                                byte b6 = (byte) (-b4);
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                b(b5, b6, b6, objArr9);
                                obj3 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                            }
                            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr8)).intValue();
                            if (i == ((int[]) objArr[1])[0]) {
                                int i7 = (valueOf + 85) % 128;
                                writeReplace = i7;
                                valueOf = (i7 + 101) % 128;
                                return objArr;
                            }
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(218021890);
                            if (obj4 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.graphics.Color.blue(0), 2392 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 29420));
                                byte b7 = (byte) (-$$a[14]);
                                byte b8 = (byte) (b7 - 1);
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                b(b7, b8, b8, objArr10);
                                obj4 = cls4.getMethod((java.lang.String) objArr10[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(218021890, obj4);
                            }
                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, null)).longValue();
                            long j = ~longValue;
                            long j2 = ~(j | 11320064);
                            long j3 = i;
                            long j4 = ((-445) * longValue) + 5037428925L + (((~((~j3) | j)) | j2) * 446) + (((~(longValue | 11320064)) | ((j3 | ((-11320065) | j)) ^ (-1))) * 446) + (j2 * 446) + 293404161;
                            int i8 = (int) (j4 >> 32);
                            int i9 = ~i;
                            int i10 = ~((-1931375685) | i9);
                            if (((i8 & ((((~(2143254527 | i9)) | 714486357 | (~((-2124297216) | i))) * (-68)) + 1525987026 + ((~((-1409810859) | i9)) * (-68)) + (((~(2124297215 | i9)) | 733443669) * 68))) | (((int) j4) & ((((~(1931375684 | i)) | (~(494149274 | i9)) | i10) * (-516)) + 1122345177 + (((~((-207620763) | i)) | (~((-286528513) | i9))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((i10 | 286528512) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)))) == 1) {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                                java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-264507842) | i9)) * 979) - 1227383622) + ((740421143 | i) * (-979)) + (((~((-264507842) | i)) | (~(740421143 | i9))) * 979))};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj5 == null) {
                                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 50, 2713 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.graphics.Color.red(0));
                                    byte b9 = $$a[14];
                                    byte b10 = (byte) (b9 + 1);
                                    byte b11 = (byte) (-b9);
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    b(b10, b11, b11, objArr12);
                                    obj5 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                }
                                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr11)).intValue();
                                i3 = 0;
                                ((int[]) objArr2[3])[0] = intValue;
                            } else {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                                java.lang.Object[] objArr13 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(i9 | (-625605123))) | 379323862) * (-90)) - 1017906992) + (((~(i | (-625605123))) | (-937295831)) * (-45)) + (((-625605123) | (~((-379323863) | i)) | (~(379323862 | i9))) * 45))};
                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj6 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2714 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                    byte b12 = $$a[14];
                                    byte b13 = (byte) (b12 + 1);
                                    byte b14 = (byte) (-b12);
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    b(b13, b14, b14, objArr14);
                                    obj6 = cls6.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                                }
                                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr13)).intValue();
                                i3 = 0;
                                ((int[]) objArr2[3])[0] = intValue2;
                            }
                            if (i != ((int[]) objArr2[1])[i3]) {
                                return objArr2;
                            }
                            try {
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                a(new int[]{-363529950, 1946393618, 540018533, 334526849, 1431972326, 181462907, -1485826789, 1366883027, -1524713382, 408218669, -1023574147, 1371613874, -294354031, -368689482, -278705429, -1250922794, 99668186, 1027979760, -553870197, 207572575}, 40 - android.view.KeyEvent.normalizeMetaState(i3), objArr15);
                                file2 = new java.io.File(((java.lang.String) objArr15[i3]).intern());
                            } catch (java.lang.Exception unused2) {
                            }
                            if (file2.canRead()) {
                                java.io.FileReader fileReader = new java.io.FileReader(file2);
                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                                try {
                                    str = bufferedReader.readLine();
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    a(new int[]{-1810005224, 243029057}, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '-', objArr16);
                                    if (!str.equals(((java.lang.String) objArr16[0]).intern())) {
                                        valueOf = (writeReplace + 55) % 128;
                                        fileReader.close();
                                        bufferedReader.close();
                                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                                        a(new int[]{-1988202039, -1510551904, 1991243797, 909666017, -1551354392, -1947646215, 1101001405, -72178069, 1708752835, -1623617699, -1096755119, -896266448, -90722169, -1476249807, -1938116138, -1020319031}, 30 - android.os.Process.getGidForName(""), objArr17);
                                        file = new java.io.File(((java.lang.String) objArr17[0]).intern());
                                        if (!file.canRead()) {
                                            try {
                                                java.lang.String readLine = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                a(new int[]{-552371275, -1078193216}, android.text.TextUtils.getTrimmedLength("") + 1, objArr18);
                                                if (readLine.equals(((java.lang.String) objArr18[0]).intern())) {
                                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                    a(new int[]{-363529950, 1946393618, 540018533, 334526849, 1431972326, 181462907, -1485826789, 1366883027, -1524713382, 408218669, -1023574147, 1371613874, -1524713382, 408218669, -1023574147, 1371613874, 482365300, 1730746851}, 37 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr19);
                                                    java.io.File file3 = new java.io.File(((java.lang.String) objArr19[0]).intern());
                                                    if (file3.canRead()) {
                                                        try {
                                                            java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                            a(new int[]{-552371275, -1078193216}, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr20);
                                                            if (readLine2.equals(((java.lang.String) objArr20[0]).intern()) && str != null) {
                                                                java.lang.Object[] objArr21 = {new int[]{i}, new int[]{i ^ 20}, str, new int[1]};
                                                                java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~((-508140299) | i9)) | 496788686) * (-90)) - 1017906992) + (((~((-508140299) | i)) | (-534642639)) * (-45)) + (((~(i | (-496788687))) | (-508140299) | (~(i9 | 496788686))) * 45))};
                                                                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj7 == null) {
                                                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 50, 2712 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.view.MotionEvent.axisFromString("") + 1));
                                                                    byte b15 = $$a[14];
                                                                    byte b16 = (byte) (b15 + 1);
                                                                    byte b17 = (byte) (-b15);
                                                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                                    b(b16, b17, b17, objArr23);
                                                                    obj7 = cls7.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                                                }
                                                                ((int[]) objArr21[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr22)).intValue();
                                                                return objArr21;
                                                            }
                                                        } finally {
                                                        }
                                                    } else {
                                                        writeReplace = (valueOf + 119) % 128;
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        java.lang.Object[] objArr24 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                        java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(i | (-119977450))) | (-884951536)) * (-964)) - 1990683268) + (((~((-119977450) | i9)) | 50377728) * (-964)))};
                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj == null) {
                                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.green(0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2713, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                            byte b18 = $$a[14];
                                            byte b19 = (byte) (b18 + 1);
                                            byte b20 = (byte) (-b18);
                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                            b(b19, b20, b20, objArr26);
                                            obj = cls8.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                                        }
                                        ((int[]) objArr24[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr25)).intValue();
                                        writeReplace = (valueOf + 17) % 128;
                                        return objArr24;
                                    }
                                    fileReader.close();
                                    bufferedReader.close();
                                } finally {
                                }
                            }
                            str = null;
                            java.lang.Object[] objArr172 = new java.lang.Object[1];
                            a(new int[]{-1988202039, -1510551904, 1991243797, 909666017, -1551354392, -1947646215, 1101001405, -72178069, 1708752835, -1623617699, -1096755119, -896266448, -90722169, -1476249807, -1938116138, -1020319031}, 30 - android.os.Process.getGidForName(""), objArr172);
                            file = new java.io.File(((java.lang.String) objArr172[0]).intern());
                            if (!file.canRead()) {
                            }
                            java.lang.Object[] objArr242 = {new int[]{i}, new int[]{i}, null, new int[1]};
                            java.lang.Object[] objArr252 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(i | (-119977450))) | (-884951536)) * (-964)) - 1990683268) + (((~((-119977450) | i9)) | 50377728) * (-964)))};
                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj == null) {
                            }
                            ((int[]) objArr242[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr252)).intValue();
                            writeReplace = (valueOf + 17) % 128;
                            return objArr242;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                }
                java.lang.Object[] objArr27 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(972263056 | i5)) | (-972292057) | (~((-32636929) | i))) * 717) + 1755700922 + (((~(i5 | (-32636929))) | (-972292057) | (~(972263056 | i))) * 717))};
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj8 == null) {
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2712, (char) android.graphics.Color.argb(0, 0, 0, 0));
                    byte b21 = $$a[14];
                    byte b22 = (byte) (b21 + 1);
                    byte b23 = (byte) (-b21);
                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                    b(b22, b23, b23, objArr28);
                    obj8 = cls9.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr27)).intValue();
                if (i == ((int[]) objArr[1])[0]) {
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
            i5 = ~i;
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }

    static void init$0() {
        $$a = new byte[]{108, -62, 108, 66, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = 72;
    }
}
