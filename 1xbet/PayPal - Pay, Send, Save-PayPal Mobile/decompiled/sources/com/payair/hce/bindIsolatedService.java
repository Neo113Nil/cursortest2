package com.payair.hce;

/* loaded from: classes4.dex */
public final class bindIsolatedService {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int RecordsJson;
    private static short[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getProfileVersion;
    private static int valueOf;
    private static byte[] values;
    private static int writeReplace;
    private byte[] DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = i4 | i5;
        int i7 = (i * 51) + (i2 * (-49)) + ((i | i3) * (-50)) + (((~((~i) | i4 | i3)) | (~(i6 | i))) * 50) + (((~(i | i4)) | (~i6) | (~(i | i5))) * 50);
        if (i7 == 1) {
            com.payair.hce.bindIsolatedService bindisolatedservice = new com.payair.hce.bindIsolatedService(((java.lang.Number) objArr[0]).intValue());
            getProfileVersion = (RecordsJson + 109) % 128;
            return bindisolatedservice;
        }
        if (i7 != 2) {
            com.payair.hce.bindIsolatedService bindisolatedservice2 = (com.payair.hce.bindIsolatedService) objArr[0];
            int intValue = ((java.lang.Number) objArr[1]).intValue();
            byte[] bArr = (byte[]) objArr[2];
            RecordsJson = (getProfileVersion + 97) % 128;
            java.lang.System.arraycopy(bArr, 0, bindisolatedservice2.DigitizedCardProfile, intValue, bArr.length);
            RecordsJson = (getProfileVersion + 37) % 128;
            return null;
        }
        com.payair.hce.bindIsolatedService bindisolatedservice3 = (com.payair.hce.bindIsolatedService) objArr[0];
        int intValue2 = ((java.lang.Number) objArr[1]).intValue();
        int i8 = (getProfileVersion + 17) % 128;
        RecordsJson = i8;
        byte b = bindisolatedservice3.DigitizedCardProfile[intValue2];
        getProfileVersion = (i8 + 33) % 128;
        return java.lang.Byte.valueOf(b);
    }

