package com.paypal.oslo.feature.controlcenter.domain.repository;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/domain/repository/IUserProfileRepository;", "", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfileError;", "Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;", "observeUserProfile", "()Lkotlinx/coroutines/flow/Flow;", "", "refreshUserProfile", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface IUserProfileRepository {
    kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.controlcenter.domain.model.UserProfileError, com.paypal.oslo.feature.controlcenter.domain.model.UserProfile>> observeUserProfile();

    java.lang.Object refreshUserProfile(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
