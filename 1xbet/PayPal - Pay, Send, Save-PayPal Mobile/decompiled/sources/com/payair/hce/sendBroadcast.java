package com.payair.hce;

/* loaded from: classes4.dex */
public final class sendBroadcast extends com.payair.hce.deleteDatabase {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static long getProfileVersion;
    private boolean RecordsJson;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2 = 119 - (s * 2);
        int i3 = (b * 2) + 4;
        int i4 = s2 * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i3;
            int i6 = i4;
            int i7 = 0;
            int i8 = i3 + i6;
            int i9 = i5 + 1;
            i = i7;
            i2 = i8;
            i3 = i9;
            bArr2[i] = (byte) i2;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i2;
            i5 = i3;
            i3 = bArr[i3];
            i7 = i + 1;
            i6 = i10;
            int i82 = i3 + i6;
            int i92 = i5 + 1;
            i = i7;
            i2 = i82;
            i3 = i92;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        }
    }

    public sendBroadcast(com.payair.hce.sendOrderedBroadcast sendorderedbroadcast, com.payair.hce.getPackageResourcePath getpackageresourcepath, java.lang.String str, com.payair.hce.deleteFile deletefile, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        super(sendorderedbroadcast, getpackageresourcepath, str, deletefile, deletesharedpreferences);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.AlternateContactlessPaymentDataJson);
        sb.append(com.payair.hce.removeStickyBroadcast.DigitizedCardProfile);
        this.AlternateContactlessPaymentDataJson = sb.toString();
        this.RecordsJson = false;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr = str;
        if (str != null) {
            $10 = ($11 + 117) % 128;
            cArr = str.toCharArray();
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(getProfileVersion ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            $11 = ($10 + 75) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(getProfileVersion)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39, 1921 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.graphics.Color.blue(0));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, (short) 1, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 429 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.MotionEvent.axisFromString("") + 31611));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((byte) 0, (short) 0, (short) 0, objArr5);
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

    @Override // com.payair.hce.deleteDatabase
    public final void writeReplace() {
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 13) % 128;
        com.payair.hce.getExternalFilesDir getexternalfilesdir = (com.payair.hce.getExternalFilesDir) this.writeReplace;
        try {
            java.lang.String buildAsJson = values().buildAsJson();
            int i = com.payair.hce.sendOrderedBroadcastAsUser.values;
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.valueOf;
            com.payair.hce.equals DigitizedCardProfile = ((com.payair.hce.hashCode) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, 905350733, -905350733, java.lang.System.identityHashCode(sendorderedbroadcast))).DigitizedCardProfile(com.payair.hce.component6.DigitizedCardProfile, this.AlternateContactlessPaymentDataJson, buildAsJson, this.IccPrivateKeyCrtComponentsJson);
            if (DigitizedCardProfile.DigitizedCardProfile() != 200) {
                getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 49) % 128;
                if (DigitizedCardProfile.DigitizedCardProfile() != 204) {
                    getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 15) % 128;
                    return;
                }
            }
            int i2 = getAid + 105;
            SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
            if (i2 % 2 == 0) {
                AlternateContactlessPaymentDataJson(DigitizedCardProfile);
                throw new java.lang.NullPointerException();
            }
            if (!AlternateContactlessPaymentDataJson(DigitizedCardProfile)) {
                byte[] AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(DigitizedCardProfile.writeReplace());
                com.payair.hce.stopService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson);
                com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted valueOf = com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted.valueOf(AlternateContactlessPaymentDataJson);
                if (!valueOf.isSuccess()) {
                    throw new com.payair.hce.VisaReperso(valueOf.getErrorDescription(), valueOf.getErrorCode());
                }
                this.DigitizedCardProfile.DigitizedCardProfile(new com.payair.hce.getDatabasePath(2, new com.payair.hce.fileList((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getexternalfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getexternalfilesdir)), this.values)));
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\uf625\ue8c4枺\uf676\udb98\uf607ǁ漐㨆៳啧鏢溰⍒餃쑌鍄炨겣ࠠ쟫调\uf04f㲝\u0b97\ud873ϸ", android.text.TextUtils.indexOf("", "", 0), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("냣櫂\udcd6날妗쉇몵嬢糇閚\uee34꞊⡐ꅪ≉\uf021햰\uf29fឦ㱋脂ฮ䬇ࢯ䵪婉룦唊竎韪\uecd2ꆶ♭", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, objArr2);
            this.DigitizedCardProfile.writeReplace(new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.values, new com.payair.hce.fileList(this.values, intern, ((java.lang.String) objArr2[0]).intern())), AlternateContactlessPaymentDataJson());
        } catch (com.payair.hce.VisaReperso e) {
            com.payair.hce.getDatabasePath getdatabasepath = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.values, new com.payair.hce.fileList(this.values, e.writeReplace(), e.getMessage()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath, e}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath));
            this.DigitizedCardProfile.writeReplace(getdatabasepath, AlternateContactlessPaymentDataJson());
        } catch (com.payair.hce.component5 e2) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a("\uf625\ue8c4枺\uf676\udb98\uf607ǁ漐㨆៳啧鏢溰⍒餃쑌鍄炨겣ࠠ쟫调\uf04f㲝\u0b97\ud873ϸ", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a("疶삅⥣痰\uf3fc\uf57c伺汘릳㾙ᯓ邠\ued19\u0b7dퟶ윌ჳ壞\ue246ୠ䑓ꐽ뺛㿠蠂\uf02d䵓戦뾓㶬ᥦ隑\ue365ॉ햝", android.graphics.Color.blue(0), objArr4);
            com.payair.hce.getDatabasePath getdatabasepath2 = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.values, new com.payair.hce.fileList(this.values, intern2, ((java.lang.String) objArr4[0]).intern()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath2, e2}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath2));
            this.DigitizedCardProfile.writeReplace(getdatabasepath2, AlternateContactlessPaymentDataJson());
        } catch (java.security.GeneralSecurityException e3) {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a("숍깂ㆊ쉞鴞在埱츿ฮ全̓㋐媙旕켽敲Ꝭ㘪朗ꤙ\uf3d2쪟Ꙩ鶲㾢黨", android.text.TextUtils.indexOf("", "", 0, 0), objArr5);
            java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a("햆塂㆞헀欻셥埇塁ᦃꝞ̮꒹䴩鎺켋\uf303냅쀈覆㽽\ue472㳺Ꙝை⠗棏嗫嘾ᾲꔺƈꊂ䍔釚촍\ueec0뛕칷\uf8ea㴃", android.graphics.Color.red(0), objArr6);
            com.payair.hce.getDatabasePath getdatabasepath3 = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.values, new com.payair.hce.fileList(this.values, intern3, ((java.lang.String) objArr6[0]).intern()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath3, e3}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath3));
            this.DigitizedCardProfile.writeReplace(getdatabasepath3, AlternateContactlessPaymentDataJson());
        }
    }

    @Override // com.payair.hce.deleteDatabase
    final com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest values() throws java.security.GeneralSecurityException {
        com.payair.hce.getExternalFilesDir getexternalfilesdir = (com.payair.hce.getExternalFilesDir) this.writeReplace;
        com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest writeReplace = writeReplace(values(new com.mastercard.mpsdk.remotemanagement.api.json.NotifyProvisionRequestEncrypted(this.values, (java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getexternalfilesdir}, -350567645, 350567645, java.lang.System.identityHashCode(getexternalfilesdir)), getexternalfilesdir.writeReplace(), getexternalfilesdir.values(), getexternalfilesdir.DigitizedCardProfile()).buildAsJson()));
        int i = getAid + 11;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            return writeReplace;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        getProfileVersion = 4603797063409944539L;
    }

    static void init$0() {
        $$a = new byte[]{106, 94, -55, -52};
        $$b = 81;
    }
}
