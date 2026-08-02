package com.paypal.oslo.feature.debitcard.cardacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/FundingSourceType;", "fundingSourceType", "", "classification", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "mapFundingSourceTypeToFundingInstrumentType", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/FundingSourceType;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingPreference;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentUserPreferenceInput;", "debitCardFundingPreferenceMapper", "Lkotlin/jvm/functions/Function1;", "getDebitCardFundingPreferenceMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/ProvisionDebitInstrumentRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/ProvisionDebitInstrumentInput;", "provisionDebitInstrumentRequestMapper", "getProvisionDebitInstrumentRequestMapper", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$Data;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/ProvisionDebitInstrumentResponse;", "provisionDebitInstrumentResponseMapper", "getProvisionDebitInstrumentResponseMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProvisionDebitInstrumentMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingPreference, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput> debitCardFundingPreferenceMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.data.mapper.ProvisionDebitInstrumentMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.cardacquisition.data.mapper.ProvisionDebitInstrumentMapperKt.m14178$r8$lambda$TRuywgiUlNJhfKQPzQQDptEYVE((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingPreference) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentRequest, com.paypal.oslo.api.graphql.schema.type.ProvisionDebitInstrumentInput> provisionDebitInstrumentRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.data.mapper.ProvisionDebitInstrumentMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.cardacquisition.data.mapper.ProvisionDebitInstrumentMapperKt.$r8$lambda$NLqXFZFxvusoQZq7mSpdteEktH8((com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Data, com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse> provisionDebitInstrumentResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.data.mapper.ProvisionDebitInstrumentMapperKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.cardacquisition.data.mapper.ProvisionDebitInstrumentMapperKt.$r8$lambda$ZDeYJiD0DPASPGwpF5GekAlaYkg((com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Data) obj);
        }
    };

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType mapFundingSourceTypeToFundingInstrumentType$default(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType fundingSourceType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return mapFundingSourceTypeToFundingInstrumentType(fundingSourceType, str);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType mapFundingSourceTypeToFundingInstrumentType(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType fundingSourceType, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceType, "");
        switch (com.paypal.oslo.feature.debitcard.cardacquisition.data.mapper.ProvisionDebitInstrumentMapperKt.WhenMappings.$EnumSwitchMapping$0[fundingSourceType.ordinal()]) {
            case 1:
                return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PAYPAL_BALANCE;
            case 2:
                if (kotlin.text.StringsKt.equals(str, "SAVINGS", true)) {
                    return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.BANK_SAVINGS;
                }
                return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.BANK_CHECKING;
            case 3:
                return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.DEBIT_CARD;
            case 4:
                return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.CREDIT_CARD;
            case 5:
                return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PAYPAL_CREDIT;
            case 6:
                return com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.UNKNOWN__;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingPreference, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput> getDebitCardFundingPreferenceMapper() {
        return debitCardFundingPreferenceMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentRequest, com.paypal.oslo.api.graphql.schema.type.ProvisionDebitInstrumentInput> getProvisionDebitInstrumentRequestMapper() {
        return provisionDebitInstrumentRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Data, com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse> getProvisionDebitInstrumentResponseMapper() {
        return provisionDebitInstrumentResponseMapper;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ProvisionDebitInstrumentInput $r8$lambda$NLqXFZFxvusoQZq7mSpdteEktH8(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentRequest provisionDebitInstrumentRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionDebitInstrumentRequest, "");
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName safeValueOf = com.paypal.oslo.feature.debitcard.cardacquisition.data.mapper.ProvisionDebitInstrumentMapperKt.WhenMappings.$EnumSwitchMapping$1[provisionDebitInstrumentRequest.getProductName().ordinal()] == 1 ? com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.UNKNOWN__ : com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.INSTANCE.safeValueOf(provisionDebitInstrumentRequest.getProductName().name());
        com.apollographql.apollo.api.Optional present = (provisionDebitInstrumentRequest.getTokenProductName() == null || kotlin.jvm.internal.Intrinsics.areEqual(provisionDebitInstrumentRequest.getTokenProductName().getValue(), "UNKNOWN")) ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : new com.apollographql.apollo.api.Optional.Present(com.paypal.oslo.feature.debitcard.cardacquisition.domain.mapper.ProvisionDebitInstrumentMapperKt.mapDebitCardTokenProductNameToGraphQLTokenProductName(provisionDebitInstrumentRequest.getTokenProductName()));
        boolean shouldIssuePhysical = provisionDebitInstrumentRequest.getShouldIssuePhysical();
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingPreference fundingPreference = provisionDebitInstrumentRequest.getFundingPreference();
        return new com.paypal.oslo.api.graphql.schema.type.ProvisionDebitInstrumentInput(safeValueOf, null, null, null, null, null, shouldIssuePhysical, null, present, fundingPreference != null ? new com.apollographql.apollo.api.Optional.Present(debitCardFundingPreferenceMapper.invoke(fundingPreference)) : com.apollographql.apollo.api.Optional.Absent.INSTANCE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, null);
    }

    /* renamed from: $r8$lambda$TRuywg-iUlNJhfKQPzQQDptEYVE, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput m14178$r8$lambda$TRuywgiUlNJhfKQPzQQDptEYVE(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingPreference debitCardFundingPreference) {
        com.apollographql.apollo.api.Optional.Absent absent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardFundingPreference, "");
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource fundingSource = debitCardFundingPreference.getFundingSource();
        java.lang.String id = fundingSource.getId();
        java.lang.String issuerName = fundingSource.getIssuerName();
        com.apollographql.apollo.api.Optional.Present present = issuerName != null ? new com.apollographql.apollo.api.Optional.Present(issuerName) : com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        com.apollographql.apollo.api.Optional.Present present2 = new com.apollographql.apollo.api.Optional.Present(mapFundingSourceTypeToFundingInstrumentType(fundingSource.getFundingSourceType(), fundingSource.getClassification()));
        java.lang.String lastNChars = fundingSource.getLastNChars();
        com.apollographql.apollo.api.Optional.Present present3 = lastNChars != null ? new com.apollographql.apollo.api.Optional.Present(lastNChars) : com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        java.lang.String classification = fundingSource.getClassification();
        com.apollographql.apollo.api.Optional.Present present4 = classification != null ? new com.apollographql.apollo.api.Optional.Present(classification) : com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus mapFundingSourceStatusToGraphQL = com.paypal.oslo.feature.debitcard.shared.data.mapper.FundingOptionsMapperKt.mapFundingSourceStatusToGraphQL(fundingSource.getStatus());
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceInput debitInstrumentFundingSourceInput = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceInput(id, present, present2, present3, present4, null, mapFundingSourceStatusToGraphQL != null ? new com.apollographql.apollo.api.Optional.Present(mapFundingSourceStatusToGraphQL) : com.apollographql.apollo.api.Optional.Absent.INSTANCE, 32, null);
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType primaryFundingOption = debitCardFundingPreference.getPrimaryFundingOption();
        if (primaryFundingOption != null) {
            absent = kotlin.jvm.internal.Intrinsics.areEqual(primaryFundingOption.getValue(), com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance) ? new com.apollographql.apollo.api.Optional.Present(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType.BALANCE) : new com.apollographql.apollo.api.Optional.Present(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType.UNKNOWN__);
        } else {
            absent = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        }
        return new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput(debitInstrumentFundingSourceInput, null, absent, 2, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse $r8$lambda$ZDeYJiD0DPASPGwpF5GekAlaYkg(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.ProvisionDebitInstrument provisionDebitInstrument = data.getProvisionDebitInstrument();
        java.util.ArrayList arrayList = null;
        if (provisionDebitInstrument.getOnProvisionDebitInstrumentSuccess() != null) {
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentSuccess onProvisionDebitInstrumentSuccess = provisionDebitInstrument.getOnProvisionDebitInstrumentSuccess();
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument debitInstrument = onProvisionDebitInstrumentSuccess.getDebitInstrument();
            java.lang.String id = debitInstrument.getId();
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName = debitInstrument.getProductName();
            java.lang.Object lastNChars = debitInstrument.getLastNChars();
            java.lang.String obj = lastNChars != null ? lastNChars.toString() : null;
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentServicingAction> actions = debitInstrument.getActions();
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product product = debitInstrument.getProduct();
            return new com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Success(new com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument(id, productName, obj, actions, product != null ? new com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product(product.getShortName(), product.getLargeImage(), product.getSmallImage(), product.getBrand()) : null), onProvisionDebitInstrumentSuccess.getProcessId());
        }
        if (provisionDebitInstrument.getOnProvisionDebitInstrumentContingency() == null) {
            return null;
        }
        com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.OnProvisionDebitInstrumentContingency onProvisionDebitInstrumentContingency = provisionDebitInstrument.getOnProvisionDebitInstrumentContingency();
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyType contingencyType = onProvisionDebitInstrumentContingency.getContingencyType();
        java.lang.String name2 = contingencyType != null ? contingencyType.name() : null;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyCode contingencyCode = onProvisionDebitInstrumentContingency.getContingencyCode();
        java.lang.String name3 = contingencyCode != null ? contingencyCode.name() : null;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyValue> contingencyValues = onProvisionDebitInstrumentContingency.getContingencyValues();
        if (contingencyValues != null) {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyValue> list = contingencyValues;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProvisionContingencyValue) it.next()).name());
            }
            arrayList = arrayList2;
        }
        return new com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Contingency(name2, name3, arrayList, onProvisionDebitInstrumentContingency.getProcessId());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.BANK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.THIRD_PARTY_DEBIT_CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.THIRD_PARTY_CREDIT_CARD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.PAYPAL_CREDIT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.UNKNOWN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.values().length];
            try {
                iArr2[com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
