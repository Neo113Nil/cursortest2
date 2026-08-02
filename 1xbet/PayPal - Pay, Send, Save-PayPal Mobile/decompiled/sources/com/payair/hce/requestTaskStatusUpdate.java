package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'valueOf' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class requestTaskStatusUpdate {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.requestTaskStatusUpdate AlternateContactlessPaymentDataJson;
    private static int CardAlternateContactlessPaymentDataJson;
    private static char[] CardContactlessPaymentDataJson;
    private static int CardDsrpDataJson;
    private static final /* synthetic */ com.payair.hce.requestTaskStatusUpdate[] CardRecordsJson;
    private static long CardTrackConstructionDataJson;
    public static final com.payair.hce.requestTaskStatusUpdate DigitizedCardProfile;
    public static final com.payair.hce.requestTaskStatusUpdate IccPrivateKeyCrtComponentsJson;
    public static final com.payair.hce.requestTaskStatusUpdate RecordsJson;
    public static final com.payair.hce.requestTaskStatusUpdate SdkCoreAlternateContactlessPaymentDataImpl;
    public static final com.payair.hce.requestTaskStatusUpdate SdkCoreBusinessLogicModuleImpl;
    public static final com.payair.hce.requestTaskStatusUpdate SdkCoreCardRiskManagementDataImpl;
    public static final com.payair.hce.requestTaskStatusUpdate SdkCoreContactlessPaymentDataImpl;
    public static final com.payair.hce.requestTaskStatusUpdate SdkCoreDigitizedCardProfileImpl;
    public static final com.payair.hce.requestTaskStatusUpdate SdkCoreIccPrivateKeyCrtComponentsImpl;
    public static final com.payair.hce.requestTaskStatusUpdate SdkCoreMChipCvmIssuerOptionsImpl;
    public static final com.payair.hce.requestTaskStatusUpdate SdkCoreMagstripeCvmIssuerOptionsImpl;
    public static final com.payair.hce.requestTaskStatusUpdate SdkCoreMppLiteModuleImpl;
    public static final com.payair.hce.requestTaskStatusUpdate SdkCoreRecordsImpl;
    public static final com.payair.hce.requestTaskStatusUpdate SdkCoreRemotePaymentDataImpl;
    public static final com.payair.hce.requestTaskStatusUpdate build;
    public static final com.payair.hce.requestTaskStatusUpdate buildRecords;
    public static final com.payair.hce.requestTaskStatusUpdate getAckAlwaysRequiredIfCurrencyNotProvided;
    public static final com.payair.hce.requestTaskStatusUpdate getAckAlwaysRequiredIfCurrencyProvided;
    public static final com.payair.hce.requestTaskStatusUpdate getAckAutomaticallyResetByApplication;
    public static final com.payair.hce.requestTaskStatusUpdate getAckPreEntryAllowed;
    public static final com.payair.hce.requestTaskStatusUpdate getAdditionalCheckTable;
    public static final com.payair.hce.requestTaskStatusUpdate getAid;
    public static final com.payair.hce.requestTaskStatusUpdate getAip;
    public static final com.payair.hce.requestTaskStatusUpdate getAlternateContactlessPaymentData;
    private static com.payair.hce.requestTaskStatusUpdate getApplicationExpiryDate;
    public static final com.payair.hce.requestTaskStatusUpdate getApplicationLifeCycleData;
    public static final com.payair.hce.requestTaskStatusUpdate getBusinessLogicModule;
    public static final com.payair.hce.requestTaskStatusUpdate getCardLayoutDescription;
    public static final com.payair.hce.requestTaskStatusUpdate getCardMetadata;
    public static final com.payair.hce.requestTaskStatusUpdate getCardRiskManagementData;
    public static final com.payair.hce.requestTaskStatusUpdate getCardholderValidators;
    public static final com.payair.hce.requestTaskStatusUpdate getCdol1RelatedDataLength;
    public static final com.payair.hce.requestTaskStatusUpdate getCiacDecline;
    public static final com.payair.hce.requestTaskStatusUpdate getCiacDeclineOnPpms;
    public static final com.payair.hce.requestTaskStatusUpdate getContactlessPaymentData;
    public static final com.payair.hce.requestTaskStatusUpdate getContent;
    public static final com.payair.hce.requestTaskStatusUpdate getCrmCountryCode;
    public static final com.payair.hce.requestTaskStatusUpdate getCvmResetTimeout;
    public static final com.payair.hce.requestTaskStatusUpdate getCvrMaskAnd;
    public static final com.payair.hce.requestTaskStatusUpdate getDigitizedCardId;
    public static final com.payair.hce.requestTaskStatusUpdate getDp;
    public static final com.payair.hce.requestTaskStatusUpdate getDq;
    public static final com.payair.hce.requestTaskStatusUpdate getDualTapResetTimeout;
    public static final com.payair.hce.requestTaskStatusUpdate getGpoResponse;
    public static final com.payair.hce.requestTaskStatusUpdate getIccPrivateKeyCrtComponents;
    public static final com.payair.hce.requestTaskStatusUpdate getIssuerApplicationData;
    public static final com.payair.hce.requestTaskStatusUpdate getMagstripeCvmIssuerOptions;
    public static final com.payair.hce.requestTaskStatusUpdate getMaximumPinTry;
    public static final com.payair.hce.requestTaskStatusUpdate getMchipCvmIssuerOptions;
    public static final com.payair.hce.requestTaskStatusUpdate getMppLiteModule;
    public static final com.payair.hce.requestTaskStatusUpdate getP;
    private static com.payair.hce.requestTaskStatusUpdate getPan;
    private static com.payair.hce.requestTaskStatusUpdate getPanSequenceNumber;
    public static final com.payair.hce.requestTaskStatusUpdate getPaymentFci;
    public static final com.payair.hce.requestTaskStatusUpdate getPinAlwaysRequiredIfCurrencyNotProvided;
    public static final com.payair.hce.requestTaskStatusUpdate getPinAlwaysRequiredIfCurrencyProvided;
    public static final com.payair.hce.requestTaskStatusUpdate getPinAutomaticallyResetByApplication;
    public static final com.payair.hce.requestTaskStatusUpdate getPinIvCvc3Track2;
    public static final com.payair.hce.requestTaskStatusUpdate getPinPreEntryAllowed;
    public static final com.payair.hce.requestTaskStatusUpdate getPpseFci;
    public static final com.payair.hce.requestTaskStatusUpdate getProfileVersion;
    public static final com.payair.hce.requestTaskStatusUpdate getQ;
    public static final com.payair.hce.requestTaskStatusUpdate getRecordNumber;
    public static final com.payair.hce.requestTaskStatusUpdate getRecordValue;
    public static final com.payair.hce.requestTaskStatusUpdate getRecords;
    public static final com.payair.hce.requestTaskStatusUpdate getRemotePaymentData;
    public static final com.payair.hce.requestTaskStatusUpdate getSecurityWord;
    public static final com.payair.hce.requestTaskStatusUpdate getSfi;
    private static com.payair.hce.requestTaskStatusUpdate getTrack2Equivalent;
    public static final com.payair.hce.requestTaskStatusUpdate getU;
    public static final com.payair.hce.requestTaskStatusUpdate valueOf;
    public static final com.payair.hce.requestTaskStatusUpdate values;
    public static final com.payair.hce.requestTaskStatusUpdate wipe;
    public static final com.payair.hce.requestTaskStatusUpdate writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = (s * 3) + 99;
        int i4 = (b * 4) + 1;
        int i5 = 3 - (b2 * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i3 += i5;
            i5 = i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            int i7 = i5 + 1;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b3 = bArr[i7];
            i5 = i3;
            i3 = b3;
            i6 = i7;
            i3 += i5;
            i5 = i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            int i72 = i5 + 1;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            int i722 = i5 + 1;
            if (i2 == i4) {
            }
        }
    }

    private requestTaskStatusUpdate(java.lang.String str, int i) {
    }

    public static com.payair.hce.requestTaskStatusUpdate valueOf(java.lang.String str) {
        CardDsrpDataJson = (CardAlternateContactlessPaymentDataJson + 35) % 128;
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate = (com.payair.hce.requestTaskStatusUpdate) java.lang.Enum.valueOf(com.payair.hce.requestTaskStatusUpdate.class, str);
        int i = CardDsrpDataJson + 101;
        CardAlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            return requesttaskstatusupdate;
        }
        throw null;
    }

    public static com.payair.hce.requestTaskStatusUpdate[] values() {
        CardDsrpDataJson = (CardAlternateContactlessPaymentDataJson + 5) % 128;
        com.payair.hce.requestTaskStatusUpdate[] requesttaskstatusupdateArr = (com.payair.hce.requestTaskStatusUpdate[]) CardRecordsJson.clone();
        CardDsrpDataJson = (CardAlternateContactlessPaymentDataJson + 97) % 128;
        return requesttaskstatusupdateArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        CardAlternateContactlessPaymentDataJson = 0;
        CardDsrpDataJson = 1;
        AlternateContactlessPaymentDataJson();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 47, android.text.TextUtils.getTrimmedLength(""), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2428), objArr);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr[0]).intern(), 0);
        valueOf = requesttaskstatusupdate;
        int green = android.graphics.Color.green(0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(green + 31, 47 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.view.View.MeasureSpec.getMode(0), objArr2);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate2 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr2[0]).intern(), 1);
        AlternateContactlessPaymentDataJson = requesttaskstatusupdate2;
        long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a((elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)) + 23, 78 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
        getPan = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr3[0]).intern(), 2);
        int resolveSizeAndState = android.view.View.resolveSizeAndState(0, 0, 0);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a(resolveSizeAndState + 29, 103 - android.view.KeyEvent.getDeadChar(0, 0), (char) (30944 - android.text.TextUtils.getOffsetBefore("", 0)), objArr4);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate3 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr4[0]).intern(), 3);
        values = requesttaskstatusupdate3;
        int resolveSizeAndState2 = android.view.View.resolveSizeAndState(0, 0, 0);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(24 - resolveSizeAndState2, 132 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr5);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate4 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr5[0]).intern(), 4);
        DigitizedCardProfile = requesttaskstatusupdate4;
        int resolveSize = android.view.View.resolveSize(0, 0);
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(24 - resolveSize, 157 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), objArr6);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate5 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr6[0]).intern(), 5);
        writeReplace = requesttaskstatusupdate5;
        long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        a((elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)) + 22, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 179, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 53407), objArr7);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate6 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr7[0]).intern(), 6);
        getAid = requesttaskstatusupdate6;
        int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        a(34 - (fadingEdgeLength >> 16), 204 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.view.KeyEvent.normalizeMetaState(0) + 65253), objArr8);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate7 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr8[0]).intern(), 7);
        getProfileVersion = requesttaskstatusupdate7;
        int gidForName = android.os.Process.getGidForName("");
        int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        a(gidForName + 34, keyCodeFromString + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr9);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate8 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr9[0]).intern(), 8);
        IccPrivateKeyCrtComponentsJson = requesttaskstatusupdate8;
        int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        a(34 - (minimumFlingVelocity >> 16), 270 - android.view.View.getDefaultSize(0, 0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr10);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate9 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr10[0]).intern(), 9);
        RecordsJson = requesttaskstatusupdate9;
        float complexToFloat = android.util.TypedValue.complexToFloat(0);
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a((complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + 55, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 256, (char) (13799 - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr11);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate10 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr11[0]).intern(), 10);
        SdkCoreAlternateContactlessPaymentDataImpl = requesttaskstatusupdate10;
        int resolveSizeAndState3 = android.view.View.resolveSizeAndState(0, 0, 0);
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        a(resolveSizeAndState3 + 38, 360 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 15257), objArr12);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate11 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr12[0]).intern(), 11);
        SdkCoreBusinessLogicModuleImpl = requesttaskstatusupdate11;
        int offsetBefore = android.text.TextUtils.getOffsetBefore("", 0);
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        a(offsetBefore + 41, android.view.View.combineMeasuredStates(0, 0) + 397, (char) (android.os.Process.getGidForName("") + 9986), objArr13);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate12 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr13[0]).intern(), 12);
        getGpoResponse = requesttaskstatusupdate12;
        float complexToFloat2 = android.util.TypedValue.complexToFloat(0);
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a((complexToFloat2 > 0.0f ? 1 : (complexToFloat2 == 0.0f ? 0 : -1)) + 43, 438 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 16142), objArr14);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate13 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr14[0]).intern(), 13);
        getCvrMaskAnd = requesttaskstatusupdate13;
        long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        a((packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)) + 28, 482 - (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)), (char) (53824 - android.text.TextUtils.indexOf("", "", 0)), objArr15);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate14 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr15[0]).intern(), 14);
        getCiacDecline = requesttaskstatusupdate14;
        long elapsedCpuTime2 = android.os.Process.getElapsedCpuTime();
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        a((elapsedCpuTime2 > 0L ? 1 : (elapsedCpuTime2 == 0L ? 0 : -1)) + 32, android.text.TextUtils.getOffsetBefore("", 0) + 509, (char) android.graphics.Color.blue(0), objArr16);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate15 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr16[0]).intern(), 15);
        getPaymentFci = requesttaskstatusupdate15;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.lang.Object[] objArr17 = new java.lang.Object[1];
        a(38 - (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)), 541 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr17);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate16 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr17[0]).intern(), 16);
        getApplicationLifeCycleData = requesttaskstatusupdate16;
        long packedPositionForGroup2 = android.widget.ExpandableListView.getPackedPositionForGroup(0);
        java.lang.Object[] objArr18 = new java.lang.Object[1];
        a(36 - (packedPositionForGroup2 > 0L ? 1 : (packedPositionForGroup2 == 0L ? 0 : -1)), 579 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr18);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate17 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr18[0]).intern(), 17);
        getCardLayoutDescription = requesttaskstatusupdate17;
        int myPid = android.os.Process.myPid();
        int edgeSlop = android.view.ViewConfiguration.getEdgeSlop();
        java.lang.Object[] objArr19 = new java.lang.Object[1];
        a((myPid >> 22) + 38, (edgeSlop >> 16) + 615, (char) (57824 - android.view.KeyEvent.getDeadChar(0, 0)), objArr19);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate18 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr19[0]).intern(), 18);
        getDualTapResetTimeout = requesttaskstatusupdate18;
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
        java.lang.Object[] objArr20 = new java.lang.Object[1];
        a(lastIndexOf + 38, 654 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), (char) (55980 - android.graphics.Color.blue(0)), objArr20);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate19 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr20[0]).intern(), 19);
        getSecurityWord = requesttaskstatusupdate19;
        int myTid = android.os.Process.myTid();
        java.lang.Object[] objArr21 = new java.lang.Object[1];
        a(42 - (myTid >> 22), 689 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr21);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate20 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr21[0]).intern(), 20);
        getCvmResetTimeout = requesttaskstatusupdate20;
        int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
        java.lang.Object[] objArr22 = new java.lang.Object[1];
        a((maxKeyCode >> 16) + 29, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 732, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr22);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate21 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr22[0]).intern(), 21);
        getMchipCvmIssuerOptions = requesttaskstatusupdate21;
        int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(0, 0);
        java.lang.Object[] objArr23 = new java.lang.Object[1];
        a(37 - resolveOpacity, absoluteGravity + 761, (char) (40219 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), objArr23);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate22 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr23[0]).intern(), 22);
        getCardholderValidators = requesttaskstatusupdate22;
        int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
        java.lang.Object[] objArr24 = new java.lang.Object[1];
        a(22 - combineMeasuredStates, (-16776418) - android.graphics.Color.rgb(0, 0, 0), (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 8525), objArr24);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate23 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr24[0]).intern(), 23);
        getAdditionalCheckTable = requesttaskstatusupdate23;
        float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
        java.lang.Object[] objArr25 = new java.lang.Object[1];
        a((scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)) + 31, 820 - android.view.View.resolveSize(0, 0), (char) (13098 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr25);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate24 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr25[0]).intern(), 24);
        getMagstripeCvmIssuerOptions = requesttaskstatusupdate24;
        int myPid2 = android.os.Process.myPid();
        java.lang.Object[] objArr26 = new java.lang.Object[1];
        a((myPid2 >> 22) + 17, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 853, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr26);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate25 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr26[0]).intern(), 25);
        SdkCoreCardRiskManagementDataImpl = requesttaskstatusupdate25;
        int green2 = android.graphics.Color.green(0);
        long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
        java.lang.Object[] objArr27 = new java.lang.Object[1];
        a(green2 + 35, 870 - (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)), (char) (37203 - android.view.KeyEvent.keyCodeFromString("")), objArr27);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate26 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr27[0]).intern(), 26);
        getPpseFci = requesttaskstatusupdate26;
        int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        int capsMode = android.text.TextUtils.getCapsMode("", 0, 0);
        java.lang.Object[] objArr28 = new java.lang.Object[1];
        a(28 - indexOf, capsMode + androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN, (char) (10895 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr28);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate27 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr28[0]).intern(), 27);
        getCrmCountryCode = requesttaskstatusupdate27;
        int rgb = android.graphics.Color.rgb(0, 0, 0);
        java.lang.Object[] objArr29 = new java.lang.Object[1];
        a(rgb + 16777256, android.text.TextUtils.getOffsetBefore("", 0) + 933, (char) android.text.TextUtils.getCapsMode("", 0, 0), objArr29);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate28 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr29[0]).intern(), 28);
        buildRecords = requesttaskstatusupdate28;
        int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
        java.lang.Object[] objArr30 = new java.lang.Object[1];
        a(36 - (windowTouchSlop >> 8), 974 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 30758), objArr30);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate29 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr30[0]).intern(), 29);
        SdkCoreContactlessPaymentDataImpl = requesttaskstatusupdate29;
        int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
        java.lang.Object[] objArr31 = new java.lang.Object[1];
        a(17 - (tapTimeout >> 16), 1009 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr31);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate30 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr31[0]).intern(), 30);
        getCdol1RelatedDataLength = requesttaskstatusupdate30;
        int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(0, 0);
        int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
        java.lang.Object[] objArr32 = new java.lang.Object[1];
        a(33 - absoluteGravity2, packedPositionChild + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG3, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 47832), objArr32);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate31 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr32[0]).intern(), 31);
        getIccPrivateKeyCrtComponents = requesttaskstatusupdate31;
        int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
        int fadingEdgeLength2 = android.view.ViewConfiguration.getFadingEdgeLength();
        java.lang.Object[] objArr33 = new java.lang.Object[1];
        a(bitsPerPixel + 33, (fadingEdgeLength2 >> 16) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIF_INFO2, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr33);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate32 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr33[0]).intern(), 32);
        getCiacDeclineOnPpms = requesttaskstatusupdate32;
        int combineMeasuredStates2 = android.view.View.combineMeasuredStates(0, 0);
        java.lang.Object[] objArr34 = new java.lang.Object[1];
        a(combineMeasuredStates2 + 31, 1091 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (46504 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr34);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate33 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr34[0]).intern(), 33);
        getAlternateContactlessPaymentData = requesttaskstatusupdate33;
        int rgb2 = android.graphics.Color.rgb(0, 0, 0);
        java.lang.Object[] objArr35 = new java.lang.Object[1];
        a(rgb2 + 16777255, android.view.View.combineMeasuredStates(0, 0) + 1122, (char) android.view.View.combineMeasuredStates(0, 0), objArr35);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate34 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr35[0]).intern(), 34);
        getIssuerApplicationData = requesttaskstatusupdate34;
        int argb = android.graphics.Color.argb(0, 0, 0, 0);
        java.lang.Object[] objArr36 = new java.lang.Object[1];
        a(argb + 34, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1161, (char) (android.view.View.resolveSize(0, 0) + 35191), objArr36);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate35 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr36[0]).intern(), 35);
        getPinIvCvc3Track2 = requesttaskstatusupdate35;
        int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
        java.lang.Object[] objArr37 = new java.lang.Object[1];
        a(25 - (scrollBarFadeDuration >> 16), android.text.TextUtils.getOffsetAfter("", 0) + 1195, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr37);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate36 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr37[0]).intern(), 36);
        SdkCoreDigitizedCardProfileImpl = requesttaskstatusupdate36;
        long packedPositionForGroup3 = android.widget.ExpandableListView.getPackedPositionForGroup(0);
        java.lang.Object[] objArr38 = new java.lang.Object[1];
        a((packedPositionForGroup3 > 0L ? 1 : (packedPositionForGroup3 == 0L ? 0 : -1)) + 31, 1220 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr38);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate37 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr38[0]).intern(), 37);
        getRecords = requesttaskstatusupdate37;
        int gidForName2 = android.os.Process.getGidForName("");
        java.lang.Object[] objArr39 = new java.lang.Object[1];
        a(32 - gidForName2, 1251 - android.graphics.Color.alpha(0), (char) android.view.View.MeasureSpec.getMode(0), objArr39);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate38 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr39[0]).intern(), 38);
        getDigitizedCardId = requesttaskstatusupdate38;
        int maxKeyCode2 = android.view.KeyEvent.getMaxKeyCode();
        java.lang.Object[] objArr40 = new java.lang.Object[1];
        a(34 - (maxKeyCode2 >> 16), 1283 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.view.KeyEvent.keyCodeFromString(""), objArr40);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate39 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr40[0]).intern(), 39);
        build = requesttaskstatusupdate39;
        int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
        java.lang.Object[] objArr41 = new java.lang.Object[1];
        a((jumpTapTimeout >> 16) + 39, 1318 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (29152 - android.text.TextUtils.getOffsetAfter("", 0)), objArr41);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate40 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr41[0]).intern(), 40);
        getMaximumPinTry = requesttaskstatusupdate40;
        int alpha = android.graphics.Color.alpha(0);
        java.lang.Object[] objArr42 = new java.lang.Object[1];
        a(alpha + 16, 1357 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 46377), objArr42);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate41 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr42[0]).intern(), 41);
        getBusinessLogicModule = requesttaskstatusupdate41;
        int scrollBarFadeDuration2 = android.view.ViewConfiguration.getScrollBarFadeDuration();
        java.lang.Object[] objArr43 = new java.lang.Object[1];
        a(27 - (scrollBarFadeDuration2 >> 16), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1373, (char) android.view.KeyEvent.keyCodeFromString(""), objArr43);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate42 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr43[0]).intern(), 42);
        wipe = requesttaskstatusupdate42;
        long uptimeMillis2 = android.os.SystemClock.uptimeMillis();
        java.lang.Object[] objArr44 = new java.lang.Object[1];
        a((uptimeMillis2 > 0L ? 1 : (uptimeMillis2 == 0L ? 0 : -1)) + 19, 1400 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr44);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate43 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr44[0]).intern(), 43);
        getMppLiteModule = requesttaskstatusupdate43;
        int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
        java.lang.Object[] objArr45 = new java.lang.Object[1];
        a(deadChar + 23, 1420 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.view.Gravity.getAbsoluteGravity(0, 0), objArr45);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate44 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr45[0]).intern(), 44);
        getCardMetadata = requesttaskstatusupdate44;
        int green3 = android.graphics.Color.green(0);
        long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
        java.lang.Object[] objArr46 = new java.lang.Object[1];
        a(green3 + 30, (packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)) + 1444, (char) (61660 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr46);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate45 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr46[0]).intern(), 45);
        getContent = requesttaskstatusupdate45;
        int minimumFlingVelocity2 = android.view.ViewConfiguration.getMinimumFlingVelocity();
        java.lang.Object[] objArr47 = new java.lang.Object[1];
        a((minimumFlingVelocity2 >> 16) + 19, 1473 - android.graphics.Color.green(0), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr47);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate46 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr47[0]).intern(), 46);
        getDp = requesttaskstatusupdate46;
        int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
        java.lang.Object[] objArr48 = new java.lang.Object[1];
        a((scrollDefaultDelay >> 16) + 21, 1492 - android.text.TextUtils.getTrimmedLength(""), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr48);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate47 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr48[0]).intern(), 47);
        getDq = requesttaskstatusupdate47;
        int scrollBarSize = android.view.ViewConfiguration.getScrollBarSize();
        float scrollFriction2 = android.view.ViewConfiguration.getScrollFriction();
        java.lang.Object[] objArr49 = new java.lang.Object[1];
        a((scrollBarSize >> 8) + 15, 1514 - (scrollFriction2 > 0.0f ? 1 : (scrollFriction2 == 0.0f ? 0 : -1)), (char) (52673 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr49);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate48 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr49[0]).intern(), 48);
        getQ = requesttaskstatusupdate48;
        int myPid3 = android.os.Process.myPid();
        java.lang.Object[] objArr50 = new java.lang.Object[1];
        a(15 - (myPid3 >> 22), 1528 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (2106 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), objArr50);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate49 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr50[0]).intern(), 49);
        getP = requesttaskstatusupdate49;
        long elapsedCpuTime3 = android.os.Process.getElapsedCpuTime();
        java.lang.Object[] objArr51 = new java.lang.Object[1];
        a(18 - (elapsedCpuTime3 > 0L ? 1 : (elapsedCpuTime3 == 0L ? 0 : -1)), (-16775673) - android.graphics.Color.rgb(0, 0, 0), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 25), objArr51);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate50 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr51[0]).intern(), 50);
        SdkCoreIccPrivateKeyCrtComponentsImpl = requesttaskstatusupdate50;
        int touchSlop = android.view.ViewConfiguration.getTouchSlop();
        java.lang.Object[] objArr52 = new java.lang.Object[1];
        a((touchSlop >> 8) + 14, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1560, (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr52);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate51 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr52[0]).intern(), 51);
        getPinPreEntryAllowed = requesttaskstatusupdate51;
        int indexOf2 = android.text.TextUtils.indexOf("", "");
        java.lang.Object[] objArr53 = new java.lang.Object[1];
        a(14 - indexOf2, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1573, (char) ((-1) - android.os.Process.getGidForName("")), objArr53);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate52 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr53[0]).intern(), 52);
        getAckAlwaysRequiredIfCurrencyProvided = requesttaskstatusupdate52;
        int absoluteGravity3 = android.view.Gravity.getAbsoluteGravity(0, 0);
        java.lang.Object[] objArr54 = new java.lang.Object[1];
        a(31 - absoluteGravity3, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1587, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr54);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate53 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr54[0]).intern(), 53);
        getPinAlwaysRequiredIfCurrencyNotProvided = requesttaskstatusupdate53;
        int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
        java.lang.Object[] objArr55 = new java.lang.Object[1];
        a(31 - (maximumFlingVelocity >> 16), 1619 - android.graphics.Color.alpha(0), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr55);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate54 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr55[0]).intern(), 54);
        getU = requesttaskstatusupdate54;
        long elapsedRealtimeNanos2 = android.os.SystemClock.elapsedRealtimeNanos();
        java.lang.Object[] objArr56 = new java.lang.Object[1];
        a((elapsedRealtimeNanos2 > 0L ? 1 : (elapsedRealtimeNanos2 == 0L ? 0 : -1)) + 32, 1651 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 20545), objArr56);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate55 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr56[0]).intern(), 55);
        SdkCoreMChipCvmIssuerOptionsImpl = requesttaskstatusupdate55;
        int myTid2 = android.os.Process.myTid();
        int alpha2 = android.graphics.Color.alpha(0);
        java.lang.Object[] objArr57 = new java.lang.Object[1];
        a(29 - (myTid2 >> 22), alpha2 + 1683, (char) (50827 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr57);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate56 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr57[0]).intern(), 56);
        getAckAlwaysRequiredIfCurrencyNotProvided = requesttaskstatusupdate56;
        float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
        java.lang.Object[] objArr58 = new java.lang.Object[1];
        a(43 - (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)), 1712 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr58);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate57 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr58[0]).intern(), 57);
        getAckPreEntryAllowed = requesttaskstatusupdate57;
        int rgb3 = android.graphics.Color.rgb(0, 0, 0);
        java.lang.Object[] objArr59 = new java.lang.Object[1];
        a((-16777185) - rgb3, 1755 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr59);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate58 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr59[0]).intern(), 58);
        getPinAlwaysRequiredIfCurrencyProvided = requesttaskstatusupdate58;
        int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
        java.lang.Object[] objArr60 = new java.lang.Object[1];
        a(offsetAfter + 32, android.view.KeyEvent.normalizeMetaState(0) + 1786, (char) android.view.View.resolveSize(0, 0), objArr60);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate59 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr60[0]).intern(), 59);
        getPinAutomaticallyResetByApplication = requesttaskstatusupdate59;
        int indexOf3 = android.text.TextUtils.indexOf("", "", 0);
        java.lang.Object[] objArr61 = new java.lang.Object[1];
        a(indexOf3 + 31, 1818 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) android.view.View.getDefaultSize(0, 0), objArr61);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate60 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr61[0]).intern(), 60);
        getAckAutomaticallyResetByApplication = requesttaskstatusupdate60;
        int bitsPerPixel2 = android.graphics.ImageFormat.getBitsPerPixel(0);
        java.lang.Object[] objArr62 = new java.lang.Object[1];
        a(16 - bitsPerPixel2, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1801, (char) (android.view.View.MeasureSpec.getSize(0) + 57824), objArr62);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate61 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr62[0]).intern(), 61);
        getCardRiskManagementData = requesttaskstatusupdate61;
        int windowTouchSlop2 = android.view.ViewConfiguration.getWindowTouchSlop();
        java.lang.Object[] objArr63 = new java.lang.Object[1];
        a(16 - (windowTouchSlop2 >> 8), android.view.View.combineMeasuredStates(0, 0) + 1866, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr63);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate62 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr63[0]).intern(), 62);
        SdkCoreMppLiteModuleImpl = requesttaskstatusupdate62;
        int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
        java.lang.Object[] objArr64 = new java.lang.Object[1];
        a(24 - (keyRepeatDelay >> 16), android.text.TextUtils.indexOf("", "") + 1882, (char) (30790 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), objArr64);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate63 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr64[0]).intern(), 63);
        SdkCoreMagstripeCvmIssuerOptionsImpl = requesttaskstatusupdate63;
        int argb2 = android.graphics.Color.argb(0, 0, 0, 0);
        int axisFromString = android.view.MotionEvent.axisFromString("");
        java.lang.Object[] objArr65 = new java.lang.Object[1];
        a(argb2 + 26, axisFromString + 1907, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6902), objArr65);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate64 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr65[0]).intern(), 64);
        getContactlessPaymentData = requesttaskstatusupdate64;
        int keyRepeatDelay2 = android.view.ViewConfiguration.getKeyRepeatDelay();
        java.lang.Object[] objArr66 = new java.lang.Object[1];
        a((keyRepeatDelay2 >> 16) + 27, 1932 - android.view.View.resolveSize(0, 0), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr66);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate65 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr66[0]).intern(), 65);
        getRemotePaymentData = requesttaskstatusupdate65;
        int indexOf4 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        java.lang.Object[] objArr67 = new java.lang.Object[1];
        a(indexOf4 + 46, 1959 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (21112 - (android.os.Process.myPid() >> 22)), objArr67);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate66 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr67[0]).intern(), 66);
        getSfi = requesttaskstatusupdate66;
        int combineMeasuredStates3 = android.view.View.combineMeasuredStates(0, 0);
        java.lang.Object[] objArr68 = new java.lang.Object[1];
        a(combineMeasuredStates3 + 20, 2004 - android.view.View.resolveSize(0, 0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 23963), objArr68);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate67 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr68[0]).intern(), 67);
        getRecordNumber = requesttaskstatusupdate67;
        int size = android.view.View.MeasureSpec.getSize(0);
        java.lang.Object[] objArr69 = new java.lang.Object[1];
        a(20 - size, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2025, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr69);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate68 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr69[0]).intern(), 68);
        SdkCoreRemotePaymentDataImpl = requesttaskstatusupdate68;
        float scrollFriction3 = android.view.ViewConfiguration.getScrollFriction();
        int gidForName3 = android.os.Process.getGidForName("");
        java.lang.Object[] objArr70 = new java.lang.Object[1];
        a(45 - (scrollFriction3 > 0.0f ? 1 : (scrollFriction3 == 0.0f ? 0 : -1)), 2043 - gidForName3, (char) (54271 - android.view.View.MeasureSpec.getSize(0)), objArr70);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate69 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr70[0]).intern(), 69);
        getRecordValue = requesttaskstatusupdate69;
        int resolveOpacity2 = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        int myPid4 = android.os.Process.myPid();
        java.lang.Object[] objArr71 = new java.lang.Object[1];
        a(resolveOpacity2 + 16, 2088 - (myPid4 >> 22), (char) (220 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr71);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate70 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr71[0]).intern(), 70);
        SdkCoreRecordsImpl = requesttaskstatusupdate70;
        long zoomControlsTimeout2 = android.view.ViewConfiguration.getZoomControlsTimeout();
        java.lang.Object[] objArr72 = new java.lang.Object[1];
        a(28 - (zoomControlsTimeout2 > 0L ? 1 : (zoomControlsTimeout2 == 0L ? 0 : -1)), 2103 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (21740 - android.text.TextUtils.indexOf("", "", 0, 0)), objArr72);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate71 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr72[0]).intern(), 71);
        getAip = requesttaskstatusupdate71;
        float length = android.graphics.PointF.length(0.0f, 0.0f);
        java.lang.Object[] objArr73 = new java.lang.Object[1];
        a(47 - (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)), 2131 - android.graphics.Color.red(0), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr73);
        getApplicationExpiryDate = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr73[0]).intern(), 72);
        int alpha3 = android.graphics.Color.alpha(0);
        java.lang.Object[] objArr74 = new java.lang.Object[1];
        a(alpha3 + 23, 2179 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 9186), objArr74);
        getPanSequenceNumber = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr74[0]).intern(), 73);
        int indexOf5 = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        java.lang.Object[] objArr75 = new java.lang.Object[1];
        a(indexOf5 + 54, 2201 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) android.text.TextUtils.getTrimmedLength(""), objArr75);
        com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate72 = new com.payair.hce.requestTaskStatusUpdate(((java.lang.String) objArr75[0]).intern(), 74);
        getTrack2Equivalent = requesttaskstatusupdate72;
        CardRecordsJson = new com.payair.hce.requestTaskStatusUpdate[]{requesttaskstatusupdate, requesttaskstatusupdate2, getPan, requesttaskstatusupdate3, requesttaskstatusupdate4, requesttaskstatusupdate5, requesttaskstatusupdate6, requesttaskstatusupdate7, requesttaskstatusupdate8, requesttaskstatusupdate9, requesttaskstatusupdate10, requesttaskstatusupdate11, requesttaskstatusupdate12, requesttaskstatusupdate13, requesttaskstatusupdate14, requesttaskstatusupdate15, requesttaskstatusupdate16, requesttaskstatusupdate17, requesttaskstatusupdate18, requesttaskstatusupdate19, requesttaskstatusupdate20, requesttaskstatusupdate21, requesttaskstatusupdate22, requesttaskstatusupdate23, requesttaskstatusupdate24, requesttaskstatusupdate25, requesttaskstatusupdate26, requesttaskstatusupdate27, requesttaskstatusupdate28, requesttaskstatusupdate29, requesttaskstatusupdate30, requesttaskstatusupdate31, requesttaskstatusupdate32, requesttaskstatusupdate33, requesttaskstatusupdate34, requesttaskstatusupdate35, requesttaskstatusupdate36, requesttaskstatusupdate37, requesttaskstatusupdate38, requesttaskstatusupdate39, requesttaskstatusupdate40, requesttaskstatusupdate41, requesttaskstatusupdate42, requesttaskstatusupdate43, requesttaskstatusupdate44, requesttaskstatusupdate45, requesttaskstatusupdate46, requesttaskstatusupdate47, requesttaskstatusupdate48, requesttaskstatusupdate49, requesttaskstatusupdate50, requesttaskstatusupdate51, requesttaskstatusupdate52, requesttaskstatusupdate53, requesttaskstatusupdate54, requesttaskstatusupdate55, requesttaskstatusupdate56, requesttaskstatusupdate57, requesttaskstatusupdate58, requesttaskstatusupdate59, requesttaskstatusupdate60, requesttaskstatusupdate61, requesttaskstatusupdate62, requesttaskstatusupdate63, requesttaskstatusupdate64, requesttaskstatusupdate65, requesttaskstatusupdate66, requesttaskstatusupdate67, requesttaskstatusupdate68, requesttaskstatusupdate69, requesttaskstatusupdate70, requesttaskstatusupdate71, getApplicationExpiryDate, getPanSequenceNumber, requesttaskstatusupdate72};
        int i = CardAlternateContactlessPaymentDataJson + 27;
        CardDsrpDataJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void a(int i, int i2, char c, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i) {
            int i3 = $11 + 115;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(CardContactlessPaymentDataJson[i2 - getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 381, (char) (android.text.TextUtils.indexOf("", "", 0) + 62388));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((short) 0, (byte) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(CardTrackConstructionDataJson), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 35, 3966 - android.text.TextUtils.indexOf("", "", 0), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 34, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.graphics.Color.argb(0, 0, 0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getcvmmodel.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(CardContactlessPaymentDataJson[i2 + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 48, android.graphics.Color.rgb(0, 0, 0) + 16777597, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 62389));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b((short) 0, (byte) 0, (byte) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(CardTrackConstructionDataJson), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 3966 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (40223 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.text.TextUtils.indexOf("", "") + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
            $11 = ($10 + 81) % 128;
        }
        char[] cArr = new char[i];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 34, 212 - android.graphics.Color.green(0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
            }
            ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
        }
        java.lang.String str = new java.lang.String(cArr);
        int i6 = $10 + 67;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static void AlternateContactlessPaymentDataJson() {
        char[] cArr = new char[2254];
        java.nio.ByteBuffer.wrap("W\u0091¤³±ì\u008e\u0004\u009bR\u0097\u0082äºñõÎ3ÛO×\u008f$ß1í\u000e:\u001bv\u0017\u0080dÁq\u0002N1[uW¿¤Ù±\u0005\u008eD\u009by\u0097©äæñ\fÎJÚ\u0081×½$û1'\u000eS\u001a\u008e\u0017´dôq/NKZ\u0089WÏ¤è±%\u008eg\u009a\u0081\u0097Êä\u001cñ<^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÜø\u0095ÇTÒ!Þô-¦8\u0094\u0007A\u0012\r\u001eæm¬xzGJR\u0010^Ù\u00ad¹¸g\u0087%\u0092\u001b\u009eÇí\u0092ø|Ç\"ÓúÞØ^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÕø\u008fÇUÒ\"Þâ-¡8\u009d\u0007N\u0012\u001c\u001eàm xcG[R\u0016^Ê\u00adº¸h\u0087(&\u001bÕ(Àdÿ\u009eêÈæ\u0007\u00952\u0080h¿®ªÝ¦\u0013UW@`\u007fªjæf\u0004\u0015O\u0000\u008f?±*ÿ&)ÕOÀ\u009eÿÛêöæ.\u0095a\u0080\u009d¿×^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíßø\u0089ÇKÒ>Þâ-¬8\u0092\u0007J\u0012\b\u001eëm¬x\u007fGER\u0010^Ç\u00ad¿¸d\u0087(^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÜø\u0095ÇTÒ!Þô-¦8\u0094\u0007A\u0012\n\u001eðm°xfG$R\u001f^Ï\u00ad·¸u\u0087-\u008et}Vh\tWáB·Ng=B(\u000b\u0017Ê\u0002¿\u000ejý8è\n×ßÂ\u0082În½.¨ø\u0097Ô\u0082\u009a\u008eT}<hþ \u000fS-Fry\u009alÌ`\u001c\u0013$\u0006k9\u00ad,Ñ \u0011ÓAÆsù¤ìäà\u0010\u0093I\u0086\u0090¹¹¬ë 8SRF\u0088yÀlö`8\u0013n\u0006\u009e9Ï-\u0014 8Ó`Æ¾ùÞ^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÔø\u0091ÇWÒ&Þä-·8\u0090\u0007_\u0012\u001b\u001eðm xzGGR\u000f^Í\u00ad¿¸m\u0087)\u0092\b\u009eÒí\u009føwÇ5ÓçÞÝ-\u00818K^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÜø\u0095ÇTÒ!Þô-¦8\u0094\u0007A\u0012\u0019\u001eæm°xlG\\R\f^Î\u00ad©¸b\u0087-\u0092\u0007\u009eÃí\u008føqÇ/ÓçÞÍ-\u008d8J\u0007)k\u0002\u0098 \u008d\u007f²\u0097§Á«\u0011Ø)Ífò çÜë\u001c\u0018L\r~2©'å+\u0013XRM\u0091r¢gæk,\u0098J\u008d\u0096²×§ê«:ØuÍ\u009fòÙæ\u0012ë.\u0018o\r¨2Ü&\u0019+9XpMºrÕf\u0011k\\\u0098i\u008dª²ô¦\t«WØ\u008fÍ¯òöæ!ëI\u0018\u0081\rÌ2ð&:es\u0096Q\u0083\u000e¼æ©°¥`ÖEÃ\füÍé¸åm\u0016?\u0003\r<Ø)\u0093%bV(Cç|Íi\u009aeF\u0096#\u0083ý¼¦©\u009d¥DÖ\u0004ÃóüµèqåI\u0016\u0011\u0003Ó<¼(x%HV\u0016CÞyë\u008aÉ\u009f\u0096 ~µ(¹øÊÝß\u0094àUõ ùõ\n§\u001f\u0095 @5\u00189çJ·_f`Uu\u0013yÓ\u008a¨\u009fa $µ\u0012¹ÜÊ\u0088ßxà6ôîùÇ\n\u008c\u001f@ $4ô9ÃJ\u0095_A`9tñy£aç\u0092Å\u0087\u009a¸r\u00ad$¡ôÒÑÇ\u0098øYí,áù\u0012«\u0007\u00998L-\u0005!õR¦GbxJm\u0003aÇ\u0092¯\u0087i¸>\u00ad\u001b¡ÆÒ\u0084Çjø*ìâáÀ\u0012\u0088\u0007]8>,æ!ÂR\u0086GYx3l÷a£\u0092\u0093\u0087U\u008cª\u007f\u0088j×U?@iL¹?\u009c*Õ\u0015\u0014\u0000a\f´ÿæêÔÕ\u0001ÀHÌ½¿ûª5\u0095\u001c\u0080N\u008c\u0094\u007fæj3Uc@QL\u008b?Á*=^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÜø\u0095ÇTÒ!Þô-¦8\u0094\u0007A\u0012\n\u001eâm\u00adxuGXR\u0001^Ø\u00ad½¸~\u0087%\u0092\u0019\u009eÝí\u009døjÇ,ÓèÞÐ-\u00888J^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÜø\u0095ÇTÒ!Þô-¦8\u0094\u0007A\u0012\u000e\u001eäm°xuGGR\u0005^Ø\u00ad¦¸n\u0087\"\u0092\u0004\u009eÇí\u0092øqÇ-ÓñÞÉ-\u00968@\u0007<\u0013ì\u001eÜm\u009e^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÜø\u0095ÇTÒ!Þô-¦8\u0094\u0007A\u0012\u0019\u001eõm¦xgGPR\u000e^ß\u00ad©¸g\u0087/\u0092\u001e\u009eÝí\u0084øvÇ<ÓþÞË-\u008b8I\u00073\u0013é\u001eÕ¿\nL(Ywf\u009fsÉ\u007f\u0019\f<\u0019u&´3Á?\u0014ÌFÙtæ¡óêÿ\u0001\u008cM\u0099\u0098¦°³î¿(LOY\u009efÏsø\u007f&\fh\u0019\u0087&Ê2\u0000?&ÌtÙ½æÕò\u0003ÿ9\u008cw\u0099£\u0084Fwdb;]ÓH\u0085DU7p\"9\u001dø\b\u008d\u0004X÷\nâ8ÝíÈ±ÄJ·\u0012¢Å\u009dò\u0088³\u0084dw\u0015bÃ]\u0093H¯D|74\"×\u001d\u009b\tK\u0004z÷&âüÝ\u0092ÉHÄh·6^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÓø\u009dÇCÒ>Þä-·8\u0095\u0007Q\u0012\u001b\u001eùmºxnGJR\u0014^Ù\u00ad·¸b\u0087'\u0092\b\u009eÁí\u0082øvÇ0ÓúÞË-\u00918L\u0007.\u0013ì\u001eßm\u0095xYG5Sý^³\u00ad\u0093^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÜø\u0095ÇTÒ!Þô-¦8\u0094\u0007A\u0012\u0000\u001e÷m¼xuGER\u0012^Â\u00ad ¸`\u00878\u0092\u0012\u009eÝí\u0086ø}Ç:Ãñ0Ó%\u008c\u001ad\u000f2\u0003âpÇe\u008eZOO:Cï°½¥\u008f\u009aZ\u008f\u001b\u0083üð·ådÚKÏ\tÃÏ0¬%j\u001a'\u000f\u0000\u0003Ðp\u0095ebZ,NüCÍ°\u0091¥K\u009a%\u008eÿ\u0083ßð\u0081\u007f§\u008c\u0085\u0099Ú¦2³d¿´Ì\u0091ÙØæ\u0019ólÿ¹\fë\u0019Ù&\f3T?©LáY\"f\u0007sK\u007f\u0085\u008còmÀ\u009eâ\u008b½´U¡\u0003\u00adÓÞöË¿ô~á\u000bíÞ\u001e\u008c\u000b¾4k!3-×^\u009bK_tva<mþ\u009e\u009f\u008b]´\u0005¡N\u00ad÷Þ³Ë@ô\bàÇíø\u001eÜ^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÜø\u0095ÇTÒ!Þô-¦8\u0094\u0007A\u0012\u0019\u001eõm±Ï¹<\u009b)Ä\u0016,\u0003z\u000fª|\u008fiÆV\u0007CrO§¼õ©Ç\u0096\u0012\u0083Y\u008f¦üþé=Ö\u0019ÃPÏ\u0097<ð)<\u0016k\u0003V\u000f\u0088|Ái(V\u007fB¹O\u008f¼È©\f\u0096h\u0082¸td\u0087F\u0092\u0019\u00adñ¸§´wÇRÒ\u001bíÚø¯ôz\u0007(\u0012\u001a-Ï8\u00824bG!RímÉx\u008ftQ\u00871\u0092à\u00ad¬¸\u0086´HÇ\u0002Òâí¨^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÜø\u0095ÇTÒ!Þô-¦8\u0094\u0007A\u0012\b\u001eäm¯xfG\\R\u0003^Ê\u00ad¢¸h\u0087#\u0092\u0019\u009eÝí\u0088ø~Ç%ÓëÞÚ-\u00908F\u0007,\u0013à\u001eÏm\u009fxGG%Sù&ÏÕíÀ²ÿZê\fæÜ\u0095ù\u0080°¿qª\u0004¦ÑU\u0083@±\u007fdj8fÃ\u0015\u009b\u0000L?{*W&ñÕ\u0096ÀUÿ\u001cê;æñ\u0095©\u0080Q¿\u0003«Å¦èU¾@n\u007f\u001ekÔfô^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÜø\u0095ÇTÒ!Þô-¦8\u0094\u0007A\u0012\b\u001eým¯ä3\u0017\u0011\u0002N=¦(ð$ W\u0005BL}\u008dhød-\u0097\u007f\u0082M½\u0098¨À¤,×hÂ¬ý\u009fèÜä\u0003\u0017z\u0002½=û(Í$\u001eWKB¯}ïi:d\u0002\u0097X\u0082\u0084^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÜø\u0095ÇTÒ!Þô-¦8\u0094\u0007A\u0012\r\u001eñm¼xfG\\R\u000e^Î\u00ad©¸b\u0087#\u0092\u0019\u009eÆí\u0084ølÇ*ÓáÞ×-\u0097ëC\u0018a\r>2Ö'\u0080+PXuM<rýg\u0088k]\u0098\u000f\u008d=²è§£«\\Ø\u0004ÍÇòãçªëm\u0018\n\rÆ2\u0091'¬+rX;MÒr\u0085fCku^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÜø\u0095ÇTÒ!Þô-¦8\u0094\u0007A\u0012\u0019\u001eõm¦xgGPR\u000e^ß\u00ad©¸`\u0087/\u0092\u0014\u009eÍí\u0098øvÇ7ÓñÞË-\u00818I\u0007?\u0013÷\u001eÕm\u0095xEG4×\u009d$¿1à\u000e\b\u001b^\u0017\u008ed¶qùN?[CW\u0083¤Ó±á\u008e6\u009bv\u0097\u0082äÛñ\u0002Î+Ûy×ª$À1\u001a\u000eR\u001bd\u0017ªdýq\u001fN[Z\u0086Wª¤ò±,\u008eL^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÜø\u0095ÇTÒ!Þô-¦8\u0094\u0007A\u0012\u001b\u001eñm¼xeGGR\u0004^Ô\u00ad²¸`\u00878\u0092\u0016^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíßø\u0089ÇKÒ>Þâ-«8\u009c\u0007S\u0012\u0004\u001eûm±xuGQR\u0001^ß\u00ad·¸~\u0087?\u0092\u0002\u009eÒí\u009døtÇ*ÓëÞÝ^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíßø\u0089ÇKÒ>Þâ-©8\u009f\u0007J\u0012\f\u001eæm±xkGAR\u0005^Ô\u00ad·¸h\u0087(\u0092\b\u009eÑí\u0098øhÇ3ÓâÞÐ-\u00818K^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÜø\u0095ÇTÒ!Þô-¦8\u0094\u0007A\u0012\n\u001eðm°xfG$R\u001f^Ù\u00ad³¸m\u0087-\u0092\u0003\u009eÇí\u0089øgÇ/ÓëÞ×-\u00838[\u00072/\nÜ(Éwö\u009fãÉï\u0019\u009c8\u0089o¶´£Ç¯\u0018\\ZIlv¿cùo\u0004\u001cS\t\u00836¶#á/?Ü_É\u008eöÂãèï&\u009cl\u0089\u008c¶Â¢\u0011¯-\\kI vÅb\u0016o8\u001ct\t´6Åë×\u0018à\r¢2['\u0016+ÝXêM½rag\u001dkÊ\u0098\u0085\u008d©²d§.«Î^û\u00adß¸\u0097\u0087}\u00922\u009eèíÐø\u0090ÇXÒ;Þó-©8\u0090\u0007J\u0012\u0000\u001eâm¶x~GLR\u001f^ß\u00ad¿¸l\u0087)\u0092\u0018\u009e×í\u0099^ø\u00adÈ¸\u008a\u0087~\u0092<\u009eùíÒø\u0093ÇJÒ?Þü-¦8\u0097\u0007A\u0012\u0005\u001eñm±xmGAR\b^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíØø\u0092ÇQÒ3Þñ-¡8\u0097\u0007A\u0012\b\u001eäm»x\u007fGJR\u0003^Ê\u00ad¥¸d®:]\bHJw¸bõn/\u001d\u000e\bT7\u0092\"á./ÝkÈL÷\u008dâÑî-\u009d|\u0088¸·\u0086¢È®\b]yH¨wàbÛn\u0011\u001dC\b°7ú#6^ì\u00adÖ¸\u0084\u0087c\u0092(\u009eùíßø\u0093ÇSÒ-Þî-½8\u0083\u0007N\u0012\u0006\u001eæm«xoGQ^ø\u00adÈ¸\u008a\u0087~\u0092<\u009eùíÁøíÇWÒ@Þâ-¸8\u0092\u0007L\u0012\b\u001eùmºx~GPR\u0012^Ø\u0093'`\u0015uRJ°_öS. \u00145B\n\u008a\u001fð\u0013#àkõKÊ\u008bßÍVÜ¥î°©\u008fK\u009a\r\u0096Õåïð¹ÏqÚ\rÖØ%\u00900°\u000fp\u001a6^ÿ\u00adÍ¸\u008a\u0087h\u0092.\u009eöíÌø\u009aÇ_Ò;Þà-¤8\u0095\u0007D\u0012\u0011\u001eþm£^é\u00adÓ¸\u0089\u0087u\u0092$\u009eèíÞø\u0088ÇXÒ4Þò-½8\u009d\u0007Z^í\u00adÛ¸\u0081\u0087o\u0092?\u009eéíÝø\u0083ÇKÒ7Þó-¯8\u0087\u0007V^ì\u00adÕ¸\u008b\u0087t\u00922\u009eòíØø\u0093ÇIÒ!Þâ-§8\u0095\u0007A\u0012\u001c\u001eçmºxuG[R\u000f^ß\u00ad©¸r\u0087-\u0092\u0003\u009eËí\u009eø~Ç*ÓëÞÝ^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíØø\u0092ÇWÒ'Þé-·8\u0087\u0007_\u0012\u000e\u001eëm¶xyGJR\u0017^Ù\u00ad¹¸o\u0087+\u0092\b\u009eÎí\u0088øvÇ$ÓúÞÑ\u000e«ý\u0089èÖ×>ÂhÎ¸½\u009f¨È\u0097\u0012\u0082c\u008e©}ýhÍW\u001bBIN¡=ÿ(4\u0017\u001d\u0002R\u000e\u0095ýàè2×bÂXÎ\u0084½Ó¨5\u0097g\u0083¡\u008e\u009f}Ñh\u0006\u0098ikX~\u001dAèT¹Xc+]>\b\u0001Ø\u0014¼\u0018dë.þ\u0011ÁÛÔ\u0083Øs«+¾å\u0081ß\u0094\u009f\u0098Ak\"~ïA«T\u0099XD+\u0003>ý\u0001¼^û\u00adÈ¸\u0084\u0087~\u0092(\u009eçíÒø\u0088ÇNÒ=Þó-·8\u009d\u0007Q\u0012\u001d\u001eëm¾xfGYR\u000f^Ü\u00ad³¸e\u00873\u0092\u0018\u009eÌí\u0092øwÇ%ÓèÞÕ-\u008d8A\u0007?\u0013ú\u001eÄm\u009exTG<Sõ^©\u00ad\u0093¸Q^â\u00adÓ¸\u0096\u0087c\u00922\u009eèíÖø\u0083ÇSÒ Þü-¦8\u0080\u0007_\u0012\n\u001eàm¶xeG[R\u001f^Ä\u00ad£¸u\u0087<\u0092\u0002\u009eÖí\u0092ø|Ç\"ÓúÞØ^â\u00adÓ¸\u0096\u0087c\u00922\u009eèíÖø\u0083ÇSÒ Þü-¦8\u0080\u0007_\u0012\n\u001eàm¶xeG[R\u001f^Ï\u00ad·¸u\u0087-\u0092\b\u009eÏí\u008cøvÇ\"ÓéÞÜ-\u0096^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÜø\u0095ÇTÒ!Þô-¦8\u0094\u0007A\u0012\b\u001eäm¯xfG\\R\u0003^Ê\u00ad¢¸h\u0087#\u0092\u0019\u009eÝí\u0081øyÇ!ÓëÞÕ¿\u0006L4Ysf\u0091s×\u007f\u000f\f5\u0019c&µ3×?\u001eÌGÙaæºóöÿ\u001a\u008cP^ý\u00adß¸\u0086\u0087\u007f\u0092)\u009eâíÎø\u0092ÇHÒ&Þâ-®8\u009c\u0007K\u0012\u0007\u001eð&½Õ\u008eÀÂÿ8ênæ©\u0095\u0083\u0080Å¿\bªg¦¤Uà@Ú\u007f\fjPf¡\u0015ì\u0000<?\u0003*I&\u009fÕäÀ\"ÿnD\f·(¢`\u009d\u008a\u0088Å\u0084\u001f÷'âgÝ¯È×Ä\u000f7N\"q\u001d¬\bí\u0004\u0017wMb\u0099]½HóD9·B¢\u009a\u009dÒ\u0088î\u00840^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíßø\u0089ÇKÒ>Þâ-¸8\u0081\u0007Q\u0012\u000f\u001eým³xoGJR\u0013^Þ\u00ad¦¸q\u0087 \u0092\u001e\u009eÇí\u0089\f\u0096ÿ¶êéÕ\rÀNÌ\u008e¿½ªû\u0095+\u0080E\u008c\u009a\u007fÃjîU2@nL\u0085?É*\u0004\u0015,\u0000t\fºÿÊê\u0006ÕWÀ}Ì£¿åª\u0014\u0095T\u0081\u0091\u008c³\u007fýj:U]A\u0089L±?ó*;\u0015V\u0001\u008d\fÑÿõê&ÕfÁ\u0099\u0003vðOå\u0012ÚçÏ Ãr°O¥\u0019\u009aÔ\u008f¦\u0083dp=e\u0004ZÔO\u0092Cz0,%ò\u001aÃ\u000f\u009f^á\u00adÕ¸\u009a\u0087f\u0092:\u009eêíØø\u0098ÇXÒ1Þï-\u00ad8\u0097\u0007[\u0012\u0007\u001eàm¶xkGYR\u0013\u008d\u0000~ khT\u009cAÍM\n>:+f\u0014¶\u0001Ù\r\u001dþCë~Ô ÁøÍ\u0018¾A«\u0096\u0094¾\u0081ö\u008d;~Gk\u0081TÐAçM3>f+\u0082\u0014Ä\u0000\u0005\r9þuë¿ÔÑÀ\u0005Í<¾q«©\u0094Þ\u0080\f\u008dJ~yk§Tó^&\u00ad\b¸\\\u0087´\u0092÷\u009e?í\u000eøTÇ\u009eÒêÞ>-q8]\u0007\u0090\u0012Ú\u001e:\n\u0017ù$ìhÓ\u0092ÆÄÊ\u000b¹>¬d\u0093¢\u0086Ñ\u008a\u001fy[lrS³FëJ\u00199T,\u0083\u0013«\u0006ó\n.ùIì\u0092ÓÂÆîÊ=¹x^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÁø\u008eÇHÒ4Þô-¤8\u0096\u0007A\u0012\r\u001eûmºxyGJR\u000e^Ä\u00ad¢¸~\u0087?\u0092\u0002\u009eÒí\u009døwÇ1ÓúÞÆ-\u00958]\u00079\u0013ú\u001eÄm\u0089xGG?Sï^¦\u00ad\u0091¸I\u0087\u0001\u0093ü\u009e°ízzø\u0089Ú\u009c\u0085£m¶;ºëÉÒÜ\u009cãVö?úæ\t´\u001c\u0091#Y6\u000f:ùI¤\\vcQv\u0013zÕ\u0089\u00ad\u009cw^ê\u00adÈ¸\u0097\u0087\u007f\u0092)\u009eùíÁø\u008eÇHÒ4Þô-¤8\u0096\u0007A\u0012\r\u001eûmºxyGJR\u000e^Ä\u00ad¢¸~\u0087?\u0092\u0002\u009eÒí\u009døwÇ1ÓúÞÆ-\u00898N\u0007=\u0013ö\u001eÄm\u0089xOG!Sù^¸\u00ad\u0086¸O\u0087\t\u0093ý\u009e\u00adíhøWÇ\u000bÓÃÞº-n88".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2254);
        CardContactlessPaymentDataJson = cArr;
        CardTrackConstructionDataJson = -4855376108229317222L;
    }

    static void init$0() {
        $$a = new byte[]{57, 59, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 75};
        $$b = 33;
    }
}
