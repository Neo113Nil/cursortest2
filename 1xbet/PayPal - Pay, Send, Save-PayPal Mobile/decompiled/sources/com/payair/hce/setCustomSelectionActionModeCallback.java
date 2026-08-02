package com.payair.hce;

/* loaded from: classes4.dex */
public final class setCustomSelectionActionModeCallback implements com.payair.hce.setMaxWidth {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static long getAid;
    private static char valueOf;
    private static char values;
    private static char writeReplace;
    private com.payair.hce.setHighlights DigitizedCardProfile;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = s + 4;
        int i5 = i * 2;
        int i6 = i2 + 65;
        char[] cArr = new char[35 - i5];
        int i7 = 34 - i5;
        if (bArr == null) {
            int i8 = i4;
            int i9 = i7;
            int i10 = 0;
            int i11 = (i9 + i4) - 2;
            i3 = i10;
            int i12 = i8;
            i6 = i11;
            i4 = i12;
            cArr[i3] = (char) i6;
            int i13 = i4 + 1;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            int i14 = i6;
            i8 = i13;
            i4 = bArr[i13];
            i10 = i3 + 1;
            i9 = i14;
            int i112 = (i9 + i4) - 2;
            i3 = i10;
            int i122 = i8;
            i6 = i112;
            i4 = i122;
            cArr[i3] = (char) i6;
            int i132 = i4 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            cArr[i3] = (char) i6;
            int i1322 = i4 + 1;
            if (i3 == i7) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = 119 - i2;
        int i6 = (i * 3) + 1;
        int i7 = 4 - (b * 3);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            i5 = i6;
            int i8 = i7;
            i4 = 0;
            i5 += -i7;
            i7 = i8 + 1;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = i7;
            i7 = bArr[i7];
            i5 += -i7;
            i7 = i8 + 1;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    setCustomSelectionActionModeCallback(com.payair.hce.setHighlights sethighlights) {
        this.DigitizedCardProfile = sethighlights;
    }

    @Override // com.payair.hce.setTitleTextAppearance
    public final com.payair.hce.setEms RecordsJson() throws java.io.IOException {
        com.payair.hce.setCursorVisible setcursorvisible = new com.payair.hce.setCursorVisible(this.DigitizedCardProfile.values());
        int i = RecordsJson + 9;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return setcursorvisible;
        }
        throw null;
    }

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(getAid ^ (-3824242241614154557L), charArray, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            $11 = ($10 + 63) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(getAid)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionChild(0L) + 1922, (char) android.graphics.Color.red(0));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(0, 2, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.FS, 429 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (31610 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d(0, 0, (byte) 0, objArr5);
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
        java.lang.String str2 = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
        int i3 = $10 + 7;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    @Override // com.payair.hce.setShadowLayer
    public final com.payair.hce.setEms getAid() {
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 33) % 128;
        try {
            com.payair.hce.setEms RecordsJson2 = RecordsJson();
            SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 109) % 128;
            return RecordsJson2;
        } catch (java.io.IOException e) {
            throw new com.payair.hce.setLines(e.getMessage(), e);
        }
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i2 = $11 + 59;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            $10 = ($11 + 21) % 128;
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i3) ^ ((c2 << 4) + ((char) (values ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(writeReplace)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(61 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 1335 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(0, 9, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (valueOf ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                    int i5 = charValue + i3;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1335 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.text.TextUtils.getOffsetBefore("", 0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d(0, 9, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i3 -= 40503;
                    i4++;
                    $11 = ($10 + 41) % 128;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
            cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(54 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3542, (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        RecordsJson = 1;
        valueOf = (char) 3163;
        AlternateContactlessPaymentDataJson = (char) 37033;
        values = (char) 40786;
        writeReplace = (char) 37893;
        getAid = 6835759253422821951L;
    }

    static void init$1() {
        $$d = new byte[]{57, 59, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 75};
        $$e = 183;
    }

    static void init$0() {
        $$a = new byte[]{124, -43, -124, -86, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10};
        $$b = 73;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x12fd, code lost:
    
        if (((((int) (r14 >> 32)) & (((((((~((-2124632630) | r2)) | 1443037749) | (~((-5811339) | r5))) * 886) + 1895284760) + (((~(2124632629 | r5)) | (-687406219)) * (-1772))) + ((~((-687406219) | r5)) * 886))) | (((int) r14) & (((((25231633 | r7) * (-280)) - 1422644623) + (((~(1378145390 | r2)) | (~(59081019 | r2))) * 140)) + ((((~(r5 | (-25231634))) | (~(1403377023 | r2))) | (~((-1344296005) | r5))) * 140)))) == 477111747) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x2690, code lost:
    
        if (r11 == null) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0bd0, code lost:
    
        if (r4.equals(((java.lang.String) r8[0]).intern()) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x07d5, code lost:
    
        if (((((int) r3) & ((((((~((-1358880566) | r7)) | ((~(r7 | 78345844)) | 1347717377)) * 464) + 1395117189) + ((1426063221 | r1) * (-464))) + (((~((-1358880566) | r1)) | 1347717377) * 464))) | (((int) (r3 >> 32)) & ((((((~(1652955189 | r1)) | (~((-1204785696) | r7))) * (-1808)) + 18929658) + (((~(1741658687 | r1)) | (~((-1116082198) | r7))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(1204785695 | r1)) | 88703498) | (~((-1652955190) | r7))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)))) != 477111747) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x09fc, code lost:
    
        if (((((int) r3) & (((((~((-71303330) | r1)) * 623) - 428588666) + ((r7 | (-1609215744)) * (-623))) + ((((~((-121646332) | r1)) | 71303329) | (~((-1558872742) | r1))) * 623))) | (((int) (r3 >> 32)) & (((((~((-1989125741) | r1)) | (-1449850542)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 699740362) + (((~((-1989125741) | r7)) | (-1449850542)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE)))) == 542074309) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0205, code lost:
    
        if (((((int) r3) & ((((((~(1967019674 | r1)) | 65825) * (-140)) + 531292507) + ((~(1967085499 | r1)) * 70)) + (((~(890721211 | r1)) | 1076430113) * 70))) | (((int) (r3 >> 32)) & (((((~(1333599260 | r7)) | (-1610456637)) * (-241)) + 537152121) + (((~(r7 | (-276857377))) | 86315012) * 241)))) != 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x1543 A[Catch: all -> 0x3b5a, TryCatch #11 {all -> 0x3b5a, blocks: (B:4:0x0031, B:6:0x0040, B:7:0x0080, B:11:0x0221, B:13:0x0262, B:14:0x02b0, B:19:0x02dd, B:21:0x02f0, B:22:0x0338, B:33:0x039a, B:35:0x03aa, B:36:0x03f4, B:38:0x0416, B:40:0x0426, B:41:0x0475, B:45:0x048a, B:47:0x04a4, B:48:0x04f4, B:54:0x0a1e, B:56:0x0a31, B:57:0x0a81, B:64:0x0bea, B:66:0x0c1f, B:67:0x0c68, B:72:0x0f0f, B:74:0x0f22, B:75:0x0f6d, B:84:0x0fce, B:86:0x0fe1, B:87:0x1033, B:89:0x1052, B:91:0x1065, B:92:0x10ae, B:94:0x10b7, B:96:0x10d5, B:97:0x112c, B:101:0x11e1, B:103:0x11ff, B:104:0x1250, B:111:0x132a, B:113:0x133d, B:114:0x1390, B:126:0x146b, B:128:0x149b, B:129:0x14e8, B:133:0x1530, B:135:0x1543, B:136:0x1592, B:138:0x164e, B:140:0x1661, B:141:0x16b4, B:149:0x1779, B:151:0x17ab, B:152:0x17f6, B:156:0x1823, B:158:0x1836, B:159:0x1883, B:161:0x190e, B:163:0x1921, B:164:0x196d, B:172:0x1a32, B:174:0x1a6c, B:175:0x1abb, B:182:0x1b77, B:184:0x1b8a, B:185:0x1bdb, B:193:0x1ca5, B:195:0x1ce9, B:196:0x1d37, B:219:0x1f63, B:221:0x1fa4, B:222:0x1ff3, B:226:0x2024, B:228:0x2037, B:229:0x2080, B:242:0x21ef, B:244:0x2202, B:245:0x224f, B:254:0x22f0, B:256:0x2323, B:257:0x236f, B:261:0x23a5, B:263:0x23ce, B:264:0x2427, B:270:0x24e0, B:272:0x251b, B:273:0x2561, B:299:0x25e2, B:301:0x261e, B:302:0x2668, B:305:0x2695, B:307:0x26a4, B:308:0x26ed, B:312:0x27a3, B:314:0x27df, B:315:0x282a, B:319:0x2841, B:321:0x285a, B:322:0x28a3, B:326:0x2962, B:328:0x29aa, B:329:0x29f0, B:332:0x2a06, B:334:0x2a15, B:335:0x2a5c, B:339:0x2b1c, B:341:0x2b5b, B:342:0x2ba4, B:345:0x2bba, B:347:0x2bc9, B:348:0x2c14, B:352:0x2cc5, B:354:0x2cf3, B:355:0x2d3c, B:358:0x2d52, B:360:0x2d61, B:361:0x2daa, B:365:0x2e69, B:367:0x2ea3, B:368:0x2eee, B:372:0x2f25, B:374:0x2f4f, B:375:0x2fa9, B:379:0x3066, B:381:0x3093, B:382:0x30e3, B:386:0x3111, B:388:0x3124, B:389:0x3171, B:393:0x3235, B:395:0x3265, B:396:0x32b1, B:399:0x32c7, B:401:0x32d6, B:402:0x3322, B:406:0x33db, B:408:0x3411, B:409:0x345a, B:412:0x3470, B:414:0x347f, B:415:0x34c5, B:419:0x3584, B:421:0x35c0, B:422:0x360e, B:425:0x3624, B:427:0x3633, B:428:0x367e, B:432:0x3727, B:434:0x375d, B:435:0x37ad, B:438:0x37c3, B:440:0x37d2, B:441:0x3818, B:447:0x38c7, B:449:0x390f, B:450:0x3958, B:452:0x396d, B:454:0x3980, B:455:0x39cc, B:457:0x39d4, B:459:0x39f8, B:460:0x3a5c, B:465:0x3abd, B:467:0x3aed, B:468:0x3b3a, B:554:0x0b44, B:556:0x0b57, B:557:0x0bae, B:562:0x06a6, B:564:0x06c1, B:565:0x0713, B:568:0x07d9, B:570:0x07f7, B:571:0x084d, B:575:0x0900, B:577:0x091e, B:578:0x096f, B:582:0x05a8, B:584:0x05c5, B:585:0x0614, B:591:0x0112, B:593:0x0125, B:594:0x016f), top: B:2:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x1661 A[Catch: all -> 0x3b5a, TryCatch #11 {all -> 0x3b5a, blocks: (B:4:0x0031, B:6:0x0040, B:7:0x0080, B:11:0x0221, B:13:0x0262, B:14:0x02b0, B:19:0x02dd, B:21:0x02f0, B:22:0x0338, B:33:0x039a, B:35:0x03aa, B:36:0x03f4, B:38:0x0416, B:40:0x0426, B:41:0x0475, B:45:0x048a, B:47:0x04a4, B:48:0x04f4, B:54:0x0a1e, B:56:0x0a31, B:57:0x0a81, B:64:0x0bea, B:66:0x0c1f, B:67:0x0c68, B:72:0x0f0f, B:74:0x0f22, B:75:0x0f6d, B:84:0x0fce, B:86:0x0fe1, B:87:0x1033, B:89:0x1052, B:91:0x1065, B:92:0x10ae, B:94:0x10b7, B:96:0x10d5, B:97:0x112c, B:101:0x11e1, B:103:0x11ff, B:104:0x1250, B:111:0x132a, B:113:0x133d, B:114:0x1390, B:126:0x146b, B:128:0x149b, B:129:0x14e8, B:133:0x1530, B:135:0x1543, B:136:0x1592, B:138:0x164e, B:140:0x1661, B:141:0x16b4, B:149:0x1779, B:151:0x17ab, B:152:0x17f6, B:156:0x1823, B:158:0x1836, B:159:0x1883, B:161:0x190e, B:163:0x1921, B:164:0x196d, B:172:0x1a32, B:174:0x1a6c, B:175:0x1abb, B:182:0x1b77, B:184:0x1b8a, B:185:0x1bdb, B:193:0x1ca5, B:195:0x1ce9, B:196:0x1d37, B:219:0x1f63, B:221:0x1fa4, B:222:0x1ff3, B:226:0x2024, B:228:0x2037, B:229:0x2080, B:242:0x21ef, B:244:0x2202, B:245:0x224f, B:254:0x22f0, B:256:0x2323, B:257:0x236f, B:261:0x23a5, B:263:0x23ce, B:264:0x2427, B:270:0x24e0, B:272:0x251b, B:273:0x2561, B:299:0x25e2, B:301:0x261e, B:302:0x2668, B:305:0x2695, B:307:0x26a4, B:308:0x26ed, B:312:0x27a3, B:314:0x27df, B:315:0x282a, B:319:0x2841, B:321:0x285a, B:322:0x28a3, B:326:0x2962, B:328:0x29aa, B:329:0x29f0, B:332:0x2a06, B:334:0x2a15, B:335:0x2a5c, B:339:0x2b1c, B:341:0x2b5b, B:342:0x2ba4, B:345:0x2bba, B:347:0x2bc9, B:348:0x2c14, B:352:0x2cc5, B:354:0x2cf3, B:355:0x2d3c, B:358:0x2d52, B:360:0x2d61, B:361:0x2daa, B:365:0x2e69, B:367:0x2ea3, B:368:0x2eee, B:372:0x2f25, B:374:0x2f4f, B:375:0x2fa9, B:379:0x3066, B:381:0x3093, B:382:0x30e3, B:386:0x3111, B:388:0x3124, B:389:0x3171, B:393:0x3235, B:395:0x3265, B:396:0x32b1, B:399:0x32c7, B:401:0x32d6, B:402:0x3322, B:406:0x33db, B:408:0x3411, B:409:0x345a, B:412:0x3470, B:414:0x347f, B:415:0x34c5, B:419:0x3584, B:421:0x35c0, B:422:0x360e, B:425:0x3624, B:427:0x3633, B:428:0x367e, B:432:0x3727, B:434:0x375d, B:435:0x37ad, B:438:0x37c3, B:440:0x37d2, B:441:0x3818, B:447:0x38c7, B:449:0x390f, B:450:0x3958, B:452:0x396d, B:454:0x3980, B:455:0x39cc, B:457:0x39d4, B:459:0x39f8, B:460:0x3a5c, B:465:0x3abd, B:467:0x3aed, B:468:0x3b3a, B:554:0x0b44, B:556:0x0b57, B:557:0x0bae, B:562:0x06a6, B:564:0x06c1, B:565:0x0713, B:568:0x07d9, B:570:0x07f7, B:571:0x084d, B:575:0x0900, B:577:0x091e, B:578:0x096f, B:582:0x05a8, B:584:0x05c5, B:585:0x0614, B:591:0x0112, B:593:0x0125, B:594:0x016f), top: B:2:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x1754  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x1836 A[Catch: all -> 0x3b5a, TryCatch #11 {all -> 0x3b5a, blocks: (B:4:0x0031, B:6:0x0040, B:7:0x0080, B:11:0x0221, B:13:0x0262, B:14:0x02b0, B:19:0x02dd, B:21:0x02f0, B:22:0x0338, B:33:0x039a, B:35:0x03aa, B:36:0x03f4, B:38:0x0416, B:40:0x0426, B:41:0x0475, B:45:0x048a, B:47:0x04a4, B:48:0x04f4, B:54:0x0a1e, B:56:0x0a31, B:57:0x0a81, B:64:0x0bea, B:66:0x0c1f, B:67:0x0c68, B:72:0x0f0f, B:74:0x0f22, B:75:0x0f6d, B:84:0x0fce, B:86:0x0fe1, B:87:0x1033, B:89:0x1052, B:91:0x1065, B:92:0x10ae, B:94:0x10b7, B:96:0x10d5, B:97:0x112c, B:101:0x11e1, B:103:0x11ff, B:104:0x1250, B:111:0x132a, B:113:0x133d, B:114:0x1390, B:126:0x146b, B:128:0x149b, B:129:0x14e8, B:133:0x1530, B:135:0x1543, B:136:0x1592, B:138:0x164e, B:140:0x1661, B:141:0x16b4, B:149:0x1779, B:151:0x17ab, B:152:0x17f6, B:156:0x1823, B:158:0x1836, B:159:0x1883, B:161:0x190e, B:163:0x1921, B:164:0x196d, B:172:0x1a32, B:174:0x1a6c, B:175:0x1abb, B:182:0x1b77, B:184:0x1b8a, B:185:0x1bdb, B:193:0x1ca5, B:195:0x1ce9, B:196:0x1d37, B:219:0x1f63, B:221:0x1fa4, B:222:0x1ff3, B:226:0x2024, B:228:0x2037, B:229:0x2080, B:242:0x21ef, B:244:0x2202, B:245:0x224f, B:254:0x22f0, B:256:0x2323, B:257:0x236f, B:261:0x23a5, B:263:0x23ce, B:264:0x2427, B:270:0x24e0, B:272:0x251b, B:273:0x2561, B:299:0x25e2, B:301:0x261e, B:302:0x2668, B:305:0x2695, B:307:0x26a4, B:308:0x26ed, B:312:0x27a3, B:314:0x27df, B:315:0x282a, B:319:0x2841, B:321:0x285a, B:322:0x28a3, B:326:0x2962, B:328:0x29aa, B:329:0x29f0, B:332:0x2a06, B:334:0x2a15, B:335:0x2a5c, B:339:0x2b1c, B:341:0x2b5b, B:342:0x2ba4, B:345:0x2bba, B:347:0x2bc9, B:348:0x2c14, B:352:0x2cc5, B:354:0x2cf3, B:355:0x2d3c, B:358:0x2d52, B:360:0x2d61, B:361:0x2daa, B:365:0x2e69, B:367:0x2ea3, B:368:0x2eee, B:372:0x2f25, B:374:0x2f4f, B:375:0x2fa9, B:379:0x3066, B:381:0x3093, B:382:0x30e3, B:386:0x3111, B:388:0x3124, B:389:0x3171, B:393:0x3235, B:395:0x3265, B:396:0x32b1, B:399:0x32c7, B:401:0x32d6, B:402:0x3322, B:406:0x33db, B:408:0x3411, B:409:0x345a, B:412:0x3470, B:414:0x347f, B:415:0x34c5, B:419:0x3584, B:421:0x35c0, B:422:0x360e, B:425:0x3624, B:427:0x3633, B:428:0x367e, B:432:0x3727, B:434:0x375d, B:435:0x37ad, B:438:0x37c3, B:440:0x37d2, B:441:0x3818, B:447:0x38c7, B:449:0x390f, B:450:0x3958, B:452:0x396d, B:454:0x3980, B:455:0x39cc, B:457:0x39d4, B:459:0x39f8, B:460:0x3a5c, B:465:0x3abd, B:467:0x3aed, B:468:0x3b3a, B:554:0x0b44, B:556:0x0b57, B:557:0x0bae, B:562:0x06a6, B:564:0x06c1, B:565:0x0713, B:568:0x07d9, B:570:0x07f7, B:571:0x084d, B:575:0x0900, B:577:0x091e, B:578:0x096f, B:582:0x05a8, B:584:0x05c5, B:585:0x0614, B:591:0x0112, B:593:0x0125, B:594:0x016f), top: B:2:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x1921 A[Catch: all -> 0x3b5a, TryCatch #11 {all -> 0x3b5a, blocks: (B:4:0x0031, B:6:0x0040, B:7:0x0080, B:11:0x0221, B:13:0x0262, B:14:0x02b0, B:19:0x02dd, B:21:0x02f0, B:22:0x0338, B:33:0x039a, B:35:0x03aa, B:36:0x03f4, B:38:0x0416, B:40:0x0426, B:41:0x0475, B:45:0x048a, B:47:0x04a4, B:48:0x04f4, B:54:0x0a1e, B:56:0x0a31, B:57:0x0a81, B:64:0x0bea, B:66:0x0c1f, B:67:0x0c68, B:72:0x0f0f, B:74:0x0f22, B:75:0x0f6d, B:84:0x0fce, B:86:0x0fe1, B:87:0x1033, B:89:0x1052, B:91:0x1065, B:92:0x10ae, B:94:0x10b7, B:96:0x10d5, B:97:0x112c, B:101:0x11e1, B:103:0x11ff, B:104:0x1250, B:111:0x132a, B:113:0x133d, B:114:0x1390, B:126:0x146b, B:128:0x149b, B:129:0x14e8, B:133:0x1530, B:135:0x1543, B:136:0x1592, B:138:0x164e, B:140:0x1661, B:141:0x16b4, B:149:0x1779, B:151:0x17ab, B:152:0x17f6, B:156:0x1823, B:158:0x1836, B:159:0x1883, B:161:0x190e, B:163:0x1921, B:164:0x196d, B:172:0x1a32, B:174:0x1a6c, B:175:0x1abb, B:182:0x1b77, B:184:0x1b8a, B:185:0x1bdb, B:193:0x1ca5, B:195:0x1ce9, B:196:0x1d37, B:219:0x1f63, B:221:0x1fa4, B:222:0x1ff3, B:226:0x2024, B:228:0x2037, B:229:0x2080, B:242:0x21ef, B:244:0x2202, B:245:0x224f, B:254:0x22f0, B:256:0x2323, B:257:0x236f, B:261:0x23a5, B:263:0x23ce, B:264:0x2427, B:270:0x24e0, B:272:0x251b, B:273:0x2561, B:299:0x25e2, B:301:0x261e, B:302:0x2668, B:305:0x2695, B:307:0x26a4, B:308:0x26ed, B:312:0x27a3, B:314:0x27df, B:315:0x282a, B:319:0x2841, B:321:0x285a, B:322:0x28a3, B:326:0x2962, B:328:0x29aa, B:329:0x29f0, B:332:0x2a06, B:334:0x2a15, B:335:0x2a5c, B:339:0x2b1c, B:341:0x2b5b, B:342:0x2ba4, B:345:0x2bba, B:347:0x2bc9, B:348:0x2c14, B:352:0x2cc5, B:354:0x2cf3, B:355:0x2d3c, B:358:0x2d52, B:360:0x2d61, B:361:0x2daa, B:365:0x2e69, B:367:0x2ea3, B:368:0x2eee, B:372:0x2f25, B:374:0x2f4f, B:375:0x2fa9, B:379:0x3066, B:381:0x3093, B:382:0x30e3, B:386:0x3111, B:388:0x3124, B:389:0x3171, B:393:0x3235, B:395:0x3265, B:396:0x32b1, B:399:0x32c7, B:401:0x32d6, B:402:0x3322, B:406:0x33db, B:408:0x3411, B:409:0x345a, B:412:0x3470, B:414:0x347f, B:415:0x34c5, B:419:0x3584, B:421:0x35c0, B:422:0x360e, B:425:0x3624, B:427:0x3633, B:428:0x367e, B:432:0x3727, B:434:0x375d, B:435:0x37ad, B:438:0x37c3, B:440:0x37d2, B:441:0x3818, B:447:0x38c7, B:449:0x390f, B:450:0x3958, B:452:0x396d, B:454:0x3980, B:455:0x39cc, B:457:0x39d4, B:459:0x39f8, B:460:0x3a5c, B:465:0x3abd, B:467:0x3aed, B:468:0x3b3a, B:554:0x0b44, B:556:0x0b57, B:557:0x0bae, B:562:0x06a6, B:564:0x06c1, B:565:0x0713, B:568:0x07d9, B:570:0x07f7, B:571:0x084d, B:575:0x0900, B:577:0x091e, B:578:0x096f, B:582:0x05a8, B:584:0x05c5, B:585:0x0614, B:591:0x0112, B:593:0x0125, B:594:0x016f), top: B:2:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x1a05  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x1b75  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x1c8c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x1d4d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x1f4a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x2009  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x1c89 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:547:0x1590  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0b26  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] valueOf$4956fc2a(int i, java.lang.Object obj) {
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.Integer num3;
        java.lang.Integer num4;
        int i2;
        java.lang.String str;
        java.lang.Integer num5;
        java.lang.Object obj2;
        java.lang.String str2;
        long j;
        long j2;
        int i3;
        long j3;
        java.lang.Object obj3;
        java.lang.Object obj4;
        long j4;
        java.lang.Object obj5;
        java.lang.String[] strArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        java.lang.Throwable th;
        java.io.BufferedInputStream bufferedInputStream;
        java.io.BufferedInputStream bufferedInputStream2;
        long j5;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        int parseInt;
        java.lang.String[] strArr2;
        java.lang.String[] strArr3;
        java.lang.Integer num6;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Integer num7;
        java.lang.CharSequence charSequence;
        int i10;
        char c;
        int i11 = i;
        int i12 = RecordsJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        SdkCoreAlternateContactlessPaymentDataImpl = i12 % 128;
        try {
            if (i12 % 2 != 0) {
                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
                if (obj9 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 26, 1839 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.text.TextUtils.getOffsetBefore("", 0));
                    byte[] bArr = $$a;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a((byte) (-bArr[14]), (byte) (-bArr[16]), 653, objArr3);
                    obj9 = cls.getMethod((java.lang.String) objArr3[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, obj9);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, null)).longValue();
                long j6 = ~longValue;
                num = -2032622553;
                long j7 = ~(j6 | 1002211043);
                long j8 = i11;
                num2 = 0;
                long j9 = ((-575) * longValue) + 576271350300L + (((~(j6 | j8)) | j7) * 576) + (((~(1002211043 | longValue)) | (((j6 | (~j8)) | (-1002211044)) ^ (-1))) * 576) + (j7 * 576) + 1842289989;
                int i13 = ~i11;
                num3 = 16;
                if (((((int) j9) & (((r4 * 495) - 1148588418) + (((~((-663573317) | i13)) | (-798839654)) * 495))) | (((int) (j9 >>> 17)) & ((((~(48201857 | i13)) | (-1485428269)) * (-865)) + 1992061884 + ((~((-48201858) | i11)) * 865) + (((~(i13 | (-1485428269))) | (~((-48201858) | i13))) * 865)))) != 0) {
                    java.lang.Object[] objArr4 = {new int[]{i11}, new int[]{i11 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, null, new int[1]};
                    java.lang.Object[] objArr5 = {num, num3, java.lang.Integer.valueOf((((~((-747141217) | (~i11))) | (~((-37815697) | i11))) * (-272)) + 271682943 + (((~((-1017051750) | i11)) | 269910533) * (-272)) + (((~(i11 | 1017051749)) | (-307726230)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))};
                    java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj10 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 50, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2712, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        byte b = (byte) (-$$a[14]);
                        byte b2 = (byte) (b + 1);
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        a(b, b2, b2, objArr6);
                        obj10 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
                    }
                    ((int[]) objArr4[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr5)).intValue();
                    return objArr4;
                }
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b("᰽췄ﯗꠥ謹ۍ瓏牯謹ۍ\uf09e랦", android.view.KeyEvent.normalizeMetaState(0) + 11, objArr7);
                java.lang.Object[] objArr8 = {((java.lang.String) objArr7[0]).intern()};
                int i14 = 609763459;
                java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj11 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 40, android.view.View.MeasureSpec.getMode(0) + 1921, (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                    byte[] bArr2 = $$a;
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a((byte) (-bArr2[14]), (byte) (-bArr2[16]), 653, objArr9);
                    obj11 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj11);
                }
                java.lang.String str3 = (java.lang.String) ((java.lang.reflect.Method) obj11).invoke(null, objArr8);
                int i15 = -1118958177;
                if (str3 != null) {
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    c("뼶콴뽄\ue9e9ைタ⒮෭䙞䐨", android.view.View.MeasureSpec.getSize(0), objArr10);
                    java.lang.String intern = ((java.lang.String) objArr10[0]).intern();
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    c("礓ꮜ祴贏\uf224珘\ue285椙뾰嘫ោ݈", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr11);
                    java.lang.String[] strArr4 = {intern, ((java.lang.String) objArr11[0]).intern()};
                    int i16 = 0;
                    while (true) {
                        if (i16 >= 2) {
                            break;
                        }
                        if (str3.contains(strArr4[i16])) {
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            b("᰽췄㸈瓿᰽췄⻎\uf5e1휼\uf766ݮ\u082f痟\ue289洊䍄ꮡ⿈\uebb8鋓㧫闒⽬㡊", 23 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr12);
                            java.lang.Object[] objArr13 = {((java.lang.String) objArr12[0]).intern()};
                            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(java.lang.Integer.valueOf(i14));
                            if (obj12 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.widget.ExpandableListView.getPackedPositionChild(0L), 1921 - android.graphics.Color.green(0), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1));
                                byte[] bArr3 = $$a;
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                a((byte) (-bArr3[14]), (byte) (-bArr3[16]), 653, objArr14);
                                obj12 = cls4.getMethod((java.lang.String) objArr14[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(java.lang.Integer.valueOf(i14), obj12);
                            }
                            java.lang.Object invoke = ((java.lang.reflect.Method) obj12).invoke(null, objArr13);
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            c("\udeb9┾\udecbέ殲쒟䔻\ue7bd♤쿨ꂊ뀛\ue93a箖ꎒ\u1cbcഐ\udf81ߘ\uf8ba넔뎬鮱哎핧៧羪マ祺\uebd6펉곽鵌俀", 1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr15);
                            java.lang.Object[] objArr16 = {((java.lang.String) objArr15[0]).intern()};
                            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(java.lang.Integer.valueOf(i14));
                            if (obj13 == null) {
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 40, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1920, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                                byte[] bArr4 = $$a;
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                a((byte) (-bArr4[14]), (byte) (-bArr4[16]), 653, objArr17);
                                obj13 = cls5.getMethod((java.lang.String) objArr17[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(java.lang.Integer.valueOf(i14), obj13);
                            }
                            java.lang.Object invoke2 = ((java.lang.reflect.Method) obj13).invoke(null, objArr16);
                            if (invoke != null) {
                                int i17 = RecordsJson + 19;
                                SdkCoreAlternateContactlessPaymentDataImpl = i17 % 128;
                                if (i17 % 2 != 0) {
                                    java.lang.Object[] objArr18 = {invoke, 55};
                                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(java.lang.Integer.valueOf(i15));
                                    if (obj14 == null) {
                                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 2594, (char) android.view.View.MeasureSpec.getSize(0));
                                        byte[] bArr5 = $$a;
                                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                                        a((byte) (-bArr5[14]), (byte) (-bArr5[16]), 653, objArr19);
                                        obj14 = cls6.getMethod((java.lang.String) objArr19[0], java.lang.String.class, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(java.lang.Integer.valueOf(i15), obj14);
                                    }
                                    long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj14).invoke(null, objArr18)).longValue();
                                    long j10 = ~longValue2;
                                    long j11 = i11;
                                    obj7 = invoke;
                                    long j12 = (319 * longValue2) + 172088282982L + (((~(j10 | 542865245 | j11)) | (~(longValue2 | (~j11) | (-542865246)))) * (-318)) + (((~(j10 | (-542865246))) | (~((-542865246) | j11))) * (-318)) + ((j10 | (~(542865245 | j11))) * 318) + 1799965770;
                                    if (((((int) j12) & (((((~((-168859075) | r8)) | (~(1268367335 | i11))) * (-318)) - 24608305) + (((~((-194093031) | i11)) | 25233956) * (-318)) + (((~(194093030 | i11)) | 1243133379) * 318))) | (((int) (j12 << 77)) & ((((-16777513) | i11) * (-627)) + 635053320 + (((~(1097253821 | i11)) | (-1760487064)) * (-627)) + (((~((-1760487064) | i11)) | (~((-1097253822) | (~i11)))) * 627)))) == 477111747) {
                                        if (android.os.Build.VERSION.SDK_INT > 33) {
                                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                                            c("⍘ꀓ⍷蚊儤뙗뢇抖Შ\uf52e퉍싀ᓌﻠ餜湸\uf0e3媻㵍詠䳽㛍ꅥ☓⢏鋞䕢䈈蒝溡\ue942\ude37", android.view.ViewConfiguration.getTapTimeout() >> 16, objArr20);
                                            java.lang.Object[] objArr21 = {((java.lang.String) objArr20[0]).intern()};
                                            java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                            if (obj15 == null) {
                                                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.view.View.MeasureSpec.getMode(0) + 3161, (char) (33098 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                                byte[] bArr6 = $$a;
                                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                                a((byte) (-bArr6[14]), (byte) (-bArr6[16]), 653, objArr22);
                                                obj15 = cls7.getMethod((java.lang.String) objArr22[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj15);
                                            }
                                            long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj15).invoke(null, objArr21)).longValue();
                                            long j13 = ~longValue3;
                                            long j14 = i11;
                                            long j15 = ~j14;
                                            long j16 = ~(j13 | 138967830);
                                            num7 = -1347122530;
                                            long j17 = (((((longValue3 * (-463)) + 64620040950L) + ((((~(j13 | j15)) | j16) | (~(j15 | 138967830))) * 464)) + ((((-138967831) | j14) | j13) * (-464))) + (((~(j14 | 138967830)) | j16) * 464)) - 1476635938;
                                            int i18 = (int) (j17 >> 32);
                                            int i19 = ~i11;
                                            if (((i18 & ((((((~(1036759419 | i11)) | (-2110519804)) * 576) - 1771464918) + (((~((-1073760385) | i19)) | 289538338) * 576)) - 183662336)) | (((int) j17) & ((((~((-1327192869) | i11)) | (-110033542)) * 56) + 357873373 + (((~(i19 | (-110033542))) | (-1327192869)) * 56)))) == 1) {
                                                int i20 = SdkCoreAlternateContactlessPaymentDataImpl + 101;
                                                RecordsJson = i20 % 128;
                                                if (i20 % 2 != 0) {
                                                    charSequence = "";
                                                    c = 0;
                                                    i10 = 1;
                                                    int[] iArr = new int[i10];
                                                    int[] iArr2 = new int[i10];
                                                    iArr[c] = i11;
                                                    iArr2[c] = i11 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                                    java.lang.Object[] objArr23 = {iArr, iArr2, null, new int[i10]};
                                                    java.lang.Object[] objArr24 = {num, num3, java.lang.Integer.valueOf(((((~((~i11) | 810218384)) | 100728896) * 529) - 2014595920) + (((~(i11 | 810218384)) | 100892864) * 529))};
                                                    java.lang.Integer num8 = num7;
                                                    java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num8);
                                                    if (obj16 == null) {
                                                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 50, android.text.TextUtils.getOffsetBefore(charSequence, 0) + 2713, (char) android.view.View.getDefaultSize(0, 0));
                                                        byte b3 = (byte) (-$$a[14]);
                                                        byte b4 = (byte) (b3 + 1);
                                                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                        a(b3, b4, b4, objArr25);
                                                        obj16 = cls8.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num8, obj16);
                                                    }
                                                    ((int[]) objArr23[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr24)).intValue();
                                                    return objArr23;
                                                }
                                            }
                                            num4 = num7;
                                        } else {
                                            num7 = -1347122530;
                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                            b("᰽췄䑾\ue998㗖飛踨䈂췑ﬆⷜ祥\uf09e랦", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 13, objArr26);
                                            java.lang.Object[] objArr27 = {((java.lang.String) objArr26[0]).intern()};
                                            java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj17 == null) {
                                                charSequence = "";
                                                java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.text.TextUtils.lastIndexOf(charSequence, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1922, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                                                byte[] bArr7 = $$a;
                                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                a((byte) (-bArr7[14]), (byte) (-bArr7[16]), 653, objArr28);
                                                obj17 = cls9.getMethod((java.lang.String) objArr28[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj17);
                                            } else {
                                                charSequence = "";
                                            }
                                            java.lang.Object invoke3 = ((java.lang.reflect.Method) obj17).invoke(null, objArr27);
                                            i10 = 1;
                                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                                            c("嗢唭琢䓸\ue6d2", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr29);
                                            c = 0;
                                        }
                                    }
                                } else {
                                    obj7 = invoke;
                                    java.lang.Object[] objArr30 = {obj7, 42};
                                    java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(java.lang.Integer.valueOf(i15));
                                    if (obj18 == null) {
                                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 28, 2594 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.view.View.MeasureSpec.getSize(0));
                                        byte[] bArr8 = $$a;
                                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                                        a((byte) (-bArr8[14]), (byte) (-bArr8[16]), 653, objArr31);
                                        obj18 = cls10.getMethod((java.lang.String) objArr31[0], java.lang.String.class, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(java.lang.Integer.valueOf(i15), obj18);
                                    }
                                    long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj18).invoke(null, objArr30)).longValue();
                                    long j18 = i11;
                                    long j19 = (434 * longValue4) + 31181648544L + ((~((~j18) | 72179741 | longValue4)) * 433) + (((~((~longValue4) | j18)) | 72179741) * (-433)) + (((~(72179741 | j18)) | (~(longValue4 | (-72179742)))) * 433) + 1329280266;
                                    int i21 = (int) (j19 >> 32);
                                    int i22 = ~i11;
                                    int i23 = ~(1570775539 | i22);
                                    if (((i21 & ((((-133549129) | i23) * 764) + 1118501526 + (((~(i22 | (-133549129))) | 94371904) * (-1528)) + (((-1515580860) | i23) * 764))) | (((int) j19) & (((((~((-158080118) | i11)) | 151261205) * (-283)) - 1579978356) + ((~((-6818913) | i11)) * 283)))) != 477111747) {
                                    }
                                    if (android.os.Build.VERSION.SDK_INT > 33) {
                                    }
                                }
                            } else {
                                obj7 = invoke;
                            }
                            if (invoke2 != null) {
                                java.lang.Object[] objArr32 = {invoke2, 42};
                                java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(java.lang.Integer.valueOf(i15));
                                if (obj19 == null) {
                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28, 2594 - android.text.TextUtils.getOffsetAfter("", 0), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                    byte[] bArr9 = $$a;
                                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                                    a((byte) (-bArr9[14]), (byte) (-bArr9[16]), 653, objArr33);
                                    obj19 = cls11.getMethod((java.lang.String) objArr33[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(java.lang.Integer.valueOf(i15), obj19);
                                }
                                long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr32)).longValue();
                                long j20 = i11;
                                long j21 = ~j20;
                                long j22 = ~longValue5;
                                long j23 = j22 | (-1150450955);
                                long j24 = (868 * longValue5) + 998591428072L + (((~(j21 | (-1150450955))) | (~(j22 | j21))) * (-867)) + (((~j23) | (~((-1150450955) | j20)) | (~(j22 | j20))) * (-1734)) + (((~(j22 | 1150450954 | j20)) | (~(j23 | j21)) | (~(longValue5 | (-1150450955) | j20))) * 867) + 106649570;
                                int i24 = ~i11;
                            }
                            if (obj7 != null) {
                                java.lang.Object[] objArr34 = {obj7, 42};
                                java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj20 == null) {
                                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 2594 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                                    byte[] bArr10 = $$a;
                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                    a((byte) (-bArr10[14]), (byte) (-bArr10[16]), 653, objArr35);
                                    obj20 = cls12.getMethod((java.lang.String) objArr35[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj20);
                                }
                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, objArr34)).longValue();
                                long j25 = i11;
                                long j26 = ~longValue6;
                                long j27 = ~j25;
                                obj8 = invoke2;
                                long j28 = ((-675) * longValue6) + 391615108045L + ((j25 | 578456585 | j26) * (-676)) + (((~(j27 | 578456585)) | (~(j26 | 578456585))) * 676) + (((~(j26 | j27)) | (~((-578456586) | j26)) | (((longValue6 | 578456585) | j25) ^ (-1))) * 676) + 678643939;
                                int i25 = ~i11;
                                if (((((int) j28) & (((814625519 | i25) * (-757)) + 603862642 + ((~((-1229014273) | i11)) * 1514) + (((~(i25 | (-2043115367))) | 814101094 | (~(2043639791 | i11))) * 757))) | (((int) (j28 >> 32)) & ((((~((-824233285) | i11)) | 536905796) * 336) + 501358106 + (((~(612993126 | i11)) | (-900320615)) * (-168)) + (((~(612993126 | i25)) | (-824233285)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)))) != -1032769152) {
                                }
                                if (android.os.Build.VERSION.SDK_INT > 33) {
                                }
                            } else {
                                obj8 = invoke2;
                            }
                            if (obj8 != null) {
                                java.lang.Object[] objArr36 = {obj8, 42};
                                java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj21 == null) {
                                    java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 28, 2594 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) android.view.View.combineMeasuredStates(0, 0));
                                    byte[] bArr11 = $$a;
                                    java.lang.Object[] objArr37 = new java.lang.Object[1];
                                    a((byte) (-bArr11[14]), (byte) (-bArr11[16]), 653, objArr37);
                                    obj21 = cls13.getMethod((java.lang.String) objArr37[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj21);
                                }
                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, objArr36)).longValue();
                                long j29 = i11;
                                long j30 = ~j29;
                                long j31 = (((-215) * longValue7) - 144924832724L) + ((~(j29 | (-667856372))) * 216) + (((~longValue7) | (-667856372) | j30) * (-216)) + (((~((-667856372) | j30)) | longValue7) * 216) + 1924956896;
                                int i26 = ~i11;
                            }
                        } else {
                            i16++;
                            i15 = -1118958177;
                            i14 = 609763459;
                        }
                    }
                }
                num4 = -1347122530;
                java.lang.Object[] objArr38 = new java.lang.Object[1];
                c("꧲ꭴꦓ跬팜꘧㉩槽麆眗숛튌", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1, objArr38);
                java.lang.String intern2 = ((java.lang.String) objArr38[0]).intern();
                java.lang.Object[] objArr39 = new java.lang.Object[1];
                b("謹ۍ并窻杼帓", 6 - android.text.TextUtils.getTrimmedLength(""), objArr39);
                java.lang.String intern3 = ((java.lang.String) objArr39[0]).intern();
                java.lang.Object[] objArr40 = new java.lang.Object[1];
                c("拢⚸抆)\udd6fꖡ亮\ue426郢祮턦", android.view.View.getDefaultSize(0, 0), objArr40);
                java.lang.String intern4 = ((java.lang.String) objArr40[0]).intern();
                java.lang.Object[] objArr41 = new java.lang.Object[1];
                c("뽿\udaec뼘ﱴᯪ\ue5f7⓪ᡲ噰뿮臱酰裭", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr41);
                java.lang.String intern5 = ((java.lang.String) objArr41[0]).intern();
                java.lang.Object[] objArr42 = new java.lang.Object[1];
                c("ꨑ线꩸堧딳沃ㆍ밺\uf8a7᠔", (-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr42);
                java.lang.String intern6 = ((java.lang.String) objArr42[0]).intern();
                java.lang.Object[] objArr43 = new java.lang.Object[1];
                c("炯㢉烆ḛ≙ꋣ\ueb72度濈虅웥홣䜺昲\uea3e竅ꌜ", 1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr43);
                java.lang.String intern7 = ((java.lang.String) objArr43[0]).intern();
                java.lang.Object[] objArr44 = new java.lang.Object[1];
                c("\ued8b槓\uede2佀责見瘋삯躑", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, objArr44);
                java.lang.String intern8 = ((java.lang.String) objArr44[0]).intern();
                java.lang.Object[] objArr45 = new java.lang.Object[1];
                b("◧ꐫ郊ණ\uea37등", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 6, objArr45);
                java.lang.String intern9 = ((java.lang.String) objArr45[0]).intern();
                java.lang.Object[] objArr46 = new java.lang.Object[1];
                b("왎絲", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2, objArr46);
                java.lang.String intern10 = ((java.lang.String) objArr46[0]).intern();
                java.lang.Object[] objArr47 = new java.lang.Object[1];
                b("\ue603䨓︉㯵郊ණ䈊ᒫыꊎ䨌좈喽봃깧襥", 16 - android.view.View.MeasureSpec.getMode(0), objArr47);
                java.lang.String intern11 = ((java.lang.String) objArr47[0]).intern();
                java.lang.Object[] objArr48 = new java.lang.Object[1];
                c("鲭ᅊ鳁㟙℮⚭ܼ폁沱蔽䋧刭ꬿ俵", (-1) - android.graphics.ImageFormat.getBitsPerPixel(0), objArr48);
                java.lang.String intern12 = ((java.lang.String) objArr48[0]).intern();
                java.lang.Object[] objArr49 = new java.lang.Object[1];
                b("꒿㥤诀툎\u1879\ue824ꉜ\uf849", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 8, objArr49);
                java.lang.String intern13 = ((java.lang.String) objArr49[0]).intern();
                java.lang.Object[] objArr50 = new java.lang.Object[1];
                b("꒿㥤ﾟ锁쁵ꐯ\ue94fꨆ淲㶠쀸\ue6bd", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12, objArr50);
                java.lang.String intern14 = ((java.lang.String) objArr50[0]).intern();
                java.lang.Object[] objArr51 = new java.lang.Object[1];
                c("䤠䨭䥐沣\ud8da諭튳袮镍糉\ueef7ﹿ纥ᒒს勈骄낍", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr51);
                java.lang.String intern15 = ((java.lang.String) objArr51[0]).intern();
                java.lang.Object[] objArr52 = new java.lang.Object[1];
                b("㧫闒ോ燦䦂䀡ᆱꇠ", 8 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr52);
                java.lang.String intern16 = ((java.lang.String) objArr52[0]).intern();
                java.lang.Object[] objArr53 = new java.lang.Object[1];
                c("㾘䗅㿫捑쑺삎ꐅ蝈觭恵됍", android.graphics.Color.blue(0), objArr53);
                java.lang.String intern17 = ((java.lang.String) objArr53[0]).intern();
                java.lang.Object[] objArr54 = new java.lang.Object[1];
                b("礩흼\uea89\ue120댌窮옋ጠ", 7 - android.graphics.Color.alpha(0), objArr54);
                java.lang.String intern18 = ((java.lang.String) objArr54[0]).intern();
                java.lang.Object[] objArr55 = new java.lang.Object[1];
                c("烐\u0df9炣⭶ḟ즵", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, objArr55);
                java.lang.String intern19 = ((java.lang.String) objArr55[0]).intern();
                java.lang.Object[] objArr56 = new java.lang.Object[1];
                c("欯兙歜矑㜓꓄\uf0ab鏪窊錕샏큂岻\u0fed－糺뢐꯶嬩飧҈잀읜㒂", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1, objArr56);
                java.lang.String intern20 = ((java.lang.String) objArr56[0]).intern();
                java.lang.Object[] objArr57 = new java.lang.Object[1];
                c("䟚昺䞩䂲絪の\udc49꒳ム䓻", android.graphics.Color.red(0), objArr57);
                java.lang.String intern21 = ((java.lang.String) objArr57[0]).intern();
                java.lang.Object[] objArr58 = new java.lang.Object[1];
                c("\uf10a\ue9b6\uf179켿瑄笕", android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr58);
                java.lang.String intern22 = ((java.lang.String) objArr58[0]).intern();
                java.lang.Object[] objArr59 = new java.lang.Object[1];
                c("秲椃禁侞㿅\ue0ae\ue276ꮆ牓鯁蒲鐳习㟲\uf7f8㢓ꩃ鎻叮\udc84", 1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr59);
                java.lang.String intern23 = ((java.lang.String) objArr59[0]).intern();
                java.lang.Object[] objArr60 = new java.lang.Object[1];
                b("诳粚ꮡ⿈滚\uf040⬊ၭ⋗忯", android.graphics.ImageFormat.getBitsPerPixel(0) + 10, objArr60);
                java.lang.String intern24 = ((java.lang.String) objArr60[0]).intern();
                java.lang.Object[] objArr61 = new java.lang.Object[1];
                c("⮡ꖢ⯕茬烄\uf8e2뀴朾㵝퓔鳥豵ᰩרּ", android.view.Gravity.getAbsoluteGravity(0, 0), objArr61);
                java.lang.String intern25 = ((java.lang.String) objArr61[0]).intern();
                java.lang.Object[] objArr62 = new java.lang.Object[1];
                c("絸䮸紌洶璃둁\ue6ed褦㤚킝큇샖䫬ᔁ보", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr62);
                java.lang.String intern26 = ((java.lang.String) objArr62[0]).intern();
                java.lang.Object[] objArr63 = new java.lang.Object[1];
                c("簕겿籠設﬩瑑\ue78b渷뚦弑၁Ì䮛\uf205㌑", android.text.TextUtils.getOffsetBefore("", 0), objArr63);
                java.lang.String intern27 = ((java.lang.String) objArr63[0]).intern();
                java.lang.Object[] objArr64 = new java.lang.Object[1];
                c("㥡폌㤔\uf55e輷楷ꋿᅄ슸⬏ർᷪ\u0ee4起䜿녗\ueadf⥦\ue31f", android.graphics.ImageFormat.getBitsPerPixel(0) + 1, objArr64);
                java.lang.String intern28 = ((java.lang.String) objArr64[0]).intern();
                java.lang.Object[] objArr65 = new java.lang.Object[1];
                b("䦂䀡툾냃╙檍\ueea3᱕∦⫪텏爏Ṝ癹", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13, objArr65);
                java.lang.String[] strArr5 = {intern2, intern3, intern4, intern5, intern6, intern7, intern8, intern9, intern10, intern11, intern12, intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, ((java.lang.String) objArr65[0]).intern()};
                java.lang.Object[] objArr66 = new java.lang.Object[1];
                b("᰽췄ﯗꠥ謹ۍ瓏牯謹ۍ\uf09e랦", 11 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr66);
                java.lang.Object[] objArr67 = {((java.lang.String) objArr66[0]).intern()};
                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj22 == null) {
                    java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 40, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1922, (char) android.text.TextUtils.getCapsMode("", 0, 0));
                    byte[] bArr12 = $$a;
                    java.lang.Object[] objArr68 = new java.lang.Object[1];
                    a((byte) (-bArr12[14]), (byte) (-bArr12[16]), 653, objArr68);
                    obj22 = cls14.getMethod((java.lang.String) objArr68[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj22);
                }
                java.lang.String str4 = (java.lang.String) ((java.lang.reflect.Method) obj22).invoke(null, objArr67);
                if (str4 != null) {
                    SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 93) % 128;
                    int i27 = 0;
                    java.lang.Object[] objArr69 = new java.lang.Object[1];
                    c("뼶콴뽄\ue9e9ைタ⒮෭䙞䐨", android.view.View.MeasureSpec.getSize(0), objArr69);
                    java.lang.String intern29 = ((java.lang.String) objArr69[0]).intern();
                    java.lang.Object[] objArr70 = new java.lang.Object[1];
                    c("礓ꮜ祴贏\uf224珘\ue285椙뾰嘫ោ݈", android.text.TextUtils.indexOf("", "", 0, 0), objArr70);
                    java.lang.String[] strArr6 = {intern29, ((java.lang.String) objArr70[0]).intern()};
                    int i28 = 0;
                    for (int i29 = 2; i28 < i29; i29 = 2) {
                        if (str4.contains(strArr6[i28])) {
                            java.lang.Object[] objArr71 = new java.lang.Object[1];
                            b("᰽췄㸈瓿᰽췄⻎\uf5e1휼\uf766ݮ\u082f痟\ue289洊䍄ꮡ⿈\uebb8鋓㧫闒⽬㡊", 23 - android.graphics.drawable.Drawable.resolveOpacity(i27, i27), objArr71);
                            java.lang.Object[] objArr72 = {((java.lang.String) objArr71[i27]).intern()};
                            java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj23 == null) {
                                java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 40, 1921 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                byte[] bArr13 = $$a;
                                java.lang.Object[] objArr73 = new java.lang.Object[1];
                                a((byte) (-bArr13[14]), (byte) (-bArr13[16]), 653, objArr73);
                                obj23 = cls15.getMethod((java.lang.String) objArr73[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj23);
                            }
                            java.lang.Object invoke4 = ((java.lang.reflect.Method) obj23).invoke(null, objArr72);
                            java.lang.Object[] objArr74 = new java.lang.Object[1];
                            c("\udeb9┾\udecbέ殲쒟䔻\ue7bd♤쿨ꂊ뀛\ue93a箖ꎒ\u1cbcഐ\udf81ߘ\uf8ba넔뎬鮱哎핧៧羪マ祺\uebd6펉곽鵌俀", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, objArr74);
                            java.lang.Object[] objArr75 = {((java.lang.String) objArr74[0]).intern()};
                            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj24 == null) {
                                java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 40, 1920 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.text.TextUtils.getTrimmedLength(""));
                                byte[] bArr14 = $$a;
                                java.lang.Object[] objArr76 = new java.lang.Object[1];
                                a((byte) (-bArr14[14]), (byte) (-bArr14[16]), 653, objArr76);
                                obj24 = cls16.getMethod((java.lang.String) objArr76[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj24);
                            }
                            java.lang.Object invoke5 = ((java.lang.reflect.Method) obj24).invoke(null, objArr75);
                            if (invoke4 != null) {
                                java.lang.Object[] objArr77 = {invoke4, 42};
                                java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj25 == null) {
                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2594, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                    byte[] bArr15 = $$a;
                                    java.lang.Object[] objArr78 = new java.lang.Object[1];
                                    a((byte) (-bArr15[14]), (byte) (-bArr15[16]), 653, objArr78);
                                    obj25 = cls17.getMethod((java.lang.String) objArr78[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj25);
                                }
                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr77)).longValue();
                                long j32 = ~longValue8;
                                long j33 = i11;
                                str = "";
                                long j34 = ~j33;
                                obj6 = invoke5;
                                long j35 = longValue8 | 941903341;
                                long j36 = ~(j34 | longValue8);
                                strArr3 = strArr5;
                                num6 = num4;
                                long j37 = (longValue8 * 85) + 80061783985L + (((~(j34 | (-941903342))) | (~(j32 | (-941903342))) | (~(j32 | j34)) | (~(j35 | j33))) * (-84)) + (((~(j32 | j33)) | 941903341 | j36) * (-84)) + (((~j35) | j36) * 84) + 315197183;
                                int i30 = (int) (j37 >> 32);
                                i2 = i;
                                int i31 = ~i2;
                                if (((i30 & ((((~(491065337 | i2)) | (-1928291749)) * (-964)) + 1344236270 + (((~(i31 | 491065337)) | (-2146398206)) * (-964)))) | (((int) j37) & (((((~((-1094815817) | i31)) | (~((-170943025) | i2))) * 988) - 918974963) + (((~(171467569 | i2)) | (-1266283386) | (~((-170943025) | i31))) * 988)))) == 477111747) {
                                    num5 = num6;
                                    int i32 = 0;
                                    int i33 = 0;
                                    while (i32 < 28) {
                                        java.lang.String str5 = strArr3[i32];
                                        java.lang.Object[] objArr79 = new java.lang.Object[1];
                                        b("\u0ff7\u2439깁尐댌窮膅黦긱㔵聸鏗", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11, objArr79);
                                        java.lang.Object[] objArr80 = {((java.lang.String) objArr79[0]).intern().concat(java.lang.String.valueOf(str5))};
                                        java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                        if (obj26 == null) {
                                            java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 3161 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (33099 - (android.view.ViewConfiguration.getTapTimeout() >> 16)));
                                            java.lang.Object[] objArr81 = new java.lang.Object[1];
                                            a((byte) (-$$a[23]), r8[21], 41, objArr81);
                                            obj26 = cls18.getMethod((java.lang.String) objArr81[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj26);
                                        }
                                        long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr80)).longValue();
                                        long j38 = ~((-411828221) | longValue9);
                                        long j39 = i2;
                                        int i34 = i32;
                                        long j40 = ((-69) * longValue9) + 29239803620L + (((~(longValue9 | j39)) | j38) * (-140)) + ((~(411828220 | longValue9 | j39)) * 70) + (((~((~longValue9) | 411828220)) | j38 | (~(411828220 | j39))) * 70) + 583606683;
                                        int i35 = ~i2;
                                        int i36 = ~((-210285825) | i35);
                                        i33 += ((((int) (j40 >> 32)) & (((((~((-335590422) | i2)) * (-301)) + (-704280184)) + (((~(340849695 | i2)) | (~(1778076106 | i35))) * (-301))) + (((~((-1778076107) | i2)) | 340849695) * 301))) | ((((((((~(i35 | 210285824)) | ((~(1226940585 | i35)) | (-1302967722))) | (~((-134258689) | i2))) * (-84)) + (-1905160647)) + ((((~(210285824 | i2)) | (-1226940586)) | i36) * (-84))) + ((i36 | 134258688) * 84)) & ((int) j40))) == 0 ? 0 : 1;
                                        i32 = i34 + 1;
                                    }
                                    if (i33 >= 25.2d) {
                                        java.lang.Object[] objArr82 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, null, new int[1]};
                                        int i37 = ~((-668457682) | (~i2));
                                        java.lang.Object[] objArr83 = {num, num3, java.lang.Integer.valueOf(((2622766 | i37 | (~(668457681 | i2))) * (-338)) + 1595820427 + (((~(i2 | 671080447)) | i37) * 338))};
                                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                        if (obj27 == null) {
                                            java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 2713 - android.graphics.Color.blue(0), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                            byte b5 = (byte) (-$$a[14]);
                                            byte b6 = (byte) (b5 + 1);
                                            java.lang.Object[] objArr84 = new java.lang.Object[1];
                                            a(b5, b6, b6, objArr84);
                                            obj27 = cls19.getMethod((java.lang.String) objArr84[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj27);
                                        }
                                        ((int[]) objArr82[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj27).invoke(null, objArr83)).intValue();
                                        return objArr82;
                                    }
                                    java.lang.Object[] objArr85 = new java.lang.Object[1];
                                    c("菆℻菩\u07b4ｼჹ᠙\ue3b1닽学璵摾둕羂㝉죃偸\udb82鍍ⲕ\uec63럩༣肥蠄Ᏼ\ueb30", android.view.ViewConfiguration.getTouchSlop() >> 8, objArr85);
                                    java.lang.Object[] objArr86 = {((java.lang.String) objArr85[0]).intern()};
                                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj2 == null) {
                                        str2 = str;
                                        java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 29, android.view.View.MeasureSpec.getSize(0) + 2807, (char) android.text.TextUtils.getOffsetAfter(str2, 0));
                                        byte[] bArr16 = $$a;
                                        java.lang.Object[] objArr87 = new java.lang.Object[1];
                                        a((byte) (-bArr16[14]), (byte) (-bArr16[16]), 653, objArr87);
                                        obj2 = cls20.getMethod((java.lang.String) objArr87[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj2);
                                    } else {
                                        str2 = str;
                                    }
                                    long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr86)).longValue();
                                    j = i2;
                                    j2 = ~j;
                                    long j41 = ~(458532344 | j2);
                                    long j42 = ~(longValue10 | (-458532345));
                                    long j43 = ((-1527) * longValue10) + 350777243160L + ((longValue10 | j41) * 764) + (((~(j2 | longValue10)) | j42) * (-1528)) + (((~((~longValue10) | 458532344)) | j42 | j41) * 764) + 832007723;
                                    i3 = ~i2;
                                    j3 = (((int) (j43 >> 32)) & ((((~(1349768948 | i3)) | 84158466) * (-108)) + 2118803742 + (((~((-87457463) | i2)) | 1346469952 | (~(87457462 | i3))) * 54) + ((1346469952 | i2) * 54))) | (((int) j43) & ((((~(1124956723 | i3)) | 608174080) * (-108)) + 702563325 + (((~((-1732784163) | i2)) | 346641 | (~(1732784162 | i3))) * 54) + ((346641 | i2) * 54)));
                                    java.lang.Object[] objArr88 = new java.lang.Object[1];
                                    c("罐ꑈ罿苄◄骬\ue4c3暋桎臕ﺶ\uee37䣜\ufaf2\uedb9䊐곴廥䧲Ꚇუ", android.view.ViewConfiguration.getLongPressTimeout() >> 16, objArr88);
                                    java.lang.Object[] objArr89 = {((java.lang.String) objArr88[0]).intern()};
                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj3 == null) {
                                        java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29, (android.os.Process.myTid() >> 22) + 2807, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                                        byte[] bArr17 = $$a;
                                        java.lang.Object[] objArr90 = new java.lang.Object[1];
                                        a((byte) (-bArr17[14]), (byte) (-bArr17[16]), 653, objArr90);
                                        obj3 = cls21.getMethod((java.lang.String) objArr90[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj3);
                                    }
                                    long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr89)).longValue();
                                    long j44 = ((-949) * longValue11) + 5592635412L + (((~((~longValue11) | j2)) | (~(j | 5893187))) * 1900) + (((~((-5893188) | j2)) | (~(longValue11 | j))) * (-950)) + (((~(j2 | longValue11)) | (~(j | (-5893188)))) * 950) + 1296433255;
                                    long j45 = (((int) j44) & ((((~((-526618291) | i3)) | 1963844700) * (-983)) + 2038185154 + (((~(1963844700 | i3)) | (-2138042111)) * 983))) | (((int) (j44 >> 32)) & ((((~(1890630924 | i2)) | 151273536 | (~((-967109961) | i2))) * (-754)) + 887121506 + (((~((-151273537) | i2)) | (~((-815836425) | i3))) * (-754)) + ((1890630924 | i3) * 754)));
                                    if (j3 <= 0 && j45 > 0 && j45 - 3 < j3) {
                                        java.lang.Object[] objArr91 = {new int[]{i2}, new int[]{i2 ^ 247}, null, new int[1]};
                                        java.lang.Object[] objArr92 = {num, num3, java.lang.Integer.valueOf(((((~(262249766 | i3)) | (-530963888)) * (-160)) - 1650807537) + (((~(i3 | (-447075754))) | 262249766) * 160))};
                                        java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                        if (obj28 == null) {
                                            java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str2) + 50, 2713 - android.text.TextUtils.indexOf(str2, str2, 0, 0), (char) ((-1) - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                            byte b7 = (byte) (-$$a[14]);
                                            byte b8 = (byte) (b7 + 1);
                                            java.lang.Object[] objArr93 = new java.lang.Object[1];
                                            a(b7, b8, b8, objArr93);
                                            obj28 = cls22.getMethod((java.lang.String) objArr93[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj28);
                                        }
                                        ((int[]) objArr91[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr92)).intValue();
                                        return objArr91;
                                    }
                                    java.lang.Object[] objArr94 = new java.lang.Object[1];
                                    c("菆℻菩\u07b4ｼჹ᠙\ue3b1닽学璵摾둕羂㝉죃偸\udb82鍍ⲕ\uec63럩༣肥蠄Ᏼ\ueb30", android.view.ViewConfiguration.getScrollBarSize() >> 8, objArr94);
                                    java.lang.Object[] objArr95 = {((java.lang.String) objArr94[0]).intern()};
                                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj4 == null) {
                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('M' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2807 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                        byte[] bArr18 = $$a;
                                        java.lang.Object[] objArr96 = new java.lang.Object[1];
                                        a((byte) (-bArr18[14]), (byte) (-bArr18[16]), 653, objArr96);
                                        obj4 = cls23.getMethod((java.lang.String) objArr96[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj4);
                                    }
                                    long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr95)).longValue();
                                    long j46 = (306 * longValue12) + 276889216012L + (((~(longValue12 | 904866717)) | (~(j | 904866717))) * 305) + (((~longValue12) | (~(904866717 | j2))) * 305) + 385673350;
                                    j4 = (((int) (j46 >> 32)) & (((((-170404353) | i3) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 1543993574) + (((~(1170347477 | i3)) | (-1244277249)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))) | (((int) j46) & ((((285753361 | r6) * (-476)) - 204530815) + ((~((-75633733) | i2)) * 952) + ((~((-75633733) | i3)) * 476)));
                                    java.lang.Object[] objArr97 = new java.lang.Object[1];
                                    b("\ud878衩Ⱃ滐", 3 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr97);
                                    java.lang.Object[] objArr98 = {((java.lang.String) objArr97[0]).intern()};
                                    obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj5 == null) {
                                        java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 19, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2807, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                        byte[] bArr19 = $$a;
                                        java.lang.Object[] objArr99 = new java.lang.Object[1];
                                        a((byte) (-bArr19[14]), (byte) (-bArr19[16]), 653, objArr99);
                                        obj5 = cls24.getMethod((java.lang.String) objArr99[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj5);
                                    }
                                    long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr98)).longValue();
                                    long j47 = j2 | (-422232295);
                                    long j48 = (370 * longValue13) + 156225948780L + ((longValue13 | 422232294 | j2) * (-369)) + (((~j47) | longValue13) * (-369)) + (((~(j47 | longValue13)) | (~((~longValue13) | 422232294)) | (~(j | 422232294))) * 369) + 868307773;
                                    long j49 = (((int) j48) & ((((~(2113251135 | i3)) * 52) - 1625619799) + (((~(769917718 | i3)) | (~((-2087823168) | i3)) | 1343333417) * (-52)) + (((~((-769917719) | i3)) | 25427968) * 52))) | (((int) (j48 >> 32)) & ((((~(1623828449 | i2)) | 151257106) * (-283)) + 1293314448 + ((~(1775085555 | i2)) * 283)));
                                    if (j4 <= 0 && j49 > 0 && j49 + 100 < j4) {
                                        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 109) % 128;
                                        java.lang.Object[] objArr100 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                                        java.lang.Object[] objArr101 = {num, num3, java.lang.Integer.valueOf((((~((-217434437) | i2)) | (-502655440)) * (-502)) + 371042197 + ((~(i3 | (-10764357))) * (-502)) + (((~(i2 | (-491891084))) | (-217434437)) * 502))};
                                        java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                        if (obj29 == null) {
                                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 50, android.text.TextUtils.indexOf(str2, str2) + 2713, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1));
                                            byte b9 = (byte) (-$$a[14]);
                                            byte b10 = (byte) (b9 + 1);
                                            java.lang.Object[] objArr102 = new java.lang.Object[1];
                                            a(b9, b10, b10, objArr102);
                                            obj29 = cls25.getMethod((java.lang.String) objArr102[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj29);
                                        }
                                        ((int[]) objArr100[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj29).invoke(null, objArr101)).intValue();
                                        return objArr100;
                                    }
                                    java.lang.Object[] objArr103 = new java.lang.Object[1];
                                    b("\u0ff7\u2439깁尐댌窮\ue584ꅃ", 7 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr103);
                                    java.lang.String intern30 = ((java.lang.String) objArr103[0]).intern();
                                    java.lang.Object[] objArr104 = new java.lang.Object[1];
                                    b("\u0ff7\u2439깁尐댌窮膅黦긱㔵鸤股", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 11, objArr104);
                                    java.lang.String intern31 = ((java.lang.String) objArr104[0]).intern();
                                    java.lang.Object[] objArr105 = new java.lang.Object[1];
                                    c("ꞝ韛Ʝ녔尽\udb9c㰙啒ᆼ\uf839뿐꼛逎쥥鐍Ρ", android.view.ViewConfiguration.getTapTimeout() >> 16, objArr105);
                                    java.lang.String intern32 = ((java.lang.String) objArr105[0]).intern();
                                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                                    b("\u0ff7\u2439깁尐댌窮膅黦シ\ue187赤밨", 12 - android.view.KeyEvent.normalizeMetaState(0), objArr106);
                                    java.lang.String intern33 = ((java.lang.String) objArr106[0]).intern();
                                    java.lang.Object[] objArr107 = new java.lang.Object[1];
                                    c("鏞辊鏱꤀㼯\ude67ࡊ䴉犲鬨먶\uaafdꑜ턿\uf704", 1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr107);
                                    java.lang.String intern34 = ((java.lang.String) objArr107[0]).intern();
                                    java.lang.Object[] objArr108 = new java.lang.Object[1];
                                    b("\u0ff7\u2439긱㔵鸤股", 6 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr108);
                                    java.lang.String intern35 = ((java.lang.String) objArr108[0]).intern();
                                    java.lang.Object[] objArr109 = new java.lang.Object[1];
                                    c("즪ה즅⍍ᇹ셟屵뗈", android.text.TextUtils.indexOf(str2, str2), objArr109);
                                    strArr = new java.lang.String[]{intern30, intern31, intern32, intern33, intern34, intern35, ((java.lang.String) objArr109[0]).intern()};
                                    i4 = 0;
                                    while (true) {
                                        if (i4 >= 7) {
                                            i5 = 0;
                                            break;
                                        }
                                        java.lang.Object[] objArr110 = {strArr[i4]};
                                        java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                                        if (obj30 == null) {
                                            java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.os.Process.myTid() >> 22), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1671, (char) (android.text.TextUtils.getCapsMode(str2, 0, 0) + 47940));
                                            byte[] bArr20 = $$a;
                                            java.lang.Object[] objArr111 = new java.lang.Object[1];
                                            a((byte) (-bArr20[14]), (byte) (-bArr20[16]), 653, objArr111);
                                            obj30 = cls26.getMethod((java.lang.String) objArr111[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj30);
                                        }
                                        long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr110)).longValue();
                                        strArr2 = strArr;
                                        long j50 = ~((~longValue14) | (-165931040));
                                        long j51 = ((((((-107) * longValue14) - 9126207200L) + (((~(longValue14 | 165931039)) | (~(longValue14 | j2))) * (-108))) + ((((~(j | 165931039)) | j50) | (~((-165931040) | j2))) * 54)) + ((j | j50) * 54)) - 1459599142;
                                        if (((((int) j51) & ((((~((-1235863071) | i3)) | 150995464 | (~(1621877815 | i3))) * 464) + 1579956133 + (((-1084867607) | i2) * (-464)) + (((~(1621877815 | i2)) | 150995464) * 464))) | (((int) (j51 >> 32)) & ((((((~(1017549756 | i3)) | (~(1840191128 | i2))) * (-370)) + 635053406) + ((((~(1017549756 | i2)) | (~(1840191128 | i3))) | 749081240) * (-370))) - 2012815440))) != 0) {
                                            i5 = i4 + 90;
                                            break;
                                        }
                                        i4++;
                                        strArr = strArr2;
                                    }
                                    if (i5 != 0) {
                                        java.lang.Object[] objArr112 = {new int[]{i2}, new int[]{i5 ^ i2}, null, new int[1]};
                                        java.lang.Object[] objArr113 = {num, num3, java.lang.Integer.valueOf((((~((-387383673) | i3)) | (~((-321941848) | i2))) * 1900) + 1159947941 + (((~(321941847 | i3)) | (~(387383672 | i2))) * (-950)) + (((~(i2 | 321941847)) | (~(i3 | 387383672))) * 950))};
                                        java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                        if (obj31 == null) {
                                            java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, 2713 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                                            byte b11 = (byte) (-$$a[14]);
                                            byte b12 = (byte) (b11 + 1);
                                            java.lang.Object[] objArr114 = new java.lang.Object[1];
                                            a(b11, b12, b12, objArr114);
                                            obj31 = cls27.getMethod((java.lang.String) objArr114[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj31);
                                        }
                                        ((int[]) objArr112[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr113)).intValue();
                                        return objArr112;
                                    }
                                    try {
                                        objArr = new java.lang.Object[1];
                                        b("᰽췄⅜\ud907䍵霥跭祃ﯗꠥ압韭ᆱꇠ", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13, objArr);
                                    } catch (java.lang.Exception unused) {
                                    }
                                    try {
                                        java.lang.Object[] objArr115 = {((java.lang.String) objArr[0]).intern()};
                                        java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj32 == null) {
                                            java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 40, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1921, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                                            byte[] bArr21 = $$a;
                                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                                            a((byte) (-bArr21[14]), (byte) (-bArr21[16]), 653, objArr116);
                                            obj32 = cls28.getMethod((java.lang.String) objArr116[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj32);
                                        }
                                        java.lang.String str6 = (java.lang.String) ((java.lang.reflect.Method) obj32).invoke(null, objArr115);
                                        try {
                                            if (str6 != null) {
                                                java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                c("肨缏胋妊\uf86fᶰᬷ분뗶屻禠椪뜥↼お", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr117);
                                                java.lang.String[] strArr7 = {((java.lang.String) objArr117[0]).intern()};
                                                for (int i38 = 0; i38 <= 0; i38++) {
                                                    if (!str6.contains(strArr7[i38])) {
                                                    }
                                                }
                                                i6 = 0;
                                                if (i6 != 0) {
                                                    java.lang.Object[] objArr118 = {new int[]{i2}, new int[]{i6 ^ i2}, null, new int[1]};
                                                    java.lang.Object[] objArr119 = {num, num3, java.lang.Integer.valueOf((((~((-885035696) | i2)) | 4199055 | (~((-175710176) | i2))) * (-754)) + 1647795197 + (((~(i2 | (-4199056))) | (~((-171511121) | i3))) * (-754)) + (((-885035696) | i3) * 754))};
                                                    java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                                    if (obj33 == null) {
                                                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 51, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2713, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                        byte b13 = (byte) (-$$a[14]);
                                                        byte b14 = (byte) (b13 + 1);
                                                        java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                        a(b13, b14, b14, objArr120);
                                                        obj33 = cls29.getMethod((java.lang.String) objArr120[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj33);
                                                    }
                                                    ((int[]) objArr118[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr119)).intValue();
                                                    return objArr118;
                                                }
                                                java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                b("᰽췄⅜\ud907䍵霥跭祃ﯗꠥ압韭ᆱꇠ", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12, objArr121);
                                                java.lang.Object[] objArr122 = {((java.lang.String) objArr121[0]).intern()};
                                                java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj34 == null) {
                                                    java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 40, android.text.TextUtils.indexOf(str2, str2, 0, 0) + 1921, (char) android.view.View.MeasureSpec.getMode(0));
                                                    byte[] bArr22 = $$a;
                                                    java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                    a((byte) (-bArr22[14]), (byte) (-bArr22[16]), 653, objArr123);
                                                    obj34 = cls30.getMethod((java.lang.String) objArr123[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj34);
                                                }
                                                java.lang.String str7 = (java.lang.String) ((java.lang.reflect.Method) obj34).invoke(null, objArr122);
                                                if (str7 != null) {
                                                    java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                    c("肨缏胋妊\uf86fᶰᬷ분뗶屻禠椪뜥↼お", android.text.TextUtils.indexOf(str2, str2, 0), objArr124);
                                                    java.lang.String[] strArr8 = {((java.lang.String) objArr124[0]).intern()};
                                                    int i39 = 0;
                                                    while (true) {
                                                        if (i39 > 0) {
                                                            java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                            b("\ud878衩⬊ၭꍹ鵒\ue603䨓㝦갑\uf4c7컺", android.view.KeyEvent.getDeadChar(0, 0) + 12, objArr125);
                                                            java.lang.String intern36 = ((java.lang.String) objArr125[0]).intern();
                                                            java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                            c("拇築拨嵑髼䩡稜뤊흥㻡\u2e6a㻡啄╴勑鈚녵腬\uf6c3瘊", android.view.View.resolveSizeAndState(0, 0, 0), objArr126);
                                                            java.lang.String intern37 = ((java.lang.String) objArr126[0]).intern();
                                                            java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                            b("\ud878衩⬊ၭꍹ鵒\ue603䨓㝦갑\uf4c7컺シ\ue187赤밨朱涪", android.view.View.resolveSize(0, 0) + 17, objArr127);
                                                            java.lang.String intern38 = ((java.lang.String) objArr127[0]).intern();
                                                            java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                            b("\u0ff7\u2439긱㔵聸鏗", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6, objArr128);
                                                            java.lang.String intern39 = ((java.lang.String) objArr128[0]).intern();
                                                            java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                            b("\u0ff7\u2439깁尐댌窮膅黦긱㔵聸鏗", 11 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr129);
                                                            java.lang.String intern40 = ((java.lang.String) objArr129[0]).intern();
                                                            java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                            c("쟢\ue53d쟍쎲䭂ꏋ屦➴ۃ\uef46잇흌\uf060뮈荵箷ᐜᾔ❳鿼ꠍ", android.view.View.resolveSize(0, 0), objArr130);
                                                            java.lang.String intern41 = ((java.lang.String) objArr130[0]).intern();
                                                            java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                            b("\u0ff7\u2439깁尐댌窮膅黦긱㔵聸鏗\ued23䒼\ua638࿀ⵯ麆ℚ惬朱涪", android.text.TextUtils.indexOf(str2, str2, 0) + 21, objArr131);
                                                            java.lang.String intern42 = ((java.lang.String) objArr131[0]).intern();
                                                            java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                            c("岚ҿ岵∰\uf712ᩇ윞옶몓化縋滀欉娇㽤쉬輨\ufe1a鬵☫", (-1) - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr132);
                                                            java.lang.String intern43 = ((java.lang.String) objArr132[0]).intern();
                                                            java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                            c("Ǖ잕Ǻ\ue11a≘㿯驑Ԝ濙虜宣䭨㙀餺\uea73\ue793퉲㴼丼ς湰兌툅꿱ਗ\uf556㘞쮸Ꙛ", android.view.ViewConfiguration.getLongPressTimeout() >> 16, objArr133);
                                                            java.lang.String intern44 = ((java.lang.String) objArr133[0]).intern();
                                                            java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                            b("\u0ff7\u2439깁尐댌窮膅黦シ\ue187赤밨朱涪", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13, objArr134);
                                                            java.lang.String intern45 = ((java.lang.String) objArr134[0]).intern();
                                                            java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                            b("봓턚撳\ue7b6뇱莃赤밨朱涪", 8 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr135);
                                                            java.lang.String intern46 = ((java.lang.String) objArr135[0]).intern();
                                                            java.lang.Object[] objArr136 = new java.lang.Object[1];
                                                            b("\u0ff7\u2439㸽흥긱㔵聸鏗", 7 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr136);
                                                            java.lang.String[] strArr9 = {intern36, intern37, intern38, intern39, intern40, intern41, intern42, intern43, intern44, intern45, intern46, ((java.lang.String) objArr136[0]).intern()};
                                                            int i40 = 0;
                                                            while (i40 < 12) {
                                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                sb.append(strArr9[i40]);
                                                                java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                                c("\uf10a\ue9b6\uf179켿瑄笕", android.view.ViewConfiguration.getScrollBarSize() >> 8, objArr137);
                                                                sb.append(((java.lang.String) objArr137[0]).intern());
                                                                java.lang.Object[] objArr138 = {sb.toString()};
                                                                java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                                                if (obj35 == null) {
                                                                    java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.Color.red(0), 3161 - android.view.View.combineMeasuredStates(0, 0), (char) ((android.os.Process.myPid() >> 22) + 33099));
                                                                    byte[] bArr23 = $$a;
                                                                    java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                                    a((byte) (-bArr23[14]), (byte) (-bArr23[16]), 653, objArr139);
                                                                    obj35 = cls31.getMethod((java.lang.String) objArr139[0], java.lang.String.class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj35);
                                                                }
                                                                long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj35).invoke(null, objArr138)).longValue();
                                                                java.lang.String[] strArr10 = strArr9;
                                                                long j52 = ~((~longValue15) | 677754148);
                                                                long j53 = longValue15 | (-677754149);
                                                                long j54 = (((((longValue15 * (-755)) + 511704382495L) + (1512 * j52)) + ((j52 | (~(j53 | j))) * (-756))) + ((j53 | j2) * 756)) - 659913959;
                                                                if (((((int) (j54 >> 32)) & ((((~(2024068447 | i2)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 592057314) + (((~(2024068447 | i3)) | 1476689995) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))) | (((int) j54) & ((((~((-231135197) | i2)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 1300124243) + (((-134513169) | i3) * (-216)) + (((~((-231135197) | i3)) | (-1206091214)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE)))) != 0) {
                                                                    i7 = i40 + 110;
                                                                    break;
                                                                }
                                                                i40++;
                                                                strArr9 = strArr10;
                                                            }
                                                        } else {
                                                            if (str7.contains(strArr8[i39])) {
                                                                break;
                                                            }
                                                            i39++;
                                                        }
                                                    }
                                                }
                                                i7 = 0;
                                                if (i7 != 0) {
                                                    java.lang.Object[] objArr140 = {new int[]{i2}, new int[]{i7 ^ i2}, null, new int[1]};
                                                    java.lang.Object[] objArr141 = {num, num3, java.lang.Integer.valueOf(((((~(i3 | (-235528264))) | ((~((-944853784) | i3)) | 134299655)) * (-397)) - 607792569) + ((i2 | (-911782737)) * 397))};
                                                    java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                                    if (obj36 == null) {
                                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str2, str2, 0, 0) + 50, 2713 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((-1) - android.os.Process.getGidForName(str2)));
                                                        byte b15 = (byte) (-$$a[14]);
                                                        byte b16 = (byte) (b15 + 1);
                                                        java.lang.Object[] objArr142 = new java.lang.Object[1];
                                                        a(b15, b16, b16, objArr142);
                                                        obj36 = cls32.getMethod((java.lang.String) objArr142[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj36);
                                                    }
                                                    ((int[]) objArr140[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr141)).intValue();
                                                    return objArr140;
                                                }
                                                long[] jArr = {472001035};
                                                java.lang.Object[] objArr143 = new java.lang.Object[1];
                                                b("腜ᚾ᰽췄흦껱\uec55ᒬ\ufae9字앚敁Ѽ䇢쵤ⳟ\ue91f蘒", (android.os.Process.myPid() >> 22) + 17, objArr143);
                                                java.lang.Object[] objArr144 = {((java.lang.String) objArr143[0]).intern(), 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr};
                                                java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                if (obj37 == null) {
                                                    java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str2, 0, 0) + 37, android.text.TextUtils.getCapsMode(str2, 0, 0) + 3096, (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216));
                                                    byte[] bArr24 = $$a;
                                                    java.lang.Object[] objArr145 = new java.lang.Object[1];
                                                    a((byte) (-bArr24[14]), (byte) (-bArr24[16]), 653, objArr145);
                                                    obj37 = cls33.getMethod((java.lang.String) objArr145[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj37);
                                                }
                                                long j55 = ~((java.lang.Long) ((java.lang.reflect.Method) obj37).invoke(null, objArr144)).longValue();
                                                long j56 = ~(j55 | j);
                                                long j57 = (((((r6 * 246) - 46887973300L) + (((~(j55 | j2)) | (~(j55 | 192163825))) * (-245))) + ((-245) * j56)) + ((j56 | 192163825) * 245)) - 2102811735;
                                                if (((((int) (j57 >> 32)) & (((((~((-1966237357) | i2)) | (-529010946)) * (-366)) - 575070318) + (((~((-352321537) | i2)) | (-2142926766)) * 366))) | (((int) j57) & (((((~(1021837287 | i2)) | (~((-69314562) | i3))) * 920) - 2038855459) + (((~(484703683 | i3)) | (-1021837288)) * 920) + (((~(1021837287 | i3)) | (~((-537133605) | i2)) | (~((-69314562) | i2))) * 920)))) != 0) {
                                                    i8 = 1;
                                                    RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 1) % 128;
                                                    i9 = 240;
                                                } else {
                                                    i8 = 1;
                                                    i9 = 0;
                                                }
                                                if (i9 != 0) {
                                                    int[] iArr3 = new int[i8];
                                                    int[] iArr4 = new int[i8];
                                                    iArr3[0] = i2;
                                                    iArr4[0] = i9 ^ i2;
                                                    java.lang.Object[] objArr146 = {iArr3, iArr4, null, new int[i8]};
                                                    java.lang.Object[] objArr147 = {num, num3, java.lang.Integer.valueOf(((825685345 | i3) * (-757)) + 872948830 + ((~(939522033 | i2)) * 1514) + (((~(i2 | (-113836689))) | (~(i3 | 116359825)) | 823162208) * 757))};
                                                    java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                                    if (obj38 == null) {
                                                        java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.blue(0), android.view.View.resolveSize(0, 0) + 2713, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                                        byte b17 = (byte) (-$$a[14]);
                                                        byte b18 = (byte) (b17 + 1);
                                                        java.lang.Object[] objArr148 = new java.lang.Object[1];
                                                        a(b17, b18, b18, objArr148);
                                                        obj38 = cls34.getMethod((java.lang.String) objArr148[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj38);
                                                    }
                                                    ((int[]) objArr146[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr147)).intValue();
                                                    return objArr146;
                                                }
                                                long[] jArr2 = new long[i8];
                                                jArr2[0] = 472001035;
                                                java.lang.Object[] objArr149 = new java.lang.Object[i8];
                                                b("\u0ff7\u2439깁尐ힱຎ벷믆\uec55ᒬ\uea89\ue120쪔ㅞ皪䂠㷚Ꮛ\uea89\ue120\ue59e餆", 21 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr149);
                                                try {
                                                    bufferedInputStream2 = new java.io.BufferedInputStream(new java.io.FileInputStream(((java.lang.String) objArr149[0]).intern()));
                                                    j5 = 0;
                                                } catch (java.io.IOException unused2) {
                                                    bufferedInputStream2 = null;
                                                } catch (java.lang.Throwable th2) {
                                                    th = th2;
                                                    bufferedInputStream = null;
                                                }
                                                while (true) {
                                                    try {
                                                        int read = bufferedInputStream2.read();
                                                        if (read != -1) {
                                                            j5 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK & (read ^ (j5 << 5));
                                                            for (int i41 = 0; i41 <= 0; i41++) {
                                                                RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 7) % 128;
                                                                if (j5 == jArr2[i41]) {
                                                                    int i42 = i41 + 1;
                                                                    try {
                                                                        bufferedInputStream2.close();
                                                                    } catch (java.lang.Exception unused3) {
                                                                    }
                                                                    if (i42 != 0) {
                                                                        java.lang.Object[] objArr150 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, null, new int[1]};
                                                                        java.lang.Object[] objArr151 = {num, num3, java.lang.Integer.valueOf((((~(i3 | (-2113541))) | (~(436072047 | i2))) * (-302)) + 59334285 + ((~((-2113541) | i2)) * (-604)) + (((~(i2 | 433958507)) | 160705035) * 302))};
                                                                        java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                                                        if (obj39 == null) {
                                                                            java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str2, str2, 0, 0), android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) (android.view.MotionEvent.axisFromString(str2) + 1));
                                                                            byte b19 = (byte) (-$$a[14]);
                                                                            byte b20 = (byte) (b19 + 1);
                                                                            java.lang.Object[] objArr152 = new java.lang.Object[1];
                                                                            a(b19, b20, b20, objArr152);
                                                                            obj39 = cls35.getMethod((java.lang.String) objArr152[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj39);
                                                                        }
                                                                        ((int[]) objArr150[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr151)).intValue();
                                                                        return objArr150;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } catch (java.io.IOException unused4) {
                                                    } catch (java.lang.Throwable th3) {
                                                        th = th3;
                                                        bufferedInputStream = bufferedInputStream2;
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
                                                        bufferedInputStream2.close();
                                                        break;
                                                    } catch (java.lang.Exception unused6) {
                                                    }
                                                }
                                                java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(724989957);
                                                if (obj40 == null) {
                                                    java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 31, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1890, (char) (android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3601));
                                                    byte[] bArr25 = $$a;
                                                    java.lang.Object[] objArr153 = new java.lang.Object[1];
                                                    a((byte) (-bArr25[14]), (byte) (-bArr25[16]), 653, objArr153);
                                                    obj40 = cls36.getMethod((java.lang.String) objArr153[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(724989957, obj40);
                                                }
                                                long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj40).invoke(null, null)).longValue();
                                                long j58 = ((((((-301) * longValue16) - 56163057678L) + (((~((j2 | 185356625) | longValue16)) | (~((longValue16 | (-185356626)) | j))) * (-302))) + ((~((longValue16 | 185356625) | j)) * (-604))) + (((~(longValue16 | j)) | (~((~longValue16) | (-185356626)))) * 302)) - 1693891754;
                                                int i43 = ~((-957499686) | i2);
                                                if (((((int) j58) & (((479726724 | i43) * (-220)) + 1842322727 + ((i43 | 403703812) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 560589614)) | (((int) (j58 >> 32)) & ((((~(1000077739 | i2)) | (~((-437148672) | i3))) * 959) + 120324285 + (((~(1000077739 | i3)) | (~((-437148672) | i2))) * 959)))) != 0) {
                                                    java.lang.Object[] objArr154 = {new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i9}, null, new int[1]};
                                                    int i44 = ~(568483583 | i2);
                                                    java.lang.Object[] objArr155 = {num, num3, java.lang.Integer.valueOf((((~(i2 | (-140841937))) | (~((-568483584) | i2)) | 6296272) * (-880)) + 2145524319 + (((~(i3 | (-568483584))) | 140841936 | i44) * (-880)) + (i44 * 880))};
                                                    java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                                    if (obj41 == null) {
                                                        java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.view.KeyEvent.keyCodeFromString(str2) + 2713, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                        byte b21 = (byte) (-$$a[14]);
                                                        byte b22 = (byte) (b21 + 1);
                                                        java.lang.Object[] objArr156 = new java.lang.Object[1];
                                                        a(b21, b22, b22, objArr156);
                                                        obj41 = cls37.getMethod((java.lang.String) objArr156[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj41);
                                                    }
                                                    ((int[]) objArr154[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj41).invoke(null, objArr155)).intValue();
                                                    return objArr154;
                                                }
                                                java.lang.Object[] objArr157 = {2};
                                                java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                                if (obj42 == null) {
                                                    java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.text.TextUtils.getOffsetAfter(str2, 0) + 2364, (char) android.view.View.MeasureSpec.getMode(0));
                                                    byte[] bArr26 = $$a;
                                                    java.lang.Object[] objArr158 = new java.lang.Object[1];
                                                    a((byte) (-bArr26[14]), (byte) (-bArr26[16]), 653, objArr158);
                                                    obj42 = cls38.getMethod((java.lang.String) objArr158[0], java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj42);
                                                }
                                                long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj42).invoke(null, objArr157)).longValue();
                                                long j59 = ~longValue17;
                                                long j60 = ~(j | (-602655575));
                                                long j61 = ~(longValue17 | 602655574);
                                                long j62 = (408 * longValue17) + 489958982475L + (((~(j59 | (-602655575))) | j60) * (-814)) + ((j60 | (~(j59 | j2)) | j61) * 407) + ((j61 | (~(j | 602655574)) | (~(longValue17 | j))) * 407) + 2010565774;
                                                int i45 = ~((-1814135245) | i2);
                                                if (((((int) (j62 >> 32)) & ((((303310848 | i45) * (-196)) - 835783010) + ((i45 | (-2117446093)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))) | (((int) j62) & ((((~((-69219329) | i3)) | (~(1576009199 | i2)) | (~((-344134) | i2))) * 765) + 172366980 + (((~(1506789871 | i3)) | 69219328) * 1530) + (((~(1506789871 | i2)) | (~((-344134) | i3))) * 765)))) == 2) {
                                                    java.lang.Object[] objArr159 = {new int[]{i2}, new int[]{i2 ^ 270}, null, new int[1]};
                                                    java.lang.Object[] objArr160 = {num, num3, java.lang.Integer.valueOf((((~((-537633) | i2)) | (~((-572721282) | i3))) * 920) + 964877031 + (((~((-136066607) | i3)) | 537632) * 920) + (((~(i2 | (-135528975))) | (~(i3 | (-537633))) | (~((-572721282) | i2))) * 920))};
                                                    java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                                    if (obj43 == null) {
                                                        java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 50, 2713 - android.text.TextUtils.getCapsMode(str2, 0, 0), (char) android.view.View.MeasureSpec.getMode(0));
                                                        byte b23 = (byte) (-$$a[14]);
                                                        byte b24 = (byte) (b23 + 1);
                                                        java.lang.Object[] objArr161 = new java.lang.Object[1];
                                                        a(b23, b24, b24, objArr161);
                                                        obj43 = cls39.getMethod((java.lang.String) objArr161[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj43);
                                                    }
                                                    ((int[]) objArr159[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj43).invoke(null, objArr160)).intValue();
                                                    return objArr159;
                                                }
                                                java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1411285061);
                                                if (obj44 == null) {
                                                    java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 41, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3149, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                    java.lang.Object[] objArr162 = new java.lang.Object[1];
                                                    a((byte) (-$$a[23]), r6[21], 41, objArr162);
                                                    obj44 = cls40.getMethod((java.lang.String) objArr162[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1411285061, obj44);
                                                }
                                                long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj44).invoke(null, null)).longValue();
                                                long j63 = ~longValue18;
                                                long j64 = (((-590) * longValue18) - 161737085312L) + ((~(longValue18 | 273204535)) * (-1182)) + (((~(273204535 | j63 | j2)) | (~(longValue18 | (-273204536)))) * (-591)) + ((j | 273204535 | j63) * 591) + 369449897;
                                                if (((((int) j64) & (((((~((-1142345729) | i2)) | (~((-570425926) | i3))) * 920) - 2038855459) + (((~((-1144969233) | i3)) | 1142345728) * 920) + (((~((-1142345729) | i3)) | (~((-2623505) | i2)) | (~((-570425926) | i2))) * 920))) | (((int) (j64 >> 32)) & (((((~((-69142487) | i2)) | 722388) * 345) - 484646000) + (((~((-69142487) | i3)) | 1367361536) * 345) + ((~((-722389) | i2)) * 345)))) != 0) {
                                                    java.lang.Object[] objArr163 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, null, new int[1]};
                                                    java.lang.Object[] objArr164 = {num, num3, java.lang.Integer.valueOf((((~((-273954121) | i3)) | 269492232) * (-108)) + 1789092523 + (((~(i3 | 983279640)) | (~((-983279641) | i2)) | (-987741529)) * 54) + ((i2 | (-987741529)) * 54))};
                                                    java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                                    if (obj45 == null) {
                                                        java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.getDeadChar(0, 0), android.view.View.resolveSize(0, 0) + 2713, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                        byte b25 = (byte) (-$$a[14]);
                                                        byte b26 = (byte) (b25 + 1);
                                                        java.lang.Object[] objArr165 = new java.lang.Object[1];
                                                        a(b25, b26, b26, objArr165);
                                                        obj45 = cls41.getMethod((java.lang.String) objArr165[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj45);
                                                    }
                                                    ((int[]) objArr163[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj45).invoke(null, objArr164)).intValue();
                                                    return objArr163;
                                                }
                                                java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(502613909);
                                                if (obj46 == null) {
                                                    java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 39, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3196, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                    byte[] bArr27 = $$a;
                                                    java.lang.Object[] objArr166 = new java.lang.Object[1];
                                                    a((byte) (-bArr27[14]), (byte) (-bArr27[16]), 653, objArr166);
                                                    obj46 = cls42.getMethod((java.lang.String) objArr166[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(502613909, obj46);
                                                }
                                                long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) obj46).invoke(null, null)).longValue();
                                                long j65 = ~longValue19;
                                                long j66 = ((-68) * longValue19) + 31204056310L + (((~(j65 | (-445772234) | j)) | (~(longValue19 | 445772233 | j))) * 69) + (((~((-445772234) | longValue19)) | (~(j | (-445772234))) | (~(longValue19 | j))) * (-69)) + ((~(j65 | 445772233)) * 69) + 507097657;
                                                if (((((int) j66) & ((((~((-1032970830) | i3)) | (~(1824770056 | i2))) * 959) + 1983989145 + (((~((-1032970830) | i2)) | (~(1824770056 | i3))) * 959))) | (((int) (j66 >> 32)) & (((~(2147413943 | i3)) * (-783)) + 340327745 + (((~(1926816434 | i3)) | 489590023) * 783)))) != 0) {
                                                    java.lang.Object[] objArr167 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, null, new int[1]};
                                                    java.lang.Object[] objArr168 = {num, num3, java.lang.Integer.valueOf(((~((-151273607) | i3)) * (-783)) + 906374312 + (((~(i3 | 281222713)) | (-428102807)) * 783))};
                                                    java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                                    if (obj47 == null) {
                                                        java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.getSize(0), android.text.TextUtils.indexOf(str2, str2) + 2713, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                        byte b27 = (byte) (-$$a[14]);
                                                        byte b28 = (byte) (b27 + 1);
                                                        java.lang.Object[] objArr169 = new java.lang.Object[1];
                                                        a(b27, b28, b28, objArr169);
                                                        obj47 = cls43.getMethod((java.lang.String) objArr169[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj47);
                                                    }
                                                    ((int[]) objArr167[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj47).invoke(null, objArr168)).intValue();
                                                    return objArr167;
                                                }
                                                java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1293945309);
                                                if (obj48 == null) {
                                                    java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2837, (char) android.view.KeyEvent.keyCodeFromString(str2));
                                                    byte[] bArr28 = $$a;
                                                    java.lang.Object[] objArr170 = new java.lang.Object[1];
                                                    a((byte) (-bArr28[14]), (byte) (-bArr28[16]), 653, objArr170);
                                                    obj48 = cls44.getMethod((java.lang.String) objArr170[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1293945309, obj48);
                                                }
                                                long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) obj48).invoke(null, null)).longValue();
                                                long j67 = ~longValue20;
                                                long j68 = (((((longValue20 * (-858)) + 316092023040L) + ((j | 367548864) * (-859))) + (((~(j2 | 367548864)) | (~((j67 | (-367548865)) | j))) * 859)) + (((~(j67 | j2)) | (~(j67 | 367548864))) * 859)) - 1173843619;
                                                if (((((int) (j68 >> 32)) & ((((~((-1446638215) | i2)) | 1411102670) * (-465)) + 1518748439 + (((~(1411102670 | i2)) | (-1446638215)) * 930) + (((-35667969) | i2) * 465))) | (((int) j68) & (((((~(1775660631 | i3)) | (~((-1775396435) | i2))) * (-831)) - 1608425190) + ((~(2113830655 | i2)) * (-1662)) + (((~((-338434222) | i3)) | (~(338434221 | i2)) | (~((-1775660632) | i2))) * 831)))) != 0) {
                                                    java.lang.Object[] objArr171 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                    java.lang.Object[] objArr172 = {num, num3, java.lang.Integer.valueOf((((~((-21236421) | i3)) | (~(667336399 | i2))) * 988) + 570401055 + (((~(i2 | (-63225541))) | 41989120 | (~(i3 | 667336399))) * 988))};
                                                    java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                                    if (obj49 == null) {
                                                        java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 50, android.text.TextUtils.indexOf(str2, str2, 0) + 2713, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                        byte b29 = (byte) (-$$a[14]);
                                                        byte b30 = (byte) (b29 + 1);
                                                        java.lang.Object[] objArr173 = new java.lang.Object[1];
                                                        a(b29, b30, b30, objArr173);
                                                        obj49 = cls45.getMethod((java.lang.String) objArr173[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj49);
                                                    }
                                                    ((int[]) objArr171[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj49).invoke(null, objArr172)).intValue();
                                                    return objArr171;
                                                }
                                                long[] jArr3 = {624887784092251L};
                                                java.lang.Object[] objArr174 = new java.lang.Object[1];
                                                b("腜ᚾ᰽췄흦껱\uec55ᒬ\ufae9字앚敁Ѽ䇢쵤ⳟ\ue91f蘒", android.text.TextUtils.indexOf(str2, str2) + 17, objArr174);
                                                java.lang.Object[] objArr175 = {((java.lang.String) objArr174[0]).intern(), 3, 2251799813685247L, jArr3};
                                                java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                if (obj50 == null) {
                                                    java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 3096 - (android.os.Process.myTid() >> 22), (char) android.text.TextUtils.getCapsMode(str2, 0, 0));
                                                    byte[] bArr29 = $$a;
                                                    java.lang.Object[] objArr176 = new java.lang.Object[1];
                                                    a((byte) (-bArr29[14]), (byte) (-bArr29[16]), 653, objArr176);
                                                    obj50 = cls46.getMethod((java.lang.String) objArr176[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj50);
                                                }
                                                long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) obj50).invoke(null, objArr175)).longValue();
                                                long j69 = ~((~longValue21) | (-1466710261));
                                                long j70 = ((((((-107) * longValue21) - 80669064355L) + (((~(longValue21 | 1466710260)) | (~(longValue21 | j2))) * (-108))) + ((((~(j | 1466710260)) | j69) | (~((-1466710261) | j2))) * 54)) + ((j | j69) * 54)) - 443937649;
                                                if (((((int) j70) & ((((-1151338754) | i2) * (-381)) + 323732440 + (((~((-1285582678) | i3)) | (-1168738562)) * 381) + 573400701)) | (((int) (j70 >> 32)) & ((((~((-1249248042) | i3)) | (~((-187978370) | i2)) | (~(187978369 | i3))) * 959) + 483841962 + (((~((-1249248042) | i2)) | (~((-187978370) | i3)) | (~(187978369 | i2))) * 959)))) != 0) {
                                                    SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 49) % 128;
                                                    java.lang.Object[] objArr177 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, null, new int[1]};
                                                    java.lang.Object[] objArr178 = {num, num3, java.lang.Integer.valueOf(((((~r2) | 721913040) * (-828)) - 379664301) + (((-12587521) | i3) * (-828)) + 1832531968)};
                                                    java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                                    if (obj51 == null) {
                                                        java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2713, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                                        byte b31 = (byte) (-$$a[14]);
                                                        byte b32 = (byte) (b31 + 1);
                                                        java.lang.Object[] objArr179 = new java.lang.Object[1];
                                                        a(b31, b32, b32, objArr179);
                                                        obj51 = cls47.getMethod((java.lang.String) objArr179[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj51);
                                                    }
                                                    ((int[]) objArr177[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj51).invoke(null, objArr178)).intValue();
                                                    return objArr177;
                                                }
                                                java.lang.Object[] objArr180 = new java.lang.Object[1];
                                                c("㌇惃㌨䙛ꈑ쾊꣘ꉕ\uef8c؝ꮋ묈Ҏ㹬樿", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, objArr180);
                                                java.lang.Object[] objArr181 = {((java.lang.String) objArr180[0]).intern()};
                                                java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                                if (obj52 == null) {
                                                    java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.view.MotionEvent.axisFromString(str2), 3161 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.os.Process.getGidForName(str2) + 33100));
                                                    byte[] bArr30 = $$a;
                                                    java.lang.Object[] objArr182 = new java.lang.Object[1];
                                                    a((byte) (-bArr30[14]), (byte) (-bArr30[16]), 653, objArr182);
                                                    obj52 = cls48.getMethod((java.lang.String) objArr182[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj52);
                                                }
                                                long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) obj52).invoke(null, objArr181)).longValue();
                                                long j71 = ~longValue22;
                                                long j72 = ((((((-209) * longValue22) - 95739534055L) + ((~(j71 | (-458083896))) * 210)) + (((~(j71 | j2)) | (~(j | (-458083896)))) * 210)) + (((~(((-458083896) | j2) | longValue22)) | (~((j71 | 458083895) | j))) * 210)) - 1795752003;
                                                if (((((int) j72) & ((((((~(548379362 | i3)) | (-889174760)) * 446) - 384374209) + (((~((-340795398) | i2)) | 327712) * 446)) - 1434951728)) | (((int) (j72 >> 32)) & ((((-881699831) | i3) * (-757)) + 924844850 + ((~((-524705) | i2)) * 1514) + (((~(1976041054 | i3)) | (-1976565759) | (~((-881175127) | i2))) * 757)))) != 0) {
                                                    SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                                                    java.lang.Object[] objArr183 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                    int i46 = ~(i2 | 69462780);
                                                    java.lang.Object[] objArr184 = {num, num3, java.lang.Integer.valueOf(((((~(i3 | 69462780)) | (-778829821)) * (-245)) - 953759118) + (i46 * (-245)) + ((i46 | 778788300) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))};
                                                    java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                                    if (obj53 == null) {
                                                        java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 2713 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                                        byte b33 = (byte) (-$$a[14]);
                                                        byte b34 = (byte) (b33 + 1);
                                                        java.lang.Object[] objArr185 = new java.lang.Object[1];
                                                        a(b33, b34, b34, objArr185);
                                                        obj53 = cls49.getMethod((java.lang.String) objArr185[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj53);
                                                    }
                                                    ((int[]) objArr183[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj53).invoke(null, objArr184)).intValue();
                                                    return objArr183;
                                                }
                                                java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                                                if (obj54 == null) {
                                                    java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString(str2) + 29, android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2186, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 59513));
                                                    byte[] bArr31 = $$a;
                                                    java.lang.Object[] objArr186 = new java.lang.Object[1];
                                                    a((byte) (-bArr31[14]), (byte) (-bArr31[16]), 653, objArr186);
                                                    obj54 = cls50.getMethod((java.lang.String) objArr186[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj54);
                                                }
                                                long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) obj54).invoke(null, null)).longValue();
                                                long j73 = ((((((-301) * longValue23) + 343872995625L) + (((~((j2 | (-1134894376)) | longValue23)) | (~((longValue23 | 1134894375) | j))) * (-302))) + ((~(((-1134894376) | longValue23) | j)) * (-604))) + (((~(longValue23 | j)) | (~((~longValue23) | 1134894375))) * 302)) - 2006984961;
                                                if (((((int) (j73 >> 32)) & (((((~(1640754401 | i3)) | (-203527991)) * (-328)) - 377375158) + (((-203527991) | i2) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~((-1640754402) | i2)) | 1640655041 | (~((-203428631) | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))) | (((int) j73) & ((((~((-1796669728) | i2)) | 722862358) * 104) + 2005432269 + ((~(2134878527 | i3)) * (-104)) + ((1061071158 | i2) * 104)))) != 0) {
                                                    java.lang.Object[] objArr187 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                    java.lang.Object[] objArr188 = {num, num3, java.lang.Integer.valueOf((((((~(i2 | 44130635)) | 742954000) * 576) + 159719695) + (((~(i3 | 787084635)) | 10502155) * 576)) - 1555225600)};
                                                    java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                                    if (obj55 == null) {
                                                        java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.MotionEvent.axisFromString(str2), 2713 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.text.TextUtils.indexOf(str2, str2, 0));
                                                        byte b35 = (byte) (-$$a[14]);
                                                        byte b36 = (byte) (b35 + 1);
                                                        java.lang.Object[] objArr189 = new java.lang.Object[1];
                                                        a(b35, b36, b36, objArr189);
                                                        obj55 = cls51.getMethod((java.lang.String) objArr189[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj55);
                                                    }
                                                    ((int[]) objArr187[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj55).invoke(null, objArr188)).intValue();
                                                    return objArr187;
                                                }
                                                java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1050293330);
                                                if (obj56 == null) {
                                                    java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 35, 2972 - android.text.TextUtils.getOffsetBefore(str2, 0), (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                                                    byte[] bArr32 = $$a;
                                                    java.lang.Object[] objArr190 = new java.lang.Object[1];
                                                    a((byte) (-bArr32[14]), (byte) (-bArr32[16]), 653, objArr190);
                                                    obj56 = cls52.getMethod((java.lang.String) objArr190[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1050293330, obj56);
                                                }
                                                long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) obj56).invoke(null, null)).longValue();
                                                long j74 = ~(693620039 | j2);
                                                long j75 = (((((339 * longValue24) + 233749953480L) + ((((~((~longValue24) | (-693620040))) | j74) | (~(j | (-693620040)))) * (-338))) + ((~(693620039 | longValue24)) * 338)) + ((j74 | (~(((-693620040) | longValue24) | j))) * 338)) - 1159081724;
                                                int i47 = ~((-377734416) | i3);
                                                if (((((int) j75) & (((((~((-1117752981) | i3)) | (~((-1739987906) | i2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1893429861) + (((~((-622858562) | i3)) | (~((-623637) | i2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) (j75 >> 32)) & ((((~(1814960826 | i3)) | (-2125455296)) * (-1188)) + 301404002 + (((~((-1814960827) | i2)) | (-2125455296) | i47) * 594) + ((i47 | (~((-1814960827) | i3)) | 67239946) * 594)))) != 0) {
                                                    java.lang.Object[] objArr191 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                    java.lang.Object[] objArr192 = {num, num3, java.lang.Integer.valueOf(((~(536832703 | i2)) * (-301)) + 2134751480 + (((~(i3 | 466446897)) | (~((-242878623) | i2))) * (-301)) + (((~(i2 | (-466446898))) | (-242878623)) * 301))};
                                                    java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                                    if (obj57 == null) {
                                                        java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50, 2714 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) android.text.TextUtils.getOffsetBefore(str2, 0));
                                                        byte b37 = (byte) (-$$a[14]);
                                                        byte b38 = (byte) (b37 + 1);
                                                        java.lang.Object[] objArr193 = new java.lang.Object[1];
                                                        a(b37, b38, b38, objArr193);
                                                        obj57 = cls53.getMethod((java.lang.String) objArr193[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj57);
                                                    }
                                                    ((int[]) objArr191[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj57).invoke(null, objArr192)).intValue();
                                                    return objArr191;
                                                }
                                                java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1827153043);
                                                if (obj58 == null) {
                                                    java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.text.TextUtils.getOffsetAfter(str2, 0) + 2159, (char) (56400 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                                                    byte[] bArr33 = $$a;
                                                    java.lang.Object[] objArr194 = new java.lang.Object[1];
                                                    a((byte) (-bArr33[14]), (byte) (-bArr33[16]), 653, objArr194);
                                                    obj58 = cls54.getMethod((java.lang.String) objArr194[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1827153043, obj58);
                                                }
                                                long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) obj58).invoke(null, null)).longValue();
                                                long j76 = ~longValue25;
                                                long j77 = ((((((-590) * longValue25) + 178545492672L) + ((~(longValue25 | (-301597117))) * (-1182))) + (((~(((-301597117) | j76) | j2)) | (~(longValue25 | 301597116))) * (-591))) + (((j | (-301597117)) | j76) * 591)) - 867415136;
                                                if (((((int) j77) & (((r4 * 992) - 1537497691) + (((~((-1053991019) | i2)) | 713162858 | (~(2144578027 | i3))) * (-496)) + ((1803749867 | i2) * 496))) | (((int) (j77 >> 32)) & (((~(2058013059 | i2)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 237378378 + ((2141912027 | i3) * (-216)) + (((~(2058013059 | i3)) | (-620786649)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE)))) != 0) {
                                                    java.lang.Object[] objArr195 = {new int[]{i2}, new int[]{i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                    java.lang.Object[] objArr196 = {num, num3, java.lang.Integer.valueOf((((((~(i2 | (-532735873))) | 176194304) * 576) + 159719695) + (((~(i3 | (-356541569))) | 395343) * 576)) - 1591296000)};
                                                    java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                                    if (obj59 == null) {
                                                        java.lang.Class cls55 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 2714 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                                        byte b39 = (byte) (-$$a[14]);
                                                        byte b40 = (byte) (b39 + 1);
                                                        java.lang.Object[] objArr197 = new java.lang.Object[1];
                                                        a(b39, b40, b40, objArr197);
                                                        obj59 = cls55.getMethod((java.lang.String) objArr197[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj59);
                                                    }
                                                    ((int[]) objArr195[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj59).invoke(null, objArr196)).intValue();
                                                    return objArr195;
                                                }
                                                java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(887063382);
                                                if (obj60 == null) {
                                                    java.lang.Class cls56 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 35, 839 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                    byte[] bArr34 = $$a;
                                                    java.lang.Object[] objArr198 = new java.lang.Object[1];
                                                    a((byte) (-bArr34[14]), (byte) (-bArr34[16]), 653, objArr198);
                                                    obj60 = cls56.getMethod((java.lang.String) objArr198[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(887063382, obj60);
                                                }
                                                long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) obj60).invoke(null, null)).longValue();
                                                long j78 = ~longValue26;
                                                long j79 = ~(j78 | (-619343329));
                                                long j80 = (((-575) * longValue26) - 356122413600L) + (((~(j78 | j)) | j79) * 576) + (((~(longValue26 | (-619343329))) | (~(j2 | j78 | 619343328))) * 576) + (j79 * 576) + 1341409574;
                                                int i48 = ((((int) j80) & ((((((~(619259479 | i3)) | (-2056485890)) * (-1042)) + 363807540) + ((619259479 | i2) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)) + ((((~(2056485889 | i2)) | 73925206) | (~((-1511151617) | i3))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) | (((int) (j80 >> 32)) & (((((2121718765 | i2) * (-381)) + 1144119904) + (((~(2116065676 | i3)) | 1448532589) * 381)) - 920998198))) != 0 ? i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : i2;
                                                if (i48 != i2) {
                                                    java.lang.Object[] objArr199 = {new int[]{i2}, new int[]{i48}, null, new int[1]};
                                                    java.lang.Object[] objArr200 = {num, num3, java.lang.Integer.valueOf((((~((-799104759) | i2)) | (~((-89779239) | i3))) * (-1808)) + 1101574455 + (((~((-715133649) | i2)) | (~((-5808129) | i3))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(i2 | 89779238)) | 83971110 | (~(i3 | 799104758))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))};
                                                    java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                                    if (obj61 == null) {
                                                        java.lang.Class cls57 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str2, str2, 0, 0), android.text.TextUtils.getOffsetBefore(str2, 0) + 2713, (char) ((-1) - android.view.MotionEvent.axisFromString(str2)));
                                                        byte b41 = (byte) (-$$a[14]);
                                                        byte b42 = (byte) (b41 + 1);
                                                        java.lang.Object[] objArr201 = new java.lang.Object[1];
                                                        a(b41, b42, b42, objArr201);
                                                        obj61 = cls57.getMethod((java.lang.String) objArr201[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj61);
                                                    }
                                                    ((int[]) objArr199[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj61).invoke(null, objArr200)).intValue();
                                                    java.lang.Object[] objArr202 = {objArr199};
                                                    java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(712501173);
                                                    if (obj62 == null) {
                                                        java.lang.Class cls58 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 3237, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                        byte b43 = (byte) (-$$a[14]);
                                                        byte b44 = (byte) (b43 + 1);
                                                        java.lang.Object[] objArr203 = new java.lang.Object[1];
                                                        a(b43, b44, b44, objArr203);
                                                        obj62 = cls58.getMethod((java.lang.String) objArr203[0], java.lang.Object[].class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(712501173, obj62);
                                                    }
                                                    ((java.lang.reflect.Method) obj62).invoke(obj, objArr202);
                                                    return objArr199;
                                                }
                                                java.lang.Object[] objArr204 = {java.lang.Integer.valueOf(i), obj, num, num2};
                                                java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(97317038);
                                                if (obj63 == null) {
                                                    obj63 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 30, 3289 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) ((-1) - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getDeclaredConstructor(java.lang.Integer.TYPE, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 3237 - (android.os.Process.myTid() >> 22), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(97317038, obj63);
                                                }
                                                java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj63).newInstance(objArr204);
                                                try {
                                                    java.lang.Object[] objArr205 = new java.lang.Object[1];
                                                    b("꩓ꠦ㝪倮朏눚痟\ue289靣ᣬꧡ솋㧫闒㊓ြ", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, objArr205);
                                                    java.lang.Class<?> cls59 = java.lang.Class.forName(((java.lang.String) objArr205[0]).intern());
                                                    java.lang.Object[] objArr206 = new java.lang.Object[1];
                                                    b("ыꊎ謹ۍᆱꇠ", android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 6, objArr206);
                                                    cls59.getMethod(((java.lang.String) objArr206[0]).intern(), null).invoke(newInstance, null);
                                                    java.lang.Object[] objArr207 = {new int[]{i2}, new int[]{i2}, null, new int[1]};
                                                    int i49 = ~(i3 | 692054655);
                                                    java.lang.Object[] objArr208 = {num, num2, java.lang.Integer.valueOf((((~((-691521617) | i2)) | 17270864 | i49) * (-470)) + 236697007 + (((~(i2 | (-674250753))) | i49) * 470))};
                                                    java.lang.Object obj64 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                                    if (obj64 == null) {
                                                        java.lang.Class cls60 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2712 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.view.View.combineMeasuredStates(0, 0));
                                                        byte b45 = (byte) (-$$a[14]);
                                                        byte b46 = (byte) (b45 + 1);
                                                        java.lang.Object[] objArr209 = new java.lang.Object[1];
                                                        a(b45, b46, b46, objArr209);
                                                        obj64 = cls60.getMethod((java.lang.String) objArr209[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj64);
                                                    }
                                                    ((int[]) objArr207[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj64).invoke(null, objArr208)).intValue();
                                                    return objArr207;
                                                } catch (java.lang.Throwable th4) {
                                                    java.lang.Throwable cause = th4.getCause();
                                                    if (cause != null) {
                                                        throw cause;
                                                    }
                                                    throw th4;
                                                }
                                            }
                                            java.lang.Object[] objArr210 = {((java.lang.String) objArr2[0]).intern()};
                                            java.lang.Object obj65 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj65 == null) {
                                                java.lang.Class cls61 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 41, 1921 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                byte[] bArr35 = $$a;
                                                java.lang.Object[] objArr211 = new java.lang.Object[1];
                                                a((byte) (-bArr35[14]), (byte) (-bArr35[16]), 653, objArr211);
                                                obj65 = cls61.getMethod((java.lang.String) objArr211[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj65);
                                            }
                                            java.lang.Object invoke6 = ((java.lang.reflect.Method) obj65).invoke(null, objArr210);
                                            if (invoke6 != null) {
                                                java.lang.Object[] objArr212 = new java.lang.Object[1];
                                                c("鯔閗鮦댞\n竨M圕䶜ꐓ\u0e72", android.text.TextUtils.getCapsMode(str2, 0, 0), objArr212);
                                                if (invoke6.equals(((java.lang.String) objArr212[0]).intern())) {
                                                    java.lang.Object[] objArr213 = new java.lang.Object[1];
                                                    c("벻悛볋䘂蘣ꁄ✢ꈄ쮩∵쐉퓃謨㸾丂砹漙騸\uea0e鱳팤\uf646癲〔띮剄鉲", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, objArr213);
                                                    try {
                                                        java.lang.Object[] objArr214 = {((java.lang.String) objArr213[0]).intern()};
                                                        java.lang.Object obj66 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                        if (obj66 == null) {
                                                            java.lang.Class cls62 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 40, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1921, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                                            byte[] bArr36 = $$a;
                                                            java.lang.Object[] objArr215 = new java.lang.Object[1];
                                                            a((byte) (-bArr36[14]), (byte) (-bArr36[16]), 653, objArr215);
                                                            obj66 = cls62.getMethod((java.lang.String) objArr215[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj66);
                                                        }
                                                        java.lang.String str8 = (java.lang.String) ((java.lang.reflect.Method) obj66).invoke(null, objArr214);
                                                        if (str8 != null && (parseInt = java.lang.Integer.parseInt(str8)) != 0) {
                                                            i6 = parseInt + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                                            if (i6 != 0) {
                                                            }
                                                        }
                                                    } catch (java.lang.Throwable th5) {
                                                        java.lang.Throwable cause2 = th5.getCause();
                                                        if (cause2 != null) {
                                                            throw cause2;
                                                        }
                                                        throw th5;
                                                    }
                                                }
                                            }
                                            i6 = 0;
                                            if (i6 != 0) {
                                            }
                                        } catch (java.lang.Throwable th6) {
                                            java.lang.Throwable cause3 = th6.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th6;
                                        }
                                        objArr2 = new java.lang.Object[1];
                                        b("赤밨蔘먆䨌좈ꓨࡧ䨌좈泙泗䚛磭ᤆ䗵\uee4c趁", android.view.View.combineMeasuredStates(0, 0) + 18, objArr2);
                                    } catch (java.lang.Throwable th7) {
                                        java.lang.Throwable cause4 = th7.getCause();
                                        if (cause4 != null) {
                                            throw cause4;
                                        }
                                        throw th7;
                                    }
                                }
                            } else {
                                i2 = i11;
                                str = "";
                                strArr3 = strArr5;
                                num6 = num4;
                                obj6 = invoke5;
                            }
                            if (obj6 != null) {
                                java.lang.Object[] objArr216 = {obj6, 42};
                                java.lang.Object obj67 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj67 == null) {
                                    java.lang.Class cls63 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2594, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                                    byte[] bArr37 = $$a;
                                    java.lang.Object[] objArr217 = new java.lang.Object[1];
                                    a((byte) (-bArr37[14]), (byte) (-bArr37[16]), 653, objArr217);
                                    obj67 = cls63.getMethod((java.lang.String) objArr217[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj67);
                                }
                                long longValue27 = ((java.lang.Long) ((java.lang.reflect.Method) obj67).invoke(null, objArr216)).longValue();
                                long j81 = ~longValue27;
                                long j82 = i2;
                                long j83 = ~j82;
                                num5 = num6;
                                long j84 = (46 * longValue27) + 6032099002L + (((~(j81 | j83)) | 131132587) * (-90)) + (((~(longValue27 | 131132587)) | (~(j81 | j82))) * (-45)) + (((~((-131132588) | j82)) | j81 | (~(131132587 | j83))) * 45) + 1125967937;
                                int i50 = ~i2;
                            } else {
                                num5 = num6;
                            }
                            java.lang.Object[] objArr852 = new java.lang.Object[1];
                            c("菆℻菩\u07b4ｼჹ᠙\ue3b1닽学璵摾둕羂㝉죃偸\udb82鍍ⲕ\uec63럩༣肥蠄Ᏼ\ueb30", android.view.ViewConfiguration.getTouchSlop() >> 8, objArr852);
                            java.lang.Object[] objArr862 = {((java.lang.String) objArr852[0]).intern()};
                            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj2 == null) {
                            }
                            long longValue102 = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr862)).longValue();
                            j = i2;
                            j2 = ~j;
                            long j412 = ~(458532344 | j2);
                            long j422 = ~(longValue102 | (-458532345));
                            long j432 = ((-1527) * longValue102) + 350777243160L + ((longValue102 | j412) * 764) + (((~(j2 | longValue102)) | j422) * (-1528)) + (((~((~longValue102) | 458532344)) | j422 | j412) * 764) + 832007723;
                            i3 = ~i2;
                            j3 = (((int) (j432 >> 32)) & ((((~(1349768948 | i3)) | 84158466) * (-108)) + 2118803742 + (((~((-87457463) | i2)) | 1346469952 | (~(87457462 | i3))) * 54) + ((1346469952 | i2) * 54))) | (((int) j432) & ((((~(1124956723 | i3)) | 608174080) * (-108)) + 702563325 + (((~((-1732784163) | i2)) | 346641 | (~(1732784162 | i3))) * 54) + ((346641 | i2) * 54)));
                            java.lang.Object[] objArr882 = new java.lang.Object[1];
                            c("罐ꑈ罿苄◄骬\ue4c3暋桎臕ﺶ\uee37䣜\ufaf2\uedb9䊐곴廥䧲Ꚇუ", android.view.ViewConfiguration.getLongPressTimeout() >> 16, objArr882);
                            java.lang.Object[] objArr892 = {((java.lang.String) objArr882[0]).intern()};
                            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj3 == null) {
                            }
                            long longValue112 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr892)).longValue();
                            long j442 = ((-949) * longValue112) + 5592635412L + (((~((~longValue112) | j2)) | (~(j | 5893187))) * 1900) + (((~((-5893188) | j2)) | (~(longValue112 | j))) * (-950)) + (((~(j2 | longValue112)) | (~(j | (-5893188)))) * 950) + 1296433255;
                            long j452 = (((int) j442) & ((((~((-526618291) | i3)) | 1963844700) * (-983)) + 2038185154 + (((~(1963844700 | i3)) | (-2138042111)) * 983))) | (((int) (j442 >> 32)) & ((((~(1890630924 | i2)) | 151273536 | (~((-967109961) | i2))) * (-754)) + 887121506 + (((~((-151273537) | i2)) | (~((-815836425) | i3))) * (-754)) + ((1890630924 | i3) * 754)));
                            if (j3 <= 0) {
                            }
                            java.lang.Object[] objArr942 = new java.lang.Object[1];
                            c("菆℻菩\u07b4ｼჹ᠙\ue3b1닽学璵摾둕羂㝉죃偸\udb82鍍ⲕ\uec63럩༣肥蠄Ᏼ\ueb30", android.view.ViewConfiguration.getScrollBarSize() >> 8, objArr942);
                            java.lang.Object[] objArr952 = {((java.lang.String) objArr942[0]).intern()};
                            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj4 == null) {
                            }
                            long longValue122 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr952)).longValue();
                            long j462 = (306 * longValue122) + 276889216012L + (((~(longValue122 | 904866717)) | (~(j | 904866717))) * 305) + (((~longValue122) | (~(904866717 | j2))) * 305) + 385673350;
                            j4 = (((int) (j462 >> 32)) & (((((-170404353) | i3) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 1543993574) + (((~(1170347477 | i3)) | (-1244277249)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))) | (((int) j462) & ((((285753361 | r6) * (-476)) - 204530815) + ((~((-75633733) | i2)) * 952) + ((~((-75633733) | i3)) * 476)));
                            java.lang.Object[] objArr972 = new java.lang.Object[1];
                            b("\ud878衩Ⱃ滐", 3 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr972);
                            java.lang.Object[] objArr982 = {((java.lang.String) objArr972[0]).intern()};
                            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj5 == null) {
                            }
                            long longValue132 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr982)).longValue();
                            long j472 = j2 | (-422232295);
                            long j482 = (370 * longValue132) + 156225948780L + ((longValue132 | 422232294 | j2) * (-369)) + (((~j472) | longValue132) * (-369)) + (((~(j472 | longValue132)) | (~((~longValue132) | 422232294)) | (~(j | 422232294))) * 369) + 868307773;
                            long j492 = (((int) j482) & ((((~(2113251135 | i3)) * 52) - 1625619799) + (((~(769917718 | i3)) | (~((-2087823168) | i3)) | 1343333417) * (-52)) + (((~((-769917719) | i3)) | 25427968) * 52))) | (((int) (j482 >> 32)) & ((((~(1623828449 | i2)) | 151257106) * (-283)) + 1293314448 + ((~(1775085555 | i2)) * 283)));
                            if (j4 <= 0) {
                            }
                            java.lang.Object[] objArr1032 = new java.lang.Object[1];
                            b("\u0ff7\u2439깁尐댌窮\ue584ꅃ", 7 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr1032);
                            java.lang.String intern302 = ((java.lang.String) objArr1032[0]).intern();
                            java.lang.Object[] objArr1042 = new java.lang.Object[1];
                            b("\u0ff7\u2439깁尐댌窮膅黦긱㔵鸤股", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 11, objArr1042);
                            java.lang.String intern312 = ((java.lang.String) objArr1042[0]).intern();
                            java.lang.Object[] objArr1052 = new java.lang.Object[1];
                            c("ꞝ韛Ʝ녔尽\udb9c㰙啒ᆼ\uf839뿐꼛逎쥥鐍Ρ", android.view.ViewConfiguration.getTapTimeout() >> 16, objArr1052);
                            java.lang.String intern322 = ((java.lang.String) objArr1052[0]).intern();
                            java.lang.Object[] objArr1062 = new java.lang.Object[1];
                            b("\u0ff7\u2439깁尐댌窮膅黦シ\ue187赤밨", 12 - android.view.KeyEvent.normalizeMetaState(0), objArr1062);
                            java.lang.String intern332 = ((java.lang.String) objArr1062[0]).intern();
                            java.lang.Object[] objArr1072 = new java.lang.Object[1];
                            c("鏞辊鏱꤀㼯\ude67ࡊ䴉犲鬨먶\uaafdꑜ턿\uf704", 1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr1072);
                            java.lang.String intern342 = ((java.lang.String) objArr1072[0]).intern();
                            java.lang.Object[] objArr1082 = new java.lang.Object[1];
                            b("\u0ff7\u2439긱㔵鸤股", 6 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr1082);
                            java.lang.String intern352 = ((java.lang.String) objArr1082[0]).intern();
                            java.lang.Object[] objArr1092 = new java.lang.Object[1];
                            c("즪ה즅⍍ᇹ셟屵뗈", android.text.TextUtils.indexOf(str2, str2), objArr1092);
                            strArr = new java.lang.String[]{intern302, intern312, intern322, intern332, intern342, intern352, ((java.lang.String) objArr1092[0]).intern()};
                            i4 = 0;
                            while (true) {
                                if (i4 >= 7) {
                                }
                                i4++;
                                strArr = strArr2;
                            }
                            if (i5 != 0) {
                            }
                        } else {
                            i28++;
                            i11 = i11;
                            strArr5 = strArr5;
                            i27 = 0;
                        }
                    }
                }
                i2 = i11;
                str = "";
                num5 = num4;
                java.lang.Object[] objArr8522 = new java.lang.Object[1];
                c("菆℻菩\u07b4ｼჹ᠙\ue3b1닽学璵摾둕羂㝉죃偸\udb82鍍ⲕ\uec63럩༣肥蠄Ᏼ\ueb30", android.view.ViewConfiguration.getTouchSlop() >> 8, objArr8522);
                java.lang.Object[] objArr8622 = {((java.lang.String) objArr8522[0]).intern()};
                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj2 == null) {
                }
                long longValue1022 = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr8622)).longValue();
                j = i2;
                j2 = ~j;
                long j4122 = ~(458532344 | j2);
                long j4222 = ~(longValue1022 | (-458532345));
                long j4322 = ((-1527) * longValue1022) + 350777243160L + ((longValue1022 | j4122) * 764) + (((~(j2 | longValue1022)) | j4222) * (-1528)) + (((~((~longValue1022) | 458532344)) | j4222 | j4122) * 764) + 832007723;
                i3 = ~i2;
                j3 = (((int) (j4322 >> 32)) & ((((~(1349768948 | i3)) | 84158466) * (-108)) + 2118803742 + (((~((-87457463) | i2)) | 1346469952 | (~(87457462 | i3))) * 54) + ((1346469952 | i2) * 54))) | (((int) j4322) & ((((~(1124956723 | i3)) | 608174080) * (-108)) + 702563325 + (((~((-1732784163) | i2)) | 346641 | (~(1732784162 | i3))) * 54) + ((346641 | i2) * 54)));
                java.lang.Object[] objArr8822 = new java.lang.Object[1];
                c("罐ꑈ罿苄◄骬\ue4c3暋桎臕ﺶ\uee37䣜\ufaf2\uedb9䊐곴廥䧲Ꚇუ", android.view.ViewConfiguration.getLongPressTimeout() >> 16, objArr8822);
                java.lang.Object[] objArr8922 = {((java.lang.String) objArr8822[0]).intern()};
                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj3 == null) {
                }
                long longValue1122 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr8922)).longValue();
                long j4422 = ((-949) * longValue1122) + 5592635412L + (((~((~longValue1122) | j2)) | (~(j | 5893187))) * 1900) + (((~((-5893188) | j2)) | (~(longValue1122 | j))) * (-950)) + (((~(j2 | longValue1122)) | (~(j | (-5893188)))) * 950) + 1296433255;
                long j4522 = (((int) j4422) & ((((~((-526618291) | i3)) | 1963844700) * (-983)) + 2038185154 + (((~(1963844700 | i3)) | (-2138042111)) * 983))) | (((int) (j4422 >> 32)) & ((((~(1890630924 | i2)) | 151273536 | (~((-967109961) | i2))) * (-754)) + 887121506 + (((~((-151273537) | i2)) | (~((-815836425) | i3))) * (-754)) + ((1890630924 | i3) * 754)));
                if (j3 <= 0) {
                }
                java.lang.Object[] objArr9422 = new java.lang.Object[1];
                c("菆℻菩\u07b4ｼჹ᠙\ue3b1닽学璵摾둕羂㝉죃偸\udb82鍍ⲕ\uec63럩༣肥蠄Ᏼ\ueb30", android.view.ViewConfiguration.getScrollBarSize() >> 8, objArr9422);
                java.lang.Object[] objArr9522 = {((java.lang.String) objArr9422[0]).intern()};
                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj4 == null) {
                }
                long longValue1222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr9522)).longValue();
                long j4622 = (306 * longValue1222) + 276889216012L + (((~(longValue1222 | 904866717)) | (~(j | 904866717))) * 305) + (((~longValue1222) | (~(904866717 | j2))) * 305) + 385673350;
                j4 = (((int) (j4622 >> 32)) & (((((-170404353) | i3) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 1543993574) + (((~(1170347477 | i3)) | (-1244277249)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))) | (((int) j4622) & ((((285753361 | r6) * (-476)) - 204530815) + ((~((-75633733) | i2)) * 952) + ((~((-75633733) | i3)) * 476)));
                java.lang.Object[] objArr9722 = new java.lang.Object[1];
                b("\ud878衩Ⱃ滐", 3 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr9722);
                java.lang.Object[] objArr9822 = {((java.lang.String) objArr9722[0]).intern()};
                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj5 == null) {
                }
                long longValue1322 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr9822)).longValue();
                long j4722 = j2 | (-422232295);
                long j4822 = (370 * longValue1322) + 156225948780L + ((longValue1322 | 422232294 | j2) * (-369)) + (((~j4722) | longValue1322) * (-369)) + (((~(j4722 | longValue1322)) | (~((~longValue1322) | 422232294)) | (~(j | 422232294))) * 369) + 868307773;
                long j4922 = (((int) j4822) & ((((~(2113251135 | i3)) * 52) - 1625619799) + (((~(769917718 | i3)) | (~((-2087823168) | i3)) | 1343333417) * (-52)) + (((~((-769917719) | i3)) | 25427968) * 52))) | (((int) (j4822 >> 32)) & ((((~(1623828449 | i2)) | 151257106) * (-283)) + 1293314448 + ((~(1775085555 | i2)) * 283)));
                if (j4 <= 0) {
                }
                java.lang.Object[] objArr10322 = new java.lang.Object[1];
                b("\u0ff7\u2439깁尐댌窮\ue584ꅃ", 7 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr10322);
                java.lang.String intern3022 = ((java.lang.String) objArr10322[0]).intern();
                java.lang.Object[] objArr10422 = new java.lang.Object[1];
                b("\u0ff7\u2439깁尐댌窮膅黦긱㔵鸤股", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 11, objArr10422);
                java.lang.String intern3122 = ((java.lang.String) objArr10422[0]).intern();
                java.lang.Object[] objArr10522 = new java.lang.Object[1];
                c("ꞝ韛Ʝ녔尽\udb9c㰙啒ᆼ\uf839뿐꼛逎쥥鐍Ρ", android.view.ViewConfiguration.getTapTimeout() >> 16, objArr10522);
                java.lang.String intern3222 = ((java.lang.String) objArr10522[0]).intern();
                java.lang.Object[] objArr10622 = new java.lang.Object[1];
                b("\u0ff7\u2439깁尐댌窮膅黦シ\ue187赤밨", 12 - android.view.KeyEvent.normalizeMetaState(0), objArr10622);
                java.lang.String intern3322 = ((java.lang.String) objArr10622[0]).intern();
                java.lang.Object[] objArr10722 = new java.lang.Object[1];
                c("鏞辊鏱꤀㼯\ude67ࡊ䴉犲鬨먶\uaafdꑜ턿\uf704", 1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr10722);
                java.lang.String intern3422 = ((java.lang.String) objArr10722[0]).intern();
                java.lang.Object[] objArr10822 = new java.lang.Object[1];
                b("\u0ff7\u2439긱㔵鸤股", 6 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr10822);
                java.lang.String intern3522 = ((java.lang.String) objArr10822[0]).intern();
                java.lang.Object[] objArr10922 = new java.lang.Object[1];
                c("즪ה즅⍍ᇹ셟屵뗈", android.text.TextUtils.indexOf(str2, str2), objArr10922);
                strArr = new java.lang.String[]{intern3022, intern3122, intern3222, intern3322, intern3422, intern3522, ((java.lang.String) objArr10922[0]).intern()};
                i4 = 0;
                while (true) {
                    if (i4 >= 7) {
                    }
                    i4++;
                    strArr = strArr2;
                }
                if (i5 != 0) {
                }
            } else {
                num = -2032622553;
                num2 = 0;
                java.lang.Object obj68 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
                if (obj68 == null) {
                    java.lang.Class cls64 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 26, 1838 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.os.Process.getGidForName("") + 1));
                    byte[] bArr38 = $$a;
                    java.lang.Object[] objArr218 = new java.lang.Object[1];
                    a((byte) (-bArr38[14]), (byte) (-bArr38[16]), 653, objArr218);
                    java.lang.reflect.Method method = cls64.getMethod((java.lang.String) objArr218[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, method);
                    obj68 = method;
                }
                long longValue28 = ((java.lang.Long) ((java.lang.reflect.Method) obj68).invoke(null, null)).longValue();
                long j85 = i11;
                long j86 = ~longValue28;
                num3 = 16;
                long j87 = ((-661) * longValue28) + 794571514849L + (((~j85) | (~(j86 | 1202074908))) * 1324) + (((~((-1202074909) | j85)) | (~(longValue28 | j85))) * (-1324)) + (((~(1202074908 | longValue28)) | (((-1202074909) | j86) ^ (-1))) * 662) + 2042153854;
                int i51 = ~i11;
            }
        } catch (java.lang.Throwable th8) {
            java.lang.Throwable cause5 = th8.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th8;
        }
    }
}
