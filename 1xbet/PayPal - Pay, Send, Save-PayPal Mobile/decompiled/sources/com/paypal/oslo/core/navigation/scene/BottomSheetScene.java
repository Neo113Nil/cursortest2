package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003BS\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\"\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010#R\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0!X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010$\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b%X\u0096\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'¨\u0006)²\u0006\n\u0010*\u001a\u00020+X\u008a\u008e\u0002"}, d2 = {"Lcom/paypal/oslo/core/navigation/scene/BottomSheetScene;", "T", "", "Landroidx/navigation3/scene/OverlayScene;", "key", "previousEntries", "", "Landroidx/navigation3/runtime/NavEntry;", "overlaidEntries", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "onBack", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/util/List;Landroidx/navigation3/runtime/NavEntry;Lkotlin/jvm/functions/Function0;)V", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getPreviousEntries", "()Ljava/util/List;", "getOverlaidEntries", "entries", "getEntries", "<set-?>", "", "hideRequested", "getHideRequested", "()Z", "setHideRequested", "(Z)V", "hideRequested$delegate", "Landroidx/compose/runtime/MutableState;", "hideComplete", "Lkotlinx/coroutines/CompletableDeferred;", "onRemove", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "content", "Landroidx/compose/runtime/Composable;", "getContent", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "navigation_release", "dismissType", "Lcom/paypal/oslo/core/navigation/scene/DismissType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BottomSheetScene<T> implements androidx.navigation3.scene.OverlayScene<T> {
    public static final int $stable = 0;
    private final androidx.compose.runtime.MutableState Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.CompletableDeferred<kotlin.Unit> getHighSpeedVideoFpsRanges;
    private final java.util.List<androidx.navigation3.runtime.NavEntry<T>> getHighSpeedVideoFpsRangesFor;
    private final androidx.navigation3.runtime.NavEntry<T> getHighSpeedVideoSizes;
    private final java.util.List<androidx.navigation3.runtime.NavEntry<T>> getInputFormats;
    private final T getInputSizeshNQ4ISI;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getOutputFormats;
    private final java.util.List<androidx.navigation3.runtime.NavEntry<T>> getOutputMinFrameDuration;

    public BottomSheetScene(T t, java.util.List<androidx.navigation3.runtime.NavEntry<T>> list, java.util.List<androidx.navigation3.runtime.NavEntry<T>> list2, androidx.navigation3.runtime.NavEntry<T> navEntry, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navEntry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getInputSizeshNQ4ISI = t;
        this.getOutputMinFrameDuration = list;
        this.getInputFormats = list2;
        this.getHighSpeedVideoSizes = navEntry;
        this.getOutputFormats = function0;
        this.getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.listOf(navEntry);
        this.Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
        this.getHighSpeedVideoFpsRanges = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1028901753, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.BottomSheetScene$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.core.navigation.scene.BottomSheetScene.$r8$lambda$UbOpzcNgadEnI7cNVj_1_FIsENQ(com.paypal.oslo.core.navigation.scene.BottomSheetScene.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
    }

    @Override // androidx.navigation3.scene.Scene
    public final /* bridge */ java.util.Map<java.lang.String, java.lang.Object> getMetadata() {
        return super.getMetadata();
    }

    @Override // androidx.navigation3.scene.Scene
    public final T getKey() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // androidx.navigation3.scene.Scene
    public final java.util.List<androidx.navigation3.runtime.NavEntry<T>> getPreviousEntries() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.navigation3.scene.OverlayScene
    public final java.util.List<androidx.navigation3.runtime.NavEntry<T>> getOverlaidEntries() {
        return this.getInputFormats;
    }

    @Override // androidx.navigation3.scene.Scene
    public final java.util.List<androidx.navigation3.runtime.NavEntry<T>> getEntries() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.navigation3.scene.Scene
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getContent() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$32xcFURZzzv3lgz01xdeOCiqXbs(com.paypal.oslo.core.navigation.scene.BottomSheetToastState bottomSheetToastState, androidx.compose.runtime.MutableState mutableState) {
        bottomSheetToastState.dismiss();
        mutableState.setValue(com.paypal.oslo.core.navigation.scene.DismissType.getHighResolutionOutputSizeshNQ4ISI);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5S_pREG1xWBZdacWaZ72ubxfXmM(com.paypal.oslo.core.navigation.scene.BottomSheetToastState bottomSheetToastState, androidx.compose.runtime.MutableState mutableState) {
        bottomSheetToastState.dismiss();
        mutableState.setValue(com.paypal.oslo.core.navigation.scene.DismissType.Camera2StreamConfigurationMap);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5ateMAGhKQ7FaOyOJMRPD5JBt90(com.paypal.oslo.core.navigation.scene.BottomSheetScene bottomSheetScene, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1279853544, i, -1, "com.paypal.oslo.core.navigation.scene.BottomSheetScene.content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheetScene.kt:188)");
            }
            if (((java.lang.Boolean) bottomSheetScene.Camera2StreamConfigurationMap.getValue()).booleanValue()) {
                composer.startReplaceGroup(-1691805238);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1691865781);
                bottomSheetScene.getHighSpeedVideoSizes.Content(composer, 0);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6THuKYnOXQK_OQRYPDVg97_izr4(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, com.paypal.pds.components.TopNavConfig topNavConfig, kotlin.jvm.functions.Function0 function02, boolean z, final com.paypal.oslo.core.navigation.scene.BottomSheetScene bottomSheetScene, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(34864063, i, -1, "com.paypal.oslo.core.navigation.scene.BottomSheetScene.content.<anonymous>.<anonymous>.<anonymous> (BottomSheetScene.kt:177)");
            }
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, topNavConfig, null, null, null, function02, false, z, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1279853544, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.BottomSheetScene$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.scene.BottomSheetScene.$r8$lambda$5ateMAGhKQ7FaOyOJMRPD5JBt90(com.paypal.oslo.core.navigation.scene.BottomSheetScene.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, com.paypal.pds.components.BottomSheetController.$stable | 806879280 | (com.paypal.pds.components.TopNavConfig.$stable << 6), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$K2JmnRimaJ2nPZQ4tKb2TpN8n5s(boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.paypal.pds.components.BottomSheetController bottomSheetController) {
        if (z) {
            function0.invoke();
        } else {
            function02.invoke();
        }
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UbOpzcNgadEnI7cNVj_1_FIsENQ(final com.paypal.oslo.core.navigation.scene.BottomSheetScene bottomSheetScene, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.pds.components.TopNavConfig topNavConfig;
        androidx.compose.runtime.MutableState mutableState;
        final com.paypal.oslo.core.navigation.scene.BottomSheetToastState bottomSheetToastState;
        final androidx.compose.runtime.MutableState mutableState2;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1028901753, i, -1, "com.paypal.oslo.core.navigation.scene.BottomSheetScene.content.<anonymous> (BottomSheetScene.kt:65)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                composer.updateRememberedValue(rememberedValue);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = composer.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.core.navigation.scene.BottomSheetScene$content$1$1$1(bottomSheetController, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer, 6);
            java.util.Map<java.lang.String, java.lang.Object> metadata = bottomSheetScene.getHighSpeedVideoSizes.getMetadata();
            java.lang.String str = (java.lang.String) androidx.navigation3.runtime.NavMetadataKt.get(metadata, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getBOTTOM_SHEET_TITLE());
            java.lang.Boolean bool = (java.lang.Boolean) androidx.navigation3.runtime.NavMetadataKt.get(metadata, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getBOTTOM_SHEET_SHOW_BACK_BUTTON());
            final boolean booleanValue = bool != null ? bool.booleanValue() : false;
            java.lang.Boolean bool2 = (java.lang.Boolean) androidx.navigation3.runtime.NavMetadataKt.get(metadata, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getBOTTOM_SHEET_SHOW_CLOSE_BUTTON());
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            java.lang.Boolean bool3 = (java.lang.Boolean) androidx.navigation3.runtime.NavMetadataKt.get(metadata, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getBOTTOM_SHEET_SHOW_GRIPPER());
            boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : true;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = (kotlin.jvm.functions.Function0) androidx.navigation3.runtime.NavMetadataKt.get(metadata, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getBOTTOM_SHEET_ON_BACK_CLICK());
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) androidx.navigation3.runtime.NavMetadataKt.get(metadata, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getBOTTOM_SHEET_ON_CLOSE_CLICK());
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) androidx.navigation3.runtime.NavMetadataKt.get(metadata, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getBOTTOM_SHEET_ON_DISMISS());
            if (str != null || booleanValue || booleanValue2) {
                topNavConfig = new com.paypal.pds.components.TopNavConfig(str, booleanValue, function0 == null ? bottomSheetScene.getOutputFormats : function0);
            } else {
                topNavConfig = null;
            }
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.oslo.core.navigation.scene.BottomSheetToastState();
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.core.navigation.scene.BottomSheetToastState bottomSheetToastState2 = (com.paypal.oslo.core.navigation.scene.BottomSheetToastState) rememberedValue3;
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.paypal.oslo.core.navigation.scene.DismissType.getHighSpeedVideoFpsRangesFor, null, 2, null);
                composer.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue4;
            boolean booleanValue4 = ((java.lang.Boolean) bottomSheetScene.Camera2StreamConfigurationMap.getValue()).booleanValue();
            boolean changed = composer.changed(bottomSheetScene);
            boolean changedInstance2 = composer.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if ((changed | changedInstance2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.core.navigation.scene.BottomSheetScene$content$1$2$1(bottomSheetScene, bottomSheetController, null);
                composer.updateRememberedValue(rememberedValue5);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue4), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, composer, 0);
            boolean visible = bottomSheetController.getVisible();
            boolean changedInstance3 = composer.changedInstance(bottomSheetController);
            boolean changed2 = composer.changed(bottomSheetScene);
            boolean changed3 = composer.changed(function03);
            boolean changed4 = composer.changed(function02);
            boolean changed5 = composer.changed(function0);
            java.lang.Object rememberedValue6 = composer.rememberedValue();
            if (((changedInstance3 | changed2 | changed3 | changed4) || changed5) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState3;
                bottomSheetToastState = bottomSheetToastState2;
                rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.core.navigation.scene.BottomSheetScene$content$1$3$1(bottomSheetController, bottomSheetScene, function03, function02, function0, mutableState, null);
                composer.updateRememberedValue(rememberedValue6);
            } else {
                mutableState = mutableState3;
                bottomSheetToastState = bottomSheetToastState2;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(visible), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, composer, 0);
            java.lang.Object rememberedValue7 = composer.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                mutableState2 = mutableState;
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.scene.BottomSheetScene$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.core.navigation.scene.BottomSheetScene.$r8$lambda$5S_pREG1xWBZdacWaZ72ubxfXmM(com.paypal.oslo.core.navigation.scene.BottomSheetToastState.this, mutableState2);
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            } else {
                mutableState2 = mutableState;
            }
            final kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue7;
            java.lang.Object rememberedValue8 = composer.rememberedValue();
            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.scene.BottomSheetScene$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.core.navigation.scene.BottomSheetScene.m11598$r8$lambda$kdk1UDqomFR2_h9O9UbuS1ww5I(com.paypal.oslo.core.navigation.scene.BottomSheetToastState.this, mutableState2);
                    }
                };
                composer.updateRememberedValue(rememberedValue8);
            }
            final kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue8;
            java.lang.Object rememberedValue9 = composer.rememberedValue();
            if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.scene.BottomSheetScene$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.core.navigation.scene.BottomSheetScene.$r8$lambda$32xcFURZzzv3lgz01xdeOCiqXbs(com.paypal.oslo.core.navigation.scene.BottomSheetToastState.this, mutableState2);
                    }
                };
                composer.updateRememberedValue(rememberedValue9);
            }
            final kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue9;
            boolean visible2 = bottomSheetController.getVisible();
            boolean changed6 = composer.changed(booleanValue);
            boolean changedInstance4 = composer.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue10 = composer.rememberedValue();
            if ((changed6 | changedInstance4) || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.scene.BottomSheetScene$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.core.navigation.scene.BottomSheetScene.$r8$lambda$K2JmnRimaJ2nPZQ4tKb2TpN8n5s(booleanValue, function06, function04, bottomSheetController);
                    }
                };
                composer.updateRememberedValue(rememberedValue10);
            }
            androidx.view.compose.BackHandlerKt.BackHandler(visible2, (kotlin.jvm.functions.Function0) rememberedValue10, composer, 0, 0);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            java.lang.Object rememberedValue11 = composer.rememberedValue();
            if (rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) com.paypal.oslo.core.navigation.scene.BottomSheetScene$content$1$5$1.getHighResolutionOutputSizeshNQ4ISI;
                composer.updateRememberedValue(rememberedValue11);
            }
            androidx.compose.ui.Modifier pointerInput = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(fillMaxSize$default, unit2, (androidx.compose.ui.input.pointer.PointerInputEventHandler) rememberedValue11);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, pointerInput);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            final com.paypal.pds.components.TopNavConfig topNavConfig2 = topNavConfig;
            final boolean z = booleanValue3;
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.core.navigation.scene.BottomSheetToastStateKt.getLocalBottomSheetToast().provides(bottomSheetToastState), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(34864063, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.scene.BottomSheetScene$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.scene.BottomSheetScene.$r8$lambda$6THuKYnOXQK_OQRYPDVg97_izr4(com.paypal.pds.components.BottomSheetController.this, function04, topNavConfig2, function05, z, bottomSheetScene, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
            com.paypal.oslo.core.navigation.scene.BottomSheetToastStateKt.BottomSheetToastOverlay(bottomSheetToastState, boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), composer, 6, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kdk1UD-qomFR2_h9O9UbuS1ww5I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11598$r8$lambda$kdk1UDqomFR2_h9O9UbuS1ww5I(com.paypal.oslo.core.navigation.scene.BottomSheetToastState bottomSheetToastState, androidx.compose.runtime.MutableState mutableState) {
        bottomSheetToastState.dismiss();
        mutableState.setValue(com.paypal.oslo.core.navigation.scene.DismissType.getHighSpeedVideoFpsRanges);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.core.navigation.scene.DismissType access$content$lambda$0$4(androidx.compose.runtime.MutableState mutableState) {
        return (com.paypal.oslo.core.navigation.scene.DismissType) mutableState.getValue();
    }

    @Override // androidx.navigation3.scene.OverlayScene
    public final java.lang.Object onRemove(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.Camera2StreamConfigurationMap.setValue(java.lang.Boolean.TRUE);
        java.lang.Object await = this.getHighSpeedVideoFpsRanges.await(continuation);
        return await == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? await : kotlin.Unit.INSTANCE;
    }
}
