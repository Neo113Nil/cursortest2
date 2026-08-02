package com.paypal.oslo.feature.searchandintelligence.ui.renderer;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0017¢\u0006\u0002\u0010\u0010J7\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u008e\u0002"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/QuickStartPromptRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/api/renderer/UiComponentRenderer;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/QuickStartPrompt;", "<init>", "()V", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "provideAnalyticsConfig", "Lcom/paypal/oslo/feature/searchandintelligence/ui/analytics/quickstartprompt/QuickStartPromptComponentAnalyticsConfig;", "content", "Render", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/QuickStartPrompt;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", com.paypal.oslo.feature.searchandintelligence.domain.model.deserializer.QuickStartPromptDeserializer.COMPONENT_NAME, "quickStartPrompt", "onCardClick", "Lkotlin/Function1;", "", "QuickStartPrompt$search_and_intelligence_prodRelease", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/QuickStartPrompt;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "search-and-intelligence_prodRelease", "enabled", ""}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QuickStartPromptRenderer implements com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> {
    public static final int $stable = 8;
    private final kotlin.reflect.KClass<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> Camera2StreamConfigurationMap = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt.class);

    @javax.inject.Inject
    public QuickStartPromptRenderer() {
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final kotlin.reflect.KClass<? extends com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> getType() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final com.paypal.oslo.feature.searchandintelligence.ui.analytics.quickstartprompt.QuickStartPromptComponentAnalyticsConfig provideAnalyticsConfig(com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        return com.paypal.oslo.feature.searchandintelligence.ui.analytics.quickstartprompt.QuickStartPromptComponentAnalyticsConfig.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.renderer.UiComponentRenderer
    public final void Render(com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt quickStartPrompt, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quickStartPrompt, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        composer.startReplaceGroup(2056511716);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2056511716, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer.Render (QuickStartPromptRenderer.kt:64)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0);
        if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
            empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
        }
        final com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptViewModel quickStartPromptViewModel = (com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, composer, 0, 0);
        boolean changedInstance = composer.changedInstance(quickStartPromptViewModel);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer.$r8$lambda$gcSkEAt0msezrYiOuRV2L2yLkok(com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptViewModel.this, (java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        QuickStartPrompt$search_and_intelligence_prodRelease(quickStartPrompt, modifier, (kotlin.jvm.functions.Function1) rememberedValue, composer, (i & 126) | ((i << 3) & 7168), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void QuickStartPrompt$search_and_intelligence_prodRelease(final com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt quickStartPrompt, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        kotlin.jvm.functions.Function0 function0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quickStartPrompt, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1335606836);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(quickStartPrompt) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function13 = function12;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer.m19209$r8$lambda$nNK73SITeSMqRRmy0KRnhBRIfY((java.lang.String) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function14 = function12;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1335606836, i3, -1, "com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer.QuickStartPrompt (QuickStartPromptRenderer.kt:79)");
                    }
                    boolean z = (i3 & 14) == 4;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(quickStartPrompt.getPrompt() != null), null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                    com.paypal.pds.components.CardStyle.Filled filled = com.paypal.pds.components.CardStyle.Filled.INSTANCE;
                    com.paypal.pds.core.Color.BackgroundMuted backgroundMuted = com.paypal.pds.core.Color.BackgroundMuted.INSTANCE;
                    final java.lang.String prompt = quickStartPrompt.getPrompt();
                    if (prompt != null) {
                        startRestartGroup.startReplaceGroup(486655072);
                        boolean changed = startRestartGroup.changed(mutableState);
                        boolean z2 = (i3 & 896) == 256;
                        boolean changed2 = startRestartGroup.changed(prompt);
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if ((changed2 | changed | z2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer.m19208$r8$lambda$gSsN3zVCo8q69XGQe5jORwGwkg(kotlin.jvm.functions.Function1.this, prompt, mutableState);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceGroup();
                        function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                    } else {
                        startRestartGroup.startReplaceGroup(486655071);
                        startRestartGroup.endReplaceGroup();
                        function0 = null;
                    }
                    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function15 = function14;
                    modifier3 = modifier4;
                    com.paypal.pds.components.CardKt.Card(androidx.compose.ui.platform.TestTagKt.testTag(modifier4, com.paypal.oslo.feature.searchandintelligence.api.SearchAndIntelligenceTestTags.QUICK_START_PROMPT_ITEM_TEST_TAG), backgroundMuted, null, filled, function0, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(657833626, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer.$r8$lambda$J3CCJ8KCv4gdg64ZXSJVk2m7_r4(com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Filled.$stable << 9) | 805306416, 484);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function13 = function15;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer.$r8$lambda$PlJ5je24j7n6kjIwj3pQy3Stxzk(com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer.this, quickStartPrompt, modifier3, function13, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function12 = function1;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$J3CCJ8KCv4gdg64ZXSJVk2m7_r4(com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt quickStartPrompt, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(657833626, i, -1, "com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer.QuickStartPrompt.<anonymous> (QuickStartPromptRenderer.kt:97)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.AvatarKt.Avatar(com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRendererKt.access$resolveAvatarSource(quickStartPrompt, composer, 0), null, com.paypal.pds.components.AvatarSize.Large.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, com.paypal.pds.core.Color.BackgroundBase.INSTANCE), null, null, composer, com.paypal.pds.components.AvatarSize.Large.$stable << 6, 50);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(quickStartPrompt.getLabel(), androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, composer, 0, 6, 1020);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PlJ5je24j7n6kjIwj3pQy3Stxzk(com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptRenderer quickStartPromptRenderer, com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt quickStartPrompt, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        quickStartPromptRenderer.QuickStartPrompt$search_and_intelligence_prodRelease(quickStartPrompt, modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$gSsN3zVCo8q69-XGQe5jORwGwkg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19208$r8$lambda$gSsN3zVCo8q69XGQe5jORwGwkg(kotlin.jvm.functions.Function1 function1, java.lang.String str, androidx.compose.runtime.MutableState mutableState) {
        if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            mutableState.setValue(java.lang.Boolean.FALSE);
            function1.invoke(str);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gcSkEAt0msezrYiOuRV2L2yLkok(com.paypal.oslo.feature.searchandintelligence.ui.renderer.QuickStartPromptViewModel quickStartPromptViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        quickStartPromptViewModel.sendPrompt(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nNK-73SITeSMqRRmy0KRnhBRIfY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19209$r8$lambda$nNK73SITeSMqRRmy0KRnhBRIfY(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }
}
