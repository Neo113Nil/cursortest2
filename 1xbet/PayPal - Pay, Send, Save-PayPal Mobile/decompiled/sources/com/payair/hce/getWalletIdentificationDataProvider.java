package com.payair.hce;

/* loaded from: classes4.dex */
public final class getWalletIdentificationDataProvider implements com.payair.hce.onIdentify {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int valueOf;
    private com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson;
    private com.payair.hce.transactionCanBeResumed values;
    private com.payair.hce.transactionCanBeResumed writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = (b * 3) + 115;
        int i4 = i * 4;
        byte[] bArr = $$a;
        int i5 = s + 4;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i3 += i5;
            i5 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            int i8 = i5 + 1;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i2 + 1;
            i6 = i8;
            i5 = bArr[i8];
            i7 = i9;
            i3 += i5;
            i5 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            int i82 = i5 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            int i822 = i5 + 1;
            if (i2 == i4) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~i3;
        if ((i * (-209)) + (i2 * (-209)) + ((~(i4 | i5)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + (((~(i5 | i6)) | (~(i4 | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + (((~(i | i5 | i3)) | (~(i2 | i4 | i6))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) == 1) {
            return DigitizedCardProfile(objArr);
        }
        com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider = (com.payair.hce.getWalletIdentificationDataProvider) objArr[0];
        SdkCoreAlternateContactlessPaymentDataImpl = (DigitizedCardProfile + 19) % 128;
        com.payair.hce.setMaximumPinTry.valueOf();
        android.graphics.Color.alpha(0);
        android.view.ViewConfiguration.getScrollBarSize();
        android.view.ViewConfiguration.getJumpTapTimeout();
        new java.lang.Object[]{getwalletidentificationdataprovider.values.writeReplace(), getwalletidentificationdataprovider.writeReplace.writeReplace(), getwalletidentificationdataprovider.AlternateContactlessPaymentDataJson.writeReplace()};
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(false, "\u0007\u0011￪�\u0005\u0000\ufffe\u000f\uffef", android.view.View.getDefaultSize(0, 0) + 109, 9 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 9, objArr2);
        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
        DigitizedCardProfile = (SdkCoreAlternateContactlessPaymentDataImpl + 71) % 128;
        return intern;
    }

    public getWalletIdentificationDataProvider(com.payair.hce.transactionCanBeResumed transactioncanberesumed, com.payair.hce.transactionCanBeResumed transactioncanberesumed2) throws com.payair.hce.generateExpiryDate, com.payair.hce.postToastMessageOnUi, com.payair.hce.createDemoTransactionCredentials {
        if (!com.payair.hce.onRequestSessionCompleted.DigitizedCardProfile(transactioncanberesumed)) {
            throw new com.payair.hce.createDemoTransactionCredentials();
        }
        if (transactioncanberesumed2 == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(true, "\u0012\u001b\ufff4\u000b\u001b\u0012\u0007\u001cￆ￼\ufff2\ufffaￆ\u0012", 98 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 3 - android.graphics.Color.argb(0, 0, 0, 0), 14 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
            throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr[0]).intern());
        }
        this.values = transactioncanberesumed;
        this.writeReplace = com.payair.hce.onRequestSessionCompleted.values(transactioncanberesumed2.DigitizedCardProfile());
        this.AlternateContactlessPaymentDataJson = transactioncanberesumed2;
    }

    public getWalletIdentificationDataProvider(com.payair.hce.transactionCanBeResumed transactioncanberesumed, com.payair.hce.getWalletIdentificationDataProvider[] getwalletidentificationdataproviderArr) throws com.payair.hce.generateExpiryDate, com.payair.hce.postToastMessageOnUi, com.payair.hce.createDemoTransactionCredentials {
        this(transactioncanberesumed, com.payair.hce.onRequestSessionCompleted.values(getwalletidentificationdataproviderArr));
    }

    public getWalletIdentificationDataProvider(com.payair.hce.transactionCanBeResumed transactioncanberesumed, java.lang.Iterable<com.payair.hce.getWalletIdentificationDataProvider> iterable) throws com.payair.hce.generateExpiryDate, com.payair.hce.postToastMessageOnUi, com.payair.hce.createDemoTransactionCredentials {
        this(transactioncanberesumed, com.payair.hce.onRequestSessionCompleted.values(iterable));
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        if (str != null) {
            int i4 = $11 + 59;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr4 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            digitizedCardJson11.values = cArr3[digitizedCardJson11.DigitizedCardProfile];
            cArr4[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i5 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr4[i5]), java.lang.Integer.valueOf(valueOf)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2073 - android.graphics.Color.red(0), (char) (60036 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, (short) -1, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr4[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.text.TextUtils.indexOf("", "", 0, 0), 3543 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.text.TextUtils.getOffsetAfter("", 0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
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
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr4, 0, cArr5, 0, i3);
            java.lang.System.arraycopy(cArr5, 0, cArr4, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr5, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr4, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            int i6 = $11 + 5;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2 = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 1;
            } else {
                cArr2 = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 0;
            }
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                $11 = ($10 + 107) % 128;
                cArr2[digitizedCardJson11.DigitizedCardProfile] = cArr4[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.graphics.Color.green(0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 3543, (char) android.text.TextUtils.indexOf("", "", 0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr4 = cArr2;
        }
        java.lang.String str2 = new java.lang.String(cArr4);
        int i7 = $10 + 75;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str2;
    }

    public final com.payair.hce.transactionCanBeResumed DigitizedCardProfile() {
        SdkCoreAlternateContactlessPaymentDataImpl = (DigitizedCardProfile + 89) % 128;
        com.payair.hce.transactionCanBeResumed writeReplace = com.payair.hce.transactionCanBeResumed.writeReplace(((java.lang.Integer) values(new java.lang.Object[]{this}, -1698785018, 1698785019, java.lang.System.identityHashCode(this))).intValue());
        try {
            writeReplace.valueOf(0, this.values.valueOf());
            writeReplace.valueOf(this.values.DigitizedCardProfile(), this.writeReplace.valueOf());
            writeReplace.valueOf(this.values.DigitizedCardProfile() + this.writeReplace.DigitizedCardProfile(), this.AlternateContactlessPaymentDataJson.valueOf());
            int i = SdkCoreAlternateContactlessPaymentDataImpl + 63;
            DigitizedCardProfile = i % 128;
            if (i % 2 != 0) {
                int i2 = 4 / 4;
            }
            return writeReplace;
        } catch (com.payair.hce.postToastMessageOnUi e) {
            try {
                throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.Throwable.class).newInstance(e));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int DigitizedCardProfile2;
        com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider = (com.payair.hce.getWalletIdentificationDataProvider) objArr[0];
        int i = DigitizedCardProfile + 63;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            DigitizedCardProfile2 = (getwalletidentificationdataprovider.values.DigitizedCardProfile() / getwalletidentificationdataprovider.writeReplace.DigitizedCardProfile()) >> getwalletidentificationdataprovider.AlternateContactlessPaymentDataJson.DigitizedCardProfile();
        } else {
            DigitizedCardProfile2 = getwalletidentificationdataprovider.AlternateContactlessPaymentDataJson.DigitizedCardProfile() + getwalletidentificationdataprovider.values.DigitizedCardProfile() + getwalletidentificationdataprovider.writeReplace.DigitizedCardProfile();
        }
        int i2 = DigitizedCardProfile + 13;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 != 0) {
            return java.lang.Integer.valueOf(DigitizedCardProfile2);
        }
        throw null;
    }

    public final com.payair.hce.transactionCanBeResumed valueOf() {
        int i = DigitizedCardProfile + 113;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            return this.values;
        }
        throw null;
    }

    public final com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 61;
        DigitizedCardProfile = i % 128;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.AlternateContactlessPaymentDataJson;
        if (i % 2 == 0) {
            return transactioncanberesumed;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.transactionCanBeResumed RecordsJson() {
        int i = (SdkCoreAlternateContactlessPaymentDataImpl + 97) % 128;
        DigitizedCardProfile = i;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.writeReplace;
        int i2 = i + 85;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 != 0) {
            return transactioncanberesumed;
        }
        throw null;
    }

    public static com.payair.hce.getWalletIdentificationDataProvider writeReplace(byte[] bArr) throws com.payair.hce.createDemoTransactionCredentials, com.payair.hce.postToastMessageOnUi, com.payair.hce.generateExpiryDate {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 117;
        DigitizedCardProfile = i % 128;
        return DigitizedCardProfile(bArr, i % 2 != 0 ? 1 : 0);
    }

    private static com.payair.hce.getWalletIdentificationDataProvider DigitizedCardProfile(byte[] bArr, int i) throws com.payair.hce.createDemoTransactionCredentials, com.payair.hce.postToastMessageOnUi, com.payair.hce.generateExpiryDate {
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 63;
        int i3 = i2 % 128;
        DigitizedCardProfile = i3;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (bArr != null) {
            SdkCoreAlternateContactlessPaymentDataImpl = (i3 + 55) % 128;
            if (bArr.length > 0) {
                if (i < 0) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a(false, "\u000e\t\u0014\t\u0001\f\uffc0\u000f\u0006\u0006\u0013\u0005\u0014\uffc0\u0003\u0001\u000e\u000e\u000f\u0014\uffc0\u0002\u0005\uffc0\u000e\u0005\u0007\u0001\u0014\t\u0016\u0005￩", android.graphics.Color.argb(0, 0, 0, 0) + 104, 32 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 33, objArr);
                    throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr[0]).intern());
                }
                if (i >= bArr.length) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(true, "\u0014\u0007\u0007\u0010\uffc1\r\u0002\n\u0015\n\u000f￪\u001a\u0002\u0013\u0013\u0002\uffc1\u0006\t\u0015\uffc1\u0005\u000f\u0010\u001a\u0006\u0003\uffc1\u0014\n\uffc1\u0015\u0006", 103 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 34, objArr2);
                    throw new com.payair.hce.generateExpiryDate(((java.lang.String) objArr2[0]).intern());
                }
                com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson = com.payair.hce.onRequestSessionCompleted.AlternateContactlessPaymentDataJson(bArr, i);
                if (bArr.length <= AlternateContactlessPaymentDataJson.DigitizedCardProfile() + i) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(false, "\u000f\u0014ￆ\u0012\u000b\u0014\r\u001a\u000eￆ\f\u000f\u000b\u0012\nￆￎ\u0014\u0015ￆ\u0012\u000b\u0014\r\u001a\u000eￆ\f\u000f\u000b\u0012\nￏ\ufff4\u0015\u001aￆ\u000b\u0014\u0015\u001b\r\u000eￆ\n\u0007\u001a\u0007ￆ", 97 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 33 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 48 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr3);
                    throw new com.payair.hce.generateExpiryDate(((java.lang.String) objArr3[0]).intern());
                }
                int writeReplace = com.payair.hce.onRequestSessionCompleted.writeReplace(bArr[AlternateContactlessPaymentDataJson.DigitizedCardProfile() + i]);
                long DigitizedCardProfile2 = com.payair.hce.onRequestSessionCompleted.DigitizedCardProfile(bArr, AlternateContactlessPaymentDataJson.DigitizedCardProfile() + i);
                if (DigitizedCardProfile2 > 1342177271) {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(false, "\u001f\u001a\u001aￋ\r\u0014\u0012ￋ\u0019 \u0018\r\u0010\u001d\uffd9ￋ\ufff8\f#ￋ\u0014\u001eￋￜ\uffde\uffdf\uffddￜ￢￢\uffdd￢ￜ\uffff\u0013\u0010ￋ\u0017\u0010\u0019\u0012\u001f\u0013ￋ\u001b\f\u001d\u001fￋ\u001d\u0010\u001b\u001d\u0010\u001e\u0010\u0019\u001f\u001eￋ", 92 - android.os.Process.getGidForName(""), 33 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 60 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr4);
                    throw new com.payair.hce.generateExpiryDate(((java.lang.String) objArr4[0]).intern());
                }
                if (bArr.length < AlternateContactlessPaymentDataJson.DigitizedCardProfile() + i + writeReplace + DigitizedCardProfile2) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a(true, "\f\tￃ\b\u0018\u000f\u0004\u0019ￃ\u0011\fￃ\u0004\u0017\u0004\u0007ￃ\u000b\n\u0018\u0012\u0011\bￃ\u0017\u0012\ufff1\u0007\u000f\b", 101 - android.text.TextUtils.indexOf("", "", 0, 0), 28 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 30 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr5);
                    throw new com.payair.hce.generateExpiryDate(((java.lang.String) objArr5[0]).intern());
                }
                int i4 = (int) DigitizedCardProfile2;
                com.payair.hce.transactionCanBeResumed writeReplace2 = com.payair.hce.transactionCanBeResumed.writeReplace(i4);
                writeReplace2.valueOf(0, bArr, i + AlternateContactlessPaymentDataJson.DigitizedCardProfile() + writeReplace, i4);
                return new com.payair.hce.getWalletIdentificationDataProvider(AlternateContactlessPaymentDataJson, writeReplace2);
            }
        }
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(false, "\u001a\uffc1\n\u000f\u0011\u0016\u0015\uffc1\u0005\u0002\u0015\u0002\uffef\u0016\r\r\uffc1\u0010\u0013\uffc1\u0006\u000e\u0011\u0015", android.view.View.resolveSize(0, 0) + 103, 12 - android.graphics.Color.green(0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, objArr6);
        throw new com.payair.hce.postToastMessageOnUi(((java.lang.String) objArr6[0]).intern());
    }

    public static java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> AlternateContactlessPaymentDataJson(com.payair.hce.transactionCanBeResumed transactioncanberesumed, int i) throws com.payair.hce.generateExpiryDate, com.payair.hce.createDemoTransactionCredentials, com.payair.hce.postToastMessageOnUi {
        java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> linkedHashMap = new java.util.LinkedHashMap<>();
        DigitizedCardProfile = (SdkCoreAlternateContactlessPaymentDataImpl + 23) % 128;
        while (i < transactioncanberesumed.DigitizedCardProfile()) {
            int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 43;
            DigitizedCardProfile = i2 % 128;
            if (i2 % 2 != 0) {
                com.payair.hce.getWalletIdentificationDataProvider DigitizedCardProfile2 = DigitizedCardProfile(transactioncanberesumed.valueOf(), i);
                linkedHashMap.put(DigitizedCardProfile2.valueOf(), DigitizedCardProfile2);
                i *= ((java.lang.Integer) values(new java.lang.Object[]{DigitizedCardProfile2}, -1698785018, 1698785019, java.lang.System.identityHashCode(DigitizedCardProfile2))).intValue();
            } else {
                com.payair.hce.getWalletIdentificationDataProvider DigitizedCardProfile3 = DigitizedCardProfile(transactioncanberesumed.valueOf(), i);
                linkedHashMap.put(DigitizedCardProfile3.valueOf(), DigitizedCardProfile3);
                i += ((java.lang.Integer) values(new java.lang.Object[]{DigitizedCardProfile3}, -1698785018, 1698785019, java.lang.System.identityHashCode(DigitizedCardProfile3))).intValue();
            }
        }
        return linkedHashMap;
    }

    @Override // com.payair.hce.onIdentify
    public final void values() {
        DigitizedCardProfile = (SdkCoreAlternateContactlessPaymentDataImpl + 113) % 128;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        valueOf = 1889207145;
    }

    public final java.lang.String toString() {
        return (java.lang.String) values(new java.lang.Object[]{this}, 949032680, -949032680, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{7, -84, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FF};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE;
    }

    public final int writeReplace() {
        return ((java.lang.Integer) values(new java.lang.Object[]{this}, -1698785018, 1698785019, java.lang.System.identityHashCode(this))).intValue();
    }
}
