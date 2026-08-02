package com.paypal.oslo.feature.cashin.ui.screens;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0013\b\u0002\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\f2\u0013\b\u0002\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\fH\u0001¢\u0006\u0002\u0010\u000e\u001a8\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\fH\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, d2 = {"CashInMainScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "initialTab", "", "viewModel", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/MapContainerViewModel;", "locationPermissionViewModel", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/LocationPermissionViewModel;", "mapScreen", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "storesListScreen", "(Lcom/paypal/oslo/core/navigation/AppNavigator;ILcom/paypal/oslo/feature/cashin/ui/viewmodel/MapContainerViewModel;Lcom/paypal/oslo/feature/cashin/ui/viewmodel/LocationPermissionViewModel;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "MapScreenWithPermission", "mapScreenContent", "Lkotlin/Function1;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/cashin/ui/viewmodel/LocationPermissionViewModel;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "cash-in_prodRelease", "uiState", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/MapContainerUiState;", "permissionState", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/LocationPermissionState;", "isLocationEnabled", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CashInMainScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v21, types: [androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner] */
    /* JADX WARN: Type inference failed for: r8v9, types: [androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CashInMainScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerViewModel mapContainerViewModel, com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerViewModel mapContainerViewModel2;
        final com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel2;
        int i6;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        int i7;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24;
        final com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel3;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26;
        final com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerViewModel mapContainerViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i8;
        boolean z;
        int i9;
        int i10;
        final com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel4;
        int i11;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> rememberComposableLambda;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty2;
        ?? r6;
        int i12;
        androidx.view.LifecycleOwner lifecycleOwner;
        final android.content.Context context;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28;
        java.lang.Object obj;
        int i13;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        ?? startRestartGroup = composer.startRestartGroup(1862427876);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 = i;
            i4 |= startRestartGroup.changed(i5) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    mapContainerViewModel2 = mapContainerViewModel;
                    if (startRestartGroup.changedInstance(mapContainerViewModel2)) {
                        i13 = 256;
                        i4 |= i13;
                    }
                } else {
                    mapContainerViewModel2 = mapContainerViewModel;
                }
                i13 = 128;
                i4 |= i13;
            } else {
                mapContainerViewModel2 = mapContainerViewModel;
            }
            if ((i2 & 3072) != 0) {
                locationPermissionViewModel2 = locationPermissionViewModel;
                i4 |= ((i3 & 8) == 0 && startRestartGroup.changedInstance(locationPermissionViewModel2)) ? 2048 : 1024;
            } else {
                locationPermissionViewModel2 = locationPermissionViewModel;
            }
            i6 = i3 & 16;
            if (i6 == 0) {
                i4 |= 24576;
                function23 = function2;
            } else {
                function23 = function2;
                if ((i2 & 24576) == 0) {
                    i4 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
                }
            }
            i7 = i3 & 32;
            if (i7 == 0) {
                i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function24 = function22;
            } else {
                function24 = function22;
                if ((196608 & i2) == 0) {
                    i4 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
                }
            }
            if (!startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    i8 = i5;
                    r6 = 1;
                    rememberComposableLambda = function24;
                    function27 = function23;
                    i11 = i4;
                    mapContainerViewModel3 = mapContainerViewModel2;
                } else {
                    i8 = i14 != 0 ? 0 : i5;
                    if ((i3 & 4) != 0) {
                        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                        if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                            empty2 = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            empty2 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                        }
                        z = true;
                        i9 = i4 & (-897);
                        mapContainerViewModel3 = (com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty2, (androidx.compose.runtime.Composer) startRestartGroup, 0, 0);
                    } else {
                        z = true;
                        i9 = i4;
                        mapContainerViewModel3 = mapContainerViewModel2;
                    }
                    if ((i3 & 8) != 0) {
                        androidx.view.ViewModelStoreOwner current2 = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                        if (current2 == null) {
                            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory2 = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current2, startRestartGroup, 0);
                        if (current2 instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                            empty = ((androidx.view.HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                        } else {
                            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                        }
                        locationPermissionViewModel4 = (com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel.class), current2, (java.lang.String) null, createHiltViewModelFactory2, empty, (androidx.compose.runtime.Composer) startRestartGroup, 0, 0);
                        i10 = i9 & (-7169);
                    } else {
                        i10 = i9;
                        locationPermissionViewModel4 = locationPermissionViewModel;
                    }
                    androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda2 = i6 != 0 ? androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1972340224, z, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt.$r8$lambda$RPmvNE0syPUvEjTwlz5rqV0OKxE(com.paypal.oslo.core.navigation.AppNavigator.this, locationPermissionViewModel4, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    }, startRestartGroup, 54) : function2;
                    i11 = i10;
                    locationPermissionViewModel2 = locationPermissionViewModel4;
                    rememberComposableLambda = i7 != 0 ? androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1609606610, z, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt.$r8$lambda$ZspYYev3AtJedNkomRu_oztKBto(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    }, startRestartGroup, 54) : function22;
                    function27 = rememberComposableLambda2;
                    r6 = z;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1862427876, i11, -1, "com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreen (CashInMainScreen.kt:68)");
                }
                final androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(mapContainerViewModel3.getUiState(), null, startRestartGroup, 0, r6);
                final android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                final androidx.view.LifecycleOwner lifecycleOwner2 = (androidx.view.LifecycleOwner) startRestartGroup.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                boolean changedInstance = startRestartGroup.changedInstance(mapContainerViewModel3);
                boolean z2 = (i11 & 112) == 32 ? r6 : false;
                com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt$CashInMainScreen$3$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt$CashInMainScreen$3$1(mapContainerViewModel3, i8, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                int i15 = i11 >> 3;
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Integer.valueOf(i8), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, (androidx.compose.runtime.Composer) startRestartGroup, i15 & 14);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance2 = startRestartGroup.changedInstance(locationPermissionViewModel2);
                boolean changedInstance3 = startRestartGroup.changedInstance(context2);
                com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt$CashInMainScreen$4$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance2 | changedInstance3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt$CashInMainScreen$4$1(locationPermissionViewModel2, context2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, (androidx.compose.runtime.Composer) startRestartGroup, 6);
                boolean changedInstance4 = startRestartGroup.changedInstance(locationPermissionViewModel2);
                boolean changedInstance5 = startRestartGroup.changedInstance(context2);
                boolean changed = startRestartGroup.changed(collectAsState);
                boolean changedInstance6 = startRestartGroup.changedInstance(mapContainerViewModel3);
                boolean changedInstance7 = startRestartGroup.changedInstance(lifecycleOwner2);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (((changedInstance4 | changedInstance5 | changed | changedInstance6) || changedInstance7) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel5 = locationPermissionViewModel2;
                    i12 = i8;
                    lifecycleOwner = lifecycleOwner2;
                    context = context2;
                    final com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerViewModel mapContainerViewModel4 = mapContainerViewModel3;
                    function28 = function27;
                    obj = null;
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt.$r8$lambda$MC8YupX_VillwHZ08iLm0uZdfgs(androidx.view.LifecycleOwner.this, locationPermissionViewModel5, context2, mapContainerViewModel4, collectAsState, (androidx.compose.runtime.DisposableEffectScope) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(function1);
                    rememberedValue3 = function1;
                } else {
                    function28 = function27;
                    i12 = i8;
                    lifecycleOwner = lifecycleOwner2;
                    context = context2;
                    obj = null;
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue3, (androidx.compose.runtime.Composer) startRestartGroup, 0);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, (androidx.compose.runtime.Composer) startRestartGroup, 54, 2), "cash_in_main_screen");
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                int i16 = i11 & 14;
                boolean z3 = i16 == 4;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt.m13467$r8$lambda$PLhCnsEh19O6LfoQHVwCOyvIPs(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.feature.cashin.ui.components.CashInTopBarKt.CashInTopBar((kotlin.jvm.functions.Function0) rememberedValue4, androidx.compose.ui.Modifier.INSTANCE, startRestartGroup, 48, 0);
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                int selectedTab = ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState) collectAsState.getValue()).getSelectedTab();
                boolean changedInstance8 = startRestartGroup.changedInstance(locationPermissionViewModel2);
                boolean changedInstance9 = startRestartGroup.changedInstance(context);
                boolean z4 = i16 == 4;
                boolean changedInstance10 = startRestartGroup.changedInstance(mapContainerViewModel3);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if ((changedInstance10 | changedInstance8 | changedInstance9 | z4) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt.m13468$r8$lambda$Hp8c3ddN7mB4vs_R_74qOS7twg(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel.this, context, appNavigator, mapContainerViewModel3, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                com.paypal.oslo.feature.cashin.ui.components.CashInMainMenuKt.CashInMainMenu(null, selectedTab, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, 0, 1);
                int i17 = i11 >> 6;
                com.paypal.oslo.feature.cashin.ui.components.CashInContentContainerKt.CashInContentContainer(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj), mapContainerViewModel3, function28, rememberComposableLambda, startRestartGroup, (i15 & 112) | 6 | (i17 & 896) | (i17 & 7168), 0);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                locationPermissionViewModel3 = locationPermissionViewModel2;
                function26 = rememberComposableLambda;
                i5 = i12;
                function25 = function28;
            } else {
                startRestartGroup.skipToGroupEnd();
                locationPermissionViewModel3 = locationPermissionViewModel;
                function25 = function2;
                function26 = function22;
                mapContainerViewModel3 = mapContainerViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final int i18 = i5;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt.$r8$lambda$RwVgo4KCfNXXGee_zpWWR8Szy_I(com.paypal.oslo.core.navigation.AppNavigator.this, i18, mapContainerViewModel3, locationPermissionViewModel3, function25, function26, i2, i3, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 = i;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void MapScreenWithPermission(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel, kotlin.jvm.functions.Function3<? super com.paypal.oslo.core.navigation.AppNavigator, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationPermissionViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-713540404);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(locationPermissionViewModel) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                function3 = com.paypal.oslo.feature.cashin.ui.screens.ComposableSingletons$CashInMainScreenKt.INSTANCE.m13482getLambda$703896745$cash_in_prodRelease();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-713540404, i3, -1, "com.paypal.oslo.feature.cashin.ui.screens.MapScreenWithPermission (CashInMainScreen.kt:178)");
            }
            androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(locationPermissionViewModel.getPermissionState(), null, startRestartGroup, 0, 1);
            androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(locationPermissionViewModel.getLocationEnabledState(), null, startRestartGroup, 0, 1);
            if (((com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState) collectAsState.getValue()) == com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState.GRANTED && ((java.lang.Boolean) collectAsState2.getValue()).booleanValue()) {
                startRestartGroup.startReplaceGroup(-1288501557);
                function3.invoke(appNavigator, startRestartGroup, java.lang.Integer.valueOf((i3 & 14) | ((i3 >> 3) & 112)));
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1288460234);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final kotlin.jvm.functions.Function3<? super com.paypal.oslo.core.navigation.AppNavigator, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32 = function3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt.$r8$lambda$9v6g9rb6nIDh9K23KCt2VwtTlZo(com.paypal.oslo.core.navigation.AppNavigator.this, locationPermissionViewModel, function32, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-PLhCnsEh19O6LfoQHVwCOyvIPs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13467$r8$lambda$PLhCnsEh19O6LfoQHVwCOyvIPs(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt.$r8$lambda$nSvoGYt7VH9UyubnacKSjBBlRUE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9v6g9rb6nIDh9K23KCt2VwtTlZo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MapScreenWithPermission(appNavigator, locationPermissionViewModel, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Hp8c3dd-N7mB4vs_R_74qOS7twg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13468$r8$lambda$Hp8c3ddN7mB4vs_R_74qOS7twg(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel, android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerViewModel mapContainerViewModel, int i) {
        if (i == 0 && locationPermissionViewModel.checkAndUpdatePermissionStatus(context)) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt.m13469$r8$lambda$xMvK0OWcSdVHhAi83xEXa8pmSE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return kotlin.Unit.INSTANCE;
        }
        mapContainerViewModel.selectTab(i);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$MC8YupX_VillwHZ08iLm0uZdfgs(final androidx.view.LifecycleOwner lifecycleOwner, final com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel, final android.content.Context context, final com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerViewModel mapContainerViewModel, final androidx.compose.runtime.State state, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        final androidx.view.LifecycleEventObserver lifecycleEventObserver = new androidx.view.LifecycleEventObserver() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt$$ExternalSyntheticLambda9
            @Override // androidx.view.LifecycleEventObserver
            public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt.$r8$lambda$rNezwzHkNs0EJio7GhwwmCoxfak(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel.this, context, mapContainerViewModel, state, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreenKt$CashInMainScreen$lambda$5$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.view.LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RPmvNE0syPUvEjTwlz5rqV0OKxE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1972340224, i, -1, "com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreen.<anonymous> (CashInMainScreen.kt:62)");
            }
            MapScreenWithPermission(appNavigator, locationPermissionViewModel, null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RwVgo4KCfNXXGee_zpWWR8Szy_I(com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerViewModel mapContainerViewModel, com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        CashInMainScreen(appNavigator, i, mapContainerViewModel, locationPermissionViewModel, function2, function22, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZspYYev3AtJedNkomRu_oztKBto(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1609606610, i, -1, "com.paypal.oslo.feature.cashin.ui.screens.CashInMainScreen.<anonymous> (CashInMainScreen.kt:67)");
            }
            com.paypal.oslo.feature.cashin.ui.screens.CashInStoresListScreenKt.CashInStoresListScreen(appNavigator, null, null, null, composer, 0, 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nSvoGYt7VH9UyubnacKSjBBlRUE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$rNezwzHkNs0EJio7GhwwmCoxfak(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel, android.content.Context context, com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerViewModel mapContainerViewModel, androidx.compose.runtime.State state, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event == androidx.lifecycle.Lifecycle.Event.ON_RESUME && !locationPermissionViewModel.checkAndUpdatePermissionStatus(context) && ((com.paypal.oslo.feature.cashin.ui.viewmodel.MapContainerUiState) state.getValue()).getSelectedTab() == 1) {
            mapContainerViewModel.selectTab(0);
        }
    }

    /* renamed from: $r8$lambda$xMvK-0OWcSdVHhAi83xEXa8pmSE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13469$r8$lambda$xMvK0OWcSdVHhAi83xEXa8pmSE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.cashin.api.navigation.CashInLocationPermissionDestination(com.paypal.oslo.feature.cashin.domain.LocationConstants.SOURCE_TAB_CLICK));
        return kotlin.Unit.INSTANCE;
    }
}
