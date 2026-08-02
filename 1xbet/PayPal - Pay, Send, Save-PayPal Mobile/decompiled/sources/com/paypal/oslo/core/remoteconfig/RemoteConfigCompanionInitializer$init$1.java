package com.paypal.oslo.core.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer$init$1", f = "RemoteConfigCompanionInitializer.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, nl = {89}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class RemoteConfigCompanionInitializer$init$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.remoteconfig.StatsigWrapper getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ android.app.Application getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer getInputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputMinFrameDuration = 1;
            if (kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(kotlinx.coroutines.flow.FlowKt.drop(this.getHighSpeedVideoFpsRanges.getEnvironmentFlow(), 1)).collect(new com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer$init$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats), this) == coroutine_suspended) {
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

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer$init$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.remoteconfig.StatsigWrapper getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ android.app.Application getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment remoteConfigEnvironment = (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment) obj;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Received environment change from companion", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("environment", remoteConfigEnvironment.getTier())), null, 4, null);
            if (this.getHighResolutionOutputSizeshNQ4ISI.isInitialized()) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Shutting down existing Statsig instance.", null, null, 6, null);
                this.getHighResolutionOutputSizeshNQ4ISI.shutdown();
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Re-initializing Statsig", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("environment", remoteConfigEnvironment.getTier())), null, 4, null);
            com.paypal.oslo.core.remoteconfig.StatsigWrapper statsigWrapper = this.getHighResolutionOutputSizeshNQ4ISI;
            final android.app.Application application = this.getHighSpeedVideoFpsRanges;
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser remoteConfigUser = this.getHighSpeedVideoSizes;
            final com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer remoteConfigCompanionInitializer = this.Camera2StreamConfigurationMap;
            statsigWrapper.init(application, str, remoteConfigEnvironment, remoteConfigUser, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer$init$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer$init$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer.this, application);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer remoteConfigCompanionInitializer, android.app.Application application) {
            com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer.access$initializeCdnAutoRegistration(remoteConfigCompanionInitializer, application);
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.remoteconfig.StatsigWrapper statsigWrapper, android.app.Application application, java.lang.String str, com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser remoteConfigUser, com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer remoteConfigCompanionInitializer) {
            this.getHighResolutionOutputSizeshNQ4ISI = statsigWrapper;
            this.getHighSpeedVideoFpsRanges = application;
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoSizes = remoteConfigUser;
            this.Camera2StreamConfigurationMap = remoteConfigCompanionInitializer;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer$init$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer$init$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteConfigCompanionInitializer$init$1(com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig, com.paypal.oslo.core.remoteconfig.StatsigWrapper statsigWrapper, android.app.Application application, java.lang.String str, com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser remoteConfigUser, com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer remoteConfigCompanionInitializer, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.remoteconfig.RemoteConfigCompanionInitializer$init$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = remoteConfigConfig;
        this.getHighResolutionOutputSizeshNQ4ISI = statsigWrapper;
        this.getHighSpeedVideoSizes = application;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = remoteConfigUser;
        this.getInputFormats = remoteConfigCompanionInitializer;
    }
}
