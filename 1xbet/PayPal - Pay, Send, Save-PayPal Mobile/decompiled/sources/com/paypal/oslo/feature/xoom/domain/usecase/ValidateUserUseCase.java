package com.paypal.oslo.feature.xoom.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/usecase/ValidateUserUseCase;", "", "Lcom/paypal/oslo/feature/xoom/domain/usecase/GetUsersMeUseCase;", "getUsersMeUseCase", "Lcom/paypal/oslo/feature/xoom/domain/usecase/ValidateInactiveUserUseCase;", "validateInactiveUserUseCase", "Lcom/paypal/oslo/feature/xoom/domain/usecase/GetForbiddenErrorPresentationUseCase;", "getForbiddenErrorPresentationUseCase", "<init>", "(Lcom/paypal/oslo/feature/xoom/domain/usecase/GetUsersMeUseCase;Lcom/paypal/oslo/feature/xoom/domain/usecase/ValidateInactiveUserUseCase;Lcom/paypal/oslo/feature/xoom/domain/usecase/GetForbiddenErrorPresentationUseCase;)V", "Lcom/paypal/oslo/feature/xoom/domain/model/UserValidationResult;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/xoom/domain/usecase/GetUsersMeUseCase;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/xoom/domain/usecase/ValidateInactiveUserUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/xoom/domain/usecase/GetForbiddenErrorPresentationUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ValidateUserUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.xoom.domain.usecase.GetUsersMeUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ValidateUserUseCase(com.paypal.oslo.feature.xoom.domain.usecase.GetUsersMeUseCase getUsersMeUseCase, com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase validateInactiveUserUseCase, com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase getForbiddenErrorPresentationUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUsersMeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateInactiveUserUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getForbiddenErrorPresentationUseCase, "");
        this.getHighSpeedVideoFpsRanges = getUsersMeUseCase;
        this.Camera2StreamConfigurationMap = validateInactiveUserUseCase;
        this.getHighSpeedVideoSizes = getForbiddenErrorPresentationUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r6 == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0111, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0050, code lost:
    
        if (r6 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.domain.model.UserValidationResult> continuation) {
        com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase$invoke$1 validateUserUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase$invoke$1) {
            validateUserUseCase$invoke$1 = (com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase$invoke$1) continuation;
            if ((validateUserUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                validateUserUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = validateUserUseCase$invoke$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = validateUserUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.xoom.domain.usecase.GetUsersMeUseCase getUsersMeUseCase = this.getHighSpeedVideoFpsRanges;
                    validateUserUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = getUsersMeUseCase.invoke(validateUserUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = validateUserUseCase$invoke$1.getHighSpeedVideoSizes;
                        int i3 = validateUserUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrow.core.Either either2 = (arrow.core.Either) obj;
                        if (either2 instanceof arrow.core.Either.Right) {
                            com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo failedPaymentInfo = (com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo) ((arrow.core.Either.Right) either2).getValue();
                            if (failedPaymentInfo != null) {
                                return new com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.InactiveUser(failedPaymentInfo);
                            }
                            return com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ActiveUser.INSTANCE;
                        }
                        if (either2 instanceof arrow.core.Either.Left) {
                            return com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.NetworkError.INSTANCE;
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.xoom.domain.model.UserInfo userInfo = (com.paypal.oslo.feature.xoom.domain.model.UserInfo) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase validateInactiveUserUseCase = this.Camera2StreamConfigurationMap;
                    validateUserUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    validateUserUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userInfo);
                    validateUserUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                    validateUserUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                    validateUserUseCase$invoke$1.Camera2StreamConfigurationMap = 2;
                    obj = validateInactiveUserUseCase.invoke(userInfo, validateUserUseCase$invoke$1);
                } else {
                    if (either instanceof arrow.core.Either.Left) {
                        com.paypal.oslo.feature.xoom.domain.model.UserError userError = (com.paypal.oslo.feature.xoom.domain.model.UserError) ((arrow.core.Either.Left) either).getValue();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(userError, com.paypal.oslo.feature.xoom.domain.model.UserError.ConflictError.INSTANCE)) {
                            return com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.UnlinkedUser.INSTANCE;
                        }
                        if (userError instanceof com.paypal.oslo.feature.xoom.domain.model.UserError.ForbiddenError) {
                            com.paypal.oslo.feature.xoom.domain.usecase.GetForbiddenErrorPresentationUseCase.ErrorPresentationResources invoke = this.getHighSpeedVideoSizes.invoke((com.paypal.oslo.feature.xoom.domain.model.UserError.ForbiddenError) userError);
                            return new com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ForbiddenUser(invoke.getTitleRes(), invoke.getDescriptionRes(), invoke.getPrimaryButtonTextRes());
                        }
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(userError, com.paypal.oslo.feature.xoom.domain.model.UserError.NetworkError.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(userError, com.paypal.oslo.feature.xoom.domain.model.UserError.UnauthorizedError.INSTANCE)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        return com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.NetworkError.INSTANCE;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        validateUserUseCase$invoke$1 = new com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = validateUserUseCase$invoke$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = validateUserUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
