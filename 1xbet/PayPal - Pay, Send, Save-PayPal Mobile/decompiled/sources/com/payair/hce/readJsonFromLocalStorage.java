package com.payair.hce;

/* loaded from: classes4.dex */
public class readJsonFromLocalStorage extends com.payair.hce.getReasonCode<com.payair.hce.transactionCanBeResumed> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static short[] RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static byte[] getProfileVersion;
    private static int valueOf;
    private static long values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 35 - (s * 2);
        int i4 = (b * 34) + 4;
        int i5 = s2 + 65;
        byte[] bArr = $$a;
        char[] cArr = new char[i3];
        if (bArr == null) {
            i5 = i3;
            int i6 = i4;
            i2 = 0;
            i5 = (i5 + i4) - 2;
            i4 = i6 + 1;
            i = i2;
            i2 = i + 1;
            cArr[i] = (char) i5;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i6 = i4;
            i4 = bArr[i4];
            i5 = (i5 + i4) - 2;
            i4 = i6 + 1;
            i = i2;
            i2 = i + 1;
            cArr[i] = (char) i5;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            cArr[i] = (char) i5;
            if (i2 == i3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = s2 + 104;
        byte[] bArr = $$d;
        int i4 = 1 - (s3 * 3);
        int i5 = s + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i3 = (-i3) + i6;
            i = i2;
            i2 = i + 1;
            i5++;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i3;
            i3 = bArr[i5];
            i3 = (-i3) + i6;
            i = i2;
            i2 = i + 1;
            i5++;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            i5++;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    /* synthetic */ readJsonFromLocalStorage(byte b) {
        this();
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        java.lang.Object obj;
        int i = getAid + 33;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
        if (i % 2 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\uea5e䠎금ಮ", (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)) * 41520, objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("\uea5e䠎금ಮ", (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)) + 41520, objArr2);
            obj = objArr2[0];
        }
        return com.payair.hce.transactionCanBeResumed.values(((java.lang.String) obj).intern());
    }

    private readJsonFromLocalStorage() {
    }

    /* renamed from: com.payair.hce.readJsonFromLocalStorage$2, reason: invalid class name */
    public static final class AnonymousClass2 implements com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char[] AlternateContactlessPaymentDataJson;
        private static int valueOf;
        private static int values;
        private static int writeReplace;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, short s, int i2, java.lang.Object[] objArr) {
            int i3;
            int i4;
            int i5;
            byte[] bArr = $$a;
            int i6 = (s * 34) + 4;
            int i7 = 35 - (i2 * 2);
            char[] cArr = new char[i7];
            if (bArr == null) {
                i4 = i6;
                int i8 = i7;
                i5 = 0;
                i6 = (i6 + i8) - 2;
                i4++;
                i3 = i5;
                i5 = i3 + 1;
                cArr[i3] = (char) i6;
                if (i5 == i7) {
                    objArr[0] = new java.lang.String(cArr);
                    return;
                }
                i8 = bArr[i4];
                i6 = (i6 + i8) - 2;
                i4++;
                i3 = i5;
                i5 = i3 + 1;
                cArr[i3] = (char) i6;
                if (i5 == i7) {
                }
            } else {
                i3 = 0;
                i6 = 718 - i;
                i4 = i6;
                i5 = i3 + 1;
                cArr[i3] = (char) i6;
                if (i5 == i7) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void d(byte b, int i, byte b2, java.lang.Object[] objArr) {
            int i2;
            int i3 = (i * 4) + 4;
            int i4 = (b2 * 2) + 107;
            byte[] bArr = $$d;
            int i5 = 1 - (b * 4);
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i6 = i5;
                i2 = 0;
                i4 += i6;
                i3++;
                bArr2[i2] = (byte) i4;
                i2++;
                if (i2 == i5) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i6 = bArr[i3];
                i4 += i6;
                i3++;
                bArr2[i2] = (byte) i4;
                i2++;
                if (i2 == i5) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i4;
                i2++;
                if (i2 == i5) {
                }
            }
        }

        AnonymousClass2() {
        }

        @Override // com.payair.hce.setMobilePin
        public final com.payair.hce.getReasonCode<com.payair.hce.transactionCanBeResumed> valueOf() {
            com.payair.hce.readJsonFromLocalStorage readjsonfromlocalstorage = new com.payair.hce.readJsonFromLocalStorage((byte) 0);
            int i = valueOf + 93;
            writeReplace = i % 128;
            if (i % 2 == 0) {
                return readjsonfromlocalstorage;
            }
            throw new java.lang.ArithmeticException();
        }

        private static void c(java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object[] objArr) {
            char[] cArr;
            if (str != null) {
                int i4 = $11 + 77;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                cArr = str.toCharArray();
            } else {
                cArr = str;
            }
            char[] cArr2 = cArr;
            com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
            char[] cArr3 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            $11 = ($10 + 61) % 128;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
                cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
                int i5 = digitizedCardJson11.DigitizedCardProfile;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i5]), java.lang.Integer.valueOf(values)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.View.resolveSize(0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 2073, (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 60037));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((byte) 0, 0, (byte) $$d.length, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                    }
                    cArr3[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 53, 3591 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.View.MeasureSpec.getMode(0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
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
            if (i2 > 0) {
                digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
                char[] cArr4 = new char[i3];
                java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i3);
                java.lang.System.arraycopy(cArr4, 0, cArr3, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
                java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
            }
            if (z) {
                char[] cArr5 = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 0;
                while (digitizedCardJson11.DigitizedCardProfile < i3) {
                    $10 = ($11 + 117) % 128;
                    cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                    java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 3543 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                }
                cArr3 = cArr5;
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        private static void b(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
            java.lang.String str2 = str;
            int i = $11;
            $10 = (i + 3) % 128;
            byte[] bArr = str2;
            if (str2 != null) {
                int i2 = i + 15;
                $10 = i2 % 128;
                if (i2 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                bArr = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
            int i3 = iArr[0];
            int i4 = 1;
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr = AlternateContactlessPaymentDataJson;
            long j = 0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i4];
                        objArr2[0] = java.lang.Integer.valueOf(cArr[i8]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 29, 2806 - android.widget.ExpandableListView.getPackedPositionChild(j), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            d((byte) 0, 0, (byte) 1, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                        }
                        cArr2[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        i8++;
                        i4 = 1;
                        j = 0;
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
            char[] cArr3 = new char[i5];
            java.lang.System.arraycopy(cArr, i3, cArr3, 0, i5);
            if (bArr2 != null) {
                char[] cArr4 = new char[i5];
                getaccounttype.writeReplace = 0;
                char c = 0;
                while (getaccounttype.writeReplace < i5) {
                    if (bArr2[getaccounttype.writeReplace] == 1) {
                        int i9 = getaccounttype.writeReplace;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.view.Gravity.getAbsoluteGravity(0, 0), android.text.TextUtils.getOffsetBefore("", 0) + 2836, (char) android.view.View.MeasureSpec.getMode(0));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            d((byte) 0, 0, (byte) 0, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                        }
                        cArr4[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    } else {
                        int i10 = getaccounttype.writeReplace;
                        java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                        if (obj3 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43, android.graphics.ImageFormat.getBitsPerPixel(0) + 2881, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            d((byte) 0, 0, (byte) 2, objArr7);
                            obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                        }
                        cArr4[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                        $10 = ($11 + 23) % 128;
                    }
                    c = cArr4[getaccounttype.writeReplace];
                    java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                }
                cArr3 = cArr4;
            }
            if (i7 > 0) {
                char[] cArr5 = new char[i5];
                java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i5);
                int i11 = i5 - i7;
                java.lang.System.arraycopy(cArr5, 0, cArr3, i11, i7);
                java.lang.System.arraycopy(cArr5, i7, cArr3, 0, i11);
            }
            if (z) {
                $11 = ($10 + 57) % 128;
                char[] cArr6 = new char[i5];
                getaccounttype.writeReplace = 0;
                while (getaccounttype.writeReplace < i5) {
                    $11 = ($10 + 89) % 128;
                    cArr6[getaccounttype.writeReplace] = cArr3[(i5 - getaccounttype.writeReplace) - 1];
                    getaccounttype.writeReplace++;
                }
                cArr3 = cArr6;
            }
            if (i6 > 0) {
                getaccounttype.writeReplace = 0;
                while (getaccounttype.writeReplace < i5) {
                    cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                    getaccounttype.writeReplace++;
                }
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            writeReplace = 0;
            valueOf = 1;
            AlternateContactlessPaymentDataJson = new char[]{16713, 16585, 16585, 16587, 16582, 16583, 16585, 16587, 16590, 16681, 16676, 16887, 16829, 16802, 16807, 16771, 16771, 16809, 16809, 16831, 16803, 16813, 16812, 16805, 16826, 16829, 16805, 16805, 16828, 16830, 16768, 16769, 16831, 16830, 16807, 16802, 16802, 16805, 16799, 16798, 16824, 16887, 16830, 16768, 16775, 16810, 16813, 16805, 16800, 16809, 16810, 16815, 16809, 16806, 16824, 16888, 16806, 16808, 16807, 16804, 16809, 16718, 16689, 16591, 16591, 16690, 16777, 16710, 16711, 16708, 16804, 16802, 16888, 16803, 16805, 16803, 16804, 16810, 16811, 16775, 16798, 16804, 16891, 16802, 16809, 16807, 16804, 16807, 16830, 16831, 16886, 16831, 16830, 16804, 16810, 16807, 16803, 16802, 16806, 16810, 16805, 16802, 16884, 16829, 16805, 16807, 16800, 16828, 16831, 16888, 16809, 16806, 16831, 16803, 16805, 16829, 16802, 16700, 16604, 16602, 16606, 16602, 16598, 16887, 16829, 16805, 16658, 16662, 16664, 16662, 16668, 16670, 16665, 16687, 16787, 16650, 16646, 16743, 16737, 16643, 16653, 16754, 16752, 16650, 16785, 16757, 16754, 16756, 16763, 16765, 16741, 16736, 16763, 16762, 16762, 16885, 16830, 16805, 16807, 16815, 16806, 16805, 16808, 16813, 16810, 16805, 16804, 16804, 16828, 16831, 16857, 16772, 16802, 16799, 16799, 16802, 16806, 16804, 16805, 16831, 16824, 16797, 16772, 16807, 16804, 16804, 16830, 16804, 16810, 16772, 16799, 16824, 16824, 16773, 16760, 16662, 16665, 16670, 16766, 16758, 16669, 16641, 16670, 16767, 16758, 16660, 16671, 16671, 16661, 16661, 16890, 16811, 16774, 16768, 16807, 16802, 16829, 16824, 16824, 16799, 16768, 16857, 16796, 16803, 16807, 16807, 16807, 16830, 16798, 16774, 16811, 16805, 16788, 16753, 16752, 16758, 16753, 16754, 16761, 16756, 16752, 16753, 16756, 16890, 16805, 16805, 16800, 16799, 16798, 16826, 16802, 16774, 16798, 16826, 16804, 16815, 16812, 16813, 16807, 16800, 16800, 16891, 16711, 16744, 16750, 16742, 16704, 16710, 16751, 16723, 16746, 16742, 16710, 16717, 16747, 16747, 16723, 16714, 16637, 16608, 16617, 16630, 16698, 16698, 16857, 16768, 16805, 16811, 16803, 16797, 16775, 16805, 16799, 16768, 16807, 16802, 16829, 16824, 16824, 16799, 16889, 16768, 16865, 16796, 16826, 16828, 16798, 16774, 16811, 16857, 16768, 16805, 16811, 16774, 16796, 16826, 16799, 16741, 16764, 16738, 16740, 16802, 16749, 16743, 16748, 16766, 16802, 16750, 16738, 16737, 16739, 16802, 16766, 16767, 16867, 16779, 16864, 16893, 16773, 16778, 16813, 16729, 16749, 16744, 16746, 16813};
            values = 1889207156;
        }

        static void init$1() {
            $$d = new byte[]{74, 86, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -59};
            $$e = 71;
        }

        /* JADX WARN: Code restructure failed: missing block: B:106:0x12c9, code lost:
        
            if (((((int) (r8 >> 32)) & (((((((~((-1477191244) | r12)) | 39964832) | (~((-107205045) | r5))) * (-68)) + 2079358714) + ((~((-67240213) | r12)) * (-68))) + (((~(107205044 | r12)) | (-1544431456)) * 68))) | (((int) r8) & (((((~(314637398 | r12)) | (-1391066456)) * (-241)) - 1955347783) + (((~((-1076429058) | r12)) | 268477444) * 241)))) == 477111747) goto L134;
         */
        /* JADX WARN: Code restructure failed: missing block: B:541:0x0a0f, code lost:
        
            if (r4.equals(((java.lang.String) r6[0]).intern()) != false) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0717, code lost:
        
            if (((((int) (r13 >> 32)) & ((((((~(659590453 | r64)) | 1487561408) * 336) + 501358106) + (((~(2096816864 | r64)) | 50334997) * (-168))) + (((~(2096816864 | r9)) | 659590453) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))) | (((int) r13) & ((((((~(71160223 | r9)) | (-1508386634)) * (-1042)) + 252581924) + ((71160223 | r64) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)) + ((((~(1508386633 | r64)) | 68538518) | (~((-1505764929) | r9))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)))) != (-1032769152)) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0840, code lost:
        
            if (((((int) r2) & ((((((~((-378071049) | r9)) | (-1815297459)) * (-235)) - 1276157173) + (((~((-378071049) | r64)) | (-1815297459)) * (-470))) + (((~((-67119105) | r64)) | (-2126249403)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))) | (((int) (r2 >> 32)) & ((((((~(1332776825 | r9)) | (~(1524964059 | r64))) * 1900) + 1871737038) + (((~((-1524964060) | r9)) | (~((-1332776826) | r64))) * (-950))) + (((~((-1524964060) | r64)) | (~((-1332776826) | r9))) * 950)))) == 542074309) goto L69;
         */
        /* JADX WARN: Removed duplicated region for block: B:110:0x1519 A[Catch: all -> 0x3fd4, TryCatch #1 {all -> 0x3fd4, blocks: (B:3:0x0004, B:5:0x001a, B:6:0x0056, B:10:0x012e, B:12:0x0168, B:13:0x01b4, B:18:0x01e0, B:21:0x01f8, B:22:0x0246, B:32:0x02f4, B:34:0x0307, B:35:0x0353, B:37:0x0375, B:39:0x0388, B:40:0x03d7, B:42:0x03e0, B:44:0x03fe, B:45:0x0455, B:49:0x04f8, B:51:0x0516, B:52:0x0568, B:56:0x0611, B:58:0x062f, B:59:0x0681, B:62:0x071b, B:64:0x0739, B:65:0x0792, B:71:0x0ec6, B:73:0x0ed9, B:74:0x0f25, B:84:0x0fd3, B:86:0x0fe6, B:87:0x1032, B:89:0x1054, B:91:0x1067, B:92:0x10af, B:94:0x10b8, B:96:0x10d6, B:97:0x1129, B:101:0x11d3, B:103:0x11f1, B:104:0x1241, B:108:0x1506, B:110:0x1519, B:111:0x1568, B:113:0x1621, B:115:0x1634, B:116:0x167f, B:124:0x174a, B:126:0x178a, B:127:0x17db, B:131:0x180c, B:133:0x181f, B:134:0x186a, B:136:0x1920, B:138:0x1933, B:139:0x197f, B:147:0x1a37, B:149:0x1a8f, B:150:0x1ae4, B:157:0x1c17, B:159:0x1c2a, B:160:0x1c78, B:168:0x1d46, B:170:0x1d93, B:171:0x1de5, B:198:0x2062, B:200:0x20a4, B:201:0x20f5, B:205:0x2138, B:207:0x214b, B:208:0x219a, B:221:0x23d1, B:223:0x23e4, B:224:0x2434, B:232:0x24c5, B:234:0x2519, B:235:0x256e, B:239:0x25a8, B:241:0x25d1, B:242:0x2630, B:249:0x26ea, B:251:0x2746, B:252:0x279d, B:256:0x27e8, B:258:0x2811, B:259:0x286f, B:263:0x2941, B:265:0x2982, B:266:0x29d0, B:269:0x29e6, B:271:0x29f5, B:272:0x2a42, B:276:0x2b1c, B:278:0x2b7e, B:279:0x2bcf, B:283:0x2be6, B:285:0x2bff, B:286:0x2c4a, B:290:0x2cff, B:292:0x2d5b, B:293:0x2daf, B:296:0x2dc5, B:298:0x2dd4, B:299:0x2e1b, B:303:0x2ebe, B:305:0x2f0c, B:306:0x2f61, B:309:0x2f77, B:311:0x2f86, B:312:0x2fd1, B:316:0x3073, B:318:0x30c7, B:319:0x311d, B:322:0x3133, B:324:0x3142, B:325:0x3188, B:329:0x3244, B:331:0x328b, B:332:0x32de, B:336:0x331a, B:338:0x3344, B:339:0x339f, B:343:0x345a, B:345:0x349c, B:346:0x34ef, B:350:0x3531, B:352:0x3544, B:353:0x3595, B:357:0x3649, B:359:0x368d, B:360:0x36de, B:363:0x36f4, B:365:0x3703, B:366:0x3751, B:370:0x3802, B:372:0x3846, B:373:0x3897, B:376:0x38ad, B:378:0x38bc, B:379:0x3901, B:383:0x39a1, B:385:0x39f0, B:386:0x3a41, B:389:0x3a57, B:391:0x3a66, B:392:0x3ab7, B:396:0x3b3f, B:398:0x3b89, B:399:0x3bd7, B:402:0x3bed, B:404:0x3bfc, B:405:0x3c41, B:411:0x3cf4, B:413:0x3d3b, B:414:0x3d8d, B:416:0x3da2, B:418:0x3db5, B:419:0x3e01, B:421:0x3e09, B:423:0x3e39, B:424:0x3e95, B:429:0x3f16, B:431:0x3f66, B:432:0x3fb4, B:494:0x130c, B:496:0x131f, B:497:0x136f, B:509:0x1425, B:511:0x146b, B:512:0x14c0, B:521:0x0872, B:523:0x0885, B:524:0x08d8, B:529:0x0a29, B:531:0x0a69, B:532:0x0abe, B:536:0x0989, B:538:0x099c, B:539:0x09eb), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:115:0x1634 A[Catch: all -> 0x3fd4, TryCatch #1 {all -> 0x3fd4, blocks: (B:3:0x0004, B:5:0x001a, B:6:0x0056, B:10:0x012e, B:12:0x0168, B:13:0x01b4, B:18:0x01e0, B:21:0x01f8, B:22:0x0246, B:32:0x02f4, B:34:0x0307, B:35:0x0353, B:37:0x0375, B:39:0x0388, B:40:0x03d7, B:42:0x03e0, B:44:0x03fe, B:45:0x0455, B:49:0x04f8, B:51:0x0516, B:52:0x0568, B:56:0x0611, B:58:0x062f, B:59:0x0681, B:62:0x071b, B:64:0x0739, B:65:0x0792, B:71:0x0ec6, B:73:0x0ed9, B:74:0x0f25, B:84:0x0fd3, B:86:0x0fe6, B:87:0x1032, B:89:0x1054, B:91:0x1067, B:92:0x10af, B:94:0x10b8, B:96:0x10d6, B:97:0x1129, B:101:0x11d3, B:103:0x11f1, B:104:0x1241, B:108:0x1506, B:110:0x1519, B:111:0x1568, B:113:0x1621, B:115:0x1634, B:116:0x167f, B:124:0x174a, B:126:0x178a, B:127:0x17db, B:131:0x180c, B:133:0x181f, B:134:0x186a, B:136:0x1920, B:138:0x1933, B:139:0x197f, B:147:0x1a37, B:149:0x1a8f, B:150:0x1ae4, B:157:0x1c17, B:159:0x1c2a, B:160:0x1c78, B:168:0x1d46, B:170:0x1d93, B:171:0x1de5, B:198:0x2062, B:200:0x20a4, B:201:0x20f5, B:205:0x2138, B:207:0x214b, B:208:0x219a, B:221:0x23d1, B:223:0x23e4, B:224:0x2434, B:232:0x24c5, B:234:0x2519, B:235:0x256e, B:239:0x25a8, B:241:0x25d1, B:242:0x2630, B:249:0x26ea, B:251:0x2746, B:252:0x279d, B:256:0x27e8, B:258:0x2811, B:259:0x286f, B:263:0x2941, B:265:0x2982, B:266:0x29d0, B:269:0x29e6, B:271:0x29f5, B:272:0x2a42, B:276:0x2b1c, B:278:0x2b7e, B:279:0x2bcf, B:283:0x2be6, B:285:0x2bff, B:286:0x2c4a, B:290:0x2cff, B:292:0x2d5b, B:293:0x2daf, B:296:0x2dc5, B:298:0x2dd4, B:299:0x2e1b, B:303:0x2ebe, B:305:0x2f0c, B:306:0x2f61, B:309:0x2f77, B:311:0x2f86, B:312:0x2fd1, B:316:0x3073, B:318:0x30c7, B:319:0x311d, B:322:0x3133, B:324:0x3142, B:325:0x3188, B:329:0x3244, B:331:0x328b, B:332:0x32de, B:336:0x331a, B:338:0x3344, B:339:0x339f, B:343:0x345a, B:345:0x349c, B:346:0x34ef, B:350:0x3531, B:352:0x3544, B:353:0x3595, B:357:0x3649, B:359:0x368d, B:360:0x36de, B:363:0x36f4, B:365:0x3703, B:366:0x3751, B:370:0x3802, B:372:0x3846, B:373:0x3897, B:376:0x38ad, B:378:0x38bc, B:379:0x3901, B:383:0x39a1, B:385:0x39f0, B:386:0x3a41, B:389:0x3a57, B:391:0x3a66, B:392:0x3ab7, B:396:0x3b3f, B:398:0x3b89, B:399:0x3bd7, B:402:0x3bed, B:404:0x3bfc, B:405:0x3c41, B:411:0x3cf4, B:413:0x3d3b, B:414:0x3d8d, B:416:0x3da2, B:418:0x3db5, B:419:0x3e01, B:421:0x3e09, B:423:0x3e39, B:424:0x3e95, B:429:0x3f16, B:431:0x3f66, B:432:0x3fb4, B:494:0x130c, B:496:0x131f, B:497:0x136f, B:509:0x1425, B:511:0x146b, B:512:0x14c0, B:521:0x0872, B:523:0x0885, B:524:0x08d8, B:529:0x0a29, B:531:0x0a69, B:532:0x0abe, B:536:0x0989, B:538:0x099c, B:539:0x09eb), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:119:0x1720  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x181f A[Catch: all -> 0x3fd4, TryCatch #1 {all -> 0x3fd4, blocks: (B:3:0x0004, B:5:0x001a, B:6:0x0056, B:10:0x012e, B:12:0x0168, B:13:0x01b4, B:18:0x01e0, B:21:0x01f8, B:22:0x0246, B:32:0x02f4, B:34:0x0307, B:35:0x0353, B:37:0x0375, B:39:0x0388, B:40:0x03d7, B:42:0x03e0, B:44:0x03fe, B:45:0x0455, B:49:0x04f8, B:51:0x0516, B:52:0x0568, B:56:0x0611, B:58:0x062f, B:59:0x0681, B:62:0x071b, B:64:0x0739, B:65:0x0792, B:71:0x0ec6, B:73:0x0ed9, B:74:0x0f25, B:84:0x0fd3, B:86:0x0fe6, B:87:0x1032, B:89:0x1054, B:91:0x1067, B:92:0x10af, B:94:0x10b8, B:96:0x10d6, B:97:0x1129, B:101:0x11d3, B:103:0x11f1, B:104:0x1241, B:108:0x1506, B:110:0x1519, B:111:0x1568, B:113:0x1621, B:115:0x1634, B:116:0x167f, B:124:0x174a, B:126:0x178a, B:127:0x17db, B:131:0x180c, B:133:0x181f, B:134:0x186a, B:136:0x1920, B:138:0x1933, B:139:0x197f, B:147:0x1a37, B:149:0x1a8f, B:150:0x1ae4, B:157:0x1c17, B:159:0x1c2a, B:160:0x1c78, B:168:0x1d46, B:170:0x1d93, B:171:0x1de5, B:198:0x2062, B:200:0x20a4, B:201:0x20f5, B:205:0x2138, B:207:0x214b, B:208:0x219a, B:221:0x23d1, B:223:0x23e4, B:224:0x2434, B:232:0x24c5, B:234:0x2519, B:235:0x256e, B:239:0x25a8, B:241:0x25d1, B:242:0x2630, B:249:0x26ea, B:251:0x2746, B:252:0x279d, B:256:0x27e8, B:258:0x2811, B:259:0x286f, B:263:0x2941, B:265:0x2982, B:266:0x29d0, B:269:0x29e6, B:271:0x29f5, B:272:0x2a42, B:276:0x2b1c, B:278:0x2b7e, B:279:0x2bcf, B:283:0x2be6, B:285:0x2bff, B:286:0x2c4a, B:290:0x2cff, B:292:0x2d5b, B:293:0x2daf, B:296:0x2dc5, B:298:0x2dd4, B:299:0x2e1b, B:303:0x2ebe, B:305:0x2f0c, B:306:0x2f61, B:309:0x2f77, B:311:0x2f86, B:312:0x2fd1, B:316:0x3073, B:318:0x30c7, B:319:0x311d, B:322:0x3133, B:324:0x3142, B:325:0x3188, B:329:0x3244, B:331:0x328b, B:332:0x32de, B:336:0x331a, B:338:0x3344, B:339:0x339f, B:343:0x345a, B:345:0x349c, B:346:0x34ef, B:350:0x3531, B:352:0x3544, B:353:0x3595, B:357:0x3649, B:359:0x368d, B:360:0x36de, B:363:0x36f4, B:365:0x3703, B:366:0x3751, B:370:0x3802, B:372:0x3846, B:373:0x3897, B:376:0x38ad, B:378:0x38bc, B:379:0x3901, B:383:0x39a1, B:385:0x39f0, B:386:0x3a41, B:389:0x3a57, B:391:0x3a66, B:392:0x3ab7, B:396:0x3b3f, B:398:0x3b89, B:399:0x3bd7, B:402:0x3bed, B:404:0x3bfc, B:405:0x3c41, B:411:0x3cf4, B:413:0x3d3b, B:414:0x3d8d, B:416:0x3da2, B:418:0x3db5, B:419:0x3e01, B:421:0x3e09, B:423:0x3e39, B:424:0x3e95, B:429:0x3f16, B:431:0x3f66, B:432:0x3fb4, B:494:0x130c, B:496:0x131f, B:497:0x136f, B:509:0x1425, B:511:0x146b, B:512:0x14c0, B:521:0x0872, B:523:0x0885, B:524:0x08d8, B:529:0x0a29, B:531:0x0a69, B:532:0x0abe, B:536:0x0989, B:538:0x099c, B:539:0x09eb), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:138:0x1933 A[Catch: all -> 0x3fd4, TryCatch #1 {all -> 0x3fd4, blocks: (B:3:0x0004, B:5:0x001a, B:6:0x0056, B:10:0x012e, B:12:0x0168, B:13:0x01b4, B:18:0x01e0, B:21:0x01f8, B:22:0x0246, B:32:0x02f4, B:34:0x0307, B:35:0x0353, B:37:0x0375, B:39:0x0388, B:40:0x03d7, B:42:0x03e0, B:44:0x03fe, B:45:0x0455, B:49:0x04f8, B:51:0x0516, B:52:0x0568, B:56:0x0611, B:58:0x062f, B:59:0x0681, B:62:0x071b, B:64:0x0739, B:65:0x0792, B:71:0x0ec6, B:73:0x0ed9, B:74:0x0f25, B:84:0x0fd3, B:86:0x0fe6, B:87:0x1032, B:89:0x1054, B:91:0x1067, B:92:0x10af, B:94:0x10b8, B:96:0x10d6, B:97:0x1129, B:101:0x11d3, B:103:0x11f1, B:104:0x1241, B:108:0x1506, B:110:0x1519, B:111:0x1568, B:113:0x1621, B:115:0x1634, B:116:0x167f, B:124:0x174a, B:126:0x178a, B:127:0x17db, B:131:0x180c, B:133:0x181f, B:134:0x186a, B:136:0x1920, B:138:0x1933, B:139:0x197f, B:147:0x1a37, B:149:0x1a8f, B:150:0x1ae4, B:157:0x1c17, B:159:0x1c2a, B:160:0x1c78, B:168:0x1d46, B:170:0x1d93, B:171:0x1de5, B:198:0x2062, B:200:0x20a4, B:201:0x20f5, B:205:0x2138, B:207:0x214b, B:208:0x219a, B:221:0x23d1, B:223:0x23e4, B:224:0x2434, B:232:0x24c5, B:234:0x2519, B:235:0x256e, B:239:0x25a8, B:241:0x25d1, B:242:0x2630, B:249:0x26ea, B:251:0x2746, B:252:0x279d, B:256:0x27e8, B:258:0x2811, B:259:0x286f, B:263:0x2941, B:265:0x2982, B:266:0x29d0, B:269:0x29e6, B:271:0x29f5, B:272:0x2a42, B:276:0x2b1c, B:278:0x2b7e, B:279:0x2bcf, B:283:0x2be6, B:285:0x2bff, B:286:0x2c4a, B:290:0x2cff, B:292:0x2d5b, B:293:0x2daf, B:296:0x2dc5, B:298:0x2dd4, B:299:0x2e1b, B:303:0x2ebe, B:305:0x2f0c, B:306:0x2f61, B:309:0x2f77, B:311:0x2f86, B:312:0x2fd1, B:316:0x3073, B:318:0x30c7, B:319:0x311d, B:322:0x3133, B:324:0x3142, B:325:0x3188, B:329:0x3244, B:331:0x328b, B:332:0x32de, B:336:0x331a, B:338:0x3344, B:339:0x339f, B:343:0x345a, B:345:0x349c, B:346:0x34ef, B:350:0x3531, B:352:0x3544, B:353:0x3595, B:357:0x3649, B:359:0x368d, B:360:0x36de, B:363:0x36f4, B:365:0x3703, B:366:0x3751, B:370:0x3802, B:372:0x3846, B:373:0x3897, B:376:0x38ad, B:378:0x38bc, B:379:0x3901, B:383:0x39a1, B:385:0x39f0, B:386:0x3a41, B:389:0x3a57, B:391:0x3a66, B:392:0x3ab7, B:396:0x3b3f, B:398:0x3b89, B:399:0x3bd7, B:402:0x3bed, B:404:0x3bfc, B:405:0x3c41, B:411:0x3cf4, B:413:0x3d3b, B:414:0x3d8d, B:416:0x3da2, B:418:0x3db5, B:419:0x3e01, B:421:0x3e09, B:423:0x3e39, B:424:0x3e95, B:429:0x3f16, B:431:0x3f66, B:432:0x3fb4, B:494:0x130c, B:496:0x131f, B:497:0x136f, B:509:0x1425, B:511:0x146b, B:512:0x14c0, B:521:0x0872, B:523:0x0885, B:524:0x08d8, B:529:0x0a29, B:531:0x0a69, B:532:0x0abe, B:536:0x0989, B:538:0x099c, B:539:0x09eb), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:142:0x1a12  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x1c15  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x1d2d  */
        /* JADX WARN: Removed duplicated region for block: B:174:0x1dfb  */
        /* JADX WARN: Removed duplicated region for block: B:197:0x2049  */
        /* JADX WARN: Removed duplicated region for block: B:204:0x210b  */
        /* JADX WARN: Removed duplicated region for block: B:488:0x1d28 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:520:0x0848  */
        /* JADX WARN: Removed duplicated region for block: B:535:0x096e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0ed9 A[Catch: all -> 0x3fd4, TryCatch #1 {all -> 0x3fd4, blocks: (B:3:0x0004, B:5:0x001a, B:6:0x0056, B:10:0x012e, B:12:0x0168, B:13:0x01b4, B:18:0x01e0, B:21:0x01f8, B:22:0x0246, B:32:0x02f4, B:34:0x0307, B:35:0x0353, B:37:0x0375, B:39:0x0388, B:40:0x03d7, B:42:0x03e0, B:44:0x03fe, B:45:0x0455, B:49:0x04f8, B:51:0x0516, B:52:0x0568, B:56:0x0611, B:58:0x062f, B:59:0x0681, B:62:0x071b, B:64:0x0739, B:65:0x0792, B:71:0x0ec6, B:73:0x0ed9, B:74:0x0f25, B:84:0x0fd3, B:86:0x0fe6, B:87:0x1032, B:89:0x1054, B:91:0x1067, B:92:0x10af, B:94:0x10b8, B:96:0x10d6, B:97:0x1129, B:101:0x11d3, B:103:0x11f1, B:104:0x1241, B:108:0x1506, B:110:0x1519, B:111:0x1568, B:113:0x1621, B:115:0x1634, B:116:0x167f, B:124:0x174a, B:126:0x178a, B:127:0x17db, B:131:0x180c, B:133:0x181f, B:134:0x186a, B:136:0x1920, B:138:0x1933, B:139:0x197f, B:147:0x1a37, B:149:0x1a8f, B:150:0x1ae4, B:157:0x1c17, B:159:0x1c2a, B:160:0x1c78, B:168:0x1d46, B:170:0x1d93, B:171:0x1de5, B:198:0x2062, B:200:0x20a4, B:201:0x20f5, B:205:0x2138, B:207:0x214b, B:208:0x219a, B:221:0x23d1, B:223:0x23e4, B:224:0x2434, B:232:0x24c5, B:234:0x2519, B:235:0x256e, B:239:0x25a8, B:241:0x25d1, B:242:0x2630, B:249:0x26ea, B:251:0x2746, B:252:0x279d, B:256:0x27e8, B:258:0x2811, B:259:0x286f, B:263:0x2941, B:265:0x2982, B:266:0x29d0, B:269:0x29e6, B:271:0x29f5, B:272:0x2a42, B:276:0x2b1c, B:278:0x2b7e, B:279:0x2bcf, B:283:0x2be6, B:285:0x2bff, B:286:0x2c4a, B:290:0x2cff, B:292:0x2d5b, B:293:0x2daf, B:296:0x2dc5, B:298:0x2dd4, B:299:0x2e1b, B:303:0x2ebe, B:305:0x2f0c, B:306:0x2f61, B:309:0x2f77, B:311:0x2f86, B:312:0x2fd1, B:316:0x3073, B:318:0x30c7, B:319:0x311d, B:322:0x3133, B:324:0x3142, B:325:0x3188, B:329:0x3244, B:331:0x328b, B:332:0x32de, B:336:0x331a, B:338:0x3344, B:339:0x339f, B:343:0x345a, B:345:0x349c, B:346:0x34ef, B:350:0x3531, B:352:0x3544, B:353:0x3595, B:357:0x3649, B:359:0x368d, B:360:0x36de, B:363:0x36f4, B:365:0x3703, B:366:0x3751, B:370:0x3802, B:372:0x3846, B:373:0x3897, B:376:0x38ad, B:378:0x38bc, B:379:0x3901, B:383:0x39a1, B:385:0x39f0, B:386:0x3a41, B:389:0x3a57, B:391:0x3a66, B:392:0x3ab7, B:396:0x3b3f, B:398:0x3b89, B:399:0x3bd7, B:402:0x3bed, B:404:0x3bfc, B:405:0x3c41, B:411:0x3cf4, B:413:0x3d3b, B:414:0x3d8d, B:416:0x3da2, B:418:0x3db5, B:419:0x3e01, B:421:0x3e09, B:423:0x3e39, B:424:0x3e95, B:429:0x3f16, B:431:0x3f66, B:432:0x3fb4, B:494:0x130c, B:496:0x131f, B:497:0x136f, B:509:0x1425, B:511:0x146b, B:512:0x14c0, B:521:0x0872, B:523:0x0885, B:524:0x08d8, B:529:0x0a29, B:531:0x0a69, B:532:0x0abe, B:536:0x0989, B:538:0x099c, B:539:0x09eb), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0f30  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] DigitizedCardProfile$4956fc2a(int i, java.lang.Object obj) {
            java.lang.String str;
            long j;
            int i2;
            java.lang.Object obj2;
            java.lang.String str2;
            int i3;
            java.lang.String str3;
            long j2;
            int i4;
            java.lang.Object obj3;
            long j3;
            java.lang.Object obj4;
            java.lang.Object obj5;
            long j4;
            java.lang.String str4;
            java.lang.Object obj6;
            java.lang.String str5;
            java.lang.String[] strArr;
            int i5;
            java.lang.String str6;
            int i6;
            java.lang.String str7;
            int i7;
            int i8;
            int i9;
            java.lang.String str8;
            java.lang.Object[] objArr;
            int i10;
            java.lang.String[] strArr2;
            java.lang.String[] strArr3;
            java.lang.String str9;
            java.lang.Object obj7;
            int i11;
            char c;
            try {
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
                if (obj8 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 26, 1838 - android.graphics.Color.alpha(0), (char) android.graphics.Color.red(0));
                    byte[] bArr = $$a;
                    short s = (short) (bArr[14] - 1);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(s, (byte) s, (byte) (-bArr[16]), objArr2);
                    obj8 = cls.getMethod((java.lang.String) objArr2[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, obj8);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj8).invoke(null, null)).longValue();
                long j5 = i;
                long j6 = ~j5;
                long j7 = 916681904 + ((603 * longValue) - 23134093618L) + (((~(j6 | 76602958)) | longValue) * (-602)) + (((~(76602958 | (~longValue))) | (~(76602958 | j5)) | (~((-76602959) | j6 | longValue))) * (-301)) + ((~(j6 | longValue)) * 301);
                int i12 = (int) (j7 >> 32);
                int i13 = ~i;
                if (((i12 & ((((~((-287375393) | i)) * 623) - 406178238) + ((8656136 | i13) * (-623)) + (((~(i | 1289510814)) | 287375392 | (~((-1568230071) | i))) * 623))) | (((int) j7) & ((((((~(461642258 | i13)) | (-1000749976)) | (~(975584151 | i13))) * (-1136)) - 1738041619) + (((~(461642258 | i)) | (~(975584151 | i)) | (~((-436476435) | i13))) * (-568)) + (((~((-461642259) | i13)) | (~((-975584152) | i13)) | (~(1000749975 | i))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION)))) != 0) {
                    java.lang.Object[] objArr3 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, null, new int[1]};
                    java.lang.Object[] objArr4 = {522072123, 16, java.lang.Integer.valueOf((((~(i | (-27658444))) | (-938475516)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1762145716 + ((~((-27658444) | i13)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))};
                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj9 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 50, 2713 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                        byte b = (byte) ($$a[14] - 1);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        a(653, b, b, objArr5);
                        obj9 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj9);
                    }
                    ((int[]) objArr3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr4)).intValue();
                    return objArr3;
                }
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b(new int[]{0, 11, 156, 1}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001", true, objArr6);
                java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj10 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.KeyEvent.keyCodeFromString(""), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1920, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1));
                    short s2 = (short) (r10[14] - 1);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a(s2, (byte) s2, (byte) (-$$a[16]), objArr8);
                    obj10 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj10);
                }
                java.lang.String str10 = (java.lang.String) ((java.lang.reflect.Method) obj10).invoke(null, objArr7);
                if (str10 != null) {
                    valueOf = (writeReplace + 43) % 128;
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    c("\ufffe\u000b\b\ufff7\u0004\ufff9", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3, false, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 6, objArr9);
                    java.lang.String intern = ((java.lang.String) objArr9[0]).intern();
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    c("\uffff\t\ufffe�\u0005\u0002\ufffa￼", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, android.text.TextUtils.indexOf("", "") + 3, false, 9 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr10);
                    int i14 = 0;
                    java.lang.String[] strArr4 = {intern, ((java.lang.String) objArr10[0]).intern()};
                    int i15 = 0;
                    int i16 = 2;
                    while (i15 < i16) {
                        if (str10.contains(strArr4[i15])) {
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            c("ￇ\b\u000b\u000b\ufffe\u000b\u000e\r￼\ufffa\uffff\u000e\u0007\ufffa\u0006ￇ\r￼\u000e�\b\u000b\t", 124 - android.text.TextUtils.getOffsetBefore("", i14), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 3, true, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22, objArr11);
                            java.lang.Object[] objArr12 = {((java.lang.String) objArr11[0]).intern()};
                            java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj11 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.view.KeyEvent.keyCodeFromString("") + 1921, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                byte[] bArr2 = $$a;
                                short s3 = (short) (bArr2[14] - 1);
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                a(s3, (byte) s3, (byte) (-bArr2[16]), objArr13);
                                obj11 = cls4.getMethod((java.lang.String) objArr13[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj11);
                            }
                            java.lang.Object invoke = ((java.lang.reflect.Method) obj11).invoke(null, objArr12);
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            b(new int[]{11, 30, 0, 17}, "\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", false, objArr14);
                            java.lang.Object[] objArr15 = {((java.lang.String) objArr14[0]).intern()};
                            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj12 == null) {
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.View.resolveSize(0, 0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1921, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                                byte[] bArr3 = $$a;
                                short s4 = (short) (bArr3[14] - 1);
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                a(s4, (byte) s4, (byte) (-bArr3[16]), objArr16);
                                obj12 = cls5.getMethod((java.lang.String) objArr16[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj12);
                            }
                            java.lang.Object invoke2 = ((java.lang.reflect.Method) obj12).invoke(null, objArr15);
                            if (invoke != null) {
                                java.lang.Object[] objArr17 = {invoke, 42};
                                java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj13 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.os.Process.getGidForName("") + 2595, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                    byte[] bArr4 = $$a;
                                    short s5 = (short) (bArr4[14] - 1);
                                    str9 = "";
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    a(s5, (byte) s5, (byte) (-bArr4[16]), objArr18);
                                    obj13 = cls6.getMethod((java.lang.String) objArr18[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj13);
                                } else {
                                    str9 = "";
                                }
                                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj13).invoke(null, objArr17)).longValue();
                                long j8 = ~((~longValue2) | (-794797661));
                                obj7 = invoke;
                                long j9 = (((-107) * longValue2) - 43713871355L) + (((~(longValue2 | j6)) | (~(longValue2 | 794797660))) * (-108)) + (((~(794797660 | j5)) | j8 | (~((-794797661) | j6))) * 54) + ((j5 | j8) * 54) + 2051898185;
                                if (((((int) j9) & (((((~(233344917 | i13)) | (-1340723094)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~(1340723093 | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(1203881492 | i13)) | 136841601 | (~((-1107378177) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))) | (((int) (j9 >> 32)) & ((((~((-16777541) | i13)) * 130) - 1775165150) + (((~((-16777541) | i)) | 338315264) * 130)))) == 477111747) {
                                    j = j6;
                                    if (android.os.Build.VERSION.SDK_INT <= 33) {
                                        java.lang.String str11 = str9;
                                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                                        c("\u0005\u0014\uffd0\u0007\u000e\u0004\u0003\t\t\u0017\u0004\u0007\u0006ￏ\u0006\r\u000e\u000e\uffd1\u0016\u000b\u0010\u000b\uffd1\u0005\u0016\u0007\uffd1", android.graphics.Color.red(0) + 115, android.text.TextUtils.getOffsetBefore(str11, 0) + 28, true, android.text.TextUtils.getOffsetBefore(str11, 0) + 28, objArr19);
                                        java.lang.Object[] objArr20 = {((java.lang.String) objArr19[0]).intern()};
                                        java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                        if (obj14 == null) {
                                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 3160 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (33098 - android.text.TextUtils.indexOf(str11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                            byte[] bArr5 = $$a;
                                            short s6 = (short) (bArr5[14] - 1);
                                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                                            a(s6, (byte) s6, (byte) (-bArr5[16]), objArr21);
                                            obj14 = cls7.getMethod((java.lang.String) objArr21[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj14);
                                        }
                                        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj14).invoke(null, objArr20)).longValue();
                                        long j10 = ~longValue3;
                                        long j11 = j | (-994357087);
                                        str = str11;
                                        long j12 = ((((((-885) * longValue3) - 1762995115251L) + ((((~(j10 | 994357086)) | (~(j10 | j5))) | (~(j11 | longValue3))) * 886)) + (((~(j | longValue3)) | (-994357087)) * (-1772))) + ((~j11) * 886)) - 343311021;
                                        int i17 = ~(1265642009 | i);
                                        if (((((int) j12) & ((((17836545 | i17) * (-196)) - 1992965959) + ((i17 | 1247805464) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))) | (((int) (j12 >> 32)) & (((((-811250305) | i13) * (-369)) - 802173004) + (((~(2035988368 | i13)) | (-821752517)) * (-369)) + (((~((-2035988369) | i)) | 1224738064 | (~((-10502213) | i13))) * 369)))) == 1) {
                                            i11 = 1;
                                            c = 0;
                                            int[] iArr = new int[i11];
                                            int[] iArr2 = new int[i11];
                                            iArr[c] = i;
                                            iArr2[c] = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                            java.lang.Object[] objArr22 = {iArr, iArr2, null, new int[i11]};
                                            java.lang.Object[] objArr23 = {522072123, 16, java.lang.Integer.valueOf(((~((-69684490) | i13)) * 130) + 239210801 + (((~(i | (-69684490))) | 8198) * 130))};
                                            java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj15 == null) {
                                                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 49, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2713, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                byte b2 = (byte) ($$a[14] - 1);
                                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                                a(653, b2, b2, objArr24);
                                                obj15 = cls8.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj15);
                                            }
                                            ((int[]) objArr22[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr23)).intValue();
                                            return objArr22;
                                        }
                                    } else {
                                        str = str9;
                                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                                        b(new int[]{41, 13, 0, 0}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001", false, objArr25);
                                        java.lang.Object[] objArr26 = {((java.lang.String) objArr25[0]).intern()};
                                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj16 == null) {
                                            java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getOffsetAfter(str, 0), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1921, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
                                            byte[] bArr6 = $$a;
                                            short s7 = (short) (bArr6[14] - 1);
                                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                                            a(s7, (byte) s7, (byte) (-bArr6[16]), objArr27);
                                            obj16 = cls9.getMethod((java.lang.String) objArr27[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj16);
                                        }
                                        java.lang.Object invoke3 = ((java.lang.reflect.Method) obj16).invoke(null, objArr26);
                                        i11 = 1;
                                        c = 0;
                                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                                        b(new int[]{54, 1, 188, 0}, "\u0001", false, objArr28);
                                    }
                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                    c("\ufff9\u000b\u0011�\u0003\ufff7\ufffa￼", 125 - android.view.View.MeasureSpec.getMode(i2), 1 - (android.view.ViewConfiguration.getTouchSlop() >> 8), true, 7 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i2, i2), objArr29);
                                    java.lang.String intern2 = ((java.lang.String) objArr29[0]).intern();
                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                    c("\uffff\u0004�\ufff7\b\u0006", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 127, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2, false, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '*', objArr30);
                                    java.lang.String intern3 = ((java.lang.String) objArr30[0]).intern();
                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                    c("\ufff8\u0006\ufff9\u0007\t\u0001\ufff8", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 129, 7 - android.view.KeyEvent.normalizeMetaState(0), true, 8 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr31);
                                    java.lang.String intern4 = ((java.lang.String) objArr31[0]).intern();
                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                    c("\u0007\u000b\ufffa\u0007￼\ufff9\ufff7\b\ufffa", 128 - android.graphics.Color.blue(0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3, false, 8 - android.os.Process.getGidForName(str), objArr32);
                                    java.lang.String intern5 = ((java.lang.String) objArr32[0]).intern();
                                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                                    b(new int[]{55, 6, 0, 3}, "\u0000\u0000\u0001\u0000\u0001\u0001", true, objArr33);
                                    java.lang.String intern6 = ((java.lang.String) objArr33[0]).intern();
                                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                                    c("\u0002\u0015\u0007ￎ\u0012\u0003\t\u000e\t\u0014ￍ\u0004\u0005", 118 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionChild(0L) + 7, false, android.view.View.MeasureSpec.getMode(0) + 13, objArr34);
                                    java.lang.String intern7 = ((java.lang.String) objArr34[0]).intern();
                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                    b(new int[]{61, 5, 144, 0}, "\u0000\u0001\u0001\u0001\u0000", true, objArr35);
                                    java.lang.String intern8 = ((java.lang.String) objArr35[0]).intern();
                                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                                    b(new int[]{66, 6, 30, 5}, "\u0000\u0001\u0001\u0000\u0001\u0000", false, objArr36);
                                    java.lang.String intern9 = ((java.lang.String) objArr36[0]).intern();
                                    java.lang.Object[] objArr37 = new java.lang.Object[1];
                                    c("\u0007\ufff9", 133 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 2 - android.text.TextUtils.indexOf(str, str, 0, 0), true, android.text.TextUtils.getCapsMode(str, 0, 0) + 2, objArr37);
                                    java.lang.String intern10 = ((java.lang.String) objArr37[0]).intern();
                                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                                    c("\ufff7\b\n\u0002\u0005�\u0006\ufffb\b\t\uffff\t\nￄ\t\n", 127 - android.graphics.Color.alpha(0), android.graphics.ImageFormat.getBitsPerPixel(0) + 4, false, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 16, objArr38);
                                    java.lang.String intern11 = ((java.lang.String) objArr38[0]).intern();
                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                    b(new int[]{72, 10, 0, 0}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001", false, objArr39);
                                    java.lang.String intern12 = ((java.lang.String) objArr39[0]).intern();
                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                    b(new int[]{82, 8, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", true, objArr40);
                                    java.lang.String intern13 = ((java.lang.String) objArr40[0]).intern();
                                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                                    b(new int[]{90, 12, 0, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", false, objArr41);
                                    java.lang.String intern14 = ((java.lang.String) objArr41[0]).intern();
                                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                                    c("\t\ufff8\ufffa\u0001\u0001\u0004\ufff8\ufffb\u0004\u0007\u0005\u0001\t\ufff8", 128 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.text.TextUtils.indexOf(str, str, 0) + 11, true, 14 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr42);
                                    java.lang.String intern15 = ((java.lang.String) objArr42[0]).intern();
                                    java.lang.Object[] objArr43 = new java.lang.Object[1];
                                    b(new int[]{102, 7, 0, 1}, "\u0000\u0000\u0001\u0000\u0000\u0000\u0001", false, objArr43);
                                    java.lang.String intern16 = ((java.lang.String) objArr43[0]).intern();
                                    java.lang.Object[] objArr44 = new java.lang.Object[1];
                                    b(new int[]{109, 7, 0, 3}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000", false, objArr44);
                                    java.lang.String intern17 = ((java.lang.String) objArr44[0]).intern();
                                    java.lang.Object[] objArr45 = new java.lang.Object[1];
                                    b(new int[]{116, 7, 166, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000", true, objArr45);
                                    java.lang.String intern18 = ((java.lang.String) objArr45[0]).intern();
                                    java.lang.Object[] objArr46 = new java.lang.Object[1];
                                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 2, 0, 2}, "\u0001\u0000", true, objArr46);
                                    java.lang.String intern19 = ((java.lang.String) objArr46[0]).intern();
                                    java.lang.Object[] objArr47 = new java.lang.Object[1];
                                    c("\ufffa￼\ufff6\u0000\ufff8\u0004\u0001\ufff4�\t\ufffe\f\ufff4\t\u0007\ufff6\t\b\t\u0003", ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 128, 18 - android.graphics.Color.red(0), true, 21 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr47);
                                    java.lang.String intern20 = ((java.lang.String) objArr47[0]).intern();
                                    java.lang.Object[] objArr48 = new java.lang.Object[1];
                                    c("\ufffa\ufff8\ufff6\u0007\t\b", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 127, 6 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), true, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6, objArr48);
                                    java.lang.String intern21 = ((java.lang.String) objArr48[0]).intern();
                                    java.lang.Object[] objArr49 = new java.lang.Object[1];
                                    c("\uffff\u0001", 136 - android.graphics.ImageFormat.getBitsPerPixel(0), 1 - android.view.View.resolveSize(0, 0), true, 1 - android.os.Process.getGidForName(str), objArr49);
                                    java.lang.String intern22 = ((java.lang.String) objArr49[0]).intern();
                                    java.lang.Object[] objArr50 = new java.lang.Object[1];
                                    c("\u000b\n\ufff7\n\tￃ\b\ufffb\u0010\uffff\n\uffff\u0004\ufff7\t\t", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, 14 - android.view.MotionEvent.axisFromString(str), true, android.graphics.Color.blue(0) + 16, objArr50);
                                    java.lang.String intern23 = ((java.lang.String) objArr50[0]).intern();
                                    java.lang.Object[] objArr51 = new java.lang.Object[1];
                                    b(new int[]{125, 9, 110, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000", true, objArr51);
                                    java.lang.String intern24 = ((java.lang.String) objArr51[0]).intern();
                                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                                    b(new int[]{134, 10, 90, 4}, "\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001", false, objArr52);
                                    java.lang.String intern25 = ((java.lang.String) objArr52[0]).intern();
                                    java.lang.Object[] objArr53 = new java.lang.Object[1];
                                    c("\b\u000b\ufffe￼\ufffa\u000b\rￏ\ufffe\r\u000e", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 125, 7 - android.text.TextUtils.getOffsetAfter(str, 0), true, 11 - android.text.TextUtils.indexOf(str, str, 0), objArr53);
                                    java.lang.String intern26 = ((java.lang.String) objArr53[0]).intern();
                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                    b(new int[]{144, 11, 74, 0}, "\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001", false, objArr54);
                                    java.lang.String intern27 = ((java.lang.String) objArr54[0]).intern();
                                    java.lang.Object[] objArr55 = new java.lang.Object[1];
                                    b(new int[]{155, 15, 0, 13}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001", false, objArr55);
                                    java.lang.String intern28 = ((java.lang.String) objArr55[0]).intern();
                                    java.lang.Object[] objArr56 = new java.lang.Object[1];
                                    c("\ufff7\u0001￼\n\u0001\b\u0006\uffff\u0002\ufff5\u0000\f\u0006\ufff2", 130 - android.view.View.resolveSizeAndState(0, 0, 0), 6 - (android.view.ViewConfiguration.getTapTimeout() >> 16), true, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 14, objArr56);
                                    java.lang.String[] strArr5 = {intern2, intern3, intern4, intern5, intern6, intern7, intern8, intern9, intern10, intern11, intern12, intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, ((java.lang.String) objArr56[0]).intern()};
                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                    b(new int[]{0, 11, 156, 1}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001", true, objArr57);
                                    java.lang.Object[] objArr58 = {((java.lang.String) objArr57[0]).intern()};
                                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj2 == null) {
                                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 40, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1921, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                        byte[] bArr7 = $$a;
                                        short s8 = (short) (bArr7[14] - 1);
                                        java.lang.Object[] objArr59 = new java.lang.Object[1];
                                        a(s8, (byte) s8, (byte) (-bArr7[16]), objArr59);
                                        obj2 = cls10.getMethod((java.lang.String) objArr59[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj2);
                                    }
                                    str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr58);
                                    if (str2 != null) {
                                        writeReplace = (valueOf + 111) % 128;
                                        java.lang.Object[] objArr60 = new java.lang.Object[1];
                                        c("\ufffe\u000b\b\ufff7\u0004\ufff9", 127 - android.text.TextUtils.getOffsetBefore(str, 0), android.graphics.ImageFormat.getBitsPerPixel(0) + 3, false, 6 - android.view.View.getDefaultSize(0, 0), objArr60);
                                        java.lang.String intern29 = ((java.lang.String) objArr60[0]).intern();
                                        java.lang.Object[] objArr61 = new java.lang.Object[1];
                                        c("\uffff\t\ufffe�\u0005\u0002\ufffa￼", 127 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 2 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), false, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9, objArr61);
                                        java.lang.String[] strArr6 = {intern29, ((java.lang.String) objArr61[0]).intern()};
                                        int i18 = 0;
                                        while (i18 < 2) {
                                            if (str2.contains(strArr6[i18])) {
                                                valueOf = (writeReplace + 125) % 128;
                                                java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                c("ￇ\b\u000b\u000b\ufffe\u000b\u000e\r￼\ufffa\uffff\u000e\u0007\ufffa\u0006ￇ\r￼\u000e�\b\u000b\t", 123 - android.widget.ExpandableListView.getPackedPositionChild(0L), 3 - android.view.View.resolveSize(0, 0), true, (-16777193) - android.graphics.Color.rgb(0, 0, 0), objArr62);
                                                java.lang.Object[] objArr63 = {((java.lang.String) objArr62[0]).intern()};
                                                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj17 == null) {
                                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777176) - android.graphics.Color.rgb(0, 0, 0), 1922 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) android.graphics.Color.alpha(0));
                                                    byte[] bArr8 = $$a;
                                                    short s9 = (short) (bArr8[14] - 1);
                                                    java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                    a(s9, (byte) s9, (byte) (-bArr8[16]), objArr64);
                                                    obj17 = cls11.getMethod((java.lang.String) objArr64[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj17);
                                                }
                                                java.lang.Object invoke4 = ((java.lang.reflect.Method) obj17).invoke(null, objArr63);
                                                java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                b(new int[]{11, 30, 0, 17}, "\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", false, objArr65);
                                                java.lang.Object[] objArr66 = {((java.lang.String) objArr65[0]).intern()};
                                                java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj18 == null) {
                                                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.view.KeyEvent.getDeadChar(0, 0) + 1921, (char) android.view.KeyEvent.keyCodeFromString(str));
                                                    byte[] bArr9 = $$a;
                                                    short s10 = (short) (bArr9[14] - 1);
                                                    java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                    a(s10, (byte) s10, (byte) (-bArr9[16]), objArr67);
                                                    obj18 = cls12.getMethod((java.lang.String) objArr67[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj18);
                                                }
                                                java.lang.Object invoke5 = ((java.lang.reflect.Method) obj18).invoke(null, objArr66);
                                                if (invoke4 != null) {
                                                    java.lang.Object[] objArr68 = {invoke4, 42};
                                                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                    if (obj19 == null) {
                                                        java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2595, (char) android.view.View.MeasureSpec.getMode(0));
                                                        byte[] bArr10 = $$a;
                                                        short s11 = (short) (bArr10[14] - 1);
                                                        java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                        a(s11, (byte) s11, (byte) (-bArr10[16]), objArr69);
                                                        obj19 = cls13.getMethod((java.lang.String) objArr69[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj19);
                                                    }
                                                    long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr68)).longValue();
                                                    long j13 = ~longValue4;
                                                    strArr3 = strArr5;
                                                    long j14 = longValue4 | 1197859632;
                                                    j2 = j5;
                                                    long j15 = ~(j | longValue4);
                                                    i4 = i13;
                                                    str3 = str;
                                                    long j16 = (longValue4 * 85) + 101818068720L + (((~(j | (-1197859633))) | (~(j13 | (-1197859633))) | (~(j13 | j)) | (~(j14 | j2))) * (-84)) + (((~(j13 | j2)) | 1197859632 | j15) * (-84)) + (((~j14) | j15) * 84) + 59240892;
                                                    i3 = i;
                                                    if (((((int) (j16 >> 32)) & ((((~((-1142397864) | i3)) | 1715343021) * (-668)) + 2060253298 + (((~(1715343021 | i3)) | (-1142397864)) * 1336) + (((-102659) | i3) * 668))) | (((int) j16) & ((((~((-8954145) | i3)) | 622921729) * 449) + 2094333363 + (((~((-8954145) | i4)) | 622921729) * 449)))) != 477111747) {
                                                    }
                                                    int i19 = 0;
                                                    for (int i20 = 0; i20 < 28; i20++) {
                                                        java.lang.String str12 = strArr3[i20];
                                                        java.lang.Object[] objArr70 = new java.lang.Object[1];
                                                        c("\u000f\u0007\u0016\u0015\u001b\u0015\uffd1\uffd1\u0010\u000b\u0004\uffd1", 115 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 8 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, android.view.View.resolveSize(0, 0) + 12, objArr70);
                                                        java.lang.Object[] objArr71 = {((java.lang.String) objArr70[0]).intern().concat(java.lang.String.valueOf(str12))};
                                                        java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                                        if (obj20 == null) {
                                                            java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.View.resolveSizeAndState(0, 0, 0), 3162 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 33098));
                                                            java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                            a(618, r7[14], (byte) (-$$a[16]), objArr72);
                                                            obj20 = cls14.getMethod((java.lang.String) objArr72[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj20);
                                                        }
                                                        long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, objArr71)).longValue();
                                                        long j17 = (~(565234897 | (~longValue5))) | (~(j2 | 565234897));
                                                        long j18 = ((-495) * longValue5) + 279791274510L + (992 * j17) + (((~(j | (-565234898) | longValue5)) | j17) * (-496)) + ((longValue5 | j2) * 496) + 1472705636;
                                                        i19 += ((((int) (j18 >> 32)) & ((((((~((-1755922984) | i3)) | 671154690) * (-140)) + (-20058106)) + ((~((-1084768294) | i3)) * 70)) + (((~((-1101817902) | i3)) | 688204298) * 70))) | (((int) j18) & (((((~((-206916541) | i3)) | (-1230309870)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 757371299) + (((~((-206916541) | i4)) | 67125776) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE)))) == 0 ? 0 : 1;
                                                    }
                                                    if (i19 >= 25.2d) {
                                                        java.lang.Object[] objArr73 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, null, new int[1]};
                                                        java.lang.Object[] objArr74 = {522072123, 16, java.lang.Integer.valueOf((((~(54962006 | i3)) | (-784907633)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 1508017499 + (((~(54962006 | i4)) | (-784907633)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))};
                                                        java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj21 == null) {
                                                            java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 2713 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                            byte b3 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr75 = new java.lang.Object[1];
                                                            a(653, b3, b3, objArr75);
                                                            obj21 = cls15.getMethod((java.lang.String) objArr75[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj21);
                                                        }
                                                        ((int[]) objArr73[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr74)).intValue();
                                                        return objArr73;
                                                    }
                                                    java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 23, 0, 19}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000", false, objArr76);
                                                    java.lang.Object[] objArr77 = {((java.lang.String) objArr76[0]).intern()};
                                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                    if (obj3 == null) {
                                                        java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 19, 2807 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                        byte[] bArr11 = $$a;
                                                        short s12 = (short) (bArr11[14] - 1);
                                                        java.lang.Object[] objArr78 = new java.lang.Object[1];
                                                        a(s12, (byte) s12, (byte) (-bArr11[16]), objArr78);
                                                        obj3 = cls16.getMethod((java.lang.String) objArr78[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj3);
                                                    }
                                                    long j19 = ~((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr77)).longValue();
                                                    long j20 = ((r1 * (-858)) - 221409591180L) + ((j2 | (-257453013)) * (-859)) + (((~(j | (-257453013))) | (~(257453012 | j19 | j2))) * 859) + (((~(j19 | (-257453013))) | (~(j19 | j))) * 859) + 1547993080;
                                                    j3 = (((int) j20) & ((((~((-864120318) | i3)) | (-1993620569)) * (-318)) + 158946635 + (((~((-1993620569) | i3)) | (~(2010480125 | i4))) * 318) + (((~((-1146359809) | i4)) | (~(2010480125 | i3))) * 318))) | (((int) (j20 >> 32)) & (((((~((-1125806409) | i4)) | 16448) * (-108)) - 564914248) + (((~(1731934476 | i3)) | 606144516 | (~((-1731934477) | i4))) * 54) + ((606144516 | i3) * 54)));
                                                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                    b(new int[]{193, 17, 103, 0}, "\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", false, objArr79);
                                                    java.lang.Object[] objArr80 = {((java.lang.String) objArr79[0]).intern()};
                                                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                    if (obj4 == null) {
                                                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.os.Process.getGidForName(str3) + 2808, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                        byte[] bArr12 = $$a;
                                                        short s13 = (short) (bArr12[14] - 1);
                                                        java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                        a(s13, (byte) s13, (byte) (-bArr12[16]), objArr81);
                                                        obj4 = cls17.getMethod((java.lang.String) objArr81[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj4);
                                                    }
                                                    long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr80)).longValue();
                                                    long j21 = (565 * longValue6) + 478334234754L + (((~(longValue6 | j2)) | (~((~longValue6) | j)) | 849616757) * (-564)) + ((~(849616757 | longValue6 | j2)) * 1128) + (((~(j | 849616757)) | (~(longValue6 | (-849616758)))) * 564) + 2140156825;
                                                    int i21 = ~(1006639107 | i4);
                                                    long j22 = (((int) (j21 >> 32)) & ((((((~((-1200098635) | i4)) | (~((-237127777) | i3))) | (~(237127776 | i4))) * 959) - 611618391) + (((~((-1200098635) | i3)) | (~((-237127777) | i4)) | (~(237127776 | i3))) * 959))) | (((int) j21) & (((1851101778 | i21) * 764) + 735836633 + (((~(1851101778 | i4)) | 268437505) * (-1528)) + ((i21 | 1381337681) * 764)));
                                                    if (j3 <= 0 && j22 > 0 && j22 - 3 < j3) {
                                                        java.lang.Object[] objArr82 = {new int[]{i3}, new int[]{i3 ^ 247}, null, new int[1]};
                                                        int i22 = ~((-247111477) | i3);
                                                        java.lang.Object[] objArr83 = {522072123, 16, java.lang.Integer.valueOf((((-956436997) | i22) * (-220)) + 1462979665 + ((i22 | 112758064) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 246633714)};
                                                        java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj22 == null) {
                                                            java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSize(0, 0), 2712 - android.view.MotionEvent.axisFromString(str3), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                                            byte b4 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                            a(653, b4, b4, objArr84);
                                                            obj22 = cls18.getMethod((java.lang.String) objArr84[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj22);
                                                        }
                                                        ((int[]) objArr82[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr83)).intValue();
                                                        return objArr82;
                                                    }
                                                    java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 23, 0, 19}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000", false, objArr85);
                                                    java.lang.Object[] objArr86 = {((java.lang.String) objArr85[0]).intern()};
                                                    obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                    if (obj5 == null) {
                                                        java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.text.TextUtils.getTrimmedLength(str3), 2807 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                                        byte[] bArr13 = $$a;
                                                        short s14 = (short) (bArr13[14] - 1);
                                                        java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                        a(s14, (byte) s14, (byte) (-bArr13[16]), objArr87);
                                                        obj5 = cls19.getMethod((java.lang.String) objArr87[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj5);
                                                    }
                                                    long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr86)).longValue();
                                                    long j23 = ~longValue7;
                                                    long j24 = ((-675) * longValue7) + 702606242762L + ((j2 | 1037823106 | j23) * (-676)) + (((~(j | 1037823106)) | (~(1037823106 | j23))) * 676) + (((~(longValue7 | 1037823106 | j2)) | (~((-1037823107) | j23)) | (~(j23 | j))) * 676) + 252716961;
                                                    int i23 = ~((-1409302929) | i3);
                                                    j4 = (((int) (j24 >> 32)) & (((~((-144708137) | i4)) * (-783)) + 1958222673 + (((~((-1492573758) | i4)) | 1365167127) * 783))) | (((int) j24) & (((25690113 | i23) * (-476)) + 1388037233 + (i23 * 952) + ((~((-1409302929) | i4)) * 476)));
                                                    str4 = str3;
                                                    java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                    c("\u001b\n\tￔ", android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 113, 5 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, '4' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr88);
                                                    java.lang.Object[] objArr89 = {((java.lang.String) objArr88[0]).intern()};
                                                    obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                    if (obj6 == null) {
                                                        java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 2807 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                        byte[] bArr14 = $$a;
                                                        short s15 = (short) (bArr14[14] - 1);
                                                        java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                        a(s15, (byte) s15, (byte) (-bArr14[16]), objArr90);
                                                        obj6 = cls20.getMethod((java.lang.String) objArr90[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj6);
                                                    }
                                                    long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr89)).longValue();
                                                    long j25 = ~(324866605 | longValue8);
                                                    long j26 = (~longValue8) | (-324866606);
                                                    long j27 = ((1435 * longValue8) - 232604489180L) + ((longValue8 | (-324866606)) * (-1434)) + (((~(j26 | j2)) | (~(j | longValue8)) | j25) * 717) + (((~(longValue8 | j2)) | (~(j26 | j)) | j25) * 717) + 965673462;
                                                    int i24 = ~((-43403879) | i4);
                                                    long j28 = (((int) (j27 >> 32)) & ((((~((-2085134354) | i3)) | 1480630289 | i24) * (-470)) + 1548760288 + ((i24 | (~((-604504065) | i3))) * 470))) | (((int) j27) & ((((~(350947524 | i3)) | (-1788173935)) * 56) + 858099341 + (((~((-1788173935) | i4)) | 350947524) * 56)));
                                                    if (j4 <= 0 && j28 > 0 && j28 + 100 < j4) {
                                                        java.lang.Object[] objArr91 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                                                        java.lang.Object[] objArr92 = {522072123, 16, java.lang.Integer.valueOf((((~((-33312711) | i4)) | (~((-676012810) | i3))) * 1900) + 1159947941 + (((~(676012809 | i4)) | (~(33312710 | i3))) * (-950)) + (((~(676012809 | i3)) | (~(33312710 | i4))) * 950))};
                                                        java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj23 == null) {
                                                            java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2713, (char) ((-1) - android.os.Process.getGidForName(str4)));
                                                            byte b5 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                            a(653, b5, b5, objArr93);
                                                            obj23 = cls21.getMethod((java.lang.String) objArr93[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj23);
                                                        }
                                                        ((int[]) objArr91[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr92)).intValue();
                                                        return objArr91;
                                                    }
                                                    java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                    c("\ufffe\r\f\u0012\f\uffc8\u0006", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 6 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), true, android.widget.ExpandableListView.getPackedPositionChild(0L) + 8, objArr94);
                                                    java.lang.String intern30 = ((java.lang.String) objArr94[0]).intern();
                                                    java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 11, 0, 10}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001", true, objArr95);
                                                    java.lang.String intern31 = ((java.lang.String) objArr95[0]).intern();
                                                    java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                    c("\u0010\u0011\u0002\nￌ\u0010\uffff\u0006\u000bￌ\u0010\u0016", android.os.Process.getGidForName(str4) + 121, 9 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), false, 13 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr96);
                                                    java.lang.String intern32 = ((java.lang.String) objArr96[0]).intern();
                                                    str5 = str4;
                                                    java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                    c("\u0001\u0010\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014ￋ\t", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 120, 6 - android.text.TextUtils.getOffsetBefore(str5, 0), true, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, objArr97);
                                                    java.lang.String intern33 = ((java.lang.String) objArr97[0]).intern();
                                                    java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, 11, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false, objArr98);
                                                    java.lang.String intern34 = ((java.lang.String) objArr98[0]).intern();
                                                    java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                    c("\u0003\n\u000f\uffd0\u0014", 116 - android.graphics.Color.argb(0, 0, 0, 0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 3, false, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 5, objArr99);
                                                    java.lang.String intern35 = ((java.lang.String) objArr99[0]).intern();
                                                    java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                    c("\u000bￕ\t\u001a", android.text.TextUtils.indexOf(str5, str5, 0, 0) + 111, 1 - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), true, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, objArr100);
                                                    strArr = new java.lang.String[]{intern30, intern31, intern32, intern33, intern34, intern35, ((java.lang.String) objArr100[0]).intern()};
                                                    i5 = 0;
                                                    while (true) {
                                                        if (i5 < 7) {
                                                            str6 = str5;
                                                            i6 = 0;
                                                            break;
                                                        }
                                                        java.lang.Object[] objArr101 = {strArr[i5]};
                                                        java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                                                        if (obj24 == null) {
                                                            java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777189) - android.graphics.Color.rgb(0, 0, 0), android.text.TextUtils.indexOf(str5, str5) + 1672, (char) (47940 - android.view.View.resolveSize(0, 0)));
                                                            byte[] bArr15 = $$a;
                                                            short s16 = (short) (bArr15[14] - 1);
                                                            java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                            a(s16, (byte) s16, (byte) (-bArr15[16]), objArr102);
                                                            obj24 = cls22.getMethod((java.lang.String) objArr102[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj24);
                                                        }
                                                        long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr101)).longValue();
                                                        long j29 = ~(490488888 | longValue9);
                                                        long j30 = (~longValue9) | (-490488889);
                                                        i10 = i5;
                                                        strArr2 = strArr;
                                                        str6 = str5;
                                                        long j31 = (((((1435 * longValue9) - 351190043808L) + ((longValue9 | (-490488889)) * (-1434))) + (((~(j30 | j2)) | ((~(j | longValue9)) | j29)) * 717)) + (((~(longValue9 | j2)) | ((~(j30 | j)) | j29)) * 717)) - 2116019070;
                                                        if (((((int) (j31 >> 32)) & ((((~((-277495810) | i3)) * (-301)) - 1924937504) + (((~(428491331 | i3)) | (~(1865717742 | i4))) * (-301)) + (((~((-1865717743) | i3)) | 428491331) * 301))) | (((int) j31) & ((((-285737985) | i3) * (-676)) + 1182003257 + (((~(1856492371 | i4)) | 285737984) * 676) + (((~((-1001248515) | i4)) | 715510530 | (~(2142230355 | i3))) * 676)))) != 0) {
                                                            i6 = i10 + 90;
                                                            break;
                                                        }
                                                        i5 = i10 + 1;
                                                        strArr = strArr2;
                                                        str5 = str6;
                                                    }
                                                    if (i6 == 0) {
                                                        java.lang.Object[] objArr103 = {new int[]{i3}, new int[]{i6 ^ i3}, null, new int[1]};
                                                        java.lang.Object[] objArr104 = {522072123, 16, java.lang.Integer.valueOf(((((~(850584217 | i3)) | 141258697) * (-668)) - 1928292497) + (((~(141258697 | i3)) | 850584217) * 1336) + ((989589465 | i3) * 668))};
                                                        java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj25 == null) {
                                                            java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2713 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                                                            byte b6 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                            a(653, b6, b6, objArr105);
                                                            obj25 = cls23.getMethod((java.lang.String) objArr105[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj25);
                                                        }
                                                        ((int[]) objArr103[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr104)).intValue();
                                                        return objArr103;
                                                    }
                                                    try {
                                                        str7 = str6;
                                                        try {
                                                            java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                            c("\u0010\f\u0005ￋ\u0001\t\u0006\u0012\uffffￋ\f\u000f\u0011", android.view.Gravity.getAbsoluteGravity(0, 0) + 120, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11, true, 12 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr106);
                                                            try {
                                                                java.lang.Object[] objArr107 = {((java.lang.String) objArr106[0]).intern()};
                                                                java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                                if (obj26 == null) {
                                                                    java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('X' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 1920 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.text.TextUtils.getOffsetAfter(str7, 0));
                                                                    byte[] bArr16 = $$a;
                                                                    short s17 = (short) (bArr16[14] - 1);
                                                                    java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                                    a(s17, (byte) s17, (byte) (-bArr16[16]), objArr108);
                                                                    obj26 = cls24.getMethod((java.lang.String) objArr108[0], java.lang.String.class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj26);
                                                                }
                                                                str8 = (java.lang.String) ((java.lang.reflect.Method) obj26).invoke(null, objArr107);
                                                            } catch (java.lang.Throwable th) {
                                                                java.lang.Throwable cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw cause;
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (java.lang.Exception unused) {
                                                        }
                                                    } catch (java.lang.Exception unused2) {
                                                        str7 = str6;
                                                    }
                                                    try {
                                                        if (str8 != null) {
                                                            java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                            b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 11, 81, 0}, "\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001", false, objArr109);
                                                            java.lang.String[] strArr7 = {((java.lang.String) objArr109[0]).intern()};
                                                            for (int i25 = 0; i25 <= 0; i25++) {
                                                                if (!str8.contains(strArr7[i25])) {
                                                                }
                                                            }
                                                            i7 = 0;
                                                            if (i7 != 0) {
                                                                java.lang.Object[] objArr110 = {new int[]{i3}, new int[]{i7 ^ i3}, null, new int[1]};
                                                                java.lang.Object[] objArr111 = {522072123, 16, java.lang.Integer.valueOf(((~((-553910286) | i4)) * (-783)) + 1448102465 + (((~(83061090 | i4)) | (-626264430)) * 783))};
                                                                java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj27 == null) {
                                                                    java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str7, str7, 0) + 50, 2713 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                                    byte b7 = (byte) ($$a[14] - 1);
                                                                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                    a(653, b7, b7, objArr112);
                                                                    obj27 = cls25.getMethod((java.lang.String) objArr112[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj27);
                                                                }
                                                                ((int[]) objArr110[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj27).invoke(null, objArr111)).intValue();
                                                                return objArr110;
                                                            }
                                                            java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                            c("\u0010\f\u0005ￋ\u0001\t\u0006\u0012\uffffￋ\f\u000f\u0011", 120 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 12 - android.view.View.MeasureSpec.getMode(0), true, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12, objArr113);
                                                            java.lang.Object[] objArr114 = {((java.lang.String) objArr113[0]).intern()};
                                                            java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                            if (obj28 == null) {
                                                                java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 1921 - android.view.View.getDefaultSize(0, 0), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                                byte[] bArr17 = $$a;
                                                                short s18 = (short) (bArr17[14] - 1);
                                                                java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                a(s18, (byte) s18, (byte) (-bArr17[16]), objArr115);
                                                                obj28 = cls26.getMethod((java.lang.String) objArr115[0], java.lang.String.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj28);
                                                            }
                                                            java.lang.String str13 = (java.lang.String) ((java.lang.reflect.Method) obj28).invoke(null, objArr114);
                                                            if (str13 != null) {
                                                                java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 11, 81, 0}, "\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001", false, objArr116);
                                                                java.lang.String[] strArr8 = {((java.lang.String) objArr116[0]).intern()};
                                                                int i26 = 0;
                                                                while (true) {
                                                                    if (i26 > 0) {
                                                                        java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                                        c("\u0016\n\b\u0013ￖￖ\u000b\b\u001b\bￖ\u0013", (-16777106) - android.graphics.Color.rgb(0, 0, 0), 5 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), false, 12 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr117);
                                                                        java.lang.String intern36 = ((java.lang.String) objArr117[0]).intern();
                                                                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                        c("ￖ\u000b\b\u001b\bￖ\u0013\u0016\n\b\u0013ￖ\t\u0010\u0015ￖ", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 109, 16 - android.text.TextUtils.indexOf(str7, str7, 0, 0), false, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15, objArr118);
                                                                        java.lang.String intern37 = ((java.lang.String) objArr118[0]).intern();
                                                                        java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                        b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, 17, 59, 0}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", true, objArr119);
                                                                        java.lang.String intern38 = ((java.lang.String) objArr119[0]).intern();
                                                                        java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                                        b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 6, 197, 5}, null, true, objArr120);
                                                                        java.lang.String intern39 = ((java.lang.String) objArr120[0]).intern();
                                                                        java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                        c("\u000f\u0007\u0016\u0015\u001b\u0015\uffd1\uffd1\u0010\u000b\u0004\uffd1", (-16777101) - android.graphics.Color.rgb(0, 0, 0), 7 - android.widget.ExpandableListView.getPackedPositionGroup(0L), true, 11 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr121);
                                                                        java.lang.String intern40 = ((java.lang.String) objArr121[0]).intern();
                                                                        java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                        c("\u000e\u0007ￔ\u0012\n\u0019\u0018\u001e\u0018ￔￔ\u0019\u001d\nￓￔ\u0013", android.widget.ExpandableListView.getPackedPositionType(0L) + 112, android.widget.ExpandableListView.getPackedPositionChild(0L) + 11, true, android.view.View.MeasureSpec.getSize(0) + 17, objArr122);
                                                                        java.lang.String intern41 = ((java.lang.String) objArr122[0]).intern();
                                                                        java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                        c("\u0003\uffd0\u000e\u0006\u0015\u0014\u001a\u0014\uffd0\uffd0\u0006\u0007\u0002\u0014\r\n\u0002\u0007\uffd0\u000f\n", 116 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 10 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), true, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 21, objArr123);
                                                                        java.lang.String intern42 = ((java.lang.String) objArr123[0]).intern();
                                                                        java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                        b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, 16, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true, objArr124);
                                                                        java.lang.String intern43 = ((java.lang.String) objArr124[0]).intern();
                                                                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                        c("\u0010\u0010\u0013ￎ\u0005\u0006\u0006\u000fￎ\u0006\u0018\uffd0\u0013\u0014\u0016\uffd0\u000e\u0006\u0015\u0014\u001a\u0014\uffd0\uffd0\u0015", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 117, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 23, true, android.text.TextUtils.indexOf(str7, str7, 0, 0) + 25, objArr125);
                                                                        java.lang.String intern44 = ((java.lang.String) objArr125[0]).intern();
                                                                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                        c("\u0013\u0019\u0013\u0014\u0005\rￏ\u0018\u0002\t\u000eￏￏ", 118 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 12 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), false, 13 - android.graphics.Color.alpha(0), objArr126);
                                                                        java.lang.String intern45 = ((java.lang.String) objArr126[0]).intern();
                                                                        java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                        b(new int[]{300, 9, 0, 2}, "\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001", false, objArr127);
                                                                        java.lang.String intern46 = ((java.lang.String) objArr127[0]).intern();
                                                                        java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                                        b(new int[]{309, 8, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000", true, objArr128);
                                                                        java.lang.String[] strArr9 = {intern36, intern37, intern38, intern39, intern40, intern41, intern42, intern43, intern44, intern45, intern46, ((java.lang.String) objArr128[0]).intern()};
                                                                        for (int i27 = 0; i27 < 12; i27++) {
                                                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                            sb.append(strArr9[i27]);
                                                                            java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                                            c("\uffff\u0001", 136 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), true, 3 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr129);
                                                                            sb.append(((java.lang.String) objArr129[0]).intern());
                                                                            java.lang.Object[] objArr130 = {sb.toString()};
                                                                            java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                                                            if (obj29 == null) {
                                                                                java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString(str7) + 37, 3162 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 33100));
                                                                                byte[] bArr18 = $$a;
                                                                                short s19 = (short) (bArr18[14] - 1);
                                                                                java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                                                a(s19, (byte) s19, (byte) (-bArr18[16]), objArr131);
                                                                                obj29 = cls27.getMethod((java.lang.String) objArr131[0], java.lang.String.class);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj29);
                                                                            }
                                                                            long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr130)).longValue();
                                                                            long j32 = ((((((-782) * longValue10) - 410159540336L) + ((~longValue10) * (-783))) + ((~((j | 523162678) | longValue10)) * (-783))) + (((~(j | longValue10)) | 523162678) * 783)) - 814505429;
                                                                            if (((((int) (j32 >> 32)) & (((~((-270532619) | i4)) * (-783)) + 1436534927 + (((~((-444220704) | i4)) | (-1881447115)) * 783))) | (((int) j32) & ((((~((-416356867) | i3)) | (-1020869544)) * (-756)) + 1112690449 + (((-416356867) | i4) * 756)))) != 0) {
                                                                                i8 = i27 + 110;
                                                                                break;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (str13.contains(strArr8[i26])) {
                                                                            break;
                                                                        }
                                                                        i26++;
                                                                    }
                                                                }
                                                            }
                                                            i8 = 0;
                                                            if (i8 != 0) {
                                                                java.lang.Object[] objArr132 = {new int[]{i3}, new int[]{i8 ^ i3}, null, new int[1]};
                                                                java.lang.Object[] objArr133 = {522072123, 16, java.lang.Integer.valueOf((((~((-313402359) | i4)) | (-395923162) | (~(313402358 | i3))) * (-564)) + 1412232883 + ((~((-85019658) | i3)) * 1128) + (((~((-395923162) | i4)) | (-398422016)) * 564))};
                                                                java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj30 == null) {
                                                                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2, 2713 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                                                                    byte b8 = (byte) ($$a[14] - 1);
                                                                    java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                                    a(653, b8, b8, objArr134);
                                                                    obj30 = cls28.getMethod((java.lang.String) objArr134[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj30);
                                                                }
                                                                ((int[]) objArr132[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr133)).intValue();
                                                                return objArr132;
                                                            }
                                                            long[] jArr = {472001035};
                                                            java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                            b(new int[]{317, 17, 61, 15}, null, true, objArr135);
                                                            java.lang.Object[] objArr136 = {((java.lang.String) objArr135[0]).intern(), 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr};
                                                            java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                            if (obj31 == null) {
                                                                java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str7, str7) + 37, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3096, (char) (android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                                                byte[] bArr19 = $$a;
                                                                short s20 = (short) (bArr19[14] - 1);
                                                                java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                                a(s20, (byte) s20, (byte) (-bArr19[16]), objArr137);
                                                                obj31 = cls29.getMethod((java.lang.String) objArr137[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj31);
                                                            }
                                                            long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj31).invoke(null, objArr136)).longValue();
                                                            long j33 = j | 891882587;
                                                            long j34 = (((((370 * longValue11) - 329996557560L) + (((longValue11 | (-891882588)) | j) * (-369))) + (((~j33) | longValue11) * (-369))) + ((((~((~longValue11) | (-891882588))) | (~(j2 | (-891882588)))) | (~(j33 | longValue11))) * 369)) - 1018765322;
                                                            if (((((int) (j34 >> 32)) & ((((~((-1081691734) | i3)) | 1776049151) * (-668)) + 163264122 + (((~(1776049151 | i3)) | (-1081691734)) * 1336) + (((-2163713) | i3) * 668))) | (((int) j34) & ((((((-1235583522) | i4) * 1444) + 1153123995) + ((((~((-1317202405) | i3)) | 100821444) | (~((-120024006) | i3))) * (-1444))) - 1261895406))) != 0) {
                                                                i9 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                                                            } else {
                                                                valueOf = (writeReplace + 105) % 128;
                                                                i9 = 0;
                                                            }
                                                            if (i9 != 0) {
                                                                java.lang.Object[] objArr138 = {new int[]{i3}, new int[]{i9 ^ i3}, null, new int[1]};
                                                                java.lang.Object[] objArr139 = {522072123, 16, java.lang.Integer.valueOf((((~((-250057058) | i3)) | (~(459268462 | i4))) * (-1808)) + 560776423 + (((~((-172458337) | i3)) | (~(536867183 | i4))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~((-459268463) | i3)) | 77598721 | (~(250057057 | i4))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))};
                                                                java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj32 == null) {
                                                                    java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 50, android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                                    byte b9 = (byte) ($$a[14] - 1);
                                                                    java.lang.Object[] objArr140 = new java.lang.Object[1];
                                                                    a(653, b9, b9, objArr140);
                                                                    obj32 = cls30.getMethod((java.lang.String) objArr140[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj32);
                                                                }
                                                                ((int[]) objArr138[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr139)).intValue();
                                                                return objArr138;
                                                            }
                                                            long[] jArr2 = {472001035};
                                                            java.lang.Object[] objArr141 = new java.lang.Object[1];
                                                            c("\u0010\u0016\u0010ￌ\u0016\u0000\u0006\t\f\rￌ\u0015\u0012\u000b\u0006\t\u0002\u0010ￌ\u0010\u0003ￌ", 120 - android.graphics.Color.blue(0), 4 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), true, android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 23, objArr141);
                                                            java.lang.Object[] objArr142 = {((java.lang.String) objArr141[0]).intern(), 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr2};
                                                            java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                            if (obj33 == null) {
                                                                java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 11, android.text.TextUtils.indexOf(str7, str7, 0, 0) + 3096, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                                byte[] bArr20 = $$a;
                                                                short s21 = (short) (bArr20[14] - 1);
                                                                java.lang.Object[] objArr143 = new java.lang.Object[1];
                                                                a(s21, (byte) s21, (byte) (-bArr20[16]), objArr143);
                                                                obj33 = cls31.getMethod((java.lang.String) objArr143[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj33);
                                                            }
                                                            long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj33).invoke(null, objArr142)).longValue();
                                                            long j35 = ~longValue12;
                                                            long j36 = j | (-1805045963);
                                                            long j37 = ((((((-903) * longValue12) - 1633566596515L) + (((~(j | longValue12)) | (~(j2 | 1805045962))) * (-1808))) + (((~((1805045962 | j35) | j2)) | (~(j36 | longValue12))) * 904)) + ((((~(1805045962 | longValue12)) | (~(j35 | j2))) | (~j36)) * 904)) - 105601947;
                                                            int i28 = ~(1846077566 | i4);
                                                            if (((((int) j37) & ((((((~((-1078876455) | i4)) | (-1778864432)) | (~(1078876454 | i3))) * (-564)) - 1093454207) + ((~((-704708618) | i3)) * 1128) + (((~((-1778864432) | i4)) | (-1783585072)) * 564))) | (((int) (j37 >> 32)) & (((((~((-408851156) | i4)) | 134774866) * (-1188)) - 1120458282) + (((~(408851155 | i3)) | 134774866 | i28) * 594) + ((i28 | (~(408851155 | i4)) | (-2120153856)) * 594)))) != 0) {
                                                                java.lang.Object[] objArr144 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, null, new int[1]};
                                                                java.lang.Object[] objArr145 = {522072123, 16, java.lang.Integer.valueOf(((((-94371880) | i4) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 1198723577) + (((~(441843672 | i4)) | (-363105584)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))};
                                                                java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj34 == null) {
                                                                    java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.getDefaultSize(0, 0), 2713 - android.graphics.Color.green(0), (char) android.view.View.getDefaultSize(0, 0));
                                                                    byte b10 = (byte) ($$a[14] - 1);
                                                                    java.lang.Object[] objArr146 = new java.lang.Object[1];
                                                                    a(653, b10, b10, objArr146);
                                                                    obj34 = cls32.getMethod((java.lang.String) objArr146[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj34);
                                                                }
                                                                ((int[]) objArr144[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr145)).intValue();
                                                                return objArr144;
                                                            }
                                                            java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(724989957);
                                                            if (obj35 == null) {
                                                                java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 31, 1890 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 3601));
                                                                byte[] bArr21 = $$a;
                                                                short s22 = (short) (bArr21[14] - 1);
                                                                java.lang.Object[] objArr147 = new java.lang.Object[1];
                                                                a(s22, (byte) s22, (byte) (-bArr21[16]), objArr147);
                                                                obj35 = cls33.getMethod((java.lang.String) objArr147[0], null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(724989957, obj35);
                                                            }
                                                            long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj35).invoke(null, null)).longValue();
                                                            long j38 = ~(j2 | 1360263695);
                                                            long j39 = ~longValue13;
                                                            long j40 = ((((((-139) * longValue13) - 191797181136L) + (((~(longValue13 | 1360263695)) | j38) * (-280))) + (((~(j39 | j2)) | j38) * 140)) + (((~((j39 | j) | (-1360263696))) | ((~(longValue13 | (j | 1360263695))) | (~((1360263695 | j39) | j2)))) * 140)) - 518984684;
                                                            int i29 = ~(1518348771 | i4);
                                                            if (((((int) j40) & ((((~((-14568339) | i4)) | (~(1451794748 | i3)) | (~((-1451794749) | i4))) * 959) + 1729401110 + (((~((-14568339) | i3)) | (~(1451794748 | i4)) | (~((-1451794749) | i3))) * 959))) | (((int) (j40 >> 32)) & ((((~((-1518348772) | i3)) | (~((-81122361) | i4)) | i29) * (-516)) + 2130609690 + (((~((-1509960132) | i3)) | (~(1591082491 | i4))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((i29 | (-1591082492)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)))) != 0) {
                                                                valueOf = (writeReplace + 9) % 128;
                                                                java.lang.Object[] objArr148 = {new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i9}, null, new int[1]};
                                                                java.lang.Object[] objArr149 = {522072123, 16, java.lang.Integer.valueOf((((~((-706656129) | i4)) | (~((-2669392) | i4))) * (-867)) + 1514227164 + (((~((-706656129) | i3)) | 570112 | (~((-2669392) | i3))) * (-1734)) + (((~((-570113) | i4)) | (~((-706086017) | i3)) | (~(i3 | (-2099280)))) * 867))};
                                                                java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj36 == null) {
                                                                    java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str7, str7, 0), 2713 - android.view.View.MeasureSpec.getMode(0), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                                    byte b11 = (byte) ($$a[14] - 1);
                                                                    java.lang.Object[] objArr150 = new java.lang.Object[1];
                                                                    a(653, b11, b11, objArr150);
                                                                    obj36 = cls34.getMethod((java.lang.String) objArr150[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                                                                }
                                                                ((int[]) objArr148[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr149)).intValue();
                                                                return objArr148;
                                                            }
                                                            java.lang.Object[] objArr151 = {2};
                                                            java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                                            if (obj37 == null) {
                                                                java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 27, android.text.TextUtils.getOffsetBefore(str7, 0) + 2364, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                                                byte[] bArr22 = $$a;
                                                                short s23 = (short) (bArr22[14] - 1);
                                                                java.lang.Object[] objArr152 = new java.lang.Object[1];
                                                                a(s23, (byte) s23, (byte) (-bArr22[16]), objArr152);
                                                                obj37 = cls35.getMethod((java.lang.String) objArr152[0], java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj37);
                                                            }
                                                            long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj37).invoke(null, objArr151)).longValue();
                                                            long j41 = ~longValue14;
                                                            long j42 = ~(longValue14 | j2);
                                                            long j43 = (((-195) * longValue14) - 24924872116L) + (((~(j41 | 63746476)) | j42) * (-196)) + ((63746476 | longValue14) * 392) + (((~((-63746477) | j41)) | j42) * 196) + 1344163723;
                                                            if (((((int) j43) & (((((~((-56110974) | i4)) | (~((-1493337384) | i3))) * com.visa.cbp.getCertUsage.getODAData) - 2007453439) + (((~((-56110974) | i3)) | (~((-1493337384) | i4))) * com.visa.cbp.getCertUsage.getODAData))) | (((int) (j43 >> 32)) & (((((~((-3447345) | i3)) | (~(1433779066 | i3))) * 69) - 1557246308) + (((~((-1412742011) | i3)) | 1409294666 | (~(24484400 | i3))) * (-69)) + 1451556864))) == 2) {
                                                                writeReplace = (valueOf + 89) % 128;
                                                                java.lang.Object[] objArr153 = {new int[]{i3}, new int[]{i3 ^ 270}, null, new int[1]};
                                                                java.lang.Object[] objArr154 = {522072123, 16, java.lang.Integer.valueOf((((~((-71874561) | i4)) | (~((-537264848) | i3)) | (~((-28311553) | i3))) * 765) + 1400971689 + (((~((-609139408) | i4)) | 71874560) * 1530) + (((~((-609139408) | i3)) | (~((-28311553) | i4))) * 765))};
                                                                java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj38 == null) {
                                                                    java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.MotionEvent.axisFromString(str7), 2713 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                                                    byte b12 = (byte) ($$a[14] - 1);
                                                                    java.lang.Object[] objArr155 = new java.lang.Object[1];
                                                                    a(653, b12, b12, objArr155);
                                                                    obj38 = cls36.getMethod((java.lang.String) objArr155[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                                                                }
                                                                ((int[]) objArr153[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr154)).intValue();
                                                                return objArr153;
                                                            }
                                                            java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1411285061);
                                                            if (obj39 == null) {
                                                                java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 3196 - android.os.Process.getGidForName(str7), (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216));
                                                                byte[] bArr23 = $$a;
                                                                java.lang.Object[] objArr156 = new java.lang.Object[1];
                                                                a(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, bArr23[14], bArr23[21], objArr156);
                                                                obj39 = cls37.getMethod((java.lang.String) objArr156[0], null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1411285061, obj39);
                                                            }
                                                            long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj39).invoke(null, null)).longValue();
                                                            long j44 = ~longValue15;
                                                            long j45 = ~(j | longValue15);
                                                            long j46 = (971 * longValue15) + 2565330422543L + (((~(j44 | (-1323017237))) | j45) * (-970)) + ((~(longValue15 | 1323017236)) * 1940) + (((~(1323017236 | j44)) | j45) * 970) + 1419262598;
                                                            if (((((int) (j46 >> 32)) & ((((~(1996468223 | i4)) | (~((-274344610) | i3))) * (-302)) + 907328110 + ((~(1996468223 | i3)) * (-604)) + (((~(1722123614 | i3)) | 10552594) * 302))) | (((int) j46) & (((((~(1950266723 | i4)) | 176179864) * (-241)) - 1506541732) + (((~(2126446587 | i4)) | 336860449) * 241)))) != 0) {
                                                                java.lang.Object[] objArr157 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, null, new int[1]};
                                                                java.lang.Object[] objArr158 = {522072123, 16, java.lang.Integer.valueOf(((~((-11567237) | i4)) * 433) + 1066380838 + (((~((-424508716) | i3)) | (-284816805)) * (-433)) + (((~((-284816805) | i3)) | (-436075952)) * 433))};
                                                                java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj40 == null) {
                                                                    java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, 2714 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                                    byte b13 = (byte) ($$a[14] - 1);
                                                                    java.lang.Object[] objArr159 = new java.lang.Object[1];
                                                                    a(653, b13, b13, objArr159);
                                                                    obj40 = cls38.getMethod((java.lang.String) objArr159[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj40);
                                                                }
                                                                ((int[]) objArr157[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr158)).intValue();
                                                                return objArr157;
                                                            }
                                                            java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(502613909);
                                                            if (obj41 == null) {
                                                                java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3197, (char) android.view.View.MeasureSpec.getSize(0));
                                                                byte[] bArr24 = $$a;
                                                                short s24 = (short) (bArr24[14] - 1);
                                                                java.lang.Object[] objArr160 = new java.lang.Object[1];
                                                                a(s24, (byte) s24, (byte) (-bArr24[16]), objArr160);
                                                                obj41 = cls39.getMethod((java.lang.String) objArr160[0], null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(502613909, obj41);
                                                            }
                                                            long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj41).invoke(null, null)).longValue();
                                                            long j47 = ~((~longValue16) | (-1127128283));
                                                            long j48 = (522 * longValue16) + 586106707160L + ((~(1127128282 | longValue16 | j2)) * 521) + ((-1042) * j47) + (((~(longValue16 | j | 1127128282)) | j47) * 521) + 2079998173;
                                                            int i30 = ~((-297337540) | i3);
                                                            if (((((int) (j48 >> 32)) & ((((((~(297337539 | i3)) | 1715623980) | (~((-1734563951) | i3))) * (-880)) - 818885110) + (((~(297337539 | i4)) | 1734563950 | i30) * (-880)) + (i30 * 880))) | (((int) j48) & ((((~((-144443384) | i3)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 502019079) + (((~((-144443384) | i4)) | (-1302220792)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING)))) != 0) {
                                                                java.lang.Object[] objArr161 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, null, new int[1]};
                                                                java.lang.Object[] objArr162 = {522072123, 16, java.lang.Integer.valueOf(((((~((-85331180) | i4)) | 623994340) * 226) - 2135046800) + (((~((-623994341) | i3)) | 539058436 | (~((-395276) | i4))) * (-113)) + ((~(i3 | (-85331180))) * 113))};
                                                                java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj42 == null) {
                                                                    java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2714, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                                    byte b14 = (byte) ($$a[14] - 1);
                                                                    java.lang.Object[] objArr163 = new java.lang.Object[1];
                                                                    a(653, b14, b14, objArr163);
                                                                    obj42 = cls40.getMethod((java.lang.String) objArr163[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj42);
                                                                }
                                                                ((int[]) objArr161[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj42).invoke(null, objArr162)).intValue();
                                                                return objArr161;
                                                            }
                                                            java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1293945309);
                                                            if (obj43 == null) {
                                                                java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.text.TextUtils.getOffsetBefore(str7, 0), 2835 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                                                byte[] bArr25 = $$a;
                                                                short s25 = (short) (bArr25[14] - 1);
                                                                java.lang.Object[] objArr164 = new java.lang.Object[1];
                                                                a(s25, (byte) s25, (byte) (-bArr25[16]), objArr164);
                                                                obj43 = cls41.getMethod((java.lang.String) objArr164[0], null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1293945309, obj43);
                                                            }
                                                            long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj43).invoke(null, null)).longValue();
                                                            long j49 = ~longValue17;
                                                            long j50 = (-1265929825) | j49;
                                                            int i31 = i4;
                                                            long j51 = ((((((-167) * longValue17) - 211410280608L) + (((~j50) | (~(j49 | j))) * 168)) + ((~(j50 | j2)) * 168)) + ((((~(longValue17 | (-1265929825))) | (~(j | (-1265929825)))) | (~((1265929824 | j49) | j2))) * 168)) - 2072224579;
                                                            if (((((int) (j51 >> 32)) & ((((((~(2063749747 | i31)) | 72723592) | (~((-1509950004) | i3))) * 717) - 1523522865) + (((~(2063749747 | i3)) | (~((-1509950004) | i31)) | 72723592) * 717))) | (((int) j51) & ((((~(1335476071 | i3)) | (~((-101750339) | i3))) * 69) + 2012836036 + (((~(102276675 | i3)) | 1233199396 | (~((-1334949735) | i3))) * (-69)) + 36317253))) != 0) {
                                                                java.lang.Object[] objArr165 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                                java.lang.Object[] objArr166 = {522072123, 16, java.lang.Integer.valueOf((((178292992 | i31) * 1324) - 712732795) + (((~(245549453 | i3)) | (~(i3 | 463776066))) * (-1324)) + 1585338186)};
                                                                java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj44 == null) {
                                                                    java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) android.text.TextUtils.getCapsMode(str7, 0, 0));
                                                                    byte b15 = (byte) ($$a[14] - 1);
                                                                    java.lang.Object[] objArr167 = new java.lang.Object[1];
                                                                    a(653, b15, b15, objArr167);
                                                                    obj44 = cls42.getMethod((java.lang.String) objArr167[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj44);
                                                                }
                                                                ((int[]) objArr165[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj44).invoke(null, objArr166)).intValue();
                                                                return objArr165;
                                                            }
                                                            long[] jArr3 = {624887784092251L};
                                                            java.lang.Object[] objArr168 = new java.lang.Object[1];
                                                            b(new int[]{317, 17, 61, 15}, null, true, objArr168);
                                                            java.lang.Object[] objArr169 = {((java.lang.String) objArr168[0]).intern(), 3, 2251799813685247L, jArr3};
                                                            java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                            if (obj45 == null) {
                                                                java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 3096 - android.view.KeyEvent.keyCodeFromString(str7), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                                                byte[] bArr26 = $$a;
                                                                short s26 = (short) (bArr26[14] - 1);
                                                                java.lang.Object[] objArr170 = new java.lang.Object[1];
                                                                a(s26, (byte) s26, (byte) (-bArr26[16]), objArr170);
                                                                obj45 = cls43.getMethod((java.lang.String) objArr170[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj45);
                                                            }
                                                            long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj45).invoke(null, objArr169)).longValue();
                                                            long j52 = ~longValue18;
                                                            long j53 = (((((319 * longValue18) + 69411078581L) + (((~(longValue18 | (j | (-218962393)))) | (~((218962392 | j52) | j2))) * (-318))) + (((~((-218962393) | j52)) | (~(j2 | (-218962393)))) * (-318))) + (((~(j2 | 218962392)) | j52) * 318)) - 1691685517;
                                                            if (((((int) (j53 >> 32)) & (((((-8912983) | i31) * (-369)) - 802173004) + (((~((-2117492514) | i31)) | (-680266103)) * (-369)) + (((~(2117492513 | i3)) | (-2126405496) | (~((-671353121) | i31))) * 369))) | (((int) j53) & (((~((-134479878) | i3)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 1683827176 + (((~((-134479878) | i31)) | (-1574874048)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)))) != 0) {
                                                                int i32 = valueOf;
                                                                writeReplace = (i32 + 11) % 128;
                                                                writeReplace = (i32 + 87) % 128;
                                                                java.lang.Object[] objArr171 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, null, new int[1]};
                                                                java.lang.Object[] objArr172 = {522072123, 16, java.lang.Integer.valueOf((((~((-67502341) | i3)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) - 1787684312) + (((~((-67502341) | i31)) | 3239979) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                                                                java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj46 == null) {
                                                                    java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.argb(0, 0, 0, 0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2713, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                                    byte b16 = (byte) ($$a[14] - 1);
                                                                    java.lang.Object[] objArr173 = new java.lang.Object[1];
                                                                    a(653, b16, b16, objArr173);
                                                                    obj46 = cls44.getMethod((java.lang.String) objArr173[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj46);
                                                                }
                                                                ((int[]) objArr171[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj46).invoke(null, objArr172)).intValue();
                                                                return objArr171;
                                                            }
                                                            java.lang.Object[] objArr174 = new java.lang.Object[1];
                                                            c("\u0011\u0007\u0005\u0017\u0018ￍ\u0014\u0003\u0002ￍ\t", 119 - android.view.View.MeasureSpec.getSize(0), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 10, true, 10 - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr174);
                                                            java.lang.Object[] objArr175 = {((java.lang.String) objArr174[0]).intern()};
                                                            java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                                            if (obj47 == null) {
                                                                java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 3160 - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 33099));
                                                                java.lang.Object[] objArr176 = new java.lang.Object[1];
                                                                a(618, r4[14], (byte) (-$$a[16]), objArr176);
                                                                obj47 = cls45.getMethod((java.lang.String) objArr176[0], java.lang.String.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj47);
                                                            }
                                                            long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) obj47).invoke(null, objArr175)).longValue();
                                                            long j54 = ~(longValue19 | j2);
                                                            long j55 = (111 * longValue19) + 98578542918L + ((904390301 | j54) * (-220)) + ((j54 | (~((-904390302) | longValue19))) * 220) + (((~((~longValue19) | (-904390302))) | (~(904390301 | longValue19))) * 110) + 1811861040;
                                                            if (((((int) (j55 >> 32)) & ((((16910352 | r2) * (-280)) - 1812680086) + (((~(1425138082 | i3)) | (~(1432602802 | i3))) * 140) + (((~(1442048434 | i3)) | (~((-16910353) | i31)) | (~((-9445633) | i31))) * 140))) | (((int) j55) & (((((~((-1870184495) | i31)) | (~((-987556392) | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1394765881) + (((~((-277096962) | i31)) | (~((-1159725065) | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)))) != 0) {
                                                                java.lang.Object[] objArr177 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                                int i33 = ~(436136639 | i3);
                                                                java.lang.Object[] objArr178 = {522072123, 16, java.lang.Integer.valueOf((((~((-427469365) | i31)) | 273188880 | i33) * (-252)) + 833446543 + ((i33 | (~((-154280485) | i31))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))};
                                                                java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj48 == null) {
                                                                    java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 2713 - android.view.View.MeasureSpec.getSize(0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                                                    byte b17 = (byte) ($$a[14] - 1);
                                                                    java.lang.Object[] objArr179 = new java.lang.Object[1];
                                                                    a(653, b17, b17, objArr179);
                                                                    obj48 = cls46.getMethod((java.lang.String) objArr179[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj48);
                                                                }
                                                                ((int[]) objArr177[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj48).invoke(null, objArr178)).intValue();
                                                                return objArr177;
                                                            }
                                                            java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                                                            if (obj49 == null) {
                                                                java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28, 2185 - (android.os.Process.myTid() >> 22), (char) (android.view.View.resolveSize(0, 0) + 59513));
                                                                byte[] bArr27 = $$a;
                                                                short s27 = (short) (bArr27[14] - 1);
                                                                java.lang.Object[] objArr180 = new java.lang.Object[1];
                                                                a(s27, (byte) s27, (byte) (-bArr27[16]), objArr180);
                                                                obj49 = cls47.getMethod((java.lang.String) objArr180[0], null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj49);
                                                            }
                                                            long j56 = ~((java.lang.Long) ((java.lang.reflect.Method) obj49).invoke(null, null)).longValue();
                                                            long j57 = (((((r1 * (-1917)) - 211228660800L) + (((~(j56 | j)) | (~(j2 | (-220029855)))) * 959)) + ((-959) * j56)) + (((~(j56 | j2)) | (~(j | (-220029855)))) * 959)) - 652060731;
                                                            if (((((int) j57) & ((((((~(858894166 | i31)) | 578332243) * (-933)) - 1208495514) + (((~(578332243 | i31)) | 285280516) * 933)) - 1689376550)) | (((int) (j57 >> 32)) & ((((~(70030395 | i31)) | (~((-69735450) | i3))) * (-831)) + 676586828 + ((~(1576992255 | i3)) * (-1662)) + (((~((-1507256807) | i31)) | (~(1507256806 | i3)) | (~((-70030396) | i3))) * 831)))) != 0) {
                                                                java.lang.Object[] objArr181 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                                int i34 = ~((-801816444) | i31);
                                                                java.lang.Object[] objArr182 = {522072123, 16, java.lang.Integer.valueOf((((-801898492) | i34 | (~(801816443 | i3))) * (-338)) + 250574871 + ((i34 | (~(i3 | (-82049)))) * 338))};
                                                                java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj50 == null) {
                                                                    java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.Gravity.getAbsoluteGravity(0, 0), 2713 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) android.graphics.Color.green(0));
                                                                    byte b18 = (byte) ($$a[14] - 1);
                                                                    java.lang.Object[] objArr183 = new java.lang.Object[1];
                                                                    a(653, b18, b18, objArr183);
                                                                    obj50 = cls48.getMethod((java.lang.String) objArr183[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj50);
                                                                }
                                                                ((int[]) objArr181[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj50).invoke(null, objArr182)).intValue();
                                                                return objArr181;
                                                            }
                                                            java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1050293330);
                                                            if (obj51 == null) {
                                                                java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 36, android.graphics.Color.red(0) + 2972, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                                byte[] bArr28 = $$a;
                                                                short s28 = (short) (bArr28[14] - 1);
                                                                java.lang.Object[] objArr184 = new java.lang.Object[1];
                                                                a(s28, (byte) s28, (byte) (-bArr28[16]), objArr184);
                                                                obj51 = cls49.getMethod((java.lang.String) objArr184[0], null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1050293330, obj51);
                                                            }
                                                            long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) obj51).invoke(null, null)).longValue();
                                                            long j58 = ((((((-219) * longValue20) - 150384885053L) + (((~(680474592 | (~longValue20))) | (~((j | (-680474593)) | longValue20))) * 220)) + (((~(j | longValue20)) | (-680474593)) * (-440))) + (((longValue20 | (-680474593)) | j2) * 220)) - 1172227171;
                                                            if (((((int) (j58 >> 32)) & (((((~((-2106021154) | i31)) | (~((-668794743) | i3))) * 959) - 1026460671) + (((~((-2106021154) | i3)) | (~((-668794743) | i31))) * 959))) | (((int) j58) & ((((((~(74151958 | i3)) | (-1434451352)) * 1504) + 1320243365) + ((~((-1360299394) | i3)) * (-1504))) - 1416218960))) != 0) {
                                                                java.lang.Object[] objArr185 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                                java.lang.Object[] objArr186 = {522072123, 16, java.lang.Integer.valueOf((((i3 | (-2059)) * (-676)) - 734612453) + (((~(356771509 | i31)) | 2058) * 676) + (((~(i3 | 356773567)) | (~((-352554011) | i31)) | 352551952) * 676))};
                                                                java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj52 == null) {
                                                                    java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49, android.widget.ExpandableListView.getPackedPositionType(0L) + 2713, (char) android.text.TextUtils.getCapsMode(str7, 0, 0));
                                                                    byte b19 = (byte) ($$a[14] - 1);
                                                                    java.lang.Object[] objArr187 = new java.lang.Object[1];
                                                                    a(653, b19, b19, objArr187);
                                                                    obj52 = cls50.getMethod((java.lang.String) objArr187[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj52);
                                                                }
                                                                ((int[]) objArr185[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj52).invoke(null, objArr186)).intValue();
                                                                return objArr185;
                                                            }
                                                            java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1827153043);
                                                            if (obj53 == null) {
                                                                java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 26, 2159 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 56400));
                                                                byte[] bArr29 = $$a;
                                                                short s29 = (short) (bArr29[14] - 1);
                                                                java.lang.Object[] objArr188 = new java.lang.Object[1];
                                                                a(s29, (byte) s29, (byte) (-bArr29[16]), objArr188);
                                                                obj53 = cls51.getMethod((java.lang.String) objArr188[0], null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1827153043, obj53);
                                                            }
                                                            long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) obj53).invoke(null, null)).longValue();
                                                            long j59 = ((((((-782) * longValue21) + 853622700560L) + ((~longValue21) * (-783))) + ((~((j | (-1088804466)) | longValue21)) * (-783))) + (((~(j | longValue21)) | (-1088804466)) * 783)) - 1654622485;
                                                            if (((((int) (j59 >> 32)) & ((((~((-1611399629) | i31)) | 174173217) * (-591)) + 148823580 + (((-1611399629) | i3) * 591))) | (((int) j59) & ((((((-219598121) | i31) * (-490)) + 1459896515) + (((~((-488033582) | i3)) | 268435461) * 490)) - 1515409530))) != 0) {
                                                                java.lang.Object[] objArr189 = {new int[]{i3}, new int[]{i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                                java.lang.Object[] objArr190 = {522072123, 16, java.lang.Integer.valueOf((((~((-651955165) | i31)) | (~((-57370356) | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1522373537 + (((~(i3 | (-613681421))) | (~((-19096612) | i31))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))};
                                                                java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj54 == null) {
                                                                    java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.getSize(0), android.text.TextUtils.indexOf(str7, str7, 0, 0) + 2713, (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                                    byte b20 = (byte) ($$a[14] - 1);
                                                                    java.lang.Object[] objArr191 = new java.lang.Object[1];
                                                                    a(653, b20, b20, objArr191);
                                                                    obj54 = cls52.getMethod((java.lang.String) objArr191[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj54);
                                                                }
                                                                ((int[]) objArr189[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj54).invoke(null, objArr190)).intValue();
                                                                return objArr189;
                                                            }
                                                            java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(887063382);
                                                            if (obj55 == null) {
                                                                java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 35, 886 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.alpha(0));
                                                                byte[] bArr30 = $$a;
                                                                short s30 = (short) (bArr30[14] - 1);
                                                                java.lang.Object[] objArr192 = new java.lang.Object[1];
                                                                a(s30, (byte) s30, (byte) (-bArr30[16]), objArr192);
                                                                obj55 = cls53.getMethod((java.lang.String) objArr192[0], null);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(887063382, obj55);
                                                            }
                                                            long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) obj55).invoke(null, null)).longValue();
                                                            long j60 = ~longValue22;
                                                            long j61 = (-722095284) | j60;
                                                            long j62 = (868 * longValue22) + 626778705644L + (((~(j | (-722095284))) | (~(j60 | j))) * (-867)) + (((~j61) | (~(j2 | (-722095284))) | (~(j60 | j2))) * (-1734)) + (((~(longValue22 | (-722095284) | j2)) | (~(j61 | j)) | (~(722095283 | j60 | j2))) * 867) + 1238657619;
                                                            int i35 = 1265253751 | i31;
                                                            int i36 = ((((int) (j62 >> 32)) & ((((((~i35) | 171972659) * (-828)) + 1754752898) + (i35 * (-828))) + 341913568)) | (((int) j62) & (((((~(1916249577 | i3)) | (-2050991598)) * 305) + (-1704616964)) + (((~(1916249577 | i31)) | (-941491309)) * 305)))) != 0 ? i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : i3;
                                                            if (i36 != i3) {
                                                                java.lang.Object[] objArr193 = {new int[]{i3}, new int[]{i36}, null, new int[1]};
                                                                java.lang.Object[] objArr194 = {522072123, 16, java.lang.Integer.valueOf((((~((-1027973616) | i31)) | 272900367 | (~((-318648096) | i31))) * (-397)) + 1774936783 + (((-800820977) | i3) * 397))};
                                                                java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj56 == null) {
                                                                    java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionType(0L), android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1));
                                                                    byte b21 = (byte) ($$a[14] - 1);
                                                                    java.lang.Object[] objArr195 = new java.lang.Object[1];
                                                                    a(653, b21, b21, objArr195);
                                                                    obj56 = cls54.getMethod((java.lang.String) objArr195[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj56);
                                                                }
                                                                ((int[]) objArr193[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj56).invoke(null, objArr194)).intValue();
                                                                java.lang.Object[] objArr196 = {objArr193};
                                                                java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(712501173);
                                                                if (obj57 == null) {
                                                                    java.lang.Class cls55 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 3236 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                                                                    byte b22 = (byte) ($$a[14] - 1);
                                                                    java.lang.Object[] objArr197 = new java.lang.Object[1];
                                                                    a(653, b22, b22, objArr197);
                                                                    obj57 = cls55.getMethod((java.lang.String) objArr197[0], java.lang.Object[].class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(712501173, obj57);
                                                                }
                                                                ((java.lang.reflect.Method) obj57).invoke(obj, objArr196);
                                                                return objArr193;
                                                            }
                                                            java.lang.Object[] objArr198 = {java.lang.Integer.valueOf(i), obj, 522072123, 0};
                                                            java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(97317038);
                                                            if (obj58 == null) {
                                                                obj58 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29, android.view.KeyEvent.normalizeMetaState(0) + 3289, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getDeclaredConstructor(java.lang.Integer.TYPE, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 52, android.text.TextUtils.getOffsetBefore(str7, 0) + 3237, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(97317038, obj58);
                                                            }
                                                            java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj58).newInstance(objArr198);
                                                            try {
                                                                java.lang.Object[] objArr199 = new java.lang.Object[1];
                                                                c("\u0017\u0002\u000b\u0005\u0002\u0006\u0013\t\ufff5ￏ\b\u000f\u0002\rￏ\u0002", 116 - android.graphics.Color.green(0), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2, true, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16, objArr199);
                                                                java.lang.Class<?> cls56 = java.lang.Class.forName(((java.lang.String) objArr199[0]).intern());
                                                                java.lang.Object[] objArr200 = new java.lang.Object[1];
                                                                c("\ufff2\u0005\u0004\u0005\u0003", android.os.Process.getGidForName(str7) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 3 - android.view.KeyEvent.normalizeMetaState(0), true, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 5, objArr200);
                                                                cls56.getMethod(((java.lang.String) objArr200[0]).intern(), null).invoke(newInstance, null);
                                                                java.lang.Object[] objArr201 = {new int[]{i3}, new int[]{i3}, null, new int[1]};
                                                                java.lang.Object[] objArr202 = {522072123, 0, java.lang.Integer.valueOf((((~((-60225689) | i31)) | 649099831) * (-235)) + 2111702865 + (((~((-60225689) | i3)) | 649099831) * (-470)) + (((~(i3 | (-17203337))) | 606077479) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))};
                                                                java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj59 == null) {
                                                                    java.lang.Class cls57 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 50, 2713 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                                                    byte b23 = (byte) ($$a[14] - 1);
                                                                    java.lang.Object[] objArr203 = new java.lang.Object[1];
                                                                    a(653, b23, b23, objArr203);
                                                                    obj59 = cls57.getMethod((java.lang.String) objArr203[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj59);
                                                                }
                                                                ((int[]) objArr201[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj59).invoke(null, objArr202)).intValue();
                                                                return objArr201;
                                                            } catch (java.lang.Throwable th2) {
                                                                java.lang.Throwable cause2 = th2.getCause();
                                                                if (cause2 != null) {
                                                                    throw cause2;
                                                                }
                                                                throw th2;
                                                            }
                                                        }
                                                        java.lang.Object[] objArr204 = {((java.lang.String) objArr[0]).intern()};
                                                        java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                        if (obj60 == null) {
                                                            java.lang.Class cls58 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.View.combineMeasuredStates(0, 0), 1921 - (android.os.Process.myTid() >> 22), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                            byte[] bArr31 = $$a;
                                                            short s31 = (short) (bArr31[14] - 1);
                                                            java.lang.Object[] objArr205 = new java.lang.Object[1];
                                                            a(s31, (byte) s31, (byte) (-bArr31[16]), objArr205);
                                                            obj60 = cls58.getMethod((java.lang.String) objArr205[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj60);
                                                        }
                                                        java.lang.Object invoke6 = ((java.lang.reflect.Method) obj60).invoke(null, objArr204);
                                                        if (invoke6 != null) {
                                                            java.lang.Object[] objArr206 = new java.lang.Object[1];
                                                            c("\ufffa\u0001￼\u0001\u0001\b\u0005", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 129, 7 - android.graphics.Color.blue(0), true, android.graphics.Color.argb(0, 0, 0, 0) + 7, objArr206);
                                                            if (invoke6.equals(((java.lang.String) objArr206[0]).intern())) {
                                                                java.lang.Object[] objArr207 = new java.lang.Object[1];
                                                                c("\b\u000b\u000b�\ufffb\ufffb\ufff9\ufff7\f\u0007\u0007\nￆ\u000b\u0011\u000bￆ\f\u000b\u0001\u000b\n�", android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 126, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, true, android.text.TextUtils.getOffsetBefore(str7, 0) + 23, objArr207);
                                                                try {
                                                                    java.lang.Object[] objArr208 = {((java.lang.String) objArr207[0]).intern()};
                                                                    java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                                    if (obj61 == null) {
                                                                        java.lang.Class cls59 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.widget.ExpandableListView.getPackedPositionType(0L), 1921 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((-1) - android.view.MotionEvent.axisFromString(str7)));
                                                                        byte[] bArr32 = $$a;
                                                                        short s32 = (short) (bArr32[14] - 1);
                                                                        java.lang.Object[] objArr209 = new java.lang.Object[1];
                                                                        a(s32, (byte) s32, (byte) (-bArr32[16]), objArr209);
                                                                        obj61 = cls59.getMethod((java.lang.String) objArr209[0], java.lang.String.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj61);
                                                                    }
                                                                    java.lang.String str14 = (java.lang.String) ((java.lang.reflect.Method) obj61).invoke(null, objArr208);
                                                                    if (str14 != null) {
                                                                        valueOf = (writeReplace + 109) % 128;
                                                                        int parseInt = java.lang.Integer.parseInt(str14);
                                                                        if (parseInt != 0) {
                                                                            valueOf = (writeReplace + 125) % 128;
                                                                            i7 = parseInt + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                                                            if (i7 != 0) {
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (java.lang.Throwable th3) {
                                                                    java.lang.Throwable cause3 = th3.getCause();
                                                                    if (cause3 != null) {
                                                                        throw cause3;
                                                                    }
                                                                    throw th3;
                                                                }
                                                            }
                                                        }
                                                        i7 = 0;
                                                        if (i7 != 0) {
                                                        }
                                                    } catch (java.lang.Throwable th4) {
                                                        java.lang.Throwable cause4 = th4.getCause();
                                                        if (cause4 != null) {
                                                            throw cause4;
                                                        }
                                                        throw th4;
                                                    }
                                                    objArr = new java.lang.Object[1];
                                                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, 18, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001", false, objArr);
                                                } else {
                                                    i3 = i;
                                                    str3 = str;
                                                    strArr3 = strArr5;
                                                    j2 = j5;
                                                    i4 = i13;
                                                }
                                                if (invoke5 != null) {
                                                    java.lang.Object[] objArr210 = {invoke5, 42};
                                                    java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                    if (obj62 == null) {
                                                        java.lang.Class cls60 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 28, 2594 - android.view.View.resolveSize(0, 0), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                                        byte[] bArr33 = $$a;
                                                        short s33 = (short) (bArr33[14] - 1);
                                                        java.lang.Object[] objArr211 = new java.lang.Object[1];
                                                        a(s33, (byte) s33, (byte) (-bArr33[16]), objArr211);
                                                        obj62 = cls60.getMethod((java.lang.String) objArr211[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj62);
                                                    }
                                                    long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) obj62).invoke(null, objArr210)).longValue();
                                                    long j63 = j | 433191829;
                                                    long j64 = (((-494) * longValue23) - 213996763526L) + ((~(433191829 | longValue23)) * (-495)) + (495 * j63) + (((~((~longValue23) | (-433191830))) | (~j63)) * 495) + 823908695;
                                                }
                                                java.lang.Object[] objArr762 = new java.lang.Object[1];
                                                b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 23, 0, 19}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000", false, objArr762);
                                                java.lang.Object[] objArr772 = {((java.lang.String) objArr762[0]).intern()};
                                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj3 == null) {
                                                }
                                                long j192 = ~((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr772)).longValue();
                                                long j202 = ((r1 * (-858)) - 221409591180L) + ((j2 | (-257453013)) * (-859)) + (((~(j | (-257453013))) | (~(257453012 | j192 | j2))) * 859) + (((~(j192 | (-257453013))) | (~(j192 | j))) * 859) + 1547993080;
                                                j3 = (((int) j202) & ((((~((-864120318) | i3)) | (-1993620569)) * (-318)) + 158946635 + (((~((-1993620569) | i3)) | (~(2010480125 | i4))) * 318) + (((~((-1146359809) | i4)) | (~(2010480125 | i3))) * 318))) | (((int) (j202 >> 32)) & (((((~((-1125806409) | i4)) | 16448) * (-108)) - 564914248) + (((~(1731934476 | i3)) | 606144516 | (~((-1731934477) | i4))) * 54) + ((606144516 | i3) * 54)));
                                                java.lang.Object[] objArr792 = new java.lang.Object[1];
                                                b(new int[]{193, 17, 103, 0}, "\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", false, objArr792);
                                                java.lang.Object[] objArr802 = {((java.lang.String) objArr792[0]).intern()};
                                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj4 == null) {
                                                }
                                                long longValue62 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr802)).longValue();
                                                long j212 = (565 * longValue62) + 478334234754L + (((~(longValue62 | j2)) | (~((~longValue62) | j)) | 849616757) * (-564)) + ((~(849616757 | longValue62 | j2)) * 1128) + (((~(j | 849616757)) | (~(longValue62 | (-849616758)))) * 564) + 2140156825;
                                                int i212 = ~(1006639107 | i4);
                                                long j222 = (((int) (j212 >> 32)) & ((((((~((-1200098635) | i4)) | (~((-237127777) | i3))) | (~(237127776 | i4))) * 959) - 611618391) + (((~((-1200098635) | i3)) | (~((-237127777) | i4)) | (~(237127776 | i3))) * 959))) | (((int) j212) & (((1851101778 | i212) * 764) + 735836633 + (((~(1851101778 | i4)) | 268437505) * (-1528)) + ((i212 | 1381337681) * 764)));
                                                if (j3 <= 0) {
                                                }
                                                java.lang.Object[] objArr852 = new java.lang.Object[1];
                                                b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 23, 0, 19}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000", false, objArr852);
                                                java.lang.Object[] objArr862 = {((java.lang.String) objArr852[0]).intern()};
                                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj5 == null) {
                                                }
                                                long longValue72 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr862)).longValue();
                                                long j232 = ~longValue72;
                                                long j242 = ((-675) * longValue72) + 702606242762L + ((j2 | 1037823106 | j232) * (-676)) + (((~(j | 1037823106)) | (~(1037823106 | j232))) * 676) + (((~(longValue72 | 1037823106 | j2)) | (~((-1037823107) | j232)) | (~(j232 | j))) * 676) + 252716961;
                                                int i232 = ~((-1409302929) | i3);
                                                j4 = (((int) (j242 >> 32)) & (((~((-144708137) | i4)) * (-783)) + 1958222673 + (((~((-1492573758) | i4)) | 1365167127) * 783))) | (((int) j242) & (((25690113 | i232) * (-476)) + 1388037233 + (i232 * 952) + ((~((-1409302929) | i4)) * 476)));
                                                str4 = str3;
                                                java.lang.Object[] objArr882 = new java.lang.Object[1];
                                                c("\u001b\n\tￔ", android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 113, 5 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, '4' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr882);
                                                java.lang.Object[] objArr892 = {((java.lang.String) objArr882[0]).intern()};
                                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                if (obj6 == null) {
                                                }
                                                long longValue82 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr892)).longValue();
                                                long j252 = ~(324866605 | longValue82);
                                                long j262 = (~longValue82) | (-324866606);
                                                long j272 = ((1435 * longValue82) - 232604489180L) + ((longValue82 | (-324866606)) * (-1434)) + (((~(j262 | j2)) | (~(j | longValue82)) | j252) * 717) + (((~(longValue82 | j2)) | (~(j262 | j)) | j252) * 717) + 965673462;
                                                int i242 = ~((-43403879) | i4);
                                                long j282 = (((int) (j272 >> 32)) & ((((~((-2085134354) | i3)) | 1480630289 | i242) * (-470)) + 1548760288 + ((i242 | (~((-604504065) | i3))) * 470))) | (((int) j272) & ((((~(350947524 | i3)) | (-1788173935)) * 56) + 858099341 + (((~((-1788173935) | i4)) | 350947524) * 56)));
                                                if (j4 <= 0) {
                                                }
                                                java.lang.Object[] objArr942 = new java.lang.Object[1];
                                                c("\ufffe\r\f\u0012\f\uffc8\u0006", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 6 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), true, android.widget.ExpandableListView.getPackedPositionChild(0L) + 8, objArr942);
                                                java.lang.String intern302 = ((java.lang.String) objArr942[0]).intern();
                                                java.lang.Object[] objArr952 = new java.lang.Object[1];
                                                b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 11, 0, 10}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001", true, objArr952);
                                                java.lang.String intern312 = ((java.lang.String) objArr952[0]).intern();
                                                java.lang.Object[] objArr962 = new java.lang.Object[1];
                                                c("\u0010\u0011\u0002\nￌ\u0010\uffff\u0006\u000bￌ\u0010\u0016", android.os.Process.getGidForName(str4) + 121, 9 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), false, 13 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr962);
                                                java.lang.String intern322 = ((java.lang.String) objArr962[0]).intern();
                                                str5 = str4;
                                                java.lang.Object[] objArr972 = new java.lang.Object[1];
                                                c("\u0001\u0010\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014ￋ\t", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 120, 6 - android.text.TextUtils.getOffsetBefore(str5, 0), true, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, objArr972);
                                                java.lang.String intern332 = ((java.lang.String) objArr972[0]).intern();
                                                java.lang.Object[] objArr982 = new java.lang.Object[1];
                                                b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, 11, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false, objArr982);
                                                java.lang.String intern342 = ((java.lang.String) objArr982[0]).intern();
                                                java.lang.Object[] objArr992 = new java.lang.Object[1];
                                                c("\u0003\n\u000f\uffd0\u0014", 116 - android.graphics.Color.argb(0, 0, 0, 0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 3, false, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 5, objArr992);
                                                java.lang.String intern352 = ((java.lang.String) objArr992[0]).intern();
                                                java.lang.Object[] objArr1002 = new java.lang.Object[1];
                                                c("\u000bￕ\t\u001a", android.text.TextUtils.indexOf(str5, str5, 0, 0) + 111, 1 - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), true, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, objArr1002);
                                                strArr = new java.lang.String[]{intern302, intern312, intern322, intern332, intern342, intern352, ((java.lang.String) objArr1002[0]).intern()};
                                                i5 = 0;
                                                while (true) {
                                                    if (i5 < 7) {
                                                    }
                                                    i5 = i10 + 1;
                                                    strArr = strArr2;
                                                    str5 = str6;
                                                }
                                                if (i6 == 0) {
                                                }
                                            } else {
                                                i18++;
                                                j5 = j5;
                                            }
                                        }
                                    }
                                    i3 = i;
                                    str3 = str;
                                    j2 = j5;
                                    i4 = i13;
                                    java.lang.Object[] objArr7622 = new java.lang.Object[1];
                                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 23, 0, 19}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000", false, objArr7622);
                                    java.lang.Object[] objArr7722 = {((java.lang.String) objArr7622[0]).intern()};
                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj3 == null) {
                                    }
                                    long j1922 = ~((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7722)).longValue();
                                    long j2022 = ((r1 * (-858)) - 221409591180L) + ((j2 | (-257453013)) * (-859)) + (((~(j | (-257453013))) | (~(257453012 | j1922 | j2))) * 859) + (((~(j1922 | (-257453013))) | (~(j1922 | j))) * 859) + 1547993080;
                                    j3 = (((int) j2022) & ((((~((-864120318) | i3)) | (-1993620569)) * (-318)) + 158946635 + (((~((-1993620569) | i3)) | (~(2010480125 | i4))) * 318) + (((~((-1146359809) | i4)) | (~(2010480125 | i3))) * 318))) | (((int) (j2022 >> 32)) & (((((~((-1125806409) | i4)) | 16448) * (-108)) - 564914248) + (((~(1731934476 | i3)) | 606144516 | (~((-1731934477) | i4))) * 54) + ((606144516 | i3) * 54)));
                                    java.lang.Object[] objArr7922 = new java.lang.Object[1];
                                    b(new int[]{193, 17, 103, 0}, "\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", false, objArr7922);
                                    java.lang.Object[] objArr8022 = {((java.lang.String) objArr7922[0]).intern()};
                                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj4 == null) {
                                    }
                                    long longValue622 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr8022)).longValue();
                                    long j2122 = (565 * longValue622) + 478334234754L + (((~(longValue622 | j2)) | (~((~longValue622) | j)) | 849616757) * (-564)) + ((~(849616757 | longValue622 | j2)) * 1128) + (((~(j | 849616757)) | (~(longValue622 | (-849616758)))) * 564) + 2140156825;
                                    int i2122 = ~(1006639107 | i4);
                                    long j2222 = (((int) (j2122 >> 32)) & ((((((~((-1200098635) | i4)) | (~((-237127777) | i3))) | (~(237127776 | i4))) * 959) - 611618391) + (((~((-1200098635) | i3)) | (~((-237127777) | i4)) | (~(237127776 | i3))) * 959))) | (((int) j2122) & (((1851101778 | i2122) * 764) + 735836633 + (((~(1851101778 | i4)) | 268437505) * (-1528)) + ((i2122 | 1381337681) * 764)));
                                    if (j3 <= 0) {
                                    }
                                    java.lang.Object[] objArr8522 = new java.lang.Object[1];
                                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 23, 0, 19}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000", false, objArr8522);
                                    java.lang.Object[] objArr8622 = {((java.lang.String) objArr8522[0]).intern()};
                                    obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj5 == null) {
                                    }
                                    long longValue722 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8622)).longValue();
                                    long j2322 = ~longValue722;
                                    long j2422 = ((-675) * longValue722) + 702606242762L + ((j2 | 1037823106 | j2322) * (-676)) + (((~(j | 1037823106)) | (~(1037823106 | j2322))) * 676) + (((~(longValue722 | 1037823106 | j2)) | (~((-1037823107) | j2322)) | (~(j2322 | j))) * 676) + 252716961;
                                    int i2322 = ~((-1409302929) | i3);
                                    j4 = (((int) (j2422 >> 32)) & (((~((-144708137) | i4)) * (-783)) + 1958222673 + (((~((-1492573758) | i4)) | 1365167127) * 783))) | (((int) j2422) & (((25690113 | i2322) * (-476)) + 1388037233 + (i2322 * 952) + ((~((-1409302929) | i4)) * 476)));
                                    str4 = str3;
                                    java.lang.Object[] objArr8822 = new java.lang.Object[1];
                                    c("\u001b\n\tￔ", android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 113, 5 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, '4' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr8822);
                                    java.lang.Object[] objArr8922 = {((java.lang.String) objArr8822[0]).intern()};
                                    obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj6 == null) {
                                    }
                                    long longValue822 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr8922)).longValue();
                                    long j2522 = ~(324866605 | longValue822);
                                    long j2622 = (~longValue822) | (-324866606);
                                    long j2722 = ((1435 * longValue822) - 232604489180L) + ((longValue822 | (-324866606)) * (-1434)) + (((~(j2622 | j2)) | (~(j | longValue822)) | j2522) * 717) + (((~(longValue822 | j2)) | (~(j2622 | j)) | j2522) * 717) + 965673462;
                                    int i2422 = ~((-43403879) | i4);
                                    long j2822 = (((int) (j2722 >> 32)) & ((((~((-2085134354) | i3)) | 1480630289 | i2422) * (-470)) + 1548760288 + ((i2422 | (~((-604504065) | i3))) * 470))) | (((int) j2722) & ((((~(350947524 | i3)) | (-1788173935)) * 56) + 858099341 + (((~((-1788173935) | i4)) | 350947524) * 56)));
                                    if (j4 <= 0) {
                                    }
                                    java.lang.Object[] objArr9422 = new java.lang.Object[1];
                                    c("\ufffe\r\f\u0012\f\uffc8\u0006", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 6 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), true, android.widget.ExpandableListView.getPackedPositionChild(0L) + 8, objArr9422);
                                    java.lang.String intern3022 = ((java.lang.String) objArr9422[0]).intern();
                                    java.lang.Object[] objArr9522 = new java.lang.Object[1];
                                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 11, 0, 10}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001", true, objArr9522);
                                    java.lang.String intern3122 = ((java.lang.String) objArr9522[0]).intern();
                                    java.lang.Object[] objArr9622 = new java.lang.Object[1];
                                    c("\u0010\u0011\u0002\nￌ\u0010\uffff\u0006\u000bￌ\u0010\u0016", android.os.Process.getGidForName(str4) + 121, 9 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), false, 13 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr9622);
                                    java.lang.String intern3222 = ((java.lang.String) objArr9622[0]).intern();
                                    str5 = str4;
                                    java.lang.Object[] objArr9722 = new java.lang.Object[1];
                                    c("\u0001\u0010\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014ￋ\t", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 120, 6 - android.text.TextUtils.getOffsetBefore(str5, 0), true, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, objArr9722);
                                    java.lang.String intern3322 = ((java.lang.String) objArr9722[0]).intern();
                                    java.lang.Object[] objArr9822 = new java.lang.Object[1];
                                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, 11, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false, objArr9822);
                                    java.lang.String intern3422 = ((java.lang.String) objArr9822[0]).intern();
                                    java.lang.Object[] objArr9922 = new java.lang.Object[1];
                                    c("\u0003\n\u000f\uffd0\u0014", 116 - android.graphics.Color.argb(0, 0, 0, 0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 3, false, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 5, objArr9922);
                                    java.lang.String intern3522 = ((java.lang.String) objArr9922[0]).intern();
                                    java.lang.Object[] objArr10022 = new java.lang.Object[1];
                                    c("\u000bￕ\t\u001a", android.text.TextUtils.indexOf(str5, str5, 0, 0) + 111, 1 - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), true, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, objArr10022);
                                    strArr = new java.lang.String[]{intern3022, intern3122, intern3222, intern3322, intern3422, intern3522, ((java.lang.String) objArr10022[0]).intern()};
                                    i5 = 0;
                                    while (true) {
                                        if (i5 < 7) {
                                        }
                                        i5 = i10 + 1;
                                        strArr = strArr2;
                                        str5 = str6;
                                    }
                                    if (i6 == 0) {
                                    }
                                }
                            } else {
                                str9 = "";
                                obj7 = invoke;
                            }
                            if (invoke2 != null) {
                                java.lang.Object[] objArr212 = {invoke2, 42};
                                java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj63 == null) {
                                    java.lang.Class cls61 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.view.View.combineMeasuredStates(0, 0) + 2594, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                    byte[] bArr34 = $$a;
                                    short s34 = (short) (bArr34[14] - 1);
                                    java.lang.Object[] objArr213 = new java.lang.Object[1];
                                    a(s34, (byte) s34, (byte) (-bArr34[16]), objArr213);
                                    obj63 = cls61.getMethod((java.lang.String) objArr213[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj63);
                                }
                                long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) obj63).invoke(null, objArr212)).longValue();
                                long j65 = ~longValue24;
                                long j66 = 605097495 | j65;
                                j = j6;
                                long j67 = ((131 * longValue24) - 78057576855L) + ((~(j65 | j6 | 605097495)) * 130) + ((~j66) * (-260)) + (((~(longValue24 | (-605097496))) | (~(j66 | j5))) * 130) + 652003029;
                                int i37 = ~(1425671159 | i13);
                                if (((((int) j67) & (((((~((-187339611) | i13)) | 1624566020) * (-865)) - 1801918636) + ((~(187339610 | i)) * 865) + (((~(187339610 | i13)) | (~(1624566020 | i13))) * 865))) | (((int) (j67 >> 32)) & ((((~(11555251 | i13)) | 1414136388) * (-1188)) + 1334601244 + (((~((-11555252) | i)) | 1414136388 | i37) * 594) + ((i37 | (~((-11555252) | i13)) | 20480) * 594)))) != 477111747) {
                                }
                                if (android.os.Build.VERSION.SDK_INT <= 33) {
                                }
                                java.lang.Object[] objArr292 = new java.lang.Object[1];
                                c("\ufff9\u000b\u0011�\u0003\ufff7\ufffa￼", 125 - android.view.View.MeasureSpec.getMode(i2), 1 - (android.view.ViewConfiguration.getTouchSlop() >> 8), true, 7 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i2, i2), objArr292);
                                java.lang.String intern210 = ((java.lang.String) objArr292[0]).intern();
                                java.lang.Object[] objArr302 = new java.lang.Object[1];
                                c("\uffff\u0004�\ufff7\b\u0006", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 127, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2, false, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '*', objArr302);
                                java.lang.String intern310 = ((java.lang.String) objArr302[0]).intern();
                                java.lang.Object[] objArr312 = new java.lang.Object[1];
                                c("\ufff8\u0006\ufff9\u0007\t\u0001\ufff8", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 129, 7 - android.view.KeyEvent.normalizeMetaState(0), true, 8 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr312);
                                java.lang.String intern47 = ((java.lang.String) objArr312[0]).intern();
                                java.lang.Object[] objArr322 = new java.lang.Object[1];
                                c("\u0007\u000b\ufffa\u0007￼\ufff9\ufff7\b\ufffa", 128 - android.graphics.Color.blue(0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3, false, 8 - android.os.Process.getGidForName(str), objArr322);
                                java.lang.String intern52 = ((java.lang.String) objArr322[0]).intern();
                                java.lang.Object[] objArr332 = new java.lang.Object[1];
                                b(new int[]{55, 6, 0, 3}, "\u0000\u0000\u0001\u0000\u0001\u0001", true, objArr332);
                                java.lang.String intern62 = ((java.lang.String) objArr332[0]).intern();
                                java.lang.Object[] objArr342 = new java.lang.Object[1];
                                c("\u0002\u0015\u0007ￎ\u0012\u0003\t\u000e\t\u0014ￍ\u0004\u0005", 118 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionChild(0L) + 7, false, android.view.View.MeasureSpec.getMode(0) + 13, objArr342);
                                java.lang.String intern72 = ((java.lang.String) objArr342[0]).intern();
                                java.lang.Object[] objArr352 = new java.lang.Object[1];
                                b(new int[]{61, 5, 144, 0}, "\u0000\u0001\u0001\u0001\u0000", true, objArr352);
                                java.lang.String intern82 = ((java.lang.String) objArr352[0]).intern();
                                java.lang.Object[] objArr362 = new java.lang.Object[1];
                                b(new int[]{66, 6, 30, 5}, "\u0000\u0001\u0001\u0000\u0001\u0000", false, objArr362);
                                java.lang.String intern92 = ((java.lang.String) objArr362[0]).intern();
                                java.lang.Object[] objArr372 = new java.lang.Object[1];
                                c("\u0007\ufff9", 133 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 2 - android.text.TextUtils.indexOf(str, str, 0, 0), true, android.text.TextUtils.getCapsMode(str, 0, 0) + 2, objArr372);
                                java.lang.String intern102 = ((java.lang.String) objArr372[0]).intern();
                                java.lang.Object[] objArr382 = new java.lang.Object[1];
                                c("\ufff7\b\n\u0002\u0005�\u0006\ufffb\b\t\uffff\t\nￄ\t\n", 127 - android.graphics.Color.alpha(0), android.graphics.ImageFormat.getBitsPerPixel(0) + 4, false, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 16, objArr382);
                                java.lang.String intern112 = ((java.lang.String) objArr382[0]).intern();
                                java.lang.Object[] objArr392 = new java.lang.Object[1];
                                b(new int[]{72, 10, 0, 0}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001", false, objArr392);
                                java.lang.String intern122 = ((java.lang.String) objArr392[0]).intern();
                                java.lang.Object[] objArr402 = new java.lang.Object[1];
                                b(new int[]{82, 8, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", true, objArr402);
                                java.lang.String intern132 = ((java.lang.String) objArr402[0]).intern();
                                java.lang.Object[] objArr412 = new java.lang.Object[1];
                                b(new int[]{90, 12, 0, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", false, objArr412);
                                java.lang.String intern142 = ((java.lang.String) objArr412[0]).intern();
                                java.lang.Object[] objArr422 = new java.lang.Object[1];
                                c("\t\ufff8\ufffa\u0001\u0001\u0004\ufff8\ufffb\u0004\u0007\u0005\u0001\t\ufff8", 128 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.text.TextUtils.indexOf(str, str, 0) + 11, true, 14 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr422);
                                java.lang.String intern152 = ((java.lang.String) objArr422[0]).intern();
                                java.lang.Object[] objArr432 = new java.lang.Object[1];
                                b(new int[]{102, 7, 0, 1}, "\u0000\u0000\u0001\u0000\u0000\u0000\u0001", false, objArr432);
                                java.lang.String intern162 = ((java.lang.String) objArr432[0]).intern();
                                java.lang.Object[] objArr442 = new java.lang.Object[1];
                                b(new int[]{109, 7, 0, 3}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000", false, objArr442);
                                java.lang.String intern172 = ((java.lang.String) objArr442[0]).intern();
                                java.lang.Object[] objArr452 = new java.lang.Object[1];
                                b(new int[]{116, 7, 166, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000", true, objArr452);
                                java.lang.String intern182 = ((java.lang.String) objArr452[0]).intern();
                                java.lang.Object[] objArr462 = new java.lang.Object[1];
                                b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 2, 0, 2}, "\u0001\u0000", true, objArr462);
                                java.lang.String intern192 = ((java.lang.String) objArr462[0]).intern();
                                java.lang.Object[] objArr472 = new java.lang.Object[1];
                                c("\ufffa￼\ufff6\u0000\ufff8\u0004\u0001\ufff4�\t\ufffe\f\ufff4\t\u0007\ufff6\t\b\t\u0003", ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 128, 18 - android.graphics.Color.red(0), true, 21 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr472);
                                java.lang.String intern202 = ((java.lang.String) objArr472[0]).intern();
                                java.lang.Object[] objArr482 = new java.lang.Object[1];
                                c("\ufffa\ufff8\ufff6\u0007\t\b", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 127, 6 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), true, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6, objArr482);
                                java.lang.String intern212 = ((java.lang.String) objArr482[0]).intern();
                                java.lang.Object[] objArr492 = new java.lang.Object[1];
                                c("\uffff\u0001", 136 - android.graphics.ImageFormat.getBitsPerPixel(0), 1 - android.view.View.resolveSize(0, 0), true, 1 - android.os.Process.getGidForName(str), objArr492);
                                java.lang.String intern222 = ((java.lang.String) objArr492[0]).intern();
                                java.lang.Object[] objArr502 = new java.lang.Object[1];
                                c("\u000b\n\ufff7\n\tￃ\b\ufffb\u0010\uffff\n\uffff\u0004\ufff7\t\t", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, 14 - android.view.MotionEvent.axisFromString(str), true, android.graphics.Color.blue(0) + 16, objArr502);
                                java.lang.String intern232 = ((java.lang.String) objArr502[0]).intern();
                                java.lang.Object[] objArr512 = new java.lang.Object[1];
                                b(new int[]{125, 9, 110, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000", true, objArr512);
                                java.lang.String intern242 = ((java.lang.String) objArr512[0]).intern();
                                java.lang.Object[] objArr522 = new java.lang.Object[1];
                                b(new int[]{134, 10, 90, 4}, "\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001", false, objArr522);
                                java.lang.String intern252 = ((java.lang.String) objArr522[0]).intern();
                                java.lang.Object[] objArr532 = new java.lang.Object[1];
                                c("\b\u000b\ufffe￼\ufffa\u000b\rￏ\ufffe\r\u000e", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 125, 7 - android.text.TextUtils.getOffsetAfter(str, 0), true, 11 - android.text.TextUtils.indexOf(str, str, 0), objArr532);
                                java.lang.String intern262 = ((java.lang.String) objArr532[0]).intern();
                                java.lang.Object[] objArr542 = new java.lang.Object[1];
                                b(new int[]{144, 11, 74, 0}, "\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001", false, objArr542);
                                java.lang.String intern272 = ((java.lang.String) objArr542[0]).intern();
                                java.lang.Object[] objArr552 = new java.lang.Object[1];
                                b(new int[]{155, 15, 0, 13}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001", false, objArr552);
                                java.lang.String intern282 = ((java.lang.String) objArr552[0]).intern();
                                java.lang.Object[] objArr562 = new java.lang.Object[1];
                                c("\ufff7\u0001￼\n\u0001\b\u0006\uffff\u0002\ufff5\u0000\f\u0006\ufff2", 130 - android.view.View.resolveSizeAndState(0, 0, 0), 6 - (android.view.ViewConfiguration.getTapTimeout() >> 16), true, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 14, objArr562);
                                java.lang.String[] strArr52 = {intern210, intern310, intern47, intern52, intern62, intern72, intern82, intern92, intern102, intern112, intern122, intern132, intern142, intern152, intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, ((java.lang.String) objArr562[0]).intern()};
                                java.lang.Object[] objArr572 = new java.lang.Object[1];
                                b(new int[]{0, 11, 156, 1}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001", true, objArr572);
                                java.lang.Object[] objArr582 = {((java.lang.String) objArr572[0]).intern()};
                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj2 == null) {
                                }
                                str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr582);
                                if (str2 != null) {
                                }
                                i3 = i;
                                str3 = str;
                                j2 = j5;
                                i4 = i13;
                                java.lang.Object[] objArr76222 = new java.lang.Object[1];
                                b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 23, 0, 19}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000", false, objArr76222);
                                java.lang.Object[] objArr77222 = {((java.lang.String) objArr76222[0]).intern()};
                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj3 == null) {
                                }
                                long j19222 = ~((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr77222)).longValue();
                                long j20222 = ((r1 * (-858)) - 221409591180L) + ((j2 | (-257453013)) * (-859)) + (((~(j | (-257453013))) | (~(257453012 | j19222 | j2))) * 859) + (((~(j19222 | (-257453013))) | (~(j19222 | j))) * 859) + 1547993080;
                                j3 = (((int) j20222) & ((((~((-864120318) | i3)) | (-1993620569)) * (-318)) + 158946635 + (((~((-1993620569) | i3)) | (~(2010480125 | i4))) * 318) + (((~((-1146359809) | i4)) | (~(2010480125 | i3))) * 318))) | (((int) (j20222 >> 32)) & (((((~((-1125806409) | i4)) | 16448) * (-108)) - 564914248) + (((~(1731934476 | i3)) | 606144516 | (~((-1731934477) | i4))) * 54) + ((606144516 | i3) * 54)));
                                java.lang.Object[] objArr79222 = new java.lang.Object[1];
                                b(new int[]{193, 17, 103, 0}, "\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", false, objArr79222);
                                java.lang.Object[] objArr80222 = {((java.lang.String) objArr79222[0]).intern()};
                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj4 == null) {
                                }
                                long longValue6222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr80222)).longValue();
                                long j21222 = (565 * longValue6222) + 478334234754L + (((~(longValue6222 | j2)) | (~((~longValue6222) | j)) | 849616757) * (-564)) + ((~(849616757 | longValue6222 | j2)) * 1128) + (((~(j | 849616757)) | (~(longValue6222 | (-849616758)))) * 564) + 2140156825;
                                int i21222 = ~(1006639107 | i4);
                                long j22222 = (((int) (j21222 >> 32)) & ((((((~((-1200098635) | i4)) | (~((-237127777) | i3))) | (~(237127776 | i4))) * 959) - 611618391) + (((~((-1200098635) | i3)) | (~((-237127777) | i4)) | (~(237127776 | i3))) * 959))) | (((int) j21222) & (((1851101778 | i21222) * 764) + 735836633 + (((~(1851101778 | i4)) | 268437505) * (-1528)) + ((i21222 | 1381337681) * 764)));
                                if (j3 <= 0) {
                                }
                                java.lang.Object[] objArr85222 = new java.lang.Object[1];
                                b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 23, 0, 19}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000", false, objArr85222);
                                java.lang.Object[] objArr86222 = {((java.lang.String) objArr85222[0]).intern()};
                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj5 == null) {
                                }
                                long longValue7222 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr86222)).longValue();
                                long j23222 = ~longValue7222;
                                long j24222 = ((-675) * longValue7222) + 702606242762L + ((j2 | 1037823106 | j23222) * (-676)) + (((~(j | 1037823106)) | (~(1037823106 | j23222))) * 676) + (((~(longValue7222 | 1037823106 | j2)) | (~((-1037823107) | j23222)) | (~(j23222 | j))) * 676) + 252716961;
                                int i23222 = ~((-1409302929) | i3);
                                j4 = (((int) (j24222 >> 32)) & (((~((-144708137) | i4)) * (-783)) + 1958222673 + (((~((-1492573758) | i4)) | 1365167127) * 783))) | (((int) j24222) & (((25690113 | i23222) * (-476)) + 1388037233 + (i23222 * 952) + ((~((-1409302929) | i4)) * 476)));
                                str4 = str3;
                                java.lang.Object[] objArr88222 = new java.lang.Object[1];
                                c("\u001b\n\tￔ", android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 113, 5 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, '4' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr88222);
                                java.lang.Object[] objArr89222 = {((java.lang.String) objArr88222[0]).intern()};
                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj6 == null) {
                                }
                                long longValue8222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr89222)).longValue();
                                long j25222 = ~(324866605 | longValue8222);
                                long j26222 = (~longValue8222) | (-324866606);
                                long j27222 = ((1435 * longValue8222) - 232604489180L) + ((longValue8222 | (-324866606)) * (-1434)) + (((~(j26222 | j2)) | (~(j | longValue8222)) | j25222) * 717) + (((~(longValue8222 | j2)) | (~(j26222 | j)) | j25222) * 717) + 965673462;
                                int i24222 = ~((-43403879) | i4);
                                long j28222 = (((int) (j27222 >> 32)) & ((((~((-2085134354) | i3)) | 1480630289 | i24222) * (-470)) + 1548760288 + ((i24222 | (~((-604504065) | i3))) * 470))) | (((int) j27222) & ((((~(350947524 | i3)) | (-1788173935)) * 56) + 858099341 + (((~((-1788173935) | i4)) | 350947524) * 56)));
                                if (j4 <= 0) {
                                }
                                java.lang.Object[] objArr94222 = new java.lang.Object[1];
                                c("\ufffe\r\f\u0012\f\uffc8\u0006", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 6 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), true, android.widget.ExpandableListView.getPackedPositionChild(0L) + 8, objArr94222);
                                java.lang.String intern30222 = ((java.lang.String) objArr94222[0]).intern();
                                java.lang.Object[] objArr95222 = new java.lang.Object[1];
                                b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 11, 0, 10}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001", true, objArr95222);
                                java.lang.String intern31222 = ((java.lang.String) objArr95222[0]).intern();
                                java.lang.Object[] objArr96222 = new java.lang.Object[1];
                                c("\u0010\u0011\u0002\nￌ\u0010\uffff\u0006\u000bￌ\u0010\u0016", android.os.Process.getGidForName(str4) + 121, 9 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), false, 13 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr96222);
                                java.lang.String intern32222 = ((java.lang.String) objArr96222[0]).intern();
                                str5 = str4;
                                java.lang.Object[] objArr97222 = new java.lang.Object[1];
                                c("\u0001\u0010\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014ￋ\t", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 120, 6 - android.text.TextUtils.getOffsetBefore(str5, 0), true, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, objArr97222);
                                java.lang.String intern33222 = ((java.lang.String) objArr97222[0]).intern();
                                java.lang.Object[] objArr98222 = new java.lang.Object[1];
                                b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, 11, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false, objArr98222);
                                java.lang.String intern34222 = ((java.lang.String) objArr98222[0]).intern();
                                java.lang.Object[] objArr99222 = new java.lang.Object[1];
                                c("\u0003\n\u000f\uffd0\u0014", 116 - android.graphics.Color.argb(0, 0, 0, 0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 3, false, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 5, objArr99222);
                                java.lang.String intern35222 = ((java.lang.String) objArr99222[0]).intern();
                                java.lang.Object[] objArr100222 = new java.lang.Object[1];
                                c("\u000bￕ\t\u001a", android.text.TextUtils.indexOf(str5, str5, 0, 0) + 111, 1 - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), true, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, objArr100222);
                                strArr = new java.lang.String[]{intern30222, intern31222, intern32222, intern33222, intern34222, intern35222, ((java.lang.String) objArr100222[0]).intern()};
                                i5 = 0;
                                while (true) {
                                    if (i5 < 7) {
                                    }
                                    i5 = i10 + 1;
                                    strArr = strArr2;
                                    str5 = str6;
                                }
                                if (i6 == 0) {
                                }
                            } else {
                                j = j6;
                            }
                            if (obj7 != null) {
                                java.lang.Object[] objArr214 = {obj7, 42};
                                java.lang.Object obj64 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj64 == null) {
                                    java.lang.Class cls62 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2595, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                    byte[] bArr35 = $$a;
                                    short s35 = (short) (bArr35[14] - 1);
                                    java.lang.Object[] objArr215 = new java.lang.Object[1];
                                    a(s35, (byte) s35, (byte) (-bArr35[16]), objArr215);
                                    obj64 = cls62.getMethod((java.lang.String) objArr215[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj64);
                                }
                                long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) obj64).invoke(null, objArr214)).longValue();
                                long j68 = ~longValue25;
                                long j69 = (((-565) * longValue25) - 205921460493L) + (((~(j5 | 363177178)) | (~(longValue25 | 363177178))) * (-566)) + ((~((-363177179) | j68)) * 566) + ((~(363177178 | j68 | j5)) * 566) + 1620277703;
                            }
                            if (invoke2 != null) {
                                java.lang.Object[] objArr216 = {invoke2, 42};
                                java.lang.Object obj65 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj65 == null) {
                                    java.lang.Class cls63 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 28, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2593, (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                                    byte[] bArr36 = $$a;
                                    short s36 = (short) (bArr36[14] - 1);
                                    java.lang.Object[] objArr217 = new java.lang.Object[1];
                                    a(s36, (byte) s36, (byte) (-bArr36[16]), objArr217);
                                    obj65 = cls63.getMethod((java.lang.String) objArr217[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj65);
                                }
                                long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) obj65).invoke(null, objArr216)).longValue();
                                long j70 = j | (-419810609);
                                long j71 = ~longValue26;
                                long j72 = (53 * longValue26) + 21410341059L + ((~(j70 | longValue26)) * 52) + (((~(j71 | j)) | (~(j71 | (-419810609))) | (~j70)) * (-52)) + (((~(419810608 | longValue26)) | (~(j | 419810608))) * 52) + 1676911133;
                            }
                            str = str9;
                        } else {
                            i15++;
                            i16 = 2;
                            i14 = 0;
                        }
                    }
                    str = "";
                    j = j6;
                    i2 = i14;
                    java.lang.Object[] objArr2922 = new java.lang.Object[1];
                    c("\ufff9\u000b\u0011�\u0003\ufff7\ufffa￼", 125 - android.view.View.MeasureSpec.getMode(i2), 1 - (android.view.ViewConfiguration.getTouchSlop() >> 8), true, 7 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i2, i2), objArr2922);
                    java.lang.String intern2102 = ((java.lang.String) objArr2922[0]).intern();
                    java.lang.Object[] objArr3022 = new java.lang.Object[1];
                    c("\uffff\u0004�\ufff7\b\u0006", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 127, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2, false, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '*', objArr3022);
                    java.lang.String intern3102 = ((java.lang.String) objArr3022[0]).intern();
                    java.lang.Object[] objArr3122 = new java.lang.Object[1];
                    c("\ufff8\u0006\ufff9\u0007\t\u0001\ufff8", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 129, 7 - android.view.KeyEvent.normalizeMetaState(0), true, 8 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3122);
                    java.lang.String intern472 = ((java.lang.String) objArr3122[0]).intern();
                    java.lang.Object[] objArr3222 = new java.lang.Object[1];
                    c("\u0007\u000b\ufffa\u0007￼\ufff9\ufff7\b\ufffa", 128 - android.graphics.Color.blue(0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3, false, 8 - android.os.Process.getGidForName(str), objArr3222);
                    java.lang.String intern522 = ((java.lang.String) objArr3222[0]).intern();
                    java.lang.Object[] objArr3322 = new java.lang.Object[1];
                    b(new int[]{55, 6, 0, 3}, "\u0000\u0000\u0001\u0000\u0001\u0001", true, objArr3322);
                    java.lang.String intern622 = ((java.lang.String) objArr3322[0]).intern();
                    java.lang.Object[] objArr3422 = new java.lang.Object[1];
                    c("\u0002\u0015\u0007ￎ\u0012\u0003\t\u000e\t\u0014ￍ\u0004\u0005", 118 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionChild(0L) + 7, false, android.view.View.MeasureSpec.getMode(0) + 13, objArr3422);
                    java.lang.String intern722 = ((java.lang.String) objArr3422[0]).intern();
                    java.lang.Object[] objArr3522 = new java.lang.Object[1];
                    b(new int[]{61, 5, 144, 0}, "\u0000\u0001\u0001\u0001\u0000", true, objArr3522);
                    java.lang.String intern822 = ((java.lang.String) objArr3522[0]).intern();
                    java.lang.Object[] objArr3622 = new java.lang.Object[1];
                    b(new int[]{66, 6, 30, 5}, "\u0000\u0001\u0001\u0000\u0001\u0000", false, objArr3622);
                    java.lang.String intern922 = ((java.lang.String) objArr3622[0]).intern();
                    java.lang.Object[] objArr3722 = new java.lang.Object[1];
                    c("\u0007\ufff9", 133 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 2 - android.text.TextUtils.indexOf(str, str, 0, 0), true, android.text.TextUtils.getCapsMode(str, 0, 0) + 2, objArr3722);
                    java.lang.String intern1022 = ((java.lang.String) objArr3722[0]).intern();
                    java.lang.Object[] objArr3822 = new java.lang.Object[1];
                    c("\ufff7\b\n\u0002\u0005�\u0006\ufffb\b\t\uffff\t\nￄ\t\n", 127 - android.graphics.Color.alpha(0), android.graphics.ImageFormat.getBitsPerPixel(0) + 4, false, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 16, objArr3822);
                    java.lang.String intern1122 = ((java.lang.String) objArr3822[0]).intern();
                    java.lang.Object[] objArr3922 = new java.lang.Object[1];
                    b(new int[]{72, 10, 0, 0}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001", false, objArr3922);
                    java.lang.String intern1222 = ((java.lang.String) objArr3922[0]).intern();
                    java.lang.Object[] objArr4022 = new java.lang.Object[1];
                    b(new int[]{82, 8, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", true, objArr4022);
                    java.lang.String intern1322 = ((java.lang.String) objArr4022[0]).intern();
                    java.lang.Object[] objArr4122 = new java.lang.Object[1];
                    b(new int[]{90, 12, 0, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", false, objArr4122);
                    java.lang.String intern1422 = ((java.lang.String) objArr4122[0]).intern();
                    java.lang.Object[] objArr4222 = new java.lang.Object[1];
                    c("\t\ufff8\ufffa\u0001\u0001\u0004\ufff8\ufffb\u0004\u0007\u0005\u0001\t\ufff8", 128 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.text.TextUtils.indexOf(str, str, 0) + 11, true, 14 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr4222);
                    java.lang.String intern1522 = ((java.lang.String) objArr4222[0]).intern();
                    java.lang.Object[] objArr4322 = new java.lang.Object[1];
                    b(new int[]{102, 7, 0, 1}, "\u0000\u0000\u0001\u0000\u0000\u0000\u0001", false, objArr4322);
                    java.lang.String intern1622 = ((java.lang.String) objArr4322[0]).intern();
                    java.lang.Object[] objArr4422 = new java.lang.Object[1];
                    b(new int[]{109, 7, 0, 3}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000", false, objArr4422);
                    java.lang.String intern1722 = ((java.lang.String) objArr4422[0]).intern();
                    java.lang.Object[] objArr4522 = new java.lang.Object[1];
                    b(new int[]{116, 7, 166, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000", true, objArr4522);
                    java.lang.String intern1822 = ((java.lang.String) objArr4522[0]).intern();
                    java.lang.Object[] objArr4622 = new java.lang.Object[1];
                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 2, 0, 2}, "\u0001\u0000", true, objArr4622);
                    java.lang.String intern1922 = ((java.lang.String) objArr4622[0]).intern();
                    java.lang.Object[] objArr4722 = new java.lang.Object[1];
                    c("\ufffa￼\ufff6\u0000\ufff8\u0004\u0001\ufff4�\t\ufffe\f\ufff4\t\u0007\ufff6\t\b\t\u0003", ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 128, 18 - android.graphics.Color.red(0), true, 21 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4722);
                    java.lang.String intern2022 = ((java.lang.String) objArr4722[0]).intern();
                    java.lang.Object[] objArr4822 = new java.lang.Object[1];
                    c("\ufffa\ufff8\ufff6\u0007\t\b", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 127, 6 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), true, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6, objArr4822);
                    java.lang.String intern2122 = ((java.lang.String) objArr4822[0]).intern();
                    java.lang.Object[] objArr4922 = new java.lang.Object[1];
                    c("\uffff\u0001", 136 - android.graphics.ImageFormat.getBitsPerPixel(0), 1 - android.view.View.resolveSize(0, 0), true, 1 - android.os.Process.getGidForName(str), objArr4922);
                    java.lang.String intern2222 = ((java.lang.String) objArr4922[0]).intern();
                    java.lang.Object[] objArr5022 = new java.lang.Object[1];
                    c("\u000b\n\ufff7\n\tￃ\b\ufffb\u0010\uffff\n\uffff\u0004\ufff7\t\t", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, 14 - android.view.MotionEvent.axisFromString(str), true, android.graphics.Color.blue(0) + 16, objArr5022);
                    java.lang.String intern2322 = ((java.lang.String) objArr5022[0]).intern();
                    java.lang.Object[] objArr5122 = new java.lang.Object[1];
                    b(new int[]{125, 9, 110, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000", true, objArr5122);
                    java.lang.String intern2422 = ((java.lang.String) objArr5122[0]).intern();
                    java.lang.Object[] objArr5222 = new java.lang.Object[1];
                    b(new int[]{134, 10, 90, 4}, "\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001", false, objArr5222);
                    java.lang.String intern2522 = ((java.lang.String) objArr5222[0]).intern();
                    java.lang.Object[] objArr5322 = new java.lang.Object[1];
                    c("\b\u000b\ufffe￼\ufffa\u000b\rￏ\ufffe\r\u000e", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 125, 7 - android.text.TextUtils.getOffsetAfter(str, 0), true, 11 - android.text.TextUtils.indexOf(str, str, 0), objArr5322);
                    java.lang.String intern2622 = ((java.lang.String) objArr5322[0]).intern();
                    java.lang.Object[] objArr5422 = new java.lang.Object[1];
                    b(new int[]{144, 11, 74, 0}, "\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001", false, objArr5422);
                    java.lang.String intern2722 = ((java.lang.String) objArr5422[0]).intern();
                    java.lang.Object[] objArr5522 = new java.lang.Object[1];
                    b(new int[]{155, 15, 0, 13}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001", false, objArr5522);
                    java.lang.String intern2822 = ((java.lang.String) objArr5522[0]).intern();
                    java.lang.Object[] objArr5622 = new java.lang.Object[1];
                    c("\ufff7\u0001￼\n\u0001\b\u0006\uffff\u0002\ufff5\u0000\f\u0006\ufff2", 130 - android.view.View.resolveSizeAndState(0, 0, 0), 6 - (android.view.ViewConfiguration.getTapTimeout() >> 16), true, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 14, objArr5622);
                    java.lang.String[] strArr522 = {intern2102, intern3102, intern472, intern522, intern622, intern722, intern822, intern922, intern1022, intern1122, intern1222, intern1322, intern1422, intern1522, intern1622, intern1722, intern1822, intern1922, intern2022, intern2122, intern2222, intern2322, intern2422, intern2522, intern2622, intern2722, intern2822, ((java.lang.String) objArr5622[0]).intern()};
                    java.lang.Object[] objArr5722 = new java.lang.Object[1];
                    b(new int[]{0, 11, 156, 1}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001", true, objArr5722);
                    java.lang.Object[] objArr5822 = {((java.lang.String) objArr5722[0]).intern()};
                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj2 == null) {
                    }
                    str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr5822);
                    if (str2 != null) {
                    }
                    i3 = i;
                    str3 = str;
                    j2 = j5;
                    i4 = i13;
                    java.lang.Object[] objArr762222 = new java.lang.Object[1];
                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 23, 0, 19}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000", false, objArr762222);
                    java.lang.Object[] objArr772222 = {((java.lang.String) objArr762222[0]).intern()};
                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                    if (obj3 == null) {
                    }
                    long j192222 = ~((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr772222)).longValue();
                    long j202222 = ((r1 * (-858)) - 221409591180L) + ((j2 | (-257453013)) * (-859)) + (((~(j | (-257453013))) | (~(257453012 | j192222 | j2))) * 859) + (((~(j192222 | (-257453013))) | (~(j192222 | j))) * 859) + 1547993080;
                    j3 = (((int) j202222) & ((((~((-864120318) | i3)) | (-1993620569)) * (-318)) + 158946635 + (((~((-1993620569) | i3)) | (~(2010480125 | i4))) * 318) + (((~((-1146359809) | i4)) | (~(2010480125 | i3))) * 318))) | (((int) (j202222 >> 32)) & (((((~((-1125806409) | i4)) | 16448) * (-108)) - 564914248) + (((~(1731934476 | i3)) | 606144516 | (~((-1731934477) | i4))) * 54) + ((606144516 | i3) * 54)));
                    java.lang.Object[] objArr792222 = new java.lang.Object[1];
                    b(new int[]{193, 17, 103, 0}, "\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", false, objArr792222);
                    java.lang.Object[] objArr802222 = {((java.lang.String) objArr792222[0]).intern()};
                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                    if (obj4 == null) {
                    }
                    long longValue62222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr802222)).longValue();
                    long j212222 = (565 * longValue62222) + 478334234754L + (((~(longValue62222 | j2)) | (~((~longValue62222) | j)) | 849616757) * (-564)) + ((~(849616757 | longValue62222 | j2)) * 1128) + (((~(j | 849616757)) | (~(longValue62222 | (-849616758)))) * 564) + 2140156825;
                    int i212222 = ~(1006639107 | i4);
                    long j222222 = (((int) (j212222 >> 32)) & ((((((~((-1200098635) | i4)) | (~((-237127777) | i3))) | (~(237127776 | i4))) * 959) - 611618391) + (((~((-1200098635) | i3)) | (~((-237127777) | i4)) | (~(237127776 | i3))) * 959))) | (((int) j212222) & (((1851101778 | i212222) * 764) + 735836633 + (((~(1851101778 | i4)) | 268437505) * (-1528)) + ((i212222 | 1381337681) * 764)));
                    if (j3 <= 0) {
                    }
                    java.lang.Object[] objArr852222 = new java.lang.Object[1];
                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 23, 0, 19}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000", false, objArr852222);
                    java.lang.Object[] objArr862222 = {((java.lang.String) objArr852222[0]).intern()};
                    obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                    if (obj5 == null) {
                    }
                    long longValue72222 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr862222)).longValue();
                    long j232222 = ~longValue72222;
                    long j242222 = ((-675) * longValue72222) + 702606242762L + ((j2 | 1037823106 | j232222) * (-676)) + (((~(j | 1037823106)) | (~(1037823106 | j232222))) * 676) + (((~(longValue72222 | 1037823106 | j2)) | (~((-1037823107) | j232222)) | (~(j232222 | j))) * 676) + 252716961;
                    int i232222 = ~((-1409302929) | i3);
                    j4 = (((int) (j242222 >> 32)) & (((~((-144708137) | i4)) * (-783)) + 1958222673 + (((~((-1492573758) | i4)) | 1365167127) * 783))) | (((int) j242222) & (((25690113 | i232222) * (-476)) + 1388037233 + (i232222 * 952) + ((~((-1409302929) | i4)) * 476)));
                    str4 = str3;
                    java.lang.Object[] objArr882222 = new java.lang.Object[1];
                    c("\u001b\n\tￔ", android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 113, 5 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, '4' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr882222);
                    java.lang.Object[] objArr892222 = {((java.lang.String) objArr882222[0]).intern()};
                    obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                    if (obj6 == null) {
                    }
                    long longValue82222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr892222)).longValue();
                    long j252222 = ~(324866605 | longValue82222);
                    long j262222 = (~longValue82222) | (-324866606);
                    long j272222 = ((1435 * longValue82222) - 232604489180L) + ((longValue82222 | (-324866606)) * (-1434)) + (((~(j262222 | j2)) | (~(j | longValue82222)) | j252222) * 717) + (((~(longValue82222 | j2)) | (~(j262222 | j)) | j252222) * 717) + 965673462;
                    int i242222 = ~((-43403879) | i4);
                    long j282222 = (((int) (j272222 >> 32)) & ((((~((-2085134354) | i3)) | 1480630289 | i242222) * (-470)) + 1548760288 + ((i242222 | (~((-604504065) | i3))) * 470))) | (((int) j272222) & ((((~(350947524 | i3)) | (-1788173935)) * 56) + 858099341 + (((~((-1788173935) | i4)) | 350947524) * 56)));
                    if (j4 <= 0) {
                    }
                    java.lang.Object[] objArr942222 = new java.lang.Object[1];
                    c("\ufffe\r\f\u0012\f\uffc8\u0006", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 6 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), true, android.widget.ExpandableListView.getPackedPositionChild(0L) + 8, objArr942222);
                    java.lang.String intern302222 = ((java.lang.String) objArr942222[0]).intern();
                    java.lang.Object[] objArr952222 = new java.lang.Object[1];
                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 11, 0, 10}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001", true, objArr952222);
                    java.lang.String intern312222 = ((java.lang.String) objArr952222[0]).intern();
                    java.lang.Object[] objArr962222 = new java.lang.Object[1];
                    c("\u0010\u0011\u0002\nￌ\u0010\uffff\u0006\u000bￌ\u0010\u0016", android.os.Process.getGidForName(str4) + 121, 9 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), false, 13 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr962222);
                    java.lang.String intern322222 = ((java.lang.String) objArr962222[0]).intern();
                    str5 = str4;
                    java.lang.Object[] objArr972222 = new java.lang.Object[1];
                    c("\u0001\u0010\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014ￋ\t", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 120, 6 - android.text.TextUtils.getOffsetBefore(str5, 0), true, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, objArr972222);
                    java.lang.String intern332222 = ((java.lang.String) objArr972222[0]).intern();
                    java.lang.Object[] objArr982222 = new java.lang.Object[1];
                    b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, 11, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false, objArr982222);
                    java.lang.String intern342222 = ((java.lang.String) objArr982222[0]).intern();
                    java.lang.Object[] objArr992222 = new java.lang.Object[1];
                    c("\u0003\n\u000f\uffd0\u0014", 116 - android.graphics.Color.argb(0, 0, 0, 0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 3, false, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 5, objArr992222);
                    java.lang.String intern352222 = ((java.lang.String) objArr992222[0]).intern();
                    java.lang.Object[] objArr1002222 = new java.lang.Object[1];
                    c("\u000bￕ\t\u001a", android.text.TextUtils.indexOf(str5, str5, 0, 0) + 111, 1 - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), true, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, objArr1002222);
                    strArr = new java.lang.String[]{intern302222, intern312222, intern322222, intern332222, intern342222, intern352222, ((java.lang.String) objArr1002222[0]).intern()};
                    i5 = 0;
                    while (true) {
                        if (i5 < 7) {
                        }
                        i5 = i10 + 1;
                        strArr = strArr2;
                        str5 = str6;
                    }
                    if (i6 == 0) {
                    }
                } else {
                    str = "";
                    j = j6;
                }
                i2 = 0;
                java.lang.Object[] objArr29222 = new java.lang.Object[1];
                c("\ufff9\u000b\u0011�\u0003\ufff7\ufffa￼", 125 - android.view.View.MeasureSpec.getMode(i2), 1 - (android.view.ViewConfiguration.getTouchSlop() >> 8), true, 7 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i2, i2), objArr29222);
                java.lang.String intern21022 = ((java.lang.String) objArr29222[0]).intern();
                java.lang.Object[] objArr30222 = new java.lang.Object[1];
                c("\uffff\u0004�\ufff7\b\u0006", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 127, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2, false, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '*', objArr30222);
                java.lang.String intern31022 = ((java.lang.String) objArr30222[0]).intern();
                java.lang.Object[] objArr31222 = new java.lang.Object[1];
                c("\ufff8\u0006\ufff9\u0007\t\u0001\ufff8", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 129, 7 - android.view.KeyEvent.normalizeMetaState(0), true, 8 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr31222);
                java.lang.String intern4722 = ((java.lang.String) objArr31222[0]).intern();
                java.lang.Object[] objArr32222 = new java.lang.Object[1];
                c("\u0007\u000b\ufffa\u0007￼\ufff9\ufff7\b\ufffa", 128 - android.graphics.Color.blue(0), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3, false, 8 - android.os.Process.getGidForName(str), objArr32222);
                java.lang.String intern5222 = ((java.lang.String) objArr32222[0]).intern();
                java.lang.Object[] objArr33222 = new java.lang.Object[1];
                b(new int[]{55, 6, 0, 3}, "\u0000\u0000\u0001\u0000\u0001\u0001", true, objArr33222);
                java.lang.String intern6222 = ((java.lang.String) objArr33222[0]).intern();
                java.lang.Object[] objArr34222 = new java.lang.Object[1];
                c("\u0002\u0015\u0007ￎ\u0012\u0003\t\u000e\t\u0014ￍ\u0004\u0005", 118 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionChild(0L) + 7, false, android.view.View.MeasureSpec.getMode(0) + 13, objArr34222);
                java.lang.String intern7222 = ((java.lang.String) objArr34222[0]).intern();
                java.lang.Object[] objArr35222 = new java.lang.Object[1];
                b(new int[]{61, 5, 144, 0}, "\u0000\u0001\u0001\u0001\u0000", true, objArr35222);
                java.lang.String intern8222 = ((java.lang.String) objArr35222[0]).intern();
                java.lang.Object[] objArr36222 = new java.lang.Object[1];
                b(new int[]{66, 6, 30, 5}, "\u0000\u0001\u0001\u0000\u0001\u0000", false, objArr36222);
                java.lang.String intern9222 = ((java.lang.String) objArr36222[0]).intern();
                java.lang.Object[] objArr37222 = new java.lang.Object[1];
                c("\u0007\ufff9", 133 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 2 - android.text.TextUtils.indexOf(str, str, 0, 0), true, android.text.TextUtils.getCapsMode(str, 0, 0) + 2, objArr37222);
                java.lang.String intern10222 = ((java.lang.String) objArr37222[0]).intern();
                java.lang.Object[] objArr38222 = new java.lang.Object[1];
                c("\ufff7\b\n\u0002\u0005�\u0006\ufffb\b\t\uffff\t\nￄ\t\n", 127 - android.graphics.Color.alpha(0), android.graphics.ImageFormat.getBitsPerPixel(0) + 4, false, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 16, objArr38222);
                java.lang.String intern11222 = ((java.lang.String) objArr38222[0]).intern();
                java.lang.Object[] objArr39222 = new java.lang.Object[1];
                b(new int[]{72, 10, 0, 0}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001", false, objArr39222);
                java.lang.String intern12222 = ((java.lang.String) objArr39222[0]).intern();
                java.lang.Object[] objArr40222 = new java.lang.Object[1];
                b(new int[]{82, 8, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", true, objArr40222);
                java.lang.String intern13222 = ((java.lang.String) objArr40222[0]).intern();
                java.lang.Object[] objArr41222 = new java.lang.Object[1];
                b(new int[]{90, 12, 0, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", false, objArr41222);
                java.lang.String intern14222 = ((java.lang.String) objArr41222[0]).intern();
                java.lang.Object[] objArr42222 = new java.lang.Object[1];
                c("\t\ufff8\ufffa\u0001\u0001\u0004\ufff8\ufffb\u0004\u0007\u0005\u0001\t\ufff8", 128 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.text.TextUtils.indexOf(str, str, 0) + 11, true, 14 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr42222);
                java.lang.String intern15222 = ((java.lang.String) objArr42222[0]).intern();
                java.lang.Object[] objArr43222 = new java.lang.Object[1];
                b(new int[]{102, 7, 0, 1}, "\u0000\u0000\u0001\u0000\u0000\u0000\u0001", false, objArr43222);
                java.lang.String intern16222 = ((java.lang.String) objArr43222[0]).intern();
                java.lang.Object[] objArr44222 = new java.lang.Object[1];
                b(new int[]{109, 7, 0, 3}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000", false, objArr44222);
                java.lang.String intern17222 = ((java.lang.String) objArr44222[0]).intern();
                java.lang.Object[] objArr45222 = new java.lang.Object[1];
                b(new int[]{116, 7, 166, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000", true, objArr45222);
                java.lang.String intern18222 = ((java.lang.String) objArr45222[0]).intern();
                java.lang.Object[] objArr46222 = new java.lang.Object[1];
                b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 2, 0, 2}, "\u0001\u0000", true, objArr46222);
                java.lang.String intern19222 = ((java.lang.String) objArr46222[0]).intern();
                java.lang.Object[] objArr47222 = new java.lang.Object[1];
                c("\ufffa￼\ufff6\u0000\ufff8\u0004\u0001\ufff4�\t\ufffe\f\ufff4\t\u0007\ufff6\t\b\t\u0003", ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 128, 18 - android.graphics.Color.red(0), true, 21 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr47222);
                java.lang.String intern20222 = ((java.lang.String) objArr47222[0]).intern();
                java.lang.Object[] objArr48222 = new java.lang.Object[1];
                c("\ufffa\ufff8\ufff6\u0007\t\b", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 127, 6 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), true, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6, objArr48222);
                java.lang.String intern21222 = ((java.lang.String) objArr48222[0]).intern();
                java.lang.Object[] objArr49222 = new java.lang.Object[1];
                c("\uffff\u0001", 136 - android.graphics.ImageFormat.getBitsPerPixel(0), 1 - android.view.View.resolveSize(0, 0), true, 1 - android.os.Process.getGidForName(str), objArr49222);
                java.lang.String intern22222 = ((java.lang.String) objArr49222[0]).intern();
                java.lang.Object[] objArr50222 = new java.lang.Object[1];
                c("\u000b\n\ufff7\n\tￃ\b\ufffb\u0010\uffff\n\uffff\u0004\ufff7\t\t", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, 14 - android.view.MotionEvent.axisFromString(str), true, android.graphics.Color.blue(0) + 16, objArr50222);
                java.lang.String intern23222 = ((java.lang.String) objArr50222[0]).intern();
                java.lang.Object[] objArr51222 = new java.lang.Object[1];
                b(new int[]{125, 9, 110, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000", true, objArr51222);
                java.lang.String intern24222 = ((java.lang.String) objArr51222[0]).intern();
                java.lang.Object[] objArr52222 = new java.lang.Object[1];
                b(new int[]{134, 10, 90, 4}, "\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001", false, objArr52222);
                java.lang.String intern25222 = ((java.lang.String) objArr52222[0]).intern();
                java.lang.Object[] objArr53222 = new java.lang.Object[1];
                c("\b\u000b\ufffe￼\ufffa\u000b\rￏ\ufffe\r\u000e", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 125, 7 - android.text.TextUtils.getOffsetAfter(str, 0), true, 11 - android.text.TextUtils.indexOf(str, str, 0), objArr53222);
                java.lang.String intern26222 = ((java.lang.String) objArr53222[0]).intern();
                java.lang.Object[] objArr54222 = new java.lang.Object[1];
                b(new int[]{144, 11, 74, 0}, "\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001", false, objArr54222);
                java.lang.String intern27222 = ((java.lang.String) objArr54222[0]).intern();
                java.lang.Object[] objArr55222 = new java.lang.Object[1];
                b(new int[]{155, 15, 0, 13}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001", false, objArr55222);
                java.lang.String intern28222 = ((java.lang.String) objArr55222[0]).intern();
                java.lang.Object[] objArr56222 = new java.lang.Object[1];
                c("\ufff7\u0001￼\n\u0001\b\u0006\uffff\u0002\ufff5\u0000\f\u0006\ufff2", 130 - android.view.View.resolveSizeAndState(0, 0, 0), 6 - (android.view.ViewConfiguration.getTapTimeout() >> 16), true, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 14, objArr56222);
                java.lang.String[] strArr5222 = {intern21022, intern31022, intern4722, intern5222, intern6222, intern7222, intern8222, intern9222, intern10222, intern11222, intern12222, intern13222, intern14222, intern15222, intern16222, intern17222, intern18222, intern19222, intern20222, intern21222, intern22222, intern23222, intern24222, intern25222, intern26222, intern27222, intern28222, ((java.lang.String) objArr56222[0]).intern()};
                java.lang.Object[] objArr57222 = new java.lang.Object[1];
                b(new int[]{0, 11, 156, 1}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001", true, objArr57222);
                java.lang.Object[] objArr58222 = {((java.lang.String) objArr57222[0]).intern()};
                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj2 == null) {
                }
                str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr58222);
                if (str2 != null) {
                }
                i3 = i;
                str3 = str;
                j2 = j5;
                i4 = i13;
                java.lang.Object[] objArr7622222 = new java.lang.Object[1];
                b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 23, 0, 19}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000", false, objArr7622222);
                java.lang.Object[] objArr7722222 = {((java.lang.String) objArr7622222[0]).intern()};
                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj3 == null) {
                }
                long j1922222 = ~((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7722222)).longValue();
                long j2022222 = ((r1 * (-858)) - 221409591180L) + ((j2 | (-257453013)) * (-859)) + (((~(j | (-257453013))) | (~(257453012 | j1922222 | j2))) * 859) + (((~(j1922222 | (-257453013))) | (~(j1922222 | j))) * 859) + 1547993080;
                j3 = (((int) j2022222) & ((((~((-864120318) | i3)) | (-1993620569)) * (-318)) + 158946635 + (((~((-1993620569) | i3)) | (~(2010480125 | i4))) * 318) + (((~((-1146359809) | i4)) | (~(2010480125 | i3))) * 318))) | (((int) (j2022222 >> 32)) & (((((~((-1125806409) | i4)) | 16448) * (-108)) - 564914248) + (((~(1731934476 | i3)) | 606144516 | (~((-1731934477) | i4))) * 54) + ((606144516 | i3) * 54)));
                java.lang.Object[] objArr7922222 = new java.lang.Object[1];
                b(new int[]{193, 17, 103, 0}, "\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", false, objArr7922222);
                java.lang.Object[] objArr8022222 = {((java.lang.String) objArr7922222[0]).intern()};
                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj4 == null) {
                }
                long longValue622222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr8022222)).longValue();
                long j2122222 = (565 * longValue622222) + 478334234754L + (((~(longValue622222 | j2)) | (~((~longValue622222) | j)) | 849616757) * (-564)) + ((~(849616757 | longValue622222 | j2)) * 1128) + (((~(j | 849616757)) | (~(longValue622222 | (-849616758)))) * 564) + 2140156825;
                int i2122222 = ~(1006639107 | i4);
                long j2222222 = (((int) (j2122222 >> 32)) & ((((((~((-1200098635) | i4)) | (~((-237127777) | i3))) | (~(237127776 | i4))) * 959) - 611618391) + (((~((-1200098635) | i3)) | (~((-237127777) | i4)) | (~(237127776 | i3))) * 959))) | (((int) j2122222) & (((1851101778 | i2122222) * 764) + 735836633 + (((~(1851101778 | i4)) | 268437505) * (-1528)) + ((i2122222 | 1381337681) * 764)));
                if (j3 <= 0) {
                }
                java.lang.Object[] objArr8522222 = new java.lang.Object[1];
                b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 23, 0, 19}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000", false, objArr8522222);
                java.lang.Object[] objArr8622222 = {((java.lang.String) objArr8522222[0]).intern()};
                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj5 == null) {
                }
                long longValue722222 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8622222)).longValue();
                long j2322222 = ~longValue722222;
                long j2422222 = ((-675) * longValue722222) + 702606242762L + ((j2 | 1037823106 | j2322222) * (-676)) + (((~(j | 1037823106)) | (~(1037823106 | j2322222))) * 676) + (((~(longValue722222 | 1037823106 | j2)) | (~((-1037823107) | j2322222)) | (~(j2322222 | j))) * 676) + 252716961;
                int i2322222 = ~((-1409302929) | i3);
                j4 = (((int) (j2422222 >> 32)) & (((~((-144708137) | i4)) * (-783)) + 1958222673 + (((~((-1492573758) | i4)) | 1365167127) * 783))) | (((int) j2422222) & (((25690113 | i2322222) * (-476)) + 1388037233 + (i2322222 * 952) + ((~((-1409302929) | i4)) * 476)));
                str4 = str3;
                java.lang.Object[] objArr8822222 = new java.lang.Object[1];
                c("\u001b\n\tￔ", android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 113, 5 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, '4' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr8822222);
                java.lang.Object[] objArr8922222 = {((java.lang.String) objArr8822222[0]).intern()};
                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj6 == null) {
                }
                long longValue822222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr8922222)).longValue();
                long j2522222 = ~(324866605 | longValue822222);
                long j2622222 = (~longValue822222) | (-324866606);
                long j2722222 = ((1435 * longValue822222) - 232604489180L) + ((longValue822222 | (-324866606)) * (-1434)) + (((~(j2622222 | j2)) | (~(j | longValue822222)) | j2522222) * 717) + (((~(longValue822222 | j2)) | (~(j2622222 | j)) | j2522222) * 717) + 965673462;
                int i2422222 = ~((-43403879) | i4);
                long j2822222 = (((int) (j2722222 >> 32)) & ((((~((-2085134354) | i3)) | 1480630289 | i2422222) * (-470)) + 1548760288 + ((i2422222 | (~((-604504065) | i3))) * 470))) | (((int) j2722222) & ((((~(350947524 | i3)) | (-1788173935)) * 56) + 858099341 + (((~((-1788173935) | i4)) | 350947524) * 56)));
                if (j4 <= 0) {
                }
                java.lang.Object[] objArr9422222 = new java.lang.Object[1];
                c("\ufffe\r\f\u0012\f\uffc8\u0006", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 6 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), true, android.widget.ExpandableListView.getPackedPositionChild(0L) + 8, objArr9422222);
                java.lang.String intern3022222 = ((java.lang.String) objArr9422222[0]).intern();
                java.lang.Object[] objArr9522222 = new java.lang.Object[1];
                b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 11, 0, 10}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001", true, objArr9522222);
                java.lang.String intern3122222 = ((java.lang.String) objArr9522222[0]).intern();
                java.lang.Object[] objArr9622222 = new java.lang.Object[1];
                c("\u0010\u0011\u0002\nￌ\u0010\uffff\u0006\u000bￌ\u0010\u0016", android.os.Process.getGidForName(str4) + 121, 9 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), false, 13 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr9622222);
                java.lang.String intern3222222 = ((java.lang.String) objArr9622222[0]).intern();
                str5 = str4;
                java.lang.Object[] objArr9722222 = new java.lang.Object[1];
                c("\u0001\u0010\u000f\u0015\u000fￋ\n\u0005\ufffe\u0014ￋ\t", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 120, 6 - android.text.TextUtils.getOffsetBefore(str5, 0), true, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, objArr9722222);
                java.lang.String intern3322222 = ((java.lang.String) objArr9722222[0]).intern();
                java.lang.Object[] objArr9822222 = new java.lang.Object[1];
                b(new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, 11, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false, objArr9822222);
                java.lang.String intern3422222 = ((java.lang.String) objArr9822222[0]).intern();
                java.lang.Object[] objArr9922222 = new java.lang.Object[1];
                c("\u0003\n\u000f\uffd0\u0014", 116 - android.graphics.Color.argb(0, 0, 0, 0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 3, false, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 5, objArr9922222);
                java.lang.String intern3522222 = ((java.lang.String) objArr9922222[0]).intern();
                java.lang.Object[] objArr10022222 = new java.lang.Object[1];
                c("\u000bￕ\t\u001a", android.text.TextUtils.indexOf(str5, str5, 0, 0) + 111, 1 - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), true, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, objArr10022222);
                strArr = new java.lang.String[]{intern3022222, intern3122222, intern3222222, intern3322222, intern3422222, intern3522222, ((java.lang.String) objArr10022222[0]).intern()};
                i5 = 0;
                while (true) {
                    if (i5 < 7) {
                    }
                    i5 = i10 + 1;
                    strArr = strArr2;
                    str5 = str6;
                }
                if (i6 == 0) {
                }
            } catch (java.lang.Throwable th5) {
                java.lang.Throwable cause5 = th5.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th5;
            }
        }

        static void init$0() {
            $$a = new byte[]{126, -1, -74, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10};
            $$b = 6;
        }
    }

    public static com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed> DigitizedCardProfile() {
        com.payair.hce.readJsonFromLocalStorage.AnonymousClass2 anonymousClass2 = new com.payair.hce.readJsonFromLocalStorage.AnonymousClass2();
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 39;
        getAid = i % 128;
        if (i % 2 == 0) {
            return anonymousClass2;
        }
        throw null;
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.postToastMessageOnUi {
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 7) % 128;
        super.valueOf(transactioncanberesumed);
        super.AlternateContactlessPaymentDataJson(transactioncanberesumed);
        int i = getAid + 19;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        $11 = ($10 + 85) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            int i2 = $11 + 23;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = getdsrpdata.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 31, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1891, (char) (3600 - android.view.Gravity.getAbsoluteGravity(0, 0)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((short) -1, (short) 9, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                    }
                    jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() & (values ^ (-4761752123935132024L));
                    java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(65 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1444, (char) (android.graphics.Color.rgb(0, 0, 0) + 16806898));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d((short) -1, (short) 8, (short) 0, objArr5);
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
            } else {
                int i4 = getdsrpdata.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 31, 1890 - android.text.TextUtils.getOffsetBefore("", 0), (char) (3600 - android.view.KeyEvent.keyCodeFromString("")));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    d((short) -1, (short) 9, (short) 0, objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj3);
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).longValue() ^ (values ^ (-4761752123935132024L));
                java.lang.Object[] objArr8 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj4 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1444, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29682));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    d((short) -1, (short) 8, (short) 0, objArr9);
                    obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            $11 = ($10 + 121) % 128;
        }
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        $11 = ($10 + 45) % 128;
        while (getdsrpdata.valueOf < charArray.length) {
            int i5 = $11 + 115;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
                java.lang.Object[] objArr10 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj5 == null) {
                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 65, 1443 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (29682 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    d((short) -1, (short) 8, (short) 0, objArr11);
                    obj5 = cls5.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
                throw new java.lang.ArithmeticException();
            }
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr12 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj6 == null) {
                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777280, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1443, (char) (android.os.Process.getGidForName("") + 29683));
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                d((short) -1, (short) 8, (short) 0, objArr13);
                obj6 = cls6.getMethod((java.lang.String) objArr13[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj6);
            }
            ((java.lang.reflect.Method) obj6).invoke(null, objArr12);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean writeReplace() {
        if (this.writeReplace != 0) {
            SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 17) % 128;
            if (((com.payair.hce.transactionCanBeResumed) this.writeReplace).DigitizedCardProfile() != 0) {
                boolean equals = java.util.Arrays.equals(((com.payair.hce.transactionCanBeResumed) this.writeReplace).valueOf(), new byte[((com.payair.hce.transactionCanBeResumed) this.writeReplace).DigitizedCardProfile()]);
                getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 21) % 128;
                return equals;
            }
        }
        getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 113) % 128;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean values() {
        if (java.util.Arrays.equals(((com.payair.hce.transactionCanBeResumed) this.writeReplace).valueOf(), new byte[8])) {
            int i = SdkCoreAlternateContactlessPaymentDataImpl + 45;
            getAid = i % 128;
            if (i % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i2 = getAid + 11;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 != 0) {
            return true;
        }
        throw null;
    }

    private static void c(int i, int i2, byte b, int i3, short s, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(DigitizedCardProfile)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 29 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                $10 = ($11 + 115) % 128;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                $10 = ($11 + 19) % 128;
                byte[] bArr = getProfileVersion;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i5])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.view.KeyEvent.keyCodeFromString("") + 5088, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = getProfileVersion;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777189) - android.graphics.Color.rgb(0, 0, 0), 30 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                    }
                    intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
                } else {
                    intValue = (short) (((short) (RecordsJson[i + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
                }
            }
            if (intValue > 0) {
                int i6 = $11;
                $10 = (i6 + 35) % 128;
                int i7 = (int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L));
                if (z) {
                    $10 = (i6 + 93) % 128;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                gettrack2constructiondata.writeReplace = ((i + intValue) - 2) + i7 + i4;
                java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(valueOf), sb};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 27, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2364, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d((short) -1, (short) 0, (short) 0, objArr6);
                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                byte[] bArr4 = getProfileVersion;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    loop1: while (true) {
                        int i8 = 0;
                        while (i8 < length2) {
                            int i9 = $10 + 21;
                            $11 = i9 % 128;
                            if (i9 % 2 == 0) {
                                break;
                            }
                            bArr5[i8] = (byte) (bArr4[i8] ^ (-4897270311952305750L));
                            i8++;
                        }
                        bArr5[i8] = (byte) (bArr4[i8] * (-4897270311952305750L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                gettrack2constructiondata.DigitizedCardProfile = 1;
                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                    $10 = ($11 + 119) % 128;
                    if (z2) {
                        byte[] bArr6 = getProfileVersion;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                    } else {
                        short[] sArr = RecordsJson;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                    }
                    sb.append(gettrack2constructiondata.values);
                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                    gettrack2constructiondata.DigitizedCardProfile++;
                }
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.readJsonFromLocalStorage readjsonfromlocalstorage = (com.payair.hce.readJsonFromLocalStorage) objArr[0];
        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 113) % 128;
        if ((((com.payair.hce.transactionCanBeResumed) readjsonfromlocalstorage.writeReplace).AlternateContactlessPaymentDataJson(0) & 4) != 4) {
            return bool;
        }
        int i4 = getAid + 125;
        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
        return i4 % 2 == 0 ? bool : java.lang.Boolean.TRUE;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getAid = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        values = -9197895392093168401L;
        AlternateContactlessPaymentDataJson = -354003553;
        DigitizedCardProfile = 520368625;
        valueOf = -198210204;
        getProfileVersion = new byte[]{-74, -112, -71, -106, -79, -112, -120, -55, 66, -116, 121, 97, 17, 121, com.google.common.base.Ascii.US, -45, 36, 45, 44, -42, 43, 38, -126, -92, -78, -74, -122, -73, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -90, -120, -126, -91, com.visa.cbp.getEncExpo.onUnminimized, Byte.MAX_VALUE, -122, -93, -122, -70, -78, -73, -9, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -78, Byte.MAX_VALUE, 75, Byte.MAX_VALUE, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 71, -38, 33, -38, -42, 44, 45, 97, 125, 111, 124, 99, 77, 75, 65, 70, 100, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -92, 92, -94, 110, -118, -39, 83, -122, -97, -74, -106, -115, -104, -66, -97, -120, -73, -114, -117, -102, -117, -79, -117, -116, 102, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 105, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 120, 103, 126, 123, 74, 123, 97, 123, 124, 114, 97, 114, 126, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 111, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -10, -11, -37, -31, -11, 14, -77, -63, -29, -59, -7, -61, -13, -63, -26, 3, 101, 68, 102, 76, com.visa.cbp.getEncExpo.IResultReceiver, com.visa.cbp.getEncExpo.IResultReceiver, com.visa.cbp.getEncExpo.IResultReceiver2, 115, -127, -31, -13, -54, -3, -51, -10, -10, -29, -14, 86, 65, 82, 87, 68, 67, 82, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 86, 70, 76, Byte.MAX_VALUE, 72, 77, Byte.MAX_VALUE, 117, 122, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 114, 121, 72, 101, 76, 124, -67, -15, -9, 35, -78, -12, -19, -3, -6, -10, 48, 101, 120, 78, com.google.common.base.Ascii.DC4, 120, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 48, 97, 114, 105, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 111, 100, 121, -72, 10, 35, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 56, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 118, -1, -3, -107, 62, -72, -14, -21, -5, -32, -4, 62, -111, -105, -61, 89, -109, -21, -122, -107, -113, -41, -12, -44, com.google.common.base.Ascii.SI, Byte.MAX_VALUE, 114, 113, -92, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 102, 125, 98, 77, -94, 57, 123, 62, com.google.common.base.Ascii.VT, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, kotlin.io.encoding.Base64.padSymbol, 10, 6, 45, com.google.common.base.Ascii.US, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.ETB, 19, com.google.common.base.Ascii.CAN, 16, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.google.common.base.Ascii.GS, 80, 42, 8, 18, 80, -59, 106, com.google.common.base.Ascii.SUB, 16, -121, -109, -123, -98, -121, -99, 65, 83, 71, 65, 71, 71, 124, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 65, 66, -123, com.google.common.base.Ascii.FF, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 91, -102, com.google.common.base.Ascii.SI, 70, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 75, 70, 82, 74, -31, 37, 59, com.google.common.base.Ascii.ETB, -25, 63, 34, -44, 39, 109, -14, -35, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 45, com.google.common.base.Ascii.NAK, -38, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FS, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 89, -127, -58, 41, 13, -59, -101, -33, -35, 9, -104, -46, -53, -37, com.visa.cbp.getEncExpo.startTransaction, -36, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ESC, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 93, -119, 0, 88, -98, -52, -32, -25, -25, -27, 59, -83, -7, -3, -1, -25, -3, -24, 62, -90, -9, 45, -90, -32, -4, 62, -5, -32, -21, -14, -56, -34, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -19, -15, -23, 38, -79, -109, -55, -17, 94, -87, 117, 89, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86, -86};
    }

    static void init$1() {
        $$d = new byte[]{75, -78, -116, -102};
        $$e = 21;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x13c3, code lost:
    
        if (((r2 & ((((((~(1190918505 | r64)) | 1666822379) * (-318)) - 1844164314) + (((~(1666822379 | r64)) | (~(r28 | (-1113174122)))) * 318)) + (((~(r28 | (-77744385))) | (~((-1113174122) | r64))) * 318))) | (((int) r9) & ((((4458816 | r10) * (-970)) - 914099755) + ((r10 | 805351552) * 970)))) != 477111747) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x14c6, code lost:
    
        r2 = 0;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x14ca, code lost:
    
        if (r2 >= 28) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x14cc, code lost:
    
        r8 = r3[r2];
        r12 = android.text.TextUtils.indexOf(r11, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        r26 = r11;
        r11 = new java.lang.Object[1];
        c(r12 + 169712756, (-78) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), (byte) android.widget.ExpandableListView.getPackedPositionGroup(0), 349455202 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), (short) ((android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) - 87), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x151c, code lost:
    
        r8 = new java.lang.Object[]{((java.lang.String) r11[0]).intern().concat(java.lang.String.valueOf(r8))};
        r9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x152d, code lost:
    
        if (r9 != null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x152f, code lost:
    
        r9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 37, (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 3160, (char) ((android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 33098));
        r10 = com.payair.hce.readJsonFromLocalStorage.$$a;
        r13 = new java.lang.Object[1];
        b(r10[21], 41, r10[14], r13);
        r9 = r9.getMethod((java.lang.String) r13[0], java.lang.String.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x158b, code lost:
    
        r10 = ~((java.lang.Long) ((java.lang.reflect.Method) r9).invoke(null, r8)).longValue();
        r8 = (((((r8 * (-864)) - 719806644732L) + (((~(831185501 | r6)) | r10) * (-865))) + ((~((-831185502) | r4)) * 865)) + (((~(r10 | r6)) | (~((-831185502) | r6))) * 865)) + 1826620405;
        r11 = ~(r28 | 189376627);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x15ef, code lost:
    
        if (((((int) r8) & (((((~((-403859021) | r64)) | (-1033367390)) * (-756)) - 604183519) + ((r28 | (-403859021)) * 756))) | (((int) (r8 >> 32)) & ((((17367104 | r11) * (-970)) + 1757935340) + ((r11 | 172009523) * 970)))) != 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x15f1, code lost:
    
        com.payair.hce.readJsonFromLocalStorage.SdkCoreAlternateContactlessPaymentDataImpl = (com.payair.hce.readJsonFromLocalStorage.getAid + 63) % 128;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x15fc, code lost:
    
        r3 = r3 + r8;
        r2 = r2 + 1;
        r11 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x15fb, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x1603, code lost:
    
        r26 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x160d, code lost:
    
        if (r3 < 25.2d) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x160f, code lost:
    
        r3 = new java.lang.Object[]{new int[]{r64}, new int[]{r64 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, null, new int[1]};
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x1629, code lost:
    
        r4 = new java.lang.Object[]{-688606955, 16, java.lang.Integer.valueOf(((((~(r28 | (-386536210))) | (~(322789310 | r64))) * 959) - 294407519) + (((~(r64 | (-386536210))) | (~(r28 | 322789310))) * 959))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x1673, code lost:
    
        if (r1 != null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x1675, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(r26, r26), 2713 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.text.TextUtils.lastIndexOf(r26, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
        r2 = (byte) (com.payair.hce.readJsonFromLocalStorage.$$a[14] - 1);
        r7 = new java.lang.Object[1];
        b(r2, r2, r2, r7);
        r1 = r1.getMethod((java.lang.String) r7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x16d7, code lost:
    
        ((int[]) r3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r4)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x16df, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x16e0, code lost:
    
        r9 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x22af, code lost:
    
        if (((((int) r1) & ((((((~(r28 | (-1489143211))) | 51916800) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) - 754630175) + (((~(r28 | 119306320)) | (-1556532731)) * (-440))) + (((-1489143211) | r64) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) | (((int) (r1 >> 32)) & (((((~(r28 | 420824812)) | (~((-1858051224) | r64))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1205915596) + (((~(r28 | (-135595141))) | (~(2143280895 | r64))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)))) == 0) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x062e, code lost:
    
        if (((((int) (r12 >> 32)) & ((((~((-277357985) | r64)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 645247682) + (((~(r28 | (-277357985))) | 1092616200) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) | (((int) r12) & (((((~((-151134290) | r64)) | (-1610085884)) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) - 646917636) + ((~(r28 | (-151134290))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING)))) != 477111747) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x14c4, code lost:
    
        if (((r2 & (((((1073741824 | r3) * (-814)) - 264416467) + ((r3 | ((~(r28 | 939219260)) | 94439460)) * 407)) + ((((~(1918521624 | r64)) | 94439460) | (~((-939219261) | r64))) * 407))) | (((((((~(r28 | 559424721)) | (-895104218)) | r9) * (-252)) + 629777341) + ((r9 | (~(r28 | (-335679497)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE)) & r8)) == 477111747) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x074a, code lost:
    
        if (((((int) (r8 >> 32)) & ((((((~(r28 | 934408525)) | 502817885) * (-1042)) - 83197638) + ((934408525 | r64) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)) + ((((~((-502817886) | r64)) | 363880525) | (~(r28 | 1073345885))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) | (((int) r8) & ((((r28 | (-92348998)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 1142534819) + (((~(r28 | 1920877576)) | (-1168712262)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)))) != (-1032769152)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x085b, code lost:
    
        if (((((int) r2) & ((((18876676 | r3) * (-196)) - 236450299) + ((r3 | (-732295080)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))) | (((int) (r2 >> 32)) & ((((((~(r28 | (-1513362949))) | (~(2054559524 | r64))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 748005734) + (((~(r28 | (-2054559525))) | r9) * (-1040))) + ((r9 | ((~(r28 | 617333113)) | 541196576)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL)))) == 542074309) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0a29, code lost:
    
        if (r2.equals(((java.lang.String) r10[0]).intern()) != false) goto L84;
     */
    /* JADX WARN: Multi-variable search skipped. Vars limit reached: 5530 (expected less than 5000) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x1718 A[Catch: all -> 0x44ef, TryCatch #8 {all -> 0x44ef, blocks: (B:3:0x0004, B:5:0x001e, B:6:0x005d, B:10:0x010c, B:12:0x015d, B:13:0x01aa, B:18:0x01ff, B:20:0x0212, B:21:0x025e, B:31:0x033b, B:33:0x034e, B:34:0x039c, B:36:0x03bd, B:38:0x03d0, B:39:0x0423, B:41:0x042c, B:43:0x044a, B:44:0x0499, B:48:0x0534, B:50:0x0552, B:51:0x05ab, B:55:0x0632, B:57:0x0650, B:58:0x06a8, B:61:0x074e, B:63:0x076c, B:64:0x07c7, B:70:0x087a, B:72:0x088d, B:73:0x08dd, B:78:0x0a4d, B:80:0x0a9d, B:81:0x0aeb, B:85:0x09a4, B:87:0x09b7, B:88:0x0a07, B:93:0x108a, B:95:0x109d, B:96:0x10ef, B:106:0x11d6, B:108:0x11e9, B:109:0x1239, B:111:0x125a, B:113:0x126d, B:114:0x12b7, B:116:0x12c0, B:118:0x12de, B:119:0x1333, B:125:0x151c, B:127:0x152f, B:128:0x157e, B:140:0x1629, B:142:0x1675, B:143:0x16ca, B:148:0x1705, B:150:0x1718, B:151:0x1764, B:153:0x1853, B:155:0x1866, B:156:0x18b7, B:166:0x19a2, B:168:0x19f9, B:169:0x1a4c, B:175:0x1a7b, B:177:0x1a8e, B:178:0x1adb, B:180:0x1b8b, B:182:0x1b9e, B:183:0x1bee, B:193:0x1cb2, B:195:0x1d02, B:196:0x1d57, B:205:0x1ecf, B:207:0x1ee2, B:208:0x1f2f, B:216:0x1ffd, B:218:0x2050, B:219:0x20a3, B:246:0x24b7, B:248:0x24ff, B:249:0x2554, B:253:0x25ac, B:255:0x25bf, B:256:0x260a, B:269:0x28bc, B:271:0x28cf, B:272:0x291d, B:280:0x29da, B:282:0x2a1d, B:283:0x2a6a, B:287:0x2aa3, B:289:0x2acc, B:290:0x2b25, B:297:0x2bd5, B:299:0x2c1b, B:300:0x2c6c, B:304:0x2cd1, B:306:0x2cfa, B:307:0x2d57, B:311:0x2de7, B:313:0x2e3d, B:314:0x2e8e, B:317:0x2ea4, B:319:0x2eb3, B:320:0x2efe, B:324:0x2fba, B:326:0x3007, B:327:0x3058, B:331:0x306f, B:333:0x3088, B:334:0x30d6, B:338:0x3181, B:340:0x31d3, B:341:0x3226, B:344:0x323c, B:346:0x324b, B:347:0x3292, B:351:0x3333, B:353:0x3387, B:354:0x33da, B:357:0x33f0, B:359:0x33ff, B:360:0x344b, B:364:0x34eb, B:366:0x353a, B:367:0x358e, B:370:0x35a4, B:372:0x35b3, B:373:0x35fd, B:377:0x36ca, B:379:0x3715, B:380:0x3766, B:384:0x379f, B:386:0x37c9, B:387:0x3828, B:391:0x38e6, B:393:0x393d, B:394:0x398e, B:398:0x39bf, B:400:0x39d2, B:401:0x3a22, B:405:0x3acb, B:407:0x3b27, B:408:0x3b77, B:411:0x3b8d, B:413:0x3b9c, B:414:0x3be6, B:418:0x3c9c, B:420:0x3ce4, B:421:0x3d3a, B:424:0x3d50, B:426:0x3d5f, B:427:0x3da7, B:431:0x3e57, B:433:0x3ea1, B:434:0x3ef3, B:437:0x3f09, B:439:0x3f18, B:440:0x3f64, B:444:0x3fff, B:446:0x404f, B:447:0x409d, B:450:0x40b3, B:452:0x40c2, B:453:0x410b, B:459:0x41d8, B:461:0x422b, B:462:0x427f, B:464:0x4294, B:466:0x42a7, B:467:0x42ec, B:469:0x42f4, B:471:0x4324, B:472:0x437d, B:477:0x442b, B:479:0x447f, B:480:0x44cf, B:552:0x13c7, B:554:0x13e5, B:555:0x1437), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x1866 A[Catch: all -> 0x44ef, TryCatch #8 {all -> 0x44ef, blocks: (B:3:0x0004, B:5:0x001e, B:6:0x005d, B:10:0x010c, B:12:0x015d, B:13:0x01aa, B:18:0x01ff, B:20:0x0212, B:21:0x025e, B:31:0x033b, B:33:0x034e, B:34:0x039c, B:36:0x03bd, B:38:0x03d0, B:39:0x0423, B:41:0x042c, B:43:0x044a, B:44:0x0499, B:48:0x0534, B:50:0x0552, B:51:0x05ab, B:55:0x0632, B:57:0x0650, B:58:0x06a8, B:61:0x074e, B:63:0x076c, B:64:0x07c7, B:70:0x087a, B:72:0x088d, B:73:0x08dd, B:78:0x0a4d, B:80:0x0a9d, B:81:0x0aeb, B:85:0x09a4, B:87:0x09b7, B:88:0x0a07, B:93:0x108a, B:95:0x109d, B:96:0x10ef, B:106:0x11d6, B:108:0x11e9, B:109:0x1239, B:111:0x125a, B:113:0x126d, B:114:0x12b7, B:116:0x12c0, B:118:0x12de, B:119:0x1333, B:125:0x151c, B:127:0x152f, B:128:0x157e, B:140:0x1629, B:142:0x1675, B:143:0x16ca, B:148:0x1705, B:150:0x1718, B:151:0x1764, B:153:0x1853, B:155:0x1866, B:156:0x18b7, B:166:0x19a2, B:168:0x19f9, B:169:0x1a4c, B:175:0x1a7b, B:177:0x1a8e, B:178:0x1adb, B:180:0x1b8b, B:182:0x1b9e, B:183:0x1bee, B:193:0x1cb2, B:195:0x1d02, B:196:0x1d57, B:205:0x1ecf, B:207:0x1ee2, B:208:0x1f2f, B:216:0x1ffd, B:218:0x2050, B:219:0x20a3, B:246:0x24b7, B:248:0x24ff, B:249:0x2554, B:253:0x25ac, B:255:0x25bf, B:256:0x260a, B:269:0x28bc, B:271:0x28cf, B:272:0x291d, B:280:0x29da, B:282:0x2a1d, B:283:0x2a6a, B:287:0x2aa3, B:289:0x2acc, B:290:0x2b25, B:297:0x2bd5, B:299:0x2c1b, B:300:0x2c6c, B:304:0x2cd1, B:306:0x2cfa, B:307:0x2d57, B:311:0x2de7, B:313:0x2e3d, B:314:0x2e8e, B:317:0x2ea4, B:319:0x2eb3, B:320:0x2efe, B:324:0x2fba, B:326:0x3007, B:327:0x3058, B:331:0x306f, B:333:0x3088, B:334:0x30d6, B:338:0x3181, B:340:0x31d3, B:341:0x3226, B:344:0x323c, B:346:0x324b, B:347:0x3292, B:351:0x3333, B:353:0x3387, B:354:0x33da, B:357:0x33f0, B:359:0x33ff, B:360:0x344b, B:364:0x34eb, B:366:0x353a, B:367:0x358e, B:370:0x35a4, B:372:0x35b3, B:373:0x35fd, B:377:0x36ca, B:379:0x3715, B:380:0x3766, B:384:0x379f, B:386:0x37c9, B:387:0x3828, B:391:0x38e6, B:393:0x393d, B:394:0x398e, B:398:0x39bf, B:400:0x39d2, B:401:0x3a22, B:405:0x3acb, B:407:0x3b27, B:408:0x3b77, B:411:0x3b8d, B:413:0x3b9c, B:414:0x3be6, B:418:0x3c9c, B:420:0x3ce4, B:421:0x3d3a, B:424:0x3d50, B:426:0x3d5f, B:427:0x3da7, B:431:0x3e57, B:433:0x3ea1, B:434:0x3ef3, B:437:0x3f09, B:439:0x3f18, B:440:0x3f64, B:444:0x3fff, B:446:0x404f, B:447:0x409d, B:450:0x40b3, B:452:0x40c2, B:453:0x410b, B:459:0x41d8, B:461:0x422b, B:462:0x427f, B:464:0x4294, B:466:0x42a7, B:467:0x42ec, B:469:0x42f4, B:471:0x4324, B:472:0x437d, B:477:0x442b, B:479:0x447f, B:480:0x44cf, B:552:0x13c7, B:554:0x13e5, B:555:0x1437), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x1966  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x1a8e A[Catch: all -> 0x44ef, TryCatch #8 {all -> 0x44ef, blocks: (B:3:0x0004, B:5:0x001e, B:6:0x005d, B:10:0x010c, B:12:0x015d, B:13:0x01aa, B:18:0x01ff, B:20:0x0212, B:21:0x025e, B:31:0x033b, B:33:0x034e, B:34:0x039c, B:36:0x03bd, B:38:0x03d0, B:39:0x0423, B:41:0x042c, B:43:0x044a, B:44:0x0499, B:48:0x0534, B:50:0x0552, B:51:0x05ab, B:55:0x0632, B:57:0x0650, B:58:0x06a8, B:61:0x074e, B:63:0x076c, B:64:0x07c7, B:70:0x087a, B:72:0x088d, B:73:0x08dd, B:78:0x0a4d, B:80:0x0a9d, B:81:0x0aeb, B:85:0x09a4, B:87:0x09b7, B:88:0x0a07, B:93:0x108a, B:95:0x109d, B:96:0x10ef, B:106:0x11d6, B:108:0x11e9, B:109:0x1239, B:111:0x125a, B:113:0x126d, B:114:0x12b7, B:116:0x12c0, B:118:0x12de, B:119:0x1333, B:125:0x151c, B:127:0x152f, B:128:0x157e, B:140:0x1629, B:142:0x1675, B:143:0x16ca, B:148:0x1705, B:150:0x1718, B:151:0x1764, B:153:0x1853, B:155:0x1866, B:156:0x18b7, B:166:0x19a2, B:168:0x19f9, B:169:0x1a4c, B:175:0x1a7b, B:177:0x1a8e, B:178:0x1adb, B:180:0x1b8b, B:182:0x1b9e, B:183:0x1bee, B:193:0x1cb2, B:195:0x1d02, B:196:0x1d57, B:205:0x1ecf, B:207:0x1ee2, B:208:0x1f2f, B:216:0x1ffd, B:218:0x2050, B:219:0x20a3, B:246:0x24b7, B:248:0x24ff, B:249:0x2554, B:253:0x25ac, B:255:0x25bf, B:256:0x260a, B:269:0x28bc, B:271:0x28cf, B:272:0x291d, B:280:0x29da, B:282:0x2a1d, B:283:0x2a6a, B:287:0x2aa3, B:289:0x2acc, B:290:0x2b25, B:297:0x2bd5, B:299:0x2c1b, B:300:0x2c6c, B:304:0x2cd1, B:306:0x2cfa, B:307:0x2d57, B:311:0x2de7, B:313:0x2e3d, B:314:0x2e8e, B:317:0x2ea4, B:319:0x2eb3, B:320:0x2efe, B:324:0x2fba, B:326:0x3007, B:327:0x3058, B:331:0x306f, B:333:0x3088, B:334:0x30d6, B:338:0x3181, B:340:0x31d3, B:341:0x3226, B:344:0x323c, B:346:0x324b, B:347:0x3292, B:351:0x3333, B:353:0x3387, B:354:0x33da, B:357:0x33f0, B:359:0x33ff, B:360:0x344b, B:364:0x34eb, B:366:0x353a, B:367:0x358e, B:370:0x35a4, B:372:0x35b3, B:373:0x35fd, B:377:0x36ca, B:379:0x3715, B:380:0x3766, B:384:0x379f, B:386:0x37c9, B:387:0x3828, B:391:0x38e6, B:393:0x393d, B:394:0x398e, B:398:0x39bf, B:400:0x39d2, B:401:0x3a22, B:405:0x3acb, B:407:0x3b27, B:408:0x3b77, B:411:0x3b8d, B:413:0x3b9c, B:414:0x3be6, B:418:0x3c9c, B:420:0x3ce4, B:421:0x3d3a, B:424:0x3d50, B:426:0x3d5f, B:427:0x3da7, B:431:0x3e57, B:433:0x3ea1, B:434:0x3ef3, B:437:0x3f09, B:439:0x3f18, B:440:0x3f64, B:444:0x3fff, B:446:0x404f, B:447:0x409d, B:450:0x40b3, B:452:0x40c2, B:453:0x410b, B:459:0x41d8, B:461:0x422b, B:462:0x427f, B:464:0x4294, B:466:0x42a7, B:467:0x42ec, B:469:0x42f4, B:471:0x4324, B:472:0x437d, B:477:0x442b, B:479:0x447f, B:480:0x44cf, B:552:0x13c7, B:554:0x13e5, B:555:0x1437), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x1b9e A[Catch: all -> 0x44ef, TryCatch #8 {all -> 0x44ef, blocks: (B:3:0x0004, B:5:0x001e, B:6:0x005d, B:10:0x010c, B:12:0x015d, B:13:0x01aa, B:18:0x01ff, B:20:0x0212, B:21:0x025e, B:31:0x033b, B:33:0x034e, B:34:0x039c, B:36:0x03bd, B:38:0x03d0, B:39:0x0423, B:41:0x042c, B:43:0x044a, B:44:0x0499, B:48:0x0534, B:50:0x0552, B:51:0x05ab, B:55:0x0632, B:57:0x0650, B:58:0x06a8, B:61:0x074e, B:63:0x076c, B:64:0x07c7, B:70:0x087a, B:72:0x088d, B:73:0x08dd, B:78:0x0a4d, B:80:0x0a9d, B:81:0x0aeb, B:85:0x09a4, B:87:0x09b7, B:88:0x0a07, B:93:0x108a, B:95:0x109d, B:96:0x10ef, B:106:0x11d6, B:108:0x11e9, B:109:0x1239, B:111:0x125a, B:113:0x126d, B:114:0x12b7, B:116:0x12c0, B:118:0x12de, B:119:0x1333, B:125:0x151c, B:127:0x152f, B:128:0x157e, B:140:0x1629, B:142:0x1675, B:143:0x16ca, B:148:0x1705, B:150:0x1718, B:151:0x1764, B:153:0x1853, B:155:0x1866, B:156:0x18b7, B:166:0x19a2, B:168:0x19f9, B:169:0x1a4c, B:175:0x1a7b, B:177:0x1a8e, B:178:0x1adb, B:180:0x1b8b, B:182:0x1b9e, B:183:0x1bee, B:193:0x1cb2, B:195:0x1d02, B:196:0x1d57, B:205:0x1ecf, B:207:0x1ee2, B:208:0x1f2f, B:216:0x1ffd, B:218:0x2050, B:219:0x20a3, B:246:0x24b7, B:248:0x24ff, B:249:0x2554, B:253:0x25ac, B:255:0x25bf, B:256:0x260a, B:269:0x28bc, B:271:0x28cf, B:272:0x291d, B:280:0x29da, B:282:0x2a1d, B:283:0x2a6a, B:287:0x2aa3, B:289:0x2acc, B:290:0x2b25, B:297:0x2bd5, B:299:0x2c1b, B:300:0x2c6c, B:304:0x2cd1, B:306:0x2cfa, B:307:0x2d57, B:311:0x2de7, B:313:0x2e3d, B:314:0x2e8e, B:317:0x2ea4, B:319:0x2eb3, B:320:0x2efe, B:324:0x2fba, B:326:0x3007, B:327:0x3058, B:331:0x306f, B:333:0x3088, B:334:0x30d6, B:338:0x3181, B:340:0x31d3, B:341:0x3226, B:344:0x323c, B:346:0x324b, B:347:0x3292, B:351:0x3333, B:353:0x3387, B:354:0x33da, B:357:0x33f0, B:359:0x33ff, B:360:0x344b, B:364:0x34eb, B:366:0x353a, B:367:0x358e, B:370:0x35a4, B:372:0x35b3, B:373:0x35fd, B:377:0x36ca, B:379:0x3715, B:380:0x3766, B:384:0x379f, B:386:0x37c9, B:387:0x3828, B:391:0x38e6, B:393:0x393d, B:394:0x398e, B:398:0x39bf, B:400:0x39d2, B:401:0x3a22, B:405:0x3acb, B:407:0x3b27, B:408:0x3b77, B:411:0x3b8d, B:413:0x3b9c, B:414:0x3be6, B:418:0x3c9c, B:420:0x3ce4, B:421:0x3d3a, B:424:0x3d50, B:426:0x3d5f, B:427:0x3da7, B:431:0x3e57, B:433:0x3ea1, B:434:0x3ef3, B:437:0x3f09, B:439:0x3f18, B:440:0x3f64, B:444:0x3fff, B:446:0x404f, B:447:0x409d, B:450:0x40b3, B:452:0x40c2, B:453:0x410b, B:459:0x41d8, B:461:0x422b, B:462:0x427f, B:464:0x4294, B:466:0x42a7, B:467:0x42ec, B:469:0x42f4, B:471:0x4324, B:472:0x437d, B:477:0x442b, B:479:0x447f, B:480:0x44cf, B:552:0x13c7, B:554:0x13e5, B:555:0x1437), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x1c74  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x1ecd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x1fe4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x20b9  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x249e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x256a  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x1fdf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x18b5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x109d A[Catch: all -> 0x44ef, TryCatch #8 {all -> 0x44ef, blocks: (B:3:0x0004, B:5:0x001e, B:6:0x005d, B:10:0x010c, B:12:0x015d, B:13:0x01aa, B:18:0x01ff, B:20:0x0212, B:21:0x025e, B:31:0x033b, B:33:0x034e, B:34:0x039c, B:36:0x03bd, B:38:0x03d0, B:39:0x0423, B:41:0x042c, B:43:0x044a, B:44:0x0499, B:48:0x0534, B:50:0x0552, B:51:0x05ab, B:55:0x0632, B:57:0x0650, B:58:0x06a8, B:61:0x074e, B:63:0x076c, B:64:0x07c7, B:70:0x087a, B:72:0x088d, B:73:0x08dd, B:78:0x0a4d, B:80:0x0a9d, B:81:0x0aeb, B:85:0x09a4, B:87:0x09b7, B:88:0x0a07, B:93:0x108a, B:95:0x109d, B:96:0x10ef, B:106:0x11d6, B:108:0x11e9, B:109:0x1239, B:111:0x125a, B:113:0x126d, B:114:0x12b7, B:116:0x12c0, B:118:0x12de, B:119:0x1333, B:125:0x151c, B:127:0x152f, B:128:0x157e, B:140:0x1629, B:142:0x1675, B:143:0x16ca, B:148:0x1705, B:150:0x1718, B:151:0x1764, B:153:0x1853, B:155:0x1866, B:156:0x18b7, B:166:0x19a2, B:168:0x19f9, B:169:0x1a4c, B:175:0x1a7b, B:177:0x1a8e, B:178:0x1adb, B:180:0x1b8b, B:182:0x1b9e, B:183:0x1bee, B:193:0x1cb2, B:195:0x1d02, B:196:0x1d57, B:205:0x1ecf, B:207:0x1ee2, B:208:0x1f2f, B:216:0x1ffd, B:218:0x2050, B:219:0x20a3, B:246:0x24b7, B:248:0x24ff, B:249:0x2554, B:253:0x25ac, B:255:0x25bf, B:256:0x260a, B:269:0x28bc, B:271:0x28cf, B:272:0x291d, B:280:0x29da, B:282:0x2a1d, B:283:0x2a6a, B:287:0x2aa3, B:289:0x2acc, B:290:0x2b25, B:297:0x2bd5, B:299:0x2c1b, B:300:0x2c6c, B:304:0x2cd1, B:306:0x2cfa, B:307:0x2d57, B:311:0x2de7, B:313:0x2e3d, B:314:0x2e8e, B:317:0x2ea4, B:319:0x2eb3, B:320:0x2efe, B:324:0x2fba, B:326:0x3007, B:327:0x3058, B:331:0x306f, B:333:0x3088, B:334:0x30d6, B:338:0x3181, B:340:0x31d3, B:341:0x3226, B:344:0x323c, B:346:0x324b, B:347:0x3292, B:351:0x3333, B:353:0x3387, B:354:0x33da, B:357:0x33f0, B:359:0x33ff, B:360:0x344b, B:364:0x34eb, B:366:0x353a, B:367:0x358e, B:370:0x35a4, B:372:0x35b3, B:373:0x35fd, B:377:0x36ca, B:379:0x3715, B:380:0x3766, B:384:0x379f, B:386:0x37c9, B:387:0x3828, B:391:0x38e6, B:393:0x393d, B:394:0x398e, B:398:0x39bf, B:400:0x39d2, B:401:0x3a22, B:405:0x3acb, B:407:0x3b27, B:408:0x3b77, B:411:0x3b8d, B:413:0x3b9c, B:414:0x3be6, B:418:0x3c9c, B:420:0x3ce4, B:421:0x3d3a, B:424:0x3d50, B:426:0x3d5f, B:427:0x3da7, B:431:0x3e57, B:433:0x3ea1, B:434:0x3ef3, B:437:0x3f09, B:439:0x3f18, B:440:0x3f64, B:444:0x3fff, B:446:0x404f, B:447:0x409d, B:450:0x40b3, B:452:0x40c2, B:453:0x410b, B:459:0x41d8, B:461:0x422b, B:462:0x427f, B:464:0x4294, B:466:0x42a7, B:467:0x42ec, B:469:0x42f4, B:471:0x4324, B:472:0x437d, B:477:0x442b, B:479:0x447f, B:480:0x44cf, B:552:0x13c7, B:554:0x13e5, B:555:0x1437), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x10fa  */
    /* JADX WARN: Type inference failed for: r8v186 */
    /* JADX WARN: Type inference failed for: r8v187 */
    /* JADX WARN: Type inference failed for: r8v188 */
    /* JADX WARN: Type inference failed for: r8v189 */
    /* JADX WARN: Type inference failed for: r8v194 */
    /* JADX WARN: Type inference failed for: r8v199 */
    /* JADX WARN: Type inference failed for: r8v200, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v442 */
    /* JADX WARN: Type inference failed for: r8v443 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] values$4956fc2a(int i, java.lang.Object obj) {
        java.lang.String str;
        int i2;
        int i3;
        java.lang.Object obj2;
        java.lang.String str2;
        java.lang.Object obj3;
        long j;
        java.lang.Object obj4;
        java.lang.String str3;
        java.lang.Object obj5;
        long j2;
        java.lang.Object obj6;
        int i4;
        ?? r8;
        java.lang.String str4;
        int i5;
        java.lang.String str5;
        int i6;
        int i7;
        int i8;
        java.lang.Object[] objArr;
        int parseInt;
        java.lang.String str6;
        java.lang.String str7;
        try {
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
            if (obj7 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.os.Process.myPid() >> 22), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1838, (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                byte[] bArr = $$a;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b((byte) (-bArr[16]), (short) 653, (byte) (bArr[14] - 1), objArr2);
                obj7 = cls.getMethod((java.lang.String) objArr2[0], null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, obj7);
            }
            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj7).invoke(null, null)).longValue();
            long j3 = ~longValue;
            long j4 = i;
            long j5 = ~j4;
            long j6 = j5 | 451321393;
            long j7 = ((-885) * longValue) + 800192829789L + (((~(j3 | (-451321394))) | (~(j3 | j4)) | (~(j6 | longValue))) * 886) + (((~(j5 | longValue)) | 451321393) * (-1772)) + ((~j6) * 886) + 388757552;
            int i9 = ~i;
            if (((((int) j7) & ((((~(2011830331 | i)) | 1426048) * 104) + 2005432269 + ((~((-1438652459) | i9)) * (-104)) + ((574603921 | i) * 104))) | (((int) (j7 >> 32)) & ((((1869347839 | i9) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 657408438) + (((~(1695264986 | i9)) | 1785392117) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)))) != 0) {
                java.lang.Object[] objArr3 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, null, new int[1]};
                java.lang.Object[] objArr4 = {-688606955, 16, java.lang.Integer.valueOf((((~((-533101611) | i9)) | (~((-176223910) | i))) * 1900) + 1159947941 + (((~(176223909 | i9)) | (~(533101610 | i))) * (-950)) + (((~(i | 176223909)) | (~(533101610 | i9))) * 950))};
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj8 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 50, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2713, (char) android.text.TextUtils.indexOf("", "", 0));
                    byte b = (byte) ($$a[14] - 1);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(b, b, b, objArr5);
                    obj8 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                }
                ((int[]) objArr3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr4)).intValue();
                return objArr3;
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            c(169712587 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (-81) - android.view.MotionEvent.axisFromString(""), (byte) android.text.TextUtils.getOffsetAfter("", 0), 349455268 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (short) ((-40) - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr6);
            java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj9 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1921, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                byte[] bArr2 = $$a;
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b((byte) (-bArr2[16]), (short) 653, (byte) (bArr2[14] - 1), objArr8);
                obj9 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj9);
            }
            java.lang.String str8 = (java.lang.String) ((java.lang.reflect.Method) obj9).invoke(null, objArr7);
            if (str8 != null) {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                c((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 169712597, android.text.TextUtils.getCapsMode("", 0, 0) - 85, (byte) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 349455268 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (short) (58 - (android.os.Process.myTid() >> 22)), objArr9);
                java.lang.String intern = ((java.lang.String) objArr9[0]).intern();
                i2 = i9;
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                c((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 169712602, android.view.View.resolveSize(0, 0) - 83, (byte) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 349455257 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (short) (123 - android.view.MotionEvent.axisFromString("")), objArr10);
                i3 = 0;
                java.lang.String[] strArr = {intern, ((java.lang.String) objArr10[0]).intern()};
                int i10 = 0;
                while (i10 < 2) {
                    if (str8.contains(strArr[i10])) {
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        c(android.view.Gravity.getAbsoluteGravity(i3, i3) + 169712609, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 68, (byte) android.graphics.drawable.Drawable.resolveOpacity(i3, i3), android.text.TextUtils.getOffsetBefore("", i3) + 349455268, (short) ((-28) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i3)), objArr11);
                        java.lang.Object[] objArr12 = {((java.lang.String) objArr11[0]).intern()};
                        java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj10 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 40, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1921, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            byte[] bArr3 = $$a;
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            b((byte) (-bArr3[16]), (short) 653, (byte) (bArr3[14] - 1), objArr13);
                            obj10 = cls4.getMethod((java.lang.String) objArr13[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj10);
                        }
                        java.lang.Object invoke = ((java.lang.reflect.Method) obj10).invoke(null, objArr12);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a("\uea15迫\u218f\udbbe継ᝧ襑⌧씜绨႗諕Ⲻ욓硹\u124f됺⹚쏼旟\u1fb5농⮃쵣杌ᤸ댜哤컖悢", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 26083, objArr14);
                        java.lang.Object[] objArr15 = {((java.lang.String) objArr14[0]).intern()};
                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj11 == null) {
                            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40, 1921 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                            byte[] bArr4 = $$a;
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            b((byte) (-bArr4[16]), (short) 653, (byte) (bArr4[14] - 1), objArr16);
                            obj11 = cls5.getMethod((java.lang.String) objArr16[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj11);
                        }
                        java.lang.Object invoke2 = ((java.lang.reflect.Method) obj11).invoke(null, objArr15);
                        if (invoke != null) {
                            java.lang.Object[] objArr17 = {invoke, 42};
                            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj12 == null) {
                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.text.TextUtils.indexOf("", "", 0), 2593 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                byte[] bArr5 = $$a;
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                b((byte) (-bArr5[16]), (short) 653, (byte) (bArr5[14] - 1), objArr18);
                                obj12 = cls6.getMethod((java.lang.String) objArr18[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj12);
                            }
                            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj12).invoke(null, objArr17)).longValue();
                            long j8 = ~((-218106446) | (~longValue2));
                            long j9 = 218106445 | longValue2;
                            str6 = "";
                            long j10 = ((longValue2 * (-755)) - 164670365975L) + (1512 * j8) + (((~(j9 | j4)) | j8) * (-756)) + ((j9 | j5) * 756) + 1038994079;
                            if (((((int) (j10 >> 32)) & (((((-624951301) | i) * (-381)) - 2142269242) + (((~(i2 | (-667012101))) | 1521348011) * 381) + 1883244020)) | (((int) j10) & ((((~((-898138023) | i)) | (-1959602864)) * (-318)) + 319370535 + (((~((-1959602864) | i)) | (~(i2 | 1976401839))) * 318) + (((~(i2 | (-1078263818))) | (~(1976401839 | i))) * 318)))) != 477111747) {
                            }
                            str = str6;
                            if (android.os.Build.VERSION.SDK_INT > 33) {
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                a("\uea48슕묽鏁䠔\u20fdᦃ\uf62f꺫蜇翭呶ഘ\ue5a8툈諚捲堂れ\ue935쇌빥雿侚\u242aᳶ\uf543귩", android.graphics.Color.red(0) + 10391, objArr19);
                                java.lang.Object[] objArr20 = {((java.lang.String) objArr19[0]).intern()};
                                java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                if (obj13 == null) {
                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 36, 3161 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (33099 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                                    byte[] bArr6 = $$a;
                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                    b((byte) (-bArr6[16]), (short) 653, (byte) (bArr6[14] - 1), objArr21);
                                    obj13 = cls7.getMethod((java.lang.String) objArr21[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj13);
                                }
                                long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj13).invoke(null, objArr20)).longValue();
                                long j11 = (((((603 * longValue3) - 163492040646L) + (((~(541364372 | j5)) | longValue3) * (-602))) + ((((~(541364372 | (~longValue3))) | (~(541364372 | j4))) | (~(((-541364373) | j5) | longValue3))) * (-301))) + ((~(longValue3 | j5)) * 301)) - 796303735;
                                if (((((int) (j11 >> 32)) & ((((~(i2 | (-1622154040))) | (-184927629)) * (-602)) + 422037443 + (((~((-1622154040) | i)) | 1622153779 | (~(i2 | (-184927369)))) * (-301)) + ((~(i2 | (-184927629))) * 301))) | (((int) j11) & (((i2 | 2117967293) * (-369)) + 802172634 + (((~(i2 | (-1847074237))) | 1010666649) * (-369)) + (((~(1847074236 | i)) | 270893057 | (~(i2 | (-1107300645)))) * 369)))) == 1) {
                                    SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 51) % 128;
                                    getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 85) % 128;
                                    java.lang.Object[] objArr22 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE}, null, new int[1]};
                                    java.lang.Object[] objArr23 = {-688606955, 16, java.lang.Integer.valueOf((((~((-92672716) | i)) * 623) - 96968570) + ((i2 | 270622724) * (-623)) + (((~(i | (-265687756))) | 92672715 | (~(443637764 | i))) * 623))};
                                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj14 == null) {
                                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.getDeadChar(0, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2712, (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                        byte b2 = (byte) ($$a[14] - 1);
                                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                                        b(b2, b2, b2, objArr24);
                                        obj14 = cls8.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj14);
                                    }
                                    ((int[]) objArr22[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj14).invoke(null, objArr23)).intValue();
                                    return objArr22;
                                }
                            } else {
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                a("\uea15\u197bಯず⟎⬺庠䈥熘攍桻鿺荦", android.text.TextUtils.getTrimmedLength(str) + 62323, objArr25);
                                java.lang.Object[] objArr26 = {((java.lang.String) objArr25[0]).intern()};
                                java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj15 == null) {
                                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 40, (android.os.Process.myPid() >> 22) + 1921, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                    byte[] bArr7 = $$a;
                                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                                    b((byte) (-bArr7[16]), (short) 653, (byte) (bArr7[14] - 1), objArr27);
                                    obj15 = cls9.getMethod((java.lang.String) objArr27[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj15);
                                }
                                java.lang.Object invoke3 = ((java.lang.reflect.Method) obj15).invoke(null, objArr26);
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                a("\uea56", 17746 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr28);
                            }
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            a("\uea06诼⧻쿅淰Ϲꇤ䟭", android.view.View.MeasureSpec.getMode(i3) + 25087, objArr29);
                            java.lang.String intern2 = ((java.lang.String) objArr29[i3]).intern();
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            c(android.text.TextUtils.indexOf(str, str, i3, i3) + 169712631, (-86) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.util.TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 349455251, (short) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36), objArr30);
                            java.lang.String intern3 = ((java.lang.String) objArr30[0]).intern();
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            c((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 169712635, (-84) - android.view.View.getDefaultSize(0, 0), (byte) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 349455254, (short) ((-126) - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), objArr31);
                            java.lang.String intern4 = ((java.lang.String) objArr31[0]).intern();
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            a("\uea00\ue3c4曆\uf741촞\udaf6킻깳ꐭ", android.text.TextUtils.getOffsetBefore(str, 0) + 2503, objArr32);
                            java.lang.String intern5 = ((java.lang.String) objArr32[0]).intern();
                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                            c((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 169712642, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 85, (byte) android.view.KeyEvent.normalizeMetaState(0), 349455259 - android.text.TextUtils.indexOf(str, str, 0, 0), (short) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50), objArr33);
                            java.lang.String intern6 = ((java.lang.String) objArr33[0]).intern();
                            java.lang.Object[] objArr34 = new java.lang.Object[1];
                            a("\uea0e⚀猜辈\ud86eᒮℴ綺蹚\udad1ᜓ⏶籨", 52362 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr34);
                            java.lang.String intern7 = ((java.lang.String) objArr34[0]).intern();
                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                            c(169712646 - android.os.Process.getGidForName(str), (-86) - android.graphics.Color.red(0), (byte) android.graphics.drawable.Drawable.resolveOpacity(0, 0), 349455260 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) (27 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr35);
                            java.lang.String intern8 = ((java.lang.String) objArr35[0]).intern();
                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                            c(169712650 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.view.View.MeasureSpec.getSize(0) - 85, (byte) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 349455259 - android.view.View.MeasureSpec.getMode(0), (short) android.view.MotionEvent.axisFromString(str), objArr36);
                            java.lang.String intern9 = ((java.lang.String) objArr36[0]).intern();
                            java.lang.Object[] objArr37 = new java.lang.Object[1];
                            c(169712656 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 89, (byte) android.view.View.resolveSize(0, 0), android.text.TextUtils.indexOf(str, str, 0, 0) + 349455259, (short) (74 - android.text.TextUtils.indexOf(str, str)), objArr37);
                            java.lang.String intern10 = ((java.lang.String) objArr37[0]).intern();
                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                            a("\uea0b䚡덒\uefec墦땘\ue1e2劑轜ﯢ哓腗﷿⺓鬫\uf7f4", android.text.TextUtils.getTrimmedLength(str) + 44201, objArr38);
                            java.lang.String intern11 = ((java.lang.String) objArr38[0]).intern();
                            java.lang.Object[] objArr39 = new java.lang.Object[1];
                            c(169712657 - android.text.TextUtils.indexOf(str, str, 0), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 80, (byte) android.view.View.resolveSize(0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 349455262, (short) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 47), objArr39);
                            java.lang.String intern12 = ((java.lang.String) objArr39[0]).intern();
                            java.lang.Object[] objArr40 = new java.lang.Object[1];
                            a("\uea17␞瘞耥툹\uec31㹋䡁", 52748 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr40);
                            java.lang.String intern13 = ((java.lang.String) objArr40[0]).intern();
                            java.lang.Object[] objArr41 = new java.lang.Object[1];
                            c((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 169712667, (-79) - android.text.TextUtils.indexOf(str, str, 0, 0), (byte) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 349455266 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) ((-36) - android.text.TextUtils.indexOf(str, str)), objArr41);
                            java.lang.String intern14 = ((java.lang.String) objArr41[0]).intern();
                            java.lang.Object[] objArr42 = new java.lang.Object[1];
                            c(169712677 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-77) - android.view.View.MeasureSpec.getSize(0), (byte) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 349455266, (short) (44 - android.graphics.Color.blue(0)), objArr42);
                            java.lang.String intern15 = ((java.lang.String) objArr42[0]).intern();
                            java.lang.Object[] objArr43 = new java.lang.Object[1];
                            c((android.os.Process.myTid() >> 22) + 169712690, (-83) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 17268, (short) (46 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), objArr43);
                            java.lang.String intern16 = ((java.lang.String) objArr43[0]).intern();
                            java.lang.Object[] objArr44 = new java.lang.Object[1];
                            a("\uea14ᄀᰖᬽض്ࡍ", android.view.View.resolveSizeAndState(0, 0, 0) + 64271, objArr44);
                            java.lang.String intern17 = ((java.lang.String) objArr44[0]).intern();
                            java.lang.Object[] objArr45 = new java.lang.Object[1];
                            a("\uea14ﲿ읙꧵낷魏涢", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5800, objArr45);
                            java.lang.String intern18 = ((java.lang.String) objArr45[0]).intern();
                            java.lang.Object[] objArr46 = new java.lang.Object[1];
                            a("\uea14眳", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40231, objArr46);
                            java.lang.String intern19 = ((java.lang.String) objArr46[0]).intern();
                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                            a("\uea14᳸ߐ໔ㆿ㢯⎒⩣嵋䑌伖瘒礌揫櫖鷃蒰辙뚏륢", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 63211, objArr47);
                            java.lang.String intern20 = ((java.lang.String) objArr47[0]).intern();
                            java.lang.Object[] objArr48 = new java.lang.Object[1];
                            a("\uea14ꐸ癃\u0087튨法", 20011 - android.graphics.Color.alpha(0), objArr48);
                            java.lang.String intern21 = ((java.lang.String) objArr48[0]).intern();
                            java.lang.Object[] objArr49 = new java.lang.Object[1];
                            c(169712695 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.os.Process.myPid() >> 22) - 89, (byte) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), android.graphics.Color.rgb(0, 0, 0) + 366232485, (short) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18), objArr49);
                            java.lang.String intern22 = ((java.lang.String) objArr49[0]).intern();
                            java.lang.Object[] objArr50 = new java.lang.Object[1];
                            c(android.text.TextUtils.getTrimmedLength(str) + 169712697, (android.view.KeyEvent.getMaxKeyCode() >> 16) - 75, (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 349455269 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 94), objArr50);
                            java.lang.String intern23 = ((java.lang.String) objArr50[0]).intern();
                            java.lang.Object[] objArr51 = new java.lang.Object[1];
                            a("\uea13잜넔抟尦\u09baאּ풬虇", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 11656, objArr51);
                            java.lang.String intern24 = ((java.lang.String) objArr51[0]).intern();
                            java.lang.Object[] objArr52 = new java.lang.Object[1];
                            c(169712712 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 81, (byte) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 349455270, (short) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 37), objArr52);
                            java.lang.String intern25 = ((java.lang.String) objArr52[0]).intern();
                            java.lang.Object[] objArr53 = new java.lang.Object[1];
                            c(169712720 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 80, (byte) android.text.TextUtils.indexOf(str, str, 0), android.text.TextUtils.getOffsetAfter(str, 0) + 349455270, (short) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 90), objArr53);
                            java.lang.String intern26 = ((java.lang.String) objArr53[0]).intern();
                            java.lang.Object[] objArr54 = new java.lang.Object[1];
                            c(169712731 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-80) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (byte) (android.view.MotionEvent.axisFromString(str) + 1), 349455271 - android.text.TextUtils.getCapsMode(str, 0, 0), (short) (12 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr54);
                            java.lang.String intern27 = ((java.lang.String) objArr54[0]).intern();
                            java.lang.Object[] objArr55 = new java.lang.Object[1];
                            c(169712740 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (-77) - android.view.MotionEvent.axisFromString(str), (byte) android.text.TextUtils.indexOf(str, str), 349455271 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 34), objArr55);
                            java.lang.String intern28 = ((java.lang.String) objArr55[0]).intern();
                            java.lang.Object[] objArr56 = new java.lang.Object[1];
                            a("\uea12쾄ꄊ骩簽凂୶\ueccf왶믿鶇眇⢗Ƚ", 9613 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr56);
                            java.lang.String[] strArr2 = {intern2, intern3, intern4, intern5, intern6, intern7, intern8, intern9, intern10, intern11, intern12, intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, ((java.lang.String) objArr56[0]).intern()};
                            java.lang.Object[] objArr57 = new java.lang.Object[1];
                            c((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 169712587, android.graphics.Color.blue(0) - 80, (byte) android.view.KeyEvent.getDeadChar(0, 0), android.view.KeyEvent.normalizeMetaState(0) + 349455268, (short) ((-40) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr57);
                            java.lang.Object[] objArr58 = {((java.lang.String) objArr57[0]).intern()};
                            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj2 == null) {
                                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 40, 1921 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                                byte[] bArr8 = $$a;
                                java.lang.Object[] objArr59 = new java.lang.Object[1];
                                b((byte) (-bArr8[16]), (short) 653, (byte) (bArr8[14] - 1), objArr59);
                                obj2 = cls10.getMethod((java.lang.String) objArr59[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj2);
                            }
                            str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr58);
                            if (str2 != null) {
                                java.lang.Object[] objArr60 = new java.lang.Object[1];
                                c(169712596 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (-86) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (byte) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.os.Process.getGidForName(str) + 349455269, (short) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 59), objArr60);
                                java.lang.String intern29 = ((java.lang.String) objArr60[0]).intern();
                                java.lang.Object[] objArr61 = new java.lang.Object[1];
                                c(169712602 - android.view.View.resolveSize(0, 0), android.text.TextUtils.indexOf(str, str, 0, 0) - 83, (byte) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 349455257 - android.graphics.Color.blue(0), (short) ((-16777092) - android.graphics.Color.rgb(0, 0, 0)), objArr61);
                                java.lang.String[] strArr3 = {intern29, ((java.lang.String) objArr61[0]).intern()};
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= 2) {
                                        break;
                                    }
                                    SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 125) % 128;
                                    if (str2.contains(strArr3[i11])) {
                                        java.lang.Object[] objArr62 = new java.lang.Object[1];
                                        c(android.view.View.MeasureSpec.getMode(0) + 169712609, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) - 68, (byte) android.view.KeyEvent.normalizeMetaState(0), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 349455268, (short) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 28), objArr62);
                                        java.lang.Object[] objArr63 = {((java.lang.String) objArr62[0]).intern()};
                                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj16 == null) {
                                            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 40, 1921 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                            byte[] bArr9 = $$a;
                                            java.lang.Object[] objArr64 = new java.lang.Object[1];
                                            b((byte) (-bArr9[16]), (short) 653, (byte) (bArr9[14] - 1), objArr64);
                                            obj16 = cls11.getMethod((java.lang.String) objArr64[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj16);
                                        }
                                        java.lang.Object invoke4 = ((java.lang.reflect.Method) obj16).invoke(null, objArr63);
                                        java.lang.Object[] objArr65 = new java.lang.Object[1];
                                        a("\uea15迫\u218f\udbbe継ᝧ襑⌧씜绨႗諕Ⲻ욓硹\u124f됺⹚쏼旟\u1fb5농⮃쵣杌ᤸ댜哤컖悢", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 26083, objArr65);
                                        java.lang.Object[] objArr66 = {((java.lang.String) objArr65[0]).intern()};
                                        java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj17 == null) {
                                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter(str, 0) + 40, 1921 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                            byte[] bArr10 = $$a;
                                            java.lang.Object[] objArr67 = new java.lang.Object[1];
                                            b((byte) (-bArr10[16]), (short) 653, (byte) (bArr10[14] - 1), objArr67);
                                            obj17 = cls12.getMethod((java.lang.String) objArr67[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj17);
                                        }
                                        java.lang.Object invoke5 = ((java.lang.reflect.Method) obj17).invoke(null, objArr66);
                                        if (invoke4 != null) {
                                            java.lang.Object[] objArr68 = {invoke4, 42};
                                            java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                            if (obj18 == null) {
                                                java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.graphics.Color.rgb(0, 0, 0) + 16779810, (char) ((-1) - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                byte[] bArr11 = $$a;
                                                java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                b((byte) (-bArr11[16]), (short) 653, (byte) (bArr11[14] - 1), objArr69);
                                                obj18 = cls13.getMethod((java.lang.String) objArr69[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj18);
                                            }
                                            long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj18).invoke(null, objArr68)).longValue();
                                            long j12 = ~longValue4;
                                            long j13 = (longValue4 * (-978)) + 710157093100L + ((~(j12 | j5)) * 979) + ((j4 | 724650095) * (-979)) + (((~(j12 | j4)) | (~(j5 | 724650095))) * 979) + 532450429;
                                            int i12 = (int) (j13 >> 32);
                                            int i13 = ~(i2 | 809810368);
                                        }
                                        if (invoke5 != null) {
                                            java.lang.Object[] objArr70 = {invoke5, 42};
                                            java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                            if (obj19 == null) {
                                                java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.graphics.Color.green(0), 2593 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                                byte[] bArr12 = $$a;
                                                java.lang.Object[] objArr71 = new java.lang.Object[1];
                                                b((byte) (-bArr12[16]), (short) 653, (byte) (bArr12[14] - 1), objArr71);
                                                obj19 = cls14.getMethod((java.lang.String) objArr71[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj19);
                                            }
                                            long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr70)).longValue();
                                            long j14 = (334 * longValue5) + 186011535389L + (((~(longValue5 | j4)) | (~(560275707 | j5))) * 333) + (((~(longValue5 | j5)) | (~(560275707 | j4))) * 333) + 1817376232;
                                            int i14 = (int) (j14 >> 32);
                                            int i15 = ~((-1918521625) | i);
                                            int i16 = (int) j14;
                                            int i17 = ~((-542122193) | i);
                                        }
                                    } else {
                                        i11++;
                                    }
                                }
                            }
                            java.lang.String str9 = str;
                            java.lang.Object[] objArr72 = new java.lang.Object[1];
                            a("\uea48\u206b绠땩쎴Ṻ哮挱맬\uf475˽奻韽ꉡ\uf8ed㜹䷲顦훯\ued65㯹癯賨", android.text.TextUtils.getOffsetAfter(str9, 0) + 51839, objArr72);
                            java.lang.Object[] objArr73 = {((java.lang.String) objArr72[0]).intern()};
                            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj3 == null) {
                                java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 29, 2807 - android.view.View.resolveSize(0, 0), (char) android.graphics.Color.red(0));
                                byte[] bArr13 = $$a;
                                java.lang.Object[] objArr74 = new java.lang.Object[1];
                                b((byte) (-bArr13[16]), (short) 653, (byte) (bArr13[14] - 1), objArr74);
                                obj3 = cls15.getMethod((java.lang.String) objArr74[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj3);
                            }
                            long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr73)).longValue();
                            long j15 = ~longValue6;
                            java.lang.String str10 = str9;
                            long j16 = ((-987) * longValue6) + 849332648580L + (((~(j15 | j5 | 858779220)) | (~(longValue6 | 858779220 | j4))) * 988) + ((858779220 | j15) * (-988)) + (((~(longValue6 | 858779220 | j5)) | (~((-858779221) | j15)) | (~(j15 | j4))) * 988) + 431760847;
                            j = (((int) (j16 >> 32)) & (((((~(i2 | (-1488213457))) | (~((-50987046) | i))) * (-272)) - 752157686) + (((~(659169319 | i)) | (-2147382776)) * (-272)) + (((~((-659169320) | i)) | 2096395730) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))) | (((int) j16) & ((((((~(i2 | (-855769225))) | (-2001971662)) | (~(2001873101 | i))) * (-68)) - 2056176639) + ((~(i2 | (-98561))) * (-68)) + (((~(i2 | (-2001873102))) | (-855867785)) * 68)));
                            java.lang.Object[] objArr75 = new java.lang.Object[1];
                            c((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 169712766, (-75) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (byte) android.view.Gravity.getAbsoluteGravity(0, 0), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 349455201, (short) (android.view.View.getDefaultSize(0, 0) + 47), objArr75);
                            java.lang.Object[] objArr76 = {((java.lang.String) objArr75[0]).intern()};
                            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj4 == null) {
                                str3 = str10;
                                java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str3, str3, 0, 0) + 29, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2807, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                byte[] bArr14 = $$a;
                                java.lang.Object[] objArr77 = new java.lang.Object[1];
                                b((byte) (-bArr14[16]), (short) 653, (byte) (bArr14[14] - 1), objArr77);
                                obj4 = cls16.getMethod((java.lang.String) objArr77[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj4);
                            } else {
                                str3 = str10;
                            }
                            long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr76)).longValue();
                            long j17 = ~longValue7;
                            long j18 = j5 | 1023230376;
                            long j19 = ((-885) * longValue7) + 1814187456648L + (((~(j17 | (-1023230377))) | (~(j17 | j4)) | (~(j18 | longValue7))) * 886) + (((~(j5 | longValue7)) | 1023230376) * (-1772)) + ((~j18) * 886) + 267309691;
                            long j20 = (((int) j19) & ((((~(i2 | 2102764987)) * 52) - 624597751) + (((~(i2 | 760292506)) | (~(i2 | (-2097448380))) | 1342472481) * (-52)) + (((~(i2 | (-760292507))) | 5316608) * 52))) | (((int) (j19 >> 32)) & (((((~(i2 | 34877232)) | 1472103643) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 1453938172) + (((~(i2 | 1472114683)) | (~(i | (-11041)))) * (-519)) + (((~(1472103643 | i)) | (-34877233)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE)));
                            if (j > 0) {
                                int i18 = SdkCoreAlternateContactlessPaymentDataImpl;
                                int i19 = i18 + 35;
                                getAid = i19 % 128;
                                if (i19 % 2 == 0 ? j20 > 0 : j20 > 0) {
                                    getAid = (i18 + 37) % 128;
                                    if (j20 - 3 < j) {
                                        java.lang.Object[] objArr78 = {new int[]{i}, new int[]{i ^ 247}, null, new int[1]};
                                        java.lang.Object[] objArr79 = {-688606955, 16, java.lang.Integer.valueOf((((~(i | 417785437)) | (~(i2 | (-274760785))) | (-434564736)) * (-68)) + 714575971 + ((~(i2 | (-16779299))) * (-68)) + (((~(i2 | (-417785438))) | (-291540083)) * 68))};
                                        java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj20 == null) {
                                            java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 50, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                            byte b3 = (byte) ($$a[14] - 1);
                                            java.lang.Object[] objArr80 = new java.lang.Object[1];
                                            b(b3, b3, b3, objArr80);
                                            obj20 = cls17.getMethod((java.lang.String) objArr80[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj20);
                                        }
                                        ((int[]) objArr78[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr79)).intValue();
                                        return objArr78;
                                    }
                                }
                            }
                            java.lang.Object[] objArr81 = new java.lang.Object[1];
                            a("\uea48\u206b绠땩쎴Ṻ哮挱맬\uf475˽奻韽ꉡ\uf8ed㜹䷲顦훯\ued65㯹癯賨", android.view.View.MeasureSpec.getMode(0) + 51839, objArr81);
                            java.lang.Object[] objArr82 = {((java.lang.String) objArr81[0]).intern()};
                            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj5 == null) {
                                java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 2808 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                                byte[] bArr15 = $$a;
                                java.lang.Object[] objArr83 = new java.lang.Object[1];
                                b((byte) (-bArr15[16]), (short) 653, (byte) (bArr15[14] - 1), objArr83);
                                obj5 = cls18.getMethod((java.lang.String) objArr83[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj5);
                            }
                            long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr82)).longValue();
                            long j21 = ~longValue8;
                            long j22 = (((-97) * longValue8) - 20619978000L) + (((~(j21 | (-412399560))) | (~(j21 | j5))) * 98) + (((~(412399559 | j5)) | j21 | (~((-412399560) | j4))) * (-49)) + (((~(j21 | j4)) | (~(longValue8 | (-412399560)))) * 49) + 1702939627;
                            j2 = (((int) (j22 >> 32)) & ((((((~((-886495315) | i)) | 550656080) * 576) - 1771464918) + (((~(i2 | (-335839235))) | 75016) * 576)) - 649677824)) | (((int) j22) & (((((~(1330676552 | i)) | 105939520) * (-502)) - 1768503973) + ((~(i2 | (-610338))) * (-502)) + (((~(106549857 | i)) | 1330676552) * 502)));
                            java.lang.Object[] objArr84 = new java.lang.Object[1];
                            a("\uea48쬶ꡨ覎", 8501 - android.view.View.combineMeasuredStates(0, 0), objArr84);
                            java.lang.Object[] objArr85 = {((java.lang.String) objArr84[0]).intern()};
                            obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj6 == null) {
                                java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str3) + 29, 2806 - android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                                byte[] bArr16 = $$a;
                                java.lang.Object[] objArr86 = new java.lang.Object[1];
                                b((byte) (-bArr16[16]), (short) 653, (byte) (bArr16[14] - 1), objArr86);
                                obj6 = cls19.getMethod((java.lang.String) objArr86[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj6);
                            }
                            long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr85)).longValue();
                            long j23 = ~longValue9;
                            long j24 = ~(j23 | (-179582557) | j4);
                            long j25 = (((-475) * longValue9) - 85660879689L) + (((~(longValue9 | 179582556)) | j24) * (-476)) + (j24 * 952) + ((~(j23 | j5 | (-179582557))) * 476) + 1470122624;
                            long j26 = (((int) (j25 >> 32)) & ((((~(1992715189 | i)) | 1162433834) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 569164338 + (((~(i2 | 1992715189)) | 1162433834) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) | (((int) j25) & ((((((~((-1427099975) | i)) | 1426444550) * 1504) + 1320243365) + ((~((-655425) | i)) * (-1504))) - 646424976));
                            if (j2 > 0) {
                                int i20 = SdkCoreAlternateContactlessPaymentDataImpl + 9;
                                int i21 = i20 % 128;
                                getAid = i21;
                                if (i20 % 2 == 0 ? j26 > 0 : j26 > 1) {
                                    if (j26 + 100 < j2) {
                                        SdkCoreAlternateContactlessPaymentDataImpl = (i21 + 57) % 128;
                                        java.lang.Object[] objArr87 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                                        java.lang.Object[] objArr88 = {-688606955, 16, java.lang.Integer.valueOf(((((-37046279) | i) * (-627)) - 1220172852) + (((~((-604641146) | i)) | 104684374) * (-627)) + (((~(i | 104684374)) | (~(i2 | 604641145))) * 627))};
                                        java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj21 == null) {
                                            java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2713, (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                                            byte b4 = (byte) ($$a[14] - 1);
                                            java.lang.Object[] objArr89 = new java.lang.Object[1];
                                            b(b4, b4, b4, objArr89);
                                            obj21 = cls20.getMethod((java.lang.String) objArr89[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj21);
                                        }
                                        ((int[]) objArr87[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr88)).intValue();
                                        return objArr87;
                                    }
                                }
                            }
                            java.lang.Object[] objArr90 = new java.lang.Object[1];
                            c((android.view.ViewConfiguration.getTapTimeout() >> 16) + 169712782, (-84) - android.graphics.Color.argb(0, 0, 0, 0), (byte) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), android.text.TextUtils.indexOf(str3, str3, 0, 0) + 349455201, (short) (104 - android.graphics.Color.argb(0, 0, 0, 0)), objArr90);
                            java.lang.String intern30 = ((java.lang.String) objArr90[0]).intern();
                            java.lang.Object[] objArr91 = new java.lang.Object[1];
                            a("\uea48裯\u2fe8싥懿ӥ믨底\ufddd郝㟇", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25339, objArr91);
                            java.lang.String intern31 = ((java.lang.String) objArr91[0]).intern();
                            java.lang.Object[] objArr92 = new java.lang.Object[1];
                            c((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 169712788, (-78) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) (android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 349455201, (short) ((-80) - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), objArr92);
                            java.lang.String intern32 = ((java.lang.String) objArr92[0]).intern();
                            java.lang.Object[] objArr93 = new java.lang.Object[1];
                            a("\uea48㘳剐繡骏ꛁ신\uef59ଧ坚玈龤", android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 56360, objArr93);
                            java.lang.String intern33 = ((java.lang.String) objArr93[0]).intern();
                            java.lang.Object[] objArr94 = new java.lang.Object[1];
                            c(android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 169712800, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 80, (byte) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 349455201, (short) (android.widget.ExpandableListView.getPackedPositionChild(0L) - 53), objArr94);
                            java.lang.String intern34 = ((java.lang.String) objArr94[0]).intern();
                            java.lang.Object[] objArr95 = new java.lang.Object[1];
                            a("\uea48鋇ᮣ職ॅ", 30932 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr95);
                            java.lang.String intern35 = ((java.lang.String) objArr95[0]).intern();
                            java.lang.Object[] objArr96 = new java.lang.Object[1];
                            c((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 169712809, (-87) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 349455201 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (short) ((-111) - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), objArr96);
                            java.lang.String[] strArr4 = {intern30, intern31, intern32, intern33, intern34, intern35, ((java.lang.String) objArr96[0]).intern()};
                            i4 = 0;
                            while (true) {
                                r8 = 7;
                                if (i4 >= 7) {
                                    str4 = str3;
                                    i5 = 0;
                                    break;
                                }
                                java.lang.Object[] objArr97 = {strArr4[i4]};
                                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                                if (obj22 == null) {
                                    java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.KeyEvent.normalizeMetaState(0), 1672 - android.graphics.Color.argb(0, 0, 0, 0), (char) (47940 - android.view.KeyEvent.getDeadChar(0, 0)));
                                    byte[] bArr17 = $$a;
                                    java.lang.Object[] objArr98 = new java.lang.Object[1];
                                    b((byte) (-bArr17[16]), (short) 653, (byte) (bArr17[14] - 1), objArr98);
                                    obj22 = cls21.getMethod((java.lang.String) objArr98[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj22);
                                }
                                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr97)).longValue();
                                long j27 = ~longValue10;
                                str4 = str3;
                                long j28 = ((((((-590) * longValue10) - 59648266544L) + ((~(longValue10 | 100757206)) * (-1182))) + (((~(longValue10 | (-100757207))) | (~((100757206 | j27) | j5))) * (-591))) + (((100757206 | j4) | j27) * 591)) - 1524772975;
                                int i22 = (((int) (j28 >> 32)) & (((((~(i2 | 1133382472)) | (~((-1116080905) | i))) * (-831)) - 1383006490) + ((~((-608277509) | i)) * (-1662)) + (((~(i2 | 1724358412)) | (~((-1724358413) | i)) | (~((-1133382473) | i))) * 831))) | (((int) j28) & (((((~((-1149633305) | i)) | (~(i2 | 1708107581))) * (-318)) - 270163893) + (((~(1150158616 | i)) | 557948965) * (-318)) + (((~((-1150158617) | i)) | (-1707582270)) * 318)));
                                if (i22 != 0) {
                                    i5 = i4 + 90;
                                    r8 = i22;
                                    break;
                                }
                                i4++;
                                str3 = str4;
                            }
                            if (i5 != 0) {
                                java.lang.Object[] objArr99 = {new int[]{i}, new int[]{i5 ^ i}, null, new int[1]};
                                java.lang.Object[] objArr100 = {-688606955, 16, java.lang.Integer.valueOf(((((~(i2 | (-39802135))) | 669523385) * (-235)) - 1678696537) + (((~((-39802135) | i)) | 669523385) * (-470)) + (((~(i | (-1523719))) | 631244969) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))};
                                java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj23 == null) {
                                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 50, 2714 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) android.graphics.Color.blue(0));
                                    byte b5 = (byte) ($$a[14] - 1);
                                    java.lang.Object[] objArr101 = new java.lang.Object[1];
                                    b(b5, b5, b5, objArr101);
                                    obj23 = cls22.getMethod((java.lang.String) objArr101[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj23);
                                }
                                ((int[]) objArr99[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr100)).intValue();
                                return objArr99;
                            }
                            try {
                                try {
                                    objArr = new java.lang.Object[1];
                                    c(169712812 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-78) - android.view.KeyEvent.getDeadChar(0, 0), (byte) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 349455267, (short) (45 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr);
                                } catch (java.lang.Exception unused) {
                                }
                            } catch (java.lang.Exception unused2) {
                                r8 = str4;
                            }
                            try {
                                java.lang.Object[] objArr102 = {((java.lang.String) objArr[0]).intern()};
                                java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj24 == null) {
                                    java.lang.String str11 = str4;
                                    try {
                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str11, str11, 0, 0) + 40, android.graphics.Color.green(0) + 1921, (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                                        byte[] bArr18 = $$a;
                                        java.lang.Object[] objArr103 = new java.lang.Object[1];
                                        b((byte) (-bArr18[16]), (short) 653, (byte) (bArr18[14] - 1), objArr103);
                                        obj24 = cls23.getMethod((java.lang.String) objArr103[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj24);
                                        r8 = str11;
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        java.lang.Throwable th2 = th;
                                        java.lang.Throwable cause = th2.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th2;
                                    }
                                } else {
                                    r8 = str4;
                                }
                                java.lang.Object invoke6 = ((java.lang.reflect.Method) obj24).invoke(null, objArr102);
                                if (invoke6 != null) {
                                    java.lang.Object[] objArr104 = new java.lang.Object[1];
                                    c(169712823 - android.text.TextUtils.indexOf((java.lang.CharSequence) r8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.view.View.MeasureSpec.getSize(0) - 80, (byte) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), android.text.TextUtils.indexOf((java.lang.CharSequence) r8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 349455254, (short) (android.text.TextUtils.getTrimmedLength(r8) + 97), objArr104);
                                    try {
                                        java.lang.Object[] objArr105 = {invoke6, new java.lang.String[]{((java.lang.String) objArr104[0]).intern()}};
                                        java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                        if (obj25 == null) {
                                            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 2880 - android.graphics.Color.blue(0), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                            byte[] bArr19 = $$a;
                                            java.lang.Object[] objArr106 = new java.lang.Object[1];
                                            b((byte) (-bArr19[16]), (short) 653, (byte) (bArr19[14] - 1), objArr106);
                                            obj25 = cls24.getMethod((java.lang.String) objArr106[0], java.lang.String.class, java.lang.String[].class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj25);
                                        }
                                        long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj25).invoke(null, objArr105)).longValue();
                                        long j29 = ~longValue11;
                                        long j30 = ~((-1872448412) | j5 | longValue11);
                                        long j31 = (((((471 * longValue11) - 881923202052L) + ((longValue11 | (-1872448412)) * (-470))) + ((((~(1872448411 | j29)) | (~(j29 | j4))) | j30) * (-470))) + (((~(((-1872448412) | j29) | j4)) | j30) * 470)) - 156263367;
                                    } catch (java.lang.Throwable th3) {
                                        java.lang.Throwable cause2 = th3.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                        throw th3;
                                    }
                                }
                                java.lang.Object[] objArr107 = new java.lang.Object[1];
                                c(169712835 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.graphics.Color.red(0) - 73, (byte) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 349455258 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 74), objArr107);
                                try {
                                    java.lang.Object[] objArr108 = {((java.lang.String) objArr107[0]).intern()};
                                    java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj26 == null) {
                                        java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 39, 1922 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                                        byte[] bArr20 = $$a;
                                        java.lang.Object[] objArr109 = new java.lang.Object[1];
                                        b((byte) (-bArr20[16]), (short) 653, (byte) (bArr20[14] - 1), objArr109);
                                        obj26 = cls25.getMethod((java.lang.String) objArr109[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj26);
                                    }
                                    java.lang.Object invoke7 = ((java.lang.reflect.Method) obj26).invoke(null, objArr108);
                                    if (invoke7 != null) {
                                        java.lang.Object[] objArr110 = new java.lang.Object[1];
                                        c((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 169712851, (-84) - android.view.KeyEvent.getDeadChar(0, 0), (byte) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 349455268 - android.text.TextUtils.getCapsMode(r8, 0, 0), (short) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 53), objArr110);
                                        if (invoke7.equals(((java.lang.String) objArr110[0]).intern())) {
                                            java.lang.Object[] objArr111 = new java.lang.Object[1];
                                            c((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 169712856, android.graphics.Color.green(0) - 68, (byte) android.view.KeyEvent.getDeadChar(0, 0), 349455266 - android.graphics.Color.argb(0, 0, 0, 0), (short) (21 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr111);
                                            try {
                                                java.lang.Object[] objArr112 = {((java.lang.String) objArr111[0]).intern()};
                                                java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj27 == null) {
                                                    java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 1921 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                                                    byte[] bArr21 = $$a;
                                                    java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                    b((byte) (-bArr21[16]), (short) 653, (byte) (bArr21[14] - 1), objArr113);
                                                    obj27 = cls26.getMethod((java.lang.String) objArr113[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj27);
                                                }
                                                java.lang.String str12 = (java.lang.String) ((java.lang.reflect.Method) obj27).invoke(null, objArr112);
                                                if (str12 != null && (parseInt = java.lang.Integer.parseInt(str12)) != 0) {
                                                    i6 = parseInt + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                                    str5 = r8;
                                                    if (i6 == 0) {
                                                        java.lang.Object[] objArr114 = {new int[]{i}, new int[]{i6 ^ i}, null, new int[1]};
                                                        java.lang.Object[] objArr115 = {-688606955, 16, java.lang.Integer.valueOf(((((i2 | 806384896) * 1324) - 712732795) + (((~(i | (-132711096))) | (~(842036615 | i))) * (-1324))) - 1079654582)};
                                                        java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj28 == null) {
                                                            java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, 2713 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                                                            byte b6 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                            b(b6, b6, b6, objArr116);
                                                            obj28 = cls27.getMethod((java.lang.String) objArr116[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj28);
                                                        }
                                                        ((int[]) objArr114[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr115)).intValue();
                                                        return objArr114;
                                                    }
                                                    java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                    c(android.text.TextUtils.indexOf(str5, str5, 0) + 169712812, (-78) - android.text.TextUtils.getOffsetBefore(str5, 0), (byte) ((android.os.Process.getThreadPriority(0) + 20) >> 6), 17364 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (short) (44 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr117);
                                                    java.lang.Object[] objArr118 = {((java.lang.String) objArr117[0]).intern()};
                                                    java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                    if (obj29 == null) {
                                                        java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.alpha(0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1922, (char) android.view.KeyEvent.normalizeMetaState(0));
                                                        byte[] bArr22 = $$a;
                                                        java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                        b((byte) (-bArr22[16]), (short) 653, (byte) (bArr22[14] - 1), objArr119);
                                                        obj29 = cls28.getMethod((java.lang.String) objArr119[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj29);
                                                    }
                                                    java.lang.String str13 = (java.lang.String) ((java.lang.reflect.Method) obj29).invoke(null, objArr118);
                                                    if (str13 != null) {
                                                        java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                        c((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 169712823, android.view.MotionEvent.axisFromString(str5) - 79, (byte) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 349455253, (short) (97 - android.view.Gravity.getAbsoluteGravity(0, 0)), objArr120);
                                                        java.lang.String[] strArr5 = {((java.lang.String) objArr120[0]).intern()};
                                                        int i23 = 0;
                                                        while (true) {
                                                            if (i23 > 0) {
                                                                java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                a("\uea48ᶦՌ\u0cfc㒒㱱⟕⾋圬廋䙹也", 63397 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr121);
                                                                java.lang.String intern36 = ((java.lang.String) objArr121[0]).intern();
                                                                java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                c(169712880 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 75, (byte) (android.os.Process.myPid() >> 22), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 349455201, (short) (118 - android.view.View.MeasureSpec.getSize(0)), objArr122);
                                                                java.lang.String intern37 = ((java.lang.String) objArr122[0]).intern();
                                                                java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                a("\uea48뿰䇠\uebca뷊䟷\ue9b9뎭䖜\uef8d녵嬹\ued7b띒奄\ue334땸", 22003 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr123);
                                                                java.lang.String intern38 = ((java.lang.String) objArr123[0]).intern();
                                                                java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                c(169712894 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (-85) - android.widget.ExpandableListView.getPackedPositionGroup(0L), (byte) android.graphics.Color.alpha(0), 349455201 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (short) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 81), objArr124);
                                                                java.lang.String intern39 = ((java.lang.String) objArr124[0]).intern();
                                                                java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                c(169712755 - android.view.View.MeasureSpec.getSize(0), (-79) - android.text.TextUtils.indexOf(str5, str5, 0), (byte) ((-1) - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 349455201 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (android.text.TextUtils.getCapsMode(str5, 0, 0) - 86), objArr125);
                                                                java.lang.String intern40 = ((java.lang.String) objArr125[0]).intern();
                                                                java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                c(169712899 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (-74) - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 349455201 - android.text.TextUtils.getOffsetBefore(str5, 0), (short) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 112), objArr126);
                                                                java.lang.String intern41 = ((java.lang.String) objArr126[0]).intern();
                                                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                a("\uea48핋钠吉ᝯ훙阰凑ჽ큙鎿卝ት\uddd5鴼岚ῤ\udf49麯帏ᤤ", android.view.KeyEvent.normalizeMetaState(0) + 16223, objArr127);
                                                                java.lang.String intern42 = ((java.lang.String) objArr127[0]).intern();
                                                                java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                                a("\uea48뷻䗀\uedd9떯嶩\ue590跁啬ﵤ蔞ⵚ\uf531鴭┛쵉", 22511 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr128);
                                                                java.lang.String intern43 = ((java.lang.String) objArr128[0]).intern();
                                                                java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                                a("\uea48\u243b癀肙튯\uece9㼐䤁魪햳\ue7c3㙍䀤鉡곘ﻈࣲ嬝镍ꜷ\uf1b9ϓ刂氪븠", android.text.TextUtils.getOffsetAfter(str5, 0) + 52783, objArr129);
                                                                java.lang.String intern44 = ((java.lang.String) objArr129[0]).intern();
                                                                java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                                a("\uea48♕犜軗\udb17ᝇ⎌羏蠗쑌ႄⳂ祄", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 52289, objArr130);
                                                                java.lang.String intern45 = ((java.lang.String) objArr130[0]).intern();
                                                                java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                                a("\uea48\ue6a1\uf372찌\ud884핺\ua63c달运", android.graphics.Color.rgb(0, 0, 0) + 16780467, objArr131);
                                                                java.lang.String intern46 = ((java.lang.String) objArr131[0]).intern();
                                                                java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                                c(169712915 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (-84) - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 349455201, (short) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15), objArr132);
                                                                java.lang.String[] strArr6 = {intern36, intern37, intern38, intern39, intern40, intern41, intern42, intern43, intern44, intern45, intern46, ((java.lang.String) objArr132[0]).intern()};
                                                                int i24 = 0;
                                                                while (i24 < 12) {
                                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                    sb.append(strArr6[i24]);
                                                                    java.lang.String[] strArr7 = strArr6;
                                                                    java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                                    c((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 169712696, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) - 89, (byte) android.graphics.Color.green(0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 349455269, (short) (18 - android.view.View.MeasureSpec.getSize(0)), objArr133);
                                                                    sb.append(((java.lang.String) objArr133[0]).intern());
                                                                    java.lang.Object[] objArr134 = {sb.toString()};
                                                                    java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                    if (obj30 == null) {
                                                                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 3161 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.view.MotionEvent.axisFromString(str5) + 33100));
                                                                        byte[] bArr23 = $$a;
                                                                        java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                                        b(bArr23[21], (short) 41, bArr23[14], objArr135);
                                                                        obj30 = cls29.getMethod((java.lang.String) objArr135[0], java.lang.String.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj30);
                                                                    }
                                                                    long j32 = ~((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr134)).longValue();
                                                                    long j33 = ~((-316164494) | j32);
                                                                    int i25 = i24;
                                                                    long j34 = ((r9 * (-463)) - 147016489710L) + (((~(j32 | j5)) | j33 | (~(j5 | (-316164494)))) * 464) + ((316164493 | j4 | j32) * (-464)) + ((j33 | (~((-316164494) | j4))) * 464) + 1311599397;
                                                                    if (((((int) (j34 >> 32)) & ((((~((-993012263) | i)) | 439364100) * 336) + 501358106 + (((~(444214148 | i)) | (-997862311)) * (-168)) + (((~(i2 | 444214148)) | (-993012263)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))) | (((int) j34) & (((((~(i2 | 1087921680)) | (-1423572890)) * (-241)) - 2121498021) + (((~(i2 | (-335651210))) | 1074268160) * 241)))) != 0) {
                                                                        i7 = i25 + 110;
                                                                        break;
                                                                    }
                                                                    i24 = i25 + 1;
                                                                    strArr6 = strArr7;
                                                                }
                                                            } else {
                                                                if (str13.contains(strArr5[i23])) {
                                                                    break;
                                                                }
                                                                i23++;
                                                            }
                                                        }
                                                    }
                                                    i7 = 0;
                                                    if (i7 != 0) {
                                                        java.lang.Object[] objArr136 = {new int[]{i}, new int[]{i7 ^ i}, null, new int[1]};
                                                        java.lang.Object[] objArr137 = {-688606955, 16, java.lang.Integer.valueOf((((~(i2 | 1064943417)) * 130) - 1421924943) + (((~(i | 1064943417)) | 354497033) * 130))};
                                                        java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj31 == null) {
                                                            java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName(str5) + 51, 2713 - android.view.View.resolveSize(0, 0), (char) android.view.View.getDefaultSize(0, 0));
                                                            byte b7 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr138 = new java.lang.Object[1];
                                                            b(b7, b7, b7, objArr138);
                                                            obj31 = cls30.getMethod((java.lang.String) objArr138[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj31);
                                                        }
                                                        ((int[]) objArr136[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr137)).intValue();
                                                        return objArr136;
                                                    }
                                                    long[] jArr = {472001035};
                                                    java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                    a("\uea48汴\ue6d3礡\uf388疧챆䚷\ud913卺햖ⱋꚬ㤕덣㗞谤", android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 34404, objArr139);
                                                    java.lang.Object[] objArr140 = {((java.lang.String) objArr139[0]).intern(), 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr};
                                                    java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                    if (obj32 == null) {
                                                        java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.widget.ExpandableListView.getPackedPositionChild(0L), 3096 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) android.text.TextUtils.getCapsMode(str5, 0, 0));
                                                        byte[] bArr24 = $$a;
                                                        java.lang.Object[] objArr141 = new java.lang.Object[1];
                                                        b((byte) (-bArr24[16]), (short) 653, (byte) (bArr24[14] - 1), objArr141);
                                                        obj32 = cls31.getMethod((java.lang.String) objArr141[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj32);
                                                    }
                                                    long j35 = ~((java.lang.Long) ((java.lang.reflect.Method) obj32).invoke(null, objArr140)).longValue();
                                                    long j36 = (-46691906) | j35;
                                                    long j37 = (((((r9 * (-344)) - 16062015320L) + (((~j36) | (~(j4 | (-46691906)))) * 345)) + (((~((-46691906) | j5)) | (~(j35 | 46691905))) * 345)) + ((~(j36 | j4)) * 345)) - 1957339815;
                                                    if (((((int) (j37 >> 32)) & ((((1323568104 | r2) * (-220)) - 254451470) + (((~((-1534172781) | i)) | 1247808104) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 1179008696)) | (((int) j37) & ((((~((-1208291334) | i)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) - 689651320) + (((~(i2 | (-1208291334))) | 2097568) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)))) != 0) {
                                                        i8 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                                                    } else {
                                                        int i26 = SdkCoreAlternateContactlessPaymentDataImpl + 23;
                                                        getAid = i26 % 128;
                                                        i8 = i26 % 2 != 0 ? 1 : 0;
                                                    }
                                                    if (i8 != 0) {
                                                        java.lang.Object[] objArr142 = {new int[]{i}, new int[]{i8 ^ i}, null, new int[1]};
                                                        java.lang.Object[] objArr143 = {-688606955, 16, java.lang.Integer.valueOf((((((-270535180) | i) * (-381)) + 773215364) + (((~(i2 | 236381364)) | (-304507568)) * 381)) - 5311905)};
                                                        java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj33 == null) {
                                                            java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, android.widget.ExpandableListView.getPackedPositionChild(0L) + 2714, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                                            byte b8 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr144 = new java.lang.Object[1];
                                                            b(b8, b8, b8, objArr144);
                                                            obj33 = cls32.getMethod((java.lang.String) objArr144[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                                        }
                                                        ((int[]) objArr142[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr143)).intValue();
                                                        return objArr142;
                                                    }
                                                    long[] jArr2 = {472001035};
                                                    int i27 = i8;
                                                    java.lang.Object[] objArr145 = new java.lang.Object[1];
                                                    c(169712922 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-69) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 349455201 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (short) (android.text.TextUtils.indexOf(str5, str5, 0, 0) - 80), objArr145);
                                                    java.lang.Object[] objArr146 = {((java.lang.String) objArr145[0]).intern(), 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr2};
                                                    java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                    if (obj34 == null) {
                                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 3144 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                                        byte[] bArr25 = $$a;
                                                        java.lang.Object[] objArr147 = new java.lang.Object[1];
                                                        b((byte) (-bArr25[16]), (short) 653, (byte) (bArr25[14] - 1), objArr147);
                                                        obj34 = cls33.getMethod((java.lang.String) objArr147[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj34);
                                                    }
                                                    long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj34).invoke(null, objArr146)).longValue();
                                                    long j38 = ((((530 * longValue12) - 159443010042L) + (((~(longValue12 | (-300835870))) | (~((-300835870) | j5))) * 529)) + (((~longValue12) | (~((-300835870) | j4))) * 529)) - 1609812040;
                                                    if (((((int) (j38 >> 32)) & (((((~(1950058303 | i)) | 1109500970) * 398) - 2050103150) + (((~(i2 | 1950058303)) | 1109500970) * 398))) | (((int) j38) & ((((((~r9) | 310749786) * (-828)) - 1754753727) + ((i2 | (-1747976197)) * (-828))) - 79688464))) != 0) {
                                                        java.lang.Object[] objArr148 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, null, new int[1]};
                                                        java.lang.Object[] objArr149 = {-688606955, 16, java.lang.Integer.valueOf((((~(i2 | 105031424)) | 814225616) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 1801722615 + ((~((-814225617) | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(i | 919257040)) | (~(i2 | (-814356945))) | 131328) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                                                        java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj35 == null) {
                                                            java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49, (android.os.Process.myPid() >> 22) + 2713, (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                            byte b9 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr150 = new java.lang.Object[1];
                                                            b(b9, b9, b9, objArr150);
                                                            obj35 = cls34.getMethod((java.lang.String) objArr150[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj35);
                                                        }
                                                        ((int[]) objArr148[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj35).invoke(null, objArr149)).intValue();
                                                        return objArr148;
                                                    }
                                                    java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(724989957);
                                                    if (obj36 == null) {
                                                        java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31, 1889 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (3600 - android.text.TextUtils.getCapsMode(str5, 0, 0)));
                                                        byte[] bArr26 = $$a;
                                                        java.lang.Object[] objArr151 = new java.lang.Object[1];
                                                        b((byte) (-bArr26[16]), (short) 653, (byte) (bArr26[14] - 1), objArr151);
                                                        obj36 = cls35.getMethod((java.lang.String) objArr151[0], null);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(724989957, obj36);
                                                    }
                                                    long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj36).invoke(null, null)).longValue();
                                                    long j39 = 1327009049 | j5;
                                                    long j40 = ((((((-518) * longValue13) + 687390687900L) + ((longValue13 | (~j39)) * 519)) + (((~(j39 | longValue13)) | (~(((-1327009050) | longValue13) | j4))) * (-519))) + (((~(longValue13 | j4)) | (-1327009050)) * 519)) - 552239330;
                                                    if (((((int) (j40 >> 32)) & ((((((~(i2 | 1162336503)) | (-1432878328)) | (~((-4348084) | i))) * 717) - 632153725) + (((~(1162336503 | i)) | (~(i2 | (-4348084))) | (-1432878328)) * 717))) | (((int) j40) & ((((((~(i2 | (-207012451))) | 1644238860) | (~((-1663645854) | i))) * (-68)) - 1761805095) + ((~(i2 | (-19406994))) * (-68)) + (((~(i2 | 1663645853)) | (-226419444)) * 68)))) != 0) {
                                                        java.lang.Object[] objArr152 = {new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i27}, null, new int[1]};
                                                        java.lang.Object[] objArr153 = {-688606955, 16, java.lang.Integer.valueOf(((~(i2 | 278957084)) * 979) + 91432506 + ((988282604 | i) * (-979)) + (((~(278957084 | i)) | (~(i2 | 988282604))) * 979))};
                                                        java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj37 == null) {
                                                            java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777166) - android.graphics.Color.rgb(0, 0, 0), android.text.TextUtils.getTrimmedLength(str5) + 2713, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                                                            byte b10 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr154 = new java.lang.Object[1];
                                                            b(b10, b10, b10, objArr154);
                                                            obj37 = cls36.getMethod((java.lang.String) objArr154[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                                                        }
                                                        ((int[]) objArr152[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr153)).intValue();
                                                        return objArr152;
                                                    }
                                                    java.lang.Object[] objArr155 = {2};
                                                    java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                                    if (obj38 == null) {
                                                        java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 26, android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2365, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                        byte[] bArr27 = $$a;
                                                        java.lang.Object[] objArr156 = new java.lang.Object[1];
                                                        b((byte) (-bArr27[16]), (short) 653, (byte) (bArr27[14] - 1), objArr156);
                                                        obj38 = cls37.getMethod((java.lang.String) objArr156[0], java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj38);
                                                    }
                                                    long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj38).invoke(null, objArr155)).longValue();
                                                    long j41 = ~longValue14;
                                                    long j42 = ~(577675894 | longValue14);
                                                    long j43 = (longValue14 * 371) + 214317756674L + (((~(j41 | j5)) | (~(j4 | (-577675895)))) * (-370)) + (((~((-577675895) | j5)) | (~(j41 | j4)) | j42) * (-370)) + (j42 * 370) + 830234305;
                                                    int i28 = ~(i2 | 1306567832);
                                                    if (((((int) j43) & ((((~(i2 | (-537493670))) * (-783)) - 1054387913) + (((~(i2 | (-2019154088))) | (-581927678)) * 783))) | (((int) (j43 >> 32)) & (((34148610 | i28) * (-712)) + 1708460282 + (((~(i2 | (-34148611))) | (~(1340716442 | i))) * (-712)) + ((i28 | (-130658579)) * 712)))) == 2) {
                                                        java.lang.Object[] objArr157 = {new int[]{i}, new int[]{i ^ 270}, null, new int[1]};
                                                        java.lang.Object[] objArr158 = {-688606955, 16, java.lang.Integer.valueOf((((((~((-172493073) | i)) | (~(536832447 | i))) * 69) - 1363497050) + (((~(525297970 | i)) | ((~((-184027550) | i)) | 11534477)) * (-69))) - 1426265814)};
                                                        java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj39 == null) {
                                                            java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSizeAndState(0, 0, 0), 2713 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) ((-1) - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                            byte b11 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr159 = new java.lang.Object[1];
                                                            b(b11, b11, b11, objArr159);
                                                            obj39 = cls38.getMethod((java.lang.String) objArr159[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj39);
                                                        }
                                                        ((int[]) objArr157[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr158)).intValue();
                                                        return objArr157;
                                                    }
                                                    java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1411285061);
                                                    if (obj40 == null) {
                                                        java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 39, 3197 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.graphics.Color.alpha(0));
                                                        byte[] bArr28 = $$a;
                                                        java.lang.Object[] objArr160 = new java.lang.Object[1];
                                                        b(bArr28[21], (short) 41, bArr28[14], objArr160);
                                                        obj40 = cls39.getMethod((java.lang.String) objArr160[0], null);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1411285061, obj40);
                                                    }
                                                    long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj40).invoke(null, null)).longValue();
                                                    long j44 = (565 * longValue15) + 636499501931L + (((~((~longValue15) | j5)) | 1130549736 | (~(longValue15 | j4))) * (-564)) + ((~(1130549736 | longValue15 | j4)) * 1128) + (((~(longValue15 | (-1130549737))) | (~(1130549736 | j5))) * 564) + 1226795098;
                                                    if (((((int) (j44 >> 32)) & (((((~((-1390443537) | i)) | (-46782875)) * (-964)) - 354019778) + (((~(i2 | (-1390443537))) | 1344283648) * (-964)))) | (((int) j44) & ((((~(i2 | 1741062397)) | (-303835988)) * (-983)) + 1657672642 + (((~(i2 | (-303835988))) | 33816657) * 983)))) != 0) {
                                                        java.lang.Object[] objArr161 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, null, new int[1]};
                                                        java.lang.Object[] objArr162 = {-688606955, 16, java.lang.Integer.valueOf((((((~(i2 | 633323693)) | (-633336496)) | (~((-75989025) | i))) * 717) - 277940363) + (((~(633323693 | i)) | (~(i2 | (-75989025))) | (-633336496)) * 717))};
                                                        java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj41 == null) {
                                                            java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 50, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2713, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                                            byte b12 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr163 = new java.lang.Object[1];
                                                            b(b12, b12, b12, objArr163);
                                                            obj41 = cls40.getMethod((java.lang.String) objArr163[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj41);
                                                        }
                                                        ((int[]) objArr161[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj41).invoke(null, objArr162)).intValue();
                                                        return objArr161;
                                                    }
                                                    java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(502613909);
                                                    if (obj42 == null) {
                                                        java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 40, android.text.TextUtils.indexOf(str5, str5, 0) + 3197, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                                        byte[] bArr29 = $$a;
                                                        java.lang.Object[] objArr164 = new java.lang.Object[1];
                                                        b((byte) (-bArr29[16]), (short) 653, (byte) (bArr29[14] - 1), objArr164);
                                                        obj42 = cls41.getMethod((java.lang.String) objArr164[0], null);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(502613909, obj42);
                                                    }
                                                    long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj42).invoke(null, null)).longValue();
                                                    long j45 = (561 * longValue16) + 232727382186L + ((~((-416328054) | j5)) * (-560)) + ((~((~longValue16) | (-416328054) | j4)) * (-560)) + (((~(longValue16 | 416328053)) | (~(j5 | longValue16))) * 560) + 1369197944;
                                                    int i29 = (int) (j45 >> 32);
                                                    int i30 = (int) j45;
                                                    int i31 = ~(i2 | (-436245937));
                                                    if (((i29 & (((((~(677097528 | i)) | 760128882) * 56) - 2057876638) + (((~(i2 | 760128882)) | 677097528) * 56))) | (i30 & ((((~(455188465 | i)) | (-1000980474) | i31) * (-470)) + 548353369 + ((i31 | (~((-545792009) | i))) * 470)))) != 0) {
                                                        java.lang.Object[] objArr165 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, null, new int[1]};
                                                        java.lang.Object[] objArr166 = {-688606955, 16, java.lang.Integer.valueOf((((~((-652520896) | i)) | 39879952) * 345) + 805157336 + (((~(i2 | (-652520896))) | 16924672) * 345) + ((~((-39879953) | i)) * 345))};
                                                        java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj43 == null) {
                                                            java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('b' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2712, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                                            byte b13 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr167 = new java.lang.Object[1];
                                                            b(b13, b13, b13, objArr167);
                                                            obj43 = cls42.getMethod((java.lang.String) objArr167[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj43);
                                                        }
                                                        ((int[]) objArr165[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj43).invoke(null, objArr166)).intValue();
                                                        return objArr165;
                                                    }
                                                    java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1293945309);
                                                    if (obj44 == null) {
                                                        java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2837, (char) android.view.View.resolveSize(0, 0));
                                                        byte[] bArr30 = $$a;
                                                        java.lang.Object[] objArr168 = new java.lang.Object[1];
                                                        b((byte) (-bArr30[16]), (short) 653, (byte) (bArr30[14] - 1), objArr168);
                                                        obj44 = cls43.getMethod((java.lang.String) objArr168[0], null);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1293945309, obj44);
                                                    }
                                                    long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj44).invoke(null, null)).longValue();
                                                    long j46 = ~longValue17;
                                                    long j47 = (((((185 * longValue17) + 50024683641L) + ((longValue17 | 273358926) * (-368))) + (((j46 | (-273358927)) | j5) * 184)) + ((((~(j5 | (-273358927))) | (~(j46 | 273358926))) | (~(longValue17 | (-273358927)))) * 184)) - 532935828;
                                                    if (((((int) (j47 >> 32)) & ((((~(i2 | (-1432213819))) | 5012592) * (-90)) + 1687905420 + (((~((-1432213819) | i)) | (-1432223099)) * (-45)) + (((~((-5012593) | i)) | (-1432213819) | (~(i2 | 5012592))) * 45))) | (((int) j47) & ((((((~(i2 | (-1348752428))) | (-1508988459)) | (~(1348752427 | i))) * (-564)) - 1616034679) + ((~((-160498177) | i)) * 1128) + (((~(i2 | (-1508988459))) | (-1509250604)) * 564)))) != 0) {
                                                        java.lang.Object[] objArr169 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                        java.lang.Object[] objArr170 = {-688606955, 16, java.lang.Integer.valueOf(((((~(i2 | 290169719)) | 714085376) * 446) - 2117243347) + (((~(1004255095 | i)) | 285409863) * 446) + 654497792)};
                                                        java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj45 == null) {
                                                            java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.alpha(0), 2712 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                                                            byte b14 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr171 = new java.lang.Object[1];
                                                            b(b14, b14, b14, objArr171);
                                                            obj45 = cls44.getMethod((java.lang.String) objArr171[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj45);
                                                        }
                                                        ((int[]) objArr169[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj45).invoke(null, objArr170)).intValue();
                                                        return objArr169;
                                                    }
                                                    long[] jArr3 = {624887784092251L};
                                                    java.lang.Object[] objArr172 = new java.lang.Object[1];
                                                    a("\uea48汴\ue6d3礡\uf388疧챆䚷\ud913卺햖ⱋꚬ㤕덣㗞谤", 34403 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr172);
                                                    java.lang.Object[] objArr173 = {((java.lang.String) objArr172[0]).intern(), 3, 2251799813685247L, jArr3};
                                                    java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                    if (obj46 == null) {
                                                        java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - android.text.TextUtils.getOffsetBefore(str5, 0), 3095 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                                                        byte[] bArr31 = $$a;
                                                        java.lang.Object[] objArr174 = new java.lang.Object[1];
                                                        b((byte) (-bArr31[16]), (short) 653, (byte) (bArr31[14] - 1), objArr174);
                                                        obj46 = cls45.getMethod((java.lang.String) objArr174[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj46);
                                                    }
                                                    long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj46).invoke(null, objArr173)).longValue();
                                                    long j48 = ~longValue18;
                                                    long j49 = j48 | j5;
                                                    long j50 = ((((((-112) * longValue18) + 138393871280L) + (((~j49) | (-1235659565)) * 226)) + ((((~(longValue18 | 1235659564)) | (~(j4 | 1235659564))) | (~((-1235659565) | j49))) * (-113))) + ((~(j48 | j4)) * 113)) - 674988345;
                                                    if (((((int) j50) & (((((~(i2 | (-807534599))) | (-2050206288)) * (-591)) - 1416786994) + (((-807534599) | i) * 591))) | (((int) (j50 >> 32)) & (((((~((-976687834) | i)) | (-460538578)) * (-318)) - 1931034726) + (((~((-460538578) | i)) | (~(i2 | 997675737))) * 318) + (((~(i2 | (-20987905))) | (~(997675737 | i))) * 318)))) != 0) {
                                                        SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 21) % 128;
                                                        java.lang.Object[] objArr175 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, null, new int[1]};
                                                        java.lang.Object[] objArr176 = {-688606955, 16, java.lang.Integer.valueOf((((~(i2 | (-674797967))) | 34527553) * (-602)) + 1270800799 + (((~((-674797967) | i)) | 563456 | (~(i2 | 708762063))) * (-301)) + ((~(i2 | 34527553)) * 301))};
                                                        java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj47 == null) {
                                                            java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 50, android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) android.text.TextUtils.getTrimmedLength(str5));
                                                            byte b15 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr177 = new java.lang.Object[1];
                                                            b(b15, b15, b15, objArr177);
                                                            obj47 = cls46.getMethod((java.lang.String) objArr177[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj47);
                                                        }
                                                        ((int[]) objArr175[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj47).invoke(null, objArr176)).intValue();
                                                        return objArr175;
                                                    }
                                                    java.lang.Object[] objArr178 = new java.lang.Object[1];
                                                    a("\uea48偺黰앺ά乀듈\uf34f㧆摕ꊶ", android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 47738, objArr178);
                                                    java.lang.Object[] objArr179 = {((java.lang.String) objArr178[0]).intern()};
                                                    java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                                    if (obj48 == null) {
                                                        java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 3160 - android.os.Process.getGidForName(str5), (char) (33099 - (android.os.Process.myTid() >> 22)));
                                                        byte[] bArr32 = $$a;
                                                        java.lang.Object[] objArr180 = new java.lang.Object[1];
                                                        b((byte) (-bArr32[16]), (short) 653, (byte) (bArr32[14] - 1), objArr180);
                                                        obj48 = cls47.getMethod((java.lang.String) objArr180[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj48);
                                                    }
                                                    long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) obj48).invoke(null, objArr179)).longValue();
                                                    long j51 = ((((((-215) * longValue19) - 211367657151L) + ((~(j4 | (-974044503))) * 216)) + ((((-974044503) | (~longValue19)) | j5) * (-216))) + ((longValue19 | (~((-974044503) | j5))) * 216)) - 363623605;
                                                    int i32 = ~((-352982017) | i);
                                                    if (((((int) (j51 >> 32)) & ((((~(i2 | (-544219359))) | 4194322 | i32) * (-713)) + 1859703756 + (i32 * 1426) + ((~(i2 | (-893007053))) * 713))) | (((int) j51) & ((((~(i2 | (-679955))) | (-1436546456)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 1046668297 + (((~(i2 | (-1427071251))) | (-10155160)) * (-440)) + (((-679955) | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)))) != 0) {
                                                        java.lang.Object[] objArr181 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                        int i33 = ~(i2 | 629354960);
                                                        java.lang.Object[] objArr182 = {-688606955, 16, java.lang.Integer.valueOf((((~(i2 | (-79970560))) | 75497680 | (~(i2 | (-629354961))) | (~(633827839 | i))) * (-84)) + 163126971 + (((~((-629354961) | i)) | 79970559 | i33) * (-84)) + ((i33 | (-633827840)) * 84))};
                                                        java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj49 == null) {
                                                            java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 50, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2713, (char) android.view.View.MeasureSpec.getMode(0));
                                                            byte b16 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr183 = new java.lang.Object[1];
                                                            b(b16, b16, b16, objArr183);
                                                            obj49 = cls48.getMethod((java.lang.String) objArr183[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj49);
                                                        }
                                                        ((int[]) objArr181[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj49).invoke(null, objArr182)).intValue();
                                                        return objArr181;
                                                    }
                                                    java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                                                    if (obj50 == null) {
                                                        java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 28, 2185 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 59512));
                                                        byte[] bArr33 = $$a;
                                                        java.lang.Object[] objArr184 = new java.lang.Object[1];
                                                        b((byte) (-bArr33[16]), (short) 653, (byte) (bArr33[14] - 1), objArr184);
                                                        obj50 = cls49.getMethod((java.lang.String) objArr184[0], null);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj50);
                                                    }
                                                    long j52 = ~((java.lang.Long) ((java.lang.reflect.Method) obj50).invoke(null, null)).longValue();
                                                    long j53 = (((((r3 * (-858)) - 571819955500L) + ((j4 | (-664906925)) * (-859))) + (((~((j52 | 664906924) | j4)) | (~((-664906925) | j5))) * 859)) + (((~(j52 | j5)) | (~(j52 | (-664906925)))) * 859)) - 207183661;
                                                    int i34 = i2 | (-920346927);
                                                    int i35 = i2;
                                                    if (((((int) (j53 >> 32)) & ((i34 * 495) + 1422571898 + (((~i34) | (-2012965167)) * 495))) | (((int) j53) & ((((~(i2 | (-336691238))) | (~(i35 | (-2433)))) * (-184)) + 1019428157 + (((~((-1597214846) | i35)) | 1260523608 | (~((-1260526041) | i35))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 1830202840))) != 0) {
                                                        java.lang.Object[] objArr185 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                        java.lang.Object[] objArr186 = {-688606955, 16, java.lang.Integer.valueOf(((((~((-538992645) | i)) | r1) * 590) - 663287439) + (((~((-127831756) | i35)) | 85330635 | (~(581493764 | i35))) * (-1180)) + (((~((-581493765) | i35)) | (~(i35 | 127831755))) * 590))};
                                                        java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj51 == null) {
                                                            java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 49, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2713, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                                            byte b17 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr187 = new java.lang.Object[1];
                                                            b(b17, b17, b17, objArr187);
                                                            obj51 = cls50.getMethod((java.lang.String) objArr187[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj51);
                                                        }
                                                        ((int[]) objArr185[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj51).invoke(null, objArr186)).intValue();
                                                        return objArr185;
                                                    }
                                                    java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1050293330);
                                                    if (obj52 == null) {
                                                        java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 36, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2972, (char) android.view.View.MeasureSpec.getSize(0));
                                                        byte[] bArr34 = $$a;
                                                        java.lang.Object[] objArr188 = new java.lang.Object[1];
                                                        b((byte) (-bArr34[16]), (short) 653, (byte) (bArr34[14] - 1), objArr188);
                                                        obj52 = cls51.getMethod((java.lang.String) objArr188[0], null);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1050293330, obj52);
                                                    }
                                                    long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) obj52).invoke(null, null)).longValue();
                                                    long j54 = (-861123233) | j5;
                                                    long j55 = ~longValue20;
                                                    long j56 = (((((53 * longValue20) + 43917284883L) + ((~(j54 | longValue20)) * 52)) + ((((~(j55 | (-861123233))) | (~(j55 | j5))) | (~j54)) * (-52))) + (((~(861123232 | longValue20)) | (~(861123232 | j5))) * 52)) - 991578531;
                                                    if (((((int) j56) & ((((531248009 | i) * 140) - 571325427) + (((~(531248009 | i35)) | (-2147400636)) * (-280)) + (((~((-1968474420) | i35)) | 352321793 | (~(2147400635 | i))) * 140))) | (((int) (j56 >> 32)) & ((((~((-1179913) | i)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) - 1595645264) + (((~((-1179913) | i35)) | 268439714) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)))) != 0) {
                                                        java.lang.Object[] objArr189 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                        java.lang.Object[] objArr190 = {-688606955, 16, java.lang.Integer.valueOf((((~((-561766369) | i35)) | (~(147559151 | i))) * com.visa.cbp.getCertUsage.getODAData) + 217276063 + (((~(i35 | 147559151)) | (~((-561766369) | i))) * com.visa.cbp.getCertUsage.getODAData))};
                                                        java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj53 == null) {
                                                            java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.TextUtils.getOffsetBefore(str5, 0) + 2713, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                                            byte b18 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr191 = new java.lang.Object[1];
                                                            b(b18, b18, b18, objArr191);
                                                            obj53 = cls52.getMethod((java.lang.String) objArr191[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj53);
                                                        }
                                                        ((int[]) objArr189[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj53).invoke(null, objArr190)).intValue();
                                                        return objArr189;
                                                    }
                                                    java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1827153043);
                                                    if (obj54 == null) {
                                                        java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 2159 - android.view.KeyEvent.keyCodeFromString(str5), (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 56400));
                                                        byte[] bArr35 = $$a;
                                                        java.lang.Object[] objArr192 = new java.lang.Object[1];
                                                        b((byte) (-bArr35[16]), (short) 653, (byte) (bArr35[14] - 1), objArr192);
                                                        obj54 = cls53.getMethod((java.lang.String) objArr192[0], null);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1827153043, obj54);
                                                    }
                                                    long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) obj54).invoke(null, null)).longValue();
                                                    long j57 = ((((((-55) * longValue21) - 25862071620L) + (((~(j4 | 470219484)) | longValue21) * 56)) + ((~(470219484 | longValue21)) * (-56))) + (((~(j5 | longValue21)) | 470219484) * 56)) - 1036037504;
                                                    if (((((int) (j57 >> 32)) & (((((~(1830427195 | i35)) | 1027313689) * (-933)) - 543365184) + (((~(1027313689 | i35)) | 1073744418) * 933) + 1610394397)) | (((int) j57) & ((((((~(961505278 | i)) | (-1029697536)) * 1504) + 1320243365) + ((~((-68192258) | i)) * (-1504))) - 280602192))) != 0) {
                                                        java.lang.Object[] objArr193 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                        java.lang.Object[] objArr194 = {-688606955, 16, java.lang.Integer.valueOf(((((~((-673185800) | i35)) | (~(703852207 | i))) * (-302)) - 1165373791) + ((~((-673185800) | i)) * (-604)) + (((~(30666408 | i)) | 25193096) * 302))};
                                                        java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj55 == null) {
                                                            java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 50, 2713 - android.view.View.MeasureSpec.getSize(0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                                            byte b19 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr195 = new java.lang.Object[1];
                                                            b(b19, b19, b19, objArr195);
                                                            obj55 = cls54.getMethod((java.lang.String) objArr195[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj55);
                                                        }
                                                        ((int[]) objArr193[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj55).invoke(null, objArr194)).intValue();
                                                        return objArr193;
                                                    }
                                                    java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(887063382);
                                                    if (obj56 == null) {
                                                        java.lang.Class cls55 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 35, 838 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                        byte[] bArr36 = $$a;
                                                        java.lang.Object[] objArr196 = new java.lang.Object[1];
                                                        b((byte) (-bArr36[16]), (short) 653, (byte) (bArr36[14] - 1), objArr196);
                                                        obj56 = cls55.getMethod((java.lang.String) objArr196[0], null);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(887063382, obj56);
                                                    }
                                                    long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) obj56).invoke(null, null)).longValue();
                                                    long j58 = ~(172033191 | longValue22);
                                                    long j59 = (-172033192) | (~longValue22);
                                                    long j60 = ((1435 * longValue22) - 123175764756L) + ((longValue22 | (-172033192)) * (-1434)) + (((~(j5 | longValue22)) | j58 | (~(j59 | j4))) * 717) + (((~(longValue22 | j4)) | (~(j59 | j5)) | j58) * 717) + 1788719711;
                                                    int i36 = ~(i35 | (-333316308));
                                                    int i37 = ((((int) (j60 >> 32)) & (((((((~(333316307 | i)) | (~(i35 | 1770542718))) | i36) * (-516)) + (-1822272414)) + (((~((-1744852525) | i)) | (~(i35 | (-25690195)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)) + ((i36 | 25690194) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))) | (((int) j60) & ((((((~(i35 | (-366447821))) | 366119116) | (~(1071107293 | i))) * 717) + 778041699) + (((~((-366447821) | i)) | ((~(i35 | 1071107293)) | 366119116)) * 717)))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : i;
                                                    if (i37 != i) {
                                                        java.lang.Object[] objArr197 = {new int[]{i}, new int[]{i37}, null, new int[1]};
                                                        java.lang.Object[] objArr198 = {-688606955, 16, java.lang.Integer.valueOf((((~((-345316802) | i)) | 344986880) * 336) + 1801722615 + (((~(364008718 | i)) | (-364338640)) * (-168)) + (((~(i35 | 364008718)) | (-345316802)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                                                        java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj57 == null) {
                                                            java.lang.Class cls56 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 50, android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2714, (char) ((-1) - android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                            byte b20 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr199 = new java.lang.Object[1];
                                                            b(b20, b20, b20, objArr199);
                                                            obj57 = cls56.getMethod((java.lang.String) objArr199[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj57);
                                                        }
                                                        ((int[]) objArr197[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj57).invoke(null, objArr198)).intValue();
                                                        java.lang.Object[] objArr200 = {objArr197};
                                                        java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(712501173);
                                                        if (obj58 == null) {
                                                            java.lang.Class cls57 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.os.Process.myPid() >> 22), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 3237, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                            byte b21 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr201 = new java.lang.Object[1];
                                                            b(b21, b21, b21, objArr201);
                                                            obj58 = cls57.getMethod((java.lang.String) objArr201[0], java.lang.Object[].class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(712501173, obj58);
                                                        }
                                                        ((java.lang.reflect.Method) obj58).invoke(obj, objArr200);
                                                        return objArr197;
                                                    }
                                                    java.lang.Object[] objArr202 = {java.lang.Integer.valueOf(i), obj, -688606955, 0};
                                                    java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(97317038);
                                                    if (obj59 == null) {
                                                        obj59 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.text.TextUtils.indexOf(str5, str5, 0, 0), 3289 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.text.TextUtils.indexOf(str5, str5, 0, 0))).getDeclaredConstructor(java.lang.Integer.TYPE, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.text.TextUtils.indexOf(str5, str5, 0), android.view.View.MeasureSpec.getMode(0) + 3237, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(97317038, obj59);
                                                    }
                                                    java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj59).newInstance(objArr202);
                                                    try {
                                                        java.lang.Object[] objArr203 = new java.lang.Object[1];
                                                        c(android.text.TextUtils.getCapsMode(str5, 0, 0) + 169712943, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 74, (byte) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionType(0L) + 349455260, (short) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 78), objArr203);
                                                        java.lang.Class<?> cls58 = java.lang.Class.forName(((java.lang.String) objArr203[0]).intern());
                                                        java.lang.Object[] objArr204 = new java.lang.Object[1];
                                                        c((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 169712958, (-86) - android.view.KeyEvent.getDeadChar(0, 0), (byte) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 349455269, (short) (android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 15), objArr204);
                                                        cls58.getMethod(((java.lang.String) objArr204[0]).intern(), null).invoke(newInstance, null);
                                                        java.lang.Object[] objArr205 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                                        java.lang.Object[] objArr206 = {-688606955, 0, java.lang.Integer.valueOf((((~(i35 | (-993136850))) | (-283811330)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + 1936568614 + (((~(i35 | (-270667778))) | (~((-13143553) | i))) * (-519)) + (((~((-283811330) | i)) | 993136849) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))};
                                                        java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj60 == null) {
                                                            java.lang.Class cls59 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 2713 - android.graphics.Color.blue(0), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                                            byte b22 = (byte) ($$a[14] - 1);
                                                            java.lang.Object[] objArr207 = new java.lang.Object[1];
                                                            b(b22, b22, b22, objArr207);
                                                            obj60 = cls59.getMethod((java.lang.String) objArr207[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj60);
                                                        }
                                                        ((int[]) objArr205[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj60).invoke(null, objArr206)).intValue();
                                                        return objArr205;
                                                    } catch (java.lang.Throwable th4) {
                                                        java.lang.Throwable cause3 = th4.getCause();
                                                        if (cause3 != null) {
                                                            throw cause3;
                                                        }
                                                        throw th4;
                                                    }
                                                }
                                            } catch (java.lang.Throwable th5) {
                                                java.lang.Throwable cause4 = th5.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th5;
                                            }
                                        }
                                    }
                                    i6 = 0;
                                    str5 = r8;
                                    if (i6 == 0) {
                                    }
                                } catch (java.lang.Throwable th6) {
                                    java.lang.Throwable cause5 = th6.getCause();
                                    if (cause5 != null) {
                                        throw cause5;
                                    }
                                    throw th6;
                                }
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                            }
                        } else {
                            str6 = "";
                        }
                        if (invoke2 != null) {
                            java.lang.Object[] objArr208 = {invoke2, 42};
                            java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj61 == null) {
                                str7 = str6;
                                java.lang.Class cls60 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 2595 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) android.text.TextUtils.getOffsetAfter(str7, 0));
                                byte[] bArr37 = $$a;
                                java.lang.Object[] objArr209 = new java.lang.Object[1];
                                b((byte) (-bArr37[16]), (short) 653, (byte) (bArr37[14] - 1), objArr209);
                                obj61 = cls60.getMethod((java.lang.String) objArr209[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj61);
                            } else {
                                str7 = str6;
                            }
                            long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) obj61).invoke(null, objArr208)).longValue();
                            str6 = str7;
                            long j61 = ((-301) * longValue23) + 376672615032L + (((~(longValue23 | 1243143944 | j4)) | (~((-1243143945) | j5 | longValue23))) * (-302)) + ((~((-1243143945) | longValue23 | j4)) * (-604)) + (((~((~longValue23) | 1243143944)) | (~(longValue23 | j4))) * 302) + 13956580;
                        }
                        if (invoke != null) {
                            java.lang.Object[] objArr210 = {invoke, 42};
                            java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj62 == null) {
                                java.lang.Class cls61 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 28, 2594 - android.view.View.combineMeasuredStates(0, 0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                                byte[] bArr38 = $$a;
                                java.lang.Object[] objArr211 = new java.lang.Object[1];
                                b((byte) (-bArr38[16]), (short) 653, (byte) (bArr38[14] - 1), objArr211);
                                obj62 = cls61.getMethod((java.lang.String) objArr211[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj62);
                            }
                            long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) obj62).invoke(null, objArr210)).longValue();
                            long j62 = ~longValue24;
                            long j63 = ~(497455922 | longValue24);
                            long j64 = (((-721) * longValue24) - 358665719762L) + (((~(j62 | (-497455923))) | j5 | j63) * 1444) + (((~(497455922 | j4)) | j63 | (~(longValue24 | j4))) * (-1444)) + (((~(longValue24 | (-497455923))) | (~(j62 | 497455922))) * 722) + 759644602;
                        }
                        if (invoke2 != null) {
                            java.lang.Object[] objArr212 = {invoke2, 42};
                            java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj63 == null) {
                                str = str6;
                                java.lang.Class cls62 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 28, android.graphics.Color.green(0) + 2594, (char) ((-1) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                byte[] bArr39 = $$a;
                                java.lang.Object[] objArr213 = new java.lang.Object[1];
                                b((byte) (-bArr39[16]), (short) 653, (byte) (bArr39[14] - 1), objArr213);
                                obj63 = cls62.getMethod((java.lang.String) objArr213[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj63);
                            } else {
                                str = str6;
                            }
                            long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) obj63).invoke(null, objArr212)).longValue();
                            long j65 = ~longValue25;
                            long j66 = ~(j65 | 10524557 | j4);
                            long j67 = ((-712) * longValue25) + 7514533698L + (((~(longValue25 | (-10524558))) | (~(j5 | (-10524558))) | j66) * (-713)) + (j66 * 1426) + ((~(j65 | j5)) * 713) + 1246575967;
                            int i38 = ~((-617333114) | i);
                            int i39 = ~((-713418404) | i);
                        } else {
                            str = str6;
                        }
                    } else {
                        i10++;
                        i3 = 0;
                    }
                }
                str = "";
                java.lang.Object[] objArr292 = new java.lang.Object[1];
                a("\uea06诼⧻쿅淰Ϲꇤ䟭", android.view.View.MeasureSpec.getMode(i3) + 25087, objArr292);
                java.lang.String intern210 = ((java.lang.String) objArr292[i3]).intern();
                java.lang.Object[] objArr302 = new java.lang.Object[1];
                c(android.text.TextUtils.indexOf(str, str, i3, i3) + 169712631, (-86) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.util.TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 349455251, (short) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36), objArr302);
                java.lang.String intern310 = ((java.lang.String) objArr302[0]).intern();
                java.lang.Object[] objArr312 = new java.lang.Object[1];
                c((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 169712635, (-84) - android.view.View.getDefaultSize(0, 0), (byte) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 349455254, (short) ((-126) - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), objArr312);
                java.lang.String intern47 = ((java.lang.String) objArr312[0]).intern();
                java.lang.Object[] objArr322 = new java.lang.Object[1];
                a("\uea00\ue3c4曆\uf741촞\udaf6킻깳ꐭ", android.text.TextUtils.getOffsetBefore(str, 0) + 2503, objArr322);
                java.lang.String intern52 = ((java.lang.String) objArr322[0]).intern();
                java.lang.Object[] objArr332 = new java.lang.Object[1];
                c((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 169712642, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 85, (byte) android.view.KeyEvent.normalizeMetaState(0), 349455259 - android.text.TextUtils.indexOf(str, str, 0, 0), (short) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50), objArr332);
                java.lang.String intern62 = ((java.lang.String) objArr332[0]).intern();
                java.lang.Object[] objArr342 = new java.lang.Object[1];
                a("\uea0e⚀猜辈\ud86eᒮℴ綺蹚\udad1ᜓ⏶籨", 52362 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr342);
                java.lang.String intern72 = ((java.lang.String) objArr342[0]).intern();
                java.lang.Object[] objArr352 = new java.lang.Object[1];
                c(169712646 - android.os.Process.getGidForName(str), (-86) - android.graphics.Color.red(0), (byte) android.graphics.drawable.Drawable.resolveOpacity(0, 0), 349455260 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) (27 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr352);
                java.lang.String intern82 = ((java.lang.String) objArr352[0]).intern();
                java.lang.Object[] objArr362 = new java.lang.Object[1];
                c(169712650 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.view.View.MeasureSpec.getSize(0) - 85, (byte) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 349455259 - android.view.View.MeasureSpec.getMode(0), (short) android.view.MotionEvent.axisFromString(str), objArr362);
                java.lang.String intern92 = ((java.lang.String) objArr362[0]).intern();
                java.lang.Object[] objArr372 = new java.lang.Object[1];
                c(169712656 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 89, (byte) android.view.View.resolveSize(0, 0), android.text.TextUtils.indexOf(str, str, 0, 0) + 349455259, (short) (74 - android.text.TextUtils.indexOf(str, str)), objArr372);
                java.lang.String intern102 = ((java.lang.String) objArr372[0]).intern();
                java.lang.Object[] objArr382 = new java.lang.Object[1];
                a("\uea0b䚡덒\uefec墦땘\ue1e2劑轜ﯢ哓腗﷿⺓鬫\uf7f4", android.text.TextUtils.getTrimmedLength(str) + 44201, objArr382);
                java.lang.String intern112 = ((java.lang.String) objArr382[0]).intern();
                java.lang.Object[] objArr392 = new java.lang.Object[1];
                c(169712657 - android.text.TextUtils.indexOf(str, str, 0), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 80, (byte) android.view.View.resolveSize(0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 349455262, (short) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 47), objArr392);
                java.lang.String intern122 = ((java.lang.String) objArr392[0]).intern();
                java.lang.Object[] objArr402 = new java.lang.Object[1];
                a("\uea17␞瘞耥툹\uec31㹋䡁", 52748 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr402);
                java.lang.String intern132 = ((java.lang.String) objArr402[0]).intern();
                java.lang.Object[] objArr412 = new java.lang.Object[1];
                c((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 169712667, (-79) - android.text.TextUtils.indexOf(str, str, 0, 0), (byte) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 349455266 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) ((-36) - android.text.TextUtils.indexOf(str, str)), objArr412);
                java.lang.String intern142 = ((java.lang.String) objArr412[0]).intern();
                java.lang.Object[] objArr422 = new java.lang.Object[1];
                c(169712677 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-77) - android.view.View.MeasureSpec.getSize(0), (byte) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 349455266, (short) (44 - android.graphics.Color.blue(0)), objArr422);
                java.lang.String intern152 = ((java.lang.String) objArr422[0]).intern();
                java.lang.Object[] objArr432 = new java.lang.Object[1];
                c((android.os.Process.myTid() >> 22) + 169712690, (-83) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 17268, (short) (46 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), objArr432);
                java.lang.String intern162 = ((java.lang.String) objArr432[0]).intern();
                java.lang.Object[] objArr442 = new java.lang.Object[1];
                a("\uea14ᄀᰖᬽض്ࡍ", android.view.View.resolveSizeAndState(0, 0, 0) + 64271, objArr442);
                java.lang.String intern172 = ((java.lang.String) objArr442[0]).intern();
                java.lang.Object[] objArr452 = new java.lang.Object[1];
                a("\uea14ﲿ읙꧵낷魏涢", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5800, objArr452);
                java.lang.String intern182 = ((java.lang.String) objArr452[0]).intern();
                java.lang.Object[] objArr462 = new java.lang.Object[1];
                a("\uea14眳", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40231, objArr462);
                java.lang.String intern192 = ((java.lang.String) objArr462[0]).intern();
                java.lang.Object[] objArr472 = new java.lang.Object[1];
                a("\uea14᳸ߐ໔ㆿ㢯⎒⩣嵋䑌伖瘒礌揫櫖鷃蒰辙뚏륢", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 63211, objArr472);
                java.lang.String intern202 = ((java.lang.String) objArr472[0]).intern();
                java.lang.Object[] objArr482 = new java.lang.Object[1];
                a("\uea14ꐸ癃\u0087튨法", 20011 - android.graphics.Color.alpha(0), objArr482);
                java.lang.String intern212 = ((java.lang.String) objArr482[0]).intern();
                java.lang.Object[] objArr492 = new java.lang.Object[1];
                c(169712695 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.os.Process.myPid() >> 22) - 89, (byte) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), android.graphics.Color.rgb(0, 0, 0) + 366232485, (short) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18), objArr492);
                java.lang.String intern222 = ((java.lang.String) objArr492[0]).intern();
                java.lang.Object[] objArr502 = new java.lang.Object[1];
                c(android.text.TextUtils.getTrimmedLength(str) + 169712697, (android.view.KeyEvent.getMaxKeyCode() >> 16) - 75, (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 349455269 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 94), objArr502);
                java.lang.String intern232 = ((java.lang.String) objArr502[0]).intern();
                java.lang.Object[] objArr512 = new java.lang.Object[1];
                a("\uea13잜넔抟尦\u09baאּ풬虇", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 11656, objArr512);
                java.lang.String intern242 = ((java.lang.String) objArr512[0]).intern();
                java.lang.Object[] objArr522 = new java.lang.Object[1];
                c(169712712 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 81, (byte) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 349455270, (short) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 37), objArr522);
                java.lang.String intern252 = ((java.lang.String) objArr522[0]).intern();
                java.lang.Object[] objArr532 = new java.lang.Object[1];
                c(169712720 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 80, (byte) android.text.TextUtils.indexOf(str, str, 0), android.text.TextUtils.getOffsetAfter(str, 0) + 349455270, (short) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 90), objArr532);
                java.lang.String intern262 = ((java.lang.String) objArr532[0]).intern();
                java.lang.Object[] objArr542 = new java.lang.Object[1];
                c(169712731 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-80) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (byte) (android.view.MotionEvent.axisFromString(str) + 1), 349455271 - android.text.TextUtils.getCapsMode(str, 0, 0), (short) (12 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr542);
                java.lang.String intern272 = ((java.lang.String) objArr542[0]).intern();
                java.lang.Object[] objArr552 = new java.lang.Object[1];
                c(169712740 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (-77) - android.view.MotionEvent.axisFromString(str), (byte) android.text.TextUtils.indexOf(str, str), 349455271 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 34), objArr552);
                java.lang.String intern282 = ((java.lang.String) objArr552[0]).intern();
                java.lang.Object[] objArr562 = new java.lang.Object[1];
                a("\uea12쾄ꄊ骩簽凂୶\ueccf왶믿鶇眇⢗Ƚ", 9613 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr562);
                java.lang.String[] strArr22 = {intern210, intern310, intern47, intern52, intern62, intern72, intern82, intern92, intern102, intern112, intern122, intern132, intern142, intern152, intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, ((java.lang.String) objArr562[0]).intern()};
                java.lang.Object[] objArr572 = new java.lang.Object[1];
                c((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 169712587, android.graphics.Color.blue(0) - 80, (byte) android.view.KeyEvent.getDeadChar(0, 0), android.view.KeyEvent.normalizeMetaState(0) + 349455268, (short) ((-40) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr572);
                java.lang.Object[] objArr582 = {((java.lang.String) objArr572[0]).intern()};
                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj2 == null) {
                }
                str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr582);
                if (str2 != null) {
                }
                java.lang.String str92 = str;
                java.lang.Object[] objArr722 = new java.lang.Object[1];
                a("\uea48\u206b绠땩쎴Ṻ哮挱맬\uf475˽奻韽ꉡ\uf8ed㜹䷲顦훯\ued65㯹癯賨", android.text.TextUtils.getOffsetAfter(str92, 0) + 51839, objArr722);
                java.lang.Object[] objArr732 = {((java.lang.String) objArr722[0]).intern()};
                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj3 == null) {
                }
                long longValue62 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr732)).longValue();
                long j152 = ~longValue62;
                java.lang.String str102 = str92;
                long j162 = ((-987) * longValue62) + 849332648580L + (((~(j152 | j5 | 858779220)) | (~(longValue62 | 858779220 | j4))) * 988) + ((858779220 | j152) * (-988)) + (((~(longValue62 | 858779220 | j5)) | (~((-858779221) | j152)) | (~(j152 | j4))) * 988) + 431760847;
                j = (((int) (j162 >> 32)) & (((((~(i2 | (-1488213457))) | (~((-50987046) | i))) * (-272)) - 752157686) + (((~(659169319 | i)) | (-2147382776)) * (-272)) + (((~((-659169320) | i)) | 2096395730) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))) | (((int) j162) & ((((((~(i2 | (-855769225))) | (-2001971662)) | (~(2001873101 | i))) * (-68)) - 2056176639) + ((~(i2 | (-98561))) * (-68)) + (((~(i2 | (-2001873102))) | (-855867785)) * 68)));
                java.lang.Object[] objArr752 = new java.lang.Object[1];
                c((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 169712766, (-75) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (byte) android.view.Gravity.getAbsoluteGravity(0, 0), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 349455201, (short) (android.view.View.getDefaultSize(0, 0) + 47), objArr752);
                java.lang.Object[] objArr762 = {((java.lang.String) objArr752[0]).intern()};
                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj4 == null) {
                }
                long longValue72 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr762)).longValue();
                long j172 = ~longValue72;
                long j182 = j5 | 1023230376;
                long j192 = ((-885) * longValue72) + 1814187456648L + (((~(j172 | (-1023230377))) | (~(j172 | j4)) | (~(j182 | longValue72))) * 886) + (((~(j5 | longValue72)) | 1023230376) * (-1772)) + ((~j182) * 886) + 267309691;
                long j202 = (((int) j192) & ((((~(i2 | 2102764987)) * 52) - 624597751) + (((~(i2 | 760292506)) | (~(i2 | (-2097448380))) | 1342472481) * (-52)) + (((~(i2 | (-760292507))) | 5316608) * 52))) | (((int) (j192 >> 32)) & (((((~(i2 | 34877232)) | 1472103643) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 1453938172) + (((~(i2 | 1472114683)) | (~(i | (-11041)))) * (-519)) + (((~(1472103643 | i)) | (-34877233)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE)));
                if (j > 0) {
                }
                java.lang.Object[] objArr812 = new java.lang.Object[1];
                a("\uea48\u206b绠땩쎴Ṻ哮挱맬\uf475˽奻韽ꉡ\uf8ed㜹䷲顦훯\ued65㯹癯賨", android.view.View.MeasureSpec.getMode(0) + 51839, objArr812);
                java.lang.Object[] objArr822 = {((java.lang.String) objArr812[0]).intern()};
                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj5 == null) {
                }
                long longValue82 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr822)).longValue();
                long j212 = ~longValue82;
                long j222 = (((-97) * longValue82) - 20619978000L) + (((~(j212 | (-412399560))) | (~(j212 | j5))) * 98) + (((~(412399559 | j5)) | j212 | (~((-412399560) | j4))) * (-49)) + (((~(j212 | j4)) | (~(longValue82 | (-412399560)))) * 49) + 1702939627;
                j2 = (((int) (j222 >> 32)) & ((((((~((-886495315) | i)) | 550656080) * 576) - 1771464918) + (((~(i2 | (-335839235))) | 75016) * 576)) - 649677824)) | (((int) j222) & (((((~(1330676552 | i)) | 105939520) * (-502)) - 1768503973) + ((~(i2 | (-610338))) * (-502)) + (((~(106549857 | i)) | 1330676552) * 502)));
                java.lang.Object[] objArr842 = new java.lang.Object[1];
                a("\uea48쬶ꡨ覎", 8501 - android.view.View.combineMeasuredStates(0, 0), objArr842);
                java.lang.Object[] objArr852 = {((java.lang.String) objArr842[0]).intern()};
                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj6 == null) {
                }
                long longValue92 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr852)).longValue();
                long j232 = ~longValue92;
                long j242 = ~(j232 | (-179582557) | j4);
                long j252 = (((-475) * longValue92) - 85660879689L) + (((~(longValue92 | 179582556)) | j242) * (-476)) + (j242 * 952) + ((~(j232 | j5 | (-179582557))) * 476) + 1470122624;
                long j262 = (((int) (j252 >> 32)) & ((((~(1992715189 | i)) | 1162433834) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 569164338 + (((~(i2 | 1992715189)) | 1162433834) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) | (((int) j252) & ((((((~((-1427099975) | i)) | 1426444550) * 1504) + 1320243365) + ((~((-655425) | i)) * (-1504))) - 646424976));
                if (j2 > 0) {
                }
                java.lang.Object[] objArr902 = new java.lang.Object[1];
                c((android.view.ViewConfiguration.getTapTimeout() >> 16) + 169712782, (-84) - android.graphics.Color.argb(0, 0, 0, 0), (byte) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), android.text.TextUtils.indexOf(str3, str3, 0, 0) + 349455201, (short) (104 - android.graphics.Color.argb(0, 0, 0, 0)), objArr902);
                java.lang.String intern302 = ((java.lang.String) objArr902[0]).intern();
                java.lang.Object[] objArr912 = new java.lang.Object[1];
                a("\uea48裯\u2fe8싥懿ӥ믨底\ufddd郝㟇", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25339, objArr912);
                java.lang.String intern312 = ((java.lang.String) objArr912[0]).intern();
                java.lang.Object[] objArr922 = new java.lang.Object[1];
                c((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 169712788, (-78) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) (android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 349455201, (short) ((-80) - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), objArr922);
                java.lang.String intern322 = ((java.lang.String) objArr922[0]).intern();
                java.lang.Object[] objArr932 = new java.lang.Object[1];
                a("\uea48㘳剐繡骏ꛁ신\uef59ଧ坚玈龤", android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 56360, objArr932);
                java.lang.String intern332 = ((java.lang.String) objArr932[0]).intern();
                java.lang.Object[] objArr942 = new java.lang.Object[1];
                c(android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 169712800, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 80, (byte) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 349455201, (short) (android.widget.ExpandableListView.getPackedPositionChild(0L) - 53), objArr942);
                java.lang.String intern342 = ((java.lang.String) objArr942[0]).intern();
                java.lang.Object[] objArr952 = new java.lang.Object[1];
                a("\uea48鋇ᮣ職ॅ", 30932 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr952);
                java.lang.String intern352 = ((java.lang.String) objArr952[0]).intern();
                java.lang.Object[] objArr962 = new java.lang.Object[1];
                c((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 169712809, (-87) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 349455201 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (short) ((-111) - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), objArr962);
                java.lang.String[] strArr42 = {intern302, intern312, intern322, intern332, intern342, intern352, ((java.lang.String) objArr962[0]).intern()};
                i4 = 0;
                while (true) {
                    r8 = 7;
                    if (i4 >= 7) {
                    }
                    i4++;
                    str3 = str4;
                }
                if (i5 != 0) {
                }
            } else {
                str = "";
                i2 = i9;
            }
            i3 = 0;
            java.lang.Object[] objArr2922 = new java.lang.Object[1];
            a("\uea06诼⧻쿅淰Ϲꇤ䟭", android.view.View.MeasureSpec.getMode(i3) + 25087, objArr2922);
            java.lang.String intern2102 = ((java.lang.String) objArr2922[i3]).intern();
            java.lang.Object[] objArr3022 = new java.lang.Object[1];
            c(android.text.TextUtils.indexOf(str, str, i3, i3) + 169712631, (-86) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.util.TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 349455251, (short) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36), objArr3022);
            java.lang.String intern3102 = ((java.lang.String) objArr3022[0]).intern();
            java.lang.Object[] objArr3122 = new java.lang.Object[1];
            c((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 169712635, (-84) - android.view.View.getDefaultSize(0, 0), (byte) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 349455254, (short) ((-126) - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), objArr3122);
            java.lang.String intern472 = ((java.lang.String) objArr3122[0]).intern();
            java.lang.Object[] objArr3222 = new java.lang.Object[1];
            a("\uea00\ue3c4曆\uf741촞\udaf6킻깳ꐭ", android.text.TextUtils.getOffsetBefore(str, 0) + 2503, objArr3222);
            java.lang.String intern522 = ((java.lang.String) objArr3222[0]).intern();
            java.lang.Object[] objArr3322 = new java.lang.Object[1];
            c((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 169712642, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 85, (byte) android.view.KeyEvent.normalizeMetaState(0), 349455259 - android.text.TextUtils.indexOf(str, str, 0, 0), (short) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50), objArr3322);
            java.lang.String intern622 = ((java.lang.String) objArr3322[0]).intern();
            java.lang.Object[] objArr3422 = new java.lang.Object[1];
            a("\uea0e⚀猜辈\ud86eᒮℴ綺蹚\udad1ᜓ⏶籨", 52362 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr3422);
            java.lang.String intern722 = ((java.lang.String) objArr3422[0]).intern();
            java.lang.Object[] objArr3522 = new java.lang.Object[1];
            c(169712646 - android.os.Process.getGidForName(str), (-86) - android.graphics.Color.red(0), (byte) android.graphics.drawable.Drawable.resolveOpacity(0, 0), 349455260 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) (27 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr3522);
            java.lang.String intern822 = ((java.lang.String) objArr3522[0]).intern();
            java.lang.Object[] objArr3622 = new java.lang.Object[1];
            c(169712650 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.view.View.MeasureSpec.getSize(0) - 85, (byte) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 349455259 - android.view.View.MeasureSpec.getMode(0), (short) android.view.MotionEvent.axisFromString(str), objArr3622);
            java.lang.String intern922 = ((java.lang.String) objArr3622[0]).intern();
            java.lang.Object[] objArr3722 = new java.lang.Object[1];
            c(169712656 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 89, (byte) android.view.View.resolveSize(0, 0), android.text.TextUtils.indexOf(str, str, 0, 0) + 349455259, (short) (74 - android.text.TextUtils.indexOf(str, str)), objArr3722);
            java.lang.String intern1022 = ((java.lang.String) objArr3722[0]).intern();
            java.lang.Object[] objArr3822 = new java.lang.Object[1];
            a("\uea0b䚡덒\uefec墦땘\ue1e2劑轜ﯢ哓腗﷿⺓鬫\uf7f4", android.text.TextUtils.getTrimmedLength(str) + 44201, objArr3822);
            java.lang.String intern1122 = ((java.lang.String) objArr3822[0]).intern();
            java.lang.Object[] objArr3922 = new java.lang.Object[1];
            c(169712657 - android.text.TextUtils.indexOf(str, str, 0), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 80, (byte) android.view.View.resolveSize(0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 349455262, (short) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 47), objArr3922);
            java.lang.String intern1222 = ((java.lang.String) objArr3922[0]).intern();
            java.lang.Object[] objArr4022 = new java.lang.Object[1];
            a("\uea17␞瘞耥툹\uec31㹋䡁", 52748 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4022);
            java.lang.String intern1322 = ((java.lang.String) objArr4022[0]).intern();
            java.lang.Object[] objArr4122 = new java.lang.Object[1];
            c((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 169712667, (-79) - android.text.TextUtils.indexOf(str, str, 0, 0), (byte) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 349455266 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) ((-36) - android.text.TextUtils.indexOf(str, str)), objArr4122);
            java.lang.String intern1422 = ((java.lang.String) objArr4122[0]).intern();
            java.lang.Object[] objArr4222 = new java.lang.Object[1];
            c(169712677 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (-77) - android.view.View.MeasureSpec.getSize(0), (byte) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 349455266, (short) (44 - android.graphics.Color.blue(0)), objArr4222);
            java.lang.String intern1522 = ((java.lang.String) objArr4222[0]).intern();
            java.lang.Object[] objArr4322 = new java.lang.Object[1];
            c((android.os.Process.myTid() >> 22) + 169712690, (-83) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 17268, (short) (46 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), objArr4322);
            java.lang.String intern1622 = ((java.lang.String) objArr4322[0]).intern();
            java.lang.Object[] objArr4422 = new java.lang.Object[1];
            a("\uea14ᄀᰖᬽض്ࡍ", android.view.View.resolveSizeAndState(0, 0, 0) + 64271, objArr4422);
            java.lang.String intern1722 = ((java.lang.String) objArr4422[0]).intern();
            java.lang.Object[] objArr4522 = new java.lang.Object[1];
            a("\uea14ﲿ읙꧵낷魏涢", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5800, objArr4522);
            java.lang.String intern1822 = ((java.lang.String) objArr4522[0]).intern();
            java.lang.Object[] objArr4622 = new java.lang.Object[1];
            a("\uea14眳", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40231, objArr4622);
            java.lang.String intern1922 = ((java.lang.String) objArr4622[0]).intern();
            java.lang.Object[] objArr4722 = new java.lang.Object[1];
            a("\uea14᳸ߐ໔ㆿ㢯⎒⩣嵋䑌伖瘒礌揫櫖鷃蒰辙뚏륢", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 63211, objArr4722);
            java.lang.String intern2022 = ((java.lang.String) objArr4722[0]).intern();
            java.lang.Object[] objArr4822 = new java.lang.Object[1];
            a("\uea14ꐸ癃\u0087튨法", 20011 - android.graphics.Color.alpha(0), objArr4822);
            java.lang.String intern2122 = ((java.lang.String) objArr4822[0]).intern();
            java.lang.Object[] objArr4922 = new java.lang.Object[1];
            c(169712695 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.os.Process.myPid() >> 22) - 89, (byte) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), android.graphics.Color.rgb(0, 0, 0) + 366232485, (short) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18), objArr4922);
            java.lang.String intern2222 = ((java.lang.String) objArr4922[0]).intern();
            java.lang.Object[] objArr5022 = new java.lang.Object[1];
            c(android.text.TextUtils.getTrimmedLength(str) + 169712697, (android.view.KeyEvent.getMaxKeyCode() >> 16) - 75, (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 349455269 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 94), objArr5022);
            java.lang.String intern2322 = ((java.lang.String) objArr5022[0]).intern();
            java.lang.Object[] objArr5122 = new java.lang.Object[1];
            a("\uea13잜넔抟尦\u09baאּ풬虇", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 11656, objArr5122);
            java.lang.String intern2422 = ((java.lang.String) objArr5122[0]).intern();
            java.lang.Object[] objArr5222 = new java.lang.Object[1];
            c(169712712 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 81, (byte) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 349455270, (short) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 37), objArr5222);
            java.lang.String intern2522 = ((java.lang.String) objArr5222[0]).intern();
            java.lang.Object[] objArr5322 = new java.lang.Object[1];
            c(169712720 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 80, (byte) android.text.TextUtils.indexOf(str, str, 0), android.text.TextUtils.getOffsetAfter(str, 0) + 349455270, (short) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 90), objArr5322);
            java.lang.String intern2622 = ((java.lang.String) objArr5322[0]).intern();
            java.lang.Object[] objArr5422 = new java.lang.Object[1];
            c(169712731 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-80) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (byte) (android.view.MotionEvent.axisFromString(str) + 1), 349455271 - android.text.TextUtils.getCapsMode(str, 0, 0), (short) (12 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr5422);
            java.lang.String intern2722 = ((java.lang.String) objArr5422[0]).intern();
            java.lang.Object[] objArr5522 = new java.lang.Object[1];
            c(169712740 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (-77) - android.view.MotionEvent.axisFromString(str), (byte) android.text.TextUtils.indexOf(str, str), 349455271 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 34), objArr5522);
            java.lang.String intern2822 = ((java.lang.String) objArr5522[0]).intern();
            java.lang.Object[] objArr5622 = new java.lang.Object[1];
            a("\uea12쾄ꄊ骩簽凂୶\ueccf왶믿鶇眇⢗Ƚ", 9613 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr5622);
            java.lang.String[] strArr222 = {intern2102, intern3102, intern472, intern522, intern622, intern722, intern822, intern922, intern1022, intern1122, intern1222, intern1322, intern1422, intern1522, intern1622, intern1722, intern1822, intern1922, intern2022, intern2122, intern2222, intern2322, intern2422, intern2522, intern2622, intern2722, intern2822, ((java.lang.String) objArr5622[0]).intern()};
            java.lang.Object[] objArr5722 = new java.lang.Object[1];
            c((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 169712587, android.graphics.Color.blue(0) - 80, (byte) android.view.KeyEvent.getDeadChar(0, 0), android.view.KeyEvent.normalizeMetaState(0) + 349455268, (short) ((-40) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr5722);
            java.lang.Object[] objArr5822 = {((java.lang.String) objArr5722[0]).intern()};
            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj2 == null) {
            }
            str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr5822);
            if (str2 != null) {
            }
            java.lang.String str922 = str;
            java.lang.Object[] objArr7222 = new java.lang.Object[1];
            a("\uea48\u206b绠땩쎴Ṻ哮挱맬\uf475˽奻韽ꉡ\uf8ed㜹䷲顦훯\ued65㯹癯賨", android.text.TextUtils.getOffsetAfter(str922, 0) + 51839, objArr7222);
            java.lang.Object[] objArr7322 = {((java.lang.String) objArr7222[0]).intern()};
            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj3 == null) {
            }
            long longValue622 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7322)).longValue();
            long j1522 = ~longValue622;
            java.lang.String str1022 = str922;
            long j1622 = ((-987) * longValue622) + 849332648580L + (((~(j1522 | j5 | 858779220)) | (~(longValue622 | 858779220 | j4))) * 988) + ((858779220 | j1522) * (-988)) + (((~(longValue622 | 858779220 | j5)) | (~((-858779221) | j1522)) | (~(j1522 | j4))) * 988) + 431760847;
            j = (((int) (j1622 >> 32)) & (((((~(i2 | (-1488213457))) | (~((-50987046) | i))) * (-272)) - 752157686) + (((~(659169319 | i)) | (-2147382776)) * (-272)) + (((~((-659169320) | i)) | 2096395730) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))) | (((int) j1622) & ((((((~(i2 | (-855769225))) | (-2001971662)) | (~(2001873101 | i))) * (-68)) - 2056176639) + ((~(i2 | (-98561))) * (-68)) + (((~(i2 | (-2001873102))) | (-855867785)) * 68)));
            java.lang.Object[] objArr7522 = new java.lang.Object[1];
            c((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 169712766, (-75) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (byte) android.view.Gravity.getAbsoluteGravity(0, 0), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 349455201, (short) (android.view.View.getDefaultSize(0, 0) + 47), objArr7522);
            java.lang.Object[] objArr7622 = {((java.lang.String) objArr7522[0]).intern()};
            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj4 == null) {
            }
            long longValue722 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr7622)).longValue();
            long j1722 = ~longValue722;
            long j1822 = j5 | 1023230376;
            long j1922 = ((-885) * longValue722) + 1814187456648L + (((~(j1722 | (-1023230377))) | (~(j1722 | j4)) | (~(j1822 | longValue722))) * 886) + (((~(j5 | longValue722)) | 1023230376) * (-1772)) + ((~j1822) * 886) + 267309691;
            long j2022 = (((int) j1922) & ((((~(i2 | 2102764987)) * 52) - 624597751) + (((~(i2 | 760292506)) | (~(i2 | (-2097448380))) | 1342472481) * (-52)) + (((~(i2 | (-760292507))) | 5316608) * 52))) | (((int) (j1922 >> 32)) & (((((~(i2 | 34877232)) | 1472103643) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 1453938172) + (((~(i2 | 1472114683)) | (~(i | (-11041)))) * (-519)) + (((~(1472103643 | i)) | (-34877233)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE)));
            if (j > 0) {
            }
            java.lang.Object[] objArr8122 = new java.lang.Object[1];
            a("\uea48\u206b绠땩쎴Ṻ哮挱맬\uf475˽奻韽ꉡ\uf8ed㜹䷲顦훯\ued65㯹癯賨", android.view.View.MeasureSpec.getMode(0) + 51839, objArr8122);
            java.lang.Object[] objArr8222 = {((java.lang.String) objArr8122[0]).intern()};
            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj5 == null) {
            }
            long longValue822 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8222)).longValue();
            long j2122 = ~longValue822;
            long j2222 = (((-97) * longValue822) - 20619978000L) + (((~(j2122 | (-412399560))) | (~(j2122 | j5))) * 98) + (((~(412399559 | j5)) | j2122 | (~((-412399560) | j4))) * (-49)) + (((~(j2122 | j4)) | (~(longValue822 | (-412399560)))) * 49) + 1702939627;
            j2 = (((int) (j2222 >> 32)) & ((((((~((-886495315) | i)) | 550656080) * 576) - 1771464918) + (((~(i2 | (-335839235))) | 75016) * 576)) - 649677824)) | (((int) j2222) & (((((~(1330676552 | i)) | 105939520) * (-502)) - 1768503973) + ((~(i2 | (-610338))) * (-502)) + (((~(106549857 | i)) | 1330676552) * 502)));
            java.lang.Object[] objArr8422 = new java.lang.Object[1];
            a("\uea48쬶ꡨ覎", 8501 - android.view.View.combineMeasuredStates(0, 0), objArr8422);
            java.lang.Object[] objArr8522 = {((java.lang.String) objArr8422[0]).intern()};
            obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj6 == null) {
            }
            long longValue922 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr8522)).longValue();
            long j2322 = ~longValue922;
            long j2422 = ~(j2322 | (-179582557) | j4);
            long j2522 = (((-475) * longValue922) - 85660879689L) + (((~(longValue922 | 179582556)) | j2422) * (-476)) + (j2422 * 952) + ((~(j2322 | j5 | (-179582557))) * 476) + 1470122624;
            long j2622 = (((int) (j2522 >> 32)) & ((((~(1992715189 | i)) | 1162433834) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + 569164338 + (((~(i2 | 1992715189)) | 1162433834) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) | (((int) j2522) & ((((((~((-1427099975) | i)) | 1426444550) * 1504) + 1320243365) + ((~((-655425) | i)) * (-1504))) - 646424976));
            if (j2 > 0) {
            }
            java.lang.Object[] objArr9022 = new java.lang.Object[1];
            c((android.view.ViewConfiguration.getTapTimeout() >> 16) + 169712782, (-84) - android.graphics.Color.argb(0, 0, 0, 0), (byte) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), android.text.TextUtils.indexOf(str3, str3, 0, 0) + 349455201, (short) (104 - android.graphics.Color.argb(0, 0, 0, 0)), objArr9022);
            java.lang.String intern3022 = ((java.lang.String) objArr9022[0]).intern();
            java.lang.Object[] objArr9122 = new java.lang.Object[1];
            a("\uea48裯\u2fe8싥懿ӥ믨底\ufddd郝㟇", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25339, objArr9122);
            java.lang.String intern3122 = ((java.lang.String) objArr9122[0]).intern();
            java.lang.Object[] objArr9222 = new java.lang.Object[1];
            c((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 169712788, (-78) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) (android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 349455201, (short) ((-80) - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), objArr9222);
            java.lang.String intern3222 = ((java.lang.String) objArr9222[0]).intern();
            java.lang.Object[] objArr9322 = new java.lang.Object[1];
            a("\uea48㘳剐繡骏ꛁ신\uef59ଧ坚玈龤", android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 56360, objArr9322);
            java.lang.String intern3322 = ((java.lang.String) objArr9322[0]).intern();
            java.lang.Object[] objArr9422 = new java.lang.Object[1];
            c(android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 169712800, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 80, (byte) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 349455201, (short) (android.widget.ExpandableListView.getPackedPositionChild(0L) - 53), objArr9422);
            java.lang.String intern3422 = ((java.lang.String) objArr9422[0]).intern();
            java.lang.Object[] objArr9522 = new java.lang.Object[1];
            a("\uea48鋇ᮣ職ॅ", 30932 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr9522);
            java.lang.String intern3522 = ((java.lang.String) objArr9522[0]).intern();
            java.lang.Object[] objArr9622 = new java.lang.Object[1];
            c((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 169712809, (-87) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 349455201 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (short) ((-111) - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), objArr9622);
            java.lang.String[] strArr422 = {intern3022, intern3122, intern3222, intern3322, intern3422, intern3522, ((java.lang.String) objArr9622[0]).intern()};
            i4 = 0;
            while (true) {
                r8 = 7;
                if (i4 >= 7) {
                }
                i4++;
                str3 = str4;
            }
            if (i5 != 0) {
            }
        } catch (java.lang.Throwable th8) {
            java.lang.Throwable cause6 = th8.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th8;
        }
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.DC4, -107, -36, -117, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10};
        $$b = 15;
    }

    public final boolean AlternateContactlessPaymentDataJson() {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, -1589615593, 1589615593, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
