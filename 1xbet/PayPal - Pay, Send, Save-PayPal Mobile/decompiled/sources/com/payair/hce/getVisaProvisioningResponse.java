package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AlternateContactlessPaymentDataJson' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class getVisaProvisioningResponse implements com.payair.hce.component4 {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final com.payair.hce.getVisaProvisioningResponse AlternateContactlessPaymentDataJson;
    private static com.payair.hce.getVisaProvisioningResponse DigitizedCardProfile;
    private static com.payair.hce.getVisaProvisioningResponse IccPrivateKeyCrtComponentsJson;
    private static com.payair.hce.getVisaProvisioningResponse RecordsJson;
    private static com.payair.hce.getVisaProvisioningResponse SdkCoreAlternateContactlessPaymentDataImpl;
    private static com.payair.hce.getVisaProvisioningResponse SdkCoreBusinessLogicModuleImpl;
    private static com.payair.hce.getVisaProvisioningResponse SdkCoreCardRiskManagementDataImpl;
    private static com.payair.hce.getVisaProvisioningResponse SdkCoreContactlessPaymentDataImpl;
    private static int build;
    private static com.payair.hce.getVisaProvisioningResponse buildRecords;
    private static com.payair.hce.getVisaProvisioningResponse getAdditionalCheckTable;
    private static com.payair.hce.getVisaProvisioningResponse getAid;
    private static final /* synthetic */ com.payair.hce.getVisaProvisioningResponse[] getAlternateContactlessPaymentData;
    private static com.payair.hce.getVisaProvisioningResponse getApplicationLifeCycleData;
    private static com.payair.hce.getVisaProvisioningResponse getCardLayoutDescription;
    private static com.payair.hce.getVisaProvisioningResponse getCardholderValidators;
    private static com.payair.hce.getVisaProvisioningResponse getCdol1RelatedDataLength;
    private static com.payair.hce.getVisaProvisioningResponse getCiacDecline;
    private static long getCiacDeclineOnPpms;
    private static com.payair.hce.getVisaProvisioningResponse getCrmCountryCode;
    private static com.payair.hce.getVisaProvisioningResponse getCvmResetTimeout;
    private static com.payair.hce.getVisaProvisioningResponse getCvrMaskAnd;
    private static com.payair.hce.getVisaProvisioningResponse getDualTapResetTimeout;
    private static com.payair.hce.getVisaProvisioningResponse getGpoResponse;
    private static com.payair.hce.getVisaProvisioningResponse getIccPrivateKeyCrtComponents;
    private static int getIssuerApplicationData;
    private static com.payair.hce.getVisaProvisioningResponse getMagstripeCvmIssuerOptions;
    private static com.payair.hce.getVisaProvisioningResponse getMchipCvmIssuerOptions;
    private static com.payair.hce.getVisaProvisioningResponse getPaymentFci;
    private static com.payair.hce.getVisaProvisioningResponse getPinIvCvc3Track2;
    private static com.payair.hce.getVisaProvisioningResponse getPpseFci;
    private static com.payair.hce.getVisaProvisioningResponse getProfileVersion;
    private static int getRecords;
    private static com.payair.hce.getVisaProvisioningResponse getSecurityWord;
    public static final com.payair.hce.getVisaProvisioningResponse valueOf;
    public static final com.payair.hce.getVisaProvisioningResponse values;
    public static final com.payair.hce.getVisaProvisioningResponse writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3 = b2 * 4;
        int i4 = 3 - (b * 3);
        byte[] bArr = $$a;
        int i5 = 119 - (i * 2);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i4;
            i5 = i3;
            int i7 = 0;
            i5 += -i4;
            i4 = i6;
            i2 = i7;
            int i8 = i4 + 1;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = i8;
            i4 = bArr[i8];
            i5 += -i4;
            i4 = i6;
            i2 = i7;
            int i82 = i4 + 1;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            int i822 = i4 + 1;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i3) {
            }
        }
    }

    private getVisaProvisioningResponse(java.lang.String str, int i) {
    }

    public static com.payair.hce.getVisaProvisioningResponse valueOf(java.lang.String str) {
        int i = build + 29;
        getRecords = i % 128;
        com.payair.hce.getVisaProvisioningResponse getvisaprovisioningresponse = (com.payair.hce.getVisaProvisioningResponse) java.lang.Enum.valueOf(com.payair.hce.getVisaProvisioningResponse.class, str);
        if (i % 2 == 0) {
            return getvisaprovisioningresponse;
        }
        throw null;
    }

    public static com.payair.hce.getVisaProvisioningResponse[] values() {
        getRecords = (build + 27) % 128;
        com.payair.hce.getVisaProvisioningResponse[] getvisaprovisioningresponseArr = (com.payair.hce.getVisaProvisioningResponse[]) getAlternateContactlessPaymentData.clone();
        getRecords = (build + 11) % 128;
        return getvisaprovisioningresponseArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getRecords = 0;
        build = 1;
        writeReplace();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("諷誾媳缧Ҕ佶ࡼᷓ\ue7b8禳갮焚ꑮ๗㖢\ud9b8䲛", android.view.ViewConfiguration.getScrollBarSize() >> 8, objArr);
        com.payair.hce.getVisaProvisioningResponse getvisaprovisioningresponse = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr[0]).intern(), 0);
        AlternateContactlessPaymentDataJson = getvisaprovisioningresponse;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b("\u0007\ufff6\ufff8\u0014\ufff9\ufffa\u000f\ufffe\t\ufffe￼\ufffe\ufff9\u0014\ufff9\ufffe\u0001\ufff6\u000b\u0003\ufffe\ufff9\ufffe\u0014\ufff9", true, 217 - android.view.View.MeasureSpec.getMode(0), 21 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 25 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
        com.payair.hce.getVisaProvisioningResponse getvisaprovisioningresponse2 = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr2[0]).intern(), 1);
        writeReplace = getvisaprovisioningresponse2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b("\u0013\ufff8\u0006\ufff5\ufff7\u0013\ufff8\ufff9\u000e�\b�\ufffb�\ufff8\u0013\ufff8�\u0000\ufff5\n\u0002�\ufff9\u0000�\ufffa\u0003\u0006\u0004", true, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 23, 30 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
        DigitizedCardProfile = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr3[0]).intern(), 2);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        b("\ufffa\uffff\ufff8\u0012\b\u0006\ufff8\u0012\ufffe\ufff8\f￼\u0001\t\ufff4\uffff￼\ufff7\u0012\ufff7￼\ufffa￼\u0007￼\r\ufff8\ufff7\u0012\ufff6\ufff4\u0005\ufff7\u0012\u0006￼\u0001", false, 219 - android.text.TextUtils.indexOf("", "", 0), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 11, 37 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
        getProfileVersion = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr4[0]).intern(), 3);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        b("￼\ufffa￼\ufff7\ufff7\u0001\b\u0002\ufff9\u0012\u0007\u0002\u0001\u0012\ufff7￼\u0012\ufff7\u0005\ufff4\ufff6\u0012\ufff7\ufff8\r￼\u0007", true, 219 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.text.TextUtils.getCapsMode("", 0, 0) + 4, 27 - android.graphics.Color.red(0), objArr5);
        IccPrivateKeyCrtComponentsJson = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr5[0]).intern(), 4);
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        b("￼\uffff\ufff4￼\u0007￼\u0001￼\u0012\u0007\u0002\u0001\u0012\ufff8\ufff7\uffff\ufff7\ufff8\r", true, android.text.TextUtils.getOffsetAfter("", 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE, android.text.TextUtils.getTrimmedLength("") + 16, 19 - android.text.TextUtils.getOffsetAfter("", 0), objArr6);
        RecordsJson = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr6[0]).intern(), 5);
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        b("\u000e\u0014\ufffe\u0003\ufffe\t\ufffe\ufff6\u0001\ufffe\u000f\ufffa\ufff9\u0001\ufff9\ufffa\u0014\ufff6\u0001\u0007\ufffa\ufff6\ufff9", false, android.graphics.ImageFormat.getBitsPerPixel(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE, 13 - (android.os.Process.myPid() >> 22), 23 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr7);
        getAid = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr7[0]).intern(), 6);
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        b("\ufff4\t\u0001￼\u0007\ufff4\u0000\u0005\u0002\ufff9\u0012\ufff7\u0005\u0002\ufff6\ufff8\u0005\u0012\ufffa\u0002\uffff\u0012\ufff7￼\uffff", true, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE, 4 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 25, objArr8);
        SdkCoreAlternateContactlessPaymentDataImpl = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr8[0]).intern(), 7);
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        a("Ňĉ\uf17e퓫琾㿕\u0cce陪䱯紓\udc9a疬\u2fd8ꖚ䔎\udd06윺ᴵ\u2e6a䪊岦牒雀뉴\uf403\uebdd缫ᯉ赲", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr9);
        getCvrMaskAnd = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr9[0]).intern(), 8);
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        a("㾝㿓\uec00즕\u0e68䖃軫ꢦ儇Ｐꛍ\uf799ᄄ룤㽁弡立_吮좢扴漵\uec99ぁ쫓\uf6adժ駨뎩", android.graphics.Color.argb(0, 0, 0, 0), objArr10);
        getPaymentFci = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr10[0]).intern(), 9);
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        a("墺壭㡁᷉咉ὲ㣕쾕蕜䤕ﰽ䆷瘫沿斳", android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr11);
        SdkCoreBusinessLogicModuleImpl = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr11[0]).intern(), 10);
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        b("\ufffe\ufff7\u0001\ufffa\u0014\u0005\u0007\u0004\ufffb\ufffe\u0001\ufffa\ufffe\u0003\ufff8\u0004\u0002\u0005\ufff6\t", false, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, 11 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.KeyEvent.normalizeMetaState(0) + 20, objArr12);
        getGpoResponse = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr12[0]).intern(), 11);
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        b("\u0007\ufff8\u0012\u0003\ufff4\f\u0000\ufff8\u0001\u0007\u0012\ufff6\u0005\ufff8\ufff7\ufff8\u0001\u0007￼\ufff4\uffff\u0006￼\u0001\t\ufff4\uffff￼\ufff7\u0012\u0005\ufff8\u0000\u0002", false, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE, 23 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 34 - android.view.View.resolveSize(0, 0), objArr13);
        getCiacDecline = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr13[0]).intern(), 12);
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        a("ίϦ\u1977㳣㱲瞐陧钋ꑼ\ue7a8铈\uef01ⴼ䶒൚䞢엖\uf526昨퀢幊驞\ude97⣙\uf6e4χ㝩腺辚ꭳ꿠᨟‶傉ᡏ", android.text.TextUtils.getOffsetBefore("", 0), objArr14);
        getSecurityWord = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr14[0]).intern(), 13);
        java.lang.Object[] objArr15 = new java.lang.Object[1];
        a("᠏ᡁ浧䣲\udb41邡집輮큫렀珴낢㚖㦌\uea69᠗\ude6d脰脉", (-1) - android.os.Process.getGidForName(""), objArr15);
        getDualTapResetTimeout = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr15[0]).intern(), 14);
        java.lang.Object[] objArr16 = new java.lang.Object[1];
        a("\ueb2f\ueb66랳鈧ਪ䇊\ueaac簕િ魧ꊗ鏝얠\ue35c㬜㭫ⵘ寳", (android.os.Process.getThreadPriority(0) + 20) >> 6, objArr16);
        com.payair.hce.getVisaProvisioningResponse getvisaprovisioningresponse3 = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr16[0]).intern(), 15);
        values = getvisaprovisioningresponse3;
        java.lang.Object[] objArr17 = new java.lang.Object[1];
        b("\ufffa\ufff8\u0000\ufff8\u0001\u0007\u0012\ufff8\u0005\u0005\u0002\u0005\u0005\ufff8\u0000\u0002\u0007\ufff8\u0012\u0000\ufff4\u0001\ufff4", false, 220 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 12 - android.graphics.Color.alpha(0), android.widget.ExpandableListView.getPackedPositionType(0L) + 23, objArr17);
        getApplicationLifeCycleData = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr17[0]).intern(), 16);
        java.lang.Object[] objArr18 = new java.lang.Object[1];
        b("\ufff6\n\u0003\ufffa\r\u0005\ufffa\ufff8\t\ufffa\ufff9\u0014\ufff9\ufff6\t", false, 217 - android.text.TextUtils.getCapsMode("", 0, 0), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1, android.os.Process.getGidForName("") + 16, objArr18);
        getCardLayoutDescription = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr18[0]).intern(), 17);
        java.lang.Object[] objArr19 = new java.lang.Object[1];
        b("\ufff8\u0006\u0006\ufff4\ufffa\ufff8\b\u0001\ufff8\u000b\u0003\ufff8\ufff6\u0007\ufff8\ufff7\u0012\u0003\u0005\u0002\u0007\u0002\ufff6\u0002\uffff\u0012\u0000", false, android.view.View.MeasureSpec.getMode(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 6, android.graphics.ImageFormat.getBitsPerPixel(0) + 28, objArr19);
        getCvmResetTimeout = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr19[0]).intern(), 18);
        java.lang.Object[] objArr20 = new java.lang.Object[1];
        a("䥬䤠蕉ꃜ轐쒣⛾\ude4d㡅圷⟸從柹톱빵\uf726輆", android.text.TextUtils.getOffsetBefore("", 0), objArr20);
        getCardholderValidators = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr20[0]).intern(), 19);
        java.lang.Object[] objArr21 = new java.lang.Object[1];
        a("ꦗ꧔\uea0a쾘┱滚錋㺾圄\ue2d3趏\uea61蜆뻴ᐗ䋂濡ه罳핇\uf465椿쟜", android.text.TextUtils.indexOf("", "", 0, 0), objArr21);
        getMchipCvmIssuerOptions = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr21[0]).intern(), 20);
        java.lang.Object[] objArr22 = new java.lang.Object[1];
        b("￼\ufff8\ufffa\ufff4\u0006\u0006\ufff8\u0000\u0012\uffff\u0002\ufff6\u0002\u0007\u0002\u0005\u0003\u0012\ufff7￼\uffff\ufff4\t\u0001", true, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE, 1 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23, objArr22);
        SdkCoreCardRiskManagementDataImpl = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr22[0]).intern(), 21);
        java.lang.Object[] objArr23 = new java.lang.Object[1];
        b("\u000f\uffff\u0004\u0000\t\u0002\ufff3\u0002\uffff\u0002\u0002\ufff5", true, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, 7 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.text.TextUtils.indexOf("", "") + 12, objArr23);
        getMagstripeCvmIssuerOptions = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr23[0]).intern(), 22);
        java.lang.Object[] objArr24 = new java.lang.Object[1];
        b("\ufff6\ufffe\u0004\u0001\u0004\u0004\ufff7\u0011\ufff7", true, 221 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2 - android.text.TextUtils.indexOf("", ""), android.text.TextUtils.getOffsetAfter("", 0) + 9, objArr24);
        getAdditionalCheckTable = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr24[0]).intern(), 23);
        java.lang.Object[] objArr25 = new java.lang.Object[1];
        a("ఈౘ蝘ꋐ黐픫睦鬩㩉ھ㙾ง⊖펻꿡ꚧ쩯欙쒒ㄳ凷Ѥ簾짙樓鷿闓恷耽㕀൝\ufb0f⾂", android.view.View.combineMeasuredStates(0, 0), objArr25);
        getCdol1RelatedDataLength = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr25[0]).intern(), 24);
        java.lang.Object[] objArr26 = new java.lang.Object[1];
        a("㪒㫆뭕黝溂╷苟궩ٖ\uf31f온﮽ᐋ\uefb0徽匞ﳹ圓㓔쒋杳㡨豦㱮쿖ꇾ斆闀뚶ीﴁ\u0ea4ᤋ\uf2a4䪳", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, objArr26);
        SdkCoreContactlessPaymentDataImpl = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr26[0]).intern(), 25);
        java.lang.Object[] objArr27 = new java.lang.Object[1];
        b("\u0002\u0003�\b\ufff5\u0006\b\u0007�\ufffb\ufff9\u0006\u0013\u0001\ufff7\ufffb\ufff8\ufff9\u0000�\ufff5\ufffa\u0013", true, 218 - android.graphics.Color.blue(0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 16, android.view.View.resolveSizeAndState(0, 0, 0) + 23, objArr27);
        getCrmCountryCode = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr27[0]).intern(), 26);
        java.lang.Object[] objArr28 = new java.lang.Object[1];
        a("댽덳ᖀ〟㢿獟옗␚ꢐ럎逈뽧鶨䅸উ\u17df畗", (-1) - android.view.MotionEvent.axisFromString(""), objArr28);
        buildRecords = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr28[0]).intern(), 27);
        java.lang.Object[] objArr29 = new java.lang.Object[1];
        b("\u0007\u0003\ufff7\u0004\u0011\u0004\ufff7\ufffa\u0006\u0001\u0000\ufff3\u0005\u0005\ufff7\ufff5\u0001\u0004\u0002\u0011\u0000\ufffb\u0011\u000b\ufff6\ufff3\ufff7\u0004\ufffe\ufff3\u0011\u0005\ufffb\u0011\u0006\u0005\ufff7", true, 268 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 13, android.text.TextUtils.getOffsetBefore("", 0) + 37, objArr29);
        getPpseFci = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr29[0]).intern(), 28);
        java.lang.Object[] objArr30 = new java.lang.Object[1];
        b("\u0007\u0002\u0012\ufff9\ufff8\u0007\ufff6\ufffb\u0012\u0006\ufff8\u0006\u0006￼\u0002\u0001\ufff9\ufff4￼\uffff\ufff8\ufff7\u0012", false, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE, android.text.TextUtils.indexOf("", "", 0) + 16, 23 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr30);
        getIccPrivateKeyCrtComponents = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr30[0]).intern(), 29);
        java.lang.Object[] objArr31 = new java.lang.Object[1];
        b("\u0000\u0007\u0011\u0001\u0006\u0011\ufff7\u0007\ufff6\u0011\ufff6\ufff7\ufffe\ufffb\ufff3\ufff8\u0000\u0001\u0005\ufff3\ufff7\u0004\u0011\u0000\t\u0001\u0000�", true, 220 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 15 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (-16777188) - android.graphics.Color.rgb(0, 0, 0), objArr31);
        getPinIvCvc3Track2 = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr31[0]).intern(), 30);
        java.lang.Object[] objArr32 = new java.lang.Object[1];
        a("硛砉睬勹먳\uf1cb䟮\uef7c쩸㘬ኒ㺈囔⎏謁阭븳鬬\ue068ƭ▩\uf453壌陋", (android.os.Process.getThreadPriority(0) + 20) >> 6, objArr32);
        com.payair.hce.getVisaProvisioningResponse getvisaprovisioningresponse4 = new com.payair.hce.getVisaProvisioningResponse(((java.lang.String) objArr32[0]).intern(), 31);
        valueOf = getvisaprovisioningresponse4;
        getAlternateContactlessPaymentData = new com.payair.hce.getVisaProvisioningResponse[]{getvisaprovisioningresponse, getvisaprovisioningresponse2, DigitizedCardProfile, getProfileVersion, IccPrivateKeyCrtComponentsJson, RecordsJson, getAid, SdkCoreAlternateContactlessPaymentDataImpl, getCvrMaskAnd, getPaymentFci, SdkCoreBusinessLogicModuleImpl, getGpoResponse, getCiacDecline, getSecurityWord, getDualTapResetTimeout, getvisaprovisioningresponse3, getApplicationLifeCycleData, getCardLayoutDescription, getCvmResetTimeout, getCardholderValidators, getMchipCvmIssuerOptions, SdkCoreCardRiskManagementDataImpl, getMagstripeCvmIssuerOptions, getAdditionalCheckTable, getCdol1RelatedDataLength, SdkCoreContactlessPaymentDataImpl, getCrmCountryCode, buildRecords, getPpseFci, getIccPrivateKeyCrtComponents, getPinIvCvc3Track2, getvisaprovisioningresponse4};
        int i = build + 33;
        getRecords = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr = str;
        if (str != null) {
            $11 = ($10 + 57) % 128;
            char[] charArray = str.toCharArray();
            $10 = ($11 + 47) % 128;
            cArr = charArray;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(getCiacDeclineOnPpms ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i2 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(getCiacDeclineOnPpms)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.graphics.ImageFormat.getBitsPerPixel(0), android.view.KeyEvent.normalizeMetaState(0) + 1921, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    byte b = (byte) ($$b & 7);
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 27, 429 - android.text.TextUtils.indexOf("", ""), (char) (31610 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c(0, (byte) 0, (byte) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
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
        objArr[0] = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
    }

    private static void b(java.lang.String str, boolean z, int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4 = $10 + 125;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i5 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5]), java.lang.Integer.valueOf(getIssuerApplicationData)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 2073, (char) (android.text.TextUtils.getOffsetBefore("", 0) + 60037));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(2, (byte) 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(54 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 3544 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
            $10 = ($11 + 61) % 128;
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr2 = new char[i3];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i3);
            java.lang.System.arraycopy(cArr2, 0, cArr, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr3 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                int i6 = $11 + 71;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[i3 % digitizedCardJson11.DigitizedCardProfile];
                    java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 3543 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } else {
                    cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                    java.lang.Object[] objArr6 = {digitizedCardJson11, digitizedCardJson11};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3542, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                }
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void init$0() {
        $$a = new byte[]{38, -91, 120, 99};
        $$b = 49;
    }

    static void writeReplace() {
        getCiacDeclineOnPpms = 3944665916516421913L;
        getIssuerApplicationData = 1889207279;
    }
}
