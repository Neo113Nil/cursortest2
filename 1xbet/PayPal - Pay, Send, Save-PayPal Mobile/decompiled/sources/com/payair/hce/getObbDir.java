package com.payair.hce;

/* loaded from: classes4.dex */
public final class getObbDir extends com.payair.hce.deleteDatabase {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char RecordsJson;
    private static long SdkCoreAlternateContactlessPaymentDataImpl;
    private static boolean SdkCoreBusinessLogicModuleImpl;
    private static int getAid;
    private static int getCardLayoutDescription;
    private static char[] getCiacDecline;
    private static int getCvrMaskAnd;
    private static boolean getGpoResponse;
    private static int getPaymentFci;
    private java.lang.String getProfileVersion;

    private static void c(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i = s2 + 102;
        int i2 = b * 3;
        byte[] bArr = $$a;
        int i3 = 3 - (s * 4);
        byte[] bArr2 = new byte[1 - i2];
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i = (-i3) + i;
            i3 = i3;
        }
        while (true) {
            int i5 = i4 + 1;
            int i6 = i3 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == 0 - i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i4 = i5;
            i = (-bArr[i6]) + i;
            i3 = i6;
        }
    }

    public getObbDir(com.payair.hce.sendOrderedBroadcast sendorderedbroadcast, com.payair.hce.getPackageResourcePath getpackageresourcepath, java.lang.String str, com.payair.hce.deleteFile deletefile, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        super(sendorderedbroadcast, getpackageresourcepath, str, deletefile, deletesharedpreferences);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.AlternateContactlessPaymentDataJson);
        sb.append(com.payair.hce.removeStickyBroadcast.getAid);
        this.AlternateContactlessPaymentDataJson = sb.toString();
    }

    @Override // com.payair.hce.deleteDatabase
    public final void writeReplace() {
        com.payair.hce.deleteFile deletefile = this.writeReplace;
        int i = com.payair.hce.sendOrderedBroadcastAsUser.RecordsJson;
        com.payair.hce.deleteFile deletefile2 = this.writeReplace;
        if (((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile2}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile2))) == null) {
            i = com.payair.hce.sendOrderedBroadcastAsUser.SdkCoreAlternateContactlessPaymentDataImpl;
        }
        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.valueOf;
        if (!((com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast))).writeReplace()) {
            java.lang.String str = (java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile));
            java.lang.String str2 = this.values;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "ﮐꡢ⊜㉦䆌\u2061㇔㎳爌푷\ue387⹆뜹铄ꗲ㍄꽂◷ӷ", "滜烇Ⴗ䍄", android.view.KeyEvent.keyCodeFromString("") - 1217345682, (char) ((android.os.Process.myTid() >> 22) + 17424), objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "㭇\uf320㡰♊ꇗ\udb43㷵ꕦ쀽㶤⇒ớ솏겾\ufaedﲢ詒䒭廇\udede軉찣拙淙⏨粇", "\ue14e蟫瓹ꄢ", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8820), objArr2);
            this.DigitizedCardProfile.writeReplace(new com.payair.hce.getDatabasePath(i, new com.payair.hce.openOrCreateDatabase(str, str2, -1, intern, ((java.lang.String) objArr2[0]).intern())), ((java.lang.Integer) com.payair.hce.deleteDatabase.AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -462338634, 462338634, java.lang.System.identityHashCode(this))).intValue());
        }
        try {
            java.lang.String buildAsJson = values().buildAsJson();
            this.DigitizedCardProfile.valueOf(new com.payair.hce.getDatabasePath(i, new com.payair.hce.openOrCreateDatabase((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile)), this.values, this.getProfileVersion)));
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.valueOf;
            com.payair.hce.equals DigitizedCardProfile = ((com.payair.hce.hashCode) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, 905350733, -905350733, java.lang.System.identityHashCode(sendorderedbroadcast2))).DigitizedCardProfile(com.payair.hce.component6.DigitizedCardProfile, this.AlternateContactlessPaymentDataJson, buildAsJson, this.IccPrivateKeyCrtComponentsJson);
            if (DigitizedCardProfile.DigitizedCardProfile() != 200 && DigitizedCardProfile.DigitizedCardProfile() != 204) {
                getCardLayoutDescription = (getCvrMaskAnd + 95) % 128;
                DigitizedCardProfile(DigitizedCardProfile);
                return;
            }
            int i2 = getCardLayoutDescription + 89;
            getCvrMaskAnd = i2 % 128;
            if (i2 % 2 == 0) {
                if (!AlternateContactlessPaymentDataJson(DigitizedCardProfile)) {
                    byte[] AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(DigitizedCardProfile.writeReplace());
                    com.payair.hce.stopService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson);
                    com.mastercard.mpsdk.remotemanagement.api.json.ChangeMobilePinResponseEncrypted valueOf = com.mastercard.mpsdk.remotemanagement.api.json.ChangeMobilePinResponseEncrypted.valueOf(AlternateContactlessPaymentDataJson);
                    com.mastercard.mpsdk.remotemanagement.api.json.ChangeMobilePinResponseEncrypted changeMobilePinResponseEncrypted = valueOf;
                    if (!valueOf.isSuccess()) {
                        throw new com.payair.hce.VisaReperso(valueOf.getErrorDescription(), valueOf.getErrorCode());
                    }
                    if (valueOf.getResult().equalsIgnoreCase(com.payair.hce.sendBroadcastAsUser.AlternateContactlessPaymentDataJson.toString())) {
                        com.payair.hce.deleteFile deletefile3 = this.writeReplace;
                        this.DigitizedCardProfile.DigitizedCardProfile(new com.payair.hce.getDatabasePath(i, new com.payair.hce.openOrCreateDatabase((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile3}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile3)), this.values, valueOf.getMobilePinTriesRemaining(), valueOf.getErrorCode(), valueOf.getErrorDescription())));
                        return;
                    }
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "챓\ue8eb䐟ﰭ\udc41\ued31\udbe2늼佢㲞㽤읹ر袗㢦龞쨏\udf2a侵⮫", "햂\ue7f0巶\ud998", android.view.ViewConfiguration.getPressedStateDuration() >> 16, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr3);
                    java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                    int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "\u0ee5ጦ㍗듦☭뉚痈櫗犒ᬩܰ\udaea\u09d3衮遠掄늑쓷哋ର韽僂팖ⲇ㬐逕\ue3b6ẛ휰瞳㢅褝퓼㵴喷屓⳥뿘槡娉礽瓰覘瓾ﶾ矓薉韘\ueffdə쑹쪠此ꨴꦈ䟃곻", "러ᇥᢢ벡", (-1575885386) - bitsPerPixel, (char) (41288 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr4);
                    java.lang.String intern3 = ((java.lang.String) objArr4[0]).intern();
                    com.payair.hce.deleteFile deletefile4 = this.writeReplace;
                    this.DigitizedCardProfile.writeReplace(new com.payair.hce.getDatabasePath(i, new com.payair.hce.openOrCreateDatabase((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile4}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile4)), this.values, valueOf.getMobilePinTriesRemaining(), intern2, intern3)), ((java.lang.Integer) com.payair.hce.deleteDatabase.AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -462338634, 462338634, java.lang.System.identityHashCode(this))).intValue());
                    getCardLayoutDescription = (getCvrMaskAnd + 121) % 128;
                    return;
                }
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "뮔ꄪ鰉꽰\uda9b宓ᛃ\ud834\uf108\ue79eܼ\u0a5fబ䉀釨唿\udc4a饧\udd38\udab9鯖兾勀", "ፖ䑾귱ㅸ", (-247169517) - android.view.View.MeasureSpec.getMode(0), (char) (android.view.MotionEvent.axisFromString("") + 1), objArr5);
                java.lang.String intern4 = ((java.lang.String) objArr5[0]).intern();
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "⤆훣㊤ᎂ啰鮣対셰롹㱎ᘭ꾦暠쉪˚ᆎ\ue602篎䳮ꧭ\ue3a0\uf0b8䈃\uf716➿㾁変\uda8f贸", "얐넵矠\ue32a", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 525257275, (char) (10871 - android.view.View.combineMeasuredStates(0, 0)), objArr6);
                java.lang.String intern5 = ((java.lang.String) objArr6[0]).intern();
                com.payair.hce.deleteFile deletefile5 = this.writeReplace;
                this.DigitizedCardProfile.writeReplace(new com.payair.hce.getDatabasePath(i, new com.payair.hce.openOrCreateDatabase((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile5}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile5)), this.values, -1, intern4, intern5)), ((java.lang.Integer) com.payair.hce.deleteDatabase.AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -462338634, 462338634, java.lang.System.identityHashCode(this))).intValue());
                return;
            }
            AlternateContactlessPaymentDataJson(DigitizedCardProfile);
            throw null;
        } catch (com.payair.hce.VisaReperso e) {
            com.payair.hce.getDatabasePath getdatabasepath = new com.payair.hce.getDatabasePath(i, new com.payair.hce.openOrCreateDatabase((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile)), this.values, -1, e.writeReplace(), e.getMessage()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath, e}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath));
            this.DigitizedCardProfile.writeReplace(getdatabasepath, ((java.lang.Integer) com.payair.hce.deleteDatabase.AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -462338634, 462338634, java.lang.System.identityHashCode(this))).intValue());
        } catch (com.payair.hce.component5 e2) {
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "뮔ꄪ鰉꽰\uda9b宓ᛃ\ud834\uf108\ue79eܼ\u0a5fబ䉀釨唿\udc4a饧\udd38\udab9鯖兾勀", "ፖ䑾귱ㅸ", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 247169517, (char) android.text.TextUtils.indexOf("", "", 0, 0), objArr7);
            java.lang.String intern6 = ((java.lang.String) objArr7[0]).intern();
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "\ueb8cⰢ褸ܥﭤế旵쩥ﳿ㤲锢⩉煈刅ঀﰜ탡둖ᘒﰿ턂킚㬣얯ﱍ鞪ሡﹰ\uf506⛻점", "\ue1f6Â컁層", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1056914720, (char) (15309 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr8);
            com.payair.hce.getDatabasePath getdatabasepath2 = new com.payair.hce.getDatabasePath(i, new com.payair.hce.openOrCreateDatabase((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile)), this.values, -1, intern6, ((java.lang.String) objArr8[0]).intern()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath2, e2}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath2));
            this.DigitizedCardProfile.writeReplace(getdatabasepath2, ((java.lang.Integer) com.payair.hce.deleteDatabase.AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -462338634, 462338634, java.lang.System.identityHashCode(this))).intValue());
        } catch (java.security.GeneralSecurityException e3) {
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "⬺\ue05dじ褸㲮\ue731ࡆ㹣㯶Ɦ訟䗣ஊ诉⢪\udfb1\uee7f￦柃ꌁ쨑잵", "ꙵ\uedd9鎍ㆼ", android.view.KeyEvent.getDeadChar(0, 0), (char) android.text.TextUtils.getOffsetBefore("", 0), objArr9);
            java.lang.String intern7 = ((java.lang.String) objArr9[0]).intern();
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "華䛉⧺깶潾㪀ḧ㫃䨆ʕ௳ퟞ\ue64a냊➯ꟳȧꠉ쇌쩲\udad9팒壴\ud9cc똚ᎏ颪鬴恵꺁뚒䬸嵣䋲殪\uf3f0", "↔\ue2a2\uf1bc\u200e", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr10);
            com.payair.hce.getDatabasePath getdatabasepath3 = new com.payair.hce.getDatabasePath(i, new com.payair.hce.openOrCreateDatabase((java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{deletefile}, -350567645, 350567645, java.lang.System.identityHashCode(deletefile)), this.values, -1, intern7, ((java.lang.String) objArr10[0]).intern()));
            com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath3, e3}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath3));
            this.DigitizedCardProfile.writeReplace(getdatabasepath3, ((java.lang.Integer) com.payair.hce.deleteDatabase.AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -462338634, 462338634, java.lang.System.identityHashCode(this))).intValue());
        }
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char[] cArr3;
        char c2;
        if (str3 != null) {
            $10 = ($11 + 17) % 128;
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr4 = cArr;
        if (str2 != null) {
            int i2 = $11 + 53;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr2 = str2.toCharArray();
        } else {
            cArr2 = str2;
        }
        char[] cArr5 = cArr2;
        if (str != null) {
            $11 = ($10 + 17) % 128;
            cArr3 = str.toCharArray();
        } else {
            cArr3 = str;
        }
        char[] cArr6 = cArr3;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr4.length;
        char[] cArr7 = new char[length];
        int length2 = cArr6.length;
        char[] cArr8 = new char[length2];
        java.lang.System.arraycopy(cArr4, 0, cArr7, 0, length);
        java.lang.System.arraycopy(cArr6, 0, cArr8, 0, length2);
        cArr7[0] = (char) (cArr7[0] ^ c);
        cArr8[2] = (char) (cArr8[2] + ((char) i));
        int length3 = cArr5.length;
        char[] cArr9 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 71, android.graphics.Color.blue(0) + 1179, (char) android.text.TextUtils.getOffsetBefore("", 0));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((short) 0, (short) 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.os.Process.myTid() >> 22), 3443 - android.view.View.resolveSize(0, 0), (char) (android.graphics.Color.rgb(0, 0, 0) + 16781047))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr7[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr8[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.text.TextUtils.getOffsetAfter("", 0) + 1864, (char) (41775 - android.text.TextUtils.getCapsMode("", 0, 0)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    c((short) 0, (short) 3, (byte) 0, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr7[intValue2] * 32718), java.lang.Integer.valueOf(cArr8[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27, 3133 - android.graphics.Color.alpha(0), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                    byte length4 = (byte) $$a.length;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    c((short) 0, length4, (byte) (length4 - 4), objArr8);
                    c2 = 2;
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr8[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr7[intValue2] = getwalletdata.values;
                cArr9[getwalletdata.writeReplace] = (char) ((((cArr7[intValue2] ^ cArr5[getwalletdata.writeReplace]) ^ (SdkCoreAlternateContactlessPaymentDataImpl ^ 1263759066225628708L)) ^ ((int) (getAid ^ 1263759066225628708L))) ^ ((char) (RecordsJson ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                $11 = ($10 + 73) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr9);
    }

    private static void b(java.lang.String str, int[] iArr, int i, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = getCiacDecline;
        int i2 = 16;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getJumpTapTimeout() >> i2), android.view.View.combineMeasuredStates(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                    i2 = 16;
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(getPaymentFci)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 46, 286 - android.text.TextUtils.getTrimmedLength(""), (char) (46337 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (getGpoResponse) {
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.getCapsMode("", 0, 0), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1629, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c((short) 0, (short) 16, (byte) 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (SdkCoreBusinessLogicModuleImpl) {
            getumdgeneration.values = charArray.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr4[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.graphics.Color.argb(0, 0, 0, 0), (-16775587) - android.graphics.Color.rgb(0, 0, 0), (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    c((short) 0, (short) 16, (byte) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        getumdgeneration.values = iArr.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            getumdgeneration.valueOf++;
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    @Override // com.payair.hce.deleteDatabase
    final com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest values() throws java.security.GeneralSecurityException {
        int i = getCardLayoutDescription + 59;
        getCvrMaskAnd = i % 128;
        try {
            if (i % 2 != 0) {
                this.getProfileVersion = java.util.UUID.randomUUID().toString();
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.valueOf;
                ((com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast))).values();
                throw new java.lang.ArithmeticException();
            }
            this.getProfileVersion = java.util.UUID.randomUUID().toString();
            com.payair.hce.getDataDir getdatadir = (com.payair.hce.getDataDir) this.writeReplace;
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.valueOf;
            com.payair.hce.setStatusMessage setstatusmessage = (com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast2));
            com.payair.hce.isAutomaticTimeEnabled values = setstatusmessage.values();
            if (values == null) {
                int i2 = getCvrMaskAnd + 93;
                getCardLayoutDescription = i2 % 128;
                if (i2 % 2 != 0) {
                    return null;
                }
                throw new java.lang.ArithmeticException();
            }
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast3 = this.valueOf;
            com.payair.hce.onNewToken onnewtoken = (com.payair.hce.onNewToken) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast3}, 1288350908, -1288350905, java.lang.System.identityHashCode(sendorderedbroadcast3));
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast4 = this.valueOf;
            com.payair.hce.updateRNSInformation updaternsinformation = (com.payair.hce.updateRNSInformation) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast4}, 389581613, -389581611, java.lang.System.identityHashCode(sendorderedbroadcast4));
            com.payair.hce.checkAutomaticTimeSettings DigitizedCardProfile = onnewtoken.DigitizedCardProfile(values.AlternateContactlessPaymentDataJson(), updaternsinformation, getdatadir.DigitizedCardProfile().AlternateContactlessPaymentDataJson());
            com.payair.hce.checkAutomaticTimeSettings DigitizedCardProfile2 = onnewtoken.DigitizedCardProfile(setstatusmessage.values().AlternateContactlessPaymentDataJson(), updaternsinformation, getdatadir.DigitizedCardProfile().values());
            com.mastercard.mpsdk.remotemanagement.api.json.ChangeMobilePinRequestEncrypted changeMobilePinRequestEncrypted = new com.mastercard.mpsdk.remotemanagement.api.json.ChangeMobilePinRequestEncrypted(this.values, (java.lang.String) com.payair.hce.deleteFile.valueOf(new java.lang.Object[]{getdatadir}, -350567645, 350567645, java.lang.System.identityHashCode(getdatadir)), this.getProfileVersion);
            changeMobilePinRequestEncrypted.setCurrentMobilePin(DigitizedCardProfile);
            changeMobilePinRequestEncrypted.setNewMobilePin(DigitizedCardProfile2);
            com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest writeReplace = writeReplace(values(changeMobilePinRequestEncrypted.buildAsJson()));
            int i3 = getCvrMaskAnd;
            getCardLayoutDescription = (i3 + 67) % 128;
            getCardLayoutDescription = (i3 + 61) % 128;
            return writeReplace;
        } catch (java.lang.Exception e) {
            try {
                java.lang.Object[] objArr = {e.getMessage()};
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b(null, null, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 127, "\u008e\u0094\u008a\u008b\u0093\u0086\u0087\u0092\u0091\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0090\u008f\u0082\u0089\u0086\u008e\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr2);
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
        getCiacDecline = new char[]{11055, 11092, 11067, 11107, 11046, 11048, 11094, 11064, 11047, 11052, 11065, 11068, 11082, 11043, 11041, 11078, 11080, 11069, 11045, 11042};
        getPaymentFci = -143185227;
        SdkCoreBusinessLogicModuleImpl = true;
        getGpoResponse = true;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getCvrMaskAnd = 0;
        getCardLayoutDescription = 1;
        DigitizedCardProfile();
        SdkCoreAlternateContactlessPaymentDataImpl = 1263759066225628708L;
        getAid = -804334044;
        RecordsJson = (char) 44301;
    }

    static void init$0() {
        $$a = new byte[]{125, com.google.common.base.Ascii.SI, -77, -54};
        $$b = 144;
    }
}
