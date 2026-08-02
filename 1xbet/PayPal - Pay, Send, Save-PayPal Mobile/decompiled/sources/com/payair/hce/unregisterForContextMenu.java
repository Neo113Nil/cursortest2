package com.payair.hce;

/* loaded from: classes4.dex */
public class unregisterForContextMenu implements com.payair.hce.setSendHeaders {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static long valueOf;
    private static int values;
    private int AlternateContactlessPaymentDataJson = 3;
    private com.payair.hce.checkPermission writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = (b * 3) + 4;
        int i6 = 119 - (i * 2);
        int i7 = 1 - (i2 * 4);
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i5;
            i6 = i7;
            i4 = 0;
            i5++;
            i6 += i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i5];
            i5++;
            i6 += i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        }
    }

    public unregisterForContextMenu() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("霜靏胯㾑✑\u20cb央ᵅ殈㳭", android.text.TextUtils.getOffsetAfter("", 0), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.unregisterForContextMenu.class.getName());
        this.writeReplace = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $10 + 15;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(valueOf ^ (-3824242241614154557L), charArray, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            $11 = ($10 + 63) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(valueOf)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 41, 1921 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, 1, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 26, android.view.View.resolveSizeAndState(0, 0, 0) + 429, (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 31610));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((byte) 0, 0, 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
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
        java.lang.String str2 = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
        $11 = ($10 + 7) % 128;
        objArr[0] = str2;
    }

    @Override // com.payair.hce.setSendHeaders
    public final boolean AlternateContactlessPaymentDataJson(com.payair.hce.sendRequest sendrequest) {
        if (sendrequest.SdkCoreAlternateContactlessPaymentDataImpl() >= this.AlternateContactlessPaymentDataJson) {
            DigitizedCardProfile = (values + 115) % 128;
            return false;
        }
        int i = values + 15;
        DigitizedCardProfile = i % 128;
        return i % 2 != 0;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        DigitizedCardProfile = 1;
        valueOf = 6319433406073129977L;
    }

    static void init$0() {
        $$a = new byte[]{38, -91, 120, 99};
        $$b = 55;
    }
}