    private static void b(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3 = (i2 * 2) + 104;
        int i4 = 3 - (i * 3);
        int i5 = b * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = -1;
        if (bArr == null) {
            i3 = i4 + i3;
            i4 = i4;
        }
        while (true) {
            i6++;
            int i7 = i4 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == 0 - i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i3 += bArr[i7];
                i4 = i7;
            }
        }
    }

    public static com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson(java.lang.String str) {
        com.payair.hce.bindIsolatedService bindisolatedservice = new com.payair.hce.bindIsolatedService(str);
        int i = getProfileVersion + 105;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            return bindisolatedservice;
        }
        throw new java.lang.ArithmeticException();
    }

    public static com.payair.hce.bindIsolatedService valueOf() {
        com.payair.hce.bindIsolatedService bindisolatedservice = new com.payair.hce.bindIsolatedService((char) 27013);
        getProfileVersion = (RecordsJson + 121) % 128;
        return bindisolatedservice;
    }

    public static com.payair.hce.bindIsolatedService values(byte b) {
        com.payair.hce.bindIsolatedService bindisolatedservice = new com.payair.hce.bindIsolatedService(b);
        RecordsJson = (getProfileVersion + 73) % 128;
        return bindisolatedservice;
    }

    public static com.payair.hce.bindIsolatedService writeReplace(com.payair.hce.bindIsolatedService bindisolatedservice) {
        byte[] DigitizedCardProfile = bindisolatedservice.DigitizedCardProfile();
        com.payair.hce.bindIsolatedService bindisolatedservice2 = new com.payair.hce.bindIsolatedService(DigitizedCardProfile, DigitizedCardProfile.length);
        RecordsJson = (getProfileVersion + 35) % 128;
        return bindisolatedservice2;
    }

    public static com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson(byte[] bArr) {
        int i = RecordsJson + 113;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (bArr == null) {
            return null;
        }
        com.payair.hce.bindIsolatedService bindisolatedservice = new com.payair.hce.bindIsolatedService(bArr, bArr.length);
        int i2 = getProfileVersion + 21;
        RecordsJson = i2 % 128;
        if (i2 % 2 == 0) {
            return bindisolatedservice;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String writeReplace() {
        byte[] bArr = this.DigitizedCardProfile;
        if (bArr != null) {
            return new java.lang.String(com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr)).toUpperCase(java.util.Locale.ENGLISH);
        }
        int i = (getProfileVersion + 89) % 128;
        RecordsJson = i;
        int i2 = i + 101;
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0) {
            return "";
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String toString() {
        int i = getProfileVersion + 75;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            writeReplace();
            throw null;
        }
        java.lang.String writeReplace2 = writeReplace();
        int i2 = getProfileVersion + 111;
        RecordsJson = i2 % 128;
        if (i2 % 2 == 0) {
            return writeReplace2;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String values() {
        java.lang.String str = new java.lang.String(this.DigitizedCardProfile);
        int i = getProfileVersion + 21;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        int i4;
        long j;
        boolean z;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(valueOf)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 26, 'M' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                i4 = 1;
            } else {
                int i5 = $11 + 71;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = values;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        $10 = ($11 + 65) % 128;
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i7])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 31, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 5088, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i7] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr == null) {
                    j = -4897270311952305750L;
                    intValue = (short) (((short) (SdkCoreAlternateContactlessPaymentDataImpl[i2 + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (valueOf ^ (-4897270311952305750L))));
                    if (intValue > 0) {
                        gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + ((int) (AlternateContactlessPaymentDataJson ^ j)) + i4;
                        java.lang.Object[] objArr4 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(writeReplace), sb};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj3 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 27, 2364 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) android.graphics.Color.blue(0));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            b(0, (byte) 0, 0, objArr5);
                            obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj3);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr3 = values;
                        if (bArr3 != null) {
                            $10 = ($11 + 71) % 128;
                            int length2 = bArr3.length;
                            byte[] bArr4 = new byte[length2];
                            int i8 = 0;
                            while (i8 < length2) {
                                int i9 = $10 + 43;
                                $11 = i9 % 128;
                                if (i9 % 2 == 0) {
                                    bArr4[i8] = (byte) (bArr3[i8] + 4897270311952305750L);
                                    i8 >>= 1;
                                } else {
                                    bArr4[i8] = (byte) (bArr3[i8] ^ (-4897270311952305750L));
                                    i8++;
                                }
                            }
                            bArr3 = bArr4;
                        }
                        if (bArr3 != null) {
                            int i10 = ($10 + 23) % 128;
                            $11 = i10;
                            $10 = (i10 + 13) % 128;
                            z = true;
                        } else {
                            z = false;
                        }
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            if (z) {
                                byte[] bArr5 = values;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr5[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            } else {
                                short[] sArr = SdkCoreAlternateContactlessPaymentDataImpl;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            }
                            sb.append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            gettrack2constructiondata.DigitizedCardProfile++;
                        }
                    }
                    objArr[0] = sb.toString();
                }
                byte[] bArr6 = values;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.View.resolveSize(0, 0), 28 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                }
                intValue = (byte) (((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).intValue()] ^ (-4897270311952305750L))) + ((int) (valueOf ^ (-4897270311952305750L))));
            }
            j = -4897270311952305750L;
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final byte[] DigitizedCardProfile() {
        int i = RecordsJson + 61;
        int i2 = i % 128;
        getProfileVersion = i2;
        if (i % 2 == 0) {
            throw null;
        }
        byte[] bArr = this.DigitizedCardProfile;
        RecordsJson = (i2 + 39) % 128;
        return bArr;
    }

    public final int AlternateContactlessPaymentDataJson() {
        int i = RecordsJson;
        getProfileVersion = (i + 93) % 128;
        int length = this.DigitizedCardProfile.length;
        getProfileVersion = (i + 59) % 128;
        return length;
    }

    public final com.payair.hce.bindIsolatedService valueOf(com.payair.hce.bindIsolatedService bindisolatedservice) {
        com.payair.hce.bindIsolatedService bindisolatedservice2;
        if (bindisolatedservice != null) {
            getProfileVersion = (RecordsJson + 13) % 128;
            if (bindisolatedservice.DigitizedCardProfile() == null) {
                return this;
            }
            if (bindisolatedservice == this) {
                getProfileVersion = (RecordsJson + 97) % 128;
                bindisolatedservice2 = writeReplace(bindisolatedservice);
            } else {
                bindisolatedservice2 = bindisolatedservice;
            }
            byte[] bArr = this.DigitizedCardProfile;
            int length = bArr.length;
            values(bArr.length + bindisolatedservice2.AlternateContactlessPaymentDataJson());
            java.lang.System.arraycopy(bindisolatedservice2.DigitizedCardProfile(), 0, this.DigitizedCardProfile, length, bindisolatedservice2.AlternateContactlessPaymentDataJson());
            if (bindisolatedservice == this) {
                getProfileVersion = (RecordsJson + 119) % 128;
                bindisolatedservice2.IccPrivateKeyCrtComponentsJson();
            }
        }
        return this;
    }

    public final void valueOf(int i, byte b) {
        int i2 = RecordsJson + 109;
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0) {
            this.DigitizedCardProfile[i] = b;
        } else {
            this.DigitizedCardProfile[i] = b;
            throw null;
        }
    }

    private void values(int i) {
        RecordsJson = (getProfileVersion + 23) % 128;
        byte[] bArr = this.DigitizedCardProfile;
        if (i > bArr.length) {
            byte[] bArr2 = new byte[i];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.DigitizedCardProfile = bArr2;
            int i2 = RecordsJson + 119;
            getProfileVersion = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 / 3;
            }
        }
    }

    @java.lang.Deprecated
    public final void getProfileVersion() {
        RecordsJson = (getProfileVersion + 77) % 128;
        java.util.Arrays.fill(this.DigitizedCardProfile, (byte) -69);
        int i = getProfileVersion + 39;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private void IccPrivateKeyCrtComponentsJson() {
        byte[] bArr = this.DigitizedCardProfile;
        if (bArr != null) {
            int i = getProfileVersion + 3;
            RecordsJson = i % 128;
            if (i % 2 != 0) {
                java.util.Arrays.fill(bArr, (byte) 1);
            } else {
                java.util.Arrays.fill(bArr, (byte) 0);
            }
        }
        int i2 = getProfileVersion + 69;
        RecordsJson = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final com.payair.hce.bindIsolatedService DigitizedCardProfile(int i, int i2) {
        com.payair.hce.bindIsolatedService bindisolatedservice = new com.payair.hce.bindIsolatedService(java.util.Arrays.copyOfRange(this.DigitizedCardProfile, i, i2), i2 - i);
        getProfileVersion = (RecordsJson + 103) % 128;
        return bindisolatedservice;
    }

    private bindIsolatedService(int i) {
        this.DigitizedCardProfile = new byte[i];
    }

    private bindIsolatedService(java.lang.String str) {
        if (str == null) {
            str = null;
        } else if (str.length() % 2 != 0) {
            int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
            int gidForName = android.os.Process.getGidForName("");
            int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((minimumFlingVelocity >> 16) - 885865651, 1099309180 - gidForName, (tapTimeout >> 16) - 119, (byte) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 111), (short) android.graphics.Color.blue(0), objArr);
            str = ((java.lang.String) objArr[0]).intern().concat(java.lang.String.valueOf(str));
        }
        this.DigitizedCardProfile = com.payair.hce.stopService.writeReplace(str);
    }

    private bindIsolatedService(char c) {
        this.DigitizedCardProfile = new byte[]{105, -123};
    }

    private bindIsolatedService(byte b) {
        this.DigitizedCardProfile = new byte[]{b};
    }

    private bindIsolatedService(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.DigitizedCardProfile = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        getProfileVersion = 1;
        AlternateContactlessPaymentDataJson = -1585582551;
        valueOf = 520368604;
        writeReplace = 734596425;
        values = new byte[]{33};
    }

    public final byte writeReplace(int i) {
        return ((java.lang.Byte) DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, 504288689, -504288687, i)).byteValue();
    }

    public final void values(int i, byte[] bArr) {
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Integer.valueOf(i), bArr}, -1255865437, 1255865437, i);
    }

    public static com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson(int i) {
        return (com.payair.hce.bindIsolatedService) DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, 1372926577, -1372926576, i);
    }

    static void init$0() {
        $$a = new byte[]{89, -55, -127, -63};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE;
    }
}
