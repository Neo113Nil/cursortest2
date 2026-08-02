package com.payair.hce;

/* loaded from: classes4.dex */
public final class stopSelfResult implements com.payair.hce.ExpirationDate {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static boolean RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static boolean getAid;
    private static int valueOf;
    private static char[] writeReplace;
    private com.payair.hce.checkPermission AlternateContactlessPaymentDataJson;
    private java.util.List<com.payair.hce.ExpirationDate> DigitizedCardProfile;
    private java.util.List<com.payair.hce.ExpirationDate> values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = (i2 * 3) + 118;
        int i5 = (i * 3) + 4;
        int i6 = s * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i7;
            int i9 = 0;
            i4 += i8;
            i5++;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i5];
            i4 += i8;
            i5++;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = (i * 50) + (i2 * (-97)) + (((~(i4 | i5)) | (~(i4 | i))) * 98) + (((~(i5 | (~i))) | i4 | (~(i | i3))) * (-49)) + (((~(i | i2)) | (~(i3 | i4))) * 49);
        if (i6 == 1) {
            return writeReplace(objArr);
        }
        if (i6 == 2) {
            return valueOf(objArr);
        }
        if (i6 != 3) {
            if (i6 != 4) {
                return values(objArr);
            }
            com.payair.hce.stopSelfResult stopselfresult = (com.payair.hce.stopSelfResult) objArr[0];
            java.lang.String str = (java.lang.String) objArr[1];
            int intValue = ((java.lang.Number) objArr[2]).intValue();
            java.lang.String str2 = (java.lang.String) objArr[3];
            java.lang.String str3 = (java.lang.String) objArr[4];
            java.lang.Exception exc = (java.lang.Exception) objArr[5];
            java.util.Iterator<com.payair.hce.ExpirationDate> it = stopselfresult.values.iterator();
            int i7 = IccPrivateKeyCrtComponentsJson + 59;
            SdkCoreAlternateContactlessPaymentDataImpl = i7 % 128;
            int i8 = i7 % 2;
            while (it.hasNext()) {
                IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 39) % 128;
                it.next().writeReplace(str, intValue, str2, str3, exc);
                SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 95) % 128;
            }
            java.util.Iterator<com.payair.hce.ExpirationDate> it2 = stopselfresult.DigitizedCardProfile.iterator();
            while (it2.hasNext()) {
                it2.next().writeReplace(str, intValue, str2, str3, exc);
            }
            return null;
        }
        com.payair.hce.stopSelfResult stopselfresult2 = (com.payair.hce.stopSelfResult) objArr[0];
        java.lang.String str4 = (java.lang.String) objArr[1];
        java.lang.String str5 = (java.lang.String) objArr[2];
        java.lang.String str6 = (java.lang.String) objArr[3];
        java.lang.Exception exc2 = (java.lang.Exception) objArr[4];
        java.util.Iterator<com.payair.hce.ExpirationDate> it3 = stopselfresult2.values.iterator();
        while (it3.hasNext()) {
            it3.next().valueOf(str4, str5, str6, exc2);
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it4 = stopselfresult2.DigitizedCardProfile.iterator();
        int i9 = SdkCoreAlternateContactlessPaymentDataImpl + 21;
        while (true) {
            IccPrivateKeyCrtComponentsJson = i9 % 128;
            if (!it4.hasNext()) {
                return null;
            }
            it4.next().valueOf(str4, str5, str6, exc2);
            i9 = SdkCoreAlternateContactlessPaymentDataImpl + 99;
        }
    }

    public stopSelfResult() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(127 - android.view.Gravity.getAbsoluteGravity(0, 0), null, null, "\u0084\u0085\u0084\u0083\u0082\u0081", objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.onTaskRemoved.class.getName());
        this.AlternateContactlessPaymentDataJson = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        this.values = new java.util.ArrayList();
        this.DigitizedCardProfile = new java.util.ArrayList();
    }

    public final void AlternateContactlessPaymentDataJson(com.payair.hce.ExpirationDate expirationDate) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 55;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            this.values.add(expirationDate);
        } else {
            this.values.add(expirationDate);
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void DigitizedCardProfile(com.payair.hce.checkForSuccess checkforsuccess, java.lang.String str) {
        java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
        while (it.hasNext()) {
            it.next().DigitizedCardProfile(checkforsuccess, str);
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
        while (it2.hasNext()) {
            it2.next().DigitizedCardProfile(checkforsuccess, str);
            int i = SdkCoreAlternateContactlessPaymentDataImpl + 65;
            IccPrivateKeyCrtComponentsJson = i % 128;
            int i2 = i % 2;
        }
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 15) % 128;
    }

    @Override // com.payair.hce.ExpirationDate
    public final void valueOf(java.lang.String str) {
        int i = IccPrivateKeyCrtComponentsJson + 9;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
            while (it.hasNext()) {
                int i2 = IccPrivateKeyCrtComponentsJson + 1;
                SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
                if (i2 % 2 == 0) {
                    it.next().valueOf(str);
                } else {
                    it.next().valueOf(str);
                    throw new java.lang.ArithmeticException();
                }
            }
            java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
            while (it2.hasNext()) {
                it2.next().valueOf(str);
            }
            return;
        }
        this.values.iterator();
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.ExpirationDate
    public final void values(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
        while (it.hasNext()) {
            int i2 = IccPrivateKeyCrtComponentsJson + 83;
            SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
            if (i2 % 2 == 0) {
                it.next().values(str, i, str2, str3, exc);
            } else {
                it.next().values(str, i, str2, str3, exc);
                throw null;
            }
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
        while (it2.hasNext()) {
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 97) % 128;
            it2.next().values(str, i, str2, str3, exc);
            SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 63) % 128;
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void values(int i, java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 9) % 128;
        java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
        while (it.hasNext()) {
            SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 81) % 128;
            it.next().values(i, str, str2, exc);
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
        while (it2.hasNext()) {
            it2.next().values(i, str, str2, exc);
        }
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        int i2;
        int length;
        char[] cArr;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr2 = writeReplace;
        if (cArr2 != null) {
            int i3 = $11 + 97;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i4])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 46336))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $10 = ($11 + 47) % 128;
            cArr2 = cArr;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(valueOf)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777262, 286 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (46336 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (getAid) {
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr2[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 43, 1629 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(0, (short) 0, 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (!RecordsJson) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                int i5 = $10 + 43;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    cArr4[getumdgeneration.valueOf] = (char) (cArr2[iArr[getumdgeneration.values >>> getumdgeneration.valueOf] << i] >>> intValue);
                    i2 = getumdgeneration.valueOf;
                } else {
                    cArr4[getumdgeneration.valueOf] = (char) (cArr2[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                    i2 = getumdgeneration.valueOf + 1;
                }
                getumdgeneration.valueOf = i2;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr2[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.graphics.Color.rgb(0, 0, 0) + 16778845, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(0, (short) 0, 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    @Override // com.payair.hce.ExpirationDate
    public final void valueOf() {
        int i = IccPrivateKeyCrtComponentsJson + 35;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
            while (it.hasNext()) {
                int i2 = IccPrivateKeyCrtComponentsJson + 25;
                SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
                if (i2 % 2 == 0) {
                    it.next().valueOf();
                } else {
                    it.next().valueOf();
                    throw new java.lang.ArithmeticException();
                }
            }
            java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
            while (it2.hasNext()) {
                it2.next().valueOf();
            }
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 19) % 128;
            return;
        }
        this.values.iterator();
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.stopSelfResult stopselfresult = (com.payair.hce.stopSelfResult) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 83;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            stopselfresult.values.iterator();
            throw null;
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it = stopselfresult.values.iterator();
        while (it.hasNext()) {
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 97) % 128;
            it.next().DigitizedCardProfile(str);
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = stopselfresult.DigitizedCardProfile.iterator();
        while (it2.hasNext()) {
            SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 73) % 128;
            it2.next().DigitizedCardProfile(str);
        }
        return null;
    }

    @Override // com.payair.hce.ExpirationDate
    public final void AlternateContactlessPaymentDataJson(int i, java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 103;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 == 0) {
            this.values.iterator();
            throw null;
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
        while (it.hasNext()) {
            int i3 = SdkCoreAlternateContactlessPaymentDataImpl + 85;
            IccPrivateKeyCrtComponentsJson = i3 % 128;
            if (i3 % 2 == 0) {
                it.next().AlternateContactlessPaymentDataJson(i, str, str2, exc);
                throw null;
            }
            it.next().AlternateContactlessPaymentDataJson(i, str, str2, exc);
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 73) % 128;
        while (it2.hasNext()) {
            SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 73) % 128;
            it2.next().AlternateContactlessPaymentDataJson(i, str, str2, exc);
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void writeReplace() {
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 99) % 128;
        java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
        while (it.hasNext()) {
            it.next().writeReplace();
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
        while (it2.hasNext()) {
            int i = IccPrivateKeyCrtComponentsJson + 109;
            SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
            if (i % 2 == 0) {
                it2.next().writeReplace();
            } else {
                it2.next().writeReplace();
                throw null;
            }
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void valueOf(java.lang.String str, java.lang.String str2, java.util.List<com.payair.hce.isNetworkError> list) {
        int i = IccPrivateKeyCrtComponentsJson + 49;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
            while (it.hasNext()) {
                it.next().valueOf(str, str2, list);
            }
            java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
            int i2 = IccPrivateKeyCrtComponentsJson + 19;
            SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
            int i3 = i2 % 2;
            while (it2.hasNext()) {
                it2.next().valueOf(str, str2, list);
            }
            return;
        }
        this.values.iterator();
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.ExpirationDate
    public final void AlternateContactlessPaymentDataJson(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Exception exc) {
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 117) % 128;
        java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
        while (it.hasNext()) {
            it.next().AlternateContactlessPaymentDataJson(str, str2, str3, str4, exc);
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
        while (it2.hasNext()) {
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 75) % 128;
            it2.next().AlternateContactlessPaymentDataJson(str, str2, str3, str4, exc);
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void valueOf(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Exception exc) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 125;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            this.values.iterator();
            throw new java.lang.ArithmeticException();
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 89) % 128;
        while (it.hasNext()) {
            it.next().valueOf(str, str2, str3, str4, exc);
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 99) % 128;
        while (it2.hasNext()) {
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 75) % 128;
            it2.next().valueOf(str, str2, str3, str4, exc);
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void values(java.lang.String str, java.lang.String str2) {
        java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
        while (it.hasNext()) {
            int i = SdkCoreAlternateContactlessPaymentDataImpl + 59;
            IccPrivateKeyCrtComponentsJson = i % 128;
            if (i % 2 != 0) {
                it.next().values(str, str2);
            } else {
                it.next().values(str, str2);
                throw new java.lang.ArithmeticException();
            }
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
        while (it2.hasNext()) {
            int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 31;
            IccPrivateKeyCrtComponentsJson = i2 % 128;
            if (i2 % 2 != 0) {
                it2.next().values(str, str2);
            } else {
                it2.next().values(str, str2);
                throw null;
            }
        }
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 37) % 128;
    }

    @Override // com.payair.hce.ExpirationDate
    public final void values(java.lang.String str) {
        java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
        while (it.hasNext()) {
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 119) % 128;
            it.next().values(str);
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 15) % 128;
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
        while (it2.hasNext()) {
            it2.next().values(str);
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 79) % 128;
        }
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.stopSelfResult stopselfresult = (com.payair.hce.stopSelfResult) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        java.lang.String str2 = (java.lang.String) objArr[2];
        java.lang.Exception exc = (java.lang.Exception) objArr[3];
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 41) % 128;
        java.util.Iterator<com.payair.hce.ExpirationDate> it = stopselfresult.values.iterator();
        while (it.hasNext()) {
            SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 43) % 128;
            it.next().writeReplace(str, str2, exc);
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = stopselfresult.DigitizedCardProfile.iterator();
        while (it2.hasNext()) {
            it2.next().writeReplace(str, str2, exc);
        }
        int i = IccPrivateKeyCrtComponentsJson + 73;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.payair.hce.ExpirationDate
    public final void valueOf(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
        while (it.hasNext()) {
            it.next().valueOf(str, str2, exc);
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
        while (it2.hasNext()) {
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 85) % 128;
            it2.next().valueOf(str, str2, exc);
        }
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 31) % 128;
    }

    @Override // com.payair.hce.ExpirationDate
    public final void DigitizedCardProfile() {
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 13) % 128;
        java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
        while (it.hasNext()) {
            SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 65) % 128;
            it.next().DigitizedCardProfile();
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
        while (it2.hasNext()) {
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 41) % 128;
            it2.next().DigitizedCardProfile();
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
        while (it.hasNext()) {
            it.next().AlternateContactlessPaymentDataJson(str);
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
        while (it2.hasNext()) {
            int i = IccPrivateKeyCrtComponentsJson + 95;
            SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
            if (i % 2 == 0) {
                it2.next().AlternateContactlessPaymentDataJson(str);
                SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 3) % 128;
            } else {
                it2.next().AlternateContactlessPaymentDataJson(str);
                throw new java.lang.ArithmeticException();
            }
        }
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.stopSelfResult stopselfresult = (com.payair.hce.stopSelfResult) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 119;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            java.util.Iterator<com.payair.hce.ExpirationDate> it = stopselfresult.values.iterator();
            while (it.hasNext()) {
                it.next().IccPrivateKeyCrtComponentsJson();
            }
            java.util.Iterator<com.payair.hce.ExpirationDate> it2 = stopselfresult.DigitizedCardProfile.iterator();
            while (it2.hasNext()) {
                it2.next().IccPrivateKeyCrtComponentsJson();
            }
            SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 31) % 128;
            return null;
        }
        stopselfresult.values.iterator();
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.ExpirationDate
    public final void valueOf(com.payair.hce.checkForSuccess checkforsuccess, java.lang.String str) {
        java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
        while (it.hasNext()) {
            int i = SdkCoreAlternateContactlessPaymentDataImpl + 121;
            IccPrivateKeyCrtComponentsJson = i % 128;
            if (i % 2 != 0) {
                it.next().valueOf(checkforsuccess, str);
            } else {
                it.next().valueOf(checkforsuccess, str);
                throw new java.lang.ArithmeticException();
            }
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
        while (it2.hasNext()) {
            int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 5;
            IccPrivateKeyCrtComponentsJson = i2 % 128;
            if (i2 % 2 != 0) {
                it2.next().valueOf(checkforsuccess, str);
            } else {
                it2.next().valueOf(checkforsuccess, str);
                throw new java.lang.ArithmeticException();
            }
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void RecordsJson() {
        int i = IccPrivateKeyCrtComponentsJson + 59;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            this.values.iterator();
            throw null;
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
        while (it.hasNext()) {
            it.next().RecordsJson();
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 113) % 128;
        while (it2.hasNext()) {
            it2.next().RecordsJson();
        }
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 63) % 128;
    }

    @Override // com.payair.hce.ExpirationDate
    public final void DigitizedCardProfile(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 9) % 128;
        java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
        while (it.hasNext()) {
            it.next().DigitizedCardProfile(str, str2, exc);
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
        while (it2.hasNext()) {
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 9) % 128;
            it2.next().DigitizedCardProfile(str, str2, exc);
        }
        IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 47) % 128;
    }

    @Override // com.payair.hce.ExpirationDate
    public final void AlternateContactlessPaymentDataJson(java.lang.String str, java.lang.String str2) {
        java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
        while (it.hasNext()) {
            int i = SdkCoreAlternateContactlessPaymentDataImpl + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            IccPrivateKeyCrtComponentsJson = i % 128;
            if (i % 2 != 0) {
                it.next().AlternateContactlessPaymentDataJson(str, str2);
            } else {
                it.next().AlternateContactlessPaymentDataJson(str, str2);
                throw null;
            }
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
        while (it2.hasNext()) {
            SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 99) % 128;
            it2.next().AlternateContactlessPaymentDataJson(str, str2);
            int i2 = IccPrivateKeyCrtComponentsJson + 69;
            SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void IccPrivateKeyCrtComponentsJson(java.lang.String str) {
        java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
        while (it.hasNext()) {
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 63) % 128;
            it.next().IccPrivateKeyCrtComponentsJson(str);
            int i = SdkCoreAlternateContactlessPaymentDataImpl + 37;
            IccPrivateKeyCrtComponentsJson = i % 128;
            if (i % 2 == 0) {
                int i2 = 3 / 2;
            }
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
        while (it2.hasNext()) {
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 119) % 128;
            it2.next().IccPrivateKeyCrtComponentsJson(str);
            SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 39) % 128;
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void RecordsJson(java.lang.String str) {
        java.util.Iterator<com.payair.hce.ExpirationDate> it = this.values.iterator();
        while (it.hasNext()) {
            it.next().RecordsJson(str);
        }
        java.util.Iterator<com.payair.hce.ExpirationDate> it2 = this.DigitizedCardProfile.iterator();
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 99) % 128;
        while (it2.hasNext()) {
            it2.next().RecordsJson(str);
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 35) % 128;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        writeReplace = new char[]{11047, 11094, 11055, 11122, 11038};
        valueOf = -143185262;
        RecordsJson = true;
        getAid = true;
    }

    @Override // com.payair.hce.ExpirationDate
    public final void valueOf(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        valueOf(new java.lang.Object[]{this, str, str2, str3, exc}, 55001251, -55001248, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.ExpirationDate
    public final void IccPrivateKeyCrtComponentsJson() {
        valueOf(new java.lang.Object[]{this}, 75894454, -75894453, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.ExpirationDate
    public final void writeReplace(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        valueOf(new java.lang.Object[]{this, str, str2, exc}, -2031374810, 2031374810, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.ExpirationDate
    public final void writeReplace(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        valueOf(new java.lang.Object[]{this, str, java.lang.Integer.valueOf(i), str2, str3, exc}, -1519845920, 1519845924, i);
    }

    static void init$0() {
        $$a = new byte[]{89, 43, 98, -67};
        $$b = 157;
    }

    @Override // com.payair.hce.ExpirationDate
    public final void DigitizedCardProfile(java.lang.String str) {
        valueOf(new java.lang.Object[]{this, str}, -1705388261, 1705388263, java.lang.System.identityHashCode(this));
    }
}
