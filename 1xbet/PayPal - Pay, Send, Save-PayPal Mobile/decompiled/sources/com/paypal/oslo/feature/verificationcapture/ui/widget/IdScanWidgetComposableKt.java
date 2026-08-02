package com.paypal.oslo.feature.verificationcapture.ui.widget;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002"}, d2 = {"IdScanWidget", "", com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics.ACTION, "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetInterface;", "modifier", "Landroidx/compose/ui/Modifier;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "testViewModel", "", "(Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetInterface;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)V", "verification-capture_prodRelease", "renderState", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetRenderState;", "uiState", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState;", "hasShownWidget", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IdScanWidgetComposableKt {
    /* JADX WARN: Code restructure failed: missing block: B:78:0x023f, code lost:
    
        if (r2.changedInstance(r12) == false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0281  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.compose.runtime.SnapshotMutationPolicy, java.lang.Object, kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IdScanWidget(final com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface idScanWidgetInterface, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.Object obj, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator2;
        int i5;
        java.lang.Object obj2;
        final com.paypal.oslo.core.navigation.AppNavigator appNavigator3;
        final java.lang.Object obj3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.ScopeUpdateScope scopeUpdateScope;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        final com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig idScanWidgetConfig;
        com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetImpl idScanWidgetImpl;
        java.lang.Object obj4;
        ?? r14;
        int i6;
        int i7;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode;
        com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetImpl idScanWidgetImpl2;
        boolean z;
        com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$2$1 rememberedValue;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError error;
        java.lang.String stringResource;
        java.lang.String str;
        boolean changed;
        boolean z2;
        boolean changed2;
        com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$3$1 rememberedValue2;
        boolean changed3;
        boolean changedInstance;
        com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$4$1 rememberedValue3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idScanWidgetInterface, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(897236803);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(idScanWidgetInterface) : startRestartGroup.changedInstance(idScanWidgetInterface) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                appNavigator2 = appNavigator;
                i3 |= startRestartGroup.changed(appNavigator2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    obj2 = obj;
                    i3 |= startRestartGroup.changedInstance(obj2) ? 2048 : 1024;
                    if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        appNavigator3 = appNavigator2;
                        obj3 = obj2;
                    } else {
                        androidx.compose.ui.Modifier modifier3 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        com.paypal.oslo.core.navigation.AppNavigator appNavigator4 = i4 != 0 ? null : appNavigator2;
                        java.lang.Object obj5 = i5 != 0 ? null : obj2;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(897236803, i3, -1, "com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidget (IdScanWidgetComposable.kt:83)");
                        }
                        androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(idScanWidgetInterface.getRenderState(), null, startRestartGroup, 0, 1);
                        com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetImpl idScanWidgetImpl3 = (com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetImpl) idScanWidgetInterface;
                        com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig config = ((com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState) collectAsState.getValue()).getConfig();
                        if (config != null) {
                            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                            boolean changed4 = startRestartGroup.changed(config);
                            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (changed4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                java.lang.String flowName = config.getFlowName();
                                java.lang.String documentType = config.getDocumentType();
                                java.lang.String documentSide = config.getDocumentSide();
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("ManualUploadViewModel_");
                                sb.append(flowName);
                                sb.append("_");
                                sb.append(documentType);
                                sb.append("_");
                                sb.append(documentSide);
                                rememberedValue4 = sb.toString();
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            java.lang.String str2 = (java.lang.String) rememberedValue4;
                            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel manualUploadViewModel = obj5 instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel ? (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel) obj5 : null;
                            if (manualUploadViewModel == null) {
                                startRestartGroup.startReplaceGroup(2001541477);
                                if (current == null) {
                                    throw new java.lang.IllegalArgumentException("No ViewModelStoreOwner found".toString());
                                }
                                androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                                if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                                    empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                                }
                                idScanWidgetConfig = config;
                                i6 = -1;
                                obj4 = obj5;
                                idScanWidgetImpl = idScanWidgetImpl3;
                                r14 = 0;
                                manualUploadViewModel = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel.class), current, str2, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                idScanWidgetConfig = config;
                                idScanWidgetImpl = idScanWidgetImpl3;
                                obj4 = obj5;
                                r14 = 0;
                                i6 = -1;
                                startRestartGroup.startReplaceGroup(-1043814198);
                                startRestartGroup.endReplaceGroup();
                            }
                            androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(manualUploadViewModel.getUiState(), r14, startRestartGroup, 0, 1);
                            boolean changed5 = startRestartGroup.changed(collectAsState);
                            boolean changedInstance2 = startRestartGroup.changedInstance(manualUploadViewModel);
                            boolean changed6 = startRestartGroup.changed(collectAsState2);
                            com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$1$1 rememberedValue5 = startRestartGroup.rememberedValue();
                            if ((changed5 | changedInstance2 | changed6) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$1$1(manualUploadViewModel, collectAsState, collectAsState2, r14);
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(manualUploadViewModel, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                i7 = 2;
                                rememberedValue6 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, r14, 2, r14);
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            } else {
                                i7 = 2;
                            }
                            androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue6;
                            int i9 = com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt.WhenMappings.$EnumSwitchMapping$0[idScanWidgetConfig.getCaptureMode().ordinal()];
                            if (i9 == 1) {
                                captureMode = com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode.SDK;
                            } else {
                                if (i9 != i7) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                captureMode = com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode.SYSTEM;
                            }
                            final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode2 = captureMode;
                            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                            createMapBuilder.put("party_id", idScanWidgetConfig.getPartyId());
                            createMapBuilder.put("flow_name", idScanWidgetConfig.getFlowName());
                            createMapBuilder.put("entity_type", idScanWidgetConfig.getEntityType());
                            final java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            int i10 = i3 & 14;
                            if (i10 != 4) {
                                if ((i3 & 8) != 0) {
                                    idScanWidgetImpl2 = idScanWidgetImpl;
                                } else {
                                    idScanWidgetImpl2 = idScanWidgetImpl;
                                }
                                z = false;
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$2$1(idScanWidgetImpl2, mutableState, r14);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState manualUploadUiState = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState) collectAsState2.getValue();
                                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready ready = !(manualUploadUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) ? (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) manualUploadUiState : r14;
                                error = ready == null ? ready.getError() : r14;
                                if (error == null) {
                                    startRestartGroup.startReplaceGroup(2003527120);
                                    java.lang.Integer messageRes = error.getMessageRes();
                                    if (messageRes == null) {
                                        startRestartGroup.startReplaceGroup(-841239923);
                                        startRestartGroup.endReplaceGroup();
                                        stringResource = r14;
                                    } else {
                                        startRestartGroup.startReplaceGroup(-841239922);
                                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(messageRes.intValue(), startRestartGroup, 0);
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    if (stringResource == null) {
                                        stringResource = error.getMessage();
                                        if (stringResource.length() <= 0) {
                                            str = r14;
                                            startRestartGroup.endReplaceGroup();
                                        }
                                    }
                                    str = stringResource;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(2003527119);
                                    startRestartGroup.endReplaceGroup();
                                    str = r14;
                                }
                                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState manualUploadUiState2 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState) collectAsState2.getValue();
                                changed = startRestartGroup.changed(collectAsState2);
                                z2 = i10 != 4 || ((i3 & 8) != 0 && startRestartGroup.changedInstance(idScanWidgetImpl2));
                                changed2 = startRestartGroup.changed(str);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!(z2 | changed | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$3$1(idScanWidgetImpl2, str, collectAsState2, r14);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                androidx.compose.runtime.EffectsKt.LaunchedEffect(manualUploadUiState2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
                                kotlin.Pair<com.paypal.oslo.feature.verificationcapture.api.widget.ErrorMessagePriority, java.lang.String> externalMessage = ((com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState) collectAsState.getValue()).getExternalMessage();
                                changed3 = startRestartGroup.changed(collectAsState);
                                changedInstance = startRestartGroup.changedInstance(manualUploadViewModel);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!(changed3 | changedInstance) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$4$1(collectAsState, manualUploadViewModel, r14);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                androidx.compose.runtime.EffectsKt.LaunchedEffect(externalMessage, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                                if (((com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState) collectAsState.getValue()).getVisibility() != 0) {
                                    startRestartGroup.startReplaceGroup(2006506778);
                                    android.view.ContextThemeWrapper contextThemeWrapper = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                                    android.content.res.Configuration configuration = (android.content.res.Configuration) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration());
                                    com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale locale = idScanWidgetConfig.getLocale();
                                    boolean changed7 = startRestartGroup.changed(locale == null ? i6 : locale.ordinal());
                                    boolean changed8 = startRestartGroup.changed(configuration);
                                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                                    if ((changed7 | changed8) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale locale2 = idScanWidgetConfig.getLocale();
                                        if (locale2 != null) {
                                            java.util.Locale forLanguageTag = java.util.Locale.forLanguageTag(locale2.getBcp47Tag());
                                            android.content.res.Configuration configuration2 = new android.content.res.Configuration(configuration);
                                            configuration2.setLocale(forLanguageTag);
                                            configuration = configuration2;
                                        }
                                        startRestartGroup.updateRememberedValue(configuration);
                                        rememberedValue7 = configuration;
                                    }
                                    android.content.res.Configuration configuration3 = (android.content.res.Configuration) rememberedValue7;
                                    com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale locale3 = idScanWidgetConfig.getLocale();
                                    boolean changed9 = startRestartGroup.changed(contextThemeWrapper);
                                    boolean changed10 = startRestartGroup.changed(locale3 == null ? i6 : locale3.ordinal());
                                    boolean changed11 = startRestartGroup.changed(configuration3);
                                    java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                                    if ((changed10 | changed9 | changed11) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        if (idScanWidgetConfig.getLocale() != null) {
                                            android.view.ContextThemeWrapper contextThemeWrapper2 = new android.view.ContextThemeWrapper(contextThemeWrapper, 0);
                                            contextThemeWrapper2.applyOverrideConfiguration(configuration3);
                                            contextThemeWrapper = contextThemeWrapper2;
                                        }
                                        startRestartGroup.updateRememberedValue(contextThemeWrapper);
                                        rememberedValue8 = contextThemeWrapper;
                                    }
                                    androidx.view.result.ActivityResultRegistryOwner current2 = androidx.view.compose.LocalActivityResultRegistryOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.compose.LocalActivityResultRegistryOwner.$stable);
                                    androidx.compose.runtime.ProvidedValue[] providedValueArr = new androidx.compose.runtime.ProvidedValue[3];
                                    providedValueArr[0] = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext().provides((android.content.Context) rememberedValue8);
                                    providedValueArr[1] = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration().provides(configuration3);
                                    androidx.view.compose.LocalActivityResultRegistryOwner localActivityResultRegistryOwner = androidx.view.compose.LocalActivityResultRegistryOwner.INSTANCE;
                                    if (current2 != null) {
                                        providedValueArr[2] = localActivityResultRegistryOwner.provides(current2);
                                        final androidx.compose.ui.Modifier modifier4 = modifier3;
                                        final com.paypal.oslo.core.navigation.AppNavigator appNavigator5 = appNavigator4;
                                        final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel manualUploadViewModel2 = manualUploadViewModel;
                                        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(524153992, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function2
                                            public final java.lang.Object invoke(java.lang.Object obj6, java.lang.Object obj7) {
                                                return com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt.$r8$lambda$3r6clXI2hY2RvJEAeB7CNZmIsJM(androidx.compose.ui.Modifier.this, captureMode2, idScanWidgetConfig, build, appNavigator5, manualUploadViewModel2, (androidx.compose.runtime.Composer) obj6, ((java.lang.Integer) obj7).intValue());
                                            }
                                        }, startRestartGroup, 54), startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | 48);
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        throw new java.lang.IllegalArgumentException("LocalActivityResultRegistryOwner must be provided".toString());
                                    }
                                } else {
                                    startRestartGroup.startReplaceGroup(2009248511);
                                    startRestartGroup.endReplaceGroup();
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                appNavigator3 = appNavigator4;
                                obj3 = obj4;
                            } else {
                                idScanWidgetImpl2 = idScanWidgetImpl;
                            }
                            z = true;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z) {
                            }
                            rememberedValue = new com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$2$1(idScanWidgetImpl2, mutableState, r14);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState manualUploadUiState3 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState) collectAsState2.getValue();
                            if (!(manualUploadUiState3 instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready)) {
                            }
                            if (ready == null) {
                            }
                            if (error == null) {
                            }
                            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState manualUploadUiState22 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState) collectAsState2.getValue();
                            changed = startRestartGroup.changed(collectAsState2);
                            if (i10 != 4) {
                            }
                            changed2 = startRestartGroup.changed(str);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!(z2 | changed | changed2)) {
                            }
                            rememberedValue2 = new com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$3$1(idScanWidgetImpl2, str, collectAsState2, r14);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(manualUploadUiState22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
                            kotlin.Pair<com.paypal.oslo.feature.verificationcapture.api.widget.ErrorMessagePriority, java.lang.String> externalMessage2 = ((com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState) collectAsState.getValue()).getExternalMessage();
                            changed3 = startRestartGroup.changed(collectAsState);
                            changedInstance = startRestartGroup.changedInstance(manualUploadViewModel);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!(changed3 | changedInstance)) {
                            }
                            rememberedValue3 = new com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$IdScanWidget$4$1(collectAsState, manualUploadViewModel, r14);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(externalMessage2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                            if (((com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState) collectAsState.getValue()).getVisibility() != 0) {
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier3;
                            appNavigator3 = appNavigator4;
                            obj3 = obj4;
                        } else {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            scopeUpdateScope = startRestartGroup.endRestartGroup();
                            if (scopeUpdateScope != null) {
                                final androidx.compose.ui.Modifier modifier5 = modifier3;
                                final com.paypal.oslo.core.navigation.AppNavigator appNavigator6 = appNavigator4;
                                final java.lang.Object obj6 = obj5;
                                function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                        return com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt.$r8$lambda$26B7hERglypJklGDNupXtC4Yae4(com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface.this, modifier5, appNavigator6, obj6, i, i2, (androidx.compose.runtime.Composer) obj7, ((java.lang.Integer) obj8).intValue());
                                    }
                                };
                                scopeUpdateScope.updateScope(function2);
                                return;
                            }
                            return;
                        }
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier6 = modifier2;
                        scopeUpdateScope = endRestartGroup;
                        function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj7, java.lang.Object obj8) {
                                return com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt.$r8$lambda$g8fA9whUN59Csd5rL6qsBpKlCE4(com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface.this, modifier6, appNavigator3, obj3, i, i2, (androidx.compose.runtime.Composer) obj7, ((java.lang.Integer) obj8).intValue());
                            }
                        };
                        scopeUpdateScope.updateScope(function2);
                        return;
                    }
                    return;
                }
                obj2 = obj;
                if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            appNavigator2 = appNavigator;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            obj2 = obj;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        appNavigator2 = appNavigator;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        obj2 = obj;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$26B7hERglypJklGDNupXtC4Yae4(com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface idScanWidgetInterface, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.Object obj, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        IdScanWidget(idScanWidgetInterface, modifier, appNavigator, obj, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3r6clXI2hY2RvJEAeB7CNZmIsJM(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode, com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig idScanWidgetConfig, java.util.Map map, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel manualUploadViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(524153992, i, -1, "com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidget.<anonymous> (IdScanWidgetComposable.kt:266)");
            }
            int maxFiles = idScanWidgetConfig.getMaxFiles();
            int maxFileSizeKB = idScanWidgetConfig.getMaxFileSizeKB();
            java.lang.String documentType = idScanWidgetConfig.getDocumentType();
            java.lang.String documentSide = idScanWidgetConfig.getDocumentSide();
            com.paypal.oslo.feature.verificationcapture.api.models.SupportedLocale locale = idScanWidgetConfig.getLocale();
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.verificationcapture.ui.widget.IdScanWidgetComposableKt.$r8$lambda$M5Fi6uxMWsgUsOvKe_KvYFwZ8iw((java.util.List) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.screen.ManualUploadScreenKt.ManualUploadScreen(modifier, captureMode, maxFiles, maxFileSizeKB, documentType, documentSide, map, appNavigator, locale, manualUploadViewModel, (kotlin.jvm.functions.Function1) rememberedValue, composer, 0, 6, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$M5Fi6uxMWsgUsOvKe_KvYFwZ8iw(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g8fA9whUN59Csd5rL6qsBpKlCE4(com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface idScanWidgetInterface, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.Object obj, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        IdScanWidget(idScanWidgetInterface, modifier, appNavigator, obj, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState access$IdScanWidget$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState) state.getValue();
    }

    public static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState access$IdScanWidget$lambda$4(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState) state.getValue();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode.values().length];
            try {
                iArr[com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode.SDK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.verificationcapture.api.widget.CaptureMode.SYSTEM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
