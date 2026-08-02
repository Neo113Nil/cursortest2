package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.maps.android.compose.GoogleMapKt$launchSubcomposition$1", f = "GoogleMap.kt", i = {0, 0, 1, 1}, l = {403, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m = "invokeSuspend", n = {"$this$awaitMap$iv", "$i$f$awaitMap", "map", "composition"}, nl = {407, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, s = {"L$0", "I$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes9.dex */
final class GoogleMapKt$launchSubcomposition$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> $content;
    final /* synthetic */ com.google.maps.android.compose.MapClickListeners $mapClickListeners;
    final /* synthetic */ com.google.maps.android.compose.MapUpdaterState $mapUpdaterState;
    final /* synthetic */ com.google.android.gms.maps.MapView $mapView;
    final /* synthetic */ androidx.compose.runtime.CompositionContext $parentComposition;
    int I$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        if (r8 != r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.google.android.gms.maps.GoogleMap googleMap;
        androidx.compose.runtime.Composition Composition;
        androidx.compose.runtime.Composition composition;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.google.android.gms.maps.MapView mapView = this.$mapView;
                this.L$0 = mapView;
                this.I$0 = 0;
                this.label = 1;
                com.google.maps.android.compose.GoogleMapKt$launchSubcomposition$1 googleMapKt$launchSubcomposition$1 = this;
                kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(googleMapKt$launchSubcomposition$1));
                final kotlin.coroutines.SafeContinuation safeContinuation2 = safeContinuation;
                mapView.getMapAsync(new com.google.android.gms.maps.OnMapReadyCallback() { // from class: com.google.maps.android.compose.GoogleMapKt$launchSubcomposition$1$invokeSuspend$$inlined$awaitMap$1
                    @Override // com.google.android.gms.maps.OnMapReadyCallback
                    public final void onMapReady(com.google.android.gms.maps.GoogleMap googleMap2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap2, "");
                        kotlin.coroutines.Continuation continuation = kotlin.coroutines.Continuation.this;
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        continuation.resumeWith(kotlin.Result.m23436constructorimpl(googleMap2));
                    }
                });
                obj = safeContinuation.getOrThrow();
                if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(googleMapKt$launchSubcomposition$1);
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    composition = (androidx.compose.runtime.Composition) this.L$1;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        throw new kotlin.KotlinNothingValueException();
                    } catch (java.lang.Throwable th) {
                        th = th;
                        Composition = composition;
                        Composition.dispose();
                        throw th;
                    }
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            final com.google.maps.android.compose.MapUpdaterState mapUpdaterState = this.$mapUpdaterState;
            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.$content;
            Composition.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(704030801, true, new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.GoogleMapKt$launchSubcomposition$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = com.google.maps.android.compose.GoogleMapKt$launchSubcomposition$1.invokeSuspend$lambda$0(com.google.maps.android.compose.MapUpdaterState.this, function2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    return invokeSuspend$lambda$0;
                }
            }));
            this.L$0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(googleMap);
            this.L$1 = Composition;
            this.label = 2;
            if (kotlinx.coroutines.DelayKt.awaitCancellation(this) != coroutine_suspended) {
                composition = Composition;
                throw new kotlin.KotlinNothingValueException();
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th2) {
            th = th2;
            Composition.dispose();
            throw th;
        }
        googleMap = (com.google.android.gms.maps.GoogleMap) obj;
        Composition = androidx.compose.runtime.CompositionKt.Composition(new com.google.maps.android.compose.MapApplier(googleMap, this.$mapView, this.$mapClickListeners), this.$parentComposition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit invokeSuspend$lambda$0(com.google.maps.android.compose.MapUpdaterState mapUpdaterState, kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(704030801, i, -1, "com.google.maps.android.compose.launchSubcomposition.<anonymous>.<anonymous> (GoogleMap.kt:242)");
            }
            composer.startReplaceGroup(-1929098053);
            androidx.compose.runtime.Applier<?> applier = composer.getApplier();
            kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "");
            com.google.android.gms.maps.GoogleMap map = ((com.google.maps.android.compose.MapApplier) applier).getMap();
            androidx.compose.runtime.Applier<?> applier2 = composer.getApplier();
            kotlin.jvm.internal.Intrinsics.checkNotNull(applier2, "");
            com.google.android.gms.maps.MapView mapView = ((com.google.maps.android.compose.MapApplier) applier2).getMapView();
            if (mapUpdaterState.getMergeDescendants()) {
                mapView.setImportantForAccessibility(4);
            }
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
            boolean changed = composer.changed(mapUpdaterState);
            boolean changedInstance = composer.changedInstance(map);
            boolean changed2 = composer.changed(density);
            boolean changed3 = composer.changed(layoutDirection.ordinal());
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changedInstance | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function0) new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$1$1(mapUpdaterState, map, density, layoutDirection);
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            if (!(composer.getApplier() instanceof com.google.maps.android.compose.MapApplier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startNode();
            if (composer.getInserting()) {
                composer.createNode(function0);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, density, com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$1.INSTANCE);
            androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, layoutDirection, com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$2.INSTANCE);
            androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, mapUpdaterState.getContentDescription(), com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$3.INSTANCE);
            androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, mapUpdaterState.getContentPadding(), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$4(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, mapUpdaterState.getLocationSource(), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$5(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapProperties().getIsBuildingEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$6(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapProperties().getIsIndoorEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$7(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapProperties().getIsMyLocationEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$8(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapProperties().getIsTrafficEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$9(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, mapUpdaterState.getMapProperties().getLatLngBoundsForCameraTarget(), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$10(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, mapUpdaterState.getMapProperties().getMapStyleOptions(), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$11(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, mapUpdaterState.getMapProperties().getMapType(), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$12(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Float.valueOf(mapUpdaterState.getMapProperties().getMaxZoomPreference()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$13(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Float.valueOf(mapUpdaterState.getMapProperties().getMinZoomPreference()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$14(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, mapUpdaterState.getMapColorScheme(), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$15(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getCompassEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$16(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getIndoorLevelPickerEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$17(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getMapToolbarEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$18(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getMyLocationButtonEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$19(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getRotationGesturesEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$20(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getScrollGesturesEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$21(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getScrollGesturesEnabledDuringRotateOrZoom()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$22(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getTiltGesturesEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$23(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getZoomControlsEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$24(map));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(mapUpdaterState.getMapUiSettings().getZoomGesturesEnabled()), new com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$25(map));
            androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, mapUpdaterState.getCameraPositionState(), com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1$2$26.INSTANCE);
            composer.endNode();
            composer.endReplaceGroup();
            com.google.maps.android.compose.MapClickListenersKt.MapClickListenerUpdater(composer, 0);
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.google.maps.android.compose.CameraPositionStateKt.getLocalCameraPositionState().provides(mapUpdaterState.getCameraPositionState()), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function2, composer, androidx.compose.runtime.ProvidedValue.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.google.maps.android.compose.GoogleMapKt$launchSubcomposition$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.google.maps.android.compose.GoogleMapKt$launchSubcomposition$1(this.$mapView, this.$mapClickListeners, this.$parentComposition, this.$mapUpdaterState, this.$content, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GoogleMapKt$launchSubcomposition$1(com.google.android.gms.maps.MapView mapView, com.google.maps.android.compose.MapClickListeners mapClickListeners, androidx.compose.runtime.CompositionContext compositionContext, com.google.maps.android.compose.MapUpdaterState mapUpdaterState, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super com.google.maps.android.compose.GoogleMapKt$launchSubcomposition$1> continuation) {
        super(2, continuation);
        this.$mapView = mapView;
        this.$mapClickListeners = mapClickListeners;
        this.$parentComposition = compositionContext;
        this.$mapUpdaterState = mapUpdaterState;
        this.$content = function2;
    }
}
