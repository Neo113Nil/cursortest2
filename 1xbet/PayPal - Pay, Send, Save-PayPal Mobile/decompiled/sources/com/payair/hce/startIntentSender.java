package com.payair.hce;

/* loaded from: classes4.dex */
public final class startIntentSender implements com.payair.hce.VisaRepersoInitializer {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static long getAid;
    private static int getProfileVersion;
    private final com.payair.hce.checkPermission AlternateContactlessPaymentDataJson = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);
    private java.lang.String DigitizedCardProfile;
    private com.payair.hce.sendOrderedBroadcast valueOf;
    private com.payair.hce.isSessionAvailable values;
    private com.payair.hce.unregisterReceiver writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = b * 4;
        byte[] bArr = $$a;
        int i4 = 119 - (s * 2);
        int i5 = i + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i4 += i6;
            bArr2[i2] = (byte) i4;
            i5++;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i5];
            i4 += i6;
            bArr2[i2] = (byte) i4;
            i5++;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i5++;
            if (i2 == i3) {
            }
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        $10 = ($11 + 67) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(getAid ^ (-3824242241614154557L), charArray, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            $11 = ($10 + 89) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(getAid)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getOffsetAfter("", 0), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1921, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((short) 1, (byte) 0, -1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 26, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 428, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31610));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c((short) 0, (byte) 0, -1, objArr5);
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
        objArr[0] = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
    }

    private static void b(java.lang.String str, boolean z, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4]), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 43, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2073, (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 60037));
                    byte b = (byte) (-$$a[2]);
                    byte b2 = (byte) (b - 2);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(b, b2, (byte) (b2 - 1), objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 53, 3544 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
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
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr2 = new char[i3];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i3);
            java.lang.System.arraycopy(cArr2, 0, cArr, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr3 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 52, 3543 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.payair.hce.VisaRepersoInitializer
    public final void initialize(com.payair.hce.onNewToken onnewtoken, com.payair.hce.hashCode hashcode, com.payair.hce.ExpirationDate expirationDate, com.payair.hce.setStatusMessage setstatusmessage, com.payair.hce.updateRNSInformation updaternsinformation, com.payair.hce.copydefault copydefaultVar) {
        this.valueOf = new com.payair.hce.sendOrderedBroadcast(onnewtoken, hashcode, expirationDate, setstatusmessage, updaternsinformation, copydefaultVar);
        this.writeReplace = new com.payair.hce.unregisterReceiver(this.valueOf);
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 89) % 128;
    }

    @Override // com.payair.hce.VisaRepersoInitializer
    public final java.lang.String requestReplenish(java.lang.String str, com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] singleUseKeyStatusArr) {
        java.lang.String valueOf = this.writeReplace.valueOf(com.payair.hce.sendOrderedBroadcastAsUser.getAid, new com.payair.hce.getNoBackupFilesDir(str, singleUseKeyStatusArr));
        this.DigitizedCardProfile = valueOf;
        int i = getProfileVersion + 113;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return valueOf;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.VisaRepersoInitializer
    public final java.lang.String requestDeleteCard(java.lang.String str, com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] singleUseKeyStatusArr) {
        java.lang.String valueOf = this.writeReplace.valueOf(com.payair.hce.sendOrderedBroadcastAsUser.getPaymentFci, new com.payair.hce.openFileOutput(str, singleUseKeyStatusArr));
        this.DigitizedCardProfile = valueOf;
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 45) % 128;
        return valueOf;
    }

    @Override // com.payair.hce.VisaRepersoInitializer
    public final void processNotificationData(java.lang.String str) throws com.payair.hce.VisaReperso {
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 99) % 128;
        this.writeReplace.writeReplace(str);
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 121) % 128;
    }

    @Override // com.payair.hce.copy
    public final com.payair.hce.create getRegistrationRequestData(byte[] bArr, com.payair.hce.getErrors geterrors) throws java.security.GeneralSecurityException {
        int i = getProfileVersion + 1;
        IccPrivateKeyCrtComponentsJson = i % 128;
        final com.payair.hce.accessperformEnrollDas accessperformenrolldas = null;
        try {
            if (i % 2 != 0) {
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.valueOf;
                this.values = ((com.payair.hce.onNewToken) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, 1288350908, -1288350905, java.lang.System.identityHashCode(sendorderedbroadcast))).getProfileVersion();
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.valueOf;
                final com.payair.hce._sendUpdateRNSInformation AlternateContactlessPaymentDataJson = ((com.payair.hce.onNewToken) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, 1288350908, -1288350905, java.lang.System.identityHashCode(sendorderedbroadcast2))).AlternateContactlessPaymentDataJson(this.values, bArr);
                if (geterrors != null) {
                    com.payair.hce.sendOrderedBroadcast sendorderedbroadcast3 = this.valueOf;
                    com.payair.hce.onNewToken onnewtoken = (com.payair.hce.onNewToken) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast3}, 1288350908, -1288350905, java.lang.System.identityHashCode(sendorderedbroadcast3));
                    com.payair.hce.isSessionAvailable issessionavailable = this.values;
                    com.payair.hce.sendOrderedBroadcast sendorderedbroadcast4 = this.valueOf;
                    accessperformenrolldas = onnewtoken.AlternateContactlessPaymentDataJson(issessionavailable, (com.payair.hce.updateRNSInformation) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast4}, 389581613, -389581611, java.lang.System.identityHashCode(sendorderedbroadcast4)), geterrors.values());
                    getProfileVersion = (IccPrivateKeyCrtComponentsJson + 77) % 128;
                }
                return new com.payair.hce.create() { // from class: com.payair.hce.startIntentSender.1
                    private static int DigitizedCardProfile = 1;
                    private static int valueOf;

                    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i2, int i3, int i4) {
                        int i5 = ~((~i2) | i3);
                        int i6 = ~i3;
                        int i7 = ~i4;
                        if ((i2 * (-1975)) + (i3 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) + ((i4 | i5) * 988) + (((~(i2 | i6)) | (~(i2 | i7))) * (-1976)) + (((~(i6 | i4)) | i5 | (~(i3 | i7))) * 988) == 1) {
                            return AlternateContactlessPaymentDataJson(objArr);
                        }
                        com.payair.hce.startIntentSender.AnonymousClass1 anonymousClass1 = (com.payair.hce.startIntentSender.AnonymousClass1) objArr[0];
                        int i8 = DigitizedCardProfile;
                        int i9 = i8 & 77;
                        int i10 = (((((i8 ^ 77) | i9) << 1) - (~(-((i8 | 77) & (~i9))))) - 1) % 128;
                        valueOf = i10;
                        com.payair.hce._sendUpdateRNSInformation _sendupdaternsinformation = AlternateContactlessPaymentDataJson;
                        int i11 = i10 & 109;
                        int i12 = (i10 ^ 109) | i11;
                        DigitizedCardProfile = ((i11 & i12) + (i11 | i12)) % 128;
                        return _sendupdaternsinformation;
                    }

                    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
                        com.payair.hce.startIntentSender.AnonymousClass1 anonymousClass1 = (com.payair.hce.startIntentSender.AnonymousClass1) objArr[0];
                        int i2 = valueOf;
                        int i3 = (((i2 ^ 49) | (i2 & 49)) << 1) - ((i2 & (-50)) | ((~i2) & 49));
                        int i4 = i3 % 128;
                        DigitizedCardProfile = i4;
                        com.payair.hce.accessperformEnrollDas accessperformenrolldas2 = accessperformenrolldas;
                        if (i3 % 2 == 0) {
                            throw null;
                        }
                        int i5 = i4 & 69;
                        int i6 = -(-((i4 ^ 69) | i5));
                        valueOf = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
                        return accessperformenrolldas2;
                    }

                    @Override // com.payair.hce.create
                    public final com.payair.hce.accessperformEnrollDas DigitizedCardProfile() {
                        return (com.payair.hce.accessperformEnrollDas) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 366155235, -366155234, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.create
                    public final com.payair.hce._sendUpdateRNSInformation values() {
                        return (com.payair.hce._sendUpdateRNSInformation) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 414418171, -414418171, java.lang.System.identityHashCode(this));
                    }
                };
            }
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast5 = this.valueOf;
            this.values = ((com.payair.hce.onNewToken) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast5}, 1288350908, -1288350905, java.lang.System.identityHashCode(sendorderedbroadcast5))).getProfileVersion();
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast6 = this.valueOf;
            ((com.payair.hce.onNewToken) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast6}, 1288350908, -1288350905, java.lang.System.identityHashCode(sendorderedbroadcast6))).AlternateContactlessPaymentDataJson(this.values, bArr);
            throw null;
        } catch (java.security.GeneralSecurityException e) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("ꑂℊ랰歾ꐄ৴\ue6e7ዏٛ\uea75䐪睓\ue0d5䲽⇡헎䍂ㄹ轰\u0a4aⷕ鏬泭棇衜瑠쩮쵞櫅훣鞶⏉핃뭸畧聚럑ᴁ튎\ue6b3ቿﾃ끋嬪ﳿꀉ᷃릹彥˗ﭱḋ㧙\ue73a壽粁\ue457䦱♮턘䛍⨿菷㞋ⅎ貰慭鐚菐焇켁쪱", android.text.TextUtils.getTrimmedLength("") + 1, objArr);
            try {
                java.lang.Object[] objArr2 = {((java.lang.String) objArr[0]).intern(), e};
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                b("\u0003\f\u000f�\uffff\r\uffc8\ufffb\u0010\ufffb\u0004\b\t\u0003\u000e\n\uffff�\u0012\uffdf\u0013\u000e\u0003\f\u000f�\uffff￭\u0006\ufffb\f\uffff\b\uffff￡\uffc8\u0013\u000e", true, 104 - android.view.Gravity.getAbsoluteGravity(0, 0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12, 38 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr3[0]).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(objArr2));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.startIntentSender startintentsender = (com.payair.hce.startIntentSender) objArr[0];
        com.payair.hce.accesssetFullInitializationDonep accesssetfullinitializationdonep = (com.payair.hce.accesssetFullInitializationDonep) objArr[1];
        java.lang.String str = (java.lang.String) objArr[2];
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 37) % 128;
        final java.lang.String writeReplace = accesssetfullinitializationdonep.writeReplace();
        com.payair.hce.isSessionAvailable issessionavailable = startintentsender.values;
        if (issessionavailable != null && ((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{issessionavailable}, -1877837077, 1877837077, java.lang.System.identityHashCode(issessionavailable))) != null) {
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = startintentsender.valueOf;
            com.payair.hce.onNewToken onnewtoken = (com.payair.hce.onNewToken) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, 1288350908, -1288350905, java.lang.System.identityHashCode(sendorderedbroadcast));
            try {
                final com.payair.hce.isSessionAvailable AlternateContactlessPaymentDataJson = onnewtoken.AlternateContactlessPaymentDataJson(startintentsender.values, accesssetfullinitializationdonep.values());
                final com.payair.hce.isSessionAvailable AlternateContactlessPaymentDataJson2 = onnewtoken.AlternateContactlessPaymentDataJson(startintentsender.values, accesssetfullinitializationdonep.DigitizedCardProfile());
                final com.payair.hce.isSessionAvailable AlternateContactlessPaymentDataJson3 = onnewtoken.AlternateContactlessPaymentDataJson(startintentsender.values, accesssetfullinitializationdonep.valueOf());
                com.payair.hce.isAutomaticTimeEnabled isautomatictimeenabled = new com.payair.hce.isAutomaticTimeEnabled() { // from class: com.payair.hce.startIntentSender.5
                    private static int IccPrivateKeyCrtComponentsJson = 1;
                    private static int getAid;

                    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2, int i, int i2, int i3) {
                        int i4 = ~i;
                        int i5 = ~i3;
                        int i6 = ~i2;
                        int i7 = i4 | i6;
                        int i8 = (i * 868) + (i2 * 868) + (((~(i4 | i5)) | (~(i6 | i5))) * (-867)) + (((~i7) | (~(i4 | i3)) | (~(i6 | i3))) * (-1734)) + (((~(i | i6 | i3)) | (~(i2 | i4 | i3)) | (~(i5 | i7))) * 867);
                        if (i8 == 1) {
                            return DigitizedCardProfile(objArr2);
                        }
                        if (i8 == 2) {
                            return AlternateContactlessPaymentDataJson(objArr2);
                        }
                        if (i8 == 3) {
                            com.payair.hce.startIntentSender.AnonymousClass5 anonymousClass5 = (com.payair.hce.startIntentSender.AnonymousClass5) objArr2[0];
                            int i9 = getAid;
                            IccPrivateKeyCrtComponentsJson = (((i9 | 21) << 1) - (i9 ^ 21)) % 128;
                            return AlternateContactlessPaymentDataJson3;
                        }
                        com.payair.hce.startIntentSender.AnonymousClass5 anonymousClass52 = (com.payair.hce.startIntentSender.AnonymousClass5) objArr2[0];
                        int i10 = getAid;
                        int i11 = i10 ^ 47;
                        int i12 = -(-((i10 & 47) << 1));
                        int i13 = (((i11 | i12) << 1) - (i12 ^ i11)) % 128;
                        IccPrivateKeyCrtComponentsJson = i13;
                        java.lang.String str2 = writeReplace;
                        int i14 = i13 & 125;
                        getAid = ((((i13 ^ 125) | i14) << 1) - ((~i14) & (i13 | 125))) % 128;
                        return str2;
                    }

                    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2) {
                        com.payair.hce.startIntentSender.AnonymousClass5 anonymousClass5 = (com.payair.hce.startIntentSender.AnonymousClass5) objArr2[0];
                        int i = IccPrivateKeyCrtComponentsJson;
                        int i2 = ((i | 81) << 1) - ((i & (-82)) | ((~i) & 81));
                        getAid = i2 % 128;
                        com.payair.hce.isSessionAvailable issessionavailable2 = AlternateContactlessPaymentDataJson2;
                        if (i2 % 2 == 0) {
                            return issessionavailable2;
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                        com.payair.hce.startIntentSender.AnonymousClass5 anonymousClass5 = (com.payair.hce.startIntentSender.AnonymousClass5) objArr2[0];
                        int i = ((-2) - (~(IccPrivateKeyCrtComponentsJson + 28))) % 128;
                        getAid = i;
                        com.payair.hce.isSessionAvailable issessionavailable2 = AlternateContactlessPaymentDataJson;
                        int i2 = i & 27;
                        int i3 = (i ^ 27) | i2;
                        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                        IccPrivateKeyCrtComponentsJson = i4 % 128;
                        if (i4 % 2 != 0) {
                            return issessionavailable2;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.isAutomaticTimeEnabled
                    public final com.payair.hce.isSessionAvailable AlternateContactlessPaymentDataJson() {
                        return (com.payair.hce.isSessionAvailable) DigitizedCardProfile(new java.lang.Object[]{this}, -623866852, 623866853, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.isAutomaticTimeEnabled
                    public final com.payair.hce.isSessionAvailable values() {
                        return (com.payair.hce.isSessionAvailable) DigitizedCardProfile(new java.lang.Object[]{this}, 1752002044, -1752002041, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.isAutomaticTimeEnabled
                    public final com.payair.hce.isSessionAvailable valueOf() {
                        return (com.payair.hce.isSessionAvailable) DigitizedCardProfile(new java.lang.Object[]{this}, -756611436, 756611438, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.isAutomaticTimeEnabled
                    public final java.lang.String DigitizedCardProfile() {
                        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1178050987, 1178050987, java.lang.System.identityHashCode(this));
                    }
                };
                if (str == null || str.isEmpty()) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a("鞇⼮˭\uf02e韎ߟ厥覒㖗\ue45c\uf133\uec57팭䋜钶五炇㽘㩿鄲Ḗ鷏\ud9a2\uf384뮎穈缢嘉夛\ud889⊞뢹\ue6af땤쀁ᬹ萦ጝ枺緗ↄ\uf19cԹ쁇켊긍", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1, objArr2);
                    java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                    getProfileVersion = (IccPrivateKeyCrtComponentsJson + 109) % 128;
                    try {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b("\u0003\f\u000f�\uffff\r\uffc8\ufffb\u0010\ufffb\u0004\b\t\u0003\u000e\n\uffff�\u0012\uffdf\u0013\u000e\u0003\f\u000f�\uffff￭\u0006\ufffb\f\uffff\b\uffff￡\uffc8\u0013\u000e", true, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 105, android.graphics.Color.blue(0) + 11, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 38, objArr3);
                        throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr3[0]).getDeclaredConstructor(java.lang.String.class).newInstance(intern));
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = startintentsender.valueOf;
                ((com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast2))).valueOf(isautomatictimeenabled, str);
                startintentsender.writeReplace.AlternateContactlessPaymentDataJson();
                return null;
            } catch (java.security.GeneralSecurityException e) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a("ꑂℊ랰歾ꐄ৴\ue6e7ዏٛ\uea75䐪睓\ue0d5䲽⇡헎䍂ㄹ轰\u0a4aⷕ鏬泭棇衜瑠쩮쵞櫅훣鞶⏉핃뭸畧聚럑ᴁ튎\ue6b3ቿﾃ끋嬪ﳿꀉ᷃릹彥˗ﭱḋ㧙\ue73a壽粁\ue457䦱♮턘䛍⨿菷㞋ⅎ貰慭鐚菐焇켁쪱", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr4);
                try {
                    java.lang.Object[] objArr5 = {((java.lang.String) objArr4[0]).intern(), e};
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b("\u0003\f\u000f�\uffff\r\uffc8\ufffb\u0010\ufffb\u0004\b\t\u0003\u000e\n\uffff�\u0012\uffdf\u0013\u000e\u0003\f\u000f�\uffff￭\u0006\ufffb\f\uffff\b\uffff￡\uffc8\u0013\u000e", true, 104 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 11, 38 - android.text.TextUtils.getTrimmedLength(""), objArr6);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr6[0]).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(objArr5));
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a("煐╂暚揫焅ඳ㟅ᩔ퍀\uee3c销翆㗇䣵\uf0de\udd5b限㔣幁˟\uf8d6鞨붔恔嵛瀢ᬞ엱뿼튎䛣⭭f뼘ꑨ裾拿\u197aϖ\uee17읜ﯱ慙厍⧍ꑧ쳞넑詖", android.widget.ExpandableListView.getPackedPositionType(0L) + 1, objArr7);
        try {
            java.lang.Object[] objArr8 = {((java.lang.String) objArr7[0]).intern()};
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            b("\u0003\f\u000f�\uffff\r\uffc8\ufffb\u0010\ufffb\u0004\b\t\u0003\u000e\n\uffff�\u0012\uffdf\u0013\u000e\u0003\f\u000f�\uffff￭\u0006\ufffb\f\uffff\b\uffff￡\uffc8\u0013\u000e", true, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 104, 11 - android.text.TextUtils.getCapsMode("", 0, 0), 37 - android.os.Process.getGidForName(""), objArr9);
            throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr9[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr8));
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }

    static void values() {
        SdkCoreAlternateContactlessPaymentDataImpl = 1889207139;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        values();
        getAid = 4979217474922830940L;
    }

    static void init$0() {
        $$a = new byte[]{71, -67, -2, -10};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
    }

    @Override // com.payair.hce.copy
    public final void setRegistrationResponseData(com.payair.hce.accesssetFullInitializationDonep accesssetfullinitializationdonep, java.lang.String str) throws java.security.GeneralSecurityException {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, accesssetfullinitializationdonep, str}, -501411519, 501411519, java.lang.System.identityHashCode(this));
    }
}
