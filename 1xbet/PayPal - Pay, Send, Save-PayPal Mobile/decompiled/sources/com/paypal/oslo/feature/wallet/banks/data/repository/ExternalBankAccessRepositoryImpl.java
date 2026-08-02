package com.paypal.oslo.feature.wallet.banks.data.repository;

@kotlin.Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0007\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u0007\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015*\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c*\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0018\u001a\u00060 j\u0002`!*\u00020\u001fH\u0002¢\u0006\u0004\b\u0018\u0010\"J\u0017\u0010\u001d\u001a\u00060$j\u0002`%*\u00020#H\u0002¢\u0006\u0004\b\u001d\u0010&J\u0017\u0010\u001d\u001a\u00060(j\u0002`)*\u00020'H\u0002¢\u0006\u0004\b\u001d\u0010*J\u0017\u0010\u001d\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b\u001d\u0010.J\u0017\u00102\u001a\u000201*\u00060/j\u0002`0H\u0002¢\u0006\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/data/repository/ExternalBankAccessRepositoryImpl;", "Lcom/paypal/oslo/feature/wallet/banks/domain/repository/ExternalBankAccessRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InitiateExternalBankAccessParams;", "params", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessError;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessResult;", "initiateExternalBankAccess", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/InitiateExternalBankAccessParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccountsParams;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccountsResult;", "getExternalBankAccounts", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccountsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkExternalBankAccountsParams;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkExternalBankAccountsResult;", "linkExternalBankAccounts", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkExternalBankAccountsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/feature/wallet/graphql/LinkExternalBankAccountsMutation$ExistingBankAccount;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExistingBankAccountInfo;", "getHighSpeedVideoFpsRanges", "(Ljava/util/List;)Ljava/util/List;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;", "Lcom/paypal/oslo/feature/wallet/graphql/type/BankAggregatorName;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;)Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "Lcom/paypal/oslo/api/graphql/schema/type/BankProductFlow;", "Lcom/paypal/oslo/feature/wallet/graphql/type/BankProductFlow;", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;)Lcom/paypal/oslo/api/graphql/schema/type/BankProductFlow;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", "Lcom/paypal/oslo/api/graphql/schema/type/BankIntegrationType;", "Lcom/paypal/oslo/feature/wallet/graphql/type/BankIntegrationType;", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;)Lcom/paypal/oslo/api/graphql/schema/type/BankIntegrationType;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/CredentialType;", "Lcom/paypal/oslo/api/graphql/schema/type/BankCredentialType;", "Lcom/paypal/oslo/feature/wallet/graphql/type/BankCredentialType;", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/CredentialType;)Lcom/paypal/oslo/api/graphql/schema/type/BankCredentialType;", "", "p0", "Lcom/paypal/oslo/core/network/graphql/CallConfig;", "(Ljava/lang/String;)Lcom/paypal/oslo/core/network/graphql/CallConfig;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "Lcom/paypal/oslo/feature/wallet/graphql/type/BankAccountType;", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;)Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExternalBankAccessRepositoryImpl implements com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ExternalBankAccessRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x035e: INVOKE (r11 I:arrow.core.raise.DefaultRaise) VIRTUAL call: arrow.core.raise.DefaultRaise.complete():boolean A[MD:():boolean (m)] (LINE:571), block:B:99:0x035e */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0367: INVOKE (r11 I:arrow.core.raise.DefaultRaise) VIRTUAL call: arrow.core.raise.DefaultRaise.complete():boolean A[MD:():boolean (m)] (LINE:562), block:B:93:0x0367 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0372: INVOKE (r2 I:java.lang.Object) = (r12 I:java.util.concurrent.atomic.AtomicReference) VIRTUAL call: java.util.concurrent.atomic.AtomicReference.get():java.lang.Object A[MD:():V (c)], block:B:93:0x0367 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x037a: INVOKE (r0 I:java.lang.Object) = (r13 I:kotlin.jvm.functions.Function2), (r2 I:java.lang.Object), (r0 I:java.lang.Object) INTERFACE call: kotlin.jvm.functions.Function2.invoke(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(P1, P2):R (m)] (LINE:565), block:B:95:0x037a */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0212 A[Catch: all -> 0x035d, RaiseCancellationException -> 0x0366, TRY_ENTER, TRY_LEAVE, TryCatch #2 {RaiseCancellationException -> 0x0366, all -> 0x035d, blocks: (B:11:0x0061, B:12:0x020c, B:15:0x0212, B:16:0x0251, B:19:0x026c, B:21:0x0282, B:24:0x028d, B:26:0x02b1, B:28:0x02b9, B:30:0x02bf, B:33:0x02d0, B:34:0x02f8, B:37:0x02f9, B:40:0x031b, B:42:0x034d, B:44:0x0355, B:55:0x022f, B:56:0x024b, B:57:0x0250, B:61:0x0082, B:65:0x00a4, B:66:0x00b2, B:68:0x00d3, B:71:0x00de, B:73:0x00e8, B:76:0x00f3, B:78:0x00fd, B:81:0x0108, B:85:0x0106, B:86:0x00f1, B:87:0x00dc, B:88:0x00a7, B:89:0x00ac, B:90:0x00ad, B:91:0x00b0), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0282 A[Catch: all -> 0x035d, RaiseCancellationException -> 0x0366, TryCatch #2 {RaiseCancellationException -> 0x0366, all -> 0x035d, blocks: (B:11:0x0061, B:12:0x020c, B:15:0x0212, B:16:0x0251, B:19:0x026c, B:21:0x0282, B:24:0x028d, B:26:0x02b1, B:28:0x02b9, B:30:0x02bf, B:33:0x02d0, B:34:0x02f8, B:37:0x02f9, B:40:0x031b, B:42:0x034d, B:44:0x0355, B:55:0x022f, B:56:0x024b, B:57:0x0250, B:61:0x0082, B:65:0x00a4, B:66:0x00b2, B:68:0x00d3, B:71:0x00de, B:73:0x00e8, B:76:0x00f3, B:78:0x00fd, B:81:0x0108, B:85:0x0106, B:86:0x00f1, B:87:0x00dc, B:88:0x00a7, B:89:0x00ac, B:90:0x00ad, B:91:0x00b0), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02b1 A[Catch: all -> 0x035d, RaiseCancellationException -> 0x0366, TryCatch #2 {RaiseCancellationException -> 0x0366, all -> 0x035d, blocks: (B:11:0x0061, B:12:0x020c, B:15:0x0212, B:16:0x0251, B:19:0x026c, B:21:0x0282, B:24:0x028d, B:26:0x02b1, B:28:0x02b9, B:30:0x02bf, B:33:0x02d0, B:34:0x02f8, B:37:0x02f9, B:40:0x031b, B:42:0x034d, B:44:0x0355, B:55:0x022f, B:56:0x024b, B:57:0x0250, B:61:0x0082, B:65:0x00a4, B:66:0x00b2, B:68:0x00d3, B:71:0x00de, B:73:0x00e8, B:76:0x00f3, B:78:0x00fd, B:81:0x0108, B:85:0x0106, B:86:0x00f1, B:87:0x00dc, B:88:0x00a7, B:89:0x00ac, B:90:0x00ad, B:91:0x00b0), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02b9 A[Catch: all -> 0x035d, RaiseCancellationException -> 0x0366, TryCatch #2 {RaiseCancellationException -> 0x0366, all -> 0x035d, blocks: (B:11:0x0061, B:12:0x020c, B:15:0x0212, B:16:0x0251, B:19:0x026c, B:21:0x0282, B:24:0x028d, B:26:0x02b1, B:28:0x02b9, B:30:0x02bf, B:33:0x02d0, B:34:0x02f8, B:37:0x02f9, B:40:0x031b, B:42:0x034d, B:44:0x0355, B:55:0x022f, B:56:0x024b, B:57:0x0250, B:61:0x0082, B:65:0x00a4, B:66:0x00b2, B:68:0x00d3, B:71:0x00de, B:73:0x00e8, B:76:0x00f3, B:78:0x00fd, B:81:0x0108, B:85:0x0106, B:86:0x00f1, B:87:0x00dc, B:88:0x00a7, B:89:0x00ac, B:90:0x00ad, B:91:0x00b0), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02bf A[Catch: all -> 0x035d, RaiseCancellationException -> 0x0366, TryCatch #2 {RaiseCancellationException -> 0x0366, all -> 0x035d, blocks: (B:11:0x0061, B:12:0x020c, B:15:0x0212, B:16:0x0251, B:19:0x026c, B:21:0x0282, B:24:0x028d, B:26:0x02b1, B:28:0x02b9, B:30:0x02bf, B:33:0x02d0, B:34:0x02f8, B:37:0x02f9, B:40:0x031b, B:42:0x034d, B:44:0x0355, B:55:0x022f, B:56:0x024b, B:57:0x0250, B:61:0x0082, B:65:0x00a4, B:66:0x00b2, B:68:0x00d3, B:71:0x00de, B:73:0x00e8, B:76:0x00f3, B:78:0x00fd, B:81:0x0108, B:85:0x0106, B:86:0x00f1, B:87:0x00dc, B:88:0x00a7, B:89:0x00ac, B:90:0x00ad, B:91:0x00b0), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02f9 A[Catch: all -> 0x035d, RaiseCancellationException -> 0x0366, TryCatch #2 {RaiseCancellationException -> 0x0366, all -> 0x035d, blocks: (B:11:0x0061, B:12:0x020c, B:15:0x0212, B:16:0x0251, B:19:0x026c, B:21:0x0282, B:24:0x028d, B:26:0x02b1, B:28:0x02b9, B:30:0x02bf, B:33:0x02d0, B:34:0x02f8, B:37:0x02f9, B:40:0x031b, B:42:0x034d, B:44:0x0355, B:55:0x022f, B:56:0x024b, B:57:0x0250, B:61:0x0082, B:65:0x00a4, B:66:0x00b2, B:68:0x00d3, B:71:0x00de, B:73:0x00e8, B:76:0x00f3, B:78:0x00fd, B:81:0x0108, B:85:0x0106, B:86:0x00f1, B:87:0x00dc, B:88:0x00a7, B:89:0x00ac, B:90:0x00ad, B:91:0x00b0), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function2] */
    @Override // com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object initiateExternalBankAccess(com.paypal.oslo.feature.wallet.banks.domain.model.InitiateExternalBankAccessParams initiateExternalBankAccessParams, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessResult>> continuation) {
        com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl$initiateExternalBankAccess$1 externalBankAccessRepositoryImpl$initiateExternalBankAccess$1;
        int i;
        arrow.core.raise.DefaultRaise complete;
        arrow.core.raise.DefaultRaise complete2;
        ?? r12;
        ?? invoke;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        com.paypal.oslo.api.graphql.schema.type.ExternalBankAccessAction externalBankAccessAction;
        com.apollographql.apollo.api.Optional optional;
        com.apollographql.apollo.api.Optional optional2;
        com.apollographql.apollo.api.Optional optional3;
        arrow.core.raise.IorRaise iorRaise;
        java.lang.String str;
        arrow.core.raise.IorRaise iorRaise2;
        arrow.core.Ior.Both both;
        java.lang.String connectUrl;
        try {
            if (continuation instanceof com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl$initiateExternalBankAccess$1) {
                externalBankAccessRepositoryImpl$initiateExternalBankAccess$1 = (com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl$initiateExternalBankAccess$1) continuation;
                if ((externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.isOutputSupportedForhNQ4ISI & Integer.MIN_VALUE) != 0) {
                    externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.isOutputSupportedForhNQ4ISI -= 2147483648;
                    java.lang.Object obj = externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.isOutputSupportedFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.isOutputSupportedForhNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl.$r8$lambda$y3yx7Lc4hlRwh9yDlVPw5LJX8bs((com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) obj2, (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) obj3);
                            }
                        };
                        atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise2);
                        java.lang.String name2 = initiateExternalBankAccessParams.getAggregator().name();
                        int i2 = com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl.WhenMappings.$EnumSwitchMapping$1[initiateExternalBankAccessParams.getAction().ordinal()];
                        if (i2 == 1) {
                            externalBankAccessAction = com.paypal.oslo.api.graphql.schema.type.ExternalBankAccessAction.INITIATE_ADD_BANK_ACCESS;
                        } else if (i2 == 2) {
                            externalBankAccessAction = com.paypal.oslo.api.graphql.schema.type.ExternalBankAccessAction.INITIATE_CONFIRM_BANK_ACCESS;
                        } else {
                            if (i2 != 3) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            externalBankAccessAction = com.paypal.oslo.api.graphql.schema.type.ExternalBankAccessAction.INITIATE_RECONSENT_BANK_ACCESS;
                        }
                        com.paypal.oslo.api.graphql.schema.type.ExternalBankAccessAction externalBankAccessAction2 = externalBankAccessAction;
                        com.paypal.oslo.api.graphql.schema.type.BankAggregatorName highSpeedVideoSizes = getHighSpeedVideoSizes(initiateExternalBankAccessParams.getAggregator());
                        java.lang.String countryCode = initiateExternalBankAccessParams.getCountryCode();
                        java.lang.String language = initiateExternalBankAccessParams.getLocale().getLanguage();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "");
                        java.lang.String externalBankId = initiateExternalBankAccessParams.getExternalBankId();
                        if (externalBankId == null || (optional = com.apollographql.apollo.api.Optional.INSTANCE.present(externalBankId)) == null) {
                            optional = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        }
                        com.apollographql.apollo.api.Optional optional4 = optional;
                        java.lang.String instrumentId = initiateExternalBankAccessParams.getInstrumentId();
                        if (instrumentId == null || (optional2 = com.apollographql.apollo.api.Optional.INSTANCE.present(instrumentId)) == null) {
                            optional2 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        }
                        com.apollographql.apollo.api.Optional optional5 = optional2;
                        java.lang.String redirectUrl = initiateExternalBankAccessParams.getRedirectUrl();
                        if (redirectUrl == null || (optional3 = com.apollographql.apollo.api.Optional.INSTANCE.present(redirectUrl)) == null) {
                            optional3 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        }
                        com.paypal.oslo.api.graphql.schema.type.InitiateExternalBankAccessInput initiateExternalBankAccessInput = new com.paypal.oslo.api.graphql.schema.type.InitiateExternalBankAccessInput(externalBankAccessAction2, optional4, optional5, highSpeedVideoSizes, optional3, com.apollographql.apollo.api.Optional.INSTANCE.present(java.lang.Boolean.valueOf(initiateExternalBankAccessParams.isWebView())), com.apollographql.apollo.api.Optional.INSTANCE.present(getHighSpeedVideoFpsRanges(initiateExternalBankAccessParams.getAddFIFlow())), countryCode, language, null, com.apollographql.apollo.api.Optional.INSTANCE.present(initiateExternalBankAccessParams.getAndroidPackageName()), 512, null);
                        com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation initiateExternalBankAccessMutation = new com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation(initiateExternalBankAccessInput);
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "[ExternalBankAccess] GraphQL Input being sent", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("aggregator", name2), kotlin.TuplesKt.to("action", initiateExternalBankAccessInput.getAction().getRawValue()), kotlin.TuplesKt.to("aggregatorName", initiateExternalBankAccessInput.getAggregatorName().getRawValue()), kotlin.TuplesKt.to("countryCode", initiateExternalBankAccessInput.getCountryCode()), kotlin.TuplesKt.to("locale", initiateExternalBankAccessInput.getLocale()), kotlin.TuplesKt.to("productFlow", initiateExternalBankAccessInput.getProductFlow().toString()), kotlin.TuplesKt.to("isWebView", initiateExternalBankAccessInput.isWebView())), null, 4, null);
                        com.paypal.oslo.core.network.graphql.CallConfig highSpeedVideoSizes2 = getHighSpeedVideoSizes("initiate_external_bank_access");
                        externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(initiateExternalBankAccessParams);
                        externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getInputSizeshNQ4ISI = function2;
                        externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getOutputFormats = atomicReference;
                        externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getInputFormats = defaultRaise;
                        externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                        externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getOutputStallDurationlomOqCM = iorRaise3;
                        externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getOutputMinFrameDurationlomOqCM = name2;
                        externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(initiateExternalBankAccessInput);
                        externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(initiateExternalBankAccessMutation);
                        externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getOutputSizeshNQ4ISI = iorRaise3;
                        externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getHighSpeedVideoSizes = 0;
                        externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getHighSpeedVideoFpsRangesFor = 0;
                        externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.Camera2StreamConfigurationMap = 0;
                        externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getHighSpeedVideoFpsRanges = 0;
                        externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.isOutputSupportedForhNQ4ISI = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.Camera2StreamConfigurationMap, initiateExternalBankAccessMutation, highSpeedVideoSizes2, externalBankAccessRepositoryImpl$initiateExternalBankAccess$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        iorRaise = iorRaise3;
                        str = name2;
                        iorRaise2 = iorRaise;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i3 = externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getHighSpeedVideoFpsRanges;
                        int i4 = externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.Camera2StreamConfigurationMap;
                        int i5 = externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i6 = externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getHighSpeedVideoFpsRangesFor;
                        int i7 = externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getHighSpeedVideoSizes;
                        iorRaise = (arrow.core.raise.IorRaise) externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getOutputSizeshNQ4ISI;
                        str = (java.lang.String) externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getOutputMinFrameDurationlomOqCM;
                        iorRaise2 = (arrow.core.raise.IorRaise) externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getOutputStallDurationlomOqCM;
                        defaultRaise = (arrow.core.raise.DefaultRaise) externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getInputFormats;
                        atomicReference = (java.util.concurrent.atomic.AtomicReference) externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    both = (arrow.core.Ior) obj;
                    if (!(both instanceof arrow.core.Ior.Left)) {
                        both = new arrow.core.Ior.Left(com.paypal.oslo.feature.wallet.banks.data.error.CallErrorMapperKt.toExternalBankAccessError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                    } else if (!(both instanceof arrow.core.Ior.Right)) {
                        if (!(both instanceof arrow.core.Ior.Both)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        both = new arrow.core.Ior.Both(com.paypal.oslo.feature.wallet.banks.data.error.CallErrorMapperKt.toExternalBankAccessError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                    }
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[3];
                    pairArr[0] = kotlin.TuplesKt.to("aggregator", str);
                    pairArr[1] = kotlin.TuplesKt.to("hasData", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(graphQLData.getData() == null));
                    com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.Data data = (com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.Data) graphQLData.getData();
                    pairArr[2] = kotlin.TuplesKt.to("hasResult", kotlin.coroutines.jvm.internal.Boxing.boxBoolean((data == null ? data.getInitiateExternalBankAccess() : null) == null));
                    com.paypal.android.logger.Logger.i$default(logger, "[ExternalBankAccess] Raw GraphQL response", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.Data data2 = (com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.Data) graphQLData.getData();
                    com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.InitiateExternalBankAccess initiateExternalBankAccess = data2 == null ? data2.getInitiateExternalBankAccess() : null;
                    connectUrl = initiateExternalBankAccess != null ? initiateExternalBankAccess.getConnectUrl() : null;
                    if (connectUrl != null) {
                        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                        pairArr2[0] = kotlin.TuplesKt.to("aggregator", str);
                        pairArr2[1] = kotlin.TuplesKt.to("resultIsNull", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(initiateExternalBankAccess == null));
                        com.paypal.android.logger.Logger.e$default(logger2, "[ExternalBankAccess] No connect URL returned from API", kotlin.collections.MapsKt.mapOf(pairArr2), null, null, 12, null);
                        iorRaise2.raise(com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.MissingConnectUrl.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                    kotlin.Pair[] pairArr3 = new kotlin.Pair[3];
                    pairArr3[0] = kotlin.TuplesKt.to("aggregator", str);
                    pairArr3[1] = kotlin.TuplesKt.to("hasConnectUrl", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    pairArr3[2] = kotlin.TuplesKt.to("hasExternalReferenceId", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(initiateExternalBankAccess.getExternalReferenceId() != null));
                    com.paypal.android.logger.Logger.i$default(logger3, "[ExternalBankAccess] External bank access initiated successfully", kotlin.collections.MapsKt.mapOf(pairArr3), null, 4, null);
                    com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessResult externalBankAccessResult = new com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessResult(connectUrl, initiateExternalBankAccess.getExternalReferenceId());
                    defaultRaise.complete();
                    arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                    java.lang.Object obj2 = atomicReference.get();
                    return obj2 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(externalBankAccessResult) : new arrow.core.Ior.Both(obj2, externalBankAccessResult);
                }
            }
            if (i != 0) {
            }
            both = (arrow.core.Ior) obj;
            if (!(both instanceof arrow.core.Ior.Left)) {
            }
            com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
            com.paypal.android.logger.Logger logger4 = com.paypal.oslo.feature.wallet.LoggerKt.log;
            kotlin.Pair[] pairArr4 = new kotlin.Pair[3];
            pairArr4[0] = kotlin.TuplesKt.to("aggregator", str);
            pairArr4[1] = kotlin.TuplesKt.to("hasData", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(graphQLData2.getData() == null));
            com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.Data data3 = (com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.Data) graphQLData2.getData();
            pairArr4[2] = kotlin.TuplesKt.to("hasResult", kotlin.coroutines.jvm.internal.Boxing.boxBoolean((data3 == null ? data3.getInitiateExternalBankAccess() : null) == null));
            com.paypal.android.logger.Logger.i$default(logger4, "[ExternalBankAccess] Raw GraphQL response", kotlin.collections.MapsKt.mapOf(pairArr4), null, 4, null);
            com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.Data data22 = (com.paypal.oslo.feature.wallet.graphql.InitiateExternalBankAccessMutation.Data) graphQLData2.getData();
            if (data22 == null) {
            }
            if (initiateExternalBankAccess != null) {
            }
            if (connectUrl != null) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e) {
            complete2.complete();
            java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, complete2);
            arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
            java.lang.Object obj3 = r12.get();
            if (obj3 != arrow.core.EmptyValue.INSTANCE) {
                raisedOrRethrow = invoke.invoke(obj3, raisedOrRethrow);
            }
            return new arrow.core.Ior.Left(raisedOrRethrow);
        } catch (java.lang.Throwable th) {
            complete.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        externalBankAccessRepositoryImpl$initiateExternalBankAccess$1 = new com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl$initiateExternalBankAccess$1(this, continuation);
        java.lang.Object obj4 = externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.isOutputSupportedFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = externalBankAccessRepositoryImpl$initiateExternalBankAccess$1.isOutputSupportedForhNQ4ISI;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01a9 A[Catch: all -> 0x0062, RaiseCancellationException -> 0x0065, TRY_ENTER, TRY_LEAVE, TryCatch #6 {RaiseCancellationException -> 0x0065, all -> 0x0062, blocks: (B:11:0x005d, B:12:0x01a3, B:15:0x01a9, B:16:0x01e8, B:18:0x01f6, B:20:0x01fe, B:22:0x0206, B:26:0x0211, B:27:0x021b, B:29:0x021c, B:31:0x0232, B:32:0x0238, B:34:0x0247, B:35:0x024d, B:37:0x026a, B:38:0x027b, B:40:0x0281, B:42:0x02b9, B:44:0x02bf, B:46:0x02c5, B:47:0x02d6, B:49:0x02dc, B:51:0x0314, B:53:0x031b, B:54:0x031f, B:56:0x0331, B:58:0x0339, B:71:0x01c6, B:72:0x01e2, B:73:0x01e7), top: B:10:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01f6 A[Catch: all -> 0x0062, RaiseCancellationException -> 0x0065, TryCatch #6 {RaiseCancellationException -> 0x0065, all -> 0x0062, blocks: (B:11:0x005d, B:12:0x01a3, B:15:0x01a9, B:16:0x01e8, B:18:0x01f6, B:20:0x01fe, B:22:0x0206, B:26:0x0211, B:27:0x021b, B:29:0x021c, B:31:0x0232, B:32:0x0238, B:34:0x0247, B:35:0x024d, B:37:0x026a, B:38:0x027b, B:40:0x0281, B:42:0x02b9, B:44:0x02bf, B:46:0x02c5, B:47:0x02d6, B:49:0x02dc, B:51:0x0314, B:53:0x031b, B:54:0x031f, B:56:0x0331, B:58:0x0339, B:71:0x01c6, B:72:0x01e2, B:73:0x01e7), top: B:10:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01fe A[Catch: all -> 0x0062, RaiseCancellationException -> 0x0065, TryCatch #6 {RaiseCancellationException -> 0x0065, all -> 0x0062, blocks: (B:11:0x005d, B:12:0x01a3, B:15:0x01a9, B:16:0x01e8, B:18:0x01f6, B:20:0x01fe, B:22:0x0206, B:26:0x0211, B:27:0x021b, B:29:0x021c, B:31:0x0232, B:32:0x0238, B:34:0x0247, B:35:0x024d, B:37:0x026a, B:38:0x027b, B:40:0x0281, B:42:0x02b9, B:44:0x02bf, B:46:0x02c5, B:47:0x02d6, B:49:0x02dc, B:51:0x0314, B:53:0x031b, B:54:0x031f, B:56:0x0331, B:58:0x0339, B:71:0x01c6, B:72:0x01e2, B:73:0x01e7), top: B:10:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0206 A[Catch: all -> 0x0062, RaiseCancellationException -> 0x0065, TryCatch #6 {RaiseCancellationException -> 0x0065, all -> 0x0062, blocks: (B:11:0x005d, B:12:0x01a3, B:15:0x01a9, B:16:0x01e8, B:18:0x01f6, B:20:0x01fe, B:22:0x0206, B:26:0x0211, B:27:0x021b, B:29:0x021c, B:31:0x0232, B:32:0x0238, B:34:0x0247, B:35:0x024d, B:37:0x026a, B:38:0x027b, B:40:0x0281, B:42:0x02b9, B:44:0x02bf, B:46:0x02c5, B:47:0x02d6, B:49:0x02dc, B:51:0x0314, B:53:0x031b, B:54:0x031f, B:56:0x0331, B:58:0x0339, B:71:0x01c6, B:72:0x01e2, B:73:0x01e7), top: B:10:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0232 A[Catch: all -> 0x0062, RaiseCancellationException -> 0x0065, TryCatch #6 {RaiseCancellationException -> 0x0065, all -> 0x0062, blocks: (B:11:0x005d, B:12:0x01a3, B:15:0x01a9, B:16:0x01e8, B:18:0x01f6, B:20:0x01fe, B:22:0x0206, B:26:0x0211, B:27:0x021b, B:29:0x021c, B:31:0x0232, B:32:0x0238, B:34:0x0247, B:35:0x024d, B:37:0x026a, B:38:0x027b, B:40:0x0281, B:42:0x02b9, B:44:0x02bf, B:46:0x02c5, B:47:0x02d6, B:49:0x02dc, B:51:0x0314, B:53:0x031b, B:54:0x031f, B:56:0x0331, B:58:0x0339, B:71:0x01c6, B:72:0x01e2, B:73:0x01e7), top: B:10:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0247 A[Catch: all -> 0x0062, RaiseCancellationException -> 0x0065, TryCatch #6 {RaiseCancellationException -> 0x0065, all -> 0x0062, blocks: (B:11:0x005d, B:12:0x01a3, B:15:0x01a9, B:16:0x01e8, B:18:0x01f6, B:20:0x01fe, B:22:0x0206, B:26:0x0211, B:27:0x021b, B:29:0x021c, B:31:0x0232, B:32:0x0238, B:34:0x0247, B:35:0x024d, B:37:0x026a, B:38:0x027b, B:40:0x0281, B:42:0x02b9, B:44:0x02bf, B:46:0x02c5, B:47:0x02d6, B:49:0x02dc, B:51:0x0314, B:53:0x031b, B:54:0x031f, B:56:0x0331, B:58:0x0339, B:71:0x01c6, B:72:0x01e2, B:73:0x01e7), top: B:10:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x026a A[Catch: all -> 0x0062, RaiseCancellationException -> 0x0065, TryCatch #6 {RaiseCancellationException -> 0x0065, all -> 0x0062, blocks: (B:11:0x005d, B:12:0x01a3, B:15:0x01a9, B:16:0x01e8, B:18:0x01f6, B:20:0x01fe, B:22:0x0206, B:26:0x0211, B:27:0x021b, B:29:0x021c, B:31:0x0232, B:32:0x0238, B:34:0x0247, B:35:0x024d, B:37:0x026a, B:38:0x027b, B:40:0x0281, B:42:0x02b9, B:44:0x02bf, B:46:0x02c5, B:47:0x02d6, B:49:0x02dc, B:51:0x0314, B:53:0x031b, B:54:0x031f, B:56:0x0331, B:58:0x0339, B:71:0x01c6, B:72:0x01e2, B:73:0x01e7), top: B:10:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02bf A[Catch: all -> 0x0062, RaiseCancellationException -> 0x0065, TryCatch #6 {RaiseCancellationException -> 0x0065, all -> 0x0062, blocks: (B:11:0x005d, B:12:0x01a3, B:15:0x01a9, B:16:0x01e8, B:18:0x01f6, B:20:0x01fe, B:22:0x0206, B:26:0x0211, B:27:0x021b, B:29:0x021c, B:31:0x0232, B:32:0x0238, B:34:0x0247, B:35:0x024d, B:37:0x026a, B:38:0x027b, B:40:0x0281, B:42:0x02b9, B:44:0x02bf, B:46:0x02c5, B:47:0x02d6, B:49:0x02dc, B:51:0x0314, B:53:0x031b, B:54:0x031f, B:56:0x0331, B:58:0x0339, B:71:0x01c6, B:72:0x01e2, B:73:0x01e7), top: B:10:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c5 A[Catch: all -> 0x0062, RaiseCancellationException -> 0x0065, TryCatch #6 {RaiseCancellationException -> 0x0065, all -> 0x0062, blocks: (B:11:0x005d, B:12:0x01a3, B:15:0x01a9, B:16:0x01e8, B:18:0x01f6, B:20:0x01fe, B:22:0x0206, B:26:0x0211, B:27:0x021b, B:29:0x021c, B:31:0x0232, B:32:0x0238, B:34:0x0247, B:35:0x024d, B:37:0x026a, B:38:0x027b, B:40:0x0281, B:42:0x02b9, B:44:0x02bf, B:46:0x02c5, B:47:0x02d6, B:49:0x02dc, B:51:0x0314, B:53:0x031b, B:54:0x031f, B:56:0x0331, B:58:0x0339, B:71:0x01c6, B:72:0x01e2, B:73:0x01e7), top: B:10:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x031b A[Catch: all -> 0x0062, RaiseCancellationException -> 0x0065, TryCatch #6 {RaiseCancellationException -> 0x0065, all -> 0x0062, blocks: (B:11:0x005d, B:12:0x01a3, B:15:0x01a9, B:16:0x01e8, B:18:0x01f6, B:20:0x01fe, B:22:0x0206, B:26:0x0211, B:27:0x021b, B:29:0x021c, B:31:0x0232, B:32:0x0238, B:34:0x0247, B:35:0x024d, B:37:0x026a, B:38:0x027b, B:40:0x0281, B:42:0x02b9, B:44:0x02bf, B:46:0x02c5, B:47:0x02d6, B:49:0x02dc, B:51:0x0314, B:53:0x031b, B:54:0x031f, B:56:0x0331, B:58:0x0339, B:71:0x01c6, B:72:0x01e2, B:73:0x01e7), top: B:10:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0331 A[Catch: all -> 0x0062, RaiseCancellationException -> 0x0065, TryCatch #6 {RaiseCancellationException -> 0x0065, all -> 0x0062, blocks: (B:11:0x005d, B:12:0x01a3, B:15:0x01a9, B:16:0x01e8, B:18:0x01f6, B:20:0x01fe, B:22:0x0206, B:26:0x0211, B:27:0x021b, B:29:0x021c, B:31:0x0232, B:32:0x0238, B:34:0x0247, B:35:0x024d, B:37:0x026a, B:38:0x027b, B:40:0x0281, B:42:0x02b9, B:44:0x02bf, B:46:0x02c5, B:47:0x02d6, B:49:0x02dc, B:51:0x0314, B:53:0x031b, B:54:0x031f, B:56:0x0331, B:58:0x0339, B:71:0x01c6, B:72:0x01e2, B:73:0x01e7), top: B:10:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0339 A[Catch: all -> 0x0062, RaiseCancellationException -> 0x0065, TRY_LEAVE, TryCatch #6 {RaiseCancellationException -> 0x0065, all -> 0x0062, blocks: (B:11:0x005d, B:12:0x01a3, B:15:0x01a9, B:16:0x01e8, B:18:0x01f6, B:20:0x01fe, B:22:0x0206, B:26:0x0211, B:27:0x021b, B:29:0x021c, B:31:0x0232, B:32:0x0238, B:34:0x0247, B:35:0x024d, B:37:0x026a, B:38:0x027b, B:40:0x0281, B:42:0x02b9, B:44:0x02bf, B:46:0x02c5, B:47:0x02d6, B:49:0x02dc, B:51:0x0314, B:53:0x031b, B:54:0x031f, B:56:0x0331, B:58:0x0339, B:71:0x01c6, B:72:0x01e2, B:73:0x01e7), top: B:10:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getExternalBankAccounts(com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsParams externalBankAccountsParams, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsResult>> continuation) {
        com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl$getExternalBankAccounts$1 externalBankAccessRepositoryImpl$getExternalBankAccounts$1;
        int i;
        kotlin.jvm.functions.Function2 function2;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        com.apollographql.apollo.api.Optional optional;
        com.apollographql.apollo.api.Optional optional2;
        arrow.core.raise.IorRaise iorRaise;
        arrow.core.raise.IorRaise iorRaise2;
        arrow.core.raise.DefaultRaise defaultRaise4;
        com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsParams externalBankAccountsParams2;
        java.util.concurrent.atomic.AtomicReference atomicReference3;
        java.lang.Object obj;
        arrow.core.Ior.Both both;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Item> items;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExistingBankAccount> existingBankAccounts;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        if (continuation instanceof com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl$getExternalBankAccounts$1) {
            externalBankAccessRepositoryImpl$getExternalBankAccounts$1 = (com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl$getExternalBankAccounts$1) continuation;
            if ((externalBankAccessRepositoryImpl$getExternalBankAccounts$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                externalBankAccessRepositoryImpl$getExternalBankAccounts$1.getOutputStallDurationlomOqCM -= 2147483648;
                com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl$getExternalBankAccounts$1 externalBankAccessRepositoryImpl$getExternalBankAccounts$12 = externalBankAccessRepositoryImpl$getExternalBankAccounts$1;
                java.lang.Object obj2 = externalBankAccessRepositoryImpl$getExternalBankAccounts$12.isOutputSupportedFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl.$r8$lambda$u5wwj9jUmy9du2zFfnGK_FCAmOk((com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) obj3, (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) obj4);
                        }
                    };
                    java.util.concurrent.atomic.AtomicReference atomicReference4 = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                    arrow.core.raise.DefaultRaise defaultRaise5 = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise6 = defaultRaise5;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference4, defaultRaise6);
                        java.lang.String credentialToken = externalBankAccountsParams.getCredentialToken();
                        com.paypal.oslo.api.graphql.schema.type.BankAggregatorName highSpeedVideoSizes = getHighSpeedVideoSizes(externalBankAccountsParams.getAggregator());
                        java.lang.String externalBankId = externalBankAccountsParams.getExternalBankId();
                        java.lang.String countryCode = externalBankAccountsParams.getCountryCode();
                        java.lang.String internalInstitutionId = externalBankAccountsParams.getInternalInstitutionId();
                        if (internalInstitutionId == null || (optional = com.apollographql.apollo.api.Optional.INSTANCE.present(internalInstitutionId)) == null) {
                            optional = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        }
                        com.apollographql.apollo.api.Optional optional3 = optional;
                        com.apollographql.apollo.api.Optional.Present present = com.apollographql.apollo.api.Optional.INSTANCE.present(getHighSpeedVideoSizes(externalBankAccountsParams.getIntegrationType()));
                        com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType credentialType = externalBankAccountsParams.getCredentialType();
                        com.paypal.oslo.api.graphql.schema.type.BankCredentialType highSpeedVideoSizes2 = credentialType != null ? getHighSpeedVideoSizes(credentialType) : null;
                        if (highSpeedVideoSizes2 == null || (optional2 = com.apollographql.apollo.api.Optional.INSTANCE.present(highSpeedVideoSizes2)) == null) {
                            optional2 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        }
                        com.paypal.oslo.api.graphql.schema.type.ExternalBankAccountsInput externalBankAccountsInput = new com.paypal.oslo.api.graphql.schema.type.ExternalBankAccountsInput(credentialToken, highSpeedVideoSizes, externalBankId, optional3, present, optional2, countryCode, com.apollographql.apollo.api.Optional.INSTANCE.present(getHighSpeedVideoFpsRanges(externalBankAccountsParams.getAddFIFlow())));
                        com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery getExternalBankAccountsQuery = new com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery(externalBankAccountsInput);
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                        java.util.Map<java.lang.String, ? extends java.lang.Object> mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("externalBankId", externalBankAccountsInput.getExternalBankId()));
                        kotlin.Pair[] pairArr = new kotlin.Pair[3];
                        pairArr[0] = kotlin.TuplesKt.to("aggregator", externalBankAccountsParams.getAggregator().name());
                        pairArr[1] = kotlin.TuplesKt.to("hasCredentialToken", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(externalBankAccountsParams.getCredentialToken().length() > 0));
                        pairArr[2] = kotlin.TuplesKt.to("countryCode", externalBankAccountsInput.getCountryCode().toString());
                        logger.i("[ExternalBankAccess] Fetching external bank accounts", kotlin.collections.MapsKt.mapOf(pairArr), mapOf);
                        com.apollographql.apollo.ApolloClient apolloClient = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery getExternalBankAccountsQuery2 = getExternalBankAccountsQuery;
                        externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getOutputFormats = externalBankAccountsParams;
                        externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getInputFormats = function2;
                        externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getHighSpeedVideoSizesFor = atomicReference4;
                        externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getInputSizeshNQ4ISI = defaultRaise5;
                        externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise6);
                        externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getOutputMinFrameDurationlomOqCM = iorRaise3;
                        externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(externalBankAccountsInput);
                        externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getExternalBankAccountsQuery);
                        externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getOutputSizeshNQ4ISI = iorRaise3;
                        externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getHighResolutionOutputSizeshNQ4ISI = 0;
                        externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getHighSpeedVideoFpsRangesFor = 0;
                        externalBankAccessRepositoryImpl$getExternalBankAccounts$12.Camera2StreamConfigurationMap = 0;
                        externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getHighSpeedVideoFpsRanges = 0;
                        externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getHighSpeedVideoSizes = 0;
                        externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getOutputStallDurationlomOqCM = 1;
                        defaultRaise = defaultRaise5;
                        atomicReference = atomicReference4;
                        try {
                            obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, getExternalBankAccountsQuery2, (com.paypal.oslo.core.network.graphql.CallConfig) null, externalBankAccessRepositoryImpl$getExternalBankAccounts$12, 2, (java.lang.Object) null);
                            if (obj2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            iorRaise = iorRaise3;
                            iorRaise2 = iorRaise;
                            defaultRaise4 = defaultRaise;
                            externalBankAccountsParams2 = externalBankAccountsParams;
                            atomicReference3 = atomicReference;
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise3 = defaultRaise;
                            atomicReference2 = atomicReference;
                            defaultRaise3.complete();
                            java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise3);
                            arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                            obj = atomicReference2.get();
                            if (obj != arrow.core.EmptyValue.INSTANCE) {
                            }
                            return new arrow.core.Ior.Left(raisedOrRethrow);
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise2 = defaultRaise;
                            defaultRaise2.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise5;
                        atomicReference = atomicReference4;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise5;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getHighSpeedVideoSizes;
                    int i3 = externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getHighSpeedVideoFpsRanges;
                    int i4 = externalBankAccessRepositoryImpl$getExternalBankAccounts$12.Camera2StreamConfigurationMap;
                    int i5 = externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getHighSpeedVideoFpsRangesFor;
                    int i6 = externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getHighResolutionOutputSizeshNQ4ISI;
                    iorRaise = (arrow.core.raise.IorRaise) externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getOutputSizeshNQ4ISI;
                    iorRaise2 = (arrow.core.raise.IorRaise) externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getOutputMinFrameDurationlomOqCM;
                    defaultRaise4 = (arrow.core.raise.DefaultRaise) externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getInputSizeshNQ4ISI;
                    atomicReference3 = (java.util.concurrent.atomic.AtomicReference) externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getHighSpeedVideoSizesFor;
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getInputFormats;
                    externalBankAccountsParams2 = (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsParams) externalBankAccessRepositoryImpl$getExternalBankAccounts$12.getOutputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                    } catch (arrow.core.raise.RaiseCancellationException e3) {
                        e = e3;
                        atomicReference2 = atomicReference3;
                        function2 = function22;
                        defaultRaise3 = defaultRaise4;
                        defaultRaise3.complete();
                        java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise3);
                        arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
                        obj = atomicReference2.get();
                        if (obj != arrow.core.EmptyValue.INSTANCE) {
                            raisedOrRethrow2 = function2.invoke(obj, raisedOrRethrow2);
                        }
                        return new arrow.core.Ior.Left(raisedOrRethrow2);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        defaultRaise2 = defaultRaise4;
                        defaultRaise2.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                both = (arrow.core.Ior) obj2;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.wallet.banks.data.error.CallErrorMapperKt.toExternalBankAccessError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.wallet.banks.data.error.CallErrorMapperKt.toExternalBankAccessError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                }
                com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Data data = (com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both)).getData();
                com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExternalBankAccounts externalBankAccounts = data == null ? data.getExternalBankAccounts() : null;
                items = externalBankAccounts == null ? externalBankAccounts.getItems() : null;
                existingBankAccounts = externalBankAccounts == null ? externalBankAccounts.getExistingBankAccounts() : null;
                if (items == null && existingBankAccounts == null) {
                    iorRaise2.raise(com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.NoBankAccountsAvailable.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
                pairArr2[0] = kotlin.TuplesKt.to("aggregator", externalBankAccountsParams2.getAggregator().name());
                pairArr2[1] = kotlin.TuplesKt.to("itemsCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(items == null ? items.size() : 0));
                pairArr2[2] = kotlin.TuplesKt.to("existingAccountsCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(existingBankAccounts == null ? existingBankAccounts.size() : 0));
                com.paypal.android.logger.Logger.i$default(logger2, "[ExternalBankAccess] External bank accounts retrieved successfully", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                if (items == null) {
                    java.util.List<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Item> list = items;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Item item : list) {
                        arrayList3.add(new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountCandidate(item.getId(), item.getLastNChars(), getHighSpeedVideoFpsRangesFor(item.getType()), new com.paypal.oslo.feature.wallet.banks.domain.model.BankIssuer(item.getIssuer().getName(), item.getIssuer().getCountryCode().toString())));
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = kotlin.collections.CollectionsKt.emptyList();
                }
                if (existingBankAccounts == null) {
                    java.util.List<com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExistingBankAccount> list2 = existingBankAccounts;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.ExistingBankAccount existingBankAccount : list2) {
                        arrayList4.add(new com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccount(existingBankAccount.getId(), existingBankAccount.getLastNChars(), new com.paypal.oslo.feature.wallet.banks.domain.model.BankIssuer(existingBankAccount.getIssuer().getName(), existingBankAccount.getIssuer().getCountryCode().toString()), getHighSpeedVideoFpsRangesFor(existingBankAccount.getType())));
                    }
                    arrayList2 = arrayList4;
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 == null) {
                    arrayList2 = kotlin.collections.CollectionsKt.emptyList();
                }
                com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsResult externalBankAccountsResult = new com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsResult(arrayList, arrayList2);
                defaultRaise4.complete();
                arrow.core.EmptyValue emptyValue3 = arrow.core.EmptyValue.INSTANCE;
                java.lang.Object obj3 = atomicReference3.get();
                return obj3 != arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(externalBankAccountsResult) : new arrow.core.Ior.Both(obj3, externalBankAccountsResult);
            }
        }
        externalBankAccessRepositoryImpl$getExternalBankAccounts$1 = new com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl$getExternalBankAccounts$1(this, continuation);
        com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl$getExternalBankAccounts$1 externalBankAccessRepositoryImpl$getExternalBankAccounts$122 = externalBankAccessRepositoryImpl$getExternalBankAccounts$1;
        java.lang.Object obj22 = externalBankAccessRepositoryImpl$getExternalBankAccounts$122.isOutputSupportedFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = externalBankAccessRepositoryImpl$getExternalBankAccounts$122.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj22;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Data data2 = (com.paypal.oslo.feature.wallet.graphql.GetExternalBankAccountsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both)).getData();
        if (data2 == null) {
        }
        if (externalBankAccounts == null) {
        }
        if (externalBankAccounts == null) {
        }
        if (items == null) {
            iorRaise2.raise(com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.NoBankAccountsAvailable.INSTANCE);
            throw new kotlin.KotlinNothingValueException();
        }
        com.paypal.android.logger.Logger logger22 = com.paypal.oslo.feature.wallet.LoggerKt.log;
        kotlin.Pair[] pairArr22 = new kotlin.Pair[3];
        pairArr22[0] = kotlin.TuplesKt.to("aggregator", externalBankAccountsParams2.getAggregator().name());
        pairArr22[1] = kotlin.TuplesKt.to("itemsCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(items == null ? items.size() : 0));
        pairArr22[2] = kotlin.TuplesKt.to("existingAccountsCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(existingBankAccounts == null ? existingBankAccounts.size() : 0));
        com.paypal.android.logger.Logger.i$default(logger22, "[ExternalBankAccess] External bank accounts retrieved successfully", kotlin.collections.MapsKt.mapOf(pairArr22), null, 4, null);
        if (items == null) {
        }
        if (arrayList == null) {
        }
        if (existingBankAccounts == null) {
        }
        if (arrayList2 == null) {
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsResult externalBankAccountsResult2 = new com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccountsResult(arrayList, arrayList2);
        defaultRaise4.complete();
        arrow.core.EmptyValue emptyValue32 = arrow.core.EmptyValue.INSTANCE;
        java.lang.Object obj32 = atomicReference3.get();
        if (obj32 != arrow.core.EmptyValue.INSTANCE) {
        }
    }

    /* JADX WARN: Not initialized variable reg: 13, insn: 0x05af: INVOKE (r13 I:arrow.core.raise.DefaultRaise) VIRTUAL call: arrow.core.raise.DefaultRaise.complete():boolean A[MD:():boolean (m)] (LINE:633), block:B:216:0x05ae */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x05b9: INVOKE (r13 I:arrow.core.raise.DefaultRaise) VIRTUAL call: arrow.core.raise.DefaultRaise.complete():boolean A[MD:():boolean (m)] (LINE:624), block:B:210:0x05b8 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x05c4: INVOKE (r2 I:java.lang.Object) = (r14 I:java.util.concurrent.atomic.AtomicReference) VIRTUAL call: java.util.concurrent.atomic.AtomicReference.get():java.lang.Object A[MD:():V (c)], block:B:210:0x05b8 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x05cc: INVOKE (r1 I:java.lang.Object) = (r15 I:kotlin.jvm.functions.Function2), (r2 I:java.lang.Object), (r1 I:java.lang.Object) INTERFACE call: kotlin.jvm.functions.Function2.invoke(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(P1, P2):R (m)] (LINE:627), block:B:212:0x05cc */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0571 A[Catch: all -> 0x05ad, RaiseCancellationException -> 0x05b7, TryCatch #2 {RaiseCancellationException -> 0x05b7, all -> 0x05ad, blocks: (B:11:0x0061, B:13:0x0217, B:16:0x021d, B:17:0x025c, B:20:0x0279, B:22:0x028e, B:25:0x0299, B:27:0x02ba, B:29:0x02c2, B:31:0x02ca, B:33:0x02d2, B:35:0x02da, B:37:0x02fd, B:38:0x030d, B:40:0x0313, B:42:0x0322, B:49:0x032a, B:45:0x032e, B:53:0x0332, B:54:0x0353, B:56:0x0359, B:58:0x0368, B:60:0x0370, B:63:0x0374, B:66:0x037a, B:67:0x0398, B:69:0x039e, B:76:0x03c8, B:79:0x03e9, B:84:0x03bd, B:86:0x03c0, B:88:0x03ed, B:89:0x0402, B:91:0x0408, B:93:0x0414, B:95:0x041a, B:98:0x0422, B:101:0x0446, B:103:0x044e, B:104:0x0457, B:106:0x045d, B:108:0x0463, B:109:0x046c, B:111:0x0472, B:113:0x0478, B:115:0x0481, B:121:0x0497, B:122:0x049f, B:124:0x04a5, B:128:0x04c9, B:131:0x04e2, B:133:0x0522, B:134:0x0528, B:136:0x0545, B:138:0x054d, B:139:0x0551, B:141:0x0561, B:144:0x0569, B:148:0x0571, B:149:0x05ac, B:162:0x023a, B:163:0x0256, B:164:0x025b, B:168:0x0084, B:170:0x00b6, B:171:0x00cb, B:175:0x00dd, B:176:0x0106, B:177:0x010b, B:178:0x010c, B:179:0x0111, B:181:0x0119, B:184:0x0124, B:186:0x012e, B:188:0x0136, B:191:0x0141, B:193:0x014b, B:195:0x0153, B:198:0x015e, B:202:0x015c, B:204:0x013f, B:206:0x0122, B:207:0x010f, B:208:0x00bd), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x021d A[Catch: all -> 0x05ad, RaiseCancellationException -> 0x05b7, TRY_ENTER, TRY_LEAVE, TryCatch #2 {RaiseCancellationException -> 0x05b7, all -> 0x05ad, blocks: (B:11:0x0061, B:13:0x0217, B:16:0x021d, B:17:0x025c, B:20:0x0279, B:22:0x028e, B:25:0x0299, B:27:0x02ba, B:29:0x02c2, B:31:0x02ca, B:33:0x02d2, B:35:0x02da, B:37:0x02fd, B:38:0x030d, B:40:0x0313, B:42:0x0322, B:49:0x032a, B:45:0x032e, B:53:0x0332, B:54:0x0353, B:56:0x0359, B:58:0x0368, B:60:0x0370, B:63:0x0374, B:66:0x037a, B:67:0x0398, B:69:0x039e, B:76:0x03c8, B:79:0x03e9, B:84:0x03bd, B:86:0x03c0, B:88:0x03ed, B:89:0x0402, B:91:0x0408, B:93:0x0414, B:95:0x041a, B:98:0x0422, B:101:0x0446, B:103:0x044e, B:104:0x0457, B:106:0x045d, B:108:0x0463, B:109:0x046c, B:111:0x0472, B:113:0x0478, B:115:0x0481, B:121:0x0497, B:122:0x049f, B:124:0x04a5, B:128:0x04c9, B:131:0x04e2, B:133:0x0522, B:134:0x0528, B:136:0x0545, B:138:0x054d, B:139:0x0551, B:141:0x0561, B:144:0x0569, B:148:0x0571, B:149:0x05ac, B:162:0x023a, B:163:0x0256, B:164:0x025b, B:168:0x0084, B:170:0x00b6, B:171:0x00cb, B:175:0x00dd, B:176:0x0106, B:177:0x010b, B:178:0x010c, B:179:0x0111, B:181:0x0119, B:184:0x0124, B:186:0x012e, B:188:0x0136, B:191:0x0141, B:193:0x014b, B:195:0x0153, B:198:0x015e, B:202:0x015c, B:204:0x013f, B:206:0x0122, B:207:0x010f, B:208:0x00bd), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x012e A[Catch: all -> 0x05ad, RaiseCancellationException -> 0x05b7, TryCatch #2 {RaiseCancellationException -> 0x05b7, all -> 0x05ad, blocks: (B:11:0x0061, B:13:0x0217, B:16:0x021d, B:17:0x025c, B:20:0x0279, B:22:0x028e, B:25:0x0299, B:27:0x02ba, B:29:0x02c2, B:31:0x02ca, B:33:0x02d2, B:35:0x02da, B:37:0x02fd, B:38:0x030d, B:40:0x0313, B:42:0x0322, B:49:0x032a, B:45:0x032e, B:53:0x0332, B:54:0x0353, B:56:0x0359, B:58:0x0368, B:60:0x0370, B:63:0x0374, B:66:0x037a, B:67:0x0398, B:69:0x039e, B:76:0x03c8, B:79:0x03e9, B:84:0x03bd, B:86:0x03c0, B:88:0x03ed, B:89:0x0402, B:91:0x0408, B:93:0x0414, B:95:0x041a, B:98:0x0422, B:101:0x0446, B:103:0x044e, B:104:0x0457, B:106:0x045d, B:108:0x0463, B:109:0x046c, B:111:0x0472, B:113:0x0478, B:115:0x0481, B:121:0x0497, B:122:0x049f, B:124:0x04a5, B:128:0x04c9, B:131:0x04e2, B:133:0x0522, B:134:0x0528, B:136:0x0545, B:138:0x054d, B:139:0x0551, B:141:0x0561, B:144:0x0569, B:148:0x0571, B:149:0x05ac, B:162:0x023a, B:163:0x0256, B:164:0x025b, B:168:0x0084, B:170:0x00b6, B:171:0x00cb, B:175:0x00dd, B:176:0x0106, B:177:0x010b, B:178:0x010c, B:179:0x0111, B:181:0x0119, B:184:0x0124, B:186:0x012e, B:188:0x0136, B:191:0x0141, B:193:0x014b, B:195:0x0153, B:198:0x015e, B:202:0x015c, B:204:0x013f, B:206:0x0122, B:207:0x010f, B:208:0x00bd), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x014b A[Catch: all -> 0x05ad, RaiseCancellationException -> 0x05b7, TryCatch #2 {RaiseCancellationException -> 0x05b7, all -> 0x05ad, blocks: (B:11:0x0061, B:13:0x0217, B:16:0x021d, B:17:0x025c, B:20:0x0279, B:22:0x028e, B:25:0x0299, B:27:0x02ba, B:29:0x02c2, B:31:0x02ca, B:33:0x02d2, B:35:0x02da, B:37:0x02fd, B:38:0x030d, B:40:0x0313, B:42:0x0322, B:49:0x032a, B:45:0x032e, B:53:0x0332, B:54:0x0353, B:56:0x0359, B:58:0x0368, B:60:0x0370, B:63:0x0374, B:66:0x037a, B:67:0x0398, B:69:0x039e, B:76:0x03c8, B:79:0x03e9, B:84:0x03bd, B:86:0x03c0, B:88:0x03ed, B:89:0x0402, B:91:0x0408, B:93:0x0414, B:95:0x041a, B:98:0x0422, B:101:0x0446, B:103:0x044e, B:104:0x0457, B:106:0x045d, B:108:0x0463, B:109:0x046c, B:111:0x0472, B:113:0x0478, B:115:0x0481, B:121:0x0497, B:122:0x049f, B:124:0x04a5, B:128:0x04c9, B:131:0x04e2, B:133:0x0522, B:134:0x0528, B:136:0x0545, B:138:0x054d, B:139:0x0551, B:141:0x0561, B:144:0x0569, B:148:0x0571, B:149:0x05ac, B:162:0x023a, B:163:0x0256, B:164:0x025b, B:168:0x0084, B:170:0x00b6, B:171:0x00cb, B:175:0x00dd, B:176:0x0106, B:177:0x010b, B:178:0x010c, B:179:0x0111, B:181:0x0119, B:184:0x0124, B:186:0x012e, B:188:0x0136, B:191:0x0141, B:193:0x014b, B:195:0x0153, B:198:0x015e, B:202:0x015c, B:204:0x013f, B:206:0x0122, B:207:0x010f, B:208:0x00bd), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0213 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x028e A[Catch: all -> 0x05ad, RaiseCancellationException -> 0x05b7, TryCatch #2 {RaiseCancellationException -> 0x05b7, all -> 0x05ad, blocks: (B:11:0x0061, B:13:0x0217, B:16:0x021d, B:17:0x025c, B:20:0x0279, B:22:0x028e, B:25:0x0299, B:27:0x02ba, B:29:0x02c2, B:31:0x02ca, B:33:0x02d2, B:35:0x02da, B:37:0x02fd, B:38:0x030d, B:40:0x0313, B:42:0x0322, B:49:0x032a, B:45:0x032e, B:53:0x0332, B:54:0x0353, B:56:0x0359, B:58:0x0368, B:60:0x0370, B:63:0x0374, B:66:0x037a, B:67:0x0398, B:69:0x039e, B:76:0x03c8, B:79:0x03e9, B:84:0x03bd, B:86:0x03c0, B:88:0x03ed, B:89:0x0402, B:91:0x0408, B:93:0x0414, B:95:0x041a, B:98:0x0422, B:101:0x0446, B:103:0x044e, B:104:0x0457, B:106:0x045d, B:108:0x0463, B:109:0x046c, B:111:0x0472, B:113:0x0478, B:115:0x0481, B:121:0x0497, B:122:0x049f, B:124:0x04a5, B:128:0x04c9, B:131:0x04e2, B:133:0x0522, B:134:0x0528, B:136:0x0545, B:138:0x054d, B:139:0x0551, B:141:0x0561, B:144:0x0569, B:148:0x0571, B:149:0x05ac, B:162:0x023a, B:163:0x0256, B:164:0x025b, B:168:0x0084, B:170:0x00b6, B:171:0x00cb, B:175:0x00dd, B:176:0x0106, B:177:0x010b, B:178:0x010c, B:179:0x0111, B:181:0x0119, B:184:0x0124, B:186:0x012e, B:188:0x0136, B:191:0x0141, B:193:0x014b, B:195:0x0153, B:198:0x015e, B:202:0x015c, B:204:0x013f, B:206:0x0122, B:207:0x010f, B:208:0x00bd), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02ba A[Catch: all -> 0x05ad, RaiseCancellationException -> 0x05b7, TryCatch #2 {RaiseCancellationException -> 0x05b7, all -> 0x05ad, blocks: (B:11:0x0061, B:13:0x0217, B:16:0x021d, B:17:0x025c, B:20:0x0279, B:22:0x028e, B:25:0x0299, B:27:0x02ba, B:29:0x02c2, B:31:0x02ca, B:33:0x02d2, B:35:0x02da, B:37:0x02fd, B:38:0x030d, B:40:0x0313, B:42:0x0322, B:49:0x032a, B:45:0x032e, B:53:0x0332, B:54:0x0353, B:56:0x0359, B:58:0x0368, B:60:0x0370, B:63:0x0374, B:66:0x037a, B:67:0x0398, B:69:0x039e, B:76:0x03c8, B:79:0x03e9, B:84:0x03bd, B:86:0x03c0, B:88:0x03ed, B:89:0x0402, B:91:0x0408, B:93:0x0414, B:95:0x041a, B:98:0x0422, B:101:0x0446, B:103:0x044e, B:104:0x0457, B:106:0x045d, B:108:0x0463, B:109:0x046c, B:111:0x0472, B:113:0x0478, B:115:0x0481, B:121:0x0497, B:122:0x049f, B:124:0x04a5, B:128:0x04c9, B:131:0x04e2, B:133:0x0522, B:134:0x0528, B:136:0x0545, B:138:0x054d, B:139:0x0551, B:141:0x0561, B:144:0x0569, B:148:0x0571, B:149:0x05ac, B:162:0x023a, B:163:0x0256, B:164:0x025b, B:168:0x0084, B:170:0x00b6, B:171:0x00cb, B:175:0x00dd, B:176:0x0106, B:177:0x010b, B:178:0x010c, B:179:0x0111, B:181:0x0119, B:184:0x0124, B:186:0x012e, B:188:0x0136, B:191:0x0141, B:193:0x014b, B:195:0x0153, B:198:0x015e, B:202:0x015c, B:204:0x013f, B:206:0x0122, B:207:0x010f, B:208:0x00bd), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02c2 A[Catch: all -> 0x05ad, RaiseCancellationException -> 0x05b7, TryCatch #2 {RaiseCancellationException -> 0x05b7, all -> 0x05ad, blocks: (B:11:0x0061, B:13:0x0217, B:16:0x021d, B:17:0x025c, B:20:0x0279, B:22:0x028e, B:25:0x0299, B:27:0x02ba, B:29:0x02c2, B:31:0x02ca, B:33:0x02d2, B:35:0x02da, B:37:0x02fd, B:38:0x030d, B:40:0x0313, B:42:0x0322, B:49:0x032a, B:45:0x032e, B:53:0x0332, B:54:0x0353, B:56:0x0359, B:58:0x0368, B:60:0x0370, B:63:0x0374, B:66:0x037a, B:67:0x0398, B:69:0x039e, B:76:0x03c8, B:79:0x03e9, B:84:0x03bd, B:86:0x03c0, B:88:0x03ed, B:89:0x0402, B:91:0x0408, B:93:0x0414, B:95:0x041a, B:98:0x0422, B:101:0x0446, B:103:0x044e, B:104:0x0457, B:106:0x045d, B:108:0x0463, B:109:0x046c, B:111:0x0472, B:113:0x0478, B:115:0x0481, B:121:0x0497, B:122:0x049f, B:124:0x04a5, B:128:0x04c9, B:131:0x04e2, B:133:0x0522, B:134:0x0528, B:136:0x0545, B:138:0x054d, B:139:0x0551, B:141:0x0561, B:144:0x0569, B:148:0x0571, B:149:0x05ac, B:162:0x023a, B:163:0x0256, B:164:0x025b, B:168:0x0084, B:170:0x00b6, B:171:0x00cb, B:175:0x00dd, B:176:0x0106, B:177:0x010b, B:178:0x010c, B:179:0x0111, B:181:0x0119, B:184:0x0124, B:186:0x012e, B:188:0x0136, B:191:0x0141, B:193:0x014b, B:195:0x0153, B:198:0x015e, B:202:0x015c, B:204:0x013f, B:206:0x0122, B:207:0x010f, B:208:0x00bd), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02ca A[Catch: all -> 0x05ad, RaiseCancellationException -> 0x05b7, TryCatch #2 {RaiseCancellationException -> 0x05b7, all -> 0x05ad, blocks: (B:11:0x0061, B:13:0x0217, B:16:0x021d, B:17:0x025c, B:20:0x0279, B:22:0x028e, B:25:0x0299, B:27:0x02ba, B:29:0x02c2, B:31:0x02ca, B:33:0x02d2, B:35:0x02da, B:37:0x02fd, B:38:0x030d, B:40:0x0313, B:42:0x0322, B:49:0x032a, B:45:0x032e, B:53:0x0332, B:54:0x0353, B:56:0x0359, B:58:0x0368, B:60:0x0370, B:63:0x0374, B:66:0x037a, B:67:0x0398, B:69:0x039e, B:76:0x03c8, B:79:0x03e9, B:84:0x03bd, B:86:0x03c0, B:88:0x03ed, B:89:0x0402, B:91:0x0408, B:93:0x0414, B:95:0x041a, B:98:0x0422, B:101:0x0446, B:103:0x044e, B:104:0x0457, B:106:0x045d, B:108:0x0463, B:109:0x046c, B:111:0x0472, B:113:0x0478, B:115:0x0481, B:121:0x0497, B:122:0x049f, B:124:0x04a5, B:128:0x04c9, B:131:0x04e2, B:133:0x0522, B:134:0x0528, B:136:0x0545, B:138:0x054d, B:139:0x0551, B:141:0x0561, B:144:0x0569, B:148:0x0571, B:149:0x05ac, B:162:0x023a, B:163:0x0256, B:164:0x025b, B:168:0x0084, B:170:0x00b6, B:171:0x00cb, B:175:0x00dd, B:176:0x0106, B:177:0x010b, B:178:0x010c, B:179:0x0111, B:181:0x0119, B:184:0x0124, B:186:0x012e, B:188:0x0136, B:191:0x0141, B:193:0x014b, B:195:0x0153, B:198:0x015e, B:202:0x015c, B:204:0x013f, B:206:0x0122, B:207:0x010f, B:208:0x00bd), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02d2 A[Catch: all -> 0x05ad, RaiseCancellationException -> 0x05b7, TryCatch #2 {RaiseCancellationException -> 0x05b7, all -> 0x05ad, blocks: (B:11:0x0061, B:13:0x0217, B:16:0x021d, B:17:0x025c, B:20:0x0279, B:22:0x028e, B:25:0x0299, B:27:0x02ba, B:29:0x02c2, B:31:0x02ca, B:33:0x02d2, B:35:0x02da, B:37:0x02fd, B:38:0x030d, B:40:0x0313, B:42:0x0322, B:49:0x032a, B:45:0x032e, B:53:0x0332, B:54:0x0353, B:56:0x0359, B:58:0x0368, B:60:0x0370, B:63:0x0374, B:66:0x037a, B:67:0x0398, B:69:0x039e, B:76:0x03c8, B:79:0x03e9, B:84:0x03bd, B:86:0x03c0, B:88:0x03ed, B:89:0x0402, B:91:0x0408, B:93:0x0414, B:95:0x041a, B:98:0x0422, B:101:0x0446, B:103:0x044e, B:104:0x0457, B:106:0x045d, B:108:0x0463, B:109:0x046c, B:111:0x0472, B:113:0x0478, B:115:0x0481, B:121:0x0497, B:122:0x049f, B:124:0x04a5, B:128:0x04c9, B:131:0x04e2, B:133:0x0522, B:134:0x0528, B:136:0x0545, B:138:0x054d, B:139:0x0551, B:141:0x0561, B:144:0x0569, B:148:0x0571, B:149:0x05ac, B:162:0x023a, B:163:0x0256, B:164:0x025b, B:168:0x0084, B:170:0x00b6, B:171:0x00cb, B:175:0x00dd, B:176:0x0106, B:177:0x010b, B:178:0x010c, B:179:0x0111, B:181:0x0119, B:184:0x0124, B:186:0x012e, B:188:0x0136, B:191:0x0141, B:193:0x014b, B:195:0x0153, B:198:0x015e, B:202:0x015c, B:204:0x013f, B:206:0x0122, B:207:0x010f, B:208:0x00bd), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02da A[Catch: all -> 0x05ad, RaiseCancellationException -> 0x05b7, TRY_LEAVE, TryCatch #2 {RaiseCancellationException -> 0x05b7, all -> 0x05ad, blocks: (B:11:0x0061, B:13:0x0217, B:16:0x021d, B:17:0x025c, B:20:0x0279, B:22:0x028e, B:25:0x0299, B:27:0x02ba, B:29:0x02c2, B:31:0x02ca, B:33:0x02d2, B:35:0x02da, B:37:0x02fd, B:38:0x030d, B:40:0x0313, B:42:0x0322, B:49:0x032a, B:45:0x032e, B:53:0x0332, B:54:0x0353, B:56:0x0359, B:58:0x0368, B:60:0x0370, B:63:0x0374, B:66:0x037a, B:67:0x0398, B:69:0x039e, B:76:0x03c8, B:79:0x03e9, B:84:0x03bd, B:86:0x03c0, B:88:0x03ed, B:89:0x0402, B:91:0x0408, B:93:0x0414, B:95:0x041a, B:98:0x0422, B:101:0x0446, B:103:0x044e, B:104:0x0457, B:106:0x045d, B:108:0x0463, B:109:0x046c, B:111:0x0472, B:113:0x0478, B:115:0x0481, B:121:0x0497, B:122:0x049f, B:124:0x04a5, B:128:0x04c9, B:131:0x04e2, B:133:0x0522, B:134:0x0528, B:136:0x0545, B:138:0x054d, B:139:0x0551, B:141:0x0561, B:144:0x0569, B:148:0x0571, B:149:0x05ac, B:162:0x023a, B:163:0x0256, B:164:0x025b, B:168:0x0084, B:170:0x00b6, B:171:0x00cb, B:175:0x00dd, B:176:0x0106, B:177:0x010b, B:178:0x010c, B:179:0x0111, B:181:0x0119, B:184:0x0124, B:186:0x012e, B:188:0x0136, B:191:0x0141, B:193:0x014b, B:195:0x0153, B:198:0x015e, B:202:0x015c, B:204:0x013f, B:206:0x0122, B:207:0x010f, B:208:0x00bd), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02fd A[Catch: all -> 0x05ad, RaiseCancellationException -> 0x05b7, TRY_ENTER, TryCatch #2 {RaiseCancellationException -> 0x05b7, all -> 0x05ad, blocks: (B:11:0x0061, B:13:0x0217, B:16:0x021d, B:17:0x025c, B:20:0x0279, B:22:0x028e, B:25:0x0299, B:27:0x02ba, B:29:0x02c2, B:31:0x02ca, B:33:0x02d2, B:35:0x02da, B:37:0x02fd, B:38:0x030d, B:40:0x0313, B:42:0x0322, B:49:0x032a, B:45:0x032e, B:53:0x0332, B:54:0x0353, B:56:0x0359, B:58:0x0368, B:60:0x0370, B:63:0x0374, B:66:0x037a, B:67:0x0398, B:69:0x039e, B:76:0x03c8, B:79:0x03e9, B:84:0x03bd, B:86:0x03c0, B:88:0x03ed, B:89:0x0402, B:91:0x0408, B:93:0x0414, B:95:0x041a, B:98:0x0422, B:101:0x0446, B:103:0x044e, B:104:0x0457, B:106:0x045d, B:108:0x0463, B:109:0x046c, B:111:0x0472, B:113:0x0478, B:115:0x0481, B:121:0x0497, B:122:0x049f, B:124:0x04a5, B:128:0x04c9, B:131:0x04e2, B:133:0x0522, B:134:0x0528, B:136:0x0545, B:138:0x054d, B:139:0x0551, B:141:0x0561, B:144:0x0569, B:148:0x0571, B:149:0x05ac, B:162:0x023a, B:163:0x0256, B:164:0x025b, B:168:0x0084, B:170:0x00b6, B:171:0x00cb, B:175:0x00dd, B:176:0x0106, B:177:0x010b, B:178:0x010c, B:179:0x0111, B:181:0x0119, B:184:0x0124, B:186:0x012e, B:188:0x0136, B:191:0x0141, B:193:0x014b, B:195:0x0153, B:198:0x015e, B:202:0x015c, B:204:0x013f, B:206:0x0122, B:207:0x010f, B:208:0x00bd), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0398 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.jvm.functions.Function2] */
    @Override // com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object linkExternalBankAccounts(com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsParams linkExternalBankAccountsParams, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError, com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult>> continuation) {
        com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl$linkExternalBankAccounts$1 externalBankAccessRepositoryImpl$linkExternalBankAccounts$1;
        int i;
        arrow.core.raise.DefaultRaise complete;
        arrow.core.raise.DefaultRaise complete2;
        ?? r14;
        ?? invoke;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        arrow.core.raise.DefaultRaise defaultRaise;
        com.apollographql.apollo.api.Optional present;
        com.paypal.oslo.api.graphql.schema.type.BankOperationMode bankOperationMode;
        java.lang.String internalInstitutionId;
        com.paypal.oslo.api.graphql.schema.type.BankIntegrationType highSpeedVideoSizes;
        com.paypal.oslo.api.graphql.schema.type.BankCredentialType highSpeedVideoSizes2;
        java.lang.Object obj;
        arrow.core.raise.IorRaise iorRaise;
        java.lang.String str;
        arrow.core.raise.IorRaise iorRaise2;
        arrow.core.Ior.Both both;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item> items;
        com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.InlineLogoImageData inlineLogoImageData;
        java.lang.String str2;
        com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Issuer issuer;
        com.paypal.oslo.api.graphql.schema.type.BankAccountType type;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction bankAccountAction;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction bankAccountAction2;
        com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult linkedBankAccountResult;
        try {
            if (continuation instanceof com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl$linkExternalBankAccounts$1) {
                externalBankAccessRepositoryImpl$linkExternalBankAccounts$1 = (com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl$linkExternalBankAccounts$1) continuation;
                if ((externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.toString & Integer.MIN_VALUE) != 0) {
                    externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.toString -= 2147483648;
                    java.lang.Object obj2 = externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.isOutputSupportedFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.toString;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                                return com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl.$r8$lambda$m_UG2kthACFAQhqDUDOzrUUMziQ((com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) obj3, (com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError) obj4);
                            }
                        };
                        atomicReference = new java.util.concurrent.atomic.AtomicReference(arrow.core.EmptyValue.INSTANCE);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        arrow.core.raise.IorRaise iorRaise3 = new arrow.core.raise.IorRaise(function2, atomicReference, defaultRaise2);
                        java.lang.String name2 = linkExternalBankAccountsParams.getAggregator().name();
                        java.lang.String credentialToken = linkExternalBankAccountsParams.getCredentialToken();
                        com.paypal.oslo.api.graphql.schema.type.BankAggregatorName highSpeedVideoSizes3 = getHighSpeedVideoSizes(linkExternalBankAccountsParams.getAggregator());
                        java.lang.String externalBankId = linkExternalBankAccountsParams.getExternalBankId();
                        java.lang.String countryCode = linkExternalBankAccountsParams.getCountryCode();
                        java.lang.String bankName = linkExternalBankAccountsParams.getBankName();
                        if (linkExternalBankAccountsParams.getBankAccountCandidateIds().isEmpty()) {
                            present = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        } else {
                            present = com.apollographql.apollo.api.Optional.INSTANCE.present(linkExternalBankAccountsParams.getBankAccountCandidateIds());
                        }
                        int i2 = com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl.WhenMappings.$EnumSwitchMapping$4[linkExternalBankAccountsParams.getOperationMode().ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                bankOperationMode = com.paypal.oslo.api.graphql.schema.type.BankOperationMode.LITE_MODE;
                                com.paypal.oslo.api.graphql.schema.type.BankOperationMode bankOperationMode2 = bankOperationMode;
                                internalInstitutionId = linkExternalBankAccountsParams.getInternalInstitutionId();
                                if (internalInstitutionId != null || (r8 = com.apollographql.apollo.api.Optional.INSTANCE.present(internalInstitutionId)) == null) {
                                    com.apollographql.apollo.api.Optional optional = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                                }
                                com.apollographql.apollo.api.Optional optional2 = optional;
                                com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType = linkExternalBankAccountsParams.getIntegrationType();
                                highSpeedVideoSizes = integrationType == null ? getHighSpeedVideoSizes(integrationType) : null;
                                if (highSpeedVideoSizes != null || (r8 = com.apollographql.apollo.api.Optional.INSTANCE.present(highSpeedVideoSizes)) == null) {
                                    com.apollographql.apollo.api.Optional optional3 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                                }
                                com.apollographql.apollo.api.Optional optional4 = optional3;
                                com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType credentialType = linkExternalBankAccountsParams.getCredentialType();
                                highSpeedVideoSizes2 = credentialType == null ? getHighSpeedVideoSizes(credentialType) : null;
                                if (highSpeedVideoSizes2 != null || (r8 = com.apollographql.apollo.api.Optional.INSTANCE.present(highSpeedVideoSizes2)) == null) {
                                    com.apollographql.apollo.api.Optional optional5 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                                }
                                com.paypal.oslo.api.graphql.schema.type.LinkExternalBankAccountsInput linkExternalBankAccountsInput = new com.paypal.oslo.api.graphql.schema.type.LinkExternalBankAccountsInput(optional4, highSpeedVideoSizes3, bankOperationMode2, credentialToken, bankName, externalBankId, optional2, optional5, present, countryCode, com.apollographql.apollo.api.Optional.INSTANCE.present(getHighSpeedVideoFpsRanges(linkExternalBankAccountsParams.getAddFIFlow())));
                                com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation linkExternalBankAccountsMutation = new com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation(linkExternalBankAccountsInput);
                                obj = "aggregator";
                                com.paypal.oslo.feature.wallet.LoggerKt.log.i("[ExternalBankAccess] Linking external bank accounts", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("aggregator", name2), kotlin.TuplesKt.to("countryCode", linkExternalBankAccountsInput.getCountryCode().toString()), kotlin.TuplesKt.to("accountCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(linkExternalBankAccountsParams.getBankAccountCandidateIds().size()))), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("externalBankId", linkExternalBankAccountsInput.getExternalBankId())));
                                com.paypal.oslo.core.network.graphql.CallConfig highSpeedVideoSizes4 = getHighSpeedVideoSizes("link_external_bank_accounts");
                                externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkExternalBankAccountsParams);
                                externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getHighSpeedVideoSizesFor = function2;
                                externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputFormats = atomicReference;
                                externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputMinFrameDuration = defaultRaise;
                                externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                                externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputSizes = iorRaise3;
                                externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputSizeshNQ4ISI = name2;
                                externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkExternalBankAccountsInput);
                                externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkExternalBankAccountsMutation);
                                externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputStallDurationlomOqCM = iorRaise3;
                                externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getHighSpeedVideoSizes = 0;
                                externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getHighSpeedVideoFpsRanges = 0;
                                externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.Camera2StreamConfigurationMap = 0;
                                externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getHighSpeedVideoFpsRangesFor = 0;
                                externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.toString = 1;
                                obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.Camera2StreamConfigurationMap, linkExternalBankAccountsMutation, highSpeedVideoSizes4, externalBankAccessRepositoryImpl$linkExternalBankAccounts$1);
                                if (obj2 != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                iorRaise = iorRaise3;
                                str = name2;
                                iorRaise2 = iorRaise;
                            } else {
                                if (i2 != 3) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "[ExternalBankAccess] Unknown open banking operation mode defaulted to FULL_MODE", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("operation_mode", "UNKNOWN"), kotlin.TuplesKt.to("operation_mode_defaulted_to", "FULL_MODE")), null, 4, null);
                            }
                        }
                        bankOperationMode = com.paypal.oslo.api.graphql.schema.type.BankOperationMode.FULL_MODE;
                        com.paypal.oslo.api.graphql.schema.type.BankOperationMode bankOperationMode22 = bankOperationMode;
                        internalInstitutionId = linkExternalBankAccountsParams.getInternalInstitutionId();
                        if (internalInstitutionId != null) {
                        }
                        com.apollographql.apollo.api.Optional optional6 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        com.apollographql.apollo.api.Optional optional22 = optional6;
                        com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType2 = linkExternalBankAccountsParams.getIntegrationType();
                        if (integrationType2 == null) {
                        }
                        if (highSpeedVideoSizes != null) {
                        }
                        com.apollographql.apollo.api.Optional optional32 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        com.apollographql.apollo.api.Optional optional42 = optional32;
                        com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType credentialType2 = linkExternalBankAccountsParams.getCredentialType();
                        if (credentialType2 == null) {
                        }
                        if (highSpeedVideoSizes2 != null) {
                        }
                        com.apollographql.apollo.api.Optional optional52 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        com.paypal.oslo.api.graphql.schema.type.LinkExternalBankAccountsInput linkExternalBankAccountsInput2 = new com.paypal.oslo.api.graphql.schema.type.LinkExternalBankAccountsInput(optional42, highSpeedVideoSizes3, bankOperationMode22, credentialToken, bankName, externalBankId, optional22, optional52, present, countryCode, com.apollographql.apollo.api.Optional.INSTANCE.present(getHighSpeedVideoFpsRanges(linkExternalBankAccountsParams.getAddFIFlow())));
                        com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation linkExternalBankAccountsMutation2 = new com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation(linkExternalBankAccountsInput2);
                        obj = "aggregator";
                        com.paypal.oslo.feature.wallet.LoggerKt.log.i("[ExternalBankAccess] Linking external bank accounts", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("aggregator", name2), kotlin.TuplesKt.to("countryCode", linkExternalBankAccountsInput2.getCountryCode().toString()), kotlin.TuplesKt.to("accountCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(linkExternalBankAccountsParams.getBankAccountCandidateIds().size()))), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("externalBankId", linkExternalBankAccountsInput2.getExternalBankId())));
                        com.paypal.oslo.core.network.graphql.CallConfig highSpeedVideoSizes42 = getHighSpeedVideoSizes("link_external_bank_accounts");
                        externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkExternalBankAccountsParams);
                        externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getHighSpeedVideoSizesFor = function2;
                        externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputFormats = atomicReference;
                        externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputMinFrameDuration = defaultRaise;
                        externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise2);
                        externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputSizes = iorRaise3;
                        externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputSizeshNQ4ISI = name2;
                        externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkExternalBankAccountsInput2);
                        externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(linkExternalBankAccountsMutation2);
                        externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputStallDurationlomOqCM = iorRaise3;
                        externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getHighSpeedVideoSizes = 0;
                        externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getHighSpeedVideoFpsRanges = 0;
                        externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.Camera2StreamConfigurationMap = 0;
                        externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getHighSpeedVideoFpsRangesFor = 0;
                        externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.toString = 1;
                        obj2 = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.Camera2StreamConfigurationMap, linkExternalBankAccountsMutation2, highSpeedVideoSizes42, externalBankAccessRepositoryImpl$linkExternalBankAccounts$1);
                        if (obj2 != coroutine_suspended) {
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i3 = externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getHighSpeedVideoFpsRangesFor;
                        int i4 = externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.Camera2StreamConfigurationMap;
                        int i5 = externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getHighSpeedVideoFpsRanges;
                        int i6 = externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getHighSpeedVideoSizes;
                        int i7 = externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getHighResolutionOutputSizeshNQ4ISI;
                        iorRaise = (arrow.core.raise.IorRaise) externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputStallDurationlomOqCM;
                        str = (java.lang.String) externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputSizeshNQ4ISI;
                        iorRaise2 = (arrow.core.raise.IorRaise) externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputSizes;
                        defaultRaise = (arrow.core.raise.DefaultRaise) externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputMinFrameDuration;
                        atomicReference = (java.util.concurrent.atomic.AtomicReference) externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        obj = "aggregator";
                    }
                    both = (arrow.core.Ior) obj2;
                    if (!(both instanceof arrow.core.Ior.Left)) {
                        both = new arrow.core.Ior.Left(com.paypal.oslo.feature.wallet.banks.data.error.CallErrorMapperKt.toExternalBankAccessError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                    } else if (!(both instanceof arrow.core.Ior.Right)) {
                        if (!(both instanceof arrow.core.Ior.Both)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        both = new arrow.core.Ior.Both(com.paypal.oslo.feature.wallet.banks.data.error.CallErrorMapperKt.toExternalBankAccessError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) both).getLeftValue()), ((arrow.core.Ior.Both) both).getRightValue());
                    }
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.wallet.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[3];
                    java.lang.Object obj3 = obj;
                    pairArr[0] = kotlin.TuplesKt.to(obj3, str);
                    pairArr[1] = kotlin.TuplesKt.to("hasData", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(graphQLData.getData() == null));
                    com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Data data = (com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Data) graphQLData.getData();
                    pairArr[2] = kotlin.TuplesKt.to("hasResult", kotlin.coroutines.jvm.internal.Boxing.boxBoolean((data == null ? data.getLinkExternalBankAccounts() : null) == null));
                    com.paypal.android.logger.Logger.i$default(logger, "[ExternalBankAccess] Raw GraphQL response for link accounts", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Data data2 = (com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Data) graphQLData.getData();
                    com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.LinkExternalBankAccounts linkExternalBankAccounts = data2 == null ? data2.getLinkExternalBankAccounts() : null;
                    items = linkExternalBankAccounts == null ? linkExternalBankAccounts.getItems() : null;
                    java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.ExistingBankAccount> existingBankAccounts = linkExternalBankAccounts == null ? linkExternalBankAccounts.getExistingBankAccounts() : null;
                    inlineLogoImageData = linkExternalBankAccounts == null ? linkExternalBankAccounts.getInlineLogoImageData() : null;
                    if (inlineLogoImageData == null) {
                        java.lang.String mimeType = inlineLogoImageData.getMimeType();
                        java.lang.String data3 = inlineLogoImageData.getData();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("data:");
                        sb.append(mimeType);
                        sb.append(";base64,");
                        sb.append(data3);
                        str2 = sb.toString();
                    } else {
                        str2 = "";
                    }
                    if (items != null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "[ExternalBankAccess] No linking result returned from API", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(obj3, str), kotlin.TuplesKt.to("resultIsNull", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)), kotlin.TuplesKt.to("businessError", "LinkingFailed")), null, 4, null);
                        iorRaise2.raise(com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError.Business.LinkingFailed.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj4 : items) {
                        com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item item = (com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item) obj4;
                        if (item.getBankAccountAction() == com.paypal.oslo.api.graphql.schema.type.BankAccountAction.ADDED || item.getBankAccountAction() == com.paypal.oslo.api.graphql.schema.type.BankAccountAction.CONFIRMED) {
                            arrayList.add(obj4);
                        } else {
                            arrayList2.add(obj4);
                        }
                    }
                    kotlin.Pair pair = new kotlin.Pair(arrayList, arrayList2);
                    java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item> list = (java.util.List) pair.component1();
                    java.util.List list2 = (java.util.List) pair.component2();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    for (java.lang.Object obj5 : list2) {
                        com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item item2 = (com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item) obj5;
                        if (item2.getBankAccountAction() == com.paypal.oslo.api.graphql.schema.type.BankAccountAction.ADD_BANK_FAILED || item2.getBankAccountAction() == com.paypal.oslo.api.graphql.schema.type.BankAccountAction.INSTANT_BANK_CONFIRMATION_FAILED) {
                            arrayList3.add(obj5);
                        } else {
                            arrayList4.add(obj5);
                        }
                    }
                    kotlin.Pair pair2 = new kotlin.Pair(arrayList3, arrayList4);
                    java.util.List list3 = (java.util.List) pair2.component1();
                    java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item> list4 = (java.util.List) pair2.component2();
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    for (com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item item3 : list) {
                        com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccount bankAccount = item3.getBankAccount();
                        int i8 = com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[item3.getBankAccountAction().ordinal()];
                        if (i8 == 1) {
                            bankAccountAction = com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction.ADDED;
                        } else if (i8 == 2) {
                            bankAccountAction = com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAction.CONFIRMED;
                        } else {
                            bankAccountAction2 = null;
                            linkedBankAccountResult = (bankAccount != null || bankAccountAction2 == null) ? null : new com.paypal.oslo.feature.wallet.banks.domain.model.LinkedBankAccountResult(bankAccount.getId(), bankAccount.getLastNChars(), getHighSpeedVideoFpsRangesFor(bankAccount.getType()), bankAccountAction2, (java.lang.String) null, 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                            if (linkedBankAccountResult == null) {
                                arrayList5.add(linkedBankAccountResult);
                            }
                        }
                        bankAccountAction2 = bankAccountAction;
                        if (bankAccount != null) {
                        }
                        if (linkedBankAccountResult == null) {
                        }
                    }
                    java.util.ArrayList arrayList6 = arrayList5;
                    java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item> list5 = list3;
                    java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
                    for (com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item item4 : list5) {
                        java.lang.String bankAccountCandidateId = item4.getBankAccountCandidateId();
                        if (bankAccountCandidateId == null) {
                            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate bankAccountCandidate = item4.getBankAccountCandidate();
                            bankAccountCandidateId = bankAccountCandidate != null ? bankAccountCandidate.getId() : null;
                        }
                        if (bankAccountCandidateId == null) {
                            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "[ExternalBankAccess] Missing candidate ID in failed account result, defaulting to 'unknown'", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("bankAccountAction", item4.getBankAccountAction().getRawValue())), null, 4, null);
                        }
                        if (bankAccountCandidateId == null) {
                            bankAccountCandidateId = "unknown";
                        }
                        java.lang.String str3 = bankAccountCandidateId;
                        com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate bankAccountCandidate2 = item4.getBankAccountCandidate();
                        java.lang.String lastNChars = bankAccountCandidate2 != null ? bankAccountCandidate2.getLastNChars() : null;
                        com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate bankAccountCandidate3 = item4.getBankAccountCandidate();
                        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType highSpeedVideoFpsRangesFor = (bankAccountCandidate3 == null || (type = bankAccountCandidate3.getType()) == null) ? null : getHighSpeedVideoFpsRangesFor(type);
                        com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.BankAccountCandidate bankAccountCandidate4 = item4.getBankAccountCandidate();
                        arrayList7.add(new com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult(str3, lastNChars, highSpeedVideoFpsRangesFor, (bankAccountCandidate4 == null || (issuer = bankAccountCandidate4.getIssuer()) == null) ? null : issuer.getName(), (java.lang.String) null, (com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType) null, (java.lang.String) null, 96, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                    }
                    java.util.ArrayList arrayList8 = arrayList7;
                    for (com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Item item5 : list4) {
                        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                        pairArr2[0] = kotlin.TuplesKt.to("action", item5.getBankAccountAction().getRawValue());
                        java.lang.String bankAccountCandidateId2 = item5.getBankAccountCandidateId();
                        if (bankAccountCandidateId2 == null) {
                            bankAccountCandidateId2 = "null";
                        }
                        pairArr2[1] = kotlin.TuplesKt.to("candidateId", bankAccountCandidateId2);
                        com.paypal.android.logger.Logger.w$default(logger2, "[ExternalBankAccess] Unknown bank account action", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                    }
                    kotlin.Pair pair3 = kotlin.TuplesKt.to(arrayList6, arrayList8);
                    java.util.List list6 = (java.util.List) pair3.component1();
                    java.util.List list7 = (java.util.List) pair3.component2();
                    com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.wallet.LoggerKt.log;
                    kotlin.Pair[] pairArr3 = new kotlin.Pair[4];
                    pairArr3[0] = kotlin.TuplesKt.to(obj3, str);
                    pairArr3[1] = kotlin.TuplesKt.to("linkedCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(list6.size()));
                    pairArr3[2] = kotlin.TuplesKt.to("failedCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(list7.size()));
                    pairArr3[3] = kotlin.TuplesKt.to("existingCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(existingBankAccounts != null ? existingBankAccounts.size() : 0));
                    com.paypal.android.logger.Logger.i$default(logger3, "[ExternalBankAccess] Bank accounts linked successfully", kotlin.collections.MapsKt.mapOf(pairArr3), null, 4, null);
                    java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo> highSpeedVideoFpsRanges = existingBankAccounts != null ? getHighSpeedVideoFpsRanges(existingBankAccounts) : null;
                    if (highSpeedVideoFpsRanges == null) {
                        highSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.emptyList();
                    }
                    com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult linkExternalBankAccountsResult = new com.paypal.oslo.feature.wallet.banks.domain.model.LinkExternalBankAccountsResult(list6, list7, highSpeedVideoFpsRanges, str2);
                    defaultRaise.complete();
                    arrow.core.EmptyValue emptyValue = arrow.core.EmptyValue.INSTANCE;
                    java.lang.Object obj6 = atomicReference.get();
                    return obj6 == arrow.core.EmptyValue.INSTANCE ? new arrow.core.Ior.Right(linkExternalBankAccountsResult) : new arrow.core.Ior.Both(obj6, linkExternalBankAccountsResult);
                }
            }
            if (i != 0) {
            }
            both = (arrow.core.Ior) obj2;
            if (!(both instanceof arrow.core.Ior.Left)) {
            }
            com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) iorRaise.bind(both);
            com.paypal.android.logger.Logger logger4 = com.paypal.oslo.feature.wallet.LoggerKt.log;
            kotlin.Pair[] pairArr4 = new kotlin.Pair[3];
            java.lang.Object obj32 = obj;
            pairArr4[0] = kotlin.TuplesKt.to(obj32, str);
            pairArr4[1] = kotlin.TuplesKt.to("hasData", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(graphQLData2.getData() == null));
            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Data data4 = (com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Data) graphQLData2.getData();
            pairArr4[2] = kotlin.TuplesKt.to("hasResult", kotlin.coroutines.jvm.internal.Boxing.boxBoolean((data4 == null ? data4.getLinkExternalBankAccounts() : null) == null));
            com.paypal.android.logger.Logger.i$default(logger4, "[ExternalBankAccess] Raw GraphQL response for link accounts", kotlin.collections.MapsKt.mapOf(pairArr4), null, 4, null);
            com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Data data22 = (com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.Data) graphQLData2.getData();
            if (data22 == null) {
            }
            if (linkExternalBankAccounts == null) {
            }
            if (linkExternalBankAccounts == null) {
            }
            if (linkExternalBankAccounts == null) {
            }
            if (inlineLogoImageData == null) {
            }
            if (items != null) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e) {
            complete2.complete();
            java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, complete2);
            arrow.core.EmptyValue emptyValue2 = arrow.core.EmptyValue.INSTANCE;
            java.lang.Object obj7 = r14.get();
            if (obj7 != arrow.core.EmptyValue.INSTANCE) {
                raisedOrRethrow = invoke.invoke(obj7, raisedOrRethrow);
            }
            return new arrow.core.Ior.Left(raisedOrRethrow);
        } catch (java.lang.Throwable th) {
            complete.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        externalBankAccessRepositoryImpl$linkExternalBankAccounts$1 = new com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl$linkExternalBankAccounts$1(this, continuation);
        java.lang.Object obj22 = externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.isOutputSupportedFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = externalBankAccessRepositoryImpl$linkExternalBankAccounts$1.toString;
    }

    private static java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo> getHighSpeedVideoFpsRanges(java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.ExistingBankAccount> list) {
        java.util.List<com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.ExistingBankAccount> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (com.paypal.oslo.feature.wallet.graphql.LinkExternalBankAccountsMutation.ExistingBankAccount existingBankAccount : list2) {
            arrayList.add(new com.paypal.oslo.feature.wallet.banks.domain.model.ExistingBankAccountInfo(existingBankAccount.getId(), existingBankAccount.getLastNChars(), getHighSpeedVideoFpsRangesFor(existingBankAccount.getType()), existingBankAccount.getIssuer().getName(), null, 16, null));
        }
        return arrayList;
    }

    private static com.paypal.oslo.api.graphql.schema.type.BankAggregatorName getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator) {
        int i = com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl.WhenMappings.$EnumSwitchMapping$2[bankAggregator.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.PLAID;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.FINICITY;
        }
        if (i == 3) {
            return com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.YODLEE_FASTLINK;
        }
        if (i == 4) {
            return com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.TINK;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "[ExternalBankAccess] Unknown aggregator type, defaulting to FINICITY", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("aggregator", bankAggregator.name())), null, 4, null);
        return com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.FINICITY;
    }

    private static com.paypal.oslo.api.graphql.schema.type.BankProductFlow getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow) {
        switch (com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl.WhenMappings.$EnumSwitchMapping$3[addFIFlow.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return com.paypal.oslo.api.graphql.schema.type.BankProductFlow.WALLET;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    private static com.paypal.oslo.api.graphql.schema.type.BankIntegrationType getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType) {
        int i = com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl.WhenMappings.$EnumSwitchMapping$5[integrationType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.BankIntegrationType.HOSTED_URL;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.BankIntegrationType.OAUTH2;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.BankIntegrationType.UNKNOWN;
    }

    private static com.paypal.oslo.api.graphql.schema.type.BankCredentialType getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType credentialType) {
        int i = com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl.WhenMappings.$EnumSwitchMapping$6[credentialType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.BankCredentialType.PERMANENT;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.BankCredentialType.TEMPORARY;
    }

    private static com.paypal.oslo.core.network.graphql.CallConfig getHighSpeedVideoSizes(java.lang.String p0) {
        return new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(p0, (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, null);
    }

    private static com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getHighSpeedVideoFpsRangesFor(com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType) {
        switch (com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl.WhenMappings.$EnumSwitchMapping$7[bankAccountType.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.BUSINESS_CHECKING;
            case 2:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.BUSINESS_SAVINGS;
            case 3:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CHECKING;
            case 4:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CUSTOM;
            case 5:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.NORMAL;
            case 6:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.SAVINGS;
            case 7:
            case 8:
                return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.UNKNOWN;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError $r8$lambda$m_UG2kthACFAQhqDUDOzrUUMziQ(com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError externalBankAccessError, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError externalBankAccessError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankAccessError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankAccessError2, "");
        return externalBankAccessError;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError $r8$lambda$u5wwj9jUmy9du2zFfnGK_FCAmOk(com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError externalBankAccessError, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError externalBankAccessError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankAccessError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankAccessError2, "");
        return externalBankAccessError;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError $r8$lambda$y3yx7Lc4hlRwh9yDlVPw5LJX8bs(com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError externalBankAccessError, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessError externalBankAccessError2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankAccessError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankAccessError2, "");
        return externalBankAccessError;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.BankAccountAction.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountAction.ADDED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountAction.CONFIRMED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.values().length];
            try {
                iArr2[com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.ADD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.CONFIRM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.RECONSENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.values().length];
            try {
                iArr3[com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.PLAID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.FINICITY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.YODLEE_FASTLINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.TINK.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.values().length];
            try {
                iArr4[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr4[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.AUTO_RELOAD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr4[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.SUBSCRIPTIONS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr4[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.ONBOARDING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr4[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.BNPL_SERVICING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr4[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.BNPL_ACQUISITION.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr4[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.P2P.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr4[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.CRYPTO.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr4[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.QRC.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr4[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.DEBIT_CARD.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode.values().length];
            try {
                iArr5[com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode.FULL_MODE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr5[com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode.LITE_MODE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr5[com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.values().length];
            try {
                iArr6[com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.HOSTED_URL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr6[com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.OAUTH2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr6[com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType.values().length];
            try {
                iArr7[com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType.PERMANENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr7[com.paypal.oslo.feature.wallet.banks.domain.model.CredentialType.TEMPORARY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[com.paypal.oslo.api.graphql.schema.type.BankAccountType.values().length];
            try {
                iArr8[com.paypal.oslo.api.graphql.schema.type.BankAccountType.BUSINESS_CHECKING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr8[com.paypal.oslo.api.graphql.schema.type.BankAccountType.BUSINESS_SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr8[com.paypal.oslo.api.graphql.schema.type.BankAccountType.CHECKING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                iArr8[com.paypal.oslo.api.graphql.schema.type.BankAccountType.CUSTOM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                iArr8[com.paypal.oslo.api.graphql.schema.type.BankAccountType.NORMAL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            try {
                iArr8[com.paypal.oslo.api.graphql.schema.type.BankAccountType.SAVINGS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                iArr8[com.paypal.oslo.api.graphql.schema.type.BankAccountType.UNKNOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            try {
                iArr8[com.paypal.oslo.api.graphql.schema.type.BankAccountType.UNKNOWN__.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused36) {
            }
            $EnumSwitchMapping$7 = iArr8;
        }
    }
}
