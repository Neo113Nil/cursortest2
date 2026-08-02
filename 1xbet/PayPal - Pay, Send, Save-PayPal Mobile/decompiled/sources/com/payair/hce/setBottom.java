package com.payair.hce;

/* loaded from: classes4.dex */
final class setBottom {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static boolean DigitizedCardProfile;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char getProfileVersion;
    private static char valueOf;
    private static char values;
    private static java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = (i * 50) + (i2 * (-97)) + (((~(i4 | i5)) | (~(i4 | i))) * 98) + (((~(i5 | (~i))) | i4 | (~(i | i3))) * (-49)) + (((~(i | i2)) | (~(i3 | i4))) * 49);
        if (i6 == 1) {
            return DigitizedCardProfile(objArr);
        }
        if (i6 != 2) {
            return i6 != 3 ? i6 != 4 ? writeReplace(objArr) : AlternateContactlessPaymentDataJson(objArr) : values(objArr);
        }
        com.payair.hce.setVisibility setvisibility = new com.payair.hce.setVisibility();
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 125) % 128;
        return setvisibility;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2 = (s * 2) + 110;
        byte[] bArr = $$a;
        int i3 = 4 - (b * 3);
        int i4 = s2 * 4;
        byte[] bArr2 = new byte[1 - i4];
        if (bArr == null) {
            int i5 = i3;
            int i6 = 0;
            i3++;
            i2 = (-i2) + i5;
            i = i6;
            bArr2[i] = (byte) i2;
            if (i == 0 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i + 1;
            i5 = i2;
            i2 = bArr[i3];
            i6 = i7;
            i3++;
            i2 = (-i2) + i5;
            i = i6;
            bArr2[i] = (byte) i2;
            if (i == 0 - i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == 0 - i4) {
            }
        }
    }

    setBottom() {
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        RecordsJson = 1;
        SdkCoreAlternateContactlessPaymentDataImpl();
        writeReplace = null;
        DigitizedCardProfile = false;
        int i = RecordsJson + 83;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void R_(java.lang.String str, java.lang.String str2, android.content.SharedPreferences sharedPreferences) {
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 11) % 128;
        sharedPreferences.edit().putString(DigitizedCardProfile(str), DigitizedCardProfile(str2)).apply();
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 87) % 128;
    }

    static java.lang.String S_(java.lang.String str, java.lang.String str2, android.content.SharedPreferences sharedPreferences) {
        int i = RecordsJson + 63;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            java.lang.String string = sharedPreferences.getString(DigitizedCardProfile(str), str2);
            if (string == null || string.isEmpty() || string.equals(str2)) {
                return string;
            }
            int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 83;
            RecordsJson = i2 % 128;
            if (i2 % 2 != 0) {
                return values(string);
            }
            values(string);
            throw null;
        }
        sharedPreferences.getString(DigitizedCardProfile(str), str2);
        throw null;
    }

    static void T_(java.lang.String str, boolean z, android.content.SharedPreferences sharedPreferences) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 121;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            R_(str, java.lang.String.valueOf(z), sharedPreferences);
            RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 21) % 128;
        } else {
            R_(str, java.lang.String.valueOf(z), sharedPreferences);
            throw null;
        }
    }

    static boolean U_(java.lang.String str, boolean z, android.content.SharedPreferences sharedPreferences) {
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 45) % 128;
        boolean parseBoolean = java.lang.Boolean.parseBoolean(S_(str, java.lang.String.valueOf(z), sharedPreferences));
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 9) % 128;
        return parseBoolean;
    }

    static void V_(java.lang.String str, java.util.Set<java.lang.String> set, android.content.SharedPreferences sharedPreferences) {
        R_(str, new com.payair.hce.IccPrivateKeyCrtComponentsJson().values(set), sharedPreferences);
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 73) % 128;
    }

    static java.util.Set<java.lang.String> W_(java.lang.String str, android.content.SharedPreferences sharedPreferences) {
        java.util.Set<java.lang.String> set = (java.util.Set) new com.payair.hce.IccPrivateKeyCrtComponentsJson().writeReplace(S_(str, null, sharedPreferences), java.util.Set.class);
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 1) % 128;
        return set;
    }

    static void X_(java.lang.String str, int i, android.content.SharedPreferences sharedPreferences) {
        int i2 = RecordsJson + 63;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            R_(str, java.lang.String.valueOf(i), sharedPreferences);
            RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 121) % 128;
        } else {
            R_(str, java.lang.String.valueOf(i), sharedPreferences);
            throw null;
        }
    }

    static int Y_(java.lang.String str, int i, android.content.SharedPreferences sharedPreferences) {
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 57) % 128;
        int parseInt = java.lang.Integer.parseInt(S_(str, java.lang.String.valueOf(i), sharedPreferences));
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 105) % 128;
        return parseInt;
    }

    static void Z_(java.lang.String str, android.content.SharedPreferences sharedPreferences) {
        int i = RecordsJson + 69;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            sharedPreferences.edit().remove(DigitizedCardProfile(str)).apply();
            SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 73) % 128;
        } else {
            sharedPreferences.edit().remove(DigitizedCardProfile(str)).apply();
            throw new java.lang.ArithmeticException();
        }
    }

    static boolean aa_(java.lang.String str, android.content.SharedPreferences sharedPreferences) {
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 13) % 128;
        boolean commit = sharedPreferences.edit().remove(DigitizedCardProfile(str)).commit();
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return commit;
    }

    private static void ab_(java.lang.String str, android.content.SharedPreferences sharedPreferences) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 47;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            sharedPreferences.edit().remove(str).apply();
            int i2 = RecordsJson + 25;
            SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        sharedPreferences.edit().remove(str).apply();
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        long longValue = ((java.lang.Number) objArr[1]).longValue();
        android.content.SharedPreferences sharedPreferences = (android.content.SharedPreferences) objArr[2];
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 49) % 128;
        R_(str, java.lang.String.valueOf(longValue), sharedPreferences);
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 87;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    static long ad_(java.lang.String str, long j, android.content.SharedPreferences sharedPreferences) {
        int i = RecordsJson + 39;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        java.lang.String S_ = S_(str, "-1", sharedPreferences);
        if (i % 2 != 0) {
            java.lang.Long.parseLong(S_);
            throw null;
        }
        long parseLong = java.lang.Long.parseLong(S_);
        int i2 = RecordsJson + 65;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            return parseLong;
        }
        throw null;
    }

    private static java.lang.String DigitizedCardProfile(java.lang.String str) {
        if (str == null) {
            return str;
        }
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 17;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (str.isEmpty()) {
            return str;
        }
        if (!getProfileVersion().isEmpty()) {
            return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{str.getBytes(java.nio.charset.StandardCharsets.UTF_8), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{getProfileVersion()}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis())}, 1200702041, -1200702040, (int) java.lang.System.currentTimeMillis());
        }
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 47) % 128;
        return "";
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i2 = $11 + 107;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                $10 = ($11 + 69) % 128;
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i3) ^ ((c2 << 4) + ((char) (valueOf ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getProfileVersion)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1336, (char) android.view.View.getDefaultSize(0, 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((short) 0, (short) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (AlternateContactlessPaymentDataJson ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(values)};
                    int i5 = charValue + i3;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - android.view.View.MeasureSpec.getSize(0), 1335 - android.view.View.MeasureSpec.getSize(0), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b((short) 0, (short) 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i3 -= 40503;
                    i4++;
                    $10 = ($11 + 117) % 128;
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
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 3544 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) android.text.TextUtils.indexOf("", "", 0))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    private static java.lang.String values(java.lang.String str) {
        if (getProfileVersion().isEmpty()) {
            RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 105) % 128;
            return "";
        }
        java.lang.String str2 = (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{(byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{str}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{getProfileVersion()}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis())}, 1850592019, -1850592019, (int) java.lang.System.currentTimeMillis());
        int i = RecordsJson + 107;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return str2;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        com.payair.hce.runInTransaction runintransaction = new com.payair.hce.runInTransaction(new com.payair.hce.isOpenInternalannotations());
        new com.payair.hce.findFragmentByTag(runintransaction);
        com.payair.hce.accessinternalBeginTransaction accessinternalbegintransaction = new com.payair.hce.accessinternalBeginTransaction(runintransaction);
        accessinternalbegintransaction.DigitizedCardProfile(true, new com.payair.hce.getErrorDialog(bArr2));
        byte[] bArr3 = new byte[accessinternalbegintransaction.valueOf(bArr.length)];
        try {
            accessinternalbegintransaction.values(bArr3, accessinternalbegintransaction.valueOf(bArr, 0, bArr.length, bArr3));
            SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 115) % 128;
        } catch (com.payair.hce.getSuspendingTransactionId unused) {
        }
        return (java.lang.String) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{bArr3}, -5816740, 5816740, (int) java.lang.System.currentTimeMillis());
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        com.payair.hce.runInTransaction runintransaction = new com.payair.hce.runInTransaction(new com.payair.hce.isOpenInternalannotations());
        new com.payair.hce.findFragmentByTag(runintransaction);
        com.payair.hce.accessinternalBeginTransaction accessinternalbegintransaction = new com.payair.hce.accessinternalBeginTransaction(runintransaction);
        accessinternalbegintransaction.DigitizedCardProfile(false, new com.payair.hce.getErrorDialog(bArr2));
        byte[] bArr3 = new byte[accessinternalbegintransaction.valueOf(bArr.length)];
        try {
            accessinternalbegintransaction.values(bArr3, accessinternalbegintransaction.valueOf(bArr, 0, bArr.length, bArr3));
        } catch (com.payair.hce.getSuspendingTransactionId unused) {
        }
        java.lang.String replaceAll = new java.lang.String(bArr3).replaceAll("\u0000", "");
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 63;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            return replaceAll;
        }
        throw null;
    }

    private static java.lang.String IccPrivateKeyCrtComponentsJson() {
        com.payair.hce.setIsCredential RecordsJson2 = RecordsJson();
        com.payair.hce.setVisibility setvisibility = new com.payair.hce.setVisibility();
        com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson2 = RecordsJson2.AlternateContactlessPaymentDataJson(null, "CRYPTO_KEY", null);
        if (AlternateContactlessPaymentDataJson2 == null) {
            return null;
        }
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 43) % 128;
        com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson3 = setvisibility.AlternateContactlessPaymentDataJson(setvisibility.values(), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson2}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson2}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()));
        com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson3, "CRYPTO_SHARED_PREFERENCES"}, -497714482, 497714490, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson3));
        java.lang.String str = (java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson3}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson3));
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 21) % 128;
        return str;
    }

    private static java.lang.String getProfileVersion() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 63;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            java.lang.String str = writeReplace;
            if (str != null) {
                return str;
            }
            com.payair.hce.setIsCredential RecordsJson2 = RecordsJson();
            com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson2 = RecordsJson2.AlternateContactlessPaymentDataJson(null, "CRYPTO_SHARED_PREFERENCES", null);
            if (AlternateContactlessPaymentDataJson2 != null && ((java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson2}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2))) != null) {
                java.lang.String values2 = values(RecordsJson2, AlternateContactlessPaymentDataJson2);
                int i2 = RecordsJson + 15;
                SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
                if (i2 % 2 == 0) {
                    return values2;
                }
                throw null;
            }
            IccPrivateKeyCrtComponentsJson();
            return values(RecordsJson2, RecordsJson2.AlternateContactlessPaymentDataJson(null, "CRYPTO_SHARED_PREFERENCES", null));
        }
        throw null;
    }

    private static java.lang.String values(com.payair.hce.setIsCredential setiscredential, com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener) {
        com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson2 = setiscredential.AlternateContactlessPaymentDataJson(null, "CRYPTO_KEY", null);
        com.payair.hce.setVisibility setvisibility = new com.payair.hce.setVisibility();
        if (setoncapturedpointerlistener != null) {
            int i = RecordsJson + 83;
            SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
            if (i % 2 == 0) {
                java.lang.String str = (java.lang.String) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{setvisibility.DigitizedCardProfile((byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, -1049511775, 1049511786, java.lang.System.identityHashCode(setoncapturedpointerlistener))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, 2121132154, -2121132154, java.lang.System.identityHashCode(setoncapturedpointerlistener))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson2}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson2}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()))}, -5816740, 5816740, (int) java.lang.System.currentTimeMillis());
                writeReplace = str;
                return str;
            }
            writeReplace = (java.lang.String) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{setvisibility.DigitizedCardProfile((byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, -1049511775, 1049511786, java.lang.System.identityHashCode(setoncapturedpointerlistener))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, 2121132154, -2121132154, java.lang.System.identityHashCode(setoncapturedpointerlistener))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson2}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson2}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()))}, -5816740, 5816740, (int) java.lang.System.currentTimeMillis());
            throw new java.lang.ArithmeticException();
        }
        return "";
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 103) % 128;
        ae_(((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("PREFERENCE_DEFAULT_CARD", 0));
        ae_(((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("DIGITIZATION", 0));
        android.content.Context context = (android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("逵䢣厉☖陴\u007fş柌椧兰㚏杻椧兰䕊裥틬햕", 18 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
        ae_(context.getSharedPreferences(((java.lang.String) objArr2[0]).intern(), 0));
        android.content.SharedPreferences sharedPreferences = ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 0);
        boolean z = sharedPreferences.getBoolean("NEED_TO_RENEW_KEYS", false);
        int i = sharedPreferences.getInt("FlavourID", 0);
        java.lang.String string = sharedPreferences.getString("PACKAGE_NAME", null);
        T_("NEED_TO_RENEW_KEYS", z, sharedPreferences);
        X_("FlavourID", i, sharedPreferences);
        R_("PACKAGE_NAME", string, sharedPreferences);
        ab_("NEED_TO_RENEW_KEYS", sharedPreferences);
        ab_("FlavourID", sharedPreferences);
        ab_("PACKAGE_NAME", sharedPreferences);
        ae_(((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("SymmetricCryptoKeyIds", 0));
        ae_(((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("LocallyVerifiedValidator", 0));
        X_("SHARED_PREFERENCES_VERSION", 1, sharedPreferences);
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 73;
        RecordsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static void ae_(android.content.SharedPreferences sharedPreferences) {
        java.util.Map<java.lang.String, ?> all = sharedPreferences.getAll();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 89) % 128;
        for (java.util.Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
            if (entry.getKey() != null) {
                SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 91) % 128;
                if (entry.getValue() != null) {
                    if (entry.getValue().getClass() == java.lang.String.class) {
                        int i = RecordsJson + 31;
                        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
                        if (i % 2 != 0) {
                            throw new java.lang.ArithmeticException();
                        }
                        if (((java.lang.String) entry.getValue()).length() < 65504) {
                            R_(entry.getKey(), (java.lang.String) entry.getValue(), sharedPreferences);
                        }
                    } else if (entry.getValue().getClass() == java.lang.Integer.class) {
                        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 41;
                        RecordsJson = i2 % 128;
                        if (i2 % 2 == 0) {
                            X_(entry.getKey(), ((java.lang.Integer) entry.getValue()).intValue(), sharedPreferences);
                            throw null;
                        }
                        X_(entry.getKey(), ((java.lang.Integer) entry.getValue()).intValue(), sharedPreferences);
                    } else if (java.util.Set.class.isAssignableFrom(entry.getValue().getClass()) || entry.getValue().getClass() == java.util.HashSet.class) {
                        V_(entry.getKey(), (java.util.Set) entry.getValue(), sharedPreferences);
                    } else if (entry.getValue().getClass() == java.lang.Boolean.class) {
                        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 99) % 128;
                        T_(entry.getKey(), ((java.lang.Boolean) entry.getValue()).booleanValue(), sharedPreferences);
                    } else if (entry.getValue().getClass() == java.lang.Long.class) {
                        DigitizedCardProfile(new java.lang.Object[]{entry.getKey(), java.lang.Long.valueOf(((java.lang.Long) entry.getValue()).longValue()), sharedPreferences}, 1931623753, -1931623750, (int) java.lang.System.currentTimeMillis());
                    }
                }
            }
            arrayList.add(entry.getKey());
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ab_((java.lang.String) it.next(), sharedPreferences);
            RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 87) % 128;
        }
    }

    static void DigitizedCardProfile() {
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 57) % 128;
        android.content.Context context = (android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis());
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("逵䢣厉☖陴\u007fş柌椧兰㚏杻椧兰䕊裥틬햕", android.view.View.combineMeasuredStates(0, 0) + 18, objArr);
        context.getSharedPreferences(((java.lang.String) objArr[0]).intern(), 0).edit().clear().commit();
        ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("HCE_SHARED_PREFERENCES", 0).edit().clear().commit();
        ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("DIGITIZATION", 0).edit().clear().commit();
        ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("PREFERENCE_DEFAULT_CARD", 0).edit().clear().commit();
        ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("SymmetricCryptoKeyIds", 0).edit().clear().commit();
        ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getSharedPreferences("LocallyVerifiedValidator", 0).edit().clear().commit();
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 35;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void values() {
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 103) % 128;
        ((com.payair.hce.setVisibility) DigitizedCardProfile(new java.lang.Object[0], 273086409, -273086407, (int) java.lang.System.currentTimeMillis())).valueOf();
        DigitizedCardProfile = true;
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 65;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static com.payair.hce.setIsCredential RecordsJson() {
        com.payair.hce.setIsCredential setiscredential = new com.payair.hce.setIsCredential();
        int i = RecordsJson + 113;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return setiscredential;
        }
        throw null;
    }

    public static boolean AlternateContactlessPaymentDataJson() {
        int i = RecordsJson;
        SdkCoreAlternateContactlessPaymentDataImpl = (i + 85) % 128;
        boolean z = DigitizedCardProfile;
        int i2 = i + 91;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            return z;
        }
        throw null;
    }

    static void writeReplace() {
        int i = (RecordsJson + 77) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i;
        writeReplace = null;
        DigitizedCardProfile = false;
        RecordsJson = (i + 115) % 128;
    }

    static void SdkCoreAlternateContactlessPaymentDataImpl() {
        AlternateContactlessPaymentDataJson = (char) 12677;
        values = kotlin.text.Typography.greater;
        valueOf = (char) 28846;
        getProfileVersion = (char) 65497;
    }

    private static com.payair.hce.setVisibility getAid() {
        return (com.payair.hce.setVisibility) DigitizedCardProfile(new java.lang.Object[0], 273086409, -273086407, (int) java.lang.System.currentTimeMillis());
    }

    static void valueOf() {
        DigitizedCardProfile(new java.lang.Object[0], 1517807519, -1517807515, (int) java.lang.System.currentTimeMillis());
    }

    private static java.lang.String DigitizedCardProfile(byte[] bArr, byte[] bArr2) {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{bArr, bArr2}, 1850592019, -1850592019, (int) java.lang.System.currentTimeMillis());
    }

    private static java.lang.String AlternateContactlessPaymentDataJson(byte[] bArr, byte[] bArr2) {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{bArr, bArr2}, 1200702041, -1200702040, (int) java.lang.System.currentTimeMillis());
    }

    static void ac_(java.lang.String str, long j, android.content.SharedPreferences sharedPreferences) {
        DigitizedCardProfile(new java.lang.Object[]{str, java.lang.Long.valueOf(j), sharedPreferences}, 1931623753, -1931623750, (int) java.lang.System.currentTimeMillis());
    }

    static void init$0() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -26, -77, 102};
        $$b = 33;
    }
}
