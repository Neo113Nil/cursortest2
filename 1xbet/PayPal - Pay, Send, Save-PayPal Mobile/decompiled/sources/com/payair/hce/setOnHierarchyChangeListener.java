package com.payair.hce;

/* loaded from: classes4.dex */
final class setOnHierarchyChangeListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int valueOf;
    private static final char[] values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = 3 - (b2 * 4);
        int i6 = (b * 4) + 1;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            i3 = i5;
            i4 = 0;
            i5 += -i7;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i3];
            i5 += -i7;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            int i8 = 119 - (i * 2);
            i2 = 0;
            i3 = i5;
            i5 = i8;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        valueOf = 1;
        writeReplace();
        values = new char[]{com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        DigitizedCardProfile = (valueOf + 29) % 128;
    }

    static java.lang.String valueOf(byte[] bArr) {
        if (bArr != null) {
            try {
                char[] cArr = new char[bArr.length << 1];
                int i = 0;
                int i2 = 0;
                while (i < bArr.length) {
                    int i3 = valueOf;
                    DigitizedCardProfile = (i3 + 99) % 128;
                    byte b = bArr[i];
                    char[] cArr2 = values;
                    cArr[i2] = cArr2[(b >>> 4) & 15];
                    int i4 = i2 + 2;
                    cArr[i2 + 1] = cArr2[b & com.google.common.base.Ascii.SI];
                    i++;
                    DigitizedCardProfile = (i3 + 85) % 128;
                    i2 = i4;
                }
                return new java.lang.String(cArr);
            } catch (java.lang.Exception unused) {
                throw new java.lang.IllegalArgumentException("Invalid Input");
            }
        }
        valueOf = (DigitizedCardProfile + 27) % 128;
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        if (r10.equals(((java.lang.String) r1[0]).intern()) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        r3 = new java.lang.Object[1];
        a("閦閖觨㏚蜤\uf09f", android.view.KeyEvent.getMaxKeyCode() >> 16, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
    
        if (r10.startsWith(((java.lang.String) r3[0]).intern()) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
    
        r10 = r10.substring(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        if ((r10.length() % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        r10 = "0".concat(java.lang.String.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
    
        r3 = new java.lang.Object[1];
        a("ࠎࡐ\uefa9嗋츻\udd22뫴\uf3bd\ue10b䲝鏦씉\uda38挃裲\udc35댫騐︅㜉겇녨휫", android.view.KeyEvent.normalizeMetaState(0), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        if (java.util.regex.Pattern.compile(((java.lang.String) r3[0]).intern(), 2).matcher(r10).matches() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        r1 = r10.length();
        r2 = new byte[r1 / 2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b4, code lost:
    
        if (r0 >= r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b6, code lost:
    
        r2[r0 / 2] = (byte) ((java.lang.Character.digit(r10.charAt(r0), 16) << 4) + java.lang.Character.digit(r10.charAt(r0 + 1), 16));
        com.payair.hce.setOnHierarchyChangeListener.valueOf = (com.payair.hce.setOnHierarchyChangeListener.DigitizedCardProfile + 107) % 128;
        r0 = r0 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dc, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00dd, code lost:
    
        r1 = new java.lang.StringBuilder("invalid hex string [");
        r1.append(r10);
        r1.append("]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f5, code lost:
    
        throw new java.lang.IllegalArgumentException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        if (r10.equals(((java.lang.String) r1[0]).intern()) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static byte[] AlternateContactlessPaymentDataJson(java.lang.String str) {
        int i = 0;
        if (str != null) {
            int i2 = valueOf + 87;
            DigitizedCardProfile = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (!str.isEmpty()) {
                int i3 = valueOf + 31;
                DigitizedCardProfile = i3 % 128;
                if (i3 % 2 != 0) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a("閦閖觨㏚蜤\uf09f", (-1) << (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
                } else {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a("閦閖觨㏚蜤\uf09f", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr2);
                }
            }
        }
        return new byte[0];
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 15) % 128;
            cArr = str.toCharArray();
            $10 = ($11 + 9) % 128;
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(AlternateContactlessPaymentDataJson ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        int i2 = $10 + 19;
        while (true) {
            $11 = i2 % 128;
            if (getcardholdervalidator.valueOf >= writeReplace.length) {
                objArr[0] = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
                return;
            }
            $10 = ($11 + 73) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(AlternateContactlessPaymentDataJson)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 40, 1920 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, (byte) 0, 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 429 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (31610 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((byte) 0, (byte) 0, 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                i2 = $10 + 23;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{34, -19, 77, -23};
        $$b = 97;
    }

    static void writeReplace() {
        AlternateContactlessPaymentDataJson = 5654018877200387721L;
    }
}
