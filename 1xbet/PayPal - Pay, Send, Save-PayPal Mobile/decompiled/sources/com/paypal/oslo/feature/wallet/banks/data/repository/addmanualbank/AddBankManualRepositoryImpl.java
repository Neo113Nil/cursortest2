package com.paypal.oslo.feature.wallet.banks.data.repository.addmanualbank;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/data/repository/addmanualbank/AddBankManualRepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/addmanualbank/AddBankManualRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/wallet/banks/data/mapper/BankAccountDetailsMapper;", "bankAccountDetailsMapper", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/wallet/banks/data/mapper/BankAccountDetailsMapper;)V", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/AddBankManualParams;", "params", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/AddBankManualError;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/AddBankManualResult;", "addBankManual", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/AddBankManualParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/AddBankManualError;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/ApolloClient;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/wallet/banks/data/mapper/BankAccountDetailsMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddBankManualRepositoryImpl implements com.paypal.oslo.feature.wallet.banks.domain.repository.addmanualbank.AddBankManualRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public AddBankManualRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper bankAccountDetailsMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountDetailsMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = apolloClient;
        this.Camera2StreamConfigurationMap = bankAccountDetailsMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x027e A[Catch: all -> 0x03d5, RaiseCancellationException -> 0x03d9, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x03d9, all -> 0x03d5, blocks: (B:13:0x0278, B:16:0x027e, B:17:0x02bc, B:20:0x02d0, B:22:0x02e5, B:25:0x02f0, B:27:0x0314, B:29:0x031c, B:31:0x0322, B:33:0x032a, B:36:0x0335, B:39:0x034a, B:40:0x0372, B:45:0x0377, B:68:0x029a, B:69:0x02b6, B:70:0x02bb, B:99:0x0228), top: B:98:0x0228 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02e5 A[Catch: all -> 0x03d5, RaiseCancellationException -> 0x03d9, TryCatch #4 {RaiseCancellationException -> 0x03d9, all -> 0x03d5, blocks: (B:13:0x0278, B:16:0x027e, B:17:0x02bc, B:20:0x02d0, B:22:0x02e5, B:25:0x02f0, B:27:0x0314, B:29:0x031c, B:31:0x0322, B:33:0x032a, B:36:0x0335, B:39:0x034a, B:40:0x0372, B:45:0x0377, B:68:0x029a, B:69:0x02b6, B:70:0x02bb, B:99:0x0228), top: B:98:0x0228 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0314 A[Catch: all -> 0x03d5, RaiseCancellationException -> 0x03d9, TryCatch #4 {RaiseCancellationException -> 0x03d9, all -> 0x03d5, blocks: (B:13:0x0278, B:16:0x027e, B:17:0x02bc, B:20:0x02d0, B:22:0x02e5, B:25:0x02f0, B:27:0x0314, B:29:0x031c, B:31:0x0322, B:33:0x032a, B:36:0x0335, B:39:0x034a, B:40:0x0372, B:45:0x0377, B:68:0x029a, B:69:0x02b6, B:70:0x02bb, B:99:0x0228), top: B:98:0x0228 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x032a A[Catch: all -> 0x03d5, RaiseCancellationException -> 0x03d9, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x03d9, all -> 0x03d5, blocks: (B:13:0x0278, B:16:0x027e, B:17:0x02bc, B:20:0x02d0, B:22:0x02e5, B:25:0x02f0, B:27:0x0314, B:29:0x031c, B:31:0x0322, B:33:0x032a, B:36:0x0335, B:39:0x034a, B:40:0x0372, B:45:0x0377, B:68:0x029a, B:69:0x02b6, B:70:0x02bb, B:99:0x0228), top: B:98:0x0228 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0335 A[Catch: all -> 0x03d5, RaiseCancellationException -> 0x03d9, TRY_ENTER, TryCatch #4 {RaiseCancellationException -> 0x03d9, all -> 0x03d5, blocks: (B:13:0x0278, B:16:0x027e, B:17:0x02bc, B:20:0x02d0, B:22:0x02e5, B:25:0x02f0, B:27:0x0314, B:29:0x031c, B:31:0x0322, B:33:0x032a, B:36:0x0335, B:39:0x034a, B:40:0x0372, B:45:0x0377, B:68:0x029a, B:69:0x02b6, B:70:0x02bb, B:99:0x0228), top: B:98:0x0228 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // com.paypal.oslo.feature.wallet.banks.domain.repository.addmanualbank.AddBankManualRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object addBankManual(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualParams addBankManualParams, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualResult>> continuation) {
        com.paypal.oslo.feature.wallet.banks.data.repository.addmanualbank.AddBankManualRepositoryImpl$addBankManual$1 addBankManualRepositoryImpl$addBankManual$1;
        int i;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.IorRaise iorRaise;
        com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType;
        com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity bankAccountOnboardingEntity;
        com.paypal.oslo.api.graphql.schema.type.BankBeneficiaryInput bankBeneficiaryInput;
        java.lang.String str;
        java.lang.String str2;
        arrow.core.raise.IorRaise iorRaise2;
        arrow.core.Ior.Both both;
        boolean booleanValue;
        com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation.BankAccount bankAccount;
        java.lang.Boolean success;
        try {
            try {
                if (continuation instanceof com.paypal.oslo.feature.wallet.banks.data.repository.addmanualbank.AddBankManualRepositoryImpl$addBankManual$1) {
                    addBankManualRepositoryImpl$addBankManual$1 = (com.paypal.oslo.feature.wallet.banks.data.repository.addmanualbank.AddBankManualRepositoryImpl$addBankManual$1) continuation;
                    if ((addBankManualRepositoryImpl$addBankManual$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                        addBankManualRepositoryImpl$addBankManual$1.getOutputSizes -= 2147483648;
                        java.lang.Object obj = addBankManualRepositoryImpl$addBankManual$1.isOutputSupportedForhNQ4ISI;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = addBankManualRepositoryImpl$addBankManual$1.getOutputSizes;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.data.repository.addmanualbank.AddBankManualRepositoryImpl$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.paypal.oslo.feature.wallet.banks.data.repository.addmanualbank.AddBankManualRepositoryImpl.$r8$lambda$HE30ultnDmKl8BWTOTOmKA4wQPs((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError) obj2, (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError) obj3);
                                }
                            };
                            atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                            defaultRaise = new arrow.core.raise.DefaultRaise(false);
                            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                            iorRaise = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise2);
                            switch (com.paypal.oslo.feature.wallet.banks.data.repository.addmanualbank.AddBankManualRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[addBankManualParams.getAccountType().ordinal()]) {
                                case 1:
                                    bankAccountType = com.paypal.oslo.api.graphql.schema.type.BankAccountType.CHECKING;
                                    break;
                                case 2:
                                    bankAccountType = com.paypal.oslo.api.graphql.schema.type.BankAccountType.SAVINGS;
                                    break;
                                case 3:
                                    bankAccountType = com.paypal.oslo.api.graphql.schema.type.BankAccountType.BUSINESS_CHECKING;
                                    break;
                                case 4:
                                    bankAccountType = com.paypal.oslo.api.graphql.schema.type.BankAccountType.BUSINESS_SAVINGS;
                                    break;
                                case 5:
                                    bankAccountType = com.paypal.oslo.api.graphql.schema.type.BankAccountType.NORMAL;
                                    break;
                                case 6:
                                    bankAccountType = com.paypal.oslo.api.graphql.schema.type.BankAccountType.CUSTOM;
                                    break;
                                case 7:
                                    bankAccountType = com.paypal.oslo.api.graphql.schema.type.BankAccountType.UNKNOWN__;
                                    break;
                                default:
                                    throw new kotlin.NoWhenBranchMatchedException();
                            }
                            com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType2 = bankAccountType;
                            com.paypal.oslo.api.graphql.schema.type.BankDataFormat bankDataFormat = com.paypal.oslo.api.graphql.schema.type.BankDataFormat.NORMAL;
                            com.apollographql.apollo.api.Optional.Present present = com.apollographql.apollo.api.Optional.INSTANCE.present(addBankManualParams.getAccountNumber());
                            com.apollographql.apollo.api.Optional.Present present2 = com.apollographql.apollo.api.Optional.INSTANCE.present(addBankManualParams.getRoutingNumber1());
                            com.apollographql.apollo.api.Optional.Absent absent = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                            com.apollographql.apollo.api.Optional.Absent absent2 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                            java.lang.String currencyCode = addBankManualParams.getCurrencyCode();
                            com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                            int i2 = com.paypal.oslo.feature.wallet.banks.data.repository.addmanualbank.AddBankManualRepositoryImpl.WhenMappings.$EnumSwitchMapping$1[addBankManualParams.getOnboardingEntity().ordinal()];
                            if (i2 == 1) {
                                bankAccountOnboardingEntity = com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity.EBAY;
                            } else if (i2 == 2) {
                                bankAccountOnboardingEntity = com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity.PAYPAL;
                            } else if (i2 == 3) {
                                bankAccountOnboardingEntity = com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity.VENMO;
                            } else if (i2 == 4) {
                                bankAccountOnboardingEntity = com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity.BRAINTREE;
                            } else {
                                if (i2 != 5) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                bankAccountOnboardingEntity = com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity.UNKNOWN__;
                            }
                            com.apollographql.apollo.api.Optional.Present present3 = companion.present(bankAccountOnboardingEntity);
                            com.apollographql.apollo.api.Optional.Present present4 = com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.BankIssuerInput(addBankManualParams.getCountryCode(), com.apollographql.apollo.api.Optional.Absent.INSTANCE));
                            com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
                            com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo beneficiary = addBankManualParams.getBeneficiary();
                            if (beneficiary instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.PersonalName) {
                                com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.PersonalName personalName = (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.PersonalName) beneficiary;
                                bankBeneficiaryInput = new com.paypal.oslo.api.graphql.schema.type.BankBeneficiaryInput(com.apollographql.apollo.api.Optional.Absent.INSTANCE, com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.PersonNameInput(com.apollographql.apollo.api.Optional.Absent.INSTANCE, com.apollographql.apollo.api.Optional.INSTANCE.present(personalName.getGivenName()), com.apollographql.apollo.api.Optional.INSTANCE.present(personalName.getSurname()), com.apollographql.apollo.api.Optional.Absent.INSTANCE, com.apollographql.apollo.api.Optional.Absent.INSTANCE, null, null, 96, null)));
                            } else {
                                if (!(beneficiary instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.BusinessName)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                bankBeneficiaryInput = new com.paypal.oslo.api.graphql.schema.type.BankBeneficiaryInput(com.apollographql.apollo.api.Optional.INSTANCE.present(((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.BusinessName) beneficiary).getName()), com.apollographql.apollo.api.Optional.Absent.INSTANCE);
                            }
                            com.paypal.oslo.api.graphql.schema.type.AddBankAccountInput addBankAccountInput = new com.paypal.oslo.api.graphql.schema.type.AddBankAccountInput(bankAccountType2, bankDataFormat, present, present2, absent, absent2, currencyCode, present3, present4, companion2.present(bankBeneficiaryInput));
                            com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation addBankAccountMutation = new com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation(addBankAccountInput);
                            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                            kotlin.Pair[] pairArr = new kotlin.Pair[5];
                            pairArr[0] = kotlin.TuplesKt.to("accountType", addBankManualParams.getAccountType().name());
                            pairArr[1] = kotlin.TuplesKt.to("currencyCode", addBankManualParams.getCurrencyCode());
                            pairArr[2] = kotlin.TuplesKt.to("countryCode", addBankManualParams.getCountryCode());
                            pairArr[3] = kotlin.TuplesKt.to("onboardingEntity", addBankManualParams.getOnboardingEntity());
                            com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo beneficiary2 = addBankManualParams.getBeneficiary();
                            if (beneficiary2 instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.PersonalName) {
                                str = "PersonalName";
                            } else {
                                if (!(beneficiary2 instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.BusinessName)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                str = "BusinessName";
                            }
                            pairArr[4] = kotlin.TuplesKt.to("beneficiaryType", str);
                            com.paypal.android.logger.Logger.i$default(logger, "Initiating manual bank account add", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                            com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI;
                            com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation addBankAccountMutation2 = addBankAccountMutation;
                            try {
                                str2 = null;
                                com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("add_bank_account", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, null);
                                addBankManualRepositoryImpl$addBankManual$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addBankManualParams);
                                addBankManualRepositoryImpl$addBankManual$1.getInputFormats = function2;
                                addBankManualRepositoryImpl$addBankManual$1.getInputSizeshNQ4ISI = atomicReference;
                                addBankManualRepositoryImpl$addBankManual$1.getOutputFormats = defaultRaise;
                                addBankManualRepositoryImpl$addBankManual$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                                addBankManualRepositoryImpl$addBankManual$1.getOutputSizeshNQ4ISI = iorRaise;
                                addBankManualRepositoryImpl$addBankManual$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addBankAccountInput);
                                addBankManualRepositoryImpl$addBankManual$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addBankAccountMutation);
                                addBankManualRepositoryImpl$addBankManual$1.getOutputMinFrameDurationlomOqCM = iorRaise;
                                addBankManualRepositoryImpl$addBankManual$1.Camera2StreamConfigurationMap = 0;
                                addBankManualRepositoryImpl$addBankManual$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                addBankManualRepositoryImpl$addBankManual$1.getHighSpeedVideoSizes = 0;
                                addBankManualRepositoryImpl$addBankManual$1.getHighSpeedVideoFpsRanges = 0;
                                addBankManualRepositoryImpl$addBankManual$1.getHighSpeedVideoFpsRangesFor = 0;
                                addBankManualRepositoryImpl$addBankManual$1.getOutputSizes = 1;
                                obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloClient, addBankAccountMutation2, callConfig, addBankManualRepositoryImpl$addBankManual$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                iorRaise2 = iorRaise;
                            } catch (arrow.core.raise.RaiseCancellationException e) {
                                e = e;
                                defaultRaise.complete();
                                java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                                arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                                java.lang.Object obj2 = atomicReference.get();
                                if (obj2 != arrow.core.EmptyValue.INSTANCE) {
                                    raisedOrRethrow = function2.invoke(obj2, raisedOrRethrow);
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
                            int i3 = addBankManualRepositoryImpl$addBankManual$1.getHighSpeedVideoFpsRangesFor;
                            int i4 = addBankManualRepositoryImpl$addBankManual$1.getHighSpeedVideoFpsRanges;
                            int i5 = addBankManualRepositoryImpl$addBankManual$1.getHighSpeedVideoSizes;
                            int i6 = addBankManualRepositoryImpl$addBankManual$1.getHighResolutionOutputSizeshNQ4ISI;
                            int i7 = addBankManualRepositoryImpl$addBankManual$1.Camera2StreamConfigurationMap;
                            iorRaise2 = (arrow.core.raise.IorRaise) addBankManualRepositoryImpl$addBankManual$1.getOutputMinFrameDurationlomOqCM;
                            iorRaise = (arrow.core.raise.IorRaise) addBankManualRepositoryImpl$addBankManual$1.getOutputSizeshNQ4ISI;
                            defaultRaise = (arrow.core.raise.DefaultRaise) addBankManualRepositoryImpl$addBankManual$1.getOutputFormats;
                            atomicReference = (java.util.concurrent.atomic.AtomicReference) addBankManualRepositoryImpl$addBankManual$1.getInputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj);
                            str2 = null;
                        }
                        both = (arrow.core.Ior) obj;
                        if (!(both instanceof arrow.core.Ior.Left)) {
                            both = new arrow.core.Ior.Left(Camera2StreamConfigurationMap((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                        } else if (!(both instanceof arrow.core.Ior.Right)) {
                            if (!(both instanceof arrow.core.Ior.Both)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            both = new arrow.core.Ior.Both(Camera2StreamConfigurationMap((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                        }
                        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise2.bind(both);
                        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                        pairArr2[0] = kotlin.TuplesKt.to("hasData", java.lang.String.valueOf(graphQLData.getData() == null));
                        com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation.Data data = (com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation.Data) graphQLData.getData();
                        pairArr2[1] = kotlin.TuplesKt.to("hasResult", java.lang.String.valueOf((data == null ? data.getAddBankAccount() : str2) == null));
                        com.paypal.android.logger.Logger.i$default(logger2, "Raw GraphQL response received", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                        com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation.Data data2 = (com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation.Data) graphQLData.getData();
                        com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation.AddBankAccount addBankAccount = data2 == null ? data2.getAddBankAccount() : str2;
                        booleanValue = (addBankAccount != null || (success = addBankAccount.getSuccess()) == null) ? false : success.booleanValue();
                        java.lang.String id = addBankAccount == null ? addBankAccount.getId() : str2;
                        if (booleanValue) {
                            com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                            kotlin.Pair[] pairArr3 = new kotlin.Pair[2];
                            pairArr3[0] = kotlin.TuplesKt.to("success", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                            pairArr3[1] = kotlin.TuplesKt.to("hasBankAccountId", java.lang.String.valueOf(id != null));
                            com.paypal.android.logger.Logger.e$default(logger3, "Bank account add failed", kotlin.collections.MapsKt.mapOf(pairArr3), null, null, 12, null);
                            iorRaise.raise(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError.Business.AddingFailed.INSTANCE);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        if (id == null) {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "No bank account ID returned from API", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("success", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))), null, null, 12, null);
                            iorRaise.raise(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError.Business.MissingBankAccountId.INSTANCE);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualResult addBankManualResult = new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualResult(true, id, (addBankAccount == null || (bankAccount = addBankAccount.getBankAccount()) == null) ? str2 : this.Camera2StreamConfigurationMap.toDomain$wallet_prodRelease(bankAccount));
                        defaultRaise.complete();
                        arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
                        java.lang.Object obj3 = atomicReference.get();
                        return obj3 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(addBankManualResult) : new arrow.core.Ior.Both(obj3, addBankManualResult);
                    }
                }
                if (i != 0) {
                }
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                }
                com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise2.bind(both);
                com.paypal.android.logger.Logger logger22 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                kotlin.Pair[] pairArr22 = new kotlin.Pair[2];
                pairArr22[0] = kotlin.TuplesKt.to("hasData", java.lang.String.valueOf(graphQLData2.getData() == null));
                com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation.Data data3 = (com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation.Data) graphQLData2.getData();
                pairArr22[1] = kotlin.TuplesKt.to("hasResult", java.lang.String.valueOf((data3 == null ? data3.getAddBankAccount() : str2) == null));
                com.paypal.android.logger.Logger.i$default(logger22, "Raw GraphQL response received", kotlin.collections.MapsKt.mapOf(pairArr22), null, 4, null);
                com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation.Data data22 = (com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation.Data) graphQLData2.getData();
                if (data22 == null) {
                }
                if (addBankAccount != null) {
                }
                if (addBankAccount == null) {
                }
                if (booleanValue) {
                }
            } catch (arrow.core.raise.RaiseCancellationException e2) {
                e = e2;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            e = e3;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        addBankManualRepositoryImpl$addBankManual$1 = new com.paypal.oslo.feature.wallet.banks.data.repository.addmanualbank.AddBankManualRepositoryImpl$addBankManual$1(this, continuation);
        java.lang.Object obj4 = addBankManualRepositoryImpl$addBankManual$1.isOutputSupportedForhNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = addBankManualRepositoryImpl$addBankManual$1.getOutputSizes;
    }

    private static com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError Camera2StreamConfigurationMap(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError.Network.INSTANCE;
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
        return new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError.Business.PartialDataAvailable(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)));
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError $r8$lambda$HE30ultnDmKl8BWTOTOmKA4wQPs(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError addBankManualError, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.AddBankManualError addBankManualError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankManualError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankManualError2, "");
        return addBankManualError;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CHECKING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.BUSINESS_CHECKING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.BUSINESS_SAVINGS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.NORMAL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CUSTOM.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.UNKNOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.values().length];
            try {
                iArr2[com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.EBAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.PAYPAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.VENMO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.BRAINTREE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
