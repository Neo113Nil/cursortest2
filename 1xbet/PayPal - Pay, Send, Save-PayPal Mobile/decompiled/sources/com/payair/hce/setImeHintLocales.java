package com.payair.hce;

/* loaded from: classes4.dex */
public final class setImeHintLocales implements com.payair.hce.setShadowLayer, com.payair.hce.setTitleTextAppearance {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static long values;
    private static int writeReplace;
    private com.payair.hce.setHighlights DigitizedCardProfile;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = 3 - (b * 2);
        int i4 = (s * 4) + 1;
        int i5 = 113 - s2;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            int i7 = i3;
            int i8 = (-i3) + i6;
            i = i2;
            int i9 = i7;
            i5 = i8;
            i3 = i9;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i3 + 1;
            int i11 = i5;
            i7 = i10;
            i3 = bArr[i10];
            i6 = i11;
            int i82 = (-i3) + i6;
            i = i2;
            int i92 = i7;
            i5 = i82;
            i3 = i92;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    public setImeHintLocales(com.payair.hce.setHighlights sethighlights) {
        this.DigitizedCardProfile = sethighlights;
    }

    @Override // com.payair.hce.setTitleTextAppearance
    public final com.payair.hce.setEms RecordsJson() throws java.io.IOException {
        try {
            com.payair.hce.setImeActionLabel setimeactionlabel = new com.payair.hce.setImeActionLabel(this.DigitizedCardProfile.values());
            int i = writeReplace + 83;
            AlternateContactlessPaymentDataJson = i % 128;
            if (i % 2 != 0) {
                return setimeactionlabel;
            }
            throw null;
        } catch (java.lang.IllegalArgumentException e) {
            throw new com.payair.hce.setAutoLinkMask(e.getMessage(), e);
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            int i2 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 32, (android.os.Process.myTid() >> 22) + 1890, (char) (android.view.View.MeasureSpec.getMode(0) + 3600));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, (short) 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i2] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (values ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.view.KeyEvent.normalizeMetaState(0), 1442 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 29682));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((byte) 0, (short) 0, (short) 1, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                $11 = ($10 + 107) % 128;
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
            $11 = ($10 + 95) % 128;
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 64, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1443, (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 29682));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((byte) 0, (short) 0, (short) 1, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            $10 = ($11 + 27) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.payair.hce.setShadowLayer
    public final com.payair.hce.setEms getAid() {
        int i = AlternateContactlessPaymentDataJson + 21;
        writeReplace = i % 128;
        try {
            if (i % 2 == 0) {
                return RecordsJson();
            }
            RecordsJson();
            throw null;
        } catch (java.io.IOException e) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("䜩㱽놣㛓ꨌ⾲꒦᠁鵋ኻ阭ଡ଼肜ѿ壘纸\uf3fe睃\uecbd懣\ue51a婂\udff5匱", 31566 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr);
            throw new com.payair.hce.setLines(((java.lang.String) objArr[0]).intern(), e);
        } catch (java.lang.IllegalArgumentException e2) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("䜩㱽놣㛓ꨌ⾲꒦᠁鵋ኻ阭ଡ଼肜ѿ壘纸\uf3fe睃\uecbd懣\ue51a婂\udff5匱", android.view.View.combineMeasuredStates(0, 0) + 31567, objArr2);
            throw new com.payair.hce.setLines(((java.lang.String) objArr2[0]).intern(), e2);
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        AlternateContactlessPaymentDataJson = 1;
        values = 297706226684277204L;
    }

    static void init$0() {
        $$a = new byte[]{71, -67, -2, -10};
        $$b = 55;
    }
}
