package com.unity3d.ads.core.domain;

/* compiled from: LegacyShowUseCase.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "close", "Lkotlin/Function0;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2", f = "LegacyShowUseCase.kt", i = {0, 1, 2}, l = {177, 183, 184}, m = "invokeSuspend", n = {"close", "close", "close"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class LegacyShowUseCase$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function0<? extends kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
    final /* synthetic */ boolean $isBanner;
    final /* synthetic */ java.lang.String $placement;
    final /* synthetic */ kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $reportShowError;
    final /* synthetic */ boolean $useTimeout;
    /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.LegacyShowUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LegacyShowUseCase$invoke$2(com.unity3d.ads.core.domain.LegacyShowUseCase legacyShowUseCase, boolean z, com.unity3d.ads.core.data.model.AdObject adObject, boolean z2, kotlin.jvm.functions.Function6<? super java.lang.String, ? super com.unity3d.ads.UnityAds.UnityAdsShowError, ? super java.lang.String, ? super java.lang.Integer, ? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function6, java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = legacyShowUseCase;
        this.$isBanner = z;
        this.$adObject = adObject;
        this.$useTimeout = z2;
        this.$reportShowError = function6;
        this.$placement = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2 legacyShowUseCase$invoke$2 = new com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2(this.this$0, this.$isBanner, this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, continuation);
        legacyShowUseCase$invoke$2.L$0 = obj;
        return legacyShowUseCase$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return invoke2((kotlin.jvm.functions.Function0<kotlin.Unit>) function0, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2) create(function0, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.functions.Function0 function0;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object sendOperativeError;
        com.unity3d.ads.core.domain.Show show;
        kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function6;
        com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError;
        java.lang.String str;
        kotlin.jvm.functions.Function0 function02;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            function0 = (kotlin.jvm.functions.Function0) this.L$0;
            mutableStateFlow = this.this$0.hasStarted;
            if (!((java.lang.Boolean) mutableStateFlow.getValue()).booleanValue()) {
                mutableStateFlow2 = this.this$0.timeoutCancellationRequested;
                if (!((java.lang.Boolean) mutableStateFlow2.getValue()).booleanValue() && !this.$isBanner) {
                    this.L$0 = function0;
                    this.label = 1;
                    sendOperativeError = this.this$0.sendOperativeError(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT, "timeout", this.$adObject, this);
                    if (sendOperativeError == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function02 = (kotlin.jvm.functions.Function0) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                function02.invoke();
                return kotlin.Unit.INSTANCE;
            }
            function0 = (kotlin.jvm.functions.Function0) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            function6 = this.$reportShowError;
            unityAdsShowError = com.unity3d.ads.UnityAds.UnityAdsShowError.TIMEOUT;
            str = com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_TIMEOUT + this.$placement;
            this.L$0 = function0;
            this.label = 3;
            if (function6.invoke("timeout", unityAdsShowError, str, null, null, this) != coroutine_suspended) {
                return coroutine_suspended;
            }
            function02 = function0;
            function02.invoke();
            return kotlin.Unit.INSTANCE;
        }
        function0 = (kotlin.jvm.functions.Function0) this.L$0;
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.$useTimeout) {
            show = this.this$0.show;
            this.L$0 = function0;
            this.label = 2;
            if (show.terminate(this.$adObject, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            function6 = this.$reportShowError;
            unityAdsShowError = com.unity3d.ads.UnityAds.UnityAdsShowError.TIMEOUT;
            str = com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_TIMEOUT + this.$placement;
            this.L$0 = function0;
            this.label = 3;
            if (function6.invoke("timeout", unityAdsShowError, str, null, null, this) != coroutine_suspended) {
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
