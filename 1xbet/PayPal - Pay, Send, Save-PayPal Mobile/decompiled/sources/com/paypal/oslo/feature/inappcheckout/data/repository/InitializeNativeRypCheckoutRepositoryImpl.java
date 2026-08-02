package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J<\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020 0\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0018\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u0014\u0010'\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u0014\u0010%\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010-"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/InitializeNativeRypCheckoutRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/InitializeNativeRypCheckoutRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "localeProvider", "Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;", "callErrorMapper", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/paypal/oslo/feature/inappcheckout/data/parser/InitializeNativeRypCheckoutParser;", "parser", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/paypal/oslo/feature/inappcheckout/data/parser/InitializeNativeRypCheckoutParser;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;)V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "tokenType", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InitializeNativeRypCheckoutResponseEntity;", "executeDirectCall", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "p2", "p3", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/InitializeNativeRypCheckoutMutation$Data;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/InitializeNativeRypCheckoutMutation$InitializeNativeRypCheckout;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/InitializeNativeRypCheckoutMutation$InitializeNativeRypCheckout;)Larrow/core/Either;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/inappcheckout/data/parser/InitializeNativeRypCheckoutParser;", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InitializeNativeRypCheckoutRepositoryImpl implements com.paypal.oslo.feature.inappcheckout.domain.repository.InitializeNativeRypCheckoutRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public InitializeNativeRypCheckoutRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider, com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper callErrorMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.inappcheckout.data.parser.InitializeNativeRypCheckoutParser initializeNativeRypCheckoutParser, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callErrorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeNativeRypCheckoutParser, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        this.getHighSpeedVideoSizes = apolloClient;
        this.Camera2StreamConfigurationMap = localeProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = callErrorMapper;
        this.getHighSpeedVideoFpsRanges = coroutineDispatcher;
        this.getHighSpeedVideoFpsRangesFor = initializeNativeRypCheckoutParser;
        this.getInputSizeshNQ4ISI = checkoutLogger;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.InitializeNativeRypCheckoutRepository
    public final java.lang.Object executeDirectCall(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRanges, new com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$executeDirectCall$2(this, str, str2, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cf A[Catch: all -> 0x0058, RaiseCancellationException -> 0x005b, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x005b, all -> 0x0058, blocks: (B:11:0x0054, B:12:0x00c5, B:15:0x00cf, B:16:0x00f6, B:21:0x00e9, B:22:0x0127, B:23:0x012c), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity>> continuation) {
        com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1 initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1) {
            initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1 = (com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1) continuation;
            if ((initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getOutputSizes -= 2147483648;
                java.lang.Object obj = initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.raise.DefaultRaise defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise2;
                        try {
                            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType valueOf = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalTokenType.valueOf(str2);
                            com.apollographql.apollo.ApolloCall addNativeCheckoutHeaders = com.paypal.oslo.feature.inappcheckout.data.utils.ApolloClientExtensionsKt.addNativeCheckoutHeaders(this.getHighSpeedVideoSizes.mutation(new com.paypal.oslo.feature.inappcheckout.graphql.checkout.InitializeNativeRypCheckoutMutation(str, valueOf, str3, str4)));
                            initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                            initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                            initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                            initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getOutputMinFrameDuration = defaultRaise2;
                            initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getHighSpeedVideoSizesFor = defaultRaise3;
                            initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(valueOf);
                            initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getOutputStallDurationlomOqCM = defaultRaise3;
                            initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getHighSpeedVideoFpsRangesFor = 0;
                            initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getHighSpeedVideoSizes = 0;
                            initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getHighSpeedVideoFpsRanges = 0;
                            initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getOutputSizes = 1;
                            obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(addNativeCheckoutHeaders, null, initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1, 2, null);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            defaultRaise = defaultRaise2;
                            raise = defaultRaise3;
                            raise2 = raise;
                        } catch (java.lang.IllegalArgumentException unused) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid token type: ");
                            sb.append(str2);
                            defaultRaise3.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_TOKEN_TYPE", sb.toString(), false, null, null, 24, null));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getHighSpeedVideoFpsRanges;
                    int i3 = initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getHighSpeedVideoSizes;
                    int i4 = initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getHighSpeedVideoFpsRangesFor;
                    raise = (arrow.core.raise.Raise) initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getOutputStallDurationlomOqCM;
                    raise2 = (arrow.core.raise.Raise) initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getHighSpeedVideoSizesFor;
                    defaultRaise = (arrow.core.raise.DefaultRaise) initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getOutputMinFrameDuration;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper.map$default(this.getHighResolutionOutputSizeshNQ4ISI, (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue(), null, 2, null));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity initializeNativeRypCheckoutResponseEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity) raise2.bind(this.getHighSpeedVideoFpsRangesFor.parse((java.lang.String) raise2.bind(Camera2StreamConfigurationMap((com.paypal.oslo.feature.inappcheckout.graphql.checkout.InitializeNativeRypCheckoutMutation.InitializeNativeRypCheckout) raise2.bind(getHighSpeedVideoSizes((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right)))))));
                defaultRaise.complete();
                return new arrow.core.Either.Right(initializeNativeRypCheckoutResponseEntity);
            }
        }
        initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1 = new com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1(this, continuation);
        java.lang.Object obj2 = initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1.getOutputSizes;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity initializeNativeRypCheckoutResponseEntity2 = (com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity) raise2.bind(this.getHighSpeedVideoFpsRangesFor.parse((java.lang.String) raise2.bind(Camera2StreamConfigurationMap((com.paypal.oslo.feature.inappcheckout.graphql.checkout.InitializeNativeRypCheckoutMutation.InitializeNativeRypCheckout) raise2.bind(getHighSpeedVideoSizes((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right)))))));
        defaultRaise.complete();
        return new arrow.core.Either.Right(initializeNativeRypCheckoutResponseEntity2);
    }

    private static arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.graphql.checkout.InitializeNativeRypCheckoutMutation.InitializeNativeRypCheckout> getHighSpeedVideoSizes(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.inappcheckout.graphql.checkout.InitializeNativeRypCheckoutMutation.Data> p0) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.InitializeNativeRypCheckoutMutation.Data data = p0.getData();
            if (data == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("EMPTY_RESPONSE", com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.NULL_RESPONSE_DATA, false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.InitializeNativeRypCheckoutMutation.External external = data.getExternal();
            if (external == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "External field is null", false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.InitializeNativeRypCheckoutMutation.InitializeNativeRypCheckout initializeNativeRypCheckout = external.getInitializeNativeRypCheckout();
            if (initializeNativeRypCheckout == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "InitializeNativeRypCheckout field is null", false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise.complete();
            return new arrow.core.Either.Right(initializeNativeRypCheckout);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    private final arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, java.lang.String> Camera2StreamConfigurationMap(com.paypal.oslo.feature.inappcheckout.graphql.checkout.InitializeNativeRypCheckoutMutation.InitializeNativeRypCheckout p0) {
        java.lang.String str;
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.lang.String str2 = p0.get__typename();
            if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "externalInitializeNativeRypCheckoutSuccessResponse")) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.InitializeNativeRypCheckoutMutation.OnExternalInitializeNativeRypCheckoutSuccessResponse onExternalInitializeNativeRypCheckoutSuccessResponse = p0.getOnExternalInitializeNativeRypCheckoutSuccessResponse();
                if (onExternalInitializeNativeRypCheckoutSuccessResponse == null) {
                    defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "Success response is null despite __typename indicating success", false, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getInputSizeshNQ4ISI, "Successfully fetched InitializeNativeRypCheckout data", null, null, 6, null);
                java.lang.String rawJson = onExternalInitializeNativeRypCheckoutSuccessResponse.getRawJson();
                defaultRaise.complete();
                return new arrow.core.Either.Right(rawJson);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "externalInitializeNativeRypCheckoutErrorResponse")) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.InitializeNativeRypCheckoutMutation.OnExternalInitializeNativeRypCheckoutErrorResponse onExternalInitializeNativeRypCheckoutErrorResponse = p0.getOnExternalInitializeNativeRypCheckoutErrorResponse();
                if (onExternalInitializeNativeRypCheckoutErrorResponse == null) {
                    defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "Error response is null despite __typename indicating error", false, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.InitializeNativeRypCheckoutMutation.Error error = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.InitializeNativeRypCheckoutMutation.Error) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) onExternalInitializeNativeRypCheckoutErrorResponse.getErrors());
                if (error == null || (str = error.getName()) == null) {
                    str = "UNKNOWN_ERROR";
                }
                java.lang.String str3 = str;
                java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(onExternalInitializeNativeRypCheckoutErrorResponse.getErrors(), ", ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl.$r8$lambda$Udo6O9WWSJqLQv0MOiHfNsJgT3Y((com.paypal.oslo.feature.inappcheckout.graphql.checkout.InitializeNativeRypCheckoutMutation.Error) obj);
                    }
                }, 30, null);
                com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getInputSizeshNQ4ISI, "InitializeNativeRypCheckout fetch returned errors", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, joinToString$default)), null, 4, null);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializeNativeRypCheckout errors: ");
                sb.append(joinToString$default);
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(str3, sb.toString(), true, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getInputSizeshNQ4ISI, "Unknown response type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, p0.get__typename())), null, 4, null);
            java.lang.String str4 = p0.get__typename();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown response type: ");
            sb2.append(str4);
            defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("UNKNOWN_RESPONSE_TYPE", sb2.toString(), false, null, null, 24, null));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$Udo6O9WWSJqLQv0MOiHfNsJgT3Y(com.paypal.oslo.feature.inappcheckout.graphql.checkout.InitializeNativeRypCheckoutMutation.Error error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        return error.getName();
    }
}
