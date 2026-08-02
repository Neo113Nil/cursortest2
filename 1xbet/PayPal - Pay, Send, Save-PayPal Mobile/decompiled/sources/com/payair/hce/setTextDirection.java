package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0091\u0001\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b \u0010\"R\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001cR\"\u0010\u001e\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!\"\u0004\b\u0016\u0010\"R\u0011\u0010*\u001a\u00020(8G¢\u0006\u0006\u001a\u0004\b$\u0010)R$\u0010&\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001c\u001a\u0004\b*\u0010\u001a\"\u0004\b,\u0010-R$\u0010,\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001c\u001a\u0004\b%\u0010\u001a\"\u0004\b\u0016\u0010-R\"\u0010%\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001d\u0010!\"\u0004\b#\u0010\"R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u0010.\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001c\u001a\u0004\b#\u0010\u001a\"\u0004\b\u001e\u0010-R\u0011\u0010\u001b\u001a\u0002018G¢\u0006\u0006\u001a\u0004\b2\u00103R\"\u0010+\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u00100\u001a\u0004\b\u001e\u00104\"\u0004\b\u0016\u00105R$\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001c\u001a\u0004\b&\u0010\u001a\"\u0004\b\u001d\u0010-R\"\u0010$\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001f\u001a\u0004\b+\u0010!\"\u0004\b\u001e\u0010\"R\"\u00106\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010\u001f\u001a\u0004\b.\u0010!\"\u0004\b\u001d\u0010\"R\u0018\u00107\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR$\u00108\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001c\u001a\u0004\b,\u0010\u001a\"\u0004\b \u0010-R$\u00102\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001c\u001a\u0004\b\u001b\u0010\u001a\"\u0004\b&\u0010-R$\u0010/\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u0016\u0010\u001a\"\u0004\b#\u0010-"}, d2 = {"Lcom/payair/hce/setTextDirection;", "", "<init>", "()V", "", "p0", "", "p1", "p2", "", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "", "writeReplace", "(JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getPaymentFci", "toString", "()Ljava/lang/String;", "SdkCoreBusinessLogicModuleImpl", "Ljava/lang/String;", "values", "DigitizedCardProfile", com.visa.cbp.getEncExpo.warmup, "valueOf", "()I", "(I)V", "AlternateContactlessPaymentDataJson", "getCiacDecline", "RecordsJson", "getProfileVersion", "IccPrivateKeyCrtComponentsJson", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "getAid", "getGpoResponse", "SdkCoreAlternateContactlessPaymentDataImpl", "(Ljava/lang/String;)V", "getCvrMaskAnd", "getSecurityWord", "J", "Lcom/payair/hce/setPointerIcon;", "getApplicationLifeCycleData", "()Lcom/payair/hce/setPointerIcon;", "()J", "(J)V", "getDualTapResetTimeout", "getCvmResetTimeout", "getCardLayoutDescription"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setTextDirection {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static char SdkCoreCardRiskManagementDataImpl;
    private static int buildRecords;
    private static char getAdditionalCheckTable;
    private static char[] getCardLayoutDescription;
    private static char[] getCardholderValidators;
    private static char getCrmCountryCode;
    private static long getMagstripeCvmIssuerOptions;
    private static char getMchipCvmIssuerOptions;
    private static int getPpseFci;

    /* renamed from: valueOf, reason: from kotlin metadata */
    public static final com.payair.hce.setTextDirection.Companion INSTANCE;

    /* renamed from: AlternateContactlessPaymentDataJson, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "personId")
    private long getGpoResponse;

    /* renamed from: DigitizedCardProfile, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = com.datadog.android.sessionreplay.internal.processor.EnrichedResource.APPLICATION_ID_KEY)
    private int AlternateContactlessPaymentDataJson;

    /* renamed from: IccPrivateKeyCrtComponentsJson, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "serverAddress")
    private java.lang.String getCardLayoutDescription;

    /* renamed from: RecordsJson, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "btMacId")
    private java.lang.String writeReplace;

    /* renamed from: SdkCoreAlternateContactlessPaymentDataImpl, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "privateSshKey")
    private java.lang.String getPaymentFci;

    /* renamed from: SdkCoreBusinessLogicModuleImpl, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "appVersion")
    private java.lang.String values;

    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "userCountry")
    private java.lang.String getApplicationLifeCycleData;

    /* renamed from: getCiacDecline, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "bankApplicationId")
    private java.lang.String valueOf;

    /* renamed from: getCvmResetTimeout, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "screenWidth")
    private int getDualTapResetTimeout;

    /* renamed from: getCvrMaskAnd, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "km")
    private java.lang.String SdkCoreAlternateContactlessPaymentDataImpl;

    /* renamed from: getDualTapResetTimeout, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "screenHeight")
    private int getCiacDecline;

    /* renamed from: getGpoResponse, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "kd")
    private java.lang.String getProfileVersion;

    /* renamed from: getPaymentFci, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "sdkVersion")
    private java.lang.String getCvmResetTimeout;

    /* renamed from: getSecurityWord, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "mpWalletId")
    private long IccPrivateKeyCrtComponentsJson;

    /* renamed from: values, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "languageId")
    private int RecordsJson;

    /* renamed from: writeReplace, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "version")
    private java.lang.String getSecurityWord;

    /* renamed from: getAid, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "msisdn")
    private java.lang.String getCvrMaskAnd = "";

    /* renamed from: getProfileVersion, reason: from kotlin metadata */
    @com.payair.hce.SdkCoreContactlessPaymentDataImpl(valueOf = "btServerPort")
    private int DigitizedCardProfile = -1;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        switch ((i * (-501)) + (i2 * 503) + (((~(i2 | i)) | (~(i4 | i3))) * (-502)) + ((~((~i3) | i4 | i)) * (-502)) + (((~((~i) | i3)) | i4) * 502)) {
            case 1:
                return AlternateContactlessPaymentDataJson(objArr);
            case 2:
                return values(objArr);
            case 3:
                com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
                int i5 = buildRecords;
                getPpseFci = ((i5 ^ 49) + ((i5 & 49) << 1)) % 128;
                int i6 = settextdirection.getDualTapResetTimeout;
                int i7 = i5 & 115;
                int i8 = -(-((i5 ^ 115) | i7));
                getPpseFci = ((i7 & i8) + (i8 | i7)) % 128;
                return java.lang.Integer.valueOf(i6);
            case 4:
                return valueOf(objArr);
            case 5:
                return writeReplace(objArr);
            case 6:
                return getAid(objArr);
            case 7:
                com.payair.hce.setTextDirection settextdirection2 = (com.payair.hce.setTextDirection) objArr[0];
                java.lang.String str = (java.lang.String) objArr[1];
                int i9 = getPpseFci;
                int i10 = i9 & 19;
                int i11 = (~i10) & (i9 | 19);
                int i12 = -(-(i10 << 1));
                buildRecords = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
                settextdirection2.getCvrMaskAnd = str;
                buildRecords = ((i9 & 3) + (i9 | 3)) % 128;
                return null;
            case 8:
                return SdkCoreAlternateContactlessPaymentDataImpl(objArr);
            case 9:
                return getProfileVersion(objArr);
            case 10:
                return RecordsJson(objArr);
            case 11:
                return IccPrivateKeyCrtComponentsJson(objArr);
            case 12:
                return getPaymentFci(objArr);
            case 13:
                return getCiacDecline(objArr);
            case 14:
                com.payair.hce.setTextDirection settextdirection3 = (com.payair.hce.setTextDirection) objArr[0];
                int i13 = buildRecords;
                int i14 = ((((i13 ^ 107) | (i13 & 107)) << 1) - ((i13 & (-108)) | ((~i13) & 107))) % 128;
                getPpseFci = i14;
                java.lang.String str2 = settextdirection3.getApplicationLifeCycleData;
                int i15 = i14 & 65;
                buildRecords = (i15 + ((i14 ^ 65) | i15)) % 128;
                return str2;
            case 15:
                return SdkCoreBusinessLogicModuleImpl(objArr);
            case 16:
                return getGpoResponse(objArr);
            case 17:
                return getCvrMaskAnd(objArr);
            case 18:
                com.payair.hce.setTextDirection settextdirection4 = (com.payair.hce.setTextDirection) objArr[0];
                int i16 = ((-2) - (~(buildRecords + 36))) % 128;
                getPpseFci = i16;
                int i17 = settextdirection4.DigitizedCardProfile;
                int i18 = i16 & 125;
                int i19 = (i16 | 125) & (~i18);
                int i20 = i18 << 1;
                buildRecords = ((i19 ^ i20) + ((i19 & i20) << 1)) % 128;
                return java.lang.Integer.valueOf(i17);
            case 19:
                return getDualTapResetTimeout(objArr);
            case 20:
                com.payair.hce.setTextDirection settextdirection5 = (com.payair.hce.setTextDirection) objArr[0];
                int i21 = getPpseFci;
                int i22 = i21 & 101;
                buildRecords = (i22 + ((i21 ^ 101) | i22)) % 128;
                long j = settextdirection5.getGpoResponse;
                int i23 = settextdirection5.AlternateContactlessPaymentDataJson;
                int i24 = settextdirection5.RecordsJson;
                java.lang.String str3 = settextdirection5.getSecurityWord;
                java.lang.String str4 = settextdirection5.getCvrMaskAnd;
                java.lang.String str5 = settextdirection5.writeReplace;
                int i25 = settextdirection5.DigitizedCardProfile;
                java.lang.String str6 = settextdirection5.getPaymentFci;
                java.lang.String str7 = settextdirection5.getCardLayoutDescription;
                java.lang.String str8 = settextdirection5.valueOf;
                java.lang.String str9 = settextdirection5.values;
                java.lang.String str10 = settextdirection5.getCvmResetTimeout;
                java.lang.String str11 = settextdirection5.SdkCoreAlternateContactlessPaymentDataImpl;
                java.lang.String str12 = settextdirection5.getProfileVersion;
                int i26 = settextdirection5.getDualTapResetTimeout;
                int i27 = settextdirection5.getCiacDecline;
                java.lang.String str13 = settextdirection5.getApplicationLifeCycleData;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ApplicationInfo{personId=");
                sb.append(j);
                sb.append(", applicationId=");
                sb.append(i23);
                sb.append(", languageId=");
                sb.append(i24);
                sb.append(", version='");
                sb.append(str3);
                sb.append("', msisdn='");
                sb.append(str4);
                sb.append("', btMacId='");
                sb.append(str5);
                sb.append("', btServerPort=");
                sb.append(i25);
                sb.append(", privateSshKey='");
                sb.append(str6);
                sb.append("', serverAddress='");
                sb.append(str7);
                sb.append("', bankApplicationId='");
                sb.append(str8);
                sb.append("', appVersion='");
                sb.append(str9);
                sb.append("', sdkVersion='");
                sb.append(str10);
                sb.append("', km='");
                sb.append(str11);
                sb.append("', kd='");
                sb.append(str12);
                sb.append("', screenWidth=");
                sb.append(i26);
                sb.append(", screenHeight=");
                sb.append(i27);
                sb.append(", userCountry='");
                sb.append(str13);
                sb.append("'}");
                java.lang.String obj = sb.toString();
                int i28 = getPpseFci;
                int i29 = i28 & 77;
                buildRecords = (((i28 | 77) & (~i29)) + (i29 << 1)) % 128;
                return obj;
            case 21:
                com.payair.hce.setTextDirection settextdirection6 = (com.payair.hce.setTextDirection) objArr[0];
                com.payair.hce.setPointerIcon setpointericon = new com.payair.hce.setPointerIcon();
                com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, settextdirection6.getProfileVersion}, -818506302, 818506339, java.lang.System.identityHashCode(setpointericon));
                int i30 = settextdirection6.AlternateContactlessPaymentDataJson;
                com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, java.lang.Integer.valueOf(i30)}, -7790155, 7790172, i30);
                com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, settextdirection6.writeReplace}, -1506935454, 1506935464, java.lang.System.identityHashCode(setpointericon));
                int i31 = settextdirection6.DigitizedCardProfile;
                com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, java.lang.Integer.valueOf(i31)}, 618140867, -618140845, i31);
                com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, settextdirection6.SdkCoreAlternateContactlessPaymentDataImpl}, 65265109, -65265079, java.lang.System.identityHashCode(setpointericon));
                int i32 = settextdirection6.RecordsJson;
                com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, java.lang.Integer.valueOf(i32)}, -383060247, 383060249, i32);
                com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, settextdirection6.getCvrMaskAnd}, -90143811, 90143811, java.lang.System.identityHashCode(setpointericon));
                com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, java.lang.Long.valueOf(settextdirection6.getGpoResponse)}, -1124132126, 1124132161, java.lang.System.identityHashCode(setpointericon));
                com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, settextdirection6.getPaymentFci}, 461600393, -461600357, java.lang.System.identityHashCode(setpointericon));
                int i33 = settextdirection6.getCiacDecline;
                com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, java.lang.Integer.valueOf(i33)}, 100140492, -100140478, i33);
                int i34 = settextdirection6.getDualTapResetTimeout;
                com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, java.lang.Integer.valueOf(i34)}, 1950333970, -1950333969, i34);
                com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, settextdirection6.getCardLayoutDescription}, 1364001918, -1364001909, java.lang.System.identityHashCode(setpointericon));
                com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, settextdirection6.getApplicationLifeCycleData}, -779281337, 779281353, java.lang.System.identityHashCode(setpointericon));
                com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, settextdirection6.getSecurityWord}, -458764128, 458764151, java.lang.System.identityHashCode(setpointericon));
                com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, settextdirection6.values}, -363999224, 363999255, java.lang.System.identityHashCode(setpointericon));
                com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, settextdirection6.getCvmResetTimeout}, 1261895947, -1261895935, java.lang.System.identityHashCode(setpointericon));
                com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, java.lang.Long.valueOf(settextdirection6.IccPrivateKeyCrtComponentsJson)}, -320800811, 320800831, java.lang.System.identityHashCode(setpointericon));
                com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, settextdirection6.valueOf}, -1972616230, 1972616243, java.lang.System.identityHashCode(setpointericon));
                int i35 = buildRecords;
                int i36 = i35 & 99;
                getPpseFci = ((i36 - (~(-(-((i35 ^ 99) | i36))))) - 1) % 128;
                return setpointericon;
            case 22:
                return getCvmResetTimeout(objArr);
            case 23:
                return getCardLayoutDescription(objArr);
            case 24:
                return getApplicationLifeCycleData(objArr);
            case 25:
                return getSecurityWord(objArr);
            case 26:
                return getCardholderValidators(objArr);
            case 27:
                return getMchipCvmIssuerOptions(objArr);
            case 28:
                com.payair.hce.setTextDirection settextdirection7 = (com.payair.hce.setTextDirection) objArr[0];
                int intValue = ((java.lang.Number) objArr[1]).intValue();
                int i37 = buildRecords;
                getPpseFci = (i37 + 57) % 128;
                settextdirection7.RecordsJson = intValue;
                int i38 = i37 & 77;
                int i39 = (i37 ^ 77) | i38;
                getPpseFci = ((i38 ^ i39) + ((i38 & i39) << 1)) % 128;
                return null;
            case 29:
                return getAdditionalCheckTable(objArr);
            case 30:
                return getMagstripeCvmIssuerOptions(objArr);
            default:
                return DigitizedCardProfile(objArr);
        }
    }

    private static void a(int i, short s, int i2, java.lang.Object[] objArr) {
        byte[] bArr = $$g;
        int i3 = 3 - (i * 4);
        int i4 = s + 99;
        int i5 = i2 * 4;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 += i6;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            i3++;
            if (i7 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i4 += bArr[i3];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3 = 119 - b;
        byte[] bArr = $$a;
        int i4 = i + 4;
        byte[] bArr2 = new byte[b2 + 6];
        if (bArr == null) {
            int i5 = i4;
            int i6 = 0;
            i3 = (i4 + i3) - 2;
            i4 = i5;
            i2 = i6;
            bArr2[i2] = (byte) i3;
            int i7 = i4 + 1;
            if (i2 == b2 + 5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b3 = bArr[i7];
            i4 = i3;
            i3 = b3;
            i6 = i2 + 1;
            i5 = i7;
            i3 = (i4 + i3) - 2;
            i4 = i5;
            i2 = i6;
            bArr2[i2] = (byte) i3;
            int i72 = i4 + 1;
            if (i2 == b2 + 5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            int i722 = i4 + 1;
            if (i2 == b2 + 5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = i + 4;
        byte[] bArr = $$d;
        int i5 = b + 99;
        int i6 = s + 6;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            i5 = i6;
            i3 = 0;
            i5 = i5 + (-i7) + 7;
            i4++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i5 = i5 + (-i7) + 7;
            i4++;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    private static /* synthetic */ java.lang.Object getAdditionalCheckTable(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        int i = getPpseFci;
        int i2 = ((i & (-102)) | ((~i) & 101)) + ((i & 101) << 1);
        buildRecords = i2 % 128;
        long j = settextdirection.getGpoResponse;
        if (i2 % 2 != 0) {
            return java.lang.Long.valueOf(j);
        }
        throw null;
    }

    private static void f(int i, int i2, char c, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        short s = 0;
        getcvmmodel.valueOf = 0;
        $10 = ($11 + 31) % 128;
        while (getcvmmodel.valueOf < i2) {
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                objArr2[s] = java.lang.Integer.valueOf(getCardLayoutDescription[i + getcvmmodel.valueOf]);
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 48, 381 - android.view.KeyEvent.keyCodeFromString(""), (char) (62388 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(s, s, s, objArr3);
                    java.lang.String str = (java.lang.String) objArr3[s];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[s] = java.lang.Integer.TYPE;
                    obj = cls.getMethod(str, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getMagstripeCvmIssuerOptions), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.graphics.Color.alpha(0), 3966 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 211, (char) android.view.KeyEvent.keyCodeFromString(""))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                s = 0;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        int i4 = $11 + 79;
        while (true) {
            $10 = i4 % 128;
            if (getcvmmodel.valueOf >= i2) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 34, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.view.View.getDefaultSize(0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            i4 = $11 + 43;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0401 A[Catch: all -> 0x0714, TryCatch #2 {all -> 0x0714, blocks: (B:11:0x0125, B:13:0x0141, B:14:0x0191, B:15:0x03f2, B:17:0x0401, B:18:0x0433, B:20:0x044f, B:21:0x0487, B:24:0x04a2, B:26:0x04b1, B:27:0x04e3, B:29:0x050b, B:30:0x0560, B:40:0x060d, B:42:0x061c, B:43:0x0653, B:45:0x067b, B:46:0x06d3, B:55:0x01dc, B:57:0x01f8, B:58:0x024f, B:60:0x029f, B:62:0x02c0, B:63:0x0316), top: B:4:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x044f A[Catch: all -> 0x0714, TryCatch #2 {all -> 0x0714, blocks: (B:11:0x0125, B:13:0x0141, B:14:0x0191, B:15:0x03f2, B:17:0x0401, B:18:0x0433, B:20:0x044f, B:21:0x0487, B:24:0x04a2, B:26:0x04b1, B:27:0x04e3, B:29:0x050b, B:30:0x0560, B:40:0x060d, B:42:0x061c, B:43:0x0653, B:45:0x067b, B:46:0x06d3, B:55:0x01dc, B:57:0x01f8, B:58:0x024f, B:60:0x029f, B:62:0x02c0, B:63:0x0316), top: B:4:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0582  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.Object invoke;
        java.lang.Object obj;
        int intValue;
        java.lang.Object obj2;
        int intValue2;
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        long longValue = ((java.lang.Number) objArr[1]).longValue();
        int i = getPpseFci + 75;
        buildRecords = i % 128;
        if (i % 2 == 0) {
            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.graphics.Color.argb(0, 0, 0, 0), 754 - android.view.KeyEvent.keyCodeFromString(""), (char) (45560 - android.text.TextUtils.getTrimmedLength("")));
            byte b = (byte) ($$b & 55);
            byte b2 = $$a[63];
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b(b, b2, (byte) (b2 & com.google.common.base.Ascii.GS), objArr2);
            cls.getField((java.lang.String) objArr2[0]).getLong(null);
            throw null;
        }
        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.graphics.Color.alpha(0), 754 - android.graphics.Color.argb(0, 0, 0, 0), (char) (45560 - android.text.TextUtils.getOffsetAfter("", 0)));
        byte b3 = (byte) ($$b & 55);
        byte[] bArr = $$a;
        byte b4 = bArr[63];
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b(b3, b4, (byte) (b4 & com.google.common.base.Ascii.GS), objArr3);
        long j = cls2.getField((java.lang.String) objArr3[0]).getLong(null);
        try {
            try {
                try {
                    if (j != -1) {
                        int i2 = getPpseFci;
                        buildRecords = ((((i2 & (-56)) | ((~i2) & 55)) - (~(-(-((i2 & 55) << 1))))) - 1) % 128;
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        c("\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001", false, new int[]{0, 22, 0, 20}, objArr4);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c("\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", true, new int[]{22, 15, 116, 2}, objArr5);
                        if (j + 1891 >= ((java.lang.Long) cls3.getDeclaredMethod((java.lang.String) objArr5[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                            int i3 = buildRecords;
                            int i4 = i3 & 77;
                            int i5 = ((i3 ^ 77) | i4) << 1;
                            int i6 = -((i3 | 77) & (~i4));
                            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
                            getPpseFci = i7 % 128;
                            if (i7 % 2 != 0) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.view.View.MeasureSpec.getMode(0) + 754, (char) (android.view.KeyEvent.normalizeMetaState(0) + 45560));
                                byte b5 = bArr[50];
                                byte b6 = (byte) (-bArr[23]);
                                byte b7 = (byte) (-bArr[19]);
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                b(b5, b6, b7, objArr6);
                                java.lang.Object[] objArr7 = {cls4.getField((java.lang.String) objArr6[0]).get(null), 102934483, 0};
                                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                if (obj3 == null) {
                                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.argb(0, 0, 0, 0), android.view.KeyEvent.normalizeMetaState(0) + 4790, (char) (31152 - android.text.TextUtils.getOffsetBefore("", 0)))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.view.KeyEvent.keyCodeFromString(""), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4750, (char) (android.text.TextUtils.getOffsetAfter("", 0) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj3);
                                }
                                invoke = ((java.lang.reflect.Method) obj3).invoke(null, objArr7);
                            } else {
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 47, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 755, (char) (45560 - android.text.TextUtils.indexOf("", "")));
                                byte b8 = bArr[50];
                                byte b9 = (byte) (-bArr[23]);
                                byte b10 = (byte) (-bArr[19]);
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                b(b8, b9, b10, objArr8);
                                java.lang.Object[] objArr9 = {cls5.getField((java.lang.String) objArr8[0]).get(null), 102934483, 0};
                                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                if (obj4 == null) {
                                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.getTrimmedLength(""), android.view.KeyEvent.getDeadChar(0, 0) + 4790, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31151))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 4750, (char) (android.text.TextUtils.getOffsetAfter("", 0) + 33701)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj4);
                                }
                                invoke = ((java.lang.reflect.Method) obj4).invoke(null, objArr9);
                            }
                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                            if (obj == null) {
                                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39, android.view.KeyEvent.keyCodeFromString("") + 4750, (char) (33701 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)))).getMethod("values", null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-273776192, obj);
                            }
                            intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(invoke, null)).intValue();
                            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                            if (obj2 == null) {
                                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4750, (char) (33700 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))).getMethod("DigitizedCardProfile", null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-712736454, obj2);
                            }
                            intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(invoke, null)).intValue();
                            if (intValue2 != intValue) {
                                int i8 = getPpseFci;
                                int i9 = i8 & 37;
                                buildRecords = (i9 + ((i8 ^ 37) | i9)) % 128;
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                if (obj5 == null) {
                                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '\b', 4751 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.graphics.Color.rgb(0, 0, 0) + 16810917))).getMethod("valueOf", null);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj5);
                                }
                                java.lang.Object[] objArr10 = {invoke, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(invoke, null)).intValue()), 0};
                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                if (obj6 == null) {
                                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.red(0), android.graphics.ImageFormat.getBitsPerPixel(0) + 4791, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 31152))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 40, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 4750, (char) (33701 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj6);
                                }
                                ((java.lang.reflect.Method) obj6).invoke(null, objArr10);
                                int i10 = getPpseFci;
                                int i11 = i10 & 9;
                                int i12 = (i10 | 9) & (~i11);
                                int i13 = -(-(i11 << 1));
                                int i14 = (i12 & i13) + (i12 | i13);
                                buildRecords = i14 % 128;
                                if (i14 % 2 == 0) {
                                    int i15 = 5 / 4;
                                }
                            } else {
                                int i16 = (~intValue2) & intValue;
                                int i17 = (~intValue) & intValue2;
                                long j2 = (i17 ^ i16) | (i17 & i16);
                                int i18 = buildRecords;
                                getPpseFci = (((i18 ^ 35) - (~(-(-((i18 & 35) << 1))))) - 1) % 128;
                                int i19 = i18 & 75;
                                int i20 = ((i18 ^ 75) | i19) << 1;
                                int i21 = -((i18 | 75) & (~i19));
                                getPpseFci = ((i20 & i21) + (i21 | i20)) % 128;
                                try {
                                    java.lang.Object[] objArr11 = {java.lang.Long.valueOf(j2 ^ 3914093100884033536L), 911322864L};
                                    int i22 = $$d[61] - 1;
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    d((byte) i22, r6[19], (short) i22, objArr12);
                                    java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                    d(r6[125], r6[126], r6[34], objArr13);
                                    cls6.getMethod((java.lang.String) objArr13[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr11);
                                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(101810766);
                                    if (obj7 == null) {
                                        obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 40, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4749, (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 33701))).getMethod("valueOf", null);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(101810766, obj7);
                                    }
                                    java.lang.Object[] objArr14 = {invoke, java.lang.Integer.valueOf(((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(invoke, null)).intValue()), 0};
                                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-444027579);
                                    if (obj8 == null) {
                                        obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 4790, (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 31152))).getMethod("valueOf", (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777256, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 4750, (char) (33701 - android.view.View.MeasureSpec.getSize(0))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-444027579, obj8);
                                    }
                                    ((java.lang.reflect.Method) obj8).invoke(null, objArr14);
                                    int i23 = getPpseFci;
                                    int i24 = i23 & 89;
                                    buildRecords = (i24 + ((i23 ^ 89) | i24)) % 128;
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            }
                            settextdirection.getGpoResponse = longValue;
                            int i25 = buildRecords;
                            getPpseFci = ((i25 & 35) + (i25 | 35)) % 128;
                            return null;
                        }
                    }
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    c("\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001", false, new int[]{0, 22, 0, 20}, objArr15);
                    java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    c("\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", true, new int[]{22, 15, 116, 2}, objArr16);
                    long longValue2 = ((java.lang.Long) cls7.getDeclaredMethod((java.lang.String) objArr16[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 753 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 45559));
                    byte b11 = bArr[63];
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    b(b3, b11, (byte) (b11 & com.google.common.base.Ascii.GS), objArr17);
                    cls8.getField((java.lang.String) objArr17[0]).set(null, java.lang.Long.valueOf(longValue2));
                    int i26 = getPpseFci;
                    int i27 = i26 ^ 97;
                    int i28 = ((i26 & 97) | i27) << 1;
                    int i29 = -i27;
                    int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
                    buildRecords = i30 % 128;
                    if (i30 % 2 == 0) {
                        int i31 = 2 / 4;
                    }
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-273776192);
                    if (obj == null) {
                    }
                    intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(invoke, null)).intValue();
                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-712736454);
                    if (obj2 == null) {
                    }
                    intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(invoke, null)).intValue();
                    if (intValue2 != intValue) {
                    }
                    settextdirection.getGpoResponse = longValue;
                    int i252 = buildRecords;
                    getPpseFci = ((i252 & 35) + (i252 | 35)) % 128;
                    return null;
                } catch (java.lang.Exception unused) {
                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            c(null, true, new int[]{37, 16, 186, 9}, objArr18);
            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr18[0]);
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            c("\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", true, new int[]{53, 16, 20, 0}, objArr19);
            java.lang.Object[] objArr20 = {java.lang.Integer.valueOf(((java.lang.Integer) cls9.getMethod((java.lang.String) objArr19[0], java.lang.Object.class).invoke(null, settextdirection)).intValue()), 102934483};
            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(599786096);
            if (obj9 == null) {
                java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.indexOf("", ""), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 754, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 45512));
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                b(bArr[50], (byte) (-bArr[23]), (byte) (-bArr[19]), objArr21);
                obj9 = cls10.getMethod((java.lang.String) objArr21[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(599786096, obj9);
            }
            invoke = ((java.lang.reflect.Method) obj9).invoke(null, objArr20);
            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('_' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 754 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (45560 - android.view.View.resolveSize(0, 0)));
            java.lang.Object[] objArr22 = new java.lang.Object[1];
            b(bArr[50], (byte) (-bArr[23]), (byte) (-bArr[19]), objArr22);
            cls11.getField((java.lang.String) objArr22[0]).set(null, invoke);
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }

    private static void e(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i2 = $10 + 27;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
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
        $10 = ($11 + 111) % 128;
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                $11 = ($10 + 17) % 128;
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i3) ^ ((c2 << 4) + ((char) (getMchipCvmIssuerOptions ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getCrmCountryCode)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 62, android.graphics.Color.red(0) + 1335, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a(0, (short) 11, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (SdkCoreCardRiskManagementDataImpl ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getAdditionalCheckTable)};
                    int i5 = charValue + i3;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 62, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1334, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        a(0, (short) 11, 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i3 -= 40503;
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
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 53, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 3543, (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    private static /* synthetic */ java.lang.Object SdkCoreBusinessLogicModuleImpl(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        int i = buildRecords;
        int i2 = i & 27;
        int i3 = (((i | 27) & (~i2)) - (~(-(-(i2 << 1))))) - 1;
        getPpseFci = i3 % 128;
        int i4 = settextdirection.AlternateContactlessPaymentDataJson;
        if (i3 % 2 == 0) {
            return java.lang.Integer.valueOf(i4);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getGpoResponse(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i = buildRecords;
        int i2 = i & 73;
        int i3 = i2 + ((i ^ 73) | i2);
        getPpseFci = i3 % 128;
        settextdirection.AlternateContactlessPaymentDataJson = intValue;
        if (i3 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        int i = buildRecords;
        int i2 = (((i | 102) << 1) - (i ^ 102)) - 1;
        getPpseFci = i2 % 128;
        int i3 = settextdirection.RecordsJson;
        if (i2 % 2 == 0) {
            return java.lang.Integer.valueOf(i3);
        }
        throw null;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/payair/hce/setTextDirection$valueOf;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.payair.hce.setTextDirection$valueOf, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ java.lang.Object getPaymentFci(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        int i = getPpseFci;
        buildRecords = (i + 51) % 128;
        java.lang.String str = settextdirection.getSecurityWord;
        int i2 = i & 23;
        int i3 = ((i ^ 23) | i2) << 1;
        int i4 = -((i | 23) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        buildRecords = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getPpseFci;
        int i2 = (((i ^ 39) | (i & 39)) << 1) - ((i & (-40)) | ((~i) & 39));
        int i3 = i2 % 128;
        buildRecords = i3;
        settextdirection.getSecurityWord = str;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 & 31;
        int i5 = i4 + ((i3 ^ 31) | i4);
        getPpseFci = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCardLayoutDescription(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        int i = getPpseFci & 43;
        int i2 = ((((r0 | 43) & (~i)) - (~(i << 1))) - 1) % 128;
        buildRecords = i2;
        java.lang.String str = settextdirection.getCvrMaskAnd;
        int i3 = ((i2 & (-42)) | ((~i2) & 41)) + ((i2 & 41) << 1);
        getPpseFci = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCvrMaskAnd(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i = buildRecords;
        int i2 = i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
        int i3 = (~i2) + (i2 << 1);
        getPpseFci = i3 % 128;
        settextdirection.DigitizedCardProfile = intValue;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i & 33;
        int i5 = ((i ^ 33) | i4) << 1;
        int i6 = -((~i4) & (i | 33));
        getPpseFci = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object getCardholderValidators(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getPpseFci;
        int i2 = i & 79;
        int i3 = -(-((i ^ 79) | i2));
        int i4 = (i2 & i3) + (i2 | i3);
        buildRecords = i4 % 128;
        settextdirection.getPaymentFci = str;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i5 = i & 125;
        int i6 = (i ^ 125) | i5;
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        buildRecords = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        int i = getPpseFci;
        buildRecords = (i + 73) % 128;
        java.lang.String str = settextdirection.getPaymentFci;
        int i2 = i & 125;
        int i3 = (i ^ 125) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        buildRecords = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static void c(java.lang.String str, boolean z, int[] iArr, java.lang.Object[] objArr) {
        int i;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = getCardholderValidators;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                $11 = ($10 + 9) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i4];
                    objArr2[i2] = java.lang.Integer.valueOf(cArr[i8]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.view.View.MeasureSpec.getSize(i2), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2808, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i2, i2) + 1));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a(0, (short) 10, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr2[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 0;
                    i4 = 1;
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
        char[] cArr3 = new char[i5];
        java.lang.System.arraycopy(cArr, i3, cArr3, 0, i5);
        if (bArr2 != null) {
            char[] cArr4 = new char[i5];
            getaccounttype.writeReplace = 0;
            $10 = ($11 + 23) % 128;
            char c = 0;
            while (getaccounttype.writeReplace < i5) {
                $11 = ($10 + 65) % 128;
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i9 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2836 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) android.view.View.resolveSize(0, 0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        a(0, (short) 8, 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr4[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 2880 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        a(0, (short) 12, 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr4[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 34, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.os.Process.myPid() >> 22))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i11 = i5 - i7;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i11, i7);
            java.lang.System.arraycopy(cArr5, i7, cArr3, 0, i11);
        } else {
            i = 0;
        }
        if (z) {
            $10 = ($11 + 77) % 128;
            char[] cArr6 = new char[i5];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                int i12 = $10 + 105;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    cArr6[getaccounttype.writeReplace] = cArr3[i5 % getaccounttype.writeReplace];
                    i = getaccounttype.writeReplace % 1;
                } else {
                    cArr6[getaccounttype.writeReplace] = cArr3[(i5 - getaccounttype.writeReplace) - 1];
                    i = getaccounttype.writeReplace + 1;
                }
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i13 = 0;
            while (true) {
                getaccounttype.writeReplace = i13;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                i13 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x06e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        android.content.Context context;
        int intValue;
        java.lang.String str;
        java.lang.String[] strArr;
        java.lang.String str2;
        java.lang.Integer num;
        java.lang.Integer num2;
        com.payair.hce.setTextDirection settextdirection;
        java.lang.Object[] objArr2;
        char c;
        int i;
        int i2;
        com.payair.hce.setTextDirection settextdirection2 = (com.payair.hce.setTextDirection) objArr[0];
        int i3 = getPpseFci;
        int i4 = ((i3 ^ 109) | (i3 & 109)) << 1;
        int i5 = -((i3 & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) | ((~i3) & 109));
        buildRecords = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.graphics.Color.green(0), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 429, (char) (android.graphics.Color.alpha(0) + 31610));
        byte b = (byte) ($$b & 45);
        byte[] bArr = $$a;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, b, (byte) (-bArr[71]), objArr3);
        long j = cls.getField((java.lang.String) objArr3[0]).getLong(null);
        try {
            try {
                if (j != -1) {
                    getPpseFci = (buildRecords + 33) % 128;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    c("\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001", false, new int[]{0, 22, 0, 20}, objArr4);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c("\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", true, new int[]{22, 15, 116, 2}, objArr5);
                    if (j + 2025 >= ((java.lang.Long) cls2.getDeclaredMethod((java.lang.String) objArr5[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue()) {
                        int i6 = buildRecords;
                        int i7 = i6 & 17;
                        int i8 = ((i6 ^ 17) | i7) << 1;
                        int i9 = -((i6 | 17) & (~i7));
                        int i10 = (i8 & i9) + (i9 | i8);
                        getPpseFci = i10 % 128;
                        if (i10 % 2 != 0) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 27, 430 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (31610 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)));
                            byte b2 = bArr[14];
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            b(b2, (byte) (b2 | 62), bArr[50], objArr6);
                            java.lang.Object[] objArr7 = {cls3.getField((java.lang.String) objArr6[0]).get(null), -803474141, 1};
                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                            if (obj == null) {
                                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 4618 - android.view.View.MeasureSpec.getMode(0), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj);
                            }
                            objArr2 = (java.lang.Object[]) ((java.lang.reflect.Method) obj).invoke(null, objArr7);
                        } else {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 428 - android.os.Process.getGidForName(""), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31609));
                            byte b3 = bArr[14];
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b(b3, (byte) (b3 | 62), bArr[50], objArr8);
                            java.lang.Object[] objArr9 = {cls4.getField((java.lang.String) objArr8[0]).get(null), -803474141, 0};
                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-854902220);
                            if (obj2 == null) {
                                obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 33, 4618 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.text.TextUtils.indexOf("", "", 0))).getMethod("AlternateContactlessPaymentDataJson", java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-854902220, obj2);
                            }
                            objArr2 = (java.lang.Object[]) ((java.lang.reflect.Method) obj2).invoke(null, objArr9);
                        }
                        num2 = 0;
                        settextdirection = settextdirection2;
                        num = -854902220;
                        c = 1;
                        str2 = "";
                        str = "AlternateContactlessPaymentDataJson";
                        i = ((int[]) objArr2[c])[0];
                        i2 = ((int[]) objArr2[0])[0];
                        if (i2 != i) {
                            int i11 = buildRecords;
                            int i12 = (((i11 ^ 113) | (i11 & 113)) << 1) - ((i11 & (-114)) | ((~i11) & 113));
                            getPpseFci = i12 % 128;
                            if (i12 % 2 != 0) {
                                java.lang.Object[] objArr10 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[5])[1]), num2};
                                java.lang.Integer num3 = num;
                                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                                if (obj3 == null) {
                                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString(str2) + 34, 4618 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.graphics.Color.blue(0))).getMethod(str, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj3);
                                }
                                ((java.lang.reflect.Method) obj3).invoke(null, objArr10);
                            } else {
                                java.lang.String str3 = str;
                                java.lang.Integer num4 = num;
                                java.lang.Object[] objArr11 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[2])[0]), num2};
                                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num4);
                                if (obj4 == null) {
                                    java.lang.String str4 = str2;
                                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 4618 - android.text.TextUtils.getOffsetAfter(str4, 0), (char) ((-1) - android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))).getMethod(str3, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num4, obj4);
                                }
                                ((java.lang.reflect.Method) obj4).invoke(null, objArr11);
                            }
                        } else {
                            java.lang.String str5 = str;
                            java.lang.Integer num5 = num;
                            int i13 = i & i2;
                            long j2 = (~i13) & ((i ^ i2) | i13);
                            int i14 = buildRecords;
                            getPpseFci = (((i14 ^ 83) - (~(-(-((i14 & 83) << 1))))) - 1) % 128;
                            int i15 = (i14 | 31) << 1;
                            int i16 = -((i14 & (-32)) | ((~i14) & 31));
                            getPpseFci = ((i15 & i16) + (i16 | i15)) % 128;
                            try {
                                java.lang.Object[] objArr12 = {java.lang.Long.valueOf(j2 ^ (-5202599593379889152L)), -1211324548L};
                                byte[] bArr2 = $$d;
                                byte b4 = (byte) (bArr2[61] - 1);
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                d(b4, (byte) (b4 | org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE), 82, objArr13);
                                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                                byte b5 = bArr2[117];
                                byte b6 = bArr2[61];
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                d(b5, b6, (short) (b6 | 138), objArr14);
                                cls5.getMethod((java.lang.String) objArr14[0], java.lang.Long.TYPE, java.lang.Long.TYPE).invoke(null, objArr12);
                                java.lang.Object[] objArr15 = {objArr2, java.lang.Integer.valueOf(((int[]) objArr2[2])[0]), num2};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                if (obj5 == null) {
                                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - android.graphics.ImageFormat.getBitsPerPixel(0), 4617 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16))).getMethod(str5, java.lang.Object[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj5);
                                }
                                ((java.lang.reflect.Method) obj5).invoke(null, objArr15);
                                int i17 = getPpseFci;
                                buildRecords = ((i17 & 17) + (i17 | 17)) % 128;
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                        java.lang.String str6 = settextdirection.getCardLayoutDescription;
                        getPpseFci = (buildRecords + 29) % 128;
                        return str6;
                    }
                }
                java.lang.Object[] objArr16 = {context, strArr, java.lang.Integer.valueOf(intValue), 0, -803474141};
                byte[] bArr3 = $$d;
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                d((byte) (bArr3[61] - 1), bArr3[26], (short) (-bArr3[59]), objArr17);
                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                byte b7 = bArr3[117];
                byte b8 = (byte) (bArr3[61] - 1);
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                d(b7, b8, (short) (b8 | 77), objArr18);
                java.lang.String str7 = (java.lang.String) objArr18[0];
                int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
                int i18 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                int identityHashCode = java.lang.System.identityHashCode(settextdirection2);
                int i19 = i18 * 960;
                int i20 = (i19 & 42173) | ((~i19) & (-42174));
                int i21 = -(-((i19 & (-42174)) << 1));
                int i22 = (i20 & i21) + (i20 | i21);
                int i23 = ~identityHashCode;
                int i24 = (i23 | identityHashCode) & i23;
                int i25 = i24 ^ (-23);
                int i26 = i24 & (-23);
                int i27 = ~((i25 ^ i26) | (i25 & i26));
                str2 = "";
                int i28 = ~(i18 | identityHashCode);
                num = -854902220;
                int i29 = i27 & i28;
                num2 = 0;
                int i30 = (~i29) & (i28 | i27);
                int i31 = -(-(((i30 & i29) | (i30 ^ i29)) * 959));
                int i32 = i22 & i31;
                int i33 = i32 + ((i22 ^ i31) | i32);
                int i34 = identityHashCode ^ (-23);
                int i35 = identityHashCode & (-23);
                int i36 = ~((i34 ^ i35) | (i34 & i35));
                int i37 = i23 & i18;
                int i38 = ~(((i23 | i18) & (~i37)) | i37);
                int i39 = -android.view.View.MeasureSpec.getSize(0);
                int identityHashCode2 = java.lang.System.identityHashCode(settextdirection2);
                int i40 = (i39 * 319) - 8279406;
                int i41 = ~i39;
                settextdirection = settextdirection2;
                int i42 = (i41 ^ identityHashCode2) | (i41 & identityHashCode2);
                int i43 = ~i42;
                int i44 = (i42 | i43) & i43;
                int i45 = i44 & (-26119);
                int i46 = (i44 | (-26119)) & (~i45);
                int i47 = -(-(((i46 & i45) | (i46 ^ i45)) * (-318)));
                int i48 = i40 & i47;
                int i49 = ((i40 ^ i47) | i48) << 1;
                int i50 = -((i47 | i40) & (~i48));
                int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
                int i52 = identityHashCode2 & (-26119);
                int i53 = (~i52) & (identityHashCode2 | (-26119));
                int i54 = ~((i52 & i53) | (i53 ^ i52));
                int i55 = ~identityHashCode2;
                int i56 = i55 ^ i39;
                int i57 = i55 & i39;
                int i58 = (i56 ^ i57) | (i56 & i57);
                android.content.Context context2 = context;
                int i59 = i58 & 26118;
                int i60 = (~i59) & (i58 | 26118);
                int i61 = ~((i59 ^ i60) | (i60 & i59));
                int i62 = ((i54 ^ i61) | (i54 & i61)) * 318;
                int i63 = (i51 | i62) << 1;
                int i64 = -(((~i62) & i51) | ((~i51) & i62));
                int i65 = i55 ^ (-26119);
                int i66 = i55 & (-26119);
                int i67 = (i65 & i66) | (i65 ^ i66);
                int i68 = ((~i67) & i39) | (i41 & i67);
                int i69 = i67 & i39;
                int i70 = ~((i69 ^ i68) | (i68 & i69));
                int i71 = i39 & 26118;
                int i72 = (i39 | 26118) & (~i71);
                int i73 = (i71 ^ i72) | (i72 & i71);
                int i74 = ~((i55 & i73) | ((~i73) & identityHashCode2) | (i73 & identityHashCode2));
                char c2 = (char) ((i63 ^ i64) + ((i64 & i63) << 1) + (((i74 & i70) | (i70 ^ i74)) * 318));
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                f(fadingEdgeLength >> 16, ((((i33 ^ 22057) | (i33 & 22057)) << 1) - (((~i33) & 22057) | (i33 & (-22058)))) + (((i36 ^ i38) | (i38 & i36)) * 959), c2, objArr19);
                objArr2 = (java.lang.Object[]) cls6.getMethod(str7, java.lang.Class.forName((java.lang.String) objArr19[0]), java.lang.String[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(null, objArr16);
                int i75 = ((int[]) objArr2[1])[0];
                int i76 = ((int[]) objArr2[0])[0];
                if (context2 != null) {
                    int i77 = buildRecords;
                    int i78 = i77 & 91;
                    getPpseFci = (((((i77 ^ 91) | i78) << 1) - (~(-((i77 | 91) & (~i78))))) - 1) % 128;
                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 26, 430 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31609));
                    byte b9 = bArr[14];
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    b(b9, (byte) (b9 | 62), bArr[50], objArr20);
                    cls7.getField((java.lang.String) objArr20[0]).set(null, objArr2);
                    try {
                        try {
                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                            c("\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001", false, new int[]{0, 22, 0, 20}, objArr21);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            c("\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001", true, new int[]{22, 15, 116, 2}, objArr22);
                            long longValue = ((java.lang.Long) cls8.getDeclaredMethod((java.lang.String) objArr22[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).longValue();
                            java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.KeyEvent.normalizeMetaState(0) + 429, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 31562));
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            b(org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, b, (byte) (-bArr[71]), objArr23);
                            cls9.getField((java.lang.String) objArr23[0]).set(null, java.lang.Long.valueOf(longValue));
                            int i79 = buildRecords;
                            int i80 = i79 & 113;
                            getPpseFci = (i80 + ((i79 ^ 113) | i80)) % 128;
                        } catch (java.lang.Exception unused) {
                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(null).newInstance(null));
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                c = 1;
                i = ((int[]) objArr2[c])[0];
                i2 = ((int[]) objArr2[0])[0];
                if (i2 != i) {
                }
                java.lang.String str62 = settextdirection.getCardLayoutDescription;
                getPpseFci = (buildRecords + 29) % 128;
                return str62;
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
            java.lang.Object[] objArr24 = new java.lang.Object[1];
            c("\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", false, new int[]{69, 26, 17, 5}, objArr24);
            java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr24[0]);
            java.lang.Object[] objArr25 = new java.lang.Object[1];
            c("\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001", false, new int[]{95, 18, 132, 18}, objArr25);
            context = (android.content.Context) cls10.getMethod((java.lang.String) objArr25[0], new java.lang.Class[0]).invoke(null, null);
            if (context != null) {
                int i81 = buildRecords + 109;
                getPpseFci = i81 % 128;
                if (i81 % 2 != 0) {
                    context.getApplicationContext();
                    throw null;
                }
                context = context.getApplicationContext();
            }
            java.lang.Object[] objArr26 = new java.lang.Object[1];
            c(null, true, new int[]{37, 16, 186, 9}, objArr26);
            java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr26[0]);
            java.lang.Object[] objArr27 = new java.lang.Object[1];
            c("\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", true, new int[]{53, 16, 20, 0}, objArr27);
            intValue = ((java.lang.Integer) cls11.getMethod((java.lang.String) objArr27[0], java.lang.Object.class).invoke(null, settextdirection2)).intValue();
            int i82 = -(-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0));
            int i83 = ((~i82) & 65) | (i82 & (-66));
            int i84 = -(-((i82 & 65) << 1));
            java.lang.Object[] objArr28 = new java.lang.Object[1];
            e("\u0892\u0b9d卟\uf1e1傪夈돡姕ㅵ왰䟽冪៖唊ᘔ疣롌᥇ꪈ\uaac9ꑘ壷ᘔ疣돡姕껳쟺鶦瑚휠ᖭ鮧읆ꐾ㭓࿕鈥ብ\ued5a謌ꨝ岢䔀㕏먇䁹\udeb1킠핬\u0892\u0b9dヾ鎛窚杀ॹ㐳謌ꨝ精욹鞙玍", ((i83 | i84) << 1) - (i84 ^ i83), objArr28);
            java.lang.String str8 = (java.lang.String) objArr28[0];
            java.lang.Object[] objArr29 = new java.lang.Object[1];
            c("\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000", true, new int[]{113, 64, 0, 5}, objArr29);
            java.lang.String str9 = (java.lang.String) objArr29[0];
            byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
            int i85 = modifierMetaStateMask & 65;
            java.lang.Object[] objArr30 = new java.lang.Object[1];
            e("쪣誆ߪ횓膇鴊픨圀賡屾뽨̪䉳劣熍鮬什媢ᬺ쓲篔棑먯밉킠핬颋徘\ud95e넋៖唊傞鼣蔓气뷽鐫툠싇\uf08a㡿䃇螥엻㆛猾荲薌\uecfc賣\u1ae1ഩ풄⇟銌លྫྷ甁憇䃇螥ヾ鎛", ((~i85) & (modifierMetaStateMask | 65)) + (i85 << 1), objArr30);
            java.lang.String str10 = (java.lang.String) objArr30[0];
            java.lang.Object[] objArr31 = new java.lang.Object[1];
            str = "AlternateContactlessPaymentDataJson";
            c("\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 64, 0, 0}, objArr31);
            strArr = new java.lang.String[]{str8, str9, str10, (java.lang.String) objArr31[0]};
            int i86 = getPpseFci;
            int i87 = i86 & 51;
            int i88 = (~i87) & (i86 | 51);
            int i89 = i87 << 1;
            buildRecords = ((i88 ^ i89) + ((i89 & i88) << 1)) % 128;
            int i90 = i86 & 113;
            int i91 = (i86 ^ 113) | i90;
            buildRecords = ((i90 & i91) + (i91 | i90)) % 128;
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }

    private static /* synthetic */ java.lang.Object getDualTapResetTimeout(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getPpseFci;
        int i2 = i + 103;
        buildRecords = i2 % 128;
        settextdirection.getCardLayoutDescription = str;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = ((i | 21) << 1) - (i ^ 21);
        buildRecords = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object SdkCoreAlternateContactlessPaymentDataImpl(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = buildRecords + 23;
        getPpseFci = i % 128;
        settextdirection.SdkCoreAlternateContactlessPaymentDataImpl = str;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getMagstripeCvmIssuerOptions(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        int i = (getPpseFci + 77) % 128;
        buildRecords = i;
        java.lang.String str = settextdirection.SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = ((i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | (i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) << 1;
        int i3 = -((i & (-124)) | ((~i) & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        getPpseFci = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object IccPrivateKeyCrtComponentsJson(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        int i = buildRecords;
        int i2 = i & 85;
        int i3 = (i ^ 85) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        int i5 = i4 % 128;
        getPpseFci = i5;
        java.lang.String str = settextdirection.getProfileVersion;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i6 = (-2) - (~(((i5 | 114) << 1) - (i5 ^ 114)));
        buildRecords = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getApplicationLifeCycleData(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = buildRecords;
        int i2 = ((i & 1) - (~(-(-(i | 1))))) - 1;
        int i3 = i2 % 128;
        getPpseFci = i3;
        settextdirection.getProfileVersion = str;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = (i3 ^ 67) + ((i3 & 67) << 1);
        buildRecords = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i = getPpseFci;
        int i2 = ((i | 23) << 1) - (i ^ 23);
        int i3 = i2 % 128;
        buildRecords = i3;
        settextdirection.getDualTapResetTimeout = intValue;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 | 67;
        getPpseFci = ((i4 << 1) - (i4 & (~(i3 & 67)))) % 128;
        return null;
    }

    private static /* synthetic */ java.lang.Object getMchipCvmIssuerOptions(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        int i = getPpseFci;
        int i2 = ((i | 91) << 1) - (i ^ 91);
        int i3 = i2 % 128;
        buildRecords = i3;
        int i4 = settextdirection.getCiacDecline;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i5 = i3 + 71;
        getPpseFci = i5 % 128;
        if (i5 % 2 == 0) {
            return java.lang.Integer.valueOf(i4);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getSecurityWord(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        int i = getPpseFci + 97;
        buildRecords = i % 128;
        settextdirection.getCiacDecline = intValue;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCvmResetTimeout(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = buildRecords;
        int i2 = (i & 43) + (i | 43);
        getPpseFci = i2 % 128;
        settextdirection.getApplicationLifeCycleData = str;
        if (i2 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        long longValue = ((java.lang.Number) objArr[1]).longValue();
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        int intValue2 = ((java.lang.Number) objArr[3]).intValue();
        java.lang.String str = (java.lang.String) objArr[4];
        java.lang.String str2 = (java.lang.String) objArr[5];
        java.lang.String str3 = (java.lang.String) objArr[6];
        java.lang.String str4 = (java.lang.String) objArr[7];
        java.lang.String str5 = (java.lang.String) objArr[8];
        java.lang.String str6 = (java.lang.String) objArr[9];
        java.lang.String str7 = (java.lang.String) objArr[10];
        java.lang.String str8 = (java.lang.String) objArr[11];
        java.lang.String str9 = (java.lang.String) objArr[12];
        long longValue2 = ((java.lang.Number) objArr[13]).longValue();
        int i = getPpseFci;
        int i2 = i & 89;
        int i3 = -(-((i ^ 89) | i2));
        buildRecords = ((i2 & i3) + (i2 | i3)) % 128;
        settextdirection.getGpoResponse = longValue;
        settextdirection.AlternateContactlessPaymentDataJson = intValue;
        settextdirection.RecordsJson = intValue2;
        settextdirection.getSecurityWord = str;
        settextdirection.getCvrMaskAnd = str2;
        byte[] bytes = ((java.lang.String) com.payair.hce.setAutoHandwritingEnabled.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -168115638, 168115638, (int) java.lang.System.currentTimeMillis())).getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        settextdirection.writeReplace = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(bytes).writeReplace();
        settextdirection.getPaymentFci = str3;
        settextdirection.getCardLayoutDescription = str4;
        settextdirection.SdkCoreAlternateContactlessPaymentDataImpl = str5;
        settextdirection.getProfileVersion = str6;
        settextdirection.valueOf = str7;
        settextdirection.values = str8;
        settextdirection.getCvmResetTimeout = str9;
        settextdirection.IccPrivateKeyCrtComponentsJson = longValue2;
        int i4 = buildRecords + 80;
        int i5 = (~i4) + (i4 << 1);
        getPpseFci = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object RecordsJson(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        int i = buildRecords;
        getPpseFci = ((i & 23) + (i | 23)) % 128;
        byte[] bytes = ((java.lang.String) com.payair.hce.setAutoHandwritingEnabled.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -168115638, 168115638, (int) java.lang.System.currentTimeMillis())).getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        settextdirection.writeReplace = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(bytes).writeReplace();
        int i2 = getPpseFci;
        int i3 = i2 & 101;
        int i4 = i3 + ((i2 ^ 101) | i3);
        buildRecords = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object getCiacDecline(java.lang.Object[] objArr) {
        com.payair.hce.setTextDirection settextdirection = (com.payair.hce.setTextDirection) objArr[0];
        settextdirection.getCiacDecline = 0;
        settextdirection.getDualTapResetTimeout = 0;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            long j = settextdirection.getGpoResponse;
            if (j != 0) {
                int i = getPpseFci;
                int i2 = ((i ^ 39) | (i & 39)) << 1;
                int i3 = -((i & (-40)) | ((~i) & 39));
                int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
                buildRecords = i4 % 128;
                if (i4 % 2 == 0) {
                    jSONObject.put("personId", j);
                    throw new java.lang.NullPointerException();
                }
                jSONObject.put("personId", j);
                int i5 = buildRecords;
                getPpseFci = (((i5 & (-48)) | ((~i5) & 47)) + ((i5 & 47) << 1)) % 128;
            }
            jSONObject.put(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.APPLICATION_ID_KEY, 2);
            jSONObject.put("languageId", settextdirection.RecordsJson);
            jSONObject.put("version", android.os.Build.VERSION.RELEASE);
            jSONObject.put("appVersion", (java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -722536750, 722536792, (int) java.lang.System.currentTimeMillis()));
            jSONObject.put("sdkVersion", (java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1200966837, 1200966849, (int) java.lang.System.currentTimeMillis()));
            jSONObject.put("mpWalletId", ((java.lang.Long) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 2050677857, -2050677801, (int) java.lang.System.currentTimeMillis())).longValue());
            jSONObject.put("btMacId", settextdirection.writeReplace);
            jSONObject.put("bankApplicationId", (java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -207294250, 207294340, (int) java.lang.System.currentTimeMillis()));
            jSONObject.put("locale", (java.lang.String) com.payair.hce.setAutoHandwritingEnabled.AlternateContactlessPaymentDataJson(new java.lang.Object[0], 1272043180, -1272043179, (int) java.lang.System.currentTimeMillis()));
            int i6 = buildRecords;
            getPpseFci = (((i6 | 93) << 1) - (i6 ^ 93)) % 128;
        } catch (org.json.JSONException unused) {
        }
        int i7 = getPpseFci;
        buildRecords = ((i7 & 61) + (i7 | 61)) % 128;
        return jSONObject;
    }

    static void getDualTapResetTimeout() {
        getCardholderValidators = new char[]{16892, 16805, 16830, 16802, 16808, 16775, 16768, 16831, 16798, 16782, 16808, 16824, 16829, 16802, 16807, 16790, 16793, 16803, 16807, 16809, 16808, 16809, 16830, 16658, 16663, 16659, 16657, 16684, 16682, 16660, 16665, 16641, 16641, 16662, 16686, 16683, 16658, 16623, 16614, 16597, 16616, 16678, 16597, 16638, 16597, 16618, 16617, 16593, 16608, 16611, 16637, 16579, 16678, 16882, 16822, 16819, 16803, 16807, 16719, 16816, 16806, 16826, 16708, 16716, 16716, 16715, 16819, 16822, 16820, 16882, 16816, 16818, 16826, 16829, 16829, 16822, 16820, 16818, 16719, 16819, 16825, 16788, 16790, 16823, 16719, 16814, 16774, 16813, 16818, 16817, 16718, 16718, 16817, 16713, 16825, 16829, 16702, 16697, 16696, 16673, 16675, 16699, 16656, 16658, 16698, 16700, 16672, 16676, 16680, 16672, 16700, 16702, 16700, 16892, 16773, 16890, 16890, 16773, 16771, 16768, 16811, 16808, 16811, 16811, 16813, 16812, 16771, 16768, 16773, 16891, 16886, 16886, 16893, 16774, 16772, 16773, 16811, 16768, 16891, 16771, 16771, 16888, 16893, 16894, 16892, 16772, 16771, 16888, 16771, 16771, 16888, 16771, 16775, 16895, 16773, 16811, 16770, 16892, 16773, 16769, 16890, 16772, 16768, 16770, 16775, 16891, 16889, 16768, 16768, 16891, 16888, 16891, 16891, 16889, 16771, 16771, 16891, 16855, 16890, 16893, 16890, 16888, 16890, 16892, 16892, 16893, 16895, 16892, 16892, 16890, 16771, 16772, 16891, 16887, 16889, 16771, 16810, 16813, 16771, 16768, 16771, 16893, 16893, 16771, 16770, 16770, 16811, 16772, 16895, 16890, 16891, 16892, 16892, 16888, 16889, 16886, 16889, 16893, 16892, 16890, 16889, 16769, 16768, 16889, 16770, 16815, 16813, 16771, 16768, 16770, 16773, 16771, 16768, 16773, 16774, 16813, 16773, 16890, 16770, 16771, 16771};
        SdkCoreCardRiskManagementDataImpl = (char) 33642;
        getAdditionalCheckTable = (char) 39733;
        getMchipCvmIssuerOptions = (char) 32941;
        getCrmCountryCode = (char) 48303;
    }

    static void getCvmResetTimeout() {
        int i = getPpseFci + 59;
        buildRecords = i % 128;
        if (i % 2 != 0) {
            getCardLayoutDescription = new char[]{14536, 27245, 40345, 53029, 29294, 42386, 55089, 31265, 44442, 57148, 611, 46483, 59188, 2661, 48529, 61297, 4682, 17804, 63283, 6723, 19844, 65315, 8769};
            getMagstripeCvmIssuerOptions = 6719704460119116805L;
        } else {
            getCardLayoutDescription = new char[]{14536, 27245, 40345, 53029, 29294, 42386, 55089, 31265, 44442, 57148, 611, 46483, 59188, 2661, 48529, 61297, 4682, 17804, 63283, 6723, 19844, 65315, 8769};
            getMagstripeCvmIssuerOptions = 6719704460119116805L;
            throw null;
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getPpseFci = 0;
        buildRecords = 1;
        getDualTapResetTimeout();
        getCvmResetTimeout();
        INSTANCE = new com.payair.hce.setTextDirection.Companion(null);
        int i = getPpseFci;
        int i2 = i & 67;
        int i3 = (i ^ 67) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        buildRecords = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final java.lang.String toString() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -623516698, 623516718, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.setPointerIcon getApplicationLifeCycleData() {
        return (com.payair.hce.setPointerIcon) DigitizedCardProfile(new java.lang.Object[]{this}, 841548075, -841548054, java.lang.System.identityHashCode(this));
    }

    public final org.json.JSONObject getCiacDecline() {
        return (org.json.JSONObject) DigitizedCardProfile(new java.lang.Object[]{this}, 913703272, -913703259, java.lang.System.identityHashCode(this));
    }

    public final void getPaymentFci() {
        DigitizedCardProfile(new java.lang.Object[]{this}, 1552641023, -1552641013, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(long j, int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, long j2) {
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), str, str2, str3, str4, str5, str6, str7, str8, str9, java.lang.Long.valueOf(j2)}, -1191656224, 1191656230, i);
    }

    public final void getProfileVersion(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 163032392, -163032370, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String SdkCoreBusinessLogicModuleImpl() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 24997583, -24997569, java.lang.System.identityHashCode(this));
    }

    public final void DigitizedCardProfile(int i) {
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, -39341171, 39341196, i);
    }

    public final int getGpoResponse() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, -1656086235, 1656086262, java.lang.System.identityHashCode(this))).intValue();
    }

    public final void values(int i) {
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, -1778846013, 1778846013, i);
    }

    public final int getCvrMaskAnd() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, -2091725884, 2091725887, java.lang.System.identityHashCode(this))).intValue();
    }

    public final void SdkCoreAlternateContactlessPaymentDataImpl(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 1509800741, -1509800717, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String getAid() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 346977819, -346977808, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 492903876, -492903868, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String RecordsJson() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -969282366, 969282396, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -1200075587, 1200075606, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String SdkCoreAlternateContactlessPaymentDataImpl() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 2132196852, -2132196843, java.lang.System.identityHashCode(this));
    }

    public final void values(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, 793324812, -793324786, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String getProfileVersion() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -883246757, 883246759, java.lang.System.identityHashCode(this));
    }

    public final void writeReplace(int i) {
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, 253190884, -253190867, i);
    }

    public final int IccPrivateKeyCrtComponentsJson() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, 608578040, -608578022, java.lang.System.identityHashCode(this))).intValue();
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -168027365, 168027372, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 295349567, -295349544, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        DigitizedCardProfile(new java.lang.Object[]{this, str}, -164420387, 164420391, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -463230852, 463230864, java.lang.System.identityHashCode(this));
    }

    public final void AlternateContactlessPaymentDataJson(int i) {
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, 945284222, -945284194, i);
    }

    public final int values() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, 2046863058, -2046863053, java.lang.System.identityHashCode(this))).intValue();
    }

    public final void valueOf(int i) {
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Integer.valueOf(i)}, 346362114, -346362098, i);
    }

    static void init$2() {
        $$g = new byte[]{com.google.common.base.Ascii.SI, -31, 80, -73};
        $$h = 15;
    }

    public final int valueOf() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, -1935323708, 1935323723, java.lang.System.identityHashCode(this))).intValue();
    }

    static void init$1() {
        $$d = new byte[]{78, 115, -79, 115, -5, 9, 70, -59, com.google.common.base.Ascii.SYN, -17, com.google.common.base.Ascii.US, -1, -2, 75, -51, com.google.common.base.Ascii.FF, 5, 62, -62, com.google.common.base.Ascii.NAK, -8, 43, -18, -6, 14, 2, 35, 59, -6, 5, com.google.common.base.Ascii.FF, 16, -4, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SUB, -12, -4, com.google.common.base.Ascii.VT, 18, 5, 5, -5, 9, 70, -59, com.google.common.base.Ascii.SYN, -17, com.google.common.base.Ascii.US, -1, -2, 75, -51, com.google.common.base.Ascii.FF, 5, 62, -62, com.google.common.base.Ascii.NAK, -8, 56, -37, 8, 1, com.google.common.base.Ascii.SUB, 5, -10, com.google.common.base.Ascii.SI, 14, -7, 7, 45, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.CAN, -11, -7, 7, 17, 1, 8, 42, -19, -13, com.google.common.base.Ascii.FS, -4, -2, com.google.common.base.Ascii.ETB, -7, -5, 9, 70, -59, com.google.common.base.Ascii.SYN, -17, com.google.common.base.Ascii.US, -1, -2, 75, -51, com.google.common.base.Ascii.FF, 5, 62, -62, com.google.common.base.Ascii.NAK, -8, 58, -36, -4, com.google.common.base.Ascii.GS, -17, 13, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -39, com.google.common.base.Ascii.CAN, -15, 16, com.google.common.base.Ascii.RS, -11, -4, 19, 44, -23, 5, 2, 10, 39, -34, com.google.common.base.Ascii.DC4, 6, -3, 14, 8, 71, -76, com.google.common.base.Ascii.FF, 16, -4, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SUB, -12, -4, com.google.common.base.Ascii.VT, 18, 5, 5, com.google.common.base.Ascii.FS, -4, -2, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.GS, com.visa.cbp.getEncExpo.onUnminimized};
        $$e = 58;
    }

    public final void writeReplace(long j) {
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Long.valueOf(j)}, -386706279, 386706280, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{7, -84, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FF, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, -3, -7, 13, -13, -17, com.google.common.base.Ascii.NAK, 13, -2, -9, 4, 4, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5, -19, 13, com.google.common.base.Ascii.VT, -14, 16};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE;
    }

    public final long DigitizedCardProfile() {
        return ((java.lang.Long) DigitizedCardProfile(new java.lang.Object[]{this}, 1234952462, -1234952433, java.lang.System.identityHashCode(this))).longValue();
    }
}
