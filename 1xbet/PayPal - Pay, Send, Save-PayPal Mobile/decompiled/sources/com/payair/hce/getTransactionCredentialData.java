package com.payair.hce;

/* loaded from: classes4.dex */
public class getTransactionCredentialData extends com.payair.hce.getReasonCode<com.payair.hce.transactionCanBeResumed> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static char valueOf;
    private static char[] values;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.getTransactionCredentialData gettransactioncredentialdata = (com.payair.hce.getTransactionCredentialData) objArr[0];
        DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 39) % 128;
        if ((((com.payair.hce.transactionCanBeResumed) gettransactioncredentialdata.writeReplace).AlternateContactlessPaymentDataJson(1) & 248) != 64) {
            return java.lang.Boolean.FALSE;
        }
        DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 101) % 128;
        return java.lang.Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5;
        int i6 = 1 - (i * 4);
        int i7 = i3 + 4;
        int i8 = 73 - (i2 * 8);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i9 = i6;
            i5 = 0;
            i8 += -i9;
            i4 = i5;
            i7++;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i8;
            if (i5 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i9 = bArr[i7];
            i8 += -i9;
            i4 = i5;
            i7++;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i8;
            if (i5 == i6) {
            }
        } else {
            i4 = 0;
            i7++;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i8;
            if (i5 == i6) {
            }
        }
    }

    /* synthetic */ getTransactionCredentialData(byte b) {
        this();
    }

    @Override // com.payair.hce.getReasonCode
    public final com.payair.hce.transactionCanBeResumed valueOf() {
        AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 37) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u0002\u0001㘜㘜", android.text.TextUtils.indexOf("", "", 0) + 4, (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 115), objArr);
        com.payair.hce.transactionCanBeResumed values2 = com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr[0]).intern());
        int i = DigitizedCardProfile + 13;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            return values2;
        }
        throw null;
    }

    private getTransactionCredentialData() {
        try {
            com.payair.hce.transactionCanBeResumed writeReplace = com.payair.hce.transactionCanBeResumed.writeReplace(3);
            super.valueOf(writeReplace);
            super.AlternateContactlessPaymentDataJson(writeReplace);
        } catch (com.payair.hce.postToastMessageOnUi unused) {
        }
    }

    public static com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed> values() {
        com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed> setmobilepin = new com.payair.hce.setMobilePin<com.payair.hce.transactionCanBeResumed>() { // from class: com.payair.hce.getTransactionCredentialData.3
            private static int valueOf = 0;
            private static int writeReplace = 1;

            public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
                com.payair.hce.getTransactionCredentialData gettransactioncredentialdata = new com.payair.hce.getTransactionCredentialData((byte) 0);
                int i4 = valueOf;
                writeReplace = (((i4 ^ 100) + ((i4 & 100) << 1)) - 1) % 128;
                return gettransactioncredentialdata;
            }

            @Override // com.payair.hce.setMobilePin
            public final com.payair.hce.getReasonCode<com.payair.hce.transactionCanBeResumed> valueOf() {
                return (com.payair.hce.getReasonCode) DigitizedCardProfile(new java.lang.Object[]{this}, -1981819009, 1981819009, java.lang.System.identityHashCode(this));
            }
        };
        int i = DigitizedCardProfile + 115;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            return setmobilepin;
        }
        throw null;
    }

    @Override // com.payair.hce.getReasonCode
    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.postToastMessageOnUi {
        AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 15) % 128;
        super.valueOf(transactioncanberesumed);
        super.AlternateContactlessPaymentDataJson(transactioncanberesumed);
        int i = DigitizedCardProfile + 69;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean DigitizedCardProfile() {
        AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 63) % 128;
        if (((com.payair.hce.transactionCanBeResumed) this.writeReplace).AlternateContactlessPaymentDataJson(1) == 8) {
            DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 57) % 128;
            return true;
        }
        int i = AlternateContactlessPaymentDataJson + 1;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getProfileVersion() {
        if ((((com.payair.hce.transactionCanBeResumed) this.writeReplace).AlternateContactlessPaymentDataJson(1) & 248) != 32) {
            return false;
        }
        int i = DigitizedCardProfile;
        AlternateContactlessPaymentDataJson = (i + 99) % 128;
        AlternateContactlessPaymentDataJson = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean RecordsJson() {
        if (!java.util.Arrays.equals(((com.payair.hce.transactionCanBeResumed) this.writeReplace).valueOf(), new byte[3])) {
            AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 117) % 128;
            return true;
        }
        int i = AlternateContactlessPaymentDataJson + 39;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x012c, code lost:
    
        if (r5.valueOf == r5.writeReplace) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0159, code lost:
    
        r8 = new java.lang.Object[]{r5, r5, java.lang.Integer.valueOf(r1), r5, r5, java.lang.Integer.valueOf(r1), r5, r5, java.lang.Integer.valueOf(r1), r5, r5, java.lang.Integer.valueOf(r1), r5};
        r7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a8, code lost:
    
        if (r7 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01aa, code lost:
    
        r7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 3596 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x022a, code lost:
    
        if (((java.lang.Integer) ((java.lang.reflect.Method) r7).invoke(null, r8)).intValue() != r5.SdkCoreAlternateContactlessPaymentDataImpl) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x022c, code lost:
    
        com.payair.hce.getTransactionCredentialData.$11 = (com.payair.hce.getTransactionCredentialData.$10 + 111) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0236, code lost:
    
        r8 = new java.lang.Object[]{r5, r5, java.lang.Integer.valueOf(r1), java.lang.Integer.valueOf(r1), r5, r5, java.lang.Integer.valueOf(r1), java.lang.Integer.valueOf(r1), r5, java.lang.Integer.valueOf(r1), r5};
        r7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0272, code lost:
    
        if (r7 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0274, code lost:
    
        r7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2664, (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 18889));
        r9 = new java.lang.Object[1];
        b(0, 0, -1, r9);
        r7 = r7.getMethod((java.lang.String) r9[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02e2, code lost:
    
        r7 = ((java.lang.Integer) ((java.lang.reflect.Method) r7).invoke(null, r8)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02ef, code lost:
    
        r8 = r5.AlternateContactlessPaymentDataJson;
        r9 = r5.SdkCoreAlternateContactlessPaymentDataImpl;
        r3[r5.values] = r6[r7];
        r3[r5.values + 1] = r6[(r8 * r1) + r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0307, code lost:
    
        if (r5.DigitizedCardProfile != r5.AlternateContactlessPaymentDataJson) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0309, code lost:
    
        r5.RecordsJson = ((r5.RecordsJson + r1) - 1) % r1;
        r5.SdkCoreAlternateContactlessPaymentDataImpl = ((r5.SdkCoreAlternateContactlessPaymentDataImpl + r1) - 1) % r1;
        r7 = r5.DigitizedCardProfile;
        r8 = r5.RecordsJson;
        r9 = r5.AlternateContactlessPaymentDataJson;
        r12 = r5.SdkCoreAlternateContactlessPaymentDataImpl;
        r3[r5.values] = r6[(r7 * r1) + r8];
        r3[r5.values + 1] = r6[(r9 * r1) + r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0331, code lost:
    
        r7 = r5.DigitizedCardProfile;
        r8 = r5.SdkCoreAlternateContactlessPaymentDataImpl;
        r9 = r5.AlternateContactlessPaymentDataJson;
        r12 = r5.RecordsJson;
        r3[r5.values] = r6[(r7 * r1) + r8];
        r3[r5.values + 1] = r6[(r9 * r1) + r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0142, code lost:
    
        r3[r5.values] = (char) (r5.valueOf - r30);
        r3[r5.values + 1] = (char) (r5.writeReplace - r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0140, code lost:
    
        if (r5.valueOf == r5.writeReplace) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3 = $10 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = values;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.text.TextUtils.lastIndexOf("", c, 0, 0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2508, (char) (android.view.KeyEvent.keyCodeFromString("") + 6802));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(0, 1, -1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i4++;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(valueOf)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1, android.view.View.MeasureSpec.getSize(0) + 2508, (char) (6802 - android.graphics.Color.alpha(0)));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(0, 1, -1, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
            $10 = ($11 + 119) % 128;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i5 = 0;
            while (true) {
                digitizedCardJson12.values = i5;
                if (digitizedCardJson12.values >= i2) {
                    break;
                }
                int i6 = $10 + 57;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values];
                } else {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                }
                i5 = digitizedCardJson12.values + 2;
            }
        }
        int i7 = 0;
        while (i7 < i) {
            int i8 = $11 + 73;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr3[i7] = (char) (cArr3[i7] ^ 11094);
                i7 += 108;
            } else {
                cArr3[i7] = (char) (cArr3[i7] ^ 13722);
                i7++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean AlternateContactlessPaymentDataJson() {
        if ((((com.payair.hce.transactionCanBeResumed) this.writeReplace).AlternateContactlessPaymentDataJson(1) & 32) != 0) {
            AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 15) % 128;
            if ((((com.payair.hce.transactionCanBeResumed) this.writeReplace).AlternateContactlessPaymentDataJson(1) & 64) != 0) {
                int i = AlternateContactlessPaymentDataJson + 69;
                DigitizedCardProfile = i % 128;
                return i % 2 != 0;
            }
        }
        return false;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        DigitizedCardProfile = 1;
        values = new char[]{12300, 12409, 12301, 12403};
        valueOf = (char) 1490;
    }

    static void init$0() {
        $$a = new byte[]{117, -13, -118, com.google.common.base.Ascii.RS};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
    }

    public final boolean writeReplace() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1157958198, -1157958198, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
