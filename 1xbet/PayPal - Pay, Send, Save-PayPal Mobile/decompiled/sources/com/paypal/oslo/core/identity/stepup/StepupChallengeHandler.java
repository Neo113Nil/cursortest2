package com.paypal.oslo.core.identity.stepup;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/identity/stepup/StepupChallengeHandler;", "", "Lcom/paypal/oslo/core/identity/stepup/StepupChallengeInput;", "input", "Larrow/core/Either;", "Lcom/paypal/oslo/core/identity/stepup/StepupError;", "Lcom/paypal/oslo/core/identity/stepup/StepupSuccess;", "handleStepup", "(Lcom/paypal/oslo/core/identity/stepup/StepupChallengeInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StepupChallengeHandler {
    java.lang.Object handleStepup(com.paypal.oslo.core.identity.stepup.StepupChallengeInput stepupChallengeInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.stepup.StepupError, com.paypal.oslo.core.identity.stepup.StepupSuccess>> continuation);
}
