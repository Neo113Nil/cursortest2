package com.mastercard.mpsdk.remotemanagement.api.json;

/* loaded from: classes4.dex */
public class ReplenishResponseEncrypted extends com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AlternateContactlessPaymentDataJson;
    private static int DigitizedCardProfile;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static boolean getProfileVersion;
    private static long valueOf;
    private static boolean values;
    private static char[] writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "transactionCredentials")
    private com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential[] transactionCredentials;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2 = 3 - (b * 3);
        int i3 = (s * 19) + 99;
        int i4 = b2 * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i2;
            int i6 = i4;
            int i7 = 0;
            int i8 = i2 + i6;
            i = i7;
            int i9 = i5;
            i3 = i8;
            i2 = i9;
            bArr2[i] = (byte) i3;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i2 + 1;
            int i11 = i3;
            i5 = i10;
            i2 = bArr[i10];
            i7 = i + 1;
            i6 = i11;
            int i82 = i2 + i6;
            i = i7;
            int i92 = i5;
            i3 = i82;
            i2 = i92;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        }
    }

    public ReplenishResponseEncrypted() {
    }

    public ReplenishResponseEncrypted(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential[] transactionCredentialArr) {
        super(str, str2, str3, str4);
        this.transactionCredentials = transactionCredentialArr;
    }

    public com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential[] getTransactionCredentials() {
        int i = RecordsJson + 111;
        int i2 = i % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i2;
        if (i % 2 == 0) {
            throw null;
        }
        com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential[] transactionCredentialArr = this.transactionCredentials;
        int i3 = i2 + 111;
        RecordsJson = i3 % 128;
        if (i3 % 2 == 0) {
            return transactionCredentialArr;
        }
        throw null;
    }

    public void setTransactionCredentials(com.mastercard.mpsdk.remotemanagement.api.json.TransactionCredential[] transactionCredentialArr) {
        int i = RecordsJson;
        SdkCoreAlternateContactlessPaymentDataImpl = (i + 15) % 128;
        this.transactionCredentials = transactionCredentialArr;
        SdkCoreAlternateContactlessPaymentDataImpl = (i + 27) % 128;
    }

    public java.lang.String buildAsJson() {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((android.os.Process.getThreadPriority(0) + 20) >> 6, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 7 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7, (char) android.text.TextUtils.getOffsetAfter("", 0), 26 - android.view.KeyEvent.getDeadChar(0, 0), objArr2);
        setchilddivider.values(((java.lang.String) objArr2[0]).intern());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b(null, null, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, "\u0088\u0086\u0085\u008c\u0084\u0083\u0087\u008a\u0087\u0090\u0091\u0083\u0082\u008c\u0084\u0081\u0085\u0088\u0083\u0085\u0090\u0084\u008f\u008e\u0087\u008d\u0083\u0082\u008c\u0088\u0088\u0087\u008b\u008a\u0089\u0088\u0088\u0087\u0086\u0084\u0081\u0085\u0084\u0083\u0082\u0081", objArr3);
        setchilddivider.values(((java.lang.String) objArr3[0]).intern());
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        b(null, null, 127 - android.view.View.resolveSizeAndState(0, 0, 0), "\u0088\u0086\u0085\u008c\u0084\u0083\u0087\u008a\u0087\u0090\u0091\u0083\u0082\u008c\u0084\u0081\u0085\u0088\u0083\u0085\u0090\u0084\u008f\u008e\u0087\u008d\u0087\u0088\u0092\u0087\u0086\u0094\u0083\u008c\u008b\u008a\u0093\u0092\u0088\u0088\u0087\u0086\u0084\u0081\u0085\u0084\u0083\u0082\u0081", objArr4);
        setchilddivider.values(((java.lang.String) objArr4[0]).intern());
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        b(null, null, android.view.Gravity.getAbsoluteGravity(0, 0) + 127, "\u0088\u0086\u0085\u008c\u0084\u0083\u0087\u008a\u0087\u0090\u0091\u0083\u0082\u008c\u0084\u0081\u0085\u0088\u0083\u0085\u0090\u0084\u008f\u008e\u0087\u008d\u0083\u0082\u008c\u0088\u0088\u0087\u008b\u008a\u0089\u0095\u0090\u0088\u008a", objArr5);
        setchilddivider.values(((java.lang.String) objArr5[0]).intern());
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(android.graphics.Color.green(0) + 33, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 42 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr6);
        setchilddivider.values(((java.lang.String) objArr6[0]).intern());
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        b(null, null, 127 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0088\u0086\u0085\u008c\u0084\u0083\u0087\u008a\u0087\u0090\u0091\u0083\u0082\u008c\u0084\u0081\u0085\u0088\u0083\u0085\u0090\u0084\u008f\u008e\u0087\u008d\u0083\u0082\u008c\u0088\u0088\u0087\u008b\u008a\u0093\u0092\u0095\u0090\u0088\u008a", objArr7);
        setchilddivider.values(((java.lang.String) objArr7[0]).intern());
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a(75 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 55991), 47 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr8);
        setchilddivider.values(((java.lang.String) objArr8[0]).intern());
        int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        a((scrollBarFadeDuration >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 26 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr9);
        setchilddivider.values(((java.lang.String) objArr9[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.checkCallingOrSelfPermission(), byte[].class);
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getSystemServiceName(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(this);
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 33) % 128;
        return DigitizedCardProfile2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        long j;
        java.lang.Throwable cause;
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (true) {
            j = 0;
            if (getcvmmodel.valueOf >= i2) {
                break;
            }
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.view.View.resolveSize(0, 0) + 381, (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 62388));
                    byte b = (byte) $$b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    e(b, b, b, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(valueOf), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 35, 3965 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (40223 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.getCapsMode("", 0, 0), 212 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            } catch (java.lang.Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            $11 = ($10 + 47) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.os.Process.getGidForName(""), (android.os.SystemClock.elapsedRealtime() > j ? 1 : (android.os.SystemClock.elapsedRealtime() == j ? 0 : -1)) + 211, (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            $11 = ($10 + 49) % 128;
            j = 0;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public static com.mastercard.mpsdk.remotemanagement.api.json.ReplenishResponseEncrypted valueOf(byte[] bArr) {
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.ByteArrayInputStream(bArr));
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        com.payair.hce.bindServiceAsUser bindserviceasuser = new com.payair.hce.bindServiceAsUser();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.graphics.Color.rgb(0, 0, 0) + 16777364, (char) android.text.TextUtils.getCapsMode("", 0, 0), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 34, objArr);
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener2 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, bindserviceasuser, new java.lang.String[]{((java.lang.String) objArr[0]).intern()}}, 1908633719, -1908633716, java.lang.System.identityHashCode(setonitemselectedlistener));
        com.payair.hce.bindServiceAsUser bindserviceasuser2 = new com.payair.hce.bindServiceAsUser();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(181 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 57664), 52 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr2);
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener3 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener2, bindserviceasuser2, new java.lang.String[]{((java.lang.String) objArr2[0]).intern()}}, 1908633719, -1908633716, java.lang.System.identityHashCode(setonitemselectedlistener2));
        com.payair.hce.bindServiceAsUser bindserviceasuser3 = new com.payair.hce.bindServiceAsUser();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(282 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (10823 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 55, objArr3);
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener4 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener3, bindserviceasuser3, new java.lang.String[]{((java.lang.String) objArr3[0]).intern()}}, 1908633719, -1908633716, java.lang.System.identityHashCode(setonitemselectedlistener3));
        com.payair.hce.bindServiceAsUser bindserviceasuser4 = new com.payair.hce.bindServiceAsUser();
        long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a((elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9351), android.graphics.Color.alpha(0) + 46, objArr4);
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener5 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener4, bindserviceasuser4, new java.lang.String[]{((java.lang.String) objArr4[0]).intern()}}, 1908633719, -1908633716, java.lang.System.identityHashCode(setonitemselectedlistener4));
        com.payair.hce.bindServiceAsUser bindserviceasuser5 = new com.payair.hce.bindServiceAsUser();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        b(null, null, android.view.View.getDefaultSize(0, 0) + 127, "\u008e\u0087\u008d\u0087\u0088\u0092\u0087\u0086\u0094\u0083\u008c\u008b\u008a\u0093\u0092\u0095\u0090\u0088\u008a\u008f\u0088\u0087\u0097\u0086\u0085\u0096\u008f\u0088\u0086\u0085\u008c\u0084\u0083\u0087\u008a\u0087\u0090\u0091\u0083\u0082\u008c\u0084\u0081\u0085\u0088\u0083\u0085\u0090\u0084", objArr5);
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener6 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener5, bindserviceasuser5, new java.lang.String[]{((java.lang.String) objArr5[0]).intern()}}, 1908633719, -1908633716, java.lang.System.identityHashCode(setonitemselectedlistener5));
        com.payair.hce.bindServiceAsUser bindserviceasuser6 = new com.payair.hce.bindServiceAsUser();
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 336, (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 38690), 47 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr6);
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener7 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener6, bindserviceasuser6, new java.lang.String[]{((java.lang.String) objArr6[0]).intern()}}, 1908633719, -1908633716, java.lang.System.identityHashCode(setonitemselectedlistener6));
        com.payair.hce.bindServiceAsUser bindserviceasuser7 = new com.payair.hce.bindServiceAsUser();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a(383 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 54 - android.view.KeyEvent.getDeadChar(0, 0), objArr7);
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener8 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener7, bindserviceasuser7, new java.lang.String[]{((java.lang.String) objArr7[0]).intern()}}, 1908633719, -1908633716, java.lang.System.identityHashCode(setonitemselectedlistener7));
        com.mastercard.mpsdk.remotemanagement.api.json.ReplenishResponseEncrypted replenishResponseEncrypted = (com.mastercard.mpsdk.remotemanagement.api.json.ReplenishResponseEncrypted) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener8, inputStreamReader, com.mastercard.mpsdk.remotemanagement.api.json.ReplenishResponseEncrypted.class}, 509207078, -509207074, java.lang.System.identityHashCode(setonitemselectedlistener8));
        SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 21) % 128;
        return replenishResponseEncrypted;
    }

    @Override // com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiResponseEncrypted
    public java.lang.String toString() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 89;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            java.util.Arrays.toString(this.transactionCredentials);
            return "ReplenishResponseEncrypted";
        }
        java.util.Arrays.toString(this.transactionCredentials);
        throw null;
    }

    private static void b(int[] iArr, java.lang.String str, int i, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            $10 = ($11 + 113) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr3 = writeReplace;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i2])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 286 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (46336 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr4[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(DigitizedCardProfile)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(45 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.view.View.resolveSizeAndState(0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - android.view.Gravity.getAbsoluteGravity(0, 0)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (getProfileVersion) {
            getumdgeneration.values = bArr2.length;
            char[] cArr5 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                int i3 = $11 + 29;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = getumdgeneration.valueOf;
                    int i5 = getumdgeneration.values;
                    throw new java.lang.ArithmeticException();
                }
                cArr5[getumdgeneration.valueOf] = (char) (cArr3[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.text.TextUtils.getCapsMode("", 0, 0) + 1629, (char) android.graphics.Color.red(0));
                    byte b = (byte) $$b;
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    e(b, b, (byte) (b + 1), objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr5);
            return;
        }
        if (!values) {
            getumdgeneration.values = iArr.length;
            char[] cArr6 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr6[getumdgeneration.valueOf] = (char) (cArr3[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr6);
            return;
        }
        getumdgeneration.values = cArr2.length;
        char[] cArr7 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        $10 = ($11 + 59) % 128;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr7[getumdgeneration.valueOf] = (char) (cArr3[cArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.view.View.getDefaultSize(0, 0) + 1629, (char) (android.os.Process.myPid() >> 22));
                byte b2 = (byte) $$b;
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                e(b2, b2, (byte) (b2 + 1), objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        AlternateContactlessPaymentDataJson = new char[]{24197, 59523, 13000, 31941, 34502, 53462, 6864, 24262, 59593, 12997, 31879, 34515, 53463, 6850, 42191, 61132, 14556, 17112, 36045, 55006, 24794, 43741, 62706, 16125, 18664, 37615, 56556, 26345, 45297, 64234, 1248, 20211, 39150, 24267, 59614, 13017, 31961, 34546, 53448, 6855, 42226, 61142, 14547, 17116, 36053, 54994, 24800, 43712, 62676, 16068, 18664, 37618, 56487, 26355, 45303, 64226, 1263, 20204, 39164, 8952, 27885, 46846, 49402, 2813, 21714, 40605, 10376, 29327, 48268, 50825, 4241, 23178, 58496, 11923, 30862, 33908, 12922, 59517, 42597, 23678, 2686, 49263, 32373, 13410, 57974, 39024, 22100, 3170, 47721, 28760, 11884, 58436, 37446, 18522, 1630, 48209, 27254, 8286, 56896, 37897, 16977, 63569, 46656, 27713, 6750, 53322, 36426, 17443, 62012, 43068, 26175, 7196, 51759, 32830, 15933, 62498, 41515, 22583, 5672, 52270, 31265, 12344, 24270, 59609, 13000, 31879, 34515, 53463, 6850, 42191, 61132, 14556, 17112, 36045, 55006, 24794, 43741, 62706, 16125, 18664, 37615, 56556, 26345, 45297, 64234, 1248, 20211, 39150, 24283, 59615, 13002, 31943, 34516, 53444, 6848, 42197, 61142, 14546, 17109, 36090, 54981, 24784, 43735, 62676, 16097, 18681, 37602, 56552, 26347, 45302, 64173, 1271, 20222, 39153, 8942, 27900, 46820, 49339, 2810, 21749, 40577, 49124, 2528, 54261, 40440, 26603, 12795, 64511, 17898, 4073, 55789, 41962, 28101, 14330, 33263, 19432, 5611, 57310, 43462, 29661, 15831, 34772, 20937, 7058, 58824, 44993, 31182, 50129, 36291, 22491, 8580, 60367, 46529, 32702, 51622, 37813, 23989, 10156, 61878, 48057, 1453, 53171, 39311, 25504, 11669, 63405, 16825, 3007, 54695, 40863, 27036, 13247, 64915, 18305, 29843, 49815, 6274, 22159, 44188, 64140, 12424, 36509, 50334, 4762, 26781, 42674, 64653, 19096, 32927, 56988, 5289, 25265, 47274, 63136, 19619, 39614, 53477, 11967, 25782, 45753, 2214, 18100, 40108, 60147, 8376, 32438, 46281, 721, 22722, 38594, 60635, 15041, 28878, 52954, 1220, 21216, 43230, 59093, 15596, 35540, 49365, 7902, 21739, 41696, 63702, 14066, 36074, 56006, 4334, 28400, 31315, 52311, 5698, 22607, 41564, 62540, 15944, 32861, 51806, 7258, 26205, 43122, 62029, 17496, 36447, 53340, 6761, 27761, 46698, 63584, 16995, 38014, 56869, 8319, 27254, 48249, 1638, 18548, 37484, 58419, 11903, 28778, 47637, 3093, 22062, 38917, 57916, 13320, 32280, 49178, 2590, 23578, 42525, 59450, 12826, 33796, 51705, 32765, 42472, 60389, 4598, 18406, 36322, 13303, 31220, 45040, 54775, 7128, 16871, 63474, 15861, 25590, 43459, 57307, 1472, 19402, 61897, 10196, 28047, 37845, 55772, 4051, 46540, 64478, 8646, 22425, 40405, 50112, 2495, 49087, 58780, 11174, 20897, 34708, 52644, 29616, 47534, 61366, 5558, 23477, 33182, 14258, 32168, 24283, 59615, 13002, 31943, 34516, 53444, 6848, 42197, 61142, 14546, 17109, 36090, 54981, 24784, 43735, 62676, 16097, 18681, 37602, 56552, 26347, 45302, 64173, 1271, 20222, 39153, 8942, 27900, 46820, 49339, 2800, 21758, 40577, 10393, 29322, 48266, 50835, 4233, 23174, 58514, 11916, 30888, 33430, 52381, 5796, 41104, 60032, 13442, 32422, 34978, 53925, 7298, 42658, 61628};
        valueOf = -5420581647223101267L;
        writeReplace = new char[]{11099, 11095, 11092, 11050, 11097, 11090, 11101, 11051, 11125, 11098, 11083, 11089, 11123, 11041, 10900, 11048, 11131, 11085, 11093, 11103, 11094, 11052, 11053};
        DigitizedCardProfile = -143185242;
        values = true;
        getProfileVersion = true;
    }

    static void init$0() {
        $$a = new byte[]{62, -127, kotlin.io.encoding.Base64.padSymbol, 101};
        $$b = 0;
    }
}
