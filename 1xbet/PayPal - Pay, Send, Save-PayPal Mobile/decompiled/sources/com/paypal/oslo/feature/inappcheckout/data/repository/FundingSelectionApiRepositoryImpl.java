package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J4\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001f0\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b \u0010!J#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\"0\u00122\u0006\u0010\u0018\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u001b\u0010#JQ\u0010 \u001a\u0004\u0018\u00010'\"\u0004\b\u0000\u0010$2\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00172 \u0010\u001a\u001a\u001c\u0012\u0004\u0012\u00020\u0017\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010'0&0%2\u0006\u0010(\u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010)R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010,R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010.R\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010/R\u0014\u00102\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00100\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R.\u00106\u001a\u001c\u0012\u0004\u0012\u00020\u0017\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u000208\u0012\u0006\u0012\u0004\u0018\u00010'0&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00109R.\u0010;\u001a\u001c\u0012\u0004\u0012\u00020\u0017\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020:\u0012\u0006\u0012\u0004\u0018\u00010'0&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00109"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/repository/FundingSelectionApiRepositoryImpl;", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/FundingSelectionApiRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/FundingSelectionEntityMapper;", "fundingSelectionEntityMapper", "Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;", "callErrorMapper", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "localeProvider", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "logger", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/feature/inappcheckout/data/mapper/FundingSelectionEntityMapper;Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionEntity;", "fetch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p0", "p1", "p2", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$Data;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$FundingSelection;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/FundingSelectionDTO;", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$FundingSelection;)Larrow/core/Either;", "T", "", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/ContingencyDTO;", "p3", "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/data/dto/ContingencyDTO;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/FundingSelectionEntityMapper;", "Lcom/paypal/oslo/feature/inappcheckout/domain/mapper/CallErrorMapper;", "getInputFormats", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "getHighResolutionOutputSizeshNQ4ISI", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineDispatcher;", "getOutputFormats", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$TransactionLevelContingency;", "Ljava/util/Map;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$InstrumentationLevelContingency;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FundingSelectionApiRepositoryImpl implements com.paypal.oslo.feature.inappcheckout.domain.repository.FundingSelectionApiRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency, com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO>> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TransactionLevelContingency, com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO>> getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger getInputFormats;

    @javax.inject.Inject
    public FundingSelectionApiRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.data.mapper.FundingSelectionEntityMapper fundingSelectionEntityMapper, com.paypal.oslo.feature.inappcheckout.domain.mapper.CallErrorMapper callErrorMapper, com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSelectionEntityMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callErrorMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutLogger, "");
        this.getHighSpeedVideoSizes = apolloClient;
        this.getHighSpeedVideoFpsRangesFor = appSwitchSession;
        this.Camera2StreamConfigurationMap = fundingSelectionEntityMapper;
        this.getHighSpeedVideoFpsRanges = callErrorMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = localeProvider;
        this.getOutputFormats = coroutineDispatcher;
        this.getInputFormats = checkoutLogger;
        this.getOutputMinFrameDuration = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("externalAddCardContingency", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl.$r8$lambda$_kQIMsJqpWWG7ddvz8O6YEExwX4((com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TransactionLevelContingency) obj);
            }
        }), kotlin.TuplesKt.to("externalUpdateCardContingency", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl.m15420$r8$lambda$u98c0gN2FtDWBw3Ts7R1Nq1XY((com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TransactionLevelContingency) obj);
            }
        }), kotlin.TuplesKt.to("externalAuthChallengeContingency", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl.$r8$lambda$Z9LQak30QvxTsYvcsJJGhrxECcE((com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TransactionLevelContingency) obj);
            }
        }), kotlin.TuplesKt.to("externalContingency", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl.m15418$r8$lambda$NWYuEDT5W5TXQtndfQW6mT6Ris((com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TransactionLevelContingency) obj);
            }
        }), kotlin.TuplesKt.to("externalUnknownContingency", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl.m15419$r8$lambda$fnoGYlkS8kLmwCpFnhBNCqbewg((com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TransactionLevelContingency) obj);
            }
        }));
        this.getHighSpeedVideoSizesFor = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("externalPreAuthorizationRequiredContingency", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl.$r8$lambda$3XWfB9bEl6IDAf4pc1tlSgOcylI((com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency) obj);
            }
        }), kotlin.TuplesKt.to("externalThreeDsContingency", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl.$r8$lambda$KBo2Flbx9QHRnswNq328A_7l9do((com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency) obj);
            }
        }), kotlin.TuplesKt.to("externalUserConsentForBankAccountInfoContingency", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl.$r8$lambda$x9ibpfOrtptADLzN_6hQImQ859Y((com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency) obj);
            }
        }), kotlin.TuplesKt.to("externalBankAccountBalanceRequiredContingency", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl.$r8$lambda$DwJTTRo9VQsmmNfoopKckIGUC8Q((com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency) obj);
            }
        }), kotlin.TuplesKt.to("externalContingency", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl.$r8$lambda$c8RxCQOOjX73s4XIm3R51zOnwyg((com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency) obj);
            }
        }), kotlin.TuplesKt.to("externalUnknownContingency", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl.$r8$lambda$ZJpgaX467XAOD1NJ74nsd8ZLYLA((com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency) obj);
            }
        }));
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.repository.FundingSelectionApiRepository
    public final java.lang.Object fetch(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getOutputFormats, new com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetch$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cf A[Catch: all -> 0x0054, RaiseCancellationException -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x0057, all -> 0x0054, blocks: (B:11:0x004f, B:12:0x00c5, B:15:0x00cf, B:16:0x00f8, B:21:0x00eb, B:22:0x0123, B:23:0x0128), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity>> continuation) {
        com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetchFundingSelection$1 fundingSelectionApiRepositoryImpl$fetchFundingSelection$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.Raise raise2;
        arrow.core.Either either;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetchFundingSelection$1) {
            fundingSelectionApiRepositoryImpl$fetchFundingSelection$1 = (com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetchFundingSelection$1) continuation;
            if ((fundingSelectionApiRepositoryImpl$fetchFundingSelection$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                fundingSelectionApiRepositoryImpl$fetchFundingSelection$1.getOutputStallDurationlomOqCM -= 2147483648;
                com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetchFundingSelection$1 fundingSelectionApiRepositoryImpl$fetchFundingSelection$12 = fundingSelectionApiRepositoryImpl$fetchFundingSelection$1;
                java.lang.Object obj = fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingSelectionQueryInput externalFundingSelectionQueryInput = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingSelectionQueryInput(str2, str3, null, null, null, 28, null);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery fundingSelectionQuery = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery(str, externalFundingSelectionQueryInput);
                        fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                        fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                        fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getOutputFormats = defaultRaise;
                        fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getInputSizeshNQ4ISI = defaultRaise3;
                        fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(externalFundingSelectionQueryInput);
                        fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getOutputSizeshNQ4ISI = defaultRaise3;
                        fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getHighSpeedVideoFpsRangesFor = 0;
                        fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.Camera2StreamConfigurationMap = 0;
                        fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getHighSpeedVideoFpsRanges = 0;
                        fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getHighSpeedVideoSizes = 0;
                        fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getOutputStallDurationlomOqCM = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, fundingSelectionQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, fundingSelectionApiRepositoryImpl$fetchFundingSelection$12, 2, (java.lang.Object) null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        raise = defaultRaise3;
                        raise2 = raise;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getHighSpeedVideoSizes;
                    int i3 = fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getHighSpeedVideoFpsRanges;
                    int i4 = fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.Camera2StreamConfigurationMap;
                    int i5 = fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getHighSpeedVideoFpsRangesFor;
                    raise = (arrow.core.raise.Raise) fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getOutputSizeshNQ4ISI;
                    raise2 = (arrow.core.raise.Raise) fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getInputSizeshNQ4ISI;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) fundingSelectionApiRepositoryImpl$fetchFundingSelection$12.getOutputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(this.getHighSpeedVideoFpsRanges.map((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue(), "FUNDING_SELECTION"));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity convert = this.Camera2StreamConfigurationMap.convert((com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO) raise2.bind(getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.FundingSelection) raise2.bind(getHighSpeedVideoSizes((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right))))));
                defaultRaise2.complete();
                return new arrow.core.Either.Right(convert);
            }
        }
        fundingSelectionApiRepositoryImpl$fetchFundingSelection$1 = new com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetchFundingSelection$1(this, continuation);
        com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$fetchFundingSelection$1 fundingSelectionApiRepositoryImpl$fetchFundingSelection$122 = fundingSelectionApiRepositoryImpl$fetchFundingSelection$1;
        java.lang.Object obj2 = fundingSelectionApiRepositoryImpl$fetchFundingSelection$122.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fundingSelectionApiRepositoryImpl$fetchFundingSelection$122.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionEntity convert2 = this.Camera2StreamConfigurationMap.convert((com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO) raise2.bind(getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.FundingSelection) raise2.bind(getHighSpeedVideoSizes((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right))))));
        defaultRaise2.complete();
        return new arrow.core.Either.Right(convert2);
    }

    private final <T> com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO getHighSpeedVideoSizes(T p0, java.lang.String p1, java.util.Map<java.lang.String, ? extends kotlin.jvm.functions.Function1<? super T, ? extends com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO>> p2, java.lang.String p3) {
        kotlin.jvm.functions.Function1<? super T, ? extends com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO> function1 = p2.get(p1);
        if (function1 != null) {
            return function1.invoke(p0);
        }
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger = this.getInputFormats;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown ");
        sb.append(p3);
        sb.append(" contingency type");
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(checkoutLogger, sb.toString(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, p1)), null, 4, null);
        return null;
    }

    private static arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.FundingSelection> getHighSpeedVideoSizes(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Data> p0) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Data data = p0.getData();
            if (data == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("EMPTY_RESPONSE", com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.NULL_RESPONSE_DATA, false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.External external = data.getExternal();
            if (external == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "External field is null", false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.FundingSelection fundingSelection = external.getFundingSelection();
            if (fundingSelection == null) {
                defaultRaise2.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "FundingSelection field is null", false, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise.complete();
            return new arrow.core.Either.Right(fundingSelection);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0108 A[Catch: all -> 0x034f, RaiseCancellationException -> 0x035a, TryCatch #4 {RaiseCancellationException -> 0x035a, all -> 0x034f, blocks: (B:3:0x0008, B:6:0x0017, B:8:0x001d, B:9:0x004e, B:11:0x0054, B:13:0x0099, B:15:0x009f, B:17:0x00a5, B:18:0x00b8, B:20:0x00be, B:22:0x00cc, B:23:0x00d0, B:25:0x00db, B:29:0x00ef, B:31:0x00f5, B:33:0x00fb, B:34:0x0102, B:36:0x0108, B:38:0x010e, B:42:0x012b, B:43:0x013c, B:45:0x0142, B:67:0x0118, B:69:0x011e, B:71:0x0124, B:74:0x00e2, B:76:0x00e8), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0142 A[Catch: all -> 0x034f, RaiseCancellationException -> 0x035a, TRY_LEAVE, TryCatch #4 {RaiseCancellationException -> 0x035a, all -> 0x034f, blocks: (B:3:0x0008, B:6:0x0017, B:8:0x001d, B:9:0x004e, B:11:0x0054, B:13:0x0099, B:15:0x009f, B:17:0x00a5, B:18:0x00b8, B:20:0x00be, B:22:0x00cc, B:23:0x00d0, B:25:0x00db, B:29:0x00ef, B:31:0x00f5, B:33:0x00fb, B:34:0x0102, B:36:0x0108, B:38:0x010e, B:42:0x012b, B:43:0x013c, B:45:0x0142, B:67:0x0118, B:69:0x011e, B:71:0x0124, B:74:0x00e2, B:76:0x00e8), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0188 A[Catch: all -> 0x034b, RaiseCancellationException -> 0x034d, TryCatch #3 {RaiseCancellationException -> 0x034d, all -> 0x034b, blocks: (B:47:0x0154, B:49:0x0160, B:54:0x016c, B:57:0x0182, B:59:0x0188, B:61:0x018e, B:63:0x01a8, B:80:0x01c2, B:82:0x01e8, B:83:0x01ef, B:84:0x0210, B:86:0x0216, B:89:0x022a, B:94:0x022e, B:97:0x023e, B:103:0x0258, B:104:0x0272, B:105:0x0273, B:107:0x027d, B:109:0x0283, B:111:0x028f, B:113:0x0295, B:116:0x029e, B:117:0x02f0, B:119:0x02f1, B:120:0x0309, B:121:0x030a, B:122:0x034a), top: B:4:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.FundingSelection p0) {
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingSelectionErrorReason name2;
        java.util.ArrayList arrayList;
        java.lang.String str3;
        java.lang.String lastDigits;
        java.lang.String name3;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBankFundingInstrument onExternalBankFundingInstrument;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCardFundingInstrument onExternalCardFundingInstrument;
        java.lang.String str4;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardSubType cs;
        java.lang.String name4;
        java.util.Iterator it;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditOffer creditOffer;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBrand cardBrand;
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.DisallowedFields disallowedFields;
        java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingDisallowedReason> disallowedReasons;
        arrow.core.raise.DefaultRaise defaultRaise4 = new arrow.core.raise.DefaultRaise(false);
        try {
            defaultRaise3 = defaultRaise4;
            str = p0.get__typename();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            e = e;
            defaultRaise2 = defaultRaise4;
        } catch (java.lang.Throwable th) {
            th = th;
            defaultRaise = defaultRaise4;
        }
        try {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "externalFundingSelectionSuccessResponse")) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingSelectionSuccessResponse onExternalFundingSelectionSuccessResponse = p0.getOnExternalFundingSelectionSuccessResponse();
                if (onExternalFundingSelectionSuccessResponse == null) {
                    defaultRaise3.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "Success response is null despite __typename indicating success", false, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getInputFormats, "Successfully fetched funding selection", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("instrumentCount", java.lang.String.valueOf(onExternalFundingSelectionSuccessResponse.getFundingInstruments().size()))), null, 4, null);
                java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.FundingInstrument> fundingInstruments = onExternalFundingSelectionSuccessResponse.getFundingInstruments();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it2 = fundingInstruments.iterator();
                while (it2.hasNext()) {
                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingInstrument onExternalFundingInstrument = ((com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.FundingInstrument) it2.next()).getOnExternalFundingInstrument();
                    java.lang.String str5 = onExternalFundingInstrument.get__typename();
                    java.lang.String id = onExternalFundingInstrument.getId();
                    java.lang.String name5 = onExternalFundingInstrument.getType().name();
                    java.lang.String label = onExternalFundingInstrument.getLabel();
                    com.paypal.oslo.feature.inappcheckout.data.dto.ImageUrlDTO imageUrlDTO = new com.paypal.oslo.feature.inappcheckout.data.dto.ImageUrlDTO(onExternalFundingInstrument.getImageUrl().getImagePath());
                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingUsability onExternalFundingUsability = onExternalFundingInstrument.getUsability().getOnExternalFundingUsability();
                    java.lang.String str6 = onExternalFundingUsability.get__typename();
                    java.lang.String name6 = onExternalFundingUsability.getStatus().name();
                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingDisallowed onExternalFundingDisallowed = onExternalFundingUsability.getOnExternalFundingDisallowed();
                    if (onExternalFundingDisallowed == null || (disallowedFields = onExternalFundingDisallowed.getDisallowedFields()) == null || (disallowedReasons = disallowedFields.getDisallowedReasons()) == null) {
                        arrayList = null;
                    } else {
                        java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingDisallowedReason> list = disallowedReasons;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                        java.util.Iterator<T> it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(((com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingDisallowedReason) it3.next()).name());
                        }
                        arrayList = arrayList3;
                    }
                    com.paypal.oslo.feature.inappcheckout.data.dto.FundingUsabilityDTO fundingUsabilityDTO = new com.paypal.oslo.feature.inappcheckout.data.dto.FundingUsabilityDTO(str6, name6, arrayList);
                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBankFundingInstrument onExternalBankFundingInstrument2 = onExternalFundingInstrument.getOnExternalBankFundingInstrument();
                    if (onExternalBankFundingInstrument2 == null || (lastDigits = onExternalBankFundingInstrument2.getLastDigits()) == null) {
                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCardFundingInstrument onExternalCardFundingInstrument2 = onExternalFundingInstrument.getOnExternalCardFundingInstrument();
                        if (onExternalCardFundingInstrument2 != null) {
                            lastDigits = onExternalCardFundingInstrument2.getLastDigits();
                        } else {
                            str3 = null;
                            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCardFundingInstrument onExternalCardFundingInstrument3 = onExternalFundingInstrument.getOnExternalCardFundingInstrument();
                            name3 = (onExternalCardFundingInstrument3 != null || (cardBrand = onExternalCardFundingInstrument3.getCardBrand()) == null) ? null : cardBrand.name();
                            onExternalBankFundingInstrument = onExternalFundingInstrument.getOnExternalBankFundingInstrument();
                            if (onExternalBankFundingInstrument != null) {
                                com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankSubType bs = onExternalBankFundingInstrument.getBs();
                                if (bs != null) {
                                    name4 = bs.name();
                                    if (name4 != null) {
                                    }
                                    str4 = name4;
                                    java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency> instrumentationLevelContingencies = onExternalFundingInstrument.getInstrumentationLevelContingencies();
                                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                    it = instrumentationLevelContingencies.iterator();
                                    while (it.hasNext()) {
                                        java.util.Iterator it4 = it2;
                                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency instrumentationLevelContingency = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency) it.next();
                                        java.util.Iterator it5 = it;
                                        arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise4;
                                        com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingSelectionSuccessResponse onExternalFundingSelectionSuccessResponse2 = onExternalFundingSelectionSuccessResponse;
                                        com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO highSpeedVideoSizes = getHighSpeedVideoSizes(instrumentationLevelContingency, instrumentationLevelContingency.get__typename(), this.getHighSpeedVideoSizesFor, "instrument");
                                        if (highSpeedVideoSizes != null) {
                                            arrayList4.add(highSpeedVideoSizes);
                                        }
                                        it = it5;
                                        it2 = it4;
                                        defaultRaise4 = defaultRaise5;
                                        onExternalFundingSelectionSuccessResponse = onExternalFundingSelectionSuccessResponse2;
                                    }
                                    java.util.Iterator it6 = it2;
                                    arrow.core.raise.DefaultRaise defaultRaise6 = defaultRaise4;
                                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingSelectionSuccessResponse onExternalFundingSelectionSuccessResponse3 = onExternalFundingSelectionSuccessResponse;
                                    java.util.ArrayList arrayList5 = arrayList4;
                                    java.util.ArrayList arrayList6 = !arrayList5.isEmpty() ? null : arrayList5;
                                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPayPalCreditFundingInstrument onExternalPayPalCreditFundingInstrument = onExternalFundingInstrument.getOnExternalPayPalCreditFundingInstrument();
                                    arrayList2.add(new com.paypal.oslo.feature.inappcheckout.data.dto.FundingInstrumentDTO(str5, id, name5, label, imageUrlDTO, fundingUsabilityDTO, str3, name3, str4, (com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO) null, arrayList6, (onExternalPayPalCreditFundingInstrument != null || (creditOffer = onExternalPayPalCreditFundingInstrument.getCreditOffer()) == null) ? null : new com.paypal.oslo.feature.inappcheckout.data.dto.CreditOfferDTO(creditOffer.getText1(), creditOffer.getText2(), creditOffer.getTermLink(), creditOffer.getTermLinkText()), (java.lang.String) null, 4608, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                    it2 = it6;
                                    defaultRaise4 = defaultRaise6;
                                    onExternalFundingSelectionSuccessResponse = onExternalFundingSelectionSuccessResponse3;
                                }
                            }
                            onExternalCardFundingInstrument = onExternalFundingInstrument.getOnExternalCardFundingInstrument();
                            if (onExternalCardFundingInstrument != null || (cs = onExternalCardFundingInstrument.getCs()) == null) {
                                str4 = null;
                                java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency> instrumentationLevelContingencies2 = onExternalFundingInstrument.getInstrumentationLevelContingencies();
                                java.util.ArrayList arrayList42 = new java.util.ArrayList();
                                it = instrumentationLevelContingencies2.iterator();
                                while (it.hasNext()) {
                                }
                                java.util.Iterator it62 = it2;
                                arrow.core.raise.DefaultRaise defaultRaise62 = defaultRaise4;
                                com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingSelectionSuccessResponse onExternalFundingSelectionSuccessResponse32 = onExternalFundingSelectionSuccessResponse;
                                java.util.ArrayList arrayList52 = arrayList42;
                                if (!arrayList52.isEmpty()) {
                                }
                                com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPayPalCreditFundingInstrument onExternalPayPalCreditFundingInstrument2 = onExternalFundingInstrument.getOnExternalPayPalCreditFundingInstrument();
                                arrayList2.add(new com.paypal.oslo.feature.inappcheckout.data.dto.FundingInstrumentDTO(str5, id, name5, label, imageUrlDTO, fundingUsabilityDTO, str3, name3, str4, (com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO) null, arrayList6, (onExternalPayPalCreditFundingInstrument2 != null || (creditOffer = onExternalPayPalCreditFundingInstrument2.getCreditOffer()) == null) ? null : new com.paypal.oslo.feature.inappcheckout.data.dto.CreditOfferDTO(creditOffer.getText1(), creditOffer.getText2(), creditOffer.getTermLink(), creditOffer.getTermLinkText()), (java.lang.String) null, 4608, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                it2 = it62;
                                defaultRaise4 = defaultRaise62;
                                onExternalFundingSelectionSuccessResponse = onExternalFundingSelectionSuccessResponse32;
                            } else {
                                name4 = cs.name();
                                str4 = name4;
                                java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency> instrumentationLevelContingencies22 = onExternalFundingInstrument.getInstrumentationLevelContingencies();
                                java.util.ArrayList arrayList422 = new java.util.ArrayList();
                                it = instrumentationLevelContingencies22.iterator();
                                while (it.hasNext()) {
                                }
                                java.util.Iterator it622 = it2;
                                arrow.core.raise.DefaultRaise defaultRaise622 = defaultRaise4;
                                com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingSelectionSuccessResponse onExternalFundingSelectionSuccessResponse322 = onExternalFundingSelectionSuccessResponse;
                                java.util.ArrayList arrayList522 = arrayList422;
                                if (!arrayList522.isEmpty()) {
                                }
                                com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPayPalCreditFundingInstrument onExternalPayPalCreditFundingInstrument22 = onExternalFundingInstrument.getOnExternalPayPalCreditFundingInstrument();
                                arrayList2.add(new com.paypal.oslo.feature.inappcheckout.data.dto.FundingInstrumentDTO(str5, id, name5, label, imageUrlDTO, fundingUsabilityDTO, str3, name3, str4, (com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO) null, arrayList6, (onExternalPayPalCreditFundingInstrument22 != null || (creditOffer = onExternalPayPalCreditFundingInstrument22.getCreditOffer()) == null) ? null : new com.paypal.oslo.feature.inappcheckout.data.dto.CreditOfferDTO(creditOffer.getText1(), creditOffer.getText2(), creditOffer.getTermLink(), creditOffer.getTermLinkText()), (java.lang.String) null, 4608, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                it2 = it622;
                                defaultRaise4 = defaultRaise622;
                                onExternalFundingSelectionSuccessResponse = onExternalFundingSelectionSuccessResponse322;
                            }
                        }
                    }
                    str3 = lastDigits;
                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCardFundingInstrument onExternalCardFundingInstrument32 = onExternalFundingInstrument.getOnExternalCardFundingInstrument();
                    if (onExternalCardFundingInstrument32 != null) {
                    }
                    onExternalBankFundingInstrument = onExternalFundingInstrument.getOnExternalBankFundingInstrument();
                    if (onExternalBankFundingInstrument != null) {
                    }
                    onExternalCardFundingInstrument = onExternalFundingInstrument.getOnExternalCardFundingInstrument();
                    if (onExternalCardFundingInstrument != null) {
                    }
                    str4 = null;
                    java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency> instrumentationLevelContingencies222 = onExternalFundingInstrument.getInstrumentationLevelContingencies();
                    java.util.ArrayList arrayList4222 = new java.util.ArrayList();
                    it = instrumentationLevelContingencies222.iterator();
                    while (it.hasNext()) {
                    }
                    java.util.Iterator it6222 = it2;
                    arrow.core.raise.DefaultRaise defaultRaise6222 = defaultRaise4;
                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingSelectionSuccessResponse onExternalFundingSelectionSuccessResponse3222 = onExternalFundingSelectionSuccessResponse;
                    java.util.ArrayList arrayList5222 = arrayList4222;
                    if (!arrayList5222.isEmpty()) {
                    }
                    com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPayPalCreditFundingInstrument onExternalPayPalCreditFundingInstrument222 = onExternalFundingInstrument.getOnExternalPayPalCreditFundingInstrument();
                    arrayList2.add(new com.paypal.oslo.feature.inappcheckout.data.dto.FundingInstrumentDTO(str5, id, name5, label, imageUrlDTO, fundingUsabilityDTO, str3, name3, str4, (com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO) null, arrayList6, (onExternalPayPalCreditFundingInstrument222 != null || (creditOffer = onExternalPayPalCreditFundingInstrument222.getCreditOffer()) == null) ? null : new com.paypal.oslo.feature.inappcheckout.data.dto.CreditOfferDTO(creditOffer.getText1(), creditOffer.getText2(), creditOffer.getTermLink(), creditOffer.getTermLinkText()), (java.lang.String) null, 4608, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                    it2 = it6222;
                    defaultRaise4 = defaultRaise6222;
                    onExternalFundingSelectionSuccessResponse = onExternalFundingSelectionSuccessResponse3222;
                }
                arrow.core.raise.DefaultRaise defaultRaise7 = defaultRaise4;
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingSelectionSuccessResponse onExternalFundingSelectionSuccessResponse4 = onExternalFundingSelectionSuccessResponse;
                java.util.ArrayList arrayList7 = arrayList2;
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Config config = onExternalFundingSelectionSuccessResponse4.getConfig();
                java.util.List<java.lang.String> selectedInstrumentIds = config.getSelectedInstrumentIds();
                java.lang.String preferredInstrumentId = config.getPreferredInstrumentId();
                java.lang.String recommendedInstrumentId = config.getRecommendedInstrumentId();
                java.lang.Boolean balanceEligibility = config.getBalanceEligibility();
                java.lang.Boolean balanceSelected = config.getBalanceSelected();
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBalanceSubType balanceSubType = config.getBalanceSubType();
                com.paypal.oslo.feature.inappcheckout.data.dto.FundingConfigDTO fundingConfigDTO = new com.paypal.oslo.feature.inappcheckout.data.dto.FundingConfigDTO(selectedInstrumentIds, preferredInstrumentId, recommendedInstrumentId, balanceEligibility, balanceSelected, balanceSubType != null ? balanceSubType.name() : null, config.getMustUseInstrumentIds(), null, null, 384, null);
                java.util.List<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TransactionLevelContingency> transactionLevelContingencies = onExternalFundingSelectionSuccessResponse4.getTransactionLevelContingencies();
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                for (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TransactionLevelContingency transactionLevelContingency : transactionLevelContingencies) {
                    com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO highSpeedVideoSizes2 = getHighSpeedVideoSizes(transactionLevelContingency, transactionLevelContingency.get__typename(), this.getOutputMinFrameDuration, "transaction");
                    if (highSpeedVideoSizes2 != null) {
                        arrayList8.add(highSpeedVideoSizes2);
                    }
                }
                java.util.ArrayList arrayList9 = arrayList8;
                com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO fundingSelectionDTO = new com.paypal.oslo.feature.inappcheckout.data.dto.FundingSelectionDTO((java.lang.String) null, arrayList7, fundingConfigDTO, arrayList9.isEmpty() ? null : arrayList9, (java.util.List) null, 17, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                defaultRaise7.complete();
                return new arrow.core.Either.Right(fundingSelectionDTO);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "externalFundingSelectionErrorResponse")) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingSelectionErrorResponse onExternalFundingSelectionErrorResponse = p0.getOnExternalFundingSelectionErrorResponse();
                if (onExternalFundingSelectionErrorResponse == null) {
                    defaultRaise3.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("INVALID_RESPONSE", "Error response is null despite __typename indicating error", false, null, null, 24, null));
                    throw new kotlin.KotlinNothingValueException();
                }
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Error error = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Error) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) onExternalFundingSelectionErrorResponse.getErrors());
                if (error == null || (name2 = error.getName()) == null || (str2 = name2.name()) == null) {
                    str2 = "UNKNOWN_ERROR";
                }
                java.lang.String str7 = str2;
                java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(onExternalFundingSelectionErrorResponse.getErrors(), ", ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.data.repository.FundingSelectionApiRepositoryImpl.$r8$lambda$PZgrt1K2gQ4OsaLIHNJ0oSJplPg((com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Error) obj);
                    }
                }, 30, null);
                com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getInputFormats, "Funding selection fetch returned errors", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, joinToString$default)), null, 4, null);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Funding selection errors: ");
                sb.append(joinToString$default);
                defaultRaise3.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity(str7, sb.toString(), true, null, null, 24, null));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(this.getInputFormats, "Unknown response type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TYPENAME, p0.get__typename())), null, 4, null);
            java.lang.String str8 = p0.get__typename();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown response type: ");
            sb2.append(str8);
            defaultRaise3.raise(new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("UNKNOWN_RESPONSE_TYPE", sb2.toString(), false, null, null, 24, null));
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
            defaultRaise2.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
        } catch (java.lang.Throwable th2) {
            th = th2;
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.dto.InstrumentLevelContingencyDTO $r8$lambda$3XWfB9bEl6IDAf4pc1tlSgOcylI(com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency instrumentationLevelContingency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentationLevelContingency, "");
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPreAuthorizationRequiredContingency onExternalPreAuthorizationRequiredContingency = instrumentationLevelContingency.getOnExternalPreAuthorizationRequiredContingency();
        return onExternalPreAuthorizationRequiredContingency != null ? new com.paypal.oslo.feature.inappcheckout.data.dto.PreAuthRequiredContingencyDTO(com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.PRE_AUTHORIZATION_REQUIRED, onExternalPreAuthorizationRequiredContingency.getAuthorizedAmount().getFundingSelectionMoneyFields().getValue(), onExternalPreAuthorizationRequiredContingency.getId(), onExternalPreAuthorizationRequiredContingency.getAuthorizedAmount().getFundingSelectionMoneyFields().getCurrencyCode().toString(), null, onExternalPreAuthorizationRequiredContingency.getName().name()) : null;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO $r8$lambda$DwJTTRo9VQsmmNfoopKckIGUC8Q(com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency instrumentationLevelContingency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentationLevelContingency, "");
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBankAccountBalanceRequiredContingency onExternalBankAccountBalanceRequiredContingency = instrumentationLevelContingency.getOnExternalBankAccountBalanceRequiredContingency();
        return onExternalBankAccountBalanceRequiredContingency != null ? new com.paypal.oslo.feature.inappcheckout.data.dto.BankAccountBalanceRequiredContingencyDTO(com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.BANK_ACCOUNT_BALANCE_REQUIRED, null, null, onExternalBankAccountBalanceRequiredContingency.getName().name()) : null;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO $r8$lambda$KBo2Flbx9QHRnswNq328A_7l9do(com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency instrumentationLevelContingency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentationLevelContingency, "");
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalThreeDsContingency onExternalThreeDsContingency = instrumentationLevelContingency.getOnExternalThreeDsContingency();
        return onExternalThreeDsContingency != null ? new com.paypal.oslo.feature.inappcheckout.data.dto.ThreeDsContingencyDTO(com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.THREE_DS_AUTHENTICATION_REQUIRED, null, null, onExternalThreeDsContingency.getName().name()) : null;
    }

    /* renamed from: $r8$lambda$NWYuEDT5W5-TXQtndfQW6mT6Ris, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO m15418$r8$lambda$NWYuEDT5W5TXQtndfQW6mT6Ris(com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TransactionLevelContingency transactionLevelContingency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionLevelContingency, "");
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalContingency1 onExternalContingency = transactionLevelContingency.getOnExternalContingency();
        return onExternalContingency != null ? new com.paypal.oslo.feature.inappcheckout.data.dto.UnknownContingencyDTO(com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.UNKNOWN, null, onExternalContingency.getName().name()) : null;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$PZgrt1K2gQ4OsaLIHNJ0oSJplPg(com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Error error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        return error.getName().name();
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO $r8$lambda$Z9LQak30QvxTsYvcsJJGhrxECcE(com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TransactionLevelContingency transactionLevelContingency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionLevelContingency, "");
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalAuthChallengeContingency onExternalAuthChallengeContingency = transactionLevelContingency.getOnExternalAuthChallengeContingency();
        return onExternalAuthChallengeContingency != null ? new com.paypal.oslo.feature.inappcheckout.data.dto.AuthChallengeContingencyDTO(com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.AUTH_CHALLENGE, onExternalAuthChallengeContingency.getStepUpAuthID(), null, onExternalAuthChallengeContingency.getName().name()) : null;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO $r8$lambda$ZJpgaX467XAOD1NJ74nsd8ZLYLA(com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency instrumentationLevelContingency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentationLevelContingency, "");
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUnknownContingency onExternalUnknownContingency = instrumentationLevelContingency.getOnExternalUnknownContingency();
        return onExternalUnknownContingency != null ? new com.paypal.oslo.feature.inappcheckout.data.dto.InstrumentLevelUnknownContingencyDTO(com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.UNKNOWN, null, null, onExternalUnknownContingency.getDownstreamContingencyType()) : null;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.dto.TransactionLevelContingencyDTO $r8$lambda$_kQIMsJqpWWG7ddvz8O6YEExwX4(com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TransactionLevelContingency transactionLevelContingency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionLevelContingency, "");
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalAddCardContingency onExternalAddCardContingency = transactionLevelContingency.getOnExternalAddCardContingency();
        return onExternalAddCardContingency != null ? new com.paypal.oslo.feature.inappcheckout.data.dto.AddCardContingencyDTO(com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.ADD_INSTRUMENT, null, onExternalAddCardContingency.getName().name()) : null;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO $r8$lambda$c8RxCQOOjX73s4XIm3R51zOnwyg(com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency instrumentationLevelContingency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentationLevelContingency, "");
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalContingency onExternalContingency = instrumentationLevelContingency.getOnExternalContingency();
        return onExternalContingency != null ? new com.paypal.oslo.feature.inappcheckout.data.dto.InstrumentLevelUnknownContingencyDTO(com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.UNKNOWN, null, null, onExternalContingency.getName().name()) : null;
    }

    /* renamed from: $r8$lambda$fnoGY-lkS8kLmwCpFnhBNCqbewg, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO m15419$r8$lambda$fnoGYlkS8kLmwCpFnhBNCqbewg(com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TransactionLevelContingency transactionLevelContingency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionLevelContingency, "");
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUnknownContingency1 onExternalUnknownContingency = transactionLevelContingency.getOnExternalUnknownContingency();
        return onExternalUnknownContingency != null ? new com.paypal.oslo.feature.inappcheckout.data.dto.UnknownContingencyDTO(com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.UNKNOWN, null, onExternalUnknownContingency.getDownstreamContingencyType()) : null;
    }

    /* renamed from: $r8$lambda$u98c0-gN2FtDWB-w3Ts7R1Nq1XY, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO m15420$r8$lambda$u98c0gN2FtDWBw3Ts7R1Nq1XY(com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TransactionLevelContingency transactionLevelContingency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionLevelContingency, "");
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUpdateCardContingency onExternalUpdateCardContingency = transactionLevelContingency.getOnExternalUpdateCardContingency();
        return onExternalUpdateCardContingency != null ? new com.paypal.oslo.feature.inappcheckout.data.dto.UpdateCardContingencyDTO(com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.UPDATE_CARD_INSTRUMENT, null, onExternalUpdateCardContingency.getName().name()) : null;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO $r8$lambda$x9ibpfOrtptADLzN_6hQImQ859Y(com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency instrumentationLevelContingency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentationLevelContingency, "");
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUserConsentForBankAccountInfoContingency onExternalUserConsentForBankAccountInfoContingency = instrumentationLevelContingency.getOnExternalUserConsentForBankAccountInfoContingency();
        return onExternalUserConsentForBankAccountInfoContingency != null ? new com.paypal.oslo.feature.inappcheckout.data.dto.UserConsentForBankAccountInfoContingencyDTO(com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyNameDTO.USER_CONSENT_FOR_BANK_ACCOUNT_INFO_REQUIRED, null, null, onExternalUserConsentForBankAccountInfoContingency.getName().name()) : null;
    }
}
