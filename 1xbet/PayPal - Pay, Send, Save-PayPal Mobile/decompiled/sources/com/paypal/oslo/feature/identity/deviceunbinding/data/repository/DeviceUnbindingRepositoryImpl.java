package com.paypal.oslo.feature.identity.deviceunbinding.data.repository;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/deviceunbinding/data/repository/DeviceUnbindingRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/repository/DeviceUnbindingRepository;", "Ljavax/inject/Provider;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ljavax/inject/Provider;)V", "Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingInput;", "input", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingError;", "Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingOutput;", "unbind", "(Lcom/paypal/oslo/feature/identity/deviceunbinding/domain/model/DeviceUnbindingInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Ljavax/inject/Provider;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceUnbindingRepositoryImpl implements com.paypal.oslo.feature.identity.deviceunbinding.domain.repository.DeviceUnbindingRepository {

    @java.lang.Deprecated
    public static final java.lang.String SOURCE = "device_unbinding";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final javax.inject.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;
    private static final com.paypal.oslo.feature.identity.deviceunbinding.data.repository.DeviceUnbindingRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.identity.deviceunbinding.data.repository.DeviceUnbindingRepositoryImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public DeviceUnbindingRepositoryImpl(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.identity.deviceunbinding.domain.repository.DeviceUnbindingRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object unbind(com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingInput deviceUnbindingInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError, com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingOutput>> continuation) {
        com.paypal.oslo.feature.identity.deviceunbinding.data.repository.DeviceUnbindingRepositoryImpl$unbind$1 deviceUnbindingRepositoryImpl$unbind$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.identity.graphql.UnbindAuthenticationDeviceMutation.UnbindAuthenticationDevice unbindAuthenticationDevice;
        if (continuation instanceof com.paypal.oslo.feature.identity.deviceunbinding.data.repository.DeviceUnbindingRepositoryImpl$unbind$1) {
            deviceUnbindingRepositoryImpl$unbind$1 = (com.paypal.oslo.feature.identity.deviceunbinding.data.repository.DeviceUnbindingRepositoryImpl$unbind$1) continuation;
            if ((deviceUnbindingRepositoryImpl$unbind$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                deviceUnbindingRepositoryImpl$unbind$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = deviceUnbindingRepositoryImpl$unbind$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deviceUnbindingRepositoryImpl$unbind$1.getHighSpeedVideoFpsRanges;
                java.lang.Object[] objArr = 0;
                java.lang.Object[] objArr2 = 0;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.UnbindAuthenticationDeviceInput graphQLInput = com.paypal.oslo.feature.identity.deviceunbinding.data.mapper.DeviceUnbindingDataMapperKt.toGraphQLInput(deviceUnbindingInput);
                    com.paypal.oslo.feature.identity.graphql.UnbindAuthenticationDeviceMutation unbindAuthenticationDeviceMutation = new com.paypal.oslo.feature.identity.graphql.UnbindAuthenticationDeviceMutation(graphQLInput);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(SOURCE, (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
                    deviceUnbindingRepositoryImpl$unbind$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceUnbindingInput);
                    deviceUnbindingRepositoryImpl$unbind$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLInput);
                    deviceUnbindingRepositoryImpl$unbind$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unbindAuthenticationDeviceMutation);
                    deviceUnbindingRepositoryImpl$unbind$1.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloClient, unbindAuthenticationDeviceMutation, callConfig, deviceUnbindingRepositoryImpl$unbind$1);
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
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.deviceunbinding.data.mapper.DeviceUnbindingDataMapperKt.toDomainError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.identity.graphql.UnbindAuthenticationDeviceMutation.Data data = (com.paypal.oslo.feature.identity.graphql.UnbindAuthenticationDeviceMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data == null || (unbindAuthenticationDevice = data.getUnbindAuthenticationDevice()) == null) {
                        return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.deviceunbinding.domain.model.DeviceUnbindingError.InvalidServerResponse.INSTANCE);
                    }
                    return com.paypal.oslo.feature.identity.deviceunbinding.data.mapper.DeviceUnbindingDataMapperKt.toDomainOutput(unbindAuthenticationDevice);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.identity.graphql.UnbindAuthenticationDeviceMutation.Data data2 = (com.paypal.oslo.feature.identity.graphql.UnbindAuthenticationDeviceMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    com.paypal.oslo.feature.identity.graphql.UnbindAuthenticationDeviceMutation.UnbindAuthenticationDevice unbindAuthenticationDevice2 = data2 != null ? data2.getUnbindAuthenticationDevice() : null;
                    if (unbindAuthenticationDevice2 != null) {
                        return com.paypal.oslo.feature.identity.deviceunbinding.data.mapper.DeviceUnbindingDataMapperKt.toDomainOutput(unbindAuthenticationDevice2);
                    }
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.deviceunbinding.data.mapper.DeviceUnbindingDataMapperKt.toDomainError(callError));
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        deviceUnbindingRepositoryImpl$unbind$1 = new com.paypal.oslo.feature.identity.deviceunbinding.data.repository.DeviceUnbindingRepositoryImpl$unbind$1(this, continuation);
        java.lang.Object obj2 = deviceUnbindingRepositoryImpl$unbind$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deviceUnbindingRepositoryImpl$unbind$1.getHighSpeedVideoFpsRanges;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr22 = 0;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/deviceunbinding/data/repository/DeviceUnbindingRepositoryImpl$Companion;", "", "<init>", "()V", "", "SOURCE", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
