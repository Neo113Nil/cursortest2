package com.paypal.oslo.feature.onboarding.signup.ui.pagelayout;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"PageLayout", "", "pageConfig", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;", "stepCallbacks", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/StepCallbacks;", "signupUiData", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData;", "callbackMap", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbackMap;", "modifier", "Landroidx/compose/ui/Modifier;", "componentStates", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;", "topBarConfig", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;", "isLoading", "", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/StepCallbacks;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbackMap;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;ZLandroidx/compose/runtime/Composer;II)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PageLayoutKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x03e4 A[LOOP:1: B:101:0x03de->B:103:0x03e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0353 A[LOOP:0: B:96:0x034d->B:98:0x0353, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PageLayout(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig, final com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks, final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData signupFormData, final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap componentCallbackMap, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap, com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        int i4;
        final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap2;
        final boolean z2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap3;
        com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig3;
        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap4;
        com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig4;
        int i5;
        boolean z3;
        androidx.compose.ui.Modifier modifier4;
        java.lang.Object obj;
        int i6;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupFormData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentCallbackMap, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-682294619);
        int i8 = (i & 6) == 0 ? (startRestartGroup.changedInstance(pageConfig) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i8 |= startRestartGroup.changed(stepCallbacks) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= (i & 512) == 0 ? startRestartGroup.changed(signupFormData) : startRestartGroup.changedInstance(signupFormData) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= (i & 4096) == 0 ? startRestartGroup.changed(componentCallbackMap) : startRestartGroup.changedInstance(componentCallbackMap) ? 2048 : 1024;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i8 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i8 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    if ((262144 & i) == 0 ? startRestartGroup.changed(componentStateMap) : startRestartGroup.changedInstance(componentStateMap)) {
                        i7 = 131072;
                        i8 |= i7;
                    }
                }
                i7 = 65536;
                i8 |= i7;
            }
            i3 = i2 & 64;
            if (i3 == 0) {
                i8 |= 1572864;
            } else if ((1572864 & i) == 0) {
                i8 |= startRestartGroup.changedInstance(topBarConfig) ? 1048576 : 524288;
                i4 = i2 & 128;
                if (i4 != 0) {
                    i8 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i8 |= startRestartGroup.changed(z) ? 8388608 : 4194304;
                }
                if (startRestartGroup.shouldExecute((i8 & 4793491) != 4793490, i8 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i9 != 0) {
                            modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                        }
                        if ((i2 & 32) != 0) {
                            componentStateMap3 = com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiStateKt.emptyComponentStateMap();
                            i8 &= -458753;
                        } else {
                            componentStateMap3 = componentStateMap;
                        }
                        topBarConfig3 = i3 != 0 ? null : topBarConfig;
                        if (i4 != 0) {
                            componentStateMap4 = componentStateMap3;
                            topBarConfig4 = topBarConfig3;
                            i5 = i8;
                            z3 = false;
                            androidx.compose.ui.Modifier modifier5 = modifier2;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-682294619, i5, -1, "com.paypal.oslo.feature.onboarding.signup.ui.pagelayout.PageLayout (PageLayout.kt:76)");
                            }
                            com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rememberRootLevelComponentRegistry = com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistryKt.rememberRootLevelComponentRegistry(startRestartGroup, 0);
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier5);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
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
                            androidx.compose.ui.Modifier imePadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null))));
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, imePadding);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor2);
                            } else {
                                startRestartGroup.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
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
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            if (topBarConfig4 != null) {
                                startRestartGroup.startReplaceGroup(-779338876);
                                startRestartGroup.endReplaceGroup();
                                modifier4 = modifier5;
                                obj = null;
                                i6 = 1;
                            } else {
                                startRestartGroup.startReplaceGroup(-779338875);
                                modifier4 = modifier5;
                                obj = null;
                                i6 = 1;
                                com.paypal.oslo.feature.onboarding.signup.ui.component.SignupTopBarComponentKt.SignupTopBarComponent(topBarConfig4, null, stepCallbacks.getOnNavigateBack(), startRestartGroup, 0, 2);
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                startRestartGroup.endReplaceGroup();
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            }
                            startRestartGroup.startReplaceGroup(806151962);
                            for (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig componentConfig : pageConfig.getComponents()) {
                                startRestartGroup.startMovableGroup(-1394386491, componentConfig.getComponentId());
                                androidx.compose.runtime.Composer composer2 = startRestartGroup;
                                com.paypal.oslo.feature.onboarding.signup.ui.factory.StepComponentKt.StepComponent(componentConfig, androidx.compose.ui.Modifier.INSTANCE, signupFormData, componentCallbackMap, componentStateMap4, rememberRootLevelComponentRegistry, startRestartGroup, (i5 & 7168) | (i5 & 896) | 48 | ((i5 >> 3) & 57344), 0);
                                composer2.endMovableGroup();
                                startRestartGroup = composer2;
                                i5 = i5;
                            }
                            startRestartGroup.endReplaceGroup();
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                            startRestartGroup.endNode();
                            com.paypal.oslo.feature.onboarding.signup.ui.component.SignupBottomNavigationComponentKt.SignupBottomNavigationComponent(pageConfig.getBottomNavigationConfig(), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), i6, obj), stepCallbacks.getOnNavigateNext(), startRestartGroup, 0, 0);
                            startRestartGroup.endNode();
                            startRestartGroup.startReplaceGroup(-71278594);
                            for (java.util.Map.Entry<java.lang.String, com.paypal.pds.components.DropdownState> entry : rememberRootLevelComponentRegistry.getDropdownStates().entrySet()) {
                                java.lang.String key = entry.getKey();
                                com.paypal.pds.components.DropdownState value = entry.getValue();
                                startRestartGroup.startMovableGroup(186490329, key);
                                com.paypal.pds.components.DropdownKt.DropdownBottomSheet(value, startRestartGroup, com.paypal.pds.components.DropdownState.$stable);
                                startRestartGroup.endMovableGroup();
                            }
                            startRestartGroup.endReplaceGroup();
                            if (!z3) {
                                startRestartGroup.startReplaceGroup(2085668877);
                                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i6, obj), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundOverlayCard.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
                                com.paypal.pds.core.PDSIndication.None none = com.paypal.pds.core.PDSIndication.None.INSTANCE;
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.pagelayout.PageLayoutKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit3;
                                            unit3 = kotlin.Unit.INSTANCE;
                                            return unit3;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(background, null, none, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 1573248, 29);
                                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                                int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m22100clickable_mRqjOc);
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
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(2086078263);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            componentStateMap2 = componentStateMap4;
                            topBarConfig2 = topBarConfig4;
                            z2 = z3;
                            modifier3 = modifier4;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 32) != 0) {
                            i8 &= -458753;
                        }
                        componentStateMap3 = componentStateMap;
                        topBarConfig3 = topBarConfig;
                    }
                    z3 = z;
                    componentStateMap4 = componentStateMap3;
                    topBarConfig4 = topBarConfig3;
                    i5 = i8;
                    androidx.compose.ui.Modifier modifier52 = modifier2;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry rememberRootLevelComponentRegistry2 = com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistryKt.rememberRootLevelComponentRegistry(startRestartGroup, 0);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode5 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier52);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, maybeCachedBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl5, java.lang.Integer.valueOf(hashCode5), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier imePadding2 = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null))));
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode22 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier22 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, imePadding2);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl22 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl22, java.lang.Integer.valueOf(hashCode22), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, materializeModifier22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.ui.Modifier verticalScroll$default2 = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy22 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode32 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier32 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default2);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor32 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl32 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl32, columnMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl32, currentCompositionLocalMap32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl32, java.lang.Integer.valueOf(hashCode32), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl32, materializeModifier32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    if (topBarConfig4 != null) {
                    }
                    startRestartGroup.startReplaceGroup(806151962);
                    while (r16.hasNext()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                    startRestartGroup.endNode();
                    com.paypal.oslo.feature.onboarding.signup.ui.component.SignupBottomNavigationComponentKt.SignupBottomNavigationComponent(pageConfig.getBottomNavigationConfig(), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), i6, obj), stepCallbacks.getOnNavigateNext(), startRestartGroup, 0, 0);
                    startRestartGroup.endNode();
                    startRestartGroup.startReplaceGroup(-71278594);
                    while (r3.hasNext()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    if (!z3) {
                    }
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    componentStateMap2 = componentStateMap4;
                    topBarConfig2 = topBarConfig4;
                    z2 = z3;
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    componentStateMap2 = componentStateMap;
                    z2 = z;
                    modifier3 = modifier2;
                    topBarConfig2 = topBarConfig;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.pagelayout.PageLayoutKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.onboarding.signup.ui.pagelayout.PageLayoutKt.m16501$r8$lambda$zDbnIJFdOOjx1HyjbkSUnr9xg4(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig.this, stepCallbacks, signupFormData, componentCallbackMap, modifier3, componentStateMap2, topBarConfig2, z2, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
            }
            if (startRestartGroup.shouldExecute((i8 & 4793491) != 4793490, i8 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((196608 & i) == 0) {
        }
        i3 = i2 & 64;
        if (i3 == 0) {
        }
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        if (startRestartGroup.shouldExecute((i8 & 4793491) != 4793490, i8 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$zDbnI-JFdOOjx1HyjbkSUnr9xg4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16501$r8$lambda$zDbnIJFdOOjx1HyjbkSUnr9xg4(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig, com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks, com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData signupFormData, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap componentCallbackMap, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap, com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PageLayout(pageConfig, stepCallbacks, signupFormData, componentCallbackMap, modifier, componentStateMap, topBarConfig, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
