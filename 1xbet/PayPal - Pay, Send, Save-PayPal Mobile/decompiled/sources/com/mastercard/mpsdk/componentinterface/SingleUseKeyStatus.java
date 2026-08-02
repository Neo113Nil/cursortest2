package com.mastercard.mpsdk.componentinterface;

/* loaded from: classes4.dex */
public interface SingleUseKeyStatus {
    int getAtc();

    java.lang.String getStatus();

    java.lang.String getTimestamp();

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'values' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class writeReplace {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        public static final com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace AlternateContactlessPaymentDataJson;
        public static final com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace DigitizedCardProfile;
        private static char IccPrivateKeyCrtComponentsJson;
        private static final /* synthetic */ com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace[] SdkCoreAlternateContactlessPaymentDataImpl;
        private static int getAid;
        private static int getCiacDecline;
        private static int getCvrMaskAnd;
        private static long getProfileVersion;
        public static final com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace valueOf;
        public static final com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace values;
        public static final com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace writeReplace;
        private final int RecordsJson;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(short s, byte b, byte b2, java.lang.Object[] objArr) {
            int i;
            int i2;
            int i3 = (b2 * 3) + 4;
            int i4 = b + 102;
            byte[] bArr = $$a;
            int i5 = (s * 3) + 1;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i6 = i5;
                i2 = 0;
                i4 += -i6;
                i3++;
                i = i2;
                i2 = i + 1;
                bArr2[i] = (byte) i4;
                if (i2 == i5) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i6 = bArr[i3];
                i4 += -i6;
                i3++;
                i = i2;
                i2 = i + 1;
                bArr2[i] = (byte) i4;
                if (i2 == i5) {
                }
            } else {
                i = 0;
                i2 = i + 1;
                bArr2[i] = (byte) i4;
                if (i2 == i5) {
                }
            }
        }

        public static com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace valueOf(java.lang.String str) {
            int i = getCvrMaskAnd + 17;
            getCiacDecline = i % 128;
            com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace writereplace = (com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace) java.lang.Enum.valueOf(com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.class, str);
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            getCvrMaskAnd = (getCiacDecline + 9) % 128;
            return writereplace;
        }

        public static com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace[] values() {
            int i = getCvrMaskAnd + 39;
            getCiacDecline = i % 128;
            com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace[] writereplaceArr = SdkCoreAlternateContactlessPaymentDataImpl;
            if (i % 2 != 0) {
                return (com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace[]) writereplaceArr.clone();
            }
            throw null;
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getCvrMaskAnd = 0;
            getCiacDecline = 1;
            valueOf();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a((char) (20388 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "尦ꕿ漯뇶", "飚擯쀫숥뼩筮⏘ݰ鹀Ὴ⬔漜쾏铣\uf11c䈞", "ǌ䩥ꌠ㙏", android.widget.ExpandableListView.getPackedPositionType(0L), objArr);
            com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace writereplace = new com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace(((java.lang.String) objArr[0]).intern(), 0, 0);
            values = writereplace;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a((char) android.graphics.Color.green(0), "尦ꕿ漯뇶", "➜\ue307\ude03ꇔ㴵呖\u0cdbⲦ둎쩽漁鴑滠\udf2f㶁ทꉻ矵躇찑", "Ӫ\ue965챈솙", android.graphics.Color.rgb(0, 0, 0) + 16777216, objArr2);
            com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace writereplace2 = new com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace(((java.lang.String) objArr2[0]).intern(), 1, 1);
            AlternateContactlessPaymentDataJson = writereplace2;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a((char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 15834), "尦ꕿ漯뇶", "羆쯎핱\ue35f쨇첽账皀胘๑ꙮ捇\uecf3", "语晰\udadd촽", (android.os.Process.myPid() >> 22) - 580489077, objArr3);
            com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace writereplace3 = new com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace(((java.lang.String) objArr3[0]).intern(), 2, 2);
            writeReplace = writereplace3;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 63452), "尦ꕿ漯뇶", "̮ſ\uf6ee䨖뉘\uee7dة飱䙩尔\u09a9翏ሏ", "䭇෨\udcd6\u1af7", android.widget.ExpandableListView.getPackedPositionType(0L) - 703731637, objArr4);
            com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace writereplace4 = new com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace(((java.lang.String) objArr4[0]).intern(), 3, 3);
            valueOf = writereplace4;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "尦ꕿ漯뇶", "妼\uf849ፆ⊐뮜桷颋", "\ude6d㴘䤌\ue8fc", 205330654 + (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr5);
            com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace writereplace5 = new com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace(((java.lang.String) objArr5[0]).intern(), 4, 4);
            DigitizedCardProfile = writereplace5;
            SdkCoreAlternateContactlessPaymentDataImpl = new com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace[]{writereplace, writereplace2, writereplace3, writereplace4, writereplace5};
            int i = getCiacDecline + 69;
            getCvrMaskAnd = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private writeReplace(java.lang.String str, int i, int i2) {
            this.RecordsJson = i2;
        }

