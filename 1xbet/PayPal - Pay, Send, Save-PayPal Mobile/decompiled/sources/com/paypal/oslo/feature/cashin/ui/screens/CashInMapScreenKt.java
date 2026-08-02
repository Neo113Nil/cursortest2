package com.paypal.oslo.feature.cashin.ui.screens;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\r\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\"\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, d2 = {"CashInMapScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/MapViewModel;", "markerUtils", "Lcom/paypal/oslo/feature/cashin/ui/utils/MarkerUtils;", "mapComponent", "Lcom/paypal/oslo/feature/cashin/ui/components/IMapComponent;", "onSearch", "Lkotlin/Function1;", "", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/cashin/ui/viewmodel/MapViewModel;Lcom/paypal/oslo/feature/cashin/ui/utils/MarkerUtils;Lcom/paypal/oslo/feature/cashin/ui/components/IMapComponent;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "navigateToMethodSelection", "", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "SEARCH_AREA_BUTTON_BOTTOM_PADDING", "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "cash-in_prodRelease", "uiState", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/MapUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CashInMapScreenKt {
    private static final float Camera2StreamConfigurationMap = androidx.compose.ui.unit.Dp.m8601constructorimpl(280.0f);

    /* JADX WARN: Removed duplicated region for block: B:100:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0694  */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CashInMapScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel, com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils markerUtils, com.paypal.oslo.feature.cashin.ui.components.IMapComponent iMapComponent, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel2;
        com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils markerUtils2;
        com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils markerUtils3;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        com.paypal.oslo.feature.cashin.ui.components.IMapComponent iMapComponent2;
        final com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel3;
        boolean z;
        com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils markerUtils4;
        int i4;
        final com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel4;
        com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils markerUtils5;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        ?? r5;
        final androidx.compose.runtime.State collectAsState;
        java.lang.Object rememberedValue;
        boolean changed;
        boolean changedInstance;
        java.lang.Object rememberedValue2;
        boolean changed2;
        java.lang.Object rememberedValue3;
        boolean changed3;
        java.lang.Object rememberedValue4;
        boolean changed4;
        boolean changedInstance2;
        java.lang.Object rememberedValue5;
        com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils markerUtils6;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        int i5;
        boolean z2;
        final boolean z3;
        java.lang.String stringResource;
        java.lang.String stringResource2;
        boolean changed5;
        boolean changed6;
        boolean changedInstance3;
        java.lang.Object rememberedValue6;
        boolean changedInstance4;
        java.lang.Object rememberedValue7;
        boolean changedInstance5;
        java.lang.Object rememberedValue8;
        int i6;
        int i7;
        com.paypal.oslo.feature.cashin.ui.components.DefaultMapComponent defaultMapComponent = iMapComponent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-650548438);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                mapViewModel2 = mapViewModel;
                if (startRestartGroup.changedInstance(mapViewModel2)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                mapViewModel2 = mapViewModel;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            mapViewModel2 = mapViewModel;
        }
        if ((i & 384) == 0) {
            markerUtils2 = markerUtils;
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(markerUtils2)) ? 256 : 128;
        } else {
            markerUtils2 = markerUtils;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                if ((i & 4096) == 0 ? startRestartGroup.changed(defaultMapComponent) : startRestartGroup.changedInstance(defaultMapComponent)) {
                    i6 = 2048;
                    i3 |= i6;
                }
            }
            i6 = 1024;
            i3 |= i6;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    z = false;
                    mapViewModel2 = (com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, startRestartGroup, 0, 0);
                    i3 &= -113;
                } else {
                    z = false;
                }
                if ((i2 & 4) != 0) {
                    markerUtils4 = new com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils();
                    i3 &= -897;
                } else {
                    markerUtils4 = markerUtils;
                }
                if ((i2 & 8) != 0) {
                    defaultMapComponent = new com.paypal.oslo.feature.cashin.ui.components.DefaultMapComponent();
                    i3 &= -7169;
                }
                if (i8 != 0) {
                    java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                    if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt.$r8$lambda$rFtpSgPddnJuQixaPiKC5HGXddY((java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                    }
                    iMapComponent2 = defaultMapComponent;
                    i4 = i3;
                    mapViewModel4 = mapViewModel2;
                    markerUtils5 = markerUtils4;
                    function13 = (kotlin.jvm.functions.Function1) rememberedValue9;
                    r5 = z;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-650548438, i4, -1, "com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreen (CashInMapScreen.kt:76)");
                    }
                    collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(mapViewModel4.getUiState(), null, startRestartGroup, r5, 1);
                    android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.pds.components.BottomSheetController();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
                    boolean showErrorHalfSheet = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getShowErrorHalfSheet();
                    long errorEventId = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getErrorEventId();
                    changed = startRestartGroup.changed(collectAsState);
                    changedInstance = startRestartGroup.changedInstance(bottomSheetController);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!(changed | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$CashInMapScreen$2$1(bottomSheetController, collectAsState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(showErrorHalfSheet), java.lang.Long.valueOf(errorEventId), (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, r5);
                    boolean isLoading = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).isLoading();
                    boolean showErrorHalfSheet2 = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getShowErrorHalfSheet();
                    changed2 = startRestartGroup.changed(collectAsState);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$CashInMapScreen$3$1(collectAsState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(isLoading), java.lang.Boolean.valueOf(showErrorHalfSheet2), (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, r5);
                    java.lang.String error = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getError();
                    changed3 = startRestartGroup.changed(collectAsState);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$CashInMapScreen$4$1(collectAsState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(error, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (int) r5);
                    java.lang.String searchError = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getSearchError();
                    changed4 = startRestartGroup.changed(collectAsState);
                    changedInstance2 = startRestartGroup.changedInstance(context);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!(changed4 | changedInstance2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$CashInMapScreen$5$1(collectAsState, context, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(searchError, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, (int) r5);
                    int i9 = i4;
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), "cash_in_map_screen");
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), r5);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r5));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.useNode();
                    } else {
                        startRestartGroup.createNode(constructor);
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    if (((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).isLoading()) {
                        startRestartGroup.startReplaceGroup(1850787425);
                        java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore> locations = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getLocations();
                        com.paypal.oslo.feature.cashin.domain.model.CashInStore userLocation = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getUserLocation();
                        boolean changedInstance6 = startRestartGroup.changedInstance(mapViewModel4);
                        java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                        if (changedInstance6 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt.m13470$r8$lambda$1ObdjTqj0Lm5dptUpFVJf8a52c(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel.this, (com.paypal.oslo.feature.cashin.domain.model.CashInStore) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue10);
                        }
                        kotlin.jvm.functions.Function1 function15 = (kotlin.jvm.functions.Function1) rememberedValue10;
                        boolean changed7 = startRestartGroup.changed(collectAsState);
                        boolean changedInstance7 = startRestartGroup.changedInstance(mapViewModel4);
                        int i10 = i9 & 14;
                        boolean z4 = i10 == 4;
                        java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                        if ((z4 | changed7 | changedInstance7) || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt.$r8$lambda$j7rd2sVOR7k2M1DV19Kx1ksDvfM(androidx.compose.runtime.State.this, mapViewModel4, appNavigator);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue11);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue11;
                        androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.MapScreen.INSTANCE.getMAP_VIEW_MODULE()), "map_screen_map");
                        com.paypal.oslo.feature.cashin.domain.model.CashInStore selectedLocation = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getSelectedLocation();
                        boolean changedInstance8 = startRestartGroup.changedInstance(mapViewModel4);
                        boolean z5 = (i9 & 57344) == 16384;
                        java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
                        if ((changedInstance8 | z5) || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt.$r8$lambda$g43RzAa8Z_Qo_fh1YTuA1dXo6t8(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel.this, function13, (java.lang.String) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue12);
                        }
                        kotlin.jvm.functions.Function1 function16 = (kotlin.jvm.functions.Function1) rememberedValue12;
                        boolean changedInstance9 = startRestartGroup.changedInstance(mapViewModel4);
                        java.lang.Object rememberedValue13 = startRestartGroup.rememberedValue();
                        if (changedInstance9 || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue13 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt.m13471$r8$lambda$KhNsPfuSPcId9oj6_3aoKSYp8I(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue13);
                        }
                        markerUtils6 = markerUtils5;
                        function14 = function13;
                        i5 = 2;
                        com.paypal.oslo.feature.cashin.ui.components.IMapComponentKt.RenderMap(iMapComponent2, locations, markerUtils5, userLocation, function15, function0, testTag2, selectedLocation, function16, (kotlin.jvm.functions.Function0) rememberedValue13, ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getSearchResult(), startRestartGroup, ((i9 >> 9) & 14) | (i9 & 896), 0, 0);
                        if (!((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).isSheetVisible() || ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getLocations().isEmpty()) {
                            startRestartGroup.startReplaceGroup(1852868734);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1852383429);
                            java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore> locations2 = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getLocations();
                            boolean z6 = i10 == 4;
                            java.lang.Object rememberedValue14 = startRestartGroup.rememberedValue();
                            if (z6 || rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue14 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt.$r8$lambda$DZFHZvvmc4N6xKcLB3mxVEHrqPU(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.cashin.domain.model.CashInStore) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue14);
                            }
                            com.paypal.oslo.feature.cashin.ui.components.CashInNearbySheetKt.CashInNearbySheet(locations2, (kotlin.jvm.functions.Function1) rememberedValue14, false, startRestartGroup, 0, 4);
                            startRestartGroup.endReplaceGroup();
                        }
                        if (((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getShowNothingNearbyDialog()) {
                            startRestartGroup.startReplaceGroup(1852996237);
                            boolean changedInstance10 = startRestartGroup.changedInstance(mapViewModel4);
                            java.lang.Object rememberedValue15 = startRestartGroup.rememberedValue();
                            if (changedInstance10 || rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue15 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$$ExternalSyntheticLambda11
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt.$r8$lambda$CahlDu4PMJVatUSRGyrpbKA3GB0(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue15);
                            }
                            com.paypal.oslo.feature.cashin.ui.components.NothingNearbyDialogKt.NothingNearbyDialog((kotlin.jvm.functions.Function0) rememberedValue15, null, startRestartGroup, 0, 2);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1853135582);
                            startRestartGroup.endReplaceGroup();
                        }
                        if (((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getErrorRetryCount() <= 2 || ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getShowErrorHalfSheet()) {
                            z2 = true;
                            startRestartGroup.startReplaceGroup(1854003582);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1853322233);
                            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Camera2StreamConfigurationMap, 7, null);
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getBottomCenter(), false);
                            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor2);
                            } else {
                                startRestartGroup.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_search_this_area_button, startRestartGroup, 0);
                            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                            com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
                            androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "search_this_area_button");
                            boolean changedInstance11 = startRestartGroup.changedInstance(mapViewModel4);
                            java.lang.Object rememberedValue16 = startRestartGroup.rememberedValue();
                            if (changedInstance11 || rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue16 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt.$r8$lambda$vTEdwUDMy1WsfWSMOVSTsCqGDvM(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue16);
                            }
                            z2 = true;
                            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue16, stringResource3, testTag3, null, null, primary, small, false, false, startRestartGroup, 1769856, 408);
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1850305499);
                        androidx.compose.ui.Modifier testTag4 = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), "map_screen_loading");
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), r5);
                        int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r5));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag4);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor3);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceGroup();
                        markerUtils6 = markerUtils5;
                        z2 = true;
                        function14 = function13;
                        i5 = 2;
                    }
                    z3 = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getErrorRetryCount() <= i5 ? z2 : false;
                    final int errorRetryCount = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getErrorRetryCount();
                    com.paypal.pds.core.Icon.Warning warning = com.paypal.pds.core.Icon.Warning.INSTANCE;
                    java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_heading, startRestartGroup, 0);
                    if (z3) {
                        startRestartGroup.startReplaceGroup(1854651513);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_messagetryagain, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1854544408);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_messagetrymaxout, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    java.lang.String str = stringResource;
                    if (z3) {
                        startRestartGroup.startReplaceGroup(1854901466);
                        stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_buttontryagain, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1854802080);
                        stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_buttonok, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    changed5 = startRestartGroup.changed(z3);
                    changed6 = startRestartGroup.changed(errorRetryCount);
                    changedInstance3 = startRestartGroup.changedInstance(mapViewModel4);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!(changed5 | changed6 | changedInstance3) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt.$r8$lambda$S20FMTCLcbN4HWIRs4rk4DRG4Xw(z3, errorRetryCount, mapViewModel4);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue6;
                    changedInstance4 = startRestartGroup.changedInstance(mapViewModel4);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (!changedInstance4 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt.m13473$r8$lambda$jr6zVSGwjdKeNNf8zM4SeUs0y8(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue7;
                    changedInstance5 = startRestartGroup.changedInstance(mapViewModel4);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (!changedInstance5 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt.m13472$r8$lambda$LeRUVfVs7mXOHc9ITDCvv3v36A(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    com.paypal.oslo.feature.cashin.ui.components.CashInActionHalfSheetKt.CashInActionHalfSheet(bottomSheetController, warning, stringResource4, str, stringResource2, function02, function03, null, (kotlin.jvm.functions.Function0) rememberedValue8, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 48, 128);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    markerUtils3 = markerUtils6;
                    mapViewModel3 = mapViewModel4;
                    function12 = function14;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                z = false;
                markerUtils4 = markerUtils2;
            }
            function13 = function1;
            iMapComponent2 = defaultMapComponent;
            i4 = i3;
            mapViewModel4 = mapViewModel2;
            markerUtils5 = markerUtils4;
            r5 = z;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(mapViewModel4.getUiState(), null, startRestartGroup, r5, 1);
            android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            boolean showErrorHalfSheet3 = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getShowErrorHalfSheet();
            long errorEventId2 = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getErrorEventId();
            changed = startRestartGroup.changed(collectAsState);
            changedInstance = startRestartGroup.changedInstance(bottomSheetController2);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!(changed | changedInstance)) {
            }
            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$CashInMapScreen$2$1(bottomSheetController2, collectAsState, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(showErrorHalfSheet3), java.lang.Long.valueOf(errorEventId2), (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, r5);
            boolean isLoading2 = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).isLoading();
            boolean showErrorHalfSheet22 = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getShowErrorHalfSheet();
            changed2 = startRestartGroup.changed(collectAsState);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$CashInMapScreen$3$1(collectAsState, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(isLoading2), java.lang.Boolean.valueOf(showErrorHalfSheet22), (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, r5);
            java.lang.String error2 = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getError();
            changed3 = startRestartGroup.changed(collectAsState);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$CashInMapScreen$4$1(collectAsState, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(error2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (int) r5);
            java.lang.String searchError2 = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getSearchError();
            changed4 = startRestartGroup.changed(collectAsState);
            changedInstance2 = startRestartGroup.changedInstance(context2);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!(changed4 | changedInstance2)) {
            }
            rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$CashInMapScreen$5$1(collectAsState, context2, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(searchError2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, (int) r5);
            int i92 = i4;
            androidx.compose.ui.Modifier testTag5 = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), "cash_in_map_screen");
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy4 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), r5);
            int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r5));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag5);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, maybeCachedBoxMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance4 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            if (((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).isLoading()) {
            }
            if (((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getErrorRetryCount() <= i5) {
            }
            final int errorRetryCount2 = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) collectAsState.getValue()).getErrorRetryCount();
            com.paypal.pds.core.Icon.Warning warning2 = com.paypal.pds.core.Icon.Warning.INSTANCE;
            java.lang.String stringResource42 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_genericerror_heading, startRestartGroup, 0);
            if (z3) {
            }
            java.lang.String str2 = stringResource;
            if (z3) {
            }
            changed5 = startRestartGroup.changed(z3);
            changed6 = startRestartGroup.changed(errorRetryCount2);
            changedInstance3 = startRestartGroup.changedInstance(mapViewModel4);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!(changed5 | changed6 | changedInstance3)) {
            }
            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt.$r8$lambda$S20FMTCLcbN4HWIRs4rk4DRG4Xw(z3, errorRetryCount2, mapViewModel4);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue6);
            kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) rememberedValue6;
            changedInstance4 = startRestartGroup.changedInstance(mapViewModel4);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt.m13473$r8$lambda$jr6zVSGwjdKeNNf8zM4SeUs0y8(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue7);
            kotlin.jvm.functions.Function0 function032 = (kotlin.jvm.functions.Function0) rememberedValue7;
            changedInstance5 = startRestartGroup.changedInstance(mapViewModel4);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (!changedInstance5) {
            }
            rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt.m13472$r8$lambda$LeRUVfVs7mXOHc9ITDCvv3v36A(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue8);
            com.paypal.oslo.feature.cashin.ui.components.CashInActionHalfSheetKt.CashInActionHalfSheet(bottomSheetController2, warning2, stringResource42, str2, stringResource2, function022, function032, null, (kotlin.jvm.functions.Function0) rememberedValue8, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 48, 128);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            markerUtils3 = markerUtils6;
            mapViewModel3 = mapViewModel4;
            function12 = function14;
        } else {
            startRestartGroup.skipToGroupEnd();
            markerUtils3 = markerUtils;
            function12 = function1;
            iMapComponent2 = defaultMapComponent;
            mapViewModel3 = mapViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils markerUtils7 = markerUtils3;
            final com.paypal.oslo.feature.cashin.ui.components.IMapComponent iMapComponent3 = iMapComponent2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt.$r8$lambda$sA8eOE4t83CqAgbj5THectmU5pU(com.paypal.oslo.core.navigation.AppNavigator.this, mapViewModel3, markerUtils7, iMapComponent3, function12, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "Navigating to method selection screen", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("storeName", cashInStore.getName()), kotlin.TuplesKt.to("storeId", cashInStore.getId()), kotlin.TuplesKt.to("partnerId", cashInStore.getPartnerId()), kotlin.TuplesKt.to("retailerId", cashInStore.getRetailerId())), 2, null);
        if (kotlin.text.StringsKt.isBlank(cashInStore.getPartnerId()) || kotlin.text.StringsKt.isBlank(cashInStore.getRetailerId())) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "Cannot navigate to method selection screen - missing IDs", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("storeName", cashInStore.getName()), kotlin.TuplesKt.to("partnerId", cashInStore.getPartnerId()), kotlin.TuplesKt.to("retailerId", cashInStore.getRetailerId())), 2, null);
            return false;
        }
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.cashin.ui.screens.CashInMapScreenKt.$r8$lambda$vuJfgpIqZc9pZdUiLvYESjStc8Q(com.paypal.oslo.feature.cashin.domain.model.CashInStore.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return true;
    }

    /* renamed from: $r8$lambda$1Ob-djTqj0Lm5dptUpFVJf8a52c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13470$r8$lambda$1ObdjTqj0Lm5dptUpFVJf8a52c(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel, com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInStore, "");
        mapViewModel.onLocationSelected(cashInStore);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CahlDu4PMJVatUSRGyrpbKA3GB0(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel) {
        mapViewModel.dismissNothingNearbyDialog();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DZFHZvvmc4N6xKcLB3mxVEHrqPU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInStore, "");
        if (!getHighSpeedVideoSizes(appNavigator, cashInStore)) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "Unable to load store details. Please try another store.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("store_id", cashInStore.getId())), null, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KhN-sPfuSPcId9oj6_3aoKSYp8I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13471$r8$lambda$KhNsPfuSPcId9oj6_3aoKSYp8I(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel) {
        mapViewModel.clearSelectedLocation();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LeRUVfVs7mXOHc9ITDCvv3v3-6A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13472$r8$lambda$LeRUVfVs7mXOHc9ITDCvv3v36A(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel) {
        mapViewModel.dismissErrorHalfSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$S20FMTCLcbN4HWIRs4rk4DRG4Xw(boolean z, int i, com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "Error half-sheet button clicked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hasExceededRetries", java.lang.Boolean.valueOf(z)), kotlin.TuplesKt.to("currentRetryCount", java.lang.Integer.valueOf(i))), null, 4, null);
        if (i > 2) {
            mapViewModel.dismissErrorHalfSheet();
        } else {
            mapViewModel.retryFetchStores();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g43RzAa8Z_Qo_fh1YTuA1dXo6t8(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel, kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mapViewModel.searchLocation(str);
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$j7rd2sVOR7k2M1DV19Kx1ksDvfM(androidx.compose.runtime.State state, com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        com.paypal.oslo.feature.cashin.domain.model.CashInStore selectedLocation = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) state.getValue()).getSelectedLocation();
        if (selectedLocation != null) {
            mapViewModel.clearSelectedLocation();
            if (!getHighSpeedVideoSizes(appNavigator, selectedLocation)) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "Unable to load store details. Please try another store.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("store_id", selectedLocation.getId())), null, 4, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jr6zVSGwjdKeNNf8zM4SeU-s0y8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13473$r8$lambda$jr6zVSGwjdKeNNf8zM4SeUs0y8(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel) {
        mapViewModel.dismissErrorHalfSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rFtpSgPddnJuQixaPiKC5HGXddY(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sA8eOE4t83CqAgbj5THectmU5pU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel, com.paypal.oslo.feature.cashin.ui.utils.MarkerUtils markerUtils, com.paypal.oslo.feature.cashin.ui.components.IMapComponent iMapComponent, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CashInMapScreen(appNavigator, mapViewModel, markerUtils, iMapComponent, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vTEdwUDMy1WsfWSMOVSTsCqGDvM(com.paypal.oslo.feature.cashin.ui.viewmodel.MapViewModel mapViewModel) {
        mapViewModel.refresh();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vuJfgpIqZc9pZdUiLvYESjStc8Q(com.paypal.oslo.feature.cashin.domain.model.CashInStore cashInStore, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.cashin.api.navigation.MethodSelectionDestination(cashInStore.getPartnerId(), cashInStore.getRetailerId(), cashInStore.getAddress().getLine1(), cashInStore.getDistance()));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState access$CashInMapScreen$lambda$1(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.cashin.ui.viewmodel.MapUiState) state.getValue();
    }
}
