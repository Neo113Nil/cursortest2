package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0016\u001a\u00020\u00158\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockCLIApplicationRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/CLIApplicationRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult;", "requestCreditLineIncrease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "shouldReturnError", "Z", "getShouldReturnError", "()Z", "setShouldReturnError", "(Z)V", "shouldReturnDeclined", "getShouldReturnDeclined", "setShouldReturnDeclined", "", "networkDelay", "J", "getNetworkDelay", "()J", "setNetworkDelay", "(J)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MockCLIApplicationRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIApplicationRepository {
    public static final int $stable = 8;
    private long networkDelay = 1000;
    private boolean shouldReturnDeclined;
    private boolean shouldReturnError;

    @javax.inject.Inject
    public MockCLIApplicationRepository() {
    }

    public final boolean getShouldReturnError() {
        return this.shouldReturnError;
    }

    public final void setShouldReturnError(boolean z) {
        this.shouldReturnError = z;
    }

    public final boolean getShouldReturnDeclined() {
        return this.shouldReturnDeclined;
    }

    public final void setShouldReturnDeclined(boolean z) {
        this.shouldReturnDeclined = z;
    }

    public final long getNetworkDelay() {
        return this.networkDelay;
    }

    public final void setNetworkDelay(long j) {
        this.networkDelay = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIApplicationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object requestCreditLineIncrease(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest requestCreditLineIncreaseRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseError, ? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIApplicationRepository$requestCreditLineIncrease$1 mockCLIApplicationRepository$requestCreditLineIncrease$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIApplicationRepository$requestCreditLineIncrease$1) {
            mockCLIApplicationRepository$requestCreditLineIncrease$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIApplicationRepository$requestCreditLineIncrease$1) continuation;
            if ((mockCLIApplicationRepository$requestCreditLineIncrease$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                mockCLIApplicationRepository$requestCreditLineIncrease$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = mockCLIApplicationRepository$requestCreditLineIncrease$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockCLIApplicationRepository$requestCreditLineIncrease$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long j = this.networkDelay;
                    mockCLIApplicationRepository$requestCreditLineIncrease$1.Camera2StreamConfigurationMap = requestCreditLineIncreaseRequest;
                    mockCLIApplicationRepository$requestCreditLineIncrease$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.DelayKt.delay(j, mockCLIApplicationRepository$requestCreditLineIncrease$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    requestCreditLineIncreaseRequest = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest) mockCLIApplicationRepository$requestCreditLineIncrease$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!this.shouldReturnError) {
                    return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseError.Default.INSTANCE);
                }
                if (this.shouldReturnDeclined) {
                    return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult.Declined(requestCreditLineIncreaseRequest.getCreditAccountId()));
                }
                return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult.Approved(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(requestCreditLineIncreaseRequest.getCurrencyCode(), "5000.00"), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseStatus.FULL_APPROVAL));
            }
        }
        mockCLIApplicationRepository$requestCreditLineIncrease$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIApplicationRepository$requestCreditLineIncrease$1(this, continuation);
        java.lang.Object obj2 = mockCLIApplicationRepository$requestCreditLineIncrease$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockCLIApplicationRepository$requestCreditLineIncrease$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        if (!this.shouldReturnError) {
        }
    }
}
