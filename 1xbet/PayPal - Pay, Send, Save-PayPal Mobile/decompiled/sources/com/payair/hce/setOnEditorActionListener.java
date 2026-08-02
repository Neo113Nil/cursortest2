package com.payair.hce;

/* loaded from: classes4.dex */
public class setOnEditorActionListener extends com.payair.hce.setEms {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static long DigitizedCardProfile;
    private static int valueOf;
    private static int writeReplace;
    private final char[] values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 43 - i2;
        int i5 = i + 65;
        char[] cArr = new char[35 - s];
        int i6 = 34 - s;
        if (bArr == null) {
            int i7 = i4;
            i5 = i6;
            i3 = 0;
            i4++;
            i5 = (i5 + i7) - 2;
            cArr[i3] = (char) i5;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i3++;
            i7 = bArr[i4];
            i4++;
            i5 = (i5 + i7) - 2;
            cArr[i3] = (char) i5;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            cArr[i3] = (char) i5;
            if (i3 == i6) {
            }
        }
    }

    private static void h(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4 = 4 - (i2 * 4);
        int i5 = i * 2;
        int i6 = 119 - (i3 * 2);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        int i8 = -1;
        if (bArr == null) {
            i8 = -1;
            i6 = (-i4) + i7;
            i4++;
        }
        while (true) {
            int i9 = i8 + 1;
            bArr2[i9] = (byte) i6;
            if (i9 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i6;
            i8 = i9;
            i6 = (-bArr[i4]) + i10;
            i4++;
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $11;
        $10 = (i2 + 63) % 128;
        char[] cArr = str;
        if (str != null) {
            $10 = (i2 + 75) % 128;
            char[] charArray = str.toCharArray();
            $10 = ($11 + 119) % 128;
            cArr = charArray;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(DigitizedCardProfile ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(DigitizedCardProfile)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 40, 1921 - android.graphics.Color.blue(0), (char) android.view.View.MeasureSpec.getSize(0));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    h(0, 0, 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 27, 429 - android.view.View.MeasureSpec.getMode(0), (char) (31610 - (android.os.Process.myPid() >> 22)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    h(0, 0, 0, objArr5);
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
        $10 = ($11 + 63) % 128;
        objArr[0] = str2;
    }

    setOnEditorActionListener(char[] cArr) {
        this.values = cArr;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.String str = new java.lang.String(((com.payair.hce.setOnEditorActionListener) objArr[0]).values);
        int i = writeReplace + 23;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return str;
        }
        throw null;
    }

    public java.lang.String toString() {
        int i = valueOf + 103;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = (java.lang.String) valueOf(new java.lang.Object[]{this}, 1638544882, -1638544882, java.lang.System.identityHashCode(this));
        valueOf = (writeReplace + 93) % 128;
        return str;
    }

    @Override // com.payair.hce.setGravity
    public int hashCode() {
        int i = writeReplace + 101;
        valueOf = i % 128;
        char[] cArr = this.values;
        if (i % 2 == 0) {
            return com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(cArr);
        }
        com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(cArr);
        throw null;
    }

    @Override // com.payair.hce.setEms
    protected final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        int i = valueOf;
        writeReplace = (i + 31) % 128;
        if (setems instanceof com.payair.hce.setOnEditorActionListener) {
            boolean booleanValue = ((java.lang.Boolean) com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(new java.lang.Object[]{this.values, ((com.payair.hce.setOnEditorActionListener) setems).values}, 1662027640, -1662027640, (int) java.lang.System.currentTimeMillis())).booleanValue();
            valueOf = (writeReplace + 69) % 128;
            return booleanValue;
        }
        int i2 = i + 25;
        writeReplace = i2 % 128;
        return i2 % 2 == 0;
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        int i = valueOf;
        writeReplace = (i + 11) % 128;
        writeReplace = (i + 15) % 128;
        return false;
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() {
        int i = writeReplace + 1;
        valueOf = i % 128;
        if (i % 2 == 0) {
            int length = this.values.length << 1;
            return ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length)}, -1174070258, 1174070259, length)).intValue() + 1 + (this.values.length << 1);
        }
        int length2 = this.values.length;
        int length3 = this.values.length;
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        setmaxlines.DigitizedCardProfile(30);
        setmaxlines.AlternateContactlessPaymentDataJson(this.values.length << 1);
        int i = 0;
        while (true) {
            char[] cArr = this.values;
            if (i == cArr.length) {
                break;
            }
            valueOf = (writeReplace + 117) % 128;
            char c = cArr[i];
            setmaxlines.DigitizedCardProfile((byte) (c >> '\b'));
            setmaxlines.DigitizedCardProfile((byte) c);
            i++;
        }
        int i2 = valueOf + 45;
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        valueOf = 0;
        writeReplace = 1;
        DigitizedCardProfile = -3800254113316471292L;
    }

    static void init$1() {
        $$d = new byte[]{com.visa.cbp.getEncExpo.IResultReceiver2, 75, 70, 2};
        $$e = 150;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x038c, code lost:
    
        if (r0.contains(r5.getField((java.lang.String) r14[0]).get(null)) != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0671 A[Catch: all -> 0x00d4, TryCatch #2 {all -> 0x00d4, blocks: (B:5:0x0039, B:7:0x007d, B:8:0x00c0, B:18:0x016a, B:20:0x01ab, B:21:0x01ee, B:27:0x02b8, B:29:0x02c9, B:30:0x0307, B:50:0x062c, B:52:0x0671, B:53:0x06bd, B:58:0x06f8, B:60:0x073a, B:61:0x0789, B:93:0x03b2, B:95:0x03f2, B:96:0x043a, B:100:0x0226, B:102:0x0251, B:103:0x0294), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x073a A[Catch: all -> 0x00d4, TryCatch #2 {all -> 0x00d4, blocks: (B:5:0x0039, B:7:0x007d, B:8:0x00c0, B:18:0x016a, B:20:0x01ab, B:21:0x01ee, B:27:0x02b8, B:29:0x02c9, B:30:0x0307, B:50:0x062c, B:52:0x0671, B:53:0x06bd, B:58:0x06f8, B:60:0x073a, B:61:0x0789, B:93:0x03b2, B:95:0x03f2, B:96:0x043a, B:100:0x0226, B:102:0x0251, B:103:0x0294), top: B:2:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] writeReplace(android.content.Context context, int i, int i2) {
        java.lang.Object[] objArr;
        java.lang.Integer num;
        int i3;
        java.lang.Object obj;
        byte[] bArr;
        int i4;
        java.lang.Object obj2;
        try {
            if (context == null) {
                valueOf = (writeReplace + 17) % 128;
                java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                int i5 = ~i;
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((i | 192012497) * (-50)) + 24500556 + (((~(i | (-7340034))) | (~(i5 | (-805576455)))) * 50) + (((~(i5 | 192012497)) | (~((-812916488) | i5)) | 805576454) * 50))};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2713 - android.text.TextUtils.getOffsetBefore("", 0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    int i6 = $$a[14] - 1;
                    short s = (short) i6;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(s, (byte) (s | 39), (byte) i6, objArr4);
                    obj3 = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                }
                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr3)).intValue();
                return objArr2;
            }
            writeReplace = (valueOf + 43) % 128;
            try {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b("鱜ᒣ캼鰽鸊\udb56齣㽄뜯ꄩ蹲吼쨇\uf433ꔔ榚ᵭᣖ堪뻤は⏻༬폒䮵皈⏒", 1 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr5[0]).intern());
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b("霧昀泻靀\ueca2礁珃폗뱋펓ⰽ룛셼蚞݉蔧ᘜ橵祖刄㬱兘", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr6);
                java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr6[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b("䚄퓒慘䛥幻璲齕㽲混慘↖吊ჟ㑂૰榬잵\ud8a7\uf7ce뻒\uea84\ue388ꂈ폑酸뛱谮\ue8dd䑏姜礚㷁欯氷≃儢Ḃ㜚", 1 - android.view.KeyEvent.keyCodeFromString(""), objArr7);
                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b("\uef90܄\uf3ff\ueff6趯\ue610峌ﳾ쓿", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr8);
                if ((cls3.getField(((java.lang.String) objArr8[0]).intern()).getInt(invoke) & 2) != 0) {
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                    java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((~((-327253125) | i)) * 623) + 1140257642 + (((~i) | 672170770) * (-623)) + (((~((-330005670) | i)) | 327253124 | (~(674923315 | i))) * 623))};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 2713 - android.text.TextUtils.indexOf("", "", 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int i7 = $$a[14] - 1;
                        short s2 = (short) i7;
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        a(s2, (byte) (s2 | 39), (byte) i7, objArr10);
                        obj4 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr9)).intValue();
                } else {
                    valueOf = (writeReplace + 101) % 128;
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                    int i8 = ~(i | (-538024577));
                    java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((403203334 | i8) * (-476)) + 1254527232 + (i8 * 952) + ((~((-538024577) | (~i))) * 476))};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj5 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 50, 2713 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) android.text.TextUtils.getTrimmedLength(""));
                        int i9 = $$a[14] - 1;
                        short s3 = (short) i9;
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a(s3, (byte) (s3 | 39), (byte) i9, objArr12);
                        obj5 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr11)).intValue();
                }
                if (((int[]) objArr[1])[0] != i) {
                    valueOf = (writeReplace + 115) % 128;
                    return objArr;
                }
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2058003131);
                if (obj6 == null) {
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 33, android.view.Gravity.getAbsoluteGravity(0, 0) + 1738, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 5826));
                    int i10 = $$a[14] - 1;
                    short s4 = (short) i10;
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    a(s4, (byte) (s4 | 39), (byte) i10, objArr13);
                    obj6 = cls6.getMethod((java.lang.String) objArr13[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2058003131, obj6);
                }
                java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) obj6).invoke(null, null);
                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.graphics.Color.argb(0, 0, 0, 0), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1738, (char) (android.view.MotionEvent.axisFromString("") + 5827));
                byte[] bArr2 = $$a;
                int i11 = bArr2[14] - 1;
                short s5 = (short) i11;
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                a(s5, (byte) (s5 | 39), (byte) i11, objArr14);
                if (!set.contains(cls7.getField((java.lang.String) objArr14[0]).get(null))) {
                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1738 - android.text.TextUtils.indexOf("", "", 0), (char) (5825 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                    byte b = (byte) (-bArr2[20]);
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    a(53, b, (byte) (b | com.google.common.base.Ascii.CAN), objArr15);
                }
                if (android.os.Build.VERSION.SDK_INT == 30) {
                    writeReplace = (valueOf + 39) % 128;
                    java.lang.Object[] objArr16 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(849120416 | r5)) | 155284248) * (-108)) - 682034648) + (((~((~i) | 155808568)) | (~((-155808569) | i)) | 848596096) * 54) + ((i | 848596096) * 54))};
                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj7 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2713, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int i12 = bArr2[14] - 1;
                        short s6 = (short) i12;
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        a(s6, (byte) (s6 | 39), (byte) i12, objArr18);
                        obj7 = cls9.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                    }
                    ((int[]) objArr16[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr17)).intValue();
                    return objArr16;
                }
                try {
                } catch (java.lang.Exception unused) {
                    num = 0;
                }
                if (android.os.Build.VERSION.SDK_INT <= 33) {
                    num = 0;
                    bArr = bArr2;
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    b("설딅禃셖㾭氣硼\ud84d\uea5d\u0084㥜덪靻喛ሧ躝䀕", 1 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr19);
                    try {
                        java.lang.Object[] objArr20 = {((java.lang.String) objArr19[0]).intern()};
                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj8 == null) {
                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 39, 1921 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                            byte b2 = (byte) (bArr[14] - 1);
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            a(653, b2, (byte) (b2 | 34), objArr21);
                            obj8 = cls10.getMethod((java.lang.String) objArr21[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj8);
                        }
                        java.lang.Object invoke2 = ((java.lang.reflect.Method) obj8).invoke(null, objArr20);
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        b("⮴ஒᆝ⮅ծ", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, objArr22);
                        if (invoke2.equals(((java.lang.String) objArr22[0]).intern())) {
                            i4 = 1;
                            int[] iArr = new int[i4];
                            int[] iArr2 = new int[i4];
                            iArr[0] = i;
                            iArr2[0] = i ^ 10;
                            java.lang.Object[] objArr23 = {iArr, iArr2, null, new int[i4]};
                            java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-156663815) | i)) | (-1004535767)) * (-502)) + 1713399248 + ((~((~i) | (-156270597))) * (-502)) + (((~(i | (-848265171))) | (-156663815)) * 502))};
                            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj2 == null) {
                            }
                            ((int[]) objArr23[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr24)).intValue();
                            return objArr23;
                        }
                        i3 = 1;
                        int[] iArr3 = new int[i3];
                        int[] iArr4 = new int[i3];
                        iArr3[0] = i;
                        iArr4[0] = i;
                        java.lang.Object[] objArr25 = {iArr3, iArr4, null, new int[i3]};
                        java.lang.Object[] objArr26 = {java.lang.Integer.valueOf(i2), num, java.lang.Integer.valueOf((((((~((-67502115) | i)) | (~(937426870 | i))) * 69) + 2023387796) + ((((~(i | (-634336435))) | 566834320) | (~(370592550 | i))) * (-69))) - 561596396)};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj == null) {
                        }
                        ((int[]) objArr25[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr26)).intValue();
                        return objArr25;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                b("欲㖩锒欝뼋胨㻞黨䀁耣헖\uf5c6㵾핹ﺸ젿\uea0d㧖ϝἓ윧˼咙牼볙垛硪䥓槿루赖鱀", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr27);
                try {
                    java.lang.Object[] objArr28 = {((java.lang.String) objArr27[0]).intern()};
                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                    if (obj9 == null) {
                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.KeyEvent.keyCodeFromString(""), 3161 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (33098 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                        byte b3 = (byte) (bArr2[14] - 1);
                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                        a(653, b3, (byte) (b3 | 34), objArr29);
                        obj9 = cls11.getMethod((java.lang.String) objArr29[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj9);
                    }
                    long j = ~((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, objArr28)).longValue();
                    long j2 = i;
                    long j3 = ~j2;
                    num = 0;
                    long j4 = ~(j | (-979328521));
                    bArr = bArr2;
                    long j5 = (((((r5 * (-463)) - 455387762265L) + (((~(j3 | (-979328521))) | ((~(j | j3)) | j4)) * 464)) + (((979328520 | j2) | j) * (-464))) + ((j4 | (~(j2 | (-979328521)))) * 464)) - 358339587;
                    int i13 = (int) (j5 >> 32);
                    int i14 = (int) j5;
                    int i15 = ~i;
                    if (((i13 & ((((~(2098292610 | i)) | (-759448275)) * (-366)) + 630187520 + (((~((-4456529) | i)) | 1343300864) * 366))) | (i14 & (((((-1810520023) | i) * 614) - 753508769) + (((~(1959679713 | i15)) | (-2146326520) | (~(522453303 | i15))) * (-1228)) + (((~(i15 | (-186646807))) | (~((-1623873217) | i15))) * 614)))) == 1) {
                        i4 = 1;
                        int[] iArr5 = new int[i4];
                        int[] iArr22 = new int[i4];
                        iArr5[0] = i;
                        iArr22[0] = i ^ 10;
                        java.lang.Object[] objArr232 = {iArr5, iArr22, null, new int[i4]};
                        java.lang.Object[] objArr242 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-156663815) | i)) | (-1004535767)) * (-502)) + 1713399248 + ((~((~i) | (-156270597))) * (-502)) + (((~(i | (-848265171))) | (-156663815)) * 502))};
                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj2 == null) {
                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 50, 2713 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) android.view.KeyEvent.normalizeMetaState(0));
                            int i16 = bArr[14] - 1;
                            short s7 = (short) i16;
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            a(s7, (byte) (s7 | 39), (byte) i16, objArr30);
                            obj2 = cls12.getMethod((java.lang.String) objArr30[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                        }
                        ((int[]) objArr232[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr242)).intValue();
                        return objArr232;
                    }
                    i3 = 1;
                    int[] iArr32 = new int[i3];
                    int[] iArr42 = new int[i3];
                    iArr32[0] = i;
                    iArr42[0] = i;
                    java.lang.Object[] objArr252 = {iArr32, iArr42, null, new int[i3]};
                    java.lang.Object[] objArr262 = {java.lang.Integer.valueOf(i2), num, java.lang.Integer.valueOf((((((~((-67502115) | i)) | (~(937426870 | i))) * 69) + 2023387796) + ((((~(i | (-634336435))) | 566834320) | (~(370592550 | i))) * (-69))) - 561596396)};
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj == null) {
                        java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2713 - (android.os.Process.myPid() >> 22), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                        int i17 = $$a[14] - 1;
                        short s8 = (short) i17;
                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                        a(s8, (byte) (s8 | 39), (byte) i17, objArr31);
                        obj = cls13.getMethod((java.lang.String) objArr31[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                    }
                    ((int[]) objArr252[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr262)).intValue();
                    return objArr252;
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }

    static void init$0() {
        $$a = new byte[]{46, -52, 83, 98, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, -19, 13, com.google.common.base.Ascii.VT, -14, 16};
        $$b = 151;
    }

    private java.lang.String values() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 1638544882, -1638544882, java.lang.System.identityHashCode(this));
    }
}
