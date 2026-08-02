package com.paypal.oslo.feature.identity.accountswitch.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/domain/repository/LinkAccountRepository;", "", "Lcom/paypal/oslo/core/userstore/model/ProfileIntent;", "intent", "", "refreshUserStore", "(Lcom/paypal/oslo/core/userstore/model/ProfileIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/core/userstore/model/UserState;", "observeUserState", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface LinkAccountRepository {
    kotlinx.coroutines.flow.Flow<com.paypal.oslo.core.userstore.model.UserState> observeUserState();

    java.lang.Object refreshUserStore(com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
