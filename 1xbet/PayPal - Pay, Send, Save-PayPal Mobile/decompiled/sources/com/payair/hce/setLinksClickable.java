package com.payair.hce;

/* loaded from: classes4.dex */
public final class setLinksClickable extends com.payair.hce.setEms {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int valueOf;
    private static com.payair.hce.setLinksClickable[] writeReplace;
    private final byte[] values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        int i4 = b + 4;
        int i5 = i2 + 112;
        byte[] bArr = $$a;
        int i6 = i * 4;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i5 += i4;
            i4 = i7;
            i3 = i8;
            int i9 = i4 + 1;
            bArr2[i3] = (byte) i5;
            i8 = i3 + 1;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i9];
            i4 = i5;
            i5 = b2;
            i7 = i9;
            i5 += i4;
            i4 = i7;
            i3 = i8;
            int i92 = i4 + 1;
            bArr2[i3] = (byte) i5;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            int i922 = i4 + 1;
            bArr2[i3] = (byte) i5;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        byte[] bArr = (byte[]) objArr[0];
        DigitizedCardProfile = (valueOf + 77) % 128;
        if (bArr.length > 1) {
            return new com.payair.hce.setLinksClickable(bArr);
        }
        if (bArr.length == 0) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("㹃支袝Ȿ叟\uf757ᨭ䆃\ue57bࣝ갠팃皳驎솄敵蠓⾣南\uf683ᩦ䄐\ue4b2ࠠ꿚퍡", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23398, objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        int i4 = bArr[0] & 255;
        com.payair.hce.setLinksClickable[] setlinksclickableArr = writeReplace;
        if (i4 >= setlinksclickableArr.length) {
            return new com.payair.hce.setLinksClickable(com.payair.hce.getClientVersion.values(bArr));
        }
        com.payair.hce.setLinksClickable setlinksclickable = setlinksclickableArr[i4];
        if (setlinksclickable != null) {
            return setlinksclickable;
        }
        com.payair.hce.setLinksClickable setlinksclickable2 = new com.payair.hce.setLinksClickable(com.payair.hce.getClientVersion.values(bArr));
        setlinksclickableArr[i4] = setlinksclickable2;
        DigitizedCardProfile = (valueOf + 7) % 128;
        return setlinksclickable2;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        $10 = ($11 + 117) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        int i2 = $10 + 119;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 3 / 3;
        }
        while (getdsrpdata.valueOf < charArray.length) {
            int i4 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 31, 1890 - (android.os.Process.myPid() >> 22), (char) (3599 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, 1, (byte) -1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (AlternateContactlessPaymentDataJson ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 65, android.text.TextUtils.getOffsetAfter("", 0) + 1443, (char) (29682 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(0, 0, (byte) -1, objArr5);
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
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            $10 = ($11 + 51) % 128;
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 64, 1442 - android.view.MotionEvent.axisFromString(""), (char) (29682 - android.graphics.Color.argb(0, 0, 0, 0)));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(0, 0, (byte) -1, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private setLinksClickable(byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("㹩ሣ曏묭輩\ue3c5㑣ࠉ峙녰蔃\ud9da⩡縙动ꝺﭘ쾠\u206b琝䣻鴋\uf11d얻ᙂ樖뺧鍴\ue7f7㮳ే惮뒀襔\uddd7ㆊɔ囡ꪉ＠폻➛", 11351 - android.graphics.Color.red(0), objArr);
        if (!com.payair.hce.ensurePlayServicesAvailable.AlternateContactlessPaymentDataJson(((java.lang.String) objArr[0]).intern()) && com.payair.hce.setHorizontallyScrolling.DigitizedCardProfile(bArr)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("㹫\ude1cﺜ鼑뾅尓粉ᴾ㶺\uda75節鬡뮷塔磙\u1941㧗홙\uf6c5靃", (-16719749) - android.graphics.Color.rgb(0, 0, 0), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        this.values = com.payair.hce.getClientVersion.values(bArr);
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        valueOf = (DigitizedCardProfile + 105) % 128;
        return false;
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() {
        int intValue;
        int i = DigitizedCardProfile + 15;
        valueOf = i % 128;
        if (i % 2 == 0) {
            int length = this.values.length;
            intValue = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length)}, -1174070258, 1174070259, length)).intValue() - this.values.length;
        } else {
            int length2 = this.values.length;
            intValue = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length2)}, -1174070258, 1174070259, length2)).intValue() + 1 + this.values.length;
        }
        int i2 = valueOf + 99;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            return intValue;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        int i = valueOf + 75;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            setmaxlines.AlternateContactlessPaymentDataJson(109, this.values);
        } else {
            setmaxlines.AlternateContactlessPaymentDataJson(10, this.values);
        }
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        int i = (valueOf + 107) % 128;
        DigitizedCardProfile = i;
        if (setems instanceof com.payair.hce.setLinksClickable) {
            boolean AlternateContactlessPaymentDataJson2 = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(this.values, ((com.payair.hce.setLinksClickable) setems).values);
            int i2 = valueOf + 55;
            DigitizedCardProfile = i2 % 128;
            if (i2 % 2 == 0) {
                return AlternateContactlessPaymentDataJson2;
            }
            throw null;
        }
        valueOf = (i + 73) % 128;
        return false;
    }

    @Override // com.payair.hce.setGravity
    public final int hashCode() {
        int i = DigitizedCardProfile + 47;
        valueOf = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(this.values);
            throw null;
        }
        int AlternateContactlessPaymentDataJson2 = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(this.values);
        int i2 = valueOf + 21;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 == 0) {
            return AlternateContactlessPaymentDataJson2;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        valueOf = 1;
        valueOf();
        writeReplace = new com.payair.hce.setLinksClickable[12];
        valueOf = (DigitizedCardProfile + 39) % 128;
    }

    static void valueOf() {
        AlternateContactlessPaymentDataJson = 3196110201869256846L;
    }

    static void init$0() {
        $$a = new byte[]{97, -8, 44, 77};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE;
    }

    static com.payair.hce.setLinksClickable valueOf(byte[] bArr) {
        return (com.payair.hce.setLinksClickable) values(new java.lang.Object[]{bArr}, -1411131033, 1411131033, (int) java.lang.System.currentTimeMillis());
    }
}
