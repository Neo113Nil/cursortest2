package com.paypal.oslo.feature.balance.data.usecase.autoreload;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 +2\u00020\u0001:\u0001+B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00160\u000eH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u001c\u001a\u00020\u001b*\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u0017\u001a\u00020\u001f*\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b\u0017\u0010 J\u0014\u0010\u0017\u001a\u00020!*\u00020\u0016H\u0082@¢\u0006\u0004\b\u0017\u0010\"J \u0010\u001c\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0082@¢\u0006\u0004\b\u001c\u0010'R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/balance/data/usecase/autoreload/GetAutoReloadFundingInstrumentOptionsUseCaseImpl;", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/GetAutoReloadFundingInstrumentUseCase;", "Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;", "repository", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "formatCurrencyUseCase", "<init>", "(Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;)V", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "amount", "", "isLowBalance", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentOption;", "invoke", "(Lcom/paypal/oslo/feature/balance/domain/model/Money;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositOptionsResponse;", "p0", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositOptionsResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/SavingsAccount;", "getHighSpeedVideoFpsRanges", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositOption;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositInstrument$BankAccount;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentBankOption;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositOption;Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositInstrument$BankAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositInstrument$Card;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentCardOption;", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositOption;Lcom/paypal/oslo/feature/balance/domain/model/autoreload/DepositInstrument$Card;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentSavingsOption;", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/SavingsAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyCode;", "Ljava/math/BigDecimal;", "p1", "", "(Ljava/lang/String;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetAutoReloadFundingInstrumentOptionsUseCaseImpl implements com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadFundingInstrumentUseCase {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository getHighSpeedVideoFpsRanges;
    public static final int $stable = 8;

    @javax.inject.Inject
    public GetAutoReloadFundingInstrumentOptionsUseCaseImpl(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatCurrencyUseCase, "");
        this.getHighSpeedVideoFpsRanges = autoReloadRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = formatCurrencyUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x020a, code lost:
    
        r0 = kotlin.collections.CollectionsKt.emptyList();
     */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00ef: MOVE (r14 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:74:0x00ef */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00f3: MOVE (r14 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:72:0x00f3 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x014f A[Catch: all -> 0x0228, RaiseCancellationException -> 0x0232, TryCatch #5 {RaiseCancellationException -> 0x0232, all -> 0x0228, blocks: (B:51:0x005a, B:28:0x01f2, B:32:0x01fd, B:33:0x0207, B:36:0x020a, B:37:0x020e, B:39:0x0212, B:40:0x0216, B:22:0x01b5, B:24:0x01bf, B:18:0x017c, B:19:0x0189, B:13:0x0145, B:15:0x014f, B:10:0x00fe), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01bf A[Catch: all -> 0x0228, RaiseCancellationException -> 0x0232, TryCatch #5 {RaiseCancellationException -> 0x0232, all -> 0x0228, blocks: (B:51:0x005a, B:28:0x01f2, B:32:0x01fd, B:33:0x0207, B:36:0x020a, B:37:0x020e, B:39:0x0212, B:40:0x0216, B:22:0x01b5, B:24:0x01bf, B:18:0x017c, B:19:0x0189, B:13:0x0145, B:15:0x014f, B:10:0x00fe), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0212 A[Catch: all -> 0x0228, RaiseCancellationException -> 0x0232, TryCatch #5 {RaiseCancellationException -> 0x0232, all -> 0x0228, blocks: (B:51:0x005a, B:28:0x01f2, B:32:0x01fd, B:33:0x0207, B:36:0x020a, B:37:0x020e, B:39:0x0212, B:40:0x0216, B:22:0x01b5, B:24:0x01bf, B:18:0x017c, B:19:0x0189, B:13:0x0145, B:15:0x014f, B:10:0x00fe), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f6  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    @Override // com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadFundingInstrumentUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.balance.domain.model.Money money, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, ? extends java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption>>> continuation) {
        com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1 getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1;
        ?? r5;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        int i;
        boolean z2;
        com.paypal.oslo.feature.balance.domain.model.Money money2;
        int i2;
        arrow.core.raise.DefaultRaise defaultRaise4;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsRequest depositOptionsRequest;
        int i3;
        int i4;
        int i5;
        arrow.core.raise.Raise raise2;
        com.paypal.oslo.feature.balance.domain.model.Money money3;
        int i6;
        boolean z3;
        com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsRequest depositOptionsRequest2;
        java.lang.Object obj;
        int i7;
        java.util.List list;
        arrow.core.raise.Raise raise3;
        java.util.List list2;
        com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccountResponse savingsAccountResponse;
        java.util.List list3;
        com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsResponse depositOptionsResponse;
        try {
            if (continuation instanceof com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1) {
                getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1 = (com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1) continuation;
                if ((getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDurationlomOqCM -= 2147483648;
                    java.lang.Object obj2 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputMinFrameDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r5 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDurationlomOqCM;
                    if (r5 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        defaultRaise4 = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise5 = defaultRaise4;
                        java.lang.String plainString = money.getAmount().toPlainString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
                        com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsRequest depositOptionsRequest3 = new com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsRequest(plainString, money.m12029getCurrencyCodehkTgrg(), z);
                        com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository = this.getHighSpeedVideoFpsRanges;
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money);
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputFormats = defaultRaise4;
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor = defaultRaise5;
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositOptionsRequest3);
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDuration = z;
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.Camera2StreamConfigurationMap = 0;
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizes = 0;
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDurationlomOqCM = 1;
                        java.lang.Object fetchDepositOptions = autoReloadRepository.fetchDepositOptions(depositOptionsRequest3, getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1);
                        if (fetchDepositOptions != coroutine_suspended) {
                            z2 = z;
                            raise = defaultRaise5;
                            depositOptionsRequest = depositOptionsRequest3;
                            obj2 = fetchDepositOptions;
                            i = 0;
                            i2 = 0;
                            i4 = 0;
                            i3 = 0;
                            money2 = money;
                        }
                        return coroutine_suspended;
                    }
                    try {
                        if (r5 != 1) {
                            if (r5 == 2) {
                                int i8 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                i = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
                                int i9 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizes;
                                int i10 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges;
                                i5 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.Camera2StreamConfigurationMap;
                                boolean z4 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDuration;
                                com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsRequest depositOptionsRequest4 = (com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsRequest) getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputMinFrameDuration;
                                raise2 = (arrow.core.raise.Raise) getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor;
                                defaultRaise = (arrow.core.raise.DefaultRaise) getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputFormats;
                                money3 = (com.paypal.oslo.feature.balance.domain.model.Money) getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getInputSizeshNQ4ISI;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    i2 = i9;
                                    defaultRaise4 = defaultRaise;
                                    depositOptionsRequest = depositOptionsRequest4;
                                    z2 = z4;
                                    i4 = i10;
                                    list3 = (java.util.List) obj2;
                                    i6 = i4;
                                    z3 = z2;
                                    depositOptionsRequest2 = depositOptionsRequest;
                                    com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository2 = this.getHighSpeedVideoFpsRanges;
                                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money3);
                                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputFormats = defaultRaise4;
                                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor = raise2;
                                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputMinFrameDuration = list3;
                                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositOptionsRequest2);
                                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDuration = z3;
                                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.Camera2StreamConfigurationMap = i5;
                                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges = i6;
                                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizes = i2;
                                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor = i;
                                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDurationlomOqCM = 3;
                                    obj = autoReloadRepository2.fetchSavingsAccounts(getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1);
                                    if (obj != coroutine_suspended) {
                                        java.util.List list4 = list3;
                                        i7 = i;
                                        list = list4;
                                        savingsAccountResponse = (com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccountResponse) ((arrow.core.Either) obj).getOrNull();
                                        if (savingsAccountResponse == null) {
                                        }
                                    }
                                    return coroutine_suspended;
                                } catch (arrow.core.raise.RaiseCancellationException e) {
                                    e = e;
                                    defaultRaise.complete();
                                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    defaultRaise.complete();
                                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                                }
                            }
                            if (r5 != 3) {
                                if (r5 != 4) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i11 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                                int i12 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
                                int i13 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizes;
                                int i14 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges;
                                int i15 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.Camera2StreamConfigurationMap;
                                boolean z5 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDuration;
                                list = (java.util.List) getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputMinFrameDuration;
                                raise3 = (arrow.core.raise.Raise) getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor;
                                defaultRaise4 = (arrow.core.raise.DefaultRaise) getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputFormats;
                                kotlin.ResultKt.throwOnFailure(obj2);
                                list2 = (java.util.List) obj2;
                                raise2 = raise3;
                                if (list == null && list2 == null) {
                                    raise2.raise(com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericApiError.INSTANCE);
                                    throw new kotlin.KotlinNothingValueException();
                                }
                                java.util.List list5 = list;
                                if (list2 == null) {
                                    list2 = kotlin.collections.CollectionsKt.emptyList();
                                }
                                java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) list5, (java.lang.Iterable) list2);
                                defaultRaise4.complete();
                                return new arrow.core.Either.Right(plus);
                            }
                            int i16 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
                            int i17 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizes;
                            i6 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges;
                            i5 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.Camera2StreamConfigurationMap;
                            z3 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDuration;
                            depositOptionsRequest2 = (com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsRequest) getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getInputFormats;
                            java.util.List list6 = (java.util.List) getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputMinFrameDuration;
                            arrow.core.raise.Raise raise4 = (arrow.core.raise.Raise) getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor;
                            arrow.core.raise.DefaultRaise defaultRaise6 = (arrow.core.raise.DefaultRaise) getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputFormats;
                            com.paypal.oslo.feature.balance.domain.model.Money money4 = (com.paypal.oslo.feature.balance.domain.model.Money) getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getInputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            obj = obj2;
                            i7 = i16;
                            list = list6;
                            raise2 = raise4;
                            i2 = i17;
                            defaultRaise4 = defaultRaise6;
                            money3 = money4;
                            savingsAccountResponse = (com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccountResponse) ((arrow.core.Either) obj).getOrNull();
                            if (savingsAccountResponse == null) {
                                java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccount> savingsAccounts = savingsAccountResponse.getSavingsAccounts();
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money3);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputFormats = defaultRaise4;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor = raise2;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputMinFrameDuration = list;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositOptionsRequest2);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsAccountResponse);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDuration = z3;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.Camera2StreamConfigurationMap = i5;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges = i6;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizes = i2;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor = i7;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDurationlomOqCM = 4;
                                obj2 = getHighSpeedVideoFpsRanges(savingsAccounts, getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1);
                                if (obj2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                raise3 = raise2;
                                list2 = (java.util.List) obj2;
                                raise2 = raise3;
                                if (list == null) {
                                    raise2.raise(com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericApiError.INSTANCE);
                                    throw new kotlin.KotlinNothingValueException();
                                }
                                java.util.List list52 = list;
                                if (list2 == null) {
                                }
                                java.util.List plus2 = kotlin.collections.CollectionsKt.plus((java.util.Collection) list52, (java.lang.Iterable) list2);
                                defaultRaise4.complete();
                                return new arrow.core.Either.Right(plus2);
                            }
                            list2 = null;
                            if (list == null) {
                            }
                            java.util.List list522 = list;
                            if (list2 == null) {
                            }
                            java.util.List plus22 = kotlin.collections.CollectionsKt.plus((java.util.Collection) list522, (java.lang.Iterable) list2);
                            defaultRaise4.complete();
                            return new arrow.core.Either.Right(plus22);
                        }
                        i = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
                        int i18 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizes;
                        int i19 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges;
                        int i20 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.Camera2StreamConfigurationMap;
                        z2 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDuration;
                        com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsRequest depositOptionsRequest5 = (com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsRequest) getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputMinFrameDuration;
                        arrow.core.raise.Raise raise5 = (arrow.core.raise.Raise) getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor;
                        arrow.core.raise.DefaultRaise defaultRaise7 = (arrow.core.raise.DefaultRaise) getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputFormats;
                        money2 = (com.paypal.oslo.feature.balance.domain.model.Money) getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        i2 = i18;
                        defaultRaise4 = defaultRaise7;
                        raise = raise5;
                        depositOptionsRequest = depositOptionsRequest5;
                        i3 = i20;
                        i4 = i19;
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise3;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                    }
                    depositOptionsResponse = (com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsResponse) ((arrow.core.Either) obj2).getOrNull();
                    if (depositOptionsResponse == null) {
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money2);
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputFormats = defaultRaise4;
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor = raise;
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositOptionsRequest);
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositOptionsResponse);
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDuration = z2;
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.Camera2StreamConfigurationMap = i3;
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges = i4;
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizes = i2;
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor = i;
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDurationlomOqCM = 2;
                        obj2 = getHighSpeedVideoSizes(depositOptionsResponse, getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1);
                        if (obj2 != coroutine_suspended) {
                            i5 = i3;
                            raise2 = raise;
                            money3 = money2;
                            list3 = (java.util.List) obj2;
                            i6 = i4;
                            z3 = z2;
                            depositOptionsRequest2 = depositOptionsRequest;
                            com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository22 = this.getHighSpeedVideoFpsRanges;
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money3);
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputFormats = defaultRaise4;
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor = raise2;
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputMinFrameDuration = list3;
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositOptionsRequest2);
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDuration = z3;
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.Camera2StreamConfigurationMap = i5;
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges = i6;
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizes = i2;
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor = i;
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDurationlomOqCM = 3;
                            obj = autoReloadRepository22.fetchSavingsAccounts(getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1);
                            if (obj != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    i6 = i4;
                    z3 = z2;
                    i5 = i3;
                    depositOptionsRequest2 = depositOptionsRequest;
                    raise2 = raise;
                    list3 = null;
                    money3 = money2;
                    com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository222 = this.getHighSpeedVideoFpsRanges;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money3);
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputFormats = defaultRaise4;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor = raise2;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputMinFrameDuration = list3;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositOptionsRequest2);
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDuration = z3;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.Camera2StreamConfigurationMap = i5;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges = i6;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoSizes = i2;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor = i;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDurationlomOqCM = 3;
                    obj = autoReloadRepository222.fetchSavingsAccounts(getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
            }
            if (r5 != 0) {
            }
            depositOptionsResponse = (com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsResponse) ((arrow.core.Either) obj2).getOrNull();
            if (depositOptionsResponse == null) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            e = e3;
            defaultRaise = r5;
        } catch (java.lang.Throwable th3) {
            th = th3;
            defaultRaise = r5;
        }
        getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1 = new com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1(this, continuation);
        java.lang.Object obj22 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r5 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$invoke$1.getOutputStallDurationlomOqCM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x015c, code lost:
    
        if (r5 == r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0168, code lost:
    
        r5 = r1;
        r1 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0165 -> B:14:0x0168). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0174 -> B:15:0x0176). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsResponse depositOptionsResponse, kotlin.coroutines.Continuation<? super java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption>> continuation) {
        com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1 getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1;
        int i;
        java.lang.Iterable iterable;
        java.lang.Iterable iterable2;
        java.lang.Iterable iterable3;
        java.util.Collection arrayList;
        java.util.Iterator it;
        int i2;
        int i3;
        int i4;
        com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsResponse depositOptionsResponse2;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1) {
            getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1 = (com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1) continuation;
            if ((getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.toString & Integer.MIN_VALUE) != 0) {
                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.toString -= 2147483648;
                java.lang.Object obj = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.isOutputSupportedFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.toString;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOption> options = depositOptionsResponse.getOptions();
                    iterable = options;
                    iterable2 = iterable;
                    iterable3 = iterable2;
                    arrayList = new java.util.ArrayList();
                    it = options.iterator();
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    depositOptionsResponse2 = depositOptionsResponse;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputMinFrameDuration;
                    int i6 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getHighSpeedVideoFpsRangesFor;
                    int i7 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getHighSpeedVideoFpsRanges;
                    i2 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getHighResolutionOutputSizeshNQ4ISI;
                    i3 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getHighSpeedVideoSizes;
                    i4 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.Camera2StreamConfigurationMap;
                    java.lang.Object obj2 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputSizeshNQ4ISI;
                    java.lang.Object obj3 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputStallDurationlomOqCM;
                    it = (java.util.Iterator) getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputStallDuration;
                    iterable = (java.lang.Iterable) getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputSizes;
                    arrayList = (java.util.Collection) getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getInputFormats;
                    iterable2 = (java.lang.Iterable) getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getInputSizeshNQ4ISI;
                    iterable3 = (java.lang.Iterable) getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getHighSpeedVideoSizesFor;
                    com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsResponse depositOptionsResponse3 = (com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsResponse) getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputFormats;
                    kotlin.ResultKt.throwOnFailure(obj);
                    char c = 2;
                    com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOptionsResponse depositOptionsResponse4 = depositOptionsResponse3;
                    com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj;
                    depositOptionsResponse2 = depositOptionsResponse4;
                    com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption2 = fundingInstrumentOption;
                    if (fundingInstrumentOption2 != null) {
                        arrayList.add(fundingInstrumentOption2);
                    }
                    if (!it.hasNext()) {
                        java.lang.Object next = it.next();
                        com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOption depositOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOption) next;
                        com.paypal.oslo.feature.balance.domain.model.autoreload.DepositFundingSource depositFundingSource = (com.paypal.oslo.feature.balance.domain.model.autoreload.DepositFundingSource) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) depositOption.getFundingSources());
                        fundingInstrumentOption = null;
                        if (depositFundingSource != null) {
                            com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument instrument = depositFundingSource.getInstrument();
                            if (instrument instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.BankAccount) {
                                com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.BankAccount bankAccount = (com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.BankAccount) depositFundingSource.getInstrument();
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositOptionsResponse2);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable3);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable2);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getInputFormats = arrayList;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputStallDuration = it;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositOption);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.isOutputSupportedForhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositFundingSource);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.Camera2StreamConfigurationMap = i4;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getHighSpeedVideoSizes = i3;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getHighSpeedVideoFpsRanges = 0;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getHighSpeedVideoFpsRangesFor = 0;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputMinFrameDuration = 0;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.toString = 1;
                                java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(depositOption, bankAccount, getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1);
                                if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
                                    c = 2;
                                    depositOptionsResponse4 = depositOptionsResponse2;
                                    obj = highSpeedVideoFpsRangesFor;
                                    com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption3 = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj;
                                    depositOptionsResponse2 = depositOptionsResponse4;
                                }
                                return coroutine_suspended;
                            }
                            if (instrument instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.Card) {
                                com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.Card card = (com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.Card) depositFundingSource.getInstrument();
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositOptionsResponse2);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable3);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable2);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getInputFormats = arrayList;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputStallDuration = it;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositOption);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.isOutputSupportedForhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositFundingSource);
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.Camera2StreamConfigurationMap = i4;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getHighSpeedVideoSizes = i3;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getHighSpeedVideoFpsRanges = 0;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getHighSpeedVideoFpsRangesFor = 0;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.getOutputMinFrameDuration = 0;
                                c = 2;
                                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.toString = 2;
                                java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(depositOption, card, getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1);
                            } else {
                                c = 2;
                                if (!(instrument instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.Unknown)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                depositOptionsResponse4 = depositOptionsResponse2;
                                obj = null;
                            }
                            com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption32 = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption) obj;
                            depositOptionsResponse2 = depositOptionsResponse4;
                            com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption22 = fundingInstrumentOption32;
                            if (fundingInstrumentOption22 != null) {
                            }
                            if (!it.hasNext()) {
                                return (java.util.List) arrayList;
                            }
                        } else {
                            c = 2;
                            com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption222 = fundingInstrumentOption32;
                            if (fundingInstrumentOption222 != null) {
                            }
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1 = new com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1(this, continuation);
        java.lang.Object obj4 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.isOutputSupportedFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapDepositOptions$1.toString;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00e3 -> B:10:0x00e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f0 -> B:11:0x00ed). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccount> list, kotlin.coroutines.Continuation<? super java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption>> continuation) {
        com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1 getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1;
        int i;
        java.lang.Iterable iterable;
        java.lang.Iterable iterable2;
        java.lang.Iterable iterable3;
        java.util.Collection arrayList;
        java.util.Iterator it;
        int i2;
        int i3;
        int i4;
        java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccount> list2;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1) {
            getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1 = (com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1) continuation;
            if ((getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getValidOutputFormatsForInputhNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccount> list3 = list;
                    iterable = list3;
                    iterable2 = iterable;
                    iterable3 = iterable2;
                    arrayList = new java.util.ArrayList();
                    it = list3.iterator();
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    list2 = list;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getHighSpeedVideoFpsRanges;
                    int i6 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getHighResolutionOutputSizeshNQ4ISI;
                    i2 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getHighSpeedVideoSizes;
                    i3 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getHighSpeedVideoFpsRangesFor;
                    i4 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.Camera2StreamConfigurationMap;
                    java.lang.Object obj2 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getOutputStallDuration;
                    java.lang.Object obj3 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getOutputSizes;
                    it = (java.util.Iterator) getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getOutputSizeshNQ4ISI;
                    iterable = (java.lang.Iterable) getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getInputSizeshNQ4ISI;
                    arrayList = (java.util.Collection) getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getInputFormats;
                    iterable2 = (java.lang.Iterable) getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getOutputMinFrameDuration;
                    iterable3 = (java.lang.Iterable) getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getHighSpeedVideoSizesFor;
                    java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccount> list4 = (java.util.List) getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getOutputFormats;
                    kotlin.ResultKt.throwOnFailure(obj);
                    boolean z = true;
                    java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccount> list5 = list4;
                    com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption fundingInstrumentSavingsOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption) obj;
                    list2 = list5;
                    com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption fundingInstrumentSavingsOption2 = fundingInstrumentSavingsOption;
                    if (fundingInstrumentSavingsOption2 != null) {
                        arrayList.add(fundingInstrumentSavingsOption2);
                    }
                    if (!it.hasNext()) {
                        java.lang.Object next = it.next();
                        com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccount savingsAccount = (com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccount) next;
                        fundingInstrumentSavingsOption = null;
                        com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccount savingsAccount2 = savingsAccount.getAccountStatus() == com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus.ACTIVE ? savingsAccount : null;
                        if (savingsAccount2 != null) {
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable3);
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable2);
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getInputFormats = arrayList;
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getOutputSizeshNQ4ISI = it;
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsAccount);
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.Camera2StreamConfigurationMap = i4;
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getHighSpeedVideoFpsRangesFor = i3;
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getHighSpeedVideoSizes = i2;
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getHighSpeedVideoFpsRanges = 0;
                            z = true;
                            getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getOutputStallDurationlomOqCM = 1;
                            java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(savingsAccount2, getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1);
                            if (highSpeedVideoFpsRanges == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            list5 = list2;
                            obj = highSpeedVideoFpsRanges;
                            com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption fundingInstrumentSavingsOption3 = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption) obj;
                            list2 = list5;
                            com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption fundingInstrumentSavingsOption22 = fundingInstrumentSavingsOption3;
                            if (fundingInstrumentSavingsOption22 != null) {
                            }
                            if (!it.hasNext()) {
                                return (java.util.List) arrayList;
                            }
                        } else {
                            z = true;
                            com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption fundingInstrumentSavingsOption222 = fundingInstrumentSavingsOption3;
                            if (fundingInstrumentSavingsOption222 != null) {
                            }
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1 = new com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1(this, continuation);
        java.lang.Object obj4 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getValidOutputFormatsForInputhNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getAutoReloadFundingInstrumentOptionsUseCaseImpl$mapSavingsAccounts$1.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOption depositOption, com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.BankAccount bankAccount, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption> continuation) {
        com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1 getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1;
        int i;
        java.lang.Object obj;
        com.paypal.oslo.feature.balance.domain.model.Money money;
        java.lang.String str;
        java.lang.String id;
        java.lang.String id2;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fundingInstrumentType;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode fromStringOrDefault;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode fundingInstrumentMode;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fundingInstrumentType2;
        java.lang.String str5;
        java.lang.String str6;
        com.paypal.oslo.feature.balance.domain.model.Money money2;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType fundingInstrumentBankType;
        boolean z;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType fundingInstrumentBankType2;
        boolean z2;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1) {
            getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1 = (com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1) continuation;
            if ((getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getOutputStallDuration & Integer.MIN_VALUE) != 0) {
                getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getOutputStallDuration -= 2147483648;
                java.lang.Object obj2 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getValidOutputFormatsForInputhNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getOutputStallDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    java.util.Iterator<T> it = depositOption.getLimits().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.balance.domain.model.autoreload.DepositLimit) obj).getLimitType(), "MAXIMUM_APPROVED")) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.balance.domain.model.autoreload.DepositLimit depositLimit = (com.paypal.oslo.feature.balance.domain.model.autoreload.DepositLimit) obj;
                    if (depositLimit != null) {
                        java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(depositLimit.getValue());
                        if (bigDecimalOrNull == null) {
                            bigDecimalOrNull = java.math.BigDecimal.ZERO;
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull);
                        money = new com.paypal.oslo.feature.balance.domain.model.Money(bigDecimalOrNull, com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(depositLimit.getCurrencyCode()), null);
                    } else {
                        money = null;
                    }
                    java.lang.String nickname = bankAccount.getNickname();
                    if (nickname == null) {
                        nickname = bankAccount.getIssuerName();
                    }
                    str = nickname;
                    id = depositOption.getId();
                    id2 = bankAccount.getId();
                    fundingInstrumentType = com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.BANK;
                    fromStringOrDefault = com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.INSTANCE.fromStringOrDefault(depositOption.getTransferSpeed());
                    java.lang.String lastNChars = bankAccount.getLastNChars();
                    java.lang.String institutionImageUrl = bankAccount.getInstitutionImageUrl();
                    if (institutionImageUrl == null) {
                        institutionImageUrl = "";
                    }
                    com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType fromStringOrDefault2 = com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType.INSTANCE.fromStringOrDefault(bankAccount.getType());
                    boolean contains = depositOption.getTags().contains(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO.MOST_RECENTLY_USED_TAG);
                    if (money == null) {
                        str2 = lastNChars;
                        str3 = institutionImageUrl;
                        str4 = null;
                        fundingInstrumentMode = fromStringOrDefault;
                        fundingInstrumentType2 = fundingInstrumentType;
                        str5 = id2;
                        str6 = str;
                        money2 = money;
                        fundingInstrumentBankType = fromStringOrDefault2;
                        z = contains;
                        str7 = id;
                        return new com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption(str7, str5, str6, str2, fundingInstrumentMode, fundingInstrumentType2, str3, z, money2, str4, fundingInstrumentBankType);
                    }
                    java.lang.String m12029getCurrencyCodehkTgrg = money.m12029getCurrencyCodehkTgrg();
                    java.math.BigDecimal amount = money.getAmount();
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositOption);
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bankAccount);
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getInputFormats = money;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getOutputFormats = str;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getInputSizeshNQ4ISI = id;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getOutputMinFrameDuration = id2;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getHighSpeedVideoSizesFor = fundingInstrumentType;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getOutputMinFrameDurationlomOqCM = fromStringOrDefault;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getOutputSizeshNQ4ISI = lastNChars;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getOutputStallDurationlomOqCM = institutionImageUrl;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getHighSpeedVideoSizes = fromStringOrDefault2;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money);
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getOutputSizes = contains;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getHighSpeedVideoFpsRanges = 0;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getOutputStallDuration = 1;
                    java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(m12029getCurrencyCodehkTgrg, amount, getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1);
                    if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str8 = lastNChars;
                    obj2 = highSpeedVideoFpsRangesFor;
                    str9 = institutionImageUrl;
                    fundingInstrumentBankType2 = fromStringOrDefault2;
                    z2 = contains;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getHighSpeedVideoFpsRanges;
                    z2 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getOutputSizes;
                    fundingInstrumentBankType2 = (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentBankType) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getHighSpeedVideoSizes;
                    str9 = (java.lang.String) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getOutputStallDurationlomOqCM;
                    str8 = (java.lang.String) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getOutputSizeshNQ4ISI;
                    fromStringOrDefault = (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getOutputMinFrameDurationlomOqCM;
                    fundingInstrumentType = (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getHighSpeedVideoSizesFor;
                    id2 = (java.lang.String) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getOutputMinFrameDuration;
                    id = (java.lang.String) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getInputSizeshNQ4ISI;
                    str = (java.lang.String) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getOutputFormats;
                    money = (com.paypal.oslo.feature.balance.domain.model.Money) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getInputFormats;
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                str4 = (java.lang.String) obj2;
                z = z2;
                fundingInstrumentBankType = fundingInstrumentBankType2;
                str3 = str9;
                str2 = str8;
                fundingInstrumentMode = fromStringOrDefault;
                fundingInstrumentType2 = fundingInstrumentType;
                str5 = id2;
                str7 = id;
                str6 = str;
                money2 = money;
                return new com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption(str7, str5, str6, str2, fundingInstrumentMode, fundingInstrumentType2, str3, z, money2, str4, fundingInstrumentBankType);
            }
        }
        getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1 = new com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1(this, continuation);
        java.lang.Object obj22 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getValidOutputFormatsForInputhNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentBank$1.getOutputStallDuration;
        if (i != 0) {
        }
        str4 = (java.lang.String) obj22;
        z = z2;
        fundingInstrumentBankType = fundingInstrumentBankType2;
        str3 = str9;
        str2 = str8;
        fundingInstrumentMode = fromStringOrDefault;
        fundingInstrumentType2 = fundingInstrumentType;
        str5 = id2;
        str7 = id;
        str6 = str;
        money2 = money;
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption(str7, str5, str6, str2, fundingInstrumentMode, fundingInstrumentType2, str3, z, money2, str4, fundingInstrumentBankType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.balance.domain.model.autoreload.DepositOption depositOption, com.paypal.oslo.feature.balance.domain.model.autoreload.DepositInstrument.Card card, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption> continuation) {
        com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1 getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1;
        int i;
        java.lang.Object obj;
        com.paypal.oslo.feature.balance.domain.model.Money money;
        java.lang.String str;
        java.lang.String id;
        java.lang.String id2;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fundingInstrumentType;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode fromStringOrDefault;
        java.lang.String lastNChars;
        java.lang.String str2;
        java.lang.String str3;
        boolean z;
        java.lang.String str4;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode fundingInstrumentMode;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fundingInstrumentType2;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        com.paypal.oslo.feature.balance.domain.model.Money money2;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        boolean z2;
        java.lang.String str11;
        java.lang.String str12;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1) {
            getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1 = (com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1) continuation;
            if ((getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.unwrapAs & Integer.MIN_VALUE) != 0) {
                getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.unwrapAs -= 2147483648;
                java.lang.Object obj2 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.toString;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.unwrapAs;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    java.util.Iterator<T> it = depositOption.getLimits().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.balance.domain.model.autoreload.DepositLimit) obj).getLimitType(), "MAXIMUM_APPROVED")) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.balance.domain.model.autoreload.DepositLimit depositLimit = (com.paypal.oslo.feature.balance.domain.model.autoreload.DepositLimit) obj;
                    if (depositLimit != null) {
                        java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(depositLimit.getValue());
                        if (bigDecimalOrNull == null) {
                            bigDecimalOrNull = java.math.BigDecimal.ZERO;
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull);
                        money = new com.paypal.oslo.feature.balance.domain.model.Money(bigDecimalOrNull, com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(depositLimit.getCurrencyCode()), null);
                    } else {
                        money = null;
                    }
                    java.lang.String nickname = card.getNickname();
                    if (nickname == null && (nickname = card.getIssuerName()) == null) {
                        nickname = com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD;
                    }
                    str = nickname;
                    id = depositOption.getId();
                    id2 = card.getId();
                    fundingInstrumentType = com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.CARD;
                    fromStringOrDefault = com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.INSTANCE.fromStringOrDefault(depositOption.getTransferSpeed());
                    lastNChars = card.getLastNChars();
                    java.lang.String cardArtUrl = card.getCardArtUrl();
                    if (cardArtUrl == null && (cardArtUrl = card.getInstitutionImageUrl()) == null) {
                        cardArtUrl = "";
                    }
                    java.lang.String brand = card.getBrand();
                    java.lang.String productClass = card.getProductClass();
                    boolean contains = depositOption.getTags().contains(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO.MOST_RECENTLY_USED_TAG);
                    if (money == null) {
                        str2 = cardArtUrl;
                        str3 = brand;
                        z = contains;
                        str4 = lastNChars;
                        fundingInstrumentMode = fromStringOrDefault;
                        fundingInstrumentType2 = fundingInstrumentType;
                        str5 = id2;
                        str6 = id;
                        str7 = str;
                        money2 = money;
                        str8 = productClass;
                        str9 = null;
                        return new com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption(str6, str5, str7, str4, fundingInstrumentMode, fundingInstrumentType2, str2, z, money2, str9, str3, str8);
                    }
                    java.lang.String m12029getCurrencyCodehkTgrg = money.m12029getCurrencyCodehkTgrg();
                    java.math.BigDecimal amount = money.getAmount();
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositOption);
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(card);
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getInputSizeshNQ4ISI = money;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getOutputMinFrameDuration = str;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getInputFormats = id;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getHighSpeedVideoSizesFor = id2;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getOutputStallDuration = fundingInstrumentType;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getOutputSizeshNQ4ISI = fromStringOrDefault;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getOutputSizes = lastNChars;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getOutputStallDurationlomOqCM = cardArtUrl;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.Camera2StreamConfigurationMap = brand;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getHighSpeedVideoSizes = productClass;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money);
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getOutputMinFrameDurationlomOqCM = contains;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getHighSpeedVideoFpsRanges = 0;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.unwrapAs = 1;
                    java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(m12029getCurrencyCodehkTgrg, amount, getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1);
                    if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str10 = brand;
                    z2 = contains;
                    str11 = productClass;
                    str12 = cardArtUrl;
                    obj2 = highSpeedVideoFpsRangesFor;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getHighSpeedVideoFpsRanges;
                    z2 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getOutputMinFrameDurationlomOqCM;
                    str11 = (java.lang.String) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getHighSpeedVideoSizes;
                    str10 = (java.lang.String) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.Camera2StreamConfigurationMap;
                    str12 = (java.lang.String) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getOutputStallDurationlomOqCM;
                    lastNChars = (java.lang.String) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getOutputSizes;
                    fromStringOrDefault = (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getOutputSizeshNQ4ISI;
                    fundingInstrumentType = (com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getOutputStallDuration;
                    id2 = (java.lang.String) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getHighSpeedVideoSizesFor;
                    id = (java.lang.String) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getInputFormats;
                    str = (java.lang.String) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getOutputMinFrameDuration;
                    money = (com.paypal.oslo.feature.balance.domain.model.Money) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.getInputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                str9 = (java.lang.String) obj2;
                z = z2;
                str8 = str11;
                str3 = str10;
                str2 = str12;
                str4 = lastNChars;
                fundingInstrumentMode = fromStringOrDefault;
                fundingInstrumentType2 = fundingInstrumentType;
                str5 = id2;
                str6 = id;
                str7 = str;
                money2 = money;
                return new com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption(str6, str5, str7, str4, fundingInstrumentMode, fundingInstrumentType2, str2, z, money2, str9, str3, str8);
            }
        }
        getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1 = new com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1(this, continuation);
        java.lang.Object obj22 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.toString;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentCard$1.unwrapAs;
        if (i != 0) {
        }
        str9 = (java.lang.String) obj22;
        z = z2;
        str8 = str11;
        str3 = str10;
        str2 = str12;
        str4 = lastNChars;
        fundingInstrumentMode = fromStringOrDefault;
        fundingInstrumentType2 = fundingInstrumentType;
        str5 = id2;
        str6 = id;
        str7 = str;
        money2 = money;
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption(str6, str5, str7, str4, fundingInstrumentMode, fundingInstrumentType2, str2, z, money2, str9, str3, str8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccount savingsAccount, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption> continuation) {
        com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1 getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1) {
            getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1 = (com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1) continuation;
            if ((getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.balance.domain.model.Money currentBalance = savingsAccount.getMoneybox().getCurrentBalance();
                    java.lang.String m12029getCurrencyCodehkTgrg = currentBalance.m12029getCurrencyCodehkTgrg();
                    java.math.BigDecimal amount = currentBalance.getAmount();
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1.getHighSpeedVideoFpsRangesFor = savingsAccount;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currentBalance);
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1.getHighSpeedVideoFpsRanges = 1;
                    obj = getHighSpeedVideoFpsRangesFor(m12029getCurrencyCodehkTgrg, amount, getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    savingsAccount = (com.paypal.oslo.feature.balance.domain.model.autoreload.SavingsAccount) getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String moneyboxId = savingsAccount.getMoneyboxId();
                java.lang.String moneyboxId2 = savingsAccount.getMoneyboxId();
                com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fundingInstrumentType = com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.SAVINGS;
                com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode fundingInstrumentMode = com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.INSTANT;
                java.lang.String takeLast = kotlin.text.StringsKt.takeLast(savingsAccount.getId(), 4);
                java.lang.String name2 = savingsAccount.getMoneybox().getName();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(name2);
                sb.append(": ");
                sb.append((java.lang.String) obj);
                return new com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption(moneyboxId, moneyboxId2, com.paypal.oslo.feature.smartroute.ui.mock.PreviewConstants.SAVINGS_ACCOUNT_NAME, takeLast, fundingInstrumentMode, fundingInstrumentType, "", false, sb.toString(), savingsAccount.getAccountStatus(), savingsAccount.getMoneybox().getCurrentBalance(), savingsAccount.getTotalBalance());
            }
        }
        getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1 = new com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1(this, continuation);
        java.lang.Object obj2 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getAutoReloadFundingInstrumentOptionsUseCaseImpl$toFundingInstrumentSavings$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        java.lang.String moneyboxId3 = savingsAccount.getMoneyboxId();
        java.lang.String moneyboxId22 = savingsAccount.getMoneyboxId();
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fundingInstrumentType2 = com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.SAVINGS;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode fundingInstrumentMode2 = com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.INSTANT;
        java.lang.String takeLast2 = kotlin.text.StringsKt.takeLast(savingsAccount.getId(), 4);
        java.lang.String name22 = savingsAccount.getMoneybox().getName();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(name22);
        sb2.append(": ");
        sb2.append((java.lang.String) obj2);
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption(moneyboxId3, moneyboxId22, com.paypal.oslo.feature.smartroute.ui.mock.PreviewConstants.SAVINGS_ACCOUNT_NAME, takeLast2, fundingInstrumentMode2, fundingInstrumentType2, "", false, sb2.toString(), savingsAccount.getAccountStatus(), savingsAccount.getMoneybox().getCurrentBalance(), savingsAccount.getTotalBalance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.String str, java.math.BigDecimal bigDecimal, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1 getAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1;
        int i;
        java.lang.String str2;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1) {
            getAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1 = (com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1) continuation;
            if ((getAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                getAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = getAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(str, com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.SYMBOL, 2, null, null, 24, null);
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1.getHighSpeedVideoFpsRanges = str;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1.getHighSpeedVideoSizes = bigDecimal;
                    getAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1.Camera2StreamConfigurationMap = 1;
                    obj = formatCurrencyUseCase.invoke(bigDecimal, currencyConfiguration, getAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bigDecimal = (java.math.BigDecimal) getAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1.getHighSpeedVideoSizes;
                    str = (java.lang.String) getAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str2 = (java.lang.String) ((arrow.core.Either) obj).getOrNull();
                if (str2 == null) {
                    return str2;
                }
                java.lang.String plainString = bigDecimal.toPlainString();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" ");
                sb.append(plainString);
                return sb.toString();
            }
        }
        getAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1 = new com.paypal.oslo.feature.balance.data.usecase.autoreload.GetAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1(this, continuation);
        java.lang.Object obj2 = getAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getAutoReloadFundingInstrumentOptionsUseCaseImpl$formatCurrency$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        str2 = (java.lang.String) ((arrow.core.Either) obj2).getOrNull();
        if (str2 == null) {
        }
    }
}
