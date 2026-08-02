package com.payair.hce;

/* loaded from: classes4.dex */
public final class onReplenishCompleted implements com.payair.hce.setSelectedCard {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int RecordsJson;
    private static int getProfileVersion;
    private static long valueOf;
    private com.payair.hce.getNumberOfAvailableCredentialsForToken AlternateContactlessPaymentDataJson;
    private com.payair.hce.transactionCanBeResumed DigitizedCardProfile;
    private com.payair.hce.getMDESCardsUniqueTokenReferences values;
    private com.payair.hce.removeCard writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 4 - (s * 4);
        int i5 = i * 3;
        int i6 = i2 + 112;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i7;
            int i9 = i4;
            int i10 = 0;
            int i11 = (-i4) + i8;
            int i12 = i9 + 1;
            i3 = i10;
            i6 = i11;
            i4 = i12;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i13 = i6;
            i9 = i4;
            i4 = bArr[i4];
            i10 = i3 + 1;
            i8 = i13;
            int i112 = (-i4) + i8;
            int i122 = i9 + 1;
            i3 = i10;
            i6 = i112;
            i4 = i122;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        }
    }

    public onReplenishCompleted(com.payair.hce.getMDESCardsUniqueTokenReferences getmdescardsuniquetokenreferences, com.payair.hce.getNumberOfAvailableCredentialsForToken getnumberofavailablecredentialsfortoken, com.payair.hce.removeCard removecard, com.payair.hce.transactionCanBeResumed transactioncanberesumed) {
        this.values = getmdescardsuniquetokenreferences;
        this.AlternateContactlessPaymentDataJson = getnumberofavailablecredentialsfortoken;
        this.writeReplace = removecard;
        this.DigitizedCardProfile = transactioncanberesumed;
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            int i2 = $11 + 113;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = getdsrpdata.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1890, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3552));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a(0, (short) 0, 1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                    }
                    jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() | valueOf | (-4761752123935132024L);
                    java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 64, 1443 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 29682));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        a(0, (short) 0, 0, objArr5);
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
            } else {
                int i4 = getdsrpdata.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 32, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1890, (char) (3600 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(0, (short) 0, 1, objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj3);
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).longValue() ^ (valueOf ^ (-4761752123935132024L));
                java.lang.Object[] objArr8 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.view.View.resolveSizeAndState(0, 0, 0) + 1443, (char) (29681 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a(0, (short) 0, 0, objArr9);
                    obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
        }
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            $10 = ($11 + 77) % 128;
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr10 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj5 == null) {
                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1443, (char) (android.graphics.Color.green(0) + 29682));
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(0, (short) 0, 0, objArr11);
                obj5 = cls5.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
        }
        java.lang.String str2 = new java.lang.String(cArr);
        int i5 = $10 + 11;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str2;
    }

    @Override // com.payair.hce.setSelectedCard
    public final com.payair.hce.getMDESCardsUniqueTokenReferences valueOf() {
        int i = getProfileVersion + 115;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            return this.values;
        }
        throw null;
    }

    @Override // com.payair.hce.setSelectedCard
    public final com.payair.hce.getNumberOfAvailableCredentialsForToken values() {
        int i = RecordsJson;
        getProfileVersion = (i + 19) % 128;
        com.payair.hce.getNumberOfAvailableCredentialsForToken getnumberofavailablecredentialsfortoken = this.AlternateContactlessPaymentDataJson;
        int i2 = i + 107;
        getProfileVersion = i2 % 128;
        if (i2 % 2 == 0) {
            return getnumberofavailablecredentialsfortoken;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setSelectedCard
    public final com.payair.hce.removeCard AlternateContactlessPaymentDataJson() {
        int i = RecordsJson + 49;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            return this.writeReplace;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setSelectedCard
    public final byte[] DigitizedCardProfile() {
        int i = RecordsJson + 121;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            this.DigitizedCardProfile.valueOf();
            throw null;
        }
        byte[] valueOf2 = this.DigitizedCardProfile.valueOf();
        getProfileVersion = (RecordsJson + 25) % 128;
        return valueOf2;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.onReplenishCompleted onreplenishcompleted = (com.payair.hce.onReplenishCompleted) objArr[0];
        com.payair.hce.setMaximumPinTry.valueOf();
        android.os.Process.myTid();
        java.lang.Object obj = onreplenishcompleted.values;
        if (obj == null) {
            obj = "";
        }
        new java.lang.Object[]{obj};
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        java.lang.Object obj2 = onreplenishcompleted.AlternateContactlessPaymentDataJson;
        if (obj2 == null) {
            getProfileVersion = (RecordsJson + 19) % 128;
            obj2 = "";
        }
        new java.lang.Object[]{obj2};
        android.view.View.resolveSize(0, 0);
        java.lang.Object obj3 = onreplenishcompleted.writeReplace;
        if (obj3 != null) {
            int i = RecordsJson + 61;
            getProfileVersion = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        } else {
            obj3 = "";
        }
        new java.lang.Object[]{obj3};
        android.os.SystemClock.uptimeMillis();
        java.lang.Object obj4 = onreplenishcompleted.DigitizedCardProfile;
        if (obj4 != null) {
            int i2 = getProfileVersion + 103;
            RecordsJson = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } else {
            obj4 = "";
        }
        new java.lang.Object[]{obj4};
        android.text.TextUtils.indexOf("", "", 0, 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b("ᰪ數훕걉覣朅粆姲㝻\u0cd3\uea46잼\udd17몋韢海䫻‵㶪", 58734 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
        return ((java.lang.String) objArr2[0]).intern();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        RecordsJson = 1;
        valueOf = -4035325911649719569L;
    }

    static void init$0() {
        $$a = new byte[]{94, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.google.common.base.Ascii.CAN, 122};
        $$b = 58;
    }

    public final java.lang.String toString() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -733177485, 733177485, java.lang.System.identityHashCode(this));
    }
}
