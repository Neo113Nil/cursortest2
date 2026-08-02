package com.payair.hce;

/* loaded from: classes4.dex */
public final class getDigitizedCard {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson;
    private static final com.payair.hce.transactionCanBeResumed DigitizedCardProfile;
    private static long IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getAid;
    private static int getProfileVersion;
    private static final com.payair.hce.transactionCanBeResumed writeReplace;
    private com.payair.hce.transactionCanBeResumed valueOf;
    private com.payair.hce.transactionCanBeResumed values;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = (s * 2) + 4;
        int i4 = b * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        ?? r9 = 106 - s2;
        if (bArr == null) {
            byte b2 = r9;
            int i5 = 0;
            i2 = i3;
            i3 += b2;
            i2++;
            i = i5;
            bArr2[i] = (byte) i3;
            i5 = i + 1;
            if (i == 0 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b2 = bArr[i2];
            i3 += b2;
            i2++;
            i = i5;
            bArr2[i] = (byte) i3;
            i5 = i + 1;
            if (i == 0 - i4) {
            }
        } else {
            i = 0;
            i2 = i3;
            i3 = r9;
            bArr2[i] = (byte) i3;
            i5 = i + 1;
            if (i == 0 - i4) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        valueOf();
        writeReplace = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(com.visa.cbp.getEncExpo.IResultReceiver);
        DigitizedCardProfile = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((byte) -126);
        AlternateContactlessPaymentDataJson = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((byte) -108);
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 9) % 128;
    }

