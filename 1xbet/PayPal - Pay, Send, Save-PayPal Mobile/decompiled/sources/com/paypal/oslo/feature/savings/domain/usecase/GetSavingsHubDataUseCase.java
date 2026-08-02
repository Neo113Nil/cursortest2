package com.paypal.oslo.feature.savings.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsHubDataUseCase;", "", "Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;", "savingsRepository", "Lcom/paypal/oslo/feature/savings/manager/SavingsFeatureManager;", "featureManager", "Lcom/paypal/oslo/feature/savings/util/CurrencyHandlerImpl;", "currencyFormatter", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;Lcom/paypal/oslo/feature/savings/manager/SavingsFeatureManager;Lcom/paypal/oslo/feature/savings/util/CurrencyHandlerImpl;)V", "", "countryCode", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsError;", "Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsHubDataResult;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/savings/manager/SavingsFeatureManager;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/savings/util/CurrencyHandlerImpl;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetSavingsHubDataUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.repository.SavingsRepository getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.manager.SavingsFeatureManager getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetSavingsHubDataUseCase(com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository, com.paypal.oslo.feature.savings.manager.SavingsFeatureManager savingsFeatureManager, com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl currencyHandlerImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsFeatureManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyHandlerImpl, "");
        this.getHighSpeedVideoFpsRangesFor = savingsRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = savingsFeatureManager;
        this.getHighSpeedVideoSizes = currencyHandlerImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0103 A[Catch: all -> 0x0120, RaiseCancellationException -> 0x012a, TryCatch #4 {RaiseCancellationException -> 0x012a, all -> 0x0120, blocks: (B:12:0x004a, B:13:0x00f5, B:15:0x0103, B:17:0x010b, B:18:0x010f, B:29:0x00bb, B:42:0x008c), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010b A[Catch: all -> 0x0120, RaiseCancellationException -> 0x012a, TryCatch #4 {RaiseCancellationException -> 0x012a, all -> 0x0120, blocks: (B:12:0x004a, B:13:0x00f5, B:15:0x0103, B:17:0x010b, B:18:0x010f, B:29:0x00bb, B:42:0x008c), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r10v5, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [arrow.core.raise.DefaultRaise] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult>> continuation) {
        com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase$invoke$1 getSavingsHubDataUseCase$invoke$1;
        java.lang.Object coroutine_suspended;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        int i;
        java.lang.String str2;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.lang.Object obj;
        int i2;
        int i3;
        int i4;
        arrow.core.raise.DefaultRaise defaultRaise3;
        java.lang.Object savingsHubTiles;
        com.paypal.oslo.feature.savings.domain.model.SavingsHubData savingsHubData;
        try {
            if (continuation instanceof com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase$invoke$1) {
                getSavingsHubDataUseCase$invoke$1 = (com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase$invoke$1) continuation;
                if ((getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                    getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoSizesFor -= 2147483648;
                    java.lang.Object obj2 = getSavingsHubDataUseCase$invoke$1.getOutputSizes;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        arrow.core.raise.DefaultRaise defaultRaise4 = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise4;
                        com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository = this.getHighSpeedVideoFpsRangesFor;
                        getSavingsHubDataUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        getSavingsHubDataUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise4;
                        getSavingsHubDataUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise5);
                        getSavingsHubDataUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise5;
                        getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        getSavingsHubDataUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoSizesFor = 1;
                        java.lang.Object savingsHubData2 = savingsRepository.getSavingsHubData(str, null, getSavingsHubDataUseCase$invoke$1);
                        if (savingsHubData2 != coroutine_suspended) {
                            i = 0;
                            str2 = str;
                            defaultRaise2 = defaultRaise5;
                            obj = defaultRaise2;
                            i2 = 0;
                            i3 = 0;
                            obj2 = savingsHubData2;
                            i4 = 0;
                            defaultRaise3 = defaultRaise4;
                        }
                        return coroutine_suspended;
                    }
                    if (r4 != 1) {
                        if (r4 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i5 = getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        int i6 = getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoSizes;
                        int i7 = getSavingsHubDataUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i8 = getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        savingsHubData = (com.paypal.oslo.feature.savings.domain.model.SavingsHubData) getSavingsHubDataUseCase$invoke$1.getInputSizeshNQ4ISI;
                        arrow.core.raise.DefaultRaise defaultRaise6 = (arrow.core.raise.DefaultRaise) getSavingsHubDataUseCase$invoke$1.getOutputMinFrameDuration;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        r4 = defaultRaise6;
                        java.util.List list = (java.util.List) obj2;
                        com.paypal.oslo.feature.savings.domain.model.SavingsAccountData savingsAccountData = (com.paypal.oslo.feature.savings.domain.model.SavingsAccountData) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) savingsHubData.getSavingsAccounts());
                        com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult savingsHubDataResult = new com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult(list, savingsAccountData == null ? savingsAccountData.getElectronic1099OptIn() : null, savingsAccountData != null ? savingsAccountData.getId() : null);
                        r4.complete();
                        return new arrow.core.Either.Right(savingsHubDataResult);
                    }
                    int i9 = getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    int i10 = getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoSizes;
                    int i11 = getSavingsHubDataUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i12 = getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    ?? r10 = (arrow.core.raise.Raise) getSavingsHubDataUseCase$invoke$1.getInputSizeshNQ4ISI;
                    java.lang.Object obj3 = (arrow.core.raise.Raise) getSavingsHubDataUseCase$invoke$1.getOutputFormats;
                    defaultRaise = (arrow.core.raise.DefaultRaise) getSavingsHubDataUseCase$invoke$1.getOutputMinFrameDuration;
                    str2 = (java.lang.String) getSavingsHubDataUseCase$invoke$1.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        i2 = i9;
                        defaultRaise3 = defaultRaise;
                        obj = obj3;
                        defaultRaise2 = r10;
                        i3 = i12;
                        i = i11;
                        i4 = i10;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                    com.paypal.oslo.feature.savings.domain.model.SavingsHubData savingsHubData3 = (com.paypal.oslo.feature.savings.domain.model.SavingsHubData) defaultRaise2.bind((arrow.core.Either) obj2);
                    com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry savingsHubComponentRegistry = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
                    getSavingsHubDataUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    getSavingsHubDataUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise3;
                    getSavingsHubDataUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                    getSavingsHubDataUseCase$invoke$1.getInputSizeshNQ4ISI = savingsHubData3;
                    getSavingsHubDataUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsHubComponentRegistry);
                    getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoFpsRanges = i3;
                    getSavingsHubDataUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i;
                    getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoSizes = i4;
                    getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i2;
                    getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoSizesFor = 2;
                    savingsHubTiles = savingsHubComponentRegistry.getSavingsHubTiles(savingsHubData3, getSavingsHubDataUseCase$invoke$1);
                    if (savingsHubTiles != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    savingsHubData = savingsHubData3;
                    obj2 = savingsHubTiles;
                    r4 = defaultRaise3;
                    java.util.List list2 = (java.util.List) obj2;
                    com.paypal.oslo.feature.savings.domain.model.SavingsAccountData savingsAccountData2 = (com.paypal.oslo.feature.savings.domain.model.SavingsAccountData) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) savingsHubData.getSavingsAccounts());
                    com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult savingsHubDataResult2 = new com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult(list2, savingsAccountData2 == null ? savingsAccountData2.getElectronic1099OptIn() : null, savingsAccountData2 != null ? savingsAccountData2.getId() : null);
                    r4.complete();
                    return new arrow.core.Either.Right(savingsHubDataResult2);
                }
            }
            if (r4 != 0) {
            }
            com.paypal.oslo.feature.savings.domain.model.SavingsHubData savingsHubData32 = (com.paypal.oslo.feature.savings.domain.model.SavingsHubData) defaultRaise2.bind((arrow.core.Either) obj2);
            com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry savingsHubComponentRegistry2 = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
            getSavingsHubDataUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
            getSavingsHubDataUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise3;
            getSavingsHubDataUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
            getSavingsHubDataUseCase$invoke$1.getInputSizeshNQ4ISI = savingsHubData32;
            getSavingsHubDataUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsHubComponentRegistry2);
            getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoFpsRanges = i3;
            getSavingsHubDataUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i;
            getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoSizes = i4;
            getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i2;
            getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoSizesFor = 2;
            savingsHubTiles = savingsHubComponentRegistry2.getSavingsHubTiles(savingsHubData32, getSavingsHubDataUseCase$invoke$1);
            if (savingsHubTiles != coroutine_suspended) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
            defaultRaise = r4;
        } catch (java.lang.Throwable th2) {
            th = th2;
            defaultRaise = r4;
        }
        getSavingsHubDataUseCase$invoke$1 = new com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase$invoke$1(this, continuation);
        java.lang.Object obj22 = getSavingsHubDataUseCase$invoke$1.getOutputSizes;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = getSavingsHubDataUseCase$invoke$1.getHighSpeedVideoSizesFor;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.savings.domain.usecase.GetSavingsHubDataUseCase getSavingsHubDataUseCase, java.lang.String str, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "US";
        }
        return getSavingsHubDataUseCase.invoke(str, continuation);
    }
}
