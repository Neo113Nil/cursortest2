package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a)\u0010\b\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0007\u001a)\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u000e\u001a3\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0017\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u0084\u0002"}, d2 = {"PaymentConfirmationScreen", "", "onNavigateToAccountSummary", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "viewModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/confirmation/viewmodel/PaymentConfirmationViewModel;", "(Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/confirmation/viewmodel/PaymentConfirmationViewModel;Landroidx/compose/runtime/Composer;I)V", "PaymentConfirmationUiEffectHandler", "PaymentConfirmationContent", "state", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/confirmation/viewmodel/PaymentConfirmationState$Ready;", "onEvent", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/confirmation/viewmodel/PaymentConfirmationEvent;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/confirmation/viewmodel/PaymentConfirmationState$Ready;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CardRow", "title", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "modifier", "Landroidx/compose/ui/Modifier;", "subvalue", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "ScheduledPaymentPreview", "(Landroidx/compose/runtime/Composer;I)V", "RealTimePaymentPreview", "ScheduledPaymentWithBackupPreview", "RealTimePaymentWithBackupPreview", "revolvingcredit-servicing_prodRelease", "uiState", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/confirmation/viewmodel/PaymentConfirmationState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentConfirmationScreenKt {
    public static final void PaymentConfirmationScreen(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier, kotlin.Unit> function1, final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel paymentConfirmationViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentConfirmationViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-519798646);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(paymentConfirmationViewModel) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-519798646, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreen (PaymentConfirmationScreen.kt:67)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(paymentConfirmationViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            getHighResolutionOutputSizeshNQ4ISI(function1, paymentConfirmationViewModel, startRestartGroup, i3 & 126);
            if (!(((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState) collectAsStateWithLifecycle.getValue()) instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState.Ready)) {
                startRestartGroup.startReplaceGroup(-1310272562);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1310277885);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState paymentConfirmationState = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState) collectAsStateWithLifecycle.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(paymentConfirmationState, "");
                com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState.Ready) paymentConfirmationState;
                boolean changedInstance = startRestartGroup.changedInstance(paymentConfirmationViewModel);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt.$r8$lambda$6FFP3nIEpqE1eBZ5diDAt9qFCZc(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel.this, (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                PaymentConfirmationContent(ready, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt.$r8$lambda$VSKDLE3PXezbR5TqxVIIGzn_jiI(kotlin.jvm.functions.Function1.this, paymentConfirmationViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier, kotlin.Unit> function1, final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel paymentConfirmationViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1343172713);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(paymentConfirmationViewModel) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1343172713, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationUiEffectHandler (PaymentConfirmationScreen.kt:90)");
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(paymentConfirmationViewModel);
            boolean z = (i2 & 14) == 4;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$PaymentConfirmationUiEffectHandler$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$PaymentConfirmationUiEffectHandler$1$1(paymentConfirmationViewModel, function1, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt.m18421$r8$lambda$Sc3ux8YjMWMUHZj8r3HwV8Rrws(kotlin.jvm.functions.Function1.this, paymentConfirmationViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PaymentConfirmationContent(final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState.Ready ready, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ready, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1088329951);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(ready) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1088329951, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationContent (PaymentConfirmationScreen.kt:106)");
            }
            androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.uimodel.PaymentConfirmationUiModel uiModel = ready.getReadyInfo().getUiModel();
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.Empty.INSTANCE.asString(startRestartGroup, 6), androidx.compose.ui.Modifier.INSTANCE, null, com.paypal.oslo.core.commonui.components.TopBarTitleAlignment.Center, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-476860760, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt.$r8$lambda$Apx5HQPBmBXMSuLppuQi6r5b2J8(kotlin.jvm.functions.Function1.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 1575984, 52);
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), rememberScrollState, false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            com.paypal.pds.components.HeaderKt.Header(uiModel.getTitle().asString(startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), uiModel.getDescription().asString(startRestartGroup, 0), (java.lang.String) null, com.paypal.pds.components.HeaderContentAlignment.Center, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(560780716, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt.$r8$lambda$NnesazzmI9OnwIYD9MXhzdaLmyc(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.uimodel.PaymentConfirmationUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, 221232, 72);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            Camera2StreamConfigurationMap(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_review_amount, startRestartGroup, 0), uiModel.getPaymentAmount().asString(startRestartGroup, 0), null, null, startRestartGroup, 0, 12);
            com.paypal.pds.components.DividerKt.Divider(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BorderBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), startRestartGroup, 0, 0);
            Camera2StreamConfigurationMap(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_from, startRestartGroup, 0), uiModel.getPrimaryPaymentMethod().getPaymentMethodName().asString(startRestartGroup, 0), null, uiModel.getFromSubValue().asString(startRestartGroup, 0), startRestartGroup, 0, 4);
            com.paypal.pds.components.DividerKt.Divider(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BorderBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), startRestartGroup, 0, 0);
            Camera2StreamConfigurationMap(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_date, startRestartGroup, 0), uiModel.getPaymentDate().asString(startRestartGroup, 0), null, null, startRestartGroup, 0, 12);
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_done, startRestartGroup, 0);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            boolean z = (i3 & 112) == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt.$r8$lambda$hdb48QjCdlWZjmUxROyLc0DCoJw(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonStyle.Primary primary2 = primary;
            composer2 = startRestartGroup;
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, fillMaxWidth$default2, null, null, primary2, null, false, false, startRestartGroup, 196992, 472);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt.$r8$lambda$C_qrKwB3hNFbGg7oZRAnIT8brXA(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState.Ready.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final java.lang.String str, final java.lang.String str2, androidx.compose.ui.Modifier modifier, java.lang.String str3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1149458469);
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
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str4 = str3;
                i3 |= startRestartGroup.changed(str4) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.lang.String str5 = i4 != 0 ? null : str4;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1149458469, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.CardRow (PaymentConfirmationScreen.kt:190)");
                    }
                    androidx.compose.foundation.layout.Arrangement.Horizontal spaceBetween = androidx.compose.foundation.layout.Arrangement.Absolute.INSTANCE.getSpaceBetween();
                    androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null);
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(spaceBetween, androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier modifier5 = modifier4;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, i3 & 14, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                    androidx.compose.ui.Alignment.Horizontal end = androidx.compose.ui.Alignment.INSTANCE.getEnd();
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), end, startRestartGroup, 48);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, (i3 >> 3) & 14, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                    if (str5 == null) {
                        startRestartGroup.startReplaceGroup(1535979118);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1535979119);
                        java.lang.String str6 = str5;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str6, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8444getEnde0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1002);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endNode();
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    str4 = str5;
                    modifier3 = modifier5;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final java.lang.String str7 = str4;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt.$r8$lambda$TrdAq6lUquMewir6mk9Lqg1Q8Xc(str, str2, modifier3, str7, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str4 = str3;
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str4 = str3;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6FFP3nIEpqE1eBZ5diDAt9qFCZc(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel paymentConfirmationViewModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent paymentConfirmationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentConfirmationEvent, "");
        paymentConfirmationViewModel.processEvent(paymentConfirmationEvent);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Apx5HQPBmBXMSuLppuQi6r5b2J8(final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-476860760, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationContent.<anonymous>.<anonymous> (PaymentConfirmationScreen.kt:121)");
            }
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt.$r8$lambda$MRJ8UYUZnNHYdCXI1WSUnaQD8I0(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton((kotlin.jvm.functions.Function0) rememberedValue, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$C_qrKwB3hNFbGg7oZRAnIT8brXA(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState.Ready ready, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        PaymentConfirmationContent(ready, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HksFdLUiX5eEgUzJglgMr625rYM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(119104552);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(119104552, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.RealTimePaymentPreview (PaymentConfirmationScreen.kt:264)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState.ReadyInfo(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.uimodel.PaymentConfirmationUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("$150.00"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel("456", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Chase Bank"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Savings ••1234"), null, null, null, null, null, false, null, null, null, null, 8176, null), null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Today"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(com.google.common.net.HttpHeaders.DATE), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.REAL_TIME, com.paypal.pds.core.Icon.CheckmarkCircle.INSTANCE, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_submitted, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_submitted_details, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Checking ••8647")), com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt.$r8$lambda$jlxEPXraKY3vMASMaOQgcRbbOw8((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PaymentConfirmationContent(ready, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt.$r8$lambda$HksFdLUiX5eEgUzJglgMr625rYM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MRJ8UYUZnNHYdCXI1WSUnaQD8I0(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent.OnDoneClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NnesazzmI9OnwIYD9MXhzdaLmyc(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.uimodel.PaymentConfirmationUiModel paymentConfirmationUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(560780716, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationContent.<anonymous>.<anonymous>.<anonymous> (PaymentConfirmationScreen.kt:139)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(paymentConfirmationUiModel.getIcon()), null, com.paypal.pds.components.AvatarSize.Large.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBasePositive.INSTANCE), null, null, composer, com.paypal.pds.components.AvatarSize.Large.$stable << 6, 50);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Sc3ux8YjMWMUHZj8r3HwV8Rrw-s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18421$r8$lambda$Sc3ux8YjMWMUHZj8r3HwV8Rrws(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel paymentConfirmationViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(function1, paymentConfirmationViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TrdAq6lUquMewir6mk9Lqg1Q8Xc(java.lang.String str, java.lang.String str2, androidx.compose.ui.Modifier modifier, java.lang.String str3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(str, str2, modifier, str3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$U6jQbieoU8oWaxwZEKUJgwZplJI(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent paymentConfirmationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentConfirmationEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VSKDLE3PXezbR5TqxVIIGzn_jiI(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel paymentConfirmationViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        PaymentConfirmationScreen(function1, paymentConfirmationViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZH84jQERn_7T-QtN578QptP-i94, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18422$r8$lambda$ZH84jQERn_7TQtN578QptPi94(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1494855456);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1494855456, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.RealTimePaymentWithBackupPreview (PaymentConfirmationScreen.kt:344)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState.ReadyInfo(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.uimodel.PaymentConfirmationUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("$99.99"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel("222", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("PayPal Balance"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("PayPal Balance"), null, null, null, null, null, false, null, null, null, null, 8176, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel("333", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Bank of the USSR"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Debit ••9999"), null, null, null, null, null, false, null, null, null, null, 8176, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Today"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(com.google.common.net.HttpHeaders.DATE), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.REAL_TIME, com.paypal.pds.core.Icon.CheckmarkCircle.INSTANCE, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_submitted, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_submitted_details, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_backup_payment_method, new java.lang.Object[]{"Checking ••8647"}, null, false, 12, null)), com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt.m18423$r8$lambda$o0gX7yZHdP_E8mxYZzMXoJm5WA((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PaymentConfirmationContent(ready, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt.m18422$r8$lambda$ZH84jQERn_7TQtN578QptPi94(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hdb48QjCdlWZjmUxROyLc0DCoJw(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent.OnDoneClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jlxEPXraKY3vMASMaOQgcRbbOw8(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent paymentConfirmationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentConfirmationEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$o0gX7-yZHdP_E8mxYZzMXoJm5WA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18423$r8$lambda$o0gX7yZHdP_E8mxYZzMXoJm5WA(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent paymentConfirmationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentConfirmationEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rOJ_qNzd5FijaPmjAayNA39pPQ4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-635486938);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-635486938, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.ScheduledPaymentWithBackupPreview (PaymentConfirmationScreen.kt:299)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState.ReadyInfo(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.uimodel.PaymentConfirmationUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("$250.50"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel("789", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("PayPal Balance"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("PayPal Balance"), null, null, null, null, null, false, null, null, null, null, 8176, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel("111", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Starling Bank"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Debit ••9999"), null, null, null, null, null, false, null, null, null, null, 8176, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Dec 1, 2025"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(com.google.common.net.HttpHeaders.DATE), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.SCHEDULED, com.paypal.pds.core.Icon.Calendar.INSTANCE, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_confirmation_payment_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_scheduled_details, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_backup_payment_method, new java.lang.Object[]{"Checking ••8646"}, null, false, 12, null)), com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt.$r8$lambda$yWKd1j3e5XKFZYd7mtcZFamn1Lo((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PaymentConfirmationContent(ready, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt.$r8$lambda$rOJ_qNzd5FijaPmjAayNA39pPQ4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$umnDUa6-N7nbR1eXoa65wyDrPcs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18424$r8$lambda$umnDUa6N7nbR1eXoa65wyDrPcs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1613651538);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1613651538, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.ScheduledPaymentPreview (PaymentConfirmationScreen.kt:227)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState.ReadyInfo(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.uimodel.PaymentConfirmationUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("$66.18"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel("123", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Bank of America"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Checking ••8644"), null, null, null, null, null, false, null, null, null, null, 8176, null), null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Nov 15, 2025"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString(com.google.common.net.HttpHeaders.DATE), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.SCHEDULED, com.paypal.pds.core.Icon.Calendar.INSTANCE, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_confirmation_payment_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_scheduled_details, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Checking ••8645")), com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt.$r8$lambda$U6jQbieoU8oWaxwZEKUJgwZplJI((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PaymentConfirmationContent(ready, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt.m18424$r8$lambda$umnDUa6N7nbR1eXoa65wyDrPcs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yWKd1j3e5XKFZYd7mtcZFamn1Lo(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent paymentConfirmationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentConfirmationEvent, "");
        return kotlin.Unit.INSTANCE;
    }
}
