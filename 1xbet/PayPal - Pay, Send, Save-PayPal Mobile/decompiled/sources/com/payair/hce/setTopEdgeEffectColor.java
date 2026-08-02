package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTopEdgeEffectColor {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static long getCvrMaskAnd;
    private static int getPaymentFci;
    private final java.lang.String AlternateContactlessPaymentDataJson;
    private java.lang.String DigitizedCardProfile;
    private java.lang.reflect.Method IccPrivateKeyCrtComponentsJson;
    private java.lang.reflect.Method RecordsJson;
    private com.payair.hce.setBottomEdgeEffectColor valueOf;
    private java.lang.Class values;
    private java.lang.reflect.Field writeReplace;
    private java.util.Map<java.lang.Class<?>, java.lang.reflect.Method> getAid = new java.util.HashMap();
    private com.payair.hce.setOnItemLongClickListener<? extends com.payair.hce.setTextMetricsParams> getProfileVersion = null;
    private com.payair.hce.setOnItemLongClickListener<? extends com.payair.hce.setSelectedGroup> SdkCoreAlternateContactlessPaymentDataImpl = null;
    private java.lang.Boolean getGpoResponse = null;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = (i * 592) + (i2 * (-590)) + ((~(i4 | i2)) * (-1182)) + (((~(i | i2)) | (~(i4 | i5 | (~i3)))) * (-591)) + ((i3 | i4 | i5) * 591);
        if (i6 != 1) {
            if (i6 != 2) {
                return valueOf(objArr);
            }
            com.payair.hce.setTopEdgeEffectColor settopedgeeffectcolor = (com.payair.hce.setTopEdgeEffectColor) objArr[0];
            int i7 = (SdkCoreBusinessLogicModuleImpl + 11) % 128;
            getPaymentFci = i7;
            java.lang.String str = settopedgeeffectcolor.AlternateContactlessPaymentDataJson;
            SdkCoreBusinessLogicModuleImpl = (i7 + 111) % 128;
            return str;
        }
        com.payair.hce.setTopEdgeEffectColor settopedgeeffectcolor2 = (com.payair.hce.setTopEdgeEffectColor) objArr[0];
        java.lang.reflect.Method method = (java.lang.reflect.Method) objArr[1];
        if (settopedgeeffectcolor2.values == null) {
            settopedgeeffectcolor2.values = method.getReturnType();
            settopedgeeffectcolor2.RecordsJson = method;
            method.setAccessible(true);
        } else if (method.getReturnType().isAssignableFrom(settopedgeeffectcolor2.values)) {
            getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 5) % 128;
            settopedgeeffectcolor2.RecordsJson = method;
            method.setAccessible(true);
        }
        java.lang.reflect.Method method2 = settopedgeeffectcolor2.RecordsJson;
        if (method2 == null) {
            return null;
        }
        SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 15) % 128;
        if (!method2.isAnnotationPresent(com.payair.hce.setSelectionFromTop.class)) {
            return null;
        }
        getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 113) % 128;
        settopedgeeffectcolor2.AlternateContactlessPaymentDataJson((com.payair.hce.setSelectionFromTop) settopedgeeffectcolor2.RecordsJson.getAnnotation(com.payair.hce.setSelectionFromTop.class));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = b * 4;
        int i5 = 3 - (i * 3);
        int i6 = (i2 * 2) + 117;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i7 = i4;
            int i8 = i5;
            int i9 = 0;
            int i10 = i5 + i7;
            i3 = i9;
            int i11 = i8;
            i6 = i10;
            i5 = i11;
            int i12 = i5 + 1;
            bArr2[i3] = (byte) i6;
            i9 = i3 + 1;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i13 = i6;
            i8 = i12;
            i5 = bArr[i12];
            i7 = i13;
            int i102 = i5 + i7;
            i3 = i9;
            int i112 = i8;
            i6 = i102;
            i5 = i112;
            int i122 = i5 + 1;
            bArr2[i3] = (byte) i6;
            i9 = i3 + 1;
            if (i3 == i4) {
            }
        } else {
            i3 = 0;
            int i1222 = i5 + 1;
            bArr2[i3] = (byte) i6;
            i9 = i3 + 1;
            if (i3 == i4) {
            }
        }
    }

    public setTopEdgeEffectColor(java.lang.String str, com.payair.hce.setBottomEdgeEffectColor setbottomedgeeffectcolor) {
        this.DigitizedCardProfile = str;
        this.AlternateContactlessPaymentDataJson = str;
        this.valueOf = setbottomedgeeffectcolor;
        java.lang.reflect.Field AlternateContactlessPaymentDataJson = setbottomedgeeffectcolor.AlternateContactlessPaymentDataJson(str);
        this.writeReplace = AlternateContactlessPaymentDataJson;
        if (AlternateContactlessPaymentDataJson == null || !AlternateContactlessPaymentDataJson.isAnnotationPresent(com.payair.hce.setSelectionFromTop.class)) {
            return;
        }
        AlternateContactlessPaymentDataJson((com.payair.hce.setSelectionFromTop) this.writeReplace.getAnnotation(com.payair.hce.setSelectionFromTop.class));
    }

    public setTopEdgeEffectColor(java.lang.reflect.Field field, com.payair.hce.setBottomEdgeEffectColor setbottomedgeeffectcolor) {
        java.lang.String name2 = field.getName();
        this.DigitizedCardProfile = name2;
        this.AlternateContactlessPaymentDataJson = name2;
        this.valueOf = setbottomedgeeffectcolor;
        this.writeReplace = field;
        this.values = field.getType();
        if (field.isAnnotationPresent(com.payair.hce.setSelectionFromTop.class)) {
            AlternateContactlessPaymentDataJson((com.payair.hce.setSelectionFromTop) field.getAnnotation(com.payair.hce.setSelectionFromTop.class));
        }
    }

    private void AlternateContactlessPaymentDataJson(com.payair.hce.setSelectionFromTop setselectionfromtop) {
        com.payair.hce.setOnItemLongClickListener<? extends com.payair.hce.setTextMetricsParams> setonitemlongclicklistener;
        this.DigitizedCardProfile = setselectionfromtop.valueOf().length() > 0 ? setselectionfromtop.valueOf() : this.AlternateContactlessPaymentDataJson;
        com.payair.hce.setOnItemLongClickListener<? extends com.payair.hce.setSelectedGroup> setonitemlongclicklistener2 = null;
        if (setselectionfromtop.DigitizedCardProfile() != com.payair.hce.setTextMetricsParams.class) {
            setonitemlongclicklistener = new com.payair.hce.setOnItemLongClickListener<>(setselectionfromtop.DigitizedCardProfile());
        } else {
            SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 17) % 128;
            setonitemlongclicklistener = null;
        }
        this.getProfileVersion = setonitemlongclicklistener;
        if (setselectionfromtop.writeReplace() != com.payair.hce.setSelectedGroup.class) {
            setonitemlongclicklistener2 = new com.payair.hce.setOnItemLongClickListener<>(setselectionfromtop.writeReplace());
            SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 65) % 128;
        }
        this.SdkCoreAlternateContactlessPaymentDataImpl = setonitemlongclicklistener2;
        this.getGpoResponse = java.lang.Boolean.valueOf(setselectionfromtop.AlternateContactlessPaymentDataJson());
    }

    public final java.lang.String writeReplace() {
        int i = getPaymentFci + 5;
        int i2 = i % 128;
        SdkCoreBusinessLogicModuleImpl = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.DigitizedCardProfile;
        int i3 = i2 + 53;
        getPaymentFci = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setTopEdgeEffectColor settopedgeeffectcolor = (com.payair.hce.setTopEdgeEffectColor) objArr[0];
        int i = SdkCoreBusinessLogicModuleImpl + 73;
        int i2 = i % 128;
        getPaymentFci = i2;
        java.lang.reflect.Field field = settopedgeeffectcolor.writeReplace;
        if (i % 2 != 0) {
            throw null;
        }
        SdkCoreBusinessLogicModuleImpl = (i2 + 105) % 128;
        return field;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr = str;
        if (str != null) {
            $11 = ($10 + 17) % 128;
            cArr = str.toCharArray();
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(getCvrMaskAnd ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            $10 = ($11 + 11) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(getCvrMaskAnd)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.indexOf("", "", 0, 0), android.text.TextUtils.indexOf("", "", 0, 0) + 1921, (char) ((-1) - android.view.MotionEvent.axisFromString("")));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 27, 428 - android.view.MotionEvent.axisFromString(""), (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 31610));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((byte) 0, 0, 1, objArr5);
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

    public final java.lang.Class values() {
        int i = SdkCoreBusinessLogicModuleImpl;
        getPaymentFci = (i + 95) % 128;
        java.lang.Class cls = this.values;
        getPaymentFci = (i + 11) % 128;
        return cls;
    }

    private java.lang.reflect.Method SdkCoreBusinessLogicModuleImpl() {
        com.payair.hce.setTopEdgeEffectColor settopedgeeffectcolor = this;
        while (settopedgeeffectcolor.RecordsJson == null) {
            com.payair.hce.setBottomEdgeEffectColor setbottomedgeeffectcolor = settopedgeeffectcolor.valueOf;
            if (((com.payair.hce.setBottomEdgeEffectColor) com.payair.hce.setBottomEdgeEffectColor.valueOf(new java.lang.Object[]{setbottomedgeeffectcolor}, 1463209759, -1463209759, java.lang.System.identityHashCode(setbottomedgeeffectcolor))) == null) {
                break;
            }
            com.payair.hce.setBottomEdgeEffectColor setbottomedgeeffectcolor2 = settopedgeeffectcolor.valueOf;
            if (!((com.payair.hce.setBottomEdgeEffectColor) com.payair.hce.setBottomEdgeEffectColor.valueOf(new java.lang.Object[]{setbottomedgeeffectcolor2}, 1463209759, -1463209759, java.lang.System.identityHashCode(setbottomedgeeffectcolor2))).writeReplace(settopedgeeffectcolor.AlternateContactlessPaymentDataJson)) {
                break;
            }
            int i = SdkCoreBusinessLogicModuleImpl + 85;
            getPaymentFci = i % 128;
            if (i % 2 != 0) {
                com.payair.hce.setBottomEdgeEffectColor setbottomedgeeffectcolor3 = settopedgeeffectcolor.valueOf;
                ((com.payair.hce.setBottomEdgeEffectColor) com.payair.hce.setBottomEdgeEffectColor.valueOf(new java.lang.Object[]{setbottomedgeeffectcolor3}, 1463209759, -1463209759, java.lang.System.identityHashCode(setbottomedgeeffectcolor3))).valueOf(settopedgeeffectcolor.AlternateContactlessPaymentDataJson);
                throw null;
            }
            com.payair.hce.setBottomEdgeEffectColor setbottomedgeeffectcolor4 = settopedgeeffectcolor.valueOf;
            settopedgeeffectcolor = ((com.payair.hce.setBottomEdgeEffectColor) com.payair.hce.setBottomEdgeEffectColor.valueOf(new java.lang.Object[]{setbottomedgeeffectcolor4}, 1463209759, -1463209759, java.lang.System.identityHashCode(setbottomedgeeffectcolor4))).valueOf(settopedgeeffectcolor.AlternateContactlessPaymentDataJson);
        }
        java.lang.reflect.Method method = settopedgeeffectcolor.RecordsJson;
        int i2 = getPaymentFci + 43;
        SdkCoreBusinessLogicModuleImpl = i2 % 128;
        if (i2 % 2 != 0) {
            return method;
        }
        throw null;
    }

    public final java.lang.reflect.Method valueOf() {
        com.payair.hce.setTopEdgeEffectColor settopedgeeffectcolor = this;
        while (settopedgeeffectcolor.IccPrivateKeyCrtComponentsJson == null) {
            java.lang.reflect.Method method = settopedgeeffectcolor.getAid.get(settopedgeeffectcolor.values);
            settopedgeeffectcolor.IccPrivateKeyCrtComponentsJson = method;
            if (method != null) {
                break;
            }
            int i = SdkCoreBusinessLogicModuleImpl + 85;
            getPaymentFci = i % 128;
            if (i % 2 != 0) {
                com.payair.hce.setBottomEdgeEffectColor setbottomedgeeffectcolor = settopedgeeffectcolor.valueOf;
                throw new java.lang.ArithmeticException();
            }
            com.payair.hce.setBottomEdgeEffectColor setbottomedgeeffectcolor2 = settopedgeeffectcolor.valueOf;
            if (((com.payair.hce.setBottomEdgeEffectColor) com.payair.hce.setBottomEdgeEffectColor.valueOf(new java.lang.Object[]{setbottomedgeeffectcolor2}, 1463209759, -1463209759, java.lang.System.identityHashCode(setbottomedgeeffectcolor2))) == null) {
                break;
            }
            com.payair.hce.setBottomEdgeEffectColor setbottomedgeeffectcolor3 = settopedgeeffectcolor.valueOf;
            if (!((com.payair.hce.setBottomEdgeEffectColor) com.payair.hce.setBottomEdgeEffectColor.valueOf(new java.lang.Object[]{setbottomedgeeffectcolor3}, 1463209759, -1463209759, java.lang.System.identityHashCode(setbottomedgeeffectcolor3))).writeReplace(settopedgeeffectcolor.AlternateContactlessPaymentDataJson)) {
                break;
            }
            int i2 = getPaymentFci + 67;
            SdkCoreBusinessLogicModuleImpl = i2 % 128;
            if (i2 % 2 == 0) {
                com.payair.hce.setBottomEdgeEffectColor setbottomedgeeffectcolor4 = settopedgeeffectcolor.valueOf;
                ((com.payair.hce.setBottomEdgeEffectColor) com.payair.hce.setBottomEdgeEffectColor.valueOf(new java.lang.Object[]{setbottomedgeeffectcolor4}, 1463209759, -1463209759, java.lang.System.identityHashCode(setbottomedgeeffectcolor4))).valueOf(settopedgeeffectcolor.AlternateContactlessPaymentDataJson);
                throw new java.lang.ArithmeticException();
            }
            com.payair.hce.setBottomEdgeEffectColor setbottomedgeeffectcolor5 = settopedgeeffectcolor.valueOf;
            settopedgeeffectcolor = ((com.payair.hce.setBottomEdgeEffectColor) com.payair.hce.setBottomEdgeEffectColor.valueOf(new java.lang.Object[]{setbottomedgeeffectcolor5}, 1463209759, -1463209759, java.lang.System.identityHashCode(setbottomedgeeffectcolor5))).valueOf(settopedgeeffectcolor.AlternateContactlessPaymentDataJson);
        }
        return settopedgeeffectcolor.IccPrivateKeyCrtComponentsJson;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r3.values = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r3.values == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r3.values == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void values(java.lang.reflect.Method method) {
        java.lang.Class<?> cls;
        int i = getPaymentFci + 97;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 == 0) {
            cls = method.getParameterTypes()[1];
        } else {
            cls = method.getParameterTypes()[0];
        }
        this.getAid.put(cls, method);
        method.setAccessible(true);
        int i2 = SdkCoreBusinessLogicModuleImpl + 43;
        getPaymentFci = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final java.lang.Boolean SdkCoreAlternateContactlessPaymentDataImpl() {
        int i = getPaymentFci;
        int i2 = i + 83;
        SdkCoreBusinessLogicModuleImpl = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.lang.Boolean bool = this.getGpoResponse;
        SdkCoreBusinessLogicModuleImpl = (i + 65) % 128;
        return bool;
    }

    public final java.lang.Object valueOf(java.lang.Object obj) {
        SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 27) % 128;
        try {
            java.lang.reflect.Method SdkCoreBusinessLogicModuleImpl2 = SdkCoreBusinessLogicModuleImpl();
            if (SdkCoreBusinessLogicModuleImpl2 == null) {
                java.lang.reflect.Field field = this.writeReplace;
                if (field != null) {
                    return field.get(obj);
                }
                return null;
            }
            int i = SdkCoreBusinessLogicModuleImpl + 95;
            getPaymentFci = i % 128;
            if (i % 2 != 0) {
                SdkCoreBusinessLogicModuleImpl2.invoke(obj, null);
                throw null;
            }
            java.lang.Object invoke = SdkCoreBusinessLogicModuleImpl2.invoke(obj, null);
            SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 87) % 128;
            return invoke;
        } catch (java.lang.IllegalAccessException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("兢儧\ue8dbꂍ毰⃔々㋨烤ʊሔჳዣ\ue4d2琊\uf68f㓌웧嘺퓇훛룸렠誗\uf8d6髨驜梻骿粜ﱋ亦볮", 1 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(this.values.getName());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("꜆Ꜩ䧨㩴ᒸ", 1 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            sb.append(this.AlternateContactlessPaymentDataJson);
            throw new com.payair.hce.setOnGroupCollapseListener(sb.toString(), e);
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a("兢儧\ue8dbꂍ毰⃔々㋨烤ʊሔჳዣ\ue4d2琊\uf68f㓌웧嘺퓇훛룸렠誗\uf8d6髨驜梻骿粜ﱋ亦볮", android.graphics.Color.argb(0, 0, 0, 0) + 1, objArr3);
            sb2.append(((java.lang.String) objArr3[0]).intern());
            sb2.append(this.values.getName());
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a("꜆Ꜩ䧨㩴ᒸ", 1 - android.text.TextUtils.getTrimmedLength(""), objArr4);
            sb2.append(((java.lang.String) objArr4[0]).intern());
            sb2.append(this.AlternateContactlessPaymentDataJson);
            throw new com.payair.hce.setOnGroupCollapseListener(sb2.toString(), e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (java.lang.reflect.Modifier.isTransient(r1.writeReplace.getModifiers()) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Boolean IccPrivateKeyCrtComponentsJson() {
        boolean z;
        SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 3) % 128;
        java.lang.reflect.Method SdkCoreBusinessLogicModuleImpl2 = SdkCoreBusinessLogicModuleImpl();
        if (SdkCoreBusinessLogicModuleImpl2 == null || java.lang.reflect.Modifier.isStatic(SdkCoreBusinessLogicModuleImpl2.getModifiers())) {
            java.lang.reflect.Field field = this.writeReplace;
            if (field != null && !java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 9) % 128;
            }
            z = false;
            return java.lang.Boolean.valueOf(z);
        }
        z = true;
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (java.lang.reflect.Modifier.isTransient(r3.writeReplace.getModifiers()) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Boolean getProfileVersion() {
        boolean z;
        SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 91) % 128;
        if (valueOf() == null) {
            java.lang.reflect.Field field = this.writeReplace;
            if (field != null) {
                int i = getPaymentFci + 23;
                SdkCoreBusinessLogicModuleImpl = i % 128;
                int i2 = i % 2;
                int modifiers = field.getModifiers();
                if (i2 == 0) {
                    java.lang.reflect.Modifier.isPublic(modifiers);
                    throw null;
                }
                if (java.lang.reflect.Modifier.isPublic(modifiers)) {
                }
            }
            z = false;
            return java.lang.Boolean.valueOf(z);
        }
        SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 75) % 128;
        z = true;
        return java.lang.Boolean.valueOf(z);
    }

    public final java.lang.Boolean getAid() {
        int i = (getPaymentFci + 63) % 128;
        SdkCoreBusinessLogicModuleImpl = i;
        java.lang.reflect.Field field = this.writeReplace;
        if (field != null) {
            int i2 = i + 79;
            getPaymentFci = i2 % 128;
            if (i2 % 2 != 0) {
                java.lang.reflect.Modifier.isTransient(field.getModifiers());
                throw null;
            }
            if (java.lang.reflect.Modifier.isTransient(field.getModifiers())) {
                int i3 = getPaymentFci;
                int i4 = i3 + 125;
                SdkCoreBusinessLogicModuleImpl = i4 % 128;
                r2 = i4 % 2 != 0;
                SdkCoreBusinessLogicModuleImpl = (i3 + 51) % 128;
            }
        }
        return java.lang.Boolean.valueOf(r2);
    }

    protected final boolean RecordsJson() {
        if (SdkCoreBusinessLogicModuleImpl() == null && valueOf() == null && !java.lang.reflect.Modifier.isPublic(this.writeReplace.getModifiers())) {
            getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 95) % 128;
            return true;
        }
        int i = getPaymentFci + 77;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final com.payair.hce.setTextMetricsParams getPaymentFci() throws java.lang.InstantiationException, java.lang.IllegalAccessException {
        int i = getPaymentFci + 1;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        com.payair.hce.setOnItemLongClickListener<? extends com.payair.hce.setTextMetricsParams> setonitemlongclicklistener = this.getProfileVersion;
        if (setonitemlongclicklistener == null) {
            return null;
        }
        com.payair.hce.setTextMetricsParams valueOf = setonitemlongclicklistener.valueOf();
        int i2 = getPaymentFci + 41;
        SdkCoreBusinessLogicModuleImpl = i2 % 128;
        if (i2 % 2 != 0) {
            return valueOf;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getPaymentFci = 0;
        SdkCoreBusinessLogicModuleImpl = 1;
        getCvrMaskAnd = 2495854992654580926L;
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.reflect.Method method) {
        DigitizedCardProfile(new java.lang.Object[]{this, method}, -1461575805, 1461575806, java.lang.System.identityHashCode(this));
    }

    public final java.lang.reflect.Field DigitizedCardProfile() {
        return (java.lang.reflect.Field) DigitizedCardProfile(new java.lang.Object[]{this}, -53863153, 53863153, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 38, -82, -31};
        $$b = 179;
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 1544115242, -1544115240, java.lang.System.identityHashCode(this));
    }
}
