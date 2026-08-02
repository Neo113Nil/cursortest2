package com.payair.hce;

/* loaded from: classes4.dex */
public final class clearWallpaper extends com.payair.hce.deleteDatabase {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int RecordsJson;
    private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static long getAid;
    private static int getPaymentFci;
    private static char getProfileVersion;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2 = 4 - (s * 3);
        int i3 = 113 - b;
        byte[] bArr = $$a;
        int i4 = 1 - (s2 * 3);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i5 = i4;
            i = 0;
            i3 += -i5;
            i2++;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = bArr[i2];
            i3 += -i5;
            i2++;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
            }
        }
    }

    public clearWallpaper(com.payair.hce.sendOrderedBroadcast sendorderedbroadcast, com.payair.hce.getPackageResourcePath getpackageresourcepath, java.lang.String str, com.payair.hce.deleteFile deletefile, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        super(sendorderedbroadcast, getpackageresourcepath, str, deletefile, deletesharedpreferences);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.AlternateContactlessPaymentDataJson);
        sb.append(com.payair.hce.removeStickyBroadcast.getAid);
        this.AlternateContactlessPaymentDataJson = sb.toString();
    }

    @Override // com.payair.hce.deleteDatabase
    public final void writeReplace() {
        com.payair.hce.getFileStreamPath getfilestreampath = (com.payair.hce.getFileStreamPath) this.writeReplace;
        int i = com.payair.hce.sendOrderedBroadcastAsUser.getProfileVersion;
        com.payair.hce.deleteFile deletefile = this.writeReplace;
        if (((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile))) == null) {
            getPaymentFci = (RecordsJson + 31) % 128;
            i = com.payair.hce.sendOrderedBroadcastAsUser.IccPrivateKeyCrtComponentsJson;
        }
        int i2 = i;
        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.valueOf;
        if (!((com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast))).writeReplace()) {
            java.lang.String str = (java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getfilestreampath}, -350567645, 350567645, java.lang.System.identityHashCode(getfilestreampath));
            java.lang.String str2 = this.values;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("丕計오Ɍ幨骆횽ዊ滥ꬖ\ue73d⍒罡뮂\uf7b9㏚\u0fe1䠙萱", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50207, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("丕➌鵌猀\ue8d8庚㑱ꨠϹ輦潳씥뫕၃虂翄햛䬓ℓ雐ಷ\ue27c堣ㇻꞷᴵ", 27067 - android.text.TextUtils.indexOf("", ""), objArr2);
            this.DigitizedCardProfile.writeReplace(new com.payair.hce.getDatabasePath(i2, new com.payair.hce.moveDatabaseFrom(str, str2, -1, intern, ((java.lang.String) objArr2[0]).intern())), AlternateContactlessPaymentDataJson());
        }
        try {
            java.lang.String buildAsJson = values().buildAsJson();
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.valueOf;
            com.payair.hce.equals DigitizedCardProfile = ((com.payair.hce.hashCode) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, 905350733, -905350733, java.lang.System.identityHashCode(sendorderedbroadcast2))).DigitizedCardProfile(com.payair.hce.component6.DigitizedCardProfile, this.AlternateContactlessPaymentDataJson, buildAsJson, this.IccPrivateKeyCrtComponentsJson);
            if (DigitizedCardProfile.DigitizedCardProfile() != 200 && DigitizedCardProfile.DigitizedCardProfile() != 204) {
                getPaymentFci = (RecordsJson + 93) % 128;
                DigitizedCardProfile(DigitizedCardProfile);
                return;
            }
            if (AlternateContactlessPaymentDataJson(DigitizedCardProfile)) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a("下斿ᥕ쳮\ue097鐸䯇罠ጕ욭祐긚䖽祋⳻삚\uf426ꯔ彫猓⚶\uda48踈", android.text.TextUtils.getOffsetAfter("", 0) + 11171, objArr3);
                java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a("丛얄天\uecc6恘\uf7adୌ黊ኣ\ua631㶝넍쓧塠\uef96捃\uf729ઍ鸋ᖻꥥ㳎뀎쐺宭\uef01抖\uf66aඪ", 35729 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr4);
                java.lang.String intern3 = ((java.lang.String) objArr4[0]).intern();
                com.payair.hce.deleteFile deletefile2 = this.writeReplace;
                this.DigitizedCardProfile.writeReplace(new com.payair.hce.getDatabasePath(i2, new com.payair.hce.moveDatabaseFrom((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile2}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile2)), this.values, -1, intern2, intern3)), AlternateContactlessPaymentDataJson());
                return;
            }
            byte[] AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(DigitizedCardProfile.writeReplace());
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson);
            com.mastercard.mpsdk.remotemanagement.api.json.SetMobilePinResponseEncrypted valueOf = com.mastercard.mpsdk.remotemanagement.api.json.SetMobilePinResponseEncrypted.valueOf(AlternateContactlessPaymentDataJson);
            com.mastercard.mpsdk.remotemanagement.api.json.SetMobilePinResponseEncrypted setMobilePinResponseEncrypted = valueOf;
            if (!valueOf.isSuccess()) {
                throw new com.payair.hce.VisaReperso(valueOf.getErrorDescription(), valueOf.getErrorCode());
            }
            if (valueOf.getResult().equalsIgnoreCase(com.payair.hce.sendBroadcastAsUser.AlternateContactlessPaymentDataJson.toString())) {
                com.payair.hce.deleteFile deletefile3 = this.writeReplace;
                this.DigitizedCardProfile.DigitizedCardProfile(new com.payair.hce.getDatabasePath(i2, new com.payair.hce.moveDatabaseFrom((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile3}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile3)), this.values, valueOf.getMobilePinTriesRemaining(), valueOf.getErrorCode(), valueOf.getErrorDescription())));
                return;
            }
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a("丑呿竉Ĭ➮쨇큫\uf6c4鵄ꎶ䘏沔狶᥄㾪숺\ue897軱镳믝", (-16770455) - android.graphics.Color.rgb(0, 0, 0), objArr5);
            java.lang.String intern4 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a("丑㓛믡㻰ꖞ⢋꾳ቀ饄ᰭ荹\u0602贶瀣\uf6cb緕\ue0fc柅\ueaa2円풒嬉\ude75䕦점伍㈦룎㿑ꋥ⦾겟᎗雵ᵑ聚ݸ訶焕\uf42b笱\ue1c3擝\uebf2滄햡墇\udf95䈈쥷䱷㌞똉㴬ꏕ⛇궮", 31468 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr6);
            java.lang.String intern5 = ((java.lang.String) objArr6[0]).intern();
            com.payair.hce.deleteFile deletefile4 = this.writeReplace;
            this.DigitizedCardProfile.writeReplace(new com.payair.hce.getDatabasePath(i2, new com.payair.hce.moveDatabaseFrom((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile4}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile4)), this.values, valueOf.getMobilePinTriesRemaining(), intern4, intern5)), AlternateContactlessPaymentDataJson());
            getPaymentFci = (RecordsJson + 93) % 128;
        } catch (com.payair.hce.VisaReperso e) {
            com.payair.hce.getDatabasePath getdatabasepath = new com.payair.hce.getDatabasePath(i2, new com.payair.hce.moveDatabaseFrom((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getfilestreampath}, -350567645, 350567645, java.lang.System.identityHashCode(getfilestreampath)), this.values, -1, e.writeReplace(), e.getMessage()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath, e}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath));
            this.DigitizedCardProfile.writeReplace(getdatabasepath, AlternateContactlessPaymentDataJson());
        } catch (com.payair.hce.component5 e2) {
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a("下斿ᥕ쳮\ue097鐸䯇罠ጕ욭祐긚䖽祋⳻삚\uf426ꯔ彫猓⚶\uda48踈", android.text.TextUtils.indexOf("", "", 0) + 11171, objArr7);
            java.lang.String intern6 = ((java.lang.String) objArr7[0]).intern();
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            a("丞蒂\udb47⸅擑뮛踚씱ᯯ滫ꕳ\uf829컹Մ堗껙\ue58d㠓༶䗭颐\uef5f≪磧侵艪\ud8d3⾄扟뤃辜", 51899 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr8);
            com.payair.hce.getDatabasePath getdatabasepath2 = new com.payair.hce.getDatabasePath(i2, new com.payair.hce.moveDatabaseFrom((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getfilestreampath}, -350567645, 350567645, java.lang.System.identityHashCode(getfilestreampath)), this.values, -1, intern6, ((java.lang.String) objArr8[0]).intern()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath2, e2}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath2));
            this.DigitizedCardProfile.writeReplace(getdatabasepath2, AlternateContactlessPaymentDataJson());
        } catch (java.security.GeneralSecurityException e3) {
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            a("下佗䲅䷦䬷䡽䧃䜅䑔䖴䋱䀳䆝廇尊嵤媷實奌嚛埋唭", 331 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr9);
            java.lang.String intern7 = ((java.lang.String) objArr9[0]).intern();
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            a("丞ᅎ\uf0df偑㏡鍯犲퉭떏ᕗ\uf49b含㞯霡皣\ud9d1륜ᢟ\uf874寨㭥髮稇\udd9a봄᳧ﰨ徺㼮鸃懩셼ꃫ\"\ue3d2䌳", 24438 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr10);
            com.payair.hce.getDatabasePath getdatabasepath3 = new com.payair.hce.getDatabasePath(i2, new com.payair.hce.moveDatabaseFrom((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getfilestreampath}, -350567645, 350567645, java.lang.System.identityHashCode(getfilestreampath)), this.values, -1, intern7, ((java.lang.String) objArr10[0]).intern()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath3, e3}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath3));
            this.DigitizedCardProfile.writeReplace(getdatabasepath3, AlternateContactlessPaymentDataJson());
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $10 + 115;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            int i3 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 31, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1889, (char) (3600 - android.text.TextUtils.getOffsetAfter("", 0)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((short) 0, (short) 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (getAid ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.widget.ExpandableListView.getPackedPositionType(0L), 1442 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.KeyEvent.keyCodeFromString("") + 29682));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c((short) 0, (short) 0, (byte) 1, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                $10 = ($11 + 49) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            $10 = ($11 + 19) % 128;
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.view.View.combineMeasuredStates(0, 0) + 1443, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29683));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                c((short) 0, (short) 0, (byte) 1, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        java.lang.String str2 = new java.lang.String(cArr);
        int i4 = $11 + 7;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    private static void b(int i, java.lang.String str, byte b, java.lang.Object[] objArr) {
        int i2;
        java.lang.Object obj;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = SdkCoreAlternateContactlessPaymentDataImpl;
        java.lang.Object obj2 = null;
        int i3 = 8;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4])};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj3 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 49, 2508 - (android.view.ViewConfiguration.getWindowTouchSlop() >> i3), (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6802));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((short) 0, (short) 0, (byte) 48, objArr3);
                        obj3 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj3);
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = 8;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(getProfileVersion)};
        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj4 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.KeyEvent.getDeadChar(0, 0), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2460, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 6802));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            c((short) 0, (short) 0, (byte) 48, objArr5);
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
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                    obj = obj2;
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj5 == null) {
                        obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 3596 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj5);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj6 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 49, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2665, (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 18889));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            c((short) 0, (short) 0, (byte) 40, objArr8);
                            obj6 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj6);
                        }
                        obj = null;
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr7)).intValue();
                        int i5 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i6 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i5 * charValue) + i6];
                    } else {
                        obj = null;
                        if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                            digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                            digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                            int i7 = digitizedCardJson12.DigitizedCardProfile;
                            int i8 = digitizedCardJson12.RecordsJson;
                            int i9 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i10 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            cArr3[digitizedCardJson12.values] = cArr[(i7 * charValue) + i8];
                            cArr3[digitizedCardJson12.values + 1] = cArr[(i9 * charValue) + i10];
                        } else {
                            int i11 = digitizedCardJson12.DigitizedCardProfile;
                            int i12 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                            int i13 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                            int i14 = digitizedCardJson12.RecordsJson;
                            cArr3[digitizedCardJson12.values] = cArr[(i11 * charValue) + i12];
                            cArr3[digitizedCardJson12.values + 1] = cArr[(i13 * charValue) + i14];
                        }
                    }
                }
                digitizedCardJson12.values += 2;
                obj2 = obj;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            cArr3[i15] = (char) (cArr3[i15] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // com.payair.hce.deleteDatabase
    final com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest values() throws java.security.GeneralSecurityException {
        try {
            java.lang.String obj = java.util.UUID.randomUUID().toString();
            com.payair.hce.getFileStreamPath getfilestreampath = (com.payair.hce.getFileStreamPath) this.writeReplace;
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.valueOf;
            com.payair.hce.setStatusMessage setstatusmessage = (com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast));
            setstatusmessage.values();
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.valueOf;
            com.payair.hce.onNewToken onnewtoken = (com.payair.hce.onNewToken) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, 1288350908, -1288350905, java.lang.System.identityHashCode(sendorderedbroadcast2));
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast3 = this.valueOf;
            com.payair.hce.checkAutomaticTimeSettings DigitizedCardProfile = onnewtoken.DigitizedCardProfile(setstatusmessage.values().AlternateContactlessPaymentDataJson(), (com.payair.hce.updateRNSInformation) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast3}, 389581613, -389581611, java.lang.System.identityHashCode(sendorderedbroadcast3)), ((com.payair.hce.getErrors) com.payair.hce.getFileStreamPath.AlternateContactlessPaymentDataJson(new java.lang.Object[]{getfilestreampath}, 2145505733, -2145505733, java.lang.System.identityHashCode(getfilestreampath))).values());
            com.mastercard.mpsdk.remotemanagement.api.json.SetMobilePinRequestEncrypted setMobilePinRequestEncrypted = new com.mastercard.mpsdk.remotemanagement.api.json.SetMobilePinRequestEncrypted(this.values, (java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getfilestreampath}, -350567645, 350567645, java.lang.System.identityHashCode(getfilestreampath)), obj);
            setMobilePinRequestEncrypted.setNewMobilePin(DigitizedCardProfile);
            java.lang.String values = values(setMobilePinRequestEncrypted.buildAsJson());
            int i = getPaymentFci;
            RecordsJson = (i + 27) % 128;
            int i2 = i + 109;
            RecordsJson = i2 % 128;
            com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest writeReplace = writeReplace(values);
            if (i2 % 2 == 0) {
                return writeReplace;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Exception e) {
            try {
                java.lang.Object[] objArr = {e.getMessage()};
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b(38 - (android.os.Process.myTid() >> 22), "\u000e\u0017\u0013\u0004\u0006\u0012\u000b\f\u0002\u0001\u0001\u0017\u0012\t\u0005\f\n\u000f\u0004\u0014\u0007\u000b\u000b\f\u0002\u0001\u0001\u0017\u000f\u0013\u0001\f\r\u0014\u0017\u0001\u0014\n", (byte) (47 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr2);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    static void DigitizedCardProfile() {
        SdkCoreAlternateContactlessPaymentDataImpl = new char[]{12344, 12351, 12338, 12323, 12327, 12324, 12326, 12301, 12388, 12321, 12335, 12329, 12313, 12320, 12348, 12325, 12345, 12347, 12303, 12339, 12322, 12350, 12349, 12346, 12331};
        getProfileVersion = (char) 1493;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        getPaymentFci = 1;
        DigitizedCardProfile();
        getAid = -3986264583364069168L;
    }

    static void init$0() {
        $$a = new byte[]{57, 59, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 75};
        $$b = 120;
    }
}
