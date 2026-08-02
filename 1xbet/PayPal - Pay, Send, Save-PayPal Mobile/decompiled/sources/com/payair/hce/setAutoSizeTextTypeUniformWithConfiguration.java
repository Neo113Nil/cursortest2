package com.payair.hce;

/* loaded from: classes4.dex */
public final class setAutoSizeTextTypeUniformWithConfiguration implements com.payair.hce.setSelectedGroup {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static boolean RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static boolean getAid;
    private static int getProfileVersion;
    private static java.util.List<java.lang.String> values;
    private static char[] writeReplace;
    private boolean DigitizedCardProfile;
    private java.lang.ThreadLocal<java.util.List<java.text.DateFormat>> AlternateContactlessPaymentDataJson = new java.lang.ThreadLocal<>();
    private java.util.List<java.lang.String> valueOf = new java.util.ArrayList(values);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        int i2 = b * 2;
        int i3 = 4 - (b3 * 3);
        byte[] bArr = $$a;
        int i4 = 118 - (b2 * 3);
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            int i8 = i5;
            i4 = (-i4) + i8;
            i3 = i6 + 1;
            i = i7;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = bArr[i3];
            int i10 = i3;
            i8 = i4;
            i4 = i9;
            i7 = i + 1;
            i6 = i10;
            i4 = (-i4) + i8;
            i3 = i6 + 1;
            i = i7;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        getProfileVersion = 1;
        valueOf();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        values = arrayList;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.view.View.resolveSizeAndState(0, 0, 0) + 127, null, null, "\u0096\u0096\u0096\u0096\u0084\u0091\u0084\u0086\u0084\u0082\u0082\u0083\u0093\u0093\u0083\u009a\u009a\u0084\u008b\u0084\u0098\u0098\u0098\u0084\u0094\u0094\u0094", objArr);
        arrayList.add(((java.lang.String) objArr[0]).intern());
        java.util.List<java.lang.String> list = values;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(android.text.TextUtils.indexOf("", "", 0) + 127, null, null, "\u0096\u0096\u0096\u0096\u0084\u0091\u0084\u0082\u0082\u0083\u0093\u0093\u0083\u009f\u009f\u0084\u008b\u0084\u0098\u0098\u0098\u0084\u0094\u0094\u0094", objArr2);
        list.add(((java.lang.String) objArr2[0]).intern());
        java.util.List<java.lang.String> list2 = values;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(127 - android.widget.ExpandableListView.getPackedPositionGroup(0L), null, null, "\u0086\u0084\u0082\u0082\u0083\u0093\u0093\u0083\u009a\u009a\u0084\u0096\u0096 \u008b\u008b \u0098\u0098", objArr3);
        list2.add(((java.lang.String) objArr3[0]).intern());
        java.util.List<java.lang.String> list3 = values;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, null, null, "\u0096\u0096 \u008b\u008b \u0098\u0098", objArr4);
        list3.add(((java.lang.String) objArr4[0]).intern());
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 19) % 128;
    }

    public setAutoSizeTextTypeUniformWithConfiguration() {
        this.DigitizedCardProfile = false;
        this.DigitizedCardProfile = true;
    }

    @Override // com.payair.hce.setSelectedGroup
    public final java.lang.Object DigitizedCardProfile(com.payair.hce.setOnGroupExpandListener setongroupexpandlistener, java.lang.Object obj, java.lang.reflect.Type type, java.lang.Class cls) {
        try {
            if (!(obj instanceof java.lang.Number)) {
                java.util.Iterator<java.text.DateFormat> it = AlternateContactlessPaymentDataJson().iterator();
                IccPrivateKeyCrtComponentsJson = (getProfileVersion + 31) % 128;
                while (it.hasNext()) {
                    try {
                        return it.next().parse(obj.toString());
                    } catch (java.text.ParseException unused) {
                    }
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                a((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 127, null, null, "\u008c\u0086\u0093\u0087\u008f\u0092\u0084\u008d\u008c\u0086\u008b\u0084\u0086\u0084\u0082\u0086\u0084\u008b\u008d\u0091\u0088\u0089\u008a\u008f\u0090\u008d\u0087\u0084\u008c\u008f\u0089\u0084\u0082\u0086\u008e\u0084\u0082\u0081\u0084\u008d\u008c\u0086\u008b\u0084\u008a\u0089\u0088\u0082\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr);
                throw new com.payair.hce.setOnGroupCollapseListener(java.lang.String.format(((java.lang.String) objArr[0]).intern(), setongroupexpandlistener.AlternateContactlessPaymentDataJson(), obj));
            }
            getProfileVersion = (IccPrivateKeyCrtComponentsJson + 47) % 128;
            return valueOf((java.lang.Class) type, java.lang.Long.valueOf(((java.lang.Number) obj).longValue()));
        } catch (java.lang.IllegalAccessException e) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(127 - android.view.View.MeasureSpec.getSize(0), null, null, "\u0082\u0081\u0084\u008d\u008c\u0086\u0088\u008c\u0089\u0086\u008c\u0082\u0089\u0088\u0084\u008f\u008c\u0084\u008a\u0089\u0088\u0096\u0087\u008c\u0084\u008b\u008d\u0087\u008d\u008c\u0089\u0095\u008f\u0090\u0089\u008d\u0084\u0087\u008f\u0087\u0087\u0094\u0084\u0084\u0083\u0082\u0081", objArr2);
            throw new com.payair.hce.setOnGroupCollapseListener(java.lang.String.format(((java.lang.String) objArr2[0]).intern(), setongroupexpandlistener.AlternateContactlessPaymentDataJson(), ((java.lang.Class) type).getName()), e);
        } catch (java.lang.InstantiationException e2) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(127 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), null, null, "\u0097\u008a\u0089\u008f\u009e\u0084\u008d\u009d\u008a\u0089\u0088\u0082\u0084\u0086\u0084\u0082\u008c\u009b\u008d\u0090\u0090\u0086\u0084\u008c\u0086\u009a\u008c\u0084\u0087\u008f\u008c\u0090\u0095\u0087\u008c\u0082\u0089\u008f\u0090\u0084\u0090\u0088\u009d\u009c\u0095\u009b\u0084\u0086\u0084\u0082\u0088\u0084\u008d\u0087\u008d\u009a\u008c\u0084\u008d\u0087\u0095\u0082\u0084\u008d\u0099\u0086\u0098\u0084\u0084\u0097\u0082\u0081\u0084\u008d\u008c\u0086\u0088\u008c\u0089\u0086\u008c\u0082\u0089\u0088\u0084\u008f\u008c\u0084\u008a\u0089\u0088\u0096\u0087\u008c\u0084\u008b\u008d\u0087\u008d\u008c\u0089\u0095\u008f\u0090\u0089\u008d\u0084\u0087\u008f\u0087\u0087\u0094\u0084\u0084\u0083\u0082\u0081", objArr3);
            throw new com.payair.hce.setOnGroupCollapseListener(java.lang.String.format(((java.lang.String) objArr3[0]).intern(), setongroupexpandlistener.AlternateContactlessPaymentDataJson(), ((java.lang.Class) type).getName()), e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(127 - (android.os.Process.myTid() >> 22), null, null, "\u0097\u008a\u0089\u008f\u009e\u0084\u008d\u009d\u008a\u0089\u0088\u0082\u0084\u0086\u0084\u0082\u008c\u009b\u008d\u0090\u0090\u0086\u0084\u008c\u0086\u009a\u008c\u0084\u0087\u008f\u008c\u0090\u0095\u0087\u008c\u0082\u0089\u008f\u0090\u0084\u0090\u0088\u009d\u009c\u0095\u009b\u0084\u0086\u0084\u0082\u0088\u0084\u008d\u0087\u008d\u009a\u008c\u0084\u008d\u0087\u0095\u0082\u0084\u008d\u0099\u0086\u0098\u0084\u0084\u0097\u0082\u0081\u0084\u008d\u008c\u0086\u0088\u008c\u0089\u0086\u008c\u0082\u0089\u0088\u0084\u008f\u008c\u0084\u008a\u0089\u0088\u0096\u0087\u008c\u0084\u008b\u008d\u0087\u008d\u008c\u0089\u0095\u008f\u0090\u0089\u008d\u0084\u0087\u008f\u0087\u0087\u0094\u0084\u0084\u0083\u0082\u0081", objArr4);
            throw new com.payair.hce.setOnGroupCollapseListener(java.lang.String.format(((java.lang.String) objArr4[0]).intern(), setongroupexpandlistener.AlternateContactlessPaymentDataJson(), ((java.lang.Class) type).getName()), e3);
        }
    }

    private static java.util.Date valueOf(java.lang.Class cls, java.lang.Long l) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 81) % 128;
        try {
            java.util.Date date = (java.util.Date) cls.getConstructor(java.lang.Long.TYPE).newInstance(l);
            IccPrivateKeyCrtComponentsJson = (getProfileVersion + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            return date;
        } catch (java.lang.NoSuchMethodException unused) {
            java.util.Date date2 = (java.util.Date) cls.newInstance();
            date2.setTime(l.longValue());
            return date2;
        }
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        int i2;
        char[] cArr;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            byte[] bytes = str3.getBytes("ISO-8859-1");
            $11 = ($10 + 107) % 128;
            bArr = bytes;
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr2 = writeReplace;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 46, 286 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (46337 - (android.os.Process.myPid() >> 22)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr3[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 46, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (android.view.View.resolveSize(0, 0) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (getAid) {
            getumdgeneration.values = bArr2.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                int i4 = $11 + 55;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    cArr4[getumdgeneration.valueOf] = (char) (cArr2[bArr2[(getumdgeneration.values >>> 1) % getumdgeneration.valueOf] >>> i] >>> intValue);
                    java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                    if (obj3 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 43, 1629 - android.graphics.Color.green(0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((byte) 0, (byte) 0, (byte) 0, objArr5);
                        obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
                } else {
                    cArr4[getumdgeneration.valueOf] = (char) (cArr2[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                    java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                    if (obj4 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 43, 1628 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b((byte) 0, (byte) 0, (byte) 0, objArr7);
                        obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                }
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        if (!RecordsJson) {
            getumdgeneration.values = iArr.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                int i5 = $11 + 41;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    cArr5[getumdgeneration.valueOf] = (char) (cArr2[iArr[(getumdgeneration.values >> 1) - getumdgeneration.valueOf] % i] + intValue);
                    i2 = getumdgeneration.valueOf;
                } else {
                    cArr5[getumdgeneration.valueOf] = (char) (cArr2[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                    i2 = getumdgeneration.valueOf + 1;
                }
                getumdgeneration.valueOf = i2;
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        int i6 = $11 + 111;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            getumdgeneration.values = charArray.length;
            cArr = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 1;
        } else {
            getumdgeneration.values = charArray.length;
            cArr = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
        }
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            int i7 = $11 + 1;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[getumdgeneration.valueOf] = (char) (cArr2[charArray[(getumdgeneration.values % 1) * getumdgeneration.valueOf] << i] >>> intValue);
                java.lang.Object[] objArr8 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.View.getDefaultSize(0, 0), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1629, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    b((byte) 0, (byte) 0, (byte) 0, objArr9);
                    obj5 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj5);
                }
                ((java.lang.reflect.Method) obj5).invoke(null, objArr8);
            } else {
                cArr[getumdgeneration.valueOf] = (char) (cArr2[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                java.lang.Object[] objArr10 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj6 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 43, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1628, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    b((byte) 0, (byte) 0, (byte) 0, objArr11);
                    obj6 = cls4.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr10);
            }
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private java.util.List<java.text.DateFormat> AlternateContactlessPaymentDataJson() {
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 95) % 128;
        if (this.AlternateContactlessPaymentDataJson.get() == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (this.DigitizedCardProfile) {
                arrayList.add(java.text.DateFormat.getDateTimeInstance());
                arrayList.add(java.text.DateFormat.getDateTimeInstance(1, 1));
                arrayList.add(java.text.DateFormat.getDateTimeInstance(2, 2));
                arrayList.add(java.text.DateFormat.getDateTimeInstance(3, 3));
            }
            java.util.Iterator<java.lang.String> it = this.valueOf.iterator();
            while (it.hasNext()) {
                arrayList.add(new java.text.SimpleDateFormat(it.next()));
            }
            this.AlternateContactlessPaymentDataJson.set(arrayList);
        }
        java.util.List<java.text.DateFormat> list = this.AlternateContactlessPaymentDataJson.get();
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 25) % 128;
        return list;
    }

    static void init$0() {
        $$a = new byte[]{85, 6, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -50};
        $$b = 99;
    }

    static void valueOf() {
        writeReplace = new char[]{10975, 11117, 10914, 10968, 10888, 10907, 11114, 10899, 10902, 10897, 10908, 11116, 10911, 11105, 11113, 10909, 11106, 10910, 10903, 10943, 11119, 11107, 10966, 10935, 10901, 10896, 11112, 10906, 10900, 10932, 10928, 10921};
        SdkCoreAlternateContactlessPaymentDataImpl = -143185160;
        RecordsJson = true;
        getAid = true;
    }
}
