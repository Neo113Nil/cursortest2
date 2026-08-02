package com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0000j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"6\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0000j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007\"6\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0000j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0007\"6\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0000j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0005\u001a\u0004\b\u0017\u0010\u0007\"6\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0000j\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0005\u001a\u0004\b\u001b\u0010\u0007\"6\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c0\u0000j\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c`\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0005\u001a\u0004\b\u001e\u0010\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibilityRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentTokenEligibilityInput;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "tokenEligibilityRequestMapper", "Lkotlin/jvm/functions/Function1;", "getTokenEligibilityRequestMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$Data;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibilityResponse;", "tokenEligibilityResponseMapper", "getTokenEligibilityResponseMapper", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$DebitInstrumentTokenEligibility;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibility;", "tokenEligibilityMapper", "getTokenEligibilityMapper", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$DeviceEligibility;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DeviceEligibility;", "deviceEligibilityMapper", "getDeviceEligibilityMapper", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$EligibilityReason;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/EligibilityReason;", "eligibilityReasonMapper", "getEligibilityReasonMapper", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentTokenEligibilityQuery$FundingCard;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "debitInstrumentMapper", "getDebitInstrumentMapper", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentExpirationDetails;", "debitInstrumentExpirationDetailsMapper", "getDebitInstrumentExpirationDetailsMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TokenEligibilityMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityRequest, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentTokenEligibilityInput> tokenEligibilityRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.TokenEligibilityMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.TokenEligibilityMapperKt.$r8$lambda$DfMDuiD7RIJ6CKpTkZyXSKTDgQ0((com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Data, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse> tokenEligibilityResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.TokenEligibilityMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.TokenEligibilityMapperKt.$r8$lambda$lamf3taHjNiAtHnGSTw9QrEgQwo((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Data) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibility> tokenEligibilityMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.TokenEligibilityMapperKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.TokenEligibilityMapperKt.$r8$lambda$lHOQJmAzTCcfM8jhGLfcn0OVuhs((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceEligibility> deviceEligibilityMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.TokenEligibilityMapperKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.TokenEligibilityMapperKt.$r8$lambda$vri7PAPBfVtpv7hGqbYEmJ5Zcew((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.EligibilityReason> eligibilityReasonMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.TokenEligibilityMapperKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.TokenEligibilityMapperKt.$r8$lambda$MFqlw_5Olxsw4OkxojWpRiaxwhU((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> debitInstrumentMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.TokenEligibilityMapperKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.TokenEligibilityMapperKt.m14256$r8$lambda$6eHllPjj37qPCHtKMxLMxGYhQA((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentExpirationDetails> debitInstrumentExpirationDetailsMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.TokenEligibilityMapperKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.TokenEligibilityMapperKt.$r8$lambda$xmmAy4CwVAmOWhILAst4tJZmv4U((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityRequest, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentTokenEligibilityInput> getTokenEligibilityRequestMapper() {
        return tokenEligibilityRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Data, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse> getTokenEligibilityResponseMapper() {
        return tokenEligibilityResponseMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibility> getTokenEligibilityMapper() {
        return tokenEligibilityMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceEligibility> getDeviceEligibilityMapper() {
        return deviceEligibilityMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.EligibilityReason> getEligibilityReasonMapper() {
        return eligibilityReasonMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> getDebitInstrumentMapper() {
        return debitInstrumentMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentExpirationDetails> getDebitInstrumentExpirationDetailsMapper() {
        return debitInstrumentExpirationDetailsMapper;
    }

    /* renamed from: $r8$lambda$6eHllPjj37qPCHtK-MxLMxGYhQA, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument m14256$r8$lambda$6eHllPjj37qPCHtKMxLMxGYhQA(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard fundingCard) {
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment debitInstrumentPinFragment;
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentPinFragment debitInstrumentPinFragment2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingCard, "");
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment debitInstrumentCoreFragment = fundingCard.getDebitInstrumentCoreFragment();
        java.lang.String id = debitInstrumentCoreFragment.getId();
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName = debitInstrumentCoreFragment.getProductName();
        java.lang.String name2 = productName != null ? productName.name() : null;
        java.lang.String str = name2 == null ? "" : name2;
        java.lang.Object lastNChars = debitInstrumentCoreFragment.getLastNChars();
        java.lang.String obj = lastNChars != null ? lastNChars.toString() : null;
        java.lang.String str2 = obj == null ? "" : obj;
        java.lang.Boolean virtualCard = fundingCard.getVirtualCard();
        boolean booleanValue = virtualCard != null ? virtualCard.booleanValue() : false;
        kotlin.jvm.functions.Function1<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinStatus, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus> debitInstrumentPinStatusMapper = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentPinStatusMapper();
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment.Pin pin = debitInstrumentCoreFragment.getPin();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus invoke = debitInstrumentPinStatusMapper.invoke((pin == null || (debitInstrumentPinFragment2 = pin.getDebitInstrumentPinFragment()) == null) ? null : debitInstrumentPinFragment2.getStatus());
        kotlin.jvm.functions.Function1<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPinOrigin, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinOrigin> debitInstrumentPinOriginMapper = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentPinOriginMapper();
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment.Pin pin2 = debitInstrumentCoreFragment.getPin();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinOrigin invoke2 = debitInstrumentPinOriginMapper.invoke((pin2 == null || (debitInstrumentPinFragment = pin2.getDebitInstrumentPinFragment()) == null) ? null : debitInstrumentPinFragment.getOrigin());
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCardHolderFragment, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardHolder> cardHolderMapper = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getCardHolderMapper();
        com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.CardHolder cardHolder = fundingCard.getCardHolder();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentCardHolder invoke3 = cardHolderMapper.invoke(cardHolder != null ? cardHolder.getDebitInstrumentCardHolderFragment() : null);
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentShipmentFragment, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails> debitInstrumentShipmentDetailsMapper = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentShipmentDetailsMapper();
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment.Shipment shipment = debitInstrumentCoreFragment.getShipment();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentShipmentDetails invoke4 = debitInstrumentShipmentDetailsMapper.invoke(shipment != null ? shipment.getDebitInstrumentShipmentFragment() : null);
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentStatusFragment, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus> debitInstrumentStatusMapper = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentStatusMapper();
        com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentCoreFragment.Status status = debitInstrumentCoreFragment.getStatus();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus invoke5 = debitInstrumentStatusMapper.invoke(status != null ? status.getDebitInstrumentStatusFragment() : null);
        java.lang.Boolean primary = fundingCard.getPrimary();
        boolean booleanValue2 = primary != null ? primary.booleanValue() : false;
        java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.fragment.DebitInstrumentProductFullFragment, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails> debitInstrumentProductDetailsMapper = com.paypal.oslo.feature.debitcard.shared.data.mapper.DebitInstrumentCommonDataMapperKt.getDebitInstrumentProductDetailsMapper();
        com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Product product = fundingCard.getProduct();
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument(id, invoke5, str, booleanValue, booleanValue2, debitInstrumentExpirationDetailsMapper.invoke(fundingCard), str2, debitInstrumentProductDetailsMapper.invoke(product != null ? product.getDebitInstrumentProductFullFragment() : null), invoke4, invoke3, invoke, invoke2, emptyList, null);
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentTokenEligibilityInput $r8$lambda$DfMDuiD7RIJ6CKpTkZyXSKTDgQ0(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityRequest debitInstrumentTokenEligibilityRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentTokenEligibilityRequest, "");
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String clientChannel = debitInstrumentTokenEligibilityRequest.getClientChannel();
        java.util.ArrayList arrayList = null;
        com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(clientChannel != null ? com.paypal.oslo.api.graphql.schema.type.ClientChannel.INSTANCE.safeValueOf(clientChannel) : null);
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String experienceChannel = debitInstrumentTokenEligibilityRequest.getExperienceChannel();
        com.apollographql.apollo.api.Optional presentIfNotNull2 = companion2.presentIfNotNull(experienceChannel != null ? com.paypal.oslo.api.graphql.schema.type.ExperienceChannel.INSTANCE.safeValueOf(experienceChannel) : null);
        com.apollographql.apollo.api.Optional presentIfNotNull3 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(debitInstrumentTokenEligibilityRequest.getInstrumentId());
        java.util.List<java.lang.String> tokenProductNames = debitInstrumentTokenEligibilityRequest.getTokenProductNames();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(tokenProductNames, 10));
        java.util.Iterator<T> it = tokenProductNames.iterator();
        while (it.hasNext()) {
            arrayList2.add(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentTokenProductName.INSTANCE.safeValueOf((java.lang.String) it.next()));
        }
        java.util.ArrayList arrayList3 = arrayList2;
        com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.util.List<java.lang.String> productNames = debitInstrumentTokenEligibilityRequest.getProductNames();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(productNames, 10));
        java.util.Iterator<T> it2 = productNames.iterator();
        while (it2.hasNext()) {
            arrayList4.add(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.INSTANCE.safeValueOf((java.lang.String) it2.next()));
        }
        com.apollographql.apollo.api.Optional.Present present = companion3.present(arrayList4);
        com.apollographql.apollo.api.Optional presentIfNotNull4 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(debitInstrumentTokenEligibilityRequest.isCompanionDevicePaired());
        com.apollographql.apollo.api.Optional.Companion companion4 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.util.List<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletToken> walletTokens = debitInstrumentTokenEligibilityRequest.getWalletTokens();
        if (walletTokens != null) {
            java.util.List<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletToken> list = walletTokens;
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletToken walletToken : list) {
                com.apollographql.apollo.api.Optional presentIfNotNull5 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(walletToken.getFundingPrimaryAccountNumberLastDigits());
                com.apollographql.apollo.api.Optional presentIfNotNull6 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(walletToken.getTokenPrimaryAccountNumberLastDigits());
                com.apollographql.apollo.api.Optional presentIfNotNull7 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(walletToken.getTokenReferenceId());
                com.apollographql.apollo.api.Optional.Companion companion5 = com.apollographql.apollo.api.Optional.INSTANCE;
                com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType deviceType = walletToken.getDeviceType();
                arrayList5.add(new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentWalletTokenInput(presentIfNotNull5, presentIfNotNull6, companion5.presentIfNotNull(deviceType != null ? com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType.INSTANCE.safeValueOf(deviceType.name()) : null), null, presentIfNotNull7, null, null, null, null, null, null, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockStatementsRepositoryImpl.SECOND_YEAR, null));
            }
            arrayList = arrayList5;
        }
        return new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentTokenEligibilityInput(presentIfNotNull, presentIfNotNull2, presentIfNotNull3, arrayList3, present, presentIfNotNull4, companion4.presentIfNotNull(arrayList));
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.EligibilityReason $r8$lambda$MFqlw_5Olxsw4OkxojWpRiaxwhU(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason eligibilityReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibilityReason, "");
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.EligibilityReason(eligibilityReason.getReason(), eligibilityReason.getDescription());
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibility $r8$lambda$lHOQJmAzTCcfM8jhGLfcn0OVuhs(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility debitInstrumentTokenEligibility) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentTokenEligibility, "");
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName.Companion companion = com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName.INSTANCE;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName tokenProductName = debitInstrumentTokenEligibility.getTokenProductName();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName fromValue = companion.fromValue(tokenProductName != null ? tokenProductName.name() : null);
        com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus fromValue2 = com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.INSTANCE.fromValue(debitInstrumentTokenEligibility.getEligibilityStatus().getRawValue());
        if (fromValue2 == null) {
            fromValue2 = com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.INELIGIBLE;
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus eligibilityStatus = fromValue2;
        com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility deviceEligibility = debitInstrumentTokenEligibility.getDeviceEligibility();
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceEligibility invoke = deviceEligibility != null ? deviceEligibilityMapper.invoke(deviceEligibility) : null;
        java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason> eligibilityReasons = debitInstrumentTokenEligibility.getEligibilityReasons();
        if (eligibilityReasons != null) {
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason> list = eligibilityReasons;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(eligibilityReasonMapper.invoke((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.EligibilityReason) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard fundingCard = debitInstrumentTokenEligibility.getFundingCard();
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibility(fromValue, eligibilityStatus, invoke, arrayList, fundingCard != null ? debitInstrumentMapper.invoke(fundingCard) : null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse $r8$lambda$lamf3taHjNiAtHnGSTw9QrEgQwo(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility> debitInstrumentTokenEligibilities = data.getDebitInstrumentTokenEligibilities();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(debitInstrumentTokenEligibilities, 10));
        java.util.Iterator<T> it = debitInstrumentTokenEligibilities.iterator();
        while (it.hasNext()) {
            arrayList.add(tokenEligibilityMapper.invoke((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DebitInstrumentTokenEligibility) it.next()));
        }
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse(arrayList);
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceEligibility $r8$lambda$vri7PAPBfVtpv7hGqbYEmJ5Zcew(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.DeviceEligibility deviceEligibility) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceEligibility, "");
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceEligibility(deviceEligibility.isPrimaryEligible(), deviceEligibility.isCompanionEligible());
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentExpirationDetails $r8$lambda$xmmAy4CwVAmOWhILAst4tJZmv4U(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentTokenEligibilityQuery.FundingCard fundingCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingCard, "");
        com.paypal.oslo.api.graphql.schema.type.Month expirationMonth = fundingCard.getExpirationMonth();
        java.lang.String obj = expirationMonth != null ? expirationMonth.toString() : null;
        java.lang.Object expirationYear = fundingCard.getExpirationYear();
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentExpirationDetails(obj, expirationYear != null ? expirationYear.toString() : null, fundingCard.getExpired());
    }
}
