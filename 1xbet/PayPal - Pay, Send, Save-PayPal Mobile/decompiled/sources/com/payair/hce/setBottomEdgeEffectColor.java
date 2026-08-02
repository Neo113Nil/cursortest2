package com.payair.hce;

/* loaded from: classes4.dex */
public final class setBottomEdgeEffectColor {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static java.lang.ThreadLocal<java.util.Map<java.lang.Class, com.payair.hce.setBottomEdgeEffectColor>> AlternateContactlessPaymentDataJson;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int getProfileVersion;
    private static int[] writeReplace;
    private java.lang.Class DigitizedCardProfile;
    private com.payair.hce.setBottomEdgeEffectColor valueOf;
    private java.util.Map<java.lang.String, com.payair.hce.setTopEdgeEffectColor> values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = b + 4;
        int i5 = (i * 4) + 66;
        int i6 = (b2 * 3) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            int i8 = i4;
            int i9 = (-i4) + i7;
            i2 = i3;
            int i10 = i8;
            i5 = i9;
            i4 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i4 + 1;
            int i12 = i5;
            i8 = i11;
            i4 = bArr[i11];
            i7 = i12;
            int i92 = (-i4) + i7;
            i2 = i3;
            int i102 = i8;
            i5 = i92;
            i4 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        writeReplace();
        AlternateContactlessPaymentDataJson = new java.lang.ThreadLocal<>();
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 79) % 128;
    }

    public static com.payair.hce.setBottomEdgeEffectColor values(java.lang.Class cls) {
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 83) % 128;
        if (AlternateContactlessPaymentDataJson.get() == null) {
            AlternateContactlessPaymentDataJson.set(new java.util.HashMap());
        }
        if (cls != null) {
            if (!AlternateContactlessPaymentDataJson.get().containsKey(cls)) {
                AlternateContactlessPaymentDataJson.get().put(cls, new com.payair.hce.setBottomEdgeEffectColor(cls));
            }
            return AlternateContactlessPaymentDataJson.get().get(cls);
        }
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 99) % 128;
        return null;
    }

    private setBottomEdgeEffectColor(java.lang.Class cls) {
        this.DigitizedCardProfile = cls;
        this.valueOf = values(cls.getSuperclass());
        AlternateContactlessPaymentDataJson();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fc, code lost:
    
        if (r16.values.containsKey(r5) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0121, code lost:
    
        r5 = r16.values.get(r5);
        com.payair.hce.setTopEdgeEffectColor.DigitizedCardProfile(new java.lang.Object[]{r5, r7}, -1461575805, 1461575806, java.lang.System.identityHashCode(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010f, code lost:
    
        r16.values.put(r5, new com.payair.hce.setTopEdgeEffectColor(r5, r16));
        com.payair.hce.setBottomEdgeEffectColor.getProfileVersion = (com.payair.hce.setBottomEdgeEffectColor.IccPrivateKeyCrtComponentsJson + 75) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010d, code lost:
    
        if (r16.values.containsKey(r5) == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AlternateContactlessPaymentDataJson() {
        java.lang.String DigitizedCardProfile;
        this.values = new java.util.TreeMap();
        java.lang.reflect.Field[] declaredFields = this.DigitizedCardProfile.getDeclaredFields();
        int length = declaredFields.length;
        for (int i = 0; i < length; i++) {
            int i2 = IccPrivateKeyCrtComponentsJson + 37;
            getProfileVersion = i2 % 128;
            if (i2 % 2 != 0) {
                java.lang.reflect.Modifier.isStatic(declaredFields[i].getModifiers());
                throw null;
            }
            java.lang.reflect.Field field = declaredFields[i];
            if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                int i3 = getProfileVersion + 81;
                IccPrivateKeyCrtComponentsJson = i3 % 128;
                if (i3 % 2 == 0) {
                    this.values.containsKey(field.getName());
                    throw null;
                }
                if (!this.values.containsKey(field.getName())) {
                    this.values.put(field.getName(), new com.payair.hce.setTopEdgeEffectColor(field, this));
                }
            }
        }
        java.lang.reflect.Method[] declaredMethods = this.DigitizedCardProfile.getDeclaredMethods();
        int length2 = declaredMethods.length;
        for (int i4 = 0; i4 < length2; i4++) {
            java.lang.reflect.Method method = declaredMethods[i4];
            if (!java.lang.reflect.Modifier.isStatic(method.getModifiers())) {
                int length3 = method.getParameterTypes().length;
                java.lang.String name2 = method.getName();
                if (name2.length() <= 3) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a(new int[]{-1169125291, 150250710}, 2 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
                    if (!name2.startsWith(((java.lang.String) objArr[0]).intern())) {
                    }
                }
                if (length3 == 0) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(new int[]{1960557272, 378011077}, 3 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr2);
                    if (name2.startsWith(((java.lang.String) objArr2[0]).intern())) {
                        int i5 = IccPrivateKeyCrtComponentsJson + 125;
                        getProfileVersion = i5 % 128;
                        if (i5 % 2 != 0) {
                            DigitizedCardProfile = DigitizedCardProfile(name2.substring(2));
                        } else {
                            DigitizedCardProfile = DigitizedCardProfile(name2.substring(3));
                        }
                    } else {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a(new int[]{-1169125291, 150250710}, android.widget.ExpandableListView.getPackedPositionType(0L) + 2, objArr3);
                        if (name2.startsWith(((java.lang.String) objArr3[0]).intern())) {
                            getProfileVersion = (IccPrivateKeyCrtComponentsJson + 93) % 128;
                            java.lang.String DigitizedCardProfile2 = DigitizedCardProfile(name2.substring(2));
                            if (!this.values.containsKey(DigitizedCardProfile2)) {
                                this.values.put(DigitizedCardProfile2, new com.payair.hce.setTopEdgeEffectColor(DigitizedCardProfile2, this));
                            }
                            com.payair.hce.setTopEdgeEffectColor settopedgeeffectcolor = this.values.get(DigitizedCardProfile2);
                            com.payair.hce.setTopEdgeEffectColor.DigitizedCardProfile(new java.lang.Object[]{settopedgeeffectcolor, method}, -1461575805, 1461575806, java.lang.System.identityHashCode(settopedgeeffectcolor));
                        }
                    }
                } else if (length3 == 1) {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(new int[]{-1943409450, 1511953397}, 3 - android.view.View.MeasureSpec.getMode(0), objArr4);
                    if (name2.startsWith(((java.lang.String) objArr4[0]).intern())) {
                        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 7) % 128;
                        java.lang.String DigitizedCardProfile3 = DigitizedCardProfile(name2.substring(3));
                        if (!this.values.containsKey(DigitizedCardProfile3)) {
                            this.values.put(DigitizedCardProfile3, new com.payair.hce.setTopEdgeEffectColor(DigitizedCardProfile3, this));
                        }
                        this.values.get(DigitizedCardProfile3).values(method);
                    }
                }
            }
        }
        java.util.Iterator<com.payair.hce.setTopEdgeEffectColor> it = this.values.values().iterator();
        while (it.hasNext()) {
            int i6 = IccPrivateKeyCrtComponentsJson + 89;
            getProfileVersion = i6 % 128;
            if (i6 % 2 != 0) {
                it.next().RecordsJson();
                throw null;
            }
            if (it.next().RecordsJson()) {
                it.remove();
            }
        }
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setBottomEdgeEffectColor setbottomedgeeffectcolor = (com.payair.hce.setBottomEdgeEffectColor) objArr[0];
        int i = IccPrivateKeyCrtComponentsJson + 45;
        int i2 = i % 128;
        getProfileVersion = i2;
        com.payair.hce.setBottomEdgeEffectColor setbottomedgeeffectcolor2 = setbottomedgeeffectcolor.valueOf;
        getProfileVersion = i2;
        if (i % 2 == 0) {
            return setbottomedgeeffectcolor2;
        }
        throw new java.lang.ArithmeticException();
    }

    private static java.lang.String DigitizedCardProfile(java.lang.String str) {
        if (str.length() < 2) {
            return str.toLowerCase();
        }
        if (java.lang.Character.isUpperCase(str.charAt(0))) {
            getProfileVersion = (IccPrivateKeyCrtComponentsJson + 79) % 128;
            if (java.lang.Character.isUpperCase(str.charAt(1))) {
                IccPrivateKeyCrtComponentsJson = (getProfileVersion + 53) % 128;
                return str;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.Character.toLowerCase(str.charAt(0)));
        sb.append(str.substring(1));
        return sb.toString();
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int i2;
        int[] iArr2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = writeReplace;
        float f = 0.0f;
        int i3 = 1;
        int i4 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[i4] = java.lang.Integer.valueOf(iArr3[i5]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(i4, f, f) > f ? 1 : (android.util.TypedValue.complexToFraction(i4, f, f) == f ? 0 : -1)) + 27, 29 - android.graphics.Color.green(i4), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '0'))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr4[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i5++;
                    f = 0.0f;
                    i4 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = writeReplace;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            $10 = ($11 + 77) % 128;
            int i6 = 0;
            while (i6 < length3) {
                int i7 = $10 + 115;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    java.lang.Object[] objArr3 = new java.lang.Object[i3];
                    objArr3[0] = java.lang.Integer.valueOf(iArr6[i6]);
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj2 == null) {
                        i2 = length3;
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 27, 29 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                    } else {
                        i2 = length3;
                    }
                    iArr7[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                    iArr2 = iArr6;
                    i6 = 0;
                } else {
                    i2 = length3;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(iArr6[i6])};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj3 == null) {
                        iArr2 = iArr6;
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 28, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj3);
                    } else {
                        iArr2 = iArr6;
                    }
                    iArr7[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    i6++;
                }
                iArr6 = iArr2;
                length3 = i2;
                i3 = 1;
            }
            $10 = ($11 + 111) % 128;
            iArr6 = iArr7;
        }
        char c = 0;
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length2);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[c] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            int i8 = 0;
            for (int i9 = 16; i8 < i9; i9 = 16) {
                $11 = ($10 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                istransitsupported.DigitizedCardProfile ^= iArr5[i8];
                java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 32, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 5089, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i8++;
            }
            int i10 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i10;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i11 = istransitsupported.DigitizedCardProfile;
            int i12 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr6 = {istransitsupported, istransitsupported};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj5 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2923 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (3036 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((byte) -1, 0, (byte) 0, objArr7);
                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
            c = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.payair.hce.setTopEdgeEffectColor valueOf(java.lang.String str) {
        com.payair.hce.setBottomEdgeEffectColor setbottomedgeeffectcolor = this;
        while (true) {
            if (setbottomedgeeffectcolor != null) {
                int i = IccPrivateKeyCrtComponentsJson + 35;
                getProfileVersion = i % 128;
                if (i % 2 == 0) {
                    com.payair.hce.setTopEdgeEffectColor settopedgeeffectcolor = setbottomedgeeffectcolor.values.get(str);
                    if (settopedgeeffectcolor != null) {
                        int i2 = IccPrivateKeyCrtComponentsJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                        getProfileVersion = i2 % 128;
                        if (i2 % 2 == 0) {
                            return settopedgeeffectcolor;
                        }
                    } else {
                        setbottomedgeeffectcolor = setbottomedgeeffectcolor.valueOf;
                    }
                } else {
                    setbottomedgeeffectcolor.values.get(str);
                    throw null;
                }
            } else {
                int i3 = getProfileVersion + 29;
                IccPrivateKeyCrtComponentsJson = i3 % 128;
                if (i3 % 2 != 0) {
                    return null;
                }
            }
        }
    }

    public final java.util.Collection<com.payair.hce.setTopEdgeEffectColor> DigitizedCardProfile() {
        java.util.TreeMap treeMap = new java.util.TreeMap(this.values);
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 39) % 128;
        for (com.payair.hce.setBottomEdgeEffectColor setbottomedgeeffectcolor = this.valueOf; setbottomedgeeffectcolor != null; setbottomedgeeffectcolor = setbottomedgeeffectcolor.valueOf) {
            DigitizedCardProfile(treeMap, setbottomedgeeffectcolor.values);
        }
        java.util.Collection<com.payair.hce.setTopEdgeEffectColor> values = treeMap.values();
        int i = getProfileVersion + 51;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return values;
        }
        throw null;
    }

    private static void DigitizedCardProfile(java.util.Map<java.lang.String, com.payair.hce.setTopEdgeEffectColor> map, java.util.Map<java.lang.String, com.payair.hce.setTopEdgeEffectColor> map2) {
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 61) % 128;
        int i = getProfileVersion + 53;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            int i2 = 4 / 3;
        }
        for (java.lang.String str : map2.keySet()) {
            if (!map.containsKey(str)) {
                getProfileVersion = (IccPrivateKeyCrtComponentsJson + 85) % 128;
                map.put(str, map2.get(str));
            }
        }
    }

    public final boolean writeReplace(java.lang.String str) {
        if (!this.values.containsKey(str)) {
            int i = getProfileVersion + 35;
            IccPrivateKeyCrtComponentsJson = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            com.payair.hce.setBottomEdgeEffectColor setbottomedgeeffectcolor = this.valueOf;
            if (setbottomedgeeffectcolor == null || !setbottomedgeeffectcolor.writeReplace(str)) {
                return false;
            }
        }
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 17) % 128;
        return true;
    }

    protected final java.lang.reflect.Field AlternateContactlessPaymentDataJson(java.lang.String str) {
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 15) % 128;
        try {
            java.lang.reflect.Field declaredField = this.DigitizedCardProfile.getDeclaredField(str);
            int i = getProfileVersion + 31;
            IccPrivateKeyCrtComponentsJson = i % 128;
            if (i % 2 != 0) {
                return declaredField;
            }
            throw null;
        } catch (java.lang.NoSuchFieldException unused) {
            return null;
        }
    }

    static void writeReplace() {
        writeReplace = new int[]{-1548253888, 195140017, -1383251431, -1877622377, -1927324502, -1653449088, -903626145, -1478948651, 1907976344, -1366784169, 627762613, -1343092467, -1737613910, 1015942079, -1088303160, -1488596398, 1464689407, 600729015};
    }

    static void init$0() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -79, -89, 69};
        $$b = 49;
    }

    public final com.payair.hce.setBottomEdgeEffectColor valueOf() {
        return (com.payair.hce.setBottomEdgeEffectColor) valueOf(new java.lang.Object[]{this}, 1463209759, -1463209759, java.lang.System.identityHashCode(this));
    }
}
