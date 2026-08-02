package com.payair.hce;

/* loaded from: classes4.dex */
class setFitsSystemWindows {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static long DigitizedCardProfile;
    private static int valueOf;
    private static int writeReplace;
    private com.payair.hce.setIsCredential values = null;

    private static void b(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3 = 3 - (b * 2);
        byte[] bArr = $$a;
        int i4 = 119 - (i * 2);
        int i5 = i2 * 3;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = (-i4) + i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i3;
            int i8 = i4;
            int i9 = i6 + 1;
            bArr2[i9] = (byte) i8;
            int i10 = i7 + 1;
            if (i9 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i3 = i10;
                i4 = (-bArr[i10]) + i8;
                i6 = i9;
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ~i;
        switch ((i * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL) + (i2 * (-520)) + (((~(i4 | i2)) | i) * (-1042)) + ((i2 | i3) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(i | i4 | i2)) | (~((~i2) | i5)) | (~(i3 | i5))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)) {
            case 1:
                return DigitizedCardProfile(objArr);
            case 2:
                return values(objArr);
            case 3:
                return writeReplace(objArr);
            case 4:
                com.payair.hce.setFitsSystemWindows setfitssystemwindows = (com.payair.hce.setFitsSystemWindows) objArr[0];
                java.lang.String str = (java.lang.String) objArr[1];
                java.lang.String str2 = (java.lang.String) objArr[2];
                valueOf = (writeReplace + 87) % 128;
                byte[] values = setfitssystemwindows.values();
                com.payair.hce.setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (com.payair.hce.setScrollBarDefaultDelayBeforeFade) values(new java.lang.Object[0], 1965606428, -1965606425, (int) java.lang.System.currentTimeMillis());
                if (values != null) {
                    int i6 = writeReplace;
                    int i7 = (i6 & (-4)) | ((~i6) & 3);
                    int i8 = -(-((3 & i6) << 1));
                    valueOf = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
                    com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener = (com.payair.hce.setOnCapturedPointerListener) com.payair.hce.setScrollBarDefaultDelayBeforeFade.valueOf(new java.lang.Object[]{setscrollbardefaultdelaybeforefade, (java.lang.String) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{values}, -5816740, 5816740, (int) java.lang.System.currentTimeMillis())}, 2013040726, -2013040725, java.lang.System.identityHashCode(setscrollbardefaultdelaybeforefade));
                    com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener, str2}, 1763937367, -1763937361, java.lang.System.identityHashCode(setoncapturedpointerlistener));
                    com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener, str}, -497714482, 497714490, java.lang.System.identityHashCode(setoncapturedpointerlistener));
                    if (setfitssystemwindows.values == null) {
                        setfitssystemwindows.values = new com.payair.hce.setIsCredential();
                        int i9 = valueOf;
                        int i10 = (i9 ^ 83) + ((i9 & 83) << 1);
                        writeReplace = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = 4 / 2;
                        }
                    }
                    com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener, (java.lang.String) com.payair.hce.setFocusedByDefault.writeReplace(new java.lang.Object[0], 2007837142, -2007837141, (int) java.lang.System.currentTimeMillis())}, 1349837615, -1349837613, java.lang.System.identityHashCode(setoncapturedpointerlistener));
                    com.payair.hce.setIsCredential setiscredential = setfitssystemwindows.values;
                    com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, -808754747, 808754756, java.lang.System.identityHashCode(setoncapturedpointerlistener));
                    values(new java.lang.Object[]{values}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
                    int i12 = valueOf;
                    int i13 = (i12 & (-6)) | ((~i12) & 5);
                    int i14 = (i12 & 5) << 1;
                    writeReplace = (((i13 | i14) << 1) - (i14 ^ i13)) % 128;
                }
                int i15 = writeReplace;
                valueOf = (((i15 & 19) - (~(i15 | 19))) - 1) % 128;
                return null;
            case 5:
                return valueOf(objArr);
            case 6:
                return getProfileVersion(objArr);
            case 7:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 8:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 9:
                com.payair.hce.getTransactionExecutor gettransactionexecutor = (com.payair.hce.getTransactionExecutor) objArr[0];
                final int intValue = ((java.lang.Number) objArr[1]).intValue();
                com.payair.hce.getErrorPendingIntent geterrorpendingintent = new com.payair.hce.getErrorPendingIntent(gettransactionexecutor, intValue, new com.payair.hce.getRemoteResource() { // from class: com.payair.hce.setFitsSystemWindows.5
                    private static int DigitizedCardProfile = 1;
                    private static int writeReplace;

                    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2, int i16, int i17, int i18) {
                        int i19 = ~i17;
                        int i20 = ~i18;
                        if ((i16 * lib.android.paypal.com.magnessdk.g.e) + (i17 * 407) + (((~(i19 | i18)) | (~(i20 | i16 | i17))) * (-406)) + ((~(i19 | i20 | i16)) * (-406)) + (((~((~i16) | i18)) | (~(i17 | i20))) * 406) != 1) {
                            return valueOf(objArr2);
                        }
                        com.payair.hce.setFitsSystemWindows.AnonymousClass5 anonymousClass5 = (com.payair.hce.setFitsSystemWindows.AnonymousClass5) objArr2[0];
                        int i21 = DigitizedCardProfile;
                        writeReplace = ((((i21 | 68) << 1) - (i21 ^ 68)) - 1) % 128;
                        int i22 = intValue;
                        byte[] bArr = (byte[]) com.payair.hce.setFitsSystemWindows.values(new java.lang.Object[]{java.lang.Integer.valueOf(i22)}, -1256130801, 1256130808, i22);
                        int i23 = writeReplace;
                        int i24 = (i23 & (-86)) | ((~i23) & 85);
                        int i25 = (i23 & 85) << 1;
                        DigitizedCardProfile = ((i24 ^ i25) + ((i25 & i24) << 1)) % 128;
                        return bArr;
                    }

                    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                        com.payair.hce.setFitsSystemWindows.AnonymousClass5 anonymousClass5 = (com.payair.hce.setFitsSystemWindows.AnonymousClass5) objArr2[0];
                        int i16 = writeReplace + 101;
                        DigitizedCardProfile = i16 % 128;
                        int i17 = intValue;
                        if (i16 % 2 != 0) {
                            return java.lang.Integer.valueOf(i17);
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    @Override // com.payair.hce.getRemoteResource
                    public final int values() {
                        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, 181033275, -181033275, java.lang.System.identityHashCode(this))).intValue();
                    }

                    @Override // com.payair.hce.getRemoteResource
                    public final byte[] DigitizedCardProfile() {
                        return (byte[]) valueOf(new java.lang.Object[]{this}, 302781242, -302781241, java.lang.System.identityHashCode(this));
                    }
                }, DigitizedCardProfile(8));
                int i16 = valueOf;
                int i17 = i16 & 103;
                int i18 = -(-((i16 ^ 103) | i17));
                writeReplace = ((i17 ^ i18) + ((i18 & i17) << 1)) % 128;
                return geterrorpendingintent;
            case 10:
                return RecordsJson(objArr);
            case 11:
                return getAid(objArr);
            case 12:
                return SdkCoreBusinessLogicModuleImpl(objArr);
            case 13:
                return getGpoResponse(objArr);
            case 14:
                com.payair.hce.setFitsSystemWindows setfitssystemwindows2 = (com.payair.hce.setFitsSystemWindows) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                java.lang.String str3 = (java.lang.String) objArr[2];
                java.lang.String str4 = (java.lang.String) objArr[3];
                int i19 = valueOf;
                writeReplace = (((i19 | 75) << 1) - (i19 ^ 75)) % 128;
                com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener2 = (com.payair.hce.setOnCapturedPointerListener) values(new java.lang.Object[]{setfitssystemwindows2, bArr, str3, str4, null}, -2004245780, 2004245796, java.lang.System.identityHashCode(setfitssystemwindows2));
                valueOf = ((-2) - (~(writeReplace + 102))) % 128;
                return setoncapturedpointerlistener2;
            case 15:
                return getCvrMaskAnd(objArr);
            case 16:
                return getPaymentFci(objArr);
            case 17:
                return getCiacDecline(objArr);
            default:
                return AlternateContactlessPaymentDataJson(objArr);
        }
    }

    setFitsSystemWindows() {
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(DigitizedCardProfile ^ (-3824242241614154557L), charArray, i);
        int i2 = 4;
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - i2;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % i2]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(DigitizedCardProfile)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.graphics.Color.blue(0) + 1921, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                    byte b = (byte) ($$b - 5);
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 26, 430 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (31610 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(0, 0, (byte) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                i2 = 4;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
    }

    void valueOf() {
        int i = writeReplace;
        int i2 = ((i | 1) << 1) - (i ^ 1);
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (this.values == null) {
            this.values = new com.payair.hce.setIsCredential();
            int i3 = writeReplace + 111;
            valueOf = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 / 5;
            }
        }
        if (((com.payair.hce.setIsCredential) values(new java.lang.Object[]{this}, -738120466, 738120478, java.lang.System.identityHashCode(this))).AlternateContactlessPaymentDataJson(null, "CRYPTO_KEK", null) == null) {
            writeReplace = (valueOf + 35) % 128;
            values(new java.lang.Object[]{this, "CRYPTO_KEK", "19783526"}, -1463377062, 1463377066, java.lang.System.identityHashCode(this));
            int i5 = valueOf;
            writeReplace = ((i5 ^ 65) + ((i5 & 65) << 1)) % 128;
        } else {
            AlternateContactlessPaymentDataJson();
            int i6 = writeReplace;
            valueOf = (((i6 & 116) + (i6 | 116)) - 1) % 128;
        }
        if (((com.payair.hce.setIsCredential) values(new java.lang.Object[]{this}, -738120466, 738120478, java.lang.System.identityHashCode(this))).AlternateContactlessPaymentDataJson(null, "CRYPTO_KEY", null) == null) {
            int i7 = valueOf;
            int i8 = (i7 ^ 3) + ((i7 & 3) << 1);
            writeReplace = i8 % 128;
            if (i8 % 2 != 0) {
                byte[] values = values();
                com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener = (com.payair.hce.setOnCapturedPointerListener) values(new java.lang.Object[]{this, values, "9182364", "CRYPTO_KEY"}, -1909065528, 1909065542, java.lang.System.identityHashCode(this));
                com.payair.hce.setIsCredential setiscredential = this.values;
                com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, -808754747, 808754756, java.lang.System.identityHashCode(setoncapturedpointerlistener));
                values(new java.lang.Object[]{values}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
                throw null;
            }
            byte[] values2 = values();
            com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener2 = (com.payair.hce.setOnCapturedPointerListener) values(new java.lang.Object[]{this, values2, "9182364", "CRYPTO_KEY"}, -1909065528, 1909065542, java.lang.System.identityHashCode(this));
            com.payair.hce.setIsCredential setiscredential2 = this.values;
            com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener2}, -808754747, 808754756, java.lang.System.identityHashCode(setoncapturedpointerlistener2));
            values(new java.lang.Object[]{values2}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
            int i9 = writeReplace;
            int i10 = i9 & 15;
            int i11 = ((i9 ^ 15) | i10) << 1;
            int i12 = -((i9 | 15) & (~i10));
            valueOf = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
        }
        int i13 = valueOf;
        int i14 = i13 & 75;
        writeReplace = (i14 + ((i13 ^ 75) | i14)) % 128;
    }

    byte[] values() {
        com.payair.hce.getView getview = new com.payair.hce.getView();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\uf12f嘊⯲뉳\uf145䩫ᎄ\ue612脁\uda79莗瘐ᅚ꩸㎛蘇ꅖ㨤ꎡᘖㅌ詿펀ꘖ셽ᩫ䎜㘗兀\uea67", android.graphics.Color.red(0), objArr);
            com.payair.hce.getView.valueOf(new java.lang.Object[]{getview, new com.payair.hce.getTypeConverter((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null), 256)}, 69188918, -69188917, java.lang.System.identityHashCode(getview));
            return (byte[]) com.payair.hce.getView.valueOf(new java.lang.Object[]{getview}, 118662620, -118662620, java.lang.System.identityHashCode(getview));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    byte[] writeReplace() {
        com.payair.hce.getView getview = new com.payair.hce.getView();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\uf12f嘊⯲뉳\uf145䩫ᎄ\ue612脁\uda79莗瘐ᅚ꩸㎛蘇ꅖ㨤ꎡᘖㅌ詿펀ꘖ셽ᩫ䎜㘗兀\uea67", android.view.KeyEvent.normalizeMetaState(0), objArr);
            com.payair.hce.getView.valueOf(new java.lang.Object[]{getview, new com.payair.hce.getTypeConverter((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null), 512)}, 69188918, -69188917, java.lang.System.identityHashCode(getview));
            return (byte[]) com.payair.hce.getView.valueOf(new java.lang.Object[]{getview}, 118662620, -118662620, java.lang.System.identityHashCode(getview));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = valueOf;
        int i2 = i ^ 105;
        int i3 = ((i & 105) | i2) << 1;
        int i4 = -i2;
        writeReplace = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener = (com.payair.hce.setOnCapturedPointerListener) values(new java.lang.Object[]{this, bArr, bArr2, bArr3, java.lang.Boolean.FALSE}, 2098772694, -2098772681, java.lang.System.identityHashCode(this));
        int i5 = writeReplace;
        int i6 = i5 & 17;
        int i7 = ((i5 | 17) & (~i6)) + (i6 << 1);
        valueOf = i7 % 128;
        if (i7 % 2 != 0) {
            return setoncapturedpointerlistener;
        }
        throw null;
    }

    com.payair.hce.setOnCapturedPointerListener DigitizedCardProfile(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z) {
        int i = writeReplace;
        int i2 = i ^ 15;
        int i3 = ((i & 15) | i2) << 1;
        int i4 = -i2;
        valueOf = ((i3 & i4) + (i3 | i4)) % 128;
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener = (com.payair.hce.setOnCapturedPointerListener) values(new java.lang.Object[]{this, bArr, bArr2, bArr3, java.lang.Boolean.valueOf(z)}, 2098772694, -2098772681, java.lang.System.identityHashCode(this));
        int i5 = valueOf;
        int i6 = ((i5 | 90) << 1) - (i5 ^ 90);
        writeReplace = ((~i6) + (i6 << 1)) % 128;
        return setoncapturedpointerlistener;
    }

    private static /* synthetic */ java.lang.Object getGpoResponse(java.lang.Object[] objArr) {
        com.payair.hce.setFitsSystemWindows setfitssystemwindows = (com.payair.hce.setFitsSystemWindows) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        byte[] bArr2 = (byte[]) objArr[2];
        byte[] bArr3 = (byte[]) objArr[3];
        boolean booleanValue = ((java.lang.Boolean) objArr[4]).booleanValue();
        byte[] bArr4 = (byte[]) values(new java.lang.Object[]{setfitssystemwindows, bArr2, bArr3}, 759723402, -759723401, java.lang.System.identityHashCode(setfitssystemwindows));
        com.payair.hce.runInTransaction runintransaction = new com.payair.hce.runInTransaction(new com.payair.hce.isOpenInternalannotations());
        com.payair.hce.findFragmentByTag findfragmentbytag = new com.payair.hce.findFragmentByTag(runintransaction);
        if (booleanValue) {
            findfragmentbytag = new com.payair.hce.accessinternalBeginTransaction(runintransaction);
            int i = valueOf;
            writeReplace = (((i | 1) << 1) - (i ^ 1)) % 128;
        }
        byte[] bArr5 = (byte[]) values(new java.lang.Object[]{findfragmentbytag}, -1367731847, 1367731855, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.inTransaction intransaction = new com.payair.hce.inTransaction(new com.payair.hce.getErrorDialog(bArr4), bArr5, bArr5.length);
        values(new java.lang.Object[]{bArr4}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        values(new java.lang.Object[]{bArr2}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        findfragmentbytag.DigitizedCardProfile(true, intransaction);
        byte[] bArr6 = new byte[findfragmentbytag.valueOf(bArr.length)];
        try {
            findfragmentbytag.values(bArr6, findfragmentbytag.valueOf(bArr, 0, bArr.length, bArr6));
            int i2 = writeReplace;
            int i3 = i2 ^ 41;
            int i4 = ((i2 & 41) | i3) << 1;
            int i5 = -i3;
            valueOf = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
        } catch (com.payair.hce.getSuspendingTransactionId unused) {
        }
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener = new com.payair.hce.setOnCapturedPointerListener();
        com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener, (java.lang.String) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{bArr6}, -5816740, 5816740, (int) java.lang.System.currentTimeMillis())}, 1863235497, -1863235496, java.lang.System.identityHashCode(setoncapturedpointerlistener));
        com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener, (java.lang.String) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{bArr5}, -5816740, 5816740, (int) java.lang.System.currentTimeMillis())}, -1680271665, 1680271669, java.lang.System.identityHashCode(setoncapturedpointerlistener));
        values(new java.lang.Object[]{bArr5}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        values(new java.lang.Object[]{bArr6}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        int i6 = valueOf;
        int i7 = i6 & 31;
        int i8 = ((i6 | 31) & (~i7)) + (i7 << 1);
        writeReplace = i8 % 128;
        if (i8 % 2 == 0) {
            return setoncapturedpointerlistener;
        }
        throw new java.lang.ArithmeticException();
    }

    byte[] DigitizedCardProfile(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        valueOf = ((-2) - (~(writeReplace + 8))) % 128;
        byte[] bArr5 = (byte[]) values(new java.lang.Object[]{this, bArr, bArr2, bArr3, bArr4, java.lang.Boolean.FALSE}, 786712738, -786712738, java.lang.System.identityHashCode(this));
        int i = writeReplace;
        int i2 = i & 31;
        int i3 = -(-((i ^ 31) | i2));
        valueOf = ((i2 & i3) + (i3 | i2)) % 128;
        return bArr5;
    }

    byte[] valueOf(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z) {
        int i = writeReplace & 121;
        valueOf = (((((r0 ^ 121) | i) << 1) - (~(-((r0 | 121) & (~i))))) - 1) % 128;
        byte[] bArr5 = (byte[]) values(new java.lang.Object[]{this, bArr, bArr2, bArr3, bArr4, java.lang.Boolean.valueOf(z)}, 786712738, -786712738, java.lang.System.identityHashCode(this));
        int i2 = writeReplace;
        int i3 = i2 ^ 63;
        int i4 = ((i2 & 63) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        valueOf = i6 % 128;
        if (i6 % 2 != 0) {
            return bArr5;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setFitsSystemWindows setfitssystemwindows = (com.payair.hce.setFitsSystemWindows) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        byte[] bArr2 = (byte[]) objArr[2];
        byte[] bArr3 = (byte[]) objArr[3];
        byte[] bArr4 = (byte[]) objArr[4];
        boolean booleanValue = ((java.lang.Boolean) objArr[5]).booleanValue();
        byte[] bArr5 = (byte[]) values(new java.lang.Object[]{setfitssystemwindows, bArr3, bArr4}, 759723402, -759723401, java.lang.System.identityHashCode(setfitssystemwindows));
        com.payair.hce.runInTransaction runintransaction = new com.payair.hce.runInTransaction(new com.payair.hce.isOpenInternalannotations());
        com.payair.hce.findFragmentByTag findfragmentbytag = new com.payair.hce.findFragmentByTag(runintransaction);
        if (booleanValue) {
            findfragmentbytag = new com.payair.hce.accessinternalBeginTransaction(runintransaction);
            int i = writeReplace;
            int i2 = i & 63;
            int i3 = (i ^ 63) | i2;
            valueOf = ((i2 & i3) + (i3 | i2)) % 128;
        }
        com.payair.hce.inTransaction intransaction = new com.payair.hce.inTransaction(new com.payair.hce.getErrorDialog(bArr5), bArr2, bArr2.length);
        values(new java.lang.Object[]{bArr5}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        findfragmentbytag.DigitizedCardProfile(false, intransaction);
        byte[] bArr6 = new byte[findfragmentbytag.valueOf(bArr.length)];
        try {
            findfragmentbytag.values(bArr6, findfragmentbytag.valueOf(bArr, 0, bArr.length, bArr6));
            int i4 = writeReplace;
            int i5 = i4 & 97;
            int i6 = ((i4 ^ 97) | i5) << 1;
            int i7 = -((i4 | 97) & (~i5));
            valueOf = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
        } catch (com.payair.hce.getSuspendingTransactionId unused) {
        }
        values(new java.lang.Object[]{bArr}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        values(new java.lang.Object[]{bArr3}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        int i8 = valueOf;
        int i9 = i8 & 119;
        int i10 = -(-((i8 ^ 119) | i9));
        writeReplace = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
        return bArr6;
    }

    void AlternateContactlessPaymentDataJson() {
        int i = (-2) - (~(writeReplace + 34));
        valueOf = i % 128;
        if (i % 2 == 0) {
            ((com.payair.hce.setIsCredential) values(new java.lang.Object[]{this}, -738120466, 738120478, java.lang.System.identityHashCode(this))).AlternateContactlessPaymentDataJson(null, "CRYPTO_KEK", null);
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson = ((com.payair.hce.setIsCredential) values(new java.lang.Object[]{this}, -738120466, 738120478, java.lang.System.identityHashCode(this))).AlternateContactlessPaymentDataJson(null, "CRYPTO_KEK", null);
        if (AlternateContactlessPaymentDataJson != null) {
            int i2 = writeReplace & 95;
            valueOf = (((((r5 ^ 95) | i2) << 1) - (~(-((r5 | 95) & (~i2))))) - 1) % 128;
            if (!((java.lang.Boolean) com.payair.hce.setFocusedByDefault.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -78188493, 78188498, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, -285504386, 285504389, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                int i3 = writeReplace;
                int i4 = i3 & 77;
                valueOf = (((i3 | 77) & (~i4)) + (i4 << 1)) % 128;
                if (((java.lang.Boolean) com.payair.hce.setFocusedByDefault.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -78188493, 78188498, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, -866633695, 866633697, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                    int i5 = valueOf;
                    writeReplace = ((i5 ^ 83) + ((i5 & 83) << 1)) % 128;
                    com.payair.hce.setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (com.payair.hce.setScrollBarDefaultDelayBeforeFade) values(new java.lang.Object[0], 1965606428, -1965606425, (int) java.lang.System.currentTimeMillis());
                    byte[] bArr = (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setScrollBarDefaultDelayBeforeFade.valueOf(new java.lang.Object[]{setscrollbardefaultdelaybeforefade, (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -78188493, 78188498, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson)), (java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, -1314303054, 1314303054, java.lang.System.identityHashCode(setscrollbardefaultdelaybeforefade))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis());
                    if (((com.payair.hce.setIsCredential) values(new java.lang.Object[]{this}, -738120466, 738120478, java.lang.System.identityHashCode(this))) == null) {
                        this.values = new com.payair.hce.setIsCredential();
                        int i6 = valueOf;
                        int i7 = i6 & 13;
                        int i8 = (i6 | 13) & (~i7);
                        int i9 = -(-(i7 << 1));
                        writeReplace = ((i8 ^ i9) + ((i8 & i9) << 1)) % 128;
                    }
                    com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener = (com.payair.hce.setOnCapturedPointerListener) com.payair.hce.setScrollBarDefaultDelayBeforeFade.valueOf(new java.lang.Object[]{setscrollbardefaultdelaybeforefade, (java.lang.String) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{bArr}, -5816740, 5816740, (int) java.lang.System.currentTimeMillis())}, 2013040726, -2013040725, java.lang.System.identityHashCode(setscrollbardefaultdelaybeforefade));
                    com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener, "19783526"}, 1763937367, -1763937361, java.lang.System.identityHashCode(setoncapturedpointerlistener));
                    com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener, "CRYPTO_KEK"}, -497714482, 497714490, java.lang.System.identityHashCode(setoncapturedpointerlistener));
                    values(new java.lang.Object[]{bArr}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
                    com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener, (java.lang.String) com.payair.hce.setFocusedByDefault.writeReplace(new java.lang.Object[0], 2007837142, -2007837141, (int) java.lang.System.currentTimeMillis())}, 1349837615, -1349837613, java.lang.System.identityHashCode(setoncapturedpointerlistener));
                    com.payair.hce.setIsCredential setiscredential = (com.payair.hce.setIsCredential) values(new java.lang.Object[]{this}, -738120466, 738120478, java.lang.System.identityHashCode(this));
                    values(new java.lang.Object[]{this}, -810936793, 810936795, java.lang.System.identityHashCode(this));
                    com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, -808754747, 808754756, java.lang.System.identityHashCode(setoncapturedpointerlistener));
                    int i10 = valueOf;
                    int i11 = i10 ^ 23;
                    int i12 = (i10 & 23) << 1;
                    int i13 = (i11 & i12) + (i12 | i11);
                    writeReplace = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    return;
                }
                int i14 = valueOf;
                int i15 = i14 & 47;
                int i16 = ((i14 ^ 47) | i15) << 1;
                int i17 = -((i14 | 47) & (~i15));
                writeReplace = (((i16 | i17) << 1) - (i17 ^ i16)) % 128;
            }
        }
        ((com.payair.hce.HCEEventListener) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 937872483, -937872473, (int) java.lang.System.currentTimeMillis())).sdkTooOldNeedReset();
        com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 314972855, -314972806, (int) java.lang.System.currentTimeMillis());
        int i18 = valueOf + 10;
        writeReplace = ((~i18) + (i18 << 1)) % 128;
        int i142 = valueOf;
        int i152 = i142 & 47;
        int i162 = ((i142 ^ 47) | i152) << 1;
        int i172 = -((i142 | 47) & (~i152));
        writeReplace = (((i162 | i172) << 1) - (i172 ^ i162)) % 128;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = new com.payair.hce.setScrollBarDefaultDelayBeforeFade();
        int i = writeReplace;
        int i2 = ((i ^ 109) | (i & 109)) << 1;
        int i3 = -((i & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) | ((~i) & 109));
        int i4 = (i2 & i3) + (i3 | i2);
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return setscrollbardefaultdelaybeforefade;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object SdkCoreBusinessLogicModuleImpl(java.lang.Object[] objArr) {
        com.payair.hce.setFitsSystemWindows setfitssystemwindows = (com.payair.hce.setFitsSystemWindows) objArr[0];
        int i = valueOf;
        int i2 = ((i & (-114)) | ((~i) & 113)) + ((i & 113) << 1);
        writeReplace = i2 % 128;
        com.payair.hce.setIsCredential setiscredential = setfitssystemwindows.values;
        if (i2 % 2 == 0) {
            return setiscredential;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getPaymentFci(java.lang.Object[] objArr) {
        byte[] bArr;
        com.payair.hce.setFitsSystemWindows setfitssystemwindows = (com.payair.hce.setFitsSystemWindows) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        java.lang.String str = (java.lang.String) objArr[2];
        java.lang.String str2 = (java.lang.String) objArr[3];
        byte[] bArr3 = (byte[]) objArr[4];
        int i = writeReplace;
        int i2 = i + 111;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (bArr3 == null) {
            int i3 = ((i & 84) + (i | 84)) - 1;
            valueOf = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            bArr = (byte[]) values(new java.lang.Object[0], 314088055, -314088049, (int) java.lang.System.currentTimeMillis());
        } else {
            valueOf = (((i ^ 100) + ((i & 100) << 1)) - 1) % 128;
            bArr = bArr3;
        }
        com.payair.hce.setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = new com.payair.hce.setScrollBarDefaultDelayBeforeFade();
        if (((com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows))) == null) {
            setfitssystemwindows.values = new com.payair.hce.setIsCredential();
            int i4 = valueOf;
            writeReplace = (((i4 ^ 40) + ((i4 & 40) << 1)) - 1) % 128;
        }
        com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson = ((com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows))).AlternateContactlessPaymentDataJson(null, "CRYPTO_KEK", null);
        byte[] bArr4 = (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setScrollBarDefaultDelayBeforeFade.valueOf(new java.lang.Object[]{setscrollbardefaultdelaybeforefade, (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -78188493, 78188498, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson)), (java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, -1314303054, 1314303054, java.lang.System.identityHashCode(setscrollbardefaultdelaybeforefade))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis());
        com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -808754747, 808754756, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson));
        com.payair.hce.setIsCredential setiscredential = (com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows));
        com.payair.hce.setIsCredential.valueOf(new java.lang.Object[]{setiscredential, str, (java.lang.String) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{bArr}, -5816740, 5816740, (int) java.lang.System.currentTimeMillis()), (java.lang.String) com.payair.hce.setFocusedByDefault.writeReplace(new java.lang.Object[0], 2007837142, -2007837141, (int) java.lang.System.currentTimeMillis())}, 942623780, -942623779, java.lang.System.identityHashCode(setiscredential));
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener = new com.payair.hce.setOnCapturedPointerListener(str, str2, (java.lang.String) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{values(bArr4, bArr2, bArr)}, -5816740, 5816740, (int) java.lang.System.currentTimeMillis()), (java.lang.String) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{bArr}, -5816740, 5816740, (int) java.lang.System.currentTimeMillis()));
        values(new java.lang.Object[]{bArr4}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        values(new java.lang.Object[]{bArr2}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        values(new java.lang.Object[]{bArr}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        values(new java.lang.Object[]{bArr3}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        int i5 = valueOf;
        int i6 = i5 & 11;
        int i7 = (i5 ^ 11) | i6;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        writeReplace = i8 % 128;
        if (i8 % 2 == 0) {
            return setoncapturedpointerlistener;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setFitsSystemWindows setfitssystemwindows = (com.payair.hce.setFitsSystemWindows) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        byte[] bArr2 = (byte[]) objArr[2];
        int i = writeReplace;
        valueOf = ((i & 61) + (i | 61)) % 128;
        com.payair.hce.setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (com.payair.hce.setScrollBarDefaultDelayBeforeFade) values(new java.lang.Object[0], 1965606428, -1965606425, (int) java.lang.System.currentTimeMillis());
        if (((com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows))) == null) {
            setfitssystemwindows.values = new com.payair.hce.setIsCredential();
            int i2 = valueOf;
            int i3 = i2 & 125;
            int i4 = -(-(i2 | 125));
            writeReplace = ((i3 & i4) + (i4 | i3)) % 128;
        }
        com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson = ((com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows))).AlternateContactlessPaymentDataJson(null, "CRYPTO_KEK", null);
        byte[] bArr3 = (byte[]) values(new java.lang.Object[]{(byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setScrollBarDefaultDelayBeforeFade.valueOf(new java.lang.Object[]{setscrollbardefaultdelaybeforefade, (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -78188493, 78188498, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson)), (java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, -1314303054, 1314303054, java.lang.System.identityHashCode(setscrollbardefaultdelaybeforefade))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), bArr, bArr2}, -1000707843, 1000707854, (int) java.lang.System.currentTimeMillis());
        int i5 = writeReplace;
        int i6 = i5 & 69;
        int i7 = ((i5 ^ 69) | i6) << 1;
        int i8 = -((i5 | 69) & (~i6));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        valueOf = i9 % 128;
        if (i9 % 2 != 0) {
            return bArr3;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getCiacDecline(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        byte[] bArr3 = (byte[]) objArr[2];
        com.payair.hce.assertNotSuspendingTransaction assertnotsuspendingtransaction = new com.payair.hce.assertNotSuspendingTransaction();
        assertnotsuspendingtransaction.writeReplace(true, (com.payair.hce.getMCallbacksannotations) new com.payair.hce.inTransaction(new com.payair.hce.getErrorDialog(bArr), bArr3));
        com.payair.hce.endTransaction endtransaction = new com.payair.hce.endTransaction();
        int length = bArr2.length;
        int length2 = 8 - (bArr2.length % 8);
        int i = ((length | length2) << 1) - (length ^ length2);
        byte[] bArr4 = new byte[i];
        java.lang.System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        endtransaction.writeReplace(bArr4, bArr2.length);
        values(new java.lang.Object[]{bArr}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        values(new java.lang.Object[]{bArr2}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        byte[] AlternateContactlessPaymentDataJson = assertnotsuspendingtransaction.AlternateContactlessPaymentDataJson(bArr4, i);
        int i2 = writeReplace;
        int i3 = ((i2 ^ 66) + ((i2 & 66) << 1)) - 1;
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            return AlternateContactlessPaymentDataJson;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        byte[] bArr3 = (byte[]) objArr[2];
        com.payair.hce.assertNotSuspendingTransaction assertnotsuspendingtransaction = new com.payair.hce.assertNotSuspendingTransaction();
        assertnotsuspendingtransaction.writeReplace(false, (com.payair.hce.getMCallbacksannotations) new com.payair.hce.inTransaction(new com.payair.hce.getErrorDialog(bArr), bArr3));
        values(new java.lang.Object[]{bArr}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        try {
            byte[] writeReplace2 = assertnotsuspendingtransaction.writeReplace(bArr2, bArr2.length);
            int values = new com.payair.hce.endTransaction().values(writeReplace2);
            int length = writeReplace2.length;
            int i = -(~(-values));
            int i2 = ((length & i) + (i | length)) - 1;
            byte[] bArr4 = (byte[]) com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(new java.lang.Object[]{writeReplace2, java.lang.Integer.valueOf(i2)}, 1227667964, -1227667963, i2);
            int i3 = valueOf;
            int i4 = i3 & 73;
            int i5 = (((i3 | 73) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
            writeReplace = i5 % 128;
            if (i5 % 2 == 0) {
                return bArr4;
            }
            throw null;
        } catch (com.payair.hce.getSuspendingTransactionId unused) {
            return null;
        }
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.setFitsSystemWindows setfitssystemwindows = (com.payair.hce.setFitsSystemWindows) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = valueOf;
        writeReplace = ((-2) - (~(((i | 38) << 1) - (i ^ 38)))) % 128;
        if (setfitssystemwindows.values == null) {
            setfitssystemwindows.values = new com.payair.hce.setIsCredential();
            int i2 = writeReplace;
            int i3 = ((i2 ^ 62) + ((i2 & 62) << 1)) - 1;
            valueOf = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 / 2;
            }
        }
        if (setfitssystemwindows.values.AlternateContactlessPaymentDataJson(null, str, null) == null) {
            valueOf = (writeReplace + 51) % 128;
            return java.lang.Boolean.FALSE;
        }
        int i5 = valueOf;
        int i6 = ((((i5 ^ 107) | (i5 & 107)) << 1) - ((i5 & (-108)) | ((~i5) & 107))) % 128;
        writeReplace = i6;
        int i7 = i6 + 27;
        valueOf = i7 % 128;
        if (i7 % 2 != 0) {
            return java.lang.Boolean.TRUE;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        int i = writeReplace;
        int i2 = ((i ^ 4) + ((i & 4) << 1)) - 1;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = i + 51;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("\uf12f嘊⯲뉳\uf145䩫ᎄ\ue612脁\uda79莗瘐ᅚ꩸㎛蘇ꅖ㨤ꎡᘖㅌ詿펀ꘖ셽ᩫ䎜㘗兀\uea67", android.text.TextUtils.indexOf("", "", 0), objArr2);
            java.lang.Object newInstance = java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(null).newInstance(null);
            byte[] bArr = new byte[8];
            int i5 = writeReplace;
            int i6 = i5 & 49;
            int i7 = ((i5 ^ 49) | i6) << 1;
            int i8 = -((i5 | 49) & (~i6));
            valueOf = ((i7 & i8) + (i8 | i7)) % 128;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a("峰즓쩄￢岞헶\uf23cꮖⲲ䗪戰㮇벃", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr3);
            java.util.Random.class.getMethod((java.lang.String) objArr3[0], byte[].class).invoke(newInstance, bArr);
            int i9 = valueOf;
            writeReplace = ((i9 ^ 109) + ((i9 & 109) << 1)) % 128;
            return bArr;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        r0.AlternateContactlessPaymentDataJson(r4);
        r0 = com.payair.hce.setFitsSystemWindows.valueOf;
        r1 = (((r0 & (-80)) | ((~r0) & 79)) - (~((r0 & 79) << 1))) - 1;
        com.payair.hce.setFitsSystemWindows.writeReplace = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (r0 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.getErrorString geterrorstring;
        byte[] bArr;
        com.payair.hce.findFragmentByTag findfragmentbytag = (com.payair.hce.findFragmentByTag) objArr[0];
        int i = valueOf;
        int i2 = (i & 15) + (i | 15);
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            int AlternateContactlessPaymentDataJson = findfragmentbytag.AlternateContactlessPaymentDataJson();
            geterrorstring = (com.payair.hce.getErrorString) values(new java.lang.Object[]{java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)}, 1030215268, -1030215253, AlternateContactlessPaymentDataJson);
            bArr = new byte[findfragmentbytag.AlternateContactlessPaymentDataJson()];
        } else {
            int AlternateContactlessPaymentDataJson2 = findfragmentbytag.AlternateContactlessPaymentDataJson();
            geterrorstring = (com.payair.hce.getErrorString) values(new java.lang.Object[]{java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson2)}, 1030215268, -1030215253, AlternateContactlessPaymentDataJson2);
            bArr = new byte[findfragmentbytag.AlternateContactlessPaymentDataJson()];
        }
        int i3 = writeReplace;
        int i4 = (((i3 | 98) << 1) - (i3 ^ 98)) - 1;
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object getCvrMaskAnd(java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4;
        java.util.Enumeration<java.net.NetworkInterface> networkInterfaces;
        int intValue = ((java.lang.Number) objArr[0]).intValue();
        com.payair.hce.getErrorString geterrorstring = (com.payair.hce.getErrorString) values(new java.lang.Object[]{new com.payair.hce.isMainThreadroom_runtime_release(), java.lang.Integer.valueOf(intValue)}, -923294541, 923294550, intValue);
        geterrorstring.values(((java.lang.String) com.payair.hce.setAutoHandwritingEnabled.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -168115638, 168115638, (int) java.lang.System.currentTimeMillis())).getBytes());
        geterrorstring.values(java.nio.ByteBuffer.allocate(8).putLong(android.os.SystemClock.uptimeMillis()).array());
        int i5 = -1;
        try {
            android.content.Intent registerReceiver = ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
            i = registerReceiver.getIntExtra("temperature", -1);
            try {
                i3 = registerReceiver.getIntExtra("scale", -1);
                try {
                    int intExtra = registerReceiver.getIntExtra("level", -1);
                    try {
                        i5 = registerReceiver.getIntExtra("voltage", -1);
                        writeReplace = (valueOf + 105) % 128;
                    } catch (java.lang.Exception unused) {
                    }
                    i2 = i5;
                    i5 = intExtra;
                } catch (java.lang.Exception unused2) {
                    i2 = -1;
                }
            } catch (java.lang.Exception unused3) {
                i2 = -1;
                i3 = -1;
                geterrorstring.values(java.nio.ByteBuffer.allocate(4).putInt(i).array());
                geterrorstring.values(java.nio.ByteBuffer.allocate(4).putInt(i5).array());
                geterrorstring.values(java.nio.ByteBuffer.allocate(4).putInt(i3).array());
                geterrorstring.values(java.nio.ByteBuffer.allocate(4).putInt(i2).array());
                geterrorstring.values(java.nio.ByteBuffer.allocate(8).putLong(java.lang.System.currentTimeMillis()).array());
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(android.os.Build.VERSION.CODENAME);
                sb.append(android.os.Build.VERSION.PREVIEW_SDK_INT);
                sb.append(android.os.Build.VERSION.BASE_OS);
                sb.append(android.os.Build.VERSION.INCREMENTAL);
                sb.append(android.os.Build.VERSION.SECURITY_PATCH);
                sb.append(android.os.Build.VERSION.RELEASE);
                sb.append(android.os.Build.VERSION.SDK_INT);
                geterrorstring.values(sb.toString().getBytes());
                android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
                ((android.app.ActivityManager) ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSystemService("activity")).getMemoryInfo(memoryInfo);
                long j = memoryInfo.availMem;
                long j2 = memoryInfo.threshold;
                long j3 = memoryInfo.totalMem;
                geterrorstring.values(java.nio.ByteBuffer.allocate(8).putLong(j).array());
                geterrorstring.values(java.nio.ByteBuffer.allocate(8).putLong(j2).array());
                geterrorstring.values(java.nio.ByteBuffer.allocate(8).putLong(j3).array());
                java.lang.String str = "111";
                networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
                int i6 = valueOf;
                writeReplace = ((((i6 | 53) << 1) - (~(-((i6 & (-54)) | ((~i6) & 53))))) - 1) % 128;
                while (networkInterfaces.hasMoreElements()) {
                }
                int i7 = valueOf;
                writeReplace = ((((i7 & (-30)) | ((~i7) & 29)) - (~((i7 & 29) << 1))) - 1) % 128;
                geterrorstring.values(str.getBytes());
                geterrorstring.values(java.nio.ByteBuffer.allocate(8).putLong(((java.lang.Long) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 1878792450, -1878792396, (int) java.lang.System.currentTimeMillis())).longValue()).array());
                geterrorstring.values(java.nio.ByteBuffer.allocate(8).putLong(((java.lang.Long) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 142723392, -142723348, (int) java.lang.System.currentTimeMillis())).longValue()).array());
                geterrorstring.values(java.nio.ByteBuffer.allocate(8).putLong(((java.lang.Long) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 146657170, -146657076, (int) java.lang.System.currentTimeMillis())).longValue()).array());
                int i8 = writeReplace;
                int i9 = i8 & 113;
                int i10 = (i8 ^ 113) | i9;
                i4 = (i9 & i10) + (i10 | i9);
                valueOf = i4 % 128;
                if (i4 % 2 == 0) {
                }
            }
        } catch (java.lang.Exception unused4) {
            i = -1;
        }
        geterrorstring.values(java.nio.ByteBuffer.allocate(4).putInt(i).array());
        geterrorstring.values(java.nio.ByteBuffer.allocate(4).putInt(i5).array());
        geterrorstring.values(java.nio.ByteBuffer.allocate(4).putInt(i3).array());
        geterrorstring.values(java.nio.ByteBuffer.allocate(4).putInt(i2).array());
        geterrorstring.values(java.nio.ByteBuffer.allocate(8).putLong(java.lang.System.currentTimeMillis()).array());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(android.os.Build.VERSION.CODENAME);
        sb2.append(android.os.Build.VERSION.PREVIEW_SDK_INT);
        sb2.append(android.os.Build.VERSION.BASE_OS);
        sb2.append(android.os.Build.VERSION.INCREMENTAL);
        sb2.append(android.os.Build.VERSION.SECURITY_PATCH);
        sb2.append(android.os.Build.VERSION.RELEASE);
        sb2.append(android.os.Build.VERSION.SDK_INT);
        geterrorstring.values(sb2.toString().getBytes());
        android.app.ActivityManager.MemoryInfo memoryInfo2 = new android.app.ActivityManager.MemoryInfo();
        ((android.app.ActivityManager) ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSystemService("activity")).getMemoryInfo(memoryInfo2);
        long j4 = memoryInfo2.availMem;
        long j22 = memoryInfo2.threshold;
        long j32 = memoryInfo2.totalMem;
        geterrorstring.values(java.nio.ByteBuffer.allocate(8).putLong(j4).array());
        geterrorstring.values(java.nio.ByteBuffer.allocate(8).putLong(j22).array());
        geterrorstring.values(java.nio.ByteBuffer.allocate(8).putLong(j32).array());
        java.lang.String str2 = "111";
        try {
            networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
            int i62 = valueOf;
            writeReplace = ((((i62 | 53) << 1) - (~(-((i62 & (-54)) | ((~i62) & 53))))) - 1) % 128;
            while (networkInterfaces.hasMoreElements()) {
                int i11 = writeReplace;
                int i12 = (i11 & (-116)) | ((~i11) & 115);
                int i13 = (i11 & 115) << 1;
                valueOf = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
                java.util.Enumeration<java.net.InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                int i14 = writeReplace;
                int i15 = i14 & 79;
                int i16 = (((i14 | 79) & (~i15)) - (~(-(-(i15 << 1))))) - 1;
                valueOf = i16 % 128;
                int i17 = i16 % 2;
                while (inetAddresses.hasMoreElements()) {
                    int i18 = writeReplace;
                    int i19 = ((i18 ^ 73) - (~(-(-((i18 & 73) << 1))))) - 1;
                    valueOf = i19 % 128;
                    if (i19 % 2 == 0) {
                        inetAddresses.nextElement().isLoopbackAddress();
                        throw null;
                    }
                    java.net.InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        str2 = nextElement.getHostAddress();
                        int i20 = writeReplace;
                        int i21 = (i20 & 75) + (i20 | 75);
                        valueOf = i21 % 128;
                        int i22 = i21 % 2;
                    }
                    int i23 = valueOf;
                    int i24 = (((i23 ^ 75) | (i23 & 75)) << 1) - ((i23 & (-76)) | ((~i23) & 75));
                    writeReplace = i24 % 128;
                    int i25 = i24 % 2;
                }
                int i26 = writeReplace;
                int i27 = i26 & 117;
                int i28 = -(-((i26 ^ 117) | i27));
                valueOf = (((i27 | i28) << 1) - (i28 ^ i27)) % 128;
            }
            int i72 = valueOf;
            writeReplace = ((((i72 & (-30)) | ((~i72) & 29)) - (~((i72 & 29) << 1))) - 1) % 128;
        } catch (java.net.SocketException unused5) {
        }
        geterrorstring.values(str2.getBytes());
        geterrorstring.values(java.nio.ByteBuffer.allocate(8).putLong(((java.lang.Long) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 1878792450, -1878792396, (int) java.lang.System.currentTimeMillis())).longValue()).array());
        geterrorstring.values(java.nio.ByteBuffer.allocate(8).putLong(((java.lang.Long) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 142723392, -142723348, (int) java.lang.System.currentTimeMillis())).longValue()).array());
        geterrorstring.values(java.nio.ByteBuffer.allocate(8).putLong(((java.lang.Long) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 146657170, -146657076, (int) java.lang.System.currentTimeMillis())).longValue()).array());
        int i82 = writeReplace;
        int i92 = i82 & 113;
        int i102 = (i82 ^ 113) | i92;
        i4 = (i92 & i102) + (i102 | i92);
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            return geterrorstring;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        long nanoTime;
        int i;
        int intValue = ((java.lang.Number) objArr[0]).intValue();
        int i2 = writeReplace;
        int i3 = i2 & 105;
        int i4 = (((~i3) & (i2 | 105)) - (~(i3 << 1))) - 1;
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (intValue <= 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(intValue);
            sb.append(" is invalid. Length must be positive.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        byte[] bArr = new byte[intValue];
        valueOf = ((i2 & 23) + (i2 | 23)) % 128;
        int i5 = 0;
        while (i5 < intValue) {
            int i6 = ~intValue;
            int i7 = ~(i6 | 1035227111);
            int i8 = (i6 | intValue) & i6;
            int i9 = ~((i8 & (-304112163)) | (i8 ^ (-304112163)));
            int i10 = i7 & i9;
            int i11 = (i7 | i9) & (~i10);
            int i12 = -(~(((i11 ^ i10) | (i11 & i10)) * (-867)));
            int i13 = (-2) - (~((i12 ^ 1047383208) + ((i12 & 1047383208) << 1)));
            int i14 = intValue & 1035227111;
            int i15 = ~(((1035227111 | intValue) & (~i14)) | i14);
            int i16 = i15 ^ 33562624;
            int i17 = i15 & 33562624;
            int i18 = (i17 ^ i16) | (i17 & i16);
            int i19 = intValue & (-304112163);
            int i20 = ~((((-304112163) | intValue) & (~i19)) | i19);
            int i21 = i18 & i20;
            int i22 = (i18 | i20) & (~i21);
            int i23 = -(-(((i22 ^ i21) | (i22 & i21)) * (-1734)));
            int i24 = i13 & i23;
            int i25 = ((((i13 ^ i23) | i24) << 1) - (~(-((i23 | i13) & (~i24))))) - 1;
            int i26 = ~i6;
            int i27 = (i26 & (-33562625)) | (33562624 & i6);
            int i28 = (-33562625) & i6;
            int i29 = ~((i28 ^ i27) | (i27 & i28));
            int i30 = ~((1068789735 ^ intValue) | (intValue & 1068789735));
            int i31 = (i29 ^ i30) | (i29 & i30);
            int i32 = intValue & (-270549539);
            int i33 = ((-270549539) | intValue) & (~i32);
            int i34 = (i33 ^ i32) | (i33 & i32);
            int i35 = ~i34;
            int i36 = (i34 | i35) & i35;
            int i37 = ((~i36) & i31) | ((~i31) & i36);
            int i38 = i31 & i36;
            int i39 = -(-(((i38 ^ i37) | (i38 & i37)) * 867));
            int i40 = i25 & i39;
            int i41 = ~((i26 & (-1014297642)) | (i6 & 1014297641) | (i6 & (-1014297642)));
            int i42 = -(-(((i41 ^ (-192733997)) | (i41 & (-192733997))) * (-865)));
            int i43 = (((~i42) & (-1104986574)) | (i42 & 1104986573)) + ((i42 & (-1104986574)) << 1);
            int i44 = intValue & 1014297641;
            int i45 = (~i44) & (intValue | 1014297641);
            int i46 = (i45 ^ i44) | (i44 & i45);
            int i47 = ~i46;
            int i48 = -(-(((i46 | i47) & i47) * 865));
            int i49 = i43 & i48;
            int i50 = i49 + ((i48 ^ i43) | i49);
            int i51 = (i6 & (-192733997)) | (i6 ^ (-192733997));
            int i52 = ~i51;
            int i53 = (i51 | i52) & i52;
            int i54 = ~(i8 | 1014297641);
            int i55 = i53 & i54;
            int i56 = (i53 | i54) & (~i55);
            int i57 = ((i56 ^ i55) | (i56 & i55)) * 865;
            int i58 = ((~i57) & i50) | ((~i50) & i57);
            int i59 = (i57 & i50) << 1;
            if (i40 + ((i39 ^ i25) | i40) > (i58 ^ i59) + ((i59 & i58) << 1)) {
                nanoTime = java.lang.System.nanoTime();
                i = 1;
            } else {
                nanoTime = java.lang.System.nanoTime();
                i = 0;
            }
            while (i < 8) {
                int i60 = writeReplace;
                int i61 = i60 & 21;
                int i62 = (((i60 ^ 21) | i61) << 1) - ((i60 | 21) & (~i61));
                int i63 = i62 % 128;
                valueOf = i63;
                if (i62 % 2 == 0) {
                    throw null;
                }
                if (i5 < intValue) {
                    int i64 = ((i5 & 36) + (i5 | 36)) - 1;
                    int i65 = i64 & (-34);
                    bArr[i5] = (byte) (255 & nanoTime);
                    nanoTime >>= 8;
                    i = ((i ^ 31) + ((i & 31) << 1)) - 30;
                    int i66 = i63 & 99;
                    writeReplace = (((((i63 ^ 99) | i66) << 1) - (~(-((~i66) & (i63 | 99))))) - 1) % 128;
                    i5 = ((i64 ^ (-34)) | i65) + i65;
                }
            }
            int i67 = valueOf;
            writeReplace = ((i67 ^ 85) + ((i67 & 85) << 1)) % 128;
        }
        int i68 = writeReplace;
        int i69 = ((i68 ^ 7) | (i68 & 7)) << 1;
        int i70 = -((i68 & (-8)) | ((~i68) & 7));
        int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
        valueOf = i71 % 128;
        if (i71 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.payair.hce.setScrollCaptureHint, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v75 */
    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        byte[] bArr;
        byte[] bArr2;
        ?? r1;
        byte[] bArr3;
        byte[] bArr4;
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener;
        byte[] bArr5;
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener2;
        byte[] bArr6;
        byte[] bArr7;
        com.payair.hce.setFitsSystemWindows setfitssystemwindows = (com.payair.hce.setFitsSystemWindows) objArr[0];
        int i = writeReplace;
        int i2 = i & 103;
        int i3 = ((i ^ 103) | i2) << 1;
        int i4 = -((i | 103) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        valueOf = i5 % 128;
        if (i5 % 2 == 0) {
            com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson = ((com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows))).AlternateContactlessPaymentDataJson(null, "CRYPTO_KEY", null);
            ((com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows))).AlternateContactlessPaymentDataJson(null, "CRYPTO_DST_DEK_KEK", null);
            throw null;
        }
        com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson2 = ((com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows))).AlternateContactlessPaymentDataJson(null, "CRYPTO_KEY", null);
        byte[] bArr8 = (byte[]) values(new java.lang.Object[]{setfitssystemwindows, (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson2}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson2}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis())}, 759723402, -759723401, java.lang.System.identityHashCode(setfitssystemwindows));
        com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson3 = ((com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows))).AlternateContactlessPaymentDataJson(null, "CRYPTO_DST_DEK_KEK", null);
        if (AlternateContactlessPaymentDataJson3 != null) {
            int i6 = valueOf;
            writeReplace = (((i6 & 44) + (i6 | 44)) - 1) % 128;
            bArr = (byte[]) values(new java.lang.Object[]{setfitssystemwindows, (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson3}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson3))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson3}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson3))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis())}, 759723402, -759723401, java.lang.System.identityHashCode(setfitssystemwindows));
            int i7 = writeReplace;
            int i8 = ((i7 ^ 5) | (i7 & 5)) << 1;
            int i9 = -((i7 & (-6)) | ((~i7) & 5));
            valueOf = (((i8 | i9) << 1) - (i9 ^ i8)) % 128;
        } else {
            bArr = null;
        }
        com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson4 = ((com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows))).AlternateContactlessPaymentDataJson(null, "CRYPTO_DST_MAC_KEK", null);
        if (AlternateContactlessPaymentDataJson4 != null) {
            int i10 = writeReplace;
            int i11 = i10 & 19;
            int i12 = (i11 - (~(-(-((i10 ^ 19) | i11))))) - 1;
            valueOf = i12 % 128;
            if (i12 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            bArr2 = (byte[]) values(new java.lang.Object[]{setfitssystemwindows, (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson4}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson4))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson4}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson4))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis())}, 759723402, -759723401, java.lang.System.identityHashCode(setfitssystemwindows));
        } else {
            bArr2 = null;
        }
        com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson5 = ((com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows))).AlternateContactlessPaymentDataJson(null, "CRYPTO_RM_KEK_KEK", null);
        if (AlternateContactlessPaymentDataJson5 != null) {
            int i13 = valueOf;
            int i14 = ((~i13) & 23) | (i13 & (-24));
            int i15 = (i13 & 23) << 1;
            int i16 = (i14 & i15) + (i15 | i14);
            writeReplace = i16 % 128;
            if (i16 % 2 != 0) {
                throw null;
            }
            byte[] bArr9 = (byte[]) values(new java.lang.Object[]{setfitssystemwindows, (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson5}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson5))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson5}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson5))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis())}, 759723402, -759723401, java.lang.System.identityHashCode(setfitssystemwindows));
            valueOf = (writeReplace + 119) % 128;
            bArr3 = bArr9;
            r1 = 0;
        } else {
            r1 = 0;
            bArr3 = null;
        }
        com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson6 = ((com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows))).AlternateContactlessPaymentDataJson(r1, "CRYPTO_L_DEK_KEK", r1);
        if (AlternateContactlessPaymentDataJson6 != null) {
            int i17 = valueOf;
            writeReplace = (((i17 ^ 117) - (~((i17 & 117) << 1))) - 1) % 128;
            bArr4 = (byte[]) values(new java.lang.Object[]{setfitssystemwindows, (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson6}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson6))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson6}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson6))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis())}, 759723402, -759723401, java.lang.System.identityHashCode(setfitssystemwindows));
            int i18 = writeReplace;
            int i19 = i18 & 1;
            int i20 = ((i18 ^ 1) | i19) << 1;
            int i21 = -((i18 | 1) & (~i19));
            valueOf = (((i20 | i21) << 1) - (i21 ^ i20)) % 128;
        } else {
            bArr4 = null;
        }
        com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson7 = ((com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows))).AlternateContactlessPaymentDataJson(null, "CRYPTO_W_DEK_KEK", null);
        if (AlternateContactlessPaymentDataJson7 != null) {
            int i22 = valueOf;
            int i23 = i22 & 93;
            writeReplace = (i23 + ((i22 ^ 93) | i23)) % 128;
            setoncapturedpointerlistener = AlternateContactlessPaymentDataJson7;
            bArr5 = (byte[]) values(new java.lang.Object[]{setfitssystemwindows, (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson7}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson7))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson7}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson7))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis())}, 759723402, -759723401, java.lang.System.identityHashCode(setfitssystemwindows));
            int i24 = valueOf;
            int i25 = ((i24 ^ 112) + ((i24 & 112) << 1)) - 1;
            writeReplace = i25 % 128;
            int i26 = i25 % 2;
        } else {
            setoncapturedpointerlistener = AlternateContactlessPaymentDataJson7;
            bArr5 = null;
        }
        values(new java.lang.Object[]{setfitssystemwindows, "CRYPTO_KEK", "19783526"}, -1463377062, 1463377066, java.lang.System.identityHashCode(setfitssystemwindows));
        if (bArr8 != null) {
            int i27 = writeReplace;
            int i28 = i27 & 103;
            valueOf = (((~i28) & (i27 | 103)) + (i28 << 1)) % 128;
            com.payair.hce.setIsCredential setiscredential = (com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows));
            bArr6 = bArr5;
            setoncapturedpointerlistener2 = AlternateContactlessPaymentDataJson6;
            int i29 = writeReplace;
            int i30 = (i29 & (-44)) | ((~i29) & 43);
            int i31 = (i29 & 43) << 1;
            valueOf = ((i30 & i31) + (i31 | i30)) % 128;
        } else {
            setoncapturedpointerlistener2 = AlternateContactlessPaymentDataJson6;
            bArr6 = bArr5;
        }
        if (bArr != null) {
            int i32 = valueOf;
            int i33 = (i32 & 75) + (i32 | 75);
            writeReplace = i33 % 128;
            if (i33 % 2 != 0) {
                com.payair.hce.setIsCredential setiscredential2 = (com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows));
                throw new java.lang.ArithmeticException();
            }
            com.payair.hce.setIsCredential setiscredential3 = (com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows));
            int i34 = valueOf;
            int i35 = i34 & 91;
            writeReplace = (((i34 | 91) & (~i35)) + (i35 << 1)) % 128;
        }
        if (bArr2 != null) {
            int i36 = writeReplace;
            int i37 = i36 & 77;
            int i38 = ((i36 ^ 77) | i37) << 1;
            int i39 = -((i36 | 77) & (~i37));
            int i40 = (i38 & i39) + (i39 | i38);
            valueOf = i40 % 128;
            if (i40 % 2 == 0) {
                com.payair.hce.setIsCredential setiscredential4 = (com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows));
                throw new java.lang.ArithmeticException();
            }
            com.payair.hce.setIsCredential setiscredential5 = (com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows));
        }
        if (bArr3 != null) {
            int i41 = valueOf;
            int i42 = i41 & 33;
            int i43 = i42 + ((i41 ^ 33) | i42);
            writeReplace = i43 % 128;
            if (i43 % 2 != 0) {
                com.payair.hce.setIsCredential setiscredential6 = (com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows));
                throw null;
            }
            com.payair.hce.setIsCredential setiscredential7 = (com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows));
        }
        if (bArr4 != null) {
            int i44 = writeReplace;
            int i45 = i44 & 83;
            int i46 = (i44 | 83) & (~i45);
            int i47 = i45 << 1;
            int i48 = ((i46 | i47) << 1) - (i46 ^ i47);
            valueOf = i48 % 128;
            if (i48 % 2 == 0) {
                com.payair.hce.setIsCredential setiscredential8 = (com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows));
                throw null;
            }
            com.payair.hce.setIsCredential setiscredential9 = (com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows));
            int i49 = writeReplace & 25;
            valueOf = ((i49 - (~(-(-((r3 ^ 25) | i49))))) - 1) % 128;
        }
        if (bArr6 != null) {
            int identityHashCode = java.lang.System.identityHashCode(setfitssystemwindows);
            int i50 = ~identityHashCode;
            int i51 = (-1898217309) & i50;
            int i52 = ~(((-1898217309) ^ i50) | i51);
            int i53 = ((i52 ^ 285239380) | (285239380 & i52)) * 98;
            int i54 = ((-899197110) ^ i53) + ((i53 & (-899197110)) << 1);
            int i55 = (-1860671372) ^ i50;
            int i56 = i50 & (-1860671372);
            int i57 = ~((i56 ^ i55) | (i56 & i55));
            int i58 = (-1898217309) ^ i57;
            int i59 = i57 & (-1898217309);
            int i60 = (i59 ^ i58) | (i59 & i58);
            int i61 = 1860671371 & identityHashCode;
            int i62 = (1860671371 | identityHashCode) & (~i61);
            int i63 = ~((i61 ^ i62) | (i62 & i61));
            int i64 = i60 & i63;
            int i65 = (i60 | i63) & (~i64);
            int i66 = -(-(((i65 ^ i64) | (i65 & i64)) * (-49)));
            int i67 = (i54 & i66) + (i66 | i54);
            int i68 = ~((identityHashCode & 1898217308) | i51 | ((-1898217309) & identityHashCode));
            int i69 = (-2145910752) ^ i68;
            int i70 = i68 & (-2145910752);
            int i71 = ((i70 ^ i69) | (i70 & i69)) * 49;
            int identityHashCode2 = java.lang.System.identityHashCode(setfitssystemwindows);
            int i72 = ~identityHashCode2;
            int i73 = ((-653128690) & identityHashCode2) | ((-653128690) ^ identityHashCode2);
            int i74 = (-882052091) & i72;
            int i75 = (~i74) & ((-882052091) | i72);
            int i76 = ~i73;
            int i77 = -(-((((i73 | i76) & i76) | (~((i74 & i75) | (i75 ^ i74)))) * (-1808)));
            int i78 = 300065110 & i77;
            int i79 = -(-((i77 ^ 300065110) | i78));
            int i80 = ((-40693762) & identityHashCode2) | ((-40693762) & i72) | (40693761 & identityHashCode2);
            int i81 = ~i80;
            int i82 = (i80 | i81) & i81;
            int i83 = 653128689 & i72;
            int i84 = (~i83) & (i72 | 653128689);
            int i85 = (i84 ^ i83) | (i84 & i83);
            int i86 = (i85 & (-882052091)) | (i85 ^ (-882052091));
            int i87 = ~i86;
            int i88 = i87 & (i86 | i87);
            int i89 = (((i78 & i79) + (i79 | i78)) - (~(-(~(-(-(((i88 ^ i82) | (i82 & i88)) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))))))) - 1;
            int i90 = (~i89) + (i89 << 1);
            int i91 = ~((identityHashCode2 ^ 882052090) | (882052090 & identityHashCode2));
            int i92 = ((~i91) & 612434928) | ((-612434929) & i91);
            int i93 = i91 & 612434928;
            int i94 = ((i93 ^ i92) | (i93 & i92) | (~((i72 ^ 653128689) | i83))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN;
            int i95 = i90 & i94;
            int i96 = ((i90 ^ i94) | i95) << 1;
            int i97 = -((i90 | i94) & (~i95));
            if ((((~i71) & i67) | ((~i67) & i71)) + ((i71 & i67) << 1) > (i96 & i97) + (i97 | i96)) {
                com.payair.hce.setIsCredential setiscredential10 = (com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows));
                throw null;
            }
            com.payair.hce.setIsCredential setiscredential11 = (com.payair.hce.setIsCredential) values(new java.lang.Object[]{setfitssystemwindows}, -738120466, 738120478, java.lang.System.identityHashCode(setfitssystemwindows));
            bArr7 = bArr6;
        } else {
            bArr7 = bArr6;
        }
        values(new java.lang.Object[]{bArr8}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        values(new java.lang.Object[]{bArr}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        values(new java.lang.Object[]{bArr2}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        values(new java.lang.Object[]{bArr3}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        values(new java.lang.Object[]{bArr4}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        values(new java.lang.Object[]{bArr7}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
        writeReplace = (valueOf + 103) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int i = valueOf + 33;
        int i2 = i % 128;
        writeReplace = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (bArr != null) {
            valueOf = ((i2 ^ 43) + ((i2 & 43) << 1)) % 128;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = writeReplace;
                valueOf = (i4 + 53) % 128;
                bArr[i3] = 0;
                int i5 = i3 & 1;
                int i6 = (i3 | 1) & (~i5);
                int i7 = -(-(i5 << 1));
                i3 = (i6 & i7) + (i6 | i7);
                int i8 = (((i4 | 6) << 1) - (i4 ^ 6)) - 1;
                valueOf = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 4 / 4;
                }
            }
        }
        int i10 = valueOf;
        int i11 = (i10 & 121) + (i10 | 121);
        writeReplace = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    static {
        init$0();
        writeReplace = 0;
        valueOf = 1;
        DigitizedCardProfile = -7375240291180713789L;
    }

    private static void DigitizedCardProfile(byte[] bArr) {
        values(new java.lang.Object[]{bArr}, -1891783704, 1891783709, (int) java.lang.System.currentTimeMillis());
    }

    private void getAid() {
        values(new java.lang.Object[]{this}, -810936793, 810936795, java.lang.System.identityHashCode(this));
    }

    static byte[] DigitizedCardProfile(int i) {
        return (byte[]) values(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, -1256130801, 1256130808, i);
    }

    private static com.payair.hce.getErrorString writeReplace(com.payair.hce.getTransactionExecutor gettransactionexecutor, int i) {
        return (com.payair.hce.getErrorString) values(new java.lang.Object[]{gettransactionexecutor, java.lang.Integer.valueOf(i)}, -923294541, 923294550, i);
    }

    private static com.payair.hce.getErrorString values(int i) {
        return (com.payair.hce.getErrorString) values(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, 1030215268, -1030215253, i);
    }

    private static byte[] AlternateContactlessPaymentDataJson(com.payair.hce.findFragmentByTag findfragmentbytag) {
        return (byte[]) values(new java.lang.Object[]{findfragmentbytag}, -1367731847, 1367731855, (int) java.lang.System.currentTimeMillis());
    }

    private static byte[] IccPrivateKeyCrtComponentsJson() {
        return (byte[]) values(new java.lang.Object[0], 314088055, -314088049, (int) java.lang.System.currentTimeMillis());
    }

    final boolean AlternateContactlessPaymentDataJson(java.lang.String str) {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this, str}, -1391855168, 1391855178, java.lang.System.identityHashCode(this))).booleanValue();
    }

    private static byte[] DigitizedCardProfile(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return (byte[]) values(new java.lang.Object[]{bArr, bArr2, bArr3}, -1000707843, 1000707854, (int) java.lang.System.currentTimeMillis());
    }

    private static byte[] values(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return (byte[]) values(new java.lang.Object[]{bArr, bArr2, bArr3}, 653671464, -653671447, (int) java.lang.System.currentTimeMillis());
    }

    final byte[] valueOf(byte[] bArr, byte[] bArr2) {
        return (byte[]) values(new java.lang.Object[]{this, bArr, bArr2}, 759723402, -759723401, java.lang.System.identityHashCode(this));
    }

    private com.payair.hce.setOnCapturedPointerListener writeReplace(byte[] bArr, java.lang.String str, java.lang.String str2, byte[] bArr2) {
        return (com.payair.hce.setOnCapturedPointerListener) values(new java.lang.Object[]{this, bArr, str, str2, bArr2}, -2004245780, 2004245796, java.lang.System.identityHashCode(this));
    }

    final com.payair.hce.setOnCapturedPointerListener DigitizedCardProfile(byte[] bArr, java.lang.String str, java.lang.String str2) {
        return (com.payair.hce.setOnCapturedPointerListener) values(new java.lang.Object[]{this, bArr, str, str2}, -1909065528, 1909065542, java.lang.System.identityHashCode(this));
    }

    private com.payair.hce.setIsCredential getProfileVersion() {
        return (com.payair.hce.setIsCredential) values(new java.lang.Object[]{this}, -738120466, 738120478, java.lang.System.identityHashCode(this));
    }

    private static com.payair.hce.setScrollBarDefaultDelayBeforeFade DigitizedCardProfile() {
        return (com.payair.hce.setScrollBarDefaultDelayBeforeFade) values(new java.lang.Object[0], 1965606428, -1965606425, (int) java.lang.System.currentTimeMillis());
    }

    private byte[] writeReplace(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z) {
        return (byte[]) values(new java.lang.Object[]{this, bArr, bArr2, bArr3, bArr4, java.lang.Boolean.valueOf(z)}, 786712738, -786712738, java.lang.System.identityHashCode(this));
    }

    private com.payair.hce.setOnCapturedPointerListener values(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z) {
        return (com.payair.hce.setOnCapturedPointerListener) values(new java.lang.Object[]{this, bArr, bArr2, bArr3, java.lang.Boolean.valueOf(z)}, 2098772694, -2098772681, java.lang.System.identityHashCode(this));
    }

    private void DigitizedCardProfile(java.lang.String str, java.lang.String str2) {
        values(new java.lang.Object[]{this, str, str2}, -1463377062, 1463377066, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{16, -36, 67, -117};
        $$b = 6;
    }
}
