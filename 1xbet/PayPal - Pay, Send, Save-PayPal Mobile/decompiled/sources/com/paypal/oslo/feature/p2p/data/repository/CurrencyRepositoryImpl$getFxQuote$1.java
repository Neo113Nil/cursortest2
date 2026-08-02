package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/FxQuoteError;", "Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getFxQuote$1", f = "CurrencyRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, l = {165, 255}, m = "invokeSuspend", n = {"$this$flow", "combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$invokeSuspend_u24lambda_u241", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-CurrencyRepositoryImpl$getFxQuote$1$result$2", "$this$flow", "result"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, 256}, s = {"L$0", "L$1", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class CurrencyRepositoryImpl$getFxQuote$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.FxQuoteError, ? extends com.paypal.oslo.feature.p2p.domain.model.FxQuote>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.CurrencyInput getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.CurrencyInput getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    int getInputFormats;
    int getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    private /* synthetic */ java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    int isOutputSupportedFor;
    java.lang.Object isOutputSupportedForhNQ4ISI;
    java.lang.Object toString;
    final /* synthetic */ com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl unwrapAs;

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.error.FxQuoteError getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.p2p.domain.error.FxQuoteError fxQuoteError) {
        return fxQuoteError;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(1:(1:(3:5|6|7)(2:9|10))(4:11|12|13|14))(13:88|(1:90)(1:123)|91|92|93|(6:109|110|111|112|113|(6:115|(1:108)(1:100)|101|102|(1:104)|37))(1:95)|96|(1:98)|108|101|102|(0)|37)|15|16|17|18|(4:20|21|(1:23)(2:46|(1:48)(2:49|50))|24)(2:51|(2:53|(6:55|56|(2:58|59)(2:61|(3:63|64|65)(2:67|68))|60|26|(4:39|(1:45)|43|44)(3:32|(1:34)(1:38)|35))(2:69|70)))|25|26|(1:28)|39|(1:41)|45|43|44|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x043f, code lost:
    
        if (r2.emit(r3, r31) == r4) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x024e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x03e3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x03e4, code lost:
    
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x03e9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x040f  */
    /* JADX WARN: Type inference failed for: r15v1, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.apollographql.apollo.ApolloClient] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl currencyRepositoryImpl;
        java.lang.String str;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.Object obj2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.IorRaise iorRaise;
        javax.inject.Provider provider;
        java.lang.Object obj3;
        com.apollographql.apollo.ApolloClient apolloClient;
        java.lang.Object obj4;
        java.lang.Object obj5;
        arrow.core.raise.IorRaise iorRaise2;
        com.apollographql.apollo.api.Optional.Present present;
        com.apollographql.apollo.api.Optional.Present present2;
        arrow.core.raise.IorRaise iorRaise3;
        java.lang.Object executeQuery;
        arrow.core.raise.IorRaise iorRaise4;
        arrow.core.raise.DefaultRaise defaultRaise3;
        com.apollographql.apollo.api.Optional.Present present3;
        ?? r15;
        java.lang.Object obj6;
        arrow.core.Ior.Left left;
        java.lang.Object obj7;
        java.lang.Object obj8;
        com.paypal.oslo.feature.p2p.domain.error.FxQuoteError.ApiError apiError;
        com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.Data data;
        java.lang.Object obj9;
        com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.PaymentTransferFxQuote paymentTransferFxQuote;
        com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.FxQuote fxQuote;
        com.paypal.oslo.feature.p2p.data.mapper.FxQuoteMapper fxQuoteMapper;
        com.paypal.oslo.feature.p2p.domain.error.FxQuoteError.ApiError apiError2;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getValidOutputFormatsForInputhNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.isOutputSupportedFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, this.getHighResolutionOutputSizeshNQ4ISI);
            pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TARGET_CURRENCY_CODE, this.Camera2StreamConfigurationMap);
            pairArr[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_AMOUNT_TYPE, this.getHighSpeedVideoFpsRangesFor != null ? "sender" : "receiver");
            com.paypal.android.logger.Logger.d$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_FX_QUOTE_REQUEST, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getFxQuote$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj10, java.lang.Object obj11) {
                    return com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getFxQuote$1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.p2p.domain.error.FxQuoteError) obj10);
                }
            };
            currencyRepositoryImpl = this.unwrapAs;
            str = this.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.p2p.domain.model.CurrencyInput currencyInput = this.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.p2p.domain.model.CurrencyInput currencyInput2 = this.getHighSpeedVideoFpsRanges;
            java.lang.String str2 = this.Camera2StreamConfigurationMap;
            atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
            defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                try {
                    defaultRaise2 = defaultRaise;
                    iorRaise = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise2);
                    provider = currencyRepositoryImpl.Camera2StreamConfigurationMap;
                    java.lang.Object obj10 = provider.get();
                    obj3 = "correlationId";
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj10, "");
                    apolloClient = (com.apollographql.apollo.ApolloClient) obj10;
                } catch (java.lang.Throwable th) {
                    th = th;
                    defaultRaise.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                }
            } catch (arrow.core.raise.RaiseCancellationException e) {
                e = e;
                obj2 = coroutine_suspended;
                r15 = function2;
            }
            if (currencyInput != null) {
                try {
                    com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                    obj5 = com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID;
                    obj4 = coroutine_suspended;
                    try {
                        obj = apolloClient;
                        iorRaise2 = iorRaise;
                        present = companion.present(new com.paypal.oslo.api.graphql.schema.type.CurrencyInput(com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.MoneyInput(currencyInput.getCurrencyCode(), currencyInput.getValue())), null, null, 6, null));
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        obj2 = obj4;
                        r15 = function2;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                        obj6 = atomicReference.get();
                        if (obj6 != arrow.core.EmptyValue.INSTANCE) {
                            raisedOrRethrow = r15.invoke(obj6, raisedOrRethrow);
                        }
                        left = new arrow.core.Ior.Left(raisedOrRethrow);
                        this.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                        this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
                        this.getOutputSizeshNQ4ISI = null;
                        this.getOutputMinFrameDurationlomOqCM = null;
                        this.getOutputSizes = null;
                        this.getOutputStallDuration = null;
                        this.getOutputStallDurationlomOqCM = null;
                        this.isOutputSupportedForhNQ4ISI = null;
                        this.toString = null;
                        this.isOutputSupportedFor = 2;
                    }
                } catch (arrow.core.raise.RaiseCancellationException e3) {
                    e = e3;
                    obj4 = coroutine_suspended;
                    obj2 = obj4;
                    r15 = function2;
                    defaultRaise.complete();
                    java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                    arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
                    obj6 = atomicReference.get();
                    if (obj6 != arrow.core.EmptyValue.INSTANCE) {
                    }
                    left = new arrow.core.Ior.Left(raisedOrRethrow2);
                    this.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
                    this.getOutputSizeshNQ4ISI = null;
                    this.getOutputMinFrameDurationlomOqCM = null;
                    this.getOutputSizes = null;
                    this.getOutputStallDuration = null;
                    this.getOutputStallDurationlomOqCM = null;
                    this.isOutputSupportedForhNQ4ISI = null;
                    this.toString = null;
                    this.isOutputSupportedFor = 2;
                }
                if (present != null) {
                    present2 = present;
                    com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery getPaymentTransferFxQuoteQuery = new com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery(str, present2, (currencyInput2 != null || (present3 = com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.CurrencyInput(com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.MoneyInput(currencyInput2.getCurrencyCode(), currencyInput2.getValue())), null, null, 6, null))) == null) ? com.apollographql.apollo.api.Optional.INSTANCE.absent() : present3, str2);
                    com.paypal.oslo.core.network.graphql.RiskSourceId getPaymentTransferFxQuote = com.paypal.oslo.core.network.graphql.RiskSourceId.P2P.INSTANCE.getGetPaymentTransferFxQuote();
                    this.getValidOutputFormatsForInputhNQ4ISI = flowCollector;
                    this.getOutputMinFrameDuration = function2;
                    this.getOutputSizeshNQ4ISI = currencyRepositoryImpl;
                    this.getOutputMinFrameDurationlomOqCM = str;
                    this.getOutputSizes = atomicReference;
                    this.getOutputStallDuration = defaultRaise;
                    this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                    iorRaise3 = iorRaise2;
                    this.isOutputSupportedForhNQ4ISI = iorRaise3;
                    this.toString = iorRaise3;
                    this.getHighSpeedVideoSizes = 0;
                    this.getHighSpeedVideoSizesFor = 0;
                    this.getInputSizeshNQ4ISI = 0;
                    this.getInputFormats = 0;
                    this.getOutputFormats = 0;
                    this.isOutputSupportedFor = 1;
                    executeQuery = com.paypal.oslo.feature.p2p.data.ApolloClientExtensionsKt.executeQuery(obj, getPaymentTransferFxQuoteQuery, getPaymentTransferFxQuote, this);
                    obj2 = obj4;
                    if (executeQuery != obj2) {
                        iorRaise4 = iorRaise3;
                        defaultRaise3 = defaultRaise;
                        obj7 = function2;
                    }
                    return obj2;
                }
            } else {
                obj4 = coroutine_suspended;
                obj5 = com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID;
                iorRaise2 = iorRaise;
                obj = apolloClient;
            }
            present2 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
            com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery getPaymentTransferFxQuoteQuery2 = new com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery(str, present2, (currencyInput2 != null || (present3 = com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.CurrencyInput(com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.MoneyInput(currencyInput2.getCurrencyCode(), currencyInput2.getValue())), null, null, 6, null))) == null) ? com.apollographql.apollo.api.Optional.INSTANCE.absent() : present3, str2);
            com.paypal.oslo.core.network.graphql.RiskSourceId getPaymentTransferFxQuote2 = com.paypal.oslo.core.network.graphql.RiskSourceId.P2P.INSTANCE.getGetPaymentTransferFxQuote();
            this.getValidOutputFormatsForInputhNQ4ISI = flowCollector;
            this.getOutputMinFrameDuration = function2;
            this.getOutputSizeshNQ4ISI = currencyRepositoryImpl;
            this.getOutputMinFrameDurationlomOqCM = str;
            this.getOutputSizes = atomicReference;
            this.getOutputStallDuration = defaultRaise;
            this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
            iorRaise3 = iorRaise2;
            this.isOutputSupportedForhNQ4ISI = iorRaise3;
            this.toString = iorRaise3;
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoSizesFor = 0;
            this.getInputSizeshNQ4ISI = 0;
            this.getInputFormats = 0;
            this.getOutputFormats = 0;
            this.isOutputSupportedFor = 1;
            executeQuery = com.paypal.oslo.feature.p2p.data.ApolloClientExtensionsKt.executeQuery(obj, getPaymentTransferFxQuoteQuery2, getPaymentTransferFxQuote2, this);
            obj2 = obj4;
            if (executeQuery != obj2) {
            }
            return obj2;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        arrow.core.raise.IorRaise iorRaise5 = (arrow.core.raise.IorRaise) this.toString;
        iorRaise4 = (arrow.core.raise.IorRaise) this.isOutputSupportedForhNQ4ISI;
        defaultRaise3 = (arrow.core.raise.DefaultRaise) this.getOutputStallDuration;
        atomicReference = (java.util.concurrent.atomic.AtomicReference) this.getOutputSizes;
        str = (java.lang.String) this.getOutputMinFrameDurationlomOqCM;
        currencyRepositoryImpl = (com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl) this.getOutputSizeshNQ4ISI;
        obj7 = (kotlin.jvm.functions.Function2) this.getOutputMinFrameDuration;
        try {
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                obj3 = "correlationId";
                obj5 = com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID;
                executeQuery = obj;
                obj2 = coroutine_suspended;
                iorRaise3 = iorRaise5;
                obj7 = obj7;
            } catch (arrow.core.raise.RaiseCancellationException e4) {
                e = e4;
                obj2 = coroutine_suspended;
                defaultRaise = defaultRaise3;
                r15 = obj7;
                defaultRaise.complete();
                java.lang.Object raisedOrRethrow22 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                arrow.core.EmptyValue emptyValue22 = arrow.core.EmptyValue.INSTANCE;
                obj6 = atomicReference.get();
                if (obj6 != arrow.core.EmptyValue.INSTANCE) {
                }
                left = new arrow.core.Ior.Left(raisedOrRethrow22);
                this.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
                this.getOutputSizeshNQ4ISI = null;
                this.getOutputMinFrameDurationlomOqCM = null;
                this.getOutputSizes = null;
                this.getOutputStallDuration = null;
                this.getOutputStallDurationlomOqCM = null;
                this.isOutputSupportedForhNQ4ISI = null;
                this.toString = null;
                this.isOutputSupportedFor = 2;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            defaultRaise = defaultRaise3;
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        arrow.core.Ior.Both both = (arrow.core.Ior) executeQuery;
        if (both instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue();
            if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                obj8 = obj5;
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_FX_QUOTE_ERROR_NETWORK, kotlin.collections.MapsKt.plus(com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes(callError), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj8, str))), null, 4, null);
                apiError2 = com.paypal.oslo.feature.p2p.domain.error.FxQuoteError.Network.INSTANCE;
            } else {
                obj8 = obj5;
                if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_FX_QUOTE_ERROR_GRAPHQL, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ERROR_COUNT, java.lang.String.valueOf(arrow.core.NonEmptyList.m9584getSizeimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()))), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FIRST_ERROR, ((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY())).getMessage()), kotlin.TuplesKt.to(obj8, str)), null, 4, null);
                apiError2 = new com.paypal.oslo.feature.p2p.domain.error.FxQuoteError.ApiError(((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY())).getMessage());
            }
            both = new arrow.core.Ior.Left(apiError2);
        } else {
            obj8 = obj5;
            if (!(both instanceof arrow.core.Ior.Right)) {
                if (!(both instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue();
                if (callError2 instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_FX_QUOTE_ERROR_NETWORK, kotlin.collections.MapsKt.plus(com.paypal.oslo.feature.p2p.logger.CallErrorLoggingUtilsKt.toLoggingAttributes(callError2), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj8, str))), null, 4, null);
                    apiError = com.paypal.oslo.feature.p2p.domain.error.FxQuoteError.Network.INSTANCE;
                } else {
                    if (!(callError2 instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_FX_QUOTE_ERROR_GRAPHQL, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ERROR_COUNT, java.lang.String.valueOf(arrow.core.NonEmptyList.m9584getSizeimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError2).m11659getErrors1X0FAY()))), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FIRST_ERROR, ((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError2).m11659getErrors1X0FAY())).getMessage()), kotlin.TuplesKt.to(obj8, str)), null, 4, null);
                    apiError = new com.paypal.oslo.feature.p2p.domain.error.FxQuoteError.ApiError(((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError2).m11659getErrors1X0FAY())).getMessage());
                }
                both = new arrow.core.Ior.Both(apiError, ((arrow.core.Ior.Both) both).getRightValue());
                com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise3.bind(both);
                data = (com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.Data) graphQLData.getData();
                if (data != null || (paymentTransferFxQuote = data.getPaymentTransferFxQuote()) == null || (fxQuote = paymentTransferFxQuote.getFxQuote()) == null) {
                    com.paypal.oslo.feature.p2p.domain.error.FxQuoteError.DataNotFound dataNotFound = com.paypal.oslo.feature.p2p.domain.error.FxQuoteError.DataNotFound.INSTANCE;
                    java.lang.Object obj11 = obj3;
                    obj9 = graphQLData.getExtensions().get(obj11);
                    if (obj9 != null || (r0 = obj9.toString()) == null) {
                        java.lang.String str3 = "none";
                    }
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_FX_QUOTE_ERROR_DATA_NOT_FOUND, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj11, str3), kotlin.TuplesKt.to(obj8, str)), null, null, 12, null);
                    iorRaise4.raise(dataNotFound);
                    throw new kotlin.KotlinNothingValueException();
                }
                fxQuoteMapper = currencyRepositoryImpl.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.p2p.domain.model.FxQuote map = fxQuoteMapper.map(fxQuote);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_FX_QUOTE_SUCCESS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj8, str), kotlin.TuplesKt.to("fxQuoteId", map.getFxQuoteId()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_FROM, map.getAmountFrom().getCurrencyCode()), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_TO, map.getAmountTo().getCurrencyCode())), null, 4, null);
                defaultRaise3.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj12 = atomicReference.get();
                left = obj12 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(map) : new arrow.core.Ior.Both(obj12, map);
                this.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(left);
                this.getOutputSizeshNQ4ISI = null;
                this.getOutputMinFrameDurationlomOqCM = null;
                this.getOutputSizes = null;
                this.getOutputStallDuration = null;
                this.getOutputStallDurationlomOqCM = null;
                this.isOutputSupportedForhNQ4ISI = null;
                this.toString = null;
                this.isOutputSupportedFor = 2;
            }
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise3.bind(both);
        data = (com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferFxQuoteQuery.Data) graphQLData2.getData();
        if (data != null) {
        }
        com.paypal.oslo.feature.p2p.domain.error.FxQuoteError.DataNotFound dataNotFound2 = com.paypal.oslo.feature.p2p.domain.error.FxQuoteError.DataNotFound.INSTANCE;
        java.lang.Object obj112 = obj3;
        obj9 = graphQLData2.getExtensions().get(obj112);
        if (obj9 != null) {
        }
        java.lang.String str32 = "none";
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_FX_QUOTE_ERROR_DATA_NOT_FOUND, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj112, str32), kotlin.TuplesKt.to(obj8, str)), null, null, 12, null);
        iorRaise4.raise(dataNotFound2);
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.FxQuoteError, ? extends com.paypal.oslo.feature.p2p.domain.model.FxQuote>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getFxQuote$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getFxQuote$1 currencyRepositoryImpl$getFxQuote$1 = new com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getFxQuote$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.unwrapAs, this.getHighSpeedVideoFpsRanges, continuation);
        currencyRepositoryImpl$getFxQuote$1.getValidOutputFormatsForInputhNQ4ISI = obj;
        return currencyRepositoryImpl$getFxQuote$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurrencyRepositoryImpl$getFxQuote$1(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.domain.model.CurrencyInput currencyInput, com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl currencyRepositoryImpl, com.paypal.oslo.feature.p2p.domain.model.CurrencyInput currencyInput2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getFxQuote$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRangesFor = currencyInput;
        this.unwrapAs = currencyRepositoryImpl;
        this.getHighSpeedVideoFpsRanges = currencyInput2;
    }
}
