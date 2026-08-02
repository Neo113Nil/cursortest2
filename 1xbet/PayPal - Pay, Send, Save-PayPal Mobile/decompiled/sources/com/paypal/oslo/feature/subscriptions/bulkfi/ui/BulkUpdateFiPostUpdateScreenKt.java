package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a;\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0014\u001a\u001f\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00012\b\b\u0001\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010\u001c¨\u0006\u001d²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u0010X\u008a\u0084\u0002"}, d2 = {"BulkUpdateFiPostUpdateScreen", "", "viewModel", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateViewModel;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "agreementType", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "navigateToHub", "result", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/result/AgreementUpdatedNavResult;", "BulkUpdateFiPostUpdateScreenContent", "resultWithAgreements", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiResultWithAgreements;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent;", "(Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiResultWithAgreements;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SectionHeader", "text", "", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BulkUpdateFiPostUpdateScreenPreview", "params", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdatePreviewData;", "(Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdatePreviewData;Landroidx/compose/runtime/Composer;I)V", "subscriptions_prodRelease", "updateResult"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BulkUpdateFiPostUpdateScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BulkUpdateFiPostUpdateScreen(final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel bulkUpdateFiPostUpdateViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiPostUpdateViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1672698176);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(bulkUpdateFiPostUpdateViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(agreementType) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1672698176, i4, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreen (BulkUpdateFiPostUpdateScreen.kt:82)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(bulkUpdateFiPostUpdateViewModel.getUpdateResult(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(bulkUpdateFiPostUpdateViewModel);
                boolean z = (i4 & 112) == 32;
                boolean changedInstance2 = startRestartGroup.changedInstance(agreementType);
                com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1(bulkUpdateFiPostUpdateViewModel, appNavigator, agreementType, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                boolean changedInstance3 = startRestartGroup.changedInstance(bulkUpdateFiPostUpdateViewModel);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.$r8$lambda$0UeJbkeyBkfi3Jxotn8gBSMFiRQ(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 1);
                java.lang.String updateFiRequestId = bulkUpdateFiPostUpdateViewModel.getUpdateFiRequestId();
                boolean changedInstance4 = startRestartGroup.changedInstance(bulkUpdateFiPostUpdateViewModel);
                com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$3$1(bulkUpdateFiPostUpdateViewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue3;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m19764invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m19764invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(updateFiRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 3072);
                com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements bulkUpdateFiResultWithAgreements = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements) collectAsStateWithLifecycle.getValue();
                if (bulkUpdateFiResultWithAgreements == null) {
                    startRestartGroup.startReplaceGroup(-1138738343);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1138738342);
                    boolean changedInstance5 = startRestartGroup.changedInstance(bulkUpdateFiPostUpdateViewModel);
                    com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$4$1$1 rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changedInstance5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$4$1$1(bulkUpdateFiPostUpdateViewModel);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    BulkUpdateFiPostUpdateScreenContent(bulkUpdateFiResultWithAgreements, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue5), agreementType, modifier4, startRestartGroup, i4 & 8064, 0);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.$r8$lambda$vwm5m4WEEwNmldpYgh6Cnk2PWGI(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel.this, appNavigator, agreementType, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BulkUpdateFiPostUpdateScreenContent(final com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements bulkUpdateFiResultWithAgreements, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent, kotlin.Unit> function1, final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiResultWithAgreements, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1477258811);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(bulkUpdateFiResultWithAgreements) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(agreementType) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1477258811, i4, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenContent (BulkUpdateFiPostUpdateScreen.kt:168)");
                }
                android.content.res.Resources resources = (android.content.res.Resources) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources());
                boolean changed = startRestartGroup.changed(bulkUpdateFiResultWithAgreements);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiResultMapperKt.toUiModel(bulkUpdateFiResultWithAgreements, resources);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiModel bulkUpdateFiPostUpdateUiModel = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiModel) rememberedValue;
                modifier3 = modifier4;
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
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
                if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                    i5 = com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_link_subscriptions_nav_title;
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    i5 = com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_linked_businesses_hub_title;
                }
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(i5, startRestartGroup, 0), null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(627764811, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.$r8$lambda$F5KmH3P8BY9bQ0Y0TZGJWgpRTyw(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiModel.this, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), null, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 94);
                com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiHeaderComponentKt.BulkUpdateFiHeaderComponent(bulkUpdateFiPostUpdateUiModel.getTitle(), bulkUpdateFiPostUpdateUiModel.getSubTitle(), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0, 0);
                androidx.compose.foundation.lazy.LazyListState rememberLazyListState = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4 = androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24());
                androidx.compose.ui.Alignment.Horizontal start = androidx.compose.ui.Alignment.INSTANCE.getStart();
                boolean changed2 = startRestartGroup.changed(bulkUpdateFiPostUpdateUiModel);
                int i7 = i4 & 112;
                boolean z = i7 == 32;
                boolean changedInstance = startRestartGroup.changedInstance(agreementType);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changed2 | z | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.$r8$lambda$iki4snfLrC0exkzbVrPn1Q3TdWg(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiModel.this, function1, agreementType, (androidx.compose.foundation.lazy.LazyListScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(weight$default, rememberLazyListState, m1699PaddingValues0680j_4, false, m1602spacedBy0680j_4, start, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 456);
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                java.lang.String bottomButtonText = bulkUpdateFiPostUpdateUiModel.getBottomButtonText();
                com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                boolean z2 = i7 == 32;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.$r8$lambda$3iHveiGtge_H0BQJR8v0oplmUGU(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, bottomButtonText, fillMaxWidth$default, null, null, primary, large, false, false, startRestartGroup, 1769856, 408);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.$r8$lambda$WuUO41mSeWOLmuf5r95NsQgpAVw(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements.this, function1, agreementType, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Camera2StreamConfigurationMap(final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2044234609);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
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
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2044234609, i3, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.SectionHeader (BulkUpdateFiPostUpdateScreen.kt:293)");
                }
                int i5 = (i3 & 14) | 384 | (i3 & 112);
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, modifier3, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, i5, 6, 1016);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.$r8$lambda$gw6nb5cZQbWwF52nx3NcDii6bs4(str, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$0UeJbkeyBkfi3Jxotn8gBSMFiRQ(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel bulkUpdateFiPostUpdateViewModel) {
        bulkUpdateFiPostUpdateViewModel.onEvent(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnSystemBackPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3iHveiGtge_H0BQJR8v0oplmUGU(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnDoneClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AfxevJKCPwdsKEERAj5iLgCnY1M(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiModel bulkUpdateFiPostUpdateUiModel, final kotlin.jvm.functions.Function1 function1, final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-631637214, i, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BulkUpdateFiPostUpdateScreen.kt:255)");
            }
            java.util.List<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateAgreement> successfulUpdates = bulkUpdateFiPostUpdateUiModel.getSuccessfulUpdates();
            boolean changed = composer.changed(function1);
            boolean changedInstance = composer.changedInstance(agreementType);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.m19762$r8$lambda$QeiR9hws8xehYxY2MUUp2LGvs(kotlin.jvm.functions.Function1.this, agreementType, (java.util.List) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateAgreementListSectionKt.BulkUpdateFiPostUpdateAgreementListSection(successfulUpdates, false, (kotlin.jvm.functions.Function1) rememberedValue, null, composer, 48, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Dd5s74QttEApzY38gjxLIgydoFo(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        function1.invoke(new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnChangeClick(list, com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.toRawValue(agreementType)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F5KmH3P8BY9bQ0Y0TZGJWgpRTyw(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiModel bulkUpdateFiPostUpdateUiModel, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(627764811, i, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenContent.<anonymous>.<anonymous> (BulkUpdateFiPostUpdateScreen.kt:189)");
            }
            if (bulkUpdateFiPostUpdateUiModel.getAllFailed()) {
                composer.startReplaceGroup(1453928001);
                boolean changed = composer.changed(function1);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.$r8$lambda$P_W4_NUANbEm1IO9OPaiFsytTBg(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton((kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 2);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1454146148);
                boolean changed2 = composer.changed(function1);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.m19763$r8$lambda$x6ZtPjaXlGSmwk24tbK1hUbyug(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton((kotlin.jvm.functions.Function0) rememberedValue2, null, null, composer, 0, 6);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$P_W4_NUANbEm1IO9OPaiFsytTBg(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnBackClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Qe-iR9hws8xehYxY2MUUp2LGv-s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19762$r8$lambda$QeiR9hws8xehYxY2MUUp2LGvs(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        function1.invoke(new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnChangeClick(list, com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.toRawValue(agreementType)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Qejq_DK96U9oLhSjxL9qCBE9yUg(final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewData bulkUpdateFiPostUpdatePreviewData, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1795772107);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(bulkUpdateFiPostUpdatePreviewData) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1795772107, i3, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenPreview (BulkUpdateFiPostUpdateScreen.kt:306)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(bulkUpdateFiPostUpdatePreviewData.getName(), null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 0, 0, 2046);
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements resultWithAgreements = bulkUpdateFiPostUpdatePreviewData.getResultWithAgreements();
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.$r8$lambda$XpCcSjcg_6jPtupo2a1hpg8R7Mo((com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            BulkUpdateFiPostUpdateScreenContent(resultWithAgreements, (kotlin.jvm.functions.Function1) rememberedValue, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE, null, composer2, 48, 8);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.$r8$lambda$Qejq_DK96U9oLhSjxL9qCBE9yUg(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdatePreviewData.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WuUO41mSeWOLmuf5r95NsQgpAVw(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiResultWithAgreements bulkUpdateFiResultWithAgreements, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BulkUpdateFiPostUpdateScreenContent(bulkUpdateFiResultWithAgreements, function1, agreementType, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XpCcSjcg_6jPtupo2a1hpg8R7Mo(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent bulkUpdateFiPostUpdateUiEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiPostUpdateUiEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dI63Wg0hGq3pgXoHIUzDAzO3zSI(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiModel bulkUpdateFiPostUpdateUiModel, final kotlin.jvm.functions.Function1 function1, final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-277803742, i, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BulkUpdateFiPostUpdateScreen.kt:227)");
            }
            java.util.List<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateAgreement> failedUpdates = bulkUpdateFiPostUpdateUiModel.getFailedUpdates();
            boolean changed = composer.changed(function1);
            boolean changedInstance = composer.changedInstance(agreementType);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.$r8$lambda$Dd5s74QttEApzY38gjxLIgydoFo(kotlin.jvm.functions.Function1.this, agreementType, (java.util.List) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateAgreementListSectionKt.BulkUpdateFiPostUpdateAgreementListSection(failedUpdates, true, (kotlin.jvm.functions.Function1) rememberedValue, null, composer, 48, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gw6nb5cZQbWwF52nx3NcDii6bs4(java.lang.String str, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iki4snfLrC0exkzbVrPn1Q3TdWg(final com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiModel bulkUpdateFiPostUpdateUiModel, final kotlin.jvm.functions.Function1 function1, final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        if (bulkUpdateFiPostUpdateUiModel.getHasFailures()) {
            androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, "needs_attention_header", null, com.paypal.oslo.feature.subscriptions.bulkfi.ui.ComposableSingletons$BulkUpdateFiPostUpdateScreenKt.INSTANCE.m19771getLambda$799372821$subscriptions_prodRelease(), 2, null);
            androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, "needs_attention_container", null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-277803742, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.$r8$lambda$dI63Wg0hGq3pgXoHIUzDAzO3zSI(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiModel.this, function1, agreementType, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }), 2, null);
        }
        if (bulkUpdateFiPostUpdateUiModel.getHasSuccesses()) {
            if (!bulkUpdateFiPostUpdateUiModel.getAllSuccess()) {
                androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, "success_header", null, com.paypal.oslo.feature.subscriptions.bulkfi.ui.ComposableSingletons$BulkUpdateFiPostUpdateScreenKt.INSTANCE.getLambda$1844190653$subscriptions_prodRelease(), 2, null);
            }
            androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, "successfully_updated_container", null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-631637214, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.$r8$lambda$AfxevJKCPwdsKEERAj5iLgCnY1M(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiModel.this, function1, agreementType, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }), 2, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kta2d0yOlnzZWCUOCcVxEe3ugGs(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult agreementUpdatedNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        com.paypal.oslo.feature.subscriptions.shared.navigation.HubBackStackNavigatorKt.popToHubDestination(navigationScope, appNavigator, agreementType, agreementUpdatedNavResult);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vwm5m4WEEwNmldpYgh6Cnk2PWGI(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel bulkUpdateFiPostUpdateViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BulkUpdateFiPostUpdateScreen(bulkUpdateFiPostUpdateViewModel, appNavigator, agreementType, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$x6ZtPj-aXlGSmwk24tbK1hUbyug, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19763$r8$lambda$x6ZtPjaXlGSmwk24tbK1hUbyug(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnCloseClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
