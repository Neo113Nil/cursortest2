package com.izettle.android.auth.model.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013"}, d2 = {"Lcom/izettle/android/auth/model/mapper/UserInfoMapper;", "Lcom/izettle/android/auth/model/mapper/Mapper;", "Lcom/izettle/android/auth/dto/UserInfoDto;", "Lcom/zettle/android/entities/UserInfo;", "Lcom/izettle/android/auth/model/mapper/TaxCodeMapper;", "taxCodeMapper", "Lcom/izettle/android/auth/model/mapper/AccessMapper;", "accessMapper", "Lcom/izettle/android/auth/model/mapper/OrganizationSettingsMapper;", "organizationSettingsMapper", "<init>", "(Lcom/izettle/android/auth/model/mapper/TaxCodeMapper;Lcom/izettle/android/auth/model/mapper/AccessMapper;Lcom/izettle/android/auth/model/mapper/OrganizationSettingsMapper;)V", "from", "inverseMap", "(Lcom/zettle/android/entities/UserInfo;)Lcom/izettle/android/auth/dto/UserInfoDto;", "map", "(Lcom/izettle/android/auth/dto/UserInfoDto;)Lcom/zettle/android/entities/UserInfo;", "Lcom/izettle/android/auth/model/mapper/AccessMapper;", "Lcom/izettle/android/auth/model/mapper/OrganizationSettingsMapper;", "Lcom/izettle/android/auth/model/mapper/TaxCodeMapper;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UserInfoMapper implements com.izettle.android.auth.model.mapper.Mapper<com.izettle.android.auth.dto.UserInfoDto, com.zettle.android.entities.UserInfo> {
    private final com.izettle.android.auth.model.mapper.AccessMapper accessMapper;
    private final com.izettle.android.auth.model.mapper.OrganizationSettingsMapper organizationSettingsMapper;
    private final com.izettle.android.auth.model.mapper.TaxCodeMapper taxCodeMapper;

    public UserInfoMapper(com.izettle.android.auth.model.mapper.TaxCodeMapper taxCodeMapper, com.izettle.android.auth.model.mapper.AccessMapper accessMapper, com.izettle.android.auth.model.mapper.OrganizationSettingsMapper organizationSettingsMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxCodeMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(organizationSettingsMapper, "");
        this.taxCodeMapper = taxCodeMapper;
        this.accessMapper = accessMapper;
        this.organizationSettingsMapper = organizationSettingsMapper;
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final java.lang.Iterable<com.izettle.android.auth.dto.UserInfoDto> inverseMap(java.lang.Iterable<? extends com.zettle.android.entities.UserInfo> iterable) {
        return com.izettle.android.auth.model.mapper.Mapper.DefaultImpls.inverseMap(this, iterable);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final java.lang.Iterable<com.zettle.android.entities.UserInfo> map(java.lang.Iterable<? extends com.izettle.android.auth.dto.UserInfoDto> iterable) {
        return com.izettle.android.auth.model.mapper.Mapper.DefaultImpls.map(this, iterable);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ UserInfoMapper(com.izettle.android.auth.model.mapper.TaxCodeMapper r18, com.izettle.android.auth.model.mapper.AccessMapper r19, com.izettle.android.auth.model.mapper.OrganizationSettingsMapper r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r17 = this;
            r0 = r21 & 1
            if (r0 == 0) goto La
            com.izettle.android.auth.model.mapper.TaxCodeMapper r0 = new com.izettle.android.auth.model.mapper.TaxCodeMapper
            r0.<init>()
            goto Lc
        La:
            r0 = r18
        Lc:
            r1 = r21 & 2
            if (r1 == 0) goto L16
            com.izettle.android.auth.model.mapper.AccessMapper r1 = new com.izettle.android.auth.model.mapper.AccessMapper
            r1.<init>()
            goto L18
        L16:
            r1 = r19
        L18:
            r2 = r21 & 4
            if (r2 == 0) goto L34
            com.izettle.android.auth.model.mapper.OrganizationSettingsMapper r2 = new com.izettle.android.auth.model.mapper.OrganizationSettingsMapper
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
        throw new UnsupportedOperationException("Method not decompiled: com.izettle.android.auth.model.mapper.UserInfoMapper.<init>(com.izettle.android.auth.model.mapper.TaxCodeMapper, com.izettle.android.auth.model.mapper.AccessMapper, com.izettle.android.auth.model.mapper.OrganizationSettingsMapper, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final com.zettle.android.entities.UserInfo map(com.izettle.android.auth.dto.UserInfoDto from) {
        boolean z;
        java.lang.String str;
        java.lang.String str2;
        java.util.List<? extends com.zettle.android.entities.TaxCode> emptyList;
        java.util.List<? extends com.zettle.android.entities.PaymentType> emptyList2;
        com.zettle.android.entities.PaymentType paymentType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        com.zettle.android.entities.UserInfo.Companion companion = com.zettle.android.entities.UserInfo.INSTANCE;
        java.lang.String publicName = from.getPublicName();
        java.lang.String username = from.getUsername();
        java.lang.String organizationName = from.getOrganizationName();
        java.lang.Boolean isOwnerAccount = from.getIsOwnerAccount();
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
        java.lang.Boolean isCashRegisterOpen = from.getIsCashRegisterOpen();
        boolean booleanValue2 = isCashRegisterOpen != null ? isCashRegisterOpen.booleanValue() : false;
        java.lang.Boolean hasCashRegister = from.getHasCashRegister();
        boolean booleanValue3 = hasCashRegister != null ? hasCashRegister.booleanValue() : false;
        java.lang.Boolean isCashRegisterAdmin = from.getIsCashRegisterAdmin();
        boolean booleanValue4 = isCashRegisterAdmin != null ? isCashRegisterAdmin.booleanValue() : false;
        java.lang.String emailAddress = from.getEmailAddress();
        java.lang.String imageUrlTemplate = from.getImageUrlTemplate();
        java.lang.Boolean isUsesVat = from.getIsUsesVat();
        boolean booleanValue5 = isUsesVat != null ? isUsesVat.booleanValue() : false;
        java.math.BigDecimal defaultVatPercentage = from.getDefaultVatPercentage();
        java.util.List<java.math.BigDecimal> allowedVATPercentages = from.getAllowedVATPercentages();
        if (allowedVATPercentages == null) {
            allowedVATPercentages = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<com.izettle.android.auth.dto.TaxCodeDto> availableTaxCodes = from.getAvailableTaxCodes();
        if (availableTaxCodes == null) {
            z = booleanValue4;
            str = emailAddress;
            str2 = imageUrlTemplate;
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.izettle.android.auth.dto.TaxCodeDto> list = availableTaxCodes;
            com.izettle.android.auth.model.mapper.TaxCodeMapper taxCodeMapper = this.taxCodeMapper;
            str2 = imageUrlTemplate;
            z = booleanValue4;
            str = emailAddress;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(taxCodeMapper.map((com.izettle.android.auth.dto.TaxCodeDto) it.next()));
            }
            emptyList = arrayList;
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
        com.zettle.android.entities.CountryId valueOf = countryId != null ? com.zettle.android.entities.CountryId.valueOf(countryId) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf);
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
        com.izettle.android.auth.dto.AccessDto access = from.getAccess();
        com.zettle.android.entities.Access map = access != null ? this.accessMapper.map(access) : null;
        com.izettle.android.auth.dto.OrganizationSettingsDto organizationSettings = from.getOrganizationSettings();
        com.zettle.android.entities.OrganizationSettings map2 = organizationSettings != null ? this.organizationSettingsMapper.map(organizationSettings) : null;
        java.lang.String userUUID = from.getUserUUID();
        java.lang.String organizationUUID = from.getOrganizationUUID();
        kotlin.jvm.internal.Intrinsics.checkNotNull(organizationUUID);
        java.lang.Boolean isNeedKyc = from.getIsNeedKyc();
        boolean booleanValue6 = isNeedKyc != null ? isNeedKyc.booleanValue() : false;
        java.lang.Boolean isNeedDocUpload = from.getIsNeedDocUpload();
        boolean booleanValue7 = isNeedDocUpload != null ? isNeedDocUpload.booleanValue() : false;
        java.lang.Boolean isShowAdvance = from.getIsShowAdvance();
        boolean booleanValue8 = isShowAdvance != null ? isShowAdvance.booleanValue() : false;
        java.util.List<java.lang.String> enabledPaymentTypes = from.getEnabledPaymentTypes();
        if (enabledPaymentTypes == null) {
            emptyList2 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<java.lang.String> list2 = enabledPaymentTypes;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                java.lang.String str3 = (java.lang.String) it2.next();
                com.zettle.android.entities.PaymentType[] values = com.zettle.android.entities.PaymentType.values();
                int length = values.length;
                java.util.Iterator it3 = it2;
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
                arrayList2.add(paymentType);
                it2 = it3;
            }
            emptyList2 = arrayList2;
        }
        java.lang.Boolean isGetStartedList = from.getIsGetStartedList();
        return companion.invoke(publicName, username, organizationName, booleanValue, timeZoneId, cashDenominators, currency, booleanValue2, booleanValue3, z, str, str2, booleanValue5, defaultVatPercentage, allowedVATPercentages, emptyList, defaultTaxCode, vatNumber, longValue, intValue, terminalLocale, valueOf, set, set2, map, map2, userUUID, organizationUUID, booleanValue6, booleanValue7, booleanValue8, emptyList2, isGetStartedList != null ? isGetStartedList.booleanValue() : false, from.getGratuityAmountMaxPercentage(), from.getManualAppEvents(), from.getTaxationMode(), from.getTaxationType(), from.getRefundsEnabled());
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final com.izettle.android.auth.dto.UserInfoDto inverseMap(com.zettle.android.entities.UserInfo from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        java.lang.String publicName = from.getPublicName();
        java.lang.String username = from.getUsername();
        java.lang.String organizationName = from.getOrganizationName();
        boolean isOwnerAccount = from.isOwnerAccount();
        com.zettle.android.entities.TimeZoneId timeZoneId = from.getTimeZoneId();
        java.util.List<java.lang.Long> cashDenominators = from.getCashDenominators();
        com.zettle.android.entities.CurrencyId currency = from.getCurrency();
        boolean isCashRegisterOpen = from.isCashRegisterOpen();
        boolean hasCashRegister = from.getHasCashRegister();
        boolean isCashRegisterAdmin = from.isCashRegisterAdmin();
        java.lang.String emailAddress = from.getEmailAddress();
        java.lang.String imageUrlTemplate = from.getImageUrlTemplate();
        boolean isUsesVat = from.isUsesVat();
        java.math.BigDecimal defaultVatPercentage = from.getDefaultVatPercentage();
        java.util.List<java.math.BigDecimal> allowedVATPercentages = from.getAllowedVATPercentages();
        java.util.List<com.zettle.android.entities.TaxCode> availableTaxCodes = from.getAvailableTaxCodes();
        com.izettle.android.auth.model.mapper.TaxCodeMapper taxCodeMapper = this.taxCodeMapper;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(availableTaxCodes, 10));
        java.util.Iterator<T> it = availableTaxCodes.iterator();
        while (it.hasNext()) {
            arrayList.add(taxCodeMapper.inverseMap((com.zettle.android.entities.TaxCode) it.next()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.lang.String defaultTaxCode = from.getDefaultTaxCode();
        java.lang.String vatNumber = from.getVatNumber();
        long cashDenominatorRoundingHint = from.getCashDenominatorRoundingHint();
        int countryCallingCode = from.getCountryCallingCode();
        java.lang.String terminalLocaleString = from.getTerminalLocaleString();
        com.zettle.android.entities.CountryId countryId = from.getCountryId();
        java.lang.String name2 = countryId != null ? countryId.name() : null;
        java.util.Set<java.lang.String> betaFeatures = from.getBetaFeatures();
        java.util.Set<java.lang.String> features = from.getFeatures();
        com.zettle.android.entities.Access access = from.getAccess();
        com.izettle.android.auth.dto.AccessDto inverseMap = access != null ? this.accessMapper.inverseMap(access) : null;
        com.zettle.android.entities.OrganizationSettings organizationSettings = from.getOrganizationSettings();
        com.izettle.android.auth.dto.OrganizationSettingsDto inverseMap2 = organizationSettings != null ? this.organizationSettingsMapper.inverseMap(organizationSettings) : null;
        java.lang.String userUUID = from.getUserUUID();
        java.lang.String organizationUUID = from.getOrganizationUUID();
        boolean isNeedKyc = from.isNeedKyc();
        boolean isNeedDocUpload = from.isNeedDocUpload();
        boolean isShowAdvance = from.isShowAdvance();
        java.util.List<com.zettle.android.entities.PaymentType> enabledPaymentTypes = from.getEnabledPaymentTypes();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(enabledPaymentTypes, 10));
        java.util.Iterator<T> it2 = enabledPaymentTypes.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((com.zettle.android.entities.PaymentType) it2.next()).getValue());
        }
        return new com.izettle.android.auth.dto.UserInfoDto(publicName, username, organizationName, java.lang.Boolean.valueOf(isOwnerAccount), timeZoneId, cashDenominators, currency, java.lang.Boolean.valueOf(isCashRegisterOpen), java.lang.Boolean.valueOf(hasCashRegister), java.lang.Boolean.valueOf(isCashRegisterAdmin), emailAddress, imageUrlTemplate, java.lang.Boolean.valueOf(isUsesVat), defaultVatPercentage, allowedVATPercentages, arrayList2, defaultTaxCode, vatNumber, java.lang.Long.valueOf(cashDenominatorRoundingHint), java.lang.Integer.valueOf(countryCallingCode), terminalLocaleString, name2, betaFeatures, features, inverseMap, inverseMap2, userUUID, organizationUUID, java.lang.Boolean.valueOf(isNeedKyc), java.lang.Boolean.valueOf(isNeedDocUpload), java.lang.Boolean.valueOf(isShowAdvance), arrayList3, java.lang.Boolean.valueOf(from.isGetStartedList()), from.getGratuityAmountMaxPercentage(), from.getManualAppEvents(), from.getTaxationMode(), from.getTaxationType(), from.getRefundsEnabled());
    }

    public UserInfoMapper() {
        this(null, null, null, 7, null);
    }
}
