package com.payair.hce;

/* loaded from: classes4.dex */
public final class getClientVersion {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static int values;
    private static int writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = (~i3) | i4;
        int i6 = ~i;
        if ((i * (-112)) + (i2 * (-112)) + (((~i5) | i) * 226) + (((~(i | i5)) | (~(i2 | i6)) | (~(i6 | i3))) * (-113)) + ((~(i4 | i3)) * 113) != 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        byte[] bArr = (byte[]) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        values = (writeReplace + 25) % 128;
        int writeReplace2 = writeReplace(0, intValue);
        byte[] bArr2 = new byte[writeReplace2];
        if (bArr.length < writeReplace2) {
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, writeReplace2);
        int i7 = values + 75;
        writeReplace = i7 % 128;
        int i8 = i7 % 2;
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3 = 3 - (b * 2);
        int i4 = b2 * 2;
        byte[] bArr = $$a;
        int i5 = (i * 2) + 107;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i5 += i3;
            i3 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i3 + 1;
            int i9 = i2 + 1;
            i6 = i8;
            i3 = bArr[i8];
            i7 = i9;
            i5 += i3;
            i3 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        char[] cArr = (char[]) objArr[0];
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        char[] cArr2 = (char[]) objArr[1];
        if (cArr == cArr2) {
            values = (writeReplace + 35) % 128;
            return bool2;
        }
        if (cArr == null || cArr2 == null) {
            return bool;
        }
        if (cArr.length != cArr2.length) {
            writeReplace = (values + 71) % 128;
            return bool;
        }
        for (int i = 0; i != cArr.length; i++) {
            if (cArr[i] != cArr2[i]) {
                int i2 = (writeReplace + 23) % 128;
                values = i2;
                int i3 = i2 + 81;
                writeReplace = i3 % 128;
                if (i3 % 2 != 0) {
                    return bool;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        return bool2;
    }

    public static final class valueOf<T> implements java.util.Iterator<T> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int valueOf;
        private static long values;
        private static int writeReplace;
        private int AlternateContactlessPaymentDataJson = 0;
        private final T[] DigitizedCardProfile;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v7, types: [int] */
        /* JADX WARN: Type inference failed for: r5v9, types: [int] */
        /* JADX WARN: Type inference failed for: r6v1, types: [int] */
        private static void b(short s, byte b, int i, java.lang.Object[] objArr) {
            ?? r6 = 113 - b;
            byte[] bArr = $$a;
            int i2 = i * 3;
            int i3 = 4 - (s * 2);
            byte[] bArr2 = new byte[i2 + 1];
            int i4 = -1;
            byte b2 = r6;
            if (bArr == null) {
                i4 = -1;
                b2 = i3 + r6;
                i3++;
            }
            while (true) {
                int i5 = i4 + 1;
                bArr2[i5] = b2;
                if (i5 == i2) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                byte b3 = b2;
                i4 = i5;
                b2 = bArr[i3] + b3;
                i3++;
            }
        }

        private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
            char[] cArr;
            if (str != null) {
                $10 = ($11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                cArr = str.toCharArray();
            } else {
                cArr = str;
            }
            char[] cArr2 = cArr;
            com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
            getdsrpdata.values = i;
            int length = cArr2.length;
            long[] jArr = new long[length];
            getdsrpdata.valueOf = 0;
            while (getdsrpdata.valueOf < cArr2.length) {
                int i2 = $10 + 55;
                $11 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = getdsrpdata.valueOf;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 31, 1938 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3600));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            b((short) 0, (byte) 0, 0, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                        }
                        jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (values - 4761752123935132024L);
                        java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 64, 1443 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (29730 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            b((short) 0, (byte) 1, 0, objArr5);
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
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.view.View.MeasureSpec.getSize(0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1889, (char) (3600 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b((short) 0, (byte) 0, 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj3);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).longValue() ^ (values ^ (-4761752123935132024L));
                    java.lang.Object[] objArr8 = {getdsrpdata, getdsrpdata};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1444, (char) (android.graphics.Color.blue(0) + 29682));
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        b((short) 0, (byte) 1, 0, objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                }
            }
            char[] cArr3 = new char[length];
            getdsrpdata.valueOf = 0;
            while (getdsrpdata.valueOf < cArr2.length) {
                cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
                java.lang.Object[] objArr10 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj5 == null) {
                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.text.TextUtils.getOffsetBefore("", 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1444, (char) (android.view.KeyEvent.normalizeMetaState(0) + 29682));
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    b((short) 0, (byte) 1, 0, objArr11);
                    obj5 = cls5.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        public valueOf(T[] tArr) {
            this.DigitizedCardProfile = tArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.AlternateContactlessPaymentDataJson < this.DigitizedCardProfile.length) {
                valueOf = (writeReplace + 37) % 128;
                return true;
            }
            writeReplace = (valueOf + 51) % 128;
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            int i = writeReplace;
            int i2 = i + 79;
            valueOf = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = this.AlternateContactlessPaymentDataJson;
                T[] tArr = this.DigitizedCardProfile;
                if (i3 == tArr.length) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a("\ue9d5똺噄\uf6c5隡㛕흄眬\u175e랂垥\uf7d8鐈㐿푏瓛ᓪ", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24533, objArr);
                    sb.append(((java.lang.String) objArr[0]).intern());
                    sb.append(this.AlternateContactlessPaymentDataJson);
                    throw new java.util.NoSuchElementException(sb.toString());
                }
                this.AlternateContactlessPaymentDataJson = i3 + 1;
                T t = tArr[i3];
                int i4 = i + 91;
                valueOf = i4 % 128;
                if (i4 % 2 == 0) {
                    return t;
                }
                throw null;
            }
            int length = this.DigitizedCardProfile.length;
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\ue9d9伶ꑮᶓ狁\uabefŴ晳\udf97㓂混쌣㡣釓\uf6c9⿵蔯頻厕裃\ue1ea䝫뱢ᖃ䫍ꏲᥨ繤힘ಃ旝\udb3bえ榖컙➳", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 42700, objArr);
            throw new java.lang.UnsupportedOperationException(((java.lang.String) objArr[0]).intern());
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            valueOf = 0;
            writeReplace = 1;
            values = 8733817353873301266L;
        }

        static void init$0() {
            $$a = new byte[]{6, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -80, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION};
            $$b = 22;
        }
    }

