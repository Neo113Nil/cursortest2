package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTypeface implements com.payair.hce.setSelectedGroup {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static short[] RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int valueOf;
    private static byte[] writeReplace;
    private com.payair.hce.setOnItemClickListener values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = (i * 3) + 4;
        int i5 = (s * 4) + 1;
        int i6 = 104 - (b * 3);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i6 += -i7;
            i4++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i6 += -i7;
            i4++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    public setTypeface(com.payair.hce.setOnItemClickListener setonitemclicklistener) {
        this.values = setonitemclicklistener;
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        java.lang.Class cls2 = null;
        try {
            try {
                com.payair.hce.setOnItemClickListener setonitemclicklistener = this.values;
                setongroupexpandlistener.AlternateContactlessPaymentDataJson();
                java.lang.Class AlternateContactlessPaymentDataJson2 = setonitemclicklistener.AlternateContactlessPaymentDataJson();
                if (AlternateContactlessPaymentDataJson2 == null) {
                    return null;
                }
                int i = IccPrivateKeyCrtComponentsJson + 45;
                SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
                try {
                    if (i % 2 != 0) {
                        if (java.util.Collection.class.isAssignableFrom(AlternateContactlessPaymentDataJson2)) {
                            return (java.util.Collection) com.payair.hce.setOnGroupExpandListener.valueOf(new java.lang.Object[]{setongroupexpandlistener, (java.util.Collection) obj, (java.util.Collection) AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson2), type}, -1714344637, 1714344638, java.lang.System.identityHashCode(setongroupexpandlistener));
                        }
                        if (java.util.Map.class.isAssignableFrom(AlternateContactlessPaymentDataJson2)) {
                            if (type instanceof java.lang.reflect.ParameterizedType) {
                                java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
                                return setongroupexpandlistener.writeReplace((java.util.Map) obj, (java.util.Map) AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson2), parameterizedType.getActualTypeArguments()[0], parameterizedType.getActualTypeArguments()[1]);
                            }
                            java.lang.Object writeReplace2 = setongroupexpandlistener.writeReplace((java.util.Map) obj, (java.util.Map) AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson2), null, null);
                            int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 95;
                            IccPrivateKeyCrtComponentsJson = i2 % 128;
                            if (i2 % 2 == 0) {
                                return writeReplace2;
                            }
                            throw null;
                        }
                        if (obj instanceof java.util.Map) {
                            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                            return setongroupexpandlistener.DigitizedCardProfile((java.util.Map) obj, AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson2), AlternateContactlessPaymentDataJson2);
                        }
                        java.lang.Object valueOf2 = com.payair.hce.setOnGroupExpandListener.valueOf(new java.lang.Object[]{setongroupexpandlistener, obj, AlternateContactlessPaymentDataJson2}, -762439471, 762439474, java.lang.System.identityHashCode(setongroupexpandlistener));
                        java.lang.Object obj2 = valueOf2;
                        return valueOf2;
                    }
                    throw new java.lang.NullPointerException();
                } catch (java.lang.IllegalAccessException e) {
                    e = e;
                    cls2 = AlternateContactlessPaymentDataJson2;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a((-2022536109) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (-471200423) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getScrollBarSize() >> 8) - 71, (byte) ((-127) - android.graphics.Color.green(0)), (short) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
                    throw new com.payair.hce.setOnGroupCollapseListener(java.lang.String.format(((java.lang.String) objArr[0]).intern(), setongroupexpandlistener.AlternateContactlessPaymentDataJson(), cls2.getName()), e);
                } catch (java.lang.InstantiationException e2) {
                    e = e2;
                    cls2 = AlternateContactlessPaymentDataJson2;
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a((-2022536109) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (-471200388) - android.widget.ExpandableListView.getPackedPositionType(0L), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) - 71, (byte) ((-101) - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), (short) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
                    throw new com.payair.hce.setOnGroupCollapseListener(java.lang.String.format(((java.lang.String) objArr2[0]).intern(), setongroupexpandlistener.AlternateContactlessPaymentDataJson(), cls2.getName()), e);
                } catch (java.lang.NoSuchMethodException e3) {
                    e = e3;
                    cls2 = AlternateContactlessPaymentDataJson2;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 2022536108, 3540 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 71, (byte) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 73), (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), objArr3);
                    throw new com.payair.hce.setOnGroupCollapseListener(java.lang.String.format(((java.lang.String) objArr3[0]).intern(), setongroupexpandlistener.AlternateContactlessPaymentDataJson(), cls2.getName()), e);
                } catch (java.lang.reflect.InvocationTargetException e4) {
                    e = e4;
                    cls2 = AlternateContactlessPaymentDataJson2;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 2022536108, (-471200302) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (-71) - android.view.KeyEvent.getDeadChar(0, 0), (byte) (50 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (short) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
                    throw new com.payair.hce.setOnGroupCollapseListener(java.lang.String.format(((java.lang.String) objArr4[0]).intern(), setongroupexpandlistener.AlternateContactlessPaymentDataJson(), cls2.getName()), e);
                }
            } catch (java.lang.ClassNotFoundException e5) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                a((-2022536108) - android.view.View.getDefaultSize(0, 0), ((android.os.Process.getThreadPriority(0) + 20) >> 6) - 471200449, (-71) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 30), (short) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr5);
                throw new com.payair.hce.setOnGroupCollapseListener(java.lang.String.format(((java.lang.String) objArr5[0]).intern(), setongroupexpandlistener.AlternateContactlessPaymentDataJson(), e5.getMessage()), e5);
            }
        } catch (java.lang.IllegalAccessException e6) {
            e = e6;
        } catch (java.lang.InstantiationException e7) {
            e = e7;
        } catch (java.lang.NoSuchMethodException e8) {
            e = e8;
        } catch (java.lang.reflect.InvocationTargetException e9) {
            e = e9;
        }
    }

    private static java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Class cls) throws java.lang.NoSuchMethodException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 7;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            java.lang.reflect.Constructor declaredConstructor = cls.getDeclaredConstructor(new java.lang.Class[1]);
            declaredConstructor.setAccessible(false);
            return declaredConstructor.newInstance(new java.lang.Object[0]);
        }
        java.lang.reflect.Constructor declaredConstructor2 = cls.getDeclaredConstructor(new java.lang.Class[0]);
        declaredConstructor2.setAccessible(true);
        return declaredConstructor2.newInstance(new java.lang.Object[0]);
    }

    public final com.payair.hce.setOnItemClickListener valueOf() {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i + 19;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.setOnItemClickListener setonitemclicklistener = this.values;
        SdkCoreAlternateContactlessPaymentDataImpl = (i + 109) % 128;
        return setonitemclicklistener;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        boolean z;
        long j;
        int i4;
        int i5;
        boolean z2;
        int length;
        byte[] bArr;
        int i6;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(DigitizedCardProfile)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 29 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((-1) - android.os.Process.getGidForName("")))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                int i7 = $10 + 47;
                $11 = i7 % 128;
                if (i7 % 2 != 0) {
                    z = true;
                    if (z) {
                        $10 = ($11 + 111) % 128;
                        byte[] bArr2 = writeReplace;
                        if (bArr2 != null) {
                            int length2 = bArr2.length;
                            byte[] bArr3 = new byte[length2];
                            for (int i8 = 0; i8 < length2; i8++) {
                                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr2[i8])};
                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                                if (obj2 == null) {
                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.text.TextUtils.getOffsetAfter("", 0) + 5088, (char) android.graphics.Color.alpha(0))).getMethod("e", java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                                }
                                bArr3[i8] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                            }
                            bArr2 = bArr3;
                        }
                        if (bArr2 == null) {
                            j = -4897270311952305750L;
                            intValue = (short) (((short) (RecordsJson[i2 + ((int) (AlternateContactlessPaymentDataJson ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
                            if (intValue > 0) {
                                int i9 = (int) (AlternateContactlessPaymentDataJson ^ j);
                                if (z) {
                                    $10 = ($11 + 91) % 128;
                                    i5 = 1;
                                    i4 = 2;
                                } else {
                                    int i10 = $11 + 35;
                                    $10 = i10 % 128;
                                    i4 = 2;
                                    int i11 = i10 % 2;
                                    i5 = 0;
                                }
                                gettrack2constructiondata.writeReplace = ((i2 + intValue) - i4) + i9 + i5;
                                java.lang.Object[] objArr4 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(valueOf), sb};
                                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                                if (obj3 == null) {
                                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 26, 2364 - android.text.TextUtils.getOffsetBefore("", 0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                    byte b2 = (byte) ($$a[2] - 1);
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    b(b2, b2, b2, objArr5);
                                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj3);
                                }
                                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).append(gettrack2constructiondata.values);
                                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                                byte[] bArr4 = writeReplace;
                                if (bArr4 != null) {
                                    int i12 = $11 + 3;
                                    $10 = i12 % 128;
                                    if (i12 % 2 != 0) {
                                        length = bArr4.length;
                                        bArr = new byte[length];
                                        i6 = 1;
                                    } else {
                                        length = bArr4.length;
                                        bArr = new byte[length];
                                        i6 = 0;
                                    }
                                    while (i6 < length) {
                                        $10 = ($11 + 31) % 128;
                                        bArr[i6] = (byte) (bArr4[i6] ^ (-4897270311952305750L));
                                        i6++;
                                    }
                                    bArr4 = bArr;
                                }
                                if (bArr4 != null) {
                                    $11 = ($10 + 93) % 128;
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                gettrack2constructiondata.DigitizedCardProfile = 1;
                                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                                    if (z2) {
                                        byte[] bArr5 = writeReplace;
                                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr5[r7] ^ (-4897270311952305750L))) + s)) ^ b));
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
                        }
                        byte[] bArr6 = writeReplace;
                        java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson)};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                        if (obj4 == null) {
                            obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 27, 29 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) android.view.View.MeasureSpec.getMode(0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                        }
                        intValue = (byte) (((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).intValue()] ^ (-4897270311952305750L))) + ((int) (DigitizedCardProfile ^ (-4897270311952305750L))));
                    }
                    j = -4897270311952305750L;
                    if (intValue > 0) {
                    }
                    objArr[0] = sb.toString();
                }
            }
            z = false;
            if (z) {
            }
            j = -4897270311952305750L;
            if (intValue > 0) {
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

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        AlternateContactlessPaymentDataJson = 51495787;
        DigitizedCardProfile = 520368620;
        valueOf = 1737048699;
        writeReplace = new byte[]{Byte.MAX_VALUE, 6, 77, -27, 72, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -67, 65, com.google.common.base.Ascii.VT, -12, -66, 77, 75, 14, -28, 77, 73, 6, -12, -80, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 78, 100, 107, -82, -113, 6, 118, 101, 46, -122, 43, 57, -34, 34, 104, -112, -38, 56, -45, -34, 45, 38, -58, 42, 46, 46, 98, -121, 46, 42, 101, -105, -45, -36, 45, 7, 8, -51, -20, 101, 72, Byte.MAX_VALUE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -100, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 35, -60, 56, 114, -120, -56, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -60, 34, -55, -60, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 60, -36, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 120, -118, -56, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 48, com.visa.cbp.getEncExpo.startTransaction, 102, -126, 57, -56, 59, -62, -52, 19, 1, -41, -10, Byte.MAX_VALUE, 66, -82, -27, 78, -29, -23, -90, 78, -29, com.google.common.base.Ascii.ESC, -15, 14, -29, com.google.common.base.Ascii.RS, -31, -27, com.google.common.base.Ascii.US, -20, -93, 89, com.google.common.base.Ascii.NAK, -15, -44, 94, -31, -82, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -95, 92, com.google.common.base.Ascii.SYN, -27, -29, -90, 76, -27, -31, -82, 92, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ETB, -26, -52, -61, 6, 39, -82, 88, -42, -99, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -101, -111, -34, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -101, 99, -119, 118, -101, 102, com.visa.cbp.getEncExpo.registerForActivityResult, -99, 103, -108, -37, 33, 109, -119, -84, 38, com.visa.cbp.getEncExpo.registerForActivityResult, -42, 35, 101, 108, -52, 33, 97, -99, 102, 100, 97, -112, -99, -47, 35, 97, -101, com.visa.cbp.getEncExpo.registerForActivityResult, 105, com.visa.cbp.getEncExpo.kernelVersion, 43, -112, 97, -110, 107, 101, -70, -88, 126, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -42};
    }

    static void init$0() {
        $$a = new byte[]{8, -42, 1, 71};
        $$b = 241;
    }
}
