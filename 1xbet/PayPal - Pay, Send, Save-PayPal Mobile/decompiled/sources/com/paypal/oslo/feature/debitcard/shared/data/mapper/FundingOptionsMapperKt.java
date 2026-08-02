package com.paypal.oslo.feature.debitcard.shared.data.mapper;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\"6\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f`\u00108\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\":\u0010\u0017\u001a\"\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\rj\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016`\u00108\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceStatus;", "status", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceStatus;", "mapFundingSourceStatusToGraphQL", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceStatus;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceStatus;", "mapFundingSourceStatusFromGraphQL", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceStatus;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSourceStatus;", "Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;", "Lcom/paypal/oslo/feature/debitcard/graphql/type/FundingInstrumentType;", "p0", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/FundingSourceType;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/api/graphql/schema/type/FundingInstrumentType;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/FundingSourceType;", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/EvaluateDebitCardFundingOptionsRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/EvaluateDebitInstrumentFundingOptionsInput;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "evaluateDebitInstrumentRequestMapper", "Lkotlin/jvm/functions/Function1;", "getEvaluateDebitInstrumentRequestMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/EvaluateDebitInstrumentFundingOptionsMutation$Data;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingOptions;", "evaluateDebitInstrumentResponseMapper", "getEvaluateDebitInstrumentResponseMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FundingOptionsMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.EvaluateDebitCardFundingOptionsRequest, com.paypal.oslo.api.graphql.schema.type.EvaluateDebitInstrumentFundingOptionsInput> evaluateDebitInstrumentRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.data.mapper.FundingOptionsMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.shared.data.mapper.FundingOptionsMapperKt.m14566$r8$lambda$mnhcH6b8q7ZFAQ88wM3zlV4LZg((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.EvaluateDebitCardFundingOptionsRequest) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Data, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions> evaluateDebitInstrumentResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.data.mapper.FundingOptionsMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.shared.data.mapper.FundingOptionsMapperKt.$r8$lambda$uCAhgbklQGEN_iu9tMmShMrIA1s((com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Data) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.EvaluateDebitCardFundingOptionsRequest, com.paypal.oslo.api.graphql.schema.type.EvaluateDebitInstrumentFundingOptionsInput> getEvaluateDebitInstrumentRequestMapper() {
        return evaluateDebitInstrumentRequestMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Data, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions> getEvaluateDebitInstrumentResponseMapper() {
        return evaluateDebitInstrumentResponseMapper;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus mapFundingSourceStatusToGraphQL(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus debitCardFundingSourceStatus) {
        int i = debitCardFundingSourceStatus == null ? -1 : com.paypal.oslo.feature.debitcard.shared.data.mapper.FundingOptionsMapperKt.WhenMappings.$EnumSwitchMapping$1[debitCardFundingSourceStatus.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus.ELIGIBLE;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus.CONTINGENCY;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus.UNKNOWN;
    }

    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus mapFundingSourceStatusFromGraphQL(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus debitInstrumentFundingSourceStatus) {
        int i = debitInstrumentFundingSourceStatus == null ? -1 : com.paypal.oslo.feature.debitcard.shared.data.mapper.FundingOptionsMapperKt.WhenMappings.$EnumSwitchMapping$2[debitInstrumentFundingSourceStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus.ELIGIBLE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus.CONTINGENT;
        }
        if (i == 3 || i == 4) {
            return com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus.UNKNOWN;
        }
        return null;
    }

    private static final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType getHighSpeedVideoSizes(com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType fundingInstrumentType) {
        int i = fundingInstrumentType == null ? -1 : com.paypal.oslo.feature.debitcard.shared.data.mapper.FundingOptionsMapperKt.WhenMappings.$EnumSwitchMapping$3[fundingInstrumentType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.BALANCE;
        }
        if (i == 2 || i == 3) {
            return com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.BANK;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.THIRD_PARTY_DEBIT_CARD;
        }
        if (i == 5) {
            return com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.THIRD_PARTY_CREDIT_CARD;
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType fromValue = com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.INSTANCE.fromValue(fundingInstrumentType != null ? fundingInstrumentType.getRawValue() : null);
        return fromValue == null ? com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType.UNKNOWN : fromValue;
    }

    /* renamed from: $r8$lambda$mnhcH6b8q7ZFAQ88wM3zlV4-LZg, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.EvaluateDebitInstrumentFundingOptionsInput m14566$r8$lambda$mnhcH6b8q7ZFAQ88wM3zlV4LZg(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.EvaluateDebitCardFundingOptionsRequest evaluateDebitCardFundingOptionsRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluateDebitCardFundingOptionsRequest, "");
        com.apollographql.apollo.api.Optional.Present present = com.apollographql.apollo.api.Optional.INSTANCE.present(evaluateDebitCardFundingOptionsRequest.getCardId());
        com.apollographql.apollo.api.Optional.Present present2 = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.INSTANCE.safeValueOf(evaluateDebitCardFundingOptionsRequest.getProductName().name()));
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsMode mode = evaluateDebitCardFundingOptionsRequest.getMode();
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint = null;
        com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(mode != null ? com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEvaluateFundingOptionsMode.INSTANCE.safeValueOf(mode.name()) : null);
        com.apollographql.apollo.api.Optional presentIfNotNull2 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(mapFundingSourceStatusToGraphQL(evaluateDebitCardFundingOptionsRequest.getStatus()));
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint entryPoint = evaluateDebitCardFundingOptionsRequest.getEntryPoint();
        int i = entryPoint == null ? -1 : com.paypal.oslo.feature.debitcard.shared.data.mapper.FundingOptionsMapperKt.WhenMappings.$EnumSwitchMapping$0[entryPoint.ordinal()];
        if (i != -1) {
            if (i == 1) {
                debitInstrumentClientEntrypoint = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.MANAGE_CARD;
            } else if (i == 2) {
                debitInstrumentClientEntrypoint = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.CHANGE_FI;
            } else if (i == 3) {
                debitInstrumentClientEntrypoint = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.REQUEST_PHYSICAL_CARD_CHANGE_FI;
            } else {
                if (i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                debitInstrumentClientEntrypoint = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint.CHANGE_FI;
            }
        }
        return new com.paypal.oslo.api.graphql.schema.type.EvaluateDebitInstrumentFundingOptionsInput(present, present2, null, companion2.presentIfNotNull(debitInstrumentClientEntrypoint), presentIfNotNull, presentIfNotNull2, 4, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions $r8$lambda$uCAhgbklQGEN_iu9tMmShMrIA1s(com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Data data) {
        com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Configuration configuration;
        java.util.Set emptySet;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingPreference debitCardFundingPreference;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions debitCardAvailableFundingOptions;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource debitCardFundingSource;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType type;
        java.lang.String id;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentContingencyType type2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Funding funding = data.getEvaluateDebitInstrumentFundingOptions().getFunding();
        if (funding == null || (configuration = funding.getConfiguration()) == null) {
            return null;
        }
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionStatus status = configuration.getStatus();
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingOptionStatus fromValue = com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingOptionStatus.INSTANCE.fromValue(status != null ? status.getRawValue() : null);
        if (fromValue == null) {
            fromValue = com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingOptionStatus.UNKNOWN;
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingOptionStatus fundingOptionStatus = fromValue;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType fundingMethod = configuration.getFundingMethod();
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingOptionType fromValue2 = com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingOptionType.INSTANCE.fromValue(fundingMethod != null ? fundingMethod.getRawValue() : null);
        if (fromValue2 == null) {
            fromValue2 = com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingOptionType.UNKNOWN;
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingOptionType fundingOptionType = fromValue2;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType primaryFundingSourceType = configuration.getPrimaryFundingSourceType();
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType fromValue3 = primaryFundingSourceType == null ? null : com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType.INSTANCE.fromValue(primaryFundingSourceType.getRawValue());
        java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType> secondaryFundingSourceTypes = configuration.getSecondaryFundingSourceTypes();
        java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType> list = secondaryFundingSourceTypes;
        if (list == null || list.isEmpty()) {
            emptySet = kotlin.collections.SetsKt.emptySet();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = secondaryFundingSourceTypes.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType fromValue4 = com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SecondaryFundingOptionType.INSTANCE.fromValue(((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentSecondaryFundingSourceType) it.next()).getRawValue());
                if (fromValue4 != null) {
                    arrayList.add(fromValue4);
                }
            }
            emptySet = kotlin.collections.CollectionsKt.toSet(arrayList);
        }
        java.util.Set set = emptySet;
        com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.UserPreferences userPreferences = funding.getConfiguration().getUserPreferences();
        com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource1 fundingSource = userPreferences != null ? userPreferences.getFundingSource() : null;
        if (fundingSource == null || (id = fundingSource.getId()) == null) {
            debitCardFundingPreference = null;
        } else {
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType primaryFundingOption = userPreferences.getPrimaryFundingOption();
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType fromValue5 = primaryFundingOption == null ? null : com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType.INSTANCE.fromValue(primaryFundingOption.getRawValue());
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType highSpeedVideoSizes = getHighSpeedVideoSizes(fundingSource.getType());
            java.lang.String issuerName = fundingSource.getIssuerName();
            java.lang.Object lastNchars = fundingSource.getLastNchars();
            java.lang.String obj = lastNchars != null ? lastNchars.toString() : null;
            java.lang.String classification = fundingSource.getClassification();
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image1 image = fundingSource.getImage();
            java.lang.Object url = image != null ? image.getUrl() : null;
            java.lang.String str = url instanceof java.lang.String ? (java.lang.String) url : null;
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus mapFundingSourceStatusFromGraphQL = mapFundingSourceStatusFromGraphQL(fundingSource.getStatus());
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType.Companion companion = com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType.INSTANCE;
            com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency1 contingency = fundingSource.getContingency();
            debitCardFundingPreference = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingPreference(new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource(id, highSpeedVideoSizes, issuerName, obj, classification, str, mapFundingSourceStatusFromGraphQL, companion.fromValue((contingency == null || (type2 = contingency.getType()) == null) ? null : type2.getRawValue())), fromValue5);
        }
        com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options options = funding.getOptions();
        if (options == null || options.getFundingSources() == null) {
            debitCardAvailableFundingOptions = null;
        } else {
            java.util.List<com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource> fundingSources = options.getFundingSources();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.FundingSource fundingSource2 : fundingSources) {
                java.lang.String id2 = fundingSource2.getId();
                if (id2 != null) {
                    com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.FundingSourceType highSpeedVideoSizes2 = getHighSpeedVideoSizes(fundingSource2.getType());
                    java.lang.String issuerName2 = fundingSource2.getIssuerName();
                    java.lang.Object lastNchars2 = fundingSource2.getLastNchars();
                    java.lang.String obj2 = lastNchars2 != null ? lastNchars2.toString() : null;
                    java.lang.String classification2 = fundingSource2.getClassification();
                    com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Image image2 = fundingSource2.getImage();
                    java.lang.Object url2 = image2 != null ? image2.getUrl() : null;
                    java.lang.String str2 = url2 instanceof java.lang.String ? (java.lang.String) url2 : null;
                    com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus mapFundingSourceStatusFromGraphQL2 = mapFundingSourceStatusFromGraphQL(fundingSource2.getStatus());
                    com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType.Companion companion2 = com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceContingencyType.INSTANCE;
                    com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Contingency contingency2 = fundingSource2.getContingency();
                    debitCardFundingSource = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource(id2, highSpeedVideoSizes2, issuerName2, obj2, classification2, str2, mapFundingSourceStatusFromGraphQL2, companion2.fromValue((contingency2 == null || (type = contingency2.getType()) == null) ? null : type.getRawValue()));
                } else {
                    debitCardFundingSource = null;
                }
                if (debitCardFundingSource != null) {
                    arrayList2.add(debitCardFundingSource);
                }
            }
            debitCardAvailableFundingOptions = new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions(arrayList2);
        }
        com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options options2 = funding.getOptions();
        java.lang.Boolean canOptOutOfPrimary = options2 != null ? options2.getCanOptOutOfPrimary() : null;
        boolean booleanValue = canOptOutOfPrimary != null ? canOptOutOfPrimary.booleanValue() : false;
        com.paypal.oslo.feature.debitcard.graphql.EvaluateDebitInstrumentFundingOptionsMutation.Options options3 = funding.getOptions();
        java.lang.Boolean canOptOutOfSecondary = options3 != null ? options3.getCanOptOutOfSecondary() : null;
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingOptions(fundingOptionStatus, fundingOptionType, fromValue3, set, debitCardFundingPreference, debitCardAvailableFundingOptions, booleanValue, canOptOutOfSecondary != null ? canOptOutOfSecondary.booleanValue() : false);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint.MANAGE_CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint.CHANGE_FI.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint.REQUEST_PHYSICAL_CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint.TAP_TO_PAY_CARD_PROVISIONING_FLOW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus.values().length];
            try {
                iArr2[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus.ELIGIBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus.CONTINGENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSourceStatus.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus.ELIGIBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus.CONTINGENCY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceStatus.UNKNOWN__.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.values().length];
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.PAYPAL_BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.BANK_SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.BANK_CHECKING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.DEBIT_CARD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.FundingInstrumentType.CREDIT_CARD.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }
}
