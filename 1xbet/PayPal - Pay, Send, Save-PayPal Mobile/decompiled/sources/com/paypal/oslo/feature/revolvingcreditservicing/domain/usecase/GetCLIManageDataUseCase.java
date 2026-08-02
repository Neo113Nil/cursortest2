package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetCLIManageDataUseCase;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/CLIRepository;", "cliRepository", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/CLIRepository;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "creditAccountId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIManageError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIManageData;", "invoke", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/CLIRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetCLIManageDataUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetCLIManageDataUseCase(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIRepository cLIRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIRepository, "");
        this.getHighSpeedVideoSizes = cLIRepository;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase getCLIManageDataUseCase, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return getCLIManageDataUseCase.invoke(creditProductIdentifier, str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageData>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase$invoke$1 getCLIManageDataUseCase$invoke$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase$invoke$1) {
            getCLIManageDataUseCase$invoke$1 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase$invoke$1) continuation;
            if ((getCLIManageDataUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                getCLIManageDataUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = getCLIManageDataUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getCLIManageDataUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIRepository cLIRepository = this.getHighSpeedVideoSizes;
                    getCLIManageDataUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    getCLIManageDataUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    getCLIManageDataUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = cLIRepository.fetchCreditLineIncreaseOffer(creditProductIdentifier, str, getCLIManageDataUseCase$invoke$1);
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
                    return arrow.core.EitherKt.left((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return arrow.core.EitherKt.right((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageData) ((arrow.core.Ior.Right) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return arrow.core.EitherKt.right((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageData) both.getRightValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getCLIManageDataUseCase$invoke$1 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getCLIManageDataUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCLIManageDataUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
