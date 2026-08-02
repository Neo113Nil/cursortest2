package com.payair.hce;

/* loaded from: classes4.dex */
public final class internalEndTransaction {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static java.util.Hashtable SdkCoreAlternateContactlessPaymentDataImpl;
    private static boolean SdkCoreBusinessLogicModuleImpl;
    private static int getCiacDecline;
    private static int getCvrMaskAnd;
    private static int getGpoResponse;
    private static boolean getPaymentFci;
    private com.payair.hce.isUserRecoverableError AlternateContactlessPaymentDataJson;
    private com.payair.hce.getTransactionExecutor DigitizedCardProfile;
    private byte[] getAid;
    private byte[] getProfileVersion;
    private int valueOf;
    private com.payair.hce.isUserRecoverableError values;
    private int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = (i * 3) + 4;
        int i6 = 118 - (i2 * 3);
        int i7 = (b * 2) + 1;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i6 += -i8;
            i5++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i5];
            i6 += -i8;
            i5++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getGpoResponse = 0;
        getCvrMaskAnd = 1;
        DigitizedCardProfile();
        java.util.Hashtable hashtable = new java.util.Hashtable();
        SdkCoreAlternateContactlessPaymentDataImpl = hashtable;
        java.lang.Object[] objArr = new java.lang.Object[1];
        b(null, null, 127 - android.view.KeyEvent.getDeadChar(0, 0), "\u0087\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        hashtable.put(((java.lang.String) objArr[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(32));
        java.util.Hashtable hashtable2 = SdkCoreAlternateContactlessPaymentDataImpl;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b(null, null, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 'O', "\u008a\u0089\u0088", objArr2);
        hashtable2.put(((java.lang.String) objArr2[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(16));
        java.util.Hashtable hashtable3 = SdkCoreAlternateContactlessPaymentDataImpl;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b(null, null, 128 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0086\u0089\u0088", objArr3);
        hashtable3.put(((java.lang.String) objArr3[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(64));
        java.util.Hashtable hashtable4 = SdkCoreAlternateContactlessPaymentDataImpl;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        b(null, null, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, "\u008b\u0089\u0088", objArr4);
        hashtable4.put(((java.lang.String) objArr4[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(64));
        java.util.Hashtable hashtable5 = SdkCoreAlternateContactlessPaymentDataImpl;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        b(null, null, 127 - android.widget.ExpandableListView.getPackedPositionGroup(0L), "\u0090\u008a\u0087\u0089\u0088\u008f\u008e\u008d\u008c", objArr5);
        hashtable5.put(((java.lang.String) objArr5[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(64));
        java.util.Hashtable hashtable6 = SdkCoreAlternateContactlessPaymentDataImpl;
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        b(null, null, (-16777089) - android.graphics.Color.rgb(0, 0, 0), "\u0092\u0091\u0087\u0089\u0088\u008f\u008e\u008d\u008c", objArr6);
        hashtable6.put(((java.lang.String) objArr6[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(64));
        java.util.Hashtable hashtable7 = SdkCoreAlternateContactlessPaymentDataImpl;
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        b(null, null, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 128, "\u0087\u0095\u0094\u0093\u0083", objArr7);
        hashtable7.put(((java.lang.String) objArr7[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(64));
        java.util.Hashtable hashtable8 = SdkCoreAlternateContactlessPaymentDataImpl;
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        b(null, null, android.view.View.MeasureSpec.getMode(0) + 127, "\u0086\u008a\u008a\u0095\u0094\u0093\u0083", objArr8);
        hashtable8.put(((java.lang.String) objArr8[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(64));
        java.util.Hashtable hashtable9 = SdkCoreAlternateContactlessPaymentDataImpl;
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        b(null, null, android.view.View.combineMeasuredStates(0, 0) + 127, "\u0091\u008b\u008a\u0095\u0094\u0093\u0083", objArr9);
        hashtable9.put(((java.lang.String) objArr9[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(64));
        java.util.Hashtable hashtable10 = SdkCoreAlternateContactlessPaymentDataImpl;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        b(null, null, 127 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), "\u0086\u0090\u0085\u0095\u0094\u0093\u0083", objArr10);
        hashtable10.put(((java.lang.String) objArr10[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(128));
        java.util.Hashtable hashtable11 = SdkCoreAlternateContactlessPaymentDataImpl;
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a(false, "\r\u0006\ufff2\ufffa\ufff6\ufff7\u0018", 208 - android.graphics.Color.green(0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6, android.view.View.MeasureSpec.getMode(0) + 7, objArr11);
        hashtable11.put(((java.lang.String) objArr11[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(128));
        java.util.Hashtable hashtable12 = SdkCoreAlternateContactlessPaymentDataImpl;
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        b(null, null, android.view.View.MeasureSpec.getSize(0) + 127, "\u0099\u0098\u0097\u0096\u0084", objArr12);
        hashtable12.put(((java.lang.String) objArr12[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(64));
        java.util.Hashtable hashtable13 = SdkCoreAlternateContactlessPaymentDataImpl;
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a(false, "\u0005\u0002￭\ufffe\uffff\b\u0002\u0006\u0005", 255 - android.view.KeyEvent.keyCodeFromString(""), android.view.KeyEvent.getDeadChar(0, 0) + 2, android.view.View.resolveSize(0, 0) + 9, objArr13);
        hashtable13.put(((java.lang.String) objArr13[0]).intern(), com.payair.hce.showErrorDialogFragment.DigitizedCardProfile(64));
        int i = getCvrMaskAnd + 57;
        getGpoResponse = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static int writeReplace(com.payair.hce.getTransactionExecutor gettransactionexecutor) {
        if (!(gettransactionexecutor instanceof com.payair.hce.getAutoMigrationSpecs)) {
            java.lang.Integer num = (java.lang.Integer) SdkCoreAlternateContactlessPaymentDataImpl.get(gettransactionexecutor.values());
            if (num == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(false, "\u0001\u0013\u0013\u0005\u0004ￚ\uffc0\u0015\u000e\u000b\u000e\u000f\u0017\u000e\uffc0\u0004\t\u0007\u0005\u0013\u0014\uffc0\u0010", android.view.View.resolveSize(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6, android.text.TextUtils.getOffsetAfter("", 0) + 23, objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(gettransactionexecutor.values());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            return num.intValue();
        }
        int i = getGpoResponse + 17;
        getCvrMaskAnd = i % 128;
        if (i % 2 != 0) {
            int DigitizedCardProfile = ((com.payair.hce.getAutoMigrationSpecs) gettransactionexecutor).DigitizedCardProfile();
            int i2 = getCvrMaskAnd + 41;
            getGpoResponse = i2 % 128;
            if (i2 % 2 == 0) {
                return DigitizedCardProfile;
            }
            throw null;
        }
        ((com.payair.hce.getAutoMigrationSpecs) gettransactionexecutor).DigitizedCardProfile();
        throw null;
    }

    public internalEndTransaction(com.payair.hce.getTransactionExecutor gettransactionexecutor) {
        this(gettransactionexecutor, writeReplace(gettransactionexecutor));
    }

    private internalEndTransaction(com.payair.hce.getTransactionExecutor gettransactionexecutor, int i) {
        this.DigitizedCardProfile = gettransactionexecutor;
        int AlternateContactlessPaymentDataJson = gettransactionexecutor.AlternateContactlessPaymentDataJson();
        this.writeReplace = AlternateContactlessPaymentDataJson;
        this.valueOf = i;
        this.getAid = new byte[i];
        this.getProfileVersion = new byte[i + AlternateContactlessPaymentDataJson];
    }

    public final void DigitizedCardProfile(com.payair.hce.getMCallbacksannotations getmcallbacksannotations) {
        byte[] bArr;
        this.DigitizedCardProfile.valueOf();
        com.payair.hce.getErrorDialog geterrordialog = (com.payair.hce.getErrorDialog) getmcallbacksannotations;
        byte[] bArr2 = (byte[]) com.payair.hce.getErrorDialog.DigitizedCardProfile(new java.lang.Object[]{geterrordialog}, -363040252, 363040252, java.lang.System.identityHashCode(geterrordialog));
        int length = bArr2.length;
        if (length <= this.valueOf) {
            java.lang.System.arraycopy(bArr2, 0, this.getAid, 0, length);
        } else {
            int i = getCvrMaskAnd + 105;
            getGpoResponse = i % 128;
            if (i % 2 != 0) {
                this.DigitizedCardProfile.DigitizedCardProfile(bArr2, 0, length);
                this.DigitizedCardProfile.valueOf(this.getAid, 0);
            } else {
                this.DigitizedCardProfile.DigitizedCardProfile(bArr2, 0, length);
                this.DigitizedCardProfile.valueOf(this.getAid, 0);
            }
            length = this.writeReplace;
        }
        while (true) {
            bArr = this.getAid;
            if (length >= bArr.length) {
                break;
            }
            getGpoResponse = (getCvrMaskAnd + 29) % 128;
            bArr[length] = 0;
            length++;
        }
        java.lang.System.arraycopy(bArr, 0, this.getProfileVersion, 0, this.valueOf);
        values(this.getAid, this.valueOf, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE);
        values(this.getProfileVersion, this.valueOf, (byte) 92);
        com.payair.hce.getTransactionExecutor gettransactionexecutor = this.DigitizedCardProfile;
        if (gettransactionexecutor instanceof com.payair.hce.isUserRecoverableError) {
            com.payair.hce.isUserRecoverableError RecordsJson2 = ((com.payair.hce.isUserRecoverableError) gettransactionexecutor).RecordsJson();
            this.values = RecordsJson2;
            ((com.payair.hce.getTransactionExecutor) RecordsJson2).DigitizedCardProfile(this.getProfileVersion, 0, this.valueOf);
        }
        com.payair.hce.getTransactionExecutor gettransactionexecutor2 = this.DigitizedCardProfile;
        byte[] bArr3 = this.getAid;
        gettransactionexecutor2.DigitizedCardProfile(bArr3, 0, bArr3.length);
        com.payair.hce.getTransactionExecutor gettransactionexecutor3 = this.DigitizedCardProfile;
        if (gettransactionexecutor3 instanceof com.payair.hce.isUserRecoverableError) {
            this.AlternateContactlessPaymentDataJson = ((com.payair.hce.isUserRecoverableError) gettransactionexecutor3).RecordsJson();
        }
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        $11 = ($10 + 117) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr2 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            $10 = ($11 + 93) % 128;
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr2[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i4]), java.lang.Integer.valueOf(RecordsJson)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 44, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2073, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 60037));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((byte) 0, 0, 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 53, 3542 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
            char[] cArr3 = new char[i3];
            java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i3);
            java.lang.System.arraycopy(cArr3, 0, cArr2, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr3, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr2, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
            $11 = ($10 + 81) % 128;
        }
        if (z) {
            int i5 = $10 + 7;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                cArr = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 1;
            } else {
                cArr = new char[i3];
                digitizedCardJson11.DigitizedCardProfile = 0;
            }
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr[digitizedCardJson11.DigitizedCardProfile] = cArr2[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 53, 3543 - android.graphics.Color.blue(0), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            $10 = ($11 + 57) % 128;
            cArr2 = cArr;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.internalEndTransaction internalendtransaction = (com.payair.hce.internalEndTransaction) objArr[0];
        int i = getGpoResponse;
        int i2 = i + 89;
        getCvrMaskAnd = i2 % 128;
        int i3 = internalendtransaction.writeReplace;
        if (i2 % 2 == 0) {
            throw null;
        }
        getCvrMaskAnd = (i + 11) % 128;
        return java.lang.Integer.valueOf(i3);
    }

    private static void b(int[] iArr, java.lang.String str, int i, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            cArr = str.toCharArray();
            int i3 = $10 + 113;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 5;
            }
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr3 = IccPrivateKeyCrtComponentsJson;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 46, 285 - android.text.TextUtils.lastIndexOf("", c), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 46336))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr4[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i5++;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(getCiacDecline)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46385 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (SdkCoreBusinessLogicModuleImpl) {
            getumdgeneration.values = bArr2.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr5[getumdgeneration.valueOf] = (char) (cArr3[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 43, 1629 - (android.os.Process.myTid() >> 22), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c((byte) 0, 0, 0, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        if (!getPaymentFci) {
            getumdgeneration.values = iArr.length;
            char[] cArr6 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                int i6 = $11 + 21;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr6[getumdgeneration.valueOf] = (char) (cArr3[iArr[getumdgeneration.values >> getumdgeneration.valueOf] + i] >> intValue);
                    i2 = getumdgeneration.valueOf;
                } else {
                    cArr6[getumdgeneration.valueOf] = (char) (cArr3[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                    i2 = getumdgeneration.valueOf + 1;
                }
                getumdgeneration.valueOf = i2;
            }
            objArr[0] = new java.lang.String(cArr6);
            return;
        }
        getumdgeneration.values = cArr2.length;
        char[] cArr7 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        $11 = ($10 + 21) % 128;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr7[getumdgeneration.valueOf] = (char) (cArr3[cArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 43, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1629, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                c((byte) 0, 0, 0, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        java.lang.String str4 = new java.lang.String(cArr7);
        $10 = ($11 + 91) % 128;
        objArr[0] = str4;
    }

    public final void AlternateContactlessPaymentDataJson(byte[] bArr, int i) {
        getCvrMaskAnd = (getGpoResponse + 93) % 128;
        this.DigitizedCardProfile.DigitizedCardProfile(bArr, 0, i);
        int i2 = getCvrMaskAnd + 33;
        getGpoResponse = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final int valueOf(byte[] bArr) {
        this.DigitizedCardProfile.valueOf(this.getProfileVersion, this.valueOf);
        com.payair.hce.isUserRecoverableError isuserrecoverableerror = this.values;
        if (isuserrecoverableerror == null) {
            com.payair.hce.getTransactionExecutor gettransactionexecutor = this.DigitizedCardProfile;
            byte[] bArr2 = this.getProfileVersion;
            gettransactionexecutor.DigitizedCardProfile(bArr2, 0, bArr2.length);
        } else {
            int i = getGpoResponse + 39;
            getCvrMaskAnd = i % 128;
            if (i % 2 != 0) {
                ((com.payair.hce.isUserRecoverableError) this.DigitizedCardProfile).DigitizedCardProfile(isuserrecoverableerror);
                com.payair.hce.getTransactionExecutor gettransactionexecutor2 = this.DigitizedCardProfile;
                gettransactionexecutor2.DigitizedCardProfile(this.getProfileVersion, this.valueOf, gettransactionexecutor2.AlternateContactlessPaymentDataJson());
                int i2 = getGpoResponse + 73;
                getCvrMaskAnd = i2 % 128;
                int i3 = i2 % 2;
            } else {
                ((com.payair.hce.isUserRecoverableError) this.DigitizedCardProfile).DigitizedCardProfile(isuserrecoverableerror);
                com.payair.hce.getTransactionExecutor gettransactionexecutor3 = this.DigitizedCardProfile;
                gettransactionexecutor3.DigitizedCardProfile(this.getProfileVersion, this.valueOf, gettransactionexecutor3.AlternateContactlessPaymentDataJson());
                throw null;
            }
        }
        int valueOf = this.DigitizedCardProfile.valueOf(bArr, 0);
        int i4 = this.valueOf;
        while (true) {
            byte[] bArr3 = this.getProfileVersion;
            if (i4 >= bArr3.length) {
                break;
            }
            bArr3[i4] = 0;
            i4++;
        }
        com.payair.hce.isUserRecoverableError isuserrecoverableerror2 = this.AlternateContactlessPaymentDataJson;
        if (isuserrecoverableerror2 != null) {
            getCvrMaskAnd = (getGpoResponse + 21) % 128;
            ((com.payair.hce.isUserRecoverableError) this.DigitizedCardProfile).DigitizedCardProfile(isuserrecoverableerror2);
            getCvrMaskAnd = (getGpoResponse + 85) % 128;
            return valueOf;
        }
        com.payair.hce.getTransactionExecutor gettransactionexecutor4 = this.DigitizedCardProfile;
        byte[] bArr4 = this.getAid;
        gettransactionexecutor4.DigitizedCardProfile(bArr4, 0, bArr4.length);
        return valueOf;
    }

    public final void AlternateContactlessPaymentDataJson() {
        getCvrMaskAnd = (getGpoResponse + 125) % 128;
        this.DigitizedCardProfile.valueOf();
        com.payair.hce.getTransactionExecutor gettransactionexecutor = this.DigitizedCardProfile;
        byte[] bArr = this.getAid;
        gettransactionexecutor.DigitizedCardProfile(bArr, 0, bArr.length);
        int i = getCvrMaskAnd + 13;
        getGpoResponse = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void values(byte[] bArr, int i, byte b) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = getCvrMaskAnd;
            getGpoResponse = (i3 + 81) % 128;
            bArr[i2] = (byte) (bArr[i2] ^ b);
            i2++;
            int i4 = i3 + 113;
            getGpoResponse = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static void DigitizedCardProfile() {
        RecordsJson = 1889207284;
        IccPrivateKeyCrtComponentsJson = new char[]{11049, 11041, 11045, 11044, 11077, 11076, 11075, 11055, 11092, 11074, 11079, 11042, 11051, 11040, 11095, 11096, 11078, 11072, 11048, 11091, 11087, 11019, 11017, 11063, 11010};
        getCiacDecline = -143185264;
        getPaymentFci = true;
        SdkCoreBusinessLogicModuleImpl = true;
    }

    static void init$0() {
        $$a = new byte[]{84, 108, com.google.common.base.Ascii.CAN, -19};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
    }

    public final int valueOf() {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, -1727069471, 1727069471, java.lang.System.identityHashCode(this))).intValue();
    }
}