        public final int DigitizedCardProfile() {
            int i = getCvrMaskAnd;
            getCiacDecline = (i + 61) % 128;
            int i2 = this.RecordsJson;
            int i3 = i + 85;
            getCiacDecline = i3 % 128;
            if (i3 % 2 != 0) {
                return i2;
            }
            throw null;
        }

        public static com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace valueOf(int i) {
            int i2 = (getCiacDecline + 13) % 128;
            getCvrMaskAnd = i2;
            if (i == 0) {
                return values;
            }
            if (i == 1) {
                return AlternateContactlessPaymentDataJson;
            }
            if (i == 2) {
                return writeReplace;
            }
            if (i == 3) {
                return valueOf;
            }
            com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace writereplace = DigitizedCardProfile;
            getCiacDecline = (i2 + 13) % 128;
            return writereplace;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static void a(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object[] objArr) {
            char[] cArr;
            char c2;
            int i2 = $11;
            $10 = (i2 + 69) % 128;
            java.lang.Object obj = null;
            char c3 = 2;
            if (str3 != null) {
                int i3 = i2 + 113;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                cArr = str3.toCharArray();
            } else {
                cArr = str3;
            }
            char[] cArr2 = cArr;
            char[] charArray = str2 != 0 ? str2.toCharArray() : str2;
            char[] charArray2 = str != null ? str.toCharArray() : str;
            com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int length2 = charArray2.length;
            char[] cArr4 = new char[length2];
            java.lang.System.arraycopy(cArr2, 0, cArr3, 0, length);
            java.lang.System.arraycopy(charArray2, 0, cArr4, 0, length2);
            cArr3[0] = (char) (cArr3[0] ^ c);
            cArr4[2] = (char) (cArr4[2] + ((char) i));
            int length3 = charArray.length;
            char[] cArr5 = new char[length3];
            getwalletdata.writeReplace = 0;
            while (getwalletdata.writeReplace < length3) {
                try {
                    java.lang.Object[] objArr2 = {getwalletdata};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.os.Process.myTid() >> 22) + 1179, (char) android.graphics.Color.argb(0, 0, 0, 0));
                        byte b = $$a[c3];
                        byte b2 = b;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b, b2, b2, objArr3);
                        obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                    java.lang.Object[] objArr4 = {getwalletdata};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 31, android.view.KeyEvent.normalizeMetaState(0) + 3443, (char) (3831 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))))).getMethod("g", java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr3[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                    if (obj4 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1864, (char) (41775 - (android.view.ViewConfiguration.getTapTimeout() >> 16)));
                        byte b3 = $$a[2];
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        b(b3, (byte) (b3 + 3), b3, objArr6);
                        obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                    java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                    if (obj5 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 28, android.text.TextUtils.indexOf("", "") + 3133, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                        byte[] bArr = $$a;
                        byte b4 = bArr[2];
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        b(b4, (byte) bArr.length, b4, objArr8);
                        c2 = 2;
                        obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                    } else {
                        c2 = 2;
                    }
                    cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                    cArr3[intValue2] = getwalletdata.values;
                    cArr5[getwalletdata.writeReplace] = (char) ((((int) (getAid ^ 1263759066225628708L)) ^ ((cArr3[intValue2] ^ charArray[getwalletdata.writeReplace]) ^ (getProfileVersion ^ 1263759066225628708L))) ^ ((char) (IccPrivateKeyCrtComponentsJson ^ 1263759066225628708L)));
                    getwalletdata.writeReplace++;
                    cArr3 = cArr3;
                    c3 = c2;
                    obj = null;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new java.lang.String(cArr5);
        }

        static void init$0() {
            $$a = new byte[]{com.google.common.base.Ascii.SYN, -105, 0, 34};
            $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
        }

        static void valueOf() {
            getProfileVersion = -6881595873278457342L;
            getAid = -804334044;
            IccPrivateKeyCrtComponentsJson = (char) 54820;
        }
    }
}
