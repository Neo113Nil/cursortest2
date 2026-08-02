package com.paypal.oslo.core.userstore;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/userstore/UserStore;", "", "Lcom/paypal/oslo/core/userstore/model/ProfileIntent;", "intent", "Lcom/paypal/oslo/core/userstore/model/User;", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "(Lcom/paypal/oslo/core/userstore/model/ProfileIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/core/userstore/model/UserState;", "getUserState", "()Lkotlinx/coroutines/flow/StateFlow;", "userState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface UserStore {
    kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> getUserState();

    java.lang.Object refresh(com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.userstore.model.User> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object refresh$default(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refresh");
        }
        if ((i & 1) != 0) {
            profileIntent = null;
        }
        return userStore.refresh(profileIntent, continuation);
    }
}
