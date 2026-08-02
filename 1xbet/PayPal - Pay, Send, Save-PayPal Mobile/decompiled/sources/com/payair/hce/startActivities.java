package com.payair.hce;

/* loaded from: classes4.dex */
public final class startActivities extends com.payair.hce.deleteDatabase {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static char getProfileVersion;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = 1 - (b * 3);
        int i5 = (b2 * 8) + 65;
        int i6 = 4 - (i * 3);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            int i8 = i6;
            int i9 = i6 + i7;
            int i10 = i8 + 1;
            i2 = i3;
            i5 = i9;
            i6 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i5;
            i8 = i6;
            i6 = bArr[i6];
            i7 = i11;
            int i92 = i6 + i7;
            int i102 = i8 + 1;
            i2 = i3;
            i5 = i92;
            i6 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    public startActivities(com.payair.hce.sendOrderedBroadcast sendorderedbroadcast, com.payair.hce.getPackageResourcePath getpackageresourcepath, java.lang.String str, com.payair.hce.deleteFile deletefile, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        super(sendorderedbroadcast, getpackageresourcepath, str, deletefile, deletesharedpreferences);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.AlternateContactlessPaymentDataJson);
        sb.append(com.payair.hce.removeStickyBroadcast.AlternateContactlessPaymentDataJson);
        this.AlternateContactlessPaymentDataJson = sb.toString();
    }

    @Override // com.payair.hce.deleteDatabase
    public final void writeReplace() {
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 41) % 128;
        com.payair.hce.getFilesDir getfilesdir = (com.payair.hce.getFilesDir) this.writeReplace;
        try {
            java.lang.String buildAsJson = values().buildAsJson();
            int i = com.payair.hce.sendOrderedBroadcastAsUser.writeReplace;
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.valueOf;
            com.payair.hce.equals DigitizedCardProfile = ((com.payair.hce.hashCode) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, 905350733, -905350733, java.lang.System.identityHashCode(sendorderedbroadcast))).DigitizedCardProfile(com.payair.hce.component6.DigitizedCardProfile, this.AlternateContactlessPaymentDataJson, buildAsJson, this.IccPrivateKeyCrtComponentsJson);
            if (DigitizedCardProfile.DigitizedCardProfile() != 200) {
                getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 5) % 128;
                if (DigitizedCardProfile.DigitizedCardProfile() != 204) {
                    DigitizedCardProfile(DigitizedCardProfile);
                    return;
                }
            }
            if (AlternateContactlessPaymentDataJson(DigitizedCardProfile)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("\u0005\u00040\u000f\t&㘻㘻'\u0007\u001f\b\u0014,\u001e$\r\u0012!\u001d\u001e#㘬", 24 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 101), objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a("\u0011\u0003\u0005 \n\u001f\r\u001e%\u001f#\u0019)\u001f\u001b\n\f\u0013\u0003\u001a\u0011$\u001b\u001f\u001e%\u0007/㘏", 29 - android.view.View.resolveSize(0, 0), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 92), objArr2);
                this.DigitizedCardProfile.writeReplace(new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.writeReplace, new com.payair.hce.getWallpaper((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getfilesdir)), this.values, intern, ((java.lang.String) objArr2[0]).intern())), AlternateContactlessPaymentDataJson());
                getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 121) % 128;
                return;
            }
            int i2 = getAid + 97;
            SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
            if (i2 % 2 == 0) {
                byte[] AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(DigitizedCardProfile.writeReplace());
                com.payair.hce.stopService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson);
                com.mastercard.mpsdk.remotemanagement.api.json.ProvisionResponseEncrypted valueOf = com.mastercard.mpsdk.remotemanagement.api.json.ProvisionResponseEncrypted.valueOf(AlternateContactlessPaymentDataJson);
                com.mastercard.mpsdk.remotemanagement.api.json.ProvisionResponseEncrypted provisionResponseEncrypted = valueOf;
                valueOf.isSuccess();
                throw new java.lang.NullPointerException();
            }
            byte[] AlternateContactlessPaymentDataJson2 = AlternateContactlessPaymentDataJson(DigitizedCardProfile.writeReplace());
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson2);
            com.mastercard.mpsdk.remotemanagement.api.json.ProvisionResponseEncrypted valueOf2 = com.mastercard.mpsdk.remotemanagement.api.json.ProvisionResponseEncrypted.valueOf(AlternateContactlessPaymentDataJson2);
            com.mastercard.mpsdk.remotemanagement.api.json.ProvisionResponseEncrypted provisionResponseEncrypted2 = valueOf2;
            if (!valueOf2.isSuccess()) {
                throw new com.payair.hce.VisaReperso(valueOf2.getErrorDescription(), valueOf2.getErrorCode());
            }
            java.lang.String iccKek = valueOf2.getIccKek();
            com.payair.hce.checkAutomaticTimeSettings checkautomatictimesettings = null;
            if (iccKek != null && !iccKek.trim().isEmpty()) {
                checkautomatictimesettings = new com.payair.hce.checkAutomaticTimeSettings(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(iccKek).DigitizedCardProfile());
            }
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.valueOf;
            com.payair.hce.isSessionAvailable AlternateContactlessPaymentDataJson3 = ((com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast2))).values().AlternateContactlessPaymentDataJson();
            com.mastercard.mpsdk.card.profile.DigitizedCardProfile cardProfile = valueOf2.getCardProfile();
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast3 = this.valueOf;
            this.DigitizedCardProfile.DigitizedCardProfile(new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.writeReplace, new com.payair.hce.getWallpaper((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getfilesdir)), this.values, (com.payair.hce.checkForSuccess) com.payair.hce.getExternalCacheDir.DigitizedCardProfile(new java.lang.Object[]{cardProfile, checkautomatictimesettings, AlternateContactlessPaymentDataJson3, (com.payair.hce.onNewToken) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast3}, 1288350908, -1288350905, java.lang.System.identityHashCode(sendorderedbroadcast3))}, -1449685080, 1449685081, (int) java.lang.System.currentTimeMillis()))));
        } catch (com.payair.hce.VisaReperso e) {
            com.payair.hce.getDatabasePath getdatabasepath = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.writeReplace, new com.payair.hce.getWallpaper((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getfilesdir)), this.values, e.writeReplace(), e.getMessage()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath, e}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath));
            this.DigitizedCardProfile.writeReplace(getdatabasepath, AlternateContactlessPaymentDataJson());
        } catch (com.payair.hce.component5 e2) {
            java.lang.String str = (java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getfilesdir));
            java.lang.String str2 = this.values;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a("\u0005\u00040\u000f\t&㘻㘻'\u0007\u001f\b\u0014,\u001e$\r\u0012!\u001d\u001e#㘬", 23 - android.text.TextUtils.indexOf("", "", 0, 0), (byte) (100 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a("(\u0006\u0012+)\u0014\u001a\n&\u0019\u001c\r)\"\u0005\u0007\u001f\u001b\u0006++\u001b\u0017\n!0\u0006\u001c(\n㘧", 31 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (115 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), objArr4);
            com.payair.hce.getDatabasePath getdatabasepath2 = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.writeReplace, new com.payair.hce.getWallpaper(str, str2, intern2, ((java.lang.String) objArr4[0]).intern()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath2, e2}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath2));
            this.DigitizedCardProfile.writeReplace(getdatabasepath2, AlternateContactlessPaymentDataJson());
        } catch (java.security.GeneralSecurityException e3) {
            java.lang.String str3 = (java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getfilesdir));
            java.lang.String str4 = this.values;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a("\u0005\u00040\u000f\u0007\u001f\u000f\u0015,)\u0000\"\u000f\u0017\u0000\u000f\u0012\"㗍㗍#\u001e", 23 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (6 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr5);
            java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a("(\u0006\u0012+)\u0014\u001a\n&\u0019\u001c\u001b\u0017\r,\u001c\n\u001a\r\u001e*\u0005\u001f)\n\u001a .\n\u0017\u0011\u0003\u0005 \u0002-", android.graphics.Color.red(0) + 36, (byte) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 73), objArr6);
            com.payair.hce.getDatabasePath getdatabasepath3 = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.writeReplace, new com.payair.hce.getWallpaper(str3, str4, intern3, ((java.lang.String) objArr6[0]).intern()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath3, e3}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath3));
            this.DigitizedCardProfile.writeReplace(getdatabasepath3, AlternateContactlessPaymentDataJson());
        }
    }

    @Override // com.payair.hce.deleteDatabase
    final com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest values() throws java.security.GeneralSecurityException {
        com.payair.hce.getFilesDir getfilesdir = (com.payair.hce.getFilesDir) this.writeReplace;
        com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest writeReplace = writeReplace(values(new com.mastercard.mpsdk.remotemanagement.api.json.ProvisionRequestEncrypted(this.values, (java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getfilesdir))).buildAsJson()));
        int i = getAid + 55;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            return writeReplace;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0152, code lost:
    
        if (r3.valueOf == r3.writeReplace) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0180, code lost:
    
        r11 = new java.lang.Object[]{r3, r3, java.lang.Integer.valueOf(r2), r3, r3, java.lang.Integer.valueOf(r2), r3, r3, java.lang.Integer.valueOf(r2), r3, r3, java.lang.Integer.valueOf(r2), r3};
        r12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01cf, code lost:
    
        if (r12 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d1, code lost:
    
        r12 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 3596 - android.view.KeyEvent.normalizeMetaState(0), (char) ((-1) - android.os.Process.getGidForName("")))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x024a, code lost:
    
        if (((java.lang.Integer) ((java.lang.reflect.Method) r12).invoke(null, r11)).intValue() != r3.SdkCoreAlternateContactlessPaymentDataImpl) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x024e, code lost:
    
        r11 = new java.lang.Object[]{r3, r3, java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r2), r3, r3, java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r2), r3, java.lang.Integer.valueOf(r2), r3};
        r7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x028a, code lost:
    
        if (r7 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x028c, code lost:
    
        r7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 49, android.view.View.getDefaultSize(0, 0) + 2665, (char) (18889 - android.view.KeyEvent.getDeadChar(0, 0)));
        r13 = com.payair.hce.startActivities.$$a[1];
        r14 = (byte) (r13 + 1);
        r15 = new java.lang.Object[1];
        b(r14, r14, (byte) (-r13), r15);
        r7 = r7.getMethod((java.lang.String) r15[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02ff, code lost:
    
        r7 = ((java.lang.Integer) ((java.lang.reflect.Method) r7).invoke(null, r11)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x030c, code lost:
    
        r11 = r3.AlternateContactlessPaymentDataJson;
        r13 = r3.SdkCoreAlternateContactlessPaymentDataImpl;
        r5[r3.values] = r4[r7];
        r5[r3.values + 1] = r4[(r11 * r2) + r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0325, code lost:
    
        if (r3.DigitizedCardProfile != r3.AlternateContactlessPaymentDataJson) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0327, code lost:
    
        com.payair.hce.startActivities.$10 = (com.payair.hce.startActivities.$11 + 83) % 128;
        r3.RecordsJson = ((r3.RecordsJson + r2) - 1) % r2;
        r3.SdkCoreAlternateContactlessPaymentDataImpl = ((r3.SdkCoreAlternateContactlessPaymentDataImpl + r2) - 1) % r2;
        r7 = r3.DigitizedCardProfile;
        r11 = r3.RecordsJson;
        r13 = r3.AlternateContactlessPaymentDataJson;
        r14 = r3.SdkCoreAlternateContactlessPaymentDataImpl;
        r5[r3.values] = r4[(r7 * r2) + r11];
        r5[r3.values + 1] = r4[(r13 * r2) + r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0357, code lost:
    
        r7 = r3.DigitizedCardProfile;
        r11 = r3.SdkCoreAlternateContactlessPaymentDataImpl;
        r13 = r3.AlternateContactlessPaymentDataJson;
        r14 = r3.RecordsJson;
        r5[r3.values] = r4[(r7 * r2) + r11];
        r5[r3.values + 1] = r4[(r13 * r2) + r14];
        com.payair.hce.startActivities.$11 = (com.payair.hce.startActivities.$10 + 9) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0168, code lost:
    
        r5[r3.values] = (char) (r3.valueOf - r27);
        r5[r3.values + 1] = (char) (r3.writeReplace - r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0166, code lost:
    
        if (r3.valueOf == r3.writeReplace) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        int length;
        char[] cArr2;
        int i3;
        int i4 = $10;
        $11 = (i4 + 3) % 128;
        if (str != null) {
            int i5 = i4 + 83;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr4 = RecordsJson;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        if (cArr4 != null) {
            int i6 = $10 + 45;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr4.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr4.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr4[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.Color.red(0), 2508 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (6801 - android.text.TextUtils.indexOf("", c)));
                        byte b2 = (byte) ($$a[1] + 1);
                        byte b3 = b2;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b2, b3, b3, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr4 = cArr2;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(getProfileVersion)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 49, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2509, (char) (android.view.KeyEvent.keyCodeFromString("") + 6802));
            byte b4 = (byte) ($$a[1] + 1);
            byte b5 = b4;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(b4, b5, b5, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr3[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = 0;
            while (true) {
                digitizedCardJson12.values = i7;
                if (digitizedCardJson12.values >= i2) {
                    break;
                }
                int i8 = $11 + 81;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    digitizedCardJson12.valueOf = cArr3[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = cArr3[digitizedCardJson12.values];
                } else {
                    digitizedCardJson12.valueOf = cArr3[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = cArr3[digitizedCardJson12.values + 1];
                }
                i7 = digitizedCardJson12.values + 2;
            }
        }
        for (int i9 = 0; i9 < i; i9++) {
            cArr5[i9] = (char) (cArr5[i9] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        RecordsJson = new char[]{12351, 12290, 12333, 12302, 12313, 12331, 12301, 12338, 12322, 12344, 12297, 12292, 12350, 12334, 12307, 12323, 12299, 12330, 12320, 13266, 12309, 12324, 12314, 12327, 12394, 12332, 12321, 12329, 12312, 12291, 12346, 13265, 12303, 12391, 12335, 12319, 12328, 12293, 12345, 12325, 13264, 12300, 12339, 12289, 12388, 12295, 12326, 12347, 12318};
        getProfileVersion = (char) 1495;
    }

    static void init$0() {
        $$a = new byte[]{18, -1, 36, -56};
        $$b = 179;
    }
}
