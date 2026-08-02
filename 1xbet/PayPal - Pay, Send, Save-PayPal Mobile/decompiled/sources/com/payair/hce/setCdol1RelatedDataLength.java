package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'valueOf' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes10.dex */
public final class setCdol1RelatedDataLength {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ com.payair.hce.setCdol1RelatedDataLength[] AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static com.payair.hce.setCdol1RelatedDataLength valueOf;
    private static int values;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = s2 * 3;
        int i4 = 3 - (i * 3);
        byte[] bArr = $$a;
        int i5 = s + 112;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i5 += -i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i4++;
            i7 = bArr[i4];
            i2++;
            i5 += -i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    private setCdol1RelatedDataLength(java.lang.String str) {
    }

    public static com.payair.hce.setCdol1RelatedDataLength valueOf(java.lang.String str) {
        values = (writeReplace + 57) % 128;
        com.payair.hce.setCdol1RelatedDataLength setcdol1relateddatalength = (com.payair.hce.setCdol1RelatedDataLength) java.lang.Enum.valueOf(com.payair.hce.setCdol1RelatedDataLength.class, str);
        int i = writeReplace + 73;
        values = i % 128;
        if (i % 2 == 0) {
            return setcdol1relateddatalength;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.setCdol1RelatedDataLength[] values() {
        values = (writeReplace + 17) % 128;
        com.payair.hce.setCdol1RelatedDataLength[] setcdol1relateddatalengthArr = (com.payair.hce.setCdol1RelatedDataLength[]) AlternateContactlessPaymentDataJson.clone();
        writeReplace = (values + 39) % 128;
        return setcdol1relateddatalengthArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        writeReplace = 1;
        valueOf();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\ue889Ⅵ筅땕켭ᤙ匁淨", 51691 - android.view.KeyEvent.getDeadChar(0, 0), objArr);
        com.payair.hce.setCdol1RelatedDataLength setcdol1relateddatalength = new com.payair.hce.setCdol1RelatedDataLength(((java.lang.String) objArr[0]).intern());
        valueOf = setcdol1relateddatalength;
        AlternateContactlessPaymentDataJson = new com.payair.hce.setCdol1RelatedDataLength[]{setcdol1relateddatalength};
        values = (writeReplace + 61) % 128;
    }

    public static java.lang.String AlternateContactlessPaymentDataJson(java.lang.String str) {
        int i = values + 51;
        writeReplace = i % 128;
        if (i % 2 != 0 ? str.length() % 2 == 0 : str.length() * 3 == 0) {
            int i2 = writeReplace + 103;
            values = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\ue886", 13567 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        return sb.toString();
    }

    public static java.lang.String writeReplace(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String obj;
        android.widget.ExpandableListView.getPackedPositionType(0L);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\ue884", android.graphics.Color.green(0) + 10499, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(str2.substring(0, 4));
        sb.append(str3);
        java.lang.String obj2 = sb.toString();
        if (str.length() + str4.length() > 29) {
            int length = 29 - str.length();
            if (str4.length() <= length) {
                length = str4.length();
            } else {
                writeReplace = (values + 17) % 128;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj2);
            sb2.append(str4.substring(0, length));
            obj = sb2.toString();
            values = (writeReplace + 87) % 128;
        } else {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(obj2);
            sb3.append(str4);
            obj = sb3.toString();
        }
        if (obj.length() % 2 == 0) {
            return obj;
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(obj);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("\ue886", 13568 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
        sb4.append(((java.lang.String) objArr2[0]).intern());
        return sb4.toString();
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $11 + 33;
        int i3 = i2 % 128;
        $10 = i3;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str != null) {
            int i4 = i3 + 29;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
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
            int i5 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 1890 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (3600 - android.view.KeyEvent.keyCodeFromString("")));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, (short) 1, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (DigitizedCardProfile ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 63, android.text.TextUtils.getOffsetBefore("", 0) + 1443, (char) (29682 - android.graphics.Color.blue(0)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(0, (short) 0, (short) 0, objArr5);
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
            cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 64, 1442 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.KeyEvent.normalizeMetaState(0) + 29682));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(0, (short) 0, (short) 0, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{111, 35, -79, -70};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE;
    }

    static void valueOf() {
        DigitizedCardProfile = -4122684392201216440L;
    }
}
