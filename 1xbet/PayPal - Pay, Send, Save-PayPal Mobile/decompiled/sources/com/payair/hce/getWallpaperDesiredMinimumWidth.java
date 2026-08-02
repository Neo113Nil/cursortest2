package com.payair.hce;

/* loaded from: classes4.dex */
public final class getWallpaperDesiredMinimumWidth extends com.payair.hce.deleteDatabase {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char RecordsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getAid;
    private static int getGpoResponse;
    private static int getPaymentFci;
    private static char getProfileVersion;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = (b2 * 4) + 1;
        byte[] bArr = $$a;
        int i4 = (b * 2) + 110;
        int i5 = s + 4;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i5;
            int i7 = i3;
            int i8 = 0;
            i4 = (-i4) + i7;
            i5 = i6;
            i = i8;
            int i9 = i5 + 1;
            bArr2[i] = (byte) i4;
            i2 = i + 1;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b3 = bArr[i9];
            i7 = i4;
            i4 = b3;
            i8 = i2;
            i6 = i9;
            i4 = (-i4) + i7;
            i5 = i6;
            i = i8;
            int i92 = i5 + 1;
            bArr2[i] = (byte) i4;
            i2 = i + 1;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            int i922 = i5 + 1;
            bArr2[i] = (byte) i4;
            i2 = i + 1;
            if (i2 == i3) {
            }
        }
    }

    public getWallpaperDesiredMinimumWidth(com.payair.hce.sendOrderedBroadcast sendorderedbroadcast, com.payair.hce.getPackageResourcePath getpackageresourcepath, java.lang.String str, com.payair.hce.deleteFile deletefile, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        super(sendorderedbroadcast, getpackageresourcepath, str, deletefile, deletesharedpreferences);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.AlternateContactlessPaymentDataJson);
        sb.append(com.payair.hce.removeStickyBroadcast.valueOf);
        this.AlternateContactlessPaymentDataJson = sb.toString();
    }

    @Override // com.payair.hce.deleteDatabase
    public final void writeReplace() {
        com.payair.hce.getFilesDir getfilesdir = (com.payair.hce.getFilesDir) this.writeReplace;
        try {
            com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest values = values();
            com.payair.hce.checkAutomaticTimeSettings checkautomatictimesettings = null;
            this.DigitizedCardProfile.valueOf(new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.valueOf, new com.payair.hce.getWallpaper((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getfilesdir)), this.values, null, null)));
            java.lang.String buildAsJson = values.buildAsJson();
            int i = com.payair.hce.sendOrderedBroadcastAsUser.valueOf;
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.valueOf;
            com.payair.hce.equals DigitizedCardProfile = ((com.payair.hce.hashCode) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, 905350733, -905350733, java.lang.System.identityHashCode(sendorderedbroadcast))).DigitizedCardProfile(com.payair.hce.component6.DigitizedCardProfile, this.AlternateContactlessPaymentDataJson, buildAsJson, this.IccPrivateKeyCrtComponentsJson);
            if (DigitizedCardProfile.DigitizedCardProfile() != 200 && DigitizedCardProfile.DigitizedCardProfile() != 204) {
                getGpoResponse = (getPaymentFci + 51) % 128;
                DigitizedCardProfile(DigitizedCardProfile);
                return;
            }
            int i2 = getGpoResponse + 87;
            getPaymentFci = i2 % 128;
            if (i2 % 2 == 0) {
                if (AlternateContactlessPaymentDataJson(DigitizedCardProfile)) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a("ꔙ䂲▂届愴編䨢卸뽄泍\uddddᤣ䡁ꤱ짥ᔬ鵆ꓘ톍㍡ꬢ圼ᕀK", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22, objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a("駤嶱꽪Н슗\ue0c0㼗\uf4f5\uf72d䯶偽㖣晖惟\uf1d8\ue6f4垯츐蠅逢ন乻騯䐥\ue910훯国鰘ᧀ콩", 29 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr2);
                    this.DigitizedCardProfile.writeReplace(new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.valueOf, new com.payair.hce.getWallpaper((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getfilesdir)), this.values, intern, ((java.lang.String) objArr2[0]).intern())), AlternateContactlessPaymentDataJson());
                    return;
                }
                byte[] AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(DigitizedCardProfile.writeReplace());
                com.payair.hce.stopService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson);
                com.mastercard.mpsdk.remotemanagement.api.json.ProvisionResponseEncrypted valueOf = com.mastercard.mpsdk.remotemanagement.api.json.ProvisionResponseEncrypted.valueOf(AlternateContactlessPaymentDataJson);
                com.mastercard.mpsdk.remotemanagement.api.json.ProvisionResponseEncrypted provisionResponseEncrypted = valueOf;
                if (!valueOf.isSuccess()) {
                    throw new com.payair.hce.VisaReperso(valueOf.getErrorDescription(), valueOf.getErrorCode());
                }
                java.lang.String iccKek = valueOf.getIccKek();
                if (iccKek != null && !iccKek.trim().isEmpty()) {
                    checkautomatictimesettings = new com.payair.hce.checkAutomaticTimeSettings(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(iccKek).DigitizedCardProfile());
                }
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.valueOf;
                com.payair.hce.isSessionAvailable AlternateContactlessPaymentDataJson2 = ((com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast2))).values().AlternateContactlessPaymentDataJson();
                com.mastercard.mpsdk.card.profile.DigitizedCardProfile cardProfile = valueOf.getCardProfile();
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast3 = this.valueOf;
                this.DigitizedCardProfile.DigitizedCardProfile(new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.valueOf, new com.payair.hce.getWallpaper((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getfilesdir)), this.values, (com.payair.hce.checkForSuccess) com.payair.hce.getExternalCacheDir.DigitizedCardProfile(new java.lang.Object[]{cardProfile, checkautomatictimesettings, AlternateContactlessPaymentDataJson2, (com.payair.hce.onNewToken) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast3}, 1288350908, -1288350905, java.lang.System.identityHashCode(sendorderedbroadcast3))}, -1449685080, 1449685081, (int) java.lang.System.currentTimeMillis()))));
                return;
            }
            AlternateContactlessPaymentDataJson(DigitizedCardProfile);
            throw null;
        } catch (com.payair.hce.VisaReperso e) {
            com.payair.hce.getDatabasePath getdatabasepath = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.valueOf, new com.payair.hce.getWallpaper((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getfilesdir)), this.values, e.writeReplace(), e.getMessage()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath, e}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath));
            this.DigitizedCardProfile.writeReplace(getdatabasepath, AlternateContactlessPaymentDataJson());
        } catch (com.payair.hce.component5 e2) {
            java.lang.String str = (java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getfilesdir));
            java.lang.String str2 = this.values;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a("ꔙ䂲▂届愴編䨢卸뽄泍\uddddᤣ䡁ꤱ짥ᔬ鵆ꓘ톍㍡ꬢ圼ᕀK", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 23, objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a("\ue938汲崯Ɦᦳળ쓈壹蚲ౄ呏焟\uea38觡ඒ苩㜲럃ợꥢꞀ즢\ud821拕⓽琒\ue280➩᧡\u20c3ᧀ콩", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 31, objArr4);
            com.payair.hce.getDatabasePath getdatabasepath2 = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.valueOf, new com.payair.hce.getWallpaper(str, str2, intern2, ((java.lang.String) objArr4[0]).intern()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath2, e2}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath2));
            this.DigitizedCardProfile.writeReplace(getdatabasepath2, AlternateContactlessPaymentDataJson());
        } catch (java.security.GeneralSecurityException e3) {
            java.lang.String str3 = (java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getfilesdir));
            java.lang.String str4 = this.values;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a("ꔙ䂲▂届ﳸ䞕蒡\uea2dきᲮ\uecab嵲検晐\ue129\uea0bĔ莁裶舌ၤ芐", 22 - android.view.View.getDefaultSize(0, 0), objArr5);
            java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a("\ue938汲崯Ɦᦳળ쓈壹蚲ౄ뵾\ue568뀭繘ᩍ朢宋晦駤嶱꽪Н슗\ue0c0㼗\uf4f5\uf72d䯶偽㖣晖惟ᧀ콩", 33 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr6);
            com.payair.hce.getDatabasePath getdatabasepath3 = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.valueOf, new com.payair.hce.getWallpaper(str3, str4, intern3, ((java.lang.String) objArr6[0]).intern()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath3, e3}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath3));
            this.DigitizedCardProfile.writeReplace(getdatabasepath3, AlternateContactlessPaymentDataJson());
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            int i2 = $10 + 109;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
                int i3 = getproducttype.AlternateContactlessPaymentDataJson;
                throw new java.lang.ArithmeticException();
            }
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i4 = 58224;
            for (int i5 = 0; i5 < 16; i5++) {
                $10 = ($11 + 105) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (SdkCoreAlternateContactlessPaymentDataImpl ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(RecordsJson)};
                    int i6 = c2 + i4;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 62, 1335 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 0, (short) -1, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (getAid ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getProfileVersion)};
                    int i7 = charValue + i4;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 62, 1335 - android.view.View.getDefaultSize(0, 0), (char) android.view.KeyEvent.keyCodeFromString(""));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) 0, (short) -1, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i4 -= 40503;
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
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3543, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        java.lang.String str2 = new java.lang.String(cArr, 0, i);
        int i8 = $11 + 101;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    @Override // com.payair.hce.deleteDatabase
    final com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest values() throws java.security.GeneralSecurityException {
        com.payair.hce.getFilesDir getfilesdir = (com.payair.hce.getFilesDir) this.writeReplace;
        com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest writeReplace = writeReplace(values(new com.mastercard.mpsdk.remotemanagement.api.json.ProvisionRequestEncrypted(this.values, (java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getfilesdir))).buildAsJson()));
        int i = getPaymentFci + 73;
        getGpoResponse = i % 128;
        if (i % 2 != 0) {
            return writeReplace;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getPaymentFci = 0;
        getGpoResponse = 1;
        getAid = (char) 37328;
        getProfileVersion = (char) 2605;
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 21150;
        RecordsJson = (char) 25362;
    }

    static void init$0() {
        $$a = new byte[]{92, -126, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -5};
        $$b = 118;
    }
}
