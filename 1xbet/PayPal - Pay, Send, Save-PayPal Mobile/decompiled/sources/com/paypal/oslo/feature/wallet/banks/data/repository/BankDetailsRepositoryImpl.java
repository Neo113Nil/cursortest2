package com.paypal.oslo.feature.wallet.banks.data.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\t*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/data/repository/BankDetailsRepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/BankDetailsRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetailsParams;", "params", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetailsError;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetails;", "getBankDetails", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetailsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetailsError;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankDetailsRepositoryImpl implements com.paypal.oslo.feature.wallet.banks.domain.repository.BankDetailsRepository {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public BankDetailsRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighResolutionOutputSizeshNQ4ISI = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x016d A[Catch: all -> 0x0066, RaiseCancellationException -> 0x0069, TRY_ENTER, TRY_LEAVE, TryCatch #3 {RaiseCancellationException -> 0x0069, all -> 0x0066, blocks: (B:11:0x005f, B:13:0x0167, B:16:0x016d, B:17:0x01ac, B:19:0x01bb, B:21:0x01c3, B:24:0x01d9, B:25:0x01ff, B:27:0x0200, B:29:0x0206, B:32:0x021c, B:35:0x0232, B:37:0x0254, B:38:0x025a, B:40:0x0260, B:41:0x026d, B:43:0x027f, B:45:0x0287, B:50:0x028f, B:51:0x02af, B:57:0x018a, B:58:0x01a6, B:59:0x01ab), top: B:10:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01bb A[Catch: all -> 0x0066, RaiseCancellationException -> 0x0069, TryCatch #3 {RaiseCancellationException -> 0x0069, all -> 0x0066, blocks: (B:11:0x005f, B:13:0x0167, B:16:0x016d, B:17:0x01ac, B:19:0x01bb, B:21:0x01c3, B:24:0x01d9, B:25:0x01ff, B:27:0x0200, B:29:0x0206, B:32:0x021c, B:35:0x0232, B:37:0x0254, B:38:0x025a, B:40:0x0260, B:41:0x026d, B:43:0x027f, B:45:0x0287, B:50:0x028f, B:51:0x02af, B:57:0x018a, B:58:0x01a6, B:59:0x01ab), top: B:10:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c3 A[Catch: all -> 0x0066, RaiseCancellationException -> 0x0069, TryCatch #3 {RaiseCancellationException -> 0x0069, all -> 0x0066, blocks: (B:11:0x005f, B:13:0x0167, B:16:0x016d, B:17:0x01ac, B:19:0x01bb, B:21:0x01c3, B:24:0x01d9, B:25:0x01ff, B:27:0x0200, B:29:0x0206, B:32:0x021c, B:35:0x0232, B:37:0x0254, B:38:0x025a, B:40:0x0260, B:41:0x026d, B:43:0x027f, B:45:0x0287, B:50:0x028f, B:51:0x02af, B:57:0x018a, B:58:0x01a6, B:59:0x01ab), top: B:10:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0200 A[Catch: all -> 0x0066, RaiseCancellationException -> 0x0069, TryCatch #3 {RaiseCancellationException -> 0x0069, all -> 0x0066, blocks: (B:11:0x005f, B:13:0x0167, B:16:0x016d, B:17:0x01ac, B:19:0x01bb, B:21:0x01c3, B:24:0x01d9, B:25:0x01ff, B:27:0x0200, B:29:0x0206, B:32:0x021c, B:35:0x0232, B:37:0x0254, B:38:0x025a, B:40:0x0260, B:41:0x026d, B:43:0x027f, B:45:0x0287, B:50:0x028f, B:51:0x02af, B:57:0x018a, B:58:0x01a6, B:59:0x01ab), top: B:10:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // com.paypal.oslo.feature.wallet.banks.domain.repository.BankDetailsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getBankDetails(com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams bankDetailsParams, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsError, com.paypal.oslo.feature.wallet.banks.domain.model.BankDetails>> continuation) {
        com.paypal.oslo.feature.wallet.banks.data.repository.BankDetailsRepositoryImpl$getBankDetails$1 bankDetailsRepositoryImpl$getBankDetails$1;
        int i;
        kotlin.jvm.functions.Function2 function2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        com.paypal.oslo.api.graphql.schema.type.BankInput bankInput;
        java.lang.String str;
        arrow.core.raise.IorRaise iorRaise;
        arrow.core.raise.IorRaise iorRaise2;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.lang.Object obj;
        arrow.core.Ior.Both both;
        com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Bank bank;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams bankDetailsParams2 = bankDetailsParams;
        if (continuation instanceof com.paypal.oslo.feature.wallet.banks.data.repository.BankDetailsRepositoryImpl$getBankDetails$1) {
            bankDetailsRepositoryImpl$getBankDetails$1 = (com.paypal.oslo.feature.wallet.banks.data.repository.BankDetailsRepositoryImpl$getBankDetails$1) continuation;
            if ((bankDetailsRepositoryImpl$getBankDetails$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                bankDetailsRepositoryImpl$getBankDetails$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                com.paypal.oslo.feature.wallet.banks.data.repository.BankDetailsRepositoryImpl$getBankDetails$1 bankDetailsRepositoryImpl$getBankDetails$12 = bankDetailsRepositoryImpl$getBankDetails$1;
                java.lang.Object obj2 = bankDetailsRepositoryImpl$getBankDetails$12.isOutputSupportedFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bankDetailsRepositoryImpl$getBankDetails$12.getOutputMinFrameDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.data.repository.BankDetailsRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.banks.data.repository.BankDetailsRepositoryImpl.$r8$lambda$sSju91PEcePhmUMUPhloYqO1fo8((com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsError) obj3, (com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsError) obj4);
                        }
                    };
                    atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise3);
                        if (bankDetailsParams2 instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByBankCode) {
                            com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByBankCode byBankCode = (com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByBankCode) bankDetailsParams2;
                            bankInput = new com.paypal.oslo.api.graphql.schema.type.BankInput(com.apollographql.apollo.api.Optional.INSTANCE.present(byBankCode.getBankCode()), byBankCode.getCountryCode(), com.apollographql.apollo.api.Optional.Absent.INSTANCE, null, 8, null);
                        } else {
                            if (!(bankDetailsParams2 instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByIban)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByIban byIban = (com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByIban) bankDetailsParams2;
                            bankInput = new com.paypal.oslo.api.graphql.schema.type.BankInput(com.apollographql.apollo.api.Optional.Absent.INSTANCE, byIban.getCountryCode(), com.apollographql.apollo.api.Optional.INSTANCE.present(byIban.getIban()), null, 8, null);
                        }
                        com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery getBankDetailsQuery = new com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery(bankInput);
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                        kotlin.Pair[] pairArr = new kotlin.Pair[2];
                        pairArr[0] = kotlin.TuplesKt.to("countryCode", bankDetailsParams.getCountryCode());
                        if (bankDetailsParams2 instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByBankCode) {
                            str = "bankCode";
                        } else {
                            if (!(bankDetailsParams2 instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByIban)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            str = com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Iban;
                        }
                        pairArr[1] = kotlin.TuplesKt.to("lookupType", str);
                        com.paypal.android.logger.Logger.i$default(logger, "Fetching bank details", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                        bankDetailsRepositoryImpl$getBankDetails$12.getOutputFormats = bankDetailsParams2;
                        bankDetailsRepositoryImpl$getBankDetails$12.getInputFormats = function2;
                        bankDetailsRepositoryImpl$getBankDetails$12.getHighSpeedVideoSizesFor = atomicReference;
                        bankDetailsRepositoryImpl$getBankDetails$12.getInputSizeshNQ4ISI = defaultRaise;
                        bankDetailsRepositoryImpl$getBankDetails$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        bankDetailsRepositoryImpl$getBankDetails$12.getOutputSizes = iorRaise3;
                        bankDetailsRepositoryImpl$getBankDetails$12.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bankInput);
                        bankDetailsRepositoryImpl$getBankDetails$12.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getBankDetailsQuery);
                        bankDetailsRepositoryImpl$getBankDetails$12.getOutputStallDuration = iorRaise3;
                        bankDetailsRepositoryImpl$getBankDetails$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        bankDetailsRepositoryImpl$getBankDetails$12.getHighSpeedVideoSizes = 0;
                        bankDetailsRepositoryImpl$getBankDetails$12.getHighSpeedVideoFpsRangesFor = 0;
                        bankDetailsRepositoryImpl$getBankDetails$12.Camera2StreamConfigurationMap = 0;
                        bankDetailsRepositoryImpl$getBankDetails$12.getHighSpeedVideoFpsRanges = 0;
                        bankDetailsRepositoryImpl$getBankDetails$12.getOutputMinFrameDurationlomOqCM = 1;
                        iorRaise = iorRaise3;
                        java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighResolutionOutputSizeshNQ4ISI, getBankDetailsQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, bankDetailsRepositoryImpl$getBankDetails$12, 2, (java.lang.Object) null);
                        if (execute$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = execute$default;
                        iorRaise2 = iorRaise;
                        atomicReference2 = atomicReference;
                        defaultRaise2 = defaultRaise;
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
                    int i2 = bankDetailsRepositoryImpl$getBankDetails$12.getHighSpeedVideoFpsRanges;
                    int i3 = bankDetailsRepositoryImpl$getBankDetails$12.Camera2StreamConfigurationMap;
                    int i4 = bankDetailsRepositoryImpl$getBankDetails$12.getHighSpeedVideoFpsRangesFor;
                    int i5 = bankDetailsRepositoryImpl$getBankDetails$12.getHighSpeedVideoSizes;
                    int i6 = bankDetailsRepositoryImpl$getBankDetails$12.getHighResolutionOutputSizeshNQ4ISI;
                    arrow.core.raise.IorRaise iorRaise4 = (arrow.core.raise.IorRaise) bankDetailsRepositoryImpl$getBankDetails$12.getOutputStallDuration;
                    iorRaise2 = (arrow.core.raise.IorRaise) bankDetailsRepositoryImpl$getBankDetails$12.getOutputSizes;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) bankDetailsRepositoryImpl$getBankDetails$12.getInputSizeshNQ4ISI;
                    atomicReference2 = (java.util.concurrent.atomic.AtomicReference) bankDetailsRepositoryImpl$getBankDetails$12.getHighSpeedVideoSizesFor;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) bankDetailsRepositoryImpl$getBankDetails$12.getInputFormats;
                    com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams bankDetailsParams3 = (com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams) bankDetailsRepositoryImpl$getBankDetails$12.getOutputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        iorRaise = iorRaise4;
                        bankDetailsParams2 = bankDetailsParams3;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        atomicReference = atomicReference2;
                        function2 = function22;
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
                    both = new arrow.core.Ior.Left(getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    both = new arrow.core.Ior.Both(getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                }
                com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
                com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Data data = (com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Data) graphQLData.getData();
                bank = data == null ? data.getBank() : null;
                if (bank != null) {
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                    kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                    pairArr2[0] = kotlin.TuplesKt.to("countryCode", bankDetailsParams2.getCountryCode());
                    pairArr2[1] = kotlin.TuplesKt.to("hasData", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(graphQLData.getData() != null));
                    com.paypal.android.logger.Logger.w$default(logger2, "No bank details returned from API", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                    iorRaise2.raise(com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsError.Business.BankNotFound.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                java.lang.String bankName = bank.getBankName();
                if (bankName == null) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Bank data missing required field: bankName", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("countryCode", bankDetailsParams2.getCountryCode())), null, 4, null);
                    iorRaise2.raise(com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsError.Business.MissingData.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                kotlin.Pair[] pairArr3 = new kotlin.Pair[3];
                pairArr3[0] = kotlin.TuplesKt.to("bankName", bankName);
                pairArr3[1] = kotlin.TuplesKt.to("hasLogoUrl", java.lang.String.valueOf(bank.getInlineLogoUrl() != null));
                pairArr3[2] = kotlin.TuplesKt.to("hasLogoData", java.lang.String.valueOf(bank.getInlineLogoImageData() != null));
                com.paypal.android.logger.Logger.i$default(logger3, "Bank details fetched successfully", kotlin.collections.MapsKt.mapOf(pairArr3), null, 4, null);
                java.lang.Object inlineLogoUrl = bank.getInlineLogoUrl();
                java.lang.String obj3 = inlineLogoUrl != null ? inlineLogoUrl.toString() : null;
                com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.InlineLogoImageData inlineLogoImageData = bank.getInlineLogoImageData();
                com.paypal.oslo.feature.wallet.banks.domain.model.BankDetails bankDetails = new com.paypal.oslo.feature.wallet.banks.domain.model.BankDetails(bankName, obj3, inlineLogoImageData != null ? new com.paypal.oslo.feature.wallet.banks.domain.model.LogoImageData(inlineLogoImageData.getData(), inlineLogoImageData.getMimeType()) : null);
                defaultRaise2.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj4 = atomicReference2.get();
                return obj4 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(bankDetails) : new arrow.core.Ior.Both(obj4, bankDetails);
            }
        }
        bankDetailsRepositoryImpl$getBankDetails$1 = new com.paypal.oslo.feature.wallet.banks.data.repository.BankDetailsRepositoryImpl$getBankDetails$1(this, continuation);
        com.paypal.oslo.feature.wallet.banks.data.repository.BankDetailsRepositoryImpl$getBankDetails$1 bankDetailsRepositoryImpl$getBankDetails$122 = bankDetailsRepositoryImpl$getBankDetails$1;
        java.lang.Object obj22 = bankDetailsRepositoryImpl$getBankDetails$122.isOutputSupportedFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bankDetailsRepositoryImpl$getBankDetails$122.getOutputMinFrameDurationlomOqCM;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
        com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Data data2 = (com.paypal.oslo.feature.wallet.graphql.GetBankDetailsQuery.Data) graphQLData2.getData();
        if (data2 == null) {
        }
        if (bank != null) {
        }
    }

    private static com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsError getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsError.Network.INSTANCE;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = ((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
        java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
        }
        return new com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsError.Business.PartialDataAvailable(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)));
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsError $r8$lambda$sSju91PEcePhmUMUPhloYqO1fo8(com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsError bankDetailsError, com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsError bankDetailsError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankDetailsError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankDetailsError2, "");
        return bankDetailsError;
    }
}
