package com.paypal.oslo.feature.qrc.ui.showtopay.home;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a3\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"}, d2 = {"ShowToPayScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "userCountryCode", "", "viewModel", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayViewModel;Landroidx/compose/runtime/Composer;II)V", "ShowToPayContent", "uiModel", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayUiModel;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayEvent;", "permissionController", "Lcom/paypal/oslo/core/permission/ui/controller/PermissionController;", "(Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayUiModel;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/core/permission/ui/controller/PermissionController;Landroidx/compose/runtime/Composer;II)V", "qrc_prodRelease", "uiState", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/home/ShowToPayUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ShowToPayScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShowToPayScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel showToPayViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.String str2;
        com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel showToPayViewModel2;
        androidx.compose.runtime.Composer composer2;
        final java.lang.String str3;
        final com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel showToPayViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        int i6;
        com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel showToPayViewModel4;
        java.lang.String str4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1187327199);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str2 = str;
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    showToPayViewModel2 = showToPayViewModel;
                    if (startRestartGroup.changedInstance(showToPayViewModel2)) {
                        i7 = 256;
                        i3 |= i7;
                    }
                } else {
                    showToPayViewModel2 = showToPayViewModel;
                }
                i7 = 128;
                i3 |= i7;
            } else {
                showToPayViewModel2 = showToPayViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i6 = i3;
                    showToPayViewModel4 = showToPayViewModel2;
                    i4 = 0;
                    i5 = 1;
                    str4 = str2;
                } else {
                    java.lang.String str5 = i8 != 0 ? "US" : str2;
                    if ((i2 & 4) != 0) {
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
                        i4 = 0;
                        i5 = 1;
                        i6 = i3 & (-897);
                        str4 = str5;
                        showToPayViewModel4 = (com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    } else {
                        i4 = 0;
                        i5 = 1;
                        i6 = i3;
                        showToPayViewModel4 = showToPayViewModel2;
                        str4 = str5;
                    }
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1187327199, i6, -1, "com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreen (ShowToPayScreen.kt:79)");
                }
                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(showToPayViewModel4.getUiState(), null, startRestartGroup, i4, i5);
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_ppw_show_to_pay_desc_confirming_location, startRestartGroup, i4);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_ppw_show_to_pay_title_confirming_location, startRestartGroup, i4);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_ppw_show_to_pay_title_readiness, startRestartGroup, i4);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(showToPayViewModel4);
                boolean z = (i6 & 112) == 32;
                boolean changedInstance2 = startRestartGroup.changedInstance(context);
                com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((z | changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$1$1(showToPayViewModel4, str4, context, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                boolean changedInstance3 = startRestartGroup.changedInstance(showToPayViewModel4);
                boolean z2 = (i6 & 14) == 4;
                boolean changed = startRestartGroup.changed(stringResource2);
                boolean changed2 = startRestartGroup.changed(stringResource3);
                boolean changed3 = startRestartGroup.changed(stringResource);
                com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (((changedInstance3 | z2 | changed | changed2) || changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    composer2 = startRestartGroup;
                    rememberedValue2 = new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$2$1(showToPayViewModel4, appNavigator, stringResource2, stringResource3, stringResource, null);
                    composer2.updateRememberedValue(rememberedValue2);
                } else {
                    composer2 = startRestartGroup;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(showToPayViewModel4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, (i6 >> 6) & 14);
                com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState showToPayUiState = (com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState) collectAsState.getValue();
                if (showToPayUiState instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState.Initial) {
                    composer2.startReplaceGroup(1688526748);
                    composer2.endReplaceGroup();
                } else if (showToPayUiState instanceof com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState.Content) {
                    composer2.startReplaceGroup(1688606511);
                    com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiModel uiModel = ((com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiState.Content) showToPayUiState).getUiModel();
                    boolean changedInstance4 = composer2.changedInstance(showToPayViewModel4);
                    com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$3$1 rememberedValue3 = composer2.rememberedValue();
                    if (changedInstance4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$3$1(showToPayViewModel4);
                        composer2.updateRememberedValue(rememberedValue3);
                    }
                    ShowToPayContent(uiModel, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue3), null, composer2, 0, 4);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(1439940010);
                    composer2.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                str3 = str4;
                showToPayViewModel3 = showToPayViewModel4;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                str3 = str2;
                showToPayViewModel3 = showToPayViewModel2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt.$r8$lambda$qriQW9hRHUaYAbgrBVQ81yJG_SM(com.paypal.oslo.core.navigation.AppNavigator.this, str3, showToPayViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        str2 = str;
        if ((i & 384) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if ((r37 & 4) != 0) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShowToPayContent(final com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiModel showToPayUiModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent, kotlin.Unit> function1, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController2;
        com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController3;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showToPayUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-762229248);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(showToPayUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                permissionController2 = permissionController;
                if (startRestartGroup.changedInstance(permissionController2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                permissionController2 = permissionController;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            permissionController2 = permissionController;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    permissionController2 = com.paypal.oslo.core.permission.ui.controller.RememberPermissionControllerKt.rememberPermissionController(startRestartGroup, 0);
                    i3 &= -897;
                }
                int i5 = i3;
                permissionController3 = permissionController2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-762229248, i5, -1, "com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayContent (ShowToPayScreen.kt:150)");
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = com.paypal.oslo.feature.qrc.ui.utils.ShowToPayUtilsKt.generateQrCodeBitmap("https://paypal.com/pay/sample");
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final android.graphics.Bitmap bitmap = (android.graphics.Bitmap) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = com.paypal.oslo.feature.qrc.ui.utils.ShowToPayUtilsKt.generateBarcodeBitmap("https://paypal.com/pay/sample");
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) rememberedValue2;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue3;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue4;
                boolean showCountryPicker = showToPayUiModel.getShowCountryPicker();
                boolean changedInstance = startRestartGroup.changedInstance(showToPayUiModel);
                boolean changedInstance2 = startRestartGroup.changedInstance(bottomSheetController);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if ((changedInstance | changedInstance2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayContent$1$1(showToPayUiModel, bottomSheetController, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(showCountryPicker), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                boolean showPermissionRequest = showToPayUiModel.getShowPermissionRequest();
                boolean changedInstance3 = startRestartGroup.changedInstance(showToPayUiModel);
                boolean changedInstance4 = startRestartGroup.changedInstance(bottomSheetController2);
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if ((changedInstance3 | changedInstance4) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayContent$2$1(showToPayUiModel, bottomSheetController2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(showPermissionRequest), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 0);
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(180.0f), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 5, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_show_to_pay_title_qr, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 384, 6, 1002);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.CardStyle.Filled.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1852608348, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt.$r8$lambda$Zx3CFfywOiMfM3mdHf7sNlhAZ_g(bitmap, bitmap2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Filled.$stable << 9) | 805306374, 502);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                com.paypal.pds.components.CardStyle.Filled filled = com.paypal.pds.components.CardStyle.Filled.INSTANCE;
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                com.paypal.pds.components.CardStyle.Filled filled2 = filled;
                int i6 = i5 & 112;
                boolean z = i6 == 32;
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (z || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt.m17941$r8$lambda$nszyBpO5UM6A2K3LKPgekfskZg(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                com.paypal.pds.components.CardKt.Card(fillMaxWidth$default, null, null, filled2, (kotlin.jvm.functions.Function0) rememberedValue7, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-927007149, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt.$r8$lambda$KORFYpEr0VgSQ71IEN2ZMf74YlY(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Filled.$stable << 9) | 805306374, 486);
                startRestartGroup.endNode();
                java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> countries = showToPayUiModel.getCountries();
                java.lang.String selectedCountryCode = showToPayUiModel.getSelectedCountryCode();
                boolean z2 = i6 == 32;
                java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt.$r8$lambda$1aTlJCh0ogAz33g1V01e1f7Ju38(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue8;
                boolean z3 = i6 == 32;
                java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt.m17942$r8$lambda$sw2XmvSh3JeruA2UlSvfuQOtc(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwCountryPickerKt.PpwCountryPicker(bottomSheetController, countries, selectedCountryCode, function12, (kotlin.jvm.functions.Function0) rememberedValue9, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable);
                boolean z4 = i6 == 32;
                java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt.$r8$lambda$u3ZXTa5oq9JeZzrcPN6rD90O0x8(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue10;
                boolean z5 = i6 == 32;
                java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                if (z5 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt.$r8$lambda$QHz_KwYWlofxIFSXknQ_cky2ih4(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                com.paypal.oslo.feature.qrc.ui.showtopay.home.components.PpwPermissionRequestContentKt.PpwPermissionRequestContent(bottomSheetController2, function0, (kotlin.jvm.functions.Function0) rememberedValue11, permissionController3, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | ((i5 << 3) & 7168), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            permissionController3 = permissionController2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController4 = permissionController3;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt.$r8$lambda$hcVbZQqmklPYfq7FVULaFobNSuk(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiModel.this, function1, permissionController4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1aTlJCh0ogAz33g1V01e1f7Ju38(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryPhoneDetail, "");
        function1.invoke(new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.CountrySelected(countryPhoneDetail));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Igav5r-lQrfk4-U4hlE4QMM9gzY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17940$r8$lambda$Igav5rlQrfk4U4hlE4QMM9gzY(androidx.compose.ui.graphics.painter.Painter painter, com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiModel showToPayUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1678454526, i, -1, "com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayContent.<anonymous>.<anonymous>.<anonymous> (ShowToPayScreen.kt:244)");
            }
            androidx.compose.foundation.ImageKt.Image(painter, showToPayUiModel.getSelectedCountryName(), androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(48.0f)), (androidx.compose.ui.Alignment) null, (androidx.compose.ui.layout.ContentScale) null, 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, composer, androidx.compose.ui.graphics.painter.Painter.$stable | 384, 120);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KORFYpEr0VgSQ71IEN2ZMf74YlY(final com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiModel showToPayUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-927007149, i, -1, "com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayContent.<anonymous>.<anonymous> (ShowToPayScreen.kt:234)");
            }
            final androidx.compose.ui.graphics.painter.Painter rememberFlagPainter = com.paypal.pds.core.FlagKt.rememberFlagPainter(showToPayUiModel.getSelectedCountryCode(), com.paypal.pds.core.FlagSize.Large.INSTANCE, composer, com.paypal.pds.core.FlagSize.Large.$stable << 3, 0);
            com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(showToPayUiModel.getSelectedCountryName(), null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_show_to_pay_txt_current_location, composer, 0), null, null, false, false, com.paypal.oslo.feature.qrc.ui.showtopay.home.ComposableSingletons$ShowToPayScreenKt.INSTANCE.m17939getLambda$1551545539$qrc_prodRelease(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1678454526, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt.m17940$r8$lambda$Igav5rlQrfk4U4hlE4QMM9gzY(androidx.compose.ui.graphics.painter.Painter.this, showToPayUiModel, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), null, null, null, false, null, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing0()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing0()), null, null, false, composer, 113246208, 0, 474746);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QHz_KwYWlofxIFSXknQ_cky2ih4(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.DismissPermissionRequest.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Zx3CFfywOiMfM3mdHf7sNlhAZ_g(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1852608348, i, -1, "com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayContent.<anonymous>.<anonymous> (ShowToPayScreen.kt:195)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing24());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1706padding3ABfNKs);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            if (bitmap == null) {
                composer.startReplaceGroup(-1468454625);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1468454624);
                androidx.compose.foundation.ImageKt.m1335Image5hnEew(androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(bitmap), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_ppw_show_to_pay_title_qr_code_pay, composer, 0), androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(250.0f)), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12())), null, androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), 0.0f, null, 0, composer, 24576, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                composer.endReplaceGroup();
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            if (bitmap2 == null) {
                composer.startReplaceGroup(-1467899911);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1467899910);
                androidx.compose.foundation.ImageKt.m1335Image5hnEew(androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(bitmap2), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_show_to_pay_title_qr, composer, 0), androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(50.0f)), null, androidx.compose.ui.layout.ContentScale.INSTANCE.getFillBounds(), 0.0f, null, 0, composer, 24960, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hcVbZQqmklPYfq7FVULaFobNSuk(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayUiModel showToPayUiModel, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ShowToPayContent(showToPayUiModel, function1, permissionController, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nszyB-pO5UM6A2K3LKPgekfskZg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17941$r8$lambda$nszyBpO5UM6A2K3LKPgekfskZg(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.EditLocationClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qriQW9hRHUaYAbgrBVQ81yJG_SM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel showToPayViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ShowToPayScreen(appNavigator, str, showToPayViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$s-w2XmvSh3JeruA2UlSvfu-QOtc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17942$r8$lambda$sw2XmvSh3JeruA2UlSvfuQOtc(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.DismissCountryPicker.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$u3ZXTa5oq9JeZzrcPN6rD90O0x8(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.PermissionGranted.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
