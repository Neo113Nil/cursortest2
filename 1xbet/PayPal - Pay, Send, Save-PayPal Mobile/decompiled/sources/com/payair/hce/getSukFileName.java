package com.payair.hce;

/* loaded from: classes4.dex */
public final class getSukFileName extends com.payair.hce.getAtcCount {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = (i * 3) + 1;
        int i6 = (i2 * 2) + 117;
        byte[] bArr = $$a;
        int i7 = b + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            i6 = (-i6) + i8;
            i3 = i4;
            i4 = i3 + 1;
            i7++;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = i6;
            i6 = bArr[i7];
            i6 = (-i6) + i8;
            i3 = i4;
            i4 = i3 + 1;
            i7++;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            i7++;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public getSukFileName(com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate) {
        super(requesttaskstatusupdate, ((java.lang.String) r2[0]).intern());
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("竍窀绦㿃␆蓄쭩錹杤쭌ᕁᎌꦬ䧃ೆे온㉚稇悀\udca8Ⓡ凉帚\uf537\u0d45体떂ϵ\uf7cdꛁꌘᠲ\ud85c鱄骀㚄숫诬\uf02f伈뒯\ue160\uefff斍鴨\ud8f1씧爕螻㙦㳭袎栴ⷸ⩫ꄐ劾᭱Ƶ뿕㬍狿署퐐ⶪ桲嚳\ue2f9ᘗ䘒䰏ﭨ\uf887붛믎ᇷ\ue14d\uab10酈\u2e6c쮌苇裗䓴반\uf81e", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(values ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            $11 = ($10 + 91) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(values)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 40, 1921 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, (byte) -1, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 27, 429 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (31610 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(0, (byte) -1, 1, objArr5);
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
        int i3 = $11 + 93;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = -427805628492902750L;
    }

    static void init$0() {
        $$a = new byte[]{47, 64, -76, com.visa.cbp.getEncExpo.IResultReceiver};
        $$b = 137;
    }
}