    public static boolean AlternateContactlessPaymentDataJson(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null) {
            return false;
        }
        if (bArr.length == bArr2.length) {
            for (int i = 0; i != bArr.length; i++) {
                int i2 = (values + 75) % 128;
                writeReplace = i2;
                if (bArr[i] != bArr2[i]) {
                    values = (i2 + 39) % 128;
                    return false;
                }
            }
            return true;
        }
        writeReplace = (values + 117) % 128;
        return false;
    }

    public static boolean DigitizedCardProfile(byte[] bArr, byte[] bArr2) {
        int i = (writeReplace + 119) % 128;
        values = i;
        if (bArr == bArr2) {
            writeReplace = (i + 17) % 128;
            return true;
        }
        if (bArr == null || bArr2 == null) {
            return false;
        }
        if (bArr.length != bArr2.length) {
            if (DigitizedCardProfile(bArr, bArr)) {
                return false;
            }
            writeReplace = (values + 67) % 128;
            return true;
        }
        int i2 = 0;
        for (int i3 = 0; i3 != bArr.length; i3++) {
            i2 |= bArr[i3] ^ bArr2[i3];
        }
        if (i2 == 0) {
            return true;
        }
        int i4 = values + 17;
        writeReplace = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        char[] cArr;
        char c;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = AlternateContactlessPaymentDataJson;
        long j = 0;
        if (cArr2 != null) {
            $11 = ($10 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i4];
                    objArr2[i2] = java.lang.Integer.valueOf(cArr2[i8]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.util.TypedValue.complexToFraction(i2, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i2, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 2806, (char) (android.graphics.Color.rgb(i2, i2, i2) + 16777216));
                        byte b = (byte) ($$b & 1);
                        byte b2 = (byte) (b - 1);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b, b2, b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr3[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 0;
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
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i5];
        java.lang.System.arraycopy(cArr2, i3, cArr4, 0, i5);
        if (bArr2 != null) {
            int i9 = $10 + 55;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr = new char[i5];
                getaccounttype.writeReplace = 1;
                c = 1;
            } else {
                cArr = new char[i5];
                getaccounttype.writeReplace = 0;
                c = 0;
            }
            while (getaccounttype.writeReplace < i5) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i10 = $10 + 63;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = getaccounttype.writeReplace;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 45, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2836, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            b(0, (byte) 0, (byte) 0, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                        }
                        cArr[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    int i12 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 44, 2836 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.view.KeyEvent.getDeadChar(0, 0));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b(0, (byte) 0, (byte) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj3);
                    }
                    cArr[i12] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                } else {
                    int i13 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj4 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 2880 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.text.TextUtils.getOffsetAfter("", 0));
                        byte b3 = (byte) ($$b & 10);
                        byte b4 = (byte) (b3 - 2);
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        b(b3, b4, b4, objArr9);
                        obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj4);
                    }
                    cArr[i13] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).charValue();
                }
                c = cArr[getaccounttype.writeReplace];
                java.lang.Object[] objArr10 = {getaccounttype, getaccounttype};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 34, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            java.lang.System.arraycopy(cArr4, 0, cArr5, 0, i5);
            int i14 = i5 - i7;
            java.lang.System.arraycopy(cArr5, 0, cArr4, i14, i7);
            java.lang.System.arraycopy(cArr5, i7, cArr4, 0, i14);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                int i15 = $11 + 67;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr6[getaccounttype.writeReplace] = cArr4[i5 >> getaccounttype.writeReplace];
                    i = getaccounttype.writeReplace << 1;
                } else {
                    cArr6[getaccounttype.writeReplace] = cArr4[(i5 - getaccounttype.writeReplace) - 1];
                    i = getaccounttype.writeReplace + 1;
                }
            }
            cArr4 = cArr6;
        }
        if (i6 > 0) {
            int i16 = 0;
            while (true) {
                getaccounttype.writeReplace = i16;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                i16 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    public static void writeReplace(byte[] bArr) {
        values = (writeReplace + 61) % 128;
        int i = 0;
        while (i < bArr.length) {
            int i2 = (writeReplace + 53) % 128;
            values = i2;
            bArr[i] = 0;
            i++;
            writeReplace = (i2 + 81) % 128;
        }
    }

    public static int AlternateContactlessPaymentDataJson(byte[] bArr) {
        int i;
        byte b;
        int i2 = writeReplace + 105;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i3 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i3;
            }
            int i4 = values + 13;
            writeReplace = i4 % 128;
            if (i4 % 2 == 0) {
                i = i3 >> 16774;
                b = bArr[length];
            } else {
                i = i3 * 257;
                b = bArr[length];
            }
            i3 = i ^ b;
        }
    }

    public static int AlternateContactlessPaymentDataJson(char[] cArr) {
        int i = writeReplace + 29;
        values = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i2 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i2;
            }
            int i3 = (writeReplace + 97) % 128;
            values = i3;
            i2 = (i2 * 257) ^ cArr[length];
            int i4 = i3 + 19;
            writeReplace = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static byte[] values(byte[] bArr) {
        int i = (values + 87) % 128;
        writeReplace = i;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        int i2 = i + 77;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static int writeReplace(int i, int i2) {
        int i3 = writeReplace;
        int i4 = i3 + 27;
        values = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (i2 >= 0) {
            int i5 = i3 + 81;
            values = i5 % 128;
            if (i5 % 2 == 0) {
                return i2;
            }
            throw null;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{0, 3, 7, 0}, "\u0001\u0000\u0000", false, objArr);
        stringBuffer.append(((java.lang.String) objArr[0]).intern()).append(i2);
        throw new java.lang.IllegalArgumentException(stringBuffer.toString());
    }

    private static byte[] valueOf(byte[] bArr, byte[] bArr2) {
        int i = (writeReplace + 85) % 128;
        values = i;
        if (bArr != null) {
            writeReplace = (i + 3) % 128;
            if (bArr2 != null) {
                writeReplace = (i + 111) % 128;
                byte[] bArr3 = new byte[bArr.length + bArr2.length];
                java.lang.System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                java.lang.System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
                values = (writeReplace + 1) % 128;
                return bArr3;
            }
        }
        if (bArr2 != null) {
            return values(bArr2);
        }
        return values(bArr);
    }

    public static byte[] AlternateContactlessPaymentDataJson(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr != null) {
            int i = writeReplace;
            values = (i + 117) % 128;
            if (bArr2 != null) {
                values = (i + 107) % 128;
                if (bArr3 != null) {
                    values = (i + 15) % 128;
                    byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
                    java.lang.System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
                    java.lang.System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
                    java.lang.System.arraycopy(bArr3, 0, bArr4, bArr.length + bArr2.length, bArr3.length);
                    return bArr4;
                }
            }
        }
        if (bArr == null) {
            return valueOf(bArr2, bArr3);
        }
        if (bArr2 == null) {
            return valueOf(bArr, bArr3);
        }
        return valueOf(bArr, bArr2);
    }

    public static byte[] DigitizedCardProfile(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i = values;
        int i2 = i + 97;
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (bArr != null) {
            int i3 = i + 39;
            int i4 = i3 % 128;
            writeReplace = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (bArr2 != null && bArr3 != null) {
                int i5 = i4 + 69;
                values = i5 % 128;
                if (i5 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                if (bArr4 != null) {
                    byte[] bArr5 = new byte[bArr.length + bArr2.length + bArr3.length + bArr4.length];
                    java.lang.System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
                    java.lang.System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
                    java.lang.System.arraycopy(bArr3, 0, bArr5, bArr.length + bArr2.length, bArr3.length);
                    java.lang.System.arraycopy(bArr4, 0, bArr5, bArr.length + bArr2.length + bArr3.length, bArr4.length);
                    return bArr5;
                }
            }
        }
        if (bArr4 == null) {
            byte[] AlternateContactlessPaymentDataJson2 = AlternateContactlessPaymentDataJson(bArr, bArr2, bArr3);
            int i6 = values + 75;
            writeReplace = i6 % 128;
            if (i6 % 2 != 0) {
                return AlternateContactlessPaymentDataJson2;
            }
            throw new java.lang.ArithmeticException();
        }
        if (bArr3 == null) {
            return AlternateContactlessPaymentDataJson(bArr, bArr2, bArr4);
        }
        if (bArr2 != null) {
            return AlternateContactlessPaymentDataJson(bArr2, bArr3, bArr4);
        }
        byte[] AlternateContactlessPaymentDataJson3 = AlternateContactlessPaymentDataJson(bArr, bArr3, bArr4);
        writeReplace = (values + 47) % 128;
        return AlternateContactlessPaymentDataJson3;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        values = 0;
        writeReplace = 1;
        AlternateContactlessPaymentDataJson = new char[]{16861, 16888, 16888};
    }

    public static byte[] AlternateContactlessPaymentDataJson(byte[] bArr, int i) {
        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i)}, 1227667964, -1227667963, i);
    }

    static void init$0() {
        $$a = new byte[]{5, -77, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -4};
        $$b = 167;
    }

    public static boolean valueOf(char[] cArr, char[] cArr2) {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{cArr, cArr2}, 1662027640, -1662027640, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }
}
