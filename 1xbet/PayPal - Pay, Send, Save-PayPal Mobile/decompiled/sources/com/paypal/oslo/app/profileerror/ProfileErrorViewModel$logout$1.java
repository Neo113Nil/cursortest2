package com.paypal.oslo.app.profileerror;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.profileerror.ProfileErrorViewModel$logout$1", f = "ProfileErrorViewModel.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, nl = {90}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ProfileErrorViewModel$logout$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.app.profileerror.ProfileErrorViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        com.paypal.oslo.feature.identity.api.IdentitySession identitySession;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                identitySession = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (com.paypal.oslo.feature.identity.api.IdentitySession.logout$default(identitySession, false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.oslo.app.LoggerKt.log.e("Logout failed during profile error recovery; proceeding to login", e2);
        }
        appNavigator = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.profileerror.ProfileErrorViewModel$logout$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.app.profileerror.ProfileErrorViewModel$logout$1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.replaceStack(new com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination(com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU(), new com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation(com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE, (androidx.navigation3.runtime.NavKey) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("profile_error", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), (com.paypal.oslo.feature.identity.api.Intent) null, (com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType) null, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.app.profileerror.ProfileErrorViewModel$logout$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.app.profileerror.ProfileErrorViewModel$logout$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileErrorViewModel$logout$1(com.paypal.oslo.app.profileerror.ProfileErrorViewModel profileErrorViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.profileerror.ProfileErrorViewModel$logout$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = profileErrorViewModel;
    }
}
