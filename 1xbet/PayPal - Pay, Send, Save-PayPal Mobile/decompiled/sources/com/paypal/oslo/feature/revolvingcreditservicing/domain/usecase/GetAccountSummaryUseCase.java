package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetAccountSummaryUseCase;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/AccountSummaryRepository;", "accountSummaryRepository", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/AccountSummaryRepository;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/ServicingOverviewRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "invoke", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/ServicingOverviewRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryError;)Larrow/core/Ior;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/AccountSummaryRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetAccountSummaryUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AccountSummaryRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetAccountSummaryUseCase(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AccountSummaryRepository accountSummaryRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = accountSummaryRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.ServicingOverviewRequest servicingOverviewRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase$invoke$1 getAccountSummaryUseCase$invoke$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase$invoke$1) {
            getAccountSummaryUseCase$invoke$1 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase$invoke$1) continuation;
            if ((getAccountSummaryUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                getAccountSummaryUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = getAccountSummaryUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getAccountSummaryUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AccountSummaryRepository accountSummaryRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    getAccountSummaryUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(servicingOverviewRequest);
                    getAccountSummaryUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = accountSummaryRepository.fetchAccountSummary(servicingOverviewRequest, getAccountSummaryUseCase$invoke$1);
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
                    return arrow.core.IorKt.leftIor((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) ((arrow.core.Ior.Right) ior).getValue(), null);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) both.getRightValue(), (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError) both.getLeftValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getAccountSummaryUseCase$invoke$1 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getAccountSummaryUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getAccountSummaryUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static arrow.core.Ior<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView p0, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError p1) {
        if (p0.getContainsAllRequiredFields() && p1 != null) {
            return new arrow.core.Ior.Both(p1, p0);
        }
        if (p0.getContainsAllRequiredFields()) {
            return arrow.core.IorKt.rightIor(p0);
        }
        if (p1 == null) {
            p1 = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError.Default.INSTANCE;
        }
        return arrow.core.IorKt.leftIor(p1);
    }
}
