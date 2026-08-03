package com.moloco.sdk.publisher;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.publisher.Moloco$createRewardedInterstitial$1", f = "Moloco.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class Moloco$createRewardedInterstitial$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $adUnitId;
    final /* synthetic */ kotlin.jvm.functions.Function2<com.moloco.sdk.publisher.RewardedInterstitialAd, com.moloco.sdk.publisher.MolocoAdError.AdCreateError, kotlin.Unit> $callback;
    final /* synthetic */ com.moloco.sdk.publisher.MediationInfo $mediationInfo;
    final /* synthetic */ java.lang.String $watermarkString;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Moloco$createRewardedInterstitial$1(com.moloco.sdk.publisher.MediationInfo mediationInfo, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function2<? super com.moloco.sdk.publisher.RewardedInterstitialAd, ? super com.moloco.sdk.publisher.MolocoAdError.AdCreateError, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super com.moloco.sdk.publisher.Moloco$createRewardedInterstitial$1> continuation) {
        super(2, continuation);
        this.$mediationInfo = mediationInfo;
        this.$adUnitId = str;
        this.$watermarkString = str2;
        this.$callback = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.moloco.sdk.publisher.Moloco$createRewardedInterstitial$1(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.moloco.sdk.internal.publisher.C3418b adCreator;
        kotlin.Pair pair;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.acm.recorder.MetricsRecorder create = com.moloco.sdk.acm.recorder.MetricsRecorder.INSTANCE.create(this.$mediationInfo.getName());
            adCreator = com.moloco.sdk.publisher.Moloco.INSTANCE.getAdCreator();
            java.lang.String name = this.$mediationInfo.getName();
            java.lang.String str = this.$adUnitId;
            java.lang.String str2 = this.$watermarkString;
            this.label = 1;
            obj = adCreator.f(name, str, create, str2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.moloco.sdk.internal.v vVar = (com.moloco.sdk.internal.v) obj;
        if (vVar instanceof com.moloco.sdk.internal.v.b) {
            pair = kotlin.TuplesKt.to(((com.moloco.sdk.internal.v.b) vVar).a(), null);
        } else {
            if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            pair = kotlin.TuplesKt.to(null, ((com.moloco.sdk.internal.v.a) vVar).a());
        }
        com.moloco.sdk.publisher.RewardedInterstitialAd rewardedInterstitialAd = (com.moloco.sdk.publisher.RewardedInterstitialAd) pair.component1();
        com.moloco.sdk.publisher.MolocoAdError.AdCreateError adCreateError = (com.moloco.sdk.publisher.MolocoAdError.AdCreateError) pair.component2();
        com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Rewarded for adUnitId: ");
        sb.append(this.$adUnitId);
        sb.append(" has error: ");
        sb.append(rewardedInterstitialAd == null);
        com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, "Moloco", sb.toString(), null, false, 12, null);
        this.$callback.invoke(rewardedInterstitialAd, adCreateError);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.moloco.sdk.publisher.Moloco$createRewardedInterstitial$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }
}
