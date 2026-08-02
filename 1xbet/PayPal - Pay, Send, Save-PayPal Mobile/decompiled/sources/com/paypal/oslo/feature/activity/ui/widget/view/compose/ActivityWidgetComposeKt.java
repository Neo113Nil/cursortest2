package com.paypal.oslo.feature.activity.ui.widget.view.compose;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\n\u001a\u001d\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000e\u001a%\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0012\u001a \u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a#\u0010\u0016\u001a\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"RenderActivityWidgetCompose", "", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;", "viewModel", "Lcom/paypal/oslo/feature/activity/ui/widget/model/ActivityWidgetViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;Lcom/paypal/oslo/feature/activity/ui/widget/model/ActivityWidgetViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RenderLoadingUiState", "(Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;Lcom/paypal/oslo/feature/activity/ui/widget/model/ActivityWidgetViewModel;Landroidx/compose/runtime/Composer;I)V", "RenderSuccessUiState", "(Lcom/paypal/oslo/feature/activity/ui/widget/model/ActivityWidgetViewModel;Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;Landroidx/compose/runtime/Composer;I)V", "RenderHeaderShimmerIfAllowed", "(Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;Landroidx/compose/runtime/Composer;I)V", "RenderHeaderIfAllowed", "hasMoreActivities", "", "(Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;Lcom/paypal/oslo/feature/activity/ui/widget/model/ActivityWidgetViewModel;ZLandroidx/compose/runtime/Composer;I)V", "shouldHideWidget", "uiState", "Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;", "RenderActivityItemsList", "items", "", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "(Ljava/util/List;Lcom/paypal/oslo/feature/activity/ui/widget/model/ActivityWidgetViewModel;Landroidx/compose/runtime/Composer;I)V", "activity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWidgetComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderActivityWidgetCompose(final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration activityWidgetConfiguration, final com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityWidgetConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityWidgetViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1226712618);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(activityWidgetConfiguration) : startRestartGroup.changedInstance(activityWidgetConfiguration) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(activityWidgetViewModel) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1226712618, i4, -1, "com.paypal.oslo.feature.activity.ui.widget.view.compose.RenderActivityWidgetCompose (ActivityWidgetCompose.kt:63)");
                }
                boolean changedInstance = startRestartGroup.changedInstance(activityWidgetViewModel);
                int i6 = i4 & 14;
                boolean z = i6 == 4 || ((i4 & 8) != 0 && startRestartGroup.changedInstance(activityWidgetConfiguration));
                com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt$RenderActivityWidgetCompose$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt$RenderActivityWidgetCompose$1$1(activityWidgetViewModel, activityWidgetConfiguration, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(activityWidgetViewModel, activityWidgetConfiguration, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, ((i4 >> 3) & 14) | (com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.$stable << 3) | ((i4 << 3) & 112));
                final com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState activityUiState = (com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(activityWidgetViewModel.getActivityWidgetUIState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
                boolean booleanValue = ((java.lang.Boolean) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(activityWidgetViewModel.hasMoreActivities(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue()).booleanValue();
                if (((activityUiState instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure) && (activityWidgetConfiguration.getUiConfig().getWidgetFailureVisibilityConfig() == com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum.WIDGET_HIDDEN_WHEN_NO_ACTIVITY_OR_FETCH_ERROR || activityWidgetConfiguration.getUiConfig().getWidgetFailureVisibilityConfig() == com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum.WIDGET_HIDDEN_ONLY_WHEN_FETCH_ERROR)) || ((activityUiState instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success) && activityWidgetViewModel.getActivityItems().isEmpty() && (activityWidgetConfiguration.getUiConfig().getWidgetFailureVisibilityConfig() == com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum.WIDGET_HIDDEN_WHEN_NO_ACTIVITY_OR_FETCH_ERROR || activityWidgetConfiguration.getUiConfig().getWidgetFailureVisibilityConfig() == com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFailureVisibilityEnum.WIDGET_HIDDEN_ONLY_WHEN_NO_ACTIVITY))) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final androidx.compose.ui.Modifier modifier5 = modifier4;
                        function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt.m11961$r8$lambda$a5VGlC3DP8br4hYe27JhnwCQak(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.this, activityWidgetViewModel, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        };
                        endRestartGroup.updateScope(function2);
                        return;
                    }
                    return;
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null), "activity_widget_container");
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
                if ((activityUiState instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Loading) && activityWidgetViewModel.getActivityItems().isEmpty()) {
                    startRestartGroup.startReplaceGroup(1387823747);
                    getHighSpeedVideoFpsRangesFor(activityWidgetConfiguration, startRestartGroup, i6 | com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.$stable);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1387915662);
                    getHighSpeedVideoFpsRangesFor(activityWidgetConfiguration, activityWidgetViewModel, booleanValue, startRestartGroup, i6 | com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.$stable | (i4 & 112));
                    startRestartGroup.endReplaceGroup();
                }
                modifier3 = modifier4;
                com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.Color.BackgroundContainerOutlined.INSTANCE, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1345818418, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt.$r8$lambda$soyYP7JbewxrtlmQWuQiJHfPtg4(com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.this, activityWidgetConfiguration, activityWidgetViewModel, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306422, 500);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier6 = modifier3;
                function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt.$r8$lambda$g4UWlrvDFeTfnR4YcMPI5Uey4ko(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.this, activityWidgetViewModel, modifier6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                };
                endRestartGroup.updateScope(function2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration activityWidgetConfiguration, final com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1837670695);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(activityWidgetConfiguration) : startRestartGroup.changedInstance(activityWidgetConfiguration) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(activityWidgetViewModel) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1837670695, i2, -1, "com.paypal.oslo.feature.activity.ui.widget.view.compose.RenderLoadingUiState (ActivityWidgetCompose.kt:132)");
            }
            if (activityWidgetConfiguration.getUiConfig().isSilentRefresh() && !activityWidgetViewModel.getActivityItems().isEmpty()) {
                startRestartGroup.startReplaceGroup(1900679342);
                getHighSpeedVideoFpsRanges(activityWidgetViewModel.getActivityItems(), activityWidgetViewModel, startRestartGroup, i2 & 112);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1900866551);
                com.paypal.oslo.feature.activity.ui.ledger.view.compose.shimmer.ActivityLedgerShimmerComposeKt.RenderActivityLedgerItemsShimmer(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt.m11962$r8$lambda$aR3wfBHKjSt9aMAA2ZrCo3f_Io(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.this, activityWidgetViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel, final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration activityWidgetConfiguration, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(103585632);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(activityWidgetViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(activityWidgetConfiguration) : startRestartGroup.changedInstance(activityWidgetConfiguration) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(103585632, i2, -1, "com.paypal.oslo.feature.activity.ui.widget.view.compose.RenderSuccessUiState (ActivityWidgetCompose.kt:150)");
            }
            java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> activityItems = activityWidgetViewModel.getActivityItems();
            if (activityItems.isEmpty()) {
                startRestartGroup.startReplaceGroup(2133342513);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_widget_empty_state_desc, startRestartGroup, 0);
                java.lang.String widgetEmptyMessageText = activityWidgetConfiguration.getContentConfig().getWidgetEmptyMessageText();
                java.lang.String str = widgetEmptyMessageText != null ? widgetEmptyMessageText : stringResource;
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_widget_empty_state_cta_text, startRestartGroup, 0);
                java.lang.String widgetEmptyCtaText = activityWidgetConfiguration.getContentConfig().getWidgetEmptyCtaText();
                java.lang.String str2 = widgetEmptyCtaText != null ? widgetEmptyCtaText : stringResource2;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing24()), "activity_widget_empty");
                boolean changedInstance = startRestartGroup.changedInstance(activityWidgetViewModel);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt.$r8$lambda$vZFm0WZhFVvTUvDm09npUNuAtiA(com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerEmptyContentComposeKt.RenderActivityLedgerUIEmptyState(null, str, str2, testTag, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 6, 16);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(2134138221);
                getHighSpeedVideoFpsRanges(activityItems, activityWidgetViewModel, startRestartGroup, (i2 << 3) & 112);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt.m11963$r8$lambda$dcS1weuzRcdUxLkYmd4cO3BJk(com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel.this, activityWidgetConfiguration, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration activityWidgetConfiguration, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-48025208);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(activityWidgetConfiguration) : startRestartGroup.changedInstance(activityWidgetConfiguration) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-48025208, i2, -1, "com.paypal.oslo.feature.activity.ui.widget.view.compose.RenderHeaderShimmerIfAllowed (ActivityWidgetCompose.kt:180)");
            }
            if (activityWidgetConfiguration.getUiConfig().getHeaderVisibility()) {
                startRestartGroup.startReplaceGroup(-494726891);
                com.paypal.oslo.feature.activity.ui.ledger.view.compose.shimmer.ActivityLedgerShimmerComposeKt.m11919RenderDualHeaderShimmerViewi1RSzL4(androidx.compose.ui.unit.Dp.m8601constructorimpl(160.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(28.0f), startRestartGroup, 54);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-494476070);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt.m11960$r8$lambda$Xsrgqsi5HfISJZeQRDckMzArck(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration activityWidgetConfiguration, final com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel, final boolean z, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1205011944);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(activityWidgetConfiguration) : startRestartGroup.changedInstance(activityWidgetConfiguration) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(activityWidgetViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1205011944, i2, -1, "com.paypal.oslo.feature.activity.ui.widget.view.compose.RenderHeaderIfAllowed (ActivityWidgetCompose.kt:194)");
            }
            if (activityWidgetConfiguration.getUiConfig().getHeaderVisibility()) {
                startRestartGroup.startReplaceGroup(1174373391);
                com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetHeaderComposeKt.RenderActivityWidgetHeaderUi(activityWidgetConfiguration.getContentConfig(), activityWidgetViewModel, com.paypal.oslo.feature.activity.domain.base.utils.widget.ActivityWidgetHelperUtils.INSTANCE.shouldShowSeeAllButton(activityWidgetConfiguration, z), startRestartGroup, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetContentConfig.$stable | (i2 & 112), 0);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1174752986);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt.m11959$r8$lambda$4b_lWe_NRHaC9cW08IZtndjxeY(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.this, activityWidgetViewModel, z, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final java.util.List<? extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> list, final com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-201255778);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(activityWidgetViewModel) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-201255778, i2, -1, "com.paypal.oslo.feature.activity.ui.widget.view.compose.RenderActivityItemsList (ActivityWidgetCompose.kt:251)");
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24());
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            startRestartGroup.startReplaceGroup(-1535818950);
            for (final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem : list) {
                if (activityItem instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) {
                    startRestartGroup.startReplaceGroup(530016378);
                    com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel data = ((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) activityItem).getData();
                    boolean isSingleCounterPartyFlag$activity_prodRelease = activityWidgetViewModel.isSingleCounterPartyFlag$activity_prodRelease();
                    boolean changedInstance = startRestartGroup.changedInstance(activityWidgetViewModel);
                    boolean changed = startRestartGroup.changed(activityItem);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt.$r8$lambda$mmYoNPDzU1QXQIFfeO7gJMoc6xs(com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel.this, activityItem);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.oslo.feature.activity.ui.widget.view.compose.sections.ActivityWidgetSectionItemComposeKt.ActivityWidgetItemView(data, isSingleCounterPartyFlag$activity_prodRelease, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(530493189);
                    startRestartGroup.endReplaceGroup();
                }
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt.$r8$lambda$s4EoMSiGI2O9sZoyL27mUlMaamc(list, activityWidgetViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$4b_lWe_NRHaC9cW08IZ-tndjxeY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11959$r8$lambda$4b_lWe_NRHaC9cW08IZtndjxeY(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration activityWidgetConfiguration, com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel, boolean z, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(activityWidgetConfiguration, activityWidgetViewModel, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Xs-rgqsi5HfISJZeQRDckMzArck, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11960$r8$lambda$Xsrgqsi5HfISJZeQRDckMzArck(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration activityWidgetConfiguration, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(activityWidgetConfiguration, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$a5VGlC3DP8br-4hYe27JhnwCQak, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11961$r8$lambda$a5VGlC3DP8br4hYe27JhnwCQak(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration activityWidgetConfiguration, com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderActivityWidgetCompose(activityWidgetConfiguration, activityWidgetViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aR3-wfBHKjSt9aMAA2ZrCo3f_Io, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11962$r8$lambda$aR3wfBHKjSt9aMAA2ZrCo3f_Io(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration activityWidgetConfiguration, com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(activityWidgetConfiguration, activityWidgetViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dcS1weuzR-cdUxLkYm-d4cO3BJk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11963$r8$lambda$dcS1weuzRcdUxLkYmd4cO3BJk(com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration activityWidgetConfiguration, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(activityWidgetViewModel, activityWidgetConfiguration, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g4UWlrvDFeTfnR4YcMPI5Uey4ko(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration activityWidgetConfiguration, com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderActivityWidgetCompose(activityWidgetConfiguration, activityWidgetViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mBiU5aFPdgygA5LtNRsliT0wUwI(com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration activityWidgetConfiguration) {
        activityWidgetViewModel.fetchActivityWidgetItems(activityWidgetConfiguration);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mmYoNPDzU1QXQIFfeO7gJMoc6xs(com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem) {
        activityWidgetViewModel.handleTransactionItemClick$activity_prodRelease(((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) activityItem).getData());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s4EoMSiGI2O9sZoyL27mUlMaamc(java.util.List list, com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(list, activityWidgetViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$soyYP7JbewxrtlmQWuQiJHfPtg4(com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState activityUiState, final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration activityWidgetConfiguration, final com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1345818418, i, -1, "com.paypal.oslo.feature.activity.ui.widget.view.compose.RenderActivityWidgetCompose.<anonymous>.<anonymous> (ActivityWidgetCompose.kt:106)");
            }
            if (activityUiState instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Loading) {
                composer.startReplaceGroup(-243138470);
                Camera2StreamConfigurationMap(activityWidgetConfiguration, activityWidgetViewModel, composer, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.$stable);
                composer.endReplaceGroup();
            } else if (activityUiState instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure) {
                composer.startReplaceGroup(-242993855);
                com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetContentConfig contentConfig = activityWidgetConfiguration.getContentConfig();
                boolean changedInstance = composer.changedInstance(activityWidgetViewModel);
                boolean changedInstance2 = composer.changedInstance(activityWidgetConfiguration);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetComposeKt.$r8$lambda$mBiU5aFPdgygA5LtNRsliT0wUwI(com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel.this, activityWidgetConfiguration);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetErrorComposeKt.RenderActivityWidgetErrorUi(contentConfig, (kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing24()), "activity_widget_error"), composer, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetContentConfig.$stable, 0);
                composer.endReplaceGroup();
            } else {
                if (!(activityUiState instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success)) {
                    composer.startReplaceGroup(546344888);
                    composer.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-242468870);
                Camera2StreamConfigurationMap(activityWidgetViewModel, activityWidgetConfiguration, composer, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.$stable << 3);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$vZFm0WZhFVvTUvDm09npUNuAtiA(com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel) {
        activityWidgetViewModel.navigateToTabbedLedgerView$activity_prodRelease();
        return kotlin.Unit.INSTANCE;
    }
}
