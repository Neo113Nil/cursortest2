package com.paypal.oslo.core.telemetry.analytics.context.global;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider$observeUserState$1", f = "UserContextProvider.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class UserContextProvider$observeUserState$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.userstore.UserStore userStore;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            userStore = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState = userStore.getUserState();
            final com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider userContextProvider = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (userState.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider$observeUserState$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.userstore.model.UserState userState2 = (com.paypal.oslo.core.userstore.model.UserState) obj2;
                    if (userState2 instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                        com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider.access$handleProfileLoaded(com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider.this, ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState2).getUser());
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(userState2, com.paypal.oslo.core.userstore.model.UserState.LoggedOut.INSTANCE)) {
                        com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider.access$handleLoggedOut(com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider.this);
                    } else if (!kotlin.jvm.internal.Intrinsics.areEqual(userState2, com.paypal.oslo.core.userstore.model.UserState.LoggedIn.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(userState2, com.paypal.oslo.core.userstore.model.UserState.LoggingIn.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(userState2, com.paypal.oslo.core.userstore.model.UserState.ProfileLoading.INSTANCE)) {
                        if (!(userState2 instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileError)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider.this.getHighSpeedVideoFpsRangesFor.setValue(null);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider$observeUserState$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider$observeUserState$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserContextProvider$observeUserState$1(com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider userContextProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider$observeUserState$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = userContextProvider;
    }
}
