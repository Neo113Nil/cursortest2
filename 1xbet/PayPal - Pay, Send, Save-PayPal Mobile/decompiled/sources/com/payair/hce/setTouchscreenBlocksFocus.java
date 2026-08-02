package com.payair.hce;

/* loaded from: classes4.dex */
final class setTouchscreenBlocksFocus {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static java.lang.String DigitizedCardProfile;
    private static boolean IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getCiacDecline;
    private static final int getCvrMaskAnd = 0;
    private static final byte[] getGpoResponse = null;
    private static int getPaymentFci;
    private static boolean getProfileVersion;
    private static java.lang.String valueOf;
    private static char values;
    private static char writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        ?? r8 = (b * 8) + 110;
        byte[] bArr = $$a;
        int i4 = (s * 4) + 4;
        int i5 = i * 3;
        byte[] bArr2 = new byte[1 - i5];
        if (bArr == null) {
            byte b2 = r8;
            i2 = 0;
            int i6 = i4;
            int i7 = i6 + 1;
            i3 = i4 + (-b2);
            i4 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == 0 - i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            b2 = bArr[i4];
            i2++;
            int i8 = i3;
            i6 = i4;
            i4 = i8;
            int i72 = i6 + 1;
            i3 = i4 + (-b2);
            i4 = i72;
            bArr2[i2] = (byte) i3;
            if (i2 == 0 - i5) {
            }
        } else {
            i2 = 0;
            i3 = r8;
            bArr2[i2] = (byte) i3;
            if (i2 == 0 - i5) {
            }
        }
    }

    static java.lang.String values() {
        java.lang.String str = DigitizedCardProfile;
        if (str != null) {
            return str;
        }
        try {
            byte[] bArr = getGpoResponse;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(bArr[1590], 1452, bArr[569], objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(bArr[624], 1398, bArr[13], objArr2);
            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr2[0], null).invoke(null, null);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(bArr[1590], 1452, bArr[569], objArr3);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(bArr[624], 1388, bArr[6], objArr4);
            final com.google.android.gms.tasks.Task task = (com.google.android.gms.tasks.Task) cls2.getMethod((java.lang.String) objArr4[0], null).invoke(invoke, null);
            final java.lang.Object obj = new java.lang.Object();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(bArr[633], 1669, bArr[32], objArr5);
            final java.lang.String[] strArr = (java.lang.String[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr5[0]), 1);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(bArr[633], 1384, bArr[1395], objArr6);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr6[0]);
            byte b = (byte) (-bArr[646]);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            a(b, (short) (b | 1289), bArr[465], objArr7);
            java.lang.Object invoke2 = cls3.getMethod((java.lang.String) objArr7[0], null).invoke(null, null);
            java.lang.Object[] objArr8 = {new java.lang.Runnable() { // from class: com.payair.hce.setTouchscreenBlocksFocus$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.payair.hce.setTouchscreenBlocksFocus.valueOf(com.google.android.gms.tasks.Task.this, obj, strArr);
                }
            }};
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            a(bArr[633], 1333, bArr[1621], objArr9);
            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr9[0]);
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            a(bArr[1426], 1298, bArr[52], objArr10);
            java.lang.String str2 = (java.lang.String) objArr10[0];
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            a(bArr[633], 1292, bArr[447], objArr11);
            cls4.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(invoke2, objArr8);
            synchronized (obj) {
                try {
                    try {
                        obj.wait();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a(getGpoResponse[633], 1275, getGpoResponse[32], objArr12);
                    java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    a(getGpoResponse[1590], 1260, getGpoResponse[19], objArr13);
                    java.lang.Object invoke3 = cls5.getMethod((java.lang.String) objArr13[0], null).invoke(null, null);
                    try {
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a(getGpoResponse[633], 1275, getGpoResponse[32], objArr14);
                        java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        a((byte) (getGpoResponse[633] - 1), 1248, getGpoResponse[7], objArr15);
                        cls6.getMethod((java.lang.String) objArr15[0], null).invoke(invoke3, null);
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
            }
            DigitizedCardProfile = strArr[0];
            byte[] bArr2 = getGpoResponse;
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            a(bArr2[633], 1333, bArr2[1621], objArr16);
            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr16[0]);
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            a(bArr2[1465], 1240, bArr2[4], objArr17);
            cls7.getMethod((java.lang.String) objArr17[0], null).invoke(invoke2, null);
            return strArr[0];
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void valueOf(com.google.android.gms.tasks.Task task, java.lang.Object obj, java.lang.String[] strArr) {
        try {
            try {
                byte[] bArr = getGpoResponse;
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(bArr[1590], bArr[604], bArr[1359], objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                byte b = (byte) (bArr[569] - 1);
                short s = bArr[6];
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(b, s, s, objArr2);
                java.lang.String str = (java.lang.String) objArr2[0];
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(bArr[1590], bArr[0], bArr[1598], objArr3);
                java.lang.Object invoke = cls.getMethod(str, java.lang.Class.forName((java.lang.String) objArr3[0])).invoke(null, task);
                synchronized (obj) {
                    strArr[0] = invoke;
                    obj.notify();
                }
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            synchronized (obj) {
                strArr[0] = 0;
                obj.notify();
                try {
                    byte[] bArr2 = getGpoResponse;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(bArr2[633], 1275, bArr2[32], objArr4);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a(bArr2[1590], 1260, bArr2[19], objArr5);
                    java.lang.Object invoke2 = cls2.getMethod((java.lang.String) objArr5[0], null).invoke(null, null);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    a(bArr2[633], 1275, bArr2[32], objArr6);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a((byte) (bArr2[633] - 1), 1248, bArr2[7], objArr7);
                    cls3.getMethod((java.lang.String) objArr7[0], null).invoke(invoke2, null);
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            cArr = str.toCharArray();
            int i2 = $10 + 107;
            $11 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            $11 = ($10 + 27) % 128;
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i4 = 58224;
            for (int i5 = 0; i5 < 16; i5++) {
                $11 = ($10 + 41) % 128;
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i4) ^ ((c2 << 4) + ((char) (AlternateContactlessPaymentDataJson ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(RecordsJson)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - android.view.View.combineMeasuredStates(0, 0), 1335 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c(0, (short) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (writeReplace ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(values)};
                    int i6 = charValue + i4;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - android.view.KeyEvent.getDeadChar(0, 0), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1335, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c(0, (short) 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i4 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
            cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(54 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionChild(0L) + 3544, (char) ((-1) - android.view.MotionEvent.axisFromString("")))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    private static void d(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = SdkCoreAlternateContactlessPaymentDataImpl;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i2 = 0;
            while (i2 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i2])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 285 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.os.SystemClock.elapsedRealtime() > j ? 1 : (android.os.SystemClock.elapsedRealtime() == j ? 0 : -1)) + 46336))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i2++;
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(getAid)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.graphics.ImageFormat.getBitsPerPixel(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) (46337 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (getProfileVersion) {
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.widget.ExpandableListView.getPackedPositionType(0L), android.view.MotionEvent.axisFromString("") + 1630, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c(0, (short) 0, (byte) 1, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (IccPrivateKeyCrtComponentsJson) {
            getumdgeneration.values = charArray.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr4[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 43, (android.os.Process.myTid() >> 22) + 1629, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    c(0, (short) 0, (byte) 1, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        getumdgeneration.values = iArr.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            getumdgeneration.valueOf++;
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x091e, code lost:
    
        if (r5 > 131) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x08bb, code lost:
    
        if (r5 > 23) goto L276;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0939 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x073a A[Catch: all -> 0x080a, TryCatch #18 {all -> 0x080a, blocks: (B:351:0x0722, B:356:0x0733, B:358:0x073a, B:359:0x073b, B:381:0x075a, B:382:0x07af, B:384:0x0764, B:386:0x077c, B:394:0x07a6, B:396:0x07b5, B:398:0x07cc, B:406:0x07f3), top: B:350:0x0722 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x073b A[Catch: all -> 0x080a, TryCatch #18 {all -> 0x080a, blocks: (B:351:0x0722, B:356:0x0733, B:358:0x073a, B:359:0x073b, B:381:0x075a, B:382:0x07af, B:384:0x0764, B:386:0x077c, B:394:0x07a6, B:396:0x07b5, B:398:0x07cc, B:406:0x07f3), top: B:350:0x0722 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x08f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.Throwable th;
        java.lang.Object[] objArr2;
        java.lang.Object[] objArr3;
        java.lang.Object[] objArr4;
        java.lang.Object[] objArr5;
        int i;
        java.lang.Object[] objArr6;
        char c;
        java.lang.Object[] objArr7;
        int i2;
        int i3;
        int i4;
        int i5;
        java.lang.Throwable cause;
        java.lang.Object[] objArr8;
        java.lang.Object[] objArr9;
        int i6;
        java.lang.Throwable th2;
        int charValue;
        java.lang.Object invoke;
        java.lang.Object obj;
        com.payair.hce.setClipChildren setclipchildren = new com.payair.hce.setClipChildren((byte[]) objArr[0]);
        byte[] bArr = getGpoResponse;
        byte b = bArr[94];
        int i7 = 1;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        a(b, (short) (b | 1232), 482, objArr10);
        java.lang.String str = (java.lang.String) objArr10[0];
        byte b2 = bArr[0];
        byte b3 = b2;
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a(b3, (short) (b3 | 1669), b2, objArr11);
        try {
            java.lang.Object[] objArr12 = {(java.lang.String) objArr11[0]};
            char c2 = 633;
            char c3 = ' ';
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            a(bArr[633], 1669, bArr[32], objArr13);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr13[0]);
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            a(bArr[1465], 1654, bArr[6], objArr14);
            java.lang.String str2 = (java.lang.String) objArr14[0];
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            a(bArr[633], 1669, bArr[32], objArr15);
            java.lang.Object[] objArr16 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr15[0])).invoke(str, objArr12);
            int[] iArr = new int[objArr16.length];
            int i8 = 0;
            while (i8 < objArr16.length) {
                try {
                    java.lang.Object[] objArr17 = {objArr16[i8]};
                    byte[] bArr2 = getGpoResponse;
                    java.lang.Object[] objArr18 = new java.lang.Object[i7];
                    a(bArr2[633], 1650, bArr2[118], objArr18);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr18[0]);
                    java.lang.Object[] objArr19 = new java.lang.Object[i7];
                    a(bArr2[686], 1634, bArr2[52], objArr19);
                    java.lang.String str3 = (java.lang.String) objArr19[0];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[i7];
                    byte b4 = bArr2[633];
                    short s = bArr2[c3];
                    java.lang.Object[] objArr20 = new java.lang.Object[i7];
                    a(b4, 1669, s, objArr20);
                    clsArr[0] = java.lang.Class.forName((java.lang.String) objArr20[0]);
                    java.lang.Object invoke2 = cls2.getMethod(str3, clsArr).invoke(null, objArr17);
                    try {
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        a(bArr2[633], 1650, bArr2[118], objArr21);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        a((byte) (bArr2[633] - 1), 1628, bArr2[4], objArr22);
                        iArr[i8] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr22[0], null).invoke(invoke2, null)).intValue();
                        i8++;
                        i7 = 1;
                        c3 = ' ';
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause2 = th3.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th3;
                    }
                } catch (java.lang.Throwable th4) {
                    java.lang.Throwable cause3 = th4.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th4;
                }
            }
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                try {
                } catch (java.lang.Throwable th5) {
                    th = th5;
                }
                switch (setclipchildren.AlternateContactlessPaymentDataJson(iArr[i9])) {
                    case -50:
                        i10 = 142;
                        i9 = i10;
                        c2 = 633;
                    case -49:
                        setclipchildren.AlternateContactlessPaymentDataJson(28);
                        if (setclipchildren.AlternateContactlessPaymentDataJson != 70) {
                            i10 = 120;
                            i9 = i10;
                            c2 = 633;
                        } else {
                            i9 = 1;
                            c2 = 633;
                        }
                    case -48:
                        i10 = 107;
                        i9 = i10;
                        c2 = 633;
                    case -47:
                        i10 = 141;
                        i9 = i10;
                        c2 = 633;
                    case -46:
                        setclipchildren.AlternateContactlessPaymentDataJson(20);
                        if (setclipchildren.AlternateContactlessPaymentDataJson == 0) {
                            i10 = 140;
                        }
                        i9 = i10;
                        c2 = 633;
                    case -45:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(10);
                        getPaymentFci = setclipchildren.AlternateContactlessPaymentDataJson;
                        i9 = i10;
                        c2 = 633;
                    case -44:
                        i5 = getCiacDecline;
                        setclipchildren.values = i5;
                        setclipchildren.AlternateContactlessPaymentDataJson(16);
                        i9 = i10;
                        c2 = 633;
                    case -43:
                        i10 = 143;
                        i9 = i10;
                        c2 = 633;
                    case -42:
                        i10 = 145;
                        i9 = i10;
                        c2 = 633;
                    case -41:
                        setclipchildren.AlternateContactlessPaymentDataJson(57);
                        if (setclipchildren.AlternateContactlessPaymentDataJson == 0) {
                            i10 = 118;
                        }
                        i9 = i10;
                        c2 = 633;
                    case -40:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(10);
                        getCiacDecline = setclipchildren.AlternateContactlessPaymentDataJson;
                        i9 = i10;
                        c2 = 633;
                    case -39:
                        i5 = getPaymentFci;
                        setclipchildren.values = i5;
                        setclipchildren.AlternateContactlessPaymentDataJson(16);
                        i9 = i10;
                        c2 = 633;
                    case -38:
                        i9 = 23;
                        c2 = 633;
                    case -37:
                        i10 = 109;
                        i9 = i10;
                        c2 = 633;
                    case -36:
                        i9 = 131;
                        c2 = 633;
                    case -35:
                        try {
                            setclipchildren.values = 1;
                            setclipchildren.AlternateContactlessPaymentDataJson(5);
                            try {
                                setclipchildren.AlternateContactlessPaymentDataJson(6);
                                try {
                                    objArr8 = new java.lang.Object[]{(char[]) setclipchildren.getProfileVersion};
                                    byte[] bArr3 = getGpoResponse;
                                    try {
                                        objArr9 = new java.lang.Object[1];
                                        try {
                                            a(bArr3[633], 1669, bArr3[32], objArr9);
                                        } catch (java.lang.Throwable th6) {
                                            th = th6;
                                            java.lang.Throwable th7 = th;
                                            cause = th7.getCause();
                                            if (cause == null) {
                                                throw cause;
                                            }
                                            throw th7;
                                        }
                                    } catch (java.lang.Throwable th8) {
                                        th = th8;
                                        java.lang.Throwable th72 = th;
                                        cause = th72.getCause();
                                        if (cause == null) {
                                        }
                                    }
                                } catch (java.lang.Throwable th9) {
                                    th = th9;
                                }
                            } catch (java.lang.Throwable th10) {
                                th = th10;
                                th = th;
                                byte[] bArr4 = getGpoResponse;
                                objArr2 = new java.lang.Object[1];
                                a(bArr4[633], 458, bArr4[604], objArr2);
                                if (java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                                    break;
                                }
                                objArr3 = new java.lang.Object[1];
                                a(bArr4[633], 458, bArr4[604], objArr3);
                                if (java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th)) {
                                    break;
                                }
                                objArr4 = new java.lang.Object[1];
                                a(bArr4[633], 458, bArr4[604], objArr4);
                                if (java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th)) {
                                    break;
                                }
                                objArr5 = new java.lang.Object[1];
                                a(bArr4[633], 458, bArr4[604], objArr5);
                                if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th)) {
                                    break;
                                }
                                i = 23;
                                if (i10 >= i) {
                                    break;
                                }
                                objArr6 = new java.lang.Object[1];
                                a(bArr4[633], 458, bArr4[604], objArr6);
                                if (java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th)) {
                                    break;
                                }
                                if (i10 >= 68) {
                                    break;
                                }
                                c = 633;
                                objArr7 = new java.lang.Object[1];
                                a(bArr4[633], 458, bArr4[604], objArr7);
                                if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th)) {
                                    break;
                                }
                                i2 = 131;
                                if (i10 < 128) {
                                }
                            }
                        } catch (java.lang.Throwable th11) {
                            th = th11;
                        }
                        try {
                            setclipchildren.IccPrivateKeyCrtComponentsJson = java.lang.Class.forName((java.lang.String) objArr9[0]).getDeclaredConstructor(char[].class).newInstance(objArr8);
                            setclipchildren.AlternateContactlessPaymentDataJson(1);
                            i9 = i10;
                            c2 = 633;
                        } catch (java.lang.Throwable th12) {
                            th = th12;
                            th = th;
                            byte[] bArr42 = getGpoResponse;
                            objArr2 = new java.lang.Object[1];
                            a(bArr42[633], 458, bArr42[604], objArr2);
                            if (java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            objArr3 = new java.lang.Object[1];
                            a(bArr42[633], 458, bArr42[604], objArr3);
                            if (java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th)) {
                            }
                            objArr4 = new java.lang.Object[1];
                            a(bArr42[633], 458, bArr42[604], objArr4);
                            if (java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th)) {
                            }
                            objArr5 = new java.lang.Object[1];
                            a(bArr42[633], 458, bArr42[604], objArr5);
                            if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th)) {
                            }
                            i = 23;
                            if (i10 >= i) {
                            }
                            objArr6 = new java.lang.Object[1];
                            a(bArr42[633], 458, bArr42[604], objArr6);
                            if (java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th)) {
                            }
                            if (i10 >= 68) {
                            }
                            c = 633;
                            objArr7 = new java.lang.Object[1];
                            a(bArr42[633], 458, bArr42[604], objArr7);
                            if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th)) {
                            }
                            i2 = 131;
                            if (i10 < 128) {
                            }
                        }
                        break;
                    case -34:
                        try {
                            setclipchildren.values = 1;
                            setclipchildren.AlternateContactlessPaymentDataJson(5);
                            setclipchildren.AlternateContactlessPaymentDataJson(6);
                            try {
                                java.lang.Object[] objArr23 = {(byte[]) setclipchildren.getProfileVersion};
                                byte[] bArr5 = getGpoResponse;
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                a(bArr5[1319], 500, bArr5[1473], objArr24);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr24[0]);
                                i6 = 1;
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                a(bArr5[1426], 466, bArr5[7], objArr25);
                                try {
                                    try {
                                        setclipchildren.IccPrivateKeyCrtComponentsJson = cls4.getMethod((java.lang.String) objArr25[0], byte[].class).invoke(null, objArr23);
                                        setclipchildren.AlternateContactlessPaymentDataJson(i6);
                                        i9 = i10;
                                        c2 = 633;
                                    } catch (java.lang.Throwable th13) {
                                        th = th13;
                                        th = th;
                                        byte[] bArr422 = getGpoResponse;
                                        objArr2 = new java.lang.Object[1];
                                        a(bArr422[633], 458, bArr422[604], objArr2);
                                        if (java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                                        }
                                        objArr3 = new java.lang.Object[1];
                                        a(bArr422[633], 458, bArr422[604], objArr3);
                                        if (java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th)) {
                                        }
                                        objArr4 = new java.lang.Object[1];
                                        a(bArr422[633], 458, bArr422[604], objArr4);
                                        if (java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th)) {
                                        }
                                        objArr5 = new java.lang.Object[1];
                                        a(bArr422[633], 458, bArr422[604], objArr5);
                                        if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th)) {
                                        }
                                        i = 23;
                                        if (i10 >= i) {
                                        }
                                        objArr6 = new java.lang.Object[1];
                                        a(bArr422[633], 458, bArr422[604], objArr6);
                                        if (java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th)) {
                                        }
                                        if (i10 >= 68) {
                                        }
                                        c = 633;
                                        objArr7 = new java.lang.Object[1];
                                        a(bArr422[633], 458, bArr422[604], objArr7);
                                        if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th)) {
                                        }
                                        i2 = 131;
                                        if (i10 < 128) {
                                        }
                                    }
                                } catch (java.lang.Throwable th14) {
                                    th = th14;
                                    java.lang.Throwable th15 = th;
                                    java.lang.Throwable cause4 = th15.getCause();
                                    if (cause4 != null) {
                                        throw cause4;
                                    }
                                    throw th15;
                                }
                            } catch (java.lang.Throwable th16) {
                                th = th16;
                            }
                        } catch (java.lang.Throwable th17) {
                            th = th17;
                        }
                        break;
                    case -33:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        setclipchildren.IccPrivateKeyCrtComponentsJson = (byte[]) setclipchildren.getProfileVersion;
                        i6 = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(i6);
                        i9 = i10;
                        c2 = 633;
                    case -32:
                        setclipchildren.IccPrivateKeyCrtComponentsJson = byte[].class;
                        i6 = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(i6);
                        i9 = i10;
                        c2 = 633;
                    case -31:
                        setclipchildren.IccPrivateKeyCrtComponentsJson = "\u008b\u0085\u0086\u008e\u008a\u0092";
                        i6 = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(i6);
                        i9 = i10;
                        c2 = 633;
                    case -30:
                        try {
                            setclipchildren.values = 4;
                            try {
                                setclipchildren.AlternateContactlessPaymentDataJson(5);
                                setclipchildren.AlternateContactlessPaymentDataJson(10);
                                int i11 = setclipchildren.AlternateContactlessPaymentDataJson;
                                setclipchildren.AlternateContactlessPaymentDataJson(10);
                                int i12 = setclipchildren.AlternateContactlessPaymentDataJson;
                                setclipchildren.AlternateContactlessPaymentDataJson(10);
                                int i13 = setclipchildren.AlternateContactlessPaymentDataJson;
                                setclipchildren.AlternateContactlessPaymentDataJson(10);
                                try {
                                    java.lang.Object[] objArr26 = new java.lang.Object[4];
                                    try {
                                        objArr26[3] = java.lang.Integer.valueOf(setclipchildren.AlternateContactlessPaymentDataJson);
                                        objArr26[2] = java.lang.Integer.valueOf(i13);
                                        objArr26[1] = java.lang.Integer.valueOf(i12);
                                        objArr26[0] = java.lang.Integer.valueOf(i11);
                                        byte[] bArr6 = getGpoResponse;
                                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                                        a((byte) (bArr6[569] - 1), 524, bArr6[501], objArr27);
                                        java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr27[0]);
                                        byte b5 = (byte) (bArr6[569] - 1);
                                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                                        a(b5, (short) (b5 | 450), bArr6[40], objArr28);
                                        try {
                                            try {
                                                setclipchildren.values = ((java.lang.Integer) cls5.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr26)).intValue();
                                                setclipchildren.AlternateContactlessPaymentDataJson(16);
                                                i9 = i10;
                                                c2 = 633;
                                            } catch (java.lang.Throwable th18) {
                                                th = th18;
                                                th = th;
                                                byte[] bArr4222 = getGpoResponse;
                                                objArr2 = new java.lang.Object[1];
                                                a(bArr4222[633], 458, bArr4222[604], objArr2);
                                                if (java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th) || i10 < 10 || i10 > 12) {
                                                    objArr3 = new java.lang.Object[1];
                                                    a(bArr4222[633], 458, bArr4222[604], objArr3);
                                                    if (java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th) || i10 < 12 || i10 > 18) {
                                                        objArr4 = new java.lang.Object[1];
                                                        a(bArr4222[633], 458, bArr4222[604], objArr4);
                                                        if (java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th) || i10 < 18 || i10 > 21) {
                                                            objArr5 = new java.lang.Object[1];
                                                            a(bArr4222[633], 458, bArr4222[604], objArr5);
                                                            if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th) && i10 >= 21) {
                                                                i = 23;
                                                                break;
                                                            } else {
                                                                i = 23;
                                                            }
                                                            if (i10 >= i || i10 > 51) {
                                                                objArr6 = new java.lang.Object[1];
                                                                a(bArr4222[633], 458, bArr4222[604], objArr6);
                                                                if (java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th) || i10 < 23 || i10 > 53) {
                                                                    if (i10 >= 68 || i10 > 95) {
                                                                        c = 633;
                                                                        objArr7 = new java.lang.Object[1];
                                                                        a(bArr4222[633], 458, bArr4222[604], objArr7);
                                                                        if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th) && i10 >= 127) {
                                                                            i2 = 131;
                                                                            break;
                                                                        } else {
                                                                            i2 = 131;
                                                                        }
                                                                        if (i10 < 128) {
                                                                            throw th;
                                                                        }
                                                                        if (i10 > i2) {
                                                                            throw th;
                                                                        }
                                                                        i3 = 119;
                                                                        setclipchildren.IccPrivateKeyCrtComponentsJson = th;
                                                                        setclipchildren.AlternateContactlessPaymentDataJson(30);
                                                                        c2 = c;
                                                                        i9 = i3;
                                                                    } else {
                                                                        i4 = 58;
                                                                    }
                                                                }
                                                            } else {
                                                                i4 = 12;
                                                            }
                                                            i3 = i4;
                                                            c = 633;
                                                            setclipchildren.IccPrivateKeyCrtComponentsJson = th;
                                                            setclipchildren.AlternateContactlessPaymentDataJson(30);
                                                            c2 = c;
                                                            i9 = i3;
                                                        }
                                                    }
                                                }
                                                c = 633;
                                                i3 = 53;
                                                setclipchildren.IccPrivateKeyCrtComponentsJson = th;
                                                setclipchildren.AlternateContactlessPaymentDataJson(30);
                                                c2 = c;
                                                i9 = i3;
                                            }
                                        } catch (java.lang.Throwable th19) {
                                            th = th19;
                                            java.lang.Throwable th20 = th;
                                            java.lang.Throwable cause5 = th20.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th20;
                                        }
                                    } catch (java.lang.Throwable th21) {
                                        th = th21;
                                    }
                                } catch (java.lang.Throwable th22) {
                                    th = th22;
                                }
                            } catch (java.lang.Throwable th23) {
                                th2 = th23;
                                th = th2;
                                byte[] bArr42222 = getGpoResponse;
                                objArr2 = new java.lang.Object[1];
                                a(bArr42222[633], 458, bArr42222[604], objArr2);
                                if (java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                                }
                                objArr3 = new java.lang.Object[1];
                                a(bArr42222[633], 458, bArr42222[604], objArr3);
                                if (java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th)) {
                                }
                                objArr4 = new java.lang.Object[1];
                                a(bArr42222[633], 458, bArr42222[604], objArr4);
                                if (java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th)) {
                                }
                                objArr5 = new java.lang.Object[1];
                                a(bArr42222[633], 458, bArr42222[604], objArr5);
                                if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th)) {
                                }
                                i = 23;
                                if (i10 >= i) {
                                }
                                objArr6 = new java.lang.Object[1];
                                a(bArr42222[633], 458, bArr42222[604], objArr6);
                                if (java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th)) {
                                }
                                if (i10 >= 68) {
                                }
                                c = 633;
                                objArr7 = new java.lang.Object[1];
                                a(bArr42222[633], 458, bArr42222[604], objArr7);
                                if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th)) {
                                }
                                i2 = 131;
                                if (i10 < 128) {
                                }
                            }
                        } catch (java.lang.Throwable th24) {
                            th = th24;
                        }
                        break;
                    case -29:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(10);
                        try {
                            java.lang.Object[] objArr29 = {java.lang.Character.valueOf((char) setclipchildren.AlternateContactlessPaymentDataJson)};
                            byte[] bArr7 = getGpoResponse;
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            a((byte) (bArr7[569] - 1), 560, (short) (-bArr7[725]), objArr30);
                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr30[0]);
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            a(bArr7[624], 532, bArr7[7], objArr31);
                            charValue = ((java.lang.Character) cls6.getMethod((java.lang.String) objArr31[0], java.lang.Character.TYPE).invoke(null, objArr29)).charValue();
                            setclipchildren.values = charValue;
                            setclipchildren.AlternateContactlessPaymentDataJson(16);
                            i9 = i10;
                            c2 = 633;
                        } catch (java.lang.Throwable th25) {
                            java.lang.Throwable cause6 = th25.getCause();
                            if (cause6 != null) {
                                throw cause6;
                            }
                            throw th25;
                        }
                    case -28:
                        i9 = 66;
                        c2 = 633;
                    case -27:
                        i9 = 64;
                        c2 = 633;
                    case -26:
                        setclipchildren.AlternateContactlessPaymentDataJson(7);
                        if (setclipchildren.AlternateContactlessPaymentDataJson == 0) {
                            i9 = 63;
                            c2 = 633;
                        }
                        i9 = i10;
                        c2 = 633;
                    case -25:
                        i9 = 68;
                        c2 = 633;
                    case -24:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.Object obj2 = setclipchildren.getProfileVersion;
                        try {
                            byte[] bArr8 = getGpoResponse;
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            a(bArr8[633], (short) (getCvrMaskAnd | 584), bArr8[468], objArr32);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr32[0]);
                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                            a((byte) (bArr8[569] - 1), 564, bArr8[6], objArr33);
                            invoke = cls7.getMethod((java.lang.String) objArr33[0], null).invoke(obj2, null);
                            setclipchildren.IccPrivateKeyCrtComponentsJson = invoke;
                            setclipchildren.AlternateContactlessPaymentDataJson(1);
                            i9 = i10;
                            c2 = 633;
                        } catch (java.lang.Throwable th26) {
                            java.lang.Throwable cause7 = th26.getCause();
                            if (cause7 != null) {
                                throw cause7;
                            }
                            throw th26;
                        }
                    case -23:
                        setclipchildren.AlternateContactlessPaymentDataJson(11);
                        return (java.lang.String) setclipchildren.getProfileVersion;
                    case -22:
                        i9 = 55;
                        c2 = 633;
                    case -21:
                        setclipchildren.values = 3;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.Object obj3 = setclipchildren.getProfileVersion;
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.Object obj4 = setclipchildren.getProfileVersion;
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        try {
                            java.lang.Object[] objArr34 = {obj4, setclipchildren.getProfileVersion};
                            byte[] bArr9 = getGpoResponse;
                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                            a(bArr9[c2], androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, bArr9[720], objArr35);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr35[0]);
                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                            a((byte) (bArr9[c2] - 1), com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_UNEXPECTED_ERROR, bArr9[48], objArr36);
                            java.lang.String str4 = (java.lang.String) objArr36[0];
                            java.lang.Object[] objArr37 = new java.lang.Object[1];
                            a(bArr9[c2], 1486, bArr9[32], objArr37);
                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                            a(bArr9[461], com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_TOKEN, bArr9[468], objArr38);
                            invoke = cls8.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr37[0]), java.lang.Class.forName((java.lang.String) objArr38[0])).invoke(obj3, objArr34);
                            setclipchildren.IccPrivateKeyCrtComponentsJson = invoke;
                            setclipchildren.AlternateContactlessPaymentDataJson(1);
                            i9 = i10;
                            c2 = 633;
                        } catch (java.lang.Throwable th27) {
                            java.lang.Throwable cause8 = th27.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th27;
                        }
                    case -20:
                        setclipchildren.values = 3;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.Class cls9 = (java.lang.Class) setclipchildren.getProfileVersion;
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.String str5 = (java.lang.String) setclipchildren.getProfileVersion;
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        invoke = cls9.getMethod(str5, (java.lang.Class[]) setclipchildren.getProfileVersion);
                        setclipchildren.IccPrivateKeyCrtComponentsJson = invoke;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i9 = i10;
                        c2 = 633;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        byte[] bArr10 = getGpoResponse;
                        java.lang.Object[] objArr39 = new java.lang.Object[1];
                        a(bArr10[c2], 1669, bArr10[32], objArr39);
                        invoke = java.lang.Class.forName((java.lang.String) objArr39[0]);
                        setclipchildren.IccPrivateKeyCrtComponentsJson = invoke;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i9 = i10;
                        c2 = 633;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(10);
                        setclipchildren.IccPrivateKeyCrtComponentsJson = new java.lang.Class[setclipchildren.AlternateContactlessPaymentDataJson];
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i9 = i10;
                        c2 = 633;
                    case -17:
                        invoke = "\u0086\u0087\u0091\u0082\u008b\u0085\u0091\u0090\u008b\u0086\u008e";
                        setclipchildren.IccPrivateKeyCrtComponentsJson = invoke;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i9 = i10;
                        c2 = 633;
                    case -16:
                        setclipchildren.values = 2;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(10);
                        int i14 = setclipchildren.AlternateContactlessPaymentDataJson;
                        setclipchildren.AlternateContactlessPaymentDataJson(10);
                        try {
                            java.lang.Object[] objArr40 = {java.lang.Integer.valueOf(i14), java.lang.Integer.valueOf(setclipchildren.AlternateContactlessPaymentDataJson)};
                            byte[] bArr11 = getGpoResponse;
                            java.lang.Object[] objArr41 = new java.lang.Object[1];
                            a((byte) (bArr11[569] - 1), 656, bArr11[1359], objArr41);
                            java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr41[0]);
                            byte b6 = (byte) (-bArr11[1374]);
                            java.lang.Object[] objArr42 = new java.lang.Object[1];
                            a(b6, (short) (b6 | 553), bArr11[26], objArr42);
                            charValue = ((java.lang.Integer) cls10.getMethod((java.lang.String) objArr42[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr40)).intValue();
                            setclipchildren.values = charValue;
                            setclipchildren.AlternateContactlessPaymentDataJson(16);
                            i9 = i10;
                            c2 = 633;
                        } catch (java.lang.Throwable th28) {
                            java.lang.Throwable cause9 = th28.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th28;
                        }
                    case -15:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        invoke = java.lang.Class.forName((java.lang.String) setclipchildren.getProfileVersion);
                        setclipchildren.IccPrivateKeyCrtComponentsJson = invoke;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i9 = i10;
                        c2 = 633;
                    case -14:
                        try {
                            setclipchildren.values = 4;
                            setclipchildren.AlternateContactlessPaymentDataJson(5);
                            setclipchildren.AlternateContactlessPaymentDataJson(10);
                            int i15 = setclipchildren.AlternateContactlessPaymentDataJson;
                            setclipchildren.AlternateContactlessPaymentDataJson(6);
                            int[] iArr2 = (int[]) setclipchildren.getProfileVersion;
                            setclipchildren.AlternateContactlessPaymentDataJson(6);
                            java.lang.String str6 = (java.lang.String) setclipchildren.getProfileVersion;
                            setclipchildren.AlternateContactlessPaymentDataJson(6);
                            java.lang.Object[] objArr43 = new java.lang.Object[1];
                            d(i15, iArr2, str6, (java.lang.String) setclipchildren.getProfileVersion, objArr43);
                            invoke = (java.lang.String) objArr43[0];
                            setclipchildren.IccPrivateKeyCrtComponentsJson = invoke;
                            setclipchildren.AlternateContactlessPaymentDataJson(1);
                            i9 = i10;
                            c2 = 633;
                        } catch (java.lang.Throwable th29) {
                            th2 = th29;
                            th = th2;
                            byte[] bArr422222 = getGpoResponse;
                            objArr2 = new java.lang.Object[1];
                            a(bArr422222[633], 458, bArr422222[604], objArr2);
                            if (java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            objArr3 = new java.lang.Object[1];
                            a(bArr422222[633], 458, bArr422222[604], objArr3);
                            if (java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th)) {
                            }
                            objArr4 = new java.lang.Object[1];
                            a(bArr422222[633], 458, bArr422222[604], objArr4);
                            if (java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th)) {
                            }
                            objArr5 = new java.lang.Object[1];
                            a(bArr422222[633], 458, bArr422222[604], objArr5);
                            if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th)) {
                            }
                            i = 23;
                            if (i10 >= i) {
                            }
                            objArr6 = new java.lang.Object[1];
                            a(bArr422222[633], 458, bArr422222[604], objArr6);
                            if (java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th)) {
                            }
                            if (i10 >= 68) {
                            }
                            c = 633;
                            objArr7 = new java.lang.Object[1];
                            a(bArr422222[633], 458, bArr422222[604], objArr7);
                            if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th)) {
                            }
                            i2 = 131;
                            if (i10 < 128) {
                            }
                        }
                        break;
                    case -13:
                        obj = "\u008b\u0085\u0086\u008e\u008a\u008f\u0086\u008e\u0082\u0085\u0085\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081";
                        setclipchildren.IccPrivateKeyCrtComponentsJson = obj;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i9 = i10;
                        c2 = 633;
                    case -12:
                        try {
                            byte b7 = (byte) (getGpoResponse[569] - 1);
                            java.lang.Object[] objArr44 = new java.lang.Object[1];
                            a(b7, (short) (b7 | 650), r3[1395], objArr44);
                            java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr44[0]);
                            java.lang.Object[] objArr45 = new java.lang.Object[1];
                            a(r3[624], 674, r3[468], objArr45);
                            setclipchildren.values = ((java.lang.Integer) cls11.getMethod((java.lang.String) objArr45[0], null).invoke(null, null)).intValue();
                            setclipchildren.AlternateContactlessPaymentDataJson(16);
                            i9 = i10;
                            c2 = 633;
                        } catch (java.lang.Throwable th30) {
                            java.lang.Throwable cause10 = th30.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th30;
                        }
                    case -11:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(10);
                        int i16 = setclipchildren.AlternateContactlessPaymentDataJson;
                        byte[] bArr12 = getGpoResponse;
                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                        a(bArr12[c2], 1486, bArr12[32], objArr46);
                        obj = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr46[0]), i16);
                        setclipchildren.IccPrivateKeyCrtComponentsJson = obj;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i9 = i10;
                        c2 = 633;
                    case -10:
                        setclipchildren.AlternateContactlessPaymentDataJson(11);
                        throw ((java.lang.Throwable) setclipchildren.getProfileVersion);
                    case -9:
                        i9 = 21;
                    case -8:
                        i9 = 18;
                    case -7:
                        setclipchildren.AlternateContactlessPaymentDataJson(7);
                        if (setclipchildren.AlternateContactlessPaymentDataJson == 0) {
                            i9 = 17;
                        } else {
                            i9 = i10;
                            c2 = 633;
                        }
                    case -6:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.Object obj5 = setclipchildren.getProfileVersion;
                        try {
                            byte[] bArr13 = getGpoResponse;
                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                            a(bArr13[c2], 728, bArr13[468], objArr47);
                            java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr47[0]);
                            java.lang.Object[] objArr48 = new java.lang.Object[1];
                            a(bArr13[624], 710, bArr13[4], objArr48);
                            obj = cls12.getMethod((java.lang.String) objArr48[0], null).invoke(obj5, null);
                            setclipchildren.IccPrivateKeyCrtComponentsJson = obj;
                            setclipchildren.AlternateContactlessPaymentDataJson(1);
                            i9 = i10;
                            c2 = 633;
                        } catch (java.lang.Throwable th31) {
                            java.lang.Throwable cause11 = th31.getCause();
                            if (cause11 != null) {
                                throw cause11;
                            }
                            throw th31;
                        }
                    case -5:
                        i9 = 103;
                    case -4:
                        obj = "SHA-256";
                        setclipchildren.IccPrivateKeyCrtComponentsJson = obj;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i9 = i10;
                        c2 = 633;
                    case -3:
                        setclipchildren.values = 2;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.Object obj6 = setclipchildren.getProfileVersion;
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        try {
                            java.lang.Object[] objArr49 = {(byte[]) setclipchildren.getProfileVersion};
                            byte[] bArr14 = getGpoResponse;
                            java.lang.Object[] objArr50 = new java.lang.Object[1];
                            a(bArr14[c2], (short) (getCvrMaskAnd | 584), bArr14[468], objArr50);
                            java.lang.Class<?> cls13 = java.lang.Class.forName((java.lang.String) objArr50[0]);
                            java.lang.Object[] objArr51 = new java.lang.Object[1];
                            a((byte) (bArr14[491] - 1), 730, bArr14[36], objArr51);
                            obj = cls13.getMethod((java.lang.String) objArr51[0], byte[].class).invoke(obj6, objArr49);
                            setclipchildren.IccPrivateKeyCrtComponentsJson = obj;
                            setclipchildren.AlternateContactlessPaymentDataJson(1);
                            i9 = i10;
                            c2 = 633;
                        } catch (java.lang.Throwable th32) {
                            java.lang.Throwable cause12 = th32.getCause();
                            if (cause12 != null) {
                                throw cause12;
                            }
                            throw th32;
                        }
                    case -2:
                        try {
                            setclipchildren.values = 1;
                            setclipchildren.AlternateContactlessPaymentDataJson(5);
                            setclipchildren.AlternateContactlessPaymentDataJson(6);
                            try {
                                java.lang.Object[] objArr52 = {(byte[]) setclipchildren.getProfileVersion};
                                byte[] bArr15 = getGpoResponse;
                                java.lang.Object[] objArr53 = new java.lang.Object[1];
                                a(bArr15[c2], (short) (getCvrMaskAnd | 584), bArr15[468], objArr53);
                                java.lang.Class<?> cls14 = java.lang.Class.forName((java.lang.String) objArr53[0]);
                                java.lang.Object[] objArr54 = new java.lang.Object[1];
                                a(bArr15[1370], 733, bArr15[40], objArr54);
                                obj = cls14.getMethod((java.lang.String) objArr54[0], byte[].class).invoke(null, objArr52);
                                setclipchildren.IccPrivateKeyCrtComponentsJson = obj;
                                setclipchildren.AlternateContactlessPaymentDataJson(1);
                                i9 = i10;
                                c2 = 633;
                            } catch (java.lang.Throwable th33) {
                                java.lang.Throwable cause13 = th33.getCause();
                                if (cause13 != null) {
                                    throw cause13;
                                }
                                throw th33;
                            }
                        } catch (java.lang.Throwable th34) {
                            th = th34;
                            byte[] bArr4222222 = getGpoResponse;
                            objArr2 = new java.lang.Object[1];
                            a(bArr4222222[633], 458, bArr4222222[604], objArr2);
                            if (java.lang.Class.forName((java.lang.String) objArr2[0]).isInstance(th)) {
                            }
                            objArr3 = new java.lang.Object[1];
                            a(bArr4222222[633], 458, bArr4222222[604], objArr3);
                            if (java.lang.Class.forName((java.lang.String) objArr3[0]).isInstance(th)) {
                            }
                            objArr4 = new java.lang.Object[1];
                            a(bArr4222222[633], 458, bArr4222222[604], objArr4);
                            if (java.lang.Class.forName((java.lang.String) objArr4[0]).isInstance(th)) {
                            }
                            objArr5 = new java.lang.Object[1];
                            a(bArr4222222[633], 458, bArr4222222[604], objArr5);
                            if (!java.lang.Class.forName((java.lang.String) objArr5[0]).isInstance(th)) {
                            }
                            i = 23;
                            if (i10 >= i) {
                            }
                            objArr6 = new java.lang.Object[1];
                            a(bArr4222222[633], 458, bArr4222222[604], objArr6);
                            if (java.lang.Class.forName((java.lang.String) objArr6[0]).isInstance(th)) {
                            }
                            if (i10 >= 68) {
                            }
                            c = 633;
                            objArr7 = new java.lang.Object[1];
                            a(bArr4222222[633], 458, bArr4222222[604], objArr7);
                            if (!java.lang.Class.forName((java.lang.String) objArr7[0]).isInstance(th)) {
                            }
                            i2 = 131;
                            if (i10 < 128) {
                            }
                        }
                        break;
                    case -1:
                        i9 = 99;
                    default:
                        i9 = i10;
                        c2 = 633;
                }
            }
        } catch (java.lang.Throwable th35) {
            java.lang.Throwable cause14 = th35.getCause();
            if (cause14 != null) {
                throw cause14;
            }
            throw th35;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5 = 2066 - i2;
        int i6 = i + 44;
        byte[] bArr = getGpoResponse;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i7 = i5;
            i6 = i3;
            int i8 = 0;
            i6 = (i6 + i5) - 3;
            i5 = i7 + 1;
            i4 = i8;
            bArr2[i4] = (byte) i6;
            if (i4 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i4 + 1;
            i7 = i5;
            i5 = bArr[i5];
            i8 = i9;
            i6 = (i6 + i5) - 3;
            i5 = i7 + 1;
            i4 = i8;
            bArr2[i4] = (byte) i6;
            if (i4 == i3) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i6;
            if (i4 == i3) {
            }
        }
    }

    static void getAid() {
        byte[] bArr = new byte[2098];
        java.lang.System.arraycopy("\u0000Å,ø\u0007þ\u0004\bý\u0004\tü\u0004\nû\u0004\u000bú\u0004\fù\nü\u000bû\u0004\rø\u0004\u000e÷\u0004\u000fö\u0004\u0007\u0002ÿ\u0004\u0007\u0003þ\u0004\u0007\u0004ý\u0004\u0007\u0005ü\u0004\u0007\u0006û\u0004\u0007\u0007ú\u0004\bý\u0004\u0007\bù\u0004\u0007\u0003þ\u0004\u0007\tø\u0004\u0007\n÷\u0004\u0007\u0002ÿ\u0004\u0007\u0006û\u0004\bý\u0004\u0007\u000bö\u0004\b\u0001ÿ\u0004\b\u0002þ\u0004\b\u0003ý\u0004\u0007\u0002ÿ\u0004\b\u0002þ\u000f÷\u0004\b\u0004ü\u0010ö\u0004\b\u0005û\u000bû\u0004\b\u0006ú\u0004\bý\u000f÷\u0004\b\u0007ù\u0004\b\bø\u0004\bý\u0004\b\t÷\b\u0004ý\b\u0004ý\b\u0005ü\b\u0006û\u0004\b\nö\b\u0004ý\b\u0007ú\b\u0006û\u0004\t\u0000ÿ\u0004\t\u0001þ\b\tø\b\n÷\b\u000bö\b\u0005ü\u0004\t\u0002ý\b\u0007ú\u0004\t\u0003ü\u0004\t\u0004û\u0004\t\u0005ú\t\u0002þ\t\u0003ý\u0004\t\u0000ÿ\u0004\t\u0001þ\t\u0004ü\t\u0005û\t\u0006ú\u0004\t\u0002ý\b\u0004ý\b\u0005ü\u0004\t\u0006ù\u0004\t\u0007ø\u0004\t\b÷\u0004\t\tö\u0004\fù\nü\u000bû\u0004\rø\u0004\u000e÷\u0004\u000fö\u0004\u0007\u0002ÿ\u0004\u0007\u0003þ\t\u0007ù\u0004\nÿÿ\b\u0006û\u0004\n\u0000þ\u0004\u0007\u0005ü\u0004\u0007\u0006û\u0004\t\u0001þ\t\bø\t\u0006ú\u0004\t\u0002ý\b\u0007ú\u0004\n\u0001ý\u0004\n\u0002ü\u0004\n\u0003û\u0004\t\tö\u0004\b\u0003ý\u0004\u0007\u0002ÿ\t\u0007ù\u0004\nÿÿ\b\u0006û\u0004\b\u0002þ\u0004\n\u0004ú\t\nö\u0004\n\u0005ù\u0010ö\u0004\n\u0005ù\u0004\n\u0006ø\t\nö\u0004\n\u0007÷\u0010ö\u0004\n\u0007ú\u0018îÐAø\u0010üÊ($\u0001ú\bü\u0000ÿ\u0000\u000eú\u0018îÐAø\u0010üÊ\u001e(\tô\u0005\u0001\u0010î\u000e\fóí\u001a\b\tå\u000e\u000e\fó\u0010ù\u0011\u0000ýþÍ8\u000f\u0002\tô\f\t½\u0018/\u0002\tô\u0016ÿ\u0001\u0012Ò/\u0002\tô\f\tá\u0016\u0011ÿ\u0000\rò\u0010\u0010ù\u0011\u0000ýþÍE\u0005\u0000\nöþ\u0004\u0010¿(\u0015\u0012\u0003ø\bü\u000f´2\u0015\u0001\u0015\u0000ö\u0001\u0012â$\u0001ú\bü\u0010ù\u0011\u0000ýþÍ8\u000f\u0002\tô\f\t½\u0018/\u0002\tô\f\tá\u0016\u0011ÿ\u0000\rò\u0010ú\u0018îÐAø\u0010üÊ($\u0001ú\büÞ6÷\u0006û\u0004\u0010\u0012\u0003ø\fùú\u0018îÐAø\u0010üÊ$\u0016\u000bþ\u0001\u0014\u0001\u0012â\u0018ü\u0014ö\u0002ï%ö\u0004\u0002\u0010ö\fø\u0005\u0011\u000f\u0001Ä<\u000b\u0003û\büÌ;\u0006\fö\u0000\u0002\u0015õÌ>\b\b\u0004ð\u000e\u0003ø\u0016ø\t\u0002\b¾\u001b&\fö\u0000\u0002\u0015õç(\b\u0004ð\u000e\u0003ø\u0016ø\t\u0002\b\u0001\u0012Ø(\b\u0004ð\u0010ø\u0005\u0001\u0012Ø\u001eú\u0018îÐJ\u0002ø\u0006Å8\u000f\u0002ø\u0015\u0000\u0003ö\f\t½\u001a6ð\u0001\u0015\u0002þ\u0006\u0004ú\u0015ß\u0019\bü\büò\u0017\röÿ\u0006ä6ð\u0001\u0015\u0002þ\u0006ú\u0018îÐJ\u0002ø\u0006Å8\u000f\u0002ø\u0015\u0000\u0003ö\f\t½\u001a6ð\u0001\u0015\u0002þ\u0006ä\u0015\u0010\u0007öý\u0005\u0016ð\u0001\u0015\u0002ôú\u0018îÐAø\u0010üÊ'&ü\u0003ö\u0004\rüú\u0018îÐAø\u0010üÊ)\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tã\u0017\röÿ\u0006\b\tô\u0010\u0003\u0006þ\u0007ø\u0010\u0002ó\u000e\u000bú\u0007þ\u000f÷\n\u0001þ\n\u0002ý\u0004\bý\nü\n\u0003ü\u000f÷\u0004\tü\b\u0006û\u0004\nû\u0004\u000bú\nü\u0004\fù\nü\u0004\rø\u0004\u000e÷\u0004\u000fö\n\u0004û\b\u0006û\u0004\u0007\u0002ÿ\b\u0006û\u0004\u0007\u0002ÿ\t\nö\u0004\u0007\u0003þ\n\u0005ú\n\u0006ù\n\u0007ø\u0004\u0007\u0004ý\n\b÷\t\u0005û\n\tö\u0004\u0007\u0005ü\u0004\u0007\u0006û\u0004\u0007\u0007ú\u000bÿÿ\u0010ö\u0010ö\u0004\u0007\bù\u000b\u0000þ\u0004\u0007\tø\u0004\u0007\u0006û\t\nö\u0004\u0007\n÷\nü\u0010ö\u0004\u0007\u000bö\u000b\u0001ý\u0004\b\u0001ÿ\u000b\u0002ü\u0004\b\u0002þ\u000bû\u0004\b\u0003ý\u000b\u0003û\u0004\b\u0004ü\u000b\u0004ú\u0004\b\u0005û\u0004\b\u0006ú\nü\u0004\fù\nü\u0004\b\u0007ù\u0004\b\bø\u0004\b\t÷\u000b\u0005ù\u0004\u0007\u0002ÿ\b\u0006û\u0004\u0007\u0002ÿ\t\nö\u0004\u0007\u0003þ\n\u0005ú\n\u0006ù\u000b\u0006ø\u0004\b\nö\u000b\u0007÷\t\u0007ù\u0004\u0007\u0005ü\u0004\u0007\u0006û\u0004\u0007\u0007ú\u000b\bö\fþÿ\u0004\t\u0000ÿ\u000b\u0000þ\u0004\t\u0001þ\u0004\u0007\u0006û\t\nö\u0004\u0007\n÷\fÿþ\u0004\t\u0002ý\u000b\u0001ý\u0004\b\u0001ÿ\f\u0000ý\b\u0006û\u0004\b\u0002þ\u0004\t\u0003ü\f\u0001ü\u0004\t\u0004û\u0004\t\u0005ú\u0004\t\u0006ù\b\u0004ý\b\u0007ú\b\u0006û\u0004\t\u0007ø\b\u0004ý\b\u0004ý\f\u0002û\u0004\t\b÷\f\u0003ú\u0004\b\u0004ü\u0004\t\tö\f\u0004ù\b\n÷\b\u000bö\b\u0005ü\u0004\nÿÿ\b\u0007ú\u0004\n\u0000þ\u0004\n\u0001ý\u0004\n\u0002ü\u0004\u0007\u0002ÿ\f\u0006÷\u0004\bý\nü\n\u0003ü\u000f÷\u0004\tü\b\u0006û\u0004\nû\f\u0007ö\rýÿ\u0004\u000bú\u0004\n\u0003û\rþþ\rÿý\b\u000bö\b\u0005ü\u0004\n\u0004ú\b\u0007ú\u0004\n\u0005ù\u0004\n\u0006ø\u0004\n\u0007÷\u0004\n\u0007÷\u0004\n\bö\r\u0000ü\u0004\u000bþÿ\r\u0001û\u0004\u000bþú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010þò\u0012\b\u0002ú\u0018îÐAø\u0010üÊ)\u0017\r\u0000\u000bí\u0004\rü\u0001\u0012Ò!\u0017\u0001õ\u0010ù\u0011\u0000ýþÍKöÿ\u0015º+\u0016ÿ\u0015Ï/\u0002û\u0006\u0001\u0011\u0000ò\u0016ø\t\u0002\u0001\u0012Ú\u001d\u0017Ü\u0016\u000eøÿ\u0016ã\u0018\u0007û\r\t\u0002\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾9\u0011ò\u0019í\u0004\rüÌ\u00191ò\u0019í\u0004\rüö\u0011ÿ\u0000\ròí$ô\u0005\t\u000e\bú\u0018îÐAø\u0010üÊGö\u0004\tü\u0001\u0014½\"\u001b\u0012÷\nø\b\u000büÿýô!ú\u0018îÐAø\u0010üÊ$\u0016\u000bþ\u0001\u0014Ê\u0014\u0003ò\u001b\u0010ù\u0011\u0000ýþÍIô\u0016ÿ½\u00160ù\u0011\u0000ýþâ(ü\u0014ò\u0005\u0014ô\u0010\u0001\u0012Ü\u001f\f\u0003\u0000\u0006\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾\u0018/\u0000\u0006\u0006\u0014øþ\u0006øÊ6\u0012ô\u0005\b\u0000Ì8\u000f\u0001\u0003\u0005\u0002\b¾8\u000fø\u0004\u0001Î7\n\bö\u0014\n¸\u001d \u0016\fø\u000fø\u0004æ \u0016ú\u0018îÐHõ\u0001\u0015\u0000ú\u000e\b¸#$ç%ñ\bÜ.þ\u000b\u0006ú\u000e÷\bÛ6î\u0005\u000e\u0007ø\t\u0002\u0007þ\u0004\bý\u0004\tü\u0004\nû\b\u0004ý\b\u0004ý\b\u0005ü\b\u0006û\u0004\u000bú\f\u0003ú\u0004\fù\u0004\rø\r\u0002ú\t\u0005û\t\u0006ú\u0004\u000e÷\b\u0007ú\u0004\u000fö\u0004\u0007\u0002ÿ\u0004\u0007\u0003þ\u0004\u0007\u0003þ\u0004\rø\r\u0003ù\r\u0004ø\b\u0005ü\u0004\u000e÷\b\u0007ú\u0004\u0007\u0004ý\u0004\u0007\u0005ü\u0004\u0007\u0006û\u0004\u0007\u0006ú\u0018îÐJ\u0002ø\u0006Å!&÷\u0001\u000eü\u0001\u0012Ó$\u0004þ\u0017ú\u000b\u0007þ\u0004\bý\r\u0006ö\u0004\tü\u000eüÿ\u0004\nû\u0004\u000bú\u0004\fù\u0004\rø\u000eýþ\u0004\u000e÷\u0004\u000fö\u0004\u0007\u0002ÿ\u000f÷\u0004\u0007\u0003þ\u0004\u0007\u0004ý\u0004\u0007\u0005ü\u000eþý\b\u0006û\u0004\u0007\u0006û\f\u0003ú\u0004\u0007\u0007ú\u0004\u0007\bù\u000eÿü\b\u000bö\b\u0005ü\u0004\u0007\tø\b\u0007ú\u0004\u0007\n÷\u0004\u0007\u000bö\u0004\b\u0001ÿ\u0004\b\u0001\u0010ù\u0011\u0000ýþÍLõþ\u0006\u0001\u0012½\u001a6ûô\u0010ù\u0000\u0004\rüê \r\u0004å\u0016ÿ\u0015\u0001\u0012ß\u0014\u0005\u000bý\u0002ï\"\u0007ù\u000eø\t\u0002Ü.\u0000\tþ\b\tô\u0010ÿú\u0018îÐIô\u0016ÿ½(\u0019\u0007\u0006ÿüâ \u0016ôä,\u0006þ÷\u0016ú\u0018îÐJ\u0002ø\u0006Å)\u0018\u0007ûø\u0018\u0002ú\u0001\u0012ã\u0018\u0007ûø\u0018\u0002úú\u0018îÐIô\u0016ÿ½\u0019 \u0016ôä,\u0006þ÷\u0016õ\u0012ã\u0018\u0007ûø\u0018\u0002úú\u0018îÐJ\u0002ø\u0006Å\u0019 \u0016ô\f\u0006þ÷\u0016\u000f\u0001Ä<\u000b\u0003û\büÌ6\u0010ù\u0011\u0000ýþÍ<\t\t¾Ið\u0015û\u000b¾)\u0010\u0015û\u000b\u0019í\u000b\u000e\u000f\u0001Ä<\u000b\u0003û\büÌ6\u0010ù\u0011\u0000ýþÍ<\t\t¾Ið\u0015û\u000b¾)\u0010\u0015û".getBytes("ISO-8859-1"), 0, bArr, 0, 2098);
        getGpoResponse = bArr;
        getCvrMaskAnd = 167;
    }

    static void AlternateContactlessPaymentDataJson() {
        SdkCoreAlternateContactlessPaymentDataImpl = new char[]{10949, 10954, 10961, 10777, 10972, 10958, 10956, 10974, 10973, 10946, 10975, 10962, 10982, 10944, 10991, 10978, 10969, 10959};
        getAid = -143185365;
        IccPrivateKeyCrtComponentsJson = true;
        getProfileVersion = true;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid();
        getCiacDecline = 0;
        getPaymentFci = 1;
        AlternateContactlessPaymentDataJson();
        writeReplace = (char) 60121;
        values = (char) 21292;
        AlternateContactlessPaymentDataJson = (char) 40271;
        RecordsJson = (char) 32473;
    }

    static java.lang.String DigitizedCardProfile() {
        java.lang.Object invoke;
        java.lang.Object obj;
        com.payair.hce.setClipChildren setclipchildren = new com.payair.hce.setClipChildren();
        byte[] bArr = getGpoResponse;
        byte b = bArr[94];
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, (short) (b | 298), 105, objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        byte b2 = bArr[0];
        byte b3 = b2;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(b3, (short) (b3 | 1669), b2, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c = ' ';
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            int i = 1669;
            a(bArr[633], 1669, bArr[32], objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(bArr[1465], 1654, bArr[6], objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(bArr[633], 1669, bArr[32], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i2 = 0;
            while (i2 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i2]};
                byte[] bArr2 = getGpoResponse;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a(bArr2[633], 1650, bArr2[118], objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(bArr2[686], 1634, bArr2[52], objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                byte b4 = bArr2[633];
                short s = bArr2[c];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(b4, 1669, s, objArr11);
                java.lang.Object invoke2 = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(bArr2[633], 1650, bArr2[118], objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                byte b5 = (byte) (bArr2[633] - 1);
                short s2 = bArr2[4];
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a(b5, 1628, s2, objArr13);
                iArr[i2] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke2, null)).intValue();
                i2++;
                c = ' ';
            }
            int i3 = 0;
            while (true) {
                switch (setclipchildren.AlternateContactlessPaymentDataJson(iArr[i3])) {
                    case -20:
                        i3 = 20;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        i3 = 31;
                        i = 1669;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        setclipchildren.AlternateContactlessPaymentDataJson(20);
                        if (setclipchildren.AlternateContactlessPaymentDataJson == 0) {
                            i3 = 30;
                            i = 1669;
                        }
                        i3++;
                        i = 1669;
                    case -17:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(10);
                        getPaymentFci = setclipchildren.AlternateContactlessPaymentDataJson;
                        i3++;
                        i = 1669;
                    case -16:
                        setclipchildren.values = getCiacDecline;
                        setclipchildren.AlternateContactlessPaymentDataJson(16);
                        i3++;
                        i = 1669;
                    case -15:
                        setclipchildren.AlternateContactlessPaymentDataJson(11);
                        return (java.lang.String) setclipchildren.getProfileVersion;
                    case -14:
                        i3 = 1;
                    case -13:
                        i3 = 22;
                        i = 1669;
                    case -12:
                        setclipchildren.values = 2;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.Object obj2 = setclipchildren.getProfileVersion;
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.Object[] objArr14 = {setclipchildren.getProfileVersion};
                        byte[] bArr3 = getGpoResponse;
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        a(bArr3[633], 84, bArr3[1424], objArr15);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                        byte b6 = bArr3[1324];
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        a(b6, (short) (b6 & 239), bArr3[48], objArr16);
                        java.lang.String str4 = (java.lang.String) objArr16[0];
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        a(bArr3[633], bArr3[1590], bArr3[26], objArr17);
                        invoke = cls4.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr17[0])).invoke(obj2, objArr14);
                        setclipchildren.IccPrivateKeyCrtComponentsJson = invoke;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i3++;
                        i = 1669;
                    case -11:
                        byte[] bArr4 = getGpoResponse;
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        a(bArr4[633], bArr4[1590], bArr4[26], objArr18);
                        invoke = java.lang.Class.forName((java.lang.String) objArr18[0]).getDeclaredConstructor(null).newInstance(null);
                        setclipchildren.IccPrivateKeyCrtComponentsJson = invoke;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i3++;
                        i = 1669;
                    case -10:
                        setclipchildren.values = 2;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.Object obj3 = setclipchildren.getProfileVersion;
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.Object[] objArr19 = {setclipchildren.getProfileVersion};
                        byte[] bArr5 = getGpoResponse;
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        a(bArr5[633], 84, bArr5[1424], objArr20);
                        java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr20[0]);
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        a(bArr5[1465], bArr5[401], bArr5[13], objArr21);
                        java.lang.String str5 = (java.lang.String) objArr21[0];
                        byte b7 = bArr5[633];
                        short s3 = bArr5[447];
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        a(b7, 111, s3, objArr22);
                        cls5.getMethod(str5, java.lang.Class.forName((java.lang.String) objArr22[0])).invoke(obj3, objArr19);
                        i3++;
                        i = 1669;
                    case -9:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.Object[] objArr23 = {setclipchildren.getProfileVersion};
                        byte[] bArr6 = getGpoResponse;
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        a(bArr6[633], 111, bArr6[447], objArr24);
                        java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr24[0]);
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        a(bArr6[624], 94, bArr6[13], objArr25);
                        java.lang.String str6 = (java.lang.String) objArr25[0];
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        a(bArr6[633], i, bArr6[32], objArr26);
                        invoke = cls6.getMethod(str6, java.lang.Class.forName((java.lang.String) objArr26[0])).invoke(null, objArr23);
                        setclipchildren.IccPrivateKeyCrtComponentsJson = invoke;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i3++;
                        i = 1669;
                    case -8:
                        obj = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC;
                        setclipchildren.IccPrivateKeyCrtComponentsJson = obj;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i3++;
                        i = 1669;
                    case -7:
                        setclipchildren.values = 2;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.Object obj4 = setclipchildren.getProfileVersion;
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.Object[] objArr27 = {obj4, setclipchildren.getProfileVersion};
                        byte[] bArr7 = getGpoResponse;
                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                        a(bArr7[633], 136, bArr7[714], objArr28);
                        java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr28[0]);
                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                        a(bArr7[633], i, bArr7[32], objArr29);
                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                        a(bArr7[633], 323, bArr7[32], objArr30);
                        obj = cls7.getDeclaredConstructor(java.lang.Class.forName((java.lang.String) objArr29[0]), java.lang.Class.forName((java.lang.String) objArr30[0])).newInstance(objArr27);
                        setclipchildren.IccPrivateKeyCrtComponentsJson = obj;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i3++;
                        i = 1669;
                    case -6:
                        byte[] bArr8 = getGpoResponse;
                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                        a(bArr8[633], 323, bArr8[32], objArr31);
                        java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr31[0]);
                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                        a(bArr8[624], 308, bArr8[10], objArr32);
                        obj = cls8.getMethod((java.lang.String) objArr32[0], null).invoke(null, null);
                        setclipchildren.IccPrivateKeyCrtComponentsJson = obj;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i3++;
                        i = 1669;
                    case -5:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.Object obj5 = setclipchildren.getProfileVersion;
                        byte[] bArr9 = getGpoResponse;
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        a(bArr9[633], i, bArr9[32], objArr33);
                        java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr33[0]);
                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                        a((byte) (bArr9[633] - 1), 141, bArr9[48], objArr34);
                        obj = cls9.getMethod((java.lang.String) objArr34[0], null).invoke(obj5, null);
                        setclipchildren.IccPrivateKeyCrtComponentsJson = obj;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i3++;
                        i = 1669;
                    case -4:
                        setclipchildren.values = 2;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.String str7 = (java.lang.String) setclipchildren.getProfileVersion;
                        setclipchildren.AlternateContactlessPaymentDataJson(10);
                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                        b(str7, setclipchildren.AlternateContactlessPaymentDataJson, objArr35);
                        obj = (java.lang.String) objArr35[0];
                        setclipchildren.IccPrivateKeyCrtComponentsJson = obj;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i3++;
                        i = 1669;
                    case -3:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(68);
                        java.lang.Object[] objArr36 = {java.lang.Long.valueOf(setclipchildren.valueOf)};
                        java.lang.Object[] objArr37 = new java.lang.Object[1];
                        a((byte) (getGpoResponse[569] - 1), com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, r6[1598], objArr37);
                        java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr37[0]);
                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                        a(r6[624], (short) (getCvrMaskAnd - 5), r6[501], objArr38);
                        setclipchildren.values = ((java.lang.Integer) cls10.getMethod((java.lang.String) objArr38[0], java.lang.Long.TYPE).invoke(null, objArr36)).intValue();
                        setclipchildren.AlternateContactlessPaymentDataJson(16);
                        i3++;
                        i = 1669;
                    case -2:
                        obj = "랟埪랟埪㫳⻂ᾯር뿁㤂\ue747т疒炜谯ﵱ䨞改\ue877꽖\uab6d㶹ἡ९";
                        setclipchildren.IccPrivateKeyCrtComponentsJson = obj;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i3++;
                        i = 1669;
                    case -1:
                        i3 = 17;
                    default:
                        i3++;
                        i = 1669;
                }
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static java.lang.String valueOf() {
        com.payair.hce.setClipChildren setclipchildren = new com.payair.hce.setClipChildren();
        byte[] bArr = getGpoResponse;
        byte b = bArr[94];
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, (short) (b | 420), 98, objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        byte b2 = bArr[0];
        byte b3 = b2;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(b3, (short) (b3 | 1669), b2, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c = ' ';
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(bArr[633], 1669, bArr[32], objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(bArr[1465], 1654, bArr[6], objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(bArr[633], 1669, bArr[32], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i = 0;
            while (i < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i]};
                byte[] bArr2 = getGpoResponse;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a(bArr2[633], 1650, bArr2[118], objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(bArr2[686], 1634, bArr2[52], objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                byte b4 = bArr2[633];
                short s = bArr2[c];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(b4, 1669, s, objArr11);
                java.lang.Object invoke = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(bArr2[633], 1650, bArr2[118], objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a((byte) (bArr2[633] - 1), 1628, bArr2[4], objArr13);
                iArr[i] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i++;
                c = ' ';
            }
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                switch (setclipchildren.AlternateContactlessPaymentDataJson(iArr[i2])) {
                    case -14:
                        i3 = 9;
                        i2 = i3;
                    case -13:
                        i3 = 30;
                        i2 = i3;
                    case -12:
                        setclipchildren.AlternateContactlessPaymentDataJson(20);
                        if (setclipchildren.AlternateContactlessPaymentDataJson == 0) {
                            i3 = 29;
                        }
                        i2 = i3;
                    case -11:
                        i2 = 1;
                    case -10:
                        i2 = 20;
                    case -9:
                        setclipchildren.AlternateContactlessPaymentDataJson(20);
                        if (setclipchildren.AlternateContactlessPaymentDataJson == 0) {
                            i3 = 19;
                        }
                        i2 = i3;
                    case -8:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(10);
                        getPaymentFci = setclipchildren.AlternateContactlessPaymentDataJson;
                        i2 = i3;
                    case -7:
                        setclipchildren.values = getCiacDecline;
                        setclipchildren.AlternateContactlessPaymentDataJson(16);
                        i2 = i3;
                    case -6:
                        setclipchildren.AlternateContactlessPaymentDataJson(11);
                        return (java.lang.String) setclipchildren.getProfileVersion;
                    case -5:
                        i2 = 11;
                    case -4:
                        i3 = 21;
                        i2 = i3;
                    case -3:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        setclipchildren.IccPrivateKeyCrtComponentsJson = setclipchildren.getProfileVersion.toString();
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i2 = i3;
                    case -2:
                        byte[] bArr3 = getGpoResponse;
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a(bArr3[633], 323, bArr3[32], objArr14);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        a(bArr3[624], 308, bArr3[10], objArr15);
                        setclipchildren.IccPrivateKeyCrtComponentsJson = cls4.getMethod((java.lang.String) objArr15[0], null).invoke(null, null);
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i2 = i3;
                    case -1:
                        i2 = 4;
                    default:
                        i2 = i3;
                }
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void init$0() {
        $$a = new byte[]{73, 117, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 43};
        $$b = 231;
    }

    static java.lang.String valueOf(byte[] bArr) {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{bArr}, 1994160305, -1994160305, (int) java.lang.System.currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0597 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static java.lang.String writeReplace() {
        java.lang.Object newInstance;
        java.lang.Object invoke;
        com.payair.hce.setClipChildren setclipchildren = new com.payair.hce.setClipChildren();
        byte[] bArr = getGpoResponse;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(bArr[94], 2062, 393, objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        byte b = bArr[0];
        byte b2 = b;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(b2, (short) (b2 | 1669), b, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c = ' ';
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(bArr[633], 1669, bArr[32], objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(bArr[1465], 1654, bArr[6], objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(bArr[633], 1669, bArr[32], objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i = 0;
            while (i < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i]};
                byte[] bArr2 = getGpoResponse;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a(bArr2[633], 1650, bArr2[118], objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a(bArr2[686], 1634, bArr2[52], objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                byte b3 = bArr2[633];
                short s = bArr2[c];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a(b3, 1669, s, objArr11);
                java.lang.Object invoke2 = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a(bArr2[633], 1650, bArr2[118], objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a((byte) (bArr2[633] - 1), 1628, bArr2[4], objArr13);
                iArr[i] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke2, null)).intValue();
                i++;
                c = ' ';
            }
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                try {
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (i3 < 84) {
                    }
                    if (i3 < 101) {
                    }
                    throw th;
                }
                switch (setclipchildren.AlternateContactlessPaymentDataJson(iArr[i2])) {
                    case -48:
                        i2 = 110;
                    case -47:
                        setclipchildren.AlternateContactlessPaymentDataJson(28);
                        int i4 = setclipchildren.AlternateContactlessPaymentDataJson;
                        if (i4 == 0 || i4 != 1) {
                            i2 = 65;
                        }
                        i2 = 41;
                    case -46:
                        i2 = 105;
                    case -45:
                        setclipchildren.AlternateContactlessPaymentDataJson(28);
                        int i5 = setclipchildren.AlternateContactlessPaymentDataJson;
                        i2 = (i5 == 0 || i5 != 1) ? 62 : 48;
                    case -44:
                        i2 = 28;
                    case -43:
                        i2 = 99;
                    case -42:
                        setclipchildren.AlternateContactlessPaymentDataJson(20);
                        if (setclipchildren.AlternateContactlessPaymentDataJson == 0) {
                            i2 = 97;
                        }
                        i2 = i3;
                    case -41:
                        try {
                            setclipchildren.AlternateContactlessPaymentDataJson(7);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i3 < 84 && i3 <= 90) {
                                i3 = 75;
                            } else {
                                if (i3 < 101 || i3 > 105) {
                                    throw th;
                                }
                                i3 = 98;
                            }
                            setclipchildren.IccPrivateKeyCrtComponentsJson = th;
                            setclipchildren.AlternateContactlessPaymentDataJson(30);
                            i2 = i3;
                        }
                        if (setclipchildren.AlternateContactlessPaymentDataJson == 0) {
                            i2 = 89;
                        }
                        i2 = i3;
                        break;
                    case -40:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        try {
                            setclipchildren.AlternateContactlessPaymentDataJson(6);
                            setclipchildren.values = setclipchildren.getProfileVersion.hashCode();
                            setclipchildren.AlternateContactlessPaymentDataJson(16);
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            if (i3 < 84) {
                                break;
                            }
                            if (i3 < 101) {
                                break;
                            }
                            throw th;
                        }
                        i2 = i3;
                    case -39:
                        setclipchildren.AlternateContactlessPaymentDataJson(11);
                        throw ((java.lang.Throwable) setclipchildren.getProfileVersion);
                    case -38:
                        i2 = 5;
                    case -37:
                        i2 = 76;
                    case -36:
                        setclipchildren.AlternateContactlessPaymentDataJson(20);
                        if (setclipchildren.AlternateContactlessPaymentDataJson == 0) {
                            i2 = 74;
                        }
                        i2 = i3;
                    case -35:
                        i2 = 106;
                    case -34:
                        i2 = 108;
                    case -33:
                        setclipchildren.AlternateContactlessPaymentDataJson(20);
                        if (setclipchildren.AlternateContactlessPaymentDataJson == 0) {
                            i2 = 61;
                        }
                        i2 = i3;
                    case -32:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(10);
                        getPaymentFci = setclipchildren.AlternateContactlessPaymentDataJson;
                        i2 = i3;
                    case -31:
                        setclipchildren.values = getCiacDecline;
                        setclipchildren.AlternateContactlessPaymentDataJson(16);
                        i2 = i3;
                    case -30:
                        i2 = 41;
                    case -29:
                        i2 = 1;
                    case -28:
                        setclipchildren.AlternateContactlessPaymentDataJson(11);
                        return (java.lang.String) setclipchildren.getProfileVersion;
                    case -27:
                        i2 = 52;
                    case -26:
                        setclipchildren.values = 3;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.String str4 = (java.lang.String) setclipchildren.getProfileVersion;
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.String str5 = (java.lang.String) setclipchildren.getProfileVersion;
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        com.payair.hce.setLeft.values(new java.lang.Object[]{str4, str5, (android.content.SharedPreferences) setclipchildren.getProfileVersion}, 895496365, -895496355, (int) java.lang.System.currentTimeMillis());
                        i2 = i3;
                    case -25:
                        invoke = "DEVICE_ID";
                        try {
                            setclipchildren.IccPrivateKeyCrtComponentsJson = invoke;
                            setclipchildren.AlternateContactlessPaymentDataJson(1);
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            if (i3 < 84) {
                            }
                            if (i3 < 101) {
                            }
                            throw th;
                        }
                        i2 = i3;
                        break;
                    case -24:
                        try {
                            setclipchildren.values = 3;
                            setclipchildren.AlternateContactlessPaymentDataJson(5);
                            setclipchildren.AlternateContactlessPaymentDataJson(6);
                            java.lang.Object obj = setclipchildren.getProfileVersion;
                            setclipchildren.AlternateContactlessPaymentDataJson(6);
                            java.lang.Object obj2 = setclipchildren.getProfileVersion;
                            setclipchildren.AlternateContactlessPaymentDataJson(10);
                            try {
                                java.lang.Object[] objArr14 = {obj2, java.lang.Integer.valueOf(setclipchildren.AlternateContactlessPaymentDataJson)};
                                byte[] bArr3 = getGpoResponse;
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                a((byte) (bArr3[569] - 1), 1621, bArr3[465], objArr15);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                                byte b4 = bArr3[624];
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                a(b4, (short) (b4 | 1412), bArr3[1424], objArr16);
                                java.lang.String str6 = (java.lang.String) objArr16[0];
                                java.lang.Class<?>[] clsArr = new java.lang.Class[2];
                                try {
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    a(bArr3[633], 1669, bArr3[32], objArr17);
                                    clsArr[0] = java.lang.Class.forName((java.lang.String) objArr17[0]);
                                    clsArr[1] = java.lang.Integer.TYPE;
                                    invoke = cls4.getMethod(str6, clsArr).invoke(obj, objArr14);
                                    setclipchildren.IccPrivateKeyCrtComponentsJson = invoke;
                                    setclipchildren.AlternateContactlessPaymentDataJson(1);
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                            }
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            if (i3 < 84) {
                            }
                            if (i3 < 101) {
                            }
                            throw th;
                        }
                        i2 = i3;
                        break;
                    case -23:
                        newInstance = "HCE_SHARED_PREFERENCES";
                        setclipchildren.IccPrivateKeyCrtComponentsJson = newInstance;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i2 = i3;
                    case -22:
                        newInstance = "1234943894";
                        setclipchildren.IccPrivateKeyCrtComponentsJson = newInstance;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i2 = i3;
                    case -21:
                        i2 = 31;
                    case -20:
                        i2 = 90;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        setclipchildren.AlternateContactlessPaymentDataJson(2);
                        if (setclipchildren.AlternateContactlessPaymentDataJson == 0) {
                            i2 = 27;
                        }
                        i2 = i3;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        newInstance = setclipchildren.getProfileVersion.toString();
                        setclipchildren.IccPrivateKeyCrtComponentsJson = newInstance;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i2 = i3;
                    case -17:
                        setclipchildren.values = 2;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.Object obj3 = setclipchildren.getProfileVersion;
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        try {
                            java.lang.Object[] objArr18 = {setclipchildren.getProfileVersion};
                            byte[] bArr4 = getGpoResponse;
                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                            a(bArr4[633], 1513, bArr4[465], objArr19);
                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr19[0]);
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            a((byte) (bArr4[569] - 1), 1491, bArr4[48], objArr20);
                            java.lang.String str7 = (java.lang.String) objArr20[0];
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            a(bArr4[633], 1486, bArr4[32], objArr21);
                            newInstance = cls5.getMethod(str7, java.lang.Class.forName((java.lang.String) objArr21[0])).invoke(obj3, objArr18);
                            setclipchildren.IccPrivateKeyCrtComponentsJson = newInstance;
                            setclipchildren.AlternateContactlessPaymentDataJson(1);
                            i2 = i3;
                        } catch (java.lang.Throwable th8) {
                            java.lang.Throwable cause2 = th8.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th8;
                        }
                    case -16:
                        setclipchildren.values = 2;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.Object obj4 = setclipchildren.getProfileVersion;
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        try {
                            java.lang.Object[] objArr22 = {setclipchildren.getProfileVersion};
                            byte[] bArr5 = getGpoResponse;
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a(bArr5[633], 1513, bArr5[465], objArr23);
                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            a((byte) (bArr5[569] - 1), 1491, bArr5[48], objArr24);
                            java.lang.String str8 = (java.lang.String) objArr24[0];
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            a(bArr5[633], 1669, bArr5[32], objArr25);
                            newInstance = cls6.getMethod(str8, java.lang.Class.forName((java.lang.String) objArr25[0])).invoke(obj4, objArr22);
                            setclipchildren.IccPrivateKeyCrtComponentsJson = newInstance;
                            setclipchildren.AlternateContactlessPaymentDataJson(1);
                            i2 = i3;
                        } catch (java.lang.Throwable th9) {
                            java.lang.Throwable cause3 = th9.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th9;
                        }
                    case -15:
                        try {
                            byte[] bArr6 = getGpoResponse;
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            a(bArr6[633], 1513, bArr6[465], objArr26);
                            try {
                                newInstance = java.lang.Class.forName((java.lang.String) objArr26[0]).getDeclaredConstructor(null).newInstance(null);
                                setclipchildren.IccPrivateKeyCrtComponentsJson = newInstance;
                                setclipchildren.AlternateContactlessPaymentDataJson(1);
                                i2 = i3;
                            } catch (java.lang.Throwable th10) {
                                th = th10;
                                java.lang.Throwable cause4 = th.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th11) {
                            th = th11;
                        }
                    case -14:
                        i2 = 24;
                    case -13:
                        i2 = 16;
                    case -12:
                        setclipchildren.AlternateContactlessPaymentDataJson(7);
                        if (setclipchildren.AlternateContactlessPaymentDataJson == 0) {
                            i2 = 15;
                        }
                        i2 = i3;
                    case -11:
                        newInstance = (java.lang.Integer) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 817297752, -817297657, (int) java.lang.System.currentTimeMillis());
                        setclipchildren.IccPrivateKeyCrtComponentsJson = newInstance;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i2 = i3;
                    case -10:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        valueOf = (java.lang.String) setclipchildren.getProfileVersion;
                        i2 = i3;
                    case -9:
                        setclipchildren.values = 2;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.Object obj5 = setclipchildren.getProfileVersion;
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        try {
                            java.lang.Object[] objArr27 = {obj5, setclipchildren.getProfileVersion};
                            byte[] bArr7 = getGpoResponse;
                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                            a((byte) (bArr7[569] - 1), 1582, bArr7[1537], objArr28);
                            java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr28[0]);
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            a(bArr7[624], 1551, bArr7[7], objArr29);
                            java.lang.String str9 = (java.lang.String) objArr29[0];
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            a((byte) (bArr7[569] - 1), 1543, bArr7[425], objArr30);
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            a(bArr7[633], 1669, bArr7[32], objArr31);
                            newInstance = cls7.getMethod(str9, java.lang.Class.forName((java.lang.String) objArr30[0]), java.lang.Class.forName((java.lang.String) objArr31[0])).invoke(null, objArr27);
                            setclipchildren.IccPrivateKeyCrtComponentsJson = newInstance;
                            setclipchildren.AlternateContactlessPaymentDataJson(1);
                            i2 = i3;
                        } catch (java.lang.Throwable th12) {
                            java.lang.Throwable cause5 = th12.getCause();
                            if (cause5 != null) {
                                throw cause5;
                            }
                            throw th12;
                        }
                    case -8:
                        newInstance = a.b.l;
                        setclipchildren.IccPrivateKeyCrtComponentsJson = newInstance;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i2 = i3;
                    case -7:
                        setclipchildren.values = 1;
                        setclipchildren.AlternateContactlessPaymentDataJson(5);
                        setclipchildren.AlternateContactlessPaymentDataJson(6);
                        java.lang.Object obj6 = setclipchildren.getProfileVersion;
                        try {
                            byte[] bArr8 = getGpoResponse;
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            a((byte) (bArr8[569] - 1), 1621, bArr8[465], objArr32);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr32[0]);
                            byte b5 = bArr8[624];
                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                            a(b5, (short) (b5 | 1540), bArr8[447], objArr33);
                            newInstance = cls8.getMethod((java.lang.String) objArr33[0], null).invoke(obj6, null);
                            setclipchildren.IccPrivateKeyCrtComponentsJson = newInstance;
                            setclipchildren.AlternateContactlessPaymentDataJson(1);
                            i2 = i3;
                        } catch (java.lang.Throwable th13) {
                            java.lang.Throwable cause6 = th13.getCause();
                            if (cause6 != null) {
                                throw cause6;
                            }
                            throw th13;
                        }
                    case -6:
                        newInstance = (android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis());
                        setclipchildren.IccPrivateKeyCrtComponentsJson = newInstance;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i2 = i3;
                    case -5:
                        i2 = 111;
                    case -4:
                        i2 = 113;
                    case -3:
                        setclipchildren.AlternateContactlessPaymentDataJson(2);
                        if (setclipchildren.AlternateContactlessPaymentDataJson == 0) {
                            i2 = 4;
                        }
                        i2 = i3;
                    case -2:
                        setclipchildren.IccPrivateKeyCrtComponentsJson = valueOf;
                        setclipchildren.AlternateContactlessPaymentDataJson(1);
                        i2 = i3;
                    case -1:
                        i2 = 43;
                    default:
                        i2 = i3;
                }
            }
            throw th;
        } catch (java.lang.Throwable th14) {
            java.lang.Throwable cause7 = th14.getCause();
            if (cause7 != null) {
                throw cause7;
            }
            throw th14;
        }
    }
}
