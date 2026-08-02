package com.payair.hce;

/* loaded from: classes4.dex */
public final class setContentInsetStartWithNavigation extends com.payair.hce.setGravity {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int valueOf;
    private static long writeReplace;
    private com.payair.hce.setShadowLayer DigitizedCardProfile;
    private com.payair.hce.setHeight values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = i * 3;
        int i4 = 4 - (s2 * 2);
        int i5 = (s * 2) + 117;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i5 = i6;
            i4++;
            i5 += i7;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i4++;
            i5 += i7;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public static com.payair.hce.setContentInsetStartWithNavigation DigitizedCardProfile(java.lang.Object obj) {
        int i = AlternateContactlessPaymentDataJson;
        valueOf = (i + 19) % 128;
        if (!(obj instanceof com.payair.hce.setContentInsetStartWithNavigation)) {
            if (obj != null) {
                return new com.payair.hce.setContentInsetStartWithNavigation(com.payair.hce.setMaxEms.DigitizedCardProfile(obj));
            }
            return null;
        }
        int i2 = i + 89;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            com.payair.hce.setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = (com.payair.hce.setContentInsetStartWithNavigation) obj;
            int i3 = i + 55;
            valueOf = i3 % 128;
            if (i3 % 2 == 0) {
                return setcontentinsetstartwithnavigation;
            }
            throw null;
        }
        throw null;
    }

    private setContentInsetStartWithNavigation(com.payair.hce.setMaxEms setmaxems) {
        if (setmaxems.valueOf() <= 0 || setmaxems.valueOf() > 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\u2e72ሂ椹㒌⸰噓\ue13d\uf83c㻁䚗\uf068\ue9a9ྗ矜삺\udaf9ᰒ搁폰쨦洗锈ꉹ", android.graphics.Color.blue(0), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(setmaxems.valueOf());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.values = com.payair.hce.setHeight.writeReplace(setmaxems.values(0));
        if (setmaxems.valueOf() == 2) {
            this.DigitizedCardProfile = setmaxems.values(1);
        } else {
            this.DigitizedCardProfile = null;
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $11 + 27;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + 33) % 128;
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(writeReplace ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(writeReplace)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.Gravity.getAbsoluteGravity(0, 0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1920, (char) android.graphics.Color.alpha(0));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, (short) 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 429 - android.graphics.Color.alpha(0), (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 31610));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(0, (short) 1, (short) 0, objArr5);
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
        objArr[0] = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
    }

    @Override // com.payair.hce.setGravity, com.payair.hce.setShadowLayer
    public final com.payair.hce.setEms getAid() {
        com.payair.hce.setHintTextColor sethinttextcolor = new com.payair.hce.setHintTextColor();
        com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, this.values}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
        com.payair.hce.setShadowLayer setshadowlayer = this.DigitizedCardProfile;
        if (setshadowlayer != null) {
            AlternateContactlessPaymentDataJson = (valueOf + 93) % 128;
            com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, setshadowlayer}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
        }
        com.payair.hce.setCustomInsertionActionModeCallback setcustominsertionactionmodecallback = new com.payair.hce.setCustomInsertionActionModeCallback(sethinttextcolor);
        int i = valueOf + 77;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            return setcustominsertionactionmodecallback;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        AlternateContactlessPaymentDataJson = 1;
        writeReplace = -2104810555773931277L;
    }

    static void init$0() {
        $$a = new byte[]{69, -73, 121, 3};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
    }
}
