package com.payair.hce;

/* loaded from: classes4.dex */
public class onDestroy implements com.payair.hce.onSdkUnregistered {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static long RecordsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getProfileVersion;
    private com.payair.hce.sendUpdateRNSInformation AlternateContactlessPaymentDataJson;
    private com.payair.hce.getMainExecutor DigitizedCardProfile;
    private com.payair.hce.getAttributionSource valueOf;
    private com.payair.hce.sendUpdateRNSInformation.AlternateContactlessPaymentDataJson values;
    private com.payair.hce.initializeVisaPaymentSdk writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = s2 * 3;
        int i3 = (s * 2) + 4;
        int i4 = 106 - b;
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i5 = i4;
            i4 = i2;
            i = 0;
            i4 += i5;
            i3++;
            bArr2[i] = (byte) i4;
            if (i == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i5 = bArr[i3];
            i4 += i5;
            i3++;
            bArr2[i] = (byte) i4;
            if (i == i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i2) {
            }
        }
    }

    static /* synthetic */ com.payair.hce.getMainExecutor values(com.payair.hce.onDestroy ondestroy) {
        int i = getAid + 31;
        getProfileVersion = i % 128;
        com.payair.hce.getMainExecutor getmainexecutor = ondestroy.DigitizedCardProfile;
        if (i % 2 == 0) {
            return getmainexecutor;
        }
        throw null;
    }

    public onDestroy(com.payair.hce.sendUpdateRNSInformation sendupdaternsinformation, com.payair.hce.getAttributionSource getattributionsource, com.payair.hce.initializeVisaPaymentSdk initializevisapaymentsdk) {
        int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "ⱥ縜何儆뛭\ue501", "\ue8e9ટ贙繹", minimumFlingVelocity >> 16, (char) (android.view.View.getDefaultSize(0, 0) + 31117), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.onDestroy.class.getName());
        com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        this.AlternateContactlessPaymentDataJson = sendupdaternsinformation;
        this.valueOf = getattributionsource;
        this.writeReplace = initializevisapaymentsdk;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.onDestroy ondestroy = (com.payair.hce.onDestroy) objArr[0];
        com.payair.hce.getUrl geturl = (com.payair.hce.getUrl) objArr[1];
        com.payair.hce.activateCardForToken activatecardfortoken = (com.payair.hce.activateCardForToken) objArr[2];
        int i = getAid + 91;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            ondestroy.values = null;
            ondestroy.DigitizedCardProfile = null;
            if (geturl != com.payair.hce.getUrl.writeReplace) {
                ondestroy.DigitizedCardProfile = ondestroy.valueOf.DigitizedCardProfile();
            } else {
                int i2 = getProfileVersion + 47;
                getAid = i2 % 128;
                if (i2 % 2 == 0) {
                    ondestroy.DigitizedCardProfile = ondestroy.valueOf.values(activatecardfortoken);
                    throw null;
                }
                ondestroy.DigitizedCardProfile = ondestroy.valueOf.values(activatecardfortoken);
            }
            if (ondestroy.DigitizedCardProfile == null) {
                long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "⭻侟㿹檴똎ꘉ搎채㰬倊咟軤羺\u180e쏺塯뎸갞\ued22\u2fde妫孄ँညͮ", "栫禈엢Ŵ", (-495351703) - (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)), (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr2);
                throw new com.payair.hce.setUserID(((java.lang.String) objArr2[0]).intern());
            }
            com.payair.hce.startDeviceAuthenticationForPurchase startdeviceauthenticationforpurchase = new com.payair.hce.startDeviceAuthenticationForPurchase() { // from class: com.payair.hce.onDestroy.2
                private static int AlternateContactlessPaymentDataJson = 0;
                private static int writeReplace = 1;

                public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr3, int i3, int i4, int i5) {
                    int i6 = ~i4;
                    if ((i3 * (-103)) + (i4 * (-103)) + (((~(i6 | i5)) | (~((~i3) | i6))) * 104) + ((~(i4 | (~i5) | i3)) * (-104)) + ((i3 | i5) * 104) == 1) {
                        return valueOf(objArr3);
                    }
                    com.payair.hce.onDestroy.AnonymousClass2 anonymousClass2 = (com.payair.hce.onDestroy.AnonymousClass2) objArr3[0];
                    int i7 = AlternateContactlessPaymentDataJson;
                    writeReplace = ((((i7 ^ 17) | (i7 & 17)) << 1) - ((i7 & (-18)) | ((~i7) & 17))) % 128;
                    byte[] values = com.payair.hce.onDestroy.values(com.payair.hce.onDestroy.this).values();
                    int i8 = AlternateContactlessPaymentDataJson;
                    writeReplace = (((i8 & 86) + (i8 | 86)) - 1) % 128;
                    return values;
                }

                private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr3) {
                    com.payair.hce.onDestroy.AnonymousClass2 anonymousClass2 = (com.payair.hce.onDestroy.AnonymousClass2) objArr3[0];
                    int i3 = writeReplace;
                    int i4 = ((i3 & 96) + (i3 | 96)) - 1;
                    AlternateContactlessPaymentDataJson = i4 % 128;
                    com.payair.hce.getMainExecutor values = com.payair.hce.onDestroy.values(com.payair.hce.onDestroy.this);
                    if (i4 % 2 != 0) {
                        values.writeReplace();
                        throw null;
                    }
                    byte[] writeReplace2 = values.writeReplace();
                    int i5 = AlternateContactlessPaymentDataJson;
                    int i6 = i5 & 101;
                    int i7 = (i5 | 101) & (~i6);
                    int i8 = i6 << 1;
                    int i9 = (i7 & i8) + (i7 | i8);
                    writeReplace = i9 % 128;
                    if (i9 % 2 != 0) {
                        return writeReplace2;
                    }
                    throw new java.lang.ArithmeticException();
                }

                @Override // com.payair.hce.startDeviceAuthenticationForPurchase
                public final byte[] AlternateContactlessPaymentDataJson() {
                    return (byte[]) valueOf(new java.lang.Object[]{this}, 219287306, -219287305, java.lang.System.identityHashCode(this));
                }

                @Override // com.payair.hce.startDeviceAuthenticationForPurchase
                public final byte[] writeReplace() {
                    return (byte[]) valueOf(new java.lang.Object[]{this}, -435912285, 435912285, java.lang.System.identityHashCode(this));
                }
            };
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson(startdeviceauthenticationforpurchase.writeReplace());
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson(startdeviceauthenticationforpurchase.AlternateContactlessPaymentDataJson());
            getAid = (getProfileVersion + 19) % 128;
            return startdeviceauthenticationforpurchase;
        }
        ondestroy.values = null;
        ondestroy.DigitizedCardProfile = null;
        com.payair.hce.getUrl geturl2 = com.payair.hce.getUrl.writeReplace;
        throw new java.lang.ArithmeticException();
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char c2;
        int i2 = $10 + 109;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr = new char[length];
        int length2 = charArray3.length;
        char[] cArr2 = new char[length2];
        byte b = 0;
        java.lang.System.arraycopy(charArray, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray3, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr3 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $10 = ($11 + 89) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - android.graphics.drawable.Drawable.resolveOpacity(b, b), 1179 - android.graphics.Color.argb((int) b, (int) b, (int) b, (int) b), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                    byte length4 = (byte) $$a.length;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, length4, (byte) (length4 - 4), objArr3);
                    java.lang.String str4 = (java.lang.String) objArr3[b];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[b] = java.lang.Object.class;
                    obj = cls.getMethod(str4, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 3443 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, b) + 3832));
                    java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                    clsArr2[b] = java.lang.Object.class;
                    obj2 = cls2.getMethod("g", clsArr2);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                char c3 = cArr[getwalletdata.writeReplace % 4];
                java.lang.Object[] objArr5 = new java.lang.Object[3];
                objArr5[2] = java.lang.Integer.valueOf(cArr2[intValue]);
                objArr5[1] = java.lang.Integer.valueOf(c3 * 32718);
                objArr5[b] = getwalletdata;
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(25 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 1863 - android.view.MotionEvent.axisFromString(""), (char) (41775 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(b) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(b) == 0.0d ? 0 : -1))));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(b, (byte) 1, b, objArr6);
                    java.lang.String str5 = (java.lang.String) objArr6[b];
                    java.lang.Class<?>[] clsArr3 = new java.lang.Class[3];
                    clsArr3[b] = java.lang.Object.class;
                    clsArr3[1] = java.lang.Integer.TYPE;
                    clsArr3[2] = java.lang.Integer.TYPE;
                    obj3 = cls3.getMethod(str5, clsArr3);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                char c4 = cArr[intValue2];
                java.lang.Object[] objArr7 = new java.lang.Object[2];
                objArr7[1] = java.lang.Integer.valueOf(cArr2[intValue]);
                objArr7[b] = java.lang.Integer.valueOf(c4 * 32718);
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.graphics.Color.green((int) b), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3132, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(b, b, b, objArr8);
                    java.lang.String str6 = (java.lang.String) objArr8[b];
                    c2 = 2;
                    java.lang.Class<?>[] clsArr4 = new java.lang.Class[2];
                    clsArr4[b] = java.lang.Integer.TYPE;
                    clsArr4[1] = java.lang.Integer.TYPE;
                    obj4 = cls4.getMethod(str6, clsArr4);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr2[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr[intValue2] = getwalletdata.values;
                cArr3[getwalletdata.writeReplace] = (char) ((((int) (IccPrivateKeyCrtComponentsJson ^ 1263759066225628708L)) ^ ((cArr[intValue2] ^ charArray2[getwalletdata.writeReplace]) ^ (RecordsJson ^ 1263759066225628708L))) ^ ((char) (SdkCoreAlternateContactlessPaymentDataImpl ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                b = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // com.payair.hce.onSdkUnregistered
    public final byte[] AlternateContactlessPaymentDataJson(byte[] bArr, com.payair.hce.clearInternalStorage clearinternalstorage) {
        getProfileVersion = (getAid + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        if (this.values == null) {
            byte[] valueOf = this.DigitizedCardProfile.valueOf();
            byte[] AlternateContactlessPaymentDataJson = this.DigitizedCardProfile.AlternateContactlessPaymentDataJson();
            try {
                new java.lang.Object[]{com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(valueOf)};
                new java.lang.Object[]{com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson)};
                new java.lang.Object[]{com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(bArr)};
                this.values = this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(bArr, new com.payair.hce.initializeVisaPaymentSdk(valueOf), new com.payair.hce.initializeVisaPaymentSdk(AlternateContactlessPaymentDataJson));
            } catch (java.security.GeneralSecurityException unused) {
                return null;
            }
        }
        if (clearinternalstorage != com.payair.hce.clearInternalStorage.writeReplace) {
            if (clearinternalstorage == com.payair.hce.clearInternalStorage.values) {
                byte[] writeReplace = this.values.writeReplace();
                com.payair.hce.stopService.AlternateContactlessPaymentDataJson(writeReplace);
                return writeReplace;
            }
            byte[] DigitizedCardProfile = com.payair.hce.startService.DigitizedCardProfile(8);
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson(DigitizedCardProfile);
            return DigitizedCardProfile;
        }
        getAid = (getProfileVersion + 63) % 128;
        byte[] DigitizedCardProfile2 = this.values.DigitizedCardProfile();
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(DigitizedCardProfile2);
        return DigitizedCardProfile2;
    }

    @Override // com.payair.hce.onSdkUnregistered
    public final byte[] DigitizedCardProfile(byte[] bArr, byte b, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws com.payair.hce.getJWTToken {
        byte[] bArr6;
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(new byte[]{b});
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr2);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr3);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr4);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson((byte[]) null);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr5);
        try {
            int valueOf = this.AlternateContactlessPaymentDataJson.valueOf(this.writeReplace);
            int i = (getAid + 37) % 128;
            getProfileVersion = i;
            int i2 = i + 105;
            getAid = i2 % 128;
            if (i2 % 2 == 0) {
                com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr3);
                com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr4);
                throw new java.lang.ArithmeticException();
            }
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr3);
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr4);
            if (bArr3 == null || bArr3.length <= 0) {
                bArr6 = new byte[bArr4.length];
                java.lang.System.arraycopy(bArr4, 0, bArr6, 0, bArr4.length);
                getAid = (getProfileVersion + 51) % 128;
            } else {
                bArr6 = new byte[bArr3.length + bArr4.length];
                java.lang.System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
                java.lang.System.arraycopy(bArr4, 0, bArr6, bArr3.length, bArr4.length);
            }
            byte[] values = values(bArr6);
            com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(values);
            com.payair.hce.startService.DigitizedCardProfile(bArr6);
            com.payair.hce.startService.DigitizedCardProfile(values);
            AlternateContactlessPaymentDataJson.writeReplace();
            new java.lang.Object[]{AlternateContactlessPaymentDataJson.writeReplace()};
            com.payair.hce.bindIsolatedService values2 = com.payair.hce.bindIsolatedService.values(b);
            com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(bArr2);
            com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson3 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(bArr5);
            values2.writeReplace();
            AlternateContactlessPaymentDataJson2.writeReplace();
            AlternateContactlessPaymentDataJson.writeReplace();
            AlternateContactlessPaymentDataJson3.writeReplace();
            int i3 = valueOf - 63;
            com.payair.hce.bindIsolatedService bindisolatedservice = (com.payair.hce.bindIsolatedService) com.payair.hce.bindIsolatedService.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(i3)}, 1372926577, -1372926576, i3);
            bindisolatedservice.getProfileVersion();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(values2);
            arrayList.add(AlternateContactlessPaymentDataJson2);
            arrayList.add(AlternateContactlessPaymentDataJson);
            arrayList.add(bindisolatedservice);
            arrayList.add(AlternateContactlessPaymentDataJson3);
            com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson4 = AlternateContactlessPaymentDataJson(arrayList);
            AlternateContactlessPaymentDataJson4.writeReplace();
            new java.lang.Object[]{AlternateContactlessPaymentDataJson4.writeReplace()};
            com.payair.hce.bindIsolatedService values3 = values(AlternateContactlessPaymentDataJson4, com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(bArr));
            if (values3 == null) {
                return null;
            }
            getAid = (getProfileVersion + 11) % 128;
            new java.lang.Object[]{values3.writeReplace()};
            byte[] DigitizedCardProfile = values3.DigitizedCardProfile();
            int i4 = getAid + 29;
            getProfileVersion = i4 % 128;
            if (i4 % 2 == 0) {
                return DigitizedCardProfile;
            }
            throw null;
        } catch (java.lang.RuntimeException unused) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "헦적䎫㣫쮰c卑ύ銁领\ue9d4曞⇗璴꯭㨞ブム⁶蕎젓粶\uea1e䜮꿑鑺㈓꩜\uee6b趪橤忊\uf1f2傼\ue59d穯銩", "\ud82f㡧\ud86d0", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 557344728, (char) android.graphics.Color.red(0), objArr);
            throw new com.payair.hce.getJWTToken(((java.lang.String) objArr[0]).intern());
        } catch (java.security.GeneralSecurityException unused2) {
            return null;
        }
    }

    /* renamed from: com.payair.hce.onDestroy$4, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass4 {
        private static int DigitizedCardProfile = 1;
        private static int valueOf;
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[com.payair.hce.clearInternalStorage.values().length];
            values = iArr;
            try {
                iArr[com.payair.hce.clearInternalStorage.writeReplace.ordinal()] = 1;
                int i = valueOf;
                int i2 = (((i ^ 1) | (i & 1)) << 1) - ((i & (-2)) | ((~i) & 1));
                DigitizedCardProfile = i2 % 128;
                int i3 = i2 % 2;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                values[com.payair.hce.clearInternalStorage.values.ordinal()] = 2;
                int i4 = valueOf;
                int i5 = i4 & 41;
                int i6 = (i4 ^ 41) | i5;
                int i7 = (i5 & i6) + (i6 | i5);
                DigitizedCardProfile = i7 % 128;
                int i8 = i7 % 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                values[com.payair.hce.clearInternalStorage.AlternateContactlessPaymentDataJson.ordinal()] = 3;
                int i9 = valueOf;
                int i10 = ((i9 & 108) + (i9 | 108)) - 1;
                DigitizedCardProfile = i10 % 128;
                if (i10 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.payair.hce.onSdkUnregistered
    public final byte[] values(byte[] bArr, com.payair.hce.clearInternalStorage clearinternalstorage) {
        int i = getAid + 69;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr);
            if (this.values == null) {
                byte[] valueOf = this.DigitizedCardProfile.valueOf();
                byte[] AlternateContactlessPaymentDataJson = this.DigitizedCardProfile.AlternateContactlessPaymentDataJson();
                try {
                    new java.lang.Object[]{com.payair.hce.stopService.AlternateContactlessPaymentDataJson(valueOf)};
                    new java.lang.Object[]{com.payair.hce.stopService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson)};
                    new java.lang.Object[]{com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr)};
                    this.values = this.AlternateContactlessPaymentDataJson.valueOf(bArr, new com.payair.hce.initializeVisaPaymentSdk(valueOf), new com.payair.hce.initializeVisaPaymentSdk(AlternateContactlessPaymentDataJson));
                } catch (java.security.GeneralSecurityException unused) {
                    return null;
                }
            }
            int i2 = com.payair.hce.onDestroy.AnonymousClass4.values[clearinternalstorage.ordinal()];
            if (i2 == 1) {
                byte[] DigitizedCardProfile = this.values.DigitizedCardProfile();
                new java.lang.Object[]{com.payair.hce.stopService.AlternateContactlessPaymentDataJson(DigitizedCardProfile)};
                return DigitizedCardProfile;
            }
            if (i2 == 2) {
                byte[] writeReplace = this.values.writeReplace();
                new java.lang.Object[]{com.payair.hce.stopService.AlternateContactlessPaymentDataJson(writeReplace)};
                getAid = (getProfileVersion + 25) % 128;
                return writeReplace;
            }
            if (i2 != 3) {
                return null;
            }
            byte[] DigitizedCardProfile2 = com.payair.hce.startService.DigitizedCardProfile(8);
            new java.lang.Object[]{com.payair.hce.stopService.AlternateContactlessPaymentDataJson(DigitizedCardProfile2)};
            return DigitizedCardProfile2;
        }
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr);
        throw null;
    }

    private byte[] values(byte[] bArr) {
        getAid = (getProfileVersion + 29) % 128;
        byte[] SdkCoreAlternateContactlessPaymentDataImpl2 = this.AlternateContactlessPaymentDataJson.SdkCoreAlternateContactlessPaymentDataImpl(bArr);
        getProfileVersion = (getAid + 121) % 128;
        return SdkCoreAlternateContactlessPaymentDataImpl2;
    }

    @Override // com.payair.hce.onSdkUnregistered
    public final byte[] DigitizedCardProfile(byte[] bArr) {
        int i = getAid + 7;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            return this.AlternateContactlessPaymentDataJson.getProfileVersion(bArr);
        }
        this.AlternateContactlessPaymentDataJson.getProfileVersion(bArr);
        throw null;
    }

    private com.payair.hce.bindIsolatedService values(com.payair.hce.bindIsolatedService bindisolatedservice, com.payair.hce.bindIsolatedService bindisolatedservice2) {
        bindisolatedservice.writeReplace();
        bindisolatedservice2.writeReplace();
        try {
            com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(this.AlternateContactlessPaymentDataJson.valueOf(new byte[]{106}, new byte[]{org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT}, new byte[]{5, 1, 38}, bindisolatedservice.DigitizedCardProfile(), new com.payair.hce.initializeVisaPaymentSdk(bindisolatedservice2.DigitizedCardProfile())));
            getAid = (getProfileVersion + 55) % 128;
            return AlternateContactlessPaymentDataJson;
        } catch (java.security.GeneralSecurityException unused) {
            return null;
        }
    }

    private static com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson(java.lang.Iterable<com.payair.hce.bindIsolatedService> iterable) {
        getProfileVersion = (getAid + 57) % 128;
        java.util.Iterator<com.payair.hce.bindIsolatedService> it = iterable.iterator();
        getProfileVersion = (getAid + 45) % 128;
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().AlternateContactlessPaymentDataJson();
        }
        com.payair.hce.bindIsolatedService bindisolatedservice = (com.payair.hce.bindIsolatedService) com.payair.hce.bindIsolatedService.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(i2)}, 1372926577, -1372926576, i2);
        getProfileVersion = (getAid + 45) % 128;
        for (com.payair.hce.bindIsolatedService bindisolatedservice2 : iterable) {
            com.payair.hce.bindIsolatedService.DigitizedCardProfile(new java.lang.Object[]{bindisolatedservice, java.lang.Integer.valueOf(i), bindisolatedservice2.DigitizedCardProfile()}, -1255865437, 1255865437, i);
            i += bindisolatedservice2.AlternateContactlessPaymentDataJson();
        }
        return bindisolatedservice;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        getAid = 1;
        RecordsJson = 1263759066225628708L;
        IccPrivateKeyCrtComponentsJson = -804334044;
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 6431;
    }

    static void init$0() {
        $$a = new byte[]{38, -91, 120, 99};
        $$b = 185;
    }

    @Override // com.payair.hce.onSdkUnregistered
    public final com.payair.hce.startDeviceAuthenticationForPurchase valueOf(com.payair.hce.getUrl geturl, com.payair.hce.activateCardForToken activatecardfortoken) throws com.payair.hce.setUserID {
        return (com.payair.hce.startDeviceAuthenticationForPurchase) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, geturl, activatecardfortoken}, 2045797068, -2045797068, java.lang.System.identityHashCode(this));
    }
}
