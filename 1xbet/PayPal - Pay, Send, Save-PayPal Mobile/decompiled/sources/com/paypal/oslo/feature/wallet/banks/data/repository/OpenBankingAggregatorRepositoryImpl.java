package com.paypal.oslo.feature.wallet.banks.data.repository;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/data/repository/OpenBankingAggregatorRepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/OpenBankingAggregatorRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorParams;", "params", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorError;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorResult;", "getOpenBankingAggregator", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OpenBankingAggregatorRepositoryImpl implements com.paypal.oslo.feature.wallet.banks.domain.repository.OpenBankingAggregatorRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public OpenBankingAggregatorRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x01f3: INVOKE (r1 I:java.lang.Object) = (r10 I:java.util.concurrent.atomic.AtomicReference) VIRTUAL call: java.util.concurrent.atomic.AtomicReference.get():java.lang.Object A[MD:():V (c)], block:B:46:0x01e8 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01fb: INVOKE (r0 I:java.lang.Object) = (r11 I:kotlin.jvm.functions.Function2), (r1 I:java.lang.Object), (r0 I:java.lang.Object) INTERFACE call: kotlin.jvm.functions.Function2.invoke(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(P1, P2):R (m)] (LINE:205), block:B:48:0x01fb */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x01df: INVOKE (r9 I:arrow.core.raise.DefaultRaise) VIRTUAL call: arrow.core.raise.DefaultRaise.complete():boolean A[MD:():boolean (m)] (LINE:211), block:B:52:0x01df */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x01e8: INVOKE (r9 I:arrow.core.raise.DefaultRaise) VIRTUAL call: arrow.core.raise.DefaultRaise.complete():boolean A[MD:():boolean (m)] (LINE:202), block:B:46:0x01e8 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x012a A[Catch: all -> 0x01de, RaiseCancellationException -> 0x01e7, TRY_ENTER, TRY_LEAVE, TryCatch #2 {RaiseCancellationException -> 0x01e7, all -> 0x01de, blocks: (B:11:0x005a, B:13:0x0124, B:16:0x012a, B:17:0x0169, B:19:0x0177, B:21:0x017f, B:23:0x01c3, B:26:0x01cb, B:28:0x01d3, B:29:0x01dd, B:35:0x0147, B:36:0x0163, B:37:0x0168, B:41:0x007c), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0177 A[Catch: all -> 0x01de, RaiseCancellationException -> 0x01e7, TryCatch #2 {RaiseCancellationException -> 0x01e7, all -> 0x01de, blocks: (B:11:0x005a, B:13:0x0124, B:16:0x012a, B:17:0x0169, B:19:0x0177, B:21:0x017f, B:23:0x01c3, B:26:0x01cb, B:28:0x01d3, B:29:0x01dd, B:35:0x0147, B:36:0x0163, B:37:0x0168, B:41:0x007c), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x017f A[Catch: all -> 0x01de, RaiseCancellationException -> 0x01e7, TryCatch #2 {RaiseCancellationException -> 0x01e7, all -> 0x01de, blocks: (B:11:0x005a, B:13:0x0124, B:16:0x012a, B:17:0x0169, B:19:0x0177, B:21:0x017f, B:23:0x01c3, B:26:0x01cb, B:28:0x01d3, B:29:0x01dd, B:35:0x0147, B:36:0x0163, B:37:0x0168, B:41:0x007c), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d3 A[Catch: all -> 0x01de, RaiseCancellationException -> 0x01e7, TryCatch #2 {RaiseCancellationException -> 0x01e7, all -> 0x01de, blocks: (B:11:0x005a, B:13:0x0124, B:16:0x012a, B:17:0x0169, B:19:0x0177, B:21:0x017f, B:23:0x01c3, B:26:0x01cb, B:28:0x01d3, B:29:0x01dd, B:35:0x0147, B:36:0x0163, B:37:0x0168, B:41:0x007c), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.functions.Function2] */
    @Override // com.paypal.oslo.feature.wallet.banks.domain.repository.OpenBankingAggregatorRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getOpenBankingAggregator(com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorParams openBankingAggregatorParams, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError, com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult>> continuation) {
        com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1 openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1;
        int i;
        arrow.core.raise.DefaultRaise complete;
        arrow.core.raise.DefaultRaise complete2;
        ?? r10;
        ?? invoke;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.IorRaise iorRaise;
        com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator openBankingAggregator;
        arrow.core.raise.IorRaise iorRaise2;
        arrow.core.Ior.Both both;
        com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator openBankingAggregator2;
        try {
            if (continuation instanceof com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1) {
                openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1 = (com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1) continuation;
                if ((openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                    openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getOutputSizes -= 2147483648;
                    java.lang.Object obj = openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getValidOutputFormatsForInputhNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getOutputSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImpl$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImpl.$r8$lambda$JOn1nb6WPZF4DIDi2hI2iq38zUY((com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError) obj2, (com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError) obj3);
                            }
                        };
                        atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        iorRaise = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise2);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Fetching open banking aggregator", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("productFlow", java.lang.String.valueOf(openBankingAggregatorParams.getProductFlow())), kotlin.TuplesKt.to("excludeAggregator", openBankingAggregatorParams.getExcludeAggregators().toString())), null, 4, null);
                        com.paypal.oslo.api.graphql.schema.type.OpenBankingAggregatorInput graphQL = com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.toGraphQL(openBankingAggregatorParams);
                        com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery getOpenBankingAggregatorQuery = new com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery(graphQL);
                        openBankingAggregator = null;
                        com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("get_open_banking_aggregator", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, null);
                        openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(openBankingAggregatorParams);
                        openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getHighSpeedVideoSizesFor = function2;
                        openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getOutputMinFrameDuration = atomicReference;
                        openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getInputFormats = defaultRaise;
                        openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                        openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getOutputMinFrameDurationlomOqCM = iorRaise;
                        openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQL);
                        openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getOpenBankingAggregatorQuery);
                        openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getOutputSizeshNQ4ISI = iorRaise;
                        openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.Camera2StreamConfigurationMap = 0;
                        openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getHighSpeedVideoFpsRanges = 0;
                        openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getHighSpeedVideoSizes = 0;
                        openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getHighSpeedVideoFpsRangesFor = 0;
                        openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getOutputSizes = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.getHighSpeedVideoFpsRanges, getOpenBankingAggregatorQuery, callConfig, openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        iorRaise2 = iorRaise;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getHighSpeedVideoFpsRangesFor;
                        int i3 = openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i4 = openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getHighSpeedVideoSizes;
                        int i5 = openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getHighSpeedVideoFpsRanges;
                        int i6 = openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.Camera2StreamConfigurationMap;
                        iorRaise2 = (arrow.core.raise.IorRaise) openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getOutputSizeshNQ4ISI;
                        iorRaise = (arrow.core.raise.IorRaise) openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getOutputMinFrameDurationlomOqCM;
                        defaultRaise = (arrow.core.raise.DefaultRaise) openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getInputFormats;
                        atomicReference = (java.util.concurrent.atomic.AtomicReference) openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getOutputMinFrameDuration;
                        kotlin.ResultKt.throwOnFailure(obj);
                        openBankingAggregator = null;
                    }
                    both = (arrow.core.Ior) obj;
                    if (!(both instanceof arrow.core.Ior.Left)) {
                        both = new arrow.core.Ior.Left(com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.toOpenBankingAggregatorError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                    } else if (!(both instanceof arrow.core.Ior.Right)) {
                        if (!(both instanceof arrow.core.Ior.Both)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        both = new arrow.core.Ior.Both(com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.toOpenBankingAggregatorError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                    }
                    com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.Data data = (com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise2.bind(both)).getData();
                    openBankingAggregator2 = data == null ? data.getOpenBankingAggregator() : openBankingAggregator;
                    if (openBankingAggregator2 != null) {
                        iorRaise.raise(com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError.Business.MissingAggregator.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult openBankingAggregatorResult = com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.toOpenBankingAggregatorResult(openBankingAggregator2);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Successfully fetched aggregator", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("aggregator", openBankingAggregatorResult.getAggregator().toString()), kotlin.TuplesKt.to("operationMode", openBankingAggregatorResult.getOperationMode().toString())), null, 4, null);
                    defaultRaise.complete();
                    arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                    java.lang.Object obj2 = atomicReference.get();
                    return obj2 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(openBankingAggregatorResult) : new arrow.core.Ior.Both(obj2, openBankingAggregatorResult);
                }
            }
            if (i != 0) {
            }
            both = (arrow.core.Ior) obj;
            if (!(both instanceof arrow.core.Ior.Left)) {
            }
            com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.Data data2 = (com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise2.bind(both)).getData();
            if (data2 == null) {
            }
            if (openBankingAggregator2 != null) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e) {
            complete2.complete();
            java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, complete2);
            arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
            java.lang.Object obj3 = r10.get();
            if (obj3 != arrow.core.EmptyValue.INSTANCE) {
                raisedOrRethrow = invoke.invoke(obj3, raisedOrRethrow);
            }
            return new arrow.core.Ior.Left(raisedOrRethrow);
        } catch (java.lang.Throwable th) {
            complete.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1 = new com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1(this, continuation);
        java.lang.Object obj4 = openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getValidOutputFormatsForInputhNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = openBankingAggregatorRepositoryImpl$getOpenBankingAggregator$1.getOutputSizes;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError $r8$lambda$JOn1nb6WPZF4DIDi2hI2iq38zUY(com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError openBankingAggregatorError, com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError openBankingAggregatorError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openBankingAggregatorError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openBankingAggregatorError2, "");
        return openBankingAggregatorError;
    }
}
