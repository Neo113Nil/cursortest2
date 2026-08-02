package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J<\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/ManageAccountRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/ManageAccountRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "creditAccountId", "creditInstrumentId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;", "status", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/CardLockUnlockError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/CreditInstrumentUpdateResponse;", "updateCreditInstrumentStatus", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/cards/CreditInstrumentStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "enrollInPaper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managecard/StatementDeliveryError;", "updateStatementDeliveryPreference", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ManageAccountRepositoryImpl extends com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ManageAccountRepository {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ManageAccountRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighResolutionOutputSizeshNQ4ISI = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ManageAccountRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateCreditInstrumentStatus(final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.cards.CreditInstrumentStatus creditInstrumentStatus, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CardLockUnlockError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CreditInstrumentUpdateResponse>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$updateCreditInstrumentStatus$1 manageAccountRepositoryImpl$updateCreditInstrumentStatus$1;
        int i;
        arrow.core.Ior ior;
        arrow.core.Ior rightIor;
        arrow.core.Ior rightIor2;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$updateCreditInstrumentStatus$1) {
            manageAccountRepositoryImpl$updateCreditInstrumentStatus$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$updateCreditInstrumentStatus$1) continuation;
            if ((manageAccountRepositoryImpl$updateCreditInstrumentStatus$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                manageAccountRepositoryImpl$updateCreditInstrumentStatus$1.getOutputMinFrameDuration -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$updateCreditInstrumentStatus$1 manageAccountRepositoryImpl$updateCreditInstrumentStatus$12 = manageAccountRepositoryImpl$updateCreditInstrumentStatus$1;
                java.lang.Object obj = manageAccountRepositoryImpl$updateCreditInstrumentStatus$12.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageAccountRepositoryImpl$updateCreditInstrumentStatus$12.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditInstrumentStatusMutation updateRevolvingCreditInstrumentStatusMutation = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditInstrumentStatusMutation(new com.paypal.oslo.api.graphql.schema.type.UpdateRevolvingCreditInstrumentStatusInput(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(creditProductIdentifier), str, str2, com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditInstrumentMapperKt.toGraphQL(creditInstrumentStatus)));
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl.$r8$lambda$NoaTEM9TZTHY25yq630d1iQNA2E(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.error.CallError) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl.$r8$lambda$I4hxAPE74YCF6C41xFPQlglVKCo((com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditInstrumentStatusMutation.Data) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl.$r8$lambda$8LmZcK05ZHN1qx0fJmSE_OQqWMI(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.this, (com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope) obj2);
                        }
                    };
                    manageAccountRepositoryImpl$updateCreditInstrumentStatus$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    manageAccountRepositoryImpl$updateCreditInstrumentStatus$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    manageAccountRepositoryImpl$updateCreditInstrumentStatus$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    manageAccountRepositoryImpl$updateCreditInstrumentStatus$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditInstrumentStatus);
                    manageAccountRepositoryImpl$updateCreditInstrumentStatus$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateRevolvingCreditInstrumentStatusMutation);
                    manageAccountRepositoryImpl$updateCreditInstrumentStatus$12.getOutputMinFrameDuration = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository.executeMutation$default(this, this.getHighResolutionOutputSizeshNQ4ISI, updateRevolvingCreditInstrumentStatusMutation, function1, function12, null, function13, manageAccountRepositoryImpl$updateCreditInstrumentStatus$12, 8, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.IorKt.leftIor((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CardLockUnlockError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CreditInstrumentUpdateResponse creditInstrumentUpdateResponse = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CreditInstrumentUpdateResponse) ((arrow.core.Ior.Right) ior).getValue();
                    return (creditInstrumentUpdateResponse == null || (rightIor2 = arrow.core.IorKt.rightIor(creditInstrumentUpdateResponse)) == null) ? arrow.core.IorKt.leftIor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CardLockUnlockError.InvalidResponse.INSTANCE) : rightIor2;
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CreditInstrumentUpdateResponse creditInstrumentUpdateResponse2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CreditInstrumentUpdateResponse) both.getRightValue();
                return (creditInstrumentUpdateResponse2 == null || (rightIor = arrow.core.IorKt.rightIor(creditInstrumentUpdateResponse2)) == null) ? arrow.core.IorKt.leftIor((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CardLockUnlockError) leftValue) : rightIor;
            }
        }
        manageAccountRepositoryImpl$updateCreditInstrumentStatus$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$updateCreditInstrumentStatus$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$updateCreditInstrumentStatus$1 manageAccountRepositoryImpl$updateCreditInstrumentStatus$122 = manageAccountRepositoryImpl$updateCreditInstrumentStatus$1;
        java.lang.Object obj2 = manageAccountRepositoryImpl$updateCreditInstrumentStatus$122.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageAccountRepositoryImpl$updateCreditInstrumentStatus$122.getOutputMinFrameDuration;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ManageAccountRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateStatementDeliveryPreference(final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, final boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$updateStatementDeliveryPreference$1 manageAccountRepositoryImpl$updateStatementDeliveryPreference$1;
        int i;
        arrow.core.Ior ior;
        arrow.core.Ior rightIor;
        arrow.core.Ior rightIor2;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$updateStatementDeliveryPreference$1) {
            manageAccountRepositoryImpl$updateStatementDeliveryPreference$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$updateStatementDeliveryPreference$1) continuation;
            if ((manageAccountRepositoryImpl$updateStatementDeliveryPreference$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                manageAccountRepositoryImpl$updateStatementDeliveryPreference$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$updateStatementDeliveryPreference$1 manageAccountRepositoryImpl$updateStatementDeliveryPreference$12 = manageAccountRepositoryImpl$updateStatementDeliveryPreference$1;
                java.lang.Object obj = manageAccountRepositoryImpl$updateStatementDeliveryPreference$12.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageAccountRepositoryImpl$updateStatementDeliveryPreference$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditNotificationPreferenceMutation updateRevolvingCreditNotificationPreferenceMutation = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditNotificationPreferenceMutation(new com.paypal.oslo.api.graphql.schema.type.UpdateRevolvingCreditNotificationPreferenceInput(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(creditProductIdentifier), str, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceID.STATEMENT_DELIVERY_CHANNELS, com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.managecard.UpdateStatementDeliveryMapperKt.toNotificationChannels(z)), null, null, 48, null));
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl.m18036$r8$lambda$gkyP3E2i0mMoZgpeYRBcfHGF5o(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.error.CallError) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl.$r8$lambda$RtEn1VdNdgWpKtI6UxZICD32nvo(z, (com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditNotificationPreferenceMutation.Data) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl.$r8$lambda$tvlzHFIiCw24W5kHJlUDCQ_0FDM(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.this, (com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope) obj2);
                        }
                    };
                    manageAccountRepositoryImpl$updateStatementDeliveryPreference$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    manageAccountRepositoryImpl$updateStatementDeliveryPreference$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    manageAccountRepositoryImpl$updateStatementDeliveryPreference$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateRevolvingCreditNotificationPreferenceMutation);
                    manageAccountRepositoryImpl$updateStatementDeliveryPreference$12.getHighSpeedVideoFpsRangesFor = z;
                    manageAccountRepositoryImpl$updateStatementDeliveryPreference$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository.executeMutation$default(this, this.getHighResolutionOutputSizeshNQ4ISI, updateRevolvingCreditNotificationPreferenceMutation, function1, function12, null, function13, manageAccountRepositoryImpl$updateStatementDeliveryPreference$12, 8, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = manageAccountRepositoryImpl$updateStatementDeliveryPreference$12.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.IorKt.leftIor((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    java.lang.Boolean bool = (java.lang.Boolean) ((arrow.core.Ior.Right) ior).getValue();
                    return (bool == null || (rightIor2 = arrow.core.IorKt.rightIor(bool)) == null) ? arrow.core.IorKt.leftIor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError.InvalidResponse.INSTANCE) : rightIor2;
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                java.lang.Boolean bool2 = (java.lang.Boolean) both.getRightValue();
                return (bool2 == null || (rightIor = arrow.core.IorKt.rightIor(bool2)) == null) ? arrow.core.IorKt.leftIor((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError) leftValue) : rightIor;
            }
        }
        manageAccountRepositoryImpl$updateStatementDeliveryPreference$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$updateStatementDeliveryPreference$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl$updateStatementDeliveryPreference$1 manageAccountRepositoryImpl$updateStatementDeliveryPreference$122 = manageAccountRepositoryImpl$updateStatementDeliveryPreference$1;
        java.lang.Object obj2 = manageAccountRepositoryImpl$updateStatementDeliveryPreference$122.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageAccountRepositoryImpl$updateStatementDeliveryPreference$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8LmZcK05ZHN1qx0fJmSE_OQqWMI(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope networkObservabilityAttributesScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkObservabilityAttributesScope, "");
        networkObservabilityAttributesScope.addCpi(creditProductIdentifier);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CreditInstrumentUpdateResponse $r8$lambda$I4hxAPE74YCF6C41xFPQlglVKCo(com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditInstrumentStatusMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.managecard.UpdateCreditInstrumentStatusMapperKt.toDomain(data);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CardLockUnlockError $r8$lambda$NoaTEM9TZTHY25yq630d1iQNA2E(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl manageAccountRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CardLockUnlockError.Network.INSTANCE;
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.CardLockUnlockError.GraphQL.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static /* synthetic */ java.lang.Boolean $r8$lambda$RtEn1VdNdgWpKtI6UxZICD32nvo(boolean z, com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditNotificationPreferenceMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.managecard.UpdateStatementDeliveryMapperKt.toDomain(data, z);
    }

    /* renamed from: $r8$lambda$gkyP3E2i0mMoZgpeYRBcfHG-F5o, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError m18036$r8$lambda$gkyP3E2i0mMoZgpeYRBcfHGF5o(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.ManageAccountRepositoryImpl manageAccountRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError.Network.INSTANCE;
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managecard.StatementDeliveryError.GraphQL.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tvlzHFIiCw24W5kHJlUDCQ_0FDM(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope networkObservabilityAttributesScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkObservabilityAttributesScope, "");
        networkObservabilityAttributesScope.addCpi(creditProductIdentifier);
        return kotlin.Unit.INSTANCE;
    }
}
