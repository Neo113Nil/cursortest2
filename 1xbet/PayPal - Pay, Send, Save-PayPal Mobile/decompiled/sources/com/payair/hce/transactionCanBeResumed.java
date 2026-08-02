package com.payair.hce;

/* loaded from: classes4.dex */
public final class transactionCanBeResumed implements com.payair.hce.onIdentify {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char DigitizedCardProfile;
    private static char IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static long SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static char[] getProfileVersion;
    private static char valueOf;
    private static char values;
    private static final char[] writeReplace;
    private byte[] AlternateContactlessPaymentDataJson;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~(i3 | i2);
        int i6 = (i * (-109)) + (i2 * 111) + ((i4 | i5) * (-220)) + ((i5 | (~(i | i2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + (((~(i | (~i2))) | (~(i2 | i4))) * 110);
        if (i6 == 1) {
            return values(objArr);
        }
        if (i6 == 2) {
            return writeReplace(objArr);
        }
        if (i6 == 3) {
            return valueOf(objArr);
        }
        if (i6 != 4) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = (com.payair.hce.transactionCanBeResumed) objArr[0];
        byte byteValue = ((java.lang.Byte) objArr[1]).byteValue();
        int i7 = getAid + 15;
        RecordsJson = i7 % 128;
        if (i7 % 2 != 0) {
            byte[] bArr = transactioncanberesumed.AlternateContactlessPaymentDataJson;
            int length = bArr.length;
            int length2 = bArr.length;
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr2 = transactioncanberesumed.AlternateContactlessPaymentDataJson;
        int length3 = bArr2.length;
        int length4 = bArr2.length + 1;
        DigitizedCardProfile(new java.lang.Object[]{transactioncanberesumed, java.lang.Integer.valueOf(length4)}, -331614228, 331614229, length4);
        transactioncanberesumed.AlternateContactlessPaymentDataJson[length3] = byteValue;
        return transactioncanberesumed;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (b2 * 2) + 1;
        int i5 = 110 - (i * 11);
        int i6 = (b * 4) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i5 += -i7;
            i6++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i6];
            i5 += -i7;
            i6++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        getAid = 1;
        RecordsJson();
        writeReplace = new char[]{com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int i = RecordsJson + 117;
        getAid = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static com.payair.hce.transactionCanBeResumed writeReplace(int i) {
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = new com.payair.hce.transactionCanBeResumed(i);
        getAid = (RecordsJson + 81) % 128;
        return transactioncanberesumed;
    }

    public static com.payair.hce.transactionCanBeResumed values(java.lang.String str) {
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = new com.payair.hce.transactionCanBeResumed(str);
        getAid = (RecordsJson + 45) % 128;
        return transactioncanberesumed;
    }

    private static void b(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        int i3 = $11 + 13;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (getcvmmodel.valueOf < i2) {
            $11 = ($10 + 63) % 128;
            int i5 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(getProfileVersion[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.os.Process.myTid() >> 22), (-16776835) - android.graphics.Color.rgb(0, 0, 0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 62389));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((byte) 0, (byte) 0, 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(SdkCoreAlternateContactlessPaymentDataImpl), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777251, android.widget.ExpandableListView.getPackedPositionChild(0L) + 3967, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 40224))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 33, 211 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.view.View.combineMeasuredStates(0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33, 212 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) android.text.TextUtils.getTrimmedLength(""))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = new com.payair.hce.transactionCanBeResumed(((java.lang.Character) objArr[0]).charValue());
        int i = RecordsJson + 77;
        getAid = i % 128;
        if (i % 2 != 0) {
            return transactioncanberesumed;
        }
        throw null;
    }

    public static com.payair.hce.transactionCanBeResumed DigitizedCardProfile(byte b) {
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = new com.payair.hce.transactionCanBeResumed(b);
        int i = RecordsJson + 21;
        getAid = i % 128;
        if (i % 2 != 0) {
            return transactioncanberesumed;
        }
        throw null;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $10 = ($11 + 29) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            $10 = ($11 + 5) % 128;
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i2) ^ ((c2 << 4) + ((char) (DigitizedCardProfile ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 63, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1336, (char) android.graphics.Color.green(0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((byte) 0, (byte) 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (valueOf ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(values)};
                    int i4 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 62, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1335, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c((byte) 0, (byte) 0, 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
            cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 52, android.view.KeyEvent.keyCodeFromString("") + 3543, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    public static com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson(byte[] bArr) {
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = new com.payair.hce.transactionCanBeResumed(bArr, bArr.length);
        RecordsJson = (getAid + 75) % 128;
        return transactioncanberesumed;
    }

    public final java.lang.String writeReplace() {
        int i = getAid + 85;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            byte[] bArr = this.AlternateContactlessPaymentDataJson;
            if (bArr == null) {
                return "";
            }
            try {
                char[] cArr = new char[bArr.length << 1];
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    byte[] bArr2 = this.AlternateContactlessPaymentDataJson;
                    if (i3 >= bArr2.length) {
                        getAid = (RecordsJson + 125) % 128;
                        return new java.lang.String(cArr);
                    }
                    byte b = bArr2[i3];
                    char[] cArr2 = writeReplace;
                    cArr[i2] = cArr2[(b >>> 4) & 15];
                    int i4 = i2 + 2;
                    cArr[i2 + 1] = cArr2[b & com.google.common.base.Ascii.SI];
                    i3++;
                    i2 = i4;
                }
            } catch (java.lang.Exception unused) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("\ueb98ⱴ梨駱蛰씼✥\ueb76\ueb98ⱴ䀘\uf881盔た", (android.os.Process.myPid() >> 22) + 13, objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            }
        } else {
            throw new java.lang.ArithmeticException();
        }
    }

    public final java.lang.String toString() {
        getAid = (RecordsJson + 85) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        b(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), 13 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int i = getAid + 41;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            return intern;
        }
        throw null;
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        java.lang.String str = new java.lang.String(this.AlternateContactlessPaymentDataJson);
        int i = RecordsJson + 77;
        getAid = i % 128;
        if (i % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public final byte[] valueOf() {
        int i = getAid;
        RecordsJson = (i + 53) % 128;
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        int i2 = i + 1;
        RecordsJson = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    public final boolean valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) {
        getAid = (RecordsJson + 27) % 128;
        boolean equals = java.util.Arrays.equals(this.AlternateContactlessPaymentDataJson, transactioncanberesumed.AlternateContactlessPaymentDataJson);
        getAid = (RecordsJson + 39) % 128;
        return equals;
    }

    public final int DigitizedCardProfile() {
        int i = getAid + 93;
        int i2 = i % 128;
        RecordsJson = i2;
        if (i % 2 != 0) {
            int length = this.AlternateContactlessPaymentDataJson.length;
            throw null;
        }
        int length2 = this.AlternateContactlessPaymentDataJson.length;
        getAid = (i2 + 45) % 128;
        return length2;
    }

    public final boolean getProfileVersion() {
        int i = RecordsJson + 41;
        int i2 = i % 128;
        getAid = i2;
        if (i % 2 == 0) {
            int length = this.AlternateContactlessPaymentDataJson.length;
            throw null;
        }
        if (this.AlternateContactlessPaymentDataJson.length != 0) {
            return false;
        }
        int i3 = i2 + 47;
        RecordsJson = i3 % 128;
        if (i3 % 2 == 0) {
            return true;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void DigitizedCardProfile(int i, byte b) {
        int i2 = (RecordsJson + 109) % 128;
        getAid = i2;
        this.AlternateContactlessPaymentDataJson[i] = b;
        int i3 = i2 + 35;
        RecordsJson = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void valueOf(int i, byte[] bArr) throws com.payair.hce.postToastMessageOnUi {
        getAid = (RecordsJson + 35) % 128;
        int length = bArr.length;
        byte[] bArr2 = this.AlternateContactlessPaymentDataJson;
        if (length + i > bArr2.length) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            b((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 14, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 37, objArr);
            throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr[0]).intern());
        }
        java.lang.System.arraycopy(bArr, 0, bArr2, i, bArr.length);
        getAid = (RecordsJson + 99) % 128;
    }

    public final void valueOf(int i, byte[] bArr, int i2, int i3) throws com.payair.hce.postToastMessageOnUi {
        int i4 = getAid + 125;
        RecordsJson = i4 % 128;
        if (i4 % 2 == 0 ? i + i3 > this.AlternateContactlessPaymentDataJson.length : (i >>> i3) > this.AlternateContactlessPaymentDataJson.length) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            b((android.view.ViewConfiguration.getTouchSlop() >> 8) + 14, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), (android.os.Process.myTid() >> 22) + 37, objArr);
            throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr[0]).intern());
        }
        java.lang.System.arraycopy(bArr, i2, this.AlternateContactlessPaymentDataJson, i, i3);
        int i5 = getAid + 31;
        RecordsJson = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final byte AlternateContactlessPaymentDataJson(int i) {
        int i2 = RecordsJson + 93;
        int i3 = i2 % 128;
        getAid = i3;
        if (i2 % 2 == 0) {
            byte b = this.AlternateContactlessPaymentDataJson[i];
            throw null;
        }
        byte b2 = this.AlternateContactlessPaymentDataJson[i];
        int i4 = i3 + 15;
        RecordsJson = i4 % 128;
        if (i4 % 2 == 0) {
            return b2;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = (com.payair.hce.transactionCanBeResumed) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i = RecordsJson + 65;
        int i2 = i % 128;
        getAid = i2;
        if (i % 2 != 0) {
            byte[] bArr = transactioncanberesumed.AlternateContactlessPaymentDataJson;
            if (intValue > bArr.length) {
                RecordsJson = (i2 + 75) % 128;
                byte[] bArr2 = new byte[intValue];
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                transactioncanberesumed.AlternateContactlessPaymentDataJson = bArr2;
            }
            return null;
        }
        int length = transactioncanberesumed.AlternateContactlessPaymentDataJson.length;
        throw null;
    }

    public final com.payair.hce.transactionCanBeResumed SdkCoreAlternateContactlessPaymentDataImpl() {
        RecordsJson = (getAid + 83) % 128;
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        int length = bArr.length;
        int length2 = bArr.length + 2;
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Integer.valueOf(length2)}, -331614228, 331614229, length2);
        byte[] bArr2 = this.AlternateContactlessPaymentDataJson;
        bArr2[length] = -112;
        bArr2[length + 1] = 0;
        RecordsJson = (getAid + 45) % 128;
        return this;
    }

    public final com.payair.hce.transactionCanBeResumed writeReplace(com.payair.hce.transactionCanBeResumed transactioncanberesumed) {
        int i = getAid + 81;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            return (com.payair.hce.transactionCanBeResumed) DigitizedCardProfile(new java.lang.Object[]{this, transactioncanberesumed.AlternateContactlessPaymentDataJson}, 822477408, -822477408, java.lang.System.identityHashCode(this));
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = (com.payair.hce.transactionCanBeResumed) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        RecordsJson = (getAid + 119) % 128;
        byte[] bArr2 = transactioncanberesumed.AlternateContactlessPaymentDataJson;
        int length = bArr2.length;
        int length2 = bArr2.length + bArr.length;
        DigitizedCardProfile(new java.lang.Object[]{transactioncanberesumed, java.lang.Integer.valueOf(length2)}, -331614228, 331614229, length2);
        try {
            transactioncanberesumed.valueOf(length, bArr);
        } catch (com.payair.hce.postToastMessageOnUi unused) {
        }
        getAid = (RecordsJson + 35) % 128;
        return transactioncanberesumed;
    }

    public final com.payair.hce.transactionCanBeResumed values(int i, int i2) throws com.payair.hce.postToastMessageOnUi {
        int i3 = RecordsJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getAid = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (i < 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("幓齜꓁̅䦧퀖놏\udba0⼼䭖깢눝픜᫄\uda1e俋␕菤礋䤄퐖\u0aca竮嫸㶥\udd1aᯝ䴺ꑠ\ue26b蠾抾葎蛂齻\uedc4", 35 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr);
            throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr[0]).intern());
        }
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        if (i2 > bArr.length) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b(51 - android.view.View.resolveSize(0, 0), (char) android.view.View.getDefaultSize(0, 0), 31 - android.text.TextUtils.getTrimmedLength(""), objArr2);
            throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr2[0]).intern());
        }
        if (i > i2) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            b(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 83, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 31 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr3);
            throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr3[0]).intern());
        }
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = new com.payair.hce.transactionCanBeResumed(java.util.Arrays.copyOfRange(bArr, i, i2), i2 - i);
        RecordsJson = (getAid + 85) % 128;
        return transactioncanberesumed;
    }

    private transactionCanBeResumed(int i) {
        this.AlternateContactlessPaymentDataJson = new byte[i];
    }

    private transactionCanBeResumed(java.lang.String str) {
        if (str != null && !str.isEmpty()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\udbab썇", android.view.View.MeasureSpec.getSize(0) + 2, objArr);
            if (!str.equals(((java.lang.String) objArr[0]).intern())) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a("\udbab썇", 2 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
                str = str.startsWith(((java.lang.String) objArr2[0]).intern()) ? str.substring(2) : str;
                if (str.length() % 2 != 0) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(113 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 1 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr3);
                    str = ((java.lang.String) objArr3[0]).intern().concat(java.lang.String.valueOf(str));
                }
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a("믭뒪핬Ⳇ\ue0e7༲ᫌ\ue2cc\uf5fa䜞\uee08斘Ṇ带꺷琐繉옘쬡趏", 19 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr4);
                if (!java.util.regex.Pattern.compile(((java.lang.String) objArr4[0]).intern(), 2).matcher(str).matches()) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(114 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.view.Gravity.getAbsoluteGravity(0, 0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 20, objArr5);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr5[0]).intern());
                    sb.append(str);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    a("㟧\u0e71", android.graphics.Color.red(0) + 1, objArr6);
                    sb.append(((java.lang.String) objArr6[0]).intern());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                int length = str.length();
                this.AlternateContactlessPaymentDataJson = new byte[length / 2];
                for (int i = 0; i < length; i += 2) {
                    this.AlternateContactlessPaymentDataJson[i / 2] = (byte) ((java.lang.Character.digit(str.charAt(i), 16) << 4) + java.lang.Character.digit(str.charAt(i + 1), 16));
                }
                return;
            }
        }
        this.AlternateContactlessPaymentDataJson = new byte[0];
    }

    private transactionCanBeResumed(char c) {
        this.AlternateContactlessPaymentDataJson = new byte[]{(byte) (c >> '\b'), (byte) c};
    }

    private transactionCanBeResumed(byte b) {
        this.AlternateContactlessPaymentDataJson = new byte[]{b};
    }

    private transactionCanBeResumed(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.AlternateContactlessPaymentDataJson = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public final int hashCode() {
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        if (bArr != null) {
            int i = getAid + 31;
            RecordsJson = i % 128;
            if (i % 2 == 0) {
                return java.util.Arrays.hashCode(bArr);
            }
            java.util.Arrays.hashCode(bArr);
            throw null;
        }
        RecordsJson = (getAid + 33) % 128;
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = RecordsJson;
        getAid = (i + 21) % 128;
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        if (bArr != null) {
            int i2 = i + 77;
            getAid = i2 % 128;
            if (i2 % 2 != 0) {
                if (obj instanceof com.payair.hce.transactionCanBeResumed) {
                    return java.util.Arrays.equals(bArr, ((com.payair.hce.transactionCanBeResumed) obj).AlternateContactlessPaymentDataJson);
                }
            } else {
                throw null;
            }
        }
        return super.equals(obj);
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        byte b;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = (com.payair.hce.transactionCanBeResumed) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int intValue2 = ((java.lang.Number) objArr[2]).intValue();
        boolean booleanValue = ((java.lang.Boolean) objArr[3]).booleanValue();
        int i = RecordsJson;
        int i2 = i + 91;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            byte[] bArr = transactioncanberesumed.AlternateContactlessPaymentDataJson;
            byte b2 = bArr[intValue];
            if (booleanValue) {
                b = (byte) ((1 << intValue2) | b2);
                getAid = (i + 47) % 128;
            } else {
                b = (byte) ((~(1 << intValue2)) & b2);
            }
            bArr[intValue] = b;
            return null;
        }
        byte b3 = transactioncanberesumed.AlternateContactlessPaymentDataJson[intValue];
        throw null;
    }

    public static com.payair.hce.transactionCanBeResumed DigitizedCardProfile(com.payair.hce.transactionCanBeResumed transactioncanberesumed) {
        byte[] bArr = transactioncanberesumed.AlternateContactlessPaymentDataJson;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed2 = new com.payair.hce.transactionCanBeResumed(bArr, bArr.length);
        int i = RecordsJson + 59;
        getAid = i % 128;
        if (i % 2 != 0) {
            return transactioncanberesumed2;
        }
        throw null;
    }

    @Override // com.payair.hce.onIdentify
    public final void values() {
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        if (bArr != null) {
            getAid = (RecordsJson + 117) % 128;
            java.util.Arrays.fill(bArr, (byte) 0);
        }
        RecordsJson = (getAid + 17) % 128;
    }

    public final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = new com.payair.hce.transactionCanBeResumed(bArr, bArr.length);
        int i = getAid + 105;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            return transactioncanberesumed;
        }
        throw new java.lang.ArithmeticException();
    }

    static void RecordsJson() {
        valueOf = (char) 27450;
        values = (char) 17901;
        DigitizedCardProfile = (char) 45922;
        IccPrivateKeyCrtComponentsJson = (char) 7622;
        getProfileVersion = new char[]{24290, 49097, 40141, 64969, 56011, 15348, 6344, 31224, 22242, 47043, 38127, 62954, 54002, 13207, 24289, 49093, 40145, 64896, 56030, 15320, 6366, 31225, 22240, 47082, 38077, 62955, 53987, 13199, 4234, 29057, 20191, 44947, 35995, 60880, 51887, 11171, 2226, 27048, 18110, 42940, 33868, 58716, 49738, 9041, 'W', 24852, 32366, 24440, 48247, 40289, 64098, 24315, 49090, 40128, 64896, 55964, 15298, 6366, 31147, 22183, 47083, 38131, 62972, 54006, 13206, 4297, 29063, 20126, 44948, 35995, 60831, 51903, 11238, 2211, 27065, 18167, 42928, 33864, 58705, 49740, 9040, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST, 24315, 49090, 40128, 64896, 55964, 15312, 6339, 31203, 22250, 47013, 38077, 62961, 53984, 13262, 4238, 29078, 20122, 44955, 35969, 60821, 51897, 11238, 2229, 27060, 18102, 42940, 33805, 58639, 49751, 9041, 30, 24223, 24262, 49092, 40147, 64961, 56023, 15327, 6357, 31148, 22255, 47079, 38117, 62904, 53984, 13210, 4251, 29069, 20113, 44957, 36053, 60843};
        SdkCoreAlternateContactlessPaymentDataImpl = -7719653193847750742L;
    }

    public final void values(int i, int i2, boolean z) {
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Boolean.valueOf(z)}, 334804465, -334804462, i);
    }

    public final com.payair.hce.transactionCanBeResumed writeReplace(byte[] bArr) {
        return (com.payair.hce.transactionCanBeResumed) DigitizedCardProfile(new java.lang.Object[]{this, bArr}, 822477408, -822477408, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.transactionCanBeResumed valueOf(byte b) {
        return (com.payair.hce.transactionCanBeResumed) DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Byte.valueOf(b)}, -1094612326, 1094612330, java.lang.System.identityHashCode(this));
    }

    private void values(int i) {
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, -331614228, 331614229, i);
    }

    static void init$0() {
        $$a = new byte[]{114, 106, 82, com.google.common.base.Ascii.SYN};
        $$b = 27;
    }

    public static com.payair.hce.transactionCanBeResumed valueOf(char c) {
        return (com.payair.hce.transactionCanBeResumed) DigitizedCardProfile(new java.lang.Object[]{java.lang.Character.valueOf(c)}, -1858812647, 1858812649, (int) java.lang.System.currentTimeMillis());
    }
}
