package com.payair.hce;

/* loaded from: classes4.dex */
public final class sendBroadcastWithMultiplePermissions extends com.payair.hce.deleteDatabase {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int RecordsJson;
    private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static long getAid;
    private static int getProfileVersion;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = i2 * 4;
        byte[] bArr = $$a;
        int i5 = (i * 3) + 4;
        int i6 = (s * 3) + 99;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i6 += -i7;
            i5++;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i5];
            i6 += -i7;
            i5++;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    public sendBroadcastWithMultiplePermissions(com.payair.hce.sendOrderedBroadcast sendorderedbroadcast, com.payair.hce.getPackageResourcePath getpackageresourcepath, java.lang.String str, com.payair.hce.deleteFile deletefile, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        super(sendorderedbroadcast, getpackageresourcepath, str, deletefile, deletesharedpreferences);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.AlternateContactlessPaymentDataJson);
        sb.append(com.payair.hce.removeStickyBroadcast.SdkCoreAlternateContactlessPaymentDataImpl);
        this.AlternateContactlessPaymentDataJson = sb.toString();
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $11 + 51;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl[i + getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 48, 381 - android.text.TextUtils.getOffsetAfter("", 0), (char) (android.text.TextUtils.getOffsetAfter("", 0) + 62388));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c(0, (short) 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getAid), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 3966 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
            } else {
                int i5 = getcvmmodel.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl[i + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 381 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 62388));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    c(0, (short) 0, 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getAid), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 3966, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 40222))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 34, 213 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i6 = $10 + 13;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj7 == null) {
                    obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.indexOf("", "", 0, 0), 212 - android.text.TextUtils.indexOf("", "", 0), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
                }
                ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
                throw null;
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr11 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj8 == null) {
                obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 34, android.view.View.combineMeasuredStates(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj8);
            }
            ((java.lang.reflect.Method) obj8).invoke(null, objArr11);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        if (r0.DigitizedCardProfile() != 200) goto L10;
     */
    @Override // com.payair.hce.deleteDatabase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeReplace() {
        com.payair.hce.equals DigitizedCardProfile;
        boolean z;
        int i = RecordsJson + 47;
        getProfileVersion = i % 128;
        try {
            if (i % 2 != 0) {
                java.lang.String buildAsJson = values().buildAsJson();
                int i2 = com.payair.hce.sendOrderedBroadcastAsUser.getCvrMaskAnd;
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.valueOf;
                DigitizedCardProfile = ((com.payair.hce.hashCode) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, 905350733, -905350733, java.lang.System.identityHashCode(sendorderedbroadcast))).DigitizedCardProfile(com.payair.hce.component6.DigitizedCardProfile, this.AlternateContactlessPaymentDataJson, buildAsJson, this.IccPrivateKeyCrtComponentsJson);
                if (DigitizedCardProfile.DigitizedCardProfile() != 26674) {
                    getProfileVersion = (RecordsJson + 83) % 128;
                    if (DigitizedCardProfile.DigitizedCardProfile() != 204) {
                        getProfileVersion = (RecordsJson + 61) % 128;
                        z = false;
                    }
                }
                getProfileVersion = (RecordsJson + 103) % 128;
                z = true;
            } else {
                java.lang.String buildAsJson2 = values().buildAsJson();
                int i3 = com.payair.hce.sendOrderedBroadcastAsUser.getCvrMaskAnd;
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.valueOf;
                DigitizedCardProfile = ((com.payair.hce.hashCode) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, 905350733, -905350733, java.lang.System.identityHashCode(sendorderedbroadcast2))).DigitizedCardProfile(com.payair.hce.component6.DigitizedCardProfile, this.AlternateContactlessPaymentDataJson, buildAsJson2, this.IccPrivateKeyCrtComponentsJson);
            }
            if (!z) {
                DigitizedCardProfile(DigitizedCardProfile);
                return;
            }
            if (AlternateContactlessPaymentDataJson(DigitizedCardProfile)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(android.text.TextUtils.getCapsMode("", 0, 0), (char) (25776 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(23 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.os.Process.myPid() >> 22), 29 - android.view.View.combineMeasuredStates(0, 0), objArr2);
                this.DigitizedCardProfile.writeReplace(new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getCvrMaskAnd, new com.payair.hce.getExternalMediaDirs(this.values, intern, ((java.lang.String) objArr2[0]).intern())), AlternateContactlessPaymentDataJson());
                return;
            }
            int i4 = getProfileVersion + 63;
            RecordsJson = i4 % 128;
            if (i4 % 2 == 0) {
                byte[] AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(DigitizedCardProfile.writeReplace());
                com.payair.hce.stopService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson);
                com.mastercard.mpsdk.remotemanagement.api.json.GetTaskStatusResponseEncrypted valueOf = com.mastercard.mpsdk.remotemanagement.api.json.GetTaskStatusResponseEncrypted.valueOf(AlternateContactlessPaymentDataJson);
                com.mastercard.mpsdk.remotemanagement.api.json.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted = valueOf;
                valueOf.isSuccess();
                throw null;
            }
            byte[] AlternateContactlessPaymentDataJson2 = AlternateContactlessPaymentDataJson(DigitizedCardProfile.writeReplace());
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson2);
            com.mastercard.mpsdk.remotemanagement.api.json.GetTaskStatusResponseEncrypted valueOf2 = com.mastercard.mpsdk.remotemanagement.api.json.GetTaskStatusResponseEncrypted.valueOf(AlternateContactlessPaymentDataJson2);
            com.mastercard.mpsdk.remotemanagement.api.json.GetTaskStatusResponseEncrypted getTaskStatusResponseEncrypted2 = valueOf2;
            if (!valueOf2.isSuccess()) {
                throw new com.payair.hce.VisaReperso(valueOf2.getErrorDescription(), valueOf2.getErrorCode());
            }
            this.DigitizedCardProfile.DigitizedCardProfile(new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getCvrMaskAnd, new com.payair.hce.getExternalMediaDirs(valueOf2.getStatus(), this.values)));
        } catch (com.payair.hce.VisaReperso e) {
            com.payair.hce.getDatabasePath getdatabasepath = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getCvrMaskAnd, new com.payair.hce.getExternalMediaDirs(this.values, e.writeReplace(), e.getMessage()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath, e}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath));
            this.DigitizedCardProfile.writeReplace(getdatabasepath, AlternateContactlessPaymentDataJson());
        } catch (com.payair.hce.component5 e2) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1, (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 25776), 23 - android.view.View.resolveSize(0, 0), objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 111, (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 12650), android.view.View.MeasureSpec.getSize(0) + 31, objArr4);
            com.payair.hce.getDatabasePath getdatabasepath2 = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getCvrMaskAnd, new com.payair.hce.getExternalMediaDirs(this.values, intern2, ((java.lang.String) objArr4[0]).intern()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath2, e2}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath2));
            this.DigitizedCardProfile.writeReplace(getdatabasepath2, AlternateContactlessPaymentDataJson());
        } catch (java.security.GeneralSecurityException e3) {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 53, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12230), 22 - android.view.View.resolveSizeAndState(0, 0, 0), objArr5);
            java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(74 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.text.TextUtils.getTrimmedLength("") + 26131), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 36, objArr6);
            com.payair.hce.getDatabasePath getdatabasepath3 = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getCvrMaskAnd, new com.payair.hce.getExternalMediaDirs(this.values, intern3, ((java.lang.String) objArr6[0]).intern()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath3, e3}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath3));
            this.DigitizedCardProfile.writeReplace(getdatabasepath3, AlternateContactlessPaymentDataJson());
        }
    }

    @Override // com.payair.hce.deleteDatabase
    final com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest values() throws java.security.GeneralSecurityException {
        com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest writeReplace = writeReplace(values(new com.mastercard.mpsdk.remotemanagement.api.json.GetTaskStatusRequestEncrypted(this.values, ((com.payair.hce.openFileInput) this.writeReplace).writeReplace()).buildAsJson()));
        int i = getProfileVersion + 109;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            return writeReplace;
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{47, 64, -76, com.visa.cbp.getEncExpo.IResultReceiver};
        $$b = 20;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        RecordsJson = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = new char[]{14924, 19729, 54464, 24478, 59252, 28194, 61934, 31060, 32794, 3019, 37554, 6770, 44326, 13449, 48218, 50950, 20209, 53674, 22894, 57395, 27525, 62274, 31249, 24300, 10664, 45160, 15196, 33731, 2813, 38241, 7628, 58508, 28485, 63012, 32495, 51620, 20488, 55427, 41885, 10862, 46385, 15866, 34033, 3854, 38862, 7891, 59756, 28722, 63717, 17247, 51736, 21145, 28987, 1638, 40887, 5353, 44035, 9544, 47757, 12862, 52076, 16573, 55755, 20756, 58961, 32762, 63276, 35943, 1431, 39623, 4622, 43844, 8431, 47144, 14586, 20375, 54849, 23822, 58865, 27818, 62240, 31694, 33411, 2310, 36925, 6396, 44967, 13836, 48841, 50586, 19560, 54134, 23546, 58023, 26885, 61915, 30853, 36713, 5688, 40614, 9566, 44061, 13526, 48126, 49747, 18695, 53679, 22555, 61228, 30604, 28547, 6382, 33080, 2679, 45704, 15315, 42073, 11447, 54778, 24191, 51012, 20371, 63704, 24932, 59836, 37607, 6912, 33807, 3257, 46575, 15961, 42631, 12217, 55313, 16720, 51598, 29236, 64366, 25518, 60627, 38215};
        getAid = 5337815876959283685L;
    }

    public static int b(java.lang.Object obj) {
        try {
            java.lang.Object[] objArr = {obj};
            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
            if (obj2 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 71, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1180, (char) android.view.View.resolveSize(0, 0));
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                c(0, (short) 1, 0, objArr2);
                obj2 = cls.getMethod((java.lang.String) objArr2[0], java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
            }
            return ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr)).intValue();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
