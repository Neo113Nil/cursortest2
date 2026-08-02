package com.payair.hce;

/* loaded from: classes4.dex */
public final class setContentInsetsRelative extends com.payair.hce.setGravity {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static int RecordsJson;
    private static int getAid;
    private static char valueOf;
    private static int writeReplace;
    private com.payair.hce.setContentInsetStartWithNavigation DigitizedCardProfile;
    private com.payair.hce.setImeOptions values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 106 - i2;
        int i5 = i + 4;
        byte[] bArr = $$a;
        int i6 = s * 2;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i3 = 0;
            int i9 = i7;
            i4 = i5 + (-i8);
            i5 = i9;
            bArr2[i3] = (byte) i4;
            int i10 = i5 + 1;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i10];
            i3++;
            int i11 = i4;
            i7 = i10;
            i5 = i11;
            int i92 = i7;
            i4 = i5 + (-i8);
            i5 = i92;
            bArr2[i3] = (byte) i4;
            int i102 = i5 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            int i1022 = i5 + 1;
            if (i3 == i6) {
            }
        }
    }

    public static com.payair.hce.setContentInsetsRelative values(java.lang.Object obj) {
        int i = RecordsJson;
        int i2 = i + 117;
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (obj != null) {
            return new com.payair.hce.setContentInsetsRelative(com.payair.hce.setMaxEms.DigitizedCardProfile(obj));
        }
        getAid = (i + 75) % 128;
        return null;
    }

    private setContentInsetsRelative(com.payair.hce.setMaxEms setmaxems) {
        if (setmaxems.valueOf() != 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "⤣\uf3daെ쑃ꚭ鵁⸗눖ᘭ举䇼꽉ᶋ\ue586⋞\ufb37遏믒䀜", "∬첃㓘㍳", (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)) - 657685726, (char) (android.view.View.resolveSize(0, 0) + 29492), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(setmaxems.valueOf());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.util.Enumeration values = setmaxems.values();
        this.DigitizedCardProfile = com.payair.hce.setContentInsetStartWithNavigation.DigitizedCardProfile(values.nextElement());
        this.values = com.payair.hce.setImeOptions.AlternateContactlessPaymentDataJson(values.nextElement());
    }

    public final com.payair.hce.setEms AlternateContactlessPaymentDataJson() throws java.io.IOException {
        com.payair.hce.setEms DigitizedCardProfile = new com.payair.hce.setMinHeight(this.values.valueOf()).DigitizedCardProfile();
        RecordsJson = (getAid + 55) % 128;
        return DigitizedCardProfile;
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            cArr = str.toCharArray();
            $11 = ($10 + 39) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length);
        java.lang.System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr5 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - android.view.View.combineMeasuredStates(0, 0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1179, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(-1, (short) 0, (byte) $$a.length, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 30, 3442 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (3831 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr3[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 25, 1864 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 41775));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(-1, (short) 0, 1, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.os.Process.getGidForName(""), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3132, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(-1, (short) 0, 0, objArr8);
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                cArr5[getwalletdata.writeReplace] = (char) ((((cArr3[intValue2] ^ charArray2[getwalletdata.writeReplace]) ^ (AlternateContactlessPaymentDataJson ^ 1263759066225628708L)) ^ ((int) (writeReplace ^ 1263759066225628708L))) ^ ((char) (valueOf ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.String str4 = new java.lang.String(cArr5);
        $10 = ($11 + 61) % 128;
        objArr[0] = str4;
    }

    @Override // com.payair.hce.setGravity, com.payair.hce.setShadowLayer
    public final com.payair.hce.setEms getAid() {
        com.payair.hce.setHintTextColor sethinttextcolor = new com.payair.hce.setHintTextColor();
        com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, this.DigitizedCardProfile}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
        com.payair.hce.setHintTextColor.AlternateContactlessPaymentDataJson(new java.lang.Object[]{sethinttextcolor, this.values}, 649338035, -649338033, java.lang.System.identityHashCode(sethinttextcolor));
        com.payair.hce.setCustomInsertionActionModeCallback setcustominsertionactionmodecallback = new com.payair.hce.setCustomInsertionActionModeCallback(sethinttextcolor);
        RecordsJson = (getAid + 103) % 128;
        return setcustominsertionactionmodecallback;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        getAid = 1;
        AlternateContactlessPaymentDataJson = 1263759066225628708L;
        writeReplace = -804334044;
        valueOf = (char) 11179;
    }

    static void init$0() {
        $$a = new byte[]{5, 98, 33, 67};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE;
    }
}
