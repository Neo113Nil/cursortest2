package com.paypal.oslo.feature.wallet.banks.data.repository;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\u00020\u000b*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u0010\u001a\u00020\u000f*\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0010\u0010\u0015\u001a\u0011\u0010\u0018\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$OpenBankingCapability;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorError;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorResult;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$OpenBankingCapability;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$Institution;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingCapabilityQuery$Institution;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "Lcom/paypal/oslo/api/graphql/schema/type/BankIntegrationType;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/api/graphql/schema/type/BankIntegrationType;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "p0", "", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;", "Lcom/paypal/oslo/api/graphql/schema/type/OpenBankingCapabilityInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationAggregatorParams;)Lcom/paypal/oslo/api/graphql/schema/type/OpenBankingCapabilityInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InstantBankConfirmationRepositoryImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final arrow.core.Either<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorError, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorResult> getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.OpenBankingCapability openBankingCapability) {
        java.lang.String str;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution> institutions;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(openBankingCapability != null ? openBankingCapability.getAggregatorName() : null);
        int size = (openBankingCapability == null || (institutions = openBankingCapability.getInstitutions()) == null) ? 0 : institutions.size();
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to("aggregator", highSpeedVideoFpsRanges.toString());
        if (openBankingCapability == null || (str = openBankingCapability.getBankName()) == null) {
            str = "null";
        }
        pairArr[1] = kotlin.TuplesKt.to("bankName", str);
        pairArr[2] = kotlin.TuplesKt.to("institutionsCount", java.lang.Integer.valueOf(size));
        com.paypal.android.logger.Logger.i$default(logger, "toInstantBankConfirmationResult: Mapping response", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        java.lang.String bankName = openBankingCapability != null ? openBankingCapability.getBankName() : null;
        java.lang.String externalBankId = openBankingCapability != null ? openBankingCapability.getExternalBankId() : null;
        com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType highSpeedVideoSizes = getHighSpeedVideoSizes(openBankingCapability != null ? openBankingCapability.getIntegrationType() : null);
        java.lang.String internalInstitutionId = openBankingCapability != null ? openBankingCapability.getInternalInstitutionId() : null;
        java.lang.Object inlineLogoUrl = openBankingCapability != null ? openBankingCapability.getInlineLogoUrl() : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(inlineLogoUrl, "");
        java.lang.String str2 = (java.lang.String) inlineLogoUrl;
        java.lang.Object primaryLogoUrl = openBankingCapability.getPrimaryLogoUrl();
        kotlin.jvm.internal.Intrinsics.checkNotNull(primaryLogoUrl, "");
        java.lang.String str3 = (java.lang.String) primaryLogoUrl;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution> institutions2 = openBankingCapability.getInstitutions();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(institutions2, 10));
        java.util.Iterator<T> it = institutions2.iterator();
        while (it.hasNext()) {
            arrayList.add(getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution) it.next()));
        }
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorResult(highSpeedVideoFpsRanges, bankName, externalBankId, highSpeedVideoSizes, internalInstitutionId, str2, str3, arrayList));
    }

    private static final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Institution institution) {
        return new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails(institution.getBankName(), (java.lang.String) institution.getInlineLogoUrl(), (java.lang.String) institution.getPrimaryLogoUrl(), institution.getExternalBankId(), institution.getInternalInstitutionId(), (java.lang.String) institution.getInstitutionUrl(), (java.lang.String) institution.getCountryCode(), institution.getRank(), getHighSpeedVideoSizes(institution.getIntegrationType()));
    }

    private static final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator getHighSpeedVideoFpsRanges(com.paypal.oslo.api.graphql.schema.type.BankAggregatorName bankAggregatorName) {
        int i = bankAggregatorName == null ? -1 : com.paypal.oslo.feature.wallet.banks.data.repository.InstantBankConfirmationRepositoryImplKt.WhenMappings.$EnumSwitchMapping$0[bankAggregatorName.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.PLAID;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.YODLEE_FASTLINK;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.TINK;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.FINICITY;
        }
        return com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.UNKNOWN;
    }

    private static final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType getHighSpeedVideoSizes(com.paypal.oslo.api.graphql.schema.type.BankIntegrationType bankIntegrationType) {
        int i = bankIntegrationType == null ? -1 : com.paypal.oslo.feature.wallet.banks.data.repository.InstantBankConfirmationRepositoryImplKt.WhenMappings.$EnumSwitchMapping$1[bankIntegrationType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.HOSTED_URL;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.OAUTH2;
        }
        return com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final arrow.core.Either getHighSpeedVideoSizes(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
            java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = graphQL.m11659getErrors1X0FAY();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
            java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
            }
            java.util.List m9570constructorimpl = arrow.core.NonEmptyList.m9570constructorimpl(arrayList);
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "handleFailure: GraphQL error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ERROR_COUNT, java.lang.Integer.valueOf(arrow.core.NonEmptyList.m9584getSizeimpl(graphQL.m11659getErrors1X0FAY()))), kotlin.TuplesKt.to("messages", arrow.core.NonEmptyList.m9607toStringimpl(m9570constructorimpl))), null, 4, null);
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorError.Business.NoDataAvailable(arrow.core.NonEmptyList.m9567boximpl(m9570constructorimpl)));
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "handleFailure: Network error occurred", null, null, 6, null);
        return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorError.Network.INSTANCE);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.OpenBankingCapabilityInput toGraphQLInput(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams instantBankConfirmationAggregatorParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instantBankConfirmationAggregatorParams, "");
        boolean z = instantBankConfirmationAggregatorParams instanceof com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithBankDetailsParams;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (z) {
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithBankDetailsParams iBCFlowWithBankDetailsParams = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithBankDetailsParams) instantBankConfirmationAggregatorParams;
            com.apollographql.apollo.api.Optional.Present present = com.apollographql.apollo.api.Optional.INSTANCE.present(iBCFlowWithBankDetailsParams.getBankCode());
            com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(iBCFlowWithBankDetailsParams.getCountryCode());
            com.apollographql.apollo.api.Optional presentIfNotNull2 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(iBCFlowWithBankDetailsParams.getIban());
            com.apollographql.apollo.api.Optional presentIfNotNull3 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(iBCFlowWithBankDetailsParams.getBranchCode());
            com.apollographql.apollo.api.Optional presentIfNotNull4 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.toGraphQL(iBCFlowWithBankDetailsParams.getProductFlow()));
            com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
            java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> excludeAggregators = iBCFlowWithBankDetailsParams.getExcludeAggregators();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(excludeAggregators, 10));
            java.util.Iterator<T> it = excludeAggregators.iterator();
            while (it.hasNext()) {
                arrayList.add(com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.toGraphQL((com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator) it.next()));
            }
            return new com.paypal.oslo.api.graphql.schema.type.OpenBankingCapabilityInput(present, presentIfNotNull, presentIfNotNull2, presentIfNotNull3, null, companion.presentIfNotNull(arrayList), com.apollographql.apollo.api.Optional.INSTANCE.present(bool), presentIfNotNull4, 16, null);
        }
        if (instantBankConfirmationAggregatorParams instanceof com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams) {
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams iBCFlowWithInstrumentIdParams = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams) instantBankConfirmationAggregatorParams;
            com.apollographql.apollo.api.Optional.Present present2 = com.apollographql.apollo.api.Optional.INSTANCE.present(iBCFlowWithInstrumentIdParams.getInstrumentId());
            com.apollographql.apollo.api.Optional presentIfNotNull5 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(iBCFlowWithInstrumentIdParams.getCountryCode());
            com.apollographql.apollo.api.Optional presentIfNotNull6 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.toGraphQL(iBCFlowWithInstrumentIdParams.getProductFlow()));
            com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
            java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> excludeAggregators2 = iBCFlowWithInstrumentIdParams.getExcludeAggregators();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(excludeAggregators2, 10));
            java.util.Iterator<T> it2 = excludeAggregators2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.toGraphQL((com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator) it2.next()));
            }
            return new com.paypal.oslo.api.graphql.schema.type.OpenBankingCapabilityInput(null, presentIfNotNull5, null, null, present2, companion2.presentIfNotNull(arrayList2), com.apollographql.apollo.api.Optional.INSTANCE.present(bool), presentIfNotNull6, 13, null);
        }
        if (instantBankConfirmationAggregatorParams instanceof com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithBankDetailsParams) {
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithBankDetailsParams reconsentFlowWithBankDetailsParams = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithBankDetailsParams) instantBankConfirmationAggregatorParams;
            com.apollographql.apollo.api.Optional.Present present3 = com.apollographql.apollo.api.Optional.INSTANCE.present(reconsentFlowWithBankDetailsParams.getBankCode());
            com.apollographql.apollo.api.Optional presentIfNotNull7 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(reconsentFlowWithBankDetailsParams.getCountryCode());
            com.apollographql.apollo.api.Optional presentIfNotNull8 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(reconsentFlowWithBankDetailsParams.getIban());
            com.apollographql.apollo.api.Optional presentIfNotNull9 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(reconsentFlowWithBankDetailsParams.getBranchCode());
            com.apollographql.apollo.api.Optional presentIfNotNull10 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.toGraphQL(reconsentFlowWithBankDetailsParams.getProductFlow()));
            com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
            java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> excludeAggregators3 = reconsentFlowWithBankDetailsParams.getExcludeAggregators();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(excludeAggregators3, 10));
            java.util.Iterator<T> it3 = excludeAggregators3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.toGraphQL((com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator) it3.next()));
            }
            return new com.paypal.oslo.api.graphql.schema.type.OpenBankingCapabilityInput(present3, presentIfNotNull7, presentIfNotNull8, presentIfNotNull9, null, companion3.presentIfNotNull(arrayList3), com.apollographql.apollo.api.Optional.INSTANCE.present(java.lang.Boolean.TRUE), presentIfNotNull10, 16, null);
        }
        if (!(instantBankConfirmationAggregatorParams instanceof com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithInstrumentIdParams)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithInstrumentIdParams reconsentFlowWithInstrumentIdParams = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithInstrumentIdParams) instantBankConfirmationAggregatorParams;
        com.apollographql.apollo.api.Optional.Present present4 = com.apollographql.apollo.api.Optional.INSTANCE.present(reconsentFlowWithInstrumentIdParams.getInstrumentId());
        com.apollographql.apollo.api.Optional presentIfNotNull11 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(reconsentFlowWithInstrumentIdParams.getCountryCode());
        com.apollographql.apollo.api.Optional presentIfNotNull12 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.toGraphQL(reconsentFlowWithInstrumentIdParams.getProductFlow()));
        com.apollographql.apollo.api.Optional.Companion companion4 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> excludeAggregators4 = reconsentFlowWithInstrumentIdParams.getExcludeAggregators();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(excludeAggregators4, 10));
        java.util.Iterator<T> it4 = excludeAggregators4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.toGraphQL((com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator) it4.next()));
        }
        return new com.paypal.oslo.api.graphql.schema.type.OpenBankingCapabilityInput(null, presentIfNotNull11, null, null, present4, companion4.presentIfNotNull(arrayList4), com.apollographql.apollo.api.Optional.INSTANCE.present(java.lang.Boolean.TRUE), presentIfNotNull12, 13, null);
    }

    public static final /* synthetic */ arrow.core.Either access$handlePartialSuccess(com.paypal.oslo.core.network.graphql.error.CallError callError, com.paypal.oslo.feature.wallet.graphql.GetOpenBankingCapabilityQuery.Data data) {
        if (data == null || data.getOpenBankingCapability() == null) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "handlePartialSuccess: Data or openBankingCapability is null, treating as failure", null, null, 6, null);
            return getHighSpeedVideoSizes(callError);
        }
        if (data.getOpenBankingCapability().getAggregatorName() == null) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "handlePartialSuccess: Aggregator name is missing in response", null, null, 6, null);
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorError.Business.AggregatorMissing.INSTANCE);
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "handlePartialSuccess: Valid data present despite errors, proceeding with result mapping", null, null, 6, null);
        return getHighSpeedVideoFpsRangesFor(data.getOpenBankingCapability());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.PLAID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.YODLEE_FASTLINK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.TINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.FINICITY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.BankIntegrationType.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankIntegrationType.HOSTED_URL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankIntegrationType.OAUTH2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
