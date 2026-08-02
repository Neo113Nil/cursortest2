package com.google.maps.android.compose.streetview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.maps.android.compose.streetview.StreetViewKt$StreetView$6$1", f = "StreetView.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE}, m = "invokeSuspend", n = {"$this$newComposition$iv", "parent$iv", "content$iv", "$completion$iv", "$this$awaitStreetViewPanorama$iv$iv", "$i$f$disposingComposition", "$i$a$-disposingComposition-StreetViewKt$StreetView$6$1$1", "$i$f$newComposition", "$i$f$awaitStreetViewPanorama", "composition$iv", "$i$f$disposingComposition"}, nl = {200, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "L$0", "I$0"}, v = 2)
/* loaded from: classes.dex */
final class StreetViewKt$StreetView$6$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners> $clickListeners$delegate;
    final /* synthetic */ androidx.compose.runtime.State<com.google.maps.android.compose.streetview.StreetViewCameraPositionState> $currentCameraPositionState$delegate;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> $currentIsPanningGestureEnabled$delegate;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> $currentIsStreetNamesEnabled$delegate;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> $currentIsUserNavigationEnabled$delegate;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> $currentIsZoomGesturesEnabled$delegate;
    final /* synthetic */ androidx.compose.runtime.CompositionContext $parentComposition;
    final /* synthetic */ com.google.android.gms.maps.StreetViewPanoramaView $streetView;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.CompositionContext compositionContext;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        int i;
        androidx.compose.runtime.Composition Composition;
        androidx.compose.runtime.Composition composition;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
            if (i2 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.google.android.gms.maps.StreetViewPanoramaView streetViewPanoramaView = this.$streetView;
                compositionContext = this.$parentComposition;
                final androidx.compose.runtime.State<com.google.maps.android.compose.streetview.StreetViewCameraPositionState> state = this.$currentCameraPositionState$delegate;
                final androidx.compose.runtime.State<java.lang.Boolean> state2 = this.$currentIsPanningGestureEnabled$delegate;
                final androidx.compose.runtime.State<java.lang.Boolean> state3 = this.$currentIsStreetNamesEnabled$delegate;
                final androidx.compose.runtime.State<java.lang.Boolean> state4 = this.$currentIsUserNavigationEnabled$delegate;
                final androidx.compose.runtime.State<java.lang.Boolean> state5 = this.$currentIsZoomGesturesEnabled$delegate;
                final androidx.compose.runtime.State<com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners> state6 = this.$clickListeners$delegate;
                androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1039809540, true, new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.streetview.StreetViewKt$StreetView$6$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        kotlin.Unit invokeSuspend$lambda$0$0;
                        invokeSuspend$lambda$0$0 = com.google.maps.android.compose.streetview.StreetViewKt$StreetView$6$1.invokeSuspend$lambda$0$0(androidx.compose.runtime.State.this, state2, state3, state4, state5, state6, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        return invokeSuspend$lambda$0$0;
                    }
                });
                this.L$0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(streetViewPanoramaView);
                this.L$1 = compositionContext;
                this.L$2 = composableLambdaInstance;
                this.L$3 = this;
                this.L$4 = streetViewPanoramaView;
                this.I$0 = 0;
                this.I$1 = 0;
                this.I$2 = 0;
                this.I$3 = 0;
                this.label = 1;
                com.google.maps.android.compose.streetview.StreetViewKt$StreetView$6$1 streetViewKt$StreetView$6$1 = this;
                kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(streetViewKt$StreetView$6$1));
                streetViewPanoramaView.getStreetViewPanoramaAsync(new com.google.maps.android.compose.streetview.StreetViewKt$newComposition$$inlined$awaitStreetViewPanorama$1(safeContinuation));
                obj = safeContinuation.getOrThrow();
                if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(streetViewKt$StreetView$6$1);
                }
                if (obj != coroutine_suspended) {
                    function2 = composableLambdaInstance;
                    i = 0;
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                composition = (androidx.compose.runtime.Composition) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    throw new kotlin.KotlinNothingValueException();
                } catch (java.lang.Throwable th) {
                    androidx.compose.runtime.Composition composition2 = composition;
                    th = th;
                    Composition = composition2;
                    Composition.dispose();
                    throw th;
                }
            }
            i = this.I$0;
            function2 = (kotlin.jvm.functions.Function2) this.L$2;
            compositionContext = (androidx.compose.runtime.CompositionContext) this.L$1;
            kotlin.ResultKt.throwOnFailure(obj);
            this.L$0 = Composition;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.I$0 = i;
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
        com.google.android.gms.maps.StreetViewPanorama streetViewPanorama = (com.google.android.gms.maps.StreetViewPanorama) obj;
        streetViewPanorama.getLocation();
        Composition = androidx.compose.runtime.CompositionKt.Composition(new com.google.maps.android.compose.streetview.StreetViewPanoramaApplier(streetViewPanorama), compositionContext);
        Composition.setContent(function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit invokeSuspend$lambda$0$0(androidx.compose.runtime.State state, androidx.compose.runtime.State state2, androidx.compose.runtime.State state3, androidx.compose.runtime.State state4, androidx.compose.runtime.State state5, androidx.compose.runtime.State state6, androidx.compose.runtime.Composer composer, int i) {
        com.google.maps.android.compose.streetview.StreetViewCameraPositionState StreetView$lambda$6;
        boolean StreetView$lambda$7;
        boolean StreetView$lambda$8;
        boolean StreetView$lambda$9;
        boolean StreetView$lambda$10;
        com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners StreetView$lambda$12;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1039809540, i, -1, "com.google.maps.android.compose.streetview.StreetView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StreetView.kt:101)");
            }
            StreetView$lambda$6 = com.google.maps.android.compose.streetview.StreetViewKt.StreetView$lambda$6(state);
            StreetView$lambda$7 = com.google.maps.android.compose.streetview.StreetViewKt.StreetView$lambda$7(state2);
            StreetView$lambda$8 = com.google.maps.android.compose.streetview.StreetViewKt.StreetView$lambda$8(state3);
            StreetView$lambda$9 = com.google.maps.android.compose.streetview.StreetViewKt.StreetView$lambda$9(state4);
            StreetView$lambda$10 = com.google.maps.android.compose.streetview.StreetViewKt.StreetView$lambda$10(state5);
            StreetView$lambda$12 = com.google.maps.android.compose.streetview.StreetViewKt.StreetView$lambda$12(state6);
            androidx.compose.runtime.Applier<?> applier = composer.getApplier();
            kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "");
            com.google.android.gms.maps.StreetViewPanorama streetViewPanorama = ((com.google.maps.android.compose.streetview.StreetViewPanoramaApplier) applier).getStreetViewPanorama();
            boolean changedInstance = composer.changedInstance(StreetView$lambda$6);
            boolean changedInstance2 = composer.changedInstance(streetViewPanorama);
            boolean changed = composer.changed(StreetView$lambda$12);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changedInstance2 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function0) new com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$1$1(StreetView$lambda$6, streetViewPanorama, StreetView$lambda$12);
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            if (!(composer.getApplier() instanceof com.google.maps.android.compose.streetview.StreetViewPanoramaApplier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startNode();
            if (composer.getInserting()) {
                composer.createNode(function0);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(StreetView$lambda$7), new com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$1(StreetView$lambda$7));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(StreetView$lambda$8), new com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$2(StreetView$lambda$8));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(StreetView$lambda$9), new com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$3(StreetView$lambda$9));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, java.lang.Boolean.valueOf(StreetView$lambda$10), new com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$4(StreetView$lambda$10));
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, StreetView$lambda$12, com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$5.INSTANCE);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.google.maps.android.compose.streetview.StreetViewKt$StreetView$6$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.google.maps.android.compose.streetview.StreetViewKt$StreetView$6$1(this.$streetView, this.$parentComposition, this.$currentCameraPositionState$delegate, this.$currentIsPanningGestureEnabled$delegate, this.$currentIsStreetNamesEnabled$delegate, this.$currentIsUserNavigationEnabled$delegate, this.$currentIsZoomGesturesEnabled$delegate, this.$clickListeners$delegate, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StreetViewKt$StreetView$6$1(com.google.android.gms.maps.StreetViewPanoramaView streetViewPanoramaView, androidx.compose.runtime.CompositionContext compositionContext, androidx.compose.runtime.State<com.google.maps.android.compose.streetview.StreetViewCameraPositionState> state, androidx.compose.runtime.State<java.lang.Boolean> state2, androidx.compose.runtime.State<java.lang.Boolean> state3, androidx.compose.runtime.State<java.lang.Boolean> state4, androidx.compose.runtime.State<java.lang.Boolean> state5, androidx.compose.runtime.State<com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners> state6, kotlin.coroutines.Continuation<? super com.google.maps.android.compose.streetview.StreetViewKt$StreetView$6$1> continuation) {
        super(2, continuation);
        this.$streetView = streetViewPanoramaView;
        this.$parentComposition = compositionContext;
        this.$currentCameraPositionState$delegate = state;
        this.$currentIsPanningGestureEnabled$delegate = state2;
        this.$currentIsStreetNamesEnabled$delegate = state3;
        this.$currentIsUserNavigationEnabled$delegate = state4;
        this.$currentIsZoomGesturesEnabled$delegate = state5;
        this.$clickListeners$delegate = state6;
    }
}
