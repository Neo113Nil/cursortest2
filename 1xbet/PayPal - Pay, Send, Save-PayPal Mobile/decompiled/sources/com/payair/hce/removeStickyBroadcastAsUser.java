package com.payair.hce;

/* loaded from: classes4.dex */
public final class removeStickyBroadcastAsUser {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char DigitizedCardProfile;
    private static char RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int[] getAid;
    private static int getProfileVersion;
    private static char values;
    private static char writeReplace;
    private com.payair.hce.sendOrderedBroadcast AlternateContactlessPaymentDataJson;
    private final com.payair.hce.checkPermission valueOf = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        int i4 = 110 - (i2 * 44);
        int i5 = i * 3;
        int i6 = (b * 4) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i4 = i5;
            int i7 = i6;
            int i8 = 0;
            i4 += -i6;
            i6 = i7 + 1;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i3 + 1;
            i7 = i6;
            i6 = bArr[i6];
            i8 = i9;
            i4 += -i6;
            i6 = i7 + 1;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    public removeStickyBroadcastAsUser(com.payair.hce.sendOrderedBroadcast sendorderedbroadcast) {
        this.AlternateContactlessPaymentDataJson = sendorderedbroadcast;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            $11 = ($10 + 1) % 128;
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                $10 = ($11 + 57) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (values ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(RecordsJson)};
                    int i4 = c2 + i2;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 1335 - android.view.KeyEvent.normalizeMetaState(0), (char) android.view.View.MeasureSpec.getMode(0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c(0, 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (writeReplace ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(DigitizedCardProfile)};
                    int i5 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 62, 1334 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.view.View.getDefaultSize(0, 0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c(0, 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
            cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.graphics.Color.argb(0, 0, 0, 0) + 3543, (char) android.text.TextUtils.getTrimmedLength(""))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    private static void b(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getAid;
        long j = 0;
        int i2 = 16;
        int i3 = 1;
        int i4 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i3];
                    objArr2[0] = java.lang.Integer.valueOf(iArr3[i5]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getTapTimeout() >> i2), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 29, (char) (android.widget.ExpandableListView.getPackedPositionChild(j) + 1))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr4[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i5++;
                    j = 0;
                    i2 = 16;
                    i3 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = getAid;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr6[i6])};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr2 = iArr6;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.KeyEvent.keyCodeFromString(""), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 30, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i6++;
                iArr6 = iArr2;
                i4 = 0;
            }
            iArr6 = iArr7;
        }
        int i7 = i4;
        java.lang.System.arraycopy(iArr6, i7, iArr5, i7, length2);
        istransitsupported.valueOf = i7;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[i7] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            int i8 = 0;
            for (int i9 = 16; i8 < i9; i9 = 16) {
                istransitsupported.DigitizedCardProfile ^= iArr5[i8];
                java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 32, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 5088, (char) (android.view.MotionEvent.axisFromString("") + 1))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i8++;
            }
            int i10 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i10;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i11 = istransitsupported.DigitizedCardProfile;
            int i12 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {istransitsupported, istransitsupported};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj4 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2922 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 3037));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                c(0, 1, (byte) 0, objArr6);
                obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
            i7 = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    public final com.payair.hce.sendStickyBroadcastAsUser writeReplace(java.lang.String str) throws com.payair.hce.VisaReperso, java.security.GeneralSecurityException {
        if (str != null) {
            SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 97) % 128;
            if (str.length() != 0) {
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.AlternateContactlessPaymentDataJson;
                if (!((com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast))).writeReplace()) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a("緟꾋죶빒֨煒㮗̕豉\uf370❞鴐\ue857뷧劂\uf8ed\udd1e١덕铍憅쐩\ufdebᲝᦓ琰곔더\uf155﨧\uefa7윪", 31 - android.view.View.MeasureSpec.getSize(0), objArr);
                    new java.lang.Object[]{((java.lang.String) objArr[0]).intern()};
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a("ꒄ弾⡯๘鵩轝㜜ꓟ㐂\udd28腧汩Ⴔɏ忉ꕄ\uf34c\uedbc艧㼸Ｉ坛⛸逦౬鏫ጃ⿏役ὗ롵\ue0f0", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 33, objArr2);
                    java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a("緟꾋죶빒֨煒㮗̕豉\uf370❞鴐\ue857뷧劂\uf8ed\udd1e١덕铍憅쐩\ufdebᲝᦓ琰곔더\uf155﨧\uefa7윪", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 31, objArr3);
                    throw new com.payair.hce.VisaReperso(intern, ((java.lang.String) objArr3[0]).intern());
                }
                final com.mastercard.mpsdk.remotemanagement.api.json.CmsDPushNotification valueOf = com.mastercard.mpsdk.remotemanagement.api.json.CmsDPushNotification.valueOf(str);
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.AlternateContactlessPaymentDataJson;
                java.lang.String DigitizedCardProfile2 = ((com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast2))).values().DigitizedCardProfile();
                if (DigitizedCardProfile2 == null || DigitizedCardProfile2.length() == 0) {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a("瘩\ude6a㳉萍\uf588揔\udb84\uf8f2绌麨连鯰췘娶烠諻룝\ue0db⣹踒", 19 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr4);
                    new java.lang.Object[]{((java.lang.String) objArr4[0]).intern()};
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a("蚦羚﹖Ἁ\udcd2䃕⸟\uf65e罡\u0b7a㏢붞\ue3ee\uf6aa洛\uebc2⃓削ᰥ钞᳧庑勸䚨乷\udcda", android.text.TextUtils.indexOf("", "") + 26, objArr5);
                    java.lang.String intern2 = ((java.lang.String) objArr5[0]).intern();
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    a("瘩\ude6a㳉萍\uf588揔\udb84\uf8f2绌麨连鯰췘娶烠諻룝\ue0db⣹踒", android.text.TextUtils.getCapsMode("", 0, 0) + 19, objArr6);
                    throw new com.payair.hce.VisaReperso(intern2, ((java.lang.String) objArr6[0]).intern());
                }
                if (!DigitizedCardProfile2.equals(valueOf.getMobileKeysetId())) {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a("瘩\ude6a㳉萍\uf588揔\udb84\uf8f2绌麨߬筕憅쐩췘娶裠\ud931劂\uf8ed↠\uedf7", 22 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr7);
                    new java.lang.Object[]{((java.lang.String) objArr7[0]).intern()};
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a("\ueb32캧\uef51％눲ꀾ鵩轝ᑫ⸭ᗈ鎭革\uedcfꞌ\u1ad5赶ゲ⡯๘ꨰ黶\udf1e\ue7e4頔灪鐚\uf827Ⴔɏ젼ಎ튎ༀ", 32 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr8);
                    java.lang.String intern3 = ((java.lang.String) objArr8[0]).intern();
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a("瘩\ude6a㳉萍\uf588揔\udb84\uf8f2绌麨߬筕憅쐩췘娶裠\ud931劂\uf8ed↠\uedf7", 22 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr9);
                    throw new com.payair.hce.VisaReperso(intern3, ((java.lang.String) objArr9[0]).intern());
                }
                java.lang.String encryptedData = valueOf.getEncryptedData();
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast3 = this.AlternateContactlessPaymentDataJson;
                com.payair.hce.isAutomaticTimeEnabled values2 = ((com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast3}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast3))).values();
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast4 = this.AlternateContactlessPaymentDataJson;
                byte[] AlternateContactlessPaymentDataJson = ((com.payair.hce.onNewToken) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast4}, 1288350908, -1288350905, java.lang.System.identityHashCode(sendorderedbroadcast4))).AlternateContactlessPaymentDataJson(values2.values(), values2.valueOf(), android.util.Base64.decode(encryptedData.getBytes(), 2));
                if (AlternateContactlessPaymentDataJson.length > 16) {
                    final com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData valueOf2 = com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData.valueOf(java.util.Arrays.copyOfRange(AlternateContactlessPaymentDataJson, 16, AlternateContactlessPaymentDataJson.length));
                    valueOf2.setMobileKeysetId(valueOf.getMobileKeysetId());
                    return new com.payair.hce.sendStickyBroadcastAsUser() { // from class: com.payair.hce.removeStickyBroadcastAsUser.4
                        private static int AlternateContactlessPaymentDataJson = 0;
                        private static int DigitizedCardProfile = 1;

                        public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr10, int i, int i2, int i3) {
                            int i4 = ~i;
                            int i5 = ~i2;
                            int i6 = ~i3;
                            int i7 = (i * (-209)) + (i2 * (-209)) + ((~(i4 | i5)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + (((~(i5 | i6)) | (~(i4 | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + (((~(i | i5 | i3)) | (~(i2 | i4 | i6))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
                            if (i7 == 1) {
                                return writeReplace(objArr10);
                            }
                            if (i7 == 2) {
                                return values(objArr10);
                            }
                            com.payair.hce.removeStickyBroadcastAsUser.AnonymousClass4 anonymousClass4 = (com.payair.hce.removeStickyBroadcastAsUser.AnonymousClass4) objArr10[0];
                            int i8 = AlternateContactlessPaymentDataJson;
                            DigitizedCardProfile = (((i8 | 41) << 1) - (i8 ^ 41)) % 128;
                            java.lang.String mobileKeysetId = valueOf.getMobileKeysetId();
                            int i9 = DigitizedCardProfile;
                            int i10 = i9 & 33;
                            int i11 = ((i9 ^ 33) | i10) << 1;
                            int i12 = -((i9 | 33) & (~i10));
                            AlternateContactlessPaymentDataJson = (((i11 | i12) << 1) - (i12 ^ i11)) % 128;
                            return mobileKeysetId;
                        }

                        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr10) {
                            com.payair.hce.removeStickyBroadcastAsUser.AnonymousClass4 anonymousClass4 = (com.payair.hce.removeStickyBroadcastAsUser.AnonymousClass4) objArr10[0];
                            int i = AlternateContactlessPaymentDataJson;
                            int i2 = ((i | 89) << 1) - (i ^ 89);
                            DigitizedCardProfile = i2 % 128;
                            com.mastercard.mpsdk.remotemanagement.api.json.CmsDPushNotification cmsDPushNotification = valueOf;
                            if (i2 % 2 != 0) {
                                return cmsDPushNotification.getResponseHost();
                            }
                            cmsDPushNotification.getResponseHost();
                            throw null;
                        }

                        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr10) {
                            com.payair.hce.removeStickyBroadcastAsUser.AnonymousClass4 anonymousClass4 = (com.payair.hce.removeStickyBroadcastAsUser.AnonymousClass4) objArr10[0];
                            int i = AlternateContactlessPaymentDataJson;
                            DigitizedCardProfile = (((i & 106) + (i | 106)) - 1) % 128;
                            com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData cmsDSessionData = valueOf2;
                            int identityHashCode = java.lang.System.identityHashCode(anonymousClass4);
                            int i2 = identityHashCode | 279912731;
                            int i3 = ~i2;
                            int i4 = -(-(((i3 ^ (-2065714381)) | (i3 & (-2065714381))) * (-658)));
                            int i5 = i4 & (-34922535);
                            int i6 = -(-((i4 ^ (-34922535)) | i5));
                            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                            int i8 = i7 & 387421760;
                            int i9 = 387421760 | i7;
                            int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                            int i11 = identityHashCode & 279912731;
                            int i12 = i11 | ((~i11) & i2);
                            int i13 = ~i12;
                            int i14 = (i12 | i13) & i13;
                            int i15 = i14 & (-2075094496);
                            int i16 = (i14 | (-2075094496)) & (~i15);
                            int i17 = -(-(((i16 ^ i15) | (i16 & i15)) * 658));
                            int identityHashCode2 = java.lang.System.identityHashCode(anonymousClass4);
                            int i18 = identityHashCode2 & (-84626);
                            int i19 = (~i18) & (identityHashCode2 | (-84626));
                            int i20 = ~((i18 ^ i19) | (i18 & i19));
                            int i21 = ((~i20) & 124264460) | ((-124264461) & i20);
                            int i22 = 124264460 & i20;
                            int i23 = (-2) - (~((-1950391403) - (~(-(-(((i21 ^ i22) | (i22 & i21)) * (-476)))))));
                            int i24 = -(-(i20 * 952));
                            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                            int i26 = (~((~identityHashCode2) | (-84626))) * 476;
                            if ((((~i17) & i10) | ((~i10) & i17)) + ((i17 & i10) << 1) <= (i25 ^ i26) + ((i26 & i25) << 1)) {
                                return cmsDSessionData;
                            }
                            throw new java.lang.ArithmeticException();
                        }

                        @Override // com.payair.hce.sendStickyBroadcastAsUser
                        public final com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData valueOf() {
                            return (com.mastercard.mpsdk.remotemanagement.api.json.CmsDSessionData) valueOf(new java.lang.Object[]{this}, -630366474, 630366475, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.sendStickyBroadcastAsUser
                        public final java.lang.String DigitizedCardProfile() {
                            return (java.lang.String) valueOf(new java.lang.Object[]{this}, -971666949, 971666949, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.payair.hce.sendStickyBroadcastAsUser
                        public final java.lang.String AlternateContactlessPaymentDataJson() {
                            return (java.lang.String) valueOf(new java.lang.Object[]{this}, 1904755378, -1904755376, java.lang.System.identityHashCode(this));
                        }
                    };
                }
                getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 25) % 128;
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a("룝\ue0dbී쉑Ფ\uf20f\udfa5뗎룝\ue0db꼌ꀬẢ軡", 13 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr10);
                try {
                    java.lang.Object[] objArr11 = {((java.lang.String) objArr10[0]).intern()};
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    b(new int[]{-431079561, -868167017, -1063200376, -1732200053, 1794853718, -1085394247, 819230551, 652562947, 1721660694, 482498996, -1833024191, -2097484849, 1794853718, -1085394247, -1330962671, 553639034, 1444600154, 2102522577, 686194529, 1103115135}, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 38, objArr12);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr12[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr11));
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a("ɹ㤐绔屪\uee8cᅩ\uf26f푀离泤쐠待役ὗ⿊覦\udbbc㵇鈮年넨졸洛\uebc2⃓削畵隴\u0bde䕹辙淏\uf3b2ћ곺\ue558⃣惕꣢\uf720", (android.os.Process.myTid() >> 22) + 40, objArr13);
        java.lang.String intern4 = ((java.lang.String) objArr13[0]).intern();
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a("룝\ue0dbී쉑Ფ\uf20f\udfa5뗎룝\ue0db꼌ꀬẢ軡", 13 - (android.os.Process.myTid() >> 22), objArr14);
        throw new com.payair.hce.VisaReperso(intern4, ((java.lang.String) objArr14[0]).intern());
    }

    static void DigitizedCardProfile() {
        getAid = new int[]{-413356203, 1295152989, -962837318, -479522387, 267715362, 293084517, 1282203770, -2078396196, -464075789, 835903021, 854545041, 581934765, -70820253, -544097327, -485533804, -683636598, -1309621585, -1039802696};
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        DigitizedCardProfile();
        writeReplace = (char) 51397;
        DigitizedCardProfile = (char) 63853;
        values = (char) 65326;
        RecordsJson = (char) 39479;
    }

    static void init$0() {
        $$a = new byte[]{107, -45, -30, com.google.common.base.Ascii.FS};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE;
    }
}
