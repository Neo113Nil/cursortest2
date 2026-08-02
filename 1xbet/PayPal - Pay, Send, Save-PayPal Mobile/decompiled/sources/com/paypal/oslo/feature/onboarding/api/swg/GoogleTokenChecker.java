package com.paypal.oslo.feature.onboarding.api.swg;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/swg/GoogleTokenChecker;", "", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleToken;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckError;", "Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckSuccess;", "checkToken-_dMVy3A", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface GoogleTokenChecker {
    /* renamed from: checkToken-_dMVy3A, reason: not valid java name */
    java.lang.Object mo16038checkToken_dMVy3A(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckError, ? extends com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess>> continuation);
}
