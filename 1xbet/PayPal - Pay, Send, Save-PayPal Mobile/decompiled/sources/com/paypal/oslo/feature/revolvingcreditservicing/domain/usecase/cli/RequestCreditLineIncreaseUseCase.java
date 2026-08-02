package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cli;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/cli/RequestCreditLineIncreaseUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/BaseUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/CLIApplicationRepository;", "cliApplicationRepository", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/CLIApplicationRepository;)V", "input", "Larrow/core/Ior;", "invoke", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/CLIApplicationRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RequestCreditLineIncreaseUseCase implements com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.BaseUseCase<com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIApplicationRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public RequestCreditLineIncreaseUseCase(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIApplicationRepository cLIApplicationRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIApplicationRepository, "");
        this.getHighSpeedVideoFpsRangesFor = cLIApplicationRepository;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.BaseUseCase
    public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest requestCreditLineIncreaseRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseError, ? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.requestCreditLineIncrease(requestCreditLineIncreaseRequest, continuation);
    }
}