    public getDigitizedCard(byte[] bArr, boolean z) throws com.payair.hce.updateSukFileName {
        if (bArr == null) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getApplicationLifeCycleData);
        }
        try {
            com.payair.hce.getWalletIdentificationDataProvider writeReplace2 = com.payair.hce.getWalletIdentificationDataProvider.writeReplace(bArr);
            com.payair.hce.transactionCanBeResumed valueOf = writeReplace2.valueOf();
            com.payair.hce.transactionCanBeResumed transactioncanberesumed = writeReplace;
            if (!valueOf.valueOf(transactioncanberesumed)) {
                com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate = com.payair.hce.requestTaskStatusUpdate.getPinIvCvc3Track2;
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "᪬僫꾅老鉸趶\uaac3\ued0b軬얏ꗰ侇\ue116换\uef59\ued07騌\ue9e7儼궘\udbb0폱䨖鰭ඵ\ued7bᾏ犾㌆凪풻\udeb6讒ފ㍵雞ꈡᨶ摥醩ᒉ䄗躊㻸\ue596獞䨣", "▲ᨧㇾ䯬", (-31840474) - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), objArr);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
                sb.append(transactioncanberesumed);
                throw new com.payair.hce.updateSukFileName(requesttaskstatusupdate, sb.toString());
            }
            java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> AlternateContactlessPaymentDataJson2 = com.payair.hce.getWalletIdentificationDataProvider.AlternateContactlessPaymentDataJson(writeReplace2.AlternateContactlessPaymentDataJson(), 0);
            com.payair.hce.transactionCanBeResumed transactioncanberesumed2 = DigitizedCardProfile;
            com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider = AlternateContactlessPaymentDataJson2.get(transactioncanberesumed2);
            if (getwalletidentificationdataprovider == null) {
                com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate2 = com.payair.hce.requestTaskStatusUpdate.getPinIvCvc3Track2;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "᪬僫꾅老鉸趶\uaac3\ued0b軬얏ꗰ侇\ue116换\uef59\ued07騌\ue9e7儼궘\udbb0폱䨖鰭ඵ\ued7bᾏ犾㌆凪풻\udeb6讒ފ㍵雞ꈡᨶ摥醩ᒉ䄗躊㻸\ue596獞䨣", "▲ᨧㇾ䯬", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 31840474, (char) android.text.TextUtils.indexOf("", ""), objArr2);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(((java.lang.String) objArr2[0]).intern());
                sb2.append(transactioncanberesumed2);
                throw new com.payair.hce.updateSukFileName(requesttaskstatusupdate2, sb2.toString());
            }
            com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson3 = getwalletidentificationdataprovider.AlternateContactlessPaymentDataJson();
            this.values = AlternateContactlessPaymentDataJson3;
            if (AlternateContactlessPaymentDataJson3.DigitizedCardProfile() != 2) {
                com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate3 = com.payair.hce.requestTaskStatusUpdate.getPinIvCvc3Track2;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "턆崪懲\udcc1峜ｋ㫜場퓙ర葡碩㊋⭽㐦泈흶᭄鎆Ŭ\ue38c禆㠣樈宿悂ದᎉ됏엺\u086f적䈤켡뉀勈雱둔媩얢☨౮鏱眝得\ue630\uf5fc礟ᯓ혐瑍낮", "쪇\uf41fﻣ鷆", android.graphics.Color.argb(0, 0, 0, 0), (char) (50942 - android.text.TextUtils.getTrimmedLength("")), objArr3);
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(((java.lang.String) objArr3[0]).intern());
                sb3.append(this.values.DigitizedCardProfile());
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "왼눖扬\ue10e\uec42몷礛鋋┚绹�캙ᾛ", "Ȁ\ue55d\uf0ae齜", (-1360700158) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 23792), objArr4);
                sb3.append(((java.lang.String) objArr4[0]).intern());
                throw new com.payair.hce.updateSukFileName(requesttaskstatusupdate3, sb3.toString());
            }
            if (z) {
                com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(new java.lang.Object[]{this.values, 1, 7, java.lang.Boolean.FALSE}, 334804465, -334804462, 1);
            }
            com.payair.hce.transactionCanBeResumed transactioncanberesumed3 = AlternateContactlessPaymentDataJson;
            com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider2 = AlternateContactlessPaymentDataJson2.get(transactioncanberesumed3);
            if (getwalletidentificationdataprovider2 == null) {
                com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate4 = com.payair.hce.requestTaskStatusUpdate.getPinIvCvc3Track2;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "᪬僫꾅老鉸趶\uaac3\ued0b軬얏ꗰ侇\ue116换\uef59\ued07騌\ue9e7儼궘\udbb0폱䨖鰭ඵ\ued7bᾏ犾㌆凪풻\udeb6讒ފ㍵雞ꈡᨶ摥醩ᒉ䄗躊㻸\ue596獞䨣", "▲ᨧㇾ䯬", android.graphics.Color.blue(0) - 31840475, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), objArr5);
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder(((java.lang.String) objArr5[0]).intern());
                sb4.append(transactioncanberesumed3);
                throw new com.payair.hce.updateSukFileName(requesttaskstatusupdate4, sb4.toString());
            }
            this.valueOf = getwalletidentificationdataprovider2.AlternateContactlessPaymentDataJson();
        } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi unused) {
            com.payair.hce.setMaximumPinTry.valueOf();
            android.text.TextUtils.indexOf("", "", 0, 0);
            android.view.ViewConfiguration.getLongPressTimeout();
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getPinIvCvc3Track2);
        }
    }

    public final com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson() {
        int i = RecordsJson;
        SdkCoreAlternateContactlessPaymentDataImpl = (i + 107) % 128;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.valueOf;
        int i2 = i + 65;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 != 0) {
            return transactioncanberesumed;
        }
        throw null;
    }

    public final com.payair.hce.transactionCanBeResumed writeReplace() {
        int i = RecordsJson;
        int i2 = i + 41;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.values;
        int i3 = i + 3;
        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
        if (i3 % 2 != 0) {
            return transactioncanberesumed;
        }
        throw null;
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        int i2 = $11;
        $10 = (i2 + 91) % 128;
        if (str3 != null) {
            $10 = (i2 + 75) % 128;
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        java.lang.Object obj = null;
        if (str2 != null) {
            int i3 = $10 + 13;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            cArr2 = str2.toCharArray();
        } else {
            cArr2 = str2;
        }
        char[] cArr4 = cArr2;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = charArray.length;
        char[] cArr6 = new char[length2];
        java.lang.System.arraycopy(cArr3, 0, cArr5, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr4.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 70, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1180, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, (byte) 0, (byte) $$a.length, objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 30, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3443, (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 3831))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 26, android.view.View.resolveSize(0, 0) + 1864, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 41774));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b((short) 0, (byte) 0, (short) 1, objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.text.TextUtils.getCapsMode("", 0, 0), 3132 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b((short) 0, (byte) 0, (short) 0, objArr8);
                    obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((cArr5[intValue2] ^ cArr4[getwalletdata.writeReplace]) ^ (IccPrivateKeyCrtComponentsJson ^ 1263759066225628708L)) ^ ((int) (getProfileVersion ^ 1263759066225628708L))) ^ ((char) (getAid ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                cArr5 = cArr5;
                obj = null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    static void init$0() {
        $$a = new byte[]{94, 46, -101, 115};
        $$b = 138;
    }

    static void valueOf() {
        IccPrivateKeyCrtComponentsJson = 1263759066225628708L;
        getProfileVersion = -804334044;
        getAid = (char) 4601;
    }
}
