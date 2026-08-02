package com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001am\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\nH\u0001\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"DocUploadStepScreenContent", "", "stepComponentConfig", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/docupload/domain/DocUploadStepComponentConfig;", "onStepForward", "Lkotlin/Function0;", "onDocumentUpload", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadCollectedItem;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "modifier", "Landroidx/compose/ui/Modifier;", "topBarConfig", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;", "onBack", "attacher", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/di/DocUploadViewComponentAttacher;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/docupload/domain/DocUploadStepComponentConfig;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/di/DocUploadViewComponentAttacher;Landroidx/compose/runtime/Composer;II)V", "getDocUploadSubtitleStringRes", "", "DocUploadStepScreenContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DocUploadStepScreenContentKt {
    /* JADX WARN: Removed duplicated region for block: B:137:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DocUploadStepScreenContent(final com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.domain.DocUploadStepComponentConfig docUploadStepComponentConfig, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCollectedItem, kotlin.Unit> function1, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, kotlin.jvm.functions.Function0<kotlin.Unit> function02, com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher docUploadViewComponentAttacher, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig2;
        int i3;
        int i4;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher docUploadViewComponentAttacher2;
        final com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        int i6;
        com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig5;
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher docUploadViewComponentAttacher3;
        androidx.compose.runtime.Composer composer3;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docUploadStepComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(333324384);
        int i8 = (i & 6) == 0 ? (startRestartGroup.changedInstance(docUploadStepComponentConfig) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i8 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= startRestartGroup.changedInstance(intentId) ? 2048 : 1024;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i8 |= 24576;
        } else if ((i & 24576) == 0) {
            i8 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    topBarConfig2 = topBarConfig;
                    if (startRestartGroup.changedInstance(topBarConfig2)) {
                        i7 = 131072;
                        i8 |= i7;
                    }
                } else {
                    topBarConfig2 = topBarConfig;
                }
                i7 = 65536;
                i8 |= i7;
            } else {
                topBarConfig2 = topBarConfig;
            }
            i3 = i2 & 64;
            if (i3 == 0) {
                i8 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i8 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 == 0) {
                i5 = (i & 12582912) == 0 ? (i & 16777216) == 0 ? startRestartGroup.changed(docUploadViewComponentAttacher) : startRestartGroup.changedInstance(docUploadViewComponentAttacher) ? 8388608 : 4194304 : 12582912;
                if (startRestartGroup.shouldExecute((i8 & 4793491) != 4793490, i8 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 32) != 0) {
                            i8 &= -458753;
                        }
                        companion = modifier;
                        function05 = function02;
                        docUploadViewComponentAttacher3 = docUploadViewComponentAttacher;
                        i6 = i8;
                        topBarConfig5 = topBarConfig2;
                    } else {
                        companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                        if ((i2 & 32) != 0) {
                            topBarConfig4 = new com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig(com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor.BACK, null, null, 6, null);
                            i8 &= -458753;
                        } else {
                            topBarConfig4 = topBarConfig2;
                        }
                        if (i3 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenContentKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                        } else {
                            function04 = function02;
                        }
                        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher stepDocUploadViewComponentAttacher = i4 != 0 ? com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher.INSTANCE : docUploadViewComponentAttacher;
                        function05 = function04;
                        i6 = i8;
                        topBarConfig5 = topBarConfig4;
                        docUploadViewComponentAttacher3 = stepDocUploadViewComponentAttacher;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(333324384, i6, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenContent (DocUploadStepScreenContent.kt:115)");
                    }
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new androidx.compose.ui.focus.FocusRequester();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.ui.focus.FocusRequester focusRequester = (androidx.compose.ui.focus.FocusRequester) rememberedValue2;
                    startRestartGroup.startReplaceGroup(-1797788721);
                    java.util.List<com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig> viewComponents = docUploadStepComponentConfig.getViewComponents();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(viewComponents, 10));
                    java.util.Iterator<T> it = viewComponents.iterator();
                    while (it.hasNext()) {
                        startRestartGroup.startMovableGroup(-797449301, ((com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig) it.next()).mo16702getIdfHLlpbY());
                        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState rememberState = docUploadViewComponentAttacher3.rememberState(startRestartGroup, (i6 >> 21) & 14);
                        startRestartGroup.endMovableGroup();
                        arrayList.add(rememberState);
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    startRestartGroup.endReplaceGroup();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenContentKt$DocUploadStepScreenContent$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenContentKt$DocUploadStepScreenContent$2$1(focusRequester, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                    boolean changed = startRestartGroup.changed(intentId);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = com.paypal.oslo.feature.oneonboarding.analytics.OnboardingAnalyticsKt.toAnalyticsContexts(intentId);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    java.util.List list = (java.util.List) rememberedValue4;
                    java.util.ArrayList arrayList3 = arrayList2;
                    androidx.compose.ui.Modifier modifier3 = companion;
                    androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null)), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
                    int i10 = i6;
                    com.paypal.oslo.feature.oneonboarding.ui.common.OnboardingTopBarKt.OnboardingTopBar(topBarConfig5, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, list), function05, null, startRestartGroup, ((i6 >> 15) & 14) | ((i6 >> 12) & 896), 8);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing20(), 0.0f, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_doc_upload_title, startRestartGroup, 0);
                    com.paypal.pds.core.Typography.HeadingMedium headingMedium = com.paypal.pds.core.Typography.HeadingMedium.INSTANCE;
                    com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                    androidx.compose.ui.Modifier focusable$default = androidx.compose.foundation.FocusableKt.focusable$default(androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.ui.Modifier.INSTANCE, focusRequester), false, null, 3, null);
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenContentKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenContentKt.$r8$lambda$LxK5LhXPIjxX79yieeqwBMriu6M((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(focusable$default, false, (kotlin.jvm.functions.Function1) rememberedValue5, 1, null), contentBase, null, null, null, false, 0, 0, null, headingMedium, startRestartGroup, 384, 6, 1016);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(getDocUploadSubtitleStringRes(intentId), startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    startRestartGroup.startReplaceGroup(-1592057586);
                    int i11 = 0;
                    for (java.lang.Object obj : docUploadStepComponentConfig.getViewComponents()) {
                        if (i11 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig docUploadViewComponentConfig = (com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig) obj;
                        startRestartGroup.startMovableGroup(953176564, docUploadViewComponentConfig.mo16702getIdfHLlpbY());
                        java.util.ArrayList arrayList4 = arrayList3;
                        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher docUploadViewComponentAttacher4 = docUploadViewComponentAttacher3;
                        int i12 = i11;
                        androidx.compose.runtime.Composer composer4 = startRestartGroup;
                        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher.ComposeDefaultImpls.Attach$default(docUploadViewComponentConfig, function1, intentId, null, (com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState) arrayList4.get(i11), docUploadViewComponentAttacher4, startRestartGroup, ((i10 >> 3) & 1008) | ((i10 >> 6) & 458752), 8);
                        composer4.endMovableGroup();
                        if (i12 < kotlin.collections.CollectionsKt.getLastIndex(docUploadStepComponentConfig.getViewComponents())) {
                            composer3 = composer4;
                            composer3.startReplaceGroup(-515922641);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer3, 0);
                            composer3.endReplaceGroup();
                        } else {
                            composer3 = composer4;
                            composer3.startReplaceGroup(-515840956);
                            composer3.endReplaceGroup();
                        }
                        i11 = i12 + 1;
                        docUploadViewComponentAttacher3 = docUploadViewComponentAttacher4;
                        startRestartGroup = composer3;
                        arrayList3 = arrayList4;
                    }
                    com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher docUploadViewComponentAttacher5 = docUploadViewComponentAttacher3;
                    composer2 = startRestartGroup;
                    final java.util.ArrayList arrayList5 = arrayList3;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_doc_upload_primary_button, composer2, 0);
                    com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                    com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing20(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing32(), 5, null);
                    boolean changedInstance = composer2.changedInstance(arrayList5);
                    boolean z = (i10 & 112) == 32;
                    java.lang.Object rememberedValue6 = composer2.rememberedValue();
                    if ((changedInstance | z) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenContentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenContentKt.$r8$lambda$ko8ADsGLQ7ONTwEzj_YkNxU0v30(arrayList5, function0);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue6);
                    }
                    com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue6, stringResource2, m1710paddingqDBjuR0$default, null, null, primary, large, false, false, composer2, 1769472, 408);
                    composer2.endNode();
                    int i13 = 0;
                    for (java.lang.Object obj2 : docUploadStepComponentConfig.getViewComponents()) {
                        if (i13 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        composer2.startMovableGroup(-970450154, "overlay_".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig) obj2).mo16702getIdfHLlpbY())));
                        docUploadViewComponentAttacher5.AttachBottomSheet((com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState) arrayList5.get(i13), composer2, (i10 >> 18) & 112);
                        composer2.endMovableGroup();
                        i13++;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    docUploadViewComponentAttacher2 = docUploadViewComponentAttacher5;
                    topBarConfig3 = topBarConfig5;
                    function03 = function05;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier2 = modifier;
                    docUploadViewComponentAttacher2 = docUploadViewComponentAttacher;
                    topBarConfig3 = topBarConfig2;
                    function03 = function02;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenContentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenContentKt.$r8$lambda$q_qfQOGLXOLNkLm5WB9OoxtlzRs(com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.domain.DocUploadStepComponentConfig.this, function0, function1, intentId, modifier2, topBarConfig3, function03, docUploadViewComponentAttacher2, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i8 |= i5;
            if (startRestartGroup.shouldExecute((i8 & 4793491) != 4793490, i8 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((196608 & i) != 0) {
        }
        i3 = i2 & 64;
        if (i3 == 0) {
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        i8 |= i5;
        if (startRestartGroup.shouldExecute((i8 & 4793491) != 4793490, i8 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final int getDocUploadSubtitleStringRes(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        if ((intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto) || (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.CryptoPro)) {
            return com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_doc_upload_crypto_subtitle;
        }
        return com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_doc_upload_subtitle;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LxK5LhXPIjxX79yieeqwBMriu6M(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dVch5Os0kE3Y0qXsBdi4lQb5EEw(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCollectedItem docUploadCollectedItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docUploadCollectedItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iJinH7nT9W1nbOzSM7goEU1OoUo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1007144140);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1007144140, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenContentPreview (DocUploadStepScreenContent.kt:245)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.domain.DocUploadStepComponentConfig docUploadStepComponentConfig = new com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.domain.DocUploadStepComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("preview-docupload-step"), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("preview-docupload-component"), com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCategory.PROOF_OF_SSN, kotlin.collections.CollectionsKt.emptyList(), (kotlin.jvm.internal.DefaultConstructorMarker) null)), (kotlin.jvm.internal.DefaultConstructorMarker) null);
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto crypto = new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto(null, 1, null);
            com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig = new com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig(com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor.BACK, null, null, 6, null);
            com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentContentAttacher docUploadViewComponentContentAttacher = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentContentAttacher();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenContentKt$$ExternalSyntheticLambda4
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenContentKt.$r8$lambda$dVch5Os0kE3Y0qXsBdi4lQb5EEw((com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCollectedItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto crypto2 = crypto;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenContentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            DocUploadStepScreenContent(docUploadStepComponentConfig, function0, function1, crypto2, null, topBarConfig, (kotlin.jvm.functions.Function0) rememberedValue3, docUploadViewComponentContentAttacher, startRestartGroup, 1573296, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenContentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.ui.DocUploadStepScreenContentKt.$r8$lambda$iJinH7nT9W1nbOzSM7goEU1OoUo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ko8ADsGLQ7ONTwEzj_YkNxU0v30(java.util.List list, kotlin.jvm.functions.Function0 function0) {
        java.util.List filterNotNull = kotlin.collections.CollectionsKt.filterNotNull(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(filterNotNull, 10));
        java.util.Iterator it = filterNotNull.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Boolean.valueOf(((com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState) it.next()).validate()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            java.util.Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (!((java.lang.Boolean) it2.next()).booleanValue()) {
                    break;
                }
            }
        }
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$q_qfQOGLXOLNkLm5WB9OoxtlzRs(com.paypal.oslo.feature.oneonboarding.inventory.steps.docupload.domain.DocUploadStepComponentConfig docUploadStepComponentConfig, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher docUploadViewComponentAttacher, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DocUploadStepScreenContent(docUploadStepComponentConfig, function0, function1, intentId, modifier, topBarConfig, function02, docUploadViewComponentAttacher, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
