package com.paypal.oslo.core.userstore;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/core/userstore/UserStore;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/userstore/UserStoreError;", "Lcom/paypal/oslo/core/userstore/model/User;", "awaitUser", "(Lcom/paypal/oslo/core/userstore/UserStore;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UserStoreExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitUser(com.paypal.oslo.core.userstore.UserStore userStore, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.userstore.UserStoreError, com.paypal.oslo.core.userstore.model.User>> continuation) {
        com.paypal.oslo.core.userstore.UserStoreExtensionsKt$awaitUser$1 userStoreExtensionsKt$awaitUser$1;
        int i;
        com.paypal.oslo.core.userstore.model.UserState userState;
        if (continuation instanceof com.paypal.oslo.core.userstore.UserStoreExtensionsKt$awaitUser$1) {
            userStoreExtensionsKt$awaitUser$1 = (com.paypal.oslo.core.userstore.UserStoreExtensionsKt$awaitUser$1) continuation;
            if ((userStoreExtensionsKt$awaitUser$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                userStoreExtensionsKt$awaitUser$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = userStoreExtensionsKt$awaitUser$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = userStoreExtensionsKt$awaitUser$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState2 = userStore.getUserState();
                    com.paypal.oslo.core.userstore.UserStoreExtensionsKt$awaitUser$state$1 userStoreExtensionsKt$awaitUser$state$1 = new com.paypal.oslo.core.userstore.UserStoreExtensionsKt$awaitUser$state$1(null);
                    userStoreExtensionsKt$awaitUser$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userStore);
                    userStoreExtensionsKt$awaitUser$1.getHighSpeedVideoFpsRanges = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.first(userState2, userStoreExtensionsKt$awaitUser$state$1, userStoreExtensionsKt$awaitUser$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                userState = (com.paypal.oslo.core.userstore.model.UserState) obj;
                if (!(userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded)) {
                    return arrow.core.EitherKt.right(((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getUser());
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(userState, "");
                return arrow.core.EitherKt.left(new com.paypal.oslo.core.userstore.UserStoreError.ProfileLoadFailed(((com.paypal.oslo.core.userstore.model.UserState.ProfileError) userState).getCause()));
            }
        }
        userStoreExtensionsKt$awaitUser$1 = new com.paypal.oslo.core.userstore.UserStoreExtensionsKt$awaitUser$1(continuation);
        java.lang.Object obj2 = userStoreExtensionsKt$awaitUser$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userStoreExtensionsKt$awaitUser$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        userState = (com.paypal.oslo.core.userstore.model.UserState) obj2;
        if (!(userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded)) {
        }
    }
}
