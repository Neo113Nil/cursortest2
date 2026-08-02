package com.paypal.oslo.feature.debitcard.cardacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0002j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"", "isPrivacyPolicyRequired", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentEligibilityQuery$Data;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityResponse;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "debitCardEligibilityResponseMapper", "(Z)Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityInput;", "debitCardEligibilityRequestMapper", "Lkotlin/jvm/functions/Function1;", "getDebitCardEligibilityRequestMapper", "()Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardEligibilityMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityInput> debitCardEligibilityRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.data.mapper.DebitCardEligibilityMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.cardacquisition.data.mapper.DebitCardEligibilityMapperKt.m14177$r8$lambda$D7SBIpeghimpWlTG09KkXsbsAE((com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityInput> getDebitCardEligibilityRequestMapper() {
        return debitCardEligibilityRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.Data, com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse> debitCardEligibilityResponseMapper(final boolean z) {
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.data.mapper.DebitCardEligibilityMapperKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.cardacquisition.data.mapper.DebitCardEligibilityMapperKt.$r8$lambda$Kv6tzVI7_hFZ5kznJtnEsqaVoVA(z, (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.Data) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$D7S-BIpeghimpWlTG09KkXsbsAE, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityInput m14177$r8$lambda$D7SBIpeghimpWlTG09KkXsbsAE(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest debitCardEligibilityRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardEligibilityRequest, "");
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName safeValueOf = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.INSTANCE.safeValueOf(debitCardEligibilityRequest.getProductName().name());
        com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(debitCardEligibilityRequest.getBundle());
        com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityEvaluationContext evaluationContext = debitCardEligibilityRequest.getEvaluationContext();
        return new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityInput(safeValueOf, presentIfNotNull, evaluationContext == null ? com.apollographql.apollo.api.Optional.INSTANCE.absent() : com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityContextInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.api.graphql.schema.type.TokenProductName.INSTANCE.safeValueOf(evaluationContext.getTokenProductName().getValue())))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        if (r7 != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse $r8$lambda$Kv6tzVI7_hFZ5kznJtnEsqaVoVA(boolean z, com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.Data data) {
        java.util.ArrayList emptyList;
        java.lang.String obj;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.DebitInstrumentEligibility debitInstrumentEligibility = data.getDebitInstrumentEligibility();
        com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus fromValue = com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.INSTANCE.fromValue(debitInstrumentEligibility.getEligibilityStatus().getRawValue());
        if (fromValue == null) {
            fromValue = com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus.INELIGIBLE;
        }
        java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibilityReason> eligibilityReason = debitInstrumentEligibility.getEligibilityReason();
        java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibilityReason> list = eligibilityReason;
        if (list == null || list.isEmpty()) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibilityReason> list2 = eligibilityReason;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibilityReason eligibilityReason2 : list2) {
                arrayList.add(new com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityReason(eligibilityReason2.getReason(), eligibilityReason2.getDescription()));
            }
            emptyList = arrayList;
        }
        java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibleInstrumentProduct> eligibleInstrumentProducts = debitInstrumentEligibility.getEligibleInstrumentProducts();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentEligibilityQuery.EligibleInstrumentProduct eligibleInstrumentProduct : eligibleInstrumentProducts) {
            java.lang.Object virtualCardHolderAgreementUrl = eligibleInstrumentProduct.getVirtualCardHolderAgreementUrl();
            com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails eligibleDebitCardDetails = null;
            eligibleDebitCardDetails = null;
            eligibleDebitCardDetails = null;
            eligibleDebitCardDetails = null;
            if (virtualCardHolderAgreementUrl != null && (obj = virtualCardHolderAgreementUrl.toString()) != null) {
                if (z) {
                    java.lang.Object privacyPolicyUrl = eligibleInstrumentProduct.getPrivacyPolicyUrl();
                    if (privacyPolicyUrl != null) {
                        str = privacyPolicyUrl.toString();
                    }
                } else {
                    java.lang.Object privacyPolicyUrl2 = eligibleInstrumentProduct.getPrivacyPolicyUrl();
                    java.lang.String obj2 = privacyPolicyUrl2 != null ? privacyPolicyUrl2.toString() : null;
                    str = obj2 == null ? "" : obj2;
                }
                java.lang.String shortName = eligibleInstrumentProduct.getShortName();
                if (shortName == null) {
                    shortName = "";
                }
                eligibleDebitCardDetails = new com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails(shortName, obj, str);
            }
            if (eligibleDebitCardDetails != null) {
                arrayList2.add(eligibleDebitCardDetails);
            }
        }
        return new com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse(fromValue, emptyList, arrayList2);
    }
}
