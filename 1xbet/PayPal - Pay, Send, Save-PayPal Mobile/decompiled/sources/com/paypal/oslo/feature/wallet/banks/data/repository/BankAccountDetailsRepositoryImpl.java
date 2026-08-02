package com.paypal.oslo.feature.wallet.banks.data.repository;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00160\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/data/repository/BankAccountDetailsRepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/BankAccountDetailsRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/wallet/banks/data/mapper/BankAccountDetailsMapper;", "dataMapper", "Lcom/paypal/oslo/feature/wallet/banks/data/mapper/BankAccountDetailsErrorMapper;", "errorMapper", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/wallet/banks/data/mapper/BankAccountDetailsMapper;Lcom/paypal/oslo/feature/wallet/banks/data/mapper/BankAccountDetailsErrorMapper;)V", "", "id", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetailsError;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "getBankAccountDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Lcom/paypal/oslo/core/network/graphql/CallConfig;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Lcom/paypal/oslo/core/network/graphql/CallConfig;", "nickname", "", "updateBankAccountNickname", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/wallet/banks/data/mapper/BankAccountDetailsMapper;", "Lcom/paypal/oslo/feature/wallet/banks/data/mapper/BankAccountDetailsErrorMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankAccountDetailsRepositoryImpl implements com.paypal.oslo.feature.wallet.banks.domain.repository.BankAccountDetailsRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsErrorMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public BankAccountDetailsRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper bankAccountDetailsMapper, com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsErrorMapper bankAccountDetailsErrorMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountDetailsMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountDetailsErrorMapper, "");
        this.getHighSpeedVideoSizes = apolloClient;
        this.getHighResolutionOutputSizeshNQ4ISI = bankAccountDetailsMapper;
        this.getHighSpeedVideoFpsRangesFor = bankAccountDetailsErrorMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.paypal.oslo.feature.wallet.banks.domain.repository.BankAccountDetailsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getBankAccountDetails(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError, com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails>> continuation) {
        com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl$getBankAccountDetails$1 bankAccountDetailsRepositoryImpl$getBankAccountDetails$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount bankAccount;
        java.lang.String str2 = str;
        if (continuation instanceof com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl$getBankAccountDetails$1) {
            bankAccountDetailsRepositoryImpl$getBankAccountDetails$1 = (com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl$getBankAccountDetails$1) continuation;
            if ((bankAccountDetailsRepositoryImpl$getBankAccountDetails$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                bankAccountDetailsRepositoryImpl$getBankAccountDetails$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = bankAccountDetailsRepositoryImpl$getBankAccountDetails$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bankAccountDetailsRepositoryImpl$getBankAccountDetails$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Fetching bank account details", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankAccountId", str2)), 2, null);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery getBankAccountQuery = new com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery(str2);
                    com.paypal.oslo.core.network.graphql.CallConfig highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI("get_bank_account");
                    bankAccountDetailsRepositoryImpl$getBankAccountDetails$1.Camera2StreamConfigurationMap = str2;
                    bankAccountDetailsRepositoryImpl$getBankAccountDetails$1.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloClient, getBankAccountQuery, highResolutionOutputSizeshNQ4ISI, bankAccountDetailsRepositoryImpl$getBankAccountDetails$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) bankAccountDetailsRepositoryImpl$getBankAccountDetails$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (ior instanceof arrow.core.Ior.Left) {
                    if (!(ior instanceof arrow.core.Ior.Right)) {
                        if (!(ior instanceof arrow.core.Ior.Both)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                        java.lang.Object leftValue = both.getLeftValue();
                        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                        kotlin.Pair[] pairArr = new kotlin.Pair[2];
                        pairArr[0] = kotlin.TuplesKt.to("bankAccountId", str2);
                        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName();
                        pairArr[1] = kotlin.TuplesKt.to("errorType", simpleName != null ? simpleName : "");
                        com.paypal.android.logger.Logger.w$default(logger, "Bank account details returned with errors", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                        com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Data data = (com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Data) graphQLData.getData();
                        bankAccount = data != null ? data.getBankAccount() : null;
                        if (bankAccount == null) {
                            return arrow.core.EitherKt.left(this.getHighSpeedVideoFpsRangesFor.toDomain(callError));
                        }
                        if (kotlin.text.StringsKt.isBlank(bankAccount.getId()) || kotlin.text.StringsKt.isBlank(bankAccount.getLastNChars())) {
                            return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Business.InvalidData.INSTANCE);
                        }
                        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails domain = this.getHighResolutionOutputSizeshNQ4ISI.toDomain(bankAccount);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Successfully fetched bank account details despite errors", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankAccountId", str2), kotlin.TuplesKt.to("accountType", domain.getType().toString()), kotlin.TuplesKt.to("status", domain.getStatus().getValue().toString())), null, 4, null);
                        return arrow.core.EitherKt.right(domain);
                    }
                    com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Data data2 = (com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    bankAccount = data2 != null ? data2.getBankAccount() : null;
                    if (bankAccount == null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Bank account data is null in response", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankAccountId", str2)), null, 4, null);
                        return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Business.NotFound.INSTANCE);
                    }
                    if (kotlin.text.StringsKt.isBlank(bankAccount.getId()) || kotlin.text.StringsKt.isBlank(bankAccount.getLastNChars())) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Bank account data missing required fields", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankAccountId", str2), kotlin.TuplesKt.to("hasId", java.lang.String.valueOf(!kotlin.text.StringsKt.isBlank(bankAccount.getId()))), kotlin.TuplesKt.to("hasLastNChars", java.lang.String.valueOf(!kotlin.text.StringsKt.isBlank(bankAccount.getLastNChars())))), null, 4, null);
                        return arrow.core.EitherKt.left(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Business.InvalidData.INSTANCE);
                    }
                    com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails domain2 = this.getHighResolutionOutputSizeshNQ4ISI.toDomain(bankAccount);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Successfully fetched bank account details", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankAccountId", str2), kotlin.TuplesKt.to("accountType", domain2.getType().toString()), kotlin.TuplesKt.to("status", domain2.getStatus().getValue().toString())), null, 4, null);
                    return arrow.core.EitherKt.right(domain2);
                }
                com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError domain3 = this.getHighSpeedVideoFpsRangesFor.toDomain((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                pairArr2[0] = kotlin.TuplesKt.to("bankAccountId", str2);
                java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(domain3.getClass()).getSimpleName();
                pairArr2[1] = kotlin.TuplesKt.to("errorType", simpleName2 != null ? simpleName2 : "");
                com.paypal.android.logger.Logger.d$default(logger2, "Bank account details fetch failed", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                return arrow.core.EitherKt.left(domain3);
            }
        }
        bankAccountDetailsRepositoryImpl$getBankAccountDetails$1 = new com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl$getBankAccountDetails$1(this, continuation);
        java.lang.Object obj2 = bankAccountDetailsRepositoryImpl$getBankAccountDetails$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bankAccountDetailsRepositoryImpl$getBankAccountDetails$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (ior instanceof arrow.core.Ior.Left) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.paypal.oslo.core.network.graphql.CallConfig getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
        return new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(p0, (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // com.paypal.oslo.feature.wallet.banks.domain.repository.BankAccountDetailsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateBankAccountNickname(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl$updateBankAccountNickname$1 bankAccountDetailsRepositoryImpl$updateBankAccountNickname$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.wallet.graphql.UpdateWalletBankAccountMutation.UpdateBankAccount updateBankAccount;
        java.lang.String str3;
        java.lang.String str4 = str;
        if (continuation instanceof com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl$updateBankAccountNickname$1) {
            bankAccountDetailsRepositoryImpl$updateBankAccountNickname$1 = (com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl$updateBankAccountNickname$1) continuation;
            if ((bankAccountDetailsRepositoryImpl$updateBankAccountNickname$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                bankAccountDetailsRepositoryImpl$updateBankAccountNickname$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = bankAccountDetailsRepositoryImpl$updateBankAccountNickname$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bankAccountDetailsRepositoryImpl$updateBankAccountNickname$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    pairArr[0] = kotlin.TuplesKt.to("bankAccountId", str4);
                    pairArr[1] = kotlin.TuplesKt.to("nickname", str2 == null ? "empty" : str2);
                    com.paypal.android.logger.Logger.d$default(logger, "Updating bank account nickname", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    com.paypal.oslo.feature.wallet.graphql.UpdateWalletBankAccountMutation updateWalletBankAccountMutation = new com.paypal.oslo.feature.wallet.graphql.UpdateWalletBankAccountMutation(new com.paypal.oslo.api.graphql.schema.type.UpdateBankAccountInput(str4, new com.apollographql.apollo.api.Optional.Present(str2)));
                    com.paypal.oslo.core.network.graphql.CallConfig highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI("update_bank_account");
                    bankAccountDetailsRepositoryImpl$updateBankAccountNickname$1.getHighResolutionOutputSizeshNQ4ISI = str4;
                    bankAccountDetailsRepositoryImpl$updateBankAccountNickname$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    bankAccountDetailsRepositoryImpl$updateBankAccountNickname$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateWalletBankAccountMutation);
                    bankAccountDetailsRepositoryImpl$updateBankAccountNickname$1.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.getHighSpeedVideoSizes, updateWalletBankAccountMutation, highResolutionOutputSizeshNQ4ISI, bankAccountDetailsRepositoryImpl$updateBankAccountNickname$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = (java.lang.String) bankAccountDetailsRepositoryImpl$updateBankAccountNickname$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (ior instanceof arrow.core.Ior.Left) {
                    if (!(ior instanceof arrow.core.Ior.Right)) {
                        if (!(ior instanceof arrow.core.Ior.Both)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                        java.lang.Object leftValue = both.getLeftValue();
                        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
                        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                        pairArr2[0] = kotlin.TuplesKt.to("bankAccountId", str4);
                        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName();
                        pairArr2[1] = kotlin.TuplesKt.to("errorType", simpleName != null ? simpleName : "");
                        com.paypal.android.logger.Logger.w$default(logger2, "Bank account nickname update returned with errors", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                        com.paypal.oslo.feature.wallet.graphql.UpdateWalletBankAccountMutation.Data data = (com.paypal.oslo.feature.wallet.graphql.UpdateWalletBankAccountMutation.Data) graphQLData.getData();
                        updateBankAccount = data != null ? data.getUpdateBankAccount() : null;
                        if (updateBankAccount == null || kotlin.jvm.internal.Intrinsics.areEqual(updateBankAccount.getSuccess(), java.lang.Boolean.FALSE)) {
                            return arrow.core.EitherKt.left(this.getHighSpeedVideoFpsRangesFor.toDomain(callError));
                        }
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Successfully updated bank account nickname despite errors", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankAccountId", str4)), null, 4, null);
                        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                    }
                    com.paypal.oslo.feature.wallet.graphql.UpdateWalletBankAccountMutation.Data data2 = (com.paypal.oslo.feature.wallet.graphql.UpdateWalletBankAccountMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    updateBankAccount = data2 != null ? data2.getUpdateBankAccount() : null;
                    if (updateBankAccount == null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Update bank account result is null", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankAccountId", str4)), null, 4, null);
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical.Unknown("Update result is null"));
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(updateBankAccount.getSuccess(), java.lang.Boolean.FALSE)) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Update bank account returned success=false", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankAccountId", str4)), null, 4, null);
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError.Technical.Unknown("Update returned success=false"));
                    }
                    com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                    kotlin.Pair[] pairArr3 = new kotlin.Pair[2];
                    pairArr3[0] = kotlin.TuplesKt.to("bankAccountId", str4);
                    com.paypal.oslo.feature.wallet.graphql.UpdateWalletBankAccountMutation.BankAccount bankAccount = updateBankAccount.getBankAccount();
                    if (bankAccount == null || (str3 = bankAccount.getNickname()) == null) {
                        str3 = "null";
                    }
                    pairArr3[1] = kotlin.TuplesKt.to("newNickname", str3);
                    com.paypal.android.logger.Logger.d$default(logger3, "Successfully updated bank account nickname", kotlin.collections.MapsKt.mapOf(pairArr3), null, 4, null);
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
                com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetailsError domain = this.getHighSpeedVideoFpsRangesFor.toDomain((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                com.paypal.android.logger.Logger logger4 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                kotlin.Pair[] pairArr4 = new kotlin.Pair[2];
                pairArr4[0] = kotlin.TuplesKt.to("bankAccountId", str4);
                java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(domain.getClass()).getSimpleName();
                pairArr4[1] = kotlin.TuplesKt.to("errorType", simpleName2 != null ? simpleName2 : "");
                com.paypal.android.logger.Logger.d$default(logger4, "Bank account nickname update failed", kotlin.collections.MapsKt.mapOf(pairArr4), null, 4, null);
                return arrow.core.EitherKt.left(domain);
            }
        }
        bankAccountDetailsRepositoryImpl$updateBankAccountNickname$1 = new com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl$updateBankAccountNickname$1(this, continuation);
        java.lang.Object obj2 = bankAccountDetailsRepositoryImpl$updateBankAccountNickname$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bankAccountDetailsRepositoryImpl$updateBankAccountNickname$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (ior instanceof arrow.core.Ior.Left) {
        }
    }
}
