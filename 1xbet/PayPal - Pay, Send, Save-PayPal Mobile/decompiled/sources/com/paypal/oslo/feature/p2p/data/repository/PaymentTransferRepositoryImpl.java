package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B7\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c0\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00150\"0\u00102\n\u0010!\u001a\u00060\u001fj\u0002` H\u0082@¢\u0006\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010)R\u0014\u0010-\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010&\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010.R\u0014\u0010$\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010/R\u0018\u0010+\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00100"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/repository/PaymentTransferRepositoryImpl;", "Lcom/paypal/oslo/feature/p2p/domain/repository/PaymentTransferRepository;", "Ljavax/inject/Provider;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentTransferFlowConfigurationMapper;", "paymentTransferFlowConfigurationMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/ExecutePaymentTransferSendMapper;", "sendMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/ExecutePaymentTransferRequestMapper;", "requestMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/CallErrorToExecutePaymentTransferErrorMapper;", "errorMapper", "<init>", "(Ljavax/inject/Provider;Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentTransferFlowConfigurationMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/ExecutePaymentTransferSendMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/ExecutePaymentTransferRequestMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/CallErrorToExecutePaymentTransferErrorMapper;)V", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/PaymentTransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferFlowConfiguration;", "getPaymentTransferFlowConfiguration", "()Lkotlinx/coroutines/flow/Flow;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult$Send;", "executeSendTransfer", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult$Request;", "executeRequestTransfer", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/api/graphql/schema/type/ExecutePaymentTransferInput;", "Lcom/paypal/oslo/feature/p2p/graphql/type/ExecutePaymentTransferInput;", "p0", "Lkotlin/Pair;", "Lcom/paypal/oslo/feature/p2p/graphql/ExecutePaymentTransferMutation$ExecutePaymentTransfer;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/api/graphql/schema/type/ExecutePaymentTransferInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Ljavax/inject/Provider;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentTransferFlowConfigurationMapper;", "Camera2StreamConfigurationMap", "getOutputFormats", "Lcom/paypal/oslo/feature/p2p/data/mapper/ExecutePaymentTransferSendMapper;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/p2p/data/mapper/ExecutePaymentTransferRequestMapper;", "Lcom/paypal/oslo/feature/p2p/data/mapper/CallErrorToExecutePaymentTransferErrorMapper;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferFlowConfiguration;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentTransferRepositoryImpl implements com.paypal.oslo.feature.p2p.domain.repository.PaymentTransferRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferRequestMapper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.CallErrorToExecutePaymentTransferErrorMapper getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final javax.inject.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private volatile com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferFlowConfigurationMapper Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferSendMapper getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PaymentTransferRepositoryImpl(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider, com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferFlowConfigurationMapper paymentTransferFlowConfigurationMapper, com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferSendMapper executePaymentTransferSendMapper, com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferRequestMapper executePaymentTransferRequestMapper, com.paypal.oslo.feature.p2p.data.mapper.CallErrorToExecutePaymentTransferErrorMapper callErrorToExecutePaymentTransferErrorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferFlowConfigurationMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executePaymentTransferSendMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executePaymentTransferRequestMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callErrorToExecutePaymentTransferErrorMapper, "");
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = paymentTransferFlowConfigurationMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = executePaymentTransferSendMapper;
        this.getHighSpeedVideoFpsRanges = executePaymentTransferRequestMapper;
        this.getHighSpeedVideoSizes = callErrorToExecutePaymentTransferErrorMapper;
    }

    @Override // com.paypal.oslo.feature.p2p.domain.repository.PaymentTransferRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration>> getPaymentTransferFlowConfiguration() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl$getPaymentTransferFlowConfiguration$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0119 A[Catch: all -> 0x0068, RaiseCancellationException -> 0x006b, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x006b, all -> 0x0068, blocks: (B:11:0x0061, B:13:0x00ff, B:15:0x0119, B:18:0x0121, B:19:0x0158, B:20:0x0160, B:22:0x013d, B:23:0x0161, B:25:0x01a5, B:27:0x01ad), top: B:10:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0161 A[Catch: all -> 0x0068, RaiseCancellationException -> 0x006b, TryCatch #4 {RaiseCancellationException -> 0x006b, all -> 0x0068, blocks: (B:11:0x0061, B:13:0x00ff, B:15:0x0119, B:18:0x0121, B:19:0x0158, B:20:0x0160, B:22:0x013d, B:23:0x0161, B:25:0x01a5, B:27:0x01ad), top: B:10:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // com.paypal.oslo.feature.p2p.domain.repository.PaymentTransferRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object executeSendTransfer(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send>> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl$executeSendTransfer$1 paymentTransferRepositoryImpl$executeSendTransfer$1;
        int i;
        kotlin.jvm.functions.Function2 function2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.IorRaise iorRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.IorRaise iorRaise2;
        java.lang.Object obj;
        com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.OnPaymentTransfer onPaymentTransfer;
        com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError executePaymentTransferError;
        java.lang.String str3 = str;
        if (continuation instanceof com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl$executeSendTransfer$1) {
            paymentTransferRepositoryImpl$executeSendTransfer$1 = (com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl$executeSendTransfer$1) continuation;
            if ((paymentTransferRepositoryImpl$executeSendTransfer$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                paymentTransferRepositoryImpl$executeSendTransfer$1.getOutputSizes -= 2147483648;
                java.lang.Object obj2 = paymentTransferRepositoryImpl$executeSendTransfer$1.toString;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentTransferRepositoryImpl$executeSendTransfer$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.EXECUTE_PAYMENT_TRANSFER_REQUEST, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("intent", com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, str3), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, str2)), null, 4, null);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl.$r8$lambda$Gc6ledvPDFTaRHrmSzo42MqavU0((com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError) obj3, (com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        iorRaise = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        com.paypal.oslo.api.graphql.schema.type.ExecutePaymentTransferInput executePaymentTransferInput = new com.paypal.oslo.api.graphql.schema.type.ExecutePaymentTransferInput(str3, com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent.SEND, com.apollographql.apollo.api.Optional.INSTANCE.present(str2));
                        paymentTransferRepositoryImpl$executeSendTransfer$1.getOutputMinFrameDuration = str3;
                        paymentTransferRepositoryImpl$executeSendTransfer$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        paymentTransferRepositoryImpl$executeSendTransfer$1.getInputFormats = function2;
                        paymentTransferRepositoryImpl$executeSendTransfer$1.getHighSpeedVideoSizesFor = atomicReference;
                        paymentTransferRepositoryImpl$executeSendTransfer$1.getInputSizeshNQ4ISI = defaultRaise;
                        paymentTransferRepositoryImpl$executeSendTransfer$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        paymentTransferRepositoryImpl$executeSendTransfer$1.getOutputStallDurationlomOqCM = iorRaise;
                        paymentTransferRepositoryImpl$executeSendTransfer$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(executePaymentTransferInput);
                        paymentTransferRepositoryImpl$executeSendTransfer$1.getOutputSizeshNQ4ISI = iorRaise;
                        paymentTransferRepositoryImpl$executeSendTransfer$1.Camera2StreamConfigurationMap = 0;
                        paymentTransferRepositoryImpl$executeSendTransfer$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        paymentTransferRepositoryImpl$executeSendTransfer$1.getHighSpeedVideoFpsRanges = 0;
                        paymentTransferRepositoryImpl$executeSendTransfer$1.getHighSpeedVideoFpsRangesFor = 0;
                        paymentTransferRepositoryImpl$executeSendTransfer$1.getHighSpeedVideoSizes = 0;
                        paymentTransferRepositoryImpl$executeSendTransfer$1.getOutputSizes = 1;
                        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(executePaymentTransferInput, paymentTransferRepositoryImpl$executeSendTransfer$1);
                        if (highSpeedVideoSizes == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj2 = highSpeedVideoSizes;
                        iorRaise2 = iorRaise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = paymentTransferRepositoryImpl$executeSendTransfer$1.getHighSpeedVideoSizes;
                    int i3 = paymentTransferRepositoryImpl$executeSendTransfer$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = paymentTransferRepositoryImpl$executeSendTransfer$1.getHighSpeedVideoFpsRanges;
                    int i5 = paymentTransferRepositoryImpl$executeSendTransfer$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i6 = paymentTransferRepositoryImpl$executeSendTransfer$1.Camera2StreamConfigurationMap;
                    arrow.core.raise.IorRaise iorRaise3 = (arrow.core.raise.IorRaise) paymentTransferRepositoryImpl$executeSendTransfer$1.getOutputSizeshNQ4ISI;
                    iorRaise2 = (arrow.core.raise.IorRaise) paymentTransferRepositoryImpl$executeSendTransfer$1.getOutputStallDurationlomOqCM;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) paymentTransferRepositoryImpl$executeSendTransfer$1.getInputSizeshNQ4ISI;
                    atomicReference = (java.util.concurrent.atomic.AtomicReference) paymentTransferRepositoryImpl$executeSendTransfer$1.getHighSpeedVideoSizesFor;
                    function2 = (kotlin.jvm.functions.Function2) paymentTransferRepositoryImpl$executeSendTransfer$1.getInputFormats;
                    java.lang.String str4 = (java.lang.String) paymentTransferRepositoryImpl$executeSendTransfer$1.getOutputMinFrameDuration;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        iorRaise = iorRaise3;
                        str3 = str4;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                            raisedOrRethrow2 = function2.invoke(obj, raisedOrRethrow2);
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow2);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                kotlin.Pair pair = (kotlin.Pair) iorRaise.bind((arrow.core.Ior) obj2);
                com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.ExecutePaymentTransfer executePaymentTransfer = (com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.ExecutePaymentTransfer) pair.component1();
                java.lang.String str5 = (java.lang.String) pair.component2();
                onPaymentTransfer = executePaymentTransfer.getOnPaymentTransfer();
                if (onPaymentTransfer != null) {
                    if (executePaymentTransfer.getOnPaymentRequest() != null) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.EXECUTE_PAYMENT_TRANSFER_ERROR_UNEXPECTED_TYPE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("correlationId", str5)), null, null, 12, null);
                        executePaymentTransferError = (com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business) com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.UnexpectedResponseType.INSTANCE;
                    } else {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.EXECUTE_PAYMENT_TRANSFER_ERROR_NO_DATA, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("correlationId", str5)), null, null, 12, null);
                        executePaymentTransferError = (com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business) com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.NoData.INSTANCE;
                    }
                    iorRaise2.raise(executePaymentTransferError);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send map = this.getHighResolutionOutputSizeshNQ4ISI.map(onPaymentTransfer);
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.EXECUTE_PAYMENT_TRANSFER_SUCCESS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.RESULT_TYPE, "transfer"), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, str3), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_RESULT_ID, map.getId())), null, 4, null);
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference.get();
                return obj3 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(map) : new arrow.core.Ior.Both(obj3, map);
            }
        }
        paymentTransferRepositoryImpl$executeSendTransfer$1 = new com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl$executeSendTransfer$1(this, continuation);
        java.lang.Object obj22 = paymentTransferRepositoryImpl$executeSendTransfer$1.toString;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentTransferRepositoryImpl$executeSendTransfer$1.getOutputSizes;
        if (i != 0) {
        }
        kotlin.Pair pair2 = (kotlin.Pair) iorRaise.bind((arrow.core.Ior) obj22);
        com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.ExecutePaymentTransfer executePaymentTransfer2 = (com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.ExecutePaymentTransfer) pair2.component1();
        java.lang.String str52 = (java.lang.String) pair2.component2();
        onPaymentTransfer = executePaymentTransfer2.getOnPaymentTransfer();
        if (onPaymentTransfer != null) {
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x01a7: INVOKE (r2 I:java.lang.Object) = (r10 I:java.util.concurrent.atomic.AtomicReference) VIRTUAL call: java.util.concurrent.atomic.AtomicReference.get():java.lang.Object A[MD:():V (c)], block:B:37:0x019c */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01af: INVOKE (r0 I:java.lang.Object) = (r11 I:kotlin.jvm.functions.Function2), (r2 I:java.lang.Object), (r0 I:java.lang.Object) INTERFACE call: kotlin.jvm.functions.Function2.invoke(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(P1, P2):R (m)] (LINE:356), block:B:39:0x01af */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fa A[Catch: all -> 0x0192, RaiseCancellationException -> 0x019b, TRY_LEAVE, TryCatch #2 {RaiseCancellationException -> 0x019b, all -> 0x0192, blocks: (B:11:0x005a, B:13:0x00e0, B:15:0x00fa, B:18:0x0102, B:19:0x0137, B:20:0x013f, B:22:0x011d, B:23:0x0140, B:25:0x0182, B:27:0x018a, B:32:0x009d), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0140 A[Catch: all -> 0x0192, RaiseCancellationException -> 0x019b, TryCatch #2 {RaiseCancellationException -> 0x019b, all -> 0x0192, blocks: (B:11:0x005a, B:13:0x00e0, B:15:0x00fa, B:18:0x0102, B:19:0x0137, B:20:0x013f, B:22:0x011d, B:23:0x0140, B:25:0x0182, B:27:0x018a, B:32:0x009d), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r5v0, types: [arrow.core.raise.DefaultRaise, int] */
    @Override // com.paypal.oslo.feature.p2p.domain.repository.PaymentTransferRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object executeRequestTransfer(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request>> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl$executeRequestTransfer$1 paymentTransferRepositoryImpl$executeRequestTransfer$1;
        ?? r5;
        ?? r10;
        ?? invoke;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.IorRaise iorRaise;
        arrow.core.raise.IorRaise iorRaise2;
        com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.OnPaymentRequest onPaymentRequest;
        com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError executePaymentTransferError;
        java.lang.String str2 = str;
        try {
            if (continuation instanceof com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl$executeRequestTransfer$1) {
                paymentTransferRepositoryImpl$executeRequestTransfer$1 = (com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl$executeRequestTransfer$1) continuation;
                if ((paymentTransferRepositoryImpl$executeRequestTransfer$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                    paymentTransferRepositoryImpl$executeRequestTransfer$1.getOutputStallDurationlomOqCM -= 2147483648;
                    java.lang.Object obj = paymentTransferRepositoryImpl$executeRequestTransfer$1.getOutputStallDuration;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r5 = paymentTransferRepositoryImpl$executeRequestTransfer$1.getOutputStallDurationlomOqCM;
                    if (r5 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.EXECUTE_PAYMENT_TRANSFER_REQUEST, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("intent", com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionRequest), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, str2)), null, 4, null);
                        kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl.$r8$lambda$dqABMyRwHfvxTO3fkuG5lM39AyE((com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError) obj2, (com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError) obj3);
                            }
                        };
                        atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        iorRaise = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise2);
                        com.paypal.oslo.api.graphql.schema.type.ExecutePaymentTransferInput executePaymentTransferInput = new com.paypal.oslo.api.graphql.schema.type.ExecutePaymentTransferInput(str2, com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent.REQUEST, com.apollographql.apollo.api.Optional.INSTANCE.absent());
                        paymentTransferRepositoryImpl$executeRequestTransfer$1.getInputSizeshNQ4ISI = str2;
                        paymentTransferRepositoryImpl$executeRequestTransfer$1.getOutputMinFrameDuration = function2;
                        paymentTransferRepositoryImpl$executeRequestTransfer$1.getInputFormats = atomicReference;
                        paymentTransferRepositoryImpl$executeRequestTransfer$1.getHighSpeedVideoSizesFor = defaultRaise;
                        paymentTransferRepositoryImpl$executeRequestTransfer$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                        paymentTransferRepositoryImpl$executeRequestTransfer$1.getOutputMinFrameDurationlomOqCM = iorRaise;
                        paymentTransferRepositoryImpl$executeRequestTransfer$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(executePaymentTransferInput);
                        paymentTransferRepositoryImpl$executeRequestTransfer$1.getOutputSizeshNQ4ISI = iorRaise;
                        paymentTransferRepositoryImpl$executeRequestTransfer$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        paymentTransferRepositoryImpl$executeRequestTransfer$1.getHighSpeedVideoSizes = 0;
                        paymentTransferRepositoryImpl$executeRequestTransfer$1.Camera2StreamConfigurationMap = 0;
                        paymentTransferRepositoryImpl$executeRequestTransfer$1.getHighSpeedVideoFpsRangesFor = 0;
                        paymentTransferRepositoryImpl$executeRequestTransfer$1.getHighSpeedVideoFpsRanges = 0;
                        paymentTransferRepositoryImpl$executeRequestTransfer$1.getOutputStallDurationlomOqCM = 1;
                        obj = getHighSpeedVideoSizes(executePaymentTransferInput, paymentTransferRepositoryImpl$executeRequestTransfer$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        iorRaise2 = iorRaise;
                    } else {
                        if (r5 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = paymentTransferRepositoryImpl$executeRequestTransfer$1.getHighSpeedVideoFpsRanges;
                        int i2 = paymentTransferRepositoryImpl$executeRequestTransfer$1.getHighSpeedVideoFpsRangesFor;
                        int i3 = paymentTransferRepositoryImpl$executeRequestTransfer$1.Camera2StreamConfigurationMap;
                        int i4 = paymentTransferRepositoryImpl$executeRequestTransfer$1.getHighSpeedVideoSizes;
                        int i5 = paymentTransferRepositoryImpl$executeRequestTransfer$1.getHighResolutionOutputSizeshNQ4ISI;
                        arrow.core.raise.IorRaise iorRaise3 = (arrow.core.raise.IorRaise) paymentTransferRepositoryImpl$executeRequestTransfer$1.getOutputSizeshNQ4ISI;
                        iorRaise2 = (arrow.core.raise.IorRaise) paymentTransferRepositoryImpl$executeRequestTransfer$1.getOutputMinFrameDurationlomOqCM;
                        defaultRaise = (arrow.core.raise.DefaultRaise) paymentTransferRepositoryImpl$executeRequestTransfer$1.getHighSpeedVideoSizesFor;
                        atomicReference = (java.util.concurrent.atomic.AtomicReference) paymentTransferRepositoryImpl$executeRequestTransfer$1.getInputFormats;
                        java.lang.String str3 = (java.lang.String) paymentTransferRepositoryImpl$executeRequestTransfer$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        iorRaise = iorRaise3;
                        str2 = str3;
                    }
                    kotlin.Pair pair = (kotlin.Pair) iorRaise.bind((arrow.core.Ior) obj);
                    com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.ExecutePaymentTransfer executePaymentTransfer = (com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.ExecutePaymentTransfer) pair.component1();
                    java.lang.String str4 = (java.lang.String) pair.component2();
                    onPaymentRequest = executePaymentTransfer.getOnPaymentRequest();
                    if (onPaymentRequest != null) {
                        if (executePaymentTransfer.getOnPaymentTransfer() != null) {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.EXECUTE_PAYMENT_TRANSFER_ERROR_UNEXPECTED_TYPE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("correlationId", str4)), null, null, 12, null);
                            executePaymentTransferError = (com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business) com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.UnexpectedResponseType.INSTANCE;
                        } else {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.EXECUTE_PAYMENT_TRANSFER_ERROR_NO_DATA, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("correlationId", str4)), null, null, 12, null);
                            executePaymentTransferError = (com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business) com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.NoData.INSTANCE;
                        }
                        iorRaise2.raise(executePaymentTransferError);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Request map = this.getHighSpeedVideoFpsRanges.map(onPaymentRequest);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.EXECUTE_PAYMENT_REQUEST_SUCCESS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.RESULT_TYPE, "request"), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, str2), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.REQUEST_RESULT_ID, map.getId())), null, 4, null);
                    defaultRaise.complete();
                    arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                    java.lang.Object obj2 = atomicReference.get();
                    return obj2 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(map) : new arrow.core.Ior.Both(obj2, map);
                }
            }
            if (r5 != 0) {
            }
            kotlin.Pair pair2 = (kotlin.Pair) iorRaise.bind((arrow.core.Ior) obj);
            com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.ExecutePaymentTransfer executePaymentTransfer2 = (com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.ExecutePaymentTransfer) pair2.component1();
            java.lang.String str42 = (java.lang.String) pair2.component2();
            onPaymentRequest = executePaymentTransfer2.getOnPaymentRequest();
            if (onPaymentRequest != null) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e) {
            r5.complete();
            java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, r5);
            arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
            java.lang.Object obj3 = r10.get();
            if (obj3 != arrow.core.EmptyValue.INSTANCE) {
                raisedOrRethrow = invoke.invoke(obj3, raisedOrRethrow);
            }
            return new arrow.core.Ior.Left(raisedOrRethrow);
        } catch (java.lang.Throwable th) {
            r5.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        paymentTransferRepositoryImpl$executeRequestTransfer$1 = new com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl$executeRequestTransfer$1(this, continuation);
        java.lang.Object obj4 = paymentTransferRepositoryImpl$executeRequestTransfer$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r5 = paymentTransferRepositoryImpl$executeRequestTransfer$1.getOutputStallDurationlomOqCM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf A[Catch: all -> 0x0058, RaiseCancellationException -> 0x005b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x005b, all -> 0x0058, blocks: (B:11:0x0052, B:13:0x00c7, B:16:0x00cf, B:17:0x014d, B:19:0x015f, B:21:0x0167, B:23:0x016f, B:25:0x0175, B:27:0x0186, B:30:0x018e, B:32:0x0196, B:33:0x01a0, B:39:0x010f, B:40:0x01a1, B:41:0x01a6), top: B:10:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.api.graphql.schema.type.ExecutePaymentTransferInput executePaymentTransferInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError, kotlin.Pair<com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.ExecutePaymentTransfer, java.lang.String>>> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl$executePaymentTransferMutation$1 paymentTransferRepositoryImpl$executePaymentTransferMutation$1;
        int i;
        kotlin.jvm.functions.Function2 function2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.IorRaise iorRaise;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        arrow.core.raise.IorRaise iorRaise2;
        java.lang.Object obj;
        arrow.core.Ior.Both both;
        java.lang.Object obj2;
        java.lang.String str;
        com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.Data data;
        com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.ExecutePaymentTransfer executePaymentTransfer;
        com.paypal.oslo.api.graphql.schema.type.ExecutePaymentTransferInput executePaymentTransferInput2 = executePaymentTransferInput;
        if (continuation instanceof com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl$executePaymentTransferMutation$1) {
            paymentTransferRepositoryImpl$executePaymentTransferMutation$1 = (com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl$executePaymentTransferMutation$1) continuation;
            if ((paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj3 = paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                            return com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl.$r8$lambda$i4LaO9XJbuUcnbcTH3Lus0G6zI8((com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError) obj4, (com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError) obj5);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        iorRaise = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRangesFor.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                        com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation executePaymentTransferMutation = new com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation(executePaymentTransferInput2);
                        com.paypal.oslo.core.network.graphql.RiskSourceId executePaymentTransfer2 = com.paypal.oslo.core.network.graphql.RiskSourceId.P2P.INSTANCE.getExecutePaymentTransfer();
                        paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getInputFormats = executePaymentTransferInput2;
                        paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getInputSizeshNQ4ISI = function2;
                        paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getHighSpeedVideoSizesFor = atomicReference;
                        paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getOutputFormats = defaultRaise;
                        paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getOutputStallDuration = iorRaise;
                        paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getOutputMinFrameDurationlomOqCM = iorRaise;
                        paymentTransferRepositoryImpl$executePaymentTransferMutation$1.Camera2StreamConfigurationMap = 0;
                        paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getHighSpeedVideoFpsRanges = 0;
                        paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getHighSpeedVideoSizes = 0;
                        paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getHighSpeedVideoFpsRangesFor = 0;
                        paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getOutputStallDurationlomOqCM = 1;
                        java.lang.Object executeMutation = com.paypal.oslo.feature.p2p.data.ApolloClientExtensionsKt.executeMutation(apolloClient, executePaymentTransferMutation, executePaymentTransfer2, paymentTransferRepositoryImpl$executePaymentTransferMutation$1);
                        if (executeMutation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        atomicReference2 = atomicReference;
                        defaultRaise2 = defaultRaise;
                        iorRaise2 = iorRaise;
                        obj3 = executeMutation;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise2 = defaultRaise;
                        defaultRaise2.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getHighSpeedVideoSizes;
                    int i5 = paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getHighSpeedVideoFpsRanges;
                    int i6 = paymentTransferRepositoryImpl$executePaymentTransferMutation$1.Camera2StreamConfigurationMap;
                    arrow.core.raise.IorRaise iorRaise3 = (arrow.core.raise.IorRaise) paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getOutputMinFrameDurationlomOqCM;
                    iorRaise2 = (arrow.core.raise.IorRaise) paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getOutputStallDuration;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getOutputFormats;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getHighSpeedVideoSizesFor;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getInputSizeshNQ4ISI;
                    com.paypal.oslo.api.graphql.schema.type.ExecutePaymentTransferInput executePaymentTransferInput3 = (com.paypal.oslo.api.graphql.schema.type.ExecutePaymentTransferInput) paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getInputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj3);
                        iorRaise = iorRaise3;
                        executePaymentTransferInput2 = executePaymentTransferInput3;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        function2 = function22;
                        defaultRaise = defaultRaise2;
                        atomicReference = atomicReference2;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                            raisedOrRethrow2 = function2.invoke(obj, raisedOrRethrow2);
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow2);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise2.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                both = (arrow.core.Ior) obj3;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue();
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.EXECUTE_PAYMENT_TRANSFER_ERROR_NETWORK, kotlin.collections.MapsKt.plus(com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes(callError), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, executePaymentTransferInput2.getId()))), null, null, 12, null);
                    both = new arrow.core.Ior.Left(this.getHighSpeedVideoSizes.map(callError));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue();
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.EXECUTE_PAYMENT_TRANSFER_ERROR_NETWORK, kotlin.collections.MapsKt.plus(com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes(callError2), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, executePaymentTransferInput2.getId()))), null, null, 12, null);
                    both = new arrow.core.Ior.Both(this.getHighSpeedVideoSizes.map(callError2), ((arrow.core.Ior.Both) both).getRightValue());
                }
                com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
                obj2 = graphQLData.getExtensions().get("correlationId");
                if (obj2 != null || (str = obj2.toString()) == null) {
                    str = "none";
                }
                data = (com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.Data) graphQLData.getData();
                if (data != null || (executePaymentTransfer = data.getExecutePaymentTransfer()) == null) {
                    iorRaise2.raise(com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.NoData.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                kotlin.Pair pair = kotlin.TuplesKt.to(executePaymentTransfer, str);
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj4 = atomicReference2.get();
                return obj4 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(pair) : new arrow.core.Ior.Both(obj4, pair);
            }
        }
        paymentTransferRepositoryImpl$executePaymentTransferMutation$1 = new com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl$executePaymentTransferMutation$1(this, continuation);
        java.lang.Object obj32 = paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentTransferRepositoryImpl$executePaymentTransferMutation$1.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj32;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
        obj2 = graphQLData2.getExtensions().get("correlationId");
        if (obj2 != null) {
        }
        str = "none";
        data = (com.paypal.oslo.feature.p2p.graphql.ExecutePaymentTransferMutation.Data) graphQLData2.getData();
        if (data != null) {
        }
        iorRaise2.raise(com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.NoData.INSTANCE);
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError $r8$lambda$Gc6ledvPDFTaRHrmSzo42MqavU0(com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError executePaymentTransferError, com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError executePaymentTransferError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executePaymentTransferError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executePaymentTransferError2, "");
        return executePaymentTransferError;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError $r8$lambda$dqABMyRwHfvxTO3fkuG5lM39AyE(com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError executePaymentTransferError, com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError executePaymentTransferError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executePaymentTransferError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executePaymentTransferError2, "");
        return executePaymentTransferError;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError $r8$lambda$i4LaO9XJbuUcnbcTH3Lus0G6zI8(com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError executePaymentTransferError, com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError executePaymentTransferError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executePaymentTransferError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executePaymentTransferError2, "");
        return executePaymentTransferError;
    }
}
