package com.zettle.sdk.core.user.shadow;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/core/user/shadow/UserInfoMapper;", "", "Lcom/zettle/sdk/core/user/shadow/TaxCodeMapper;", "taxCodeMapper", "Lcom/zettle/sdk/core/user/shadow/AccessMapper;", "accessMapper", "Lcom/zettle/sdk/core/user/shadow/OrganizationSettingsMapper;", "organizationSettingsMapper", "<init>", "(Lcom/zettle/sdk/core/user/shadow/TaxCodeMapper;Lcom/zettle/sdk/core/user/shadow/AccessMapper;Lcom/zettle/sdk/core/user/shadow/OrganizationSettingsMapper;)V", "Lcom/zettle/sdk/core/user/shadow/UserInfoShadow;", "from", "Lcom/zettle/android/entities/UserInfo;", "map", "(Lcom/zettle/sdk/core/user/shadow/UserInfoShadow;)Lcom/zettle/android/entities/UserInfo;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/core/user/shadow/AccessMapper;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/core/user/shadow/OrganizationSettingsMapper;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/core/user/shadow/TaxCodeMapper;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserInfoMapper {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.core.user.shadow.TaxCodeMapper getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.core.user.shadow.OrganizationSettingsMapper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.core.user.shadow.AccessMapper getHighResolutionOutputSizeshNQ4ISI;

    public UserInfoMapper(com.zettle.sdk.core.user.shadow.TaxCodeMapper taxCodeMapper, com.zettle.sdk.core.user.shadow.AccessMapper accessMapper, com.zettle.sdk.core.user.shadow.OrganizationSettingsMapper organizationSettingsMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxCodeMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(organizationSettingsMapper, "");
        this.getHighSpeedVideoSizes = taxCodeMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = accessMapper;
        this.Camera2StreamConfigurationMap = organizationSettingsMapper;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ UserInfoMapper(com.zettle.sdk.core.user.shadow.TaxCodeMapper r18, com.zettle.sdk.core.user.shadow.AccessMapper r19, com.zettle.sdk.core.user.shadow.OrganizationSettingsMapper r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r17 = this;
            r0 = r21 & 1
            if (r0 == 0) goto La
            com.zettle.sdk.core.user.shadow.TaxCodeMapper r0 = new com.zettle.sdk.core.user.shadow.TaxCodeMapper
            r0.<init>()
            goto Lc
        La:
            r0 = r18
        Lc:
            r1 = r21 & 2
            if (r1 == 0) goto L16
            com.zettle.sdk.core.user.shadow.AccessMapper r1 = new com.zettle.sdk.core.user.shadow.AccessMapper
            r1.<init>()
            goto L18
        L16:
            r1 = r19
        L18:
            r2 = r21 & 4
            if (r2 == 0) goto L34
            com.zettle.sdk.core.user.shadow.OrganizationSettingsMapper r2 = new com.zettle.sdk.core.user.shadow.OrganizationSettingsMapper
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 2047(0x7ff, float:2.868E-42)
            r16 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3 = r17
            goto L38
        L34:
            r3 = r17
            r2 = r20
        L38:
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zettle.sdk.core.user.shadow.UserInfoMapper.<init>(com.zettle.sdk.core.user.shadow.TaxCodeMapper, com.zettle.sdk.core.user.shadow.AccessMapper, com.zettle.sdk.core.user.shadow.OrganizationSettingsMapper, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final com.zettle.android.entities.UserInfo map(com.zettle.sdk.core.user.shadow.UserInfoShadow from) {
        java.lang.String str;
        java.lang.String str2;
        java.util.List<? extends java.math.BigDecimal> emptyList;
        java.util.List<? extends java.math.BigDecimal> list;
        boolean z;
        java.util.ArrayList emptyList2;
        java.util.List<? extends com.zettle.android.entities.PaymentType> emptyList3;
        com.zettle.android.entities.PaymentType paymentType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        com.zettle.android.entities.UserInfo.Companion companion = com.zettle.android.entities.UserInfo.INSTANCE;
        java.lang.String publicName = from.getPublicName();
        java.lang.String username = from.getUsername();
        java.lang.String organizationName = from.getOrganizationName();
        java.lang.Boolean isOwnerAccount = from.isOwnerAccount();
        boolean booleanValue = isOwnerAccount != null ? isOwnerAccount.booleanValue() : false;
        com.zettle.android.entities.TimeZoneId timeZoneId = from.getTimeZoneId();
        java.util.List<java.lang.Long> cashDenominators = from.getCashDenominators();
        if (cashDenominators == null) {
            cashDenominators = kotlin.collections.CollectionsKt.emptyList();
        }
        com.zettle.android.entities.CurrencyId currency = from.getCurrency();
        if (currency == null) {
            currency = com.zettle.android.entities.CurrencyId.USD;
        }
        java.lang.Boolean isCashRegisterOpen = from.isCashRegisterOpen();
        boolean booleanValue2 = isCashRegisterOpen != null ? isCashRegisterOpen.booleanValue() : false;
        java.lang.Boolean hasCashRegister = from.getHasCashRegister();
        boolean booleanValue3 = hasCashRegister != null ? hasCashRegister.booleanValue() : false;
        java.lang.Boolean isCashRegisterAdmin = from.isCashRegisterAdmin();
        boolean booleanValue4 = isCashRegisterAdmin != null ? isCashRegisterAdmin.booleanValue() : false;
        java.lang.String emailAddress = from.getEmailAddress();
        java.lang.String imageUrlTemplate = from.getImageUrlTemplate();
        java.lang.Boolean isUsesVat = from.isUsesVat();
        boolean booleanValue5 = isUsesVat != null ? isUsesVat.booleanValue() : false;
        java.lang.Double defaultVatPercentage = from.getDefaultVatPercentage();
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(defaultVatPercentage != null ? defaultVatPercentage.doubleValue() : 0.0d);
        java.util.List<java.lang.Double> allowedVATPercentages = from.getAllowedVATPercentages();
        if (allowedVATPercentages == null) {
            str = emailAddress;
            str2 = imageUrlTemplate;
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<java.lang.Double> list2 = allowedVATPercentages;
            str2 = imageUrlTemplate;
            str = emailAddress;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(java.math.BigDecimal.valueOf(((java.lang.Number) it.next()).doubleValue()));
            }
            emptyList = arrayList;
        }
        java.util.List<com.zettle.sdk.core.user.shadow.TaxCodeDto> availableTaxCodes = from.getAvailableTaxCodes();
        if (availableTaxCodes == null) {
            list = emptyList;
            z = booleanValue4;
            emptyList2 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.zettle.sdk.core.user.shadow.TaxCodeDto> list3 = availableTaxCodes;
            com.zettle.sdk.core.user.shadow.TaxCodeMapper taxCodeMapper = this.getHighSpeedVideoSizes;
            list = emptyList;
            z = booleanValue4;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
            java.util.Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(taxCodeMapper.map((com.zettle.sdk.core.user.shadow.TaxCodeDto) it2.next()));
            }
            emptyList2 = arrayList2;
        }
        java.lang.String defaultTaxCode = from.getDefaultTaxCode();
        java.lang.String vatNumber = from.getVatNumber();
        java.lang.Long cashDenominatorRoundingHint = from.getCashDenominatorRoundingHint();
        long longValue = cashDenominatorRoundingHint != null ? cashDenominatorRoundingHint.longValue() : 0L;
        java.lang.Integer countryCallingCode = from.getCountryCallingCode();
        int intValue = countryCallingCode != null ? countryCallingCode.intValue() : 0;
        java.lang.String terminalLocale = from.getTerminalLocale();
        kotlin.jvm.internal.Intrinsics.checkNotNull(terminalLocale);
        java.lang.String countryId = from.getCountryId();
        com.zettle.android.entities.CountryId valueOf2 = countryId != null ? com.zettle.android.entities.CountryId.valueOf(countryId) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf2);
        java.util.Set<java.lang.String> betaFeatures = from.getBetaFeatures();
        if (betaFeatures == null) {
            betaFeatures = kotlin.collections.SetsKt.emptySet();
        }
        java.util.Set<java.lang.String> set = betaFeatures;
        java.util.Set<java.lang.String> features = from.getFeatures();
        if (features == null) {
            features = kotlin.collections.SetsKt.emptySet();
        }
        java.util.Set<java.lang.String> set2 = features;
        com.zettle.sdk.core.user.shadow.AccessDto access = from.getAccess();
        com.zettle.android.entities.Access map = access != null ? this.getHighResolutionOutputSizeshNQ4ISI.map(access) : null;
        com.zettle.sdk.core.user.shadow.OrganizationSettingsDto organizationSettings = from.getOrganizationSettings();
        com.zettle.android.entities.OrganizationSettings map2 = organizationSettings != null ? this.Camera2StreamConfigurationMap.map(organizationSettings) : null;
        java.lang.String userUUID = from.getUserUUID();
        java.lang.String organizationUUID = from.getOrganizationUUID();
        kotlin.jvm.internal.Intrinsics.checkNotNull(organizationUUID);
        java.lang.Boolean isNeedKyc = from.isNeedKyc();
        boolean booleanValue6 = isNeedKyc != null ? isNeedKyc.booleanValue() : false;
        java.lang.Boolean isNeedDocUpload = from.isNeedDocUpload();
        boolean booleanValue7 = isNeedDocUpload != null ? isNeedDocUpload.booleanValue() : false;
        java.lang.Boolean isShowAdvance = from.isShowAdvance();
        boolean booleanValue8 = isShowAdvance != null ? isShowAdvance.booleanValue() : false;
        java.util.List<java.lang.String> enabledPaymentTypes = from.getEnabledPaymentTypes();
        if (enabledPaymentTypes == null) {
            emptyList3 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<java.lang.String> list4 = enabledPaymentTypes;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
            java.util.Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                java.lang.String str3 = (java.lang.String) it3.next();
                com.zettle.android.entities.PaymentType[] values = com.zettle.android.entities.PaymentType.values();
                int length = values.length;
                java.util.Iterator it4 = it3;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        paymentType = null;
                        break;
                    }
                    paymentType = values[i];
                    int i2 = length;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(paymentType.getValue(), str3)) {
                        break;
                    }
                    i++;
                    length = i2;
                }
                if (paymentType == null) {
                    paymentType = com.zettle.android.entities.PaymentType.UNKNOWN;
                }
                arrayList3.add(paymentType);
                it3 = it4;
            }
            emptyList3 = arrayList3;
        }
        java.lang.Boolean isGetStartedList = from.isGetStartedList();
        return companion.invoke(publicName, username, organizationName, booleanValue, timeZoneId, cashDenominators, currency, booleanValue2, booleanValue3, z, str, str2, booleanValue5, valueOf, list, emptyList2, defaultTaxCode, vatNumber, longValue, intValue, terminalLocale, valueOf2, set, set2, map, map2, userUUID, organizationUUID, booleanValue6, booleanValue7, booleanValue8, emptyList3, isGetStartedList != null ? isGetStartedList.booleanValue() : false, from.getGratuityAmountMaxPercentage(), from.getManualAppEvents(), from.getTaxationMode(), from.getTaxationType(), from.getRefundsEnabled());
    }

    public UserInfoMapper() {
        this(null, null, null, 7, null);
    }
}
