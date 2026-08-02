package com.payair.hce;

/* loaded from: classes4.dex */
public final class startActivity extends com.payair.hce.deleteDatabase {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getAid;
    private static int getCvrMaskAnd;
    private static int getProfileVersion;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = 106 - i;
        int i4 = s * 2;
        byte[] bArr = $$a;
        int i5 = 3 - (s2 * 4);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i3 += -i6;
            i2 = i7;
            i5++;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i5];
            i3 += -i6;
            i2 = i7;
            i5++;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            i5++;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        }
    }

    public startActivity(com.payair.hce.sendOrderedBroadcast sendorderedbroadcast, com.payair.hce.getPackageResourcePath getpackageresourcepath, java.lang.String str, com.payair.hce.deleteFile deletefile, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        super(sendorderedbroadcast, getpackageresourcepath, str, deletefile, deletesharedpreferences);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.AlternateContactlessPaymentDataJson);
        sb.append(com.payair.hce.removeStickyBroadcast.RecordsJson);
        this.AlternateContactlessPaymentDataJson = sb.toString();
    }

    @Override // com.payair.hce.deleteDatabase
    public final void writeReplace() {
        com.payair.hce.deleteFile deletefile = this.writeReplace;
        try {
            java.lang.String buildAsJson = values().buildAsJson();
            int i = com.payair.hce.sendOrderedBroadcastAsUser.getPaymentFci;
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.valueOf;
            com.payair.hce.equals DigitizedCardProfile = ((com.payair.hce.hashCode) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, 905350733, -905350733, java.lang.System.identityHashCode(sendorderedbroadcast))).DigitizedCardProfile(com.payair.hce.component6.DigitizedCardProfile, this.AlternateContactlessPaymentDataJson, buildAsJson, this.IccPrivateKeyCrtComponentsJson);
            if (DigitizedCardProfile.DigitizedCardProfile() != 200) {
                getProfileVersion = (getCvrMaskAnd + 11) % 128;
                if (DigitizedCardProfile.DigitizedCardProfile() != 204) {
                    DigitizedCardProfile(DigitizedCardProfile);
                    return;
                }
            }
            int i2 = getCvrMaskAnd + 11;
            getProfileVersion = i2 % 128;
            if (i2 % 2 == 0) {
                if (!AlternateContactlessPaymentDataJson(DigitizedCardProfile)) {
                    byte[] AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(DigitizedCardProfile.writeReplace());
                    com.payair.hce.stopService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson);
                    com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted valueOf = com.mastercard.mpsdk.remotemanagement.api.json.DeleteCardResponseEncrypted.valueOf(AlternateContactlessPaymentDataJson);
                    if (!valueOf.isSuccess()) {
                        throw new com.payair.hce.VisaReperso(valueOf.getErrorDescription(), valueOf.getErrorCode());
                    }
                    this.DigitizedCardProfile.DigitizedCardProfile(new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getPaymentFci, new com.payair.hce.getDir((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile)), this.values)));
                    return;
                }
                int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "ፉ߹Ᏸඐꑐ踿䖦\ueb8c켺붟ݤ\udef1뻶驮벝ʎ䳒䛠ܗ\uefc7╉퍖ꇡ", "嚼嫥뀔㵟", 341501270 - (maximumFlingVelocity >> 16), (char) android.graphics.Color.red(0), objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "짵샓跻\uef10\ud989剢횛褗ⵜ뇍励深␆킄Ѷ픷⺓旅퓘籗鷆넏ｑ\uddb8鵌뵀急쫪њ", "\udbbdྫ띅꠸", android.graphics.Color.alpha(0) + 1158654939, (char) (14519 - android.text.TextUtils.getOffsetBefore("", 0)), objArr2);
                this.DigitizedCardProfile.writeReplace(new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.valueOf, new com.payair.hce.getDir((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile)), this.values, intern, ((java.lang.String) objArr2[0]).intern())), AlternateContactlessPaymentDataJson());
                return;
            }
            AlternateContactlessPaymentDataJson(DigitizedCardProfile);
            throw new java.lang.ArithmeticException();
        } catch (com.payair.hce.VisaReperso e) {
            com.payair.hce.getDatabasePath getdatabasepath = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getPaymentFci, new com.payair.hce.getDir((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile)), this.values, e.writeReplace(), e.getMessage()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath, e}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath));
            this.DigitizedCardProfile.writeReplace(getdatabasepath, AlternateContactlessPaymentDataJson());
        } catch (com.payair.hce.component5 e2) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "ፉ߹Ᏸඐꑐ踿䖦\ueb8c켺붟ݤ\udef1뻶驮벝ʎ䳒䛠ܗ\uefc7╉퍖ꇡ", "嚼嫥뀔㵟", 341501271 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.os.Process.getGidForName("") + 1), objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "䅫䑀퓩餂뙞䝱㮊쇋እꐻ\uf88e侍〛埘펰줅\uf56c祦睭铍걜ߍ䷻ထ驴㪧\uf25e繒鮏迫晅", "孞䜜ꄛᆥ", android.graphics.Color.red(0) + 457645147, (char) (42400 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr4);
            com.payair.hce.getDatabasePath getdatabasepath2 = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getPaymentFci, new com.payair.hce.getDir((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile)), this.values, intern2, ((java.lang.String) objArr4[0]).intern()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath2, e2}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath2));
            this.DigitizedCardProfile.writeReplace(getdatabasepath2, AlternateContactlessPaymentDataJson());
        } catch (java.security.GeneralSecurityException e3) {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "睄⽭虿ꦚ͵斟계㔅痞辴菈\ude20䤞\uf202耀䏉ₛ\ue75d⡼똴葉\ufae0", "쒛㊭Ｍ\ue111", android.text.TextUtils.getCapsMode("", 0, 0), (char) ((-1) - android.view.MotionEvent.axisFromString("")), objArr5);
            java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "㥣蹐峷徻諊舡ꊎꅖᵑ耺꘍\uea42ᮞ\u07b6꾉氏䖑襮힁벻妃䙚㹷\uf184剬徇뗫닉\uee91\udd2e偎⧥짃犯⎭࿔", "誌真ꀘᛄ", android.text.TextUtils.getOffsetAfter("", 0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr6);
            com.payair.hce.getDatabasePath getdatabasepath3 = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.getPaymentFci, new com.payair.hce.getDir((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile)), this.values, intern3, ((java.lang.String) objArr6[0]).intern()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath3, e3}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath3));
            this.DigitizedCardProfile.writeReplace(getdatabasepath3, AlternateContactlessPaymentDataJson());
        }
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        java.lang.Object obj = null;
        if (str != null) {
            int i2 = $11 + 61;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        short s = 0;
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length);
        java.lang.System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr5 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1179, (char) android.view.View.getDefaultSize(s, s));
                    byte length4 = (byte) $$a.length;
                    byte b = (byte) (length4 - 4);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(length4, b, b, objArr3);
                    java.lang.String str4 = (java.lang.String) objArr3[s];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[s] = java.lang.Object.class;
                    obj2 = cls.getMethod(str4, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 3443 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (3831 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)));
                    java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                    clsArr2[s] = java.lang.Object.class;
                    obj3 = cls2.getMethod("g", clsArr2);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                char c2 = cArr3[getwalletdata.writeReplace % 4];
                java.lang.Object[] objArr5 = new java.lang.Object[3];
                objArr5[2] = java.lang.Integer.valueOf(cArr4[intValue]);
                objArr5[1] = java.lang.Integer.valueOf(c2 * 32718);
                objArr5[s] = getwalletdata;
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.graphics.Color.alpha((int) s), android.view.View.MeasureSpec.getMode(s) + 1864, (char) (41775 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(1, s, s, objArr6);
                    java.lang.String str5 = (java.lang.String) objArr6[s];
                    java.lang.Class<?>[] clsArr3 = new java.lang.Class[3];
                    clsArr3[s] = java.lang.Object.class;
                    clsArr3[1] = java.lang.Integer.TYPE;
                    clsArr3[2] = java.lang.Integer.TYPE;
                    obj4 = cls3.getMethod(str5, clsArr3);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                char c3 = cArr3[intValue2];
                java.lang.Object[] objArr7 = new java.lang.Object[2];
                objArr7[1] = java.lang.Integer.valueOf(cArr4[intValue]);
                objArr7[s] = java.lang.Integer.valueOf(c3 * 32718);
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 27, 3134 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(s, s, s, objArr8);
                    java.lang.String str6 = (java.lang.String) objArr8[s];
                    java.lang.Class<?>[] clsArr4 = new java.lang.Class[2];
                    clsArr4[s] = java.lang.Integer.TYPE;
                    clsArr4[1] = java.lang.Integer.TYPE;
                    obj5 = cls4.getMethod(str6, clsArr4);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                cArr5[getwalletdata.writeReplace] = (char) ((((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ 1263759066225628708L)) ^ ((cArr3[intValue2] ^ charArray2[getwalletdata.writeReplace]) ^ (RecordsJson ^ 1263759066225628708L))) ^ ((char) (getAid ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                int i3 = $11 + 103;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 / 5;
                }
                obj = null;
                s = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    @Override // com.payair.hce.deleteDatabase
    final com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest values() throws java.security.GeneralSecurityException {
        com.payair.hce.openFileOutput openfileoutput = (com.payair.hce.openFileOutput) this.writeReplace;
        com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest writeReplace = writeReplace(values(new com.mastercard.mpsdk.remotemanagement.api.json.DeleteCardRequestEncrypted(this.values, (java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{openfileoutput}, -350567645, 350567645, java.lang.System.identityHashCode(openfileoutput)), openfileoutput.values()).buildAsJson()));
        int i = getProfileVersion + 91;
        getCvrMaskAnd = i % 128;
        if (i % 2 != 0) {
            return writeReplace;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        getCvrMaskAnd = 1;
        RecordsJson = 1263759066225628708L;
        SdkCoreAlternateContactlessPaymentDataImpl = -804334044;
        getAid = (char) 56018;
    }

    static void init$0() {
        $$a = new byte[]{34, -19, 77, -23};
        $$b = 112;
    }
}
