package com.unity3d.services;

/* compiled from: UnityAdsSDK.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.UnityAdsSDK$initialize$1$newInitializationJob$1", f = "UnityAdsSDK.kt", i = {}, l = {101, 107}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class UnityAdsSDK$initialize$1$newInitializationJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.Lazy<com.unity3d.ads.core.configuration.AlternativeFlowReader> $alternativeFlowReader$delegate;
    final /* synthetic */ java.lang.String $gameId;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope $initScope;
    final /* synthetic */ kotlin.Lazy<com.unity3d.ads.core.domain.InitializeBoldSDK> $initializeBoldSDK$delegate;
    final /* synthetic */ kotlin.Lazy<com.unity3d.services.core.domain.task.InitializeSDK> $initializeSDK$delegate;
    final /* synthetic */ java.lang.String $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UnityAdsSDK$initialize$1$newInitializationJob$1(java.lang.String str, java.lang.String str2, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.Lazy<? extends com.unity3d.ads.core.configuration.AlternativeFlowReader> lazy, kotlin.Lazy<? extends com.unity3d.ads.core.domain.InitializeBoldSDK> lazy2, kotlin.Lazy<com.unity3d.services.core.domain.task.InitializeSDK> lazy3, kotlin.coroutines.Continuation<? super com.unity3d.services.UnityAdsSDK$initialize$1$newInitializationJob$1> continuation) {
        super(2, continuation);
        this.$source = str;
        this.$gameId = str2;
        this.$initScope = coroutineScope;
        this.$alternativeFlowReader$delegate = lazy;
        this.$initializeBoldSDK$delegate = lazy2;
        this.$initializeSDK$delegate = lazy3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.UnityAdsSDK$initialize$1$newInitializationJob$1(this.$source, this.$gameId, this.$initScope, this.$alternativeFlowReader$delegate, this.$initializeBoldSDK$delegate, this.$initializeSDK$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.services.UnityAdsSDK$initialize$1$newInitializationJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.core.configuration.AlternativeFlowReader initialize$lambda$4$lambda$1;
        com.unity3d.services.core.domain.task.InitializeSDK initialize$lambda$4$lambda$2;
        com.unity3d.ads.core.domain.InitializeBoldSDK initialize$lambda$4$lambda$3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            initialize$lambda$4$lambda$1 = com.unity3d.services.UnityAdsSDK.initialize$lambda$4$lambda$1(this.$alternativeFlowReader$delegate);
            if (initialize$lambda$4$lambda$1.invoke()) {
                initialize$lambda$4$lambda$3 = com.unity3d.services.UnityAdsSDK.initialize$lambda$4$lambda$3(this.$initializeBoldSDK$delegate);
                this.label = 1;
                if (initialize$lambda$4$lambda$3.invoke(this.$source, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                com.unity3d.services.core.log.DeviceLog.info("Initializing Unity Services " + com.unity3d.services.core.properties.SdkProperties.getVersionName() + " (" + com.unity3d.services.core.properties.SdkProperties.getVersionCode() + ") with game id " + this.$gameId + " in " + (com.unity3d.services.core.properties.SdkProperties.isTestMode() ? "test mode" : "production mode") + ", session " + com.unity3d.services.core.properties.Session.INSTANCE.getId());
                initialize$lambda$4$lambda$2 = com.unity3d.services.UnityAdsSDK.initialize$lambda$4$lambda$2(this.$initializeSDK$delegate);
                this.label = 2;
                if (initialize$lambda$4$lambda$2.mo10359invokegIAlus(com.unity3d.services.core.domain.task.EmptyParams.INSTANCE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            ((kotlin.Result) obj).getValue();
        }
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.$initScope, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }
}
