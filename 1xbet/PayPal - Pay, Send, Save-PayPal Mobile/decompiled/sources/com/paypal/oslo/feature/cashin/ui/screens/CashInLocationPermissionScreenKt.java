package com.paypal.oslo.feature.cashin.ui.screens;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\u001aU\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001aS\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0015²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, d2 = {"CashInLocationPermissionScreen", "", "onLocationGrant", "Lkotlin/Function0;", "onSeeStoresClick", "onCloseClick", "modifier", "Landroidx/compose/ui/Modifier;", "source", "", "viewModel", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/LocationPermissionViewModel;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/paypal/oslo/feature/cashin/ui/viewmodel/LocationPermissionViewModel;Landroidx/compose/runtime/Composer;II)V", "CashInLocationPermissionScreenContent", "permissionState", "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/LocationPermissionState;", "onEnableLocationClick", "(Lcom/paypal/oslo/feature/cashin/ui/viewmodel/LocationPermissionState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "LocationPermissionScreenNotRequestedPreview", "(Landroidx/compose/runtime/Composer;I)V", "LocationPermissionScreenGrantedButDisabledPreview", "cash-in_prodRelease", "isLocationEnabled", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CashInLocationPermissionScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:108:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CashInLocationPermissionScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.ui.Modifier modifier, java.lang.String str, com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str2;
        com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str3;
        final com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        final com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel4;
        java.lang.String str4;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        boolean changedInstance2;
        boolean changedInstance3;
        boolean changedInstance4;
        java.lang.Object rememberedValue2;
        boolean changed;
        boolean changed2;
        boolean z;
        com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$CashInLocationPermissionScreen$2$1 rememberedValue3;
        boolean changed3;
        boolean changedInstance5;
        boolean changedInstance6;
        boolean changedInstance7;
        boolean changed4;
        boolean z2;
        java.lang.Object rememberedValue4;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1747604694);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                str2 = str;
                i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        locationPermissionViewModel2 = locationPermissionViewModel;
                        if (startRestartGroup.changedInstance(locationPermissionViewModel2)) {
                            i5 = 131072;
                            i3 |= i5;
                        }
                    } else {
                        locationPermissionViewModel2 = locationPermissionViewModel;
                    }
                    i5 = 65536;
                    i3 |= i5;
                } else {
                    locationPermissionViewModel2 = locationPermissionViewModel;
                }
                if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        modifier4 = modifier2;
                    } else {
                        androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            str2 = "";
                        }
                        if ((i2 & 32) != 0) {
                            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                            }
                            androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                            if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                                empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                            }
                            i3 &= -458753;
                            locationPermissionViewModel4 = (com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                            modifier4 = companion;
                            str4 = str2;
                            int i7 = i3;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1747604694, i7, -1, "com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreen (CashInLocationPermissionScreen.kt:100)");
                            }
                            final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                            final androidx.view.LifecycleOwner lifecycleOwner = (androidx.view.LifecycleOwner) startRestartGroup.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                            final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(locationPermissionViewModel4.getPermissionState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                            final androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(locationPermissionViewModel4.getLocationEnabledState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                            androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions requestMultiplePermissions = new androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions();
                            changedInstance = startRestartGroup.changedInstance(locationPermissionViewModel4);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt.$r8$lambda$OO2hIpsS85aUNekOGNWkRTIW1CU(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel.this, (java.util.Map) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            final androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0);
                            changedInstance2 = startRestartGroup.changedInstance(locationPermissionViewModel4);
                            changedInstance3 = startRestartGroup.changedInstance(context);
                            changedInstance4 = startRestartGroup.changedInstance(lifecycleOwner);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!(changedInstance2 | changedInstance3 | changedInstance4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$$ExternalSyntheticLambda13
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt.$r8$lambda$1p6JzB5WJZ2fF_ghjtRpSJ2Io6o(androidx.view.LifecycleOwner.this, locationPermissionViewModel4, context, (androidx.compose.runtime.DisposableEffectScope) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
                            com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState locationPermissionState = (com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState) collectAsStateWithLifecycle.getValue();
                            boolean booleanValue = ((java.lang.Boolean) collectAsStateWithLifecycle2.getValue()).booleanValue();
                            changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                            changed2 = startRestartGroup.changed(collectAsStateWithLifecycle2);
                            int i8 = i7 & 14;
                            z = i8 != 4;
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!(changed | changed2 | z) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$CashInLocationPermissionScreen$2$1(function0, collectAsStateWithLifecycle, collectAsStateWithLifecycle2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(locationPermissionState, java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, 0);
                            com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState locationPermissionState2 = (com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState) collectAsStateWithLifecycle.getValue();
                            changed3 = startRestartGroup.changed(collectAsStateWithLifecycle);
                            changedInstance5 = startRestartGroup.changedInstance(rememberLauncherForActivityResult);
                            changedInstance6 = startRestartGroup.changedInstance(locationPermissionViewModel4);
                            changedInstance7 = startRestartGroup.changedInstance(context);
                            changed4 = startRestartGroup.changed(collectAsStateWithLifecycle2);
                            z2 = i8 == 4;
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!(changed3 | changedInstance5 | changedInstance6 | changedInstance7 | changed4 | z2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                final com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel5 = locationPermissionViewModel4;
                                kotlin.jvm.functions.Function0 function04 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt.m13466$r8$lambda$x5BQUVQwhVYB5v07wSwhXTcsZw(androidx.view.compose.ManagedActivityResultLauncher.this, locationPermissionViewModel5, context, function0, collectAsStateWithLifecycle, collectAsStateWithLifecycle2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(function04);
                                rememberedValue4 = function04;
                            }
                            com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel6 = locationPermissionViewModel4;
                            composer2 = startRestartGroup;
                            CashInLocationPermissionScreenContent(locationPermissionState2, (kotlin.jvm.functions.Function0) rememberedValue4, function02, function03, modifier4, str4, composer2, (i7 << 3) & 524160, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            locationPermissionViewModel3 = locationPermissionViewModel6;
                            modifier3 = modifier4;
                            str3 = str4;
                        } else {
                            modifier4 = companion;
                        }
                    }
                    str4 = str2;
                    locationPermissionViewModel4 = locationPermissionViewModel2;
                    int i72 = i3;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    final android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    final androidx.view.LifecycleOwner lifecycleOwner2 = (androidx.view.LifecycleOwner) startRestartGroup.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    final androidx.compose.runtime.State collectAsStateWithLifecycle3 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(locationPermissionViewModel4.getPermissionState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    final androidx.compose.runtime.State collectAsStateWithLifecycle22 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(locationPermissionViewModel4.getLocationEnabledState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions requestMultiplePermissions2 = new androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions();
                    changedInstance = startRestartGroup.changedInstance(locationPermissionViewModel4);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt.$r8$lambda$OO2hIpsS85aUNekOGNWkRTIW1CU(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel.this, (java.util.Map) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    final androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult2 = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions2, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0);
                    changedInstance2 = startRestartGroup.changedInstance(locationPermissionViewModel4);
                    changedInstance3 = startRestartGroup.changedInstance(context2);
                    changedInstance4 = startRestartGroup.changedInstance(lifecycleOwner2);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!(changedInstance2 | changedInstance3 | changedInstance4)) {
                    }
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt.$r8$lambda$1p6JzB5WJZ2fF_ghjtRpSJ2Io6o(androidx.view.LifecycleOwner.this, locationPermissionViewModel4, context2, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner2, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
                    com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState locationPermissionState3 = (com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState) collectAsStateWithLifecycle3.getValue();
                    boolean booleanValue2 = ((java.lang.Boolean) collectAsStateWithLifecycle22.getValue()).booleanValue();
                    changed = startRestartGroup.changed(collectAsStateWithLifecycle3);
                    changed2 = startRestartGroup.changed(collectAsStateWithLifecycle22);
                    int i82 = i72 & 14;
                    if (i82 != 4) {
                    }
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!(changed | changed2 | z)) {
                    }
                    rememberedValue3 = new com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$CashInLocationPermissionScreen$2$1(function0, collectAsStateWithLifecycle3, collectAsStateWithLifecycle22, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(locationPermissionState3, java.lang.Boolean.valueOf(booleanValue2), (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, 0);
                    com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState locationPermissionState22 = (com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState) collectAsStateWithLifecycle3.getValue();
                    changed3 = startRestartGroup.changed(collectAsStateWithLifecycle3);
                    changedInstance5 = startRestartGroup.changedInstance(rememberLauncherForActivityResult2);
                    changedInstance6 = startRestartGroup.changedInstance(locationPermissionViewModel4);
                    changedInstance7 = startRestartGroup.changedInstance(context2);
                    changed4 = startRestartGroup.changed(collectAsStateWithLifecycle22);
                    if (i82 == 4) {
                    }
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!(changed3 | changedInstance5 | changedInstance6 | changedInstance7 | changed4 | z2)) {
                    }
                    final com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel52 = locationPermissionViewModel4;
                    kotlin.jvm.functions.Function0 function042 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt.m13466$r8$lambda$x5BQUVQwhVYB5v07wSwhXTcsZw(androidx.view.compose.ManagedActivityResultLauncher.this, locationPermissionViewModel52, context2, function0, collectAsStateWithLifecycle3, collectAsStateWithLifecycle22);
                        }
                    };
                    startRestartGroup.updateRememberedValue(function042);
                    rememberedValue4 = function042;
                    com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel62 = locationPermissionViewModel4;
                    composer2 = startRestartGroup;
                    CashInLocationPermissionScreenContent(locationPermissionState22, (kotlin.jvm.functions.Function0) rememberedValue4, function02, function03, modifier4, str4, composer2, (i72 << 3) & 524160, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    locationPermissionViewModel3 = locationPermissionViewModel62;
                    modifier3 = modifier4;
                    str3 = str4;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    str3 = str2;
                    locationPermissionViewModel3 = locationPermissionViewModel2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt.m13465$r8$lambda$e17Z30ilu5hYn_9fNBTfGbKSro(kotlin.jvm.functions.Function0.this, function02, function03, modifier3, str3, locationPermissionViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str2 = str;
            if ((196608 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        str2 = str;
        if ((196608 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0626  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CashInLocationPermissionScreenContent(final com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState locationPermissionState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.ui.Modifier modifier, java.lang.String str, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationPermissionState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(334913508);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(locationPermissionState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changed(str) ? 131072 : 65536;
                i5 = i3;
                if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    str2 = str;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.lang.String str3 = i4 != 0 ? "" : str;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(334913508, i5, -1, "com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenContent (CashInLocationPermissionScreen.kt:194)");
                    }
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "Rendering Location Permission Screen with state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", locationPermissionState)), null, 4, null);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    boolean z = (458752 & i5) == 131072;
                    com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$CashInLocationPermissionScreenContent$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$CashInLocationPermissionScreenContent$1$1(str3, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                    androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing16());
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getEnd(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1707paddingVpY3zN4);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    int i7 = i5 >> 6;
                    java.lang.String str4 = str3;
                    androidx.compose.ui.Modifier modifier5 = modifier4;
                    com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.Close.INSTANCE, function03, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), "cash_in_close_button"), com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, null, null, null, false, false, startRestartGroup, (i7 & 112) | 3078, 496);
                    startRestartGroup.endNode();
                    androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.INSTANCE.getLOCATION_PERMISSION_MODULE()), "cash_in_location_permission_content");
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                    int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor4);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.pds.components.AvatarKt.Avatar(com.paypal.pds.core.Icon.MapPin.INSTANCE.getAvatarSource(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "cash_in_location_permission_icon"), com.paypal.pds.components.AvatarSize.XLarge.INSTANCE, null, null, null, startRestartGroup, (com.paypal.pds.components.AvatarSize.XLarge.$stable << 6) | 48, 56);
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                    int hashCode5 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor5);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl5, java.lang.Integer.valueOf(hashCode5), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_location_permission_title, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "cash_in_location_permission_title"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 432, 6, 1000);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_location_permission_description, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "cash_in_location_permission_description"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 432, 6, 1000);
                    startRestartGroup.endNode();
                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "cash_in_location_permission_actions");
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy4 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                    int hashCode6 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier6 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor6 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor6);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl6 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, columnMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, currentCompositionLocalMap6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl6, java.lang.Integer.valueOf(hashCode6), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, materializeModifier6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance4 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_location_permission_enable_button, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing20(), com.paypal.pds.core.ConstantsKt.getSpacing8()), com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.INSTANCE.getENABLE_LOCATION_BUTTON()), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.PRODUCT, com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "grant_permission"))), "enable_location_button"), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, ((i5 >> 3) & 14) | 1769472, 408);
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.InlineButtonKt.InlineButton(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_location_permission_see_stores_button, composer2, 0), androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.INSTANCE.getSEE_STORES_LIST_LINK()), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.PRODUCT, com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "grant_permission"))), "see_stores_list_button"), null, null, false, composer2, i7 & 14, 56);
                    composer2.endNode();
                    composer2.endNode();
                    composer2.endNode();
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    str2 = str4;
                    modifier3 = modifier5;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt.$r8$lambda$_8FzH8Y3ONuxWSEqcZ6_UzW8RFI(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState.this, function0, function02, function03, modifier3, str2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 = i3;
            if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i3;
        if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$-Oytrx10rMjsFLqF8iCt7mrAGl8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13459$r8$lambda$Oytrx10rMjsFLqF8iCt7mrAGl8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-949052969);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-949052969, updateChangedFlags, -1, "com.paypal.oslo.feature.cashin.ui.screens.LocationPermissionScreenNotRequestedPreview (CashInLocationPermissionScreen.kt:333)");
            }
            com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState locationPermissionState = com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState.NOT_REQUESTED;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            CashInLocationPermissionScreenContent(locationPermissionState, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, null, null, startRestartGroup, 3510, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt.m13459$r8$lambda$Oytrx10rMjsFLqF8iCt7mrAGl8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$1p6JzB5WJZ2fF_ghjtRpSJ2Io6o(final androidx.view.LifecycleOwner lifecycleOwner, final com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel, final android.content.Context context, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        final androidx.view.LifecycleEventObserver lifecycleEventObserver = new androidx.view.LifecycleEventObserver() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$$ExternalSyntheticLambda3
            @Override // androidx.view.LifecycleEventObserver
            public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt.$r8$lambda$5jztXRs3l61exHBEfIDAIlxELFg(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel.this, context, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$CashInLocationPermissionScreen$lambda$3$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.view.LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    public static /* synthetic */ void $r8$lambda$5jztXRs3l61exHBEfIDAIlxELFg(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel, android.content.Context context, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event == androidx.lifecycle.Lifecycle.Event.ON_RESUME) {
            locationPermissionViewModel.checkAndUpdatePermissionStatus(context);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OO2hIpsS85aUNekOGNWkRTIW1CU(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel, java.util.Map map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("android.permission.ACCESS_FINE_LOCATION");
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (kotlin.jvm.internal.Intrinsics.areEqual(obj, bool) || kotlin.jvm.internal.Intrinsics.areEqual(map.get("android.permission.ACCESS_COARSE_LOCATION"), bool)) {
            locationPermissionViewModel.onLocationPermissionGranted();
        } else {
            locationPermissionViewModel.onLocationPermissionDenied();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TLS9dENnenMQOOt3V-bw59NXGMY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13462$r8$lambda$TLS9dENnenMQOOt3Vbw59NXGMY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-849356258);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-849356258, updateChangedFlags, -1, "com.paypal.oslo.feature.cashin.ui.screens.LocationPermissionScreenGrantedButDisabledPreview (CashInLocationPermissionScreen.kt:346)");
            }
            com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState locationPermissionState = com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState.GRANTED;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            CashInLocationPermissionScreenContent(locationPermissionState, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, null, null, startRestartGroup, 3510, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.screens.CashInLocationPermissionScreenKt.m13462$r8$lambda$TLS9dENnenMQOOt3Vbw59NXGMY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_8FzH8Y3ONuxWSEqcZ6_UzW8RFI(com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState locationPermissionState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, androidx.compose.ui.Modifier modifier, java.lang.String str, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CashInLocationPermissionScreenContent(locationPermissionState, function0, function02, function03, modifier, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$e17Z3-0ilu5hYn_9fNBTfGbKSro, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13465$r8$lambda$e17Z30ilu5hYn_9fNBTfGbKSro(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, androidx.compose.ui.Modifier modifier, java.lang.String str, com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CashInLocationPermissionScreen(function0, function02, function03, modifier, str, locationPermissionViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$x5BQUVQwhV-YB5v07wSwhXTcsZw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13466$r8$lambda$x5BQUVQwhVYB5v07wSwhXTcsZw(androidx.view.compose.ManagedActivityResultLauncher managedActivityResultLauncher, com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionViewModel locationPermissionViewModel, android.content.Context context, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.State state, androidx.compose.runtime.State state2) {
        if (((com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState) state.getValue()) == com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState.NOT_REQUESTED) {
            managedActivityResultLauncher.launch(new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
        } else if (((com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState) state.getValue()) == com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState.DENIED) {
            locationPermissionViewModel.openAppSettings(context);
        } else if (((com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState) state.getValue()) == com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState.GRANTED && !((java.lang.Boolean) state2.getValue()).booleanValue()) {
            locationPermissionViewModel.openLocationSettings(context);
        } else {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState access$CashInLocationPermissionScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.cashin.ui.viewmodel.LocationPermissionState) state.getValue();
    }
}
