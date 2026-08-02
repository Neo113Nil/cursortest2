package com.paypal.oslo.core.telemetry.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackingEffectKt$Nav3ViewTrackingEffect$1$1", f = "Nav3ViewTrackingEffect.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class Nav3ViewTrackingEffectKt$Nav3ViewTrackingEffect$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.navigation3.runtime.NavKey Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.navigation3.runtime.NavKey> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.navigation3.runtime.NavKey access$Nav3ViewTrackingEffect$lambda$1 = com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackingEffectKt.access$Nav3ViewTrackingEffect$lambda$1(this.getHighSpeedVideoFpsRangesFor);
        if (access$Nav3ViewTrackingEffect$lambda$1 != null) {
            androidx.navigation3.runtime.NavKey navKey = this.Camera2StreamConfigurationMap;
            com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker nav3ViewTracker = this.getHighResolutionOutputSizeshNQ4ISI;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(navKey, access$Nav3ViewTrackingEffect$lambda$1)) {
                java.lang.String extractModuleName = com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractModuleName(access$Nav3ViewTrackingEffect$lambda$1);
                java.lang.String extractScreenName = com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractScreenName(access$Nav3ViewTrackingEffect$lambda$1);
                java.lang.String extractSimpleName = com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(access$Nav3ViewTrackingEffect$lambda$1);
                com.paypal.android.logger.Logger logger = com.paypal.oslo.core.telemetry.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                pairArr[0] = kotlin.TuplesKt.to("screen_name", extractScreenName);
                pairArr[1] = kotlin.TuplesKt.to("module_name", extractModuleName == null ? "" : extractModuleName);
                pairArr[2] = kotlin.TuplesKt.to("destination", extractSimpleName);
                com.paypal.android.logger.Logger.d$default(logger, "Datadog rum stopView", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                com.datadog.android.rum.RumMonitor rumMonitor = com.datadog.android.rum.GlobalRumMonitor.get$default(null, 1, null);
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                if (extractModuleName != null) {
                    createMapBuilder.put(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackingEffectKt$Nav3ViewTrackingEffect$1$1$1$1$1$1
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public final java.lang.Object get(java.lang.Object obj2) {
                            return ((com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TechnicalContext) obj2).getEventSource();
                        }
                    }), extractModuleName);
                }
                createMapBuilder.put(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackingEffectKt$Nav3ViewTrackingEffect$1$1$1$1$2
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public final java.lang.Object get(java.lang.Object obj2) {
                        return ((com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TechnicalContext) obj2).getDestination();
                    }
                }), extractScreenName);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                rumMonitor.stopView(extractSimpleName, kotlin.collections.MapsKt.build(createMapBuilder));
                nav3ViewTracker.trackScreenDisappeared$telemetry_release(access$Nav3ViewTrackingEffect$lambda$1, navKey);
            }
        }
        androidx.navigation3.runtime.NavKey navKey2 = this.Camera2StreamConfigurationMap;
        if (navKey2 != null && !kotlin.jvm.internal.Intrinsics.areEqual(navKey2, com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackingEffectKt.access$Nav3ViewTrackingEffect$lambda$1(this.getHighSpeedVideoFpsRangesFor))) {
            java.lang.String extractModuleName2 = com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractModuleName(this.Camera2StreamConfigurationMap);
            java.lang.String extractScreenName2 = com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractScreenName(this.Camera2StreamConfigurationMap);
            java.lang.String extractSimpleName2 = com.paypal.oslo.core.telemetry.util.NavKeyExtensionsKt.extractSimpleName(this.Camera2StreamConfigurationMap);
            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.core.telemetry.LoggerKt.log;
            kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
            pairArr2[0] = kotlin.TuplesKt.to("screen_name", extractScreenName2);
            pairArr2[1] = kotlin.TuplesKt.to("module_name", extractModuleName2 != null ? extractModuleName2 : "");
            pairArr2[2] = kotlin.TuplesKt.to("destination", extractSimpleName2);
            com.paypal.android.logger.Logger.d$default(logger2, "Datadog rum startView", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
            com.datadog.android.rum.RumMonitor rumMonitor2 = com.datadog.android.rum.GlobalRumMonitor.get$default(null, 1, null);
            java.util.Map createMapBuilder2 = kotlin.collections.MapsKt.createMapBuilder();
            if (extractModuleName2 != null) {
                createMapBuilder2.put(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackingEffectKt$Nav3ViewTrackingEffect$1$1$2$1$1
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public final java.lang.Object get(java.lang.Object obj2) {
                        return ((com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TechnicalContext) obj2).getEventSource();
                    }
                }), extractModuleName2);
            }
            createMapBuilder2.put(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackingEffectKt$Nav3ViewTrackingEffect$1$1$2$2
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public final java.lang.Object get(java.lang.Object obj2) {
                    return ((com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TechnicalContext) obj2).getDestination();
                }
            }), extractScreenName2);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            rumMonitor2.startView(extractSimpleName2, extractSimpleName2, kotlin.collections.MapsKt.build(createMapBuilder2));
            this.getHighResolutionOutputSizeshNQ4ISI.trackScreenAppeared$telemetry_release(this.Camera2StreamConfigurationMap, com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackingEffectKt.access$Nav3ViewTrackingEffect$lambda$1(this.getHighSpeedVideoFpsRangesFor));
        }
        this.getHighSpeedVideoFpsRangesFor.setValue(this.Camera2StreamConfigurationMap);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackingEffectKt$Nav3ViewTrackingEffect$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackingEffectKt$Nav3ViewTrackingEffect$1$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Nav3ViewTrackingEffectKt$Nav3ViewTrackingEffect$1$1(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker nav3ViewTracker, androidx.compose.runtime.MutableState<androidx.navigation3.runtime.NavKey> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackingEffectKt$Nav3ViewTrackingEffect$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = navKey;
        this.getHighResolutionOutputSizeshNQ4ISI = nav3ViewTracker;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
    }
}
