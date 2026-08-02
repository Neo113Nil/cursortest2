package com.paypal.oslo.feature.identity.deviceregistration.data.repository;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0016\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/identity/deviceregistration/data/repository/DeviceRegistrationRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/deviceregistration/domain/repository/DeviceRegistrationRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationWriter;", "deviceRegistrationWriter", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationSignal;", "deviceRegistrationSignal", "Ljavax/inject/Provider;", "", "paymentAppInstanceIdProvider", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationWriter;Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationSignal;Ljavax/inject/Provider;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/deviceregistration/domain/model/DeviceRegistrationError;", "Lcom/paypal/oslo/feature/identity/deviceregistration/domain/model/DeviceRegistrationOutput;", "register", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "", "p1", "p2", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationWriter;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationSignal;", "Ljavax/inject/Provider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceRegistrationRepositoryImpl implements com.paypal.oslo.feature.identity.deviceregistration.domain.repository.DeviceRegistrationRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final javax.inject.Provider<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public DeviceRegistrationRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter deviceRegistrationWriter, com.paypal.oslo.core.appidentity.domain.DeviceRegistrationSignal deviceRegistrationSignal, javax.inject.Provider<java.lang.String> provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRegistrationWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRegistrationSignal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
        this.getHighSpeedVideoSizes = deviceRegistrationWriter;
        this.getHighSpeedVideoFpsRanges = deviceRegistrationSignal;
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0274, code lost:
    
        if (r1 != r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02e5, code lost:
    
        if (r1 == r3) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Boolean] */
    @Override // com.paypal.oslo.feature.identity.deviceregistration.domain.repository.DeviceRegistrationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object register(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationError, com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationOutput>> continuation) {
        com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl$register$1 deviceRegistrationRepositoryImpl$register$1;
        int i;
        java.lang.String str;
        com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation registerDeviceMutation;
        com.paypal.oslo.api.graphql.schema.type.RegisterDeviceInput registerDeviceInput;
        com.paypal.oslo.core.network.graphql.CallConfig callConfig;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationError.ServerError serverError;
        if (continuation instanceof com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl$register$1) {
            deviceRegistrationRepositoryImpl$register$1 = (com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl$register$1) continuation;
            if ((deviceRegistrationRepositoryImpl$register$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                deviceRegistrationRepositoryImpl$register$1.getOutputStallDuration -= 2147483648;
                java.lang.Object obj = deviceRegistrationRepositoryImpl$register$1.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deviceRegistrationRepositoryImpl$register$1.getOutputStallDuration;
                int i2 = 2;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    str = this.getHighResolutionOutputSizeshNQ4ISI.get();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    pairArr[0] = kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "DeviceRegistration");
                    java.lang.String str2 = str;
                    pairArr[1] = kotlin.TuplesKt.to("hasPaid", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!(str2 == null || kotlin.text.StringsKt.isBlank(str2))));
                    com.paypal.android.logger.Logger.d$default(logger, "Starting RegisterDevice GraphQL mutation", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    com.paypal.oslo.api.graphql.schema.type.RegisterDeviceInput registerDeviceInput2 = new com.paypal.oslo.api.graphql.schema.type.RegisterDeviceInput(com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull((str2 == null || kotlin.text.StringsKt.isBlank(str2)) ? null : kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.api.graphql.schema.type.RegistrationMetadataInput(com.paypal.oslo.api.graphql.schema.type.RegistrationMetadataName.PAYMENT_APP_INSTANCE_ID, str))));
                    com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation registerDeviceMutation2 = new com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation(com.apollographql.apollo.api.Optional.INSTANCE.present(registerDeviceInput2));
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig2 = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("DeviceRegistration", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), r9, i2, r9);
                    deviceRegistrationRepositoryImpl$register$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    deviceRegistrationRepositoryImpl$register$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(registerDeviceInput2);
                    deviceRegistrationRepositoryImpl$register$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(registerDeviceMutation2);
                    deviceRegistrationRepositoryImpl$register$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig2);
                    deviceRegistrationRepositoryImpl$register$1.getOutputStallDuration = 1;
                    java.lang.Object execute = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.getHighSpeedVideoFpsRangesFor, registerDeviceMutation2, callConfig2, deviceRegistrationRepositoryImpl$register$1);
                    if (execute != coroutine_suspended) {
                        registerDeviceMutation = registerDeviceMutation2;
                        obj = execute;
                        registerDeviceInput = registerDeviceInput2;
                        callConfig = callConfig2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2) {
                        int i3 = deviceRegistrationRepositoryImpl$register$1.Camera2StreamConfigurationMap;
                        int i4 = deviceRegistrationRepositoryImpl$register$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return (arrow.core.Either) obj;
                    }
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = deviceRegistrationRepositoryImpl$register$1.Camera2StreamConfigurationMap;
                    int i6 = deviceRegistrationRepositoryImpl$register$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return (arrow.core.Either) obj;
                }
                callConfig = (com.paypal.oslo.core.network.graphql.CallConfig) deviceRegistrationRepositoryImpl$register$1.getHighSpeedVideoSizesFor;
                registerDeviceMutation = (com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation) deviceRegistrationRepositoryImpl$register$1.getHighSpeedVideoSizes;
                registerDeviceInput = (com.paypal.oslo.api.graphql.schema.type.RegisterDeviceInput) deviceRegistrationRepositoryImpl$register$1.getHighSpeedVideoFpsRanges;
                str = (java.lang.String) deviceRegistrationRepositoryImpl$register$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    getHighSpeedVideoFpsRanges(callError);
                    if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                        com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
                        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                            serverError = new com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationError.NetworkError(com.paypal.oslo.feature.qrc.ui.utils.Constants.INTERNET_ERROR, ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) error).getCause());
                        } else if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                            com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                            int code = httpError.getCode();
                            java.lang.String message = httpError.getMessage();
                            if (message == null) {
                                message = "Server error occurred";
                            }
                            serverError = new com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationError.ServerError(code, message);
                        } else {
                            if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            serverError = new com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationError.UnknownError("Unknown network error", ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause());
                        }
                    } else {
                        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = ((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY();
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
                        java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
                        }
                        serverError = new com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationError.ServerError(0, kotlin.collections.CollectionsKt.joinToString$default(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)), "; ", null, null, 0, null, null, 62, null));
                    }
                    return arrow.core.EitherKt.left(serverError);
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.Data data = (com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.Data) graphQLData.getData();
                    com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.RegisterDevice registerDevice = data != null ? data.getRegisterDevice() : null;
                    java.lang.String deviceId = registerDevice != null ? registerDevice.getDeviceId() : null;
                    java.lang.Boolean deviceConfirmed = registerDevice != null ? registerDevice.getDeviceConfirmed() : null;
                    deviceRegistrationRepositoryImpl$register$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    deviceRegistrationRepositoryImpl$register$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(registerDeviceInput);
                    deviceRegistrationRepositoryImpl$register$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(registerDeviceMutation);
                    deviceRegistrationRepositoryImpl$register$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    deviceRegistrationRepositoryImpl$register$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    deviceRegistrationRepositoryImpl$register$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLData);
                    deviceRegistrationRepositoryImpl$register$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(registerDevice);
                    deviceRegistrationRepositoryImpl$register$1.getHighSpeedVideoFpsRangesFor = 0;
                    deviceRegistrationRepositoryImpl$register$1.Camera2StreamConfigurationMap = 0;
                    deviceRegistrationRepositoryImpl$register$1.getOutputStallDuration = 2;
                    obj = getHighSpeedVideoFpsRanges(deviceId, deviceConfirmed, str, deviceRegistrationRepositoryImpl$register$1);
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                    getHighSpeedVideoFpsRanges(callError2);
                    com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.Data data2 = (com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.Data) graphQLData2.getData();
                    com.paypal.oslo.feature.identity.graphql.RegisterDeviceMutation.RegisterDevice registerDevice2 = data2 != null ? data2.getRegisterDevice() : null;
                    java.lang.String deviceId2 = registerDevice2 != null ? registerDevice2.getDeviceId() : null;
                    r9 = registerDevice2 != null ? registerDevice2.getDeviceConfirmed() : 0;
                    deviceRegistrationRepositoryImpl$register$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    deviceRegistrationRepositoryImpl$register$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(registerDeviceInput);
                    deviceRegistrationRepositoryImpl$register$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(registerDeviceMutation);
                    deviceRegistrationRepositoryImpl$register$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callConfig);
                    deviceRegistrationRepositoryImpl$register$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    deviceRegistrationRepositoryImpl$register$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(callError2);
                    deviceRegistrationRepositoryImpl$register$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLData2);
                    deviceRegistrationRepositoryImpl$register$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(registerDevice2);
                    deviceRegistrationRepositoryImpl$register$1.getHighSpeedVideoFpsRangesFor = 0;
                    deviceRegistrationRepositoryImpl$register$1.Camera2StreamConfigurationMap = 0;
                    deviceRegistrationRepositoryImpl$register$1.getOutputStallDuration = 3;
                    obj = getHighSpeedVideoFpsRanges(deviceId2, r9, str, deviceRegistrationRepositoryImpl$register$1);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return coroutine_suspended;
            }
        }
        deviceRegistrationRepositoryImpl$register$1 = new com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl$register$1(this, continuation);
        java.lang.Object obj2 = deviceRegistrationRepositoryImpl$register$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deviceRegistrationRepositoryImpl$register$1.getOutputStallDuration;
        int i22 = 2;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.Boolean bool, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationError, com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationOutput>> continuation) {
        com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl$handleSuccessResponse$1 deviceRegistrationRepositoryImpl$handleSuccessResponse$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.Boolean bool2;
        com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationOutput deviceRegistrationOutput;
        int i2;
        com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter deviceRegistrationWriter;
        boolean deviceConfirmed;
        java.lang.String str3;
        int i3;
        com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter deviceRegistrationWriter2;
        boolean z;
        com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationOutput deviceRegistrationOutput2;
        if (continuation instanceof com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl$handleSuccessResponse$1) {
            deviceRegistrationRepositoryImpl$handleSuccessResponse$1 = (com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl$handleSuccessResponse$1) continuation;
            if ((deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getOutputFormats;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String str4 = str;
                    if (str4 == null || kotlin.text.StringsKt.isBlank(str4)) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Device registration failed: No valid deviceId in response", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "DeviceRegistration")), null, null, 12, null);
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationError.UnknownError("No deviceId returned from server", null));
                    }
                    java.lang.String str5 = str2;
                    boolean z2 = ((str5 == null || kotlin.text.StringsKt.isBlank(str5)) ? (char) 1 : (char) 0) ^ 1;
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                    kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "DeviceRegistration"), kotlin.TuplesKt.to("paidRegistered", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2)));
                    kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceId", str));
                    com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationOutput deviceRegistrationOutput3 = new com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationOutput(str, bool != null ? bool.booleanValue() : false);
                    com.paypal.oslo.core.appidentity.domain.DeviceRegistrationWriter deviceRegistrationWriter3 = this.getHighSpeedVideoSizes;
                    java.lang.String deviceId = deviceRegistrationOutput3.getDeviceId();
                    deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool);
                    deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighResolutionOutputSizeshNQ4ISI = deviceRegistrationOutput3;
                    deviceRegistrationRepositoryImpl$handleSuccessResponse$1.Camera2StreamConfigurationMap = z2 ? 1 : 0;
                    deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getOutputMinFrameDuration = 1;
                    if (deviceRegistrationWriter3.persistPayPalDeviceId(deviceId, deviceRegistrationRepositoryImpl$handleSuccessResponse$1) != coroutine_suspended) {
                        bool2 = bool;
                        deviceRegistrationOutput = deviceRegistrationOutput3;
                        i2 = z2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = deviceRegistrationRepositoryImpl$handleSuccessResponse$1.Camera2StreamConfigurationMap;
                        deviceRegistrationOutput2 = (com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationOutput) deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.getHighSpeedVideoFpsRanges.notifyRegistered(deviceRegistrationOutput2.getDeviceId());
                        return arrow.core.EitherKt.right(deviceRegistrationOutput2);
                    }
                    i3 = deviceRegistrationRepositoryImpl$handleSuccessResponse$1.Camera2StreamConfigurationMap;
                    deviceRegistrationOutput = (com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationOutput) deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighResolutionOutputSizeshNQ4ISI;
                    str2 = (java.lang.String) deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoSizes;
                    bool2 = (java.lang.Boolean) deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoFpsRangesFor;
                    str3 = (java.lang.String) deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    deviceRegistrationWriter2 = this.getHighSpeedVideoSizes;
                    z = i3 != 0;
                    deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool2);
                    deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighResolutionOutputSizeshNQ4ISI = deviceRegistrationOutput;
                    deviceRegistrationRepositoryImpl$handleSuccessResponse$1.Camera2StreamConfigurationMap = i3;
                    deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getOutputMinFrameDuration = 3;
                    if (deviceRegistrationWriter2.persistPaymentAppInstanceIdRegistered(z, deviceRegistrationRepositoryImpl$handleSuccessResponse$1) != coroutine_suspended) {
                        deviceRegistrationOutput2 = deviceRegistrationOutput;
                        this.getHighSpeedVideoFpsRanges.notifyRegistered(deviceRegistrationOutput2.getDeviceId());
                        return arrow.core.EitherKt.right(deviceRegistrationOutput2);
                    }
                    return coroutine_suspended;
                }
                int i5 = deviceRegistrationRepositoryImpl$handleSuccessResponse$1.Camera2StreamConfigurationMap;
                deviceRegistrationOutput = (com.paypal.oslo.feature.identity.deviceregistration.domain.model.DeviceRegistrationOutput) deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighResolutionOutputSizeshNQ4ISI;
                str2 = (java.lang.String) deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoSizes;
                bool2 = (java.lang.Boolean) deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoFpsRangesFor;
                java.lang.String str6 = (java.lang.String) deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                i2 = i5;
                str = str6;
                deviceRegistrationWriter = this.getHighSpeedVideoSizes;
                deviceConfirmed = deviceRegistrationOutput.getDeviceConfirmed();
                deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool2);
                deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighResolutionOutputSizeshNQ4ISI = deviceRegistrationOutput;
                deviceRegistrationRepositoryImpl$handleSuccessResponse$1.Camera2StreamConfigurationMap = i2;
                deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getOutputMinFrameDuration = 2;
                if (deviceRegistrationWriter.persistDeviceConfirmationStatus(deviceConfirmed, deviceRegistrationRepositoryImpl$handleSuccessResponse$1) != coroutine_suspended) {
                    str3 = str;
                    i3 = i2;
                    deviceRegistrationWriter2 = this.getHighSpeedVideoSizes;
                    if (i3 != 0) {
                    }
                    deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool2);
                    deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighResolutionOutputSizeshNQ4ISI = deviceRegistrationOutput;
                    deviceRegistrationRepositoryImpl$handleSuccessResponse$1.Camera2StreamConfigurationMap = i3;
                    deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getOutputMinFrameDuration = 3;
                    if (deviceRegistrationWriter2.persistPaymentAppInstanceIdRegistered(z, deviceRegistrationRepositoryImpl$handleSuccessResponse$1) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        deviceRegistrationRepositoryImpl$handleSuccessResponse$1 = new com.paypal.oslo.feature.identity.deviceregistration.data.repository.DeviceRegistrationRepositoryImpl$handleSuccessResponse$1(this, continuation);
        java.lang.Object obj2 = deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getOutputFormats;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        deviceRegistrationWriter = this.getHighSpeedVideoSizes;
        deviceConfirmed = deviceRegistrationOutput.getDeviceConfirmed();
        deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
        deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool2);
        deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
        deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getHighResolutionOutputSizeshNQ4ISI = deviceRegistrationOutput;
        deviceRegistrationRepositoryImpl$handleSuccessResponse$1.Camera2StreamConfigurationMap = i2;
        deviceRegistrationRepositoryImpl$handleSuccessResponse$1.getOutputMinFrameDuration = 2;
        if (deviceRegistrationWriter.persistDeviceConfirmationStatus(deviceConfirmed, deviceRegistrationRepositoryImpl$handleSuccessResponse$1) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    private static void getHighSpeedVideoFpsRanges(com.paypal.oslo.core.network.graphql.error.CallError p0) {
        java.util.Map mapOf;
        java.lang.Throwable th;
        java.lang.Throwable cause;
        boolean z = p0 instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network;
        if (z) {
            mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "DeviceRegistration"), kotlin.TuplesKt.to("errorType", "Network"), kotlin.TuplesKt.to("details", ((com.paypal.oslo.core.network.graphql.error.CallError.Network) p0).getError().toString()));
        } else {
            if (!(p0 instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.Pair[] pairArr = new kotlin.Pair[4];
            pairArr[0] = kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "DeviceRegistration");
            pairArr[1] = kotlin.TuplesKt.to("errorType", "GraphQL");
            com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) p0;
            pairArr[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ERROR_COUNT, java.lang.Integer.valueOf(arrow.core.NonEmptyList.m9584getSizeimpl(graphQL.m11659getErrors1X0FAY())));
            java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = graphQL.m11659getErrors1X0FAY();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
            java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
            }
            pairArr[3] = kotlin.TuplesKt.to("messages", arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)));
            mapOf = kotlin.collections.MapsKt.mapOf(pairArr);
        }
        java.util.Map map = mapOf;
        if (z) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) p0).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                cause = ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) error).getCause();
            } else if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
                cause = ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause();
            } else if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            th = cause;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Device registration error", map, null, th, 4, null);
        }
        if (!(p0 instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        th = null;
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Device registration error", map, null, th, 4, null);
    }
}
