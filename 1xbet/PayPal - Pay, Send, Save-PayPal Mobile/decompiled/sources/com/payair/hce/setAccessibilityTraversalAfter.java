package com.payair.hce;

/* loaded from: classes4.dex */
public final class setAccessibilityTraversalAfter implements com.payair.hce.checkUriPermissions {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static byte[] IccPrivateKeyCrtComponentsJson;
    private static long RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static short[] getAid;
    private static int getCiacDecline;
    private static int getCvrMaskAnd;
    private static int getGpoResponse;
    private static char getPaymentFci;
    private static int getProfileVersion;
    private static char valueOf;
    private static int writeReplace;
    private final com.payair.hce.setStatusCodeFromServer values = (com.payair.hce.setStatusCodeFromServer) com.payair.hce.checkSelfPermission.writeReplace(new java.lang.Object[0], -1211773049, 1211773049, (int) java.lang.System.currentTimeMillis());

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 106 - i2;
        int i5 = 5 - (s * 4);
        int i6 = i * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i4;
            i3 = 0;
            i4 = i7;
            i4 += i8;
            i5++;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i5];
            i3++;
            i4 += i8;
            i5++;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    private static void b(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char[] cArr3;
        java.lang.Object obj = null;
        if (str3 != null) {
            int i2 = $10 + 71;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr4 = cArr;
        if (str2 != null) {
            $11 = ($10 + 49) % 128;
            cArr2 = str2.toCharArray();
        } else {
            cArr2 = str2;
        }
        char[] cArr5 = cArr2;
        if (str != null) {
            cArr3 = str.toCharArray();
            $10 = ($11 + 57) % 128;
        } else {
            cArr3 = str;
        }
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr5.length;
        char[] cArr6 = new char[length];
        int length2 = cArr4.length;
        char[] cArr7 = new char[length2];
        java.lang.System.arraycopy(cArr5, 0, cArr6, 0, length);
        java.lang.System.arraycopy(cArr4, 0, cArr7, 0, length2);
        cArr6[0] = (char) (cArr6[0] ^ c);
        cArr7[2] = (char) (cArr7[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr8 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 70, 1178 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) android.graphics.Color.red(0));
                    byte b = $$a[0];
                    byte b2 = b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(b, b2, (byte) (b2 + 4), objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.view.View.combineMeasuredStates(0, 0), 3491 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.os.Process.getGidForName("") + 3832))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr6[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr7[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.view.KeyEvent.keyCodeFromString(""), 1865 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.graphics.Color.green(0) + 41775));
                    byte b3 = $$a[0];
                    byte b4 = b3;
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    c(b3, b4, (byte) (b4 + 1), objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr6[intValue2] * 32718), java.lang.Integer.valueOf(cArr7[intValue])};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 3133 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.view.KeyEvent.getDeadChar(0, 0));
                    byte b5 = $$a[0];
                    byte b6 = b5;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    c(b5, b6, b6, objArr8);
                    obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                }
                cArr7[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr6[intValue2] = getwalletdata.values;
                cArr8[getwalletdata.writeReplace] = (char) ((((cArr6[intValue2] ^ r4[getwalletdata.writeReplace]) ^ (RecordsJson ^ 1263759066225628708L)) ^ ((int) (getGpoResponse ^ 1263759066225628708L))) ^ ((char) (getPaymentFci ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                length3 = length3;
                obj = null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr8);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        int i4;
        long j;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            long j2 = 0;
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.KeyEvent.keyCodeFromString(""), 30 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                i4 = 1;
            } else {
                $11 = ($10 + 69) % 128;
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = IccPrivateKeyCrtComponentsJson;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i5 = 0;
                    while (i5 < length) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i5])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 5088, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        i5++;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr == null) {
                    j = -4897270311952305750L;
                    intValue = (short) (((short) (getAid[i2 + ((int) (writeReplace ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ (-4897270311952305750L))));
                    if (intValue > 0) {
                        gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + ((int) (writeReplace ^ j)) + i4;
                        java.lang.Object[] objArr4 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getProfileVersion), sb};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj3 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2364, (char) android.text.TextUtils.getCapsMode("", 0, 0));
                            byte b2 = $$a[0];
                            byte b3 = b2;
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            c(b2, b3, (byte) (b3 + 2), objArr5);
                            obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj3);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr3 = IccPrivateKeyCrtComponentsJson;
                        if (bArr3 != null) {
                            $10 = ($11 + 81) % 128;
                            int length2 = bArr3.length;
                            byte[] bArr4 = new byte[length2];
                            for (int i6 = 0; i6 < length2; i6++) {
                                int i7 = $11 + 111;
                                $10 = i7 % 128;
                                if (i7 % 2 != 0) {
                                    bArr4[i6] = (byte) (bArr3[i6] + 4897270311952305750L);
                                    throw new java.lang.ArithmeticException();
                                }
                                bArr4[i6] = (byte) (bArr3[i6] ^ (-4897270311952305750L));
                            }
                            bArr3 = bArr4;
                        }
                        boolean z = bArr3 != null;
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            if (z) {
                                byte[] bArr5 = IccPrivateKeyCrtComponentsJson;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr5[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            } else {
                                short[] sArr = getAid;
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
                byte[] bArr6 = IccPrivateKeyCrtComponentsJson;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(writeReplace)};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 27, 29 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                }
                intValue = (byte) (((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).intValue()] ^ (-4897270311952305750L))) + ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ (-4897270311952305750L))));
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

    /* JADX WARN: Removed duplicated region for block: B:35:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0828 A[LOOP:1: B:21:0x04da->B:53:0x0828, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x082b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x06e2  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v46 */
    @Override // com.payair.hce.checkUriPermissions
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x_(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.content.Context context, com.payair.hce.getDetailedMessage getdetailedmessage) {
        boolean z;
        boolean z2;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        long executeInsert;
        getCiacDecline = (getCvrMaskAnd + 79) % 128;
        int i = 0;
        float f = 0.0f;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 926477513, android.graphics.Color.green(0) - 931672400, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 6861, (byte) android.text.TextUtils.getTrimmedLength(""), (short) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int i2 = getCvrMaskAnd + 89;
        getCiacDecline = i2 % 128;
        int i3 = i2 % 2;
        java.util.ArrayList<com.payair.hce.setOnGenericMotionListener> arrayList = new java.util.ArrayList();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(android.view.Gravity.getAbsoluteGravity(0, 0) - 926438663, (-931672464) - android.view.View.resolveSizeAndState(0, 0, 0), (-6861) - android.text.TextUtils.getOffsetBefore("", 0), (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), (short) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
        java.lang.String intern2 = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(android.graphics.ImageFormat.getBitsPerPixel(0) - 926466396, android.os.Process.getGidForName("") - 931672395, (-6861) - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (byte) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (short) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), objArr3);
        android.database.Cursor rawQuery = sQLiteDatabase.rawQuery(DigitizedCardProfile(0, intern2, intern, (char) 0, ((java.lang.String) objArr3[0]).intern()).intern(), null);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(android.graphics.Color.green(0) - 926469486, (-931672392) - android.text.TextUtils.getOffsetBefore("", 0), android.graphics.Color.alpha(0) - 6861, (byte) (android.view.ViewConfiguration.getTapTimeout() >> 16), (short) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr4);
            java.lang.String intern3 = ((java.lang.String) objArr4[0]).intern();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a(android.text.TextUtils.indexOf("", "", 0, 0) - 926465244, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 931672352, (-6861) - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (android.view.KeyEvent.getMaxKeyCode() >> 16), (short) android.text.TextUtils.getCapsMode("", 0, 0), objArr5);
            DigitizedCardProfile(0, intern3, intern, (char) 49773, ((java.lang.String) objArr5[0]).intern()).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 63709, (-931672349) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.Gravity.getAbsoluteGravity(0, 0) - 6861, (byte) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (short) android.view.View.combineMeasuredStates(0, 0), objArr6);
            java.lang.String intern4 = ((java.lang.String) objArr6[0]).intern();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            b("佨撠㰯\ude30", "\uf555់胸䄛", (-1) - android.widget.ExpandableListView.getPackedPositionChild(0L), "\u0000\u0000\u0000\u0000", (char) (android.text.TextUtils.getTrimmedLength("") + 7040), objArr7);
            sQLiteDatabase.execSQL(DigitizedCardProfile(0, intern4, intern, (char) 44849, ((java.lang.String) objArr7[0]).intern()).intern());
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            b("\ue535✀㝉\uee6b鞹\udc01ꟑ檹\uf14d\uf154⧺扣豊幱⋥掓䍘\uf84d㓻⼂覕涻쪪뫴鼮줄뱨岸盈ㄷ\ue5ba愣테椎낊惝랹Ꝣ撔敯髯㈘⁵᳝篌퓜\uebe1妸厍뉐斈춼撹\ue8f1탫鞡螓Ⱍ蘬굊啒폚ꉻ刬딥ⵛ辨\ufaf1鼬띝煍ぁ揎蜲읇᭔꜁쎜燥\uddfa㣬藥馐\uecce얏䮢냊릦筀音젌㸥\ueaad誁둓单扶\uf33c朇㳡쾸ٴ李\uedac쩿\ud9d0⠗퉞ᔲ㤼崪堪華㬓돁栫臇\u18afډ\uaac9ᴷ蔽梻풮䕌佦弮鐺\ue2f2搜⤓悏ㄧ쯤璍ᗜ免䭾绵卄㼟‒梮ዱᥒὤ䑷並䖅뮡魒䴒䝟㌪強䋔떭䙎ꬤꠚꨠᣉĂ쑈\u2d7a鸢ု\ue07c퀲ᕭ郣Ϥൌ垔쬠郋핈Ἷ怎\ue554蜰넗㦧参䙟㟗⑲\ued56꜀핟錔鶤뵉쌋\ued79", "⹅㫌㼜忴", android.graphics.Color.alpha(0) + 473615406, "\u0000\u0000\u0000\u0000", (char) (62527 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), objArr8);
            java.lang.String intern5 = ((java.lang.String) objArr8[0]).intern();
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            b("\ue68b\u2003蝊ॢ", "\uf184ຯସ嗳", android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24, "\u0000\u0000\u0000\u0000", (char) (62220 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr9);
            sQLiteDatabase.execSQL(DigitizedCardProfile(-612471699, intern5, intern, (char) 40408, ((java.lang.String) objArr9[0]).intern()).intern());
            return;
        }
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        while (true) {
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            b("㬎\uf186ꬨท쌇\u0b53躿洣毑", "奆쓵ꁤ昮", android.text.TextUtils.indexOf("", c, 0, 0) + 1690629466, "\u0000\u0000\u0000\u0000", (char) android.text.TextUtils.indexOf("", ""), objArr10);
            java.lang.String intern6 = ((java.lang.String) objArr10[0]).intern();
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            b("\uee63垇뷆⾚", "뉸␛戅놈", android.view.View.MeasureSpec.getMode(0), "\u0000\u0000\u0000\u0000", (char) (34914 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr11);
            byte[] blob = rawQuery.getBlob(rawQuery.getColumnIndex(DigitizedCardProfile(1342212007, intern6, intern, (char) 0, ((java.lang.String) objArr11[0]).intern()).intern()));
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            a(android.graphics.Color.green(0) - 926430248, android.text.TextUtils.getCapsMode("", 0, 0) - 931672306, (android.media.AudioTrack.getMinVolume() > f ? 1 : (android.media.AudioTrack.getMinVolume() == f ? 0 : -1)) - 6861, (byte) android.view.View.combineMeasuredStates(0, 0), (short) (android.os.Process.myPid() >> 22), objArr12);
            java.lang.String intern7 = ((java.lang.String) objArr12[0]).intern();
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            a(android.view.View.getDefaultSize(0, 0) - 926429465, android.graphics.Color.alpha(0) - 931672296, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 6860, (byte) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (short) android.view.Gravity.getAbsoluteGravity(0, 0), objArr13);
            java.lang.String string = rawQuery.getString(rawQuery.getColumnIndex(DigitizedCardProfile(0, intern7, intern, (char) 0, ((java.lang.String) objArr13[0]).intern()).intern()));
            java.lang.String upperCase = com.payair.hce.setVerticalScrollbarThumbDrawable.DigitizedCardProfile(java.util.Arrays.copyOfRange(blob, 0, 17)).toUpperCase(java.util.Locale.ENGLISH);
            byte[] copyOfRange = java.util.Arrays.copyOfRange(blob, 17, 21);
            byte[] copyOfRange2 = java.util.Arrays.copyOfRange(blob, 21, 23);
            byte b = blob[23];
            byte[] copyOfRange3 = java.util.Arrays.copyOfRange(blob, 24, 32);
            if (blob[32] == 1) {
                getCvrMaskAnd = (getCiacDecline + 77) % 128;
                z = true;
            } else {
                z = false;
            }
            if (blob[33] == 1) {
                int i4 = (getCvrMaskAnd + 65) % 128;
                getCiacDecline = i4;
                int i5 = AlternateContactlessPaymentDataJson;
                DigitizedCardProfile = (i5 + 3) % 128;
                int i6 = i4 + 109;
                getCvrMaskAnd = i6 % 128;
                if (i6 % 2 == 0) {
                    DigitizedCardProfile = (i5 % 18) << 27439;
                } else {
                    DigitizedCardProfile = (i5 + 17) % 128;
                }
                z2 = true;
            } else {
                z2 = false;
            }
            arrayList.add(new com.payair.hce.setOnGenericMotionListener(upperCase, copyOfRange, copyOfRange2, b, copyOfRange3, z, z2, java.util.Arrays.copyOfRange(blob, 34, 37), java.util.Arrays.copyOfRange(blob, 37, 43), java.util.Arrays.copyOfRange(blob, 43, 45), string));
            if (!rawQuery.moveToNext()) {
                break;
            }
            f = 0.0f;
            c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        }
        rawQuery.close();
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a((-926470429) - android.view.View.resolveSizeAndState(0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0) - 931672292, (-6861) - android.text.TextUtils.indexOf("", "", 0), (byte) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (short) android.view.View.resolveSize(0, 0), objArr14);
        java.lang.String intern8 = ((java.lang.String) objArr14[0]).intern();
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        b("캿팡꾪俚", "ɬ뾹\ue4fd\ue7f1", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) (61972 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr15);
        DigitizedCardProfile(0, intern8, intern, (char) 65431, ((java.lang.String) objArr15[0]).intern()).intern();
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        a(android.text.TextUtils.getOffsetAfter("", 0) - 926415021, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 931672349, android.view.KeyEvent.getDeadChar(0, 0) - 6861, (byte) android.graphics.Color.blue(0), (short) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr16);
        java.lang.String intern9 = ((java.lang.String) objArr16[0]).intern();
        java.lang.Object[] objArr17 = new java.lang.Object[1];
        b("佨撠㰯\ude30", "\uf555់胸䄛", android.view.ViewConfiguration.getJumpTapTimeout() >> 16, "\u0000\u0000\u0000\u0000", (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 7041), objArr17);
        sQLiteDatabase.execSQL(DigitizedCardProfile(0, intern9, intern, (char) 44849, ((java.lang.String) objArr17[0]).intern()).intern());
        java.lang.Object[] objArr18 = new java.lang.Object[1];
        b("\ue535✀㝉\uee6b鞹\udc01ꟑ檹\uf14d\uf154⧺扣豊幱⋥掓䍘\uf84d㓻⼂覕涻쪪뫴鼮줄뱨岸盈ㄷ\ue5ba愣테椎낊惝랹Ꝣ撔敯髯㈘⁵᳝篌퓜\uebe1妸厍뉐斈춼撹\ue8f1탫鞡螓Ⱍ蘬굊啒폚ꉻ刬딥ⵛ辨\ufaf1鼬띝煍ぁ揎蜲읇᭔꜁쎜燥\uddfa㣬藥馐\uecce얏䮢냊릦筀音젌㸥\ueaad誁둓单扶\uf33c朇㳡쾸ٴ李\uedac쩿\ud9d0⠗퉞ᔲ㤼崪堪華㬓돁栫臇\u18afډ\uaac9ᴷ蔽梻풮䕌佦弮鐺\ue2f2搜⤓悏ㄧ쯤璍ᗜ免䭾绵卄㼟‒梮ዱᥒὤ䑷並䖅뮡魒䴒䝟㌪強䋔떭䙎ꬤꠚꨠᣉĂ쑈\u2d7a鸢ု\ue07c퀲ᕭ郣Ϥൌ垔쬠郋핈Ἷ怎\ue554蜰넗㦧参䙟㟗⑲\ued56꜀핟錔鶤뵉쌋\ued79", "⹅㫌㼜忴", 473615405 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "\u0000\u0000\u0000\u0000", (char) (62526 - android.graphics.ImageFormat.getBitsPerPixel(0)), objArr18);
        java.lang.String intern10 = ((java.lang.String) objArr18[0]).intern();
        java.lang.Object[] objArr19 = new java.lang.Object[1];
        b("\ue68b\u2003蝊ॢ", "\uf184ຯସ嗳", android.text.TextUtils.indexOf("", "", 0), "\u0000\u0000\u0000\u0000", (char) (android.view.View.resolveSize(0, 0) + 62219), objArr19);
        sQLiteDatabase.execSQL(DigitizedCardProfile(-612471699, intern10, intern, (char) 40408, ((java.lang.String) objArr19[0]).intern()).intern());
        for (com.payair.hce.setOnGenericMotionListener setongenericmotionlistener : arrayList) {
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            a((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 926413369, (-931672264) - (android.util.TypedValue.complexToFraction(i, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-6861) - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (byte) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i) == 0.0d ? 0 : -1)), (short) android.graphics.Color.green(i), objArr20);
            java.lang.String intern11 = ((java.lang.String) objArr20[i]).intern();
            java.lang.Object[] objArr21 = new java.lang.Object[1];
            a((-926445350) - android.graphics.Color.red(i), (-931672135) - ((android.os.Process.getThreadPriority(i) + 20) >> 6), (-6861) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (byte) android.text.TextUtils.indexOf("", ""), (short) android.graphics.Color.red(i), objArr21);
            android.database.sqlite.SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(DigitizedCardProfile(-415448451, intern11, intern, i, ((java.lang.String) objArr21[i]).intern()).intern());
            compileStatement.bindString(1, (java.lang.String) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, -1548017376, 1548017379, java.lang.System.identityHashCode(setongenericmotionlistener)));
            compileStatement.bindString(2, (java.lang.String) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, -1142623522, 1142623531, java.lang.System.identityHashCode(setongenericmotionlistener)));
            compileStatement.bindString(3, com.payair.hce.setVerticalScrollbarThumbDrawable.DigitizedCardProfile((byte[]) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, -490423691, 490423693, java.lang.System.identityHashCode(setongenericmotionlistener))).toUpperCase(java.util.Locale.ENGLISH));
            compileStatement.bindString(4, com.payair.hce.setVerticalScrollbarThumbDrawable.DigitizedCardProfile((byte[]) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, 952522735, -952522727, java.lang.System.identityHashCode(setongenericmotionlistener))).toUpperCase(java.util.Locale.ENGLISH));
            compileStatement.bindBlob(5, new byte[i]);
            java.lang.String str = (java.lang.String) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, -1548017376, 1548017379, java.lang.System.identityHashCode(setongenericmotionlistener));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (str != null) {
                AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 25) % 128;
                if (!str.isEmpty()) {
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    a((-926477466) - (android.view.ViewConfiguration.getTapTimeout() >> 16), (-931672131) - android.graphics.Color.alpha(i), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i) - 6860, (byte) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr22);
                    if (!str.equals(((java.lang.String) objArr22[i]).intern())) {
                        int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                        long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(i);
                        int threadPriority = android.os.Process.getThreadPriority(i);
                        byte b2 = (byte) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        short s = (short) (android.widget.ExpandableListView.getPackedPositionForGroup(i) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i) == 0L ? 0 : -1));
                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                        a((-926477467) - packedPositionChild, (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)) - 931672131, ((threadPriority + 20) >> 6) - 6861, b2, s, objArr23);
                        if (str.startsWith(((java.lang.String) objArr23[0]).intern())) {
                            str = str.substring(2);
                        }
                        bArr = com.payair.hce.setVerticalScrollbarThumbDrawable.valueOf(str);
                        arrayList2.add(bArr);
                        if (((byte[]) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, 1550664217, -1550664211, java.lang.System.identityHashCode(setongenericmotionlistener))) != null) {
                            bArr2 = new byte[4];
                        } else {
                            getCiacDecline = (getCvrMaskAnd + 93) % 128;
                            bArr2 = (byte[]) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, 1550664217, -1550664211, java.lang.System.identityHashCode(setongenericmotionlistener));
                        }
                        arrayList2.add(bArr2);
                        arrayList2.add(new byte[]{((java.lang.Byte) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, 1017549758, -1017549757, java.lang.System.identityHashCode(setongenericmotionlistener))).byteValue()});
                        if (((java.lang.Boolean) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, -1546705724, 1546705729, java.lang.System.identityHashCode(setongenericmotionlistener))).booleanValue()) {
                            getCiacDecline = (getCvrMaskAnd + 45) % 128;
                            bArr3 = new byte[]{0};
                        } else {
                            int i7 = DigitizedCardProfile + 117;
                            AlternateContactlessPaymentDataJson = i7 % 128;
                            if (i7 % 2 == 0) {
                                int i8 = getCiacDecline + 105;
                                getCvrMaskAnd = i8 % 128;
                                int i9 = i8 % 2;
                            }
                            bArr3 = new byte[]{1};
                        }
                        arrayList2.add(bArr3);
                        arrayList2.add(!((java.lang.Boolean) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, 834997205, -834997205, java.lang.System.identityHashCode(setongenericmotionlistener))).booleanValue() ? new byte[]{1} : new byte[]{0});
                        if (((byte[]) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, -1086494655, 1086494659, java.lang.System.identityHashCode(setongenericmotionlistener))) != null) {
                            getCvrMaskAnd = (getCiacDecline + 105) % 128;
                            bArr4 = new byte[6];
                        } else {
                            bArr4 = (byte[]) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, -1086494655, 1086494659, java.lang.System.identityHashCode(setongenericmotionlistener));
                        }
                        arrayList2.add(bArr4);
                        if (((byte[]) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, -1336471713, 1336471720, java.lang.System.identityHashCode(setongenericmotionlistener))) != null) {
                            getCiacDecline = (getCvrMaskAnd + 97) % 128;
                            bArr5 = new byte[2];
                        } else {
                            bArr5 = (byte[]) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, -1336471713, 1336471720, java.lang.System.identityHashCode(setongenericmotionlistener));
                        }
                        arrayList2.add(bArr5);
                        compileStatement.bindBlob(6, (byte[]) com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{arrayList2}, -1870759509, 1870759514, (int) java.lang.System.currentTimeMillis()));
                        executeInsert = compileStatement.executeInsert();
                        compileStatement.clearBindings();
                        if (executeInsert != -1) {
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            a((-926415378) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-931672129) - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (-6861) - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (short) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr24);
                            java.lang.String intern12 = ((java.lang.String) objArr24[0]).intern();
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            b("腠沗鿔ﾱ", "鬪煵帷阼", android.text.TextUtils.getTrimmedLength(""), "\u0000\u0000\u0000\u0000", (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 15454), objArr25);
                            throw new com.payair.hce.getAuthenticationMethods(DigitizedCardProfile(1362902165, intern12, intern, (char) 15246, ((java.lang.String) objArr25[0]).intern()).intern());
                        }
                        i = 0;
                    }
                }
            }
            AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 79) % 128;
            bArr = new byte[i];
            arrayList2.add(bArr);
            if (((byte[]) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, 1550664217, -1550664211, java.lang.System.identityHashCode(setongenericmotionlistener))) != null) {
            }
            arrayList2.add(bArr2);
            arrayList2.add(new byte[]{((java.lang.Byte) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, 1017549758, -1017549757, java.lang.System.identityHashCode(setongenericmotionlistener))).byteValue()});
            if (((java.lang.Boolean) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, -1546705724, 1546705729, java.lang.System.identityHashCode(setongenericmotionlistener))).booleanValue()) {
            }
            arrayList2.add(bArr3);
            arrayList2.add(!((java.lang.Boolean) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, 834997205, -834997205, java.lang.System.identityHashCode(setongenericmotionlistener))).booleanValue() ? new byte[]{1} : new byte[]{0});
            if (((byte[]) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, -1086494655, 1086494659, java.lang.System.identityHashCode(setongenericmotionlistener))) != null) {
            }
            arrayList2.add(bArr4);
            if (((byte[]) com.payair.hce.setOnGenericMotionListener.values(new java.lang.Object[]{setongenericmotionlistener}, -1336471713, 1336471720, java.lang.System.identityHashCode(setongenericmotionlistener))) != null) {
            }
            arrayList2.add(bArr5);
            compileStatement.bindBlob(6, (byte[]) com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{arrayList2}, -1870759509, 1870759514, (int) java.lang.System.currentTimeMillis()));
            executeInsert = compileStatement.executeInsert();
            compileStatement.clearBindings();
            if (executeInsert != -1) {
            }
        }
    }

    private static java.lang.String DigitizedCardProfile(int i, java.lang.String str, java.lang.String str2, char c, java.lang.String str3) {
        int i2;
        char[] cArr;
        int i3 = getCvrMaskAnd;
        getCiacDecline = (i3 + 15) % 128;
        int i4 = DigitizedCardProfile + 79;
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (str3 != null) {
            char[] charArray = str3.toCharArray();
            i2 = getCvrMaskAnd + 15;
            cArr = charArray;
        } else {
            i2 = i3 + 87;
            cArr = str3;
        }
        getCiacDecline = i2 % 128;
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            getCiacDecline = (getCvrMaskAnd + 61) % 128;
            DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 101) % 128;
            char[] charArray2 = str2.toCharArray();
            int i5 = getCvrMaskAnd + 37;
            getCiacDecline = i5 % 128;
            if (i5 % 2 != 0) {
                DigitizedCardProfile = (AlternateContactlessPaymentDataJson / 5) - 5669;
                cArr3 = charArray2;
            } else {
                DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 103) % 128;
                cArr3 = charArray2;
            }
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 109) % 128;
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        char[] cArr7 = (char[]) cArr2.clone();
        char[] cArr8 = (char[]) cArr4.clone();
        int i6 = 0;
        cArr7[0] = (char) (c ^ cArr7[0]);
        cArr8[2] = (char) (cArr8[2] + ((char) i));
        int length = cArr6.length;
        char[] cArr9 = new char[length];
        while (i6 < length) {
            int i7 = AlternateContactlessPaymentDataJson + 75;
            DigitizedCardProfile = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = getCvrMaskAnd + 111;
                getCiacDecline = i8 % 128;
                if (i8 % 2 == 0) {
                    com.payair.hce.DigitizedCardProfile.AlternateContactlessPaymentDataJson(cArr7, cArr8, i6);
                    cArr9[i6] = (char) ((cArr6[i6] ^ cArr7[(i6 + 3) % 4]) ^ valueOf);
                    i6++;
                }
            }
            com.payair.hce.DigitizedCardProfile.AlternateContactlessPaymentDataJson(cArr7, cArr8, i6);
            char c2 = cArr6[i6];
            char c3 = cArr7[(i6 >>> 2) >> 2];
            cArr9[i6] = valueOf;
            i6 += 26;
        }
        return new java.lang.String(cArr9);
    }

    static void AlternateContactlessPaymentDataJson() {
        writeReplace = 680263738;
        SdkCoreAlternateContactlessPaymentDataImpl = 520366950;
        getProfileVersion = 675077472;
        getAid = new short[]{-11042, -3461, 26674, 14235, 26584, -31819, 22037, 21575, -20309, -4938, -4963, -29054, 7946, 29708, 23186, 14242, -15740, -19828, 27388, 9138, 28481, -1443, -29125, -23600, -14963, -19991, 31421, -25920, 10324, 16182, 10467, 16998, -27032, 4049, 10710, 15790, -28863, 327, 2208, 20611, 1341, 14628, -25877, 25713, 24385, 2355, -21251, 5081, -11421, -29645, -31139, -3429, 1643, 1310, -13972, 11665, -29671, 22753, -25992, 10059, -28926, -26392, 32397, 29423, -11118, 12714, 12714, 12714, -11118, -32190, -6293, -2419, -11018, -5343, -9100, 27814, 20031, -27316, 29428, -24186, -22713, -2953, -21633, -4506, 25178, 1395, -6333, 21416, 27306, 20114, 14974, 16383, -27359, 13852, 29462, 31446, -8354, 23150, 24174, -2713, 30985, -19772, 6879, 12828, -12327, 9406, 7526, 3254, 19752, 13948, -27669, 12682, -11118, -15386, 15518, 510, -11020, -10904, -6655, 7286, 3706, 18483, -2116, 9886, -4309, 15352, -32160, 3953, -24563, -21354, 18143, -14444, 29218, 2029, 23717, 7946, -10845, 1809, 11237, 21727, 27100, 22492, 3215, -770, -10429, -1947, 4473, -5776, -28263, 27309, -16444, -24544, -26349, -1144, -26963, 29310, 13070, -26714, -11116, 11618, -16932, 23801, -29880, -14456, 5366, -29254, 32164, -4098, -11118, -32388, 19718, -15235, -11014, 13961, 25653, -3126, -18080, 19350, -11299, -8764, 20317, 12609, -17073, -7207, 30785, -1451, 29146, -14944, -2123, -31172, 6827, -32072, -6188, -21651, -30526, -25081, -14635, 18107, 4327, 4215, -11233, 14263, 24987, -13472, 25337, 13558, -1709, 21190, -22026, -29235, com.visa.cbp.setDeviceName.getInputSizeshNQ4ISI, 12618, -17337, -28551, 19674, 8206, -12919, 4748, -14917, -3688, 12169, 272, 9103, -19062, 26024, 9764, 1727, 18099, 22382, -20171, 1894, -31086, 3536, -17314, -17531, -23888, -25212, -19573, 23799, -13196, 27200, 6972, -8390, -12047, 24351, -4611, 28064, 24350, 16536, 32739, -27099, 9833, 30370, -1425, 6921, -22409, 13074, -9507, 10395, 13403, -3719, 20562, 24315, 28790, -19272, 3589, 19537, -18833, -20083, -28683, -9852, 32344, 31609, -20305, -7320, 88, 1813, -30066, -16781, 16263, 6017, -29860, -2056, -11097, -32327, 32086, 20324, -9961, 28522, -5986, 23993, -32145, -6659, -17182, 7358, 7896, 20309, -15868, 4797, -18060, 21, -26578, -12505, 20865, 1516, -32637, -28466, 22358, -3996, 26037, -16709, -21215, -10616, -8532, 3149, -7657, 29097, -632, -1954, 25313, -27343, 25460, -6780, 2553, -2345, -7302, 16180, -8282, 5744, -11118, -10349, -29297, -29004, -11108, 12770, -11013, 10881, -22767, -21359, 23604, -32309, 8999, 10464, -10473, 23538, -1838, -18469, 6591, 20088, -4127, -8079, 8569, 23657, 29536, 29670, 16220, 18313, 30381, 16076, 28046, 19031, 5963, -724, 4410};
        RecordsJson = 1263759066225628708L;
        getGpoResponse = -804334044;
        getPaymentFci = (char) 23621;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getCiacDecline = 0;
        getCvrMaskAnd = 1;
        AlternateContactlessPaymentDataJson();
        DigitizedCardProfile = 0;
        AlternateContactlessPaymentDataJson = 1;
        valueOf = (char) 36340;
        int i = getCiacDecline + 71;
        getCvrMaskAnd = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void init$0() {
        $$a = new byte[]{0, Byte.MIN_VALUE, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE};
        $$b = 7;
    }
}
