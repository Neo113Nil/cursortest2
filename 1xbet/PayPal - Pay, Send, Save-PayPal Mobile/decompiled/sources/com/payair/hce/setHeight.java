package com.payair.hce;

/* loaded from: classes4.dex */
public final class setHeight extends com.payair.hce.setEms {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final java.util.concurrent.ConcurrentMap<com.payair.hce.setHeight.valueOf, com.payair.hce.setHeight> AlternateContactlessPaymentDataJson;
    private static int IccPrivateKeyCrtComponentsJson;
    private static long valueOf;
    private static int values;
    private final java.lang.String DigitizedCardProfile;
    private byte[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = 3 - (b2 * 2);
        int i3 = 113 - s;
        int i4 = b * 4;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        if (bArr == null) {
            int i6 = i5;
            i = 0;
            i3 += i6;
            bArr2[i] = (byte) i3;
            i2++;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i6 = bArr[i2];
            i3 += i6;
            bArr2[i] = (byte) i3;
            i2++;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            i2++;
            if (i == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = (~i) | i2;
        int i5 = ~i3;
        if ((i * 141) + (i2 * (-279)) + ((i2 | i3) * 140) + (((~i4) | (~(i5 | i2))) * (-280)) + (((~(i | (~i2))) | (~(i5 | i)) | (~(i4 | i3))) * 140) != 1) {
            return DigitizedCardProfile(objArr);
        }
        com.payair.hce.setHeight setheight = (com.payair.hce.setHeight) objArr[0];
        java.io.ByteArrayOutputStream byteArrayOutputStream = (java.io.ByteArrayOutputStream) objArr[1];
        com.payair.hce.setCollapseContentDescription setcollapsecontentdescription = new com.payair.hce.setCollapseContentDescription(setheight.DigitizedCardProfile);
        int parseInt = java.lang.Integer.parseInt((java.lang.String) com.payair.hce.setCollapseContentDescription.writeReplace(new java.lang.Object[]{setcollapsecontentdescription}, -432883902, 432883903, java.lang.System.identityHashCode(setcollapsecontentdescription))) * 40;
        java.lang.String str = (java.lang.String) com.payair.hce.setCollapseContentDescription.writeReplace(new java.lang.Object[]{setcollapsecontentdescription}, -432883902, 432883903, java.lang.System.identityHashCode(setcollapsecontentdescription));
        if (str.length() <= 18) {
            valueOf(byteArrayOutputStream, parseInt + java.lang.Long.parseLong(str));
        } else {
            writeReplace(byteArrayOutputStream, new java.math.BigInteger(str).add(java.math.BigInteger.valueOf(parseInt)));
        }
        while (((java.lang.Boolean) com.payair.hce.setCollapseContentDescription.writeReplace(new java.lang.Object[]{setcollapsecontentdescription}, 1772817506, -1772817506, java.lang.System.identityHashCode(setcollapsecontentdescription))).booleanValue()) {
            java.lang.String str2 = (java.lang.String) com.payair.hce.setCollapseContentDescription.writeReplace(new java.lang.Object[]{setcollapsecontentdescription}, -432883902, 432883903, java.lang.System.identityHashCode(setcollapsecontentdescription));
            if (str2.length() <= 18) {
                IccPrivateKeyCrtComponentsJson = (values + 37) % 128;
                valueOf(byteArrayOutputStream, java.lang.Long.parseLong(str2));
                values = (IccPrivateKeyCrtComponentsJson + 95) % 128;
            } else {
                writeReplace(byteArrayOutputStream, new java.math.BigInteger(str2));
            }
        }
        return null;
    }

    public static com.payair.hce.setHeight writeReplace(java.lang.Object obj) {
        if (obj != null) {
            int i = values;
            IccPrivateKeyCrtComponentsJson = (i + 49) % 128;
            if (!(obj instanceof com.payair.hce.setHeight)) {
                if (obj instanceof com.payair.hce.setShadowLayer) {
                    IccPrivateKeyCrtComponentsJson = (i + 79) % 128;
                    com.payair.hce.setShadowLayer setshadowlayer = (com.payair.hce.setShadowLayer) obj;
                    if (setshadowlayer.getAid() instanceof com.payair.hce.setHeight) {
                        IccPrivateKeyCrtComponentsJson = (values + 13) % 128;
                        return (com.payair.hce.setHeight) setshadowlayer.getAid();
                    }
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("\uf729⣝䣎棶裣ꢔ좊\ue8f7ࢧ⡛䡀桾衯ꠉ졎\ue836࠾⡡䧕槆觠꧌즘\ue994ব⦨䥔楈襹ꤷ쥞", 57328 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(obj.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        return (com.payair.hce.setHeight) obj;
    }

    public static class valueOf {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int AlternateContactlessPaymentDataJson;
        private static int getProfileVersion;
        private static int valueOf;
        private static long values;
        private final byte[] DigitizedCardProfile;
        private final int writeReplace;

        private static void a(int i, short s, int i2, java.lang.Object[] objArr) {
            int i3 = i2 + 4;
            int i4 = (i * 653) + 65;
            byte[] bArr = $$a;
            int i5 = s * 34;
            char[] cArr = new char[i5 + 1];
            int i6 = -1;
            if (bArr == null) {
                i4 = (i5 + (-i4)) - 2;
            }
            while (true) {
                i6++;
                cArr[i6] = (char) i4;
                if (i6 == i5) {
                    objArr[0] = new java.lang.String(cArr);
                    return;
                } else {
                    i3++;
                    i4 = (i4 + (-bArr[i3])) - 2;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void d(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
            int i;
            int i2;
            int i3 = (b * 4) + 4;
            int i4 = (b3 * 3) + 1;
            int i5 = (b2 * 2) + 115;
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[i4];
            if (bArr == null) {
                int i6 = i3;
                int i7 = i4;
                i2 = 0;
                int i8 = (-i3) + i7;
                int i9 = i6 + 1;
                i = i2;
                i5 = i8;
                i3 = i9;
                i2 = i + 1;
                bArr2[i] = (byte) i5;
                if (i2 == i4) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                int i10 = i5;
                i6 = i3;
                i3 = bArr[i3];
                i7 = i10;
                int i82 = (-i3) + i7;
                int i92 = i6 + 1;
                i = i2;
                i5 = i82;
                i3 = i92;
                i2 = i + 1;
                bArr2[i] = (byte) i5;
                if (i2 == i4) {
                }
            } else {
                i = 0;
                i2 = i + 1;
                bArr2[i] = (byte) i5;
                if (i2 == i4) {
                }
            }
        }

        private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
            char[] cArr;
            int i2 = $10 + 87;
            int i3 = i2 % 128;
            $11 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (str != null) {
                $10 = (i3 + 39) % 128;
                cArr = str.toCharArray();
            } else {
                cArr = str;
            }
            com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
            char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(values ^ (-3824242241614154557L), cArr, i);
            getcardholdervalidator.valueOf = 4;
            $11 = ($10 + 109) % 128;
            while (getcardholdervalidator.valueOf < writeReplace.length) {
                getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
                int i4 = getcardholdervalidator.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(values)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1920, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((byte) 0, (byte) 1, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                    }
                    writeReplace[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.KeyEvent.getDeadChar(0, 0), 429 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (31610 - android.view.KeyEvent.normalizeMetaState(0)));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d((byte) 0, (byte) 2, (byte) 0, objArr5);
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
            java.lang.String str2 = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
            $11 = ($10 + 81) % 128;
            objArr[0] = str2;
        }

        private static void b(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
            int i4 = $10 + 3;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            char[] charArray = str != null ? str.toCharArray() : str;
            com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
            char[] cArr = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                $11 = ($10 + 83) % 128;
                digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
                cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
                int i5 = digitizedCardJson11.DigitizedCardProfile;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5]), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 2072 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 60037));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((byte) 0, (byte) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                    }
                    cArr[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 53, android.text.TextUtils.getCapsMode("", 0, 0) + 3543, (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
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
            if (i2 > 0) {
                $10 = ($11 + 107) % 128;
                digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
                char[] cArr2 = new char[i3];
                java.lang.System.arraycopy(cArr, 0, cArr2, 0, i3);
                java.lang.System.arraycopy(cArr2, 0, cArr, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
                java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
            }
            if (z) {
                char[] cArr3 = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 0;
                while (digitizedCardJson11.DigitizedCardProfile < i3) {
                    cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                    java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 53, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 3543, (char) android.view.KeyEvent.keyCodeFromString(""))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                }
                cArr = cArr3;
            }
            objArr[0] = new java.lang.String(cArr);
        }

        valueOf(byte[] bArr) {
            this.writeReplace = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(bArr);
            this.DigitizedCardProfile = bArr;
        }

        public int hashCode() {
            int i = getProfileVersion;
            valueOf = (i + 21) % 128;
            int i2 = this.writeReplace;
            int i3 = i + 111;
            valueOf = i3 % 128;
            if (i3 % 2 == 0) {
                return i2;
            }
            throw null;
        }

        public boolean equals(java.lang.Object obj) {
            int i = getProfileVersion + 11;
            int i2 = i % 128;
            valueOf = i2;
            if (i % 2 == 0) {
                if (!(obj instanceof com.payair.hce.setHeight.valueOf)) {
                    return false;
                }
                int i3 = i2 + 13;
                getProfileVersion = i3 % 128;
                if (i3 % 2 != 0) {
                    return com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(this.DigitizedCardProfile, ((com.payair.hce.setHeight.valueOf) obj).DigitizedCardProfile);
                }
                com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(this.DigitizedCardProfile, ((com.payair.hce.setHeight.valueOf) obj).DigitizedCardProfile);
                throw new java.lang.ArithmeticException();
            }
            throw null;
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            valueOf = 0;
            getProfileVersion = 1;
            AlternateContactlessPaymentDataJson = 1889207100;
            values = -4334014679719895252L;
        }

        static void init$1() {
            $$d = new byte[]{com.google.common.base.Ascii.FF, 9, 103, -116};
            $$e = 181;
        }

        static void init$0() {
            $$a = new byte[]{63, kotlin.io.encoding.Base64.padSymbol, -101, com.google.common.base.Ascii.SI, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
            $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:213:0x0b7b, code lost:
        
            com.payair.hce.setHeight.valueOf.getProfileVersion = (com.payair.hce.setHeight.valueOf.valueOf + 13) % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:214:0x0b84, code lost:
        
            r3 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
            ((int[]) r3[0])[0] = r5 == true ? 1 : 0;
            ((int[]) r3[1])[0] = r5 == true ? 1 : 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:215:0x0b9b, code lost:
        
            r2 = ~((~(r5 == true ? 1 : 0)) | 1878923900);
         */
        /* JADX WARN: Code restructure failed: missing block: B:217:0x0ba2, code lost:
        
            r6 = new java.lang.Object[]{java.lang.Integer.valueOf(r38), r23, java.lang.Integer.valueOf((((((~((-1094455813) | (r5 == true ? 1 : 0))) | 17568260) | r2) * (-470)) + 1563639768) + ((r2 | (~((-1076887553) | (r5 == true ? 1 : 0)))) * 470))};
            r2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r7);
            r2 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:218:0x0bd4, code lost:
        
            if (r2 != null) goto L191;
         */
        /* JADX WARN: Code restructure failed: missing block: B:219:0x0bd6, code lost:
        
            r2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.Gravity.getAbsoluteGravity(0, 0), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2713, (char) (android.view.MotionEvent.axisFromString(r1) + 1));
            r4 = com.payair.hce.setHeight.valueOf.$$a[14];
            r11 = new java.lang.Object[1];
            a((byte) (r4 + 1), (byte) (-r4), r4, r11);
            r2 = r2.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r7, r2);
            r2 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:222:0x0c31, code lost:
        
            ((int[]) r3[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r2).invoke(null, r6)).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:223:0x0c38, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:225:0x0c39, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:226:0x0c3a, code lost:
        
            r3 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:227:0x0c3f, code lost:
        
            if (r3 != null) goto L198;
         */
        /* JADX WARN: Code restructure failed: missing block: B:228:0x0c41, code lost:
        
            throw r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:229:0x0c42, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:254:0x0c7f, code lost:
        
            r3 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
            ((int[]) r3[0])[0] = r5 == true ? 1 : 0;
            ((int[]) r3[1])[0] = ~r5 ? 1 : 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:257:0x0c9a, code lost:
        
            r4 = new java.lang.Object[]{java.lang.Integer.valueOf(r38), 16, java.lang.Integer.valueOf(((((~((-89875018) | (r5 == true ? 1 : 0))) | 72425544) * (-283)) + 918084632) + ((~((-17449474) | (r5 == true ? 1 : 0))) * 283))};
            r2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r7);
            r2 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:258:0x0cd0, code lost:
        
            if (r2 != null) goto L224;
         */
        /* JADX WARN: Code restructure failed: missing block: B:259:0x0cd2, code lost:
        
            r2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 50, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2713, (char) android.widget.ExpandableListView.getPackedPositionGroup(0));
            r6 = com.payair.hce.setHeight.valueOf.$$a[14];
            r11 = new java.lang.Object[1];
            a((byte) (r6 + 1), (byte) (-r6), r6, r11);
            r2 = r2.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r7, r2);
            r2 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:262:0x0d2d, code lost:
        
            ((int[]) r3[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r2).invoke(null, r4)).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:263:0x0d34, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:265:0x0d35, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:266:0x0d36, code lost:
        
            r3 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:267:0x0d3b, code lost:
        
            if (r3 != null) goto L231;
         */
        /* JADX WARN: Code restructure failed: missing block: B:268:0x0d3d, code lost:
        
            throw r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:269:0x0d3e, code lost:
        
            throw r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v37 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v122, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r2v166, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r2v18, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r2v192, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r2v78, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r5v21 */
        /* JADX WARN: Type inference failed for: r5v22 */
        /* JADX WARN: Type inference failed for: r5v23 */
        /* JADX WARN: Type inference failed for: r5v24 */
        /* JADX WARN: Type inference failed for: r5v25 */
        /* JADX WARN: Type inference failed for: r5v28, types: [int] */
        /* JADX WARN: Type inference failed for: r5v29 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v5 */
        /* JADX WARN: Type inference failed for: r5v54 */
        /* JADX WARN: Type inference failed for: r5v6 */
        /* JADX WARN: Type inference failed for: r6v5, types: [int[]] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v29 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v32, types: [int[]] */
        /* JADX WARN: Type inference failed for: r7v37 */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v5, types: [int] */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v61 */
        /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r7v9 */
        /* JADX WARN: Type inference failed for: r8v109, types: [int[]] */
        /* JADX WARN: Type inference failed for: r8v96, types: [int[]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] values(android.content.Context context, java.lang.String[] strArr, int i, int i2, int i3) {
            ?? r7;
            int i4;
            java.lang.Object obj;
            java.lang.Integer num;
            java.lang.Object invoke;
            ?? r4;
            int i5;
            java.lang.Object obj2;
            java.lang.Object obj3;
            java.lang.Throwable th;
            int i6;
            int i7;
            java.nio.LongBuffer[] longBufferArr;
            int i8;
            ?? r1 = context;
            java.lang.String[] strArr2 = strArr;
            int i9 = i;
            int i10 = valueOf;
            int i11 = i10 + 109;
            getProfileVersion = i11 % 128;
            int i12 = 0;
            java.lang.Integer num2 = 0;
            if (i11 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            long j = 0;
            int i13 = 1;
            try {
                if (r1 == 0) {
                    java.lang.Object[] objArr = {new int[1], new int[1], new int[1]};
                    ((int[]) objArr[0])[0] = i9;
                    ((int[]) objArr[1])[0] = i9;
                    int i14 = ~(7110010 | i9);
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((i14 | 1888584196) * (-814)) + 583300382 + ((i14 | (~((~i9) | (-1889382151))) | 6312056) * 407) + (((~((-7110011) | i9)) | 6312056 | (~(i9 | 1889382150))) * 407))};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj5 = obj4;
                    if (obj4 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2713 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                        byte b = $$a[14];
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a((byte) (b + 1), (byte) (-b), b, objArr3);
                        java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method);
                        obj5 = method;
                    }
                    ((int[]) objArr[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr2)).intValue();
                    return objArr;
                }
                if (strArr2.length == 0) {
                    getProfileVersion = (i10 + 25) % 128;
                    java.lang.Object[] objArr4 = {new int[1], new int[1], new int[1]};
                    ((int[]) objArr4[0])[0] = i9;
                    ((int[]) objArr4[1])[0] = i9 ^ 4;
                    int i15 = (~((-993265226) | i9)) | 823395841;
                    java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((i15 * 992) + 1834218624 + ((i15 | (~((~i9) | 1073096319))) * (-496)) + ((903226935 | i9) * 496))};
                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    java.lang.Object obj7 = obj6;
                    if (obj6 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 50, 2713 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                        byte b2 = $$a[14];
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        a((byte) (b2 + 1), (byte) (-b2), b2, objArr6);
                        java.lang.reflect.Method method2 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method2);
                        obj7 = method2;
                    }
                    ((int[]) objArr4[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr5)).intValue();
                    int i16 = getProfileVersion + 71;
                    valueOf = i16 % 128;
                    if (i16 % 2 == 0) {
                        return objArr4;
                    }
                    throw null;
                }
                int length = strArr2.length;
                java.nio.LongBuffer[] longBufferArr2 = new java.nio.LongBuffer[length];
                int i17 = 0;
                while (true) {
                    ?? r5 = "";
                    if (i17 >= strArr2.length) {
                        int i18 = length;
                        java.lang.Integer num3 = num2;
                        try {
                            if (r1 == 0) {
                                try {
                                    java.lang.Object[] objArr7 = {new int[1], new int[1], new int[1]};
                                    i12 = i;
                                    ((int[]) objArr7[0])[0] = i12;
                                    ((int[]) objArr7[1])[0] = i12;
                                    try {
                                        java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(i3), num3, java.lang.Integer.valueOf((((-142608449) | i12) * (-627)) + 1291135488 + (((~((-1417667633) | i12)) | 478824528) * (-627)) + (((~((~i12) | 1417667632)) | (~(478824528 | i12))) * 627))};
                                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        java.lang.Object obj9 = obj8;
                                        if (obj8 == null) {
                                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 50, 2713 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                            byte b3 = $$a[14];
                                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                                            a((byte) (b3 + 1), (byte) (-b3), b3, objArr9);
                                            java.lang.reflect.Method method3 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method3);
                                            obj9 = method3;
                                        }
                                        ((int[]) objArr7[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr8)).intValue();
                                        return objArr7;
                                    } catch (java.lang.Throwable th2) {
                                        java.lang.Throwable cause = th2.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th2;
                                    }
                                } catch (java.lang.Throwable unused) {
                                    r1 = "";
                                    r7 = -1347122530;
                                    r5 = i;
                                }
                            } else {
                                r7 = i;
                                byte[][] bArr = new byte[i18][];
                                int i19 = 0;
                                int i20 = 0;
                                while (i19 < i18) {
                                    java.nio.LongBuffer longBuffer = longBufferArr2[i19];
                                    if (longBuffer.capacity() == 4) {
                                        int i21 = getProfileVersion + 45;
                                        valueOf = i21 % 128;
                                        if (i21 % 2 == 0) {
                                            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(32);
                                            java.nio.LongBuffer asLongBuffer = allocate.asLongBuffer();
                                            long[] array = longBuffer.array();
                                            int i22 = 0;
                                            for (int length2 = array.length; i22 < length2; length2 = length2) {
                                                asLongBuffer.put(array[i22]);
                                                i22++;
                                                longBufferArr2 = longBufferArr2;
                                            }
                                            longBufferArr = longBufferArr2;
                                            bArr[i20] = allocate.array();
                                            i20++;
                                            i19++;
                                            longBufferArr2 = longBufferArr;
                                        }
                                    }
                                    longBufferArr = longBufferArr2;
                                    i19++;
                                    longBufferArr2 = longBufferArr;
                                }
                                java.nio.LongBuffer[] longBufferArr3 = longBufferArr2;
                                if (i20 > 0) {
                                    getProfileVersion = (valueOf + 107) % 128;
                                    try {
                                        int currentTimeMillis = ((int) java.lang.System.currentTimeMillis()) ^ 343337308;
                                        try {
                                            try {
                                                java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(r7 ^ currentTimeMillis), bArr, java.lang.Integer.valueOf(i20)};
                                                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(336776035);
                                                java.lang.Object obj11 = obj10;
                                                if (obj10 == null) {
                                                    try {
                                                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27, android.text.TextUtils.indexOf("", "", 0) + 429, (char) (android.view.MotionEvent.axisFromString("") + 31611));
                                                        byte b4 = (byte) (-$$a[14]);
                                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                                        a(b4, (byte) (b4 - 1), r8[23], objArr11);
                                                        java.lang.reflect.Method method4 = cls4.getMethod((java.lang.String) objArr11[0], java.lang.Integer.TYPE, byte[][].class, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(336776035, method4);
                                                        obj11 = method4;
                                                    } catch (java.lang.Throwable th3) {
                                                        th = th3;
                                                        java.lang.Throwable cause2 = th.getCause();
                                                        if (cause2 != null) {
                                                            throw cause2;
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj11).invoke(null, objArr10)).longValue();
                                                long j2 = ~longValue;
                                                long j3 = (long) r7;
                                                long j4 = ~j3;
                                                num = num3;
                                                i4 = i18;
                                                long j5 = ~(j4 | longValue);
                                                obj3 = "";
                                                long j6 = ((517 * longValue) - 134572498330L) + (((~(j4 | 261305822)) | (~(j2 | j3)) | j5) * (-516)) + (((~(j4 | (-261305823) | longValue)) | (~(j3 | j2 | (-261305823)))) * 516) + (((~(longValue | (-261305823))) | j5) * 516) + 672594885;
                                                r5 = i;
                                                i6 = ~r5;
                                                i7 = ((((int) j6) & ((((((~((-373185677) | i6)) | 36179972) | (~((-1810412087) | i6))) * (-397)) + 684112008) + (((-2111237819) | r5) * 397))) | (((int) (j6 >> 32)) & (((((1995989391 | r5) * (-50)) + 325826130) + (((~((-1454399500) | r5)) | (~(2013162479 | i6))) * 50)) + (((~(1995989391 | i6)) | ((~(558762980 | i6)) | (-2013162480))) * 50)))) ^ currentTimeMillis;
                                            } catch (java.lang.Throwable th4) {
                                                th = th4;
                                            }
                                        } catch (java.lang.Throwable unused2) {
                                        }
                                    } catch (java.lang.Throwable unused3) {
                                        obj3 = "";
                                        r5 = r7;
                                        r7 = -1347122530;
                                    }
                                    if ((i2 & 1) == 1 && (i7 ^ r5) == 15) {
                                        valueOf = (getProfileVersion + 121) % 128;
                                        try {
                                            java.lang.Object[] objArr12 = {new int[1], new int[1], new int[1]};
                                            ((int[]) objArr12[0])[0] = r5;
                                            ((int[]) objArr12[1])[0] = i7;
                                            try {
                                                java.lang.Object[] objArr13 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-823431682) | i6)) | (-1073060480)) * (-591)) + 394760606 + (((-823431682) | r5) * 591))};
                                                try {
                                                    java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    java.lang.Object obj13 = obj12;
                                                    if (obj12 == null) {
                                                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 50, android.graphics.Color.blue(0) + 2713, (char) android.view.KeyEvent.normalizeMetaState(0));
                                                        byte b5 = $$a[14];
                                                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                                                        a((byte) (b5 + 1), (byte) (-b5), b5, objArr14);
                                                        java.lang.reflect.Method method5 = cls5.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method5);
                                                        obj13 = method5;
                                                    }
                                                    ((int[]) objArr12[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj13).invoke(null, objArr13)).intValue();
                                                    return objArr12;
                                                } catch (java.lang.Throwable th5) {
                                                    th = th5;
                                                    java.lang.Throwable th6 = th;
                                                    java.lang.Throwable cause3 = th6.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th6;
                                                }
                                            } catch (java.lang.Throwable th7) {
                                                th = th7;
                                            }
                                        } catch (java.lang.Throwable unused4) {
                                            r7 = -1347122530;
                                        }
                                    } else {
                                        r7 = -1347122530;
                                        int i23 = i7 ^ r5;
                                        if (i23 == 0) {
                                            java.lang.Object[] objArr15 = {new int[1], new int[1], new int[1]};
                                            ((int[]) objArr15[0])[0] = r5;
                                            ((int[]) objArr15[1])[0] = i7;
                                            try {
                                                java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(i3), num, java.lang.Integer.valueOf((((~((-1114772673) | r5)) | 34608320) * 336) + 1113389184 + (((~(781719488 | r5)) | (-1861883841)) * (-168)) + (((~(781719488 | i6)) | (-1114772673)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                                                java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                java.lang.Object obj15 = obj14;
                                                if (obj14 == null) {
                                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.normalizeMetaState(0), 2714 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                                                    byte b6 = $$a[14];
                                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                                    a((byte) (b6 + 1), (byte) (-b6), b6, objArr17);
                                                    java.lang.reflect.Method method6 = cls6.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method6);
                                                    obj15 = method6;
                                                }
                                                ((int[]) objArr15[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr16)).intValue();
                                                return objArr15;
                                            } catch (java.lang.Throwable th8) {
                                                java.lang.Throwable cause4 = th8.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th8;
                                            }
                                        }
                                        r5 = r5;
                                        r7 = -1347122530;
                                        obj = obj3;
                                        if (i23 == 11) {
                                            java.lang.Object[] objArr18 = {new int[1], new int[1], new int[1]};
                                            ((int[]) objArr18[0])[0] = r5;
                                            ((int[]) objArr18[1])[0] = i7;
                                            try {
                                                java.lang.Object[] objArr19 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-234947361) | i6)) | (~(1610460156 | r5))) * (-302)) + 1525433456 + ((~((-234947361) | r5)) * (-604)) + (((~(1375512796 | r5)) | 1089480792) * 302))};
                                                java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                java.lang.Object obj17 = obj16;
                                                if (obj16 == null) {
                                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionType(0L) + 2713, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                    byte b7 = $$a[14];
                                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                    a((byte) (b7 + 1), (byte) (-b7), b7, objArr20);
                                                    java.lang.reflect.Method method7 = cls7.getMethod((java.lang.String) objArr20[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method7);
                                                    obj17 = method7;
                                                }
                                                ((int[]) objArr18[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj17).invoke(null, objArr19)).intValue();
                                                return objArr18;
                                            } catch (java.lang.Throwable th9) {
                                                java.lang.Throwable cause5 = th9.getCause();
                                                if (cause5 != null) {
                                                    throw cause5;
                                                }
                                                throw th9;
                                            }
                                        }
                                        r1 = obj3;
                                    }
                                } else {
                                    i4 = i18;
                                    obj = "";
                                    r5 = r7;
                                    num = num3;
                                    r7 = -1347122530;
                                }
                                try {
                                    try {
                                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                                        b(false, "\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f\u0000", android.view.Gravity.getAbsoluteGravity(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 23, objArr21);
                                        java.lang.Class<?> cls8 = java.lang.Class.forName(((java.lang.String) objArr21[0]).intern());
                                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                                        b(false, "�\uffff\u0007�\u0003\u0001￩�\n�\u0003\u0001\u000e\u0003\u0001\u0010￬", 193 - android.graphics.Color.green(0), 13 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 17 - android.view.View.resolveSize(0, 0), objArr22);
                                        invoke = cls8.getMethod(((java.lang.String) objArr22[0]).intern(), null).invoke(r1, null);
                                    } catch (java.lang.Throwable unused5) {
                                    }
                                    try {
                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                        b(false, "\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f\u0000", android.graphics.Color.green(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, 2 - android.view.View.combineMeasuredStates(0, 0), 23 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr23);
                                        java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr23[0]).intern());
                                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                                        c("䐀\ueda9\ue2d8銊䑧أ㕲儗\uebdd癡攩\ue162ᬟꚫ헀놮䭙ᛯ", 1 - (android.os.Process.myPid() >> 22), objArr24);
                                        r1 = cls9.getMethod(((java.lang.String) objArr24[0]).intern(), null).invoke(r1, null);
                                        try {
                                            r4 = new java.lang.Object[]{r1, 64};
                                            r1 = obj;
                                        } catch (java.lang.Throwable th10) {
                                            th = th10;
                                        }
                                        try {
                                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                                            c("ﶅㆡꏝ\uee32\ufde4\uda20瑧ⶍ剖ꩣ␣鶕ꊞ窩铥촃\uf2d4쫬䒻㴝䌅鬓㔽泟鍈歙\ue53c\udc2a\ue38a㮓嗖౦㏏诓ָ羦耗", 1 - android.text.TextUtils.indexOf((java.lang.CharSequence) r1, (java.lang.CharSequence) r1, 0), objArr25);
                                            java.lang.Class<?> cls10 = java.lang.Class.forName(((java.lang.String) objArr25[0]).intern());
                                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                                            c("琵▋茉凂瑒츁咣鉟\udbe8빃Ӹ∪⬪溉됖狩筧\udec7", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr26);
                                            java.lang.Object invoke2 = cls10.getMethod(((java.lang.String) objArr26[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, r4);
                                            int i24 = i4;
                                            int i25 = 0;
                                            loop3: while (true) {
                                                if (i25 >= i24) {
                                                    break;
                                                }
                                                java.nio.LongBuffer longBuffer2 = longBufferArr3[i25];
                                                if (longBuffer2.capacity() == 4) {
                                                    valueOf = (getProfileVersion + 43) % 128;
                                                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                    c("싢ṣ匨鲉슱\uf5c4蒷彩浬藽풄", 1 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr27);
                                                    i5 = 0;
                                                    obj2 = objArr27[0];
                                                } else {
                                                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                    b(true, "\u0002\u000b\ufff3", 159 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2, 3 - android.graphics.Color.green(0), objArr28);
                                                    i5 = 0;
                                                    obj2 = objArr28[0];
                                                }
                                                java.lang.String intern = ((java.lang.String) obj2).intern();
                                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                b(false, "\u0013\u0004\r\u0013ￍ\u000f\fￍ\uffef\u0000\u0002\n\u0000\u0006\u0004￨\r\u0005\u000e\u0000\r\u0003\u0011\u000e\b\u0003ￍ\u0002\u000e\r", 191 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 19 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (-16777186) - android.graphics.Color.rgb(i5, i5, i5), objArr29);
                                                java.lang.Class<?> cls11 = java.lang.Class.forName(((java.lang.String) objArr29[0]).intern());
                                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                c("\u0af5톯凛尋આ㨩虢龨ꔨ䩰혴⿰嗨骻", 1 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr30);
                                                java.lang.Object[] objArr31 = (java.lang.Object[]) cls11.getField(((java.lang.String) objArr30[0]).intern()).get(invoke2);
                                                int length3 = objArr31.length;
                                                int i26 = 0;
                                                while (i26 < length3) {
                                                    int i27 = valueOf + 41;
                                                    getProfileVersion = i27 % 128;
                                                    if (i27 % 2 == 0) {
                                                        java.lang.Object obj18 = objArr31[i26];
                                                        throw null;
                                                    }
                                                    java.lang.Object obj19 = objArr31[i26];
                                                    try {
                                                        java.lang.Object obj20 = invoke2;
                                                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                        b(true, "\u0010\u0005\u000e\u0011\uffff\u0001\u000fￊ�\u0012�\u0006\u0010\u000f\u0001\u0003\u0005￠\u0001\u0003�\u000f\u000f\u0001￩ￊ\u0015", 192 - android.text.TextUtils.lastIndexOf(r1, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 12, 26 - android.text.TextUtils.lastIndexOf(r1, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr32);
                                                        java.lang.Class<?> cls12 = java.lang.Class.forName(((java.lang.String) objArr32[0]).intern());
                                                        int i28 = i24;
                                                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                        c("떅耿艜녔뗢段嗶狐ᩗᯧֲ슼\uea93쬻땯", -android.os.Process.getGidForName(r1), objArr33);
                                                        java.lang.String str = intern;
                                                        java.lang.Object invoke3 = cls12.getMethod(((java.lang.String) objArr33[0]).intern(), java.lang.String.class).invoke(null, intern);
                                                        try {
                                                            int i29 = length3;
                                                            java.lang.Object[] objArr34 = new java.lang.Object[1];
                                                            b(true, "\u0005\u000b\u000e\u0000\n�\u0001\u000e\u0011\u0010�\n\u0003\u0005\uffefￊ\t\fￊ\u0010\n\u0001\u0010\n\u000b\uffffￊ\u0000", 193 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 6 - android.text.TextUtils.indexOf((java.lang.CharSequence) r1, (java.lang.CharSequence) r1, 0), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 28, objArr34);
                                                            java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr34[0]).intern());
                                                            int i30 = i25;
                                                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                            b(true, "\u0012ￛ\b\r\u0012\ufffa\u000b\u000bￚ\ufffe\r", 196 - android.graphics.Color.alpha(0), 5 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 11 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr35);
                                                            java.lang.Object invoke4 = cls13.getMethod(((java.lang.String) objArr35[0]).intern(), null).invoke(obj19, null);
                                                            valueOf = (getProfileVersion + 87) % 128;
                                                            try {
                                                                java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                                b(true, "\u0010\u0005\u000e\u0011\uffff\u0001\u000fￊ�\u0012�\u0006\u0010\u000f\u0001\u0003\u0005￠\u0001\u0003�\u000f\u000f\u0001￩ￊ\u0015", 192 - android.os.Process.getGidForName(r1), 12 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 27 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr36);
                                                                java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr36[0]).intern());
                                                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                                                b(true, "\ufffa\n\t\ufffb�\uffff", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 199, android.view.View.MeasureSpec.getMode(0) + 1, 6 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr37);
                                                                if (java.nio.ByteBuffer.wrap((byte[]) cls14.getMethod(((java.lang.String) objArr37[0]).intern(), byte[].class).invoke(invoke3, invoke4)).asLongBuffer().equals(longBuffer2.rewind())) {
                                                                    break loop3;
                                                                }
                                                                i26++;
                                                                invoke2 = obj20;
                                                                intern = str;
                                                                length3 = i29;
                                                                i25 = i30;
                                                                i24 = i28;
                                                            } catch (java.lang.Throwable th11) {
                                                                java.lang.Throwable cause6 = th11.getCause();
                                                                if (cause6 != null) {
                                                                    throw cause6;
                                                                }
                                                                throw th11;
                                                            }
                                                        } catch (java.lang.Throwable th12) {
                                                            java.lang.Throwable cause7 = th12.getCause();
                                                            if (cause7 != null) {
                                                                throw cause7;
                                                            }
                                                            throw th12;
                                                        }
                                                    } catch (java.lang.Throwable th13) {
                                                        java.lang.Throwable cause8 = th13.getCause();
                                                        if (cause8 != null) {
                                                            throw cause8;
                                                        }
                                                        throw th13;
                                                    }
                                                }
                                                i25++;
                                            }
                                        } catch (java.lang.Throwable th14) {
                                            th = th14;
                                            java.lang.Throwable th15 = th;
                                            java.lang.Throwable cause9 = th15.getCause();
                                            if (cause9 != null) {
                                                throw cause9;
                                            }
                                            throw th15;
                                        }
                                    } catch (java.lang.Throwable th16) {
                                        java.lang.Throwable cause10 = th16.getCause();
                                        if (cause10 != null) {
                                            throw cause10;
                                        }
                                        throw th16;
                                    }
                                } catch (java.lang.Throwable th17) {
                                    java.lang.Throwable cause11 = th17.getCause();
                                    if (cause11 != null) {
                                        throw cause11;
                                    }
                                    throw th17;
                                }
                            }
                        } catch (java.lang.Throwable unused6) {
                            r1 = "";
                            r5 = i12;
                            r7 = -1347122530;
                        }
                        java.lang.Object[] objArr38 = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr38[0])[0] = r5;
                        ((int[]) objArr38[1])[0] = r5 ^ 2;
                        java.lang.Object[] objArr39 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((((~(1129940343 | r5)) | (-766551818)) * (-465)) - 940315943) + (((~((-766551818) | r5)) | 1129940343) * 930) + ((r5 | (-748691977)) * 465))};
                        java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r7);
                        java.lang.Object obj22 = obj21;
                        if (obj21 == null) {
                            java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 2714 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((-1) - android.os.Process.getGidForName(r1)));
                            byte b8 = $$a[14];
                            java.lang.Object[] objArr40 = new java.lang.Object[1];
                            a((byte) (b8 + 1), (byte) (-b8), b8, objArr40);
                            java.lang.reflect.Method method8 = cls15.getMethod((java.lang.String) objArr40[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r7, method8);
                            obj22 = method8;
                        }
                        ((int[]) objArr38[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr39)).intValue();
                        return objArr38;
                    }
                    java.lang.String lowerCase = strArr2[i17].toLowerCase();
                    java.lang.Object[] objArr41 = new java.lang.Object[i13];
                    b(true, "\u0000", android.widget.ExpandableListView.getPackedPositionChild(j) + 152, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, android.view.View.MeasureSpec.getMode(i12) + 1, objArr41);
                    java.lang.String replaceAll = lowerCase.replaceAll(((java.lang.String) objArr41[i12]).intern(), "");
                    java.lang.Integer num4 = num2;
                    long longValue2 = new java.math.BigInteger(replaceAll.substring(16, 32), 16).longValue();
                    long longValue3 = new java.math.BigInteger(replaceAll.substring(i12, 16), 16).longValue();
                    int length4 = replaceAll.length();
                    if (length4 == 32) {
                        i8 = length;
                        longBufferArr2[i17] = java.nio.LongBuffer.allocate(2).put(longValue3).put(longValue2);
                    } else {
                        if (length4 != 64) {
                            java.lang.Object[] objArr42 = {new int[1], new int[1], new int[1]};
                            ((int[]) objArr42[0])[0] = i9;
                            ((int[]) objArr42[1])[0] = i9 ^ 3;
                            int i31 = ~(228352428 | i9);
                            java.lang.Object[] objArr43 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-228352429) | i9)) | 17580164 | (~((-1668139733) | i9))) * (-880)) + 67314816 + (((~((~i9) | (-228352429))) | 1668139732 | i31) * (-880)) + (i31 * 880))};
                            java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            java.lang.Object obj24 = obj23;
                            if (obj23 == null) {
                                java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.graphics.Color.green(0) + 2713, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                byte b9 = $$a[14];
                                java.lang.Object[] objArr44 = new java.lang.Object[1];
                                a((byte) (b9 + 1), (byte) (-b9), b9, objArr44);
                                java.lang.reflect.Method method9 = cls16.getMethod((java.lang.String) objArr44[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method9);
                                obj24 = method9;
                            }
                            ((int[]) objArr42[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr43)).intValue();
                            return objArr42;
                        }
                        i8 = length;
                        longBufferArr2[i17] = java.nio.LongBuffer.allocate(4).put(longValue3).put(longValue2).put(new java.math.BigInteger(replaceAll.substring(32, 48), 16).longValue()).put(new java.math.BigInteger(replaceAll.substring(48), 16).longValue());
                    }
                    i17++;
                    strArr2 = strArr;
                    i9 = i;
                    num2 = num4;
                    length = i8;
                    i12 = 0;
                    j = 0;
                    i13 = 1;
                }
            } catch (java.lang.Throwable th18) {
                java.lang.Throwable cause12 = th18.getCause();
                if (cause12 != null) {
                    throw cause12;
                }
                throw th18;
            }
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $11 + 9;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        $10 = ($11 + 105) % 128;
        while (getdsrpdata.valueOf < charArray.length) {
            int i3 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.view.View.resolveSize(0, 0), 1890 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (3600 - (android.os.Process.myTid() >> 22)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, (byte) 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (valueOf ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.graphics.Color.argb(0, 0, 0, 0), 1442 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (29682 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((byte) 0, (byte) 0, (short) 1, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
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
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 65, 1443 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 29682));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((byte) 0, (byte) 0, (short) 1, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private setHeight(byte[] bArr) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        boolean z = true;
        java.math.BigInteger bigInteger = null;
        long j = 0;
        for (int i = 0; i != bArr.length; i++) {
            byte b = bArr[i];
            if (j <= 72057594037927808L) {
                long j2 = j + (b & Byte.MAX_VALUE);
                if ((b & 128) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            stringBuffer.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    stringBuffer.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                java.math.BigInteger or = (bigInteger == null ? java.math.BigInteger.valueOf(j) : bigInteger).or(java.math.BigInteger.valueOf(b & Byte.MAX_VALUE));
                if ((b & 128) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        or = or.subtract(java.math.BigInteger.valueOf(80L));
                        z = false;
                    }
                    stringBuffer.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    stringBuffer.append(or);
                    bigInteger = null;
                    j = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.DigitizedCardProfile = stringBuffer.toString();
        this.writeReplace = com.payair.hce.getClientVersion.values(bArr);
    }

    private java.lang.String values() {
        int i = IccPrivateKeyCrtComponentsJson;
        values = (i + 121) % 128;
        java.lang.String str = this.DigitizedCardProfile;
        int i2 = i + 71;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void valueOf(java.io.ByteArrayOutputStream byteArrayOutputStream, long j) {
        IccPrivateKeyCrtComponentsJson = (values + 59) % 128;
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
            IccPrivateKeyCrtComponentsJson = (values + 29) % 128;
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    private static void writeReplace(java.io.ByteArrayOutputStream byteArrayOutputStream, java.math.BigInteger bigInteger) {
        values = (IccPrivateKeyCrtComponentsJson + 103) % 128;
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength != 0) {
            byte[] bArr = new byte[bitLength];
            int i = bitLength - 1;
            int i2 = i;
            while (i2 >= 0) {
                int i3 = values + 23;
                IccPrivateKeyCrtComponentsJson = i3 % 128;
                if (i3 % 2 == 0) {
                    bArr[i2] = (byte) ((bigInteger.intValue() & 53) | 15872);
                    bigInteger = bigInteger.shiftRight(48);
                    i2 += 30;
                } else {
                    bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
                    bigInteger = bigInteger.shiftRight(7);
                    i2--;
                }
            }
            bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
            byteArrayOutputStream.write(bArr, 0, bitLength);
            int i4 = values + 55;
            IccPrivateKeyCrtComponentsJson = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i5 = IccPrivateKeyCrtComponentsJson + 93;
        values = i5 % 128;
        if (i5 % 2 != 0) {
            byteArrayOutputStream.write(0);
        } else {
            byteArrayOutputStream.write(0);
        }
    }

    private byte[] RecordsJson() {
        byte[] bArr;
        synchronized (this) {
            int i = IccPrivateKeyCrtComponentsJson + 43;
            values = i % 128;
            if (i % 2 == 0) {
                if (this.writeReplace == null) {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    writeReplace(new java.lang.Object[]{this, byteArrayOutputStream}, 625856186, -625856185, java.lang.System.identityHashCode(this));
                    this.writeReplace = byteArrayOutputStream.toByteArray();
                }
                bArr = this.writeReplace;
                int i2 = IccPrivateKeyCrtComponentsJson + 49;
                values = i2 % 128;
                if (i2 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
            } else {
                throw new java.lang.ArithmeticException();
            }
        }
        return bArr;
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        int i = (IccPrivateKeyCrtComponentsJson + 23) % 128;
        values = i;
        int i2 = i + 81;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return false;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int intValue;
        com.payair.hce.setHeight setheight = (com.payair.hce.setHeight) objArr[0];
        int i = values + 95;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            intValue = setheight.RecordsJson().length;
        } else {
            int length = setheight.RecordsJson().length;
            intValue = length + ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length)}, -1174070258, 1174070259, length)).intValue() + 1;
        }
        int i2 = IccPrivateKeyCrtComponentsJson + 73;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return java.lang.Integer.valueOf(intValue);
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        values = (IccPrivateKeyCrtComponentsJson + 105) % 128;
        byte[] RecordsJson = RecordsJson();
        setmaxlines.DigitizedCardProfile(6);
        setmaxlines.AlternateContactlessPaymentDataJson(RecordsJson.length);
        setmaxlines.valueOf(RecordsJson);
        int i = IccPrivateKeyCrtComponentsJson + 81;
        values = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.payair.hce.setGravity
    public final int hashCode() {
        values = (IccPrivateKeyCrtComponentsJson + 53) % 128;
        int hashCode = this.DigitizedCardProfile.hashCode();
        values = (IccPrivateKeyCrtComponentsJson + 41) % 128;
        return hashCode;
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        int i = values;
        IccPrivateKeyCrtComponentsJson = (i + 39) % 128;
        if (setems == this) {
            return true;
        }
        if (setems instanceof com.payair.hce.setHeight) {
            return this.DigitizedCardProfile.equals(((com.payair.hce.setHeight) setems).DigitizedCardProfile);
        }
        IccPrivateKeyCrtComponentsJson = (i + 45) % 128;
        return false;
    }

    public final java.lang.String toString() {
        values = (IccPrivateKeyCrtComponentsJson + 109) % 128;
        java.lang.String values2 = values();
        values = (IccPrivateKeyCrtComponentsJson + 71) % 128;
        return values2;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        valueOf();
        AlternateContactlessPaymentDataJson = new java.util.concurrent.ConcurrentHashMap();
        values = (IccPrivateKeyCrtComponentsJson + 99) % 128;
    }

    static com.payair.hce.setHeight values(byte[] bArr) {
        com.payair.hce.setHeight setheight = AlternateContactlessPaymentDataJson.get(new com.payair.hce.setHeight.valueOf(bArr));
        if (setheight == null) {
            return new com.payair.hce.setHeight(bArr);
        }
        int i = IccPrivateKeyCrtComponentsJson + 47;
        values = i % 128;
        if (i % 2 == 0) {
            return setheight;
        }
        throw null;
    }

    static void valueOf() {
        valueOf = -5593606569086516792L;
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() throws java.io.IOException {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, 1995625493, -1995625493, java.lang.System.identityHashCode(this))).intValue();
    }

    private void DigitizedCardProfile(java.io.ByteArrayOutputStream byteArrayOutputStream) {
        writeReplace(new java.lang.Object[]{this, byteArrayOutputStream}, 625856186, -625856185, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{114, 106, 82, com.google.common.base.Ascii.SYN};
        $$b = 174;
    }
}
