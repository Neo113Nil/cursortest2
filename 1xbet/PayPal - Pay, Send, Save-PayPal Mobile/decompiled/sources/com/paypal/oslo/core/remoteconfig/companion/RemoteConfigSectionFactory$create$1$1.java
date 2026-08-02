package com.paypal.oslo.core.remoteconfig.companion;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory$create$1$1", f = "RemoteConfigSectionFactory.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, nl = {82}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class RemoteConfigSectionFactory$create$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.remoteconfig.di.RemoteConfigInitializerEntryPoint Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.companion.domain.ConfigSectionBuilder getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry featureGateRegistry;
        com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry featureGateRegistry2;
        com.paypal.oslo.core.remoteconfig.registry.FeatureGateRegistry featureGateRegistry3;
        com.paypal.oslo.core.remoteconfig.registry.DynamicConfigRegistry dynamicConfigRegistry;
        com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry experimentRegistry;
        com.paypal.oslo.core.remoteconfig.registry.ExperimentRegistry experimentRegistry2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap.overrideManager().clearAllOverrides();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Cleared companion app overrides from previous session", null, null, 6, null);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Starting CDN auto-registration", null, null, 6, null);
            this.getHighSpeedVideoFpsRanges = 1;
            if (this.Camera2StreamConfigurationMap.autoRegistrar().autoRegisterFromCdn(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.remoteconfig.LoggerKt.log;
        featureGateRegistry = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
        com.paypal.android.logger.Logger.d$default(logger, "Adding feature gates to companion app: ".concat(java.lang.String.valueOf(featureGateRegistry.getAll().size())), null, null, 6, null);
        featureGateRegistry2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
        java.util.List<com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry> all = featureGateRegistry2.getAll();
        com.paypal.oslo.core.companion.domain.ConfigSectionBuilder configSectionBuilder = this.getHighSpeedVideoFpsRangesFor;
        for (final com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry remoteConfigEntry : all) {
            java.lang.String fullKey = remoteConfigEntry.getFullKey();
            java.lang.Object defaultValue = remoteConfigEntry.getDefaultValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(defaultValue, "");
            configSectionBuilder.booleanField(fullKey, ((java.lang.Boolean) defaultValue).booleanValue(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory$create$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory$create$1$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry.this, (com.paypal.oslo.core.companion.domain.ConfigFieldBuilder) obj2);
                }
            });
        }
        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.core.remoteconfig.LoggerKt.log;
        featureGateRegistry3 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
        com.paypal.android.logger.Logger.d$default(logger2, "Adding dynamic configs to companion app: ".concat(java.lang.String.valueOf(featureGateRegistry3.getAll().size())), null, null, 6, null);
        dynamicConfigRegistry = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
        java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(dynamicConfigRegistry.getAll(), new java.util.Comparator() { // from class: com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory$create$1$1$invokeSuspend$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(((com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry) t).getGroupName(), ((com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry) t2).getGroupName());
            }
        });
        com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory remoteConfigSectionFactory = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.core.companion.domain.ConfigSectionBuilder configSectionBuilder2 = this.getHighSpeedVideoFpsRangesFor;
        java.util.Iterator it = sortedWith.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory.access$addFieldForEntry(remoteConfigSectionFactory, configSectionBuilder2, (com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry) it.next());
        }
        com.paypal.android.logger.Logger logger3 = com.paypal.oslo.core.remoteconfig.LoggerKt.log;
        experimentRegistry = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.android.logger.Logger.d$default(logger3, "Adding experiments to companion app: ".concat(java.lang.String.valueOf(experimentRegistry.getAll().size())), null, null, 6, null);
        experimentRegistry2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
        java.util.List sortedWith2 = kotlin.collections.CollectionsKt.sortedWith(experimentRegistry2.getAll(), new java.util.Comparator() { // from class: com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory$create$1$1$invokeSuspend$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(((com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry) t).getGroupName(), ((com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry) t2).getGroupName());
            }
        });
        com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory remoteConfigSectionFactory2 = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.core.companion.domain.ConfigSectionBuilder configSectionBuilder3 = this.getHighSpeedVideoFpsRangesFor;
        java.util.Iterator it2 = sortedWith2.iterator();
        while (it2.hasNext()) {
            com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory.access$addFieldForEntry(remoteConfigSectionFactory2, configSectionBuilder3, (com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry) it2.next());
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.remoteconfig.registry.RemoteConfigEntry remoteConfigEntry, com.paypal.oslo.core.companion.domain.ConfigFieldBuilder configFieldBuilder) {
        configFieldBuilder.name(remoteConfigEntry.getDisplayName());
        configFieldBuilder.description("Feature Gate");
        com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver resolver = configFieldBuilder.getResolver();
        java.lang.Boolean bool = (java.lang.Boolean) (resolver != null ? resolver.defaultValue(remoteConfigEntry.getFullKey(), null) : null);
        configFieldBuilder.value(java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : ((java.lang.Boolean) remoteConfigEntry.getDefaultValue()).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory$create$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory$create$1$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteConfigSectionFactory$create$1$1(com.paypal.oslo.core.remoteconfig.di.RemoteConfigInitializerEntryPoint remoteConfigInitializerEntryPoint, com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory remoteConfigSectionFactory, com.paypal.oslo.core.companion.domain.ConfigSectionBuilder configSectionBuilder, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory$create$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = remoteConfigInitializerEntryPoint;
        this.getHighResolutionOutputSizeshNQ4ISI = remoteConfigSectionFactory;
        this.getHighSpeedVideoFpsRangesFor = configSectionBuilder;
    }
}
