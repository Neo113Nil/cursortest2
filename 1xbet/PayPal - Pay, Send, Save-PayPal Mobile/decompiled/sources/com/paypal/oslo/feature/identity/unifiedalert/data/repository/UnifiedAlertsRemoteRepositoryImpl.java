package com.paypal.oslo.feature.identity.unifiedalert.data.repository;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJB\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016JB\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/data/repository/UnifiedAlertsRemoteRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/repository/UnifiedAlertsRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/FetchUnifiedAlertsInput;", "input", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertsError;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "fetchAlerts", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/FetchUnifiedAlertsInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "documentId", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertAction;", "action", "source", "", "acceptableClaims", "", "validateAlert", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlertAction;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationCommunicationAction;", "p1", "p2", "p3", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationCommunicationAction;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/identity/graphql/GetAuthenticationAlertsQuery$Data;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UnifiedAlertsRemoteRepositoryImpl implements com.paypal.oslo.feature.identity.unifiedalert.domain.repository.UnifiedAlertsRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public UnifiedAlertsRemoteRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.identity.unifiedalert.domain.repository.UnifiedAlertsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchAlerts(com.paypal.oslo.feature.identity.unifiedalert.domain.model.FetchUnifiedAlertsInput fetchUnifiedAlertsInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert>> continuation) {
        com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl$fetchAlerts$1 unifiedAlertsRemoteRepositoryImpl$fetchAlerts$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl$fetchAlerts$1) {
            unifiedAlertsRemoteRepositoryImpl$fetchAlerts$1 = (com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl$fetchAlerts$1) continuation;
            if ((unifiedAlertsRemoteRepositoryImpl$fetchAlerts$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                unifiedAlertsRemoteRepositoryImpl$fetchAlerts$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = unifiedAlertsRemoteRepositoryImpl$fetchAlerts$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = unifiedAlertsRemoteRepositoryImpl$fetchAlerts$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String publicCredential = fetchUnifiedAlertsInput.getPublicCredential();
                    com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                    java.lang.String deviceToken = fetchUnifiedAlertsInput.getDeviceToken();
                    java.util.Map map = null;
                    java.lang.Object[] objArr = 0;
                    if (kotlin.text.StringsKt.isBlank(deviceToken)) {
                        deviceToken = null;
                    }
                    com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery getAuthenticationAlertsQuery = new com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery(new com.paypal.oslo.api.graphql.schema.type.AuthenticationAlertInput(publicCredential, companion.presentIfNotNull(deviceToken)));
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("fetch_alerts", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), map, 2, objArr == true ? 1 : 0);
                    unifiedAlertsRemoteRepositoryImpl$fetchAlerts$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fetchUnifiedAlertsInput);
                    unifiedAlertsRemoteRepositoryImpl$fetchAlerts$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getAuthenticationAlertsQuery);
                    unifiedAlertsRemoteRepositoryImpl$fetchAlerts$1.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.getHighSpeedVideoFpsRangesFor, getAuthenticationAlertsQuery, callConfig, unifiedAlertsRemoteRepositoryImpl$fetchAlerts$1);
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
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.unifiedalert.data.mapper.UnifiedAlertsDataMapperKt.toUnifiedAlertsError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return getHighSpeedVideoFpsRanges((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        unifiedAlertsRemoteRepositoryImpl$fetchAlerts$1 = new com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl$fetchAlerts$1(this, continuation);
        java.lang.Object obj2 = unifiedAlertsRemoteRepositoryImpl$fetchAlerts$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = unifiedAlertsRemoteRepositoryImpl$fetchAlerts$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    @Override // com.paypal.oslo.feature.identity.unifiedalert.domain.repository.UnifiedAlertsRepository
    public final java.lang.Object validateAlert(java.lang.String str, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction unifiedAlertAction, java.lang.String str2, java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError, kotlin.Unit>> continuation) {
        com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction authenticationCommunicationAction;
        int i = com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[unifiedAlertAction.ordinal()];
        if (i == 1) {
            authenticationCommunicationAction = com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction.UNIFIED_ALERT_REQUEST_APPROVED;
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            authenticationCommunicationAction = com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction.UNIFIED_ALERT_REQUEST_DENIED;
        }
        return getHighSpeedVideoFpsRangesFor(str, authenticationCommunicationAction, str2, list, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.AuthenticationCommunicationAction authenticationCommunicationAction, java.lang.String str2, java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1 unifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1;
        int i;
        com.paypal.oslo.core.network.graphql.AuthType.User user;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1) {
            unifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1 = (com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1) continuation;
            if ((unifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                unifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = unifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = unifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.graphql.ValidateIdentityAlertMutation validateIdentityAlertMutation = new com.paypal.oslo.feature.identity.graphql.ValidateIdentityAlertMutation(new com.paypal.oslo.api.graphql.schema.type.ValidateAlertInput(authenticationCommunicationAction, str, str2));
                    int i2 = 2;
                    java.util.Map map = null;
                    java.lang.Object[] objArr = 0;
                    if (list.isEmpty()) {
                        user = new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("validate_alert", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                    } else {
                        user = new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("validate_alert", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
                    }
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(user, map, i2, objArr == true ? 1 : 0);
                    unifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    unifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationCommunicationAction);
                    unifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    unifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    unifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validateIdentityAlertMutation);
                    unifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(user);
                    unifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1.getOutputMinFrameDuration = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.getHighSpeedVideoFpsRangesFor, validateIdentityAlertMutation, callConfig, unifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1);
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
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.unifiedalert.data.mapper.UnifiedAlertsDataMapperKt.toUnifiedAlertsError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        unifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1 = new com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1(this, continuation);
        java.lang.Object obj2 = unifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = unifiedAlertsRemoteRepositoryImpl$executeAlertDecision$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static arrow.core.Either<com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert> getHighSpeedVideoFpsRanges(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.Data> p0) {
        com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.AuthenticationAlert authenticationAlert;
        com.paypal.oslo.feature.identity.graphql.GetAuthenticationAlertsQuery.Data data = p0.getData();
        if (data == null || (authenticationAlert = data.getAuthenticationAlert()) == null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError.AlertError("No alert data in response"));
        }
        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert domain = com.paypal.oslo.feature.identity.unifiedalert.data.mapper.UnifiedAlertsDataMapperKt.toDomain(new com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse(kotlin.collections.CollectionsKt.filterNotNull(authenticationAlert.getAlerts()), kotlin.collections.CollectionsKt.filterNotNull(authenticationAlert.getAcceptableClaims())));
        if (domain == null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError.AlertError("No alerts available"));
        }
        return arrow.core.EitherKt.right(domain);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction.APPROVED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction.DENIED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
