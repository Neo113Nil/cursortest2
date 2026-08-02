package com.payair.hce;

/* loaded from: classes4.dex */
public class stopSelf implements com.payair.hce.getText {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getAid;
    private static long getProfileVersion;
    private final com.payair.hce.gotPostData AlternateContactlessPaymentDataJson;
    private com.payair.hce.getApplicationContext DigitizedCardProfile = null;
    private com.payair.hce.checkPermission valueOf;
    private final com.payair.hce.getColor values;
    private final com.payair.hce.setSpecialRequestUrl writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = s * 3;
        int i4 = 4 - (b2 * 3);
        int i5 = b + 102;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i4 += i5;
            i2 = i6 + 1;
            i = i7;
            bArr2[i] = (byte) i4;
            if (i == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i + 1;
            i6 = i2;
            i5 = bArr[i2];
            i7 = i8;
            i4 += i5;
            i2 = i6 + 1;
            i = i7;
            bArr2[i] = (byte) i4;
            if (i == i3) {
            }
        } else {
            i = 0;
            i4 = i5;
            i2 = i4;
            bArr2[i] = (byte) i4;
            if (i == i3) {
            }
        }
    }

    public stopSelf(com.payair.hce.setSpecialRequestUrl setspecialrequesturl, com.payair.hce.getColor getcolor, com.payair.hce.gotPostData gotpostdata) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("굝쐽െ覶", "\u05f5赙䶌\ueb4b䬔䬔", "䙺\ue617䕒㯖", android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (54852 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.stopSelf.class.getName());
        this.valueOf = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        this.writeReplace = setspecialrequesturl;
        this.values = getcolor;
        this.AlternateContactlessPaymentDataJson = gotpostdata;
    }

    @Override // com.payair.hce.getText
    public final byte[] values(byte[] bArr) {
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 13) % 128;
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.DigitizedCardProfile == null) {
            com.payair.hce.getColor getcolor = this.values;
            if (getcolor != null) {
                getcolor.DigitizedCardProfile();
            }
            com.payair.hce.getApplicationContext getapplicationcontext = (com.payair.hce.getApplicationContext) this.writeReplace.values(com.payair.hce.setStatusCode.writeReplace, this.AlternateContactlessPaymentDataJson);
            this.DigitizedCardProfile = getapplicationcontext;
            if (getapplicationcontext != null) {
                getapplicationcontext.getGpoResponse();
                this.DigitizedCardProfile.getSecurityWord();
            }
        }
        com.payair.hce.getApplicationContext getapplicationcontext2 = this.DigitizedCardProfile;
        if (getapplicationcontext2 != null) {
            try {
                byte[] writeReplace = writeReplace(bArr, getapplicationcontext2.AlternateContactlessPaymentDataJson(bArr));
                new java.lang.Object[]{java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis)};
                return writeReplace;
            } catch (com.payair.hce.isSendHeaders unused) {
                return com.payair.hce.bindIsolatedService.valueOf().DigitizedCardProfile();
            }
        }
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 111;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            return com.payair.hce.bindIsolatedService.valueOf().DigitizedCardProfile();
        }
        com.payair.hce.bindIsolatedService.valueOf().DigitizedCardProfile();
        throw null;
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        int i2 = $11 + 15;
        $10 = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            int i3 = $10 + 103;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        if (str != null) {
            int i4 = $11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            cArr2 = str.toCharArray();
        } else {
            cArr2 = str;
        }
        char[] cArr4 = cArr2;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        byte b = 0;
        java.lang.System.arraycopy(charArray, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $11 = ($10 + 125) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - android.view.View.resolveSizeAndState(b, b, b), 1179 - android.graphics.Color.green((int) b), (char) android.text.TextUtils.indexOf("", ""));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b, b, objArr3);
                    java.lang.String str4 = (java.lang.String) objArr3[b];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[b] = java.lang.Object.class;
                    obj2 = cls.getMethod(str4, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(b, b) + 30, 3443 - android.text.TextUtils.indexOf("", "", b, b), (char) (3830 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, b, b)));
                    java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                    clsArr2[b] = java.lang.Object.class;
                    obj3 = cls2.getMethod("g", clsArr2);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                char c3 = cArr5[getwalletdata.writeReplace % 4];
                java.lang.Object[] objArr5 = new java.lang.Object[3];
                objArr5[2] = java.lang.Integer.valueOf(cArr6[intValue]);
                objArr5[1] = java.lang.Integer.valueOf(c3 * 32718);
                objArr5[b] = getwalletdata;
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 26, (android.os.Process.myTid() >> 22) + 1864, (char) (41776 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                    byte b2 = (byte) ($$b & 3);
                    byte b3 = (byte) (b2 - 3);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(b2, b3, b3, objArr6);
                    java.lang.String str5 = (java.lang.String) objArr6[b];
                    java.lang.Class<?>[] clsArr3 = new java.lang.Class[3];
                    clsArr3[b] = java.lang.Object.class;
                    clsArr3[1] = java.lang.Integer.TYPE;
                    clsArr3[2] = java.lang.Integer.TYPE;
                    obj4 = cls3.getMethod(str5, clsArr3);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                char c4 = cArr5[intValue2];
                java.lang.Object[] objArr7 = new java.lang.Object[2];
                objArr7[1] = java.lang.Integer.valueOf(cArr6[intValue]);
                objArr7[b] = java.lang.Integer.valueOf(c4 * 32718);
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.widget.ExpandableListView.getPackedPositionForChild(b, b) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(b, b) == 0L ? 0 : -1)), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3133, (char) android.view.KeyEvent.getDeadChar(b, b));
                    byte length4 = (byte) $$a.length;
                    byte b4 = (byte) (length4 - 4);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(length4, b4, b4, objArr8);
                    java.lang.String str6 = (java.lang.String) objArr8[b];
                    c2 = 2;
                    java.lang.Class<?>[] clsArr4 = new java.lang.Class[2];
                    clsArr4[b] = java.lang.Integer.TYPE;
                    clsArr4[1] = java.lang.Integer.TYPE;
                    obj5 = cls4.getMethod(str6, clsArr4);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                } else {
                    c2 = 2;
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((int) (IccPrivateKeyCrtComponentsJson ^ 1263759066225628708L)) ^ ((cArr5[intValue2] ^ cArr3[getwalletdata.writeReplace]) ^ (getProfileVersion ^ 1263759066225628708L))) ^ ((char) (getAid ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                obj = null;
                b = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    @Override // com.payair.hce.getText
    public final void values() {
        int i = (RecordsJson + 63) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i;
        com.payair.hce.getApplicationContext getapplicationcontext = this.DigitizedCardProfile;
        if (getapplicationcontext != null) {
            RecordsJson = (i + 23) % 128;
            getapplicationcontext.getGpoResponse();
            RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 29) % 128;
        }
        this.DigitizedCardProfile = null;
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 47) % 128;
    }

    private byte[] writeReplace(byte[] bArr, byte[] bArr2) {
        int i;
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr2);
        if (this.values != null) {
            RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 107) % 128;
            try {
                int[] iArr = com.payair.hce.stopSelf.AnonymousClass3.DigitizedCardProfile;
                com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr);
                byte b = bArr[com.payair.hce.setPpseFci.values];
                if (b == -92) {
                    i = com.payair.hce.onStart.AlternateContactlessPaymentDataJson;
                } else if (b == -78) {
                    i = com.payair.hce.onStart.writeReplace;
                    SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 121) % 128;
                } else if (b == -54) {
                    i = com.payair.hce.onStart.values;
                } else {
                    i = com.payair.hce.onStart.valueOf;
                }
                int i2 = iArr[i - 1];
                if (i2 == 1) {
                    com.payair.hce.isAlternateAidMchipDataValid isalternateaidmchipdatavalid = new com.payair.hce.isAlternateAidMchipDataValid(bArr);
                    bArr2 = this.values.valueOf(((java.lang.Byte) com.payair.hce.isAlternateAidMchipDataValid.writeReplace(new java.lang.Object[]{isalternateaidmchipdatavalid}, -1247048372, 1247048373, java.lang.System.identityHashCode(isalternateaidmchipdatavalid))).byteValue(), ((java.lang.Byte) com.payair.hce.isAlternateAidMchipDataValid.writeReplace(new java.lang.Object[]{isalternateaidmchipdatavalid}, -1399385240, 1399385240, java.lang.System.identityHashCode(isalternateaidmchipdatavalid))).byteValue(), bArr2);
                } else if (i2 == 2) {
                    com.payair.hce.isMagstripeDataValid ismagstripedatavalid = new com.payair.hce.isMagstripeDataValid(bArr);
                    bArr2 = this.values.values(bArr2, ((com.payair.hce.transactionCanBeResumed) com.payair.hce.isMagstripeDataValid.AlternateContactlessPaymentDataJson(new java.lang.Object[]{ismagstripedatavalid}, 272675787, -272675785, java.lang.System.identityHashCode(ismagstripedatavalid))).valueOf());
                }
            } catch (java.lang.Exception unused) {
            }
        }
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr2);
        int i3 = SdkCoreAlternateContactlessPaymentDataImpl + 63;
        RecordsJson = i3 % 128;
        if (i3 % 2 != 0) {
            return bArr2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: com.payair.hce.stopSelf$3, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] DigitizedCardProfile;
        private static int valueOf = 1;
        private static int writeReplace;

        static {
            int[] iArr = new int[com.payair.hce.onStart.valueOf().length];
            DigitizedCardProfile = iArr;
            try {
                int i = com.payair.hce.onStart.writeReplace;
                iArr[1] = 1;
                int i2 = writeReplace + 75;
                valueOf = i2 % 128;
                int i3 = i2 % 2;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = DigitizedCardProfile;
                int i4 = com.payair.hce.onStart.AlternateContactlessPaymentDataJson;
                iArr2[2] = 2;
                int i5 = valueOf;
                int i6 = i5 & 49;
                writeReplace = ((((i5 | 49) & (~i6)) - (~(-(-(i6 << 1))))) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        RecordsJson = 1;
        getProfileVersion = -7476033199945843847L;
        IccPrivateKeyCrtComponentsJson = -804334044;
        getAid = (char) 54820;
    }

    static void init$0() {
        $$a = new byte[]{94, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, com.google.common.base.Ascii.CAN, 122};
        $$b = 95;
    }
}
