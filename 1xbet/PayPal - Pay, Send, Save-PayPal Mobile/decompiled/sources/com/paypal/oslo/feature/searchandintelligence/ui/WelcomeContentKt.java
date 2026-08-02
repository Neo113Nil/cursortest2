package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\u001aZ\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u000623\u0010\u0007\u001a/\u0012\u001b\u0012\u0019\u0012\u0006\b\u0001\u0012\u00020\n0\t¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\u000e0\bH\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002"}, d2 = {"WelcomeContent", "", "prompts", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/QuickStartPrompt;", "modifier", "Landroidx/compose/ui/Modifier;", "getRenderer", "Lkotlin/Function1;", "Lkotlin/reflect/KClass;", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "Lkotlin/ParameterName;", "name", "contentClass", "Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "WelcomeContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "search-and-intelligence_prodRelease", "hasHeaderAnimated", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WelcomeContentKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WelcomeContent(final java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> list, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>, ? extends com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<? extends com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent>> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1849640249);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            i3 = i4;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1849640249, i3, -1, "com.paypal.oslo.feature.searchandintelligence.ui.WelcomeContent (WelcomeContent.kt:85)");
                }
                final boolean booleanValue = ((java.lang.Boolean) startRestartGroup.consume(com.paypal.oslo.core.navigation.scene.LocalL0VisibilityKt.getLocalL0Visibility())).booleanValue();
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue2;
                boolean changed = startRestartGroup.changed(booleanValue);
                com.paypal.oslo.feature.searchandintelligence.ui.WelcomeContentKt$WelcomeContent$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.searchandintelligence.ui.WelcomeContentKt$WelcomeContent$1$1(booleanValue, snapshotStateList, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.searchandintelligence.R.string.feature_search_and_intelligence_actionitem_suggested_action_prefix, startRestartGroup, 0);
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 10, null);
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
                com.paypal.pds.core.Icon.AiMarkFill aiMarkFill = com.paypal.pds.core.Icon.AiMarkFill.INSTANCE;
                com.paypal.pds.components.IconSize.Medium medium = com.paypal.pds.components.IconSize.Medium.INSTANCE;
                com.paypal.pds.core.Color.BackgroundBrandPrimary backgroundBrandPrimary = com.paypal.pds.core.Color.BackgroundBrandPrimary.INSTANCE;
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                boolean changed2 = startRestartGroup.changed(booleanValue);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.WelcomeContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.searchandintelligence.ui.WelcomeContentKt.m19172$r8$lambda$hLBZH3sXHUxO7stCauQyiDjIiw(booleanValue, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.ui.Modifier graphicsLayer = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(companion, (kotlin.jvm.functions.Function1) rememberedValue4);
                com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants welcomeAnimationConstants = com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants.INSTANCE;
                long highSpeedVideoFpsRanges = com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants.getHighSpeedVideoFpsRanges();
                com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants welcomeAnimationConstants2 = com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants.INSTANCE;
                androidx.compose.runtime.MutableState mutableState2 = mutableState;
                androidx.compose.ui.Modifier modifier5 = modifier4;
                androidx.compose.ui.Modifier m19123initialOffsetYAnimationarrUXIw = com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt.m19123initialOffsetYAnimationarrUXIw(graphicsLayer, highSpeedVideoFpsRanges, com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants.getHighSpeedVideoSizes(), 0.0f, booleanValue, ((java.lang.Boolean) mutableState2.getValue()).booleanValue(), null, startRestartGroup, 432, 36);
                com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants welcomeAnimationConstants3 = com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants.INSTANCE;
                com.paypal.pds.components.IconKt.Icon(aiMarkFill, null, androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt.m19124initialRotationAnimationk5Tw5DY(m19123initialOffsetYAnimationarrUXIw, com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants.Camera2StreamConfigurationMap(), -90.0f, 0.0f, booleanValue, ((java.lang.Boolean) mutableState2.getValue()).booleanValue(), null, startRestartGroup, 432, 36), "search_intelligence_ai_icon"), medium, backgroundBrandPrimary, startRestartGroup, 27702, 0);
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing36(), 5, null);
                com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants welcomeAnimationConstants4 = com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants.INSTANCE;
                androidx.compose.ui.Modifier m19122initialAlphaAnimation5fuBHu4 = com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt.m19122initialAlphaAnimation5fuBHu4(m1710paddingqDBjuR0$default2, com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants.getHighResolutionOutputSizeshNQ4ISI(), booleanValue, ((java.lang.Boolean) mutableState2.getValue()).booleanValue(), null, startRestartGroup, 48, 8);
                com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants welcomeAnimationConstants5 = com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants.INSTANCE;
                long highSpeedVideoFpsRanges2 = com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants.getHighSpeedVideoFpsRanges();
                com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants welcomeAnimationConstants6 = com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants.INSTANCE;
                float highSpeedVideoSizes = com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants.getHighSpeedVideoSizes();
                boolean booleanValue2 = ((java.lang.Boolean) mutableState2.getValue()).booleanValue();
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.WelcomeContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.searchandintelligence.ui.WelcomeContentKt.$r8$lambda$WJ2NLyKBfLXpJ3iURkyXi69hIHc(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                androidx.compose.ui.Modifier instrument$default = com.paypal.oslo.feature.searchandintelligence.ui.analytics.InstrumentationUtilsKt.instrument$default(com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt.m19123initialOffsetYAnimationarrUXIw(m19122initialAlphaAnimation5fuBHu4, highSpeedVideoFpsRanges2, highSpeedVideoSizes, 0.0f, booleanValue, booleanValue2, (kotlin.jvm.functions.Function0) rememberedValue5, startRestartGroup, 1573296, 4), (com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig.Module) com.paypal.oslo.feature.searchandintelligence.ui.analytics.welcome.WelcomeTextModuleAnalyticsConfig.INSTANCE, (java.lang.Integer) 0, (java.lang.Integer) null, 4, (java.lang.Object) null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, instrument$default);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                int i6 = 0;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.searchandintelligence.R.string.feature_search_and_intelligence_greeting_title, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.searchandintelligence.api.SearchAndIntelligenceTestTags.GREETING_TITLE_TEST_TAG), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingLarge.INSTANCE, startRestartGroup, 432, 6, 1016);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize16()), startRestartGroup, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.searchandintelligence.R.string.feature_search_and_intelligence_greeting_description, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.searchandintelligence.api.SearchAndIntelligenceTestTags.GREETING_DESCRIPTION_TEST_TAG), null, null, null, null, false, 0, 0, null, null, startRestartGroup, 48, 0, 2044);
                startRestartGroup.endNode();
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                float f = 0.0f;
                androidx.compose.ui.Modifier instrument$default2 = com.paypal.oslo.feature.searchandintelligence.ui.analytics.InstrumentationUtilsKt.instrument$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing32(), 7, null), (com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig.Module) com.paypal.oslo.feature.searchandintelligence.ui.analytics.quickstartprompt.QuickStartPromptModuleAnalyticsConfig.INSTANCE, (java.lang.Integer) 1, (java.lang.Integer) null, 4, (java.lang.Object) null);
                boolean changed3 = startRestartGroup.changed(stringResource);
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.WelcomeContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.searchandintelligence.ui.WelcomeContentKt.$r8$lambda$HThKXip1ZO5pTVQQqkbujjJjXYE(stringResource, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(instrument$default2, false, (kotlin.jvm.functions.Function1) rememberedValue6, 1, null), com.paypal.oslo.feature.searchandintelligence.api.SearchAndIntelligenceTestTags.QUICK_START_PROMPTS_LIST_TEST_TAG);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-984652024);
                final int i7 = 0;
                for (java.lang.Object obj : list) {
                    if (i7 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt quickStartPrompt = (com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt) obj;
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default3 = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, i7 < kotlin.collections.CollectionsKt.getLastIndex(list) ? com.paypal.pds.core.ConstantsKt.getSpacing16() : androidx.compose.ui.unit.Dp.m8601constructorimpl(f), 7, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy4 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, i6);
                    int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i6));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default3);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance4 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt quickStartPrompt2 = quickStartPrompt;
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                    com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants welcomeAnimationConstants7 = com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants.INSTANCE;
                    float highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.searchandintelligence.ui.WelcomeAnimationConstants.getHighSpeedVideoFpsRangesFor();
                    boolean contains = snapshotStateList.contains(java.lang.Integer.valueOf(i7));
                    boolean changed4 = startRestartGroup.changed(i7);
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (changed4 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.WelcomeContentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.searchandintelligence.ui.WelcomeContentKt.$r8$lambda$wjj4UF9uWurt3Hwpt6VSWMmA9A0(androidx.compose.runtime.snapshots.SnapshotStateList.this, i7);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue7;
                    androidx.compose.runtime.Composer composer3 = startRestartGroup;
                    com.paypal.oslo.feature.searchandintelligence.ui.RenderContentKt.RenderContent(i7, quickStartPrompt2, function1, com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt.m19126staggeredOffsetYAnimationj5PcJmA(companion2, i7, highSpeedVideoFpsRangesFor, 0.0f, 0L, booleanValue, contains, function0, startRestartGroup, 390, 12), startRestartGroup, i3 & 896, 0);
                    composer3.endNode();
                    i7++;
                    startRestartGroup = composer3;
                    snapshotStateList = snapshotStateList;
                    f = 0.0f;
                    i6 = i6;
                    i3 = i3;
                }
                composer2 = startRestartGroup;
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.WelcomeContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.searchandintelligence.ui.WelcomeContentKt.m19174$r8$lambda$zct6dz_m13WVftQpEE7JeOT0Uo(list, modifier3, function1, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        i3 = i4;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HThKXip1ZO5pTVQQqkbujjJjXYE(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WJ2NLyKBfLXpJ3iURkyXi69hIHc(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hLBZH3sXH-UxO7stCauQyiDjIiw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19172$r8$lambda$hLBZH3sXHUxO7stCauQyiDjIiw(boolean z, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setAlpha(z ? 1.0f : 0.0f);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jlOX__03q_cXLbpS9-f76Ut8Vq0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19173$r8$lambda$jlOX__03q_cXLbpS9f76Ut8Vq0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1680013487);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1680013487, updateChangedFlags, -1, "com.paypal.oslo.feature.searchandintelligence.ui.WelcomeContentPreview (WelcomeContent.kt:200)");
            }
            com.paypal.oslo.feature.searchandintelligence.ui.preview.SearchAndIntelligencePreviewKt.SearchAndIntelligencePreview(com.paypal.oslo.feature.searchandintelligence.ui.ComposableSingletons$WelcomeContentKt.INSTANCE.getLambda$348195544$search_and_intelligence_prodRelease(), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.WelcomeContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.WelcomeContentKt.m19173$r8$lambda$jlOX__03q_cXLbpS9f76Ut8Vq0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wjj4UF9uWurt3Hwpt6VSWMmA9A0(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, int i) {
        snapshotStateList.add(java.lang.Integer.valueOf(i));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$z-ct6dz_m13WVftQpEE7JeOT0Uo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19174$r8$lambda$zct6dz_m13WVftQpEE7JeOT0Uo(java.util.List list, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        WelcomeContent(list, modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
