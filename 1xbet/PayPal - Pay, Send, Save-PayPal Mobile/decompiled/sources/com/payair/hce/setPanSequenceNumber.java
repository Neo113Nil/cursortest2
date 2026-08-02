package com.payair.hce;

/* loaded from: classes4.dex */
public final class setPanSequenceNumber extends com.payair.hce.initialize {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] getCardLayoutDescription;
    private static int getCvmResetTimeout;
    private static int getDualTapResetTimeout;
    private static long getSecurityWord;
    private com.payair.hce.RemotePaymentData RecordsJson;
    private com.payair.hce.RemotePaymentData SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.getCacheDir SdkCoreBusinessLogicModuleImpl;
    private java.util.LinkedHashMap<java.lang.Integer, com.payair.hce.setCardManager> getAid;
    private java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> getApplicationLifeCycleData;
    private int getCiacDecline;
    private com.payair.hce.transactionCanBeResumed getCvrMaskAnd;
    private java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> getGpoResponse;
    private com.payair.hce.getCacheDir getPaymentFci;
    private com.payair.hce.transactionCanBeResumed getProfileVersion;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~((~i3) | i4);
        if ((i * (-337)) + (i2 * 339) + (((~((~i2) | i)) | i5 | (~(i | i3))) * (-338)) + ((~(i4 | i2)) * 338) + (((~(i | i2 | i3)) | i5) * 338) == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        com.payair.hce.setPanSequenceNumber setpansequencenumber = (com.payair.hce.setPanSequenceNumber) objArr[0];
        int i6 = (getCvmResetTimeout + 1) % 128;
        getDualTapResetTimeout = i6;
        java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list = setpansequencenumber.getApplicationLifeCycleData;
        getCvmResetTimeout = (i6 + 7) % 128;
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = (i * 4) + 99;
        int i5 = 3 - (b * 3);
        int i6 = (s * 4) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            int i8 = i5;
            int i9 = i5 + (-i7);
            i2 = i3;
            int i10 = i8;
            i4 = i9;
            i5 = i10;
            int i11 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i11];
            int i12 = i4;
            i8 = i11;
            i5 = i12;
            int i92 = i5 + (-i7);
            i2 = i3;
            int i102 = i8;
            i4 = i92;
            i5 = i102;
            int i112 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            int i1122 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    public setPanSequenceNumber(com.payair.hce.hasVersionCheckFailed hasversioncheckfailed, com.payair.hce.createConfigurationContext createconfigurationcontext, java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list, java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list2) throws com.payair.hce.updateSukFileName {
        super(hasversioncheckfailed.DigitizedCardProfile());
        java.lang.String str;
        com.payair.hce.stopTransaction valueOf = hasversioncheckfailed.valueOf();
        if (valueOf.valueOf() == null || valueOf.valueOf().length <= 0) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getAdditionalCheckTable);
        }
        this.getProfileVersion = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(valueOf.valueOf());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.view.ViewConfiguration.getLongPressTimeout() >> 16, (char) (264 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), 4 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr);
        arrayList.add(new com.payair.hce.startDeviceAuthenticationForRegistration(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr[0]).intern()).valueOf(), (byte) 8));
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(3 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F0E_ISSUER_ACTION_DENIAL - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 4 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
        arrayList.add(new com.payair.hce.startDeviceAuthenticationForRegistration(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr2[0]).intern()).valueOf(), (byte) 2));
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (list.contains(it.next())) {
                    it.remove();
                }
            }
            arrayList.addAll(list);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (list2 != null && !list2.isEmpty()) {
            arrayList2.addAll(list2);
        }
        this.SdkCoreAlternateContactlessPaymentDataImpl = new com.payair.hce.RemotePaymentData(valueOf.DigitizedCardProfile(), valueOf.writeReplace(), valueOf.values(), valueOf.IccPrivateKeyCrtComponentsJson(), valueOf.AlternateContactlessPaymentDataJson(), valueOf.SdkCoreAlternateContactlessPaymentDataImpl(), arrayList, true);
        if (createconfigurationcontext.AlternateContactlessPaymentDataJson()) {
            com.payair.hce.handleMDESPushPayload profileVersion = valueOf.getProfileVersion();
            str = "";
            this.RecordsJson = new com.payair.hce.RemotePaymentData(profileVersion.AlternateContactlessPaymentDataJson(), profileVersion.valueOf(), profileVersion.writeReplace(), profileVersion.getAid(), profileVersion.values(), profileVersion.DigitizedCardProfile(), arrayList, false);
        } else {
            str = "";
            if (!createconfigurationcontext.valueOf() && !createconfigurationcontext.SdkCoreAlternateContactlessPaymentDataImpl()) {
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.IccPrivateKeyCrtComponentsJson;
                android.media.AudioTrack.getMaxVolume();
                android.media.AudioTrack.getMaxVolume();
                android.os.Process.getGidForName(str);
                throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.SdkCoreAlternateContactlessPaymentDataImpl);
            }
        }
        this.getAid = new java.util.LinkedHashMap<>();
        java.util.Iterator<com.payair.hce.updateUnlockKeys> it2 = valueOf.getPaymentFci().iterator();
        while (it2.hasNext()) {
            com.payair.hce.setCardManager setcardmanager = new com.payair.hce.setCardManager(this, it2.next(), arrayList2);
            this.getAid.put(setcardmanager.AlternateContactlessPaymentDataJson(), setcardmanager);
        }
        this.getPaymentFci = new com.payair.hce.getCacheDir(valueOf.getDualTapResetTimeout(), this.getAid, true);
        this.SdkCoreBusinessLogicModuleImpl = new com.payair.hce.getCacheDir(valueOf.getCardLayoutDescription(), this.getAid, false);
        if (valueOf.getAid() == null) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getCardholderValidators);
        }
        this.valueOf = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(valueOf.getAid());
        if (this.valueOf.DigitizedCardProfile() < 18) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getMaximumPinTry);
        }
        if (valueOf.SdkCoreBusinessLogicModuleImpl() == null) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.build);
        }
        java.lang.String writeReplace = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(valueOf.SdkCoreBusinessLogicModuleImpl()).writeReplace();
        if (writeReplace.isEmpty()) {
            int indexOf = android.text.TextUtils.indexOf(str, str, 0, 0);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(65 - indexOf, (char) (org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.COMPRESSION_VALUE_KODAK_DCR_COMPRESSED - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), android.text.TextUtils.indexOf(str, str, 0, 0) + 2, objArr3);
            writeReplace = ((java.lang.String) objArr3[0]).intern();
        }
        this.getCiacDecline = java.lang.Integer.parseInt(writeReplace, 16);
        if (valueOf.RecordsJson() == null) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getMagstripeCvmIssuerOptions);
        }
        this.getCvrMaskAnd = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(valueOf.RecordsJson());
        this.values = valueOf.getSecurityWord();
        this.AlternateContactlessPaymentDataJson = valueOf.getCardholderValidators();
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(getCardLayoutDescription[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 48, android.widget.ExpandableListView.getPackedPositionType(0L) + 381, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 62389));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((short) 0, (byte) 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getSecurityWord), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 34, 3966 - android.text.TextUtils.getOffsetBefore("", 0), (char) (40223 - android.view.View.MeasureSpec.getMode(0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 33, android.widget.ExpandableListView.getPackedPositionGroup(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            $10 = ($11 + 71) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            $11 = ($10 + 43) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public final com.payair.hce.RemotePaymentData writeReplace() {
        int i = (getDualTapResetTimeout + 95) % 128;
        getCvmResetTimeout = i;
        com.payair.hce.RemotePaymentData remotePaymentData = this.SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i + 51;
        getDualTapResetTimeout = i2 % 128;
        if (i2 % 2 != 0) {
            return remotePaymentData;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.RemotePaymentData AlternateContactlessPaymentDataJson() {
        int i = getCvmResetTimeout;
        int i2 = i + 17;
        getDualTapResetTimeout = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        com.payair.hce.RemotePaymentData remotePaymentData = this.RecordsJson;
        getDualTapResetTimeout = (i + 57) % 128;
        return remotePaymentData;
    }

    public final com.payair.hce.transactionCanBeResumed values() {
        int i = getDualTapResetTimeout;
        getCvmResetTimeout = (i + 11) % 128;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.getProfileVersion;
        int i2 = i + 45;
        getCvmResetTimeout = i2 % 128;
        if (i2 % 2 == 0) {
            return transactioncanberesumed;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setPanSequenceNumber setpansequencenumber = (com.payair.hce.setPanSequenceNumber) objArr[0];
        int i = getCvmResetTimeout + 97;
        getDualTapResetTimeout = i % 128;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = setpansequencenumber.getCvrMaskAnd;
        if (i % 2 != 0) {
            return transactioncanberesumed;
        }
        throw null;
    }

    public final com.payair.hce.setCardManager valueOf(byte b, byte b2) throws com.payair.hce.getCurrentRequestId {
        getDualTapResetTimeout = (getCvmResetTimeout + 115) % 128;
        java.lang.Integer AlternateContactlessPaymentDataJson = com.payair.hce.setCardManager.AlternateContactlessPaymentDataJson(b, b2);
        if (!this.getAid.containsKey(AlternateContactlessPaymentDataJson)) {
            throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreMppLiteModuleImpl);
        }
        com.payair.hce.setCardManager setcardmanager = this.getAid.get(AlternateContactlessPaymentDataJson);
        int i = getDualTapResetTimeout + 75;
        getCvmResetTimeout = i % 128;
        if (i % 2 == 0) {
            return setcardmanager;
        }
        throw null;
    }

    public final com.payair.hce.getCacheDir DigitizedCardProfile() {
        int i = getCvmResetTimeout + 7;
        int i2 = i % 128;
        getDualTapResetTimeout = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.getCacheDir getcachedir = this.getPaymentFci;
        int i3 = i2 + 63;
        getCvmResetTimeout = i3 % 128;
        if (i3 % 2 == 0) {
            return getcachedir;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.getCacheDir IccPrivateKeyCrtComponentsJson() {
        int i = getDualTapResetTimeout;
        int i2 = i + 83;
        getCvmResetTimeout = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.getCacheDir getcachedir = this.SdkCoreBusinessLogicModuleImpl;
        getCvmResetTimeout = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return getcachedir;
    }

    public final int RecordsJson() {
        int i = getDualTapResetTimeout + 61;
        int i2 = i % 128;
        getCvmResetTimeout = i2;
        if (i % 2 != 0) {
            throw null;
        }
        int i3 = this.getCiacDecline;
        int i4 = i2 + 71;
        getDualTapResetTimeout = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw null;
    }

    final void valueOf(java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list) {
        int i = getCvmResetTimeout + 77;
        getDualTapResetTimeout = i % 128;
        if (i % 2 != 0) {
            this.getGpoResponse = list;
        } else {
            this.getGpoResponse = list;
            throw new java.lang.ArithmeticException();
        }
    }

    public final java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> SdkCoreAlternateContactlessPaymentDataImpl() {
        int i = getDualTapResetTimeout + 89;
        getCvmResetTimeout = i % 128;
        if (i % 2 == 0) {
            return this.getGpoResponse;
        }
        throw null;
    }

    final void values(java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list) {
        int i = getDualTapResetTimeout + 97;
        getCvmResetTimeout = i % 128;
        if (i % 2 == 0) {
            this.getApplicationLifeCycleData = list;
        } else {
            this.getApplicationLifeCycleData = list;
            throw new java.lang.ArithmeticException();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getCvmResetTimeout = 0;
        getDualTapResetTimeout = 1;
        getCardLayoutDescription = new char[]{24478, 58204, 9964, 27092, 49561, 32091, 47339, 63446, 24289, 57981, 10229, 26873, 44087, 61802, 12964, 30710, 47913, 64619, 441, 17109, 34387, 52087, 3248, 20984, 38239, 54851, 7051, 23756, 57419, 9598, 26339, 43581, 61306, 12475, 30191, 47417, 64035, 16263, 16576, 33800, 51503, 2717, 20423, 37720, 54390, 6559, 23238, 40471, 9043, 25752, 43460, 60768, 11958, 29622, 46904, 63598, 15802, 32418, 33324, 51046, 2237, 19951, 37149, 53853, 6035, 41848, 8133};
        getSecurityWord = -2658593704842567150L;
    }

    static void init$0() {
        $$a = new byte[]{3, -32, -117, 13};
        $$b = 183;
    }

    public final java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> getProfileVersion() {
        return (java.util.List) DigitizedCardProfile(new java.lang.Object[]{this}, -1172440258, 1172440258, java.lang.System.identityHashCode(this));
    }

    public static char g(int i) {
        try {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 46, 287 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (46337 - android.view.View.MeasureSpec.getSize(0)))).getMethod("y", java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
            }
            return ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr)).charValue();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final com.payair.hce.transactionCanBeResumed valueOf() {
        return (com.payair.hce.transactionCanBeResumed) DigitizedCardProfile(new java.lang.Object[]{this}, 873389637, -873389636, java.lang.System.identityHashCode(this));
    }
}
