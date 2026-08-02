package com.mastercard.mpsdk.card.profile.v2;

/* loaded from: classes4.dex */
public class DigitizedCardProfileV2Json implements com.mastercard.mpsdk.card.profile.DigitizedCardProfile {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static char[] DigitizedCardProfile;
    private static int valueOf;
    private static char writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "mchipCardProfile")
    public com.mastercard.mpsdk.card.profile.v2.MchipCardProfileV2Json mchipCardProfile;

    @com.payair.hce.setSelectionFromTop(valueOf = "version")
    public java.lang.String version;

    @com.payair.hce.setSelectionFromTop(valueOf = "walletRelatedData")
    public com.mastercard.mpsdk.card.profile.v2.WalletRelatedDataV2Json walletRelatedData;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 73 - (s2 * 8);
        int i5 = 3 - (s * 4);
        byte[] bArr = $$a;
        int i6 = 1 - (i * 2);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i3 = 0;
            int i9 = i5 + i8;
            i2 = i3;
            int i10 = i7;
            i4 = i9;
            i5 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i5 + 1;
            i8 = bArr[i11];
            int i12 = i4;
            i7 = i11;
            i5 = i12;
            int i92 = i5 + i8;
            i2 = i3;
            int i102 = i7;
            i4 = i92;
            i5 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    public java.lang.String buildAsJson() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u0003\u0001\u0006\u0007\u0002\u0004㘄", 7 - android.view.KeyEvent.keyCodeFromString(""), (byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 26), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(this);
        int i = AlternateContactlessPaymentDataJson + 39;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return DigitizedCardProfile2;
        }
        throw null;
    }

    public static com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json valueOf(byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr);
        new java.lang.Object[]{str};
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.ByteArrayInputStream(str.getBytes()));
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json digitizedCardProfileV2Json = (com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, inputStreamReader, com.mastercard.mpsdk.card.profile.v2.DigitizedCardProfileV2Json.class}, 509207078, -509207074, java.lang.System.identityHashCode(setonitemselectedlistener));
        valueOf = (AlternateContactlessPaymentDataJson + 103) % 128;
        return digitizedCardProfileV2Json;
    }

    @Override // com.mastercard.mpsdk.card.profile.DigitizedCardProfile
    public com.payair.hce.getStatusCodeFromServer getProfileVersion() {
        int i = valueOf + 23;
        AlternateContactlessPaymentDataJson = i % 128;
        com.payair.hce.getStatusCodeFromServer getstatuscodefromserver = com.payair.hce.getStatusCodeFromServer.DigitizedCardProfile;
        if (i % 2 != 0) {
            return getstatuscodefromserver;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        java.lang.Object obj;
        int length;
        char[] cArr;
        int i3;
        $11 = ($10 + 67) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr2 = DigitizedCardProfile;
        long j = 0;
        java.lang.Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $10 + 107;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i3])};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj3 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.SystemClock.elapsedRealtime() > j ? 1 : (android.os.SystemClock.elapsedRealtime() == j ? 0 : -1)), 2508 - android.widget.ExpandableListView.getPackedPositionGroup(j), (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6802));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((short) 0, (short) 1, 0, objArr3);
                        obj3 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj3);
                    }
                    cArr[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(writeReplace)};
        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj4 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 49, 2509 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 6802));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b((short) 0, (short) 1, 0, objArr5);
            obj4 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj4);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            $10 = ($11 + 5) % 128;
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    $10 = ($11 + 49) % 128;
                    obj = obj2;
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj5 == null) {
                        obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 30, 3597 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj5);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        $10 = ($11 + 53) % 128;
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj6 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 48, 2665 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (18889 - android.text.TextUtils.getCapsMode("", 0, 0)));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b((short) 0, (short) 0, 0, objArr8);
                            obj6 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj6);
                        }
                        obj = null;
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr7)).intValue();
                        int i5 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i6 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr2[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr2[(i5 * charValue) + i6];
                    } else {
                        obj = null;
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                            int i7 = digitizedCardJson12.DigitizedCardProfile;
                            int i8 = digitizedCardJson12.RecordsJson;
                            int i9 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i10 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr3[digitizedCardJson12.values] = cArr2[(i7 * charValue) + i8];
                            cArr3[digitizedCardJson12.values + 1] = cArr2[(i9 * charValue) + i10];
                        } else {
                            int i11 = digitizedCardJson12.DigitizedCardProfile;
                            int i12 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            int i13 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i14 = digitizedCardJson12.RecordsJson;
                            cArr3[digitizedCardJson12.values] = cArr2[(i11 * charValue) + i12];
                            cArr3[digitizedCardJson12.values + 1] = cArr2[(i13 * charValue) + i14];
                        }
                    }
                }
                digitizedCardJson12.values += 2;
                obj2 = obj;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            $10 = ($11 + 61) % 128;
            cArr3[i15] = (char) (cArr3[i15] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private /* synthetic */ void valueOf(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication, int i) {
        boolean z;
        if (getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.NULL) {
            valueOf = (AlternateContactlessPaymentDataJson + 39) % 128;
            z = true;
        } else {
            z = false;
        }
        if (i == 21) {
            if (z) {
                this.walletRelatedData = (com.mastercard.mpsdk.card.profile.v2.WalletRelatedDataV2Json) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(com.mastercard.mpsdk.card.profile.v2.WalletRelatedDataV2Json.class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                return;
            }
            this.walletRelatedData = null;
            getackautomaticallyresetbyapplication.RecordsJson();
            int i2 = AlternateContactlessPaymentDataJson + 35;
            valueOf = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        if (i == 37) {
            if (z) {
                this.mchipCardProfile = (com.mastercard.mpsdk.card.profile.v2.MchipCardProfileV2Json) iccPrivateKeyCrtComponentsJson.valueOf(new com.payair.hce.getPinAlwaysRequiredIfCurrencyProvided(com.mastercard.mpsdk.card.profile.v2.MchipCardProfileV2Json.class)).AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
                return;
            } else {
                this.mchipCardProfile = null;
                getackautomaticallyresetbyapplication.RecordsJson();
                return;
            }
        }
        if (i != 71) {
            getackautomaticallyresetbyapplication.getCvrMaskAnd();
            return;
        }
        if (!z) {
            this.version = null;
            getackautomaticallyresetbyapplication.RecordsJson();
            return;
        }
        AlternateContactlessPaymentDataJson = (valueOf + 117) % 128;
        if (getackautomaticallyresetbyapplication.getProfileVersion() != com.payair.hce.getAckPreEntryAllowed.BOOLEAN) {
            this.version = getackautomaticallyresetbyapplication.getAid();
        } else {
            this.version = java.lang.Boolean.toString(getackautomaticallyresetbyapplication.IccPrivateKeyCrtComponentsJson());
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        AlternateContactlessPaymentDataJson = 1;
        DigitizedCardProfile = new char[]{12388, 12331, 12389, 12391, 12384, 12345, 12326, 12390, 12329};
        writeReplace = (char) 1491;
    }

    public final /* synthetic */ void AlternateContactlessPaymentDataJson(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication, com.payair.hce.getPan getpan) {
        getackautomaticallyresetbyapplication.writeReplace();
        while (getackautomaticallyresetbyapplication.values()) {
            valueOf = (AlternateContactlessPaymentDataJson + 41) % 128;
            valueOf(iccPrivateKeyCrtComponentsJson, getackautomaticallyresetbyapplication, getpan.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication));
        }
        getackautomaticallyresetbyapplication.DigitizedCardProfile();
        AlternateContactlessPaymentDataJson = (valueOf + 47) % 128;
    }

    private /* synthetic */ void values(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getRemotePaymentData getremotepaymentdata, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        if (this != this.version) {
            gettrack2equivalent.writeReplace(getremotepaymentdata, 16);
            getremotepaymentdata.DigitizedCardProfile(this.version);
        }
        if (this != this.walletRelatedData) {
            int i = AlternateContactlessPaymentDataJson + 41;
            valueOf = i % 128;
            gettrack2equivalent.writeReplace(getremotepaymentdata, 6);
            if (i % 2 != 0) {
                com.mastercard.mpsdk.card.profile.v2.WalletRelatedDataV2Json walletRelatedDataV2Json = this.walletRelatedData;
                com.payair.hce.getApplicationExpiryDate.values(iccPrivateKeyCrtComponentsJson, com.mastercard.mpsdk.card.profile.v2.WalletRelatedDataV2Json.class, walletRelatedDataV2Json).writeReplace(getremotepaymentdata, walletRelatedDataV2Json);
                throw null;
            }
            com.mastercard.mpsdk.card.profile.v2.WalletRelatedDataV2Json walletRelatedDataV2Json2 = this.walletRelatedData;
            com.payair.hce.getApplicationExpiryDate.values(iccPrivateKeyCrtComponentsJson, com.mastercard.mpsdk.card.profile.v2.WalletRelatedDataV2Json.class, walletRelatedDataV2Json2).writeReplace(getremotepaymentdata, walletRelatedDataV2Json2);
        }
        if (this != this.mchipCardProfile) {
            int i2 = AlternateContactlessPaymentDataJson + 89;
            valueOf = i2 % 128;
            gettrack2equivalent.writeReplace(getremotepaymentdata, 60);
            int i3 = i2 % 2;
            com.mastercard.mpsdk.card.profile.v2.MchipCardProfileV2Json mchipCardProfileV2Json = this.mchipCardProfile;
            if (i3 != 0) {
                com.payair.hce.getApplicationExpiryDate.values(iccPrivateKeyCrtComponentsJson, com.mastercard.mpsdk.card.profile.v2.MchipCardProfileV2Json.class, mchipCardProfileV2Json).writeReplace(getremotepaymentdata, mchipCardProfileV2Json);
                throw new java.lang.ArithmeticException();
            }
            com.payair.hce.getApplicationExpiryDate.values(iccPrivateKeyCrtComponentsJson, com.mastercard.mpsdk.card.profile.v2.MchipCardProfileV2Json.class, mchipCardProfileV2Json).writeReplace(getremotepaymentdata, mchipCardProfileV2Json);
            int i4 = AlternateContactlessPaymentDataJson + 5;
            valueOf = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 5;
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{108, -62, 108, 66};
        $$b = 107;
    }

    public final /* synthetic */ void valueOf(com.payair.hce.IccPrivateKeyCrtComponentsJson iccPrivateKeyCrtComponentsJson, com.payair.hce.getRemotePaymentData getremotepaymentdata, com.payair.hce.getTrack2Equivalent gettrack2equivalent) {
        valueOf = (AlternateContactlessPaymentDataJson + 3) % 128;
        getremotepaymentdata.AlternateContactlessPaymentDataJson();
        values(iccPrivateKeyCrtComponentsJson, getremotepaymentdata, gettrack2equivalent);
        getremotepaymentdata.values();
        int i = valueOf + 57;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
