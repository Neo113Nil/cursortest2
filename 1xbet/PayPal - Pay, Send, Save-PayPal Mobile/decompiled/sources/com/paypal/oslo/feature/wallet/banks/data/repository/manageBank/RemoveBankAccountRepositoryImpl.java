package com.paypal.oslo.feature.wallet.banks.data.repository.manageBank;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/data/repository/manageBank/RemoveBankAccountRepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/manageBank/RemoveBankAccountRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/manageBank/RemoveBankAccountParams;", "params", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/manageBank/RemoveBankAccountError;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/manageBank/RemoveBankAccountResult;", "removeBankAccount", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/manageBank/RemoveBankAccountParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/ApolloClient;", "getApolloClient", "()Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RemoveBankAccountRepositoryImpl implements com.paypal.oslo.feature.wallet.banks.domain.repository.manageBank.RemoveBankAccountRepository {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient apolloClient;

    @javax.inject.Inject
    public RemoveBankAccountRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.apolloClient = apolloClient;
    }

    public final com.apollographql.apollo.ApolloClient getApolloClient() {
        return this.apolloClient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x011f A[Catch: all -> 0x005e, RaiseCancellationException -> 0x0061, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0061, all -> 0x005e, blocks: (B:11:0x0058, B:13:0x0119, B:16:0x011f, B:17:0x015e, B:19:0x016c, B:21:0x0172, B:23:0x017a, B:25:0x01a5, B:28:0x01ad, B:30:0x01b5, B:31:0x01ca, B:37:0x013c, B:38:0x0158, B:39:0x015d), top: B:10:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x017a A[Catch: all -> 0x005e, RaiseCancellationException -> 0x0061, TryCatch #3 {RaiseCancellationException -> 0x0061, all -> 0x005e, blocks: (B:11:0x0058, B:13:0x0119, B:16:0x011f, B:17:0x015e, B:19:0x016c, B:21:0x0172, B:23:0x017a, B:25:0x01a5, B:28:0x01ad, B:30:0x01b5, B:31:0x01ca, B:37:0x013c, B:38:0x0158, B:39:0x015d), top: B:10:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b5 A[Catch: all -> 0x005e, RaiseCancellationException -> 0x0061, TryCatch #3 {RaiseCancellationException -> 0x0061, all -> 0x005e, blocks: (B:11:0x0058, B:13:0x0119, B:16:0x011f, B:17:0x015e, B:19:0x016c, B:21:0x0172, B:23:0x017a, B:25:0x01a5, B:28:0x01ad, B:30:0x01b5, B:31:0x01ca, B:37:0x013c, B:38:0x0158, B:39:0x015d), top: B:10:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.paypal.oslo.feature.wallet.banks.domain.repository.manageBank.RemoveBankAccountRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object removeBankAccount(com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountParams removeBankAccountParams, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError, com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountResult>> continuation) {
        com.paypal.oslo.feature.wallet.banks.data.repository.manageBank.RemoveBankAccountRepositoryImpl$removeBankAccount$1 removeBankAccountRepositoryImpl$removeBankAccount$1;
        int i;
        kotlin.jvm.functions.Function2 function2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.Boolean bool;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.IorRaise iorRaise;
        arrow.core.raise.IorRaise iorRaise2;
        java.lang.Object obj;
        arrow.core.Ior.Both both;
        java.lang.Boolean success;
        com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.RemoveBankAccount removeBankAccount;
        if (continuation instanceof com.paypal.oslo.feature.wallet.banks.data.repository.manageBank.RemoveBankAccountRepositoryImpl$removeBankAccount$1) {
            removeBankAccountRepositoryImpl$removeBankAccount$1 = (com.paypal.oslo.feature.wallet.banks.data.repository.manageBank.RemoveBankAccountRepositoryImpl$removeBankAccount$1) continuation;
            if ((removeBankAccountRepositoryImpl$removeBankAccount$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                removeBankAccountRepositoryImpl$removeBankAccount$1.getOutputSizes -= 2147483648;
                java.lang.Object obj2 = removeBankAccountRepositoryImpl$removeBankAccount$1.isOutputSupportedForhNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = removeBankAccountRepositoryImpl$removeBankAccount$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.data.repository.manageBank.RemoveBankAccountRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.banks.data.repository.manageBank.RemoveBankAccountRepositoryImpl.$r8$lambda$Bca9aQkdvomZYl0xiaeGTXcmCAQ((com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError) obj3, (com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        com.paypal.oslo.api.graphql.schema.type.RemoveBankAccountInput removeBankAccountInput = new com.paypal.oslo.api.graphql.schema.type.RemoveBankAccountInput(removeBankAccountParams.getBankAccountId());
                        com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation removeBankAccountMutation = new com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation(removeBankAccountInput);
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Remove Bank Initiated.", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankAccountId", removeBankAccountParams.getBankAccountId())), 2, null);
                        bool = null;
                        com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("remove_bank_account", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
                        removeBankAccountRepositoryImpl$removeBankAccount$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(removeBankAccountParams);
                        removeBankAccountRepositoryImpl$removeBankAccount$1.getInputSizeshNQ4ISI = function2;
                        removeBankAccountRepositoryImpl$removeBankAccount$1.getHighSpeedVideoSizesFor = atomicReference;
                        removeBankAccountRepositoryImpl$removeBankAccount$1.getOutputFormats = defaultRaise;
                        removeBankAccountRepositoryImpl$removeBankAccount$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        removeBankAccountRepositoryImpl$removeBankAccount$1.getOutputMinFrameDurationlomOqCM = iorRaise3;
                        removeBankAccountRepositoryImpl$removeBankAccount$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(removeBankAccountInput);
                        removeBankAccountRepositoryImpl$removeBankAccount$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(removeBankAccountMutation);
                        removeBankAccountRepositoryImpl$removeBankAccount$1.getOutputStallDurationlomOqCM = iorRaise3;
                        removeBankAccountRepositoryImpl$removeBankAccount$1.getHighSpeedVideoSizes = 0;
                        removeBankAccountRepositoryImpl$removeBankAccount$1.Camera2StreamConfigurationMap = 0;
                        removeBankAccountRepositoryImpl$removeBankAccount$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        removeBankAccountRepositoryImpl$removeBankAccount$1.getHighSpeedVideoFpsRangesFor = 0;
                        removeBankAccountRepositoryImpl$removeBankAccount$1.getHighSpeedVideoFpsRanges = 0;
                        removeBankAccountRepositoryImpl$removeBankAccount$1.getOutputSizes = 1;
                        obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.apolloClient, removeBankAccountMutation, callConfig, removeBankAccountRepositoryImpl$removeBankAccount$1);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        iorRaise = iorRaise3;
                        iorRaise2 = iorRaise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                            raisedOrRethrow = function2.invoke(obj, raisedOrRethrow);
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
                    int i2 = removeBankAccountRepositoryImpl$removeBankAccount$1.getHighSpeedVideoFpsRanges;
                    int i3 = removeBankAccountRepositoryImpl$removeBankAccount$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = removeBankAccountRepositoryImpl$removeBankAccount$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = removeBankAccountRepositoryImpl$removeBankAccount$1.Camera2StreamConfigurationMap;
                    int i6 = removeBankAccountRepositoryImpl$removeBankAccount$1.getHighSpeedVideoSizes;
                    iorRaise = (arrow.core.raise.IorRaise) removeBankAccountRepositoryImpl$removeBankAccount$1.getOutputStallDurationlomOqCM;
                    iorRaise2 = (arrow.core.raise.IorRaise) removeBankAccountRepositoryImpl$removeBankAccount$1.getOutputMinFrameDurationlomOqCM;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) removeBankAccountRepositoryImpl$removeBankAccount$1.getOutputFormats;
                    atomicReference = (java.util.concurrent.atomic.AtomicReference) removeBankAccountRepositoryImpl$removeBankAccount$1.getHighSpeedVideoSizesFor;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) removeBankAccountRepositoryImpl$removeBankAccount$1.getInputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        bool = null;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        function2 = function22;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                        arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
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
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.wallet.banks.data.repository.manageBank.RemoveBankAccountRepositoryImplKt.toRemoveBankAccountError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.wallet.banks.data.repository.manageBank.RemoveBankAccountRepositoryImplKt.toRemoveBankAccountError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                }
                com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.Data data = (com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both)).getData();
                success = (data != null || (removeBankAccount = data.getRemoveBankAccount()) == null) ? bool : removeBankAccount.getSuccess();
                if (success != null) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "No Data from server was Available for remove bank account.", null, null, 6, null);
                    iorRaise2.raise(com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError.Business.NoDataAvailable.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Remove Bank Call Finished!", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("wasSuccessfullyRemoved", success)), null, 4, null);
                com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountResult removeBankAccountResult = new com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountResult(success.booleanValue());
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference.get();
                return obj3 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(removeBankAccountResult) : new arrow.core.Ior.Both(obj3, removeBankAccountResult);
            }
        }
        removeBankAccountRepositoryImpl$removeBankAccount$1 = new com.paypal.oslo.feature.wallet.banks.data.repository.manageBank.RemoveBankAccountRepositoryImpl$removeBankAccount$1(this, continuation);
        java.lang.Object obj22 = removeBankAccountRepositoryImpl$removeBankAccount$1.isOutputSupportedForhNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = removeBankAccountRepositoryImpl$removeBankAccount$1.getOutputSizes;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.Data data2 = (com.paypal.oslo.feature.wallet.graphql.RemoveBankAccountMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both)).getData();
        if (data2 != null) {
        }
        if (success != null) {
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError $r8$lambda$Bca9aQkdvomZYl0xiaeGTXcmCAQ(com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError removeBankAccountError, com.paypal.oslo.feature.wallet.banks.domain.model.manageBank.RemoveBankAccountError removeBankAccountError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeBankAccountError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeBankAccountError2, "");
        return removeBankAccountError;
    }
}
