package com.payair.hce;

/* loaded from: classes4.dex */
public final class setOnGroupExpandListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean IccPrivateKeyCrtComponentsJson;
    private static int[] RecordsJson;
    private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getCvrMaskAnd;
    private static int getPaymentFci;
    private static boolean getProfileVersion;
    private java.util.Map<java.lang.Class, com.payair.hce.setSelectedGroup> valueOf;
    private java.util.LinkedList<java.lang.Object> values = new java.util.LinkedList<>();
    private java.util.LinkedList<java.lang.Object> AlternateContactlessPaymentDataJson = new java.util.LinkedList<>();
    private com.payair.hce.setChildIndicator writeReplace = new com.payair.hce.setChildIndicator();
    private java.util.Map<com.payair.hce.setChildIndicator, com.payair.hce.setSelectedGroup> DigitizedCardProfile = new java.util.HashMap();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = 3 - (i * 2);
        int i4 = 118 - (s * 52);
        byte[] bArr = $$a;
        int i5 = s2 * 3;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i4 += -i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i3];
            i2++;
            i4 += -i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ~i2;
        int i6 = (i * 758) + (i2 * (-756)) + ((i | i4) * (-757)) + ((~(i5 | i | i3)) * 1514) + (((~((~i) | i5)) | (~(i4 | i5)) | (~(i2 | i | i3))) * 757);
        if (i6 == 1) {
            return writeReplace(objArr);
        }
        if (i6 != 2) {
            return i6 != 3 ? AlternateContactlessPaymentDataJson(objArr) : DigitizedCardProfile(objArr);
        }
        com.payair.hce.setOnGroupExpandListener setongroupexpandlistener = (com.payair.hce.setOnGroupExpandListener) objArr[0];
        java.lang.Class cls = (java.lang.Class) objArr[1];
        com.payair.hce.setSelectedGroup setselectedgroup = (com.payair.hce.setSelectedGroup) objArr[2];
        getCvrMaskAnd = (getPaymentFci + 69) % 128;
        setongroupexpandlistener.valueOf.put(cls, setselectedgroup);
        getPaymentFci = (getCvrMaskAnd + 115) % 128;
        return setongroupexpandlistener;
    }

    public setOnGroupExpandListener() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.valueOf = hashMap;
        hashMap.put(java.lang.Object.class, new com.payair.hce.setItemsCanFocus());
        this.valueOf.put(java.util.Collection.class, new com.payair.hce.setKeyListener());
        this.valueOf.put(java.util.List.class, new com.payair.hce.setKeyListener());
        this.valueOf.put(java.util.Set.class, new com.payair.hce.setCompoundDrawableTintList());
        this.valueOf.put(java.util.SortedSet.class, new com.payair.hce.setCompoundDrawablePadding());
        this.valueOf.put(java.util.Map.class, new com.payair.hce.setMovementMethod());
        this.valueOf.put(java.lang.Integer.class, new com.payair.hce.setCompoundDrawablesWithIntrinsicBounds());
        this.valueOf.put(java.lang.Integer.TYPE, new com.payair.hce.setCompoundDrawablesWithIntrinsicBounds());
        this.valueOf.put(java.lang.Float.class, new com.payair.hce.setOverscrollFooter());
        this.valueOf.put(java.lang.Float.TYPE, new com.payair.hce.setOverscrollFooter());
        this.valueOf.put(java.lang.Double.class, new com.payair.hce.setAutoSizeTextTypeWithDefaults());
        this.valueOf.put(java.lang.Double.TYPE, new com.payair.hce.setAutoSizeTextTypeWithDefaults());
        this.valueOf.put(java.lang.Short.class, new com.payair.hce.setCompoundDrawableTintMode());
        this.valueOf.put(java.lang.Short.TYPE, new com.payair.hce.setCompoundDrawableTintMode());
        this.valueOf.put(java.lang.Long.class, new com.payair.hce.setTransformationMethod());
        this.valueOf.put(java.lang.Long.TYPE, new com.payair.hce.setTransformationMethod());
        this.valueOf.put(java.lang.Byte.class, new com.payair.hce.setDividerHeight());
        this.valueOf.put(java.lang.Byte.TYPE, new com.payair.hce.setDividerHeight());
        this.valueOf.put(java.lang.Boolean.class, new com.payair.hce.setHeaderDividersEnabled());
        this.valueOf.put(java.lang.Boolean.TYPE, new com.payair.hce.setHeaderDividersEnabled());
        this.valueOf.put(java.lang.Character.class, new com.payair.hce.setDivider());
        this.valueOf.put(java.lang.Character.TYPE, new com.payair.hce.setDivider());
        this.valueOf.put(java.lang.Enum.class, new com.payair.hce.setAutoSizeTextTypeUniformWithPresetSizes());
        this.valueOf.put(java.util.Date.class, new com.payair.hce.setAutoSizeTextTypeUniformWithConfiguration());
        this.valueOf.put(java.lang.String.class, new com.payair.hce.setCompoundDrawablesRelativeWithIntrinsicBounds());
        this.valueOf.put(java.lang.reflect.Array.class, new com.payair.hce.setSelectionAfterHeaderView());
        this.valueOf.put(java.math.BigDecimal.class, new com.payair.hce.setOverscrollHeader());
        this.valueOf.put(java.math.BigInteger.class, new com.payair.hce.setFooterDividersEnabled());
        this.valueOf.put(com.payair.hce.setOnGroupClickListener.class, new com.payair.hce.setCompoundDrawables());
    }

    public final com.payair.hce.setOnGroupExpandListener values(com.payair.hce.setChildIndicator setchildindicator, com.payair.hce.setSelectedGroup setselectedgroup) {
        int i = getPaymentFci + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            this.DigitizedCardProfile.put(setchildindicator, setselectedgroup);
            getPaymentFci = (getCvrMaskAnd + 125) % 128;
            return this;
        }
        this.DigitizedCardProfile.put(setchildindicator, setselectedgroup);
        throw null;
    }

    public final com.payair.hce.setChildIndicator AlternateContactlessPaymentDataJson() {
        int i = getCvrMaskAnd;
        int i2 = i + 31;
        getPaymentFci = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        com.payair.hce.setChildIndicator setchildindicator = this.writeReplace;
        getPaymentFci = (i + 75) % 128;
        return setchildindicator;
    }

    public final java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        getPaymentFci = (getCvrMaskAnd + 25) % 128;
        java.lang.Object writeReplace = writeReplace(obj, (java.lang.reflect.Type) null);
        getPaymentFci = (getCvrMaskAnd + 53) % 128;
        return writeReplace;
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        int i2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr3 = new char[4];
        char[] cArr4 = new char[iArr.length * 2];
        int[] iArr2 = RecordsJson;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        int i3 = 1;
        int i4 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[i4] = java.lang.Integer.valueOf(iArr2[i5]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 27, 28 - android.text.TextUtils.indexOf("", c, i4), (char) (android.os.Process.myTid() >> 22))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr3[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i5++;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    i4 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = RecordsJson;
        if (iArr5 != null) {
            int i6 = $11;
            $10 = (i6 + 103) % 128;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            $10 = (i6 + 87) % 128;
            int i7 = 0;
            while (i7 < length3) {
                int i8 = $11 + 89;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    java.lang.Object[] objArr3 = new java.lang.Object[i3];
                    objArr3[0] = java.lang.Integer.valueOf(iArr5[i7]);
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj2 == null) {
                        i2 = length3;
                        cArr2 = cArr4;
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 27, android.view.Gravity.getAbsoluteGravity(0, 0) + 29, (char) android.view.View.MeasureSpec.getMode(0))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                    } else {
                        cArr2 = cArr4;
                        i2 = length3;
                    }
                    iArr6[i7] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                } else {
                    cArr2 = cArr4;
                    i2 = length3;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(iArr5[i7])};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 26, android.graphics.Color.blue(0) + 29, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj3);
                    }
                    iArr6[i7] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    i7++;
                }
                length3 = i2;
                cArr4 = cArr2;
                i3 = 1;
            }
            cArr = cArr4;
            iArr5 = iArr6;
        } else {
            cArr = cArr4;
        }
        char c2 = 0;
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            cArr3[c2] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr3[1] = (char) iArr[istransitsupported.valueOf];
            cArr3[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr3[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr3[0] << 16) + cArr3[1];
            istransitsupported.values = (cArr3[2] << 16) + cArr3[3];
            com.payair.hce.isTransitSupported.values(iArr4);
            $10 = ($11 + 37) % 128;
            for (int i9 = 0; i9 < 16; i9++) {
                istransitsupported.DigitizedCardProfile ^= iArr4[i9];
                java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 31, 5088 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
            }
            int i10 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i10;
            istransitsupported.values ^= iArr4[16];
            istransitsupported.DigitizedCardProfile ^= iArr4[17];
            int i11 = istransitsupported.DigitizedCardProfile;
            int i12 = istransitsupported.values;
            cArr3[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr3[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr3[2] = (char) (istransitsupported.values >>> 16);
            cArr3[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr4);
            cArr[istransitsupported.valueOf * 2] = cArr3[0];
            cArr[(istransitsupported.valueOf * 2) + 1] = cArr3[1];
            cArr[(istransitsupported.valueOf * 2) + 2] = cArr3[2];
            cArr[(istransitsupported.valueOf * 2) + 3] = cArr3[3];
            java.lang.Object[] objArr6 = {istransitsupported, istransitsupported};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj5 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 49, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2923, (char) (3037 - (android.view.ViewConfiguration.getTapTimeout() >> 16)));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                c((short) 1, (short) 0, 0, objArr7);
                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
            c2 = 0;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    public final java.lang.Object writeReplace(java.lang.Object obj, java.lang.reflect.Type type) {
        int i = getPaymentFci + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getCvrMaskAnd = i % 128;
        if (i % 2 != 0) {
            this.AlternateContactlessPaymentDataJson.add(obj);
            throw null;
        }
        this.AlternateContactlessPaymentDataJson.add(obj);
        if (obj == null) {
            getCvrMaskAnd = (getPaymentFci + 59) % 128;
            return null;
        }
        try {
            java.lang.Class valueOf = valueOf(obj, values(type));
            com.payair.hce.setSelectedGroup valueOf2 = valueOf(valueOf);
            if (valueOf2 != null) {
                return valueOf2.DigitizedCardProfile(this, obj, type, valueOf);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.writeReplace);
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{-684384816, 72730764, -1005177287, 602556566, 223499603, 68518264, 62571059, -136902030, -1120489134, -475843383, -997416918, -1542890832, 578364342, 162201915, -1318070914, -1462356717, 18520475, 1872705927, -728219337, 2025002178, 1734254894, -927148385, 1754546194, -1849334262}, 48 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(valueOf);
            throw new com.payair.hce.setOnGroupCollapseListener(sb.toString());
        } finally {
            this.AlternateContactlessPaymentDataJson.removeLast();
        }
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setOnGroupExpandListener setongroupexpandlistener = (com.payair.hce.setOnGroupExpandListener) objArr[0];
        java.util.Collection collection = (java.util.Collection) objArr[1];
        java.util.Collection collection2 = (java.util.Collection) objArr[2];
        java.lang.reflect.Type type = (java.lang.reflect.Type) objArr[3];
        int i = getCvrMaskAnd + 35;
        getPaymentFci = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        java.lang.reflect.Type type2 = type instanceof java.lang.reflect.ParameterizedType ? ((java.lang.reflect.ParameterizedType) type).getActualTypeArguments()[0] : null;
        setongroupexpandlistener.AlternateContactlessPaymentDataJson.add(collection);
        setongroupexpandlistener.values.add(collection2);
        com.payair.hce.setChildIndicator AlternateContactlessPaymentDataJson = setongroupexpandlistener.AlternateContactlessPaymentDataJson();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b(null, null, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, "\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
        AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(((java.lang.String) objArr2[0]).intern());
        java.util.Iterator it = collection.iterator();
        int i2 = getCvrMaskAnd + 49;
        getPaymentFci = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = getCvrMaskAnd + 37;
            getPaymentFci = i4 % 128;
            if (i4 % 2 == 0) {
                collection2.add(setongroupexpandlistener.writeReplace(it.next(), type2));
                throw new java.lang.ArithmeticException();
            }
            collection2.add(setongroupexpandlistener.writeReplace(it.next(), type2));
        }
        setongroupexpandlistener.AlternateContactlessPaymentDataJson().writeReplace();
        setongroupexpandlistener.values.removeLast();
        setongroupexpandlistener.AlternateContactlessPaymentDataJson.removeLast();
        return collection2;
    }

    public final java.lang.Object writeReplace(java.util.Map map, java.util.Map<java.lang.Object, java.lang.Object> map2, java.lang.reflect.Type type, java.lang.reflect.Type type2) {
        int i = getPaymentFci + 53;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            this.AlternateContactlessPaymentDataJson.add(map);
            this.values.add(map2);
            for (java.lang.Object obj : map.keySet()) {
                getPaymentFci = (getCvrMaskAnd + 41) % 128;
                com.payair.hce.setChildIndicator setchildindicator = this.writeReplace;
                java.lang.Object[] objArr = new java.lang.Object[1];
                b(null, null, 128 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0086\u0088\u0085\u0087", objArr);
                setchildindicator.AlternateContactlessPaymentDataJson(((java.lang.String) objArr[0]).intern());
                java.lang.Object writeReplace = writeReplace(obj, type);
                this.writeReplace.writeReplace();
                com.payair.hce.setChildIndicator setchildindicator2 = this.writeReplace;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b(null, null, 128 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
                setchildindicator2.AlternateContactlessPaymentDataJson(((java.lang.String) objArr2[0]).intern());
                java.lang.Object writeReplace2 = writeReplace(map.get(obj), type2);
                this.writeReplace.writeReplace();
                map2.put(writeReplace, writeReplace2);
            }
            this.values.removeLast();
            this.AlternateContactlessPaymentDataJson.removeLast();
            return map2;
        }
        this.AlternateContactlessPaymentDataJson.add(map);
        this.values.add(map2);
        map.keySet().iterator();
        throw null;
    }

    public final java.lang.Object DigitizedCardProfile(java.util.Map map, java.lang.Object obj, java.lang.reflect.Type type) {
        java.lang.reflect.Type[] genericParameterTypes;
        try {
            this.values.add(obj);
            for (com.payair.hce.setTopEdgeEffectColor settopedgeeffectcolor : com.payair.hce.setBottomEdgeEffectColor.values(obj.getClass()).DigitizedCardProfile()) {
                if (((java.lang.Boolean) valueOf(new java.lang.Object[]{map, settopedgeeffectcolor}, 623702744, -623702744, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
                    getPaymentFci = (getCvrMaskAnd + 99) % 128;
                    java.lang.Object AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(map, settopedgeeffectcolor);
                    if (settopedgeeffectcolor.getProfileVersion().booleanValue()) {
                        this.writeReplace.AlternateContactlessPaymentDataJson((java.lang.String) com.payair.hce.setTopEdgeEffectColor.DigitizedCardProfile(new java.lang.Object[]{settopedgeeffectcolor}, 1544115242, -1544115240, java.lang.System.identityHashCode(settopedgeeffectcolor)));
                        java.lang.reflect.Method valueOf = settopedgeeffectcolor.valueOf();
                        if (valueOf == null) {
                            java.lang.reflect.Field field = (java.lang.reflect.Field) com.payair.hce.setTopEdgeEffectColor.DigitizedCardProfile(new java.lang.Object[]{settopedgeeffectcolor}, -53863153, 53863153, java.lang.System.identityHashCode(settopedgeeffectcolor));
                            if (field != null) {
                                int i = getPaymentFci + 83;
                                getCvrMaskAnd = i % 128;
                                if (i % 2 != 0) {
                                    field.setAccessible(true);
                                } else {
                                    field.setAccessible(true);
                                }
                                field.set(obj, writeReplace(AlternateContactlessPaymentDataJson, field.getGenericType()));
                            }
                        } else {
                            int i2 = getCvrMaskAnd + 117;
                            getPaymentFci = i2 % 128;
                            if (i2 % 2 == 0) {
                                genericParameterTypes = valueOf.getGenericParameterTypes();
                                if (genericParameterTypes.length != 0) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(this.writeReplace);
                                    java.lang.Object[] objArr = new java.lang.Object[1];
                                    b(null, null, 126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "\u008a\u0090\u0097\u0098\u008f\u0085\u0095\u008a\u0094\u0097\u0096\u008a\u0094\u0085\u008f\u0085\u0095\u0082\u0094\u0082\u008d\u008a\u0085\u0083\u0093\u0092\u0091\u0086\u008a\u0082\u008a\u0090\u0085\u008f\u008e\u0085\u008d\u008c\u008b\u008a\u008a\u0089", objArr);
                                    sb.append(((java.lang.String) objArr[0]).intern());
                                    sb.append(obj.getClass().getName());
                                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                                    a(new int[]{-1215892539, -496915595}, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1, objArr2);
                                    sb.append(((java.lang.String) objArr2[0]).intern());
                                    sb.append(valueOf.getName());
                                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                                    b(null, null, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u008a\u008f\u0097\u0093\u008a\u008f\u0084\u0099\u008a", objArr3);
                                    sb.append(((java.lang.String) objArr3[0]).intern());
                                    sb.append(genericParameterTypes.length);
                                    throw new com.payair.hce.setOnGroupCollapseListener(sb.toString());
                                }
                                valueOf.invoke(this.values.getLast(), writeReplace(AlternateContactlessPaymentDataJson, writeReplace(genericParameterTypes[0], type)));
                            } else {
                                genericParameterTypes = valueOf.getGenericParameterTypes();
                                if (genericParameterTypes.length != 1) {
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                    sb2.append(this.writeReplace);
                                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                                    b(null, null, 126 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "\u008a\u0090\u0097\u0098\u008f\u0085\u0095\u008a\u0094\u0097\u0096\u008a\u0094\u0085\u008f\u0085\u0095\u0082\u0094\u0082\u008d\u008a\u0085\u0083\u0093\u0092\u0091\u0086\u008a\u0082\u008a\u0090\u0085\u008f\u008e\u0085\u008d\u008c\u008b\u008a\u008a\u0089", objArr4);
                                    sb2.append(((java.lang.String) objArr4[0]).intern());
                                    sb2.append(obj.getClass().getName());
                                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                                    a(new int[]{-1215892539, -496915595}, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1, objArr22);
                                    sb2.append(((java.lang.String) objArr22[0]).intern());
                                    sb2.append(valueOf.getName());
                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                    b(null, null, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u008a\u008f\u0097\u0093\u008a\u008f\u0084\u0099\u008a", objArr32);
                                    sb2.append(((java.lang.String) objArr32[0]).intern());
                                    sb2.append(genericParameterTypes.length);
                                    throw new com.payair.hce.setOnGroupCollapseListener(sb2.toString());
                                }
                                valueOf.invoke(this.values.getLast(), writeReplace(AlternateContactlessPaymentDataJson, writeReplace(genericParameterTypes[0], type)));
                            }
                        }
                        this.writeReplace.writeReplace();
                    } else {
                        continue;
                    }
                }
            }
            return this.values.removeLast();
        } catch (java.lang.IllegalAccessException e) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(this.writeReplace);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(new int[]{1585586943, -771059431, -257903155, 2079930054, -1961169241, -785450058, -992136989, 850829176, -1436454998, -1360733552, -626731298, 1104745511, -1451417543, 98315933, 1592810747, -1906410751, 1304193027, -291005706, -665660393, 1416693183, -687290487, 1255483667, -1171341947, -4159227}, android.view.KeyEvent.keyCodeFromString("") + 47, objArr5);
            sb3.append(((java.lang.String) objArr5[0]).intern());
            sb3.append(obj.getClass().getName());
            throw new com.payair.hce.setOnGroupCollapseListener(sb3.toString(), e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(this.writeReplace);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            b(null, null, 127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u009b\u0090\u0097\u0098\u008f\u0085\u0095\u008a\u0094\u0085\u008f\u008f\u0085\u0086\u008a\u0085\u0087\u0097\u0081\u0092\u0091\u008a\u0097\u008f\u008a\u0093\u0092\u0091\u0088\u0094\u008f\u008a\u0085\u0083\u0091\u0098\u009a\u008a\u0092\u0097\u0091\u008f\u008d\u0085\u008e\u008c\u008b\u008a\u008a\u0089", objArr6);
            sb4.append(((java.lang.String) objArr6[0]).intern());
            throw new com.payair.hce.setOnGroupCollapseListener(sb4.toString(), e2);
        }
    }

    private static void b(int[] iArr, java.lang.String str, int i, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        int i2 = $10 + 57;
        $11 = i2 % 128;
        byte[] bArr = str3;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = SdkCoreAlternateContactlessPaymentDataImpl;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                $10 = ($11 + 35) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 46, 286 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 46337))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(getAid)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 47, android.graphics.Color.blue(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (android.view.View.getDefaultSize(0, 0) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (IccPrivateKeyCrtComponentsJson) {
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1629, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c((short) 0, (short) 0, 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (!getProfileVersion) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        $10 = ($11 + 39) % 128;
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            $10 = ($11 + 7) % 128;
            cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.text.TextUtils.indexOf("", "", 0, 0) + 1629, (char) android.graphics.Color.alpha(0));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                c((short) 0, (short) 0, 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    public final com.payair.hce.setOnGroupCollapseListener DigitizedCardProfile(java.lang.Object obj, java.lang.Class cls) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        b(null, null, 127 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0086\u009c\u008a\u0097\u008f\u0092\u0091\u008a\u0086\u009c\u008a\u008f\u0094\u0085\u0081\u0092\u0097\u008e\u008a\u008f\u0097\u0092\u008a\u0092\u0082\u009d\u008a\u008a\u0089\u0086\u009c", objArr);
        com.payair.hce.setOnGroupCollapseListener setongroupcollapselistener = new com.payair.hce.setOnGroupCollapseListener(java.lang.String.format(((java.lang.String) objArr[0]).intern(), this.writeReplace, obj.getClass().getName(), cls.getName()));
        int i = getPaymentFci + 17;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            return setongroupcollapselistener;
        }
        throw null;
    }

    private java.lang.Class values(java.lang.reflect.Type type) {
        if (type != null) {
            if (type instanceof java.lang.Class) {
                return (java.lang.Class) type;
            }
            if (type instanceof java.lang.reflect.ParameterizedType) {
                getCvrMaskAnd = (getPaymentFci + 99) % 128;
                return (java.lang.Class) ((java.lang.reflect.ParameterizedType) type).getRawType();
            }
            if (type instanceof java.lang.reflect.GenericArrayType) {
                return java.lang.reflect.Array.class;
            }
            if (type instanceof java.lang.reflect.WildcardType) {
                return null;
            }
            if (type instanceof java.lang.reflect.TypeVariable) {
                int i = getCvrMaskAnd + 55;
                getPaymentFci = i % 128;
                if (i % 2 != 0) {
                    return null;
                }
                throw null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.writeReplace);
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{2007598639, 2086965624, 465266671, -1031895197, 1431446199, 1349211862, 560254632, -1694234527}, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(type);
            throw new com.payair.hce.setOnGroupCollapseListener(sb.toString());
        }
        int i2 = getPaymentFci + 23;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private java.lang.reflect.Type writeReplace(java.lang.reflect.Type type, java.lang.reflect.Type type2) {
        int i = getPaymentFci + 117;
        int i2 = i % 128;
        getCvrMaskAnd = i2;
        if (i % 2 == 0) {
            if (!(type instanceof java.lang.Class)) {
                if (type instanceof java.lang.reflect.ParameterizedType) {
                    int i3 = i2 + 97;
                    getPaymentFci = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                } else {
                    if (type instanceof java.lang.reflect.TypeVariable) {
                        return type2;
                    }
                    if (!(type instanceof java.lang.reflect.WildcardType)) {
                        if (type instanceof java.lang.reflect.GenericArrayType) {
                            return ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(this.writeReplace);
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        a(new int[]{2007598639, 2086965624, 465266671, -1031895197, 14798072, -1507419164, -1972601041, -1292041035, 316595971, 1511528349, 560254632, -1694234527}, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 24, objArr);
                        sb.append(((java.lang.String) objArr[0]).intern());
                        sb.append(type);
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        a(new int[]{-1215892539, -496915595}, -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr2);
                        sb.append(((java.lang.String) objArr2[0]).intern());
                        throw new com.payair.hce.setOnGroupCollapseListener(sb.toString());
                    }
                    int i4 = i2 + 89;
                    getPaymentFci = i4 % 128;
                    if (i4 % 2 != 0) {
                        return type2;
                    }
                    throw null;
                }
            }
            return type;
        }
        throw null;
    }

    private java.lang.Class valueOf(java.lang.Object obj, java.lang.Class cls) throws com.payair.hce.setOnGroupCollapseListener {
        java.lang.Class cls2 = null;
        if (!this.DigitizedCardProfile.containsKey(this.writeReplace)) {
            int i = getCvrMaskAnd;
            int i2 = i + 77;
            getPaymentFci = i2 % 128;
            if (i2 % 2 != 0) {
                if (obj instanceof java.util.Map) {
                    cls2 = DigitizedCardProfile((java.util.Map) obj);
                } else {
                    getPaymentFci = (i + 75) % 128;
                }
                java.lang.Class AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(cls2, cls);
                return AlternateContactlessPaymentDataJson == null ? obj.getClass() : AlternateContactlessPaymentDataJson;
            }
            throw null;
        }
        getPaymentFci = (getCvrMaskAnd + 61) % 128;
        return null;
    }

    private static java.lang.Class AlternateContactlessPaymentDataJson(java.lang.Class cls, java.lang.Class cls2) {
        int i = getPaymentFci;
        int i2 = i + 97;
        int i3 = i2 % 128;
        getCvrMaskAnd = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (cls != null && cls2 != null) {
            if (!cls2.isAssignableFrom(cls)) {
                return cls2;
            }
            int i4 = getPaymentFci + 111;
            getCvrMaskAnd = i4 % 128;
            if (i4 % 2 == 0) {
                return cls;
            }
            throw null;
        }
        if (cls2 != null) {
            int i5 = i + 73;
            getCvrMaskAnd = i5 % 128;
            if (i5 % 2 == 0) {
                return cls2;
            }
            throw new java.lang.ArithmeticException();
        }
        if (cls == null) {
            return null;
        }
        int i6 = i3 + 3;
        getPaymentFci = i6 % 128;
        if (i6 % 2 != 0) {
            return cls;
        }
        throw new java.lang.ArithmeticException();
    }

    private java.lang.Class DigitizedCardProfile(java.util.Map map) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        b(null, null, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 126, "\u0086\u0086\u0082\u0083\u008e", objArr);
        java.lang.String str = (java.lang.String) map.get(((java.lang.String) objArr[0]).intern());
        if (str == null) {
            getPaymentFci = (getCvrMaskAnd + 43) % 128;
            return null;
        }
        getPaymentFci = (getCvrMaskAnd + 61) % 128;
        try {
            java.lang.ClassLoader contextClassLoader = java.lang.Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                return contextClassLoader.loadClass(str);
            }
            return java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException e) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b(null, null, 127 - android.text.TextUtils.indexOf("", "", 0), "\u0086\u009c\u008a\u0090\u0082\u0097\u0083\u008a\u008f\u0097\u0092\u008a\u0090\u0083\u0084\u0097\u009d\u008a\u008a\u0089\u0086\u009c", objArr2);
            throw new com.payair.hce.setOnGroupCollapseListener(java.lang.String.format(((java.lang.String) objArr2[0]).intern(), this.writeReplace, str), e);
        }
    }

    private com.payair.hce.setSelectedGroup valueOf(java.lang.Class cls) {
        com.payair.hce.setSelectedGroup setselectedgroup = this.DigitizedCardProfile.get(this.writeReplace);
        if (setselectedgroup != null) {
            return setselectedgroup;
        }
        if (cls == null || !cls.isArray()) {
            return DigitizedCardProfile(cls);
        }
        int i = getPaymentFci + 75;
        getCvrMaskAnd = i % 128;
        if (i % 2 != 0) {
            this.valueOf.get(java.lang.reflect.Array.class);
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.setSelectedGroup setselectedgroup2 = this.valueOf.get(java.lang.reflect.Array.class);
        int i2 = getCvrMaskAnd + 109;
        getPaymentFci = i2 % 128;
        if (i2 % 2 != 0) {
            return setselectedgroup2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.payair.hce.setSelectedGroup DigitizedCardProfile(java.lang.Class cls) {
        while (true) {
            com.payair.hce.setSelectedGroup setselectedgroup = this.valueOf.get(cls);
            if (setselectedgroup != null || cls == null) {
                break;
            }
            for (java.lang.Class<?> cls2 : cls.getInterfaces()) {
                com.payair.hce.setSelectedGroup DigitizedCardProfile = DigitizedCardProfile(cls2);
                if (DigitizedCardProfile != null) {
                    return DigitizedCardProfile;
                }
            }
            if (cls.getSuperclass() == null) {
                return null;
            }
            int i = getCvrMaskAnd + 13;
            getPaymentFci = i % 128;
            if (i % 2 != 0) {
                cls = cls.getSuperclass();
                getCvrMaskAnd = (getPaymentFci + 15) % 128;
            } else {
                throw null;
            }
        }
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.util.Map map = (java.util.Map) objArr[0];
        com.payair.hce.setTopEdgeEffectColor settopedgeeffectcolor = (com.payair.hce.setTopEdgeEffectColor) objArr[1];
        int i = getCvrMaskAnd + 35;
        getPaymentFci = i % 128;
        if (i % 2 == 0) {
            map.containsKey(settopedgeeffectcolor.writeReplace());
            throw null;
        }
        if (map.containsKey(settopedgeeffectcolor.writeReplace()) || map.containsKey(AlternateContactlessPaymentDataJson(settopedgeeffectcolor.writeReplace()))) {
            int i2 = getPaymentFci + 95;
            getCvrMaskAnd = i2 % 128;
            if (i2 % 2 == 0) {
                return java.lang.Boolean.TRUE;
            }
            throw null;
        }
        int i3 = getCvrMaskAnd + 91;
        getPaymentFci = i3 % 128;
        if (i3 % 2 != 0) {
            return java.lang.Boolean.FALSE;
        }
        throw new java.lang.ArithmeticException();
    }

    private static java.lang.Object AlternateContactlessPaymentDataJson(java.util.Map map, com.payair.hce.setTopEdgeEffectColor settopedgeeffectcolor) {
        int i = getPaymentFci + 85;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            java.lang.Object obj = map.get(settopedgeeffectcolor.writeReplace());
            if (obj != null) {
                return obj;
            }
            java.lang.Object obj2 = map.get(AlternateContactlessPaymentDataJson(settopedgeeffectcolor.writeReplace()));
            getPaymentFci = (getCvrMaskAnd + 91) % 128;
            return obj2;
        }
        map.get(settopedgeeffectcolor.writeReplace());
        throw null;
    }

    private static java.lang.String AlternateContactlessPaymentDataJson(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.Character.toUpperCase(str.charAt(0)));
        sb.append(str.substring(1));
        java.lang.String obj = sb.toString();
        getCvrMaskAnd = (getPaymentFci + 105) % 128;
        return obj;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setOnGroupExpandListener setongroupexpandlistener = (com.payair.hce.setOnGroupExpandListener) objArr[0];
        java.lang.Object obj = objArr[1];
        java.lang.Class<?> cls = (java.lang.Class) objArr[2];
        if (obj.getClass() == cls) {
            return obj;
        }
        if (obj instanceof java.lang.Number) {
            if (cls.equals(java.lang.Double.class)) {
                return java.lang.Double.valueOf(((java.lang.Number) obj).doubleValue());
            }
            if (cls.equals(java.lang.Integer.class)) {
                int i = getCvrMaskAnd + 81;
                getPaymentFci = i % 128;
                if (i % 2 != 0) {
                    return java.lang.Integer.valueOf(((java.lang.Number) obj).intValue());
                }
                throw null;
            }
            if (cls.equals(java.lang.Long.class)) {
                int i2 = getCvrMaskAnd + 65;
                getPaymentFci = i2 % 128;
                if (i2 % 2 != 0) {
                    return java.lang.Long.valueOf(((java.lang.Number) obj).longValue());
                }
                throw null;
            }
            if (cls.equals(java.lang.Short.class)) {
                short shortValue = ((java.lang.Number) obj).shortValue();
                int i3 = getCvrMaskAnd + 117;
                getPaymentFci = i3 % 128;
                if (i3 % 2 != 0) {
                    return java.lang.Short.valueOf(shortValue);
                }
                throw null;
            }
            if (cls.equals(java.lang.Byte.class)) {
                getCvrMaskAnd = (getPaymentFci + 119) % 128;
                return java.lang.Byte.valueOf(((java.lang.Number) obj).byteValue());
            }
            if (cls.equals(java.lang.Float.class)) {
                return java.lang.Float.valueOf(((java.lang.Number) obj).floatValue());
            }
            if (cls == java.util.Date.class) {
                return new java.util.Date(((java.lang.Number) obj).longValue());
            }
        } else if (obj instanceof java.lang.Boolean) {
            getCvrMaskAnd = (getPaymentFci + 91) % 128;
            if (cls.equals(java.lang.Boolean.class)) {
                int i4 = getPaymentFci + 93;
                getCvrMaskAnd = i4 % 128;
                if (i4 % 2 == 0) {
                    return obj;
                }
                throw new java.lang.ArithmeticException();
            }
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{-197329338, 821511334, 1817999641, -1614623845, -1728548457, 1770269528, 1395175198, -102359846, 431105098, 1631397534, 223695050, -200215633, 1872295960, -159860591, -23161839, -371941631, 238228535, 406757066, -136034026, 1216706411, 228830098, 740517273, 1416255304, 782671305, -1568138485, -307341123, -70650010, -119693394, 1038458163, -1679689612, 1685635781, -1255230382, -2077645075, -577339001, -285306293, 2114888404, 758629499, 26573104, -1477492423, 799991531, 1742046959, -606726772, 1294676517, 1751674328, 1320405957, -545800023, 996826385, 1899952796, -1988018341, 1992961594, -2146498616, -882646503, -1297941247, 623304302, 745629860, 778670875}, android.graphics.Color.green(0) + 110, objArr2);
        throw new com.payair.hce.setOnGroupCollapseListener(java.lang.String.format(((java.lang.String) objArr2[0]).intern(), setongroupexpandlistener.AlternateContactlessPaymentDataJson().toString(), obj, cls.getName()));
    }

    public final java.lang.Class AlternateContactlessPaymentDataJson(com.payair.hce.setChildIndicator setchildindicator) throws java.lang.ClassNotFoundException {
        getCvrMaskAnd = (getPaymentFci + 23) % 128;
        com.payair.hce.setSelectedGroup setselectedgroup = this.DigitizedCardProfile.get(setchildindicator);
        if (!(setselectedgroup instanceof com.payair.hce.setTypeface)) {
            return null;
        }
        getPaymentFci = (getCvrMaskAnd + 97) % 128;
        java.lang.Class AlternateContactlessPaymentDataJson = ((com.payair.hce.setTypeface) setselectedgroup).valueOf().AlternateContactlessPaymentDataJson();
        getPaymentFci = (getCvrMaskAnd + 79) % 128;
        return AlternateContactlessPaymentDataJson;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getCvrMaskAnd = 0;
        getPaymentFci = 1;
        RecordsJson = new int[]{720827623, 1565916758, -1936126869, 170417102, 2029657668, 911695955, -1453265538, 767617755, 1004835195, -357725804, -137532486, 486604725, -1469539308, 646962875, -1356722975, -1038758483, 1733008188, 911146263};
        SdkCoreAlternateContactlessPaymentDataImpl = new char[]{10952, 10981, 11006, 10953, 11001, 10999, 11007, 10957, 10764, 10786, 10777, 10954, 10994, 10983, 10998, 10982, 11005, 10992, 11003, 10996, 10993, 11000, 10995, 11002, 10980, 10955, 10800, 10809, 10759};
        getAid = -143185342;
        getProfileVersion = true;
        IccPrivateKeyCrtComponentsJson = true;
    }

    public final java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object obj, java.lang.Class cls) {
        return valueOf(new java.lang.Object[]{this, obj, cls}, -762439471, 762439474, java.lang.System.identityHashCode(this));
    }

    private static boolean valueOf(java.util.Map map, com.payair.hce.setTopEdgeEffectColor settopedgeeffectcolor) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{map, settopedgeeffectcolor}, 623702744, -623702744, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    public final <T extends java.util.Collection<java.lang.Object>> T values(java.util.Collection collection, T t, java.lang.reflect.Type type) {
        return (T) valueOf(new java.lang.Object[]{this, collection, t, type}, -1714344637, 1714344638, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{5, 98, 33, 67};
        $$b = 174;
    }

    public final com.payair.hce.setOnGroupExpandListener valueOf(java.lang.Class cls, com.payair.hce.setSelectedGroup setselectedgroup) {
        return (com.payair.hce.setOnGroupExpandListener) valueOf(new java.lang.Object[]{this, cls, setselectedgroup}, -107135895, 107135897, java.lang.System.identityHashCode(this));
    }
}
