package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J4\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/data/repository/ConnectedAppsRepositoryImpl;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/ConnectedAppsRepository;", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/ConnectedAppsApi;", com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest, "Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/ConnectedAppsDataMapper;", "mapper", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/ConnectedAppsApi;Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/ConnectedAppsDataMapper;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConnectedAppsError;", "", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConnectedAppsConsent;", "getConnectedApps", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "consentId", "appName", "category", "", "deleteAuthConsent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "grantIds", "deactivateAuthConsent", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "provider", "deleteData", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/RemoveProviderResult;", "removeProviderConsentWithData", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$Data;", "p0", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery$Data;)Ljava/util/List;", "Lcom/paypal/oslo/feature/consumerprivacy/data/apollo/ConnectedAppsApi;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/ConnectedAppsDataMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ConnectedAppsRepositoryImpl implements com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApi getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ConnectedAppsRepositoryImpl(com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApi connectedAppsApi, com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper connectedAppsDataMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppsApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppsDataMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = connectedAppsApi;
        this.getHighSpeedVideoSizes = connectedAppsDataMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getConnectedApps(kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsError, ? extends java.util.List<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent>>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$getConnectedApps$1 connectedAppsRepositoryImpl$getConnectedApps$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$getConnectedApps$1) {
            connectedAppsRepositoryImpl$getConnectedApps$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$getConnectedApps$1) continuation;
            if ((connectedAppsRepositoryImpl$getConnectedApps$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                connectedAppsRepositoryImpl$getConnectedApps$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = connectedAppsRepositoryImpl$getConnectedApps$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = connectedAppsRepositoryImpl$getConnectedApps$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApi connectedAppsApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    connectedAppsRepositoryImpl$getConnectedApps$1.getHighSpeedVideoFpsRanges = 1;
                    obj = connectedAppsApi.getConnectedAppsConsents(connectedAppsRepositoryImpl$getConnectedApps$1);
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
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoSizes.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return new arrow.core.Ior.Right(Camera2StreamConfigurationMap((com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData()));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return new arrow.core.Ior.Both(this.getHighSpeedVideoSizes.mapError((com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue()), Camera2StreamConfigurationMap((com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData()));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        connectedAppsRepositoryImpl$getConnectedApps$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$getConnectedApps$1(this, continuation);
        java.lang.Object obj2 = connectedAppsRepositoryImpl$getConnectedApps$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = connectedAppsRepositoryImpl$getConnectedApps$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteAuthConsent(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$deleteAuthConsent$1 connectedAppsRepositoryImpl$deleteAuthConsent$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.consumerprivacy.graphql.DeleteConsumerPrivacyAuthConsentMutation.DeleteAuthConsent deleteAuthConsent;
        com.paypal.oslo.feature.consumerprivacy.graphql.DeleteConsumerPrivacyAuthConsentMutation.DeleteAuthConsent deleteAuthConsent2;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$deleteAuthConsent$1) {
            connectedAppsRepositoryImpl$deleteAuthConsent$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$deleteAuthConsent$1) continuation;
            if ((connectedAppsRepositoryImpl$deleteAuthConsent$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                connectedAppsRepositoryImpl$deleteAuthConsent$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = connectedAppsRepositoryImpl$deleteAuthConsent$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = connectedAppsRepositoryImpl$deleteAuthConsent$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.DeleteAuthConsentInput deleteAuthConsentInput = new com.paypal.oslo.api.graphql.schema.type.DeleteAuthConsentInput(str, str2, com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesCategory.INSTANCE.safeValueOf(str3));
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApi connectedAppsApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    connectedAppsRepositoryImpl$deleteAuthConsent$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    connectedAppsRepositoryImpl$deleteAuthConsent$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    connectedAppsRepositoryImpl$deleteAuthConsent$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    connectedAppsRepositoryImpl$deleteAuthConsent$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deleteAuthConsentInput);
                    connectedAppsRepositoryImpl$deleteAuthConsent$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = connectedAppsApi.deleteAuthConsent(deleteAuthConsentInput, connectedAppsRepositoryImpl$deleteAuthConsent$1);
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
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoSizes.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                java.lang.Boolean bool = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper connectedAppsDataMapper = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.consumerprivacy.graphql.DeleteConsumerPrivacyAuthConsentMutation.Data data = (com.paypal.oslo.feature.consumerprivacy.graphql.DeleteConsumerPrivacyAuthConsentMutation.Data) graphQLData.getData();
                    if (data != null && (deleteAuthConsent2 = data.getDeleteAuthConsent()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(deleteAuthConsent2.getSuccess());
                    }
                    if (connectedAppsDataMapper.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoSizes.createOperationFailedError("delete auth consent"));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper connectedAppsDataMapper2 = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.consumerprivacy.graphql.DeleteConsumerPrivacyAuthConsentMutation.Data data2 = (com.paypal.oslo.feature.consumerprivacy.graphql.DeleteConsumerPrivacyAuthConsentMutation.Data) graphQLData2.getData();
                    if (data2 != null && (deleteAuthConsent = data2.getDeleteAuthConsent()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(deleteAuthConsent.getSuccess());
                    }
                    if (connectedAppsDataMapper2.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Both(this.getHighSpeedVideoSizes.mapError(callError), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoSizes.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        connectedAppsRepositoryImpl$deleteAuthConsent$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$deleteAuthConsent$1(this, continuation);
        java.lang.Object obj2 = connectedAppsRepositoryImpl$deleteAuthConsent$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = connectedAppsRepositoryImpl$deleteAuthConsent$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deactivateAuthConsent(java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$deactivateAuthConsent$1 connectedAppsRepositoryImpl$deactivateAuthConsent$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.consumerprivacy.graphql.DeactivateConsumerPrivacyAuthConsentMutation.DeactivateAuthConsent deactivateAuthConsent;
        com.paypal.oslo.feature.consumerprivacy.graphql.DeactivateConsumerPrivacyAuthConsentMutation.DeactivateAuthConsent deactivateAuthConsent2;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$deactivateAuthConsent$1) {
            connectedAppsRepositoryImpl$deactivateAuthConsent$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$deactivateAuthConsent$1) continuation;
            if ((connectedAppsRepositoryImpl$deactivateAuthConsent$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                connectedAppsRepositoryImpl$deactivateAuthConsent$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = connectedAppsRepositoryImpl$deactivateAuthConsent$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = connectedAppsRepositoryImpl$deactivateAuthConsent$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.DeactivateAuthConsentInput deactivateAuthConsentInput = new com.paypal.oslo.api.graphql.schema.type.DeactivateAuthConsentInput(list);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApi connectedAppsApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    connectedAppsRepositoryImpl$deactivateAuthConsent$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    connectedAppsRepositoryImpl$deactivateAuthConsent$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deactivateAuthConsentInput);
                    connectedAppsRepositoryImpl$deactivateAuthConsent$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = connectedAppsApi.deactivateAuthConsent(deactivateAuthConsentInput, connectedAppsRepositoryImpl$deactivateAuthConsent$1);
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
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoSizes.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                java.lang.Boolean bool = null;
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper connectedAppsDataMapper = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.consumerprivacy.graphql.DeactivateConsumerPrivacyAuthConsentMutation.Data data = (com.paypal.oslo.feature.consumerprivacy.graphql.DeactivateConsumerPrivacyAuthConsentMutation.Data) graphQLData.getData();
                    if (data != null && (deactivateAuthConsent2 = data.getDeactivateAuthConsent()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(deactivateAuthConsent2.getSuccess());
                    }
                    if (connectedAppsDataMapper.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoSizes.createOperationFailedError("deactivate auth consent"));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper connectedAppsDataMapper2 = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.consumerprivacy.graphql.DeactivateConsumerPrivacyAuthConsentMutation.Data data2 = (com.paypal.oslo.feature.consumerprivacy.graphql.DeactivateConsumerPrivacyAuthConsentMutation.Data) graphQLData2.getData();
                    if (data2 != null && (deactivateAuthConsent = data2.getDeactivateAuthConsent()) != null) {
                        bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(deactivateAuthConsent.getSuccess());
                    }
                    if (connectedAppsDataMapper2.mapMutationSuccess(bool)) {
                        return new arrow.core.Ior.Both(this.getHighSpeedVideoSizes.mapError(callError), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    }
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoSizes.mapError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        connectedAppsRepositoryImpl$deactivateAuthConsent$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$deactivateAuthConsent$1(this, continuation);
        java.lang.Object obj2 = connectedAppsRepositoryImpl$deactivateAuthConsent$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = connectedAppsRepositoryImpl$deactivateAuthConsent$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object removeProviderConsentWithData(java.lang.String str, java.lang.String str2, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsError, com.paypal.oslo.feature.consumerprivacy.domain.model.RemoveProviderResult>> continuation) {
        com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$removeProviderConsentWithData$1 connectedAppsRepositoryImpl$removeProviderConsentWithData$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$removeProviderConsentWithData$1) {
            connectedAppsRepositoryImpl$removeProviderConsentWithData$1 = (com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$removeProviderConsentWithData$1) continuation;
            if ((connectedAppsRepositoryImpl$removeProviderConsentWithData$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                connectedAppsRepositoryImpl$removeProviderConsentWithData$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = connectedAppsRepositoryImpl$removeProviderConsentWithData$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = connectedAppsRepositoryImpl$removeProviderConsentWithData$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.RemoveProviderConsentWithDataInput removeProviderConsentWithDataInput = new com.paypal.oslo.api.graphql.schema.type.RemoveProviderConsentWithDataInput(str2, str, z);
                    com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApi connectedAppsApi = this.getHighResolutionOutputSizeshNQ4ISI;
                    connectedAppsRepositoryImpl$removeProviderConsentWithData$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    connectedAppsRepositoryImpl$removeProviderConsentWithData$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    connectedAppsRepositoryImpl$removeProviderConsentWithData$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(removeProviderConsentWithDataInput);
                    connectedAppsRepositoryImpl$removeProviderConsentWithData$1.getHighSpeedVideoSizes = z;
                    connectedAppsRepositoryImpl$removeProviderConsentWithData$1.getHighSpeedVideoFpsRanges = 1;
                    obj = connectedAppsApi.removeProviderConsentWithData(removeProviderConsentWithDataInput, connectedAppsRepositoryImpl$removeProviderConsentWithData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = connectedAppsRepositoryImpl$removeProviderConsentWithData$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return new arrow.core.Ior.Left(this.getHighSpeedVideoSizes.mapError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.Data data = (com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.RemoveProviderConsentWithData removeProviderConsentWithData = data != null ? data.getRemoveProviderConsentWithData() : null;
                    return new arrow.core.Ior.Right(this.getHighSpeedVideoSizes.mapRemoveProviderResult(removeProviderConsentWithData != null ? kotlin.coroutines.jvm.internal.Boxing.boxBoolean(removeProviderConsentWithData.getDeauthorized()) : null, removeProviderConsentWithData != null ? kotlin.coroutines.jvm.internal.Boxing.boxBoolean(removeProviderConsentWithData.getDataDeleted()) : null));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.Data data2 = (com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    com.paypal.oslo.feature.consumerprivacy.graphql.RemoveConsumerPrivacyProviderConsentWithDataMutation.RemoveProviderConsentWithData removeProviderConsentWithData2 = data2 != null ? data2.getRemoveProviderConsentWithData() : null;
                    return new arrow.core.Ior.Both(this.getHighSpeedVideoSizes.mapError(callError), this.getHighSpeedVideoSizes.mapRemoveProviderResult(removeProviderConsentWithData2 != null ? kotlin.coroutines.jvm.internal.Boxing.boxBoolean(removeProviderConsentWithData2.getDeauthorized()) : null, removeProviderConsentWithData2 != null ? kotlin.coroutines.jvm.internal.Boxing.boxBoolean(removeProviderConsentWithData2.getDataDeleted()) : null));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        connectedAppsRepositoryImpl$removeProviderConsentWithData$1 = new com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$removeProviderConsentWithData$1(this, continuation);
        java.lang.Object obj2 = connectedAppsRepositoryImpl$removeProviderConsentWithData$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = connectedAppsRepositoryImpl$removeProviderConsentWithData$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private final java.util.List<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent> Camera2StreamConfigurationMap(com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Data p0) {
        java.util.ArrayList arrayList;
        java.util.List<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent> connectedAppsAndSitesConsents;
        java.util.Iterator it;
        com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent mapBaseConsent;
        java.util.ArrayList arrayList2;
        java.util.Iterator it2;
        java.lang.String str;
        if (p0 == null || (connectedAppsAndSitesConsents = p0.getConnectedAppsAndSitesConsents()) == null) {
            arrayList = null;
        } else {
            java.util.List<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent> list = connectedAppsAndSitesConsents;
            int i = 10;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent connectedAppsAndSitesConsent = (com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.ConnectedAppsAndSitesConsent) it3.next();
                com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesAuthConsent onConnectedAppsAndSitesAuthConsent = connectedAppsAndSitesConsent.getOnConnectedAppsAndSitesAuthConsent();
                com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.OnConnectedAppsAndSitesProviderConsent onConnectedAppsAndSitesProviderConsent = connectedAppsAndSitesConsent.getOnConnectedAppsAndSitesProviderConsent();
                if (onConnectedAppsAndSitesAuthConsent != null) {
                    com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper connectedAppsDataMapper = this.getHighSpeedVideoSizes;
                    java.lang.String id = onConnectedAppsAndSitesAuthConsent.getId();
                    java.lang.String rawValue = onConnectedAppsAndSitesAuthConsent.getCategory().getRawValue();
                    java.lang.String appId = onConnectedAppsAndSitesAuthConsent.getAppId();
                    java.lang.String appName = onConnectedAppsAndSitesAuthConsent.getAppName();
                    java.lang.String externalUserId = onConnectedAppsAndSitesAuthConsent.getExternalUserId();
                    com.paypal.oslo.api.graphql.schema.type.ConnectedAppsAndSitesConsentStatus status = onConnectedAppsAndSitesAuthConsent.getStatus();
                    java.lang.String rawValue2 = status != null ? status.getRawValue() : null;
                    java.lang.String valueOf = java.lang.String.valueOf(onConnectedAppsAndSitesAuthConsent.getGrantTime());
                    java.lang.Object expiryTime = onConnectedAppsAndSitesAuthConsent.getExpiryTime();
                    java.lang.String obj = expiryTime != null ? expiryTime.toString() : null;
                    java.lang.Object revokedTime = onConnectedAppsAndSitesAuthConsent.getRevokedTime();
                    java.lang.String obj2 = revokedTime != null ? revokedTime.toString() : null;
                    java.lang.String consumerDataRightsArrangementId = onConnectedAppsAndSitesAuthConsent.getConsumerDataRightsArrangementId();
                    java.lang.String grantId = onConnectedAppsAndSitesAuthConsent.getGrantId();
                    boolean isUnifiedAccountLinkingClient = onConnectedAppsAndSitesAuthConsent.isUnifiedAccountLinkingClient();
                    java.util.List<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission> permissions = onConnectedAppsAndSitesAuthConsent.getPermissions();
                    if (permissions != null) {
                        java.util.List<com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission> list2 = permissions;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, i));
                        java.util.Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission permission = (com.paypal.oslo.feature.consumerprivacy.graphql.GetConsumerPrivacyConnectedAppsAndSitesConsentsQuery.Permission) it4.next();
                            java.lang.String key = permission.getKey();
                            java.util.Iterator it5 = it4;
                            java.util.List<java.lang.String> values = permission.getValues();
                            java.lang.Object sharingStartTime = permission.getSharingStartTime();
                            if (sharingStartTime != null) {
                                str = sharingStartTime.toString();
                                it2 = it3;
                            } else {
                                it2 = it3;
                                str = null;
                            }
                            arrayList4.add(new com.paypal.oslo.feature.consumerprivacy.data.mapper.PermissionData(key, values, str));
                            it4 = it5;
                            it3 = it2;
                        }
                        it = it3;
                        arrayList2 = arrayList4;
                    } else {
                        it = it3;
                        arrayList2 = null;
                    }
                    mapBaseConsent = connectedAppsDataMapper.mapAuthConsent(id, rawValue, appId, appName, externalUserId, rawValue2, valueOf, obj, obj2, consumerDataRightsArrangementId, grantId, java.lang.Boolean.valueOf(isUnifiedAccountLinkingClient), arrayList2);
                } else {
                    it = it3;
                    if (onConnectedAppsAndSitesProviderConsent != null) {
                        mapBaseConsent = this.getHighSpeedVideoSizes.mapProviderConsent(onConnectedAppsAndSitesProviderConsent.getId(), onConnectedAppsAndSitesProviderConsent.getCategory().getRawValue(), onConnectedAppsAndSitesProviderConsent.getAppId(), onConnectedAppsAndSitesProviderConsent.getAppName(), onConnectedAppsAndSitesProviderConsent.getExternalUserId(), onConnectedAppsAndSitesProviderConsent.getProviderName());
                    } else {
                        mapBaseConsent = this.getHighSpeedVideoSizes.mapBaseConsent(connectedAppsAndSitesConsent.getId(), connectedAppsAndSitesConsent.getCategory().getRawValue(), connectedAppsAndSitesConsent.getAppId(), connectedAppsAndSitesConsent.getAppName());
                    }
                }
                arrayList3.add(mapBaseConsent);
                it3 = it;
                i = 10;
            }
            arrayList = arrayList3;
        }
        return arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }
}
