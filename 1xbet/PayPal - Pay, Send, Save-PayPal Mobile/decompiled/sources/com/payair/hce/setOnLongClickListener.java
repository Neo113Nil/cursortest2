package com.payair.hce;

/* loaded from: classes4.dex */
public final class setOnLongClickListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static long getAid;
    private static int getProfileVersion;
    private static long values;
    private final java.lang.String AlternateContactlessPaymentDataJson;
    private final java.lang.String DigitizedCardProfile;
    private final byte[] valueOf;
    private final java.lang.String writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = i + 65;
        int i4 = 38 - (s * 34);
        int i5 = 35 - (b * 2);
        char[] cArr = new char[i5];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            int i7 = i4;
            int i8 = i7 + 1;
            i3 = (i4 + i6) - 2;
            i4 = i8;
            cArr[i2] = (char) i3;
            i2++;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i6 = bArr[i4];
            int i9 = i3;
            i7 = i4;
            i4 = i9;
            int i82 = i7 + 1;
            i3 = (i4 + i6) - 2;
            i4 = i82;
            cArr[i2] = (char) i3;
            i2++;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            cArr[i2] = (char) i3;
            i2++;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        byte[] bArr = $$d;
        int i5 = (i * 4) + 1;
        int i6 = 119 - i2;
        int i7 = 3 - (s * 4);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i5;
            int i9 = i7;
            int i10 = 0;
            int i11 = i7 + i8;
            i3 = i10;
            int i12 = i9;
            i6 = i11;
            i7 = i12;
            bArr2[i3] = (byte) i6;
            i4 = i3 + 1;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i13 = i7 + 1;
            int i14 = i6;
            i9 = i13;
            i7 = bArr[i13];
            i10 = i4;
            i8 = i14;
            int i112 = i7 + i8;
            i3 = i10;
            int i122 = i9;
            i6 = i112;
            i7 = i122;
            bArr2[i3] = (byte) i6;
            i4 = i3 + 1;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            i4 = i3 + 1;
            if (i4 == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    public setOnLongClickListener(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr) {
        this.AlternateContactlessPaymentDataJson = str;
        this.DigitizedCardProfile = str2;
        this.writeReplace = str3;
        this.valueOf = bArr;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setOnLongClickListener setonlongclicklistener = (com.payair.hce.setOnLongClickListener) objArr[0];
        int i = (RecordsJson + 111) % 128;
        getProfileVersion = i;
        byte[] bArr = setonlongclicklistener.valueOf;
        int i2 = i + 89;
        RecordsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public final java.lang.String valueOf() {
        int i = RecordsJson + 15;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            return this.AlternateContactlessPaymentDataJson;
        }
        throw null;
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        int i = (getProfileVersion + 57) % 128;
        RecordsJson = i;
        java.lang.String str = this.DigitizedCardProfile;
        int i2 = i + 101;
        getProfileVersion = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr = str;
        if (str != null) {
            int i2 = $11 + 13;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(values ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            $11 = ($10 + 99) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(values)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.os.Process.myTid() >> 22), 1921 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(0, (short) 0, 2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 27, 429 - android.graphics.Color.argb(0, 0, 0, 0), (char) (31610 - android.text.TextUtils.indexOf("", "", 0, 0)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d(0, (short) 0, 0, objArr5);
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

    public final java.lang.String DigitizedCardProfile() {
        int i = getProfileVersion + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i2 = i % 128;
        RecordsJson = i2;
        if (i % 2 == 0) {
            throw null;
        }
        java.lang.String str = this.writeReplace;
        int i3 = i2 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getProfileVersion = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void c(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        if (str3 != null) {
            $10 = ($11 + 29) % 128;
            cArr = str3.toCharArray();
            $10 = ($11 + 83) % 128;
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        if (str2 != null) {
            $11 = ($10 + 99) % 128;
            cArr2 = str2.toCharArray();
        } else {
            cArr2 = str2;
        }
        char[] cArr4 = cArr2;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr4.length;
        char[] cArr5 = new char[length];
        int length2 = cArr3.length;
        char[] cArr6 = new char[length2];
        java.lang.System.arraycopy(cArr4, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr3, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = charArray.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $11 = ($10 + 21) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 72, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1178, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(0, (short) 0, 17, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 30, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3443, (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 3831))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + 1864, (char) (41775 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d(0, (short) 0, 14, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.graphics.Color.red(0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3134, (char) android.view.View.resolveSize(0, 0));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    d(0, (short) 0, 13, objArr8);
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((cArr5[intValue2] ^ charArray[getwalletdata.writeReplace]) ^ (getAid ^ 1263759066225628708L)) ^ ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ 1263759066225628708L))) ^ ((char) (IccPrivateKeyCrtComponentsJson ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
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

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getProfileVersion = 0;
        RecordsJson = 1;
        values = -9036173502340500247L;
        getAid = -2674544361913739815L;
        SdkCoreAlternateContactlessPaymentDataImpl = -804334044;
        IccPrivateKeyCrtComponentsJson = (char) 54820;
    }

    /* JADX WARN: Code restructure failed: missing block: B:498:0x2ae1, code lost:
    
        r14 = r8[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x2ae8, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x2af7, code lost:
    
        if (r9 == null) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x28e9, code lost:
    
        if (r8 == null) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x1426, code lost:
    
        if (((((int) r3) & ((((((~(r23 | 2027571478)) | (~((-590345069) | r66))) * (-370)) - 635053777) + ((((~(2027571478 | r66)) | (~(r23 | (-590345069)))) | 1490028562) * (-370))) + 1554754052)) | (((int) (r3 >> 32)) & (((((~(1610604479 | r66)) | 2324) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 895054918) + ((~(r23 | 1610604479)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING)))) != 477111747) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x07c7, code lost:
    
        if (((((int) r3) & ((((r4 * 992) - 1537497691) + ((((~((-137062062) | r66)) | 2769576) | (~(r23 | (-1439995987)))) * (-496))) + (((-1574288472) | r66) * 496))) | (((int) (r3 >> 32)) & ((((((-648001293) | r66) * (-50)) - 2080237214) + (((~((-1480591540) | r66)) | (~(r23 | (-604636165)))) * 50)) + (((~(r23 | (-648001293))) | ((~(r23 | (-2085227704))) | 604636164)) * 50)))) != (-1032769152)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x1529, code lost:
    
        if (((((int) r3) & (((((~(1178519258 | r66)) | 1230325781) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) - 325855079) + (((~(r23 | 1178519258)) | 1230325781) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) | (((int) (r3 >> 32)) & (((((~(r23 | (-1166057473))) * 433) - 811681934) + (((~((-135749370) | r66)) | (-1301477042)) * (-433))) + (((~((-1301477042) | r66)) | (-1301806842)) * 433)))) == 477111747) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0ab2, code lost:
    
        if (r4.equals(((java.lang.String) r9[0]).intern()) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x08e3, code lost:
    
        if (((((int) r3) & ((((((~((-318898209) | r66)) | (~(r23 | (-1756124619)))) * (-318)) + 1710966955) + (((~((-1824317392) | r66)) | 68192773) * (-318))) + (((~(1824317391 | r66)) | (-387090982)) * 318))) | (((int) (r3 >> 32)) & ((((((~(r23 | 343605974)) | (-1780832386)) * (-933)) - 683840014) + (((~(r23 | (-1780832386))) | 2162816) * 933)) + 738886510))) == 542074309) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x17a7 A[Catch: all -> 0x4181, TryCatch #1 {all -> 0x4181, blocks: (B:3:0x0004, B:6:0x001f, B:7:0x005c, B:11:0x0128, B:13:0x0156, B:14:0x01a1, B:19:0x01cb, B:21:0x01de, B:22:0x0223, B:25:0x027f, B:27:0x0292, B:28:0x02e3, B:32:0x03a6, B:34:0x03b6, B:35:0x0403, B:37:0x0420, B:39:0x0430, B:40:0x0477, B:42:0x047f, B:44:0x049d, B:45:0x04f3, B:49:0x05a5, B:51:0x05c3, B:52:0x0618, B:56:0x06b3, B:58:0x06d1, B:59:0x0722, B:62:0x07cb, B:64:0x07e9, B:65:0x0843, B:71:0x0efd, B:73:0x0f0d, B:74:0x0f59, B:77:0x0fbf, B:79:0x0fd2, B:80:0x1027, B:84:0x1114, B:86:0x1124, B:87:0x116c, B:89:0x118b, B:91:0x119b, B:92:0x11ea, B:96:0x11ff, B:98:0x121c, B:99:0x1272, B:106:0x1565, B:108:0x1578, B:109:0x15d0, B:121:0x16ad, B:123:0x16f3, B:124:0x174d, B:128:0x1794, B:130:0x17a7, B:131:0x17f2, B:133:0x18a0, B:135:0x18b3, B:136:0x1900, B:146:0x19dc, B:148:0x1a1f, B:149:0x1a76, B:155:0x1ab4, B:157:0x1ac7, B:158:0x1b11, B:160:0x1bdc, B:162:0x1bef, B:163:0x1c3c, B:173:0x1d14, B:175:0x1d63, B:176:0x1db5, B:185:0x1e91, B:187:0x1ea4, B:188:0x1ef6, B:196:0x1faf, B:198:0x1ff6, B:199:0x2048, B:223:0x2296, B:225:0x22cf, B:226:0x2321, B:230:0x2366, B:232:0x2376, B:233:0x23bf, B:236:0x23e4, B:238:0x23f7, B:239:0x244d, B:246:0x26b7, B:248:0x26ca, B:249:0x271d, B:258:0x27cd, B:260:0x2813, B:261:0x2862, B:287:0x290a, B:289:0x294e, B:290:0x299e, B:317:0x2a2c, B:319:0x2a73, B:320:0x2ac7, B:323:0x2afc, B:325:0x2b0b, B:326:0x2b55, B:330:0x2c0d, B:332:0x2c59, B:333:0x2cab, B:337:0x2cc2, B:339:0x2cdb, B:340:0x2d27, B:344:0x2deb, B:346:0x2e3b, B:347:0x2e8e, B:350:0x2ea4, B:352:0x2eb3, B:353:0x2efb, B:357:0x2fba, B:359:0x2ff6, B:360:0x304e, B:363:0x3064, B:365:0x3073, B:366:0x30bf, B:370:0x3177, B:372:0x31bd, B:373:0x3212, B:376:0x3228, B:378:0x3237, B:379:0x327c, B:383:0x332f, B:385:0x3384, B:386:0x33da, B:390:0x342b, B:392:0x3455, B:393:0x34ae, B:397:0x357a, B:399:0x35ce, B:400:0x3624, B:404:0x3664, B:406:0x3677, B:407:0x36ca, B:411:0x3780, B:413:0x37d3, B:414:0x3829, B:417:0x383f, B:419:0x384e, B:420:0x3897, B:424:0x3955, B:426:0x39ab, B:427:0x39fd, B:430:0x3a13, B:432:0x3a22, B:433:0x3a6d, B:437:0x3b21, B:439:0x3b63, B:440:0x3bb2, B:443:0x3bc8, B:445:0x3bd7, B:446:0x3c25, B:450:0x3ce5, B:452:0x3d37, B:453:0x3d8d, B:456:0x3da3, B:458:0x3db2, B:459:0x3df9, B:465:0x3eaa, B:467:0x3ef3, B:468:0x3f49, B:470:0x3f5e, B:472:0x3f71, B:473:0x3fba, B:475:0x3fc0, B:477:0x3fee, B:478:0x404d, B:482:0x40c0, B:484:0x4110, B:485:0x4161, B:602:0x131b, B:604:0x1339, B:605:0x138e, B:608:0x142a, B:610:0x1448, B:611:0x1499, B:620:0x0904, B:622:0x0917, B:623:0x096d, B:628:0x0acc, B:630:0x0b2b, B:631:0x0b7d, B:636:0x0a37, B:638:0x0a47, B:639:0x0a8e), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x18b3 A[Catch: all -> 0x4181, TryCatch #1 {all -> 0x4181, blocks: (B:3:0x0004, B:6:0x001f, B:7:0x005c, B:11:0x0128, B:13:0x0156, B:14:0x01a1, B:19:0x01cb, B:21:0x01de, B:22:0x0223, B:25:0x027f, B:27:0x0292, B:28:0x02e3, B:32:0x03a6, B:34:0x03b6, B:35:0x0403, B:37:0x0420, B:39:0x0430, B:40:0x0477, B:42:0x047f, B:44:0x049d, B:45:0x04f3, B:49:0x05a5, B:51:0x05c3, B:52:0x0618, B:56:0x06b3, B:58:0x06d1, B:59:0x0722, B:62:0x07cb, B:64:0x07e9, B:65:0x0843, B:71:0x0efd, B:73:0x0f0d, B:74:0x0f59, B:77:0x0fbf, B:79:0x0fd2, B:80:0x1027, B:84:0x1114, B:86:0x1124, B:87:0x116c, B:89:0x118b, B:91:0x119b, B:92:0x11ea, B:96:0x11ff, B:98:0x121c, B:99:0x1272, B:106:0x1565, B:108:0x1578, B:109:0x15d0, B:121:0x16ad, B:123:0x16f3, B:124:0x174d, B:128:0x1794, B:130:0x17a7, B:131:0x17f2, B:133:0x18a0, B:135:0x18b3, B:136:0x1900, B:146:0x19dc, B:148:0x1a1f, B:149:0x1a76, B:155:0x1ab4, B:157:0x1ac7, B:158:0x1b11, B:160:0x1bdc, B:162:0x1bef, B:163:0x1c3c, B:173:0x1d14, B:175:0x1d63, B:176:0x1db5, B:185:0x1e91, B:187:0x1ea4, B:188:0x1ef6, B:196:0x1faf, B:198:0x1ff6, B:199:0x2048, B:223:0x2296, B:225:0x22cf, B:226:0x2321, B:230:0x2366, B:232:0x2376, B:233:0x23bf, B:236:0x23e4, B:238:0x23f7, B:239:0x244d, B:246:0x26b7, B:248:0x26ca, B:249:0x271d, B:258:0x27cd, B:260:0x2813, B:261:0x2862, B:287:0x290a, B:289:0x294e, B:290:0x299e, B:317:0x2a2c, B:319:0x2a73, B:320:0x2ac7, B:323:0x2afc, B:325:0x2b0b, B:326:0x2b55, B:330:0x2c0d, B:332:0x2c59, B:333:0x2cab, B:337:0x2cc2, B:339:0x2cdb, B:340:0x2d27, B:344:0x2deb, B:346:0x2e3b, B:347:0x2e8e, B:350:0x2ea4, B:352:0x2eb3, B:353:0x2efb, B:357:0x2fba, B:359:0x2ff6, B:360:0x304e, B:363:0x3064, B:365:0x3073, B:366:0x30bf, B:370:0x3177, B:372:0x31bd, B:373:0x3212, B:376:0x3228, B:378:0x3237, B:379:0x327c, B:383:0x332f, B:385:0x3384, B:386:0x33da, B:390:0x342b, B:392:0x3455, B:393:0x34ae, B:397:0x357a, B:399:0x35ce, B:400:0x3624, B:404:0x3664, B:406:0x3677, B:407:0x36ca, B:411:0x3780, B:413:0x37d3, B:414:0x3829, B:417:0x383f, B:419:0x384e, B:420:0x3897, B:424:0x3955, B:426:0x39ab, B:427:0x39fd, B:430:0x3a13, B:432:0x3a22, B:433:0x3a6d, B:437:0x3b21, B:439:0x3b63, B:440:0x3bb2, B:443:0x3bc8, B:445:0x3bd7, B:446:0x3c25, B:450:0x3ce5, B:452:0x3d37, B:453:0x3d8d, B:456:0x3da3, B:458:0x3db2, B:459:0x3df9, B:465:0x3eaa, B:467:0x3ef3, B:468:0x3f49, B:470:0x3f5e, B:472:0x3f71, B:473:0x3fba, B:475:0x3fc0, B:477:0x3fee, B:478:0x404d, B:482:0x40c0, B:484:0x4110, B:485:0x4161, B:602:0x131b, B:604:0x1339, B:605:0x138e, B:608:0x142a, B:610:0x1448, B:611:0x1499, B:620:0x0904, B:622:0x0917, B:623:0x096d, B:628:0x0acc, B:630:0x0b2b, B:631:0x0b7d, B:636:0x0a37, B:638:0x0a47, B:639:0x0a8e), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x19a3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x1a1f A[Catch: all -> 0x4181, TryCatch #1 {all -> 0x4181, blocks: (B:3:0x0004, B:6:0x001f, B:7:0x005c, B:11:0x0128, B:13:0x0156, B:14:0x01a1, B:19:0x01cb, B:21:0x01de, B:22:0x0223, B:25:0x027f, B:27:0x0292, B:28:0x02e3, B:32:0x03a6, B:34:0x03b6, B:35:0x0403, B:37:0x0420, B:39:0x0430, B:40:0x0477, B:42:0x047f, B:44:0x049d, B:45:0x04f3, B:49:0x05a5, B:51:0x05c3, B:52:0x0618, B:56:0x06b3, B:58:0x06d1, B:59:0x0722, B:62:0x07cb, B:64:0x07e9, B:65:0x0843, B:71:0x0efd, B:73:0x0f0d, B:74:0x0f59, B:77:0x0fbf, B:79:0x0fd2, B:80:0x1027, B:84:0x1114, B:86:0x1124, B:87:0x116c, B:89:0x118b, B:91:0x119b, B:92:0x11ea, B:96:0x11ff, B:98:0x121c, B:99:0x1272, B:106:0x1565, B:108:0x1578, B:109:0x15d0, B:121:0x16ad, B:123:0x16f3, B:124:0x174d, B:128:0x1794, B:130:0x17a7, B:131:0x17f2, B:133:0x18a0, B:135:0x18b3, B:136:0x1900, B:146:0x19dc, B:148:0x1a1f, B:149:0x1a76, B:155:0x1ab4, B:157:0x1ac7, B:158:0x1b11, B:160:0x1bdc, B:162:0x1bef, B:163:0x1c3c, B:173:0x1d14, B:175:0x1d63, B:176:0x1db5, B:185:0x1e91, B:187:0x1ea4, B:188:0x1ef6, B:196:0x1faf, B:198:0x1ff6, B:199:0x2048, B:223:0x2296, B:225:0x22cf, B:226:0x2321, B:230:0x2366, B:232:0x2376, B:233:0x23bf, B:236:0x23e4, B:238:0x23f7, B:239:0x244d, B:246:0x26b7, B:248:0x26ca, B:249:0x271d, B:258:0x27cd, B:260:0x2813, B:261:0x2862, B:287:0x290a, B:289:0x294e, B:290:0x299e, B:317:0x2a2c, B:319:0x2a73, B:320:0x2ac7, B:323:0x2afc, B:325:0x2b0b, B:326:0x2b55, B:330:0x2c0d, B:332:0x2c59, B:333:0x2cab, B:337:0x2cc2, B:339:0x2cdb, B:340:0x2d27, B:344:0x2deb, B:346:0x2e3b, B:347:0x2e8e, B:350:0x2ea4, B:352:0x2eb3, B:353:0x2efb, B:357:0x2fba, B:359:0x2ff6, B:360:0x304e, B:363:0x3064, B:365:0x3073, B:366:0x30bf, B:370:0x3177, B:372:0x31bd, B:373:0x3212, B:376:0x3228, B:378:0x3237, B:379:0x327c, B:383:0x332f, B:385:0x3384, B:386:0x33da, B:390:0x342b, B:392:0x3455, B:393:0x34ae, B:397:0x357a, B:399:0x35ce, B:400:0x3624, B:404:0x3664, B:406:0x3677, B:407:0x36ca, B:411:0x3780, B:413:0x37d3, B:414:0x3829, B:417:0x383f, B:419:0x384e, B:420:0x3897, B:424:0x3955, B:426:0x39ab, B:427:0x39fd, B:430:0x3a13, B:432:0x3a22, B:433:0x3a6d, B:437:0x3b21, B:439:0x3b63, B:440:0x3bb2, B:443:0x3bc8, B:445:0x3bd7, B:446:0x3c25, B:450:0x3ce5, B:452:0x3d37, B:453:0x3d8d, B:456:0x3da3, B:458:0x3db2, B:459:0x3df9, B:465:0x3eaa, B:467:0x3ef3, B:468:0x3f49, B:470:0x3f5e, B:472:0x3f71, B:473:0x3fba, B:475:0x3fc0, B:477:0x3fee, B:478:0x404d, B:482:0x40c0, B:484:0x4110, B:485:0x4161, B:602:0x131b, B:604:0x1339, B:605:0x138e, B:608:0x142a, B:610:0x1448, B:611:0x1499, B:620:0x0904, B:622:0x0917, B:623:0x096d, B:628:0x0acc, B:630:0x0b2b, B:631:0x0b7d, B:636:0x0a37, B:638:0x0a47, B:639:0x0a8e), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x1ac7 A[Catch: all -> 0x4181, TryCatch #1 {all -> 0x4181, blocks: (B:3:0x0004, B:6:0x001f, B:7:0x005c, B:11:0x0128, B:13:0x0156, B:14:0x01a1, B:19:0x01cb, B:21:0x01de, B:22:0x0223, B:25:0x027f, B:27:0x0292, B:28:0x02e3, B:32:0x03a6, B:34:0x03b6, B:35:0x0403, B:37:0x0420, B:39:0x0430, B:40:0x0477, B:42:0x047f, B:44:0x049d, B:45:0x04f3, B:49:0x05a5, B:51:0x05c3, B:52:0x0618, B:56:0x06b3, B:58:0x06d1, B:59:0x0722, B:62:0x07cb, B:64:0x07e9, B:65:0x0843, B:71:0x0efd, B:73:0x0f0d, B:74:0x0f59, B:77:0x0fbf, B:79:0x0fd2, B:80:0x1027, B:84:0x1114, B:86:0x1124, B:87:0x116c, B:89:0x118b, B:91:0x119b, B:92:0x11ea, B:96:0x11ff, B:98:0x121c, B:99:0x1272, B:106:0x1565, B:108:0x1578, B:109:0x15d0, B:121:0x16ad, B:123:0x16f3, B:124:0x174d, B:128:0x1794, B:130:0x17a7, B:131:0x17f2, B:133:0x18a0, B:135:0x18b3, B:136:0x1900, B:146:0x19dc, B:148:0x1a1f, B:149:0x1a76, B:155:0x1ab4, B:157:0x1ac7, B:158:0x1b11, B:160:0x1bdc, B:162:0x1bef, B:163:0x1c3c, B:173:0x1d14, B:175:0x1d63, B:176:0x1db5, B:185:0x1e91, B:187:0x1ea4, B:188:0x1ef6, B:196:0x1faf, B:198:0x1ff6, B:199:0x2048, B:223:0x2296, B:225:0x22cf, B:226:0x2321, B:230:0x2366, B:232:0x2376, B:233:0x23bf, B:236:0x23e4, B:238:0x23f7, B:239:0x244d, B:246:0x26b7, B:248:0x26ca, B:249:0x271d, B:258:0x27cd, B:260:0x2813, B:261:0x2862, B:287:0x290a, B:289:0x294e, B:290:0x299e, B:317:0x2a2c, B:319:0x2a73, B:320:0x2ac7, B:323:0x2afc, B:325:0x2b0b, B:326:0x2b55, B:330:0x2c0d, B:332:0x2c59, B:333:0x2cab, B:337:0x2cc2, B:339:0x2cdb, B:340:0x2d27, B:344:0x2deb, B:346:0x2e3b, B:347:0x2e8e, B:350:0x2ea4, B:352:0x2eb3, B:353:0x2efb, B:357:0x2fba, B:359:0x2ff6, B:360:0x304e, B:363:0x3064, B:365:0x3073, B:366:0x30bf, B:370:0x3177, B:372:0x31bd, B:373:0x3212, B:376:0x3228, B:378:0x3237, B:379:0x327c, B:383:0x332f, B:385:0x3384, B:386:0x33da, B:390:0x342b, B:392:0x3455, B:393:0x34ae, B:397:0x357a, B:399:0x35ce, B:400:0x3624, B:404:0x3664, B:406:0x3677, B:407:0x36ca, B:411:0x3780, B:413:0x37d3, B:414:0x3829, B:417:0x383f, B:419:0x384e, B:420:0x3897, B:424:0x3955, B:426:0x39ab, B:427:0x39fd, B:430:0x3a13, B:432:0x3a22, B:433:0x3a6d, B:437:0x3b21, B:439:0x3b63, B:440:0x3bb2, B:443:0x3bc8, B:445:0x3bd7, B:446:0x3c25, B:450:0x3ce5, B:452:0x3d37, B:453:0x3d8d, B:456:0x3da3, B:458:0x3db2, B:459:0x3df9, B:465:0x3eaa, B:467:0x3ef3, B:468:0x3f49, B:470:0x3f5e, B:472:0x3f71, B:473:0x3fba, B:475:0x3fc0, B:477:0x3fee, B:478:0x404d, B:482:0x40c0, B:484:0x4110, B:485:0x4161, B:602:0x131b, B:604:0x1339, B:605:0x138e, B:608:0x142a, B:610:0x1448, B:611:0x1499, B:620:0x0904, B:622:0x0917, B:623:0x096d, B:628:0x0acc, B:630:0x0b2b, B:631:0x0b7d, B:636:0x0a37, B:638:0x0a47, B:639:0x0a8e), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x1bef A[Catch: all -> 0x4181, TryCatch #1 {all -> 0x4181, blocks: (B:3:0x0004, B:6:0x001f, B:7:0x005c, B:11:0x0128, B:13:0x0156, B:14:0x01a1, B:19:0x01cb, B:21:0x01de, B:22:0x0223, B:25:0x027f, B:27:0x0292, B:28:0x02e3, B:32:0x03a6, B:34:0x03b6, B:35:0x0403, B:37:0x0420, B:39:0x0430, B:40:0x0477, B:42:0x047f, B:44:0x049d, B:45:0x04f3, B:49:0x05a5, B:51:0x05c3, B:52:0x0618, B:56:0x06b3, B:58:0x06d1, B:59:0x0722, B:62:0x07cb, B:64:0x07e9, B:65:0x0843, B:71:0x0efd, B:73:0x0f0d, B:74:0x0f59, B:77:0x0fbf, B:79:0x0fd2, B:80:0x1027, B:84:0x1114, B:86:0x1124, B:87:0x116c, B:89:0x118b, B:91:0x119b, B:92:0x11ea, B:96:0x11ff, B:98:0x121c, B:99:0x1272, B:106:0x1565, B:108:0x1578, B:109:0x15d0, B:121:0x16ad, B:123:0x16f3, B:124:0x174d, B:128:0x1794, B:130:0x17a7, B:131:0x17f2, B:133:0x18a0, B:135:0x18b3, B:136:0x1900, B:146:0x19dc, B:148:0x1a1f, B:149:0x1a76, B:155:0x1ab4, B:157:0x1ac7, B:158:0x1b11, B:160:0x1bdc, B:162:0x1bef, B:163:0x1c3c, B:173:0x1d14, B:175:0x1d63, B:176:0x1db5, B:185:0x1e91, B:187:0x1ea4, B:188:0x1ef6, B:196:0x1faf, B:198:0x1ff6, B:199:0x2048, B:223:0x2296, B:225:0x22cf, B:226:0x2321, B:230:0x2366, B:232:0x2376, B:233:0x23bf, B:236:0x23e4, B:238:0x23f7, B:239:0x244d, B:246:0x26b7, B:248:0x26ca, B:249:0x271d, B:258:0x27cd, B:260:0x2813, B:261:0x2862, B:287:0x290a, B:289:0x294e, B:290:0x299e, B:317:0x2a2c, B:319:0x2a73, B:320:0x2ac7, B:323:0x2afc, B:325:0x2b0b, B:326:0x2b55, B:330:0x2c0d, B:332:0x2c59, B:333:0x2cab, B:337:0x2cc2, B:339:0x2cdb, B:340:0x2d27, B:344:0x2deb, B:346:0x2e3b, B:347:0x2e8e, B:350:0x2ea4, B:352:0x2eb3, B:353:0x2efb, B:357:0x2fba, B:359:0x2ff6, B:360:0x304e, B:363:0x3064, B:365:0x3073, B:366:0x30bf, B:370:0x3177, B:372:0x31bd, B:373:0x3212, B:376:0x3228, B:378:0x3237, B:379:0x327c, B:383:0x332f, B:385:0x3384, B:386:0x33da, B:390:0x342b, B:392:0x3455, B:393:0x34ae, B:397:0x357a, B:399:0x35ce, B:400:0x3624, B:404:0x3664, B:406:0x3677, B:407:0x36ca, B:411:0x3780, B:413:0x37d3, B:414:0x3829, B:417:0x383f, B:419:0x384e, B:420:0x3897, B:424:0x3955, B:426:0x39ab, B:427:0x39fd, B:430:0x3a13, B:432:0x3a22, B:433:0x3a6d, B:437:0x3b21, B:439:0x3b63, B:440:0x3bb2, B:443:0x3bc8, B:445:0x3bd7, B:446:0x3c25, B:450:0x3ce5, B:452:0x3d37, B:453:0x3d8d, B:456:0x3da3, B:458:0x3db2, B:459:0x3df9, B:465:0x3eaa, B:467:0x3ef3, B:468:0x3f49, B:470:0x3f5e, B:472:0x3f71, B:473:0x3fba, B:475:0x3fc0, B:477:0x3fee, B:478:0x404d, B:482:0x40c0, B:484:0x4110, B:485:0x4161, B:602:0x131b, B:604:0x1339, B:605:0x138e, B:608:0x142a, B:610:0x1448, B:611:0x1499, B:620:0x0904, B:622:0x0917, B:623:0x096d, B:628:0x0acc, B:630:0x0b2b, B:631:0x0b7d, B:636:0x0a37, B:638:0x0a47, B:639:0x0a8e), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x1cdb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x1d63 A[Catch: all -> 0x4181, TryCatch #1 {all -> 0x4181, blocks: (B:3:0x0004, B:6:0x001f, B:7:0x005c, B:11:0x0128, B:13:0x0156, B:14:0x01a1, B:19:0x01cb, B:21:0x01de, B:22:0x0223, B:25:0x027f, B:27:0x0292, B:28:0x02e3, B:32:0x03a6, B:34:0x03b6, B:35:0x0403, B:37:0x0420, B:39:0x0430, B:40:0x0477, B:42:0x047f, B:44:0x049d, B:45:0x04f3, B:49:0x05a5, B:51:0x05c3, B:52:0x0618, B:56:0x06b3, B:58:0x06d1, B:59:0x0722, B:62:0x07cb, B:64:0x07e9, B:65:0x0843, B:71:0x0efd, B:73:0x0f0d, B:74:0x0f59, B:77:0x0fbf, B:79:0x0fd2, B:80:0x1027, B:84:0x1114, B:86:0x1124, B:87:0x116c, B:89:0x118b, B:91:0x119b, B:92:0x11ea, B:96:0x11ff, B:98:0x121c, B:99:0x1272, B:106:0x1565, B:108:0x1578, B:109:0x15d0, B:121:0x16ad, B:123:0x16f3, B:124:0x174d, B:128:0x1794, B:130:0x17a7, B:131:0x17f2, B:133:0x18a0, B:135:0x18b3, B:136:0x1900, B:146:0x19dc, B:148:0x1a1f, B:149:0x1a76, B:155:0x1ab4, B:157:0x1ac7, B:158:0x1b11, B:160:0x1bdc, B:162:0x1bef, B:163:0x1c3c, B:173:0x1d14, B:175:0x1d63, B:176:0x1db5, B:185:0x1e91, B:187:0x1ea4, B:188:0x1ef6, B:196:0x1faf, B:198:0x1ff6, B:199:0x2048, B:223:0x2296, B:225:0x22cf, B:226:0x2321, B:230:0x2366, B:232:0x2376, B:233:0x23bf, B:236:0x23e4, B:238:0x23f7, B:239:0x244d, B:246:0x26b7, B:248:0x26ca, B:249:0x271d, B:258:0x27cd, B:260:0x2813, B:261:0x2862, B:287:0x290a, B:289:0x294e, B:290:0x299e, B:317:0x2a2c, B:319:0x2a73, B:320:0x2ac7, B:323:0x2afc, B:325:0x2b0b, B:326:0x2b55, B:330:0x2c0d, B:332:0x2c59, B:333:0x2cab, B:337:0x2cc2, B:339:0x2cdb, B:340:0x2d27, B:344:0x2deb, B:346:0x2e3b, B:347:0x2e8e, B:350:0x2ea4, B:352:0x2eb3, B:353:0x2efb, B:357:0x2fba, B:359:0x2ff6, B:360:0x304e, B:363:0x3064, B:365:0x3073, B:366:0x30bf, B:370:0x3177, B:372:0x31bd, B:373:0x3212, B:376:0x3228, B:378:0x3237, B:379:0x327c, B:383:0x332f, B:385:0x3384, B:386:0x33da, B:390:0x342b, B:392:0x3455, B:393:0x34ae, B:397:0x357a, B:399:0x35ce, B:400:0x3624, B:404:0x3664, B:406:0x3677, B:407:0x36ca, B:411:0x3780, B:413:0x37d3, B:414:0x3829, B:417:0x383f, B:419:0x384e, B:420:0x3897, B:424:0x3955, B:426:0x39ab, B:427:0x39fd, B:430:0x3a13, B:432:0x3a22, B:433:0x3a6d, B:437:0x3b21, B:439:0x3b63, B:440:0x3bb2, B:443:0x3bc8, B:445:0x3bd7, B:446:0x3c25, B:450:0x3ce5, B:452:0x3d37, B:453:0x3d8d, B:456:0x3da3, B:458:0x3db2, B:459:0x3df9, B:465:0x3eaa, B:467:0x3ef3, B:468:0x3f49, B:470:0x3f5e, B:472:0x3f71, B:473:0x3fba, B:475:0x3fc0, B:477:0x3fee, B:478:0x404d, B:482:0x40c0, B:484:0x4110, B:485:0x4161, B:602:0x131b, B:604:0x1339, B:605:0x138e, B:608:0x142a, B:610:0x1448, B:611:0x1499, B:620:0x0904, B:622:0x0917, B:623:0x096d, B:628:0x0acc, B:630:0x0b2b, B:631:0x0b7d, B:636:0x0a37, B:638:0x0a47, B:639:0x0a8e), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x1e8f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x1f96  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x205e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x2278  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x2337  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x1f93 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:616:0x1766  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0f0d A[Catch: all -> 0x4181, TryCatch #1 {all -> 0x4181, blocks: (B:3:0x0004, B:6:0x001f, B:7:0x005c, B:11:0x0128, B:13:0x0156, B:14:0x01a1, B:19:0x01cb, B:21:0x01de, B:22:0x0223, B:25:0x027f, B:27:0x0292, B:28:0x02e3, B:32:0x03a6, B:34:0x03b6, B:35:0x0403, B:37:0x0420, B:39:0x0430, B:40:0x0477, B:42:0x047f, B:44:0x049d, B:45:0x04f3, B:49:0x05a5, B:51:0x05c3, B:52:0x0618, B:56:0x06b3, B:58:0x06d1, B:59:0x0722, B:62:0x07cb, B:64:0x07e9, B:65:0x0843, B:71:0x0efd, B:73:0x0f0d, B:74:0x0f59, B:77:0x0fbf, B:79:0x0fd2, B:80:0x1027, B:84:0x1114, B:86:0x1124, B:87:0x116c, B:89:0x118b, B:91:0x119b, B:92:0x11ea, B:96:0x11ff, B:98:0x121c, B:99:0x1272, B:106:0x1565, B:108:0x1578, B:109:0x15d0, B:121:0x16ad, B:123:0x16f3, B:124:0x174d, B:128:0x1794, B:130:0x17a7, B:131:0x17f2, B:133:0x18a0, B:135:0x18b3, B:136:0x1900, B:146:0x19dc, B:148:0x1a1f, B:149:0x1a76, B:155:0x1ab4, B:157:0x1ac7, B:158:0x1b11, B:160:0x1bdc, B:162:0x1bef, B:163:0x1c3c, B:173:0x1d14, B:175:0x1d63, B:176:0x1db5, B:185:0x1e91, B:187:0x1ea4, B:188:0x1ef6, B:196:0x1faf, B:198:0x1ff6, B:199:0x2048, B:223:0x2296, B:225:0x22cf, B:226:0x2321, B:230:0x2366, B:232:0x2376, B:233:0x23bf, B:236:0x23e4, B:238:0x23f7, B:239:0x244d, B:246:0x26b7, B:248:0x26ca, B:249:0x271d, B:258:0x27cd, B:260:0x2813, B:261:0x2862, B:287:0x290a, B:289:0x294e, B:290:0x299e, B:317:0x2a2c, B:319:0x2a73, B:320:0x2ac7, B:323:0x2afc, B:325:0x2b0b, B:326:0x2b55, B:330:0x2c0d, B:332:0x2c59, B:333:0x2cab, B:337:0x2cc2, B:339:0x2cdb, B:340:0x2d27, B:344:0x2deb, B:346:0x2e3b, B:347:0x2e8e, B:350:0x2ea4, B:352:0x2eb3, B:353:0x2efb, B:357:0x2fba, B:359:0x2ff6, B:360:0x304e, B:363:0x3064, B:365:0x3073, B:366:0x30bf, B:370:0x3177, B:372:0x31bd, B:373:0x3212, B:376:0x3228, B:378:0x3237, B:379:0x327c, B:383:0x332f, B:385:0x3384, B:386:0x33da, B:390:0x342b, B:392:0x3455, B:393:0x34ae, B:397:0x357a, B:399:0x35ce, B:400:0x3624, B:404:0x3664, B:406:0x3677, B:407:0x36ca, B:411:0x3780, B:413:0x37d3, B:414:0x3829, B:417:0x383f, B:419:0x384e, B:420:0x3897, B:424:0x3955, B:426:0x39ab, B:427:0x39fd, B:430:0x3a13, B:432:0x3a22, B:433:0x3a6d, B:437:0x3b21, B:439:0x3b63, B:440:0x3bb2, B:443:0x3bc8, B:445:0x3bd7, B:446:0x3c25, B:450:0x3ce5, B:452:0x3d37, B:453:0x3d8d, B:456:0x3da3, B:458:0x3db2, B:459:0x3df9, B:465:0x3eaa, B:467:0x3ef3, B:468:0x3f49, B:470:0x3f5e, B:472:0x3f71, B:473:0x3fba, B:475:0x3fc0, B:477:0x3fee, B:478:0x404d, B:482:0x40c0, B:484:0x4110, B:485:0x4161, B:602:0x131b, B:604:0x1339, B:605:0x138e, B:608:0x142a, B:610:0x1448, B:611:0x1499, B:620:0x0904, B:622:0x0917, B:623:0x096d, B:628:0x0acc, B:630:0x0b2b, B:631:0x0b7d, B:636:0x0a37, B:638:0x0a47, B:639:0x0a8e), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0f62  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] AlternateContactlessPaymentDataJson$4956fc2a(int i, java.lang.Object obj) {
        int i2;
        java.lang.String str;
        java.lang.Object obj2;
        java.lang.Object invoke;
        java.lang.String str2;
        long j;
        java.lang.Object obj3;
        long j2;
        java.lang.Object obj4;
        java.lang.Object obj5;
        long j3;
        java.lang.Object obj6;
        int i3;
        int i4;
        int i5;
        int i6;
        java.lang.Throwable th;
        java.io.BufferedInputStream bufferedInputStream;
        int i7;
        java.lang.Throwable th2;
        java.io.BufferedInputStream bufferedInputStream2;
        java.io.BufferedInputStream bufferedInputStream3;
        long j4;
        long j5;
        java.lang.String str3;
        java.lang.Object[] objArr;
        int i8;
        java.lang.Object obj7;
        int i9;
        java.lang.Object obj8;
        java.lang.String str4;
        java.lang.Object obj9;
        java.lang.String str5;
        int i10;
        char c;
        java.lang.String str6;
        try {
            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
            if (obj10 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 26, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1838, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(r12[14], (byte) (-$$a[16]), 653, objArr2);
                obj10 = cls.getMethod((java.lang.String) objArr2[0], null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, obj10);
            }
            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj10).invoke(null, null)).longValue();
            long j6 = i;
            long j7 = ~j6;
            long j8 = (434 * longValue) + 62558332560L + ((~(j7 | 144810954 | longValue)) * 433) + (((~((~longValue) | j6)) | 144810954) * (-433)) + (((~(144810954 | j6)) | (~(longValue | (-144810955)))) * 433) + 984889900;
            int i11 = ~i;
            int i12 = ~((-1863262270) | i);
            if (((((int) j8) & (((151257105 | i12) * (-814)) + 732708654 + ((i12 | (~((-426035860) | i11)) | (-2138041024)) * 407) + (((~(1863262269 | i)) | (-2138041024) | (~(426035859 | i))) * 407))) | (((int) (j8 >> 32)) & (((((~((-322231879) | i11)) | (~(i | (-1114994533)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 555822082) + (((~(i | (-285247491))) | (~((-1078010145) | i11))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)))) != 0) {
                java.lang.Object[] objArr3 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, null, new int[1]};
                int i13 = 692219365 | i11;
                java.lang.Object[] objArr4 = {1258591913, 16, java.lang.Integer.valueOf((i13 * 495) + 993920926 + (((~i13) | 16778464) * 495))};
                java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj11 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 50, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2713, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    byte b = $$a[14];
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a(b, b2, b2, objArr5);
                    obj11 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj11);
                }
                ((int[]) objArr3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr4)).intValue();
                return objArr3;
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            b("\ue607\ue675献獫\ue36a\ue310嫠嫶\ue6ce玎\ue3f2宱\ue736爦\ue2ab", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr6);
            java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj12 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 40, 1921 - android.graphics.Color.alpha(0), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                a(r13[14], (byte) (-$$a[16]), 653, objArr8);
                obj12 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj12);
            }
            java.lang.Object invoke2 = ((java.lang.reflect.Method) obj12).invoke(null, objArr7);
            if (invoke2 != null) {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                c("뢛㘂酩ｩ\uf8db\uf251", "썷鍅\uf343\udf7a", android.view.ViewConfiguration.getScrollBarSize() >> 8, "䏽氕\uda3e쭫", (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 31475), objArr9);
                java.lang.String intern = ((java.lang.String) objArr9[0]).intern();
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                c("쐢娇褝啃薋娜\ue217孵", "䓦꩒烷ᄨ", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, "䏽氕\uda3e쭫", (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr10);
                java.lang.Object[] objArr11 = {invoke2, new java.lang.String[]{intern, ((java.lang.String) objArr10[0]).intern()}};
                java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                if (obj13 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 2880 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a(r12[14], (byte) (-$$a[16]), 653, objArr12);
                    obj13 = cls4.getMethod((java.lang.String) objArr12[0], java.lang.String.class, java.lang.String[].class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj13);
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj13).invoke(null, objArr11)).longValue();
                long j9 = (((((434 * longValue2) + 593288399664L) + ((~((j7 | 1373352776) | longValue2)) * 433)) + (((~((~longValue2) | j6)) | 1373352776) * (-433))) + (((~(longValue2 | (-1373352777))) | (~(1373352776 | j6))) * 433)) - 655359002;
                if (((((int) (j9 >> 32)) & ((((((~((-289412415) | i11)) | (-1147813997)) | (~(289412414 | i))) * (-564)) - 1664928686) + ((~((-1143619649) | i)) * 1128) + (((~((-1147813997) | i11)) | (-1433032063)) * 564))) | (((int) j9) & ((((-932758169) | i11) * (-757)) + 764813346 + ((~((-562577545) | i)) * 1514) + (((~(504468241 | i11)) | (-1067045786) | (~((-370180625) | i))) * 757)))) != 0) {
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    c("굸ṧ겕\ue922∹炄\uee69털㟵촷ﾏស\uecfe趣엄㟯ࠛᱝꇢ毫癓鹀ꌭ", "괌뾊ᥛ컣", android.text.TextUtils.getTrimmedLength("") + 1539279533, "䏽氕\uda3e쭫", (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr13);
                    java.lang.Object[] objArr14 = {((java.lang.String) objArr13[0]).intern()};
                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj14 == null) {
                        str4 = "";
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str4, str4, 0, 0) + 40, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1921, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        a(r12[14], (byte) (-$$a[16]), 653, objArr15);
                        obj14 = cls5.getMethod((java.lang.String) objArr15[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj14);
                    } else {
                        str4 = "";
                    }
                    java.lang.Object invoke3 = ((java.lang.reflect.Method) obj14).invoke(null, objArr14);
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    b("ᶇ᷵깨긭\ue46b\ue411⩬⩢ᵝ껕\ue4f3⬿Ჴ꽦\ue5e1⯑ᰆ갹\ue653⡿Ὂ게\ue6f2⤓ạ굯\ue791⧋Ḕꨆ\ue05a\u2e70\u197a\uaad8", android.os.Process.myTid() >> 22, objArr16);
                    java.lang.Object[] objArr17 = {((java.lang.String) objArr16[0]).intern()};
                    java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj15 == null) {
                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 40, 1921 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        a(r13[14], (byte) (-$$a[16]), 653, objArr18);
                        obj15 = cls6.getMethod((java.lang.String) objArr18[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj15);
                    }
                    java.lang.Object invoke4 = ((java.lang.reflect.Method) obj15).invoke(null, objArr17);
                    if (invoke3 != null) {
                        java.lang.Object[] objArr19 = {invoke3, 42};
                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                        if (obj16 == null) {
                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2594, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            a(r13[14], (byte) (-$$a[16]), 653, objArr20);
                            obj16 = cls7.getMethod((java.lang.String) objArr20[0], java.lang.String.class, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj16);
                        }
                        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj16).invoke(null, objArr19)).longValue();
                        long j10 = ~(longValue3 | 378288510);
                        str5 = str4;
                        obj9 = invoke3;
                        long j11 = (((-396) * longValue3) - 150558827378L) + (((~(j7 | longValue3)) | (~(j7 | 378288510)) | j10) * (-397)) + ((-397) * j10) + ((j6 | j10 | (~((~longValue3) | (-378288511)))) * 397) + 1635389035;
                        if (((((int) j11) & ((((~((-342021013) | i11)) | 337662336) * (-108)) + 2129755277 + (((~(1095205397 | i)) | 1090846721 | (~((-1095205398) | i11))) * 54) + ((1090846721 | i) * 54))) | (((int) (j11 >> 32)) & (((((~((-1462316441) | i11)) | 67174656) * (-108)) - 1884863912) + (((~(1395424444 | i)) | 282660 | (~((-1395424445) | i11))) * 54) + ((282660 | i) * 54)))) == 477111747) {
                            i2 = i11;
                            if (android.os.Build.VERSION.SDK_INT <= 33) {
                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                b("ႇႨꊆꋉ棚棺缟缂ကꈽ案繐ᆣꏓ椒纽ᄔꃀ檻納ቂꀮ橛籦Ꭸꆕ欤粵ጒꚲ泬笒", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr21);
                                java.lang.Object[] objArr22 = {((java.lang.String) objArr21[0]).intern()};
                                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                if (obj17 == null) {
                                    str = str5;
                                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore(str, 0) + 36, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 3161, (char) (33099 - android.graphics.Color.green(0)));
                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                    a(r9[14], (byte) (-$$a[16]), 653, objArr23);
                                    obj17 = cls8.getMethod((java.lang.String) objArr23[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj17);
                                } else {
                                    str = str5;
                                }
                                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj17).invoke(null, objArr22)).longValue();
                                long j12 = ~((-333067313) | longValue4);
                                long j13 = ((((((-375) * longValue4) + 124900242375L) + ((((~((~longValue4) | 333067312)) | j6) | j12) * 376)) + (((~(j7 | (-333067313))) | j12) * (-376))) + ((longValue4 | (~(333067312 | j6))) * 376)) - 1004600795;
                                int i14 = ~(490285888 | i);
                                if (((((int) j13) & ((((270598208 | i14) * (-196)) - 48697515) + ((i14 | 219687680) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))) | (((int) (j13 >> 32)) & ((((-139689743) | i) * (-50)) + 1506277530 + (((~((-1437368498) | i)) | (~(i2 | (-139547657)))) * 50) + (((~(i2 | (-139689743))) | (~(i2 | (-1576916154))) | 139547656) * 50)))) == 1) {
                                    i10 = 1;
                                    c = 0;
                                    int[] iArr = new int[i10];
                                    int[] iArr2 = new int[i10];
                                    iArr[c] = i;
                                    iArr2[c] = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                    java.lang.Object[] objArr24 = {iArr, iArr2, null, new int[i10]};
                                    java.lang.Object[] objArr25 = {1258591913, 16, java.lang.Integer.valueOf((((~(i2 | (-185074465))) | (~((-268640270) | i)) | (~((-70536323) | i))) * 765) + 41763011 + (((~(i2 | (-453714734))) | 185074464) * 1530) + (((~(i | (-453714734))) | (~(i2 | (-70536323)))) * 765))};
                                    java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj18 == null) {
                                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 50, 2713 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                        byte b3 = $$a[14];
                                        byte b4 = (byte) (b3 - 1);
                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                        a(b3, b4, b4, objArr26);
                                        obj18 = cls9.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj18);
                                    }
                                    ((int[]) objArr24[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj18).invoke(null, objArr25)).intValue();
                                    return objArr24;
                                }
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                b("媛嫺ቂሌ糸糎槎槯婘ድ籽梛", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, objArr27);
                                java.lang.String intern2 = ((java.lang.String) objArr27[0]).intern();
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                b("E$읓윋擂擦姜始\u0083쟦", android.widget.ExpandableListView.getPackedPositionType(0L), objArr28);
                                java.lang.String intern3 = ((java.lang.String) objArr28[0]).intern();
                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                b("\ue1d1\ue1b5\uf50e\uf549\udb94\udbb5ఔఙ\ue11c\uf5ae\udb0c", android.view.KeyEvent.getMaxKeyCode() >> 16, objArr29);
                                java.lang.String intern4 = ((java.lang.String) objArr29[0]).intern();
                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                c("瘔켽嗅參䧁诟\udcc4쥨་", "읶훬碂㛵", android.view.View.combineMeasuredStates(0, 0) - 2099843897, "䏽氕\uda3e쭫", (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr30);
                                java.lang.String intern5 = ((java.lang.String) objArr30[0]).intern();
                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                c("ꚤಝ痻긅뒍꽵", "塲絑純ᒔ", (-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "䏽氕\uda3e쭫", (char) (38012 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr31);
                                java.lang.String intern6 = ((java.lang.String) objArr31[0]).intern();
                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                b("뮉믠\ud9df\ud99b\ue829\ue814퍣퍩묌\ud969\ue8b0툧몬\ud8c2\ue9a3틟먒", 1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr32);
                                java.lang.String intern7 = ((java.lang.String) objArr32[0]).intern();
                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                c("㫙䒦埼媠굫", "迢᭤Ꜯꙟ", 773547151 - android.text.TextUtils.getOffsetAfter(str, 0), "䏽氕\uda3e쭫", (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 24487), objArr33);
                                java.lang.String intern8 = ((java.lang.String) objArr33[0]).intern();
                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                c("웬㜝튀즣줦瞬", "\ue7c3눹⥩헂", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, "䏽氕\uda3e쭫", (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 49706), objArr34);
                                java.lang.String intern9 = ((java.lang.String) objArr34[0]).intern();
                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                c("ꀏᖙ", "ϕL义짘", android.widget.ExpandableListView.getPackedPositionType(0L), "䏽氕\uda3e쭫", (char) (55374 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr35);
                                java.lang.String intern10 = ((java.lang.String) objArr35[0]).intern();
                                java.lang.Object[] objArr36 = new java.lang.Object[1];
                                c("痮佞荑串먀၀鹿庸ᇈ凞옜얺䄳諮喏\uf85c", "惭⻂\ue674⻁", android.view.KeyEvent.normalizeMetaState(0), "䏽氕\uda3e쭫", (char) (49638 - android.graphics.Color.green(0)), objArr36);
                                java.lang.String intern11 = ((java.lang.String) objArr36[0]).intern();
                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                b("уЯᙗᘒ䗄䗷᪅\u1a8fҊᛢ䕜ᮍաᝎ", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr37);
                                java.lang.String intern12 = ((java.lang.String) objArr37[0]).intern();
                                java.lang.Object[] objArr38 = new java.lang.Object[1];
                                b("በሐ궸균볓볨朹朤ኺ괋뱁晴", android.view.View.combineMeasuredStates(0, 0), objArr38);
                                java.lang.String intern13 = ((java.lang.String) objArr38[0]).intern();
                                java.lang.Object[] objArr39 = new java.lang.Object[1];
                                c("쓁틑퓱긏ᕀ㹘ᯖ㰇恭\uda0c킻﮲", "６ⷔ\ue5a7\udc1f", android.graphics.Color.alpha(0), "䏽氕\uda3e쭫", (char) android.view.View.resolveSize(0, 0), objArr39);
                                java.lang.String intern14 = ((java.lang.String) objArr39[0]).intern();
                                java.lang.Object[] objArr40 = new java.lang.Object[1];
                                c("뮜Ṩ阱鏉횱\uef38ꕌ剤䚙攍ộ렑倊듥", "흰运笉妗", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1, "䏽氕\uda3e쭫", (char) (38779 - android.graphics.Color.red(0)), objArr40);
                                java.lang.String intern15 = ((java.lang.String) objArr40[0]).intern();
                                java.lang.Object[] objArr41 = new java.lang.Object[1];
                                b("矀瞲鎃鏌ﰈﰱⱮⱿ眝錿ﲀ", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, objArr41);
                                java.lang.String intern16 = ((java.lang.String) objArr41[0]).intern();
                                java.lang.Object[] objArr42 = new java.lang.Object[1];
                                b("\uf51c\uf56f⥵⤷踙踢骕骜\uf5d9⧆躕", android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1, objArr42);
                                java.lang.String intern17 = ((java.lang.String) objArr42[0]).intern();
                                java.lang.Object[] objArr43 = new java.lang.Object[1];
                                b("苛芨슴싯瑻瑃䧧䧰與숃璴", android.view.ViewConfiguration.getPressedStateDuration() >> 16, objArr43);
                                java.lang.String intern18 = ((java.lang.String) objArr43[0]).intern();
                                java.lang.Object[] objArr44 = new java.lang.Object[1];
                                b("ﰊﱹ믷뮮纶葎", android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr44);
                                java.lang.String intern19 = ((java.lang.String) objArr44[0]).intern();
                                java.lang.Object[] objArr45 = new java.lang.Object[1];
                                b("桙株볇벙碑碤ꓽꓱ梅뱊砚ꖲ楽뷕祪ꕟ槎뺆窶ꛪ檞빨程ꞗ", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, objArr45);
                                java.lang.String intern20 = ((java.lang.String) objArr45[0]).intern();
                                java.lang.Object[] objArr46 = new java.lang.Object[1];
                                c("ᴥ狦ᓊ⚗洏賂", "䫭暄筒ࠕ", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, "䏽氕\uda3e쭫", (char) (5499 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), objArr46);
                                java.lang.String intern21 = ((java.lang.String) objArr46[0]).intern();
                                java.lang.Object[] objArr47 = new java.lang.Object[1];
                                c("䔓귪", "䦍ᅬ盅駋", 1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "䏽氕\uda3e쭫", (char) (52086 - android.text.TextUtils.indexOf(str, str)), objArr47);
                                java.lang.String intern22 = ((java.lang.String) objArr47[0]).intern();
                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                b("轢輑ꇏꆄ瀈瀲꒻꒬达ꅴ炎ꗸ蹀ꂘ營ꔁ軻ꎙ爱ꚾ", android.text.TextUtils.indexOf(str, str), objArr48);
                                java.lang.String intern23 = ((java.lang.String) objArr48[0]).intern();
                                java.lang.Object[] objArr49 = new java.lang.Object[1];
                                b("\ud9dd\ud9a9왌옔\udcba\udc8f鮙鮄\ud910웮\udc27髋\ud8e5", android.view.ViewConfiguration.getPressedStateDuration() >> 16, objArr49);
                                java.lang.String intern24 = ((java.lang.String) objArr49[0]).intern();
                                java.lang.Object[] objArr50 = new java.lang.Object[1];
                                b("뛴뚀굊괒췑췤풆풛똹귨쵌헔럌갆", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr50);
                                java.lang.String intern25 = ((java.lang.String) objArr50[0]).intern();
                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                b("⏊⎾ꔰꕨ큡큔\uf248\uf255⌇ꖐ탲\uf31b⋮ꐯ퇳", 1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr51);
                                java.lang.String intern26 = ((java.lang.String) objArr51[0]).intern();
                                java.lang.Object[] objArr52 = new java.lang.Object[1];
                                c("蝧튮釂ﶟ\ue681瘟䪟㹴츰䪇䘀", "\uf141ꔐ產\uf84a", 581243121 - android.graphics.Color.red(0), "䏽氕\uda3e쭫", (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr52);
                                java.lang.String intern27 = ((java.lang.String) objArr52[0]).intern();
                                java.lang.Object[] objArr53 = new java.lang.Object[1];
                                c("\ue82cっꧣ曮ﶚ솬률疪⛅ꆱ୭‵鰘\udd1d\ueea6", "䥱ꯥ刱懗", 833348937 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "䏽氕\uda3e쭫", (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 55122), objArr53);
                                java.lang.String intern28 = ((java.lang.String) objArr53[0]).intern();
                                java.lang.Object[] objArr54 = new java.lang.Object[1];
                                b("햸헍겲곶늿늜闉闞핾간눜钜풑궥덹鑨퐬껣", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, objArr54);
                                java.lang.String[] strArr = {intern2, intern3, intern4, intern5, intern6, intern7, intern8, intern9, intern10, intern11, intern12, intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, ((java.lang.String) objArr54[0]).intern()};
                                java.lang.Object[] objArr55 = new java.lang.Object[1];
                                b("\ue607\ue675献獫\ue36a\ue310嫠嫶\ue6ce玎\ue3f2宱\ue736爦\ue2ab", android.view.View.MeasureSpec.getSize(0), objArr55);
                                java.lang.Object[] objArr56 = {((java.lang.String) objArr55[0]).intern()};
                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj2 == null) {
                                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1921, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1));
                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                    a(r11[14], (byte) (-$$a[16]), 653, objArr57);
                                    obj2 = cls10.getMethod((java.lang.String) objArr57[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj2);
                                }
                                invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr56);
                                if (invoke != null) {
                                    getProfileVersion = (RecordsJson + 111) % 128;
                                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                                    c("뢛㘂酩ｩ\uf8db\uf251", "썷鍅\uf343\udf7a", 1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), "䏽氕\uda3e쭫", (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 31476), objArr58);
                                    java.lang.String intern29 = ((java.lang.String) objArr58[0]).intern();
                                    java.lang.Object[] objArr59 = new java.lang.Object[1];
                                    c("쐢娇褝啃薋娜\ue217孵", "䓦꩒烷ᄨ", '0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "䏽氕\uda3e쭫", (char) android.view.View.combineMeasuredStates(0, 0), objArr59);
                                    java.lang.Object[] objArr60 = {invoke, new java.lang.String[]{intern29, ((java.lang.String) objArr59[0]).intern()}};
                                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                    if (obj19 == null) {
                                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 42, android.graphics.Color.blue(0) + 2880, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                        java.lang.Object[] objArr61 = new java.lang.Object[1];
                                        a(r11[14], (byte) (-$$a[16]), 653, objArr61);
                                        obj19 = cls11.getMethod((java.lang.String) objArr61[0], java.lang.String.class, java.lang.String[].class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj19);
                                    }
                                    long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr60)).longValue();
                                    long j14 = ~longValue5;
                                    long j15 = j7 | (-1144037457);
                                    java.lang.String str7 = str;
                                    j = j6;
                                    long j16 = ((((((-903) * longValue5) - 1035353898585L) + (((~(j6 | 1144037456)) | (~(j7 | longValue5))) * (-1808))) + (((~((1144037456 | j14) | j)) | (~(j15 | longValue5))) * 904)) + ((((~(longValue5 | 1144037456)) | (~(j14 | j))) | (~j15)) * 904)) - 884674322;
                                    if (((((int) j16) & ((((((~(806207110 | i)) | (-899530664)) | (~(i2 | (-537695747)))) * 886) - 1576999841) + (((~(i2 | (-806207111))) | (-631019300)) * (-1772)) + ((~(i2 | (-631019300))) * 886))) | (((int) (j16 >> 32)) & ((((((~(1780392064 | i)) | 2165076) | (~((-1077348821) | i))) * (-754)) - 376402158) + (((~((-2165077) | i)) | (~(i2 | (-1075183745)))) * (-754)) + ((i2 | 1780392064) * 754)))) != 0) {
                                        getProfileVersion = (RecordsJson + 9) % 128;
                                        java.lang.Object[] objArr62 = new java.lang.Object[1];
                                        c("굸ṧ겕\ue922∹炄\uee69털㟵촷ﾏស\uecfe趣엄㟯ࠛᱝꇢ毫癓鹀ꌭ", "괌뾊ᥛ컣", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1539279533, "䏽氕\uda3e쭫", (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr62);
                                        java.lang.Object[] objArr63 = {((java.lang.String) objArr62[0]).intern()};
                                        java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj20 == null) {
                                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 40, 1921 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) android.view.View.resolveSize(0, 0));
                                            java.lang.Object[] objArr64 = new java.lang.Object[1];
                                            a(r8[14], (byte) (-$$a[16]), 653, objArr64);
                                            obj20 = cls12.getMethod((java.lang.String) objArr64[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj20);
                                        }
                                        java.lang.Object invoke5 = ((java.lang.reflect.Method) obj20).invoke(null, objArr63);
                                        java.lang.Object[] objArr65 = new java.lang.Object[1];
                                        b("ᶇ᷵깨긭\ue46b\ue411⩬⩢ᵝ껕\ue4f3⬿Ჴ꽦\ue5e1⯑ᰆ갹\ue653⡿Ὂ게\ue6f2⤓ạ굯\ue791⧋Ḕꨆ\ue05a\u2e70\u197a\uaad8", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr65);
                                        java.lang.Object[] objArr66 = {((java.lang.String) objArr65[0]).intern()};
                                        java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj21 == null) {
                                            str2 = str7;
                                            java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 40, android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1922, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                                            java.lang.Object[] objArr67 = new java.lang.Object[1];
                                            a(r11[14], (byte) (-$$a[16]), 653, objArr67);
                                            obj21 = cls13.getMethod((java.lang.String) objArr67[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj21);
                                        } else {
                                            str2 = str7;
                                        }
                                        java.lang.Object invoke6 = ((java.lang.reflect.Method) obj21).invoke(null, objArr66);
                                        if (invoke5 != null) {
                                            int i15 = getProfileVersion + 19;
                                            RecordsJson = i15 % 128;
                                            if (i15 % 2 == 0) {
                                                java.lang.Object[] objArr68 = {invoke5, 61};
                                                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                if (obj22 == null) {
                                                    java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28, 2594 - android.text.TextUtils.getCapsMode(str2, 0, 0), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                    java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                    a(r8[14], (byte) (-$$a[16]), 653, objArr69);
                                                    obj22 = cls14.getMethod((java.lang.String) objArr69[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj22);
                                                }
                                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr68)).longValue();
                                                long j17 = ~longValue6;
                                                long j18 = ((-661) * longValue6) + 175083710881L + ((j7 | (~(j17 | 264877020))) * 1324) + (((~(j | (-264877021))) | (~(longValue6 | j))) * (-1324)) + (((~(longValue6 | 264877020)) | (~((-264877021) | j17))) * 662) + 1521977545;
                                                if (((((int) j18) & ((((~(i2 | (-70792212))) | (-1508018622)) * (-602)) + 1102248928 + (((~((-70792212) | i)) | 68695042 | (~(i2 | (-1505921453)))) * (-301)) + ((~(i2 | (-1508018622))) * 301))) | (((int) (j18 << 4)) & ((((~((-1178014430) | i)) | 35717256) * (-140)) + 677122958 + ((~((-1142297174) | i)) * 70) + (((~((-1679726456) | i)) | 573146538) * 70)))) != 477111747) {
                                                }
                                                int i16 = 0;
                                                for (int i17 = 0; i17 < 28; i17++) {
                                                    java.lang.String str8 = strArr[i17];
                                                    java.lang.Object[] objArr70 = new java.lang.Object[1];
                                                    c("递㼖鼵⨖攮绋邫㜎骀\uf8ae왯긙", "\udbed뜉籷숽", android.view.ViewConfiguration.getEdgeSlop() >> 16, "䏽氕\uda3e쭫", (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr70);
                                                    java.lang.Object[] objArr71 = {((java.lang.String) objArr70[0]).intern().concat(java.lang.String.valueOf(str8))};
                                                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                                    if (obj23 == null) {
                                                        java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 3161 - android.view.View.MeasureSpec.getSize(0), (char) (android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 33100));
                                                        byte[] bArr = $$a;
                                                        java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                        a((byte) (bArr[14] - 1), (byte) (-bArr[16]), (short) ($$b - 1), objArr72);
                                                        obj23 = cls15.getMethod((java.lang.String) objArr72[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj23);
                                                    }
                                                    long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj23).invoke(null, objArr71)).longValue();
                                                    long j19 = ~((~longValue7) | (-67015308));
                                                    long j20 = (((-107) * longValue7) - 3685841940L) + (((~(longValue7 | 67015307)) | (~(j7 | longValue7))) * (-108)) + (((~(j | 67015307)) | j19 | (~(j7 | (-67015308)))) * 54) + ((j | j19) * 54) + 974486046;
                                                    i16 += ((((int) j20) & (((((i2 | (-301099)) * (-369)) + 802172634) + (((~(i2 | 268811646)) | (-1168414764)) * (-369))) + ((((~((-268811647) | i)) | 268510548) | (~(i2 | (-1168113666)))) * 369))) | (((int) (j20 >> 32)) & (((((295981122 | i) * 614) + 1615205366) + ((((~(i2 | (-841171703))) | 270549058) | (~(i2 | 596054708))) * (-1228))) + (((~(i2 | (-570622645))) | (~(i2 | 866603766))) * 614)))) == 0 ? 0 : 1;
                                                }
                                                if (i16 >= 25.2d) {
                                                    java.lang.Object[] objArr73 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, null, new int[1]};
                                                    java.lang.Object[] objArr74 = {1258591913, 16, java.lang.Integer.valueOf(((((i | (-562434691)) * (-381)) + 2000292430) + (((~(i2 | 142172221)) | (-699888304)) * 381)) - 460747910)};
                                                    java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj24 == null) {
                                                        java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 50, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2713, (char) (android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                                        byte b5 = $$a[14];
                                                        byte b6 = (byte) (b5 - 1);
                                                        java.lang.Object[] objArr75 = new java.lang.Object[1];
                                                        a(b5, b6, b6, objArr75);
                                                        obj24 = cls16.getMethod((java.lang.String) objArr75[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj24);
                                                    }
                                                    ((int[]) objArr73[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr74)).intValue();
                                                    return objArr73;
                                                }
                                            } else {
                                                java.lang.Object[] objArr76 = {invoke5, 42};
                                                java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                if (obj25 == null) {
                                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.view.View.getDefaultSize(0, 0) + 2594, (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                                                    java.lang.Object[] objArr77 = new java.lang.Object[1];
                                                    a(r10[14], (byte) (-$$a[16]), 653, objArr77);
                                                    obj25 = cls17.getMethod((java.lang.String) objArr77[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj25);
                                                }
                                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr76)).longValue();
                                                long j21 = ~longValue8;
                                                long j22 = ((-163) * longValue8) + 171926616840L + (((~(j7 | longValue8)) | 1041979496) * (-328)) + ((j | 1041979496) * 164) + (((~(j21 | j)) | (~((-1041979497) | j21)) | (~(j7 | 1041979496 | longValue8))) * 164) + 215121028;
                                            }
                                        }
                                        if (invoke6 != null) {
                                            java.lang.Object[] objArr78 = {invoke6, 42};
                                            java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                            if (obj26 == null) {
                                                java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2593 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) android.text.TextUtils.indexOf(str2, str2, 0));
                                                java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                a(r8[14], (byte) (-$$a[16]), 653, objArr79);
                                                obj26 = cls18.getMethod((java.lang.String) objArr79[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj26);
                                            }
                                            long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr78)).longValue();
                                            long j23 = ~longValue9;
                                            long j24 = ~(j23 | 13940285 | j);
                                            long j25 = ((-475) * longValue9) + 6649515945L + (((~(longValue9 | (-13940286))) | j24) * (-476)) + (j24 * 952) + ((~(j23 | j7 | 13940285)) * 476) + 1243160239;
                                        }
                                    } else {
                                        str2 = str7;
                                    }
                                } else {
                                    str2 = str;
                                    j = j6;
                                }
                                java.lang.Object[] objArr80 = new java.lang.Object[1];
                                c("敔圣燪\uf6cf蔾ᅷ㶓\ue1b6ቅ쌃腡궱낓㓀\uf05b❱◹\uf252ٮ乥Ⴥ澱曡", "\uec6f傃贀䰿", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 5276652, "䏽氕\uda3e쭫", (char) android.view.KeyEvent.getDeadChar(0, 0), objArr80);
                                java.lang.Object[] objArr81 = {((java.lang.String) objArr80[0]).intern()};
                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj3 == null) {
                                    java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 29, 2807 - android.view.View.MeasureSpec.getMode(0), (char) android.view.View.MeasureSpec.getMode(0));
                                    java.lang.Object[] objArr82 = new java.lang.Object[1];
                                    a(r8[14], (byte) (-$$a[16]), 653, objArr82);
                                    obj3 = cls19.getMethod((java.lang.String) objArr82[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj3);
                                }
                                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr81)).longValue();
                                long j26 = ~longValue10;
                                long j27 = j7 | 260380689;
                                long j28 = ((-885) * longValue10) + 461654961597L + (((~(j26 | (-260380690))) | (~(j26 | j)) | (~(j27 | longValue10))) * 886) + (((~(j7 | longValue10)) | 260380689) * (-1772)) + ((~j27) * 886) + 1030159378;
                                j2 = (((int) j28) & ((((((~(i2 | (-379343301))) | (~(1816569710 | i))) * (-370)) - 635053777) + ((((~((-379343301) | i)) | (~(i2 | 1816569710))) | 1749198378) * (-370))) - 1336661836)) | (((int) (j28 >> 32)) & (((((~(31126468 | i)) | 1443170347) * 1504) - 1320242614) + ((~(1474296815 | i)) * (-1504)) + 1187751616));
                                java.lang.Object[] objArr83 = new java.lang.Object[1];
                                b("\u0bd9௶\ue1f5\ue1af\udbde\udbf8ꂟꂎ\u0b12\ue108\udb51ꇜ\u0ae5\ue0e9\uda55ꄢ\u0a55\ue3b6\ud9e6ꊜऊ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr83);
                                java.lang.Object[] objArr84 = {((java.lang.String) objArr83[0]).intern()};
                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj4 == null) {
                                    java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore(str2, 0) + 29, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2807, (char) android.text.TextUtils.getOffsetAfter(str2, 0));
                                    java.lang.Object[] objArr85 = new java.lang.Object[1];
                                    a(r11[14], (byte) (-$$a[16]), 653, objArr85);
                                    obj4 = cls20.getMethod((java.lang.String) objArr85[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj4);
                                }
                                long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr84)).longValue();
                                long j29 = ~longValue11;
                                long j30 = ((-67) * longValue11) + 51712428465L + (((~(j29 | (-749455486) | j7)) | (~(longValue11 | 749455485)) | (~(longValue11 | j))) * (-68)) + ((~(longValue11 | j7 | (-749455486))) * (-68)) + (((~(j29 | j7)) | (-749455486)) * 68) + 541084582;
                                long j31 = (((int) j30) & (((i2 | (-219676707)) * (-490)) + 328663819 + (((~(1925635548 | i)) | (-2145312255)) * 490) + 1197690466)) | (((int) (j30 >> 32)) & ((((~(i2 | (-369819820))) | (-1067406592) | (~(1041186991 | i))) * (-68)) + 516864474 + ((~(i2 | (-26219601))) * (-68)) + (((~(i2 | (-1041186992))) | (-396039420)) * 68)));
                                if (j2 > 0 && j31 > 0) {
                                    i9 = getProfileVersion + 15;
                                    RecordsJson = i9 % 128;
                                    if (i9 % 2 == 0 ? j31 - 3 < j2 : (j31 & 3) < j2) {
                                        java.lang.Object[] objArr86 = {new int[]{i}, new int[]{i ^ 247}, null, new int[1]};
                                        java.lang.Object[] objArr87 = {1258591913, 16, java.lang.Integer.valueOf((((~(i | (-36700815))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) - 1991822168) + (((~(i2 | (-36700815))) | 537298977) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                                        obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj8 == null) {
                                            java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 50, (-16774503) - android.graphics.Color.rgb(0, 0, 0), (char) ((-1) - android.os.Process.getGidForName(str2)));
                                            byte b7 = $$a[14];
                                            byte b8 = (byte) (b7 - 1);
                                            java.lang.Object[] objArr88 = new java.lang.Object[1];
                                            a(b7, b8, b8, objArr88);
                                            obj8 = cls21.getMethod((java.lang.String) objArr88[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                                        }
                                        ((int[]) objArr86[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr87)).intValue();
                                        return objArr86;
                                    }
                                }
                                java.lang.Object[] objArr89 = new java.lang.Object[1];
                                c("敔圣燪\uf6cf蔾ᅷ㶓\ue1b6ቅ쌃腡궱낓㓀\uf05b❱◹\uf252ٮ乥Ⴥ澱曡", "\uec6f傃贀䰿", 5276652 - android.text.TextUtils.indexOf(str2, str2), "䏽氕\uda3e쭫", (char) android.view.View.MeasureSpec.getMode(0), objArr89);
                                java.lang.Object[] objArr90 = {((java.lang.String) objArr89[0]).intern()};
                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj5 == null) {
                                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.os.Process.myPid() >> 22), 2807 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                    java.lang.Object[] objArr91 = new java.lang.Object[1];
                                    a(r8[14], (byte) (-$$a[16]), 653, objArr91);
                                    obj5 = cls22.getMethod((java.lang.String) objArr91[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj5);
                                }
                                long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr90)).longValue();
                                long j32 = ~longValue12;
                                long j33 = ((407 * longValue12) - 66879231930L) + (((~(j32 | j)) | (~(j7 | 165133906 | longValue12))) * (-406)) + ((~(j32 | j7 | 165133906)) * (-406)) + (((~(j | (-165133907))) | (~(j7 | longValue12))) * 406) + 1125406161;
                                int i18 = ~(i2 | (-617138561));
                                j3 = (((int) j33) & ((((~((-1745880579) | i)) | 308654168) * (-756)) + 1307848465 + ((i2 | (-1745880579)) * 756))) | (((int) (j33 >> 32)) & ((((~(i2 | (-2054364972))) | 1513297451 | (~(i2 | 617138560)) | (~((-76071041) | i))) * (-84)) + 1905160562 + (((~(617138560 | i)) | 2054364971 | i18) * (-84)) + ((i18 | 76071040) * 84)));
                                java.lang.Object[] objArr92 = new java.lang.Object[1];
                                c("锶㗗罾ꚶ", "嚴\ue553㟲鱊", android.view.KeyEvent.getMaxKeyCode() >> 16, "䏽氕\uda3e쭫", (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 18999), objArr92);
                                java.lang.Object[] objArr93 = {((java.lang.String) objArr92[0]).intern()};
                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj6 == null) {
                                    java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 29, android.text.TextUtils.indexOf(str2, str2) + 2807, (char) android.view.View.MeasureSpec.getSize(0));
                                    java.lang.Object[] objArr94 = new java.lang.Object[1];
                                    a(r11[14], (byte) (-$$a[16]), 653, objArr94);
                                    obj6 = cls23.getMethod((java.lang.String) objArr94[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj6);
                                }
                                long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr93)).longValue();
                                long j34 = ~longValue13;
                                long j35 = (~(j34 | j7)) | (~(j34 | 1209356369)) | (~(j7 | 1209356369));
                                long j36 = ((591 * longValue13) - 712310901341L) + (((~(longValue13 | (-1209356370) | j)) | j35) * 590) + (j35 * (-1180)) + (((~(j7 | longValue13)) | (~(j7 | (-1209356370)))) * 590) + 81183698;
                                long j37 = (((int) (j36 >> 32)) & ((((~(i2 | (-354942977))) * 130) - 700886102) + (((~((-354942977) | i)) | 1082147072) * 130))) | (((int) j36) & ((((((~(1499207981 | i)) | 44155522) | (~(i2 | (-1481381933)))) * 886) - 2121654707) + (((~(i2 | (-1499207982))) | 61981571) * (-1772)) + ((~(i2 | 61981571)) * 886)));
                                if (j3 > 0 && j37 > 0) {
                                    i8 = getProfileVersion + 41;
                                    RecordsJson = i8 % 128;
                                    if (i8 % 2 == 0 ? j37 + 100 < j3 : j37 * 100 < j3) {
                                        java.lang.Object[] objArr95 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                                        java.lang.Object[] objArr96 = {1258591913, 16, java.lang.Integer.valueOf(((((~((-387380863) | i)) | (-389480064)) * (-502)) - 801437939) + ((~(i2 | (-67535407))) * (-502)) + (((~(i | (-321944658))) | (-387380863)) * 502))};
                                        obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj7 == null) {
                                            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 50, 2713 - android.text.TextUtils.indexOf(str2, str2, 0), (char) android.text.TextUtils.indexOf(str2, str2, 0, 0));
                                            byte b9 = $$a[14];
                                            byte b10 = (byte) (b9 - 1);
                                            java.lang.Object[] objArr97 = new java.lang.Object[1];
                                            a(b9, b10, b10, objArr97);
                                            obj7 = cls24.getMethod((java.lang.String) objArr97[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                        }
                                        ((int[]) objArr95[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr96)).intValue();
                                        return objArr95;
                                    }
                                }
                                java.lang.Object[] objArr98 = new java.lang.Object[1];
                                c("ퟂὊ䃪⥗ᛚ\ue3bd䛖", "뒟ᠦ諍။", 9956 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "䏽氕\uda3e쭫", (char) android.view.KeyEvent.keyCodeFromString(str2), objArr98);
                                java.lang.String intern30 = ((java.lang.String) objArr98[0]).intern();
                                java.lang.Object[] objArr99 = new java.lang.Object[1];
                                c("챯楘桐\uf610喯趤뒡蹑㩶ﵱ橩", "韇Ǝ뵩\ueff3", android.view.View.MeasureSpec.getSize(0) + 1761709719, "䏽氕\uda3e쭫", (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr99);
                                java.lang.String intern31 = ((java.lang.String) objArr99[0]).intern();
                                java.lang.Object[] objArr100 = new java.lang.Object[1];
                                b("嘒嘽⚴⛭㈔㈹眞眓囎☃㊅瘗圱➬㏙皾", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr100);
                                java.lang.String intern32 = ((java.lang.String) objArr100[0]).intern();
                                java.lang.Object[] objArr101 = new java.lang.Object[1];
                                b("\u0cbbಔ₅⃜쨺쨗礼礱౧′쪫砵ඓ↝쯷碜", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr101);
                                java.lang.String intern33 = ((java.lang.String) objArr101[0]).intern();
                                java.lang.Object[] objArr102 = new java.lang.Object[1];
                                b("띏띠ỻầ讝讬駊駚랃Ṇ謓飃뙽Ῠ詗", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr102);
                                java.lang.String intern34 = ((java.lang.String) objArr102[0]).intern();
                                java.lang.Object[] objArr103 = new java.lang.Object[1];
                                b("떊떥멲먫疵疃ឥឲ때", android.view.View.resolveSize(0, 0), objArr103);
                                java.lang.String intern35 = ((java.lang.String) objArr103[0]).intern();
                                java.lang.Object[] objArr104 = new java.lang.Object[1];
                                b("鐌鐣뫝몒軳軓㤿㤢", android.view.ViewConfiguration.getTouchSlop() >> 8, objArr104);
                                java.lang.String[] strArr2 = {intern30, intern31, intern32, intern33, intern34, intern35, ((java.lang.String) objArr104[0]).intern()};
                                i3 = 0;
                                while (true) {
                                    if (i3 >= 7) {
                                        i4 = 0;
                                        break;
                                    }
                                    java.lang.Object[] objArr105 = {strArr2[i3]};
                                    java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                                    if (obj27 == null) {
                                        java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1671, (char) (47940 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)));
                                        java.lang.Object[] objArr106 = new java.lang.Object[1];
                                        a(r11[14], (byte) (-$$a[16]), 653, objArr106);
                                        obj27 = cls25.getMethod((java.lang.String) objArr106[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj27);
                                    }
                                    long j38 = ~((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr105)).longValue();
                                    long j39 = ((((r8 * 965) - 322192706959L) + (((~(j38 | j)) | (-334571866)) * (-964))) + (((~(j38 | j7)) | (~(j38 | 334571865))) * (-964))) - 1960102047;
                                    if (((((int) j39) & ((((-150995337) | i) * (-676)) + 1393435097 + (((~(i2 | 1357898855)) | 150995336) * 676) + (((~(i2 | (-1499842031))) | 1348846694 | (~(1508894191 | i))) * 676))) | (((int) (j39 >> 32)) & ((((~(i2 | 759743906)) | (~(2097996978 | i))) * (-370)) + 635053406 + (((~(759743906 | i)) | (~(i2 | 2097996978)) | 755549346) * (-370)) + 380383780))) != 0) {
                                        i4 = i3 + 90;
                                        break;
                                    }
                                    i3++;
                                }
                                if (i4 != 0) {
                                    java.lang.Object[] objArr107 = {new int[]{i}, new int[]{i4 ^ i}, null, new int[1]};
                                    java.lang.Object[] objArr108 = {1258591913, 16, java.lang.Integer.valueOf(((((~(i | (-613862300))) | 556166319) * 398) - 31342645) + (((~(i2 | (-613862300))) | 556166319) * 398))};
                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj28 == null) {
                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2712 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                        byte b11 = $$a[14];
                                        byte b12 = (byte) (b11 - 1);
                                        java.lang.Object[] objArr109 = new java.lang.Object[1];
                                        a(b11, b12, b12, objArr109);
                                        obj28 = cls26.getMethod((java.lang.String) objArr109[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj28);
                                    }
                                    ((int[]) objArr107[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr108)).intValue();
                                    return objArr107;
                                }
                                try {
                                    java.lang.Object[] objArr110 = new java.lang.Object[1];
                                    c("\ua7ea섗\uf85f⳯핣淄\uf77a\uec8aò豑ｂ鳭楓", "럍㉜Ꞻ绣", (-1171104586) - android.graphics.ImageFormat.getBitsPerPixel(0), "䏽氕\uda3e쭫", (char) (58327 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr110);
                                    try {
                                        java.lang.Object[] objArr111 = {((java.lang.String) objArr110[0]).intern()};
                                        java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj29 == null) {
                                            java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39, 1920 - android.view.MotionEvent.axisFromString(str2), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                                            java.lang.Object[] objArr112 = new java.lang.Object[1];
                                            a(r8[14], (byte) (-$$a[16]), 653, objArr112);
                                            obj29 = cls27.getMethod((java.lang.String) objArr112[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj29);
                                        }
                                        str3 = (java.lang.String) ((java.lang.reflect.Method) obj29).invoke(null, objArr111);
                                    } catch (java.lang.Throwable th3) {
                                        java.lang.Throwable cause = th3.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th3;
                                    }
                                } catch (java.lang.Exception unused) {
                                }
                                try {
                                    if (str3 != null) {
                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                        b("蝣蜀꺷껤\u18f6ᣃ\uf8c1\uf8d1螤긂ᡯ黎虞꾢ᤶ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr113);
                                        java.lang.String[] strArr3 = {((java.lang.String) objArr113[0]).intern()};
                                        for (int i19 = 0; i19 <= 0; i19++) {
                                            if (str3.contains(strArr3[i19])) {
                                                RecordsJson = (getProfileVersion + 65) % 128;
                                            }
                                        }
                                        i5 = 0;
                                        if (i5 != 0) {
                                            java.lang.Object[] objArr114 = {new int[]{i}, new int[]{i ^ i5}, null, new int[1]};
                                            int i20 = i2 | 941248012;
                                            java.lang.Object[] objArr115 = {1258591913, 16, java.lang.Integer.valueOf((i20 * 495) + 1254602942 + (((~i20) | 805831680) * 495))};
                                            java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj30 == null) {
                                                java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 2713 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                                byte b13 = $$a[14];
                                                byte b14 = (byte) (b13 - 1);
                                                java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                a(b13, b14, b14, objArr116);
                                                obj30 = cls28.getMethod((java.lang.String) objArr116[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj30);
                                            }
                                            ((int[]) objArr114[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr115)).intValue();
                                            return objArr114;
                                        }
                                        java.lang.Object[] objArr117 = new java.lang.Object[1];
                                        c("\ua7ea섗\uf85f⳯핣淄\uf77a\uec8aò豑ｂ鳭楓", "럍㉜Ꞻ绣", android.view.View.MeasureSpec.getMode(0) - 1171104585, "䏽氕\uda3e쭫", (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 58279), objArr117);
                                        java.lang.Object[] objArr118 = {((java.lang.String) objArr117[0]).intern()};
                                        java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj31 == null) {
                                            java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 40, android.widget.ExpandableListView.getPackedPositionChild(0L) + 1922, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                                            a(r8[14], (byte) (-$$a[16]), 653, objArr119);
                                            obj31 = cls29.getMethod((java.lang.String) objArr119[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj31);
                                        }
                                        java.lang.Object invoke7 = ((java.lang.reflect.Method) obj31).invoke(null, objArr118);
                                        if (invoke7 != null) {
                                            java.lang.Object[] objArr120 = new java.lang.Object[1];
                                            b("蝣蜀꺷껤\u18f6ᣃ\uf8c1\uf8d1螤긂ᡯ黎虞꾢ᤶ", android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1, objArr120);
                                            java.lang.Object[] objArr121 = {invoke7, new java.lang.String[]{((java.lang.String) objArr120[0]).intern()}};
                                            java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                            if (obj32 == null) {
                                                java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 42, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2880, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                                                java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                a(r8[14], (byte) (-$$a[16]), 653, objArr122);
                                                obj32 = cls30.getMethod((java.lang.String) objArr122[0], java.lang.String.class, java.lang.String[].class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj32);
                                            }
                                            long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj32).invoke(null, objArr121)).longValue();
                                            long j40 = ~longValue14;
                                            long j41 = j40 | 895804213;
                                            long j42 = ((((((-167) * longValue14) + 149599303738L) + (((~j41) | (~(j40 | j7))) * 168)) + ((~(j41 | j)) * 168)) + ((((~(j7 | 895804213)) | (~(895804213 | longValue14))) | (~(((-895804214) | j40) | j))) * 168)) - 1132907565;
                                            int i21 = ~(i2 | (-479692771));
                                            int i22 = ~(i2 | 507123472);
                                            if (((((int) j42) & ((((-2147385275) | i22) * (-712)) + 1165434301 + (((~(i2 | 2147385274)) | (~((-1640261803) | i))) * (-712)) + ((i22 | 1944349882) * 712))) | (((int) (j42 >> 32)) & (((((553666568 | i21) | (~(479692770 | i))) * (-338)) - 402034630) + ((i21 | (~(1033359338 | i))) * 338)))) != 1) {
                                                java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                b("春昊峺岴뤺뤏鍖鍜曬將릪鈟朖巡룲銷", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr123);
                                                java.lang.String intern36 = ((java.lang.String) objArr123[0]).intern();
                                                java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                b("栤栋˃ʍ筺筏依侗棭Ⱦ篪仔椗Ϙ窲乼榾\u0088祘䷄", android.widget.ExpandableListView.getPackedPositionChild(0L) + 1, objArr124);
                                                java.lang.String intern37 = ((java.lang.String) objArr124[0]).intern();
                                                java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                b("⬸⬗\uf5c0\uf58e쭩쭜ꭿꭵ⯱\uf53d쯹ꨶ⨋\uf4db쪡ꪞ⪸\uf780쥌ꥧ⦷", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, objArr125);
                                                java.lang.String intern38 = ((java.lang.String) objArr125[0]).intern();
                                                java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                b("诠诏侗俎奙奯ꖚꖍ謦佪", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, objArr126);
                                                java.lang.String intern39 = ((java.lang.String) objArr126[0]).intern();
                                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                c("递㼖鼵⨖攮绋邫㜎骀\uf8ae왯긙", "\udbed뜉籷숽", 1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "䏽氕\uda3e쭫", (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr127);
                                                java.lang.String intern40 = ((java.lang.String) objArr127[0]).intern();
                                                java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                b("儮儁儩兰떈떥휴휹凲冞딙혽倜债둂훕僸卮랼픶厡", android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr128);
                                                java.lang.String intern41 = ((java.lang.String) objArr128[0]).intern();
                                                java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                c("끺䦕\ueb28ဵ턠鿙ៃ㮹傎㢏\ue6bd릙귖媜ᑐﷴ\ue4fe㴝\uf855蠐⫑", "ꡉ\ue223\u0dce衊", (-824040536) - (android.os.Process.myTid() >> 22), "䏽氕\uda3e쭫", (char) android.view.Gravity.getAbsoluteGravity(0, 0), objArr129);
                                                java.lang.String intern42 = ((java.lang.String) objArr129[0]).intern();
                                                java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                c("きꇝ漿튓徦倐ꉕ惫숬ꗗ李ᱏ쫋ﰣ껋賎", "ᆝ\ud939뼘왑", android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1, "䏽氕\uda3e쭫", (char) (20928 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr130);
                                                java.lang.String intern43 = ((java.lang.String) objArr130[0]).intern();
                                                java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                c("幓퍷ಮ떅騮莔皀퉂ᯗ榉秢쟜\uebc2ᱧ쿼킍熔竾\ufe1a\udb4f玡랐婙丧干", "癨唨쐞႔", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 508897398, "䏽氕\uda3e쭫", (char) android.view.View.MeasureSpec.getMode(0), objArr131);
                                                java.lang.String intern44 = ((java.lang.String) objArr131[0]).intern();
                                                java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                c("Ṻ稧㗭梋㠢諅ࣙ銦\ue652沎\ua7e4ퟰ赬", "龋蹝䏣膲", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 477209185, "䏽氕\uda3e쭫", (char) (45635 - android.graphics.Color.blue(0)), objArr132);
                                                java.lang.String intern45 = ((java.lang.String) objArr132[0]).intern();
                                                java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                c("ꏼ볳徇視횉잶졷\uef5aഞ", "\u245e☎\uf80a뚶", 170266148 - android.view.View.MeasureSpec.getMode(0), "䏽氕\uda3e쭫", (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr133);
                                                java.lang.String intern46 = ((java.lang.String) objArr133[0]).intern();
                                                java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                c("籪诨ల蕲⌖\uf6dc롦뻮", "몷㆖䃫븪", android.view.View.combineMeasuredStates(0, 0), "䏽氕\uda3e쭫", (char) android.graphics.Color.blue(0), objArr134);
                                                java.lang.String[] strArr4 = {intern36, intern37, intern38, intern39, intern40, intern41, intern42, intern43, intern44, intern45, intern46, ((java.lang.String) objArr134[0]).intern()};
                                                int i23 = 0;
                                                while (i23 < 12) {
                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                    sb.append(strArr4[i23]);
                                                    java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                    c("䔓귪", "䦍ᅬ盅駋", android.graphics.Color.red(0), "䏽氕\uda3e쭫", (char) (52086 - android.graphics.Color.alpha(0)), objArr135);
                                                    sb.append(((java.lang.String) objArr135[0]).intern());
                                                    java.lang.Object[] objArr136 = {sb.toString()};
                                                    java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                    if (obj33 == null) {
                                                        java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.text.TextUtils.getTrimmedLength(str2), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3161, (char) (33099 - android.view.View.resolveSize(0, 0)));
                                                        java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                        a((byte) ($$a[14] - 1), r10[21], (short) ($$b + 5), objArr137);
                                                        obj33 = cls31.getMethod((java.lang.String) objArr137[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj33);
                                                    }
                                                    long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj33).invoke(null, objArr136)).longValue();
                                                    long j43 = ~longValue15;
                                                    java.lang.String[] strArr5 = strArr4;
                                                    long j44 = (((-282) * longValue15) - 280500030292L) + (((~(j | 987676162)) | (~(longValue15 | 987676162))) * (-283)) + ((~((-987676163) | j43)) * 283) + ((~(987676162 | j43 | j)) * 283) + 1983111066;
                                                    if (((((int) j44) & (((r4 * 495) - 942541492) + (((~(i2 | 631068812)) | 77090952) * 495))) | (((int) (j44 >> 32)) & ((((((~(i2 | 2144708147)) | 713032737) | (~((-2140505122) | i))) * (-68)) - 564705054) + ((~(i2 | (-1427472385))) * (-68)) + (((~(i2 | 2140505121)) | 717235763) * 68)))) != 0) {
                                                        i6 = i23 + 110;
                                                        break;
                                                    }
                                                    i23++;
                                                    strArr4 = strArr5;
                                                }
                                            }
                                        }
                                        i6 = 0;
                                        if (i6 != 0) {
                                            java.lang.Object[] objArr138 = {new int[]{i}, new int[]{i6 ^ i}, null, new int[1]};
                                            java.lang.Object[] objArr139 = {1258591913, 16, java.lang.Integer.valueOf((((((~((-1059102861) | i)) | 723550208) * 1504) - 127520065) + ((~(i | (-335552653))) * (-1504))) - 755941360)};
                                            java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj34 == null) {
                                                java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter(str2, 0) + 50, android.graphics.Color.argb(0, 0, 0, 0) + 2713, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                byte b15 = $$a[14];
                                                byte b16 = (byte) (b15 - 1);
                                                java.lang.Object[] objArr140 = new java.lang.Object[1];
                                                a(b15, b16, b16, objArr140);
                                                obj34 = cls32.getMethod((java.lang.String) objArr140[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj34);
                                            }
                                            ((int[]) objArr138[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr139)).intValue();
                                            return objArr138;
                                        }
                                        long[] jArr = {472001035};
                                        java.lang.Object[] objArr141 = new java.lang.Object[1];
                                        c("\ue73e㎬\uf0ffч፷\ue3d9鞳矠\uf20d\uddf4楺冹됎媯ྻ矻\uef8f", "蛇坐Ｄ꒔", 609702022 - android.view.KeyEvent.normalizeMetaState(0), "䏽氕\uda3e쭫", (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 38143), objArr141);
                                        try {
                                            bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(((java.lang.String) objArr141[0]).intern()));
                                            j5 = 0;
                                        } catch (java.io.IOException unused2) {
                                            bufferedInputStream = null;
                                        } catch (java.lang.Throwable th4) {
                                            th = th4;
                                            bufferedInputStream = null;
                                        }
                                        while (true) {
                                            try {
                                                int read = bufferedInputStream.read();
                                                if (read != -1) {
                                                    j5 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK & (read ^ (j5 << 5));
                                                    for (int i24 = 0; i24 <= 0; i24++) {
                                                        if (j5 == jArr[i24]) {
                                                            int i25 = i24 + 1;
                                                            try {
                                                                bufferedInputStream.close();
                                                            } catch (java.lang.Exception unused3) {
                                                            }
                                                            if (i25 != 0) {
                                                                i7 = 240;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (java.io.IOException unused4) {
                                            } catch (java.lang.Throwable th5) {
                                                th = th5;
                                                if (bufferedInputStream == null) {
                                                    throw th;
                                                }
                                                try {
                                                    bufferedInputStream.close();
                                                    throw th;
                                                } catch (java.lang.Exception unused5) {
                                                    throw th;
                                                }
                                            }
                                            try {
                                                bufferedInputStream.close();
                                                break;
                                            } catch (java.lang.Exception unused6) {
                                            }
                                        }
                                        i7 = 0;
                                        if (i7 != 0) {
                                            java.lang.Object[] objArr142 = {new int[]{i}, new int[]{i7 ^ i}, null, new int[1]};
                                            java.lang.Object[] objArr143 = {1258591913, 16, java.lang.Integer.valueOf(((i | (-200)) * (-381)) + 219591308 + (((~(i2 | 438566664)) | (-167808208)) * 381) + 75819)};
                                            java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj35 == null) {
                                                java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.keyCodeFromString(str2), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2713, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                                                byte b17 = $$a[14];
                                                byte b18 = (byte) (b17 - 1);
                                                java.lang.Object[] objArr144 = new java.lang.Object[1];
                                                a(b17, b18, b18, objArr144);
                                                obj35 = cls33.getMethod((java.lang.String) objArr144[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj35);
                                            }
                                            ((int[]) objArr142[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj35).invoke(null, objArr143)).intValue();
                                            return objArr142;
                                        }
                                        long[] jArr2 = {472001035};
                                        java.lang.Object[] objArr145 = new java.lang.Object[1];
                                        b("컯컀瑷琮姯姂뚻뚶침瓃奠랲쿌畨堧뜜콹瘠寛듢찿盒孷뗌췄睼", android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr145);
                                        try {
                                            bufferedInputStream3 = new java.io.BufferedInputStream(new java.io.FileInputStream(((java.lang.String) objArr145[0]).intern()));
                                            j4 = 0;
                                        } catch (java.io.IOException unused7) {
                                            bufferedInputStream3 = null;
                                        } catch (java.lang.Throwable th6) {
                                            th2 = th6;
                                            bufferedInputStream2 = null;
                                        }
                                        loop6: while (true) {
                                            try {
                                                int read2 = bufferedInputStream3.read();
                                                if (read2 != -1) {
                                                    j4 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK & (read2 ^ (j4 << 5));
                                                    int i26 = 0;
                                                    while (i26 <= 0) {
                                                        int i27 = getProfileVersion + 43;
                                                        RecordsJson = i27 % 128;
                                                        if (i27 % 2 == 0) {
                                                            break loop6;
                                                        }
                                                        if (j4 == jArr2[i26]) {
                                                            int i28 = i26 + 1;
                                                            try {
                                                                bufferedInputStream3.close();
                                                            } catch (java.lang.Exception unused8) {
                                                            }
                                                            if (i28 != 0) {
                                                                getProfileVersion = (RecordsJson + 97) % 128;
                                                                java.lang.Object[] objArr146 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, null, new int[1]};
                                                                java.lang.Object[] objArr147 = {1258591913, 16, java.lang.Integer.valueOf((((~(i | (-254767211))) | 339177999) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 2123995611 + (((~(i2 | (-254767211))) | 339177999) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))};
                                                                java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj36 == null) {
                                                                    java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('b' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2713 - android.view.KeyEvent.getDeadChar(0, 0), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
                                                                    byte b19 = $$a[14];
                                                                    byte b20 = (byte) (b19 - 1);
                                                                    java.lang.Object[] objArr148 = new java.lang.Object[1];
                                                                    a(b19, b20, b20, objArr148);
                                                                    obj36 = cls34.getMethod((java.lang.String) objArr148[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                                                                }
                                                                ((int[]) objArr146[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr147)).intValue();
                                                                return objArr146;
                                                            }
                                                        } else {
                                                            i26++;
                                                        }
                                                    }
                                                }
                                            } catch (java.io.IOException unused9) {
                                            } catch (java.lang.Throwable th7) {
                                                th2 = th7;
                                                bufferedInputStream2 = bufferedInputStream3;
                                                if (bufferedInputStream2 == null) {
                                                    throw th2;
                                                }
                                                try {
                                                    bufferedInputStream2.close();
                                                    throw th2;
                                                } catch (java.lang.Exception unused10) {
                                                    throw th2;
                                                }
                                            }
                                            try {
                                                bufferedInputStream3.close();
                                                break;
                                            } catch (java.lang.Exception unused11) {
                                            }
                                        }
                                        java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(724989957);
                                        if (obj37 == null) {
                                            java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1890 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (3599 - android.view.MotionEvent.axisFromString(str2)));
                                            java.lang.Object[] objArr149 = new java.lang.Object[1];
                                            a(r8[14], (byte) (-$$a[16]), 653, objArr149);
                                            obj37 = cls35.getMethod((java.lang.String) objArr149[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(724989957, obj37);
                                        }
                                        long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj37).invoke(null, null)).longValue();
                                        long j45 = ~longValue16;
                                        long j46 = j45 | (-232789015);
                                        long j47 = j45 | j7;
                                        int i29 = i7;
                                        long j48 = (((((193 * longValue16) + 44928279702L) + ((j7 | (~(longValue16 | (-232789015)))) * (-192))) + (((~j47) | (~j46)) * (-384))) + ((((~(j46 | j)) | (~(232789014 | j47))) | (~((232789014 | longValue16) | j))) * 192)) - 2112037394;
                                        if (((((int) j48) & (((r4 * 495) - 82052182) + (((~(i2 | (-1810764977))) | 335653638) * 495))) | ((((((-1148028418) | i) * (-50)) - 543342162) + (((~(1710073427 | i)) | (~(i2 | (-360961)))) * 50) + (((~(i2 | 1709712467)) | 360960 | (~(i2 | (-1148028418)))) * 50)) & ((int) (j48 >> 32)))) != 0) {
                                            java.lang.Object[] objArr150 = {new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i29}, null, new int[1]};
                                            java.lang.Object[] objArr151 = {1258591913, 16, java.lang.Integer.valueOf(((((~(i2 | (-943031434))) | (~((-233705914) | i))) * com.visa.cbp.getCertUsage.getODAData) - 302186763) + (((~(i | (-943031434))) | (~(i2 | (-233705914)))) * com.visa.cbp.getCertUsage.getODAData))};
                                            java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj38 == null) {
                                                java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.MotionEvent.axisFromString(str2), 2713 - (android.os.Process.myPid() >> 22), (char) android.text.TextUtils.indexOf(str2, str2, 0));
                                                byte b21 = $$a[14];
                                                byte b22 = (byte) (b21 - 1);
                                                java.lang.Object[] objArr152 = new java.lang.Object[1];
                                                a(b21, b22, b22, objArr152);
                                                obj38 = cls36.getMethod((java.lang.String) objArr152[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                                            }
                                            ((int[]) objArr150[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr151)).intValue();
                                            return objArr150;
                                        }
                                        java.lang.Object[] objArr153 = {2};
                                        java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                        if (obj39 == null) {
                                            java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.text.TextUtils.indexOf(str2, str2) + 2364, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                            java.lang.Object[] objArr154 = new java.lang.Object[1];
                                            a(r8[14], (byte) (-$$a[16]), 653, objArr154);
                                            obj39 = cls37.getMethod((java.lang.String) objArr154[0], java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj39);
                                        }
                                        long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj39).invoke(null, objArr153)).longValue();
                                        long j49 = ~((~longValue17) | (-182036058));
                                        long j50 = (522 * longValue17) + 94658750160L + ((~(longValue17 | 182036057 | j)) * 521) + ((-1042) * j49) + (((~(j7 | 182036057 | longValue17)) | j49) * 521) + 1589946257;
                                        int i30 = (~(i2 | 1778445899)) | (-2119630572) | (~(i2 | 341219489));
                                        if (((((int) j50) & ((((~((-34818) | i)) | i30) * 590) + 2090644511 + (i30 * (-1180)) + (((~(i2 | (-341219490))) | (~(i2 | (-1778445900)))) * 590))) | (((int) (j50 >> 32)) & ((((~(i2 | 789563018)) | 1346380096 | (~(i2 | (-2068177867)))) * 464) + 865423786 + ((2135943114 | i) * (-464)) + (((~((-2068177867) | i)) | 1346380096) * 464)))) == 2) {
                                            java.lang.Object[] objArr155 = {new int[]{i}, new int[]{i ^ 270}, null, new int[1]};
                                            java.lang.Object[] objArr156 = {1258591913, 16, java.lang.Integer.valueOf(((~((-705104459) | i)) * 623) + 2144357476 + ((i2 | 4219013) * (-623)) + (((~(i | (-705105483))) | 705104458 | (~(4220037 | i))) * 623))};
                                            java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj40 == null) {
                                                java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 2713 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) android.text.TextUtils.getCapsMode(str2, 0, 0));
                                                byte b23 = $$a[14];
                                                byte b24 = (byte) (b23 - 1);
                                                java.lang.Object[] objArr157 = new java.lang.Object[1];
                                                a(b23, b24, b24, objArr157);
                                                obj40 = cls38.getMethod((java.lang.String) objArr157[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj40);
                                            }
                                            ((int[]) objArr155[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr156)).intValue();
                                            return objArr155;
                                        }
                                        java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1411285061);
                                        if (obj41 == null) {
                                            java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 3197 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) android.text.TextUtils.indexOf(str2, str2, 0));
                                            java.lang.Object[] objArr158 = new java.lang.Object[1];
                                            a((byte) ($$a[14] - 1), r6[21], (short) ($$b + 5), objArr158);
                                            obj41 = cls39.getMethod((java.lang.String) objArr158[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1411285061, obj41);
                                        }
                                        long j51 = ~((java.lang.Long) ((java.lang.reflect.Method) obj41).invoke(null, null)).longValue();
                                        long j52 = j51 | j7;
                                        long j53 = ((r8 * (-49)) - 35304156921L) + ((j | (-692238371)) * (-50)) + (((~(j51 | 692238370 | j)) | (~(j52 | (-692238371)))) * 50) + (((~j52) | (~((-692238371) | j51)) | (~(j7 | (-692238371)))) * 50) + 788483732;
                                        if (((((int) (j53 >> 32)) & (((((~(i2 | (-236569657))) | 134824968) * 98) - 1569124596) + (((~(i2 | (-1200656755))) | (-236569657) | (~(1200656754 | i))) * (-49)) + (((~((-236569657) | i)) | (-1335481723)) * 49))) | (((int) j53) & ((((~(633541357 | i)) | 170147856) * (-566)) + 377179573 + ((~(803689213 | i)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST)))) != 0) {
                                            java.lang.Object[] objArr159 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, null, new int[1]};
                                            int i31 = ~(i | 951150104);
                                            java.lang.Object[] objArr160 = {1258591913, 16, java.lang.Integer.valueOf((((-920163665) | i31) * (-658)) + 269839199 + ((i31 | (-1056569177)) * 658))};
                                            java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj42 == null) {
                                                java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 50, 2713 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                                                byte b25 = $$a[14];
                                                byte b26 = (byte) (b25 - 1);
                                                java.lang.Object[] objArr161 = new java.lang.Object[1];
                                                a(b25, b26, b26, objArr161);
                                                obj42 = cls40.getMethod((java.lang.String) objArr161[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj42);
                                            }
                                            ((int[]) objArr159[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj42).invoke(null, objArr160)).intValue();
                                            return objArr159;
                                        }
                                        java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(502613909);
                                        if (obj43 == null) {
                                            java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 40, 3197 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                            java.lang.Object[] objArr162 = new java.lang.Object[1];
                                            a(r6[14], (byte) (-$$a[16]), 653, objArr162);
                                            obj43 = cls41.getMethod((java.lang.String) objArr162[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(502613909, obj43);
                                        }
                                        long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj43).invoke(null, null)).longValue();
                                        long j54 = ~longValue18;
                                        long j55 = ~(j7 | 324719700 | longValue18);
                                        long j56 = (471 * longValue18) + 152942978700L + ((longValue18 | 324719700) * (-470)) + (((~(j54 | j)) | (~((-324719701) | j54)) | j55) * (-470)) + ((j55 | (~(324719700 | j54 | j))) * 470) + 628150190;
                                        if (((((int) j56) & ((((~(i2 | (-566429699))) | (-870796712)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 983086369 + (((~(i2 | (-870533256))) | (-566693155)) * (-440)) + (((-566429699) | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) | (((int) (j56 >> 32)) & ((((((~(i2 | 1777379350)) | 328232) | r6) * (-713)) - 1615237358) + ((~((-697346049) | i)) * 1426) + ((~(i2 | 1080361534)) * 713)))) != 0) {
                                            java.lang.Object[] objArr163 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr164 = {1258591913, 16, java.lang.Integer.valueOf((((~((-275264789) | i)) | 434060731) * (-366)) + 1904431023 + (((~(i | (-2097157))) | 160893099) * 366))};
                                            java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj44 == null) {
                                                java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.graphics.Color.red(0) + 2713, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                                                byte b27 = $$a[14];
                                                byte b28 = (byte) (b27 - 1);
                                                java.lang.Object[] objArr165 = new java.lang.Object[1];
                                                a(b27, b28, b28, objArr165);
                                                obj44 = cls42.getMethod((java.lang.String) objArr165[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj44);
                                            }
                                            ((int[]) objArr163[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj44).invoke(null, objArr164)).intValue();
                                            return objArr163;
                                        }
                                        java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1293945309);
                                        if (obj45 == null) {
                                            java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 44, 2835 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                            byte[] bArr2 = $$a;
                                            byte b29 = bArr2[14];
                                            byte b30 = (byte) (-bArr2[16]);
                                            java.lang.Object[] objArr166 = new java.lang.Object[1];
                                            a(b29, b30, 653, objArr166);
                                            obj45 = cls43.getMethod((java.lang.String) objArr166[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1293945309, obj45);
                                        }
                                        long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) obj45).invoke(null, null)).longValue();
                                        long j57 = ~((-126051017) | longValue19);
                                        long j58 = ~longValue19;
                                        long j59 = ~(j58 | 126051016);
                                        long j60 = (((((longValue19 * 263) - 65924681368L) + (((j57 | j59) | (~(j58 | j))) * 262)) + ((-786) * j59)) + ((((~(j58 | j7)) | j57) | j59) * 262)) - 932345771;
                                        if (((((int) (j60 >> 32)) & ((((~(i2 | 1070272382)) | (-2144051199)) * (-241)) + 79879155 + (((~(i2 | (-1073778817))) | 356582696) * 241))) | (((int) j60) & (((((~(i2 | (-149923841))) | (~(1587150250 | i))) * 1900) - 1871736089) + (((~(i2 | (-1587150251))) | (~(149923840 | i))) * (-950)) + (((~((-1587150251) | i)) | (~(i2 | 149923840))) * 950)))) != 0) {
                                            java.lang.Object[] objArr167 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr168 = {1258591913, 16, java.lang.Integer.valueOf((((((~(i2 | (-328895319))) | 17958918) | (~(i2 | 380430201))) * 464) - 1148292545) + (((-310936401) | i) * (-464)) + (((~(i | 380430201)) | 17958918) * 464))};
                                            java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj46 == null) {
                                                java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getTrimmedLength(str2), 2713 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                                                byte b31 = $$a[14];
                                                byte b32 = (byte) (b31 - 1);
                                                java.lang.Object[] objArr169 = new java.lang.Object[1];
                                                a(b31, b32, b32, objArr169);
                                                obj46 = cls44.getMethod((java.lang.String) objArr169[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj46);
                                            }
                                            ((int[]) objArr167[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj46).invoke(null, objArr168)).intValue();
                                            return objArr167;
                                        }
                                        long[] jArr3 = {624887784092251L};
                                        java.lang.Object[] objArr170 = new java.lang.Object[1];
                                        c("\ue73e㎬\uf0ffч፷\ue3d9鞳矠\uf20d\uddf4楺冹됎媯ྻ矻\uef8f", "蛇坐Ｄ꒔", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 609702021, "䏽氕\uda3e쭫", (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 38143), objArr170);
                                        java.lang.Object[] objArr171 = {((java.lang.String) objArr170[0]).intern(), 3, 2251799813685247L, jArr3};
                                        java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                        if (obj47 == null) {
                                            java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 3095 - android.view.MotionEvent.axisFromString(str2), (char) android.view.KeyEvent.keyCodeFromString(str2));
                                            java.lang.Object[] objArr172 = new java.lang.Object[1];
                                            a(r6[14], (byte) (-$$a[16]), 653, objArr172);
                                            obj47 = cls45.getMethod((java.lang.String) objArr172[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj47);
                                        }
                                        long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) obj47).invoke(null, objArr171)).longValue();
                                        long j61 = ~longValue20;
                                        long j62 = ~(j7 | longValue20);
                                        long j63 = (((((517 * longValue20) + 25501307530L) + ((((~(j61 | j)) | (~(j7 | (-49517102)))) | j62) * (-516))) + (((~((49517101 | j61) | j)) | (~((j7 | 49517101) | longValue20))) * 516)) + ((j62 | (~(49517101 | longValue20))) * 516)) - 1861130808;
                                        if (((((int) j63) & ((((27267104 | r4) * (-280)) - 891663543) + (((~(839378117 | i)) | (~(597848292 | i))) * 140) + (((~(866645221 | i)) | (~(i2 | (-27267105))) | (~(i2 | (-268796930)))) * 140))) | (((int) (j63 >> 32)) & ((((((~(i2 | (-1182963047))) | (~((-254263365) | i))) * (-370)) + 635053406) + ((((~((-1182963047) | i)) | (~(i2 | (-254263365)))) | (-1336399207)) * (-370))) - 546467550))) != 0) {
                                            java.lang.Object[] objArr173 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr174 = {1258591913, 16, java.lang.Integer.valueOf((((~(i2 | (-311670246))) | 311669984) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 1801722615 + ((~((-311669985) | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(i | (-262))) | (~(i2 | (-397655275))) | 85985290) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                                            java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj48 == null) {
                                                java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2713 - android.text.TextUtils.indexOf(str2, str2), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                                byte b33 = $$a[14];
                                                byte b34 = (byte) (b33 - 1);
                                                java.lang.Object[] objArr175 = new java.lang.Object[1];
                                                a(b33, b34, b34, objArr175);
                                                obj48 = cls46.getMethod((java.lang.String) objArr175[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj48);
                                            }
                                            ((int[]) objArr173[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj48).invoke(null, objArr174)).intValue();
                                            return objArr173;
                                        }
                                        java.lang.Object[] objArr176 = new java.lang.Object[1];
                                        c("쨠兕牣ﲁ軩奋孊꩸獽\ud912鞖", "\ue8cf휳\udfb8廉", (-1193856025) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "䏽氕\uda3e쭫", (char) android.graphics.Color.blue(0), objArr176);
                                        java.lang.Object[] objArr177 = {((java.lang.String) objArr176[0]).intern()};
                                        java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                        if (obj49 == null) {
                                            java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 36, 3161 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (33099 - (android.view.KeyEvent.getMaxKeyCode() >> 16)));
                                            java.lang.Object[] objArr178 = new java.lang.Object[1];
                                            a((byte) ($$a[14] - 1), r8[21], (short) ($$b + 5), objArr178);
                                            obj49 = cls47.getMethod((java.lang.String) objArr178[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj49);
                                        }
                                        long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) obj49).invoke(null, objArr177)).longValue();
                                        long j64 = ~longValue21;
                                        long j65 = j | (-850350289);
                                        long j66 = (longValue21 * (-667)) + 1135217635815L + (((~j65) | j64) * (-668)) + (((~(j64 | j)) | (-850350289)) * 1336) + ((j65 | j64) * 668) + 1845785192;
                                        int i32 = i2;
                                        if (((((int) (j66 >> 32)) & ((((i2 | 134889728) * (-192)) - 1788177110) + (((~(i2 | (-1204819115))) | 97517568) * (-384)) + (((~((-97517569) | i)) | (~(i2 | (-1107301547))) | (~(1339708842 | i))) * 192))) | (((int) j66) & ((((~(i2 | (-1092989017))) | (-1764751870) | (~(1764735453 | i))) * (-68)) + 129772417 + ((~(i32 | (-16417))) * (-68)) + (((~((-1764735454) | i32)) | (-1093005433)) * 68)))) != 0) {
                                            java.lang.Object[] objArr179 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr180 = {1258591913, 16, java.lang.Integer.valueOf(((570500730 | i) * 140) + 2138512347 + (((~(570500730 | i32)) | 138823685) * (-280)) + (((~(i | (-138823686))) | (~(i32 | 138824789)) | 570499626) * 140))};
                                            java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj50 == null) {
                                                java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2713 - android.graphics.Color.green(0), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                byte b35 = $$a[14];
                                                byte b36 = (byte) (b35 - 1);
                                                java.lang.Object[] objArr181 = new java.lang.Object[1];
                                                a(b35, b36, b36, objArr181);
                                                obj50 = cls48.getMethod((java.lang.String) objArr181[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj50);
                                            }
                                            ((int[]) objArr179[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj50).invoke(null, objArr180)).intValue();
                                            return objArr179;
                                        }
                                        java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                                        if (obj51 == null) {
                                            java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.text.TextUtils.indexOf(str2, str2, 0), android.view.View.combineMeasuredStates(0, 0) + 2185, (char) (59513 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)));
                                            java.lang.Object[] objArr182 = new java.lang.Object[1];
                                            a(r8[14], (byte) (-$$a[16]), 653, objArr182);
                                            obj51 = cls49.getMethod((java.lang.String) objArr182[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj51);
                                        }
                                        long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) obj51).invoke(null, null)).longValue();
                                        long j67 = ~longValue22;
                                        long j68 = (((((46 * longValue22) + 52418383680L) + (((~(j67 | j7)) | 1139530080) * (-90))) + (((~(j67 | j)) | (~(longValue22 | 1139530080))) * (-45))) + (((~(j7 | 1139530080)) | ((~(j | (-1139530081))) | j67)) * 45)) - 2011620666;
                                        int i33 = (~(1546144889 | i32)) | (-1585315584) | (~(108918479 | i32));
                                        if (((((int) j68) & ((((~((-69747786) | i)) | i33) * 590) + 1327929367 + (i33 * (-1180)) + (((~((-108918480) | i32)) | (~((-1546144890) | i32))) * 590))) | (((int) (j68 >> 32)) & ((((((~((-367550364) | i)) | 364926475) * 576) - 1771464918) + (((~((-2623889) | i32)) | 704749572) * 576)) - 255747904))) != 0) {
                                            java.lang.Object[] objArr183 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr184 = {1258591913, 16, java.lang.Integer.valueOf((((((~((-31586278) | i32)) | (~((-677739243) | i))) | (~(677739242 | i32))) * 959) - 1120263826) + (((~(i | (-31586278))) | (~(i32 | (-677739243))) | (~(677739242 | i))) * 959))};
                                            java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj52 == null) {
                                                java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 50, 2713 - android.text.TextUtils.getOffsetAfter(str2, 0), (char) android.view.View.MeasureSpec.getSize(0));
                                                byte b37 = $$a[14];
                                                byte b38 = (byte) (b37 - 1);
                                                java.lang.Object[] objArr185 = new java.lang.Object[1];
                                                a(b37, b38, b38, objArr185);
                                                obj52 = cls50.getMethod((java.lang.String) objArr185[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj52);
                                            }
                                            ((int[]) objArr183[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj52).invoke(null, objArr184)).intValue();
                                            return objArr183;
                                        }
                                        java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1050293330);
                                        if (obj53 == null) {
                                            java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2972, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                            java.lang.Object[] objArr186 = new java.lang.Object[1];
                                            a(r8[14], (byte) (-$$a[16]), 653, objArr186);
                                            obj53 = cls51.getMethod((java.lang.String) objArr186[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1050293330, obj53);
                                        }
                                        long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) obj53).invoke(null, null)).longValue();
                                        long j69 = ~longValue23;
                                        long j70 = ((((((-67) * longValue23) - 93402775704L) + ((((~((j69 | 1353663415) | j7)) | (~(longValue23 | (-1353663416)))) | (~(j | longValue23))) * (-68))) + ((~((j7 | 1353663415) | longValue23)) * (-68))) + (((~(j69 | j7)) | 1353663415) * 68)) - 499038348;
                                        if (((((int) j70) & ((((~(1033325471 | i)) | (~((-403900939) | i))) * 69) + 1473430750 + (((~(479660826 | i)) | 553664645 | (~((-957565584) | i))) * (-69)) + 932464976)) | (((int) (j70 >> 32)) & ((((1979427247 | i32) * (-490)) - 1566237562) + (((~(1960485285 | i)) | 18941962) * 490) + 1568579318))) != 0) {
                                            java.lang.Object[] objArr187 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr188 = {1258591913, 16, java.lang.Integer.valueOf(((~((-93847622) | i32)) * 130) + 1120989617 + (((~(i | (-93847622))) | 2100362) * 130))};
                                            java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj54 == null) {
                                                java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 50, 2712 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                                                byte b39 = $$a[14];
                                                byte b40 = (byte) (b39 - 1);
                                                java.lang.Object[] objArr189 = new java.lang.Object[1];
                                                a(b39, b40, b40, objArr189);
                                                obj54 = cls52.getMethod((java.lang.String) objArr189[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj54);
                                            }
                                            ((int[]) objArr187[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj54).invoke(null, objArr188)).intValue();
                                            return objArr187;
                                        }
                                        java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1827153043);
                                        if (obj55 == null) {
                                            java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2160 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 56400));
                                            java.lang.Object[] objArr190 = new java.lang.Object[1];
                                            a(r8[14], (byte) (-$$a[16]), 653, objArr190);
                                            obj55 = cls53.getMethod((java.lang.String) objArr190[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1827153043, obj55);
                                        }
                                        long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) obj55).invoke(null, null)).longValue();
                                        long j71 = ~longValue24;
                                        long j72 = (-245795314) + (((-493) * longValue24) - 158411239470L) + ((j71 | (-320022706)) * (-988)) + ((longValue24 | 320022705 | j7) * 494) + (((~(j7 | longValue24)) | (~(j71 | 320022705)) | (~(longValue24 | (-320022706)))) * 494);
                                        if (((((int) j72) & (((((~(1336541161 | i)) | (~((-1091078689) | i32))) * 920) - 2038855459) + (((~(1191763936 | i32)) | (-1336541162)) * 920) + (((~(1336541161 | i32)) | (~((-144777226) | i)) | (~((-1091078689) | i))) * 920))) | (((int) (j72 >> 32)) & ((((~((-1283918630) | i)) | 1573822255) * (-668)) + 2106844474 + (((~(1573822255 | i)) | (-1283918630)) * 1336) + (((-65537) | i) * 668)))) != 0) {
                                            java.lang.Object[] objArr191 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                            java.lang.Object[] objArr192 = {1258591913, 16, java.lang.Integer.valueOf((((~(289288982 | i)) | 713131232) * 336) + 1801722615 + (((~(i | 998614502)) | 3805712) * (-168)) + (((~(998614502 | i32)) | 289288982) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                                            java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj56 == null) {
                                                java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49, 2713 - (android.os.Process.myTid() >> 22), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                byte b41 = $$a[14];
                                                byte b42 = (byte) (b41 - 1);
                                                java.lang.Object[] objArr193 = new java.lang.Object[1];
                                                a(b41, b42, b42, objArr193);
                                                obj56 = cls54.getMethod((java.lang.String) objArr193[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj56);
                                            }
                                            ((int[]) objArr191[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj56).invoke(null, objArr192)).intValue();
                                            return objArr191;
                                        }
                                        java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(887063382);
                                        if (obj57 == null) {
                                            java.lang.Class cls55 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionType(0L) + 838, (char) (android.os.Process.myTid() >> 22));
                                            java.lang.Object[] objArr194 = new java.lang.Object[1];
                                            a(r8[14], (byte) (-$$a[16]), 653, objArr194);
                                            obj57 = cls55.getMethod((java.lang.String) objArr194[0], null);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(887063382, obj57);
                                        }
                                        long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) obj57).invoke(null, null)).longValue();
                                        long j73 = ~longValue25;
                                        long j74 = 1353547989 + ((984 * longValue25) - 1193157654045L) + ((j73 | 607204913) * 983) + (((~(j73 | j7)) | (-607204914)) * (-983)) + (((~(longValue25 | (-607204914))) | (~(j7 | (-607204914)))) * 983);
                                        int i34 = ((((int) (j74 >> 32)) & (((((~((-93712483) | i32)) * 979) + 927162684) + ((1343513928 | i) * (-979))) + (((~((-93712483) | i)) | (~(1343513928 | i32))) * 979))) | (((int) j74) & ((((((~(566793022 | i)) | (~((-566264363) | i32))) * (-406)) + 1581677491) + ((~((-304169026) | i32)) * (-406))) + (((~(870433387 | i)) | (~((-566793023) | i32))) * 406)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : i;
                                        if (i34 != i) {
                                            java.lang.Object[] objArr195 = {new int[]{i}, new int[]{i34}, null, new int[1]};
                                            java.lang.Object[] objArr196 = {1258591913, 16, java.lang.Integer.valueOf((((~(i | 518050083)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 1721794761) + (((-17178765) | i32) * (-216)) + (((~(518050083 | i32)) | 191275436) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))};
                                            java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj58 == null) {
                                                java.lang.Class cls56 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 50, 2713 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                byte b43 = $$a[14];
                                                byte b44 = (byte) (b43 - 1);
                                                java.lang.Object[] objArr197 = new java.lang.Object[1];
                                                a(b43, b44, b44, objArr197);
                                                obj58 = cls56.getMethod((java.lang.String) objArr197[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj58);
                                            }
                                            ((int[]) objArr195[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj58).invoke(null, objArr196)).intValue();
                                            java.lang.Object[] objArr198 = {objArr195};
                                            java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(712501173);
                                            if (obj59 == null) {
                                                java.lang.Class cls57 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 53, android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 3238, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                                byte b45 = $$a[14];
                                                byte b46 = (byte) (b45 - 1);
                                                java.lang.Object[] objArr199 = new java.lang.Object[1];
                                                a(b45, b46, b46, objArr199);
                                                obj59 = cls57.getMethod((java.lang.String) objArr199[0], java.lang.Object[].class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(712501173, obj59);
                                            }
                                            ((java.lang.reflect.Method) obj59).invoke(obj, objArr198);
                                            return objArr195;
                                        }
                                        java.lang.Object[] objArr200 = {java.lang.Integer.valueOf(i), obj, 1258591913, 0};
                                        java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(97317038);
                                        if (obj60 == null) {
                                            obj60 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.os.Process.myPid() >> 22), 3289 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) android.graphics.Color.alpha(0))).getDeclaredConstructor(java.lang.Integer.TYPE, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 52, 3237 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) android.graphics.Color.green(0)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(97317038, obj60);
                                        }
                                        java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj60).newInstance(objArr200);
                                        try {
                                            java.lang.Object[] objArr201 = new java.lang.Object[1];
                                            b("퇋톡쓳쒸莱莓糏糐텍쑍茬綇탼얧艁絩큁운膜绝", android.text.TextUtils.getTrimmedLength(str2), objArr201);
                                            java.lang.Class<?> cls58 = java.lang.Class.forName(((java.lang.String) objArr201[0]).intern());
                                            java.lang.Object[] objArr202 = new java.lang.Object[1];
                                            c("䋲\uf669䜬憍怋", "猃흌鴦꺼", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 651644019, "䏽氕\uda3e쭫", (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 48285), objArr202);
                                            cls58.getMethod(((java.lang.String) objArr202[0]).intern(), null).invoke(newInstance, null);
                                            java.lang.Object[] objArr203 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                            int i35 = ~((-164628340) | i32);
                                            java.lang.Object[] objArr204 = {1258591913, 0, java.lang.Integer.valueOf((((~(164628339 | i)) | (~(873953859 | i32)) | i35) * (-516)) + 1671822835 + (((~(i | (-872904705))) | (~(i32 | (-1049156)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((1049155 | i35) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))};
                                            java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj61 == null) {
                                                java.lang.Class cls59 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49, 2713 - android.view.View.MeasureSpec.getSize(0), (char) android.text.TextUtils.indexOf(str2, str2));
                                                byte b47 = $$a[14];
                                                byte b48 = (byte) (b47 - 1);
                                                java.lang.Object[] objArr205 = new java.lang.Object[1];
                                                a(b47, b48, b48, objArr205);
                                                obj61 = cls59.getMethod((java.lang.String) objArr205[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj61);
                                            }
                                            ((int[]) objArr203[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj61).invoke(null, objArr204)).intValue();
                                            return objArr203;
                                        } catch (java.lang.Throwable th8) {
                                            java.lang.Throwable cause2 = th8.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th8;
                                        }
                                    }
                                    java.lang.Object[] objArr206 = {((java.lang.String) objArr[0]).intern()};
                                    java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj62 == null) {
                                        java.lang.Class cls60 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 40, 1920 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                        java.lang.Object[] objArr207 = new java.lang.Object[1];
                                        a(r8[14], (byte) (-$$a[16]), 653, objArr207);
                                        obj62 = cls60.getMethod((java.lang.String) objArr207[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj62);
                                    }
                                    java.lang.Object invoke8 = ((java.lang.reflect.Method) obj62).invoke(null, objArr206);
                                    if (invoke8 != null) {
                                        java.lang.Object[] objArr208 = new java.lang.Object[1];
                                        b("㰁㱳釵醪\uf595\uf5afꐨꐸ㳀酉\uf50e", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, objArr208);
                                        if (invoke8.equals(((java.lang.String) objArr208[0]).intern())) {
                                            java.lang.Object[] objArr209 = new java.lang.Object[1];
                                            b("嚙囩뼾뽱쇏쇩侜侑噘뾟셇五垺븽쀘乼圓뵳쏬䶞呦붕썘䳡喴밿술", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, objArr209);
                                            try {
                                                java.lang.Object[] objArr210 = {((java.lang.String) objArr209[0]).intern()};
                                                java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj63 == null) {
                                                    java.lang.Class cls61 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1920, (char) android.text.TextUtils.indexOf(str2, str2, 0, 0));
                                                    java.lang.Object[] objArr211 = new java.lang.Object[1];
                                                    a(r8[14], (byte) (-$$a[16]), 653, objArr211);
                                                    obj63 = cls61.getMethod((java.lang.String) objArr211[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj63);
                                                }
                                                java.lang.String str9 = (java.lang.String) ((java.lang.reflect.Method) obj63).invoke(null, objArr210);
                                                if (str9 != null) {
                                                    int i36 = getProfileVersion + 39;
                                                    RecordsJson = i36 % 128;
                                                    if (i36 % 2 == 0) {
                                                        java.lang.Integer.parseInt(str9);
                                                        throw new java.lang.NullPointerException();
                                                    }
                                                    int parseInt = java.lang.Integer.parseInt(str9);
                                                    if (parseInt != 0) {
                                                        i5 = parseInt + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                                        if (i5 != 0) {
                                                        }
                                                    }
                                                }
                                            } catch (java.lang.Throwable th9) {
                                                java.lang.Throwable cause3 = th9.getCause();
                                                if (cause3 != null) {
                                                    throw cause3;
                                                }
                                                throw th9;
                                            }
                                        }
                                    }
                                    i5 = 0;
                                    if (i5 != 0) {
                                    }
                                } catch (java.lang.Throwable th10) {
                                    java.lang.Throwable cause4 = th10.getCause();
                                    if (cause4 != null) {
                                        throw cause4;
                                    }
                                    throw th10;
                                }
                                objArr = new java.lang.Object[1];
                                b("抑拸붐뷔톝토評詟戗봱턗謐揯벙큌评挍뿓펴衎恞뼴", android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr);
                            } else {
                                str = str5;
                                java.lang.Object[] objArr212 = new java.lang.Object[1];
                                c("艔\ufff0Ⴗቛ︣ͽ쵱멎\ude8b竫鈪⯩ꎳ", "蹥鮽嗇덝", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 946094706, "䏽氕\uda3e쭫", (char) (android.text.TextUtils.getCapsMode(str, 0, 0) + 23893), objArr212);
                                java.lang.Object[] objArr213 = {((java.lang.String) objArr212[0]).intern()};
                                java.lang.Object obj64 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj64 == null) {
                                    java.lang.Class cls62 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.KeyEvent.normalizeMetaState(0), 1921 - android.view.KeyEvent.normalizeMetaState(0), (char) android.graphics.Color.alpha(0));
                                    java.lang.Object[] objArr214 = new java.lang.Object[1];
                                    a(r9[14], (byte) (-$$a[16]), 653, objArr214);
                                    obj64 = cls62.getMethod((java.lang.String) objArr214[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj64);
                                }
                                java.lang.Object invoke9 = ((java.lang.reflect.Method) obj64).invoke(null, objArr213);
                                i10 = 1;
                                java.lang.Object[] objArr215 = new java.lang.Object[1];
                                b("䝪䝛䪸丹\ua7ed", '0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr215);
                                c = 0;
                            }
                        }
                    } else {
                        obj9 = invoke3;
                        str5 = str4;
                    }
                    if (invoke4 != null) {
                        java.lang.Object[] objArr216 = {invoke4, 42};
                        java.lang.Object obj65 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                        if (obj65 == null) {
                            java.lang.Class cls63 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2594 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.graphics.Color.blue(0));
                            java.lang.Object[] objArr217 = new java.lang.Object[1];
                            a(r10[14], (byte) (-$$a[16]), 653, objArr217);
                            obj65 = cls63.getMethod((java.lang.String) objArr217[0], java.lang.String.class, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj65);
                        }
                        long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) obj65).invoke(null, objArr216)).longValue();
                        i2 = i11;
                        long j75 = ((-219) * longValue26) + 190766350034L + (((~(j7 | 863196154 | longValue26)) | (~((~longValue26) | (-863196155)))) * 220) + (((~(j7 | longValue26)) | 863196154) * (-440)) + ((longValue26 | 863196154 | j6) * 220) + 393904370;
                        if (((((int) (j75 >> 32)) & (((((~(i2 | 1341561050)) | (-1610586619)) * (-241)) - 1444290593) + (((~(i2 | (-269025569))) | 94406784) * 241))) | (((int) j75) & (((((-451236690) | i) * (-859)) - 1645873454) + (((~(i2 | (-451236690))) | (~(988107609 | i))) * 859) + (((~(i2 | 985989720)) | 2117889) * 859)))) != 477111747) {
                        }
                        if (android.os.Build.VERSION.SDK_INT <= 33) {
                        }
                    } else {
                        i2 = i11;
                    }
                    if (obj9 != null) {
                        java.lang.Object[] objArr218 = {obj9, 42};
                        java.lang.Object obj66 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                        if (obj66 == null) {
                            java.lang.Class cls64 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str5) + 28, 2594 - android.view.View.getDefaultSize(0, 0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                            java.lang.Object[] objArr219 = new java.lang.Object[1];
                            a(r8[14], (byte) (-$$a[16]), 653, objArr219);
                            obj66 = cls64.getMethod((java.lang.String) objArr219[0], java.lang.String.class, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj66);
                        }
                        long longValue27 = ((java.lang.Long) ((java.lang.reflect.Method) obj66).invoke(null, objArr218)).longValue();
                        long j76 = ~((~longValue27) | 490740739);
                        long j77 = ((-107) * longValue27) + 26990740645L + (((~(j7 | longValue27)) | (~(longValue27 | (-490740740)))) * (-108)) + (((~((-490740740) | j6)) | j76 | (~(j7 | 490740739))) * 54) + ((j76 | j6) * 54) + 766359785;
                    }
                    if (invoke4 != null) {
                        java.lang.Object[] objArr220 = {invoke4, 42};
                        java.lang.Object obj67 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                        if (obj67 == null) {
                            str6 = str5;
                            java.lang.Class cls65 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf(str6, str6, 0) + 2594, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1));
                            java.lang.Object[] objArr221 = new java.lang.Object[1];
                            a(r9[14], (byte) (-$$a[16]), 653, objArr221);
                            obj67 = cls65.getMethod((java.lang.String) objArr221[0], java.lang.String.class, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj67);
                        } else {
                            str6 = str5;
                        }
                        long longValue28 = ((java.lang.Long) ((java.lang.reflect.Method) obj67).invoke(null, objArr220)).longValue();
                        long j78 = ~longValue28;
                        long j79 = j7 | 36531003;
                        str5 = str6;
                        long j80 = ((-885) * longValue28) + 64769468319L + (((~(j78 | (-36531004))) | (~(j78 | j6)) | (~(j79 | longValue28))) * 886) + (((~(j7 | longValue28)) | 36531003) * (-1772)) + ((~j79) * 886) + 1220569521;
                    }
                    str = str5;
                    java.lang.Object[] objArr272 = new java.lang.Object[1];
                    b("媛嫺ቂሌ糸糎槎槯婘ድ籽梛", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, objArr272);
                    java.lang.String intern210 = ((java.lang.String) objArr272[0]).intern();
                    java.lang.Object[] objArr282 = new java.lang.Object[1];
                    b("E$읓윋擂擦姜始\u0083쟦", android.widget.ExpandableListView.getPackedPositionType(0L), objArr282);
                    java.lang.String intern310 = ((java.lang.String) objArr282[0]).intern();
                    java.lang.Object[] objArr292 = new java.lang.Object[1];
                    b("\ue1d1\ue1b5\uf50e\uf549\udb94\udbb5ఔఙ\ue11c\uf5ae\udb0c", android.view.KeyEvent.getMaxKeyCode() >> 16, objArr292);
                    java.lang.String intern47 = ((java.lang.String) objArr292[0]).intern();
                    java.lang.Object[] objArr302 = new java.lang.Object[1];
                    c("瘔켽嗅參䧁诟\udcc4쥨་", "읶훬碂㛵", android.view.View.combineMeasuredStates(0, 0) - 2099843897, "䏽氕\uda3e쭫", (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr302);
                    java.lang.String intern52 = ((java.lang.String) objArr302[0]).intern();
                    java.lang.Object[] objArr312 = new java.lang.Object[1];
                    c("ꚤಝ痻긅뒍꽵", "塲絑純ᒔ", (-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "䏽氕\uda3e쭫", (char) (38012 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr312);
                    java.lang.String intern62 = ((java.lang.String) objArr312[0]).intern();
                    java.lang.Object[] objArr322 = new java.lang.Object[1];
                    b("뮉믠\ud9df\ud99b\ue829\ue814퍣퍩묌\ud969\ue8b0툧몬\ud8c2\ue9a3틟먒", 1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr322);
                    java.lang.String intern72 = ((java.lang.String) objArr322[0]).intern();
                    java.lang.Object[] objArr332 = new java.lang.Object[1];
                    c("㫙䒦埼媠굫", "迢᭤Ꜯꙟ", 773547151 - android.text.TextUtils.getOffsetAfter(str, 0), "䏽氕\uda3e쭫", (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 24487), objArr332);
                    java.lang.String intern82 = ((java.lang.String) objArr332[0]).intern();
                    java.lang.Object[] objArr342 = new java.lang.Object[1];
                    c("웬㜝튀즣줦瞬", "\ue7c3눹⥩헂", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, "䏽氕\uda3e쭫", (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 49706), objArr342);
                    java.lang.String intern92 = ((java.lang.String) objArr342[0]).intern();
                    java.lang.Object[] objArr352 = new java.lang.Object[1];
                    c("ꀏᖙ", "ϕL义짘", android.widget.ExpandableListView.getPackedPositionType(0L), "䏽氕\uda3e쭫", (char) (55374 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr352);
                    java.lang.String intern102 = ((java.lang.String) objArr352[0]).intern();
                    java.lang.Object[] objArr362 = new java.lang.Object[1];
                    c("痮佞荑串먀၀鹿庸ᇈ凞옜얺䄳諮喏\uf85c", "惭⻂\ue674⻁", android.view.KeyEvent.normalizeMetaState(0), "䏽氕\uda3e쭫", (char) (49638 - android.graphics.Color.green(0)), objArr362);
                    java.lang.String intern112 = ((java.lang.String) objArr362[0]).intern();
                    java.lang.Object[] objArr372 = new java.lang.Object[1];
                    b("уЯᙗᘒ䗄䗷᪅\u1a8fҊᛢ䕜ᮍաᝎ", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr372);
                    java.lang.String intern122 = ((java.lang.String) objArr372[0]).intern();
                    java.lang.Object[] objArr382 = new java.lang.Object[1];
                    b("በሐ궸균볓볨朹朤ኺ괋뱁晴", android.view.View.combineMeasuredStates(0, 0), objArr382);
                    java.lang.String intern132 = ((java.lang.String) objArr382[0]).intern();
                    java.lang.Object[] objArr392 = new java.lang.Object[1];
                    c("쓁틑퓱긏ᕀ㹘ᯖ㰇恭\uda0c킻﮲", "６ⷔ\ue5a7\udc1f", android.graphics.Color.alpha(0), "䏽氕\uda3e쭫", (char) android.view.View.resolveSize(0, 0), objArr392);
                    java.lang.String intern142 = ((java.lang.String) objArr392[0]).intern();
                    java.lang.Object[] objArr402 = new java.lang.Object[1];
                    c("뮜Ṩ阱鏉횱\uef38ꕌ剤䚙攍ộ렑倊듥", "흰运笉妗", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1, "䏽氕\uda3e쭫", (char) (38779 - android.graphics.Color.red(0)), objArr402);
                    java.lang.String intern152 = ((java.lang.String) objArr402[0]).intern();
                    java.lang.Object[] objArr412 = new java.lang.Object[1];
                    b("矀瞲鎃鏌ﰈﰱⱮⱿ眝錿ﲀ", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, objArr412);
                    java.lang.String intern162 = ((java.lang.String) objArr412[0]).intern();
                    java.lang.Object[] objArr422 = new java.lang.Object[1];
                    b("\uf51c\uf56f⥵⤷踙踢骕骜\uf5d9⧆躕", android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1, objArr422);
                    java.lang.String intern172 = ((java.lang.String) objArr422[0]).intern();
                    java.lang.Object[] objArr432 = new java.lang.Object[1];
                    b("苛芨슴싯瑻瑃䧧䧰與숃璴", android.view.ViewConfiguration.getPressedStateDuration() >> 16, objArr432);
                    java.lang.String intern182 = ((java.lang.String) objArr432[0]).intern();
                    java.lang.Object[] objArr442 = new java.lang.Object[1];
                    b("ﰊﱹ믷뮮纶葎", android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr442);
                    java.lang.String intern192 = ((java.lang.String) objArr442[0]).intern();
                    java.lang.Object[] objArr452 = new java.lang.Object[1];
                    b("桙株볇벙碑碤ꓽꓱ梅뱊砚ꖲ楽뷕祪ꕟ槎뺆窶ꛪ檞빨程ꞗ", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, objArr452);
                    java.lang.String intern202 = ((java.lang.String) objArr452[0]).intern();
                    java.lang.Object[] objArr462 = new java.lang.Object[1];
                    c("ᴥ狦ᓊ⚗洏賂", "䫭暄筒ࠕ", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, "䏽氕\uda3e쭫", (char) (5499 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), objArr462);
                    java.lang.String intern212 = ((java.lang.String) objArr462[0]).intern();
                    java.lang.Object[] objArr472 = new java.lang.Object[1];
                    c("䔓귪", "䦍ᅬ盅駋", 1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "䏽氕\uda3e쭫", (char) (52086 - android.text.TextUtils.indexOf(str, str)), objArr472);
                    java.lang.String intern222 = ((java.lang.String) objArr472[0]).intern();
                    java.lang.Object[] objArr482 = new java.lang.Object[1];
                    b("轢輑ꇏꆄ瀈瀲꒻꒬达ꅴ炎ꗸ蹀ꂘ營ꔁ軻ꎙ爱ꚾ", android.text.TextUtils.indexOf(str, str), objArr482);
                    java.lang.String intern232 = ((java.lang.String) objArr482[0]).intern();
                    java.lang.Object[] objArr492 = new java.lang.Object[1];
                    b("\ud9dd\ud9a9왌옔\udcba\udc8f鮙鮄\ud910웮\udc27髋\ud8e5", android.view.ViewConfiguration.getPressedStateDuration() >> 16, objArr492);
                    java.lang.String intern242 = ((java.lang.String) objArr492[0]).intern();
                    java.lang.Object[] objArr502 = new java.lang.Object[1];
                    b("뛴뚀굊괒췑췤풆풛똹귨쵌헔럌갆", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr502);
                    java.lang.String intern252 = ((java.lang.String) objArr502[0]).intern();
                    java.lang.Object[] objArr512 = new java.lang.Object[1];
                    b("⏊⎾ꔰꕨ큡큔\uf248\uf255⌇ꖐ탲\uf31b⋮ꐯ퇳", 1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr512);
                    java.lang.String intern262 = ((java.lang.String) objArr512[0]).intern();
                    java.lang.Object[] objArr522 = new java.lang.Object[1];
                    c("蝧튮釂ﶟ\ue681瘟䪟㹴츰䪇䘀", "\uf141ꔐ產\uf84a", 581243121 - android.graphics.Color.red(0), "䏽氕\uda3e쭫", (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr522);
                    java.lang.String intern272 = ((java.lang.String) objArr522[0]).intern();
                    java.lang.Object[] objArr532 = new java.lang.Object[1];
                    c("\ue82cっꧣ曮ﶚ솬률疪⛅ꆱ୭‵鰘\udd1d\ueea6", "䥱ꯥ刱懗", 833348937 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "䏽氕\uda3e쭫", (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 55122), objArr532);
                    java.lang.String intern282 = ((java.lang.String) objArr532[0]).intern();
                    java.lang.Object[] objArr542 = new java.lang.Object[1];
                    b("햸헍겲곶늿늜闉闞핾간눜钜풑궥덹鑨퐬껣", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, objArr542);
                    java.lang.String[] strArr6 = {intern210, intern310, intern47, intern52, intern62, intern72, intern82, intern92, intern102, intern112, intern122, intern132, intern142, intern152, intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, ((java.lang.String) objArr542[0]).intern()};
                    java.lang.Object[] objArr552 = new java.lang.Object[1];
                    b("\ue607\ue675献獫\ue36a\ue310嫠嫶\ue6ce玎\ue3f2宱\ue736爦\ue2ab", android.view.View.MeasureSpec.getSize(0), objArr552);
                    java.lang.Object[] objArr562 = {((java.lang.String) objArr552[0]).intern()};
                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj2 == null) {
                    }
                    invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr562);
                    if (invoke != null) {
                    }
                    java.lang.Object[] objArr802 = new java.lang.Object[1];
                    c("敔圣燪\uf6cf蔾ᅷ㶓\ue1b6ቅ쌃腡궱낓㓀\uf05b❱◹\uf252ٮ乥Ⴥ澱曡", "\uec6f傃贀䰿", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 5276652, "䏽氕\uda3e쭫", (char) android.view.KeyEvent.getDeadChar(0, 0), objArr802);
                    java.lang.Object[] objArr812 = {((java.lang.String) objArr802[0]).intern()};
                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                    if (obj3 == null) {
                    }
                    long longValue102 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr812)).longValue();
                    long j262 = ~longValue102;
                    long j272 = j7 | 260380689;
                    long j282 = ((-885) * longValue102) + 461654961597L + (((~(j262 | (-260380690))) | (~(j262 | j)) | (~(j272 | longValue102))) * 886) + (((~(j7 | longValue102)) | 260380689) * (-1772)) + ((~j272) * 886) + 1030159378;
                    j2 = (((int) j282) & ((((((~(i2 | (-379343301))) | (~(1816569710 | i))) * (-370)) - 635053777) + ((((~((-379343301) | i)) | (~(i2 | 1816569710))) | 1749198378) * (-370))) - 1336661836)) | (((int) (j282 >> 32)) & (((((~(31126468 | i)) | 1443170347) * 1504) - 1320242614) + ((~(1474296815 | i)) * (-1504)) + 1187751616));
                    java.lang.Object[] objArr832 = new java.lang.Object[1];
                    b("\u0bd9௶\ue1f5\ue1af\udbde\udbf8ꂟꂎ\u0b12\ue108\udb51ꇜ\u0ae5\ue0e9\uda55ꄢ\u0a55\ue3b6\ud9e6ꊜऊ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr832);
                    java.lang.Object[] objArr842 = {((java.lang.String) objArr832[0]).intern()};
                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                    if (obj4 == null) {
                    }
                    long longValue112 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr842)).longValue();
                    long j292 = ~longValue112;
                    long j302 = ((-67) * longValue112) + 51712428465L + (((~(j292 | (-749455486) | j7)) | (~(longValue112 | 749455485)) | (~(longValue112 | j))) * (-68)) + ((~(longValue112 | j7 | (-749455486))) * (-68)) + (((~(j292 | j7)) | (-749455486)) * 68) + 541084582;
                    long j312 = (((int) j302) & (((i2 | (-219676707)) * (-490)) + 328663819 + (((~(1925635548 | i)) | (-2145312255)) * 490) + 1197690466)) | (((int) (j302 >> 32)) & ((((~(i2 | (-369819820))) | (-1067406592) | (~(1041186991 | i))) * (-68)) + 516864474 + ((~(i2 | (-26219601))) * (-68)) + (((~(i2 | (-1041186992))) | (-396039420)) * 68)));
                    if (j2 > 0) {
                        i9 = getProfileVersion + 15;
                        RecordsJson = i9 % 128;
                        if (i9 % 2 == 0) {
                            java.lang.Object[] objArr862 = {new int[]{i}, new int[]{i ^ 247}, null, new int[1]};
                            java.lang.Object[] objArr872 = {1258591913, 16, java.lang.Integer.valueOf((((~(i | (-36700815))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) - 1991822168) + (((~(i2 | (-36700815))) | 537298977) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                            obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj8 == null) {
                            }
                            ((int[]) objArr862[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr872)).intValue();
                            return objArr862;
                        }
                        java.lang.Object[] objArr8622 = {new int[]{i}, new int[]{i ^ 247}, null, new int[1]};
                        java.lang.Object[] objArr8722 = {1258591913, 16, java.lang.Integer.valueOf((((~(i | (-36700815))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) - 1991822168) + (((~(i2 | (-36700815))) | 537298977) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                        obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj8 == null) {
                        }
                        ((int[]) objArr8622[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr8722)).intValue();
                        return objArr8622;
                    }
                    java.lang.Object[] objArr892 = new java.lang.Object[1];
                    c("敔圣燪\uf6cf蔾ᅷ㶓\ue1b6ቅ쌃腡궱낓㓀\uf05b❱◹\uf252ٮ乥Ⴥ澱曡", "\uec6f傃贀䰿", 5276652 - android.text.TextUtils.indexOf(str2, str2), "䏽氕\uda3e쭫", (char) android.view.View.MeasureSpec.getMode(0), objArr892);
                    java.lang.Object[] objArr902 = {((java.lang.String) objArr892[0]).intern()};
                    obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                    if (obj5 == null) {
                    }
                    long longValue122 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr902)).longValue();
                    long j322 = ~longValue122;
                    long j332 = ((407 * longValue122) - 66879231930L) + (((~(j322 | j)) | (~(j7 | 165133906 | longValue122))) * (-406)) + ((~(j322 | j7 | 165133906)) * (-406)) + (((~(j | (-165133907))) | (~(j7 | longValue122))) * 406) + 1125406161;
                    int i182 = ~(i2 | (-617138561));
                    j3 = (((int) j332) & ((((~((-1745880579) | i)) | 308654168) * (-756)) + 1307848465 + ((i2 | (-1745880579)) * 756))) | (((int) (j332 >> 32)) & ((((~(i2 | (-2054364972))) | 1513297451 | (~(i2 | 617138560)) | (~((-76071041) | i))) * (-84)) + 1905160562 + (((~(617138560 | i)) | 2054364971 | i182) * (-84)) + ((i182 | 76071040) * 84)));
                    java.lang.Object[] objArr922 = new java.lang.Object[1];
                    c("锶㗗罾ꚶ", "嚴\ue553㟲鱊", android.view.KeyEvent.getMaxKeyCode() >> 16, "䏽氕\uda3e쭫", (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 18999), objArr922);
                    java.lang.Object[] objArr932 = {((java.lang.String) objArr922[0]).intern()};
                    obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                    if (obj6 == null) {
                    }
                    long longValue132 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr932)).longValue();
                    long j342 = ~longValue132;
                    long j352 = (~(j342 | j7)) | (~(j342 | 1209356369)) | (~(j7 | 1209356369));
                    long j362 = ((591 * longValue132) - 712310901341L) + (((~(longValue132 | (-1209356370) | j)) | j352) * 590) + (j352 * (-1180)) + (((~(j7 | longValue132)) | (~(j7 | (-1209356370)))) * 590) + 81183698;
                    long j372 = (((int) (j362 >> 32)) & ((((~(i2 | (-354942977))) * 130) - 700886102) + (((~((-354942977) | i)) | 1082147072) * 130))) | (((int) j362) & ((((((~(1499207981 | i)) | 44155522) | (~(i2 | (-1481381933)))) * 886) - 2121654707) + (((~(i2 | (-1499207982))) | 61981571) * (-1772)) + ((~(i2 | 61981571)) * 886)));
                    if (j3 > 0) {
                        i8 = getProfileVersion + 41;
                        RecordsJson = i8 % 128;
                        if (i8 % 2 == 0) {
                            java.lang.Object[] objArr952 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                            java.lang.Object[] objArr962 = {1258591913, 16, java.lang.Integer.valueOf(((((~((-387380863) | i)) | (-389480064)) * (-502)) - 801437939) + ((~(i2 | (-67535407))) * (-502)) + (((~(i | (-321944658))) | (-387380863)) * 502))};
                            obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj7 == null) {
                            }
                            ((int[]) objArr952[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr962)).intValue();
                            return objArr952;
                        }
                        java.lang.Object[] objArr9522 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                        java.lang.Object[] objArr9622 = {1258591913, 16, java.lang.Integer.valueOf(((((~((-387380863) | i)) | (-389480064)) * (-502)) - 801437939) + ((~(i2 | (-67535407))) * (-502)) + (((~(i | (-321944658))) | (-387380863)) * 502))};
                        obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj7 == null) {
                        }
                        ((int[]) objArr9522[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr9622)).intValue();
                        return objArr9522;
                    }
                    java.lang.Object[] objArr982 = new java.lang.Object[1];
                    c("ퟂὊ䃪⥗ᛚ\ue3bd䛖", "뒟ᠦ諍။", 9956 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "䏽氕\uda3e쭫", (char) android.view.KeyEvent.keyCodeFromString(str2), objArr982);
                    java.lang.String intern302 = ((java.lang.String) objArr982[0]).intern();
                    java.lang.Object[] objArr992 = new java.lang.Object[1];
                    c("챯楘桐\uf610喯趤뒡蹑㩶ﵱ橩", "韇Ǝ뵩\ueff3", android.view.View.MeasureSpec.getSize(0) + 1761709719, "䏽氕\uda3e쭫", (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr992);
                    java.lang.String intern312 = ((java.lang.String) objArr992[0]).intern();
                    java.lang.Object[] objArr1002 = new java.lang.Object[1];
                    b("嘒嘽⚴⛭㈔㈹眞眓囎☃㊅瘗圱➬㏙皾", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr1002);
                    java.lang.String intern322 = ((java.lang.String) objArr1002[0]).intern();
                    java.lang.Object[] objArr1012 = new java.lang.Object[1];
                    b("\u0cbbಔ₅⃜쨺쨗礼礱౧′쪫砵ඓ↝쯷碜", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr1012);
                    java.lang.String intern332 = ((java.lang.String) objArr1012[0]).intern();
                    java.lang.Object[] objArr1022 = new java.lang.Object[1];
                    b("띏띠ỻầ讝讬駊駚랃Ṇ謓飃뙽Ῠ詗", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr1022);
                    java.lang.String intern342 = ((java.lang.String) objArr1022[0]).intern();
                    java.lang.Object[] objArr1032 = new java.lang.Object[1];
                    b("떊떥멲먫疵疃ឥឲ때", android.view.View.resolveSize(0, 0), objArr1032);
                    java.lang.String intern352 = ((java.lang.String) objArr1032[0]).intern();
                    java.lang.Object[] objArr1042 = new java.lang.Object[1];
                    b("鐌鐣뫝몒軳軓㤿㤢", android.view.ViewConfiguration.getTouchSlop() >> 8, objArr1042);
                    java.lang.String[] strArr22 = {intern302, intern312, intern322, intern332, intern342, intern352, ((java.lang.String) objArr1042[0]).intern()};
                    i3 = 0;
                    while (true) {
                        if (i3 >= 7) {
                        }
                        i3++;
                    }
                    if (i4 != 0) {
                    }
                }
            }
            i2 = i11;
            str = "";
            java.lang.Object[] objArr2722 = new java.lang.Object[1];
            b("媛嫺ቂሌ糸糎槎槯婘ድ籽梛", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, objArr2722);
            java.lang.String intern2102 = ((java.lang.String) objArr2722[0]).intern();
            java.lang.Object[] objArr2822 = new java.lang.Object[1];
            b("E$읓윋擂擦姜始\u0083쟦", android.widget.ExpandableListView.getPackedPositionType(0L), objArr2822);
            java.lang.String intern3102 = ((java.lang.String) objArr2822[0]).intern();
            java.lang.Object[] objArr2922 = new java.lang.Object[1];
            b("\ue1d1\ue1b5\uf50e\uf549\udb94\udbb5ఔఙ\ue11c\uf5ae\udb0c", android.view.KeyEvent.getMaxKeyCode() >> 16, objArr2922);
            java.lang.String intern472 = ((java.lang.String) objArr2922[0]).intern();
            java.lang.Object[] objArr3022 = new java.lang.Object[1];
            c("瘔켽嗅參䧁诟\udcc4쥨་", "읶훬碂㛵", android.view.View.combineMeasuredStates(0, 0) - 2099843897, "䏽氕\uda3e쭫", (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr3022);
            java.lang.String intern522 = ((java.lang.String) objArr3022[0]).intern();
            java.lang.Object[] objArr3122 = new java.lang.Object[1];
            c("ꚤಝ痻긅뒍꽵", "塲絑純ᒔ", (-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "䏽氕\uda3e쭫", (char) (38012 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr3122);
            java.lang.String intern622 = ((java.lang.String) objArr3122[0]).intern();
            java.lang.Object[] objArr3222 = new java.lang.Object[1];
            b("뮉믠\ud9df\ud99b\ue829\ue814퍣퍩묌\ud969\ue8b0툧몬\ud8c2\ue9a3틟먒", 1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3222);
            java.lang.String intern722 = ((java.lang.String) objArr3222[0]).intern();
            java.lang.Object[] objArr3322 = new java.lang.Object[1];
            c("㫙䒦埼媠굫", "迢᭤Ꜯꙟ", 773547151 - android.text.TextUtils.getOffsetAfter(str, 0), "䏽氕\uda3e쭫", (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 24487), objArr3322);
            java.lang.String intern822 = ((java.lang.String) objArr3322[0]).intern();
            java.lang.Object[] objArr3422 = new java.lang.Object[1];
            c("웬㜝튀즣줦瞬", "\ue7c3눹⥩헂", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, "䏽氕\uda3e쭫", (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 49706), objArr3422);
            java.lang.String intern922 = ((java.lang.String) objArr3422[0]).intern();
            java.lang.Object[] objArr3522 = new java.lang.Object[1];
            c("ꀏᖙ", "ϕL义짘", android.widget.ExpandableListView.getPackedPositionType(0L), "䏽氕\uda3e쭫", (char) (55374 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr3522);
            java.lang.String intern1022 = ((java.lang.String) objArr3522[0]).intern();
            java.lang.Object[] objArr3622 = new java.lang.Object[1];
            c("痮佞荑串먀၀鹿庸ᇈ凞옜얺䄳諮喏\uf85c", "惭⻂\ue674⻁", android.view.KeyEvent.normalizeMetaState(0), "䏽氕\uda3e쭫", (char) (49638 - android.graphics.Color.green(0)), objArr3622);
            java.lang.String intern1122 = ((java.lang.String) objArr3622[0]).intern();
            java.lang.Object[] objArr3722 = new java.lang.Object[1];
            b("уЯᙗᘒ䗄䗷᪅\u1a8fҊᛢ䕜ᮍաᝎ", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr3722);
            java.lang.String intern1222 = ((java.lang.String) objArr3722[0]).intern();
            java.lang.Object[] objArr3822 = new java.lang.Object[1];
            b("በሐ궸균볓볨朹朤ኺ괋뱁晴", android.view.View.combineMeasuredStates(0, 0), objArr3822);
            java.lang.String intern1322 = ((java.lang.String) objArr3822[0]).intern();
            java.lang.Object[] objArr3922 = new java.lang.Object[1];
            c("쓁틑퓱긏ᕀ㹘ᯖ㰇恭\uda0c킻﮲", "６ⷔ\ue5a7\udc1f", android.graphics.Color.alpha(0), "䏽氕\uda3e쭫", (char) android.view.View.resolveSize(0, 0), objArr3922);
            java.lang.String intern1422 = ((java.lang.String) objArr3922[0]).intern();
            java.lang.Object[] objArr4022 = new java.lang.Object[1];
            c("뮜Ṩ阱鏉횱\uef38ꕌ剤䚙攍ộ렑倊듥", "흰运笉妗", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1, "䏽氕\uda3e쭫", (char) (38779 - android.graphics.Color.red(0)), objArr4022);
            java.lang.String intern1522 = ((java.lang.String) objArr4022[0]).intern();
            java.lang.Object[] objArr4122 = new java.lang.Object[1];
            b("矀瞲鎃鏌ﰈﰱⱮⱿ眝錿ﲀ", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, objArr4122);
            java.lang.String intern1622 = ((java.lang.String) objArr4122[0]).intern();
            java.lang.Object[] objArr4222 = new java.lang.Object[1];
            b("\uf51c\uf56f⥵⤷踙踢骕骜\uf5d9⧆躕", android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1, objArr4222);
            java.lang.String intern1722 = ((java.lang.String) objArr4222[0]).intern();
            java.lang.Object[] objArr4322 = new java.lang.Object[1];
            b("苛芨슴싯瑻瑃䧧䧰與숃璴", android.view.ViewConfiguration.getPressedStateDuration() >> 16, objArr4322);
            java.lang.String intern1822 = ((java.lang.String) objArr4322[0]).intern();
            java.lang.Object[] objArr4422 = new java.lang.Object[1];
            b("ﰊﱹ믷뮮纶葎", android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr4422);
            java.lang.String intern1922 = ((java.lang.String) objArr4422[0]).intern();
            java.lang.Object[] objArr4522 = new java.lang.Object[1];
            b("桙株볇벙碑碤ꓽꓱ梅뱊砚ꖲ楽뷕祪ꕟ槎뺆窶ꛪ檞빨程ꞗ", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, objArr4522);
            java.lang.String intern2022 = ((java.lang.String) objArr4522[0]).intern();
            java.lang.Object[] objArr4622 = new java.lang.Object[1];
            c("ᴥ狦ᓊ⚗洏賂", "䫭暄筒ࠕ", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, "䏽氕\uda3e쭫", (char) (5499 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), objArr4622);
            java.lang.String intern2122 = ((java.lang.String) objArr4622[0]).intern();
            java.lang.Object[] objArr4722 = new java.lang.Object[1];
            c("䔓귪", "䦍ᅬ盅駋", 1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "䏽氕\uda3e쭫", (char) (52086 - android.text.TextUtils.indexOf(str, str)), objArr4722);
            java.lang.String intern2222 = ((java.lang.String) objArr4722[0]).intern();
            java.lang.Object[] objArr4822 = new java.lang.Object[1];
            b("轢輑ꇏꆄ瀈瀲꒻꒬达ꅴ炎ꗸ蹀ꂘ營ꔁ軻ꎙ爱ꚾ", android.text.TextUtils.indexOf(str, str), objArr4822);
            java.lang.String intern2322 = ((java.lang.String) objArr4822[0]).intern();
            java.lang.Object[] objArr4922 = new java.lang.Object[1];
            b("\ud9dd\ud9a9왌옔\udcba\udc8f鮙鮄\ud910웮\udc27髋\ud8e5", android.view.ViewConfiguration.getPressedStateDuration() >> 16, objArr4922);
            java.lang.String intern2422 = ((java.lang.String) objArr4922[0]).intern();
            java.lang.Object[] objArr5022 = new java.lang.Object[1];
            b("뛴뚀굊괒췑췤풆풛똹귨쵌헔럌갆", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr5022);
            java.lang.String intern2522 = ((java.lang.String) objArr5022[0]).intern();
            java.lang.Object[] objArr5122 = new java.lang.Object[1];
            b("⏊⎾ꔰꕨ큡큔\uf248\uf255⌇ꖐ탲\uf31b⋮ꐯ퇳", 1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr5122);
            java.lang.String intern2622 = ((java.lang.String) objArr5122[0]).intern();
            java.lang.Object[] objArr5222 = new java.lang.Object[1];
            c("蝧튮釂ﶟ\ue681瘟䪟㹴츰䪇䘀", "\uf141ꔐ產\uf84a", 581243121 - android.graphics.Color.red(0), "䏽氕\uda3e쭫", (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr5222);
            java.lang.String intern2722 = ((java.lang.String) objArr5222[0]).intern();
            java.lang.Object[] objArr5322 = new java.lang.Object[1];
            c("\ue82cっꧣ曮ﶚ솬률疪⛅ꆱ୭‵鰘\udd1d\ueea6", "䥱ꯥ刱懗", 833348937 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "䏽氕\uda3e쭫", (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 55122), objArr5322);
            java.lang.String intern2822 = ((java.lang.String) objArr5322[0]).intern();
            java.lang.Object[] objArr5422 = new java.lang.Object[1];
            b("햸헍겲곶늿늜闉闞핾간눜钜풑궥덹鑨퐬껣", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, objArr5422);
            java.lang.String[] strArr62 = {intern2102, intern3102, intern472, intern522, intern622, intern722, intern822, intern922, intern1022, intern1122, intern1222, intern1322, intern1422, intern1522, intern1622, intern1722, intern1822, intern1922, intern2022, intern2122, intern2222, intern2322, intern2422, intern2522, intern2622, intern2722, intern2822, ((java.lang.String) objArr5422[0]).intern()};
            java.lang.Object[] objArr5522 = new java.lang.Object[1];
            b("\ue607\ue675献獫\ue36a\ue310嫠嫶\ue6ce玎\ue3f2宱\ue736爦\ue2ab", android.view.View.MeasureSpec.getSize(0), objArr5522);
            java.lang.Object[] objArr5622 = {((java.lang.String) objArr5522[0]).intern()};
            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj2 == null) {
            }
            invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr5622);
            if (invoke != null) {
            }
            java.lang.Object[] objArr8022 = new java.lang.Object[1];
            c("敔圣燪\uf6cf蔾ᅷ㶓\ue1b6ቅ쌃腡궱낓㓀\uf05b❱◹\uf252ٮ乥Ⴥ澱曡", "\uec6f傃贀䰿", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 5276652, "䏽氕\uda3e쭫", (char) android.view.KeyEvent.getDeadChar(0, 0), objArr8022);
            java.lang.Object[] objArr8122 = {((java.lang.String) objArr8022[0]).intern()};
            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj3 == null) {
            }
            long longValue1022 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr8122)).longValue();
            long j2622 = ~longValue1022;
            long j2722 = j7 | 260380689;
            long j2822 = ((-885) * longValue1022) + 461654961597L + (((~(j2622 | (-260380690))) | (~(j2622 | j)) | (~(j2722 | longValue1022))) * 886) + (((~(j7 | longValue1022)) | 260380689) * (-1772)) + ((~j2722) * 886) + 1030159378;
            j2 = (((int) j2822) & ((((((~(i2 | (-379343301))) | (~(1816569710 | i))) * (-370)) - 635053777) + ((((~((-379343301) | i)) | (~(i2 | 1816569710))) | 1749198378) * (-370))) - 1336661836)) | (((int) (j2822 >> 32)) & (((((~(31126468 | i)) | 1443170347) * 1504) - 1320242614) + ((~(1474296815 | i)) * (-1504)) + 1187751616));
            java.lang.Object[] objArr8322 = new java.lang.Object[1];
            b("\u0bd9௶\ue1f5\ue1af\udbde\udbf8ꂟꂎ\u0b12\ue108\udb51ꇜ\u0ae5\ue0e9\uda55ꄢ\u0a55\ue3b6\ud9e6ꊜऊ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr8322);
            java.lang.Object[] objArr8422 = {((java.lang.String) objArr8322[0]).intern()};
            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj4 == null) {
            }
            long longValue1122 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr8422)).longValue();
            long j2922 = ~longValue1122;
            long j3022 = ((-67) * longValue1122) + 51712428465L + (((~(j2922 | (-749455486) | j7)) | (~(longValue1122 | 749455485)) | (~(longValue1122 | j))) * (-68)) + ((~(longValue1122 | j7 | (-749455486))) * (-68)) + (((~(j2922 | j7)) | (-749455486)) * 68) + 541084582;
            long j3122 = (((int) j3022) & (((i2 | (-219676707)) * (-490)) + 328663819 + (((~(1925635548 | i)) | (-2145312255)) * 490) + 1197690466)) | (((int) (j3022 >> 32)) & ((((~(i2 | (-369819820))) | (-1067406592) | (~(1041186991 | i))) * (-68)) + 516864474 + ((~(i2 | (-26219601))) * (-68)) + (((~(i2 | (-1041186992))) | (-396039420)) * 68)));
            if (j2 > 0) {
            }
            java.lang.Object[] objArr8922 = new java.lang.Object[1];
            c("敔圣燪\uf6cf蔾ᅷ㶓\ue1b6ቅ쌃腡궱낓㓀\uf05b❱◹\uf252ٮ乥Ⴥ澱曡", "\uec6f傃贀䰿", 5276652 - android.text.TextUtils.indexOf(str2, str2), "䏽氕\uda3e쭫", (char) android.view.View.MeasureSpec.getMode(0), objArr8922);
            java.lang.Object[] objArr9022 = {((java.lang.String) objArr8922[0]).intern()};
            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj5 == null) {
            }
            long longValue1222 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr9022)).longValue();
            long j3222 = ~longValue1222;
            long j3322 = ((407 * longValue1222) - 66879231930L) + (((~(j3222 | j)) | (~(j7 | 165133906 | longValue1222))) * (-406)) + ((~(j3222 | j7 | 165133906)) * (-406)) + (((~(j | (-165133907))) | (~(j7 | longValue1222))) * 406) + 1125406161;
            int i1822 = ~(i2 | (-617138561));
            j3 = (((int) j3322) & ((((~((-1745880579) | i)) | 308654168) * (-756)) + 1307848465 + ((i2 | (-1745880579)) * 756))) | (((int) (j3322 >> 32)) & ((((~(i2 | (-2054364972))) | 1513297451 | (~(i2 | 617138560)) | (~((-76071041) | i))) * (-84)) + 1905160562 + (((~(617138560 | i)) | 2054364971 | i1822) * (-84)) + ((i1822 | 76071040) * 84)));
            java.lang.Object[] objArr9222 = new java.lang.Object[1];
            c("锶㗗罾ꚶ", "嚴\ue553㟲鱊", android.view.KeyEvent.getMaxKeyCode() >> 16, "䏽氕\uda3e쭫", (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 18999), objArr9222);
            java.lang.Object[] objArr9322 = {((java.lang.String) objArr9222[0]).intern()};
            obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj6 == null) {
            }
            long longValue1322 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr9322)).longValue();
            long j3422 = ~longValue1322;
            long j3522 = (~(j3422 | j7)) | (~(j3422 | 1209356369)) | (~(j7 | 1209356369));
            long j3622 = ((591 * longValue1322) - 712310901341L) + (((~(longValue1322 | (-1209356370) | j)) | j3522) * 590) + (j3522 * (-1180)) + (((~(j7 | longValue1322)) | (~(j7 | (-1209356370)))) * 590) + 81183698;
            long j3722 = (((int) (j3622 >> 32)) & ((((~(i2 | (-354942977))) * 130) - 700886102) + (((~((-354942977) | i)) | 1082147072) * 130))) | (((int) j3622) & ((((((~(1499207981 | i)) | 44155522) | (~(i2 | (-1481381933)))) * 886) - 2121654707) + (((~(i2 | (-1499207982))) | 61981571) * (-1772)) + ((~(i2 | 61981571)) * 886)));
            if (j3 > 0) {
            }
            java.lang.Object[] objArr9822 = new java.lang.Object[1];
            c("ퟂὊ䃪⥗ᛚ\ue3bd䛖", "뒟ᠦ諍။", 9956 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "䏽氕\uda3e쭫", (char) android.view.KeyEvent.keyCodeFromString(str2), objArr9822);
            java.lang.String intern3022 = ((java.lang.String) objArr9822[0]).intern();
            java.lang.Object[] objArr9922 = new java.lang.Object[1];
            c("챯楘桐\uf610喯趤뒡蹑㩶ﵱ橩", "韇Ǝ뵩\ueff3", android.view.View.MeasureSpec.getSize(0) + 1761709719, "䏽氕\uda3e쭫", (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr9922);
            java.lang.String intern3122 = ((java.lang.String) objArr9922[0]).intern();
            java.lang.Object[] objArr10022 = new java.lang.Object[1];
            b("嘒嘽⚴⛭㈔㈹眞眓囎☃㊅瘗圱➬㏙皾", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr10022);
            java.lang.String intern3222 = ((java.lang.String) objArr10022[0]).intern();
            java.lang.Object[] objArr10122 = new java.lang.Object[1];
            b("\u0cbbಔ₅⃜쨺쨗礼礱౧′쪫砵ඓ↝쯷碜", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr10122);
            java.lang.String intern3322 = ((java.lang.String) objArr10122[0]).intern();
            java.lang.Object[] objArr10222 = new java.lang.Object[1];
            b("띏띠ỻầ讝讬駊駚랃Ṇ謓飃뙽Ῠ詗", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr10222);
            java.lang.String intern3422 = ((java.lang.String) objArr10222[0]).intern();
            java.lang.Object[] objArr10322 = new java.lang.Object[1];
            b("떊떥멲먫疵疃ឥឲ때", android.view.View.resolveSize(0, 0), objArr10322);
            java.lang.String intern3522 = ((java.lang.String) objArr10322[0]).intern();
            java.lang.Object[] objArr10422 = new java.lang.Object[1];
            b("鐌鐣뫝몒軳軓㤿㤢", android.view.ViewConfiguration.getTouchSlop() >> 8, objArr10422);
            java.lang.String[] strArr222 = {intern3022, intern3122, intern3222, intern3322, intern3422, intern3522, ((java.lang.String) objArr10422[0]).intern()};
            i3 = 0;
            while (true) {
                if (i3 >= 7) {
                }
                i3++;
            }
            if (i4 != 0) {
            }
        } catch (java.lang.Throwable th11) {
            java.lang.Throwable cause5 = th11.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th11;
        }
    }

    static void init$1() {
        $$d = new byte[]{89, 16, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -117};
        $$e = 9;
    }

    static void init$0() {
        $$a = new byte[]{117, -13, -118, com.google.common.base.Ascii.RS, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10};
        $$b = 36;
    }

    public final byte[] values() {
        return (byte[]) values(new java.lang.Object[]{this}, -2088075802, 2088075802, java.lang.System.identityHashCode(this));
    }
}
