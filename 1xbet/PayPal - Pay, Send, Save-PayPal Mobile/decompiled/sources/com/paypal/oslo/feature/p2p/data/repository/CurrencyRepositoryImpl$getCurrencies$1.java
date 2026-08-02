package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "", "", "Lcom/paypal/oslo/feature/p2p/domain/model/CurrencyItem;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getCurrencies$1", f = "CurrencyRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, l = {69, 104}, m = "invokeSuspend", n = {"$this$flow", "combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$invokeSuspend_u24lambda_u241", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-CurrencyRepositoryImpl$getCurrencies$1$result$2", "$this$flow", "result"}, nl = {73, 105}, s = {"L$0", "L$1", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class CurrencyRepositoryImpl$getCurrencies$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends java.lang.Throwable, ? extends java.util.List<? extends com.paypal.oslo.feature.p2p.domain.model.CurrencyItem>>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl getValidOutputFormatsForInputhNQ4ISI;
    private /* synthetic */ java.lang.Object isOutputSupportedForhNQ4ISI;

    public static /* synthetic */ java.lang.Throwable Camera2StreamConfigurationMap(java.lang.Throwable th) {
        return th;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0257, code lost:
    
        if (r0.emit(r2, r14) == r1) goto L79;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x020c: INVOKE (r5 I:arrow.core.raise.DefaultRaise) VIRTUAL call: arrow.core.raise.DefaultRaise.complete():boolean A[MD:():boolean (m)] (LINE:335), block:B:78:0x020c */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0215: INVOKE (r5 I:arrow.core.raise.DefaultRaise) VIRTUAL call: arrow.core.raise.DefaultRaise.complete():boolean A[MD:():boolean (m)] (LINE:326), block:B:73:0x0215 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0220: INVOKE (r2 I:java.lang.Object) = (r6 I:java.util.concurrent.atomic.AtomicReference) VIRTUAL call: java.util.concurrent.atomic.AtomicReference.get():java.lang.Object A[MD:():V (c)], block:B:73:0x0215 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0228: INVOKE (r15 I:java.lang.Object) = (r9 I:kotlin.jvm.functions.Function2), (r2 I:java.lang.Object), (r15 I:java.lang.Object) INTERFACE call: kotlin.jvm.functions.Function2.invoke(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(P1, P2):R (m)] (LINE:329), block:B:75:0x0228 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        arrow.core.raise.DefaultRaise complete;
        arrow.core.raise.DefaultRaise complete2;
        ?? r6;
        arrow.core.Ior.Left left;
        ?? invoke;
        com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl currencyRepositoryImpl;
        java.lang.String str;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        javax.inject.Provider provider;
        arrow.core.raise.IorRaise iorRaise;
        arrow.core.raise.IorRaise iorRaise2;
        java.lang.Throwable th;
        java.lang.String str2;
        com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.PaymentDestinations paymentDestinations;
        java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.SupportedDestination> supportedDestinations;
        com.paypal.oslo.feature.p2p.data.mapper.SupportedDestinationMapper supportedDestinationMapper;
        java.lang.Throwable th2;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.isOutputSupportedForhNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputStallDuration;
        try {
        } catch (arrow.core.raise.RaiseCancellationException e) {
            complete2.complete();
            java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, complete2);
            arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
            java.lang.Object obj2 = r6.get();
            if (obj2 != arrow.core.EmptyValue.INSTANCE) {
                raisedOrRethrow = invoke.invoke(obj2, raisedOrRethrow);
            }
            left = new arrow.core.Ior.Left(raisedOrRethrow);
        } catch (java.lang.Throwable th3) {
            complete.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th3);
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl currencyRepositoryImpl2 = this.getValidOutputFormatsForInputhNQ4ISI;
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_CURRENCIES_REQUEST, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, this.getHighSpeedVideoFpsRangesFor)), null, 4, null);
            kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getCurrencies$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getCurrencies$1.Camera2StreamConfigurationMap((java.lang.Throwable) obj3);
                }
            };
            currencyRepositoryImpl = this.getValidOutputFormatsForInputhNQ4ISI;
            str = this.getHighSpeedVideoFpsRangesFor;
            atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
            defaultRaise = new arrow.core.raise.DefaultRaise(false);
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise2);
            provider = currencyRepositoryImpl.Camera2StreamConfigurationMap;
            java.lang.Object obj3 = provider.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
            com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery getPaymentDestinationsQuery = new com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery(str);
            com.paypal.oslo.core.network.graphql.RiskSourceId getPaymentDestinationOptions = com.paypal.oslo.core.network.graphql.RiskSourceId.P2P.INSTANCE.getGetPaymentDestinationOptions();
            this.isOutputSupportedForhNQ4ISI = flowCollector;
            this.getInputFormats = function2;
            this.getInputSizeshNQ4ISI = currencyRepositoryImpl;
            this.getOutputFormats = str;
            this.getHighSpeedVideoSizesFor = atomicReference;
            this.getOutputSizes = defaultRaise;
            this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
            this.getOutputSizeshNQ4ISI = iorRaise3;
            this.getOutputMinFrameDurationlomOqCM = iorRaise3;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighSpeedVideoSizes = 0;
            this.getOutputMinFrameDuration = 0;
            this.getOutputStallDuration = 1;
            obj = com.paypal.oslo.feature.p2p.data.ApolloClientExtensionsKt.executeQuery((com.apollographql.apollo.ApolloClient) obj3, getPaymentDestinationsQuery, getPaymentDestinationOptions, this);
            if (obj != coroutine_suspended) {
                iorRaise = iorRaise3;
                iorRaise2 = iorRaise;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        iorRaise = (arrow.core.raise.IorRaise) this.getOutputMinFrameDurationlomOqCM;
        iorRaise2 = (arrow.core.raise.IorRaise) this.getOutputSizeshNQ4ISI;
        defaultRaise = (arrow.core.raise.DefaultRaise) this.getOutputSizes;
        atomicReference = (java.util.concurrent.atomic.AtomicReference) this.getHighSpeedVideoSizesFor;
        str = (java.lang.String) this.getOutputFormats;
        currencyRepositoryImpl = (com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl) this.getInputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        arrow.core.Ior.Both both = (arrow.core.Ior) obj;
        if (both instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue();
            if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
                if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_CURRENCIES_ERROR_GRAPHQL, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ERROR_COUNT, java.lang.String.valueOf(arrow.core.NonEmptyList.m9584getSizeimpl(r10.m11659getErrors1X0FAY()))), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FIRST_ERROR, ((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY())).getMessage()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, str)), null, 4, null);
                java.lang.String message = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY())).getMessage();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQL error: ");
                sb.append(message);
                th2 = new java.lang.Throwable(sb.toString());
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_CURRENCIES_ERROR_NETWORK, kotlin.collections.MapsKt.plus(com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, str))), null, 4, null);
                th2 = new java.lang.Throwable(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_CURRENCIES_ERROR_NETWORK);
            }
            both = new arrow.core.Ior.Left(th2);
        } else if (!(both instanceof arrow.core.Ior.Right)) {
            if (both instanceof arrow.core.Ior.Both) {
                com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue();
                if (!(callError2 instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
                    if (!(callError2 instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_CURRENCIES_ERROR_GRAPHQL, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ERROR_COUNT, java.lang.String.valueOf(arrow.core.NonEmptyList.m9584getSizeimpl(r12.m11659getErrors1X0FAY()))), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FIRST_ERROR, ((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError2).m11659getErrors1X0FAY())).getMessage()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, str)), null, 4, null);
                    java.lang.String message2 = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError2).m11659getErrors1X0FAY())).getMessage();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("GraphQL error: ");
                    sb2.append(message2);
                    th = new java.lang.Throwable(sb2.toString());
                } else {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_CURRENCIES_ERROR_NETWORK, kotlin.collections.MapsKt.plus(com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError2), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, str))), null, 4, null);
                    th = new java.lang.Throwable(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_CURRENCIES_ERROR_NETWORK);
                }
                both = new arrow.core.Ior.Both(th, ((arrow.core.Ior.Both) both).getRightValue());
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
        com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.Data data = (com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.Data) graphQLData.getData();
        if (data == null || (paymentDestinations = data.getPaymentDestinations()) == null || (supportedDestinations = paymentDestinations.getSupportedDestinations()) == null) {
            java.lang.Throwable th4 = new java.lang.Throwable("Payment destinations data not found");
            java.lang.Object obj4 = graphQLData.getExtensions().get("correlationId");
            if (obj4 == null || (str2 = obj4.toString()) == null) {
                str2 = "none";
            }
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_CURRENCIES_ERROR_DATA_NOT_FOUND, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("correlationId", str2), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, str)), null, null, 12, null);
            iorRaise2.raise(th4);
            throw new kotlin.KotlinNothingValueException();
        }
        java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.SupportedDestination> list = supportedDestinations;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (com.paypal.oslo.feature.p2p.graphql.GetPaymentDestinationsQuery.SupportedDestination supportedDestination : list) {
            supportedDestinationMapper = currencyRepositoryImpl.getHighSpeedVideoFpsRangesFor;
            arrayList.add(supportedDestinationMapper.map(supportedDestination));
        }
        java.util.ArrayList arrayList2 = arrayList;
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_CURRENCIES_SUCCESS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, str), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCIES_COUNT, java.lang.Integer.valueOf(arrayList2.size()))), null, 4, null);
        defaultRaise.complete();
        arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
        java.lang.Object obj5 = atomicReference.get();
        left = obj5 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(arrayList2) : new arrow.core.Ior.Both(obj5, arrayList2);
        this.isOutputSupportedForhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
        this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
        this.getInputSizeshNQ4ISI = null;
        this.getOutputFormats = null;
        this.getHighSpeedVideoSizesFor = null;
        this.getOutputSizes = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputSizeshNQ4ISI = null;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getOutputStallDuration = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends java.lang.Throwable, ? extends java.util.List<? extends com.paypal.oslo.feature.p2p.domain.model.CurrencyItem>>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getCurrencies$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getCurrencies$1 currencyRepositoryImpl$getCurrencies$1 = new com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getCurrencies$1(this.getValidOutputFormatsForInputhNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        currencyRepositoryImpl$getCurrencies$1.isOutputSupportedForhNQ4ISI = obj;
        return currencyRepositoryImpl$getCurrencies$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurrencyRepositoryImpl$getCurrencies$1(com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl currencyRepositoryImpl, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getCurrencies$1> continuation) {
        super(2, continuation);
        this.getValidOutputFormatsForInputhNQ4ISI = currencyRepositoryImpl;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
