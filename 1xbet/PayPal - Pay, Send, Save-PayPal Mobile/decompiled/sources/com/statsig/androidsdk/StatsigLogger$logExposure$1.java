package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigLogger$logExposure$1", f = "StatsigLogger.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class StatsigLogger$logExposure$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.statsig.androidsdk.FeatureGate $gate;
    final /* synthetic */ boolean $isManual;
    final /* synthetic */ java.lang.String $name;
    final /* synthetic */ com.statsig.androidsdk.StatsigUser $user;
    int label;
    final /* synthetic */ com.statsig.androidsdk.StatsigLogger this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.statsig.androidsdk.LogEvent logEvent = new com.statsig.androidsdk.LogEvent(com.statsig.androidsdk.StatsigLoggerKt.GATE_EXPOSURE);
            logEvent.setUser(this.$user);
            java.util.Map<java.lang.String, ? extends java.lang.Object> mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("gate", this.$name), kotlin.TuplesKt.to("gateValue", java.lang.String.valueOf(this.$gate.getValue())), kotlin.TuplesKt.to("ruleID", this.$gate.getRule()), kotlin.TuplesKt.to("reason", this.$gate.getDetails().getReason().toString()), kotlin.TuplesKt.to("time", java.lang.String.valueOf(this.$gate.getDetails().getTime())));
            this.this$0.addManualFlag(mutableMapOf, this.$isManual);
            logEvent.setMetadata(mutableMapOf);
            logEvent.setSecondaryExposures(this.$gate.getSecondaryExposures());
            this.label = 1;
            if (this.this$0.log(logEvent, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.statsig.androidsdk.StatsigLogger$logExposure$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.StatsigLogger$logExposure$1(this.$user, this.$name, this.$gate, this.this$0, this.$isManual, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigLogger$logExposure$1(com.statsig.androidsdk.StatsigUser statsigUser, java.lang.String str, com.statsig.androidsdk.FeatureGate featureGate, com.statsig.androidsdk.StatsigLogger statsigLogger, boolean z, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigLogger$logExposure$1> continuation) {
        super(2, continuation);
        this.$user = statsigUser;
        this.$name = str;
        this.$gate = featureGate;
        this.this$0 = statsigLogger;
        this.$isManual = z;
    }
}
