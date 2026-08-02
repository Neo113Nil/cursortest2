package com.paypal.oslo.feature.helpcenter.ui.screens;

@kotlin.Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a/\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0012\u001a+\u0010\u0014\u001a\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010!\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\"\u000e\u0010\u0019\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\"²\u0006\u0010\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0$X\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020&X\u008a\u008e\u0002"}, d2 = {"CallUsScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/helpcenter/ui/viewmodel/CallUsViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/helpcenter/ui/viewmodel/CallUsViewModel;Landroidx/compose/runtime/Composer;II)V", "CallUsContent", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/helpcenter/domain/models/CallUsData;", "showWifiOption", "", "(Lcom/paypal/oslo/feature/helpcenter/domain/models/CallUsData;ZLcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CallUsWifiVariant", "service", "Lcom/paypal/oslo/feature/helpcenter/domain/models/CallUsServiceInfo;", "(Lcom/paypal/oslo/feature/helpcenter/domain/models/CallUsServiceInfo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CallUsPhoneVariant", "CallUsServiceHours", "estimatedWaitTime", "", "hoursOfOperation", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CallUsTitle", "PreviewHours", "callUsMoreOptions", "", "Lcom/paypal/oslo/feature/helpcenter/ui/models/HelpOptionUiData;", "CallUsLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "CallUsStandardPreview", "CallUsWifiPreview", "helpcenter_prodRelease", "callUsState", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;", "selectedTabIndex", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CallUsScreenKt {
    private static final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData> getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData[]{com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.ChatUs.INSTANCE, com.paypal.oslo.feature.helpcenter.ui.models.HelpOptionUiData.HelpCenter.INSTANCE});

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CallUsScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel callUsViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel callUsViewModel2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel callUsViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel callUsViewModel4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.compose.ui.Modifier modifier4;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1441559379);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    callUsViewModel2 = callUsViewModel;
                    if (startRestartGroup.changedInstance(callUsViewModel2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    callUsViewModel2 = callUsViewModel;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                callUsViewModel2 = callUsViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    callUsViewModel4 = callUsViewModel2;
                    i4 = 1;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
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
                        i4 = 1;
                        i3 &= -897;
                        callUsViewModel4 = (com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        modifier2 = companion;
                    } else {
                        i4 = 1;
                        modifier2 = companion;
                        callUsViewModel4 = callUsViewModel2;
                    }
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1441559379, i3, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreen (CallUsScreen.kt:87)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(callUsViewModel4.getCallUsState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier2, 0.0f, i4, null), "call_us_screen");
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
                int i7 = (i3 & 14) == 4 ? i4 : 0;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (i7 != 0 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt.$r8$lambda$qxdtA1yNiE93BpMQMCoGuBeKJMo(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.helpcenter.ui.components.HelpCenterTopBarKt.HelpCenterTopBar((kotlin.jvm.functions.Function0) rememberedValue, "Call us", null, startRestartGroup, 48, 4);
                com.paypal.oslo.feature.helpcenter.ui.models.ScreenState screenState = (com.paypal.oslo.feature.helpcenter.ui.models.ScreenState) collectAsStateWithLifecycle.getValue();
                if (screenState instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading) {
                    startRestartGroup.startReplaceGroup(-1398719217);
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i4, null);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
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
                    com.paypal.pds.components.LoaderKt.Loader(null, null, null, null, startRestartGroup, 0, 15);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                } else if (screenState instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure) {
                    startRestartGroup.startReplaceGroup(-1398469636);
                    com.paypal.oslo.feature.helpcenter.ui.components.ErrorComponentsKt.NetworkErrorComponent(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing32(), 0.0f, 0.0f, 13, null), startRestartGroup, 0, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!(screenState instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success)) {
                        startRestartGroup.startReplaceGroup(1894541356);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-1398289526);
                    com.paypal.oslo.feature.helpcenter.ui.models.ScreenState screenState2 = (com.paypal.oslo.feature.helpcenter.ui.models.ScreenState) collectAsStateWithLifecycle.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(screenState2, "");
                    modifier4 = modifier2;
                    composer2 = startRestartGroup;
                    CallUsContent((com.paypal.oslo.feature.helpcenter.domain.models.CallUsData) ((com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success) screenState2).getData(), callUsViewModel4.getShowWifiOption(), appNavigator, null, startRestartGroup, (i3 << 6) & 896, 8);
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    callUsViewModel3 = callUsViewModel4;
                }
                modifier4 = modifier2;
                composer2 = startRestartGroup;
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                callUsViewModel3 = callUsViewModel4;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                callUsViewModel3 = callUsViewModel2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt.$r8$lambda$tF0y75k6B78uI7XEC4H5SSB7GdA(com.paypal.oslo.core.navigation.AppNavigator.this, modifier3, callUsViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CallUsContent(final com.paypal.oslo.feature.helpcenter.domain.models.CallUsData callUsData, final boolean z, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo paypalService;
        com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo callUsServiceInfo;
        androidx.compose.ui.Modifier modifier4;
        java.lang.Object obj;
        float f;
        int i5;
        int i6;
        int i7;
        float f2;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callUsData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1229532824);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(callUsData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier5 = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1229532824, i4, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.CallUsContent (CallUsScreen.kt:134)");
                }
                java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                if (callUsData.getPaypalService() != null) {
                    createListBuilder.add(new com.paypal.pds.components.SegmentedControlItem("PayPal", null, null, null, null, 30, null));
                }
                if (callUsData.getCreditService() != null) {
                    createListBuilder.add(new com.paypal.pds.components.SegmentedControlItem("PayPal Credit", null, null, null, null, 30, null));
                }
                java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
                boolean z2 = build.size() > 1;
                java.lang.Object[] objArr = new java.lang.Object[0];
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            androidx.compose.runtime.MutableIntState mutableIntStateOf;
                            mutableIntStateOf = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
                            return mutableIntStateOf;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableIntState mutableIntState = (androidx.compose.runtime.MutableIntState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48);
                if (callUsData.getPaypalService() != null && mutableIntState.getIntValue() == 0) {
                    paypalService = callUsData.getPaypalService();
                } else if (callUsData.getCreditService() != null && (!z2 || mutableIntState.getIntValue() == 1)) {
                    paypalService = callUsData.getCreditService();
                } else {
                    paypalService = callUsData.getPaypalService();
                    if (paypalService == null) {
                        paypalService = callUsData.getCreditService();
                    }
                }
                com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo callUsServiceInfo2 = paypalService;
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing64(), 7, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                if (z2) {
                    startRestartGroup.startReplaceGroup(-1593071402);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    int intValue = mutableIntState.getIntValue();
                    f = 0.0f;
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), "call_us_tabs");
                    boolean changed = startRestartGroup.changed(mutableIntState);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt.$r8$lambda$UaVoO58edqtSvUThCIvd4N9GxhI(androidx.compose.runtime.MutableIntState.this, ((java.lang.Integer) obj2).intValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                    obj = null;
                    modifier4 = modifier5;
                    i5 = 0;
                    callUsServiceInfo = callUsServiceInfo2;
                    com.paypal.pds.components.SegmentedControlKt.SegmentedControl(build, testTag, intValue, function1, startRestartGroup, 0, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    callUsServiceInfo = callUsServiceInfo2;
                    modifier4 = modifier5;
                    obj = null;
                    f = 0.0f;
                    i5 = 0;
                    startRestartGroup.startReplaceGroup(-1592662016);
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, i5);
                float f3 = f;
                int i10 = i5;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Call us", androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, 1, obj), com.paypal.pds.core.ConstantsKt.getSpacing16(), f, 2, obj), "call_us_title"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 390, 6, 1016);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, i10);
                if (callUsServiceInfo != null) {
                    startRestartGroup.startReplaceGroup(-1592099800);
                    if (z) {
                        startRestartGroup.startReplaceGroup(-1592144316);
                        Camera2StreamConfigurationMap(callUsServiceInfo, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f3, 1, obj), com.paypal.pds.core.ConstantsKt.getSpacing16(), f3, 2, obj), startRestartGroup, i10, i10);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1591888349);
                        getHighSpeedVideoFpsRanges(callUsServiceInfo, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f3, 1, obj), com.paypal.pds.core.ConstantsKt.getSpacing16(), f3, 2, obj), startRestartGroup, i10, i10);
                        startRestartGroup.endReplaceGroup();
                    }
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, i10);
                    if (z) {
                        startRestartGroup.startReplaceGroup(-1591489224);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("For information about Wi-Fi calling, refer to your carrier's terms, privacy policy, and practices. When contacting us we will only discuss account information with the account holder.\n\nIf you are hearing or speech impaired, please contact us through an IP relay service.", androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f3, 1, obj), com.paypal.pds.core.ConstantsKt.getSpacing16(), f3, 2, obj), "call_us_disclaimer"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 384, 6, 1016);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1590785617);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("When contacting us we will only discuss account information with the account holder.", androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f3, 1, obj), com.paypal.pds.core.ConstantsKt.getSpacing16(), f3, 2, obj), "call_us_disclaimer"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 390, 6, 1016);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, i10);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("If you are hearing or speech impaired, please contact us through an IP Relay service.", androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f3, 1, obj), com.paypal.pds.core.ConstantsKt.getSpacing16(), f3, 2, obj), "call_us_ip_relay"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 390, 6, 1016);
                        startRestartGroup.endReplaceGroup();
                    }
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), startRestartGroup, i10);
                    i6 = i4;
                    i7 = i10;
                    f2 = f3;
                    i8 = 2;
                    Camera2StreamConfigurationMap(callUsServiceInfo.getEstimatedWaitTime(), callUsServiceInfo.getHoursOfOperation(), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f3, 1, obj), com.paypal.pds.core.ConstantsKt.getSpacing16(), f3, 2, obj), startRestartGroup, 0, 0);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                } else {
                    i6 = i4;
                    i7 = i10;
                    f2 = f3;
                    i8 = 2;
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(-1589432064);
                    composer2.endReplaceGroup();
                }
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing40()), composer2, i7);
                com.paypal.oslo.feature.helpcenter.ui.components.HelpOptionsSectionKt.HelpOptionsSection("More options", getHighSpeedVideoFpsRangesFor, appNavigator, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f2, 1, obj), com.paypal.pds.core.ConstantsKt.getSpacing16(), f2, i8, obj), composer2, (i6 & 896) | 6, 0);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt.m14820$r8$lambda$FivErVbgn_CY3Bs9UxMUKcaTI(com.paypal.oslo.feature.helpcenter.domain.models.CallUsData.this, z, appNavigator, modifier3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo callUsServiceInfo, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1898325466);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(callUsServiceInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1898325466, i4, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.CallUsWifiVariant (CallUsScreen.kt:267)");
                }
                final androidx.compose.ui.platform.UriHandler uriHandler = (androidx.compose.ui.platform.UriHandler) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalUriHandler());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Make a call over Wi-Fi or landline.", androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 438, 6, 1016);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                com.paypal.pds.components.CardStyle.Outlined outlined = com.paypal.pds.components.CardStyle.Outlined.INSTANCE;
                com.paypal.pds.core.Color.BackgroundBase backgroundBase = com.paypal.pds.core.Color.BackgroundBase.INSTANCE;
                com.paypal.pds.components.CardCornerRadius cardCornerRadius = com.paypal.pds.components.CardCornerRadius.Radius12;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "call_us_wifi_card");
                com.paypal.pds.core.Color.BackgroundBase backgroundBase2 = backgroundBase;
                com.paypal.pds.components.CardStyle.Outlined outlined2 = outlined;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.CardKt.Card(testTag, backgroundBase2, null, outlined2, (kotlin.jvm.functions.Function0) rememberedValue, null, cardCornerRadius, null, null, com.paypal.oslo.feature.helpcenter.ui.screens.ComposableSingletons$CallUsScreenKt.INSTANCE.m14826getLambda$1085654018$helpcenter_prodRelease(), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 806903862, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                com.paypal.pds.components.CardStyle.Outlined outlined3 = com.paypal.pds.components.CardStyle.Outlined.INSTANCE;
                com.paypal.pds.core.Color.BackgroundBase backgroundBase3 = com.paypal.pds.core.Color.BackgroundBase.INSTANCE;
                com.paypal.pds.components.CardCornerRadius cardCornerRadius2 = com.paypal.pds.components.CardCornerRadius.Radius12;
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "call_us_phone_card");
                com.paypal.pds.core.Color.BackgroundBase backgroundBase4 = backgroundBase3;
                com.paypal.pds.components.CardStyle.Outlined outlined4 = outlined3;
                boolean changedInstance = startRestartGroup.changedInstance(uriHandler);
                boolean z = (i4 & 14) == 4;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt.$r8$lambda$qav6XkjE4fGvrajvkJaOlKAVCkI(androidx.compose.ui.platform.UriHandler.this, callUsServiceInfo);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                composer2 = startRestartGroup;
                com.paypal.pds.components.CardKt.Card(testTag2, backgroundBase4, null, outlined4, (kotlin.jvm.functions.Function0) rememberedValue2, null, cardCornerRadius2, null, null, com.paypal.oslo.feature.helpcenter.ui.screens.ComposableSingletons$CallUsScreenKt.INSTANCE.getLambda$1295881959$helpcenter_prodRelease(), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 806879286, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt.m14821$r8$lambda$QrwGJbLODTUf_fGMOrN9MvIEvo(com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo callUsServiceInfo, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1178482399);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(callUsServiceInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1178482399, i3, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.CallUsPhoneVariant (CallUsScreen.kt:372)");
                }
                final androidx.compose.ui.platform.UriHandler uriHandler = (androidx.compose.ui.platform.UriHandler) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalUriHandler());
                com.paypal.pds.components.CardStyle.Outlined outlined = com.paypal.pds.components.CardStyle.Outlined.INSTANCE;
                com.paypal.pds.core.Color.BackgroundBase backgroundBase = com.paypal.pds.core.Color.BackgroundBase.INSTANCE;
                com.paypal.pds.components.CardCornerRadius cardCornerRadius = com.paypal.pds.components.CardCornerRadius.Radius12;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier4, "call_us_phone_card");
                com.paypal.pds.core.Color.BackgroundBase backgroundBase2 = backgroundBase;
                com.paypal.pds.components.CardStyle.Outlined outlined2 = outlined;
                boolean changedInstance = startRestartGroup.changedInstance(uriHandler);
                boolean z = (i3 & 14) == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt.$r8$lambda$8x71iNXlYbJOk8ztQrKQnQ6p7kA(androidx.compose.ui.platform.UriHandler.this, callUsServiceInfo);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                modifier3 = modifier4;
                composer2 = startRestartGroup;
                com.paypal.pds.components.CardKt.Card(testTag, backgroundBase2, null, outlined2, (kotlin.jvm.functions.Function0) rememberedValue, null, cardCornerRadius, null, null, com.paypal.oslo.feature.helpcenter.ui.screens.ComposableSingletons$CallUsScreenKt.INSTANCE.getLambda$1237575109$helpcenter_prodRelease(), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 806879280, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt.m14825$r8$lambda$cvfNQNZXkWDPaGU1_sagyOihU(com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo.this, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final java.lang.String str, final java.lang.String str2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(912511511);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(912511511, i4, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.CallUsServiceHours (CallUsScreen.kt:417)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier4, "call_us_service_hours");
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
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Customer Service Hours", androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 438, 6, 1016);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                if (str != null) {
                    startRestartGroup.startReplaceGroup(-24893509);
                    androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "call_us_wait_time");
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2);
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
                    modifier3 = modifier4;
                    com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Clock.INSTANCE, null, null, com.paypal.pds.components.IconSize.XSmall.INSTANCE, com.paypal.pds.core.Color.ContentMuted.INSTANCE, startRestartGroup, 27702, 4);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Estimated wait time: ".concat(java.lang.String.valueOf(str)), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
                    startRestartGroup.endNode();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    modifier3 = modifier4;
                    startRestartGroup.startReplaceGroup(-24130475);
                    startRestartGroup.endReplaceGroup();
                }
                if (str2 != null) {
                    startRestartGroup.startReplaceGroup(-24070459);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, ((i4 >> 3) & 14) | 432, 6, 1016);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                } else {
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(-23860651);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt.$r8$lambda$J0dIWNzARTLJ4ZzItNdyKblJeWQ(str, str2, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8tf9qJ8diW80viN8Z2GL1mIE2Z4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1792537923);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1792537923, updateChangedFlags, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.CallUsStandardPreview (CallUsScreen.kt:486)");
            }
            CallUsContent(new com.paypal.oslo.feature.helpcenter.domain.models.CallUsData(new com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo("1-888-221-1161", "10min", "6:00 am PT to 6:00 PM PT\nMonday through Sunday"), new com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo("1-866-528-3733", null, "6:00 am PT to 6:00 PM PT\nMonday through Sunday")), false, new com.paypal.oslo.core.navigation.AppNavigator(null, null, 3, null), null, startRestartGroup, 48, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt.$r8$lambda$8tf9qJ8diW80viN8Z2GL1mIE2Z4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8x71iNXlYbJOk8ztQrKQnQ6p7kA(androidx.compose.ui.platform.UriHandler uriHandler, com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo callUsServiceInfo) {
        uriHandler.openUri("tel:".concat(java.lang.String.valueOf(callUsServiceInfo.getPhoneNumber())));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FCRl-vfuJwR6Dhk-1WkCP2Gn-yU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14819$r8$lambda$FCRlvfuJwR6Dhk1WkCP2GnyU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FivErVbgn_CY3Bs9-UxMUKc-aTI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14820$r8$lambda$FivErVbgn_CY3Bs9UxMUKcaTI(com.paypal.oslo.feature.helpcenter.domain.models.CallUsData callUsData, boolean z, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CallUsContent(callUsData, z, appNavigator, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$J0dIWNzARTLJ4ZzItNdyKblJeWQ(java.lang.String str, java.lang.String str2, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(str, str2, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QrwGJb-LODTUf_fGMOrN9MvIEvo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14821$r8$lambda$QrwGJbLODTUf_fGMOrN9MvIEvo(com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo callUsServiceInfo, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(callUsServiceInfo, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$U8nUvnzZlZk8l-QteyebT1L3EfQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14822$r8$lambda$U8nUvnzZlZk8lQteyebT1L3EfQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1229799214);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1229799214, updateChangedFlags, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.CallUsLoadingPreview (CallUsScreen.kt:476)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.pds.components.LoaderKt.Loader(null, null, null, null, startRestartGroup, 0, 15);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt.m14822$r8$lambda$U8nUvnzZlZk8lQteyebT1L3EfQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UaVoO58edqtSvUThCIvd4N9GxhI(androidx.compose.runtime.MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WlpU6ptxXbH-q_xTfc6OL8HWia8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14823$r8$lambda$WlpU6ptxXbHq_xTfc6OL8HWia8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1394987365);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1394987365, updateChangedFlags, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.CallUsWifiPreview (CallUsScreen.kt:509)");
            }
            CallUsContent(new com.paypal.oslo.feature.helpcenter.domain.models.CallUsData(new com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo("1-888-221-1161", "10min", "6:00 am PT to 6:00 PM PT\nMonday through Sunday"), new com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo("1-866-528-3733", null, "6:00 am PT to 6:00 PM PT\nMonday through Sunday")), true, new com.paypal.oslo.core.navigation.AppNavigator(null, null, 3, null), null, startRestartGroup, 48, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt.m14823$r8$lambda$WlpU6ptxXbHq_xTfc6OL8HWia8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cvfNQNZXkWDPaGU1_-s-agyOihU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14825$r8$lambda$cvfNQNZXkWDPaGU1_sagyOihU(com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo callUsServiceInfo, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(callUsServiceInfo, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qav6XkjE4fGvrajvkJaOlKAVCkI(androidx.compose.ui.platform.UriHandler uriHandler, com.paypal.oslo.feature.helpcenter.domain.models.CallUsServiceInfo callUsServiceInfo) {
        uriHandler.openUri("tel:".concat(java.lang.String.valueOf(callUsServiceInfo.getPhoneNumber())));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qxdtA1yNiE93BpMQMCoGuBeKJMo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt.m14819$r8$lambda$FCRlvfuJwR6Dhk1WkCP2GnyU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tF0y75k6B78uI7XEC4H5SSB7GdA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.helpcenter.ui.viewmodel.CallUsViewModel callUsViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CallUsScreen(appNavigator, modifier, callUsViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
