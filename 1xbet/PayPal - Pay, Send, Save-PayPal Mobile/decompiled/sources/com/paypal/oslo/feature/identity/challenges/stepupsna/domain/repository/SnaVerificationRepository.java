package com.paypal.oslo.feature.identity.challenges.stepupsna.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/repository/SnaVerificationRepository;", "", "", "evUrl", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/challenges/stepupsna/domain/model/SnaError;", "callEvUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface SnaVerificationRepository {
    java.lang.Object callEvUrl(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.challenges.stepupsna.domain.model.SnaError, java.lang.String>> continuation);
}
