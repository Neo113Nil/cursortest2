package com.paypal.oslo.app.profileerror;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "<destruct>", "state", "Lcom/paypal/oslo/core/userstore/model/UserState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.profileerror.ProfileErrorViewModel$shouldShowError$1", f = "ProfileErrorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ProfileErrorViewModel$shouldShowError$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlin.Pair<? extends java.lang.Boolean, ? extends java.lang.Boolean>, com.paypal.oslo.core.userstore.model.UserState, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.lang.Boolean, ? extends java.lang.Boolean>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.Pair pair = (kotlin.Pair) this.getHighSpeedVideoSizes;
        com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        boolean booleanValue = ((java.lang.Boolean) pair.component2()).booleanValue();
        if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.LoggedOut) {
            booleanValue = false;
        } else if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
            booleanValue = true;
        }
        return kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileError), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanValue));
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlin.Pair<? extends java.lang.Boolean, ? extends java.lang.Boolean> pair, com.paypal.oslo.core.userstore.model.UserState userState, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.lang.Boolean, ? extends java.lang.Boolean>> continuation) {
        com.paypal.oslo.app.profileerror.ProfileErrorViewModel$shouldShowError$1 profileErrorViewModel$shouldShowError$1 = new com.paypal.oslo.app.profileerror.ProfileErrorViewModel$shouldShowError$1(continuation);
        profileErrorViewModel$shouldShowError$1.getHighSpeedVideoSizes = pair;
        profileErrorViewModel$shouldShowError$1.getHighSpeedVideoFpsRanges = userState;
        return profileErrorViewModel$shouldShowError$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    ProfileErrorViewModel$shouldShowError$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.app.profileerror.ProfileErrorViewModel$shouldShowError$1> continuation) {
        super(3, continuation);
    }
}
