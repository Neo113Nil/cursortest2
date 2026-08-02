package com.paypal.oslo.feature.wallet.preferred.data.repository.instore;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/wallet/preferred/data/repository/instore/InStorePaymentRepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/preferred/domain/repository/instore/InStorePaymentRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/preferred/domain/model/instore/InStorePaymentError;", "Lcom/paypal/oslo/feature/wallet/preferred/domain/model/instore/InStorePaymentPreference;", "getInStorePaymentData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/preferred/domain/model/instore/UpdateInStorePreferenceParams;", "params", "Larrow/core/Either;", "", "updatePaymentPreference", "(Lcom/paypal/oslo/feature/wallet/preferred/domain/model/instore/UpdateInStorePreferenceParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/wallet/graphql/UpdatePaymentPreferenceMutation$Data;", "p0", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;Lcom/paypal/oslo/core/network/graphql/error/CallError;)Larrow/core/Either;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class InStorePaymentRepositoryImpl implements com.paypal.oslo.feature.wallet.preferred.domain.repository.instore.InStorePaymentRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    @javax.inject.Inject
    public InStorePaymentRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoSizes = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4 A[Catch: all -> 0x004d, RaiseCancellationException -> 0x0050, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0050, all -> 0x004d, blocks: (B:11:0x0048, B:12:0x00be, B:15:0x00c4, B:16:0x0103, B:18:0x011a, B:21:0x0122, B:27:0x00e1, B:28:0x00fd, B:29:0x0102), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011a A[Catch: all -> 0x004d, RaiseCancellationException -> 0x0050, TryCatch #4 {RaiseCancellationException -> 0x0050, all -> 0x004d, blocks: (B:11:0x0048, B:12:0x00be, B:15:0x00c4, B:16:0x0103, B:18:0x011a, B:21:0x0122, B:27:0x00e1, B:28:0x00fd, B:29:0x0102), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0122 A[Catch: all -> 0x004d, RaiseCancellationException -> 0x0050, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0050, all -> 0x004d, blocks: (B:11:0x0048, B:12:0x00be, B:15:0x00c4, B:16:0x0103, B:18:0x011a, B:21:0x0122, B:27:0x00e1, B:28:0x00fd, B:29:0x0102), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.wallet.preferred.domain.repository.instore.InStorePaymentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getInStorePaymentData(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError, com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentPreference>> continuation) {
        com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl$getInStorePaymentData$1 inStorePaymentRepositoryImpl$getInStorePaymentData$1;
        int i;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        kotlin.jvm.functions.Function2 function2;
        arrow.core.raise.RaiseCancellationException e;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.IorRaise iorRaise;
        java.lang.Object obj;
        arrow.core.Ior.Both both;
        if (continuation instanceof com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl$getInStorePaymentData$1) {
            inStorePaymentRepositoryImpl$getInStorePaymentData$1 = (com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl$getInStorePaymentData$1) continuation;
            if ((inStorePaymentRepositoryImpl$getInStorePaymentData$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                inStorePaymentRepositoryImpl$getInStorePaymentData$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj2 = inStorePaymentRepositoryImpl$getInStorePaymentData$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inStorePaymentRepositoryImpl$getInStorePaymentData$1.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    kotlin.jvm.functions.Function2 function22 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl.$r8$lambda$5aguEAVwi0MuJbM8TZqpLP6J1N4((com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError) obj3, (com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise2 = new arrow.core.raise.IorRaise(function22, atomicReference, defaultRaise3);
                        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoSizes.query(new com.paypal.oslo.feature.wallet.graphql.GetEligiblePaymentMethodsQuery()), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        inStorePaymentRepositoryImpl$getInStorePaymentData$1.getInputFormats = function22;
                        inStorePaymentRepositoryImpl$getInStorePaymentData$1.getInputSizeshNQ4ISI = atomicReference;
                        inStorePaymentRepositoryImpl$getInStorePaymentData$1.getOutputFormats = defaultRaise;
                        inStorePaymentRepositoryImpl$getInStorePaymentData$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        inStorePaymentRepositoryImpl$getInStorePaymentData$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iorRaise2);
                        inStorePaymentRepositoryImpl$getInStorePaymentData$1.getOutputSizeshNQ4ISI = iorRaise2;
                        inStorePaymentRepositoryImpl$getInStorePaymentData$1.Camera2StreamConfigurationMap = 0;
                        inStorePaymentRepositoryImpl$getInStorePaymentData$1.getHighSpeedVideoFpsRanges = 0;
                        inStorePaymentRepositoryImpl$getInStorePaymentData$1.getHighSpeedVideoSizes = 0;
                        inStorePaymentRepositoryImpl$getInStorePaymentData$1.getHighSpeedVideoFpsRangesFor = 0;
                        inStorePaymentRepositoryImpl$getInStorePaymentData$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        inStorePaymentRepositoryImpl$getInStorePaymentData$1.getOutputStallDurationlomOqCM = 1;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, inStorePaymentRepositoryImpl$getInStorePaymentData$1, 2, null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        atomicReference2 = atomicReference;
                        defaultRaise2 = defaultRaise;
                        iorRaise = iorRaise2;
                        obj2 = execute$default;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        function2 = function22;
                        e = e2;
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
                    int i2 = inStorePaymentRepositoryImpl$getInStorePaymentData$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = inStorePaymentRepositoryImpl$getInStorePaymentData$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = inStorePaymentRepositoryImpl$getInStorePaymentData$1.getHighSpeedVideoSizes;
                    int i5 = inStorePaymentRepositoryImpl$getInStorePaymentData$1.getHighSpeedVideoFpsRanges;
                    int i6 = inStorePaymentRepositoryImpl$getInStorePaymentData$1.Camera2StreamConfigurationMap;
                    iorRaise = (arrow.core.raise.IorRaise) inStorePaymentRepositoryImpl$getInStorePaymentData$1.getOutputSizeshNQ4ISI;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) inStorePaymentRepositoryImpl$getInStorePaymentData$1.getOutputFormats;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) inStorePaymentRepositoryImpl$getInStorePaymentData$1.getInputSizeshNQ4ISI;
                    function2 = (kotlin.jvm.functions.Function2) inStorePaymentRepositoryImpl$getInStorePaymentData$1.getInputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                    } catch (arrow.core.raise.RaiseCancellationException e3) {
                        e = e3;
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
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                both = (arrow.core.Ior) obj2;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.wallet.preferred.data.repository.instore.CallErrorExtensionsKt.toInStorePaymentError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.wallet.preferred.data.repository.instore.CallErrorExtensionsKt.toInStorePaymentError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                }
                com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentPreference inStorePaymentPreference = com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentMapperKt.toInStorePaymentPreference((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both));
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference2.get();
                return obj3 != arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(inStorePaymentPreference) : new arrow.core.Ior.Both(obj3, inStorePaymentPreference);
            }
        }
        inStorePaymentRepositoryImpl$getInStorePaymentData$1 = new com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl$getInStorePaymentData$1(this, continuation);
        java.lang.Object obj22 = inStorePaymentRepositoryImpl$getInStorePaymentData$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inStorePaymentRepositoryImpl$getInStorePaymentData$1.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentPreference inStorePaymentPreference2 = com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentMapperKt.toInStorePaymentPreference((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both));
        defaultRaise2.complete();
        arrow.core.EmptyValue emptyValue32 = arrow.core.EmptyValue.INSTANCE;
        java.lang.Object obj32 = atomicReference2.get();
        if (obj32 != arrow.core.EmptyValue.INSTANCE) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.wallet.preferred.domain.repository.instore.InStorePaymentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updatePaymentPreference(com.paypal.oslo.feature.wallet.preferred.domain.model.instore.UpdateInStorePreferenceParams updateInStorePreferenceParams, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl$updatePaymentPreference$1 inStorePaymentRepositoryImpl$updatePaymentPreference$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl$updatePaymentPreference$1) {
            inStorePaymentRepositoryImpl$updatePaymentPreference$1 = (com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl$updatePaymentPreference$1) continuation;
            if ((inStorePaymentRepositoryImpl$updatePaymentPreference$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                inStorePaymentRepositoryImpl$updatePaymentPreference$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl$updatePaymentPreference$1 inStorePaymentRepositoryImpl$updatePaymentPreference$12 = inStorePaymentRepositoryImpl$updatePaymentPreference$1;
                java.lang.Object obj = inStorePaymentRepositoryImpl$updatePaymentPreference$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inStorePaymentRepositoryImpl$updatePaymentPreference$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.UpdatePaymentPreferenceInput updatePaymentPreferenceInput = new com.paypal.oslo.api.graphql.schema.type.UpdatePaymentPreferenceInput(updateInStorePreferenceParams.getFinancialInstrumentId(), com.paypal.oslo.api.graphql.schema.type.PaymentPreferenceType.INSTORE, com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(updateInStorePreferenceParams.getUseBalanceFirst())));
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.wallet.graphql.UpdatePaymentPreferenceMutation updatePaymentPreferenceMutation = new com.paypal.oslo.feature.wallet.graphql.UpdatePaymentPreferenceMutation(updatePaymentPreferenceInput);
                    inStorePaymentRepositoryImpl$updatePaymentPreference$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateInStorePreferenceParams);
                    inStorePaymentRepositoryImpl$updatePaymentPreference$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePaymentPreferenceInput);
                    inStorePaymentRepositoryImpl$updatePaymentPreference$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, updatePaymentPreferenceMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, inStorePaymentRepositoryImpl$updatePaymentPreference$12, 2, (java.lang.Object) null);
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
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.preferred.data.repository.instore.CallErrorExtensionsKt.toInStorePaymentError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (!(ior instanceof arrow.core.Ior.Right)) {
                    if (ior instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                        return getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue(), (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue());
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue(), null);
            }
        }
        inStorePaymentRepositoryImpl$updatePaymentPreference$1 = new com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl$updatePaymentPreference$1(this, continuation);
        com.paypal.oslo.feature.wallet.preferred.data.repository.instore.InStorePaymentRepositoryImpl$updatePaymentPreference$1 inStorePaymentRepositoryImpl$updatePaymentPreference$122 = inStorePaymentRepositoryImpl$updatePaymentPreference$1;
        java.lang.Object obj2 = inStorePaymentRepositoryImpl$updatePaymentPreference$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inStorePaymentRepositoryImpl$updatePaymentPreference$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static arrow.core.Either<com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError, java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.wallet.graphql.UpdatePaymentPreferenceMutation.Data> p0, com.paypal.oslo.core.network.graphql.error.CallError p1) {
        com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError.Business.SetPreferenceFailed setPreferenceFailed;
        com.paypal.oslo.feature.wallet.graphql.UpdatePaymentPreferenceMutation.UpdatePaymentPreference updatePaymentPreference;
        com.paypal.oslo.feature.wallet.graphql.UpdatePaymentPreferenceMutation.Data data = p0.getData();
        if (data != null && (updatePaymentPreference = data.getUpdatePaymentPreference()) != null && updatePaymentPreference.getSuccess()) {
            return arrow.core.EitherKt.right(java.lang.Boolean.TRUE);
        }
        if (p1 == null || (setPreferenceFailed = com.paypal.oslo.feature.wallet.preferred.data.repository.instore.CallErrorExtensionsKt.toInStorePaymentError(p1)) == null) {
            setPreferenceFailed = com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError.Business.SetPreferenceFailed.INSTANCE;
        }
        return arrow.core.EitherKt.left(setPreferenceFailed);
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError $r8$lambda$5aguEAVwi0MuJbM8TZqpLP6J1N4(com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError inStorePaymentError, com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentError inStorePaymentError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inStorePaymentError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inStorePaymentError2, "");
        return inStorePaymentError;
    }
}
