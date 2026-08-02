package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001d0\u0019H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020#0\u00192\n\u0010\"\u001a\u00060 j\u0002`!H\u0096@¢\u0006\u0004\b$\u0010%J$\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020(0\u00192\u0006\u0010'\u001a\u00020&H\u0096@¢\u0006\u0004\b)\u0010*J$\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020,0\u00192\u0006\u0010'\u001a\u00020+H\u0096@¢\u0006\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00102\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010:"}, d2 = {"Lcom/paypal/oslo/feature/balance/data/repository/autoreload/AutoReloadRepositoryImpl;", "Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;", "Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchAutoReloadConfigCall;", "fetchAutoReloadConfigCall", "Lcom/paypal/oslo/feature/balance/data/repository/autoreload/CreateAutoReloadCall;", "createAutoReloadCall", "Lcom/paypal/oslo/feature/balance/data/repository/autoreload/UpdateAutoReloadCall;", "updateAutoReloadCall", "Lcom/paypal/oslo/feature/balance/data/repository/autoreload/DisableAutoReloadCall;", "disableAutoReloadCall", "Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchDepositOptionsCall;", "fetchDepositOptionsCall", "Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchSavingsAccountsCall;", "fetchSavingsAccountsCall", "<init>", "(Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchAutoReloadConfigCall;Lcom/paypal/oslo/feature/balance/data/repository/autoreload/CreateAutoReloadCall;Lcom/paypal/oslo/feature/balance/data/repository/autoreload/UpdateAutoReloadCall;Lcom/paypal/oslo/feature/balance/data/repository/autoreload/DisableAutoReloadCall;Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchDepositOptionsCall;Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchSavingsAccountsCall;)V", "", "force", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadConfig;", "fetchAutoReloadConfig", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositOptionsRequest;", "amount", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositOptionsResponse;", "fetchDepositOptions", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositOptionsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/SavingsAccountResponse;", "fetchSavingsAccounts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadScheduleType;", "Lcom/paypal/oslo/feature/balance/graphql/type/BalanceAutoReloadScheduleType;", "scheduleType", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadDisableResult;", "disableAutoReload", "(Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadScheduleType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/CreateAutoReloadRequest;", "request", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/CreateAutoReloadSuccessResponse;", "createAutoReload", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/CreateAutoReloadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/UpdateAutoReloadRequest;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/UpdateAutoReloadResponse;", "updateAutoReload", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/UpdateAutoReloadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchAutoReloadConfigCall;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/balance/data/repository/autoreload/CreateAutoReloadCall;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/balance/data/repository/autoreload/UpdateAutoReloadCall;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/balance/data/repository/autoreload/DisableAutoReloadCall;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchDepositOptionsCall;", "Lcom/paypal/oslo/feature/balance/data/repository/autoreload/FetchSavingsAccountsCall;", "getOutputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AutoReloadRepositoryImpl implements com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public AutoReloadRepositoryImpl(com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall fetchAutoReloadConfigCall, com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall createAutoReloadCall, com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall updateAutoReloadCall, com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall disableAutoReloadCall, com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall fetchDepositOptionsCall, com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall fetchSavingsAccountsCall) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchAutoReloadConfigCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createAutoReloadCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAutoReloadCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disableAutoReloadCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchDepositOptionsCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchSavingsAccountsCall, "");
        this.getHighSpeedVideoFpsRangesFor = fetchAutoReloadConfigCall;
        this.getHighResolutionOutputSizeshNQ4ISI = createAutoReloadCall;
        this.getHighSpeedVideoFpsRanges = updateAutoReloadCall;
        this.Camera2StreamConfigurationMap = disableAutoReloadCall;
        this.getHighSpeedVideoSizes = fetchDepositOptionsCall;
        this.getOutputFormats = fetchSavingsAccountsCall;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchAutoReloadConfig(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig>> continuation) {
        com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$fetchAutoReloadConfig$1 autoReloadRepositoryImpl$fetchAutoReloadConfig$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$fetchAutoReloadConfig$1) {
            autoReloadRepositoryImpl$fetchAutoReloadConfig$1 = (com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$fetchAutoReloadConfig$1) continuation;
            if ((autoReloadRepositoryImpl$fetchAutoReloadConfig$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                autoReloadRepositoryImpl$fetchAutoReloadConfig$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = autoReloadRepositoryImpl$fetchAutoReloadConfig$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoReloadRepositoryImpl$fetchAutoReloadConfig$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall fetchAutoReloadConfigCall = this.getHighSpeedVideoFpsRangesFor;
                    autoReloadRepositoryImpl$fetchAutoReloadConfig$1.getHighSpeedVideoFpsRanges = z;
                    autoReloadRepositoryImpl$fetchAutoReloadConfig$1.getHighSpeedVideoSizes = 1;
                    obj = fetchAutoReloadConfigCall.execute(z, autoReloadRepositoryImpl$fetchAutoReloadConfig$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = autoReloadRepositoryImpl$fetchAutoReloadConfig$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackAutoReloadIorResult("get_auto_reload_config", "query", (arrow.core.Ior) obj);
                return obj;
            }
        }
        autoReloadRepositoryImpl$fetchAutoReloadConfig$1 = new com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$fetchAutoReloadConfig$1(this, continuation);
        java.lang.Object obj2 = autoReloadRepositoryImpl$fetchAutoReloadConfig$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoReloadRepositoryImpl$fetchAutoReloadConfig$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackAutoReloadIorResult("get_auto_reload_config", "query", (arrow.core.Ior) obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchDepositOptions(com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsRequest depositOptionsRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsResponse>> continuation) {
        com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$fetchDepositOptions$1 autoReloadRepositoryImpl$fetchDepositOptions$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$fetchDepositOptions$1) {
            autoReloadRepositoryImpl$fetchDepositOptions$1 = (com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$fetchDepositOptions$1) continuation;
            if ((autoReloadRepositoryImpl$fetchDepositOptions$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                autoReloadRepositoryImpl$fetchDepositOptions$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$fetchDepositOptions$1 autoReloadRepositoryImpl$fetchDepositOptions$12 = autoReloadRepositoryImpl$fetchDepositOptions$1;
                java.lang.Object obj = autoReloadRepositoryImpl$fetchDepositOptions$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoReloadRepositoryImpl$fetchDepositOptions$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall fetchDepositOptionsCall = this.getHighSpeedVideoSizes;
                    java.lang.String amount = depositOptionsRequest.getAmount();
                    java.lang.String currencyCode = depositOptionsRequest.getCurrencyCode();
                    boolean isLowBalance = depositOptionsRequest.isLowBalance();
                    autoReloadRepositoryImpl$fetchDepositOptions$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositOptionsRequest);
                    autoReloadRepositoryImpl$fetchDepositOptions$12.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.feature.balance.data.repository.autoreload.FetchDepositOptionsCall.execute$default(fetchDepositOptionsCall, amount, currencyCode, isLowBalance, null, autoReloadRepositoryImpl$fetchDepositOptions$12, 8, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackAutoReloadResult("get_financial_instruments", "query", (arrow.core.Either) obj);
                return obj;
            }
        }
        autoReloadRepositoryImpl$fetchDepositOptions$1 = new com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$fetchDepositOptions$1(this, continuation);
        com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$fetchDepositOptions$1 autoReloadRepositoryImpl$fetchDepositOptions$122 = autoReloadRepositoryImpl$fetchDepositOptions$1;
        java.lang.Object obj2 = autoReloadRepositoryImpl$fetchDepositOptions$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoReloadRepositoryImpl$fetchDepositOptions$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackAutoReloadResult("get_financial_instruments", "query", (arrow.core.Either) obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchSavingsAccounts(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccountResponse>> continuation) {
        com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$fetchSavingsAccounts$1 autoReloadRepositoryImpl$fetchSavingsAccounts$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$fetchSavingsAccounts$1) {
            autoReloadRepositoryImpl$fetchSavingsAccounts$1 = (com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$fetchSavingsAccounts$1) continuation;
            if ((autoReloadRepositoryImpl$fetchSavingsAccounts$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                autoReloadRepositoryImpl$fetchSavingsAccounts$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = autoReloadRepositoryImpl$fetchSavingsAccounts$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoReloadRepositoryImpl$fetchSavingsAccounts$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.data.repository.autoreload.FetchSavingsAccountsCall fetchSavingsAccountsCall = this.getOutputFormats;
                    autoReloadRepositoryImpl$fetchSavingsAccounts$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = fetchSavingsAccountsCall.execute(autoReloadRepositoryImpl$fetchSavingsAccounts$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackAutoReloadResult("get_financial_instruments", "query", (arrow.core.Either) obj);
                return obj;
            }
        }
        autoReloadRepositoryImpl$fetchSavingsAccounts$1 = new com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$fetchSavingsAccounts$1(this, continuation);
        java.lang.Object obj2 = autoReloadRepositoryImpl$fetchSavingsAccounts$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoReloadRepositoryImpl$fetchSavingsAccounts$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackAutoReloadResult("get_financial_instruments", "query", (arrow.core.Either) obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object disableAutoReload(com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadScheduleType balanceAutoReloadScheduleType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadDisableResult>> continuation) {
        com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$disableAutoReload$1 autoReloadRepositoryImpl$disableAutoReload$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$disableAutoReload$1) {
            autoReloadRepositoryImpl$disableAutoReload$1 = (com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$disableAutoReload$1) continuation;
            if ((autoReloadRepositoryImpl$disableAutoReload$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                autoReloadRepositoryImpl$disableAutoReload$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = autoReloadRepositoryImpl$disableAutoReload$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoReloadRepositoryImpl$disableAutoReload$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.data.repository.autoreload.DisableAutoReloadCall disableAutoReloadCall = this.Camera2StreamConfigurationMap;
                    autoReloadRepositoryImpl$disableAutoReload$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balanceAutoReloadScheduleType);
                    autoReloadRepositoryImpl$disableAutoReload$1.Camera2StreamConfigurationMap = 1;
                    obj = disableAutoReloadCall.execute(balanceAutoReloadScheduleType, autoReloadRepositoryImpl$disableAutoReload$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackAutoReloadResult("turn_off_auto_reload", "mutation", (arrow.core.Either) obj);
                this.getHighSpeedVideoFpsRangesFor.invalidateCache();
                return obj;
            }
        }
        autoReloadRepositoryImpl$disableAutoReload$1 = new com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$disableAutoReload$1(this, continuation);
        java.lang.Object obj2 = autoReloadRepositoryImpl$disableAutoReload$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoReloadRepositoryImpl$disableAutoReload$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackAutoReloadResult("turn_off_auto_reload", "mutation", (arrow.core.Either) obj2);
        this.getHighSpeedVideoFpsRangesFor.invalidateCache();
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createAutoReload(com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadRequest createAutoReloadRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse>> continuation) {
        com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$createAutoReload$1 autoReloadRepositoryImpl$createAutoReload$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$createAutoReload$1) {
            autoReloadRepositoryImpl$createAutoReload$1 = (com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$createAutoReload$1) continuation;
            if ((autoReloadRepositoryImpl$createAutoReload$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                autoReloadRepositoryImpl$createAutoReload$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = autoReloadRepositoryImpl$createAutoReload$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoReloadRepositoryImpl$createAutoReload$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.data.repository.autoreload.CreateAutoReloadCall createAutoReloadCall = this.getHighResolutionOutputSizeshNQ4ISI;
                    autoReloadRepositoryImpl$createAutoReload$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createAutoReloadRequest);
                    autoReloadRepositoryImpl$createAutoReload$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = createAutoReloadCall.execute(createAutoReloadRequest, autoReloadRepositoryImpl$createAutoReload$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackAutoReloadResult(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceHub.ACTION_AUTO_RELOAD, "mutation", (arrow.core.Either) obj);
                this.getHighSpeedVideoFpsRangesFor.invalidateCache();
                return obj;
            }
        }
        autoReloadRepositoryImpl$createAutoReload$1 = new com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$createAutoReload$1(this, continuation);
        java.lang.Object obj2 = autoReloadRepositoryImpl$createAutoReload$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoReloadRepositoryImpl$createAutoReload$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackAutoReloadResult(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceHub.ACTION_AUTO_RELOAD, "mutation", (arrow.core.Either) obj2);
        this.getHighSpeedVideoFpsRangesFor.invalidateCache();
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateAutoReload(com.paypal.oslo.feature.balance.domain.model.autoreload.UpdateAutoReloadRequest updateAutoReloadRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.UpdateAutoReloadResponse>> continuation) {
        com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$updateAutoReload$1 autoReloadRepositoryImpl$updateAutoReload$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$updateAutoReload$1) {
            autoReloadRepositoryImpl$updateAutoReload$1 = (com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$updateAutoReload$1) continuation;
            if ((autoReloadRepositoryImpl$updateAutoReload$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                autoReloadRepositoryImpl$updateAutoReload$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = autoReloadRepositoryImpl$updateAutoReload$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autoReloadRepositoryImpl$updateAutoReload$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall updateAutoReloadCall = this.getHighSpeedVideoFpsRanges;
                    autoReloadRepositoryImpl$updateAutoReload$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateAutoReloadRequest);
                    autoReloadRepositoryImpl$updateAutoReload$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = updateAutoReloadCall.execute(updateAutoReloadRequest, autoReloadRepositoryImpl$updateAutoReload$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackAutoReloadResult("update_auto_reload", "mutation", (arrow.core.Either) obj);
                this.getHighSpeedVideoFpsRangesFor.invalidateCache();
                return obj;
            }
        }
        autoReloadRepositoryImpl$updateAutoReload$1 = new com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadRepositoryImpl$updateAutoReload$1(this, continuation);
        java.lang.Object obj2 = autoReloadRepositoryImpl$updateAutoReload$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autoReloadRepositoryImpl$updateAutoReload$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        com.paypal.oslo.feature.balance.analytics.BalanceApiTrackerKt.trackAutoReloadResult("update_auto_reload", "mutation", (arrow.core.Either) obj2);
        this.getHighSpeedVideoFpsRangesFor.invalidateCache();
        return obj2;
    }
}
